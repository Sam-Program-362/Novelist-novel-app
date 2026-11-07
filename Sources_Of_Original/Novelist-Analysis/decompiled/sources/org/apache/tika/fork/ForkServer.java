package org.apache.tika.fork;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.NotSerializableException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import org.apache.tika.exception.TikaException;

/* JADX INFO: loaded from: classes.dex */
class ForkServer implements Runnable {
    public static final byte CALL = 1;
    public static final byte DONE = 0;
    public static final byte ERROR = -1;
    public static final byte FAILED_TO_START = 5;
    public static final byte INIT_LOADER_PARSER = 7;
    public static final byte INIT_PARSER_FACTORY_FACTORY = 6;
    public static final byte INIT_PARSER_FACTORY_FACTORY_LOADER = 8;
    public static final byte PING = 2;
    public static final byte READY = 4;
    public static final byte RESOURCE = 3;
    private ClassLoader classLoader;
    private final DataInputStream input;
    private final DataOutputStream output;
    private Object parser;
    private boolean parsing;
    private long serverParserTimeoutMillis;
    private long serverPulseMillis;
    private long serverWaitTimeoutMillis;
    private final Object[] lock = new Object[0];
    private final boolean active = true;
    private long since = System.currentTimeMillis();

    public ForkServer(InputStream inputStream, OutputStream outputStream, long j3, long j4, long j5) {
        this.serverPulseMillis = 5000L;
        this.serverParserTimeoutMillis = 60000L;
        this.serverWaitTimeoutMillis = 60000L;
        this.parsing = false;
        this.input = new DataInputStream(inputStream);
        this.output = new DataOutputStream(outputStream);
        this.serverPulseMillis = j3;
        this.serverParserTimeoutMillis = j4;
        this.serverWaitTimeoutMillis = j5;
        this.parsing = false;
    }

    private void call(ClassLoader classLoader, Object obj) {
        synchronized (this.lock) {
            this.parsing = true;
            this.since = System.currentTimeMillis();
        }
        try {
            Method method = getMethod(obj, this.input.readUTF());
            int length = method.getParameterTypes().length;
            Object[] objArr = new Object[length];
            for (int i3 = 0; i3 < length; i3++) {
                objArr[i3] = readObject(classLoader);
            }
            try {
                method.invoke(obj, objArr);
                this.output.write(0);
            } catch (InvocationTargetException e3) {
                this.output.write(-1);
                Throwable cause = e3.getCause();
                try {
                    ForkObjectInputStream.sendObject(cause, this.output);
                } catch (NotSerializableException unused) {
                    TikaException tikaException = new TikaException(cause.getMessage());
                    tikaException.setStackTrace(cause.getStackTrace());
                    ForkObjectInputStream.sendObject(tikaException, this.output);
                }
            }
            synchronized (this.lock) {
                this.parsing = false;
                this.since = System.currentTimeMillis();
            }
        } catch (Throwable th) {
            synchronized (this.lock) {
                this.parsing = false;
                this.since = System.currentTimeMillis();
                throw th;
            }
        }
    }

    private Method getMethod(Object obj, String str) {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            for (Class<?> cls : superclass.getInterfaces()) {
                for (Method method : cls.getMethods()) {
                    if (str.equals(method.getName())) {
                        return method;
                    }
                }
            }
        }
        return null;
    }

    private void initializeParserAndLoader() throws TikaException, IOException {
        this.output.writeByte(4);
        this.output.flush();
        int i3 = this.input.read();
        if (i3 == -1) {
            throw new TikaException("eof! pipe closed?!");
        }
        Object object = readObject(ForkServer.class.getClassLoader());
        if (i3 != 6) {
            if (i3 != 7) {
                if (i3 == 8) {
                    if (!(object instanceof ParserFactoryFactory)) {
                        throw new IllegalStateException("Expecing ParserFactoryFactory followed by a class loader");
                    }
                    this.parser = ((ParserFactoryFactory) object).build().build();
                    this.classLoader = (ClassLoader) readObject(ForkServer.class.getClassLoader());
                    Thread.currentThread().setContextClassLoader(this.classLoader);
                }
            } else {
                if (!(object instanceof ClassLoader)) {
                    throw new IllegalArgumentException("Expecting ClassLoader followed by a Parser");
                }
                this.classLoader = (ClassLoader) object;
                Thread.currentThread().setContextClassLoader(this.classLoader);
                this.parser = readObject(this.classLoader);
            }
        } else {
            if (!(object instanceof ParserFactoryFactory)) {
                throw new IllegalArgumentException("Expecting only one object of class ParserFactoryFactory");
            }
            this.classLoader = ForkServer.class.getClassLoader();
            this.parser = ((ParserFactoryFactory) object).build().build();
        }
        this.output.writeByte(4);
        this.output.flush();
    }

    public static void main(String[] strArr) {
        long j3 = Long.parseLong(strArr[0]);
        long j4 = Long.parseLong(strArr[1]);
        long j5 = Long.parseLong(strArr[2]);
        URL.setURLStreamHandlerFactory(new MemoryURLStreamHandlerFactory());
        ForkServer forkServer = new ForkServer(System.in, System.out, j3, j4, j5);
        System.setIn(new ByteArrayInputStream(new byte[0]));
        System.setOut(System.err);
        Thread thread = new Thread(forkServer, "Tika Watchdog");
        thread.setDaemon(true);
        thread.start();
        forkServer.processRequests();
    }

    private Object readObject(ClassLoader classLoader) throws IOException {
        Object object = ForkObjectInputStream.readObject(this.input, classLoader);
        if (object instanceof ForkProxy) {
            ((ForkProxy) object).init(this.input, this.output);
        }
        this.output.writeByte(0);
        this.output.flush();
        return object;
    }

    public void processRequests() {
        try {
            initializeParserAndLoader();
            while (true) {
                try {
                    int i3 = this.input.read();
                    if (i3 == -1) {
                        break;
                    }
                    if (i3 == 2) {
                        this.output.writeByte(2);
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("Unexpected request");
                        }
                        call(this.classLoader, this.parser);
                    }
                    this.output.flush();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            System.err.flush();
        } catch (Throwable th2) {
            th2.printStackTrace();
            System.err.flush();
            try {
                this.output.writeByte(5);
                this.output.flush();
            } catch (IOException e3) {
                e3.printStackTrace();
                System.err.flush();
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                synchronized (this.lock) {
                    try {
                        long jCurrentTimeMillis = System.currentTimeMillis() - this.since;
                        boolean z3 = this.parsing;
                        if (!z3 || jCurrentTimeMillis <= this.serverParserTimeoutMillis) {
                            if (!z3) {
                                long j3 = this.serverWaitTimeoutMillis;
                                if (j3 > 0 && jCurrentTimeMillis > j3) {
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Thread.sleep(this.serverPulseMillis);
            } catch (InterruptedException unused) {
                return;
            }
        }
        System.exit(0);
    }
}

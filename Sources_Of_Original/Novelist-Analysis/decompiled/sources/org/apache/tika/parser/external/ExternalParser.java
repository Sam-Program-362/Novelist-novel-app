package org.apache.tika.parser.external;

import F2.b;
import F2.d;
import M1.RunnableC0053b;
import M1.b0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.exception.TikaException;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.sax.XHTMLContentHandler;
import org.apache.tika.utils.StringUtils;
import org.xml.sax.ContentHandler;
import s2.c;

/* JADX INFO: loaded from: classes.dex */
public class ExternalParser implements Parser {
    public static final String INPUT_FILE_TOKEN = "${INPUT}";
    private static final b LOG = d.b(ExternalParser.class);
    public static final String OUTPUT_FILE_TOKEN = "${OUTPUT}";
    private static final long serialVersionUID = -1079128990650687037L;
    private final long timeoutMs = 60000;
    private Set<MediaType> supportedTypes = Collections.EMPTY_SET;
    private Map<Pattern, String> metadataPatterns = null;
    private String[] command = {"cat"};
    private LineConsumer ignoredLineConsumer = LineConsumer.NULL;

    public interface LineConsumer extends Serializable {
        public static final LineConsumer NULL = new a();

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$static$e2402a94$1(String str) {
        }

        void consume(String str);
    }

    public static boolean check(String str, int... iArr) {
        return check(new String[]{str}, iArr);
    }

    private void extractMetadata(InputStream inputStream, Metadata metadata) {
        Thread thread = new Thread(new b0(this, inputStream, metadata, 2));
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException unused) {
        }
    }

    private void extractOutput(InputStream inputStream, XHTMLContentHandler xHTMLContentHandler) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        try {
            xHTMLContentHandler.startDocument();
            xHTMLContentHandler.startElement("p");
            char[] cArr = new char[1024];
            while (true) {
                int i3 = inputStreamReader.read(cArr);
                if (i3 == -1) {
                    xHTMLContentHandler.endElement("p");
                    xHTMLContentHandler.endDocument();
                    inputStreamReader.close();
                    return;
                }
                xHTMLContentHandler.characters(cArr, 0, i3);
            }
        } catch (Throwable th) {
            try {
                inputStreamReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static void ignoreStream(InputStream inputStream) {
        ignoreStream(inputStream, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$extractMetadata$2(InputStream inputStream, Metadata metadata) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                boolean z3 = false;
                for (Map.Entry<Pattern, String> entry : this.metadataPatterns.entrySet()) {
                    Matcher matcher = entry.getKey().matcher(line);
                    if (matcher.find()) {
                        if (entry.getValue() == null || entry.getValue().equals(StringUtils.EMPTY)) {
                            metadata.add(matcher.group(1), matcher.group(2));
                        } else {
                            metadata.add(entry.getValue(), matcher.group(1));
                        }
                        z3 = true;
                    }
                }
                if (!z3) {
                    this.ignoredLineConsumer.consume(line);
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                c.a(bufferedReader);
                c.a(inputStream);
                throw th;
            }
        }
        c.a(bufferedReader);
        c.a(inputStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$ignoreStream$0(InputStream inputStream) {
        try {
            c.b(inputStream, x2.a.f4718k);
        } catch (IOException unused) {
        } finally {
            c.a(inputStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendInput$1(Process process, InputStream inputStream) {
        try {
            c.b(inputStream, process.getOutputStream());
        } catch (IOException unused) {
        }
    }

    private void sendInput(Process process, InputStream inputStream) {
        Thread thread = new Thread(new M.c(process, inputStream, 17));
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException unused) {
        }
    }

    public String[] getCommand() {
        return this.command;
    }

    public LineConsumer getIgnoredLineConsumer() {
        return this.ignoredLineConsumer;
    }

    public Map<Pattern, String> getMetadataExtractionPatterns() {
        return this.metadataPatterns;
    }

    @Override // org.apache.tika.parser.Parser
    public Set<MediaType> getSupportedTypes(ParseContext parseContext) {
        return getSupportedTypes();
    }

    @Override // org.apache.tika.parser.Parser
    public void parse(InputStream inputStream, ContentHandler contentHandler, Metadata metadata, ParseContext parseContext) throws TikaException {
        XHTMLContentHandler xHTMLContentHandler = new XHTMLContentHandler(contentHandler, metadata);
        TemporaryResources temporaryResources = new TemporaryResources();
        try {
            parse(TikaInputStream.get(inputStream, temporaryResources, metadata), xHTMLContentHandler, metadata, temporaryResources);
        } finally {
            temporaryResources.dispose();
        }
    }

    public void setCommand(String... strArr) {
        this.command = strArr;
    }

    public void setIgnoredLineConsumer(LineConsumer lineConsumer) {
        this.ignoredLineConsumer = lineConsumer;
    }

    public void setMetadataExtractionPatterns(Map<Pattern, String> map) {
        this.metadataPatterns = map;
    }

    public void setSupportedTypes(Set<MediaType> set) {
        this.supportedTypes = Collections.unmodifiableSet(new HashSet(set));
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a1  */
    public static boolean check(String[] strArr, int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{127};
        }
        try {
            try {
                try {
                    Process processExec = Runtime.getRuntime().exec(strArr);
                    Thread threadIgnoreStream = ignoreStream(processExec.getErrorStream(), false);
                    Thread threadIgnoreStream2 = ignoreStream(processExec.getInputStream(), false);
                    threadIgnoreStream.join();
                    threadIgnoreStream2.join();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    if (!processExec.waitFor(60000L, TimeUnit.MILLISECONDS)) {
                        throw new TimeoutException();
                    }
                    int iExitValue = processExec.exitValue();
                    LOG.w(strArr[0], Integer.valueOf(iExitValue), "exit value for {}: {}");
                    for (int i3 : iArr) {
                        if (iExitValue == i3) {
                            processExec.destroyForcibly();
                            return false;
                        }
                    }
                    processExec.destroyForcibly();
                    return true;
                } catch (SecurityException e3) {
                    throw e3;
                } catch (TimeoutException e4) {
                    e = e4;
                    LOG.i("exception trying to run  " + strArr[0], e);
                    if (0 != 0) {
                        ((Process) null).destroyForcibly();
                    }
                    return false;
                }
            } catch (IOException e5) {
                e = e5;
                LOG.i("exception trying to run  " + strArr[0], e);
                if (0 != 0) {
                    ((Process) null).destroyForcibly();
                }
                return false;
            } catch (Error e6) {
                if (e6.getMessage() == null || !(e6.getMessage().contains("posix_spawn") || e6.getMessage().contains("UNIXProcess"))) {
                    throw e6;
                }
                LOG.i("(TIKA-1526): exception trying to run: " + strArr[0], e6);
                if (0 != 0) {
                    ((Process) null).destroyForcibly();
                }
                return false;
            } catch (InterruptedException e7) {
                e = e7;
                LOG.i("exception trying to run  " + strArr[0], e);
                if (0 != 0) {
                    ((Process) null).destroyForcibly();
                }
                return false;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                ((Process) null).destroyForcibly();
            }
            throw th;
        }
    }

    private static Thread ignoreStream(InputStream inputStream, boolean z3) {
        Thread thread = new Thread(new RunnableC0053b(inputStream, 10));
        thread.start();
        if (z3) {
            try {
                thread.join();
            } catch (InterruptedException unused) {
            }
        }
        return thread;
    }

    public Set<MediaType> getSupportedTypes() {
        return this.supportedTypes;
    }

    private void parse(TikaInputStream tikaInputStream, XHTMLContentHandler xHTMLContentHandler, Metadata metadata, TemporaryResources temporaryResources) throws IOException {
        String[] strArrSplit;
        Process processExec;
        Map<Pattern, String> map = this.metadataPatterns;
        boolean z3 = (map == null || map.isEmpty()) ? false : true;
        String[] strArr = this.command;
        if (strArr.length == 1) {
            strArrSplit = strArr[0].split(StringUtils.SPACE);
        } else {
            String[] strArr2 = new String[strArr.length];
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            strArrSplit = strArr2;
        }
        Process process = null;
        boolean z4 = true;
        boolean z5 = true;
        File fileCreateTemporaryFile = null;
        for (int i3 = 0; i3 < strArrSplit.length; i3++) {
            if (strArrSplit[i3].contains(INPUT_FILE_TOKEN)) {
                strArrSplit[i3] = strArrSplit[i3].replace(INPUT_FILE_TOKEN, tikaInputStream.getFile().getPath());
                z4 = false;
            }
            if (strArrSplit[i3].contains(OUTPUT_FILE_TOKEN)) {
                fileCreateTemporaryFile = temporaryResources.createTemporaryFile();
                strArrSplit[i3] = strArrSplit[i3].replace(OUTPUT_FILE_TOKEN, fileCreateTemporaryFile.getPath());
                z5 = false;
            }
        }
        try {
            if (strArrSplit.length == 1) {
                processExec = Runtime.getRuntime().exec(strArrSplit[0]);
            } else {
                processExec = Runtime.getRuntime().exec(strArrSplit);
            }
            process = processExec;
        } catch (Exception e3) {
            LOG.f("problem with process exec", e3);
        }
        try {
            if (z4) {
                sendInput(process, tikaInputStream);
            } else {
                process.getOutputStream().close();
            }
            InputStream inputStream = process.getInputStream();
            InputStream errorStream = process.getErrorStream();
            if (z3) {
                extractMetadata(errorStream, metadata);
                if (z5) {
                    extractOutput(inputStream, xHTMLContentHandler);
                } else {
                    extractMetadata(inputStream, metadata);
                }
            } else {
                ignoreStream(errorStream);
                if (z5) {
                    extractOutput(inputStream, xHTMLContentHandler);
                } else {
                    ignoreStream(inputStream);
                }
            }
            try {
                process.waitFor();
            } catch (InterruptedException unused) {
            }
            if (z5) {
                return;
            }
            FileInputStream fileInputStream = new FileInputStream(fileCreateTemporaryFile);
            try {
                extractOutput(fileInputStream, xHTMLContentHandler);
                fileInputStream.close();
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                process.waitFor();
            } catch (InterruptedException unused2) {
            }
            throw th3;
        }
    }
}

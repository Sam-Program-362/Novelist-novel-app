package F2;

import H2.e;
import H2.f;
import H2.g;
import H2.h;
import X.j;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile int f347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final H2.c f348b = new H2.c(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final H2.c f349c = new H2.c(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile H2.c f351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f352f;

    static {
        String property;
        try {
            property = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            property = null;
        }
        f350d = property == null ? false : property.equalsIgnoreCase("true");
        f352f = new String[]{"2.0"};
    }

    public static ArrayList a() {
        ArrayList arrayList = new ArrayList();
        final ClassLoader classLoader = d.class.getClassLoader();
        String property = System.getProperty("slf4j.provider");
        H2.c cVar = null;
        if (property != null && !property.isEmpty()) {
            try {
                String str = "Attempting to load provider \"" + property + "\" specified via \"slf4j.provider\" system property";
                int i3 = H2.d.f447a;
                if (j.a(2) >= j.a(H2.d.f448b)) {
                    H2.d.b().println("SLF4J(I): " + str);
                }
                cVar = (H2.c) classLoader.loadClass(property).getConstructor(null).newInstance(null);
            } catch (ClassCastException e3) {
                H2.d.a("Specified SLF4JServiceProvider (" + property + ") does not implement SLF4JServiceProvider interface", e3);
            } catch (ClassNotFoundException e4) {
                e = e4;
                H2.d.a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (IllegalAccessException e5) {
                e = e5;
                H2.d.a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InstantiationException e6) {
                e = e6;
                H2.d.a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (NoSuchMethodException e7) {
                e = e7;
                H2.d.a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InvocationTargetException e8) {
                e = e8;
                H2.d.a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            }
        }
        if (cVar != null) {
            arrayList.add(cVar);
            return arrayList;
        }
        Iterator it2 = (System.getSecurityManager() == null ? ServiceLoader.load(H2.c.class, classLoader) : (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: F2.c
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return ServiceLoader.load(H2.c.class, classLoader);
            }
        })).iterator();
        while (it2.hasNext()) {
            try {
                arrayList.add((H2.c) it2.next());
            } catch (ServiceConfigurationError e9) {
                String str2 = "A service provider failed to instantiate:\n" + e9.getMessage();
                H2.d.b().println("SLF4J(E): " + str2);
            }
        }
        return arrayList;
    }

    public static b b(Class cls) {
        int i3;
        b bVarC = c(cls.getName());
        if (f350d) {
            g gVar = h.f458a;
            Class cls2 = null;
            if (gVar == null) {
                if (h.f459b) {
                    gVar = null;
                } else {
                    try {
                        gVar = new g();
                    } catch (SecurityException unused) {
                        gVar = null;
                    }
                    h.f458a = gVar;
                    h.f459b = true;
                }
            }
            if (gVar != null) {
                Class[] classContext = gVar.getClassContext();
                String name = h.class.getName();
                int i4 = 0;
                while (i4 < classContext.length && !name.equals(classContext[i4].getName())) {
                    i4++;
                }
                if (i4 >= classContext.length || (i3 = i4 + 2) >= classContext.length) {
                    throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
                }
                cls2 = classContext[i3];
            }
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                H2.d.c("Detected logger name mismatch. Given name: \"" + bVarC.getName() + "\"; computed name: \"" + cls2.getName() + "\".");
                H2.d.c("See https://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
            }
        }
        return bVarC;
    }

    public static b c(String str) {
        H2.c cVar;
        a aVar;
        if (f347a == 0) {
            synchronized (d.class) {
                try {
                    if (f347a == 0) {
                        f347a = 1;
                        d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int i3 = f347a;
        if (i3 == 1) {
            cVar = f348b;
        } else {
            if (i3 == 2) {
                throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
            }
            if (i3 == 3) {
                cVar = f351e;
            } else {
                if (i3 != 4) {
                    throw new IllegalStateException("Unreachable code");
                }
                cVar = f349c;
            }
        }
        switch (cVar.f445a) {
            case 0:
                aVar = (B1.b) cVar.f446b;
                break;
            default:
                aVar = (f) cVar.f446b;
                break;
        }
        return aVar.a(str);
    }

    public static final void d() {
        try {
            ArrayList arrayListA = a();
            h(arrayListA);
            if (arrayListA.isEmpty()) {
                f347a = 4;
                H2.d.c("No SLF4J providers were found.");
                H2.d.c("Defaulting to no-operation (NOP) logger implementation");
                H2.d.c("See https://www.slf4j.org/codes.html#noProviders for further details.");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    ClassLoader classLoader = d.class.getClassLoader();
                    Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
                    while (systemResources.hasMoreElements()) {
                        linkedHashSet.add(systemResources.nextElement());
                    }
                } catch (IOException e3) {
                    H2.d.a("Error getting resources from path", e3);
                }
                g(linkedHashSet);
            } else {
                f351e = (H2.c) arrayListA.get(0);
                f351e.getClass();
                f351e.getClass();
                f347a = 3;
                f(arrayListA);
            }
            e();
            if (f347a == 3) {
                try {
                    switch (f351e.f445a) {
                        case 0:
                            boolean z3 = false;
                            for (String str : f352f) {
                                if ("2.0.99".startsWith(str)) {
                                    z3 = true;
                                }
                            }
                            if (z3) {
                                return;
                            }
                            H2.d.c("The requested version 2.0.99 by your slf4j provider is not compatible with " + Arrays.asList(f352f).toString());
                            H2.d.c("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
                            return;
                        default:
                            throw new UnsupportedOperationException();
                    }
                } catch (Throwable th) {
                    H2.d.a("Unexpected problem occurred during version sanity check", th);
                }
            }
        } catch (Exception e4) {
            f347a = 2;
            H2.d.a("Failed to instantiate SLF4J LoggerFactory", e4);
            throw new IllegalStateException("Unexpected initialization failure", e4);
        }
    }

    public static void e() {
        H2.c cVar = f348b;
        synchronized (cVar) {
            try {
                ((f) cVar.f446b).f455k = true;
                f fVar = (f) cVar.f446b;
                fVar.getClass();
                ArrayList arrayList = new ArrayList(fVar.f456l.values());
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    e eVar = (e) obj;
                    eVar.f450l = c(eVar.f449k);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = ((f) f348b.f446b).f457m;
        int size2 = linkedBlockingQueue.size();
        ArrayList arrayList2 = new ArrayList(128);
        int i4 = 0;
        while (linkedBlockingQueue.drainTo(arrayList2, 128) != 0) {
            int size3 = arrayList2.size();
            int i5 = 0;
            while (i5 < size3) {
                Object obj2 = arrayList2.get(i5);
                i5++;
                G2.b bVar = (G2.b) obj2;
                if (bVar != null) {
                    e eVar2 = bVar.f404b;
                    String str = eVar2.f449k;
                    if (eVar2.f450l == null) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!(eVar2.f450l instanceof H2.b)) {
                        if (!eVar2.B()) {
                            H2.d.c(str);
                        } else if (eVar2.p(bVar.f403a) && eVar2.B()) {
                            try {
                                eVar2.n.invoke(eVar2.f450l, bVar);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i6 = i4 + 1;
                if (i4 == 0) {
                    if (bVar.f404b.B()) {
                        H2.d.c("A number (" + size2 + ") of logging calls during the initialization phase have been intercepted and are");
                        H2.d.c("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        H2.d.c("See also https://www.slf4j.org/codes.html#replay");
                    } else if (!(bVar.f404b.f450l instanceof H2.b)) {
                        H2.d.c("The following set of substitute loggers may have been accessed");
                        H2.d.c("during the initialization phase. Logging calls during this");
                        H2.d.c("phase were not honored. However, subsequent logging calls to these");
                        H2.d.c("loggers will work as normally expected.");
                        H2.d.c("See also https://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i4 = i6;
            }
            arrayList2.clear();
        }
        f fVar2 = (f) f348b.f446b;
        fVar2.f456l.clear();
        fVar2.f457m.clear();
    }

    public static void f(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No providers were found which is impossible after successful initialization.");
        }
        if (arrayList.size() > 1) {
            String str = "Actual provider is of type [" + arrayList.get(0) + "]";
            int i3 = H2.d.f447a;
            if (j.a(2) >= j.a(H2.d.f448b)) {
                H2.d.b().println("SLF4J(I): " + str);
                return;
            }
            return;
        }
        String str2 = "Connected with provider of type [" + ((H2.c) arrayList.get(0)).getClass().getName() + "]";
        int i4 = H2.d.f447a;
        if (j.a(1) >= j.a(H2.d.f448b)) {
            H2.d.b().println("SLF4J(D): " + str2);
        }
    }

    public static void g(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.isEmpty()) {
            return;
        }
        H2.d.c("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            H2.d.c("Ignoring binding found at [" + ((URL) it2.next()) + "]");
        }
        H2.d.c("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    public static void h(ArrayList arrayList) {
        if (arrayList.size() > 1) {
            H2.d.c("Class path contains multiple SLF4J providers.");
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                H2.d.c("Found provider [" + ((H2.c) obj) + "]");
            }
            H2.d.c("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}

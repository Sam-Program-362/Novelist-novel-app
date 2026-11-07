package H2;

import X.j;
import java.io.PrintStream;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int f447a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f448b;

    static {
        int i3;
        String[] strArr = {"System.out", "stdout", "sysout"};
        String property = System.getProperty("slf4j.internal.report.stream");
        int i4 = 2;
        if (property != null && !property.isEmpty()) {
            for (int i5 = 0; i5 < 3; i5++) {
                if (strArr[i5].equalsIgnoreCase(property)) {
                    i3 = 2;
                    break;
                }
            }
        }
        i3 = 1;
        f447a = i3;
        String property2 = System.getProperty("slf4j.internal.verbosity");
        if (property2 != null && !property2.isEmpty()) {
            if (property2.equalsIgnoreCase("DEBUG")) {
                i4 = 1;
            } else if (property2.equalsIgnoreCase("ERROR")) {
                i4 = 4;
            } else if (property2.equalsIgnoreCase("WARN")) {
                i4 = 3;
            }
        }
        f448b = i4;
    }

    public static final void a(String str, Throwable th) {
        b().println("SLF4J(E): " + str);
        b().println("SLF4J(E): Reported exception:");
        th.printStackTrace(b());
    }

    public static PrintStream b() {
        return j.a(f447a) != 1 ? System.err : System.out;
    }

    public static final void c(String str) {
        if (j.a(3) >= j.a(f448b)) {
            b().println("SLF4J(W): " + str);
        }
    }
}

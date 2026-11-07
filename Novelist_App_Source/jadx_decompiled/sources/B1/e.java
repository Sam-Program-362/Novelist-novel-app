package B1;

import M1.C0052a;
import M1.C0059h;
import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import b0.I;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import org.apache.tika.fork.ContentHandlerProxy;
import org.apache.tika.pipes.PipesServer;
import org.apache.tika.utils.XMLReaderUtils;
import t.AbstractC0468a;

/* loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static final void a(int i3, View view, ViewGroup viewGroup) {
        a2.h.e(view, "view");
        a2.h.e(viewGroup, "container");
        int a3 = X.j.a(i3);
        if (a3 == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (I.J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup2);
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (a3 == 1) {
            if (I.J(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (I.J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + viewGroup);
                }
                viewGroup.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (a3 == 2) {
            if (I.J(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (a3 != 3) {
            return;
        }
        if (I.J(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    public static int b(String str) {
        String str2;
        for (int i3 : X.j.b(2)) {
            if (i3 == 1) {
                str2 = "Brightness.light";
            } else {
                if (i3 != 2) {
                    throw null;
                }
                str2 = "Brightness.dark";
            }
            if (str2.equals(str)) {
                return i3;
            }
        }
        throw new NoSuchFieldException(AbstractC0468a.a("No such Brightness: ", str));
    }

    public static int c(String str) {
        for (int i3 : X.j.b(8)) {
            String str2 = null;
            switch (i3) {
                case 1:
                    break;
                case 2:
                    str2 = "HapticFeedbackType.lightImpact";
                    break;
                case 3:
                    str2 = "HapticFeedbackType.mediumImpact";
                    break;
                case 4:
                    str2 = "HapticFeedbackType.heavyImpact";
                    break;
                case 5:
                    str2 = "HapticFeedbackType.selectionClick";
                    break;
                case 6:
                    str2 = "HapticFeedbackType.successNotification";
                    break;
                case 7:
                    str2 = "HapticFeedbackType.warningNotification";
                    break;
                case 8:
                    str2 = "HapticFeedbackType.errorNotification";
                    break;
                default:
                    throw null;
            }
            if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                return i3;
            }
        }
        throw new NoSuchFieldException(AbstractC0468a.a("No such HapticFeedbackType: ", str));
    }

    public static int d(String str) {
        String str2;
        for (int i3 : X.j.b(3)) {
            if (i3 == 1) {
                str2 = "SystemSoundType.click";
            } else if (i3 == 2) {
                str2 = "SystemSoundType.tick";
            } else {
                if (i3 != 3) {
                    throw null;
                }
                str2 = "SystemSoundType.alert";
            }
            if (str2.equals(str)) {
                return i3;
            }
        }
        throw new NoSuchFieldException(AbstractC0468a.a("No such SoundType: ", str));
    }

    public static /* synthetic */ int e(int i3) {
        switch (i3) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 8;
            case 5:
                return 16;
            case 6:
                return 32;
            case 7:
                return 64;
            case 8:
                return 128;
            case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                return 256;
            case 10:
                return 512;
            case 11:
                return 1024;
            case 12:
                return 2048;
            case 13:
                return 4096;
            case 14:
                return 8192;
            case 15:
                return 16384;
            case 16:
                return 32768;
            case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                return 65536;
            case 18:
                return 131072;
            case 19:
                return 262144;
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                return 524288;
            case 21:
                return 1048576;
            case 22:
                return 2097152;
            case 23:
                return 4194304;
            case 24:
                return 8388608;
            case 25:
                return 16777216;
            case 26:
                return 33554432;
            case 27:
                return 67108864;
            case 28:
                return 134217728;
            case 29:
                return 268435456;
            case 30:
                return 536870912;
            case 31:
                return 1073741824;
            case 32:
                return Integer.MIN_VALUE;
            default:
                throw null;
        }
    }

    public static /* synthetic */ String f(int i3) {
        switch (i3) {
            case 1:
                return "account_selection_token";
            case 2:
                return "account_selection_state";
            case 3:
                return "allow_multiple";
            case 4:
                return "mimetypes";
            case 5:
                return "file_ids";
            case 6:
                return "trigger_onepick";
            case 7:
                return "allow_folder_selection";
            case 8:
                return "stid";
            case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                return "stids";
            case 10:
                return "stc";
            case 11:
                return "itk";
            default:
                throw null;
        }
    }

    public static String g(String str, int i3) {
        return str + i3;
    }

    public static String h(String str, int i3, String str2) {
        return str + i3 + str2;
    }

    public static String i(String str, int i3, String str2, int i4) {
        return str + i3 + str2 + i4;
    }

    public static String j(String str, String str2) {
        return str + str2;
    }

    public static String k(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String l(String str, Throwable th, String str2, String str3) {
        return str + th + str2 + str3;
    }

    public static String m(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static void n(C0052a c0052a, String str, Object obj) {
        C0059h.l(str, obj, O1.d.a(H2.h.i(c0052a)));
    }

    public static /* synthetic */ void o(AutoCloseable autoCloseable) {
        boolean isTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) autoCloseable).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z3 = false;
        while (!isTerminated) {
            try {
                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z3) {
                    executorService.shutdownNow();
                    z3 = true;
                }
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ void p(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void q(String str, int i3) {
        if (i3 == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = a2.h.class.getName();
            int i4 = 0;
            while (!stackTrace[i4].getClassName().equals(name)) {
                i4++;
            }
            while (stackTrace[i4].getClassName().equals(name)) {
                i4++;
            }
            StackTraceElement stackTraceElement = stackTrace[i4];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            a2.h.f(nullPointerException, a2.h.class.getName());
            throw nullPointerException;
        }
    }

    public static void r(String str, String str2, String str3) {
        H2.h.i(new C0052a(str, str2, str3));
    }

    public static void s(String str, String str2, String str3, String str4, Object obj) {
        C0059h.l(str4, obj, O1.d.a(H2.h.i(new C0052a(str, str2, str3))));
    }
}

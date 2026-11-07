package M1;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebSettings;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import it.returntrue.novelist.R;
import java.util.Objects;
import org.apache.tika.fork.ContentHandlerProxy;
import org.apache.tika.utils.StringUtils;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public final class A implements p029j0.d, p028j.o, C1.m {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static A f1002l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static A f1003m;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1004k;

    public /* synthetic */ A(int i3) {
        this.f1004k = i3;
    }

    public static I.f a(String str, String str2) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1567968963) {
                if (iHashCode != -154594663) {
                    if (iHashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                        return new I.j(str2);
                    }
                } else if (str.equals("GET_INTERRUPTED")) {
                    return new I.g(str2);
                }
            } else if (str.equals("GET_CANCELED_TAG")) {
                return new I.d(str2);
            }
        }
        return new I.e(str2);
    }

    public static void h(ResultReceiver resultReceiver, String str, String str2) {
        a2.h.e(resultReceiver, "<this>");
        a2.h.e(str2, "errMsg");
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", true);
        bundle.putString("EXCEPTION_TYPE", str);
        bundle.putString("EXCEPTION_MESSAGE", str2);
        resultReceiver.send(Integer.MAX_VALUE, bundle);
    }

    public static void i(ResultReceiver resultReceiver, int i3, int i4, Intent intent) {
        a2.h.e(resultReceiver, "<this>");
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", false);
        bundle.putInt("ACTIVITY_REQUEST_CODE", i3);
        bundle.putParcelable("RESULT_DATA", intent);
        resultReceiver.send(i4, bundle);
    }

    public static void l(WebSettings webSettings, boolean z3) {
        B1.g gVar;
        if (!p053s0.j.f4475b.b()) {
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
        int i3 = 20;
        try {
            gVar = new B1.g((WebSettingsBoundaryInterface) E2.a.d(WebSettingsBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) p053s0.k.f4476a.f80l).convertSettings(webSettings)), i3);
        } catch (ClassCastException e3) {
            if (Build.VERSION.SDK_INT != 30 || !"android.webkit.WebSettingsWrapper".equals(webSettings.getClass().getCanonicalName())) {
                throw e3;
            }
            Log.e("WebSettingsCompat", "Error converting WebSettings to Chrome implementation. All AndroidX method calls on this WebSettings instance will be no-op calls. See https://crbug.com/388824130 for more info.", e3);
            gVar = new p053s0.g(null, i3);
        }
        gVar.q(z3);
    }

    public static final CharSequence m(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    @Override // p029j0.d
    public void c() {
        switch (this.f1004k) {
            case 16:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    @Override // p029j0.d
    public void d(int i3, Object obj) {
        String str;
        switch (this.f1004k) {
            case 16:
                break;
            default:
                switch (i3) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                    default:
                        str = StringUtils.EMPTY;
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i3 == 6 || i3 == 7 || i3 == 8) {
                    Log.e("ProfileInstaller", str, (Throwable) obj);
                } else {
                    Log.d("ProfileInstaller", str);
                }
                break;
        }
    }

    public CharSequence g(Preference preference) {
        switch (this.f1004k) {
            case 14:
                EditTextPreference editTextPreference = (EditTextPreference) preference;
                if (TextUtils.isEmpty(null)) {
                    return editTextPreference.f2188k.getString(R.string.not_set);
                }
                return null;
            default:
                ListPreference listPreference = (ListPreference) preference;
                if (TextUtils.isEmpty(null)) {
                    return listPreference.f2188k.getString(R.string.not_set);
                }
                return null;
        }
    }

    @Override // p028j.o
    public boolean j(p028j.j jVar) {
        return false;
    }

    @Override // C1.m
    public void k(A.c cVar, B1.o oVar) {
        try {
            System.loadLibrary("sqlite3");
            oVar.d(null);
        } catch (Throwable th) {
            oVar.a(th.toString(), null, null);
        }
    }

    public /* synthetic */ A(Object obj, int i3) {
        this.f1004k = i3;
    }

    public A() {
        this.f1004k = 26;
        new p042o.e(0);
        new p042o.g();
    }

    private final void e() {
    }

    private final void f(int i3, Object obj) {
    }

    @Override // p028j.o
    public void b(p028j.j jVar, boolean z3) {
    }
}

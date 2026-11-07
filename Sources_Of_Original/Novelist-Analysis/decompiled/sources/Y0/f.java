package Y0;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final J0.c f1588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final J0.c f1589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final J0.c f1590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final J0.c f1591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final J0.c f1592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final J0.c[] f1593f;

    static {
        J0.c cVar = new J0.c("auth_api_credentials_begin_sign_in", -1, 9L, true);
        J0.c cVar2 = new J0.c("auth_api_credentials_sign_out", -1, 2L, true);
        f1588a = cVar2;
        J0.c cVar3 = new J0.c("auth_api_credentials_authorize", -1, 1L, true);
        f1589b = cVar3;
        J0.c cVar4 = new J0.c("auth_api_credentials_revoke_access", -1, 1L, true);
        f1590c = cVar4;
        J0.c cVar5 = new J0.c("auth_api_credentials_clear_token", -1, 1L, true);
        f1591d = cVar5;
        J0.c cVar6 = new J0.c("auth_api_credentials_save_password", -1, 4L, true);
        J0.c cVar7 = new J0.c("auth_api_credentials_get_sign_in_intent", -1, 6L, true);
        f1592e = cVar7;
        f1593f = new J0.c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, new J0.c("auth_api_credentials_save_account_linking_token", -1, 3L, true), new J0.c("auth_api_credentials_get_phone_number_hint_intent", -1, 3L, true), new J0.c("auth_api_credentials_verify_with_google", -1, 1L, true), new J0.c("auth_api_credentials_credential_provider", -1, 1L, true), new J0.c("auth_api_credentials_save_webauthn_credential_specifics", -1, 1L, true), new J0.c("auth_api_credentials_delete_webauthn_credential_specifics", -1, 1L, true), new J0.c("auth_api_credentials_list_webauthn_credential_specifics", -1, 1L, true), new J0.c("auth_api_credentials_get_google_passkey_for_export", -1, 2L, true), new J0.c("auth_api_credentials_get_authentication_intent", -1, 1L, true), new J0.c("auth_api_credentials_get_registration_intent", -1, 1L, true), new J0.c("auth_api_credentials_check_key_availability", -1, 1L, true), new J0.c("auth_api_credentials_has_discoverable_key", -1, 1L, true), new J0.c("auth_api_credentials_validate_calling_browser", -1, 1L, true), new J0.c("auth_api_credentials_validate_rp_id_and_calling_package", -1, 1L, true), new J0.c("auth_api_credentials_get_credential_list_for_browser", -1, 1L, true), new J0.c("auth_api_credentials_share_passwords_with_ai_agent", -1, 1L, true), new J0.c("auth_api_credentials_update_webauthn_credential_specifics", -1, 1L, true)};
    }

    public static K0.f a() {
        K0.f fVar = new K0.f(new K0.g(-1, -1, 0, true), false);
        fVar.f638m = false;
        return fVar;
    }

    public static String b(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i3 = 0;
        int i4 = 0;
        while (true) {
            length = objArr.length;
            if (i3 >= length || (iIndexOf = str.indexOf("%s", i4)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i4, iIndexOf);
            sb.append(d(objArr[i3]));
            i4 = iIndexOf + 2;
            i3++;
        }
        sb.append((CharSequence) str, i4, str.length());
        if (i3 < length) {
            String str2 = " [";
            while (i3 < objArr.length) {
                sb.append(str2);
                sb.append(d(objArr[i3]));
                i3++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static void c(int i3, int i4) {
        String strB;
        if (i3 < 0 || i3 >= i4) {
            if (i3 < 0) {
                strB = b("%s (%s) must not be negative", "index", Integer.valueOf(i3));
            } else {
                if (i4 < 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 15);
                    sb.append("negative size: ");
                    sb.append(i4);
                    throw new IllegalArgumentException(sb.toString());
                }
                strB = b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i3), Integer.valueOf(i4));
            }
            throw new IndexOutOfBoundsException(strB);
        }
    }

    public static String d(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e3) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
            sb.append(name);
            sb.append("@");
            sb.append(hexString);
            String string = sb.toString();
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(string), (Throwable) e3);
            String name2 = e3.getClass().getName();
            StringBuilder sb2 = new StringBuilder(string.length() + 8 + name2.length() + 1);
            sb2.append("<");
            sb2.append(string);
            sb2.append(" threw ");
            sb2.append(name2);
            sb2.append(">");
            return sb2.toString();
        }
    }

    public static void e(int i3, int i4, int i5) {
        String strF;
        if (i3 < 0 || i4 < i3 || i4 > i5) {
            if (i3 < 0 || i3 > i5) {
                strF = f(i3, "start index", i5);
            } else {
                strF = (i4 < 0 || i4 > i5) ? f(i4, "end index", i5) : b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i4), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(strF);
        }
    }

    public static String f(int i3, String str, int i4) {
        if (i3 < 0) {
            return b("%s (%s) must not be negative", str, Integer.valueOf(i3));
        }
        if (i4 >= 0) {
            return b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i3), Integer.valueOf(i4));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 15);
        sb.append("negative size: ");
        sb.append(i4);
        throw new IllegalArgumentException(sb.toString());
    }
}

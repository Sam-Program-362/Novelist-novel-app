package H0;

import M0.r;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.tika.metadata.HttpHeaders;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final G1.a f424m = new G1.a("RevokeAccessOperation", new String[0]);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f425k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final L0.j f426l;

    public c(String str) {
        r.d(str);
        this.f425k = str;
        this.f426l = new L0.j(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        G1.a aVar = f424m;
        Status status = Status.f2723q;
        try {
            String str = this.f425k;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
            sb.append("https://accounts.google.com/o/oauth2/revoke?token=");
            sb.append(str);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(sb.toString()).openConnection();
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f2721o;
            } else {
                Log.e((String) aVar.f398b, ((String) aVar.f399c).concat("Unable to revoke access!"));
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(responseCode).length() + 15);
            sb2.append("Response Code: ");
            sb2.append(responseCode);
            String string = sb2.toString();
            if (aVar.f397a <= 3) {
                Log.d((String) aVar.f398b, ((String) aVar.f399c).concat(string));
            }
        } catch (IOException e3) {
            Log.e((String) aVar.f398b, ((String) aVar.f399c).concat("IOException when revoking access: ".concat(String.valueOf(e3.toString()))));
        } catch (Exception e4) {
            Log.e((String) aVar.f398b, ((String) aVar.f399c).concat("Exception when revoking access: ".concat(String.valueOf(e4.toString()))));
        }
        this.f426l.P(status);
    }
}

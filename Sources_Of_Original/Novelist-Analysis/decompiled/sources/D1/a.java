package D1;

import A.c;
import B1.s;
import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f273b;

    public a(Context context, c cVar) {
        B1.a aVar = new B1.a(this, 7);
        this.f273b = context;
        this.f272a = cVar;
        cVar.f7m = aVar;
    }

    public static Locale a(String str) {
        Locale.Builder builder = new Locale.Builder();
        String[] strArrSplit = str.replace('_', '-').split("-");
        builder.setLanguage(strArrSplit[0]);
        int i3 = 1;
        if (strArrSplit.length > 1 && strArrSplit[1].length() == 4) {
            builder.setScript(strArrSplit[1]);
            i3 = 2;
        }
        if (strArrSplit.length > i3 && strArrSplit[i3].length() >= 2 && strArrSplit[i3].length() <= 3) {
            builder.setRegion(strArrSplit[i3]);
        }
        return builder.build();
    }

    public final void b(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        LocaleList locales = configuration.getLocales();
        int size = locales.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(locales.get(i4));
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        while (i3 < size2) {
            Object obj = arrayList.get(i3);
            i3++;
            Locale locale = (Locale) obj;
            locale.getLanguage();
            locale.getCountry();
            locale.getVariant();
            arrayList2.add(locale.getLanguage());
            arrayList2.add(locale.getCountry());
            arrayList2.add(locale.getScript());
            arrayList2.add(locale.getVariant());
        }
        ((s) this.f272a.f6l).s("setLocale", arrayList2, null);
    }
}

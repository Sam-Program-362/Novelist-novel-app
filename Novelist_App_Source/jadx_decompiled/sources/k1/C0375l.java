package k1;

import A.q;
import B1.o;
import B1.s;
import C1.r;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import l1.C0418b;
import org.apache.tika.utils.StringUtils;
import y1.C0500a;

/* renamed from: k1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0375l implements y1.b, C1.m {

    /* renamed from: r, reason: collision with root package name */
    public static String f3859r;

    /* renamed from: v, reason: collision with root package name */
    public static InterfaceC0371h f3862v;

    /* renamed from: k, reason: collision with root package name */
    public Context f3863k;

    /* renamed from: l, reason: collision with root package name */
    public s f3864l;

    /* renamed from: m, reason: collision with root package name */
    public static final HashMap f3855m = new HashMap();
    public static final HashMap n = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    public static final Object f3856o = new Object();

    /* renamed from: p, reason: collision with root package name */
    public static final Object f3857p = new Object();

    /* renamed from: q, reason: collision with root package name */
    public static int f3858q = 0;

    /* renamed from: s, reason: collision with root package name */
    public static int f3860s = 0;

    /* renamed from: t, reason: collision with root package name */
    public static int f3861t = 1;
    public static int u = 0;

    public static void a(C0375l c0375l, C0368e c0368e) {
        try {
            if (c0368e.f3824d >= 1) {
                Log.d("Sqflite", c0368e.i() + "closing database ");
            }
            c0368e.b();
        } catch (Exception e3) {
            Log.e("Sqflite", "error " + e3 + " while closing database " + u);
        }
        synchronized (f3856o) {
            try {
                if (n.isEmpty() && f3862v != null) {
                    if (c0368e.f3824d >= 1) {
                        Log.d("Sqflite", c0368e.i() + "stopping thread");
                    }
                    f3862v.a();
                    f3862v = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C0368e b(A.c cVar, o oVar) {
        Integer num = (Integer) cVar.i("id");
        int intValue = num.intValue();
        C0368e c0368e = (C0368e) n.get(num);
        if (c0368e != null) {
            return c0368e;
        }
        oVar.a("sqlite_error", "database_closed " + intValue, null);
        return null;
    }

    public static HashMap c(int i3, boolean z3, boolean z4) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", Integer.valueOf(i3));
        if (z3) {
            hashMap.put("recovered", Boolean.TRUE);
        }
        if (z4) {
            hashMap.put("recoveredInTransaction", Boolean.TRUE);
        }
        return hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // C1.m
    public final void k(final A.c cVar, final o oVar) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z3;
        C0368e c0368e;
        final int i7;
        B1.i iVar;
        C0368e c0368e2;
        boolean z4;
        String str = (String) cVar.f6l;
        str.getClass();
        i3 = 5;
        i4 = 4;
        i5 = 2;
        i6 = 1;
        z3 = false;
        z4 = false;
        switch (str) {
            case "execute":
                C0368e b3 = b(cVar, oVar);
                if (b3 == null) {
                    return;
                }
                f3862v.c(b3, new RunnableC0373j(cVar, oVar, b3, i4));
                return;
            case "closeDatabase":
                Integer num = (Integer) cVar.i("id");
                int intValue = num.intValue();
                C0368e b4 = b(cVar, oVar);
                if (b4 == null) {
                    return;
                }
                if (b4.f3824d >= 1) {
                    Log.d("Sqflite", b4.i() + "closing " + intValue + StringUtils.SPACE + b4.f3822b);
                }
                String str2 = b4.f3822b;
                synchronized (f3856o) {
                    try {
                        n.remove(num);
                        if (b4.f3821a) {
                            f3855m.remove(str2);
                        }
                    } finally {
                    }
                }
                f3862v.c(b4, new q(this, b4, oVar));
                return;
            case "options":
                Object i8 = cVar.i("androidThreadPriority");
                if (i8 != null) {
                    f3860s = ((Integer) i8).intValue();
                }
                Object i9 = cVar.i("androidThreadCount");
                if (i9 != null && !i9.equals(Integer.valueOf(f3861t))) {
                    f3861t = ((Integer) i9).intValue();
                    InterfaceC0371h interfaceC0371h = f3862v;
                    if (interfaceC0371h != null) {
                        interfaceC0371h.a();
                        f3862v = null;
                    }
                }
                Integer num2 = (Integer) cVar.i("logLevel");
                if (num2 != null) {
                    f3858q = num2.intValue();
                }
                oVar.d(null);
                return;
            case "insert":
                C0368e b5 = b(cVar, oVar);
                if (b5 == null) {
                    return;
                }
                f3862v.c(b5, new RunnableC0373j(cVar, oVar, b5, i6));
                return;
            case "update":
                C0368e b6 = b(cVar, oVar);
                if (b6 == null) {
                    return;
                }
                f3862v.c(b6, new RunnableC0373j(cVar, oVar, b6, i3));
                return;
            case "androidSetLocale":
                C0368e b7 = b(cVar, oVar);
                if (b7 == null) {
                    return;
                }
                f3862v.c(b7, new RunnableC0373j(cVar, b7, oVar));
                return;
            case "deleteDatabase":
                String str3 = (String) cVar.i("path");
                synchronized (f3856o) {
                    try {
                        if (AbstractC0364a.a(f3858q)) {
                            Log.d("Sqflite", "Look for " + str3 + " in " + f3855m.keySet());
                        }
                        HashMap hashMap = f3855m;
                        Integer num3 = (Integer) hashMap.get(str3);
                        if (num3 != null) {
                            HashMap hashMap2 = n;
                            C0368e c0368e3 = (C0368e) hashMap2.get(num3);
                            if (c0368e3 != null && c0368e3.f3829i.isOpen()) {
                                if (AbstractC0364a.a(f3858q)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(c0368e3.i());
                                    sb.append("found single instance ");
                                    sb.append(c0368e3.k() ? "(in transaction) " : StringUtils.EMPTY);
                                    sb.append(num3);
                                    sb.append(StringUtils.SPACE);
                                    sb.append(str3);
                                    Log.d("Sqflite", sb.toString());
                                }
                                hashMap2.remove(num3);
                                hashMap.remove(str3);
                                c0368e = c0368e3;
                            }
                        }
                        c0368e = null;
                    } finally {
                    }
                }
                j.e eVar = new j.e(this, c0368e, str3, oVar, 1);
                InterfaceC0371h interfaceC0371h2 = f3862v;
                if (interfaceC0371h2 != null) {
                    interfaceC0371h2.c(c0368e, eVar);
                    return;
                } else {
                    eVar.run();
                    return;
                }
            case "debugMode":
                boolean equals = Boolean.TRUE.equals(cVar.f7m);
                if (!equals) {
                    f3858q = 0;
                } else if (equals) {
                    f3858q = 1;
                }
                oVar.d(null);
                return;
            case "openDatabase":
                final String str4 = (String) cVar.i("path");
                final Boolean bool = (Boolean) cVar.i("readOnly");
                final boolean z5 = str4 == null || str4.equals(":memory:");
                boolean z6 = (Boolean.FALSE.equals(cVar.i("singleInstance")) || z5) ? false : true;
                if (z6) {
                    synchronized (f3856o) {
                        try {
                            if (AbstractC0364a.a(f3858q)) {
                                Log.d("Sqflite", "Look for " + str4 + " in " + f3855m.keySet());
                            }
                            Integer num4 = (Integer) f3855m.get(str4);
                            if (num4 != null && (c0368e2 = (C0368e) n.get(num4)) != null) {
                                if (c0368e2.f3829i.isOpen()) {
                                    if (AbstractC0364a.a(f3858q)) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(c0368e2.i());
                                        sb2.append("re-opened single instance ");
                                        sb2.append(c0368e2.k() ? "(in transaction) " : StringUtils.EMPTY);
                                        sb2.append(num4);
                                        sb2.append(StringUtils.SPACE);
                                        sb2.append(str4);
                                        Log.d("Sqflite", sb2.toString());
                                    }
                                    oVar.d(c(num4.intValue(), true, c0368e2.k()));
                                    return;
                                }
                                if (AbstractC0364a.a(f3858q)) {
                                    Log.d("Sqflite", c0368e2.i() + "single instance database of " + str4 + " not opened");
                                }
                            }
                        } finally {
                        }
                    }
                }
                Object obj = f3856o;
                synchronized (obj) {
                    i7 = u + 1;
                    u = i7;
                }
                final C0368e c0368e4 = new C0368e(this.f3863k, str4, i7, z6, f3858q);
                synchronized (obj) {
                    try {
                        if (f3862v == null) {
                            int i10 = f3861t;
                            int i11 = f3860s;
                            if (i10 == 1) {
                                G1.a aVar = new G1.a();
                                aVar.f397a = i11;
                                iVar = aVar;
                            } else {
                                iVar = new B1.i(i10, i11);
                            }
                            f3862v = iVar;
                            iVar.start();
                            if (c0368e4.f3824d >= 1) {
                                Log.d("Sqflite", c0368e4.i() + "starting worker pool with priority " + f3860s);
                            }
                        }
                        c0368e4.f3828h = f3862v;
                        if (c0368e4.f3824d >= 1) {
                            Log.d("Sqflite", c0368e4.i() + "opened " + i7 + StringUtils.SPACE + str4);
                        }
                        final boolean z7 = z6;
                        f3862v.c(c0368e4, new Runnable() { // from class: k1.k
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z8 = z5;
                                String str5 = str4;
                                o oVar2 = oVar;
                                Boolean bool2 = bool;
                                C0368e c0368e5 = c0368e4;
                                A.c cVar2 = cVar;
                                boolean z9 = z7;
                                int i12 = i7;
                                synchronized (C0375l.f3857p) {
                                    if (!z8) {
                                        File file = new File(new File(str5).getParent());
                                        if (!file.exists() && !file.mkdirs() && !file.exists()) {
                                            oVar2.a("sqlite_error", "open_failed " + str5, null);
                                            return;
                                        }
                                    }
                                    try {
                                        if (Boolean.TRUE.equals(bool2)) {
                                            c0368e5.f3829i = SQLiteDatabase.openDatabase(c0368e5.f3822b, null, 1, new C0367d());
                                        } else {
                                            c0368e5.l();
                                        }
                                        synchronized (C0375l.f3856o) {
                                            if (z9) {
                                                try {
                                                    C0375l.f3855m.put(str5, Integer.valueOf(i12));
                                                } finally {
                                                }
                                            }
                                            C0375l.n.put(Integer.valueOf(i12), c0368e5);
                                        }
                                        if (c0368e5.f3824d >= 1) {
                                            Log.d("Sqflite", c0368e5.i() + "opened " + i12 + StringUtils.SPACE + str5);
                                        }
                                        oVar2.d(C0375l.c(i12, false, false));
                                    } catch (Exception e3) {
                                        c0368e5.j(e3, new C0418b(cVar2, oVar2));
                                    }
                                }
                            }
                        });
                    } finally {
                    }
                }
                return;
            case "batch":
                C0368e b8 = b(cVar, oVar);
                if (b8 == null) {
                    return;
                }
                f3862v.c(b8, new RunnableC0373j(b8, cVar, oVar));
                return;
            case "debug":
                String str5 = (String) cVar.i("cmd");
                HashMap hashMap3 = new HashMap();
                if ("get".equals(str5)) {
                    int i12 = f3858q;
                    if (i12 > 0) {
                        hashMap3.put("logLevel", Integer.valueOf(i12));
                    }
                    HashMap hashMap4 = n;
                    if (!hashMap4.isEmpty()) {
                        HashMap hashMap5 = new HashMap();
                        for (Map.Entry entry : hashMap4.entrySet()) {
                            C0368e c0368e5 = (C0368e) entry.getValue();
                            HashMap hashMap6 = new HashMap();
                            hashMap6.put("path", c0368e5.f3822b);
                            hashMap6.put("singleInstance", Boolean.valueOf(c0368e5.f3821a));
                            int i13 = c0368e5.f3824d;
                            if (i13 > 0) {
                                hashMap6.put("logLevel", Integer.valueOf(i13));
                            }
                            hashMap5.put(((Integer) entry.getKey()).toString(), hashMap6);
                        }
                        hashMap3.put("databases", hashMap5);
                    }
                }
                oVar.d(hashMap3);
                return;
            case "query":
                C0368e b9 = b(cVar, oVar);
                if (b9 == null) {
                    return;
                }
                f3862v.c(b9, new RunnableC0373j(cVar, oVar, b9, i5));
                return;
            case "databaseExists":
                try {
                    z3 = new File((String) cVar.i("path")).exists();
                } catch (Exception unused) {
                }
                oVar.d(Boolean.valueOf(z3));
                return;
            case "queryCursorNext":
                C0368e b10 = b(cVar, oVar);
                if (b10 == null) {
                    return;
                }
                f3862v.c(b10, new RunnableC0373j(cVar, oVar, b10, z4 ? 1 : 0));
                return;
            case "getPlatformVersion":
                oVar.d("Android " + Build.VERSION.RELEASE);
                return;
            case "getDatabasesPath":
                if (f3859r == null) {
                    f3859r = this.f3863k.getDatabasePath("tekartik_sqflite.db").getParent();
                }
                oVar.d(f3859r);
                return;
            default:
                oVar.b();
                return;
        }
    }

    @Override // y1.b
    public final void onAttachedToEngine(C0500a c0500a) {
        Context context = c0500a.f4728a;
        C1.f fVar = c0500a.f4730c;
        this.f3863k = context;
        s sVar = new s(fVar, "com.tekartik.sqflite", r.f180a, fVar.a(new C1.k()));
        this.f3864l = sVar;
        sVar.z(this);
    }

    @Override // y1.b
    public final void onDetachedFromEngine(C0500a c0500a) {
        this.f3863k = null;
        this.f3864l.z(null);
        this.f3864l = null;
    }
}

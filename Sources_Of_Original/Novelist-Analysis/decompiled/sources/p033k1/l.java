package p033k1;

import A.c;
import A.q;
import B1.i;
import B1.o;
import B1.s;
import C1.f;
import C1.k;
import C1.m;
import C1.r;
import G1.a;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.utils.StringUtils;
import p028j.e;
import p067y1.b;

/* JADX INFO: loaded from: classes.dex */
public class l implements b, m {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static String f3859r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static h f3862v;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Context f3863k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public s f3864l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final HashMap f3855m = new HashMap();
    public static final HashMap n = new HashMap();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Object f3856o = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Object f3857p = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f3858q = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static int f3860s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static int f3861t = 1;
    public static int u = 0;

    public static void a(l lVar, e eVar) {
        try {
            if (eVar.f3824d >= 1) {
                Log.d("Sqflite", eVar.i() + "closing database ");
            }
            eVar.b();
        } catch (Exception e3) {
            Log.e("Sqflite", "error " + e3 + " while closing database " + u);
        }
        synchronized (f3856o) {
            try {
                if (n.isEmpty() && f3862v != null) {
                    if (eVar.f3824d >= 1) {
                        Log.d("Sqflite", eVar.i() + "stopping thread");
                    }
                    f3862v.a();
                    f3862v = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static e b(c cVar, o oVar) {
        Integer num = (Integer) cVar.i("id");
        int iIntValue = num.intValue();
        e eVar = (e) n.get(num);
        if (eVar != null) {
            return eVar;
        }
        oVar.a("sqlite_error", "database_closed " + iIntValue, null);
        return null;
    }

    public static HashMap c(int i3, boolean z3, boolean z4) {
        HashMap map = new HashMap();
        map.put("id", Integer.valueOf(i3));
        if (z3) {
            map.put("recovered", Boolean.TRUE);
        }
        if (z4) {
            map.put("recoveredInTransaction", Boolean.TRUE);
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:215:0x042e  */
    @Override // C1.m
    public final void k(final c cVar, final o oVar) {
        e eVar;
        final int i3;
        h iVar;
        e eVar2;
        String str = (String) cVar.f6l;
        str.getClass();
        int i4 = 5;
        int i5 = 4;
        int i6 = 2;
        int i7 = 1;
        boolean zExists = false;
        boolean z3 = false;
        switch (str) {
            case "execute":
                e eVarB = b(cVar, oVar);
                if (eVarB == null) {
                    return;
                }
                f3862v.c(eVarB, new j(cVar, oVar, eVarB, i5));
                return;
            case "closeDatabase":
                Integer num = (Integer) cVar.i("id");
                int iIntValue = num.intValue();
                e eVarB2 = b(cVar, oVar);
                if (eVarB2 == null) {
                    return;
                }
                if (eVarB2.f3824d >= 1) {
                    Log.d("Sqflite", eVarB2.i() + "closing " + iIntValue + StringUtils.SPACE + eVarB2.f3822b);
                }
                String str2 = eVarB2.f3822b;
                synchronized (f3856o) {
                    try {
                        n.remove(num);
                        if (eVarB2.f3821a) {
                            f3855m.remove(str2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                f3862v.c(eVarB2, new q(this, eVarB2, oVar));
                return;
            case "options":
                Object objI = cVar.i("androidThreadPriority");
                if (objI != null) {
                    f3860s = ((Integer) objI).intValue();
                }
                Object objI2 = cVar.i("androidThreadCount");
                if (objI2 != null && !objI2.equals(Integer.valueOf(f3861t))) {
                    f3861t = ((Integer) objI2).intValue();
                    h hVar = f3862v;
                    if (hVar != null) {
                        hVar.a();
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
                e eVarB3 = b(cVar, oVar);
                if (eVarB3 == null) {
                    return;
                }
                f3862v.c(eVarB3, new j(cVar, oVar, eVarB3, i7));
                return;
            case "update":
                e eVarB4 = b(cVar, oVar);
                if (eVarB4 == null) {
                    return;
                }
                f3862v.c(eVarB4, new j(cVar, oVar, eVarB4, i4));
                return;
            case "androidSetLocale":
                e eVarB5 = b(cVar, oVar);
                if (eVarB5 == null) {
                    return;
                }
                f3862v.c(eVarB5, new j(cVar, eVarB5, oVar));
                return;
            case "deleteDatabase":
                String str3 = (String) cVar.i("path");
                synchronized (f3856o) {
                    try {
                        if (a.a(f3858q)) {
                            Log.d("Sqflite", "Look for " + str3 + " in " + f3855m.keySet());
                        }
                        HashMap map = f3855m;
                        Integer num3 = (Integer) map.get(str3);
                        if (num3 != null) {
                            HashMap map2 = n;
                            e eVar3 = (e) map2.get(num3);
                            if (eVar3 == null || !eVar3.f3829i.isOpen()) {
                                eVar = null;
                            } else {
                                if (a.a(f3858q)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(eVar3.i());
                                    sb.append("found single instance ");
                                    sb.append(eVar3.k() ? "(in transaction) " : StringUtils.EMPTY);
                                    sb.append(num3);
                                    sb.append(StringUtils.SPACE);
                                    sb.append(str3);
                                    Log.d("Sqflite", sb.toString());
                                }
                                map2.remove(num3);
                                map.remove(str3);
                                eVar = eVar3;
                            }
                        } else {
                            eVar = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                e eVar4 = new e(this, eVar, str3, oVar, 1);
                h hVar2 = f3862v;
                if (hVar2 != null) {
                    hVar2.c(eVar, eVar4);
                    return;
                } else {
                    eVar4.run();
                    return;
                }
            case "debugMode":
                boolean zEquals = Boolean.TRUE.equals(cVar.f7m);
                if (!zEquals) {
                    f3858q = 0;
                } else if (zEquals) {
                    f3858q = 1;
                }
                oVar.d(null);
                return;
            case "openDatabase":
                final String str4 = (String) cVar.i("path");
                final Boolean bool = (Boolean) cVar.i("readOnly");
                final boolean z4 = str4 == null || str4.equals(":memory:");
                boolean z5 = (Boolean.FALSE.equals(cVar.i("singleInstance")) || z4) ? false : true;
                if (z5) {
                    synchronized (f3856o) {
                        try {
                            if (a.a(f3858q)) {
                                Log.d("Sqflite", "Look for " + str4 + " in " + f3855m.keySet());
                            }
                            Integer num4 = (Integer) f3855m.get(str4);
                            if (num4 != null && (eVar2 = (e) n.get(num4)) != null) {
                                if (eVar2.f3829i.isOpen()) {
                                    if (a.a(f3858q)) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(eVar2.i());
                                        sb2.append("re-opened single instance ");
                                        sb2.append(eVar2.k() ? "(in transaction) " : StringUtils.EMPTY);
                                        sb2.append(num4);
                                        sb2.append(StringUtils.SPACE);
                                        sb2.append(str4);
                                        Log.d("Sqflite", sb2.toString());
                                    }
                                    oVar.d(c(num4.intValue(), true, eVar2.k()));
                                    return;
                                }
                                if (a.a(f3858q)) {
                                    Log.d("Sqflite", eVar2.i() + "single instance database of " + str4 + " not opened");
                                }
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
                Object obj = f3856o;
                synchronized (obj) {
                    i3 = u + 1;
                    u = i3;
                    break;
                }
                final e eVar5 = new e(this.f3863k, str4, i3, z5, f3858q);
                synchronized (obj) {
                    try {
                        if (f3862v == null) {
                            int i8 = f3861t;
                            int i9 = f3860s;
                            if (i8 == 1) {
                                a aVar = new a();
                                aVar.f397a = i9;
                                iVar = aVar;
                            } else {
                                iVar = new i(i8, i9);
                            }
                            f3862v = iVar;
                            iVar.start();
                            if (eVar5.f3824d >= 1) {
                                Log.d("Sqflite", eVar5.i() + "starting worker pool with priority " + f3860s);
                            }
                        }
                        eVar5.f3828h = f3862v;
                        if (eVar5.f3824d >= 1) {
                            Log.d("Sqflite", eVar5.i() + "opened " + i3 + StringUtils.SPACE + str4);
                        }
                        final boolean z6 = z5;
                        f3862v.c(eVar5, new Runnable() { // from class: k1.k
                            /* JADX WARN: Code duplicated, block: B:19:0x0057 A[Catch: all -> 0x004b, Exception -> 0x00b8, TryCatch #1 {Exception -> 0x00b8, blocks: (B:17:0x004e, B:19:0x0057, B:20:0x0065), top: B:45:0x004e, outer: #2 }] */
                            /* JADX WARN: Code duplicated, block: B:20:0x0065 A[Catch: all -> 0x004b, Exception -> 0x00b8, TRY_LEAVE, TryCatch #1 {Exception -> 0x00b8, blocks: (B:17:0x004e, B:19:0x0057, B:20:0x0065), top: B:45:0x004e, outer: #2 }] */
                            /* JADX WARN: Code duplicated, block: B:23:0x006b A[DONT_INVERT] */
                            /* JADX WARN: Code duplicated, block: B:27:0x0079 A[Catch: all -> 0x0077, TryCatch #0 {all -> 0x0077, blocks: (B:24:0x006d, B:27:0x0079, B:28:0x0082), top: B:43:0x006d, outer: #2 }] */
                            /* JADX WARN: Code duplicated, block: B:31:0x0087 A[Catch: all -> 0x004b, TryCatch #2 {, blocks: (B:6:0x0018, B:8:0x002c, B:10:0x0032, B:12:0x0038, B:13:0x0049, B:17:0x004e, B:19:0x0057, B:21:0x0068, B:22:0x006a, B:29:0x0083, B:31:0x0087, B:32:0x00ac, B:36:0x00b7, B:20:0x0065, B:38:0x00b9, B:39:0x00c1, B:24:0x006d, B:27:0x0079, B:28:0x0082), top: B:46:0x0018, inners: #0, #1 }] */
                            /* JADX WARN: Code duplicated, block: B:43:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            /* JADX WARN: Instruction removed from duplicated block: B:31:0x0087, please report this as an issue */
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z7 = z4;
                                String str5 = str4;
                                o oVar2 = oVar;
                                Boolean bool2 = bool;
                                e eVar6 = eVar5;
                                c cVar2 = cVar;
                                boolean z8 = z6;
                                int i10 = i3;
                                synchronized (l.f3857p) {
                                    if (z7) {
                                        if (Boolean.TRUE.equals(bool2)) {
                                            eVar6.f3829i = SQLiteDatabase.openDatabase(eVar6.f3822b, null, 1, new d());
                                        } else {
                                            eVar6.l();
                                        }
                                        synchronized (l.f3856o) {
                                            if (!z8) {
                                                l.n.put(Integer.valueOf(i10), eVar6);
                                                if (eVar6.f3824d >= 1) {
                                                    Log.d("Sqflite", eVar6.i() + "opened " + i10 + StringUtils.SPACE + str5);
                                                }
                                                oVar2.d(l.c(i10, false, false));
                                                return;
                                            }
                                            l.f3855m.put(str5, Integer.valueOf(i10));
                                            l.n.put(Integer.valueOf(i10), eVar6);
                                            if (eVar6.f3824d >= 1) {
                                                Log.d("Sqflite", eVar6.i() + "opened " + i10 + StringUtils.SPACE + str5);
                                            }
                                            oVar2.d(l.c(i10, false, false));
                                            return;
                                        }
                                    }
                                    File file = new File(new File(str5).getParent());
                                    if (!file.exists() && !file.mkdirs() && !file.exists()) {
                                        oVar2.a("sqlite_error", "open_failed " + str5, null);
                                        return;
                                    }
                                    try {
                                        if (Boolean.TRUE.equals(bool2)) {
                                            eVar6.f3829i = SQLiteDatabase.openDatabase(eVar6.f3822b, null, 1, new d());
                                        } else {
                                            eVar6.l();
                                        }
                                        synchronized (l.f3856o) {
                                            if (!z8) {
                                                try {
                                                    l.f3855m.put(str5, Integer.valueOf(i10));
                                                    l.n.put(Integer.valueOf(i10), eVar6);
                                                } catch (Throwable th4) {
                                                    throw th4;
                                                }
                                            } else {
                                                l.n.put(Integer.valueOf(i10), eVar6);
                                            }
                                        }
                                        if (eVar6.f3824d >= 1) {
                                            Log.d("Sqflite", eVar6.i() + "opened " + i10 + StringUtils.SPACE + str5);
                                        }
                                        oVar2.d(l.c(i10, false, false));
                                        return;
                                    } catch (Exception e3) {
                                        eVar6.j(e3, new p036l1.b(cVar2, oVar2));
                                        return;
                                    }
                                    throw th;
                                }
                            }
                        });
                    } catch (Throwable th4) {
                        throw th4;
                    }
                    break;
                }
                return;
            case "batch":
                e eVarB6 = b(cVar, oVar);
                if (eVarB6 == null) {
                    return;
                }
                f3862v.c(eVarB6, new j(eVarB6, cVar, oVar));
                return;
            case "debug":
                String str5 = (String) cVar.i("cmd");
                HashMap map3 = new HashMap();
                if ("get".equals(str5)) {
                    int i10 = f3858q;
                    if (i10 > 0) {
                        map3.put("logLevel", Integer.valueOf(i10));
                    }
                    HashMap map4 = n;
                    if (!map4.isEmpty()) {
                        HashMap map5 = new HashMap();
                        for (Map.Entry entry : map4.entrySet()) {
                            e eVar6 = (e) entry.getValue();
                            HashMap map6 = new HashMap();
                            map6.put("path", eVar6.f3822b);
                            map6.put("singleInstance", Boolean.valueOf(eVar6.f3821a));
                            int i11 = eVar6.f3824d;
                            if (i11 > 0) {
                                map6.put("logLevel", Integer.valueOf(i11));
                            }
                            map5.put(((Integer) entry.getKey()).toString(), map6);
                        }
                        map3.put("databases", map5);
                    }
                }
                oVar.d(map3);
                return;
            case "query":
                e eVarB7 = b(cVar, oVar);
                if (eVarB7 == null) {
                    return;
                }
                f3862v.c(eVarB7, new j(cVar, oVar, eVarB7, i6));
                return;
            case "databaseExists":
                try {
                    zExists = new File((String) cVar.i("path")).exists();
                    break;
                } catch (Exception unused) {
                }
                oVar.d(Boolean.valueOf(zExists));
                return;
            case "queryCursorNext":
                e eVarB8 = b(cVar, oVar);
                if (eVarB8 == null) {
                    return;
                }
                f3862v.c(eVarB8, new j(cVar, oVar, eVarB8, z3 ? 1 : 0));
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

    @Override // p067y1.b
    public final void onAttachedToEngine(p067y1.a aVar) {
        Context context = aVar.f4728a;
        f fVar = aVar.f4730c;
        this.f3863k = context;
        s sVar = new s(fVar, "com.tekartik.sqflite", r.f180a, fVar.a(new k()));
        this.f3864l = sVar;
        sVar.z(this);
    }

    @Override // p067y1.b
    public final void onDetachedFromEngine(p067y1.a aVar) {
        this.f3863k = null;
        this.f3864l.z(null);
        this.f3864l = null;
    }
}

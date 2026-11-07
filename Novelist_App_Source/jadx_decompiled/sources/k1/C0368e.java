package k1;

import M1.RunnableC0053b;
import a.AbstractC0102a;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import l1.C0418b;
import l1.C0420d;

/* renamed from: k1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0368e {
    public static Boolean n;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3821a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3822b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3823c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3824d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f3825e;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0371h f3828h;

    /* renamed from: i, reason: collision with root package name */
    public SQLiteDatabase f3829i;

    /* renamed from: l, reason: collision with root package name */
    public Integer f3832l;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3826f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f3827g = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public int f3830j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f3831k = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f3833m = 0;

    public C0368e(Context context, String str, int i3, boolean z3, int i4) {
        this.f3825e = context;
        this.f3822b = str;
        this.f3821a = z3;
        this.f3823c = i3;
        this.f3824d = i4;
    }

    public static void a(SQLiteStatement sQLiteStatement, Object[] objArr) {
        int i3 = 0;
        while (i3 < objArr.length) {
            Object obj = objArr[i3];
            i3++;
            if (obj == null) {
                sQLiteStatement.bindNull(i3);
            } else if (obj instanceof byte[]) {
                sQLiteStatement.bindBlob(i3, (byte[]) obj);
            } else if ((obj instanceof Double) || (obj instanceof Float)) {
                sQLiteStatement.bindDouble(i3, ((Number) obj).doubleValue());
            } else if (obj instanceof Number) {
                sQLiteStatement.bindLong(i3, ((Number) obj).longValue());
            } else if (obj instanceof Boolean) {
                sQLiteStatement.bindLong(i3, ((Boolean) obj).booleanValue() ? 1L : 0L);
            } else {
                sQLiteStatement.bindString(i3, obj.toString());
            }
        }
    }

    public static HashMap d(Cursor cursor, Integer num) {
        HashMap hashMap = null;
        ArrayList arrayList = null;
        int i3 = 0;
        while (cursor.moveToNext()) {
            if (hashMap == null) {
                arrayList = new ArrayList();
                hashMap = new HashMap();
                i3 = cursor.getColumnCount();
                hashMap.put("columns", Arrays.asList(cursor.getColumnNames()));
                hashMap.put("rows", arrayList);
            }
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 < i3; i4++) {
                int type = cursor.getType(i4);
                arrayList2.add(type != 1 ? type != 2 ? type != 3 ? type != 4 ? null : cursor.getBlob(i4) : cursor.getString(i4) : Double.valueOf(cursor.getDouble(i4)) : Long.valueOf(cursor.getLong(i4)));
            }
            arrayList.add(arrayList2);
            if (num != null && arrayList.size() >= num.intValue()) {
                break;
            }
        }
        return hashMap == null ? new HashMap() : hashMap;
    }

    public final void b() {
        HashMap hashMap = this.f3827g;
        if (!hashMap.isEmpty() && this.f3824d >= 1) {
            Log.d("Sqflite", i() + hashMap.size() + " cursor(s) are left opened");
        }
        this.f3829i.close();
    }

    public final void c(C0372i c0372i) {
        try {
            int i3 = c0372i.f3842a;
            if (AbstractC0364a.a(this.f3824d)) {
                Log.d("Sqflite", i() + "closing cursor " + i3);
            }
            this.f3827g.remove(Integer.valueOf(i3));
            c0372i.f3844c.close();
        } catch (Exception unused) {
        }
    }

    public final boolean e(AbstractC0102a abstractC0102a) {
        C0376m D2 = abstractC0102a.D();
        if (this.f3824d >= 1) {
            Log.d("Sqflite", i() + D2);
        }
        try {
            SQLiteStatement compileStatement = this.f3829i.compileStatement(D2.f3865a);
            a(compileStatement, D2.a());
            long executeInsert = compileStatement.executeInsert();
            if (abstractC0102a.B()) {
                abstractC0102a.p(null);
                return true;
            }
            abstractC0102a.p(Long.valueOf(executeInsert));
            return true;
        } catch (Exception e3) {
            j(e3, abstractC0102a);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k1.m] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v0, types: [a.a] */
    public final boolean f(AbstractC0102a abstractC0102a) {
        Integer num = (Integer) abstractC0102a.x("cursorPageSize");
        final ?? D2 = abstractC0102a.D();
        if (this.f3824d >= 1) {
            Log.d("Sqflite", i() + D2);
        }
        C0372i c0372i = null;
        try {
            try {
                D2 = this.f3829i.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: k1.c
                    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                        List list = C0376m.this.f3866b;
                        if (list != null) {
                            int size = list.size();
                            int i3 = 0;
                            while (i3 < size) {
                                Object b3 = C0376m.b(list.get(i3));
                                int i4 = i3 + 1;
                                if (b3 == null) {
                                    sQLiteQuery.bindNull(i4);
                                } else if (b3 instanceof byte[]) {
                                    sQLiteQuery.bindBlob(i4, (byte[]) b3);
                                } else if (b3 instanceof Double) {
                                    sQLiteQuery.bindDouble(i4, ((Double) b3).doubleValue());
                                } else if (b3 instanceof Integer) {
                                    sQLiteQuery.bindLong(i4, ((Integer) b3).intValue());
                                } else if (b3 instanceof Long) {
                                    sQLiteQuery.bindLong(i4, ((Long) b3).longValue());
                                } else if (b3 instanceof String) {
                                    sQLiteQuery.bindString(i4, (String) b3);
                                } else {
                                    if (!(b3 instanceof Boolean)) {
                                        throw new IllegalArgumentException("Could not bind " + b3 + " from index " + i3 + ": Supported types are null, byte[], double, long, boolean and String");
                                    }
                                    sQLiteQuery.bindLong(i4, ((Boolean) b3).booleanValue() ? 1L : 0L);
                                }
                                i3 = i4;
                            }
                        }
                        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
                    }
                }, D2.f3865a, AbstractC0364a.f3816a, null);
                try {
                    HashMap d3 = d(D2, num);
                    if (num != null && !D2.isLast() && !D2.isAfterLast()) {
                        int i3 = this.f3833m + 1;
                        this.f3833m = i3;
                        d3.put("cursorId", Integer.valueOf(i3));
                        C0372i c0372i2 = new C0372i(i3, num.intValue(), D2);
                        try {
                            this.f3827g.put(Integer.valueOf(i3), c0372i2);
                            c0372i = c0372i2;
                        } catch (Exception e3) {
                            e = e3;
                            c0372i = c0372i2;
                            j(e, abstractC0102a);
                            if (c0372i != null) {
                                c(c0372i);
                            }
                            if (c0372i != null || D2 == 0) {
                                return false;
                            }
                            D2.close();
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            c0372i = c0372i2;
                            if (c0372i == null && D2 != 0) {
                                D2.close();
                            }
                            throw th;
                        }
                    }
                    abstractC0102a.p(d3);
                    if (c0372i == null) {
                        D2.close();
                    }
                    return true;
                } catch (Exception e4) {
                    e = e4;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e5) {
            e = e5;
            D2 = 0;
        } catch (Throwable th3) {
            th = th3;
            D2 = 0;
        }
    }

    public final boolean g(AbstractC0102a abstractC0102a) {
        C0376m D2 = abstractC0102a.D();
        if (this.f3824d >= 1) {
            Log.d("Sqflite", i() + D2);
        }
        try {
            SQLiteStatement compileStatement = this.f3829i.compileStatement(D2.f3865a);
            a(compileStatement, D2.a());
            int executeUpdateDelete = compileStatement.executeUpdateDelete();
            if (abstractC0102a.B()) {
                abstractC0102a.p(null);
                return true;
            }
            abstractC0102a.p(Integer.valueOf(executeUpdateDelete));
            return true;
        } catch (Exception e3) {
            j(e3, abstractC0102a);
            return false;
        }
    }

    public final boolean h(AbstractC0102a abstractC0102a) {
        C0376m D2 = abstractC0102a.D();
        if (this.f3824d >= 1) {
            Log.d("Sqflite", i() + D2);
        }
        Object x = abstractC0102a.x("inTransaction");
        Boolean bool = x instanceof Boolean ? (Boolean) x : null;
        try {
            this.f3829i.execSQL(D2.f3865a, D2.a());
            synchronized (this) {
                try {
                    if (Boolean.TRUE.equals(bool)) {
                        this.f3830j++;
                    } else if (Boolean.FALSE.equals(bool)) {
                        this.f3830j--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        } catch (Exception e3) {
            j(e3, abstractC0102a);
            return false;
        }
    }

    public final String i() {
        StringBuilder sb = new StringBuilder("[");
        Thread currentThread = Thread.currentThread();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f3823c);
        sb2.append(",");
        sb2.append(currentThread.getName());
        sb2.append("(");
        sb2.append(Build.VERSION.SDK_INT >= 36 ? currentThread.threadId() : currentThread.getId());
        sb2.append(")");
        sb.append(sb2.toString());
        sb.append("] ");
        return sb.toString();
    }

    public final void j(Exception exc, AbstractC0102a abstractC0102a) {
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            abstractC0102a.a(null, "open_failed " + this.f3822b);
        } else {
            if (exc instanceof SQLException) {
                String message = exc.getMessage();
                C0376m D2 = abstractC0102a.D();
                HashMap hashMap = new HashMap();
                hashMap.put("sql", D2.f3865a);
                hashMap.put("arguments", D2.f3866b);
                abstractC0102a.a(hashMap, message);
                return;
            }
            String message2 = exc.getMessage();
            C0376m D3 = abstractC0102a.D();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("sql", D3.f3865a);
            hashMap2.put("arguments", D3.f3866b);
            abstractC0102a.a(hashMap2, message2);
        }
    }

    public final synchronized boolean k() {
        return this.f3830j > 0;
    }

    public final void l() {
        ApplicationInfo applicationInfo;
        PackageManager.ApplicationInfoFlags of;
        if (n == null) {
            Context context = this.f3825e;
            boolean z3 = false;
            try {
                String packageName = context.getPackageName();
                if (Build.VERSION.SDK_INT >= 33) {
                    PackageManager packageManager = context.getPackageManager();
                    of = PackageManager.ApplicationInfoFlags.of(128L);
                    applicationInfo = packageManager.getApplicationInfo(packageName, of);
                } else {
                    applicationInfo = context.getPackageManager().getApplicationInfo(packageName, 128);
                }
                if (applicationInfo.metaData.getBoolean("com.tekartik.sqflite.wal_enabled", false)) {
                    z3 = true;
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            n = Boolean.valueOf(z3);
            if (z3 && AbstractC0364a.a(this.f3824d)) {
                Log.d("Sqflite", i() + "[sqflite] WAL enabled");
            }
        }
        this.f3829i = SQLiteDatabase.openDatabase(this.f3822b, null, n.booleanValue() ? 805306368 : 268435456);
    }

    public final void m(C0418b c0418b, Runnable runnable) {
        Integer num = (Integer) c0418b.x("transactionId");
        Integer num2 = this.f3832l;
        if (num2 == null) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f3826f;
        if (num == null || !(num.equals(num2) || num.intValue() == -1)) {
            arrayList.add(new C0420d(runnable));
            return;
        }
        runnable.run();
        if (this.f3832l != null || arrayList.isEmpty()) {
            return;
        }
        this.f3828h.c(this, new RunnableC0053b(this, 9));
    }
}

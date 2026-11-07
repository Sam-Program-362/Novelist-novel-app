package p033k1;

import M1.RunnableC0053b;
import android.content.Context;
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
import p000a.a;
import p036l1.b;
import p036l1.d;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static Boolean n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f3825e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h f3828h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SQLiteDatabase f3829i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Integer f3832l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f3826f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f3827g = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3830j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3831k = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3833m = 0;

    public e(Context context, String str, int i3, boolean z3, int i4) {
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
        Object objValueOf;
        HashMap map = null;
        ArrayList arrayList = null;
        int columnCount = 0;
        while (cursor.moveToNext()) {
            if (map == null) {
                arrayList = new ArrayList();
                map = new HashMap();
                columnCount = cursor.getColumnCount();
                map.put("columns", Arrays.asList(cursor.getColumnNames()));
                map.put("rows", arrayList);
            }
            ArrayList arrayList2 = new ArrayList(columnCount);
            for (int i3 = 0; i3 < columnCount; i3++) {
                int type = cursor.getType(i3);
                if (type == 1) {
                    objValueOf = Long.valueOf(cursor.getLong(i3));
                } else if (type == 2) {
                    objValueOf = Double.valueOf(cursor.getDouble(i3));
                } else if (type != 3) {
                    objValueOf = type != 4 ? null : cursor.getBlob(i3);
                } else {
                    objValueOf = cursor.getString(i3);
                }
                arrayList2.add(objValueOf);
            }
            arrayList.add(arrayList2);
            if (num != null && arrayList.size() >= num.intValue()) {
                break;
            }
        }
        return map == null ? new HashMap() : map;
    }

    public final void b() {
        HashMap map = this.f3827g;
        if (!map.isEmpty() && this.f3824d >= 1) {
            Log.d("Sqflite", i() + map.size() + " cursor(s) are left opened");
        }
        this.f3829i.close();
    }

    public final void c(i iVar) {
        try {
            int i3 = iVar.f3842a;
            if (a.a(this.f3824d)) {
                Log.d("Sqflite", i() + "closing cursor " + i3);
            }
            this.f3827g.remove(Integer.valueOf(i3));
            iVar.f3844c.close();
        } catch (Exception unused) {
        }
    }

    public final boolean e(a aVar) {
        m mVarD = aVar.D();
        if (this.f3824d >= 1) {
            Log.d("Sqflite", i() + mVarD);
        }
        try {
            SQLiteStatement sQLiteStatementCompileStatement = this.f3829i.compileStatement(mVarD.f3865a);
            a(sQLiteStatementCompileStatement, mVarD.a());
            long jExecuteInsert = sQLiteStatementCompileStatement.executeInsert();
            if (aVar.B()) {
                aVar.p(null);
                return true;
            }
            aVar.p(Long.valueOf(jExecuteInsert));
            return true;
        } catch (Exception e3) {
            j(e3, aVar);
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
    public final boolean f(a aVar) throws Throwable {
        Integer num = (Integer) aVar.x("cursorPageSize");
        final ?? D2 = aVar.D();
        if (this.f3824d >= 1) {
            Log.d("Sqflite", i() + D2);
        }
        i iVar = null;
        try {
            try {
                D2 = this.f3829i.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: k1.c
                    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                        List list = D2.f3866b;
                        if (list != null) {
                            int size = list.size();
                            int i3 = 0;
                            while (i3 < size) {
                                Object objB = m.b(list.get(i3));
                                int i4 = i3 + 1;
                                if (objB == null) {
                                    sQLiteQuery.bindNull(i4);
                                } else if (objB instanceof byte[]) {
                                    sQLiteQuery.bindBlob(i4, (byte[]) objB);
                                } else if (objB instanceof Double) {
                                    sQLiteQuery.bindDouble(i4, ((Double) objB).doubleValue());
                                } else if (objB instanceof Integer) {
                                    sQLiteQuery.bindLong(i4, ((Integer) objB).intValue());
                                } else if (objB instanceof Long) {
                                    sQLiteQuery.bindLong(i4, ((Long) objB).longValue());
                                } else if (objB instanceof String) {
                                    sQLiteQuery.bindString(i4, (String) objB);
                                } else {
                                    if (!(objB instanceof Boolean)) {
                                        throw new IllegalArgumentException("Could not bind " + objB + " from index " + i3 + ": Supported types are null, byte[], double, long, boolean and String");
                                    }
                                    sQLiteQuery.bindLong(i4, ((Boolean) objB).booleanValue() ? 1L : 0L);
                                }
                                i3 = i4;
                            }
                        }
                        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
                    }
                }, D2.f3865a, a.f3816a, null);
                try {
                    HashMap mapD = d(D2, num);
                    if (num != null && !D2.isLast() && !D2.isAfterLast()) {
                        int i3 = this.f3833m + 1;
                        this.f3833m = i3;
                        mapD.put("cursorId", Integer.valueOf(i3));
                        i iVar2 = new i(i3, num.intValue(), D2);
                        try {
                            this.f3827g.put(Integer.valueOf(i3), iVar2);
                            iVar = iVar2;
                        } catch (Exception e3) {
                            e = e3;
                            iVar = iVar2;
                            j(e, aVar);
                            if (iVar != null) {
                                c(iVar);
                            }
                            if (iVar != null || D2 == 0) {
                                return false;
                            }
                            D2.close();
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            iVar = iVar2;
                            if (iVar == null && D2 != 0) {
                                D2.close();
                            }
                            throw th;
                        }
                    }
                    aVar.p(mapD);
                    if (iVar == null) {
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

    public final boolean g(a aVar) {
        m mVarD = aVar.D();
        if (this.f3824d >= 1) {
            Log.d("Sqflite", i() + mVarD);
        }
        try {
            SQLiteStatement sQLiteStatementCompileStatement = this.f3829i.compileStatement(mVarD.f3865a);
            a(sQLiteStatementCompileStatement, mVarD.a());
            int iExecuteUpdateDelete = sQLiteStatementCompileStatement.executeUpdateDelete();
            if (aVar.B()) {
                aVar.p(null);
                return true;
            }
            aVar.p(Integer.valueOf(iExecuteUpdateDelete));
            return true;
        } catch (Exception e3) {
            j(e3, aVar);
            return false;
        }
    }

    public final boolean h(a aVar) {
        m mVarD = aVar.D();
        if (this.f3824d >= 1) {
            Log.d("Sqflite", i() + mVarD);
        }
        Object objX = aVar.x("inTransaction");
        Boolean bool = objX instanceof Boolean ? (Boolean) objX : null;
        try {
            this.f3829i.execSQL(mVarD.f3865a, mVarD.a());
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
            j(e3, aVar);
            return false;
        }
    }

    public final String i() {
        StringBuilder sb = new StringBuilder("[");
        Thread threadCurrentThread = Thread.currentThread();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f3823c);
        sb2.append(",");
        sb2.append(threadCurrentThread.getName());
        sb2.append("(");
        sb2.append(Build.VERSION.SDK_INT >= 36 ? threadCurrentThread.threadId() : threadCurrentThread.getId());
        sb2.append(")");
        sb.append(sb2.toString());
        sb.append("] ");
        return sb.toString();
    }

    public final void j(Exception exc, a aVar) {
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            aVar.a(null, "open_failed " + this.f3822b);
        } else {
            if (exc instanceof SQLException) {
                String message = exc.getMessage();
                m mVarD = aVar.D();
                HashMap map = new HashMap();
                map.put("sql", mVarD.f3865a);
                map.put("arguments", mVarD.f3866b);
                aVar.a(map, message);
                return;
            }
            String message2 = exc.getMessage();
            m mVarD2 = aVar.D();
            HashMap map2 = new HashMap();
            map2.put("sql", mVarD2.f3865a);
            map2.put("arguments", mVarD2.f3866b);
            aVar.a(map2, message2);
        }
    }

    public final synchronized boolean k() {
        return this.f3830j > 0;
    }

    public final void l() {
        if (n == null) {
            Context context = this.f3825e;
            boolean z3 = false;
            try {
                String packageName = context.getPackageName();
                if ((Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getApplicationInfo(packageName, PackageManager.ApplicationInfoFlags.of(128L)) : context.getPackageManager().getApplicationInfo(packageName, 128)).metaData.getBoolean("com.tekartik.sqflite.wal_enabled", false)) {
                    z3 = true;
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            n = Boolean.valueOf(z3);
            if (z3 && a.a(this.f3824d)) {
                Log.d("Sqflite", i() + "[sqflite] WAL enabled");
            }
        }
        this.f3829i = SQLiteDatabase.openDatabase(this.f3822b, null, n.booleanValue() ? 805306368 : 268435456);
    }

    public final void m(b bVar, Runnable runnable) {
        Integer num = (Integer) bVar.x("transactionId");
        Integer num2 = this.f3832l;
        if (num2 == null) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f3826f;
        if (num == null || !(num.equals(num2) || num.intValue() == -1)) {
            arrayList.add(new d(runnable));
            return;
        }
        runnable.run();
        if (this.f3832l != null || arrayList.isEmpty()) {
            return;
        }
        this.f3828h.c(this, new RunnableC0053b(this, 9));
    }
}

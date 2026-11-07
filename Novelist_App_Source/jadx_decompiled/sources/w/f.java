package w;

import a.AbstractC0102a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import v.C0484b;
import v.C0485c;

/* loaded from: classes.dex */
public class f extends S0.a {

    /* renamed from: c, reason: collision with root package name */
    public static Class f4643c = null;

    /* renamed from: d, reason: collision with root package name */
    public static Constructor f4644d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Method f4645e = null;

    /* renamed from: f, reason: collision with root package name */
    public static Method f4646f = null;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f4647g = false;

    public static boolean L(Object obj, String str, int i3, boolean z3) {
        M();
        try {
            return ((Boolean) f4645e.invoke(obj, str, Integer.valueOf(i3), Boolean.valueOf(z3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static void M() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f4647g) {
            return;
        }
        f4647g = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            Log.e("TypefaceCompatApi21Impl", e3.getClass().getName(), e3);
            method = null;
            cls = null;
            method2 = null;
        }
        f4644d = constructor;
        f4643c = cls;
        f4645e = method2;
        f4646f = method;
    }

    @Override // S0.a
    public Typeface i(Context context, C0484b c0484b, Resources resources, int i3) {
        M();
        try {
            Object newInstance = f4644d.newInstance(null);
            for (C0485c c0485c : c0484b.f4607a) {
                File E3 = AbstractC0102a.E(context);
                if (E3 == null) {
                    return null;
                }
                try {
                    if (!AbstractC0102a.q(E3, resources, c0485c.f4613f)) {
                        return null;
                    }
                    if (!L(newInstance, E3.getPath(), c0485c.f4609b, c0485c.f4610c)) {
                        return null;
                    }
                    E3.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    E3.delete();
                }
            }
            M();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f4643c, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f4646f.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e3) {
                throw new RuntimeException(e3);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // S0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Typeface j(android.content.Context r4, A.m[] r5, int r6) {
        /*
            r3 = this;
            int r0 = r5.length
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L7
            goto La1
        L7:
            A.m r5 = S0.a.t(r5, r6)
            android.content.ContentResolver r6 = r4.getContentResolver()
            android.net.Uri r5 = r5.f35a     // Catch: java.io.IOException -> La1
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r5 = r6.openFileDescriptor(r5, r0, r2)     // Catch: java.io.IOException -> La1
            if (r5 != 0) goto L1f
            if (r5 == 0) goto La1
            r5.close()     // Catch: java.io.IOException -> La1
            return r2
        L1f:
            java.lang.String r6 = "/proc/self/fd/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            r0.<init>(r6)     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            int r6 = r5.getFd()     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            r0.append(r6)     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            java.lang.String r6 = r0.toString()     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            java.lang.String r6 = android.system.Os.readlink(r6)     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            android.system.StructStat r0 = android.system.Os.stat(r6)     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            int r0 = r0.st_mode     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            boolean r0 = android.system.OsConstants.S_ISREG(r0)     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            if (r0 == 0) goto L47
            java.io.File r0 = new java.io.File     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            r0.<init>(r6)     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            goto L48
        L47:
            r0 = r2
        L48:
            if (r0 == 0) goto L5b
            boolean r6 = r0.canRead()     // Catch: java.lang.Throwable -> L59
            if (r6 != 0) goto L51
            goto L5b
        L51:
            android.graphics.Typeface r4 = android.graphics.Typeface.createFromFile(r0)     // Catch: java.lang.Throwable -> L59
            r5.close()     // Catch: java.io.IOException -> La1
            return r4
        L59:
            r4 = move-exception
            goto L98
        L5b:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L59
            java.io.FileDescriptor r0 = r5.getFileDescriptor()     // Catch: java.lang.Throwable -> L59
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L59
            java.io.File r4 = a.AbstractC0102a.E(r4)     // Catch: java.lang.Throwable -> L8e
            if (r4 != 0) goto L6c
        L6a:
            r0 = r2
            goto L87
        L6c:
            boolean r0 = a.AbstractC0102a.r(r4, r6)     // Catch: java.lang.RuntimeException -> L72 java.lang.Throwable -> L82
            if (r0 != 0) goto L76
        L72:
            r4.delete()     // Catch: java.lang.Throwable -> L8e
            goto L6a
        L76:
            java.lang.String r0 = r4.getPath()     // Catch: java.lang.RuntimeException -> L72 java.lang.Throwable -> L82
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromFile(r0)     // Catch: java.lang.RuntimeException -> L72 java.lang.Throwable -> L82
            r4.delete()     // Catch: java.lang.Throwable -> L8e
            goto L87
        L82:
            r0 = move-exception
            r4.delete()     // Catch: java.lang.Throwable -> L8e
            throw r0     // Catch: java.lang.Throwable -> L8e
        L87:
            r6.close()     // Catch: java.lang.Throwable -> L59
            r5.close()     // Catch: java.io.IOException -> La1
            return r0
        L8e:
            r4 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> L93
            goto L97
        L93:
            r6 = move-exception
            r4.addSuppressed(r6)     // Catch: java.lang.Throwable -> L59
        L97:
            throw r4     // Catch: java.lang.Throwable -> L59
        L98:
            r5.close()     // Catch: java.lang.Throwable -> L9c
            goto La0
        L9c:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch: java.io.IOException -> La1
        La0:
            throw r4     // Catch: java.io.IOException -> La1
        La1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: w.f.j(android.content.Context, A.m[], int):android.graphics.Typeface");
    }
}

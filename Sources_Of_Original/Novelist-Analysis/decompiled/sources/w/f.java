package w;

import A.m;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class f extends S0.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class f4643c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Constructor f4644d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f4645e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Method f4646f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f4647g = false;

    public static boolean L(Object obj, String str, int i3, boolean z3) throws NoSuchMethodException {
        M();
        try {
            return ((Boolean) f4645e.invoke(obj, str, Integer.valueOf(i3), Boolean.valueOf(z3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static void M() throws NoSuchMethodException {
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
    public Typeface i(Context context, p060v.b bVar, Resources resources, int i3) throws NoSuchMethodException {
        M();
        try {
            Object objNewInstance = f4644d.newInstance(null);
            for (p060v.c cVar : bVar.f4607a) {
                File fileE = p000a.a.E(context);
                if (fileE == null) {
                    return null;
                }
                try {
                    if (!p000a.a.q(fileE, resources, cVar.f4613f)) {
                        return null;
                    }
                    if (!L(objNewInstance, fileE.getPath(), cVar.f4609b, cVar.f4610c)) {
                        return null;
                    }
                    fileE.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileE.delete();
                }
            }
            M();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f4643c, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f4646f.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e3) {
                throw new RuntimeException(e3);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // S0.a
    public Typeface j(Context context, m[] mVarArr, int i3) {
        File file;
        Typeface typefaceCreateFromFile;
        if (mVarArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(S0.a.t(mVarArr, i3).f35a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                            file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (ErrnoException unused) {
                    }
                    if (file != null && file.canRead()) {
                        Typeface typefaceCreateFromFile2 = Typeface.createFromFile(file);
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile2;
                    }
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        File fileE = p000a.a.E(context);
                        if (fileE == null) {
                            typefaceCreateFromFile = null;
                        } else {
                            try {
                                if (p000a.a.r(fileE, fileInputStream)) {
                                    typefaceCreateFromFile = Typeface.createFromFile(fileE.getPath());
                                    fileE.delete();
                                } else {
                                    fileE.delete();
                                    typefaceCreateFromFile = null;
                                }
                            } catch (RuntimeException unused2) {
                            } catch (Throwable th3) {
                                fileE.delete();
                                throw th3;
                            }
                        }
                        fileInputStream.close();
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile;
                    } catch (Throwable th4) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused3) {
            }
        }
        return null;
    }
}

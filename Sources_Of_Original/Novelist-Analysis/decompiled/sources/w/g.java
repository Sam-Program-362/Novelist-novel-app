package w;

import A.m;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g extends S0.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class f4648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Constructor f4649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Method f4650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Method f4651f;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            Log.e("TypefaceCompatApi24Impl", e3.getClass().getName(), e3);
            cls = null;
            method = null;
            method2 = null;
        }
        f4649d = constructor;
        f4648c = cls;
        f4650e = method2;
        f4651f = method;
    }

    public static boolean L(Object obj, ByteBuffer byteBuffer, int i3, int i4, boolean z3) {
        try {
            return ((Boolean) f4650e.invoke(obj, byteBuffer, Integer.valueOf(i3), null, Integer.valueOf(i4), Boolean.valueOf(z3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface M(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f4648c, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f4651f.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // S0.a
    public final Typeface i(Context context, p060v.b bVar, Resources resources, int i3) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = f4649d.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (p060v.c cVar : bVar.f4607a) {
                int i4 = cVar.f4613f;
                File fileE = p000a.a.E(context);
                if (fileE != null) {
                    try {
                        if (p000a.a.q(fileE, resources, i4)) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(fileE);
                                try {
                                    FileChannel channel = fileInputStream.getChannel();
                                    map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                    fileInputStream.close();
                                    fileE.delete();
                                } catch (Throwable th) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (IOException unused2) {
                                map = null;
                            }
                        } else {
                            fileE.delete();
                        }
                        if (map != null && L(objNewInstance, map, cVar.f4612e, cVar.f4609b, cVar.f4610c)) {
                        }
                    } catch (Throwable th3) {
                        fileE.delete();
                        throw th3;
                    }
                }
                map = null;
                if (map != null) {
                }
            }
            return M(objNewInstance);
        }
        return null;
    }

    @Override // S0.a
    public final Typeface j(Context context, m[] mVarArr, int i3) {
        Object objNewInstance;
        try {
            objNewInstance = f4649d.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            p042o.j jVar = new p042o.j(0);
            for (m mVar : mVarArr) {
                Uri uri = mVar.f35a;
                ByteBuffer byteBufferK = (ByteBuffer) jVar.get(uri);
                if (byteBufferK == null) {
                    byteBufferK = p000a.a.K(context, uri);
                    jVar.put(uri, byteBufferK);
                }
                if (byteBufferK != null && L(objNewInstance, byteBufferK, mVar.f36b, mVar.f37c, mVar.f38d)) {
                }
            }
            Typeface typefaceM = M(objNewInstance);
            if (typefaceM != null) {
                return Typeface.create(typefaceM, i3);
            }
        }
        return null;
    }
}

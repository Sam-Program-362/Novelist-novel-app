package w;

import A.m;
import a.AbstractC0102a;
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
import v.C0484b;
import v.C0485c;

/* loaded from: classes.dex */
public final class g extends S0.a {

    /* renamed from: c, reason: collision with root package name */
    public static final Class f4648c;

    /* renamed from: d, reason: collision with root package name */
    public static final Constructor f4649d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f4650e;

    /* renamed from: f, reason: collision with root package name */
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
            Object newInstance = Array.newInstance((Class<?>) f4648c, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f4651f.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // S0.a
    public final Typeface i(Context context, C0484b c0484b, Resources resources, int i3) {
        Object obj;
        int i4;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = f4649d.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (C0485c c0485c : c0484b.f4607a) {
                int i5 = c0485c.f4613f;
                File E3 = AbstractC0102a.E(context);
                if (E3 != null) {
                    try {
                        if (AbstractC0102a.q(E3, resources, i5)) {
                            try {
                                fileInputStream = new FileInputStream(E3);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                i4 = (mappedByteBuffer != null && L(obj, mappedByteBuffer, c0485c.f4612e, c0485c.f4609b, c0485c.f4610c)) ? i4 + 1 : 0;
                            } finally {
                            }
                        }
                    } finally {
                        E3.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer != null) {
                }
            }
            return M(obj);
        }
        return null;
    }

    @Override // S0.a
    public final Typeface j(Context context, m[] mVarArr, int i3) {
        Object obj;
        try {
            obj = f4649d.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            int i4 = 0;
            o.j jVar = new o.j(0);
            int length = mVarArr.length;
            while (true) {
                if (i4 < length) {
                    m mVar = mVarArr[i4];
                    Uri uri = mVar.f35a;
                    ByteBuffer byteBuffer = (ByteBuffer) jVar.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = AbstractC0102a.K(context, uri);
                        jVar.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null || !L(obj, byteBuffer, mVar.f36b, mVar.f37c, mVar.f38d)) {
                        break;
                    }
                    i4++;
                } else {
                    Typeface M2 = M(obj);
                    if (M2 != null) {
                        return Typeface.create(M2, i3);
                    }
                }
            }
        }
        return null;
    }
}

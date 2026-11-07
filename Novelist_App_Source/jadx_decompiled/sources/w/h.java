package w;

import A.m;
import a.AbstractC0102a;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import v.C0484b;
import v.C0485c;

/* loaded from: classes.dex */
public class h extends f {

    /* renamed from: h, reason: collision with root package name */
    public final Class f4652h;

    /* renamed from: i, reason: collision with root package name */
    public final Constructor f4653i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f4654j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f4655k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f4656l;

    /* renamed from: m, reason: collision with root package name */
    public final Method f4657m;
    public final Method n;

    public h() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = Q(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = R(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e3.getClass().getName()), e3);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f4652h = cls;
        this.f4653i = constructor;
        this.f4654j = method2;
        this.f4655k = method3;
        this.f4656l = method4;
        this.f4657m = method5;
        this.n = method;
    }

    public static Method Q(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean N(Context context, Object obj, String str, int i3, int i4, int i5, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f4654j.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface O(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f4652h, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.n.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean P(Object obj) {
        try {
            return ((Boolean) this.f4656l.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method R(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // w.f, S0.a
    public final Typeface i(Context context, C0484b c0484b, Resources resources, int i3) {
        Object obj;
        Method method = this.f4654j;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.i(context, c0484b, resources, i3);
        }
        try {
            obj = this.f4653i.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            C0485c[] c0485cArr = c0484b.f4607a;
            int length = c0485cArr.length;
            int i4 = 0;
            while (true) {
                if (i4 < length) {
                    C0485c c0485c = c0485cArr[i4];
                    Context context2 = context;
                    if (N(context2, obj, c0485c.f4608a, c0485c.f4612e, c0485c.f4609b, c0485c.f4610c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0485c.f4611d))) {
                        i4++;
                        context = context2;
                    } else {
                        try {
                            this.f4657m.invoke(obj, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                } else if (P(obj)) {
                    return O(obj);
                }
            }
        }
        return null;
    }

    @Override // w.f, S0.a
    public final Typeface j(Context context, m[] mVarArr, int i3) {
        Object obj;
        Typeface O2;
        boolean z3;
        if (mVarArr.length >= 1) {
            Method method = this.f4654j;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap hashMap = new HashMap();
                    for (m mVar : mVarArr) {
                        if (mVar.f40f == 0) {
                            Uri uri = mVar.f35a;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, AbstractC0102a.K(context, uri));
                            }
                        }
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                    try {
                        obj = this.f4653i.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = mVarArr.length;
                        int i4 = 0;
                        boolean z4 = false;
                        while (true) {
                            Method method2 = this.f4657m;
                            if (i4 < length) {
                                m mVar2 = mVarArr[i4];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(mVar2.f35a);
                                if (byteBuffer != null) {
                                    try {
                                        z3 = ((Boolean) this.f4655k.invoke(obj, byteBuffer, Integer.valueOf(mVar2.f36b), null, Integer.valueOf(mVar2.f37c), Integer.valueOf(mVar2.f38d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        z3 = false;
                                    }
                                    if (!z3) {
                                        method2.invoke(obj, null);
                                        break;
                                    }
                                    z4 = true;
                                }
                                i4++;
                                z4 = z4;
                            } else if (!z4) {
                                method2.invoke(obj, null);
                            } else if (P(obj) && (O2 = O(obj)) != null) {
                                return Typeface.create(O2, i3);
                            }
                        }
                    }
                } else {
                    m t3 = S0.a.t(mVarArr, i3);
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(t3.f35a, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(t3.f37c).setItalic(t3.f38d).build();
                            openFileDescriptor.close();
                            return build;
                        } finally {
                        }
                    }
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // S0.a
    public final Typeface l(Context context, Resources resources, int i3, String str, int i4) {
        Object obj;
        Method method = this.f4654j;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.l(context, resources, i3, str, i4);
        }
        try {
            obj = this.f4653i.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            if (!N(context, obj, str, 0, -1, -1, null)) {
                try {
                    this.f4657m.invoke(obj, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (P(obj)) {
                return O(obj);
            }
        }
        return null;
    }
}

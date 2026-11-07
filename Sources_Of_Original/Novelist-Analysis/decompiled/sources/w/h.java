package w;

import A.m;
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

/* JADX INFO: loaded from: classes.dex */
public class h extends f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Class f4652h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Constructor f4653i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Method f4654j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Method f4655k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Method f4656l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Method f4657m;
    public final Method n;

    public h() throws NoSuchMethodException {
        Method methodR;
        Constructor<?> constructor;
        Method methodQ;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodQ = Q(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodR = R(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e3.getClass().getName()), e3);
            methodR = null;
            constructor = null;
            methodQ = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f4652h = cls;
        this.f4653i = constructor;
        this.f4654j = methodQ;
        this.f4655k = method;
        this.f4656l = method2;
        this.f4657m = method3;
        this.n = methodR;
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
            Object objNewInstance = Array.newInstance((Class<?>) this.f4652h, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.n.invoke(null, objNewInstance, -1, -1);
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

    public Method R(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // w.f, S0.a
    public final Typeface i(Context context, p060v.b bVar, Resources resources, int i3) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.f4654j;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.i(context, bVar, resources, i3);
        }
        try {
            objNewInstance = this.f4653i.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            p060v.c[] cVarArr = bVar.f4607a;
            int length = cVarArr.length;
            int i4 = 0;
            while (i4 < length) {
                p060v.c cVar = cVarArr[i4];
                Context context2 = context;
                if (N(context2, objNewInstance, cVar.f4608a, cVar.f4612e, cVar.f4609b, cVar.f4610c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.f4611d))) {
                    i4++;
                    context = context2;
                } else {
                    try {
                        this.f4657m.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
            if (P(objNewInstance)) {
                return O(objNewInstance);
            }
        }
        return null;
    }

    @Override // w.f, S0.a
    public final Typeface j(Context context, m[] mVarArr, int i3) throws IOException {
        Object objNewInstance;
        Typeface typefaceO;
        boolean zBooleanValue;
        if (mVarArr.length >= 1) {
            Method method = this.f4654j;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (m mVar : mVarArr) {
                        if (mVar.f40f == 0) {
                            Uri uri = mVar.f35a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, p000a.a.K(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.f4653i.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = mVarArr.length;
                        int i4 = 0;
                        boolean z3 = false;
                        while (true) {
                            Method method2 = this.f4657m;
                            if (i4 >= length) {
                                if (!z3) {
                                    method2.invoke(objNewInstance, null);
                                    break;
                                }
                                if (!P(objNewInstance) || (typefaceO = O(objNewInstance)) == null) {
                                    break;
                                    break;
                                }
                                return Typeface.create(typefaceO, i3);
                            }
                            m mVar2 = mVarArr[i4];
                            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(mVar2.f35a);
                            if (byteBuffer != null) {
                                try {
                                    zBooleanValue = ((Boolean) this.f4655k.invoke(objNewInstance, byteBuffer, Integer.valueOf(mVar2.f36b), null, Integer.valueOf(mVar2.f37c), Integer.valueOf(mVar2.f38d ? 1 : 0))).booleanValue();
                                } catch (IllegalAccessException | InvocationTargetException unused2) {
                                    zBooleanValue = false;
                                }
                                if (!zBooleanValue) {
                                    method2.invoke(objNewInstance, null);
                                    break;
                                }
                                z3 = true;
                            }
                            i4++;
                            z3 = z3;
                        }
                    }
                } else {
                    m mVarT = S0.a.t(mVarArr, i3);
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(mVarT.f35a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(mVarT.f37c).setItalic(mVarT.f38d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // S0.a
    public final Typeface l(Context context, Resources resources, int i3, String str, int i4) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.f4654j;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.l(context, resources, i3, str, i4);
        }
        try {
            objNewInstance = this.f4653i.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            if (!N(context, objNewInstance, str, 0, -1, -1, null)) {
                try {
                    this.f4657m.invoke(objNewInstance, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (P(objNewInstance)) {
                return O(objNewInstance);
            }
        }
        return null;
    }
}

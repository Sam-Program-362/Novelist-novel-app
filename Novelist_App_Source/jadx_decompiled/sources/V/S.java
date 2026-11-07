package V;

import h2.AbstractC0273d;
import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import org.apache.tika.utils.StringUtils;
import t0.C0472a;

/* loaded from: classes.dex */
public final class S extends a2.i implements Z1.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1358l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1359m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S(Object obj, int i3) {
        super(0);
        this.f1358l = i3;
        this.f1359m = obj;
    }

    @Override // Z1.a
    public final Object a() {
        switch (this.f1358l) {
            case 0:
                Object obj = T.f1361d;
                File file = (File) this.f1359m;
                synchronized (obj) {
                    T.f1360c.remove(file.getAbsolutePath());
                }
                return O1.g.f1211a;
            case 1:
                File file2 = (File) ((X.b) this.f1359m).a();
                String name = file2.getName();
                a2.h.d(name, "getName(...)");
                if (AbstractC0273d.h0(name, '.', StringUtils.EMPTY).equals("preferences_pb")) {
                    File absoluteFile = file2.getAbsoluteFile();
                    a2.h.d(absoluteFile, "file.absoluteFile");
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + file2 + " does not match required extension for Preferences file: preferences_pb").toString());
            case 2:
                return androidx.lifecycle.L.e((androidx.lifecycle.T) this.f1359m);
            case 3:
                C0472a c0472a = (C0472a) this.f1359m;
                Class<?> loadClass = c0472a.f4546a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                a2.h.d(loadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                Method declaredMethod = loadClass.getDeclaredMethod("getWindowExtensions", null);
                Class<?> loadClass2 = c0472a.f4546a.loadClass("androidx.window.extensions.WindowExtensions");
                a2.h.d(loadClass2, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                a2.h.d(declaredMethod, "getWindowExtensionsMethod");
                return Boolean.valueOf(declaredMethod.getReturnType().equals(loadClass2) && Modifier.isPublic(declaredMethod.getModifiers()));
            default:
                u0.h hVar = (u0.h) this.f1359m;
                return BigInteger.valueOf(hVar.f4602k).shiftLeft(32).or(BigInteger.valueOf(hVar.f4603l)).shiftLeft(32).or(BigInteger.valueOf(hVar.f4604m));
        }
    }
}

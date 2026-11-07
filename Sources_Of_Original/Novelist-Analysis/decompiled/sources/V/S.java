package V;

import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public final class S extends a2.i implements Z1.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1358l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1359m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S(Object obj, int i3) {
        super(0);
        this.f1358l = i3;
        this.f1359m = obj;
    }

    @Override // Z1.a
    public final Object a() throws NoSuchMethodException, ClassNotFoundException {
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
                if (p024h2.d.h0(name, '.', StringUtils.EMPTY).equals("preferences_pb")) {
                    File absoluteFile = file2.getAbsoluteFile();
                    a2.h.d(absoluteFile, "file.absoluteFile");
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + file2 + " does not match required extension for Preferences file: preferences_pb").toString());
            case 2:
                return androidx.lifecycle.L.e((androidx.lifecycle.T) this.f1359m);
            case 3:
                p056t0.a aVar = (p056t0.a) this.f1359m;
                Class<?> clsLoadClass = aVar.f4546a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                a2.h.d(clsLoadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                Method declaredMethod = clsLoadClass.getDeclaredMethod("getWindowExtensions", null);
                Class<?> clsLoadClass2 = aVar.f4546a.loadClass("androidx.window.extensions.WindowExtensions");
                a2.h.d(clsLoadClass2, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                a2.h.d(declaredMethod, "getWindowExtensionsMethod");
                return Boolean.valueOf(declaredMethod.getReturnType().equals(clsLoadClass2) && Modifier.isPublic(declaredMethod.getModifiers()));
            default:
                p058u0.h hVar = (p058u0.h) this.f1359m;
                return BigInteger.valueOf(hVar.f4602k).shiftLeft(32).or(BigInteger.valueOf(hVar.f4603l)).shiftLeft(32).or(BigInteger.valueOf(hVar.f4604m));
        }
    }
}

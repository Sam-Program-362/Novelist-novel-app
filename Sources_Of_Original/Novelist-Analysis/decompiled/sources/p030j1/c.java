package p030j1;

import C1.g;
import C1.o;
import O1.b;
import P1.p;
import a2.h;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import i2.A;
import i2.AbstractC0212u;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.tika.utils.StringUtils;
import p000a.a;
import p2.d;
import p2.e;

/* JADX INFO: loaded from: classes.dex */
public final class c implements o {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f3551t = (e.class.hashCode() + 43) & 65535;
    public static final int u = (e.class.hashCode() + 83) & 65535;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Activity f3552k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public B1.o f3553l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f3554m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f3555o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3556p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f3557q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public g f3558r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public byte[] f3559s;

    public c(Activity activity) {
        h.e(activity, "activity");
        this.f3552k = activity;
        this.f3553l = null;
    }

    @Override // C1.o
    public final boolean a(int i3, int i4, Intent intent) throws IllegalAccessException, InvocationTargetException {
        int i5 = u;
        Activity activity = this.f3552k;
        if (i3 == i5) {
            if (i4 == -1) {
                Uri data = intent != null ? intent.getData() : null;
                if (data != null) {
                    b(true);
                    try {
                        byte[] bArr = this.f3559s;
                        h.e(activity, "context");
                        OutputStream outputStreamOpenOutputStream = activity.getContentResolver().openOutputStream(data);
                        if (outputStreamOpenOutputStream != null) {
                            if (bArr != null) {
                                try {
                                    outputStreamOpenOutputStream.write(bArr);
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        a.m(outputStreamOpenOutputStream, th);
                                        throw th2;
                                    }
                                }
                            }
                            outputStreamOpenOutputStream.close();
                        }
                        d(data.getPath());
                        return true;
                    } catch (IOException e3) {
                        Log.e("FilePickerDelegate", "Error while saving file", e3);
                        c("Error while saving file", e3.getMessage());
                    }
                }
                return false;
            }
            if (i4 == 0) {
                d(null);
                return false;
            }
        } else {
            if (i3 != f3551t) {
                c("unknown_activity", "Unknown activity error, please file an issue.");
                return false;
            }
            if (i4 == -1) {
                b(true);
                int i6 = this.f3556p;
                boolean z3 = this.n;
                String str = this.f3555o;
                if (str == null) {
                    str = StringUtils.EMPTY;
                }
                String str2 = str;
                h.e(activity, "activity");
                e eVar = A.f2964a;
                AbstractC0212u.g(AbstractC0212u.a(d.f4262m), new g(intent, this, activity, i6, z3, str2, null));
                return true;
            }
            if (i4 == 0) {
                d(null);
                return true;
            }
        }
        return false;
    }

    public final void b(final boolean z3) {
        if (this.f3558r == null || h.a(this.f3555o, "dir")) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: j1.b
            @Override // java.lang.Runnable
            public final void run() {
                g gVar = this.f3549k.f3558r;
                if (gVar != null) {
                    gVar.a(Boolean.valueOf(z3));
                }
            }
        });
    }

    public final void c(String str, String str2) {
        b(false);
        B1.o oVar = this.f3553l;
        if (oVar != null) {
            oVar.a(str, str2, null);
        }
        this.f3553l = null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0014  */
    /* JADX WARN: Code duplicated, block: B:13:0x0018  */
    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    /* JADX WARN: Code duplicated, block: B:16:0x001e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0029  */
    /* JADX WARN: Code duplicated, block: B:20:0x0033  */
    /* JADX WARN: Code duplicated, block: B:21:0x0036  */
    /* JADX WARN: Code duplicated, block: B:23:0x0039  */
    /* JADX WARN: Code duplicated, block: B:24:0x0080  */
    /* JADX WARN: Code duplicated, block: B:27:0x0087  */
    /* JADX WARN: Code duplicated, block: B:31:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0027 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [B1.o] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void d(Serializable serializable) {
        ArrayList arrayList;
        ?? arrayList2;
        int size;
        Object obj;
        a aVar;
        HashMap map;
        int i3 = 0;
        b(false);
        ?? r3 = this.f3553l;
        if (r3 != 0) {
            if (serializable == null) {
                if (serializable instanceof ArrayList) {
                    arrayList = (ArrayList) serializable;
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    arrayList2 = new ArrayList();
                    size = arrayList.size();
                    while (i3 < size) {
                        obj = arrayList.get(i3);
                        i3++;
                        if (obj instanceof a) {
                            aVar = (a) obj;
                        } else {
                            aVar = null;
                        }
                        if (aVar != null) {
                            b[] bVarArr = {new b("path", aVar.f3544a), new b("name", aVar.f3545b), new b("size", Long.valueOf(aVar.f3547d)), new b("bytes", aVar.f3548e), new b("identifier", String.valueOf(aVar.f3546c))};
                            map = new HashMap(p.S(5));
                            p.T(map, bVarArr);
                        } else {
                            map = null;
                        }
                        if (map != null) {
                            arrayList2.add(map);
                        }
                    }
                } else {
                    arrayList2 = 0;
                }
            } else {
                arrayList2 = serializable instanceof String ? serializable : 0;
                if (arrayList2 == 0) {
                    if (serializable instanceof ArrayList) {
                        arrayList = (ArrayList) serializable;
                    } else {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        arrayList2 = new ArrayList();
                        size = arrayList.size();
                        while (i3 < size) {
                            obj = arrayList.get(i3);
                            i3++;
                            if (obj instanceof a) {
                                aVar = (a) obj;
                            } else {
                                aVar = null;
                            }
                            if (aVar != null) {
                                b[] bVarArr2 = {new b("path", aVar.f3544a), new b("name", aVar.f3545b), new b("size", Long.valueOf(aVar.f3547d)), new b("bytes", aVar.f3548e), new b("identifier", String.valueOf(aVar.f3546c))};
                                map = new HashMap(p.S(5));
                                p.T(map, bVarArr2);
                            } else {
                                map = null;
                            }
                            if (map != null) {
                                arrayList2.add(map);
                            }
                        }
                    } else {
                        arrayList2 = 0;
                    }
                }
            }
            r3.d(arrayList2);
            this.f3553l = null;
        }
    }
}

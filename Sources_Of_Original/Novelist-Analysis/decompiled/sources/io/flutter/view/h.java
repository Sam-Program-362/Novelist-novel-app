package io.flutter.view;

import android.graphics.Rect;
import android.opengl.Matrix;
import android.text.SpannableString;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f3292A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f3293B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f3294C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public String f3295D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f3296E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f3297F;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public long f3300I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f3301J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f3302K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f3303L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public float f3304M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public String f3305N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public String f3306O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public float f3307P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public float f3308Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public float f3309R;
    public float S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public float[] f3310T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public float[] f3311U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public h f3312V;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public ArrayList f3314Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public g f3315Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f3316a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public g f3317a0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f3320c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public float[] f3321c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3324e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public float[] f3325e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3326f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Rect f3327f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3328g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3329h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3330i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3331j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3332k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f3333l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f3334m;
    public float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f3335o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f3336p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f3337q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f3338r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List f3339s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f3340t;
    public ArrayList u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f3341v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f3342w;
    public String x;
    public ArrayList y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f3343z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3318b = -1;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f3298G = -1;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f3299H = false;
    public final ArrayList W = new ArrayList();

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final ArrayList f3313X = new ArrayList();

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f3319b0 = true;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f3323d0 = true;

    public h(i iVar) {
        this.f3316a = iVar;
    }

    public static boolean a(h hVar, f fVar) {
        return (hVar.f3322d & fVar.f3286k) != 0;
    }

    public static CharSequence b(h hVar) {
        B1.s sVar = new B1.s();
        sVar.f144k = hVar.f3338r;
        sVar.f146m = hVar.f3339s;
        sVar.f145l = hVar.d();
        SpannableString spannableStringE = sVar.e();
        B1.s sVar2 = new B1.s();
        sVar2.f144k = hVar.f3336p;
        sVar2.f146m = hVar.f3337q;
        sVar2.n = hVar.f3292A;
        sVar2.f145l = hVar.d();
        SpannableString spannableStringE2 = sVar2.e();
        B1.s sVar3 = new B1.s();
        sVar3.f144k = hVar.x;
        sVar3.f146m = hVar.y;
        sVar3.f145l = hVar.d();
        CharSequence[] charSequenceArr = {spannableStringE, spannableStringE2, sVar3.e()};
        CharSequence charSequenceConcat = null;
        for (int i3 = 0; i3 < 3; i3++) {
            CharSequence charSequence = charSequenceArr[i3];
            if (charSequence != null && charSequence.length() > 0) {
                charSequenceConcat = (charSequenceConcat == null || charSequenceConcat.length() == 0) ? charSequence : TextUtils.concat(charSequenceConcat, ", ", charSequence);
            }
        }
        return charSequenceConcat;
    }

    public static ArrayList f(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
        int i3 = byteBuffer.getInt();
        if (i3 == -1) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = byteBuffer.getInt();
            int i6 = byteBuffer.getInt();
            int i7 = X.j.b(2)[byteBuffer.getInt()];
            int iA = X.j.a(i7);
            if (iA == 0) {
                byteBuffer.getInt();
                k kVar = new k();
                kVar.f3366a = i5;
                kVar.f3367b = i6;
                kVar.f3368c = i7;
                arrayList.add(kVar);
            } else if (iA == 1) {
                ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                j jVar = new j();
                jVar.f3366a = i5;
                jVar.f3367b = i6;
                jVar.f3368c = i7;
                jVar.f3365d = StandardCharsets.UTF_8.decode(byteBuffer2).toString();
                arrayList.add(jVar);
            }
        }
        return arrayList;
    }

    public static void k(float[] fArr, float[] fArr2, float[] fArr3) {
        Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
        float f3 = fArr[3];
        fArr[0] = fArr[0] / f3;
        fArr[1] = fArr[1] / f3;
        fArr[2] = fArr[2] / f3;
        fArr[3] = 0.0f;
    }

    public final void c(ArrayList arrayList) {
        if (h(12)) {
            arrayList.add(this);
        }
        ArrayList arrayList2 = this.W;
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            ((h) obj).c(arrayList);
        }
    }

    public final String d() {
        String str = this.f3293B;
        return (str == null || str.isEmpty()) ? this.f3316a.f3356m : this.f3293B;
    }

    public final String e() {
        String str;
        if (h(13) && (str = this.f3336p) != null && !str.isEmpty()) {
            return this.f3336p;
        }
        ArrayList arrayList = this.W;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            String strE = ((h) obj).e();
            if (strE != null && !strE.isEmpty()) {
                return strE;
            }
        }
        return null;
    }

    public final boolean g(int i3) {
        return (this.f3300I & ((long) B1.e.e(i3))) != 0;
    }

    public final boolean h(int i3) {
        return (this.f3320c & ((long) B1.e.e(i3))) != 0;
    }

    public final h i(float[] fArr, boolean z3) {
        float f3 = fArr[3];
        boolean z4 = false;
        float f4 = fArr[0] / f3;
        float f5 = fArr[1] / f3;
        if (f4 < this.f3307P || f4 >= this.f3309R || f5 < this.f3308Q || f5 >= this.S) {
            return null;
        }
        float[] fArr2 = new float[4];
        ArrayList arrayList = this.f3313X;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            int i4 = i3 + 1;
            h hVar = (h) arrayList.get(i3);
            if (!hVar.h(14)) {
                if (hVar.f3319b0) {
                    hVar.f3319b0 = false;
                    if (hVar.f3321c0 == null) {
                        hVar.f3321c0 = new float[16];
                    }
                    if (!Matrix.invertM(hVar.f3321c0, 0, hVar.f3311U, 0)) {
                        Arrays.fill(hVar.f3321c0, 0.0f);
                    }
                }
                float[] fArr3 = fArr;
                Matrix.multiplyMV(fArr2, 0, hVar.f3321c0, 0, fArr3, 0);
                h hVarI = hVar.i(fArr2, z3);
                if (hVarI != null) {
                    return hVarI;
                }
                fArr = fArr3;
            }
            i3 = i4;
        }
        if (z3 && this.f3330i != -1) {
            z4 = true;
        }
        if (j() || z4) {
            return this;
        }
        return null;
    }

    public final boolean j() {
        if (h(12)) {
            return false;
        }
        if (h(22)) {
            return true;
        }
        if (h(32)) {
            return false;
        }
        int i3 = this.f3322d;
        int i4 = i.y;
        if ((i3 & (-61)) != 0 || (this.f3320c & ((long) 10682871)) != 0) {
            return true;
        }
        String str = this.f3336p;
        if (str != null && !str.isEmpty()) {
            return true;
        }
        String str2 = this.f3338r;
        if (str2 != null && !str2.isEmpty()) {
            return true;
        }
        String str3 = this.x;
        return (str3 == null || str3.isEmpty()) ? false : true;
    }

    public final void l(float[] fArr, HashSet hashSet, boolean z3) {
        hashSet.add(this);
        if (this.f3323d0) {
            z3 = true;
        }
        int i3 = 0;
        if (z3) {
            if (this.f3325e0 == null) {
                this.f3325e0 = new float[16];
            }
            if (this.f3310T == null) {
                this.f3310T = new float[16];
            }
            Matrix.multiplyMM(this.f3325e0, 0, fArr, 0, this.f3310T, 0);
            float[] fArr2 = {this.f3307P, this.f3308Q, 0.0f, 1.0f};
            float[] fArr3 = new float[4];
            float[] fArr4 = new float[4];
            float[] fArr5 = new float[4];
            float[] fArr6 = new float[4];
            k(fArr3, this.f3325e0, fArr2);
            fArr2[0] = this.f3309R;
            fArr2[1] = this.f3308Q;
            k(fArr4, this.f3325e0, fArr2);
            fArr2[0] = this.f3309R;
            fArr2[1] = this.S;
            k(fArr5, this.f3325e0, fArr2);
            fArr2[0] = this.f3307P;
            fArr2[1] = this.S;
            k(fArr6, this.f3325e0, fArr2);
            if (this.f3327f0 == null) {
                this.f3327f0 = new Rect();
            }
            this.f3327f0.set(Math.round(Math.min(fArr3[0], Math.min(fArr4[0], Math.min(fArr5[0], fArr6[0])))), Math.round(Math.min(fArr3[1], Math.min(fArr4[1], Math.min(fArr5[1], fArr6[1])))), Math.round(Math.max(fArr3[0], Math.max(fArr4[0], Math.max(fArr5[0], fArr6[0])))), Math.round(Math.max(fArr3[1], Math.max(fArr4[1], Math.max(fArr5[1], fArr6[1])))));
            this.f3323d0 = false;
        }
        ArrayList arrayList = this.W;
        int size = arrayList.size();
        int i4 = -1;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            h hVar = (h) obj;
            hVar.f3298G = i4;
            i4 = hVar.f3318b;
            hVar.l(this.f3325e0, hashSet, z3);
        }
    }
}

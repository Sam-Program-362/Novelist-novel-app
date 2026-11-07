package io.flutter.view;

import android.opengl.Matrix;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public final class c implements s1.k, s1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3261a;

    public /* synthetic */ c(Object obj) {
        this.f3261a = obj;
    }

    public void a(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        int i3;
        int i4;
        h hVar;
        h hVar2;
        int i5;
        int i6;
        h hVar3;
        String str;
        float f3;
        float f4;
        View l3;
        Integer num;
        View l4;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        for (ByteBuffer byteBuffer2 : byteBufferArr) {
            byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
        }
        i iVar = (i) this.f3261a;
        HashMap hashMap = iVar.f3350g;
        io.flutter.plugin.platform.k kVar = iVar.f3348e;
        ArrayList arrayList = iVar.f3359q;
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            i3 = 16;
            if (!byteBuffer.hasRemaining()) {
                break;
            }
            h c3 = iVar.c(byteBuffer.getInt());
            ArrayList arrayList3 = c3.f3313X;
            i iVar2 = c3.f3316a;
            c3.f3299H = true;
            c3.f3305N = c3.f3338r;
            c3.f3306O = c3.f3336p;
            c3.f3300I = c3.f3320c;
            c3.f3301J = c3.f3322d;
            c3.f3302K = c3.f3328g;
            c3.f3303L = c3.f3329h;
            c3.f3304M = c3.f3333l;
            c3.f3320c = byteBuffer.getLong();
            c3.f3322d = byteBuffer.getInt();
            c3.f3324e = byteBuffer.getInt();
            c3.f3326f = byteBuffer.getInt();
            c3.f3328g = byteBuffer.getInt();
            c3.f3329h = byteBuffer.getInt();
            c3.f3330i = byteBuffer.getInt();
            c3.f3331j = byteBuffer.getInt();
            c3.f3332k = byteBuffer.getInt();
            byteBuffer.getInt();
            c3.f3333l = byteBuffer.getFloat();
            c3.f3334m = byteBuffer.getFloat();
            c3.n = byteBuffer.getFloat();
            c3.f3296E = byteBuffer.getInt();
            c3.f3335o = i.d(byteBuffer, strArr);
            c3.f3336p = i.d(byteBuffer, strArr);
            c3.f3337q = h.f(byteBuffer, byteBufferArr);
            c3.f3338r = i.d(byteBuffer, strArr);
            c3.f3339s = h.f(byteBuffer, byteBufferArr);
            c3.f3340t = i.d(byteBuffer, strArr);
            c3.u = h.f(byteBuffer, byteBufferArr);
            c3.f3341v = i.d(byteBuffer, strArr);
            c3.f3342w = h.f(byteBuffer, byteBufferArr);
            c3.x = i.d(byteBuffer, strArr);
            c3.y = h.f(byteBuffer, byteBufferArr);
            c3.f3343z = i.d(byteBuffer, strArr);
            c3.f3292A = i.d(byteBuffer, strArr);
            c3.f3293B = i.d(byteBuffer, strArr);
            c3.f3294C = i.d(byteBuffer, strArr);
            c3.f3295D = i.d(byteBuffer, strArr);
            c3.f3297F = byteBuffer.getInt();
            byteBuffer.getInt();
            c3.f3307P = byteBuffer.getFloat();
            c3.f3308Q = byteBuffer.getFloat();
            c3.f3309R = byteBuffer.getFloat();
            c3.S = byteBuffer.getFloat();
            float[] fArr = c3.f3310T;
            if (fArr == null) {
                fArr = new float[16];
            }
            for (int i7 = 0; i7 < 16; i7++) {
                fArr[i7] = byteBuffer.getFloat();
            }
            c3.f3310T = fArr;
            float[] fArr2 = c3.f3311U;
            if (fArr2 == null) {
                fArr2 = new float[16];
            }
            for (int i8 = 0; i8 < 16; i8++) {
                fArr2[i8] = byteBuffer.getFloat();
            }
            c3.f3311U = fArr2;
            c3.f3319b0 = true;
            c3.f3323d0 = true;
            int i9 = byteBuffer.getInt();
            ArrayList arrayList4 = c3.W;
            arrayList4.clear();
            for (int i10 = 0; i10 < i9; i10++) {
                h c4 = iVar2.c(byteBuffer.getInt());
                c4.f3312V = c3;
                arrayList4.add(c4);
            }
            int i11 = byteBuffer.getInt();
            arrayList3.clear();
            for (int i12 = 0; i12 < i11; i12++) {
                h c5 = iVar2.c(byteBuffer.getInt());
                c5.f3312V = c3;
                arrayList3.add(c5);
            }
            int i13 = byteBuffer.getInt();
            if (i13 == 0) {
                c3.f3314Y = null;
            } else {
                ArrayList arrayList5 = c3.f3314Y;
                if (arrayList5 == null) {
                    c3.f3314Y = new ArrayList(i13);
                } else {
                    arrayList5.clear();
                }
                for (int i14 = 0; i14 < i13; i14++) {
                    g b3 = iVar2.b(byteBuffer.getInt());
                    int i15 = b3.f3289c;
                    if (i15 == 1) {
                        c3.f3315Z = b3;
                    } else if (i15 == 2) {
                        c3.f3317a0 = b3;
                    } else {
                        c3.f3314Y.add(b3);
                    }
                    c3.f3314Y.add(b3);
                }
            }
            if (!c3.h(14)) {
                if (c3.h(6)) {
                    iVar.n = c3;
                }
                if (c3.f3299H) {
                    arrayList2.add(c3);
                }
                int i16 = c3.f3330i;
                if (i16 != -1 && !kVar.g(i16) && (l4 = kVar.l(c3.f3330i)) != null) {
                    l4.setImportantForAccessibility(0);
                }
            }
        }
        HashSet hashSet = new HashSet();
        h hVar4 = (h) hashMap.get(0);
        ArrayList arrayList6 = new ArrayList();
        if (hVar4 != null) {
            float[] fArr3 = new float[16];
            Matrix.setIdentityM(fArr3, 0);
            hVar4.l(fArr3, hashSet, false);
            hVar4.c(arrayList6);
        }
        int size = arrayList6.size();
        h hVar5 = null;
        int i17 = 0;
        while (i17 < size) {
            Object obj = arrayList6.get(i17);
            i17++;
            h hVar6 = (h) obj;
            if (!arrayList.contains(Integer.valueOf(hVar6.f3318b))) {
                hVar5 = hVar6;
            }
        }
        if (hVar5 == null && !arrayList6.isEmpty()) {
            hVar5 = (h) arrayList6.get(arrayList6.size() - 1);
        }
        if (hVar5 != null && (hVar5.f3318b != iVar.f3360r || arrayList6.size() != arrayList.size())) {
            iVar.f3360r = hVar5.f3318b;
            String e3 = hVar5.e();
            if (e3 == null) {
                e3 = StringUtils.SPACE;
            }
            if (Build.VERSION.SDK_INT >= 28) {
                iVar.f3344a.setAccessibilityPaneTitle(e3);
            } else {
                AccessibilityEvent e4 = iVar.e(hVar5.f3318b, 32);
                e4.getText().add(e3);
                iVar.i(e4);
            }
        }
        arrayList.clear();
        int size2 = arrayList6.size();
        int i18 = 0;
        while (i18 < size2) {
            Object obj2 = arrayList6.get(i18);
            i18++;
            arrayList.add(Integer.valueOf(((h) obj2).f3318b));
        }
        Iterator it2 = hashMap.entrySet().iterator();
        while (true) {
            i4 = 4;
            if (!it2.hasNext()) {
                break;
            }
            h hVar7 = (h) ((Map.Entry) it2.next()).getValue();
            if (!hashSet.contains(hVar7)) {
                hVar7.f3312V = null;
                if (hVar7.f3330i != -1 && (num = iVar.f3353j) != null && iVar.f3347d.platformViewOfNode(num.intValue()) == kVar.l(hVar7.f3330i)) {
                    iVar.h(iVar.f3353j.intValue(), 65536);
                    iVar.f3353j = null;
                }
                int i19 = hVar7.f3330i;
                if (i19 != -1 && (l3 = kVar.l(i19)) != null) {
                    l3.setImportantForAccessibility(4);
                }
                h hVar8 = iVar.f3352i;
                if (hVar8 == hVar7) {
                    iVar.h(hVar8.f3318b, 65536);
                    iVar.f3352i = null;
                }
                if (iVar.n == hVar7) {
                    iVar.n = null;
                }
                if (iVar.f3358p == hVar7) {
                    iVar.f3358p = null;
                }
                it2.remove();
            }
        }
        int i20 = 2048;
        int i21 = 0;
        AccessibilityEvent e5 = iVar.e(0, 2048);
        e5.setContentChangeTypes(1);
        iVar.i(e5);
        int size3 = arrayList2.size();
        int i22 = 0;
        while (i22 < size3) {
            Object obj3 = arrayList2.get(i22);
            i22++;
            h hVar9 = (h) obj3;
            if (!Float.isNaN(hVar9.f3333l) && !Float.isNaN(hVar9.f3304M) && hVar9.f3304M != hVar9.f3333l) {
                AccessibilityEvent e6 = iVar.e(hVar9.f3318b, 4096);
                float f5 = hVar9.f3333l;
                float f6 = hVar9.f3334m;
                if (Float.isInfinite(f6)) {
                    if (f5 > 70000.0f) {
                        f5 = 70000.0f;
                    }
                    f6 = 100000.0f;
                }
                if (Float.isInfinite(hVar9.n)) {
                    f3 = f6 + 100000.0f;
                    if (f5 < -70000.0f) {
                        f5 = -70000.0f;
                    }
                    f4 = f5 + 100000.0f;
                } else {
                    float f7 = hVar9.n;
                    f3 = f6 - f7;
                    f4 = f5 - f7;
                }
                int i23 = hVar9.f3301J;
                if ((i23 & 16) != 0 || (i23 & 32) != 0) {
                    e6.setScrollY((int) f4);
                    e6.setMaxScrollY((int) f3);
                } else if ((i23 & 4) != 0 || (i23 & 8) != 0) {
                    e6.setScrollX((int) f4);
                    e6.setMaxScrollX((int) f3);
                }
                int i24 = hVar9.f3331j;
                if (i24 > 0) {
                    e6.setItemCount(i24);
                    e6.setFromIndex(hVar9.f3332k);
                    ArrayList arrayList7 = hVar9.f3313X;
                    int size4 = arrayList7.size();
                    int i25 = i21;
                    int i26 = i25;
                    while (i26 < size4) {
                        Object obj4 = arrayList7.get(i26);
                        i26++;
                        if (!((h) obj4).h(14)) {
                            i25++;
                        }
                    }
                    e6.setToIndex((hVar9.f3332k + i25) - 1);
                }
                iVar.i(e6);
            }
            if (hVar9.h(i3) && (((str = hVar9.f3336p) != null || hVar9.f3306O != null) && (str == null || !str.equals(hVar9.f3306O)))) {
                AccessibilityEvent e7 = iVar.e(hVar9.f3318b, i20);
                e7.setContentChangeTypes(1);
                iVar.i(e7);
            }
            if (Build.VERSION.SDK_INT >= 36 && hVar9.f3299H) {
                if (hVar9.h(2) != hVar9.g(2) || hVar9.h(26) != hVar9.g(26) || hVar9.h(18) != hVar9.g(18)) {
                    AccessibilityEvent e8 = iVar.e(hVar9.f3318b, i20);
                    e8.setContentChangeTypes(8192);
                    iVar.i(e8);
                }
            }
            h hVar10 = iVar.f3352i;
            if (hVar10 != null && hVar10.f3318b == hVar9.f3318b && !hVar9.g(3) && hVar9.h(3)) {
                AccessibilityEvent e9 = iVar.e(hVar9.f3318b, i4);
                e9.getText().add(hVar9.f3336p);
                iVar.i(e9);
            }
            h hVar11 = iVar.n;
            if (hVar11 != null && (i5 = hVar11.f3318b) == (i6 = hVar9.f3318b) && ((hVar3 = iVar.f3357o) == null || hVar3.f3318b != i5)) {
                iVar.f3357o = hVar11;
                iVar.i(iVar.e(i6, 8));
            } else if (hVar11 == null) {
                iVar.f3357o = null;
                hVar = iVar.n;
                if (hVar == null && hVar.f3318b == hVar9.f3318b && hVar9.g(5) && hVar9.h(5) && ((hVar2 = iVar.f3352i) == null || hVar2.f3318b == iVar.n.f3318b)) {
                    String str2 = hVar9.f3305N;
                    String str3 = StringUtils.EMPTY;
                    if (str2 == null) {
                        str2 = StringUtils.EMPTY;
                    }
                    String str4 = hVar9.f3338r;
                    if (str4 != null) {
                        str3 = str4;
                    }
                    AccessibilityEvent e10 = iVar.e(hVar9.f3318b, i3);
                    e10.setBeforeText(str2);
                    e10.getText().add(str3);
                    int i27 = 0;
                    while (i27 < str2.length() && i27 < str3.length() && str2.charAt(i27) == str3.charAt(i27)) {
                        i27++;
                    }
                    if (i27 < str2.length() || i27 < str3.length()) {
                        e10.setFromIndex(i27);
                        int length = str2.length() - 1;
                        int length2 = str3.length() - 1;
                        while (length >= i27 && length2 >= i27 && str2.charAt(length) == str3.charAt(length2)) {
                            length--;
                            length2--;
                        }
                        e10.setRemovedCount((length - i27) + 1);
                        e10.setAddedCount((length2 - i27) + 1);
                    } else {
                        e10 = null;
                    }
                    if (e10 != null) {
                        iVar.i(e10);
                    }
                    if (hVar9.f3302K != hVar9.f3328g || hVar9.f3303L != hVar9.f3329h) {
                        AccessibilityEvent e11 = iVar.e(hVar9.f3318b, 8192);
                        e11.getText().add(str3);
                        e11.setFromIndex(hVar9.f3328g);
                        e11.setToIndex(hVar9.f3329h);
                        e11.setItemCount(str3.length());
                        iVar.i(e11);
                    }
                }
                i20 = 2048;
                i4 = 4;
                i21 = 0;
                i3 = 16;
            }
            hVar = iVar.n;
            if (hVar == null) {
            }
            i20 = 2048;
            i4 = 4;
            i21 = 0;
            i3 = 16;
        }
    }
}

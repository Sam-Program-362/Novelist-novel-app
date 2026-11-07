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

/* JADX INFO: loaded from: classes.dex */
public final class c implements p054s1.k, p054s1.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3261a;

    public /* synthetic */ c(Object obj) {
        this.f3261a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:219:0x04d0  */
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
        View viewL;
        Integer num;
        View viewL2;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        for (ByteBuffer byteBuffer2 : byteBufferArr) {
            byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
        }
        i iVar = (i) this.f3261a;
        HashMap map = iVar.f3350g;
        io.flutter.plugin.platform.k kVar = iVar.f3348e;
        ArrayList arrayList = iVar.f3359q;
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            i3 = 16;
            if (!byteBuffer.hasRemaining()) {
                break;
            }
            h hVarC = iVar.c(byteBuffer.getInt());
            ArrayList arrayList3 = hVarC.f3313X;
            i iVar2 = hVarC.f3316a;
            hVarC.f3299H = true;
            hVarC.f3305N = hVarC.f3338r;
            hVarC.f3306O = hVarC.f3336p;
            hVarC.f3300I = hVarC.f3320c;
            hVarC.f3301J = hVarC.f3322d;
            hVarC.f3302K = hVarC.f3328g;
            hVarC.f3303L = hVarC.f3329h;
            hVarC.f3304M = hVarC.f3333l;
            hVarC.f3320c = byteBuffer.getLong();
            hVarC.f3322d = byteBuffer.getInt();
            hVarC.f3324e = byteBuffer.getInt();
            hVarC.f3326f = byteBuffer.getInt();
            hVarC.f3328g = byteBuffer.getInt();
            hVarC.f3329h = byteBuffer.getInt();
            hVarC.f3330i = byteBuffer.getInt();
            hVarC.f3331j = byteBuffer.getInt();
            hVarC.f3332k = byteBuffer.getInt();
            byteBuffer.getInt();
            hVarC.f3333l = byteBuffer.getFloat();
            hVarC.f3334m = byteBuffer.getFloat();
            hVarC.n = byteBuffer.getFloat();
            hVarC.f3296E = byteBuffer.getInt();
            hVarC.f3335o = i.d(byteBuffer, strArr);
            hVarC.f3336p = i.d(byteBuffer, strArr);
            hVarC.f3337q = h.f(byteBuffer, byteBufferArr);
            hVarC.f3338r = i.d(byteBuffer, strArr);
            hVarC.f3339s = h.f(byteBuffer, byteBufferArr);
            hVarC.f3340t = i.d(byteBuffer, strArr);
            hVarC.u = h.f(byteBuffer, byteBufferArr);
            hVarC.f3341v = i.d(byteBuffer, strArr);
            hVarC.f3342w = h.f(byteBuffer, byteBufferArr);
            hVarC.x = i.d(byteBuffer, strArr);
            hVarC.y = h.f(byteBuffer, byteBufferArr);
            hVarC.f3343z = i.d(byteBuffer, strArr);
            hVarC.f3292A = i.d(byteBuffer, strArr);
            hVarC.f3293B = i.d(byteBuffer, strArr);
            hVarC.f3294C = i.d(byteBuffer, strArr);
            hVarC.f3295D = i.d(byteBuffer, strArr);
            hVarC.f3297F = byteBuffer.getInt();
            byteBuffer.getInt();
            hVarC.f3307P = byteBuffer.getFloat();
            hVarC.f3308Q = byteBuffer.getFloat();
            hVarC.f3309R = byteBuffer.getFloat();
            hVarC.S = byteBuffer.getFloat();
            float[] fArr = hVarC.f3310T;
            if (fArr == null) {
                fArr = new float[16];
            }
            for (int i7 = 0; i7 < 16; i7++) {
                fArr[i7] = byteBuffer.getFloat();
            }
            hVarC.f3310T = fArr;
            float[] fArr2 = hVarC.f3311U;
            if (fArr2 == null) {
                fArr2 = new float[16];
            }
            for (int i8 = 0; i8 < 16; i8++) {
                fArr2[i8] = byteBuffer.getFloat();
            }
            hVarC.f3311U = fArr2;
            hVarC.f3319b0 = true;
            hVarC.f3323d0 = true;
            int i9 = byteBuffer.getInt();
            ArrayList arrayList4 = hVarC.W;
            arrayList4.clear();
            for (int i10 = 0; i10 < i9; i10++) {
                h hVarC2 = iVar2.c(byteBuffer.getInt());
                hVarC2.f3312V = hVarC;
                arrayList4.add(hVarC2);
            }
            int i11 = byteBuffer.getInt();
            arrayList3.clear();
            for (int i12 = 0; i12 < i11; i12++) {
                h hVarC3 = iVar2.c(byteBuffer.getInt());
                hVarC3.f3312V = hVarC;
                arrayList3.add(hVarC3);
            }
            int i13 = byteBuffer.getInt();
            if (i13 == 0) {
                hVarC.f3314Y = null;
            } else {
                ArrayList arrayList5 = hVarC.f3314Y;
                if (arrayList5 == null) {
                    hVarC.f3314Y = new ArrayList(i13);
                } else {
                    arrayList5.clear();
                }
                for (int i14 = 0; i14 < i13; i14++) {
                    g gVarB = iVar2.b(byteBuffer.getInt());
                    int i15 = gVarB.f3289c;
                    if (i15 == 1) {
                        hVarC.f3315Z = gVarB;
                    } else if (i15 == 2) {
                        hVarC.f3317a0 = gVarB;
                    } else {
                        hVarC.f3314Y.add(gVarB);
                    }
                    hVarC.f3314Y.add(gVarB);
                }
            }
            if (!hVarC.h(14)) {
                if (hVarC.h(6)) {
                    iVar.n = hVarC;
                }
                if (hVarC.f3299H) {
                    arrayList2.add(hVarC);
                }
                int i16 = hVarC.f3330i;
                if (i16 != -1 && !kVar.g(i16) && (viewL2 = kVar.l(hVarC.f3330i)) != null) {
                    viewL2.setImportantForAccessibility(0);
                }
            }
        }
        HashSet hashSet = new HashSet();
        h hVar4 = (h) map.get(0);
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
            String strE = hVar5.e();
            if (strE == null) {
                strE = StringUtils.SPACE;
            }
            if (Build.VERSION.SDK_INT >= 28) {
                iVar.f3344a.setAccessibilityPaneTitle(strE);
            } else {
                AccessibilityEvent accessibilityEventE = iVar.e(hVar5.f3318b, 32);
                accessibilityEventE.getText().add(strE);
                iVar.i(accessibilityEventE);
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
        Iterator it2 = map.entrySet().iterator();
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
                if (i19 != -1 && (viewL = kVar.l(i19)) != null) {
                    viewL.setImportantForAccessibility(4);
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
        AccessibilityEvent accessibilityEventE2 = iVar.e(0, 2048);
        accessibilityEventE2.setContentChangeTypes(1);
        iVar.i(accessibilityEventE2);
        int size3 = arrayList2.size();
        int i22 = 0;
        while (i22 < size3) {
            Object obj3 = arrayList2.get(i22);
            i22++;
            h hVar9 = (h) obj3;
            if (!Float.isNaN(hVar9.f3333l) && !Float.isNaN(hVar9.f3304M) && hVar9.f3304M != hVar9.f3333l) {
                AccessibilityEvent accessibilityEventE3 = iVar.e(hVar9.f3318b, 4096);
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
                    accessibilityEventE3.setScrollY((int) f4);
                    accessibilityEventE3.setMaxScrollY((int) f3);
                } else if ((i23 & 4) != 0 || (i23 & 8) != 0) {
                    accessibilityEventE3.setScrollX((int) f4);
                    accessibilityEventE3.setMaxScrollX((int) f3);
                }
                int i24 = hVar9.f3331j;
                if (i24 > 0) {
                    accessibilityEventE3.setItemCount(i24);
                    accessibilityEventE3.setFromIndex(hVar9.f3332k);
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
                    accessibilityEventE3.setToIndex((hVar9.f3332k + i25) - 1);
                }
                iVar.i(accessibilityEventE3);
            }
            if (hVar9.h(i3) && (((str = hVar9.f3336p) != null || hVar9.f3306O != null) && (str == null || !str.equals(hVar9.f3306O)))) {
                AccessibilityEvent accessibilityEventE4 = iVar.e(hVar9.f3318b, i20);
                accessibilityEventE4.setContentChangeTypes(1);
                iVar.i(accessibilityEventE4);
            }
            if (Build.VERSION.SDK_INT >= 36 && hVar9.f3299H) {
                if (hVar9.h(2) != hVar9.g(2) || hVar9.h(26) != hVar9.g(26) || hVar9.h(18) != hVar9.g(18)) {
                    AccessibilityEvent accessibilityEventE5 = iVar.e(hVar9.f3318b, i20);
                    accessibilityEventE5.setContentChangeTypes(8192);
                    iVar.i(accessibilityEventE5);
                }
            }
            h hVar10 = iVar.f3352i;
            if (hVar10 != null && hVar10.f3318b == hVar9.f3318b && !hVar9.g(3) && hVar9.h(3)) {
                AccessibilityEvent accessibilityEventE6 = iVar.e(hVar9.f3318b, i4);
                accessibilityEventE6.getText().add(hVar9.f3336p);
                iVar.i(accessibilityEventE6);
            }
            h hVar11 = iVar.n;
            if (hVar11 == null || (i5 = hVar11.f3318b) != (i6 = hVar9.f3318b) || ((hVar3 = iVar.f3357o) != null && hVar3.f3318b == i5)) {
                if (hVar11 == null) {
                    iVar.f3357o = null;
                }
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
                    AccessibilityEvent accessibilityEventE7 = iVar.e(hVar9.f3318b, i3);
                    accessibilityEventE7.setBeforeText(str2);
                    accessibilityEventE7.getText().add(str3);
                    int i27 = 0;
                    while (i27 < str2.length() && i27 < str3.length() && str2.charAt(i27) == str3.charAt(i27)) {
                        i27++;
                    }
                    if (i27 < str2.length() || i27 < str3.length()) {
                        accessibilityEventE7.setFromIndex(i27);
                        int length = str2.length() - 1;
                        int length2 = str3.length() - 1;
                        while (length >= i27 && length2 >= i27 && str2.charAt(length) == str3.charAt(length2)) {
                            length--;
                            length2--;
                        }
                        accessibilityEventE7.setRemovedCount((length - i27) + 1);
                        accessibilityEventE7.setAddedCount((length2 - i27) + 1);
                    } else {
                        accessibilityEventE7 = null;
                    }
                    if (accessibilityEventE7 != null) {
                        iVar.i(accessibilityEventE7);
                    }
                    if (hVar9.f3302K != hVar9.f3328g || hVar9.f3303L != hVar9.f3329h) {
                        AccessibilityEvent accessibilityEventE8 = iVar.e(hVar9.f3318b, 8192);
                        accessibilityEventE8.getText().add(str3);
                        accessibilityEventE8.setFromIndex(hVar9.f3328g);
                        accessibilityEventE8.setToIndex(hVar9.f3329h);
                        accessibilityEventE8.setItemCount(str3.length());
                        iVar.i(accessibilityEventE8);
                    }
                }
                i20 = 2048;
                i4 = 4;
                i21 = 0;
                i3 = 16;
            } else {
                iVar.f3357o = hVar11;
                iVar.i(iVar.e(i6, 8));
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

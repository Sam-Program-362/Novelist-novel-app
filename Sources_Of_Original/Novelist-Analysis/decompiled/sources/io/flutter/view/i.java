package io.flutter.view;

import android.R;
import android.content.ContentResolver;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public final class i extends AccessibilityNodeProvider {
    public static final /* synthetic */ int y = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f3344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A0.j f3345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccessibilityManager f3346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AccessibilityViewEmbedder f3347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final io.flutter.plugin.platform.k f3348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ContentResolver f3349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f3350g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f3351h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h f3352i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f3353j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Integer f3354k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3355l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f3356m;
    public h n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public h f3357o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public h f3358p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f3359q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3360r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public B1.a f3361s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f3362t;
    public boolean u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final d f3363v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e f3364w;
    public final T.a x;

    public i(View view, A0.j jVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.k kVar) {
        AccessibilityViewEmbedder accessibilityViewEmbedder = new AccessibilityViewEmbedder(view, 65536);
        this.f3350g = new HashMap();
        this.f3351h = new HashMap();
        this.f3355l = 0;
        this.f3359q = new ArrayList();
        this.f3360r = 0;
        this.f3362t = false;
        this.u = false;
        c cVar = new c(this);
        d dVar = new d(this);
        this.f3363v = dVar;
        T.a aVar = new T.a(this, new Handler(), 1);
        this.x = aVar;
        this.f3344a = view;
        this.f3345b = jVar;
        this.f3346c = accessibilityManager;
        this.f3349f = contentResolver;
        this.f3347d = accessibilityViewEmbedder;
        this.f3348e = kVar;
        jVar.n = cVar;
        ((FlutterJNI) jVar.f58m).setAccessibilityDelegate(cVar);
        dVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(dVar);
        e eVar = new e(this, accessibilityManager);
        this.f3364w = eVar;
        eVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(eVar);
        this.f3355l |= 128;
        aVar.onChange(false, null);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, aVar);
        if (Build.VERSION.SDK_INT >= 31 && view != null && view.getResources() != null) {
            int i3 = view.getResources().getConfiguration().fontWeightAdjustment;
            if (i3 == Integer.MAX_VALUE || i3 < 300) {
                this.f3355l &= -9;
            } else {
                this.f3355l |= 8;
            }
            ((FlutterJNI) jVar.f58m).setAccessibilityFeatures(this.f3355l);
        }
        kVar.c(this);
    }

    public static String d(ByteBuffer byteBuffer, String[] strArr) {
        int i3 = byteBuffer.getInt();
        if (i3 == -1) {
            return null;
        }
        return strArr[i3];
    }

    public final boolean a(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        AccessibilityViewEmbedder accessibilityViewEmbedder = this.f3347d;
        if (!accessibilityViewEmbedder.requestSendAccessibilityEvent(view, view2, accessibilityEvent) || (recordFlutterId = accessibilityViewEmbedder.getRecordFlutterId(view, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 8) {
            this.f3354k = recordFlutterId;
            this.n = null;
            return true;
        }
        if (eventType == 128) {
            this.f3358p = null;
            return true;
        }
        if (eventType == 32768) {
            this.f3353j = recordFlutterId;
            this.f3352i = null;
            return true;
        }
        if (eventType != 65536) {
            return true;
        }
        this.f3354k = null;
        this.f3353j = null;
        return true;
    }

    public final g b(int i3) {
        Integer numValueOf = Integer.valueOf(i3);
        HashMap map = this.f3351h;
        g gVar = (g) map.get(numValueOf);
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g();
        gVar2.f3289c = -1;
        gVar2.f3288b = i3;
        gVar2.f3287a = 267386881 + i3;
        map.put(Integer.valueOf(i3), gVar2);
        return gVar2;
    }

    public final h c(int i3) {
        Integer numValueOf = Integer.valueOf(i3);
        HashMap map = this.f3350g;
        h hVar = (h) map.get(numValueOf);
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this);
        hVar2.f3318b = i3;
        map.put(Integer.valueOf(i3), hVar2);
        return hVar2;
    }

    /* JADX WARN: Code duplicated, block: B:326:0x0592  */
    /* JADX WARN: Code duplicated, block: B:327:0x0594  */
    /* JADX WARN: Code duplicated, block: B:330:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:333:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:335:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:337:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:338:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:345:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:348:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:350:0x05dc A[LOOP:1: B:349:0x05da->B:350:0x05dc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:353:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:358:0x0610  */
    /* JADX WARN: Code duplicated, block: B:379:0x060b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:380:0x0626 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:385:0x05f8 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i3) {
        boolean zH;
        int i4;
        h hVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        int size;
        int i5;
        h hVar2;
        int i6;
        int size2;
        int i7;
        boolean z3;
        int i8;
        String str;
        float f3;
        float f4;
        int i9;
        int i10;
        j(true);
        AccessibilityViewEmbedder accessibilityViewEmbedder = this.f3347d;
        if (i3 >= 65536) {
            return accessibilityViewEmbedder.createAccessibilityNodeInfo(i3);
        }
        HashMap map = this.f3350g;
        View view = this.f3344a;
        if (i3 == -1) {
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
            view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
            if (map.containsKey(0)) {
                accessibilityNodeInfoObtain.addChild(view, 0);
            }
            accessibilityNodeInfoObtain.setImportantForAccessibility(false);
            return accessibilityNodeInfoObtain;
        }
        h hVar3 = (h) map.get(Integer.valueOf(i3));
        if (hVar3 != null) {
            int i11 = hVar3.f3330i;
            io.flutter.plugin.platform.k kVar = this.f3348e;
            if (i11 == -1 || !kVar.g(i11)) {
                AccessibilityNodeInfo accessibilityNodeInfoObtain2 = AccessibilityNodeInfo.obtain(view, i3);
                accessibilityNodeInfoObtain2.setImportantForAccessibility((hVar3.h(12) || (h.b(hVar3) == null && hVar3.f3322d == 0)) ? false : true);
                CharSequence charSequence = StringUtils.EMPTY;
                accessibilityNodeInfoObtain2.setViewIdResourceName(StringUtils.EMPTY);
                String str2 = hVar3.f3335o;
                if (str2 != null) {
                    accessibilityNodeInfoObtain2.setViewIdResourceName(str2);
                }
                accessibilityNodeInfoObtain2.setPackageName(view.getContext().getPackageName());
                accessibilityNodeInfoObtain2.setClassName("android.view.View");
                accessibilityNodeInfoObtain2.setSource(view, i3);
                accessibilityNodeInfoObtain2.setFocusable(hVar3.j());
                h hVar4 = this.n;
                if (hVar4 != null) {
                    accessibilityNodeInfoObtain2.setFocused(hVar4.f3318b == i3);
                }
                h hVar5 = this.f3352i;
                if (hVar5 != null) {
                    accessibilityNodeInfoObtain2.setAccessibilityFocused(hVar5.f3318b == i3);
                }
                if (hVar3.h(5)) {
                    accessibilityNodeInfoObtain2.setPassword(hVar3.h(11));
                    if (!hVar3.h(21)) {
                        accessibilityNodeInfoObtain2.setClassName("android.widget.EditText");
                    }
                    accessibilityNodeInfoObtain2.setEditable(!hVar3.h(21));
                    int i12 = hVar3.f3328g;
                    if (i12 != -1 && (i10 = hVar3.f3329h) != -1) {
                        accessibilityNodeInfoObtain2.setTextSelection(i12, i10);
                    }
                    h hVar6 = this.f3352i;
                    if (hVar6 != null && hVar6.f3318b == i3) {
                        accessibilityNodeInfoObtain2.setLiveRegion(1);
                    }
                    if (h.a(hVar3, f.u)) {
                        accessibilityNodeInfoObtain2.addAction(256);
                        i9 = 1;
                    } else {
                        i9 = 0;
                    }
                    if (h.a(hVar3, f.f3283v)) {
                        accessibilityNodeInfoObtain2.addAction(512);
                        i9 = 1;
                    }
                    if (h.a(hVar3, f.f3269E)) {
                        accessibilityNodeInfoObtain2.addAction(256);
                        i9 |= 2;
                    }
                    if (h.a(hVar3, f.f3270F)) {
                        accessibilityNodeInfoObtain2.addAction(512);
                        i9 |= 2;
                    }
                    accessibilityNodeInfoObtain2.setMovementGranularities(i9);
                    if (hVar3.f3324e >= 0) {
                        String str3 = hVar3.f3338r;
                        accessibilityNodeInfoObtain2.setMaxTextLength(((str3 == null ? 0 : str3.length()) - hVar3.f3326f) + hVar3.f3324e);
                    }
                }
                if (h.a(hVar3, f.f3284w)) {
                    accessibilityNodeInfoObtain2.addAction(131072);
                }
                if (h.a(hVar3, f.x)) {
                    accessibilityNodeInfoObtain2.addAction(16384);
                }
                if (h.a(hVar3, f.y)) {
                    accessibilityNodeInfoObtain2.addAction(65536);
                }
                if (h.a(hVar3, f.f3285z)) {
                    accessibilityNodeInfoObtain2.addAction(32768);
                }
                if (h.a(hVar3, f.f3271G)) {
                    accessibilityNodeInfoObtain2.addAction(2097152);
                }
                if (hVar3.h(4)) {
                    zH = true;
                } else {
                    String str4 = hVar3.f3292A;
                    zH = (str4 == null || str4.isEmpty()) ? hVar3.h(23) : false;
                }
                if (zH) {
                    accessibilityNodeInfoObtain2.setClassName("android.widget.Button");
                }
                if (hVar3.h(15)) {
                    accessibilityNodeInfoObtain2.setClassName("android.widget.ImageView");
                }
                if (X.j.a(X.j.b(33)[hVar3.f3296E]) == 23) {
                    accessibilityNodeInfoObtain2.setClassName("android.widget.ProgressBar");
                    if (hVar3.f3338r != null) {
                        String str5 = hVar3.f3294C;
                        if (str5 != null) {
                            try {
                                f3 = Float.parseFloat(str5);
                            } catch (NumberFormatException unused) {
                                f3 = Float.NEGATIVE_INFINITY;
                            }
                        } else {
                            f3 = Float.NEGATIVE_INFINITY;
                        }
                        String str6 = hVar3.f3295D;
                        if (str6 != null) {
                            try {
                                f4 = Float.parseFloat(str6);
                            } catch (NumberFormatException unused2) {
                                f4 = Float.POSITIVE_INFINITY;
                            }
                        } else {
                            f4 = Float.POSITIVE_INFINITY;
                        }
                        try {
                            accessibilityNodeInfoObtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, f3, f4, Float.parseFloat(hVar3.f3338r)));
                        } catch (NumberFormatException unused3) {
                            if (Build.VERSION.SDK_INT >= 36) {
                                accessibilityNodeInfoObtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(3, 0.0f, 0.0f, 0.0f));
                            } else {
                                accessibilityNodeInfoObtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, 0.0f, 0.0f));
                            }
                        }
                    }
                }
                if (h.a(hVar3, f.f3268D)) {
                    accessibilityNodeInfoObtain2.setDismissable(true);
                    accessibilityNodeInfoObtain2.addAction(1048576);
                }
                h hVar7 = hVar3.f3312V;
                if (hVar7 != null) {
                    accessibilityNodeInfoObtain2.setParent(view, hVar7.f3318b);
                } else {
                    accessibilityNodeInfoObtain2.setParent(view);
                }
                int i13 = hVar3.f3298G;
                if (i13 != -1) {
                    accessibilityNodeInfoObtain2.setTraversalAfter(view, i13);
                }
                Rect rect = hVar3.f3327f0;
                h hVar8 = hVar3.f3312V;
                if (hVar8 != null) {
                    Rect rect2 = hVar8.f3327f0;
                    Rect rect3 = new Rect(rect);
                    rect3.offset(-rect2.left, -rect2.top);
                    accessibilityNodeInfoObtain2.setBoundsInParent(rect3);
                } else {
                    accessibilityNodeInfoObtain2.setBoundsInParent(rect);
                }
                Rect rect4 = new Rect(rect);
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                rect4.offset(iArr[0], iArr[1]);
                accessibilityNodeInfoObtain2.setBoundsInScreen(rect4);
                accessibilityNodeInfoObtain2.setVisibleToUser(true);
                accessibilityNodeInfoObtain2.setEnabled(!hVar3.h(7) || hVar3.h(8));
                if (h.a(hVar3, f.f3275l)) {
                    if (hVar3.f3315Z != null) {
                        accessibilityNodeInfoObtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, hVar3.f3315Z.f3291e));
                        accessibilityNodeInfoObtain2.setClickable(true);
                    } else {
                        accessibilityNodeInfoObtain2.addAction(16);
                        accessibilityNodeInfoObtain2.setClickable(true);
                    }
                } else if (hVar3.h(24)) {
                    accessibilityNodeInfoObtain2.addAction(16);
                    accessibilityNodeInfoObtain2.setClickable(true);
                }
                if (h.a(hVar3, f.f3276m)) {
                    if (hVar3.f3317a0 != null) {
                        accessibilityNodeInfoObtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, hVar3.f3317a0.f3291e));
                        accessibilityNodeInfoObtain2.setLongClickable(true);
                    } else {
                        accessibilityNodeInfoObtain2.addAction(32);
                        accessibilityNodeInfoObtain2.setLongClickable(true);
                    }
                }
                f fVar = f.n;
                boolean zA = h.a(hVar3, fVar);
                f fVar2 = f.f3279q;
                f fVar3 = f.f3278p;
                f fVar4 = f.f3277o;
                if (zA || h.a(hVar3, fVar3) || h.a(hVar3, fVar4) || h.a(hVar3, fVar2)) {
                    accessibilityNodeInfoObtain2.setScrollable(true);
                    if (hVar3.h(19)) {
                        if (h.a(hVar3, fVar) || h.a(hVar3, fVar4)) {
                            accessibilityNodeInfoObtain2.setClassName("android.widget.HorizontalScrollView");
                        } else {
                            accessibilityNodeInfoObtain2.setClassName("android.widget.ScrollView");
                        }
                    }
                }
                if (k(hVar3)) {
                    if (h.a(hVar3, fVar) || h.a(hVar3, fVar4)) {
                        if (Build.VERSION.SDK_INT < 33) {
                            accessibilityNodeInfoObtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, hVar3.f3331j, false));
                        } else {
                            accessibilityNodeInfoObtain2.setCollectionInfo(a.g(hVar3.f3331j));
                        }
                    } else if (Build.VERSION.SDK_INT < 33) {
                        accessibilityNodeInfoObtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(hVar3.f3331j, 1, false));
                    } else {
                        accessibilityNodeInfoObtain2.setCollectionInfo(a.d(hVar3.f3331j));
                    }
                }
                h hVar9 = hVar3.f3312V;
                if ((hVar9 != null && k(hVar9) && hVar3.f3312V.h(19)) != false) {
                    h hVar10 = hVar3.f3312V;
                    ArrayList arrayList3 = hVar10.W;
                    Object[] objArr = (h.a(hVar10, fVar) || h.a(hVar10, fVar4)) ? false : true;
                    int iIndexOf = arrayList3.indexOf(hVar3);
                    if (objArr == true) {
                        if (Build.VERSION.SDK_INT < 33) {
                            accessibilityNodeInfoObtain2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(iIndexOf, 1, 0, 1, hVar3.h(10)));
                        } else {
                            accessibilityNodeInfoObtain2.setCollectionItemInfo(a.e(iIndexOf, hVar3.h(10)));
                        }
                    } else if (Build.VERSION.SDK_INT < 33) {
                        accessibilityNodeInfoObtain2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, iIndexOf, 1, hVar3.h(10)));
                    } else {
                        accessibilityNodeInfoObtain2.setCollectionItemInfo(a.h(iIndexOf, hVar3.h(10)));
                    }
                }
                if (h.a(hVar3, fVar) || h.a(hVar3, fVar3)) {
                    accessibilityNodeInfoObtain2.addAction(4096);
                }
                if (h.a(hVar3, fVar4) || h.a(hVar3, fVar2)) {
                    accessibilityNodeInfoObtain2.addAction(8192);
                }
                f fVar5 = f.f3280r;
                boolean zA2 = h.a(hVar3, fVar5);
                f fVar6 = f.f3281s;
                if (zA2 || h.a(hVar3, fVar6)) {
                    accessibilityNodeInfoObtain2.setClassName("android.widget.SeekBar");
                    if (h.a(hVar3, fVar5)) {
                        accessibilityNodeInfoObtain2.addAction(4096);
                    }
                    if (h.a(hVar3, fVar6)) {
                        accessibilityNodeInfoObtain2.addAction(8192);
                    }
                }
                if (hVar3.h(16)) {
                    accessibilityNodeInfoObtain2.setLiveRegion(1);
                }
                if (hVar3.h(5)) {
                    B1.s sVar = new B1.s();
                    sVar.f144k = hVar3.f3338r;
                    sVar.f146m = hVar3.f3339s;
                    sVar.f145l = hVar3.d();
                    accessibilityNodeInfoObtain2.setText(sVar.e());
                    if (Build.VERSION.SDK_INT >= 28) {
                        B1.s sVar2 = new B1.s();
                        sVar2.f144k = hVar3.f3336p;
                        sVar2.f146m = hVar3.f3337q;
                        sVar2.n = hVar3.f3292A;
                        sVar2.f145l = hVar3.d();
                        SpannableString spannableStringE = sVar2.e();
                        B1.s sVar3 = new B1.s();
                        sVar3.f144k = hVar3.x;
                        sVar3.f146m = hVar3.y;
                        sVar3.f145l = hVar3.d();
                        CharSequence[] charSequenceArr = {spannableStringE, sVar3.e()};
                        int i14 = 0;
                        CharSequence charSequenceConcat = null;
                        for (int i15 = 2; i14 < i15; i15 = 2) {
                            CharSequence charSequence2 = charSequenceArr[i14];
                            if (charSequence2 != null && charSequence2.length() > 0) {
                                charSequenceConcat = (charSequenceConcat == null || charSequenceConcat.length() == 0) ? charSequence2 : TextUtils.concat(charSequenceConcat, ", ", charSequence2);
                            }
                            i14++;
                        }
                        accessibilityNodeInfoObtain2.setHintText(charSequenceConcat);
                    }
                } else if (!hVar3.h(12)) {
                    CharSequence charSequenceB = h.b(hVar3);
                    if (Build.VERSION.SDK_INT < 28 && hVar3.f3343z != null) {
                        if (charSequenceB != null) {
                            charSequence = charSequenceB;
                        }
                        charSequenceB = ((Object) charSequence) + "\n" + hVar3.f3343z;
                    }
                    if (charSequenceB != null) {
                        accessibilityNodeInfoObtain2.setContentDescription(charSequenceB);
                    }
                }
                int i16 = Build.VERSION.SDK_INT;
                if (i16 >= 28 && (str = hVar3.f3343z) != null) {
                    accessibilityNodeInfoObtain2.setTooltipText(str);
                    if (h.b(hVar3) == null) {
                        accessibilityNodeInfoObtain2.setContentDescription(hVar3.f3343z);
                    }
                }
                boolean zH2 = hVar3.h(1);
                boolean zH3 = hVar3.h(17);
                accessibilityNodeInfoObtain2.setCheckable(zH2 || zH3);
                if (!zH2) {
                    if (zH3) {
                        accessibilityNodeInfoObtain2.setClassName("android.widget.Switch");
                        i4 = 36;
                        if (i16 >= 36) {
                            accessibilityNodeInfoObtain2.setChecked(hVar3.h(18) ? 1 : 0);
                        } else {
                            accessibilityNodeInfoObtain2.setChecked(hVar3.h(18));
                        }
                    }
                    accessibilityNodeInfoObtain2.setSelected(hVar3.h(3));
                    if (i16 >= i4 && hVar3.h(27)) {
                        if (hVar3.h(28)) {
                            i8 = 3;
                        } else {
                            i8 = 1;
                        }
                        accessibilityNodeInfoObtain2.setExpandedState(i8);
                        if (h.a(hVar3, f.f3272H)) {
                            accessibilityNodeInfoObtain2.addAction(262144);
                        }
                        if (h.a(hVar3, f.f3273I)) {
                            accessibilityNodeInfoObtain2.addAction(524288);
                        }
                    }
                    if (i16 >= 28) {
                        if (hVar3.f3297F > 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        accessibilityNodeInfoObtain2.setHeading(z3);
                    }
                    hVar = this.f3352i;
                    if (hVar == null && hVar.f3318b == i3) {
                        accessibilityNodeInfoObtain2.addAction(128);
                    } else {
                        accessibilityNodeInfoObtain2.addAction(64);
                    }
                    arrayList = hVar3.f3314Y;
                    if (arrayList != null) {
                        size2 = arrayList.size();
                        i7 = 0;
                        while (i7 < size2) {
                            Object obj = arrayList.get(i7);
                            i7++;
                            g gVar = (g) obj;
                            accessibilityNodeInfoObtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(gVar.f3287a, gVar.f3290d));
                        }
                    }
                    arrayList2 = hVar3.W;
                    size = arrayList2.size();
                    i5 = 0;
                    while (i5 < size) {
                        Object obj2 = arrayList2.get(i5);
                        i5++;
                        hVar2 = (h) obj2;
                        if (!hVar2.h(14)) {
                            i6 = hVar2.f3330i;
                            if (i6 != -1) {
                                View viewL = kVar.l(i6);
                                if (kVar.g(hVar2.f3330i) && viewL != null) {
                                    viewL.setImportantForAccessibility(0);
                                    accessibilityNodeInfoObtain2.addChild(viewL);
                                }
                            }
                            accessibilityNodeInfoObtain2.addChild(view, hVar2.f3318b);
                        }
                    }
                    return accessibilityNodeInfoObtain2;
                }
                if (hVar3.h(9)) {
                    accessibilityNodeInfoObtain2.setClassName("android.widget.RadioButton");
                } else {
                    accessibilityNodeInfoObtain2.setClassName("android.widget.CheckBox");
                }
                if (i16 >= 36) {
                    accessibilityNodeInfoObtain2.setChecked(hVar3.h(26) ? 2 : hVar3.h(2) ? 1 : 0);
                } else {
                    accessibilityNodeInfoObtain2.setChecked(hVar3.h(2));
                }
                i4 = 36;
                accessibilityNodeInfoObtain2.setSelected(hVar3.h(3));
                if (i16 >= i4) {
                    if (hVar3.h(28)) {
                        i8 = 3;
                    } else {
                        i8 = 1;
                    }
                    accessibilityNodeInfoObtain2.setExpandedState(i8);
                    if (h.a(hVar3, f.f3272H)) {
                        accessibilityNodeInfoObtain2.addAction(262144);
                    }
                    if (h.a(hVar3, f.f3273I)) {
                        accessibilityNodeInfoObtain2.addAction(524288);
                    }
                }
                if (i16 >= 28) {
                    if (hVar3.f3297F > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    accessibilityNodeInfoObtain2.setHeading(z3);
                }
                hVar = this.f3352i;
                if (hVar == null) {
                    accessibilityNodeInfoObtain2.addAction(64);
                } else {
                    accessibilityNodeInfoObtain2.addAction(64);
                }
                arrayList = hVar3.f3314Y;
                if (arrayList != null) {
                    size2 = arrayList.size();
                    i7 = 0;
                    while (i7 < size2) {
                        Object obj3 = arrayList.get(i7);
                        i7++;
                        g gVar2 = (g) obj3;
                        accessibilityNodeInfoObtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(gVar2.f3287a, gVar2.f3290d));
                    }
                }
                arrayList2 = hVar3.W;
                size = arrayList2.size();
                i5 = 0;
                while (i5 < size) {
                    Object obj4 = arrayList2.get(i5);
                    i5++;
                    hVar2 = (h) obj4;
                    if (!hVar2.h(14)) {
                        i6 = hVar2.f3330i;
                        if (i6 != -1) {
                            View viewL2 = kVar.l(i6);
                            if (kVar.g(hVar2.f3330i)) {
                            }
                        }
                        accessibilityNodeInfoObtain2.addChild(view, hVar2.f3318b);
                    }
                }
                return accessibilityNodeInfoObtain2;
            }
            View viewL3 = kVar.l(hVar3.f3330i);
            if (viewL3 != null) {
                return accessibilityViewEmbedder.getRootNode(viewL3, hVar3.f3318b, hVar3.f3327f0);
            }
        }
        return null;
    }

    public final AccessibilityEvent e(int i3, int i4) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i4);
        View view = this.f3344a;
        accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        accessibilityEventObtain.setSource(view, i3);
        return accessibilityEventObtain;
    }

    public final boolean f(MotionEvent motionEvent, boolean z3) {
        h hVarI;
        if (this.f3346c.isTouchExplorationEnabled()) {
            HashMap map = this.f3350g;
            if (!map.isEmpty()) {
                h hVarI2 = ((h) map.get(0)).i(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z3);
                if (hVarI2 == null || hVarI2.f3330i == -1) {
                    if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
                        float x = motionEvent.getX();
                        float y3 = motionEvent.getY();
                        if (!map.isEmpty() && (hVarI = ((h) map.get(0)).i(new float[]{x, y3, 0.0f, 1.0f}, z3)) != this.f3358p) {
                            if (hVarI != null) {
                                h(hVarI.f3318b, 128);
                            }
                            h hVar = this.f3358p;
                            if (hVar != null) {
                                h(hVar.f3318b, 256);
                            }
                            this.f3358p = hVarI;
                        }
                    } else {
                        if (motionEvent.getAction() != 10) {
                            motionEvent.toString();
                            return false;
                        }
                        h hVar2 = this.f3358p;
                        if (hVar2 != null) {
                            h(hVar2.f3318b, 256);
                            this.f3358p = null;
                        }
                    }
                    return true;
                }
                if (!z3) {
                    return this.f3347d.onAccessibilityHoverEvent(hVarI2.f3318b, motionEvent);
                }
            }
        }
        return false;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i3) {
        if (i3 == 1) {
            h hVar = this.n;
            if (hVar != null) {
                return createAccessibilityNodeInfo(hVar.f3318b);
            }
            Integer num = this.f3354k;
            if (num != null) {
                return createAccessibilityNodeInfo(num.intValue());
            }
        } else if (i3 != 2) {
            return null;
        }
        h hVar2 = this.f3352i;
        if (hVar2 != null) {
            return createAccessibilityNodeInfo(hVar2.f3318b);
        }
        Integer num2 = this.f3353j;
        if (num2 != null) {
            return createAccessibilityNodeInfo(num2.intValue());
        }
        return null;
    }

    public final boolean g(h hVar, int i3, Bundle bundle, boolean z3) {
        int i4;
        int i5 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z4 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i6 = hVar.f3328g;
        int i7 = hVar.f3329h;
        if (i7 >= 0 && i6 >= 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 4) {
                        if (i5 == 8 || i5 == 16) {
                            if (z3) {
                                hVar.f3329h = hVar.f3338r.length();
                            } else {
                                hVar.f3329h = 0;
                            }
                        }
                    } else if (z3 && i7 < hVar.f3338r.length()) {
                        Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(hVar.f3338r.substring(hVar.f3329h));
                        if (matcher.find()) {
                            hVar.f3329h += matcher.start(1);
                        } else {
                            hVar.f3329h = hVar.f3338r.length();
                        }
                    } else if (!z3 && hVar.f3329h > 0) {
                        Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(hVar.f3338r.substring(0, hVar.f3329h));
                        if (matcher2.find()) {
                            hVar.f3329h = matcher2.start(1);
                        } else {
                            hVar.f3329h = 0;
                        }
                    }
                } else if (z3 && i7 < hVar.f3338r.length()) {
                    Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(hVar.f3338r.substring(hVar.f3329h));
                    matcher3.find();
                    if (matcher3.find()) {
                        hVar.f3329h += matcher3.start(1);
                    } else {
                        hVar.f3329h = hVar.f3338r.length();
                    }
                } else if (!z3 && hVar.f3329h > 0) {
                    Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(hVar.f3338r.substring(0, hVar.f3329h));
                    if (matcher4.find()) {
                        hVar.f3329h = matcher4.start(1);
                    }
                }
            } else if (z3 && i7 < hVar.f3338r.length()) {
                hVar.f3329h++;
            } else if (!z3 && (i4 = hVar.f3329h) > 0) {
                hVar.f3329h = i4 - 1;
            }
            if (!z4) {
                hVar.f3328g = hVar.f3329h;
            }
        }
        if (i6 != hVar.f3328g || i7 != hVar.f3329h) {
            String str = hVar.f3338r;
            if (str == null) {
                str = StringUtils.EMPTY;
            }
            AccessibilityEvent accessibilityEventE = e(hVar.f3318b, 8192);
            accessibilityEventE.getText().add(str);
            accessibilityEventE.setFromIndex(hVar.f3328g);
            accessibilityEventE.setToIndex(hVar.f3329h);
            accessibilityEventE.setItemCount(str.length());
            i(accessibilityEventE);
        }
        A0.j jVar = this.f3345b;
        if (i5 == 1) {
            if (z3) {
                f fVar = f.u;
                if (h.a(hVar, fVar)) {
                    jVar.u(i3, fVar, Boolean.valueOf(z4));
                    return true;
                }
            }
            if (!z3) {
                f fVar2 = f.f3283v;
                if (h.a(hVar, fVar2)) {
                    jVar.u(i3, fVar2, Boolean.valueOf(z4));
                    return true;
                }
            }
        } else if (i5 == 2) {
            if (z3) {
                f fVar3 = f.f3269E;
                if (h.a(hVar, fVar3)) {
                    jVar.u(i3, fVar3, Boolean.valueOf(z4));
                    return true;
                }
            }
            if (!z3) {
                f fVar4 = f.f3270F;
                if (h.a(hVar, fVar4)) {
                    jVar.u(i3, fVar4, Boolean.valueOf(z4));
                    return true;
                }
            }
        } else if (i5 == 4 || i5 == 8 || i5 == 16) {
            return true;
        }
        return false;
    }

    public final void h(int i3, int i4) {
        if (this.f3346c.isEnabled()) {
            i(e(i3, i4));
        }
    }

    public final void i(AccessibilityEvent accessibilityEvent) {
        if (this.f3346c.isEnabled()) {
            View view = this.f3344a;
            view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public final void j(boolean z3) {
        if (this.f3362t == z3) {
            return;
        }
        this.f3362t = z3;
        if (z3) {
            this.f3355l |= 1;
        } else {
            this.f3355l &= -2;
        }
        ((FlutterJNI) this.f3345b.f58m).setAccessibilityFeatures(this.f3355l);
    }

    public final boolean k(h hVar) {
        if (hVar.f3331j > 1) {
            h hVar2 = this.f3352i;
            h hVar3 = null;
            if (hVar2 != null) {
                h hVar4 = hVar2.f3312V;
                while (true) {
                    if (hVar4 == null) {
                        hVar4 = null;
                        break;
                    }
                    if (hVar4 == hVar) {
                        break;
                    }
                    hVar4 = hVar4.f3312V;
                }
                if (hVar4 != null) {
                    return true;
                }
            }
            h hVar5 = this.f3352i;
            b bVar = new b();
            if (hVar5 != null) {
                for (h hVar6 = hVar5.f3312V; hVar6 != null; hVar6 = hVar6.f3312V) {
                    if (bVar.test(hVar6)) {
                        hVar3 = hVar6;
                        break;
                    }
                }
                if (hVar3 != null) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i3, int i4, Bundle bundle) {
        if (i3 >= 65536) {
            boolean zPerformAction = this.f3347d.performAction(i3, i4, bundle);
            if (zPerformAction && i4 == 128) {
                this.f3353j = null;
            }
            return zPerformAction;
        }
        Integer numValueOf = Integer.valueOf(i3);
        HashMap map = this.f3350g;
        h hVar = (h) map.get(numValueOf);
        if (hVar != null) {
            f fVar = f.f3280r;
            f fVar2 = f.f3281s;
            A0.j jVar = this.f3345b;
            switch (i4) {
                case 16:
                    jVar.t(i3, f.f3275l);
                    return true;
                case 32:
                    jVar.t(i3, f.f3276m);
                    return true;
                case 64:
                    if (this.f3352i == null) {
                        this.f3344a.invalidate();
                    }
                    this.f3352i = hVar;
                    jVar.t(i3, f.f3265A);
                    HashMap map2 = new HashMap();
                    map2.put("type", "didGainFocus");
                    map2.put("nodeId", Integer.valueOf(hVar.f3318b));
                    ((B1.s) jVar.f57l).x(map2, null);
                    h(i3, 32768);
                    if (!h.a(hVar, fVar) && !h.a(hVar, fVar2)) {
                        return true;
                    }
                    h(i3, 4);
                    return true;
                case 128:
                    h hVar2 = this.f3352i;
                    if (hVar2 != null && hVar2.f3318b == i3) {
                        this.f3352i = null;
                    }
                    Integer num = this.f3353j;
                    if (num != null && num.intValue() == i3) {
                        this.f3353j = null;
                    }
                    jVar.t(i3, f.f3266B);
                    h(i3, 65536);
                    return true;
                case 256:
                    return g(hVar, i3, bundle, true);
                case 512:
                    return g(hVar, i3, bundle, false);
                case 4096:
                    f fVar3 = f.f3278p;
                    if (h.a(hVar, fVar3)) {
                        jVar.t(i3, fVar3);
                        return true;
                    }
                    f fVar4 = f.n;
                    if (h.a(hVar, fVar4)) {
                        jVar.t(i3, fVar4);
                        return true;
                    }
                    if (h.a(hVar, fVar)) {
                        hVar.f3338r = hVar.f3340t;
                        hVar.f3339s = hVar.u;
                        h(i3, 4);
                        jVar.t(i3, fVar);
                        return true;
                    }
                    break;
                case 8192:
                    f fVar5 = f.f3279q;
                    if (h.a(hVar, fVar5)) {
                        jVar.t(i3, fVar5);
                        return true;
                    }
                    f fVar6 = f.f3277o;
                    if (h.a(hVar, fVar6)) {
                        jVar.t(i3, fVar6);
                        return true;
                    }
                    if (h.a(hVar, fVar2)) {
                        hVar.f3338r = hVar.f3341v;
                        hVar.f3339s = hVar.f3342w;
                        h(i3, 4);
                        jVar.t(i3, fVar2);
                        return true;
                    }
                    break;
                case 16384:
                    jVar.t(i3, f.x);
                    return true;
                case 32768:
                    jVar.t(i3, f.f3285z);
                    return true;
                case 65536:
                    jVar.t(i3, f.y);
                    return true;
                case 131072:
                    HashMap map3 = new HashMap();
                    if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                        map3.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                        map3.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                    } else {
                        map3.put("base", Integer.valueOf(hVar.f3329h));
                        map3.put("extent", Integer.valueOf(hVar.f3329h));
                    }
                    jVar.u(i3, f.f3284w, map3);
                    h hVar3 = (h) map.get(Integer.valueOf(i3));
                    hVar3.f3328g = ((Integer) map3.get("base")).intValue();
                    hVar3.f3329h = ((Integer) map3.get("extent")).intValue();
                    return true;
                case 262144:
                    jVar.t(i3, f.f3272H);
                    return true;
                case 524288:
                    jVar.t(i3, f.f3273I);
                    return true;
                case 1048576:
                    jVar.t(i3, f.f3268D);
                    return true;
                case 2097152:
                    String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? StringUtils.EMPTY : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                    jVar.u(i3, f.f3271G, string);
                    hVar.f3338r = string;
                    hVar.f3339s = null;
                    return true;
                case R.id.accessibilityActionShowOnScreen:
                    jVar.t(i3, f.f3282t);
                    return true;
                default:
                    g gVar = (g) this.f3351h.get(Integer.valueOf(i4 - 267386881));
                    if (gVar != null) {
                        jVar.u(i3, f.f3267C, Integer.valueOf(gVar.f3288b));
                        return true;
                    }
                    break;
            }
        }
        return false;
    }
}

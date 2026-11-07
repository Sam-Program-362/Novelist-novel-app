package io.flutter.view;

import android.R;
import android.content.ContentResolver;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
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

/* loaded from: classes.dex */
public final class i extends AccessibilityNodeProvider {
    public static final /* synthetic */ int y = 0;

    /* renamed from: a, reason: collision with root package name */
    public final View f3344a;

    /* renamed from: b, reason: collision with root package name */
    public final A0.j f3345b;

    /* renamed from: c, reason: collision with root package name */
    public final AccessibilityManager f3346c;

    /* renamed from: d, reason: collision with root package name */
    public final AccessibilityViewEmbedder f3347d;

    /* renamed from: e, reason: collision with root package name */
    public final io.flutter.plugin.platform.k f3348e;

    /* renamed from: f, reason: collision with root package name */
    public final ContentResolver f3349f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f3350g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f3351h;

    /* renamed from: i, reason: collision with root package name */
    public h f3352i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f3353j;

    /* renamed from: k, reason: collision with root package name */
    public Integer f3354k;

    /* renamed from: l, reason: collision with root package name */
    public int f3355l;

    /* renamed from: m, reason: collision with root package name */
    public String f3356m;
    public h n;

    /* renamed from: o, reason: collision with root package name */
    public h f3357o;

    /* renamed from: p, reason: collision with root package name */
    public h f3358p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f3359q;

    /* renamed from: r, reason: collision with root package name */
    public int f3360r;

    /* renamed from: s, reason: collision with root package name */
    public B1.a f3361s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3362t;
    public boolean u;

    /* renamed from: v, reason: collision with root package name */
    public final d f3363v;

    /* renamed from: w, reason: collision with root package name */
    public final e f3364w;
    public final T.a x;

    public i(View view, A0.j jVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.k kVar) {
        int i3;
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
            i3 = view.getResources().getConfiguration().fontWeightAdjustment;
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
        Integer valueOf = Integer.valueOf(i3);
        HashMap hashMap = this.f3351h;
        g gVar = (g) hashMap.get(valueOf);
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g();
        gVar2.f3289c = -1;
        gVar2.f3288b = i3;
        gVar2.f3287a = 267386881 + i3;
        hashMap.put(Integer.valueOf(i3), gVar2);
        return gVar2;
    }

    public final h c(int i3) {
        Integer valueOf = Integer.valueOf(i3);
        HashMap hashMap = this.f3350g;
        h hVar = (h) hashMap.get(valueOf);
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this);
        hVar2.f3318b = i3;
        hashMap.put(Integer.valueOf(i3), hVar2);
        return hVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05fa  */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int r20) {
        /*
            Method dump skipped, instructions count: 1582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.i.createAccessibilityNodeInfo(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    public final AccessibilityEvent e(int i3, int i4) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i4);
        View view = this.f3344a;
        obtain.setPackageName(view.getContext().getPackageName());
        obtain.setSource(view, i3);
        return obtain;
    }

    public final boolean f(MotionEvent motionEvent, boolean z3) {
        h i3;
        if (this.f3346c.isTouchExplorationEnabled()) {
            HashMap hashMap = this.f3350g;
            if (!hashMap.isEmpty()) {
                h i4 = ((h) hashMap.get(0)).i(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z3);
                if (i4 == null || i4.f3330i == -1) {
                    if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
                        float x = motionEvent.getX();
                        float y3 = motionEvent.getY();
                        if (!hashMap.isEmpty() && (i3 = ((h) hashMap.get(0)).i(new float[]{x, y3, 0.0f, 1.0f}, z3)) != this.f3358p) {
                            if (i3 != null) {
                                h(i3.f3318b, 128);
                            }
                            h hVar = this.f3358p;
                            if (hVar != null) {
                                h(hVar.f3318b, 256);
                            }
                            this.f3358p = i3;
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
                    return this.f3347d.onAccessibilityHoverEvent(i4.f3318b, motionEvent);
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
            AccessibilityEvent e3 = e(hVar.f3318b, 8192);
            e3.getText().add(str);
            e3.setFromIndex(hVar.f3328g);
            e3.setToIndex(hVar.f3329h);
            e3.setItemCount(str.length());
            i(e3);
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
                h hVar6 = hVar5.f3312V;
                while (true) {
                    if (hVar6 == null) {
                        break;
                    }
                    if (bVar.test(hVar6)) {
                        hVar3 = hVar6;
                        break;
                    }
                    hVar6 = hVar6.f3312V;
                }
                if (hVar3 != null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i3, int i4, Bundle bundle) {
        if (i3 >= 65536) {
            boolean performAction = this.f3347d.performAction(i3, i4, bundle);
            if (performAction && i4 == 128) {
                this.f3353j = null;
            }
            return performAction;
        }
        Integer valueOf = Integer.valueOf(i3);
        HashMap hashMap = this.f3350g;
        h hVar = (h) hashMap.get(valueOf);
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
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("type", "didGainFocus");
                    hashMap2.put("nodeId", Integer.valueOf(hVar.f3318b));
                    ((B1.s) jVar.f57l).x(hashMap2, null);
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
                    HashMap hashMap3 = new HashMap();
                    if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                        hashMap3.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                        hashMap3.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                    } else {
                        hashMap3.put("base", Integer.valueOf(hVar.f3329h));
                        hashMap3.put("extent", Integer.valueOf(hVar.f3329h));
                    }
                    jVar.u(i3, f.f3284w, hashMap3);
                    h hVar3 = (h) hashMap.get(Integer.valueOf(i3));
                    hVar3.f3328g = ((Integer) hashMap3.get("base")).intValue();
                    hVar3.f3329h = ((Integer) hashMap3.get("extent")).intValue();
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

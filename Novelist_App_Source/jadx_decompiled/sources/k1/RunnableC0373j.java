package k1;

import B1.o;
import B1.s;
import android.database.Cursor;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import l1.C0417a;
import l1.C0418b;
import t.AbstractC0468a;

/* renamed from: k1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0373j implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3845k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ A.c f3846l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o f3847m;
    public final /* synthetic */ C0368e n;

    public /* synthetic */ RunnableC0373j(A.c cVar, o oVar, C0368e c0368e, int i3) {
        this.f3845k = i3;
        this.f3846l = cVar;
        this.f3847m = oVar;
        this.n = c0368e;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.f3845k;
        final int i4 = 3;
        final int i5 = 2;
        final int i6 = 1;
        final int i7 = 0;
        o oVar = this.f3847m;
        A.c cVar = this.f3846l;
        final C0368e c0368e = this.n;
        switch (i3) {
            case 0:
                HashMap hashMap = C0375l.f3855m;
                final C0418b c0418b = new C0418b(cVar, oVar);
                c0368e.m(c0418b, new Runnable() { // from class: k1.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                C0368e c0368e2 = c0368e;
                                HashMap hashMap2 = c0368e2.f3827g;
                                C0418b c0418b2 = c0418b;
                                A.c cVar2 = c0418b2.n;
                                Integer num = (Integer) cVar2.i("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(cVar2.i("cancel"));
                                if (AbstractC0364a.a(c0368e2.f3824d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(c0368e2.i());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    sb.append(equals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                C0372i c0372i = null;
                                if (equals) {
                                    C0372i c0372i2 = (C0372i) hashMap2.get(num);
                                    if (c0372i2 != null) {
                                        c0368e2.c(c0372i2);
                                    }
                                    c0418b2.p(null);
                                    return;
                                }
                                C0372i c0372i3 = (C0372i) hashMap2.get(num);
                                boolean z3 = false;
                                try {
                                    try {
                                        if (c0372i3 == null) {
                                            throw new IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        Cursor cursor = c0372i3.f3844c;
                                        HashMap d3 = C0368e.d(cursor, Integer.valueOf(c0372i3.f3843b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z3 = true;
                                        }
                                        if (z3) {
                                            d3.put("cursorId", num);
                                        }
                                        c0418b2.p(d3);
                                        if (z3) {
                                            return;
                                        }
                                        c0368e2.c(c0372i3);
                                        return;
                                    } catch (Exception e3) {
                                        c0368e2.j(e3, c0418b2);
                                        if (c0372i3 != null) {
                                            c0368e2.c(c0372i3);
                                        } else {
                                            c0372i = c0372i3;
                                        }
                                        if (0 != 0 || c0372i == null) {
                                            return;
                                        }
                                        c0368e2.c(c0372i);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && c0372i3 != null) {
                                        c0368e2.c(c0372i3);
                                    }
                                    throw th;
                                }
                            case 1:
                                c0368e.f(c0418b);
                                return;
                            case 2:
                                c0368e.g(c0418b);
                                return;
                            case 3:
                                c0368e.e(c0418b);
                                return;
                            default:
                                C0418b c0418b3 = c0418b;
                                Object x = c0418b3.x("inTransaction");
                                Boolean bool = x instanceof Boolean ? (Boolean) x : null;
                                boolean z4 = Boolean.TRUE.equals(bool) && c0418b3.F() && ((Integer) c0418b3.x("transactionId")) == null;
                                C0368e c0368e3 = c0368e;
                                if (z4) {
                                    int i8 = c0368e3.f3831k + 1;
                                    c0368e3.f3831k = i8;
                                    c0368e3.f3832l = Integer.valueOf(i8);
                                }
                                if (!c0368e3.h(c0418b3)) {
                                    if (z4) {
                                        c0368e3.f3832l = null;
                                        return;
                                    }
                                    return;
                                } else if (z4) {
                                    HashMap hashMap3 = new HashMap();
                                    hashMap3.put("transactionId", c0368e3.f3832l);
                                    c0418b3.p(hashMap3);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        c0368e3.f3832l = null;
                                    }
                                    c0418b3.p(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                HashMap hashMap2 = C0375l.f3855m;
                final C0418b c0418b2 = new C0418b(cVar, oVar);
                c0368e.m(c0418b2, new Runnable() { // from class: k1.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i4) {
                            case 0:
                                C0368e c0368e2 = c0368e;
                                HashMap hashMap22 = c0368e2.f3827g;
                                C0418b c0418b22 = c0418b2;
                                A.c cVar2 = c0418b22.n;
                                Integer num = (Integer) cVar2.i("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(cVar2.i("cancel"));
                                if (AbstractC0364a.a(c0368e2.f3824d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(c0368e2.i());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    sb.append(equals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                C0372i c0372i = null;
                                if (equals) {
                                    C0372i c0372i2 = (C0372i) hashMap22.get(num);
                                    if (c0372i2 != null) {
                                        c0368e2.c(c0372i2);
                                    }
                                    c0418b22.p(null);
                                    return;
                                }
                                C0372i c0372i3 = (C0372i) hashMap22.get(num);
                                boolean z3 = false;
                                try {
                                    try {
                                        if (c0372i3 == null) {
                                            throw new IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        Cursor cursor = c0372i3.f3844c;
                                        HashMap d3 = C0368e.d(cursor, Integer.valueOf(c0372i3.f3843b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z3 = true;
                                        }
                                        if (z3) {
                                            d3.put("cursorId", num);
                                        }
                                        c0418b22.p(d3);
                                        if (z3) {
                                            return;
                                        }
                                        c0368e2.c(c0372i3);
                                        return;
                                    } catch (Exception e3) {
                                        c0368e2.j(e3, c0418b22);
                                        if (c0372i3 != null) {
                                            c0368e2.c(c0372i3);
                                        } else {
                                            c0372i = c0372i3;
                                        }
                                        if (0 != 0 || c0372i == null) {
                                            return;
                                        }
                                        c0368e2.c(c0372i);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && c0372i3 != null) {
                                        c0368e2.c(c0372i3);
                                    }
                                    throw th;
                                }
                            case 1:
                                c0368e.f(c0418b2);
                                return;
                            case 2:
                                c0368e.g(c0418b2);
                                return;
                            case 3:
                                c0368e.e(c0418b2);
                                return;
                            default:
                                C0418b c0418b3 = c0418b2;
                                Object x = c0418b3.x("inTransaction");
                                Boolean bool = x instanceof Boolean ? (Boolean) x : null;
                                boolean z4 = Boolean.TRUE.equals(bool) && c0418b3.F() && ((Integer) c0418b3.x("transactionId")) == null;
                                C0368e c0368e3 = c0368e;
                                if (z4) {
                                    int i8 = c0368e3.f3831k + 1;
                                    c0368e3.f3831k = i8;
                                    c0368e3.f3832l = Integer.valueOf(i8);
                                }
                                if (!c0368e3.h(c0418b3)) {
                                    if (z4) {
                                        c0368e3.f3832l = null;
                                        return;
                                    }
                                    return;
                                } else if (z4) {
                                    HashMap hashMap3 = new HashMap();
                                    hashMap3.put("transactionId", c0368e3.f3832l);
                                    c0418b3.p(hashMap3);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        c0368e3.f3832l = null;
                                    }
                                    c0418b3.p(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 2:
                HashMap hashMap3 = C0375l.f3855m;
                final C0418b c0418b3 = new C0418b(cVar, oVar);
                c0368e.m(c0418b3, new Runnable() { // from class: k1.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i6) {
                            case 0:
                                C0368e c0368e2 = c0368e;
                                HashMap hashMap22 = c0368e2.f3827g;
                                C0418b c0418b22 = c0418b3;
                                A.c cVar2 = c0418b22.n;
                                Integer num = (Integer) cVar2.i("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(cVar2.i("cancel"));
                                if (AbstractC0364a.a(c0368e2.f3824d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(c0368e2.i());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    sb.append(equals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                C0372i c0372i = null;
                                if (equals) {
                                    C0372i c0372i2 = (C0372i) hashMap22.get(num);
                                    if (c0372i2 != null) {
                                        c0368e2.c(c0372i2);
                                    }
                                    c0418b22.p(null);
                                    return;
                                }
                                C0372i c0372i3 = (C0372i) hashMap22.get(num);
                                boolean z3 = false;
                                try {
                                    try {
                                        if (c0372i3 == null) {
                                            throw new IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        Cursor cursor = c0372i3.f3844c;
                                        HashMap d3 = C0368e.d(cursor, Integer.valueOf(c0372i3.f3843b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z3 = true;
                                        }
                                        if (z3) {
                                            d3.put("cursorId", num);
                                        }
                                        c0418b22.p(d3);
                                        if (z3) {
                                            return;
                                        }
                                        c0368e2.c(c0372i3);
                                        return;
                                    } catch (Exception e3) {
                                        c0368e2.j(e3, c0418b22);
                                        if (c0372i3 != null) {
                                            c0368e2.c(c0372i3);
                                        } else {
                                            c0372i = c0372i3;
                                        }
                                        if (0 != 0 || c0372i == null) {
                                            return;
                                        }
                                        c0368e2.c(c0372i);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && c0372i3 != null) {
                                        c0368e2.c(c0372i3);
                                    }
                                    throw th;
                                }
                            case 1:
                                c0368e.f(c0418b3);
                                return;
                            case 2:
                                c0368e.g(c0418b3);
                                return;
                            case 3:
                                c0368e.e(c0418b3);
                                return;
                            default:
                                C0418b c0418b32 = c0418b3;
                                Object x = c0418b32.x("inTransaction");
                                Boolean bool = x instanceof Boolean ? (Boolean) x : null;
                                boolean z4 = Boolean.TRUE.equals(bool) && c0418b32.F() && ((Integer) c0418b32.x("transactionId")) == null;
                                C0368e c0368e3 = c0368e;
                                if (z4) {
                                    int i8 = c0368e3.f3831k + 1;
                                    c0368e3.f3831k = i8;
                                    c0368e3.f3832l = Integer.valueOf(i8);
                                }
                                if (!c0368e3.h(c0418b32)) {
                                    if (z4) {
                                        c0368e3.f3832l = null;
                                        return;
                                    }
                                    return;
                                } else if (z4) {
                                    HashMap hashMap32 = new HashMap();
                                    hashMap32.put("transactionId", c0368e3.f3832l);
                                    c0418b32.p(hashMap32);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        c0368e3.f3832l = null;
                                    }
                                    c0418b32.p(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 3:
                HashMap hashMap4 = C0375l.f3855m;
                try {
                    c0368e.f3829i.setLocale(Locale.forLanguageTag((String) cVar.i("locale")));
                    oVar.d(null);
                    break;
                } catch (Exception e3) {
                    oVar.a("sqlite_error", "Error calling setLocale: " + e3.getMessage(), null);
                    return;
                }
            case 4:
                HashMap hashMap5 = C0375l.f3855m;
                final C0418b c0418b4 = new C0418b(cVar, oVar);
                final int i8 = 4;
                c0368e.m(c0418b4, new Runnable() { // from class: k1.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i8) {
                            case 0:
                                C0368e c0368e2 = c0368e;
                                HashMap hashMap22 = c0368e2.f3827g;
                                C0418b c0418b22 = c0418b4;
                                A.c cVar2 = c0418b22.n;
                                Integer num = (Integer) cVar2.i("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(cVar2.i("cancel"));
                                if (AbstractC0364a.a(c0368e2.f3824d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(c0368e2.i());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    sb.append(equals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                C0372i c0372i = null;
                                if (equals) {
                                    C0372i c0372i2 = (C0372i) hashMap22.get(num);
                                    if (c0372i2 != null) {
                                        c0368e2.c(c0372i2);
                                    }
                                    c0418b22.p(null);
                                    return;
                                }
                                C0372i c0372i3 = (C0372i) hashMap22.get(num);
                                boolean z3 = false;
                                try {
                                    try {
                                        if (c0372i3 == null) {
                                            throw new IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        Cursor cursor = c0372i3.f3844c;
                                        HashMap d3 = C0368e.d(cursor, Integer.valueOf(c0372i3.f3843b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z3 = true;
                                        }
                                        if (z3) {
                                            d3.put("cursorId", num);
                                        }
                                        c0418b22.p(d3);
                                        if (z3) {
                                            return;
                                        }
                                        c0368e2.c(c0372i3);
                                        return;
                                    } catch (Exception e32) {
                                        c0368e2.j(e32, c0418b22);
                                        if (c0372i3 != null) {
                                            c0368e2.c(c0372i3);
                                        } else {
                                            c0372i = c0372i3;
                                        }
                                        if (0 != 0 || c0372i == null) {
                                            return;
                                        }
                                        c0368e2.c(c0372i);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && c0372i3 != null) {
                                        c0368e2.c(c0372i3);
                                    }
                                    throw th;
                                }
                            case 1:
                                c0368e.f(c0418b4);
                                return;
                            case 2:
                                c0368e.g(c0418b4);
                                return;
                            case 3:
                                c0368e.e(c0418b4);
                                return;
                            default:
                                C0418b c0418b32 = c0418b4;
                                Object x = c0418b32.x("inTransaction");
                                Boolean bool = x instanceof Boolean ? (Boolean) x : null;
                                boolean z4 = Boolean.TRUE.equals(bool) && c0418b32.F() && ((Integer) c0418b32.x("transactionId")) == null;
                                C0368e c0368e3 = c0368e;
                                if (z4) {
                                    int i82 = c0368e3.f3831k + 1;
                                    c0368e3.f3831k = i82;
                                    c0368e3.f3832l = Integer.valueOf(i82);
                                }
                                if (!c0368e3.h(c0418b32)) {
                                    if (z4) {
                                        c0368e3.f3832l = null;
                                        return;
                                    }
                                    return;
                                } else if (z4) {
                                    HashMap hashMap32 = new HashMap();
                                    hashMap32.put("transactionId", c0368e3.f3832l);
                                    c0418b32.p(hashMap32);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        c0368e3.f3832l = null;
                                    }
                                    c0418b32.p(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 5:
                HashMap hashMap6 = C0375l.f3855m;
                final C0418b c0418b5 = new C0418b(cVar, oVar);
                c0368e.m(c0418b5, new Runnable() { // from class: k1.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i5) {
                            case 0:
                                C0368e c0368e2 = c0368e;
                                HashMap hashMap22 = c0368e2.f3827g;
                                C0418b c0418b22 = c0418b5;
                                A.c cVar2 = c0418b22.n;
                                Integer num = (Integer) cVar2.i("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(cVar2.i("cancel"));
                                if (AbstractC0364a.a(c0368e2.f3824d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(c0368e2.i());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    sb.append(equals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                C0372i c0372i = null;
                                if (equals) {
                                    C0372i c0372i2 = (C0372i) hashMap22.get(num);
                                    if (c0372i2 != null) {
                                        c0368e2.c(c0372i2);
                                    }
                                    c0418b22.p(null);
                                    return;
                                }
                                C0372i c0372i3 = (C0372i) hashMap22.get(num);
                                boolean z3 = false;
                                try {
                                    try {
                                        if (c0372i3 == null) {
                                            throw new IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        Cursor cursor = c0372i3.f3844c;
                                        HashMap d3 = C0368e.d(cursor, Integer.valueOf(c0372i3.f3843b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z3 = true;
                                        }
                                        if (z3) {
                                            d3.put("cursorId", num);
                                        }
                                        c0418b22.p(d3);
                                        if (z3) {
                                            return;
                                        }
                                        c0368e2.c(c0372i3);
                                        return;
                                    } catch (Exception e32) {
                                        c0368e2.j(e32, c0418b22);
                                        if (c0372i3 != null) {
                                            c0368e2.c(c0372i3);
                                        } else {
                                            c0372i = c0372i3;
                                        }
                                        if (0 != 0 || c0372i == null) {
                                            return;
                                        }
                                        c0368e2.c(c0372i);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && c0372i3 != null) {
                                        c0368e2.c(c0372i3);
                                    }
                                    throw th;
                                }
                            case 1:
                                c0368e.f(c0418b5);
                                return;
                            case 2:
                                c0368e.g(c0418b5);
                                return;
                            case 3:
                                c0368e.e(c0418b5);
                                return;
                            default:
                                C0418b c0418b32 = c0418b5;
                                Object x = c0418b32.x("inTransaction");
                                Boolean bool = x instanceof Boolean ? (Boolean) x : null;
                                boolean z4 = Boolean.TRUE.equals(bool) && c0418b32.F() && ((Integer) c0418b32.x("transactionId")) == null;
                                C0368e c0368e3 = c0368e;
                                if (z4) {
                                    int i82 = c0368e3.f3831k + 1;
                                    c0368e3.f3831k = i82;
                                    c0368e3.f3832l = Integer.valueOf(i82);
                                }
                                if (!c0368e3.h(c0418b32)) {
                                    if (z4) {
                                        c0368e3.f3832l = null;
                                        return;
                                    }
                                    return;
                                } else if (z4) {
                                    HashMap hashMap32 = new HashMap();
                                    hashMap32.put("transactionId", c0368e3.f3832l);
                                    c0418b32.p(hashMap32);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        c0368e3.f3832l = null;
                                    }
                                    c0418b32.p(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                HashMap hashMap7 = C0375l.f3855m;
                Boolean bool = Boolean.TRUE;
                boolean equals = bool.equals(cVar.i("noResult"));
                boolean equals2 = bool.equals(cVar.i("continueOnError"));
                List list = (List) cVar.i("operations");
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    C0417a c0417a = new C0417a((Map) it2.next(), equals);
                    String A2 = c0417a.A();
                    A2.getClass();
                    char c3 = 65535;
                    switch (A2.hashCode()) {
                        case -1319569547:
                            if (A2.equals("execute")) {
                                c3 = 0;
                                break;
                            }
                            break;
                        case -1183792455:
                            if (A2.equals("insert")) {
                                c3 = 1;
                                break;
                            }
                            break;
                        case -838846263:
                            if (A2.equals("update")) {
                                c3 = 2;
                                break;
                            }
                            break;
                        case 107944136:
                            if (A2.equals("query")) {
                                c3 = 3;
                                break;
                            }
                            break;
                    }
                    s sVar = c0417a.n;
                    switch (c3) {
                        case 0:
                            if (!c0368e.h(c0417a)) {
                                if (!equals2) {
                                    oVar.a((String) sVar.f144k, (String) sVar.f145l, sVar.n);
                                    break;
                                } else {
                                    c0417a.W(arrayList);
                                    break;
                                }
                            } else {
                                c0417a.p(null);
                                c0417a.X(arrayList);
                                break;
                            }
                        case 1:
                            if (!c0368e.e(c0417a)) {
                                if (!equals2) {
                                    oVar.a((String) sVar.f144k, (String) sVar.f145l, sVar.n);
                                    break;
                                } else {
                                    c0417a.W(arrayList);
                                    break;
                                }
                            } else {
                                c0417a.X(arrayList);
                                break;
                            }
                        case 2:
                            if (!c0368e.g(c0417a)) {
                                if (!equals2) {
                                    oVar.a((String) sVar.f144k, (String) sVar.f145l, sVar.n);
                                    break;
                                } else {
                                    c0417a.W(arrayList);
                                    break;
                                }
                            } else {
                                c0417a.X(arrayList);
                                break;
                            }
                        case 3:
                            if (!c0368e.f(c0417a)) {
                                if (!equals2) {
                                    oVar.a((String) sVar.f144k, (String) sVar.f145l, sVar.n);
                                    break;
                                } else {
                                    c0417a.W(arrayList);
                                    break;
                                }
                            } else {
                                c0417a.X(arrayList);
                                break;
                            }
                        default:
                            oVar.a("bad_param", AbstractC0468a.b("Batch method '", A2, "' not supported"), null);
                            break;
                    }
                }
                if (!equals) {
                    oVar.d(arrayList);
                    break;
                } else {
                    oVar.d(null);
                    break;
                }
        }
    }

    public /* synthetic */ RunnableC0373j(A.c cVar, C0368e c0368e, o oVar) {
        this.f3845k = 3;
        this.f3846l = cVar;
        this.n = c0368e;
        this.f3847m = oVar;
    }

    public /* synthetic */ RunnableC0373j(C0368e c0368e, A.c cVar, o oVar) {
        this.f3845k = 6;
        this.n = c0368e;
        this.f3846l = cVar;
        this.f3847m = oVar;
    }
}

package p033k1;

import A.c;
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
import p036l1.a;
import p036l1.b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3845k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f3846l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o f3847m;
    public final /* synthetic */ e n;

    public /* synthetic */ j(c cVar, o oVar, e eVar, int i3) {
        this.f3845k = i3;
        this.f3846l = cVar;
        this.f3847m = oVar;
        this.n = eVar;
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
        c cVar = this.f3846l;
        final e eVar = this.n;
        switch (i3) {
            case 0:
                HashMap map = l.f3855m;
                final b bVar = new b(cVar, oVar);
                eVar.m(bVar, new Runnable() { // from class: k1.b
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
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        switch (i7) {
                            case 0:
                                e eVar2 = eVar;
                                HashMap map2 = eVar2.f3827g;
                                p036l1.b bVar2 = bVar;
                                c cVar2 = bVar2.n;
                                Integer num = (Integer) cVar2.i("cursorId");
                                int iIntValue = num.intValue();
                                boolean zEquals = Boolean.TRUE.equals(cVar2.i("cancel"));
                                if (a.a(eVar2.f3824d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(eVar2.i());
                                    sb.append("cursor ");
                                    sb.append(iIntValue);
                                    sb.append(zEquals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                i iVar = null;
                                if (zEquals) {
                                    i iVar2 = (i) map2.get(num);
                                    if (iVar2 != null) {
                                        eVar2.c(iVar2);
                                    }
                                    bVar2.p(null);
                                    return;
                                }
                                i iVar3 = (i) map2.get(num);
                                boolean z3 = false;
                                try {
                                    try {
                                        if (iVar3 == null) {
                                            throw new IllegalStateException("Cursor " + iIntValue + " not found");
                                        }
                                        Cursor cursor = iVar3.f3844c;
                                        HashMap mapD = e.d(cursor, Integer.valueOf(iVar3.f3843b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z3 = true;
                                        }
                                        if (z3) {
                                            mapD.put("cursorId", num);
                                        }
                                        bVar2.p(mapD);
                                        if (z3) {
                                            return;
                                        }
                                        eVar2.c(iVar3);
                                        return;
                                    } catch (Exception e3) {
                                        eVar2.j(e3, bVar2);
                                        if (iVar3 != null) {
                                            eVar2.c(iVar3);
                                        } else {
                                            iVar = iVar3;
                                        }
                                        if (0 != 0 || iVar == null) {
                                            return;
                                        }
                                        eVar2.c(iVar);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && iVar3 != null) {
                                        eVar2.c(iVar3);
                                    }
                                    throw th;
                                }
                            case 1:
                                eVar.f(bVar);
                                return;
                            case 2:
                                eVar.g(bVar);
                                return;
                            case 3:
                                eVar.e(bVar);
                                return;
                            default:
                                p036l1.b bVar3 = bVar;
                                Object objX = bVar3.x("inTransaction");
                                Boolean bool = objX instanceof Boolean ? (Boolean) objX : null;
                                boolean z4 = Boolean.TRUE.equals(bool) && bVar3.F() && ((Integer) bVar3.x("transactionId")) == null;
                                e eVar3 = eVar;
                                if (z4) {
                                    int i8 = eVar3.f3831k + 1;
                                    eVar3.f3831k = i8;
                                    eVar3.f3832l = Integer.valueOf(i8);
                                }
                                if (!eVar3.h(bVar3)) {
                                    if (z4) {
                                        eVar3.f3832l = null;
                                        return;
                                    }
                                    return;
                                } else if (z4) {
                                    HashMap map3 = new HashMap();
                                    map3.put("transactionId", eVar3.f3832l);
                                    bVar3.p(map3);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        eVar3.f3832l = null;
                                    }
                                    bVar3.p(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                HashMap map2 = l.f3855m;
                final b bVar2 = new b(cVar, oVar);
                eVar.m(bVar2, new Runnable() { // from class: k1.b
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
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        switch (i4) {
                            case 0:
                                e eVar2 = eVar;
                                HashMap map3 = eVar2.f3827g;
                                p036l1.b bVar3 = bVar2;
                                c cVar2 = bVar3.n;
                                Integer num = (Integer) cVar2.i("cursorId");
                                int iIntValue = num.intValue();
                                boolean zEquals = Boolean.TRUE.equals(cVar2.i("cancel"));
                                if (a.a(eVar2.f3824d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(eVar2.i());
                                    sb.append("cursor ");
                                    sb.append(iIntValue);
                                    sb.append(zEquals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                i iVar = null;
                                if (zEquals) {
                                    i iVar2 = (i) map3.get(num);
                                    if (iVar2 != null) {
                                        eVar2.c(iVar2);
                                    }
                                    bVar3.p(null);
                                    return;
                                }
                                i iVar3 = (i) map3.get(num);
                                boolean z3 = false;
                                try {
                                    try {
                                        if (iVar3 == null) {
                                            throw new IllegalStateException("Cursor " + iIntValue + " not found");
                                        }
                                        Cursor cursor = iVar3.f3844c;
                                        HashMap mapD = e.d(cursor, Integer.valueOf(iVar3.f3843b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z3 = true;
                                        }
                                        if (z3) {
                                            mapD.put("cursorId", num);
                                        }
                                        bVar3.p(mapD);
                                        if (z3) {
                                            return;
                                        }
                                        eVar2.c(iVar3);
                                        return;
                                    } catch (Exception e3) {
                                        eVar2.j(e3, bVar3);
                                        if (iVar3 != null) {
                                            eVar2.c(iVar3);
                                        } else {
                                            iVar = iVar3;
                                        }
                                        if (0 != 0 || iVar == null) {
                                            return;
                                        }
                                        eVar2.c(iVar);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && iVar3 != null) {
                                        eVar2.c(iVar3);
                                    }
                                    throw th;
                                }
                            case 1:
                                eVar.f(bVar2);
                                return;
                            case 2:
                                eVar.g(bVar2);
                                return;
                            case 3:
                                eVar.e(bVar2);
                                return;
                            default:
                                p036l1.b bVar4 = bVar2;
                                Object objX = bVar4.x("inTransaction");
                                Boolean bool = objX instanceof Boolean ? (Boolean) objX : null;
                                boolean z4 = Boolean.TRUE.equals(bool) && bVar4.F() && ((Integer) bVar4.x("transactionId")) == null;
                                e eVar3 = eVar;
                                if (z4) {
                                    int i8 = eVar3.f3831k + 1;
                                    eVar3.f3831k = i8;
                                    eVar3.f3832l = Integer.valueOf(i8);
                                }
                                if (!eVar3.h(bVar4)) {
                                    if (z4) {
                                        eVar3.f3832l = null;
                                        return;
                                    }
                                    return;
                                } else if (z4) {
                                    HashMap map4 = new HashMap();
                                    map4.put("transactionId", eVar3.f3832l);
                                    bVar4.p(map4);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        eVar3.f3832l = null;
                                    }
                                    bVar4.p(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 2:
                HashMap map3 = l.f3855m;
                final b bVar3 = new b(cVar, oVar);
                eVar.m(bVar3, new Runnable() { // from class: k1.b
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
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        switch (i6) {
                            case 0:
                                e eVar2 = eVar;
                                HashMap map4 = eVar2.f3827g;
                                p036l1.b bVar4 = bVar3;
                                c cVar2 = bVar4.n;
                                Integer num = (Integer) cVar2.i("cursorId");
                                int iIntValue = num.intValue();
                                boolean zEquals = Boolean.TRUE.equals(cVar2.i("cancel"));
                                if (a.a(eVar2.f3824d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(eVar2.i());
                                    sb.append("cursor ");
                                    sb.append(iIntValue);
                                    sb.append(zEquals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                i iVar = null;
                                if (zEquals) {
                                    i iVar2 = (i) map4.get(num);
                                    if (iVar2 != null) {
                                        eVar2.c(iVar2);
                                    }
                                    bVar4.p(null);
                                    return;
                                }
                                i iVar3 = (i) map4.get(num);
                                boolean z3 = false;
                                try {
                                    try {
                                        if (iVar3 == null) {
                                            throw new IllegalStateException("Cursor " + iIntValue + " not found");
                                        }
                                        Cursor cursor = iVar3.f3844c;
                                        HashMap mapD = e.d(cursor, Integer.valueOf(iVar3.f3843b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z3 = true;
                                        }
                                        if (z3) {
                                            mapD.put("cursorId", num);
                                        }
                                        bVar4.p(mapD);
                                        if (z3) {
                                            return;
                                        }
                                        eVar2.c(iVar3);
                                        return;
                                    } catch (Exception e3) {
                                        eVar2.j(e3, bVar4);
                                        if (iVar3 != null) {
                                            eVar2.c(iVar3);
                                        } else {
                                            iVar = iVar3;
                                        }
                                        if (0 != 0 || iVar == null) {
                                            return;
                                        }
                                        eVar2.c(iVar);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && iVar3 != null) {
                                        eVar2.c(iVar3);
                                    }
                                    throw th;
                                }
                            case 1:
                                eVar.f(bVar3);
                                return;
                            case 2:
                                eVar.g(bVar3);
                                return;
                            case 3:
                                eVar.e(bVar3);
                                return;
                            default:
                                p036l1.b bVar5 = bVar3;
                                Object objX = bVar5.x("inTransaction");
                                Boolean bool = objX instanceof Boolean ? (Boolean) objX : null;
                                boolean z4 = Boolean.TRUE.equals(bool) && bVar5.F() && ((Integer) bVar5.x("transactionId")) == null;
                                e eVar3 = eVar;
                                if (z4) {
                                    int i8 = eVar3.f3831k + 1;
                                    eVar3.f3831k = i8;
                                    eVar3.f3832l = Integer.valueOf(i8);
                                }
                                if (!eVar3.h(bVar5)) {
                                    if (z4) {
                                        eVar3.f3832l = null;
                                        return;
                                    }
                                    return;
                                } else if (z4) {
                                    HashMap map5 = new HashMap();
                                    map5.put("transactionId", eVar3.f3832l);
                                    bVar5.p(map5);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        eVar3.f3832l = null;
                                    }
                                    bVar5.p(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 3:
                HashMap map4 = l.f3855m;
                try {
                    eVar.f3829i.setLocale(Locale.forLanguageTag((String) cVar.i("locale")));
                    oVar.d(null);
                } catch (Exception e3) {
                    oVar.a("sqlite_error", "Error calling setLocale: " + e3.getMessage(), null);
                    return;
                }
                break;
            case 4:
                HashMap map5 = l.f3855m;
                final b bVar4 = new b(cVar, oVar);
                final int i8 = 4;
                eVar.m(bVar4, new Runnable() { // from class: k1.b
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
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        switch (i8) {
                            case 0:
                                e eVar2 = eVar;
                                HashMap map6 = eVar2.f3827g;
                                p036l1.b bVar5 = bVar4;
                                c cVar2 = bVar5.n;
                                Integer num = (Integer) cVar2.i("cursorId");
                                int iIntValue = num.intValue();
                                boolean zEquals = Boolean.TRUE.equals(cVar2.i("cancel"));
                                if (a.a(eVar2.f3824d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(eVar2.i());
                                    sb.append("cursor ");
                                    sb.append(iIntValue);
                                    sb.append(zEquals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                i iVar = null;
                                if (zEquals) {
                                    i iVar2 = (i) map6.get(num);
                                    if (iVar2 != null) {
                                        eVar2.c(iVar2);
                                    }
                                    bVar5.p(null);
                                    return;
                                }
                                i iVar3 = (i) map6.get(num);
                                boolean z3 = false;
                                try {
                                    try {
                                        if (iVar3 == null) {
                                            throw new IllegalStateException("Cursor " + iIntValue + " not found");
                                        }
                                        Cursor cursor = iVar3.f3844c;
                                        HashMap mapD = e.d(cursor, Integer.valueOf(iVar3.f3843b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z3 = true;
                                        }
                                        if (z3) {
                                            mapD.put("cursorId", num);
                                        }
                                        bVar5.p(mapD);
                                        if (z3) {
                                            return;
                                        }
                                        eVar2.c(iVar3);
                                        return;
                                    } catch (Exception e4) {
                                        eVar2.j(e4, bVar5);
                                        if (iVar3 != null) {
                                            eVar2.c(iVar3);
                                        } else {
                                            iVar = iVar3;
                                        }
                                        if (0 != 0 || iVar == null) {
                                            return;
                                        }
                                        eVar2.c(iVar);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && iVar3 != null) {
                                        eVar2.c(iVar3);
                                    }
                                    throw th;
                                }
                            case 1:
                                eVar.f(bVar4);
                                return;
                            case 2:
                                eVar.g(bVar4);
                                return;
                            case 3:
                                eVar.e(bVar4);
                                return;
                            default:
                                p036l1.b bVar6 = bVar4;
                                Object objX = bVar6.x("inTransaction");
                                Boolean bool = objX instanceof Boolean ? (Boolean) objX : null;
                                boolean z4 = Boolean.TRUE.equals(bool) && bVar6.F() && ((Integer) bVar6.x("transactionId")) == null;
                                e eVar3 = eVar;
                                if (z4) {
                                    int i9 = eVar3.f3831k + 1;
                                    eVar3.f3831k = i9;
                                    eVar3.f3832l = Integer.valueOf(i9);
                                }
                                if (!eVar3.h(bVar6)) {
                                    if (z4) {
                                        eVar3.f3832l = null;
                                        return;
                                    }
                                    return;
                                } else if (z4) {
                                    HashMap map7 = new HashMap();
                                    map7.put("transactionId", eVar3.f3832l);
                                    bVar6.p(map7);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        eVar3.f3832l = null;
                                    }
                                    bVar6.p(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 5:
                HashMap map6 = l.f3855m;
                final b bVar5 = new b(cVar, oVar);
                eVar.m(bVar5, new Runnable() { // from class: k1.b
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
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        switch (i5) {
                            case 0:
                                e eVar2 = eVar;
                                HashMap map7 = eVar2.f3827g;
                                p036l1.b bVar6 = bVar5;
                                c cVar2 = bVar6.n;
                                Integer num = (Integer) cVar2.i("cursorId");
                                int iIntValue = num.intValue();
                                boolean zEquals = Boolean.TRUE.equals(cVar2.i("cancel"));
                                if (a.a(eVar2.f3824d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(eVar2.i());
                                    sb.append("cursor ");
                                    sb.append(iIntValue);
                                    sb.append(zEquals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                i iVar = null;
                                if (zEquals) {
                                    i iVar2 = (i) map7.get(num);
                                    if (iVar2 != null) {
                                        eVar2.c(iVar2);
                                    }
                                    bVar6.p(null);
                                    return;
                                }
                                i iVar3 = (i) map7.get(num);
                                boolean z3 = false;
                                try {
                                    try {
                                        if (iVar3 == null) {
                                            throw new IllegalStateException("Cursor " + iIntValue + " not found");
                                        }
                                        Cursor cursor = iVar3.f3844c;
                                        HashMap mapD = e.d(cursor, Integer.valueOf(iVar3.f3843b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z3 = true;
                                        }
                                        if (z3) {
                                            mapD.put("cursorId", num);
                                        }
                                        bVar6.p(mapD);
                                        if (z3) {
                                            return;
                                        }
                                        eVar2.c(iVar3);
                                        return;
                                    } catch (Exception e4) {
                                        eVar2.j(e4, bVar6);
                                        if (iVar3 != null) {
                                            eVar2.c(iVar3);
                                        } else {
                                            iVar = iVar3;
                                        }
                                        if (0 != 0 || iVar == null) {
                                            return;
                                        }
                                        eVar2.c(iVar);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && iVar3 != null) {
                                        eVar2.c(iVar3);
                                    }
                                    throw th;
                                }
                            case 1:
                                eVar.f(bVar5);
                                return;
                            case 2:
                                eVar.g(bVar5);
                                return;
                            case 3:
                                eVar.e(bVar5);
                                return;
                            default:
                                p036l1.b bVar7 = bVar5;
                                Object objX = bVar7.x("inTransaction");
                                Boolean bool = objX instanceof Boolean ? (Boolean) objX : null;
                                boolean z4 = Boolean.TRUE.equals(bool) && bVar7.F() && ((Integer) bVar7.x("transactionId")) == null;
                                e eVar3 = eVar;
                                if (z4) {
                                    int i9 = eVar3.f3831k + 1;
                                    eVar3.f3831k = i9;
                                    eVar3.f3832l = Integer.valueOf(i9);
                                }
                                if (!eVar3.h(bVar7)) {
                                    if (z4) {
                                        eVar3.f3832l = null;
                                        return;
                                    }
                                    return;
                                } else if (z4) {
                                    HashMap map8 = new HashMap();
                                    map8.put("transactionId", eVar3.f3832l);
                                    bVar7.p(map8);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        eVar3.f3832l = null;
                                    }
                                    bVar7.p(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                HashMap map7 = l.f3855m;
                Boolean bool = Boolean.TRUE;
                boolean zEquals = bool.equals(cVar.i("noResult"));
                boolean zEquals2 = bool.equals(cVar.i("continueOnError"));
                List list = (List) cVar.i("operations");
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    a aVar = new a((Map) it2.next(), zEquals);
                    String strA = aVar.A();
                    strA.getClass();
                    byte b3 = -1;
                    switch (strA.hashCode()) {
                        case -1319569547:
                            if (strA.equals("execute")) {
                                b3 = 0;
                            }
                            break;
                        case -1183792455:
                            if (strA.equals("insert")) {
                                b3 = 1;
                            }
                            break;
                        case -838846263:
                            if (strA.equals("update")) {
                                b3 = 2;
                            }
                            break;
                        case 107944136:
                            if (strA.equals("query")) {
                                b3 = 3;
                            }
                            break;
                    }
                    s sVar = aVar.n;
                    switch (b3) {
                        case 0:
                            if (eVar.h(aVar)) {
                                aVar.p(null);
                                aVar.X(arrayList);
                            } else if (!zEquals2) {
                                oVar.a((String) sVar.f144k, (String) sVar.f145l, sVar.n);
                            } else {
                                aVar.W(arrayList);
                            }
                            break;
                        case 1:
                            if (eVar.e(aVar)) {
                                aVar.X(arrayList);
                            } else if (!zEquals2) {
                                oVar.a((String) sVar.f144k, (String) sVar.f145l, sVar.n);
                            } else {
                                aVar.W(arrayList);
                            }
                            break;
                        case 2:
                            if (eVar.g(aVar)) {
                                aVar.X(arrayList);
                            } else if (!zEquals2) {
                                oVar.a((String) sVar.f144k, (String) sVar.f145l, sVar.n);
                            } else {
                                aVar.W(arrayList);
                            }
                            break;
                        case 3:
                            if (eVar.f(aVar)) {
                                aVar.X(arrayList);
                            } else if (!zEquals2) {
                                oVar.a((String) sVar.f144k, (String) sVar.f145l, sVar.n);
                            } else {
                                aVar.W(arrayList);
                            }
                            break;
                        default:
                            oVar.a("bad_param", p055t.a.b("Batch method '", strA, "' not supported"), null);
                            break;
                    }
                }
                if (!zEquals) {
                    oVar.d(arrayList);
                } else {
                    oVar.d(null);
                }
                break;
        }
    }

    public /* synthetic */ j(c cVar, e eVar, o oVar) {
        this.f3845k = 3;
        this.f3846l = cVar;
        this.n = eVar;
        this.f3847m = oVar;
    }

    public /* synthetic */ j(e eVar, c cVar, o oVar) {
        this.f3845k = 6;
        this.n = eVar;
        this.f3846l = cVar;
        this.f3847m = oVar;
    }
}

package j1;

import Z1.p;
import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.DocumentsContract;
import i2.InterfaceC0301s;
import java.util.ArrayList;

/* renamed from: j1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0333g extends T1.h implements p {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Intent f3569o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0329c f3570p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Activity f3571q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3572r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f3573s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f3574t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0333g(Intent intent, C0329c c0329c, Activity activity, int i3, boolean z3, String str, R1.c cVar) {
        super(2, cVar);
        this.f3569o = intent;
        this.f3570p = c0329c;
        this.f3571q = activity;
        this.f3572r = i3;
        this.f3573s = z3;
        this.f3574t = str;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        C0333g c0333g = (C0333g) i((R1.c) obj2, (InterfaceC0301s) obj);
        O1.g gVar = O1.g.f1211a;
        c0333g.m(gVar);
        return gVar;
    }

    @Override // T1.a
    public final R1.c i(R1.c cVar, Object obj) {
        return new C0333g(this.f3569o, this.f3570p, this.f3571q, this.f3572r, this.f3573s, this.f3574t, cVar);
    }

    @Override // T1.a
    public final Object m(Object obj) {
        H2.h.E(obj);
        O1.g gVar = O1.g.f1211a;
        C0329c c0329c = this.f3570p;
        Intent intent = this.f3569o;
        if (intent == null) {
            c0329c.c("unknown_activity", "Unknown activity error, please fill an issue.");
            return gVar;
        }
        ArrayList arrayList = new ArrayList();
        try {
            ClipData clipData = intent.getClipData();
            int i3 = this.f3572r;
            boolean z3 = this.f3573s;
            int i4 = 0;
            Activity activity = this.f3571q;
            if (clipData != null) {
                ClipData clipData2 = intent.getClipData();
                a2.h.b(clipData2);
                int itemCount = clipData2.getItemCount();
                while (i4 < itemCount) {
                    ClipData clipData3 = intent.getClipData();
                    a2.h.b(clipData3);
                    Uri uri = clipData3.getItemAt(i4).getUri();
                    a2.h.b(uri);
                    C0334h.a(activity, C0334h.b(activity, uri, i3), z3, arrayList);
                    i4++;
                }
                c0329c.d(arrayList);
                return gVar;
            }
            if (intent.getData() != null) {
                Uri data = intent.getData();
                a2.h.b(data);
                Uri b3 = C0334h.b(activity, data, i3);
                if (!this.f3574t.equals("dir")) {
                    C0334h.a(activity, b3, z3, arrayList);
                    if (arrayList.isEmpty()) {
                        c0329c.c("unknown_path", "Failed to retrieve path.");
                        return gVar;
                    }
                    c0329c.d(arrayList);
                    return gVar;
                }
                Uri buildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(b3, DocumentsContract.getTreeDocumentId(b3));
                a2.h.d(buildDocumentUriUsingTree, "buildDocumentUriUsingTree(...)");
                String g3 = C0334h.g(activity, buildDocumentUriUsingTree);
                if (g3 != null) {
                    c0329c.d(g3);
                    return gVar;
                }
                c0329c.c("unknown_path", "Failed to retrieve directory path.");
                return gVar;
            }
            Bundle extras = intent.getExtras();
            if (extras == null || !extras.containsKey("selectedItems")) {
                c0329c.c("unknown_activity", "Unknown activity error, please fill an issue.");
                return gVar;
            }
            Bundle extras2 = intent.getExtras();
            a2.h.b(extras2);
            ArrayList parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? extras2.getParcelableArrayList("selectedItems", Parcelable.class) : extras2.getParcelableArrayList("selectedItems");
            if (parcelableArrayList != null) {
                ArrayList arrayList2 = new ArrayList();
                int size = parcelableArrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj2 = parcelableArrayList.get(i5);
                    i5++;
                    if (obj2 instanceof Uri) {
                        arrayList2.add(obj2);
                    }
                }
                int size2 = arrayList2.size();
                while (i4 < size2) {
                    Object obj3 = arrayList2.get(i4);
                    i4++;
                    C0334h.a(activity, (Uri) obj3, z3, arrayList);
                }
            }
            c0329c.d(arrayList);
            return gVar;
        } catch (Exception e3) {
            String message = e3.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            c0329c.c("file_picker_error", message);
            return gVar;
        }
    }
}

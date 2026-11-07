package p030j1;

import R1.c;
import T1.h;
import Z1.p;
import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.DocumentsContract;
import i2.InterfaceC0210s;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class g extends h implements p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Intent f3569o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ c f3570p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Activity f3571q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3572r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f3573s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f3574t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Intent intent, c cVar, Activity activity, int i3, boolean z3, String str, c cVar2) {
        super(2, cVar2);
        this.f3569o = intent;
        this.f3570p = cVar;
        this.f3571q = activity;
        this.f3572r = i3;
        this.f3573s = z3;
        this.f3574t = str;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) throws Throwable {
        g gVar = (g) i((c) obj2, (InterfaceC0210s) obj);
        O1.g gVar2 = O1.g.f1211a;
        gVar.m(gVar2);
        return gVar2;
    }

    @Override // T1.a
    public final c i(c cVar, Object obj) {
        return new g(this.f3569o, this.f3570p, this.f3571q, this.f3572r, this.f3573s, this.f3574t, cVar);
    }

    @Override // T1.a
    public final Object m(Object obj) throws Throwable {
        H2.h.E(obj);
        O1.g gVar = O1.g.f1211a;
        c cVar = this.f3570p;
        Intent intent = this.f3569o;
        if (intent == null) {
            cVar.c("unknown_activity", "Unknown activity error, please fill an issue.");
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
                    h.a(activity, h.b(activity, uri, i3), z3, arrayList);
                    i4++;
                }
                cVar.d(arrayList);
                return gVar;
            }
            if (intent.getData() != null) {
                Uri data = intent.getData();
                a2.h.b(data);
                Uri uriB = h.b(activity, data, i3);
                if (!this.f3574t.equals("dir")) {
                    h.a(activity, uriB, z3, arrayList);
                    if (arrayList.isEmpty()) {
                        cVar.c("unknown_path", "Failed to retrieve path.");
                        return gVar;
                    }
                    cVar.d(arrayList);
                    return gVar;
                }
                Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uriB, DocumentsContract.getTreeDocumentId(uriB));
                a2.h.d(uriBuildDocumentUriUsingTree, "buildDocumentUriUsingTree(...)");
                String strG = h.g(activity, uriBuildDocumentUriUsingTree);
                if (strG != null) {
                    cVar.d(strG);
                    return gVar;
                }
                cVar.c("unknown_path", "Failed to retrieve directory path.");
                return gVar;
            }
            Bundle extras = intent.getExtras();
            if (extras == null || !extras.containsKey("selectedItems")) {
                cVar.c("unknown_activity", "Unknown activity error, please fill an issue.");
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
                    h.a(activity, (Uri) obj3, z3, arrayList);
                }
            }
            cVar.d(arrayList);
            return gVar;
        } catch (Exception e3) {
            String message = e3.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            cVar.c("file_picker_error", message);
            return gVar;
        }
    }
}

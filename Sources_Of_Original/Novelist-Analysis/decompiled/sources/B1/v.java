package B1;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f167e;

    public v(String str, int i3, int i4, int i5, int i6) {
        if (!(i3 == -1 && i4 == -1) && (i3 < 0 || i4 < 0)) {
            throw new IndexOutOfBoundsException("invalid selection: (" + i3 + ", " + i4 + ")");
        }
        if (!(i5 == -1 && i6 == -1) && (i5 < 0 || i5 > i6)) {
            throw new IndexOutOfBoundsException("invalid composing range: (" + i5 + ", " + i6 + ")");
        }
        if (i6 > str.length()) {
            throw new IndexOutOfBoundsException(e.g("invalid composing start: ", i5));
        }
        if (i3 > str.length()) {
            throw new IndexOutOfBoundsException(e.g("invalid selection start: ", i3));
        }
        if (i4 > str.length()) {
            throw new IndexOutOfBoundsException(e.g("invalid selection end: ", i4));
        }
        this.f163a = str;
        this.f164b = i3;
        this.f165c = i4;
        this.f166d = i5;
        this.f167e = i6;
    }

    public static v a(JSONObject jSONObject) {
        return new v(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
    }
}

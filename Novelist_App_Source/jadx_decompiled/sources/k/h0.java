package k;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import it.returntrue.novelist.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public final class h0 extends T.c implements View.OnClickListener {

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ int f3680I = 0;

    /* renamed from: A, reason: collision with root package name */
    public int f3681A;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f3682B;

    /* renamed from: C, reason: collision with root package name */
    public int f3683C;

    /* renamed from: D, reason: collision with root package name */
    public int f3684D;

    /* renamed from: E, reason: collision with root package name */
    public int f3685E;

    /* renamed from: F, reason: collision with root package name */
    public int f3686F;

    /* renamed from: G, reason: collision with root package name */
    public int f3687G;

    /* renamed from: H, reason: collision with root package name */
    public int f3688H;

    /* renamed from: s, reason: collision with root package name */
    public final int f3689s;

    /* renamed from: t, reason: collision with root package name */
    public final int f3690t;
    public final LayoutInflater u;

    /* renamed from: v, reason: collision with root package name */
    public final SearchView f3691v;

    /* renamed from: w, reason: collision with root package name */
    public final SearchableInfo f3692w;
    public final Context x;
    public final WeakHashMap y;

    /* renamed from: z, reason: collision with root package name */
    public final int f3693z;

    public h0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f1267l = true;
        this.f1268m = null;
        this.f1266k = false;
        this.n = context;
        this.f1269o = -1;
        this.f1270p = new T.a(this);
        this.f1271q = new T.b(this, 0);
        this.f3690t = suggestionRowLayout;
        this.f3689s = suggestionRowLayout;
        this.u = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f3681A = 1;
        this.f3683C = -1;
        this.f3684D = -1;
        this.f3685E = -1;
        this.f3686F = -1;
        this.f3687G = -1;
        this.f3688H = -1;
        this.f3691v = searchView;
        this.f3692w = searchableInfo;
        this.f3693z = searchView.getSuggestionCommitIconResId();
        this.x = context;
        this.y = weakHashMap;
    }

    public static String h(Cursor cursor, int i3) {
        if (i3 == -1) {
            return null;
        }
        try {
            return cursor.getString(i3);
        } catch (Exception e3) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e3);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0140  */
    @Override // T.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.View r21, android.database.Cursor r22) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.h0.a(android.view.View, android.database.Cursor):void");
    }

    @Override // T.c
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f3683C = cursor.getColumnIndex("suggest_text_1");
                this.f3684D = cursor.getColumnIndex("suggest_text_2");
                this.f3685E = cursor.getColumnIndex("suggest_text_2_url");
                this.f3686F = cursor.getColumnIndex("suggest_icon_1");
                this.f3687G = cursor.getColumnIndex("suggest_icon_2");
                this.f3688H = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e3) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e3);
        }
    }

    @Override // T.c
    public final String c(Cursor cursor) {
        String h3;
        String h4;
        if (cursor == null) {
            return null;
        }
        String h5 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h5 != null) {
            return h5;
        }
        SearchableInfo searchableInfo = this.f3692w;
        if (searchableInfo.shouldRewriteQueryFromData() && (h4 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return h4;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (h3 = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return h3;
    }

    @Override // T.c
    public final View d(ViewGroup viewGroup) {
        View inflate = this.u.inflate(this.f3689s, viewGroup, false);
        inflate.setTag(new g0(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.f3693z);
        return inflate;
    }

    public final Drawable e(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.n.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable f(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.h0.f(java.lang.String):android.graphics.drawable.Drawable");
    }

    public final Cursor g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query(StringUtils.EMPTY).fragment(StringUtils.EMPTY);
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.n.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // T.c, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i3, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i3, view, viewGroup);
        } catch (RuntimeException e3) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e3);
            View inflate = this.u.inflate(this.f3690t, viewGroup, false);
            if (inflate != null) {
                ((g0) inflate.getTag()).f3674a.setText(e3.toString());
            }
            return inflate;
        }
    }

    @Override // T.c, android.widget.Adapter
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i3, view, viewGroup);
        } catch (RuntimeException e3) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e3);
            View d3 = d(viewGroup);
            ((g0) d3.getTag()).f3674a.setText(e3.toString());
            return d3;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f1268m;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f1268m;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f3691v.n((CharSequence) tag);
        }
    }
}

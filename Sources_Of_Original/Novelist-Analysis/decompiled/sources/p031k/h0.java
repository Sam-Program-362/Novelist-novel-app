package p031k;

import T.a;
import T.b;
import T.c;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import it.returntrue.novelist.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends c implements View.OnClickListener {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ int f3680I = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f3681A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ColorStateList f3682B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f3683C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f3684D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f3685E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f3686F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f3687G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f3688H;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f3689s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f3690t;
    public final LayoutInflater u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final SearchView f3691v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final SearchableInfo f3692w;
    public final Context x;
    public final WeakHashMap y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f3693z;

    public h0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f1267l = true;
        this.f1268m = null;
        this.f1266k = false;
        this.n = context;
        this.f1269o = -1;
        this.f1270p = new a(this);
        this.f1271q = new b(this, 0);
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

    @Override // T.c
    public final void a(View view, Cursor cursor) {
        int i3;
        Drawable drawableF;
        CharSequence charSequenceH;
        g0 g0Var = (g0) view.getTag();
        int i4 = this.f3688H;
        int i5 = i4 != -1 ? cursor.getInt(i4) : 0;
        TextView textView = g0Var.f3674a;
        TextView textView2 = g0Var.f3675b;
        ImageView imageView = g0Var.f3678e;
        if (textView != null) {
            String strH = h(cursor, this.f3683C);
            textView.setText(strH);
            if (TextUtils.isEmpty(strH)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        if (textView2 != null) {
            String strH2 = h(cursor, this.f3685E);
            if (strH2 != null) {
                if (this.f3682B == null) {
                    TypedValue typedValue = new TypedValue();
                    this.n.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
                    this.f3682B = this.n.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(strH2);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f3682B, null), 0, strH2.length(), 33);
                charSequenceH = spannableString;
            } else {
                charSequenceH = h(cursor, this.f3684D);
            }
            if (TextUtils.isEmpty(charSequenceH)) {
                if (textView != null) {
                    textView.setSingleLine(false);
                    textView.setMaxLines(2);
                }
            } else if (textView != null) {
                textView.setSingleLine(true);
                textView.setMaxLines(1);
            }
            textView2.setText(charSequenceH);
            if (TextUtils.isEmpty(charSequenceH)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
        }
        ImageView imageView2 = g0Var.f3676c;
        if (imageView2 != null) {
            int i6 = this.f3686F;
            if (i6 == -1) {
                drawableF = null;
            } else {
                drawableF = f(cursor.getString(i6));
                if (drawableF == null) {
                    ComponentName searchActivity = this.f3692w.getSearchActivity();
                    String strFlattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap weakHashMap = this.y;
                    if (weakHashMap.containsKey(strFlattenToShortString)) {
                        Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(strFlattenToShortString);
                        drawableF = constantState == null ? null : constantState.newDrawable(this.x.getResources());
                    } else {
                        PackageManager packageManager = this.n.getPackageManager();
                        try {
                            ActivityInfo activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            int iconResource = activityInfo.getIconResource();
                            if (iconResource != 0) {
                                Drawable drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                                if (drawable == null) {
                                    Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + searchActivity.flattenToShortString());
                                    drawableF = null;
                                } else {
                                    drawableF = drawable;
                                }
                            } else {
                                drawableF = null;
                            }
                        } catch (PackageManager.NameNotFoundException e3) {
                            Log.w("SuggestionsAdapter", e3.toString());
                        }
                        weakHashMap.put(strFlattenToShortString, drawableF == null ? null : drawableF.getConstantState());
                    }
                    if (drawableF == null) {
                        drawableF = this.n.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView2.setImageDrawable(drawableF);
            if (drawableF == null) {
                imageView2.setVisibility(4);
            } else {
                imageView2.setVisibility(0);
                drawableF.setVisible(false, false);
                drawableF.setVisible(true, false);
            }
        }
        ImageView imageView3 = g0Var.f3677d;
        if (imageView3 == null) {
            i3 = 1;
        } else {
            int i7 = this.f3687G;
            Drawable drawableF2 = i7 == -1 ? null : f(cursor.getString(i7));
            imageView3.setImageDrawable(drawableF2);
            if (drawableF2 == null) {
                imageView3.setVisibility(8);
                i3 = 1;
            } else {
                imageView3.setVisibility(0);
                drawableF2.setVisible(false, false);
                i3 = 1;
                drawableF2.setVisible(true, false);
            }
        }
        int i8 = this.f3681A;
        if (i8 != 2 && (i8 != i3 || (i5 & 1) == 0)) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        imageView.setTag(textView.getText());
        imageView.setOnClickListener(this);
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
        String strH;
        String strH2;
        if (cursor == null) {
            return null;
        }
        String strH3 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strH3 != null) {
            return strH3;
        }
        SearchableInfo searchableInfo = this.f3692w;
        if (searchableInfo.shouldRewriteQueryFromData() && (strH2 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strH2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (strH = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strH;
    }

    @Override // T.c
    public final View d(ViewGroup viewGroup) {
        View viewInflate = this.u.inflate(this.f3689s, viewGroup, false);
        viewInflate.setTag(new g0(viewInflate));
        ((ImageView) viewInflate.findViewById(R.id.edit_query)).setImageResource(this.f3693z);
        return viewInflate;
    }

    public final Drawable e(Uri uri) throws FileNotFoundException {
        int identifier;
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
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x010c  */
    public final Drawable f(String str) {
        WeakHashMap weakHashMap = this.y;
        Context context = this.x;
        Drawable drawableE = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int i3 = Integer.parseInt(str);
                String str2 = "android.resource://" + context.getPackageName() + "/" + i3;
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(str2);
                Drawable drawableNewDrawable = constantState == null ? null : constantState.newDrawable();
                if (drawableNewDrawable != null) {
                    return drawableNewDrawable;
                }
                Drawable drawable = context.getDrawable(i3);
                if (drawable != null) {
                    weakHashMap.put(str2, drawable.getConstantState());
                }
                return drawable;
            } catch (Resources.NotFoundException unused) {
                Log.w("SuggestionsAdapter", "Icon resource not found: ".concat(str));
                return null;
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) weakHashMap.get(str);
                Drawable drawableNewDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                if (drawableNewDrawable2 != null) {
                    return drawableNewDrawable2;
                }
                Uri uri = Uri.parse(str);
                try {
                    if ("android.resource".equals(uri.getScheme())) {
                        try {
                            drawableE = e(uri);
                        } catch (Resources.NotFoundException unused3) {
                            throw new FileNotFoundException("Resource does not exist: " + uri);
                        }
                    } else {
                        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                        if (inputStreamOpenInputStream == null) {
                            throw new FileNotFoundException("Failed to open " + uri);
                        }
                        try {
                            Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException e3) {
                                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e3);
                            }
                            drawableE = drawableCreateFromStream;
                        } catch (Throwable th) {
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException e4) {
                                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e4);
                            }
                            throw th;
                        }
                    }
                } catch (FileNotFoundException e5) {
                    Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e5.getMessage());
                    if (drawableE != null) {
                        weakHashMap.put(str, drawableE.getConstantState());
                    }
                    return drawableE;
                }
                if (drawableE != null) {
                    weakHashMap.put(str, drawableE.getConstantState());
                }
            }
        }
        return drawableE;
    }

    public final Cursor g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query(StringUtils.EMPTY).fragment(StringUtils.EMPTY);
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        builderFragment.appendQueryParameter("limit", String.valueOf(50));
        return this.n.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // T.c, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i3, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i3, view, viewGroup);
        } catch (RuntimeException e3) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e3);
            View viewInflate = this.u.inflate(this.f3690t, viewGroup, false);
            if (viewInflate != null) {
                ((g0) viewInflate.getTag()).f3674a.setText(e3.toString());
            }
            return viewInflate;
        }
    }

    @Override // T.c, android.widget.Adapter
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i3, view, viewGroup);
        } catch (RuntimeException e3) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e3);
            View viewD = d(viewGroup);
            ((g0) viewD.getTag()).f3674a.setText(e3.toString());
            return viewD;
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

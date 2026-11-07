package D;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import it.returntrue.novelist.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f183d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f184a;

    /* renamed from: b, reason: collision with root package name */
    public SparseArray f185b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f186c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f184a;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View a3 = a(viewGroup.getChildAt(childCount));
                if (a3 != null) {
                    return a3;
                }
            }
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null || arrayList.size() - 1 < 0) {
            return null;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }
}

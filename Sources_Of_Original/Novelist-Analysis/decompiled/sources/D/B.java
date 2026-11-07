package D;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {
    public static int a(View view) {
        return view.getImportantForAutofill();
    }

    public static void b(View view, int i3) {
        view.setImportantForAutofill(i3);
    }
}

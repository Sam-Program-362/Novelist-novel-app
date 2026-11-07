package D;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class W extends V {
    public W(h0 h0Var, WindowInsets windowInsets) {
        super(h0Var, windowInsets);
    }

    @Override // D.d0
    public h0 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f206c.consumeDisplayCutout();
        return h0.c(consumeDisplayCutout, null);
    }

    @Override // D.U, D.d0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w3 = (W) obj;
        return Objects.equals(this.f206c, w3.f206c) && Objects.equals(this.f210g, w3.f210g) && U.L(this.f211h, w3.f211h);
    }

    @Override // D.d0
    public C0006g g() {
        DisplayCutout displayCutout;
        displayCutout = this.f206c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0006g(displayCutout);
    }

    @Override // D.d0
    public int hashCode() {
        return this.f206c.hashCode();
    }
}

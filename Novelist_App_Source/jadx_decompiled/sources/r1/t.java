package r1;

import android.view.KeyCharacterMap;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public int f4426a = 0;

    public final Character a(int i3) {
        char c3 = (char) i3;
        if ((Integer.MIN_VALUE & i3) != 0) {
            int i4 = i3 & Integer.MAX_VALUE;
            int i5 = this.f4426a;
            if (i5 != 0) {
                this.f4426a = KeyCharacterMap.getDeadChar(i5, i4);
            } else {
                this.f4426a = i4;
            }
        } else {
            int i6 = this.f4426a;
            if (i6 != 0) {
                int deadChar = KeyCharacterMap.getDeadChar(i6, i3);
                if (deadChar > 0) {
                    c3 = (char) deadChar;
                }
                this.f4426a = 0;
            }
        }
        return Character.valueOf(c3);
    }
}

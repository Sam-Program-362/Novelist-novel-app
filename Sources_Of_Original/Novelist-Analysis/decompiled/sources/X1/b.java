package X1;

import a2.h;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class b extends IOException {
    public b(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        sb.append(": ".concat(str));
        String string = sb.toString();
        h.d(string, "toString(...)");
        super(string);
    }

    public b(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}

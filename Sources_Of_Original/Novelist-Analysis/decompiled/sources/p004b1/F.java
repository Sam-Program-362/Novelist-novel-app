package p004b1;

import java.util.Comparator;
import org.apache.tika.fork.ForkServer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class F implements Comparator {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final F f2584k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ F[] f2585l;

    static {
        F f3 = new F("INSTANCE", 0);
        f2584k = f3;
        f2585l = new F[]{f3};
    }

    public static F[] values() {
        return (F[]) f2585l.clone();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i3 = 0; i3 < iMin; i3++) {
            int i4 = (bArr[i3] & ForkServer.ERROR) - (bArr2[i3] & ForkServer.ERROR);
            if (i4 != 0) {
                return i4;
            }
        }
        return bArr.length - bArr2.length;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
    }
}

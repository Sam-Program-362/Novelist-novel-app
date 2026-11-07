package b1;

import java.util.Comparator;
import org.apache.tika.fork.ForkServer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: b1.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0181F implements Comparator {

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC0181F f2584k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ EnumC0181F[] f2585l;

    static {
        EnumC0181F enumC0181F = new EnumC0181F("INSTANCE", 0);
        f2584k = enumC0181F;
        f2585l = new EnumC0181F[]{enumC0181F};
    }

    public static EnumC0181F[] values() {
        return (EnumC0181F[]) f2585l.clone();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int min = Math.min(bArr.length, bArr2.length);
        for (int i3 = 0; i3 < min; i3++) {
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

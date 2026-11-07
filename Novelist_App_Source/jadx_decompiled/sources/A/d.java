package A;

import java.util.Comparator;
import org.apache.tika.language.detect.LanguageDetector;
import org.apache.tika.language.translate.Translator;
import org.apache.tika.utils.CompareUtils;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Comparator {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f8k;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        switch (this.f8k) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    byte b3 = bArr[i3];
                    byte b4 = bArr2[i3];
                    if (b3 != b4) {
                        return b3 - b4;
                    }
                }
                return 0;
            case 1:
                obj3 = (Translator) obj;
                obj4 = (Translator) obj2;
                break;
            case 2:
                obj3 = (LanguageDetector) obj;
                obj4 = (LanguageDetector) obj2;
                break;
            default:
                return CompareUtils.compareClassName(obj, obj2);
        }
        return CompareUtils.compareClassName(obj3, obj4);
    }
}

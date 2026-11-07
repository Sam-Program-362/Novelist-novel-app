package v1;

import B1.g;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import java.nio.ByteBuffer;
import s1.j;

/* loaded from: classes.dex */
public final class b extends g {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f4623m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(j jVar, int i3) {
        super(jVar, 22);
        this.f4623m = i3;
    }

    @Override // B1.g
    public final Bitmap l(ByteBuffer byteBuffer, d dVar) {
        switch (this.f4623m) {
            case 0:
                Bitmap l3 = super.l(byteBuffer, dVar);
                if (l3 != null) {
                    return l3;
                }
                int remaining = byteBuffer.remaining();
                byte[] bArr = new byte[remaining];
                byteBuffer.get(bArr);
                byteBuffer.rewind();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, remaining, options);
                if (dVar.f4627c == 0) {
                    return E2.a.c(decodeByteArray, dVar.f4629e);
                }
                Matrix matrix = new Matrix();
                matrix.postRotate(dVar.f4627c);
                Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
                decodeByteArray.recycle();
                return E2.a.c(createBitmap, dVar.f4629e);
            default:
                return E2.a.c(super.l(byteBuffer, dVar), dVar.f4629e);
        }
    }
}

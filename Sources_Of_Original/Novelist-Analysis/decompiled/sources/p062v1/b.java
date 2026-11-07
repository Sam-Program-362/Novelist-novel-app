package p062v1;

import B1.g;
import E2.a;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import java.nio.ByteBuffer;
import p054s1.j;

/* JADX INFO: loaded from: classes.dex */
public final class b extends g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
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
                Bitmap bitmapL = super.l(byteBuffer, dVar);
                if (bitmapL != null) {
                    return bitmapL;
                }
                int iRemaining = byteBuffer.remaining();
                byte[] bArr = new byte[iRemaining];
                byteBuffer.get(bArr);
                byteBuffer.rewind();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iRemaining, options);
                if (dVar.f4627c == 0) {
                    return a.c(bitmapDecodeByteArray, dVar.f4629e);
                }
                Matrix matrix = new Matrix();
                matrix.postRotate(dVar.f4627c);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, true);
                bitmapDecodeByteArray.recycle();
                return a.c(bitmapCreateBitmap, dVar.f4629e);
            default:
                return a.c(super.l(byteBuffer, dVar), dVar.f4629e);
        }
    }
}

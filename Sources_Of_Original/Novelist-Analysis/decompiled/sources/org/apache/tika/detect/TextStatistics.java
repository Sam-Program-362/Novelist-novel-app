package org.apache.tika.detect;

import org.apache.tika.fork.ForkServer;

/* JADX INFO: loaded from: classes.dex */
public class TextStatistics {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final int[] counts = new int[256];
    private int total = 0;

    private int countSafeControl() {
        return count(27) + count(12) + count(13) + count(10) + count(9);
    }

    public void addData(byte[] bArr, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            int[] iArr = this.counts;
            int i6 = bArr[i3 + i5] & ForkServer.ERROR;
            iArr[i6] = iArr[i6] + 1;
            this.total++;
        }
    }

    public int count() {
        return this.total;
    }

    public int countControl() {
        return count(0, 32) - countSafeControl();
    }

    public int countEightBit() {
        return count(128, 256);
    }

    public int countSafeAscii() {
        return count(32, 128) + countSafeControl();
    }

    public boolean isMostlyAscii() {
        int iCount = count(0, 32);
        int iCount2 = count(32, 128);
        int iCountSafeControl = countSafeControl();
        int i3 = this.total;
        return i3 > 0 && (iCount - iCountSafeControl) * 100 < i3 * 2 && (iCount2 + iCountSafeControl) * 100 > i3 * 90;
    }

    public boolean looksLikeUTF8() {
        int iCount = count(0, 32);
        int iCount2 = count(32, 128);
        int iCountSafeControl = countSafeControl();
        int[] iArr = {count(192, 224), count(224, 240), count(240, 248)};
        int i3 = 0;
        int i4 = 0;
        while (i3 < 3) {
            int i5 = iArr[i3];
            iCount2 += i5;
            i3++;
            i4 += i5 * i3;
        }
        int iCount3 = count(128, 192);
        return iCount2 > 0 && iCount3 <= i4 && iCount3 >= i4 - 3 && count(248, 256) == 0 && (iCount - iCountSafeControl) * 100 < iCount2 * 2;
    }

    public int count(int i3) {
        return this.counts[i3 & 255];
    }

    private int count(int i3, int i4) {
        int i5 = 0;
        while (i3 < i4) {
            i5 += this.counts[i3];
            i3++;
        }
        return i5;
    }
}

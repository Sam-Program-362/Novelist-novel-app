package org.apache.tika.pipes.async;

/* JADX INFO: loaded from: classes.dex */
public class OfferLargerThanQueueSize extends IllegalArgumentException {
    private final int queueSize;
    private final int sizeOffered;

    public OfferLargerThanQueueSize(int i3, int i4) {
        this.sizeOffered = i3;
        this.queueSize = i4;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "sizeOffered (" + this.sizeOffered + ") is greater than queue size (" + this.queueSize + ")";
    }

    public int getQueueSize() {
        return this.queueSize;
    }

    public int getSizeOffered() {
        return this.sizeOffered;
    }
}

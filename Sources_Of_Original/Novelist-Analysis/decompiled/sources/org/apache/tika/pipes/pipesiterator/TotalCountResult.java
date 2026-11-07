package org.apache.tika.pipes.pipesiterator;

/* JADX INFO: loaded from: classes.dex */
public class TotalCountResult {
    public static TotalCountResult UNSUPPORTED = new TotalCountResult(-1, STATUS.UNSUPPORTED);
    private STATUS status;
    private long totalCount;

    public enum STATUS {
        UNSUPPORTED,
        EXCEPTION,
        NOT_COMPLETED,
        COMPLETED
    }

    public TotalCountResult() {
        this.totalCount = 0L;
        this.status = STATUS.NOT_COMPLETED;
    }

    public STATUS getStatus() {
        return this.status;
    }

    public long getTotalCount() {
        return this.totalCount;
    }

    public String toString() {
        return "TotalCountResult{totalCount=" + this.totalCount + ", status=" + String.valueOf(this.status) + "}";
    }

    public TotalCountResult(long j3, STATUS status) {
        this.totalCount = j3;
        this.status = status;
    }
}

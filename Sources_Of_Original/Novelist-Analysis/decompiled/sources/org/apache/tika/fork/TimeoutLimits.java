package org.apache.tika.fork;

/* JADX INFO: loaded from: classes.dex */
class TimeoutLimits {
    private final long parseTimeoutMS;
    private final long pulseMS;
    private final long waitTimeoutMS;

    public TimeoutLimits(long j3, long j4, long j5) {
        this.pulseMS = j3;
        this.parseTimeoutMS = j4;
        this.waitTimeoutMS = j5;
    }

    public long getParseTimeoutMS() {
        return this.parseTimeoutMS;
    }

    public long getPulseMS() {
        return this.pulseMS;
    }

    public long getWaitTimeoutMS() {
        return this.waitTimeoutMS;
    }
}

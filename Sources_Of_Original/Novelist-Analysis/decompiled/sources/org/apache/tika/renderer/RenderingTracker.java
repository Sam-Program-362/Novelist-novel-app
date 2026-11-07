package org.apache.tika.renderer;

/* JADX INFO: loaded from: classes.dex */
public class RenderingTracker {
    private int id = 0;

    public synchronized int getNextId() {
        int i3;
        i3 = this.id + 1;
        this.id = i3;
        return i3;
    }
}

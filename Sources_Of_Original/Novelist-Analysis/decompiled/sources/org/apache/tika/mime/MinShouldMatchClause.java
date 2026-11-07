package org.apache.tika.mime;

import B1.e;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class MinShouldMatchClause implements Clause {
    private final List<Clause> clauses;
    private final int min;

    public MinShouldMatchClause(int i3, List<Clause> list) {
        if (list == null || list.size() == 0) {
            throw new IllegalArgumentException("clauses must be not null with size > 0");
        }
        if (i3 <= list.size()) {
            if (i3 <= 0) {
                throw new IllegalArgumentException(e.g("min cannot be <= 0: ", i3));
            }
            this.min = i3;
            this.clauses = list;
            return;
        }
        throw new IllegalArgumentException("min (" + i3 + ") cannot be > clauses.size (" + list.size() + ")");
    }

    @Override // org.apache.tika.mime.Clause
    public boolean eval(byte[] bArr) {
        Iterator<Clause> it2 = this.clauses.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            if (it2.next().eval(bArr) && (i3 = i3 + 1) >= this.min) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.tika.mime.Clause
    public int size() {
        Iterator<Clause> it2 = this.clauses.iterator();
        int iMax = 0;
        while (it2.hasNext()) {
            iMax = Math.max(iMax, it2.next().size());
        }
        return iMax;
    }

    public String toString() {
        return "minShouldMatch (min: " + this.min + ") " + String.valueOf(this.clauses);
    }
}

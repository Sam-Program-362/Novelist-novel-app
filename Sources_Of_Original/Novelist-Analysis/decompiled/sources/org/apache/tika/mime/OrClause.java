package org.apache.tika.mime;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class OrClause implements Clause {
    private final List<Clause> clauses;

    public OrClause(List<Clause> list) {
        this.clauses = list;
    }

    @Override // org.apache.tika.mime.Clause
    public boolean eval(byte[] bArr) {
        Iterator<Clause> it2 = this.clauses.iterator();
        while (it2.hasNext()) {
            if (it2.next().eval(bArr)) {
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
        return "or".concat(String.valueOf(this.clauses));
    }
}

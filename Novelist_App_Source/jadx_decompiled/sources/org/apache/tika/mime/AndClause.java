package org.apache.tika.mime;

import java.util.Arrays;
import t.AbstractC0468a;

/* loaded from: classes.dex */
class AndClause implements Clause {
    private final Clause[] clauses;

    public AndClause(Clause... clauseArr) {
        this.clauses = clauseArr;
    }

    @Override // org.apache.tika.mime.Clause
    public boolean eval(byte[] bArr) {
        for (Clause clause : this.clauses) {
            if (!clause.eval(bArr)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.apache.tika.mime.Clause
    public int size() {
        int i3 = 0;
        for (Clause clause : this.clauses) {
            i3 += clause.size();
        }
        return i3;
    }

    public String toString() {
        return AbstractC0468a.a("and", Arrays.toString(this.clauses));
    }
}

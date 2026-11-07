package K0;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes.dex */
public final class p extends BasePendingResult {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Status f657m;

    public p(Status status) {
        super(null);
        this.f657m = status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final n M(Status status) {
        return this.f657m;
    }
}

package r2;

import B1.s;
import C1.g;
import android.content.ClipData;
import android.content.ClipboardManager;
import java.util.HashMap;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ClipboardManager.OnPrimaryClipChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f4435a;

    @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
    public final void onPrimaryClipChanged() {
        s sVar = this.f4435a;
        if (((g) sVar.f146m) != null) {
            try {
                ClipData primaryClip = ((ClipboardManager) sVar.f145l).getPrimaryClip();
                ClipData.Item itemAt = (primaryClip == null || primaryClip.getItemCount() <= 0) ? null : primaryClip.getItemAt(0);
                String charSequence = (itemAt == null || itemAt.getText() == null) ? StringUtils.EMPTY : itemAt.getText().toString();
                String htmlText = itemAt != null ? itemAt.getHtmlText() : null;
                HashMap hashMap = new HashMap();
                hashMap.put("text", charSequence);
                hashMap.put("html", htmlText);
                hashMap.put("timestamp", Long.valueOf(System.currentTimeMillis()));
                ((g) sVar.f146m).a(hashMap);
            } catch (Exception unused) {
            }
        }
    }
}

package D;

import android.app.ActivityOptions;
import android.content.Intent;
import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: D.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0019u {
    public static I.f a(Intent intent) {
        a2.h.e(intent, "intent");
        GetCredentialException getCredentialException = (GetCredentialException) intent.getSerializableExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION", GetCredentialException.class);
        if (getCredentialException == null) {
            return null;
        }
        String type = getCredentialException.getType();
        a2.h.d(type, "getType(...)");
        return E2.a.U(getCredentialException.getMessage(), type);
    }

    public static H.l b(Intent intent) {
        a2.h.e(intent, "intent");
        GetCredentialResponse getCredentialResponse = (GetCredentialResponse) intent.getParcelableExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE", GetCredentialResponse.class);
        if (getCredentialResponse == null) {
            return null;
        }
        Credential credential = getCredentialResponse.getCredential();
        a2.h.d(credential, "getCredential(...)");
        String type = credential.getType();
        a2.h.d(type, "getType(...)");
        Bundle data = credential.getData();
        a2.h.d(data, "getData(...)");
        return new H.l(H2.h.j(type, data));
    }

    public static AccessibilityNodeInfo.AccessibilityAction c() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float d(VelocityTracker velocityTracker, int i3) {
        return velocityTracker.getAxisVelocity(i3);
    }

    public static void e(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence f(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static int g(ViewConfiguration viewConfiguration, int i3, int i4, int i5) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i3, i4, i5);
    }

    public static int h(ViewConfiguration viewConfiguration, int i3, int i4, int i5) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i3, i4, i5);
    }

    public static boolean i(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static void j(ActivityOptions activityOptions) {
        activityOptions.setShareIdentityEnabled(false);
    }
}

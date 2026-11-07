package io.flutter.view;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ AccessibilityNodeInfo.CollectionInfo d(int i3) {
        return new AccessibilityNodeInfo.CollectionInfo(i3, 1, false);
    }

    public static /* synthetic */ AccessibilityNodeInfo.CollectionItemInfo e(int i3, boolean z3) {
        return new AccessibilityNodeInfo.CollectionItemInfo(i3, 1, 0, 1, z3);
    }

    public static /* synthetic */ AccessibilityNodeInfo.CollectionInfo g(int i3) {
        return new AccessibilityNodeInfo.CollectionInfo(1, i3, false);
    }

    public static /* synthetic */ AccessibilityNodeInfo.CollectionItemInfo h(int i3, boolean z3) {
        return new AccessibilityNodeInfo.CollectionItemInfo(0, 1, i3, 1, z3);
    }
}

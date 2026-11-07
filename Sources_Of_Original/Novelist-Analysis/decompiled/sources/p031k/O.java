package p031k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import p028j.h;
import p028j.j;
import p028j.k;

/* JADX INFO: loaded from: classes.dex */
public final class O extends D {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public k f3633A;
    public final int x;
    public final int y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public N f3634z;

    public O(Context context, boolean z3) {
        super(context, z3);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.x = 21;
            this.y = 22;
        } else {
            this.x = 22;
            this.y = 21;
        }
    }

    @Override // p031k.D, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        h hVar;
        int headersCount;
        int iPointToPosition;
        int i3;
        if (this.f3634z != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                hVar = (h) headerViewListAdapter.getWrappedAdapter();
            } else {
                hVar = (h) adapter;
                headersCount = 0;
            }
            k item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i3 = iPointToPosition - headersCount) < 0 || i3 >= hVar.getCount()) ? null : hVar.getItem(i3);
            k kVar = this.f3633A;
            if (kVar != item) {
                j jVar = hVar.f3426k;
                if (kVar != null) {
                    this.f3634z.c(jVar, kVar);
                }
                this.f3633A = item;
                if (item != null) {
                    this.f3634z.l(jVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i3 == this.x) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i3 != this.y) {
            return super.onKeyDown(i3, keyEvent);
        }
        setSelection(-1);
        ((h) getAdapter()).f3426k.c(false);
        return true;
    }

    public void setHoverListener(N n) {
        this.f3634z = n;
    }

    @Override // p031k.D, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}

package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* loaded from: classes.dex */
public final class O extends D {

    /* renamed from: A, reason: collision with root package name */
    public j.k f3633A;
    public final int x;
    public final int y;

    /* renamed from: z, reason: collision with root package name */
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

    @Override // k.D, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        j.h hVar;
        int i3;
        int pointToPosition;
        int i4;
        if (this.f3634z != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i3 = headerViewListAdapter.getHeadersCount();
                hVar = (j.h) headerViewListAdapter.getWrappedAdapter();
            } else {
                hVar = (j.h) adapter;
                i3 = 0;
            }
            j.k item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i4 = pointToPosition - i3) < 0 || i4 >= hVar.getCount()) ? null : hVar.getItem(i4);
            j.k kVar = this.f3633A;
            if (kVar != item) {
                j.j jVar = hVar.f3426k;
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
        ((j.h) getAdapter()).f3426k.c(false);
        return true;
    }

    public void setHoverListener(N n) {
        this.f3634z = n;
    }

    @Override // k.D, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}

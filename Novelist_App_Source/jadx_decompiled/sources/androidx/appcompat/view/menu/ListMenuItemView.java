package androidx.appcompat.view.menu;

import A0.j;
import D.G;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import f.AbstractC0243a;
import it.returntrue.novelist.R;
import j.k;
import j.q;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements q, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: A, reason: collision with root package name */
    public boolean f1724A;

    /* renamed from: k, reason: collision with root package name */
    public k f1725k;

    /* renamed from: l, reason: collision with root package name */
    public ImageView f1726l;

    /* renamed from: m, reason: collision with root package name */
    public RadioButton f1727m;
    public TextView n;

    /* renamed from: o, reason: collision with root package name */
    public CheckBox f1728o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f1729p;

    /* renamed from: q, reason: collision with root package name */
    public ImageView f1730q;

    /* renamed from: r, reason: collision with root package name */
    public ImageView f1731r;

    /* renamed from: s, reason: collision with root package name */
    public LinearLayout f1732s;

    /* renamed from: t, reason: collision with root package name */
    public final Drawable f1733t;
    public final int u;

    /* renamed from: v, reason: collision with root package name */
    public final Context f1734v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1735w;
    public final Drawable x;
    public final boolean y;

    /* renamed from: z, reason: collision with root package name */
    public LayoutInflater f1736z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j F3 = j.F(getContext(), attributeSet, AbstractC0243a.f2802o, R.attr.listMenuViewStyle);
        this.f1733t = F3.y(5);
        TypedArray typedArray = (TypedArray) F3.f58m;
        this.u = typedArray.getResourceId(1, -1);
        this.f1735w = typedArray.getBoolean(7, false);
        this.f1734v = context;
        this.x = F3.y(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.y = obtainStyledAttributes.hasValue(0);
        F3.J();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f1736z == null) {
            this.f1736z = LayoutInflater.from(getContext());
        }
        return this.f1736z;
    }

    private void setSubMenuArrowVisible(boolean z3) {
        ImageView imageView = this.f1730q;
        if (imageView != null) {
            imageView.setVisibility(z3 ? 0 : 8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0121  */
    @Override // j.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(j.k r11) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.a(j.k):void");
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1731r;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1731r.getLayoutParams();
        rect.top = this.f1731r.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // j.q
    public k getItemData() {
        return this.f1725k;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Field field = G.f187a;
        setBackground(this.f1733t);
        TextView textView = (TextView) findViewById(R.id.title);
        this.n = textView;
        int i3 = this.u;
        if (i3 != -1) {
            textView.setTextAppearance(this.f1734v, i3);
        }
        this.f1729p = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f1730q = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.x);
        }
        this.f1731r = (ImageView) findViewById(R.id.group_divider);
        this.f1732s = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        if (this.f1726l != null && this.f1735w) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1726l.getLayoutParams();
            int i5 = layoutParams.height;
            if (i5 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i5;
            }
        }
        super.onMeasure(i3, i4);
    }

    public void setCheckable(boolean z3) {
        CompoundButton compoundButton;
        View view;
        if (!z3 && this.f1727m == null && this.f1728o == null) {
            return;
        }
        if ((this.f1725k.x & 4) != 0) {
            if (this.f1727m == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1727m = radioButton;
                LinearLayout linearLayout = this.f1732s;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1727m;
            view = this.f1728o;
        } else {
            if (this.f1728o == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1728o = checkBox;
                LinearLayout linearLayout2 = this.f1732s;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1728o;
            view = this.f1727m;
        }
        if (z3) {
            compoundButton.setChecked(this.f1725k.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f1728o;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f1727m;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z3) {
        CompoundButton compoundButton;
        if ((this.f1725k.x & 4) != 0) {
            if (this.f1727m == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1727m = radioButton;
                LinearLayout linearLayout = this.f1732s;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1727m;
        } else {
            if (this.f1728o == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1728o = checkBox;
                LinearLayout linearLayout2 = this.f1732s;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1728o;
        }
        compoundButton.setChecked(z3);
    }

    public void setForceShowIcon(boolean z3) {
        this.f1724A = z3;
        this.f1735w = z3;
    }

    public void setGroupDividerEnabled(boolean z3) {
        ImageView imageView = this.f1731r;
        if (imageView != null) {
            imageView.setVisibility((this.y || !z3) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        j.j jVar = this.f1725k.n;
        boolean z3 = this.f1724A;
        if (z3 || this.f1735w) {
            ImageView imageView = this.f1726l;
            if (imageView == null && drawable == null && !this.f1735w) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f1726l = imageView2;
                LinearLayout linearLayout = this.f1732s;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f1735w) {
                this.f1726l.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f1726l;
            if (!z3) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f1726l.getVisibility() != 0) {
                this.f1726l.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.n.getVisibility() != 8) {
                this.n.setVisibility(8);
            }
        } else {
            this.n.setText(charSequence);
            if (this.n.getVisibility() != 0) {
                this.n.setVisibility(0);
            }
        }
    }
}

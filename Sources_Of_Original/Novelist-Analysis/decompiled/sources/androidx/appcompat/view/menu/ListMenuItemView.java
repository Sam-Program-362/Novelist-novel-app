package androidx.appcompat.view.menu;

import A0.j;
import D.G;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import it.returntrue.novelist.R;
import java.lang.reflect.Field;
import org.apache.tika.utils.StringUtils;
import p013f.a;
import p028j.k;
import p028j.q;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements q, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f1724A;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public k f1725k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView f1726l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public RadioButton f1727m;
    public TextView n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CheckBox f1728o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f1729p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ImageView f1730q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ImageView f1731r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public LinearLayout f1732s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Drawable f1733t;
    public final int u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Context f1734v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f1735w;
    public final Drawable x;
    public final boolean y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public LayoutInflater f1736z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j jVarF = j.F(getContext(), attributeSet, a.f2802o, R.attr.listMenuViewStyle);
        this.f1733t = jVarF.y(5);
        TypedArray typedArray = (TypedArray) jVarF.f58m;
        this.u = typedArray.getResourceId(1, -1);
        this.f1735w = typedArray.getBoolean(7, false);
        this.f1734v = context;
        this.x = jVarF.y(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.y = typedArrayObtainStyledAttributes.hasValue(0);
        jVarF.J();
        typedArrayObtainStyledAttributes.recycle();
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

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x005e  */
    @Override // p028j.q
    public final void a(k kVar) {
        boolean z3;
        int i3;
        String string;
        boolean z4;
        this.f1725k = kVar;
        setVisibility(kVar.isVisible() ? 0 : 8);
        setTitle(kVar.f3456e);
        setCheckable(kVar.isCheckable());
        if (kVar.n.n()) {
            if ((kVar.n.m() ? kVar.f3461j : kVar.f3459h) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            z3 = false;
        }
        kVar.n.m();
        if (z3) {
            k kVar2 = this.f1725k;
            if (kVar2.n.n()) {
                if ((kVar2.n.m() ? kVar2.f3461j : kVar2.f3459h) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            } else {
                z4 = false;
            }
            i3 = z4 ? 0 : 8;
        }
        if (i3 == 0) {
            TextView textView = this.f1729p;
            k kVar3 = this.f1725k;
            p028j.j jVar = kVar3.n;
            Context context = jVar.f3431a;
            char c3 = jVar.m() ? kVar3.f3461j : kVar3.f3459h;
            if (c3 == 0) {
                string = StringUtils.EMPTY;
            } else {
                Resources resources = context.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i4 = jVar.m() ? kVar3.f3462k : kVar3.f3460i;
                k.a(sb, i4, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                k.a(sb, i4, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                k.a(sb, i4, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                k.a(sb, i4, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                k.a(sb, i4, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                k.a(sb, i4, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (c3 == '\b') {
                    sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c3 == '\n') {
                    sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c3 != ' ') {
                    sb.append(c3);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.f1729p.getVisibility() != i3) {
            this.f1729p.setVisibility(i3);
        }
        setIcon(kVar.getIcon());
        setEnabled(kVar.isEnabled());
        setSubMenuArrowVisible(kVar.hasSubMenu());
        setContentDescription(kVar.f3467q);
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

    @Override // p028j.q
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
        p028j.j jVar = this.f1725k.n;
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

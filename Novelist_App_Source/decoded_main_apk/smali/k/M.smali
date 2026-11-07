.class public abstract Lk/M;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj/r;


# static fields
.field public static final G:Ljava/lang/reflect/Method;

.field public static final H:Ljava/lang/reflect/Method;


# instance fields
.field public final A:Lk/J;

.field public final B:Landroid/os/Handler;

.field public final C:Landroid/graphics/Rect;

.field public D:Landroid/graphics/Rect;

.field public E:Z

.field public final F:Lk/r;

.field public final k:Landroid/content/Context;

.field public l:Landroid/widget/ListAdapter;

.field public m:Lk/O;

.field public n:I

.field public o:I

.field public p:I

.field public q:Z

.field public r:Z

.field public s:Z

.field public t:I

.field public u:LT/b;

.field public v:Landroid/view/View;

.field public w:Lj/l;

.field public final x:Lk/J;

.field public final y:Lk/L;

.field public final z:Lk/K;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-string v0, "ListPopupWindow"

    .line 2
    .line 3
    const-class v1, Landroid/widget/PopupWindow;

    .line 4
    .line 5
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v3, 0x1c

    .line 8
    .line 9
    if-gt v2, v3, :cond_0

    .line 10
    .line 11
    :try_start_0
    const-string v2, "setClipToScreenEnabled"

    .line 12
    .line 13
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 14
    .line 15
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    sput-object v2, Lk/M;->G:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catch_0
    const-string v2, "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well."

    .line 27
    .line 28
    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    :goto_0
    :try_start_1
    const-string v2, "setEpicenterBounds"

    .line 32
    .line 33
    const-class v3, Landroid/graphics/Rect;

    .line 34
    .line 35
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    sput-object v1, Lk/M;->H:Ljava/lang/reflect/Method;
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catch_1
    const-string v1, "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well."

    .line 47
    .line 48
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    :cond_0
    :goto_1
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x2

    .line 5
    iput v0, p0, Lk/M;->n:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lk/M;->t:I

    .line 9
    .line 10
    new-instance v1, Lk/J;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v1, p0, v2}, Lk/J;-><init>(Lk/M;I)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lk/M;->x:Lk/J;

    .line 17
    .line 18
    new-instance v1, Lk/L;

    .line 19
    .line 20
    invoke-direct {v1, p0}, Lk/L;-><init>(Lk/M;)V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Lk/M;->y:Lk/L;

    .line 24
    .line 25
    new-instance v1, Lk/K;

    .line 26
    .line 27
    invoke-direct {v1, p0}, Lk/K;-><init>(Lk/M;)V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, Lk/M;->z:Lk/K;

    .line 31
    .line 32
    new-instance v1, Lk/J;

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-direct {v1, p0, v2}, Lk/J;-><init>(Lk/M;I)V

    .line 36
    .line 37
    .line 38
    iput-object v1, p0, Lk/M;->A:Lk/J;

    .line 39
    .line 40
    new-instance v1, Landroid/graphics/Rect;

    .line 41
    .line 42
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object v1, p0, Lk/M;->C:Landroid/graphics/Rect;

    .line 46
    .line 47
    iput-object p1, p0, Lk/M;->k:Landroid/content/Context;

    .line 48
    .line 49
    new-instance v1, Landroid/os/Handler;

    .line 50
    .line 51
    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 56
    .line 57
    .line 58
    iput-object v1, p0, Lk/M;->B:Landroid/os/Handler;

    .line 59
    .line 60
    sget-object v1, Lf/a;->l:[I

    .line 61
    .line 62
    const/4 v2, 0x0

    .line 63
    invoke-virtual {p1, v2, v1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v1, v0, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    iput v3, p0, Lk/M;->o:I

    .line 72
    .line 73
    const/4 v3, 0x1

    .line 74
    invoke-virtual {v1, v3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    iput v4, p0, Lk/M;->p:I

    .line 79
    .line 80
    if-eqz v4, :cond_0

    .line 81
    .line 82
    iput-boolean v3, p0, Lk/M;->q:Z

    .line 83
    .line 84
    :cond_0
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 85
    .line 86
    .line 87
    new-instance v1, Lk/r;

    .line 88
    .line 89
    invoke-direct {v1, p1, v2, p2, v0}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 90
    .line 91
    .line 92
    sget-object v4, Lf/a;->p:[I

    .line 93
    .line 94
    invoke-virtual {p1, v2, v4, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    const/4 v2, 0x2

    .line 99
    invoke-virtual {p2, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    if-eqz v4, :cond_1

    .line 104
    .line 105
    invoke-virtual {p2, v2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setOverlapAnchor(Z)V

    .line 110
    .line 111
    .line 112
    :cond_1
    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-eqz v2, :cond_2

    .line 117
    .line 118
    invoke-virtual {p2, v0, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-eqz v2, :cond_2

    .line 123
    .line 124
    invoke-static {p1, v2}, Lg/a;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    goto :goto_0

    .line 129
    :cond_2
    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    :goto_0
    invoke-virtual {v1, p1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 137
    .line 138
    .line 139
    iput-object v1, p0, Lk/M;->F:Lk/r;

    .line 140
    .line 141
    invoke-virtual {v1, v3}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 142
    .line 143
    .line 144
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 11

    .line 1
    iget-object v0, p0, Lk/M;->m:Lk/O;

    .line 2
    .line 3
    iget-object v1, p0, Lk/M;->k:Landroid/content/Context;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, Lk/M;->F:Lk/r;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-boolean v0, p0, Lk/M;->E:Z

    .line 12
    .line 13
    xor-int/2addr v0, v2

    .line 14
    move-object v5, p0

    .line 15
    check-cast v5, Lk/P;

    .line 16
    .line 17
    new-instance v6, Lk/O;

    .line 18
    .line 19
    invoke-direct {v6, v1, v0}, Lk/O;-><init>(Landroid/content/Context;Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v6, v5}, Lk/O;->setHoverListener(Lk/N;)V

    .line 23
    .line 24
    .line 25
    iput-object v6, p0, Lk/M;->m:Lk/O;

    .line 26
    .line 27
    iget-object v0, p0, Lk/M;->l:Landroid/widget/ListAdapter;

    .line 28
    .line 29
    invoke-virtual {v6, v0}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lk/M;->m:Lk/O;

    .line 33
    .line 34
    iget-object v5, p0, Lk/M;->w:Lj/l;

    .line 35
    .line 36
    invoke-virtual {v0, v5}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lk/M;->m:Lk/O;

    .line 40
    .line 41
    invoke-virtual {v0, v2}, Landroid/view/View;->setFocusable(Z)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lk/M;->m:Lk/O;

    .line 45
    .line 46
    invoke-virtual {v0, v2}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lk/M;->m:Lk/O;

    .line 50
    .line 51
    new-instance v5, Lk/I;

    .line 52
    .line 53
    invoke-direct {v5, p0, v4}, Lk/I;-><init>(Ljava/lang/Object;I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v5}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lk/M;->m:Lk/O;

    .line 60
    .line 61
    iget-object v5, p0, Lk/M;->z:Lk/K;

    .line 62
    .line 63
    invoke-virtual {v0, v5}, Landroid/widget/AbsListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lk/M;->m:Lk/O;

    .line 67
    .line 68
    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, Landroid/view/ViewGroup;

    .line 77
    .line 78
    :goto_0
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iget-object v5, p0, Lk/M;->C:Landroid/graphics/Rect;

    .line 83
    .line 84
    if-eqz v0, :cond_1

    .line 85
    .line 86
    invoke-virtual {v0, v5}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 87
    .line 88
    .line 89
    iget v0, v5, Landroid/graphics/Rect;->top:I

    .line 90
    .line 91
    iget v6, v5, Landroid/graphics/Rect;->bottom:I

    .line 92
    .line 93
    add-int/2addr v6, v0

    .line 94
    iget-boolean v7, p0, Lk/M;->q:Z

    .line 95
    .line 96
    if-nez v7, :cond_2

    .line 97
    .line 98
    neg-int v0, v0

    .line 99
    iput v0, p0, Lk/M;->p:I

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_1
    invoke-virtual {v5}, Landroid/graphics/Rect;->setEmpty()V

    .line 103
    .line 104
    .line 105
    move v6, v4

    .line 106
    :cond_2
    :goto_1
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    const/4 v7, 0x2

    .line 111
    if-ne v0, v7, :cond_3

    .line 112
    .line 113
    move v0, v2

    .line 114
    goto :goto_2

    .line 115
    :cond_3
    move v0, v4

    .line 116
    :goto_2
    iget-object v7, p0, Lk/M;->v:Landroid/view/View;

    .line 117
    .line 118
    iget v8, p0, Lk/M;->p:I

    .line 119
    .line 120
    invoke-virtual {v3, v7, v8, v0}, Landroid/widget/PopupWindow;->getMaxAvailableHeight(Landroid/view/View;IZ)I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    iget v7, p0, Lk/M;->n:I

    .line 125
    .line 126
    const/4 v8, -0x2

    .line 127
    const/4 v9, -0x1

    .line 128
    if-eq v7, v8, :cond_5

    .line 129
    .line 130
    const/high16 v10, 0x40000000    # 2.0f

    .line 131
    .line 132
    if-eq v7, v9, :cond_4

    .line 133
    .line 134
    invoke-static {v7, v10}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    goto :goto_3

    .line 139
    :cond_4
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 148
    .line 149
    iget v7, v5, Landroid/graphics/Rect;->left:I

    .line 150
    .line 151
    iget v5, v5, Landroid/graphics/Rect;->right:I

    .line 152
    .line 153
    add-int/2addr v7, v5

    .line 154
    sub-int/2addr v1, v7

    .line 155
    invoke-static {v1, v10}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    goto :goto_3

    .line 160
    :cond_5
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 169
    .line 170
    iget v7, v5, Landroid/graphics/Rect;->left:I

    .line 171
    .line 172
    iget v5, v5, Landroid/graphics/Rect;->right:I

    .line 173
    .line 174
    add-int/2addr v7, v5

    .line 175
    sub-int/2addr v1, v7

    .line 176
    const/high16 v5, -0x80000000

    .line 177
    .line 178
    invoke-static {v1, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    :goto_3
    iget-object v5, p0, Lk/M;->m:Lk/O;

    .line 183
    .line 184
    invoke-virtual {v5, v1, v0}, Lk/D;->a(II)I

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    if-lez v0, :cond_6

    .line 189
    .line 190
    iget-object v1, p0, Lk/M;->m:Lk/O;

    .line 191
    .line 192
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    iget-object v4, p0, Lk/M;->m:Lk/O;

    .line 197
    .line 198
    invoke-virtual {v4}, Landroid/view/View;->getPaddingBottom()I

    .line 199
    .line 200
    .line 201
    move-result v4

    .line 202
    add-int/2addr v4, v1

    .line 203
    add-int/2addr v4, v6

    .line 204
    :cond_6
    add-int/2addr v0, v4

    .line 205
    iget-object v1, p0, Lk/M;->F:Lk/r;

    .line 206
    .line 207
    invoke-virtual {v1}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    .line 208
    .line 209
    .line 210
    const/16 v1, 0x3ea

    .line 211
    .line 212
    invoke-virtual {v3, v1}, Landroid/widget/PopupWindow;->setWindowLayoutType(I)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    if-eqz v1, :cond_c

    .line 220
    .line 221
    iget-object v1, p0, Lk/M;->v:Landroid/view/View;

    .line 222
    .line 223
    sget-object v4, LD/G;->a:Ljava/lang/reflect/Field;

    .line 224
    .line 225
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 226
    .line 227
    .line 228
    move-result v1

    .line 229
    if-nez v1, :cond_7

    .line 230
    .line 231
    goto/16 :goto_a

    .line 232
    .line 233
    :cond_7
    iget v1, p0, Lk/M;->n:I

    .line 234
    .line 235
    if-ne v1, v9, :cond_8

    .line 236
    .line 237
    move v1, v9

    .line 238
    goto :goto_4

    .line 239
    :cond_8
    if-ne v1, v8, :cond_9

    .line 240
    .line 241
    iget-object v1, p0, Lk/M;->v:Landroid/view/View;

    .line 242
    .line 243
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 244
    .line 245
    .line 246
    move-result v1

    .line 247
    :cond_9
    :goto_4
    invoke-virtual {v3, v2}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 248
    .line 249
    .line 250
    iget-object v4, p0, Lk/M;->v:Landroid/view/View;

    .line 251
    .line 252
    iget v5, p0, Lk/M;->o:I

    .line 253
    .line 254
    iget v6, p0, Lk/M;->p:I

    .line 255
    .line 256
    if-gez v1, :cond_a

    .line 257
    .line 258
    move v7, v9

    .line 259
    goto :goto_5

    .line 260
    :cond_a
    move v7, v1

    .line 261
    :goto_5
    if-gez v0, :cond_b

    .line 262
    .line 263
    move v8, v9

    .line 264
    goto :goto_6

    .line 265
    :cond_b
    move v8, v0

    .line 266
    :goto_6
    invoke-virtual/range {v3 .. v8}, Landroid/widget/PopupWindow;->update(Landroid/view/View;IIII)V

    .line 267
    .line 268
    .line 269
    return-void

    .line 270
    :cond_c
    iget v1, p0, Lk/M;->n:I

    .line 271
    .line 272
    if-ne v1, v9, :cond_d

    .line 273
    .line 274
    move v1, v9

    .line 275
    goto :goto_7

    .line 276
    :cond_d
    if-ne v1, v8, :cond_e

    .line 277
    .line 278
    iget-object v1, p0, Lk/M;->v:Landroid/view/View;

    .line 279
    .line 280
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 281
    .line 282
    .line 283
    move-result v1

    .line 284
    :cond_e
    :goto_7
    invoke-virtual {v3, v1}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 288
    .line 289
    .line 290
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 291
    .line 292
    const-string v1, "ListPopupWindow"

    .line 293
    .line 294
    const/16 v4, 0x1c

    .line 295
    .line 296
    if-gt v0, v4, :cond_f

    .line 297
    .line 298
    sget-object v0, Lk/M;->G:Ljava/lang/reflect/Method;

    .line 299
    .line 300
    if-eqz v0, :cond_10

    .line 301
    .line 302
    :try_start_0
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 303
    .line 304
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v5

    .line 308
    invoke-virtual {v0, v3, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 309
    .line 310
    .line 311
    goto :goto_8

    .line 312
    :catch_0
    const-string v0, "Could not call setClipToScreenEnabled() on PopupWindow. Oh well."

    .line 313
    .line 314
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 315
    .line 316
    .line 317
    goto :goto_8

    .line 318
    :cond_f
    invoke-static {v3}, Lio/flutter/plugin/platform/p;->u(Lk/r;)V

    .line 319
    .line 320
    .line 321
    :cond_10
    :goto_8
    invoke-virtual {v3, v2}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 322
    .line 323
    .line 324
    iget-object v0, p0, Lk/M;->y:Lk/L;

    .line 325
    .line 326
    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setTouchInterceptor(Landroid/view/View$OnTouchListener;)V

    .line 327
    .line 328
    .line 329
    iget-boolean v0, p0, Lk/M;->s:Z

    .line 330
    .line 331
    if-eqz v0, :cond_11

    .line 332
    .line 333
    iget-boolean v0, p0, Lk/M;->r:Z

    .line 334
    .line 335
    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setOverlapAnchor(Z)V

    .line 336
    .line 337
    .line 338
    :cond_11
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 339
    .line 340
    if-gt v0, v4, :cond_12

    .line 341
    .line 342
    sget-object v0, Lk/M;->H:Ljava/lang/reflect/Method;

    .line 343
    .line 344
    if-eqz v0, :cond_13

    .line 345
    .line 346
    :try_start_1
    iget-object v4, p0, Lk/M;->D:Landroid/graphics/Rect;

    .line 347
    .line 348
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v4

    .line 352
    invoke-virtual {v0, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 353
    .line 354
    .line 355
    goto :goto_9

    .line 356
    :catch_1
    move-exception v0

    .line 357
    const-string v4, "Could not invoke setEpicenterBounds on PopupWindow"

    .line 358
    .line 359
    invoke-static {v1, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 360
    .line 361
    .line 362
    goto :goto_9

    .line 363
    :cond_12
    iget-object v0, p0, Lk/M;->D:Landroid/graphics/Rect;

    .line 364
    .line 365
    invoke-static {v3, v0}, Lio/flutter/plugin/platform/p;->v(Lk/r;Landroid/graphics/Rect;)V

    .line 366
    .line 367
    .line 368
    :cond_13
    :goto_9
    iget-object v0, p0, Lk/M;->v:Landroid/view/View;

    .line 369
    .line 370
    iget v1, p0, Lk/M;->o:I

    .line 371
    .line 372
    iget v4, p0, Lk/M;->p:I

    .line 373
    .line 374
    iget v5, p0, Lk/M;->t:I

    .line 375
    .line 376
    invoke-virtual {v3, v0, v1, v4, v5}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;III)V

    .line 377
    .line 378
    .line 379
    iget-object v0, p0, Lk/M;->m:Lk/O;

    .line 380
    .line 381
    invoke-virtual {v0, v9}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 382
    .line 383
    .line 384
    iget-boolean v0, p0, Lk/M;->E:Z

    .line 385
    .line 386
    if-eqz v0, :cond_14

    .line 387
    .line 388
    iget-object v0, p0, Lk/M;->m:Lk/O;

    .line 389
    .line 390
    invoke-virtual {v0}, Lk/D;->isInTouchMode()Z

    .line 391
    .line 392
    .line 393
    move-result v0

    .line 394
    if-eqz v0, :cond_15

    .line 395
    .line 396
    :cond_14
    iget-object v0, p0, Lk/M;->m:Lk/O;

    .line 397
    .line 398
    if-eqz v0, :cond_15

    .line 399
    .line 400
    invoke-virtual {v0, v2}, Lk/D;->setListSelectionHidden(Z)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 404
    .line 405
    .line 406
    :cond_15
    iget-boolean v0, p0, Lk/M;->E:Z

    .line 407
    .line 408
    if-nez v0, :cond_16

    .line 409
    .line 410
    iget-object v0, p0, Lk/M;->B:Landroid/os/Handler;

    .line 411
    .line 412
    iget-object v1, p0, Lk/M;->A:Lk/J;

    .line 413
    .line 414
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 415
    .line 416
    .line 417
    :cond_16
    :goto_a
    return-void
.end method

.method public final b(Landroid/widget/ListAdapter;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lk/M;->u:LT/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LT/b;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, p0, v1}, LT/b;-><init>(Ljava/lang/Object;I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lk/M;->u:LT/b;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v1, p0, Lk/M;->l:Landroid/widget/ListAdapter;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {v1, v0}, Landroid/widget/Adapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    :goto_0
    iput-object p1, p0, Lk/M;->l:Landroid/widget/ListAdapter;

    .line 22
    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    iget-object v0, p0, Lk/M;->u:LT/b;

    .line 26
    .line 27
    invoke-interface {p1, v0}, Landroid/widget/Adapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 28
    .line 29
    .line 30
    :cond_2
    iget-object p1, p0, Lk/M;->m:Lk/O;

    .line 31
    .line 32
    if-eqz p1, :cond_3

    .line 33
    .line 34
    iget-object v0, p0, Lk/M;->l:Landroid/widget/ListAdapter;

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 37
    .line 38
    .line 39
    :cond_3
    return-void
.end method

.method public final dismiss()V
    .locals 2

    .line 1
    iget-object v0, p0, Lk/M;->F:Lk/r;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    iput-object v1, p0, Lk/M;->m:Lk/O;

    .line 11
    .line 12
    iget-object v0, p0, Lk/M;->B:Landroid/os/Handler;

    .line 13
    .line 14
    iget-object v1, p0, Lk/M;->x:Lk/J;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final e()Landroid/widget/ListView;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/M;->m:Lk/O;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lk/M;->F:Lk/r;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

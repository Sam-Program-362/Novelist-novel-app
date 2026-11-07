.class public final Lj/g;
.super Lj/l;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnKeyListener;
.implements Landroid/widget/PopupWindow$OnDismissListener;


# instance fields
.field public A:Z

.field public B:Z

.field public C:I

.field public D:I

.field public E:Z

.field public F:Z

.field public G:Lj/o;

.field public H:Landroid/view/ViewTreeObserver;

.field public I:Landroid/widget/PopupWindow$OnDismissListener;

.field public J:Z

.field public final l:Landroid/content/Context;

.field public final m:I

.field public final n:I

.field public final o:Z

.field public final p:Landroid/os/Handler;

.field public final q:Ljava/util/ArrayList;

.field public final r:Ljava/util/ArrayList;

.field public final s:Lj/c;

.field public final t:Lj/d;

.field public final u:LH0/i;

.field public v:I

.field public w:I

.field public x:Landroid/view/View;

.field public y:Landroid/view/View;

.field public z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/View;IZ)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lj/g;->q:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lj/g;->r:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v0, Lj/c;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-direct {v0, p0, v1}, Lj/c;-><init>(Lj/l;I)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lj/g;->s:Lj/c;

    .line 25
    .line 26
    new-instance v0, Lj/d;

    .line 27
    .line 28
    invoke-direct {v0, p0, v1}, Lj/d;-><init>(Lj/l;I)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lj/g;->t:Lj/d;

    .line 32
    .line 33
    new-instance v0, LH0/i;

    .line 34
    .line 35
    const/16 v2, 0x14

    .line 36
    .line 37
    invoke-direct {v0, p0, v2}, LH0/i;-><init>(Ljava/lang/Object;I)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lj/g;->u:LH0/i;

    .line 41
    .line 42
    iput v1, p0, Lj/g;->v:I

    .line 43
    .line 44
    iput v1, p0, Lj/g;->w:I

    .line 45
    .line 46
    iput-object p1, p0, Lj/g;->l:Landroid/content/Context;

    .line 47
    .line 48
    iput-object p2, p0, Lj/g;->x:Landroid/view/View;

    .line 49
    .line 50
    iput p3, p0, Lj/g;->n:I

    .line 51
    .line 52
    iput-boolean p4, p0, Lj/g;->o:Z

    .line 53
    .line 54
    iput-boolean v1, p0, Lj/g;->E:Z

    .line 55
    .line 56
    sget-object p3, LD/G;->a:Ljava/lang/reflect/Field;

    .line 57
    .line 58
    invoke-virtual {p2}, Landroid/view/View;->getLayoutDirection()I

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    const/4 p3, 0x1

    .line 63
    if-ne p2, p3, :cond_0

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    move v1, p3

    .line 67
    :goto_0
    iput v1, p0, Lj/g;->z:I

    .line 68
    .line 69
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    iget p2, p2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 78
    .line 79
    div-int/lit8 p2, p2, 0x2

    .line 80
    .line 81
    const p3, 0x7f070017

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    iput p1, p0, Lj/g;->m:I

    .line 93
    .line 94
    new-instance p1, Landroid/os/Handler;

    .line 95
    .line 96
    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    .line 97
    .line 98
    .line 99
    iput-object p1, p0, Lj/g;->p:Landroid/os/Handler;

    .line 100
    .line 101
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lj/g;->h()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object v0, p0, Lj/g;->q:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    move v3, v2

    .line 16
    :goto_0
    if-ge v3, v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    add-int/lit8 v3, v3, 0x1

    .line 23
    .line 24
    check-cast v4, Lj/j;

    .line 25
    .line 26
    invoke-virtual {p0, v4}, Lj/g;->u(Lj/j;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lj/g;->x:Landroid/view/View;

    .line 34
    .line 35
    iput-object v0, p0, Lj/g;->y:Landroid/view/View;

    .line 36
    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    iget-object v1, p0, Lj/g;->H:Landroid/view/ViewTreeObserver;

    .line 40
    .line 41
    if-nez v1, :cond_2

    .line 42
    .line 43
    const/4 v2, 0x1

    .line 44
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, Lj/g;->H:Landroid/view/ViewTreeObserver;

    .line 49
    .line 50
    if-eqz v2, :cond_3

    .line 51
    .line 52
    iget-object v1, p0, Lj/g;->s:Lj/c;

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 55
    .line 56
    .line 57
    :cond_3
    iget-object v0, p0, Lj/g;->y:Landroid/view/View;

    .line 58
    .line 59
    iget-object v1, p0, Lj/g;->t:Lj/d;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 62
    .line 63
    .line 64
    :cond_4
    :goto_1
    return-void
.end method

.method public final b(Lj/j;Z)V
    .locals 7

    .line 1
    iget-object v0, p0, Lj/g;->r:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    check-cast v4, Lj/f;

    .line 16
    .line 17
    iget-object v4, v4, Lj/f;->b:Lj/j;

    .line 18
    .line 19
    if-ne p1, v4, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v3, -0x1

    .line 26
    :goto_1
    if-gez v3, :cond_2

    .line 27
    .line 28
    goto/16 :goto_5

    .line 29
    .line 30
    :cond_2
    add-int/lit8 v1, v3, 0x1

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-ge v1, v4, :cond_3

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Lj/f;

    .line 43
    .line 44
    iget-object v1, v1, Lj/f;->b:Lj/j;

    .line 45
    .line 46
    invoke-virtual {v1, v2}, Lj/j;->c(Z)V

    .line 47
    .line 48
    .line 49
    :cond_3
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Lj/f;

    .line 54
    .line 55
    iget-object v3, v1, Lj/f;->b:Lj/j;

    .line 56
    .line 57
    iget-object v1, v1, Lj/f;->a:Lk/P;

    .line 58
    .line 59
    iget-object v3, v3, Lj/j;->r:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 60
    .line 61
    invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    :cond_4
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    if-eqz v5, :cond_6

    .line 70
    .line 71
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    check-cast v5, Ljava/lang/ref/WeakReference;

    .line 76
    .line 77
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    check-cast v6, Lj/p;

    .line 82
    .line 83
    if-eqz v6, :cond_5

    .line 84
    .line 85
    if-ne v6, p0, :cond_4

    .line 86
    .line 87
    :cond_5
    invoke-virtual {v3, v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_6
    iget-boolean v3, p0, Lj/g;->J:Z

    .line 92
    .line 93
    const/4 v4, 0x0

    .line 94
    if-eqz v3, :cond_7

    .line 95
    .line 96
    iget-object v3, v1, Lk/M;->F:Lk/r;

    .line 97
    .line 98
    invoke-virtual {v3, v4}, Landroid/widget/PopupWindow;->setExitTransition(Landroid/transition/Transition;)V

    .line 99
    .line 100
    .line 101
    iget-object v3, v1, Lk/M;->F:Lk/r;

    .line 102
    .line 103
    invoke-virtual {v3, v2}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    .line 104
    .line 105
    .line 106
    :cond_7
    invoke-virtual {v1}, Lk/M;->dismiss()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    const/4 v3, 0x1

    .line 114
    if-lez v1, :cond_8

    .line 115
    .line 116
    add-int/lit8 v5, v1, -0x1

    .line 117
    .line 118
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    check-cast v5, Lj/f;

    .line 123
    .line 124
    iget v5, v5, Lj/f;->c:I

    .line 125
    .line 126
    iput v5, p0, Lj/g;->z:I

    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_8
    iget-object v5, p0, Lj/g;->x:Landroid/view/View;

    .line 130
    .line 131
    sget-object v6, LD/G;->a:Ljava/lang/reflect/Field;

    .line 132
    .line 133
    invoke-virtual {v5}, Landroid/view/View;->getLayoutDirection()I

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    if-ne v5, v3, :cond_9

    .line 138
    .line 139
    move v5, v2

    .line 140
    goto :goto_3

    .line 141
    :cond_9
    move v5, v3

    .line 142
    :goto_3
    iput v5, p0, Lj/g;->z:I

    .line 143
    .line 144
    :goto_4
    if-nez v1, :cond_d

    .line 145
    .line 146
    invoke-virtual {p0}, Lj/g;->dismiss()V

    .line 147
    .line 148
    .line 149
    iget-object p2, p0, Lj/g;->G:Lj/o;

    .line 150
    .line 151
    if-eqz p2, :cond_a

    .line 152
    .line 153
    invoke-interface {p2, p1, v3}, Lj/o;->b(Lj/j;Z)V

    .line 154
    .line 155
    .line 156
    :cond_a
    iget-object p1, p0, Lj/g;->H:Landroid/view/ViewTreeObserver;

    .line 157
    .line 158
    if-eqz p1, :cond_c

    .line 159
    .line 160
    invoke-virtual {p1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 161
    .line 162
    .line 163
    move-result p1

    .line 164
    if-eqz p1, :cond_b

    .line 165
    .line 166
    iget-object p1, p0, Lj/g;->H:Landroid/view/ViewTreeObserver;

    .line 167
    .line 168
    iget-object p2, p0, Lj/g;->s:Lj/c;

    .line 169
    .line 170
    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 171
    .line 172
    .line 173
    :cond_b
    iput-object v4, p0, Lj/g;->H:Landroid/view/ViewTreeObserver;

    .line 174
    .line 175
    :cond_c
    iget-object p1, p0, Lj/g;->y:Landroid/view/View;

    .line 176
    .line 177
    iget-object p2, p0, Lj/g;->t:Lj/d;

    .line 178
    .line 179
    invoke-virtual {p1, p2}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 180
    .line 181
    .line 182
    iget-object p1, p0, Lj/g;->I:Landroid/widget/PopupWindow$OnDismissListener;

    .line 183
    .line 184
    invoke-interface {p1}, Landroid/widget/PopupWindow$OnDismissListener;->onDismiss()V

    .line 185
    .line 186
    .line 187
    return-void

    .line 188
    :cond_d
    if-eqz p2, :cond_e

    .line 189
    .line 190
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    check-cast p1, Lj/f;

    .line 195
    .line 196
    iget-object p1, p1, Lj/f;->b:Lj/j;

    .line 197
    .line 198
    invoke-virtual {p1, v2}, Lj/j;->c(Z)V

    .line 199
    .line 200
    .line 201
    :cond_e
    :goto_5
    return-void
.end method

.method public final d()V
    .locals 5

    .line 1
    iget-object v0, p0, Lj/g;->r:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v1, :cond_1

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    add-int/lit8 v2, v2, 0x1

    .line 15
    .line 16
    check-cast v3, Lj/f;

    .line 17
    .line 18
    iget-object v3, v3, Lj/f;->a:Lk/P;

    .line 19
    .line 20
    iget-object v3, v3, Lk/M;->m:Lk/O;

    .line 21
    .line 22
    invoke-virtual {v3}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    instance-of v4, v3, Landroid/widget/HeaderViewListAdapter;

    .line 27
    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    check-cast v3, Landroid/widget/HeaderViewListAdapter;

    .line 31
    .line 32
    invoke-virtual {v3}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Lj/h;

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    check-cast v3, Lj/h;

    .line 40
    .line 41
    :goto_1
    invoke-virtual {v3}, Lj/h;->notifyDataSetChanged()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    return-void
.end method

.method public final dismiss()V
    .locals 4

    .line 1
    iget-object v0, p0, Lj/g;->r:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-lez v1, :cond_1

    .line 8
    .line 9
    new-array v2, v1, [Lj/f;

    .line 10
    .line 11
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, [Lj/f;

    .line 16
    .line 17
    add-int/lit8 v1, v1, -0x1

    .line 18
    .line 19
    :goto_0
    if-ltz v1, :cond_1

    .line 20
    .line 21
    aget-object v2, v0, v1

    .line 22
    .line 23
    iget-object v3, v2, Lj/f;->a:Lk/P;

    .line 24
    .line 25
    iget-object v3, v3, Lk/M;->F:Lk/r;

    .line 26
    .line 27
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    iget-object v2, v2, Lj/f;->a:Lk/P;

    .line 34
    .line 35
    invoke-virtual {v2}, Lk/M;->dismiss()V

    .line 36
    .line 37
    .line 38
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return-void
.end method

.method public final e()Landroid/widget/ListView;
    .locals 2

    .line 1
    iget-object v0, p0, Lj/g;->r:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return-object v0

    .line 11
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/lit8 v1, v1, -0x1

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lj/f;

    .line 22
    .line 23
    iget-object v0, v0, Lj/f;->a:Lk/P;

    .line 24
    .line 25
    iget-object v0, v0, Lk/M;->m:Lk/O;

    .line 26
    .line 27
    return-object v0
.end method

.method public final g()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final h()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lj/g;->r:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-lez v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lj/f;

    .line 15
    .line 16
    iget-object v0, v0, Lj/f;->a:Lk/P;

    .line 17
    .line 18
    iget-object v0, v0, Lk/M;->F:Lk/r;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    return v0

    .line 28
    :cond_0
    return v2
.end method

.method public final j(Lj/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lj/g;->G:Lj/o;

    .line 2
    .line 3
    return-void
.end method

.method public final k(Lj/t;)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lj/g;->r:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :cond_0
    const/4 v4, 0x1

    .line 10
    if-ge v3, v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v5

    .line 16
    add-int/lit8 v3, v3, 0x1

    .line 17
    .line 18
    check-cast v5, Lj/f;

    .line 19
    .line 20
    iget-object v6, v5, Lj/f;->b:Lj/j;

    .line 21
    .line 22
    if-ne p1, v6, :cond_0

    .line 23
    .line 24
    iget-object p1, v5, Lj/f;->a:Lk/P;

    .line 25
    .line 26
    iget-object p1, p1, Lk/M;->m:Lk/O;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 29
    .line 30
    .line 31
    return v4

    .line 32
    :cond_1
    invoke-virtual {p1}, Lj/j;->hasVisibleItems()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lj/g;->l(Lj/j;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lj/g;->G:Lj/o;

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    invoke-interface {v0, p1}, Lj/o;->j(Lj/j;)Z

    .line 46
    .line 47
    .line 48
    :cond_2
    return v4

    .line 49
    :cond_3
    return v2
.end method

.method public final l(Lj/j;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lj/g;->l:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {p1, p0, v0}, Lj/j;->b(Lj/p;Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lj/g;->h()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lj/g;->u(Lj/j;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object v0, p0, Lj/g;->q:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final n(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lj/g;->x:Landroid/view/View;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lj/g;->x:Landroid/view/View;

    .line 6
    .line 7
    iget v0, p0, Lj/g;->v:I

    .line 8
    .line 9
    sget-object v1, LD/G;->a:Ljava/lang/reflect/Field;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getLayoutDirection()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-static {v0, p1}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iput p1, p0, Lj/g;->w:I

    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final o(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lj/g;->E:Z

    .line 2
    .line 3
    return-void
.end method

.method public final onDismiss()V
    .locals 6

    .line 1
    iget-object v0, p0, Lj/g;->r:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    check-cast v4, Lj/f;

    .line 16
    .line 17
    iget-object v5, v4, Lj/f;->a:Lk/P;

    .line 18
    .line 19
    iget-object v5, v5, Lk/M;->F:Lk/r;

    .line 20
    .line 21
    invoke-virtual {v5}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-nez v5, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v4, 0x0

    .line 32
    :goto_1
    if-eqz v4, :cond_2

    .line 33
    .line 34
    iget-object v0, v4, Lj/f;->b:Lj/j;

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Lj/j;->c(Z)V

    .line 37
    .line 38
    .line 39
    :cond_2
    return-void
.end method

.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 p3, 0x1

    .line 6
    if-ne p1, p3, :cond_0

    .line 7
    .line 8
    const/16 p1, 0x52

    .line 9
    .line 10
    if-ne p2, p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lj/g;->dismiss()V

    .line 13
    .line 14
    .line 15
    return p3

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return p1
.end method

.method public final p(I)V
    .locals 2

    .line 1
    iget v0, p0, Lj/g;->v:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lj/g;->v:I

    .line 6
    .line 7
    iget-object v0, p0, Lj/g;->x:Landroid/view/View;

    .line 8
    .line 9
    sget-object v1, LD/G;->a:Ljava/lang/reflect/Field;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {p1, v0}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iput p1, p0, Lj/g;->w:I

    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final q(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lj/g;->A:Z

    .line 3
    .line 4
    iput p1, p0, Lj/g;->C:I

    .line 5
    .line 6
    return-void
.end method

.method public final r(Landroid/widget/PopupWindow$OnDismissListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lj/g;->I:Landroid/widget/PopupWindow$OnDismissListener;

    .line 2
    .line 3
    return-void
.end method

.method public final s(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lj/g;->F:Z

    .line 2
    .line 3
    return-void
.end method

.method public final t(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lj/g;->B:Z

    .line 3
    .line 4
    iput p1, p0, Lj/g;->D:I

    .line 5
    .line 6
    return-void
.end method

.method public final u(Lj/j;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lj/g;->l:Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    new-instance v4, Lj/h;

    .line 12
    .line 13
    iget-boolean v5, v0, Lj/g;->o:Z

    .line 14
    .line 15
    const v6, 0x7f0c000b

    .line 16
    .line 17
    .line 18
    invoke-direct {v4, v1, v3, v5, v6}, Lj/h;-><init>(Lj/j;Landroid/view/LayoutInflater;ZI)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lj/g;->h()Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    const/4 v6, 0x1

    .line 26
    if-nez v5, :cond_0

    .line 27
    .line 28
    iget-boolean v5, v0, Lj/g;->E:Z

    .line 29
    .line 30
    if-eqz v5, :cond_0

    .line 31
    .line 32
    iput-boolean v6, v4, Lj/h;->m:Z

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_0
    invoke-virtual {v0}, Lj/g;->h()Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-eqz v5, :cond_3

    .line 40
    .line 41
    iget-object v5, v1, Lj/j;->f:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    const/4 v8, 0x0

    .line 48
    :goto_0
    if-ge v8, v5, :cond_2

    .line 49
    .line 50
    invoke-virtual {v1, v8}, Lj/j;->getItem(I)Landroid/view/MenuItem;

    .line 51
    .line 52
    .line 53
    move-result-object v9

    .line 54
    invoke-interface {v9}, Landroid/view/MenuItem;->isVisible()Z

    .line 55
    .line 56
    .line 57
    move-result v10

    .line 58
    if-eqz v10, :cond_1

    .line 59
    .line 60
    invoke-interface {v9}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    .line 61
    .line 62
    .line 63
    move-result-object v9

    .line 64
    if-eqz v9, :cond_1

    .line 65
    .line 66
    move v5, v6

    .line 67
    goto :goto_1

    .line 68
    :cond_1
    add-int/lit8 v8, v8, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    const/4 v5, 0x0

    .line 72
    :goto_1
    iput-boolean v5, v4, Lj/h;->m:Z

    .line 73
    .line 74
    :cond_3
    :goto_2
    iget v5, v0, Lj/g;->m:I

    .line 75
    .line 76
    invoke-static {v4, v2, v5}, Lj/l;->m(Landroid/widget/ListAdapter;Landroid/content/Context;I)I

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    new-instance v8, Lk/P;

    .line 81
    .line 82
    iget v9, v0, Lj/g;->n:I

    .line 83
    .line 84
    invoke-direct {v8, v2, v9}, Lk/M;-><init>(Landroid/content/Context;I)V

    .line 85
    .line 86
    .line 87
    iget-object v2, v0, Lj/g;->u:LH0/i;

    .line 88
    .line 89
    iput-object v2, v8, Lk/P;->I:LH0/i;

    .line 90
    .line 91
    iput-object v0, v8, Lk/M;->w:Lj/l;

    .line 92
    .line 93
    iget-object v2, v8, Lk/M;->F:Lk/r;

    .line 94
    .line 95
    invoke-virtual {v2, v0}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 96
    .line 97
    .line 98
    iget-object v2, v0, Lj/g;->x:Landroid/view/View;

    .line 99
    .line 100
    iput-object v2, v8, Lk/M;->v:Landroid/view/View;

    .line 101
    .line 102
    iget v2, v0, Lj/g;->w:I

    .line 103
    .line 104
    iput v2, v8, Lk/M;->t:I

    .line 105
    .line 106
    iput-boolean v6, v8, Lk/M;->E:Z

    .line 107
    .line 108
    iget-object v2, v8, Lk/M;->F:Lk/r;

    .line 109
    .line 110
    invoke-virtual {v2, v6}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 111
    .line 112
    .line 113
    iget-object v2, v8, Lk/M;->F:Lk/r;

    .line 114
    .line 115
    const/4 v9, 0x2

    .line 116
    invoke-virtual {v2, v9}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v8, v4}, Lk/M;->b(Landroid/widget/ListAdapter;)V

    .line 120
    .line 121
    .line 122
    iget-object v2, v8, Lk/M;->F:Lk/r;

    .line 123
    .line 124
    invoke-virtual {v2}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    if-eqz v2, :cond_4

    .line 129
    .line 130
    iget-object v4, v8, Lk/M;->C:Landroid/graphics/Rect;

    .line 131
    .line 132
    invoke-virtual {v2, v4}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 133
    .line 134
    .line 135
    iget v2, v4, Landroid/graphics/Rect;->left:I

    .line 136
    .line 137
    iget v4, v4, Landroid/graphics/Rect;->right:I

    .line 138
    .line 139
    add-int/2addr v2, v4

    .line 140
    add-int/2addr v2, v5

    .line 141
    iput v2, v8, Lk/M;->n:I

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_4
    iput v5, v8, Lk/M;->n:I

    .line 145
    .line 146
    :goto_3
    iget v2, v0, Lj/g;->w:I

    .line 147
    .line 148
    iput v2, v8, Lk/M;->t:I

    .line 149
    .line 150
    iget-object v2, v0, Lj/g;->r:Ljava/util/ArrayList;

    .line 151
    .line 152
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    const/4 v10, 0x0

    .line 157
    if-lez v4, :cond_e

    .line 158
    .line 159
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 160
    .line 161
    .line 162
    move-result v4

    .line 163
    sub-int/2addr v4, v6

    .line 164
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    check-cast v4, Lj/f;

    .line 169
    .line 170
    iget-object v11, v4, Lj/f;->b:Lj/j;

    .line 171
    .line 172
    iget-object v12, v11, Lj/j;->f:Ljava/util/ArrayList;

    .line 173
    .line 174
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 175
    .line 176
    .line 177
    move-result v12

    .line 178
    const/4 v13, 0x0

    .line 179
    :goto_4
    if-ge v13, v12, :cond_6

    .line 180
    .line 181
    invoke-virtual {v11, v13}, Lj/j;->getItem(I)Landroid/view/MenuItem;

    .line 182
    .line 183
    .line 184
    move-result-object v14

    .line 185
    invoke-interface {v14}, Landroid/view/MenuItem;->hasSubMenu()Z

    .line 186
    .line 187
    .line 188
    move-result v15

    .line 189
    if-eqz v15, :cond_5

    .line 190
    .line 191
    invoke-interface {v14}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    .line 192
    .line 193
    .line 194
    move-result-object v15

    .line 195
    if-ne v1, v15, :cond_5

    .line 196
    .line 197
    goto :goto_5

    .line 198
    :cond_5
    add-int/lit8 v13, v13, 0x1

    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_6
    move-object v14, v10

    .line 202
    :goto_5
    if-nez v14, :cond_7

    .line 203
    .line 204
    move/from16 v17, v6

    .line 205
    .line 206
    move-object v6, v10

    .line 207
    const/16 v16, 0x0

    .line 208
    .line 209
    goto :goto_a

    .line 210
    :cond_7
    iget-object v11, v4, Lj/f;->a:Lk/P;

    .line 211
    .line 212
    iget-object v11, v11, Lk/M;->m:Lk/O;

    .line 213
    .line 214
    invoke-virtual {v11}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 215
    .line 216
    .line 217
    move-result-object v12

    .line 218
    instance-of v13, v12, Landroid/widget/HeaderViewListAdapter;

    .line 219
    .line 220
    if-eqz v13, :cond_8

    .line 221
    .line 222
    check-cast v12, Landroid/widget/HeaderViewListAdapter;

    .line 223
    .line 224
    invoke-virtual {v12}, Landroid/widget/HeaderViewListAdapter;->getHeadersCount()I

    .line 225
    .line 226
    .line 227
    move-result v13

    .line 228
    invoke-virtual {v12}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    .line 229
    .line 230
    .line 231
    move-result-object v12

    .line 232
    check-cast v12, Lj/h;

    .line 233
    .line 234
    goto :goto_6

    .line 235
    :cond_8
    check-cast v12, Lj/h;

    .line 236
    .line 237
    const/4 v13, 0x0

    .line 238
    :goto_6
    invoke-virtual {v12}, Lj/h;->getCount()I

    .line 239
    .line 240
    .line 241
    move-result v15

    .line 242
    move/from16 v17, v6

    .line 243
    .line 244
    const/4 v7, 0x0

    .line 245
    const/16 v16, 0x0

    .line 246
    .line 247
    :goto_7
    const/4 v6, -0x1

    .line 248
    if-ge v7, v15, :cond_a

    .line 249
    .line 250
    invoke-virtual {v12, v7}, Lj/h;->b(I)Lj/k;

    .line 251
    .line 252
    .line 253
    move-result-object v9

    .line 254
    if-ne v14, v9, :cond_9

    .line 255
    .line 256
    goto :goto_8

    .line 257
    :cond_9
    add-int/lit8 v7, v7, 0x1

    .line 258
    .line 259
    const/4 v9, 0x2

    .line 260
    goto :goto_7

    .line 261
    :cond_a
    move v7, v6

    .line 262
    :goto_8
    if-ne v7, v6, :cond_c

    .line 263
    .line 264
    :cond_b
    :goto_9
    move-object v6, v10

    .line 265
    goto :goto_a

    .line 266
    :cond_c
    add-int/2addr v7, v13

    .line 267
    invoke-virtual {v11}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    .line 268
    .line 269
    .line 270
    move-result v6

    .line 271
    sub-int/2addr v7, v6

    .line 272
    if-ltz v7, :cond_b

    .line 273
    .line 274
    invoke-virtual {v11}, Landroid/view/ViewGroup;->getChildCount()I

    .line 275
    .line 276
    .line 277
    move-result v6

    .line 278
    if-lt v7, v6, :cond_d

    .line 279
    .line 280
    goto :goto_9

    .line 281
    :cond_d
    invoke-virtual {v11, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 282
    .line 283
    .line 284
    move-result-object v6

    .line 285
    goto :goto_a

    .line 286
    :cond_e
    move/from16 v17, v6

    .line 287
    .line 288
    const/16 v16, 0x0

    .line 289
    .line 290
    move-object v4, v10

    .line 291
    move-object v6, v4

    .line 292
    :goto_a
    if-eqz v6, :cond_1a

    .line 293
    .line 294
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 295
    .line 296
    const/16 v9, 0x1c

    .line 297
    .line 298
    iget-object v11, v8, Lk/M;->F:Lk/r;

    .line 299
    .line 300
    if-gt v7, v9, :cond_f

    .line 301
    .line 302
    sget-object v7, Lk/P;->J:Ljava/lang/reflect/Method;

    .line 303
    .line 304
    if-eqz v7, :cond_10

    .line 305
    .line 306
    :try_start_0
    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 307
    .line 308
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v9

    .line 312
    invoke-virtual {v7, v11, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 313
    .line 314
    .line 315
    goto :goto_b

    .line 316
    :catch_0
    const-string v7, "MenuPopupWindow"

    .line 317
    .line 318
    const-string v9, "Could not invoke setTouchModal() on PopupWindow. Oh well."

    .line 319
    .line 320
    invoke-static {v7, v9}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 321
    .line 322
    .line 323
    goto :goto_b

    .line 324
    :cond_f
    invoke-static {v11}, Lio/flutter/plugin/platform/p;->s(Landroid/widget/PopupWindow;)V

    .line 325
    .line 326
    .line 327
    :cond_10
    :goto_b
    iget-object v7, v8, Lk/M;->F:Lk/r;

    .line 328
    .line 329
    invoke-virtual {v7, v10}, Landroid/widget/PopupWindow;->setEnterTransition(Landroid/transition/Transition;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 333
    .line 334
    .line 335
    move-result v7

    .line 336
    add-int/lit8 v7, v7, -0x1

    .line 337
    .line 338
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v7

    .line 342
    check-cast v7, Lj/f;

    .line 343
    .line 344
    iget-object v7, v7, Lj/f;->a:Lk/P;

    .line 345
    .line 346
    iget-object v7, v7, Lk/M;->m:Lk/O;

    .line 347
    .line 348
    const/4 v9, 0x2

    .line 349
    new-array v11, v9, [I

    .line 350
    .line 351
    invoke-virtual {v7, v11}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 352
    .line 353
    .line 354
    new-instance v9, Landroid/graphics/Rect;

    .line 355
    .line 356
    invoke-direct {v9}, Landroid/graphics/Rect;-><init>()V

    .line 357
    .line 358
    .line 359
    iget-object v12, v0, Lj/g;->y:Landroid/view/View;

    .line 360
    .line 361
    invoke-virtual {v12, v9}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 362
    .line 363
    .line 364
    iget v12, v0, Lj/g;->z:I

    .line 365
    .line 366
    move/from16 v13, v17

    .line 367
    .line 368
    if-ne v12, v13, :cond_13

    .line 369
    .line 370
    aget v11, v11, v16

    .line 371
    .line 372
    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    .line 373
    .line 374
    .line 375
    move-result v7

    .line 376
    add-int/2addr v7, v11

    .line 377
    add-int/2addr v7, v5

    .line 378
    iget v9, v9, Landroid/graphics/Rect;->right:I

    .line 379
    .line 380
    if-le v7, v9, :cond_12

    .line 381
    .line 382
    :cond_11
    move/from16 v7, v16

    .line 383
    .line 384
    :goto_c
    const/4 v13, 0x1

    .line 385
    goto :goto_e

    .line 386
    :cond_12
    :goto_d
    const/4 v7, 0x1

    .line 387
    goto :goto_c

    .line 388
    :cond_13
    aget v7, v11, v16

    .line 389
    .line 390
    sub-int/2addr v7, v5

    .line 391
    if-gez v7, :cond_11

    .line 392
    .line 393
    goto :goto_d

    .line 394
    :goto_e
    if-ne v7, v13, :cond_14

    .line 395
    .line 396
    const/4 v9, 0x1

    .line 397
    goto :goto_f

    .line 398
    :cond_14
    move/from16 v9, v16

    .line 399
    .line 400
    :goto_f
    iput v7, v0, Lj/g;->z:I

    .line 401
    .line 402
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 403
    .line 404
    const/16 v11, 0x1a

    .line 405
    .line 406
    const/4 v12, 0x5

    .line 407
    if-lt v7, v11, :cond_15

    .line 408
    .line 409
    iput-object v6, v8, Lk/M;->v:Landroid/view/View;

    .line 410
    .line 411
    move/from16 v7, v16

    .line 412
    .line 413
    move v13, v7

    .line 414
    goto :goto_10

    .line 415
    :cond_15
    const/4 v7, 0x2

    .line 416
    new-array v11, v7, [I

    .line 417
    .line 418
    iget-object v13, v0, Lj/g;->x:Landroid/view/View;

    .line 419
    .line 420
    invoke-virtual {v13, v11}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 421
    .line 422
    .line 423
    new-array v7, v7, [I

    .line 424
    .line 425
    invoke-virtual {v6, v7}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 426
    .line 427
    .line 428
    iget v13, v0, Lj/g;->w:I

    .line 429
    .line 430
    and-int/lit8 v13, v13, 0x7

    .line 431
    .line 432
    if-ne v13, v12, :cond_16

    .line 433
    .line 434
    aget v13, v11, v16

    .line 435
    .line 436
    iget-object v14, v0, Lj/g;->x:Landroid/view/View;

    .line 437
    .line 438
    invoke-virtual {v14}, Landroid/view/View;->getWidth()I

    .line 439
    .line 440
    .line 441
    move-result v14

    .line 442
    add-int/2addr v14, v13

    .line 443
    aput v14, v11, v16

    .line 444
    .line 445
    aget v13, v7, v16

    .line 446
    .line 447
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    .line 448
    .line 449
    .line 450
    move-result v14

    .line 451
    add-int/2addr v14, v13

    .line 452
    aput v14, v7, v16

    .line 453
    .line 454
    :cond_16
    aget v13, v7, v16

    .line 455
    .line 456
    aget v14, v11, v16

    .line 457
    .line 458
    sub-int/2addr v13, v14

    .line 459
    const/16 v17, 0x1

    .line 460
    .line 461
    aget v7, v7, v17

    .line 462
    .line 463
    aget v11, v11, v17

    .line 464
    .line 465
    sub-int/2addr v7, v11

    .line 466
    :goto_10
    iget v11, v0, Lj/g;->w:I

    .line 467
    .line 468
    and-int/2addr v11, v12

    .line 469
    if-ne v11, v12, :cond_19

    .line 470
    .line 471
    if-eqz v9, :cond_17

    .line 472
    .line 473
    add-int/2addr v13, v5

    .line 474
    goto :goto_11

    .line 475
    :cond_17
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    .line 476
    .line 477
    .line 478
    move-result v5

    .line 479
    :cond_18
    sub-int/2addr v13, v5

    .line 480
    goto :goto_11

    .line 481
    :cond_19
    if-eqz v9, :cond_18

    .line 482
    .line 483
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    .line 484
    .line 485
    .line 486
    move-result v5

    .line 487
    add-int/2addr v13, v5

    .line 488
    :goto_11
    iput v13, v8, Lk/M;->o:I

    .line 489
    .line 490
    const/4 v13, 0x1

    .line 491
    iput-boolean v13, v8, Lk/M;->s:Z

    .line 492
    .line 493
    iput-boolean v13, v8, Lk/M;->r:Z

    .line 494
    .line 495
    iput v7, v8, Lk/M;->p:I

    .line 496
    .line 497
    iput-boolean v13, v8, Lk/M;->q:Z

    .line 498
    .line 499
    goto :goto_13

    .line 500
    :cond_1a
    iget-boolean v5, v0, Lj/g;->A:Z

    .line 501
    .line 502
    if-eqz v5, :cond_1b

    .line 503
    .line 504
    iget v5, v0, Lj/g;->C:I

    .line 505
    .line 506
    iput v5, v8, Lk/M;->o:I

    .line 507
    .line 508
    :cond_1b
    iget-boolean v5, v0, Lj/g;->B:Z

    .line 509
    .line 510
    if-eqz v5, :cond_1c

    .line 511
    .line 512
    iget v5, v0, Lj/g;->D:I

    .line 513
    .line 514
    iput v5, v8, Lk/M;->p:I

    .line 515
    .line 516
    const/4 v13, 0x1

    .line 517
    iput-boolean v13, v8, Lk/M;->q:Z

    .line 518
    .line 519
    :cond_1c
    iget-object v5, v0, Lj/l;->k:Landroid/graphics/Rect;

    .line 520
    .line 521
    if-eqz v5, :cond_1d

    .line 522
    .line 523
    new-instance v6, Landroid/graphics/Rect;

    .line 524
    .line 525
    invoke-direct {v6, v5}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 526
    .line 527
    .line 528
    goto :goto_12

    .line 529
    :cond_1d
    move-object v6, v10

    .line 530
    :goto_12
    iput-object v6, v8, Lk/M;->D:Landroid/graphics/Rect;

    .line 531
    .line 532
    :goto_13
    new-instance v5, Lj/f;

    .line 533
    .line 534
    iget v6, v0, Lj/g;->z:I

    .line 535
    .line 536
    invoke-direct {v5, v8, v1, v6}, Lj/f;-><init>(Lk/P;Lj/j;I)V

    .line 537
    .line 538
    .line 539
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 540
    .line 541
    .line 542
    invoke-virtual {v8}, Lk/M;->a()V

    .line 543
    .line 544
    .line 545
    iget-object v2, v8, Lk/M;->m:Lk/O;

    .line 546
    .line 547
    invoke-virtual {v2, v0}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 548
    .line 549
    .line 550
    if-nez v4, :cond_1e

    .line 551
    .line 552
    iget-boolean v4, v0, Lj/g;->F:Z

    .line 553
    .line 554
    if-eqz v4, :cond_1e

    .line 555
    .line 556
    iget-object v4, v1, Lj/j;->l:Ljava/lang/CharSequence;

    .line 557
    .line 558
    if-eqz v4, :cond_1e

    .line 559
    .line 560
    const v4, 0x7f0c0012

    .line 561
    .line 562
    .line 563
    move/from16 v5, v16

    .line 564
    .line 565
    invoke-virtual {v3, v4, v2, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 566
    .line 567
    .line 568
    move-result-object v3

    .line 569
    check-cast v3, Landroid/widget/FrameLayout;

    .line 570
    .line 571
    const v4, 0x1020016

    .line 572
    .line 573
    .line 574
    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 575
    .line 576
    .line 577
    move-result-object v4

    .line 578
    check-cast v4, Landroid/widget/TextView;

    .line 579
    .line 580
    invoke-virtual {v3, v5}, Landroid/view/View;->setEnabled(Z)V

    .line 581
    .line 582
    .line 583
    iget-object v1, v1, Lj/j;->l:Ljava/lang/CharSequence;

    .line 584
    .line 585
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 586
    .line 587
    .line 588
    invoke-virtual {v2, v3, v10, v5}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 589
    .line 590
    .line 591
    invoke-virtual {v8}, Lk/M;->a()V

    .line 592
    .line 593
    .line 594
    :cond_1e
    return-void
.end method

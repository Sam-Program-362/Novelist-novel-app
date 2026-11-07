.class public final Lk/S;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final f:Landroid/graphics/PorterDuff$Mode;

.field public static g:Lk/S;

.field public static final h:Lk/Q;


# instance fields
.field public a:Ljava/util/WeakHashMap;

.field public final b:Ljava/util/WeakHashMap;

.field public c:Landroid/util/TypedValue;

.field public d:Z

.field public e:LM0/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 2
    .line 3
    sput-object v0, Lk/S;->f:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    new-instance v0, Lk/Q;

    .line 6
    .line 7
    const/4 v1, 0x6

    .line 8
    invoke-direct {v0, v1}, Lo/i;-><init>(I)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lk/S;->h:Lk/Q;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/WeakHashMap;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/util/WeakHashMap;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lk/S;->b:Ljava/util/WeakHashMap;

    .line 11
    .line 12
    return-void
.end method

.method public static declared-synchronized b()Lk/S;
    .locals 2

    .line 1
    const-class v0, Lk/S;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lk/S;->g:Lk/S;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Lk/S;

    .line 9
    .line 10
    invoke-direct {v1}, Lk/S;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lk/S;->g:Lk/S;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    sget-object v1, Lk/S;->g:Lk/S;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-object v1

    .line 22
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw v1
.end method

.method public static declared-synchronized e(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
    .locals 4

    .line 1
    const-class v0, Lk/S;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lk/S;->h:Lk/Q;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/16 v2, 0x1f

    .line 10
    .line 11
    add-int v3, v2, p0

    .line 12
    .line 13
    mul-int/2addr v3, v2

    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    add-int/2addr v2, v3

    .line 19
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v1, v2}, Lo/i;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Landroid/graphics/PorterDuffColorFilter;

    .line 28
    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    new-instance v2, Landroid/graphics/PorterDuffColorFilter;

    .line 32
    .line 33
    invoke-direct {v2, p0, p1}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    add-int/2addr p0, v3

    .line 41
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {v1, p0, v2}, Lo/i;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    check-cast p0, Landroid/graphics/PorterDuffColorFilter;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception p0

    .line 53
    goto :goto_1

    .line 54
    :cond_0
    :goto_0
    monitor-exit v0

    .line 55
    return-object v2

    .line 56
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 57
    throw p0
.end method


# virtual methods
.method public final a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 9

    .line 1
    iget-object v0, p0, Lk/S;->c:Landroid/util/TypedValue;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/util/TypedValue;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lk/S;->c:Landroid/util/TypedValue;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lk/S;->c:Landroid/util/TypedValue;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v1, p2, v0, v2}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 20
    .line 21
    .line 22
    iget v1, v0, Landroid/util/TypedValue;->assetCookie:I

    .line 23
    .line 24
    int-to-long v1, v1

    .line 25
    const/16 v3, 0x20

    .line 26
    .line 27
    shl-long/2addr v1, v3

    .line 28
    iget v3, v0, Landroid/util/TypedValue;->data:I

    .line 29
    .line 30
    int-to-long v3, v3

    .line 31
    or-long/2addr v1, v3

    .line 32
    monitor-enter p0

    .line 33
    :try_start_0
    iget-object v3, p0, Lk/S;->b:Ljava/util/WeakHashMap;

    .line 34
    .line 35
    invoke-virtual {v3, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Lo/g;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    const/4 v4, 0x0

    .line 42
    if-nez v3, :cond_1

    .line 43
    .line 44
    monitor-exit p0

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    :try_start_1
    iget-object v5, v3, Lo/g;->l:[J

    .line 47
    .line 48
    iget v6, v3, Lo/g;->n:I

    .line 49
    .line 50
    invoke-static {v5, v6, v1, v2}, Lp/a;->b([JIJ)I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-ltz v5, :cond_2

    .line 55
    .line 56
    iget-object v6, v3, Lo/g;->m:[Ljava/lang/Object;

    .line 57
    .line 58
    aget-object v5, v6, v5

    .line 59
    .line 60
    sget-object v6, Lo/h;->a:Ljava/lang/Object;

    .line 61
    .line 62
    if-ne v5, v6, :cond_3

    .line 63
    .line 64
    :cond_2
    const/4 v5, 0x0

    .line 65
    :cond_3
    check-cast v5, Ljava/lang/ref/WeakReference;

    .line 66
    .line 67
    if-eqz v5, :cond_5

    .line 68
    .line 69
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    check-cast v5, Landroid/graphics/drawable/Drawable$ConstantState;

    .line 74
    .line 75
    if-eqz v5, :cond_4

    .line 76
    .line 77
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-virtual {v5, v3}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 82
    .line 83
    .line 84
    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 85
    monitor-exit p0

    .line 86
    goto :goto_0

    .line 87
    :catchall_0
    move-exception p1

    .line 88
    goto/16 :goto_5

    .line 89
    .line 90
    :cond_4
    :try_start_2
    iget-object v5, v3, Lo/g;->l:[J

    .line 91
    .line 92
    iget v6, v3, Lo/g;->n:I

    .line 93
    .line 94
    invoke-static {v5, v6, v1, v2}, Lp/a;->b([JIJ)I

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    if-ltz v5, :cond_5

    .line 99
    .line 100
    iget-object v6, v3, Lo/g;->m:[Ljava/lang/Object;

    .line 101
    .line 102
    aget-object v7, v6, v5

    .line 103
    .line 104
    sget-object v8, Lo/h;->a:Ljava/lang/Object;

    .line 105
    .line 106
    if-eq v7, v8, :cond_5

    .line 107
    .line 108
    aput-object v8, v6, v5

    .line 109
    .line 110
    const/4 v5, 0x1

    .line 111
    iput-boolean v5, v3, Lo/g;->k:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 112
    .line 113
    :cond_5
    monitor-exit p0

    .line 114
    :goto_0
    if-eqz v4, :cond_6

    .line 115
    .line 116
    return-object v4

    .line 117
    :cond_6
    iget-object v3, p0, Lk/S;->e:LM0/c;

    .line 118
    .line 119
    const/4 v4, 0x0

    .line 120
    if-nez v3, :cond_7

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_7
    const v3, 0x7f080010

    .line 124
    .line 125
    .line 126
    if-ne p2, v3, :cond_8

    .line 127
    .line 128
    new-instance v4, Landroid/graphics/drawable/LayerDrawable;

    .line 129
    .line 130
    const p2, 0x7f08000f

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0, p1, p2}, Lk/S;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    const v3, 0x7f080011

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0, p1, v3}, Lk/S;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    filled-new-array {p2, v3}, [Landroid/graphics/drawable/Drawable;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    invoke-direct {v4, p2}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 149
    .line 150
    .line 151
    :cond_8
    :goto_1
    if-eqz v4, :cond_b

    .line 152
    .line 153
    iget p2, v0, Landroid/util/TypedValue;->changingConfigurations:I

    .line 154
    .line 155
    invoke-virtual {v4, p2}, Landroid/graphics/drawable/Drawable;->setChangingConfigurations(I)V

    .line 156
    .line 157
    .line 158
    monitor-enter p0

    .line 159
    :try_start_3
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    if-eqz p2, :cond_a

    .line 164
    .line 165
    iget-object v0, p0, Lk/S;->b:Ljava/util/WeakHashMap;

    .line 166
    .line 167
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    check-cast v0, Lo/g;

    .line 172
    .line 173
    if-nez v0, :cond_9

    .line 174
    .line 175
    new-instance v0, Lo/g;

    .line 176
    .line 177
    invoke-direct {v0}, Lo/g;-><init>()V

    .line 178
    .line 179
    .line 180
    iget-object v3, p0, Lk/S;->b:Ljava/util/WeakHashMap;

    .line 181
    .line 182
    invoke-virtual {v3, p1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    goto :goto_2

    .line 186
    :catchall_1
    move-exception p1

    .line 187
    goto :goto_4

    .line 188
    :cond_9
    :goto_2
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 189
    .line 190
    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0, v1, v2, p1}, Lo/g;->a(JLjava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 194
    .line 195
    .line 196
    monitor-exit p0

    .line 197
    goto :goto_3

    .line 198
    :cond_a
    monitor-exit p0

    .line 199
    :goto_3
    return-object v4

    .line 200
    :goto_4
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 201
    throw p1

    .line 202
    :cond_b
    return-object v4

    .line 203
    :goto_5
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 204
    throw p1
.end method

.method public final declared-synchronized c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lk/S;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 3
    .line 4
    .line 5
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    monitor-exit p0

    .line 7
    return-object p1

    .line 8
    :catchall_0
    move-exception p1

    .line 9
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 10
    throw p1
.end method

.method public final declared-synchronized d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lk/S;->d:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lk/S;->d:Z

    .line 9
    .line 10
    const v0, 0x7f080055

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1, v0}, Lk/S;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_5

    .line 18
    .line 19
    instance-of v1, v0, Lp0/a;

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    const-string v1, "android.graphics.drawable.VectorDrawable"

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_5

    .line 38
    .line 39
    :cond_1
    :goto_0
    invoke-virtual {p0, p1, p2}, Lk/S;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-nez v0, :cond_2

    .line 44
    .line 45
    invoke-virtual {p1, p2}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    goto :goto_1

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    goto :goto_2

    .line 52
    :cond_2
    :goto_1
    if-eqz v0, :cond_3

    .line 53
    .line 54
    invoke-virtual {p0, p1, p2, v0}, Lk/S;->g(Landroid/content/Context;ILandroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    :cond_3
    if-eqz v0, :cond_4

    .line 59
    .line 60
    sget-object p1, Lk/B;->a:Landroid/graphics/Rect;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    .line 62
    :cond_4
    monitor-exit p0

    .line 63
    return-object v0

    .line 64
    :cond_5
    const/4 p1, 0x0

    .line 65
    :try_start_1
    iput-boolean p1, p0, Lk/S;->d:Z

    .line 66
    .line 67
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 68
    .line 69
    const-string p2, "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."

    .line 70
    .line 71
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p1

    .line 75
    :goto_2
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    throw p1
.end method

.method public final declared-synchronized f(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lk/S;->a:Ljava/util/WeakHashMap;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lo/k;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, p2}, Lo/k;->b(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Landroid/content/res/ColorStateList;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v0, v1

    .line 23
    :goto_0
    if-nez v0, :cond_5

    .line 24
    .line 25
    iget-object v0, p0, Lk/S;->e:LM0/c;

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-virtual {v0, p1, p2}, LM0/c;->c(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    :goto_1
    if-eqz v1, :cond_4

    .line 35
    .line 36
    iget-object v0, p0, Lk/S;->a:Ljava/util/WeakHashMap;

    .line 37
    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    new-instance v0, Ljava/util/WeakHashMap;

    .line 41
    .line 42
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, Lk/S;->a:Ljava/util/WeakHashMap;

    .line 46
    .line 47
    :cond_2
    iget-object v0, p0, Lk/S;->a:Ljava/util/WeakHashMap;

    .line 48
    .line 49
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Lo/k;

    .line 54
    .line 55
    if-nez v0, :cond_3

    .line 56
    .line 57
    new-instance v0, Lo/k;

    .line 58
    .line 59
    invoke-direct {v0}, Lo/k;-><init>()V

    .line 60
    .line 61
    .line 62
    iget-object v2, p0, Lk/S;->a:Ljava/util/WeakHashMap;

    .line 63
    .line 64
    invoke-virtual {v2, p1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    :cond_3
    invoke-virtual {v0, p2, v1}, Lo/k;->a(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    .line 69
    .line 70
    :cond_4
    move-object v0, v1

    .line 71
    goto :goto_2

    .line 72
    :catchall_0
    move-exception p1

    .line 73
    goto :goto_3

    .line 74
    :cond_5
    :goto_2
    monitor-exit p0

    .line 75
    return-object v0

    .line 76
    :goto_3
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    throw p1
.end method

.method public final g(Landroid/content/Context;ILandroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 8

    .line 1
    invoke-virtual {p0, p1, p2}, Lk/S;->f(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    invoke-static {p3}, Lk/B;->a(Landroid/graphics/drawable/Drawable;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p3}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    :cond_0
    invoke-virtual {p3, v0}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lk/S;->e:LM0/c;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const p1, 0x7f080045

    .line 27
    .line 28
    .line 29
    if-ne p2, p1, :cond_2

    .line 30
    .line 31
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    .line 32
    .line 33
    :cond_2
    :goto_0
    if-eqz v0, :cond_3

    .line 34
    .line 35
    invoke-virtual {p3, v0}, Landroid/graphics/drawable/Drawable;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 36
    .line 37
    .line 38
    :cond_3
    return-object p3

    .line 39
    :cond_4
    iget-object v0, p0, Lk/S;->e:LM0/c;

    .line 40
    .line 41
    if-eqz v0, :cond_7

    .line 42
    .line 43
    const v0, 0x7f080042

    .line 44
    .line 45
    .line 46
    const v1, 0x102000d

    .line 47
    .line 48
    .line 49
    const v2, 0x102000f

    .line 50
    .line 51
    .line 52
    const/high16 v3, 0x1020000

    .line 53
    .line 54
    const v4, 0x7f04005b

    .line 55
    .line 56
    .line 57
    const v5, 0x7f04005d

    .line 58
    .line 59
    .line 60
    if-ne p2, v0, :cond_5

    .line 61
    .line 62
    move-object p2, p3

    .line 63
    check-cast p2, Landroid/graphics/drawable/LayerDrawable;

    .line 64
    .line 65
    invoke-virtual {p2, v3}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-static {p1, v5}, Lk/j0;->c(Landroid/content/Context;I)I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    sget-object v6, Lk/o;->b:Landroid/graphics/PorterDuff$Mode;

    .line 74
    .line 75
    invoke-static {v0, v3, v6}, LM0/c;->d(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2, v2}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-static {p1, v5}, Lk/j0;->c(Landroid/content/Context;I)I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    invoke-static {v0, v2, v6}, LM0/c;->d(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p2, v1}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    invoke-static {p1, v4}, Lk/j0;->c(Landroid/content/Context;I)I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    invoke-static {p2, p1, v6}, LM0/c;->d(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V

    .line 98
    .line 99
    .line 100
    return-object p3

    .line 101
    :cond_5
    const v0, 0x7f080039

    .line 102
    .line 103
    .line 104
    if-eq p2, v0, :cond_6

    .line 105
    .line 106
    const v0, 0x7f080038

    .line 107
    .line 108
    .line 109
    if-eq p2, v0, :cond_6

    .line 110
    .line 111
    const v0, 0x7f08003a

    .line 112
    .line 113
    .line 114
    if-ne p2, v0, :cond_7

    .line 115
    .line 116
    :cond_6
    move-object p2, p3

    .line 117
    check-cast p2, Landroid/graphics/drawable/LayerDrawable;

    .line 118
    .line 119
    invoke-virtual {p2, v3}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-static {p1, v5}, Lk/j0;->b(Landroid/content/Context;I)I

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    sget-object v5, Lk/o;->b:Landroid/graphics/PorterDuff$Mode;

    .line 128
    .line 129
    invoke-static {v0, v3, v5}, LM0/c;->d(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p2, v2}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-static {p1, v4}, Lk/j0;->c(Landroid/content/Context;I)I

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    invoke-static {v0, v2, v5}, LM0/c;->d(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p2, v1}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    invoke-static {p1, v4}, Lk/j0;->c(Landroid/content/Context;I)I

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    invoke-static {p2, p1, v5}, LM0/c;->d(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V

    .line 152
    .line 153
    .line 154
    return-object p3

    .line 155
    :cond_7
    iget-object v0, p0, Lk/S;->e:LM0/c;

    .line 156
    .line 157
    if-eqz v0, :cond_e

    .line 158
    .line 159
    sget-object v1, Lk/o;->b:Landroid/graphics/PorterDuff$Mode;

    .line 160
    .line 161
    iget-object v2, v0, LM0/c;->a:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v2, [I

    .line 164
    .line 165
    invoke-static {v2, p2}, LM0/c;->a([II)Z

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    const/4 v3, 0x1

    .line 170
    const/4 v4, -0x1

    .line 171
    if-eqz v2, :cond_8

    .line 172
    .line 173
    const p2, 0x7f04005d

    .line 174
    .line 175
    .line 176
    :goto_1
    move v0, v4

    .line 177
    goto :goto_3

    .line 178
    :cond_8
    iget-object v2, v0, LM0/c;->c:Ljava/io/Serializable;

    .line 179
    .line 180
    check-cast v2, [I

    .line 181
    .line 182
    invoke-static {v2, p2}, LM0/c;->a([II)Z

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    if-eqz v2, :cond_9

    .line 187
    .line 188
    const p2, 0x7f04005b

    .line 189
    .line 190
    .line 191
    goto :goto_1

    .line 192
    :cond_9
    iget-object v0, v0, LM0/c;->d:Ljava/io/Serializable;

    .line 193
    .line 194
    check-cast v0, [I

    .line 195
    .line 196
    invoke-static {v0, p2}, LM0/c;->a([II)Z

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    const v2, 0x1010031

    .line 201
    .line 202
    .line 203
    if-eqz v0, :cond_a

    .line 204
    .line 205
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    .line 206
    .line 207
    :goto_2
    move p2, v2

    .line 208
    goto :goto_1

    .line 209
    :cond_a
    const v0, 0x7f08002b

    .line 210
    .line 211
    .line 212
    if-ne p2, v0, :cond_b

    .line 213
    .line 214
    const p2, 0x42233333    # 40.8f

    .line 215
    .line 216
    .line 217
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 218
    .line 219
    .line 220
    move-result p2

    .line 221
    const v0, 0x1010030

    .line 222
    .line 223
    .line 224
    move v7, v0

    .line 225
    move v0, p2

    .line 226
    move p2, v7

    .line 227
    goto :goto_3

    .line 228
    :cond_b
    const v0, 0x7f080013

    .line 229
    .line 230
    .line 231
    if-ne p2, v0, :cond_c

    .line 232
    .line 233
    goto :goto_2

    .line 234
    :cond_c
    const/4 v3, 0x0

    .line 235
    move p2, v3

    .line 236
    goto :goto_1

    .line 237
    :goto_3
    if-eqz v3, :cond_e

    .line 238
    .line 239
    invoke-static {p3}, Lk/B;->a(Landroid/graphics/drawable/Drawable;)Z

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    if-eqz v2, :cond_d

    .line 244
    .line 245
    invoke-virtual {p3}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    goto :goto_4

    .line 250
    :cond_d
    move-object v2, p3

    .line 251
    :goto_4
    invoke-static {p1, p2}, Lk/j0;->c(Landroid/content/Context;I)I

    .line 252
    .line 253
    .line 254
    move-result p1

    .line 255
    const-class p2, Lk/o;

    .line 256
    .line 257
    monitor-enter p2

    .line 258
    :try_start_0
    invoke-static {p1, v1}, Lk/S;->e(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    .line 259
    .line 260
    .line 261
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 262
    monitor-exit p2

    .line 263
    invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 264
    .line 265
    .line 266
    if-eq v0, v4, :cond_e

    .line 267
    .line 268
    invoke-virtual {v2, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 269
    .line 270
    .line 271
    goto :goto_5

    .line 272
    :catchall_0
    move-exception p1

    .line 273
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 274
    throw p1

    .line 275
    :cond_e
    :goto_5
    return-object p3
.end method

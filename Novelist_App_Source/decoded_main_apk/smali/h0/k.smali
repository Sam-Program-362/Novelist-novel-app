.class public final Lh0/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/window/OnBackAnimationCallback;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lh0/k;->a:I

    iput-object p1, p0, Lh0/k;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onBackCancelled()V
    .locals 6

    .line 1
    iget v0, p0, Lh0/k;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lh0/k;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lr1/b;

    .line 9
    .line 10
    const-string v1, "cancelBackGesture"

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lr1/b;->m(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    iget-object v0, v0, Lr1/b;->l:Lr1/e;

    .line 19
    .line 20
    invoke-virtual {v0}, Lr1/e;->c()V

    .line 21
    .line 22
    .line 23
    iget-object v0, v0, Lr1/e;->b:Ls1/c;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-object v0, v0, Ls1/c;->j:LB1/c;

    .line 28
    .line 29
    iget-object v0, v0, LB1/c;->a:LB1/s;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    invoke-virtual {v0, v1, v2, v2}, LB1/s;->s(Ljava/lang/String;Ljava/lang/Object;LB1/o;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const-string v0, "FlutterActivityAndFragmentDelegate"

    .line 37
    .line 38
    const-string v1, "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity."

    .line 39
    .line 40
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    :cond_1
    :goto_0
    return-void

    .line 44
    :pswitch_0
    iget-object v0, p0, Lh0/k;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Lh0/i;

    .line 47
    .line 48
    iget-object v1, v0, Lh0/d;->a:LB1/s;

    .line 49
    .line 50
    if-eqz v1, :cond_7

    .line 51
    .line 52
    iget-boolean v2, v0, Lh0/d;->b:Z

    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    if-nez v2, :cond_2

    .line 56
    .line 57
    invoke-virtual {v1, v0, v3}, LB1/s;->f(Lh0/d;Lh0/b;)V

    .line 58
    .line 59
    .line 60
    :cond_2
    iget-object v1, v1, LB1/s;->l:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v1, Lh0/e;

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iget-object v2, v1, Lh0/e;->h:Lh0/d;

    .line 68
    .line 69
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    const/4 v4, 0x0

    .line 74
    if-eqz v2, :cond_6

    .line 75
    .line 76
    iget v2, v1, Lh0/e;->g:I

    .line 77
    .line 78
    const/4 v5, -0x1

    .line 79
    if-eq v5, v2, :cond_3

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    iget-object v2, v1, Lh0/e;->f:Lb/o;

    .line 83
    .line 84
    if-nez v2, :cond_4

    .line 85
    .line 86
    invoke-virtual {v1, v5}, Lh0/e;->c(I)Lb/o;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    :cond_4
    iput-object v3, v1, Lh0/e;->f:Lb/o;

    .line 91
    .line 92
    iput v4, v1, Lh0/e;->g:I

    .line 93
    .line 94
    iput-object v3, v1, Lh0/e;->h:Lh0/d;

    .line 95
    .line 96
    if-eqz v2, :cond_5

    .line 97
    .line 98
    invoke-virtual {v2}, Lb/o;->a()V

    .line 99
    .line 100
    .line 101
    :cond_5
    iget-object v1, v1, Lh0/e;->a:Ll2/q;

    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    sget-object v2, Lh0/f;->m:Lh0/f;

    .line 107
    .line 108
    invoke-virtual {v1, v3, v2}, Ll2/q;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    :cond_6
    :goto_1
    iput-boolean v4, v0, Lh0/d;->b:Z

    .line 112
    .line 113
    return-void

    .line 114
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 115
    .line 116
    const-string v1, "This input is not added to any dispatcher."

    .line 117
    .line 118
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw v0

    .line 122
    nop

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onBackInvoked()V
    .locals 3

    .line 1
    iget v0, p0, Lh0/k;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lh0/k;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lr1/b;

    .line 9
    .line 10
    const-string v1, "commitBackGesture"

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lr1/b;->m(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    iget-object v0, v0, Lr1/b;->l:Lr1/e;

    .line 19
    .line 20
    invoke-virtual {v0}, Lr1/e;->c()V

    .line 21
    .line 22
    .line 23
    iget-object v0, v0, Lr1/e;->b:Ls1/c;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-object v0, v0, Ls1/c;->j:LB1/c;

    .line 28
    .line 29
    iget-object v0, v0, LB1/c;->a:LB1/s;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    invoke-virtual {v0, v1, v2, v2}, LB1/s;->s(Ljava/lang/String;Ljava/lang/Object;LB1/o;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const-string v0, "FlutterActivityAndFragmentDelegate"

    .line 37
    .line 38
    const-string v1, "Invoked commitBackGesture() before FlutterFragment was attached to an Activity."

    .line 39
    .line 40
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    :cond_1
    :goto_0
    return-void

    .line 44
    :pswitch_0
    iget-object v0, p0, Lh0/k;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Lh0/i;

    .line 47
    .line 48
    invoke-virtual {v0}, Lh0/d;->a()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onBackProgressed(Landroid/window/BackEvent;)V
    .locals 13

    .line 1
    iget v0, p0, Lh0/k;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lh0/k;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lr1/b;

    .line 9
    .line 10
    const-string v1, "updateBackGestureProgress"

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lr1/b;->m(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    iget-object v0, v0, Lr1/b;->l:Lr1/e;

    .line 19
    .line 20
    invoke-virtual {v0}, Lr1/e;->c()V

    .line 21
    .line 22
    .line 23
    iget-object v0, v0, Lr1/e;->b:Ls1/c;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-object v0, v0, Ls1/c;->j:LB1/c;

    .line 28
    .line 29
    iget-object v0, v0, LB1/c;->a:LB1/s;

    .line 30
    .line 31
    invoke-static {p1}, LB1/c;->a(Landroid/window/BackEvent;)Ljava/util/HashMap;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-virtual {v0, v1, p1, v2}, LB1/s;->s(Ljava/lang/String;Ljava/lang/Object;LB1/o;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const-string p1, "FlutterActivityAndFragmentDelegate"

    .line 41
    .line 42
    const-string v0, "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity."

    .line 43
    .line 44
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    :cond_1
    :goto_0
    return-void

    .line 48
    :pswitch_0
    const-string v0, "backEvent"

    .line 49
    .line 50
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lh0/k;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Lh0/i;

    .line 56
    .line 57
    invoke-static {p1}, LE2/a;->a(Landroid/window/BackEvent;)Lh0/b;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iget-object v1, v0, Lh0/d;->a:LB1/s;

    .line 62
    .line 63
    if-eqz v1, :cond_c

    .line 64
    .line 65
    iget-boolean v2, v0, Lh0/d;->b:Z

    .line 66
    .line 67
    if-eqz v2, :cond_b

    .line 68
    .line 69
    iget-object v1, v1, LB1/s;->l:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, Lh0/e;

    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    iget-object v2, v1, Lh0/e;->h:Lh0/d;

    .line 77
    .line 78
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_b

    .line 83
    .line 84
    iget v0, v1, Lh0/e;->g:I

    .line 85
    .line 86
    const/4 v2, -0x1

    .line 87
    if-eq v2, v0, :cond_2

    .line 88
    .line 89
    goto/16 :goto_4

    .line 90
    .line 91
    :cond_2
    iget-object v0, v1, Lh0/e;->f:Lb/o;

    .line 92
    .line 93
    if-nez v0, :cond_3

    .line 94
    .line 95
    invoke-virtual {v1, v2}, Lh0/e;->c(I)Lb/o;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    :cond_3
    if-eqz v0, :cond_a

    .line 100
    .line 101
    iget-object v0, v0, Lb/o;->d:Lb0/z;

    .line 102
    .line 103
    new-instance v2, Lb/a;

    .line 104
    .line 105
    invoke-direct {v2, p1}, Lb/a;-><init>(Lh0/b;)V

    .line 106
    .line 107
    .line 108
    iget-object v0, v0, Lb0/z;->d:Lb0/I;

    .line 109
    .line 110
    const/4 v3, 0x2

    .line 111
    invoke-static {v3}, Lb0/I;->J(I)Z

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    const-string v5, "FragmentManager"

    .line 116
    .line 117
    if-eqz v4, :cond_4

    .line 118
    .line 119
    new-instance v4, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    const-string v6, "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager "

    .line 122
    .line 123
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    invoke-static {v5, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 134
    .line 135
    .line 136
    :cond_4
    iget-object v4, v0, Lb0/I;->h:Lb0/a;

    .line 137
    .line 138
    if-eqz v4, :cond_a

    .line 139
    .line 140
    new-instance v4, Ljava/util/ArrayList;

    .line 141
    .line 142
    iget-object v6, v0, Lb0/I;->h:Lb0/a;

    .line 143
    .line 144
    invoke-static {v6}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 149
    .line 150
    .line 151
    const/4 v6, 0x0

    .line 152
    const/4 v7, 0x1

    .line 153
    invoke-virtual {v0, v4, v6, v7}, Lb0/I;->f(Ljava/util/ArrayList;II)Ljava/util/HashSet;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    :cond_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result v7

    .line 165
    if-eqz v7, :cond_8

    .line 166
    .line 167
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v7

    .line 171
    check-cast v7, Lb0/l;

    .line 172
    .line 173
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-static {v3}, Lb0/I;->J(I)Z

    .line 177
    .line 178
    .line 179
    move-result v8

    .line 180
    if-eqz v8, :cond_6

    .line 181
    .line 182
    new-instance v8, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    const-string v9, "SpecialEffectsController: Processing Progress "

    .line 185
    .line 186
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    iget v9, v2, Lb/a;->c:F

    .line 190
    .line 191
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v8

    .line 198
    invoke-static {v5, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 199
    .line 200
    .line 201
    :cond_6
    iget-object v8, v7, Lb0/l;->c:Ljava/util/ArrayList;

    .line 202
    .line 203
    new-instance v9, Ljava/util/ArrayList;

    .line 204
    .line 205
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 209
    .line 210
    .line 211
    move-result v10

    .line 212
    move v11, v6

    .line 213
    :goto_1
    if-ge v11, v10, :cond_7

    .line 214
    .line 215
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v12

    .line 219
    add-int/lit8 v11, v11, 0x1

    .line 220
    .line 221
    check-cast v12, Lb0/U;

    .line 222
    .line 223
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    const/4 v12, 0x0

    .line 227
    invoke-static {v9, v12}, LP1/k;->f0(Ljava/util/AbstractList;Ljava/util/List;)V

    .line 228
    .line 229
    .line 230
    goto :goto_1

    .line 231
    :cond_7
    invoke-static {v9}, LP1/e;->n0(Ljava/util/Collection;)Ljava/util/Set;

    .line 232
    .line 233
    .line 234
    move-result-object v8

    .line 235
    invoke-static {v8}, LP1/e;->l0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 236
    .line 237
    .line 238
    move-result-object v8

    .line 239
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 240
    .line 241
    .line 242
    move-result v9

    .line 243
    move v10, v6

    .line 244
    :goto_2
    if-ge v10, v9, :cond_5

    .line 245
    .line 246
    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v11

    .line 250
    check-cast v11, Lb0/T;

    .line 251
    .line 252
    iget-object v12, v7, Lb0/l;->a:Landroid/view/ViewGroup;

    .line 253
    .line 254
    invoke-virtual {v11, v2, v12}, Lb0/T;->b(Lb/a;Landroid/view/ViewGroup;)V

    .line 255
    .line 256
    .line 257
    add-int/lit8 v10, v10, 0x1

    .line 258
    .line 259
    goto :goto_2

    .line 260
    :cond_8
    iget-object v0, v0, Lb0/I;->m:Ljava/util/ArrayList;

    .line 261
    .line 262
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 267
    .line 268
    .line 269
    move-result v2

    .line 270
    if-nez v2, :cond_9

    .line 271
    .line 272
    goto :goto_3

    .line 273
    :cond_9
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    new-instance p1, Ljava/lang/ClassCastException;

    .line 281
    .line 282
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 283
    .line 284
    .line 285
    throw p1

    .line 286
    :cond_a
    :goto_3
    iget-object v0, v1, Lh0/e;->a:Ll2/q;

    .line 287
    .line 288
    new-instance v1, Lh0/g;

    .line 289
    .line 290
    invoke-direct {v1, p1}, Lh0/g;-><init>(Lh0/b;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    const/4 p1, 0x0

    .line 297
    invoke-virtual {v0, p1, v1}, Ll2/q;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    :cond_b
    :goto_4
    return-void

    .line 301
    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 302
    .line 303
    const-string v0, "This input is not added to any dispatcher."

    .line 304
    .line 305
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    throw p1

    .line 309
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onBackStarted(Landroid/window/BackEvent;)V
    .locals 3

    .line 1
    iget v0, p0, Lh0/k;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lh0/k;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lr1/b;

    .line 9
    .line 10
    const-string v1, "startBackGesture"

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lr1/b;->m(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    iget-object v0, v0, Lr1/b;->l:Lr1/e;

    .line 19
    .line 20
    invoke-virtual {v0}, Lr1/e;->c()V

    .line 21
    .line 22
    .line 23
    iget-object v0, v0, Lr1/e;->b:Ls1/c;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-object v0, v0, Ls1/c;->j:LB1/c;

    .line 28
    .line 29
    iget-object v0, v0, LB1/c;->a:LB1/s;

    .line 30
    .line 31
    invoke-static {p1}, LB1/c;->a(Landroid/window/BackEvent;)Ljava/util/HashMap;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-virtual {v0, v1, p1, v2}, LB1/s;->s(Ljava/lang/String;Ljava/lang/Object;LB1/o;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const-string p1, "FlutterActivityAndFragmentDelegate"

    .line 41
    .line 42
    const-string v0, "Invoked startBackGesture() before FlutterFragment was attached to an Activity."

    .line 43
    .line 44
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    :cond_1
    :goto_0
    return-void

    .line 48
    :pswitch_0
    const-string v0, "backEvent"

    .line 49
    .line 50
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lh0/k;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Lh0/i;

    .line 56
    .line 57
    invoke-static {p1}, LE2/a;->a(Landroid/window/BackEvent;)Lh0/b;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iget-object v1, v0, Lh0/d;->a:LB1/s;

    .line 62
    .line 63
    if-eqz v1, :cond_3

    .line 64
    .line 65
    iget-boolean v2, v0, Lh0/d;->b:Z

    .line 66
    .line 67
    if-nez v2, :cond_2

    .line 68
    .line 69
    invoke-virtual {v1, v0, p1}, LB1/s;->f(Lh0/d;Lh0/b;)V

    .line 70
    .line 71
    .line 72
    const/4 p1, 0x1

    .line 73
    iput-boolean p1, v0, Lh0/d;->b:Z

    .line 74
    .line 75
    :cond_2
    return-void

    .line 76
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 77
    .line 78
    const-string v0, "This input is not added to any dispatcher."

    .line 79
    .line 80
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p1

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

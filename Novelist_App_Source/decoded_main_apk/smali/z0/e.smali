.class public abstract Lz0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lx0/k;Landroidx/window/extensions/layout/FoldingFeature;)Lx0/c;
    .locals 7

    .line 1
    invoke-virtual {p1}, Landroidx/window/extensions/layout/FoldingFeature;->getType()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eq v0, v2, :cond_1

    .line 8
    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    sget-object v0, Lx0/b;->r:Lx0/b;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    sget-object v0, Lx0/b;->q:Lx0/b;

    .line 16
    .line 17
    :goto_0
    invoke-virtual {p1}, Landroidx/window/extensions/layout/FoldingFeature;->getState()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eq v3, v2, :cond_3

    .line 22
    .line 23
    if-eq v3, v1, :cond_2

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_2
    sget-object v1, Lx0/b;->p:Lx0/b;

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_3
    sget-object v1, Lx0/b;->o:Lx0/b;

    .line 30
    .line 31
    :goto_1
    invoke-virtual {p1}, Landroidx/window/extensions/layout/FoldingFeature;->getBounds()Landroid/graphics/Rect;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    const-string v3, "oemFeature.bounds"

    .line 36
    .line 37
    invoke-static {v2, v3}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget v4, v2, Landroid/graphics/Rect;->left:I

    .line 41
    .line 42
    iget v5, v2, Landroid/graphics/Rect;->top:I

    .line 43
    .line 44
    iget v6, v2, Landroid/graphics/Rect;->right:I

    .line 45
    .line 46
    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    .line 47
    .line 48
    if-gt v4, v6, :cond_9

    .line 49
    .line 50
    if-gt v5, v2, :cond_8

    .line 51
    .line 52
    iget-object p0, p0, Lx0/k;->a:Lu0/b;

    .line 53
    .line 54
    invoke-virtual {p0}, Lu0/b;->a()Landroid/graphics/Rect;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    sub-int/2addr v2, v5

    .line 59
    if-nez v2, :cond_4

    .line 60
    .line 61
    sub-int v5, v6, v4

    .line 62
    .line 63
    if-nez v5, :cond_4

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_4
    sub-int/2addr v6, v4

    .line 67
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-eq v6, v4, :cond_5

    .line 72
    .line 73
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-eq v2, v4, :cond_5

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_5
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-ge v6, v4, :cond_6

    .line 85
    .line 86
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-ge v2, v4, :cond_6

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_6
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    if-ne v6, v4, :cond_7

    .line 98
    .line 99
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    if-ne v2, p0, :cond_7

    .line 104
    .line 105
    :goto_2
    const/4 p0, 0x0

    .line 106
    return-object p0

    .line 107
    :cond_7
    new-instance p0, Lx0/c;

    .line 108
    .line 109
    new-instance v2, Lu0/b;

    .line 110
    .line 111
    invoke-virtual {p1}, Landroidx/window/extensions/layout/FoldingFeature;->getBounds()Landroid/graphics/Rect;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-static {p1, v3}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-direct {v2, p1}, Lu0/b;-><init>(Landroid/graphics/Rect;)V

    .line 119
    .line 120
    .line 121
    invoke-direct {p0, v2, v0, v1}, Lx0/c;-><init>(Lu0/b;Lx0/b;Lx0/b;)V

    .line 122
    .line 123
    .line 124
    return-object p0

    .line 125
    :cond_8
    const-string p0, "top must be less than or equal to bottom, top: "

    .line 126
    .line 127
    const-string p1, ", bottom: "

    .line 128
    .line 129
    invoke-static {p0, v5, p1, v2}, LB1/e;->i(Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 134
    .line 135
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    throw p1

    .line 143
    :cond_9
    const-string p0, "Left must be less than or equal to right, left: "

    .line 144
    .line 145
    const-string p1, ", right: "

    .line 146
    .line 147
    invoke-static {p0, v4, p1, v6}, LB1/e;->i(Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 152
    .line 153
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    throw p1
.end method

.method public static b(Landroid/content/Context;Landroidx/window/extensions/layout/WindowLayoutInfo;)Lx0/j;
    .locals 7

    .line 1
    const-string v0, "info"

    .line 2
    .line 3
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v1, 0x1d

    .line 9
    .line 10
    const/16 v2, 0x1e

    .line 11
    .line 12
    if-lt v0, v2, :cond_d

    .line 13
    .line 14
    sget v3, Lx0/m;->b:I

    .line 15
    .line 16
    if-lt v0, v2, :cond_0

    .line 17
    .line 18
    const-class v0, Landroid/view/WindowManager;

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Landroid/view/WindowManager;

    .line 25
    .line 26
    invoke-static {p0}, LB0/a;->t(Landroid/view/WindowManager;)Landroid/view/WindowMetrics;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0}, LB0/a;->f(Landroid/view/WindowMetrics;)Landroid/view/WindowInsets;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-static {v0, v1}, LD/h0;->c(Landroid/view/WindowInsets;Landroid/view/View;)LD/h0;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    new-instance v1, Lx0/k;

    .line 40
    .line 41
    invoke-static {p0}, LB0/a;->t(Landroid/view/WindowManager;)Landroid/view/WindowMetrics;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {p0}, LB0/a;->d(Landroid/view/WindowMetrics;)Landroid/graphics/Rect;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const-string v2, "wm.currentWindowMetrics.bounds"

    .line 50
    .line 51
    invoke-static {p0, v2}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    new-instance v2, Lu0/b;

    .line 55
    .line 56
    invoke-direct {v2, p0}, Lu0/b;-><init>(Landroid/graphics/Rect;)V

    .line 57
    .line 58
    .line 59
    invoke-direct {v1, v2, v0}, Lx0/k;-><init>(Lu0/b;LD/h0;)V

    .line 60
    .line 61
    .line 62
    goto/16 :goto_3

    .line 63
    .line 64
    :cond_0
    move-object v0, p0

    .line 65
    :goto_0
    instance-of v3, v0, Landroid/content/ContextWrapper;

    .line 66
    .line 67
    const-string v4, " is not a UiContext"

    .line 68
    .line 69
    if-eqz v3, :cond_c

    .line 70
    .line 71
    instance-of v3, v0, Landroid/app/Activity;

    .line 72
    .line 73
    if-eqz v3, :cond_1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    instance-of v5, v0, Landroid/inputmethodservice/InputMethodService;

    .line 77
    .line 78
    if-eqz v5, :cond_2

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    move-object v5, v0

    .line 82
    check-cast v5, Landroid/content/ContextWrapper;

    .line 83
    .line 84
    invoke-virtual {v5}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    if-nez v6, :cond_b

    .line 89
    .line 90
    :goto_1
    if-eqz v3, :cond_3

    .line 91
    .line 92
    check-cast p0, Landroid/app/Activity;

    .line 93
    .line 94
    invoke-static {p0}, Lx0/m;->a(Landroid/app/Activity;)Lx0/k;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    goto/16 :goto_3

    .line 99
    .line 100
    :cond_3
    instance-of v0, v0, Landroid/inputmethodservice/InputMethodService;

    .line 101
    .line 102
    if-eqz v0, :cond_a

    .line 103
    .line 104
    const-string v0, "window"

    .line 105
    .line 106
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    const-string v0, "null cannot be cast to non-null type android.view.WindowManager"

    .line 111
    .line 112
    invoke-static {p0, v0}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    check-cast p0, Landroid/view/WindowManager;

    .line 116
    .line 117
    invoke-interface {p0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    const-string v0, "wm.defaultDisplay"

    .line 122
    .line 123
    invoke-static {p0, v0}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    new-instance v0, Landroid/graphics/Point;

    .line 127
    .line 128
    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, v0}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    .line 132
    .line 133
    .line 134
    new-instance p0, Landroid/graphics/Rect;

    .line 135
    .line 136
    iget v3, v0, Landroid/graphics/Point;->x:I

    .line 137
    .line 138
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 139
    .line 140
    const/4 v4, 0x0

    .line 141
    invoke-direct {p0, v4, v4, v3, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 142
    .line 143
    .line 144
    new-instance v0, Lx0/k;

    .line 145
    .line 146
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 147
    .line 148
    const/16 v4, 0x24

    .line 149
    .line 150
    if-lt v3, v4, :cond_4

    .line 151
    .line 152
    new-instance v1, LD/S;

    .line 153
    .line 154
    invoke-direct {v1}, LD/S;-><init>()V

    .line 155
    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_4
    const/16 v4, 0x23

    .line 159
    .line 160
    if-lt v3, v4, :cond_5

    .line 161
    .line 162
    new-instance v1, LD/Q;

    .line 163
    .line 164
    invoke-direct {v1}, LD/Q;-><init>()V

    .line 165
    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_5
    const/16 v4, 0x22

    .line 169
    .line 170
    if-lt v3, v4, :cond_6

    .line 171
    .line 172
    new-instance v1, LD/P;

    .line 173
    .line 174
    invoke-direct {v1}, LD/P;-><init>()V

    .line 175
    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_6
    const/16 v4, 0x1f

    .line 179
    .line 180
    if-lt v3, v4, :cond_7

    .line 181
    .line 182
    new-instance v1, LD/O;

    .line 183
    .line 184
    invoke-direct {v1}, LD/O;-><init>()V

    .line 185
    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_7
    if-lt v3, v2, :cond_8

    .line 189
    .line 190
    new-instance v1, LD/N;

    .line 191
    .line 192
    invoke-direct {v1}, LD/N;-><init>()V

    .line 193
    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_8
    if-lt v3, v1, :cond_9

    .line 197
    .line 198
    new-instance v1, LD/M;

    .line 199
    .line 200
    invoke-direct {v1}, LD/M;-><init>()V

    .line 201
    .line 202
    .line 203
    goto :goto_2

    .line 204
    :cond_9
    new-instance v1, LD/K;

    .line 205
    .line 206
    invoke-direct {v1}, LD/K;-><init>()V

    .line 207
    .line 208
    .line 209
    :goto_2
    invoke-virtual {v1}, LD/T;->b()LD/h0;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    const-string v2, "Builder().build()"

    .line 214
    .line 215
    invoke-static {v1, v2}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    new-instance v2, Lu0/b;

    .line 219
    .line 220
    invoke-direct {v2, p0}, Lu0/b;-><init>(Landroid/graphics/Rect;)V

    .line 221
    .line 222
    .line 223
    invoke-direct {v0, v2, v1}, Lx0/k;-><init>(Lu0/b;LD/h0;)V

    .line 224
    .line 225
    .line 226
    move-object v1, v0

    .line 227
    :goto_3
    invoke-static {v1, p1}, Lz0/e;->c(Lx0/k;Landroidx/window/extensions/layout/WindowLayoutInfo;)Lx0/j;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    return-object p0

    .line 232
    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 233
    .line 234
    new-instance v0, Ljava/lang/StringBuilder;

    .line 235
    .line 236
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object p0

    .line 249
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    throw p1

    .line 253
    :cond_b
    invoke-virtual {v5}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    const-string v3, "iterator.baseContext"

    .line 258
    .line 259
    invoke-static {v0, v3}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    goto/16 :goto_0

    .line 263
    .line 264
    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 265
    .line 266
    new-instance v0, Ljava/lang/StringBuilder;

    .line 267
    .line 268
    const-string v1, "Context "

    .line 269
    .line 270
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object p0

    .line 283
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    throw p1

    .line 287
    :cond_d
    if-lt v0, v1, :cond_e

    .line 288
    .line 289
    instance-of v0, p0, Landroid/app/Activity;

    .line 290
    .line 291
    if-eqz v0, :cond_e

    .line 292
    .line 293
    sget v0, Lx0/m;->b:I

    .line 294
    .line 295
    check-cast p0, Landroid/app/Activity;

    .line 296
    .line 297
    invoke-static {p0}, Lx0/m;->a(Landroid/app/Activity;)Lx0/k;

    .line 298
    .line 299
    .line 300
    move-result-object p0

    .line 301
    invoke-static {p0, p1}, Lz0/e;->c(Lx0/k;Landroidx/window/extensions/layout/WindowLayoutInfo;)Lx0/j;

    .line 302
    .line 303
    .line 304
    move-result-object p0

    .line 305
    return-object p0

    .line 306
    :cond_e
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 307
    .line 308
    const-string p1, "Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q."

    .line 309
    .line 310
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    throw p0
.end method

.method public static c(Lx0/k;Landroidx/window/extensions/layout/WindowLayoutInfo;)Lx0/j;
    .locals 3

    .line 1
    const-string v0, "info"

    .line 2
    .line 3
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/window/extensions/layout/WindowLayoutInfo;->getDisplayFeatures()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string v0, "info.displayFeatures"

    .line 11
    .line 12
    invoke-static {p1, v0}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Landroidx/window/extensions/layout/DisplayFeature;

    .line 35
    .line 36
    instance-of v2, v1, Landroidx/window/extensions/layout/FoldingFeature;

    .line 37
    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    const-string v2, "feature"

    .line 41
    .line 42
    invoke-static {v1, v2}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    check-cast v1, Landroidx/window/extensions/layout/FoldingFeature;

    .line 46
    .line 47
    invoke-static {p0, v1}, Lz0/e;->a(Lx0/k;Landroidx/window/extensions/layout/FoldingFeature;)Lx0/c;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    const/4 v1, 0x0

    .line 53
    :goto_1
    if-eqz v1, :cond_0

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    new-instance p0, Lx0/j;

    .line 60
    .line 61
    invoke-direct {p0, v0}, Lx0/j;-><init>(Ljava/util/List;)V

    .line 62
    .line 63
    .line 64
    return-object p0
.end method

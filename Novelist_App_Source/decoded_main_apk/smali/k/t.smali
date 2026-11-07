.class public final Lk/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/widget/TextView;

.field public b:LF0/b;

.field public c:LF0/b;

.field public d:LF0/b;

.field public e:LF0/b;

.field public f:LF0/b;

.field public g:LF0/b;

.field public h:LF0/b;

.field public final i:Lk/y;

.field public j:I

.field public k:I

.field public l:Landroid/graphics/Typeface;

.field public m:Z


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lk/t;->j:I

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iput v0, p0, Lk/t;->k:I

    .line 9
    .line 10
    iput-object p1, p0, Lk/t;->a:Landroid/widget/TextView;

    .line 11
    .line 12
    new-instance v0, Lk/y;

    .line 13
    .line 14
    invoke-direct {v0, p1}, Lk/y;-><init>(Landroid/widget/TextView;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lk/t;->i:Lk/y;

    .line 18
    .line 19
    return-void
.end method

.method public static c(Landroid/content/Context;Lk/o;I)LF0/b;
    .locals 1

    .line 1
    monitor-enter p1

    .line 2
    :try_start_0
    iget-object v0, p1, Lk/o;->a:Lk/S;

    .line 3
    .line 4
    invoke-virtual {v0, p0, p2}, Lk/S;->f(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 5
    .line 6
    .line 7
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    monitor-exit p1

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    new-instance p1, LF0/b;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 p2, 0x1

    .line 17
    iput-boolean p2, p1, LF0/b;->b:Z

    .line 18
    .line 19
    iput-object p0, p1, LF0/b;->c:Ljava/lang/Object;

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return-object p0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    throw p0
.end method


# virtual methods
.method public final a(Landroid/graphics/drawable/Drawable;LF0/b;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lk/t;->a:Landroid/widget/TextView;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {p1, p2, v0}, Lk/o;->c(Landroid/graphics/drawable/Drawable;LF0/b;[I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final b()V
    .locals 6

    .line 1
    iget-object v0, p0, Lk/t;->b:LF0/b;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, Lk/t;->a:Landroid/widget/TextView;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lk/t;->c:LF0/b;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lk/t;->d:LF0/b;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lk/t;->e:LF0/b;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    :cond_0
    invoke-virtual {v3}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    aget-object v4, v0, v2

    .line 26
    .line 27
    iget-object v5, p0, Lk/t;->b:LF0/b;

    .line 28
    .line 29
    invoke-virtual {p0, v4, v5}, Lk/t;->a(Landroid/graphics/drawable/Drawable;LF0/b;)V

    .line 30
    .line 31
    .line 32
    const/4 v4, 0x1

    .line 33
    aget-object v4, v0, v4

    .line 34
    .line 35
    iget-object v5, p0, Lk/t;->c:LF0/b;

    .line 36
    .line 37
    invoke-virtual {p0, v4, v5}, Lk/t;->a(Landroid/graphics/drawable/Drawable;LF0/b;)V

    .line 38
    .line 39
    .line 40
    aget-object v4, v0, v1

    .line 41
    .line 42
    iget-object v5, p0, Lk/t;->d:LF0/b;

    .line 43
    .line 44
    invoke-virtual {p0, v4, v5}, Lk/t;->a(Landroid/graphics/drawable/Drawable;LF0/b;)V

    .line 45
    .line 46
    .line 47
    const/4 v4, 0x3

    .line 48
    aget-object v0, v0, v4

    .line 49
    .line 50
    iget-object v4, p0, Lk/t;->e:LF0/b;

    .line 51
    .line 52
    invoke-virtual {p0, v0, v4}, Lk/t;->a(Landroid/graphics/drawable/Drawable;LF0/b;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    iget-object v0, p0, Lk/t;->f:LF0/b;

    .line 56
    .line 57
    if-nez v0, :cond_3

    .line 58
    .line 59
    iget-object v0, p0, Lk/t;->g:LF0/b;

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    return-void

    .line 65
    :cond_3
    :goto_0
    invoke-virtual {v3}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    aget-object v2, v0, v2

    .line 70
    .line 71
    iget-object v3, p0, Lk/t;->f:LF0/b;

    .line 72
    .line 73
    invoke-virtual {p0, v2, v3}, Lk/t;->a(Landroid/graphics/drawable/Drawable;LF0/b;)V

    .line 74
    .line 75
    .line 76
    aget-object v0, v0, v1

    .line 77
    .line 78
    iget-object v1, p0, Lk/t;->g:LF0/b;

    .line 79
    .line 80
    invoke-virtual {p0, v0, v1}, Lk/t;->a(Landroid/graphics/drawable/Drawable;LF0/b;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public final d(Landroid/util/AttributeSet;I)V
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v5, p1

    .line 4
    .line 5
    move/from16 v7, p2

    .line 6
    .line 7
    sget-object v0, Lf/a;->g:[I

    .line 8
    .line 9
    sget-object v8, Lf/a;->t:[I

    .line 10
    .line 11
    iget-object v9, v1, Lk/t;->i:Lk/y;

    .line 12
    .line 13
    iget-object v10, v1, Lk/t;->a:Landroid/widget/TextView;

    .line 14
    .line 15
    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v11

    .line 19
    sget-object v2, Lk/o;->b:Landroid/graphics/PorterDuff$Mode;

    .line 20
    .line 21
    const-class v2, Lk/o;

    .line 22
    .line 23
    monitor-enter v2

    .line 24
    :try_start_0
    sget-object v3, Lk/o;->c:Lk/o;

    .line 25
    .line 26
    if-nez v3, :cond_0

    .line 27
    .line 28
    invoke-static {}, Lk/o;->b()V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    goto/16 :goto_26

    .line 34
    .line 35
    :cond_0
    :goto_0
    sget-object v12, Lk/o;->c:Lk/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    monitor-exit v2

    .line 38
    sget-object v4, Lf/a;->f:[I

    .line 39
    .line 40
    invoke-static {v11, v5, v4, v7}, LA0/j;->F(Landroid/content/Context;Landroid/util/AttributeSet;[II)LA0/j;

    .line 41
    .line 42
    .line 43
    move-result-object v13

    .line 44
    iget-object v2, v1, Lk/t;->a:Landroid/widget/TextView;

    .line 45
    .line 46
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    iget-object v6, v13, LA0/j;->m:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v6, Landroid/content/res/TypedArray;

    .line 53
    .line 54
    invoke-static/range {v2 .. v7}, LD/G;->b(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    .line 55
    .line 56
    .line 57
    iget-object v2, v13, LA0/j;->m:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v2, Landroid/content/res/TypedArray;

    .line 60
    .line 61
    const/4 v14, 0x0

    .line 62
    const/4 v15, -0x1

    .line 63
    invoke-virtual {v2, v14, v15}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    const/4 v4, 0x3

    .line 68
    invoke-virtual {v2, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    if-eqz v6, :cond_1

    .line 73
    .line 74
    invoke-virtual {v2, v4, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    invoke-static {v11, v12, v6}, Lk/t;->c(Landroid/content/Context;Lk/o;I)LF0/b;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    iput-object v6, v1, Lk/t;->b:LF0/b;

    .line 83
    .line 84
    :cond_1
    const/4 v6, 0x1

    .line 85
    invoke-virtual {v2, v6}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 86
    .line 87
    .line 88
    move-result v16

    .line 89
    if-eqz v16, :cond_2

    .line 90
    .line 91
    invoke-virtual {v2, v6, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    invoke-static {v11, v12, v4}, Lk/t;->c(Landroid/content/Context;Lk/o;I)LF0/b;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    iput-object v4, v1, Lk/t;->c:LF0/b;

    .line 100
    .line 101
    :cond_2
    const/4 v4, 0x4

    .line 102
    invoke-virtual {v2, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 103
    .line 104
    .line 105
    move-result v17

    .line 106
    if-eqz v17, :cond_3

    .line 107
    .line 108
    invoke-virtual {v2, v4, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    invoke-static {v11, v12, v6}, Lk/t;->c(Landroid/content/Context;Lk/o;I)LF0/b;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    iput-object v6, v1, Lk/t;->d:LF0/b;

    .line 117
    .line 118
    :cond_3
    const/4 v6, 0x2

    .line 119
    invoke-virtual {v2, v6}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 120
    .line 121
    .line 122
    move-result v18

    .line 123
    if-eqz v18, :cond_4

    .line 124
    .line 125
    invoke-virtual {v2, v6, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    invoke-static {v11, v12, v4}, Lk/t;->c(Landroid/content/Context;Lk/o;I)LF0/b;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    iput-object v4, v1, Lk/t;->e:LF0/b;

    .line 134
    .line 135
    :cond_4
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 136
    .line 137
    const/4 v15, 0x5

    .line 138
    invoke-virtual {v2, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 139
    .line 140
    .line 141
    move-result v19

    .line 142
    if-eqz v19, :cond_5

    .line 143
    .line 144
    invoke-virtual {v2, v15, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 145
    .line 146
    .line 147
    move-result v6

    .line 148
    invoke-static {v11, v12, v6}, Lk/t;->c(Landroid/content/Context;Lk/o;I)LF0/b;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    iput-object v6, v1, Lk/t;->f:LF0/b;

    .line 153
    .line 154
    :cond_5
    const/4 v6, 0x6

    .line 155
    invoke-virtual {v2, v6}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 156
    .line 157
    .line 158
    move-result v20

    .line 159
    if-eqz v20, :cond_6

    .line 160
    .line 161
    invoke-virtual {v2, v6, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    invoke-static {v11, v12, v2}, Lk/t;->c(Landroid/content/Context;Lk/o;I)LF0/b;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    iput-object v2, v1, Lk/t;->g:LF0/b;

    .line 170
    .line 171
    :cond_6
    invoke-virtual {v13}, LA0/j;->J()V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v10}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    instance-of v2, v2, Landroid/text/method/PasswordTransformationMethod;

    .line 179
    .line 180
    const/16 v6, 0xf

    .line 181
    .line 182
    const/16 v15, 0xe

    .line 183
    .line 184
    const/4 v13, -0x1

    .line 185
    if-eq v3, v13, :cond_a

    .line 186
    .line 187
    new-instance v13, LA0/j;

    .line 188
    .line 189
    invoke-virtual {v11, v3, v8}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    invoke-direct {v13, v11, v3}, LA0/j;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 194
    .line 195
    .line 196
    if-nez v2, :cond_7

    .line 197
    .line 198
    invoke-virtual {v3, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 199
    .line 200
    .line 201
    move-result v23

    .line 202
    if-eqz v23, :cond_7

    .line 203
    .line 204
    invoke-virtual {v3, v15, v14}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 205
    .line 206
    .line 207
    move-result v23

    .line 208
    const/16 v24, 0x1

    .line 209
    .line 210
    goto :goto_1

    .line 211
    :cond_7
    move/from16 v23, v14

    .line 212
    .line 213
    move/from16 v24, v23

    .line 214
    .line 215
    :goto_1
    invoke-virtual {v1, v11, v13}, Lk/t;->f(Landroid/content/Context;LA0/j;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v3, v6}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 219
    .line 220
    .line 221
    move-result v25

    .line 222
    if-eqz v25, :cond_8

    .line 223
    .line 224
    invoke-virtual {v3, v6}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v25

    .line 228
    :goto_2
    const/16 v6, 0x1a

    .line 229
    .line 230
    goto :goto_3

    .line 231
    :cond_8
    const/16 v25, 0x0

    .line 232
    .line 233
    goto :goto_2

    .line 234
    :goto_3
    if-lt v4, v6, :cond_9

    .line 235
    .line 236
    const/16 v6, 0xd

    .line 237
    .line 238
    invoke-virtual {v3, v6}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 239
    .line 240
    .line 241
    move-result v22

    .line 242
    if-eqz v22, :cond_9

    .line 243
    .line 244
    invoke-virtual {v3, v6}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v3

    .line 248
    goto :goto_4

    .line 249
    :cond_9
    const/4 v3, 0x0

    .line 250
    :goto_4
    invoke-virtual {v13}, LA0/j;->J()V

    .line 251
    .line 252
    .line 253
    goto :goto_5

    .line 254
    :cond_a
    move/from16 v23, v14

    .line 255
    .line 256
    move/from16 v24, v23

    .line 257
    .line 258
    const/4 v3, 0x0

    .line 259
    const/16 v25, 0x0

    .line 260
    .line 261
    :goto_5
    new-instance v6, LA0/j;

    .line 262
    .line 263
    invoke-virtual {v11, v5, v8, v7, v14}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 264
    .line 265
    .line 266
    move-result-object v8

    .line 267
    invoke-direct {v6, v11, v8}, LA0/j;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 268
    .line 269
    .line 270
    if-nez v2, :cond_b

    .line 271
    .line 272
    invoke-virtual {v8, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 273
    .line 274
    .line 275
    move-result v13

    .line 276
    if-eqz v13, :cond_b

    .line 277
    .line 278
    invoke-virtual {v8, v15, v14}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 279
    .line 280
    .line 281
    move-result v23

    .line 282
    const/16 v24, 0x1

    .line 283
    .line 284
    :cond_b
    move/from16 v13, v23

    .line 285
    .line 286
    const/16 v15, 0xf

    .line 287
    .line 288
    invoke-virtual {v8, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 289
    .line 290
    .line 291
    move-result v26

    .line 292
    if-eqz v26, :cond_c

    .line 293
    .line 294
    invoke-virtual {v8, v15}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v25

    .line 298
    :cond_c
    const/16 v15, 0x1a

    .line 299
    .line 300
    if-lt v4, v15, :cond_d

    .line 301
    .line 302
    const/16 v15, 0xd

    .line 303
    .line 304
    invoke-virtual {v8, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 305
    .line 306
    .line 307
    move-result v22

    .line 308
    if-eqz v22, :cond_d

    .line 309
    .line 310
    invoke-virtual {v8, v15}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v3

    .line 314
    :cond_d
    const/16 v15, 0x1c

    .line 315
    .line 316
    if-lt v4, v15, :cond_e

    .line 317
    .line 318
    invoke-virtual {v8, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 319
    .line 320
    .line 321
    move-result v4

    .line 322
    if-eqz v4, :cond_e

    .line 323
    .line 324
    const/4 v4, -0x1

    .line 325
    invoke-virtual {v8, v14, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 326
    .line 327
    .line 328
    move-result v8

    .line 329
    if-nez v8, :cond_e

    .line 330
    .line 331
    const/4 v4, 0x0

    .line 332
    invoke-virtual {v10, v14, v4}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 333
    .line 334
    .line 335
    :cond_e
    invoke-virtual {v1, v11, v6}, Lk/t;->f(Landroid/content/Context;LA0/j;)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v6}, LA0/j;->J()V

    .line 339
    .line 340
    .line 341
    if-nez v2, :cond_f

    .line 342
    .line 343
    if-eqz v24, :cond_f

    .line 344
    .line 345
    iget-object v2, v1, Lk/t;->a:Landroid/widget/TextView;

    .line 346
    .line 347
    invoke-virtual {v2, v13}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 348
    .line 349
    .line 350
    :cond_f
    iget-object v2, v1, Lk/t;->l:Landroid/graphics/Typeface;

    .line 351
    .line 352
    if-eqz v2, :cond_11

    .line 353
    .line 354
    iget v4, v1, Lk/t;->k:I

    .line 355
    .line 356
    const/4 v13, -0x1

    .line 357
    if-ne v4, v13, :cond_10

    .line 358
    .line 359
    iget v4, v1, Lk/t;->j:I

    .line 360
    .line 361
    invoke-virtual {v10, v2, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 362
    .line 363
    .line 364
    goto :goto_6

    .line 365
    :cond_10
    invoke-virtual {v10, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 366
    .line 367
    .line 368
    :cond_11
    :goto_6
    if-eqz v3, :cond_12

    .line 369
    .line 370
    invoke-static {v10, v3}, Lio/flutter/plugin/editing/i;->w(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    :cond_12
    if-eqz v25, :cond_13

    .line 374
    .line 375
    invoke-static/range {v25 .. v25}, Landroid/os/LocaleList;->forLanguageTags(Ljava/lang/String;)Landroid/os/LocaleList;

    .line 376
    .line 377
    .line 378
    move-result-object v2

    .line 379
    invoke-virtual {v10, v2}, Landroid/widget/TextView;->setTextLocales(Landroid/os/LocaleList;)V

    .line 380
    .line 381
    .line 382
    :cond_13
    iget-object v8, v9, Lk/y;->j:Landroid/content/Context;

    .line 383
    .line 384
    invoke-virtual {v8, v5, v0, v7, v14}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 385
    .line 386
    .line 387
    move-result-object v6

    .line 388
    iget-object v2, v9, Lk/y;->i:Landroid/widget/TextView;

    .line 389
    .line 390
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 391
    .line 392
    .line 393
    move-result-object v3

    .line 394
    move-object v4, v0

    .line 395
    const/4 v0, 0x1

    .line 396
    const/4 v13, 0x4

    .line 397
    const/4 v15, 0x2

    .line 398
    invoke-static/range {v2 .. v7}, LD/G;->b(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    .line 399
    .line 400
    .line 401
    const/4 v2, 0x5

    .line 402
    invoke-virtual {v6, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 403
    .line 404
    .line 405
    move-result v3

    .line 406
    if-eqz v3, :cond_14

    .line 407
    .line 408
    invoke-virtual {v6, v2, v14}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 409
    .line 410
    .line 411
    move-result v2

    .line 412
    iput v2, v9, Lk/y;->a:I

    .line 413
    .line 414
    :cond_14
    invoke-virtual {v6, v13}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 415
    .line 416
    .line 417
    move-result v2

    .line 418
    const/high16 v3, -0x40800000    # -1.0f

    .line 419
    .line 420
    if-eqz v2, :cond_15

    .line 421
    .line 422
    invoke-virtual {v6, v13, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 423
    .line 424
    .line 425
    move-result v2

    .line 426
    goto :goto_7

    .line 427
    :cond_15
    move v2, v3

    .line 428
    :goto_7
    invoke-virtual {v6, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 429
    .line 430
    .line 431
    move-result v7

    .line 432
    if-eqz v7, :cond_16

    .line 433
    .line 434
    invoke-virtual {v6, v15, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 435
    .line 436
    .line 437
    move-result v7

    .line 438
    goto :goto_8

    .line 439
    :cond_16
    move v7, v3

    .line 440
    :goto_8
    invoke-virtual {v6, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 441
    .line 442
    .line 443
    move-result v13

    .line 444
    if-eqz v13, :cond_17

    .line 445
    .line 446
    invoke-virtual {v6, v0, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 447
    .line 448
    .line 449
    move-result v13

    .line 450
    move/from16 p2, v3

    .line 451
    .line 452
    :goto_9
    const/4 v3, 0x3

    .line 453
    goto :goto_a

    .line 454
    :cond_17
    move/from16 p2, v3

    .line 455
    .line 456
    move/from16 v13, p2

    .line 457
    .line 458
    goto :goto_9

    .line 459
    :goto_a
    invoke-virtual {v6, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 460
    .line 461
    .line 462
    move-result v16

    .line 463
    if-eqz v16, :cond_1a

    .line 464
    .line 465
    invoke-virtual {v6, v3, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 466
    .line 467
    .line 468
    move-result v15

    .line 469
    if-lez v15, :cond_1a

    .line 470
    .line 471
    move/from16 v16, v3

    .line 472
    .line 473
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 474
    .line 475
    .line 476
    move-result-object v3

    .line 477
    invoke-virtual {v3, v15}, Landroid/content/res/Resources;->obtainTypedArray(I)Landroid/content/res/TypedArray;

    .line 478
    .line 479
    .line 480
    move-result-object v3

    .line 481
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->length()I

    .line 482
    .line 483
    .line 484
    move-result v15

    .line 485
    move/from16 v17, v14

    .line 486
    .line 487
    new-array v14, v15, [I

    .line 488
    .line 489
    if-lez v15, :cond_19

    .line 490
    .line 491
    move/from16 v0, v17

    .line 492
    .line 493
    :goto_b
    if-ge v0, v15, :cond_18

    .line 494
    .line 495
    const/4 v1, -0x1

    .line 496
    invoke-virtual {v3, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 497
    .line 498
    .line 499
    move-result v21

    .line 500
    aput v21, v14, v0

    .line 501
    .line 502
    add-int/lit8 v0, v0, 0x1

    .line 503
    .line 504
    move-object/from16 v1, p0

    .line 505
    .line 506
    goto :goto_b

    .line 507
    :cond_18
    invoke-static {v14}, Lk/y;->b([I)[I

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    iput-object v0, v9, Lk/y;->f:[I

    .line 512
    .line 513
    invoke-virtual {v9}, Lk/y;->h()Z

    .line 514
    .line 515
    .line 516
    :cond_19
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 517
    .line 518
    .line 519
    goto :goto_c

    .line 520
    :cond_1a
    move/from16 v16, v3

    .line 521
    .line 522
    move/from16 v17, v14

    .line 523
    .line 524
    :goto_c
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    .line 525
    .line 526
    .line 527
    iget v0, v9, Lk/y;->a:I

    .line 528
    .line 529
    const/high16 v1, 0x3f800000    # 1.0f

    .line 530
    .line 531
    const/4 v3, 0x1

    .line 532
    if-ne v0, v3, :cond_1f

    .line 533
    .line 534
    iget-boolean v0, v9, Lk/y;->g:Z

    .line 535
    .line 536
    if-nez v0, :cond_1e

    .line 537
    .line 538
    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 543
    .line 544
    .line 545
    move-result-object v0

    .line 546
    cmpl-float v3, v7, p2

    .line 547
    .line 548
    if-nez v3, :cond_1b

    .line 549
    .line 550
    const/high16 v3, 0x41400000    # 12.0f

    .line 551
    .line 552
    const/4 v15, 0x2

    .line 553
    invoke-static {v15, v3, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 554
    .line 555
    .line 556
    move-result v7

    .line 557
    goto :goto_d

    .line 558
    :cond_1b
    const/4 v15, 0x2

    .line 559
    :goto_d
    cmpl-float v3, v13, p2

    .line 560
    .line 561
    if-nez v3, :cond_1c

    .line 562
    .line 563
    const/high16 v3, 0x42e00000    # 112.0f

    .line 564
    .line 565
    invoke-static {v15, v3, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 566
    .line 567
    .line 568
    move-result v13

    .line 569
    :cond_1c
    cmpl-float v0, v2, p2

    .line 570
    .line 571
    if-nez v0, :cond_1d

    .line 572
    .line 573
    move v2, v1

    .line 574
    :cond_1d
    invoke-virtual {v9, v7, v13, v2}, Lk/y;->i(FFF)V

    .line 575
    .line 576
    .line 577
    :cond_1e
    invoke-virtual {v9}, Lk/y;->g()Z

    .line 578
    .line 579
    .line 580
    :cond_1f
    sget-boolean v0, LG/b;->a:Z

    .line 581
    .line 582
    if-eqz v0, :cond_21

    .line 583
    .line 584
    iget v0, v9, Lk/y;->a:I

    .line 585
    .line 586
    if-eqz v0, :cond_21

    .line 587
    .line 588
    iget-object v0, v9, Lk/y;->f:[I

    .line 589
    .line 590
    array-length v2, v0

    .line 591
    if-lez v2, :cond_21

    .line 592
    .line 593
    invoke-static {v10}, Lio/flutter/plugin/editing/i;->a(Landroid/widget/TextView;)I

    .line 594
    .line 595
    .line 596
    move-result v2

    .line 597
    int-to-float v2, v2

    .line 598
    cmpl-float v2, v2, p2

    .line 599
    .line 600
    if-eqz v2, :cond_20

    .line 601
    .line 602
    iget v0, v9, Lk/y;->d:F

    .line 603
    .line 604
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 605
    .line 606
    .line 607
    move-result v0

    .line 608
    iget v2, v9, Lk/y;->e:F

    .line 609
    .line 610
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 611
    .line 612
    .line 613
    move-result v2

    .line 614
    iget v3, v9, Lk/y;->c:F

    .line 615
    .line 616
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 617
    .line 618
    .line 619
    move-result v3

    .line 620
    invoke-static {v10, v0, v2, v3}, Lio/flutter/plugin/editing/i;->v(Landroid/widget/TextView;III)V

    .line 621
    .line 622
    .line 623
    goto :goto_e

    .line 624
    :cond_20
    invoke-static {v10, v0}, Lio/flutter/plugin/editing/i;->x(Landroid/widget/TextView;[I)V

    .line 625
    .line 626
    .line 627
    :cond_21
    :goto_e
    invoke-virtual {v11, v5, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 628
    .line 629
    .line 630
    move-result-object v0

    .line 631
    const/16 v2, 0x8

    .line 632
    .line 633
    const/4 v13, -0x1

    .line 634
    invoke-virtual {v0, v2, v13}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 635
    .line 636
    .line 637
    move-result v2

    .line 638
    if-eq v2, v13, :cond_22

    .line 639
    .line 640
    invoke-virtual {v12, v11, v2}, Lk/o;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 641
    .line 642
    .line 643
    move-result-object v2

    .line 644
    :goto_f
    const/16 v15, 0xd

    .line 645
    .line 646
    goto :goto_10

    .line 647
    :cond_22
    const/4 v2, 0x0

    .line 648
    goto :goto_f

    .line 649
    :goto_10
    invoke-virtual {v0, v15, v13}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 650
    .line 651
    .line 652
    move-result v3

    .line 653
    if-eq v3, v13, :cond_23

    .line 654
    .line 655
    invoke-virtual {v12, v11, v3}, Lk/o;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 656
    .line 657
    .line 658
    move-result-object v3

    .line 659
    goto :goto_11

    .line 660
    :cond_23
    const/4 v3, 0x0

    .line 661
    :goto_11
    const/16 v4, 0x9

    .line 662
    .line 663
    invoke-virtual {v0, v4, v13}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 664
    .line 665
    .line 666
    move-result v4

    .line 667
    if-eq v4, v13, :cond_24

    .line 668
    .line 669
    invoke-virtual {v12, v11, v4}, Lk/o;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 670
    .line 671
    .line 672
    move-result-object v4

    .line 673
    :goto_12
    const/4 v5, 0x6

    .line 674
    goto :goto_13

    .line 675
    :cond_24
    const/4 v4, 0x0

    .line 676
    goto :goto_12

    .line 677
    :goto_13
    invoke-virtual {v0, v5, v13}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 678
    .line 679
    .line 680
    move-result v5

    .line 681
    if-eq v5, v13, :cond_25

    .line 682
    .line 683
    invoke-virtual {v12, v11, v5}, Lk/o;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 684
    .line 685
    .line 686
    move-result-object v5

    .line 687
    goto :goto_14

    .line 688
    :cond_25
    const/4 v5, 0x0

    .line 689
    :goto_14
    const/16 v6, 0xa

    .line 690
    .line 691
    invoke-virtual {v0, v6, v13}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 692
    .line 693
    .line 694
    move-result v6

    .line 695
    if-eq v6, v13, :cond_26

    .line 696
    .line 697
    invoke-virtual {v12, v11, v6}, Lk/o;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 698
    .line 699
    .line 700
    move-result-object v6

    .line 701
    goto :goto_15

    .line 702
    :cond_26
    const/4 v6, 0x0

    .line 703
    :goto_15
    const/4 v7, 0x7

    .line 704
    invoke-virtual {v0, v7, v13}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 705
    .line 706
    .line 707
    move-result v7

    .line 708
    if-eq v7, v13, :cond_27

    .line 709
    .line 710
    invoke-virtual {v12, v11, v7}, Lk/o;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 711
    .line 712
    .line 713
    move-result-object v7

    .line 714
    goto :goto_16

    .line 715
    :cond_27
    const/4 v7, 0x0

    .line 716
    :goto_16
    if-nez v6, :cond_32

    .line 717
    .line 718
    if-eqz v7, :cond_28

    .line 719
    .line 720
    goto :goto_1f

    .line 721
    :cond_28
    if-nez v2, :cond_29

    .line 722
    .line 723
    if-nez v3, :cond_29

    .line 724
    .line 725
    if-nez v4, :cond_29

    .line 726
    .line 727
    if-eqz v5, :cond_37

    .line 728
    .line 729
    :cond_29
    invoke-virtual {v10}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    .line 730
    .line 731
    .line 732
    move-result-object v6

    .line 733
    aget-object v7, v6, v17

    .line 734
    .line 735
    if-nez v7, :cond_2f

    .line 736
    .line 737
    const/16 v19, 0x2

    .line 738
    .line 739
    aget-object v8, v6, v19

    .line 740
    .line 741
    if-eqz v8, :cond_2a

    .line 742
    .line 743
    goto :goto_1b

    .line 744
    :cond_2a
    invoke-virtual {v10}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    .line 745
    .line 746
    .line 747
    move-result-object v6

    .line 748
    if-eqz v2, :cond_2b

    .line 749
    .line 750
    goto :goto_17

    .line 751
    :cond_2b
    aget-object v2, v6, v17

    .line 752
    .line 753
    :goto_17
    if-eqz v3, :cond_2c

    .line 754
    .line 755
    goto :goto_18

    .line 756
    :cond_2c
    const/16 v18, 0x1

    .line 757
    .line 758
    aget-object v3, v6, v18

    .line 759
    .line 760
    :goto_18
    if-eqz v4, :cond_2d

    .line 761
    .line 762
    goto :goto_19

    .line 763
    :cond_2d
    const/16 v19, 0x2

    .line 764
    .line 765
    aget-object v4, v6, v19

    .line 766
    .line 767
    :goto_19
    if-eqz v5, :cond_2e

    .line 768
    .line 769
    goto :goto_1a

    .line 770
    :cond_2e
    aget-object v5, v6, v16

    .line 771
    .line 772
    :goto_1a
    invoke-virtual {v10, v2, v3, v4, v5}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 773
    .line 774
    .line 775
    goto :goto_24

    .line 776
    :cond_2f
    :goto_1b
    if-eqz v3, :cond_30

    .line 777
    .line 778
    :goto_1c
    const/16 v19, 0x2

    .line 779
    .line 780
    goto :goto_1d

    .line 781
    :cond_30
    const/16 v18, 0x1

    .line 782
    .line 783
    aget-object v3, v6, v18

    .line 784
    .line 785
    goto :goto_1c

    .line 786
    :goto_1d
    aget-object v2, v6, v19

    .line 787
    .line 788
    if-eqz v5, :cond_31

    .line 789
    .line 790
    goto :goto_1e

    .line 791
    :cond_31
    aget-object v5, v6, v16

    .line 792
    .line 793
    :goto_1e
    invoke-virtual {v10, v7, v3, v2, v5}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 794
    .line 795
    .line 796
    goto :goto_24

    .line 797
    :cond_32
    :goto_1f
    invoke-virtual {v10}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    .line 798
    .line 799
    .line 800
    move-result-object v2

    .line 801
    if-eqz v6, :cond_33

    .line 802
    .line 803
    goto :goto_20

    .line 804
    :cond_33
    aget-object v6, v2, v17

    .line 805
    .line 806
    :goto_20
    if-eqz v3, :cond_34

    .line 807
    .line 808
    goto :goto_21

    .line 809
    :cond_34
    const/16 v18, 0x1

    .line 810
    .line 811
    aget-object v3, v2, v18

    .line 812
    .line 813
    :goto_21
    if-eqz v7, :cond_35

    .line 814
    .line 815
    goto :goto_22

    .line 816
    :cond_35
    const/16 v19, 0x2

    .line 817
    .line 818
    aget-object v7, v2, v19

    .line 819
    .line 820
    :goto_22
    if-eqz v5, :cond_36

    .line 821
    .line 822
    goto :goto_23

    .line 823
    :cond_36
    aget-object v5, v2, v16

    .line 824
    .line 825
    :goto_23
    invoke-virtual {v10, v6, v3, v7, v5}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 826
    .line 827
    .line 828
    :cond_37
    :goto_24
    const/16 v2, 0xb

    .line 829
    .line 830
    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 831
    .line 832
    .line 833
    move-result v3

    .line 834
    if-eqz v3, :cond_39

    .line 835
    .line 836
    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 837
    .line 838
    .line 839
    move-result v3

    .line 840
    if-eqz v3, :cond_38

    .line 841
    .line 842
    move/from16 v3, v17

    .line 843
    .line 844
    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 845
    .line 846
    .line 847
    move-result v3

    .line 848
    if-eqz v3, :cond_38

    .line 849
    .line 850
    sget-object v4, Lg/a;->a:Ljava/lang/Object;

    .line 851
    .line 852
    invoke-virtual {v11, v3}, Landroid/content/Context;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 853
    .line 854
    .line 855
    move-result-object v3

    .line 856
    if-eqz v3, :cond_38

    .line 857
    .line 858
    goto :goto_25

    .line 859
    :cond_38
    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 860
    .line 861
    .line 862
    move-result-object v3

    .line 863
    :goto_25
    invoke-virtual {v10, v3}, Landroid/widget/TextView;->setCompoundDrawableTintList(Landroid/content/res/ColorStateList;)V

    .line 864
    .line 865
    .line 866
    :cond_39
    const/16 v2, 0xc

    .line 867
    .line 868
    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 869
    .line 870
    .line 871
    move-result v3

    .line 872
    const/4 v13, -0x1

    .line 873
    if-eqz v3, :cond_3a

    .line 874
    .line 875
    invoke-virtual {v0, v2, v13}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 876
    .line 877
    .line 878
    move-result v2

    .line 879
    const/4 v3, 0x0

    .line 880
    invoke-static {v2, v3}, Lk/B;->c(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    .line 881
    .line 882
    .line 883
    move-result-object v2

    .line 884
    invoke-virtual {v10, v2}, Landroid/widget/TextView;->setCompoundDrawableTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 885
    .line 886
    .line 887
    :cond_3a
    const/16 v2, 0xe

    .line 888
    .line 889
    invoke-virtual {v0, v2, v13}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 890
    .line 891
    .line 892
    move-result v2

    .line 893
    const/16 v3, 0x11

    .line 894
    .line 895
    invoke-virtual {v0, v3, v13}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 896
    .line 897
    .line 898
    move-result v3

    .line 899
    const/16 v4, 0x12

    .line 900
    .line 901
    invoke-virtual {v0, v4, v13}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 902
    .line 903
    .line 904
    move-result v4

    .line 905
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 906
    .line 907
    .line 908
    if-eq v2, v13, :cond_3b

    .line 909
    .line 910
    invoke-static {v10, v2}, LE2/a;->O(Landroid/widget/TextView;I)V

    .line 911
    .line 912
    .line 913
    :cond_3b
    if-eq v3, v13, :cond_3c

    .line 914
    .line 915
    invoke-static {v10, v3}, LE2/a;->P(Landroid/widget/TextView;I)V

    .line 916
    .line 917
    .line 918
    :cond_3c
    if-eq v4, v13, :cond_3e

    .line 919
    .line 920
    if-ltz v4, :cond_3d

    .line 921
    .line 922
    invoke-virtual {v10}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 923
    .line 924
    .line 925
    move-result-object v0

    .line 926
    const/4 v3, 0x0

    .line 927
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->getFontMetricsInt(Landroid/graphics/Paint$FontMetricsInt;)I

    .line 928
    .line 929
    .line 930
    move-result v0

    .line 931
    if-eq v4, v0, :cond_3e

    .line 932
    .line 933
    sub-int/2addr v4, v0

    .line 934
    int-to-float v0, v4

    .line 935
    invoke-virtual {v10, v0, v1}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 936
    .line 937
    .line 938
    return-void

    .line 939
    :cond_3d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 940
    .line 941
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 942
    .line 943
    .line 944
    throw v0

    .line 945
    :cond_3e
    return-void

    .line 946
    :goto_26
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 947
    throw v0
.end method

.method public final e(Landroid/content/Context;I)V
    .locals 5

    .line 1
    new-instance v0, LA0/j;

    .line 2
    .line 3
    sget-object v1, Lf/a;->t:[I

    .line 4
    .line 5
    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-direct {v0, p1, p2}, LA0/j;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0xe

    .line 13
    .line 14
    invoke-virtual {p2, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    iget-object v3, p0, Lk/t;->a:Landroid/widget/TextView;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {p2, v1, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 28
    .line 29
    .line 30
    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 31
    .line 32
    invoke-virtual {p2, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    const/4 v2, -0x1

    .line 39
    invoke-virtual {p2, v4, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-nez v2, :cond_1

    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    invoke-virtual {v3, v4, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 47
    .line 48
    .line 49
    :cond_1
    invoke-virtual {p0, p1, v0}, Lk/t;->f(Landroid/content/Context;LA0/j;)V

    .line 50
    .line 51
    .line 52
    const/16 p1, 0x1a

    .line 53
    .line 54
    if-lt v1, p1, :cond_2

    .line 55
    .line 56
    const/16 p1, 0xd

    .line 57
    .line 58
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_2

    .line 63
    .line 64
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-eqz p1, :cond_2

    .line 69
    .line 70
    invoke-static {v3, p1}, Lio/flutter/plugin/editing/i;->w(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    :cond_2
    invoke-virtual {v0}, LA0/j;->J()V

    .line 74
    .line 75
    .line 76
    iget-object p1, p0, Lk/t;->l:Landroid/graphics/Typeface;

    .line 77
    .line 78
    if-eqz p1, :cond_3

    .line 79
    .line 80
    iget p2, p0, Lk/t;->j:I

    .line 81
    .line 82
    invoke-virtual {v3, p1, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 83
    .line 84
    .line 85
    :cond_3
    return-void
.end method

.method public final f(Landroid/content/Context;LA0/j;)V
    .locals 11

    .line 1
    iget v0, p0, Lk/t;->j:I

    .line 2
    .line 3
    iget-object v1, p2, LA0/j;->m:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/content/res/TypedArray;

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iput v0, p0, Lk/t;->j:I

    .line 13
    .line 14
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 15
    .line 16
    const/4 v3, -0x1

    .line 17
    const/16 v4, 0x1c

    .line 18
    .line 19
    if-lt v0, v4, :cond_0

    .line 20
    .line 21
    const/16 v5, 0xb

    .line 22
    .line 23
    invoke-virtual {v1, v5, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    iput v5, p0, Lk/t;->k:I

    .line 28
    .line 29
    if-eq v5, v3, :cond_0

    .line 30
    .line 31
    iget v5, p0, Lk/t;->j:I

    .line 32
    .line 33
    and-int/2addr v5, v2

    .line 34
    iput v5, p0, Lk/t;->j:I

    .line 35
    .line 36
    :cond_0
    const/16 v5, 0xa

    .line 37
    .line 38
    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    const/16 v7, 0xc

    .line 43
    .line 44
    const/4 v8, 0x0

    .line 45
    const/4 v9, 0x1

    .line 46
    if-nez v6, :cond_5

    .line 47
    .line 48
    invoke-virtual {v1, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-eqz v6, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    invoke-virtual {v1, v9}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_e

    .line 60
    .line 61
    iput-boolean v8, p0, Lk/t;->m:Z

    .line 62
    .line 63
    invoke-virtual {v1, v9, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eq p1, v9, :cond_4

    .line 68
    .line 69
    if-eq p1, v2, :cond_3

    .line 70
    .line 71
    const/4 p2, 0x3

    .line 72
    if-eq p1, p2, :cond_2

    .line 73
    .line 74
    goto/16 :goto_4

    .line 75
    .line 76
    :cond_2
    sget-object p1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    .line 77
    .line 78
    iput-object p1, p0, Lk/t;->l:Landroid/graphics/Typeface;

    .line 79
    .line 80
    return-void

    .line 81
    :cond_3
    sget-object p1, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    .line 82
    .line 83
    iput-object p1, p0, Lk/t;->l:Landroid/graphics/Typeface;

    .line 84
    .line 85
    return-void

    .line 86
    :cond_4
    sget-object p1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    .line 87
    .line 88
    iput-object p1, p0, Lk/t;->l:Landroid/graphics/Typeface;

    .line 89
    .line 90
    return-void

    .line 91
    :cond_5
    :goto_0
    const/4 v6, 0x0

    .line 92
    iput-object v6, p0, Lk/t;->l:Landroid/graphics/Typeface;

    .line 93
    .line 94
    invoke-virtual {v1, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    if-eqz v6, :cond_6

    .line 99
    .line 100
    move v5, v7

    .line 101
    :cond_6
    iget v6, p0, Lk/t;->k:I

    .line 102
    .line 103
    iget v7, p0, Lk/t;->j:I

    .line 104
    .line 105
    invoke-virtual {p1}, Landroid/content/Context;->isRestricted()Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-nez p1, :cond_b

    .line 110
    .line 111
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 112
    .line 113
    iget-object v10, p0, Lk/t;->a:Landroid/widget/TextView;

    .line 114
    .line 115
    invoke-direct {p1, v10}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    new-instance v10, Lk/s;

    .line 119
    .line 120
    invoke-direct {v10, p0, v6, v7, p1}, Lk/s;-><init>(Lk/t;IILjava/lang/ref/WeakReference;)V

    .line 121
    .line 122
    .line 123
    :try_start_0
    iget p1, p0, Lk/t;->j:I

    .line 124
    .line 125
    invoke-virtual {p2, v5, p1, v10}, LA0/j;->z(IILk/s;)Landroid/graphics/Typeface;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    if-eqz p1, :cond_9

    .line 130
    .line 131
    if-lt v0, v4, :cond_8

    .line 132
    .line 133
    iget p2, p0, Lk/t;->k:I

    .line 134
    .line 135
    if-eq p2, v3, :cond_8

    .line 136
    .line 137
    invoke-static {p1, v8}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    iget p2, p0, Lk/t;->k:I

    .line 142
    .line 143
    iget v0, p0, Lk/t;->j:I

    .line 144
    .line 145
    and-int/2addr v0, v2

    .line 146
    if-eqz v0, :cond_7

    .line 147
    .line 148
    move v0, v9

    .line 149
    goto :goto_1

    .line 150
    :cond_7
    move v0, v8

    .line 151
    :goto_1
    invoke-static {p1, p2, v0}, Lj0/h;->d(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    iput-object p1, p0, Lk/t;->l:Landroid/graphics/Typeface;

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_8
    iput-object p1, p0, Lk/t;->l:Landroid/graphics/Typeface;

    .line 159
    .line 160
    :cond_9
    :goto_2
    iget-object p1, p0, Lk/t;->l:Landroid/graphics/Typeface;

    .line 161
    .line 162
    if-nez p1, :cond_a

    .line 163
    .line 164
    move p1, v9

    .line 165
    goto :goto_3

    .line 166
    :cond_a
    move p1, v8

    .line 167
    :goto_3
    iput-boolean p1, p0, Lk/t;->m:Z
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 168
    .line 169
    :catch_0
    :cond_b
    iget-object p1, p0, Lk/t;->l:Landroid/graphics/Typeface;

    .line 170
    .line 171
    if-nez p1, :cond_e

    .line 172
    .line 173
    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    if-eqz p1, :cond_e

    .line 178
    .line 179
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 180
    .line 181
    if-lt p2, v4, :cond_d

    .line 182
    .line 183
    iget p2, p0, Lk/t;->k:I

    .line 184
    .line 185
    if-eq p2, v3, :cond_d

    .line 186
    .line 187
    invoke-static {p1, v8}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    iget p2, p0, Lk/t;->k:I

    .line 192
    .line 193
    iget v0, p0, Lk/t;->j:I

    .line 194
    .line 195
    and-int/2addr v0, v2

    .line 196
    if-eqz v0, :cond_c

    .line 197
    .line 198
    move v8, v9

    .line 199
    :cond_c
    invoke-static {p1, p2, v8}, Lj0/h;->d(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    iput-object p1, p0, Lk/t;->l:Landroid/graphics/Typeface;

    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_d
    iget p2, p0, Lk/t;->j:I

    .line 207
    .line 208
    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    iput-object p1, p0, Lk/t;->l:Landroid/graphics/Typeface;

    .line 213
    .line 214
    :cond_e
    :goto_4
    return-void
.end method

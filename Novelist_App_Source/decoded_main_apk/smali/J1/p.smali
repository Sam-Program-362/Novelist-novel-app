.class public LJ1/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/b;
.implements Lz1/a;
.implements LJ1/h;


# instance fields
.field public k:Ly1/a;

.field public l:Lk/u0;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a()LJ1/b;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LJ1/p;->l:Lk/u0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    iget-object v3, v1, Lk/u0;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v3, Landroid/app/Activity;

    .line 11
    .line 12
    if-nez v3, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v1, v1, Lk/u0;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, LJ1/n;

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    move-object v1, v2

    .line 21
    :goto_1
    if-eqz v1, :cond_e

    .line 22
    .line 23
    iget-object v3, v1, LJ1/n;->n:LH/f;

    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    new-instance v4, Ljava/util/HashMap;

    .line 29
    .line 30
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 31
    .line 32
    .line 33
    iget-object v5, v3, LH/f;->a:Landroid/content/Context;

    .line 34
    .line 35
    const-string v6, "flutter_image_picker_shared_preference"

    .line 36
    .line 37
    const/4 v7, 0x0

    .line 38
    invoke-virtual {v5, v6, v7}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    const-string v6, "flutter_image_picker_image_path"

    .line 43
    .line 44
    invoke-interface {v5, v6}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    move-result v8

    .line 48
    const-string v9, "pathList"

    .line 49
    .line 50
    const/4 v10, 0x1

    .line 51
    if-eqz v8, :cond_2

    .line 52
    .line 53
    invoke-interface {v5, v6, v2}, Landroid/content/SharedPreferences;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    if-eqz v6, :cond_2

    .line 58
    .line 59
    new-instance v8, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-direct {v8, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4, v9, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move v6, v10

    .line 68
    goto :goto_2

    .line 69
    :cond_2
    move v6, v7

    .line 70
    :goto_2
    const-string v8, "flutter_image_picker_error_code"

    .line 71
    .line 72
    invoke-interface {v5, v8}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 73
    .line 74
    .line 75
    move-result v11

    .line 76
    const-string v12, "error"

    .line 77
    .line 78
    const-string v13, ""

    .line 79
    .line 80
    if-eqz v11, :cond_3

    .line 81
    .line 82
    new-instance v6, LJ1/a;

    .line 83
    .line 84
    invoke-interface {v5, v8, v13}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    const-string v11, "flutter_image_picker_error_message"

    .line 89
    .line 90
    invoke-interface {v5, v11, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v11

    .line 94
    invoke-direct {v6, v8, v11}, LJ1/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4, v12, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_3
    move v10, v6

    .line 102
    :goto_3
    const-string v6, "imageQuality"

    .line 103
    .line 104
    const/16 v8, 0x64

    .line 105
    .line 106
    const-string v11, "maxHeight"

    .line 107
    .line 108
    const-string v14, "maxWidth"

    .line 109
    .line 110
    const-string v15, "type"

    .line 111
    .line 112
    if-eqz v10, :cond_8

    .line 113
    .line 114
    const-string v10, "flutter_image_picker_type"

    .line 115
    .line 116
    invoke-interface {v5, v10}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 117
    .line 118
    .line 119
    move-result v16

    .line 120
    if-eqz v16, :cond_5

    .line 121
    .line 122
    invoke-interface {v5, v10, v13}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v10

    .line 126
    const-string v13, "video"

    .line 127
    .line 128
    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v10

    .line 132
    if-eqz v10, :cond_4

    .line 133
    .line 134
    sget-object v10, LJ1/c;->n:LJ1/c;

    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_4
    sget-object v10, LJ1/c;->m:LJ1/c;

    .line 138
    .line 139
    :goto_4
    invoke-virtual {v4, v15, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    :cond_5
    const-string v10, "flutter_image_picker_max_width"

    .line 143
    .line 144
    invoke-interface {v5, v10}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 145
    .line 146
    .line 147
    move-result v13

    .line 148
    move-object/from16 v16, v2

    .line 149
    .line 150
    move-object/from16 v17, v3

    .line 151
    .line 152
    const-wide/16 v2, 0x0

    .line 153
    .line 154
    if-eqz v13, :cond_6

    .line 155
    .line 156
    invoke-interface {v5, v10, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 157
    .line 158
    .line 159
    move-result-wide v18

    .line 160
    invoke-static/range {v18 .. v19}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 161
    .line 162
    .line 163
    move-result-wide v18

    .line 164
    invoke-static/range {v18 .. v19}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 165
    .line 166
    .line 167
    move-result-object v10

    .line 168
    invoke-virtual {v4, v14, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    :cond_6
    const-string v10, "flutter_image_picker_max_height"

    .line 172
    .line 173
    invoke-interface {v5, v10}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 174
    .line 175
    .line 176
    move-result v13

    .line 177
    if-eqz v13, :cond_7

    .line 178
    .line 179
    invoke-interface {v5, v10, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 180
    .line 181
    .line 182
    move-result-wide v2

    .line 183
    invoke-static {v2, v3}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 184
    .line 185
    .line 186
    move-result-wide v2

    .line 187
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    invoke-virtual {v4, v11, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    :cond_7
    const-string v2, "flutter_image_picker_image_quality"

    .line 195
    .line 196
    invoke-interface {v5, v2, v8}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    invoke-virtual {v4, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_8
    move-object/from16 v16, v2

    .line 209
    .line 210
    move-object/from16 v17, v3

    .line 211
    .line 212
    :goto_5
    invoke-virtual {v4}, Ljava/util/HashMap;->isEmpty()Z

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    if-eqz v2, :cond_9

    .line 217
    .line 218
    return-object v16

    .line 219
    :cond_9
    invoke-virtual {v4, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    check-cast v2, LJ1/c;

    .line 224
    .line 225
    invoke-virtual {v4, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    check-cast v3, Ljava/util/ArrayList;

    .line 230
    .line 231
    if-eqz v2, :cond_d

    .line 232
    .line 233
    if-nez v3, :cond_a

    .line 234
    .line 235
    goto :goto_8

    .line 236
    :cond_a
    new-instance v5, Ljava/util/ArrayList;

    .line 237
    .line 238
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 242
    .line 243
    .line 244
    move-result v9

    .line 245
    :goto_6
    if-ge v7, v9, :cond_c

    .line 246
    .line 247
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v10

    .line 251
    add-int/lit8 v7, v7, 0x1

    .line 252
    .line 253
    check-cast v10, Ljava/lang/String;

    .line 254
    .line 255
    invoke-virtual {v4, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v13

    .line 259
    check-cast v13, Ljava/lang/Double;

    .line 260
    .line 261
    invoke-virtual {v4, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v15

    .line 265
    check-cast v15, Ljava/lang/Double;

    .line 266
    .line 267
    invoke-virtual {v4, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v16

    .line 271
    check-cast v16, Ljava/lang/Integer;

    .line 272
    .line 273
    if-nez v16, :cond_b

    .line 274
    .line 275
    goto :goto_7

    .line 276
    :cond_b
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    .line 277
    .line 278
    .line 279
    move-result v16

    .line 280
    move/from16 v8, v16

    .line 281
    .line 282
    :goto_7
    iget-object v0, v1, LJ1/n;->m:LH/f;

    .line 283
    .line 284
    invoke-virtual {v0, v10, v13, v15, v8}, LH/f;->c(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;I)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-object/from16 v0, p0

    .line 292
    .line 293
    const/16 v8, 0x64

    .line 294
    .line 295
    goto :goto_6

    .line 296
    :cond_c
    invoke-virtual/range {v17 .. v17}, LH/f;->a()V

    .line 297
    .line 298
    .line 299
    new-instance v0, LJ1/b;

    .line 300
    .line 301
    invoke-virtual {v4, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    check-cast v1, LJ1/a;

    .line 306
    .line 307
    invoke-direct {v0, v2, v1, v5}, LJ1/b;-><init>(LJ1/c;LJ1/a;Ljava/util/List;)V

    .line 308
    .line 309
    .line 310
    return-object v0

    .line 311
    :cond_d
    :goto_8
    invoke-virtual/range {v17 .. v17}, LH/f;->a()V

    .line 312
    .line 313
    .line 314
    return-object v16

    .line 315
    :cond_e
    new-instance v0, LJ1/d;

    .line 316
    .line 317
    const-string v1, "no_activity"

    .line 318
    .line 319
    const-string v2, "image_picker plugin requires a foreground activity."

    .line 320
    .line 321
    invoke-direct {v0, v1, v2}, LJ1/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    throw v0
.end method

.method public final onAttachedToActivity(Lz1/b;)V
    .locals 6

    .line 1
    iget-object v0, p0, LJ1/p;->k:Ly1/a;

    .line 2
    .line 3
    iget-object v1, v0, Ly1/a;->c:LC1/f;

    .line 4
    .line 5
    iget-object v0, v0, Ly1/a;->a:Landroid/content/Context;

    .line 6
    .line 7
    check-cast v0, Landroid/app/Application;

    .line 8
    .line 9
    move-object v2, p1

    .line 10
    check-cast v2, Lk/u0;

    .line 11
    .line 12
    iget-object v3, v2, Lk/u0;->a:Landroid/content/Context;

    .line 13
    .line 14
    check-cast v3, Landroid/app/Activity;

    .line 15
    .line 16
    new-instance v4, Lk/u0;

    .line 17
    .line 18
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, v4, Lk/u0;->a:Landroid/content/Context;

    .line 22
    .line 23
    iput-object v3, v4, Lk/u0;->b:Ljava/lang/Object;

    .line 24
    .line 25
    iput-object p1, v4, Lk/u0;->e:Ljava/lang/Object;

    .line 26
    .line 27
    iput-object v1, v4, Lk/u0;->f:Ljava/lang/Object;

    .line 28
    .line 29
    new-instance p1, LH/f;

    .line 30
    .line 31
    invoke-direct {p1, v3}, LH/f;-><init>(Landroid/app/Activity;)V

    .line 32
    .line 33
    .line 34
    new-instance v0, LB1/b;

    .line 35
    .line 36
    const/16 v5, 0xd

    .line 37
    .line 38
    invoke-direct {v0, v5}, LB1/b;-><init>(I)V

    .line 39
    .line 40
    .line 41
    new-instance v5, LH/f;

    .line 42
    .line 43
    invoke-direct {v5, v3, v0}, LH/f;-><init>(Landroid/app/Activity;LB1/b;)V

    .line 44
    .line 45
    .line 46
    new-instance v0, LJ1/n;

    .line 47
    .line 48
    invoke-direct {v0, v3, v5, p1}, LJ1/n;-><init>(Landroid/app/Activity;LH/f;LH/f;)V

    .line 49
    .line 50
    .line 51
    iput-object v0, v4, Lk/u0;->c:Ljava/lang/Object;

    .line 52
    .line 53
    sget-object p1, LJ1/h;->c:LJ1/g;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-static {v1, p0}, LJ1/g;->a(LC1/f;LJ1/p;)V

    .line 59
    .line 60
    .line 61
    new-instance p1, LJ1/o;

    .line 62
    .line 63
    invoke-direct {p1, p0, v3}, LJ1/o;-><init>(LJ1/p;Landroid/app/Activity;)V

    .line 64
    .line 65
    .line 66
    iput-object p1, v4, Lk/u0;->d:Ljava/lang/Object;

    .line 67
    .line 68
    iget-object p1, v4, Lk/u0;->c:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p1, LJ1/n;

    .line 71
    .line 72
    invoke-virtual {v2, p1}, Lk/u0;->a(LC1/o;)V

    .line 73
    .line 74
    .line 75
    iget-object p1, v4, Lk/u0;->c:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p1, LJ1/n;

    .line 78
    .line 79
    iget-object v0, v2, Lk/u0;->c:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, Ljava/util/HashSet;

    .line 82
    .line 83
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    iget-object p1, v2, Lk/u0;->b:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast p1, Lio/flutter/embedding/engine/plugins/lifecycle/HiddenLifecycleReference;

    .line 89
    .line 90
    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/lifecycle/HiddenLifecycleReference;->getLifecycle()Landroidx/lifecycle/n;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    iput-object p1, v4, Lk/u0;->g:Ljava/lang/Object;

    .line 95
    .line 96
    iget-object v0, v4, Lk/u0;->d:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, LJ1/o;

    .line 99
    .line 100
    invoke-virtual {p1, v0}, Landroidx/lifecycle/n;->a(Landroidx/lifecycle/r;)V

    .line 101
    .line 102
    .line 103
    iput-object v4, p0, LJ1/p;->l:Lk/u0;

    .line 104
    .line 105
    return-void
.end method

.method public final onAttachedToEngine(Ly1/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, LJ1/p;->k:Ly1/a;

    .line 2
    .line 3
    return-void
.end method

.method public final onDetachedFromActivity()V
    .locals 4

    .line 1
    iget-object v0, p0, LJ1/p;->l:Lk/u0;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget-object v1, v0, Lk/u0;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lz1/b;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-object v3, v0, Lk/u0;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v3, LJ1/n;

    .line 15
    .line 16
    check-cast v1, Lk/u0;

    .line 17
    .line 18
    iget-object v1, v1, Lk/u0;->d:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Ljava/util/HashSet;

    .line 21
    .line 22
    invoke-virtual {v1, v3}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    iget-object v1, v0, Lk/u0;->e:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Lz1/b;

    .line 28
    .line 29
    iget-object v3, v0, Lk/u0;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v3, LJ1/n;

    .line 32
    .line 33
    check-cast v1, Lk/u0;

    .line 34
    .line 35
    iget-object v1, v1, Lk/u0;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Ljava/util/HashSet;

    .line 38
    .line 39
    invoke-virtual {v1, v3}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    iput-object v2, v0, Lk/u0;->e:Ljava/lang/Object;

    .line 43
    .line 44
    :cond_0
    iget-object v1, v0, Lk/u0;->g:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, Landroidx/lifecycle/n;

    .line 47
    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    iget-object v3, v0, Lk/u0;->d:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v3, LJ1/o;

    .line 53
    .line 54
    invoke-virtual {v1, v3}, Landroidx/lifecycle/n;->b(Landroidx/lifecycle/r;)V

    .line 55
    .line 56
    .line 57
    iput-object v2, v0, Lk/u0;->g:Ljava/lang/Object;

    .line 58
    .line 59
    :cond_1
    iget-object v1, v0, Lk/u0;->f:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v1, LC1/f;

    .line 62
    .line 63
    sget-object v3, LJ1/h;->c:LJ1/g;

    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-static {v1, v2}, LJ1/g;->a(LC1/f;LJ1/p;)V

    .line 69
    .line 70
    .line 71
    iget-object v1, v0, Lk/u0;->a:Landroid/content/Context;

    .line 72
    .line 73
    check-cast v1, Landroid/app/Application;

    .line 74
    .line 75
    if-eqz v1, :cond_2

    .line 76
    .line 77
    iget-object v3, v0, Lk/u0;->d:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v3, LJ1/o;

    .line 80
    .line 81
    invoke-virtual {v1, v3}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 82
    .line 83
    .line 84
    iput-object v2, v0, Lk/u0;->a:Landroid/content/Context;

    .line 85
    .line 86
    :cond_2
    iput-object v2, v0, Lk/u0;->b:Ljava/lang/Object;

    .line 87
    .line 88
    iput-object v2, v0, Lk/u0;->d:Ljava/lang/Object;

    .line 89
    .line 90
    iput-object v2, v0, Lk/u0;->c:Ljava/lang/Object;

    .line 91
    .line 92
    iput-object v2, p0, LJ1/p;->l:Lk/u0;

    .line 93
    .line 94
    :cond_3
    return-void
.end method

.method public final onDetachedFromActivityForConfigChanges()V
    .locals 0

    .line 1
    invoke-virtual {p0}, LJ1/p;->onDetachedFromActivity()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onDetachedFromEngine(Ly1/a;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, LJ1/p;->k:Ly1/a;

    .line 3
    .line 4
    return-void
.end method

.method public final onReattachedToActivityForConfigChanges(Lz1/b;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LJ1/p;->onAttachedToActivity(Lz1/b;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

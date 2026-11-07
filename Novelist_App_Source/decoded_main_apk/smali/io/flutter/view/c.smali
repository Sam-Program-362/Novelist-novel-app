.class public final Lio/flutter/view/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls1/k;
.implements Ls1/l;


# instance fields
.field public final synthetic a:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/flutter/view/c;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/nio/ByteBuffer;[Ljava/lang/String;[Ljava/nio/ByteBuffer;)V
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 6
    .line 7
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    .line 10
    array-length v2, v1

    .line 11
    const/4 v4, 0x0

    .line 12
    :goto_0
    if-ge v4, v2, :cond_0

    .line 13
    .line 14
    aget-object v5, v1, v4

    .line 15
    .line 16
    sget-object v6, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 17
    .line 18
    invoke-virtual {v5, v6}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    .line 21
    add-int/lit8 v4, v4, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object/from16 v4, p0

    .line 25
    .line 26
    iget-object v2, v4, Lio/flutter/view/c;->a:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, Lio/flutter/view/i;

    .line 29
    .line 30
    iget-object v5, v2, Lio/flutter/view/i;->g:Ljava/util/HashMap;

    .line 31
    .line 32
    iget-object v6, v2, Lio/flutter/view/i;->e:Lio/flutter/plugin/platform/k;

    .line 33
    .line 34
    iget-object v7, v2, Lio/flutter/view/i;->q:Ljava/util/ArrayList;

    .line 35
    .line 36
    new-instance v8, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    :goto_1
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 42
    .line 43
    .line 44
    move-result v9

    .line 45
    const/16 v11, 0x10

    .line 46
    .line 47
    const/4 v12, 0x1

    .line 48
    const/4 v15, 0x0

    .line 49
    if-eqz v9, :cond_10

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 52
    .line 53
    .line 54
    move-result v9

    .line 55
    invoke-virtual {v2, v9}, Lio/flutter/view/i;->c(I)Lio/flutter/view/h;

    .line 56
    .line 57
    .line 58
    move-result-object v9

    .line 59
    iget-object v3, v9, Lio/flutter/view/h;->X:Ljava/util/ArrayList;

    .line 60
    .line 61
    iget-object v14, v9, Lio/flutter/view/h;->a:Lio/flutter/view/i;

    .line 62
    .line 63
    iput-boolean v12, v9, Lio/flutter/view/h;->H:Z

    .line 64
    .line 65
    iget-object v13, v9, Lio/flutter/view/h;->r:Ljava/lang/String;

    .line 66
    .line 67
    iput-object v13, v9, Lio/flutter/view/h;->N:Ljava/lang/String;

    .line 68
    .line 69
    iget-object v13, v9, Lio/flutter/view/h;->p:Ljava/lang/String;

    .line 70
    .line 71
    iput-object v13, v9, Lio/flutter/view/h;->O:Ljava/lang/String;

    .line 72
    .line 73
    iget-wide v12, v9, Lio/flutter/view/h;->c:J

    .line 74
    .line 75
    iput-wide v12, v9, Lio/flutter/view/h;->I:J

    .line 76
    .line 77
    iget v12, v9, Lio/flutter/view/h;->d:I

    .line 78
    .line 79
    iput v12, v9, Lio/flutter/view/h;->J:I

    .line 80
    .line 81
    iget v12, v9, Lio/flutter/view/h;->g:I

    .line 82
    .line 83
    iput v12, v9, Lio/flutter/view/h;->K:I

    .line 84
    .line 85
    iget v12, v9, Lio/flutter/view/h;->h:I

    .line 86
    .line 87
    iput v12, v9, Lio/flutter/view/h;->L:I

    .line 88
    .line 89
    iget v12, v9, Lio/flutter/view/h;->l:F

    .line 90
    .line 91
    iput v12, v9, Lio/flutter/view/h;->M:F

    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getLong()J

    .line 94
    .line 95
    .line 96
    move-result-wide v12

    .line 97
    iput-wide v12, v9, Lio/flutter/view/h;->c:J

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 100
    .line 101
    .line 102
    move-result v12

    .line 103
    iput v12, v9, Lio/flutter/view/h;->d:I

    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 106
    .line 107
    .line 108
    move-result v12

    .line 109
    iput v12, v9, Lio/flutter/view/h;->e:I

    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 112
    .line 113
    .line 114
    move-result v12

    .line 115
    iput v12, v9, Lio/flutter/view/h;->f:I

    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 118
    .line 119
    .line 120
    move-result v12

    .line 121
    iput v12, v9, Lio/flutter/view/h;->g:I

    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 124
    .line 125
    .line 126
    move-result v12

    .line 127
    iput v12, v9, Lio/flutter/view/h;->h:I

    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 130
    .line 131
    .line 132
    move-result v12

    .line 133
    iput v12, v9, Lio/flutter/view/h;->i:I

    .line 134
    .line 135
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 136
    .line 137
    .line 138
    move-result v12

    .line 139
    iput v12, v9, Lio/flutter/view/h;->j:I

    .line 140
    .line 141
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 142
    .line 143
    .line 144
    move-result v12

    .line 145
    iput v12, v9, Lio/flutter/view/h;->k:I

    .line 146
    .line 147
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getFloat()F

    .line 151
    .line 152
    .line 153
    move-result v12

    .line 154
    iput v12, v9, Lio/flutter/view/h;->l:F

    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getFloat()F

    .line 157
    .line 158
    .line 159
    move-result v12

    .line 160
    iput v12, v9, Lio/flutter/view/h;->m:F

    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getFloat()F

    .line 163
    .line 164
    .line 165
    move-result v12

    .line 166
    iput v12, v9, Lio/flutter/view/h;->n:F

    .line 167
    .line 168
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 169
    .line 170
    .line 171
    move-result v12

    .line 172
    iput v12, v9, Lio/flutter/view/h;->E:I

    .line 173
    .line 174
    invoke-static/range {p1 .. p2}, Lio/flutter/view/i;->d(Ljava/nio/ByteBuffer;[Ljava/lang/String;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v12

    .line 178
    iput-object v12, v9, Lio/flutter/view/h;->o:Ljava/lang/String;

    .line 179
    .line 180
    invoke-static/range {p1 .. p2}, Lio/flutter/view/i;->d(Ljava/nio/ByteBuffer;[Ljava/lang/String;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v12

    .line 184
    iput-object v12, v9, Lio/flutter/view/h;->p:Ljava/lang/String;

    .line 185
    .line 186
    invoke-static {v0, v1}, Lio/flutter/view/h;->f(Ljava/nio/ByteBuffer;[Ljava/nio/ByteBuffer;)Ljava/util/ArrayList;

    .line 187
    .line 188
    .line 189
    move-result-object v12

    .line 190
    iput-object v12, v9, Lio/flutter/view/h;->q:Ljava/util/ArrayList;

    .line 191
    .line 192
    invoke-static/range {p1 .. p2}, Lio/flutter/view/i;->d(Ljava/nio/ByteBuffer;[Ljava/lang/String;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v12

    .line 196
    iput-object v12, v9, Lio/flutter/view/h;->r:Ljava/lang/String;

    .line 197
    .line 198
    invoke-static {v0, v1}, Lio/flutter/view/h;->f(Ljava/nio/ByteBuffer;[Ljava/nio/ByteBuffer;)Ljava/util/ArrayList;

    .line 199
    .line 200
    .line 201
    move-result-object v12

    .line 202
    iput-object v12, v9, Lio/flutter/view/h;->s:Ljava/util/List;

    .line 203
    .line 204
    invoke-static/range {p1 .. p2}, Lio/flutter/view/i;->d(Ljava/nio/ByteBuffer;[Ljava/lang/String;)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v12

    .line 208
    iput-object v12, v9, Lio/flutter/view/h;->t:Ljava/lang/String;

    .line 209
    .line 210
    invoke-static {v0, v1}, Lio/flutter/view/h;->f(Ljava/nio/ByteBuffer;[Ljava/nio/ByteBuffer;)Ljava/util/ArrayList;

    .line 211
    .line 212
    .line 213
    move-result-object v12

    .line 214
    iput-object v12, v9, Lio/flutter/view/h;->u:Ljava/util/ArrayList;

    .line 215
    .line 216
    invoke-static/range {p1 .. p2}, Lio/flutter/view/i;->d(Ljava/nio/ByteBuffer;[Ljava/lang/String;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v12

    .line 220
    iput-object v12, v9, Lio/flutter/view/h;->v:Ljava/lang/String;

    .line 221
    .line 222
    invoke-static {v0, v1}, Lio/flutter/view/h;->f(Ljava/nio/ByteBuffer;[Ljava/nio/ByteBuffer;)Ljava/util/ArrayList;

    .line 223
    .line 224
    .line 225
    move-result-object v12

    .line 226
    iput-object v12, v9, Lio/flutter/view/h;->w:Ljava/util/ArrayList;

    .line 227
    .line 228
    invoke-static/range {p1 .. p2}, Lio/flutter/view/i;->d(Ljava/nio/ByteBuffer;[Ljava/lang/String;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v12

    .line 232
    iput-object v12, v9, Lio/flutter/view/h;->x:Ljava/lang/String;

    .line 233
    .line 234
    invoke-static {v0, v1}, Lio/flutter/view/h;->f(Ljava/nio/ByteBuffer;[Ljava/nio/ByteBuffer;)Ljava/util/ArrayList;

    .line 235
    .line 236
    .line 237
    move-result-object v12

    .line 238
    iput-object v12, v9, Lio/flutter/view/h;->y:Ljava/util/ArrayList;

    .line 239
    .line 240
    invoke-static/range {p1 .. p2}, Lio/flutter/view/i;->d(Ljava/nio/ByteBuffer;[Ljava/lang/String;)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v12

    .line 244
    iput-object v12, v9, Lio/flutter/view/h;->z:Ljava/lang/String;

    .line 245
    .line 246
    invoke-static/range {p1 .. p2}, Lio/flutter/view/i;->d(Ljava/nio/ByteBuffer;[Ljava/lang/String;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v12

    .line 250
    iput-object v12, v9, Lio/flutter/view/h;->A:Ljava/lang/String;

    .line 251
    .line 252
    invoke-static/range {p1 .. p2}, Lio/flutter/view/i;->d(Ljava/nio/ByteBuffer;[Ljava/lang/String;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v12

    .line 256
    iput-object v12, v9, Lio/flutter/view/h;->B:Ljava/lang/String;

    .line 257
    .line 258
    invoke-static/range {p1 .. p2}, Lio/flutter/view/i;->d(Ljava/nio/ByteBuffer;[Ljava/lang/String;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v12

    .line 262
    iput-object v12, v9, Lio/flutter/view/h;->C:Ljava/lang/String;

    .line 263
    .line 264
    invoke-static/range {p1 .. p2}, Lio/flutter/view/i;->d(Ljava/nio/ByteBuffer;[Ljava/lang/String;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v12

    .line 268
    iput-object v12, v9, Lio/flutter/view/h;->D:Ljava/lang/String;

    .line 269
    .line 270
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 271
    .line 272
    .line 273
    move-result v12

    .line 274
    iput v12, v9, Lio/flutter/view/h;->F:I

    .line 275
    .line 276
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 277
    .line 278
    .line 279
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getFloat()F

    .line 280
    .line 281
    .line 282
    move-result v12

    .line 283
    iput v12, v9, Lio/flutter/view/h;->P:F

    .line 284
    .line 285
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getFloat()F

    .line 286
    .line 287
    .line 288
    move-result v12

    .line 289
    iput v12, v9, Lio/flutter/view/h;->Q:F

    .line 290
    .line 291
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getFloat()F

    .line 292
    .line 293
    .line 294
    move-result v12

    .line 295
    iput v12, v9, Lio/flutter/view/h;->R:F

    .line 296
    .line 297
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getFloat()F

    .line 298
    .line 299
    .line 300
    move-result v12

    .line 301
    iput v12, v9, Lio/flutter/view/h;->S:F

    .line 302
    .line 303
    iget-object v12, v9, Lio/flutter/view/h;->T:[F

    .line 304
    .line 305
    if-nez v12, :cond_1

    .line 306
    .line 307
    new-array v12, v11, [F

    .line 308
    .line 309
    :cond_1
    const/4 v13, 0x0

    .line 310
    :goto_2
    if-ge v13, v11, :cond_2

    .line 311
    .line 312
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getFloat()F

    .line 313
    .line 314
    .line 315
    move-result v18

    .line 316
    aput v18, v12, v13

    .line 317
    .line 318
    add-int/lit8 v13, v13, 0x1

    .line 319
    .line 320
    goto :goto_2

    .line 321
    :cond_2
    iput-object v12, v9, Lio/flutter/view/h;->T:[F

    .line 322
    .line 323
    iget-object v12, v9, Lio/flutter/view/h;->U:[F

    .line 324
    .line 325
    if-nez v12, :cond_3

    .line 326
    .line 327
    new-array v12, v11, [F

    .line 328
    .line 329
    :cond_3
    const/4 v13, 0x0

    .line 330
    :goto_3
    if-ge v13, v11, :cond_4

    .line 331
    .line 332
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getFloat()F

    .line 333
    .line 334
    .line 335
    move-result v18

    .line 336
    aput v18, v12, v13

    .line 337
    .line 338
    add-int/lit8 v13, v13, 0x1

    .line 339
    .line 340
    goto :goto_3

    .line 341
    :cond_4
    iput-object v12, v9, Lio/flutter/view/h;->U:[F

    .line 342
    .line 343
    const/4 v11, 0x1

    .line 344
    iput-boolean v11, v9, Lio/flutter/view/h;->b0:Z

    .line 345
    .line 346
    iput-boolean v11, v9, Lio/flutter/view/h;->d0:Z

    .line 347
    .line 348
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 349
    .line 350
    .line 351
    move-result v11

    .line 352
    iget-object v12, v9, Lio/flutter/view/h;->W:Ljava/util/ArrayList;

    .line 353
    .line 354
    invoke-virtual {v12}, Ljava/util/ArrayList;->clear()V

    .line 355
    .line 356
    .line 357
    const/4 v13, 0x0

    .line 358
    :goto_4
    if-ge v13, v11, :cond_5

    .line 359
    .line 360
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 361
    .line 362
    .line 363
    move-result v10

    .line 364
    invoke-virtual {v14, v10}, Lio/flutter/view/i;->c(I)Lio/flutter/view/h;

    .line 365
    .line 366
    .line 367
    move-result-object v10

    .line 368
    iput-object v9, v10, Lio/flutter/view/h;->V:Lio/flutter/view/h;

    .line 369
    .line 370
    invoke-virtual {v12, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 371
    .line 372
    .line 373
    add-int/lit8 v13, v13, 0x1

    .line 374
    .line 375
    goto :goto_4

    .line 376
    :cond_5
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 377
    .line 378
    .line 379
    move-result v10

    .line 380
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 381
    .line 382
    .line 383
    const/4 v11, 0x0

    .line 384
    :goto_5
    if-ge v11, v10, :cond_6

    .line 385
    .line 386
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 387
    .line 388
    .line 389
    move-result v12

    .line 390
    invoke-virtual {v14, v12}, Lio/flutter/view/i;->c(I)Lio/flutter/view/h;

    .line 391
    .line 392
    .line 393
    move-result-object v12

    .line 394
    iput-object v9, v12, Lio/flutter/view/h;->V:Lio/flutter/view/h;

    .line 395
    .line 396
    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    add-int/lit8 v11, v11, 0x1

    .line 400
    .line 401
    goto :goto_5

    .line 402
    :cond_6
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 403
    .line 404
    .line 405
    move-result v3

    .line 406
    if-nez v3, :cond_8

    .line 407
    .line 408
    iput-object v15, v9, Lio/flutter/view/h;->Y:Ljava/util/ArrayList;

    .line 409
    .line 410
    :cond_7
    const/16 v3, 0xe

    .line 411
    .line 412
    goto :goto_9

    .line 413
    :cond_8
    iget-object v10, v9, Lio/flutter/view/h;->Y:Ljava/util/ArrayList;

    .line 414
    .line 415
    if-nez v10, :cond_9

    .line 416
    .line 417
    new-instance v10, Ljava/util/ArrayList;

    .line 418
    .line 419
    invoke-direct {v10, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 420
    .line 421
    .line 422
    iput-object v10, v9, Lio/flutter/view/h;->Y:Ljava/util/ArrayList;

    .line 423
    .line 424
    goto :goto_6

    .line 425
    :cond_9
    invoke-virtual {v10}, Ljava/util/ArrayList;->clear()V

    .line 426
    .line 427
    .line 428
    :goto_6
    const/4 v10, 0x0

    .line 429
    :goto_7
    if-ge v10, v3, :cond_7

    .line 430
    .line 431
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 432
    .line 433
    .line 434
    move-result v11

    .line 435
    invoke-virtual {v14, v11}, Lio/flutter/view/i;->b(I)Lio/flutter/view/g;

    .line 436
    .line 437
    .line 438
    move-result-object v11

    .line 439
    iget v12, v11, Lio/flutter/view/g;->c:I

    .line 440
    .line 441
    const/4 v13, 0x1

    .line 442
    if-ne v12, v13, :cond_a

    .line 443
    .line 444
    iput-object v11, v9, Lio/flutter/view/h;->Z:Lio/flutter/view/g;

    .line 445
    .line 446
    goto :goto_8

    .line 447
    :cond_a
    const/4 v13, 0x2

    .line 448
    if-ne v12, v13, :cond_b

    .line 449
    .line 450
    iput-object v11, v9, Lio/flutter/view/h;->a0:Lio/flutter/view/g;

    .line 451
    .line 452
    goto :goto_8

    .line 453
    :cond_b
    iget-object v12, v9, Lio/flutter/view/h;->Y:Ljava/util/ArrayList;

    .line 454
    .line 455
    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 456
    .line 457
    .line 458
    :goto_8
    iget-object v12, v9, Lio/flutter/view/h;->Y:Ljava/util/ArrayList;

    .line 459
    .line 460
    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    add-int/lit8 v10, v10, 0x1

    .line 464
    .line 465
    goto :goto_7

    .line 466
    :goto_9
    invoke-virtual {v9, v3}, Lio/flutter/view/h;->h(I)Z

    .line 467
    .line 468
    .line 469
    move-result v3

    .line 470
    if-eqz v3, :cond_c

    .line 471
    .line 472
    goto/16 :goto_1

    .line 473
    .line 474
    :cond_c
    const/4 v3, 0x6

    .line 475
    invoke-virtual {v9, v3}, Lio/flutter/view/h;->h(I)Z

    .line 476
    .line 477
    .line 478
    move-result v3

    .line 479
    if-eqz v3, :cond_d

    .line 480
    .line 481
    iput-object v9, v2, Lio/flutter/view/i;->n:Lio/flutter/view/h;

    .line 482
    .line 483
    :cond_d
    iget-boolean v3, v9, Lio/flutter/view/h;->H:Z

    .line 484
    .line 485
    if-eqz v3, :cond_e

    .line 486
    .line 487
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 488
    .line 489
    .line 490
    :cond_e
    iget v3, v9, Lio/flutter/view/h;->i:I

    .line 491
    .line 492
    const/4 v10, -0x1

    .line 493
    if-eq v3, v10, :cond_f

    .line 494
    .line 495
    invoke-interface {v6, v3}, Lio/flutter/plugin/platform/k;->g(I)Z

    .line 496
    .line 497
    .line 498
    move-result v3

    .line 499
    if-nez v3, :cond_f

    .line 500
    .line 501
    iget v3, v9, Lio/flutter/view/h;->i:I

    .line 502
    .line 503
    invoke-interface {v6, v3}, Lio/flutter/plugin/platform/k;->l(I)Landroid/view/View;

    .line 504
    .line 505
    .line 506
    move-result-object v3

    .line 507
    if-eqz v3, :cond_f

    .line 508
    .line 509
    const/4 v9, 0x0

    .line 510
    invoke-virtual {v3, v9}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 511
    .line 512
    .line 513
    goto/16 :goto_1

    .line 514
    .line 515
    :cond_f
    const/4 v9, 0x0

    .line 516
    goto/16 :goto_1

    .line 517
    .line 518
    :cond_10
    const/4 v9, 0x0

    .line 519
    new-instance v0, Ljava/util/HashSet;

    .line 520
    .line 521
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 522
    .line 523
    .line 524
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 525
    .line 526
    .line 527
    move-result-object v1

    .line 528
    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object v1

    .line 532
    check-cast v1, Lio/flutter/view/h;

    .line 533
    .line 534
    new-instance v3, Ljava/util/ArrayList;

    .line 535
    .line 536
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 537
    .line 538
    .line 539
    if-eqz v1, :cond_11

    .line 540
    .line 541
    new-array v10, v11, [F

    .line 542
    .line 543
    invoke-static {v10, v9}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    .line 544
    .line 545
    .line 546
    invoke-virtual {v1, v10, v0, v9}, Lio/flutter/view/h;->l([FLjava/util/HashSet;Z)V

    .line 547
    .line 548
    .line 549
    invoke-virtual {v1, v3}, Lio/flutter/view/h;->c(Ljava/util/ArrayList;)V

    .line 550
    .line 551
    .line 552
    :cond_11
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 553
    .line 554
    .line 555
    move-result v1

    .line 556
    move-object v10, v15

    .line 557
    const/4 v9, 0x0

    .line 558
    :cond_12
    :goto_a
    if-ge v9, v1, :cond_13

    .line 559
    .line 560
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object v12

    .line 564
    add-int/lit8 v9, v9, 0x1

    .line 565
    .line 566
    check-cast v12, Lio/flutter/view/h;

    .line 567
    .line 568
    iget v13, v12, Lio/flutter/view/h;->b:I

    .line 569
    .line 570
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 571
    .line 572
    .line 573
    move-result-object v13

    .line 574
    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 575
    .line 576
    .line 577
    move-result v13

    .line 578
    if-nez v13, :cond_12

    .line 579
    .line 580
    move-object v10, v12

    .line 581
    goto :goto_a

    .line 582
    :cond_13
    if-nez v10, :cond_14

    .line 583
    .line 584
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 585
    .line 586
    .line 587
    move-result v1

    .line 588
    if-nez v1, :cond_14

    .line 589
    .line 590
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 591
    .line 592
    .line 593
    move-result v1

    .line 594
    const/16 v17, 0x1

    .line 595
    .line 596
    add-int/lit8 v1, v1, -0x1

    .line 597
    .line 598
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    move-result-object v1

    .line 602
    move-object v10, v1

    .line 603
    check-cast v10, Lio/flutter/view/h;

    .line 604
    .line 605
    :cond_14
    if-eqz v10, :cond_18

    .line 606
    .line 607
    iget v1, v10, Lio/flutter/view/h;->b:I

    .line 608
    .line 609
    iget v9, v2, Lio/flutter/view/i;->r:I

    .line 610
    .line 611
    if-ne v1, v9, :cond_15

    .line 612
    .line 613
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 614
    .line 615
    .line 616
    move-result v1

    .line 617
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 618
    .line 619
    .line 620
    move-result v9

    .line 621
    if-eq v1, v9, :cond_18

    .line 622
    .line 623
    :cond_15
    iget v1, v10, Lio/flutter/view/h;->b:I

    .line 624
    .line 625
    iput v1, v2, Lio/flutter/view/i;->r:I

    .line 626
    .line 627
    invoke-virtual {v10}, Lio/flutter/view/h;->e()Ljava/lang/String;

    .line 628
    .line 629
    .line 630
    move-result-object v1

    .line 631
    if-nez v1, :cond_16

    .line 632
    .line 633
    const-string v1, " "

    .line 634
    .line 635
    :cond_16
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 636
    .line 637
    const/16 v12, 0x1c

    .line 638
    .line 639
    if-lt v9, v12, :cond_17

    .line 640
    .line 641
    iget-object v9, v2, Lio/flutter/view/i;->a:Landroid/view/View;

    .line 642
    .line 643
    invoke-static {v9, v1}, LB/b;->o(Landroid/view/View;Ljava/lang/String;)V

    .line 644
    .line 645
    .line 646
    goto :goto_b

    .line 647
    :cond_17
    iget v9, v10, Lio/flutter/view/h;->b:I

    .line 648
    .line 649
    const/16 v10, 0x20

    .line 650
    .line 651
    invoke-virtual {v2, v9, v10}, Lio/flutter/view/i;->e(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 652
    .line 653
    .line 654
    move-result-object v9

    .line 655
    invoke-virtual {v9}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 656
    .line 657
    .line 658
    move-result-object v10

    .line 659
    invoke-interface {v10, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 660
    .line 661
    .line 662
    invoke-virtual {v2, v9}, Lio/flutter/view/i;->i(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 663
    .line 664
    .line 665
    :cond_18
    :goto_b
    invoke-virtual {v7}, Ljava/util/ArrayList;->clear()V

    .line 666
    .line 667
    .line 668
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 669
    .line 670
    .line 671
    move-result v1

    .line 672
    const/4 v9, 0x0

    .line 673
    :goto_c
    if-ge v9, v1, :cond_19

    .line 674
    .line 675
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 676
    .line 677
    .line 678
    move-result-object v10

    .line 679
    add-int/lit8 v9, v9, 0x1

    .line 680
    .line 681
    check-cast v10, Lio/flutter/view/h;

    .line 682
    .line 683
    iget v10, v10, Lio/flutter/view/h;->b:I

    .line 684
    .line 685
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 686
    .line 687
    .line 688
    move-result-object v10

    .line 689
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 690
    .line 691
    .line 692
    goto :goto_c

    .line 693
    :cond_19
    invoke-virtual {v5}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 694
    .line 695
    .line 696
    move-result-object v1

    .line 697
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 698
    .line 699
    .line 700
    move-result-object v1

    .line 701
    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 702
    .line 703
    .line 704
    move-result v3

    .line 705
    const/4 v5, 0x4

    .line 706
    if-eqz v3, :cond_20

    .line 707
    .line 708
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 709
    .line 710
    .line 711
    move-result-object v3

    .line 712
    check-cast v3, Ljava/util/Map$Entry;

    .line 713
    .line 714
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 715
    .line 716
    .line 717
    move-result-object v3

    .line 718
    check-cast v3, Lio/flutter/view/h;

    .line 719
    .line 720
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 721
    .line 722
    .line 723
    move-result v7

    .line 724
    if-nez v7, :cond_1f

    .line 725
    .line 726
    iput-object v15, v3, Lio/flutter/view/h;->V:Lio/flutter/view/h;

    .line 727
    .line 728
    iget v7, v3, Lio/flutter/view/h;->i:I

    .line 729
    .line 730
    const/high16 v9, 0x10000

    .line 731
    .line 732
    const/4 v10, -0x1

    .line 733
    if-eq v7, v10, :cond_1a

    .line 734
    .line 735
    iget-object v7, v2, Lio/flutter/view/i;->j:Ljava/lang/Integer;

    .line 736
    .line 737
    if-eqz v7, :cond_1a

    .line 738
    .line 739
    iget-object v10, v2, Lio/flutter/view/i;->d:Lio/flutter/view/AccessibilityViewEmbedder;

    .line 740
    .line 741
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 742
    .line 743
    .line 744
    move-result v7

    .line 745
    invoke-virtual {v10, v7}, Lio/flutter/view/AccessibilityViewEmbedder;->platformViewOfNode(I)Landroid/view/View;

    .line 746
    .line 747
    .line 748
    move-result-object v7

    .line 749
    iget v10, v3, Lio/flutter/view/h;->i:I

    .line 750
    .line 751
    invoke-interface {v6, v10}, Lio/flutter/plugin/platform/k;->l(I)Landroid/view/View;

    .line 752
    .line 753
    .line 754
    move-result-object v10

    .line 755
    if-ne v7, v10, :cond_1a

    .line 756
    .line 757
    iget-object v7, v2, Lio/flutter/view/i;->j:Ljava/lang/Integer;

    .line 758
    .line 759
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 760
    .line 761
    .line 762
    move-result v7

    .line 763
    invoke-virtual {v2, v7, v9}, Lio/flutter/view/i;->h(II)V

    .line 764
    .line 765
    .line 766
    iput-object v15, v2, Lio/flutter/view/i;->j:Ljava/lang/Integer;

    .line 767
    .line 768
    :cond_1a
    iget v7, v3, Lio/flutter/view/h;->i:I

    .line 769
    .line 770
    const/4 v10, -0x1

    .line 771
    if-eq v7, v10, :cond_1b

    .line 772
    .line 773
    invoke-interface {v6, v7}, Lio/flutter/plugin/platform/k;->l(I)Landroid/view/View;

    .line 774
    .line 775
    .line 776
    move-result-object v7

    .line 777
    if-eqz v7, :cond_1b

    .line 778
    .line 779
    invoke-virtual {v7, v5}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 780
    .line 781
    .line 782
    :cond_1b
    iget-object v5, v2, Lio/flutter/view/i;->i:Lio/flutter/view/h;

    .line 783
    .line 784
    if-ne v5, v3, :cond_1c

    .line 785
    .line 786
    iget v5, v5, Lio/flutter/view/h;->b:I

    .line 787
    .line 788
    invoke-virtual {v2, v5, v9}, Lio/flutter/view/i;->h(II)V

    .line 789
    .line 790
    .line 791
    iput-object v15, v2, Lio/flutter/view/i;->i:Lio/flutter/view/h;

    .line 792
    .line 793
    :cond_1c
    iget-object v5, v2, Lio/flutter/view/i;->n:Lio/flutter/view/h;

    .line 794
    .line 795
    if-ne v5, v3, :cond_1d

    .line 796
    .line 797
    iput-object v15, v2, Lio/flutter/view/i;->n:Lio/flutter/view/h;

    .line 798
    .line 799
    :cond_1d
    iget-object v5, v2, Lio/flutter/view/i;->p:Lio/flutter/view/h;

    .line 800
    .line 801
    if-ne v5, v3, :cond_1e

    .line 802
    .line 803
    iput-object v15, v2, Lio/flutter/view/i;->p:Lio/flutter/view/h;

    .line 804
    .line 805
    :cond_1e
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 806
    .line 807
    .line 808
    goto :goto_d

    .line 809
    :cond_1f
    const/4 v10, -0x1

    .line 810
    goto :goto_d

    .line 811
    :cond_20
    const/16 v0, 0x800

    .line 812
    .line 813
    const/4 v9, 0x0

    .line 814
    invoke-virtual {v2, v9, v0}, Lio/flutter/view/i;->e(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 815
    .line 816
    .line 817
    move-result-object v1

    .line 818
    const/4 v13, 0x1

    .line 819
    invoke-virtual {v1, v13}, Landroid/view/accessibility/AccessibilityEvent;->setContentChangeTypes(I)V

    .line 820
    .line 821
    .line 822
    invoke-virtual {v2, v1}, Lio/flutter/view/i;->i(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 823
    .line 824
    .line 825
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 826
    .line 827
    .line 828
    move-result v1

    .line 829
    move v3, v9

    .line 830
    :goto_e
    if-ge v3, v1, :cond_44

    .line 831
    .line 832
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 833
    .line 834
    .line 835
    move-result-object v6

    .line 836
    add-int/lit8 v3, v3, 0x1

    .line 837
    .line 838
    check-cast v6, Lio/flutter/view/h;

    .line 839
    .line 840
    iget v7, v6, Lio/flutter/view/h;->l:F

    .line 841
    .line 842
    invoke-static {v7}, Ljava/lang/Float;->isNaN(F)Z

    .line 843
    .line 844
    .line 845
    move-result v7

    .line 846
    if-nez v7, :cond_2c

    .line 847
    .line 848
    iget v7, v6, Lio/flutter/view/h;->M:F

    .line 849
    .line 850
    invoke-static {v7}, Ljava/lang/Float;->isNaN(F)Z

    .line 851
    .line 852
    .line 853
    move-result v7

    .line 854
    if-nez v7, :cond_2c

    .line 855
    .line 856
    iget v7, v6, Lio/flutter/view/h;->M:F

    .line 857
    .line 858
    iget v10, v6, Lio/flutter/view/h;->l:F

    .line 859
    .line 860
    cmpl-float v7, v7, v10

    .line 861
    .line 862
    if-eqz v7, :cond_2c

    .line 863
    .line 864
    iget v7, v6, Lio/flutter/view/h;->b:I

    .line 865
    .line 866
    const/16 v10, 0x1000

    .line 867
    .line 868
    invoke-virtual {v2, v7, v10}, Lio/flutter/view/i;->e(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 869
    .line 870
    .line 871
    move-result-object v7

    .line 872
    iget v10, v6, Lio/flutter/view/h;->l:F

    .line 873
    .line 874
    iget v12, v6, Lio/flutter/view/h;->m:F

    .line 875
    .line 876
    invoke-static {v12}, Ljava/lang/Float;->isInfinite(F)Z

    .line 877
    .line 878
    .line 879
    move-result v13

    .line 880
    const v14, 0x47c35000    # 100000.0f

    .line 881
    .line 882
    .line 883
    if-eqz v13, :cond_22

    .line 884
    .line 885
    const v12, 0x4788b800    # 70000.0f

    .line 886
    .line 887
    .line 888
    cmpl-float v13, v10, v12

    .line 889
    .line 890
    if-lez v13, :cond_21

    .line 891
    .line 892
    move v10, v12

    .line 893
    :cond_21
    move v12, v14

    .line 894
    :cond_22
    iget v13, v6, Lio/flutter/view/h;->n:F

    .line 895
    .line 896
    invoke-static {v13}, Ljava/lang/Float;->isInfinite(F)Z

    .line 897
    .line 898
    .line 899
    move-result v13

    .line 900
    if-eqz v13, :cond_24

    .line 901
    .line 902
    add-float/2addr v12, v14

    .line 903
    const v13, -0x38774800    # -70000.0f

    .line 904
    .line 905
    .line 906
    cmpg-float v16, v10, v13

    .line 907
    .line 908
    if-gez v16, :cond_23

    .line 909
    .line 910
    move v10, v13

    .line 911
    :cond_23
    add-float/2addr v10, v14

    .line 912
    goto :goto_f

    .line 913
    :cond_24
    iget v13, v6, Lio/flutter/view/h;->n:F

    .line 914
    .line 915
    sub-float/2addr v12, v13

    .line 916
    sub-float/2addr v10, v13

    .line 917
    :goto_f
    iget v13, v6, Lio/flutter/view/h;->J:I

    .line 918
    .line 919
    and-int/lit8 v14, v13, 0x10

    .line 920
    .line 921
    if-eqz v14, :cond_25

    .line 922
    .line 923
    goto :goto_10

    .line 924
    :cond_25
    and-int/lit8 v14, v13, 0x20

    .line 925
    .line 926
    if-eqz v14, :cond_26

    .line 927
    .line 928
    :goto_10
    float-to-int v10, v10

    .line 929
    invoke-virtual {v7, v10}, Landroid/view/accessibility/AccessibilityRecord;->setScrollY(I)V

    .line 930
    .line 931
    .line 932
    float-to-int v10, v12

    .line 933
    invoke-virtual {v7, v10}, Landroid/view/accessibility/AccessibilityRecord;->setMaxScrollY(I)V

    .line 934
    .line 935
    .line 936
    goto :goto_12

    .line 937
    :cond_26
    and-int/lit8 v14, v13, 0x4

    .line 938
    .line 939
    if-eqz v14, :cond_27

    .line 940
    .line 941
    goto :goto_11

    .line 942
    :cond_27
    and-int/lit8 v13, v13, 0x8

    .line 943
    .line 944
    if-eqz v13, :cond_28

    .line 945
    .line 946
    :goto_11
    float-to-int v10, v10

    .line 947
    invoke-virtual {v7, v10}, Landroid/view/accessibility/AccessibilityRecord;->setScrollX(I)V

    .line 948
    .line 949
    .line 950
    float-to-int v10, v12

    .line 951
    invoke-virtual {v7, v10}, Landroid/view/accessibility/AccessibilityRecord;->setMaxScrollX(I)V

    .line 952
    .line 953
    .line 954
    :cond_28
    :goto_12
    iget v10, v6, Lio/flutter/view/h;->j:I

    .line 955
    .line 956
    if-lez v10, :cond_2b

    .line 957
    .line 958
    invoke-virtual {v7, v10}, Landroid/view/accessibility/AccessibilityRecord;->setItemCount(I)V

    .line 959
    .line 960
    .line 961
    iget v10, v6, Lio/flutter/view/h;->k:I

    .line 962
    .line 963
    invoke-virtual {v7, v10}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 964
    .line 965
    .line 966
    iget-object v10, v6, Lio/flutter/view/h;->X:Ljava/util/ArrayList;

    .line 967
    .line 968
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 969
    .line 970
    .line 971
    move-result v12

    .line 972
    move v13, v9

    .line 973
    move v14, v13

    .line 974
    :goto_13
    if-ge v14, v12, :cond_2a

    .line 975
    .line 976
    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 977
    .line 978
    .line 979
    move-result-object v16

    .line 980
    add-int/lit8 v14, v14, 0x1

    .line 981
    .line 982
    move-object/from16 v9, v16

    .line 983
    .line 984
    check-cast v9, Lio/flutter/view/h;

    .line 985
    .line 986
    const/16 v15, 0xe

    .line 987
    .line 988
    invoke-virtual {v9, v15}, Lio/flutter/view/h;->h(I)Z

    .line 989
    .line 990
    .line 991
    move-result v9

    .line 992
    if-nez v9, :cond_29

    .line 993
    .line 994
    add-int/lit8 v13, v13, 0x1

    .line 995
    .line 996
    :cond_29
    const/4 v9, 0x0

    .line 997
    const/4 v15, 0x0

    .line 998
    goto :goto_13

    .line 999
    :cond_2a
    const/16 v15, 0xe

    .line 1000
    .line 1001
    iget v9, v6, Lio/flutter/view/h;->k:I

    .line 1002
    .line 1003
    add-int/2addr v9, v13

    .line 1004
    const/16 v17, 0x1

    .line 1005
    .line 1006
    add-int/lit8 v9, v9, -0x1

    .line 1007
    .line 1008
    invoke-virtual {v7, v9}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    .line 1009
    .line 1010
    .line 1011
    goto :goto_14

    .line 1012
    :cond_2b
    const/16 v15, 0xe

    .line 1013
    .line 1014
    :goto_14
    invoke-virtual {v2, v7}, Lio/flutter/view/i;->i(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 1015
    .line 1016
    .line 1017
    goto :goto_15

    .line 1018
    :cond_2c
    const/16 v15, 0xe

    .line 1019
    .line 1020
    :goto_15
    invoke-virtual {v6, v11}, Lio/flutter/view/h;->h(I)Z

    .line 1021
    .line 1022
    .line 1023
    move-result v7

    .line 1024
    if-eqz v7, :cond_2f

    .line 1025
    .line 1026
    iget-object v7, v6, Lio/flutter/view/h;->p:Ljava/lang/String;

    .line 1027
    .line 1028
    if-nez v7, :cond_2d

    .line 1029
    .line 1030
    iget-object v9, v6, Lio/flutter/view/h;->O:Ljava/lang/String;

    .line 1031
    .line 1032
    if-nez v9, :cond_2d

    .line 1033
    .line 1034
    goto :goto_16

    .line 1035
    :cond_2d
    if-eqz v7, :cond_2e

    .line 1036
    .line 1037
    iget-object v9, v6, Lio/flutter/view/h;->O:Ljava/lang/String;

    .line 1038
    .line 1039
    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1040
    .line 1041
    .line 1042
    move-result v7

    .line 1043
    if-nez v7, :cond_2f

    .line 1044
    .line 1045
    :cond_2e
    iget v7, v6, Lio/flutter/view/h;->b:I

    .line 1046
    .line 1047
    invoke-virtual {v2, v7, v0}, Lio/flutter/view/i;->e(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v7

    .line 1051
    const/4 v13, 0x1

    .line 1052
    invoke-virtual {v7, v13}, Landroid/view/accessibility/AccessibilityEvent;->setContentChangeTypes(I)V

    .line 1053
    .line 1054
    .line 1055
    invoke-virtual {v2, v7}, Lio/flutter/view/i;->i(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 1056
    .line 1057
    .line 1058
    :cond_2f
    :goto_16
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1059
    .line 1060
    const/16 v9, 0x24

    .line 1061
    .line 1062
    const/16 v10, 0x2000

    .line 1063
    .line 1064
    if-lt v7, v9, :cond_32

    .line 1065
    .line 1066
    iget-boolean v7, v6, Lio/flutter/view/h;->H:Z

    .line 1067
    .line 1068
    if-nez v7, :cond_30

    .line 1069
    .line 1070
    goto :goto_17

    .line 1071
    :cond_30
    const/4 v13, 0x2

    .line 1072
    invoke-virtual {v6, v13}, Lio/flutter/view/h;->h(I)Z

    .line 1073
    .line 1074
    .line 1075
    move-result v7

    .line 1076
    invoke-virtual {v6, v13}, Lio/flutter/view/h;->g(I)Z

    .line 1077
    .line 1078
    .line 1079
    move-result v9

    .line 1080
    if-ne v7, v9, :cond_31

    .line 1081
    .line 1082
    const/16 v7, 0x1a

    .line 1083
    .line 1084
    invoke-virtual {v6, v7}, Lio/flutter/view/h;->h(I)Z

    .line 1085
    .line 1086
    .line 1087
    move-result v9

    .line 1088
    invoke-virtual {v6, v7}, Lio/flutter/view/h;->g(I)Z

    .line 1089
    .line 1090
    .line 1091
    move-result v7

    .line 1092
    if-ne v9, v7, :cond_31

    .line 1093
    .line 1094
    const/16 v7, 0x12

    .line 1095
    .line 1096
    invoke-virtual {v6, v7}, Lio/flutter/view/h;->h(I)Z

    .line 1097
    .line 1098
    .line 1099
    move-result v9

    .line 1100
    invoke-virtual {v6, v7}, Lio/flutter/view/h;->g(I)Z

    .line 1101
    .line 1102
    .line 1103
    move-result v7

    .line 1104
    if-eq v9, v7, :cond_33

    .line 1105
    .line 1106
    :cond_31
    iget v7, v6, Lio/flutter/view/h;->b:I

    .line 1107
    .line 1108
    invoke-virtual {v2, v7, v0}, Lio/flutter/view/i;->e(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v7

    .line 1112
    invoke-virtual {v7, v10}, Landroid/view/accessibility/AccessibilityEvent;->setContentChangeTypes(I)V

    .line 1113
    .line 1114
    .line 1115
    invoke-virtual {v2, v7}, Lio/flutter/view/i;->i(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 1116
    .line 1117
    .line 1118
    goto :goto_18

    .line 1119
    :cond_32
    :goto_17
    const/4 v13, 0x2

    .line 1120
    :cond_33
    :goto_18
    iget-object v7, v2, Lio/flutter/view/i;->i:Lio/flutter/view/h;

    .line 1121
    .line 1122
    if-eqz v7, :cond_34

    .line 1123
    .line 1124
    iget v7, v7, Lio/flutter/view/h;->b:I

    .line 1125
    .line 1126
    iget v9, v6, Lio/flutter/view/h;->b:I

    .line 1127
    .line 1128
    if-ne v7, v9, :cond_34

    .line 1129
    .line 1130
    const/4 v7, 0x3

    .line 1131
    invoke-virtual {v6, v7}, Lio/flutter/view/h;->g(I)Z

    .line 1132
    .line 1133
    .line 1134
    move-result v9

    .line 1135
    if-nez v9, :cond_34

    .line 1136
    .line 1137
    invoke-virtual {v6, v7}, Lio/flutter/view/h;->h(I)Z

    .line 1138
    .line 1139
    .line 1140
    move-result v7

    .line 1141
    if-eqz v7, :cond_34

    .line 1142
    .line 1143
    iget v7, v6, Lio/flutter/view/h;->b:I

    .line 1144
    .line 1145
    invoke-virtual {v2, v7, v5}, Lio/flutter/view/i;->e(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v7

    .line 1149
    invoke-virtual {v7}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v9

    .line 1153
    iget-object v12, v6, Lio/flutter/view/h;->p:Ljava/lang/String;

    .line 1154
    .line 1155
    invoke-interface {v9, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1156
    .line 1157
    .line 1158
    invoke-virtual {v2, v7}, Lio/flutter/view/i;->i(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 1159
    .line 1160
    .line 1161
    :cond_34
    iget-object v7, v2, Lio/flutter/view/i;->n:Lio/flutter/view/h;

    .line 1162
    .line 1163
    if-eqz v7, :cond_37

    .line 1164
    .line 1165
    iget v9, v7, Lio/flutter/view/h;->b:I

    .line 1166
    .line 1167
    iget v12, v6, Lio/flutter/view/h;->b:I

    .line 1168
    .line 1169
    if-ne v9, v12, :cond_37

    .line 1170
    .line 1171
    iget-object v14, v2, Lio/flutter/view/i;->o:Lio/flutter/view/h;

    .line 1172
    .line 1173
    if-eqz v14, :cond_35

    .line 1174
    .line 1175
    iget v14, v14, Lio/flutter/view/h;->b:I

    .line 1176
    .line 1177
    if-eq v14, v9, :cond_37

    .line 1178
    .line 1179
    :cond_35
    iput-object v7, v2, Lio/flutter/view/i;->o:Lio/flutter/view/h;

    .line 1180
    .line 1181
    const/16 v7, 0x8

    .line 1182
    .line 1183
    invoke-virtual {v2, v12, v7}, Lio/flutter/view/i;->e(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v7

    .line 1187
    invoke-virtual {v2, v7}, Lio/flutter/view/i;->i(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 1188
    .line 1189
    .line 1190
    :cond_36
    const/4 v7, 0x0

    .line 1191
    goto :goto_19

    .line 1192
    :cond_37
    if-nez v7, :cond_36

    .line 1193
    .line 1194
    const/4 v7, 0x0

    .line 1195
    iput-object v7, v2, Lio/flutter/view/i;->o:Lio/flutter/view/h;

    .line 1196
    .line 1197
    :goto_19
    iget-object v9, v2, Lio/flutter/view/i;->n:Lio/flutter/view/h;

    .line 1198
    .line 1199
    if-eqz v9, :cond_38

    .line 1200
    .line 1201
    iget v9, v9, Lio/flutter/view/h;->b:I

    .line 1202
    .line 1203
    iget v12, v6, Lio/flutter/view/h;->b:I

    .line 1204
    .line 1205
    if-ne v9, v12, :cond_38

    .line 1206
    .line 1207
    const/4 v9, 0x5

    .line 1208
    invoke-virtual {v6, v9}, Lio/flutter/view/h;->g(I)Z

    .line 1209
    .line 1210
    .line 1211
    move-result v12

    .line 1212
    if-eqz v12, :cond_38

    .line 1213
    .line 1214
    invoke-virtual {v6, v9}, Lio/flutter/view/h;->h(I)Z

    .line 1215
    .line 1216
    .line 1217
    move-result v9

    .line 1218
    if-eqz v9, :cond_38

    .line 1219
    .line 1220
    iget-object v9, v2, Lio/flutter/view/i;->i:Lio/flutter/view/h;

    .line 1221
    .line 1222
    if-eqz v9, :cond_39

    .line 1223
    .line 1224
    iget v9, v9, Lio/flutter/view/h;->b:I

    .line 1225
    .line 1226
    iget-object v12, v2, Lio/flutter/view/i;->n:Lio/flutter/view/h;

    .line 1227
    .line 1228
    iget v12, v12, Lio/flutter/view/h;->b:I

    .line 1229
    .line 1230
    if-ne v9, v12, :cond_38

    .line 1231
    .line 1232
    goto :goto_1a

    .line 1233
    :cond_38
    const/16 v17, 0x1

    .line 1234
    .line 1235
    goto/16 :goto_21

    .line 1236
    .line 1237
    :cond_39
    :goto_1a
    iget-object v9, v6, Lio/flutter/view/h;->N:Ljava/lang/String;

    .line 1238
    .line 1239
    const-string v12, ""

    .line 1240
    .line 1241
    if-eqz v9, :cond_3a

    .line 1242
    .line 1243
    goto :goto_1b

    .line 1244
    :cond_3a
    move-object v9, v12

    .line 1245
    :goto_1b
    iget-object v14, v6, Lio/flutter/view/h;->r:Ljava/lang/String;

    .line 1246
    .line 1247
    if-eqz v14, :cond_3b

    .line 1248
    .line 1249
    move-object v12, v14

    .line 1250
    :cond_3b
    iget v14, v6, Lio/flutter/view/h;->b:I

    .line 1251
    .line 1252
    invoke-virtual {v2, v14, v11}, Lio/flutter/view/i;->e(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v14

    .line 1256
    invoke-virtual {v14, v9}, Landroid/view/accessibility/AccessibilityRecord;->setBeforeText(Ljava/lang/CharSequence;)V

    .line 1257
    .line 1258
    .line 1259
    invoke-virtual {v14}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v0

    .line 1263
    invoke-interface {v0, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1264
    .line 1265
    .line 1266
    const/4 v0, 0x0

    .line 1267
    :goto_1c
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 1268
    .line 1269
    .line 1270
    move-result v5

    .line 1271
    if-ge v0, v5, :cond_3d

    .line 1272
    .line 1273
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 1274
    .line 1275
    .line 1276
    move-result v5

    .line 1277
    if-ge v0, v5, :cond_3d

    .line 1278
    .line 1279
    invoke-virtual {v9, v0}, Ljava/lang/String;->charAt(I)C

    .line 1280
    .line 1281
    .line 1282
    move-result v5

    .line 1283
    invoke-virtual {v12, v0}, Ljava/lang/String;->charAt(I)C

    .line 1284
    .line 1285
    .line 1286
    move-result v7

    .line 1287
    if-eq v5, v7, :cond_3c

    .line 1288
    .line 1289
    goto :goto_1d

    .line 1290
    :cond_3c
    add-int/lit8 v0, v0, 0x1

    .line 1291
    .line 1292
    const/4 v7, 0x0

    .line 1293
    goto :goto_1c

    .line 1294
    :cond_3d
    :goto_1d
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 1295
    .line 1296
    .line 1297
    move-result v5

    .line 1298
    if-lt v0, v5, :cond_3e

    .line 1299
    .line 1300
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 1301
    .line 1302
    .line 1303
    move-result v5

    .line 1304
    if-lt v0, v5, :cond_3e

    .line 1305
    .line 1306
    const/4 v14, 0x0

    .line 1307
    const/16 v17, 0x1

    .line 1308
    .line 1309
    goto :goto_20

    .line 1310
    :cond_3e
    invoke-virtual {v14, v0}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 1311
    .line 1312
    .line 1313
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 1314
    .line 1315
    .line 1316
    move-result v5

    .line 1317
    const/16 v17, 0x1

    .line 1318
    .line 1319
    add-int/lit8 v5, v5, -0x1

    .line 1320
    .line 1321
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 1322
    .line 1323
    .line 1324
    move-result v7

    .line 1325
    add-int/lit8 v7, v7, -0x1

    .line 1326
    .line 1327
    :goto_1e
    if-lt v5, v0, :cond_40

    .line 1328
    .line 1329
    if-lt v7, v0, :cond_40

    .line 1330
    .line 1331
    invoke-virtual {v9, v5}, Ljava/lang/String;->charAt(I)C

    .line 1332
    .line 1333
    .line 1334
    move-result v11

    .line 1335
    invoke-virtual {v12, v7}, Ljava/lang/String;->charAt(I)C

    .line 1336
    .line 1337
    .line 1338
    move-result v13

    .line 1339
    if-eq v11, v13, :cond_3f

    .line 1340
    .line 1341
    goto :goto_1f

    .line 1342
    :cond_3f
    add-int/lit8 v5, v5, -0x1

    .line 1343
    .line 1344
    add-int/lit8 v7, v7, -0x1

    .line 1345
    .line 1346
    const/16 v11, 0x10

    .line 1347
    .line 1348
    const/4 v13, 0x2

    .line 1349
    goto :goto_1e

    .line 1350
    :cond_40
    :goto_1f
    sub-int/2addr v5, v0

    .line 1351
    const/16 v17, 0x1

    .line 1352
    .line 1353
    add-int/lit8 v5, v5, 0x1

    .line 1354
    .line 1355
    invoke-virtual {v14, v5}, Landroid/view/accessibility/AccessibilityRecord;->setRemovedCount(I)V

    .line 1356
    .line 1357
    .line 1358
    sub-int/2addr v7, v0

    .line 1359
    add-int/lit8 v7, v7, 0x1

    .line 1360
    .line 1361
    invoke-virtual {v14, v7}, Landroid/view/accessibility/AccessibilityRecord;->setAddedCount(I)V

    .line 1362
    .line 1363
    .line 1364
    :goto_20
    if-eqz v14, :cond_41

    .line 1365
    .line 1366
    invoke-virtual {v2, v14}, Lio/flutter/view/i;->i(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 1367
    .line 1368
    .line 1369
    :cond_41
    iget v0, v6, Lio/flutter/view/h;->K:I

    .line 1370
    .line 1371
    iget v5, v6, Lio/flutter/view/h;->g:I

    .line 1372
    .line 1373
    if-ne v0, v5, :cond_42

    .line 1374
    .line 1375
    iget v0, v6, Lio/flutter/view/h;->L:I

    .line 1376
    .line 1377
    iget v5, v6, Lio/flutter/view/h;->h:I

    .line 1378
    .line 1379
    if-eq v0, v5, :cond_43

    .line 1380
    .line 1381
    :cond_42
    iget v0, v6, Lio/flutter/view/h;->b:I

    .line 1382
    .line 1383
    invoke-virtual {v2, v0, v10}, Lio/flutter/view/i;->e(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 1384
    .line 1385
    .line 1386
    move-result-object v0

    .line 1387
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 1388
    .line 1389
    .line 1390
    move-result-object v5

    .line 1391
    invoke-interface {v5, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1392
    .line 1393
    .line 1394
    iget v5, v6, Lio/flutter/view/h;->g:I

    .line 1395
    .line 1396
    invoke-virtual {v0, v5}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 1397
    .line 1398
    .line 1399
    iget v5, v6, Lio/flutter/view/h;->h:I

    .line 1400
    .line 1401
    invoke-virtual {v0, v5}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    .line 1402
    .line 1403
    .line 1404
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 1405
    .line 1406
    .line 1407
    move-result v5

    .line 1408
    invoke-virtual {v0, v5}, Landroid/view/accessibility/AccessibilityRecord;->setItemCount(I)V

    .line 1409
    .line 1410
    .line 1411
    invoke-virtual {v2, v0}, Lio/flutter/view/i;->i(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 1412
    .line 1413
    .line 1414
    :cond_43
    :goto_21
    const/16 v0, 0x800

    .line 1415
    .line 1416
    const/4 v5, 0x4

    .line 1417
    const/4 v9, 0x0

    .line 1418
    const/16 v11, 0x10

    .line 1419
    .line 1420
    const/4 v15, 0x0

    .line 1421
    goto/16 :goto_e

    .line 1422
    .line 1423
    :cond_44
    return-void
.end method

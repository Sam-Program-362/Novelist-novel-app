.class public final LV/e0;
.super LT1/h;
.source "SourceFile"

# interfaces
.implements LZ1/p;


# instance fields
.field public o:LV/K;

.field public p:I

.field public final synthetic q:LB1/s;


# direct methods
.method public constructor <init>(LB1/s;LR1/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV/e0;->q:LB1/s;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, LT1/h;-><init>(ILR1/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Li2/s;

    .line 2
    .line 3
    check-cast p2, LR1/c;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, LV/e0;->i(LR1/c;Ljava/lang/Object;)LR1/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LV/e0;

    .line 10
    .line 11
    sget-object p2, LO1/g;->a:LO1/g;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LV/e0;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final i(LR1/c;Ljava/lang/Object;)LR1/c;
    .locals 1

    .line 1
    new-instance p2, LV/e0;

    .line 2
    .line 3
    iget-object v0, p0, LV/e0;->q:LB1/s;

    .line 4
    .line 5
    invoke-direct {p2, v0, p1}, LV/e0;-><init>(LB1/s;LR1/c;)V

    .line 6
    .line 7
    .line 8
    return-object p2
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, LV/e0;->p:I

    .line 4
    .line 5
    const/4 v3, 0x2

    .line 6
    const/4 v4, 0x1

    .line 7
    iget-object v5, v1, LV/e0;->q:LB1/s;

    .line 8
    .line 9
    sget-object v6, LS1/a;->k:LS1/a;

    .line 10
    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    if-eq v0, v4, :cond_1

    .line 14
    .line 15
    if-ne v0, v3, :cond_0

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    move v4, v3

    .line 21
    move-object v0, v5

    .line 22
    const/4 v3, 0x0

    .line 23
    goto/16 :goto_d

    .line 24
    .line 25
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v0

    .line 33
    :cond_1
    iget-object v0, v1, LV/e0;->o:LV/K;

    .line 34
    .line 35
    invoke-static/range {p1 .. p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    move-object/from16 v2, p1

    .line 39
    .line 40
    move-object/from16 v16, v5

    .line 41
    .line 42
    :cond_2
    const/4 v3, 0x0

    .line 43
    goto/16 :goto_b

    .line 44
    .line 45
    :cond_3
    invoke-static/range {p1 .. p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, v5, LB1/s;->n:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, LB1/g;

    .line 51
    .line 52
    iget-object v0, v0, LB1/g;->l:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-lez v0, :cond_19

    .line 61
    .line 62
    :goto_0
    iget-object v0, v5, LB1/s;->k:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Li2/s;

    .line 65
    .line 66
    invoke-interface {v0}, Li2/s;->d()LR1/h;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    sget-object v7, Li2/r;->l:Li2/r;

    .line 71
    .line 72
    invoke-interface {v0, v7}, LR1/h;->e(LR1/g;)LR1/f;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, Li2/N;

    .line 77
    .line 78
    if-eqz v0, :cond_5

    .line 79
    .line 80
    invoke-interface {v0}, Li2/N;->a()Z

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    if-eqz v7, :cond_4

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_4
    check-cast v0, Li2/W;

    .line 88
    .line 89
    invoke-virtual {v0}, Li2/W;->w()Ljava/util/concurrent/CancellationException;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    throw v0

    .line 94
    :cond_5
    :goto_1
    iget-object v0, v5, LB1/s;->l:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, LV/K;

    .line 97
    .line 98
    iget-object v7, v5, LB1/s;->m:Ljava/lang/Object;

    .line 99
    .line 100
    move-object v8, v7

    .line 101
    check-cast v8, Lk2/c;

    .line 102
    .line 103
    iput-object v0, v1, LV/e0;->o:LV/K;

    .line 104
    .line 105
    iput v4, v1, LV/e0;->p:I

    .line 106
    .line 107
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    sget-object v7, Lk2/c;->l:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 111
    .line 112
    sget-object v14, Lk2/c;->m:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 113
    .line 114
    sget-object v15, Lk2/c;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 115
    .line 116
    invoke-virtual {v15, v8}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v9

    .line 120
    check-cast v9, Lk2/k;

    .line 121
    .line 122
    :goto_2
    invoke-virtual {v7, v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 123
    .line 124
    .line 125
    move-result-wide v10

    .line 126
    invoke-virtual {v8, v10, v11, v4}, Lk2/c;->r(JZ)Z

    .line 127
    .line 128
    .line 129
    move-result v10

    .line 130
    if-nez v10, :cond_18

    .line 131
    .line 132
    invoke-virtual {v14, v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 133
    .line 134
    .line 135
    move-result-wide v11

    .line 136
    sget v10, Lk2/e;->b:I

    .line 137
    .line 138
    int-to-long v2, v10

    .line 139
    move-object/from16 v16, v5

    .line 140
    .line 141
    div-long v4, v11, v2

    .line 142
    .line 143
    rem-long v2, v11, v2

    .line 144
    .line 145
    long-to-int v10, v2

    .line 146
    iget-wide v2, v9, Ln2/r;->c:J

    .line 147
    .line 148
    cmp-long v2, v2, v4

    .line 149
    .line 150
    if-eqz v2, :cond_8

    .line 151
    .line 152
    invoke-virtual {v8, v4, v5, v9}, Lk2/c;->l(JLk2/k;)Lk2/k;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    if-nez v2, :cond_7

    .line 157
    .line 158
    :cond_6
    :goto_3
    move-object/from16 v5, v16

    .line 159
    .line 160
    const/4 v3, 0x2

    .line 161
    const/4 v4, 0x1

    .line 162
    goto :goto_2

    .line 163
    :cond_7
    move-object v9, v2

    .line 164
    :cond_8
    const/4 v13, 0x0

    .line 165
    invoke-virtual/range {v8 .. v13}, Lk2/c;->A(Lk2/k;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    sget-object v3, Lk2/e;->m:LB1/g;

    .line 170
    .line 171
    const-string v4, "unexpected"

    .line 172
    .line 173
    if-eq v2, v3, :cond_17

    .line 174
    .line 175
    sget-object v5, Lk2/e;->o:LB1/g;

    .line 176
    .line 177
    if-ne v2, v5, :cond_9

    .line 178
    .line 179
    invoke-virtual {v8}, Lk2/c;->p()J

    .line 180
    .line 181
    .line 182
    move-result-wide v2

    .line 183
    cmp-long v2, v11, v2

    .line 184
    .line 185
    if-gez v2, :cond_6

    .line 186
    .line 187
    invoke-virtual {v9}, Ln2/b;->a()V

    .line 188
    .line 189
    .line 190
    goto :goto_3

    .line 191
    :cond_9
    sget-object v13, Lk2/e;->n:LB1/g;

    .line 192
    .line 193
    if-ne v2, v13, :cond_14

    .line 194
    .line 195
    invoke-static {v1}, LH2/h;->s(LR1/c;)LR1/c;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    invoke-static {v2}, Li2/u;->d(LR1/c;)Li2/g;

    .line 200
    .line 201
    .line 202
    move-result-object v13

    .line 203
    :try_start_0
    invoke-virtual/range {v8 .. v13}, Lk2/c;->A(Lk2/k;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    if-ne v2, v3, :cond_a

    .line 208
    .line 209
    invoke-virtual {v13, v9, v10}, Li2/g;->a(Ln2/r;I)V

    .line 210
    .line 211
    .line 212
    goto/16 :goto_8

    .line 213
    .line 214
    :catchall_0
    move-exception v0

    .line 215
    goto/16 :goto_9

    .line 216
    .line 217
    :cond_a
    if-ne v2, v5, :cond_13

    .line 218
    .line 219
    invoke-virtual {v8}, Lk2/c;->p()J

    .line 220
    .line 221
    .line 222
    move-result-wide v2

    .line 223
    cmp-long v2, v11, v2

    .line 224
    .line 225
    if-gez v2, :cond_b

    .line 226
    .line 227
    invoke-virtual {v9}, Ln2/b;->a()V

    .line 228
    .line 229
    .line 230
    :cond_b
    invoke-virtual {v15, v8}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    check-cast v2, Lk2/k;

    .line 235
    .line 236
    :goto_4
    invoke-virtual {v7, v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 237
    .line 238
    .line 239
    move-result-wide v9

    .line 240
    const/4 v3, 0x1

    .line 241
    invoke-virtual {v8, v9, v10, v3}, Lk2/c;->r(JZ)Z

    .line 242
    .line 243
    .line 244
    move-result v5

    .line 245
    if-eqz v5, :cond_c

    .line 246
    .line 247
    invoke-virtual {v8}, Lk2/c;->n()Ljava/lang/Throwable;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    invoke-static {v2}, LH2/h;->i(Ljava/lang/Throwable;)LO1/c;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    invoke-virtual {v13, v2}, Li2/g;->resumeWith(Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    goto/16 :goto_8

    .line 259
    .line 260
    :cond_c
    invoke-virtual {v14, v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 261
    .line 262
    .line 263
    move-result-wide v11

    .line 264
    sget v5, Lk2/e;->b:I

    .line 265
    .line 266
    int-to-long v9, v5

    .line 267
    move-object/from16 p1, v4

    .line 268
    .line 269
    div-long v3, v11, v9

    .line 270
    .line 271
    rem-long v9, v11, v9

    .line 272
    .line 273
    long-to-int v10, v9

    .line 274
    move v5, v10

    .line 275
    iget-wide v9, v2, Ln2/r;->c:J

    .line 276
    .line 277
    cmp-long v9, v9, v3

    .line 278
    .line 279
    if-eqz v9, :cond_e

    .line 280
    .line 281
    invoke-virtual {v8, v3, v4, v2}, Lk2/c;->l(JLk2/k;)Lk2/k;

    .line 282
    .line 283
    .line 284
    move-result-object v3

    .line 285
    if-nez v3, :cond_d

    .line 286
    .line 287
    move-object/from16 v4, p1

    .line 288
    .line 289
    goto :goto_4

    .line 290
    :cond_d
    move-object v9, v3

    .line 291
    :goto_5
    move v10, v5

    .line 292
    goto :goto_6

    .line 293
    :cond_e
    move-object v9, v2

    .line 294
    goto :goto_5

    .line 295
    :goto_6
    invoke-virtual/range {v8 .. v13}, Lk2/c;->A(Lk2/k;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    move-object v3, v9

    .line 300
    move v5, v10

    .line 301
    sget-object v4, Lk2/e;->m:LB1/g;

    .line 302
    .line 303
    if-ne v2, v4, :cond_f

    .line 304
    .line 305
    invoke-virtual {v13, v3, v5}, Li2/g;->a(Ln2/r;I)V

    .line 306
    .line 307
    .line 308
    goto :goto_8

    .line 309
    :cond_f
    sget-object v4, Lk2/e;->o:LB1/g;

    .line 310
    .line 311
    if-ne v2, v4, :cond_11

    .line 312
    .line 313
    invoke-virtual {v8}, Lk2/c;->p()J

    .line 314
    .line 315
    .line 316
    move-result-wide v4

    .line 317
    cmp-long v2, v11, v4

    .line 318
    .line 319
    if-gez v2, :cond_10

    .line 320
    .line 321
    invoke-virtual {v3}, Ln2/b;->a()V

    .line 322
    .line 323
    .line 324
    :cond_10
    move-object/from16 v4, p1

    .line 325
    .line 326
    move-object v2, v3

    .line 327
    goto :goto_4

    .line 328
    :cond_11
    sget-object v4, Lk2/e;->n:LB1/g;

    .line 329
    .line 330
    if-eq v2, v4, :cond_12

    .line 331
    .line 332
    invoke-virtual {v3}, Ln2/b;->a()V

    .line 333
    .line 334
    .line 335
    const/4 v3, 0x0

    .line 336
    :goto_7
    invoke-virtual {v13, v2, v3}, Li2/g;->z(Ljava/lang/Object;LZ1/q;)V

    .line 337
    .line 338
    .line 339
    goto :goto_8

    .line 340
    :cond_12
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 341
    .line 342
    move-object/from16 v2, p1

    .line 343
    .line 344
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    throw v0

    .line 348
    :cond_13
    invoke-virtual {v9}, Ln2/b;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 349
    .line 350
    .line 351
    const/4 v3, 0x0

    .line 352
    goto :goto_7

    .line 353
    :goto_8
    invoke-virtual {v13}, Li2/g;->r()Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v2

    .line 357
    goto :goto_a

    .line 358
    :goto_9
    invoke-virtual {v13}, Li2/g;->y()V

    .line 359
    .line 360
    .line 361
    throw v0

    .line 362
    :cond_14
    invoke-virtual {v9}, Ln2/b;->a()V

    .line 363
    .line 364
    .line 365
    :goto_a
    if-ne v2, v6, :cond_2

    .line 366
    .line 367
    goto :goto_c

    .line 368
    :goto_b
    iput-object v3, v1, LV/e0;->o:LV/K;

    .line 369
    .line 370
    const/4 v4, 0x2

    .line 371
    iput v4, v1, LV/e0;->p:I

    .line 372
    .line 373
    invoke-interface {v0, v2, v1}, LZ1/p;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    if-ne v0, v6, :cond_15

    .line 378
    .line 379
    :goto_c
    return-object v6

    .line 380
    :cond_15
    move-object/from16 v0, v16

    .line 381
    .line 382
    :goto_d
    iget-object v2, v0, LB1/s;->n:Ljava/lang/Object;

    .line 383
    .line 384
    check-cast v2, LB1/g;

    .line 385
    .line 386
    iget-object v2, v2, LB1/g;->l:Ljava/lang/Object;

    .line 387
    .line 388
    check-cast v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 389
    .line 390
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 391
    .line 392
    .line 393
    move-result v2

    .line 394
    if-nez v2, :cond_16

    .line 395
    .line 396
    sget-object v0, LO1/g;->a:LO1/g;

    .line 397
    .line 398
    return-object v0

    .line 399
    :cond_16
    move-object v5, v0

    .line 400
    move v3, v4

    .line 401
    const/4 v4, 0x1

    .line 402
    goto/16 :goto_0

    .line 403
    .line 404
    :cond_17
    move-object v2, v4

    .line 405
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 406
    .line 407
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 408
    .line 409
    .line 410
    throw v0

    .line 411
    :cond_18
    invoke-virtual {v8}, Lk2/c;->n()Ljava/lang/Throwable;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    sget v2, Ln2/s;->a:I

    .line 416
    .line 417
    throw v0

    .line 418
    :cond_19
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 419
    .line 420
    const-string v2, "Check failed."

    .line 421
    .line 422
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    throw v0
.end method

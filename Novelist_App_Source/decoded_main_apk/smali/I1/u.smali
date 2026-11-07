.class public LI1/u;
.super LC1/q;
.source "SourceFile"


# instance fields
.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LI1/u;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget v3, v0, LI1/u;->d:I

    .line 8
    .line 9
    packed-switch v3, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    const-string v3, "buffer"

    .line 13
    .line 14
    invoke-static {v2, v3}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/16 v3, -0x7f

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    if-ne v1, v3, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0, v2}, LC1/q;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ljava/lang/Long;

    .line 27
    .line 28
    if-eqz v1, :cond_b

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 31
    .line 32
    .line 33
    move-result-wide v1

    .line 34
    long-to-int v1, v1

    .line 35
    sget-object v2, LM1/t;->l:LB1/b;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-static {}, LM1/t;->values()[LM1/t;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    array-length v3, v2

    .line 45
    :goto_0
    if-ge v4, v3, :cond_b

    .line 46
    .line 47
    aget-object v5, v2, v4

    .line 48
    .line 49
    iget v6, v5, LM1/t;->k:I

    .line 50
    .line 51
    if-ne v6, v1, :cond_0

    .line 52
    .line 53
    goto/16 :goto_6

    .line 54
    .line 55
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    const/16 v3, -0x7e

    .line 59
    .line 60
    if-ne v1, v3, :cond_3

    .line 61
    .line 62
    invoke-virtual {v0, v2}, LC1/q;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    check-cast v1, Ljava/lang/Long;

    .line 67
    .line 68
    if-eqz v1, :cond_b

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 71
    .line 72
    .line 73
    move-result-wide v1

    .line 74
    long-to-int v1, v1

    .line 75
    sget-object v2, LM1/k;->l:LB1/b;

    .line 76
    .line 77
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-static {}, LM1/k;->values()[LM1/k;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    array-length v3, v2

    .line 85
    :goto_1
    if-ge v4, v3, :cond_b

    .line 86
    .line 87
    aget-object v5, v2, v4

    .line 88
    .line 89
    iget v6, v5, LM1/k;->k:I

    .line 90
    .line 91
    if-ne v6, v1, :cond_2

    .line 92
    .line 93
    goto/16 :goto_6

    .line 94
    .line 95
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_3
    const/16 v3, -0x7d

    .line 99
    .line 100
    if-ne v1, v3, :cond_5

    .line 101
    .line 102
    invoke-virtual {v0, v2}, LC1/q;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    check-cast v1, Ljava/lang/Long;

    .line 107
    .line 108
    if-eqz v1, :cond_b

    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 111
    .line 112
    .line 113
    move-result-wide v1

    .line 114
    long-to-int v1, v1

    .line 115
    sget-object v2, LM1/z;->l:LB1/b;

    .line 116
    .line 117
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-static {}, LM1/z;->values()[LM1/z;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    array-length v3, v2

    .line 125
    :goto_2
    if-ge v4, v3, :cond_b

    .line 126
    .line 127
    aget-object v5, v2, v4

    .line 128
    .line 129
    iget v6, v5, LM1/z;->k:I

    .line 130
    .line 131
    if-ne v6, v1, :cond_4

    .line 132
    .line 133
    goto/16 :goto_6

    .line 134
    .line 135
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_5
    const/16 v3, -0x7c

    .line 139
    .line 140
    if-ne v1, v3, :cond_7

    .line 141
    .line 142
    invoke-virtual {v0, v2}, LC1/q;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    check-cast v1, Ljava/lang/Long;

    .line 147
    .line 148
    if-eqz v1, :cond_b

    .line 149
    .line 150
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 151
    .line 152
    .line 153
    move-result-wide v1

    .line 154
    long-to-int v1, v1

    .line 155
    sget-object v2, LM1/S;->l:LM1/A;

    .line 156
    .line 157
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-static {}, LM1/S;->values()[LM1/S;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    array-length v3, v2

    .line 165
    :goto_3
    if-ge v4, v3, :cond_b

    .line 166
    .line 167
    aget-object v5, v2, v4

    .line 168
    .line 169
    iget v6, v5, LM1/S;->k:I

    .line 170
    .line 171
    if-ne v6, v1, :cond_6

    .line 172
    .line 173
    goto :goto_6

    .line 174
    :cond_6
    add-int/lit8 v4, v4, 0x1

    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_7
    const/16 v3, -0x7b

    .line 178
    .line 179
    if-ne v1, v3, :cond_9

    .line 180
    .line 181
    invoke-virtual {v0, v2}, LC1/q;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    check-cast v1, Ljava/lang/Long;

    .line 186
    .line 187
    if-eqz v1, :cond_b

    .line 188
    .line 189
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 190
    .line 191
    .line 192
    move-result-wide v1

    .line 193
    long-to-int v1, v1

    .line 194
    sget-object v2, LM1/y;->l:LB1/b;

    .line 195
    .line 196
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    invoke-static {}, LM1/y;->values()[LM1/y;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    array-length v3, v2

    .line 204
    :goto_4
    if-ge v4, v3, :cond_b

    .line 205
    .line 206
    aget-object v5, v2, v4

    .line 207
    .line 208
    iget v6, v5, LM1/y;->k:I

    .line 209
    .line 210
    if-ne v6, v1, :cond_8

    .line 211
    .line 212
    goto :goto_6

    .line 213
    :cond_8
    add-int/lit8 v4, v4, 0x1

    .line 214
    .line 215
    goto :goto_4

    .line 216
    :cond_9
    const/16 v3, -0x7a

    .line 217
    .line 218
    if-ne v1, v3, :cond_c

    .line 219
    .line 220
    invoke-virtual {v0, v2}, LC1/q;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    check-cast v1, Ljava/lang/Long;

    .line 225
    .line 226
    if-eqz v1, :cond_b

    .line 227
    .line 228
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 229
    .line 230
    .line 231
    move-result-wide v1

    .line 232
    long-to-int v1, v1

    .line 233
    sget-object v2, LM1/l0;->l:LM1/A;

    .line 234
    .line 235
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    invoke-static {}, LM1/l0;->values()[LM1/l0;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    array-length v3, v2

    .line 243
    :goto_5
    if-ge v4, v3, :cond_b

    .line 244
    .line 245
    aget-object v5, v2, v4

    .line 246
    .line 247
    iget v6, v5, LM1/l0;->k:I

    .line 248
    .line 249
    if-ne v6, v1, :cond_a

    .line 250
    .line 251
    goto :goto_6

    .line 252
    :cond_a
    add-int/lit8 v4, v4, 0x1

    .line 253
    .line 254
    goto :goto_5

    .line 255
    :cond_b
    const/4 v5, 0x0

    .line 256
    goto :goto_6

    .line 257
    :cond_c
    invoke-super/range {p0 .. p2}, LC1/q;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    :goto_6
    return-object v5

    .line 262
    :pswitch_0
    const-string v3, "buffer"

    .line 263
    .line 264
    invoke-static {v2, v3}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    const/16 v3, -0x7f

    .line 268
    .line 269
    const-string v4, "null cannot be cast to non-null type kotlin.Boolean"

    .line 270
    .line 271
    const/4 v5, 0x0

    .line 272
    const/4 v6, 0x0

    .line 273
    if-ne v1, v3, :cond_e

    .line 274
    .line 275
    invoke-virtual {v0, v2}, LC1/q;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    instance-of v2, v1, Ljava/util/List;

    .line 280
    .line 281
    if-eqz v2, :cond_d

    .line 282
    .line 283
    check-cast v1, Ljava/util/List;

    .line 284
    .line 285
    goto :goto_7

    .line 286
    :cond_d
    move-object v1, v6

    .line 287
    :goto_7
    if-eqz v1, :cond_11

    .line 288
    .line 289
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    invoke-static {v2, v4}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    check-cast v2, Ljava/lang/Boolean;

    .line 297
    .line 298
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 299
    .line 300
    .line 301
    move-result v2

    .line 302
    const/4 v3, 0x1

    .line 303
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v3

    .line 307
    invoke-static {v3, v4}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    check-cast v3, Ljava/lang/Boolean;

    .line 311
    .line 312
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 313
    .line 314
    .line 315
    move-result v3

    .line 316
    const/4 v4, 0x2

    .line 317
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    const-string v4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>"

    .line 322
    .line 323
    invoke-static {v1, v4}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    check-cast v1, Ljava/util/Map;

    .line 327
    .line 328
    new-instance v6, LL1/k;

    .line 329
    .line 330
    invoke-direct {v6, v2, v3, v1}, LL1/k;-><init>(ZZLjava/util/Map;)V

    .line 331
    .line 332
    .line 333
    goto :goto_9

    .line 334
    :cond_e
    const/16 v3, -0x7e

    .line 335
    .line 336
    if-ne v1, v3, :cond_10

    .line 337
    .line 338
    invoke-virtual {v0, v2}, LC1/q;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    instance-of v2, v1, Ljava/util/List;

    .line 343
    .line 344
    if-eqz v2, :cond_f

    .line 345
    .line 346
    check-cast v1, Ljava/util/List;

    .line 347
    .line 348
    goto :goto_8

    .line 349
    :cond_f
    move-object v1, v6

    .line 350
    :goto_8
    if-eqz v1, :cond_11

    .line 351
    .line 352
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v1

    .line 356
    invoke-static {v1, v4}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    check-cast v1, Ljava/lang/Boolean;

    .line 360
    .line 361
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 362
    .line 363
    .line 364
    move-result v1

    .line 365
    new-instance v6, LL1/a;

    .line 366
    .line 367
    invoke-direct {v6, v1}, LL1/a;-><init>(Z)V

    .line 368
    .line 369
    .line 370
    goto :goto_9

    .line 371
    :cond_10
    invoke-super/range {p0 .. p2}, LC1/q;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v6

    .line 375
    :cond_11
    :goto_9
    return-object v6

    .line 376
    :pswitch_1
    const-string v3, "buffer"

    .line 377
    .line 378
    invoke-static {v2, v3}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    invoke-super/range {p0 .. p2}, LC1/q;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v1

    .line 385
    return-object v1

    .line 386
    :pswitch_2
    const-string v3, "buffer"

    .line 387
    .line 388
    invoke-static {v2, v3}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    const/16 v3, -0x7f

    .line 392
    .line 393
    const/4 v4, 0x0

    .line 394
    const/4 v5, 0x0

    .line 395
    if-ne v1, v3, :cond_13

    .line 396
    .line 397
    invoke-virtual {v0, v2}, LC1/q;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v1

    .line 401
    check-cast v1, Ljava/lang/Long;

    .line 402
    .line 403
    if-eqz v1, :cond_18

    .line 404
    .line 405
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 406
    .line 407
    .line 408
    move-result-wide v1

    .line 409
    long-to-int v1, v1

    .line 410
    sget-object v2, LK1/N;->l:LB1/b;

    .line 411
    .line 412
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 413
    .line 414
    .line 415
    invoke-static {}, LK1/N;->values()[LK1/N;

    .line 416
    .line 417
    .line 418
    move-result-object v2

    .line 419
    array-length v3, v2

    .line 420
    :goto_a
    if-ge v4, v3, :cond_18

    .line 421
    .line 422
    aget-object v6, v2, v4

    .line 423
    .line 424
    iget v7, v6, LK1/N;->k:I

    .line 425
    .line 426
    if-ne v7, v1, :cond_12

    .line 427
    .line 428
    move-object v5, v6

    .line 429
    goto :goto_d

    .line 430
    :cond_12
    add-int/lit8 v4, v4, 0x1

    .line 431
    .line 432
    goto :goto_a

    .line 433
    :cond_13
    const/16 v3, -0x7e

    .line 434
    .line 435
    const/4 v6, 0x1

    .line 436
    if-ne v1, v3, :cond_15

    .line 437
    .line 438
    invoke-virtual {v0, v2}, LC1/q;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v1

    .line 442
    instance-of v2, v1, Ljava/util/List;

    .line 443
    .line 444
    if-eqz v2, :cond_14

    .line 445
    .line 446
    check-cast v1, Ljava/util/List;

    .line 447
    .line 448
    goto :goto_b

    .line 449
    :cond_14
    move-object v1, v5

    .line 450
    :goto_b
    if-eqz v1, :cond_18

    .line 451
    .line 452
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v2

    .line 456
    check-cast v2, Ljava/lang/String;

    .line 457
    .line 458
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v1

    .line 462
    const-string v3, "null cannot be cast to non-null type kotlin.Boolean"

    .line 463
    .line 464
    invoke-static {v1, v3}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 465
    .line 466
    .line 467
    check-cast v1, Ljava/lang/Boolean;

    .line 468
    .line 469
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 470
    .line 471
    .line 472
    move-result v1

    .line 473
    new-instance v5, LK1/h;

    .line 474
    .line 475
    invoke-direct {v5, v2, v1}, LK1/h;-><init>(Ljava/lang/String;Z)V

    .line 476
    .line 477
    .line 478
    goto :goto_d

    .line 479
    :cond_15
    const/16 v3, -0x7d

    .line 480
    .line 481
    if-ne v1, v3, :cond_17

    .line 482
    .line 483
    invoke-virtual {v0, v2}, LC1/q;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v1

    .line 487
    instance-of v2, v1, Ljava/util/List;

    .line 488
    .line 489
    if-eqz v2, :cond_16

    .line 490
    .line 491
    check-cast v1, Ljava/util/List;

    .line 492
    .line 493
    goto :goto_c

    .line 494
    :cond_16
    move-object v1, v5

    .line 495
    :goto_c
    if-eqz v1, :cond_18

    .line 496
    .line 497
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object v2

    .line 501
    check-cast v2, Ljava/lang/String;

    .line 502
    .line 503
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object v1

    .line 507
    const-string v3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.StringListLookupResultType"

    .line 508
    .line 509
    invoke-static {v1, v3}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 510
    .line 511
    .line 512
    check-cast v1, LK1/N;

    .line 513
    .line 514
    new-instance v5, LK1/P;

    .line 515
    .line 516
    invoke-direct {v5, v2, v1}, LK1/P;-><init>(Ljava/lang/String;LK1/N;)V

    .line 517
    .line 518
    .line 519
    goto :goto_d

    .line 520
    :cond_17
    invoke-super/range {p0 .. p2}, LC1/q;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    move-result-object v5

    .line 524
    :cond_18
    :goto_d
    return-object v5

    .line 525
    :pswitch_3
    const-string v3, "buffer"

    .line 526
    .line 527
    invoke-static {v2, v3}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 528
    .line 529
    .line 530
    const/16 v3, -0x7f

    .line 531
    .line 532
    const/4 v4, 0x0

    .line 533
    const/4 v5, 0x0

    .line 534
    if-ne v1, v3, :cond_1a

    .line 535
    .line 536
    invoke-virtual {v0, v2}, LC1/q;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v1

    .line 540
    check-cast v1, Ljava/lang/Long;

    .line 541
    .line 542
    if-eqz v1, :cond_2d

    .line 543
    .line 544
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 545
    .line 546
    .line 547
    move-result-wide v1

    .line 548
    long-to-int v1, v1

    .line 549
    sget-object v2, LJ1/s;->l:LB1/b;

    .line 550
    .line 551
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 552
    .line 553
    .line 554
    invoke-static {}, LJ1/s;->values()[LJ1/s;

    .line 555
    .line 556
    .line 557
    move-result-object v2

    .line 558
    array-length v3, v2

    .line 559
    :goto_e
    if-ge v4, v3, :cond_2d

    .line 560
    .line 561
    aget-object v6, v2, v4

    .line 562
    .line 563
    iget v7, v6, LJ1/s;->k:I

    .line 564
    .line 565
    if-ne v7, v1, :cond_19

    .line 566
    .line 567
    :goto_f
    move-object v5, v6

    .line 568
    goto/16 :goto_19

    .line 569
    .line 570
    :cond_19
    add-int/lit8 v4, v4, 0x1

    .line 571
    .line 572
    goto :goto_e

    .line 573
    :cond_1a
    const/16 v3, -0x7e

    .line 574
    .line 575
    if-ne v1, v3, :cond_1c

    .line 576
    .line 577
    invoke-virtual {v0, v2}, LC1/q;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 578
    .line 579
    .line 580
    move-result-object v1

    .line 581
    check-cast v1, Ljava/lang/Long;

    .line 582
    .line 583
    if-eqz v1, :cond_2d

    .line 584
    .line 585
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 586
    .line 587
    .line 588
    move-result-wide v1

    .line 589
    long-to-int v1, v1

    .line 590
    sget-object v2, LJ1/u;->l:LB1/b;

    .line 591
    .line 592
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 593
    .line 594
    .line 595
    invoke-static {}, LJ1/u;->values()[LJ1/u;

    .line 596
    .line 597
    .line 598
    move-result-object v2

    .line 599
    array-length v3, v2

    .line 600
    :goto_10
    if-ge v4, v3, :cond_2d

    .line 601
    .line 602
    aget-object v6, v2, v4

    .line 603
    .line 604
    iget v7, v6, LJ1/u;->k:I

    .line 605
    .line 606
    if-ne v7, v1, :cond_1b

    .line 607
    .line 608
    goto :goto_f

    .line 609
    :cond_1b
    add-int/lit8 v4, v4, 0x1

    .line 610
    .line 611
    goto :goto_10

    .line 612
    :cond_1c
    const/16 v3, -0x7d

    .line 613
    .line 614
    if-ne v1, v3, :cond_1e

    .line 615
    .line 616
    invoke-virtual {v0, v2}, LC1/q;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    move-result-object v1

    .line 620
    check-cast v1, Ljava/lang/Long;

    .line 621
    .line 622
    if-eqz v1, :cond_2d

    .line 623
    .line 624
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 625
    .line 626
    .line 627
    move-result-wide v1

    .line 628
    long-to-int v1, v1

    .line 629
    sget-object v2, LJ1/c;->l:LB1/b;

    .line 630
    .line 631
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 632
    .line 633
    .line 634
    invoke-static {}, LJ1/c;->values()[LJ1/c;

    .line 635
    .line 636
    .line 637
    move-result-object v2

    .line 638
    array-length v3, v2

    .line 639
    :goto_11
    if-ge v4, v3, :cond_2d

    .line 640
    .line 641
    aget-object v6, v2, v4

    .line 642
    .line 643
    iget v7, v6, LJ1/c;->k:I

    .line 644
    .line 645
    if-ne v7, v1, :cond_1d

    .line 646
    .line 647
    goto :goto_f

    .line 648
    :cond_1d
    add-int/lit8 v4, v4, 0x1

    .line 649
    .line 650
    goto :goto_11

    .line 651
    :cond_1e
    const/16 v3, -0x7c

    .line 652
    .line 653
    const/4 v6, 0x2

    .line 654
    const/4 v7, 0x1

    .line 655
    if-ne v1, v3, :cond_20

    .line 656
    .line 657
    invoke-virtual {v0, v2}, LC1/q;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 658
    .line 659
    .line 660
    move-result-object v1

    .line 661
    instance-of v2, v1, Ljava/util/List;

    .line 662
    .line 663
    if-eqz v2, :cond_1f

    .line 664
    .line 665
    check-cast v1, Ljava/util/List;

    .line 666
    .line 667
    goto :goto_12

    .line 668
    :cond_1f
    move-object v1, v5

    .line 669
    :goto_12
    if-eqz v1, :cond_2d

    .line 670
    .line 671
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 672
    .line 673
    .line 674
    move-result-object v2

    .line 675
    const-string v3, "null cannot be cast to non-null type kotlin.Boolean"

    .line 676
    .line 677
    invoke-static {v2, v3}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 678
    .line 679
    .line 680
    check-cast v2, Ljava/lang/Boolean;

    .line 681
    .line 682
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 683
    .line 684
    .line 685
    move-result v2

    .line 686
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 687
    .line 688
    .line 689
    move-result-object v4

    .line 690
    invoke-static {v4, v3}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 691
    .line 692
    .line 693
    check-cast v4, Ljava/lang/Boolean;

    .line 694
    .line 695
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 696
    .line 697
    .line 698
    move-result v3

    .line 699
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 700
    .line 701
    .line 702
    move-result-object v1

    .line 703
    check-cast v1, Ljava/lang/Long;

    .line 704
    .line 705
    new-instance v5, LJ1/e;

    .line 706
    .line 707
    invoke-direct {v5, v2, v3, v1}, LJ1/e;-><init>(ZZLjava/lang/Long;)V

    .line 708
    .line 709
    .line 710
    goto/16 :goto_19

    .line 711
    .line 712
    :cond_20
    const/16 v3, -0x7b

    .line 713
    .line 714
    if-ne v1, v3, :cond_22

    .line 715
    .line 716
    invoke-virtual {v0, v2}, LC1/q;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 717
    .line 718
    .line 719
    move-result-object v1

    .line 720
    instance-of v2, v1, Ljava/util/List;

    .line 721
    .line 722
    if-eqz v2, :cond_21

    .line 723
    .line 724
    check-cast v1, Ljava/util/List;

    .line 725
    .line 726
    goto :goto_13

    .line 727
    :cond_21
    move-object v1, v5

    .line 728
    :goto_13
    if-eqz v1, :cond_2d

    .line 729
    .line 730
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 731
    .line 732
    .line 733
    move-result-object v2

    .line 734
    check-cast v2, Ljava/lang/Double;

    .line 735
    .line 736
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 737
    .line 738
    .line 739
    move-result-object v3

    .line 740
    check-cast v3, Ljava/lang/Double;

    .line 741
    .line 742
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 743
    .line 744
    .line 745
    move-result-object v1

    .line 746
    const-string v4, "null cannot be cast to non-null type kotlin.Long"

    .line 747
    .line 748
    invoke-static {v1, v4}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 749
    .line 750
    .line 751
    check-cast v1, Ljava/lang/Long;

    .line 752
    .line 753
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 754
    .line 755
    .line 756
    move-result-wide v4

    .line 757
    new-instance v1, LJ1/q;

    .line 758
    .line 759
    invoke-direct {v1, v2, v3, v4, v5}, LJ1/q;-><init>(Ljava/lang/Double;Ljava/lang/Double;J)V

    .line 760
    .line 761
    .line 762
    move-object v5, v1

    .line 763
    goto/16 :goto_19

    .line 764
    .line 765
    :cond_22
    const/16 v3, -0x7a

    .line 766
    .line 767
    if-ne v1, v3, :cond_24

    .line 768
    .line 769
    invoke-virtual {v0, v2}, LC1/q;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 770
    .line 771
    .line 772
    move-result-object v1

    .line 773
    instance-of v2, v1, Ljava/util/List;

    .line 774
    .line 775
    if-eqz v2, :cond_23

    .line 776
    .line 777
    check-cast v1, Ljava/util/List;

    .line 778
    .line 779
    goto :goto_14

    .line 780
    :cond_23
    move-object v1, v5

    .line 781
    :goto_14
    if-eqz v1, :cond_2d

    .line 782
    .line 783
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 784
    .line 785
    .line 786
    move-result-object v1

    .line 787
    const-string v2, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.ImageSelectionOptions"

    .line 788
    .line 789
    invoke-static {v1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 790
    .line 791
    .line 792
    check-cast v1, LJ1/q;

    .line 793
    .line 794
    new-instance v5, LJ1/r;

    .line 795
    .line 796
    invoke-direct {v5, v1}, LJ1/r;-><init>(LJ1/q;)V

    .line 797
    .line 798
    .line 799
    goto/16 :goto_19

    .line 800
    .line 801
    :cond_24
    const/16 v3, -0x79

    .line 802
    .line 803
    if-ne v1, v3, :cond_26

    .line 804
    .line 805
    invoke-virtual {v0, v2}, LC1/q;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 806
    .line 807
    .line 808
    move-result-object v1

    .line 809
    instance-of v2, v1, Ljava/util/List;

    .line 810
    .line 811
    if-eqz v2, :cond_25

    .line 812
    .line 813
    check-cast v1, Ljava/util/List;

    .line 814
    .line 815
    goto :goto_15

    .line 816
    :cond_25
    move-object v1, v5

    .line 817
    :goto_15
    if-eqz v1, :cond_2d

    .line 818
    .line 819
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 820
    .line 821
    .line 822
    move-result-object v1

    .line 823
    check-cast v1, Ljava/lang/Long;

    .line 824
    .line 825
    new-instance v5, LJ1/v;

    .line 826
    .line 827
    invoke-direct {v5, v1}, LJ1/v;-><init>(Ljava/lang/Long;)V

    .line 828
    .line 829
    .line 830
    goto/16 :goto_19

    .line 831
    .line 832
    :cond_26
    const/16 v3, -0x78

    .line 833
    .line 834
    if-ne v1, v3, :cond_28

    .line 835
    .line 836
    invoke-virtual {v0, v2}, LC1/q;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 837
    .line 838
    .line 839
    move-result-object v1

    .line 840
    instance-of v2, v1, Ljava/util/List;

    .line 841
    .line 842
    if-eqz v2, :cond_27

    .line 843
    .line 844
    check-cast v1, Ljava/util/List;

    .line 845
    .line 846
    goto :goto_16

    .line 847
    :cond_27
    move-object v1, v5

    .line 848
    :goto_16
    if-eqz v1, :cond_2d

    .line 849
    .line 850
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 851
    .line 852
    .line 853
    move-result-object v2

    .line 854
    const-string v3, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.SourceType"

    .line 855
    .line 856
    invoke-static {v2, v3}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 857
    .line 858
    .line 859
    check-cast v2, LJ1/u;

    .line 860
    .line 861
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 862
    .line 863
    .line 864
    move-result-object v1

    .line 865
    check-cast v1, LJ1/s;

    .line 866
    .line 867
    new-instance v5, LJ1/t;

    .line 868
    .line 869
    invoke-direct {v5, v2, v1}, LJ1/t;-><init>(LJ1/u;LJ1/s;)V

    .line 870
    .line 871
    .line 872
    goto :goto_19

    .line 873
    :cond_28
    const/16 v3, -0x77

    .line 874
    .line 875
    if-ne v1, v3, :cond_2a

    .line 876
    .line 877
    invoke-virtual {v0, v2}, LC1/q;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 878
    .line 879
    .line 880
    move-result-object v1

    .line 881
    instance-of v2, v1, Ljava/util/List;

    .line 882
    .line 883
    if-eqz v2, :cond_29

    .line 884
    .line 885
    check-cast v1, Ljava/util/List;

    .line 886
    .line 887
    goto :goto_17

    .line 888
    :cond_29
    move-object v1, v5

    .line 889
    :goto_17
    if-eqz v1, :cond_2d

    .line 890
    .line 891
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 892
    .line 893
    .line 894
    move-result-object v2

    .line 895
    const-string v3, "null cannot be cast to non-null type kotlin.String"

    .line 896
    .line 897
    invoke-static {v2, v3}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 898
    .line 899
    .line 900
    check-cast v2, Ljava/lang/String;

    .line 901
    .line 902
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 903
    .line 904
    .line 905
    move-result-object v1

    .line 906
    check-cast v1, Ljava/lang/String;

    .line 907
    .line 908
    new-instance v5, LJ1/a;

    .line 909
    .line 910
    invoke-direct {v5, v2, v1}, LJ1/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 911
    .line 912
    .line 913
    goto :goto_19

    .line 914
    :cond_2a
    const/16 v3, -0x76

    .line 915
    .line 916
    if-ne v1, v3, :cond_2c

    .line 917
    .line 918
    invoke-virtual {v0, v2}, LC1/q;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 919
    .line 920
    .line 921
    move-result-object v1

    .line 922
    instance-of v2, v1, Ljava/util/List;

    .line 923
    .line 924
    if-eqz v2, :cond_2b

    .line 925
    .line 926
    check-cast v1, Ljava/util/List;

    .line 927
    .line 928
    goto :goto_18

    .line 929
    :cond_2b
    move-object v1, v5

    .line 930
    :goto_18
    if-eqz v1, :cond_2d

    .line 931
    .line 932
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 933
    .line 934
    .line 935
    move-result-object v2

    .line 936
    const-string v3, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.CacheRetrievalType"

    .line 937
    .line 938
    invoke-static {v2, v3}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 939
    .line 940
    .line 941
    check-cast v2, LJ1/c;

    .line 942
    .line 943
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 944
    .line 945
    .line 946
    move-result-object v3

    .line 947
    check-cast v3, LJ1/a;

    .line 948
    .line 949
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 950
    .line 951
    .line 952
    move-result-object v1

    .line 953
    const-string v4, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>"

    .line 954
    .line 955
    invoke-static {v1, v4}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 956
    .line 957
    .line 958
    check-cast v1, Ljava/util/List;

    .line 959
    .line 960
    new-instance v5, LJ1/b;

    .line 961
    .line 962
    invoke-direct {v5, v2, v3, v1}, LJ1/b;-><init>(LJ1/c;LJ1/a;Ljava/util/List;)V

    .line 963
    .line 964
    .line 965
    goto :goto_19

    .line 966
    :cond_2c
    invoke-super/range {p0 .. p2}, LC1/q;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 967
    .line 968
    .line 969
    move-result-object v5

    .line 970
    :cond_2d
    :goto_19
    return-object v5

    .line 971
    :pswitch_4
    const-string v3, "buffer"

    .line 972
    .line 973
    invoke-static {v2, v3}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 974
    .line 975
    .line 976
    const/16 v3, -0x7f

    .line 977
    .line 978
    const/4 v4, 0x0

    .line 979
    const/4 v5, 0x0

    .line 980
    if-ne v1, v3, :cond_2f

    .line 981
    .line 982
    invoke-virtual {v0, v2}, LC1/q;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 983
    .line 984
    .line 985
    move-result-object v1

    .line 986
    check-cast v1, Ljava/lang/Long;

    .line 987
    .line 988
    if-eqz v1, :cond_44

    .line 989
    .line 990
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 991
    .line 992
    .line 993
    move-result-wide v1

    .line 994
    long-to-int v1, v1

    .line 995
    sget-object v2, LI1/f;->l:LB1/b;

    .line 996
    .line 997
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 998
    .line 999
    .line 1000
    invoke-static {}, LI1/f;->values()[LI1/f;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v2

    .line 1004
    array-length v3, v2

    .line 1005
    :goto_1a
    if-ge v4, v3, :cond_44

    .line 1006
    .line 1007
    aget-object v6, v2, v4

    .line 1008
    .line 1009
    iget v7, v6, LI1/f;->k:I

    .line 1010
    .line 1011
    if-ne v7, v1, :cond_2e

    .line 1012
    .line 1013
    :goto_1b
    move-object v5, v6

    .line 1014
    goto/16 :goto_26

    .line 1015
    .line 1016
    :cond_2e
    add-int/lit8 v4, v4, 0x1

    .line 1017
    .line 1018
    goto :goto_1a

    .line 1019
    :cond_2f
    const/16 v3, -0x7e

    .line 1020
    .line 1021
    if-ne v1, v3, :cond_31

    .line 1022
    .line 1023
    invoke-virtual {v0, v2}, LC1/q;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v1

    .line 1027
    check-cast v1, Ljava/lang/Long;

    .line 1028
    .line 1029
    if-eqz v1, :cond_44

    .line 1030
    .line 1031
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 1032
    .line 1033
    .line 1034
    move-result-wide v1

    .line 1035
    long-to-int v1, v1

    .line 1036
    sget-object v2, LI1/b;->l:LB1/b;

    .line 1037
    .line 1038
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1039
    .line 1040
    .line 1041
    invoke-static {}, LI1/b;->values()[LI1/b;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v2

    .line 1045
    array-length v3, v2

    .line 1046
    :goto_1c
    if-ge v4, v3, :cond_44

    .line 1047
    .line 1048
    aget-object v6, v2, v4

    .line 1049
    .line 1050
    iget v7, v6, LI1/b;->k:I

    .line 1051
    .line 1052
    if-ne v7, v1, :cond_30

    .line 1053
    .line 1054
    goto :goto_1b

    .line 1055
    :cond_30
    add-int/lit8 v4, v4, 0x1

    .line 1056
    .line 1057
    goto :goto_1c

    .line 1058
    :cond_31
    const/16 v3, -0x7d

    .line 1059
    .line 1060
    const/4 v6, 0x3

    .line 1061
    const-string v7, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>"

    .line 1062
    .line 1063
    const/4 v8, 0x2

    .line 1064
    const/4 v9, 0x1

    .line 1065
    if-ne v1, v3, :cond_33

    .line 1066
    .line 1067
    invoke-virtual {v0, v2}, LC1/q;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v1

    .line 1071
    instance-of v2, v1, Ljava/util/List;

    .line 1072
    .line 1073
    if-eqz v2, :cond_32

    .line 1074
    .line 1075
    check-cast v1, Ljava/util/List;

    .line 1076
    .line 1077
    goto :goto_1d

    .line 1078
    :cond_32
    move-object v1, v5

    .line 1079
    :goto_1d
    if-eqz v1, :cond_44

    .line 1080
    .line 1081
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v2

    .line 1085
    invoke-static {v2, v7}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1086
    .line 1087
    .line 1088
    check-cast v2, Ljava/util/List;

    .line 1089
    .line 1090
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v3

    .line 1094
    check-cast v3, Ljava/lang/String;

    .line 1095
    .line 1096
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v4

    .line 1100
    check-cast v4, Ljava/lang/String;

    .line 1101
    .line 1102
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v1

    .line 1106
    check-cast v1, Ljava/lang/String;

    .line 1107
    .line 1108
    new-instance v5, LI1/v;

    .line 1109
    .line 1110
    invoke-direct {v5, v2, v3, v4, v1}, LI1/v;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1111
    .line 1112
    .line 1113
    goto/16 :goto_26

    .line 1114
    .line 1115
    :cond_33
    const/16 v3, -0x7c

    .line 1116
    .line 1117
    const/4 v10, 0x4

    .line 1118
    const-string v11, "null cannot be cast to non-null type kotlin.Boolean"

    .line 1119
    .line 1120
    if-ne v1, v3, :cond_35

    .line 1121
    .line 1122
    invoke-virtual {v0, v2}, LC1/q;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v1

    .line 1126
    instance-of v2, v1, Ljava/util/List;

    .line 1127
    .line 1128
    if-eqz v2, :cond_34

    .line 1129
    .line 1130
    check-cast v1, Ljava/util/List;

    .line 1131
    .line 1132
    goto :goto_1e

    .line 1133
    :cond_34
    move-object v1, v5

    .line 1134
    :goto_1e
    if-eqz v1, :cond_44

    .line 1135
    .line 1136
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v2

    .line 1140
    invoke-static {v2, v11}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1141
    .line 1142
    .line 1143
    check-cast v2, Ljava/lang/Boolean;

    .line 1144
    .line 1145
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1146
    .line 1147
    .line 1148
    move-result v12

    .line 1149
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v2

    .line 1153
    const-string v3, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.GetCredentialRequestGoogleIdOptionParams"

    .line 1154
    .line 1155
    invoke-static {v2, v3}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1156
    .line 1157
    .line 1158
    move-object v13, v2

    .line 1159
    check-cast v13, LI1/g;

    .line 1160
    .line 1161
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v2

    .line 1165
    move-object v14, v2

    .line 1166
    check-cast v14, Ljava/lang/String;

    .line 1167
    .line 1168
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v2

    .line 1172
    move-object v15, v2

    .line 1173
    check-cast v15, Ljava/lang/String;

    .line 1174
    .line 1175
    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v1

    .line 1179
    move-object/from16 v16, v1

    .line 1180
    .line 1181
    check-cast v16, Ljava/lang/String;

    .line 1182
    .line 1183
    new-instance v11, LI1/h;

    .line 1184
    .line 1185
    invoke-direct/range {v11 .. v16}, LI1/h;-><init>(ZLI1/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1186
    .line 1187
    .line 1188
    move-object v5, v11

    .line 1189
    goto/16 :goto_26

    .line 1190
    .line 1191
    :cond_35
    const/16 v3, -0x7b

    .line 1192
    .line 1193
    if-ne v1, v3, :cond_37

    .line 1194
    .line 1195
    invoke-virtual {v0, v2}, LC1/q;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v1

    .line 1199
    instance-of v2, v1, Ljava/util/List;

    .line 1200
    .line 1201
    if-eqz v2, :cond_36

    .line 1202
    .line 1203
    check-cast v1, Ljava/util/List;

    .line 1204
    .line 1205
    goto :goto_1f

    .line 1206
    :cond_36
    move-object v1, v5

    .line 1207
    :goto_1f
    if-eqz v1, :cond_44

    .line 1208
    .line 1209
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v2

    .line 1213
    invoke-static {v2, v11}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1214
    .line 1215
    .line 1216
    check-cast v2, Ljava/lang/Boolean;

    .line 1217
    .line 1218
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1219
    .line 1220
    .line 1221
    move-result v2

    .line 1222
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v1

    .line 1226
    invoke-static {v1, v11}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1227
    .line 1228
    .line 1229
    check-cast v1, Ljava/lang/Boolean;

    .line 1230
    .line 1231
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1232
    .line 1233
    .line 1234
    move-result v1

    .line 1235
    new-instance v5, LI1/g;

    .line 1236
    .line 1237
    invoke-direct {v5, v2, v1}, LI1/g;-><init>(ZZ)V

    .line 1238
    .line 1239
    .line 1240
    goto/16 :goto_26

    .line 1241
    .line 1242
    :cond_37
    const/16 v3, -0x7a

    .line 1243
    .line 1244
    const-string v11, "null cannot be cast to non-null type kotlin.String"

    .line 1245
    .line 1246
    if-ne v1, v3, :cond_39

    .line 1247
    .line 1248
    invoke-virtual {v0, v2}, LC1/q;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1249
    .line 1250
    .line 1251
    move-result-object v1

    .line 1252
    instance-of v2, v1, Ljava/util/List;

    .line 1253
    .line 1254
    if-eqz v2, :cond_38

    .line 1255
    .line 1256
    check-cast v1, Ljava/util/List;

    .line 1257
    .line 1258
    goto :goto_20

    .line 1259
    :cond_38
    move-object v1, v5

    .line 1260
    :goto_20
    if-eqz v1, :cond_44

    .line 1261
    .line 1262
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v2

    .line 1266
    invoke-static {v2, v11}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1267
    .line 1268
    .line 1269
    check-cast v2, Ljava/lang/String;

    .line 1270
    .line 1271
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1272
    .line 1273
    .line 1274
    move-result-object v1

    .line 1275
    invoke-static {v1, v7}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1276
    .line 1277
    .line 1278
    check-cast v1, Ljava/util/List;

    .line 1279
    .line 1280
    new-instance v5, LI1/y;

    .line 1281
    .line 1282
    invoke-direct {v5, v2, v1}, LI1/y;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 1283
    .line 1284
    .line 1285
    goto/16 :goto_26

    .line 1286
    .line 1287
    :cond_39
    const/16 v3, -0x79

    .line 1288
    .line 1289
    if-ne v1, v3, :cond_3b

    .line 1290
    .line 1291
    invoke-virtual {v0, v2}, LC1/q;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v1

    .line 1295
    instance-of v2, v1, Ljava/util/List;

    .line 1296
    .line 1297
    if-eqz v2, :cond_3a

    .line 1298
    .line 1299
    check-cast v1, Ljava/util/List;

    .line 1300
    .line 1301
    goto :goto_21

    .line 1302
    :cond_3a
    move-object v1, v5

    .line 1303
    :goto_21
    if-eqz v1, :cond_44

    .line 1304
    .line 1305
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v2

    .line 1309
    move-object v13, v2

    .line 1310
    check-cast v13, Ljava/lang/String;

    .line 1311
    .line 1312
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1313
    .line 1314
    .line 1315
    move-result-object v2

    .line 1316
    move-object v14, v2

    .line 1317
    check-cast v14, Ljava/lang/String;

    .line 1318
    .line 1319
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1320
    .line 1321
    .line 1322
    move-result-object v2

    .line 1323
    move-object v15, v2

    .line 1324
    check-cast v15, Ljava/lang/String;

    .line 1325
    .line 1326
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1327
    .line 1328
    .line 1329
    move-result-object v2

    .line 1330
    invoke-static {v2, v11}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1331
    .line 1332
    .line 1333
    move-object/from16 v16, v2

    .line 1334
    .line 1335
    check-cast v16, Ljava/lang/String;

    .line 1336
    .line 1337
    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v2

    .line 1341
    invoke-static {v2, v11}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1342
    .line 1343
    .line 1344
    move-object/from16 v17, v2

    .line 1345
    .line 1346
    check-cast v17, Ljava/lang/String;

    .line 1347
    .line 1348
    const/4 v2, 0x5

    .line 1349
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1350
    .line 1351
    .line 1352
    move-result-object v1

    .line 1353
    move-object/from16 v18, v1

    .line 1354
    .line 1355
    check-cast v18, Ljava/lang/String;

    .line 1356
    .line 1357
    new-instance v12, LI1/x;

    .line 1358
    .line 1359
    invoke-direct/range {v12 .. v18}, LI1/x;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1360
    .line 1361
    .line 1362
    move-object v5, v12

    .line 1363
    goto/16 :goto_26

    .line 1364
    .line 1365
    :cond_3b
    const/16 v3, -0x78

    .line 1366
    .line 1367
    if-ne v1, v3, :cond_3d

    .line 1368
    .line 1369
    invoke-virtual {v0, v2}, LC1/q;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1370
    .line 1371
    .line 1372
    move-result-object v1

    .line 1373
    instance-of v2, v1, Ljava/util/List;

    .line 1374
    .line 1375
    if-eqz v2, :cond_3c

    .line 1376
    .line 1377
    check-cast v1, Ljava/util/List;

    .line 1378
    .line 1379
    goto :goto_22

    .line 1380
    :cond_3c
    move-object v1, v5

    .line 1381
    :goto_22
    if-eqz v1, :cond_44

    .line 1382
    .line 1383
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1384
    .line 1385
    .line 1386
    move-result-object v2

    .line 1387
    const-string v3, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.GetCredentialFailureType"

    .line 1388
    .line 1389
    invoke-static {v2, v3}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1390
    .line 1391
    .line 1392
    check-cast v2, LI1/f;

    .line 1393
    .line 1394
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v3

    .line 1398
    check-cast v3, Ljava/lang/String;

    .line 1399
    .line 1400
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1401
    .line 1402
    .line 1403
    move-result-object v1

    .line 1404
    check-cast v1, Ljava/lang/String;

    .line 1405
    .line 1406
    new-instance v5, LI1/e;

    .line 1407
    .line 1408
    invoke-direct {v5, v2, v3, v1}, LI1/e;-><init>(LI1/f;Ljava/lang/String;Ljava/lang/String;)V

    .line 1409
    .line 1410
    .line 1411
    goto/16 :goto_26

    .line 1412
    .line 1413
    :cond_3d
    const/16 v3, -0x77

    .line 1414
    .line 1415
    if-ne v1, v3, :cond_3f

    .line 1416
    .line 1417
    invoke-virtual {v0, v2}, LC1/q;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1418
    .line 1419
    .line 1420
    move-result-object v1

    .line 1421
    instance-of v2, v1, Ljava/util/List;

    .line 1422
    .line 1423
    if-eqz v2, :cond_3e

    .line 1424
    .line 1425
    check-cast v1, Ljava/util/List;

    .line 1426
    .line 1427
    goto :goto_23

    .line 1428
    :cond_3e
    move-object v1, v5

    .line 1429
    :goto_23
    if-eqz v1, :cond_44

    .line 1430
    .line 1431
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v1

    .line 1435
    const-string v2, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.PlatformGoogleIdTokenCredential"

    .line 1436
    .line 1437
    invoke-static {v1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1438
    .line 1439
    .line 1440
    check-cast v1, LI1/x;

    .line 1441
    .line 1442
    new-instance v5, LI1/j;

    .line 1443
    .line 1444
    invoke-direct {v5, v1}, LI1/j;-><init>(LI1/x;)V

    .line 1445
    .line 1446
    .line 1447
    goto :goto_26

    .line 1448
    :cond_3f
    const/16 v3, -0x76

    .line 1449
    .line 1450
    if-ne v1, v3, :cond_41

    .line 1451
    .line 1452
    invoke-virtual {v0, v2}, LC1/q;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1453
    .line 1454
    .line 1455
    move-result-object v1

    .line 1456
    instance-of v2, v1, Ljava/util/List;

    .line 1457
    .line 1458
    if-eqz v2, :cond_40

    .line 1459
    .line 1460
    check-cast v1, Ljava/util/List;

    .line 1461
    .line 1462
    goto :goto_24

    .line 1463
    :cond_40
    move-object v1, v5

    .line 1464
    :goto_24
    if-eqz v1, :cond_44

    .line 1465
    .line 1466
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1467
    .line 1468
    .line 1469
    move-result-object v2

    .line 1470
    const-string v3, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.AuthorizeFailureType"

    .line 1471
    .line 1472
    invoke-static {v2, v3}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1473
    .line 1474
    .line 1475
    check-cast v2, LI1/b;

    .line 1476
    .line 1477
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1478
    .line 1479
    .line 1480
    move-result-object v3

    .line 1481
    check-cast v3, Ljava/lang/String;

    .line 1482
    .line 1483
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1484
    .line 1485
    .line 1486
    move-result-object v1

    .line 1487
    check-cast v1, Ljava/lang/String;

    .line 1488
    .line 1489
    new-instance v5, LI1/a;

    .line 1490
    .line 1491
    invoke-direct {v5, v2, v3, v1}, LI1/a;-><init>(LI1/b;Ljava/lang/String;Ljava/lang/String;)V

    .line 1492
    .line 1493
    .line 1494
    goto :goto_26

    .line 1495
    :cond_41
    const/16 v3, -0x75

    .line 1496
    .line 1497
    if-ne v1, v3, :cond_43

    .line 1498
    .line 1499
    invoke-virtual {v0, v2}, LC1/q;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1500
    .line 1501
    .line 1502
    move-result-object v1

    .line 1503
    instance-of v2, v1, Ljava/util/List;

    .line 1504
    .line 1505
    if-eqz v2, :cond_42

    .line 1506
    .line 1507
    check-cast v1, Ljava/util/List;

    .line 1508
    .line 1509
    goto :goto_25

    .line 1510
    :cond_42
    move-object v1, v5

    .line 1511
    :goto_25
    if-eqz v1, :cond_44

    .line 1512
    .line 1513
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1514
    .line 1515
    .line 1516
    move-result-object v2

    .line 1517
    check-cast v2, Ljava/lang/String;

    .line 1518
    .line 1519
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1520
    .line 1521
    .line 1522
    move-result-object v3

    .line 1523
    check-cast v3, Ljava/lang/String;

    .line 1524
    .line 1525
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1526
    .line 1527
    .line 1528
    move-result-object v1

    .line 1529
    invoke-static {v1, v7}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1530
    .line 1531
    .line 1532
    check-cast v1, Ljava/util/List;

    .line 1533
    .line 1534
    new-instance v5, LI1/w;

    .line 1535
    .line 1536
    invoke-direct {v5, v2, v1, v3}, LI1/w;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    .line 1537
    .line 1538
    .line 1539
    goto :goto_26

    .line 1540
    :cond_43
    invoke-super/range {p0 .. p2}, LC1/q;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1541
    .line 1542
    .line 1543
    move-result-object v5

    .line 1544
    :cond_44
    :goto_26
    return-object v5

    .line 1545
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public k(LC1/p;Ljava/lang/Object;)V
    .locals 11

    .line 1
    iget v0, p0, LI1/u;->d:I

    .line 2
    .line 3
    const/16 v1, 0x8a

    .line 4
    .line 5
    const/16 v2, 0x89

    .line 6
    .line 7
    const/16 v3, 0x88

    .line 8
    .line 9
    const/16 v4, 0x87

    .line 10
    .line 11
    const/16 v5, 0x86

    .line 12
    .line 13
    const/16 v6, 0x85

    .line 14
    .line 15
    const/16 v7, 0x84

    .line 16
    .line 17
    const/16 v8, 0x83

    .line 18
    .line 19
    const/16 v9, 0x82

    .line 20
    .line 21
    const/16 v10, 0x81

    .line 22
    .line 23
    packed-switch v0, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    :pswitch_0
    invoke-super {p0, p1, p2}, LC1/q;->k(LC1/p;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_1
    instance-of v0, p2, LM1/t;

    .line 31
    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    invoke-virtual {p1, v10}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 35
    .line 36
    .line 37
    check-cast p2, LM1/t;

    .line 38
    .line 39
    iget p2, p2, LM1/t;->k:I

    .line 40
    .line 41
    int-to-long v0, p2

    .line 42
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-virtual {p0, p1, p2}, LI1/u;->k(LC1/p;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    instance-of v0, p2, LM1/k;

    .line 51
    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    invoke-virtual {p1, v9}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 55
    .line 56
    .line 57
    check-cast p2, LM1/k;

    .line 58
    .line 59
    iget p2, p2, LM1/k;->k:I

    .line 60
    .line 61
    int-to-long v0, p2

    .line 62
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    invoke-virtual {p0, p1, p2}, LI1/u;->k(LC1/p;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    instance-of v0, p2, LM1/z;

    .line 71
    .line 72
    if-eqz v0, :cond_2

    .line 73
    .line 74
    invoke-virtual {p1, v8}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 75
    .line 76
    .line 77
    check-cast p2, LM1/z;

    .line 78
    .line 79
    iget p2, p2, LM1/z;->k:I

    .line 80
    .line 81
    int-to-long v0, p2

    .line 82
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    invoke-virtual {p0, p1, p2}, LI1/u;->k(LC1/p;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_2
    instance-of v0, p2, LM1/S;

    .line 91
    .line 92
    if-eqz v0, :cond_3

    .line 93
    .line 94
    invoke-virtual {p1, v7}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 95
    .line 96
    .line 97
    check-cast p2, LM1/S;

    .line 98
    .line 99
    iget p2, p2, LM1/S;->k:I

    .line 100
    .line 101
    int-to-long v0, p2

    .line 102
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    invoke-virtual {p0, p1, p2}, LI1/u;->k(LC1/p;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_3
    instance-of v0, p2, LM1/y;

    .line 111
    .line 112
    if-eqz v0, :cond_4

    .line 113
    .line 114
    invoke-virtual {p1, v6}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 115
    .line 116
    .line 117
    check-cast p2, LM1/y;

    .line 118
    .line 119
    iget p2, p2, LM1/y;->k:I

    .line 120
    .line 121
    int-to-long v0, p2

    .line 122
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    invoke-virtual {p0, p1, p2}, LI1/u;->k(LC1/p;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_4
    instance-of v0, p2, LM1/l0;

    .line 131
    .line 132
    if-eqz v0, :cond_5

    .line 133
    .line 134
    invoke-virtual {p1, v5}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 135
    .line 136
    .line 137
    check-cast p2, LM1/l0;

    .line 138
    .line 139
    iget p2, p2, LM1/l0;->k:I

    .line 140
    .line 141
    int-to-long v0, p2

    .line 142
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    invoke-virtual {p0, p1, p2}, LI1/u;->k(LC1/p;Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_5
    invoke-super {p0, p1, p2}, LC1/q;->k(LC1/p;Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    :goto_0
    return-void

    .line 154
    :pswitch_2
    instance-of v0, p2, LL1/k;

    .line 155
    .line 156
    if-eqz v0, :cond_6

    .line 157
    .line 158
    invoke-virtual {p1, v10}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 159
    .line 160
    .line 161
    check-cast p2, LL1/k;

    .line 162
    .line 163
    iget-boolean v0, p2, LL1/k;->a:Z

    .line 164
    .line 165
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    iget-boolean v1, p2, LL1/k;->b:Z

    .line 170
    .line 171
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    iget-object p2, p2, LL1/k;->c:Ljava/util/Map;

    .line 176
    .line 177
    filled-new-array {v0, v1, p2}, [Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p2

    .line 181
    invoke-static {p2}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 182
    .line 183
    .line 184
    move-result-object p2

    .line 185
    invoke-virtual {p0, p1, p2}, LI1/u;->k(LC1/p;Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    goto :goto_1

    .line 189
    :cond_6
    instance-of v0, p2, LL1/a;

    .line 190
    .line 191
    if-eqz v0, :cond_7

    .line 192
    .line 193
    invoke-virtual {p1, v9}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 194
    .line 195
    .line 196
    check-cast p2, LL1/a;

    .line 197
    .line 198
    iget-boolean p2, p2, LL1/a;->a:Z

    .line 199
    .line 200
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 201
    .line 202
    .line 203
    move-result-object p2

    .line 204
    invoke-static {p2}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 205
    .line 206
    .line 207
    move-result-object p2

    .line 208
    invoke-virtual {p0, p1, p2}, LI1/u;->k(LC1/p;Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    goto :goto_1

    .line 212
    :cond_7
    invoke-super {p0, p1, p2}, LC1/q;->k(LC1/p;Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    :goto_1
    return-void

    .line 216
    :pswitch_3
    instance-of v0, p2, LK1/N;

    .line 217
    .line 218
    if-eqz v0, :cond_8

    .line 219
    .line 220
    invoke-virtual {p1, v10}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 221
    .line 222
    .line 223
    check-cast p2, LK1/N;

    .line 224
    .line 225
    iget p2, p2, LK1/N;->k:I

    .line 226
    .line 227
    int-to-long v0, p2

    .line 228
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 229
    .line 230
    .line 231
    move-result-object p2

    .line 232
    invoke-virtual {p0, p1, p2}, LI1/u;->k(LC1/p;Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    goto :goto_2

    .line 236
    :cond_8
    instance-of v0, p2, LK1/h;

    .line 237
    .line 238
    if-eqz v0, :cond_9

    .line 239
    .line 240
    invoke-virtual {p1, v9}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 241
    .line 242
    .line 243
    check-cast p2, LK1/h;

    .line 244
    .line 245
    iget-object v0, p2, LK1/h;->a:Ljava/lang/String;

    .line 246
    .line 247
    iget-boolean p2, p2, LK1/h;->b:Z

    .line 248
    .line 249
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 250
    .line 251
    .line 252
    move-result-object p2

    .line 253
    filled-new-array {v0, p2}, [Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object p2

    .line 257
    invoke-static {p2}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 258
    .line 259
    .line 260
    move-result-object p2

    .line 261
    invoke-virtual {p0, p1, p2}, LI1/u;->k(LC1/p;Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    goto :goto_2

    .line 265
    :cond_9
    instance-of v0, p2, LK1/P;

    .line 266
    .line 267
    if-eqz v0, :cond_a

    .line 268
    .line 269
    invoke-virtual {p1, v8}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 270
    .line 271
    .line 272
    check-cast p2, LK1/P;

    .line 273
    .line 274
    iget-object v0, p2, LK1/P;->a:Ljava/lang/String;

    .line 275
    .line 276
    iget-object p2, p2, LK1/P;->b:LK1/N;

    .line 277
    .line 278
    filled-new-array {v0, p2}, [Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object p2

    .line 282
    invoke-static {p2}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 283
    .line 284
    .line 285
    move-result-object p2

    .line 286
    invoke-virtual {p0, p1, p2}, LI1/u;->k(LC1/p;Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    goto :goto_2

    .line 290
    :cond_a
    invoke-super {p0, p1, p2}, LC1/q;->k(LC1/p;Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    :goto_2
    return-void

    .line 294
    :pswitch_4
    instance-of v0, p2, LJ1/s;

    .line 295
    .line 296
    if-eqz v0, :cond_b

    .line 297
    .line 298
    invoke-virtual {p1, v10}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 299
    .line 300
    .line 301
    check-cast p2, LJ1/s;

    .line 302
    .line 303
    iget p2, p2, LJ1/s;->k:I

    .line 304
    .line 305
    int-to-long v0, p2

    .line 306
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 307
    .line 308
    .line 309
    move-result-object p2

    .line 310
    invoke-virtual {p0, p1, p2}, LI1/u;->k(LC1/p;Ljava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    goto/16 :goto_3

    .line 314
    .line 315
    :cond_b
    instance-of v0, p2, LJ1/u;

    .line 316
    .line 317
    if-eqz v0, :cond_c

    .line 318
    .line 319
    invoke-virtual {p1, v9}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 320
    .line 321
    .line 322
    check-cast p2, LJ1/u;

    .line 323
    .line 324
    iget p2, p2, LJ1/u;->k:I

    .line 325
    .line 326
    int-to-long v0, p2

    .line 327
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 328
    .line 329
    .line 330
    move-result-object p2

    .line 331
    invoke-virtual {p0, p1, p2}, LI1/u;->k(LC1/p;Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    goto/16 :goto_3

    .line 335
    .line 336
    :cond_c
    instance-of v0, p2, LJ1/c;

    .line 337
    .line 338
    if-eqz v0, :cond_d

    .line 339
    .line 340
    invoke-virtual {p1, v8}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 341
    .line 342
    .line 343
    check-cast p2, LJ1/c;

    .line 344
    .line 345
    iget p2, p2, LJ1/c;->k:I

    .line 346
    .line 347
    int-to-long v0, p2

    .line 348
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 349
    .line 350
    .line 351
    move-result-object p2

    .line 352
    invoke-virtual {p0, p1, p2}, LI1/u;->k(LC1/p;Ljava/lang/Object;)V

    .line 353
    .line 354
    .line 355
    goto/16 :goto_3

    .line 356
    .line 357
    :cond_d
    instance-of v0, p2, LJ1/e;

    .line 358
    .line 359
    if-eqz v0, :cond_e

    .line 360
    .line 361
    invoke-virtual {p1, v7}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 362
    .line 363
    .line 364
    check-cast p2, LJ1/e;

    .line 365
    .line 366
    iget-boolean v0, p2, LJ1/e;->a:Z

    .line 367
    .line 368
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    iget-boolean v1, p2, LJ1/e;->b:Z

    .line 373
    .line 374
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    iget-object p2, p2, LJ1/e;->c:Ljava/lang/Long;

    .line 379
    .line 380
    filled-new-array {v0, v1, p2}, [Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object p2

    .line 384
    invoke-static {p2}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 385
    .line 386
    .line 387
    move-result-object p2

    .line 388
    invoke-virtual {p0, p1, p2}, LI1/u;->k(LC1/p;Ljava/lang/Object;)V

    .line 389
    .line 390
    .line 391
    goto/16 :goto_3

    .line 392
    .line 393
    :cond_e
    instance-of v0, p2, LJ1/q;

    .line 394
    .line 395
    if-eqz v0, :cond_f

    .line 396
    .line 397
    invoke-virtual {p1, v6}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 398
    .line 399
    .line 400
    check-cast p2, LJ1/q;

    .line 401
    .line 402
    iget-object v0, p2, LJ1/q;->a:Ljava/lang/Double;

    .line 403
    .line 404
    iget-object v1, p2, LJ1/q;->b:Ljava/lang/Double;

    .line 405
    .line 406
    iget-wide v2, p2, LJ1/q;->c:J

    .line 407
    .line 408
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 409
    .line 410
    .line 411
    move-result-object p2

    .line 412
    filled-new-array {v0, v1, p2}, [Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object p2

    .line 416
    invoke-static {p2}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 417
    .line 418
    .line 419
    move-result-object p2

    .line 420
    invoke-virtual {p0, p1, p2}, LI1/u;->k(LC1/p;Ljava/lang/Object;)V

    .line 421
    .line 422
    .line 423
    goto/16 :goto_3

    .line 424
    .line 425
    :cond_f
    instance-of v0, p2, LJ1/r;

    .line 426
    .line 427
    if-eqz v0, :cond_10

    .line 428
    .line 429
    invoke-virtual {p1, v5}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 430
    .line 431
    .line 432
    check-cast p2, LJ1/r;

    .line 433
    .line 434
    iget-object p2, p2, LJ1/r;->a:LJ1/q;

    .line 435
    .line 436
    invoke-static {p2}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 437
    .line 438
    .line 439
    move-result-object p2

    .line 440
    invoke-virtual {p0, p1, p2}, LI1/u;->k(LC1/p;Ljava/lang/Object;)V

    .line 441
    .line 442
    .line 443
    goto :goto_3

    .line 444
    :cond_10
    instance-of v0, p2, LJ1/v;

    .line 445
    .line 446
    if-eqz v0, :cond_11

    .line 447
    .line 448
    invoke-virtual {p1, v4}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 449
    .line 450
    .line 451
    check-cast p2, LJ1/v;

    .line 452
    .line 453
    iget-object p2, p2, LJ1/v;->a:Ljava/lang/Long;

    .line 454
    .line 455
    invoke-static {p2}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 456
    .line 457
    .line 458
    move-result-object p2

    .line 459
    invoke-virtual {p0, p1, p2}, LI1/u;->k(LC1/p;Ljava/lang/Object;)V

    .line 460
    .line 461
    .line 462
    goto :goto_3

    .line 463
    :cond_11
    instance-of v0, p2, LJ1/t;

    .line 464
    .line 465
    if-eqz v0, :cond_12

    .line 466
    .line 467
    invoke-virtual {p1, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 468
    .line 469
    .line 470
    check-cast p2, LJ1/t;

    .line 471
    .line 472
    iget-object v0, p2, LJ1/t;->a:LJ1/u;

    .line 473
    .line 474
    iget-object p2, p2, LJ1/t;->b:LJ1/s;

    .line 475
    .line 476
    const/4 v1, 0x2

    .line 477
    new-array v1, v1, [Ljava/lang/Enum;

    .line 478
    .line 479
    const/4 v2, 0x0

    .line 480
    aput-object v0, v1, v2

    .line 481
    .line 482
    const/4 v0, 0x1

    .line 483
    aput-object p2, v1, v0

    .line 484
    .line 485
    invoke-static {v1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 486
    .line 487
    .line 488
    move-result-object p2

    .line 489
    invoke-virtual {p0, p1, p2}, LI1/u;->k(LC1/p;Ljava/lang/Object;)V

    .line 490
    .line 491
    .line 492
    goto :goto_3

    .line 493
    :cond_12
    instance-of v0, p2, LJ1/a;

    .line 494
    .line 495
    if-eqz v0, :cond_13

    .line 496
    .line 497
    invoke-virtual {p1, v2}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 498
    .line 499
    .line 500
    check-cast p2, LJ1/a;

    .line 501
    .line 502
    iget-object v0, p2, LJ1/a;->a:Ljava/lang/String;

    .line 503
    .line 504
    iget-object p2, p2, LJ1/a;->b:Ljava/lang/String;

    .line 505
    .line 506
    filled-new-array {v0, p2}, [Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object p2

    .line 510
    invoke-static {p2}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 511
    .line 512
    .line 513
    move-result-object p2

    .line 514
    invoke-virtual {p0, p1, p2}, LI1/u;->k(LC1/p;Ljava/lang/Object;)V

    .line 515
    .line 516
    .line 517
    goto :goto_3

    .line 518
    :cond_13
    instance-of v0, p2, LJ1/b;

    .line 519
    .line 520
    if-eqz v0, :cond_14

    .line 521
    .line 522
    invoke-virtual {p1, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 523
    .line 524
    .line 525
    check-cast p2, LJ1/b;

    .line 526
    .line 527
    iget-object v0, p2, LJ1/b;->a:LJ1/c;

    .line 528
    .line 529
    iget-object v1, p2, LJ1/b;->b:LJ1/a;

    .line 530
    .line 531
    iget-object p2, p2, LJ1/b;->c:Ljava/util/List;

    .line 532
    .line 533
    filled-new-array {v0, v1, p2}, [Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object p2

    .line 537
    invoke-static {p2}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 538
    .line 539
    .line 540
    move-result-object p2

    .line 541
    invoke-virtual {p0, p1, p2}, LI1/u;->k(LC1/p;Ljava/lang/Object;)V

    .line 542
    .line 543
    .line 544
    goto :goto_3

    .line 545
    :cond_14
    invoke-super {p0, p1, p2}, LC1/q;->k(LC1/p;Ljava/lang/Object;)V

    .line 546
    .line 547
    .line 548
    :goto_3
    return-void

    .line 549
    :pswitch_5
    instance-of v0, p2, LI1/f;

    .line 550
    .line 551
    if-eqz v0, :cond_15

    .line 552
    .line 553
    invoke-virtual {p1, v10}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 554
    .line 555
    .line 556
    check-cast p2, LI1/f;

    .line 557
    .line 558
    iget p2, p2, LI1/f;->k:I

    .line 559
    .line 560
    int-to-long v0, p2

    .line 561
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 562
    .line 563
    .line 564
    move-result-object p2

    .line 565
    invoke-virtual {p0, p1, p2}, LI1/u;->k(LC1/p;Ljava/lang/Object;)V

    .line 566
    .line 567
    .line 568
    goto/16 :goto_4

    .line 569
    .line 570
    :cond_15
    instance-of v0, p2, LI1/b;

    .line 571
    .line 572
    if-eqz v0, :cond_16

    .line 573
    .line 574
    invoke-virtual {p1, v9}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 575
    .line 576
    .line 577
    check-cast p2, LI1/b;

    .line 578
    .line 579
    iget p2, p2, LI1/b;->k:I

    .line 580
    .line 581
    int-to-long v0, p2

    .line 582
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 583
    .line 584
    .line 585
    move-result-object p2

    .line 586
    invoke-virtual {p0, p1, p2}, LI1/u;->k(LC1/p;Ljava/lang/Object;)V

    .line 587
    .line 588
    .line 589
    goto/16 :goto_4

    .line 590
    .line 591
    :cond_16
    instance-of v0, p2, LI1/v;

    .line 592
    .line 593
    if-eqz v0, :cond_17

    .line 594
    .line 595
    invoke-virtual {p1, v8}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 596
    .line 597
    .line 598
    check-cast p2, LI1/v;

    .line 599
    .line 600
    invoke-virtual {p2}, LI1/v;->a()Ljava/util/List;

    .line 601
    .line 602
    .line 603
    move-result-object p2

    .line 604
    invoke-virtual {p0, p1, p2}, LI1/u;->k(LC1/p;Ljava/lang/Object;)V

    .line 605
    .line 606
    .line 607
    goto/16 :goto_4

    .line 608
    .line 609
    :cond_17
    instance-of v0, p2, LI1/h;

    .line 610
    .line 611
    if-eqz v0, :cond_18

    .line 612
    .line 613
    invoke-virtual {p1, v7}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 614
    .line 615
    .line 616
    check-cast p2, LI1/h;

    .line 617
    .line 618
    invoke-virtual {p2}, LI1/h;->a()Ljava/util/List;

    .line 619
    .line 620
    .line 621
    move-result-object p2

    .line 622
    invoke-virtual {p0, p1, p2}, LI1/u;->k(LC1/p;Ljava/lang/Object;)V

    .line 623
    .line 624
    .line 625
    goto/16 :goto_4

    .line 626
    .line 627
    :cond_18
    instance-of v0, p2, LI1/g;

    .line 628
    .line 629
    if-eqz v0, :cond_19

    .line 630
    .line 631
    invoke-virtual {p1, v6}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 632
    .line 633
    .line 634
    check-cast p2, LI1/g;

    .line 635
    .line 636
    invoke-virtual {p2}, LI1/g;->a()Ljava/util/List;

    .line 637
    .line 638
    .line 639
    move-result-object p2

    .line 640
    invoke-virtual {p0, p1, p2}, LI1/u;->k(LC1/p;Ljava/lang/Object;)V

    .line 641
    .line 642
    .line 643
    goto/16 :goto_4

    .line 644
    .line 645
    :cond_19
    instance-of v0, p2, LI1/y;

    .line 646
    .line 647
    if-eqz v0, :cond_1a

    .line 648
    .line 649
    invoke-virtual {p1, v5}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 650
    .line 651
    .line 652
    check-cast p2, LI1/y;

    .line 653
    .line 654
    iget-object v0, p2, LI1/y;->a:Ljava/lang/String;

    .line 655
    .line 656
    iget-object p2, p2, LI1/y;->b:Ljava/util/List;

    .line 657
    .line 658
    filled-new-array {v0, p2}, [Ljava/lang/Object;

    .line 659
    .line 660
    .line 661
    move-result-object p2

    .line 662
    invoke-static {p2}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 663
    .line 664
    .line 665
    move-result-object p2

    .line 666
    invoke-virtual {p0, p1, p2}, LI1/u;->k(LC1/p;Ljava/lang/Object;)V

    .line 667
    .line 668
    .line 669
    goto :goto_4

    .line 670
    :cond_1a
    instance-of v0, p2, LI1/x;

    .line 671
    .line 672
    if-eqz v0, :cond_1b

    .line 673
    .line 674
    invoke-virtual {p1, v4}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 675
    .line 676
    .line 677
    check-cast p2, LI1/x;

    .line 678
    .line 679
    invoke-virtual {p2}, LI1/x;->a()Ljava/util/List;

    .line 680
    .line 681
    .line 682
    move-result-object p2

    .line 683
    invoke-virtual {p0, p1, p2}, LI1/u;->k(LC1/p;Ljava/lang/Object;)V

    .line 684
    .line 685
    .line 686
    goto :goto_4

    .line 687
    :cond_1b
    instance-of v0, p2, LI1/e;

    .line 688
    .line 689
    if-eqz v0, :cond_1c

    .line 690
    .line 691
    invoke-virtual {p1, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 692
    .line 693
    .line 694
    check-cast p2, LI1/e;

    .line 695
    .line 696
    invoke-virtual {p2}, LI1/e;->a()Ljava/util/List;

    .line 697
    .line 698
    .line 699
    move-result-object p2

    .line 700
    invoke-virtual {p0, p1, p2}, LI1/u;->k(LC1/p;Ljava/lang/Object;)V

    .line 701
    .line 702
    .line 703
    goto :goto_4

    .line 704
    :cond_1c
    instance-of v0, p2, LI1/j;

    .line 705
    .line 706
    if-eqz v0, :cond_1d

    .line 707
    .line 708
    invoke-virtual {p1, v2}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 709
    .line 710
    .line 711
    check-cast p2, LI1/j;

    .line 712
    .line 713
    iget-object p2, p2, LI1/j;->a:LI1/x;

    .line 714
    .line 715
    invoke-static {p2}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 716
    .line 717
    .line 718
    move-result-object p2

    .line 719
    invoke-virtual {p0, p1, p2}, LI1/u;->k(LC1/p;Ljava/lang/Object;)V

    .line 720
    .line 721
    .line 722
    goto :goto_4

    .line 723
    :cond_1d
    instance-of v0, p2, LI1/a;

    .line 724
    .line 725
    if-eqz v0, :cond_1e

    .line 726
    .line 727
    invoke-virtual {p1, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 728
    .line 729
    .line 730
    check-cast p2, LI1/a;

    .line 731
    .line 732
    invoke-virtual {p2}, LI1/a;->a()Ljava/util/List;

    .line 733
    .line 734
    .line 735
    move-result-object p2

    .line 736
    invoke-virtual {p0, p1, p2}, LI1/u;->k(LC1/p;Ljava/lang/Object;)V

    .line 737
    .line 738
    .line 739
    goto :goto_4

    .line 740
    :cond_1e
    instance-of v0, p2, LI1/w;

    .line 741
    .line 742
    if-eqz v0, :cond_1f

    .line 743
    .line 744
    const/16 v0, 0x8b

    .line 745
    .line 746
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 747
    .line 748
    .line 749
    check-cast p2, LI1/w;

    .line 750
    .line 751
    invoke-virtual {p2}, LI1/w;->a()Ljava/util/List;

    .line 752
    .line 753
    .line 754
    move-result-object p2

    .line 755
    invoke-virtual {p0, p1, p2}, LI1/u;->k(LC1/p;Ljava/lang/Object;)V

    .line 756
    .line 757
    .line 758
    goto :goto_4

    .line 759
    :cond_1f
    invoke-super {p0, p1, p2}, LC1/q;->k(LC1/p;Ljava/lang/Object;)V

    .line 760
    .line 761
    .line 762
    :goto_4
    return-void

    .line 763
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

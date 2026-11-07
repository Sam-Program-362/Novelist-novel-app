.class public abstract Lh0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LB1/s;

.field public b:Z


# virtual methods
.method public final a()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lh0/d;->a:LB1/s;

    .line 4
    .line 5
    if-eqz v1, :cond_16

    .line 6
    .line 7
    iget-boolean v2, v0, Lh0/d;->b:Z

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {v1, v0, v3}, LB1/s;->f(Lh0/d;Lh0/b;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v2, v1, LB1/s;->l:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Lh0/e;

    .line 18
    .line 19
    iget-object v1, v1, LB1/s;->k:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, LM1/K;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v4, v2, Lh0/e;->h:Lh0/d;

    .line 27
    .line 28
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    const/4 v5, 0x0

    .line 33
    if-eqz v4, :cond_15

    .line 34
    .line 35
    iget v4, v2, Lh0/e;->g:I

    .line 36
    .line 37
    const/4 v6, -0x1

    .line 38
    if-eq v6, v4, :cond_1

    .line 39
    .line 40
    goto/16 :goto_7

    .line 41
    .line 42
    :cond_1
    iget-object v4, v2, Lh0/e;->f:Lb/o;

    .line 43
    .line 44
    if-nez v4, :cond_2

    .line 45
    .line 46
    invoke-virtual {v2, v6}, Lh0/e;->c(I)Lb/o;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    :cond_2
    iput-object v3, v2, Lh0/e;->f:Lb/o;

    .line 51
    .line 52
    iput v5, v2, Lh0/e;->g:I

    .line 53
    .line 54
    iput-object v3, v2, Lh0/e;->h:Lh0/d;

    .line 55
    .line 56
    if-nez v4, :cond_3

    .line 57
    .line 58
    iget-object v1, v1, LM1/K;->l:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v1, Lb/t;

    .line 61
    .line 62
    iget-object v1, v1, Lb/t;->a:Ljava/lang/Runnable;

    .line 63
    .line 64
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 65
    .line 66
    .line 67
    goto/16 :goto_6

    .line 68
    .line 69
    :cond_3
    iget-object v1, v4, Lb/o;->d:Lb0/z;

    .line 70
    .line 71
    iget-object v1, v1, Lb0/z;->d:Lb0/I;

    .line 72
    .line 73
    const/4 v4, 0x3

    .line 74
    invoke-static {v4}, Lb0/I;->J(I)Z

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    const-string v7, "FragmentManager"

    .line 79
    .line 80
    if-eqz v6, :cond_4

    .line 81
    .line 82
    new-instance v6, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    const-string v8, "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager "

    .line 85
    .line 86
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    invoke-static {v7, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 97
    .line 98
    .line 99
    :cond_4
    iget-object v6, v1, Lb0/I;->i:Lb0/z;

    .line 100
    .line 101
    iget-object v8, v1, Lb0/I;->m:Ljava/util/ArrayList;

    .line 102
    .line 103
    const/4 v9, 0x1

    .line 104
    invoke-virtual {v1, v9}, Lb0/I;->A(Z)Z

    .line 105
    .line 106
    .line 107
    iget-object v10, v1, Lb0/I;->h:Lb0/a;

    .line 108
    .line 109
    if-eqz v10, :cond_10

    .line 110
    .line 111
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 112
    .line 113
    .line 114
    move-result v10

    .line 115
    if-nez v10, :cond_7

    .line 116
    .line 117
    new-instance v10, Ljava/util/LinkedHashSet;

    .line 118
    .line 119
    iget-object v11, v1, Lb0/I;->h:Lb0/a;

    .line 120
    .line 121
    invoke-static {v11}, Lb0/I;->E(Lb0/a;)Ljava/util/HashSet;

    .line 122
    .line 123
    .line 124
    move-result-object v11

    .line 125
    invoke-direct {v10, v11}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 129
    .line 130
    .line 131
    move-result v11

    .line 132
    move v12, v5

    .line 133
    :goto_0
    if-ge v12, v11, :cond_7

    .line 134
    .line 135
    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v13

    .line 139
    add-int/lit8 v12, v12, 0x1

    .line 140
    .line 141
    if-nez v13, :cond_6

    .line 142
    .line 143
    invoke-interface {v10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 144
    .line 145
    .line 146
    move-result-object v13

    .line 147
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v14

    .line 151
    if-nez v14, :cond_5

    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_5
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    check-cast v1, Lb0/s;

    .line 159
    .line 160
    throw v3

    .line 161
    :cond_6
    new-instance v1, Ljava/lang/ClassCastException;

    .line 162
    .line 163
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 164
    .line 165
    .line 166
    throw v1

    .line 167
    :cond_7
    iget-object v8, v1, Lb0/I;->h:Lb0/a;

    .line 168
    .line 169
    iget-object v8, v8, Lb0/a;->a:Ljava/util/ArrayList;

    .line 170
    .line 171
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 172
    .line 173
    .line 174
    move-result v10

    .line 175
    move v11, v5

    .line 176
    :cond_8
    :goto_1
    if-ge v11, v10, :cond_9

    .line 177
    .line 178
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v12

    .line 182
    add-int/lit8 v11, v11, 0x1

    .line 183
    .line 184
    check-cast v12, Lb0/P;

    .line 185
    .line 186
    iget-object v12, v12, Lb0/P;->b:Lb0/s;

    .line 187
    .line 188
    if-eqz v12, :cond_8

    .line 189
    .line 190
    iput-boolean v5, v12, Lb0/s;->w:Z

    .line 191
    .line 192
    goto :goto_1

    .line 193
    :cond_9
    new-instance v8, Ljava/util/ArrayList;

    .line 194
    .line 195
    iget-object v10, v1, Lb0/I;->h:Lb0/a;

    .line 196
    .line 197
    invoke-static {v10}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 198
    .line 199
    .line 200
    move-result-object v10

    .line 201
    invoke-direct {v8, v10}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v1, v8, v5, v9}, Lb0/I;->f(Ljava/util/ArrayList;II)Ljava/util/HashSet;

    .line 205
    .line 206
    .line 207
    move-result-object v8

    .line 208
    invoke-virtual {v8}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 209
    .line 210
    .line 211
    move-result-object v8

    .line 212
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 213
    .line 214
    .line 215
    move-result v9

    .line 216
    if-eqz v9, :cond_f

    .line 217
    .line 218
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v9

    .line 222
    check-cast v9, Lb0/l;

    .line 223
    .line 224
    iget-object v10, v9, Lb0/l;->c:Ljava/util/ArrayList;

    .line 225
    .line 226
    invoke-static {v4}, Lb0/I;->J(I)Z

    .line 227
    .line 228
    .line 229
    move-result v11

    .line 230
    if-eqz v11, :cond_a

    .line 231
    .line 232
    const-string v11, "SpecialEffectsController: Completing Back "

    .line 233
    .line 234
    invoke-static {v7, v11}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 235
    .line 236
    .line 237
    :cond_a
    invoke-virtual {v9, v10}, Lb0/l;->e(Ljava/util/List;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    const-string v11, "operations"

    .line 244
    .line 245
    invoke-static {v10, v11}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    new-instance v11, Ljava/util/ArrayList;

    .line 249
    .line 250
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 251
    .line 252
    .line 253
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 254
    .line 255
    .line 256
    move-result-object v12

    .line 257
    :goto_3
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 258
    .line 259
    .line 260
    move-result v13

    .line 261
    if-eqz v13, :cond_b

    .line 262
    .line 263
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v13

    .line 267
    check-cast v13, Lb0/U;

    .line 268
    .line 269
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    const/4 v13, 0x0

    .line 273
    invoke-static {v11, v13}, LP1/k;->f0(Ljava/util/AbstractList;Ljava/util/List;)V

    .line 274
    .line 275
    .line 276
    goto :goto_3

    .line 277
    :cond_b
    invoke-static {v11}, LP1/e;->n0(Ljava/util/Collection;)Ljava/util/Set;

    .line 278
    .line 279
    .line 280
    move-result-object v11

    .line 281
    invoke-static {v11}, LP1/e;->l0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 282
    .line 283
    .line 284
    move-result-object v11

    .line 285
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 286
    .line 287
    .line 288
    move-result v12

    .line 289
    const/4 v13, 0x0

    .line 290
    move v14, v13

    .line 291
    :goto_4
    if-ge v14, v12, :cond_c

    .line 292
    .line 293
    invoke-interface {v11, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v15

    .line 297
    check-cast v15, Lb0/T;

    .line 298
    .line 299
    move/from16 v16, v4

    .line 300
    .line 301
    iget-object v4, v9, Lb0/l;->a:Landroid/view/ViewGroup;

    .line 302
    .line 303
    invoke-virtual {v15, v4}, Lb0/T;->a(Landroid/view/ViewGroup;)V

    .line 304
    .line 305
    .line 306
    add-int/lit8 v14, v14, 0x1

    .line 307
    .line 308
    move/from16 v4, v16

    .line 309
    .line 310
    goto :goto_4

    .line 311
    :cond_c
    move/from16 v16, v4

    .line 312
    .line 313
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 314
    .line 315
    .line 316
    move-result v4

    .line 317
    move v11, v13

    .line 318
    :goto_5
    if-ge v11, v4, :cond_d

    .line 319
    .line 320
    invoke-interface {v10, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v12

    .line 324
    check-cast v12, Lb0/U;

    .line 325
    .line 326
    invoke-virtual {v9, v12}, Lb0/l;->a(Lb0/U;)V

    .line 327
    .line 328
    .line 329
    add-int/lit8 v11, v11, 0x1

    .line 330
    .line 331
    goto :goto_5

    .line 332
    :cond_d
    invoke-static {v10}, LP1/e;->l0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 333
    .line 334
    .line 335
    move-result-object v4

    .line 336
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 337
    .line 338
    .line 339
    move-result v9

    .line 340
    if-gtz v9, :cond_e

    .line 341
    .line 342
    move/from16 v4, v16

    .line 343
    .line 344
    goto/16 :goto_2

    .line 345
    .line 346
    :cond_e
    invoke-interface {v4, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    check-cast v1, Lb0/U;

    .line 351
    .line 352
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 353
    .line 354
    .line 355
    const/4 v1, 0x0

    .line 356
    throw v1

    .line 357
    :cond_f
    move/from16 v16, v4

    .line 358
    .line 359
    iput-object v3, v1, Lb0/I;->h:Lb0/a;

    .line 360
    .line 361
    invoke-virtual {v1}, Lb0/I;->e0()V

    .line 362
    .line 363
    .line 364
    invoke-static/range {v16 .. v16}, Lb0/I;->J(I)Z

    .line 365
    .line 366
    .line 367
    move-result v4

    .line 368
    if-eqz v4, :cond_14

    .line 369
    .line 370
    const-string v4, "Op is being set to null"

    .line 371
    .line 372
    invoke-static {v7, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 373
    .line 374
    .line 375
    new-instance v4, Ljava/lang/StringBuilder;

    .line 376
    .line 377
    const-string v8, "OnBackPressedCallback enabled="

    .line 378
    .line 379
    invoke-direct {v4, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    iget-boolean v6, v6, Lb0/z;->b:Z

    .line 383
    .line 384
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 385
    .line 386
    .line 387
    const-string v6, " for  FragmentManager "

    .line 388
    .line 389
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 390
    .line 391
    .line 392
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    invoke-static {v7, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 400
    .line 401
    .line 402
    goto :goto_6

    .line 403
    :cond_10
    move/from16 v16, v4

    .line 404
    .line 405
    iget-boolean v4, v6, Lb0/z;->b:Z

    .line 406
    .line 407
    if-eqz v4, :cond_12

    .line 408
    .line 409
    invoke-static/range {v16 .. v16}, Lb0/I;->J(I)Z

    .line 410
    .line 411
    .line 412
    move-result v4

    .line 413
    if-eqz v4, :cond_11

    .line 414
    .line 415
    const-string v4, "Calling popBackStackImmediate via onBackPressed callback"

    .line 416
    .line 417
    invoke-static {v7, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 418
    .line 419
    .line 420
    :cond_11
    invoke-virtual {v1}, Lb0/I;->Q()Z

    .line 421
    .line 422
    .line 423
    goto :goto_6

    .line 424
    :cond_12
    invoke-static/range {v16 .. v16}, Lb0/I;->J(I)Z

    .line 425
    .line 426
    .line 427
    move-result v4

    .line 428
    if-eqz v4, :cond_13

    .line 429
    .line 430
    const-string v4, "Calling onBackPressed via onBackPressed callback"

    .line 431
    .line 432
    invoke-static {v7, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 433
    .line 434
    .line 435
    :cond_13
    iget-object v1, v1, Lb0/I;->g:Lb/t;

    .line 436
    .line 437
    invoke-virtual {v1}, Lb/t;->a()Lb/r;

    .line 438
    .line 439
    .line 440
    move-result-object v1

    .line 441
    invoke-virtual {v1}, Lh0/d;->a()V

    .line 442
    .line 443
    .line 444
    :cond_14
    :goto_6
    iget-object v1, v2, Lh0/e;->a:Ll2/q;

    .line 445
    .line 446
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 447
    .line 448
    .line 449
    sget-object v2, Lh0/f;->m:Lh0/f;

    .line 450
    .line 451
    invoke-virtual {v1, v3, v2}, Ll2/q;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 452
    .line 453
    .line 454
    :cond_15
    :goto_7
    iput-boolean v5, v0, Lh0/d;->b:Z

    .line 455
    .line 456
    return-void

    .line 457
    :cond_16
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 458
    .line 459
    const-string v2, "This input is not added to any dispatcher."

    .line 460
    .line 461
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    throw v1
.end method

.method public b(Z)V
    .locals 0

    .line 1
    return-void
.end method

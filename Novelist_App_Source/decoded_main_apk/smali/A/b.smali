.class public final LA/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:I

.field public final l:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LL0/m;LA/l;)V
    .locals 0

    const/4 p1, 0x5

    iput p1, p0, LA/b;->k:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LA/b;->l:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, LA/b;->k:I

    iput-object p1, p0, LA/b;->l:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lw/d;I)V
    .locals 0

    const/4 p2, 0x0

    iput p2, p0, LA/b;->k:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA/b;->l:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, LA/b;->k:I

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v6, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, v1, LA/b;->l:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->J()Z

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    iget-object v0, v1, LA/b;->l:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 24
    .line 25
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->N:Ll0/s;

    .line 26
    .line 27
    if-eqz v0, :cond_d

    .line 28
    .line 29
    check-cast v0, Ll0/c;

    .line 30
    .line 31
    iget-object v4, v0, Ll0/c;->e:Ljava/util/ArrayList;

    .line 32
    .line 33
    iget-object v7, v0, Ll0/c;->i:Ljava/util/ArrayList;

    .line 34
    .line 35
    iget-object v8, v0, Ll0/c;->k:Ljava/util/ArrayList;

    .line 36
    .line 37
    iget-object v9, v0, Ll0/c;->j:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result v10

    .line 43
    iget-object v11, v0, Ll0/c;->g:Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 46
    .line 47
    .line 48
    move-result v12

    .line 49
    iget-object v13, v0, Ll0/c;->h:Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v14

    .line 55
    iget-object v15, v0, Ll0/c;->f:Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-virtual {v15}, Ljava/util/ArrayList;->isEmpty()Z

    .line 58
    .line 59
    .line 60
    move-result v16

    .line 61
    if-eqz v10, :cond_0

    .line 62
    .line 63
    if-eqz v12, :cond_0

    .line 64
    .line 65
    if-eqz v16, :cond_0

    .line 66
    .line 67
    if-eqz v14, :cond_0

    .line 68
    .line 69
    goto/16 :goto_4

    .line 70
    .line 71
    :cond_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v17

    .line 75
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v18

    .line 79
    if-nez v18, :cond_c

    .line 80
    .line 81
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 82
    .line 83
    .line 84
    if-nez v12, :cond_3

    .line 85
    .line 86
    new-instance v4, Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 92
    .line 93
    .line 94
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    invoke-virtual {v11}, Ljava/util/ArrayList;->clear()V

    .line 98
    .line 99
    .line 100
    if-eqz v10, :cond_2

    .line 101
    .line 102
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object v11

    .line 106
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v17

    .line 110
    if-nez v17, :cond_1

    .line 111
    .line 112
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_1
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-static {v0}, LB1/e;->p(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    throw v6

    .line 127
    :cond_2
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-static {v0}, LB1/e;->p(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    throw v6

    .line 135
    :cond_3
    :goto_0
    if-nez v14, :cond_6

    .line 136
    .line 137
    new-instance v4, Ljava/util/ArrayList;

    .line 138
    .line 139
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v4, v13}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 143
    .line 144
    .line 145
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    invoke-virtual {v13}, Ljava/util/ArrayList;->clear()V

    .line 149
    .line 150
    .line 151
    if-eqz v10, :cond_5

    .line 152
    .line 153
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 154
    .line 155
    .line 156
    move-result v9

    .line 157
    if-gtz v9, :cond_4

    .line 158
    .line 159
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_4
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-static {v0}, LB1/e;->p(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    throw v6

    .line 174
    :cond_5
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-static {v0}, LB1/e;->p(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    throw v6

    .line 182
    :cond_6
    :goto_1
    if-nez v16, :cond_d

    .line 183
    .line 184
    new-instance v4, Ljava/util/ArrayList;

    .line 185
    .line 186
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v4, v15}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 190
    .line 191
    .line 192
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    invoke-virtual {v15}, Ljava/util/ArrayList;->clear()V

    .line 196
    .line 197
    .line 198
    if-eqz v10, :cond_9

    .line 199
    .line 200
    if-eqz v12, :cond_9

    .line 201
    .line 202
    if-nez v14, :cond_7

    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_7
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    if-nez v2, :cond_8

    .line 214
    .line 215
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    goto :goto_4

    .line 222
    :cond_8
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    new-instance v0, Ljava/lang/ClassCastException;

    .line 230
    .line 231
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 232
    .line 233
    .line 234
    throw v0

    .line 235
    :cond_9
    :goto_2
    if-nez v12, :cond_a

    .line 236
    .line 237
    iget-wide v6, v0, Ll0/s;->c:J

    .line 238
    .line 239
    goto :goto_3

    .line 240
    :cond_a
    move-wide v6, v2

    .line 241
    :goto_3
    if-nez v14, :cond_b

    .line 242
    .line 243
    iget-wide v2, v0, Ll0/s;->d:J

    .line 244
    .line 245
    :cond_b
    invoke-static {v6, v7, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 246
    .line 247
    .line 248
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    new-instance v0, Ljava/lang/ClassCastException;

    .line 256
    .line 257
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 258
    .line 259
    .line 260
    throw v0

    .line 261
    :cond_c
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    new-instance v0, Ljava/lang/ClassCastException;

    .line 269
    .line 270
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 271
    .line 272
    .line 273
    throw v0

    .line 274
    :cond_d
    :goto_4
    return-void

    .line 275
    :pswitch_1
    iget-object v0, v1, LA/b;->l:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast v0, Ll0/g;

    .line 278
    .line 279
    iget-object v2, v0, Ll0/g;->u:Landroid/animation/ValueAnimator;

    .line 280
    .line 281
    iget v3, v0, Ll0/g;->v:I

    .line 282
    .line 283
    const/4 v6, 0x2

    .line 284
    if-eq v3, v4, :cond_e

    .line 285
    .line 286
    if-eq v3, v6, :cond_f

    .line 287
    .line 288
    goto :goto_5

    .line 289
    :cond_e
    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->cancel()V

    .line 290
    .line 291
    .line 292
    :cond_f
    const/4 v3, 0x3

    .line 293
    iput v3, v0, Ll0/g;->v:I

    .line 294
    .line 295
    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    check-cast v0, Ljava/lang/Float;

    .line 300
    .line 301
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 302
    .line 303
    .line 304
    move-result v0

    .line 305
    new-array v3, v6, [F

    .line 306
    .line 307
    aput v0, v3, v5

    .line 308
    .line 309
    const/4 v0, 0x0

    .line 310
    aput v0, v3, v4

    .line 311
    .line 312
    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 313
    .line 314
    .line 315
    const/16 v0, 0x1f4

    .line 316
    .line 317
    int-to-long v3, v0

    .line 318
    invoke-virtual {v2, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->start()V

    .line 322
    .line 323
    .line 324
    :goto_5
    return-void

    .line 325
    :pswitch_2
    iget-object v0, v1, LA/b;->l:Ljava/lang/Object;

    .line 326
    .line 327
    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 328
    .line 329
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->k:Landroidx/appcompat/widget/ActionMenuView;

    .line 330
    .line 331
    if-eqz v0, :cond_10

    .line 332
    .line 333
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->C:Lk/i;

    .line 334
    .line 335
    if-eqz v0, :cond_10

    .line 336
    .line 337
    invoke-virtual {v0}, Lk/i;->h()Z

    .line 338
    .line 339
    .line 340
    :cond_10
    return-void

    .line 341
    :pswitch_3
    iget-object v0, v1, LA/b;->l:Ljava/lang/Object;

    .line 342
    .line 343
    check-cast v0, Lk/D;

    .line 344
    .line 345
    iput-object v6, v0, Lk/D;->w:LA/b;

    .line 346
    .line 347
    invoke-virtual {v0}, Lk/D;->drawableStateChanged()V

    .line 348
    .line 349
    .line 350
    return-void

    .line 351
    :pswitch_4
    iget-object v0, v1, LA/b;->l:Ljava/lang/Object;

    .line 352
    .line 353
    check-cast v0, Lb0/I;

    .line 354
    .line 355
    invoke-virtual {v0, v4}, Lb0/I;->A(Z)Z

    .line 356
    .line 357
    .line 358
    return-void

    .line 359
    :pswitch_5
    iget-object v0, v1, LA/b;->l:Ljava/lang/Object;

    .line 360
    .line 361
    check-cast v0, Lb0/s;

    .line 362
    .line 363
    iget-object v2, v0, Lb0/s;->R:Lb0/r;

    .line 364
    .line 365
    if-eqz v2, :cond_11

    .line 366
    .line 367
    invoke-virtual {v0}, Lb0/s;->e()Lb0/r;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 372
    .line 373
    .line 374
    :cond_11
    return-void

    .line 375
    :pswitch_6
    iget-object v0, v1, LA/b;->l:Ljava/lang/Object;

    .line 376
    .line 377
    check-cast v0, Lb0/p;

    .line 378
    .line 379
    iget-object v2, v0, Lb0/p;->d0:Lb0/n;

    .line 380
    .line 381
    iget-object v0, v0, Lb0/p;->l0:Landroid/app/Dialog;

    .line 382
    .line 383
    invoke-virtual {v2, v0}, Lb0/n;->onDismiss(Landroid/content/DialogInterface;)V

    .line 384
    .line 385
    .line 386
    return-void

    .line 387
    :pswitch_7
    iget-object v0, v1, LA/b;->l:Ljava/lang/Object;

    .line 388
    .line 389
    check-cast v0, Landroidx/lifecycle/z;

    .line 390
    .line 391
    iget-object v2, v0, Landroidx/lifecycle/z;->a:Ljava/lang/Object;

    .line 392
    .line 393
    monitor-enter v2

    .line 394
    :try_start_0
    iget-object v0, v1, LA/b;->l:Ljava/lang/Object;

    .line 395
    .line 396
    check-cast v0, Landroidx/lifecycle/z;

    .line 397
    .line 398
    iget-object v0, v0, Landroidx/lifecycle/z;->f:Ljava/lang/Object;

    .line 399
    .line 400
    iget-object v3, v1, LA/b;->l:Ljava/lang/Object;

    .line 401
    .line 402
    check-cast v3, Landroidx/lifecycle/z;

    .line 403
    .line 404
    sget-object v4, Landroidx/lifecycle/z;->k:Ljava/lang/Object;

    .line 405
    .line 406
    iput-object v4, v3, Landroidx/lifecycle/z;->f:Ljava/lang/Object;

    .line 407
    .line 408
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 409
    iget-object v2, v1, LA/b;->l:Ljava/lang/Object;

    .line 410
    .line 411
    check-cast v2, Landroidx/lifecycle/z;

    .line 412
    .line 413
    invoke-virtual {v2, v0}, Landroidx/lifecycle/z;->h(Ljava/lang/Object;)V

    .line 414
    .line 415
    .line 416
    return-void

    .line 417
    :catchall_0
    move-exception v0

    .line 418
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 419
    throw v0

    .line 420
    :pswitch_8
    throw v6

    .line 421
    :pswitch_9
    iget-object v0, v1, LA/b;->l:Ljava/lang/Object;

    .line 422
    .line 423
    check-cast v0, LL0/y;

    .line 424
    .line 425
    iget-object v0, v0, LL0/y;->h:LL0/r;

    .line 426
    .line 427
    new-instance v2, LJ0/a;

    .line 428
    .line 429
    const/4 v3, 0x4

    .line 430
    invoke-direct {v2, v3, v6, v6}, LJ0/a;-><init>(ILandroid/app/PendingIntent;Ljava/lang/String;)V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v0, v2}, LL0/r;->b(LJ0/a;)V

    .line 434
    .line 435
    .line 436
    return-void

    .line 437
    :pswitch_a
    iget-object v0, v1, LA/b;->l:Ljava/lang/Object;

    .line 438
    .line 439
    check-cast v0, LB1/a;

    .line 440
    .line 441
    iget-object v0, v0, LB1/a;->l:Ljava/lang/Object;

    .line 442
    .line 443
    check-cast v0, LL0/p;

    .line 444
    .line 445
    iget-object v0, v0, LL0/p;->b:LK0/c;

    .line 446
    .line 447
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 448
    .line 449
    .line 450
    move-result-object v2

    .line 451
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v2

    .line 455
    const-string v3, " disconnecting because it was signed out."

    .line 456
    .line 457
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object v2

    .line 461
    invoke-interface {v0, v2}, LK0/c;->d(Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    return-void

    .line 465
    :pswitch_b
    iget-object v0, v1, LA/b;->l:Ljava/lang/Object;

    .line 466
    .line 467
    check-cast v0, LL0/p;

    .line 468
    .line 469
    invoke-virtual {v0}, LL0/p;->g()V

    .line 470
    .line 471
    .line 472
    return-void

    .line 473
    :pswitch_c
    iget-object v0, v1, LA/b;->l:Ljava/lang/Object;

    .line 474
    .line 475
    check-cast v0, LG/d;

    .line 476
    .line 477
    iget-object v4, v0, LG/d;->m:Lk/D;

    .line 478
    .line 479
    iget-object v6, v0, LG/d;->k:LG/a;

    .line 480
    .line 481
    iget-boolean v7, v0, LG/d;->y:Z

    .line 482
    .line 483
    if-nez v7, :cond_12

    .line 484
    .line 485
    goto/16 :goto_7

    .line 486
    .line 487
    :cond_12
    iget-boolean v7, v0, LG/d;->w:Z

    .line 488
    .line 489
    if-eqz v7, :cond_13

    .line 490
    .line 491
    iput-boolean v5, v0, LG/d;->w:Z

    .line 492
    .line 493
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 494
    .line 495
    .line 496
    move-result-wide v7

    .line 497
    iput-wide v7, v6, LG/a;->e:J

    .line 498
    .line 499
    const-wide/16 v9, -0x1

    .line 500
    .line 501
    iput-wide v9, v6, LG/a;->g:J

    .line 502
    .line 503
    iput-wide v7, v6, LG/a;->f:J

    .line 504
    .line 505
    const/high16 v7, 0x3f000000    # 0.5f

    .line 506
    .line 507
    iput v7, v6, LG/a;->h:F

    .line 508
    .line 509
    :cond_13
    iget-wide v7, v6, LG/a;->g:J

    .line 510
    .line 511
    cmp-long v7, v7, v2

    .line 512
    .line 513
    if-lez v7, :cond_14

    .line 514
    .line 515
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 516
    .line 517
    .line 518
    move-result-wide v7

    .line 519
    iget-wide v9, v6, LG/a;->g:J

    .line 520
    .line 521
    iget v11, v6, LG/a;->i:I

    .line 522
    .line 523
    int-to-long v11, v11

    .line 524
    add-long/2addr v9, v11

    .line 525
    cmp-long v7, v7, v9

    .line 526
    .line 527
    if-lez v7, :cond_14

    .line 528
    .line 529
    goto :goto_6

    .line 530
    :cond_14
    invoke-virtual {v0}, LG/d;->e()Z

    .line 531
    .line 532
    .line 533
    move-result v7

    .line 534
    if-nez v7, :cond_15

    .line 535
    .line 536
    :goto_6
    iput-boolean v5, v0, LG/d;->y:Z

    .line 537
    .line 538
    goto :goto_7

    .line 539
    :cond_15
    iget-boolean v7, v0, LG/d;->x:Z

    .line 540
    .line 541
    if-eqz v7, :cond_16

    .line 542
    .line 543
    iput-boolean v5, v0, LG/d;->x:Z

    .line 544
    .line 545
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 546
    .line 547
    .line 548
    move-result-wide v8

    .line 549
    const/4 v14, 0x0

    .line 550
    const/4 v15, 0x0

    .line 551
    const/4 v12, 0x3

    .line 552
    const/4 v13, 0x0

    .line 553
    move-wide v10, v8

    .line 554
    invoke-static/range {v8 .. v15}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 555
    .line 556
    .line 557
    move-result-object v5

    .line 558
    invoke-virtual {v4, v5}, Lk/D;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 559
    .line 560
    .line 561
    invoke-virtual {v5}, Landroid/view/MotionEvent;->recycle()V

    .line 562
    .line 563
    .line 564
    :cond_16
    iget-wide v7, v6, LG/a;->f:J

    .line 565
    .line 566
    cmp-long v2, v7, v2

    .line 567
    .line 568
    if-eqz v2, :cond_17

    .line 569
    .line 570
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 571
    .line 572
    .line 573
    move-result-wide v2

    .line 574
    invoke-virtual {v6, v2, v3}, LG/a;->a(J)F

    .line 575
    .line 576
    .line 577
    move-result v5

    .line 578
    const/high16 v7, -0x3f800000    # -4.0f

    .line 579
    .line 580
    mul-float/2addr v7, v5

    .line 581
    mul-float/2addr v7, v5

    .line 582
    const/high16 v8, 0x40800000    # 4.0f

    .line 583
    .line 584
    mul-float/2addr v5, v8

    .line 585
    add-float/2addr v5, v7

    .line 586
    iget-wide v7, v6, LG/a;->f:J

    .line 587
    .line 588
    sub-long v7, v2, v7

    .line 589
    .line 590
    iput-wide v2, v6, LG/a;->f:J

    .line 591
    .line 592
    long-to-float v2, v7

    .line 593
    mul-float/2addr v2, v5

    .line 594
    iget v3, v6, LG/a;->d:F

    .line 595
    .line 596
    mul-float/2addr v2, v3

    .line 597
    float-to-int v2, v2

    .line 598
    iget-object v0, v0, LG/d;->A:Lk/D;

    .line 599
    .line 600
    invoke-virtual {v0, v2}, Landroid/widget/AbsListView;->scrollListBy(I)V

    .line 601
    .line 602
    .line 603
    sget-object v0, LD/G;->a:Ljava/lang/reflect/Field;

    .line 604
    .line 605
    invoke-virtual {v4, v1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 606
    .line 607
    .line 608
    :goto_7
    return-void

    .line 609
    :cond_17
    new-instance v0, Ljava/lang/RuntimeException;

    .line 610
    .line 611
    const-string v2, "Cannot compute scroll delta before calling start()"

    .line 612
    .line 613
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 614
    .line 615
    .line 616
    throw v0

    .line 617
    :pswitch_d
    iget-object v0, v1, LA/b;->l:Ljava/lang/Object;

    .line 618
    .line 619
    check-cast v0, Lw/d;

    .line 620
    .line 621
    iget-object v0, v0, Lw/d;->a:Ljava/lang/Object;

    .line 622
    .line 623
    return-void

    .line 624
    nop

    .line 625
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

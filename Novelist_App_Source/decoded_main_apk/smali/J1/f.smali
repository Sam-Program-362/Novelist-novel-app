.class public final synthetic LJ1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC1/b;


# instance fields
.field public final synthetic k:I

.field public final synthetic l:LJ1/h;


# direct methods
.method public synthetic constructor <init>(LJ1/h;I)V
    .locals 0

    .line 1
    iput p2, p0, LJ1/f;->k:I

    iput-object p1, p0, LJ1/f;->l:LJ1/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;LA/c;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget v3, v1, LJ1/f;->k:I

    .line 8
    .line 9
    packed-switch v3, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, v1, LJ1/f;->l:LJ1/h;

    .line 13
    .line 14
    :try_start_0
    check-cast v0, LJ1/p;

    .line 15
    .line 16
    invoke-virtual {v0}, LJ1/p;->a()LJ1/b;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    instance-of v3, v0, LJ1/d;

    .line 27
    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    check-cast v0, LJ1/d;

    .line 31
    .line 32
    iget-object v3, v0, LJ1/d;->l:Ljava/lang/String;

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    iget-object v0, v0, LJ1/d;->k:Ljava/lang/String;

    .line 36
    .line 37
    filled-new-array {v0, v3, v4}, [Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {v0}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    const-string v6, "Cause: "

    .line 67
    .line 68
    const-string v7, ", Stacktrace: "

    .line 69
    .line 70
    invoke-static {v6, v5, v7, v0}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    filled-new-array {v3, v4, v0}, [Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-static {v0}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    :goto_0
    invoke-virtual {v2, v0}, LA/c;->e(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :pswitch_0
    const-string v3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 87
    .line 88
    invoke-static {v0, v3}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    check-cast v0, Ljava/util/List;

    .line 92
    .line 93
    const/4 v3, 0x0

    .line 94
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    const-string v4, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.MediaSelectionOptions"

    .line 99
    .line 100
    invoke-static {v3, v4}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    check-cast v3, LJ1/r;

    .line 104
    .line 105
    const/4 v4, 0x1

    .line 106
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    const-string v4, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.GeneralOptions"

    .line 111
    .line 112
    invoke-static {v0, v4}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    check-cast v0, LJ1/e;

    .line 116
    .line 117
    new-instance v4, LI1/k;

    .line 118
    .line 119
    const/4 v5, 0x6

    .line 120
    invoke-direct {v4, v2, v5}, LI1/k;-><init>(LA/c;I)V

    .line 121
    .line 122
    .line 123
    iget-object v2, v1, LJ1/f;->l:LJ1/h;

    .line 124
    .line 125
    check-cast v2, LJ1/p;

    .line 126
    .line 127
    iget-object v2, v2, LJ1/p;->l:Lk/u0;

    .line 128
    .line 129
    const/4 v5, 0x0

    .line 130
    if-eqz v2, :cond_2

    .line 131
    .line 132
    iget-object v6, v2, Lk/u0;->b:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v6, Landroid/app/Activity;

    .line 135
    .line 136
    if-nez v6, :cond_1

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_1
    iget-object v2, v2, Lk/u0;->c:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v2, LJ1/n;

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_2
    :goto_1
    move-object v2, v5

    .line 145
    :goto_2
    if-nez v2, :cond_3

    .line 146
    .line 147
    new-instance v0, LJ1/d;

    .line 148
    .line 149
    const-string v2, "no_activity"

    .line 150
    .line 151
    const-string v3, "image_picker plugin requires a foreground activity."

    .line 152
    .line 153
    invoke-direct {v0, v2, v3}, LJ1/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-static {v4, v0}, LS0/a;->f(LZ1/l;LJ1/d;)V

    .line 157
    .line 158
    .line 159
    goto/16 :goto_8

    .line 160
    .line 161
    :cond_3
    iget-object v3, v3, LJ1/r;->a:LJ1/q;

    .line 162
    .line 163
    invoke-virtual {v2, v3, v5, v4}, LJ1/n;->l(LJ1/q;LJ1/v;LZ1/l;)Z

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    if-nez v3, :cond_4

    .line 168
    .line 169
    invoke-static {v4}, LJ1/n;->b(LZ1/l;)V

    .line 170
    .line 171
    .line 172
    goto/16 :goto_8

    .line 173
    .line 174
    :cond_4
    iget-object v2, v2, LJ1/n;->l:Landroid/app/Activity;

    .line 175
    .line 176
    iget-boolean v3, v0, LJ1/e;->b:Z

    .line 177
    .line 178
    iget-boolean v4, v0, LJ1/e;->a:Z

    .line 179
    .line 180
    if-eqz v3, :cond_e

    .line 181
    .line 182
    sget-object v3, Le/b;->a:Le/b;

    .line 183
    .line 184
    const v5, 0x7fffffff

    .line 185
    .line 186
    .line 187
    const/4 v6, 0x2

    .line 188
    const/16 v7, 0x21

    .line 189
    .line 190
    const/16 v8, 0x1e

    .line 191
    .line 192
    sget-object v9, Le/c;->a:Le/c;

    .line 193
    .line 194
    if-eqz v4, :cond_9

    .line 195
    .line 196
    invoke-static {v0}, LE2/a;->v(LJ1/e;)I

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    new-instance v4, Le/a;

    .line 201
    .line 202
    invoke-direct {v4, v0}, Le/a;-><init>(I)V

    .line 203
    .line 204
    .line 205
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 206
    .line 207
    if-lt v0, v7, :cond_5

    .line 208
    .line 209
    goto :goto_3

    .line 210
    :cond_5
    if-lt v0, v8, :cond_6

    .line 211
    .line 212
    invoke-static {}, LB0/a;->D()I

    .line 213
    .line 214
    .line 215
    move-result v10

    .line 216
    if-lt v10, v6, :cond_6

    .line 217
    .line 218
    :goto_3
    invoke-static {}, LE/c;->a()I

    .line 219
    .line 220
    .line 221
    move-result v5

    .line 222
    :cond_6
    new-instance v10, LG1/a;

    .line 223
    .line 224
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 225
    .line 226
    .line 227
    iput-object v9, v10, LG1/a;->b:Ljava/lang/Object;

    .line 228
    .line 229
    if-lt v0, v7, :cond_7

    .line 230
    .line 231
    goto :goto_4

    .line 232
    :cond_7
    if-lt v0, v8, :cond_8

    .line 233
    .line 234
    invoke-static {}, LB0/a;->D()I

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    if-lt v0, v6, :cond_8

    .line 239
    .line 240
    :goto_4
    invoke-static {}, LE/c;->a()I

    .line 241
    .line 242
    .line 243
    :cond_8
    iput-object v9, v10, LG1/a;->b:Ljava/lang/Object;

    .line 244
    .line 245
    iput v5, v10, LG1/a;->a:I

    .line 246
    .line 247
    iput-object v3, v10, LG1/a;->c:Ljava/lang/Object;

    .line 248
    .line 249
    invoke-virtual {v4, v2, v10}, Le/a;->c0(Landroid/app/Activity;LG1/a;)Landroid/content/Intent;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    goto :goto_7

    .line 254
    :cond_9
    new-instance v0, Lb0/D;

    .line 255
    .line 256
    const/4 v4, 0x1

    .line 257
    invoke-direct {v0, v4}, Lb0/D;-><init>(I)V

    .line 258
    .line 259
    .line 260
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 261
    .line 262
    if-lt v4, v7, :cond_a

    .line 263
    .line 264
    goto :goto_5

    .line 265
    :cond_a
    if-lt v4, v8, :cond_b

    .line 266
    .line 267
    invoke-static {}, LB0/a;->D()I

    .line 268
    .line 269
    .line 270
    move-result v10

    .line 271
    if-lt v10, v6, :cond_b

    .line 272
    .line 273
    :goto_5
    invoke-static {}, LE/c;->a()I

    .line 274
    .line 275
    .line 276
    move-result v5

    .line 277
    :cond_b
    new-instance v10, LG1/a;

    .line 278
    .line 279
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 280
    .line 281
    .line 282
    iput-object v9, v10, LG1/a;->b:Ljava/lang/Object;

    .line 283
    .line 284
    if-lt v4, v7, :cond_c

    .line 285
    .line 286
    goto :goto_6

    .line 287
    :cond_c
    if-lt v4, v8, :cond_d

    .line 288
    .line 289
    invoke-static {}, LB0/a;->D()I

    .line 290
    .line 291
    .line 292
    move-result v4

    .line 293
    if-lt v4, v6, :cond_d

    .line 294
    .line 295
    :goto_6
    invoke-static {}, LE/c;->a()I

    .line 296
    .line 297
    .line 298
    :cond_d
    iput-object v9, v10, LG1/a;->b:Ljava/lang/Object;

    .line 299
    .line 300
    iput v5, v10, LG1/a;->a:I

    .line 301
    .line 302
    iput-object v3, v10, LG1/a;->c:Ljava/lang/Object;

    .line 303
    .line 304
    invoke-virtual {v0, v2, v10}, Lb0/D;->c0(Landroid/app/Activity;LG1/a;)Landroid/content/Intent;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    goto :goto_7

    .line 309
    :cond_e
    new-instance v0, Landroid/content/Intent;

    .line 310
    .line 311
    const-string v3, "android.intent.action.GET_CONTENT"

    .line 312
    .line 313
    invoke-direct {v0, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    const-string v3, "*/*"

    .line 317
    .line 318
    invoke-virtual {v0, v3}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 319
    .line 320
    .line 321
    const-string v3, "video/*"

    .line 322
    .line 323
    const-string v5, "image/*"

    .line 324
    .line 325
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v3

    .line 329
    const-string v5, "CONTENT_TYPE"

    .line 330
    .line 331
    invoke-virtual {v0, v5, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 332
    .line 333
    .line 334
    const-string v3, "android.intent.extra.ALLOW_MULTIPLE"

    .line 335
    .line 336
    invoke-virtual {v0, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 337
    .line 338
    .line 339
    :goto_7
    const/16 v3, 0x92b

    .line 340
    .line 341
    invoke-virtual {v2, v0, v3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 342
    .line 343
    .line 344
    :goto_8
    return-void

    .line 345
    :pswitch_1
    const-string v3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 346
    .line 347
    invoke-static {v0, v3}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    check-cast v0, Ljava/util/List;

    .line 351
    .line 352
    const/4 v3, 0x0

    .line 353
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v3

    .line 357
    const-string v4, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.SourceSpecification"

    .line 358
    .line 359
    invoke-static {v3, v4}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    check-cast v3, LJ1/t;

    .line 363
    .line 364
    const/4 v4, 0x1

    .line 365
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v5

    .line 369
    const-string v6, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.VideoSelectionOptions"

    .line 370
    .line 371
    invoke-static {v5, v6}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    check-cast v5, LJ1/v;

    .line 375
    .line 376
    const/4 v6, 0x2

    .line 377
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    const-string v7, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.GeneralOptions"

    .line 382
    .line 383
    invoke-static {v0, v7}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    check-cast v0, LJ1/e;

    .line 387
    .line 388
    new-instance v7, LI1/k;

    .line 389
    .line 390
    const/4 v8, 0x5

    .line 391
    invoke-direct {v7, v2, v8}, LI1/k;-><init>(LA/c;I)V

    .line 392
    .line 393
    .line 394
    iget-object v2, v1, LJ1/f;->l:LJ1/h;

    .line 395
    .line 396
    check-cast v2, LJ1/p;

    .line 397
    .line 398
    iget-object v2, v2, LJ1/p;->l:Lk/u0;

    .line 399
    .line 400
    const/4 v8, 0x0

    .line 401
    if-eqz v2, :cond_10

    .line 402
    .line 403
    iget-object v9, v2, Lk/u0;->b:Ljava/lang/Object;

    .line 404
    .line 405
    check-cast v9, Landroid/app/Activity;

    .line 406
    .line 407
    if-nez v9, :cond_f

    .line 408
    .line 409
    goto :goto_9

    .line 410
    :cond_f
    iget-object v2, v2, Lk/u0;->c:Ljava/lang/Object;

    .line 411
    .line 412
    check-cast v2, LJ1/n;

    .line 413
    .line 414
    goto :goto_a

    .line 415
    :cond_10
    :goto_9
    move-object v2, v8

    .line 416
    :goto_a
    if-nez v2, :cond_11

    .line 417
    .line 418
    new-instance v0, LJ1/d;

    .line 419
    .line 420
    const-string v2, "no_activity"

    .line 421
    .line 422
    const-string v3, "image_picker plugin requires a foreground activity."

    .line 423
    .line 424
    invoke-direct {v0, v2, v3}, LJ1/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    invoke-static {v7, v0}, LS0/a;->f(LZ1/l;LJ1/d;)V

    .line 428
    .line 429
    .line 430
    goto/16 :goto_13

    .line 431
    .line 432
    :cond_11
    iget-object v9, v2, LJ1/n;->l:Landroid/app/Activity;

    .line 433
    .line 434
    iget-object v10, v3, LJ1/t;->b:LJ1/s;

    .line 435
    .line 436
    if-eqz v10, :cond_13

    .line 437
    .line 438
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 439
    .line 440
    .line 441
    move-result v10

    .line 442
    if-eq v10, v4, :cond_12

    .line 443
    .line 444
    move v10, v4

    .line 445
    goto :goto_b

    .line 446
    :cond_12
    move v10, v6

    .line 447
    :goto_b
    iput v10, v2, LJ1/n;->s:I

    .line 448
    .line 449
    :cond_13
    iget-boolean v10, v0, LJ1/e;->a:Z

    .line 450
    .line 451
    iget-boolean v11, v0, LJ1/e;->b:Z

    .line 452
    .line 453
    const-string v12, "video/*"

    .line 454
    .line 455
    const-string v13, "android.intent.action.GET_CONTENT"

    .line 456
    .line 457
    sget-object v14, Le/e;->a:Le/e;

    .line 458
    .line 459
    sget-object v15, Le/c;->a:Le/c;

    .line 460
    .line 461
    const/16 v6, 0x21

    .line 462
    .line 463
    const v16, 0x7fffffff

    .line 464
    .line 465
    .line 466
    sget-object v4, Le/b;->a:Le/b;

    .line 467
    .line 468
    if-eqz v10, :cond_1a

    .line 469
    .line 470
    invoke-static {v0}, LE2/a;->v(LJ1/e;)I

    .line 471
    .line 472
    .line 473
    move-result v0

    .line 474
    invoke-virtual {v2, v8, v5, v7}, LJ1/n;->l(LJ1/q;LJ1/v;LZ1/l;)Z

    .line 475
    .line 476
    .line 477
    move-result v2

    .line 478
    if-nez v2, :cond_14

    .line 479
    .line 480
    invoke-static {v7}, LJ1/n;->b(LZ1/l;)V

    .line 481
    .line 482
    .line 483
    goto/16 :goto_13

    .line 484
    .line 485
    :cond_14
    if-eqz v11, :cond_19

    .line 486
    .line 487
    new-instance v2, Le/a;

    .line 488
    .line 489
    invoke-direct {v2, v0}, Le/a;-><init>(I)V

    .line 490
    .line 491
    .line 492
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 493
    .line 494
    if-lt v0, v6, :cond_15

    .line 495
    .line 496
    goto :goto_c

    .line 497
    :cond_15
    const/16 v3, 0x1e

    .line 498
    .line 499
    if-lt v0, v3, :cond_16

    .line 500
    .line 501
    invoke-static {}, LB0/a;->D()I

    .line 502
    .line 503
    .line 504
    move-result v3

    .line 505
    const/4 v5, 0x2

    .line 506
    if-lt v3, v5, :cond_16

    .line 507
    .line 508
    :goto_c
    invoke-static {}, LE/c;->a()I

    .line 509
    .line 510
    .line 511
    move-result v16

    .line 512
    :cond_16
    move/from16 v3, v16

    .line 513
    .line 514
    new-instance v5, LG1/a;

    .line 515
    .line 516
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 517
    .line 518
    .line 519
    iput-object v15, v5, LG1/a;->b:Ljava/lang/Object;

    .line 520
    .line 521
    if-lt v0, v6, :cond_17

    .line 522
    .line 523
    goto :goto_d

    .line 524
    :cond_17
    const/16 v6, 0x1e

    .line 525
    .line 526
    if-lt v0, v6, :cond_18

    .line 527
    .line 528
    invoke-static {}, LB0/a;->D()I

    .line 529
    .line 530
    .line 531
    move-result v0

    .line 532
    const/4 v6, 0x2

    .line 533
    if-lt v0, v6, :cond_18

    .line 534
    .line 535
    :goto_d
    invoke-static {}, LE/c;->a()I

    .line 536
    .line 537
    .line 538
    :cond_18
    iput-object v14, v5, LG1/a;->b:Ljava/lang/Object;

    .line 539
    .line 540
    iput v3, v5, LG1/a;->a:I

    .line 541
    .line 542
    iput-object v4, v5, LG1/a;->c:Ljava/lang/Object;

    .line 543
    .line 544
    invoke-virtual {v2, v9, v5}, Le/a;->c0(Landroid/app/Activity;LG1/a;)Landroid/content/Intent;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    goto :goto_e

    .line 549
    :cond_19
    new-instance v0, Landroid/content/Intent;

    .line 550
    .line 551
    invoke-direct {v0, v13}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 552
    .line 553
    .line 554
    invoke-virtual {v0, v12}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 555
    .line 556
    .line 557
    const-string v2, "android.intent.extra.ALLOW_MULTIPLE"

    .line 558
    .line 559
    const/4 v10, 0x1

    .line 560
    invoke-virtual {v0, v2, v10}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 561
    .line 562
    .line 563
    :goto_e
    const/16 v2, 0x92c

    .line 564
    .line 565
    invoke-virtual {v9, v0, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 566
    .line 567
    .line 568
    goto/16 :goto_13

    .line 569
    .line 570
    :cond_1a
    const/4 v10, 0x1

    .line 571
    iget-object v0, v3, LJ1/t;->a:LJ1/u;

    .line 572
    .line 573
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 574
    .line 575
    .line 576
    move-result v0

    .line 577
    if-eqz v0, :cond_22

    .line 578
    .line 579
    if-eq v0, v10, :cond_1b

    .line 580
    .line 581
    goto/16 :goto_13

    .line 582
    .line 583
    :cond_1b
    invoke-virtual {v2, v8, v5, v7}, LJ1/n;->l(LJ1/q;LJ1/v;LZ1/l;)Z

    .line 584
    .line 585
    .line 586
    move-result v0

    .line 587
    if-nez v0, :cond_1c

    .line 588
    .line 589
    invoke-static {v7}, LJ1/n;->b(LZ1/l;)V

    .line 590
    .line 591
    .line 592
    goto/16 :goto_13

    .line 593
    .line 594
    :cond_1c
    if-eqz v11, :cond_21

    .line 595
    .line 596
    new-instance v0, Lb0/D;

    .line 597
    .line 598
    const/4 v2, 0x1

    .line 599
    invoke-direct {v0, v2}, Lb0/D;-><init>(I)V

    .line 600
    .line 601
    .line 602
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 603
    .line 604
    if-lt v2, v6, :cond_1d

    .line 605
    .line 606
    goto :goto_f

    .line 607
    :cond_1d
    const/16 v3, 0x1e

    .line 608
    .line 609
    if-lt v2, v3, :cond_1e

    .line 610
    .line 611
    invoke-static {}, LB0/a;->D()I

    .line 612
    .line 613
    .line 614
    move-result v3

    .line 615
    const/4 v5, 0x2

    .line 616
    if-lt v3, v5, :cond_1e

    .line 617
    .line 618
    :goto_f
    invoke-static {}, LE/c;->a()I

    .line 619
    .line 620
    .line 621
    move-result v16

    .line 622
    :cond_1e
    move/from16 v3, v16

    .line 623
    .line 624
    new-instance v5, LG1/a;

    .line 625
    .line 626
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 627
    .line 628
    .line 629
    iput-object v15, v5, LG1/a;->b:Ljava/lang/Object;

    .line 630
    .line 631
    if-lt v2, v6, :cond_1f

    .line 632
    .line 633
    goto :goto_10

    .line 634
    :cond_1f
    const/16 v6, 0x1e

    .line 635
    .line 636
    if-lt v2, v6, :cond_20

    .line 637
    .line 638
    invoke-static {}, LB0/a;->D()I

    .line 639
    .line 640
    .line 641
    move-result v2

    .line 642
    const/4 v6, 0x2

    .line 643
    if-lt v2, v6, :cond_20

    .line 644
    .line 645
    :goto_10
    invoke-static {}, LE/c;->a()I

    .line 646
    .line 647
    .line 648
    :cond_20
    iput-object v14, v5, LG1/a;->b:Ljava/lang/Object;

    .line 649
    .line 650
    iput v3, v5, LG1/a;->a:I

    .line 651
    .line 652
    iput-object v4, v5, LG1/a;->c:Ljava/lang/Object;

    .line 653
    .line 654
    invoke-virtual {v0, v9, v5}, Lb0/D;->c0(Landroid/app/Activity;LG1/a;)Landroid/content/Intent;

    .line 655
    .line 656
    .line 657
    move-result-object v0

    .line 658
    goto :goto_11

    .line 659
    :cond_21
    new-instance v0, Landroid/content/Intent;

    .line 660
    .line 661
    invoke-direct {v0, v13}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 662
    .line 663
    .line 664
    invoke-virtual {v0, v12}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 665
    .line 666
    .line 667
    :goto_11
    const/16 v2, 0x930

    .line 668
    .line 669
    invoke-virtual {v9, v0, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 670
    .line 671
    .line 672
    goto :goto_13

    .line 673
    :cond_22
    iget-object v0, v2, LJ1/n;->o:LH0/i;

    .line 674
    .line 675
    invoke-virtual {v2, v8, v5, v7}, LJ1/n;->l(LJ1/q;LJ1/v;LZ1/l;)Z

    .line 676
    .line 677
    .line 678
    move-result v3

    .line 679
    if-nez v3, :cond_23

    .line 680
    .line 681
    invoke-static {v7}, LJ1/n;->b(LZ1/l;)V

    .line 682
    .line 683
    .line 684
    goto :goto_13

    .line 685
    :cond_23
    invoke-virtual {v2}, LJ1/n;->k()Z

    .line 686
    .line 687
    .line 688
    move-result v3

    .line 689
    if-eqz v3, :cond_25

    .line 690
    .line 691
    iget-object v3, v0, LH0/i;->l:Ljava/lang/Object;

    .line 692
    .line 693
    check-cast v3, Landroid/app/Activity;

    .line 694
    .line 695
    const-string v4, "android.permission.CAMERA"

    .line 696
    .line 697
    invoke-static {v3, v4}, LH2/h;->d(Landroid/content/Context;Ljava/lang/String;)I

    .line 698
    .line 699
    .line 700
    move-result v3

    .line 701
    if-nez v3, :cond_24

    .line 702
    .line 703
    goto :goto_12

    .line 704
    :cond_24
    iget-object v0, v0, LH0/i;->l:Ljava/lang/Object;

    .line 705
    .line 706
    check-cast v0, Landroid/app/Activity;

    .line 707
    .line 708
    filled-new-array {v4}, [Ljava/lang/String;

    .line 709
    .line 710
    .line 711
    move-result-object v2

    .line 712
    const/16 v3, 0x933

    .line 713
    .line 714
    invoke-static {v0, v2, v3}, LH2/h;->x(Landroid/app/Activity;[Ljava/lang/String;I)V

    .line 715
    .line 716
    .line 717
    goto :goto_13

    .line 718
    :cond_25
    :goto_12
    invoke-virtual {v2}, LJ1/n;->j()V

    .line 719
    .line 720
    .line 721
    :goto_13
    return-void

    .line 722
    :pswitch_2
    const-string v3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 723
    .line 724
    invoke-static {v0, v3}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 725
    .line 726
    .line 727
    check-cast v0, Ljava/util/List;

    .line 728
    .line 729
    const/4 v3, 0x0

    .line 730
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 731
    .line 732
    .line 733
    move-result-object v3

    .line 734
    const-string v4, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.SourceSpecification"

    .line 735
    .line 736
    invoke-static {v3, v4}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 737
    .line 738
    .line 739
    check-cast v3, LJ1/t;

    .line 740
    .line 741
    const/4 v4, 0x1

    .line 742
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 743
    .line 744
    .line 745
    move-result-object v5

    .line 746
    const-string v6, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.ImageSelectionOptions"

    .line 747
    .line 748
    invoke-static {v5, v6}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 749
    .line 750
    .line 751
    check-cast v5, LJ1/q;

    .line 752
    .line 753
    const/4 v6, 0x2

    .line 754
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 755
    .line 756
    .line 757
    move-result-object v0

    .line 758
    const-string v7, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.GeneralOptions"

    .line 759
    .line 760
    invoke-static {v0, v7}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 761
    .line 762
    .line 763
    check-cast v0, LJ1/e;

    .line 764
    .line 765
    new-instance v7, LI1/k;

    .line 766
    .line 767
    const/4 v8, 0x7

    .line 768
    invoke-direct {v7, v2, v8}, LI1/k;-><init>(LA/c;I)V

    .line 769
    .line 770
    .line 771
    iget-object v2, v1, LJ1/f;->l:LJ1/h;

    .line 772
    .line 773
    check-cast v2, LJ1/p;

    .line 774
    .line 775
    iget-object v2, v2, LJ1/p;->l:Lk/u0;

    .line 776
    .line 777
    const/4 v8, 0x0

    .line 778
    if-eqz v2, :cond_27

    .line 779
    .line 780
    iget-object v9, v2, Lk/u0;->b:Ljava/lang/Object;

    .line 781
    .line 782
    check-cast v9, Landroid/app/Activity;

    .line 783
    .line 784
    if-nez v9, :cond_26

    .line 785
    .line 786
    goto :goto_14

    .line 787
    :cond_26
    iget-object v2, v2, Lk/u0;->c:Ljava/lang/Object;

    .line 788
    .line 789
    check-cast v2, LJ1/n;

    .line 790
    .line 791
    goto :goto_15

    .line 792
    :cond_27
    :goto_14
    move-object v2, v8

    .line 793
    :goto_15
    if-nez v2, :cond_28

    .line 794
    .line 795
    new-instance v0, LJ1/d;

    .line 796
    .line 797
    const-string v2, "no_activity"

    .line 798
    .line 799
    const-string v3, "image_picker plugin requires a foreground activity."

    .line 800
    .line 801
    invoke-direct {v0, v2, v3}, LJ1/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 802
    .line 803
    .line 804
    invoke-static {v7, v0}, LS0/a;->f(LZ1/l;LJ1/d;)V

    .line 805
    .line 806
    .line 807
    goto/16 :goto_1e

    .line 808
    .line 809
    :cond_28
    iget-object v9, v2, LJ1/n;->l:Landroid/app/Activity;

    .line 810
    .line 811
    iget-object v10, v3, LJ1/t;->b:LJ1/s;

    .line 812
    .line 813
    if-eqz v10, :cond_2a

    .line 814
    .line 815
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 816
    .line 817
    .line 818
    move-result v10

    .line 819
    if-eq v10, v4, :cond_29

    .line 820
    .line 821
    move v10, v4

    .line 822
    goto :goto_16

    .line 823
    :cond_29
    move v10, v6

    .line 824
    :goto_16
    iput v10, v2, LJ1/n;->s:I

    .line 825
    .line 826
    :cond_2a
    iget-boolean v10, v0, LJ1/e;->a:Z

    .line 827
    .line 828
    iget-boolean v11, v0, LJ1/e;->b:Z

    .line 829
    .line 830
    const-string v12, "image/*"

    .line 831
    .line 832
    const-string v13, "android.intent.action.GET_CONTENT"

    .line 833
    .line 834
    sget-object v14, Le/d;->a:Le/d;

    .line 835
    .line 836
    sget-object v15, Le/c;->a:Le/c;

    .line 837
    .line 838
    const/16 v6, 0x21

    .line 839
    .line 840
    const v16, 0x7fffffff

    .line 841
    .line 842
    .line 843
    sget-object v4, Le/b;->a:Le/b;

    .line 844
    .line 845
    if-eqz v10, :cond_31

    .line 846
    .line 847
    invoke-static {v0}, LE2/a;->v(LJ1/e;)I

    .line 848
    .line 849
    .line 850
    move-result v0

    .line 851
    invoke-virtual {v2, v5, v8, v7}, LJ1/n;->l(LJ1/q;LJ1/v;LZ1/l;)Z

    .line 852
    .line 853
    .line 854
    move-result v2

    .line 855
    if-nez v2, :cond_2b

    .line 856
    .line 857
    invoke-static {v7}, LJ1/n;->b(LZ1/l;)V

    .line 858
    .line 859
    .line 860
    goto/16 :goto_1e

    .line 861
    .line 862
    :cond_2b
    if-eqz v11, :cond_30

    .line 863
    .line 864
    new-instance v2, Le/a;

    .line 865
    .line 866
    invoke-direct {v2, v0}, Le/a;-><init>(I)V

    .line 867
    .line 868
    .line 869
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 870
    .line 871
    if-lt v0, v6, :cond_2c

    .line 872
    .line 873
    goto :goto_17

    .line 874
    :cond_2c
    const/16 v3, 0x1e

    .line 875
    .line 876
    if-lt v0, v3, :cond_2d

    .line 877
    .line 878
    invoke-static {}, LB0/a;->D()I

    .line 879
    .line 880
    .line 881
    move-result v3

    .line 882
    const/4 v5, 0x2

    .line 883
    if-lt v3, v5, :cond_2d

    .line 884
    .line 885
    :goto_17
    invoke-static {}, LE/c;->a()I

    .line 886
    .line 887
    .line 888
    move-result v16

    .line 889
    :cond_2d
    move/from16 v3, v16

    .line 890
    .line 891
    new-instance v5, LG1/a;

    .line 892
    .line 893
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 894
    .line 895
    .line 896
    iput-object v15, v5, LG1/a;->b:Ljava/lang/Object;

    .line 897
    .line 898
    if-lt v0, v6, :cond_2e

    .line 899
    .line 900
    goto :goto_18

    .line 901
    :cond_2e
    const/16 v6, 0x1e

    .line 902
    .line 903
    if-lt v0, v6, :cond_2f

    .line 904
    .line 905
    invoke-static {}, LB0/a;->D()I

    .line 906
    .line 907
    .line 908
    move-result v0

    .line 909
    const/4 v6, 0x2

    .line 910
    if-lt v0, v6, :cond_2f

    .line 911
    .line 912
    :goto_18
    invoke-static {}, LE/c;->a()I

    .line 913
    .line 914
    .line 915
    :cond_2f
    iput-object v14, v5, LG1/a;->b:Ljava/lang/Object;

    .line 916
    .line 917
    iput v3, v5, LG1/a;->a:I

    .line 918
    .line 919
    iput-object v4, v5, LG1/a;->c:Ljava/lang/Object;

    .line 920
    .line 921
    invoke-virtual {v2, v9, v5}, Le/a;->c0(Landroid/app/Activity;LG1/a;)Landroid/content/Intent;

    .line 922
    .line 923
    .line 924
    move-result-object v0

    .line 925
    goto :goto_19

    .line 926
    :cond_30
    new-instance v0, Landroid/content/Intent;

    .line 927
    .line 928
    invoke-direct {v0, v13}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 929
    .line 930
    .line 931
    invoke-virtual {v0, v12}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 932
    .line 933
    .line 934
    const-string v2, "android.intent.extra.ALLOW_MULTIPLE"

    .line 935
    .line 936
    const/4 v10, 0x1

    .line 937
    invoke-virtual {v0, v2, v10}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 938
    .line 939
    .line 940
    :goto_19
    const/16 v2, 0x92a

    .line 941
    .line 942
    invoke-virtual {v9, v0, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 943
    .line 944
    .line 945
    goto/16 :goto_1e

    .line 946
    .line 947
    :cond_31
    const/4 v10, 0x1

    .line 948
    iget-object v0, v3, LJ1/t;->a:LJ1/u;

    .line 949
    .line 950
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 951
    .line 952
    .line 953
    move-result v0

    .line 954
    if-eqz v0, :cond_39

    .line 955
    .line 956
    if-eq v0, v10, :cond_32

    .line 957
    .line 958
    goto/16 :goto_1e

    .line 959
    .line 960
    :cond_32
    invoke-virtual {v2, v5, v8, v7}, LJ1/n;->l(LJ1/q;LJ1/v;LZ1/l;)Z

    .line 961
    .line 962
    .line 963
    move-result v0

    .line 964
    if-nez v0, :cond_33

    .line 965
    .line 966
    invoke-static {v7}, LJ1/n;->b(LZ1/l;)V

    .line 967
    .line 968
    .line 969
    goto/16 :goto_1e

    .line 970
    .line 971
    :cond_33
    if-eqz v11, :cond_38

    .line 972
    .line 973
    new-instance v0, Lb0/D;

    .line 974
    .line 975
    const/4 v2, 0x1

    .line 976
    invoke-direct {v0, v2}, Lb0/D;-><init>(I)V

    .line 977
    .line 978
    .line 979
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 980
    .line 981
    if-lt v2, v6, :cond_34

    .line 982
    .line 983
    goto :goto_1a

    .line 984
    :cond_34
    const/16 v3, 0x1e

    .line 985
    .line 986
    if-lt v2, v3, :cond_35

    .line 987
    .line 988
    invoke-static {}, LB0/a;->D()I

    .line 989
    .line 990
    .line 991
    move-result v3

    .line 992
    const/4 v5, 0x2

    .line 993
    if-lt v3, v5, :cond_35

    .line 994
    .line 995
    :goto_1a
    invoke-static {}, LE/c;->a()I

    .line 996
    .line 997
    .line 998
    move-result v16

    .line 999
    :cond_35
    move/from16 v3, v16

    .line 1000
    .line 1001
    new-instance v5, LG1/a;

    .line 1002
    .line 1003
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 1004
    .line 1005
    .line 1006
    iput-object v15, v5, LG1/a;->b:Ljava/lang/Object;

    .line 1007
    .line 1008
    if-lt v2, v6, :cond_36

    .line 1009
    .line 1010
    goto :goto_1b

    .line 1011
    :cond_36
    const/16 v6, 0x1e

    .line 1012
    .line 1013
    if-lt v2, v6, :cond_37

    .line 1014
    .line 1015
    invoke-static {}, LB0/a;->D()I

    .line 1016
    .line 1017
    .line 1018
    move-result v2

    .line 1019
    const/4 v6, 0x2

    .line 1020
    if-lt v2, v6, :cond_37

    .line 1021
    .line 1022
    :goto_1b
    invoke-static {}, LE/c;->a()I

    .line 1023
    .line 1024
    .line 1025
    :cond_37
    iput-object v14, v5, LG1/a;->b:Ljava/lang/Object;

    .line 1026
    .line 1027
    iput v3, v5, LG1/a;->a:I

    .line 1028
    .line 1029
    iput-object v4, v5, LG1/a;->c:Ljava/lang/Object;

    .line 1030
    .line 1031
    invoke-virtual {v0, v9, v5}, Lb0/D;->c0(Landroid/app/Activity;LG1/a;)Landroid/content/Intent;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v0

    .line 1035
    goto :goto_1c

    .line 1036
    :cond_38
    new-instance v0, Landroid/content/Intent;

    .line 1037
    .line 1038
    invoke-direct {v0, v13}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1039
    .line 1040
    .line 1041
    invoke-virtual {v0, v12}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 1042
    .line 1043
    .line 1044
    :goto_1c
    const/16 v2, 0x926

    .line 1045
    .line 1046
    invoke-virtual {v9, v0, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 1047
    .line 1048
    .line 1049
    goto :goto_1e

    .line 1050
    :cond_39
    iget-object v0, v2, LJ1/n;->o:LH0/i;

    .line 1051
    .line 1052
    invoke-virtual {v2, v5, v8, v7}, LJ1/n;->l(LJ1/q;LJ1/v;LZ1/l;)Z

    .line 1053
    .line 1054
    .line 1055
    move-result v3

    .line 1056
    if-nez v3, :cond_3a

    .line 1057
    .line 1058
    invoke-static {v7}, LJ1/n;->b(LZ1/l;)V

    .line 1059
    .line 1060
    .line 1061
    goto :goto_1e

    .line 1062
    :cond_3a
    invoke-virtual {v2}, LJ1/n;->k()Z

    .line 1063
    .line 1064
    .line 1065
    move-result v3

    .line 1066
    if-eqz v3, :cond_3c

    .line 1067
    .line 1068
    iget-object v3, v0, LH0/i;->l:Ljava/lang/Object;

    .line 1069
    .line 1070
    check-cast v3, Landroid/app/Activity;

    .line 1071
    .line 1072
    const-string v4, "android.permission.CAMERA"

    .line 1073
    .line 1074
    invoke-static {v3, v4}, LH2/h;->d(Landroid/content/Context;Ljava/lang/String;)I

    .line 1075
    .line 1076
    .line 1077
    move-result v3

    .line 1078
    if-nez v3, :cond_3b

    .line 1079
    .line 1080
    goto :goto_1d

    .line 1081
    :cond_3b
    iget-object v0, v0, LH0/i;->l:Ljava/lang/Object;

    .line 1082
    .line 1083
    check-cast v0, Landroid/app/Activity;

    .line 1084
    .line 1085
    filled-new-array {v4}, [Ljava/lang/String;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v2

    .line 1089
    const/16 v3, 0x929

    .line 1090
    .line 1091
    invoke-static {v0, v2, v3}, LH2/h;->x(Landroid/app/Activity;[Ljava/lang/String;I)V

    .line 1092
    .line 1093
    .line 1094
    goto :goto_1e

    .line 1095
    :cond_3c
    :goto_1d
    invoke-virtual {v2}, LJ1/n;->i()V

    .line 1096
    .line 1097
    .line 1098
    :goto_1e
    return-void

    .line 1099
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

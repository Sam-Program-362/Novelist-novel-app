.class public final synthetic LM1/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC1/b;


# instance fields
.field public final synthetic k:I

.field public final synthetic l:LM1/j;


# direct methods
.method public synthetic constructor <init>(LM1/j;I)V
    .locals 0

    .line 1
    iput p2, p0, LM1/H;->k:I

    iput-object p1, p0, LM1/H;->l:LM1/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;LA/c;)V
    .locals 12

    .line 1
    iget v0, p0, LM1/H;->k:I

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type kotlin.Long"

    .line 4
    .line 5
    const-string v2, "null cannot be cast to non-null type kotlin.Boolean"

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    const-string v6, ", Stacktrace: "

    .line 11
    .line 12
    const-string v7, "Cause: "

    .line 13
    .line 14
    const-string v8, "null cannot be cast to non-null type android.view.View"

    .line 15
    .line 16
    const/4 v9, 0x0

    .line 17
    const-string v10, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 18
    .line 19
    iget-object v11, p0, LM1/H;->l:LM1/j;

    .line 20
    .line 21
    packed-switch v0, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    invoke-static {p1, v10}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    check-cast p1, Ljava/util/List;

    .line 28
    .line 29
    invoke-interface {p1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0, v8}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    check-cast v0, Landroid/view/View;

    .line 37
    .line 38
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.webviewflutter.WindowInsetsType>"

    .line 43
    .line 44
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    check-cast p1, Ljava/util/List;

    .line 48
    .line 49
    :try_start_0
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_0

    .line 57
    .line 58
    new-instance p1, LM1/N;

    .line 59
    .line 60
    const/16 v1, 0xc

    .line 61
    .line 62
    invoke-direct {p1, v1}, LM1/N;-><init>(I)V

    .line 63
    .line 64
    .line 65
    sget-object v1, LD/G;->a:Ljava/lang/reflect/Field;

    .line 66
    .line 67
    invoke-static {v0, p1}, LD/z;->c(Landroid/view/View;LD/o;)V

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_1

    .line 80
    .line 81
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    check-cast v1, LM1/l0;

    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    packed-switch v1, :pswitch_data_1

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :pswitch_0
    or-int/lit8 v1, v9, 0x40

    .line 96
    .line 97
    :goto_1
    move v9, v1

    .line 98
    goto :goto_0

    .line 99
    :pswitch_1
    or-int/lit8 v1, v9, 0x10

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :pswitch_2
    or-int/lit8 v1, v9, 0x1

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :pswitch_3
    or-int/lit8 v1, v9, 0x2

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :pswitch_4
    or-int/lit8 v1, v9, 0x20

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :pswitch_5
    or-int/lit8 v1, v9, 0x8

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :pswitch_6
    or-int/lit8 v1, v9, 0x4

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :pswitch_7
    or-int/lit16 v1, v9, 0x80

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :pswitch_8
    or-int/lit16 v1, v9, 0x207

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_1
    new-instance p1, LM1/T;

    .line 124
    .line 125
    invoke-direct {p1, v9}, LM1/T;-><init>(I)V

    .line 126
    .line 127
    .line 128
    sget-object v1, LD/G;->a:Ljava/lang/reflect/Field;

    .line 129
    .line 130
    invoke-static {v0, p1}, LD/z;->c(Landroid/view/View;LD/o;)V

    .line 131
    .line 132
    .line 133
    :goto_2
    invoke-static {v4}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 134
    .line 135
    .line 136
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    goto :goto_3

    .line 138
    :catchall_0
    move-exception p1

    .line 139
    instance-of v0, p1, LM1/a;

    .line 140
    .line 141
    if-eqz v0, :cond_2

    .line 142
    .line 143
    check-cast p1, LM1/a;

    .line 144
    .line 145
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 146
    .line 147
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 148
    .line 149
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 150
    .line 151
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    goto :goto_3

    .line 160
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    invoke-static {v7, v2, v6, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    :goto_3
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :pswitch_9
    invoke-static {p1, v10}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    check-cast p1, Ljava/util/List;

    .line 200
    .line 201
    invoke-interface {p1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-static {v0, v8}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    check-cast v0, Landroid/view/View;

    .line 209
    .line 210
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    const-string v1, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode"

    .line 215
    .line 216
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    check-cast p1, LM1/z;

    .line 220
    .line 221
    :try_start_1
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 225
    .line 226
    .line 227
    move-result p1

    .line 228
    if-eqz p1, :cond_6

    .line 229
    .line 230
    if-eq p1, v5, :cond_5

    .line 231
    .line 232
    if-eq p1, v3, :cond_4

    .line 233
    .line 234
    const/4 v0, 0x3

    .line 235
    if-eq p1, v0, :cond_3

    .line 236
    .line 237
    goto :goto_4

    .line 238
    :cond_3
    iget-object p1, v11, LM1/j;->a:LM1/O;

    .line 239
    .line 240
    sget-object v0, LM1/z;->m:LM1/z;

    .line 241
    .line 242
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 246
    .line 247
    new-instance v1, Ljava/lang/StringBuilder;

    .line 248
    .line 249
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    const-string v0, " doesn\'t represent a native value."

    .line 256
    .line 257
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    throw p1

    .line 268
    :cond_4
    invoke-virtual {v0, v3}, Landroid/view/View;->setOverScrollMode(I)V

    .line 269
    .line 270
    .line 271
    goto :goto_4

    .line 272
    :cond_5
    invoke-virtual {v0, v5}, Landroid/view/View;->setOverScrollMode(I)V

    .line 273
    .line 274
    .line 275
    goto :goto_4

    .line 276
    :cond_6
    invoke-virtual {v0, v9}, Landroid/view/View;->setOverScrollMode(I)V

    .line 277
    .line 278
    .line 279
    :goto_4
    invoke-static {v4}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 280
    .line 281
    .line 282
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 283
    goto :goto_5

    .line 284
    :catchall_1
    move-exception p1

    .line 285
    instance-of v0, p1, LM1/a;

    .line 286
    .line 287
    if-eqz v0, :cond_7

    .line 288
    .line 289
    check-cast p1, LM1/a;

    .line 290
    .line 291
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 292
    .line 293
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 294
    .line 295
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 296
    .line 297
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 302
    .line 303
    .line 304
    move-result-object p1

    .line 305
    goto :goto_5

    .line 306
    :cond_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object p1

    .line 326
    invoke-static {v7, v2, v6, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object p1

    .line 330
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object p1

    .line 334
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 335
    .line 336
    .line 337
    move-result-object p1

    .line 338
    :goto_5
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    return-void

    .line 342
    :pswitch_a
    invoke-static {p1, v10}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    check-cast p1, Ljava/util/List;

    .line 346
    .line 347
    invoke-interface {p1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    invoke-static {v0, v8}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    check-cast v0, Landroid/view/View;

    .line 355
    .line 356
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object p1

    .line 360
    invoke-static {p1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    check-cast p1, Ljava/lang/Boolean;

    .line 364
    .line 365
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 366
    .line 367
    .line 368
    move-result p1

    .line 369
    :try_start_2
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v0, p1}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    .line 373
    .line 374
    .line 375
    invoke-static {v4}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 376
    .line 377
    .line 378
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 379
    goto :goto_6

    .line 380
    :catchall_2
    move-exception p1

    .line 381
    instance-of v0, p1, LM1/a;

    .line 382
    .line 383
    if-eqz v0, :cond_8

    .line 384
    .line 385
    check-cast p1, LM1/a;

    .line 386
    .line 387
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 388
    .line 389
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 390
    .line 391
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 392
    .line 393
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object p1

    .line 397
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 398
    .line 399
    .line 400
    move-result-object p1

    .line 401
    goto :goto_6

    .line 402
    :cond_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 415
    .line 416
    .line 417
    move-result-object v2

    .line 418
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object p1

    .line 422
    invoke-static {v7, v2, v6, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object p1

    .line 426
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object p1

    .line 430
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 431
    .line 432
    .line 433
    move-result-object p1

    .line 434
    :goto_6
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 435
    .line 436
    .line 437
    return-void

    .line 438
    :pswitch_b
    invoke-static {p1, v10}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 439
    .line 440
    .line 441
    check-cast p1, Ljava/util/List;

    .line 442
    .line 443
    invoke-interface {p1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    invoke-static {v0, v8}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 448
    .line 449
    .line 450
    check-cast v0, Landroid/view/View;

    .line 451
    .line 452
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object p1

    .line 456
    invoke-static {p1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 457
    .line 458
    .line 459
    check-cast p1, Ljava/lang/Boolean;

    .line 460
    .line 461
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 462
    .line 463
    .line 464
    move-result p1

    .line 465
    :try_start_3
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 466
    .line 467
    .line 468
    invoke-virtual {v0, p1}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 469
    .line 470
    .line 471
    invoke-static {v4}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 472
    .line 473
    .line 474
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 475
    goto :goto_7

    .line 476
    :catchall_3
    move-exception p1

    .line 477
    instance-of v0, p1, LM1/a;

    .line 478
    .line 479
    if-eqz v0, :cond_9

    .line 480
    .line 481
    check-cast p1, LM1/a;

    .line 482
    .line 483
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 484
    .line 485
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 486
    .line 487
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 488
    .line 489
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object p1

    .line 493
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 494
    .line 495
    .line 496
    move-result-object p1

    .line 497
    goto :goto_7

    .line 498
    :cond_9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object v1

    .line 510
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 511
    .line 512
    .line 513
    move-result-object v2

    .line 514
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object p1

    .line 518
    invoke-static {v7, v2, v6, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 519
    .line 520
    .line 521
    move-result-object p1

    .line 522
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    move-result-object p1

    .line 526
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 527
    .line 528
    .line 529
    move-result-object p1

    .line 530
    :goto_7
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 531
    .line 532
    .line 533
    return-void

    .line 534
    :pswitch_c
    invoke-static {p1, v10}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 535
    .line 536
    .line 537
    check-cast p1, Ljava/util/List;

    .line 538
    .line 539
    invoke-interface {p1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 540
    .line 541
    .line 542
    move-result-object p1

    .line 543
    invoke-static {p1, v8}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 544
    .line 545
    .line 546
    check-cast p1, Landroid/view/View;

    .line 547
    .line 548
    :try_start_4
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 549
    .line 550
    .line 551
    new-instance v0, LM1/i0;

    .line 552
    .line 553
    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    .line 554
    .line 555
    .line 556
    move-result v1

    .line 557
    int-to-long v1, v1

    .line 558
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    .line 559
    .line 560
    .line 561
    move-result p1

    .line 562
    int-to-long v3, p1

    .line 563
    invoke-direct {v0, v1, v2, v3, v4}, LM1/i0;-><init>(JJ)V

    .line 564
    .line 565
    .line 566
    invoke-static {v0}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 567
    .line 568
    .line 569
    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 570
    goto :goto_8

    .line 571
    :catchall_4
    move-exception p1

    .line 572
    instance-of v0, p1, LM1/a;

    .line 573
    .line 574
    if-eqz v0, :cond_a

    .line 575
    .line 576
    check-cast p1, LM1/a;

    .line 577
    .line 578
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 579
    .line 580
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 581
    .line 582
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 583
    .line 584
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 585
    .line 586
    .line 587
    move-result-object p1

    .line 588
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 589
    .line 590
    .line 591
    move-result-object p1

    .line 592
    goto :goto_8

    .line 593
    :cond_a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 598
    .line 599
    .line 600
    move-result-object v0

    .line 601
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 602
    .line 603
    .line 604
    move-result-object v1

    .line 605
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 606
    .line 607
    .line 608
    move-result-object v2

    .line 609
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 610
    .line 611
    .line 612
    move-result-object p1

    .line 613
    invoke-static {v7, v2, v6, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 614
    .line 615
    .line 616
    move-result-object p1

    .line 617
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 618
    .line 619
    .line 620
    move-result-object p1

    .line 621
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 622
    .line 623
    .line 624
    move-result-object p1

    .line 625
    :goto_8
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 626
    .line 627
    .line 628
    return-void

    .line 629
    :pswitch_d
    invoke-static {p1, v10}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 630
    .line 631
    .line 632
    check-cast p1, Ljava/util/List;

    .line 633
    .line 634
    invoke-interface {p1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 635
    .line 636
    .line 637
    move-result-object v0

    .line 638
    invoke-static {v0, v8}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 639
    .line 640
    .line 641
    check-cast v0, Landroid/view/View;

    .line 642
    .line 643
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 644
    .line 645
    .line 646
    move-result-object v2

    .line 647
    invoke-static {v2, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 648
    .line 649
    .line 650
    check-cast v2, Ljava/lang/Long;

    .line 651
    .line 652
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 653
    .line 654
    .line 655
    move-result-wide v8

    .line 656
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object p1

    .line 660
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 661
    .line 662
    .line 663
    check-cast p1, Ljava/lang/Long;

    .line 664
    .line 665
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 666
    .line 667
    .line 668
    move-result-wide v1

    .line 669
    :try_start_5
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 670
    .line 671
    .line 672
    long-to-int p1, v8

    .line 673
    long-to-int v1, v1

    .line 674
    invoke-virtual {v0, p1, v1}, Landroid/view/View;->scrollBy(II)V

    .line 675
    .line 676
    .line 677
    invoke-static {v4}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 678
    .line 679
    .line 680
    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 681
    goto :goto_9

    .line 682
    :catchall_5
    move-exception p1

    .line 683
    instance-of v0, p1, LM1/a;

    .line 684
    .line 685
    if-eqz v0, :cond_b

    .line 686
    .line 687
    check-cast p1, LM1/a;

    .line 688
    .line 689
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 690
    .line 691
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 692
    .line 693
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 694
    .line 695
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 696
    .line 697
    .line 698
    move-result-object p1

    .line 699
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 700
    .line 701
    .line 702
    move-result-object p1

    .line 703
    goto :goto_9

    .line 704
    :cond_b
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 705
    .line 706
    .line 707
    move-result-object v0

    .line 708
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 709
    .line 710
    .line 711
    move-result-object v0

    .line 712
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 713
    .line 714
    .line 715
    move-result-object v1

    .line 716
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 717
    .line 718
    .line 719
    move-result-object v2

    .line 720
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 721
    .line 722
    .line 723
    move-result-object p1

    .line 724
    invoke-static {v7, v2, v6, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 725
    .line 726
    .line 727
    move-result-object p1

    .line 728
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 729
    .line 730
    .line 731
    move-result-object p1

    .line 732
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 733
    .line 734
    .line 735
    move-result-object p1

    .line 736
    :goto_9
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 737
    .line 738
    .line 739
    return-void

    .line 740
    :pswitch_e
    invoke-static {p1, v10}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 741
    .line 742
    .line 743
    check-cast p1, Ljava/util/List;

    .line 744
    .line 745
    invoke-interface {p1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 746
    .line 747
    .line 748
    move-result-object v0

    .line 749
    invoke-static {v0, v8}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 750
    .line 751
    .line 752
    check-cast v0, Landroid/view/View;

    .line 753
    .line 754
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 755
    .line 756
    .line 757
    move-result-object v2

    .line 758
    invoke-static {v2, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 759
    .line 760
    .line 761
    check-cast v2, Ljava/lang/Long;

    .line 762
    .line 763
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 764
    .line 765
    .line 766
    move-result-wide v8

    .line 767
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 768
    .line 769
    .line 770
    move-result-object p1

    .line 771
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 772
    .line 773
    .line 774
    check-cast p1, Ljava/lang/Long;

    .line 775
    .line 776
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 777
    .line 778
    .line 779
    move-result-wide v1

    .line 780
    :try_start_6
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 781
    .line 782
    .line 783
    long-to-int p1, v8

    .line 784
    long-to-int v1, v1

    .line 785
    invoke-virtual {v0, p1, v1}, Landroid/view/View;->scrollTo(II)V

    .line 786
    .line 787
    .line 788
    invoke-static {v4}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 789
    .line 790
    .line 791
    move-result-object p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 792
    goto :goto_a

    .line 793
    :catchall_6
    move-exception p1

    .line 794
    instance-of v0, p1, LM1/a;

    .line 795
    .line 796
    if-eqz v0, :cond_c

    .line 797
    .line 798
    check-cast p1, LM1/a;

    .line 799
    .line 800
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 801
    .line 802
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 803
    .line 804
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 805
    .line 806
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 807
    .line 808
    .line 809
    move-result-object p1

    .line 810
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 811
    .line 812
    .line 813
    move-result-object p1

    .line 814
    goto :goto_a

    .line 815
    :cond_c
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 816
    .line 817
    .line 818
    move-result-object v0

    .line 819
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 820
    .line 821
    .line 822
    move-result-object v0

    .line 823
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 824
    .line 825
    .line 826
    move-result-object v1

    .line 827
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 828
    .line 829
    .line 830
    move-result-object v2

    .line 831
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 832
    .line 833
    .line 834
    move-result-object p1

    .line 835
    invoke-static {v7, v2, v6, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 836
    .line 837
    .line 838
    move-result-object p1

    .line 839
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 840
    .line 841
    .line 842
    move-result-object p1

    .line 843
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 844
    .line 845
    .line 846
    move-result-object p1

    .line 847
    :goto_a
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 848
    .line 849
    .line 850
    return-void

    .line 851
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
    .end packed-switch

    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    :pswitch_data_1
    .packed-switch 0x0
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

.class public final synthetic LM1/I;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC1/c;


# instance fields
.field public final synthetic k:I

.field public final synthetic l:LM1/P;


# direct methods
.method public synthetic constructor <init>(LM1/P;I)V
    .locals 0

    .line 1
    iput p2, p0, LM1/I;->k:I

    iput-object p1, p0, LM1/I;->l:LM1/P;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget v0, p0, LM1/I;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LM1/I;->l:LM1/P;

    .line 7
    .line 8
    iget-object v0, v0, LM1/P;->l:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, LZ1/l;

    .line 11
    .line 12
    instance-of v1, p1, Ljava/util/List;

    .line 13
    .line 14
    const-string v2, ""

    .line 15
    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    check-cast p1, Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v3, 0x1

    .line 25
    const/4 v4, 0x0

    .line 26
    if-le v1, v3, :cond_0

    .line 27
    .line 28
    new-instance v1, LM1/a;

    .line 29
    .line 30
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const-string v4, "null cannot be cast to non-null type kotlin.String"

    .line 35
    .line 36
    invoke-static {v2, v4}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    check-cast v2, Ljava/lang/String;

    .line 40
    .line 41
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-static {v3, v4}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    check-cast v3, Ljava/lang/String;

    .line 49
    .line 50
    const/4 v4, 0x2

    .line 51
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, Ljava/lang/String;

    .line 56
    .line 57
    invoke-direct {v1, v2, v3, p1}, LM1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-static {v1}, LH2/h;->i(Ljava/lang/Throwable;)LO1/c;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    new-instance v1, LM1/Q;

    .line 65
    .line 66
    invoke-direct {v1, p1}, LM1/Q;-><init>(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    invoke-interface {v0, v1}, LZ1/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    if-nez v1, :cond_1

    .line 78
    .line 79
    new-instance p1, LM1/a;

    .line 80
    .line 81
    const-string v1, "null-error"

    .line 82
    .line 83
    const-string v3, "Flutter api returned null value for non-null return value."

    .line 84
    .line 85
    invoke-direct {p1, v1, v3, v2}, LM1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-static {p1}, LH2/h;->i(Ljava/lang/Throwable;)LO1/c;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    new-instance v1, LM1/Q;

    .line 93
    .line 94
    invoke-direct {v1, p1}, LM1/Q;-><init>(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-interface {v0, v1}, LZ1/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_1
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    const-string v1, "null cannot be cast to non-null type kotlin.Boolean"

    .line 106
    .line 107
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    check-cast p1, Ljava/lang/Boolean;

    .line 111
    .line 112
    new-instance v1, LM1/Q;

    .line 113
    .line 114
    invoke-direct {v1, p1}, LM1/Q;-><init>(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    invoke-interface {v0, v1}, LZ1/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_2
    new-instance p1, LM1/a;

    .line 122
    .line 123
    const-string v1, "channel-error"

    .line 124
    .line 125
    const-string v3, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm\'."

    .line 126
    .line 127
    invoke-direct {p1, v1, v3, v2}, LM1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-static {p1}, LH2/h;->i(Ljava/lang/Throwable;)LO1/c;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    new-instance v1, LM1/Q;

    .line 135
    .line 136
    invoke-direct {v1, p1}, LM1/Q;-><init>(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    invoke-interface {v0, v1}, LZ1/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    :goto_0
    return-void

    .line 143
    :pswitch_0
    iget-object v0, p0, LM1/I;->l:LM1/P;

    .line 144
    .line 145
    iget-object v0, v0, LM1/P;->l:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v0, LZ1/l;

    .line 148
    .line 149
    instance-of v1, p1, Ljava/util/List;

    .line 150
    .line 151
    const-string v2, ""

    .line 152
    .line 153
    if-eqz v1, :cond_5

    .line 154
    .line 155
    check-cast p1, Ljava/util/List;

    .line 156
    .line 157
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    const/4 v3, 0x1

    .line 162
    const/4 v4, 0x0

    .line 163
    if-le v1, v3, :cond_3

    .line 164
    .line 165
    new-instance v1, LM1/a;

    .line 166
    .line 167
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    const-string v4, "null cannot be cast to non-null type kotlin.String"

    .line 172
    .line 173
    invoke-static {v2, v4}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    check-cast v2, Ljava/lang/String;

    .line 177
    .line 178
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    invoke-static {v3, v4}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    check-cast v3, Ljava/lang/String;

    .line 186
    .line 187
    const/4 v4, 0x2

    .line 188
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    check-cast p1, Ljava/lang/String;

    .line 193
    .line 194
    invoke-direct {v1, v2, v3, p1}, LM1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    invoke-static {v1}, LH2/h;->i(Ljava/lang/Throwable;)LO1/c;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    new-instance v1, LM1/Q;

    .line 202
    .line 203
    invoke-direct {v1, p1}, LM1/Q;-><init>(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    invoke-interface {v0, v1}, LZ1/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    goto :goto_1

    .line 210
    :cond_3
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    if-nez v1, :cond_4

    .line 215
    .line 216
    new-instance p1, LM1/a;

    .line 217
    .line 218
    const-string v1, "null-error"

    .line 219
    .line 220
    const-string v3, "Flutter api returned null value for non-null return value."

    .line 221
    .line 222
    invoke-direct {p1, v1, v3, v2}, LM1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    invoke-static {p1}, LH2/h;->i(Ljava/lang/Throwable;)LO1/c;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    new-instance v1, LM1/Q;

    .line 230
    .line 231
    invoke-direct {v1, p1}, LM1/Q;-><init>(Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    invoke-interface {v0, v1}, LZ1/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    goto :goto_1

    .line 238
    :cond_4
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>"

    .line 243
    .line 244
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    check-cast p1, Ljava/util/List;

    .line 248
    .line 249
    new-instance v1, LM1/Q;

    .line 250
    .line 251
    invoke-direct {v1, p1}, LM1/Q;-><init>(Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    invoke-interface {v0, v1}, LZ1/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    goto :goto_1

    .line 258
    :cond_5
    new-instance p1, LM1/a;

    .line 259
    .line 260
    const-string v1, "channel-error"

    .line 261
    .line 262
    const-string v3, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowFileChooser\'."

    .line 263
    .line 264
    invoke-direct {p1, v1, v3, v2}, LM1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    invoke-static {p1}, LH2/h;->i(Ljava/lang/Throwable;)LO1/c;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    new-instance v1, LM1/Q;

    .line 272
    .line 273
    invoke-direct {v1, p1}, LM1/Q;-><init>(Ljava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    invoke-interface {v0, v1}, LZ1/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    :goto_1
    return-void

    .line 280
    :pswitch_1
    iget-object v0, p0, LM1/I;->l:LM1/P;

    .line 281
    .line 282
    iget-object v0, v0, LM1/P;->l:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast v0, LZ1/l;

    .line 285
    .line 286
    instance-of v1, p1, Ljava/util/List;

    .line 287
    .line 288
    if-eqz v1, :cond_7

    .line 289
    .line 290
    check-cast p1, Ljava/util/List;

    .line 291
    .line 292
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 293
    .line 294
    .line 295
    move-result v1

    .line 296
    const/4 v2, 0x1

    .line 297
    if-le v1, v2, :cond_6

    .line 298
    .line 299
    new-instance v1, LM1/a;

    .line 300
    .line 301
    const/4 v3, 0x0

    .line 302
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v3

    .line 306
    const-string v4, "null cannot be cast to non-null type kotlin.String"

    .line 307
    .line 308
    invoke-static {v3, v4}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    check-cast v3, Ljava/lang/String;

    .line 312
    .line 313
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    invoke-static {v2, v4}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    check-cast v2, Ljava/lang/String;

    .line 321
    .line 322
    const/4 v4, 0x2

    .line 323
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object p1

    .line 327
    check-cast p1, Ljava/lang/String;

    .line 328
    .line 329
    invoke-direct {v1, v3, v2, p1}, LM1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    invoke-static {v1}, LH2/h;->i(Ljava/lang/Throwable;)LO1/c;

    .line 333
    .line 334
    .line 335
    move-result-object p1

    .line 336
    new-instance v1, LM1/Q;

    .line 337
    .line 338
    invoke-direct {v1, p1}, LM1/Q;-><init>(Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    invoke-interface {v0, v1}, LZ1/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    goto :goto_2

    .line 345
    :cond_6
    new-instance p1, LM1/Q;

    .line 346
    .line 347
    sget-object v1, LO1/g;->a:LO1/g;

    .line 348
    .line 349
    invoke-direct {p1, v1}, LM1/Q;-><init>(Ljava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    invoke-interface {v0, p1}, LZ1/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    goto :goto_2

    .line 356
    :cond_7
    new-instance p1, LM1/a;

    .line 357
    .line 358
    const-string v1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsAlert\'."

    .line 359
    .line 360
    const-string v2, ""

    .line 361
    .line 362
    const-string v3, "channel-error"

    .line 363
    .line 364
    invoke-direct {p1, v3, v1, v2}, LM1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    invoke-static {p1}, LH2/h;->i(Ljava/lang/Throwable;)LO1/c;

    .line 368
    .line 369
    .line 370
    move-result-object p1

    .line 371
    new-instance v1, LM1/Q;

    .line 372
    .line 373
    invoke-direct {v1, p1}, LM1/Q;-><init>(Ljava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    invoke-interface {v0, v1}, LZ1/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    :goto_2
    return-void

    .line 380
    :pswitch_2
    iget-object v0, p0, LM1/I;->l:LM1/P;

    .line 381
    .line 382
    iget-object v0, v0, LM1/P;->l:Ljava/lang/Object;

    .line 383
    .line 384
    check-cast v0, LZ1/l;

    .line 385
    .line 386
    instance-of v1, p1, Ljava/util/List;

    .line 387
    .line 388
    if-eqz v1, :cond_9

    .line 389
    .line 390
    check-cast p1, Ljava/util/List;

    .line 391
    .line 392
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 393
    .line 394
    .line 395
    move-result v1

    .line 396
    const/4 v2, 0x0

    .line 397
    const/4 v3, 0x1

    .line 398
    if-le v1, v3, :cond_8

    .line 399
    .line 400
    new-instance v1, LM1/a;

    .line 401
    .line 402
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object v2

    .line 406
    const-string v4, "null cannot be cast to non-null type kotlin.String"

    .line 407
    .line 408
    invoke-static {v2, v4}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    check-cast v2, Ljava/lang/String;

    .line 412
    .line 413
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v3

    .line 417
    invoke-static {v3, v4}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 418
    .line 419
    .line 420
    check-cast v3, Ljava/lang/String;

    .line 421
    .line 422
    const/4 v4, 0x2

    .line 423
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object p1

    .line 427
    check-cast p1, Ljava/lang/String;

    .line 428
    .line 429
    invoke-direct {v1, v2, v3, p1}, LM1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    invoke-static {v1}, LH2/h;->i(Ljava/lang/Throwable;)LO1/c;

    .line 433
    .line 434
    .line 435
    move-result-object p1

    .line 436
    new-instance v1, LM1/Q;

    .line 437
    .line 438
    invoke-direct {v1, p1}, LM1/Q;-><init>(Ljava/lang/Object;)V

    .line 439
    .line 440
    .line 441
    invoke-interface {v0, v1}, LZ1/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    goto :goto_3

    .line 445
    :cond_8
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object p1

    .line 449
    check-cast p1, Ljava/lang/String;

    .line 450
    .line 451
    new-instance v1, LM1/Q;

    .line 452
    .line 453
    invoke-direct {v1, p1}, LM1/Q;-><init>(Ljava/lang/Object;)V

    .line 454
    .line 455
    .line 456
    invoke-interface {v0, v1}, LZ1/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    goto :goto_3

    .line 460
    :cond_9
    new-instance p1, LM1/a;

    .line 461
    .line 462
    const-string v1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsPrompt\'."

    .line 463
    .line 464
    const-string v2, ""

    .line 465
    .line 466
    const-string v3, "channel-error"

    .line 467
    .line 468
    invoke-direct {p1, v3, v1, v2}, LM1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    invoke-static {p1}, LH2/h;->i(Ljava/lang/Throwable;)LO1/c;

    .line 472
    .line 473
    .line 474
    move-result-object p1

    .line 475
    new-instance v1, LM1/Q;

    .line 476
    .line 477
    invoke-direct {v1, p1}, LM1/Q;-><init>(Ljava/lang/Object;)V

    .line 478
    .line 479
    .line 480
    invoke-interface {v0, v1}, LZ1/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    :goto_3
    return-void

    .line 484
    nop

    .line 485
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

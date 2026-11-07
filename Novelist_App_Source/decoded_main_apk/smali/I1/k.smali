.class public final synthetic LI1/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ1/l;


# instance fields
.field public final synthetic k:I

.field public final synthetic l:LA/c;


# direct methods
.method public synthetic constructor <init>(LA/c;I)V
    .locals 0

    .line 1
    iput p2, p0, LI1/k;->k:I

    iput-object p1, p0, LI1/k;->l:LA/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, LI1/k;->k:I

    .line 2
    .line 3
    check-cast p1, LO1/d;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p1, LO1/d;->k:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-static {v0}, LO1/d;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, LI1/k;->l:LA/c;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    instance-of p1, v0, LM1/a;

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    check-cast v0, LM1/a;

    .line 23
    .line 24
    iget-object p1, v0, LM1/a;->k:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v2, v0, LM1/a;->l:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v0, v0, LM1/a;->m:Ljava/lang/Object;

    .line 29
    .line 30
    filled-new-array {p1, v2, v0}, [Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const-string v4, "Cause: "

    .line 60
    .line 61
    const-string v5, ", Stacktrace: "

    .line 62
    .line 63
    invoke-static {v4, v3, v5, v0}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    filled-new-array {p1, v2, v0}, [Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    :goto_0
    invoke-virtual {v1, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_1
    iget-object p1, p1, LO1/d;->k:Ljava/lang/Object;

    .line 80
    .line 81
    instance-of v0, p1, LO1/c;

    .line 82
    .line 83
    if-eqz v0, :cond_2

    .line 84
    .line 85
    const/4 p1, 0x0

    .line 86
    :cond_2
    check-cast p1, Ljava/lang/String;

    .line 87
    .line 88
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {v1, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :goto_1
    sget-object p1, LO1/g;->a:LO1/g;

    .line 96
    .line 97
    return-object p1

    .line 98
    :pswitch_0
    iget-object v0, p1, LO1/d;->k:Ljava/lang/Object;

    .line 99
    .line 100
    invoke-static {v0}, LO1/d;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    iget-object v1, p0, LI1/k;->l:LA/c;

    .line 105
    .line 106
    if-eqz v0, :cond_4

    .line 107
    .line 108
    instance-of p1, v0, LM1/a;

    .line 109
    .line 110
    if-eqz p1, :cond_3

    .line 111
    .line 112
    check-cast v0, LM1/a;

    .line 113
    .line 114
    iget-object p1, v0, LM1/a;->k:Ljava/lang/String;

    .line 115
    .line 116
    iget-object v2, v0, LM1/a;->l:Ljava/lang/String;

    .line 117
    .line 118
    iget-object v0, v0, LM1/a;->m:Ljava/lang/Object;

    .line 119
    .line 120
    filled-new-array {p1, v2, v0}, [Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    goto :goto_2

    .line 129
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    const-string v4, "Cause: "

    .line 150
    .line 151
    const-string v5, ", Stacktrace: "

    .line 152
    .line 153
    invoke-static {v4, v3, v5, v0}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    filled-new-array {p1, v2, v0}, [Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    :goto_2
    invoke-virtual {v1, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_4
    iget-object p1, p1, LO1/d;->k:Ljava/lang/Object;

    .line 170
    .line 171
    instance-of v0, p1, LO1/c;

    .line 172
    .line 173
    if-eqz v0, :cond_5

    .line 174
    .line 175
    const/4 p1, 0x0

    .line 176
    :cond_5
    check-cast p1, Ljava/lang/Boolean;

    .line 177
    .line 178
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-virtual {v1, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    :goto_3
    sget-object p1, LO1/g;->a:LO1/g;

    .line 186
    .line 187
    return-object p1

    .line 188
    :pswitch_1
    iget-object v0, p1, LO1/d;->k:Ljava/lang/Object;

    .line 189
    .line 190
    invoke-static {v0}, LO1/d;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    const/4 v1, 0x0

    .line 195
    iget-object v2, p0, LI1/k;->l:LA/c;

    .line 196
    .line 197
    if-eqz v0, :cond_7

    .line 198
    .line 199
    instance-of p1, v0, LJ1/d;

    .line 200
    .line 201
    if-eqz p1, :cond_6

    .line 202
    .line 203
    check-cast v0, LJ1/d;

    .line 204
    .line 205
    iget-object p1, v0, LJ1/d;->k:Ljava/lang/String;

    .line 206
    .line 207
    iget-object v0, v0, LJ1/d;->l:Ljava/lang/String;

    .line 208
    .line 209
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    goto :goto_4

    .line 218
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    const-string v4, "Cause: "

    .line 239
    .line 240
    const-string v5, ", Stacktrace: "

    .line 241
    .line 242
    invoke-static {v4, v3, v5, v0}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    filled-new-array {p1, v1, v0}, [Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    :goto_4
    invoke-virtual {v2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    goto :goto_6

    .line 258
    :cond_7
    iget-object p1, p1, LO1/d;->k:Ljava/lang/Object;

    .line 259
    .line 260
    instance-of v0, p1, LO1/c;

    .line 261
    .line 262
    if-eqz v0, :cond_8

    .line 263
    .line 264
    goto :goto_5

    .line 265
    :cond_8
    move-object v1, p1

    .line 266
    :goto_5
    check-cast v1, Ljava/util/List;

    .line 267
    .line 268
    invoke-static {v1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    invoke-virtual {v2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    :goto_6
    sget-object p1, LO1/g;->a:LO1/g;

    .line 276
    .line 277
    return-object p1

    .line 278
    :pswitch_2
    iget-object v0, p1, LO1/d;->k:Ljava/lang/Object;

    .line 279
    .line 280
    invoke-static {v0}, LO1/d;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    const/4 v1, 0x0

    .line 285
    iget-object v2, p0, LI1/k;->l:LA/c;

    .line 286
    .line 287
    if-eqz v0, :cond_a

    .line 288
    .line 289
    instance-of p1, v0, LJ1/d;

    .line 290
    .line 291
    if-eqz p1, :cond_9

    .line 292
    .line 293
    check-cast v0, LJ1/d;

    .line 294
    .line 295
    iget-object p1, v0, LJ1/d;->k:Ljava/lang/String;

    .line 296
    .line 297
    iget-object v0, v0, LJ1/d;->l:Ljava/lang/String;

    .line 298
    .line 299
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object p1

    .line 303
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 304
    .line 305
    .line 306
    move-result-object p1

    .line 307
    goto :goto_7

    .line 308
    :cond_9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object p1

    .line 316
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 321
    .line 322
    .line 323
    move-result-object v3

    .line 324
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    const-string v4, "Cause: "

    .line 329
    .line 330
    const-string v5, ", Stacktrace: "

    .line 331
    .line 332
    invoke-static {v4, v3, v5, v0}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    filled-new-array {p1, v1, v0}, [Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object p1

    .line 340
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 341
    .line 342
    .line 343
    move-result-object p1

    .line 344
    :goto_7
    invoke-virtual {v2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    goto :goto_9

    .line 348
    :cond_a
    iget-object p1, p1, LO1/d;->k:Ljava/lang/Object;

    .line 349
    .line 350
    instance-of v0, p1, LO1/c;

    .line 351
    .line 352
    if-eqz v0, :cond_b

    .line 353
    .line 354
    goto :goto_8

    .line 355
    :cond_b
    move-object v1, p1

    .line 356
    :goto_8
    check-cast v1, Ljava/util/List;

    .line 357
    .line 358
    invoke-static {v1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 359
    .line 360
    .line 361
    move-result-object p1

    .line 362
    invoke-virtual {v2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 363
    .line 364
    .line 365
    :goto_9
    sget-object p1, LO1/g;->a:LO1/g;

    .line 366
    .line 367
    return-object p1

    .line 368
    :pswitch_3
    iget-object v0, p1, LO1/d;->k:Ljava/lang/Object;

    .line 369
    .line 370
    invoke-static {v0}, LO1/d;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    const/4 v1, 0x0

    .line 375
    iget-object v2, p0, LI1/k;->l:LA/c;

    .line 376
    .line 377
    if-eqz v0, :cond_d

    .line 378
    .line 379
    instance-of p1, v0, LJ1/d;

    .line 380
    .line 381
    if-eqz p1, :cond_c

    .line 382
    .line 383
    check-cast v0, LJ1/d;

    .line 384
    .line 385
    iget-object p1, v0, LJ1/d;->k:Ljava/lang/String;

    .line 386
    .line 387
    iget-object v0, v0, LJ1/d;->l:Ljava/lang/String;

    .line 388
    .line 389
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object p1

    .line 393
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 394
    .line 395
    .line 396
    move-result-object p1

    .line 397
    goto :goto_a

    .line 398
    :cond_c
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 399
    .line 400
    .line 401
    move-result-object p1

    .line 402
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object p1

    .line 406
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v1

    .line 410
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 411
    .line 412
    .line 413
    move-result-object v3

    .line 414
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    const-string v4, "Cause: "

    .line 419
    .line 420
    const-string v5, ", Stacktrace: "

    .line 421
    .line 422
    invoke-static {v4, v3, v5, v0}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    filled-new-array {p1, v1, v0}, [Ljava/lang/String;

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
    :goto_a
    invoke-virtual {v2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 435
    .line 436
    .line 437
    goto :goto_c

    .line 438
    :cond_d
    iget-object p1, p1, LO1/d;->k:Ljava/lang/Object;

    .line 439
    .line 440
    instance-of v0, p1, LO1/c;

    .line 441
    .line 442
    if-eqz v0, :cond_e

    .line 443
    .line 444
    goto :goto_b

    .line 445
    :cond_e
    move-object v1, p1

    .line 446
    :goto_b
    check-cast v1, Ljava/util/List;

    .line 447
    .line 448
    invoke-static {v1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 449
    .line 450
    .line 451
    move-result-object p1

    .line 452
    invoke-virtual {v2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 453
    .line 454
    .line 455
    :goto_c
    sget-object p1, LO1/g;->a:LO1/g;

    .line 456
    .line 457
    return-object p1

    .line 458
    :pswitch_4
    iget-object p1, p1, LO1/d;->k:Ljava/lang/Object;

    .line 459
    .line 460
    invoke-static {p1}, LO1/d;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 461
    .line 462
    .line 463
    move-result-object p1

    .line 464
    const/4 v0, 0x0

    .line 465
    iget-object v1, p0, LI1/k;->l:LA/c;

    .line 466
    .line 467
    if-eqz p1, :cond_10

    .line 468
    .line 469
    instance-of v2, p1, LI1/d;

    .line 470
    .line 471
    if-eqz v2, :cond_f

    .line 472
    .line 473
    check-cast p1, LI1/d;

    .line 474
    .line 475
    iget-object v2, p1, LI1/d;->k:Ljava/lang/String;

    .line 476
    .line 477
    iget-object p1, p1, LI1/d;->l:Ljava/lang/String;

    .line 478
    .line 479
    filled-new-array {v2, p1, v0}, [Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object p1

    .line 483
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 484
    .line 485
    .line 486
    move-result-object p1

    .line 487
    goto :goto_d

    .line 488
    :cond_f
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v2

    .line 500
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 501
    .line 502
    .line 503
    move-result-object v3

    .line 504
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object p1

    .line 508
    const-string v4, "Cause: "

    .line 509
    .line 510
    const-string v5, ", Stacktrace: "

    .line 511
    .line 512
    invoke-static {v4, v3, v5, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object p1

    .line 516
    filled-new-array {v0, v2, p1}, [Ljava/lang/String;

    .line 517
    .line 518
    .line 519
    move-result-object p1

    .line 520
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 521
    .line 522
    .line 523
    move-result-object p1

    .line 524
    :goto_d
    invoke-virtual {v1, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 525
    .line 526
    .line 527
    goto :goto_e

    .line 528
    :cond_10
    invoke-static {v0}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 529
    .line 530
    .line 531
    move-result-object p1

    .line 532
    invoke-virtual {v1, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 533
    .line 534
    .line 535
    :goto_e
    sget-object p1, LO1/g;->a:LO1/g;

    .line 536
    .line 537
    return-object p1

    .line 538
    :pswitch_5
    iget-object p1, p1, LO1/d;->k:Ljava/lang/Object;

    .line 539
    .line 540
    invoke-static {p1}, LO1/d;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 541
    .line 542
    .line 543
    move-result-object p1

    .line 544
    const/4 v0, 0x0

    .line 545
    iget-object v1, p0, LI1/k;->l:LA/c;

    .line 546
    .line 547
    if-eqz p1, :cond_12

    .line 548
    .line 549
    instance-of v2, p1, LI1/d;

    .line 550
    .line 551
    if-eqz v2, :cond_11

    .line 552
    .line 553
    check-cast p1, LI1/d;

    .line 554
    .line 555
    iget-object v2, p1, LI1/d;->k:Ljava/lang/String;

    .line 556
    .line 557
    iget-object p1, p1, LI1/d;->l:Ljava/lang/String;

    .line 558
    .line 559
    filled-new-array {v2, p1, v0}, [Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    move-result-object p1

    .line 563
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 564
    .line 565
    .line 566
    move-result-object p1

    .line 567
    goto :goto_f

    .line 568
    :cond_11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 569
    .line 570
    .line 571
    move-result-object v0

    .line 572
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object v2

    .line 580
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 581
    .line 582
    .line 583
    move-result-object v3

    .line 584
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 585
    .line 586
    .line 587
    move-result-object p1

    .line 588
    const-string v4, "Cause: "

    .line 589
    .line 590
    const-string v5, ", Stacktrace: "

    .line 591
    .line 592
    invoke-static {v4, v3, v5, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object p1

    .line 596
    filled-new-array {v0, v2, p1}, [Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object p1

    .line 600
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 601
    .line 602
    .line 603
    move-result-object p1

    .line 604
    :goto_f
    invoke-virtual {v1, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 605
    .line 606
    .line 607
    goto :goto_10

    .line 608
    :cond_12
    invoke-static {v0}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 609
    .line 610
    .line 611
    move-result-object p1

    .line 612
    invoke-virtual {v1, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 613
    .line 614
    .line 615
    :goto_10
    sget-object p1, LO1/g;->a:LO1/g;

    .line 616
    .line 617
    return-object p1

    .line 618
    :pswitch_6
    iget-object v0, p1, LO1/d;->k:Ljava/lang/Object;

    .line 619
    .line 620
    invoke-static {v0}, LO1/d;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 621
    .line 622
    .line 623
    move-result-object v0

    .line 624
    const/4 v1, 0x0

    .line 625
    iget-object v2, p0, LI1/k;->l:LA/c;

    .line 626
    .line 627
    if-eqz v0, :cond_14

    .line 628
    .line 629
    instance-of p1, v0, LI1/d;

    .line 630
    .line 631
    if-eqz p1, :cond_13

    .line 632
    .line 633
    check-cast v0, LI1/d;

    .line 634
    .line 635
    iget-object p1, v0, LI1/d;->k:Ljava/lang/String;

    .line 636
    .line 637
    iget-object v0, v0, LI1/d;->l:Ljava/lang/String;

    .line 638
    .line 639
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    move-result-object p1

    .line 643
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 644
    .line 645
    .line 646
    move-result-object p1

    .line 647
    goto :goto_11

    .line 648
    :cond_13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 649
    .line 650
    .line 651
    move-result-object p1

    .line 652
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 653
    .line 654
    .line 655
    move-result-object p1

    .line 656
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 657
    .line 658
    .line 659
    move-result-object v1

    .line 660
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 661
    .line 662
    .line 663
    move-result-object v3

    .line 664
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 665
    .line 666
    .line 667
    move-result-object v0

    .line 668
    const-string v4, "Cause: "

    .line 669
    .line 670
    const-string v5, ", Stacktrace: "

    .line 671
    .line 672
    invoke-static {v4, v3, v5, v0}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 673
    .line 674
    .line 675
    move-result-object v0

    .line 676
    filled-new-array {p1, v1, v0}, [Ljava/lang/String;

    .line 677
    .line 678
    .line 679
    move-result-object p1

    .line 680
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 681
    .line 682
    .line 683
    move-result-object p1

    .line 684
    :goto_11
    invoke-virtual {v2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 685
    .line 686
    .line 687
    goto :goto_13

    .line 688
    :cond_14
    iget-object p1, p1, LO1/d;->k:Ljava/lang/Object;

    .line 689
    .line 690
    instance-of v0, p1, LO1/c;

    .line 691
    .line 692
    if-eqz v0, :cond_15

    .line 693
    .line 694
    goto :goto_12

    .line 695
    :cond_15
    move-object v1, p1

    .line 696
    :goto_12
    check-cast v1, LI1/i;

    .line 697
    .line 698
    invoke-static {v1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 699
    .line 700
    .line 701
    move-result-object p1

    .line 702
    invoke-virtual {v2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 703
    .line 704
    .line 705
    :goto_13
    sget-object p1, LO1/g;->a:LO1/g;

    .line 706
    .line 707
    return-object p1

    .line 708
    :pswitch_7
    iget-object p1, p1, LO1/d;->k:Ljava/lang/Object;

    .line 709
    .line 710
    invoke-static {p1}, LO1/d;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 711
    .line 712
    .line 713
    move-result-object p1

    .line 714
    const/4 v0, 0x0

    .line 715
    iget-object v1, p0, LI1/k;->l:LA/c;

    .line 716
    .line 717
    if-eqz p1, :cond_17

    .line 718
    .line 719
    instance-of v2, p1, LI1/d;

    .line 720
    .line 721
    if-eqz v2, :cond_16

    .line 722
    .line 723
    check-cast p1, LI1/d;

    .line 724
    .line 725
    iget-object v2, p1, LI1/d;->k:Ljava/lang/String;

    .line 726
    .line 727
    iget-object p1, p1, LI1/d;->l:Ljava/lang/String;

    .line 728
    .line 729
    filled-new-array {v2, p1, v0}, [Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    move-result-object p1

    .line 733
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 734
    .line 735
    .line 736
    move-result-object p1

    .line 737
    goto :goto_14

    .line 738
    :cond_16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 739
    .line 740
    .line 741
    move-result-object v0

    .line 742
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 743
    .line 744
    .line 745
    move-result-object v0

    .line 746
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 747
    .line 748
    .line 749
    move-result-object v2

    .line 750
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 751
    .line 752
    .line 753
    move-result-object v3

    .line 754
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 755
    .line 756
    .line 757
    move-result-object p1

    .line 758
    const-string v4, "Cause: "

    .line 759
    .line 760
    const-string v5, ", Stacktrace: "

    .line 761
    .line 762
    invoke-static {v4, v3, v5, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 763
    .line 764
    .line 765
    move-result-object p1

    .line 766
    filled-new-array {v0, v2, p1}, [Ljava/lang/String;

    .line 767
    .line 768
    .line 769
    move-result-object p1

    .line 770
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 771
    .line 772
    .line 773
    move-result-object p1

    .line 774
    :goto_14
    invoke-virtual {v1, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 775
    .line 776
    .line 777
    goto :goto_15

    .line 778
    :cond_17
    invoke-static {v0}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 779
    .line 780
    .line 781
    move-result-object p1

    .line 782
    invoke-virtual {v1, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 783
    .line 784
    .line 785
    :goto_15
    sget-object p1, LO1/g;->a:LO1/g;

    .line 786
    .line 787
    return-object p1

    .line 788
    :pswitch_8
    iget-object v0, p1, LO1/d;->k:Ljava/lang/Object;

    .line 789
    .line 790
    invoke-static {v0}, LO1/d;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 791
    .line 792
    .line 793
    move-result-object v0

    .line 794
    const/4 v1, 0x0

    .line 795
    iget-object v2, p0, LI1/k;->l:LA/c;

    .line 796
    .line 797
    if-eqz v0, :cond_19

    .line 798
    .line 799
    instance-of p1, v0, LI1/d;

    .line 800
    .line 801
    if-eqz p1, :cond_18

    .line 802
    .line 803
    check-cast v0, LI1/d;

    .line 804
    .line 805
    iget-object p1, v0, LI1/d;->k:Ljava/lang/String;

    .line 806
    .line 807
    iget-object v0, v0, LI1/d;->l:Ljava/lang/String;

    .line 808
    .line 809
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 810
    .line 811
    .line 812
    move-result-object p1

    .line 813
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 814
    .line 815
    .line 816
    move-result-object p1

    .line 817
    goto :goto_16

    .line 818
    :cond_18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 819
    .line 820
    .line 821
    move-result-object p1

    .line 822
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 823
    .line 824
    .line 825
    move-result-object p1

    .line 826
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 827
    .line 828
    .line 829
    move-result-object v1

    .line 830
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 831
    .line 832
    .line 833
    move-result-object v3

    .line 834
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 835
    .line 836
    .line 837
    move-result-object v0

    .line 838
    const-string v4, "Cause: "

    .line 839
    .line 840
    const-string v5, ", Stacktrace: "

    .line 841
    .line 842
    invoke-static {v4, v3, v5, v0}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 843
    .line 844
    .line 845
    move-result-object v0

    .line 846
    filled-new-array {p1, v1, v0}, [Ljava/lang/String;

    .line 847
    .line 848
    .line 849
    move-result-object p1

    .line 850
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 851
    .line 852
    .line 853
    move-result-object p1

    .line 854
    :goto_16
    invoke-virtual {v2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 855
    .line 856
    .line 857
    goto :goto_18

    .line 858
    :cond_19
    iget-object p1, p1, LO1/d;->k:Ljava/lang/Object;

    .line 859
    .line 860
    instance-of v0, p1, LO1/c;

    .line 861
    .line 862
    if-eqz v0, :cond_1a

    .line 863
    .line 864
    goto :goto_17

    .line 865
    :cond_1a
    move-object v1, p1

    .line 866
    :goto_17
    check-cast v1, LI1/c;

    .line 867
    .line 868
    invoke-static {v1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 869
    .line 870
    .line 871
    move-result-object p1

    .line 872
    invoke-virtual {v2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 873
    .line 874
    .line 875
    :goto_18
    sget-object p1, LO1/g;->a:LO1/g;

    .line 876
    .line 877
    return-object p1

    .line 878
    nop

    .line 879
    :pswitch_data_0
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

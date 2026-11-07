.class public final synthetic LM1/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC1/b;


# instance fields
.field public final synthetic k:I

.field public final synthetic l:LM1/n;


# direct methods
.method public synthetic constructor <init>(LM1/n;I)V
    .locals 0

    .line 1
    iput p2, p0, LM1/C;->k:I

    iput-object p1, p0, LM1/C;->l:LM1/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;LA/c;)V
    .locals 5

    .line 1
    iget v0, p0, LM1/C;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LM1/C;->l:LM1/n;

    .line 7
    .line 8
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 9
    .line 10
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    check-cast p1, Ljava/util/List;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "null cannot be cast to non-null type android.webkit.CookieManager"

    .line 21
    .line 22
    invoke-static {v1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    check-cast v1, Landroid/webkit/CookieManager;

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string v2, "null cannot be cast to non-null type kotlin.String"

    .line 33
    .line 34
    invoke-static {p1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    check-cast p1, Ljava/lang/String;

    .line 38
    .line 39
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, p1}, Landroid/webkit/CookieManager;->getCookie(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    instance-of v0, p1, LM1/a;

    .line 53
    .line 54
    if-eqz v0, :cond_0

    .line 55
    .line 56
    check-cast p1, LM1/a;

    .line 57
    .line 58
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 61
    .line 62
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 63
    .line 64
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    goto :goto_0

    .line 73
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    const-string v3, "Cause: "

    .line 94
    .line 95
    const-string v4, ", Stacktrace: "

    .line 96
    .line 97
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    :goto_0
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :pswitch_0
    iget-object v0, p0, LM1/C;->l:LM1/n;

    .line 114
    .line 115
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 116
    .line 117
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    check-cast p1, Ljava/util/List;

    .line 121
    .line 122
    const/4 v1, 0x0

    .line 123
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    const-string v2, "null cannot be cast to non-null type android.webkit.CookieManager"

    .line 128
    .line 129
    invoke-static {v1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    check-cast v1, Landroid/webkit/CookieManager;

    .line 133
    .line 134
    const/4 v2, 0x1

    .line 135
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    const-string v3, "null cannot be cast to non-null type android.webkit.WebView"

    .line 140
    .line 141
    invoke-static {v2, v3}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    check-cast v2, Landroid/webkit/WebView;

    .line 145
    .line 146
    const/4 v3, 0x2

    .line 147
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    const-string v3, "null cannot be cast to non-null type kotlin.Boolean"

    .line 152
    .line 153
    invoke-static {p1, v3}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    check-cast p1, Ljava/lang/Boolean;

    .line 157
    .line 158
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1, v2, p1}, Landroid/webkit/CookieManager;->setAcceptThirdPartyCookies(Landroid/webkit/WebView;Z)V

    .line 166
    .line 167
    .line 168
    const/4 p1, 0x0

    .line 169
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 170
    .line 171
    .line 172
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 173
    goto :goto_1

    .line 174
    :catchall_1
    move-exception p1

    .line 175
    instance-of v0, p1, LM1/a;

    .line 176
    .line 177
    if-eqz v0, :cond_1

    .line 178
    .line 179
    check-cast p1, LM1/a;

    .line 180
    .line 181
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 182
    .line 183
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 184
    .line 185
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 186
    .line 187
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    goto :goto_1

    .line 196
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    const-string v3, "Cause: "

    .line 217
    .line 218
    const-string v4, ", Stacktrace: "

    .line 219
    .line 220
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    :goto_1
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    return-void

    .line 236
    :pswitch_1
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 237
    .line 238
    invoke-static {p1, v0}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    check-cast p1, Ljava/util/List;

    .line 242
    .line 243
    const/4 v0, 0x0

    .line 244
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    const-string v0, "null cannot be cast to non-null type android.webkit.CookieManager"

    .line 249
    .line 250
    invoke-static {p1, v0}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    check-cast p1, Landroid/webkit/CookieManager;

    .line 254
    .line 255
    new-instance v0, LI1/k;

    .line 256
    .line 257
    const/16 v1, 0x8

    .line 258
    .line 259
    invoke-direct {v0, p2, v1}, LI1/k;-><init>(LA/c;I)V

    .line 260
    .line 261
    .line 262
    iget-object p2, p0, LM1/C;->l:LM1/n;

    .line 263
    .line 264
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    new-instance p2, LM1/m;

    .line 268
    .line 269
    const/4 v1, 0x0

    .line 270
    invoke-direct {p2, v0, v1}, LM1/m;-><init>(LZ1/l;I)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {p1, p2}, Landroid/webkit/CookieManager;->removeAllCookies(Landroid/webkit/ValueCallback;)V

    .line 274
    .line 275
    .line 276
    return-void

    .line 277
    :pswitch_2
    iget-object v0, p0, LM1/C;->l:LM1/n;

    .line 278
    .line 279
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 280
    .line 281
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    check-cast p1, Ljava/util/List;

    .line 285
    .line 286
    const/4 v1, 0x0

    .line 287
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    const-string v2, "null cannot be cast to non-null type android.webkit.CookieManager"

    .line 292
    .line 293
    invoke-static {v1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    check-cast v1, Landroid/webkit/CookieManager;

    .line 297
    .line 298
    const/4 v2, 0x1

    .line 299
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    const-string v3, "null cannot be cast to non-null type kotlin.String"

    .line 304
    .line 305
    invoke-static {v2, v3}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    check-cast v2, Ljava/lang/String;

    .line 309
    .line 310
    const/4 v4, 0x2

    .line 311
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object p1

    .line 315
    invoke-static {p1, v3}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    check-cast p1, Ljava/lang/String;

    .line 319
    .line 320
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v1, v2, p1}, Landroid/webkit/CookieManager;->setCookie(Ljava/lang/String;Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    const/4 p1, 0x0

    .line 327
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 328
    .line 329
    .line 330
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 331
    goto :goto_2

    .line 332
    :catchall_2
    move-exception p1

    .line 333
    instance-of v0, p1, LM1/a;

    .line 334
    .line 335
    if-eqz v0, :cond_2

    .line 336
    .line 337
    check-cast p1, LM1/a;

    .line 338
    .line 339
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 340
    .line 341
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 342
    .line 343
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 344
    .line 345
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object p1

    .line 349
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 350
    .line 351
    .line 352
    move-result-object p1

    .line 353
    goto :goto_2

    .line 354
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v1

    .line 366
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 367
    .line 368
    .line 369
    move-result-object v2

    .line 370
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object p1

    .line 374
    const-string v3, "Cause: "

    .line 375
    .line 376
    const-string v4, ", Stacktrace: "

    .line 377
    .line 378
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object p1

    .line 382
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object p1

    .line 386
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 387
    .line 388
    .line 389
    move-result-object p1

    .line 390
    :goto_2
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    return-void

    .line 394
    :pswitch_3
    iget-object v0, p0, LM1/C;->l:LM1/n;

    .line 395
    .line 396
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 397
    .line 398
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    check-cast p1, Ljava/util/List;

    .line 402
    .line 403
    const/4 v1, 0x0

    .line 404
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object p1

    .line 408
    const-string v1, "null cannot be cast to non-null type kotlin.Long"

    .line 409
    .line 410
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    check-cast p1, Ljava/lang/Long;

    .line 414
    .line 415
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 416
    .line 417
    .line 418
    move-result-wide v1

    .line 419
    :try_start_3
    iget-object p1, v0, LM1/n;->a:LM1/O;

    .line 420
    .line 421
    iget-object p1, p1, LM1/O;->c:Ljava/lang/Object;

    .line 422
    .line 423
    check-cast p1, LM1/d;

    .line 424
    .line 425
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    invoke-virtual {p1, v1, v2, v0}, LM1/d;->a(JLjava/lang/Object;)V

    .line 430
    .line 431
    .line 432
    const/4 p1, 0x0

    .line 433
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 434
    .line 435
    .line 436
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 437
    goto :goto_3

    .line 438
    :catchall_3
    move-exception p1

    .line 439
    instance-of v0, p1, LM1/a;

    .line 440
    .line 441
    if-eqz v0, :cond_3

    .line 442
    .line 443
    check-cast p1, LM1/a;

    .line 444
    .line 445
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 446
    .line 447
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 448
    .line 449
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 450
    .line 451
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object p1

    .line 455
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 456
    .line 457
    .line 458
    move-result-object p1

    .line 459
    goto :goto_3

    .line 460
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object v1

    .line 472
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 473
    .line 474
    .line 475
    move-result-object v2

    .line 476
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object p1

    .line 480
    const-string v3, "Cause: "

    .line 481
    .line 482
    const-string v4, ", Stacktrace: "

    .line 483
    .line 484
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object p1

    .line 488
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move-result-object p1

    .line 492
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 493
    .line 494
    .line 495
    move-result-object p1

    .line 496
    :goto_3
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 497
    .line 498
    .line 499
    return-void

    .line 500
    nop

    .line 501
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

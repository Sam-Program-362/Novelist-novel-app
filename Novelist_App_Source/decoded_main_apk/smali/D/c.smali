.class public final synthetic LD/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC1/b;
.implements LC1/c;


# instance fields
.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LD/c;->k:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, LD/c;->k:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Landroid/content/Context;)LY0/b;
    .locals 2

    .line 1
    new-instance v0, LY0/b;

    .line 2
    .line 3
    invoke-static {p0}, LM0/r;->f(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, LF0/k;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, p0, v1}, LY0/b;-><init>(Landroid/content/Context;LF0/k;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Object;LA/c;)V
    .locals 5

    .line 1
    iget v0, p0, LD/c;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 7
    .line 8
    invoke-static {p1, v0}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    check-cast p1, Ljava/util/List;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-string v0, "null cannot be cast to non-null type android.webkit.WebStorage"

    .line 19
    .line 20
    invoke-static {p1, v0}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    check-cast p1, Landroid/webkit/WebStorage;

    .line 24
    .line 25
    :try_start_0
    invoke-virtual {p1}, Landroid/webkit/WebStorage;->deleteAllData()V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    instance-of v0, p1, LM1/a;

    .line 36
    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    check-cast p1, LM1/a;

    .line 40
    .line 41
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 44
    .line 45
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 46
    .line 47
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    const-string v3, "Cause: "

    .line 77
    .line 78
    const-string v4, ", Stacktrace: "

    .line 79
    .line 80
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    :goto_0
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :pswitch_1
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 97
    .line 98
    invoke-static {p1, v0}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    check-cast p1, Ljava/util/List;

    .line 102
    .line 103
    const/4 v0, 0x0

    .line 104
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    const-string v1, "null cannot be cast to non-null type android.webkit.WebSettings"

    .line 109
    .line 110
    invoke-static {v0, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    check-cast v0, Landroid/webkit/WebSettings;

    .line 114
    .line 115
    const/4 v1, 0x1

    .line 116
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    const-string v1, "null cannot be cast to non-null type kotlin.Boolean"

    .line 121
    .line 122
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    check-cast p1, Ljava/lang/Boolean;

    .line 126
    .line 127
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    :try_start_1
    invoke-static {v0, p1}, LM1/A;->l(Landroid/webkit/WebSettings;Z)V

    .line 132
    .line 133
    .line 134
    const/4 p1, 0x0

    .line 135
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 136
    .line 137
    .line 138
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 139
    goto :goto_1

    .line 140
    :catchall_1
    move-exception p1

    .line 141
    instance-of v0, p1, LM1/a;

    .line 142
    .line 143
    if-eqz v0, :cond_1

    .line 144
    .line 145
    check-cast p1, LM1/a;

    .line 146
    .line 147
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 148
    .line 149
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 150
    .line 151
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 152
    .line 153
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    goto :goto_1

    .line 162
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    const-string v3, "Cause: "

    .line 183
    .line 184
    const-string v4, ", Stacktrace: "

    .line 185
    .line 186
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    :goto_1
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    return-void

    .line 202
    :pswitch_2
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 203
    .line 204
    invoke-static {p1, v0}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    check-cast p1, Ljava/util/List;

    .line 208
    .line 209
    const/4 v0, 0x0

    .line 210
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    const-string v0, "null cannot be cast to non-null type android.webkit.SslErrorHandler"

    .line 215
    .line 216
    invoke-static {p1, v0}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    check-cast p1, Landroid/webkit/SslErrorHandler;

    .line 220
    .line 221
    :try_start_2
    invoke-virtual {p1}, Landroid/webkit/SslErrorHandler;->proceed()V

    .line 222
    .line 223
    .line 224
    const/4 p1, 0x0

    .line 225
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 226
    .line 227
    .line 228
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 229
    goto :goto_2

    .line 230
    :catchall_2
    move-exception p1

    .line 231
    instance-of v0, p1, LM1/a;

    .line 232
    .line 233
    if-eqz v0, :cond_2

    .line 234
    .line 235
    check-cast p1, LM1/a;

    .line 236
    .line 237
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 238
    .line 239
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 240
    .line 241
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 242
    .line 243
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    goto :goto_2

    .line 252
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    const-string v3, "Cause: "

    .line 273
    .line 274
    const-string v4, ", Stacktrace: "

    .line 275
    .line 276
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object p1

    .line 284
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 285
    .line 286
    .line 287
    move-result-object p1

    .line 288
    :goto_2
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    return-void

    .line 292
    :pswitch_3
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 293
    .line 294
    invoke-static {p1, v0}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    check-cast p1, Ljava/util/List;

    .line 298
    .line 299
    const/4 v0, 0x0

    .line 300
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object p1

    .line 304
    const-string v0, "null cannot be cast to non-null type android.webkit.SslErrorHandler"

    .line 305
    .line 306
    invoke-static {p1, v0}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    check-cast p1, Landroid/webkit/SslErrorHandler;

    .line 310
    .line 311
    :try_start_3
    invoke-virtual {p1}, Landroid/webkit/SslErrorHandler;->cancel()V

    .line 312
    .line 313
    .line 314
    const/4 p1, 0x0

    .line 315
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 316
    .line 317
    .line 318
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 319
    goto :goto_3

    .line 320
    :catchall_3
    move-exception p1

    .line 321
    instance-of v0, p1, LM1/a;

    .line 322
    .line 323
    if-eqz v0, :cond_3

    .line 324
    .line 325
    check-cast p1, LM1/a;

    .line 326
    .line 327
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 328
    .line 329
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 330
    .line 331
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 332
    .line 333
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object p1

    .line 337
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 338
    .line 339
    .line 340
    move-result-object p1

    .line 341
    goto :goto_3

    .line 342
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v1

    .line 354
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 355
    .line 356
    .line 357
    move-result-object v2

    .line 358
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object p1

    .line 362
    const-string v3, "Cause: "

    .line 363
    .line 364
    const-string v4, ", Stacktrace: "

    .line 365
    .line 366
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object p1

    .line 370
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object p1

    .line 374
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 375
    .line 376
    .line 377
    move-result-object p1

    .line 378
    :goto_3
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 379
    .line 380
    .line 381
    return-void

    .line 382
    :pswitch_4
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 383
    .line 384
    invoke-static {p1, v0}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    check-cast p1, Ljava/util/List;

    .line 388
    .line 389
    const/4 v0, 0x0

    .line 390
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object p1

    .line 394
    const-string v0, "null cannot be cast to non-null type android.net.http.SslError"

    .line 395
    .line 396
    invoke-static {p1, v0}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    check-cast p1, Landroid/net/http/SslError;

    .line 400
    .line 401
    :try_start_4
    invoke-virtual {p1}, Landroid/net/http/SslError;->getPrimaryError()I

    .line 402
    .line 403
    .line 404
    move-result p1

    .line 405
    if-eqz p1, :cond_9

    .line 406
    .line 407
    const/4 v0, 0x1

    .line 408
    if-eq p1, v0, :cond_8

    .line 409
    .line 410
    const/4 v0, 0x2

    .line 411
    if-eq p1, v0, :cond_7

    .line 412
    .line 413
    const/4 v0, 0x3

    .line 414
    if-eq p1, v0, :cond_6

    .line 415
    .line 416
    const/4 v0, 0x4

    .line 417
    if-eq p1, v0, :cond_5

    .line 418
    .line 419
    const/4 v0, 0x5

    .line 420
    if-eq p1, v0, :cond_4

    .line 421
    .line 422
    sget-object p1, LM1/S;->s:LM1/S;

    .line 423
    .line 424
    goto :goto_4

    .line 425
    :cond_4
    sget-object p1, LM1/S;->p:LM1/S;

    .line 426
    .line 427
    goto :goto_4

    .line 428
    :cond_5
    sget-object p1, LM1/S;->m:LM1/S;

    .line 429
    .line 430
    goto :goto_4

    .line 431
    :cond_6
    sget-object p1, LM1/S;->r:LM1/S;

    .line 432
    .line 433
    goto :goto_4

    .line 434
    :cond_7
    sget-object p1, LM1/S;->o:LM1/S;

    .line 435
    .line 436
    goto :goto_4

    .line 437
    :cond_8
    sget-object p1, LM1/S;->n:LM1/S;

    .line 438
    .line 439
    goto :goto_4

    .line 440
    :cond_9
    sget-object p1, LM1/S;->q:LM1/S;

    .line 441
    .line 442
    :goto_4
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 443
    .line 444
    .line 445
    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 446
    goto :goto_5

    .line 447
    :catchall_4
    move-exception p1

    .line 448
    instance-of v0, p1, LM1/a;

    .line 449
    .line 450
    if-eqz v0, :cond_a

    .line 451
    .line 452
    check-cast p1, LM1/a;

    .line 453
    .line 454
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 455
    .line 456
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 457
    .line 458
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 459
    .line 460
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object p1

    .line 464
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 465
    .line 466
    .line 467
    move-result-object p1

    .line 468
    goto :goto_5

    .line 469
    :cond_a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 482
    .line 483
    .line 484
    move-result-object v2

    .line 485
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object p1

    .line 489
    const-string v3, "Cause: "

    .line 490
    .line 491
    const-string v4, ", Stacktrace: "

    .line 492
    .line 493
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object p1

    .line 497
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object p1

    .line 501
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 502
    .line 503
    .line 504
    move-result-object p1

    .line 505
    :goto_5
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 506
    .line 507
    .line 508
    return-void

    .line 509
    :pswitch_5
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 510
    .line 511
    invoke-static {p1, v0}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 512
    .line 513
    .line 514
    check-cast p1, Ljava/util/List;

    .line 515
    .line 516
    const/4 v0, 0x0

    .line 517
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object p1

    .line 521
    const-string v0, "null cannot be cast to non-null type android.webkit.PermissionRequest"

    .line 522
    .line 523
    invoke-static {p1, v0}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 524
    .line 525
    .line 526
    check-cast p1, Landroid/webkit/PermissionRequest;

    .line 527
    .line 528
    :try_start_5
    invoke-virtual {p1}, Landroid/webkit/PermissionRequest;->deny()V

    .line 529
    .line 530
    .line 531
    const/4 p1, 0x0

    .line 532
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 533
    .line 534
    .line 535
    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 536
    goto :goto_6

    .line 537
    :catchall_5
    move-exception p1

    .line 538
    instance-of v0, p1, LM1/a;

    .line 539
    .line 540
    if-eqz v0, :cond_b

    .line 541
    .line 542
    check-cast p1, LM1/a;

    .line 543
    .line 544
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 545
    .line 546
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 547
    .line 548
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 549
    .line 550
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object p1

    .line 554
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 555
    .line 556
    .line 557
    move-result-object p1

    .line 558
    goto :goto_6

    .line 559
    :cond_b
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 568
    .line 569
    .line 570
    move-result-object v1

    .line 571
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 572
    .line 573
    .line 574
    move-result-object v2

    .line 575
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 576
    .line 577
    .line 578
    move-result-object p1

    .line 579
    const-string v3, "Cause: "

    .line 580
    .line 581
    const-string v4, ", Stacktrace: "

    .line 582
    .line 583
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object p1

    .line 587
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 588
    .line 589
    .line 590
    move-result-object p1

    .line 591
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 592
    .line 593
    .line 594
    move-result-object p1

    .line 595
    :goto_6
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 596
    .line 597
    .line 598
    return-void

    .line 599
    :pswitch_6
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 600
    .line 601
    invoke-static {p1, v0}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 602
    .line 603
    .line 604
    check-cast p1, Ljava/util/List;

    .line 605
    .line 606
    const/4 v0, 0x0

    .line 607
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    move-result-object v1

    .line 611
    const-string v2, "null cannot be cast to non-null type android.webkit.PermissionRequest"

    .line 612
    .line 613
    invoke-static {v1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 614
    .line 615
    .line 616
    check-cast v1, Landroid/webkit/PermissionRequest;

    .line 617
    .line 618
    const/4 v2, 0x1

    .line 619
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object p1

    .line 623
    const-string v2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>"

    .line 624
    .line 625
    invoke-static {p1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 626
    .line 627
    .line 628
    check-cast p1, Ljava/util/List;

    .line 629
    .line 630
    :try_start_6
    new-array v0, v0, [Ljava/lang/String;

    .line 631
    .line 632
    invoke-interface {p1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 633
    .line 634
    .line 635
    move-result-object p1

    .line 636
    check-cast p1, [Ljava/lang/String;

    .line 637
    .line 638
    invoke-virtual {v1, p1}, Landroid/webkit/PermissionRequest;->grant([Ljava/lang/String;)V

    .line 639
    .line 640
    .line 641
    const/4 p1, 0x0

    .line 642
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 643
    .line 644
    .line 645
    move-result-object p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 646
    goto :goto_7

    .line 647
    :catchall_6
    move-exception p1

    .line 648
    instance-of v0, p1, LM1/a;

    .line 649
    .line 650
    if-eqz v0, :cond_c

    .line 651
    .line 652
    check-cast p1, LM1/a;

    .line 653
    .line 654
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 655
    .line 656
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 657
    .line 658
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 659
    .line 660
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 661
    .line 662
    .line 663
    move-result-object p1

    .line 664
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 665
    .line 666
    .line 667
    move-result-object p1

    .line 668
    goto :goto_7

    .line 669
    :cond_c
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 670
    .line 671
    .line 672
    move-result-object v0

    .line 673
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 674
    .line 675
    .line 676
    move-result-object v0

    .line 677
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 678
    .line 679
    .line 680
    move-result-object v1

    .line 681
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 682
    .line 683
    .line 684
    move-result-object v2

    .line 685
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 686
    .line 687
    .line 688
    move-result-object p1

    .line 689
    const-string v3, "Cause: "

    .line 690
    .line 691
    const-string v4, ", Stacktrace: "

    .line 692
    .line 693
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 694
    .line 695
    .line 696
    move-result-object p1

    .line 697
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 698
    .line 699
    .line 700
    move-result-object p1

    .line 701
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 702
    .line 703
    .line 704
    move-result-object p1

    .line 705
    :goto_7
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 706
    .line 707
    .line 708
    return-void

    .line 709
    :pswitch_7
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 710
    .line 711
    invoke-static {p1, v0}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 712
    .line 713
    .line 714
    check-cast p1, Ljava/util/List;

    .line 715
    .line 716
    const/4 v0, 0x0

    .line 717
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    move-result-object v0

    .line 721
    const-string v1, "null cannot be cast to non-null type android.webkit.GeolocationPermissions.Callback"

    .line 722
    .line 723
    invoke-static {v0, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 724
    .line 725
    .line 726
    check-cast v0, Landroid/webkit/GeolocationPermissions$Callback;

    .line 727
    .line 728
    const/4 v1, 0x1

    .line 729
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    move-result-object v1

    .line 733
    const-string v2, "null cannot be cast to non-null type kotlin.String"

    .line 734
    .line 735
    invoke-static {v1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 736
    .line 737
    .line 738
    check-cast v1, Ljava/lang/String;

    .line 739
    .line 740
    const/4 v2, 0x2

    .line 741
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 742
    .line 743
    .line 744
    move-result-object v2

    .line 745
    const-string v3, "null cannot be cast to non-null type kotlin.Boolean"

    .line 746
    .line 747
    invoke-static {v2, v3}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 748
    .line 749
    .line 750
    check-cast v2, Ljava/lang/Boolean;

    .line 751
    .line 752
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 753
    .line 754
    .line 755
    move-result v2

    .line 756
    const/4 v4, 0x3

    .line 757
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    move-result-object p1

    .line 761
    invoke-static {p1, v3}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 762
    .line 763
    .line 764
    check-cast p1, Ljava/lang/Boolean;

    .line 765
    .line 766
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 767
    .line 768
    .line 769
    move-result p1

    .line 770
    :try_start_7
    invoke-interface {v0, v1, v2, p1}, Landroid/webkit/GeolocationPermissions$Callback;->invoke(Ljava/lang/String;ZZ)V

    .line 771
    .line 772
    .line 773
    const/4 p1, 0x0

    .line 774
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 775
    .line 776
    .line 777
    move-result-object p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 778
    goto :goto_8

    .line 779
    :catchall_7
    move-exception p1

    .line 780
    instance-of v0, p1, LM1/a;

    .line 781
    .line 782
    if-eqz v0, :cond_d

    .line 783
    .line 784
    check-cast p1, LM1/a;

    .line 785
    .line 786
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 787
    .line 788
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 789
    .line 790
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 791
    .line 792
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 793
    .line 794
    .line 795
    move-result-object p1

    .line 796
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 797
    .line 798
    .line 799
    move-result-object p1

    .line 800
    goto :goto_8

    .line 801
    :cond_d
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 802
    .line 803
    .line 804
    move-result-object v0

    .line 805
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 806
    .line 807
    .line 808
    move-result-object v0

    .line 809
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 810
    .line 811
    .line 812
    move-result-object v1

    .line 813
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 814
    .line 815
    .line 816
    move-result-object v2

    .line 817
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 818
    .line 819
    .line 820
    move-result-object p1

    .line 821
    const-string v3, "Cause: "

    .line 822
    .line 823
    const-string v4, ", Stacktrace: "

    .line 824
    .line 825
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 826
    .line 827
    .line 828
    move-result-object p1

    .line 829
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 830
    .line 831
    .line 832
    move-result-object p1

    .line 833
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 834
    .line 835
    .line 836
    move-result-object p1

    .line 837
    :goto_8
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 838
    .line 839
    .line 840
    return-void

    .line 841
    :pswitch_8
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 842
    .line 843
    invoke-static {p1, v0}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 844
    .line 845
    .line 846
    check-cast p1, Ljava/util/List;

    .line 847
    .line 848
    const/4 v0, 0x0

    .line 849
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 850
    .line 851
    .line 852
    move-result-object p1

    .line 853
    const-string v0, "null cannot be cast to non-null type android.webkit.WebChromeClient.CustomViewCallback"

    .line 854
    .line 855
    invoke-static {p1, v0}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 856
    .line 857
    .line 858
    check-cast p1, Landroid/webkit/WebChromeClient$CustomViewCallback;

    .line 859
    .line 860
    :try_start_8
    invoke-interface {p1}, Landroid/webkit/WebChromeClient$CustomViewCallback;->onCustomViewHidden()V

    .line 861
    .line 862
    .line 863
    const/4 p1, 0x0

    .line 864
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 865
    .line 866
    .line 867
    move-result-object p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 868
    goto :goto_9

    .line 869
    :catchall_8
    move-exception p1

    .line 870
    instance-of v0, p1, LM1/a;

    .line 871
    .line 872
    if-eqz v0, :cond_e

    .line 873
    .line 874
    check-cast p1, LM1/a;

    .line 875
    .line 876
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 877
    .line 878
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 879
    .line 880
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 881
    .line 882
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 883
    .line 884
    .line 885
    move-result-object p1

    .line 886
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 887
    .line 888
    .line 889
    move-result-object p1

    .line 890
    goto :goto_9

    .line 891
    :cond_e
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 892
    .line 893
    .line 894
    move-result-object v0

    .line 895
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 896
    .line 897
    .line 898
    move-result-object v0

    .line 899
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 900
    .line 901
    .line 902
    move-result-object v1

    .line 903
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 904
    .line 905
    .line 906
    move-result-object v2

    .line 907
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 908
    .line 909
    .line 910
    move-result-object p1

    .line 911
    const-string v3, "Cause: "

    .line 912
    .line 913
    const-string v4, ", Stacktrace: "

    .line 914
    .line 915
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 916
    .line 917
    .line 918
    move-result-object p1

    .line 919
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 920
    .line 921
    .line 922
    move-result-object p1

    .line 923
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 924
    .line 925
    .line 926
    move-result-object p1

    .line 927
    :goto_9
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 928
    .line 929
    .line 930
    return-void

    .line 931
    :pswitch_9
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 932
    .line 933
    invoke-static {p1, v0}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 934
    .line 935
    .line 936
    check-cast p1, Ljava/util/List;

    .line 937
    .line 938
    const/4 v0, 0x0

    .line 939
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 940
    .line 941
    .line 942
    move-result-object p1

    .line 943
    const-string v0, "null cannot be cast to non-null type java.security.cert.Certificate"

    .line 944
    .line 945
    invoke-static {p1, v0}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 946
    .line 947
    .line 948
    check-cast p1, Ljava/security/cert/Certificate;

    .line 949
    .line 950
    :try_start_9
    invoke-virtual {p1}, Ljava/security/cert/Certificate;->getEncoded()[B

    .line 951
    .line 952
    .line 953
    move-result-object p1
    :try_end_9
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 954
    :try_start_a
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 955
    .line 956
    .line 957
    move-result-object p1

    .line 958
    goto :goto_b

    .line 959
    :catchall_9
    move-exception p1

    .line 960
    goto :goto_a

    .line 961
    :catch_0
    move-exception p1

    .line 962
    new-instance v0, Ljava/lang/RuntimeException;

    .line 963
    .line 964
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 965
    .line 966
    .line 967
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_9

    .line 968
    :goto_a
    instance-of v0, p1, LM1/a;

    .line 969
    .line 970
    if-eqz v0, :cond_f

    .line 971
    .line 972
    check-cast p1, LM1/a;

    .line 973
    .line 974
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 975
    .line 976
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 977
    .line 978
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 979
    .line 980
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 981
    .line 982
    .line 983
    move-result-object p1

    .line 984
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 985
    .line 986
    .line 987
    move-result-object p1

    .line 988
    goto :goto_b

    .line 989
    :cond_f
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 990
    .line 991
    .line 992
    move-result-object v0

    .line 993
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 994
    .line 995
    .line 996
    move-result-object v0

    .line 997
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 998
    .line 999
    .line 1000
    move-result-object v1

    .line 1001
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v2

    .line 1005
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1006
    .line 1007
    .line 1008
    move-result-object p1

    .line 1009
    const-string v3, "Cause: "

    .line 1010
    .line 1011
    const-string v4, ", Stacktrace: "

    .line 1012
    .line 1013
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1014
    .line 1015
    .line 1016
    move-result-object p1

    .line 1017
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 1018
    .line 1019
    .line 1020
    move-result-object p1

    .line 1021
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 1022
    .line 1023
    .line 1024
    move-result-object p1

    .line 1025
    :goto_b
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 1026
    .line 1027
    .line 1028
    return-void

    .line 1029
    :pswitch_a
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 1030
    .line 1031
    invoke-static {p1, v0}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1032
    .line 1033
    .line 1034
    check-cast p1, Ljava/util/List;

    .line 1035
    .line 1036
    const/4 v0, 0x0

    .line 1037
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1038
    .line 1039
    .line 1040
    move-result-object p1

    .line 1041
    const-string v0, "null cannot be cast to non-null type android.os.Message"

    .line 1042
    .line 1043
    invoke-static {p1, v0}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1044
    .line 1045
    .line 1046
    check-cast p1, Landroid/os/Message;

    .line 1047
    .line 1048
    :try_start_b
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 1049
    .line 1050
    .line 1051
    const/4 p1, 0x0

    .line 1052
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 1053
    .line 1054
    .line 1055
    move-result-object p1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_a

    .line 1056
    goto :goto_c

    .line 1057
    :catchall_a
    move-exception p1

    .line 1058
    instance-of v0, p1, LM1/a;

    .line 1059
    .line 1060
    if-eqz v0, :cond_10

    .line 1061
    .line 1062
    check-cast p1, LM1/a;

    .line 1063
    .line 1064
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 1065
    .line 1066
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 1067
    .line 1068
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 1069
    .line 1070
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 1071
    .line 1072
    .line 1073
    move-result-object p1

    .line 1074
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 1075
    .line 1076
    .line 1077
    move-result-object p1

    .line 1078
    goto :goto_c

    .line 1079
    :cond_10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v0

    .line 1083
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v0

    .line 1087
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v1

    .line 1091
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v2

    .line 1095
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1096
    .line 1097
    .line 1098
    move-result-object p1

    .line 1099
    const-string v3, "Cause: "

    .line 1100
    .line 1101
    const-string v4, ", Stacktrace: "

    .line 1102
    .line 1103
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1104
    .line 1105
    .line 1106
    move-result-object p1

    .line 1107
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 1108
    .line 1109
    .line 1110
    move-result-object p1

    .line 1111
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 1112
    .line 1113
    .line 1114
    move-result-object p1

    .line 1115
    :goto_c
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 1116
    .line 1117
    .line 1118
    return-void

    .line 1119
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_0
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public e(Ljava/lang/Object;)V
    .locals 7

    .line 1
    iget v0, p0, LD/c;->k:I

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    const-string v2, "channel-error"

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    const-string v6, "null cannot be cast to non-null type kotlin.String"

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    :pswitch_0
    instance-of v0, p1, Ljava/util/List;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    check-cast p1, Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-le v0, v5, :cond_0

    .line 26
    .line 27
    new-instance v0, LM1/a;

    .line 28
    .line 29
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v1, v6}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    check-cast v1, Ljava/lang/String;

    .line 37
    .line 38
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-static {v2, v6}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    check-cast v2, Ljava/lang/String;

    .line 46
    .line 47
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    check-cast p1, Ljava/lang/String;

    .line 52
    .line 53
    invoke-direct {v0, v1, v2, p1}, LM1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-static {v0}, LH2/h;->i(Ljava/lang/Throwable;)LO1/c;

    .line 57
    .line 58
    .line 59
    sget p1, LM1/g0;->c:I

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    sget p1, LM1/g0;->c:I

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageStarted\'."

    .line 66
    .line 67
    invoke-static {v2, p1, v1}, LB1/e;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    sget p1, LM1/g0;->c:I

    .line 71
    .line 72
    :goto_0
    return-void

    .line 73
    :pswitch_1
    instance-of v0, p1, Ljava/util/List;

    .line 74
    .line 75
    if-eqz v0, :cond_3

    .line 76
    .line 77
    check-cast p1, Ljava/util/List;

    .line 78
    .line 79
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-le v0, v5, :cond_2

    .line 84
    .line 85
    new-instance v0, LM1/a;

    .line 86
    .line 87
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-static {v1, v6}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    check-cast v1, Ljava/lang/String;

    .line 95
    .line 96
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-static {v2, v6}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    check-cast v2, Ljava/lang/String;

    .line 104
    .line 105
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    check-cast p1, Ljava/lang/String;

    .line 110
    .line 111
    invoke-direct {v0, v1, v2, p1}, LM1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-static {v0}, LH2/h;->i(Ljava/lang/Throwable;)LO1/c;

    .line 115
    .line 116
    .line 117
    sget p1, LM1/g0;->c:I

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_2
    sget p1, LM1/g0;->c:I

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_3
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedLoginRequest\'."

    .line 124
    .line 125
    invoke-static {v2, p1, v1}, LB1/e;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    sget p1, LM1/g0;->c:I

    .line 129
    .line 130
    :goto_1
    return-void

    .line 131
    :pswitch_2
    instance-of v0, p1, Ljava/util/List;

    .line 132
    .line 133
    if-eqz v0, :cond_5

    .line 134
    .line 135
    check-cast p1, Ljava/util/List;

    .line 136
    .line 137
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-le v0, v5, :cond_4

    .line 142
    .line 143
    new-instance v0, LM1/a;

    .line 144
    .line 145
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-static {v1, v6}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    check-cast v1, Ljava/lang/String;

    .line 153
    .line 154
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    invoke-static {v2, v6}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    check-cast v2, Ljava/lang/String;

    .line 162
    .line 163
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    check-cast p1, Ljava/lang/String;

    .line 168
    .line 169
    invoke-direct {v0, v1, v2, p1}, LM1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-static {v0}, LH2/h;->i(Ljava/lang/Throwable;)LO1/c;

    .line 173
    .line 174
    .line 175
    sget p1, LM1/g0;->c:I

    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_4
    sget p1, LM1/g0;->c:I

    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_5
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onLoadResource\'."

    .line 182
    .line 183
    invoke-static {v2, p1, v1}, LB1/e;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    sget p1, LM1/g0;->c:I

    .line 187
    .line 188
    :goto_2
    return-void

    .line 189
    :pswitch_3
    instance-of v0, p1, Ljava/util/List;

    .line 190
    .line 191
    if-eqz v0, :cond_7

    .line 192
    .line 193
    check-cast p1, Ljava/util/List;

    .line 194
    .line 195
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    if-le v0, v5, :cond_6

    .line 200
    .line 201
    new-instance v0, LM1/a;

    .line 202
    .line 203
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    invoke-static {v1, v6}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    check-cast v1, Ljava/lang/String;

    .line 211
    .line 212
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    invoke-static {v2, v6}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    check-cast v2, Ljava/lang/String;

    .line 220
    .line 221
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    check-cast p1, Ljava/lang/String;

    .line 226
    .line 227
    invoke-direct {v0, v1, v2, p1}, LM1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    invoke-static {v0}, LH2/h;->i(Ljava/lang/Throwable;)LO1/c;

    .line 231
    .line 232
    .line 233
    sget p1, LM1/g0;->c:I

    .line 234
    .line 235
    goto :goto_3

    .line 236
    :cond_6
    sget p1, LM1/g0;->c:I

    .line 237
    .line 238
    goto :goto_3

    .line 239
    :cond_7
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpError\'."

    .line 240
    .line 241
    invoke-static {v2, p1, v1}, LB1/e;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    sget p1, LM1/g0;->c:I

    .line 245
    .line 246
    :goto_3
    return-void

    .line 247
    :pswitch_4
    instance-of v0, p1, Ljava/util/List;

    .line 248
    .line 249
    if-eqz v0, :cond_9

    .line 250
    .line 251
    check-cast p1, Ljava/util/List;

    .line 252
    .line 253
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    if-le v0, v5, :cond_8

    .line 258
    .line 259
    new-instance v0, LM1/a;

    .line 260
    .line 261
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    invoke-static {v1, v6}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    check-cast v1, Ljava/lang/String;

    .line 269
    .line 270
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    invoke-static {v2, v6}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    check-cast v2, Ljava/lang/String;

    .line 278
    .line 279
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    check-cast p1, Ljava/lang/String;

    .line 284
    .line 285
    invoke-direct {v0, v1, v2, p1}, LM1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    invoke-static {v0}, LH2/h;->i(Ljava/lang/Throwable;)LO1/c;

    .line 289
    .line 290
    .line 291
    sget p1, LM1/k0;->n:I

    .line 292
    .line 293
    goto :goto_4

    .line 294
    :cond_8
    sget p1, LM1/k0;->n:I

    .line 295
    .line 296
    goto :goto_4

    .line 297
    :cond_9
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebView.onScrollChanged\'."

    .line 298
    .line 299
    invoke-static {v2, p1, v1}, LB1/e;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    sget p1, LM1/k0;->n:I

    .line 303
    .line 304
    :goto_4
    return-void

    .line 305
    :pswitch_5
    instance-of v0, p1, Ljava/util/List;

    .line 306
    .line 307
    if-eqz v0, :cond_b

    .line 308
    .line 309
    check-cast p1, Ljava/util/List;

    .line 310
    .line 311
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 312
    .line 313
    .line 314
    move-result v0

    .line 315
    if-le v0, v5, :cond_a

    .line 316
    .line 317
    new-instance v0, LM1/a;

    .line 318
    .line 319
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    invoke-static {v1, v6}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    check-cast v1, Ljava/lang/String;

    .line 327
    .line 328
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v2

    .line 332
    invoke-static {v2, v6}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    check-cast v2, Ljava/lang/String;

    .line 336
    .line 337
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object p1

    .line 341
    check-cast p1, Ljava/lang/String;

    .line 342
    .line 343
    invoke-direct {v0, v1, v2, p1}, LM1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    invoke-static {v0}, LH2/h;->i(Ljava/lang/Throwable;)LO1/c;

    .line 347
    .line 348
    .line 349
    sget p1, LM1/Z;->h:I

    .line 350
    .line 351
    goto :goto_5

    .line 352
    :cond_a
    sget p1, LM1/Z;->h:I

    .line 353
    .line 354
    goto :goto_5

    .line 355
    :cond_b
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsHidePrompt\'."

    .line 356
    .line 357
    invoke-static {v2, p1, v1}, LB1/e;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    sget p1, LM1/Z;->h:I

    .line 361
    .line 362
    :goto_5
    return-void

    .line 363
    :pswitch_6
    instance-of v0, p1, Ljava/util/List;

    .line 364
    .line 365
    if-eqz v0, :cond_d

    .line 366
    .line 367
    check-cast p1, Ljava/util/List;

    .line 368
    .line 369
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 370
    .line 371
    .line 372
    move-result v0

    .line 373
    if-le v0, v5, :cond_c

    .line 374
    .line 375
    new-instance v0, LM1/a;

    .line 376
    .line 377
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    invoke-static {v1, v6}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    check-cast v1, Ljava/lang/String;

    .line 385
    .line 386
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    invoke-static {v2, v6}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    check-cast v2, Ljava/lang/String;

    .line 394
    .line 395
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object p1

    .line 399
    check-cast p1, Ljava/lang/String;

    .line 400
    .line 401
    invoke-direct {v0, v1, v2, p1}, LM1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    invoke-static {v0}, LH2/h;->i(Ljava/lang/Throwable;)LO1/c;

    .line 405
    .line 406
    .line 407
    sget p1, LM1/Z;->h:I

    .line 408
    .line 409
    goto :goto_6

    .line 410
    :cond_c
    sget p1, LM1/Z;->h:I

    .line 411
    .line 412
    goto :goto_6

    .line 413
    :cond_d
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsShowPrompt\'."

    .line 414
    .line 415
    invoke-static {v2, p1, v1}, LB1/e;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    sget p1, LM1/Z;->h:I

    .line 419
    .line 420
    :goto_6
    return-void

    .line 421
    :pswitch_7
    instance-of v0, p1, Ljava/util/List;

    .line 422
    .line 423
    if-eqz v0, :cond_f

    .line 424
    .line 425
    check-cast p1, Ljava/util/List;

    .line 426
    .line 427
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 428
    .line 429
    .line 430
    move-result v0

    .line 431
    if-le v0, v5, :cond_e

    .line 432
    .line 433
    new-instance v0, LM1/a;

    .line 434
    .line 435
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v1

    .line 439
    invoke-static {v1, v6}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    check-cast v1, Ljava/lang/String;

    .line 443
    .line 444
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v2

    .line 448
    invoke-static {v2, v6}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    check-cast v2, Ljava/lang/String;

    .line 452
    .line 453
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object p1

    .line 457
    check-cast p1, Ljava/lang/String;

    .line 458
    .line 459
    invoke-direct {v0, v1, v2, p1}, LM1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    invoke-static {v0}, LH2/h;->i(Ljava/lang/Throwable;)LO1/c;

    .line 463
    .line 464
    .line 465
    sget p1, LM1/Z;->h:I

    .line 466
    .line 467
    goto :goto_7

    .line 468
    :cond_e
    sget p1, LM1/Z;->h:I

    .line 469
    .line 470
    goto :goto_7

    .line 471
    :cond_f
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onConsoleMessage\'."

    .line 472
    .line 473
    invoke-static {v2, p1, v1}, LB1/e;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 474
    .line 475
    .line 476
    sget p1, LM1/Z;->h:I

    .line 477
    .line 478
    :goto_7
    return-void

    .line 479
    :pswitch_8
    instance-of v0, p1, Ljava/util/List;

    .line 480
    .line 481
    if-eqz v0, :cond_11

    .line 482
    .line 483
    check-cast p1, Ljava/util/List;

    .line 484
    .line 485
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 486
    .line 487
    .line 488
    move-result v0

    .line 489
    if-le v0, v5, :cond_10

    .line 490
    .line 491
    new-instance v0, LM1/a;

    .line 492
    .line 493
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v1

    .line 497
    invoke-static {v1, v6}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 498
    .line 499
    .line 500
    check-cast v1, Ljava/lang/String;

    .line 501
    .line 502
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v2

    .line 506
    invoke-static {v2, v6}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 507
    .line 508
    .line 509
    check-cast v2, Ljava/lang/String;

    .line 510
    .line 511
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object p1

    .line 515
    check-cast p1, Ljava/lang/String;

    .line 516
    .line 517
    invoke-direct {v0, v1, v2, p1}, LM1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 518
    .line 519
    .line 520
    invoke-static {v0}, LH2/h;->i(Ljava/lang/Throwable;)LO1/c;

    .line 521
    .line 522
    .line 523
    sget p1, LM1/Z;->h:I

    .line 524
    .line 525
    goto :goto_8

    .line 526
    :cond_10
    sget p1, LM1/Z;->h:I

    .line 527
    .line 528
    goto :goto_8

    .line 529
    :cond_11
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowCustomView\'."

    .line 530
    .line 531
    invoke-static {v2, p1, v1}, LB1/e;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 532
    .line 533
    .line 534
    sget p1, LM1/Z;->h:I

    .line 535
    .line 536
    :goto_8
    return-void

    .line 537
    :pswitch_9
    instance-of v0, p1, Ljava/util/List;

    .line 538
    .line 539
    if-eqz v0, :cond_13

    .line 540
    .line 541
    check-cast p1, Ljava/util/List;

    .line 542
    .line 543
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 544
    .line 545
    .line 546
    move-result v0

    .line 547
    if-le v0, v5, :cond_12

    .line 548
    .line 549
    new-instance v0, LM1/a;

    .line 550
    .line 551
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object v1

    .line 555
    invoke-static {v1, v6}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 556
    .line 557
    .line 558
    check-cast v1, Ljava/lang/String;

    .line 559
    .line 560
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object v2

    .line 564
    invoke-static {v2, v6}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 565
    .line 566
    .line 567
    check-cast v2, Ljava/lang/String;

    .line 568
    .line 569
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object p1

    .line 573
    check-cast p1, Ljava/lang/String;

    .line 574
    .line 575
    invoke-direct {v0, v1, v2, p1}, LM1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 576
    .line 577
    .line 578
    invoke-static {v0}, LH2/h;->i(Ljava/lang/Throwable;)LO1/c;

    .line 579
    .line 580
    .line 581
    sget p1, LM1/Z;->h:I

    .line 582
    .line 583
    goto :goto_9

    .line 584
    :cond_12
    sget p1, LM1/Z;->h:I

    .line 585
    .line 586
    goto :goto_9

    .line 587
    :cond_13
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onPermissionRequest\'."

    .line 588
    .line 589
    invoke-static {v2, p1, v1}, LB1/e;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 590
    .line 591
    .line 592
    sget p1, LM1/Z;->h:I

    .line 593
    .line 594
    :goto_9
    return-void

    .line 595
    :pswitch_a
    instance-of v0, p1, Ljava/util/List;

    .line 596
    .line 597
    if-eqz v0, :cond_15

    .line 598
    .line 599
    check-cast p1, Ljava/util/List;

    .line 600
    .line 601
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 602
    .line 603
    .line 604
    move-result v0

    .line 605
    if-le v0, v5, :cond_14

    .line 606
    .line 607
    new-instance v0, LM1/a;

    .line 608
    .line 609
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 610
    .line 611
    .line 612
    move-result-object v1

    .line 613
    invoke-static {v1, v6}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 614
    .line 615
    .line 616
    check-cast v1, Ljava/lang/String;

    .line 617
    .line 618
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 619
    .line 620
    .line 621
    move-result-object v2

    .line 622
    invoke-static {v2, v6}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 623
    .line 624
    .line 625
    check-cast v2, Ljava/lang/String;

    .line 626
    .line 627
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 628
    .line 629
    .line 630
    move-result-object p1

    .line 631
    check-cast p1, Ljava/lang/String;

    .line 632
    .line 633
    invoke-direct {v0, v1, v2, p1}, LM1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 634
    .line 635
    .line 636
    invoke-static {v0}, LH2/h;->i(Ljava/lang/Throwable;)LO1/c;

    .line 637
    .line 638
    .line 639
    sget p1, LM1/Z;->h:I

    .line 640
    .line 641
    goto :goto_a

    .line 642
    :cond_14
    sget p1, LM1/Z;->h:I

    .line 643
    .line 644
    goto :goto_a

    .line 645
    :cond_15
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onProgressChanged\'."

    .line 646
    .line 647
    invoke-static {v2, p1, v1}, LB1/e;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 648
    .line 649
    .line 650
    sget p1, LM1/Z;->h:I

    .line 651
    .line 652
    :goto_a
    return-void

    .line 653
    :pswitch_b
    instance-of v0, p1, Ljava/util/List;

    .line 654
    .line 655
    if-eqz v0, :cond_17

    .line 656
    .line 657
    check-cast p1, Ljava/util/List;

    .line 658
    .line 659
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 660
    .line 661
    .line 662
    move-result v0

    .line 663
    if-le v0, v5, :cond_16

    .line 664
    .line 665
    new-instance v0, LM1/a;

    .line 666
    .line 667
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    move-result-object v1

    .line 671
    invoke-static {v1, v6}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 672
    .line 673
    .line 674
    check-cast v1, Ljava/lang/String;

    .line 675
    .line 676
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 677
    .line 678
    .line 679
    move-result-object v2

    .line 680
    invoke-static {v2, v6}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 681
    .line 682
    .line 683
    check-cast v2, Ljava/lang/String;

    .line 684
    .line 685
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 686
    .line 687
    .line 688
    move-result-object p1

    .line 689
    check-cast p1, Ljava/lang/String;

    .line 690
    .line 691
    invoke-direct {v0, v1, v2, p1}, LM1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 692
    .line 693
    .line 694
    invoke-static {v0}, LH2/h;->i(Ljava/lang/Throwable;)LO1/c;

    .line 695
    .line 696
    .line 697
    sget p1, LM1/Z;->h:I

    .line 698
    .line 699
    goto :goto_b

    .line 700
    :cond_16
    sget p1, LM1/Z;->h:I

    .line 701
    .line 702
    goto :goto_b

    .line 703
    :cond_17
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onHideCustomView\'."

    .line 704
    .line 705
    invoke-static {v2, p1, v1}, LB1/e;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 706
    .line 707
    .line 708
    sget p1, LM1/Z;->h:I

    .line 709
    .line 710
    :goto_b
    return-void

    .line 711
    :pswitch_c
    instance-of v0, p1, Ljava/util/List;

    .line 712
    .line 713
    if-eqz v0, :cond_18

    .line 714
    .line 715
    check-cast p1, Ljava/util/List;

    .line 716
    .line 717
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 718
    .line 719
    .line 720
    move-result v0

    .line 721
    if-le v0, v5, :cond_19

    .line 722
    .line 723
    new-instance v0, LM1/a;

    .line 724
    .line 725
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 726
    .line 727
    .line 728
    move-result-object v1

    .line 729
    invoke-static {v1, v6}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 730
    .line 731
    .line 732
    check-cast v1, Ljava/lang/String;

    .line 733
    .line 734
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 735
    .line 736
    .line 737
    move-result-object v2

    .line 738
    invoke-static {v2, v6}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 739
    .line 740
    .line 741
    check-cast v2, Ljava/lang/String;

    .line 742
    .line 743
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 744
    .line 745
    .line 746
    move-result-object p1

    .line 747
    check-cast p1, Ljava/lang/String;

    .line 748
    .line 749
    invoke-direct {v0, v1, v2, p1}, LM1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 750
    .line 751
    .line 752
    invoke-static {v0}, LH2/h;->i(Ljava/lang/Throwable;)LO1/c;

    .line 753
    .line 754
    .line 755
    goto :goto_c

    .line 756
    :cond_18
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.postMessage\'."

    .line 757
    .line 758
    invoke-static {v2, p1, v1}, LB1/e;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 759
    .line 760
    .line 761
    :cond_19
    :goto_c
    return-void

    .line 762
    :pswitch_d
    instance-of v0, p1, Ljava/util/List;

    .line 763
    .line 764
    if-eqz v0, :cond_1a

    .line 765
    .line 766
    check-cast p1, Ljava/util/List;

    .line 767
    .line 768
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 769
    .line 770
    .line 771
    move-result v0

    .line 772
    if-le v0, v5, :cond_1b

    .line 773
    .line 774
    new-instance v0, LM1/a;

    .line 775
    .line 776
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 777
    .line 778
    .line 779
    move-result-object v1

    .line 780
    invoke-static {v1, v6}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 781
    .line 782
    .line 783
    check-cast v1, Ljava/lang/String;

    .line 784
    .line 785
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 786
    .line 787
    .line 788
    move-result-object v2

    .line 789
    invoke-static {v2, v6}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 790
    .line 791
    .line 792
    check-cast v2, Ljava/lang/String;

    .line 793
    .line 794
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    move-result-object p1

    .line 798
    check-cast p1, Ljava/lang/String;

    .line 799
    .line 800
    invoke-direct {v0, v1, v2, p1}, LM1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 801
    .line 802
    .line 803
    invoke-static {v0}, LH2/h;->i(Ljava/lang/Throwable;)LO1/c;

    .line 804
    .line 805
    .line 806
    goto :goto_d

    .line 807
    :cond_1a
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.DownloadListener.onDownloadStart\'."

    .line 808
    .line 809
    invoke-static {v2, p1, v1}, LB1/e;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 810
    .line 811
    .line 812
    :cond_1b
    :goto_d
    return-void

    .line 813
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_d
        :pswitch_0
        :pswitch_c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

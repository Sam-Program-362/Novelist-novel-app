.class public final synthetic LM1/L;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC1/b;


# instance fields
.field public final synthetic k:I

.field public final synthetic l:LM1/s;


# direct methods
.method public synthetic constructor <init>(LM1/s;I)V
    .locals 0

    .line 1
    iput p2, p0, LM1/L;->k:I

    iput-object p1, p0, LM1/L;->l:LM1/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;LA/c;)V
    .locals 5

    .line 1
    iget v0, p0, LM1/L;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LM1/L;->l:LM1/s;

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
    const-string v2, "null cannot be cast to non-null type android.webkit.WebSettings"

    .line 21
    .line 22
    invoke-static {v1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    check-cast v1, Landroid/webkit/WebSettings;

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
    const-string v2, "null cannot be cast to non-null type kotlin.Boolean"

    .line 33
    .line 34
    invoke-static {p1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    check-cast p1, Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, p1}, Landroid/webkit/WebSettings;->setSupportMultipleWindows(Z)V

    .line 47
    .line 48
    .line 49
    const/4 p1, 0x0

    .line 50
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception p1

    .line 56
    instance-of v0, p1, LM1/a;

    .line 57
    .line 58
    if-eqz v0, :cond_0

    .line 59
    .line 60
    check-cast p1, LM1/a;

    .line 61
    .line 62
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 63
    .line 64
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 65
    .line 66
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 67
    .line 68
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    goto :goto_0

    .line 77
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    const-string v3, "Cause: "

    .line 98
    .line 99
    const-string v4, ", Stacktrace: "

    .line 100
    .line 101
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    :goto_0
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :pswitch_0
    iget-object v0, p0, LM1/L;->l:LM1/s;

    .line 118
    .line 119
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 120
    .line 121
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    check-cast p1, Ljava/util/List;

    .line 125
    .line 126
    const/4 v1, 0x0

    .line 127
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    const-string v2, "null cannot be cast to non-null type android.webkit.WebSettings"

    .line 132
    .line 133
    invoke-static {v1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    check-cast v1, Landroid/webkit/WebSettings;

    .line 137
    .line 138
    const/4 v2, 0x1

    .line 139
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    const-string v2, "null cannot be cast to non-null type kotlin.Boolean"

    .line 144
    .line 145
    invoke-static {p1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    check-cast p1, Ljava/lang/Boolean;

    .line 149
    .line 150
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1, p1}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    .line 158
    .line 159
    .line 160
    const/4 p1, 0x0

    .line 161
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 162
    .line 163
    .line 164
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 165
    goto :goto_1

    .line 166
    :catchall_1
    move-exception p1

    .line 167
    instance-of v0, p1, LM1/a;

    .line 168
    .line 169
    if-eqz v0, :cond_1

    .line 170
    .line 171
    check-cast p1, LM1/a;

    .line 172
    .line 173
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 174
    .line 175
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 176
    .line 177
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 178
    .line 179
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    goto :goto_1

    .line 188
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    const-string v3, "Cause: "

    .line 209
    .line 210
    const-string v4, ", Stacktrace: "

    .line 211
    .line 212
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    :goto_1
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    return-void

    .line 228
    :pswitch_1
    iget-object v0, p0, LM1/L;->l:LM1/s;

    .line 229
    .line 230
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 231
    .line 232
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    check-cast p1, Ljava/util/List;

    .line 236
    .line 237
    const/4 v1, 0x0

    .line 238
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    const-string v3, "null cannot be cast to non-null type android.webkit.WebSettings"

    .line 243
    .line 244
    invoke-static {v2, v3}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    check-cast v2, Landroid/webkit/WebSettings;

    .line 248
    .line 249
    const/4 v3, 0x1

    .line 250
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    const-string v4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode"

    .line 255
    .line 256
    invoke-static {p1, v4}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    check-cast p1, LM1/y;

    .line 260
    .line 261
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 265
    .line 266
    .line 267
    move-result p1

    .line 268
    if-eqz p1, :cond_4

    .line 269
    .line 270
    const/4 v0, 0x2

    .line 271
    if-eq p1, v3, :cond_3

    .line 272
    .line 273
    if-eq p1, v0, :cond_2

    .line 274
    .line 275
    goto :goto_2

    .line 276
    :cond_2
    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    .line 277
    .line 278
    .line 279
    goto :goto_2

    .line 280
    :cond_3
    invoke-virtual {v2, v0}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    .line 281
    .line 282
    .line 283
    goto :goto_2

    .line 284
    :cond_4
    invoke-virtual {v2, v1}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    .line 285
    .line 286
    .line 287
    :goto_2
    const/4 p1, 0x0

    .line 288
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 289
    .line 290
    .line 291
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 292
    goto :goto_3

    .line 293
    :catchall_2
    move-exception p1

    .line 294
    instance-of v0, p1, LM1/a;

    .line 295
    .line 296
    if-eqz v0, :cond_5

    .line 297
    .line 298
    check-cast p1, LM1/a;

    .line 299
    .line 300
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 301
    .line 302
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 303
    .line 304
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 305
    .line 306
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object p1

    .line 310
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 311
    .line 312
    .line 313
    move-result-object p1

    .line 314
    goto :goto_3

    .line 315
    :cond_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object p1

    .line 335
    const-string v3, "Cause: "

    .line 336
    .line 337
    const-string v4, ", Stacktrace: "

    .line 338
    .line 339
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object p1

    .line 343
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object p1

    .line 347
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 348
    .line 349
    .line 350
    move-result-object p1

    .line 351
    :goto_3
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    return-void

    .line 355
    :pswitch_2
    iget-object v0, p0, LM1/L;->l:LM1/s;

    .line 356
    .line 357
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 358
    .line 359
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    check-cast p1, Ljava/util/List;

    .line 363
    .line 364
    const/4 v1, 0x0

    .line 365
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object p1

    .line 369
    const-string v1, "null cannot be cast to non-null type android.webkit.WebSettings"

    .line 370
    .line 371
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    check-cast p1, Landroid/webkit/WebSettings;

    .line 375
    .line 376
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 377
    .line 378
    .line 379
    invoke-virtual {p1}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object p1

    .line 383
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 384
    .line 385
    .line 386
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 387
    goto :goto_4

    .line 388
    :catchall_3
    move-exception p1

    .line 389
    instance-of v0, p1, LM1/a;

    .line 390
    .line 391
    if-eqz v0, :cond_6

    .line 392
    .line 393
    check-cast p1, LM1/a;

    .line 394
    .line 395
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 396
    .line 397
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 398
    .line 399
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 400
    .line 401
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object p1

    .line 405
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 406
    .line 407
    .line 408
    move-result-object p1

    .line 409
    goto :goto_4

    .line 410
    :cond_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v1

    .line 422
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 423
    .line 424
    .line 425
    move-result-object v2

    .line 426
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object p1

    .line 430
    const-string v3, "Cause: "

    .line 431
    .line 432
    const-string v4, ", Stacktrace: "

    .line 433
    .line 434
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object p1

    .line 438
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object p1

    .line 442
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 443
    .line 444
    .line 445
    move-result-object p1

    .line 446
    :goto_4
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 447
    .line 448
    .line 449
    return-void

    .line 450
    :pswitch_3
    iget-object v0, p0, LM1/L;->l:LM1/s;

    .line 451
    .line 452
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 453
    .line 454
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 455
    .line 456
    .line 457
    check-cast p1, Ljava/util/List;

    .line 458
    .line 459
    const/4 v1, 0x0

    .line 460
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v1

    .line 464
    const-string v2, "null cannot be cast to non-null type android.webkit.WebSettings"

    .line 465
    .line 466
    invoke-static {v1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 467
    .line 468
    .line 469
    check-cast v1, Landroid/webkit/WebSettings;

    .line 470
    .line 471
    const/4 v2, 0x1

    .line 472
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object p1

    .line 476
    const-string v2, "null cannot be cast to non-null type kotlin.Long"

    .line 477
    .line 478
    invoke-static {p1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 479
    .line 480
    .line 481
    check-cast p1, Ljava/lang/Long;

    .line 482
    .line 483
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 484
    .line 485
    .line 486
    move-result-wide v2

    .line 487
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 488
    .line 489
    .line 490
    long-to-int p1, v2

    .line 491
    invoke-virtual {v1, p1}, Landroid/webkit/WebSettings;->setTextZoom(I)V

    .line 492
    .line 493
    .line 494
    const/4 p1, 0x0

    .line 495
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 496
    .line 497
    .line 498
    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 499
    goto :goto_5

    .line 500
    :catchall_4
    move-exception p1

    .line 501
    instance-of v0, p1, LM1/a;

    .line 502
    .line 503
    if-eqz v0, :cond_7

    .line 504
    .line 505
    check-cast p1, LM1/a;

    .line 506
    .line 507
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 508
    .line 509
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 510
    .line 511
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 512
    .line 513
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object p1

    .line 517
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 518
    .line 519
    .line 520
    move-result-object p1

    .line 521
    goto :goto_5

    .line 522
    :cond_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    move-result-object v0

    .line 530
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object v1

    .line 534
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 535
    .line 536
    .line 537
    move-result-object v2

    .line 538
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 539
    .line 540
    .line 541
    move-result-object p1

    .line 542
    const-string v3, "Cause: "

    .line 543
    .line 544
    const-string v4, ", Stacktrace: "

    .line 545
    .line 546
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 547
    .line 548
    .line 549
    move-result-object p1

    .line 550
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

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
    :goto_5
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 559
    .line 560
    .line 561
    return-void

    .line 562
    :pswitch_4
    iget-object v0, p0, LM1/L;->l:LM1/s;

    .line 563
    .line 564
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 565
    .line 566
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 567
    .line 568
    .line 569
    check-cast p1, Ljava/util/List;

    .line 570
    .line 571
    const/4 v1, 0x0

    .line 572
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    move-result-object v1

    .line 576
    const-string v2, "null cannot be cast to non-null type android.webkit.WebSettings"

    .line 577
    .line 578
    invoke-static {v1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 579
    .line 580
    .line 581
    check-cast v1, Landroid/webkit/WebSettings;

    .line 582
    .line 583
    const/4 v2, 0x1

    .line 584
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 585
    .line 586
    .line 587
    move-result-object p1

    .line 588
    const-string v2, "null cannot be cast to non-null type kotlin.Boolean"

    .line 589
    .line 590
    invoke-static {p1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 591
    .line 592
    .line 593
    check-cast p1, Ljava/lang/Boolean;

    .line 594
    .line 595
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 596
    .line 597
    .line 598
    move-result p1

    .line 599
    :try_start_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 600
    .line 601
    .line 602
    invoke-virtual {v1, p1}, Landroid/webkit/WebSettings;->setGeolocationEnabled(Z)V

    .line 603
    .line 604
    .line 605
    const/4 p1, 0x0

    .line 606
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 607
    .line 608
    .line 609
    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 610
    goto :goto_6

    .line 611
    :catchall_5
    move-exception p1

    .line 612
    instance-of v0, p1, LM1/a;

    .line 613
    .line 614
    if-eqz v0, :cond_8

    .line 615
    .line 616
    check-cast p1, LM1/a;

    .line 617
    .line 618
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 619
    .line 620
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 621
    .line 622
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 623
    .line 624
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 625
    .line 626
    .line 627
    move-result-object p1

    .line 628
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 629
    .line 630
    .line 631
    move-result-object p1

    .line 632
    goto :goto_6

    .line 633
    :cond_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 634
    .line 635
    .line 636
    move-result-object v0

    .line 637
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    move-result-object v0

    .line 641
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 642
    .line 643
    .line 644
    move-result-object v1

    .line 645
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 646
    .line 647
    .line 648
    move-result-object v2

    .line 649
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 650
    .line 651
    .line 652
    move-result-object p1

    .line 653
    const-string v3, "Cause: "

    .line 654
    .line 655
    const-string v4, ", Stacktrace: "

    .line 656
    .line 657
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 658
    .line 659
    .line 660
    move-result-object p1

    .line 661
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 662
    .line 663
    .line 664
    move-result-object p1

    .line 665
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 666
    .line 667
    .line 668
    move-result-object p1

    .line 669
    :goto_6
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 670
    .line 671
    .line 672
    return-void

    .line 673
    :pswitch_5
    iget-object v0, p0, LM1/L;->l:LM1/s;

    .line 674
    .line 675
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 676
    .line 677
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 678
    .line 679
    .line 680
    check-cast p1, Ljava/util/List;

    .line 681
    .line 682
    const/4 v1, 0x0

    .line 683
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 684
    .line 685
    .line 686
    move-result-object v1

    .line 687
    const-string v2, "null cannot be cast to non-null type android.webkit.WebSettings"

    .line 688
    .line 689
    invoke-static {v1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 690
    .line 691
    .line 692
    check-cast v1, Landroid/webkit/WebSettings;

    .line 693
    .line 694
    const/4 v2, 0x1

    .line 695
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 696
    .line 697
    .line 698
    move-result-object p1

    .line 699
    const-string v2, "null cannot be cast to non-null type kotlin.Boolean"

    .line 700
    .line 701
    invoke-static {p1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 702
    .line 703
    .line 704
    check-cast p1, Ljava/lang/Boolean;

    .line 705
    .line 706
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 707
    .line 708
    .line 709
    move-result p1

    .line 710
    :try_start_6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 711
    .line 712
    .line 713
    invoke-virtual {v1, p1}, Landroid/webkit/WebSettings;->setAllowContentAccess(Z)V

    .line 714
    .line 715
    .line 716
    const/4 p1, 0x0

    .line 717
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 718
    .line 719
    .line 720
    move-result-object p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 721
    goto :goto_7

    .line 722
    :catchall_6
    move-exception p1

    .line 723
    instance-of v0, p1, LM1/a;

    .line 724
    .line 725
    if-eqz v0, :cond_9

    .line 726
    .line 727
    check-cast p1, LM1/a;

    .line 728
    .line 729
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 730
    .line 731
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 732
    .line 733
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 734
    .line 735
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 736
    .line 737
    .line 738
    move-result-object p1

    .line 739
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 740
    .line 741
    .line 742
    move-result-object p1

    .line 743
    goto :goto_7

    .line 744
    :cond_9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 745
    .line 746
    .line 747
    move-result-object v0

    .line 748
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 749
    .line 750
    .line 751
    move-result-object v0

    .line 752
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 753
    .line 754
    .line 755
    move-result-object v1

    .line 756
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 757
    .line 758
    .line 759
    move-result-object v2

    .line 760
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 761
    .line 762
    .line 763
    move-result-object p1

    .line 764
    const-string v3, "Cause: "

    .line 765
    .line 766
    const-string v4, ", Stacktrace: "

    .line 767
    .line 768
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 769
    .line 770
    .line 771
    move-result-object p1

    .line 772
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 773
    .line 774
    .line 775
    move-result-object p1

    .line 776
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 777
    .line 778
    .line 779
    move-result-object p1

    .line 780
    :goto_7
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 781
    .line 782
    .line 783
    return-void

    .line 784
    :pswitch_6
    iget-object v0, p0, LM1/L;->l:LM1/s;

    .line 785
    .line 786
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 787
    .line 788
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 789
    .line 790
    .line 791
    check-cast p1, Ljava/util/List;

    .line 792
    .line 793
    const/4 v1, 0x0

    .line 794
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    move-result-object v1

    .line 798
    const-string v2, "null cannot be cast to non-null type android.webkit.WebSettings"

    .line 799
    .line 800
    invoke-static {v1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 801
    .line 802
    .line 803
    check-cast v1, Landroid/webkit/WebSettings;

    .line 804
    .line 805
    const/4 v2, 0x1

    .line 806
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 807
    .line 808
    .line 809
    move-result-object p1

    .line 810
    const-string v2, "null cannot be cast to non-null type kotlin.Boolean"

    .line 811
    .line 812
    invoke-static {p1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 813
    .line 814
    .line 815
    check-cast p1, Ljava/lang/Boolean;

    .line 816
    .line 817
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 818
    .line 819
    .line 820
    move-result p1

    .line 821
    :try_start_7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 822
    .line 823
    .line 824
    invoke-virtual {v1, p1}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 825
    .line 826
    .line 827
    const/4 p1, 0x0

    .line 828
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 829
    .line 830
    .line 831
    move-result-object p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 832
    goto :goto_8

    .line 833
    :catchall_7
    move-exception p1

    .line 834
    instance-of v0, p1, LM1/a;

    .line 835
    .line 836
    if-eqz v0, :cond_a

    .line 837
    .line 838
    check-cast p1, LM1/a;

    .line 839
    .line 840
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 841
    .line 842
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 843
    .line 844
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 845
    .line 846
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

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
    goto :goto_8

    .line 855
    :cond_a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 856
    .line 857
    .line 858
    move-result-object v0

    .line 859
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 860
    .line 861
    .line 862
    move-result-object v0

    .line 863
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 864
    .line 865
    .line 866
    move-result-object v1

    .line 867
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 868
    .line 869
    .line 870
    move-result-object v2

    .line 871
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 872
    .line 873
    .line 874
    move-result-object p1

    .line 875
    const-string v3, "Cause: "

    .line 876
    .line 877
    const-string v4, ", Stacktrace: "

    .line 878
    .line 879
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 880
    .line 881
    .line 882
    move-result-object p1

    .line 883
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 884
    .line 885
    .line 886
    move-result-object p1

    .line 887
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 888
    .line 889
    .line 890
    move-result-object p1

    .line 891
    :goto_8
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 892
    .line 893
    .line 894
    return-void

    .line 895
    :pswitch_7
    iget-object v0, p0, LM1/L;->l:LM1/s;

    .line 896
    .line 897
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 898
    .line 899
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 900
    .line 901
    .line 902
    check-cast p1, Ljava/util/List;

    .line 903
    .line 904
    const/4 v1, 0x0

    .line 905
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 906
    .line 907
    .line 908
    move-result-object v1

    .line 909
    const-string v2, "null cannot be cast to non-null type android.webkit.WebSettings"

    .line 910
    .line 911
    invoke-static {v1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 912
    .line 913
    .line 914
    check-cast v1, Landroid/webkit/WebSettings;

    .line 915
    .line 916
    const/4 v2, 0x1

    .line 917
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 918
    .line 919
    .line 920
    move-result-object p1

    .line 921
    const-string v2, "null cannot be cast to non-null type kotlin.Boolean"

    .line 922
    .line 923
    invoke-static {p1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 924
    .line 925
    .line 926
    check-cast p1, Ljava/lang/Boolean;

    .line 927
    .line 928
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 929
    .line 930
    .line 931
    move-result p1

    .line 932
    :try_start_8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 933
    .line 934
    .line 935
    invoke-virtual {v1, p1}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 936
    .line 937
    .line 938
    const/4 p1, 0x0

    .line 939
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 940
    .line 941
    .line 942
    move-result-object p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 943
    goto :goto_9

    .line 944
    :catchall_8
    move-exception p1

    .line 945
    instance-of v0, p1, LM1/a;

    .line 946
    .line 947
    if-eqz v0, :cond_b

    .line 948
    .line 949
    check-cast p1, LM1/a;

    .line 950
    .line 951
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 952
    .line 953
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 954
    .line 955
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 956
    .line 957
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 958
    .line 959
    .line 960
    move-result-object p1

    .line 961
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 962
    .line 963
    .line 964
    move-result-object p1

    .line 965
    goto :goto_9

    .line 966
    :cond_b
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 967
    .line 968
    .line 969
    move-result-object v0

    .line 970
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 971
    .line 972
    .line 973
    move-result-object v0

    .line 974
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 975
    .line 976
    .line 977
    move-result-object v1

    .line 978
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 979
    .line 980
    .line 981
    move-result-object v2

    .line 982
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 983
    .line 984
    .line 985
    move-result-object p1

    .line 986
    const-string v3, "Cause: "

    .line 987
    .line 988
    const-string v4, ", Stacktrace: "

    .line 989
    .line 990
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 991
    .line 992
    .line 993
    move-result-object p1

    .line 994
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 995
    .line 996
    .line 997
    move-result-object p1

    .line 998
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 999
    .line 1000
    .line 1001
    move-result-object p1

    .line 1002
    :goto_9
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 1003
    .line 1004
    .line 1005
    return-void

    .line 1006
    :pswitch_8
    iget-object v0, p0, LM1/L;->l:LM1/s;

    .line 1007
    .line 1008
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 1009
    .line 1010
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1011
    .line 1012
    .line 1013
    check-cast p1, Ljava/util/List;

    .line 1014
    .line 1015
    const/4 v1, 0x0

    .line 1016
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v1

    .line 1020
    const-string v2, "null cannot be cast to non-null type android.webkit.WebSettings"

    .line 1021
    .line 1022
    invoke-static {v1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1023
    .line 1024
    .line 1025
    check-cast v1, Landroid/webkit/WebSettings;

    .line 1026
    .line 1027
    const/4 v2, 0x1

    .line 1028
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1029
    .line 1030
    .line 1031
    move-result-object p1

    .line 1032
    const-string v2, "null cannot be cast to non-null type kotlin.Boolean"

    .line 1033
    .line 1034
    invoke-static {p1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1035
    .line 1036
    .line 1037
    check-cast p1, Ljava/lang/Boolean;

    .line 1038
    .line 1039
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1040
    .line 1041
    .line 1042
    move-result p1

    .line 1043
    :try_start_9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1044
    .line 1045
    .line 1046
    invoke-virtual {v1, p1}, Landroid/webkit/WebSettings;->setDisplayZoomControls(Z)V

    .line 1047
    .line 1048
    .line 1049
    const/4 p1, 0x0

    .line 1050
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 1051
    .line 1052
    .line 1053
    move-result-object p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 1054
    goto :goto_a

    .line 1055
    :catchall_9
    move-exception p1

    .line 1056
    instance-of v0, p1, LM1/a;

    .line 1057
    .line 1058
    if-eqz v0, :cond_c

    .line 1059
    .line 1060
    check-cast p1, LM1/a;

    .line 1061
    .line 1062
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 1063
    .line 1064
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 1065
    .line 1066
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 1067
    .line 1068
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 1069
    .line 1070
    .line 1071
    move-result-object p1

    .line 1072
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 1073
    .line 1074
    .line 1075
    move-result-object p1

    .line 1076
    goto :goto_a

    .line 1077
    :cond_c
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v0

    .line 1081
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v0

    .line 1085
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v1

    .line 1089
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v2

    .line 1093
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1094
    .line 1095
    .line 1096
    move-result-object p1

    .line 1097
    const-string v3, "Cause: "

    .line 1098
    .line 1099
    const-string v4, ", Stacktrace: "

    .line 1100
    .line 1101
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1102
    .line 1103
    .line 1104
    move-result-object p1

    .line 1105
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 1106
    .line 1107
    .line 1108
    move-result-object p1

    .line 1109
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 1110
    .line 1111
    .line 1112
    move-result-object p1

    .line 1113
    :goto_a
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 1114
    .line 1115
    .line 1116
    return-void

    .line 1117
    :pswitch_9
    iget-object v0, p0, LM1/L;->l:LM1/s;

    .line 1118
    .line 1119
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 1120
    .line 1121
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1122
    .line 1123
    .line 1124
    check-cast p1, Ljava/util/List;

    .line 1125
    .line 1126
    const/4 v1, 0x0

    .line 1127
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v1

    .line 1131
    const-string v2, "null cannot be cast to non-null type android.webkit.WebSettings"

    .line 1132
    .line 1133
    invoke-static {v1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1134
    .line 1135
    .line 1136
    check-cast v1, Landroid/webkit/WebSettings;

    .line 1137
    .line 1138
    const/4 v2, 0x1

    .line 1139
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1140
    .line 1141
    .line 1142
    move-result-object p1

    .line 1143
    const-string v2, "null cannot be cast to non-null type kotlin.Boolean"

    .line 1144
    .line 1145
    invoke-static {p1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1146
    .line 1147
    .line 1148
    check-cast p1, Ljava/lang/Boolean;

    .line 1149
    .line 1150
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1151
    .line 1152
    .line 1153
    move-result p1

    .line 1154
    :try_start_a
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1155
    .line 1156
    .line 1157
    invoke-virtual {v1, p1}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 1158
    .line 1159
    .line 1160
    const/4 p1, 0x0

    .line 1161
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 1162
    .line 1163
    .line 1164
    move-result-object p1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    .line 1165
    goto :goto_b

    .line 1166
    :catchall_a
    move-exception p1

    .line 1167
    instance-of v0, p1, LM1/a;

    .line 1168
    .line 1169
    if-eqz v0, :cond_d

    .line 1170
    .line 1171
    check-cast p1, LM1/a;

    .line 1172
    .line 1173
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 1174
    .line 1175
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 1176
    .line 1177
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 1178
    .line 1179
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 1180
    .line 1181
    .line 1182
    move-result-object p1

    .line 1183
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 1184
    .line 1185
    .line 1186
    move-result-object p1

    .line 1187
    goto :goto_b

    .line 1188
    :cond_d
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v0

    .line 1192
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v0

    .line 1196
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v1

    .line 1200
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v2

    .line 1204
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1205
    .line 1206
    .line 1207
    move-result-object p1

    .line 1208
    const-string v3, "Cause: "

    .line 1209
    .line 1210
    const-string v4, ", Stacktrace: "

    .line 1211
    .line 1212
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1213
    .line 1214
    .line 1215
    move-result-object p1

    .line 1216
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 1217
    .line 1218
    .line 1219
    move-result-object p1

    .line 1220
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 1221
    .line 1222
    .line 1223
    move-result-object p1

    .line 1224
    :goto_b
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 1225
    .line 1226
    .line 1227
    return-void

    .line 1228
    :pswitch_a
    iget-object v0, p0, LM1/L;->l:LM1/s;

    .line 1229
    .line 1230
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 1231
    .line 1232
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1233
    .line 1234
    .line 1235
    check-cast p1, Ljava/util/List;

    .line 1236
    .line 1237
    const/4 v1, 0x0

    .line 1238
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v1

    .line 1242
    const-string v2, "null cannot be cast to non-null type android.webkit.WebSettings"

    .line 1243
    .line 1244
    invoke-static {v1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1245
    .line 1246
    .line 1247
    check-cast v1, Landroid/webkit/WebSettings;

    .line 1248
    .line 1249
    const/4 v2, 0x1

    .line 1250
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1251
    .line 1252
    .line 1253
    move-result-object p1

    .line 1254
    const-string v2, "null cannot be cast to non-null type kotlin.Boolean"

    .line 1255
    .line 1256
    invoke-static {p1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1257
    .line 1258
    .line 1259
    check-cast p1, Ljava/lang/Boolean;

    .line 1260
    .line 1261
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1262
    .line 1263
    .line 1264
    move-result p1

    .line 1265
    :try_start_b
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1266
    .line 1267
    .line 1268
    invoke-virtual {v1, p1}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    .line 1269
    .line 1270
    .line 1271
    const/4 p1, 0x0

    .line 1272
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 1273
    .line 1274
    .line 1275
    move-result-object p1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_b

    .line 1276
    goto :goto_c

    .line 1277
    :catchall_b
    move-exception p1

    .line 1278
    instance-of v0, p1, LM1/a;

    .line 1279
    .line 1280
    if-eqz v0, :cond_e

    .line 1281
    .line 1282
    check-cast p1, LM1/a;

    .line 1283
    .line 1284
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 1285
    .line 1286
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 1287
    .line 1288
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 1289
    .line 1290
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 1291
    .line 1292
    .line 1293
    move-result-object p1

    .line 1294
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 1295
    .line 1296
    .line 1297
    move-result-object p1

    .line 1298
    goto :goto_c

    .line 1299
    :cond_e
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1300
    .line 1301
    .line 1302
    move-result-object v0

    .line 1303
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1304
    .line 1305
    .line 1306
    move-result-object v0

    .line 1307
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 1308
    .line 1309
    .line 1310
    move-result-object v1

    .line 1311
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v2

    .line 1315
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1316
    .line 1317
    .line 1318
    move-result-object p1

    .line 1319
    const-string v3, "Cause: "

    .line 1320
    .line 1321
    const-string v4, ", Stacktrace: "

    .line 1322
    .line 1323
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1324
    .line 1325
    .line 1326
    move-result-object p1

    .line 1327
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 1328
    .line 1329
    .line 1330
    move-result-object p1

    .line 1331
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 1332
    .line 1333
    .line 1334
    move-result-object p1

    .line 1335
    :goto_c
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 1336
    .line 1337
    .line 1338
    return-void

    .line 1339
    :pswitch_b
    iget-object v0, p0, LM1/L;->l:LM1/s;

    .line 1340
    .line 1341
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 1342
    .line 1343
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1344
    .line 1345
    .line 1346
    check-cast p1, Ljava/util/List;

    .line 1347
    .line 1348
    const/4 v1, 0x0

    .line 1349
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1350
    .line 1351
    .line 1352
    move-result-object v1

    .line 1353
    const-string v2, "null cannot be cast to non-null type android.webkit.WebSettings"

    .line 1354
    .line 1355
    invoke-static {v1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1356
    .line 1357
    .line 1358
    check-cast v1, Landroid/webkit/WebSettings;

    .line 1359
    .line 1360
    const/4 v2, 0x1

    .line 1361
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1362
    .line 1363
    .line 1364
    move-result-object p1

    .line 1365
    const-string v2, "null cannot be cast to non-null type kotlin.Boolean"

    .line 1366
    .line 1367
    invoke-static {p1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1368
    .line 1369
    .line 1370
    check-cast p1, Ljava/lang/Boolean;

    .line 1371
    .line 1372
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1373
    .line 1374
    .line 1375
    move-result p1

    .line 1376
    :try_start_c
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1377
    .line 1378
    .line 1379
    invoke-virtual {v1, p1}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V

    .line 1380
    .line 1381
    .line 1382
    const/4 p1, 0x0

    .line 1383
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 1384
    .line 1385
    .line 1386
    move-result-object p1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_c

    .line 1387
    goto :goto_d

    .line 1388
    :catchall_c
    move-exception p1

    .line 1389
    instance-of v0, p1, LM1/a;

    .line 1390
    .line 1391
    if-eqz v0, :cond_f

    .line 1392
    .line 1393
    check-cast p1, LM1/a;

    .line 1394
    .line 1395
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 1396
    .line 1397
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 1398
    .line 1399
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 1400
    .line 1401
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 1402
    .line 1403
    .line 1404
    move-result-object p1

    .line 1405
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 1406
    .line 1407
    .line 1408
    move-result-object p1

    .line 1409
    goto :goto_d

    .line 1410
    :cond_f
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1411
    .line 1412
    .line 1413
    move-result-object v0

    .line 1414
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1415
    .line 1416
    .line 1417
    move-result-object v0

    .line 1418
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v1

    .line 1422
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v2

    .line 1426
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1427
    .line 1428
    .line 1429
    move-result-object p1

    .line 1430
    const-string v3, "Cause: "

    .line 1431
    .line 1432
    const-string v4, ", Stacktrace: "

    .line 1433
    .line 1434
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1435
    .line 1436
    .line 1437
    move-result-object p1

    .line 1438
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 1439
    .line 1440
    .line 1441
    move-result-object p1

    .line 1442
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 1443
    .line 1444
    .line 1445
    move-result-object p1

    .line 1446
    :goto_d
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 1447
    .line 1448
    .line 1449
    return-void

    .line 1450
    :pswitch_c
    iget-object v0, p0, LM1/L;->l:LM1/s;

    .line 1451
    .line 1452
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 1453
    .line 1454
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1455
    .line 1456
    .line 1457
    check-cast p1, Ljava/util/List;

    .line 1458
    .line 1459
    const/4 v1, 0x0

    .line 1460
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1461
    .line 1462
    .line 1463
    move-result-object v1

    .line 1464
    const-string v2, "null cannot be cast to non-null type android.webkit.WebSettings"

    .line 1465
    .line 1466
    invoke-static {v1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1467
    .line 1468
    .line 1469
    check-cast v1, Landroid/webkit/WebSettings;

    .line 1470
    .line 1471
    const/4 v2, 0x1

    .line 1472
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1473
    .line 1474
    .line 1475
    move-result-object p1

    .line 1476
    const-string v2, "null cannot be cast to non-null type kotlin.Boolean"

    .line 1477
    .line 1478
    invoke-static {p1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1479
    .line 1480
    .line 1481
    check-cast p1, Ljava/lang/Boolean;

    .line 1482
    .line 1483
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1484
    .line 1485
    .line 1486
    move-result p1

    .line 1487
    :try_start_d
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1488
    .line 1489
    .line 1490
    invoke-virtual {v1, p1}, Landroid/webkit/WebSettings;->setMediaPlaybackRequiresUserGesture(Z)V

    .line 1491
    .line 1492
    .line 1493
    const/4 p1, 0x0

    .line 1494
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 1495
    .line 1496
    .line 1497
    move-result-object p1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_d

    .line 1498
    goto :goto_e

    .line 1499
    :catchall_d
    move-exception p1

    .line 1500
    instance-of v0, p1, LM1/a;

    .line 1501
    .line 1502
    if-eqz v0, :cond_10

    .line 1503
    .line 1504
    check-cast p1, LM1/a;

    .line 1505
    .line 1506
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 1507
    .line 1508
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 1509
    .line 1510
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 1511
    .line 1512
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 1513
    .line 1514
    .line 1515
    move-result-object p1

    .line 1516
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 1517
    .line 1518
    .line 1519
    move-result-object p1

    .line 1520
    goto :goto_e

    .line 1521
    :cond_10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1522
    .line 1523
    .line 1524
    move-result-object v0

    .line 1525
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1526
    .line 1527
    .line 1528
    move-result-object v0

    .line 1529
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 1530
    .line 1531
    .line 1532
    move-result-object v1

    .line 1533
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1534
    .line 1535
    .line 1536
    move-result-object v2

    .line 1537
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1538
    .line 1539
    .line 1540
    move-result-object p1

    .line 1541
    const-string v3, "Cause: "

    .line 1542
    .line 1543
    const-string v4, ", Stacktrace: "

    .line 1544
    .line 1545
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1546
    .line 1547
    .line 1548
    move-result-object p1

    .line 1549
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 1550
    .line 1551
    .line 1552
    move-result-object p1

    .line 1553
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 1554
    .line 1555
    .line 1556
    move-result-object p1

    .line 1557
    :goto_e
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 1558
    .line 1559
    .line 1560
    return-void

    .line 1561
    :pswitch_d
    iget-object v0, p0, LM1/L;->l:LM1/s;

    .line 1562
    .line 1563
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 1564
    .line 1565
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1566
    .line 1567
    .line 1568
    check-cast p1, Ljava/util/List;

    .line 1569
    .line 1570
    const/4 v1, 0x0

    .line 1571
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1572
    .line 1573
    .line 1574
    move-result-object v1

    .line 1575
    const-string v2, "null cannot be cast to non-null type android.webkit.WebSettings"

    .line 1576
    .line 1577
    invoke-static {v1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1578
    .line 1579
    .line 1580
    check-cast v1, Landroid/webkit/WebSettings;

    .line 1581
    .line 1582
    const/4 v2, 0x1

    .line 1583
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1584
    .line 1585
    .line 1586
    move-result-object p1

    .line 1587
    check-cast p1, Ljava/lang/String;

    .line 1588
    .line 1589
    :try_start_e
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1590
    .line 1591
    .line 1592
    invoke-virtual {v1, p1}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    .line 1593
    .line 1594
    .line 1595
    const/4 p1, 0x0

    .line 1596
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 1597
    .line 1598
    .line 1599
    move-result-object p1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_e

    .line 1600
    goto :goto_f

    .line 1601
    :catchall_e
    move-exception p1

    .line 1602
    instance-of v0, p1, LM1/a;

    .line 1603
    .line 1604
    if-eqz v0, :cond_11

    .line 1605
    .line 1606
    check-cast p1, LM1/a;

    .line 1607
    .line 1608
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 1609
    .line 1610
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 1611
    .line 1612
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 1613
    .line 1614
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 1615
    .line 1616
    .line 1617
    move-result-object p1

    .line 1618
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 1619
    .line 1620
    .line 1621
    move-result-object p1

    .line 1622
    goto :goto_f

    .line 1623
    :cond_11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1624
    .line 1625
    .line 1626
    move-result-object v0

    .line 1627
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1628
    .line 1629
    .line 1630
    move-result-object v0

    .line 1631
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 1632
    .line 1633
    .line 1634
    move-result-object v1

    .line 1635
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1636
    .line 1637
    .line 1638
    move-result-object v2

    .line 1639
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1640
    .line 1641
    .line 1642
    move-result-object p1

    .line 1643
    const-string v3, "Cause: "

    .line 1644
    .line 1645
    const-string v4, ", Stacktrace: "

    .line 1646
    .line 1647
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1648
    .line 1649
    .line 1650
    move-result-object p1

    .line 1651
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 1652
    .line 1653
    .line 1654
    move-result-object p1

    .line 1655
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 1656
    .line 1657
    .line 1658
    move-result-object p1

    .line 1659
    :goto_f
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 1660
    .line 1661
    .line 1662
    return-void

    .line 1663
    :pswitch_e
    iget-object v0, p0, LM1/L;->l:LM1/s;

    .line 1664
    .line 1665
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 1666
    .line 1667
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1668
    .line 1669
    .line 1670
    check-cast p1, Ljava/util/List;

    .line 1671
    .line 1672
    const/4 v1, 0x0

    .line 1673
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1674
    .line 1675
    .line 1676
    move-result-object v1

    .line 1677
    const-string v2, "null cannot be cast to non-null type android.webkit.WebSettings"

    .line 1678
    .line 1679
    invoke-static {v1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1680
    .line 1681
    .line 1682
    check-cast v1, Landroid/webkit/WebSettings;

    .line 1683
    .line 1684
    const/4 v2, 0x1

    .line 1685
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1686
    .line 1687
    .line 1688
    move-result-object p1

    .line 1689
    const-string v2, "null cannot be cast to non-null type kotlin.Boolean"

    .line 1690
    .line 1691
    invoke-static {p1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1692
    .line 1693
    .line 1694
    check-cast p1, Ljava/lang/Boolean;

    .line 1695
    .line 1696
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1697
    .line 1698
    .line 1699
    move-result p1

    .line 1700
    :try_start_f
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1701
    .line 1702
    .line 1703
    invoke-virtual {v1, p1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 1704
    .line 1705
    .line 1706
    const/4 p1, 0x0

    .line 1707
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 1708
    .line 1709
    .line 1710
    move-result-object p1
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_f

    .line 1711
    goto :goto_10

    .line 1712
    :catchall_f
    move-exception p1

    .line 1713
    instance-of v0, p1, LM1/a;

    .line 1714
    .line 1715
    if-eqz v0, :cond_12

    .line 1716
    .line 1717
    check-cast p1, LM1/a;

    .line 1718
    .line 1719
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 1720
    .line 1721
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 1722
    .line 1723
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 1724
    .line 1725
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 1726
    .line 1727
    .line 1728
    move-result-object p1

    .line 1729
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 1730
    .line 1731
    .line 1732
    move-result-object p1

    .line 1733
    goto :goto_10

    .line 1734
    :cond_12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1735
    .line 1736
    .line 1737
    move-result-object v0

    .line 1738
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1739
    .line 1740
    .line 1741
    move-result-object v0

    .line 1742
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 1743
    .line 1744
    .line 1745
    move-result-object v1

    .line 1746
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1747
    .line 1748
    .line 1749
    move-result-object v2

    .line 1750
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1751
    .line 1752
    .line 1753
    move-result-object p1

    .line 1754
    const-string v3, "Cause: "

    .line 1755
    .line 1756
    const-string v4, ", Stacktrace: "

    .line 1757
    .line 1758
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1759
    .line 1760
    .line 1761
    move-result-object p1

    .line 1762
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 1763
    .line 1764
    .line 1765
    move-result-object p1

    .line 1766
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 1767
    .line 1768
    .line 1769
    move-result-object p1

    .line 1770
    :goto_10
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 1771
    .line 1772
    .line 1773
    return-void

    .line 1774
    :pswitch_f
    iget-object v0, p0, LM1/L;->l:LM1/s;

    .line 1775
    .line 1776
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 1777
    .line 1778
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1779
    .line 1780
    .line 1781
    check-cast p1, Ljava/util/List;

    .line 1782
    .line 1783
    const/4 v1, 0x0

    .line 1784
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1785
    .line 1786
    .line 1787
    move-result-object v1

    .line 1788
    const-string v2, "null cannot be cast to non-null type android.webkit.WebSettings"

    .line 1789
    .line 1790
    invoke-static {v1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1791
    .line 1792
    .line 1793
    check-cast v1, Landroid/webkit/WebSettings;

    .line 1794
    .line 1795
    const/4 v2, 0x1

    .line 1796
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1797
    .line 1798
    .line 1799
    move-result-object p1

    .line 1800
    const-string v2, "null cannot be cast to non-null type kotlin.Boolean"

    .line 1801
    .line 1802
    invoke-static {p1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1803
    .line 1804
    .line 1805
    check-cast p1, Ljava/lang/Boolean;

    .line 1806
    .line 1807
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1808
    .line 1809
    .line 1810
    move-result p1

    .line 1811
    :try_start_10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1812
    .line 1813
    .line 1814
    invoke-virtual {v1, p1}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 1815
    .line 1816
    .line 1817
    const/4 p1, 0x0

    .line 1818
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 1819
    .line 1820
    .line 1821
    move-result-object p1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_10

    .line 1822
    goto :goto_11

    .line 1823
    :catchall_10
    move-exception p1

    .line 1824
    instance-of v0, p1, LM1/a;

    .line 1825
    .line 1826
    if-eqz v0, :cond_13

    .line 1827
    .line 1828
    check-cast p1, LM1/a;

    .line 1829
    .line 1830
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 1831
    .line 1832
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 1833
    .line 1834
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 1835
    .line 1836
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 1837
    .line 1838
    .line 1839
    move-result-object p1

    .line 1840
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 1841
    .line 1842
    .line 1843
    move-result-object p1

    .line 1844
    goto :goto_11

    .line 1845
    :cond_13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1846
    .line 1847
    .line 1848
    move-result-object v0

    .line 1849
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1850
    .line 1851
    .line 1852
    move-result-object v0

    .line 1853
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 1854
    .line 1855
    .line 1856
    move-result-object v1

    .line 1857
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1858
    .line 1859
    .line 1860
    move-result-object v2

    .line 1861
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1862
    .line 1863
    .line 1864
    move-result-object p1

    .line 1865
    const-string v3, "Cause: "

    .line 1866
    .line 1867
    const-string v4, ", Stacktrace: "

    .line 1868
    .line 1869
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1870
    .line 1871
    .line 1872
    move-result-object p1

    .line 1873
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 1874
    .line 1875
    .line 1876
    move-result-object p1

    .line 1877
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 1878
    .line 1879
    .line 1880
    move-result-object p1

    .line 1881
    :goto_11
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 1882
    .line 1883
    .line 1884
    return-void

    .line 1885
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
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

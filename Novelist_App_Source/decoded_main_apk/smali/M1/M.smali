.class public final synthetic LM1/M;
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
    iput p2, p0, LM1/M;->k:I

    iput-object p1, p0, LM1/M;->l:LM1/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;LA/c;)V
    .locals 9

    .line 1
    iget v0, p0, LM1/M;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LM1/M;->l:LM1/s;

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
    const-string v2, "null cannot be cast to non-null type android.webkit.WebView"

    .line 21
    .line 22
    invoke-static {v1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    check-cast v1, Landroid/webkit/WebView;

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
    invoke-virtual {v1, p1}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p1, 0x0

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
    move-exception v0

    .line 52
    move-object p1, v0

    .line 53
    nop

    .line 54
    instance-of v0, p1, LM1/a;

    .line 55
    .line 56
    if-eqz v0, :cond_0

    .line 57
    .line 58
    check-cast p1, LM1/a;

    .line 59
    .line 60
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 61
    .line 62
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 63
    .line 64
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 65
    .line 66
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    goto :goto_0

    .line 75
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    const-string v3, "Cause: "

    .line 96
    .line 97
    const-string v4, ", Stacktrace: "

    .line 98
    .line 99
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    :goto_0
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :pswitch_0
    iget-object v0, p0, LM1/M;->l:LM1/s;

    .line 116
    .line 117
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 118
    .line 119
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    check-cast p1, Ljava/util/List;

    .line 123
    .line 124
    const/4 v1, 0x0

    .line 125
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    const-string v2, "null cannot be cast to non-null type android.webkit.WebView"

    .line 130
    .line 131
    invoke-static {v1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    check-cast v1, Landroid/webkit/WebView;

    .line 135
    .line 136
    const/4 v2, 0x1

    .line 137
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    const-string v2, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel"

    .line 142
    .line 143
    invoke-static {p1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    check-cast p1, LM1/x;

    .line 147
    .line 148
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    iget-object v0, p1, LM1/x;->a:Ljava/lang/String;

    .line 152
    .line 153
    invoke-virtual {v1, p1, v0}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    const/4 p1, 0x0

    .line 157
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 158
    .line 159
    .line 160
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 161
    goto :goto_1

    .line 162
    :catchall_1
    move-exception v0

    .line 163
    move-object p1, v0

    .line 164
    nop

    .line 165
    instance-of v0, p1, LM1/a;

    .line 166
    .line 167
    if-eqz v0, :cond_1

    .line 168
    .line 169
    check-cast p1, LM1/a;

    .line 170
    .line 171
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 172
    .line 173
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 174
    .line 175
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 176
    .line 177
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    goto :goto_1

    .line 186
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    const-string v3, "Cause: "

    .line 207
    .line 208
    const-string v4, ", Stacktrace: "

    .line 209
    .line 210
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    :goto_1
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    return-void

    .line 226
    :pswitch_1
    iget-object v0, p0, LM1/M;->l:LM1/s;

    .line 227
    .line 228
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 229
    .line 230
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    check-cast p1, Ljava/util/List;

    .line 234
    .line 235
    const/4 v1, 0x0

    .line 236
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    const-string v2, "null cannot be cast to non-null type android.webkit.WebView"

    .line 241
    .line 242
    invoke-static {v1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    check-cast v1, Landroid/webkit/WebView;

    .line 246
    .line 247
    const/4 v2, 0x1

    .line 248
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    check-cast p1, Landroid/webkit/WebViewClient;

    .line 253
    .line 254
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v1, p1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 258
    .line 259
    .line 260
    const/4 p1, 0x0

    .line 261
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 262
    .line 263
    .line 264
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 265
    goto :goto_2

    .line 266
    :catchall_2
    move-exception v0

    .line 267
    move-object p1, v0

    .line 268
    nop

    .line 269
    instance-of v0, p1, LM1/a;

    .line 270
    .line 271
    if-eqz v0, :cond_2

    .line 272
    .line 273
    check-cast p1, LM1/a;

    .line 274
    .line 275
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 276
    .line 277
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 278
    .line 279
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 280
    .line 281
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    goto :goto_2

    .line 290
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object p1

    .line 310
    const-string v3, "Cause: "

    .line 311
    .line 312
    const-string v4, ", Stacktrace: "

    .line 313
    .line 314
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object p1

    .line 318
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object p1

    .line 322
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 323
    .line 324
    .line 325
    move-result-object p1

    .line 326
    :goto_2
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    return-void

    .line 330
    :pswitch_2
    iget-object v0, p0, LM1/M;->l:LM1/s;

    .line 331
    .line 332
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 333
    .line 334
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    check-cast p1, Ljava/util/List;

    .line 338
    .line 339
    const/4 v1, 0x0

    .line 340
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object p1

    .line 344
    const-string v1, "null cannot be cast to non-null type kotlin.Boolean"

    .line 345
    .line 346
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    check-cast p1, Ljava/lang/Boolean;

    .line 350
    .line 351
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 352
    .line 353
    .line 354
    move-result p1

    .line 355
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    invoke-static {p1}, Landroid/webkit/WebView;->setWebContentsDebuggingEnabled(Z)V

    .line 359
    .line 360
    .line 361
    const/4 p1, 0x0

    .line 362
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 363
    .line 364
    .line 365
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 366
    goto :goto_3

    .line 367
    :catchall_3
    move-exception v0

    .line 368
    move-object p1, v0

    .line 369
    nop

    .line 370
    instance-of v0, p1, LM1/a;

    .line 371
    .line 372
    if-eqz v0, :cond_3

    .line 373
    .line 374
    check-cast p1, LM1/a;

    .line 375
    .line 376
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 377
    .line 378
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 379
    .line 380
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 381
    .line 382
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

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
    goto :goto_3

    .line 391
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v1

    .line 403
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 404
    .line 405
    .line 406
    move-result-object v2

    .line 407
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object p1

    .line 411
    const-string v3, "Cause: "

    .line 412
    .line 413
    const-string v4, ", Stacktrace: "

    .line 414
    .line 415
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object p1

    .line 419
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object p1

    .line 423
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 424
    .line 425
    .line 426
    move-result-object p1

    .line 427
    :goto_3
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 428
    .line 429
    .line 430
    return-void

    .line 431
    :pswitch_3
    iget-object v0, p0, LM1/M;->l:LM1/s;

    .line 432
    .line 433
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 434
    .line 435
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    check-cast p1, Ljava/util/List;

    .line 439
    .line 440
    const/4 v1, 0x0

    .line 441
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object p1

    .line 445
    const-string v1, "null cannot be cast to non-null type android.webkit.WebView"

    .line 446
    .line 447
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 448
    .line 449
    .line 450
    check-cast p1, Landroid/webkit/WebView;

    .line 451
    .line 452
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 453
    .line 454
    .line 455
    invoke-virtual {p1}, Landroid/webkit/WebView;->getTitle()Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object p1

    .line 459
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 460
    .line 461
    .line 462
    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 463
    goto :goto_4

    .line 464
    :catchall_4
    move-exception v0

    .line 465
    move-object p1, v0

    .line 466
    nop

    .line 467
    instance-of v0, p1, LM1/a;

    .line 468
    .line 469
    if-eqz v0, :cond_4

    .line 470
    .line 471
    check-cast p1, LM1/a;

    .line 472
    .line 473
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 474
    .line 475
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 476
    .line 477
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 478
    .line 479
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

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
    goto :goto_4

    .line 488
    :cond_4
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
    move-result-object v1

    .line 500
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 501
    .line 502
    .line 503
    move-result-object v2

    .line 504
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object p1

    .line 508
    const-string v3, "Cause: "

    .line 509
    .line 510
    const-string v4, ", Stacktrace: "

    .line 511
    .line 512
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object p1

    .line 516
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

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
    :goto_4
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 525
    .line 526
    .line 527
    return-void

    .line 528
    :pswitch_4
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 529
    .line 530
    invoke-static {p1, v0}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 531
    .line 532
    .line 533
    check-cast p1, Ljava/util/List;

    .line 534
    .line 535
    const/4 v0, 0x0

    .line 536
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    const-string v1, "null cannot be cast to non-null type android.webkit.WebView"

    .line 541
    .line 542
    invoke-static {v0, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 543
    .line 544
    .line 545
    check-cast v0, Landroid/webkit/WebView;

    .line 546
    .line 547
    const/4 v1, 0x1

    .line 548
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    move-result-object p1

    .line 552
    const-string v1, "null cannot be cast to non-null type kotlin.String"

    .line 553
    .line 554
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 555
    .line 556
    .line 557
    check-cast p1, Ljava/lang/String;

    .line 558
    .line 559
    new-instance v1, LI1/k;

    .line 560
    .line 561
    const/16 v2, 0x9

    .line 562
    .line 563
    invoke-direct {v1, p2, v2}, LI1/k;-><init>(LA/c;I)V

    .line 564
    .line 565
    .line 566
    iget-object p2, p0, LM1/M;->l:LM1/s;

    .line 567
    .line 568
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 569
    .line 570
    .line 571
    new-instance p2, LM1/m;

    .line 572
    .line 573
    const/4 v2, 0x1

    .line 574
    invoke-direct {p2, v1, v2}, LM1/m;-><init>(LZ1/l;I)V

    .line 575
    .line 576
    .line 577
    invoke-virtual {v0, p1, p2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 578
    .line 579
    .line 580
    return-void

    .line 581
    :pswitch_5
    iget-object v0, p0, LM1/M;->l:LM1/s;

    .line 582
    .line 583
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 584
    .line 585
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 586
    .line 587
    .line 588
    check-cast p1, Ljava/util/List;

    .line 589
    .line 590
    const/4 v1, 0x0

    .line 591
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    move-result-object v1

    .line 595
    const-string v2, "null cannot be cast to non-null type android.webkit.WebView"

    .line 596
    .line 597
    invoke-static {v1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 598
    .line 599
    .line 600
    check-cast v1, Landroid/webkit/WebView;

    .line 601
    .line 602
    const/4 v2, 0x1

    .line 603
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    move-result-object p1

    .line 607
    const-string v2, "null cannot be cast to non-null type kotlin.Boolean"

    .line 608
    .line 609
    invoke-static {p1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 610
    .line 611
    .line 612
    check-cast p1, Ljava/lang/Boolean;

    .line 613
    .line 614
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 615
    .line 616
    .line 617
    move-result p1

    .line 618
    :try_start_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 619
    .line 620
    .line 621
    invoke-virtual {v1, p1}, Landroid/webkit/WebView;->clearCache(Z)V

    .line 622
    .line 623
    .line 624
    const/4 p1, 0x0

    .line 625
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 626
    .line 627
    .line 628
    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 629
    goto :goto_5

    .line 630
    :catchall_5
    move-exception v0

    .line 631
    move-object p1, v0

    .line 632
    nop

    .line 633
    instance-of v0, p1, LM1/a;

    .line 634
    .line 635
    if-eqz v0, :cond_5

    .line 636
    .line 637
    check-cast p1, LM1/a;

    .line 638
    .line 639
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 640
    .line 641
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 642
    .line 643
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 644
    .line 645
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 646
    .line 647
    .line 648
    move-result-object p1

    .line 649
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 650
    .line 651
    .line 652
    move-result-object p1

    .line 653
    goto :goto_5

    .line 654
    :cond_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 655
    .line 656
    .line 657
    move-result-object v0

    .line 658
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 659
    .line 660
    .line 661
    move-result-object v0

    .line 662
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 663
    .line 664
    .line 665
    move-result-object v1

    .line 666
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 667
    .line 668
    .line 669
    move-result-object v2

    .line 670
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 671
    .line 672
    .line 673
    move-result-object p1

    .line 674
    const-string v3, "Cause: "

    .line 675
    .line 676
    const-string v4, ", Stacktrace: "

    .line 677
    .line 678
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 679
    .line 680
    .line 681
    move-result-object p1

    .line 682
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 683
    .line 684
    .line 685
    move-result-object p1

    .line 686
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 687
    .line 688
    .line 689
    move-result-object p1

    .line 690
    :goto_5
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 691
    .line 692
    .line 693
    return-void

    .line 694
    :pswitch_6
    iget-object v0, p0, LM1/M;->l:LM1/s;

    .line 695
    .line 696
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 697
    .line 698
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 699
    .line 700
    .line 701
    check-cast p1, Ljava/util/List;

    .line 702
    .line 703
    const/4 v1, 0x0

    .line 704
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 705
    .line 706
    .line 707
    move-result-object p1

    .line 708
    const-string v1, "null cannot be cast to non-null type android.webkit.WebView"

    .line 709
    .line 710
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 711
    .line 712
    .line 713
    check-cast p1, Landroid/webkit/WebView;

    .line 714
    .line 715
    :try_start_6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 716
    .line 717
    .line 718
    invoke-virtual {p1}, Landroid/webkit/WebView;->reload()V

    .line 719
    .line 720
    .line 721
    const/4 p1, 0x0

    .line 722
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 723
    .line 724
    .line 725
    move-result-object p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 726
    goto :goto_6

    .line 727
    :catchall_6
    move-exception v0

    .line 728
    move-object p1, v0

    .line 729
    nop

    .line 730
    instance-of v0, p1, LM1/a;

    .line 731
    .line 732
    if-eqz v0, :cond_6

    .line 733
    .line 734
    check-cast p1, LM1/a;

    .line 735
    .line 736
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 737
    .line 738
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 739
    .line 740
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 741
    .line 742
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 743
    .line 744
    .line 745
    move-result-object p1

    .line 746
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 747
    .line 748
    .line 749
    move-result-object p1

    .line 750
    goto :goto_6

    .line 751
    :cond_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 752
    .line 753
    .line 754
    move-result-object v0

    .line 755
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 756
    .line 757
    .line 758
    move-result-object v0

    .line 759
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 760
    .line 761
    .line 762
    move-result-object v1

    .line 763
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 764
    .line 765
    .line 766
    move-result-object v2

    .line 767
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 768
    .line 769
    .line 770
    move-result-object p1

    .line 771
    const-string v3, "Cause: "

    .line 772
    .line 773
    const-string v4, ", Stacktrace: "

    .line 774
    .line 775
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 776
    .line 777
    .line 778
    move-result-object p1

    .line 779
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 780
    .line 781
    .line 782
    move-result-object p1

    .line 783
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 784
    .line 785
    .line 786
    move-result-object p1

    .line 787
    :goto_6
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 788
    .line 789
    .line 790
    return-void

    .line 791
    :pswitch_7
    iget-object v0, p0, LM1/M;->l:LM1/s;

    .line 792
    .line 793
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 794
    .line 795
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 796
    .line 797
    .line 798
    check-cast p1, Ljava/util/List;

    .line 799
    .line 800
    const/4 v1, 0x0

    .line 801
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 802
    .line 803
    .line 804
    move-result-object p1

    .line 805
    const-string v1, "null cannot be cast to non-null type android.webkit.WebView"

    .line 806
    .line 807
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 808
    .line 809
    .line 810
    check-cast p1, Landroid/webkit/WebView;

    .line 811
    .line 812
    :try_start_7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 813
    .line 814
    .line 815
    invoke-virtual {p1}, Landroid/webkit/WebView;->goBack()V

    .line 816
    .line 817
    .line 818
    const/4 p1, 0x0

    .line 819
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 820
    .line 821
    .line 822
    move-result-object p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 823
    goto :goto_7

    .line 824
    :catchall_7
    move-exception v0

    .line 825
    move-object p1, v0

    .line 826
    nop

    .line 827
    instance-of v0, p1, LM1/a;

    .line 828
    .line 829
    if-eqz v0, :cond_7

    .line 830
    .line 831
    check-cast p1, LM1/a;

    .line 832
    .line 833
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 834
    .line 835
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 836
    .line 837
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 838
    .line 839
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

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
    goto :goto_7

    .line 848
    :cond_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 849
    .line 850
    .line 851
    move-result-object v0

    .line 852
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 853
    .line 854
    .line 855
    move-result-object v0

    .line 856
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 857
    .line 858
    .line 859
    move-result-object v1

    .line 860
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 861
    .line 862
    .line 863
    move-result-object v2

    .line 864
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 865
    .line 866
    .line 867
    move-result-object p1

    .line 868
    const-string v3, "Cause: "

    .line 869
    .line 870
    const-string v4, ", Stacktrace: "

    .line 871
    .line 872
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 873
    .line 874
    .line 875
    move-result-object p1

    .line 876
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 877
    .line 878
    .line 879
    move-result-object p1

    .line 880
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 881
    .line 882
    .line 883
    move-result-object p1

    .line 884
    :goto_7
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 885
    .line 886
    .line 887
    return-void

    .line 888
    :pswitch_8
    iget-object v0, p0, LM1/M;->l:LM1/s;

    .line 889
    .line 890
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 891
    .line 892
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 893
    .line 894
    .line 895
    check-cast p1, Ljava/util/List;

    .line 896
    .line 897
    const/4 v1, 0x0

    .line 898
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 899
    .line 900
    .line 901
    move-result-object p1

    .line 902
    const-string v1, "null cannot be cast to non-null type android.webkit.WebView"

    .line 903
    .line 904
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 905
    .line 906
    .line 907
    check-cast p1, Landroid/webkit/WebView;

    .line 908
    .line 909
    :try_start_8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 910
    .line 911
    .line 912
    invoke-virtual {p1}, Landroid/webkit/WebView;->canGoForward()Z

    .line 913
    .line 914
    .line 915
    move-result p1

    .line 916
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 917
    .line 918
    .line 919
    move-result-object p1

    .line 920
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 921
    .line 922
    .line 923
    move-result-object p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 924
    goto :goto_8

    .line 925
    :catchall_8
    move-exception v0

    .line 926
    move-object p1, v0

    .line 927
    nop

    .line 928
    instance-of v0, p1, LM1/a;

    .line 929
    .line 930
    if-eqz v0, :cond_8

    .line 931
    .line 932
    check-cast p1, LM1/a;

    .line 933
    .line 934
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 935
    .line 936
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 937
    .line 938
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 939
    .line 940
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 941
    .line 942
    .line 943
    move-result-object p1

    .line 944
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 945
    .line 946
    .line 947
    move-result-object p1

    .line 948
    goto :goto_8

    .line 949
    :cond_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 950
    .line 951
    .line 952
    move-result-object v0

    .line 953
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 954
    .line 955
    .line 956
    move-result-object v0

    .line 957
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 958
    .line 959
    .line 960
    move-result-object v1

    .line 961
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 962
    .line 963
    .line 964
    move-result-object v2

    .line 965
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 966
    .line 967
    .line 968
    move-result-object p1

    .line 969
    const-string v3, "Cause: "

    .line 970
    .line 971
    const-string v4, ", Stacktrace: "

    .line 972
    .line 973
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 974
    .line 975
    .line 976
    move-result-object p1

    .line 977
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 978
    .line 979
    .line 980
    move-result-object p1

    .line 981
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 982
    .line 983
    .line 984
    move-result-object p1

    .line 985
    :goto_8
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 986
    .line 987
    .line 988
    return-void

    .line 989
    :pswitch_9
    iget-object v0, p0, LM1/M;->l:LM1/s;

    .line 990
    .line 991
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 992
    .line 993
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 994
    .line 995
    .line 996
    check-cast p1, Ljava/util/List;

    .line 997
    .line 998
    const/4 v1, 0x0

    .line 999
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1000
    .line 1001
    .line 1002
    move-result-object p1

    .line 1003
    const-string v1, "null cannot be cast to non-null type android.webkit.WebView"

    .line 1004
    .line 1005
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1006
    .line 1007
    .line 1008
    check-cast p1, Landroid/webkit/WebView;

    .line 1009
    .line 1010
    :try_start_9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1011
    .line 1012
    .line 1013
    invoke-virtual {p1}, Landroid/webkit/WebView;->canGoBack()Z

    .line 1014
    .line 1015
    .line 1016
    move-result p1

    .line 1017
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1018
    .line 1019
    .line 1020
    move-result-object p1

    .line 1021
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 1022
    .line 1023
    .line 1024
    move-result-object p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 1025
    goto :goto_9

    .line 1026
    :catchall_9
    move-exception v0

    .line 1027
    move-object p1, v0

    .line 1028
    nop

    .line 1029
    instance-of v0, p1, LM1/a;

    .line 1030
    .line 1031
    if-eqz v0, :cond_9

    .line 1032
    .line 1033
    check-cast p1, LM1/a;

    .line 1034
    .line 1035
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 1036
    .line 1037
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 1038
    .line 1039
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 1040
    .line 1041
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 1042
    .line 1043
    .line 1044
    move-result-object p1

    .line 1045
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 1046
    .line 1047
    .line 1048
    move-result-object p1

    .line 1049
    goto :goto_9

    .line 1050
    :cond_9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v0

    .line 1054
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v0

    .line 1058
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v1

    .line 1062
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v2

    .line 1066
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1067
    .line 1068
    .line 1069
    move-result-object p1

    .line 1070
    const-string v3, "Cause: "

    .line 1071
    .line 1072
    const-string v4, ", Stacktrace: "

    .line 1073
    .line 1074
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1075
    .line 1076
    .line 1077
    move-result-object p1

    .line 1078
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 1079
    .line 1080
    .line 1081
    move-result-object p1

    .line 1082
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 1083
    .line 1084
    .line 1085
    move-result-object p1

    .line 1086
    :goto_9
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 1087
    .line 1088
    .line 1089
    return-void

    .line 1090
    :pswitch_a
    iget-object v0, p0, LM1/M;->l:LM1/s;

    .line 1091
    .line 1092
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 1093
    .line 1094
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1095
    .line 1096
    .line 1097
    check-cast p1, Ljava/util/List;

    .line 1098
    .line 1099
    const/4 v1, 0x0

    .line 1100
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1101
    .line 1102
    .line 1103
    move-result-object p1

    .line 1104
    const-string v1, "null cannot be cast to non-null type android.webkit.WebView"

    .line 1105
    .line 1106
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1107
    .line 1108
    .line 1109
    check-cast p1, Landroid/webkit/WebView;

    .line 1110
    .line 1111
    :try_start_a
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1112
    .line 1113
    .line 1114
    invoke-virtual {p1}, Landroid/webkit/WebView;->goForward()V

    .line 1115
    .line 1116
    .line 1117
    const/4 p1, 0x0

    .line 1118
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 1119
    .line 1120
    .line 1121
    move-result-object p1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    .line 1122
    goto :goto_a

    .line 1123
    :catchall_a
    move-exception v0

    .line 1124
    move-object p1, v0

    .line 1125
    nop

    .line 1126
    instance-of v0, p1, LM1/a;

    .line 1127
    .line 1128
    if-eqz v0, :cond_a

    .line 1129
    .line 1130
    check-cast p1, LM1/a;

    .line 1131
    .line 1132
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 1133
    .line 1134
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 1135
    .line 1136
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 1137
    .line 1138
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 1139
    .line 1140
    .line 1141
    move-result-object p1

    .line 1142
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 1143
    .line 1144
    .line 1145
    move-result-object p1

    .line 1146
    goto :goto_a

    .line 1147
    :cond_a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v0

    .line 1151
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v0

    .line 1155
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v1

    .line 1159
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v2

    .line 1163
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1164
    .line 1165
    .line 1166
    move-result-object p1

    .line 1167
    const-string v3, "Cause: "

    .line 1168
    .line 1169
    const-string v4, ", Stacktrace: "

    .line 1170
    .line 1171
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1172
    .line 1173
    .line 1174
    move-result-object p1

    .line 1175
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 1176
    .line 1177
    .line 1178
    move-result-object p1

    .line 1179
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 1180
    .line 1181
    .line 1182
    move-result-object p1

    .line 1183
    :goto_a
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 1184
    .line 1185
    .line 1186
    return-void

    .line 1187
    :pswitch_b
    iget-object v0, p0, LM1/M;->l:LM1/s;

    .line 1188
    .line 1189
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 1190
    .line 1191
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1192
    .line 1193
    .line 1194
    check-cast p1, Ljava/util/List;

    .line 1195
    .line 1196
    const/4 v1, 0x0

    .line 1197
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1198
    .line 1199
    .line 1200
    move-result-object p1

    .line 1201
    const-string v1, "null cannot be cast to non-null type android.webkit.WebView"

    .line 1202
    .line 1203
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1204
    .line 1205
    .line 1206
    check-cast p1, Landroid/webkit/WebView;

    .line 1207
    .line 1208
    :try_start_b
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1209
    .line 1210
    .line 1211
    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 1212
    .line 1213
    .line 1214
    move-result-object p1

    .line 1215
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 1216
    .line 1217
    .line 1218
    move-result-object p1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_b

    .line 1219
    goto :goto_b

    .line 1220
    :catchall_b
    move-exception v0

    .line 1221
    move-object p1, v0

    .line 1222
    nop

    .line 1223
    instance-of v0, p1, LM1/a;

    .line 1224
    .line 1225
    if-eqz v0, :cond_b

    .line 1226
    .line 1227
    check-cast p1, LM1/a;

    .line 1228
    .line 1229
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 1230
    .line 1231
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 1232
    .line 1233
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 1234
    .line 1235
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 1236
    .line 1237
    .line 1238
    move-result-object p1

    .line 1239
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 1240
    .line 1241
    .line 1242
    move-result-object p1

    .line 1243
    goto :goto_b

    .line 1244
    :cond_b
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1245
    .line 1246
    .line 1247
    move-result-object v0

    .line 1248
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1249
    .line 1250
    .line 1251
    move-result-object v0

    .line 1252
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v1

    .line 1256
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1257
    .line 1258
    .line 1259
    move-result-object v2

    .line 1260
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1261
    .line 1262
    .line 1263
    move-result-object p1

    .line 1264
    const-string v3, "Cause: "

    .line 1265
    .line 1266
    const-string v4, ", Stacktrace: "

    .line 1267
    .line 1268
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1269
    .line 1270
    .line 1271
    move-result-object p1

    .line 1272
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 1273
    .line 1274
    .line 1275
    move-result-object p1

    .line 1276
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 1277
    .line 1278
    .line 1279
    move-result-object p1

    .line 1280
    :goto_b
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 1281
    .line 1282
    .line 1283
    return-void

    .line 1284
    :pswitch_c
    iget-object v0, p0, LM1/M;->l:LM1/s;

    .line 1285
    .line 1286
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 1287
    .line 1288
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1289
    .line 1290
    .line 1291
    check-cast p1, Ljava/util/List;

    .line 1292
    .line 1293
    const/4 v1, 0x0

    .line 1294
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1295
    .line 1296
    .line 1297
    move-result-object v1

    .line 1298
    const-string v2, "null cannot be cast to non-null type android.webkit.WebView"

    .line 1299
    .line 1300
    invoke-static {v1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1301
    .line 1302
    .line 1303
    check-cast v1, Landroid/webkit/WebView;

    .line 1304
    .line 1305
    const/4 v2, 0x1

    .line 1306
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v2

    .line 1310
    const-string v3, "null cannot be cast to non-null type kotlin.String"

    .line 1311
    .line 1312
    invoke-static {v2, v3}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1313
    .line 1314
    .line 1315
    check-cast v2, Ljava/lang/String;

    .line 1316
    .line 1317
    const/4 v3, 0x2

    .line 1318
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1319
    .line 1320
    .line 1321
    move-result-object p1

    .line 1322
    const-string v3, "null cannot be cast to non-null type kotlin.ByteArray"

    .line 1323
    .line 1324
    invoke-static {p1, v3}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1325
    .line 1326
    .line 1327
    check-cast p1, [B

    .line 1328
    .line 1329
    :try_start_c
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1330
    .line 1331
    .line 1332
    invoke-virtual {v1, v2, p1}, Landroid/webkit/WebView;->postUrl(Ljava/lang/String;[B)V

    .line 1333
    .line 1334
    .line 1335
    const/4 p1, 0x0

    .line 1336
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 1337
    .line 1338
    .line 1339
    move-result-object p1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_c

    .line 1340
    goto :goto_c

    .line 1341
    :catchall_c
    move-exception v0

    .line 1342
    move-object p1, v0

    .line 1343
    nop

    .line 1344
    instance-of v0, p1, LM1/a;

    .line 1345
    .line 1346
    if-eqz v0, :cond_c

    .line 1347
    .line 1348
    check-cast p1, LM1/a;

    .line 1349
    .line 1350
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 1351
    .line 1352
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 1353
    .line 1354
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 1355
    .line 1356
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 1357
    .line 1358
    .line 1359
    move-result-object p1

    .line 1360
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 1361
    .line 1362
    .line 1363
    move-result-object p1

    .line 1364
    goto :goto_c

    .line 1365
    :cond_c
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v0

    .line 1369
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1370
    .line 1371
    .line 1372
    move-result-object v0

    .line 1373
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 1374
    .line 1375
    .line 1376
    move-result-object v1

    .line 1377
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1378
    .line 1379
    .line 1380
    move-result-object v2

    .line 1381
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1382
    .line 1383
    .line 1384
    move-result-object p1

    .line 1385
    const-string v3, "Cause: "

    .line 1386
    .line 1387
    const-string v4, ", Stacktrace: "

    .line 1388
    .line 1389
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1390
    .line 1391
    .line 1392
    move-result-object p1

    .line 1393
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 1394
    .line 1395
    .line 1396
    move-result-object p1

    .line 1397
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 1398
    .line 1399
    .line 1400
    move-result-object p1

    .line 1401
    :goto_c
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 1402
    .line 1403
    .line 1404
    return-void

    .line 1405
    :pswitch_d
    iget-object v0, p0, LM1/M;->l:LM1/s;

    .line 1406
    .line 1407
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 1408
    .line 1409
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1410
    .line 1411
    .line 1412
    check-cast p1, Ljava/util/List;

    .line 1413
    .line 1414
    const/4 v1, 0x0

    .line 1415
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1416
    .line 1417
    .line 1418
    move-result-object v1

    .line 1419
    const-string v2, "null cannot be cast to non-null type android.webkit.WebView"

    .line 1420
    .line 1421
    invoke-static {v1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1422
    .line 1423
    .line 1424
    check-cast v1, Landroid/webkit/WebView;

    .line 1425
    .line 1426
    const/4 v2, 0x1

    .line 1427
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1428
    .line 1429
    .line 1430
    move-result-object v2

    .line 1431
    const-string v3, "null cannot be cast to non-null type kotlin.String"

    .line 1432
    .line 1433
    invoke-static {v2, v3}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1434
    .line 1435
    .line 1436
    check-cast v2, Ljava/lang/String;

    .line 1437
    .line 1438
    const/4 v3, 0x2

    .line 1439
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1440
    .line 1441
    .line 1442
    move-result-object p1

    .line 1443
    const-string v3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>"

    .line 1444
    .line 1445
    invoke-static {p1, v3}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1446
    .line 1447
    .line 1448
    check-cast p1, Ljava/util/Map;

    .line 1449
    .line 1450
    :try_start_d
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1451
    .line 1452
    .line 1453
    invoke-virtual {v1, v2, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;Ljava/util/Map;)V

    .line 1454
    .line 1455
    .line 1456
    const/4 p1, 0x0

    .line 1457
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 1458
    .line 1459
    .line 1460
    move-result-object p1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_d

    .line 1461
    goto :goto_d

    .line 1462
    :catchall_d
    move-exception v0

    .line 1463
    move-object p1, v0

    .line 1464
    nop

    .line 1465
    instance-of v0, p1, LM1/a;

    .line 1466
    .line 1467
    if-eqz v0, :cond_d

    .line 1468
    .line 1469
    check-cast p1, LM1/a;

    .line 1470
    .line 1471
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 1472
    .line 1473
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 1474
    .line 1475
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 1476
    .line 1477
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 1478
    .line 1479
    .line 1480
    move-result-object p1

    .line 1481
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 1482
    .line 1483
    .line 1484
    move-result-object p1

    .line 1485
    goto :goto_d

    .line 1486
    :cond_d
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1487
    .line 1488
    .line 1489
    move-result-object v0

    .line 1490
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1491
    .line 1492
    .line 1493
    move-result-object v0

    .line 1494
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 1495
    .line 1496
    .line 1497
    move-result-object v1

    .line 1498
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1499
    .line 1500
    .line 1501
    move-result-object v2

    .line 1502
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1503
    .line 1504
    .line 1505
    move-result-object p1

    .line 1506
    const-string v3, "Cause: "

    .line 1507
    .line 1508
    const-string v4, ", Stacktrace: "

    .line 1509
    .line 1510
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1511
    .line 1512
    .line 1513
    move-result-object p1

    .line 1514
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 1515
    .line 1516
    .line 1517
    move-result-object p1

    .line 1518
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 1519
    .line 1520
    .line 1521
    move-result-object p1

    .line 1522
    :goto_d
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 1523
    .line 1524
    .line 1525
    return-void

    .line 1526
    :pswitch_e
    iget-object v0, p0, LM1/M;->l:LM1/s;

    .line 1527
    .line 1528
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 1529
    .line 1530
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1531
    .line 1532
    .line 1533
    check-cast p1, Ljava/util/List;

    .line 1534
    .line 1535
    const/4 v1, 0x0

    .line 1536
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1537
    .line 1538
    .line 1539
    move-result-object v1

    .line 1540
    const-string v2, "null cannot be cast to non-null type android.webkit.WebView"

    .line 1541
    .line 1542
    invoke-static {v1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1543
    .line 1544
    .line 1545
    move-object v3, v1

    .line 1546
    check-cast v3, Landroid/webkit/WebView;

    .line 1547
    .line 1548
    const/4 v1, 0x1

    .line 1549
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1550
    .line 1551
    .line 1552
    move-result-object v1

    .line 1553
    move-object v4, v1

    .line 1554
    check-cast v4, Ljava/lang/String;

    .line 1555
    .line 1556
    const/4 v1, 0x2

    .line 1557
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1558
    .line 1559
    .line 1560
    move-result-object v1

    .line 1561
    const-string v2, "null cannot be cast to non-null type kotlin.String"

    .line 1562
    .line 1563
    invoke-static {v1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1564
    .line 1565
    .line 1566
    move-object v5, v1

    .line 1567
    check-cast v5, Ljava/lang/String;

    .line 1568
    .line 1569
    const/4 v1, 0x3

    .line 1570
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1571
    .line 1572
    .line 1573
    move-result-object v1

    .line 1574
    move-object v6, v1

    .line 1575
    check-cast v6, Ljava/lang/String;

    .line 1576
    .line 1577
    const/4 v1, 0x4

    .line 1578
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1579
    .line 1580
    .line 1581
    move-result-object v1

    .line 1582
    move-object v7, v1

    .line 1583
    check-cast v7, Ljava/lang/String;

    .line 1584
    .line 1585
    const/4 v1, 0x5

    .line 1586
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1587
    .line 1588
    .line 1589
    move-result-object p1

    .line 1590
    move-object v8, p1

    .line 1591
    check-cast v8, Ljava/lang/String;

    .line 1592
    .line 1593
    :try_start_e
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1594
    .line 1595
    .line 1596
    invoke-virtual/range {v3 .. v8}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1597
    .line 1598
    .line 1599
    const/4 p1, 0x0

    .line 1600
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 1601
    .line 1602
    .line 1603
    move-result-object p1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_e

    .line 1604
    goto :goto_e

    .line 1605
    :catchall_e
    move-exception v0

    .line 1606
    move-object p1, v0

    .line 1607
    nop

    .line 1608
    instance-of v0, p1, LM1/a;

    .line 1609
    .line 1610
    if-eqz v0, :cond_e

    .line 1611
    .line 1612
    check-cast p1, LM1/a;

    .line 1613
    .line 1614
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 1615
    .line 1616
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 1617
    .line 1618
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 1619
    .line 1620
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 1621
    .line 1622
    .line 1623
    move-result-object p1

    .line 1624
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 1625
    .line 1626
    .line 1627
    move-result-object p1

    .line 1628
    goto :goto_e

    .line 1629
    :cond_e
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1630
    .line 1631
    .line 1632
    move-result-object v0

    .line 1633
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1634
    .line 1635
    .line 1636
    move-result-object v0

    .line 1637
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 1638
    .line 1639
    .line 1640
    move-result-object v1

    .line 1641
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1642
    .line 1643
    .line 1644
    move-result-object v2

    .line 1645
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1646
    .line 1647
    .line 1648
    move-result-object p1

    .line 1649
    const-string v3, "Cause: "

    .line 1650
    .line 1651
    const-string v4, ", Stacktrace: "

    .line 1652
    .line 1653
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1654
    .line 1655
    .line 1656
    move-result-object p1

    .line 1657
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 1658
    .line 1659
    .line 1660
    move-result-object p1

    .line 1661
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 1662
    .line 1663
    .line 1664
    move-result-object p1

    .line 1665
    :goto_e
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 1666
    .line 1667
    .line 1668
    return-void

    .line 1669
    :pswitch_f
    iget-object v0, p0, LM1/M;->l:LM1/s;

    .line 1670
    .line 1671
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 1672
    .line 1673
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1674
    .line 1675
    .line 1676
    check-cast p1, Ljava/util/List;

    .line 1677
    .line 1678
    const/4 v1, 0x0

    .line 1679
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1680
    .line 1681
    .line 1682
    move-result-object v1

    .line 1683
    const-string v2, "null cannot be cast to non-null type android.webkit.WebView"

    .line 1684
    .line 1685
    invoke-static {v1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1686
    .line 1687
    .line 1688
    check-cast v1, Landroid/webkit/WebView;

    .line 1689
    .line 1690
    const/4 v2, 0x1

    .line 1691
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1692
    .line 1693
    .line 1694
    move-result-object v2

    .line 1695
    const-string v3, "null cannot be cast to non-null type kotlin.String"

    .line 1696
    .line 1697
    invoke-static {v2, v3}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1698
    .line 1699
    .line 1700
    check-cast v2, Ljava/lang/String;

    .line 1701
    .line 1702
    const/4 v3, 0x2

    .line 1703
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1704
    .line 1705
    .line 1706
    move-result-object v3

    .line 1707
    check-cast v3, Ljava/lang/String;

    .line 1708
    .line 1709
    const/4 v4, 0x3

    .line 1710
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1711
    .line 1712
    .line 1713
    move-result-object p1

    .line 1714
    check-cast p1, Ljava/lang/String;

    .line 1715
    .line 1716
    :try_start_f
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1717
    .line 1718
    .line 1719
    invoke-virtual {v1, v2, v3, p1}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1720
    .line 1721
    .line 1722
    const/4 p1, 0x0

    .line 1723
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 1724
    .line 1725
    .line 1726
    move-result-object p1
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_f

    .line 1727
    goto :goto_f

    .line 1728
    :catchall_f
    move-exception v0

    .line 1729
    move-object p1, v0

    .line 1730
    nop

    .line 1731
    instance-of v0, p1, LM1/a;

    .line 1732
    .line 1733
    if-eqz v0, :cond_f

    .line 1734
    .line 1735
    check-cast p1, LM1/a;

    .line 1736
    .line 1737
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 1738
    .line 1739
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 1740
    .line 1741
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 1742
    .line 1743
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 1744
    .line 1745
    .line 1746
    move-result-object p1

    .line 1747
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 1748
    .line 1749
    .line 1750
    move-result-object p1

    .line 1751
    goto :goto_f

    .line 1752
    :cond_f
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1753
    .line 1754
    .line 1755
    move-result-object v0

    .line 1756
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1757
    .line 1758
    .line 1759
    move-result-object v0

    .line 1760
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 1761
    .line 1762
    .line 1763
    move-result-object v1

    .line 1764
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1765
    .line 1766
    .line 1767
    move-result-object v2

    .line 1768
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1769
    .line 1770
    .line 1771
    move-result-object p1

    .line 1772
    const-string v3, "Cause: "

    .line 1773
    .line 1774
    const-string v4, ", Stacktrace: "

    .line 1775
    .line 1776
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1777
    .line 1778
    .line 1779
    move-result-object p1

    .line 1780
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 1781
    .line 1782
    .line 1783
    move-result-object p1

    .line 1784
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 1785
    .line 1786
    .line 1787
    move-result-object p1

    .line 1788
    :goto_f
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 1789
    .line 1790
    .line 1791
    return-void

    .line 1792
    :pswitch_10
    iget-object v0, p0, LM1/M;->l:LM1/s;

    .line 1793
    .line 1794
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 1795
    .line 1796
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1797
    .line 1798
    .line 1799
    check-cast p1, Ljava/util/List;

    .line 1800
    .line 1801
    const/4 v1, 0x0

    .line 1802
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1803
    .line 1804
    .line 1805
    move-result-object p1

    .line 1806
    const-string v1, "null cannot be cast to non-null type android.webkit.WebView"

    .line 1807
    .line 1808
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1809
    .line 1810
    .line 1811
    check-cast p1, Landroid/webkit/WebView;

    .line 1812
    .line 1813
    :try_start_10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1814
    .line 1815
    .line 1816
    invoke-virtual {p1}, Landroid/webkit/WebView;->destroy()V

    .line 1817
    .line 1818
    .line 1819
    const/4 p1, 0x0

    .line 1820
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 1821
    .line 1822
    .line 1823
    move-result-object p1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_10

    .line 1824
    goto :goto_10

    .line 1825
    :catchall_10
    move-exception v0

    .line 1826
    move-object p1, v0

    .line 1827
    nop

    .line 1828
    instance-of v0, p1, LM1/a;

    .line 1829
    .line 1830
    if-eqz v0, :cond_10

    .line 1831
    .line 1832
    check-cast p1, LM1/a;

    .line 1833
    .line 1834
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 1835
    .line 1836
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 1837
    .line 1838
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 1839
    .line 1840
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 1841
    .line 1842
    .line 1843
    move-result-object p1

    .line 1844
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 1845
    .line 1846
    .line 1847
    move-result-object p1

    .line 1848
    goto :goto_10

    .line 1849
    :cond_10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1850
    .line 1851
    .line 1852
    move-result-object v0

    .line 1853
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1854
    .line 1855
    .line 1856
    move-result-object v0

    .line 1857
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 1858
    .line 1859
    .line 1860
    move-result-object v1

    .line 1861
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1862
    .line 1863
    .line 1864
    move-result-object v2

    .line 1865
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1866
    .line 1867
    .line 1868
    move-result-object p1

    .line 1869
    const-string v3, "Cause: "

    .line 1870
    .line 1871
    const-string v4, ", Stacktrace: "

    .line 1872
    .line 1873
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1874
    .line 1875
    .line 1876
    move-result-object p1

    .line 1877
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 1878
    .line 1879
    .line 1880
    move-result-object p1

    .line 1881
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 1882
    .line 1883
    .line 1884
    move-result-object p1

    .line 1885
    :goto_10
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 1886
    .line 1887
    .line 1888
    return-void

    .line 1889
    :pswitch_11
    iget-object v0, p0, LM1/M;->l:LM1/s;

    .line 1890
    .line 1891
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 1892
    .line 1893
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1894
    .line 1895
    .line 1896
    check-cast p1, Ljava/util/List;

    .line 1897
    .line 1898
    const/4 v1, 0x0

    .line 1899
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1900
    .line 1901
    .line 1902
    move-result-object v1

    .line 1903
    const-string v2, "null cannot be cast to non-null type android.webkit.WebView"

    .line 1904
    .line 1905
    invoke-static {v1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1906
    .line 1907
    .line 1908
    check-cast v1, Landroid/webkit/WebView;

    .line 1909
    .line 1910
    const/4 v2, 0x1

    .line 1911
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1912
    .line 1913
    .line 1914
    move-result-object p1

    .line 1915
    const-string v2, "null cannot be cast to non-null type kotlin.Long"

    .line 1916
    .line 1917
    invoke-static {p1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1918
    .line 1919
    .line 1920
    check-cast p1, Ljava/lang/Long;

    .line 1921
    .line 1922
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 1923
    .line 1924
    .line 1925
    move-result-wide v2

    .line 1926
    :try_start_11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1927
    .line 1928
    .line 1929
    long-to-int p1, v2

    .line 1930
    invoke-virtual {v1, p1}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    .line 1931
    .line 1932
    .line 1933
    const/4 p1, 0x0

    .line 1934
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 1935
    .line 1936
    .line 1937
    move-result-object p1
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_11

    .line 1938
    goto :goto_11

    .line 1939
    :catchall_11
    move-exception v0

    .line 1940
    move-object p1, v0

    .line 1941
    nop

    .line 1942
    instance-of v0, p1, LM1/a;

    .line 1943
    .line 1944
    if-eqz v0, :cond_11

    .line 1945
    .line 1946
    check-cast p1, LM1/a;

    .line 1947
    .line 1948
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 1949
    .line 1950
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 1951
    .line 1952
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 1953
    .line 1954
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 1955
    .line 1956
    .line 1957
    move-result-object p1

    .line 1958
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 1959
    .line 1960
    .line 1961
    move-result-object p1

    .line 1962
    goto :goto_11

    .line 1963
    :cond_11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1964
    .line 1965
    .line 1966
    move-result-object v0

    .line 1967
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1968
    .line 1969
    .line 1970
    move-result-object v0

    .line 1971
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 1972
    .line 1973
    .line 1974
    move-result-object v1

    .line 1975
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1976
    .line 1977
    .line 1978
    move-result-object v2

    .line 1979
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1980
    .line 1981
    .line 1982
    move-result-object p1

    .line 1983
    const-string v3, "Cause: "

    .line 1984
    .line 1985
    const-string v4, ", Stacktrace: "

    .line 1986
    .line 1987
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1988
    .line 1989
    .line 1990
    move-result-object p1

    .line 1991
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 1992
    .line 1993
    .line 1994
    move-result-object p1

    .line 1995
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 1996
    .line 1997
    .line 1998
    move-result-object p1

    .line 1999
    :goto_11
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 2000
    .line 2001
    .line 2002
    return-void

    .line 2003
    :pswitch_12
    iget-object v0, p0, LM1/M;->l:LM1/s;

    .line 2004
    .line 2005
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 2006
    .line 2007
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2008
    .line 2009
    .line 2010
    check-cast p1, Ljava/util/List;

    .line 2011
    .line 2012
    const/4 v1, 0x0

    .line 2013
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2014
    .line 2015
    .line 2016
    move-result-object v1

    .line 2017
    const-string v2, "null cannot be cast to non-null type android.webkit.WebView"

    .line 2018
    .line 2019
    invoke-static {v1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2020
    .line 2021
    .line 2022
    check-cast v1, Landroid/webkit/WebView;

    .line 2023
    .line 2024
    const/4 v2, 0x1

    .line 2025
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2026
    .line 2027
    .line 2028
    move-result-object p1

    .line 2029
    check-cast p1, LM1/Z;

    .line 2030
    .line 2031
    :try_start_12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2032
    .line 2033
    .line 2034
    invoke-virtual {v1, p1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 2035
    .line 2036
    .line 2037
    const/4 p1, 0x0

    .line 2038
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 2039
    .line 2040
    .line 2041
    move-result-object p1
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_12

    .line 2042
    goto :goto_12

    .line 2043
    :catchall_12
    move-exception v0

    .line 2044
    move-object p1, v0

    .line 2045
    nop

    .line 2046
    instance-of v0, p1, LM1/a;

    .line 2047
    .line 2048
    if-eqz v0, :cond_12

    .line 2049
    .line 2050
    check-cast p1, LM1/a;

    .line 2051
    .line 2052
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 2053
    .line 2054
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 2055
    .line 2056
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 2057
    .line 2058
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 2059
    .line 2060
    .line 2061
    move-result-object p1

    .line 2062
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 2063
    .line 2064
    .line 2065
    move-result-object p1

    .line 2066
    goto :goto_12

    .line 2067
    :cond_12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2068
    .line 2069
    .line 2070
    move-result-object v0

    .line 2071
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 2072
    .line 2073
    .line 2074
    move-result-object v0

    .line 2075
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 2076
    .line 2077
    .line 2078
    move-result-object v1

    .line 2079
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 2080
    .line 2081
    .line 2082
    move-result-object v2

    .line 2083
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 2084
    .line 2085
    .line 2086
    move-result-object p1

    .line 2087
    const-string v3, "Cause: "

    .line 2088
    .line 2089
    const-string v4, ", Stacktrace: "

    .line 2090
    .line 2091
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2092
    .line 2093
    .line 2094
    move-result-object p1

    .line 2095
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 2096
    .line 2097
    .line 2098
    move-result-object p1

    .line 2099
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 2100
    .line 2101
    .line 2102
    move-result-object p1

    .line 2103
    :goto_12
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 2104
    .line 2105
    .line 2106
    return-void

    .line 2107
    :pswitch_13
    iget-object v0, p0, LM1/M;->l:LM1/s;

    .line 2108
    .line 2109
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 2110
    .line 2111
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2112
    .line 2113
    .line 2114
    check-cast p1, Ljava/util/List;

    .line 2115
    .line 2116
    const/4 v1, 0x0

    .line 2117
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2118
    .line 2119
    .line 2120
    move-result-object v1

    .line 2121
    const-string v2, "null cannot be cast to non-null type android.webkit.WebView"

    .line 2122
    .line 2123
    invoke-static {v1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2124
    .line 2125
    .line 2126
    check-cast v1, Landroid/webkit/WebView;

    .line 2127
    .line 2128
    const/4 v2, 0x1

    .line 2129
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2130
    .line 2131
    .line 2132
    move-result-object p1

    .line 2133
    const-string v2, "null cannot be cast to non-null type kotlin.Long"

    .line 2134
    .line 2135
    invoke-static {p1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2136
    .line 2137
    .line 2138
    check-cast p1, Ljava/lang/Long;

    .line 2139
    .line 2140
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 2141
    .line 2142
    .line 2143
    move-result-wide v2

    .line 2144
    :try_start_13
    iget-object p1, v0, LM1/s;->a:LM1/O;

    .line 2145
    .line 2146
    iget-object p1, p1, LM1/O;->c:Ljava/lang/Object;

    .line 2147
    .line 2148
    check-cast p1, LM1/d;

    .line 2149
    .line 2150
    invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 2151
    .line 2152
    .line 2153
    move-result-object v0

    .line 2154
    invoke-virtual {p1, v2, v3, v0}, LM1/d;->a(JLjava/lang/Object;)V

    .line 2155
    .line 2156
    .line 2157
    const/4 p1, 0x0

    .line 2158
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 2159
    .line 2160
    .line 2161
    move-result-object p1
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_13

    .line 2162
    goto :goto_13

    .line 2163
    :catchall_13
    move-exception v0

    .line 2164
    move-object p1, v0

    .line 2165
    nop

    .line 2166
    instance-of v0, p1, LM1/a;

    .line 2167
    .line 2168
    if-eqz v0, :cond_13

    .line 2169
    .line 2170
    check-cast p1, LM1/a;

    .line 2171
    .line 2172
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 2173
    .line 2174
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 2175
    .line 2176
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 2177
    .line 2178
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 2179
    .line 2180
    .line 2181
    move-result-object p1

    .line 2182
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 2183
    .line 2184
    .line 2185
    move-result-object p1

    .line 2186
    goto :goto_13

    .line 2187
    :cond_13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2188
    .line 2189
    .line 2190
    move-result-object v0

    .line 2191
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 2192
    .line 2193
    .line 2194
    move-result-object v0

    .line 2195
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 2196
    .line 2197
    .line 2198
    move-result-object v1

    .line 2199
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 2200
    .line 2201
    .line 2202
    move-result-object v2

    .line 2203
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 2204
    .line 2205
    .line 2206
    move-result-object p1

    .line 2207
    const-string v3, "Cause: "

    .line 2208
    .line 2209
    const-string v4, ", Stacktrace: "

    .line 2210
    .line 2211
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2212
    .line 2213
    .line 2214
    move-result-object p1

    .line 2215
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 2216
    .line 2217
    .line 2218
    move-result-object p1

    .line 2219
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 2220
    .line 2221
    .line 2222
    move-result-object p1

    .line 2223
    :goto_13
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 2224
    .line 2225
    .line 2226
    return-void

    .line 2227
    :pswitch_14
    iget-object v0, p0, LM1/M;->l:LM1/s;

    .line 2228
    .line 2229
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 2230
    .line 2231
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2232
    .line 2233
    .line 2234
    check-cast p1, Ljava/util/List;

    .line 2235
    .line 2236
    const/4 v1, 0x0

    .line 2237
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2238
    .line 2239
    .line 2240
    move-result-object v1

    .line 2241
    const-string v2, "null cannot be cast to non-null type android.webkit.WebView"

    .line 2242
    .line 2243
    invoke-static {v1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2244
    .line 2245
    .line 2246
    check-cast v1, Landroid/webkit/WebView;

    .line 2247
    .line 2248
    const/4 v2, 0x1

    .line 2249
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2250
    .line 2251
    .line 2252
    move-result-object p1

    .line 2253
    check-cast p1, Landroid/webkit/DownloadListener;

    .line 2254
    .line 2255
    :try_start_14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2256
    .line 2257
    .line 2258
    invoke-virtual {v1, p1}, Landroid/webkit/WebView;->setDownloadListener(Landroid/webkit/DownloadListener;)V

    .line 2259
    .line 2260
    .line 2261
    const/4 p1, 0x0

    .line 2262
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 2263
    .line 2264
    .line 2265
    move-result-object p1
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_14

    .line 2266
    goto :goto_14

    .line 2267
    :catchall_14
    move-exception v0

    .line 2268
    move-object p1, v0

    .line 2269
    nop

    .line 2270
    instance-of v0, p1, LM1/a;

    .line 2271
    .line 2272
    if-eqz v0, :cond_14

    .line 2273
    .line 2274
    check-cast p1, LM1/a;

    .line 2275
    .line 2276
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 2277
    .line 2278
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 2279
    .line 2280
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 2281
    .line 2282
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 2283
    .line 2284
    .line 2285
    move-result-object p1

    .line 2286
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 2287
    .line 2288
    .line 2289
    move-result-object p1

    .line 2290
    goto :goto_14

    .line 2291
    :cond_14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2292
    .line 2293
    .line 2294
    move-result-object v0

    .line 2295
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 2296
    .line 2297
    .line 2298
    move-result-object v0

    .line 2299
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 2300
    .line 2301
    .line 2302
    move-result-object v1

    .line 2303
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 2304
    .line 2305
    .line 2306
    move-result-object v2

    .line 2307
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 2308
    .line 2309
    .line 2310
    move-result-object p1

    .line 2311
    const-string v3, "Cause: "

    .line 2312
    .line 2313
    const-string v4, ", Stacktrace: "

    .line 2314
    .line 2315
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2316
    .line 2317
    .line 2318
    move-result-object p1

    .line 2319
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 2320
    .line 2321
    .line 2322
    move-result-object p1

    .line 2323
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 2324
    .line 2325
    .line 2326
    move-result-object p1

    .line 2327
    :goto_14
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 2328
    .line 2329
    .line 2330
    return-void

    .line 2331
    :pswitch_15
    iget-object v0, p0, LM1/M;->l:LM1/s;

    .line 2332
    .line 2333
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 2334
    .line 2335
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2336
    .line 2337
    .line 2338
    check-cast p1, Ljava/util/List;

    .line 2339
    .line 2340
    const/4 v1, 0x0

    .line 2341
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2342
    .line 2343
    .line 2344
    move-result-object p1

    .line 2345
    const-string v1, "null cannot be cast to non-null type kotlin.Long"

    .line 2346
    .line 2347
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2348
    .line 2349
    .line 2350
    check-cast p1, Ljava/lang/Long;

    .line 2351
    .line 2352
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 2353
    .line 2354
    .line 2355
    move-result-wide v1

    .line 2356
    :try_start_15
    iget-object p1, v0, LM1/s;->a:LM1/O;

    .line 2357
    .line 2358
    iget-object p1, p1, LM1/O;->c:Ljava/lang/Object;

    .line 2359
    .line 2360
    check-cast p1, LM1/d;

    .line 2361
    .line 2362
    invoke-virtual {v0}, LM1/s;->a()LM1/k0;

    .line 2363
    .line 2364
    .line 2365
    move-result-object v0

    .line 2366
    invoke-virtual {p1, v1, v2, v0}, LM1/d;->a(JLjava/lang/Object;)V

    .line 2367
    .line 2368
    .line 2369
    const/4 p1, 0x0

    .line 2370
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 2371
    .line 2372
    .line 2373
    move-result-object p1
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_15

    .line 2374
    goto :goto_15

    .line 2375
    :catchall_15
    move-exception v0

    .line 2376
    move-object p1, v0

    .line 2377
    nop

    .line 2378
    instance-of v0, p1, LM1/a;

    .line 2379
    .line 2380
    if-eqz v0, :cond_15

    .line 2381
    .line 2382
    check-cast p1, LM1/a;

    .line 2383
    .line 2384
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 2385
    .line 2386
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 2387
    .line 2388
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 2389
    .line 2390
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 2391
    .line 2392
    .line 2393
    move-result-object p1

    .line 2394
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 2395
    .line 2396
    .line 2397
    move-result-object p1

    .line 2398
    goto :goto_15

    .line 2399
    :cond_15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2400
    .line 2401
    .line 2402
    move-result-object v0

    .line 2403
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 2404
    .line 2405
    .line 2406
    move-result-object v0

    .line 2407
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 2408
    .line 2409
    .line 2410
    move-result-object v1

    .line 2411
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 2412
    .line 2413
    .line 2414
    move-result-object v2

    .line 2415
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 2416
    .line 2417
    .line 2418
    move-result-object p1

    .line 2419
    const-string v3, "Cause: "

    .line 2420
    .line 2421
    const-string v4, ", Stacktrace: "

    .line 2422
    .line 2423
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2424
    .line 2425
    .line 2426
    move-result-object p1

    .line 2427
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 2428
    .line 2429
    .line 2430
    move-result-object p1

    .line 2431
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 2432
    .line 2433
    .line 2434
    move-result-object p1

    .line 2435
    :goto_15
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 2436
    .line 2437
    .line 2438
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
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

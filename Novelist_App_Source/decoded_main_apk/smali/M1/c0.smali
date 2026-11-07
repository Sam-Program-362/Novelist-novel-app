.class public final synthetic LM1/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:I

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, LM1/c0;->k:I

    iput-object p1, p0, LM1/c0;->l:Ljava/lang/Object;

    iput-object p2, p0, LM1/c0;->m:Ljava/lang/Object;

    iput-object p3, p0, LM1/c0;->n:Ljava/lang/Object;

    iput-object p4, p0, LM1/c0;->o:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget v0, p0, LM1/c0;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LM1/c0;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LB1/o;

    .line 9
    .line 10
    iget-object v1, p0, LM1/c0;->m:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/lang/String;

    .line 13
    .line 14
    iget-object v2, p0, LM1/c0;->n:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Ljava/lang/String;

    .line 17
    .line 18
    iget-object v0, v0, LB1/o;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, LB1/o;

    .line 21
    .line 22
    iget-object v3, p0, LM1/c0;->o:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2, v3}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    iget-object v0, p0, LM1/c0;->l:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, LM1/g0;

    .line 31
    .line 32
    iget-object v1, p0, LM1/c0;->m:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Landroid/webkit/WebView;

    .line 35
    .line 36
    iget-object v2, p0, LM1/c0;->n:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v2, Landroid/webkit/WebResourceRequest;

    .line 39
    .line 40
    iget-object v3, p0, LM1/c0;->o:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v3, Landroid/webkit/WebResourceResponse;

    .line 43
    .line 44
    iget-object v4, v0, LM1/g0;->a:LM1/n;

    .line 45
    .line 46
    new-instance v5, LM1/q;

    .line 47
    .line 48
    const/4 v6, 0x2

    .line 49
    invoke-direct {v5, v6}, LM1/q;-><init>(I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    const-string v6, "webViewArg"

    .line 56
    .line 57
    invoke-static {v1, v6}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const-string v6, "requestArg"

    .line 61
    .line 62
    invoke-static {v2, v6}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    const-string v6, "responseArg"

    .line 66
    .line 67
    invoke-static {v3, v6}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    iget-object v4, v4, LM1/n;->a:LM1/O;

    .line 71
    .line 72
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    iget-object v6, v4, LM1/O;->c:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v6, LM1/d;

    .line 78
    .line 79
    invoke-virtual {v6, v0}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    if-nez v6, :cond_0

    .line 84
    .line 85
    const-string v0, "Callback to `WebViewClient.onReceivedHttpError` failed because native instance was not in the instance manager."

    .line 86
    .line 87
    const-string v1, ""

    .line 88
    .line 89
    const-string v2, "missing-instance-error"

    .line 90
    .line 91
    invoke-static {v2, v0, v1}, LB1/e;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_0
    iget-object v6, v4, LM1/O;->b:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v6, LC1/f;

    .line 98
    .line 99
    invoke-virtual {v4}, LM1/O;->a()LC1/l;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    new-instance v7, LB1/s;

    .line 104
    .line 105
    const-string v8, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpError"

    .line 106
    .line 107
    const/4 v9, 0x0

    .line 108
    invoke-direct {v7, v6, v8, v4, v9}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 109
    .line 110
    .line 111
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-static {v0}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    new-instance v1, LD/c;

    .line 120
    .line 121
    const/16 v2, 0x1a

    .line 122
    .line 123
    invoke-direct {v1, v5, v2}, LD/c;-><init>(Ljava/lang/Object;I)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v7, v0, v1}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 127
    .line 128
    .line 129
    :goto_0
    return-void

    .line 130
    :pswitch_1
    iget-object v0, p0, LM1/c0;->l:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v0, LM1/g0;

    .line 133
    .line 134
    iget-object v1, p0, LM1/c0;->m:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v1, Landroid/webkit/WebView;

    .line 137
    .line 138
    iget-object v2, p0, LM1/c0;->n:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v2, Landroid/webkit/WebResourceRequest;

    .line 141
    .line 142
    iget-object v3, p0, LM1/c0;->o:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v3, Landroid/webkit/WebResourceError;

    .line 145
    .line 146
    iget-object v4, v0, LM1/g0;->a:LM1/n;

    .line 147
    .line 148
    new-instance v5, LM1/q;

    .line 149
    .line 150
    const/4 v6, 0x2

    .line 151
    invoke-direct {v5, v6}, LM1/q;-><init>(I)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    const-string v6, "webViewArg"

    .line 158
    .line 159
    invoke-static {v1, v6}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    const-string v6, "requestArg"

    .line 163
    .line 164
    invoke-static {v2, v6}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    const-string v6, "errorArg"

    .line 168
    .line 169
    invoke-static {v3, v6}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    iget-object v4, v4, LM1/n;->a:LM1/O;

    .line 173
    .line 174
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    iget-object v6, v4, LM1/O;->c:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v6, LM1/d;

    .line 180
    .line 181
    invoke-virtual {v6, v0}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v6

    .line 185
    if-nez v6, :cond_1

    .line 186
    .line 187
    const-string v0, "Callback to `WebViewClient.onReceivedRequestError` failed because native instance was not in the instance manager."

    .line 188
    .line 189
    const-string v1, ""

    .line 190
    .line 191
    const-string v2, "missing-instance-error"

    .line 192
    .line 193
    invoke-static {v2, v0, v1}, LB1/e;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    goto :goto_1

    .line 197
    :cond_1
    iget-object v6, v4, LM1/O;->b:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v6, LC1/f;

    .line 200
    .line 201
    invoke-virtual {v4}, LM1/O;->a()LC1/l;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    new-instance v7, LB1/s;

    .line 206
    .line 207
    const-string v8, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestError"

    .line 208
    .line 209
    const/4 v9, 0x0

    .line 210
    invoke-direct {v7, v6, v8, v4, v9}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 211
    .line 212
    .line 213
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-static {v0}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    new-instance v1, LM1/N;

    .line 222
    .line 223
    const/4 v2, 0x3

    .line 224
    invoke-direct {v1, v5, v2}, LM1/N;-><init>(Ljava/lang/Object;I)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v7, v0, v1}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 228
    .line 229
    .line 230
    :goto_1
    return-void

    .line 231
    :pswitch_2
    iget-object v0, p0, LM1/c0;->l:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v0, LM1/g0;

    .line 234
    .line 235
    iget-object v1, p0, LM1/c0;->m:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v1, Landroid/webkit/WebView;

    .line 238
    .line 239
    iget-object v2, p0, LM1/c0;->n:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v2, Landroid/webkit/SslErrorHandler;

    .line 242
    .line 243
    iget-object v3, p0, LM1/c0;->o:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v3, Landroid/net/http/SslError;

    .line 246
    .line 247
    iget-object v4, v0, LM1/g0;->a:LM1/n;

    .line 248
    .line 249
    new-instance v5, LM1/q;

    .line 250
    .line 251
    const/4 v6, 0x2

    .line 252
    invoke-direct {v5, v6}, LM1/q;-><init>(I)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    const-string v6, "viewArg"

    .line 259
    .line 260
    invoke-static {v1, v6}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    const-string v6, "handlerArg"

    .line 264
    .line 265
    invoke-static {v2, v6}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    const-string v6, "errorArg"

    .line 269
    .line 270
    invoke-static {v3, v6}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    iget-object v4, v4, LM1/n;->a:LM1/O;

    .line 274
    .line 275
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    iget-object v6, v4, LM1/O;->c:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast v6, LM1/d;

    .line 281
    .line 282
    invoke-virtual {v6, v0}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v6

    .line 286
    if-nez v6, :cond_2

    .line 287
    .line 288
    const-string v0, "Callback to `WebViewClient.onReceivedSslError` failed because native instance was not in the instance manager."

    .line 289
    .line 290
    const-string v1, ""

    .line 291
    .line 292
    const-string v2, "missing-instance-error"

    .line 293
    .line 294
    invoke-static {v2, v0, v1}, LB1/e;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    goto :goto_2

    .line 298
    :cond_2
    iget-object v6, v4, LM1/O;->b:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast v6, LC1/f;

    .line 301
    .line 302
    invoke-virtual {v4}, LM1/O;->a()LC1/l;

    .line 303
    .line 304
    .line 305
    move-result-object v4

    .line 306
    new-instance v7, LB1/s;

    .line 307
    .line 308
    const-string v8, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedSslError"

    .line 309
    .line 310
    const/4 v9, 0x0

    .line 311
    invoke-direct {v7, v6, v8, v4, v9}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 312
    .line 313
    .line 314
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    invoke-static {v0}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    new-instance v1, LM1/N;

    .line 323
    .line 324
    const/4 v2, 0x7

    .line 325
    invoke-direct {v1, v5, v2}, LM1/N;-><init>(Ljava/lang/Object;I)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v7, v0, v1}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 329
    .line 330
    .line 331
    :goto_2
    return-void

    .line 332
    :pswitch_3
    iget-object v0, p0, LM1/c0;->l:Ljava/lang/Object;

    .line 333
    .line 334
    check-cast v0, LM1/g0;

    .line 335
    .line 336
    iget-object v1, p0, LM1/c0;->m:Ljava/lang/Object;

    .line 337
    .line 338
    check-cast v1, Landroid/webkit/WebView;

    .line 339
    .line 340
    iget-object v2, p0, LM1/c0;->n:Ljava/lang/Object;

    .line 341
    .line 342
    check-cast v2, Landroid/os/Message;

    .line 343
    .line 344
    iget-object v3, p0, LM1/c0;->o:Ljava/lang/Object;

    .line 345
    .line 346
    check-cast v3, Landroid/os/Message;

    .line 347
    .line 348
    iget-object v4, v0, LM1/g0;->a:LM1/n;

    .line 349
    .line 350
    new-instance v5, LM1/q;

    .line 351
    .line 352
    const/4 v6, 0x2

    .line 353
    invoke-direct {v5, v6}, LM1/q;-><init>(I)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 357
    .line 358
    .line 359
    const-string v6, "viewArg"

    .line 360
    .line 361
    invoke-static {v1, v6}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    const-string v6, "dontResendArg"

    .line 365
    .line 366
    invoke-static {v2, v6}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    const-string v6, "resendArg"

    .line 370
    .line 371
    invoke-static {v3, v6}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    iget-object v4, v4, LM1/n;->a:LM1/O;

    .line 375
    .line 376
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 377
    .line 378
    .line 379
    iget-object v6, v4, LM1/O;->c:Ljava/lang/Object;

    .line 380
    .line 381
    check-cast v6, LM1/d;

    .line 382
    .line 383
    invoke-virtual {v6, v0}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    move-result v6

    .line 387
    if-nez v6, :cond_3

    .line 388
    .line 389
    const-string v0, "Callback to `WebViewClient.onFormResubmission` failed because native instance was not in the instance manager."

    .line 390
    .line 391
    const-string v1, ""

    .line 392
    .line 393
    const-string v2, "missing-instance-error"

    .line 394
    .line 395
    invoke-static {v2, v0, v1}, LB1/e;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    goto :goto_3

    .line 399
    :cond_3
    iget-object v6, v4, LM1/O;->b:Ljava/lang/Object;

    .line 400
    .line 401
    check-cast v6, LC1/f;

    .line 402
    .line 403
    invoke-virtual {v4}, LM1/O;->a()LC1/l;

    .line 404
    .line 405
    .line 406
    move-result-object v4

    .line 407
    new-instance v7, LB1/s;

    .line 408
    .line 409
    const-string v8, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onFormResubmission"

    .line 410
    .line 411
    const/4 v9, 0x0

    .line 412
    invoke-direct {v7, v6, v8, v4, v9}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 413
    .line 414
    .line 415
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    invoke-static {v0}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    new-instance v1, LM1/N;

    .line 424
    .line 425
    const/4 v2, 0x6

    .line 426
    invoke-direct {v1, v5, v2}, LM1/N;-><init>(Ljava/lang/Object;I)V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v7, v0, v1}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 430
    .line 431
    .line 432
    :goto_3
    return-void

    .line 433
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

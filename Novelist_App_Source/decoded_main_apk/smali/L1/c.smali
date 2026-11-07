.class public final synthetic LL1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC1/b;


# instance fields
.field public final synthetic k:I

.field public final synthetic l:LL1/e;


# direct methods
.method public synthetic constructor <init>(LL1/e;I)V
    .locals 0

    .line 1
    iput p2, p0, LL1/c;->k:I

    iput-object p1, p0, LL1/c;->l:LL1/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;LA/c;)V
    .locals 7

    .line 1
    iget v0, p0, LL1/c;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LL1/c;->l:LL1/e;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    :try_start_0
    check-cast p1, LA0/j;

    .line 10
    .line 11
    iget-object p1, p1, LA0/j;->l:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Landroid/content/Context;

    .line 14
    .line 15
    new-instance v1, Landroid/content/Intent;

    .line 16
    .line 17
    const-string v2, "close action"

    .line 18
    .line 19
    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    instance-of v1, p1, LL1/b;

    .line 32
    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    check-cast p1, LL1/b;

    .line 36
    .line 37
    iget-object v1, p1, LL1/b;->k:Ljava/lang/String;

    .line 38
    .line 39
    iget-object p1, p1, LL1/b;->l:Ljava/lang/String;

    .line 40
    .line 41
    filled-new-array {v1, p1, v0}, [Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    const-string v3, "Cause: "

    .line 71
    .line 72
    const-string v4, ", Stacktrace: "

    .line 73
    .line 74
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    :goto_0
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :pswitch_0
    iget-object p1, p0, LL1/c;->l:LL1/e;

    .line 91
    .line 92
    :try_start_1
    check-cast p1, LA0/j;

    .line 93
    .line 94
    invoke-virtual {p1}, LA0/j;->M()Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 106
    goto :goto_1

    .line 107
    :catchall_1
    move-exception p1

    .line 108
    instance-of v0, p1, LL1/b;

    .line 109
    .line 110
    if-eqz v0, :cond_1

    .line 111
    .line 112
    check-cast p1, LL1/b;

    .line 113
    .line 114
    iget-object v0, p1, LL1/b;->l:Ljava/lang/String;

    .line 115
    .line 116
    const/4 v1, 0x0

    .line 117
    iget-object p1, p1, LL1/b;->k:Ljava/lang/String;

    .line 118
    .line 119
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    goto :goto_1

    .line 128
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    const-string v3, "Cause: "

    .line 149
    .line 150
    const-string v4, ", Stacktrace: "

    .line 151
    .line 152
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    :goto_1
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :pswitch_1
    iget-object v0, p0, LL1/c;->l:LL1/e;

    .line 169
    .line 170
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 171
    .line 172
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    check-cast p1, Ljava/util/List;

    .line 176
    .line 177
    const/4 v1, 0x0

    .line 178
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    const-string v2, "null cannot be cast to non-null type kotlin.String"

    .line 183
    .line 184
    invoke-static {v1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    check-cast v1, Ljava/lang/String;

    .line 188
    .line 189
    const/4 v2, 0x1

    .line 190
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    const-string v3, "null cannot be cast to non-null type kotlin.Boolean"

    .line 195
    .line 196
    invoke-static {v2, v3}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    check-cast v2, Ljava/lang/Boolean;

    .line 200
    .line 201
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 202
    .line 203
    .line 204
    move-result v2

    .line 205
    const/4 v3, 0x2

    .line 206
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    const-string v4, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.WebViewOptions"

    .line 211
    .line 212
    invoke-static {v3, v4}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    check-cast v3, LL1/k;

    .line 216
    .line 217
    const/4 v4, 0x3

    .line 218
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    const-string v4, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.BrowserOptions"

    .line 223
    .line 224
    invoke-static {p1, v4}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    check-cast p1, LL1/a;

    .line 228
    .line 229
    :try_start_2
    check-cast v0, LA0/j;

    .line 230
    .line 231
    invoke-virtual {v0, v1, v2, v3, p1}, LA0/j;->I(Ljava/lang/String;ZLL1/k;LL1/a;)Z

    .line 232
    .line 233
    .line 234
    move-result p1

    .line 235
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 240
    .line 241
    .line 242
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 243
    goto :goto_2

    .line 244
    :catchall_2
    move-exception p1

    .line 245
    instance-of v0, p1, LL1/b;

    .line 246
    .line 247
    if-eqz v0, :cond_2

    .line 248
    .line 249
    check-cast p1, LL1/b;

    .line 250
    .line 251
    iget-object v0, p1, LL1/b;->l:Ljava/lang/String;

    .line 252
    .line 253
    const/4 v1, 0x0

    .line 254
    iget-object p1, p1, LL1/b;->k:Ljava/lang/String;

    .line 255
    .line 256
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    goto :goto_2

    .line 265
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    const-string v3, "Cause: "

    .line 286
    .line 287
    const-string v4, ", Stacktrace: "

    .line 288
    .line 289
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    :goto_2
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    return-void

    .line 305
    :pswitch_2
    iget-object v0, p0, LL1/c;->l:LL1/e;

    .line 306
    .line 307
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 308
    .line 309
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    check-cast p1, Ljava/util/List;

    .line 313
    .line 314
    const/4 v1, 0x0

    .line 315
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    const-string v3, "null cannot be cast to non-null type kotlin.String"

    .line 320
    .line 321
    invoke-static {v2, v3}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    check-cast v2, Ljava/lang/String;

    .line 325
    .line 326
    const/4 v3, 0x1

    .line 327
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v4

    .line 331
    const-string v5, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>"

    .line 332
    .line 333
    invoke-static {v4, v5}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    check-cast v4, Ljava/util/Map;

    .line 337
    .line 338
    const/4 v5, 0x2

    .line 339
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object p1

    .line 343
    const-string v5, "null cannot be cast to non-null type kotlin.Boolean"

    .line 344
    .line 345
    invoke-static {p1, v5}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    check-cast p1, Ljava/lang/Boolean;

    .line 349
    .line 350
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 351
    .line 352
    .line 353
    move-result p1

    .line 354
    :try_start_3
    check-cast v0, LA0/j;

    .line 355
    .line 356
    iget-object v5, v0, LA0/j;->n:Ljava/lang/Object;

    .line 357
    .line 358
    check-cast v5, Landroid/app/Activity;

    .line 359
    .line 360
    if-eqz v5, :cond_4

    .line 361
    .line 362
    new-instance v5, Landroid/content/Intent;

    .line 363
    .line 364
    const-string v6, "android.intent.action.VIEW"

    .line 365
    .line 366
    invoke-direct {v5, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 370
    .line 371
    .line 372
    move-result-object v2

    .line 373
    invoke-virtual {v5, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    const-string v5, "com.android.browser.headers"

    .line 378
    .line 379
    invoke-static {v4}, LA0/j;->v(Ljava/util/Map;)Landroid/os/Bundle;

    .line 380
    .line 381
    .line 382
    move-result-object v4

    .line 383
    invoke-virtual {v2, v5, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 384
    .line 385
    .line 386
    move-result-object v2

    .line 387
    if-eqz p1, :cond_3

    .line 388
    .line 389
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 390
    .line 391
    const/16 v4, 0x1e

    .line 392
    .line 393
    if-lt p1, v4, :cond_3

    .line 394
    .line 395
    const/16 p1, 0x400

    .line 396
    .line 397
    invoke-virtual {v2, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 398
    .line 399
    .line 400
    :cond_3
    :try_start_4
    iget-object p1, v0, LA0/j;->n:Ljava/lang/Object;

    .line 401
    .line 402
    check-cast p1, Landroid/app/Activity;

    .line 403
    .line 404
    invoke-virtual {p1, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_4
    .catch Landroid/content/ActivityNotFoundException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 405
    .line 406
    .line 407
    move v1, v3

    .line 408
    :catch_0
    :try_start_5
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 409
    .line 410
    .line 411
    move-result-object p1

    .line 412
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 413
    .line 414
    .line 415
    move-result-object p1

    .line 416
    goto :goto_4

    .line 417
    :catchall_3
    move-exception p1

    .line 418
    goto :goto_3

    .line 419
    :cond_4
    new-instance p1, LL1/b;

    .line 420
    .line 421
    invoke-direct {p1}, LL1/b;-><init>()V

    .line 422
    .line 423
    .line 424
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 425
    :goto_3
    instance-of v0, p1, LL1/b;

    .line 426
    .line 427
    if-eqz v0, :cond_5

    .line 428
    .line 429
    check-cast p1, LL1/b;

    .line 430
    .line 431
    iget-object v0, p1, LL1/b;->l:Ljava/lang/String;

    .line 432
    .line 433
    const/4 v1, 0x0

    .line 434
    iget-object p1, p1, LL1/b;->k:Ljava/lang/String;

    .line 435
    .line 436
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object p1

    .line 440
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 441
    .line 442
    .line 443
    move-result-object p1

    .line 444
    goto :goto_4

    .line 445
    :cond_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v1

    .line 457
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 458
    .line 459
    .line 460
    move-result-object v2

    .line 461
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object p1

    .line 465
    const-string v3, "Cause: "

    .line 466
    .line 467
    const-string v4, ", Stacktrace: "

    .line 468
    .line 469
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object p1

    .line 473
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object p1

    .line 477
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 478
    .line 479
    .line 480
    move-result-object p1

    .line 481
    :goto_4
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 482
    .line 483
    .line 484
    return-void

    .line 485
    :pswitch_3
    iget-object v0, p0, LL1/c;->l:LL1/e;

    .line 486
    .line 487
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 488
    .line 489
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 490
    .line 491
    .line 492
    check-cast p1, Ljava/util/List;

    .line 493
    .line 494
    const/4 v1, 0x0

    .line 495
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object p1

    .line 499
    const-string v2, "null cannot be cast to non-null type kotlin.String"

    .line 500
    .line 501
    invoke-static {p1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 502
    .line 503
    .line 504
    check-cast p1, Ljava/lang/String;

    .line 505
    .line 506
    const/4 v2, 0x0

    .line 507
    :try_start_6
    check-cast v0, LA0/j;

    .line 508
    .line 509
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 510
    .line 511
    .line 512
    new-instance v3, Landroid/content/Intent;

    .line 513
    .line 514
    const-string v4, "android.intent.action.VIEW"

    .line 515
    .line 516
    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 517
    .line 518
    .line 519
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 520
    .line 521
    .line 522
    move-result-object p1

    .line 523
    invoke-virtual {v3, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 524
    .line 525
    .line 526
    iget-object p1, v0, LA0/j;->m:Ljava/lang/Object;

    .line 527
    .line 528
    check-cast p1, LB1/d;

    .line 529
    .line 530
    iget-object p1, p1, LB1/d;->l:Ljava/lang/Object;

    .line 531
    .line 532
    check-cast p1, Landroid/content/Context;

    .line 533
    .line 534
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 535
    .line 536
    .line 537
    move-result-object p1

    .line 538
    invoke-virtual {v3, p1}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    .line 539
    .line 540
    .line 541
    move-result-object p1

    .line 542
    if-nez p1, :cond_6

    .line 543
    .line 544
    move-object p1, v2

    .line 545
    goto :goto_5

    .line 546
    :cond_6
    invoke-virtual {p1}, Landroid/content/ComponentName;->toShortString()Ljava/lang/String;

    .line 547
    .line 548
    .line 549
    move-result-object p1

    .line 550
    :goto_5
    if-nez p1, :cond_7

    .line 551
    .line 552
    goto :goto_6

    .line 553
    :cond_7
    const-string v0, "{com.android.fallback/com.android.fallback.Fallback}"

    .line 554
    .line 555
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 556
    .line 557
    .line 558
    move-result p1

    .line 559
    xor-int/lit8 v1, p1, 0x1

    .line 560
    .line 561
    :goto_6
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 562
    .line 563
    .line 564
    move-result-object p1

    .line 565
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 566
    .line 567
    .line 568
    move-result-object p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 569
    goto :goto_7

    .line 570
    :catchall_4
    move-exception p1

    .line 571
    instance-of v0, p1, LL1/b;

    .line 572
    .line 573
    if-eqz v0, :cond_8

    .line 574
    .line 575
    check-cast p1, LL1/b;

    .line 576
    .line 577
    iget-object v0, p1, LL1/b;->k:Ljava/lang/String;

    .line 578
    .line 579
    iget-object p1, p1, LL1/b;->l:Ljava/lang/String;

    .line 580
    .line 581
    filled-new-array {v0, p1, v2}, [Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    move-result-object p1

    .line 585
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 586
    .line 587
    .line 588
    move-result-object p1

    .line 589
    goto :goto_7

    .line 590
    :cond_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 591
    .line 592
    .line 593
    move-result-object v0

    .line 594
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 595
    .line 596
    .line 597
    move-result-object v0

    .line 598
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 599
    .line 600
    .line 601
    move-result-object v1

    .line 602
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 603
    .line 604
    .line 605
    move-result-object v2

    .line 606
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 607
    .line 608
    .line 609
    move-result-object p1

    .line 610
    const-string v3, "Cause: "

    .line 611
    .line 612
    const-string v4, ", Stacktrace: "

    .line 613
    .line 614
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object p1

    .line 618
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 619
    .line 620
    .line 621
    move-result-object p1

    .line 622
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 623
    .line 624
    .line 625
    move-result-object p1

    .line 626
    :goto_7
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 627
    .line 628
    .line 629
    return-void

    .line 630
    nop

    .line 631
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

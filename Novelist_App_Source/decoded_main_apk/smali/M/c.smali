.class public final synthetic LM/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:I

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, LM/c;->k:I

    iput-object p1, p0, LM/c;->l:Ljava/lang/Object;

    iput-object p2, p0, LM/c;->m:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, LM/c;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LM/c;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/io/InputStream;

    .line 9
    .line 10
    iget-object v1, p0, LM/c;->m:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/io/OutputStream;

    .line 13
    .line 14
    invoke-static {v0, v1}, Lorg/apache/tika/embedder/ExternalEmbedder;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object v0, p0, LM/c;->l:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lk/s;

    .line 21
    .line 22
    iget-object v1, p0, LM/c;->m:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Landroid/graphics/Typeface;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lk/s;->b(Landroid/graphics/Typeface;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_1
    iget-object v0, p0, LM/c;->l:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Lorg/apache/tika/pipes/async/AsyncProcessor;

    .line 33
    .line 34
    iget-object v1, p0, LM/c;->m:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, Lorg/apache/tika/pipes/pipesiterator/TotalCounter;

    .line 37
    .line 38
    invoke-static {v0, v1}, Lorg/apache/tika/pipes/async/AsyncProcessor;->a(Lorg/apache/tika/pipes/async/AsyncProcessor;Lorg/apache/tika/pipes/pipesiterator/TotalCounter;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_2
    iget-object v0, p0, LM/c;->l:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Ljava/lang/Process;

    .line 45
    .line 46
    iget-object v1, p0, LM/c;->m:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, Ljava/io/InputStream;

    .line 49
    .line 50
    invoke-static {v0, v1}, Lorg/apache/tika/parser/external/ExternalParser;->b(Ljava/lang/Process;Ljava/io/InputStream;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :pswitch_3
    iget-object v0, p0, LM/c;->l:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, LB1/i;

    .line 57
    .line 58
    iget-object v1, p0, LM/c;->m:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v1, Lk1/g;

    .line 61
    .line 62
    monitor-enter v0

    .line 63
    :try_start_0
    new-instance v2, Ljava/util/HashSet;

    .line 64
    .line 65
    iget-object v3, v0, LB1/i;->e:Ljava/io/Serializable;

    .line 66
    .line 67
    check-cast v3, Ljava/util/HashSet;

    .line 68
    .line 69
    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 70
    .line 71
    .line 72
    iget-object v3, v0, LB1/i;->f:Ljava/io/Serializable;

    .line 73
    .line 74
    check-cast v3, Ljava/util/HashSet;

    .line 75
    .line 76
    invoke-virtual {v3, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    iget-object v3, v0, LB1/i;->e:Ljava/io/Serializable;

    .line 80
    .line 81
    check-cast v3, Ljava/util/HashSet;

    .line 82
    .line 83
    invoke-virtual {v3, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    iget-object v3, v1, Lk1/g;->f:Lk1/f;

    .line 87
    .line 88
    if-eqz v3, :cond_0

    .line 89
    .line 90
    iget-object v3, v3, Lk1/f;->a:LH0/i;

    .line 91
    .line 92
    if-eqz v3, :cond_0

    .line 93
    .line 94
    iget-object v3, v3, LH0/i;->l:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v3, Lk1/e;

    .line 97
    .line 98
    invoke-virtual {v3}, Lk1/e;->k()Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    if-eqz v3, :cond_0

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_0
    iget-object v3, v1, Lk1/g;->f:Lk1/f;

    .line 106
    .line 107
    const/4 v4, 0x0

    .line 108
    if-eqz v3, :cond_1

    .line 109
    .line 110
    invoke-virtual {v3}, Lk1/f;->a()Ljava/lang/Integer;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    goto :goto_0

    .line 115
    :cond_1
    move-object v3, v4

    .line 116
    :goto_0
    if-eqz v3, :cond_3

    .line 117
    .line 118
    iget-object v3, v0, LB1/i;->g:Ljava/io/Serializable;

    .line 119
    .line 120
    check-cast v3, Ljava/util/HashMap;

    .line 121
    .line 122
    iget-object v5, v1, Lk1/g;->f:Lk1/f;

    .line 123
    .line 124
    if-eqz v5, :cond_2

    .line 125
    .line 126
    invoke-virtual {v5}, Lk1/f;->a()Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    :cond_2
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    goto :goto_1

    .line 134
    :catchall_0
    move-exception v1

    .line 135
    goto :goto_3

    .line 136
    :cond_3
    :goto_1
    invoke-virtual {v0, v1}, LB1/i;->e(Lk1/g;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    if-eqz v2, :cond_4

    .line 148
    .line 149
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    check-cast v2, Lk1/g;

    .line 154
    .line 155
    invoke-virtual {v0, v2}, LB1/i;->e(Lk1/g;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 156
    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_4
    monitor-exit v0

    .line 160
    return-void

    .line 161
    :goto_3
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 162
    throw v1

    .line 163
    :pswitch_4
    iget-object v0, p0, LM/c;->l:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v0, Lk1/g;

    .line 166
    .line 167
    iget-object v1, p0, LM/c;->m:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v1, Lk1/f;

    .line 170
    .line 171
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    iget-object v2, v1, Lk1/f;->b:Ljava/lang/Runnable;

    .line 175
    .line 176
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    .line 177
    .line 178
    .line 179
    iput-object v1, v0, Lk1/g;->f:Lk1/f;

    .line 180
    .line 181
    iget-object v0, v0, Lk1/g;->e:LM/c;

    .line 182
    .line 183
    invoke-virtual {v0}, LM/c;->run()V

    .line 184
    .line 185
    .line 186
    return-void

    .line 187
    :pswitch_5
    iget-object v0, p0, LM/c;->l:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v0, LB1/o;

    .line 190
    .line 191
    iget-object v1, p0, LM/c;->m:Ljava/lang/Object;

    .line 192
    .line 193
    iget-object v0, v0, LB1/o;->b:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v0, LB1/o;

    .line 196
    .line 197
    invoke-virtual {v0, v1}, LB1/o;->d(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    return-void

    .line 201
    :pswitch_6
    iget-object v0, p0, LM/c;->l:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v0, Landroid/view/ViewGroup;

    .line 204
    .line 205
    const-string v1, "$container"

    .line 206
    .line 207
    invoke-static {v0, v1}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    const/4 v1, 0x0

    .line 211
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 212
    .line 213
    .line 214
    const/4 v0, 0x0

    .line 215
    throw v0

    .line 216
    :pswitch_7
    iget-object v0, p0, LM/c;->l:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v0, Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;

    .line 219
    .line 220
    iget-object v1, p0, LM/c;->m:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v1, Lb/t;

    .line 223
    .line 224
    iget-object v2, v0, Ls/b;->k:Landroidx/lifecycle/u;

    .line 225
    .line 226
    new-instance v3, Lb/c;

    .line 227
    .line 228
    invoke-direct {v3, v1, v0}, Lb/c;-><init>(Lb/t;Lb/k;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2, v3}, Landroidx/lifecycle/u;->a(Landroidx/lifecycle/r;)V

    .line 232
    .line 233
    .line 234
    return-void

    .line 235
    :pswitch_8
    iget-object v0, p0, LM/c;->l:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v0, LQ/b;

    .line 238
    .line 239
    iget-object v1, p0, LM/c;->m:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v1, LI/i;

    .line 242
    .line 243
    invoke-virtual {v0}, LQ/b;->d()LH/d;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-interface {v0, v1}, LH/d;->b(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    return-void

    .line 251
    :pswitch_9
    iget-object v0, p0, LM/c;->l:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v0, LQ/b;

    .line 254
    .line 255
    iget-object v1, p0, LM/c;->m:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v1, LH/l;

    .line 258
    .line 259
    invoke-virtual {v0}, LQ/b;->d()LH/d;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-interface {v0, v1}, LH/d;->onResult(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    return-void

    .line 267
    :pswitch_a
    iget-object v0, p0, LM/c;->l:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast v0, LQ/b;

    .line 270
    .line 271
    iget-object v1, p0, LM/c;->m:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v1, La2/o;

    .line 274
    .line 275
    invoke-virtual {v0}, LQ/b;->d()LH/d;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    iget-object v1, v1, La2/o;->k:Ljava/lang/Object;

    .line 280
    .line 281
    invoke-interface {v0, v1}, LH/d;->b(Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    return-void

    .line 285
    :pswitch_b
    iget-object v0, p0, LM/c;->l:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v0, LQ/b;

    .line 288
    .line 289
    iget-object v1, p0, LM/c;->m:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast v1, LI/e;

    .line 292
    .line 293
    invoke-virtual {v0}, LQ/b;->d()LH/d;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    invoke-interface {v0, v1}, LH/d;->b(Ljava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    return-void

    .line 301
    :pswitch_c
    iget-object v0, p0, LM/c;->l:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v0, LO/d;

    .line 304
    .line 305
    iget-object v1, p0, LM/c;->m:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v1, La2/o;

    .line 308
    .line 309
    invoke-virtual {v0}, LO/d;->c()LH/d;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    iget-object v1, v1, La2/o;->k:Ljava/lang/Object;

    .line 314
    .line 315
    invoke-interface {v0, v1}, LH/d;->b(Ljava/lang/Object;)V

    .line 316
    .line 317
    .line 318
    return-void

    .line 319
    :pswitch_d
    iget-object v0, p0, LM/c;->l:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast v0, LO/d;

    .line 322
    .line 323
    iget-object v1, p0, LM/c;->m:Ljava/lang/Object;

    .line 324
    .line 325
    check-cast v1, LH/l;

    .line 326
    .line 327
    invoke-virtual {v0}, LO/d;->c()LH/d;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    invoke-interface {v0, v1}, LH/d;->onResult(Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    return-void

    .line 335
    :pswitch_e
    iget-object v0, p0, LM/c;->l:Ljava/lang/Object;

    .line 336
    .line 337
    check-cast v0, LO/d;

    .line 338
    .line 339
    iget-object v1, p0, LM/c;->m:Ljava/lang/Object;

    .line 340
    .line 341
    check-cast v1, LI/e;

    .line 342
    .line 343
    invoke-virtual {v0}, LO/d;->c()LH/d;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    invoke-interface {v0, v1}, LH/d;->b(Ljava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    return-void

    .line 351
    :pswitch_f
    iget-object v0, p0, LM/c;->l:Ljava/lang/Object;

    .line 352
    .line 353
    check-cast v0, LH/d;

    .line 354
    .line 355
    iget-object v1, p0, LM/c;->m:Ljava/lang/Object;

    .line 356
    .line 357
    check-cast v1, LH/l;

    .line 358
    .line 359
    invoke-interface {v0, v1}, LH/d;->onResult(Ljava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    return-void

    .line 363
    :pswitch_10
    iget-object v0, p0, LM/c;->l:Ljava/lang/Object;

    .line 364
    .line 365
    check-cast v0, LH/d;

    .line 366
    .line 367
    iget-object v1, p0, LM/c;->m:Ljava/lang/Object;

    .line 368
    .line 369
    invoke-interface {v0, v1}, LH/d;->b(Ljava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    return-void

    .line 373
    :pswitch_11
    iget-object v0, p0, LM/c;->l:Ljava/lang/Object;

    .line 374
    .line 375
    check-cast v0, LM1/x;

    .line 376
    .line 377
    iget-object v1, p0, LM/c;->m:Ljava/lang/Object;

    .line 378
    .line 379
    check-cast v1, Ljava/lang/String;

    .line 380
    .line 381
    iget-object v2, v0, LM1/x;->b:LM1/s;

    .line 382
    .line 383
    new-instance v3, LM1/q;

    .line 384
    .line 385
    const/4 v4, 0x0

    .line 386
    invoke-direct {v3, v4}, LM1/q;-><init>(I)V

    .line 387
    .line 388
    .line 389
    const-string v4, "messageArg"

    .line 390
    .line 391
    invoke-static {v1, v4}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 392
    .line 393
    .line 394
    iget-object v2, v2, LM1/s;->a:LM1/O;

    .line 395
    .line 396
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 397
    .line 398
    .line 399
    iget-object v4, v2, LM1/O;->c:Ljava/lang/Object;

    .line 400
    .line 401
    check-cast v4, LM1/d;

    .line 402
    .line 403
    invoke-virtual {v4, v0}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    move-result v4

    .line 407
    if-nez v4, :cond_5

    .line 408
    .line 409
    const-string v0, "missing-instance-error"

    .line 410
    .line 411
    const-string v1, "Callback to `JavaScriptChannel.postMessage` failed because native instance was not in the instance manager."

    .line 412
    .line 413
    const-string v2, ""

    .line 414
    .line 415
    invoke-static {v0, v1, v2}, LB1/e;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    goto :goto_4

    .line 419
    :cond_5
    iget-object v4, v2, LM1/O;->b:Ljava/lang/Object;

    .line 420
    .line 421
    check-cast v4, LC1/f;

    .line 422
    .line 423
    invoke-virtual {v2}, LM1/O;->a()LC1/l;

    .line 424
    .line 425
    .line 426
    move-result-object v2

    .line 427
    const-string v5, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.postMessage"

    .line 428
    .line 429
    new-instance v6, LB1/s;

    .line 430
    .line 431
    const/4 v7, 0x0

    .line 432
    invoke-direct {v6, v4, v5, v2, v7}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 433
    .line 434
    .line 435
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    invoke-static {v0}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    new-instance v1, LD/c;

    .line 444
    .line 445
    const/16 v2, 0xa

    .line 446
    .line 447
    invoke-direct {v1, v3, v2}, LD/c;-><init>(Ljava/lang/Object;I)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v6, v0, v1}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 451
    .line 452
    .line 453
    :goto_4
    return-void

    .line 454
    :pswitch_12
    iget-object v0, p0, LM/c;->l:Ljava/lang/Object;

    .line 455
    .line 456
    check-cast v0, LH/d;

    .line 457
    .line 458
    iget-object v1, p0, LM/c;->m:Ljava/lang/Object;

    .line 459
    .line 460
    check-cast v1, La2/o;

    .line 461
    .line 462
    invoke-static {v0, v1}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->$r8$lambda$EfEsA0oxTYc7AqOZZSNy2cLCz-o(LH/d;La2/o;)V

    .line 463
    .line 464
    .line 465
    return-void

    .line 466
    :pswitch_13
    iget-object v0, p0, LM/c;->l:Ljava/lang/Object;

    .line 467
    .line 468
    check-cast v0, LH/d;

    .line 469
    .line 470
    iget-object v1, p0, LM/c;->m:Ljava/lang/Object;

    .line 471
    .line 472
    check-cast v1, Ljava/lang/Exception;

    .line 473
    .line 474
    invoke-static {v0, v1}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->$r8$lambda$AS0yfz0pVQO1Ewzm5zGeHqWtm6I(LH/d;Ljava/lang/Exception;)V

    .line 475
    .line 476
    .line 477
    return-void

    .line 478
    nop

    .line 479
    :pswitch_data_0
    .packed-switch 0x0
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

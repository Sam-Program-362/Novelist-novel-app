.class public final LO/c;
.super Landroid/os/ResultReceiver;
.source "SourceFile"


# instance fields
.field public final synthetic k:I

.field public final synthetic l:LN/c;


# direct methods
.method public synthetic constructor <init>(LN/c;Landroid/os/Handler;I)V
    .locals 0

    .line 1
    iput p3, p0, LO/c;->k:I

    iput-object p1, p0, LO/c;->l:LN/c;

    invoke-direct {p0, p2}, Landroid/os/ResultReceiver;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public final onReceiveResult(ILandroid/os/Bundle;)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget v3, v1, LO/c;->k:I

    .line 8
    .line 9
    const-string v5, " which  does not match what was given "

    .line 10
    .line 11
    const-string v6, "Returned request code "

    .line 12
    .line 13
    const-string v7, "RESULT_DATA"

    .line 14
    .line 15
    const-string v8, "ACTIVITY_REQUEST_CODE"

    .line 16
    .line 17
    const-string v9, "EXCEPTION_MESSAGE"

    .line 18
    .line 19
    const-string v10, "EXCEPTION_TYPE"

    .line 20
    .line 21
    const-string v11, "FAILURE_RESPONSE"

    .line 22
    .line 23
    iget-object v12, v1, LO/c;->l:LN/c;

    .line 24
    .line 25
    const-string v13, "resultData"

    .line 26
    .line 27
    const/4 v15, 0x0

    .line 28
    invoke-static {v2, v13}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    packed-switch v3, :pswitch_data_0

    .line 32
    .line 33
    .line 34
    check-cast v12, LR/b;

    .line 35
    .line 36
    sget v3, LN/c;->c:I

    .line 37
    .line 38
    iget-object v3, v12, LR/b;->f:Ljava/util/concurrent/Executor;

    .line 39
    .line 40
    const-string v13, "executor"

    .line 41
    .line 42
    const/16 v16, 0x0

    .line 43
    .line 44
    if-eqz v3, :cond_10

    .line 45
    .line 46
    iget-object v14, v12, LR/b;->e:LH/d;

    .line 47
    .line 48
    const-string v17, "callback"

    .line 49
    .line 50
    if-eqz v14, :cond_f

    .line 51
    .line 52
    iget-object v4, v12, LR/b;->g:Landroid/os/CancellationSignal;

    .line 53
    .line 54
    invoke-virtual {v2, v11}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    move-result v11

    .line 58
    if-nez v11, :cond_0

    .line 59
    .line 60
    move v3, v15

    .line 61
    goto :goto_0

    .line 62
    :cond_0
    invoke-virtual {v2, v10}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v10

    .line 66
    invoke-virtual {v2, v9}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v9

    .line 70
    invoke-static {v10, v9}, LM1/A;->a(Ljava/lang/String;Ljava/lang/String;)LI/f;

    .line 71
    .line 72
    .line 73
    move-result-object v9

    .line 74
    new-instance v10, LN/a;

    .line 75
    .line 76
    invoke-direct {v10, v3, v14, v9, v15}, LN/a;-><init>(Ljava/util/concurrent/Executor;LH/d;Ljava/lang/Object;I)V

    .line 77
    .line 78
    .line 79
    invoke-static {v4, v10}, La/a;->l(Landroid/os/CancellationSignal;LZ1/a;)V

    .line 80
    .line 81
    .line 82
    const/4 v3, 0x1

    .line 83
    :goto_0
    if-eqz v3, :cond_1

    .line 84
    .line 85
    goto/16 :goto_5

    .line 86
    .line 87
    :cond_1
    invoke-virtual {v2, v8}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    const-class v4, Landroid/content/Intent;

    .line 92
    .line 93
    invoke-static {v2, v7, v4}, LH2/h;->p(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    check-cast v2, Landroid/content/Intent;

    .line 98
    .line 99
    iget-object v4, v12, LR/b;->f:Ljava/util/concurrent/Executor;

    .line 100
    .line 101
    if-eqz v4, :cond_e

    .line 102
    .line 103
    iget-object v7, v12, LR/b;->e:LH/d;

    .line 104
    .line 105
    if-eqz v7, :cond_d

    .line 106
    .line 107
    iget-object v8, v12, LR/b;->g:Landroid/os/CancellationSignal;

    .line 108
    .line 109
    sget v9, LN/c;->b:I

    .line 110
    .line 111
    if-eq v3, v9, :cond_2

    .line 112
    .line 113
    new-instance v0, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    const-string v2, "GetCredentialController"

    .line 132
    .line 133
    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 134
    .line 135
    .line 136
    goto/16 :goto_5

    .line 137
    .line 138
    :cond_2
    new-instance v3, LN/d;

    .line 139
    .line 140
    invoke-direct {v3, v15}, LN/d;-><init>(I)V

    .line 141
    .line 142
    .line 143
    new-instance v5, LM1/X;

    .line 144
    .line 145
    const/4 v6, 0x1

    .line 146
    invoke-direct {v5, v4, v7, v6}, LM1/X;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 147
    .line 148
    .line 149
    invoke-static {v0, v3, v5, v8}, La/a;->J(ILZ1/p;LZ1/l;Landroid/os/CancellationSignal;)Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-eqz v0, :cond_3

    .line 154
    .line 155
    goto/16 :goto_5

    .line 156
    .line 157
    :cond_3
    if-nez v2, :cond_4

    .line 158
    .line 159
    new-instance v0, LN/b;

    .line 160
    .line 161
    invoke-direct {v0, v4, v7, v6}, LN/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 162
    .line 163
    .line 164
    invoke-static {v8, v0}, La/a;->l(Landroid/os/CancellationSignal;LZ1/a;)V

    .line 165
    .line 166
    .line 167
    goto/16 :goto_5

    .line 168
    .line 169
    :cond_4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 170
    .line 171
    const/16 v3, 0x22

    .line 172
    .line 173
    if-lt v0, v3, :cond_5

    .line 174
    .line 175
    invoke-static {v2}, LD/u;->b(Landroid/content/Intent;)LH/l;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    goto :goto_2

    .line 180
    :cond_5
    const-string v5, "android.service.credentials.extra.GET_CREDENTIAL_RESPONSE"

    .line 181
    .line 182
    invoke-virtual {v2, v5}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    if-nez v5, :cond_6

    .line 187
    .line 188
    goto :goto_1

    .line 189
    :cond_6
    const-string v6, "androidx.credentials.provider.extra.EXTRA_CREDENTIAL_TYPE"

    .line 190
    .line 191
    invoke-virtual {v5, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    if-nez v6, :cond_7

    .line 196
    .line 197
    goto :goto_1

    .line 198
    :cond_7
    const-string v9, "androidx.credentials.provider.extra.EXTRA_CREDENTIAL_DATA"

    .line 199
    .line 200
    invoke-virtual {v5, v9}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 201
    .line 202
    .line 203
    move-result-object v5

    .line 204
    if-nez v5, :cond_8

    .line 205
    .line 206
    :goto_1
    move-object/from16 v5, v16

    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_8
    new-instance v9, LH/l;

    .line 210
    .line 211
    invoke-static {v6, v5}, LH2/h;->j(Ljava/lang/String;Landroid/os/Bundle;)LH/c;

    .line 212
    .line 213
    .line 214
    move-result-object v5

    .line 215
    invoke-direct {v9, v5}, LH/l;-><init>(LH/c;)V

    .line 216
    .line 217
    .line 218
    move-object v5, v9

    .line 219
    :goto_2
    if-eqz v5, :cond_9

    .line 220
    .line 221
    new-instance v0, LN/a;

    .line 222
    .line 223
    const/4 v6, 0x1

    .line 224
    invoke-direct {v0, v4, v7, v5, v6}, LN/a;-><init>(Ljava/util/concurrent/Executor;LH/d;Ljava/lang/Object;I)V

    .line 225
    .line 226
    .line 227
    invoke-static {v8, v0}, La/a;->l(Landroid/os/CancellationSignal;LZ1/a;)V

    .line 228
    .line 229
    .line 230
    goto :goto_5

    .line 231
    :cond_9
    if-lt v0, v3, :cond_a

    .line 232
    .line 233
    invoke-static {v2}, LD/u;->a(Landroid/content/Intent;)LI/f;

    .line 234
    .line 235
    .line 236
    move-result-object v16

    .line 237
    :goto_3
    move-object/from16 v0, v16

    .line 238
    .line 239
    goto :goto_4

    .line 240
    :cond_a
    sget v0, LI/f;->k:I

    .line 241
    .line 242
    const-string v0, "android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION"

    .line 243
    .line 244
    invoke-virtual {v2, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    if-nez v0, :cond_b

    .line 249
    .line 250
    goto :goto_3

    .line 251
    :cond_b
    const-string v2, "androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE"

    .line 252
    .line 253
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    if-eqz v2, :cond_c

    .line 258
    .line 259
    const-string v3, "androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"

    .line 260
    .line 261
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    invoke-static {v0, v2}, LE2/a;->U(Ljava/lang/CharSequence;Ljava/lang/String;)LI/f;

    .line 266
    .line 267
    .line 268
    move-result-object v16

    .line 269
    goto :goto_3

    .line 270
    :goto_4
    new-instance v2, LN/a;

    .line 271
    .line 272
    const/4 v3, 0x2

    .line 273
    invoke-direct {v2, v4, v7, v0, v3}, LN/a;-><init>(Ljava/util/concurrent/Executor;LH/d;Ljava/lang/Object;I)V

    .line 274
    .line 275
    .line 276
    invoke-static {v8, v2}, La/a;->l(Landroid/os/CancellationSignal;LZ1/a;)V

    .line 277
    .line 278
    .line 279
    :goto_5
    return-void

    .line 280
    :cond_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 281
    .line 282
    const-string v2, "Bundle was missing exception type."

    .line 283
    .line 284
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    throw v0

    .line 288
    :cond_d
    invoke-static/range {v17 .. v17}, La2/h;->g(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    throw v16

    .line 292
    :cond_e
    invoke-static {v13}, La2/h;->g(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    throw v16

    .line 296
    :cond_f
    invoke-static/range {v17 .. v17}, La2/h;->g(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    throw v16

    .line 300
    :cond_10
    invoke-static {v13}, La2/h;->g(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    throw v16

    .line 304
    :pswitch_0
    check-cast v12, LQ/b;

    .line 305
    .line 306
    sget v3, LN/c;->c:I

    .line 307
    .line 308
    invoke-virtual {v12}, LQ/b;->e()Ljava/util/concurrent/Executor;

    .line 309
    .line 310
    .line 311
    move-result-object v3

    .line 312
    invoke-virtual {v12}, LQ/b;->d()LH/d;

    .line 313
    .line 314
    .line 315
    move-result-object v4

    .line 316
    iget-object v13, v12, LQ/b;->g:Landroid/os/CancellationSignal;

    .line 317
    .line 318
    invoke-virtual {v2, v11}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 319
    .line 320
    .line 321
    move-result v11

    .line 322
    if-nez v11, :cond_11

    .line 323
    .line 324
    goto :goto_6

    .line 325
    :cond_11
    invoke-virtual {v2, v10}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v10

    .line 329
    invoke-virtual {v2, v9}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v9

    .line 333
    invoke-static {v10, v9}, LM1/A;->a(Ljava/lang/String;Ljava/lang/String;)LI/f;

    .line 334
    .line 335
    .line 336
    move-result-object v9

    .line 337
    new-instance v10, LN/a;

    .line 338
    .line 339
    invoke-direct {v10, v3, v4, v9, v15}, LN/a;-><init>(Ljava/util/concurrent/Executor;LH/d;Ljava/lang/Object;I)V

    .line 340
    .line 341
    .line 342
    invoke-static {v13, v10}, La/a;->l(Landroid/os/CancellationSignal;LZ1/a;)V

    .line 343
    .line 344
    .line 345
    const/4 v15, 0x1

    .line 346
    :goto_6
    if-eqz v15, :cond_12

    .line 347
    .line 348
    goto/16 :goto_b

    .line 349
    .line 350
    :cond_12
    invoke-virtual {v2, v8}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 351
    .line 352
    .line 353
    move-result v3

    .line 354
    invoke-virtual {v2, v7}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 355
    .line 356
    .line 357
    move-result-object v2

    .line 358
    check-cast v2, Landroid/content/Intent;

    .line 359
    .line 360
    sget v4, LN/c;->b:I

    .line 361
    .line 362
    if-eq v3, v4, :cond_13

    .line 363
    .line 364
    new-instance v0, Ljava/lang/StringBuilder;

    .line 365
    .line 366
    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    const-string v2, "GetSignInIntent"

    .line 383
    .line 384
    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 385
    .line 386
    .line 387
    goto/16 :goto_b

    .line 388
    .line 389
    :cond_13
    new-instance v3, LN/d;

    .line 390
    .line 391
    const/4 v4, 0x2

    .line 392
    invoke-direct {v3, v4}, LN/d;-><init>(I)V

    .line 393
    .line 394
    .line 395
    new-instance v5, LM1/P;

    .line 396
    .line 397
    invoke-direct {v5, v12, v4}, LM1/P;-><init>(Ljava/lang/Object;I)V

    .line 398
    .line 399
    .line 400
    iget-object v4, v12, LQ/b;->g:Landroid/os/CancellationSignal;

    .line 401
    .line 402
    invoke-static {v0, v3, v5, v4}, La/a;->J(ILZ1/p;LZ1/l;Landroid/os/CancellationSignal;)Z

    .line 403
    .line 404
    .line 405
    move-result v0

    .line 406
    if-eqz v0, :cond_14

    .line 407
    .line 408
    goto/16 :goto_b

    .line 409
    .line 410
    :cond_14
    :try_start_0
    iget-object v0, v12, LQ/b;->d:Landroid/content/Context;

    .line 411
    .line 412
    invoke-static {v0}, LS0/a;->v(Landroid/content/Context;)LY0/b;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    invoke-virtual {v0, v2}, LY0/b;->e(Landroid/content/Intent;)LF0/j;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    invoke-virtual {v12, v0}, LQ/b;->c(LF0/j;)LH/l;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    iget-object v2, v12, LQ/b;->g:Landroid/os/CancellationSignal;

    .line 425
    .line 426
    new-instance v3, LN/b;

    .line 427
    .line 428
    const/4 v4, 0x3

    .line 429
    invoke-direct {v3, v12, v0, v4}, LN/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 430
    .line 431
    .line 432
    invoke-static {v2, v3}, La/a;->l(Landroid/os/CancellationSignal;LZ1/a;)V
    :try_end_0
    .catch LK0/e; {:try_start_0 .. :try_end_0} :catch_1
    .catch LI/f; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 433
    .line 434
    .line 435
    goto/16 :goto_b

    .line 436
    .line 437
    :catchall_0
    move-exception v0

    .line 438
    goto :goto_7

    .line 439
    :catch_0
    move-exception v0

    .line 440
    goto :goto_8

    .line 441
    :catch_1
    move-exception v0

    .line 442
    goto :goto_9

    .line 443
    :goto_7
    new-instance v2, LI/e;

    .line 444
    .line 445
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    invoke-direct {v2, v0}, LI/e;-><init>(Ljava/lang/CharSequence;)V

    .line 450
    .line 451
    .line 452
    iget-object v0, v12, LQ/b;->g:Landroid/os/CancellationSignal;

    .line 453
    .line 454
    sget-object v3, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:LM/h;

    .line 455
    .line 456
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 457
    .line 458
    .line 459
    invoke-static {v0}, LM/h;->a(Landroid/os/CancellationSignal;)Z

    .line 460
    .line 461
    .line 462
    move-result v0

    .line 463
    if-eqz v0, :cond_15

    .line 464
    .line 465
    goto/16 :goto_b

    .line 466
    .line 467
    :cond_15
    invoke-virtual {v12}, LQ/b;->e()Ljava/util/concurrent/Executor;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    new-instance v3, LM/c;

    .line 472
    .line 473
    const/16 v4, 0x8

    .line 474
    .line 475
    invoke-direct {v3, v12, v2, v4}, LM/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 476
    .line 477
    .line 478
    invoke-interface {v0, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 479
    .line 480
    .line 481
    goto/16 :goto_b

    .line 482
    .line 483
    :goto_8
    iget-object v2, v12, LQ/b;->g:Landroid/os/CancellationSignal;

    .line 484
    .line 485
    sget-object v3, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:LM/h;

    .line 486
    .line 487
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 488
    .line 489
    .line 490
    invoke-static {v2}, LM/h;->a(Landroid/os/CancellationSignal;)Z

    .line 491
    .line 492
    .line 493
    move-result v2

    .line 494
    if-eqz v2, :cond_16

    .line 495
    .line 496
    goto :goto_b

    .line 497
    :cond_16
    invoke-virtual {v12}, LQ/b;->e()Ljava/util/concurrent/Executor;

    .line 498
    .line 499
    .line 500
    move-result-object v2

    .line 501
    new-instance v3, LQ/a;

    .line 502
    .line 503
    const/4 v4, 0x2

    .line 504
    invoke-direct {v3, v12, v0, v4}, LQ/a;-><init>(LQ/b;LI/f;I)V

    .line 505
    .line 506
    .line 507
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 508
    .line 509
    .line 510
    goto :goto_b

    .line 511
    :goto_9
    new-instance v2, La2/o;

    .line 512
    .line 513
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 514
    .line 515
    .line 516
    new-instance v3, LI/e;

    .line 517
    .line 518
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 519
    .line 520
    .line 521
    move-result-object v4

    .line 522
    invoke-direct {v3, v4}, LI/e;-><init>(Ljava/lang/CharSequence;)V

    .line 523
    .line 524
    .line 525
    iput-object v3, v2, La2/o;->k:Ljava/lang/Object;

    .line 526
    .line 527
    iget-object v3, v0, LK0/e;->k:Lcom/google/android/gms/common/api/Status;

    .line 528
    .line 529
    iget v3, v3, Lcom/google/android/gms/common/api/Status;->k:I

    .line 530
    .line 531
    const/16 v4, 0x10

    .line 532
    .line 533
    if-ne v3, v4, :cond_17

    .line 534
    .line 535
    new-instance v3, LI/d;

    .line 536
    .line 537
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    invoke-direct {v3, v0}, LI/d;-><init>(Ljava/lang/CharSequence;)V

    .line 542
    .line 543
    .line 544
    iput-object v3, v2, La2/o;->k:Ljava/lang/Object;

    .line 545
    .line 546
    goto :goto_a

    .line 547
    :cond_17
    sget-object v4, LN/c;->a:Ljava/util/Set;

    .line 548
    .line 549
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 550
    .line 551
    .line 552
    move-result-object v3

    .line 553
    invoke-interface {v4, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    move-result v3

    .line 557
    if-eqz v3, :cond_18

    .line 558
    .line 559
    new-instance v3, LI/g;

    .line 560
    .line 561
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v0

    .line 565
    invoke-direct {v3, v0}, LI/g;-><init>(Ljava/lang/CharSequence;)V

    .line 566
    .line 567
    .line 568
    iput-object v3, v2, La2/o;->k:Ljava/lang/Object;

    .line 569
    .line 570
    :cond_18
    :goto_a
    iget-object v0, v12, LQ/b;->g:Landroid/os/CancellationSignal;

    .line 571
    .line 572
    sget-object v3, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:LM/h;

    .line 573
    .line 574
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 575
    .line 576
    .line 577
    invoke-static {v0}, LM/h;->a(Landroid/os/CancellationSignal;)Z

    .line 578
    .line 579
    .line 580
    move-result v0

    .line 581
    if-eqz v0, :cond_19

    .line 582
    .line 583
    goto :goto_b

    .line 584
    :cond_19
    invoke-virtual {v12}, LQ/b;->e()Ljava/util/concurrent/Executor;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    new-instance v3, LM/c;

    .line 589
    .line 590
    const/16 v4, 0x9

    .line 591
    .line 592
    invoke-direct {v3, v12, v2, v4}, LM/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 593
    .line 594
    .line 595
    invoke-interface {v0, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 596
    .line 597
    .line 598
    :goto_b
    return-void

    .line 599
    :pswitch_1
    check-cast v12, LO/d;

    .line 600
    .line 601
    sget v3, LN/c;->c:I

    .line 602
    .line 603
    invoke-virtual {v12}, LO/d;->d()Ljava/util/concurrent/Executor;

    .line 604
    .line 605
    .line 606
    move-result-object v3

    .line 607
    invoke-virtual {v12}, LO/d;->c()LH/d;

    .line 608
    .line 609
    .line 610
    move-result-object v4

    .line 611
    iget-object v13, v12, LO/d;->g:Landroid/os/CancellationSignal;

    .line 612
    .line 613
    invoke-virtual {v2, v11}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 614
    .line 615
    .line 616
    move-result v11

    .line 617
    if-nez v11, :cond_1a

    .line 618
    .line 619
    goto :goto_c

    .line 620
    :cond_1a
    invoke-virtual {v2, v10}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 621
    .line 622
    .line 623
    move-result-object v10

    .line 624
    invoke-virtual {v2, v9}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object v9

    .line 628
    invoke-static {v10, v9}, LM1/A;->a(Ljava/lang/String;Ljava/lang/String;)LI/f;

    .line 629
    .line 630
    .line 631
    move-result-object v9

    .line 632
    new-instance v10, LN/a;

    .line 633
    .line 634
    invoke-direct {v10, v3, v4, v9, v15}, LN/a;-><init>(Ljava/util/concurrent/Executor;LH/d;Ljava/lang/Object;I)V

    .line 635
    .line 636
    .line 637
    invoke-static {v13, v10}, La/a;->l(Landroid/os/CancellationSignal;LZ1/a;)V

    .line 638
    .line 639
    .line 640
    const/4 v15, 0x1

    .line 641
    :goto_c
    if-eqz v15, :cond_1b

    .line 642
    .line 643
    goto/16 :goto_11

    .line 644
    .line 645
    :cond_1b
    invoke-virtual {v2, v8}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 646
    .line 647
    .line 648
    move-result v3

    .line 649
    invoke-virtual {v2, v7}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 650
    .line 651
    .line 652
    move-result-object v2

    .line 653
    check-cast v2, Landroid/content/Intent;

    .line 654
    .line 655
    sget v4, LN/c;->b:I

    .line 656
    .line 657
    if-eq v3, v4, :cond_1c

    .line 658
    .line 659
    new-instance v0, Ljava/lang/StringBuilder;

    .line 660
    .line 661
    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 662
    .line 663
    .line 664
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 665
    .line 666
    .line 667
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 668
    .line 669
    .line 670
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 671
    .line 672
    .line 673
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 674
    .line 675
    .line 676
    move-result-object v0

    .line 677
    const-string v2, "BeginSignIn"

    .line 678
    .line 679
    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 680
    .line 681
    .line 682
    goto/16 :goto_11

    .line 683
    .line 684
    :cond_1c
    new-instance v3, LN/d;

    .line 685
    .line 686
    const/4 v6, 0x1

    .line 687
    invoke-direct {v3, v6}, LN/d;-><init>(I)V

    .line 688
    .line 689
    .line 690
    new-instance v4, LM1/P;

    .line 691
    .line 692
    invoke-direct {v4, v12, v6}, LM1/P;-><init>(Ljava/lang/Object;I)V

    .line 693
    .line 694
    .line 695
    iget-object v5, v12, LO/d;->g:Landroid/os/CancellationSignal;

    .line 696
    .line 697
    invoke-static {v0, v3, v4, v5}, La/a;->J(ILZ1/p;LZ1/l;Landroid/os/CancellationSignal;)Z

    .line 698
    .line 699
    .line 700
    move-result v0

    .line 701
    if-eqz v0, :cond_1d

    .line 702
    .line 703
    goto/16 :goto_11

    .line 704
    .line 705
    :cond_1d
    :try_start_1
    iget-object v0, v12, LO/d;->d:Landroid/content/Context;

    .line 706
    .line 707
    invoke-static {v0}, LS0/a;->v(Landroid/content/Context;)LY0/b;

    .line 708
    .line 709
    .line 710
    move-result-object v0

    .line 711
    invoke-virtual {v0, v2}, LY0/b;->e(Landroid/content/Intent;)LF0/j;

    .line 712
    .line 713
    .line 714
    move-result-object v0

    .line 715
    invoke-virtual {v12, v0}, LO/d;->b(LF0/j;)LH/l;

    .line 716
    .line 717
    .line 718
    move-result-object v0

    .line 719
    iget-object v2, v12, LO/d;->g:Landroid/os/CancellationSignal;

    .line 720
    .line 721
    new-instance v3, LN/b;

    .line 722
    .line 723
    const/4 v4, 0x2

    .line 724
    invoke-direct {v3, v12, v0, v4}, LN/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 725
    .line 726
    .line 727
    invoke-static {v2, v3}, La/a;->l(Landroid/os/CancellationSignal;LZ1/a;)V
    :try_end_1
    .catch LK0/e; {:try_start_1 .. :try_end_1} :catch_3
    .catch LI/f; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 728
    .line 729
    .line 730
    goto/16 :goto_11

    .line 731
    .line 732
    :catchall_1
    move-exception v0

    .line 733
    goto :goto_d

    .line 734
    :catch_2
    move-exception v0

    .line 735
    goto :goto_e

    .line 736
    :catch_3
    move-exception v0

    .line 737
    goto :goto_f

    .line 738
    :goto_d
    new-instance v2, LI/e;

    .line 739
    .line 740
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 741
    .line 742
    .line 743
    move-result-object v0

    .line 744
    invoke-direct {v2, v0}, LI/e;-><init>(Ljava/lang/CharSequence;)V

    .line 745
    .line 746
    .line 747
    iget-object v0, v12, LO/d;->g:Landroid/os/CancellationSignal;

    .line 748
    .line 749
    sget-object v3, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:LM/h;

    .line 750
    .line 751
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 752
    .line 753
    .line 754
    invoke-static {v0}, LM/h;->a(Landroid/os/CancellationSignal;)Z

    .line 755
    .line 756
    .line 757
    move-result v0

    .line 758
    if-eqz v0, :cond_1e

    .line 759
    .line 760
    goto/16 :goto_11

    .line 761
    .line 762
    :cond_1e
    invoke-virtual {v12}, LO/d;->d()Ljava/util/concurrent/Executor;

    .line 763
    .line 764
    .line 765
    move-result-object v0

    .line 766
    new-instance v3, LM/c;

    .line 767
    .line 768
    const/4 v4, 0x5

    .line 769
    invoke-direct {v3, v12, v2, v4}, LM/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 770
    .line 771
    .line 772
    invoke-interface {v0, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 773
    .line 774
    .line 775
    goto/16 :goto_11

    .line 776
    .line 777
    :goto_e
    iget-object v2, v12, LO/d;->g:Landroid/os/CancellationSignal;

    .line 778
    .line 779
    sget-object v3, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:LM/h;

    .line 780
    .line 781
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 782
    .line 783
    .line 784
    invoke-static {v2}, LM/h;->a(Landroid/os/CancellationSignal;)Z

    .line 785
    .line 786
    .line 787
    move-result v2

    .line 788
    if-eqz v2, :cond_1f

    .line 789
    .line 790
    goto :goto_11

    .line 791
    :cond_1f
    invoke-virtual {v12}, LO/d;->d()Ljava/util/concurrent/Executor;

    .line 792
    .line 793
    .line 794
    move-result-object v2

    .line 795
    new-instance v3, LO/a;

    .line 796
    .line 797
    const/4 v4, 0x2

    .line 798
    invoke-direct {v3, v12, v0, v4}, LO/a;-><init>(LO/d;LI/f;I)V

    .line 799
    .line 800
    .line 801
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 802
    .line 803
    .line 804
    goto :goto_11

    .line 805
    :goto_f
    new-instance v2, La2/o;

    .line 806
    .line 807
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 808
    .line 809
    .line 810
    new-instance v3, LI/e;

    .line 811
    .line 812
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 813
    .line 814
    .line 815
    move-result-object v4

    .line 816
    invoke-direct {v3, v4}, LI/e;-><init>(Ljava/lang/CharSequence;)V

    .line 817
    .line 818
    .line 819
    iput-object v3, v2, La2/o;->k:Ljava/lang/Object;

    .line 820
    .line 821
    iget-object v3, v0, LK0/e;->k:Lcom/google/android/gms/common/api/Status;

    .line 822
    .line 823
    iget v3, v3, Lcom/google/android/gms/common/api/Status;->k:I

    .line 824
    .line 825
    const/16 v4, 0x10

    .line 826
    .line 827
    if-ne v3, v4, :cond_20

    .line 828
    .line 829
    new-instance v3, LI/d;

    .line 830
    .line 831
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 832
    .line 833
    .line 834
    move-result-object v0

    .line 835
    invoke-direct {v3, v0}, LI/d;-><init>(Ljava/lang/CharSequence;)V

    .line 836
    .line 837
    .line 838
    iput-object v3, v2, La2/o;->k:Ljava/lang/Object;

    .line 839
    .line 840
    goto :goto_10

    .line 841
    :cond_20
    sget-object v4, LN/c;->a:Ljava/util/Set;

    .line 842
    .line 843
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 844
    .line 845
    .line 846
    move-result-object v3

    .line 847
    invoke-interface {v4, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 848
    .line 849
    .line 850
    move-result v3

    .line 851
    if-eqz v3, :cond_21

    .line 852
    .line 853
    new-instance v3, LI/g;

    .line 854
    .line 855
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 856
    .line 857
    .line 858
    move-result-object v0

    .line 859
    invoke-direct {v3, v0}, LI/g;-><init>(Ljava/lang/CharSequence;)V

    .line 860
    .line 861
    .line 862
    iput-object v3, v2, La2/o;->k:Ljava/lang/Object;

    .line 863
    .line 864
    :cond_21
    :goto_10
    iget-object v0, v12, LO/d;->g:Landroid/os/CancellationSignal;

    .line 865
    .line 866
    sget-object v3, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:LM/h;

    .line 867
    .line 868
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 869
    .line 870
    .line 871
    invoke-static {v0}, LM/h;->a(Landroid/os/CancellationSignal;)Z

    .line 872
    .line 873
    .line 874
    move-result v0

    .line 875
    if-eqz v0, :cond_22

    .line 876
    .line 877
    goto :goto_11

    .line 878
    :cond_22
    invoke-virtual {v12}, LO/d;->d()Ljava/util/concurrent/Executor;

    .line 879
    .line 880
    .line 881
    move-result-object v0

    .line 882
    new-instance v3, LM/c;

    .line 883
    .line 884
    const/4 v4, 0x7

    .line 885
    invoke-direct {v3, v12, v2, v4}, LM/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 886
    .line 887
    .line 888
    invoke-interface {v0, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 889
    .line 890
    .line 891
    :goto_11
    return-void

    .line 892
    nop

    .line 893
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

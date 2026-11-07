.class public final synthetic LI1/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC1/b;


# instance fields
.field public final synthetic k:I

.field public final synthetic l:LI1/o;


# direct methods
.method public synthetic constructor <init>(LI1/o;I)V
    .locals 0

    .line 1
    iput p2, p0, LI1/m;->k:I

    iput-object p1, p0, LI1/m;->l:LI1/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;LA/c;)V
    .locals 13

    .line 1
    iget v0, p0, LI1/m;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
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
    const-string v0, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.PlatformRevokeAccessRequest"

    .line 19
    .line 20
    invoke-static {p1, v0}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    check-cast p1, LI1/y;

    .line 24
    .line 25
    new-instance v0, LI1/k;

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    invoke-direct {v0, p2, v1}, LI1/k;-><init>(LA/c;I)V

    .line 29
    .line 30
    .line 31
    iget-object p2, p0, LI1/m;->l:LI1/o;

    .line 32
    .line 33
    check-cast p2, LI1/s;

    .line 34
    .line 35
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    new-instance v1, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 41
    .line 42
    .line 43
    iget-object v2, p1, LI1/y;->b:Ljava/util/List;

    .line 44
    .line 45
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    const/4 v4, 0x1

    .line 54
    if-eqz v3, :cond_0

    .line 55
    .line 56
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    check-cast v3, Ljava/lang/String;

    .line 61
    .line 62
    new-instance v5, Lcom/google/android/gms/common/api/Scope;

    .line 63
    .line 64
    invoke-direct {v5, v3, v4}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    iget-object p2, p2, LI1/s;->k:Landroid/content/Context;

    .line 72
    .line 73
    invoke-static {p2}, LD/c;->b(Landroid/content/Context;)LY0/b;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    new-instance v2, Landroid/accounts/Account;

    .line 78
    .line 79
    iget-object p1, p1, LI1/y;->a:Ljava/lang/String;

    .line 80
    .line 81
    const-string v3, "com.google"

    .line 82
    .line 83
    invoke-direct {v2, p1, v3}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-static {v1}, LY0/l;->g(Ljava/util/AbstractCollection;)LY0/l;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    new-instance v1, Lcom/google/android/gms/auth/api/identity/RevokeAccessRequest;

    .line 91
    .line 92
    const/4 v3, 0x0

    .line 93
    invoke-direct {v1, p1, v2, v3}, Lcom/google/android/gms/auth/api/identity/RevokeAccessRequest;-><init>(Ljava/util/List;Landroid/accounts/Account;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    iget-object p1, p2, LY0/b;->k:Ljava/lang/String;

    .line 97
    .line 98
    new-instance v2, Lcom/google/android/gms/auth/api/identity/RevokeAccessRequest;

    .line 99
    .line 100
    iget-object v3, v1, Lcom/google/android/gms/auth/api/identity/RevokeAccessRequest;->k:LY0/l;

    .line 101
    .line 102
    iget-object v1, v1, Lcom/google/android/gms/auth/api/identity/RevokeAccessRequest;->l:Landroid/accounts/Account;

    .line 103
    .line 104
    invoke-direct {v2, v3, v1, p1}, Lcom/google/android/gms/auth/api/identity/RevokeAccessRequest;-><init>(Ljava/util/List;Landroid/accounts/Account;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-static {}, LL0/k;->b()LL0/k;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    sget-object v1, LY0/f;->c:LJ0/c;

    .line 112
    .line 113
    filled-new-array {v1}, [LJ0/c;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    iput-object v1, p1, LL0/k;->a:Ljava/lang/Object;

    .line 118
    .line 119
    new-instance v1, LA/c;

    .line 120
    .line 121
    const/16 v3, 0x17

    .line 122
    .line 123
    invoke-direct {v1, p2, v2, v3}, LA/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 124
    .line 125
    .line 126
    iput-object v1, p1, LL0/k;->d:Ljava/lang/Object;

    .line 127
    .line 128
    const/16 v1, 0x6b9

    .line 129
    .line 130
    iput v1, p1, LL0/k;->c:I

    .line 131
    .line 132
    invoke-virtual {p1}, LL0/k;->a()LL0/k;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-virtual {p2, v4, p1}, LK0/i;->b(ILL0/k;)Lg1/i;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    new-instance p2, LI1/q;

    .line 141
    .line 142
    invoke-direct {p2, v0}, LI1/q;-><init>(LI1/k;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1, p2}, Lg1/i;->b(Lg1/d;)V

    .line 146
    .line 147
    .line 148
    new-instance p2, LI1/q;

    .line 149
    .line 150
    invoke-direct {p2, v0}, LI1/q;-><init>(LI1/k;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1, p2}, Lg1/i;->a(Lg1/c;)V

    .line 154
    .line 155
    .line 156
    return-void

    .line 157
    :pswitch_0
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 158
    .line 159
    invoke-static {p1, v0}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    check-cast p1, Ljava/util/List;

    .line 163
    .line 164
    const/4 v8, 0x0

    .line 165
    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    const-string v1, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.PlatformAuthorizationRequest"

    .line 170
    .line 171
    invoke-static {v0, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    check-cast v0, LI1/v;

    .line 175
    .line 176
    const/4 v1, 0x1

    .line 177
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    const-string v2, "null cannot be cast to non-null type kotlin.Boolean"

    .line 182
    .line 183
    invoke-static {p1, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    check-cast p1, Ljava/lang/Boolean;

    .line 187
    .line 188
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 189
    .line 190
    .line 191
    move-result p1

    .line 192
    new-instance v12, LI1/k;

    .line 193
    .line 194
    const/4 v2, 0x0

    .line 195
    invoke-direct {v12, p2, v2}, LI1/k;-><init>(LA/c;I)V

    .line 196
    .line 197
    .line 198
    iget-object p2, p0, LI1/m;->l:LI1/o;

    .line 199
    .line 200
    check-cast p2, LI1/s;

    .line 201
    .line 202
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    move v2, v1

    .line 206
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    .line 207
    .line 208
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 209
    .line 210
    .line 211
    iget-object v3, v0, LI1/v;->a:Ljava/util/List;

    .line 212
    .line 213
    iget-object v4, v0, LI1/v;->c:Ljava/lang/String;

    .line 214
    .line 215
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 220
    .line 221
    .line 222
    move-result v5

    .line 223
    if-eqz v5, :cond_1

    .line 224
    .line 225
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v5

    .line 229
    check-cast v5, Ljava/lang/String;

    .line 230
    .line 231
    new-instance v6, Lcom/google/android/gms/common/api/Scope;

    .line 232
    .line 233
    invoke-direct {v6, v5, v2}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;I)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    goto :goto_1

    .line 240
    :catch_0
    move-exception v0

    .line 241
    move-object p1, v0

    .line 242
    goto :goto_5

    .line 243
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 244
    .line 245
    .line 246
    move-result v3

    .line 247
    xor-int/2addr v3, v2

    .line 248
    const-string v5, "requestedScopes cannot be null or empty"

    .line 249
    .line 250
    invoke-static {v5, v3}, LM0/r;->a(Ljava/lang/String;Z)V

    .line 251
    .line 252
    .line 253
    iget-object v3, v0, LI1/v;->b:Ljava/lang/String;

    .line 254
    .line 255
    const/4 v5, 0x0

    .line 256
    if-eqz v3, :cond_2

    .line 257
    .line 258
    invoke-static {v3}, LM0/r;->d(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    move-object v6, v3

    .line 262
    goto :goto_2

    .line 263
    :cond_2
    move-object v6, v5

    .line 264
    :goto_2
    iget-object v0, v0, LI1/v;->d:Ljava/lang/String;

    .line 265
    .line 266
    if-eqz v0, :cond_3

    .line 267
    .line 268
    move v3, v2

    .line 269
    move-object v2, v0

    .line 270
    :goto_3
    move v11, v3

    .line 271
    goto :goto_4

    .line 272
    :cond_3
    move-object v2, v5

    .line 273
    move v3, v8

    .line 274
    goto :goto_3

    .line 275
    :goto_4
    if-eqz v4, :cond_4

    .line 276
    .line 277
    new-instance v5, Landroid/accounts/Account;

    .line 278
    .line 279
    const-string v0, "com.google"

    .line 280
    .line 281
    invoke-direct {v5, v4, v0}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    :cond_4
    new-instance v0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;

    .line 285
    .line 286
    const/4 v10, 0x0

    .line 287
    const/4 v9, 0x0

    .line 288
    const/4 v7, 0x0

    .line 289
    const/4 v4, 0x0

    .line 290
    invoke-direct/range {v0 .. v11}, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;-><init>(Ljava/util/List;Ljava/lang/String;ZZLandroid/accounts/Account;Ljava/lang/String;Ljava/lang/String;ZLandroid/os/Bundle;ZI)V

    .line 291
    .line 292
    .line 293
    iget-object v1, p2, LI1/s;->k:Landroid/content/Context;

    .line 294
    .line 295
    invoke-static {v1}, LD/c;->b(Landroid/content/Context;)LY0/b;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    invoke-virtual {v1, v0}, LY0/b;->c(Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;)Lg1/i;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    new-instance v1, LI1/r;

    .line 304
    .line 305
    invoke-direct {v1, p2, p1, v12}, LI1/r;-><init>(LI1/s;ZLI1/k;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v0, v1}, Lg1/i;->b(Lg1/d;)V

    .line 309
    .line 310
    .line 311
    new-instance p1, LB1/d;

    .line 312
    .line 313
    const/4 p2, 0x2

    .line 314
    invoke-direct {p1, v12, p2}, LB1/d;-><init>(Ljava/lang/Object;I)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v0, p1}, Lg1/i;->a(Lg1/c;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 318
    .line 319
    .line 320
    goto :goto_6

    .line 321
    :goto_5
    new-instance p2, LI1/a;

    .line 322
    .line 323
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    new-instance v1, Ljava/lang/StringBuilder;

    .line 328
    .line 329
    const-string v2, "Cause: "

    .line 330
    .line 331
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 335
    .line 336
    .line 337
    move-result-object v2

    .line 338
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    const-string v2, ", Stacktrace: "

    .line 342
    .line 343
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object p1

    .line 350
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object p1

    .line 357
    sget-object v1, LI1/b;->p:LI1/b;

    .line 358
    .line 359
    invoke-direct {p2, v1, v0, p1}, LI1/a;-><init>(LI1/b;Ljava/lang/String;Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    invoke-static {v12, p2}, La/a;->o(LZ1/l;Ljava/lang/Object;)V

    .line 363
    .line 364
    .line 365
    :goto_6
    return-void

    .line 366
    :pswitch_1
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 367
    .line 368
    invoke-static {p1, v0}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    check-cast p1, Ljava/util/List;

    .line 372
    .line 373
    const/4 v0, 0x0

    .line 374
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object p1

    .line 378
    const-string v0, "null cannot be cast to non-null type kotlin.String"

    .line 379
    .line 380
    invoke-static {p1, v0}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    check-cast p1, Ljava/lang/String;

    .line 384
    .line 385
    new-instance v0, LI1/k;

    .line 386
    .line 387
    const/4 v1, 0x4

    .line 388
    invoke-direct {v0, p2, v1}, LI1/k;-><init>(LA/c;I)V

    .line 389
    .line 390
    .line 391
    iget-object p2, p0, LI1/m;->l:LI1/o;

    .line 392
    .line 393
    check-cast p2, LI1/s;

    .line 394
    .line 395
    iget-object v1, p2, LI1/s;->m:LD/c;

    .line 396
    .line 397
    iget-object p2, p2, LI1/s;->k:Landroid/content/Context;

    .line 398
    .line 399
    invoke-static {p2}, LD/c;->b(Landroid/content/Context;)LY0/b;

    .line 400
    .line 401
    .line 402
    move-result-object p2

    .line 403
    iget-object v1, p2, LY0/b;->k:Ljava/lang/String;

    .line 404
    .line 405
    new-instance v2, Lcom/google/android/gms/auth/api/identity/ClearTokenRequest;

    .line 406
    .line 407
    invoke-direct {v2, p1, v1}, Lcom/google/android/gms/auth/api/identity/ClearTokenRequest;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 408
    .line 409
    .line 410
    invoke-static {}, LL0/k;->b()LL0/k;

    .line 411
    .line 412
    .line 413
    move-result-object p1

    .line 414
    sget-object v1, LY0/f;->d:LJ0/c;

    .line 415
    .line 416
    filled-new-array {v1}, [LJ0/c;

    .line 417
    .line 418
    .line 419
    move-result-object v1

    .line 420
    iput-object v1, p1, LL0/k;->a:Ljava/lang/Object;

    .line 421
    .line 422
    new-instance v1, LA/c;

    .line 423
    .line 424
    const/16 v3, 0x18

    .line 425
    .line 426
    invoke-direct {v1, p2, v2, v3}, LA/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 427
    .line 428
    .line 429
    iput-object v1, p1, LL0/k;->d:Ljava/lang/Object;

    .line 430
    .line 431
    const/16 v1, 0x6b9

    .line 432
    .line 433
    iput v1, p1, LL0/k;->c:I

    .line 434
    .line 435
    invoke-virtual {p1}, LL0/k;->a()LL0/k;

    .line 436
    .line 437
    .line 438
    move-result-object p1

    .line 439
    const/4 v1, 0x1

    .line 440
    invoke-virtual {p2, v1, p1}, LK0/i;->b(ILL0/k;)Lg1/i;

    .line 441
    .line 442
    .line 443
    move-result-object p1

    .line 444
    new-instance p2, LI1/p;

    .line 445
    .line 446
    invoke-direct {p2, v0}, LI1/p;-><init>(LI1/k;)V

    .line 447
    .line 448
    .line 449
    invoke-virtual {p1, p2}, Lg1/i;->b(Lg1/d;)V

    .line 450
    .line 451
    .line 452
    new-instance p2, LI1/p;

    .line 453
    .line 454
    invoke-direct {p2, v0}, LI1/p;-><init>(LI1/k;)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {p1, p2}, Lg1/i;->a(Lg1/c;)V

    .line 458
    .line 459
    .line 460
    return-void

    .line 461
    :pswitch_2
    new-instance p1, LI1/k;

    .line 462
    .line 463
    const/4 v0, 0x3

    .line 464
    invoke-direct {p1, p2, v0}, LI1/k;-><init>(LA/c;I)V

    .line 465
    .line 466
    .line 467
    iget-object p2, p0, LI1/m;->l:LI1/o;

    .line 468
    .line 469
    check-cast p2, LI1/s;

    .line 470
    .line 471
    iget-object v0, p2, LI1/s;->l:LD/c;

    .line 472
    .line 473
    iget-object p2, p2, LI1/s;->k:Landroid/content/Context;

    .line 474
    .line 475
    const-string v0, "context"

    .line 476
    .line 477
    invoke-static {p2, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 478
    .line 479
    .line 480
    new-instance v0, LH/a;

    .line 481
    .line 482
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 483
    .line 484
    .line 485
    new-instance v1, Landroid/os/Bundle;

    .line 486
    .line 487
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 488
    .line 489
    .line 490
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 491
    .line 492
    .line 493
    move-result-object v1

    .line 494
    new-instance v2, LB1/a;

    .line 495
    .line 496
    const/16 v3, 0x9

    .line 497
    .line 498
    invoke-direct {v2, p1, v3}, LB1/a;-><init>(Ljava/lang/Object;I)V

    .line 499
    .line 500
    .line 501
    const-string p1, "executor"

    .line 502
    .line 503
    invoke-static {v1, p1}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 504
    .line 505
    .line 506
    new-instance p1, LH/f;

    .line 507
    .line 508
    invoke-direct {p1, p2}, LH/f;-><init>(Landroid/content/Context;)V

    .line 509
    .line 510
    .line 511
    const-string p2, "androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE"

    .line 512
    .line 513
    invoke-static {p1, p2}, LH/f;->b(LH/f;Ljava/lang/Object;)LH/e;

    .line 514
    .line 515
    .line 516
    move-result-object p1

    .line 517
    if-nez p1, :cond_5

    .line 518
    .line 519
    new-instance p1, LI/a;

    .line 520
    .line 521
    invoke-direct {p1}, LI/a;-><init>()V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v2, p1}, LB1/a;->b(Ljava/lang/Object;)V

    .line 525
    .line 526
    .line 527
    goto :goto_7

    .line 528
    :cond_5
    const/4 p2, 0x0

    .line 529
    invoke-interface {p1, v0, p2, v1, v2}, LH/e;->onClearCredential(LH/a;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;LH/d;)V

    .line 530
    .line 531
    .line 532
    :goto_7
    return-void

    .line 533
    :pswitch_3
    const-string v0, "context"

    .line 534
    .line 535
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 536
    .line 537
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 538
    .line 539
    .line 540
    check-cast p1, Ljava/util/List;

    .line 541
    .line 542
    const/4 v1, 0x0

    .line 543
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object p1

    .line 547
    const-string v1, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.GetCredentialRequestParams"

    .line 548
    .line 549
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 550
    .line 551
    .line 552
    check-cast p1, LI1/h;

    .line 553
    .line 554
    new-instance v1, LI1/k;

    .line 555
    .line 556
    const/4 v2, 0x2

    .line 557
    invoke-direct {v1, p2, v2}, LI1/k;-><init>(LA/c;I)V

    .line 558
    .line 559
    .line 560
    iget-object p2, p0, LI1/m;->l:LI1/o;

    .line 561
    .line 562
    check-cast p2, LI1/s;

    .line 563
    .line 564
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 565
    .line 566
    .line 567
    :try_start_1
    iget-object v2, p1, LI1/h;->c:Ljava/lang/String;

    .line 568
    .line 569
    const/4 v3, 0x0

    .line 570
    if-eqz v2, :cond_e

    .line 571
    .line 572
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 573
    .line 574
    .line 575
    move-result v4

    .line 576
    if-eqz v4, :cond_6

    .line 577
    .line 578
    goto/16 :goto_a

    .line 579
    .line 580
    :cond_6
    iget-object v6, p2, LI1/s;->o:Landroid/app/Activity;

    .line 581
    .line 582
    if-nez v6, :cond_7

    .line 583
    .line 584
    new-instance p1, LI1/e;

    .line 585
    .line 586
    sget-object p2, LI1/f;->o:LI1/f;

    .line 587
    .line 588
    const-string v0, "No activity available"

    .line 589
    .line 590
    invoke-direct {p1, p2, v0, v3}, LI1/e;-><init>(LI1/f;Ljava/lang/String;Ljava/lang/String;)V

    .line 591
    .line 592
    .line 593
    invoke-static {v1, p1}, La/a;->o(LZ1/l;Ljava/lang/Object;)V

    .line 594
    .line 595
    .line 596
    goto/16 :goto_c

    .line 597
    .line 598
    :catch_1
    move-exception v0

    .line 599
    move-object p1, v0

    .line 600
    goto/16 :goto_b

    .line 601
    .line 602
    :cond_7
    iget-object v4, p1, LI1/h;->e:Ljava/lang/String;

    .line 603
    .line 604
    iget-object v5, p1, LI1/h;->d:Ljava/lang/String;

    .line 605
    .line 606
    new-instance v7, Ljava/util/ArrayList;

    .line 607
    .line 608
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 609
    .line 610
    .line 611
    iget-boolean v8, p1, LI1/h;->a:Z

    .line 612
    .line 613
    if-eqz v8, :cond_a

    .line 614
    .line 615
    if-eqz v5, :cond_8

    .line 616
    .line 617
    goto :goto_8

    .line 618
    :cond_8
    move-object v5, v3

    .line 619
    :goto_8
    if-eqz v4, :cond_9

    .line 620
    .line 621
    move-object v3, v4

    .line 622
    :cond_9
    new-instance p1, Lh1/b;

    .line 623
    .line 624
    invoke-direct {p1, v2, v5, v3}, Lh1/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 625
    .line 626
    .line 627
    invoke-virtual {v7, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 628
    .line 629
    .line 630
    goto :goto_9

    .line 631
    :cond_a
    iget-object p1, p1, LI1/h;->b:LI1/g;

    .line 632
    .line 633
    iget-boolean v5, p1, LI1/g;->a:Z

    .line 634
    .line 635
    iget-boolean p1, p1, LI1/g;->b:Z

    .line 636
    .line 637
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 638
    .line 639
    .line 640
    move-result v8

    .line 641
    if-lez v8, :cond_d

    .line 642
    .line 643
    if-eqz v4, :cond_b

    .line 644
    .line 645
    move-object v3, v4

    .line 646
    :cond_b
    new-instance v4, Lh1/a;

    .line 647
    .line 648
    invoke-direct {v4, v2, v3, v5, p1}, Lh1/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 649
    .line 650
    .line 651
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 652
    .line 653
    .line 654
    :goto_9
    iget-object p1, p2, LI1/s;->k:Landroid/content/Context;

    .line 655
    .line 656
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 657
    .line 658
    .line 659
    move-object p1, v7

    .line 660
    new-instance v7, LH/k;

    .line 661
    .line 662
    invoke-static {p1}, LP1/e;->l0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 663
    .line 664
    .line 665
    move-result-object p1

    .line 666
    invoke-direct {v7, p1}, LH/k;-><init>(Ljava/util/List;)V

    .line 667
    .line 668
    .line 669
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 670
    .line 671
    .line 672
    move-result-object v9

    .line 673
    new-instance v10, LA/c;

    .line 674
    .line 675
    const/16 p1, 0x10

    .line 676
    .line 677
    const/4 v0, 0x0

    .line 678
    invoke-direct {v10, p2, v1, p1, v0}, LA/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 679
    .line 680
    .line 681
    const-string p1, "executor"

    .line 682
    .line 683
    invoke-static {v9, p1}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 684
    .line 685
    .line 686
    new-instance p1, LH/f;

    .line 687
    .line 688
    invoke-direct {p1, v6}, LH/f;-><init>(Landroid/content/Context;)V

    .line 689
    .line 690
    .line 691
    invoke-static {p1, v7}, LH/f;->b(LH/f;Ljava/lang/Object;)LH/e;

    .line 692
    .line 693
    .line 694
    move-result-object v5

    .line 695
    if-nez v5, :cond_c

    .line 696
    .line 697
    new-instance p1, LI/h;

    .line 698
    .line 699
    const-string p2, "getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"

    .line 700
    .line 701
    invoke-direct {p1, p2}, LI/h;-><init>(Ljava/lang/CharSequence;)V

    .line 702
    .line 703
    .line 704
    invoke-virtual {v10, p1}, LA/c;->b(Ljava/lang/Object;)V

    .line 705
    .line 706
    .line 707
    goto :goto_c

    .line 708
    :cond_c
    const/4 v8, 0x0

    .line 709
    invoke-interface/range {v5 .. v10}, LH/e;->onGetCredential(Landroid/content/Context;LH/k;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;LH/d;)V

    .line 710
    .line 711
    .line 712
    goto :goto_c

    .line 713
    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 714
    .line 715
    const-string p2, "serverClientId should not be empty"

    .line 716
    .line 717
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 718
    .line 719
    .line 720
    throw p1

    .line 721
    :cond_e
    :goto_a
    new-instance p1, LI1/e;

    .line 722
    .line 723
    sget-object p2, LI1/f;->n:LI1/f;

    .line 724
    .line 725
    const-string v0, "CredentialManager requires a serverClientId."

    .line 726
    .line 727
    invoke-direct {p1, p2, v0, v3}, LI1/e;-><init>(LI1/f;Ljava/lang/String;Ljava/lang/String;)V

    .line 728
    .line 729
    .line 730
    invoke-static {v1, p1}, La/a;->o(LZ1/l;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 731
    .line 732
    .line 733
    goto :goto_c

    .line 734
    :goto_b
    new-instance p2, LI1/e;

    .line 735
    .line 736
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 737
    .line 738
    .line 739
    move-result-object v0

    .line 740
    new-instance v2, Ljava/lang/StringBuilder;

    .line 741
    .line 742
    const-string v3, "Cause: "

    .line 743
    .line 744
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 745
    .line 746
    .line 747
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 748
    .line 749
    .line 750
    move-result-object v3

    .line 751
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 752
    .line 753
    .line 754
    const-string v3, ", Stacktrace: "

    .line 755
    .line 756
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 757
    .line 758
    .line 759
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 760
    .line 761
    .line 762
    move-result-object p1

    .line 763
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 764
    .line 765
    .line 766
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 767
    .line 768
    .line 769
    move-result-object p1

    .line 770
    sget-object v2, LI1/f;->u:LI1/f;

    .line 771
    .line 772
    invoke-direct {p2, v2, v0, p1}, LI1/e;-><init>(LI1/f;Ljava/lang/String;Ljava/lang/String;)V

    .line 773
    .line 774
    .line 775
    invoke-static {v1, p2}, La/a;->o(LZ1/l;Ljava/lang/Object;)V

    .line 776
    .line 777
    .line 778
    :goto_c
    return-void

    .line 779
    :pswitch_4
    iget-object p1, p0, LI1/m;->l:LI1/o;

    .line 780
    .line 781
    const/4 v1, 0x0

    .line 782
    :try_start_2
    check-cast p1, LI1/s;

    .line 783
    .line 784
    iget-object p1, p1, LI1/s;->k:Landroid/content/Context;

    .line 785
    .line 786
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 787
    .line 788
    .line 789
    move-result-object v0

    .line 790
    const-string v2, "default_web_client_id"

    .line 791
    .line 792
    const-string v3, "string"

    .line 793
    .line 794
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 795
    .line 796
    .line 797
    move-result-object v4

    .line 798
    invoke-virtual {v0, v2, v3, v4}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 799
    .line 800
    .line 801
    move-result v0

    .line 802
    if-eqz v0, :cond_f

    .line 803
    .line 804
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 805
    .line 806
    .line 807
    move-result-object p1

    .line 808
    goto :goto_d

    .line 809
    :cond_f
    move-object p1, v1

    .line 810
    :goto_d
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 811
    .line 812
    .line 813
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 814
    goto :goto_e

    .line 815
    :catchall_0
    move-exception v0

    .line 816
    move-object p1, v0

    .line 817
    nop

    .line 818
    instance-of v0, p1, LI1/d;

    .line 819
    .line 820
    if-eqz v0, :cond_10

    .line 821
    .line 822
    check-cast p1, LI1/d;

    .line 823
    .line 824
    iget-object v0, p1, LI1/d;->k:Ljava/lang/String;

    .line 825
    .line 826
    iget-object p1, p1, LI1/d;->l:Ljava/lang/String;

    .line 827
    .line 828
    filled-new-array {v0, p1, v1}, [Ljava/lang/Object;

    .line 829
    .line 830
    .line 831
    move-result-object p1

    .line 832
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 833
    .line 834
    .line 835
    move-result-object p1

    .line 836
    goto :goto_e

    .line 837
    :cond_10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 838
    .line 839
    .line 840
    move-result-object v0

    .line 841
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 842
    .line 843
    .line 844
    move-result-object v0

    .line 845
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 846
    .line 847
    .line 848
    move-result-object v1

    .line 849
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 850
    .line 851
    .line 852
    move-result-object v2

    .line 853
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 854
    .line 855
    .line 856
    move-result-object p1

    .line 857
    const-string v3, "Cause: "

    .line 858
    .line 859
    const-string v4, ", Stacktrace: "

    .line 860
    .line 861
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 862
    .line 863
    .line 864
    move-result-object p1

    .line 865
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 866
    .line 867
    .line 868
    move-result-object p1

    .line 869
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 870
    .line 871
    .line 872
    move-result-object p1

    .line 873
    :goto_e
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 874
    .line 875
    .line 876
    return-void

    .line 877
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

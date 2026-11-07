.class public final LY0/c;
.super LY0/h;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LY0/b;Lg1/e;)V
    .locals 0

    const/4 p1, 0x2

    iput p1, p0, LY0/c;->b:I

    .line 1
    iput-object p2, p0, LY0/c;->c:Ljava/lang/Object;

    .line 2
    const-string p1, "com.google.android.gms.auth.api.identity.internal.IAuthorizationCallback"

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, LY0/h;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(LY0/b;Lg1/e;I)V
    .locals 0

    iput p3, p0, LY0/c;->b:I

    packed-switch p3, :pswitch_data_0

    .line 3
    iput-object p2, p0, LY0/c;->c:Ljava/lang/Object;

    .line 4
    const-string p1, "com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback"

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, LY0/h;-><init>(Ljava/lang/String;I)V

    return-void

    .line 5
    :pswitch_0
    iput-object p2, p0, LY0/c;->c:Ljava/lang/Object;

    .line 6
    const-string p1, "com.google.android.gms.auth.api.identity.internal.IGetSignInIntentCallback"

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, LY0/h;-><init>(Ljava/lang/String;I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Lcom/google/android/gms/auth/api/signin/RevocationBoundService;)V
    .locals 2

    const/4 v0, 0x3

    iput v0, p0, LY0/c;->b:I

    .line 7
    const-string v0, "com.google.android.gms.auth.api.signin.internal.IRevocationService"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, LY0/h;-><init>(Ljava/lang/String;I)V

    .line 8
    iput-object p1, p0, LY0/c;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final m(ILandroid/os/Parcel;Landroid/os/Parcel;)Z
    .locals 7

    .line 1
    iget p3, p0, LY0/c;->b:I

    .line 2
    .line 3
    iget-object v0, p0, LY0/c;->c:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    packed-switch p3, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v0, Lcom/google/android/gms/auth/api/signin/RevocationBoundService;

    .line 11
    .line 12
    if-eq p1, v1, :cond_1

    .line 13
    .line 14
    const/4 p2, 0x2

    .line 15
    if-eq p1, p2, :cond_0

    .line 16
    .line 17
    move v1, v2

    .line 18
    goto/16 :goto_5

    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0}, LY0/c;->o()V

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, LH0/i;->w(Landroid/content/Context;)LH0/i;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, LH0/i;->x()V

    .line 28
    .line 29
    .line 30
    goto/16 :goto_5

    .line 31
    .line 32
    :cond_1
    invoke-virtual {p0}, LY0/c;->o()V

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, LH0/b;->a(Landroid/content/Context;)LH0/b;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1}, LH0/b;->b()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    sget-object p3, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->u:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    if-eqz p2, :cond_4

    .line 47
    .line 48
    const-string p3, "defaultGoogleSignInAccount"

    .line 49
    .line 50
    invoke-virtual {p1, p3}, LH0/b;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p3

    .line 54
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-eqz v4, :cond_2

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    const-string v4, "googleSignInOptions"

    .line 62
    .line 63
    invoke-static {v4, p3}, LH0/b;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p3

    .line 67
    invoke-virtual {p1, p3}, LH0/b;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    if-eqz p1, :cond_3

    .line 72
    .line 73
    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->b(Ljava/lang/String;)Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 74
    .line 75
    .line 76
    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    move-object p3, p1

    .line 78
    goto :goto_1

    .line 79
    :catch_0
    :cond_3
    :goto_0
    move-object p3, v3

    .line 80
    :cond_4
    :goto_1
    new-instance p1, LG0/a;

    .line 81
    .line 82
    invoke-static {p3}, LM0/r;->f(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    new-instance v4, LB1/b;

    .line 86
    .line 87
    const/16 v5, 0x14

    .line 88
    .line 89
    invoke-direct {v4, v5}, LB1/b;-><init>(I)V

    .line 90
    .line 91
    .line 92
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    new-instance v6, LK0/h;

    .line 97
    .line 98
    invoke-direct {v6, v4, v5}, LK0/h;-><init>(LB1/b;Landroid/os/Looper;)V

    .line 99
    .line 100
    .line 101
    sget-object v4, LE0/a;->a:LA/c;

    .line 102
    .line 103
    invoke-direct {p1, v0, v4, p3, v6}, LK0/i;-><init>(Landroid/content/Context;LA/c;LK0/b;LK0/h;)V

    .line 104
    .line 105
    .line 106
    const/16 p3, 0x15

    .line 107
    .line 108
    const/4 v0, 0x3

    .line 109
    iget-object v4, p1, LK0/i;->a:Landroid/content/Context;

    .line 110
    .line 111
    iget-object v5, p1, LK0/i;->h:LL0/s;

    .line 112
    .line 113
    if-eqz p2, :cond_9

    .line 114
    .line 115
    invoke-virtual {p1}, LG0/a;->c()I

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    if-ne p1, v0, :cond_5

    .line 120
    .line 121
    move v2, v1

    .line 122
    :cond_5
    sget-object p1, LH0/h;->a:LG1/a;

    .line 123
    .line 124
    iget p2, p1, LG1/a;->a:I

    .line 125
    .line 126
    if-gt p2, v0, :cond_6

    .line 127
    .line 128
    iget-object p2, p1, LG1/a;->b:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast p2, Ljava/lang/String;

    .line 131
    .line 132
    iget-object p1, p1, LG1/a;->c:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast p1, Ljava/lang/String;

    .line 135
    .line 136
    const-string v0, "Revoking access"

    .line 137
    .line 138
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 143
    .line 144
    .line 145
    :cond_6
    invoke-static {v4}, LH0/b;->a(Landroid/content/Context;)LH0/b;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    const-string p2, "refreshToken"

    .line 150
    .line 151
    invoke-virtual {p1, p2}, LH0/b;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-static {v4}, LH0/h;->a(Landroid/content/Context;)V

    .line 156
    .line 157
    .line 158
    if-eqz v2, :cond_8

    .line 159
    .line 160
    if-nez p1, :cond_7

    .line 161
    .line 162
    sget-object p1, LH0/c;->m:LG1/a;

    .line 163
    .line 164
    new-instance p1, Lcom/google/android/gms/common/api/Status;

    .line 165
    .line 166
    const/4 p2, 0x4

    .line 167
    invoke-direct {p1, p2, v3, v3, v3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;LJ0/a;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->b()Z

    .line 171
    .line 172
    .line 173
    move-result p2

    .line 174
    xor-int/2addr p2, v1

    .line 175
    const-string v0, "Status code must not be SUCCESS"

    .line 176
    .line 177
    invoke-static {v0, p2}, LM0/r;->a(Ljava/lang/String;Z)V

    .line 178
    .line 179
    .line 180
    new-instance p2, LK0/p;

    .line 181
    .line 182
    invoke-direct {p2, p1}, LK0/p;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p2, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->P(LK0/n;)V

    .line 186
    .line 187
    .line 188
    goto :goto_2

    .line 189
    :cond_7
    new-instance p2, LH0/c;

    .line 190
    .line 191
    invoke-direct {p2, p1}, LH0/c;-><init>(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    new-instance p1, Ljava/lang/Thread;

    .line 195
    .line 196
    invoke-direct {p1, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 200
    .line 201
    .line 202
    iget-object p2, p2, LH0/c;->l:LL0/j;

    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_8
    new-instance p2, LH0/g;

    .line 206
    .line 207
    invoke-direct {p2, v5, v1}, LH0/g;-><init>(LK0/l;I)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v5, p2}, LL0/s;->a(LH0/g;)LH0/g;

    .line 211
    .line 212
    .line 213
    :goto_2
    new-instance p1, LB1/b;

    .line 214
    .line 215
    invoke-direct {p1, p3}, LB1/b;-><init>(I)V

    .line 216
    .line 217
    .line 218
    new-instance p3, Lg1/e;

    .line 219
    .line 220
    invoke-direct {p3}, Lg1/e;-><init>()V

    .line 221
    .line 222
    .line 223
    new-instance v0, LL0/l;

    .line 224
    .line 225
    invoke-direct {v0, p2, p3, p1}, LL0/l;-><init>(LS0/a;Lg1/e;LB1/b;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p2, v0}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->L(LL0/l;)V

    .line 229
    .line 230
    .line 231
    goto :goto_5

    .line 232
    :cond_9
    invoke-virtual {p1}, LG0/a;->c()I

    .line 233
    .line 234
    .line 235
    move-result p1

    .line 236
    if-ne p1, v0, :cond_a

    .line 237
    .line 238
    move p1, v1

    .line 239
    goto :goto_3

    .line 240
    :cond_a
    move p1, v2

    .line 241
    :goto_3
    sget-object p2, LH0/h;->a:LG1/a;

    .line 242
    .line 243
    iget v3, p2, LG1/a;->a:I

    .line 244
    .line 245
    if-gt v3, v0, :cond_b

    .line 246
    .line 247
    iget-object v0, p2, LG1/a;->b:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v0, Ljava/lang/String;

    .line 250
    .line 251
    iget-object p2, p2, LG1/a;->c:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast p2, Ljava/lang/String;

    .line 254
    .line 255
    const-string v3, "Signing out"

    .line 256
    .line 257
    invoke-virtual {p2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object p2

    .line 261
    invoke-static {v0, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 262
    .line 263
    .line 264
    :cond_b
    invoke-static {v4}, LH0/h;->a(Landroid/content/Context;)V

    .line 265
    .line 266
    .line 267
    if-eqz p1, :cond_c

    .line 268
    .line 269
    new-instance p1, LL0/j;

    .line 270
    .line 271
    invoke-direct {p1, v5}, Lcom/google/android/gms/common/api/internal/BasePendingResult;-><init>(LK0/l;)V

    .line 272
    .line 273
    .line 274
    sget-object p2, Lcom/google/android/gms/common/api/Status;->o:Lcom/google/android/gms/common/api/Status;

    .line 275
    .line 276
    invoke-virtual {p1, p2}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->P(LK0/n;)V

    .line 277
    .line 278
    .line 279
    goto :goto_4

    .line 280
    :cond_c
    new-instance p1, LH0/g;

    .line 281
    .line 282
    invoke-direct {p1, v5, v2}, LH0/g;-><init>(LK0/l;I)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v5, p1}, LL0/s;->a(LH0/g;)LH0/g;

    .line 286
    .line 287
    .line 288
    :goto_4
    new-instance p2, LB1/b;

    .line 289
    .line 290
    invoke-direct {p2, p3}, LB1/b;-><init>(I)V

    .line 291
    .line 292
    .line 293
    new-instance p3, Lg1/e;

    .line 294
    .line 295
    invoke-direct {p3}, Lg1/e;-><init>()V

    .line 296
    .line 297
    .line 298
    new-instance v0, LL0/l;

    .line 299
    .line 300
    invoke-direct {v0, p1, p3, p2}, LL0/l;-><init>(LS0/a;Lg1/e;LB1/b;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->L(LL0/l;)V

    .line 304
    .line 305
    .line 306
    :goto_5
    return v1

    .line 307
    :pswitch_0
    if-ne p1, v1, :cond_e

    .line 308
    .line 309
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 310
    .line 311
    invoke-static {p2, p1}, LY0/n;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 312
    .line 313
    .line 314
    move-result-object p1

    .line 315
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 316
    .line 317
    sget-object p3, LF0/a;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 318
    .line 319
    invoke-static {p2, p3}, LY0/n;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 320
    .line 321
    .line 322
    move-result-object p3

    .line 323
    check-cast p3, LF0/a;

    .line 324
    .line 325
    invoke-static {p2}, LY0/n;->c(Landroid/os/Parcel;)V

    .line 326
    .line 327
    .line 328
    check-cast v0, Lg1/e;

    .line 329
    .line 330
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->b()Z

    .line 331
    .line 332
    .line 333
    move-result p2

    .line 334
    if-eqz p2, :cond_d

    .line 335
    .line 336
    invoke-virtual {v0, p3}, Lg1/e;->b(Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    goto :goto_6

    .line 340
    :cond_d
    invoke-static {p1}, LM0/r;->j(Lcom/google/android/gms/common/api/Status;)LK0/e;

    .line 341
    .line 342
    .line 343
    move-result-object p1

    .line 344
    invoke-virtual {v0, p1}, Lg1/e;->a(LK0/e;)V

    .line 345
    .line 346
    .line 347
    goto :goto_6

    .line 348
    :cond_e
    move v1, v2

    .line 349
    :goto_6
    return v1

    .line 350
    :pswitch_1
    if-ne p1, v1, :cond_f

    .line 351
    .line 352
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 353
    .line 354
    invoke-static {p2, p1}, LY0/n;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 355
    .line 356
    .line 357
    move-result-object p1

    .line 358
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 359
    .line 360
    sget-object p3, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 361
    .line 362
    invoke-static {p2, p3}, LY0/n;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 363
    .line 364
    .line 365
    move-result-object p3

    .line 366
    check-cast p3, Landroid/app/PendingIntent;

    .line 367
    .line 368
    invoke-static {p2}, LY0/n;->c(Landroid/os/Parcel;)V

    .line 369
    .line 370
    .line 371
    check-cast v0, Lg1/e;

    .line 372
    .line 373
    invoke-static {p1, p3, v0}, LH2/h;->y(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lg1/e;)V

    .line 374
    .line 375
    .line 376
    goto :goto_7

    .line 377
    :cond_f
    move v1, v2

    .line 378
    :goto_7
    return v1

    .line 379
    :pswitch_2
    if-ne p1, v1, :cond_10

    .line 380
    .line 381
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 382
    .line 383
    invoke-static {p2, p1}, LY0/n;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 384
    .line 385
    .line 386
    move-result-object p1

    .line 387
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 388
    .line 389
    sget-object p3, LF0/h;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 390
    .line 391
    invoke-static {p2, p3}, LY0/n;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 392
    .line 393
    .line 394
    move-result-object p3

    .line 395
    check-cast p3, LF0/h;

    .line 396
    .line 397
    invoke-static {p2}, LY0/n;->c(Landroid/os/Parcel;)V

    .line 398
    .line 399
    .line 400
    check-cast v0, Lg1/e;

    .line 401
    .line 402
    invoke-static {p1, p3, v0}, LH2/h;->y(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lg1/e;)V

    .line 403
    .line 404
    .line 405
    goto :goto_8

    .line 406
    :cond_10
    move v1, v2

    .line 407
    :goto_8
    return v1

    .line 408
    nop

    .line 409
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public o()V
    .locals 8

    .line 1
    iget-object v0, p0, LY0/c;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/gms/auth/api/signin/RevocationBoundService;

    .line 4
    .line 5
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const-string v2, "com.google.android.gms"

    .line 10
    .line 11
    invoke-static {v0}, LS0/b;->a(Landroid/content/Context;)LJ0/g;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    :try_start_0
    iget-object v3, v3, LJ0/g;->a:Landroid/content/Context;

    .line 19
    .line 20
    const-string v4, "appops"

    .line 21
    .line 22
    invoke-virtual {v3, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Landroid/app/AppOpsManager;

    .line 27
    .line 28
    if-eqz v3, :cond_6

    .line 29
    .line 30
    invoke-virtual {v3, v1, v2}, Landroid/app/AppOpsManager;->checkPackage(ILjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_2

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const/16 v3, 0x40

    .line 38
    .line 39
    :try_start_1
    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 40
    .line 41
    .line 42
    move-result-object v1
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 43
    invoke-static {v0}, LJ0/g;->a(Landroid/content/Context;)LJ0/g;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    if-eqz v1, :cond_7

    .line 51
    .line 52
    const/4 v4, 0x0

    .line 53
    invoke-static {v1, v4}, LJ0/g;->b(Landroid/content/pm/PackageInfo;Z)Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-eqz v5, :cond_0

    .line 58
    .line 59
    goto :goto_4

    .line 60
    :cond_0
    const/4 v5, 0x1

    .line 61
    invoke-static {v1, v5}, LJ0/g;->b(Landroid/content/pm/PackageInfo;Z)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_7

    .line 66
    .line 67
    iget-object v0, v0, LJ0/g;->a:Landroid/content/Context;

    .line 68
    .line 69
    sget-boolean v1, LJ0/f;->c:Z

    .line 70
    .line 71
    if-nez v1, :cond_3

    .line 72
    .line 73
    :try_start_2
    invoke-static {v0}, LS0/b;->a(Landroid/content/Context;)LJ0/g;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 78
    .line 79
    const/16 v7, 0x1c

    .line 80
    .line 81
    if-lt v6, v7, :cond_1

    .line 82
    .line 83
    const v3, 0x8000040

    .line 84
    .line 85
    .line 86
    :cond_1
    iget-object v1, v1, LJ0/g;->a:Landroid/content/Context;

    .line 87
    .line 88
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-static {v0}, LJ0/g;->a(Landroid/content/Context;)LJ0/g;

    .line 97
    .line 98
    .line 99
    if-eqz v1, :cond_2

    .line 100
    .line 101
    invoke-static {v1, v4}, LJ0/g;->b(Landroid/content/pm/PackageInfo;Z)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-nez v0, :cond_2

    .line 106
    .line 107
    invoke-static {v1, v5}, LJ0/g;->b(Landroid/content/pm/PackageInfo;Z)Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eqz v0, :cond_2

    .line 112
    .line 113
    sput-boolean v5, LJ0/f;->b:Z

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :catchall_0
    move-exception v0

    .line 117
    goto :goto_2

    .line 118
    :catch_0
    move-exception v0

    .line 119
    goto :goto_1

    .line 120
    :cond_2
    sput-boolean v4, LJ0/f;->b:Z
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 121
    .line 122
    :goto_0
    sput-boolean v5, LJ0/f;->c:Z

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :goto_1
    :try_start_3
    const-string v1, "GooglePlayServicesUtil"

    .line 126
    .line 127
    const-string v2, "Cannot find Google Play services package name."

    .line 128
    .line 129
    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 130
    .line 131
    .line 132
    sput-boolean v5, LJ0/f;->c:Z

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :goto_2
    sput-boolean v5, LJ0/f;->c:Z

    .line 136
    .line 137
    throw v0

    .line 138
    :cond_3
    :goto_3
    sget-boolean v0, LJ0/f;->b:Z

    .line 139
    .line 140
    if-nez v0, :cond_5

    .line 141
    .line 142
    const-string v0, "user"

    .line 143
    .line 144
    sget-object v1, Landroid/os/Build;->TYPE:Ljava/lang/String;

    .line 145
    .line 146
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    if-nez v0, :cond_4

    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_4
    const-string v0, "GoogleSignatureVerifier"

    .line 154
    .line 155
    const-string v1, "Test-keys aren\'t accepted on this build."

    .line 156
    .line 157
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 158
    .line 159
    .line 160
    goto :goto_5

    .line 161
    :cond_5
    :goto_4
    return-void

    .line 162
    :catch_1
    const/4 v0, 0x3

    .line 163
    const-string v1, "UidVerifier"

    .line 164
    .line 165
    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    if-eqz v0, :cond_7

    .line 170
    .line 171
    const-string v0, "Package manager can\'t find google play services package, defaulting to false"

    .line 172
    .line 173
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 174
    .line 175
    .line 176
    goto :goto_5

    .line 177
    :cond_6
    :try_start_4
    new-instance v0, Ljava/lang/NullPointerException;

    .line 178
    .line 179
    const-string v1, "context.getSystemService(Context.APP_OPS_SERVICE) is null"

    .line 180
    .line 181
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    throw v0
    :try_end_4
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_2

    .line 185
    :catch_2
    :cond_7
    :goto_5
    new-instance v0, Ljava/lang/SecurityException;

    .line 186
    .line 187
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    new-instance v3, Ljava/lang/StringBuilder;

    .line 200
    .line 201
    add-int/lit8 v2, v2, 0x29

    .line 202
    .line 203
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 204
    .line 205
    .line 206
    const-string v2, "Calling UID "

    .line 207
    .line 208
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    const-string v1, " is not Google Play services."

    .line 215
    .line 216
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    invoke-direct {v0, v1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    throw v0
.end method

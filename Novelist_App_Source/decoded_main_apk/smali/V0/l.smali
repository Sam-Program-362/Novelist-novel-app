.class public final LV0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LV0/l;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, LV0/l;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lb0/N;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lb0/N;-><init>(Landroid/os/Parcel;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_0
    new-instance v0, Lb0/J;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput-object v1, v0, Lb0/J;->o:Ljava/lang/String;

    .line 19
    .line 20
    new-instance v1, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v1, v0, Lb0/J;->p:Ljava/util/ArrayList;

    .line 26
    .line 27
    new-instance v1, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v1, v0, Lb0/J;->q:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iput-object v1, v0, Lb0/J;->k:Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iput-object v1, v0, Lb0/J;->l:Ljava/util/ArrayList;

    .line 45
    .line 46
    sget-object v1, Lb0/b;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 47
    .line 48
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->createTypedArray(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, [Lb0/b;

    .line 53
    .line 54
    iput-object v1, v0, Lb0/J;->m:[Lb0/b;

    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    iput v1, v0, Lb0/J;->n:I

    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    iput-object v1, v0, Lb0/J;->o:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    iput-object v1, v0, Lb0/J;->p:Ljava/util/ArrayList;

    .line 73
    .line 74
    sget-object v1, Lb0/c;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 75
    .line 76
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    iput-object v1, v0, Lb0/J;->q:Ljava/util/ArrayList;

    .line 81
    .line 82
    sget-object v1, Lb0/E;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 83
    .line 84
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    iput-object p1, v0, Lb0/J;->r:Ljava/util/ArrayList;

    .line 89
    .line 90
    return-object v0

    .line 91
    :pswitch_1
    new-instance v0, Lb0/E;

    .line 92
    .line 93
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    iput-object v1, v0, Lb0/E;->k:Ljava/lang/String;

    .line 101
    .line 102
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    iput p1, v0, Lb0/E;->l:I

    .line 107
    .line 108
    return-object v0

    .line 109
    :pswitch_2
    new-instance v0, Lb0/c;

    .line 110
    .line 111
    invoke-direct {v0, p1}, Lb0/c;-><init>(Landroid/os/Parcel;)V

    .line 112
    .line 113
    .line 114
    return-object v0

    .line 115
    :pswitch_3
    new-instance v0, Lb0/b;

    .line 116
    .line 117
    invoke-direct {v0, p1}, Lb0/b;-><init>(Landroid/os/Parcel;)V

    .line 118
    .line 119
    .line 120
    return-object v0

    .line 121
    :pswitch_4
    invoke-static {p1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-ge v1, v0, :cond_0

    .line 130
    .line 131
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    invoke-static {p1, v1}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 136
    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_0
    invoke-static {p1, v0}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 140
    .line 141
    .line 142
    new-instance p1, LW0/q;

    .line 143
    .line 144
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 145
    .line 146
    .line 147
    return-object p1

    .line 148
    :pswitch_5
    invoke-static {p1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    :goto_1
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    if-ge v1, v0, :cond_1

    .line 157
    .line 158
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    invoke-static {p1, v1}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 163
    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_1
    invoke-static {p1, v0}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 167
    .line 168
    .line 169
    new-instance p1, LW0/p;

    .line 170
    .line 171
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 172
    .line 173
    .line 174
    return-object p1

    .line 175
    :pswitch_6
    invoke-static {p1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    :goto_2
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    if-ge v1, v0, :cond_2

    .line 184
    .line 185
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    invoke-static {p1, v1}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 190
    .line 191
    .line 192
    goto :goto_2

    .line 193
    :cond_2
    invoke-static {p1, v0}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 194
    .line 195
    .line 196
    new-instance p1, LW0/o;

    .line 197
    .line 198
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 199
    .line 200
    .line 201
    return-object p1

    .line 202
    :pswitch_7
    invoke-static {p1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    :goto_3
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    if-ge v1, v0, :cond_3

    .line 211
    .line 212
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    invoke-static {p1, v1}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 217
    .line 218
    .line 219
    goto :goto_3

    .line 220
    :cond_3
    invoke-static {p1, v0}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 221
    .line 222
    .line 223
    new-instance p1, LW0/n;

    .line 224
    .line 225
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 226
    .line 227
    .line 228
    return-object p1

    .line 229
    :pswitch_8
    invoke-static {p1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    const/4 v1, 0x0

    .line 234
    :goto_4
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 235
    .line 236
    .line 237
    move-result v2

    .line 238
    if-ge v2, v0, :cond_5

    .line 239
    .line 240
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 241
    .line 242
    .line 243
    move-result v2

    .line 244
    int-to-char v3, v2

    .line 245
    const/4 v4, 0x1

    .line 246
    if-eq v3, v4, :cond_4

    .line 247
    .line 248
    invoke-static {p1, v2}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 249
    .line 250
    .line 251
    goto :goto_4

    .line 252
    :cond_4
    sget-object v1, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 253
    .line 254
    invoke-static {p1, v2, v1}, LE2/a;->j(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    check-cast v1, Landroid/app/PendingIntent;

    .line 259
    .line 260
    goto :goto_4

    .line 261
    :cond_5
    invoke-static {p1, v0}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 262
    .line 263
    .line 264
    new-instance p1, LW0/m;

    .line 265
    .line 266
    invoke-direct {p1, v1}, LW0/m;-><init>(Landroid/app/PendingIntent;)V

    .line 267
    .line 268
    .line 269
    return-object p1

    .line 270
    :pswitch_9
    invoke-static {p1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    const/4 v1, 0x0

    .line 275
    :goto_5
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 276
    .line 277
    .line 278
    move-result v2

    .line 279
    if-ge v2, v0, :cond_7

    .line 280
    .line 281
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 282
    .line 283
    .line 284
    move-result v2

    .line 285
    int-to-char v3, v2

    .line 286
    const/4 v4, 0x1

    .line 287
    if-eq v3, v4, :cond_6

    .line 288
    .line 289
    invoke-static {p1, v2}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 290
    .line 291
    .line 292
    goto :goto_5

    .line 293
    :cond_6
    sget-object v1, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 294
    .line 295
    invoke-static {p1, v2, v1}, LE2/a;->j(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    check-cast v1, Landroid/app/PendingIntent;

    .line 300
    .line 301
    goto :goto_5

    .line 302
    :cond_7
    invoke-static {p1, v0}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 303
    .line 304
    .line 305
    new-instance p1, LW0/l;

    .line 306
    .line 307
    invoke-direct {p1, v1}, LW0/l;-><init>(Landroid/app/PendingIntent;)V

    .line 308
    .line 309
    .line 310
    return-object p1

    .line 311
    :pswitch_a
    invoke-static {p1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 312
    .line 313
    .line 314
    move-result v0

    .line 315
    const/4 v1, 0x0

    .line 316
    :goto_6
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 317
    .line 318
    .line 319
    move-result v2

    .line 320
    if-ge v2, v0, :cond_9

    .line 321
    .line 322
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 323
    .line 324
    .line 325
    move-result v2

    .line 326
    int-to-char v3, v2

    .line 327
    const/4 v4, 0x1

    .line 328
    if-eq v3, v4, :cond_8

    .line 329
    .line 330
    invoke-static {p1, v2}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 331
    .line 332
    .line 333
    goto :goto_6

    .line 334
    :cond_8
    invoke-static {p1, v2}, LE2/a;->f(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    goto :goto_6

    .line 339
    :cond_9
    invoke-static {p1, v0}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 340
    .line 341
    .line 342
    new-instance p1, LW0/k;

    .line 343
    .line 344
    invoke-direct {p1, v1}, LW0/k;-><init>(Landroid/os/Bundle;)V

    .line 345
    .line 346
    .line 347
    return-object p1

    .line 348
    :pswitch_b
    invoke-static {p1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 349
    .line 350
    .line 351
    move-result v0

    .line 352
    const/4 v1, 0x0

    .line 353
    move-object v2, v1

    .line 354
    move-object v3, v2

    .line 355
    move-object v4, v3

    .line 356
    :goto_7
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 357
    .line 358
    .line 359
    move-result v5

    .line 360
    if-ge v5, v0, :cond_e

    .line 361
    .line 362
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 363
    .line 364
    .line 365
    move-result v5

    .line 366
    int-to-char v6, v5

    .line 367
    const/4 v7, 0x1

    .line 368
    if-eq v6, v7, :cond_d

    .line 369
    .line 370
    const/4 v7, 0x2

    .line 371
    if-eq v6, v7, :cond_c

    .line 372
    .line 373
    const/4 v7, 0x3

    .line 374
    if-eq v6, v7, :cond_b

    .line 375
    .line 376
    const/4 v7, 0x4

    .line 377
    if-eq v6, v7, :cond_a

    .line 378
    .line 379
    invoke-static {p1, v5}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 380
    .line 381
    .line 382
    goto :goto_7

    .line 383
    :cond_a
    sget-object v4, Landroid/os/ResultReceiver;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 384
    .line 385
    invoke-static {p1, v5, v4}, LE2/a;->j(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 386
    .line 387
    .line 388
    move-result-object v4

    .line 389
    check-cast v4, Landroid/os/ResultReceiver;

    .line 390
    .line 391
    goto :goto_7

    .line 392
    :cond_b
    invoke-static {p1, v5}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v3

    .line 396
    goto :goto_7

    .line 397
    :cond_c
    invoke-static {p1, v5}, LE2/a;->f(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 398
    .line 399
    .line 400
    move-result-object v2

    .line 401
    goto :goto_7

    .line 402
    :cond_d
    sget-object v1, LW0/h;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 403
    .line 404
    invoke-static {p1, v5, v1}, LE2/a;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    goto :goto_7

    .line 409
    :cond_e
    invoke-static {p1, v0}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 410
    .line 411
    .line 412
    new-instance p1, Lcom/google/android/gms/identitycredentials/GetCredentialRequest;

    .line 413
    .line 414
    invoke-direct {p1, v1, v2, v3, v4}, Lcom/google/android/gms/identitycredentials/GetCredentialRequest;-><init>(Ljava/util/ArrayList;Landroid/os/Bundle;Ljava/lang/String;Landroid/os/ResultReceiver;)V

    .line 415
    .line 416
    .line 417
    return-object p1

    .line 418
    :pswitch_c
    invoke-static {p1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 419
    .line 420
    .line 421
    move-result v0

    .line 422
    const/4 v1, 0x0

    .line 423
    :goto_8
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 424
    .line 425
    .line 426
    move-result v2

    .line 427
    if-ge v2, v0, :cond_10

    .line 428
    .line 429
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 430
    .line 431
    .line 432
    move-result v2

    .line 433
    int-to-char v3, v2

    .line 434
    const/4 v4, 0x1

    .line 435
    if-eq v3, v4, :cond_f

    .line 436
    .line 437
    invoke-static {p1, v2}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 438
    .line 439
    .line 440
    goto :goto_8

    .line 441
    :cond_f
    invoke-static {p1, v2}, LE2/a;->f(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 442
    .line 443
    .line 444
    move-result-object v1

    .line 445
    goto :goto_8

    .line 446
    :cond_10
    invoke-static {p1, v0}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 447
    .line 448
    .line 449
    new-instance p1, LW0/j;

    .line 450
    .line 451
    invoke-direct {p1, v1}, LW0/j;-><init>(Landroid/os/Bundle;)V

    .line 452
    .line 453
    .line 454
    return-object p1

    .line 455
    :pswitch_d
    invoke-static {p1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 456
    .line 457
    .line 458
    move-result v0

    .line 459
    const/4 v1, 0x0

    .line 460
    :goto_9
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 461
    .line 462
    .line 463
    move-result v2

    .line 464
    if-ge v2, v0, :cond_12

    .line 465
    .line 466
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 467
    .line 468
    .line 469
    move-result v2

    .line 470
    int-to-char v3, v2

    .line 471
    const/4 v4, 0x1

    .line 472
    if-eq v3, v4, :cond_11

    .line 473
    .line 474
    invoke-static {p1, v2}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 475
    .line 476
    .line 477
    goto :goto_9

    .line 478
    :cond_11
    invoke-static {p1, v2}, LE2/a;->f(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 479
    .line 480
    .line 481
    move-result-object v1

    .line 482
    goto :goto_9

    .line 483
    :cond_12
    invoke-static {p1, v0}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 484
    .line 485
    .line 486
    new-instance p1, LW0/i;

    .line 487
    .line 488
    invoke-direct {p1, v1}, LW0/i;-><init>(Landroid/os/Bundle;)V

    .line 489
    .line 490
    .line 491
    return-object p1

    .line 492
    :pswitch_e
    invoke-static {p1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 493
    .line 494
    .line 495
    move-result v0

    .line 496
    const-string v1, ""

    .line 497
    .line 498
    const/4 v2, 0x0

    .line 499
    move-object v4, v1

    .line 500
    move-object v8, v4

    .line 501
    move-object v9, v8

    .line 502
    move-object v5, v2

    .line 503
    move-object v6, v5

    .line 504
    move-object v7, v6

    .line 505
    :goto_a
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 506
    .line 507
    .line 508
    move-result v1

    .line 509
    if-ge v1, v0, :cond_13

    .line 510
    .line 511
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 512
    .line 513
    .line 514
    move-result v1

    .line 515
    int-to-char v2, v1

    .line 516
    packed-switch v2, :pswitch_data_1

    .line 517
    .line 518
    .line 519
    invoke-static {p1, v1}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 520
    .line 521
    .line 522
    goto :goto_a

    .line 523
    :pswitch_f
    invoke-static {p1, v1}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object v9

    .line 527
    goto :goto_a

    .line 528
    :pswitch_10
    invoke-static {p1, v1}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    move-result-object v8

    .line 532
    goto :goto_a

    .line 533
    :pswitch_11
    invoke-static {p1, v1}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 534
    .line 535
    .line 536
    move-result-object v7

    .line 537
    goto :goto_a

    .line 538
    :pswitch_12
    invoke-static {p1, v1}, LE2/a;->f(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 539
    .line 540
    .line 541
    move-result-object v6

    .line 542
    goto :goto_a

    .line 543
    :pswitch_13
    invoke-static {p1, v1}, LE2/a;->f(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 544
    .line 545
    .line 546
    move-result-object v5

    .line 547
    goto :goto_a

    .line 548
    :pswitch_14
    invoke-static {p1, v1}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v4

    .line 552
    goto :goto_a

    .line 553
    :cond_13
    invoke-static {p1, v0}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 554
    .line 555
    .line 556
    new-instance v3, LW0/h;

    .line 557
    .line 558
    invoke-direct/range {v3 .. v9}, LW0/h;-><init>(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 559
    .line 560
    .line 561
    return-object v3

    .line 562
    :pswitch_15
    invoke-static {p1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 563
    .line 564
    .line 565
    move-result v0

    .line 566
    const/4 v1, 0x0

    .line 567
    move-object v2, v1

    .line 568
    :goto_b
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 569
    .line 570
    .line 571
    move-result v3

    .line 572
    if-ge v3, v0, :cond_16

    .line 573
    .line 574
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 575
    .line 576
    .line 577
    move-result v3

    .line 578
    int-to-char v4, v3

    .line 579
    const/4 v5, 0x1

    .line 580
    if-eq v4, v5, :cond_15

    .line 581
    .line 582
    const/4 v5, 0x2

    .line 583
    if-eq v4, v5, :cond_14

    .line 584
    .line 585
    invoke-static {p1, v3}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 586
    .line 587
    .line 588
    goto :goto_b

    .line 589
    :cond_14
    invoke-static {p1, v3}, LE2/a;->f(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 590
    .line 591
    .line 592
    move-result-object v2

    .line 593
    goto :goto_b

    .line 594
    :cond_15
    invoke-static {p1, v3}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 595
    .line 596
    .line 597
    move-result-object v1

    .line 598
    goto :goto_b

    .line 599
    :cond_16
    invoke-static {p1, v0}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 600
    .line 601
    .line 602
    new-instance p1, LW0/g;

    .line 603
    .line 604
    invoke-direct {p1, v1, v2}, LW0/g;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 605
    .line 606
    .line 607
    return-object p1

    .line 608
    :pswitch_16
    invoke-static {p1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 609
    .line 610
    .line 611
    move-result v0

    .line 612
    const/4 v1, 0x0

    .line 613
    move-object v2, v1

    .line 614
    :goto_c
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 615
    .line 616
    .line 617
    move-result v3

    .line 618
    if-ge v3, v0, :cond_19

    .line 619
    .line 620
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 621
    .line 622
    .line 623
    move-result v3

    .line 624
    int-to-char v4, v3

    .line 625
    const/4 v5, 0x1

    .line 626
    if-eq v4, v5, :cond_18

    .line 627
    .line 628
    const/4 v5, 0x2

    .line 629
    if-eq v4, v5, :cond_17

    .line 630
    .line 631
    invoke-static {p1, v3}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 632
    .line 633
    .line 634
    goto :goto_c

    .line 635
    :cond_17
    sget-object v2, LW0/g;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 636
    .line 637
    invoke-static {p1, v3, v2}, LE2/a;->j(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 638
    .line 639
    .line 640
    move-result-object v2

    .line 641
    check-cast v2, LW0/g;

    .line 642
    .line 643
    goto :goto_c

    .line 644
    :cond_18
    sget-object v1, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 645
    .line 646
    invoke-static {p1, v3, v1}, LE2/a;->j(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 647
    .line 648
    .line 649
    move-result-object v1

    .line 650
    check-cast v1, Landroid/app/PendingIntent;

    .line 651
    .line 652
    goto :goto_c

    .line 653
    :cond_19
    invoke-static {p1, v0}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 654
    .line 655
    .line 656
    new-instance p1, LW0/f;

    .line 657
    .line 658
    invoke-direct {p1, v1, v2}, LW0/f;-><init>(Landroid/app/PendingIntent;LW0/g;)V

    .line 659
    .line 660
    .line 661
    return-object p1

    .line 662
    :pswitch_17
    invoke-static {p1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 663
    .line 664
    .line 665
    move-result v0

    .line 666
    const/4 v1, 0x0

    .line 667
    :goto_d
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 668
    .line 669
    .line 670
    move-result v2

    .line 671
    if-ge v2, v0, :cond_1b

    .line 672
    .line 673
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 674
    .line 675
    .line 676
    move-result v2

    .line 677
    int-to-char v3, v2

    .line 678
    const/4 v4, 0x1

    .line 679
    if-eq v3, v4, :cond_1a

    .line 680
    .line 681
    invoke-static {p1, v2}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 682
    .line 683
    .line 684
    goto :goto_d

    .line 685
    :cond_1a
    invoke-static {p1, v2}, LE2/a;->G(Landroid/os/Parcel;I)Z

    .line 686
    .line 687
    .line 688
    move-result v1

    .line 689
    goto :goto_d

    .line 690
    :cond_1b
    invoke-static {p1, v0}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 691
    .line 692
    .line 693
    new-instance p1, LW0/e;

    .line 694
    .line 695
    invoke-direct {p1, v1}, LW0/e;-><init>(Z)V

    .line 696
    .line 697
    .line 698
    return-object p1

    .line 699
    :pswitch_18
    invoke-static {p1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 700
    .line 701
    .line 702
    move-result v0

    .line 703
    const/4 v1, 0x0

    .line 704
    :goto_e
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 705
    .line 706
    .line 707
    move-result v2

    .line 708
    if-ge v2, v0, :cond_1d

    .line 709
    .line 710
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 711
    .line 712
    .line 713
    move-result v2

    .line 714
    int-to-char v3, v2

    .line 715
    const/4 v4, 0x1

    .line 716
    if-eq v3, v4, :cond_1c

    .line 717
    .line 718
    invoke-static {p1, v2}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 719
    .line 720
    .line 721
    goto :goto_e

    .line 722
    :cond_1c
    invoke-static {p1, v2}, LE2/a;->G(Landroid/os/Parcel;I)Z

    .line 723
    .line 724
    .line 725
    move-result v1

    .line 726
    goto :goto_e

    .line 727
    :cond_1d
    invoke-static {p1, v0}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 728
    .line 729
    .line 730
    new-instance p1, LW0/d;

    .line 731
    .line 732
    invoke-direct {p1, v1}, LW0/d;-><init>(Z)V

    .line 733
    .line 734
    .line 735
    return-object p1

    .line 736
    :pswitch_19
    invoke-static {p1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 737
    .line 738
    .line 739
    move-result v0

    .line 740
    :goto_f
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 741
    .line 742
    .line 743
    move-result v1

    .line 744
    if-ge v1, v0, :cond_1e

    .line 745
    .line 746
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 747
    .line 748
    .line 749
    move-result v1

    .line 750
    invoke-static {p1, v1}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 751
    .line 752
    .line 753
    goto :goto_f

    .line 754
    :cond_1e
    invoke-static {p1, v0}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 755
    .line 756
    .line 757
    new-instance p1, LW0/c;

    .line 758
    .line 759
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 760
    .line 761
    .line 762
    return-object p1

    .line 763
    :pswitch_1a
    invoke-static {p1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 764
    .line 765
    .line 766
    move-result v0

    .line 767
    :goto_10
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 768
    .line 769
    .line 770
    move-result v1

    .line 771
    if-ge v1, v0, :cond_1f

    .line 772
    .line 773
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 774
    .line 775
    .line 776
    move-result v1

    .line 777
    invoke-static {p1, v1}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 778
    .line 779
    .line 780
    goto :goto_10

    .line 781
    :cond_1f
    invoke-static {p1, v0}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 782
    .line 783
    .line 784
    new-instance p1, LW0/b;

    .line 785
    .line 786
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 787
    .line 788
    .line 789
    return-object p1

    .line 790
    :pswitch_1b
    invoke-static {p1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 791
    .line 792
    .line 793
    move-result v0

    .line 794
    const/4 v1, 0x0

    .line 795
    :goto_11
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 796
    .line 797
    .line 798
    move-result v2

    .line 799
    if-ge v2, v0, :cond_21

    .line 800
    .line 801
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 802
    .line 803
    .line 804
    move-result v2

    .line 805
    int-to-char v3, v2

    .line 806
    const/4 v4, 0x1

    .line 807
    if-eq v3, v4, :cond_20

    .line 808
    .line 809
    invoke-static {p1, v2}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 810
    .line 811
    .line 812
    goto :goto_11

    .line 813
    :cond_20
    invoke-static {p1, v2}, LE2/a;->G(Landroid/os/Parcel;I)Z

    .line 814
    .line 815
    .line 816
    move-result v1

    .line 817
    goto :goto_11

    .line 818
    :cond_21
    invoke-static {p1, v0}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 819
    .line 820
    .line 821
    new-instance p1, LW0/a;

    .line 822
    .line 823
    invoke-direct {p1, v1}, LW0/a;-><init>(Z)V

    .line 824
    .line 825
    .line 826
    return-object p1

    .line 827
    :pswitch_1c
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 828
    .line 829
    .line 830
    move-result p1

    .line 831
    :try_start_0
    invoke-static {p1}, LV0/h;->a(I)LV0/h;

    .line 832
    .line 833
    .line 834
    move-result-object p1
    :try_end_0
    .catch LV0/g; {:try_start_0 .. :try_end_0} :catch_0

    .line 835
    return-object p1

    .line 836
    :catch_0
    move-exception v0

    .line 837
    move-object p1, v0

    .line 838
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 839
    .line 840
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 841
    .line 842
    .line 843
    throw v0

    .line 844
    :pswitch_1d
    invoke-static {p1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 845
    .line 846
    .line 847
    move-result v0

    .line 848
    const/4 v1, 0x0

    .line 849
    const/4 v2, 0x0

    .line 850
    move-object v3, v2

    .line 851
    move v2, v1

    .line 852
    :goto_12
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 853
    .line 854
    .line 855
    move-result v4

    .line 856
    if-ge v4, v0, :cond_25

    .line 857
    .line 858
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 859
    .line 860
    .line 861
    move-result v4

    .line 862
    int-to-char v5, v4

    .line 863
    const/4 v6, 0x2

    .line 864
    if-eq v5, v6, :cond_24

    .line 865
    .line 866
    const/4 v6, 0x3

    .line 867
    if-eq v5, v6, :cond_23

    .line 868
    .line 869
    const/4 v6, 0x4

    .line 870
    if-eq v5, v6, :cond_22

    .line 871
    .line 872
    invoke-static {p1, v4}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 873
    .line 874
    .line 875
    goto :goto_12

    .line 876
    :cond_22
    invoke-static {p1, v4}, LE2/a;->H(Landroid/os/Parcel;I)I

    .line 877
    .line 878
    .line 879
    move-result v2

    .line 880
    goto :goto_12

    .line 881
    :cond_23
    invoke-static {p1, v4}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 882
    .line 883
    .line 884
    move-result-object v3

    .line 885
    goto :goto_12

    .line 886
    :cond_24
    invoke-static {p1, v4}, LE2/a;->H(Landroid/os/Parcel;I)I

    .line 887
    .line 888
    .line 889
    move-result v1

    .line 890
    goto :goto_12

    .line 891
    :cond_25
    invoke-static {p1, v0}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 892
    .line 893
    .line 894
    new-instance p1, LV0/e;

    .line 895
    .line 896
    invoke-direct {p1, v1, v3, v2}, LV0/e;-><init>(ILjava/lang/String;I)V

    .line 897
    .line 898
    .line 899
    return-object p1

    .line 900
    :pswitch_1e
    invoke-static {p1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 901
    .line 902
    .line 903
    move-result v0

    .line 904
    const/4 v1, 0x0

    .line 905
    move-object v2, v1

    .line 906
    move-object v3, v2

    .line 907
    move-object v4, v3

    .line 908
    move-object v5, v4

    .line 909
    :goto_13
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 910
    .line 911
    .line 912
    move-result v6

    .line 913
    if-ge v6, v0, :cond_2b

    .line 914
    .line 915
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 916
    .line 917
    .line 918
    move-result v6

    .line 919
    int-to-char v7, v6

    .line 920
    const/4 v8, 0x2

    .line 921
    if-eq v7, v8, :cond_2a

    .line 922
    .line 923
    const/4 v8, 0x3

    .line 924
    if-eq v7, v8, :cond_29

    .line 925
    .line 926
    const/4 v8, 0x4

    .line 927
    if-eq v7, v8, :cond_28

    .line 928
    .line 929
    const/4 v8, 0x5

    .line 930
    if-eq v7, v8, :cond_26

    .line 931
    .line 932
    invoke-static {p1, v6}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 933
    .line 934
    .line 935
    goto :goto_13

    .line 936
    :cond_26
    invoke-static {p1, v6}, LE2/a;->J(Landroid/os/Parcel;I)I

    .line 937
    .line 938
    .line 939
    move-result v5

    .line 940
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 941
    .line 942
    .line 943
    move-result v6

    .line 944
    if-nez v5, :cond_27

    .line 945
    .line 946
    move-object v5, v1

    .line 947
    goto :goto_13

    .line 948
    :cond_27
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    .line 949
    .line 950
    .line 951
    move-result-object v7

    .line 952
    add-int/2addr v6, v5

    .line 953
    invoke-virtual {p1, v6}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 954
    .line 955
    .line 956
    move-object v5, v7

    .line 957
    goto :goto_13

    .line 958
    :cond_28
    invoke-static {p1, v6}, LE2/a;->g(Landroid/os/Parcel;I)[B

    .line 959
    .line 960
    .line 961
    move-result-object v4

    .line 962
    goto :goto_13

    .line 963
    :cond_29
    invoke-static {p1, v6}, LE2/a;->g(Landroid/os/Parcel;I)[B

    .line 964
    .line 965
    .line 966
    move-result-object v3

    .line 967
    goto :goto_13

    .line 968
    :cond_2a
    invoke-static {p1, v6}, LE2/a;->g(Landroid/os/Parcel;I)[B

    .line 969
    .line 970
    .line 971
    move-result-object v2

    .line 972
    goto :goto_13

    .line 973
    :cond_2b
    invoke-static {p1, v0}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 974
    .line 975
    .line 976
    new-instance p1, LV0/d;

    .line 977
    .line 978
    invoke-direct {p1, v2, v3, v4, v5}, LV0/d;-><init>([B[B[B[Ljava/lang/String;)V

    .line 979
    .line 980
    .line 981
    return-object p1

    .line 982
    :pswitch_1f
    invoke-static {p1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 983
    .line 984
    .line 985
    move-result v0

    .line 986
    const/4 v1, 0x0

    .line 987
    move-object v3, v1

    .line 988
    move-object v4, v3

    .line 989
    move-object v5, v4

    .line 990
    move-object v6, v5

    .line 991
    move-object v7, v6

    .line 992
    :goto_14
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 993
    .line 994
    .line 995
    move-result v1

    .line 996
    if-ge v1, v0, :cond_31

    .line 997
    .line 998
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 999
    .line 1000
    .line 1001
    move-result v1

    .line 1002
    int-to-char v2, v1

    .line 1003
    const/4 v8, 0x2

    .line 1004
    if-eq v2, v8, :cond_30

    .line 1005
    .line 1006
    const/4 v8, 0x3

    .line 1007
    if-eq v2, v8, :cond_2f

    .line 1008
    .line 1009
    const/4 v8, 0x4

    .line 1010
    if-eq v2, v8, :cond_2e

    .line 1011
    .line 1012
    const/4 v8, 0x5

    .line 1013
    if-eq v2, v8, :cond_2d

    .line 1014
    .line 1015
    const/4 v8, 0x6

    .line 1016
    if-eq v2, v8, :cond_2c

    .line 1017
    .line 1018
    invoke-static {p1, v1}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 1019
    .line 1020
    .line 1021
    goto :goto_14

    .line 1022
    :cond_2c
    invoke-static {p1, v1}, LE2/a;->g(Landroid/os/Parcel;I)[B

    .line 1023
    .line 1024
    .line 1025
    move-result-object v7

    .line 1026
    goto :goto_14

    .line 1027
    :cond_2d
    invoke-static {p1, v1}, LE2/a;->g(Landroid/os/Parcel;I)[B

    .line 1028
    .line 1029
    .line 1030
    move-result-object v6

    .line 1031
    goto :goto_14

    .line 1032
    :cond_2e
    invoke-static {p1, v1}, LE2/a;->g(Landroid/os/Parcel;I)[B

    .line 1033
    .line 1034
    .line 1035
    move-result-object v5

    .line 1036
    goto :goto_14

    .line 1037
    :cond_2f
    invoke-static {p1, v1}, LE2/a;->g(Landroid/os/Parcel;I)[B

    .line 1038
    .line 1039
    .line 1040
    move-result-object v4

    .line 1041
    goto :goto_14

    .line 1042
    :cond_30
    invoke-static {p1, v1}, LE2/a;->g(Landroid/os/Parcel;I)[B

    .line 1043
    .line 1044
    .line 1045
    move-result-object v3

    .line 1046
    goto :goto_14

    .line 1047
    :cond_31
    invoke-static {p1, v0}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 1048
    .line 1049
    .line 1050
    new-instance v2, LV0/c;

    .line 1051
    .line 1052
    invoke-direct/range {v2 .. v7}, LV0/c;-><init>([B[B[B[B[B)V

    .line 1053
    .line 1054
    .line 1055
    return-object v2

    .line 1056
    :pswitch_20
    invoke-static {p1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 1057
    .line 1058
    .line 1059
    move-result v0

    .line 1060
    const/4 v1, 0x0

    .line 1061
    const/4 v2, 0x0

    .line 1062
    move-object v3, v1

    .line 1063
    :goto_15
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1064
    .line 1065
    .line 1066
    move-result v4

    .line 1067
    if-ge v4, v0, :cond_34

    .line 1068
    .line 1069
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 1070
    .line 1071
    .line 1072
    move-result v4

    .line 1073
    int-to-char v5, v4

    .line 1074
    const/4 v6, 0x1

    .line 1075
    if-eq v5, v6, :cond_33

    .line 1076
    .line 1077
    const/4 v6, 0x2

    .line 1078
    if-eq v5, v6, :cond_32

    .line 1079
    .line 1080
    invoke-static {p1, v4}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 1081
    .line 1082
    .line 1083
    goto :goto_15

    .line 1084
    :cond_32
    invoke-static {p1, v4}, LE2/a;->g(Landroid/os/Parcel;I)[B

    .line 1085
    .line 1086
    .line 1087
    move-result-object v3

    .line 1088
    goto :goto_15

    .line 1089
    :cond_33
    invoke-static {p1, v4}, LE2/a;->G(Landroid/os/Parcel;I)Z

    .line 1090
    .line 1091
    .line 1092
    move-result v2

    .line 1093
    goto :goto_15

    .line 1094
    :cond_34
    invoke-static {p1, v0}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 1095
    .line 1096
    .line 1097
    new-instance p1, LV0/n;

    .line 1098
    .line 1099
    if-nez v3, :cond_35

    .line 1100
    .line 1101
    goto :goto_16

    .line 1102
    :cond_35
    array-length v0, v3

    .line 1103
    invoke-static {v3, v0}, Lb1/J;->i([BI)Lb1/J;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v1

    .line 1107
    :goto_16
    invoke-direct {p1, v2, v1}, LV0/n;-><init>(ZLb1/J;)V

    .line 1108
    .line 1109
    .line 1110
    return-object p1

    .line 1111
    :pswitch_21
    invoke-static {p1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 1112
    .line 1113
    .line 1114
    move-result v0

    .line 1115
    const/4 v1, 0x0

    .line 1116
    move-object v2, v1

    .line 1117
    move-object v3, v2

    .line 1118
    :goto_17
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1119
    .line 1120
    .line 1121
    move-result v4

    .line 1122
    if-ge v4, v0, :cond_38

    .line 1123
    .line 1124
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 1125
    .line 1126
    .line 1127
    move-result v4

    .line 1128
    int-to-char v5, v4

    .line 1129
    const/4 v6, 0x1

    .line 1130
    if-eq v5, v6, :cond_37

    .line 1131
    .line 1132
    const/4 v6, 0x2

    .line 1133
    if-eq v5, v6, :cond_36

    .line 1134
    .line 1135
    invoke-static {p1, v4}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 1136
    .line 1137
    .line 1138
    goto :goto_17

    .line 1139
    :cond_36
    invoke-static {p1, v4}, LE2/a;->g(Landroid/os/Parcel;I)[B

    .line 1140
    .line 1141
    .line 1142
    move-result-object v3

    .line 1143
    goto :goto_17

    .line 1144
    :cond_37
    invoke-static {p1, v4}, LE2/a;->g(Landroid/os/Parcel;I)[B

    .line 1145
    .line 1146
    .line 1147
    move-result-object v2

    .line 1148
    goto :goto_17

    .line 1149
    :cond_38
    invoke-static {p1, v0}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 1150
    .line 1151
    .line 1152
    new-instance p1, LV0/m;

    .line 1153
    .line 1154
    if-nez v2, :cond_39

    .line 1155
    .line 1156
    move-object v0, v1

    .line 1157
    goto :goto_18

    .line 1158
    :cond_39
    array-length v0, v2

    .line 1159
    invoke-static {v2, v0}, Lb1/J;->i([BI)Lb1/J;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v0

    .line 1163
    :goto_18
    if-nez v3, :cond_3a

    .line 1164
    .line 1165
    goto :goto_19

    .line 1166
    :cond_3a
    array-length v1, v3

    .line 1167
    invoke-static {v3, v1}, Lb1/J;->i([BI)Lb1/J;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v1

    .line 1171
    :goto_19
    invoke-direct {p1, v0, v1}, LV0/m;-><init>(Lb1/J;Lb1/J;)V

    .line 1172
    .line 1173
    .line 1174
    return-object p1

    .line 1175
    :pswitch_22
    invoke-static {p1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 1176
    .line 1177
    .line 1178
    move-result v0

    .line 1179
    const/4 v1, 0x0

    .line 1180
    :goto_1a
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1181
    .line 1182
    .line 1183
    move-result v2

    .line 1184
    if-ge v2, v0, :cond_3c

    .line 1185
    .line 1186
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 1187
    .line 1188
    .line 1189
    move-result v2

    .line 1190
    int-to-char v3, v2

    .line 1191
    const/4 v4, 0x1

    .line 1192
    if-eq v3, v4, :cond_3b

    .line 1193
    .line 1194
    invoke-static {p1, v2}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 1195
    .line 1196
    .line 1197
    goto :goto_1a

    .line 1198
    :cond_3b
    invoke-static {p1, v2}, LE2/a;->G(Landroid/os/Parcel;I)Z

    .line 1199
    .line 1200
    .line 1201
    move-result v1

    .line 1202
    goto :goto_1a

    .line 1203
    :cond_3c
    invoke-static {p1, v0}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 1204
    .line 1205
    .line 1206
    new-instance p1, LV0/b;

    .line 1207
    .line 1208
    invoke-direct {p1, v1}, LV0/b;-><init>(Z)V

    .line 1209
    .line 1210
    .line 1211
    return-object p1

    .line 1212
    nop

    .line 1213
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
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

    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, LV0/l;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p1, p1, [Lb0/N;

    .line 7
    .line 8
    return-object p1

    .line 9
    :pswitch_0
    new-array p1, p1, [Lb0/J;

    .line 10
    .line 11
    return-object p1

    .line 12
    :pswitch_1
    new-array p1, p1, [Lb0/E;

    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_2
    new-array p1, p1, [Lb0/c;

    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_3
    new-array p1, p1, [Lb0/b;

    .line 19
    .line 20
    return-object p1

    .line 21
    :pswitch_4
    new-array p1, p1, [LW0/q;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_5
    new-array p1, p1, [LW0/p;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_6
    new-array p1, p1, [LW0/o;

    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_7
    new-array p1, p1, [LW0/n;

    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_8
    new-array p1, p1, [LW0/m;

    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_9
    new-array p1, p1, [LW0/l;

    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_a
    new-array p1, p1, [LW0/k;

    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_b
    new-array p1, p1, [Lcom/google/android/gms/identitycredentials/GetCredentialRequest;

    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_c
    new-array p1, p1, [LW0/j;

    .line 46
    .line 47
    return-object p1

    .line 48
    :pswitch_d
    new-array p1, p1, [LW0/i;

    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_e
    new-array p1, p1, [LW0/h;

    .line 52
    .line 53
    return-object p1

    .line 54
    :pswitch_f
    new-array p1, p1, [LW0/g;

    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_10
    new-array p1, p1, [LW0/f;

    .line 58
    .line 59
    return-object p1

    .line 60
    :pswitch_11
    new-array p1, p1, [LW0/e;

    .line 61
    .line 62
    return-object p1

    .line 63
    :pswitch_12
    new-array p1, p1, [LW0/d;

    .line 64
    .line 65
    return-object p1

    .line 66
    :pswitch_13
    new-array p1, p1, [LW0/c;

    .line 67
    .line 68
    return-object p1

    .line 69
    :pswitch_14
    new-array p1, p1, [LW0/b;

    .line 70
    .line 71
    return-object p1

    .line 72
    :pswitch_15
    new-array p1, p1, [LW0/a;

    .line 73
    .line 74
    return-object p1

    .line 75
    :pswitch_16
    new-array p1, p1, [LV0/h;

    .line 76
    .line 77
    return-object p1

    .line 78
    :pswitch_17
    new-array p1, p1, [LV0/e;

    .line 79
    .line 80
    return-object p1

    .line 81
    :pswitch_18
    new-array p1, p1, [LV0/d;

    .line 82
    .line 83
    return-object p1

    .line 84
    :pswitch_19
    new-array p1, p1, [LV0/c;

    .line 85
    .line 86
    return-object p1

    .line 87
    :pswitch_1a
    new-array p1, p1, [LV0/n;

    .line 88
    .line 89
    return-object p1

    .line 90
    :pswitch_1b
    new-array p1, p1, [LV0/m;

    .line 91
    .line 92
    return-object p1

    .line 93
    :pswitch_1c
    new-array p1, p1, [LV0/b;

    .line 94
    .line 95
    return-object p1

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
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

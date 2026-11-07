.class public final Lj1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC1/m;
.implements Ly1/b;
.implements Lz1/a;


# instance fields
.field public k:Lz1/b;

.field public l:Lj1/c;

.field public m:Landroid/app/Application;

.field public n:Ly1/a;

.field public o:Landroidx/lifecycle/n;

.field public p:Lj1/d;

.field public q:Landroid/app/Activity;

.field public r:LB1/s;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final k(LA/c;LB1/o;)V
    .locals 10

    .line 1
    const-string v1, "*/*"

    .line 2
    .line 3
    const-string v0, "call"

    .line 4
    .line 5
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lj1/e;->q:Landroid/app/Activity;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const-string p1, "no_activity"

    .line 14
    .line 15
    const-string v0, "file picker plugin requires a foreground activity"

    .line 16
    .line 17
    invoke-virtual {p2, p1, v0, v2}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    new-instance v9, LB1/o;

    .line 22
    .line 23
    invoke-direct {v9, p2}, LB1/o;-><init>(LB1/o;)V

    .line 24
    .line 25
    .line 26
    iget-object p2, p1, LA/c;->m:Ljava/lang/Object;

    .line 27
    .line 28
    instance-of v0, p2, Ljava/util/HashMap;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    check-cast p2, Ljava/util/HashMap;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move-object p2, v2

    .line 36
    :goto_0
    iget-object p1, p1, LA/c;->l:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p1, Ljava/lang/String;

    .line 39
    .line 40
    const-string v0, "compressionQuality"

    .line 41
    .line 42
    const-string v3, "withData"

    .line 43
    .line 44
    const-string v4, "allowMultipleSelection"

    .line 45
    .line 46
    const-string v5, "allowedExtensions"

    .line 47
    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    const v7, -0x5069748f

    .line 55
    .line 56
    .line 57
    if-eq v6, v7, :cond_17

    .line 58
    .line 59
    const v7, 0x35c17d

    .line 60
    .line 61
    .line 62
    if-eq v6, v7, :cond_6

    .line 63
    .line 64
    const v1, 0x5a5b64d

    .line 65
    .line 66
    .line 67
    if-eq v6, v1, :cond_3

    .line 68
    .line 69
    :cond_2
    :goto_1
    move-object v1, v3

    .line 70
    move-object v6, v4

    .line 71
    goto/16 :goto_10

    .line 72
    .line 73
    :cond_3
    const-string v1, "clear"

    .line 74
    .line 75
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-nez v1, :cond_4

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_4
    iget-object p1, p0, Lj1/e;->q:Landroid/app/Activity;

    .line 83
    .line 84
    if-eqz p1, :cond_5

    .line 85
    .line 86
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-eqz p1, :cond_5

    .line 91
    .line 92
    :try_start_0
    new-instance p2, Ljava/io/File;

    .line 93
    .line 94
    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {p1}, Ljava/io/File;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    new-instance v0, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string p1, "/file_picker/"

    .line 111
    .line 112
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-direct {p2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-static {p2}, Lj1/h;->i(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 123
    .line 124
    .line 125
    const/4 p1, 0x1

    .line 126
    goto :goto_2

    .line 127
    :catch_0
    move-exception v0

    .line 128
    move-object p1, v0

    .line 129
    new-instance p2, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    const-string v0, "There was an error while clearing cached files: "

    .line 132
    .line 133
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    const-string p2, "FilePickerUtils"

    .line 144
    .line 145
    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 146
    .line 147
    .line 148
    const/4 p1, 0x0

    .line 149
    :goto_2
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    :cond_5
    invoke-virtual {v9, v2}, LB1/o;->d(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    goto/16 :goto_14

    .line 157
    .line 158
    :cond_6
    const-string v6, "save"

    .line 159
    .line 160
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v6

    .line 164
    if-nez v6, :cond_7

    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_7
    if-eqz p2, :cond_8

    .line 168
    .line 169
    const-string p1, "fileType"

    .line 170
    .line 171
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    goto :goto_3

    .line 176
    :cond_8
    move-object p1, v2

    .line 177
    :goto_3
    const-string v0, "null cannot be cast to non-null type kotlin.String"

    .line 178
    .line 179
    invoke-static {p1, v0}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    check-cast p1, Ljava/lang/String;

    .line 183
    .line 184
    invoke-static {p1}, Lj1/h;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    if-eqz p2, :cond_9

    .line 189
    .line 190
    const-string v0, "initialDirectory"

    .line 191
    .line 192
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    goto :goto_4

    .line 197
    :cond_9
    move-object v0, v2

    .line 198
    :goto_4
    move-object v3, v0

    .line 199
    check-cast v3, Ljava/lang/String;

    .line 200
    .line 201
    if-eqz p2, :cond_a

    .line 202
    .line 203
    const-string v0, "bytes"

    .line 204
    .line 205
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    goto :goto_5

    .line 210
    :cond_a
    move-object v0, v2

    .line 211
    :goto_5
    check-cast v0, [B

    .line 212
    .line 213
    if-eqz p2, :cond_b

    .line 214
    .line 215
    const-string v4, "fileName"

    .line 216
    .line 217
    invoke-interface {p2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object p2

    .line 221
    goto :goto_6

    .line 222
    :cond_b
    move-object p2, v2

    .line 223
    :goto_6
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object p2

    .line 227
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 228
    .line 229
    .line 230
    move-result v4

    .line 231
    if-lez v4, :cond_c

    .line 232
    .line 233
    const-string v4, "."

    .line 234
    .line 235
    invoke-static {p2, v4}, Lh2/d;->Y(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 236
    .line 237
    .line 238
    move-result v5

    .line 239
    if-nez v5, :cond_c

    .line 240
    .line 241
    new-instance v5, Lorg/apache/tika/Tika;

    .line 242
    .line 243
    invoke-direct {v5}, Lorg/apache/tika/Tika;-><init>()V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v5, v0}, Lorg/apache/tika/Tika;->detect([B)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v5

    .line 250
    invoke-static {v5}, La2/h;->b(Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    const-string v6, "/"

    .line 254
    .line 255
    invoke-static {v5, v6}, Lh2/d;->g0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v5

    .line 259
    new-instance v6, Ljava/lang/StringBuilder;

    .line 260
    .line 261
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object p2

    .line 277
    :cond_c
    iget-object v4, p0, Lj1/e;->l:Lj1/c;

    .line 278
    .line 279
    if-eqz v4, :cond_22

    .line 280
    .line 281
    iget-object v5, v4, Lj1/c;->k:Landroid/app/Activity;

    .line 282
    .line 283
    iget-object v6, v4, Lj1/c;->l:LB1/o;

    .line 284
    .line 285
    if-nez v6, :cond_16

    .line 286
    .line 287
    iput-object v9, v4, Lj1/c;->l:LB1/o;

    .line 288
    .line 289
    new-instance v2, Landroid/content/Intent;

    .line 290
    .line 291
    const-string v6, "android.intent.action.CREATE_DOCUMENT"

    .line 292
    .line 293
    invoke-direct {v2, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    const-string v6, "android.intent.category.OPENABLE"

    .line 297
    .line 298
    invoke-virtual {v2, v6}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 299
    .line 300
    .line 301
    if-eqz p2, :cond_e

    .line 302
    .line 303
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 304
    .line 305
    .line 306
    move-result v6

    .line 307
    if-nez v6, :cond_d

    .line 308
    .line 309
    goto :goto_7

    .line 310
    :cond_d
    const-string v6, "android.intent.extra.TITLE"

    .line 311
    .line 312
    invoke-virtual {v2, v6, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 313
    .line 314
    .line 315
    :cond_e
    :goto_7
    iput-object v0, v4, Lj1/c;->s:[B

    .line 316
    .line 317
    const-string v6, "dir"

    .line 318
    .line 319
    invoke-virtual {v6, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    move-result p1

    .line 323
    const-string v6, "FilePickerDelegate"

    .line 324
    .line 325
    if-nez p1, :cond_12

    .line 326
    .line 327
    :try_start_1
    new-instance p1, Lorg/apache/tika/Tika;

    .line 328
    .line 329
    invoke-direct {p1}, Lorg/apache/tika/Tika;-><init>()V

    .line 330
    .line 331
    .line 332
    if-eqz p2, :cond_10

    .line 333
    .line 334
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 335
    .line 336
    .line 337
    move-result v7

    .line 338
    if-nez v7, :cond_f

    .line 339
    .line 340
    goto :goto_8

    .line 341
    :cond_f
    invoke-virtual {p1}, Lorg/apache/tika/Tika;->getDetector()Lorg/apache/tika/detect/Detector;

    .line 342
    .line 343
    .line 344
    move-result-object p1

    .line 345
    invoke-static {v0}, Lorg/apache/tika/io/TikaInputStream;->get([B)Lorg/apache/tika/io/TikaInputStream;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    new-instance v7, Lorg/apache/tika/metadata/Metadata;

    .line 350
    .line 351
    invoke-direct {v7}, Lorg/apache/tika/metadata/Metadata;-><init>()V

    .line 352
    .line 353
    .line 354
    const-string v8, "resourceName"

    .line 355
    .line 356
    invoke-virtual {v7, v8, p2}, Lorg/apache/tika/metadata/Metadata;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    invoke-interface {p1, v0, v7}, Lorg/apache/tika/detect/Detector;->detect(Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;)Lorg/apache/tika/mime/MediaType;

    .line 360
    .line 361
    .line 362
    move-result-object p1

    .line 363
    invoke-virtual {p1}, Lorg/apache/tika/mime/MediaType;->toString()Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object p1

    .line 367
    goto :goto_9

    .line 368
    :cond_10
    :goto_8
    invoke-virtual {p1, v0}, Lorg/apache/tika/Tika;->detect([B)Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object p1

    .line 372
    :goto_9
    const-string p2, "text/plain"

    .line 373
    .line 374
    invoke-static {p1, p2}, La2/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    move-result p2

    .line 378
    if-eqz p2, :cond_11

    .line 379
    .line 380
    move-object p1, v1

    .line 381
    goto :goto_a

    .line 382
    :cond_11
    invoke-static {p1}, La2/h;->b(Ljava/lang/Object;)V

    .line 383
    .line 384
    .line 385
    :goto_a
    invoke-virtual {v2, p1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 386
    .line 387
    .line 388
    goto :goto_b

    .line 389
    :catchall_0
    move-exception v0

    .line 390
    move-object p1, v0

    .line 391
    invoke-virtual {v2, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 392
    .line 393
    .line 394
    new-instance p2, Ljava/lang/StringBuilder;

    .line 395
    .line 396
    const-string v0, "Failed to detect mime type. "

    .line 397
    .line 398
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object p1

    .line 408
    invoke-static {v6, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 409
    .line 410
    .line 411
    :cond_12
    :goto_b
    if-eqz v3, :cond_14

    .line 412
    .line 413
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 414
    .line 415
    .line 416
    move-result p1

    .line 417
    if-nez p1, :cond_13

    .line 418
    .line 419
    goto :goto_c

    .line 420
    :cond_13
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 421
    .line 422
    const/16 p2, 0x1a

    .line 423
    .line 424
    if-lt p1, p2, :cond_14

    .line 425
    .line 426
    const-string p1, "android.provider.extra.INITIAL_URI"

    .line 427
    .line 428
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 429
    .line 430
    .line 431
    move-result-object p2

    .line 432
    invoke-virtual {v2, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 433
    .line 434
    .line 435
    :cond_14
    :goto_c
    invoke-virtual {v5}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 436
    .line 437
    .line 438
    move-result-object p1

    .line 439
    invoke-virtual {v2, p1}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    .line 440
    .line 441
    .line 442
    move-result-object p1

    .line 443
    if-eqz p1, :cond_15

    .line 444
    .line 445
    sget p1, Lj1/c;->u:I

    .line 446
    .line 447
    invoke-virtual {v5, v2, p1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 448
    .line 449
    .line 450
    goto/16 :goto_14

    .line 451
    .line 452
    :cond_15
    const-string p1, "Can\'t find a valid activity to handle the request. Make sure you\'ve a file explorer installed."

    .line 453
    .line 454
    invoke-static {v6, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 455
    .line 456
    .line 457
    const-string p1, "invalid_format_type"

    .line 458
    .line 459
    const-string p2, "Can\'t handle the provided file type."

    .line 460
    .line 461
    invoke-virtual {v4, p1, p2}, Lj1/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    goto/16 :goto_14

    .line 465
    .line 466
    :cond_16
    sget p1, Lj1/c;->t:I

    .line 467
    .line 468
    const-string p1, "already_active"

    .line 469
    .line 470
    const-string p2, "File picker is already active"

    .line 471
    .line 472
    invoke-virtual {v9, p1, p2, v2}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 473
    .line 474
    .line 475
    goto/16 :goto_14

    .line 476
    .line 477
    :cond_17
    const-string v1, "custom"

    .line 478
    .line 479
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 480
    .line 481
    .line 482
    move-result v1

    .line 483
    if-nez v1, :cond_18

    .line 484
    .line 485
    goto/16 :goto_1

    .line 486
    .line 487
    :cond_18
    if-eqz p2, :cond_19

    .line 488
    .line 489
    invoke-interface {p2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v1

    .line 493
    goto :goto_d

    .line 494
    :cond_19
    move-object v1, v2

    .line 495
    :goto_d
    check-cast v1, Ljava/util/ArrayList;

    .line 496
    .line 497
    invoke-static {v1}, Lj1/h;->h(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 498
    .line 499
    .line 500
    move-result-object v7

    .line 501
    move-object v1, v3

    .line 502
    iget-object v3, p0, Lj1/e;->l:Lj1/c;

    .line 503
    .line 504
    if-eqz v3, :cond_22

    .line 505
    .line 506
    move-object v6, v4

    .line 507
    invoke-static {p1}, Lj1/h;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v4

    .line 511
    if-eqz p2, :cond_1a

    .line 512
    .line 513
    invoke-interface {p2, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object p1

    .line 517
    goto :goto_e

    .line 518
    :cond_1a
    move-object p1, v2

    .line 519
    :goto_e
    move-object v5, p1

    .line 520
    check-cast v5, Ljava/lang/Boolean;

    .line 521
    .line 522
    if-eqz p2, :cond_1b

    .line 523
    .line 524
    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object p1

    .line 528
    goto :goto_f

    .line 529
    :cond_1b
    move-object p1, v2

    .line 530
    :goto_f
    move-object v6, p1

    .line 531
    check-cast v6, Ljava/lang/Boolean;

    .line 532
    .line 533
    if-eqz p2, :cond_1c

    .line 534
    .line 535
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v2

    .line 539
    :cond_1c
    move-object v8, v2

    .line 540
    check-cast v8, Ljava/lang/Integer;

    .line 541
    .line 542
    invoke-static/range {v3 .. v9}, Lj1/h;->j(Lj1/c;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/ArrayList;Ljava/lang/Integer;LB1/o;)V

    .line 543
    .line 544
    .line 545
    return-void

    .line 546
    :goto_10
    invoke-static {p1}, La2/h;->b(Ljava/lang/Object;)V

    .line 547
    .line 548
    .line 549
    invoke-static {p1}, Lj1/h;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object v4

    .line 553
    if-nez v4, :cond_1d

    .line 554
    .line 555
    invoke-virtual {v9}, LB1/o;->b()V

    .line 556
    .line 557
    .line 558
    return-void

    .line 559
    :cond_1d
    iget-object v3, p0, Lj1/e;->l:Lj1/c;

    .line 560
    .line 561
    if-eqz v3, :cond_22

    .line 562
    .line 563
    if-eqz p2, :cond_1e

    .line 564
    .line 565
    invoke-interface {p2, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    move-result-object p1

    .line 569
    goto :goto_11

    .line 570
    :cond_1e
    move-object p1, v2

    .line 571
    :goto_11
    check-cast p1, Ljava/lang/Boolean;

    .line 572
    .line 573
    if-eqz p2, :cond_1f

    .line 574
    .line 575
    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 576
    .line 577
    .line 578
    move-result-object v1

    .line 579
    goto :goto_12

    .line 580
    :cond_1f
    move-object v1, v2

    .line 581
    :goto_12
    move-object v6, v1

    .line 582
    check-cast v6, Ljava/lang/Boolean;

    .line 583
    .line 584
    if-eqz p2, :cond_20

    .line 585
    .line 586
    invoke-interface {p2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object v1

    .line 590
    goto :goto_13

    .line 591
    :cond_20
    move-object v1, v2

    .line 592
    :goto_13
    check-cast v1, Ljava/util/ArrayList;

    .line 593
    .line 594
    invoke-static {v1}, Lj1/h;->h(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 595
    .line 596
    .line 597
    move-result-object v7

    .line 598
    if-eqz p2, :cond_21

    .line 599
    .line 600
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 601
    .line 602
    .line 603
    move-result-object v2

    .line 604
    :cond_21
    move-object v8, v2

    .line 605
    check-cast v8, Ljava/lang/Integer;

    .line 606
    .line 607
    move-object v5, p1

    .line 608
    invoke-static/range {v3 .. v9}, Lj1/h;->j(Lj1/c;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/ArrayList;Ljava/lang/Integer;LB1/o;)V

    .line 609
    .line 610
    .line 611
    :cond_22
    :goto_14
    return-void
.end method

.method public final onAttachedToActivity(Lz1/b;)V
    .locals 5

    .line 1
    const-string v0, "binding"

    .line 2
    .line 3
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lj1/e;->k:Lz1/b;

    .line 7
    .line 8
    iget-object p1, p0, Lj1/e;->n:Ly1/a;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget-object v0, p1, Ly1/a;->c:LC1/f;

    .line 13
    .line 14
    const-string v1, "getBinaryMessenger(...)"

    .line 15
    .line 16
    invoke-static {v0, v1}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p1, Ly1/a;->a:Landroid/content/Context;

    .line 20
    .line 21
    const-string v1, "null cannot be cast to non-null type android.app.Application"

    .line 22
    .line 23
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    check-cast p1, Landroid/app/Application;

    .line 27
    .line 28
    iget-object v1, p0, Lj1/e;->k:Lz1/b;

    .line 29
    .line 30
    invoke-static {v1}, La2/h;->b(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    check-cast v1, Lk/u0;

    .line 34
    .line 35
    iget-object v1, v1, Lk/u0;->a:Landroid/content/Context;

    .line 36
    .line 37
    check-cast v1, Landroid/app/Activity;

    .line 38
    .line 39
    const-string v2, "getActivity(...)"

    .line 40
    .line 41
    invoke-static {v1, v2}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget-object v2, p0, Lj1/e;->k:Lz1/b;

    .line 45
    .line 46
    invoke-static {v2}, La2/h;->b(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iput-object v1, p0, Lj1/e;->q:Landroid/app/Activity;

    .line 50
    .line 51
    iput-object p1, p0, Lj1/e;->m:Landroid/app/Application;

    .line 52
    .line 53
    new-instance p1, Lj1/c;

    .line 54
    .line 55
    invoke-direct {p1, v1}, Lj1/c;-><init>(Landroid/app/Activity;)V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, Lj1/e;->l:Lj1/c;

    .line 59
    .line 60
    new-instance p1, LB1/s;

    .line 61
    .line 62
    const-string v3, "miguelruivo.flutter.plugins.filepicker"

    .line 63
    .line 64
    invoke-direct {p1, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    iput-object p1, p0, Lj1/e;->r:LB1/s;

    .line 68
    .line 69
    invoke-virtual {p1, p0}, LB1/s;->z(LC1/m;)V

    .line 70
    .line 71
    .line 72
    iget-object p1, p0, Lj1/e;->l:Lj1/c;

    .line 73
    .line 74
    if-eqz p1, :cond_0

    .line 75
    .line 76
    new-instance v3, LA0/j;

    .line 77
    .line 78
    const-string v4, "miguelruivo.flutter.plugins.filepickerevent"

    .line 79
    .line 80
    invoke-direct {v3, v0, v4}, LA0/j;-><init>(LC1/f;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    new-instance v0, LB1/g;

    .line 84
    .line 85
    const/16 v4, 0xe

    .line 86
    .line 87
    invoke-direct {v0, p1, v4}, LB1/g;-><init>(Ljava/lang/Object;I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v3, v0}, LA0/j;->L(LC1/h;)V

    .line 91
    .line 92
    .line 93
    new-instance v0, Lj1/d;

    .line 94
    .line 95
    invoke-direct {v0, v1}, Lj1/d;-><init>(Landroid/app/Activity;)V

    .line 96
    .line 97
    .line 98
    iput-object v0, p0, Lj1/e;->p:Lj1/d;

    .line 99
    .line 100
    check-cast v2, Lk/u0;

    .line 101
    .line 102
    invoke-virtual {v2, p1}, Lk/u0;->a(LC1/o;)V

    .line 103
    .line 104
    .line 105
    iget-object p1, v2, Lk/u0;->b:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast p1, Lio/flutter/embedding/engine/plugins/lifecycle/HiddenLifecycleReference;

    .line 108
    .line 109
    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/lifecycle/HiddenLifecycleReference;->getLifecycle()Landroidx/lifecycle/n;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    iput-object p1, p0, Lj1/e;->o:Landroidx/lifecycle/n;

    .line 114
    .line 115
    iget-object v0, p0, Lj1/e;->p:Lj1/d;

    .line 116
    .line 117
    if-eqz v0, :cond_0

    .line 118
    .line 119
    if-eqz p1, :cond_0

    .line 120
    .line 121
    invoke-virtual {p1, v0}, Landroidx/lifecycle/n;->a(Landroidx/lifecycle/r;)V

    .line 122
    .line 123
    .line 124
    :cond_0
    return-void
.end method

.method public final onAttachedToEngine(Ly1/a;)V
    .locals 1

    .line 1
    const-string v0, "binding"

    .line 2
    .line 3
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lj1/e;->n:Ly1/a;

    .line 7
    .line 8
    return-void
.end method

.method public final onDetachedFromActivity()V
    .locals 3

    .line 1
    iget-object v0, p0, Lj1/e;->l:Lj1/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lj1/e;->k:Lz1/b;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v1, Lk/u0;

    .line 10
    .line 11
    iget-object v1, v1, Lk/u0;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Ljava/util/HashSet;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    iput-object v0, p0, Lj1/e;->k:Lz1/b;

    .line 20
    .line 21
    iget-object v1, p0, Lj1/e;->p:Lj1/d;

    .line 22
    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    iget-object v2, p0, Lj1/e;->o:Landroidx/lifecycle/n;

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-virtual {v2, v1}, Landroidx/lifecycle/n;->b(Landroidx/lifecycle/r;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    iget-object v2, p0, Lj1/e;->m:Landroid/app/Application;

    .line 33
    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    invoke-virtual {v2, v1}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 37
    .line 38
    .line 39
    :cond_2
    iput-object v0, p0, Lj1/e;->o:Landroidx/lifecycle/n;

    .line 40
    .line 41
    iget-object v1, p0, Lj1/e;->l:Lj1/c;

    .line 42
    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    iput-object v0, v1, Lj1/c;->r:LC1/g;

    .line 46
    .line 47
    :cond_3
    iput-object v0, p0, Lj1/e;->l:Lj1/c;

    .line 48
    .line 49
    iget-object v1, p0, Lj1/e;->r:LB1/s;

    .line 50
    .line 51
    if-eqz v1, :cond_4

    .line 52
    .line 53
    invoke-virtual {v1, v0}, LB1/s;->z(LC1/m;)V

    .line 54
    .line 55
    .line 56
    :cond_4
    iput-object v0, p0, Lj1/e;->r:LB1/s;

    .line 57
    .line 58
    iput-object v0, p0, Lj1/e;->m:Landroid/app/Application;

    .line 59
    .line 60
    return-void
.end method

.method public final onDetachedFromActivityForConfigChanges()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lj1/e;->onDetachedFromActivity()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onDetachedFromEngine(Ly1/a;)V
    .locals 1

    .line 1
    const-string v0, "binding"

    .line 2
    .line 3
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lj1/e;->n:Ly1/a;

    .line 8
    .line 9
    return-void
.end method

.method public final onReattachedToActivityForConfigChanges(Lz1/b;)V
    .locals 1

    .line 1
    const-string v0, "binding"

    .line 2
    .line 3
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lj1/e;->onAttachedToActivity(Lz1/b;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.class public final Li/d;
.super Landroid/view/MenuInflater;
.source "SourceFile"


# static fields
.field public static final e:[Ljava/lang/Class;

.field public static final f:[Ljava/lang/Class;


# instance fields
.field public final a:[Ljava/lang/Object;

.field public final b:[Ljava/lang/Object;

.field public final c:Landroid/content/Context;

.field public d:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Landroid/content/Context;

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Li/d;->e:[Ljava/lang/Class;

    .line 8
    .line 9
    sput-object v0, Li/d;->f:[Ljava/lang/Class;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/view/MenuInflater;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li/d;->c:Landroid/content/Context;

    .line 5
    .line 6
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Li/d;->a:[Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p1, p0, Li/d;->b:[Ljava/lang/Object;

    .line 13
    .line 14
    return-void
.end method

.method public static a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p0, Landroid/app/Activity;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    instance-of v0, p0, Landroid/content/ContextWrapper;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    check-cast p0, Landroid/content/ContextWrapper;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Li/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :cond_1
    return-object p0
.end method


# virtual methods
.method public final b(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    new-instance v2, Li/c;

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    invoke-direct {v2, v0, v3}, Li/c;-><init>(Li/d;Landroid/view/Menu;)V

    .line 10
    .line 11
    .line 12
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    :goto_0
    const-string v4, "menu"

    .line 17
    .line 18
    const/4 v5, 0x2

    .line 19
    const/4 v6, 0x1

    .line 20
    if-ne v3, v5, :cond_1

    .line 21
    .line 22
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    if-eqz v7, :cond_0

    .line 31
    .line 32
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    new-instance v1, Ljava/lang/RuntimeException;

    .line 38
    .line 39
    const-string v2, "Expecting menu, got "

    .line 40
    .line 41
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v1

    .line 49
    :cond_1
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-ne v3, v6, :cond_18

    .line 54
    .line 55
    :goto_1
    const/4 v7, 0x0

    .line 56
    move v9, v7

    .line 57
    move v10, v9

    .line 58
    const/4 v11, 0x0

    .line 59
    :goto_2
    if-nez v9, :cond_17

    .line 60
    .line 61
    if-eq v3, v6, :cond_16

    .line 62
    .line 63
    const-string v12, "item"

    .line 64
    .line 65
    const-string v13, "group"

    .line 66
    .line 67
    const/4 v14, 0x3

    .line 68
    iget-object v15, v2, Li/c;->a:Landroid/view/Menu;

    .line 69
    .line 70
    if-eq v3, v5, :cond_7

    .line 71
    .line 72
    if-eq v3, v14, :cond_3

    .line 73
    .line 74
    :cond_2
    :goto_3
    move-object/from16 v8, p1

    .line 75
    .line 76
    goto :goto_4

    .line 77
    :cond_3
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    if-eqz v10, :cond_4

    .line 82
    .line 83
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v14

    .line 87
    if-eqz v14, :cond_4

    .line 88
    .line 89
    move-object/from16 v8, p1

    .line 90
    .line 91
    move v10, v7

    .line 92
    const/4 v5, 0x0

    .line 93
    const/4 v11, 0x0

    .line 94
    goto/16 :goto_d

    .line 95
    .line 96
    :cond_4
    invoke-virtual {v3, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v13

    .line 100
    if-eqz v13, :cond_5

    .line 101
    .line 102
    iput v7, v2, Li/c;->b:I

    .line 103
    .line 104
    iput v7, v2, Li/c;->c:I

    .line 105
    .line 106
    iput v7, v2, Li/c;->d:I

    .line 107
    .line 108
    iput v7, v2, Li/c;->e:I

    .line 109
    .line 110
    iput-boolean v6, v2, Li/c;->f:Z

    .line 111
    .line 112
    iput-boolean v6, v2, Li/c;->g:Z

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_5
    invoke-virtual {v3, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v12

    .line 119
    if-eqz v12, :cond_6

    .line 120
    .line 121
    iget-boolean v3, v2, Li/c;->h:Z

    .line 122
    .line 123
    if-nez v3, :cond_2

    .line 124
    .line 125
    iput-boolean v6, v2, Li/c;->h:Z

    .line 126
    .line 127
    iget v3, v2, Li/c;->b:I

    .line 128
    .line 129
    iget v12, v2, Li/c;->i:I

    .line 130
    .line 131
    iget v13, v2, Li/c;->j:I

    .line 132
    .line 133
    iget-object v14, v2, Li/c;->k:Ljava/lang/CharSequence;

    .line 134
    .line 135
    invoke-interface {v15, v3, v12, v13, v14}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    invoke-virtual {v2, v3}, Li/c;->b(Landroid/view/MenuItem;)V

    .line 140
    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_6
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    if-eqz v3, :cond_2

    .line 148
    .line 149
    move-object/from16 v8, p1

    .line 150
    .line 151
    move v9, v6

    .line 152
    :goto_4
    const/4 v5, 0x0

    .line 153
    goto/16 :goto_d

    .line 154
    .line 155
    :cond_7
    if-eqz v10, :cond_8

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_8
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    invoke-virtual {v3, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v13

    .line 166
    iget-object v8, v0, Li/d;->c:Landroid/content/Context;

    .line 167
    .line 168
    const/4 v5, 0x4

    .line 169
    if-eqz v13, :cond_9

    .line 170
    .line 171
    sget-object v3, Lf/a;->m:[I

    .line 172
    .line 173
    invoke-virtual {v8, v1, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    invoke-virtual {v3, v6, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 178
    .line 179
    .line 180
    move-result v8

    .line 181
    iput v8, v2, Li/c;->b:I

    .line 182
    .line 183
    invoke-virtual {v3, v14, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 184
    .line 185
    .line 186
    move-result v8

    .line 187
    iput v8, v2, Li/c;->c:I

    .line 188
    .line 189
    invoke-virtual {v3, v5, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    iput v5, v2, Li/c;->d:I

    .line 194
    .line 195
    const/4 v5, 0x5

    .line 196
    invoke-virtual {v3, v5, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 197
    .line 198
    .line 199
    move-result v5

    .line 200
    iput v5, v2, Li/c;->e:I

    .line 201
    .line 202
    const/4 v13, 0x2

    .line 203
    invoke-virtual {v3, v13, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 204
    .line 205
    .line 206
    move-result v5

    .line 207
    iput-boolean v5, v2, Li/c;->f:Z

    .line 208
    .line 209
    invoke-virtual {v3, v7, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 210
    .line 211
    .line 212
    move-result v5

    .line 213
    iput-boolean v5, v2, Li/c;->g:Z

    .line 214
    .line 215
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 216
    .line 217
    .line 218
    goto/16 :goto_3

    .line 219
    .line 220
    :cond_9
    const/4 v13, 0x2

    .line 221
    invoke-virtual {v3, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v12

    .line 225
    if-eqz v12, :cond_14

    .line 226
    .line 227
    sget-object v3, Lf/a;->n:[I

    .line 228
    .line 229
    invoke-virtual {v8, v1, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    invoke-virtual {v3, v13, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 234
    .line 235
    .line 236
    move-result v12

    .line 237
    iput v12, v2, Li/c;->i:I

    .line 238
    .line 239
    iget v12, v2, Li/c;->c:I

    .line 240
    .line 241
    const/4 v15, 0x5

    .line 242
    invoke-virtual {v3, v15, v12}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 243
    .line 244
    .line 245
    move-result v12

    .line 246
    const/4 v15, 0x6

    .line 247
    iget v13, v2, Li/c;->d:I

    .line 248
    .line 249
    invoke-virtual {v3, v15, v13}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 250
    .line 251
    .line 252
    move-result v13

    .line 253
    const/high16 v15, -0x10000

    .line 254
    .line 255
    and-int/2addr v12, v15

    .line 256
    const v15, 0xffff

    .line 257
    .line 258
    .line 259
    and-int/2addr v13, v15

    .line 260
    or-int/2addr v12, v13

    .line 261
    iput v12, v2, Li/c;->j:I

    .line 262
    .line 263
    const/4 v12, 0x7

    .line 264
    invoke-virtual {v3, v12}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 265
    .line 266
    .line 267
    move-result-object v12

    .line 268
    iput-object v12, v2, Li/c;->k:Ljava/lang/CharSequence;

    .line 269
    .line 270
    const/16 v12, 0x8

    .line 271
    .line 272
    invoke-virtual {v3, v12}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 273
    .line 274
    .line 275
    move-result-object v12

    .line 276
    iput-object v12, v2, Li/c;->l:Ljava/lang/CharSequence;

    .line 277
    .line 278
    invoke-virtual {v3, v7, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 279
    .line 280
    .line 281
    move-result v12

    .line 282
    iput v12, v2, Li/c;->m:I

    .line 283
    .line 284
    const/16 v12, 0x9

    .line 285
    .line 286
    invoke-virtual {v3, v12}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v12

    .line 290
    if-nez v12, :cond_a

    .line 291
    .line 292
    move v12, v7

    .line 293
    goto :goto_5

    .line 294
    :cond_a
    invoke-virtual {v12, v7}, Ljava/lang/String;->charAt(I)C

    .line 295
    .line 296
    .line 297
    move-result v12

    .line 298
    :goto_5
    iput-char v12, v2, Li/c;->n:C

    .line 299
    .line 300
    const/16 v12, 0x10

    .line 301
    .line 302
    const/16 v13, 0x1000

    .line 303
    .line 304
    invoke-virtual {v3, v12, v13}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 305
    .line 306
    .line 307
    move-result v12

    .line 308
    iput v12, v2, Li/c;->o:I

    .line 309
    .line 310
    const/16 v12, 0xa

    .line 311
    .line 312
    invoke-virtual {v3, v12}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v12

    .line 316
    if-nez v12, :cond_b

    .line 317
    .line 318
    move v12, v7

    .line 319
    goto :goto_6

    .line 320
    :cond_b
    invoke-virtual {v12, v7}, Ljava/lang/String;->charAt(I)C

    .line 321
    .line 322
    .line 323
    move-result v12

    .line 324
    :goto_6
    iput-char v12, v2, Li/c;->p:C

    .line 325
    .line 326
    const/16 v12, 0x14

    .line 327
    .line 328
    invoke-virtual {v3, v12, v13}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 329
    .line 330
    .line 331
    move-result v12

    .line 332
    iput v12, v2, Li/c;->q:I

    .line 333
    .line 334
    const/16 v12, 0xb

    .line 335
    .line 336
    invoke-virtual {v3, v12}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 337
    .line 338
    .line 339
    move-result v13

    .line 340
    if-eqz v13, :cond_c

    .line 341
    .line 342
    invoke-virtual {v3, v12, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 343
    .line 344
    .line 345
    move-result v12

    .line 346
    iput v12, v2, Li/c;->r:I

    .line 347
    .line 348
    goto :goto_7

    .line 349
    :cond_c
    iget v12, v2, Li/c;->e:I

    .line 350
    .line 351
    iput v12, v2, Li/c;->r:I

    .line 352
    .line 353
    :goto_7
    invoke-virtual {v3, v14, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 354
    .line 355
    .line 356
    move-result v12

    .line 357
    iput-boolean v12, v2, Li/c;->s:Z

    .line 358
    .line 359
    iget-boolean v12, v2, Li/c;->f:Z

    .line 360
    .line 361
    invoke-virtual {v3, v5, v12}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 362
    .line 363
    .line 364
    move-result v5

    .line 365
    iput-boolean v5, v2, Li/c;->t:Z

    .line 366
    .line 367
    iget-boolean v5, v2, Li/c;->g:Z

    .line 368
    .line 369
    invoke-virtual {v3, v6, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 370
    .line 371
    .line 372
    move-result v5

    .line 373
    iput-boolean v5, v2, Li/c;->u:Z

    .line 374
    .line 375
    const/16 v5, 0x15

    .line 376
    .line 377
    const/4 v12, -0x1

    .line 378
    invoke-virtual {v3, v5, v12}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 379
    .line 380
    .line 381
    move-result v5

    .line 382
    iput v5, v2, Li/c;->v:I

    .line 383
    .line 384
    const/16 v5, 0xc

    .line 385
    .line 386
    invoke-virtual {v3, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v5

    .line 390
    iput-object v5, v2, Li/c;->y:Ljava/lang/String;

    .line 391
    .line 392
    const/16 v5, 0xd

    .line 393
    .line 394
    invoke-virtual {v3, v5, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 395
    .line 396
    .line 397
    move-result v5

    .line 398
    iput v5, v2, Li/c;->w:I

    .line 399
    .line 400
    const/16 v5, 0xf

    .line 401
    .line 402
    invoke-virtual {v3, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v5

    .line 406
    iput-object v5, v2, Li/c;->x:Ljava/lang/String;

    .line 407
    .line 408
    const/16 v5, 0xe

    .line 409
    .line 410
    invoke-virtual {v3, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v5

    .line 414
    if-eqz v5, :cond_d

    .line 415
    .line 416
    move v13, v6

    .line 417
    goto :goto_8

    .line 418
    :cond_d
    move v13, v7

    .line 419
    :goto_8
    if-eqz v13, :cond_f

    .line 420
    .line 421
    iget v14, v2, Li/c;->w:I

    .line 422
    .line 423
    if-nez v14, :cond_f

    .line 424
    .line 425
    iget-object v14, v2, Li/c;->x:Ljava/lang/String;

    .line 426
    .line 427
    if-nez v14, :cond_f

    .line 428
    .line 429
    sget-object v13, Li/d;->f:[Ljava/lang/Class;

    .line 430
    .line 431
    iget-object v14, v0, Li/d;->b:[Ljava/lang/Object;

    .line 432
    .line 433
    invoke-virtual {v2, v5, v13, v14}, Li/c;->a(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v5

    .line 437
    if-nez v5, :cond_e

    .line 438
    .line 439
    goto :goto_9

    .line 440
    :cond_e
    new-instance v1, Ljava/lang/ClassCastException;

    .line 441
    .line 442
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 443
    .line 444
    .line 445
    throw v1

    .line 446
    :cond_f
    if-eqz v13, :cond_10

    .line 447
    .line 448
    const-string v5, "SupportMenuInflater"

    .line 449
    .line 450
    const-string v13, "Ignoring attribute \'actionProviderClass\'. Action view already specified."

    .line 451
    .line 452
    invoke-static {v5, v13}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 453
    .line 454
    .line 455
    :cond_10
    :goto_9
    const/16 v5, 0x11

    .line 456
    .line 457
    invoke-virtual {v3, v5}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 458
    .line 459
    .line 460
    move-result-object v5

    .line 461
    iput-object v5, v2, Li/c;->z:Ljava/lang/CharSequence;

    .line 462
    .line 463
    const/16 v5, 0x16

    .line 464
    .line 465
    invoke-virtual {v3, v5}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 466
    .line 467
    .line 468
    move-result-object v5

    .line 469
    iput-object v5, v2, Li/c;->A:Ljava/lang/CharSequence;

    .line 470
    .line 471
    const/16 v5, 0x13

    .line 472
    .line 473
    invoke-virtual {v3, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 474
    .line 475
    .line 476
    move-result v13

    .line 477
    if-eqz v13, :cond_11

    .line 478
    .line 479
    invoke-virtual {v3, v5, v12}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 480
    .line 481
    .line 482
    move-result v5

    .line 483
    iget-object v12, v2, Li/c;->C:Landroid/graphics/PorterDuff$Mode;

    .line 484
    .line 485
    invoke-static {v5, v12}, Lk/B;->c(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    .line 486
    .line 487
    .line 488
    move-result-object v5

    .line 489
    iput-object v5, v2, Li/c;->C:Landroid/graphics/PorterDuff$Mode;

    .line 490
    .line 491
    goto :goto_a

    .line 492
    :cond_11
    const/4 v5, 0x0

    .line 493
    iput-object v5, v2, Li/c;->C:Landroid/graphics/PorterDuff$Mode;

    .line 494
    .line 495
    :goto_a
    const/16 v5, 0x12

    .line 496
    .line 497
    invoke-virtual {v3, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 498
    .line 499
    .line 500
    move-result v12

    .line 501
    if-eqz v12, :cond_13

    .line 502
    .line 503
    invoke-virtual {v3, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 504
    .line 505
    .line 506
    move-result v12

    .line 507
    if-eqz v12, :cond_12

    .line 508
    .line 509
    invoke-virtual {v3, v5, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 510
    .line 511
    .line 512
    move-result v12

    .line 513
    if-eqz v12, :cond_12

    .line 514
    .line 515
    sget-object v13, Lg/a;->a:Ljava/lang/Object;

    .line 516
    .line 517
    invoke-virtual {v8, v12}, Landroid/content/Context;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 518
    .line 519
    .line 520
    move-result-object v8

    .line 521
    if-eqz v8, :cond_12

    .line 522
    .line 523
    goto :goto_b

    .line 524
    :cond_12
    invoke-virtual {v3, v5}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 525
    .line 526
    .line 527
    move-result-object v8

    .line 528
    :goto_b
    iput-object v8, v2, Li/c;->B:Landroid/content/res/ColorStateList;

    .line 529
    .line 530
    const/4 v5, 0x0

    .line 531
    goto :goto_c

    .line 532
    :cond_13
    const/4 v5, 0x0

    .line 533
    iput-object v5, v2, Li/c;->B:Landroid/content/res/ColorStateList;

    .line 534
    .line 535
    :goto_c
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 536
    .line 537
    .line 538
    iput-boolean v7, v2, Li/c;->h:Z

    .line 539
    .line 540
    move-object/from16 v8, p1

    .line 541
    .line 542
    goto :goto_d

    .line 543
    :cond_14
    const/4 v5, 0x0

    .line 544
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 545
    .line 546
    .line 547
    move-result v8

    .line 548
    if-eqz v8, :cond_15

    .line 549
    .line 550
    iput-boolean v6, v2, Li/c;->h:Z

    .line 551
    .line 552
    iget v3, v2, Li/c;->b:I

    .line 553
    .line 554
    iget v8, v2, Li/c;->i:I

    .line 555
    .line 556
    iget v12, v2, Li/c;->j:I

    .line 557
    .line 558
    iget-object v13, v2, Li/c;->k:Ljava/lang/CharSequence;

    .line 559
    .line 560
    invoke-interface {v15, v3, v8, v12, v13}, Landroid/view/Menu;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;

    .line 561
    .line 562
    .line 563
    move-result-object v3

    .line 564
    invoke-interface {v3}, Landroid/view/SubMenu;->getItem()Landroid/view/MenuItem;

    .line 565
    .line 566
    .line 567
    move-result-object v8

    .line 568
    invoke-virtual {v2, v8}, Li/c;->b(Landroid/view/MenuItem;)V

    .line 569
    .line 570
    .line 571
    move-object/from16 v8, p1

    .line 572
    .line 573
    invoke-virtual {v0, v8, v1, v3}, Li/d;->b(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V

    .line 574
    .line 575
    .line 576
    goto :goto_d

    .line 577
    :cond_15
    move-object/from16 v8, p1

    .line 578
    .line 579
    move-object v11, v3

    .line 580
    move v10, v6

    .line 581
    :goto_d
    invoke-interface {v8}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 582
    .line 583
    .line 584
    move-result v3

    .line 585
    const/4 v5, 0x2

    .line 586
    goto/16 :goto_2

    .line 587
    .line 588
    :cond_16
    new-instance v1, Ljava/lang/RuntimeException;

    .line 589
    .line 590
    const-string v2, "Unexpected end of document"

    .line 591
    .line 592
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 593
    .line 594
    .line 595
    throw v1

    .line 596
    :cond_17
    return-void

    .line 597
    :cond_18
    move-object/from16 v8, p1

    .line 598
    .line 599
    goto/16 :goto_0
.end method

.method public final inflate(ILandroid/view/Menu;)V
    .locals 3

    .line 1
    const-string v0, "Error inflating menu XML"

    .line 2
    .line 3
    instance-of v1, p2, Lj/j;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    invoke-super {p0, p1, p2}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    :try_start_0
    iget-object v2, p0, Li/d;->c:Landroid/content/Context;

    .line 13
    .line 14
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v2, p1}, Landroid/content/res/Resources;->getLayout(I)Landroid/content/res/XmlResourceParser;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v1}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p0, v1, p1, p2}, Li/d;->b(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    invoke-interface {v1}, Landroid/content/res/XmlResourceParser;->close()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    goto :goto_2

    .line 35
    :catch_0
    move-exception p1

    .line 36
    goto :goto_0

    .line 37
    :catch_1
    move-exception p1

    .line 38
    goto :goto_1

    .line 39
    :goto_0
    :try_start_1
    new-instance p2, Landroid/view/InflateException;

    .line 40
    .line 41
    invoke-direct {p2, v0, p1}, Landroid/view/InflateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    throw p2

    .line 45
    :goto_1
    new-instance p2, Landroid/view/InflateException;

    .line 46
    .line 47
    invoke-direct {p2, v0, p1}, Landroid/view/InflateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    :goto_2
    if-eqz v1, :cond_1

    .line 52
    .line 53
    invoke-interface {v1}, Landroid/content/res/XmlResourceParser;->close()V

    .line 54
    .line 55
    .line 56
    :cond_1
    throw p1
.end method

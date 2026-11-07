.class public final LV0/d;
.super LV0/f;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LV0/d;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final k:Lb1/J;

.field public final l:Lb1/J;

.field public final m:Lb1/J;

.field public final n:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LV0/l;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, LV0/l;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LV0/d;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>([B[B[B[Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, LM0/r;->f(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    array-length v0, p1

    .line 5
    invoke-static {p1, v0}, Lb1/J;->i([BI)Lb1/J;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p2}, LM0/r;->f(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    array-length v0, p2

    .line 13
    invoke-static {p2, v0}, Lb1/J;->i([BI)Lb1/J;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-static {p3}, LM0/r;->f(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    array-length v0, p3

    .line 21
    invoke-static {p3, v0}, Lb1/J;->i([BI)Lb1/J;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, LV0/d;->k:Lb1/J;

    .line 29
    .line 30
    iput-object p2, p0, LV0/d;->l:Lb1/J;

    .line 31
    .line 32
    iput-object p3, p0, LV0/d;->m:Lb1/J;

    .line 33
    .line 34
    invoke-static {p4}, LM0/r;->f(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iput-object p4, p0, LV0/d;->n:[Ljava/lang/String;

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final b()Lorg/json/JSONObject;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-class v0, Lb1/S;

    .line 4
    .line 5
    const-class v2, Lb1/P;

    .line 6
    .line 7
    const-class v3, Lb1/N;

    .line 8
    .line 9
    iget-object v4, v1, LV0/d;->n:[Ljava/lang/String;

    .line 10
    .line 11
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    .line 12
    .line 13
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v6, v1, LV0/d;->l:Lb1/J;

    .line 17
    .line 18
    if-eqz v6, :cond_0

    .line 19
    .line 20
    const-string v7, "clientDataJSON"

    .line 21
    .line 22
    invoke-virtual {v6}, Lb1/J;->j()[B

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    invoke-static {v6}, LE2/a;->p([B)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    invoke-virtual {v5, v7, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catch_0
    move-exception v0

    .line 35
    goto/16 :goto_c

    .line 36
    .line 37
    :cond_0
    :goto_0
    iget-object v6, v1, LV0/d;->m:Lb1/J;

    .line 38
    .line 39
    if-eqz v6, :cond_1

    .line 40
    .line 41
    :try_start_1
    const-string v7, "attestationObject"

    .line 42
    .line 43
    invoke-virtual {v6}, Lb1/J;->j()[B

    .line 44
    .line 45
    .line 46
    move-result-object v8

    .line 47
    invoke-static {v8}, LE2/a;->p([B)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v8

    .line 51
    invoke-virtual {v5, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 52
    .line 53
    .line 54
    :cond_1
    new-instance v7, Lorg/json/JSONArray;

    .line 55
    .line 56
    invoke-direct {v7}, Lorg/json/JSONArray;-><init>()V

    .line 57
    .line 58
    .line 59
    const/4 v8, 0x0

    .line 60
    move v9, v8

    .line 61
    :goto_1
    array-length v10, v4

    .line 62
    if-ge v9, v10, :cond_3

    .line 63
    .line 64
    aget-object v10, v4, v9

    .line 65
    .line 66
    const-string v11, "cable"

    .line 67
    .line 68
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v10

    .line 72
    if-eqz v10, :cond_2

    .line 73
    .line 74
    const-string v10, "hybrid"

    .line 75
    .line 76
    invoke-virtual {v7, v9, v10}, Lorg/json/JSONArray;->put(ILjava/lang/Object;)Lorg/json/JSONArray;

    .line 77
    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_2
    aget-object v10, v4, v9

    .line 81
    .line 82
    invoke-virtual {v7, v9, v10}, Lorg/json/JSONArray;->put(ILjava/lang/Object;)Lorg/json/JSONArray;

    .line 83
    .line 84
    .line 85
    :goto_2
    add-int/lit8 v9, v9, 0x1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    const-string v4, "transports"

    .line 89
    .line 90
    invoke-virtual {v5, v4, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v6}, Lb1/J;->j()[B

    .line 94
    .line 95
    .line 96
    move-result-object v4
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 97
    :try_start_2
    invoke-static {v4}, Lb1/V;->e([B)Lb1/V;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-virtual {v4, v0}, Lb1/V;->c(Ljava/lang/Class;)Lb1/V;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    check-cast v4, Lb1/S;
    :try_end_2
    .catch Lb1/U; {:try_start_2 .. :try_end_2} :catch_9
    .catch Lb1/O; {:try_start_2 .. :try_end_2} :catch_8
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 106
    .line 107
    :try_start_3
    iget-object v4, v4, Lb1/S;->l:Lb1/o;

    .line 108
    .line 109
    const-string v6, "authData"

    .line 110
    .line 111
    new-instance v7, Lb1/T;

    .line 112
    .line 113
    invoke-direct {v7, v6}, Lb1/T;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v4, v7}, Lb1/o;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    check-cast v4, Lb1/V;

    .line 121
    .line 122
    if-eqz v4, :cond_10

    .line 123
    .line 124
    invoke-virtual {v4, v3}, Lb1/V;->c(Ljava/lang/Class;)Lb1/V;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    check-cast v4, Lb1/N;

    .line 129
    .line 130
    iget-object v4, v4, Lb1/N;->k:Lb1/J;
    :try_end_3
    .catch Lb1/U; {:try_start_3 .. :try_end_3} :catch_7
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0

    .line 131
    .line 132
    :try_start_4
    iget-object v6, v4, Lb1/J;->l:[B

    .line 133
    .line 134
    invoke-virtual {v4}, Lb1/J;->d()I

    .line 135
    .line 136
    .line 137
    move-result v7

    .line 138
    invoke-static {v6, v8, v7}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    .line 143
    .line 144
    .line 145
    move-result-object v7
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_0

    .line 146
    :try_start_5
    invoke-virtual {v7}, Ljava/nio/Buffer;->position()I

    .line 147
    .line 148
    .line 149
    move-result v9

    .line 150
    const/16 v10, 0x20

    .line 151
    .line 152
    add-int/2addr v9, v10

    .line 153
    invoke-virtual {v7, v9}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->get()B

    .line 157
    .line 158
    .line 159
    move-result v9

    .line 160
    and-int/lit8 v9, v9, 0x40

    .line 161
    .line 162
    if-eqz v9, :cond_f

    .line 163
    .line 164
    invoke-virtual {v7}, Ljava/nio/Buffer;->position()I

    .line 165
    .line 166
    .line 167
    move-result v9

    .line 168
    add-int/lit8 v9, v9, 0x4

    .line 169
    .line 170
    invoke-virtual {v7, v9}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v7}, Ljava/nio/Buffer;->position()I

    .line 174
    .line 175
    .line 176
    move-result v9

    .line 177
    add-int/lit8 v9, v9, 0x10

    .line 178
    .line 179
    invoke-virtual {v7, v9}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->getShort()S

    .line 183
    .line 184
    .line 185
    move-result v9

    .line 186
    invoke-virtual {v7}, Ljava/nio/Buffer;->position()I

    .line 187
    .line 188
    .line 189
    move-result v11

    .line 190
    add-int/2addr v11, v9

    .line 191
    invoke-virtual {v7, v11}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;
    :try_end_5
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5 .. :try_end_5} :catch_6
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_0

    .line 192
    .line 193
    .line 194
    :try_start_6
    invoke-virtual {v7}, Ljava/nio/Buffer;->position()I

    .line 195
    .line 196
    .line 197
    move-result v7

    .line 198
    array-length v9, v6

    .line 199
    invoke-virtual {v4}, Lb1/J;->d()I

    .line 200
    .line 201
    .line 202
    move-result v11

    .line 203
    invoke-static {v7, v9, v11}, Lb1/J;->g(III)I

    .line 204
    .line 205
    .line 206
    move-result v9

    .line 207
    if-nez v9, :cond_4

    .line 208
    .line 209
    sget-object v6, Lb1/J;->m:Lb1/J;

    .line 210
    .line 211
    goto :goto_3

    .line 212
    :cond_4
    new-instance v11, Lb1/I;

    .line 213
    .line 214
    invoke-direct {v11, v6, v7, v9}, Lb1/I;-><init>([BII)V

    .line 215
    .line 216
    .line 217
    move-object v6, v11

    .line 218
    :goto_3
    invoke-virtual {v6}, Lb1/J;->f()Ljava/io/ByteArrayInputStream;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    new-instance v7, Lb1/X;

    .line 223
    .line 224
    invoke-direct {v7, v6}, Lb1/X;-><init>(Ljava/io/ByteArrayInputStream;)V
    :try_end_6
    .catch Lb1/U; {:try_start_6 .. :try_end_6} :catch_5
    .catch Lb1/O; {:try_start_6 .. :try_end_6} :catch_4
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_0

    .line 225
    .line 226
    .line 227
    :try_start_7
    invoke-static {v7}, Lb1/a;->k(Lb1/X;)Lb1/V;

    .line 228
    .line 229
    .line 230
    move-result-object v6
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 231
    :try_start_8
    invoke-virtual {v7}, Lb1/X;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_1
    .catch Lb1/U; {:try_start_8 .. :try_end_8} :catch_5
    .catch Lorg/json/JSONException; {:try_start_8 .. :try_end_8} :catch_0

    .line 232
    .line 233
    .line 234
    :catch_1
    :try_start_9
    invoke-virtual {v6, v0}, Lb1/V;->c(Ljava/lang/Class;)Lb1/V;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    check-cast v0, Lb1/S;
    :try_end_9
    .catch Lb1/U; {:try_start_9 .. :try_end_9} :catch_5
    .catch Lb1/O; {:try_start_9 .. :try_end_9} :catch_4
    .catch Lorg/json/JSONException; {:try_start_9 .. :try_end_9} :catch_0

    .line 239
    .line 240
    :try_start_a
    iget-object v0, v0, Lb1/S;->l:Lb1/o;

    .line 241
    .line 242
    new-instance v6, Lb1/P;

    .line 243
    .line 244
    const-wide/16 v11, 0x3

    .line 245
    .line 246
    invoke-direct {v6, v11, v12}, Lb1/P;-><init>(J)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v0, v6}, Lb1/o;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v6

    .line 253
    check-cast v6, Lb1/V;

    .line 254
    .line 255
    new-instance v7, Lb1/P;

    .line 256
    .line 257
    const-wide/16 v11, 0x1

    .line 258
    .line 259
    invoke-direct {v7, v11, v12}, Lb1/P;-><init>(J)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0, v7}, Lb1/o;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v7

    .line 266
    check-cast v7, Lb1/V;
    :try_end_a
    .catch Lorg/json/JSONException; {:try_start_a .. :try_end_a} :catch_0

    .line 267
    .line 268
    const-string v9, "COSE key missing required fields"

    .line 269
    .line 270
    if-eqz v6, :cond_e

    .line 271
    .line 272
    if-eqz v7, :cond_e

    .line 273
    .line 274
    :try_start_b
    invoke-virtual {v6, v2}, Lb1/V;->c(Ljava/lang/Class;)Lb1/V;

    .line 275
    .line 276
    .line 277
    move-result-object v6

    .line 278
    check-cast v6, Lb1/P;

    .line 279
    .line 280
    iget-wide v13, v6, Lb1/P;->k:J

    .line 281
    .line 282
    invoke-virtual {v7, v2}, Lb1/V;->c(Ljava/lang/Class;)Lb1/V;

    .line 283
    .line 284
    .line 285
    move-result-object v6

    .line 286
    check-cast v6, Lb1/P;

    .line 287
    .line 288
    iget-wide v6, v6, Lb1/P;->k:J

    .line 289
    .line 290
    cmp-long v15, v6, v11

    .line 291
    .line 292
    const/16 v16, 0x0

    .line 293
    .line 294
    const-wide/16 v17, 0x2

    .line 295
    .line 296
    if-eqz v15, :cond_6

    .line 297
    .line 298
    cmp-long v6, v6, v17

    .line 299
    .line 300
    if-nez v6, :cond_5

    .line 301
    .line 302
    move-wide/from16 v6, v17

    .line 303
    .line 304
    goto :goto_5

    .line 305
    :cond_5
    :goto_4
    move-object/from16 v0, v16

    .line 306
    .line 307
    goto/16 :goto_6

    .line 308
    .line 309
    :cond_6
    :goto_5
    new-instance v15, Lb1/P;

    .line 310
    .line 311
    move-wide/from16 v19, v11

    .line 312
    .line 313
    const-wide/16 v11, -0x1

    .line 314
    .line 315
    invoke-direct {v15, v11, v12}, Lb1/P;-><init>(J)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v0, v15}, Lb1/o;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v11

    .line 322
    check-cast v11, Lb1/V;

    .line 323
    .line 324
    if-eqz v11, :cond_d

    .line 325
    .line 326
    invoke-virtual {v11, v2}, Lb1/V;->c(Ljava/lang/Class;)Lb1/V;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    check-cast v2, Lb1/P;

    .line 331
    .line 332
    iget-wide v11, v2, Lb1/P;->k:J
    :try_end_b
    .catch Lb1/U; {:try_start_b .. :try_end_b} :catch_2
    .catch Lorg/json/JSONException; {:try_start_b .. :try_end_b} :catch_0

    .line 333
    .line 334
    cmp-long v2, v6, v17

    .line 335
    .line 336
    const-string v15, "COSE coordinates are the wrong size"

    .line 337
    .line 338
    move-object/from16 v18, v9

    .line 339
    .line 340
    const-wide/16 v8, -0x2

    .line 341
    .line 342
    if-nez v2, :cond_9

    .line 343
    .line 344
    cmp-long v2, v11, v19

    .line 345
    .line 346
    if-nez v2, :cond_9

    .line 347
    .line 348
    :try_start_c
    new-instance v2, Lb1/P;

    .line 349
    .line 350
    invoke-direct {v2, v8, v9}, Lb1/P;-><init>(J)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v0, v2}, Lb1/o;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v2

    .line 357
    check-cast v2, Lb1/V;

    .line 358
    .line 359
    new-instance v6, Lb1/P;

    .line 360
    .line 361
    const-wide/16 v7, -0x3

    .line 362
    .line 363
    invoke-direct {v6, v7, v8}, Lb1/P;-><init>(J)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v0, v6}, Lb1/o;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    check-cast v0, Lb1/V;

    .line 371
    .line 372
    if-eqz v2, :cond_8

    .line 373
    .line 374
    if-eqz v0, :cond_8

    .line 375
    .line 376
    invoke-virtual {v2, v3}, Lb1/V;->c(Ljava/lang/Class;)Lb1/V;

    .line 377
    .line 378
    .line 379
    move-result-object v2

    .line 380
    check-cast v2, Lb1/N;

    .line 381
    .line 382
    iget-object v2, v2, Lb1/N;->k:Lb1/J;

    .line 383
    .line 384
    invoke-virtual {v0, v3}, Lb1/V;->c(Ljava/lang/Class;)Lb1/V;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    check-cast v0, Lb1/N;

    .line 389
    .line 390
    iget-object v0, v0, Lb1/N;->k:Lb1/J;

    .line 391
    .line 392
    iget-object v3, v2, Lb1/J;->l:[B

    .line 393
    .line 394
    array-length v3, v3

    .line 395
    if-ne v3, v10, :cond_7

    .line 396
    .line 397
    iget-object v3, v0, Lb1/J;->l:[B

    .line 398
    .line 399
    array-length v3, v3

    .line 400
    if-ne v3, v10, :cond_7

    .line 401
    .line 402
    const-string v3, "MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE"

    .line 403
    .line 404
    const/4 v6, 0x0

    .line 405
    invoke-static {v3, v6}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 406
    .line 407
    .line 408
    move-result-object v3

    .line 409
    invoke-virtual {v2}, Lb1/J;->j()[B

    .line 410
    .line 411
    .line 412
    move-result-object v2

    .line 413
    invoke-virtual {v0}, Lb1/J;->j()[B

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    filled-new-array {v3, v2, v0}, [[B

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    invoke-static {v0}, Lb1/a;->j([[B)[B

    .line 422
    .line 423
    .line 424
    move-result-object v16

    .line 425
    goto :goto_4

    .line 426
    :catch_2
    move-exception v0

    .line 427
    goto/16 :goto_7

    .line 428
    .line 429
    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 430
    .line 431
    invoke-direct {v0, v15}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    throw v0

    .line 435
    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 436
    .line 437
    move-object/from16 v2, v18

    .line 438
    .line 439
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    throw v0

    .line 443
    :cond_9
    move-object/from16 v2, v18

    .line 444
    .line 445
    cmp-long v6, v6, v19

    .line 446
    .line 447
    if-nez v6, :cond_5

    .line 448
    .line 449
    const-wide/16 v6, 0x6

    .line 450
    .line 451
    cmp-long v6, v11, v6

    .line 452
    .line 453
    if-nez v6, :cond_5

    .line 454
    .line 455
    new-instance v6, Lb1/P;

    .line 456
    .line 457
    invoke-direct {v6, v8, v9}, Lb1/P;-><init>(J)V

    .line 458
    .line 459
    .line 460
    invoke-virtual {v0, v6}, Lb1/o;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    check-cast v0, Lb1/V;

    .line 465
    .line 466
    if-eqz v0, :cond_b

    .line 467
    .line 468
    invoke-virtual {v0, v3}, Lb1/V;->c(Ljava/lang/Class;)Lb1/V;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    check-cast v0, Lb1/N;

    .line 473
    .line 474
    iget-object v0, v0, Lb1/N;->k:Lb1/J;

    .line 475
    .line 476
    iget-object v2, v0, Lb1/J;->l:[B

    .line 477
    .line 478
    array-length v2, v2

    .line 479
    if-ne v2, v10, :cond_a

    .line 480
    .line 481
    const-string v2, "MCowBQYDK2VwAyEA"

    .line 482
    .line 483
    const/4 v6, 0x0

    .line 484
    invoke-static {v2, v6}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 485
    .line 486
    .line 487
    move-result-object v2

    .line 488
    invoke-virtual {v0}, Lb1/J;->j()[B

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    filled-new-array {v2, v0}, [[B

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    invoke-static {v0}, Lb1/a;->j([[B)[B

    .line 497
    .line 498
    .line 499
    move-result-object v16

    .line 500
    goto/16 :goto_4

    .line 501
    .line 502
    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 503
    .line 504
    invoke-direct {v0, v15}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    throw v0

    .line 508
    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 509
    .line 510
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 511
    .line 512
    .line 513
    throw v0
    :try_end_c
    .catch Lb1/U; {:try_start_c .. :try_end_c} :catch_2
    .catch Lorg/json/JSONException; {:try_start_c .. :try_end_c} :catch_0

    .line 514
    :goto_6
    :try_start_d
    const-string v2, "authenticatorData"

    .line 515
    .line 516
    invoke-virtual {v4}, Lb1/J;->j()[B

    .line 517
    .line 518
    .line 519
    move-result-object v3

    .line 520
    invoke-static {v3}, LE2/a;->p([B)Ljava/lang/String;

    .line 521
    .line 522
    .line 523
    move-result-object v3

    .line 524
    invoke-virtual {v5, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 525
    .line 526
    .line 527
    const-string v2, "publicKeyAlgorithm"

    .line 528
    .line 529
    invoke-virtual {v5, v2, v13, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 530
    .line 531
    .line 532
    if-eqz v0, :cond_c

    .line 533
    .line 534
    const-string v2, "publicKey"

    .line 535
    .line 536
    const/16 v3, 0xb

    .line 537
    .line 538
    invoke-static {v0, v3}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    invoke-virtual {v5, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_d
    .catch Lorg/json/JSONException; {:try_start_d .. :try_end_d} :catch_0

    .line 543
    .line 544
    .line 545
    :cond_c
    return-object v5

    .line 546
    :cond_d
    move-object v2, v9

    .line 547
    :try_start_e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 548
    .line 549
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 550
    .line 551
    .line 552
    throw v0
    :try_end_e
    .catch Lb1/U; {:try_start_e .. :try_end_e} :catch_2
    .catch Lorg/json/JSONException; {:try_start_e .. :try_end_e} :catch_0

    .line 553
    :goto_7
    :try_start_f
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 554
    .line 555
    const-string v3, "COSE key ill-formed"

    .line 556
    .line 557
    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 558
    .line 559
    .line 560
    throw v2

    .line 561
    :cond_e
    move-object v2, v9

    .line 562
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 563
    .line 564
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 565
    .line 566
    .line 567
    throw v0
    :try_end_f
    .catch Lorg/json/JSONException; {:try_start_f .. :try_end_f} :catch_0

    .line 568
    :catchall_0
    move-exception v0

    .line 569
    :try_start_10
    invoke-virtual {v7}, Lb1/X;->close()V
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_3
    .catch Lb1/U; {:try_start_10 .. :try_end_10} :catch_5
    .catch Lorg/json/JSONException; {:try_start_10 .. :try_end_10} :catch_0

    .line 570
    .line 571
    .line 572
    :catch_3
    :try_start_11
    throw v0
    :try_end_11
    .catch Lb1/U; {:try_start_11 .. :try_end_11} :catch_5
    .catch Lb1/O; {:try_start_11 .. :try_end_11} :catch_4
    .catch Lorg/json/JSONException; {:try_start_11 .. :try_end_11} :catch_0

    .line 573
    :catch_4
    move-exception v0

    .line 574
    goto :goto_8

    .line 575
    :catch_5
    move-exception v0

    .line 576
    :goto_8
    :try_start_12
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 577
    .line 578
    const-string v3, "failed to parse COSE key"

    .line 579
    .line 580
    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 581
    .line 582
    .line 583
    throw v2
    :try_end_12
    .catch Lorg/json/JSONException; {:try_start_12 .. :try_end_12} :catch_0

    .line 584
    :catch_6
    move-exception v0

    .line 585
    goto :goto_9

    .line 586
    :cond_f
    :try_start_13
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 587
    .line 588
    const-string v2, "authData does not include credential data"

    .line 589
    .line 590
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 591
    .line 592
    .line 593
    throw v0
    :try_end_13
    .catch Ljava/lang/IllegalArgumentException; {:try_start_13 .. :try_end_13} :catch_6
    .catch Lorg/json/JSONException; {:try_start_13 .. :try_end_13} :catch_0

    .line 594
    :goto_9
    :try_start_14
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 595
    .line 596
    const-string v3, "ill-formed authenticator data"

    .line 597
    .line 598
    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 599
    .line 600
    .line 601
    throw v2
    :try_end_14
    .catch Lorg/json/JSONException; {:try_start_14 .. :try_end_14} :catch_0

    .line 602
    :catch_7
    move-exception v0

    .line 603
    goto :goto_a

    .line 604
    :cond_10
    :try_start_15
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 605
    .line 606
    const-string v2, "attestation object missing authData"

    .line 607
    .line 608
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 609
    .line 610
    .line 611
    throw v0
    :try_end_15
    .catch Lb1/U; {:try_start_15 .. :try_end_15} :catch_7
    .catch Lorg/json/JSONException; {:try_start_15 .. :try_end_15} :catch_0

    .line 612
    :goto_a
    :try_start_16
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 613
    .line 614
    const-string v3, "authData value has wrong type"

    .line 615
    .line 616
    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 617
    .line 618
    .line 619
    throw v2

    .line 620
    :catch_8
    move-exception v0

    .line 621
    goto :goto_b

    .line 622
    :catch_9
    move-exception v0

    .line 623
    :goto_b
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 624
    .line 625
    const-string v3, "failed to parse attestation object"

    .line 626
    .line 627
    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 628
    .line 629
    .line 630
    throw v2
    :try_end_16
    .catch Lorg/json/JSONException; {:try_start_16 .. :try_end_16} :catch_0

    .line 631
    :goto_c
    new-instance v2, Ljava/lang/RuntimeException;

    .line 632
    .line 633
    const-string v3, "Error encoding AuthenticatorAttestationResponse to JSON object"

    .line 634
    .line 635
    invoke-direct {v2, v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 636
    .line 637
    .line 638
    throw v2
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, LV0/d;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    check-cast p1, LV0/d;

    .line 7
    .line 8
    iget-object v0, p0, LV0/d;->k:Lb1/J;

    .line 9
    .line 10
    iget-object v1, p1, LV0/d;->k:Lb1/J;

    .line 11
    .line 12
    invoke-static {v0, v1}, LM0/r;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, LV0/d;->l:Lb1/J;

    .line 19
    .line 20
    iget-object v1, p1, LV0/d;->l:Lb1/J;

    .line 21
    .line 22
    invoke-static {v0, v1}, LM0/r;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, LV0/d;->m:Lb1/J;

    .line 29
    .line 30
    iget-object p1, p1, LV0/d;->m:Lb1/J;

    .line 31
    .line 32
    invoke-static {v0, p1}, LM0/r;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    return p1

    .line 40
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 41
    return p1
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, LV0/d;->k:Lb1/J;

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, LV0/d;->l:Lb1/J;

    .line 16
    .line 17
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iget-object v2, p0, LV0/d;->m:Lb1/J;

    .line 30
    .line 31
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-static {v2}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LA0/j;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-direct {v1, v0}, LA0/j;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    sget-object v0, Lb1/D;->d:Lb1/B;

    .line 15
    .line 16
    iget-object v2, p0, LV0/d;->k:Lb1/J;

    .line 17
    .line 18
    invoke-virtual {v2}, Lb1/J;->j()[B

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    array-length v3, v2

    .line 23
    invoke-virtual {v0, v2, v3}, Lb1/D;->c([BI)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const-string v3, "keyHandle"

    .line 28
    .line 29
    invoke-virtual {v1, v2, v3}, LA0/j;->N(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object v2, p0, LV0/d;->l:Lb1/J;

    .line 33
    .line 34
    invoke-virtual {v2}, Lb1/J;->j()[B

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    array-length v3, v2

    .line 39
    invoke-virtual {v0, v2, v3}, Lb1/D;->c([BI)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    const-string v3, "clientDataJSON"

    .line 44
    .line 45
    invoke-virtual {v1, v2, v3}, LA0/j;->N(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget-object v2, p0, LV0/d;->m:Lb1/J;

    .line 49
    .line 50
    invoke-virtual {v2}, Lb1/J;->j()[B

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    array-length v3, v2

    .line 55
    invoke-virtual {v0, v2, v3}, Lb1/D;->c([BI)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const-string v2, "attestationObject"

    .line 60
    .line 61
    invoke-virtual {v1, v0, v2}, LA0/j;->N(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const-string v0, "transports"

    .line 65
    .line 66
    iget-object v2, p0, LV0/d;->n:[Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {v2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-virtual {v1, v2, v0}, LA0/j;->N(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, LA0/j;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    const/16 p2, 0x4f45

    .line 2
    .line 3
    invoke-static {p1, p2}, LH2/h;->Q(Landroid/os/Parcel;I)I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    iget-object v0, p0, LV0/d;->k:Lb1/J;

    .line 8
    .line 9
    invoke-virtual {v0}, Lb1/J;->j()[B

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x2

    .line 14
    invoke-static {p1, v1, v0}, LH2/h;->H(Landroid/os/Parcel;I[B)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, LV0/d;->l:Lb1/J;

    .line 18
    .line 19
    invoke-virtual {v0}, Lb1/J;->j()[B

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v1, 0x3

    .line 24
    invoke-static {p1, v1, v0}, LH2/h;->H(Landroid/os/Parcel;I[B)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, LV0/d;->m:Lb1/J;

    .line 28
    .line 29
    invoke-virtual {v0}, Lb1/J;->j()[B

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const/4 v1, 0x4

    .line 34
    invoke-static {p1, v1, v0}, LH2/h;->H(Landroid/os/Parcel;I[B)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, LV0/d;->n:[Ljava/lang/String;

    .line 38
    .line 39
    if-nez v0, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v1, 0x5

    .line 43
    invoke-static {p1, v1}, LH2/h;->Q(Landroid/os/Parcel;I)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-static {p1, v1}, LH2/h;->R(Landroid/os/Parcel;I)V

    .line 51
    .line 52
    .line 53
    :goto_0
    invoke-static {p1, p2}, LH2/h;->R(Landroid/os/Parcel;I)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

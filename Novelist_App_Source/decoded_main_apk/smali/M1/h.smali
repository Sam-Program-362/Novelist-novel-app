.class public final LM1/h;
.super LI1/u;
.source "SourceFile"


# instance fields
.field public final e:LM1/O;


# direct methods
.method public constructor <init>(LM1/O;)V
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    invoke-direct {p0, v0}, LI1/u;-><init>(I)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, LM1/h;->e:LM1/O;

    .line 6
    .line 7
    return-void
.end method

.method public static final l(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Failed to create new Dart proxy instance of "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string p0, ": "

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string p0, ". "

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    const-string p1, "PigeonProxyApiBaseCodec"

    .line 32
    .line 33
    invoke-static {p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;
    .locals 3

    .line 1
    const-string v0, "buffer"

    .line 2
    .line 3
    invoke-static {p2, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/16 v0, -0x80

    .line 7
    .line 8
    if-ne p1, v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0, p2}, LC1/q;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const-string p2, "null cannot be cast to non-null type kotlin.Long"

    .line 15
    .line 16
    invoke-static {p1, p2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    check-cast p1, Ljava/lang/Long;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 22
    .line 23
    .line 24
    move-result-wide p1

    .line 25
    iget-object v0, p0, LM1/h;->e:LM1/O;

    .line 26
    .line 27
    iget-object v0, v0, LM1/O;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, LM1/d;

    .line 30
    .line 31
    invoke-virtual {v0, p1, p2}, LM1/d;->e(J)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    new-instance v1, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v2, "Failed to find instance with identifier: "

    .line 40
    .line 41
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-string p2, "PigeonProxyApiBaseCodec"

    .line 52
    .line 53
    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    :cond_0
    return-object v0

    .line 57
    :cond_1
    invoke-super {p0, p1, p2}, LI1/u;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1
.end method

.method public final k(LC1/p;Ljava/lang/Object;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, LM1/h;->e:LM1/O;

    .line 8
    .line 9
    iget-object v4, v3, LM1/O;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v4, LC1/f;

    .line 12
    .line 13
    iget-object v5, v3, LM1/O;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v5, LM1/d;

    .line 16
    .line 17
    instance-of v6, v2, Ljava/lang/Boolean;

    .line 18
    .line 19
    if-nez v6, :cond_46

    .line 20
    .line 21
    instance-of v6, v2, [B

    .line 22
    .line 23
    if-nez v6, :cond_46

    .line 24
    .line 25
    instance-of v6, v2, Ljava/lang/Double;

    .line 26
    .line 27
    if-nez v6, :cond_46

    .line 28
    .line 29
    instance-of v6, v2, [D

    .line 30
    .line 31
    if-nez v6, :cond_46

    .line 32
    .line 33
    instance-of v6, v2, [F

    .line 34
    .line 35
    if-nez v6, :cond_46

    .line 36
    .line 37
    instance-of v6, v2, Ljava/lang/Integer;

    .line 38
    .line 39
    if-nez v6, :cond_46

    .line 40
    .line 41
    instance-of v6, v2, [I

    .line 42
    .line 43
    if-nez v6, :cond_46

    .line 44
    .line 45
    instance-of v6, v2, Ljava/util/List;

    .line 46
    .line 47
    if-nez v6, :cond_46

    .line 48
    .line 49
    instance-of v6, v2, Ljava/lang/Long;

    .line 50
    .line 51
    if-nez v6, :cond_46

    .line 52
    .line 53
    instance-of v6, v2, [J

    .line 54
    .line 55
    if-nez v6, :cond_46

    .line 56
    .line 57
    instance-of v6, v2, Ljava/util/Map;

    .line 58
    .line 59
    if-nez v6, :cond_46

    .line 60
    .line 61
    instance-of v6, v2, Ljava/lang/String;

    .line 62
    .line 63
    if-nez v6, :cond_46

    .line 64
    .line 65
    instance-of v6, v2, LM1/t;

    .line 66
    .line 67
    if-nez v6, :cond_46

    .line 68
    .line 69
    instance-of v6, v2, LM1/k;

    .line 70
    .line 71
    if-nez v6, :cond_46

    .line 72
    .line 73
    instance-of v6, v2, LM1/z;

    .line 74
    .line 75
    if-nez v6, :cond_46

    .line 76
    .line 77
    instance-of v6, v2, LM1/S;

    .line 78
    .line 79
    if-nez v6, :cond_46

    .line 80
    .line 81
    instance-of v6, v2, LM1/y;

    .line 82
    .line 83
    if-nez v6, :cond_46

    .line 84
    .line 85
    instance-of v6, v2, LM1/l0;

    .line 86
    .line 87
    if-nez v6, :cond_46

    .line 88
    .line 89
    if-nez v2, :cond_0

    .line 90
    .line 91
    goto/16 :goto_5

    .line 92
    .line 93
    :cond_0
    instance-of v6, v2, Landroid/webkit/WebResourceRequest;

    .line 94
    .line 95
    const/4 v7, 0x0

    .line 96
    if-eqz v6, :cond_3

    .line 97
    .line 98
    move-object v6, v2

    .line 99
    check-cast v6, Landroid/webkit/WebResourceRequest;

    .line 100
    .line 101
    new-instance v8, LM1/g;

    .line 102
    .line 103
    const/4 v9, 0x0

    .line 104
    invoke-direct {v8, v2, v9}, LM1/g;-><init>(Ljava/lang/Object;I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v5, v6}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v9

    .line 111
    if-eqz v9, :cond_1

    .line 112
    .line 113
    goto/16 :goto_4

    .line 114
    .line 115
    :cond_1
    invoke-virtual {v5, v6}, LM1/d;->b(Ljava/lang/Object;)J

    .line 116
    .line 117
    .line 118
    move-result-wide v9

    .line 119
    invoke-interface {v6}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 120
    .line 121
    .line 122
    move-result-object v11

    .line 123
    invoke-virtual {v11}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v13

    .line 127
    invoke-interface {v6}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    .line 128
    .line 129
    .line 130
    move-result v11

    .line 131
    invoke-interface {v6}, Landroid/webkit/WebResourceRequest;->isRedirect()Z

    .line 132
    .line 133
    .line 134
    move-result v12

    .line 135
    invoke-interface {v6}, Landroid/webkit/WebResourceRequest;->hasGesture()Z

    .line 136
    .line 137
    .line 138
    move-result v14

    .line 139
    invoke-interface {v6}, Landroid/webkit/WebResourceRequest;->getMethod()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v17

    .line 143
    invoke-interface {v6}, Landroid/webkit/WebResourceRequest;->getRequestHeaders()Ljava/util/Map;

    .line 144
    .line 145
    .line 146
    move-result-object v15

    .line 147
    if-nez v15, :cond_2

    .line 148
    .line 149
    sget-object v6, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 150
    .line 151
    :goto_0
    move-object/from16 v18, v6

    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_2
    invoke-interface {v6}, Landroid/webkit/WebResourceRequest;->getRequestHeaders()Ljava/util/Map;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    goto :goto_0

    .line 159
    :goto_1
    invoke-virtual {v3}, LM1/O;->a()LC1/l;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    new-instance v6, LB1/s;

    .line 164
    .line 165
    const-string v15, "dev.flutter.pigeon.webview_flutter_android.WebResourceRequest.pigeon_newInstance"

    .line 166
    .line 167
    invoke-direct {v6, v4, v15, v3, v7}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 168
    .line 169
    .line 170
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 179
    .line 180
    .line 181
    move-result-object v15

    .line 182
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 183
    .line 184
    .line 185
    move-result-object v16

    .line 186
    move-object v12, v3

    .line 187
    move-object v14, v4

    .line 188
    filled-new-array/range {v12 .. v18}, [Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    invoke-static {v3}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    new-instance v4, LB1/d;

    .line 197
    .line 198
    const/16 v7, 0x1c

    .line 199
    .line 200
    invoke-direct {v4, v8, v7}, LB1/d;-><init>(Ljava/lang/Object;I)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v6, v3, v4}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 204
    .line 205
    .line 206
    goto/16 :goto_4

    .line 207
    .line 208
    :cond_3
    instance-of v6, v2, Landroid/webkit/WebResourceResponse;

    .line 209
    .line 210
    if-eqz v6, :cond_5

    .line 211
    .line 212
    move-object v6, v2

    .line 213
    check-cast v6, Landroid/webkit/WebResourceResponse;

    .line 214
    .line 215
    new-instance v8, LM1/g;

    .line 216
    .line 217
    const/16 v9, 0x19

    .line 218
    .line 219
    invoke-direct {v8, v2, v9}, LM1/g;-><init>(Ljava/lang/Object;I)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v5, v6}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v9

    .line 226
    if-eqz v9, :cond_4

    .line 227
    .line 228
    goto/16 :goto_4

    .line 229
    .line 230
    :cond_4
    invoke-virtual {v5, v6}, LM1/d;->b(Ljava/lang/Object;)J

    .line 231
    .line 232
    .line 233
    move-result-wide v9

    .line 234
    invoke-virtual {v6}, Landroid/webkit/WebResourceResponse;->getStatusCode()I

    .line 235
    .line 236
    .line 237
    move-result v6

    .line 238
    int-to-long v11, v6

    .line 239
    invoke-virtual {v3}, LM1/O;->a()LC1/l;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    new-instance v6, LB1/s;

    .line 244
    .line 245
    const-string v13, "dev.flutter.pigeon.webview_flutter_android.WebResourceResponse.pigeon_newInstance"

    .line 246
    .line 247
    invoke-direct {v6, v4, v13, v3, v7}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 248
    .line 249
    .line 250
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    filled-new-array {v3, v4}, [Ljava/lang/Long;

    .line 259
    .line 260
    .line 261
    move-result-object v3

    .line 262
    invoke-static {v3}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    new-instance v4, LB1/d;

    .line 267
    .line 268
    const/16 v7, 0x1d

    .line 269
    .line 270
    invoke-direct {v4, v8, v7}, LB1/d;-><init>(Ljava/lang/Object;I)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v6, v3, v4}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 274
    .line 275
    .line 276
    goto/16 :goto_4

    .line 277
    .line 278
    :cond_5
    instance-of v6, v2, Landroid/webkit/WebResourceError;

    .line 279
    .line 280
    if-eqz v6, :cond_7

    .line 281
    .line 282
    move-object v6, v2

    .line 283
    check-cast v6, Landroid/webkit/WebResourceError;

    .line 284
    .line 285
    new-instance v8, LM1/g;

    .line 286
    .line 287
    const/16 v9, 0xc

    .line 288
    .line 289
    invoke-direct {v8, v2, v9}, LM1/g;-><init>(Ljava/lang/Object;I)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v5, v6}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result v9

    .line 296
    if-eqz v9, :cond_6

    .line 297
    .line 298
    goto/16 :goto_4

    .line 299
    .line 300
    :cond_6
    invoke-virtual {v5, v6}, LM1/d;->b(Ljava/lang/Object;)J

    .line 301
    .line 302
    .line 303
    move-result-wide v9

    .line 304
    invoke-virtual {v6}, Landroid/webkit/WebResourceError;->getErrorCode()I

    .line 305
    .line 306
    .line 307
    move-result v11

    .line 308
    int-to-long v11, v11

    .line 309
    invoke-virtual {v6}, Landroid/webkit/WebResourceError;->getDescription()Ljava/lang/CharSequence;

    .line 310
    .line 311
    .line 312
    move-result-object v6

    .line 313
    invoke-interface {v6}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v6

    .line 317
    invoke-virtual {v3}, LM1/O;->a()LC1/l;

    .line 318
    .line 319
    .line 320
    move-result-object v3

    .line 321
    new-instance v13, LB1/s;

    .line 322
    .line 323
    const-string v14, "dev.flutter.pigeon.webview_flutter_android.WebResourceError.pigeon_newInstance"

    .line 324
    .line 325
    invoke-direct {v13, v4, v14, v3, v7}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 326
    .line 327
    .line 328
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 329
    .line 330
    .line 331
    move-result-object v3

    .line 332
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 333
    .line 334
    .line 335
    move-result-object v4

    .line 336
    filled-new-array {v3, v4, v6}, [Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v3

    .line 340
    invoke-static {v3}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 341
    .line 342
    .line 343
    move-result-object v3

    .line 344
    new-instance v4, LB1/d;

    .line 345
    .line 346
    const/16 v6, 0x1b

    .line 347
    .line 348
    invoke-direct {v4, v8, v6}, LB1/d;-><init>(Ljava/lang/Object;I)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v13, v3, v4}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 352
    .line 353
    .line 354
    goto/16 :goto_4

    .line 355
    .line 356
    :cond_7
    instance-of v6, v2, LM1/i0;

    .line 357
    .line 358
    if-eqz v6, :cond_9

    .line 359
    .line 360
    move-object v6, v2

    .line 361
    check-cast v6, LM1/i0;

    .line 362
    .line 363
    new-instance v8, LM1/g;

    .line 364
    .line 365
    const/16 v9, 0xd

    .line 366
    .line 367
    invoke-direct {v8, v2, v9}, LM1/g;-><init>(Ljava/lang/Object;I)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v5, v6}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 371
    .line 372
    .line 373
    move-result v9

    .line 374
    if-eqz v9, :cond_8

    .line 375
    .line 376
    goto/16 :goto_4

    .line 377
    .line 378
    :cond_8
    invoke-virtual {v5, v6}, LM1/d;->b(Ljava/lang/Object;)J

    .line 379
    .line 380
    .line 381
    move-result-wide v9

    .line 382
    iget-wide v11, v6, LM1/i0;->a:J

    .line 383
    .line 384
    iget-wide v13, v6, LM1/i0;->b:J

    .line 385
    .line 386
    invoke-virtual {v3}, LM1/O;->a()LC1/l;

    .line 387
    .line 388
    .line 389
    move-result-object v3

    .line 390
    new-instance v6, LB1/s;

    .line 391
    .line 392
    const-string v15, "dev.flutter.pigeon.webview_flutter_android.WebViewPoint.pigeon_newInstance"

    .line 393
    .line 394
    invoke-direct {v6, v4, v15, v3, v7}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 395
    .line 396
    .line 397
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 398
    .line 399
    .line 400
    move-result-object v3

    .line 401
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 402
    .line 403
    .line 404
    move-result-object v4

    .line 405
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 406
    .line 407
    .line 408
    move-result-object v7

    .line 409
    filled-new-array {v3, v4, v7}, [Ljava/lang/Long;

    .line 410
    .line 411
    .line 412
    move-result-object v3

    .line 413
    invoke-static {v3}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 414
    .line 415
    .line 416
    move-result-object v3

    .line 417
    new-instance v4, LM1/K;

    .line 418
    .line 419
    const/4 v7, 0x6

    .line 420
    invoke-direct {v4, v8, v7}, LM1/K;-><init>(Ljava/lang/Object;I)V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v6, v3, v4}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 424
    .line 425
    .line 426
    goto/16 :goto_4

    .line 427
    .line 428
    :cond_9
    instance-of v6, v2, Landroid/webkit/ConsoleMessage;

    .line 429
    .line 430
    const/4 v8, 0x3

    .line 431
    const/4 v9, 0x1

    .line 432
    if-eqz v6, :cond_10

    .line 433
    .line 434
    move-object v6, v2

    .line 435
    check-cast v6, Landroid/webkit/ConsoleMessage;

    .line 436
    .line 437
    new-instance v10, LM1/g;

    .line 438
    .line 439
    const/16 v11, 0xe

    .line 440
    .line 441
    invoke-direct {v10, v2, v11}, LM1/g;-><init>(Ljava/lang/Object;I)V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v5, v6}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 445
    .line 446
    .line 447
    move-result v11

    .line 448
    if-eqz v11, :cond_a

    .line 449
    .line 450
    goto/16 :goto_4

    .line 451
    .line 452
    :cond_a
    invoke-virtual {v5, v6}, LM1/d;->b(Ljava/lang/Object;)J

    .line 453
    .line 454
    .line 455
    move-result-wide v11

    .line 456
    invoke-virtual {v6}, Landroid/webkit/ConsoleMessage;->lineNumber()I

    .line 457
    .line 458
    .line 459
    move-result v13

    .line 460
    int-to-long v13, v13

    .line 461
    invoke-virtual {v6}, Landroid/webkit/ConsoleMessage;->message()Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v15

    .line 465
    sget-object v16, LM1/l;->a:[I

    .line 466
    .line 467
    invoke-virtual {v6}, Landroid/webkit/ConsoleMessage;->messageLevel()Landroid/webkit/ConsoleMessage$MessageLevel;

    .line 468
    .line 469
    .line 470
    move-result-object v17

    .line 471
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->ordinal()I

    .line 472
    .line 473
    .line 474
    move-result v17

    .line 475
    aget v7, v16, v17

    .line 476
    .line 477
    if-eq v7, v9, :cond_f

    .line 478
    .line 479
    const/4 v9, 0x2

    .line 480
    if-eq v7, v9, :cond_e

    .line 481
    .line 482
    if-eq v7, v8, :cond_d

    .line 483
    .line 484
    const/4 v8, 0x4

    .line 485
    if-eq v7, v8, :cond_c

    .line 486
    .line 487
    const/4 v8, 0x5

    .line 488
    if-eq v7, v8, :cond_b

    .line 489
    .line 490
    sget-object v7, LM1/k;->r:LM1/k;

    .line 491
    .line 492
    goto :goto_2

    .line 493
    :cond_b
    sget-object v7, LM1/k;->m:LM1/k;

    .line 494
    .line 495
    goto :goto_2

    .line 496
    :cond_c
    sget-object v7, LM1/k;->n:LM1/k;

    .line 497
    .line 498
    goto :goto_2

    .line 499
    :cond_d
    sget-object v7, LM1/k;->q:LM1/k;

    .line 500
    .line 501
    goto :goto_2

    .line 502
    :cond_e
    sget-object v7, LM1/k;->o:LM1/k;

    .line 503
    .line 504
    goto :goto_2

    .line 505
    :cond_f
    sget-object v7, LM1/k;->p:LM1/k;

    .line 506
    .line 507
    :goto_2
    invoke-virtual {v6}, Landroid/webkit/ConsoleMessage;->sourceId()Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v6

    .line 511
    invoke-virtual {v3}, LM1/O;->a()LC1/l;

    .line 512
    .line 513
    .line 514
    move-result-object v3

    .line 515
    new-instance v8, LB1/s;

    .line 516
    .line 517
    const-string v9, "dev.flutter.pigeon.webview_flutter_android.ConsoleMessage.pigeon_newInstance"

    .line 518
    .line 519
    move-wide/from16 v16, v11

    .line 520
    .line 521
    const/4 v11, 0x0

    .line 522
    invoke-direct {v8, v4, v9, v3, v11}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 523
    .line 524
    .line 525
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 526
    .line 527
    .line 528
    move-result-object v3

    .line 529
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 530
    .line 531
    .line 532
    move-result-object v4

    .line 533
    filled-new-array {v3, v4, v15, v7, v6}, [Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v3

    .line 537
    invoke-static {v3}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 538
    .line 539
    .line 540
    move-result-object v3

    .line 541
    new-instance v4, LB1/d;

    .line 542
    .line 543
    const/16 v6, 0xa

    .line 544
    .line 545
    invoke-direct {v4, v10, v6}, LB1/d;-><init>(Ljava/lang/Object;I)V

    .line 546
    .line 547
    .line 548
    invoke-virtual {v8, v3, v4}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 549
    .line 550
    .line 551
    goto/16 :goto_4

    .line 552
    .line 553
    :cond_10
    instance-of v6, v2, Landroid/webkit/CookieManager;

    .line 554
    .line 555
    if-eqz v6, :cond_12

    .line 556
    .line 557
    move-object v6, v2

    .line 558
    check-cast v6, Landroid/webkit/CookieManager;

    .line 559
    .line 560
    new-instance v7, LM1/g;

    .line 561
    .line 562
    const/16 v8, 0xf

    .line 563
    .line 564
    invoke-direct {v7, v2, v8}, LM1/g;-><init>(Ljava/lang/Object;I)V

    .line 565
    .line 566
    .line 567
    invoke-virtual {v5, v6}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 568
    .line 569
    .line 570
    move-result v8

    .line 571
    if-eqz v8, :cond_11

    .line 572
    .line 573
    goto/16 :goto_4

    .line 574
    .line 575
    :cond_11
    invoke-virtual {v5, v6}, LM1/d;->b(Ljava/lang/Object;)J

    .line 576
    .line 577
    .line 578
    move-result-wide v8

    .line 579
    invoke-virtual {v3}, LM1/O;->a()LC1/l;

    .line 580
    .line 581
    .line 582
    move-result-object v3

    .line 583
    new-instance v6, LB1/s;

    .line 584
    .line 585
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.CookieManager.pigeon_newInstance"

    .line 586
    .line 587
    const/4 v11, 0x0

    .line 588
    invoke-direct {v6, v4, v10, v3, v11}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 589
    .line 590
    .line 591
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 592
    .line 593
    .line 594
    move-result-object v3

    .line 595
    invoke-static {v3}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 596
    .line 597
    .line 598
    move-result-object v3

    .line 599
    new-instance v4, LB1/d;

    .line 600
    .line 601
    const/16 v8, 0xb

    .line 602
    .line 603
    invoke-direct {v4, v7, v8}, LB1/d;-><init>(Ljava/lang/Object;I)V

    .line 604
    .line 605
    .line 606
    invoke-virtual {v6, v3, v4}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 607
    .line 608
    .line 609
    goto/16 :goto_4

    .line 610
    .line 611
    :cond_12
    instance-of v6, v2, Landroid/webkit/WebView;

    .line 612
    .line 613
    if-eqz v6, :cond_14

    .line 614
    .line 615
    move-object v6, v2

    .line 616
    check-cast v6, Landroid/webkit/WebView;

    .line 617
    .line 618
    new-instance v7, LM1/g;

    .line 619
    .line 620
    const/16 v8, 0x10

    .line 621
    .line 622
    invoke-direct {v7, v2, v8}, LM1/g;-><init>(Ljava/lang/Object;I)V

    .line 623
    .line 624
    .line 625
    invoke-virtual {v5, v6}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 626
    .line 627
    .line 628
    move-result v8

    .line 629
    if-eqz v8, :cond_13

    .line 630
    .line 631
    goto/16 :goto_4

    .line 632
    .line 633
    :cond_13
    invoke-virtual {v5, v6}, LM1/d;->b(Ljava/lang/Object;)J

    .line 634
    .line 635
    .line 636
    move-result-wide v8

    .line 637
    invoke-virtual {v3}, LM1/O;->a()LC1/l;

    .line 638
    .line 639
    .line 640
    move-result-object v3

    .line 641
    new-instance v6, LB1/s;

    .line 642
    .line 643
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_newInstance"

    .line 644
    .line 645
    const/4 v11, 0x0

    .line 646
    invoke-direct {v6, v4, v10, v3, v11}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 647
    .line 648
    .line 649
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 650
    .line 651
    .line 652
    move-result-object v3

    .line 653
    invoke-static {v3}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 654
    .line 655
    .line 656
    move-result-object v3

    .line 657
    new-instance v4, LM1/K;

    .line 658
    .line 659
    const/4 v8, 0x3

    .line 660
    invoke-direct {v4, v7, v8}, LM1/K;-><init>(Ljava/lang/Object;I)V

    .line 661
    .line 662
    .line 663
    invoke-virtual {v6, v3, v4}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 664
    .line 665
    .line 666
    goto/16 :goto_4

    .line 667
    .line 668
    :cond_14
    instance-of v6, v2, Landroid/webkit/WebSettings;

    .line 669
    .line 670
    if-eqz v6, :cond_16

    .line 671
    .line 672
    move-object v6, v2

    .line 673
    check-cast v6, Landroid/webkit/WebSettings;

    .line 674
    .line 675
    new-instance v7, LM1/g;

    .line 676
    .line 677
    const/16 v8, 0x11

    .line 678
    .line 679
    invoke-direct {v7, v2, v8}, LM1/g;-><init>(Ljava/lang/Object;I)V

    .line 680
    .line 681
    .line 682
    invoke-virtual {v5, v6}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 683
    .line 684
    .line 685
    move-result v8

    .line 686
    if-eqz v8, :cond_15

    .line 687
    .line 688
    goto/16 :goto_4

    .line 689
    .line 690
    :cond_15
    invoke-virtual {v5, v6}, LM1/d;->b(Ljava/lang/Object;)J

    .line 691
    .line 692
    .line 693
    move-result-wide v8

    .line 694
    invoke-virtual {v3}, LM1/O;->a()LC1/l;

    .line 695
    .line 696
    .line 697
    move-result-object v3

    .line 698
    new-instance v6, LB1/s;

    .line 699
    .line 700
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.WebSettings.pigeon_newInstance"

    .line 701
    .line 702
    const/4 v11, 0x0

    .line 703
    invoke-direct {v6, v4, v10, v3, v11}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 704
    .line 705
    .line 706
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 707
    .line 708
    .line 709
    move-result-object v3

    .line 710
    invoke-static {v3}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 711
    .line 712
    .line 713
    move-result-object v3

    .line 714
    new-instance v4, LM1/K;

    .line 715
    .line 716
    const/4 v8, 0x0

    .line 717
    invoke-direct {v4, v7, v8}, LM1/K;-><init>(Ljava/lang/Object;I)V

    .line 718
    .line 719
    .line 720
    invoke-virtual {v6, v3, v4}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 721
    .line 722
    .line 723
    goto/16 :goto_4

    .line 724
    .line 725
    :cond_16
    instance-of v6, v2, LM1/x;

    .line 726
    .line 727
    const-string v7, ""

    .line 728
    .line 729
    const-string v10, "new-instance-error"

    .line 730
    .line 731
    if-eqz v6, :cond_18

    .line 732
    .line 733
    move-object v3, v2

    .line 734
    check-cast v3, LM1/x;

    .line 735
    .line 736
    invoke-virtual {v5, v3}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 737
    .line 738
    .line 739
    move-result v3

    .line 740
    const-string v4, "JavaScriptChannel"

    .line 741
    .line 742
    if-eqz v3, :cond_17

    .line 743
    .line 744
    goto/16 :goto_4

    .line 745
    .line 746
    :cond_17
    new-instance v3, LM1/a;

    .line 747
    .line 748
    const-string v6, "Attempting to create a new Dart instance of JavaScriptChannel, but the class has a nonnull callback method."

    .line 749
    .line 750
    invoke-direct {v3, v10, v6, v7}, LM1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 751
    .line 752
    .line 753
    invoke-static {v3}, LH2/h;->i(Ljava/lang/Throwable;)LO1/c;

    .line 754
    .line 755
    .line 756
    move-result-object v3

    .line 757
    invoke-static {v3}, LO1/d;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 758
    .line 759
    .line 760
    move-result-object v3

    .line 761
    invoke-static {v4, v2, v3}, LM1/h;->l(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 762
    .line 763
    .line 764
    goto/16 :goto_4

    .line 765
    .line 766
    :cond_18
    instance-of v6, v2, Landroid/webkit/WebViewClient;

    .line 767
    .line 768
    if-eqz v6, :cond_1a

    .line 769
    .line 770
    move-object v6, v2

    .line 771
    check-cast v6, Landroid/webkit/WebViewClient;

    .line 772
    .line 773
    new-instance v7, LM1/g;

    .line 774
    .line 775
    const/16 v8, 0xb

    .line 776
    .line 777
    invoke-direct {v7, v2, v8}, LM1/g;-><init>(Ljava/lang/Object;I)V

    .line 778
    .line 779
    .line 780
    invoke-virtual {v5, v6}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 781
    .line 782
    .line 783
    move-result v8

    .line 784
    if-eqz v8, :cond_19

    .line 785
    .line 786
    goto/16 :goto_4

    .line 787
    .line 788
    :cond_19
    invoke-virtual {v5, v6}, LM1/d;->b(Ljava/lang/Object;)J

    .line 789
    .line 790
    .line 791
    move-result-wide v8

    .line 792
    invoke-virtual {v3}, LM1/O;->a()LC1/l;

    .line 793
    .line 794
    .line 795
    move-result-object v3

    .line 796
    new-instance v6, LB1/s;

    .line 797
    .line 798
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_newInstance"

    .line 799
    .line 800
    const/4 v11, 0x0

    .line 801
    invoke-direct {v6, v4, v10, v3, v11}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 802
    .line 803
    .line 804
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 805
    .line 806
    .line 807
    move-result-object v3

    .line 808
    invoke-static {v3}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 809
    .line 810
    .line 811
    move-result-object v3

    .line 812
    new-instance v4, LM1/K;

    .line 813
    .line 814
    const/4 v8, 0x4

    .line 815
    invoke-direct {v4, v7, v8}, LM1/K;-><init>(Ljava/lang/Object;I)V

    .line 816
    .line 817
    .line 818
    invoke-virtual {v6, v3, v4}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 819
    .line 820
    .line 821
    goto/16 :goto_4

    .line 822
    .line 823
    :cond_1a
    instance-of v6, v2, Landroid/webkit/DownloadListener;

    .line 824
    .line 825
    if-eqz v6, :cond_1c

    .line 826
    .line 827
    move-object v3, v2

    .line 828
    check-cast v3, Landroid/webkit/DownloadListener;

    .line 829
    .line 830
    invoke-virtual {v5, v3}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 831
    .line 832
    .line 833
    move-result v3

    .line 834
    const-string v4, "DownloadListener"

    .line 835
    .line 836
    if-eqz v3, :cond_1b

    .line 837
    .line 838
    goto/16 :goto_4

    .line 839
    .line 840
    :cond_1b
    new-instance v3, LM1/a;

    .line 841
    .line 842
    const-string v6, "Attempting to create a new Dart instance of DownloadListener, but the class has a nonnull callback method."

    .line 843
    .line 844
    invoke-direct {v3, v10, v6, v7}, LM1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 845
    .line 846
    .line 847
    invoke-static {v3}, LH2/h;->i(Ljava/lang/Throwable;)LO1/c;

    .line 848
    .line 849
    .line 850
    move-result-object v3

    .line 851
    invoke-static {v3}, LO1/d;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 852
    .line 853
    .line 854
    move-result-object v3

    .line 855
    invoke-static {v4, v2, v3}, LM1/h;->l(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 856
    .line 857
    .line 858
    goto/16 :goto_4

    .line 859
    .line 860
    :cond_1c
    instance-of v6, v2, LM1/Z;

    .line 861
    .line 862
    if-eqz v6, :cond_1e

    .line 863
    .line 864
    move-object v3, v2

    .line 865
    check-cast v3, LM1/Z;

    .line 866
    .line 867
    invoke-virtual {v5, v3}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 868
    .line 869
    .line 870
    move-result v3

    .line 871
    const-string v4, "WebChromeClient"

    .line 872
    .line 873
    if-eqz v3, :cond_1d

    .line 874
    .line 875
    goto/16 :goto_4

    .line 876
    .line 877
    :cond_1d
    new-instance v3, LM1/a;

    .line 878
    .line 879
    const-string v6, "Attempting to create a new Dart instance of WebChromeClient, but the class has a nonnull callback method."

    .line 880
    .line 881
    invoke-direct {v3, v10, v6, v7}, LM1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 882
    .line 883
    .line 884
    invoke-static {v3}, LH2/h;->i(Ljava/lang/Throwable;)LO1/c;

    .line 885
    .line 886
    .line 887
    move-result-object v3

    .line 888
    invoke-static {v3}, LO1/d;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 889
    .line 890
    .line 891
    move-result-object v3

    .line 892
    invoke-static {v4, v2, v3}, LM1/h;->l(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 893
    .line 894
    .line 895
    goto/16 :goto_4

    .line 896
    .line 897
    :cond_1e
    instance-of v6, v2, LM1/u;

    .line 898
    .line 899
    if-eqz v6, :cond_20

    .line 900
    .line 901
    move-object v6, v2

    .line 902
    check-cast v6, LM1/u;

    .line 903
    .line 904
    new-instance v7, LM1/g;

    .line 905
    .line 906
    const/16 v8, 0x12

    .line 907
    .line 908
    invoke-direct {v7, v2, v8}, LM1/g;-><init>(Ljava/lang/Object;I)V

    .line 909
    .line 910
    .line 911
    invoke-virtual {v5, v6}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 912
    .line 913
    .line 914
    move-result v8

    .line 915
    if-eqz v8, :cond_1f

    .line 916
    .line 917
    goto/16 :goto_4

    .line 918
    .line 919
    :cond_1f
    invoke-virtual {v5, v6}, LM1/d;->b(Ljava/lang/Object;)J

    .line 920
    .line 921
    .line 922
    move-result-wide v8

    .line 923
    invoke-virtual {v3}, LM1/O;->a()LC1/l;

    .line 924
    .line 925
    .line 926
    move-result-object v3

    .line 927
    new-instance v6, LB1/s;

    .line 928
    .line 929
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.pigeon_newInstance"

    .line 930
    .line 931
    const/4 v11, 0x0

    .line 932
    invoke-direct {v6, v4, v10, v3, v11}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 933
    .line 934
    .line 935
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 936
    .line 937
    .line 938
    move-result-object v3

    .line 939
    invoke-static {v3}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 940
    .line 941
    .line 942
    move-result-object v3

    .line 943
    new-instance v4, LB1/d;

    .line 944
    .line 945
    const/16 v8, 0xf

    .line 946
    .line 947
    invoke-direct {v4, v7, v8}, LB1/d;-><init>(Ljava/lang/Object;I)V

    .line 948
    .line 949
    .line 950
    invoke-virtual {v6, v3, v4}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 951
    .line 952
    .line 953
    goto/16 :goto_4

    .line 954
    .line 955
    :cond_20
    instance-of v6, v2, Landroid/webkit/WebStorage;

    .line 956
    .line 957
    if-eqz v6, :cond_22

    .line 958
    .line 959
    move-object v6, v2

    .line 960
    check-cast v6, Landroid/webkit/WebStorage;

    .line 961
    .line 962
    new-instance v7, LM1/g;

    .line 963
    .line 964
    const/16 v8, 0x13

    .line 965
    .line 966
    invoke-direct {v7, v2, v8}, LM1/g;-><init>(Ljava/lang/Object;I)V

    .line 967
    .line 968
    .line 969
    invoke-virtual {v5, v6}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 970
    .line 971
    .line 972
    move-result v8

    .line 973
    if-eqz v8, :cond_21

    .line 974
    .line 975
    goto/16 :goto_4

    .line 976
    .line 977
    :cond_21
    invoke-virtual {v5, v6}, LM1/d;->b(Ljava/lang/Object;)J

    .line 978
    .line 979
    .line 980
    move-result-wide v8

    .line 981
    invoke-virtual {v3}, LM1/O;->a()LC1/l;

    .line 982
    .line 983
    .line 984
    move-result-object v3

    .line 985
    new-instance v6, LB1/s;

    .line 986
    .line 987
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.WebStorage.pigeon_newInstance"

    .line 988
    .line 989
    const/4 v11, 0x0

    .line 990
    invoke-direct {v6, v4, v10, v3, v11}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 991
    .line 992
    .line 993
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 994
    .line 995
    .line 996
    move-result-object v3

    .line 997
    invoke-static {v3}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 998
    .line 999
    .line 1000
    move-result-object v3

    .line 1001
    new-instance v4, LM1/K;

    .line 1002
    .line 1003
    const/4 v8, 0x1

    .line 1004
    invoke-direct {v4, v7, v8}, LM1/K;-><init>(Ljava/lang/Object;I)V

    .line 1005
    .line 1006
    .line 1007
    invoke-virtual {v6, v3, v4}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 1008
    .line 1009
    .line 1010
    goto/16 :goto_4

    .line 1011
    .line 1012
    :cond_22
    instance-of v6, v2, Landroid/webkit/WebChromeClient$FileChooserParams;

    .line 1013
    .line 1014
    if-eqz v6, :cond_27

    .line 1015
    .line 1016
    move-object v6, v2

    .line 1017
    check-cast v6, Landroid/webkit/WebChromeClient$FileChooserParams;

    .line 1018
    .line 1019
    new-instance v7, LM1/g;

    .line 1020
    .line 1021
    const/16 v10, 0x14

    .line 1022
    .line 1023
    invoke-direct {v7, v2, v10}, LM1/g;-><init>(Ljava/lang/Object;I)V

    .line 1024
    .line 1025
    .line 1026
    invoke-virtual {v5, v6}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 1027
    .line 1028
    .line 1029
    move-result v10

    .line 1030
    if-eqz v10, :cond_23

    .line 1031
    .line 1032
    goto/16 :goto_4

    .line 1033
    .line 1034
    :cond_23
    invoke-virtual {v5, v6}, LM1/d;->b(Ljava/lang/Object;)J

    .line 1035
    .line 1036
    .line 1037
    move-result-wide v10

    .line 1038
    invoke-virtual {v6}, Landroid/webkit/WebChromeClient$FileChooserParams;->isCaptureEnabled()Z

    .line 1039
    .line 1040
    .line 1041
    move-result v12

    .line 1042
    invoke-virtual {v6}, Landroid/webkit/WebChromeClient$FileChooserParams;->getAcceptTypes()[Ljava/lang/String;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v13

    .line 1046
    invoke-static {v13}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v13

    .line 1050
    invoke-virtual {v6}, Landroid/webkit/WebChromeClient$FileChooserParams;->getMode()I

    .line 1051
    .line 1052
    .line 1053
    move-result v14

    .line 1054
    if-eqz v14, :cond_26

    .line 1055
    .line 1056
    if-eq v14, v9, :cond_25

    .line 1057
    .line 1058
    if-eq v14, v8, :cond_24

    .line 1059
    .line 1060
    sget-object v8, LM1/t;->p:LM1/t;

    .line 1061
    .line 1062
    goto :goto_3

    .line 1063
    :cond_24
    sget-object v8, LM1/t;->o:LM1/t;

    .line 1064
    .line 1065
    goto :goto_3

    .line 1066
    :cond_25
    sget-object v8, LM1/t;->n:LM1/t;

    .line 1067
    .line 1068
    goto :goto_3

    .line 1069
    :cond_26
    sget-object v8, LM1/t;->m:LM1/t;

    .line 1070
    .line 1071
    :goto_3
    invoke-virtual {v6}, Landroid/webkit/WebChromeClient$FileChooserParams;->getFilenameHint()Ljava/lang/String;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v6

    .line 1075
    invoke-virtual {v3}, LM1/O;->a()LC1/l;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v3

    .line 1079
    new-instance v9, LB1/s;

    .line 1080
    .line 1081
    const-string v14, "dev.flutter.pigeon.webview_flutter_android.FileChooserParams.pigeon_newInstance"

    .line 1082
    .line 1083
    const/4 v15, 0x0

    .line 1084
    invoke-direct {v9, v4, v14, v3, v15}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 1085
    .line 1086
    .line 1087
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v3

    .line 1091
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v4

    .line 1095
    filled-new-array {v3, v4, v13, v8, v6}, [Ljava/lang/Object;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v3

    .line 1099
    invoke-static {v3}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v3

    .line 1103
    new-instance v4, LB1/d;

    .line 1104
    .line 1105
    const/16 v6, 0xe

    .line 1106
    .line 1107
    invoke-direct {v4, v7, v6}, LB1/d;-><init>(Ljava/lang/Object;I)V

    .line 1108
    .line 1109
    .line 1110
    invoke-virtual {v9, v3, v4}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 1111
    .line 1112
    .line 1113
    goto/16 :goto_4

    .line 1114
    .line 1115
    :cond_27
    instance-of v6, v2, Landroid/webkit/PermissionRequest;

    .line 1116
    .line 1117
    if-eqz v6, :cond_29

    .line 1118
    .line 1119
    move-object v6, v2

    .line 1120
    check-cast v6, Landroid/webkit/PermissionRequest;

    .line 1121
    .line 1122
    new-instance v7, LM1/g;

    .line 1123
    .line 1124
    const/16 v8, 0x15

    .line 1125
    .line 1126
    invoke-direct {v7, v2, v8}, LM1/g;-><init>(Ljava/lang/Object;I)V

    .line 1127
    .line 1128
    .line 1129
    invoke-virtual {v5, v6}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 1130
    .line 1131
    .line 1132
    move-result v8

    .line 1133
    if-eqz v8, :cond_28

    .line 1134
    .line 1135
    goto/16 :goto_4

    .line 1136
    .line 1137
    :cond_28
    invoke-virtual {v5, v6}, LM1/d;->b(Ljava/lang/Object;)J

    .line 1138
    .line 1139
    .line 1140
    move-result-wide v8

    .line 1141
    invoke-virtual {v6}, Landroid/webkit/PermissionRequest;->getResources()[Ljava/lang/String;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v6

    .line 1145
    invoke-static {v6}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v6

    .line 1149
    invoke-virtual {v3}, LM1/O;->a()LC1/l;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v3

    .line 1153
    new-instance v10, LB1/s;

    .line 1154
    .line 1155
    const-string v11, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.pigeon_newInstance"

    .line 1156
    .line 1157
    const/4 v15, 0x0

    .line 1158
    invoke-direct {v10, v4, v11, v3, v15}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 1159
    .line 1160
    .line 1161
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v3

    .line 1165
    filled-new-array {v3, v6}, [Ljava/lang/Object;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v3

    .line 1169
    invoke-static {v3}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v3

    .line 1173
    new-instance v4, LB1/d;

    .line 1174
    .line 1175
    const/16 v6, 0x13

    .line 1176
    .line 1177
    invoke-direct {v4, v7, v6}, LB1/d;-><init>(Ljava/lang/Object;I)V

    .line 1178
    .line 1179
    .line 1180
    invoke-virtual {v10, v3, v4}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 1181
    .line 1182
    .line 1183
    goto/16 :goto_4

    .line 1184
    .line 1185
    :cond_29
    instance-of v6, v2, Landroid/webkit/WebChromeClient$CustomViewCallback;

    .line 1186
    .line 1187
    if-eqz v6, :cond_2b

    .line 1188
    .line 1189
    move-object v6, v2

    .line 1190
    check-cast v6, Landroid/webkit/WebChromeClient$CustomViewCallback;

    .line 1191
    .line 1192
    new-instance v7, LM1/g;

    .line 1193
    .line 1194
    const/16 v8, 0x16

    .line 1195
    .line 1196
    invoke-direct {v7, v2, v8}, LM1/g;-><init>(Ljava/lang/Object;I)V

    .line 1197
    .line 1198
    .line 1199
    invoke-virtual {v5, v6}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 1200
    .line 1201
    .line 1202
    move-result v8

    .line 1203
    if-eqz v8, :cond_2a

    .line 1204
    .line 1205
    goto/16 :goto_4

    .line 1206
    .line 1207
    :cond_2a
    invoke-virtual {v5, v6}, LM1/d;->b(Ljava/lang/Object;)J

    .line 1208
    .line 1209
    .line 1210
    move-result-wide v8

    .line 1211
    invoke-virtual {v3}, LM1/O;->a()LC1/l;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v3

    .line 1215
    new-instance v6, LB1/s;

    .line 1216
    .line 1217
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.pigeon_newInstance"

    .line 1218
    .line 1219
    const/4 v11, 0x0

    .line 1220
    invoke-direct {v6, v4, v10, v3, v11}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 1221
    .line 1222
    .line 1223
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1224
    .line 1225
    .line 1226
    move-result-object v3

    .line 1227
    invoke-static {v3}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v3

    .line 1231
    new-instance v4, LB1/d;

    .line 1232
    .line 1233
    const/16 v8, 0xc

    .line 1234
    .line 1235
    invoke-direct {v4, v7, v8}, LB1/d;-><init>(Ljava/lang/Object;I)V

    .line 1236
    .line 1237
    .line 1238
    invoke-virtual {v6, v3, v4}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 1239
    .line 1240
    .line 1241
    goto/16 :goto_4

    .line 1242
    .line 1243
    :cond_2b
    instance-of v6, v2, Landroid/view/View;

    .line 1244
    .line 1245
    if-eqz v6, :cond_2d

    .line 1246
    .line 1247
    move-object v6, v2

    .line 1248
    check-cast v6, Landroid/view/View;

    .line 1249
    .line 1250
    new-instance v7, LM1/g;

    .line 1251
    .line 1252
    const/16 v8, 0x17

    .line 1253
    .line 1254
    invoke-direct {v7, v2, v8}, LM1/g;-><init>(Ljava/lang/Object;I)V

    .line 1255
    .line 1256
    .line 1257
    invoke-virtual {v5, v6}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 1258
    .line 1259
    .line 1260
    move-result v8

    .line 1261
    if-eqz v8, :cond_2c

    .line 1262
    .line 1263
    goto/16 :goto_4

    .line 1264
    .line 1265
    :cond_2c
    invoke-virtual {v5, v6}, LM1/d;->b(Ljava/lang/Object;)J

    .line 1266
    .line 1267
    .line 1268
    move-result-wide v8

    .line 1269
    invoke-virtual {v3}, LM1/O;->a()LC1/l;

    .line 1270
    .line 1271
    .line 1272
    move-result-object v3

    .line 1273
    new-instance v6, LB1/s;

    .line 1274
    .line 1275
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.View.pigeon_newInstance"

    .line 1276
    .line 1277
    const/4 v11, 0x0

    .line 1278
    invoke-direct {v6, v4, v10, v3, v11}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 1279
    .line 1280
    .line 1281
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v3

    .line 1285
    invoke-static {v3}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 1286
    .line 1287
    .line 1288
    move-result-object v3

    .line 1289
    new-instance v4, LB1/d;

    .line 1290
    .line 1291
    const/16 v8, 0x1a

    .line 1292
    .line 1293
    invoke-direct {v4, v7, v8}, LB1/d;-><init>(Ljava/lang/Object;I)V

    .line 1294
    .line 1295
    .line 1296
    invoke-virtual {v6, v3, v4}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 1297
    .line 1298
    .line 1299
    goto/16 :goto_4

    .line 1300
    .line 1301
    :cond_2d
    instance-of v6, v2, Landroid/webkit/GeolocationPermissions$Callback;

    .line 1302
    .line 1303
    if-eqz v6, :cond_2f

    .line 1304
    .line 1305
    move-object v6, v2

    .line 1306
    check-cast v6, Landroid/webkit/GeolocationPermissions$Callback;

    .line 1307
    .line 1308
    new-instance v7, LM1/g;

    .line 1309
    .line 1310
    const/16 v8, 0x18

    .line 1311
    .line 1312
    invoke-direct {v7, v2, v8}, LM1/g;-><init>(Ljava/lang/Object;I)V

    .line 1313
    .line 1314
    .line 1315
    invoke-virtual {v5, v6}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 1316
    .line 1317
    .line 1318
    move-result v8

    .line 1319
    if-eqz v8, :cond_2e

    .line 1320
    .line 1321
    goto/16 :goto_4

    .line 1322
    .line 1323
    :cond_2e
    invoke-virtual {v5, v6}, LM1/d;->b(Ljava/lang/Object;)J

    .line 1324
    .line 1325
    .line 1326
    move-result-wide v8

    .line 1327
    invoke-virtual {v3}, LM1/O;->a()LC1/l;

    .line 1328
    .line 1329
    .line 1330
    move-result-object v3

    .line 1331
    new-instance v6, LB1/s;

    .line 1332
    .line 1333
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.pigeon_newInstance"

    .line 1334
    .line 1335
    const/4 v11, 0x0

    .line 1336
    invoke-direct {v6, v4, v10, v3, v11}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 1337
    .line 1338
    .line 1339
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v3

    .line 1343
    invoke-static {v3}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v3

    .line 1347
    new-instance v4, LB1/d;

    .line 1348
    .line 1349
    const/16 v8, 0x10

    .line 1350
    .line 1351
    invoke-direct {v4, v7, v8}, LB1/d;-><init>(Ljava/lang/Object;I)V

    .line 1352
    .line 1353
    .line 1354
    invoke-virtual {v6, v3, v4}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 1355
    .line 1356
    .line 1357
    goto/16 :goto_4

    .line 1358
    .line 1359
    :cond_2f
    instance-of v6, v2, Landroid/webkit/HttpAuthHandler;

    .line 1360
    .line 1361
    if-eqz v6, :cond_31

    .line 1362
    .line 1363
    move-object v6, v2

    .line 1364
    check-cast v6, Landroid/webkit/HttpAuthHandler;

    .line 1365
    .line 1366
    new-instance v7, LM1/g;

    .line 1367
    .line 1368
    const/4 v8, 0x1

    .line 1369
    invoke-direct {v7, v2, v8}, LM1/g;-><init>(Ljava/lang/Object;I)V

    .line 1370
    .line 1371
    .line 1372
    invoke-virtual {v5, v6}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 1373
    .line 1374
    .line 1375
    move-result v8

    .line 1376
    if-eqz v8, :cond_30

    .line 1377
    .line 1378
    goto/16 :goto_4

    .line 1379
    .line 1380
    :cond_30
    invoke-virtual {v5, v6}, LM1/d;->b(Ljava/lang/Object;)J

    .line 1381
    .line 1382
    .line 1383
    move-result-wide v8

    .line 1384
    invoke-virtual {v3}, LM1/O;->a()LC1/l;

    .line 1385
    .line 1386
    .line 1387
    move-result-object v3

    .line 1388
    new-instance v6, LB1/s;

    .line 1389
    .line 1390
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.pigeon_newInstance"

    .line 1391
    .line 1392
    const/4 v11, 0x0

    .line 1393
    invoke-direct {v6, v4, v10, v3, v11}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 1394
    .line 1395
    .line 1396
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1397
    .line 1398
    .line 1399
    move-result-object v3

    .line 1400
    invoke-static {v3}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 1401
    .line 1402
    .line 1403
    move-result-object v3

    .line 1404
    new-instance v4, LB1/d;

    .line 1405
    .line 1406
    const/16 v8, 0x11

    .line 1407
    .line 1408
    invoke-direct {v4, v7, v8}, LB1/d;-><init>(Ljava/lang/Object;I)V

    .line 1409
    .line 1410
    .line 1411
    invoke-virtual {v6, v3, v4}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 1412
    .line 1413
    .line 1414
    goto/16 :goto_4

    .line 1415
    .line 1416
    :cond_31
    instance-of v6, v2, Landroid/os/Message;

    .line 1417
    .line 1418
    if-eqz v6, :cond_33

    .line 1419
    .line 1420
    move-object v6, v2

    .line 1421
    check-cast v6, Landroid/os/Message;

    .line 1422
    .line 1423
    new-instance v7, LM1/g;

    .line 1424
    .line 1425
    const/4 v8, 0x2

    .line 1426
    invoke-direct {v7, v2, v8}, LM1/g;-><init>(Ljava/lang/Object;I)V

    .line 1427
    .line 1428
    .line 1429
    invoke-virtual {v5, v6}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 1430
    .line 1431
    .line 1432
    move-result v8

    .line 1433
    if-eqz v8, :cond_32

    .line 1434
    .line 1435
    goto/16 :goto_4

    .line 1436
    .line 1437
    :cond_32
    invoke-virtual {v5, v6}, LM1/d;->b(Ljava/lang/Object;)J

    .line 1438
    .line 1439
    .line 1440
    move-result-wide v8

    .line 1441
    invoke-virtual {v3}, LM1/O;->a()LC1/l;

    .line 1442
    .line 1443
    .line 1444
    move-result-object v3

    .line 1445
    new-instance v6, LB1/s;

    .line 1446
    .line 1447
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.pigeon_newInstance"

    .line 1448
    .line 1449
    const/4 v11, 0x0

    .line 1450
    invoke-direct {v6, v4, v10, v3, v11}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 1451
    .line 1452
    .line 1453
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1454
    .line 1455
    .line 1456
    move-result-object v3

    .line 1457
    invoke-static {v3}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 1458
    .line 1459
    .line 1460
    move-result-object v3

    .line 1461
    new-instance v4, LB1/d;

    .line 1462
    .line 1463
    const/4 v8, 0x7

    .line 1464
    invoke-direct {v4, v7, v8}, LB1/d;-><init>(Ljava/lang/Object;I)V

    .line 1465
    .line 1466
    .line 1467
    invoke-virtual {v6, v3, v4}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 1468
    .line 1469
    .line 1470
    goto/16 :goto_4

    .line 1471
    .line 1472
    :cond_33
    instance-of v6, v2, Landroid/webkit/ClientCertRequest;

    .line 1473
    .line 1474
    if-eqz v6, :cond_35

    .line 1475
    .line 1476
    move-object v6, v2

    .line 1477
    check-cast v6, Landroid/webkit/ClientCertRequest;

    .line 1478
    .line 1479
    new-instance v7, LM1/g;

    .line 1480
    .line 1481
    const/4 v8, 0x3

    .line 1482
    invoke-direct {v7, v2, v8}, LM1/g;-><init>(Ljava/lang/Object;I)V

    .line 1483
    .line 1484
    .line 1485
    invoke-virtual {v5, v6}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 1486
    .line 1487
    .line 1488
    move-result v8

    .line 1489
    if-eqz v8, :cond_34

    .line 1490
    .line 1491
    goto/16 :goto_4

    .line 1492
    .line 1493
    :cond_34
    invoke-virtual {v5, v6}, LM1/d;->b(Ljava/lang/Object;)J

    .line 1494
    .line 1495
    .line 1496
    move-result-wide v8

    .line 1497
    invoke-virtual {v3}, LM1/O;->a()LC1/l;

    .line 1498
    .line 1499
    .line 1500
    move-result-object v3

    .line 1501
    new-instance v6, LB1/s;

    .line 1502
    .line 1503
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.pigeon_newInstance"

    .line 1504
    .line 1505
    const/4 v11, 0x0

    .line 1506
    invoke-direct {v6, v4, v10, v3, v11}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 1507
    .line 1508
    .line 1509
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1510
    .line 1511
    .line 1512
    move-result-object v3

    .line 1513
    invoke-static {v3}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 1514
    .line 1515
    .line 1516
    move-result-object v3

    .line 1517
    new-instance v4, LB1/d;

    .line 1518
    .line 1519
    const/16 v8, 0x9

    .line 1520
    .line 1521
    invoke-direct {v4, v7, v8}, LB1/d;-><init>(Ljava/lang/Object;I)V

    .line 1522
    .line 1523
    .line 1524
    invoke-virtual {v6, v3, v4}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 1525
    .line 1526
    .line 1527
    goto/16 :goto_4

    .line 1528
    .line 1529
    :cond_35
    instance-of v6, v2, Ljava/security/PrivateKey;

    .line 1530
    .line 1531
    if-eqz v6, :cond_37

    .line 1532
    .line 1533
    move-object v6, v2

    .line 1534
    check-cast v6, Ljava/security/PrivateKey;

    .line 1535
    .line 1536
    new-instance v7, LM1/g;

    .line 1537
    .line 1538
    const/4 v8, 0x4

    .line 1539
    invoke-direct {v7, v2, v8}, LM1/g;-><init>(Ljava/lang/Object;I)V

    .line 1540
    .line 1541
    .line 1542
    invoke-virtual {v5, v6}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 1543
    .line 1544
    .line 1545
    move-result v8

    .line 1546
    if-eqz v8, :cond_36

    .line 1547
    .line 1548
    goto/16 :goto_4

    .line 1549
    .line 1550
    :cond_36
    invoke-virtual {v5, v6}, LM1/d;->b(Ljava/lang/Object;)J

    .line 1551
    .line 1552
    .line 1553
    move-result-wide v8

    .line 1554
    invoke-virtual {v3}, LM1/O;->a()LC1/l;

    .line 1555
    .line 1556
    .line 1557
    move-result-object v3

    .line 1558
    new-instance v6, LB1/s;

    .line 1559
    .line 1560
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.PrivateKey.pigeon_newInstance"

    .line 1561
    .line 1562
    const/4 v11, 0x0

    .line 1563
    invoke-direct {v6, v4, v10, v3, v11}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 1564
    .line 1565
    .line 1566
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1567
    .line 1568
    .line 1569
    move-result-object v3

    .line 1570
    invoke-static {v3}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 1571
    .line 1572
    .line 1573
    move-result-object v3

    .line 1574
    new-instance v4, LB1/d;

    .line 1575
    .line 1576
    const/16 v8, 0x14

    .line 1577
    .line 1578
    invoke-direct {v4, v7, v8}, LB1/d;-><init>(Ljava/lang/Object;I)V

    .line 1579
    .line 1580
    .line 1581
    invoke-virtual {v6, v3, v4}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 1582
    .line 1583
    .line 1584
    goto/16 :goto_4

    .line 1585
    .line 1586
    :cond_37
    instance-of v6, v2, Ljava/security/cert/X509Certificate;

    .line 1587
    .line 1588
    if-eqz v6, :cond_39

    .line 1589
    .line 1590
    move-object v6, v2

    .line 1591
    check-cast v6, Ljava/security/cert/X509Certificate;

    .line 1592
    .line 1593
    new-instance v7, LM1/g;

    .line 1594
    .line 1595
    const/4 v8, 0x5

    .line 1596
    invoke-direct {v7, v2, v8}, LM1/g;-><init>(Ljava/lang/Object;I)V

    .line 1597
    .line 1598
    .line 1599
    invoke-virtual {v5, v6}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 1600
    .line 1601
    .line 1602
    move-result v8

    .line 1603
    if-eqz v8, :cond_38

    .line 1604
    .line 1605
    goto/16 :goto_4

    .line 1606
    .line 1607
    :cond_38
    invoke-virtual {v5, v6}, LM1/d;->b(Ljava/lang/Object;)J

    .line 1608
    .line 1609
    .line 1610
    move-result-wide v8

    .line 1611
    invoke-virtual {v3}, LM1/O;->a()LC1/l;

    .line 1612
    .line 1613
    .line 1614
    move-result-object v3

    .line 1615
    new-instance v6, LB1/s;

    .line 1616
    .line 1617
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.X509Certificate.pigeon_newInstance"

    .line 1618
    .line 1619
    const/4 v11, 0x0

    .line 1620
    invoke-direct {v6, v4, v10, v3, v11}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 1621
    .line 1622
    .line 1623
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1624
    .line 1625
    .line 1626
    move-result-object v3

    .line 1627
    invoke-static {v3}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 1628
    .line 1629
    .line 1630
    move-result-object v3

    .line 1631
    new-instance v4, LM1/K;

    .line 1632
    .line 1633
    const/4 v8, 0x7

    .line 1634
    invoke-direct {v4, v7, v8}, LM1/K;-><init>(Ljava/lang/Object;I)V

    .line 1635
    .line 1636
    .line 1637
    invoke-virtual {v6, v3, v4}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 1638
    .line 1639
    .line 1640
    goto/16 :goto_4

    .line 1641
    .line 1642
    :cond_39
    instance-of v6, v2, Landroid/webkit/SslErrorHandler;

    .line 1643
    .line 1644
    if-eqz v6, :cond_3b

    .line 1645
    .line 1646
    move-object v6, v2

    .line 1647
    check-cast v6, Landroid/webkit/SslErrorHandler;

    .line 1648
    .line 1649
    new-instance v7, LM1/g;

    .line 1650
    .line 1651
    const/4 v8, 0x6

    .line 1652
    invoke-direct {v7, v2, v8}, LM1/g;-><init>(Ljava/lang/Object;I)V

    .line 1653
    .line 1654
    .line 1655
    invoke-virtual {v5, v6}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 1656
    .line 1657
    .line 1658
    move-result v8

    .line 1659
    if-eqz v8, :cond_3a

    .line 1660
    .line 1661
    goto/16 :goto_4

    .line 1662
    .line 1663
    :cond_3a
    invoke-virtual {v5, v6}, LM1/d;->b(Ljava/lang/Object;)J

    .line 1664
    .line 1665
    .line 1666
    move-result-wide v8

    .line 1667
    invoke-virtual {v3}, LM1/O;->a()LC1/l;

    .line 1668
    .line 1669
    .line 1670
    move-result-object v3

    .line 1671
    new-instance v6, LB1/s;

    .line 1672
    .line 1673
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.pigeon_newInstance"

    .line 1674
    .line 1675
    const/4 v11, 0x0

    .line 1676
    invoke-direct {v6, v4, v10, v3, v11}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 1677
    .line 1678
    .line 1679
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1680
    .line 1681
    .line 1682
    move-result-object v3

    .line 1683
    invoke-static {v3}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 1684
    .line 1685
    .line 1686
    move-result-object v3

    .line 1687
    new-instance v4, LB1/d;

    .line 1688
    .line 1689
    const/16 v8, 0x19

    .line 1690
    .line 1691
    invoke-direct {v4, v7, v8}, LB1/d;-><init>(Ljava/lang/Object;I)V

    .line 1692
    .line 1693
    .line 1694
    invoke-virtual {v6, v3, v4}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 1695
    .line 1696
    .line 1697
    goto/16 :goto_4

    .line 1698
    .line 1699
    :cond_3b
    instance-of v6, v2, Landroid/net/http/SslError;

    .line 1700
    .line 1701
    if-eqz v6, :cond_3d

    .line 1702
    .line 1703
    move-object v6, v2

    .line 1704
    check-cast v6, Landroid/net/http/SslError;

    .line 1705
    .line 1706
    new-instance v7, LM1/g;

    .line 1707
    .line 1708
    const/4 v8, 0x7

    .line 1709
    invoke-direct {v7, v2, v8}, LM1/g;-><init>(Ljava/lang/Object;I)V

    .line 1710
    .line 1711
    .line 1712
    invoke-virtual {v5, v6}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 1713
    .line 1714
    .line 1715
    move-result v8

    .line 1716
    if-eqz v8, :cond_3c

    .line 1717
    .line 1718
    goto/16 :goto_4

    .line 1719
    .line 1720
    :cond_3c
    invoke-virtual {v5, v6}, LM1/d;->b(Ljava/lang/Object;)J

    .line 1721
    .line 1722
    .line 1723
    move-result-wide v8

    .line 1724
    invoke-virtual {v6}, Landroid/net/http/SslError;->getCertificate()Landroid/net/http/SslCertificate;

    .line 1725
    .line 1726
    .line 1727
    move-result-object v10

    .line 1728
    invoke-virtual {v6}, Landroid/net/http/SslError;->getUrl()Ljava/lang/String;

    .line 1729
    .line 1730
    .line 1731
    move-result-object v6

    .line 1732
    invoke-virtual {v3}, LM1/O;->a()LC1/l;

    .line 1733
    .line 1734
    .line 1735
    move-result-object v3

    .line 1736
    new-instance v11, LB1/s;

    .line 1737
    .line 1738
    const-string v12, "dev.flutter.pigeon.webview_flutter_android.SslError.pigeon_newInstance"

    .line 1739
    .line 1740
    const/4 v15, 0x0

    .line 1741
    invoke-direct {v11, v4, v12, v3, v15}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 1742
    .line 1743
    .line 1744
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1745
    .line 1746
    .line 1747
    move-result-object v3

    .line 1748
    filled-new-array {v3, v10, v6}, [Ljava/lang/Object;

    .line 1749
    .line 1750
    .line 1751
    move-result-object v3

    .line 1752
    invoke-static {v3}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 1753
    .line 1754
    .line 1755
    move-result-object v3

    .line 1756
    new-instance v4, LB1/d;

    .line 1757
    .line 1758
    const/16 v6, 0x17

    .line 1759
    .line 1760
    invoke-direct {v4, v7, v6}, LB1/d;-><init>(Ljava/lang/Object;I)V

    .line 1761
    .line 1762
    .line 1763
    invoke-virtual {v11, v3, v4}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 1764
    .line 1765
    .line 1766
    goto/16 :goto_4

    .line 1767
    .line 1768
    :cond_3d
    instance-of v6, v2, Landroid/net/http/SslCertificate$DName;

    .line 1769
    .line 1770
    if-eqz v6, :cond_3f

    .line 1771
    .line 1772
    move-object v6, v2

    .line 1773
    check-cast v6, Landroid/net/http/SslCertificate$DName;

    .line 1774
    .line 1775
    new-instance v7, LM1/g;

    .line 1776
    .line 1777
    const/16 v8, 0x8

    .line 1778
    .line 1779
    invoke-direct {v7, v2, v8}, LM1/g;-><init>(Ljava/lang/Object;I)V

    .line 1780
    .line 1781
    .line 1782
    invoke-virtual {v5, v6}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 1783
    .line 1784
    .line 1785
    move-result v8

    .line 1786
    if-eqz v8, :cond_3e

    .line 1787
    .line 1788
    goto/16 :goto_4

    .line 1789
    .line 1790
    :cond_3e
    invoke-virtual {v5, v6}, LM1/d;->b(Ljava/lang/Object;)J

    .line 1791
    .line 1792
    .line 1793
    move-result-wide v8

    .line 1794
    invoke-virtual {v3}, LM1/O;->a()LC1/l;

    .line 1795
    .line 1796
    .line 1797
    move-result-object v3

    .line 1798
    new-instance v6, LB1/s;

    .line 1799
    .line 1800
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.pigeon_newInstance"

    .line 1801
    .line 1802
    const/4 v11, 0x0

    .line 1803
    invoke-direct {v6, v4, v10, v3, v11}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 1804
    .line 1805
    .line 1806
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1807
    .line 1808
    .line 1809
    move-result-object v3

    .line 1810
    invoke-static {v3}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 1811
    .line 1812
    .line 1813
    move-result-object v3

    .line 1814
    new-instance v4, LB1/d;

    .line 1815
    .line 1816
    const/16 v8, 0x16

    .line 1817
    .line 1818
    invoke-direct {v4, v7, v8}, LB1/d;-><init>(Ljava/lang/Object;I)V

    .line 1819
    .line 1820
    .line 1821
    invoke-virtual {v6, v3, v4}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 1822
    .line 1823
    .line 1824
    goto :goto_4

    .line 1825
    :cond_3f
    instance-of v6, v2, Landroid/net/http/SslCertificate;

    .line 1826
    .line 1827
    if-eqz v6, :cond_41

    .line 1828
    .line 1829
    move-object v6, v2

    .line 1830
    check-cast v6, Landroid/net/http/SslCertificate;

    .line 1831
    .line 1832
    new-instance v7, LM1/g;

    .line 1833
    .line 1834
    const/16 v8, 0x9

    .line 1835
    .line 1836
    invoke-direct {v7, v2, v8}, LM1/g;-><init>(Ljava/lang/Object;I)V

    .line 1837
    .line 1838
    .line 1839
    invoke-virtual {v5, v6}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 1840
    .line 1841
    .line 1842
    move-result v8

    .line 1843
    if-eqz v8, :cond_40

    .line 1844
    .line 1845
    goto :goto_4

    .line 1846
    :cond_40
    invoke-virtual {v5, v6}, LM1/d;->b(Ljava/lang/Object;)J

    .line 1847
    .line 1848
    .line 1849
    move-result-wide v8

    .line 1850
    invoke-virtual {v3}, LM1/O;->a()LC1/l;

    .line 1851
    .line 1852
    .line 1853
    move-result-object v3

    .line 1854
    new-instance v6, LB1/s;

    .line 1855
    .line 1856
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.pigeon_newInstance"

    .line 1857
    .line 1858
    const/4 v11, 0x0

    .line 1859
    invoke-direct {v6, v4, v10, v3, v11}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 1860
    .line 1861
    .line 1862
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1863
    .line 1864
    .line 1865
    move-result-object v3

    .line 1866
    invoke-static {v3}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 1867
    .line 1868
    .line 1869
    move-result-object v3

    .line 1870
    new-instance v4, LB1/d;

    .line 1871
    .line 1872
    const/16 v8, 0x15

    .line 1873
    .line 1874
    invoke-direct {v4, v7, v8}, LB1/d;-><init>(Ljava/lang/Object;I)V

    .line 1875
    .line 1876
    .line 1877
    invoke-virtual {v6, v3, v4}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 1878
    .line 1879
    .line 1880
    goto :goto_4

    .line 1881
    :cond_41
    instance-of v6, v2, Ljava/security/cert/Certificate;

    .line 1882
    .line 1883
    if-eqz v6, :cond_43

    .line 1884
    .line 1885
    move-object v6, v2

    .line 1886
    check-cast v6, Ljava/security/cert/Certificate;

    .line 1887
    .line 1888
    new-instance v7, LM1/g;

    .line 1889
    .line 1890
    const/16 v8, 0xa

    .line 1891
    .line 1892
    invoke-direct {v7, v2, v8}, LM1/g;-><init>(Ljava/lang/Object;I)V

    .line 1893
    .line 1894
    .line 1895
    invoke-virtual {v5, v6}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 1896
    .line 1897
    .line 1898
    move-result v8

    .line 1899
    if-eqz v8, :cond_42

    .line 1900
    .line 1901
    goto :goto_4

    .line 1902
    :cond_42
    invoke-virtual {v5, v6}, LM1/d;->b(Ljava/lang/Object;)J

    .line 1903
    .line 1904
    .line 1905
    move-result-wide v8

    .line 1906
    invoke-virtual {v3}, LM1/O;->a()LC1/l;

    .line 1907
    .line 1908
    .line 1909
    move-result-object v3

    .line 1910
    new-instance v6, LB1/s;

    .line 1911
    .line 1912
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.Certificate.pigeon_newInstance"

    .line 1913
    .line 1914
    const/4 v11, 0x0

    .line 1915
    invoke-direct {v6, v4, v10, v3, v11}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 1916
    .line 1917
    .line 1918
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1919
    .line 1920
    .line 1921
    move-result-object v3

    .line 1922
    invoke-static {v3}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 1923
    .line 1924
    .line 1925
    move-result-object v3

    .line 1926
    new-instance v4, LB1/d;

    .line 1927
    .line 1928
    const/16 v8, 0x8

    .line 1929
    .line 1930
    invoke-direct {v4, v7, v8}, LB1/d;-><init>(Ljava/lang/Object;I)V

    .line 1931
    .line 1932
    .line 1933
    invoke-virtual {v6, v3, v4}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 1934
    .line 1935
    .line 1936
    :cond_43
    :goto_4
    invoke-virtual {v5, v2}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 1937
    .line 1938
    .line 1939
    move-result v3

    .line 1940
    if-eqz v3, :cond_45

    .line 1941
    .line 1942
    const/16 v3, 0x80

    .line 1943
    .line 1944
    invoke-virtual {v1, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 1945
    .line 1946
    .line 1947
    invoke-virtual {v5}, LM1/d;->f()V

    .line 1948
    .line 1949
    .line 1950
    iget-object v3, v5, LM1/d;->b:Ljava/util/WeakHashMap;

    .line 1951
    .line 1952
    new-instance v4, LM1/c;

    .line 1953
    .line 1954
    invoke-direct {v4, v2}, LM1/c;-><init>(Ljava/lang/Object;)V

    .line 1955
    .line 1956
    .line 1957
    invoke-virtual {v3, v4}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1958
    .line 1959
    .line 1960
    move-result-object v3

    .line 1961
    check-cast v3, Ljava/lang/Long;

    .line 1962
    .line 1963
    if-eqz v3, :cond_44

    .line 1964
    .line 1965
    iget-object v4, v5, LM1/d;->d:Ljava/util/HashMap;

    .line 1966
    .line 1967
    invoke-virtual {v4, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1968
    .line 1969
    .line 1970
    :cond_44
    invoke-virtual {v0, v1, v3}, LM1/h;->k(LC1/p;Ljava/lang/Object;)V

    .line 1971
    .line 1972
    .line 1973
    return-void

    .line 1974
    :cond_45
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 1975
    .line 1976
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1977
    .line 1978
    .line 1979
    move-result-object v3

    .line 1980
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1981
    .line 1982
    .line 1983
    move-result-object v3

    .line 1984
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1985
    .line 1986
    const-string v5, "Unsupported value: \'"

    .line 1987
    .line 1988
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1989
    .line 1990
    .line 1991
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1992
    .line 1993
    .line 1994
    const-string v2, "\' of type \'"

    .line 1995
    .line 1996
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1997
    .line 1998
    .line 1999
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2000
    .line 2001
    .line 2002
    const-string v2, "\'"

    .line 2003
    .line 2004
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2005
    .line 2006
    .line 2007
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2008
    .line 2009
    .line 2010
    move-result-object v2

    .line 2011
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 2012
    .line 2013
    .line 2014
    throw v1

    .line 2015
    :cond_46
    :goto_5
    invoke-super/range {p0 .. p2}, LI1/u;->k(LC1/p;Ljava/lang/Object;)V

    .line 2016
    .line 2017
    .line 2018
    return-void
.end method

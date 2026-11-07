.class public final LO/d;
.super LN/c;
.source "SourceFile"


# instance fields
.field public final d:Landroid/content/Context;

.field public e:LH/d;

.field public f:Ljava/util/concurrent/Executor;

.field public g:Landroid/os/CancellationSignal;

.field public final h:LO/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LO/d;->d:Landroid/content/Context;

    .line 10
    .line 11
    new-instance p1, Landroid/os/Handler;

    .line 12
    .line 13
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 18
    .line 19
    .line 20
    new-instance v0, LO/c;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-direct {v0, p0, p1, v1}, LO/c;-><init>(LN/c;Landroid/os/Handler;I)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, LO/d;->h:LO/c;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final b(LF0/j;)LH/l;
    .locals 10

    .line 1
    iget-object v0, p1, LF0/j;->s:LV0/i;

    .line 2
    .line 3
    iget-object v3, p1, LF0/j;->q:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p1, LF0/j;->k:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v1, p1, LF0/j;->p:Ljava/lang/String;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const-string v5, "getId(...)"

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    new-instance p1, LH/j;

    .line 15
    .line 16
    invoke-static {v2, v5}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    new-instance v0, Landroid/os/Bundle;

    .line 20
    .line 21
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v3, "androidx.credentials.BUNDLE_KEY_ID"

    .line 25
    .line 26
    invoke-virtual {v0, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string v2, "androidx.credentials.BUNDLE_KEY_PASSWORD"

    .line 30
    .line 31
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {p1, v1, v0, v4}, LH/j;-><init>(Ljava/lang/String;Landroid/os/Bundle;I)V

    .line 35
    .line 36
    .line 37
    goto/16 :goto_10

    .line 38
    .line 39
    :cond_0
    const/4 v1, 0x0

    .line 40
    if-eqz v3, :cond_6

    .line 41
    .line 42
    invoke-static {v2, v5}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p1, LF0/j;->l:Ljava/lang/String;

    .line 46
    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    move-object v4, v0

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move-object v4, v1

    .line 52
    :goto_0
    iget-object v0, p1, LF0/j;->m:Ljava/lang/String;

    .line 53
    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    move-object v6, v0

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    move-object v6, v1

    .line 59
    :goto_1
    iget-object v0, p1, LF0/j;->n:Ljava/lang/String;

    .line 60
    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    move-object v5, v0

    .line 64
    goto :goto_2

    .line 65
    :cond_3
    move-object v5, v1

    .line 66
    :goto_2
    iget-object v0, p1, LF0/j;->r:Ljava/lang/String;

    .line 67
    .line 68
    if-eqz v0, :cond_4

    .line 69
    .line 70
    move-object v8, v0

    .line 71
    goto :goto_3

    .line 72
    :cond_4
    move-object v8, v1

    .line 73
    :goto_3
    iget-object p1, p1, LF0/j;->o:Landroid/net/Uri;

    .line 74
    .line 75
    if-eqz p1, :cond_5

    .line 76
    .line 77
    move-object v7, p1

    .line 78
    goto :goto_4

    .line 79
    :cond_5
    move-object v7, v1

    .line 80
    :goto_4
    new-instance v1, Lh1/c;

    .line 81
    .line 82
    invoke-direct/range {v1 .. v8}, Lh1/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    :goto_5
    move-object p1, v1

    .line 86
    goto/16 :goto_10

    .line 87
    .line 88
    :cond_6
    if-eqz v0, :cond_19

    .line 89
    .line 90
    iget-object p1, v0, LV0/i;->p:LV0/e;

    .line 91
    .line 92
    iget-object v2, v0, LV0/i;->o:LV0/c;

    .line 93
    .line 94
    iget-object v3, v0, LV0/i;->n:LV0/d;

    .line 95
    .line 96
    new-instance v5, LH/j;

    .line 97
    .line 98
    sget-object v6, LP/a;->a:Ljava/util/LinkedHashMap;

    .line 99
    .line 100
    new-instance v6, Lorg/json/JSONObject;

    .line 101
    .line 102
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 103
    .line 104
    .line 105
    if-eqz v3, :cond_7

    .line 106
    .line 107
    move-object v7, v3

    .line 108
    goto :goto_6

    .line 109
    :cond_7
    if-eqz v2, :cond_8

    .line 110
    .line 111
    move-object v7, v2

    .line 112
    goto :goto_6

    .line 113
    :cond_8
    if-eqz p1, :cond_18

    .line 114
    .line 115
    move-object v7, p1

    .line 116
    :goto_6
    instance-of v8, v7, LV0/e;

    .line 117
    .line 118
    if-eqz v8, :cond_b

    .line 119
    .line 120
    check-cast v7, LV0/e;

    .line 121
    .line 122
    iget-object p1, v7, LV0/e;->k:LV0/h;

    .line 123
    .line 124
    const-string v0, "getErrorCode(...)"

    .line 125
    .line 126
    invoke-static {p1, v0}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    iget-object v0, v7, LV0/e;->l:Ljava/lang/String;

    .line 130
    .line 131
    sget-object v1, LP/a;->a:Ljava/util/LinkedHashMap;

    .line 132
    .line 133
    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    check-cast v1, LJ/a;

    .line 138
    .line 139
    if-eqz v1, :cond_a

    .line 140
    .line 141
    sget-object v2, LV0/h;->v:LV0/h;

    .line 142
    .line 143
    if-ne p1, v2, :cond_9

    .line 144
    .line 145
    if-eqz v0, :cond_9

    .line 146
    .line 147
    const-string p1, "Unable to get sync account"

    .line 148
    .line 149
    invoke-static {v0, p1}, Lh2/d;->Y(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    if-ne p1, v4, :cond_9

    .line 154
    .line 155
    new-instance p1, LI/d;

    .line 156
    .line 157
    const-string v0, "Passkey retrieval was cancelled by the user."

    .line 158
    .line 159
    invoke-direct {p1, v0}, LI/d;-><init>(Ljava/lang/CharSequence;)V

    .line 160
    .line 161
    .line 162
    goto :goto_7

    .line 163
    :cond_9
    new-instance p1, LK/b;

    .line 164
    .line 165
    invoke-direct {p1, v1, v0}, LK/b;-><init>(LJ/a;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    goto :goto_7

    .line 169
    :cond_a
    new-instance p1, LK/b;

    .line 170
    .line 171
    new-instance v1, LJ/a;

    .line 172
    .line 173
    const/16 v2, 0x1a

    .line 174
    .line 175
    invoke-direct {v1, v2}, LJ/a;-><init>(I)V

    .line 176
    .line 177
    .line 178
    const-string v2, "unknown fido gms exception - "

    .line 179
    .line 180
    invoke-static {v2, v0}, Lt/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-direct {p1, v1, v0}, LK/b;-><init>(LJ/a;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    :goto_7
    throw p1

    .line 188
    :cond_b
    instance-of v8, v7, LV0/c;

    .line 189
    .line 190
    if-eqz v8, :cond_17

    .line 191
    .line 192
    :try_start_0
    const-string v6, "clientExtensionResults"

    .line 193
    .line 194
    iget-object v7, v0, LV0/i;->m:Lb1/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 195
    .line 196
    :try_start_1
    new-instance v8, Lorg/json/JSONObject;

    .line 197
    .line 198
    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 199
    .line 200
    .line 201
    if-eqz v7, :cond_c

    .line 202
    .line 203
    invoke-virtual {v7}, Lb1/J;->j()[B

    .line 204
    .line 205
    .line 206
    move-result-object v9

    .line 207
    array-length v9, v9

    .line 208
    if-lez v9, :cond_c

    .line 209
    .line 210
    const-string v9, "rawId"

    .line 211
    .line 212
    invoke-virtual {v7}, Lb1/J;->j()[B

    .line 213
    .line 214
    .line 215
    move-result-object v7

    .line 216
    invoke-static {v7}, LE2/a;->p([B)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v7

    .line 220
    invoke-virtual {v8, v9, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 221
    .line 222
    .line 223
    goto :goto_8

    .line 224
    :catch_0
    move-exception v0

    .line 225
    move-object p1, v0

    .line 226
    goto/16 :goto_d

    .line 227
    .line 228
    :cond_c
    :goto_8
    iget-object v7, v0, LV0/i;->r:Ljava/lang/String;

    .line 229
    .line 230
    if-eqz v7, :cond_d

    .line 231
    .line 232
    const-string v9, "authenticatorAttachment"

    .line 233
    .line 234
    invoke-virtual {v8, v9, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 235
    .line 236
    .line 237
    :cond_d
    iget-object v7, v0, LV0/i;->l:Ljava/lang/String;

    .line 238
    .line 239
    if-eqz v7, :cond_e

    .line 240
    .line 241
    if-nez p1, :cond_e

    .line 242
    .line 243
    const-string v9, "type"

    .line 244
    .line 245
    invoke-virtual {v8, v9, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 246
    .line 247
    .line 248
    :cond_e
    iget-object v7, v0, LV0/i;->k:Ljava/lang/String;

    .line 249
    .line 250
    if-eqz v7, :cond_f

    .line 251
    .line 252
    const-string v9, "id"

    .line 253
    .line 254
    invoke-virtual {v8, v9, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 255
    .line 256
    .line 257
    :cond_f
    const-string v7, "response"

    .line 258
    .line 259
    if-eqz v2, :cond_10

    .line 260
    .line 261
    invoke-virtual {v2}, LV0/c;->b()Lorg/json/JSONObject;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    goto :goto_b

    .line 266
    :cond_10
    if-eqz v3, :cond_11

    .line 267
    .line 268
    invoke-virtual {v3}, LV0/d;->b()Lorg/json/JSONObject;

    .line 269
    .line 270
    .line 271
    move-result-object v1
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 272
    goto :goto_b

    .line 273
    :cond_11
    const/4 v4, 0x0

    .line 274
    if-eqz p1, :cond_13

    .line 275
    .line 276
    :try_start_2
    new-instance v1, Lorg/json/JSONObject;

    .line 277
    .line 278
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 279
    .line 280
    .line 281
    const-string v2, "code"

    .line 282
    .line 283
    iget-object v3, p1, LV0/e;->k:LV0/h;

    .line 284
    .line 285
    iget v3, v3, LV0/h;->k:I

    .line 286
    .line 287
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 288
    .line 289
    .line 290
    iget-object p1, p1, LV0/e;->l:Ljava/lang/String;

    .line 291
    .line 292
    if-eqz p1, :cond_12

    .line 293
    .line 294
    const-string v2, "message"

    .line 295
    .line 296
    invoke-virtual {v1, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 297
    .line 298
    .line 299
    goto :goto_9

    .line 300
    :catch_1
    move-exception v0

    .line 301
    move-object p1, v0

    .line 302
    goto :goto_a

    .line 303
    :cond_12
    :goto_9
    :try_start_3
    const-string v7, "error"

    .line 304
    .line 305
    goto :goto_b

    .line 306
    :goto_a
    new-instance v0, Ljava/lang/RuntimeException;

    .line 307
    .line 308
    const-string v1, "Error encoding AuthenticatorErrorResponse to JSON object"

    .line 309
    .line 310
    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 311
    .line 312
    .line 313
    throw v0

    .line 314
    :cond_13
    :goto_b
    if-eqz v1, :cond_14

    .line 315
    .line 316
    invoke-virtual {v8, v7, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 317
    .line 318
    .line 319
    :cond_14
    iget-object p1, v0, LV0/i;->q:LV0/a;

    .line 320
    .line 321
    if-eqz p1, :cond_15

    .line 322
    .line 323
    invoke-virtual {p1}, LV0/a;->b()Lorg/json/JSONObject;

    .line 324
    .line 325
    .line 326
    move-result-object p1

    .line 327
    invoke-virtual {v8, v6, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 328
    .line 329
    .line 330
    goto :goto_c

    .line 331
    :cond_15
    if-eqz v4, :cond_16

    .line 332
    .line 333
    new-instance p1, Lorg/json/JSONObject;

    .line 334
    .line 335
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v8, v6, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 339
    .line 340
    .line 341
    :cond_16
    :goto_c
    :try_start_4
    invoke-virtual {v8}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object p1

    .line 345
    const-string v0, "toJson(...)"

    .line 346
    .line 347
    invoke-static {p1, v0}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    goto :goto_f

    .line 351
    :catchall_0
    move-exception v0

    .line 352
    move-object p1, v0

    .line 353
    goto :goto_e

    .line 354
    :goto_d
    new-instance v0, Ljava/lang/RuntimeException;

    .line 355
    .line 356
    const-string v1, "Error encoding PublicKeyCredential to JSON object"

    .line 357
    .line 358
    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 359
    .line 360
    .line 361
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 362
    :goto_e
    new-instance v0, LI/e;

    .line 363
    .line 364
    new-instance v1, Ljava/lang/StringBuilder;

    .line 365
    .line 366
    const-string v2, "The PublicKeyCredential response json had an unexpected exception when parsing: "

    .line 367
    .line 368
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object p1

    .line 375
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object p1

    .line 382
    invoke-direct {v0, p1}, LI/e;-><init>(Ljava/lang/CharSequence;)V

    .line 383
    .line 384
    .line 385
    throw v0

    .line 386
    :cond_17
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 387
    .line 388
    .line 389
    move-result-object p1

    .line 390
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object p1

    .line 394
    const-string v0, "AuthenticatorResponse expected assertion response but got: "

    .line 395
    .line 396
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object p1

    .line 400
    const-string v0, "PublicKeyUtility"

    .line 401
    .line 402
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 403
    .line 404
    .line 405
    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object p1

    .line 409
    const-string v0, "toString(...)"

    .line 410
    .line 411
    invoke-static {p1, v0}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    :goto_f
    new-instance v0, Landroid/os/Bundle;

    .line 415
    .line 416
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 417
    .line 418
    .line 419
    const-string v1, "androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON"

    .line 420
    .line 421
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    const/4 v1, 0x2

    .line 425
    invoke-direct {v5, p1, v0, v1}, LH/j;-><init>(Ljava/lang/String;Landroid/os/Bundle;I)V

    .line 426
    .line 427
    .line 428
    move-object p1, v5

    .line 429
    goto :goto_10

    .line 430
    :cond_18
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 431
    .line 432
    const-string v0, "No response set."

    .line 433
    .line 434
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    throw p1

    .line 438
    :cond_19
    const-string p1, "BeginSignIn"

    .line 439
    .line 440
    const-string v0, "Credential returned but no google Id or password or passkey found"

    .line 441
    .line 442
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 443
    .line 444
    .line 445
    goto/16 :goto_5

    .line 446
    .line 447
    :goto_10
    if-eqz p1, :cond_1a

    .line 448
    .line 449
    new-instance v0, LH/l;

    .line 450
    .line 451
    invoke-direct {v0, p1}, LH/l;-><init>(LH/c;)V

    .line 452
    .line 453
    .line 454
    return-object v0

    .line 455
    :cond_1a
    new-instance p1, LI/e;

    .line 456
    .line 457
    const-string v0, "When attempting to convert get response, null credential found"

    .line 458
    .line 459
    invoke-direct {p1, v0}, LI/e;-><init>(Ljava/lang/CharSequence;)V

    .line 460
    .line 461
    .line 462
    throw p1
.end method

.method public final c()LH/d;
    .locals 1

    .line 1
    iget-object v0, p0, LO/d;->e:LH/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {v0}, La2/h;->g(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    throw v0
.end method

.method public final d()Ljava/util/concurrent/Executor;
    .locals 1

    .line 1
    iget-object v0, p0, LO/d;->f:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "executor"

    .line 7
    .line 8
    invoke-static {v0}, La2/h;->g(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    throw v0
.end method

.method public final e(LH/k;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;LH/d;)V
    .locals 9

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p4, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "executor"

    .line 12
    .line 13
    invoke-static {p3, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iput-object p2, p0, LO/d;->g:Landroid/os/CancellationSignal;

    .line 17
    .line 18
    iput-object p4, p0, LO/d;->e:LH/d;

    .line 19
    .line 20
    iput-object p3, p0, LO/d;->f:Ljava/util/concurrent/Executor;

    .line 21
    .line 22
    sget-object p3, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:LM/h;

    .line 23
    .line 24
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-static {p2}, LM/h;->a(Landroid/os/CancellationSignal;)Z

    .line 28
    .line 29
    .line 30
    move-result p3

    .line 31
    if-eqz p3, :cond_0

    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    const-string p3, "context"

    .line 35
    .line 36
    iget-object p4, p0, LO/d;->d:Landroid/content/Context;

    .line 37
    .line 38
    invoke-static {p4, p3}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    new-instance v1, LF0/f;

    .line 42
    .line 43
    const/4 p3, 0x0

    .line 44
    invoke-direct {v1, p3}, LF0/f;-><init>(Z)V

    .line 45
    .line 46
    .line 47
    invoke-static {}, LF0/c;->b()LF0/b;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iput-boolean p3, v0, LF0/b;->a:Z

    .line 52
    .line 53
    invoke-virtual {v0}, LF0/b;->a()LF0/c;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    new-instance v6, LF0/e;

    .line 58
    .line 59
    const/4 v2, 0x0

    .line 60
    invoke-direct {v6, p3, v2, v2}, LF0/e;-><init>(Z[BLjava/lang/String;)V

    .line 61
    .line 62
    .line 63
    new-instance v7, LF0/d;

    .line 64
    .line 65
    invoke-direct {v7, v2, p3}, LF0/d;-><init>(Ljava/lang/String;Z)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    const-string v3, "getPackageManager(...)"

    .line 73
    .line 74
    invoke-static {v2, v3}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const-string v3, "com.google.android.gms"

    .line 78
    .line 79
    invoke-virtual {v2, v3, p3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    iget v2, v2, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 84
    .line 85
    iget-object p1, p1, LH/k;->a:Ljava/util/List;

    .line 86
    .line 87
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    move v4, p3

    .line 92
    move-object v2, v0

    .line 93
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_4

    .line 98
    .line 99
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    check-cast v0, LH/m;

    .line 104
    .line 105
    instance-of v3, v0, Lh1/a;

    .line 106
    .line 107
    if-eqz v3, :cond_1

    .line 108
    .line 109
    check-cast v0, Lh1/a;

    .line 110
    .line 111
    invoke-static {}, LF0/c;->b()LF0/b;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    iget-boolean v3, v0, Lh1/a;->f:Z

    .line 116
    .line 117
    iput-boolean v3, v2, LF0/b;->b:Z

    .line 118
    .line 119
    iget-object v3, v0, Lh1/a;->e:Ljava/lang/String;

    .line 120
    .line 121
    iput-object v3, v2, LF0/b;->d:Ljava/lang/Object;

    .line 122
    .line 123
    iget-object v3, v0, Lh1/a;->d:Ljava/lang/String;

    .line 124
    .line 125
    invoke-static {v3}, LM0/r;->d(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    iput-object v3, v2, LF0/b;->c:Ljava/lang/Object;

    .line 129
    .line 130
    const/4 v3, 0x1

    .line 131
    iput-boolean v3, v2, LF0/b;->a:Z

    .line 132
    .line 133
    invoke-virtual {v2}, LF0/b;->a()LF0/c;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    if-nez v4, :cond_3

    .line 138
    .line 139
    iget-boolean v0, v0, Lh1/a;->g:Z

    .line 140
    .line 141
    if-eqz v0, :cond_2

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_2
    move v4, p3

    .line 145
    goto :goto_0

    .line 146
    :cond_3
    :goto_1
    move v4, v3

    .line 147
    goto :goto_0

    .line 148
    :cond_4
    invoke-static {v2}, LM0/r;->f(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    invoke-static {p4}, LS0/a;->v(Landroid/content/Context;)LY0/b;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-static {}, LF0/c;->b()LF0/b;

    .line 156
    .line 157
    .line 158
    move-result-object p4

    .line 159
    iput-boolean p3, p4, LF0/b;->a:Z

    .line 160
    .line 161
    invoke-virtual {p4}, LF0/b;->a()LF0/c;

    .line 162
    .line 163
    .line 164
    iget-object v3, p1, LY0/b;->k:Ljava/lang/String;

    .line 165
    .line 166
    new-instance v0, LF0/g;

    .line 167
    .line 168
    const/4 v5, 0x0

    .line 169
    const/4 v8, 0x0

    .line 170
    invoke-direct/range {v0 .. v8}, LF0/g;-><init>(LF0/f;LF0/c;Ljava/lang/String;ZILF0/e;LF0/d;Z)V

    .line 171
    .line 172
    .line 173
    invoke-static {}, LL0/k;->b()LL0/k;

    .line 174
    .line 175
    .line 176
    move-result-object p4

    .line 177
    new-instance v1, LJ0/c;

    .line 178
    .line 179
    const-string v2, "auth_api_credentials_begin_sign_in"

    .line 180
    .line 181
    const-wide/16 v3, 0x8

    .line 182
    .line 183
    invoke-direct {v1, v2, v3, v4}, LJ0/c;-><init>(Ljava/lang/String;J)V

    .line 184
    .line 185
    .line 186
    filled-new-array {v1}, [LJ0/c;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    iput-object v1, p4, LL0/k;->a:Ljava/lang/Object;

    .line 191
    .line 192
    new-instance v1, LA/c;

    .line 193
    .line 194
    const/16 v2, 0x1b

    .line 195
    .line 196
    invoke-direct {v1, p1, v0, v2}, LA/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 197
    .line 198
    .line 199
    iput-object v1, p4, LL0/k;->d:Ljava/lang/Object;

    .line 200
    .line 201
    iput-boolean p3, p4, LL0/k;->b:Z

    .line 202
    .line 203
    const/16 v0, 0x611

    .line 204
    .line 205
    iput v0, p4, LL0/k;->c:I

    .line 206
    .line 207
    invoke-virtual {p4}, LL0/k;->a()LL0/k;

    .line 208
    .line 209
    .line 210
    move-result-object p4

    .line 211
    invoke-virtual {p1, p3, p4}, LK0/i;->b(ILL0/k;)Lg1/i;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    new-instance p3, LM1/X;

    .line 216
    .line 217
    const/4 p4, 0x2

    .line 218
    invoke-direct {p3, p2, p0, p4}, LM1/X;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 219
    .line 220
    .line 221
    new-instance p4, LM1/K;

    .line 222
    .line 223
    const/16 v0, 0x9

    .line 224
    .line 225
    invoke-direct {p4, p3, v0}, LM1/K;-><init>(Ljava/lang/Object;I)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p1, p4}, Lg1/i;->b(Lg1/d;)V

    .line 229
    .line 230
    .line 231
    new-instance p3, LO/b;

    .line 232
    .line 233
    const/4 p4, 0x0

    .line 234
    invoke-direct {p3, p0, p2, p4}, LO/b;-><init>(LN/c;Landroid/os/CancellationSignal;I)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {p1, p3}, Lg1/i;->a(Lg1/c;)V

    .line 238
    .line 239
    .line 240
    return-void
.end method

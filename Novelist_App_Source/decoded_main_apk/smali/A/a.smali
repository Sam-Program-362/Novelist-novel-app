.class public final LA/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:I

.field public l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, LA/a;->k:I

    iput-object p1, p0, LA/a;->l:Ljava/lang/Object;

    iput-object p2, p0, LA/a;->m:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V
    .locals 0

    .line 2
    iput p3, p0, LA/a;->k:I

    iput-object p1, p0, LA/a;->m:Ljava/lang/Object;

    iput-object p2, p0, LA/a;->l:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()V
    .locals 4

    .line 1
    iget-object v0, p0, LA/a;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lg1/g;

    .line 4
    .line 5
    iget-object v0, v0, Lg1/g;->c:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, LA/a;->m:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lg1/g;

    .line 11
    .line 12
    iget-object v1, v1, Lg1/g;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lg1/c;

    .line 15
    .line 16
    iget-object v2, p0, LA/a;->l:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Lg1/i;

    .line 19
    .line 20
    iget-object v3, v2, Lg1/i;->b:Ljava/lang/Object;

    .line 21
    .line 22
    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    :try_start_1
    iget-object v2, v2, Lg1/i;->e:Ljava/io/Serializable;

    .line 24
    .line 25
    check-cast v2, Ljava/lang/Exception;

    .line 26
    .line 27
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 28
    :try_start_2
    invoke-static {v2}, LM0/r;->f(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v1, v2}, Lg1/c;->b(Ljava/lang/Exception;)V

    .line 32
    .line 33
    .line 34
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 35
    return-void

    .line 36
    :catchall_0
    move-exception v1

    .line 37
    goto :goto_0

    .line 38
    :catchall_1
    move-exception v1

    .line 39
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 40
    :try_start_4
    throw v1

    .line 41
    :goto_0
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 42
    throw v1
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, LA/a;->k:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, LA/a;->m:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Ln2/g;

    .line 12
    .line 13
    iget-object v4, v0, Ln2/g;->m:Li2/q;

    .line 14
    .line 15
    :cond_0
    :try_start_0
    iget-object v3, p0, LA/a;->l:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, Ljava/lang/Runnable;

    .line 18
    .line 19
    invoke-interface {v3}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v3

    .line 24
    sget-object v5, LR1/i;->k:LR1/i;

    .line 25
    .line 26
    invoke-static {v5, v3}, Li2/u;->e(LR1/h;Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    invoke-virtual {v0}, Ln2/g;->h()Ljava/lang/Runnable;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    if-nez v3, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    iput-object v3, p0, LA/a;->l:Ljava/lang/Object;

    .line 37
    .line 38
    add-int/2addr v2, v1

    .line 39
    const/16 v3, 0x10

    .line 40
    .line 41
    if-lt v2, v3, :cond_0

    .line 42
    .line 43
    invoke-virtual {v4, v0}, Li2/q;->d(LR1/h;)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_0

    .line 48
    .line 49
    invoke-virtual {v4, v0, p0}, Li2/q;->c(LR1/h;Ljava/lang/Runnable;)V

    .line 50
    .line 51
    .line 52
    :goto_1
    return-void

    .line 53
    :pswitch_0
    iget-object v0, p0, LA/a;->l:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Lk/f;

    .line 56
    .line 57
    iget-object v1, p0, LA/a;->m:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v1, Lk/i;

    .line 60
    .line 61
    iget-object v4, v1, Lk/i;->q:Landroidx/appcompat/widget/ActionMenuView;

    .line 62
    .line 63
    if-eqz v4, :cond_4

    .line 64
    .line 65
    invoke-virtual {v4}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    if-eqz v4, :cond_4

    .line 70
    .line 71
    invoke-virtual {v0}, Lj/n;->b()Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-eqz v4, :cond_2

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_2
    iget-object v4, v0, Lj/n;->e:Landroid/view/View;

    .line 79
    .line 80
    if-nez v4, :cond_3

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_3
    invoke-virtual {v0, v2, v2, v2, v2}, Lj/n;->d(IIZZ)V

    .line 84
    .line 85
    .line 86
    :goto_2
    iput-object v0, v1, Lk/i;->B:Lk/f;

    .line 87
    .line 88
    :cond_4
    :goto_3
    iput-object v3, v1, Lk/i;->D:LA/a;

    .line 89
    .line 90
    return-void

    .line 91
    :pswitch_1
    iget-object v0, p0, LA/a;->m:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v0, Lg1/g;

    .line 94
    .line 95
    iget-object v0, v0, Lg1/g;->c:Ljava/lang/Object;

    .line 96
    .line 97
    monitor-enter v0

    .line 98
    :try_start_1
    iget-object v1, p0, LA/a;->m:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v1, Lg1/g;

    .line 101
    .line 102
    iget-object v1, v1, Lg1/g;->d:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v1, Lg1/d;

    .line 105
    .line 106
    iget-object v2, p0, LA/a;->l:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v2, Lg1/i;

    .line 109
    .line 110
    invoke-virtual {v2}, Lg1/i;->c()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-interface {v1, v2}, Lg1/d;->c(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    monitor-exit v0

    .line 118
    return-void

    .line 119
    :catchall_1
    move-exception v1

    .line 120
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 121
    throw v1

    .line 122
    :pswitch_2
    invoke-direct {p0}, LA/a;->a()V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :pswitch_3
    iget-object v0, p0, LA/a;->m:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v0, Lg1/g;

    .line 129
    .line 130
    iget-object v0, v0, Lg1/g;->c:Ljava/lang/Object;

    .line 131
    .line 132
    monitor-enter v0

    .line 133
    :try_start_2
    iget-object v1, p0, LA/a;->m:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v1, Lg1/g;

    .line 136
    .line 137
    iget-object v1, v1, Lg1/g;->d:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v1, Lg1/b;

    .line 140
    .line 141
    iget-object v2, p0, LA/a;->l:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v2, Lg1/i;

    .line 144
    .line 145
    invoke-interface {v1, v2}, Lg1/b;->a(Lg1/i;)V

    .line 146
    .line 147
    .line 148
    monitor-exit v0

    .line 149
    return-void

    .line 150
    :catchall_2
    move-exception v1

    .line 151
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 152
    throw v1

    .line 153
    :pswitch_4
    iget-object v0, p0, LA/a;->m:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v0, Lg0/a;

    .line 156
    .line 157
    iget-object v4, p0, LA/a;->l:Ljava/lang/Object;

    .line 158
    .line 159
    iget-object v5, v0, Lg0/a;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 160
    .line 161
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 162
    .line 163
    .line 164
    move-result v5

    .line 165
    if-eqz v5, :cond_5

    .line 166
    .line 167
    iget-object v1, v0, Lg0/a;->o:LH0/d;

    .line 168
    .line 169
    iget-object v2, v1, LH0/d;->h:Lg0/a;

    .line 170
    .line 171
    if-ne v2, v0, :cond_d

    .line 172
    .line 173
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 174
    .line 175
    .line 176
    iput-object v3, v1, LH0/d;->h:Lg0/a;

    .line 177
    .line 178
    invoke-virtual {v1}, LH0/d;->b()V

    .line 179
    .line 180
    .line 181
    goto/16 :goto_8

    .line 182
    .line 183
    :cond_5
    iget-object v5, v0, Lg0/a;->o:LH0/d;

    .line 184
    .line 185
    iget-object v6, v5, LH0/d;->g:Lg0/a;

    .line 186
    .line 187
    if-eq v6, v0, :cond_6

    .line 188
    .line 189
    iget-object v1, v5, LH0/d;->h:Lg0/a;

    .line 190
    .line 191
    if-ne v1, v0, :cond_d

    .line 192
    .line 193
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 194
    .line 195
    .line 196
    iput-object v3, v5, LH0/d;->h:Lg0/a;

    .line 197
    .line 198
    invoke-virtual {v5}, LH0/d;->b()V

    .line 199
    .line 200
    .line 201
    goto :goto_8

    .line 202
    :cond_6
    iget-boolean v6, v5, LH0/d;->c:Z

    .line 203
    .line 204
    if-eqz v6, :cond_7

    .line 205
    .line 206
    goto :goto_8

    .line 207
    :cond_7
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 208
    .line 209
    .line 210
    iput-object v3, v5, LH0/d;->g:Lg0/a;

    .line 211
    .line 212
    iget-object v3, v5, LH0/d;->a:Lf0/a;

    .line 213
    .line 214
    if-eqz v3, :cond_d

    .line 215
    .line 216
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 217
    .line 218
    .line 219
    move-result-object v5

    .line 220
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 221
    .line 222
    .line 223
    move-result-object v6

    .line 224
    if-ne v5, v6, :cond_8

    .line 225
    .line 226
    invoke-virtual {v3, v4}, Landroidx/lifecycle/z;->h(Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    goto :goto_8

    .line 230
    :cond_8
    iget-object v5, v3, Landroidx/lifecycle/z;->a:Ljava/lang/Object;

    .line 231
    .line 232
    monitor-enter v5

    .line 233
    :try_start_3
    iget-object v6, v3, Landroidx/lifecycle/z;->f:Ljava/lang/Object;

    .line 234
    .line 235
    sget-object v7, Landroidx/lifecycle/z;->k:Ljava/lang/Object;

    .line 236
    .line 237
    if-ne v6, v7, :cond_9

    .line 238
    .line 239
    goto :goto_4

    .line 240
    :cond_9
    move v1, v2

    .line 241
    :goto_4
    iput-object v4, v3, Landroidx/lifecycle/z;->f:Ljava/lang/Object;

    .line 242
    .line 243
    monitor-exit v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 244
    if-nez v1, :cond_a

    .line 245
    .line 246
    goto :goto_8

    .line 247
    :cond_a
    invoke-static {}, Ll/a;->S()Ll/a;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    iget-object v2, v3, Landroidx/lifecycle/z;->j:LA/b;

    .line 252
    .line 253
    iget-object v1, v1, Ll/a;->i:Ll/c;

    .line 254
    .line 255
    iget-object v3, v1, Ll/c;->k:Landroid/os/Handler;

    .line 256
    .line 257
    if-nez v3, :cond_c

    .line 258
    .line 259
    iget-object v3, v1, Ll/c;->i:Ljava/lang/Object;

    .line 260
    .line 261
    monitor-enter v3

    .line 262
    :try_start_4
    iget-object v4, v1, Ll/c;->k:Landroid/os/Handler;

    .line 263
    .line 264
    if-nez v4, :cond_b

    .line 265
    .line 266
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 267
    .line 268
    .line 269
    move-result-object v4

    .line 270
    invoke-static {v4}, Ll/c;->S(Landroid/os/Looper;)Landroid/os/Handler;

    .line 271
    .line 272
    .line 273
    move-result-object v4

    .line 274
    iput-object v4, v1, Ll/c;->k:Landroid/os/Handler;

    .line 275
    .line 276
    goto :goto_5

    .line 277
    :catchall_3
    move-exception v0

    .line 278
    goto :goto_6

    .line 279
    :cond_b
    :goto_5
    monitor-exit v3

    .line 280
    goto :goto_7

    .line 281
    :goto_6
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 282
    throw v0

    .line 283
    :cond_c
    :goto_7
    iget-object v1, v1, Ll/c;->k:Landroid/os/Handler;

    .line 284
    .line 285
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 286
    .line 287
    .line 288
    goto :goto_8

    .line 289
    :catchall_4
    move-exception v0

    .line 290
    :try_start_5
    monitor-exit v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 291
    throw v0

    .line 292
    :cond_d
    :goto_8
    const/4 v1, 0x3

    .line 293
    iput v1, v0, Lg0/a;->l:I

    .line 294
    .line 295
    return-void

    .line 296
    :pswitch_5
    iget-object v0, p0, LA/a;->m:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v0, LL0/y;

    .line 299
    .line 300
    iget-object v1, p0, LA/a;->l:Ljava/lang/Object;

    .line 301
    .line 302
    check-cast v1, Lf1/f;

    .line 303
    .line 304
    iget-object v2, v1, Lf1/f;->l:LJ0/a;

    .line 305
    .line 306
    iget v4, v2, LJ0/a;->l:I

    .line 307
    .line 308
    if-nez v4, :cond_13

    .line 309
    .line 310
    iget-object v1, v1, Lf1/f;->m:LM0/o;

    .line 311
    .line 312
    invoke-static {v1}, LM0/r;->f(Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    iget-object v2, v1, LM0/o;->m:LJ0/a;

    .line 316
    .line 317
    iget v4, v2, LJ0/a;->l:I

    .line 318
    .line 319
    if-nez v4, :cond_12

    .line 320
    .line 321
    iget-object v2, v0, LL0/y;->h:LL0/r;

    .line 322
    .line 323
    iget-object v1, v1, LM0/o;->l:Landroid/os/IBinder;

    .line 324
    .line 325
    if-nez v1, :cond_e

    .line 326
    .line 327
    move-object v4, v3

    .line 328
    goto :goto_9

    .line 329
    :cond_e
    sget v4, LM0/a;->b:I

    .line 330
    .line 331
    const-string v4, "com.google.android.gms.common.internal.IAccountAccessor"

    .line 332
    .line 333
    invoke-interface {v1, v4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 334
    .line 335
    .line 336
    move-result-object v4

    .line 337
    instance-of v5, v4, LM0/f;

    .line 338
    .line 339
    if-eqz v5, :cond_f

    .line 340
    .line 341
    check-cast v4, LM0/f;

    .line 342
    .line 343
    goto :goto_9

    .line 344
    :cond_f
    new-instance v4, LM0/F;

    .line 345
    .line 346
    invoke-direct {v4, v1}, LM0/F;-><init>(Landroid/os/IBinder;)V

    .line 347
    .line 348
    .line 349
    :goto_9
    iget-object v1, v0, LL0/y;->e:Ljava/util/Set;

    .line 350
    .line 351
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 352
    .line 353
    .line 354
    if-eqz v4, :cond_11

    .line 355
    .line 356
    if-nez v1, :cond_10

    .line 357
    .line 358
    goto :goto_a

    .line 359
    :cond_10
    iput-object v4, v2, LL0/r;->c:LM0/f;

    .line 360
    .line 361
    iput-object v1, v2, LL0/r;->d:Ljava/util/Set;

    .line 362
    .line 363
    iget-boolean v3, v2, LL0/r;->e:Z

    .line 364
    .line 365
    if-eqz v3, :cond_14

    .line 366
    .line 367
    iget-object v2, v2, LL0/r;->a:LK0/c;

    .line 368
    .line 369
    invoke-interface {v2, v4, v1}, LK0/c;->f(LM0/f;Ljava/util/Set;)V

    .line 370
    .line 371
    .line 372
    goto :goto_b

    .line 373
    :cond_11
    :goto_a
    new-instance v1, Ljava/lang/Exception;

    .line 374
    .line 375
    invoke-direct {v1}, Ljava/lang/Exception;-><init>()V

    .line 376
    .line 377
    .line 378
    const-string v4, "GoogleApiManager"

    .line 379
    .line 380
    const-string v5, "Received null response from onSignInSuccess"

    .line 381
    .line 382
    invoke-static {v4, v5, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 383
    .line 384
    .line 385
    new-instance v1, LJ0/a;

    .line 386
    .line 387
    const/4 v4, 0x4

    .line 388
    invoke-direct {v1, v4, v3, v3}, LJ0/a;-><init>(ILandroid/app/PendingIntent;Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v2, v1}, LL0/r;->b(LJ0/a;)V

    .line 392
    .line 393
    .line 394
    goto :goto_b

    .line 395
    :cond_12
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    new-instance v3, Ljava/lang/Exception;

    .line 400
    .line 401
    invoke-direct {v3}, Ljava/lang/Exception;-><init>()V

    .line 402
    .line 403
    .line 404
    const-string v4, "Sign-in succeeded with resolve account failure: "

    .line 405
    .line 406
    const-string v5, "SignInCoordinator"

    .line 407
    .line 408
    invoke-virtual {v4, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v1

    .line 412
    invoke-static {v5, v1, v3}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 413
    .line 414
    .line 415
    iget-object v1, v0, LL0/y;->h:LL0/r;

    .line 416
    .line 417
    invoke-virtual {v1, v2}, LL0/r;->b(LJ0/a;)V

    .line 418
    .line 419
    .line 420
    iget-object v0, v0, LL0/y;->g:Lf1/a;

    .line 421
    .line 422
    invoke-interface {v0}, LK0/c;->k()V

    .line 423
    .line 424
    .line 425
    goto :goto_c

    .line 426
    :cond_13
    iget-object v1, v0, LL0/y;->h:LL0/r;

    .line 427
    .line 428
    invoke-virtual {v1, v2}, LL0/r;->b(LJ0/a;)V

    .line 429
    .line 430
    .line 431
    :cond_14
    :goto_b
    iget-object v0, v0, LL0/y;->g:Lf1/a;

    .line 432
    .line 433
    invoke-interface {v0}, LK0/c;->k()V

    .line 434
    .line 435
    .line 436
    :goto_c
    return-void

    .line 437
    :pswitch_6
    iget-object v0, p0, LA/a;->l:Ljava/lang/Object;

    .line 438
    .line 439
    check-cast v0, LJ0/a;

    .line 440
    .line 441
    iget-object v2, p0, LA/a;->m:Ljava/lang/Object;

    .line 442
    .line 443
    check-cast v2, LL0/r;

    .line 444
    .line 445
    iget-object v4, v2, LL0/r;->a:LK0/c;

    .line 446
    .line 447
    iget-object v5, v2, LL0/r;->f:LL0/d;

    .line 448
    .line 449
    iget-object v5, v5, LL0/d;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 450
    .line 451
    iget-object v6, v2, LL0/r;->b:LL0/a;

    .line 452
    .line 453
    invoke-virtual {v5, v6}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v5

    .line 457
    check-cast v5, LL0/p;

    .line 458
    .line 459
    if-nez v5, :cond_15

    .line 460
    .line 461
    goto :goto_d

    .line 462
    :cond_15
    iget v6, v0, LJ0/a;->l:I

    .line 463
    .line 464
    if-nez v6, :cond_17

    .line 465
    .line 466
    iput-boolean v1, v2, LL0/r;->e:Z

    .line 467
    .line 468
    invoke-interface {v4}, LK0/c;->l()Z

    .line 469
    .line 470
    .line 471
    move-result v0

    .line 472
    if-eqz v0, :cond_16

    .line 473
    .line 474
    iget-boolean v0, v2, LL0/r;->e:Z

    .line 475
    .line 476
    if-eqz v0, :cond_18

    .line 477
    .line 478
    iget-object v0, v2, LL0/r;->c:LM0/f;

    .line 479
    .line 480
    if-eqz v0, :cond_18

    .line 481
    .line 482
    iget-object v1, v2, LL0/r;->d:Ljava/util/Set;

    .line 483
    .line 484
    invoke-interface {v4, v0, v1}, LK0/c;->f(LM0/f;Ljava/util/Set;)V

    .line 485
    .line 486
    .line 487
    goto :goto_d

    .line 488
    :cond_16
    :try_start_6
    invoke-interface {v4}, LK0/c;->b()Ljava/util/Set;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    invoke-interface {v4, v3, v0}, LK0/c;->f(LM0/f;Ljava/util/Set;)V
    :try_end_6
    .catch Ljava/lang/SecurityException; {:try_start_6 .. :try_end_6} :catch_0

    .line 493
    .line 494
    .line 495
    goto :goto_d

    .line 496
    :catch_0
    move-exception v0

    .line 497
    const-string v1, "GoogleApiManager"

    .line 498
    .line 499
    const-string v2, "Failed to get service from broker. "

    .line 500
    .line 501
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 502
    .line 503
    .line 504
    const-string v0, "Failed to get service from broker."

    .line 505
    .line 506
    invoke-interface {v4, v0}, LK0/c;->d(Ljava/lang/String;)V

    .line 507
    .line 508
    .line 509
    new-instance v0, LJ0/a;

    .line 510
    .line 511
    const/16 v1, 0xa

    .line 512
    .line 513
    invoke-direct {v0, v1, v3, v3}, LJ0/a;-><init>(ILandroid/app/PendingIntent;Ljava/lang/String;)V

    .line 514
    .line 515
    .line 516
    invoke-virtual {v5, v0, v3}, LL0/p;->o(LJ0/a;Ljava/lang/RuntimeException;)V

    .line 517
    .line 518
    .line 519
    goto :goto_d

    .line 520
    :cond_17
    invoke-virtual {v5, v0, v3}, LL0/p;->o(LJ0/a;Ljava/lang/RuntimeException;)V

    .line 521
    .line 522
    .line 523
    :cond_18
    :goto_d
    return-void

    .line 524
    :pswitch_7
    iget-object v0, p0, LA/a;->l:Ljava/lang/Object;

    .line 525
    .line 526
    check-cast v0, LA/i;

    .line 527
    .line 528
    iget-object v1, p0, LA/a;->m:Ljava/lang/Object;

    .line 529
    .line 530
    invoke-virtual {v0, v1}, LA/i;->accept(Ljava/lang/Object;)V

    .line 531
    .line 532
    .line 533
    return-void

    .line 534
    :pswitch_8
    iget-object v0, p0, LA/a;->l:Ljava/lang/Object;

    .line 535
    .line 536
    check-cast v0, Lw/d;

    .line 537
    .line 538
    iget-object v1, p0, LA/a;->m:Ljava/lang/Object;

    .line 539
    .line 540
    check-cast v1, Landroid/graphics/Typeface;

    .line 541
    .line 542
    iget-object v0, v0, Lw/d;->a:Ljava/lang/Object;

    .line 543
    .line 544
    check-cast v0, Lk/s;

    .line 545
    .line 546
    if-eqz v0, :cond_19

    .line 547
    .line 548
    invoke-virtual {v0, v1}, Lk/s;->b(Landroid/graphics/Typeface;)V

    .line 549
    .line 550
    .line 551
    :cond_19
    return-void

    .line 552
    nop

    .line 553
    :pswitch_data_0
    .packed-switch 0x0
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

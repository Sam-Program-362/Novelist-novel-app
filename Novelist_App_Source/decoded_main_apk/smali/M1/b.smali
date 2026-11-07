.class public final synthetic LM1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:I

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lb0/l;Lb0/U;)V
    .locals 0

    .line 1
    const/4 p2, 0x6

    iput p2, p0, LM1/b;->k:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM1/b;->l:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, LM1/b;->k:I

    iput-object p1, p0, LM1/b;->l:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, LM1/b;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LM1/b;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lw1/a;

    .line 9
    .line 10
    iget-object v0, v0, Lw1/a;->l:Lw1/c;

    .line 11
    .line 12
    iget-object v0, v0, Lw1/c;->f:Lio/flutter/embedding/engine/FlutterJNI;

    .line 13
    .line 14
    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterJNI;->prefetchDefaultFontManager()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object v0, p0, LM1/b;->l:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lk/s;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    iget-object v0, p0, LM1/b;->l:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Lt1/i;

    .line 29
    .line 30
    iget-object v1, v0, Lt1/i;->a:Ljava/util/concurrent/ExecutorService;

    .line 31
    .line 32
    iget-object v2, v0, Lt1/i;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 33
    .line 34
    iget-object v3, v0, Lt1/i;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 35
    .line 36
    const/4 v4, 0x1

    .line 37
    const/4 v5, 0x0

    .line 38
    invoke-virtual {v3, v5, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    :try_start_0
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    check-cast v4, Ljava/lang/Runnable;

    .line 49
    .line 50
    if-eqz v4, :cond_0

    .line 51
    .line 52
    invoke-interface {v4}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :catchall_0
    move-exception v4

    .line 57
    goto :goto_1

    .line 58
    :cond_0
    :goto_0
    invoke-virtual {v3, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-nez v2, :cond_2

    .line 66
    .line 67
    new-instance v2, LM1/b;

    .line 68
    .line 69
    const/16 v3, 0xb

    .line 70
    .line 71
    invoke-direct {v2, v0, v3}, LM1/b;-><init>(Ljava/lang/Object;I)V

    .line 72
    .line 73
    .line 74
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 75
    .line 76
    .line 77
    goto :goto_2

    .line 78
    :goto_1
    invoke-virtual {v3, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-nez v2, :cond_1

    .line 86
    .line 87
    new-instance v2, LM1/b;

    .line 88
    .line 89
    const/16 v3, 0xb

    .line 90
    .line 91
    invoke-direct {v2, v0, v3}, LM1/b;-><init>(Ljava/lang/Object;I)V

    .line 92
    .line 93
    .line 94
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 95
    .line 96
    .line 97
    :cond_1
    throw v4

    .line 98
    :cond_2
    :goto_2
    return-void

    .line 99
    :pswitch_2
    iget-object v0, p0, LM1/b;->l:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v0, Ljava/io/InputStream;

    .line 102
    .line 103
    invoke-static {v0}, Lorg/apache/tika/parser/external/ExternalParser;->a(Ljava/io/InputStream;)V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :pswitch_3
    iget-object v0, p0, LM1/b;->l:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v0, Lk1/e;

    .line 110
    .line 111
    iget-object v1, v0, Lk1/e;->f:Ljava/util/ArrayList;

    .line 112
    .line 113
    :goto_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-nez v2, :cond_4

    .line 118
    .line 119
    iget-object v2, v0, Lk1/e;->l:Ljava/lang/Integer;

    .line 120
    .line 121
    if-eqz v2, :cond_3

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_3
    const/4 v2, 0x0

    .line 125
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    check-cast v3, Ll1/d;

    .line 130
    .line 131
    iget-object v3, v3, Ll1/d;->a:Ljava/lang/Runnable;

    .line 132
    .line 133
    invoke-interface {v3}, Ljava/lang/Runnable;->run()V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_4
    :goto_4
    return-void

    .line 141
    :pswitch_4
    iget-object v0, p0, LM1/b;->l:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v0, LB1/o;

    .line 144
    .line 145
    iget-object v0, v0, LB1/o;->b:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v0, LB1/o;

    .line 148
    .line 149
    invoke-virtual {v0}, LB1/o;->b()V

    .line 150
    .line 151
    .line 152
    return-void

    .line 153
    :pswitch_5
    iget-object v0, p0, LM1/b;->l:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v0, Lio/flutter/plugin/platform/s;

    .line 156
    .line 157
    const/4 v1, 0x0

    .line 158
    invoke-virtual {v0, v1}, Lio/flutter/plugin/platform/s;->e(Z)V

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :pswitch_6
    iget-object v0, p0, LM1/b;->l:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v0, Lb0/l;

    .line 165
    .line 166
    const-string v1, "this$0"

    .line 167
    .line 168
    invoke-static {v0, v1}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    const-string v1, "$operation"

    .line 172
    .line 173
    const/4 v2, 0x0

    .line 174
    invoke-static {v2, v1}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, v2}, Lb0/l;->a(Lb0/U;)V

    .line 178
    .line 179
    .line 180
    return-void

    .line 181
    :pswitch_7
    iget-object v0, p0, LM1/b;->l:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v0, Lb/m;

    .line 184
    .line 185
    invoke-static {v0}, Lb/m;->a(Lb/m;)V

    .line 186
    .line 187
    .line 188
    return-void

    .line 189
    :pswitch_8
    iget-object v0, p0, LM1/b;->l:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v0, Lb/i;

    .line 192
    .line 193
    iget-object v1, v0, Lb/i;->l:Ljava/lang/Runnable;

    .line 194
    .line 195
    if-eqz v1, :cond_5

    .line 196
    .line 197
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 198
    .line 199
    .line 200
    const/4 v1, 0x0

    .line 201
    iput-object v1, v0, Lb/i;->l:Ljava/lang/Runnable;

    .line 202
    .line 203
    :cond_5
    return-void

    .line 204
    :pswitch_9
    iget-object v0, p0, LM1/b;->l:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v0, Landroidx/lifecycle/E;

    .line 207
    .line 208
    iget-object v1, v0, Landroidx/lifecycle/E;->p:Landroidx/lifecycle/u;

    .line 209
    .line 210
    iget v2, v0, Landroidx/lifecycle/E;->l:I

    .line 211
    .line 212
    const/4 v3, 0x1

    .line 213
    if-nez v2, :cond_6

    .line 214
    .line 215
    iput-boolean v3, v0, Landroidx/lifecycle/E;->m:Z

    .line 216
    .line 217
    sget-object v2, Landroidx/lifecycle/l;->ON_PAUSE:Landroidx/lifecycle/l;

    .line 218
    .line 219
    invoke-virtual {v1, v2}, Landroidx/lifecycle/u;->e(Landroidx/lifecycle/l;)V

    .line 220
    .line 221
    .line 222
    :cond_6
    iget v2, v0, Landroidx/lifecycle/E;->k:I

    .line 223
    .line 224
    if-nez v2, :cond_7

    .line 225
    .line 226
    iget-boolean v2, v0, Landroidx/lifecycle/E;->m:Z

    .line 227
    .line 228
    if-eqz v2, :cond_7

    .line 229
    .line 230
    sget-object v2, Landroidx/lifecycle/l;->ON_STOP:Landroidx/lifecycle/l;

    .line 231
    .line 232
    invoke-virtual {v1, v2}, Landroidx/lifecycle/u;->e(Landroidx/lifecycle/l;)V

    .line 233
    .line 234
    .line 235
    iput-boolean v3, v0, Landroidx/lifecycle/E;->n:Z

    .line 236
    .line 237
    :cond_7
    return-void

    .line 238
    :pswitch_a
    iget-object v0, p0, LM1/b;->l:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v0, LQ/b;

    .line 241
    .line 242
    invoke-virtual {v0}, LQ/b;->d()LH/d;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    new-instance v1, LI/e;

    .line 247
    .line 248
    const-string v2, "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."

    .line 249
    .line 250
    invoke-direct {v1, v2}, LI/e;-><init>(Ljava/lang/CharSequence;)V

    .line 251
    .line 252
    .line 253
    invoke-interface {v0, v1}, LH/d;->b(Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    return-void

    .line 257
    :pswitch_b
    iget-object v0, p0, LM1/b;->l:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v0, LO/d;

    .line 260
    .line 261
    invoke-virtual {v0}, LO/d;->c()LH/d;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    new-instance v1, LI/e;

    .line 266
    .line 267
    const-string v2, "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."

    .line 268
    .line 269
    invoke-direct {v1, v2}, LI/e;-><init>(Ljava/lang/CharSequence;)V

    .line 270
    .line 271
    .line 272
    invoke-interface {v0, v1}, LH/d;->b(Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    return-void

    .line 276
    :pswitch_c
    iget-object v0, p0, LM1/b;->l:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast v0, LM1/d;

    .line 279
    .line 280
    iget-boolean v1, v0, LM1/d;->j:Z

    .line 281
    .line 282
    if-eqz v1, :cond_8

    .line 283
    .line 284
    goto :goto_6

    .line 285
    :cond_8
    :goto_5
    iget-object v1, v0, LM1/d;->e:Ljava/lang/ref/ReferenceQueue;

    .line 286
    .line 287
    invoke-virtual {v1}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    check-cast v1, LM1/c;

    .line 292
    .line 293
    if-eqz v1, :cond_a

    .line 294
    .line 295
    iget-object v2, v0, LM1/d;->f:Ljava/util/HashMap;

    .line 296
    .line 297
    instance-of v3, v2, Lb2/a;

    .line 298
    .line 299
    const/4 v4, 0x0

    .line 300
    if-nez v3, :cond_9

    .line 301
    .line 302
    invoke-interface {v2, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    check-cast v1, Ljava/lang/Long;

    .line 307
    .line 308
    if-eqz v1, :cond_8

    .line 309
    .line 310
    iget-object v2, v0, LM1/d;->c:Ljava/util/HashMap;

    .line 311
    .line 312
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    iget-object v2, v0, LM1/d;->d:Ljava/util/HashMap;

    .line 316
    .line 317
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    iget-object v2, v0, LM1/d;->a:LB1/g;

    .line 321
    .line 322
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 323
    .line 324
    .line 325
    move-result-wide v5

    .line 326
    iget-object v2, v2, LB1/g;->l:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast v2, LM1/f;

    .line 329
    .line 330
    new-instance v3, LM1/i;

    .line 331
    .line 332
    invoke-direct {v3, v5, v6}, LM1/i;-><init>(J)V

    .line 333
    .line 334
    .line 335
    new-instance v5, LB1/s;

    .line 336
    .line 337
    iget-object v2, v2, LM1/f;->a:LC1/f;

    .line 338
    .line 339
    sget-object v6, LM1/f;->b:LO1/e;

    .line 340
    .line 341
    invoke-virtual {v6}, LO1/e;->a()Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v6

    .line 345
    check-cast v6, LC1/l;

    .line 346
    .line 347
    const-string v7, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference"

    .line 348
    .line 349
    invoke-direct {v5, v2, v7, v6, v4}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 350
    .line 351
    .line 352
    invoke-static {v1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 353
    .line 354
    .line 355
    move-result-object v1

    .line 356
    new-instance v2, LB1/d;

    .line 357
    .line 358
    const/4 v4, 0x6

    .line 359
    invoke-direct {v2, v3, v4}, LB1/d;-><init>(Ljava/lang/Object;I)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v5, v1, v2}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 363
    .line 364
    .line 365
    goto :goto_5

    .line 366
    :cond_9
    const-string v0, "kotlin.collections.MutableMap"

    .line 367
    .line 368
    invoke-static {v2, v0}, La2/r;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    throw v4

    .line 372
    :cond_a
    iget-object v1, v0, LM1/d;->g:Landroid/os/Handler;

    .line 373
    .line 374
    iget-object v2, v0, LM1/d;->h:LM1/b;

    .line 375
    .line 376
    iget-wide v3, v0, LM1/d;->k:J

    .line 377
    .line 378
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 379
    .line 380
    .line 381
    :goto_6
    return-void

    .line 382
    nop

    .line 383
    :pswitch_data_0
    .packed-switch 0x0
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

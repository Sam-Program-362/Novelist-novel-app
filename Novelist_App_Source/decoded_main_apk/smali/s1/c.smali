.class public final Ls1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN1/b;


# static fields
.field public static y:J = 0x1L

.field public static final z:Ljava/util/HashMap;


# instance fields
.field public final a:Lio/flutter/embedding/engine/FlutterJNI;

.field public final b:Lio/flutter/embedding/engine/renderer/k;

.field public final c:Lt1/c;

.field public final d:Lj0/a;

.field public final e:LD1/a;

.field public final f:LA0/j;

.field public final g:LB1/f;

.field public final h:LB1/a;

.field public final i:LB1/c;

.field public final j:LB1/c;

.field public final k:LB1/p;

.field public final l:LA/c;

.field public final m:LH0/i;

.field public final n:LB1/g;

.field public final o:LB1/r;

.field public final p:LB1/a;

.field public final q:LB1/g;

.field public final r:LA/c;

.field public final s:Lio/flutter/plugin/platform/s;

.field public final t:Lio/flutter/plugin/platform/r;

.field public final u:Lb1/Q;

.field public final v:Ljava/util/HashSet;

.field public final w:J

.field public final x:Ls1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ls1/c;->z:Ljava/util/HashMap;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lio/flutter/embedding/engine/FlutterJNI;Lio/flutter/plugin/platform/s;ZZ)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ls1/c;->v:Ljava/util/HashSet;

    .line 10
    .line 11
    new-instance v0, Ls1/a;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Ls1/a;-><init>(Ls1/c;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Ls1/c;->x:Ls1/a;

    .line 17
    .line 18
    sget-wide v0, Ls1/c;->y:J

    .line 19
    .line 20
    const-wide/16 v2, 0x1

    .line 21
    .line 22
    add-long/2addr v2, v0

    .line 23
    sput-wide v2, Ls1/c;->y:J

    .line 24
    .line 25
    iput-wide v0, p0, Ls1/c;->w:J

    .line 26
    .line 27
    sget-object v2, Ls1/c;->z:Ljava/util/HashMap;

    .line 28
    .line 29
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v2, v0, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const/4 v1, 0x0

    .line 41
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 46
    .line 47
    .line 48
    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    goto :goto_0

    .line 50
    :catch_0
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    :goto_0
    invoke-static {}, LA0/j;->E()LA0/j;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    if-nez p2, :cond_0

    .line 59
    .line 60
    iget-object p2, v1, LA0/j;->m:Ljava/lang/Object;

    .line 61
    .line 62
    new-instance p2, Lio/flutter/embedding/engine/FlutterJNI;

    .line 63
    .line 64
    invoke-direct {p2}, Lio/flutter/embedding/engine/FlutterJNI;-><init>()V

    .line 65
    .line 66
    .line 67
    :cond_0
    iput-object p2, p0, Ls1/c;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 68
    .line 69
    new-instance v2, Lt1/c;

    .line 70
    .line 71
    iget-wide v3, p0, Ls1/c;->w:J

    .line 72
    .line 73
    invoke-direct {v2, p2, v0, v3, v4}, Lt1/c;-><init>(Lio/flutter/embedding/engine/FlutterJNI;Landroid/content/res/AssetManager;J)V

    .line 74
    .line 75
    .line 76
    iput-object v2, p0, Ls1/c;->c:Lt1/c;

    .line 77
    .line 78
    iget-object v0, v2, Lt1/c;->n:Lt1/j;

    .line 79
    .line 80
    invoke-virtual {p2, v0}, Lio/flutter/embedding/engine/FlutterJNI;->setPlatformMessageHandler(Lt1/k;)V

    .line 81
    .line 82
    .line 83
    invoke-static {}, LA0/j;->E()LA0/j;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    new-instance v0, LA0/j;

    .line 91
    .line 92
    invoke-direct {v0, v2, p2}, LA0/j;-><init>(Lt1/c;Lio/flutter/embedding/engine/FlutterJNI;)V

    .line 93
    .line 94
    .line 95
    iput-object v0, p0, Ls1/c;->f:LA0/j;

    .line 96
    .line 97
    new-instance v0, LB1/b;

    .line 98
    .line 99
    invoke-direct {v0, v2}, LB1/b;-><init>(Lt1/c;)V

    .line 100
    .line 101
    .line 102
    new-instance v0, LB1/f;

    .line 103
    .line 104
    invoke-direct {v0, v2}, LB1/f;-><init>(Lt1/c;)V

    .line 105
    .line 106
    .line 107
    iput-object v0, p0, Ls1/c;->g:LB1/f;

    .line 108
    .line 109
    new-instance v0, LA/c;

    .line 110
    .line 111
    const/4 v3, 0x2

    .line 112
    invoke-direct {v0, v2, v3}, LA/c;-><init>(Lt1/c;I)V

    .line 113
    .line 114
    .line 115
    new-instance v3, LB1/a;

    .line 116
    .line 117
    const/4 v4, 0x2

    .line 118
    invoke-direct {v3, v2, v4}, LB1/a;-><init>(Lt1/c;I)V

    .line 119
    .line 120
    .line 121
    iput-object v3, p0, Ls1/c;->h:LB1/a;

    .line 122
    .line 123
    new-instance v3, LB1/c;

    .line 124
    .line 125
    const/4 v4, 0x1

    .line 126
    invoke-direct {v3, v2, v4}, LB1/c;-><init>(Lt1/c;I)V

    .line 127
    .line 128
    .line 129
    iput-object v3, p0, Ls1/c;->i:LB1/c;

    .line 130
    .line 131
    new-instance v3, LB1/c;

    .line 132
    .line 133
    const/4 v4, 0x0

    .line 134
    invoke-direct {v3, v2, v4}, LB1/c;-><init>(Lt1/c;I)V

    .line 135
    .line 136
    .line 137
    iput-object v3, p0, Ls1/c;->j:LB1/c;

    .line 138
    .line 139
    new-instance v3, LA/c;

    .line 140
    .line 141
    const/4 v4, 0x3

    .line 142
    invoke-direct {v3, v2, v4}, LA/c;-><init>(Lt1/c;I)V

    .line 143
    .line 144
    .line 145
    iput-object v3, p0, Ls1/c;->l:LA/c;

    .line 146
    .line 147
    new-instance v3, LA/c;

    .line 148
    .line 149
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    invoke-direct {v3, v2, v4}, LA/c;-><init>(Lt1/c;Landroid/content/pm/PackageManager;)V

    .line 154
    .line 155
    .line 156
    new-instance v4, LB1/p;

    .line 157
    .line 158
    new-instance v5, LB1/s;

    .line 159
    .line 160
    sget-object v6, LC1/r;->a:LC1/r;

    .line 161
    .line 162
    const/4 v7, 0x0

    .line 163
    const-string v8, "flutter/restoration"

    .line 164
    .line 165
    invoke-direct {v5, v2, v8, v6, v7}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 166
    .line 167
    .line 168
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 169
    .line 170
    .line 171
    const/4 v6, 0x0

    .line 172
    iput-boolean v6, v4, LB1/p;->b:Z

    .line 173
    .line 174
    iput-boolean v6, v4, LB1/p;->c:Z

    .line 175
    .line 176
    new-instance v6, LB1/a;

    .line 177
    .line 178
    const/4 v7, 0x4

    .line 179
    invoke-direct {v6, v4, v7}, LB1/a;-><init>(Ljava/lang/Object;I)V

    .line 180
    .line 181
    .line 182
    iput-object v5, v4, LB1/p;->e:Ljava/lang/Object;

    .line 183
    .line 184
    iput-boolean p5, v4, LB1/p;->a:Z

    .line 185
    .line 186
    invoke-virtual {v5, v6}, LB1/s;->z(LC1/m;)V

    .line 187
    .line 188
    .line 189
    iput-object v4, p0, Ls1/c;->k:LB1/p;

    .line 190
    .line 191
    new-instance p5, LH0/i;

    .line 192
    .line 193
    invoke-direct {p5, v2}, LH0/i;-><init>(Lt1/c;)V

    .line 194
    .line 195
    .line 196
    iput-object p5, p0, Ls1/c;->m:LH0/i;

    .line 197
    .line 198
    new-instance p5, LB1/g;

    .line 199
    .line 200
    const/4 v4, 0x3

    .line 201
    invoke-direct {p5, v2, v4}, LB1/g;-><init>(Lt1/c;I)V

    .line 202
    .line 203
    .line 204
    iput-object p5, p0, Ls1/c;->n:LB1/g;

    .line 205
    .line 206
    new-instance p5, LB1/r;

    .line 207
    .line 208
    invoke-direct {p5, v2}, LB1/r;-><init>(Lt1/c;)V

    .line 209
    .line 210
    .line 211
    iput-object p5, p0, Ls1/c;->o:LB1/r;

    .line 212
    .line 213
    new-instance v4, LB1/a;

    .line 214
    .line 215
    const/4 v5, 0x6

    .line 216
    invoke-direct {v4, v2, v5}, LB1/a;-><init>(Lt1/c;I)V

    .line 217
    .line 218
    .line 219
    iput-object v4, p0, Ls1/c;->p:LB1/a;

    .line 220
    .line 221
    new-instance v4, LB1/g;

    .line 222
    .line 223
    const/4 v5, 0x4

    .line 224
    invoke-direct {v4, v2, v5}, LB1/g;-><init>(Lt1/c;I)V

    .line 225
    .line 226
    .line 227
    iput-object v4, p0, Ls1/c;->q:LB1/g;

    .line 228
    .line 229
    new-instance v4, LA/c;

    .line 230
    .line 231
    const/16 v5, 0x8

    .line 232
    .line 233
    invoke-direct {v4, v2, v5}, LA/c;-><init>(Lt1/c;I)V

    .line 234
    .line 235
    .line 236
    iput-object v4, p0, Ls1/c;->r:LA/c;

    .line 237
    .line 238
    new-instance v2, LD1/a;

    .line 239
    .line 240
    invoke-direct {v2, p1, v0}, LD1/a;-><init>(Landroid/content/Context;LA/c;)V

    .line 241
    .line 242
    .line 243
    iput-object v2, p0, Ls1/c;->e:LD1/a;

    .line 244
    .line 245
    iget-object v0, v1, LA0/j;->l:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v0, Lw1/c;

    .line 248
    .line 249
    invoke-virtual {p2}, Lio/flutter/embedding/engine/FlutterJNI;->isAttached()Z

    .line 250
    .line 251
    .line 252
    move-result v4

    .line 253
    const/4 v5, 0x0

    .line 254
    if-nez v4, :cond_1

    .line 255
    .line 256
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    invoke-virtual {v0, v4}, Lw1/c;->d(Landroid/content/Context;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v0, p1, v5}, Lw1/c;->a(Landroid/content/Context;[Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    :cond_1
    new-instance v4, Lio/flutter/plugin/platform/r;

    .line 267
    .line 268
    invoke-direct {v4}, Lio/flutter/plugin/platform/r;-><init>()V

    .line 269
    .line 270
    .line 271
    iget-object v6, p3, Lio/flutter/plugin/platform/s;->k:Lio/flutter/plugin/platform/o;

    .line 272
    .line 273
    iput-object v6, v4, Lio/flutter/plugin/platform/r;->k:Lio/flutter/plugin/platform/o;

    .line 274
    .line 275
    iput-object p2, v4, Lio/flutter/plugin/platform/r;->o:Lio/flutter/embedding/engine/FlutterJNI;

    .line 276
    .line 277
    iput-object p2, p3, Lio/flutter/plugin/platform/s;->o:Lio/flutter/embedding/engine/FlutterJNI;

    .line 278
    .line 279
    iget-object v6, p0, Ls1/c;->x:Ls1/a;

    .line 280
    .line 281
    invoke-virtual {p2, v6}, Lio/flutter/embedding/engine/FlutterJNI;->addEngineLifecycleListener(Ls1/b;)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {p2, p3}, Lio/flutter/embedding/engine/FlutterJNI;->setPlatformViewsController(Lio/flutter/plugin/platform/s;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {p2, v4}, Lio/flutter/embedding/engine/FlutterJNI;->setPlatformViewsController2(Lio/flutter/plugin/platform/r;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {p2, v2}, Lio/flutter/embedding/engine/FlutterJNI;->setLocalizationPlugin(LD1/a;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    invoke-virtual {p2, v5}, Lio/flutter/embedding/engine/FlutterJNI;->setDeferredComponentManager(Lu1/a;)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {p2, p5}, Lio/flutter/embedding/engine/FlutterJNI;->setSettingsChannel(LB1/r;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {p2}, Lio/flutter/embedding/engine/FlutterJNI;->isAttached()Z

    .line 303
    .line 304
    .line 305
    move-result p5

    .line 306
    if-nez p5, :cond_3

    .line 307
    .line 308
    invoke-virtual {p2}, Lio/flutter/embedding/engine/FlutterJNI;->attachToNative()V

    .line 309
    .line 310
    .line 311
    invoke-virtual {p2}, Lio/flutter/embedding/engine/FlutterJNI;->isAttached()Z

    .line 312
    .line 313
    .line 314
    move-result p5

    .line 315
    if-eqz p5, :cond_2

    .line 316
    .line 317
    goto :goto_1

    .line 318
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    .line 319
    .line 320
    const-string p2, "FlutterEngine failed to attach to its native Object reference."

    .line 321
    .line 322
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    throw p1

    .line 326
    :cond_3
    :goto_1
    new-instance p5, Lio/flutter/embedding/engine/renderer/k;

    .line 327
    .line 328
    invoke-direct {p5, p2}, Lio/flutter/embedding/engine/renderer/k;-><init>(Lio/flutter/embedding/engine/FlutterJNI;)V

    .line 329
    .line 330
    .line 331
    iput-object p5, p0, Ls1/c;->b:Lio/flutter/embedding/engine/renderer/k;

    .line 332
    .line 333
    iput-object p3, p0, Ls1/c;->s:Lio/flutter/plugin/platform/s;

    .line 334
    .line 335
    iput-object v4, p0, Ls1/c;->t:Lio/flutter/plugin/platform/r;

    .line 336
    .line 337
    new-instance p2, Lb1/Q;

    .line 338
    .line 339
    const/4 p5, 0x4

    .line 340
    const/4 v1, 0x0

    .line 341
    invoke-direct {p2, p5, v1}, Lb1/Q;-><init>(IZ)V

    .line 342
    .line 343
    .line 344
    iput-object p3, p2, Lb1/Q;->l:Ljava/lang/Object;

    .line 345
    .line 346
    iput-object v4, p2, Lb1/Q;->m:Ljava/lang/Object;

    .line 347
    .line 348
    iput-object p2, p0, Ls1/c;->u:Lb1/Q;

    .line 349
    .line 350
    new-instance p2, Lj0/a;

    .line 351
    .line 352
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 353
    .line 354
    .line 355
    move-result-object p3

    .line 356
    invoke-direct {p2, p3, p0, v0}, Lj0/a;-><init>(Landroid/content/Context;Ls1/c;Lw1/c;)V

    .line 357
    .line 358
    .line 359
    iput-object p2, p0, Ls1/c;->d:Lj0/a;

    .line 360
    .line 361
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 362
    .line 363
    .line 364
    move-result-object p3

    .line 365
    invoke-virtual {p3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 366
    .line 367
    .line 368
    move-result-object p3

    .line 369
    invoke-virtual {v2, p3}, LD1/a;->b(Landroid/content/res/Configuration;)V

    .line 370
    .line 371
    .line 372
    if-eqz p4, :cond_4

    .line 373
    .line 374
    iget-object p3, v0, Lw1/c;->e:Lg1/i;

    .line 375
    .line 376
    iget-boolean p3, p3, Lg1/i;->a:Z

    .line 377
    .line 378
    if-eqz p3, :cond_4

    .line 379
    .line 380
    invoke-static {p0}, LE2/a;->K(Ls1/c;)V

    .line 381
    .line 382
    .line 383
    :cond_4
    invoke-static {p1, p0}, La/a;->k(Landroid/content/Context;LN1/b;)V

    .line 384
    .line 385
    .line 386
    new-instance p1, LF1/a;

    .line 387
    .line 388
    invoke-direct {p1, v3}, LF1/a;-><init>(LA/c;)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {p2, p1}, Lj0/a;->a(Ly1/b;)V

    .line 392
    .line 393
    .line 394
    return-void
.end method

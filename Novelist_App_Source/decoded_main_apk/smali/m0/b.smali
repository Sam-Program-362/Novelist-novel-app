.class public final Lm0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/q;


# instance fields
.field public final synthetic k:I

.field public final l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lm0/b;->k:I

    iput-object p1, p0, Lm0/b;->l:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final d(Landroidx/lifecycle/s;Landroidx/lifecycle/l;)V
    .locals 8

    .line 1
    iget v0, p0, Lm0/b;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object p1, Landroidx/lifecycle/l;->ON_STOP:Landroidx/lifecycle/l;

    .line 7
    .line 8
    if-ne p2, p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Lm0/b;->l:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Lb0/s;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void

    .line 18
    :pswitch_0
    iget-object p1, p0, Lm0/b;->l:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;

    .line 21
    .line 22
    iget-object p2, p1, Lb/k;->o:Landroidx/lifecycle/S;

    .line 23
    .line 24
    if-nez p2, :cond_2

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/app/Activity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    check-cast p2, Lb/h;

    .line 31
    .line 32
    if-eqz p2, :cond_1

    .line 33
    .line 34
    iget-object p2, p2, Lb/h;->a:Landroidx/lifecycle/S;

    .line 35
    .line 36
    iput-object p2, p1, Lb/k;->o:Landroidx/lifecycle/S;

    .line 37
    .line 38
    :cond_1
    iget-object p2, p1, Lb/k;->o:Landroidx/lifecycle/S;

    .line 39
    .line 40
    if-nez p2, :cond_2

    .line 41
    .line 42
    new-instance p2, Landroidx/lifecycle/S;

    .line 43
    .line 44
    invoke-direct {p2}, Landroidx/lifecycle/S;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object p2, p1, Lb/k;->o:Landroidx/lifecycle/S;

    .line 48
    .line 49
    :cond_2
    iget-object p1, p1, Ls/b;->k:Landroidx/lifecycle/u;

    .line 50
    .line 51
    invoke-virtual {p1, p0}, Landroidx/lifecycle/u;->b(Landroidx/lifecycle/r;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_1
    sget-object v0, Landroidx/lifecycle/l;->ON_CREATE:Landroidx/lifecycle/l;

    .line 56
    .line 57
    if-ne p2, v0, :cond_6

    .line 58
    .line 59
    invoke-interface {p1}, Landroidx/lifecycle/s;->h()Landroidx/lifecycle/u;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p1, p0}, Landroidx/lifecycle/u;->b(Landroidx/lifecycle/r;)V

    .line 64
    .line 65
    .line 66
    iget-object p1, p0, Lm0/b;->l:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p1, Landroidx/lifecycle/M;

    .line 69
    .line 70
    iget-boolean p2, p1, Landroidx/lifecycle/M;->b:Z

    .line 71
    .line 72
    if-nez p2, :cond_5

    .line 73
    .line 74
    iget-object p2, p1, Landroidx/lifecycle/M;->a:LB1/p;

    .line 75
    .line 76
    const-string v0, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    .line 77
    .line 78
    invoke-virtual {p2, v0}, LB1/p;->a(Ljava/lang/String;)Landroid/os/Bundle;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    new-instance v0, Landroid/os/Bundle;

    .line 83
    .line 84
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 85
    .line 86
    .line 87
    iget-object v1, p1, Landroidx/lifecycle/M;->c:Landroid/os/Bundle;

    .line 88
    .line 89
    if-eqz v1, :cond_3

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 92
    .line 93
    .line 94
    :cond_3
    if-eqz p2, :cond_4

    .line 95
    .line 96
    invoke-virtual {v0, p2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 97
    .line 98
    .line 99
    :cond_4
    iput-object v0, p1, Landroidx/lifecycle/M;->c:Landroid/os/Bundle;

    .line 100
    .line 101
    const/4 p2, 0x1

    .line 102
    iput-boolean p2, p1, Landroidx/lifecycle/M;->b:Z

    .line 103
    .line 104
    iget-object p1, p1, Landroidx/lifecycle/M;->d:LO1/e;

    .line 105
    .line 106
    invoke-virtual {p1}, LO1/e;->a()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    check-cast p1, Landroidx/lifecycle/N;

    .line 111
    .line 112
    :cond_5
    return-void

    .line 113
    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    const-string v0, "Next event must be ON_CREATE, it was "

    .line 116
    .line 117
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 128
    .line 129
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw p2

    .line 137
    :pswitch_2
    new-instance p1, Ljava/util/HashMap;

    .line 138
    .line 139
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 140
    .line 141
    .line 142
    iget-object p1, p0, Lm0/b;->l:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast p1, [Landroidx/lifecycle/g;

    .line 145
    .line 146
    array-length p2, p1

    .line 147
    const/4 v0, 0x0

    .line 148
    const/4 v1, 0x0

    .line 149
    if-gtz p2, :cond_8

    .line 150
    .line 151
    array-length p2, p1

    .line 152
    if-gtz p2, :cond_7

    .line 153
    .line 154
    return-void

    .line 155
    :cond_7
    aget-object p1, p1, v1

    .line 156
    .line 157
    throw v0

    .line 158
    :cond_8
    aget-object p1, p1, v1

    .line 159
    .line 160
    throw v0

    .line 161
    :pswitch_3
    iget-object v0, p0, Lm0/b;->l:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v0, Lm0/e;

    .line 164
    .line 165
    sget-object v1, Landroidx/lifecycle/l;->ON_CREATE:Landroidx/lifecycle/l;

    .line 166
    .line 167
    if-ne p2, v1, :cond_f

    .line 168
    .line 169
    invoke-interface {p1}, Landroidx/lifecycle/s;->h()Landroidx/lifecycle/u;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    invoke-virtual {p1, p0}, Landroidx/lifecycle/u;->b(Landroidx/lifecycle/r;)V

    .line 174
    .line 175
    .line 176
    invoke-interface {v0}, Lm0/e;->c()LB1/p;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    const-string p2, "androidx.savedstate.Restarter"

    .line 181
    .line 182
    invoke-virtual {p1, p2}, LB1/p;->a(Ljava/lang/String;)Landroid/os/Bundle;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    if-nez p1, :cond_9

    .line 187
    .line 188
    goto/16 :goto_2

    .line 189
    .line 190
    :cond_9
    const-string p2, "classes_to_restore"

    .line 191
    .line 192
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    if-eqz p1, :cond_e

    .line 197
    .line 198
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 199
    .line 200
    .line 201
    move-result p2

    .line 202
    const/4 v1, 0x0

    .line 203
    move v2, v1

    .line 204
    :cond_a
    :goto_0
    if-ge v2, p2, :cond_d

    .line 205
    .line 206
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    add-int/lit8 v2, v2, 0x1

    .line 211
    .line 212
    check-cast v3, Ljava/lang/String;

    .line 213
    .line 214
    const-string v4, "Class "

    .line 215
    .line 216
    :try_start_0
    const-class v5, Lm0/b;

    .line 217
    .line 218
    invoke-virtual {v5}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 219
    .line 220
    .line 221
    move-result-object v5

    .line 222
    invoke-static {v3, v1, v5}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    move-result-object v5

    .line 226
    const-class v6, Lm0/c;

    .line 227
    .line 228
    invoke-virtual {v5, v6}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    move-result-object v5

    .line 232
    const-string v6, "{\n                Class.\u2026class.java)\n            }"

    .line 233
    .line 234
    invoke-static {v5, v6}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2

    .line 235
    .line 236
    .line 237
    const/4 v6, 0x0

    .line 238
    :try_start_1
    invoke-virtual {v5, v6}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 239
    .line 240
    .line 241
    move-result-object v4
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    .line 242
    const/4 v5, 0x1

    .line 243
    invoke-virtual {v4, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 244
    .line 245
    .line 246
    :try_start_2
    invoke-virtual {v4, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    const-string v5, "{\n                constr\u2026wInstance()\n            }"

    .line 251
    .line 252
    invoke-static {v4, v5}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    check-cast v4, Lm0/c;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 256
    .line 257
    instance-of v3, v0, Landroidx/lifecycle/T;

    .line 258
    .line 259
    if-eqz v3, :cond_c

    .line 260
    .line 261
    move-object v3, v0

    .line 262
    check-cast v3, Landroidx/lifecycle/T;

    .line 263
    .line 264
    invoke-interface {v3}, Landroidx/lifecycle/T;->f()Landroidx/lifecycle/S;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    invoke-interface {v0}, Lm0/e;->c()LB1/p;

    .line 269
    .line 270
    .line 271
    move-result-object v4

    .line 272
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    iget-object v3, v3, Landroidx/lifecycle/S;->a:Ljava/util/LinkedHashMap;

    .line 276
    .line 277
    new-instance v5, Ljava/util/HashSet;

    .line 278
    .line 279
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 280
    .line 281
    .line 282
    move-result-object v6

    .line 283
    invoke-direct {v5, v6}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 287
    .line 288
    .line 289
    move-result-object v5

    .line 290
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 291
    .line 292
    .line 293
    move-result v6

    .line 294
    if-eqz v6, :cond_b

    .line 295
    .line 296
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v6

    .line 300
    check-cast v6, Ljava/lang/String;

    .line 301
    .line 302
    const-string v7, "key"

    .line 303
    .line 304
    invoke-static {v6, v7}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v3, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v6

    .line 311
    check-cast v6, Landroidx/lifecycle/P;

    .line 312
    .line 313
    invoke-static {v6}, La2/h;->b(Ljava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    invoke-interface {v0}, Landroidx/lifecycle/s;->h()Landroidx/lifecycle/u;

    .line 317
    .line 318
    .line 319
    move-result-object v7

    .line 320
    invoke-static {v6, v4, v7}, Landroidx/lifecycle/L;->c(Landroidx/lifecycle/P;LB1/p;Landroidx/lifecycle/n;)V

    .line 321
    .line 322
    .line 323
    goto :goto_1

    .line 324
    :cond_b
    new-instance v5, Ljava/util/HashSet;

    .line 325
    .line 326
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 327
    .line 328
    .line 329
    move-result-object v3

    .line 330
    invoke-direct {v5, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v5}, Ljava/util/HashSet;->isEmpty()Z

    .line 334
    .line 335
    .line 336
    move-result v3

    .line 337
    if-nez v3, :cond_a

    .line 338
    .line 339
    invoke-virtual {v4}, LB1/p;->d()V

    .line 340
    .line 341
    .line 342
    goto/16 :goto_0

    .line 343
    .line 344
    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 345
    .line 346
    const-string p2, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner"

    .line 347
    .line 348
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    throw p1

    .line 352
    :catch_0
    move-exception p1

    .line 353
    new-instance p2, Ljava/lang/RuntimeException;

    .line 354
    .line 355
    const-string v0, "Failed to instantiate "

    .line 356
    .line 357
    invoke-static {v0, v3}, Lt/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 362
    .line 363
    .line 364
    throw p2

    .line 365
    :catch_1
    move-exception p1

    .line 366
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 367
    .line 368
    new-instance v0, Ljava/lang/StringBuilder;

    .line 369
    .line 370
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v1

    .line 377
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 378
    .line 379
    .line 380
    const-string v1, " must have default constructor in order to be automatically recreated"

    .line 381
    .line 382
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    invoke-direct {p2, v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 390
    .line 391
    .line 392
    throw p2

    .line 393
    :catch_2
    move-exception p1

    .line 394
    new-instance p2, Ljava/lang/RuntimeException;

    .line 395
    .line 396
    const-string v0, " wasn\'t found"

    .line 397
    .line 398
    invoke-static {v4, v3, v0}, Lt/a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 403
    .line 404
    .line 405
    throw p2

    .line 406
    :cond_d
    :goto_2
    return-void

    .line 407
    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 408
    .line 409
    const-string p2, "Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\""

    .line 410
    .line 411
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    throw p1

    .line 415
    :cond_f
    new-instance p1, Ljava/lang/AssertionError;

    .line 416
    .line 417
    const-string p2, "Next event must be ON_CREATE"

    .line 418
    .line 419
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 420
    .line 421
    .line 422
    throw p1

    .line 423
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

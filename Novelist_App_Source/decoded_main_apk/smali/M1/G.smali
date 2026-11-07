.class public final synthetic LM1/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC1/b;


# instance fields
.field public final synthetic k:I

.field public final synthetic l:LM1/j;


# direct methods
.method public synthetic constructor <init>(LM1/j;I)V
    .locals 0

    .line 1
    iput p2, p0, LM1/G;->k:I

    iput-object p1, p0, LM1/G;->l:LM1/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;LA/c;)V
    .locals 5

    .line 1
    iget v0, p0, LM1/G;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LM1/G;->l:LM1/j;

    .line 7
    .line 8
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 9
    .line 10
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    check-cast p1, Ljava/util/List;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-string v1, "null cannot be cast to non-null type android.net.http.SslCertificate.DName"

    .line 21
    .line 22
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    check-cast p1, Landroid/net/http/SslCertificate$DName;

    .line 26
    .line 27
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/net/http/SslCertificate$DName;->getUName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception p1

    .line 40
    instance-of v0, p1, LM1/a;

    .line 41
    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    check-cast p1, LM1/a;

    .line 45
    .line 46
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 49
    .line 50
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 51
    .line 52
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    goto :goto_0

    .line 61
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    const-string v3, "Cause: "

    .line 82
    .line 83
    const-string v4, ", Stacktrace: "

    .line 84
    .line 85
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    :goto_0
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :pswitch_0
    iget-object v0, p0, LM1/G;->l:LM1/j;

    .line 102
    .line 103
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 104
    .line 105
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    check-cast p1, Ljava/util/List;

    .line 109
    .line 110
    const/4 v1, 0x0

    .line 111
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    const-string v1, "null cannot be cast to non-null type android.net.http.SslCertificate.DName"

    .line 116
    .line 117
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    check-cast p1, Landroid/net/http/SslCertificate$DName;

    .line 121
    .line 122
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1}, Landroid/net/http/SslCertificate$DName;->getOName()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 130
    .line 131
    .line 132
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 133
    goto :goto_1

    .line 134
    :catchall_1
    move-exception p1

    .line 135
    instance-of v0, p1, LM1/a;

    .line 136
    .line 137
    if-eqz v0, :cond_1

    .line 138
    .line 139
    check-cast p1, LM1/a;

    .line 140
    .line 141
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 142
    .line 143
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 144
    .line 145
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 146
    .line 147
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    goto :goto_1

    .line 156
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    const-string v3, "Cause: "

    .line 177
    .line 178
    const-string v4, ", Stacktrace: "

    .line 179
    .line 180
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    :goto_1
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :pswitch_1
    iget-object v0, p0, LM1/G;->l:LM1/j;

    .line 197
    .line 198
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 199
    .line 200
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    check-cast p1, Ljava/util/List;

    .line 204
    .line 205
    const/4 v1, 0x0

    .line 206
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    const-string v1, "null cannot be cast to non-null type android.net.http.SslCertificate.DName"

    .line 211
    .line 212
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    check-cast p1, Landroid/net/http/SslCertificate$DName;

    .line 216
    .line 217
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    invoke-virtual {p1}, Landroid/net/http/SslCertificate$DName;->getDName()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 225
    .line 226
    .line 227
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 228
    goto :goto_2

    .line 229
    :catchall_2
    move-exception p1

    .line 230
    instance-of v0, p1, LM1/a;

    .line 231
    .line 232
    if-eqz v0, :cond_2

    .line 233
    .line 234
    check-cast p1, LM1/a;

    .line 235
    .line 236
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 237
    .line 238
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 239
    .line 240
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 241
    .line 242
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    goto :goto_2

    .line 251
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    const-string v3, "Cause: "

    .line 272
    .line 273
    const-string v4, ", Stacktrace: "

    .line 274
    .line 275
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object p1

    .line 279
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 284
    .line 285
    .line 286
    move-result-object p1

    .line 287
    :goto_2
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    return-void

    .line 291
    :pswitch_2
    iget-object v0, p0, LM1/G;->l:LM1/j;

    .line 292
    .line 293
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 294
    .line 295
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    check-cast p1, Ljava/util/List;

    .line 299
    .line 300
    const/4 v1, 0x0

    .line 301
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object p1

    .line 305
    const-string v1, "null cannot be cast to non-null type android.net.http.SslCertificate.DName"

    .line 306
    .line 307
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    check-cast p1, Landroid/net/http/SslCertificate$DName;

    .line 311
    .line 312
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    invoke-virtual {p1}, Landroid/net/http/SslCertificate$DName;->getCName()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object p1

    .line 319
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 320
    .line 321
    .line 322
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 323
    goto :goto_3

    .line 324
    :catchall_3
    move-exception p1

    .line 325
    instance-of v0, p1, LM1/a;

    .line 326
    .line 327
    if-eqz v0, :cond_3

    .line 328
    .line 329
    check-cast p1, LM1/a;

    .line 330
    .line 331
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 332
    .line 333
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 334
    .line 335
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 336
    .line 337
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object p1

    .line 341
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 342
    .line 343
    .line 344
    move-result-object p1

    .line 345
    goto :goto_3

    .line 346
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 359
    .line 360
    .line 361
    move-result-object v2

    .line 362
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object p1

    .line 366
    const-string v3, "Cause: "

    .line 367
    .line 368
    const-string v4, ", Stacktrace: "

    .line 369
    .line 370
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object p1

    .line 374
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object p1

    .line 378
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 379
    .line 380
    .line 381
    move-result-object p1

    .line 382
    :goto_3
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 383
    .line 384
    .line 385
    return-void

    .line 386
    nop

    .line 387
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

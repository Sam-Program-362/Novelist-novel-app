.class public final synthetic LM1/B;
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
    iput p2, p0, LM1/B;->k:I

    iput-object p1, p0, LM1/B;->l:LM1/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;LA/c;)V
    .locals 5

    .line 1
    iget v0, p0, LM1/B;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LM1/B;->l:LM1/j;

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
    move-result-object v2

    .line 20
    const-string v3, "null cannot be cast to non-null type android.webkit.ClientCertRequest"

    .line 21
    .line 22
    invoke-static {v2, v3}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    check-cast v2, Landroid/webkit/ClientCertRequest;

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    const-string v4, "null cannot be cast to non-null type java.security.PrivateKey"

    .line 33
    .line 34
    invoke-static {v3, v4}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    check-cast v3, Ljava/security/PrivateKey;

    .line 38
    .line 39
    const/4 v4, 0x2

    .line 40
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const-string v4, "null cannot be cast to non-null type kotlin.collections.List<java.security.cert.X509Certificate>"

    .line 45
    .line 46
    invoke-static {p1, v4}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    check-cast p1, Ljava/util/List;

    .line 50
    .line 51
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    new-array v0, v1, [Ljava/security/cert/X509Certificate;

    .line 55
    .line 56
    invoke-interface {p1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    check-cast p1, [Ljava/security/cert/X509Certificate;

    .line 61
    .line 62
    invoke-virtual {v2, v3, p1}, Landroid/webkit/ClientCertRequest;->proceed(Ljava/security/PrivateKey;[Ljava/security/cert/X509Certificate;)V

    .line 63
    .line 64
    .line 65
    const/4 p1, 0x0

    .line 66
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    goto :goto_0

    .line 71
    :catchall_0
    move-exception p1

    .line 72
    instance-of v0, p1, LM1/a;

    .line 73
    .line 74
    if-eqz v0, :cond_0

    .line 75
    .line 76
    check-cast p1, LM1/a;

    .line 77
    .line 78
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 79
    .line 80
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 81
    .line 82
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 83
    .line 84
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    goto :goto_0

    .line 93
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    const-string v3, "Cause: "

    .line 114
    .line 115
    const-string v4, ", Stacktrace: "

    .line 116
    .line 117
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    :goto_0
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :pswitch_0
    iget-object v0, p0, LM1/B;->l:LM1/j;

    .line 134
    .line 135
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 136
    .line 137
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    check-cast p1, Ljava/util/List;

    .line 141
    .line 142
    const/4 v1, 0x0

    .line 143
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    const-string v1, "null cannot be cast to non-null type android.webkit.ClientCertRequest"

    .line 148
    .line 149
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    check-cast p1, Landroid/webkit/ClientCertRequest;

    .line 153
    .line 154
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1}, Landroid/webkit/ClientCertRequest;->ignore()V

    .line 158
    .line 159
    .line 160
    const/4 p1, 0x0

    .line 161
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 162
    .line 163
    .line 164
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 165
    goto :goto_1

    .line 166
    :catchall_1
    move-exception p1

    .line 167
    instance-of v0, p1, LM1/a;

    .line 168
    .line 169
    if-eqz v0, :cond_1

    .line 170
    .line 171
    check-cast p1, LM1/a;

    .line 172
    .line 173
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 174
    .line 175
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 176
    .line 177
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 178
    .line 179
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    goto :goto_1

    .line 188
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    const-string v3, "Cause: "

    .line 209
    .line 210
    const-string v4, ", Stacktrace: "

    .line 211
    .line 212
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    :goto_1
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    return-void

    .line 228
    :pswitch_1
    iget-object v0, p0, LM1/B;->l:LM1/j;

    .line 229
    .line 230
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 231
    .line 232
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    check-cast p1, Ljava/util/List;

    .line 236
    .line 237
    const/4 v1, 0x0

    .line 238
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    const-string v1, "null cannot be cast to non-null type android.webkit.ClientCertRequest"

    .line 243
    .line 244
    invoke-static {p1, v1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    check-cast p1, Landroid/webkit/ClientCertRequest;

    .line 248
    .line 249
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    invoke-virtual {p1}, Landroid/webkit/ClientCertRequest;->cancel()V

    .line 253
    .line 254
    .line 255
    const/4 p1, 0x0

    .line 256
    invoke-static {p1}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 257
    .line 258
    .line 259
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 260
    goto :goto_2

    .line 261
    :catchall_2
    move-exception p1

    .line 262
    instance-of v0, p1, LM1/a;

    .line 263
    .line 264
    if-eqz v0, :cond_2

    .line 265
    .line 266
    check-cast p1, LM1/a;

    .line 267
    .line 268
    iget-object v0, p1, LM1/a;->l:Ljava/lang/String;

    .line 269
    .line 270
    iget-object v1, p1, LM1/a;->m:Ljava/lang/Object;

    .line 271
    .line 272
    iget-object p1, p1, LM1/a;->k:Ljava/lang/String;

    .line 273
    .line 274
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object p1

    .line 278
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    goto :goto_2

    .line 283
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object p1

    .line 303
    const-string v3, "Cause: "

    .line 304
    .line 305
    const-string v4, ", Stacktrace: "

    .line 306
    .line 307
    invoke-static {v3, v2, v4, p1}, LB1/e;->l(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object p1

    .line 311
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object p1

    .line 315
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 316
    .line 317
    .line 318
    move-result-object p1

    .line 319
    :goto_2
    invoke-virtual {p2, p1}, LA/c;->e(Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    return-void

    .line 323
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class public final synthetic LM1/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:I

.field public final synthetic l:LM1/g0;

.field public final synthetic m:Landroid/webkit/WebView;

.field public final synthetic n:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LM1/g0;Landroid/webkit/WebView;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p4, p0, LM1/a0;->k:I

    iput-object p1, p0, LM1/a0;->l:LM1/g0;

    iput-object p2, p0, LM1/a0;->m:Landroid/webkit/WebView;

    iput-object p3, p0, LM1/a0;->n:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget v0, p0, LM1/a0;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LM1/a0;->l:LM1/g0;

    .line 7
    .line 8
    iget-object v1, v0, LM1/g0;->a:LM1/n;

    .line 9
    .line 10
    new-instance v2, LM1/q;

    .line 11
    .line 12
    const/4 v3, 0x2

    .line 13
    invoke-direct {v2, v3}, LM1/q;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const-string v3, "viewArg"

    .line 20
    .line 21
    iget-object v4, p0, LM1/a0;->m:Landroid/webkit/WebView;

    .line 22
    .line 23
    invoke-static {v4, v3}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v3, "urlArg"

    .line 27
    .line 28
    iget-object v5, p0, LM1/a0;->n:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v5, v3}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object v1, v1, LM1/n;->a:LM1/O;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object v3, v1, LM1/O;->c:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v3, LM1/d;

    .line 41
    .line 42
    invoke-virtual {v3, v0}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-nez v3, :cond_0

    .line 47
    .line 48
    const-string v0, "Callback to `WebViewClient.onPageCommitVisible` failed because native instance was not in the instance manager."

    .line 49
    .line 50
    const-string v1, ""

    .line 51
    .line 52
    const-string v2, "missing-instance-error"

    .line 53
    .line 54
    invoke-static {v2, v0, v1}, LB1/e;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    iget-object v3, v1, LM1/O;->b:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v3, LC1/f;

    .line 61
    .line 62
    invoke-virtual {v1}, LM1/O;->a()LC1/l;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    new-instance v6, LB1/s;

    .line 67
    .line 68
    const-string v7, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageCommitVisible"

    .line 69
    .line 70
    const/4 v8, 0x0

    .line 71
    invoke-direct {v6, v3, v7, v1, v8}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 72
    .line 73
    .line 74
    filled-new-array {v0, v4, v5}, [Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-static {v0}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    new-instance v1, LM1/N;

    .line 83
    .line 84
    const/4 v3, 0x2

    .line 85
    invoke-direct {v1, v2, v3}, LM1/N;-><init>(Ljava/lang/Object;I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v6, v0, v1}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 89
    .line 90
    .line 91
    :goto_0
    return-void

    .line 92
    :pswitch_0
    iget-object v0, p0, LM1/a0;->l:LM1/g0;

    .line 93
    .line 94
    iget-object v1, v0, LM1/g0;->a:LM1/n;

    .line 95
    .line 96
    new-instance v2, LM1/q;

    .line 97
    .line 98
    const/4 v3, 0x2

    .line 99
    invoke-direct {v2, v3}, LM1/q;-><init>(I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    const-string v3, "webViewArg"

    .line 106
    .line 107
    iget-object v4, p0, LM1/a0;->m:Landroid/webkit/WebView;

    .line 108
    .line 109
    invoke-static {v4, v3}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    const-string v3, "urlArg"

    .line 113
    .line 114
    iget-object v5, p0, LM1/a0;->n:Ljava/lang/String;

    .line 115
    .line 116
    invoke-static {v5, v3}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    iget-object v1, v1, LM1/n;->a:LM1/O;

    .line 120
    .line 121
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    iget-object v3, v1, LM1/O;->c:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v3, LM1/d;

    .line 127
    .line 128
    invoke-virtual {v3, v0}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-nez v3, :cond_1

    .line 133
    .line 134
    const-string v0, "Callback to `WebViewClient.onPageFinished` failed because native instance was not in the instance manager."

    .line 135
    .line 136
    const-string v1, ""

    .line 137
    .line 138
    const-string v2, "missing-instance-error"

    .line 139
    .line 140
    invoke-static {v2, v0, v1}, LB1/e;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_1
    iget-object v3, v1, LM1/O;->b:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v3, LC1/f;

    .line 147
    .line 148
    invoke-virtual {v1}, LM1/O;->a()LC1/l;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    new-instance v6, LB1/s;

    .line 153
    .line 154
    const-string v7, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageFinished"

    .line 155
    .line 156
    const/4 v8, 0x0

    .line 157
    invoke-direct {v6, v3, v7, v1, v8}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 158
    .line 159
    .line 160
    filled-new-array {v0, v4, v5}, [Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-static {v0}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    new-instance v1, LM1/N;

    .line 169
    .line 170
    const/4 v3, 0x4

    .line 171
    invoke-direct {v1, v2, v3}, LM1/N;-><init>(Ljava/lang/Object;I)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v6, v0, v1}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 175
    .line 176
    .line 177
    :goto_1
    return-void

    .line 178
    :pswitch_1
    iget-object v0, p0, LM1/a0;->l:LM1/g0;

    .line 179
    .line 180
    iget-object v1, v0, LM1/g0;->a:LM1/n;

    .line 181
    .line 182
    new-instance v2, LM1/q;

    .line 183
    .line 184
    const/4 v3, 0x2

    .line 185
    invoke-direct {v2, v3}, LM1/q;-><init>(I)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    const-string v3, "viewArg"

    .line 192
    .line 193
    iget-object v4, p0, LM1/a0;->m:Landroid/webkit/WebView;

    .line 194
    .line 195
    invoke-static {v4, v3}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    const-string v3, "urlArg"

    .line 199
    .line 200
    iget-object v5, p0, LM1/a0;->n:Ljava/lang/String;

    .line 201
    .line 202
    invoke-static {v5, v3}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    iget-object v1, v1, LM1/n;->a:LM1/O;

    .line 206
    .line 207
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    iget-object v3, v1, LM1/O;->c:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v3, LM1/d;

    .line 213
    .line 214
    invoke-virtual {v3, v0}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v3

    .line 218
    if-nez v3, :cond_2

    .line 219
    .line 220
    const-string v0, "Callback to `WebViewClient.onLoadResource` failed because native instance was not in the instance manager."

    .line 221
    .line 222
    const-string v1, ""

    .line 223
    .line 224
    const-string v2, "missing-instance-error"

    .line 225
    .line 226
    invoke-static {v2, v0, v1}, LB1/e;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    goto :goto_2

    .line 230
    :cond_2
    iget-object v3, v1, LM1/O;->b:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v3, LC1/f;

    .line 233
    .line 234
    invoke-virtual {v1}, LM1/O;->a()LC1/l;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    new-instance v6, LB1/s;

    .line 239
    .line 240
    const-string v7, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onLoadResource"

    .line 241
    .line 242
    const/4 v8, 0x0

    .line 243
    invoke-direct {v6, v3, v7, v1, v8}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 244
    .line 245
    .line 246
    filled-new-array {v0, v4, v5}, [Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    invoke-static {v0}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    new-instance v1, LD/c;

    .line 255
    .line 256
    const/16 v3, 0x1b

    .line 257
    .line 258
    invoke-direct {v1, v2, v3}, LD/c;-><init>(Ljava/lang/Object;I)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v6, v0, v1}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 262
    .line 263
    .line 264
    :goto_2
    return-void

    .line 265
    :pswitch_2
    iget-object v0, p0, LM1/a0;->l:LM1/g0;

    .line 266
    .line 267
    iget-object v1, v0, LM1/g0;->a:LM1/n;

    .line 268
    .line 269
    new-instance v2, LM1/q;

    .line 270
    .line 271
    const/4 v3, 0x2

    .line 272
    invoke-direct {v2, v3}, LM1/q;-><init>(I)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    const-string v3, "webViewArg"

    .line 279
    .line 280
    iget-object v4, p0, LM1/a0;->m:Landroid/webkit/WebView;

    .line 281
    .line 282
    invoke-static {v4, v3}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    const-string v3, "urlArg"

    .line 286
    .line 287
    iget-object v5, p0, LM1/a0;->n:Ljava/lang/String;

    .line 288
    .line 289
    invoke-static {v5, v3}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    iget-object v1, v1, LM1/n;->a:LM1/O;

    .line 293
    .line 294
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    iget-object v3, v1, LM1/O;->c:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v3, LM1/d;

    .line 300
    .line 301
    invoke-virtual {v3, v0}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v3

    .line 305
    if-nez v3, :cond_3

    .line 306
    .line 307
    const-string v0, "Callback to `WebViewClient.onPageStarted` failed because native instance was not in the instance manager."

    .line 308
    .line 309
    const-string v1, ""

    .line 310
    .line 311
    const-string v2, "missing-instance-error"

    .line 312
    .line 313
    invoke-static {v2, v0, v1}, LB1/e;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    goto :goto_3

    .line 317
    :cond_3
    iget-object v3, v1, LM1/O;->b:Ljava/lang/Object;

    .line 318
    .line 319
    check-cast v3, LC1/f;

    .line 320
    .line 321
    invoke-virtual {v1}, LM1/O;->a()LC1/l;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    new-instance v6, LB1/s;

    .line 326
    .line 327
    const-string v7, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageStarted"

    .line 328
    .line 329
    const/4 v8, 0x0

    .line 330
    invoke-direct {v6, v3, v7, v1, v8}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 331
    .line 332
    .line 333
    filled-new-array {v0, v4, v5}, [Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    invoke-static {v0}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    new-instance v1, LD/c;

    .line 342
    .line 343
    const/16 v3, 0x1d

    .line 344
    .line 345
    invoke-direct {v1, v2, v3}, LD/c;-><init>(Ljava/lang/Object;I)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v6, v0, v1}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 349
    .line 350
    .line 351
    :goto_3
    return-void

    .line 352
    nop

    .line 353
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

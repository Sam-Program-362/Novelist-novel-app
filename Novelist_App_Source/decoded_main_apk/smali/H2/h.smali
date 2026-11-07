.class public abstract LH2/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:LH2/g; = null

.field public static b:Z = false

.field public static c:Z = false

.field public static d:Ljava/lang/reflect/Method;

.field public static e:Ljava/lang/Boolean;

.field public static f:Ljava/lang/Boolean;

.field public static g:Ljava/lang/Boolean;

.field public static h:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(Lb0/U;)V
    .locals 1

    .line 1
    const-string v0, "operation"

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
    return-void
.end method

.method public static A(LC1/f;LM1/n;)V
    .locals 5

    .line 1
    const-string v0, "binaryMessenger"

    .line 2
    .line 3
    invoke-static {p0, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object v0, p1, LM1/n;->a:LM1/O;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, LM1/O;->a()LC1/l;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance v0, LI1/u;

    .line 18
    .line 19
    const/4 v1, 0x5

    .line 20
    invoke-direct {v0, v1}, LI1/u;-><init>(I)V

    .line 21
    .line 22
    .line 23
    :goto_0
    new-instance v1, LB1/s;

    .line 24
    .line 25
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getIssuedBy"

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 29
    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    new-instance v2, LM1/F;

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    invoke-direct {v2, p1, v4}, LM1/F;-><init>(LM1/n;I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 44
    .line 45
    .line 46
    :goto_1
    new-instance v1, LB1/s;

    .line 47
    .line 48
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getIssuedTo"

    .line 49
    .line 50
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 51
    .line 52
    .line 53
    if-eqz p1, :cond_2

    .line 54
    .line 55
    new-instance v2, LM1/F;

    .line 56
    .line 57
    const/4 v4, 0x1

    .line 58
    invoke-direct {v2, p1, v4}, LM1/F;-><init>(LM1/n;I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 66
    .line 67
    .line 68
    :goto_2
    new-instance v1, LB1/s;

    .line 69
    .line 70
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getValidNotAfterMsSinceEpoch"

    .line 71
    .line 72
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 73
    .line 74
    .line 75
    if-eqz p1, :cond_3

    .line 76
    .line 77
    new-instance v2, LM1/F;

    .line 78
    .line 79
    const/4 v4, 0x2

    .line 80
    invoke-direct {v2, p1, v4}, LM1/F;-><init>(LM1/n;I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 84
    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_3
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 88
    .line 89
    .line 90
    :goto_3
    new-instance v1, LB1/s;

    .line 91
    .line 92
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getValidNotBeforeMsSinceEpoch"

    .line 93
    .line 94
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 95
    .line 96
    .line 97
    if-eqz p1, :cond_4

    .line 98
    .line 99
    new-instance v2, LM1/F;

    .line 100
    .line 101
    const/4 v4, 0x3

    .line 102
    invoke-direct {v2, p1, v4}, LM1/F;-><init>(LM1/n;I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 106
    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_4
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 110
    .line 111
    .line 112
    :goto_4
    new-instance v1, LB1/s;

    .line 113
    .line 114
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getX509Certificate"

    .line 115
    .line 116
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 117
    .line 118
    .line 119
    if-eqz p1, :cond_5

    .line 120
    .line 121
    new-instance p0, LM1/F;

    .line 122
    .line 123
    const/4 v0, 0x4

    .line 124
    invoke-direct {p0, p1, v0}, LM1/F;-><init>(LM1/n;I)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1, p0}, LB1/s;->y(LC1/b;)V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :cond_5
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 132
    .line 133
    .line 134
    return-void
.end method

.method public static B(LC1/f;LM1/s;)V
    .locals 5

    .line 1
    const-string v0, "binaryMessenger"

    .line 2
    .line 3
    invoke-static {p0, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object v0, p1, LM1/s;->a:LM1/O;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, LM1/O;->a()LC1/l;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance v0, LI1/u;

    .line 18
    .line 19
    const/4 v1, 0x5

    .line 20
    invoke-direct {v0, v1}, LI1/u;-><init>(I)V

    .line 21
    .line 22
    .line 23
    :goto_0
    new-instance v1, LB1/s;

    .line 24
    .line 25
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setDomStorageEnabled"

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 29
    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    new-instance v2, LM1/L;

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    invoke-direct {v2, p1, v4}, LM1/L;-><init>(LM1/s;I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 44
    .line 45
    .line 46
    :goto_1
    new-instance v1, LB1/s;

    .line 47
    .line 48
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setJavaScriptCanOpenWindowsAutomatically"

    .line 49
    .line 50
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 51
    .line 52
    .line 53
    if-eqz p1, :cond_2

    .line 54
    .line 55
    new-instance v2, LM1/L;

    .line 56
    .line 57
    const/16 v4, 0xf

    .line 58
    .line 59
    invoke-direct {v2, p1, v4}, LM1/L;-><init>(LM1/s;I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_2
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 67
    .line 68
    .line 69
    :goto_2
    new-instance v1, LB1/s;

    .line 70
    .line 71
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setSupportMultipleWindows"

    .line 72
    .line 73
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 74
    .line 75
    .line 76
    if-eqz p1, :cond_3

    .line 77
    .line 78
    new-instance v2, LM1/L;

    .line 79
    .line 80
    const/16 v4, 0x10

    .line 81
    .line 82
    invoke-direct {v2, p1, v4}, LM1/L;-><init>(LM1/s;I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 86
    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_3
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 90
    .line 91
    .line 92
    :goto_3
    new-instance v1, LB1/s;

    .line 93
    .line 94
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setJavaScriptEnabled"

    .line 95
    .line 96
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 97
    .line 98
    .line 99
    if-eqz p1, :cond_4

    .line 100
    .line 101
    new-instance v2, LM1/L;

    .line 102
    .line 103
    const/4 v4, 0x1

    .line 104
    invoke-direct {v2, p1, v4}, LM1/L;-><init>(LM1/s;I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 108
    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_4
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 112
    .line 113
    .line 114
    :goto_4
    new-instance v1, LB1/s;

    .line 115
    .line 116
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setUserAgentString"

    .line 117
    .line 118
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 119
    .line 120
    .line 121
    if-eqz p1, :cond_5

    .line 122
    .line 123
    new-instance v2, LM1/L;

    .line 124
    .line 125
    const/4 v4, 0x2

    .line 126
    invoke-direct {v2, p1, v4}, LM1/L;-><init>(LM1/s;I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 130
    .line 131
    .line 132
    goto :goto_5

    .line 133
    :cond_5
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 134
    .line 135
    .line 136
    :goto_5
    new-instance v1, LB1/s;

    .line 137
    .line 138
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setMediaPlaybackRequiresUserGesture"

    .line 139
    .line 140
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 141
    .line 142
    .line 143
    if-eqz p1, :cond_6

    .line 144
    .line 145
    new-instance v2, LM1/L;

    .line 146
    .line 147
    const/4 v4, 0x3

    .line 148
    invoke-direct {v2, p1, v4}, LM1/L;-><init>(LM1/s;I)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 152
    .line 153
    .line 154
    goto :goto_6

    .line 155
    :cond_6
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 156
    .line 157
    .line 158
    :goto_6
    new-instance v1, LB1/s;

    .line 159
    .line 160
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setSupportZoom"

    .line 161
    .line 162
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 163
    .line 164
    .line 165
    if-eqz p1, :cond_7

    .line 166
    .line 167
    new-instance v2, LM1/L;

    .line 168
    .line 169
    const/4 v4, 0x4

    .line 170
    invoke-direct {v2, p1, v4}, LM1/L;-><init>(LM1/s;I)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 174
    .line 175
    .line 176
    goto :goto_7

    .line 177
    :cond_7
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 178
    .line 179
    .line 180
    :goto_7
    new-instance v1, LB1/s;

    .line 181
    .line 182
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setLoadWithOverviewMode"

    .line 183
    .line 184
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 185
    .line 186
    .line 187
    if-eqz p1, :cond_8

    .line 188
    .line 189
    new-instance v2, LM1/L;

    .line 190
    .line 191
    const/4 v4, 0x5

    .line 192
    invoke-direct {v2, p1, v4}, LM1/L;-><init>(LM1/s;I)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 196
    .line 197
    .line 198
    goto :goto_8

    .line 199
    :cond_8
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 200
    .line 201
    .line 202
    :goto_8
    new-instance v1, LB1/s;

    .line 203
    .line 204
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setUseWideViewPort"

    .line 205
    .line 206
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 207
    .line 208
    .line 209
    if-eqz p1, :cond_9

    .line 210
    .line 211
    new-instance v2, LM1/L;

    .line 212
    .line 213
    const/4 v4, 0x6

    .line 214
    invoke-direct {v2, p1, v4}, LM1/L;-><init>(LM1/s;I)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 218
    .line 219
    .line 220
    goto :goto_9

    .line 221
    :cond_9
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 222
    .line 223
    .line 224
    :goto_9
    new-instance v1, LB1/s;

    .line 225
    .line 226
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setDisplayZoomControls"

    .line 227
    .line 228
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 229
    .line 230
    .line 231
    if-eqz p1, :cond_a

    .line 232
    .line 233
    new-instance v2, LM1/L;

    .line 234
    .line 235
    const/4 v4, 0x7

    .line 236
    invoke-direct {v2, p1, v4}, LM1/L;-><init>(LM1/s;I)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 240
    .line 241
    .line 242
    goto :goto_a

    .line 243
    :cond_a
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 244
    .line 245
    .line 246
    :goto_a
    new-instance v1, LB1/s;

    .line 247
    .line 248
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setBuiltInZoomControls"

    .line 249
    .line 250
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 251
    .line 252
    .line 253
    if-eqz p1, :cond_b

    .line 254
    .line 255
    new-instance v2, LM1/L;

    .line 256
    .line 257
    const/16 v4, 0x8

    .line 258
    .line 259
    invoke-direct {v2, p1, v4}, LM1/L;-><init>(LM1/s;I)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 263
    .line 264
    .line 265
    goto :goto_b

    .line 266
    :cond_b
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 267
    .line 268
    .line 269
    :goto_b
    new-instance v1, LB1/s;

    .line 270
    .line 271
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setAllowFileAccess"

    .line 272
    .line 273
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 274
    .line 275
    .line 276
    if-eqz p1, :cond_c

    .line 277
    .line 278
    new-instance v2, LM1/L;

    .line 279
    .line 280
    const/16 v4, 0x9

    .line 281
    .line 282
    invoke-direct {v2, p1, v4}, LM1/L;-><init>(LM1/s;I)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 286
    .line 287
    .line 288
    goto :goto_c

    .line 289
    :cond_c
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 290
    .line 291
    .line 292
    :goto_c
    new-instance v1, LB1/s;

    .line 293
    .line 294
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setAllowContentAccess"

    .line 295
    .line 296
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 297
    .line 298
    .line 299
    if-eqz p1, :cond_d

    .line 300
    .line 301
    new-instance v2, LM1/L;

    .line 302
    .line 303
    const/16 v4, 0xa

    .line 304
    .line 305
    invoke-direct {v2, p1, v4}, LM1/L;-><init>(LM1/s;I)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 309
    .line 310
    .line 311
    goto :goto_d

    .line 312
    :cond_d
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 313
    .line 314
    .line 315
    :goto_d
    new-instance v1, LB1/s;

    .line 316
    .line 317
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setGeolocationEnabled"

    .line 318
    .line 319
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 320
    .line 321
    .line 322
    if-eqz p1, :cond_e

    .line 323
    .line 324
    new-instance v2, LM1/L;

    .line 325
    .line 326
    const/16 v4, 0xb

    .line 327
    .line 328
    invoke-direct {v2, p1, v4}, LM1/L;-><init>(LM1/s;I)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 332
    .line 333
    .line 334
    goto :goto_e

    .line 335
    :cond_e
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 336
    .line 337
    .line 338
    :goto_e
    new-instance v1, LB1/s;

    .line 339
    .line 340
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setTextZoom"

    .line 341
    .line 342
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 343
    .line 344
    .line 345
    if-eqz p1, :cond_f

    .line 346
    .line 347
    new-instance v2, LM1/L;

    .line 348
    .line 349
    const/16 v4, 0xc

    .line 350
    .line 351
    invoke-direct {v2, p1, v4}, LM1/L;-><init>(LM1/s;I)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 355
    .line 356
    .line 357
    goto :goto_f

    .line 358
    :cond_f
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 359
    .line 360
    .line 361
    :goto_f
    new-instance v1, LB1/s;

    .line 362
    .line 363
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebSettings.getUserAgentString"

    .line 364
    .line 365
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 366
    .line 367
    .line 368
    if-eqz p1, :cond_10

    .line 369
    .line 370
    new-instance v2, LM1/L;

    .line 371
    .line 372
    const/16 v4, 0xd

    .line 373
    .line 374
    invoke-direct {v2, p1, v4}, LM1/L;-><init>(LM1/s;I)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 378
    .line 379
    .line 380
    goto :goto_10

    .line 381
    :cond_10
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 382
    .line 383
    .line 384
    :goto_10
    new-instance v1, LB1/s;

    .line 385
    .line 386
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setMixedContentMode"

    .line 387
    .line 388
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 389
    .line 390
    .line 391
    if-eqz p1, :cond_11

    .line 392
    .line 393
    new-instance p0, LM1/L;

    .line 394
    .line 395
    const/16 v0, 0xe

    .line 396
    .line 397
    invoke-direct {p0, p1, v0}, LM1/L;-><init>(LM1/s;I)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v1, p0}, LB1/s;->y(LC1/b;)V

    .line 401
    .line 402
    .line 403
    return-void

    .line 404
    :cond_11
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 405
    .line 406
    .line 407
    return-void
.end method

.method public static final C(Ln2/q;Ln2/q;LZ1/p;)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    :try_start_0
    invoke-static {v0, p2}, La2/r;->a(ILjava/lang/Object;)V

    .line 3
    .line 4
    .line 5
    invoke-interface {p2, p1, p0}, LZ1/p;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    move-exception p1

    .line 11
    new-instance p2, Li2/o;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-direct {p2, p1, v0}, Li2/o;-><init>(Ljava/lang/Throwable;Z)V

    .line 15
    .line 16
    .line 17
    move-object p1, p2

    .line 18
    :goto_0
    sget-object p2, LS1/a;->k:LS1/a;

    .line 19
    .line 20
    if-ne p1, p2, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    invoke-virtual {p0, p1}, Li2/W;->G(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    sget-object p1, Li2/u;->d:LB1/g;

    .line 28
    .line 29
    if-ne p0, p1, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    instance-of p1, p0, Li2/o;

    .line 33
    .line 34
    if-nez p1, :cond_2

    .line 35
    .line 36
    invoke-static {p0}, Li2/u;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    :goto_1
    return-object p2

    .line 41
    :cond_2
    check-cast p0, Li2/o;

    .line 42
    .line 43
    iget-object p0, p0, Li2/o;->a:Ljava/lang/Throwable;

    .line 44
    .line 45
    throw p0
.end method

.method public static D([B[B)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    goto :goto_1

    .line 5
    :cond_0
    array-length v1, p0

    .line 6
    array-length v2, p1

    .line 7
    if-ge v1, v2, :cond_1

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_1
    move v1, v0

    .line 11
    :goto_0
    array-length v2, p1

    .line 12
    if-ge v1, v2, :cond_3

    .line 13
    .line 14
    aget-byte v2, p0, v1

    .line 15
    .line 16
    aget-byte v3, p1, v1

    .line 17
    .line 18
    if-eq v2, v3, :cond_2

    .line 19
    .line 20
    :goto_1
    return v0

    .line 21
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_3
    const/4 p0, 0x1

    .line 25
    return p0
.end method

.method public static final E(Ljava/lang/Object;)V
    .locals 1

    .line 1
    instance-of v0, p0, LO1/c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    check-cast p0, LO1/c;

    .line 7
    .line 8
    iget-object p0, p0, LO1/c;->k:Ljava/lang/Throwable;

    .line 9
    .line 10
    throw p0
.end method

.method public static F(LZ1/p;Ljava/lang/Object;LR1/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p2}, LR1/c;->getContext()LR1/h;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, LR1/i;->k:LR1/i;

    .line 11
    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    new-instance v0, LS1/b;

    .line 15
    .line 16
    invoke-direct {v0, p2}, LT1/a;-><init>(LR1/c;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p2}, LR1/c;->getContext()LR1/h;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    sget-object v1, LR1/i;->k:LR1/i;

    .line 24
    .line 25
    if-ne p2, v1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 29
    .line 30
    const-string p1, "Coroutines with restricted suspension must have EmptyCoroutineContext"

    .line 31
    .line 32
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p0

    .line 36
    :cond_1
    new-instance v1, LS1/c;

    .line 37
    .line 38
    invoke-direct {v1, p2, v0}, LT1/c;-><init>(LR1/c;LR1/h;)V

    .line 39
    .line 40
    .line 41
    move-object v0, v1

    .line 42
    :goto_0
    const/4 p2, 0x2

    .line 43
    invoke-static {p2, p0}, La2/r;->a(ILjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-interface {p0, p1, v0}, LZ1/p;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method

.method public static G(Landroid/os/Parcel;ILandroid/os/Bundle;)V
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {p0, p1}, LH2/h;->Q(Landroid/os/Parcel;I)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-virtual {p0, p2}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, p1}, LH2/h;->R(Landroid/os/Parcel;I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static H(Landroid/os/Parcel;I[B)V
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {p0, p1}, LH2/h;->Q(Landroid/os/Parcel;I)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-virtual {p0, p2}, Landroid/os/Parcel;->writeByteArray([B)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, p1}, LH2/h;->R(Landroid/os/Parcel;I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static J(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {p0, p1}, LH2/h;->Q(Landroid/os/Parcel;I)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-interface {p2, p0, p3}, Landroid/os/Parcelable;->writeToParcel(Landroid/os/Parcel;I)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, p1}, LH2/h;->R(Landroid/os/Parcel;I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static K(Landroid/os/Parcel;ILjava/lang/String;)V
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {p0, p1}, LH2/h;->Q(Landroid/os/Parcel;I)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-virtual {p0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, p1}, LH2/h;->R(Landroid/os/Parcel;I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static L(Landroid/os/Parcel;ILjava/util/List;)V
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {p0, p1}, LH2/h;->Q(Landroid/os/Parcel;I)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-virtual {p0, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, p1}, LH2/h;->R(Landroid/os/Parcel;I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static M(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V
    .locals 6

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {p0, p1}, LH2/h;->Q(Landroid/os/Parcel;I)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    array-length v0, p2

    .line 9
    invoke-virtual {p0, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    move v2, v1

    .line 14
    :goto_0
    if-ge v2, v0, :cond_2

    .line 15
    .line 16
    aget-object v3, p2, v2

    .line 17
    .line 18
    if-nez v3, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 21
    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    const/4 v5, 0x1

    .line 29
    invoke-virtual {p0, v5}, Landroid/os/Parcel;->writeInt(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    invoke-interface {v3, p0, p3}, Landroid/os/Parcelable;->writeToParcel(Landroid/os/Parcel;I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    invoke-virtual {p0, v4}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 44
    .line 45
    .line 46
    sub-int v4, v3, v5

    .line 47
    .line 48
    invoke-virtual {p0, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v3}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 52
    .line 53
    .line 54
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    invoke-static {p0, p1}, LH2/h;->R(Landroid/os/Parcel;I)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public static N(Landroid/os/Parcel;ILjava/util/List;)V
    .locals 6

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {p0, p1}, LH2/h;->Q(Landroid/os/Parcel;I)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p0, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    move v2, v1

    .line 17
    :goto_0
    if-ge v2, v0, :cond_2

    .line 18
    .line 19
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Landroid/os/Parcelable;

    .line 24
    .line 25
    if-nez v3, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    const/4 v5, 0x1

    .line 36
    invoke-virtual {p0, v5}, Landroid/os/Parcel;->writeInt(I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    invoke-interface {v3, p0, v1}, Landroid/os/Parcelable;->writeToParcel(Landroid/os/Parcel;I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    invoke-virtual {p0, v4}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 51
    .line 52
    .line 53
    sub-int v4, v3, v5

    .line 54
    .line 55
    invoke-virtual {p0, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v3}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 59
    .line 60
    .line 61
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    invoke-static {p0, p1}, LH2/h;->R(Landroid/os/Parcel;I)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public static final O(Ljava/lang/String;Ljava/lang/String;ZZ)Landroid/os/Bundle;
    .locals 2

    .line 1
    const-string v0, "serverClientId"

    .line 2
    .line 3
    invoke-static {p0, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/os/Bundle;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v1, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_SERVER_CLIENT_ID"

    .line 12
    .line 13
    invoke-virtual {v0, v1, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string p0, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_NONCE"

    .line 17
    .line 18
    invoke-virtual {v0, p0, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string p0, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_FILTER_BY_AUTHORIZED_ACCOUNTS"

    .line 22
    .line 23
    invoke-virtual {v0, p0, p2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 24
    .line 25
    .line 26
    const-string p0, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_LINKED_SERVICE_ID"

    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    invoke-virtual {v0, p0, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const-string p0, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN_DEPOSITION_SCOPES"

    .line 33
    .line 34
    invoke-virtual {v0, p0, p1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 35
    .line 36
    .line 37
    const-string p0, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_REQUEST_VERIFIED_PHONE_NUMBER"

    .line 38
    .line 39
    const/4 p2, 0x0

    .line 40
    invoke-virtual {v0, p0, p2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string p0, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_AUTO_SELECT_ENABLED"

    .line 44
    .line 45
    invoke-virtual {v0, p0, p3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string p0, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_HOSTED_DOMAIN_FILTER"

    .line 49
    .line 50
    invoke-virtual {v0, p0, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v0
.end method

.method public static P(Landroid/os/Parcel;II)V
    .locals 0

    .line 1
    shl-int/lit8 p2, p2, 0x10

    .line 2
    .line 3
    or-int/2addr p1, p2

    .line 4
    invoke-virtual {p0, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static Q(Landroid/os/Parcel;I)I
    .locals 1

    .line 1
    const/high16 v0, -0x10000

    .line 2
    .line 3
    or-int/2addr p1, v0

    .line 4
    invoke-virtual {p0, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 5
    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-virtual {p0, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public static R(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sub-int v1, v0, p1

    .line 6
    .line 7
    add-int/lit8 p1, p1, -0x4

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public static c(FLjava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-static {p0}, Ljava/lang/Float;->isInfinite(F)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 15
    .line 16
    const-string v0, " must not be infinite"

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p0

    .line 26
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 27
    .line 28
    const-string v0, " must not be NaN"

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p0
.end method

.method public static d(Landroid/content/Context;Ljava/lang/String;)I
    .locals 2

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    const/16 v1, 0x21

    .line 6
    .line 7
    if-ge v0, v1, :cond_1

    .line 8
    .line 9
    const-string v0, "android.permission.POST_NOTIFICATIONS"

    .line 10
    .line 11
    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    new-instance p1, Ls/h;

    .line 18
    .line 19
    invoke-direct {p1, p0}, Ls/h;-><init>(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    iget-object p0, p1, Ls/h;->a:Landroid/app/NotificationManager;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/app/NotificationManager;->areNotificationsEnabled()Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-eqz p0, :cond_0

    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    return p0

    .line 32
    :cond_0
    const/4 p0, -0x1

    .line 33
    return p0

    .line 34
    :cond_1
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-static {}, Landroid/os/Process;->myUid()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-virtual {p0, p1, v0, v1}, Landroid/content/Context;->checkPermission(Ljava/lang/String;II)I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    return p0

    .line 47
    :cond_2
    new-instance p0, Ljava/lang/NullPointerException;

    .line 48
    .line 49
    const-string p1, "permission must be non-null"

    .line 50
    .line 51
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p0
.end method

.method public static e(Ljava/io/Closeable;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    :catch_0
    return-void

    .line 7
    :catch_1
    move-exception p0

    .line 8
    throw p0

    .line 9
    :cond_0
    return-void
.end method

.method public static f(Ljava/io/Serializable;)[J
    .locals 4

    .line 1
    instance-of v0, p0, [I

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p0, [I

    .line 6
    .line 7
    array-length v0, p0

    .line 8
    new-array v0, v0, [J

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    array-length v2, p0

    .line 12
    if-ge v1, v2, :cond_0

    .line 13
    .line 14
    aget v2, p0, v1

    .line 15
    .line 16
    int-to-long v2, v2

    .line 17
    aput-wide v2, v0, v1

    .line 18
    .line 19
    add-int/lit8 v1, v1, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-object v0

    .line 23
    :cond_1
    instance-of v0, p0, [J

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    check-cast p0, [J

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_2
    const/4 p0, 0x0

    .line 31
    return-object p0
.end method

.method public static g(LZ/b;LZ/c;I)V
    .locals 5

    .line 1
    const/16 v0, 0x2000

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    :goto_0
    if-lez p2, :cond_1

    .line 6
    .line 7
    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-virtual {p0, v1, v3, v2}, LZ/b;->read([BII)I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    if-ne v4, v2, :cond_0

    .line 17
    .line 18
    sub-int/2addr p2, v4

    .line 19
    invoke-virtual {p1, v1, v3, v4}, LZ/c;->write([BII)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance p0, Ljava/io/IOException;

    .line 24
    .line 25
    const-string p1, "Failed to copy the given amount of bytes from the inputstream to the output stream."

    .line 26
    .line 27
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p0

    .line 31
    :cond_1
    return-void
.end method

.method public static h(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    .locals 3

    .line 1
    const/16 v0, 0x2000

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    :goto_0
    invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, -0x1

    .line 10
    if-eq v1, v2, :cond_0

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {p1, v0, v2, v1}, Ljava/io/OutputStream;->write([BII)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    return-void
.end method

.method public static final i(Ljava/lang/Throwable;)LO1/c;
    .locals 1

    .line 1
    const-string v0, "exception"

    .line 2
    .line 3
    invoke-static {p0, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LO1/c;

    .line 7
    .line 8
    invoke-direct {v0, p0}, LO1/c;-><init>(Ljava/lang/Throwable;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static j(Ljava/lang/String;Landroid/os/Bundle;)LH/c;
    .locals 4

    .line 1
    const-string v0, "androidx.credentials.TYPE_RESTORE_CREDENTIAL"

    .line 2
    .line 3
    const-string v1, "data"

    .line 4
    .line 5
    invoke-static {p1, v1}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    sparse-switch v1, :sswitch_data_0

    .line 13
    .line 14
    .line 15
    goto/16 :goto_0

    .line 16
    .line 17
    :sswitch_0
    const-string v0, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL"

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0
    :try_end_0
    .catch LL/a; {:try_start_0 .. :try_end_0} :catch_4

    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    :try_start_1
    const-string v0, "androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON"

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-instance v1, LH/j;

    .line 32
    .line 33
    invoke-static {v0}, La2/h;->b(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    const/4 v2, 0x2

    .line 37
    invoke-direct {v1, v0, p1, v2}, LH/j;-><init>(Ljava/lang/String;Landroid/os/Bundle;I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 38
    .line 39
    .line 40
    return-object v1

    .line 41
    :catch_0
    :try_start_2
    new-instance v0, LL/a;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 44
    .line 45
    .line 46
    throw v0

    .line 47
    :sswitch_1
    const-string v0, "android.credentials.TYPE_PASSWORD_CREDENTIAL"

    .line 48
    .line 49
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0
    :try_end_2
    .catch LL/a; {:try_start_2 .. :try_end_2} :catch_4

    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    :try_start_3
    const-string v0, "androidx.credentials.BUNDLE_KEY_ID"

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const-string v1, "androidx.credentials.BUNDLE_KEY_PASSWORD"

    .line 62
    .line 63
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    new-instance v2, LH/j;

    .line 68
    .line 69
    invoke-static {v0}, La2/h;->b(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-static {v1}, La2/h;->b(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    const/4 v0, 0x1

    .line 76
    invoke-direct {v2, v1, p1, v0}, LH/j;-><init>(Ljava/lang/String;Landroid/os/Bundle;I)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 77
    .line 78
    .line 79
    return-object v2

    .line 80
    :catch_1
    :try_start_4
    new-instance v0, LL/a;

    .line 81
    .line 82
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 83
    .line 84
    .line 85
    throw v0

    .line 86
    :sswitch_2
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eqz v1, :cond_3

    .line 91
    .line 92
    const-string v1, "androidx.credentials.BUNDLE_KEY_GET_RESTORE_CREDENTIAL_RESPONSE"

    .line 93
    .line 94
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    if-eqz v1, :cond_1

    .line 99
    .line 100
    new-instance v2, LH/j;

    .line 101
    .line 102
    invoke-direct {v2, v0, p1}, LH/c;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 106
    .line 107
    .line 108
    move-result v0
    :try_end_4
    .catch LL/a; {:try_start_4 .. :try_end_4} :catch_4

    .line 109
    if-eqz v0, :cond_0

    .line 110
    .line 111
    :try_start_5
    new-instance v0, Lorg/json/JSONObject;

    .line 112
    .line 113
    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 114
    .line 115
    .line 116
    return-object v2

    .line 117
    :catch_2
    :cond_0
    :try_start_6
    const-string v0, "authenticationResponseJson must not be empty, and must be a valid JSON"

    .line 118
    .line 119
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 120
    .line 121
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw v1

    .line 125
    :cond_1
    new-instance v0, LI/j;

    .line 126
    .line 127
    const-string v1, "The device does not contain a restore credential."

    .line 128
    .line 129
    invoke-direct {v0, v1}, LI/j;-><init>(Ljava/lang/CharSequence;)V

    .line 130
    .line 131
    .line 132
    throw v0

    .line 133
    :sswitch_3
    const-string v0, "androidx.credentials.TYPE_DIGITAL_CREDENTIAL"

    .line 134
    .line 135
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v0
    :try_end_6
    .catch LL/a; {:try_start_6 .. :try_end_6} :catch_4

    .line 139
    if-eqz v0, :cond_3

    .line 140
    .line 141
    :try_start_7
    const-string v0, "androidx.credentials.BUNDLE_KEY_REQUEST_JSON"

    .line 142
    .line 143
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-static {v0}, La2/h;->b(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    instance-of v1, v0, [B

    .line 151
    .line 152
    if-eqz v1, :cond_2

    .line 153
    .line 154
    new-instance v1, LH/j;

    .line 155
    .line 156
    new-instance v2, Ljava/lang/String;

    .line 157
    .line 158
    check-cast v0, [B

    .line 159
    .line 160
    sget-object v3, Lh2/a;->a:Ljava/nio/charset/Charset;

    .line 161
    .line 162
    invoke-direct {v2, v0, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 163
    .line 164
    .line 165
    const/4 v0, 0x0

    .line 166
    invoke-direct {v1, v2, p1, v0}, LH/j;-><init>(Ljava/lang/String;Landroid/os/Bundle;I)V

    .line 167
    .line 168
    .line 169
    return-object v1

    .line 170
    :cond_2
    new-instance v1, LH/j;

    .line 171
    .line 172
    check-cast v0, Ljava/lang/String;

    .line 173
    .line 174
    const/4 v2, 0x0

    .line 175
    invoke-direct {v1, v0, p1, v2}, LH/j;-><init>(Ljava/lang/String;Landroid/os/Bundle;I)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    .line 176
    .line 177
    .line 178
    return-object v1

    .line 179
    :catch_3
    :try_start_8
    new-instance v0, LL/a;

    .line 180
    .line 181
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 182
    .line 183
    .line 184
    throw v0

    .line 185
    :cond_3
    :goto_0
    new-instance v0, LL/a;

    .line 186
    .line 187
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 188
    .line 189
    .line 190
    throw v0
    :try_end_8
    .catch LL/a; {:try_start_8 .. :try_end_8} :catch_4

    .line 191
    :catch_4
    new-instance v0, LH/i;

    .line 192
    .line 193
    invoke-direct {v0, p0, p1}, LH/i;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 194
    .line 195
    .line 196
    return-object v0

    .line 197
    :sswitch_data_0
    .sparse-switch
        -0x640a7654 -> :sswitch_3
        -0x3ff0a08a -> :sswitch_2
        -0x20663139 -> :sswitch_1
        -0x5aa2881 -> :sswitch_0
    .end sparse-switch
.end method

.method public static k(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 7

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_4

    .line 4
    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    if-eqz p0, :cond_17

    .line 7
    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    goto/16 :goto_5

    .line 11
    .line 12
    :cond_1
    instance-of v1, p0, [B

    .line 13
    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    instance-of v1, p1, [B

    .line 17
    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    check-cast p0, [B

    .line 21
    .line 22
    check-cast p1, [B

    .line 23
    .line 24
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    return p0

    .line 29
    :cond_2
    instance-of v1, p0, [I

    .line 30
    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    instance-of v1, p1, [I

    .line 34
    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    check-cast p0, [I

    .line 38
    .line 39
    check-cast p1, [I

    .line 40
    .line 41
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([I[I)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    return p0

    .line 46
    :cond_3
    instance-of v1, p0, [J

    .line 47
    .line 48
    if-eqz v1, :cond_4

    .line 49
    .line 50
    instance-of v1, p1, [J

    .line 51
    .line 52
    if-eqz v1, :cond_4

    .line 53
    .line 54
    check-cast p0, [J

    .line 55
    .line 56
    check-cast p1, [J

    .line 57
    .line 58
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([J[J)Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    return p0

    .line 63
    :cond_4
    instance-of v1, p0, [D

    .line 64
    .line 65
    if-eqz v1, :cond_7

    .line 66
    .line 67
    instance-of v1, p1, [D

    .line 68
    .line 69
    if-eqz v1, :cond_7

    .line 70
    .line 71
    check-cast p0, [D

    .line 72
    .line 73
    array-length v1, p0

    .line 74
    check-cast p1, [D

    .line 75
    .line 76
    array-length v2, p1

    .line 77
    if-eq v1, v2, :cond_5

    .line 78
    .line 79
    goto/16 :goto_5

    .line 80
    .line 81
    :cond_5
    array-length v1, p0

    .line 82
    move v2, v0

    .line 83
    :goto_0
    if-ge v2, v1, :cond_13

    .line 84
    .line 85
    aget-wide v3, p0, v2

    .line 86
    .line 87
    aget-wide v5, p1, v2

    .line 88
    .line 89
    invoke-static {v3, v4, v5, v6}, LH2/h;->n(DD)Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-nez v3, :cond_6

    .line 94
    .line 95
    goto/16 :goto_5

    .line 96
    .line 97
    :cond_6
    add-int/lit8 v2, v2, 0x1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_7
    instance-of v1, p0, [F

    .line 101
    .line 102
    if-eqz v1, :cond_a

    .line 103
    .line 104
    instance-of v1, p1, [F

    .line 105
    .line 106
    if-eqz v1, :cond_a

    .line 107
    .line 108
    check-cast p0, [F

    .line 109
    .line 110
    array-length v1, p0

    .line 111
    check-cast p1, [F

    .line 112
    .line 113
    array-length v2, p1

    .line 114
    if-eq v1, v2, :cond_8

    .line 115
    .line 116
    goto/16 :goto_5

    .line 117
    .line 118
    :cond_8
    array-length v1, p0

    .line 119
    move v2, v0

    .line 120
    :goto_1
    if-ge v2, v1, :cond_13

    .line 121
    .line 122
    aget v3, p0, v2

    .line 123
    .line 124
    aget v4, p1, v2

    .line 125
    .line 126
    invoke-static {v3, v4}, LH2/h;->o(FF)Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    if-nez v3, :cond_9

    .line 131
    .line 132
    goto/16 :goto_5

    .line 133
    .line 134
    :cond_9
    add-int/lit8 v2, v2, 0x1

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_a
    instance-of v1, p0, [Ljava/lang/Object;

    .line 138
    .line 139
    if-eqz v1, :cond_d

    .line 140
    .line 141
    instance-of v1, p1, [Ljava/lang/Object;

    .line 142
    .line 143
    if-eqz v1, :cond_d

    .line 144
    .line 145
    check-cast p0, [Ljava/lang/Object;

    .line 146
    .line 147
    array-length v1, p0

    .line 148
    check-cast p1, [Ljava/lang/Object;

    .line 149
    .line 150
    array-length v2, p1

    .line 151
    if-eq v1, v2, :cond_b

    .line 152
    .line 153
    goto/16 :goto_5

    .line 154
    .line 155
    :cond_b
    array-length v1, p0

    .line 156
    move v2, v0

    .line 157
    :goto_2
    if-ge v2, v1, :cond_13

    .line 158
    .line 159
    aget-object v3, p0, v2

    .line 160
    .line 161
    aget-object v4, p1, v2

    .line 162
    .line 163
    invoke-static {v3, v4}, LH2/h;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    if-nez v3, :cond_c

    .line 168
    .line 169
    goto/16 :goto_5

    .line 170
    .line 171
    :cond_c
    add-int/lit8 v2, v2, 0x1

    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_d
    instance-of v1, p0, Ljava/util/List;

    .line 175
    .line 176
    if-eqz v1, :cond_10

    .line 177
    .line 178
    instance-of v1, p1, Ljava/util/List;

    .line 179
    .line 180
    if-eqz v1, :cond_10

    .line 181
    .line 182
    check-cast p0, Ljava/util/List;

    .line 183
    .line 184
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    check-cast p1, Ljava/util/List;

    .line 189
    .line 190
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    if-eq v1, v2, :cond_e

    .line 195
    .line 196
    goto/16 :goto_5

    .line 197
    .line 198
    :cond_e
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    :cond_f
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    if-eqz v1, :cond_13

    .line 211
    .line 212
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    if-eqz v1, :cond_13

    .line 217
    .line 218
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    invoke-static {v1, v2}, LH2/h;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    if-nez v1, :cond_f

    .line 231
    .line 232
    goto/16 :goto_5

    .line 233
    .line 234
    :cond_10
    instance-of v1, p0, Ljava/util/Map;

    .line 235
    .line 236
    if-eqz v1, :cond_14

    .line 237
    .line 238
    instance-of v1, p1, Ljava/util/Map;

    .line 239
    .line 240
    if-eqz v1, :cond_14

    .line 241
    .line 242
    check-cast p0, Ljava/util/Map;

    .line 243
    .line 244
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    check-cast p1, Ljava/util/Map;

    .line 249
    .line 250
    invoke-interface {p1}, Ljava/util/Map;->size()I

    .line 251
    .line 252
    .line 253
    move-result v2

    .line 254
    if-eq v1, v2, :cond_11

    .line 255
    .line 256
    goto/16 :goto_5

    .line 257
    .line 258
    :cond_11
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 263
    .line 264
    .line 265
    move-result-object p0

    .line 266
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 267
    .line 268
    .line 269
    move-result v1

    .line 270
    if-eqz v1, :cond_13

    .line 271
    .line 272
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    check-cast v1, Ljava/util/Map$Entry;

    .line 277
    .line 278
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 287
    .line 288
    .line 289
    move-result-object v3

    .line 290
    :cond_12
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 291
    .line 292
    .line 293
    move-result v4

    .line 294
    if-eqz v4, :cond_17

    .line 295
    .line 296
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v4

    .line 300
    check-cast v4, Ljava/util/Map$Entry;

    .line 301
    .line 302
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v5

    .line 306
    invoke-static {v2, v5}, LH2/h;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-result v5

    .line 310
    if-eqz v5, :cond_12

    .line 311
    .line 312
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v2

    .line 320
    invoke-static {v1, v2}, LH2/h;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    if-eqz v1, :cond_17

    .line 325
    .line 326
    goto :goto_3

    .line 327
    :cond_13
    :goto_4
    const/4 p0, 0x1

    .line 328
    return p0

    .line 329
    :cond_14
    instance-of v0, p0, Ljava/lang/Double;

    .line 330
    .line 331
    if-eqz v0, :cond_15

    .line 332
    .line 333
    instance-of v0, p1, Ljava/lang/Double;

    .line 334
    .line 335
    if-eqz v0, :cond_15

    .line 336
    .line 337
    check-cast p0, Ljava/lang/Number;

    .line 338
    .line 339
    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    .line 340
    .line 341
    .line 342
    move-result-wide v0

    .line 343
    check-cast p1, Ljava/lang/Number;

    .line 344
    .line 345
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 346
    .line 347
    .line 348
    move-result-wide p0

    .line 349
    invoke-static {v0, v1, p0, p1}, LH2/h;->n(DD)Z

    .line 350
    .line 351
    .line 352
    move-result p0

    .line 353
    return p0

    .line 354
    :cond_15
    instance-of v0, p0, Ljava/lang/Float;

    .line 355
    .line 356
    if-eqz v0, :cond_16

    .line 357
    .line 358
    instance-of v0, p1, Ljava/lang/Float;

    .line 359
    .line 360
    if-eqz v0, :cond_16

    .line 361
    .line 362
    check-cast p0, Ljava/lang/Number;

    .line 363
    .line 364
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 365
    .line 366
    .line 367
    move-result p0

    .line 368
    check-cast p1, Ljava/lang/Number;

    .line 369
    .line 370
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 371
    .line 372
    .line 373
    move-result p1

    .line 374
    invoke-static {p0, p1}, LH2/h;->o(FF)Z

    .line 375
    .line 376
    .line 377
    move-result p0

    .line 378
    return p0

    .line 379
    :cond_16
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    move-result p0

    .line 383
    return p0

    .line 384
    :cond_17
    :goto_5
    return v0
.end method

.method public static l(Ljava/lang/Object;)I
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p0, [B

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast p0, [B

    .line 10
    .line 11
    invoke-static {p0}, Ljava/util/Arrays;->hashCode([B)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_1
    instance-of v1, p0, [I

    .line 17
    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    check-cast p0, [I

    .line 21
    .line 22
    invoke-static {p0}, Ljava/util/Arrays;->hashCode([I)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :cond_2
    instance-of v1, p0, [J

    .line 28
    .line 29
    if-eqz v1, :cond_3

    .line 30
    .line 31
    check-cast p0, [J

    .line 32
    .line 33
    invoke-static {p0}, Ljava/util/Arrays;->hashCode([J)I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    return p0

    .line 38
    :cond_3
    instance-of v1, p0, [D

    .line 39
    .line 40
    const/16 v2, 0x20

    .line 41
    .line 42
    const-wide/16 v3, 0x0

    .line 43
    .line 44
    const/4 v5, 0x1

    .line 45
    if-eqz v1, :cond_6

    .line 46
    .line 47
    check-cast p0, [D

    .line 48
    .line 49
    array-length v1, p0

    .line 50
    :goto_0
    if-ge v0, v1, :cond_5

    .line 51
    .line 52
    aget-wide v6, p0, v0

    .line 53
    .line 54
    mul-int/lit8 v5, v5, 0x1f

    .line 55
    .line 56
    cmpg-double v8, v6, v3

    .line 57
    .line 58
    if-nez v8, :cond_4

    .line 59
    .line 60
    move-wide v6, v3

    .line 61
    :cond_4
    invoke-static {v6, v7}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 62
    .line 63
    .line 64
    move-result-wide v6

    .line 65
    ushr-long v8, v6, v2

    .line 66
    .line 67
    xor-long/2addr v6, v8

    .line 68
    long-to-int v6, v6

    .line 69
    add-int/2addr v5, v6

    .line 70
    add-int/lit8 v0, v0, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_5
    return v5

    .line 74
    :cond_6
    instance-of v1, p0, [F

    .line 75
    .line 76
    const/4 v6, 0x0

    .line 77
    if-eqz v1, :cond_9

    .line 78
    .line 79
    check-cast p0, [F

    .line 80
    .line 81
    array-length v1, p0

    .line 82
    :goto_1
    if-ge v0, v1, :cond_8

    .line 83
    .line 84
    aget v2, p0, v0

    .line 85
    .line 86
    mul-int/lit8 v5, v5, 0x1f

    .line 87
    .line 88
    cmpg-float v3, v2, v6

    .line 89
    .line 90
    if-nez v3, :cond_7

    .line 91
    .line 92
    move v2, v6

    .line 93
    :cond_7
    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    add-int/2addr v5, v2

    .line 98
    add-int/lit8 v0, v0, 0x1

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_8
    return v5

    .line 102
    :cond_9
    instance-of v1, p0, [Ljava/lang/Object;

    .line 103
    .line 104
    if-eqz v1, :cond_b

    .line 105
    .line 106
    check-cast p0, [Ljava/lang/Object;

    .line 107
    .line 108
    array-length v1, p0

    .line 109
    :goto_2
    if-ge v0, v1, :cond_a

    .line 110
    .line 111
    aget-object v2, p0, v0

    .line 112
    .line 113
    mul-int/lit8 v5, v5, 0x1f

    .line 114
    .line 115
    invoke-static {v2}, LH2/h;->l(Ljava/lang/Object;)I

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    add-int/2addr v5, v2

    .line 120
    add-int/lit8 v0, v0, 0x1

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_a
    return v5

    .line 124
    :cond_b
    instance-of v1, p0, Ljava/util/List;

    .line 125
    .line 126
    if-eqz v1, :cond_d

    .line 127
    .line 128
    check-cast p0, Ljava/util/List;

    .line 129
    .line 130
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-eqz v0, :cond_c

    .line 139
    .line 140
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    mul-int/lit8 v5, v5, 0x1f

    .line 145
    .line 146
    invoke-static {v0}, LH2/h;->l(Ljava/lang/Object;)I

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    add-int/2addr v5, v0

    .line 151
    goto :goto_3

    .line 152
    :cond_c
    return v5

    .line 153
    :cond_d
    instance-of v1, p0, Ljava/util/Map;

    .line 154
    .line 155
    if-eqz v1, :cond_f

    .line 156
    .line 157
    check-cast p0, Ljava/util/Map;

    .line 158
    .line 159
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    if-eqz v1, :cond_e

    .line 172
    .line 173
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    check-cast v1, Ljava/util/Map$Entry;

    .line 178
    .line 179
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    invoke-static {v2}, LH2/h;->l(Ljava/lang/Object;)I

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    mul-int/lit8 v2, v2, 0x1f

    .line 188
    .line 189
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    invoke-static {v1}, LH2/h;->l(Ljava/lang/Object;)I

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    xor-int/2addr v1, v2

    .line 198
    add-int/2addr v0, v1

    .line 199
    goto :goto_4

    .line 200
    :cond_e
    return v0

    .line 201
    :cond_f
    instance-of v0, p0, Ljava/lang/Double;

    .line 202
    .line 203
    if-eqz v0, :cond_11

    .line 204
    .line 205
    check-cast p0, Ljava/lang/Number;

    .line 206
    .line 207
    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    .line 208
    .line 209
    .line 210
    move-result-wide v0

    .line 211
    cmpg-double p0, v0, v3

    .line 212
    .line 213
    if-nez p0, :cond_10

    .line 214
    .line 215
    goto :goto_5

    .line 216
    :cond_10
    move-wide v3, v0

    .line 217
    :goto_5
    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 218
    .line 219
    .line 220
    move-result-wide v0

    .line 221
    ushr-long v2, v0, v2

    .line 222
    .line 223
    xor-long/2addr v0, v2

    .line 224
    long-to-int p0, v0

    .line 225
    return p0

    .line 226
    :cond_11
    instance-of v0, p0, Ljava/lang/Float;

    .line 227
    .line 228
    if-eqz v0, :cond_13

    .line 229
    .line 230
    check-cast p0, Ljava/lang/Number;

    .line 231
    .line 232
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 233
    .line 234
    .line 235
    move-result p0

    .line 236
    cmpg-float v0, p0, v6

    .line 237
    .line 238
    if-nez v0, :cond_12

    .line 239
    .line 240
    goto :goto_6

    .line 241
    :cond_12
    move v6, p0

    .line 242
    :goto_6
    invoke-static {v6}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 243
    .line 244
    .line 245
    move-result p0

    .line 246
    return p0

    .line 247
    :cond_13
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 248
    .line 249
    .line 250
    move-result p0

    .line 251
    return p0
.end method

.method public static m(Landroid/view/View;Landroid/view/KeyEvent;)Z
    .locals 3

    .line 1
    sget-object v0, LD/G;->a:Ljava/lang/reflect/Field;

    .line 2
    .line 3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    const/16 v1, 0x1c

    .line 6
    .line 7
    if-lt v0, v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_1

    .line 10
    .line 11
    :cond_0
    sget-object v0, LD/F;->d:Ljava/util/ArrayList;

    .line 12
    .line 13
    const v0, 0x7f0900d1

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, LD/F;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    new-instance v1, LD/F;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v2, v1, LD/F;->a:Ljava/util/WeakHashMap;

    .line 31
    .line 32
    iput-object v2, v1, LD/F;->b:Landroid/util/SparseArray;

    .line 33
    .line 34
    iput-object v2, v1, LD/F;->c:Ljava/lang/ref/WeakReference;

    .line 35
    .line 36
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    iget-object p0, v1, LD/F;->c:Ljava/lang/ref/WeakReference;

    .line 40
    .line 41
    if-eqz p0, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    if-ne p0, p1, :cond_2

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    new-instance p0, Ljava/lang/ref/WeakReference;

    .line 51
    .line 52
    invoke-direct {p0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iput-object p0, v1, LD/F;->c:Ljava/lang/ref/WeakReference;

    .line 56
    .line 57
    iget-object p0, v1, LD/F;->b:Landroid/util/SparseArray;

    .line 58
    .line 59
    if-nez p0, :cond_3

    .line 60
    .line 61
    new-instance p0, Landroid/util/SparseArray;

    .line 62
    .line 63
    invoke-direct {p0}, Landroid/util/SparseArray;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object p0, v1, LD/F;->b:Landroid/util/SparseArray;

    .line 67
    .line 68
    :cond_3
    iget-object p0, v1, LD/F;->b:Landroid/util/SparseArray;

    .line 69
    .line 70
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    const/4 v1, 0x1

    .line 75
    if-ne v0, v1, :cond_4

    .line 76
    .line 77
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    invoke-virtual {p0, v0}, Landroid/util/SparseArray;->indexOfKey(I)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-ltz v0, :cond_4

    .line 86
    .line 87
    invoke-virtual {p0, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 92
    .line 93
    invoke-virtual {p0, v0}, Landroid/util/SparseArray;->removeAt(I)V

    .line 94
    .line 95
    .line 96
    :cond_4
    if-nez v2, :cond_5

    .line 97
    .line 98
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    invoke-virtual {p0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    move-object v2, p0

    .line 107
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 108
    .line 109
    :cond_5
    if-eqz v2, :cond_8

    .line 110
    .line 111
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    check-cast p0, Landroid/view/View;

    .line 116
    .line 117
    if-eqz p0, :cond_7

    .line 118
    .line 119
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    if-eqz p1, :cond_7

    .line 124
    .line 125
    const p1, 0x7f0900d2

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    check-cast p0, Ljava/util/ArrayList;

    .line 133
    .line 134
    if-eqz p0, :cond_7

    .line 135
    .line 136
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    sub-int/2addr p1, v1

    .line 141
    if-gez p1, :cond_6

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_6
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    new-instance p0, Ljava/lang/ClassCastException;

    .line 152
    .line 153
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 154
    .line 155
    .line 156
    throw p0

    .line 157
    :cond_7
    :goto_0
    return v1

    .line 158
    :cond_8
    :goto_1
    const/4 p0, 0x0

    .line 159
    return p0
.end method

.method public static n(DD)Z
    .locals 5

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmpg-double v2, p0, v0

    .line 4
    .line 5
    if-nez v2, :cond_0

    .line 6
    .line 7
    move-wide v2, v0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-wide v2, p0

    .line 10
    :goto_0
    cmpg-double v4, p2, v0

    .line 11
    .line 12
    if-nez v4, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    move-wide v0, p2

    .line 16
    :goto_1
    cmpg-double v0, v2, v0

    .line 17
    .line 18
    if-nez v0, :cond_2

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_2
    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eqz p0, :cond_3

    .line 26
    .line 27
    invoke-static {p2, p3}, Ljava/lang/Double;->isNaN(D)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_3

    .line 32
    .line 33
    :goto_2
    const/4 p0, 0x1

    .line 34
    return p0

    .line 35
    :cond_3
    const/4 p0, 0x0

    .line 36
    return p0
.end method

.method public static o(FF)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v1, p0, v0

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    move v1, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move v1, p0

    .line 9
    :goto_0
    cmpg-float v2, p1, v0

    .line 10
    .line 11
    if-nez v2, :cond_1

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_1
    move v0, p1

    .line 15
    :goto_1
    cmpg-float v0, v1, v0

    .line 16
    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_2
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_3

    .line 25
    .line 26
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-eqz p0, :cond_3

    .line 31
    .line 32
    :goto_2
    const/4 p0, 0x1

    .line 33
    return p0

    .line 34
    :cond_3
    const/4 p0, 0x0

    .line 35
    return p0
.end method

.method public static p(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0, p1, p2}, LE/e;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-virtual {p0, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p2, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    const/4 p0, 0x0

    .line 24
    return-object p0
.end method

.method public static q(Landroid/content/Context;)Landroid/content/pm/ResolveInfo;
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p0, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    new-instance v0, Landroid/content/Intent;

    .line 11
    .line 12
    const-string v1, "androidx.activity.result.contract.action.PICK_IMAGES"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/high16 v1, 0x110000

    .line 18
    .line 19
    invoke-virtual {p0, v0, v1}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public static r(Le/f;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "input"

    .line 2
    .line 3
    invoke-static {p0, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p0, Le/d;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string p0, "image/*"

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    instance-of v0, p0, Le/e;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    const-string p0, "video/*"

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_1
    instance-of p0, p0, Le/c;

    .line 21
    .line 22
    if-eqz p0, :cond_2

    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return-object p0

    .line 26
    :cond_2
    new-instance p0, LD0/a;

    .line 27
    .line 28
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 29
    .line 30
    .line 31
    throw p0
.end method

.method public static s(LR1/c;)LR1/c;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p0, LT1/c;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p0

    .line 11
    check-cast v0, LT1/c;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    if-eqz v0, :cond_2

    .line 16
    .line 17
    iget-object p0, v0, LT1/c;->m:LR1/c;

    .line 18
    .line 19
    if-nez p0, :cond_2

    .line 20
    .line 21
    invoke-virtual {v0}, LT1/c;->getContext()LR1/h;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    sget-object v1, LR1/d;->k:LR1/d;

    .line 26
    .line 27
    invoke-interface {p0, v1}, LR1/h;->e(LR1/g;)LR1/f;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, LR1/e;

    .line 32
    .line 33
    if-eqz p0, :cond_1

    .line 34
    .line 35
    check-cast p0, Li2/q;

    .line 36
    .line 37
    new-instance v1, Ln2/f;

    .line 38
    .line 39
    invoke-direct {v1, p0, v0}, Ln2/f;-><init>(Li2/q;LT1/c;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move-object v1, v0

    .line 44
    :goto_1
    iput-object v1, v0, LT1/c;->m:LR1/c;

    .line 45
    .line 46
    return-object v1

    .line 47
    :cond_2
    return-object p0
.end method

.method public static u(Landroid/content/Context;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LH2/h;->e:Ljava/lang/Boolean;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    const-string v1, "android.hardware.type.watch"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, LH2/h;->e:Ljava/lang/Boolean;

    .line 20
    .line 21
    :cond_0
    sget-object v0, LH2/h;->e:Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    sget-object v0, LH2/h;->f:Ljava/lang/Boolean;

    .line 27
    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    const-string v0, "cn.google"

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    sput-object p0, LH2/h;->f:Ljava/lang/Boolean;

    .line 45
    .line 46
    :cond_1
    sget-object p0, LH2/h;->f:Ljava/lang/Boolean;

    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-eqz p0, :cond_3

    .line 53
    .line 54
    invoke-static {}, LS0/a;->w()Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    if-eqz p0, :cond_2

    .line 59
    .line 60
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 61
    .line 62
    const/16 v0, 0x1e

    .line 63
    .line 64
    if-lt p0, v0, :cond_3

    .line 65
    .line 66
    :cond_2
    const/4 p0, 0x1

    .line 67
    return p0

    .line 68
    :cond_3
    const/4 p0, 0x0

    .line 69
    return p0
.end method

.method public static v(Ljava/lang/String;)Lu0/h;
    .locals 5

    .line 1
    if-eqz p0, :cond_3

    .line 2
    .line 3
    invoke-static {p0}, Lh2/d;->d0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    const-string v0, "(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?"

    .line 11
    .line 12
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const/4 v0, 0x1

    .line 28
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const/4 v1, 0x2

    .line 39
    invoke-virtual {p0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    const/4 v2, 0x3

    .line 50
    invoke-virtual {p0, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    if-eqz v2, :cond_3

    .line 55
    .line 56
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    const/4 v3, 0x4

    .line 61
    invoke-virtual {p0, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    if-eqz v4, :cond_2

    .line 66
    .line 67
    invoke-virtual {p0, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    goto :goto_0

    .line 72
    :cond_2
    const-string p0, ""

    .line 73
    .line 74
    :goto_0
    new-instance v3, Lu0/h;

    .line 75
    .line 76
    const-string v4, "description"

    .line 77
    .line 78
    invoke-static {p0, v4}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-direct {v3, v0, v1, v2, p0}, Lu0/h;-><init>(IIILjava/lang/String;)V

    .line 82
    .line 83
    .line 84
    return-object v3

    .line 85
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 86
    return-object p0
.end method

.method public static w(Lv1/d;Landroid/media/MediaExtractor;)V
    .locals 8

    .line 1
    const-string v0, "rotation-degrees"

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p1}, Landroid/media/MediaExtractor;->getTrackCount()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v1, :cond_4

    .line 10
    .line 11
    invoke-virtual {p1, v3}, Landroid/media/MediaExtractor;->getTrackFormat(I)Landroid/media/MediaFormat;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    const-string v5, "mime"

    .line 16
    .line 17
    invoke-virtual {v4, v5}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    if-eqz v5, :cond_3

    .line 22
    .line 23
    const-string v6, "image/"

    .line 24
    .line 25
    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    if-eqz v5, :cond_3

    .line 30
    .line 31
    invoke-virtual {v4, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_0

    .line 36
    .line 37
    invoke-virtual {v4, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    :cond_0
    iget p1, p0, Lv1/d;->g:I

    .line 42
    .line 43
    iget v0, p0, Lv1/d;->f:I

    .line 44
    .line 45
    const/16 v1, 0x5a

    .line 46
    .line 47
    if-eq v2, v1, :cond_2

    .line 48
    .line 49
    const/16 v1, 0x10e

    .line 50
    .line 51
    if-ne v2, v1, :cond_1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    move v7, v0

    .line 55
    move v0, p1

    .line 56
    move p1, v7

    .line 57
    :cond_2
    :goto_1
    iput p1, p0, Lv1/d;->b:I

    .line 58
    .line 59
    iput v0, p0, Lv1/d;->a:I

    .line 60
    .line 61
    iput v2, p0, Lv1/d;->c:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 62
    .line 63
    return-void

    .line 64
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_4
    return-void

    .line 68
    :catch_0
    move-exception p0

    .line 69
    const-string p1, "MediaMetadataReader"

    .line 70
    .line 71
    const-string v0, "Failed to decode HEIF image using MediaExtractor"

    .line 72
    .line 73
    invoke-static {p1, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public static x(Landroid/app/Activity;[Ljava/lang/String;I)V
    .locals 6

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    move v2, v1

    .line 8
    :goto_0
    array-length v3, p1

    .line 9
    if-ge v2, v3, :cond_2

    .line 10
    .line 11
    aget-object v3, p1, v2

    .line 12
    .line 13
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-nez v3, :cond_1

    .line 18
    .line 19
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 20
    .line 21
    const/16 v4, 0x21

    .line 22
    .line 23
    if-ge v3, v4, :cond_0

    .line 24
    .line 25
    aget-object v3, p1, v2

    .line 26
    .line 27
    const-string v4, "android.permission.POST_NOTIFICATIONS"

    .line 28
    .line 29
    invoke-static {v3, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 46
    .line 47
    new-instance p2, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v0, "Permission request for permissions "

    .line 50
    .line 51
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    const-string v0, " must not contain null or empty values"

    .line 59
    .line 60
    invoke-static {p2, p1, v0}, LB1/e;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p0

    .line 68
    :cond_2
    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-lez v2, :cond_3

    .line 73
    .line 74
    array-length v3, p1

    .line 75
    sub-int/2addr v3, v2

    .line 76
    new-array v3, v3, [Ljava/lang/String;

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    move-object v3, p1

    .line 80
    :goto_1
    if-lez v2, :cond_6

    .line 81
    .line 82
    array-length v4, p1

    .line 83
    if-ne v2, v4, :cond_4

    .line 84
    .line 85
    return-void

    .line 86
    :cond_4
    move v2, v1

    .line 87
    :goto_2
    array-length v4, p1

    .line 88
    if-ge v1, v4, :cond_6

    .line 89
    .line 90
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-nez v4, :cond_5

    .line 99
    .line 100
    add-int/lit8 v4, v2, 0x1

    .line 101
    .line 102
    aget-object v5, p1, v1

    .line 103
    .line 104
    aput-object v5, v3, v2

    .line 105
    .line 106
    move v2, v4

    .line 107
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_6
    instance-of v0, p0, Ls/a;

    .line 111
    .line 112
    if-eqz v0, :cond_7

    .line 113
    .line 114
    move-object v0, p0

    .line 115
    check-cast v0, Ls/a;

    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    :cond_7
    invoke-virtual {p0, p1, p2}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V

    .line 121
    .line 122
    .line 123
    return-void
.end method

.method public static y(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lg1/e;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/Status;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2, p1}, Lg1/e;->b(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-static {p0}, LM0/r;->j(Lcom/google/android/gms/common/api/Status;)LK0/e;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p2, p0}, Lg1/e;->a(LK0/e;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public static z(LC1/f;LM1/j;)V
    .locals 5

    .line 1
    const-string v0, "binaryMessenger"

    .line 2
    .line 3
    invoke-static {p0, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object v0, p1, LM1/j;->a:LM1/O;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, LM1/O;->a()LC1/l;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance v0, LI1/u;

    .line 18
    .line 19
    const/4 v1, 0x5

    .line 20
    invoke-direct {v0, v1}, LI1/u;-><init>(I)V

    .line 21
    .line 22
    .line 23
    :goto_0
    new-instance v1, LB1/s;

    .line 24
    .line 25
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.cancel"

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 29
    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    new-instance v2, LM1/B;

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    invoke-direct {v2, p1, v4}, LM1/B;-><init>(LM1/j;I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 44
    .line 45
    .line 46
    :goto_1
    new-instance v1, LB1/s;

    .line 47
    .line 48
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.ignore"

    .line 49
    .line 50
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 51
    .line 52
    .line 53
    if-eqz p1, :cond_2

    .line 54
    .line 55
    new-instance v2, LM1/B;

    .line 56
    .line 57
    const/4 v4, 0x1

    .line 58
    invoke-direct {v2, p1, v4}, LM1/B;-><init>(LM1/j;I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 66
    .line 67
    .line 68
    :goto_2
    new-instance v1, LB1/s;

    .line 69
    .line 70
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.proceed"

    .line 71
    .line 72
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 73
    .line 74
    .line 75
    if-eqz p1, :cond_3

    .line 76
    .line 77
    new-instance p0, LM1/B;

    .line 78
    .line 79
    const/4 v0, 0x2

    .line 80
    invoke-direct {p0, p1, v0}, LM1/B;-><init>(LM1/j;I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, p0}, LB1/s;->y(LC1/b;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_3
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 88
    .line 89
    .line 90
    return-void
.end method


# virtual methods
.method public abstract I([BII)V
.end method

.method public a(Landroid/content/Context;Landroid/os/Looper;LM0/c;Ljava/lang/Object;LK0/j;LK0/k;)LK0/c;
    .locals 7

    .line 1
    move-object v5, p5

    .line 2
    check-cast v5, LL0/p;

    .line 3
    .line 4
    move-object v6, p6

    .line 5
    check-cast v6, LL0/p;

    .line 6
    .line 7
    move-object v0, p0

    .line 8
    move-object v1, p1

    .line 9
    move-object v2, p2

    .line 10
    move-object v3, p3

    .line 11
    move-object v4, p4

    .line 12
    invoke-virtual/range {v0 .. v6}, LH2/h;->b(Landroid/content/Context;Landroid/os/Looper;LM0/c;Ljava/lang/Object;LL0/p;LL0/p;)LK0/c;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public b(Landroid/content/Context;Landroid/os/Looper;LM0/c;Ljava/lang/Object;LL0/p;LL0/p;)LK0/c;
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p2, "buildClient must be implemented"

    .line 4
    .line 5
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public t()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    throw v0
.end method

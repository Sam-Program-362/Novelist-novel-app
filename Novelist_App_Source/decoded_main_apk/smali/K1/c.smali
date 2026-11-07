.class public final LK1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:LK1/c;

.field public static final b:LO1/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LK1/c;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LK1/c;->a:LK1/c;

    .line 7
    .line 8
    new-instance v0, LI1/l;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, v1}, LI1/l;-><init>(I)V

    .line 12
    .line 13
    .line 14
    new-instance v1, LO1/e;

    .line 15
    .line 16
    invoke-direct {v1, v0}, LO1/e;-><init>(LZ1/a;)V

    .line 17
    .line 18
    .line 19
    sput-object v1, LK1/c;->b:LO1/e;

    .line 20
    .line 21
    return-void
.end method

.method public static a()LC1/l;
    .locals 1

    .line 1
    sget-object v0, LK1/c;->b:LO1/e;

    .line 2
    .line 3
    invoke-virtual {v0}, LO1/e;->a()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LC1/l;

    .line 8
    .line 9
    return-object v0
.end method

.method public static b(LC1/f;LK1/a;)V
    .locals 6

    .line 1
    const-string v0, "binaryMessenger"

    .line 2
    .line 3
    invoke-static {p0, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LC1/k;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, v0}, LC1/f;->a(LC1/k;)Lt1/a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, LB1/s;

    .line 16
    .line 17
    const-string v2, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.remove"

    .line 18
    .line 19
    const-string v3, ""

    .line 20
    .line 21
    invoke-static {v2, v3}, Lt/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {}, LK1/c;->a()LC1/l;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-direct {v1, p0, v2, v4, v0}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 30
    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    new-instance v4, LK1/b;

    .line 36
    .line 37
    const/4 v5, 0x0

    .line 38
    invoke-direct {v4, p1, v5}, LK1/b;-><init>(LK1/d;I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v4}, LB1/s;->y(LC1/b;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 46
    .line 47
    .line 48
    :goto_0
    new-instance v1, LB1/s;

    .line 49
    .line 50
    const-string v4, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setBool"

    .line 51
    .line 52
    invoke-static {v4, v3}, Lt/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-static {}, LK1/c;->a()LC1/l;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-direct {v1, p0, v4, v5, v0}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 61
    .line 62
    .line 63
    if-eqz p1, :cond_1

    .line 64
    .line 65
    new-instance v4, LK1/b;

    .line 66
    .line 67
    const/4 v5, 0x1

    .line 68
    invoke-direct {v4, p1, v5}, LK1/b;-><init>(LK1/d;I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, v4}, LB1/s;->y(LC1/b;)V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 76
    .line 77
    .line 78
    :goto_1
    new-instance v1, LB1/s;

    .line 79
    .line 80
    const-string v4, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setString"

    .line 81
    .line 82
    invoke-static {v4, v3}, Lt/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-static {}, LK1/c;->a()LC1/l;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-direct {v1, p0, v4, v5, v0}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 91
    .line 92
    .line 93
    if-eqz p1, :cond_2

    .line 94
    .line 95
    new-instance v4, LK1/b;

    .line 96
    .line 97
    const/4 v5, 0x2

    .line 98
    invoke-direct {v4, p1, v5}, LK1/b;-><init>(LK1/d;I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1, v4}, LB1/s;->y(LC1/b;)V

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_2
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 106
    .line 107
    .line 108
    :goto_2
    new-instance v1, LB1/s;

    .line 109
    .line 110
    const-string v4, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setInt"

    .line 111
    .line 112
    invoke-static {v4, v3}, Lt/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    invoke-static {}, LK1/c;->a()LC1/l;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    invoke-direct {v1, p0, v4, v5, v0}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 121
    .line 122
    .line 123
    if-eqz p1, :cond_3

    .line 124
    .line 125
    new-instance v4, LK1/b;

    .line 126
    .line 127
    const/4 v5, 0x3

    .line 128
    invoke-direct {v4, p1, v5}, LK1/b;-><init>(LK1/d;I)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1, v4}, LB1/s;->y(LC1/b;)V

    .line 132
    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_3
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 136
    .line 137
    .line 138
    :goto_3
    new-instance v1, LB1/s;

    .line 139
    .line 140
    const-string v4, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDouble"

    .line 141
    .line 142
    invoke-static {v4, v3}, Lt/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    invoke-static {}, LK1/c;->a()LC1/l;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    invoke-direct {v1, p0, v4, v5, v0}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 151
    .line 152
    .line 153
    if-eqz p1, :cond_4

    .line 154
    .line 155
    new-instance v4, LK1/b;

    .line 156
    .line 157
    const/4 v5, 0x4

    .line 158
    invoke-direct {v4, p1, v5}, LK1/b;-><init>(LK1/d;I)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1, v4}, LB1/s;->y(LC1/b;)V

    .line 162
    .line 163
    .line 164
    goto :goto_4

    .line 165
    :cond_4
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 166
    .line 167
    .line 168
    :goto_4
    new-instance v1, LB1/s;

    .line 169
    .line 170
    const-string v4, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setEncodedStringList"

    .line 171
    .line 172
    invoke-static {v4, v3}, Lt/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    invoke-static {}, LK1/c;->a()LC1/l;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    invoke-direct {v1, p0, v4, v5, v0}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 181
    .line 182
    .line 183
    if-eqz p1, :cond_5

    .line 184
    .line 185
    new-instance v4, LK1/b;

    .line 186
    .line 187
    const/4 v5, 0x5

    .line 188
    invoke-direct {v4, p1, v5}, LK1/b;-><init>(LK1/d;I)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v1, v4}, LB1/s;->y(LC1/b;)V

    .line 192
    .line 193
    .line 194
    goto :goto_5

    .line 195
    :cond_5
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 196
    .line 197
    .line 198
    :goto_5
    new-instance v1, LB1/s;

    .line 199
    .line 200
    const-string v4, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDeprecatedStringList"

    .line 201
    .line 202
    invoke-static {v4, v3}, Lt/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    invoke-static {}, LK1/c;->a()LC1/l;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    invoke-direct {v1, p0, v4, v5, v0}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 211
    .line 212
    .line 213
    if-eqz p1, :cond_6

    .line 214
    .line 215
    new-instance v4, LK1/b;

    .line 216
    .line 217
    const/4 v5, 0x6

    .line 218
    invoke-direct {v4, p1, v5}, LK1/b;-><init>(LK1/d;I)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v1, v4}, LB1/s;->y(LC1/b;)V

    .line 222
    .line 223
    .line 224
    goto :goto_6

    .line 225
    :cond_6
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 226
    .line 227
    .line 228
    :goto_6
    new-instance v1, LB1/s;

    .line 229
    .line 230
    const-string v4, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.clear"

    .line 231
    .line 232
    invoke-static {v4, v3}, Lt/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    invoke-static {}, LK1/c;->a()LC1/l;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    invoke-direct {v1, p0, v4, v5, v0}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 241
    .line 242
    .line 243
    if-eqz p1, :cond_7

    .line 244
    .line 245
    new-instance v4, LK1/b;

    .line 246
    .line 247
    const/4 v5, 0x7

    .line 248
    invoke-direct {v4, p1, v5}, LK1/b;-><init>(LK1/d;I)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v1, v4}, LB1/s;->y(LC1/b;)V

    .line 252
    .line 253
    .line 254
    goto :goto_7

    .line 255
    :cond_7
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 256
    .line 257
    .line 258
    :goto_7
    new-instance v1, LB1/s;

    .line 259
    .line 260
    const-string v4, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.getAll"

    .line 261
    .line 262
    invoke-static {v4, v3}, Lt/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    invoke-static {}, LK1/c;->a()LC1/l;

    .line 267
    .line 268
    .line 269
    move-result-object v4

    .line 270
    invoke-direct {v1, p0, v3, v4, v0}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 271
    .line 272
    .line 273
    if-eqz p1, :cond_8

    .line 274
    .line 275
    new-instance p0, LK1/b;

    .line 276
    .line 277
    const/16 v0, 0x8

    .line 278
    .line 279
    invoke-direct {p0, p1, v0}, LK1/b;-><init>(LK1/d;I)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v1, p0}, LB1/s;->y(LC1/b;)V

    .line 283
    .line 284
    .line 285
    return-void

    .line 286
    :cond_8
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 287
    .line 288
    .line 289
    return-void
.end method

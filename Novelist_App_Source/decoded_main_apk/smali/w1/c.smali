.class public final Lw1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Z

.field public c:Lt1/a;

.field public d:J

.field public e:Lg1/i;

.field public f:Lio/flutter/embedding/engine/FlutterJNI;

.field public g:Ljava/util/concurrent/ExecutorService;

.field public h:Ljava/util/concurrent/Future;


# direct methods
.method public static b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "External path "

    .line 2
    .line 3
    const-string v1, "FlutterLoader"

    .line 4
    .line 5
    new-instance v2, Ljava/io/File;

    .line 6
    .line 7
    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    :try_start_0
    invoke-virtual {v2}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    new-instance v3, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    sget-object p0, Ljava/io/File;->separator:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {v2, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    const-string v3, ".so"

    .line 49
    .line 50
    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz p0, :cond_0

    .line 55
    .line 56
    if-eqz v3, :cond_0

    .line 57
    .line 58
    return-object v2

    .line 59
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v0, " rejected; not overriding aot-shared-library-name."

    .line 68
    .line 69
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-static {v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    return-object p1

    .line 80
    :catch_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v0, " is not a valid path. Please ensure this shared AOT library exists."

    .line 93
    .line 94
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-static {v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 102
    .line 103
    .line 104
    return-object p1
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 3

    .line 1
    const-string v0, "FlutterLoader"

    .line 2
    .line 3
    :try_start_0
    invoke-static {p0, p1}, Lw1/c;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    goto :goto_0

    .line 8
    :catch_0
    move-exception p0

    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v2, "Error while validating AOT shared library name flag: "

    .line 12
    .line 13
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v0, v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    :goto_0
    if-eqz p0, :cond_0

    .line 28
    .line 29
    new-instance p1, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    sget-object v0, Ls1/e;->a:Ls1/d;

    .line 35
    .line 36
    iget-object v0, v0, Ls1/d;->a:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    const/4 p1, 0x0

    .line 49
    invoke-virtual {p2, p1, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string p2, "Skipping unsafe AOT shared library name flag: "

    .line 56
    .line 57
    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string p1, ". Please ensure that the library is vetted and placed in your application\'s internal storage."

    .line 64
    .line 65
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    :goto_1
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;[Ljava/lang/String;)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    const-string v11, "FlutterLoader"

    .line 8
    .line 9
    const-string v2, "--icu-native-lib-path="

    .line 10
    .line 11
    iget-boolean v4, v1, Lw1/c;->b:Z

    .line 12
    .line 13
    if-eqz v4, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    if-ne v4, v5, :cond_1b

    .line 25
    .line 26
    iget-object v4, v1, Lw1/c;->c:Lt1/a;

    .line 27
    .line 28
    if-eqz v4, :cond_1a

    .line 29
    .line 30
    :try_start_0
    const-string v4, "FlutterLoader#ensureInitializationComplete"

    .line 31
    .line 32
    invoke-static {v4}, LN1/a;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    .line 35
    :try_start_1
    iget-object v4, v1, Lw1/c;->h:Ljava/util/concurrent/Future;

    .line 36
    .line 37
    invoke-interface {v4}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, Lw1/b;

    .line 42
    .line 43
    new-instance v5, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    const-string v6, "--icu-symbol-prefix=_binary_icudtl_dat"

    .line 49
    .line 50
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    new-instance v6, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v6, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iget-object v2, v1, Lw1/c;->e:Lg1/i;

    .line 59
    .line 60
    iget-object v2, v2, Lg1/i;->e:Ljava/io/Serializable;

    .line 61
    .line 62
    check-cast v2, Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v2, "libflutter.so"

    .line 73
    .line 74
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    const/16 v7, 0x80

    .line 93
    .line 94
    invoke-virtual {v2, v6, v7}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 99
    .line 100
    const-string v6, " is not allowed in release builds and will be ignored if specified in the application manifest or via the command line."

    .line 101
    .line 102
    if-eqz v2, :cond_10

    .line 103
    .line 104
    :try_start_2
    sget-object v8, Ls1/e;->k:Ljava/util/List;

    .line 105
    .line 106
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    const/4 v9, 0x0

    .line 111
    const/4 v10, 0x0

    .line 112
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v13

    .line 116
    if-eqz v13, :cond_11

    .line 117
    .line 118
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v13

    .line 122
    check-cast v13, Ls1/d;

    .line 123
    .line 124
    iget-object v14, v13, Ls1/d;->b:Ljava/lang/String;

    .line 125
    .line 126
    invoke-virtual {v2, v14}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 127
    .line 128
    .line 129
    move-result v15

    .line 130
    if-nez v15, :cond_1

    .line 131
    .line 132
    :goto_1
    move-object/from16 v17, v8

    .line 133
    .line 134
    goto/16 :goto_5

    .line 135
    .line 136
    :cond_1
    sget-object v15, Ls1/e;->i:Ls1/d;

    .line 137
    .line 138
    if-ne v13, v15, :cond_2

    .line 139
    .line 140
    const-string v13, "For testing purposes only: test flag specified in the manifest was loaded by the FlutterLoader."

    .line 141
    .line 142
    invoke-static {v11, v13}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 143
    .line 144
    .line 145
    goto :goto_1

    .line 146
    :catchall_0
    move-exception v0

    .line 147
    move-object v2, v0

    .line 148
    goto/16 :goto_a

    .line 149
    .line 150
    :cond_2
    sget-object v15, Ls1/e;->l:Ljava/util/List;

    .line 151
    .line 152
    invoke-interface {v15, v13}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v15

    .line 156
    if-nez v15, :cond_f

    .line 157
    .line 158
    sget-object v15, Ls1/e;->m:LE1/a;

    .line 159
    .line 160
    invoke-virtual {v15, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v16

    .line 164
    check-cast v16, Ls1/d;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 165
    .line 166
    const-string v12, "Flag with metadata key "

    .line 167
    .line 168
    if-eqz v16, :cond_3

    .line 169
    .line 170
    :try_start_3
    new-instance v7, Ljava/lang/StringBuilder;

    .line 171
    .line 172
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 173
    .line 174
    .line 175
    move-object/from16 v17, v8

    .line 176
    .line 177
    const-string v8, "If you are trying to specify "

    .line 178
    .line 179
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    const-string v8, " in your application manifest, please make sure to use the new metadata key name: "

    .line 186
    .line 187
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v15, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v8

    .line 194
    check-cast v8, Ls1/d;

    .line 195
    .line 196
    iget-object v8, v8, Ls1/d;->b:Ljava/lang/String;

    .line 197
    .line 198
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v7

    .line 205
    invoke-static {v11, v7}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 206
    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_3
    move-object/from16 v17, v8

    .line 210
    .line 211
    iget-boolean v7, v13, Ls1/d;->c:Z

    .line 212
    .line 213
    if-nez v7, :cond_4

    .line 214
    .line 215
    new-instance v7, Ljava/lang/StringBuilder;

    .line 216
    .line 217
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v7

    .line 233
    invoke-static {v11, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 234
    .line 235
    .line 236
    goto/16 :goto_5

    .line 237
    .line 238
    :cond_4
    :goto_2
    sget-object v7, Ls1/e;->e:Ls1/d;

    .line 239
    .line 240
    if-ne v13, v7, :cond_5

    .line 241
    .line 242
    const/4 v9, 0x1

    .line 243
    goto :goto_3

    .line 244
    :cond_5
    sget-object v7, Ls1/e;->j:Ls1/d;

    .line 245
    .line 246
    if-ne v13, v7, :cond_6

    .line 247
    .line 248
    const/4 v10, 0x1

    .line 249
    goto :goto_3

    .line 250
    :cond_6
    sget-object v7, Ls1/e;->h:Ls1/d;

    .line 251
    .line 252
    if-ne v13, v7, :cond_7

    .line 253
    .line 254
    iget-object v7, v7, Ls1/d;->b:Ljava/lang/String;

    .line 255
    .line 256
    const/4 v8, 0x0

    .line 257
    invoke-virtual {v2, v7, v8}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 258
    .line 259
    .line 260
    move-result v7

    .line 261
    iput-boolean v7, v1, Lw1/c;->a:Z

    .line 262
    .line 263
    goto :goto_3

    .line 264
    :cond_7
    sget-object v7, Ls1/e;->a:Ls1/d;

    .line 265
    .line 266
    if-eq v13, v7, :cond_d

    .line 267
    .line 268
    sget-object v7, Ls1/e;->b:Ls1/d;

    .line 269
    .line 270
    if-ne v13, v7, :cond_8

    .line 271
    .line 272
    goto :goto_6

    .line 273
    :cond_8
    :goto_3
    iget-object v7, v13, Ls1/d;->a:Ljava/lang/String;

    .line 274
    .line 275
    const-string v8, "="

    .line 276
    .line 277
    invoke-virtual {v7, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 278
    .line 279
    .line 280
    move-result v8

    .line 281
    if-eqz v8, :cond_b

    .line 282
    .line 283
    invoke-virtual {v2, v14}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v8

    .line 287
    if-eqz v8, :cond_9

    .line 288
    .line 289
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v8

    .line 293
    goto :goto_4

    .line 294
    :cond_9
    const/4 v8, 0x0

    .line 295
    :goto_4
    if-nez v8, :cond_a

    .line 296
    .line 297
    new-instance v7, Ljava/lang/StringBuilder;

    .line 298
    .line 299
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    const-string v8, " requires a value, but no value was found. Please specify a value."

    .line 309
    .line 310
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v7

    .line 317
    invoke-static {v11, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 318
    .line 319
    .line 320
    goto :goto_5

    .line 321
    :cond_a
    new-instance v12, Ljava/lang/StringBuilder;

    .line 322
    .line 323
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v7

    .line 336
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    goto :goto_5

    .line 340
    :cond_b
    const/4 v8, 0x0

    .line 341
    invoke-virtual {v2, v14, v8}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 342
    .line 343
    .line 344
    move-result v12

    .line 345
    if-eqz v12, :cond_c

    .line 346
    .line 347
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    :cond_c
    :goto_5
    move-object/from16 v8, v17

    .line 351
    .line 352
    goto/16 :goto_0

    .line 353
    .line 354
    :cond_d
    :goto_6
    invoke-virtual {v2, v14}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v7

    .line 358
    if-nez v7, :cond_e

    .line 359
    .line 360
    new-instance v7, Ljava/lang/StringBuilder;

    .line 361
    .line 362
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 363
    .line 364
    .line 365
    const-string v8, "Flag "

    .line 366
    .line 367
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 371
    .line 372
    .line 373
    const-string v8, " was specified with an empty path. Please specify a path to the desired AOT shared library."

    .line 374
    .line 375
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v7

    .line 382
    invoke-static {v11, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 383
    .line 384
    .line 385
    goto :goto_5

    .line 386
    :cond_e
    invoke-static {v3, v7, v5}, Lw1/c;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 387
    .line 388
    .line 389
    goto :goto_5

    .line 390
    :cond_f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 391
    .line 392
    new-instance v2, Ljava/lang/StringBuilder;

    .line 393
    .line 394
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 395
    .line 396
    .line 397
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 398
    .line 399
    .line 400
    const-string v3, " is disabled and no longer allowed. Please remove this flag from your application manifest."

    .line 401
    .line 402
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v2

    .line 409
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    throw v0

    .line 413
    :cond_10
    const/4 v9, 0x0

    .line 414
    const/4 v10, 0x0

    .line 415
    :cond_11
    if-eqz v0, :cond_17

    .line 416
    .line 417
    array-length v2, v0

    .line 418
    const/4 v8, 0x0

    .line 419
    :goto_7
    if-ge v8, v2, :cond_17

    .line 420
    .line 421
    aget-object v7, v0, v8

    .line 422
    .line 423
    invoke-static {v7}, Ls1/e;->a(Ljava/lang/String;)Ls1/d;

    .line 424
    .line 425
    .line 426
    move-result-object v12

    .line 427
    if-nez v12, :cond_12

    .line 428
    .line 429
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    goto :goto_9

    .line 433
    :cond_12
    sget-object v13, Ls1/e;->i:Ls1/d;

    .line 434
    .line 435
    invoke-virtual {v12, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    move-result v13

    .line 439
    if-eqz v13, :cond_13

    .line 440
    .line 441
    const-string v7, "For testing purposes only: test flag specified on the command line was loaded by the FlutterLoader."

    .line 442
    .line 443
    invoke-static {v11, v7}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 444
    .line 445
    .line 446
    goto :goto_9

    .line 447
    :cond_13
    sget-object v13, Ls1/e;->a:Ls1/d;

    .line 448
    .line 449
    invoke-virtual {v12, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 450
    .line 451
    .line 452
    move-result v14

    .line 453
    if-nez v14, :cond_16

    .line 454
    .line 455
    sget-object v14, Ls1/e;->b:Ls1/d;

    .line 456
    .line 457
    invoke-virtual {v12, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 458
    .line 459
    .line 460
    move-result v14

    .line 461
    if-eqz v14, :cond_14

    .line 462
    .line 463
    goto :goto_8

    .line 464
    :cond_14
    iget-boolean v12, v12, Ls1/d;->c:Z

    .line 465
    .line 466
    if-nez v12, :cond_15

    .line 467
    .line 468
    new-instance v12, Ljava/lang/StringBuilder;

    .line 469
    .line 470
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 471
    .line 472
    .line 473
    const-string v13, "Command line argument "

    .line 474
    .line 475
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 476
    .line 477
    .line 478
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 479
    .line 480
    .line 481
    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 482
    .line 483
    .line 484
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object v7

    .line 488
    invoke-static {v11, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 489
    .line 490
    .line 491
    goto :goto_9

    .line 492
    :cond_15
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 493
    .line 494
    .line 495
    goto :goto_9

    .line 496
    :cond_16
    :goto_8
    iget-object v12, v13, Ls1/d;->a:Ljava/lang/String;

    .line 497
    .line 498
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 499
    .line 500
    .line 501
    move-result v12

    .line 502
    invoke-virtual {v7, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 503
    .line 504
    .line 505
    move-result-object v7

    .line 506
    invoke-static {v3, v7, v5}, Lw1/c;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 507
    .line 508
    .line 509
    :goto_9
    add-int/lit8 v8, v8, 0x1

    .line 510
    .line 511
    goto :goto_7

    .line 512
    :cond_17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 513
    .line 514
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 515
    .line 516
    .line 517
    sget-object v2, Ls1/e;->a:Ls1/d;

    .line 518
    .line 519
    iget-object v6, v2, Ls1/d;->a:Ljava/lang/String;

    .line 520
    .line 521
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 522
    .line 523
    .line 524
    iget-object v6, v1, Lw1/c;->e:Lg1/i;

    .line 525
    .line 526
    iget-object v6, v6, Lg1/i;->b:Ljava/lang/Object;

    .line 527
    .line 528
    check-cast v6, Ljava/lang/String;

    .line 529
    .line 530
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 531
    .line 532
    .line 533
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 538
    .line 539
    .line 540
    new-instance v0, Ljava/lang/StringBuilder;

    .line 541
    .line 542
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 543
    .line 544
    .line 545
    iget-object v2, v2, Ls1/d;->a:Ljava/lang/String;

    .line 546
    .line 547
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 548
    .line 549
    .line 550
    iget-object v2, v1, Lw1/c;->e:Lg1/i;

    .line 551
    .line 552
    iget-object v2, v2, Lg1/i;->e:Ljava/io/Serializable;

    .line 553
    .line 554
    check-cast v2, Ljava/lang/String;

    .line 555
    .line 556
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 557
    .line 558
    .line 559
    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    .line 560
    .line 561
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 562
    .line 563
    .line 564
    iget-object v2, v1, Lw1/c;->e:Lg1/i;

    .line 565
    .line 566
    iget-object v2, v2, Lg1/i;->b:Ljava/lang/Object;

    .line 567
    .line 568
    check-cast v2, Ljava/lang/String;

    .line 569
    .line 570
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 571
    .line 572
    .line 573
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 574
    .line 575
    .line 576
    move-result-object v0

    .line 577
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 578
    .line 579
    .line 580
    new-instance v0, Ljava/lang/StringBuilder;

    .line 581
    .line 582
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 583
    .line 584
    .line 585
    const-string v2, "--cache-dir-path="

    .line 586
    .line 587
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 588
    .line 589
    .line 590
    iget-object v2, v4, Lw1/b;->b:Ljava/lang/String;

    .line 591
    .line 592
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 593
    .line 594
    .line 595
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 596
    .line 597
    .line 598
    move-result-object v0

    .line 599
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 600
    .line 601
    .line 602
    iget-object v0, v1, Lw1/c;->e:Lg1/i;

    .line 603
    .line 604
    iget-object v0, v0, Lg1/i;->d:Ljava/lang/Object;

    .line 605
    .line 606
    new-instance v0, Ljava/lang/StringBuilder;

    .line 607
    .line 608
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 609
    .line 610
    .line 611
    const-string v2, "--domain-network-policy="

    .line 612
    .line 613
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 614
    .line 615
    .line 616
    iget-object v2, v1, Lw1/c;->e:Lg1/i;

    .line 617
    .line 618
    iget-object v2, v2, Lg1/i;->d:Ljava/lang/Object;

    .line 619
    .line 620
    check-cast v2, Ljava/lang/String;

    .line 621
    .line 622
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 623
    .line 624
    .line 625
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 626
    .line 627
    .line 628
    move-result-object v0

    .line 629
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 630
    .line 631
    .line 632
    iget-object v0, v1, Lw1/c;->c:Lt1/a;

    .line 633
    .line 634
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 635
    .line 636
    .line 637
    if-nez v9, :cond_18

    .line 638
    .line 639
    const-string v0, "activity"

    .line 640
    .line 641
    invoke-virtual {v3, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 642
    .line 643
    .line 644
    move-result-object v0

    .line 645
    check-cast v0, Landroid/app/ActivityManager;

    .line 646
    .line 647
    new-instance v2, Landroid/app/ActivityManager$MemoryInfo;

    .line 648
    .line 649
    invoke-direct {v2}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V

    .line 650
    .line 651
    .line 652
    invoke-virtual {v0, v2}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V

    .line 653
    .line 654
    .line 655
    iget-wide v6, v2, Landroid/app/ActivityManager$MemoryInfo;->totalMem:J

    .line 656
    .line 657
    long-to-double v6, v6

    .line 658
    const-wide v8, 0x412e848000000000L    # 1000000.0

    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    div-double/2addr v6, v8

    .line 664
    const-wide/high16 v8, 0x4000000000000000L    # 2.0

    .line 665
    .line 666
    div-double/2addr v6, v8

    .line 667
    double-to-int v0, v6

    .line 668
    new-instance v2, Ljava/lang/StringBuilder;

    .line 669
    .line 670
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 671
    .line 672
    .line 673
    sget-object v6, Ls1/e;->e:Ls1/d;

    .line 674
    .line 675
    iget-object v6, v6, Ls1/d;->a:Ljava/lang/String;

    .line 676
    .line 677
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 678
    .line 679
    .line 680
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 681
    .line 682
    .line 683
    move-result-object v0

    .line 684
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 685
    .line 686
    .line 687
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 688
    .line 689
    .line 690
    move-result-object v0

    .line 691
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 692
    .line 693
    .line 694
    :cond_18
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 695
    .line 696
    .line 697
    move-result-object v0

    .line 698
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 699
    .line 700
    .line 701
    move-result-object v0

    .line 702
    iget v2, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 703
    .line 704
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 705
    .line 706
    mul-int/2addr v2, v0

    .line 707
    mul-int/lit8 v2, v2, 0x30

    .line 708
    .line 709
    new-instance v0, Ljava/lang/StringBuilder;

    .line 710
    .line 711
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 712
    .line 713
    .line 714
    const-string v6, "--resource-cache-max-bytes-threshold="

    .line 715
    .line 716
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 717
    .line 718
    .line 719
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 720
    .line 721
    .line 722
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 723
    .line 724
    .line 725
    move-result-object v0

    .line 726
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 727
    .line 728
    .line 729
    const-string v0, "--prefetched-default-font-manager"

    .line 730
    .line 731
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 732
    .line 733
    .line 734
    if-nez v10, :cond_19

    .line 735
    .line 736
    new-instance v0, Ljava/lang/StringBuilder;

    .line 737
    .line 738
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 739
    .line 740
    .line 741
    sget-object v2, Ls1/e;->j:Ls1/d;

    .line 742
    .line 743
    iget-object v2, v2, Ls1/d;->a:Ljava/lang/String;

    .line 744
    .line 745
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 746
    .line 747
    .line 748
    const-string v2, "true"

    .line 749
    .line 750
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 751
    .line 752
    .line 753
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 754
    .line 755
    .line 756
    move-result-object v0

    .line 757
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 758
    .line 759
    .line 760
    :cond_19
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 761
    .line 762
    .line 763
    move-result-wide v6

    .line 764
    iget-wide v8, v1, Lw1/c;->d:J

    .line 765
    .line 766
    sub-long v8, v6, v8

    .line 767
    .line 768
    iget-object v2, v1, Lw1/c;->f:Lio/flutter/embedding/engine/FlutterJNI;

    .line 769
    .line 770
    const/4 v0, 0x0

    .line 771
    new-array v0, v0, [Ljava/lang/String;

    .line 772
    .line 773
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 774
    .line 775
    .line 776
    move-result-object v0

    .line 777
    check-cast v0, [Ljava/lang/String;

    .line 778
    .line 779
    iget-object v6, v4, Lw1/b;->a:Ljava/lang/String;

    .line 780
    .line 781
    iget-object v7, v4, Lw1/b;->b:Ljava/lang/String;

    .line 782
    .line 783
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 784
    .line 785
    const/4 v5, 0x0

    .line 786
    move-object v4, v0

    .line 787
    invoke-virtual/range {v2 .. v10}, Lio/flutter/embedding/engine/FlutterJNI;->init(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V

    .line 788
    .line 789
    .line 790
    const/4 v0, 0x1

    .line 791
    iput-boolean v0, v1, Lw1/c;->b:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 792
    .line 793
    :try_start_4
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 794
    .line 795
    .line 796
    return-void

    .line 797
    :catch_0
    move-exception v0

    .line 798
    goto :goto_c

    .line 799
    :goto_a
    :try_start_5
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 800
    .line 801
    .line 802
    goto :goto_b

    .line 803
    :catchall_1
    move-exception v0

    .line 804
    :try_start_6
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 805
    .line 806
    .line 807
    :goto_b
    throw v2
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 808
    :goto_c
    const-string v2, "Flutter initialization failed."

    .line 809
    .line 810
    invoke-static {v11, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 811
    .line 812
    .line 813
    new-instance v2, Ljava/lang/RuntimeException;

    .line 814
    .line 815
    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 816
    .line 817
    .line 818
    throw v2

    .line 819
    :cond_1a
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 820
    .line 821
    const-string v2, "ensureInitializationComplete must be called after startInitialization"

    .line 822
    .line 823
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 824
    .line 825
    .line 826
    throw v0

    .line 827
    :cond_1b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 828
    .line 829
    const-string v2, "ensureInitializationComplete must be called on the main thread"

    .line 830
    .line 831
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 832
    .line 833
    .line 834
    throw v0
.end method

.method public final d(Landroid/content/Context;)V
    .locals 3

    .line 1
    new-instance v0, Lt1/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lw1/c;->c:Lt1/a;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-ne v1, v2, :cond_1

    .line 20
    .line 21
    const-string v1, "FlutterLoader#startInitialization"

    .line 22
    .line 23
    invoke-static {v1}, LN1/a;->b(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object v0, p0, Lw1/c;->c:Lt1/a;

    .line 31
    .line 32
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    iput-wide v0, p0, Lw1/c;->d:J

    .line 37
    .line 38
    invoke-static {p1}, LE2/a;->C(Landroid/content/Context;)Lg1/i;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, Lw1/c;->e:Lg1/i;

    .line 43
    .line 44
    const-string v0, "display"

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Landroid/hardware/display/DisplayManager;

    .line 51
    .line 52
    iget-object v1, p0, Lw1/c;->f:Lio/flutter/embedding/engine/FlutterJNI;

    .line 53
    .line 54
    invoke-static {v0, v1}, Lio/flutter/view/s;->a(Landroid/hardware/display/DisplayManager;Lio/flutter/embedding/engine/FlutterJNI;)Lio/flutter/view/s;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iget-object v1, v0, Lio/flutter/view/s;->b:Lio/flutter/embedding/engine/FlutterJNI;

    .line 59
    .line 60
    iget-object v0, v0, Lio/flutter/view/s;->d:Lio/flutter/view/c;

    .line 61
    .line 62
    invoke-virtual {v1, v0}, Lio/flutter/embedding/engine/FlutterJNI;->setAsyncWaitForVsyncDelegate(Ls1/l;)V

    .line 63
    .line 64
    .line 65
    new-instance v0, Lw1/a;

    .line 66
    .line 67
    invoke-direct {v0, p0, p1}, Lw1/a;-><init>(Lw1/c;Landroid/content/Context;)V

    .line 68
    .line 69
    .line 70
    iget-object p1, p0, Lw1/c;->g:Ljava/util/concurrent/ExecutorService;

    .line 71
    .line 72
    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iput-object p1, p0, Lw1/c;->h:Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    .line 78
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :catchall_0
    move-exception p1

    .line 83
    :try_start_1
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :catchall_1
    move-exception v0

    .line 88
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    :goto_0
    throw p1

    .line 92
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 93
    .line 94
    const-string v0, "startInitialization must be called on the main thread"

    .line 95
    .line 96
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw p1
.end method

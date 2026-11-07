.class public Lk1/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/b;
.implements LC1/m;


# static fields
.field public static final m:Ljava/util/HashMap;

.field public static final n:Ljava/util/HashMap;

.field public static final o:Ljava/lang/Object;

.field public static final p:Ljava/lang/Object;

.field public static q:I

.field public static r:Ljava/lang/String;

.field public static s:I

.field public static t:I

.field public static u:I

.field public static v:Lk1/h;


# instance fields
.field public k:Landroid/content/Context;

.field public l:LB1/s;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lk1/l;->m:Ljava/util/HashMap;

    .line 7
    .line 8
    new-instance v0, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lk1/l;->n:Ljava/util/HashMap;

    .line 14
    .line 15
    new-instance v0, Ljava/lang/Object;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lk1/l;->o:Ljava/lang/Object;

    .line 21
    .line 22
    new-instance v0, Ljava/lang/Object;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lk1/l;->p:Ljava/lang/Object;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    sput v0, Lk1/l;->q:I

    .line 31
    .line 32
    sput v0, Lk1/l;->s:I

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    sput v1, Lk1/l;->t:I

    .line 36
    .line 37
    sput v0, Lk1/l;->u:I

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a(Lk1/l;Lk1/e;)V
    .locals 4

    .line 1
    const/4 p0, 0x1

    .line 2
    :try_start_0
    iget v0, p1, Lk1/e;->d:I

    .line 3
    .line 4
    if-lt v0, p0, :cond_0

    .line 5
    .line 6
    const-string v0, "Sqflite"

    .line 7
    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lk1/e;->i()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v2, "closing database "

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catch_0
    move-exception v0

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lk1/e;->b()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    .line 38
    goto :goto_2

    .line 39
    :goto_1
    const-string v1, "Sqflite"

    .line 40
    .line 41
    new-instance v2, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v3, "error "

    .line 44
    .line 45
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v0, " while closing database "

    .line 52
    .line 53
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    sget v0, Lk1/l;->u:I

    .line 57
    .line 58
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    :goto_2
    sget-object v0, Lk1/l;->o:Ljava/lang/Object;

    .line 69
    .line 70
    monitor-enter v0

    .line 71
    :try_start_1
    sget-object v1, Lk1/l;->n:Ljava/util/HashMap;

    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_2

    .line 78
    .line 79
    sget-object v1, Lk1/l;->v:Lk1/h;

    .line 80
    .line 81
    if-eqz v1, :cond_2

    .line 82
    .line 83
    iget v1, p1, Lk1/e;->d:I

    .line 84
    .line 85
    if-lt v1, p0, :cond_1

    .line 86
    .line 87
    const-string p0, "Sqflite"

    .line 88
    .line 89
    new-instance v1, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Lk1/e;->i()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string p1, "stopping thread"

    .line 102
    .line 103
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 111
    .line 112
    .line 113
    goto :goto_3

    .line 114
    :catchall_0
    move-exception p0

    .line 115
    goto :goto_4

    .line 116
    :cond_1
    :goto_3
    sget-object p0, Lk1/l;->v:Lk1/h;

    .line 117
    .line 118
    invoke-interface {p0}, Lk1/h;->a()V

    .line 119
    .line 120
    .line 121
    const/4 p0, 0x0

    .line 122
    sput-object p0, Lk1/l;->v:Lk1/h;

    .line 123
    .line 124
    :cond_2
    monitor-exit v0

    .line 125
    return-void

    .line 126
    :goto_4
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 127
    throw p0
.end method

.method public static b(LA/c;LB1/o;)Lk1/e;
    .locals 2

    .line 1
    const-string v0, "id"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, LA/c;->i(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    sget-object v1, Lk1/l;->n:Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-virtual {v1, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Lk1/e;

    .line 20
    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v1, "database_closed "

    .line 27
    .line 28
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    const-string v0, "sqlite_error"

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    invoke-virtual {p1, v0, p0, v1}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    return-object v1
.end method

.method public static c(IZZ)Ljava/util/HashMap;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "id"

    .line 7
    .line 8
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {v0, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const-string p0, "recovered"

    .line 18
    .line 19
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {v0, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    :cond_0
    if-eqz p2, :cond_1

    .line 25
    .line 26
    const-string p0, "recoveredInTransaction"

    .line 27
    .line 28
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {v0, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    :cond_1
    return-object v0
.end method


# virtual methods
.method public final k(LA/c;LB1/o;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    move-object/from16 v4, p2

    .line 6
    .line 7
    iget-object v0, v8, LA/c;->l:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x5

    .line 19
    const/4 v5, 0x4

    .line 20
    const/4 v6, 0x2

    .line 21
    const/4 v7, 0x1

    .line 22
    const/4 v9, 0x0

    .line 23
    const/4 v10, -0x1

    .line 24
    sparse-switch v2, :sswitch_data_0

    .line 25
    .line 26
    .line 27
    goto/16 :goto_0

    .line 28
    .line 29
    :sswitch_0
    const-string v2, "getDatabasesPath"

    .line 30
    .line 31
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    goto/16 :goto_0

    .line 38
    .line 39
    :cond_0
    const/16 v10, 0xf

    .line 40
    .line 41
    goto/16 :goto_0

    .line 42
    .line 43
    :sswitch_1
    const-string v2, "getPlatformVersion"

    .line 44
    .line 45
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_1

    .line 50
    .line 51
    goto/16 :goto_0

    .line 52
    .line 53
    :cond_1
    const/16 v10, 0xe

    .line 54
    .line 55
    goto/16 :goto_0

    .line 56
    .line 57
    :sswitch_2
    const-string v2, "queryCursorNext"

    .line 58
    .line 59
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_2

    .line 64
    .line 65
    goto/16 :goto_0

    .line 66
    .line 67
    :cond_2
    const/16 v10, 0xd

    .line 68
    .line 69
    goto/16 :goto_0

    .line 70
    .line 71
    :sswitch_3
    const-string v2, "databaseExists"

    .line 72
    .line 73
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_3

    .line 78
    .line 79
    goto/16 :goto_0

    .line 80
    .line 81
    :cond_3
    const/16 v10, 0xc

    .line 82
    .line 83
    goto/16 :goto_0

    .line 84
    .line 85
    :sswitch_4
    const-string v2, "query"

    .line 86
    .line 87
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-nez v0, :cond_4

    .line 92
    .line 93
    goto/16 :goto_0

    .line 94
    .line 95
    :cond_4
    const/16 v10, 0xb

    .line 96
    .line 97
    goto/16 :goto_0

    .line 98
    .line 99
    :sswitch_5
    const-string v2, "debug"

    .line 100
    .line 101
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-nez v0, :cond_5

    .line 106
    .line 107
    goto/16 :goto_0

    .line 108
    .line 109
    :cond_5
    const/16 v10, 0xa

    .line 110
    .line 111
    goto/16 :goto_0

    .line 112
    .line 113
    :sswitch_6
    const-string v2, "batch"

    .line 114
    .line 115
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-nez v0, :cond_6

    .line 120
    .line 121
    goto/16 :goto_0

    .line 122
    .line 123
    :cond_6
    const/16 v10, 0x9

    .line 124
    .line 125
    goto/16 :goto_0

    .line 126
    .line 127
    :sswitch_7
    const-string v2, "openDatabase"

    .line 128
    .line 129
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-nez v0, :cond_7

    .line 134
    .line 135
    goto/16 :goto_0

    .line 136
    .line 137
    :cond_7
    const/16 v10, 0x8

    .line 138
    .line 139
    goto/16 :goto_0

    .line 140
    .line 141
    :sswitch_8
    const-string v2, "debugMode"

    .line 142
    .line 143
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    if-nez v0, :cond_8

    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_8
    const/4 v10, 0x7

    .line 151
    goto :goto_0

    .line 152
    :sswitch_9
    const-string v2, "deleteDatabase"

    .line 153
    .line 154
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-nez v0, :cond_9

    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_9
    const/4 v10, 0x6

    .line 162
    goto :goto_0

    .line 163
    :sswitch_a
    const-string v2, "androidSetLocale"

    .line 164
    .line 165
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    if-nez v0, :cond_a

    .line 170
    .line 171
    goto :goto_0

    .line 172
    :cond_a
    move v10, v3

    .line 173
    goto :goto_0

    .line 174
    :sswitch_b
    const-string v2, "update"

    .line 175
    .line 176
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    if-nez v0, :cond_b

    .line 181
    .line 182
    goto :goto_0

    .line 183
    :cond_b
    move v10, v5

    .line 184
    goto :goto_0

    .line 185
    :sswitch_c
    const-string v2, "insert"

    .line 186
    .line 187
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    if-nez v0, :cond_c

    .line 192
    .line 193
    goto :goto_0

    .line 194
    :cond_c
    const/4 v10, 0x3

    .line 195
    goto :goto_0

    .line 196
    :sswitch_d
    const-string v2, "options"

    .line 197
    .line 198
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-nez v0, :cond_d

    .line 203
    .line 204
    goto :goto_0

    .line 205
    :cond_d
    move v10, v6

    .line 206
    goto :goto_0

    .line 207
    :sswitch_e
    const-string v2, "closeDatabase"

    .line 208
    .line 209
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    if-nez v0, :cond_e

    .line 214
    .line 215
    goto :goto_0

    .line 216
    :cond_e
    move v10, v7

    .line 217
    goto :goto_0

    .line 218
    :sswitch_f
    const-string v2, "execute"

    .line 219
    .line 220
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    if-nez v0, :cond_f

    .line 225
    .line 226
    goto :goto_0

    .line 227
    :cond_f
    move v10, v9

    .line 228
    :goto_0
    const/4 v0, 0x0

    .line 229
    packed-switch v10, :pswitch_data_0

    .line 230
    .line 231
    .line 232
    invoke-virtual {v4}, LB1/o;->b()V

    .line 233
    .line 234
    .line 235
    return-void

    .line 236
    :pswitch_0
    sget-object v0, Lk1/l;->r:Ljava/lang/String;

    .line 237
    .line 238
    if-nez v0, :cond_10

    .line 239
    .line 240
    const-string v0, "tekartik_sqflite.db"

    .line 241
    .line 242
    iget-object v2, v1, Lk1/l;->k:Landroid/content/Context;

    .line 243
    .line 244
    invoke-virtual {v2, v0}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    invoke-virtual {v0}, Ljava/io/File;->getParent()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    sput-object v0, Lk1/l;->r:Ljava/lang/String;

    .line 253
    .line 254
    :cond_10
    sget-object v0, Lk1/l;->r:Ljava/lang/String;

    .line 255
    .line 256
    invoke-virtual {v4, v0}, LB1/o;->d(Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    return-void

    .line 260
    :pswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 261
    .line 262
    const-string v2, "Android "

    .line 263
    .line 264
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 268
    .line 269
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    invoke-virtual {v4, v0}, LB1/o;->d(Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    return-void

    .line 280
    :pswitch_2
    invoke-static/range {p1 .. p2}, Lk1/l;->b(LA/c;LB1/o;)Lk1/e;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    if-nez v0, :cond_11

    .line 285
    .line 286
    goto/16 :goto_14

    .line 287
    .line 288
    :cond_11
    sget-object v2, Lk1/l;->v:Lk1/h;

    .line 289
    .line 290
    new-instance v3, Lk1/j;

    .line 291
    .line 292
    invoke-direct {v3, v8, v4, v0, v9}, Lk1/j;-><init>(LA/c;LB1/o;Lk1/e;I)V

    .line 293
    .line 294
    .line 295
    invoke-interface {v2, v0, v3}, Lk1/h;->c(Lk1/e;Ljava/lang/Runnable;)V

    .line 296
    .line 297
    .line 298
    return-void

    .line 299
    :pswitch_3
    const-string v0, "path"

    .line 300
    .line 301
    invoke-virtual {v8, v0}, LA/c;->i(Ljava/lang/String;)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    check-cast v0, Ljava/lang/String;

    .line 306
    .line 307
    :try_start_0
    new-instance v2, Ljava/io/File;

    .line 308
    .line 309
    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 313
    .line 314
    .line 315
    move-result v9
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 316
    :catch_0
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    invoke-virtual {v4, v0}, LB1/o;->d(Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    return-void

    .line 324
    :pswitch_4
    invoke-static/range {p1 .. p2}, Lk1/l;->b(LA/c;LB1/o;)Lk1/e;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    if-nez v0, :cond_12

    .line 329
    .line 330
    goto/16 :goto_14

    .line 331
    .line 332
    :cond_12
    sget-object v2, Lk1/l;->v:Lk1/h;

    .line 333
    .line 334
    new-instance v3, Lk1/j;

    .line 335
    .line 336
    invoke-direct {v3, v8, v4, v0, v6}, Lk1/j;-><init>(LA/c;LB1/o;Lk1/e;I)V

    .line 337
    .line 338
    .line 339
    invoke-interface {v2, v0, v3}, Lk1/h;->c(Lk1/e;Ljava/lang/Runnable;)V

    .line 340
    .line 341
    .line 342
    return-void

    .line 343
    :pswitch_5
    const-string v0, "logLevel"

    .line 344
    .line 345
    const-string v2, "cmd"

    .line 346
    .line 347
    invoke-virtual {v8, v2}, LA/c;->i(Ljava/lang/String;)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    check-cast v2, Ljava/lang/String;

    .line 352
    .line 353
    new-instance v3, Ljava/util/HashMap;

    .line 354
    .line 355
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 356
    .line 357
    .line 358
    const-string v5, "get"

    .line 359
    .line 360
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    move-result v2

    .line 364
    if-eqz v2, :cond_16

    .line 365
    .line 366
    sget v2, Lk1/l;->q:I

    .line 367
    .line 368
    if-lez v2, :cond_13

    .line 369
    .line 370
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 371
    .line 372
    .line 373
    move-result-object v2

    .line 374
    invoke-virtual {v3, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    :cond_13
    sget-object v2, Lk1/l;->n:Ljava/util/HashMap;

    .line 378
    .line 379
    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    .line 380
    .line 381
    .line 382
    move-result v5

    .line 383
    if-nez v5, :cond_16

    .line 384
    .line 385
    new-instance v5, Ljava/util/HashMap;

    .line 386
    .line 387
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 391
    .line 392
    .line 393
    move-result-object v2

    .line 394
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 395
    .line 396
    .line 397
    move-result-object v2

    .line 398
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 399
    .line 400
    .line 401
    move-result v6

    .line 402
    if-eqz v6, :cond_15

    .line 403
    .line 404
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v6

    .line 408
    check-cast v6, Ljava/util/Map$Entry;

    .line 409
    .line 410
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v7

    .line 414
    check-cast v7, Lk1/e;

    .line 415
    .line 416
    new-instance v8, Ljava/util/HashMap;

    .line 417
    .line 418
    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 419
    .line 420
    .line 421
    const-string v9, "path"

    .line 422
    .line 423
    iget-object v10, v7, Lk1/e;->b:Ljava/lang/String;

    .line 424
    .line 425
    invoke-virtual {v8, v9, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    const-string v9, "singleInstance"

    .line 429
    .line 430
    iget-boolean v10, v7, Lk1/e;->a:Z

    .line 431
    .line 432
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 433
    .line 434
    .line 435
    move-result-object v10

    .line 436
    invoke-virtual {v8, v9, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    iget v7, v7, Lk1/e;->d:I

    .line 440
    .line 441
    if-lez v7, :cond_14

    .line 442
    .line 443
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 444
    .line 445
    .line 446
    move-result-object v7

    .line 447
    invoke-virtual {v8, v0, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    :cond_14
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v6

    .line 454
    check-cast v6, Ljava/lang/Integer;

    .line 455
    .line 456
    invoke-virtual {v6}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v6

    .line 460
    invoke-virtual {v5, v6, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    goto :goto_1

    .line 464
    :cond_15
    const-string v0, "databases"

    .line 465
    .line 466
    invoke-virtual {v3, v0, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    :cond_16
    invoke-virtual {v4, v3}, LB1/o;->d(Ljava/lang/Object;)V

    .line 470
    .line 471
    .line 472
    return-void

    .line 473
    :pswitch_6
    invoke-static/range {p1 .. p2}, Lk1/l;->b(LA/c;LB1/o;)Lk1/e;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    if-nez v0, :cond_17

    .line 478
    .line 479
    goto/16 :goto_14

    .line 480
    .line 481
    :cond_17
    sget-object v2, Lk1/l;->v:Lk1/h;

    .line 482
    .line 483
    new-instance v3, Lk1/j;

    .line 484
    .line 485
    invoke-direct {v3, v0, v8, v4}, Lk1/j;-><init>(Lk1/e;LA/c;LB1/o;)V

    .line 486
    .line 487
    .line 488
    invoke-interface {v2, v0, v3}, Lk1/h;->c(Lk1/e;Ljava/lang/Runnable;)V

    .line 489
    .line 490
    .line 491
    return-void

    .line 492
    :pswitch_7
    const-string v0, "Look for "

    .line 493
    .line 494
    const-string v2, "path"

    .line 495
    .line 496
    invoke-virtual {v8, v2}, LA/c;->i(Ljava/lang/String;)Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    move-result-object v2

    .line 500
    move-object v12, v2

    .line 501
    check-cast v12, Ljava/lang/String;

    .line 502
    .line 503
    const-string v2, "readOnly"

    .line 504
    .line 505
    invoke-virtual {v8, v2}, LA/c;->i(Ljava/lang/String;)Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v2

    .line 509
    move-object v6, v2

    .line 510
    check-cast v6, Ljava/lang/Boolean;

    .line 511
    .line 512
    if-eqz v12, :cond_19

    .line 513
    .line 514
    const-string v2, ":memory:"

    .line 515
    .line 516
    invoke-virtual {v12, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 517
    .line 518
    .line 519
    move-result v2

    .line 520
    if-eqz v2, :cond_18

    .line 521
    .line 522
    goto :goto_2

    .line 523
    :cond_18
    move v3, v9

    .line 524
    goto :goto_3

    .line 525
    :cond_19
    :goto_2
    move v3, v7

    .line 526
    :goto_3
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 527
    .line 528
    const-string v5, "singleInstance"

    .line 529
    .line 530
    invoke-virtual {v8, v5}, LA/c;->i(Ljava/lang/String;)Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object v5

    .line 534
    invoke-virtual {v2, v5}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 535
    .line 536
    .line 537
    move-result v2

    .line 538
    if-nez v2, :cond_1a

    .line 539
    .line 540
    if-nez v3, :cond_1a

    .line 541
    .line 542
    move v14, v7

    .line 543
    goto :goto_4

    .line 544
    :cond_1a
    move v14, v9

    .line 545
    :goto_4
    if-eqz v14, :cond_20

    .line 546
    .line 547
    sget-object v2, Lk1/l;->o:Ljava/lang/Object;

    .line 548
    .line 549
    monitor-enter v2

    .line 550
    :try_start_1
    sget v5, Lk1/l;->q:I

    .line 551
    .line 552
    invoke-static {v5}, Lk1/a;->a(I)Z

    .line 553
    .line 554
    .line 555
    move-result v5

    .line 556
    if-eqz v5, :cond_1b

    .line 557
    .line 558
    const-string v5, "Sqflite"

    .line 559
    .line 560
    new-instance v9, Ljava/lang/StringBuilder;

    .line 561
    .line 562
    invoke-direct {v9, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 563
    .line 564
    .line 565
    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 566
    .line 567
    .line 568
    const-string v0, " in "

    .line 569
    .line 570
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 571
    .line 572
    .line 573
    sget-object v0, Lk1/l;->m:Ljava/util/HashMap;

    .line 574
    .line 575
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 576
    .line 577
    .line 578
    move-result-object v0

    .line 579
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 580
    .line 581
    .line 582
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    invoke-static {v5, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 587
    .line 588
    .line 589
    goto :goto_5

    .line 590
    :catchall_0
    move-exception v0

    .line 591
    goto/16 :goto_8

    .line 592
    .line 593
    :cond_1b
    :goto_5
    sget-object v0, Lk1/l;->m:Ljava/util/HashMap;

    .line 594
    .line 595
    invoke-virtual {v0, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    move-result-object v0

    .line 599
    check-cast v0, Ljava/lang/Integer;

    .line 600
    .line 601
    if-eqz v0, :cond_1f

    .line 602
    .line 603
    sget-object v5, Lk1/l;->n:Ljava/util/HashMap;

    .line 604
    .line 605
    invoke-virtual {v5, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    move-result-object v5

    .line 609
    check-cast v5, Lk1/e;

    .line 610
    .line 611
    if-eqz v5, :cond_1f

    .line 612
    .line 613
    iget-object v9, v5, Lk1/e;->i:Landroid/database/sqlite/SQLiteDatabase;

    .line 614
    .line 615
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    .line 616
    .line 617
    .line 618
    move-result v9

    .line 619
    if-nez v9, :cond_1c

    .line 620
    .line 621
    sget v0, Lk1/l;->q:I

    .line 622
    .line 623
    invoke-static {v0}, Lk1/a;->a(I)Z

    .line 624
    .line 625
    .line 626
    move-result v0

    .line 627
    if-eqz v0, :cond_1f

    .line 628
    .line 629
    const-string v0, "Sqflite"

    .line 630
    .line 631
    new-instance v9, Ljava/lang/StringBuilder;

    .line 632
    .line 633
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 634
    .line 635
    .line 636
    invoke-virtual {v5}, Lk1/e;->i()Ljava/lang/String;

    .line 637
    .line 638
    .line 639
    move-result-object v5

    .line 640
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 641
    .line 642
    .line 643
    const-string v5, "single instance database of "

    .line 644
    .line 645
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 646
    .line 647
    .line 648
    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 649
    .line 650
    .line 651
    const-string v5, " not opened"

    .line 652
    .line 653
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 654
    .line 655
    .line 656
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 657
    .line 658
    .line 659
    move-result-object v5

    .line 660
    invoke-static {v0, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 661
    .line 662
    .line 663
    goto :goto_7

    .line 664
    :cond_1c
    sget v3, Lk1/l;->q:I

    .line 665
    .line 666
    invoke-static {v3}, Lk1/a;->a(I)Z

    .line 667
    .line 668
    .line 669
    move-result v3

    .line 670
    if-eqz v3, :cond_1e

    .line 671
    .line 672
    const-string v3, "Sqflite"

    .line 673
    .line 674
    new-instance v6, Ljava/lang/StringBuilder;

    .line 675
    .line 676
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 677
    .line 678
    .line 679
    invoke-virtual {v5}, Lk1/e;->i()Ljava/lang/String;

    .line 680
    .line 681
    .line 682
    move-result-object v8

    .line 683
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 684
    .line 685
    .line 686
    const-string v8, "re-opened single instance "

    .line 687
    .line 688
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 689
    .line 690
    .line 691
    invoke-virtual {v5}, Lk1/e;->k()Z

    .line 692
    .line 693
    .line 694
    move-result v8

    .line 695
    if-eqz v8, :cond_1d

    .line 696
    .line 697
    const-string v8, "(in transaction) "

    .line 698
    .line 699
    goto :goto_6

    .line 700
    :cond_1d
    const-string v8, ""

    .line 701
    .line 702
    :goto_6
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 703
    .line 704
    .line 705
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 706
    .line 707
    .line 708
    const-string v8, " "

    .line 709
    .line 710
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 711
    .line 712
    .line 713
    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 714
    .line 715
    .line 716
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 717
    .line 718
    .line 719
    move-result-object v6

    .line 720
    invoke-static {v3, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 721
    .line 722
    .line 723
    :cond_1e
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 724
    .line 725
    .line 726
    move-result v0

    .line 727
    invoke-virtual {v5}, Lk1/e;->k()Z

    .line 728
    .line 729
    .line 730
    move-result v3

    .line 731
    invoke-static {v0, v7, v3}, Lk1/l;->c(IZZ)Ljava/util/HashMap;

    .line 732
    .line 733
    .line 734
    move-result-object v0

    .line 735
    invoke-virtual {v4, v0}, LB1/o;->d(Ljava/lang/Object;)V

    .line 736
    .line 737
    .line 738
    monitor-exit v2

    .line 739
    return-void

    .line 740
    :cond_1f
    :goto_7
    monitor-exit v2

    .line 741
    goto :goto_9

    .line 742
    :goto_8
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 743
    throw v0

    .line 744
    :cond_20
    :goto_9
    sget-object v16, Lk1/l;->o:Ljava/lang/Object;

    .line 745
    .line 746
    monitor-enter v16

    .line 747
    :try_start_2
    sget v0, Lk1/l;->u:I

    .line 748
    .line 749
    add-int/lit8 v13, v0, 0x1

    .line 750
    .line 751
    sput v13, Lk1/l;->u:I

    .line 752
    .line 753
    monitor-exit v16
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 754
    new-instance v10, Lk1/e;

    .line 755
    .line 756
    iget-object v11, v1, Lk1/l;->k:Landroid/content/Context;

    .line 757
    .line 758
    sget v15, Lk1/l;->q:I

    .line 759
    .line 760
    invoke-direct/range {v10 .. v15}, Lk1/e;-><init>(Landroid/content/Context;Ljava/lang/String;IZI)V

    .line 761
    .line 762
    .line 763
    monitor-enter v16

    .line 764
    :try_start_3
    sget-object v0, Lk1/l;->v:Lk1/h;

    .line 765
    .line 766
    if-nez v0, :cond_22

    .line 767
    .line 768
    sget v0, Lk1/l;->t:I

    .line 769
    .line 770
    sget v2, Lk1/l;->s:I

    .line 771
    .line 772
    if-ne v0, v7, :cond_21

    .line 773
    .line 774
    new-instance v0, LG1/a;

    .line 775
    .line 776
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 777
    .line 778
    .line 779
    iput v2, v0, LG1/a;->a:I

    .line 780
    .line 781
    goto :goto_a

    .line 782
    :cond_21
    new-instance v5, LB1/i;

    .line 783
    .line 784
    invoke-direct {v5, v0, v2}, LB1/i;-><init>(II)V

    .line 785
    .line 786
    .line 787
    move-object v0, v5

    .line 788
    :goto_a
    sput-object v0, Lk1/l;->v:Lk1/h;

    .line 789
    .line 790
    invoke-interface {v0}, Lk1/h;->start()V

    .line 791
    .line 792
    .line 793
    iget v0, v10, Lk1/e;->d:I

    .line 794
    .line 795
    if-lt v0, v7, :cond_22

    .line 796
    .line 797
    const-string v0, "Sqflite"

    .line 798
    .line 799
    new-instance v2, Ljava/lang/StringBuilder;

    .line 800
    .line 801
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 802
    .line 803
    .line 804
    invoke-virtual {v10}, Lk1/e;->i()Ljava/lang/String;

    .line 805
    .line 806
    .line 807
    move-result-object v5

    .line 808
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 809
    .line 810
    .line 811
    const-string v5, "starting worker pool with priority "

    .line 812
    .line 813
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 814
    .line 815
    .line 816
    sget v5, Lk1/l;->s:I

    .line 817
    .line 818
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 819
    .line 820
    .line 821
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 822
    .line 823
    .line 824
    move-result-object v2

    .line 825
    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 826
    .line 827
    .line 828
    goto :goto_b

    .line 829
    :catchall_1
    move-exception v0

    .line 830
    goto :goto_c

    .line 831
    :cond_22
    :goto_b
    sget-object v0, Lk1/l;->v:Lk1/h;

    .line 832
    .line 833
    iput-object v0, v10, Lk1/e;->h:Lk1/h;

    .line 834
    .line 835
    iget v0, v10, Lk1/e;->d:I

    .line 836
    .line 837
    if-lt v0, v7, :cond_23

    .line 838
    .line 839
    const-string v0, "Sqflite"

    .line 840
    .line 841
    new-instance v2, Ljava/lang/StringBuilder;

    .line 842
    .line 843
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 844
    .line 845
    .line 846
    invoke-virtual {v10}, Lk1/e;->i()Ljava/lang/String;

    .line 847
    .line 848
    .line 849
    move-result-object v5

    .line 850
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 851
    .line 852
    .line 853
    const-string v5, "opened "

    .line 854
    .line 855
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 856
    .line 857
    .line 858
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 859
    .line 860
    .line 861
    const-string v5, " "

    .line 862
    .line 863
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 864
    .line 865
    .line 866
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 867
    .line 868
    .line 869
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 870
    .line 871
    .line 872
    move-result-object v2

    .line 873
    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 874
    .line 875
    .line 876
    :cond_23
    sget-object v0, Lk1/l;->v:Lk1/h;

    .line 877
    .line 878
    new-instance v2, Lk1/k;

    .line 879
    .line 880
    move-object v5, v4

    .line 881
    move-object v7, v10

    .line 882
    move-object v4, v12

    .line 883
    move v10, v13

    .line 884
    move v9, v14

    .line 885
    invoke-direct/range {v2 .. v10}, Lk1/k;-><init>(ZLjava/lang/String;LB1/o;Ljava/lang/Boolean;Lk1/e;LA/c;ZI)V

    .line 886
    .line 887
    .line 888
    move-object v10, v7

    .line 889
    invoke-interface {v0, v10, v2}, Lk1/h;->c(Lk1/e;Ljava/lang/Runnable;)V

    .line 890
    .line 891
    .line 892
    monitor-exit v16

    .line 893
    return-void

    .line 894
    :goto_c
    monitor-exit v16
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 895
    throw v0

    .line 896
    :catchall_2
    move-exception v0

    .line 897
    :try_start_4
    monitor-exit v16
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 898
    throw v0

    .line 899
    :pswitch_8
    iget-object v2, v8, LA/c;->m:Ljava/lang/Object;

    .line 900
    .line 901
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 902
    .line 903
    invoke-virtual {v3, v2}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 904
    .line 905
    .line 906
    move-result v2

    .line 907
    if-eqz v2, :cond_24

    .line 908
    .line 909
    if-eqz v2, :cond_25

    .line 910
    .line 911
    sput v7, Lk1/l;->q:I

    .line 912
    .line 913
    goto :goto_d

    .line 914
    :cond_24
    sput v9, Lk1/l;->q:I

    .line 915
    .line 916
    :cond_25
    :goto_d
    invoke-virtual {v4, v0}, LB1/o;->d(Ljava/lang/Object;)V

    .line 917
    .line 918
    .line 919
    return-void

    .line 920
    :pswitch_9
    const-string v2, "Look for "

    .line 921
    .line 922
    const-string v3, "path"

    .line 923
    .line 924
    invoke-virtual {v8, v3}, LA/c;->i(Ljava/lang/String;)Ljava/lang/Object;

    .line 925
    .line 926
    .line 927
    move-result-object v3

    .line 928
    check-cast v3, Ljava/lang/String;

    .line 929
    .line 930
    sget-object v5, Lk1/l;->o:Ljava/lang/Object;

    .line 931
    .line 932
    monitor-enter v5

    .line 933
    :try_start_5
    sget v6, Lk1/l;->q:I

    .line 934
    .line 935
    invoke-static {v6}, Lk1/a;->a(I)Z

    .line 936
    .line 937
    .line 938
    move-result v6

    .line 939
    if-eqz v6, :cond_26

    .line 940
    .line 941
    const-string v6, "Sqflite"

    .line 942
    .line 943
    new-instance v7, Ljava/lang/StringBuilder;

    .line 944
    .line 945
    invoke-direct {v7, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 946
    .line 947
    .line 948
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 949
    .line 950
    .line 951
    const-string v2, " in "

    .line 952
    .line 953
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 954
    .line 955
    .line 956
    sget-object v2, Lk1/l;->m:Ljava/util/HashMap;

    .line 957
    .line 958
    invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 959
    .line 960
    .line 961
    move-result-object v2

    .line 962
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 963
    .line 964
    .line 965
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 966
    .line 967
    .line 968
    move-result-object v2

    .line 969
    invoke-static {v6, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 970
    .line 971
    .line 972
    goto :goto_e

    .line 973
    :catchall_3
    move-exception v0

    .line 974
    goto/16 :goto_11

    .line 975
    .line 976
    :cond_26
    :goto_e
    sget-object v2, Lk1/l;->m:Ljava/util/HashMap;

    .line 977
    .line 978
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 979
    .line 980
    .line 981
    move-result-object v6

    .line 982
    check-cast v6, Ljava/lang/Integer;

    .line 983
    .line 984
    if-eqz v6, :cond_29

    .line 985
    .line 986
    sget-object v7, Lk1/l;->n:Ljava/util/HashMap;

    .line 987
    .line 988
    invoke-virtual {v7, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 989
    .line 990
    .line 991
    move-result-object v8

    .line 992
    check-cast v8, Lk1/e;

    .line 993
    .line 994
    if-eqz v8, :cond_29

    .line 995
    .line 996
    iget-object v9, v8, Lk1/e;->i:Landroid/database/sqlite/SQLiteDatabase;

    .line 997
    .line 998
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    .line 999
    .line 1000
    .line 1001
    move-result v9

    .line 1002
    if-eqz v9, :cond_29

    .line 1003
    .line 1004
    sget v0, Lk1/l;->q:I

    .line 1005
    .line 1006
    invoke-static {v0}, Lk1/a;->a(I)Z

    .line 1007
    .line 1008
    .line 1009
    move-result v0

    .line 1010
    if-eqz v0, :cond_28

    .line 1011
    .line 1012
    const-string v0, "Sqflite"

    .line 1013
    .line 1014
    new-instance v9, Ljava/lang/StringBuilder;

    .line 1015
    .line 1016
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 1017
    .line 1018
    .line 1019
    invoke-virtual {v8}, Lk1/e;->i()Ljava/lang/String;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v10

    .line 1023
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1024
    .line 1025
    .line 1026
    const-string v10, "found single instance "

    .line 1027
    .line 1028
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1029
    .line 1030
    .line 1031
    invoke-virtual {v8}, Lk1/e;->k()Z

    .line 1032
    .line 1033
    .line 1034
    move-result v10

    .line 1035
    if-eqz v10, :cond_27

    .line 1036
    .line 1037
    const-string v10, "(in transaction) "

    .line 1038
    .line 1039
    goto :goto_f

    .line 1040
    :cond_27
    const-string v10, ""

    .line 1041
    .line 1042
    :goto_f
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1043
    .line 1044
    .line 1045
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1046
    .line 1047
    .line 1048
    const-string v10, " "

    .line 1049
    .line 1050
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1051
    .line 1052
    .line 1053
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1054
    .line 1055
    .line 1056
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v9

    .line 1060
    invoke-static {v0, v9}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1061
    .line 1062
    .line 1063
    :cond_28
    invoke-virtual {v7, v6}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1064
    .line 1065
    .line 1066
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1067
    .line 1068
    .line 1069
    move-object v2, v8

    .line 1070
    goto :goto_10

    .line 1071
    :cond_29
    move-object v2, v0

    .line 1072
    :goto_10
    monitor-exit v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 1073
    new-instance v0, Lj/e;

    .line 1074
    .line 1075
    const/4 v5, 0x1

    .line 1076
    invoke-direct/range {v0 .. v5}, Lj/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1077
    .line 1078
    .line 1079
    sget-object v3, Lk1/l;->v:Lk1/h;

    .line 1080
    .line 1081
    if-eqz v3, :cond_2a

    .line 1082
    .line 1083
    invoke-interface {v3, v2, v0}, Lk1/h;->c(Lk1/e;Ljava/lang/Runnable;)V

    .line 1084
    .line 1085
    .line 1086
    return-void

    .line 1087
    :cond_2a
    invoke-virtual {v0}, Lj/e;->run()V

    .line 1088
    .line 1089
    .line 1090
    return-void

    .line 1091
    :goto_11
    :try_start_6
    monitor-exit v5
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 1092
    throw v0

    .line 1093
    :pswitch_a
    invoke-static/range {p1 .. p2}, Lk1/l;->b(LA/c;LB1/o;)Lk1/e;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v0

    .line 1097
    if-nez v0, :cond_2b

    .line 1098
    .line 1099
    goto/16 :goto_14

    .line 1100
    .line 1101
    :cond_2b
    sget-object v2, Lk1/l;->v:Lk1/h;

    .line 1102
    .line 1103
    new-instance v3, Lk1/j;

    .line 1104
    .line 1105
    invoke-direct {v3, v8, v0, v4}, Lk1/j;-><init>(LA/c;Lk1/e;LB1/o;)V

    .line 1106
    .line 1107
    .line 1108
    invoke-interface {v2, v0, v3}, Lk1/h;->c(Lk1/e;Ljava/lang/Runnable;)V

    .line 1109
    .line 1110
    .line 1111
    return-void

    .line 1112
    :pswitch_b
    invoke-static/range {p1 .. p2}, Lk1/l;->b(LA/c;LB1/o;)Lk1/e;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v0

    .line 1116
    if-nez v0, :cond_2c

    .line 1117
    .line 1118
    goto/16 :goto_14

    .line 1119
    .line 1120
    :cond_2c
    sget-object v2, Lk1/l;->v:Lk1/h;

    .line 1121
    .line 1122
    new-instance v5, Lk1/j;

    .line 1123
    .line 1124
    invoke-direct {v5, v8, v4, v0, v3}, Lk1/j;-><init>(LA/c;LB1/o;Lk1/e;I)V

    .line 1125
    .line 1126
    .line 1127
    invoke-interface {v2, v0, v5}, Lk1/h;->c(Lk1/e;Ljava/lang/Runnable;)V

    .line 1128
    .line 1129
    .line 1130
    return-void

    .line 1131
    :pswitch_c
    invoke-static/range {p1 .. p2}, Lk1/l;->b(LA/c;LB1/o;)Lk1/e;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v0

    .line 1135
    if-nez v0, :cond_2d

    .line 1136
    .line 1137
    goto/16 :goto_14

    .line 1138
    .line 1139
    :cond_2d
    sget-object v2, Lk1/l;->v:Lk1/h;

    .line 1140
    .line 1141
    new-instance v3, Lk1/j;

    .line 1142
    .line 1143
    invoke-direct {v3, v8, v4, v0, v7}, Lk1/j;-><init>(LA/c;LB1/o;Lk1/e;I)V

    .line 1144
    .line 1145
    .line 1146
    invoke-interface {v2, v0, v3}, Lk1/h;->c(Lk1/e;Ljava/lang/Runnable;)V

    .line 1147
    .line 1148
    .line 1149
    return-void

    .line 1150
    :pswitch_d
    const-string v2, "androidThreadPriority"

    .line 1151
    .line 1152
    invoke-virtual {v8, v2}, LA/c;->i(Ljava/lang/String;)Ljava/lang/Object;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v2

    .line 1156
    if-eqz v2, :cond_2e

    .line 1157
    .line 1158
    check-cast v2, Ljava/lang/Integer;

    .line 1159
    .line 1160
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1161
    .line 1162
    .line 1163
    move-result v2

    .line 1164
    sput v2, Lk1/l;->s:I

    .line 1165
    .line 1166
    :cond_2e
    const-string v2, "androidThreadCount"

    .line 1167
    .line 1168
    invoke-virtual {v8, v2}, LA/c;->i(Ljava/lang/String;)Ljava/lang/Object;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v2

    .line 1172
    if-eqz v2, :cond_2f

    .line 1173
    .line 1174
    sget v3, Lk1/l;->t:I

    .line 1175
    .line 1176
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v3

    .line 1180
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1181
    .line 1182
    .line 1183
    move-result v3

    .line 1184
    if-nez v3, :cond_2f

    .line 1185
    .line 1186
    check-cast v2, Ljava/lang/Integer;

    .line 1187
    .line 1188
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1189
    .line 1190
    .line 1191
    move-result v2

    .line 1192
    sput v2, Lk1/l;->t:I

    .line 1193
    .line 1194
    sget-object v2, Lk1/l;->v:Lk1/h;

    .line 1195
    .line 1196
    if-eqz v2, :cond_2f

    .line 1197
    .line 1198
    invoke-interface {v2}, Lk1/h;->a()V

    .line 1199
    .line 1200
    .line 1201
    sput-object v0, Lk1/l;->v:Lk1/h;

    .line 1202
    .line 1203
    :cond_2f
    const-string v2, "logLevel"

    .line 1204
    .line 1205
    invoke-virtual {v8, v2}, LA/c;->i(Ljava/lang/String;)Ljava/lang/Object;

    .line 1206
    .line 1207
    .line 1208
    move-result-object v2

    .line 1209
    check-cast v2, Ljava/lang/Integer;

    .line 1210
    .line 1211
    if-eqz v2, :cond_30

    .line 1212
    .line 1213
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1214
    .line 1215
    .line 1216
    move-result v2

    .line 1217
    sput v2, Lk1/l;->q:I

    .line 1218
    .line 1219
    :cond_30
    invoke-virtual {v4, v0}, LB1/o;->d(Ljava/lang/Object;)V

    .line 1220
    .line 1221
    .line 1222
    return-void

    .line 1223
    :pswitch_e
    const-string v0, "id"

    .line 1224
    .line 1225
    invoke-virtual {v8, v0}, LA/c;->i(Ljava/lang/String;)Ljava/lang/Object;

    .line 1226
    .line 1227
    .line 1228
    move-result-object v0

    .line 1229
    check-cast v0, Ljava/lang/Integer;

    .line 1230
    .line 1231
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1232
    .line 1233
    .line 1234
    move-result v2

    .line 1235
    invoke-static/range {p1 .. p2}, Lk1/l;->b(LA/c;LB1/o;)Lk1/e;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v3

    .line 1239
    if-nez v3, :cond_31

    .line 1240
    .line 1241
    goto :goto_14

    .line 1242
    :cond_31
    iget v5, v3, Lk1/e;->d:I

    .line 1243
    .line 1244
    if-lt v5, v7, :cond_32

    .line 1245
    .line 1246
    const-string v5, "Sqflite"

    .line 1247
    .line 1248
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1249
    .line 1250
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 1251
    .line 1252
    .line 1253
    invoke-virtual {v3}, Lk1/e;->i()Ljava/lang/String;

    .line 1254
    .line 1255
    .line 1256
    move-result-object v7

    .line 1257
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1258
    .line 1259
    .line 1260
    const-string v7, "closing "

    .line 1261
    .line 1262
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1263
    .line 1264
    .line 1265
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1266
    .line 1267
    .line 1268
    const-string v2, " "

    .line 1269
    .line 1270
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1271
    .line 1272
    .line 1273
    iget-object v2, v3, Lk1/e;->b:Ljava/lang/String;

    .line 1274
    .line 1275
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1276
    .line 1277
    .line 1278
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1279
    .line 1280
    .line 1281
    move-result-object v2

    .line 1282
    invoke-static {v5, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1283
    .line 1284
    .line 1285
    :cond_32
    iget-object v2, v3, Lk1/e;->b:Ljava/lang/String;

    .line 1286
    .line 1287
    sget-object v6, Lk1/l;->o:Ljava/lang/Object;

    .line 1288
    .line 1289
    monitor-enter v6

    .line 1290
    :try_start_7
    sget-object v5, Lk1/l;->n:Ljava/util/HashMap;

    .line 1291
    .line 1292
    invoke-virtual {v5, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1293
    .line 1294
    .line 1295
    iget-boolean v0, v3, Lk1/e;->a:Z

    .line 1296
    .line 1297
    if-eqz v0, :cond_33

    .line 1298
    .line 1299
    sget-object v0, Lk1/l;->m:Ljava/util/HashMap;

    .line 1300
    .line 1301
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1302
    .line 1303
    .line 1304
    goto :goto_12

    .line 1305
    :catchall_4
    move-exception v0

    .line 1306
    goto :goto_13

    .line 1307
    :cond_33
    :goto_12
    monitor-exit v6
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 1308
    sget-object v0, Lk1/l;->v:Lk1/h;

    .line 1309
    .line 1310
    new-instance v2, LA/q;

    .line 1311
    .line 1312
    invoke-direct {v2, v1, v3, v4}, LA/q;-><init>(Lk1/l;Lk1/e;LB1/o;)V

    .line 1313
    .line 1314
    .line 1315
    invoke-interface {v0, v3, v2}, Lk1/h;->c(Lk1/e;Ljava/lang/Runnable;)V

    .line 1316
    .line 1317
    .line 1318
    return-void

    .line 1319
    :goto_13
    :try_start_8
    monitor-exit v6
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 1320
    throw v0

    .line 1321
    :pswitch_f
    invoke-static/range {p1 .. p2}, Lk1/l;->b(LA/c;LB1/o;)Lk1/e;

    .line 1322
    .line 1323
    .line 1324
    move-result-object v0

    .line 1325
    if-nez v0, :cond_34

    .line 1326
    .line 1327
    :goto_14
    return-void

    .line 1328
    :cond_34
    sget-object v2, Lk1/l;->v:Lk1/h;

    .line 1329
    .line 1330
    new-instance v3, Lk1/j;

    .line 1331
    .line 1332
    invoke-direct {v3, v8, v4, v0, v5}, Lk1/j;-><init>(LA/c;LB1/o;Lk1/e;I)V

    .line 1333
    .line 1334
    .line 1335
    invoke-interface {v2, v0, v3}, Lk1/h;->c(Lk1/e;Ljava/lang/Runnable;)V

    .line 1336
    .line 1337
    .line 1338
    return-void

    .line 1339
    :sswitch_data_0
    .sparse-switch
        -0x4ea7088b -> :sswitch_f
        -0x4ab8246d -> :sswitch_e
        -0x4a797962 -> :sswitch_d
        -0x468f3d47 -> :sswitch_c
        -0x31ffc737 -> :sswitch_b
        -0x179ee453 -> :sswitch_a
        -0xfb4dfba -> :sswitch_9
        -0xbd41d6a -> :sswitch_8
        -0x1064e1b -> :sswitch_7
        0x592d73a -> :sswitch_6
        0x5b09653 -> :sswitch_5
        0x66f18c8 -> :sswitch_4
        0x3901a9b7 -> :sswitch_3
        0x47241251 -> :sswitch_2
        0x529446af -> :sswitch_1
        0x6f17c6e7 -> :sswitch_0
    .end sparse-switch

    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
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

.method public final onAttachedToEngine(Ly1/a;)V
    .locals 4

    .line 1
    iget-object v0, p1, Ly1/a;->a:Landroid/content/Context;

    .line 2
    .line 3
    iget-object p1, p1, Ly1/a;->c:LC1/f;

    .line 4
    .line 5
    iput-object v0, p0, Lk1/l;->k:Landroid/content/Context;

    .line 6
    .line 7
    new-instance v0, LB1/s;

    .line 8
    .line 9
    sget-object v1, LC1/r;->a:LC1/r;

    .line 10
    .line 11
    new-instance v2, LC1/k;

    .line 12
    .line 13
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1, v2}, LC1/f;->a(LC1/k;)Lt1/a;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const-string v3, "com.tekartik.sqflite"

    .line 21
    .line 22
    invoke-direct {v0, p1, v3, v1, v2}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lk1/l;->l:LB1/s;

    .line 26
    .line 27
    invoke-virtual {v0, p0}, LB1/s;->z(LC1/m;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final onDetachedFromEngine(Ly1/a;)V
    .locals 1

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lk1/l;->k:Landroid/content/Context;

    .line 3
    .line 4
    iget-object v0, p0, Lk1/l;->l:LB1/s;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, LB1/s;->z(LC1/m;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lk1/l;->l:LB1/s;

    .line 10
    .line 11
    return-void
.end method

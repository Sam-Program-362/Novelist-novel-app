.class public Lorg/apache/tika/pipes/PipesClient;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field private static CLIENT_COUNTER:Ljava/util/concurrent/atomic/AtomicInteger; = null

.field private static final LOG:LF2/b;

.field private static final MAX_BYTES_BEFORE_READY:I = 0x4e20

.field private static final WAIT_ON_DESTROY_MS:J = 0x2710L


# instance fields
.field private volatile closed:Z

.field private executorService:Ljava/util/concurrent/ExecutorService;

.field private final executorServiceLock:[Ljava/lang/Object;

.field private filesProcessed:I

.field private input:Ljava/io/DataInputStream;

.field private output:Ljava/io/DataOutputStream;

.field private final pipesClientId:I

.field private final pipesConfig:Lorg/apache/tika/pipes/PipesConfigBase;

.field private process:Ljava/lang/Process;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Lorg/apache/tika/pipes/PipesClient;

    .line 2
    .line 3
    invoke-static {v0}, LF2/d;->b(Ljava/lang/Class;)LF2/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lorg/apache/tika/pipes/PipesClient;->LOG:LF2/b;

    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lorg/apache/tika/pipes/PipesClient;->CLIENT_COUNTER:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Lorg/apache/tika/pipes/PipesConfigBase;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    new-array v1, v0, [Ljava/lang/Object;

    .line 6
    .line 7
    iput-object v1, p0, Lorg/apache/tika/pipes/PipesClient;->executorServiceLock:[Ljava/lang/Object;

    .line 8
    .line 9
    iput-boolean v0, p0, Lorg/apache/tika/pipes/PipesClient;->closed:Z

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-static {v1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iput-object v1, p0, Lorg/apache/tika/pipes/PipesClient;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 17
    .line 18
    iput v0, p0, Lorg/apache/tika/pipes/PipesClient;->filesProcessed:I

    .line 19
    .line 20
    iput-object p1, p0, Lorg/apache/tika/pipes/PipesClient;->pipesConfig:Lorg/apache/tika/pipes/PipesConfigBase;

    .line 21
    .line 22
    sget-object p1, Lorg/apache/tika/pipes/PipesClient;->CLIENT_COUNTER:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    iput p1, p0, Lorg/apache/tika/pipes/PipesClient;->pipesClientId:I

    .line 29
    .line 30
    return-void
.end method

.method public static synthetic a(Lorg/apache/tika/pipes/PipesClient;Lx2/c;)Ljava/lang/Integer;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lorg/apache/tika/pipes/PipesClient;->lambda$restart$1(Lx2/c;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private actuallyProcess(Lorg/apache/tika/pipes/FetchEmitTuple;)Lorg/apache/tika/pipes/PipesResult;
    .locals 12

    .line 1
    const-string v1, "pipesClientId="

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v5

    .line 7
    const/4 v8, 0x1

    .line 8
    new-array v7, v8, [Lorg/apache/tika/pipes/PipesResult;

    .line 9
    .line 10
    new-instance v9, Ljava/util/concurrent/FutureTask;

    .line 11
    .line 12
    new-instance v2, Lorg/apache/tika/pipes/a;

    .line 13
    .line 14
    move-object v3, p0

    .line 15
    move-object v4, p1

    .line 16
    invoke-direct/range {v2 .. v7}, Lorg/apache/tika/pipes/a;-><init>(Lorg/apache/tika/pipes/PipesClient;Lorg/apache/tika/pipes/FetchEmitTuple;J[Lorg/apache/tika/pipes/PipesResult;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {v9, v2}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    .line 20
    .line 21
    .line 22
    :try_start_0
    iget-boolean p1, v3, Lorg/apache/tika/pipes/PipesClient;->closed:Z

    .line 23
    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    iget-object p1, v3, Lorg/apache/tika/pipes/PipesClient;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 27
    .line 28
    invoke-interface {p1, v9}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, v3, Lorg/apache/tika/pipes/PipesClient;->pipesConfig:Lorg/apache/tika/pipes/PipesConfigBase;

    .line 32
    .line 33
    invoke-virtual {p1}, Lorg/apache/tika/pipes/PipesConfigBase;->getTimeoutMillis()J

    .line 34
    .line 35
    .line 36
    move-result-wide v10

    .line 37
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 38
    .line 39
    invoke-virtual {v9, v10, v11, p1}, Ljava/util/concurrent/FutureTask;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, Lorg/apache/tika/pipes/PipesResult;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    invoke-virtual {v9, v8}, Ljava/util/concurrent/FutureTask;->cancel(Z)Z

    .line 46
    .line 47
    .line 48
    return-object p1

    .line 49
    :catchall_0
    move-exception v0

    .line 50
    move-object p1, v0

    .line 51
    goto/16 :goto_3

    .line 52
    .line 53
    :catch_0
    move-exception v0

    .line 54
    move-object p1, v0

    .line 55
    goto :goto_0

    .line 56
    :catch_1
    move-exception v0

    .line 57
    move-object p1, v0

    .line 58
    goto/16 :goto_2

    .line 59
    .line 60
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 61
    .line 62
    iget v0, v3, Lorg/apache/tika/pipes/PipesClient;->pipesClientId:I

    .line 63
    .line 64
    new-instance v2, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v0, ": PipesClient closed"

    .line 73
    .line 74
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw p1
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 85
    :catch_2
    :try_start_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 86
    .line 87
    .line 88
    move-result-wide v0

    .line 89
    sub-long/2addr v0, v5

    .line 90
    invoke-direct {p0}, Lorg/apache/tika/pipes/PipesClient;->destroyForcibly()V

    .line 91
    .line 92
    .line 93
    sget-object p1, Lorg/apache/tika/pipes/PipesClient;->LOG:LF2/b;

    .line 94
    .line 95
    const-string v2, "pipesClientId={} client timeout: {} in {} ms"

    .line 96
    .line 97
    iget v5, v3, Lorg/apache/tika/pipes/PipesClient;->pipesClientId:I

    .line 98
    .line 99
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    invoke-virtual {v4}, Lorg/apache/tika/pipes/FetchEmitTuple;->getId()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    filled-new-array {v5, v4, v0}, [Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-interface {p1, v2, v0}, LF2/b;->q(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    sget-object p1, Lorg/apache/tika/pipes/PipesResult;->TIMEOUT:Lorg/apache/tika/pipes/PipesResult;

    .line 119
    .line 120
    invoke-direct {p0, p1, v7}, Lorg/apache/tika/pipes/PipesClient;->buildFatalResult(Lorg/apache/tika/pipes/PipesResult;[Lorg/apache/tika/pipes/PipesResult;)Lorg/apache/tika/pipes/PipesResult;

    .line 121
    .line 122
    .line 123
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 124
    invoke-virtual {v9, v8}, Ljava/util/concurrent/FutureTask;->cancel(Z)Z

    .line 125
    .line 126
    .line 127
    return-object p1

    .line 128
    :goto_0
    :try_start_3
    sget-object v0, Lorg/apache/tika/pipes/PipesClient;->LOG:LF2/b;

    .line 129
    .line 130
    iget v2, v3, Lorg/apache/tika/pipes/PipesClient;->pipesClientId:I

    .line 131
    .line 132
    new-instance v10, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    invoke-direct {v10, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    const-string v1, ": execution exception"

    .line 141
    .line 142
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-interface {v0, v1, p1}, LF2/b;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 150
    .line 151
    .line 152
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 153
    .line 154
    .line 155
    move-result-wide v1

    .line 156
    sub-long/2addr v1, v5

    .line 157
    invoke-direct {p0}, Lorg/apache/tika/pipes/PipesClient;->pauseThenDestroy()V

    .line 158
    .line 159
    .line 160
    iget-object p1, v3, Lorg/apache/tika/pipes/PipesClient;->process:Ljava/lang/Process;

    .line 161
    .line 162
    invoke-static {p1}, Lorg/apache/tika/fork/a;->A(Ljava/lang/Process;)Z

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    if-nez p1, :cond_1

    .line 167
    .line 168
    iget-object p1, v3, Lorg/apache/tika/pipes/PipesClient;->process:Ljava/lang/Process;

    .line 169
    .line 170
    invoke-virtual {p1}, Ljava/lang/Process;->exitValue()I

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    const/16 v5, 0x11

    .line 175
    .line 176
    if-ne v5, p1, :cond_1

    .line 177
    .line 178
    const-string p1, "pipesClientId={} server timeout: {} in {} ms"

    .line 179
    .line 180
    iget v5, v3, Lorg/apache/tika/pipes/PipesClient;->pipesClientId:I

    .line 181
    .line 182
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    invoke-virtual {v4}, Lorg/apache/tika/pipes/FetchEmitTuple;->getId()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    filled-new-array {v5, v4, v1}, [Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-interface {v0, p1, v1}, LF2/b;->q(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    sget-object p1, Lorg/apache/tika/pipes/PipesResult;->TIMEOUT:Lorg/apache/tika/pipes/PipesResult;

    .line 202
    .line 203
    invoke-direct {p0, p1, v7}, Lorg/apache/tika/pipes/PipesClient;->buildFatalResult(Lorg/apache/tika/pipes/PipesResult;[Lorg/apache/tika/pipes/PipesResult;)Lorg/apache/tika/pipes/PipesResult;

    .line 204
    .line 205
    .line 206
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 207
    invoke-virtual {v9, v8}, Ljava/util/concurrent/FutureTask;->cancel(Z)Z

    .line 208
    .line 209
    .line 210
    return-object p1

    .line 211
    :cond_1
    :try_start_4
    iget-object p1, v3, Lorg/apache/tika/pipes/PipesClient;->process:Ljava/lang/Process;

    .line 212
    .line 213
    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 214
    .line 215
    invoke-static {p1}, Lorg/apache/tika/fork/a;->D(Ljava/lang/Process;)V

    .line 216
    .line 217
    .line 218
    iget-object p1, v3, Lorg/apache/tika/pipes/PipesClient;->process:Ljava/lang/Process;

    .line 219
    .line 220
    invoke-static {p1}, Lorg/apache/tika/fork/a;->A(Ljava/lang/Process;)Z

    .line 221
    .line 222
    .line 223
    move-result p1

    .line 224
    if-eqz p1, :cond_2

    .line 225
    .line 226
    const-string p1, "pipesClientId={} crash: {} in {} ms with no exit code available"

    .line 227
    .line 228
    iget v5, v3, Lorg/apache/tika/pipes/PipesClient;->pipesClientId:I

    .line 229
    .line 230
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 231
    .line 232
    .line 233
    move-result-object v5

    .line 234
    invoke-virtual {v4}, Lorg/apache/tika/pipes/FetchEmitTuple;->getId()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v4

    .line 238
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    filled-new-array {v5, v4, v1}, [Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    invoke-interface {v0, p1, v1}, LF2/b;->q(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    goto :goto_1

    .line 250
    :cond_2
    const-string p1, "pipesClientId={} crash: {} in {} ms with exit code {}"

    .line 251
    .line 252
    iget v5, v3, Lorg/apache/tika/pipes/PipesClient;->pipesClientId:I

    .line 253
    .line 254
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 255
    .line 256
    .line 257
    move-result-object v5

    .line 258
    invoke-virtual {v4}, Lorg/apache/tika/pipes/FetchEmitTuple;->getId()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v4

    .line 262
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    iget-object v2, v3, Lorg/apache/tika/pipes/PipesClient;->process:Ljava/lang/Process;

    .line 267
    .line 268
    invoke-virtual {v2}, Ljava/lang/Process;->exitValue()I

    .line 269
    .line 270
    .line 271
    move-result v2

    .line 272
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    filled-new-array {v5, v4, v1, v2}, [Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    invoke-interface {v0, p1, v1}, LF2/b;->q(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    :goto_1
    sget-object p1, Lorg/apache/tika/pipes/PipesResult;->UNSPECIFIED_CRASH:Lorg/apache/tika/pipes/PipesResult;

    .line 284
    .line 285
    invoke-direct {p0, p1, v7}, Lorg/apache/tika/pipes/PipesClient;->buildFatalResult(Lorg/apache/tika/pipes/PipesResult;[Lorg/apache/tika/pipes/PipesResult;)Lorg/apache/tika/pipes/PipesResult;

    .line 286
    .line 287
    .line 288
    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 289
    invoke-virtual {v9, v8}, Ljava/util/concurrent/FutureTask;->cancel(Z)Z

    .line 290
    .line 291
    .line 292
    return-object p1

    .line 293
    :goto_2
    :try_start_5
    invoke-direct {p0}, Lorg/apache/tika/pipes/PipesClient;->destroyForcibly()V

    .line 294
    .line 295
    .line 296
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 297
    :goto_3
    invoke-virtual {v9, v8}, Ljava/util/concurrent/FutureTask;->cancel(Z)Z

    .line 298
    .line 299
    .line 300
    throw p1
.end method

.method public static synthetic b(Lorg/apache/tika/pipes/PipesClient;Lorg/apache/tika/pipes/FetchEmitTuple;J[Lorg/apache/tika/pipes/PipesResult;)Lorg/apache/tika/pipes/PipesResult;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lorg/apache/tika/pipes/PipesClient;->lambda$actuallyProcess$0(Lorg/apache/tika/pipes/FetchEmitTuple;J[Lorg/apache/tika/pipes/PipesResult;)Lorg/apache/tika/pipes/PipesResult;

    move-result-object p0

    return-object p0
.end method

.method private buildFatalResult(Lorg/apache/tika/pipes/PipesResult;[Lorg/apache/tika/pipes/PipesResult;)Lorg/apache/tika/pipes/PipesResult;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    aget-object v1, p2, v0

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    return-object p1

    .line 7
    :cond_0
    sget-object v1, Lorg/apache/tika/pipes/PipesClient;->LOG:LF2/b;

    .line 8
    .line 9
    invoke-interface {v1}, LF2/b;->v()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    aget-object v2, p2, v0

    .line 16
    .line 17
    invoke-virtual {v2}, Lorg/apache/tika/pipes/PipesResult;->getEmitData()Lorg/apache/tika/pipes/emitter/EmitData;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const-string v3, "intermediate result: {}"

    .line 22
    .line 23
    invoke-interface {v1, v2, v3}, LF2/b;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    aget-object v1, p2, v0

    .line 27
    .line 28
    invoke-virtual {v1}, Lorg/apache/tika/pipes/PipesResult;->getEmitData()Lorg/apache/tika/pipes/emitter/EmitData;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, Lorg/apache/tika/pipes/emitter/EmitData;->getMetadataList()Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Lorg/apache/tika/metadata/Metadata;

    .line 41
    .line 42
    sget-object v2, Lorg/apache/tika/metadata/TikaCoreProperties;->PIPES_RESULT:Lorg/apache/tika/metadata/Property;

    .line 43
    .line 44
    invoke-virtual {p1}, Lorg/apache/tika/pipes/PipesResult;->getStatus()Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {v1, v2, v3}, Lorg/apache/tika/metadata/Metadata;->set(Lorg/apache/tika/metadata/Property;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    new-instance v1, Lorg/apache/tika/pipes/PipesResult;

    .line 56
    .line 57
    invoke-virtual {p1}, Lorg/apache/tika/pipes/PipesResult;->getStatus()Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    aget-object p2, p2, v0

    .line 62
    .line 63
    invoke-virtual {p2}, Lorg/apache/tika/pipes/PipesResult;->getEmitData()Lorg/apache/tika/pipes/emitter/EmitData;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    const/4 v0, 0x1

    .line 68
    invoke-direct {v1, p1, p2, v0}, Lorg/apache/tika/pipes/PipesResult;-><init>(Lorg/apache/tika/pipes/PipesResult$STATUS;Lorg/apache/tika/pipes/emitter/EmitData;Z)V

    .line 69
    .line 70
    .line 71
    return-object v1
.end method

.method private deserializeEmitData()Lorg/apache/tika/pipes/PipesResult;
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesClient;->input:Ljava/io/DataInputStream;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readInt()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    new-array v0, v0, [B

    .line 8
    .line 9
    iget-object v1, p0, Lorg/apache/tika/pipes/PipesClient;->input:Ljava/io/DataInputStream;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ljava/io/DataInputStream;->readFully([B)V

    .line 12
    .line 13
    .line 14
    :try_start_0
    new-instance v1, Ljava/io/ObjectInputStream;

    .line 15
    .line 16
    sget v2, Lw2/h;->o:I

    .line 17
    .line 18
    new-instance v2, Lw2/g;

    .line 19
    .line 20
    invoke-direct {v2}, Lt2/d;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, v0}, Lw2/g;->W([B)V

    .line 24
    .line 25
    .line 26
    new-instance v0, Lw2/h;

    .line 27
    .line 28
    invoke-direct {v0, v2}, Lw2/h;-><init>(Lw2/g;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {v1, v0}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    .line 34
    :try_start_1
    invoke-virtual {v1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Lorg/apache/tika/pipes/emitter/EmitData;

    .line 39
    .line 40
    invoke-virtual {v0}, Lorg/apache/tika/pipes/emitter/EmitData;->getContainerStackTrace()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-static {v2}, Lorg/apache/tika/utils/StringUtils;->isBlank(Ljava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_0

    .line 49
    .line 50
    new-instance v2, Lorg/apache/tika/pipes/PipesResult;

    .line 51
    .line 52
    invoke-direct {v2, v0}, Lorg/apache/tika/pipes/PipesResult;-><init>(Lorg/apache/tika/pipes/emitter/EmitData;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    .line 54
    .line 55
    :try_start_2
    invoke-virtual {v1}, Ljava/io/ObjectInputStream;->close()V
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_0

    .line 56
    .line 57
    .line 58
    return-object v2

    .line 59
    :catch_0
    move-exception v0

    .line 60
    goto :goto_2

    .line 61
    :catchall_0
    move-exception v0

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    :try_start_3
    new-instance v3, Lorg/apache/tika/pipes/PipesResult;

    .line 64
    .line 65
    invoke-direct {v3, v0, v2}, Lorg/apache/tika/pipes/PipesResult;-><init>(Lorg/apache/tika/pipes/emitter/EmitData;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 66
    .line 67
    .line 68
    :try_start_4
    invoke-virtual {v1}, Ljava/io/ObjectInputStream;->close()V
    :try_end_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_0

    .line 69
    .line 70
    .line 71
    return-object v3

    .line 72
    :goto_0
    :try_start_5
    invoke-virtual {v1}, Ljava/io/ObjectInputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :catchall_1
    move-exception v1

    .line 77
    :try_start_6
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    :goto_1
    throw v0
    :try_end_6
    .catch Ljava/lang/ClassNotFoundException; {:try_start_6 .. :try_end_6} :catch_0

    .line 81
    :goto_2
    sget-object v1, Lorg/apache/tika/pipes/PipesClient;->LOG:LF2/b;

    .line 82
    .line 83
    const-string v2, "class not found exception deserializing data"

    .line 84
    .line 85
    invoke-interface {v1, v2, v0}, LF2/b;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    new-instance v1, Ljava/lang/RuntimeException;

    .line 89
    .line 90
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 91
    .line 92
    .line 93
    throw v1
.end method

.method private deserializeIntermediateResult(Lorg/apache/tika/pipes/emitter/EmitKey;Lorg/apache/tika/parser/ParseContext;)Lorg/apache/tika/pipes/PipesResult;
    .locals 3

    .line 1
    iget-object p2, p0, Lorg/apache/tika/pipes/PipesClient;->input:Ljava/io/DataInputStream;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/io/DataInputStream;->readInt()I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    new-array p2, p2, [B

    .line 8
    .line 9
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesClient;->input:Ljava/io/DataInputStream;

    .line 10
    .line 11
    invoke-virtual {v0, p2}, Ljava/io/DataInputStream;->readFully([B)V

    .line 12
    .line 13
    .line 14
    :try_start_0
    new-instance v0, Ljava/io/ObjectInputStream;

    .line 15
    .line 16
    sget v1, Lw2/h;->o:I

    .line 17
    .line 18
    new-instance v1, Lw2/g;

    .line 19
    .line 20
    invoke-direct {v1}, Lt2/d;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p2}, Lw2/g;->W([B)V

    .line 24
    .line 25
    .line 26
    new-instance p2, Lw2/h;

    .line 27
    .line 28
    invoke-direct {p2, v1}, Lw2/h;-><init>(Lw2/g;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {v0, p2}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    .line 34
    :try_start_1
    invoke-virtual {v0}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    check-cast p2, Lorg/apache/tika/metadata/Metadata;

    .line 39
    .line 40
    new-instance v1, Lorg/apache/tika/pipes/emitter/EmitData;

    .line 41
    .line 42
    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-direct {v1, p1, p2}, Lorg/apache/tika/pipes/emitter/EmitData;-><init>(Lorg/apache/tika/pipes/emitter/EmitKey;Ljava/util/List;)V

    .line 47
    .line 48
    .line 49
    new-instance p1, Lorg/apache/tika/pipes/PipesResult;

    .line 50
    .line 51
    sget-object p2, Lorg/apache/tika/pipes/PipesResult$STATUS;->INTERMEDIATE_RESULT:Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 52
    .line 53
    const/4 v2, 0x1

    .line 54
    invoke-direct {p1, p2, v1, v2}, Lorg/apache/tika/pipes/PipesResult;-><init>(Lorg/apache/tika/pipes/PipesResult$STATUS;Lorg/apache/tika/pipes/emitter/EmitData;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    .line 56
    .line 57
    :try_start_2
    invoke-virtual {v0}, Ljava/io/ObjectInputStream;->close()V
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_0

    .line 58
    .line 59
    .line 60
    return-object p1

    .line 61
    :catch_0
    move-exception p1

    .line 62
    goto :goto_1

    .line 63
    :catchall_0
    move-exception p1

    .line 64
    :try_start_3
    invoke-virtual {v0}, Ljava/io/ObjectInputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :catchall_1
    move-exception p2

    .line 69
    :try_start_4
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    :goto_0
    throw p1
    :try_end_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_0

    .line 73
    :goto_1
    sget-object p2, Lorg/apache/tika/pipes/PipesClient;->LOG:LF2/b;

    .line 74
    .line 75
    const-string v0, "class not found exception deserializing data"

    .line 76
    .line 77
    invoke-interface {p2, v0, p1}, LF2/b;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    new-instance p2, Ljava/lang/RuntimeException;

    .line 81
    .line 82
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 83
    .line 84
    .line 85
    throw p2
.end method

.method private destroyForcibly()V
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesClient;->process:Ljava/lang/Process;

    .line 2
    .line 3
    invoke-static {v0}, Lorg/apache/tika/fork/a;->r(Ljava/lang/Process;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesClient;->process:Ljava/lang/Process;

    .line 7
    .line 8
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 9
    .line 10
    invoke-static {v0}, Lorg/apache/tika/fork/a;->z(Ljava/lang/Process;)V

    .line 11
    .line 12
    .line 13
    :try_start_0
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesClient;->input:Ljava/io/DataInputStream;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    :catch_0
    :try_start_1
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesClient;->output:Ljava/io/DataOutputStream;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 21
    .line 22
    .line 23
    :catch_1
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesClient;->process:Ljava/lang/Process;

    .line 24
    .line 25
    invoke-static {v0}, Lorg/apache/tika/fork/a;->A(Ljava/lang/Process;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    sget-object v0, Lorg/apache/tika/pipes/PipesClient;->LOG:LF2/b;

    .line 32
    .line 33
    const-string v1, "Process still alive after {}ms"

    .line 34
    .line 35
    const-wide/16 v2, 0x2710

    .line 36
    .line 37
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-interface {v0, v2, v1}, LF2/b;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    return-void
.end method

.method private getCommandline()[Ljava/lang/String;
    .locals 13

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesClient;->pipesConfig:Lorg/apache/tika/pipes/PipesConfigBase;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/apache/tika/pipes/PipesConfigBase;->getForkedJvmArgs()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    move v5, v2

    .line 14
    move v6, v5

    .line 15
    move v7, v6

    .line 16
    move v8, v7

    .line 17
    move-object v4, v3

    .line 18
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v9

    .line 22
    const-string v10, "-cp"

    .line 23
    .line 24
    if-eqz v9, :cond_7

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v9

    .line 30
    check-cast v9, Ljava/lang/String;

    .line 31
    .line 32
    const-string v11, "-Djava.awt.headless"

    .line 33
    .line 34
    invoke-virtual {v9, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v11

    .line 38
    const/4 v12, 0x1

    .line 39
    if-eqz v11, :cond_1

    .line 40
    .line 41
    move v6, v12

    .line 42
    :cond_1
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v10

    .line 46
    if-nez v10, :cond_2

    .line 47
    .line 48
    const-string v10, "--classpath"

    .line 49
    .line 50
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v10

    .line 54
    if-eqz v10, :cond_3

    .line 55
    .line 56
    :cond_2
    move v5, v12

    .line 57
    :cond_3
    const-string v10, "-XX:+ExitOnOutOfMemoryError"

    .line 58
    .line 59
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v10

    .line 63
    if-nez v10, :cond_4

    .line 64
    .line 65
    const-string v10, "-XX:+CrashOnOutOfMemoryError"

    .line 66
    .line 67
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v10

    .line 71
    if-eqz v10, :cond_5

    .line 72
    .line 73
    :cond_4
    move v7, v12

    .line 74
    :cond_5
    const-string v10, "-Dlog4j.configuration"

    .line 75
    .line 76
    invoke-virtual {v9, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result v10

    .line 80
    if-eqz v10, :cond_6

    .line 81
    .line 82
    move v8, v12

    .line 83
    :cond_6
    const-string v10, "-Xloggc:"

    .line 84
    .line 85
    invoke-virtual {v9, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 86
    .line 87
    .line 88
    move-result v10

    .line 89
    if-eqz v10, :cond_0

    .line 90
    .line 91
    iget v3, p0, Lorg/apache/tika/pipes/PipesClient;->pipesClientId:I

    .line 92
    .line 93
    new-instance v4, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    const-string v10, "id-"

    .line 96
    .line 97
    invoke-direct {v4, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    const-string v4, "${pipesClientId}"

    .line 108
    .line 109
    invoke-virtual {v9, v4, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    move-object v4, v3

    .line 114
    move-object v3, v9

    .line 115
    goto :goto_0

    .line 116
    :cond_7
    if-eqz v3, :cond_8

    .line 117
    .line 118
    if-eqz v4, :cond_8

    .line 119
    .line 120
    invoke-interface {v0, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    :cond_8
    new-instance v1, Ljava/util/ArrayList;

    .line 127
    .line 128
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 129
    .line 130
    .line 131
    iget-object v3, p0, Lorg/apache/tika/pipes/PipesClient;->pipesConfig:Lorg/apache/tika/pipes/PipesConfigBase;

    .line 132
    .line 133
    invoke-virtual {v3}, Lorg/apache/tika/pipes/PipesConfigBase;->getJavaPath()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    invoke-static {v3}, Lorg/apache/tika/utils/ProcessUtils;->escapeCommandLine(Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    if-nez v5, :cond_9

    .line 145
    .line 146
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    const-string v3, "java.class.path"

    .line 150
    .line 151
    invoke-static {v3}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    :cond_9
    if-nez v6, :cond_a

    .line 159
    .line 160
    const-string v3, "-Djava.awt.headless=true"

    .line 161
    .line 162
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    :cond_a
    if-eqz v7, :cond_b

    .line 166
    .line 167
    sget-object v3, Lorg/apache/tika/pipes/PipesClient;->LOG:LF2/b;

    .line 168
    .line 169
    const-string v4, "I notice that you have an exit/crash on OOM. If you run heavy external processes like tesseract, this setting may result in orphaned processes which could be disastrous for performance."

    .line 170
    .line 171
    invoke-interface {v3, v4}, LF2/b;->m(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    :cond_b
    if-nez v8, :cond_c

    .line 175
    .line 176
    const-string v3, "-Dlog4j.configurationFile=classpath:pipes-fork-server-default-log4j2.xml"

    .line 177
    .line 178
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    :cond_c
    iget v3, p0, Lorg/apache/tika/pipes/PipesClient;->pipesClientId:I

    .line 182
    .line 183
    new-instance v4, Ljava/lang/StringBuilder;

    .line 184
    .line 185
    const-string v5, "-DpipesClientId="

    .line 186
    .line 187
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 201
    .line 202
    .line 203
    const-string v0, "org.apache.tika.pipes.PipesServer"

    .line 204
    .line 205
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesClient;->pipesConfig:Lorg/apache/tika/pipes/PipesConfigBase;

    .line 209
    .line 210
    invoke-virtual {v0}, Lorg/apache/tika/pipes/PipesConfigBase;->getTikaConfig()Ljava/nio/file/Path;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-static {v0}, Lio/flutter/plugin/editing/i;->l(Ljava/nio/file/Path;)Ljava/nio/file/Path;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    invoke-static {v0}, Lio/flutter/plugin/editing/i;->i(Ljava/nio/file/Path;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-static {v0}, Lorg/apache/tika/utils/ProcessUtils;->escapeCommandLine(Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesClient;->pipesConfig:Lorg/apache/tika/pipes/PipesConfigBase;

    .line 230
    .line 231
    invoke-virtual {v0}, Lorg/apache/tika/pipes/PipesConfigBase;->getMaxForEmitBatchBytes()J

    .line 232
    .line 233
    .line 234
    move-result-wide v3

    .line 235
    invoke-static {v3, v4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesClient;->pipesConfig:Lorg/apache/tika/pipes/PipesConfigBase;

    .line 243
    .line 244
    invoke-virtual {v0}, Lorg/apache/tika/pipes/PipesConfigBase;->getTimeoutMillis()J

    .line 245
    .line 246
    .line 247
    move-result-wide v3

    .line 248
    invoke-static {v3, v4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesClient;->pipesConfig:Lorg/apache/tika/pipes/PipesConfigBase;

    .line 256
    .line 257
    invoke-virtual {v0}, Lorg/apache/tika/pipes/PipesConfigBase;->getShutdownClientAfterMillis()J

    .line 258
    .line 259
    .line 260
    move-result-wide v3

    .line 261
    invoke-static {v3, v4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    sget-object v0, Lorg/apache/tika/pipes/PipesClient;->LOG:LF2/b;

    .line 269
    .line 270
    iget v3, p0, Lorg/apache/tika/pipes/PipesClient;->pipesClientId:I

    .line 271
    .line 272
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    const-string v4, "pipesClientId={}: commandline: {}"

    .line 277
    .line 278
    invoke-interface {v0, v3, v1, v4}, LF2/b;->w(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    new-array v0, v2, [Ljava/lang/String;

    .line 282
    .line 283
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    check-cast v0, [Ljava/lang/String;

    .line 288
    .line 289
    return-object v0
.end method

.method private static getMsg(Ljava/lang/String;Lx2/c;)Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p1}, Lx2/c;->b()[B

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-direct {v1, p1, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v1}, Lorg/apache/tika/utils/StringUtils;->isBlank(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string p0, "So far, I\'ve read: >"

    .line 31
    .line 32
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string p0, "<"

    .line 39
    .line 40
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method

.method private lambda$actuallyProcess$0(Lorg/apache/tika/pipes/FetchEmitTuple;J[Lorg/apache/tika/pipes/PipesResult;)Lorg/apache/tika/pipes/PipesResult;
    .locals 5

    .line 1
    sget v0, Lx2/c;->p:I

    .line 2
    .line 3
    new-instance v0, Lw2/e;

    .line 4
    .line 5
    invoke-direct {v0}, Lt2/d;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lx2/c;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Lx2/c;-><init>(Lw2/e;)V

    .line 11
    .line 12
    .line 13
    new-instance v0, Ljava/io/ObjectOutputStream;

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 16
    .line 17
    .line 18
    :try_start_0
    invoke-virtual {v0, p1}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/io/ObjectOutputStream;->close()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Lx2/c;->b()[B

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v1, p0, Lorg/apache/tika/pipes/PipesClient;->output:Ljava/io/DataOutputStream;

    .line 29
    .line 30
    sget-object v2, Lorg/apache/tika/pipes/PipesServer$STATUS;->CALL:Lorg/apache/tika/pipes/PipesServer$STATUS;

    .line 31
    .line 32
    invoke-virtual {v2}, Lorg/apache/tika/pipes/PipesServer$STATUS;->getByte()B

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-virtual {v1, v2}, Ljava/io/DataOutputStream;->write(I)V

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, Lorg/apache/tika/pipes/PipesClient;->output:Ljava/io/DataOutputStream;

    .line 40
    .line 41
    array-length v2, v0

    .line 42
    invoke-virtual {v1, v2}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Lorg/apache/tika/pipes/PipesClient;->output:Ljava/io/DataOutputStream;

    .line 46
    .line 47
    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesClient;->output:Ljava/io/DataOutputStream;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V

    .line 53
    .line 54
    .line 55
    sget-object v0, Lorg/apache/tika/pipes/PipesClient;->LOG:LF2/b;

    .line 56
    .line 57
    invoke-interface {v0}, LF2/b;->v()Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_0

    .line 62
    .line 63
    iget v1, p0, Lorg/apache/tika/pipes/PipesClient;->pipesClientId:I

    .line 64
    .line 65
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 70
    .line 71
    .line 72
    move-result-wide v2

    .line 73
    sub-long/2addr v2, p2

    .line 74
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    const-string v3, "pipesClientId={}: timer -- write tuple: {} ms"

    .line 79
    .line 80
    invoke-interface {v0, v3, v1, v2}, LF2/b;->y(Ljava/lang/String;Ljava/lang/Object;Ljava/io/Serializable;)V

    .line 81
    .line 82
    .line 83
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 84
    .line 85
    .line 86
    move-result-wide v0

    .line 87
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {v2}, Ljava/lang/Thread;->isInterrupted()Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-nez v2, :cond_5

    .line 96
    .line 97
    invoke-direct {p0, p1, p2, p3}, Lorg/apache/tika/pipes/PipesClient;->readResults(Lorg/apache/tika/pipes/FetchEmitTuple;J)Lorg/apache/tika/pipes/PipesResult;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    :goto_0
    invoke-virtual {v2}, Lorg/apache/tika/pipes/PipesResult;->getStatus()Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    sget-object v4, Lorg/apache/tika/pipes/PipesResult$STATUS;->INTERMEDIATE_RESULT:Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 106
    .line 107
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    if-eqz v3, :cond_1

    .line 112
    .line 113
    const/4 v3, 0x0

    .line 114
    aput-object v2, p4, v3

    .line 115
    .line 116
    invoke-direct {p0, p1, p2, p3}, Lorg/apache/tika/pipes/PipesClient;->readResults(Lorg/apache/tika/pipes/FetchEmitTuple;J)Lorg/apache/tika/pipes/PipesResult;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    goto :goto_0

    .line 121
    :cond_1
    sget-object p1, Lorg/apache/tika/pipes/PipesClient;->LOG:LF2/b;

    .line 122
    .line 123
    invoke-interface {p1}, LF2/b;->d()Z

    .line 124
    .line 125
    .line 126
    move-result p2

    .line 127
    if-eqz p2, :cond_2

    .line 128
    .line 129
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 130
    .line 131
    .line 132
    move-result-wide p2

    .line 133
    sub-long/2addr p2, v0

    .line 134
    const-string v3, "finished reading result in {} ms"

    .line 135
    .line 136
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    invoke-interface {p1, p2, v3}, LF2/b;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    :cond_2
    invoke-interface {p1}, LF2/b;->v()Z

    .line 144
    .line 145
    .line 146
    move-result p2

    .line 147
    if-eqz p2, :cond_3

    .line 148
    .line 149
    iget p2, p0, Lorg/apache/tika/pipes/PipesClient;->pipesClientId:I

    .line 150
    .line 151
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 156
    .line 157
    .line 158
    move-result-wide v3

    .line 159
    sub-long/2addr v3, v0

    .line 160
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 161
    .line 162
    .line 163
    move-result-object p3

    .line 164
    const-string v0, "pipesClientId={}: timer -- read result: {} ms"

    .line 165
    .line 166
    invoke-interface {p1, v0, p2, p3}, LF2/b;->y(Ljava/lang/String;Ljava/lang/Object;Ljava/io/Serializable;)V

    .line 167
    .line 168
    .line 169
    :cond_3
    invoke-virtual {v2}, Lorg/apache/tika/pipes/PipesResult;->getStatus()Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    sget-object p2, Lorg/apache/tika/pipes/PipesResult$STATUS;->OOM:Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 174
    .line 175
    if-ne p1, p2, :cond_4

    .line 176
    .line 177
    invoke-direct {p0, v2, p4}, Lorg/apache/tika/pipes/PipesClient;->buildFatalResult(Lorg/apache/tika/pipes/PipesResult;[Lorg/apache/tika/pipes/PipesResult;)Lorg/apache/tika/pipes/PipesResult;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    return-object p1

    .line 182
    :cond_4
    return-object v2

    .line 183
    :cond_5
    new-instance p1, Ljava/lang/InterruptedException;

    .line 184
    .line 185
    const-string p2, "thread interrupt"

    .line 186
    .line 187
    invoke-direct {p1, p2}, Ljava/lang/InterruptedException;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    throw p1

    .line 191
    :catchall_0
    move-exception p1

    .line 192
    :try_start_1
    invoke-virtual {v0}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 193
    .line 194
    .line 195
    goto :goto_1

    .line 196
    :catchall_1
    move-exception p2

    .line 197
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 198
    .line 199
    .line 200
    :goto_1
    throw p1
.end method

.method private lambda$restart$1(Lx2/c;)Ljava/lang/Integer;
    .locals 6

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesClient;->input:Ljava/io/DataInputStream;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    move v2, v1

    .line 9
    :goto_0
    const-string v3, "pipesClientId="

    .line 10
    .line 11
    const/16 v4, 0x4e20

    .line 12
    .line 13
    if-ge v2, v4, :cond_1

    .line 14
    .line 15
    sget-object v5, Lorg/apache/tika/pipes/PipesServer$STATUS;->READY:Lorg/apache/tika/pipes/PipesServer$STATUS;

    .line 16
    .line 17
    invoke-virtual {v5}, Lorg/apache/tika/pipes/PipesServer$STATUS;->getByte()B

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    if-eq v0, v5, :cond_1

    .line 22
    .line 23
    const/4 v4, -0x1

    .line 24
    if-eq v0, v4, :cond_0

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Lx2/c;->write(I)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesClient;->input:Ljava/io/DataInputStream;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    .line 39
    .line 40
    iget v1, p0, Lorg/apache/tika/pipes/PipesClient;->pipesClientId:I

    .line 41
    .line 42
    iget-object v2, p0, Lorg/apache/tika/pipes/PipesClient;->process:Ljava/lang/Process;

    .line 43
    .line 44
    invoke-static {v2}, Lorg/apache/tika/fork/a;->A(Ljava/lang/Process;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    new-instance v4, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v1, ": Couldn\'t start server -- read EOF before \'ready\' byte.\n process isAlive="

    .line 57
    .line 58
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-static {v1, p1}, Lorg/apache/tika/pipes/PipesClient;->getMsg(Ljava/lang/String;Lx2/c;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v0

    .line 76
    :cond_1
    if-ge v2, v4, :cond_3

    .line 77
    .line 78
    iget v0, p1, Lx2/c;->l:I

    .line 79
    .line 80
    if-lez v0, :cond_2

    .line 81
    .line 82
    sget-object v0, Lorg/apache/tika/pipes/PipesClient;->LOG:LF2/b;

    .line 83
    .line 84
    iget v2, p0, Lorg/apache/tika/pipes/PipesClient;->pipesClientId:I

    .line 85
    .line 86
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 91
    .line 92
    new-instance v4, Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {p1}, Lx2/c;->b()[B

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-direct {v4, p1, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 99
    .line 100
    .line 101
    const-string p1, "pipesClientId={}: From forked process before start byte: {}"

    .line 102
    .line 103
    invoke-interface {v0, v2, v4, p1}, LF2/b;->r(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    :cond_2
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    return-object p1

    .line 111
    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    .line 112
    .line 113
    iget v1, p0, Lorg/apache/tika/pipes/PipesClient;->pipesClientId:I

    .line 114
    .line 115
    const-string v2, ": Couldn\'t start server: read too many bytes before \'ready\' byte.\n Make absolutely certain that your logger is not writing to stdout.\n"

    .line 116
    .line 117
    invoke-static {v3, v1, v2}, LB1/e;->h(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-static {v1, p1}, Lorg/apache/tika/pipes/PipesClient;->getMsg(Ljava/lang/String;Lx2/c;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw v0
.end method

.method private pauseThenDestroy()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesClient;->process:Ljava/lang/Process;

    .line 2
    .line 3
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 4
    .line 5
    invoke-static {v0}, Lorg/apache/tika/fork/a;->B(Ljava/lang/Process;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lorg/apache/tika/pipes/PipesClient;->destroyForcibly()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    invoke-direct {p0}, Lorg/apache/tika/pipes/PipesClient;->destroyForcibly()V

    .line 14
    .line 15
    .line 16
    throw v0
.end method

.method private ping()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesClient;->process:Ljava/lang/Process;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-static {v0}, Lorg/apache/tika/fork/a;->A(Ljava/lang/Process;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    :try_start_0
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesClient;->output:Ljava/io/DataOutputStream;

    .line 13
    .line 14
    sget-object v1, Lorg/apache/tika/pipes/PipesServer$STATUS;->PING:Lorg/apache/tika/pipes/PipesServer$STATUS;

    .line 15
    .line 16
    invoke-virtual {v1}, Lorg/apache/tika/pipes/PipesServer$STATUS;->getByte()B

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {v0, v2}, Ljava/io/DataOutputStream;->write(I)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesClient;->output:Ljava/io/DataOutputStream;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesClient;->input:Ljava/io/DataInputStream;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-virtual {v1}, Lorg/apache/tika/pipes/PipesServer$STATUS;->getByte()B

    .line 35
    .line 36
    .line 37
    move-result v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    if-ne v0, v1, :cond_1

    .line 39
    .line 40
    const/4 v0, 0x1

    .line 41
    return v0

    .line 42
    :catch_0
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 43
    return v0
.end method

.method private readMessage(Lorg/apache/tika/pipes/PipesResult$STATUS;)Lorg/apache/tika/pipes/PipesResult;
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesClient;->input:Ljava/io/DataInputStream;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readInt()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    new-array v0, v0, [B

    .line 8
    .line 9
    iget-object v1, p0, Lorg/apache/tika/pipes/PipesClient;->input:Ljava/io/DataInputStream;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ljava/io/DataInputStream;->readFully([B)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Ljava/lang/String;

    .line 15
    .line 16
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 17
    .line 18
    invoke-direct {v1, v0, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Lorg/apache/tika/pipes/PipesResult;

    .line 22
    .line 23
    invoke-direct {v0, p1, v1}, Lorg/apache/tika/pipes/PipesResult;-><init>(Lorg/apache/tika/pipes/PipesResult$STATUS;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method private readResults(Lorg/apache/tika/pipes/FetchEmitTuple;J)Lorg/apache/tika/pipes/PipesResult;
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesClient;->input:Ljava/io/DataInputStream;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    sub-long/2addr v1, p2

    .line 12
    :try_start_0
    invoke-static {v0}, Lorg/apache/tika/pipes/PipesServer$STATUS;->lookup(I)Lorg/apache/tika/pipes/PipesServer$STATUS;

    .line 13
    .line 14
    .line 15
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    sget-object p3, Lorg/apache/tika/pipes/PipesClient$1;->$SwitchMap$org$apache$tika$pipes$PipesServer$STATUS:[I

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    aget p3, p3, v0

    .line 23
    .line 24
    packed-switch p3, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    new-instance p1, Ljava/io/IOException;

    .line 28
    .line 29
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    const-string p3, "Need to handle procesing for: "

    .line 34
    .line 35
    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p1

    .line 43
    :pswitch_0
    new-instance p1, Ljava/io/IOException;

    .line 44
    .line 45
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    const-string p3, "Not expecting this status: "

    .line 50
    .line 51
    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :pswitch_1
    sget-object p1, Lorg/apache/tika/pipes/PipesResult;->EMPTY_OUTPUT:Lorg/apache/tika/pipes/PipesResult;

    .line 60
    .line 61
    return-object p1

    .line 62
    :pswitch_2
    sget-object p1, Lorg/apache/tika/pipes/PipesResult$STATUS;->EMIT_SUCCESS_PARSE_EXCEPTION:Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 63
    .line 64
    invoke-direct {p0, p1}, Lorg/apache/tika/pipes/PipesClient;->readMessage(Lorg/apache/tika/pipes/PipesResult$STATUS;)Lorg/apache/tika/pipes/PipesResult;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    return-object p1

    .line 69
    :pswitch_3
    sget-object p2, Lorg/apache/tika/pipes/PipesClient;->LOG:LF2/b;

    .line 70
    .line 71
    iget p3, p0, Lorg/apache/tika/pipes/PipesClient;->pipesClientId:I

    .line 72
    .line 73
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object p3

    .line 77
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getId()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    filled-new-array {p3, p1, v0}, [Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    const-string p3, "pipesClientId={} emit success: {} in {} ms"

    .line 90
    .line 91
    invoke-interface {p2, p3, p1}, LF2/b;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    sget-object p1, Lorg/apache/tika/pipes/PipesResult;->EMIT_SUCCESS:Lorg/apache/tika/pipes/PipesResult;

    .line 95
    .line 96
    return-object p1

    .line 97
    :pswitch_4
    sget-object p1, Lorg/apache/tika/pipes/PipesResult$STATUS;->PARSE_EXCEPTION_NO_EMIT:Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 98
    .line 99
    invoke-direct {p0, p1}, Lorg/apache/tika/pipes/PipesClient;->readMessage(Lorg/apache/tika/pipes/PipesResult$STATUS;)Lorg/apache/tika/pipes/PipesResult;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    return-object p1

    .line 104
    :pswitch_5
    sget-object p2, Lorg/apache/tika/pipes/PipesClient;->LOG:LF2/b;

    .line 105
    .line 106
    iget p3, p0, Lorg/apache/tika/pipes/PipesClient;->pipesClientId:I

    .line 107
    .line 108
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object p3

    .line 112
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getId()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    filled-new-array {p3, p1, v0}, [Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    const-string p3, "pipesClientId={} parse success: {} in {} ms"

    .line 125
    .line 126
    invoke-interface {p2, p3, p1}, LF2/b;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    invoke-direct {p0}, Lorg/apache/tika/pipes/PipesClient;->deserializeEmitData()Lorg/apache/tika/pipes/PipesResult;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    return-object p1

    .line 134
    :pswitch_6
    sget-object p2, Lorg/apache/tika/pipes/PipesClient;->LOG:LF2/b;

    .line 135
    .line 136
    iget p3, p0, Lorg/apache/tika/pipes/PipesClient;->pipesClientId:I

    .line 137
    .line 138
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object p3

    .line 142
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getId()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    filled-new-array {p3, v0, v1}, [Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p3

    .line 154
    const-string v0, "pipesClientId={} intermediate success: {} in {} ms"

    .line 155
    .line 156
    invoke-interface {p2, v0, p3}, LF2/b;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getEmitKey()Lorg/apache/tika/pipes/emitter/EmitKey;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getParseContext()Lorg/apache/tika/parser/ParseContext;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-direct {p0, p2, p1}, Lorg/apache/tika/pipes/PipesClient;->deserializeIntermediateResult(Lorg/apache/tika/pipes/emitter/EmitKey;Lorg/apache/tika/parser/ParseContext;)Lorg/apache/tika/pipes/PipesResult;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    return-object p1

    .line 172
    :pswitch_7
    sget-object p2, Lorg/apache/tika/pipes/PipesClient;->LOG:LF2/b;

    .line 173
    .line 174
    iget p3, p0, Lorg/apache/tika/pipes/PipesClient;->pipesClientId:I

    .line 175
    .line 176
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 177
    .line 178
    .line 179
    move-result-object p3

    .line 180
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getId()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    filled-new-array {p3, p1, v0}, [Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    const-string p3, "pipesClientId={} fetch exception: {} in {} ms"

    .line 193
    .line 194
    invoke-interface {p2, p3, p1}, LF2/b;->q(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    sget-object p1, Lorg/apache/tika/pipes/PipesResult$STATUS;->FETCH_EXCEPTION:Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 198
    .line 199
    invoke-direct {p0, p1}, Lorg/apache/tika/pipes/PipesClient;->readMessage(Lorg/apache/tika/pipes/PipesResult$STATUS;)Lorg/apache/tika/pipes/PipesResult;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    return-object p1

    .line 204
    :pswitch_8
    sget-object p2, Lorg/apache/tika/pipes/PipesClient;->LOG:LF2/b;

    .line 205
    .line 206
    iget p3, p0, Lorg/apache/tika/pipes/PipesClient;->pipesClientId:I

    .line 207
    .line 208
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 209
    .line 210
    .line 211
    move-result-object p3

    .line 212
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getId()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    filled-new-array {p3, p1, v0}, [Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    const-string p3, "pipesClientId={} fetcher initialization exception: {} in {} ms"

    .line 225
    .line 226
    invoke-interface {p2, p3, p1}, LF2/b;->q(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    sget-object p1, Lorg/apache/tika/pipes/PipesResult$STATUS;->FETCHER_INITIALIZATION_EXCEPTION:Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 230
    .line 231
    invoke-direct {p0, p1}, Lorg/apache/tika/pipes/PipesClient;->readMessage(Lorg/apache/tika/pipes/PipesResult$STATUS;)Lorg/apache/tika/pipes/PipesResult;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    return-object p1

    .line 236
    :pswitch_9
    sget-object p2, Lorg/apache/tika/pipes/PipesClient;->LOG:LF2/b;

    .line 237
    .line 238
    iget p3, p0, Lorg/apache/tika/pipes/PipesClient;->pipesClientId:I

    .line 239
    .line 240
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 241
    .line 242
    .line 243
    move-result-object p3

    .line 244
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getId()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    filled-new-array {p3, p1, v0}, [Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    const-string p3, "pipesClientId={} fetcher not found: {} in {} ms"

    .line 257
    .line 258
    invoke-interface {p2, p3, p1}, LF2/b;->q(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    sget-object p1, Lorg/apache/tika/pipes/PipesResult$STATUS;->NO_FETCHER_FOUND:Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 262
    .line 263
    invoke-direct {p0, p1}, Lorg/apache/tika/pipes/PipesClient;->readMessage(Lorg/apache/tika/pipes/PipesResult$STATUS;)Lorg/apache/tika/pipes/PipesResult;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    return-object p1

    .line 268
    :pswitch_a
    sget-object p2, Lorg/apache/tika/pipes/PipesClient;->LOG:LF2/b;

    .line 269
    .line 270
    iget p3, p0, Lorg/apache/tika/pipes/PipesClient;->pipesClientId:I

    .line 271
    .line 272
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 273
    .line 274
    .line 275
    move-result-object p3

    .line 276
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getId()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    filled-new-array {p3, p1, v0}, [Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object p1

    .line 288
    const-string p3, "pipesClientId={} emitter not found: {} in {} ms"

    .line 289
    .line 290
    invoke-interface {p2, p3, p1}, LF2/b;->q(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    sget-object p1, Lorg/apache/tika/pipes/PipesResult$STATUS;->NO_EMITTER_FOUND:Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 294
    .line 295
    invoke-direct {p0, p1}, Lorg/apache/tika/pipes/PipesClient;->readMessage(Lorg/apache/tika/pipes/PipesResult$STATUS;)Lorg/apache/tika/pipes/PipesResult;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    return-object p1

    .line 300
    :pswitch_b
    sget-object p2, Lorg/apache/tika/pipes/PipesClient;->LOG:LF2/b;

    .line 301
    .line 302
    iget p3, p0, Lorg/apache/tika/pipes/PipesClient;->pipesClientId:I

    .line 303
    .line 304
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 305
    .line 306
    .line 307
    move-result-object p3

    .line 308
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getId()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    filled-new-array {p3, p1, v0}, [Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object p1

    .line 320
    const-string p3, "pipesClientId={} emit exception: {} in {} ms"

    .line 321
    .line 322
    invoke-interface {p2, p3, p1}, LF2/b;->q(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    sget-object p1, Lorg/apache/tika/pipes/PipesResult$STATUS;->EMIT_EXCEPTION:Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 326
    .line 327
    invoke-direct {p0, p1}, Lorg/apache/tika/pipes/PipesClient;->readMessage(Lorg/apache/tika/pipes/PipesResult$STATUS;)Lorg/apache/tika/pipes/PipesResult;

    .line 328
    .line 329
    .line 330
    move-result-object p1

    .line 331
    return-object p1

    .line 332
    :pswitch_c
    sget-object p2, Lorg/apache/tika/pipes/PipesClient;->LOG:LF2/b;

    .line 333
    .line 334
    iget p3, p0, Lorg/apache/tika/pipes/PipesClient;->pipesClientId:I

    .line 335
    .line 336
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 337
    .line 338
    .line 339
    move-result-object p3

    .line 340
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getId()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object p1

    .line 344
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    filled-new-array {p3, p1, v0}, [Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object p1

    .line 352
    const-string p3, "pipesClientId={} server response timeout: {} in {} ms"

    .line 353
    .line 354
    invoke-interface {p2, p3, p1}, LF2/b;->q(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    sget-object p1, Lorg/apache/tika/pipes/PipesResult;->TIMEOUT:Lorg/apache/tika/pipes/PipesResult;

    .line 358
    .line 359
    return-object p1

    .line 360
    :pswitch_d
    sget-object p2, Lorg/apache/tika/pipes/PipesClient;->LOG:LF2/b;

    .line 361
    .line 362
    iget p3, p0, Lorg/apache/tika/pipes/PipesClient;->pipesClientId:I

    .line 363
    .line 364
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 365
    .line 366
    .line 367
    move-result-object p3

    .line 368
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getId()Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object p1

    .line 372
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    filled-new-array {p3, p1, v0}, [Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object p1

    .line 380
    const-string p3, "pipesClientId={} oom: {} in {} ms"

    .line 381
    .line 382
    invoke-interface {p2, p3, p1}, LF2/b;->q(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 383
    .line 384
    .line 385
    sget-object p1, Lorg/apache/tika/pipes/PipesResult;->OOM:Lorg/apache/tika/pipes/PipesResult;

    .line 386
    .line 387
    return-object p1

    .line 388
    :catch_0
    move-exception p1

    .line 389
    const/4 p2, -0x1

    .line 390
    if-le v0, p2, :cond_0

    .line 391
    .line 392
    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 393
    .line 394
    int-to-byte p3, v0

    .line 395
    invoke-static {p3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 396
    .line 397
    .line 398
    move-result-object p3

    .line 399
    filled-new-array {p3}, [Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object p3

    .line 403
    const-string v0, "%02x"

    .line 404
    .line 405
    invoke-static {p2, v0, p3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object p2

    .line 409
    goto :goto_0

    .line 410
    :cond_0
    const-string p2, "-1"

    .line 411
    .line 412
    :goto_0
    new-instance p3, Ljava/io/IOException;

    .line 413
    .line 414
    const-string v0, "problem reading response from server: "

    .line 415
    .line 416
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object p2

    .line 420
    invoke-direct {p3, p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 421
    .line 422
    .line 423
    throw p3

    .line 424
    nop

    .line 425
    :pswitch_data_0
    .packed-switch 0x1
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
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private restart()V
    .locals 10

    .line 1
    const-string v0, "pipesClientId="

    .line 2
    .line 3
    const-string v1, "pipesClientId="

    .line 4
    .line 5
    iget-object v2, p0, Lorg/apache/tika/pipes/PipesClient;->process:Ljava/lang/Process;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-eqz v2, :cond_3

    .line 9
    .line 10
    sget-object v2, Lorg/apache/tika/pipes/PipesClient;->LOG:LF2/b;

    .line 11
    .line 12
    const-string v4, "process still alive; trying to destroy it"

    .line 13
    .line 14
    invoke-interface {v2, v4}, LF2/b;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Lorg/apache/tika/pipes/PipesClient;->destroyForcibly()V

    .line 18
    .line 19
    .line 20
    iget-object v4, p0, Lorg/apache/tika/pipes/PipesClient;->process:Ljava/lang/Process;

    .line 21
    .line 22
    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 23
    .line 24
    invoke-static {v4}, Lorg/apache/tika/fork/a;->C(Ljava/lang/Process;)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-nez v4, :cond_0

    .line 29
    .line 30
    const-string v4, "pipesClientId={}: process has not yet ended"

    .line 31
    .line 32
    iget v6, p0, Lorg/apache/tika/pipes/PipesClient;->pipesClientId:I

    .line 33
    .line 34
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    invoke-interface {v2, v4, v6}, LF2/b;->x(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    iget-object v4, p0, Lorg/apache/tika/pipes/PipesClient;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 42
    .line 43
    invoke-interface {v4}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 44
    .line 45
    .line 46
    iget-object v4, p0, Lorg/apache/tika/pipes/PipesClient;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 47
    .line 48
    const-wide/16 v6, 0x1e

    .line 49
    .line 50
    invoke-interface {v4, v6, v7, v5}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-nez v4, :cond_1

    .line 55
    .line 56
    const-string v4, "pipesClientId={}: executorService has not yet shutdown"

    .line 57
    .line 58
    iget v5, p0, Lorg/apache/tika/pipes/PipesClient;->pipesClientId:I

    .line 59
    .line 60
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    invoke-interface {v2, v4, v5}, LF2/b;->x(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 65
    .line 66
    .line 67
    :cond_1
    iget-object v4, p0, Lorg/apache/tika/pipes/PipesClient;->executorServiceLock:[Ljava/lang/Object;

    .line 68
    .line 69
    monitor-enter v4

    .line 70
    :try_start_0
    iget-boolean v5, p0, Lorg/apache/tika/pipes/PipesClient;->closed:Z

    .line 71
    .line 72
    if-nez v5, :cond_2

    .line 73
    .line 74
    invoke-static {v3}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    iput-object v1, p0, Lorg/apache/tika/pipes/PipesClient;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 79
    .line 80
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    const-string v1, "pipesClientId={}: restarting process"

    .line 82
    .line 83
    iget v4, p0, Lorg/apache/tika/pipes/PipesClient;->pipesClientId:I

    .line 84
    .line 85
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-interface {v2, v1, v4}, LF2/b;->z(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :catchall_0
    move-exception v0

    .line 94
    goto :goto_0

    .line 95
    :cond_2
    :try_start_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 96
    .line 97
    iget v2, p0, Lorg/apache/tika/pipes/PipesClient;->pipesClientId:I

    .line 98
    .line 99
    new-instance v3, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string v1, ": PipesClient closed"

    .line 108
    .line 109
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw v0

    .line 120
    :goto_0
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 121
    throw v0

    .line 122
    :cond_3
    sget-object v1, Lorg/apache/tika/pipes/PipesClient;->LOG:LF2/b;

    .line 123
    .line 124
    const-string v2, "pipesClientId={}: starting process"

    .line 125
    .line 126
    iget v4, p0, Lorg/apache/tika/pipes/PipesClient;->pipesClientId:I

    .line 127
    .line 128
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    invoke-interface {v1, v2, v4}, LF2/b;->z(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 133
    .line 134
    .line 135
    :goto_1
    new-instance v1, Ljava/lang/ProcessBuilder;

    .line 136
    .line 137
    invoke-direct {p0}, Lorg/apache/tika/pipes/PipesClient;->getCommandline()[Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-direct {v1, v2}, Ljava/lang/ProcessBuilder;-><init>([Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-static {}, Lorg/apache/tika/fork/a;->c()Ljava/lang/ProcessBuilder$Redirect;

    .line 145
    .line 146
    .line 147
    invoke-static {v1}, Lorg/apache/tika/fork/a;->s(Ljava/lang/ProcessBuilder;)V

    .line 148
    .line 149
    .line 150
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/ProcessBuilder;->start()Ljava/lang/Process;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    iput-object v1, p0, Lorg/apache/tika/pipes/PipesClient;->process:Ljava/lang/Process;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    .line 155
    .line 156
    new-instance v1, Ljava/io/DataInputStream;

    .line 157
    .line 158
    iget-object v2, p0, Lorg/apache/tika/pipes/PipesClient;->process:Ljava/lang/Process;

    .line 159
    .line 160
    invoke-virtual {v2}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-direct {v1, v2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 165
    .line 166
    .line 167
    iput-object v1, p0, Lorg/apache/tika/pipes/PipesClient;->input:Ljava/io/DataInputStream;

    .line 168
    .line 169
    new-instance v1, Ljava/io/DataOutputStream;

    .line 170
    .line 171
    iget-object v2, p0, Lorg/apache/tika/pipes/PipesClient;->process:Ljava/lang/Process;

    .line 172
    .line 173
    invoke-virtual {v2}, Ljava/lang/Process;->getOutputStream()Ljava/io/OutputStream;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    invoke-direct {v1, v2}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 178
    .line 179
    .line 180
    iput-object v1, p0, Lorg/apache/tika/pipes/PipesClient;->output:Ljava/io/DataOutputStream;

    .line 181
    .line 182
    sget v1, Lx2/c;->p:I

    .line 183
    .line 184
    new-instance v1, Lw2/e;

    .line 185
    .line 186
    invoke-direct {v1}, Lt2/d;-><init>()V

    .line 187
    .line 188
    .line 189
    new-instance v2, Lx2/c;

    .line 190
    .line 191
    invoke-direct {v2, v1}, Lx2/c;-><init>(Lw2/e;)V

    .line 192
    .line 193
    .line 194
    new-instance v1, Ljava/util/concurrent/FutureTask;

    .line 195
    .line 196
    new-instance v4, Lorg/apache/tika/pipes/b;

    .line 197
    .line 198
    invoke-direct {v4, p0, v2}, Lorg/apache/tika/pipes/b;-><init>(Lorg/apache/tika/pipes/PipesClient;Lx2/c;)V

    .line 199
    .line 200
    .line 201
    invoke-direct {v1, v4}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    .line 202
    .line 203
    .line 204
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 205
    .line 206
    .line 207
    move-result-wide v4

    .line 208
    iget-object v6, p0, Lorg/apache/tika/pipes/PipesClient;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 209
    .line 210
    invoke-interface {v6, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 211
    .line 212
    .line 213
    :try_start_3
    iget-object v6, p0, Lorg/apache/tika/pipes/PipesClient;->pipesConfig:Lorg/apache/tika/pipes/PipesConfigBase;

    .line 214
    .line 215
    invoke-virtual {v6}, Lorg/apache/tika/pipes/PipesConfigBase;->getStartupTimeoutMillis()J

    .line 216
    .line 217
    .line 218
    move-result-wide v6

    .line 219
    sget-object v8, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 220
    .line 221
    invoke-virtual {v1, v6, v7, v8}, Ljava/util/concurrent/FutureTask;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 222
    .line 223
    .line 224
    invoke-virtual {v1, v3}, Ljava/util/concurrent/FutureTask;->cancel(Z)Z

    .line 225
    .line 226
    .line 227
    return-void

    .line 228
    :catchall_1
    move-exception v0

    .line 229
    goto :goto_5

    .line 230
    :catch_0
    move-exception v0

    .line 231
    goto :goto_2

    .line 232
    :catch_1
    move-exception v2

    .line 233
    goto :goto_3

    .line 234
    :catch_2
    move-exception v0

    .line 235
    goto :goto_4

    .line 236
    :goto_2
    :try_start_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 237
    .line 238
    .line 239
    move-result-wide v6

    .line 240
    sub-long/2addr v6, v4

    .line 241
    sget-object v4, Lorg/apache/tika/pipes/PipesClient;->LOG:LF2/b;

    .line 242
    .line 243
    iget v5, p0, Lorg/apache/tika/pipes/PipesClient;->pipesClientId:I

    .line 244
    .line 245
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 246
    .line 247
    .line 248
    move-result-object v5

    .line 249
    iget-object v8, p0, Lorg/apache/tika/pipes/PipesClient;->pipesConfig:Lorg/apache/tika/pipes/PipesConfigBase;

    .line 250
    .line 251
    invoke-virtual {v8}, Lorg/apache/tika/pipes/PipesConfigBase;->getStartupTimeoutMillis()J

    .line 252
    .line 253
    .line 254
    move-result-wide v8

    .line 255
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 256
    .line 257
    .line 258
    move-result-object v8

    .line 259
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 260
    .line 261
    .line 262
    move-result-object v6

    .line 263
    sget-object v7, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 264
    .line 265
    new-instance v9, Ljava/lang/String;

    .line 266
    .line 267
    invoke-virtual {v2}, Lx2/c;->b()[B

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    invoke-direct {v9, v2, v7}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 272
    .line 273
    .line 274
    filled-new-array {v5, v8, v6, v9}, [Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    invoke-interface {v4, v2}, LF2/b;->e([Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    invoke-direct {p0}, Lorg/apache/tika/pipes/PipesClient;->destroyForcibly()V

    .line 282
    .line 283
    .line 284
    throw v0

    .line 285
    :goto_3
    sget-object v4, Lorg/apache/tika/pipes/PipesClient;->LOG:LF2/b;

    .line 286
    .line 287
    iget v5, p0, Lorg/apache/tika/pipes/PipesClient;->pipesClientId:I

    .line 288
    .line 289
    new-instance v6, Ljava/lang/StringBuilder;

    .line 290
    .line 291
    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    const-string v0, ": couldn\'t start server"

    .line 298
    .line 299
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    invoke-interface {v4, v0, v2}, LF2/b;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 307
    .line 308
    .line 309
    invoke-direct {p0}, Lorg/apache/tika/pipes/PipesClient;->destroyForcibly()V

    .line 310
    .line 311
    .line 312
    new-instance v0, Ljava/lang/RuntimeException;

    .line 313
    .line 314
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 315
    .line 316
    .line 317
    throw v0

    .line 318
    :goto_4
    invoke-direct {p0}, Lorg/apache/tika/pipes/PipesClient;->destroyForcibly()V

    .line 319
    .line 320
    .line 321
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 322
    :goto_5
    invoke-virtual {v1, v3}, Ljava/util/concurrent/FutureTask;->cancel(Z)Z

    .line 323
    .line 324
    .line 325
    throw v0

    .line 326
    :catch_3
    move-exception v0

    .line 327
    sget-object v1, Lorg/apache/tika/pipes/PipesClient;->LOG:LF2/b;

    .line 328
    .line 329
    const-string v2, "failed to start client"

    .line 330
    .line 331
    invoke-interface {v1, v2, v0}, LF2/b;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 332
    .line 333
    .line 334
    new-instance v1, Lorg/apache/tika/pipes/FailedToStartClientException;

    .line 335
    .line 336
    invoke-direct {v1, v0}, Lorg/apache/tika/pipes/FailedToStartClientException;-><init>(Ljava/lang/Throwable;)V

    .line 337
    .line 338
    .line 339
    throw v1
.end method


# virtual methods
.method public close()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesClient;->process:Ljava/lang/Process;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    invoke-direct {p0}, Lorg/apache/tika/pipes/PipesClient;->destroyForcibly()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    :catch_0
    :cond_0
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesClient;->executorServiceLock:[Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_1
    iget-object v1, p0, Lorg/apache/tika/pipes/PipesClient;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception v1

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 22
    iput-boolean v1, p0, Lorg/apache/tika/pipes/PipesClient;->closed:Z

    .line 23
    .line 24
    monitor-exit v0

    .line 25
    return-void

    .line 26
    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    throw v1
.end method

.method public getFilesProcessed()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/tika/pipes/PipesClient;->filesProcessed:I

    .line 2
    .line 3
    return v0
.end method

.method public process(Lorg/apache/tika/pipes/FetchEmitTuple;)Lorg/apache/tika/pipes/PipesResult;
    .locals 5

    .line 1
    invoke-direct {p0}, Lorg/apache/tika/pipes/PipesClient;->ping()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesClient;->pipesConfig:Lorg/apache/tika/pipes/PipesConfigBase;

    .line 9
    .line 10
    invoke-virtual {v0}, Lorg/apache/tika/pipes/PipesConfigBase;->getMaxFilesProcessedPerProcess()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-lez v0, :cond_1

    .line 15
    .line 16
    iget v0, p0, Lorg/apache/tika/pipes/PipesClient;->filesProcessed:I

    .line 17
    .line 18
    iget-object v1, p0, Lorg/apache/tika/pipes/PipesClient;->pipesConfig:Lorg/apache/tika/pipes/PipesConfigBase;

    .line 19
    .line 20
    invoke-virtual {v1}, Lorg/apache/tika/pipes/PipesConfigBase;->getMaxFilesProcessedPerProcess()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-lt v0, v1, :cond_1

    .line 25
    .line 26
    sget-object v0, Lorg/apache/tika/pipes/PipesClient;->LOG:LF2/b;

    .line 27
    .line 28
    iget v1, p0, Lorg/apache/tika/pipes/PipesClient;->pipesClientId:I

    .line 29
    .line 30
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iget v2, p0, Lorg/apache/tika/pipes/PipesClient;->filesProcessed:I

    .line 35
    .line 36
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    const-string v3, "pipesClientId={}: restarting server after hitting max files: {}"

    .line 41
    .line 42
    invoke-interface {v0, v3, v1, v2}, LF2/b;->A(Ljava/lang/String;Ljava/lang/Object;Ljava/io/Serializable;)V

    .line 43
    .line 44
    .line 45
    :goto_0
    const/4 v0, 0x0

    .line 46
    :goto_1
    if-nez v0, :cond_1

    .line 47
    .line 48
    :try_start_0
    invoke-direct {p0}, Lorg/apache/tika/pipes/PipesClient;->restart()V
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    .line 50
    .line 51
    const/4 v0, 0x1

    .line 52
    goto :goto_1

    .line 53
    :catch_0
    sget-object v1, Lorg/apache/tika/pipes/PipesClient;->LOG:LF2/b;

    .line 54
    .line 55
    iget v2, p0, Lorg/apache/tika/pipes/PipesClient;->pipesClientId:I

    .line 56
    .line 57
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    iget-object v3, p0, Lorg/apache/tika/pipes/PipesClient;->pipesConfig:Lorg/apache/tika/pipes/PipesConfigBase;

    .line 62
    .line 63
    invoke-virtual {v3}, Lorg/apache/tika/pipes/PipesConfigBase;->getStartupTimeoutMillis()J

    .line 64
    .line 65
    .line 66
    move-result-wide v3

    .line 67
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    const-string v4, "pipesClientId={}: couldn\'t restart within {} ms (startupTimeoutMillis)"

    .line 72
    .line 73
    invoke-interface {v1, v2, v3, v4}, LF2/b;->r(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    iget-object v1, p0, Lorg/apache/tika/pipes/PipesClient;->pipesConfig:Lorg/apache/tika/pipes/PipesConfigBase;

    .line 77
    .line 78
    invoke-virtual {v1}, Lorg/apache/tika/pipes/PipesConfigBase;->getSleepOnStartupTimeoutMillis()J

    .line 79
    .line 80
    .line 81
    move-result-wide v1

    .line 82
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_1
    invoke-direct {p0, p1}, Lorg/apache/tika/pipes/PipesClient;->actuallyProcess(Lorg/apache/tika/pipes/FetchEmitTuple;)Lorg/apache/tika/pipes/PipesResult;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    return-object p1
.end method

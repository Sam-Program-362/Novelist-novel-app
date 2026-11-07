.class public Lorg/apache/tika/pipes/async/AsyncConfig;
.super Lorg/apache/tika/pipes/PipesConfigBase;
.source "SourceFile"


# instance fields
.field private emitIntermediateResults:Z

.field private emitMaxEstimatedBytes:J

.field private emitWithinMillis:J

.field private numEmitters:I

.field private pipesReporter:Lorg/apache/tika/pipes/PipesReporter;

.field private queueSize:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/apache/tika/pipes/PipesConfigBase;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x2710

    .line 5
    .line 6
    iput-wide v0, p0, Lorg/apache/tika/pipes/async/AsyncConfig;->emitWithinMillis:J

    .line 7
    .line 8
    const-wide/32 v0, 0x186a0

    .line 9
    .line 10
    .line 11
    iput-wide v0, p0, Lorg/apache/tika/pipes/async/AsyncConfig;->emitMaxEstimatedBytes:J

    .line 12
    .line 13
    const/16 v0, 0x2710

    .line 14
    .line 15
    iput v0, p0, Lorg/apache/tika/pipes/async/AsyncConfig;->queueSize:I

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    iput v0, p0, Lorg/apache/tika/pipes/async/AsyncConfig;->numEmitters:I

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput-boolean v0, p0, Lorg/apache/tika/pipes/async/AsyncConfig;->emitIntermediateResults:Z

    .line 22
    .line 23
    sget-object v0, Lorg/apache/tika/pipes/PipesReporter;->NO_OP_REPORTER:Lorg/apache/tika/pipes/PipesReporter;

    .line 24
    .line 25
    iput-object v0, p0, Lorg/apache/tika/pipes/async/AsyncConfig;->pipesReporter:Lorg/apache/tika/pipes/PipesReporter;

    .line 26
    .line 27
    return-void
.end method

.method public static load(Ljava/nio/file/Path;)Lorg/apache/tika/pipes/async/AsyncConfig;
    .locals 3

    .line 1
    new-instance v0, Lorg/apache/tika/pipes/async/AsyncConfig;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/apache/tika/pipes/async/AsyncConfig;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    new-array v1, v1, [Ljava/nio/file/OpenOption;

    .line 8
    .line 9
    invoke-static {p0, v1}, Lio/flutter/plugin/editing/i;->f(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/InputStream;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    :try_start_0
    const-string v2, "async"

    .line 14
    .line 15
    invoke-virtual {v0, v2, v1}, Lorg/apache/tika/config/ConfigBase;->configure(Ljava/lang/String;Ljava/io/InputStream;)Ljava/util/Set;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {v0}, Lorg/apache/tika/pipes/PipesConfigBase;->getTikaConfig()Ljava/nio/file/Path;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0, p0}, Lorg/apache/tika/pipes/PipesConfigBase;->setTikaConfig(Ljava/nio/file/Path;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-object v0

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    :try_start_1
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_1
    move-exception v0

    .line 41
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    :cond_2
    :goto_0
    throw p0
.end method


# virtual methods
.method public getEmitMaxEstimatedBytes()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lorg/apache/tika/pipes/async/AsyncConfig;->emitMaxEstimatedBytes:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getEmitWithinMillis()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lorg/apache/tika/pipes/async/AsyncConfig;->emitWithinMillis:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getNumEmitters()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/tika/pipes/async/AsyncConfig;->numEmitters:I

    .line 2
    .line 3
    return v0
.end method

.method public getPipesReporter()Lorg/apache/tika/pipes/PipesReporter;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/async/AsyncConfig;->pipesReporter:Lorg/apache/tika/pipes/PipesReporter;

    .line 2
    .line 3
    return-object v0
.end method

.method public getQueueSize()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/tika/pipes/async/AsyncConfig;->queueSize:I

    .line 2
    .line 3
    return v0
.end method

.method public isEmitIntermediateResults()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/tika/pipes/async/AsyncConfig;->emitIntermediateResults:Z

    .line 2
    .line 3
    return v0
.end method

.method public setEmitIntermediateResults(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/apache/tika/pipes/async/AsyncConfig;->emitIntermediateResults:Z

    .line 2
    .line 3
    return-void
.end method

.method public setEmitMaxEstimatedBytes(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lorg/apache/tika/pipes/async/AsyncConfig;->emitMaxEstimatedBytes:J

    .line 2
    .line 3
    return-void
.end method

.method public setEmitWithinMillis(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lorg/apache/tika/pipes/async/AsyncConfig;->emitWithinMillis:J

    .line 2
    .line 3
    return-void
.end method

.method public setNumEmitters(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/apache/tika/pipes/async/AsyncConfig;->numEmitters:I

    .line 2
    .line 3
    return-void
.end method

.method public setPipesReporter(Lorg/apache/tika/pipes/PipesReporter;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/tika/pipes/async/AsyncConfig;->pipesReporter:Lorg/apache/tika/pipes/PipesReporter;

    .line 2
    .line 3
    return-void
.end method

.method public setQueueSize(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/apache/tika/pipes/async/AsyncConfig;->queueSize:I

    .line 2
    .line 3
    return-void
.end method

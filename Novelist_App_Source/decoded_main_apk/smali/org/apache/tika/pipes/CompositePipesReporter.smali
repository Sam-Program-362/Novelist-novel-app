.class public Lorg/apache/tika/pipes/CompositePipesReporter;
.super Lorg/apache/tika/pipes/PipesReporter;
.source "SourceFile"

# interfaces
.implements Lorg/apache/tika/config/Initializable;


# instance fields
.field private pipesReporters:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/apache/tika/pipes/PipesReporter;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/apache/tika/pipes/PipesReporter;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lorg/apache/tika/pipes/CompositePipesReporter;->pipesReporters:Ljava/util/List;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public addPipesReporter(Lorg/apache/tika/pipes/PipesReporter;)V
    .locals 1
    .annotation runtime Lorg/apache/tika/config/Field;
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/CompositePipesReporter;->pipesReporters:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public checkInitialization(Lorg/apache/tika/config/InitializableProblemHandler;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lorg/apache/tika/pipes/CompositePipesReporter;->pipesReporters:Ljava/util/List;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance p1, Lorg/apache/tika/exception/TikaConfigException;

    .line 13
    .line 14
    const-string v0, "must specify at least one pipes reporter"

    .line 15
    .line 16
    invoke-direct {p1, v0}, Lorg/apache/tika/exception/TikaConfigException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1

    .line 20
    :cond_1
    new-instance p1, Lorg/apache/tika/exception/TikaConfigException;

    .line 21
    .line 22
    const-string v0, "must specify \'pipesReporters\'"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Lorg/apache/tika/exception/TikaConfigException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1
.end method

.method public close()V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/CompositePipesReporter;->pipesReporters:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Lorg/apache/tika/pipes/PipesReporter;

    .line 19
    .line 20
    :try_start_0
    invoke-virtual {v2}, Lorg/apache/tika/pipes/PipesReporter;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catch_0
    move-exception v1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    if-nez v1, :cond_1

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    throw v1
.end method

.method public error(Ljava/lang/String;)V
    .locals 2

    .line 3
    iget-object v0, p0, Lorg/apache/tika/pipes/CompositePipesReporter;->pipesReporters:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/tika/pipes/PipesReporter;

    .line 4
    invoke-virtual {v1, p1}, Lorg/apache/tika/pipes/PipesReporter;->error(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public error(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/CompositePipesReporter;->pipesReporters:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/tika/pipes/PipesReporter;

    .line 2
    invoke-virtual {v1, p1}, Lorg/apache/tika/pipes/PipesReporter;->error(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public getPipesReporters()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/apache/tika/pipes/PipesReporter;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/CompositePipesReporter;->pipesReporters:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public initialize(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lorg/apache/tika/config/Param;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public report(Lorg/apache/tika/pipes/FetchEmitTuple;Lorg/apache/tika/pipes/PipesResult;J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/CompositePipesReporter;->pipesReporters:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/tika/pipes/PipesReporter;

    .line 2
    invoke-virtual {v1, p1, p2, p3, p4}, Lorg/apache/tika/pipes/PipesReporter;->report(Lorg/apache/tika/pipes/FetchEmitTuple;Lorg/apache/tika/pipes/PipesResult;J)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public report(Lorg/apache/tika/pipes/pipesiterator/TotalCountResult;)V
    .locals 2

    .line 3
    iget-object v0, p0, Lorg/apache/tika/pipes/CompositePipesReporter;->pipesReporters:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/tika/pipes/PipesReporter;

    .line 4
    invoke-virtual {v1, p1}, Lorg/apache/tika/pipes/PipesReporter;->report(Lorg/apache/tika/pipes/pipesiterator/TotalCountResult;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public supportsTotalCount()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/CompositePipesReporter;->pipesReporters:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lorg/apache/tika/pipes/PipesReporter;

    .line 18
    .line 19
    invoke-virtual {v1}, Lorg/apache/tika/pipes/PipesReporter;->supportsTotalCount()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    return v0

    .line 27
    :cond_1
    const/4 v0, 0x0

    .line 28
    return v0
.end method

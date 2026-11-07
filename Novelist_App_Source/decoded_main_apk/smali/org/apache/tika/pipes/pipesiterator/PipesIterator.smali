.class public abstract Lorg/apache/tika/pipes/pipesiterator/PipesIterator;
.super Lorg/apache/tika/config/ConfigBase;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;
.implements Ljava/lang/Iterable;
.implements Lorg/apache/tika/config/Initializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/tika/pipes/pipesiterator/PipesIterator$TupleIterator;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/apache/tika/config/ConfigBase;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Integer;",
        ">;",
        "Ljava/lang/Iterable<",
        "Lorg/apache/tika/pipes/FetchEmitTuple;",
        ">;",
        "Lorg/apache/tika/config/Initializable;"
    }
.end annotation


# static fields
.field public static final COMPLETED_SEMAPHORE:Lorg/apache/tika/pipes/FetchEmitTuple;

.field public static final DEFAULT_MAX_WAIT_MS:J = 0x493e0L

.field public static final DEFAULT_QUEUE_SIZE:I = 0x3e8

.field private static final LOGGER:LF2/b;


# instance fields
.field private added:I

.field private emitterName:Ljava/lang/String;

.field private fetcherName:Ljava/lang/String;

.field private futureTask:Ljava/util/concurrent/FutureTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/FutureTask<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private handlerType:Lorg/apache/tika/sax/BasicContentHandlerFactory$HANDLER_TYPE;

.field private maxEmbeddedResources:I

.field private maxWaitMs:J

.field private onParseException:Lorg/apache/tika/pipes/FetchEmitTuple$ON_PARSE_EXCEPTION;

.field private parseMode:Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;

.field private queue:Ljava/util/concurrent/ArrayBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ArrayBlockingQueue<",
            "Lorg/apache/tika/pipes/FetchEmitTuple;",
            ">;"
        }
    .end annotation
.end field

.field private queueSize:I

.field private throwOnWriteLimitReached:Z

.field private writeLimit:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lorg/apache/tika/pipes/FetchEmitTuple;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    const/4 v6, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    invoke-direct/range {v0 .. v6}, Lorg/apache/tika/pipes/FetchEmitTuple;-><init>(Ljava/lang/String;Lorg/apache/tika/pipes/fetcher/FetchKey;Lorg/apache/tika/pipes/emitter/EmitKey;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;Lorg/apache/tika/pipes/FetchEmitTuple$ON_PARSE_EXCEPTION;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->COMPLETED_SEMAPHORE:Lorg/apache/tika/pipes/FetchEmitTuple;

    .line 13
    .line 14
    const-class v0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;

    .line 15
    .line 16
    invoke-static {v0}, LF2/d;->b(Ljava/lang/Class;)LF2/b;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sput-object v0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->LOGGER:LF2/b;

    .line 21
    .line 22
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/apache/tika/config/ConfigBase;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/32 v0, 0x493e0

    .line 5
    .line 6
    .line 7
    iput-wide v0, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->maxWaitMs:J

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->queue:Ljava/util/concurrent/ArrayBlockingQueue;

    .line 11
    .line 12
    const/16 v0, 0x3e8

    .line 13
    .line 14
    iput v0, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->queueSize:I

    .line 15
    .line 16
    sget-object v0, Lorg/apache/tika/pipes/FetchEmitTuple$ON_PARSE_EXCEPTION;->EMIT:Lorg/apache/tika/pipes/FetchEmitTuple$ON_PARSE_EXCEPTION;

    .line 17
    .line 18
    iput-object v0, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->onParseException:Lorg/apache/tika/pipes/FetchEmitTuple$ON_PARSE_EXCEPTION;

    .line 19
    .line 20
    sget-object v0, Lorg/apache/tika/sax/BasicContentHandlerFactory$HANDLER_TYPE;->TEXT:Lorg/apache/tika/sax/BasicContentHandlerFactory$HANDLER_TYPE;

    .line 21
    .line 22
    iput-object v0, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->handlerType:Lorg/apache/tika/sax/BasicContentHandlerFactory$HANDLER_TYPE;

    .line 23
    .line 24
    sget-object v0, Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;->RMETA:Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;

    .line 25
    .line 26
    iput-object v0, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->parseMode:Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    iput-boolean v0, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->throwOnWriteLimitReached:Z

    .line 30
    .line 31
    const/4 v1, -0x1

    .line 32
    iput v1, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->writeLimit:I

    .line 33
    .line 34
    iput v1, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->maxEmbeddedResources:I

    .line 35
    .line 36
    iput v0, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->added:I

    .line 37
    .line 38
    return-void
.end method

.method public static bridge synthetic a(Lorg/apache/tika/pipes/pipesiterator/PipesIterator;)Ljava/util/concurrent/FutureTask;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->futureTask:Ljava/util/concurrent/FutureTask;

    return-object p0
.end method

.method public static bridge synthetic b(Lorg/apache/tika/pipes/pipesiterator/PipesIterator;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->maxWaitMs:J

    return-wide v0
.end method

.method public static build(Ljava/nio/file/Path;)Lorg/apache/tika/pipes/pipesiterator/PipesIterator;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/nio/file/OpenOption;

    .line 3
    .line 4
    invoke-static {p0, v0}, Lio/flutter/plugin/editing/i;->f(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/InputStream;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    :try_start_0
    const-string v0, "pipesIterator"

    .line 9
    .line 10
    const-class v1, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;

    .line 11
    .line 12
    invoke-static {v0, v1, p0}, Lorg/apache/tika/config/ConfigBase;->buildSingle(Ljava/lang/String;Ljava/lang/Class;Ljava/io/InputStream;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-object v0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    if-eqz p0, :cond_1

    .line 26
    .line 27
    :try_start_1
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_1
    move-exception p0

    .line 32
    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    :goto_0
    throw v0
.end method

.method public static bridge synthetic c(Lorg/apache/tika/pipes/pipesiterator/PipesIterator;)Ljava/util/concurrent/ArrayBlockingQueue;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->queue:Ljava/util/concurrent/ArrayBlockingQueue;

    return-object p0
.end method

.method public static bridge synthetic d()LF2/b;
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->LOGGER:LF2/b;

    return-object v0
.end method


# virtual methods
.method public call()Ljava/lang/Integer;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->enqueue()V

    .line 3
    sget-object v0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->COMPLETED_SEMAPHORE:Lorg/apache/tika/pipes/FetchEmitTuple;

    invoke-virtual {p0, v0}, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->tryToAdd(Lorg/apache/tika/pipes/FetchEmitTuple;)V

    .line 4
    iget v0, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->added:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->call()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public checkInitialization(Lorg/apache/tika/config/InitializableProblemHandler;)V
    .locals 0

    return-void
.end method

.method public abstract enqueue()V
.end method

.method public getEmitterName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->emitterName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getFetcherName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->fetcherName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getHandlerConfig()Lorg/apache/tika/pipes/HandlerConfig;
    .locals 6

    .line 1
    new-instance v0, Lorg/apache/tika/pipes/HandlerConfig;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->handlerType:Lorg/apache/tika/sax/BasicContentHandlerFactory$HANDLER_TYPE;

    .line 4
    .line 5
    iget-object v2, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->parseMode:Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;

    .line 6
    .line 7
    iget v3, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->writeLimit:I

    .line 8
    .line 9
    iget v4, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->maxEmbeddedResources:I

    .line 10
    .line 11
    iget-boolean v5, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->throwOnWriteLimitReached:Z

    .line 12
    .line 13
    invoke-direct/range {v0 .. v5}, Lorg/apache/tika/pipes/HandlerConfig;-><init>(Lorg/apache/tika/sax/BasicContentHandlerFactory$HANDLER_TYPE;Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;IIZ)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public getOnParseException()Lorg/apache/tika/pipes/FetchEmitTuple$ON_PARSE_EXCEPTION;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->onParseException:Lorg/apache/tika/pipes/FetchEmitTuple$ON_PARSE_EXCEPTION;

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

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lorg/apache/tika/pipes/FetchEmitTuple;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->futureTask:Ljava/util/concurrent/FutureTask;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/concurrent/FutureTask;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->futureTask:Ljava/util/concurrent/FutureTask;

    .line 11
    .line 12
    new-instance v0, Ljava/util/concurrent/ArrayBlockingQueue;

    .line 13
    .line 14
    iget v1, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->queueSize:I

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->queue:Ljava/util/concurrent/ArrayBlockingQueue;

    .line 20
    .line 21
    new-instance v0, Ljava/lang/Thread;

    .line 22
    .line 23
    iget-object v1, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->futureTask:Ljava/util/concurrent/FutureTask;

    .line 24
    .line 25
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 29
    .line 30
    .line 31
    new-instance v0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator$TupleIterator;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-direct {v0, p0, v1}, Lorg/apache/tika/pipes/pipesiterator/PipesIterator$TupleIterator;-><init>(Lorg/apache/tika/pipes/pipesiterator/PipesIterator;I)V

    .line 35
    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    const-string v1, "Can\'t call iterator more than once!"

    .line 41
    .line 42
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v0
.end method

.method public setEmitterName(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lorg/apache/tika/config/Field;
    .end annotation

    .line 1
    iput-object p1, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->emitterName:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setFetcherName(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lorg/apache/tika/config/Field;
    .end annotation

    .line 1
    iput-object p1, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->fetcherName:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setHandlerType(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lorg/apache/tika/config/Field;
    .end annotation

    .line 1
    sget-object v0, Lorg/apache/tika/sax/BasicContentHandlerFactory$HANDLER_TYPE;->TEXT:Lorg/apache/tika/sax/BasicContentHandlerFactory$HANDLER_TYPE;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lorg/apache/tika/sax/BasicContentHandlerFactory;->parseHandlerType(Ljava/lang/String;Lorg/apache/tika/sax/BasicContentHandlerFactory$HANDLER_TYPE;)Lorg/apache/tika/sax/BasicContentHandlerFactory$HANDLER_TYPE;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iput-object p1, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->handlerType:Lorg/apache/tika/sax/BasicContentHandlerFactory$HANDLER_TYPE;

    .line 8
    .line 9
    return-void
.end method

.method public setMaxEmbeddedResources(I)V
    .locals 0
    .annotation runtime Lorg/apache/tika/config/Field;
    .end annotation

    .line 1
    iput p1, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->maxEmbeddedResources:I

    .line 2
    .line 3
    return-void
.end method

.method public setMaxWaitMs(J)V
    .locals 0
    .annotation runtime Lorg/apache/tika/config/Field;
    .end annotation

    .line 1
    iput-wide p1, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->maxWaitMs:J

    .line 2
    .line 3
    return-void
.end method

.method public setOnParseException(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Lorg/apache/tika/config/Field;
    .end annotation

    .line 1
    const-string v0, "skip"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    sget-object p1, Lorg/apache/tika/pipes/FetchEmitTuple$ON_PARSE_EXCEPTION;->SKIP:Lorg/apache/tika/pipes/FetchEmitTuple$ON_PARSE_EXCEPTION;

    invoke-virtual {p0, p1}, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->setOnParseException(Lorg/apache/tika/pipes/FetchEmitTuple$ON_PARSE_EXCEPTION;)V

    return-void

    .line 3
    :cond_0
    const-string v0, "emit"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    sget-object p1, Lorg/apache/tika/pipes/FetchEmitTuple$ON_PARSE_EXCEPTION;->EMIT:Lorg/apache/tika/pipes/FetchEmitTuple$ON_PARSE_EXCEPTION;

    invoke-virtual {p0, p1}, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->setOnParseException(Lorg/apache/tika/pipes/FetchEmitTuple$ON_PARSE_EXCEPTION;)V

    return-void

    .line 5
    :cond_1
    new-instance v0, Lorg/apache/tika/exception/TikaConfigException;

    const-string v1, "must be either \'skip\' or \'emit\': "

    .line 6
    invoke-static {v1, p1}, Lt/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 7
    invoke-direct {v0, p1}, Lorg/apache/tika/exception/TikaConfigException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public setOnParseException(Lorg/apache/tika/pipes/FetchEmitTuple$ON_PARSE_EXCEPTION;)V
    .locals 0

    .line 12
    iput-object p1, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->onParseException:Lorg/apache/tika/pipes/FetchEmitTuple$ON_PARSE_EXCEPTION;

    return-void
.end method

.method public setParseMode(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lorg/apache/tika/config/Field;
    .end annotation

    .line 1
    invoke-static {p1}, Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;->parseMode(Ljava/lang/String;)Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->setParseMode(Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;)V

    return-void
.end method

.method public setParseMode(Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->parseMode:Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;

    return-void
.end method

.method public setQueueSize(I)V
    .locals 0
    .annotation runtime Lorg/apache/tika/config/Field;
    .end annotation

    .line 1
    iput p1, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->queueSize:I

    .line 2
    .line 3
    return-void
.end method

.method public setThrowOnWriteLimitReached(Z)V
    .locals 0
    .annotation runtime Lorg/apache/tika/config/Field;
    .end annotation

    .line 1
    iput-boolean p1, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->throwOnWriteLimitReached:Z

    .line 2
    .line 3
    return-void
.end method

.method public setWriteLimit(I)V
    .locals 0
    .annotation runtime Lorg/apache/tika/config/Field;
    .end annotation

    .line 1
    iput p1, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->writeLimit:I

    .line 2
    .line 3
    return-void
.end method

.method public tryToAdd(Lorg/apache/tika/pipes/FetchEmitTuple;)V
    .locals 4

    .line 1
    iget v0, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->added:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->added:I

    .line 6
    .line 7
    iget-object v0, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->queue:Ljava/util/concurrent/ArrayBlockingQueue;

    .line 8
    .line 9
    iget-wide v1, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->maxWaitMs:J

    .line 10
    .line 11
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 12
    .line 13
    invoke-virtual {v0, p1, v1, v2, v3}, Ljava/util/concurrent/ArrayBlockingQueue;->offer(Ljava/lang/Object;JLjava/util/concurrent/TimeUnit;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    new-instance p1, Ljava/util/concurrent/TimeoutException;

    .line 21
    .line 22
    const-string v0, "timed out while offering"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1
.end method

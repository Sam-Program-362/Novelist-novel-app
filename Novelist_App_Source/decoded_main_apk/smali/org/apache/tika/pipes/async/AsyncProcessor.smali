.class public Lorg/apache/tika/pipes/async/AsyncProcessor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/tika/pipes/async/AsyncProcessor$FetchEmitWorker;
    }
.end annotation


# static fields
.field private static final LOG:LF2/b;

.field private static MAX_OFFER_WAIT_MS:J = 0x0L

.field static final PARSER_FUTURE_CODE:I = 0x1

.field static final WATCHER_FUTURE_CODE:I = 0x3


# instance fields
.field private addedEmitterSemaphores:Z

.field private final asyncConfig:Lorg/apache/tika/pipes/async/AsyncConfig;

.field private final emitData:Ljava/util/concurrent/ArrayBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ArrayBlockingQueue<",
            "Lorg/apache/tika/pipes/emitter/EmitData;",
            ">;"
        }
    .end annotation
.end field

.field private final executorCompletionService:Ljava/util/concurrent/ExecutorCompletionService;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ExecutorCompletionService<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final executorService:Ljava/util/concurrent/ExecutorService;

.field private final fetchEmitTuples:Ljava/util/concurrent/ArrayBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ArrayBlockingQueue<",
            "Lorg/apache/tika/pipes/FetchEmitTuple;",
            ">;"
        }
    .end annotation
.end field

.field isShuttingDown:Z

.field private volatile numEmitterThreadsFinished:I

.field private volatile numParserThreadsFinished:I

.field private final totalProcessed:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Lorg/apache/tika/pipes/async/AsyncProcessor;

    .line 2
    .line 3
    invoke-static {v0}, LF2/d;->b(Ljava/lang/Class;)LF2/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lorg/apache/tika/pipes/async/AsyncProcessor;->LOG:LF2/b;

    .line 8
    .line 9
    const-wide/32 v0, 0x1d4c0

    .line 10
    .line 11
    .line 12
    sput-wide v0, Lorg/apache/tika/pipes/async/AsyncProcessor;->MAX_OFFER_WAIT_MS:J

    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Ljava/nio/file/Path;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lorg/apache/tika/pipes/async/AsyncProcessor;-><init>(Ljava/nio/file/Path;Lorg/apache/tika/pipes/pipesiterator/PipesIterator;)V

    return-void
.end method

.method public constructor <init>(Ljava/nio/file/Path;Lorg/apache/tika/pipes/pipesiterator/PipesIterator;)V
    .locals 7

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->totalProcessed:Ljava/util/concurrent/atomic/AtomicLong;

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->numParserThreadsFinished:I

    .line 5
    iput v0, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->numEmitterThreadsFinished:I

    .line 6
    iput-boolean v0, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->addedEmitterSemaphores:Z

    .line 7
    iput-boolean v0, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->isShuttingDown:Z

    .line 8
    invoke-static {p1}, Lorg/apache/tika/pipes/async/AsyncConfig;->load(Ljava/nio/file/Path;)Lorg/apache/tika/pipes/async/AsyncConfig;

    move-result-object v1

    iput-object v1, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->asyncConfig:Lorg/apache/tika/pipes/async/AsyncConfig;

    .line 9
    new-instance v2, Ljava/util/concurrent/ArrayBlockingQueue;

    invoke-virtual {v1}, Lorg/apache/tika/pipes/async/AsyncConfig;->getQueueSize()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    iput-object v2, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->fetchEmitTuples:Ljava/util/concurrent/ArrayBlockingQueue;

    .line 10
    new-instance v2, Ljava/util/concurrent/ArrayBlockingQueue;

    const/16 v3, 0x64

    invoke-direct {v2, v3}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    iput-object v2, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->emitData:Ljava/util/concurrent/ArrayBlockingQueue;

    .line 11
    invoke-virtual {v1}, Lorg/apache/tika/pipes/PipesConfigBase;->getNumClients()I

    move-result v2

    invoke-virtual {v1}, Lorg/apache/tika/pipes/async/AsyncConfig;->getNumEmitters()I

    move-result v3

    add-int/2addr v3, v2

    add-int/lit8 v3, v3, 0x1

    .line 12
    invoke-static {v3}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    iput-object v2, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 13
    new-instance v3, Ljava/util/concurrent/ExecutorCompletionService;

    invoke-direct {v3, v2}, Ljava/util/concurrent/ExecutorCompletionService;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object v3, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->executorCompletionService:Ljava/util/concurrent/ExecutorCompletionService;

    .line 14
    :try_start_0
    invoke-static {p1}, Lio/flutter/plugin/editing/i;->l(Ljava/nio/file/Path;)Ljava/nio/file/Path;

    move-result-object v2

    invoke-virtual {v1}, Lorg/apache/tika/pipes/PipesConfigBase;->getTikaConfig()Ljava/nio/file/Path;

    move-result-object v4

    invoke-static {v4}, Lio/flutter/plugin/editing/i;->l(Ljava/nio/file/Path;)Ljava/nio/file/Path;

    move-result-object v4

    invoke-static {v2, v4}, Lorg/apache/tika/fork/a;->y(Ljava/nio/file/Path;Ljava/lang/Object;)Z

    move-result v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    if-nez v2, :cond_0

    .line 15
    :try_start_1
    sget-object v2, Lorg/apache/tika/pipes/async/AsyncProcessor;->LOG:LF2/b;

    const-string v4, "TikaConfig for AsyncProcessor ({}) is different from TikaConfig for workers ({}). If this is intended, please ignore this warning."

    .line 16
    invoke-static {p1}, Lio/flutter/plugin/editing/i;->l(Ljava/nio/file/Path;)Ljava/nio/file/Path;

    move-result-object p1

    .line 17
    invoke-virtual {v1}, Lorg/apache/tika/pipes/PipesConfigBase;->getTikaConfig()Ljava/nio/file/Path;

    move-result-object v1

    invoke-static {v1}, Lio/flutter/plugin/editing/i;->l(Ljava/nio/file/Path;)Ljava/nio/file/Path;

    move-result-object v1

    .line 18
    invoke-interface {v2, p1, v1, v4}, LF2/b;->r(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p1, v0

    move-object v2, p0

    goto :goto_4

    .line 19
    :cond_0
    :goto_0
    :try_start_2
    new-instance p1, Lorg/apache/tika/pipes/async/b;

    invoke-direct {p1, p0}, Lorg/apache/tika/pipes/async/b;-><init>(Lorg/apache/tika/pipes/async/AsyncProcessor;)V

    invoke-virtual {v3, p1}, Ljava/util/concurrent/ExecutorCompletionService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    if-eqz p2, :cond_1

    .line 20
    :try_start_3
    instance-of p1, p2, Lorg/apache/tika/pipes/pipesiterator/TotalCounter;

    if-eqz p1, :cond_1

    .line 21
    sget-object p1, Lorg/apache/tika/pipes/async/AsyncProcessor;->LOG:LF2/b;

    const-string v1, "going to total counts"

    invoke-interface {p1, v1}, LF2/b;->u(Ljava/lang/String;)V

    .line 22
    check-cast p2, Lorg/apache/tika/pipes/pipesiterator/TotalCounter;

    invoke-direct {p0, p2}, Lorg/apache/tika/pipes/async/AsyncProcessor;->startCounter(Lorg/apache/tika/pipes/pipesiterator/TotalCounter;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    :cond_1
    move p1, v0

    .line 23
    :goto_1
    :try_start_4
    iget-object p2, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->asyncConfig:Lorg/apache/tika/pipes/async/AsyncConfig;

    invoke-virtual {p2}, Lorg/apache/tika/pipes/PipesConfigBase;->getNumClients()I

    move-result p2

    if-ge p1, p2, :cond_2

    .line 24
    iget-object p2, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->executorCompletionService:Ljava/util/concurrent/ExecutorCompletionService;

    new-instance v1, Lorg/apache/tika/pipes/async/AsyncProcessor$FetchEmitWorker;

    iget-object v3, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->asyncConfig:Lorg/apache/tika/pipes/async/AsyncConfig;

    iget-object v4, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->fetchEmitTuples:Ljava/util/concurrent/ArrayBlockingQueue;

    iget-object v5, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->emitData:Ljava/util/concurrent/ArrayBlockingQueue;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    const/4 v6, 0x0

    move-object v2, p0

    :try_start_5
    invoke-direct/range {v1 .. v6}, Lorg/apache/tika/pipes/async/AsyncProcessor$FetchEmitWorker;-><init>(Lorg/apache/tika/pipes/async/AsyncProcessor;Lorg/apache/tika/pipes/async/AsyncConfig;Ljava/util/concurrent/ArrayBlockingQueue;Ljava/util/concurrent/ArrayBlockingQueue;I)V

    invoke-virtual {p2, v1}, Ljava/util/concurrent/ExecutorCompletionService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :catch_1
    move-exception v0

    :goto_2
    move-object p1, v0

    goto :goto_4

    :catch_2
    move-exception v0

    move-object v2, p0

    goto :goto_2

    :cond_2
    move-object v2, p0

    .line 25
    iget-object p1, v2, Lorg/apache/tika/pipes/async/AsyncProcessor;->asyncConfig:Lorg/apache/tika/pipes/async/AsyncConfig;

    invoke-virtual {p1}, Lorg/apache/tika/pipes/PipesConfigBase;->getTikaConfig()Ljava/nio/file/Path;

    move-result-object p1

    invoke-static {p1}, Lorg/apache/tika/pipes/emitter/EmitterManager;->load(Ljava/nio/file/Path;)Lorg/apache/tika/pipes/emitter/EmitterManager;

    move-result-object p1

    .line 26
    :goto_3
    iget-object p2, v2, Lorg/apache/tika/pipes/async/AsyncProcessor;->asyncConfig:Lorg/apache/tika/pipes/async/AsyncConfig;

    invoke-virtual {p2}, Lorg/apache/tika/pipes/async/AsyncConfig;->getNumEmitters()I

    move-result p2

    if-ge v0, p2, :cond_3

    .line 27
    iget-object p2, v2, Lorg/apache/tika/pipes/async/AsyncProcessor;->executorCompletionService:Ljava/util/concurrent/ExecutorCompletionService;

    new-instance v1, Lorg/apache/tika/pipes/async/AsyncEmitter;

    iget-object v3, v2, Lorg/apache/tika/pipes/async/AsyncProcessor;->asyncConfig:Lorg/apache/tika/pipes/async/AsyncConfig;

    iget-object v4, v2, Lorg/apache/tika/pipes/async/AsyncProcessor;->emitData:Ljava/util/concurrent/ArrayBlockingQueue;

    invoke-direct {v1, v3, v4, p1}, Lorg/apache/tika/pipes/async/AsyncEmitter;-><init>(Lorg/apache/tika/pipes/async/AsyncConfig;Ljava/util/concurrent/ArrayBlockingQueue;Lorg/apache/tika/pipes/emitter/EmitterManager;)V

    invoke-virtual {p2, v1}, Ljava/util/concurrent/ExecutorCompletionService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_3
    return-void

    .line 28
    :goto_4
    sget-object p2, Lorg/apache/tika/pipes/async/AsyncProcessor;->LOG:LF2/b;

    const-string v0, "problem initializing AsyncProcessor"

    invoke-interface {p2, v0, p1}, LF2/b;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 29
    iget-object p2, v2, Lorg/apache/tika/pipes/async/AsyncProcessor;->executorService:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p2}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 30
    iget-object p2, v2, Lorg/apache/tika/pipes/async/AsyncProcessor;->asyncConfig:Lorg/apache/tika/pipes/async/AsyncConfig;

    invoke-virtual {p2}, Lorg/apache/tika/pipes/async/AsyncConfig;->getPipesReporter()Lorg/apache/tika/pipes/PipesReporter;

    move-result-object p2

    invoke-virtual {p2, p1}, Lorg/apache/tika/pipes/PipesReporter;->error(Ljava/lang/Throwable;)V

    .line 31
    throw p1
.end method

.method public static synthetic a(Lorg/apache/tika/pipes/async/AsyncProcessor;Lorg/apache/tika/pipes/pipesiterator/TotalCounter;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lorg/apache/tika/pipes/async/AsyncProcessor;->lambda$startCounter$1(Lorg/apache/tika/pipes/pipesiterator/TotalCounter;)V

    return-void
.end method

.method public static synthetic b(Lorg/apache/tika/pipes/async/AsyncProcessor;)Ljava/lang/Integer;
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/apache/tika/pipes/async/AsyncProcessor;->lambda$new$0()Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic c(Lorg/apache/tika/pipes/async/AsyncProcessor;)Ljava/util/concurrent/atomic/AtomicLong;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->totalProcessed:Ljava/util/concurrent/atomic/AtomicLong;

    return-object p0
.end method

.method public static bridge synthetic d()LF2/b;
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/tika/pipes/async/AsyncProcessor;->LOG:LF2/b;

    return-object v0
.end method

.method public static bridge synthetic e()J
    .locals 2

    .line 1
    sget-wide v0, Lorg/apache/tika/pipes/async/AsyncProcessor;->MAX_OFFER_WAIT_MS:J

    return-wide v0
.end method

.method private synthetic lambda$new$0()Ljava/lang/Integer;
    .locals 2

    .line 1
    :goto_0
    const-wide/16 v0, 0x1f4

    .line 2
    .line 3
    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lorg/apache/tika/pipes/async/AsyncProcessor;->checkActive()Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catch_0
    const/4 v0, 0x3

    .line 11
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method private synthetic lambda$startCounter$1(Lorg/apache/tika/pipes/pipesiterator/TotalCounter;)V
    .locals 7

    .line 1
    invoke-interface {p1}, Lorg/apache/tika/pipes/pipesiterator/TotalCounter;->startTotalCount()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->asyncConfig:Lorg/apache/tika/pipes/async/AsyncConfig;

    .line 5
    .line 6
    invoke-virtual {v0}, Lorg/apache/tika/pipes/async/AsyncConfig;->getPipesReporter()Lorg/apache/tika/pipes/PipesReporter;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {p1}, Lorg/apache/tika/pipes/pipesiterator/TotalCounter;->getTotalCount()Lorg/apache/tika/pipes/pipesiterator/TotalCountResult;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Lorg/apache/tika/pipes/pipesiterator/TotalCountResult;->getStatus()Lorg/apache/tika/pipes/pipesiterator/TotalCountResult$STATUS;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :goto_0
    sget-object v2, Lorg/apache/tika/pipes/pipesiterator/TotalCountResult$STATUS;->NOT_COMPLETED:Lorg/apache/tika/pipes/pipesiterator/TotalCountResult$STATUS;

    .line 19
    .line 20
    if-ne v1, v2, :cond_0

    .line 21
    .line 22
    const-wide/16 v1, 0x1f4

    .line 23
    .line 24
    :try_start_0
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p1}, Lorg/apache/tika/pipes/pipesiterator/TotalCounter;->getTotalCount()Lorg/apache/tika/pipes/pipesiterator/TotalCountResult;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    sget-object v2, Lorg/apache/tika/pipes/async/AsyncProcessor;->LOG:LF2/b;

    .line 32
    .line 33
    const-string v3, "counter total  {} {} "

    .line 34
    .line 35
    invoke-virtual {v1}, Lorg/apache/tika/pipes/pipesiterator/TotalCountResult;->getStatus()Lorg/apache/tika/pipes/pipesiterator/TotalCountResult$STATUS;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-virtual {v1}, Lorg/apache/tika/pipes/pipesiterator/TotalCountResult;->getTotalCount()J

    .line 40
    .line 41
    .line 42
    move-result-wide v5

    .line 43
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-interface {v2, v3, v4, v5}, LF2/b;->y(Ljava/lang/String;Ljava/lang/Object;Ljava/io/Serializable;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Lorg/apache/tika/pipes/PipesReporter;->report(Lorg/apache/tika/pipes/pipesiterator/TotalCountResult;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Lorg/apache/tika/pipes/pipesiterator/TotalCountResult;->getStatus()Lorg/apache/tika/pipes/pipesiterator/TotalCountResult$STATUS;

    .line 54
    .line 55
    .line 56
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    goto :goto_0

    .line 58
    :catch_0
    :cond_0
    return-void
.end method

.method private startCounter(Lorg/apache/tika/pipes/pipesiterator/TotalCounter;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/Thread;

    .line 2
    .line 3
    new-instance v1, LM/c;

    .line 4
    .line 5
    const/16 v2, 0x12

    .line 6
    .line 7
    invoke-direct {v1, p0, p1, v2}, LM/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    invoke-virtual {v0, p1}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 18
    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public declared-synchronized checkActive()Z
    .locals 8

    .line 1
    const-string v0, "Don\'t recognize this future code: "

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-object v1, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->executorCompletionService:Ljava/util/concurrent/ExecutorCompletionService;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/concurrent/ExecutorCompletionService;->poll()Ljava/util/concurrent/Future;

    .line 7
    .line 8
    .line 9
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    const/4 v2, 0x1

    .line 11
    if-eqz v1, :cond_3

    .line 12
    .line 13
    :try_start_1
    invoke-interface {v1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eq v3, v2, :cond_2

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    if-eq v3, v4, :cond_1

    .line 27
    .line 28
    const/4 v4, 0x3

    .line 29
    if-ne v3, v4, :cond_0

    .line 30
    .line 31
    sget-object v0, Lorg/apache/tika/pipes/async/AsyncProcessor;->LOG:LF2/b;

    .line 32
    .line 33
    const-string v1, "watcher thread finished"

    .line 34
    .line 35
    invoke-interface {v0, v1}, LF2/b;->u(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :catchall_0
    move-exception v0

    .line 40
    goto/16 :goto_4

    .line 41
    .line 42
    :catch_0
    move-exception v0

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 45
    .line 46
    new-instance v3, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v2

    .line 62
    :cond_1
    iget v0, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->numEmitterThreadsFinished:I

    .line 63
    .line 64
    add-int/2addr v0, v2

    .line 65
    iput v0, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->numEmitterThreadsFinished:I

    .line 66
    .line 67
    sget-object v0, Lorg/apache/tika/pipes/async/AsyncProcessor;->LOG:LF2/b;

    .line 68
    .line 69
    const-string v1, "emitter thread finished, total {}"

    .line 70
    .line 71
    iget v3, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->numEmitterThreadsFinished:I

    .line 72
    .line 73
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-interface {v0, v3, v1}, LF2/b;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    iget v0, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->numParserThreadsFinished:I

    .line 82
    .line 83
    add-int/2addr v0, v2

    .line 84
    iput v0, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->numParserThreadsFinished:I

    .line 85
    .line 86
    sget-object v0, Lorg/apache/tika/pipes/async/AsyncProcessor;->LOG:LF2/b;

    .line 87
    .line 88
    const-string v1, "fetchEmitWorker finished, total {}"

    .line 89
    .line 90
    iget v3, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->numParserThreadsFinished:I

    .line 91
    .line 92
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-interface {v0, v3, v1}, LF2/b;->s(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :goto_0
    :try_start_2
    sget-object v1, Lorg/apache/tika/pipes/async/AsyncProcessor;->LOG:LF2/b;

    .line 101
    .line 102
    const-string v2, "execution exception"

    .line 103
    .line 104
    invoke-interface {v1, v2, v0}, LF2/b;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 105
    .line 106
    .line 107
    iget-object v1, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->asyncConfig:Lorg/apache/tika/pipes/async/AsyncConfig;

    .line 108
    .line 109
    invoke-virtual {v1}, Lorg/apache/tika/pipes/async/AsyncConfig;->getPipesReporter()Lorg/apache/tika/pipes/PipesReporter;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-virtual {v1, v0}, Lorg/apache/tika/pipes/PipesReporter;->error(Ljava/lang/Throwable;)V

    .line 114
    .line 115
    .line 116
    new-instance v1, Ljava/lang/RuntimeException;

    .line 117
    .line 118
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 119
    .line 120
    .line 121
    throw v1

    .line 122
    :cond_3
    :goto_1
    iget v0, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->numParserThreadsFinished:I

    .line 123
    .line 124
    iget-object v1, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->asyncConfig:Lorg/apache/tika/pipes/async/AsyncConfig;

    .line 125
    .line 126
    invoke-virtual {v1}, Lorg/apache/tika/pipes/PipesConfigBase;->getNumClients()I

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    const/4 v3, 0x0

    .line 131
    if-ne v0, v1, :cond_6

    .line 132
    .line 133
    iget-boolean v0, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->addedEmitterSemaphores:Z

    .line 134
    .line 135
    if-nez v0, :cond_6

    .line 136
    .line 137
    move v0, v3

    .line 138
    :goto_2
    iget-object v1, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->asyncConfig:Lorg/apache/tika/pipes/async/AsyncConfig;

    .line 139
    .line 140
    invoke-virtual {v1}, Lorg/apache/tika/pipes/async/AsyncConfig;->getNumEmitters()I

    .line 141
    .line 142
    .line 143
    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 144
    if-ge v0, v1, :cond_5

    .line 145
    .line 146
    :try_start_3
    iget-object v1, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->emitData:Ljava/util/concurrent/ArrayBlockingQueue;

    .line 147
    .line 148
    sget-object v4, Lorg/apache/tika/pipes/async/AsyncEmitter;->EMIT_DATA_STOP_SEMAPHORE:Lorg/apache/tika/pipes/emitter/EmitData;

    .line 149
    .line 150
    sget-wide v5, Lorg/apache/tika/pipes/async/AsyncProcessor;->MAX_OFFER_WAIT_MS:J

    .line 151
    .line 152
    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 153
    .line 154
    invoke-virtual {v1, v4, v5, v6, v7}, Ljava/util/concurrent/ArrayBlockingQueue;->offer(Ljava/lang/Object;JLjava/util/concurrent/TimeUnit;)Z

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    if-eqz v1, :cond_4

    .line 159
    .line 160
    add-int/lit8 v0, v0, 0x1

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_4
    new-instance v0, Ljava/lang/RuntimeException;

    .line 164
    .line 165
    sget-wide v1, Lorg/apache/tika/pipes/async/AsyncProcessor;->MAX_OFFER_WAIT_MS:J

    .line 166
    .line 167
    new-instance v3, Ljava/lang/StringBuilder;

    .line 168
    .line 169
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 170
    .line 171
    .line 172
    const-string v4, "Couldn\'t offer emit data stop semaphore within "

    .line 173
    .line 174
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    const-string v1, " ms"

    .line 181
    .line 182
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    throw v0
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 193
    :catch_1
    move-exception v0

    .line 194
    :try_start_4
    new-instance v1, Ljava/lang/RuntimeException;

    .line 195
    .line 196
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 197
    .line 198
    .line 199
    throw v1

    .line 200
    :cond_5
    iput-boolean v2, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->addedEmitterSemaphores:Z

    .line 201
    .line 202
    :cond_6
    iget v0, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->numParserThreadsFinished:I

    .line 203
    .line 204
    iget-object v1, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->asyncConfig:Lorg/apache/tika/pipes/async/AsyncConfig;

    .line 205
    .line 206
    invoke-virtual {v1}, Lorg/apache/tika/pipes/PipesConfigBase;->getNumClients()I

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    if-ne v0, v1, :cond_8

    .line 211
    .line 212
    iget v0, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->numEmitterThreadsFinished:I

    .line 213
    .line 214
    iget-object v1, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->asyncConfig:Lorg/apache/tika/pipes/async/AsyncConfig;

    .line 215
    .line 216
    invoke-virtual {v1}, Lorg/apache/tika/pipes/async/AsyncConfig;->getNumEmitters()I

    .line 217
    .line 218
    .line 219
    move-result v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 220
    if-eq v0, v1, :cond_7

    .line 221
    .line 222
    goto :goto_3

    .line 223
    :cond_7
    move v2, v3

    .line 224
    :cond_8
    :goto_3
    monitor-exit p0

    .line 225
    return v2

    .line 226
    :goto_4
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 227
    throw v0
.end method

.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->asyncConfig:Lorg/apache/tika/pipes/async/AsyncConfig;

    .line 7
    .line 8
    invoke-virtual {v0}, Lorg/apache/tika/pipes/async/AsyncConfig;->getPipesReporter()Lorg/apache/tika/pipes/PipesReporter;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lorg/apache/tika/pipes/PipesReporter;->close()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public finished()V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->asyncConfig:Lorg/apache/tika/pipes/async/AsyncConfig;

    .line 3
    .line 4
    invoke-virtual {v1}, Lorg/apache/tika/pipes/PipesConfigBase;->getNumClients()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-ge v0, v1, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->fetchEmitTuples:Ljava/util/concurrent/ArrayBlockingQueue;

    .line 11
    .line 12
    sget-object v2, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->COMPLETED_SEMAPHORE:Lorg/apache/tika/pipes/FetchEmitTuple;

    .line 13
    .line 14
    sget-wide v3, Lorg/apache/tika/pipes/async/AsyncProcessor;->MAX_OFFER_WAIT_MS:J

    .line 15
    .line 16
    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 17
    .line 18
    invoke-virtual {v1, v2, v3, v4, v5}, Ljava/util/concurrent/ArrayBlockingQueue;->offer(Ljava/lang/Object;JLjava/util/concurrent/TimeUnit;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    add-int/lit8 v0, v0, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    .line 28
    .line 29
    sget-wide v1, Lorg/apache/tika/pipes/async/AsyncProcessor;->MAX_OFFER_WAIT_MS:J

    .line 30
    .line 31
    new-instance v3, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v4, "Couldn\'t offer completed semaphore within "

    .line 34
    .line 35
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v1, " ms"

    .line 42
    .line 43
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v0

    .line 54
    :cond_1
    return-void
.end method

.method public getCapacity()I
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->fetchEmitTuples:Ljava/util/concurrent/ArrayBlockingQueue;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/ArrayBlockingQueue;->remainingCapacity()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getTotalProcessed()J
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->totalProcessed:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public declared-synchronized offer(Ljava/util/List;J)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lorg/apache/tika/pipes/FetchEmitTuple;",
            ">;J)Z"
        }
    .end annotation

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->isShuttingDown:Z

    if-nez v0, :cond_3

    .line 2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->asyncConfig:Lorg/apache/tika/pipes/async/AsyncConfig;

    invoke-virtual {v1}, Lorg/apache/tika/pipes/async/AsyncConfig;->getQueueSize()I

    move-result v1

    if-gt v0, v1, :cond_2

    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    :goto_0
    sub-long/2addr v2, v0

    cmp-long v2, v2, p2

    if-gez v2, :cond_1

    .line 5
    iget-object v2, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->fetchEmitTuples:Ljava/util/concurrent/ArrayBlockingQueue;

    invoke-virtual {v2}, Ljava/util/concurrent/ArrayBlockingQueue;->remainingCapacity()I

    move-result v2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-le v2, v3, :cond_0

    .line 6
    :try_start_1
    iget-object v2, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->fetchEmitTuples:Ljava/util/concurrent/ArrayBlockingQueue;

    invoke-virtual {v2, p1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 7
    monitor-exit p0

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception v2

    .line 8
    :try_start_2
    sget-object v3, Lorg/apache/tika/pipes/async/AsyncProcessor;->LOG:LF2/b;

    const-string v4, "couldn\'t add full list"

    invoke-interface {v3, v4, v2}, LF2/b;->i(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    const-wide/16 v2, 0x64

    .line 9
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V

    .line 10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 11
    :cond_1
    monitor-exit p0

    const/4 p1, 0x0

    return p1

    .line 12
    :cond_2
    :try_start_3
    new-instance p2, Lorg/apache/tika/pipes/async/OfferLargerThanQueueSize;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    iget-object p3, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->asyncConfig:Lorg/apache/tika/pipes/async/AsyncConfig;

    .line 13
    invoke-virtual {p3}, Lorg/apache/tika/pipes/async/AsyncConfig;->getQueueSize()I

    move-result p3

    invoke-direct {p2, p1, p3}, Lorg/apache/tika/pipes/async/OfferLargerThanQueueSize;-><init>(II)V

    throw p2

    .line 14
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Can\'t call offer after calling close() or shutdownNow()"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 15
    :goto_1
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public declared-synchronized offer(Lorg/apache/tika/pipes/FetchEmitTuple;J)Z
    .locals 2

    monitor-enter p0

    .line 16
    :try_start_0
    iget-object v0, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->fetchEmitTuples:Ljava/util/concurrent/ArrayBlockingQueue;

    if-eqz v0, :cond_1

    .line 17
    iget-boolean v0, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->isShuttingDown:Z

    if-nez v0, :cond_0

    .line 18
    invoke-virtual {p0}, Lorg/apache/tika/pipes/async/AsyncProcessor;->checkActive()Z

    .line 19
    iget-object v0, p0, Lorg/apache/tika/pipes/async/AsyncProcessor;->fetchEmitTuples:Ljava/util/concurrent/ArrayBlockingQueue;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, p1, p2, p3, v1}, Ljava/util/concurrent/ArrayBlockingQueue;->offer(Ljava/lang/Object;JLjava/util/concurrent/TimeUnit;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    goto :goto_0

    .line 20
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Can\'t call offer after calling close() or shutdownNow()"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 21
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "queue hasn\'t been initialized yet."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 22
    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

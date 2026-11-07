.class public Lorg/apache/tika/pipes/pipesiterator/CallablePipesIterator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# instance fields
.field private final numConsumers:I

.field private final pipesIterator:Lorg/apache/tika/pipes/pipesiterator/PipesIterator;

.field private final queue:Ljava/util/concurrent/ArrayBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ArrayBlockingQueue<",
            "Lorg/apache/tika/pipes/FetchEmitTuple;",
            ">;"
        }
    .end annotation
.end field

.field private final timeoutMillis:J


# direct methods
.method public constructor <init>(Lorg/apache/tika/pipes/pipesiterator/PipesIterator;Ljava/util/concurrent/ArrayBlockingQueue;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/tika/pipes/pipesiterator/PipesIterator;",
            "Ljava/util/concurrent/ArrayBlockingQueue<",
            "Lorg/apache/tika/pipes/FetchEmitTuple;",
            ">;)V"
        }
    .end annotation

    const-wide/16 v0, -0x1

    .line 1
    invoke-direct {p0, p1, p2, v0, v1}, Lorg/apache/tika/pipes/pipesiterator/CallablePipesIterator;-><init>(Lorg/apache/tika/pipes/pipesiterator/PipesIterator;Ljava/util/concurrent/ArrayBlockingQueue;J)V

    return-void
.end method

.method public constructor <init>(Lorg/apache/tika/pipes/pipesiterator/PipesIterator;Ljava/util/concurrent/ArrayBlockingQueue;J)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/tika/pipes/pipesiterator/PipesIterator;",
            "Ljava/util/concurrent/ArrayBlockingQueue<",
            "Lorg/apache/tika/pipes/FetchEmitTuple;",
            ">;J)V"
        }
    .end annotation

    const/4 v5, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-wide v3, p3

    .line 2
    invoke-direct/range {v0 .. v5}, Lorg/apache/tika/pipes/pipesiterator/CallablePipesIterator;-><init>(Lorg/apache/tika/pipes/pipesiterator/PipesIterator;Ljava/util/concurrent/ArrayBlockingQueue;JI)V

    return-void
.end method

.method public constructor <init>(Lorg/apache/tika/pipes/pipesiterator/PipesIterator;Ljava/util/concurrent/ArrayBlockingQueue;JI)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/tika/pipes/pipesiterator/PipesIterator;",
            "Ljava/util/concurrent/ArrayBlockingQueue<",
            "Lorg/apache/tika/pipes/FetchEmitTuple;",
            ">;JI)V"
        }
    .end annotation

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lorg/apache/tika/pipes/pipesiterator/CallablePipesIterator;->pipesIterator:Lorg/apache/tika/pipes/pipesiterator/PipesIterator;

    .line 5
    iput-object p2, p0, Lorg/apache/tika/pipes/pipesiterator/CallablePipesIterator;->queue:Ljava/util/concurrent/ArrayBlockingQueue;

    .line 6
    iput-wide p3, p0, Lorg/apache/tika/pipes/pipesiterator/CallablePipesIterator;->timeoutMillis:J

    .line 7
    iput p5, p0, Lorg/apache/tika/pipes/pipesiterator/CallablePipesIterator;->numConsumers:I

    return-void
.end method


# virtual methods
.method public call()Ljava/lang/Long;
    .locals 11

    .line 2
    iget-wide v0, p0, Lorg/apache/tika/pipes/pipesiterator/CallablePipesIterator;->timeoutMillis:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    const/4 v1, 0x0

    const-wide/16 v4, 0x1

    if-lez v0, :cond_3

    .line 3
    iget-object v0, p0, Lorg/apache/tika/pipes/pipesiterator/CallablePipesIterator;->pipesIterator:Lorg/apache/tika/pipes/pipesiterator/PipesIterator;

    invoke-virtual {v0}, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lorg/apache/tika/pipes/FetchEmitTuple;

    .line 4
    iget-object v7, p0, Lorg/apache/tika/pipes/pipesiterator/CallablePipesIterator;->queue:Ljava/util/concurrent/ArrayBlockingQueue;

    iget-wide v8, p0, Lorg/apache/tika/pipes/pipesiterator/CallablePipesIterator;->timeoutMillis:J

    sget-object v10, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v7, v6, v8, v9, v10}, Ljava/util/concurrent/ArrayBlockingQueue;->offer(Ljava/lang/Object;JLjava/util/concurrent/TimeUnit;)Z

    move-result v6

    if-eqz v6, :cond_0

    add-long/2addr v2, v4

    goto :goto_0

    .line 5
    :cond_0
    new-instance v0, Ljava/util/concurrent/TimeoutException;

    const-string v1, "timed out trying to offer tuple"

    invoke-direct {v0, v1}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 6
    :cond_1
    :goto_1
    iget v0, p0, Lorg/apache/tika/pipes/pipesiterator/CallablePipesIterator;->numConsumers:I

    if-ge v1, v0, :cond_5

    .line 7
    iget-object v0, p0, Lorg/apache/tika/pipes/pipesiterator/CallablePipesIterator;->queue:Ljava/util/concurrent/ArrayBlockingQueue;

    sget-object v4, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->COMPLETED_SEMAPHORE:Lorg/apache/tika/pipes/FetchEmitTuple;

    iget-wide v5, p0, Lorg/apache/tika/pipes/pipesiterator/CallablePipesIterator;->timeoutMillis:J

    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v4, v5, v6, v7}, Ljava/util/concurrent/ArrayBlockingQueue;->offer(Ljava/lang/Object;JLjava/util/concurrent/TimeUnit;)Z

    move-result v0

    if-eqz v0, :cond_2

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 8
    :cond_2
    new-instance v0, Ljava/util/concurrent/TimeoutException;

    const-string v1, "timed out trying to offer the completed semaphore"

    invoke-direct {v0, v1}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 9
    :cond_3
    iget-object v0, p0, Lorg/apache/tika/pipes/pipesiterator/CallablePipesIterator;->pipesIterator:Lorg/apache/tika/pipes/pipesiterator/PipesIterator;

    invoke-virtual {v0}, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lorg/apache/tika/pipes/FetchEmitTuple;

    .line 10
    iget-object v7, p0, Lorg/apache/tika/pipes/pipesiterator/CallablePipesIterator;->queue:Ljava/util/concurrent/ArrayBlockingQueue;

    invoke-virtual {v7, v6}, Ljava/util/concurrent/ArrayBlockingQueue;->put(Ljava/lang/Object;)V

    add-long/2addr v2, v4

    goto :goto_2

    .line 11
    :cond_4
    :goto_3
    iget v0, p0, Lorg/apache/tika/pipes/pipesiterator/CallablePipesIterator;->numConsumers:I

    if-ge v1, v0, :cond_5

    .line 12
    iget-object v0, p0, Lorg/apache/tika/pipes/pipesiterator/CallablePipesIterator;->queue:Ljava/util/concurrent/ArrayBlockingQueue;

    sget-object v4, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->COMPLETED_SEMAPHORE:Lorg/apache/tika/pipes/FetchEmitTuple;

    invoke-virtual {v0, v4}, Ljava/util/concurrent/ArrayBlockingQueue;->put(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 13
    :cond_5
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/apache/tika/pipes/pipesiterator/CallablePipesIterator;->call()Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.class public Lorg/apache/tika/pipes/PipesParser;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field private final clientQueue:Ljava/util/concurrent/ArrayBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ArrayBlockingQueue<",
            "Lorg/apache/tika/pipes/PipesClient;",
            ">;"
        }
    .end annotation
.end field

.field private final clients:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/apache/tika/pipes/PipesClient;",
            ">;"
        }
    .end annotation
.end field

.field private final pipesConfig:Lorg/apache/tika/pipes/PipesConfig;


# direct methods
.method public constructor <init>(Lorg/apache/tika/pipes/PipesConfig;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    iput-object v0, p0, Lorg/apache/tika/pipes/PipesParser;->clients:Ljava/util/List;

    .line 10
    .line 11
    iput-object p1, p0, Lorg/apache/tika/pipes/PipesParser;->pipesConfig:Lorg/apache/tika/pipes/PipesConfig;

    .line 12
    .line 13
    new-instance v0, Ljava/util/concurrent/ArrayBlockingQueue;

    .line 14
    .line 15
    invoke-virtual {p1}, Lorg/apache/tika/pipes/PipesConfigBase;->getNumClients()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-direct {v0, v1}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lorg/apache/tika/pipes/PipesParser;->clientQueue:Ljava/util/concurrent/ArrayBlockingQueue;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    :goto_0
    invoke-virtual {p1}, Lorg/apache/tika/pipes/PipesConfigBase;->getNumClients()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-ge v0, v1, :cond_0

    .line 30
    .line 31
    new-instance v1, Lorg/apache/tika/pipes/PipesClient;

    .line 32
    .line 33
    invoke-direct {v1, p1}, Lorg/apache/tika/pipes/PipesClient;-><init>(Lorg/apache/tika/pipes/PipesConfigBase;)V

    .line 34
    .line 35
    .line 36
    iget-object v2, p0, Lorg/apache/tika/pipes/PipesParser;->clientQueue:Ljava/util/concurrent/ArrayBlockingQueue;

    .line 37
    .line 38
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ArrayBlockingQueue;->offer(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    iget-object v2, p0, Lorg/apache/tika/pipes/PipesParser;->clients:Ljava/util/List;

    .line 42
    .line 43
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    add-int/lit8 v0, v0, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    return-void
.end method


# virtual methods
.method public close()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lorg/apache/tika/pipes/PipesParser;->clients:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lorg/apache/tika/pipes/PipesClient;

    .line 23
    .line 24
    :try_start_0
    invoke-virtual {v2}, Lorg/apache/tika/pipes/PipesClient;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catch_0
    move-exception v2

    .line 29
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-gtz v1, :cond_1

    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    const/4 v1, 0x0

    .line 41
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Ljava/io/IOException;

    .line 46
    .line 47
    throw v0
.end method

.method public parse(Lorg/apache/tika/pipes/FetchEmitTuple;)Lorg/apache/tika/pipes/PipesResult;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lorg/apache/tika/pipes/PipesParser;->clientQueue:Ljava/util/concurrent/ArrayBlockingQueue;

    .line 3
    .line 4
    iget-object v2, p0, Lorg/apache/tika/pipes/PipesParser;->pipesConfig:Lorg/apache/tika/pipes/PipesConfig;

    .line 5
    .line 6
    invoke-virtual {v2}, Lorg/apache/tika/pipes/PipesConfig;->getMaxWaitForClientMillis()J

    .line 7
    .line 8
    .line 9
    move-result-wide v2

    .line 10
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 11
    .line 12
    invoke-virtual {v1, v2, v3, v4}, Ljava/util/concurrent/ArrayBlockingQueue;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lorg/apache/tika/pipes/PipesClient;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 17
    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    :try_start_1
    sget-object p1, Lorg/apache/tika/pipes/PipesResult;->CLIENT_UNAVAILABLE_WITHIN_MS:Lorg/apache/tika/pipes/PipesResult;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    :goto_0
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesParser;->clientQueue:Ljava/util/concurrent/ArrayBlockingQueue;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ArrayBlockingQueue;->offer(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    :cond_0
    return-object p1

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    move-object v0, v1

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    :try_start_2
    invoke-virtual {v1, p1}, Lorg/apache/tika/pipes/PipesClient;->process(Lorg/apache/tika/pipes/FetchEmitTuple;)Lorg/apache/tika/pipes/PipesResult;

    .line 34
    .line 35
    .line 36
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 37
    goto :goto_0

    .line 38
    :catchall_1
    move-exception p1

    .line 39
    :goto_1
    if-eqz v0, :cond_2

    .line 40
    .line 41
    iget-object v1, p0, Lorg/apache/tika/pipes/PipesParser;->clientQueue:Ljava/util/concurrent/ArrayBlockingQueue;

    .line 42
    .line 43
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ArrayBlockingQueue;->offer(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    :cond_2
    throw p1
.end method

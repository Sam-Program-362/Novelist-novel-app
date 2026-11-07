.class public Lorg/apache/tika/fork/ForkParser;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/apache/tika/parser/Parser;
.implements Ljava/io/Closeable;


# static fields
.field private static final serialVersionUID:J = -0x44df345de5a0420eL


# instance fields
.field private currentlyInUse:I

.field private java:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final loader:Ljava/lang/ClassLoader;

.field private maxFilesProcessedPerClient:I
    .annotation runtime Lorg/apache/tika/config/Field;
    .end annotation
.end field

.field private final parser:Lorg/apache/tika/parser/Parser;

.field private final parserFactoryFactory:Lorg/apache/tika/fork/ParserFactoryFactory;

.field private final pool:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Lorg/apache/tika/fork/ForkClient;",
            ">;"
        }
    .end annotation
.end field

.field private poolSize:I
    .annotation runtime Lorg/apache/tika/config/Field;
    .end annotation
.end field

.field private serverParseTimeoutMillis:J
    .annotation runtime Lorg/apache/tika/config/Field;
    .end annotation
.end field

.field private serverPulseMillis:J
    .annotation runtime Lorg/apache/tika/config/Field;
    .end annotation
.end field

.field private serverWaitTimeoutMillis:J
    .annotation runtime Lorg/apache/tika/config/Field;
    .end annotation
.end field

.field private final tikaBin:Ljava/nio/file/Path;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 43
    const-class v0, Lorg/apache/tika/fork/ForkParser;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/apache/tika/fork/ForkParser;-><init>(Ljava/lang/ClassLoader;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/ClassLoader;)V
    .locals 1

    .line 42
    new-instance v0, Lorg/apache/tika/parser/AutoDetectParser;

    invoke-direct {v0}, Lorg/apache/tika/parser/AutoDetectParser;-><init>()V

    invoke-direct {p0, p1, v0}, Lorg/apache/tika/fork/ForkParser;-><init>(Ljava/lang/ClassLoader;Lorg/apache/tika/parser/Parser;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/ClassLoader;Lorg/apache/tika/parser/Parser;)V
    .locals 3

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lorg/apache/tika/fork/ForkParser;->pool:Ljava/util/Queue;

    .line 29
    const-string v0, "-Xmx32m"

    const-string v1, "-Djava.awt.headless=true"

    const-string v2, "java"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/tika/fork/ForkParser;->java:Ljava/util/List;

    const/4 v0, 0x5

    .line 30
    iput v0, p0, Lorg/apache/tika/fork/ForkParser;->poolSize:I

    const/4 v0, 0x0

    .line 31
    iput v0, p0, Lorg/apache/tika/fork/ForkParser;->currentlyInUse:I

    const-wide/16 v0, 0x3e8

    .line 32
    iput-wide v0, p0, Lorg/apache/tika/fork/ForkParser;->serverPulseMillis:J

    const-wide/32 v0, 0xea60

    .line 33
    iput-wide v0, p0, Lorg/apache/tika/fork/ForkParser;->serverParseTimeoutMillis:J

    .line 34
    iput-wide v0, p0, Lorg/apache/tika/fork/ForkParser;->serverWaitTimeoutMillis:J

    const/4 v0, -0x1

    .line 35
    iput v0, p0, Lorg/apache/tika/fork/ForkParser;->maxFilesProcessedPerClient:I

    .line 36
    instance-of v0, p2, Lorg/apache/tika/fork/ForkParser;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 37
    iput-object v0, p0, Lorg/apache/tika/fork/ForkParser;->tikaBin:Ljava/nio/file/Path;

    .line 38
    iput-object v0, p0, Lorg/apache/tika/fork/ForkParser;->parserFactoryFactory:Lorg/apache/tika/fork/ParserFactoryFactory;

    .line 39
    iput-object p1, p0, Lorg/apache/tika/fork/ForkParser;->loader:Ljava/lang/ClassLoader;

    .line 40
    iput-object p2, p0, Lorg/apache/tika/fork/ForkParser;->parser:Lorg/apache/tika/parser/Parser;

    return-void

    .line 41
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The underlying parser of a ForkParser should not be a ForkParser, but a specific implementation."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Ljava/nio/file/Path;Lorg/apache/tika/fork/ParserFactoryFactory;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lorg/apache/tika/fork/ForkParser;->pool:Ljava/util/Queue;

    .line 3
    const-string v0, "-Xmx32m"

    const-string v1, "-Djava.awt.headless=true"

    const-string v2, "java"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/tika/fork/ForkParser;->java:Ljava/util/List;

    const/4 v0, 0x5

    .line 4
    iput v0, p0, Lorg/apache/tika/fork/ForkParser;->poolSize:I

    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lorg/apache/tika/fork/ForkParser;->currentlyInUse:I

    const-wide/16 v0, 0x3e8

    .line 6
    iput-wide v0, p0, Lorg/apache/tika/fork/ForkParser;->serverPulseMillis:J

    const-wide/32 v0, 0xea60

    .line 7
    iput-wide v0, p0, Lorg/apache/tika/fork/ForkParser;->serverParseTimeoutMillis:J

    .line 8
    iput-wide v0, p0, Lorg/apache/tika/fork/ForkParser;->serverWaitTimeoutMillis:J

    const/4 v0, -0x1

    .line 9
    iput v0, p0, Lorg/apache/tika/fork/ForkParser;->maxFilesProcessedPerClient:I

    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lorg/apache/tika/fork/ForkParser;->loader:Ljava/lang/ClassLoader;

    .line 11
    iput-object v0, p0, Lorg/apache/tika/fork/ForkParser;->parser:Lorg/apache/tika/parser/Parser;

    .line 12
    iput-object p1, p0, Lorg/apache/tika/fork/ForkParser;->tikaBin:Ljava/nio/file/Path;

    .line 13
    iput-object p2, p0, Lorg/apache/tika/fork/ForkParser;->parserFactoryFactory:Lorg/apache/tika/fork/ParserFactoryFactory;

    return-void
.end method

.method public constructor <init>(Ljava/nio/file/Path;Lorg/apache/tika/fork/ParserFactoryFactory;Ljava/lang/ClassLoader;)V
    .locals 3

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lorg/apache/tika/fork/ForkParser;->pool:Ljava/util/Queue;

    .line 16
    const-string v0, "-Xmx32m"

    const-string v1, "-Djava.awt.headless=true"

    const-string v2, "java"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/tika/fork/ForkParser;->java:Ljava/util/List;

    const/4 v0, 0x5

    .line 17
    iput v0, p0, Lorg/apache/tika/fork/ForkParser;->poolSize:I

    const/4 v0, 0x0

    .line 18
    iput v0, p0, Lorg/apache/tika/fork/ForkParser;->currentlyInUse:I

    const-wide/16 v0, 0x3e8

    .line 19
    iput-wide v0, p0, Lorg/apache/tika/fork/ForkParser;->serverPulseMillis:J

    const-wide/32 v0, 0xea60

    .line 20
    iput-wide v0, p0, Lorg/apache/tika/fork/ForkParser;->serverParseTimeoutMillis:J

    .line 21
    iput-wide v0, p0, Lorg/apache/tika/fork/ForkParser;->serverWaitTimeoutMillis:J

    const/4 v0, -0x1

    .line 22
    iput v0, p0, Lorg/apache/tika/fork/ForkParser;->maxFilesProcessedPerClient:I

    const/4 v0, 0x0

    .line 23
    iput-object v0, p0, Lorg/apache/tika/fork/ForkParser;->parser:Lorg/apache/tika/parser/Parser;

    .line 24
    iput-object p3, p0, Lorg/apache/tika/fork/ForkParser;->loader:Ljava/lang/ClassLoader;

    .line 25
    iput-object p1, p0, Lorg/apache/tika/fork/ForkParser;->tikaBin:Ljava/nio/file/Path;

    .line 26
    iput-object p2, p0, Lorg/apache/tika/fork/ForkParser;->parserFactoryFactory:Lorg/apache/tika/fork/ParserFactoryFactory;

    return-void
.end method

.method private declared-synchronized acquireClient()Lorg/apache/tika/fork/ForkClient;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :cond_0
    :goto_0
    :try_start_0
    iget-object v0, p0, Lorg/apache/tika/fork/ForkParser;->pool:Ljava/util/Queue;

    .line 3
    .line 4
    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lorg/apache/tika/fork/ForkClient;

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    iget v1, p0, Lorg/apache/tika/fork/ForkParser;->currentlyInUse:I

    .line 13
    .line 14
    iget v2, p0, Lorg/apache/tika/fork/ForkParser;->poolSize:I

    .line 15
    .line 16
    if-ge v1, v2, :cond_1

    .line 17
    .line 18
    invoke-direct {p0}, Lorg/apache/tika/fork/ForkParser;->newClient()Lorg/apache/tika/fork/ForkClient;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    goto :goto_1

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    goto :goto_2

    .line 25
    :cond_1
    :goto_1
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {v0}, Lorg/apache/tika/fork/ForkClient;->ping()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_2

    .line 32
    .line 33
    invoke-virtual {v0}, Lorg/apache/tika/fork/ForkClient;->close()V

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    :cond_2
    if-eqz v0, :cond_3

    .line 38
    .line 39
    iget v1, p0, Lorg/apache/tika/fork/ForkParser;->currentlyInUse:I

    .line 40
    .line 41
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    iput v1, p0, Lorg/apache/tika/fork/ForkParser;->currentlyInUse:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    monitor-exit p0

    .line 46
    return-object v0

    .line 47
    :cond_3
    :try_start_1
    iget v0, p0, Lorg/apache/tika/fork/ForkParser;->currentlyInUse:I

    .line 48
    .line 49
    iget v1, p0, Lorg/apache/tika/fork/ForkParser;->poolSize:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    .line 51
    if-lt v0, v1, :cond_0

    .line 52
    .line 53
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catch_0
    move-exception v0

    .line 58
    :try_start_3
    new-instance v1, Lorg/apache/tika/exception/TikaException;

    .line 59
    .line 60
    const-string v2, "Interrupted while waiting for a fork parser"

    .line 61
    .line 62
    invoke-direct {v1, v2, v0}, Lorg/apache/tika/exception/TikaException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    throw v1

    .line 66
    :goto_2
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 67
    throw v0
.end method

.method private newClient()Lorg/apache/tika/fork/ForkClient;
    .locals 7

    .line 1
    new-instance v0, Lorg/apache/tika/fork/TimeoutLimits;

    .line 2
    .line 3
    iget-wide v1, p0, Lorg/apache/tika/fork/ForkParser;->serverPulseMillis:J

    .line 4
    .line 5
    iget-wide v3, p0, Lorg/apache/tika/fork/ForkParser;->serverParseTimeoutMillis:J

    .line 6
    .line 7
    iget-wide v5, p0, Lorg/apache/tika/fork/ForkParser;->serverWaitTimeoutMillis:J

    .line 8
    .line 9
    invoke-direct/range {v0 .. v6}, Lorg/apache/tika/fork/TimeoutLimits;-><init>(JJJ)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lorg/apache/tika/fork/ForkParser;->loader:Ljava/lang/ClassLoader;

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    iget-object v2, p0, Lorg/apache/tika/fork/ForkParser;->parser:Lorg/apache/tika/parser/Parser;

    .line 17
    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    iget-object v2, p0, Lorg/apache/tika/fork/ForkParser;->tikaBin:Ljava/nio/file/Path;

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    iget-object v2, p0, Lorg/apache/tika/fork/ForkParser;->parserFactoryFactory:Lorg/apache/tika/fork/ParserFactoryFactory;

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    new-instance v1, Lorg/apache/tika/fork/ForkClient;

    .line 29
    .line 30
    iget-object v2, p0, Lorg/apache/tika/fork/ForkParser;->tikaBin:Ljava/nio/file/Path;

    .line 31
    .line 32
    iget-object v3, p0, Lorg/apache/tika/fork/ForkParser;->parserFactoryFactory:Lorg/apache/tika/fork/ParserFactoryFactory;

    .line 33
    .line 34
    iget-object v4, p0, Lorg/apache/tika/fork/ForkParser;->java:Ljava/util/List;

    .line 35
    .line 36
    invoke-direct {v1, v2, v3, v4, v0}, Lorg/apache/tika/fork/ForkClient;-><init>(Ljava/nio/file/Path;Lorg/apache/tika/fork/ParserFactoryFactory;Ljava/util/List;Lorg/apache/tika/fork/TimeoutLimits;)V

    .line 37
    .line 38
    .line 39
    return-object v1

    .line 40
    :cond_0
    if-eqz v1, :cond_1

    .line 41
    .line 42
    iget-object v2, p0, Lorg/apache/tika/fork/ForkParser;->parser:Lorg/apache/tika/parser/Parser;

    .line 43
    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    iget-object v2, p0, Lorg/apache/tika/fork/ForkParser;->tikaBin:Ljava/nio/file/Path;

    .line 47
    .line 48
    if-nez v2, :cond_1

    .line 49
    .line 50
    iget-object v2, p0, Lorg/apache/tika/fork/ForkParser;->parserFactoryFactory:Lorg/apache/tika/fork/ParserFactoryFactory;

    .line 51
    .line 52
    if-nez v2, :cond_1

    .line 53
    .line 54
    new-instance v1, Lorg/apache/tika/fork/ForkClient;

    .line 55
    .line 56
    iget-object v2, p0, Lorg/apache/tika/fork/ForkParser;->loader:Ljava/lang/ClassLoader;

    .line 57
    .line 58
    iget-object v3, p0, Lorg/apache/tika/fork/ForkParser;->parser:Lorg/apache/tika/parser/Parser;

    .line 59
    .line 60
    iget-object v4, p0, Lorg/apache/tika/fork/ForkParser;->java:Ljava/util/List;

    .line 61
    .line 62
    invoke-direct {v1, v2, v3, v4, v0}, Lorg/apache/tika/fork/ForkClient;-><init>(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/util/List;Lorg/apache/tika/fork/TimeoutLimits;)V

    .line 63
    .line 64
    .line 65
    return-object v1

    .line 66
    :cond_1
    if-eqz v1, :cond_2

    .line 67
    .line 68
    iget-object v1, p0, Lorg/apache/tika/fork/ForkParser;->parser:Lorg/apache/tika/parser/Parser;

    .line 69
    .line 70
    if-nez v1, :cond_2

    .line 71
    .line 72
    iget-object v1, p0, Lorg/apache/tika/fork/ForkParser;->tikaBin:Ljava/nio/file/Path;

    .line 73
    .line 74
    if-eqz v1, :cond_2

    .line 75
    .line 76
    iget-object v1, p0, Lorg/apache/tika/fork/ForkParser;->parserFactoryFactory:Lorg/apache/tika/fork/ParserFactoryFactory;

    .line 77
    .line 78
    if-eqz v1, :cond_2

    .line 79
    .line 80
    move-object v5, v0

    .line 81
    new-instance v0, Lorg/apache/tika/fork/ForkClient;

    .line 82
    .line 83
    iget-object v1, p0, Lorg/apache/tika/fork/ForkParser;->tikaBin:Ljava/nio/file/Path;

    .line 84
    .line 85
    iget-object v2, p0, Lorg/apache/tika/fork/ForkParser;->parserFactoryFactory:Lorg/apache/tika/fork/ParserFactoryFactory;

    .line 86
    .line 87
    iget-object v3, p0, Lorg/apache/tika/fork/ForkParser;->loader:Ljava/lang/ClassLoader;

    .line 88
    .line 89
    iget-object v4, p0, Lorg/apache/tika/fork/ForkParser;->java:Ljava/util/List;

    .line 90
    .line 91
    invoke-direct/range {v0 .. v5}, Lorg/apache/tika/fork/ForkClient;-><init>(Ljava/nio/file/Path;Lorg/apache/tika/fork/ParserFactoryFactory;Ljava/lang/ClassLoader;Ljava/util/List;Lorg/apache/tika/fork/TimeoutLimits;)V

    .line 92
    .line 93
    .line 94
    return-object v0

    .line 95
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 96
    .line 97
    const-string v1, "Unexpected combination of state items"

    .line 98
    .line 99
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw v0
.end method

.method private declared-synchronized releaseClient(Lorg/apache/tika/fork/ForkClient;Z)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Lorg/apache/tika/fork/ForkParser;->currentlyInUse:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, -0x1

    .line 5
    .line 6
    iput v0, p0, Lorg/apache/tika/fork/ForkParser;->currentlyInUse:I

    .line 7
    .line 8
    iget-object v1, p0, Lorg/apache/tika/fork/ForkParser;->pool:Ljava/util/Queue;

    .line 9
    .line 10
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    add-int/2addr v0, v1

    .line 15
    iget v1, p0, Lorg/apache/tika/fork/ForkParser;->poolSize:I

    .line 16
    .line 17
    if-ge v0, v1, :cond_1

    .line 18
    .line 19
    if-eqz p2, :cond_1

    .line 20
    .line 21
    iget p2, p0, Lorg/apache/tika/fork/ForkParser;->maxFilesProcessedPerClient:I

    .line 22
    .line 23
    if-lez p2, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1}, Lorg/apache/tika/fork/ForkClient;->getFilesProcessed()I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    iget v0, p0, Lorg/apache/tika/fork/ForkParser;->maxFilesProcessedPerClient:I

    .line 30
    .line 31
    if-lt p2, v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {p1}, Lorg/apache/tika/fork/ForkClient;->close()V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    goto :goto_2

    .line 39
    :cond_0
    iget-object p2, p0, Lorg/apache/tika/fork/ForkParser;->pool:Ljava/util/Queue;

    .line 40
    .line 41
    invoke-interface {p2, p1}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    invoke-virtual {p1}, Lorg/apache/tika/fork/ForkClient;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    :goto_1
    monitor-exit p0

    .line 52
    return-void

    .line 53
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    throw p1
.end method


# virtual methods
.method public declared-synchronized close()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lorg/apache/tika/fork/ForkParser;->pool:Ljava/util/Queue;

    .line 3
    .line 4
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lorg/apache/tika/fork/ForkClient;

    .line 19
    .line 20
    invoke-virtual {v1}, Lorg/apache/tika/fork/ForkClient;->close()V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    iget-object v0, p0, Lorg/apache/tika/fork/ForkParser;->pool:Ljava/util/Queue;

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iput v0, p0, Lorg/apache/tika/fork/ForkParser;->poolSize:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    monitor-exit p0

    .line 35
    return-void

    .line 36
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    throw v0
.end method

.method public getJavaCommandAsList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/apache/tika/fork/ForkParser;->java:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public declared-synchronized getPoolSize()I
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Lorg/apache/tika/fork/ForkParser;->poolSize:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw v0
.end method

.method public getSupportedTypes(Lorg/apache/tika/parser/ParseContext;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/tika/parser/ParseContext;",
            ")",
            "Ljava/util/Set<",
            "Lorg/apache/tika/mime/MediaType;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/apache/tika/fork/ForkParser;->parser:Lorg/apache/tika/parser/Parser;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lorg/apache/tika/parser/Parser;->getSupportedTypes(Lorg/apache/tika/parser/ParseContext;)Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public parse(Ljava/io/InputStream;Lorg/xml/sax/ContentHandler;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)V
    .locals 6

    .line 1
    if-eqz p1, :cond_5

    .line 2
    .line 3
    invoke-direct {p0}, Lorg/apache/tika/fork/ForkParser;->acquireClient()Lorg/apache/tika/fork/ForkClient;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    :try_start_0
    instance-of v3, p2, Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance v3, Lorg/apache/tika/sax/TeeContentHandler;

    .line 15
    .line 16
    new-instance v4, Lorg/apache/tika/fork/MetadataContentHandler;

    .line 17
    .line 18
    invoke-direct {v4, p3}, Lorg/apache/tika/fork/MetadataContentHandler;-><init>(Lorg/apache/tika/metadata/Metadata;)V

    .line 19
    .line 20
    .line 21
    const/4 v5, 0x2

    .line 22
    new-array v5, v5, [Lorg/xml/sax/ContentHandler;

    .line 23
    .line 24
    aput-object p2, v5, v1

    .line 25
    .line 26
    aput-object v4, v5, v2

    .line 27
    .line 28
    invoke-direct {v3, v5}, Lorg/apache/tika/sax/TeeContentHandler;-><init>([Lorg/xml/sax/ContentHandler;)V

    .line 29
    .line 30
    .line 31
    move-object p2, v3

    .line 32
    :goto_0
    const-string v3, "parse"

    .line 33
    .line 34
    filled-new-array {p1, p2, p3, p4}, [Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {v0, v3, p1}, Lorg/apache/tika/fork/ForkClient;->call(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 39
    .line 40
    .line 41
    move-result-object p1
    :try_end_0
    .catch Lorg/apache/tika/exception/TikaException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    invoke-direct {p0, v0, v2}, Lorg/apache/tika/fork/ForkParser;->releaseClient(Lorg/apache/tika/fork/ForkClient;Z)V

    .line 43
    .line 44
    .line 45
    instance-of p2, p1, Ljava/io/IOException;

    .line 46
    .line 47
    if-nez p2, :cond_4

    .line 48
    .line 49
    instance-of p2, p1, Lorg/xml/sax/SAXException;

    .line 50
    .line 51
    if-nez p2, :cond_3

    .line 52
    .line 53
    instance-of p2, p1, Lorg/apache/tika/exception/TikaException;

    .line 54
    .line 55
    if-nez p2, :cond_2

    .line 56
    .line 57
    if-nez p1, :cond_1

    .line 58
    .line 59
    return-void

    .line 60
    :cond_1
    new-instance p2, Lorg/apache/tika/exception/TikaException;

    .line 61
    .line 62
    const-string p3, "Unexpected error in forked server process"

    .line 63
    .line 64
    invoke-direct {p2, p3, p1}, Lorg/apache/tika/exception/TikaException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    throw p2

    .line 68
    :cond_2
    check-cast p1, Lorg/apache/tika/exception/TikaException;

    .line 69
    .line 70
    throw p1

    .line 71
    :cond_3
    check-cast p1, Lorg/xml/sax/SAXException;

    .line 72
    .line 73
    throw p1

    .line 74
    :cond_4
    check-cast p1, Ljava/io/IOException;

    .line 75
    .line 76
    throw p1

    .line 77
    :catchall_0
    move-exception p1

    .line 78
    goto :goto_3

    .line 79
    :catch_0
    move-exception p1

    .line 80
    goto :goto_1

    .line 81
    :catch_1
    move-exception p1

    .line 82
    goto :goto_2

    .line 83
    :goto_1
    :try_start_1
    new-instance p2, Lorg/apache/tika/exception/TikaException;

    .line 84
    .line 85
    const-string p3, "Failed to communicate with a forked parser process. The process has most likely crashed due to some error like running out of memory. A new process will be started for the next parsing request."

    .line 86
    .line 87
    invoke-direct {p2, p3, p1}, Lorg/apache/tika/exception/TikaException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 88
    .line 89
    .line 90
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 91
    :goto_2
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 92
    :catchall_1
    move-exception p1

    .line 93
    move v1, v2

    .line 94
    :goto_3
    invoke-direct {p0, v0, v1}, Lorg/apache/tika/fork/ForkParser;->releaseClient(Lorg/apache/tika/fork/ForkClient;Z)V

    .line 95
    .line 96
    .line 97
    throw p1

    .line 98
    :cond_5
    new-instance p1, Ljava/lang/NullPointerException;

    .line 99
    .line 100
    const-string p2, "null stream"

    .line 101
    .line 102
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw p1
.end method

.method public setJavaCommand(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lorg/apache/tika/fork/ForkParser;->java:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method

.method public setMaxFilesProcessedPerServer(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/apache/tika/fork/ForkParser;->maxFilesProcessedPerClient:I

    .line 2
    .line 3
    return-void
.end method

.method public declared-synchronized setPoolSize(I)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput p1, p0, Lorg/apache/tika/fork/ForkParser;->poolSize:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-void

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
.end method

.method public setServerParseTimeoutMillis(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lorg/apache/tika/fork/ForkParser;->serverParseTimeoutMillis:J

    .line 2
    .line 3
    return-void
.end method

.method public setServerPulseMillis(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lorg/apache/tika/fork/ForkParser;->serverPulseMillis:J

    .line 2
    .line 3
    return-void
.end method

.method public setServerWaitTimeoutMillis(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lorg/apache/tika/fork/ForkParser;->serverWaitTimeoutMillis:J

    .line 2
    .line 3
    return-void
.end method

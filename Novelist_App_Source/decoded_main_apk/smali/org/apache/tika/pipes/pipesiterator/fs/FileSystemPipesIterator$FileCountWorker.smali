.class Lorg/apache/tika/pipes/pipesiterator/fs/FileSystemPipesIterator$FileCountWorker;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/apache/tika/pipes/pipesiterator/TotalCounter;
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/tika/pipes/pipesiterator/fs/FileSystemPipesIterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "FileCountWorker"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/tika/pipes/pipesiterator/fs/FileSystemPipesIterator$FileCountWorker$FSFileCounter;
    }
.end annotation


# instance fields
.field private final basePath:Ljava/nio/file/Path;

.field private finalResult:Lorg/apache/tika/pipes/pipesiterator/TotalCountResult;

.field private status:Lorg/apache/tika/pipes/pipesiterator/TotalCountResult$STATUS;

.field private final totalCount:Ljava/util/concurrent/atomic/AtomicLong;

.field private totalCounterThread:Ljava/lang/Thread;


# direct methods
.method public constructor <init>(Ljava/nio/file/Path;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 5
    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lorg/apache/tika/pipes/pipesiterator/fs/FileSystemPipesIterator$FileCountWorker;->totalCount:Ljava/util/concurrent/atomic/AtomicLong;

    .line 12
    .line 13
    iput-object p1, p0, Lorg/apache/tika/pipes/pipesiterator/fs/FileSystemPipesIterator$FileCountWorker;->basePath:Ljava/nio/file/Path;

    .line 14
    .line 15
    sget-object p1, Lorg/apache/tika/pipes/pipesiterator/TotalCountResult$STATUS;->NOT_COMPLETED:Lorg/apache/tika/pipes/pipesiterator/TotalCountResult$STATUS;

    .line 16
    .line 17
    iput-object p1, p0, Lorg/apache/tika/pipes/pipesiterator/fs/FileSystemPipesIterator$FileCountWorker;->status:Lorg/apache/tika/pipes/pipesiterator/TotalCountResult$STATUS;

    .line 18
    .line 19
    return-void
.end method

.method public static synthetic a(Lorg/apache/tika/pipes/pipesiterator/fs/FileSystemPipesIterator$FileCountWorker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/apache/tika/pipes/pipesiterator/fs/FileSystemPipesIterator$FileCountWorker;->lambda$startTotalCount$0()V

    return-void
.end method

.method private synthetic lambda$startTotalCount$0()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lorg/apache/tika/pipes/pipesiterator/fs/FileSystemPipesIterator$FileCountWorker;->basePath:Ljava/nio/file/Path;

    .line 2
    .line 3
    new-instance v1, Lorg/apache/tika/pipes/pipesiterator/fs/FileSystemPipesIterator$FileCountWorker$FSFileCounter;

    .line 4
    .line 5
    iget-object v2, p0, Lorg/apache/tika/pipes/pipesiterator/fs/FileSystemPipesIterator$FileCountWorker;->totalCount:Ljava/util/concurrent/atomic/AtomicLong;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v1, v2, v3}, Lorg/apache/tika/pipes/pipesiterator/fs/FileSystemPipesIterator$FileCountWorker$FSFileCounter;-><init>(Ljava/util/concurrent/atomic/AtomicLong;I)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lorg/apache/tika/fork/a;->u(Ljava/nio/file/Path;Ljava/nio/file/FileVisitor;)V

    .line 12
    .line 13
    .line 14
    sget-object v0, Lorg/apache/tika/pipes/pipesiterator/TotalCountResult$STATUS;->COMPLETED:Lorg/apache/tika/pipes/pipesiterator/TotalCountResult$STATUS;

    .line 15
    .line 16
    iput-object v0, p0, Lorg/apache/tika/pipes/pipesiterator/fs/FileSystemPipesIterator$FileCountWorker;->status:Lorg/apache/tika/pipes/pipesiterator/TotalCountResult$STATUS;

    .line 17
    .line 18
    new-instance v0, Lorg/apache/tika/pipes/pipesiterator/TotalCountResult;

    .line 19
    .line 20
    iget-object v1, p0, Lorg/apache/tika/pipes/pipesiterator/fs/FileSystemPipesIterator$FileCountWorker;->totalCount:Ljava/util/concurrent/atomic/AtomicLong;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 23
    .line 24
    .line 25
    move-result-wide v1

    .line 26
    iget-object v3, p0, Lorg/apache/tika/pipes/pipesiterator/fs/FileSystemPipesIterator$FileCountWorker;->status:Lorg/apache/tika/pipes/pipesiterator/TotalCountResult$STATUS;

    .line 27
    .line 28
    invoke-direct {v0, v1, v2, v3}, Lorg/apache/tika/pipes/pipesiterator/TotalCountResult;-><init>(JLorg/apache/tika/pipes/pipesiterator/TotalCountResult$STATUS;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lorg/apache/tika/pipes/pipesiterator/fs/FileSystemPipesIterator$FileCountWorker;->finalResult:Lorg/apache/tika/pipes/pipesiterator/TotalCountResult;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    return-void

    .line 34
    :catch_0
    move-exception v0

    .line 35
    invoke-static {}, Lorg/apache/tika/pipes/pipesiterator/fs/FileSystemPipesIterator;->f()LF2/b;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const-string v2, "problem counting files"

    .line 40
    .line 41
    invoke-interface {v1, v2, v0}, LF2/b;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    sget-object v0, Lorg/apache/tika/pipes/pipesiterator/TotalCountResult$STATUS;->EXCEPTION:Lorg/apache/tika/pipes/pipesiterator/TotalCountResult$STATUS;

    .line 45
    .line 46
    iput-object v0, p0, Lorg/apache/tika/pipes/pipesiterator/fs/FileSystemPipesIterator$FileCountWorker;->status:Lorg/apache/tika/pipes/pipesiterator/TotalCountResult$STATUS;

    .line 47
    .line 48
    new-instance v0, Lorg/apache/tika/pipes/pipesiterator/TotalCountResult;

    .line 49
    .line 50
    iget-object v1, p0, Lorg/apache/tika/pipes/pipesiterator/fs/FileSystemPipesIterator$FileCountWorker;->totalCount:Ljava/util/concurrent/atomic/AtomicLong;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 53
    .line 54
    .line 55
    move-result-wide v1

    .line 56
    iget-object v3, p0, Lorg/apache/tika/pipes/pipesiterator/fs/FileSystemPipesIterator$FileCountWorker;->status:Lorg/apache/tika/pipes/pipesiterator/TotalCountResult$STATUS;

    .line 57
    .line 58
    invoke-direct {v0, v1, v2, v3}, Lorg/apache/tika/pipes/pipesiterator/TotalCountResult;-><init>(JLorg/apache/tika/pipes/pipesiterator/TotalCountResult$STATUS;)V

    .line 59
    .line 60
    .line 61
    iput-object v0, p0, Lorg/apache/tika/pipes/pipesiterator/fs/FileSystemPipesIterator$FileCountWorker;->finalResult:Lorg/apache/tika/pipes/pipesiterator/TotalCountResult;

    .line 62
    .line 63
    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/pipesiterator/fs/FileSystemPipesIterator$FileCountWorker;->totalCounterThread:Ljava/lang/Thread;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public getTotalCount()Lorg/apache/tika/pipes/pipesiterator/TotalCountResult;
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/pipesiterator/fs/FileSystemPipesIterator$FileCountWorker;->finalResult:Lorg/apache/tika/pipes/pipesiterator/TotalCountResult;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Lorg/apache/tika/pipes/pipesiterator/TotalCountResult;

    .line 7
    .line 8
    iget-object v1, p0, Lorg/apache/tika/pipes/pipesiterator/fs/FileSystemPipesIterator$FileCountWorker;->totalCount:Ljava/util/concurrent/atomic/AtomicLong;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    iget-object v3, p0, Lorg/apache/tika/pipes/pipesiterator/fs/FileSystemPipesIterator$FileCountWorker;->status:Lorg/apache/tika/pipes/pipesiterator/TotalCountResult$STATUS;

    .line 15
    .line 16
    invoke-direct {v0, v1, v2, v3}, Lorg/apache/tika/pipes/pipesiterator/TotalCountResult;-><init>(JLorg/apache/tika/pipes/pipesiterator/TotalCountResult$STATUS;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public startTotalCount()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/Thread;

    .line 2
    .line 3
    new-instance v1, Lorg/apache/tika/pipes/pipesiterator/fs/b;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lorg/apache/tika/pipes/pipesiterator/fs/b;-><init>(Lorg/apache/tika/pipes/pipesiterator/fs/FileSystemPipesIterator$FileCountWorker;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lorg/apache/tika/pipes/pipesiterator/fs/FileSystemPipesIterator$FileCountWorker;->totalCounterThread:Ljava/lang/Thread;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lorg/apache/tika/pipes/pipesiterator/fs/FileSystemPipesIterator$FileCountWorker;->totalCounterThread:Ljava/lang/Thread;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

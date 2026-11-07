.class public Lorg/apache/tika/utils/ProcessUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final PROCESS_MAP:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Process;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lorg/apache/tika/utils/ProcessUtils;->PROCESS_MAP:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Ljava/lang/Thread;

    .line 13
    .line 14
    new-instance v2, Lorg/apache/tika/parser/a;

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    invoke-direct {v2, v3}, Lorg/apache/tika/parser/a;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/Runtime;->addShutdownHook(Ljava/lang/Thread;)V

    .line 24
    .line 25
    .line 26
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

.method public static synthetic a()V
    .locals 0

    .line 1
    invoke-static {}, Lorg/apache/tika/utils/ProcessUtils;->lambda$static$0()V

    return-void
.end method

.method public static escapeCommandLine(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-object p0

    .line 4
    :cond_0
    const-string v0, " "

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    sget-boolean v0, Lorg/apache/tika/utils/SystemUtils;->IS_OS_WINDOWS:Z

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    const-string v0, "\""

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    invoke-static {v0, p0, v0}, Lt/a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    :cond_1
    return-object p0
.end method

.method public static execute(Ljava/lang/ProcessBuilder;JII)Lorg/apache/tika/utils/FileProcessResult;
    .locals 11

    .line 1
    const-string v0, "\n"

    const/4 v1, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/ProcessBuilder;->start()Ljava/lang/Process;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 3
    :try_start_1
    invoke-static {p0}, Lorg/apache/tika/utils/ProcessUtils;->register(Ljava/lang/Process;)Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 5
    new-instance v4, Lorg/apache/tika/utils/StreamGobbler;

    invoke-virtual {p0}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v5

    invoke-direct {v4, v5, p3}, Lorg/apache/tika/utils/StreamGobbler;-><init>(Ljava/io/InputStream;I)V

    .line 6
    new-instance p3, Lorg/apache/tika/utils/StreamGobbler;

    invoke-virtual {p0}, Ljava/lang/Process;->getErrorStream()Ljava/io/InputStream;

    move-result-object v5

    invoke-direct {p3, v5, p4}, Lorg/apache/tika/utils/StreamGobbler;-><init>(Ljava/io/InputStream;I)V

    .line 7
    new-instance p4, Ljava/lang/Thread;

    invoke-direct {p4, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 8
    invoke-virtual {p4}, Ljava/lang/Thread;->start()V

    .line 9
    new-instance v5, Ljava/lang/Thread;

    invoke-direct {v5, p3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 10
    invoke-virtual {v5}, Ljava/lang/Thread;->start()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const-wide/16 v6, -0x1

    const/4 v8, 0x0

    .line 11
    :try_start_2
    sget-object v9, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p0, p1, p2}, Lorg/apache/tika/pipes/pipesiterator/fs/a;->t(Ljava/lang/Process;J)Z

    move-result v8

    .line 12
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    sub-long v6, p1, v2

    const-wide/16 p1, 0x3e8

    if-eqz v8, :cond_0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Process;->exitValue()I

    move-result v2

    .line 14
    invoke-virtual {p4, p1, p2}, Ljava/lang/Thread;->join(J)V

    .line 15
    invoke-virtual {v5, p1, p2}, Ljava/lang/Thread;->join(J)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 16
    :cond_0
    invoke-static {p0}, Lorg/apache/tika/fork/a;->r(Ljava/lang/Process;)V

    .line 17
    invoke-virtual {p4, p1, p2}, Ljava/lang/Thread;->join(J)V

    .line 18
    invoke-virtual {v5, p1, p2}, Ljava/lang/Thread;->join(J)V

    .line 19
    invoke-static {p0}, Lorg/apache/tika/pipes/pipesiterator/fs/a;->s(Ljava/lang/Process;)Z

    move-result p1
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz p1, :cond_1

    .line 20
    :try_start_3
    invoke-virtual {p0}, Ljava/lang/Process;->exitValue()I

    move-result v2
    :try_end_3
    .catch Ljava/lang/IllegalThreadStateException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :catch_0
    :cond_1
    const/4 v2, -0x1

    .line 21
    :goto_0
    :try_start_4
    invoke-virtual {p4}, Ljava/lang/Thread;->interrupt()V

    .line 22
    invoke-virtual {v5}, Ljava/lang/Thread;->interrupt()V

    goto :goto_2

    :catchall_1
    move-exception p1

    move-object v10, v1

    move-object v1, p0

    move-object p0, v10

    goto :goto_3

    .line 23
    :goto_1
    invoke-virtual {p4}, Ljava/lang/Thread;->interrupt()V

    .line 24
    invoke-virtual {v5}, Ljava/lang/Thread;->interrupt()V

    .line 25
    throw p1

    .line 26
    :catch_1
    invoke-virtual {p4}, Ljava/lang/Thread;->interrupt()V

    .line 27
    invoke-virtual {v5}, Ljava/lang/Thread;->interrupt()V

    const/16 v2, -0x3e8

    .line 28
    :goto_2
    new-instance p1, Lorg/apache/tika/utils/FileProcessResult;

    invoke-direct {p1}, Lorg/apache/tika/utils/FileProcessResult;-><init>()V

    .line 29
    iput-wide v6, p1, Lorg/apache/tika/utils/FileProcessResult;->processTimeMillis:J

    .line 30
    invoke-virtual {p3}, Lorg/apache/tika/utils/StreamGobbler;->getStreamLength()J

    move-result-wide v5

    iput-wide v5, p1, Lorg/apache/tika/utils/FileProcessResult;->stderrLength:J

    .line 31
    invoke-virtual {v4}, Lorg/apache/tika/utils/StreamGobbler;->getStreamLength()J

    move-result-wide v5

    iput-wide v5, p1, Lorg/apache/tika/utils/FileProcessResult;->stdoutLength:J

    xor-int/lit8 p2, v8, 0x1

    .line 32
    iput-boolean p2, p1, Lorg/apache/tika/utils/FileProcessResult;->isTimeout:Z

    .line 33
    iput v2, p1, Lorg/apache/tika/utils/FileProcessResult;->exitValue:I

    .line 34
    invoke-virtual {v4}, Lorg/apache/tika/utils/StreamGobbler;->getLines()Ljava/util/List;

    move-result-object p2

    invoke-static {v0, p2}, Lorg/apache/tika/utils/StringUtils;->joinWith(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p1, Lorg/apache/tika/utils/FileProcessResult;->stdout:Ljava/lang/String;

    .line 35
    invoke-virtual {p3}, Lorg/apache/tika/utils/StreamGobbler;->getLines()Ljava/util/List;

    move-result-object p2

    invoke-static {v0, p2}, Lorg/apache/tika/utils/StringUtils;->joinWith(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p1, Lorg/apache/tika/utils/FileProcessResult;->stderr:Ljava/lang/String;

    .line 36
    invoke-virtual {v4}, Lorg/apache/tika/utils/StreamGobbler;->getIsTruncated()Z

    move-result p2

    iput-boolean p2, p1, Lorg/apache/tika/utils/FileProcessResult;->stdoutTruncated:Z

    .line 37
    invoke-virtual {p3}, Lorg/apache/tika/utils/StreamGobbler;->getIsTruncated()Z

    move-result p2

    iput-boolean p2, p1, Lorg/apache/tika/utils/FileProcessResult;->stderrTruncated:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 38
    invoke-static {p0}, Lorg/apache/tika/fork/a;->r(Ljava/lang/Process;)V

    if-eqz v1, :cond_2

    .line 39
    invoke-static {v1}, Lorg/apache/tika/utils/ProcessUtils;->release(Ljava/lang/String;)Ljava/lang/Process;

    :cond_2
    return-object p1

    :catchall_2
    move-exception p1

    move-object p0, v1

    :goto_3
    if-eqz v1, :cond_3

    .line 40
    invoke-static {v1}, Lorg/apache/tika/fork/a;->r(Ljava/lang/Process;)V

    :cond_3
    if-eqz p0, :cond_4

    .line 41
    invoke-static {p0}, Lorg/apache/tika/utils/ProcessUtils;->release(Ljava/lang/String;)Ljava/lang/Process;

    .line 42
    :cond_4
    throw p1
.end method

.method public static execute(Ljava/lang/ProcessBuilder;JLjava/nio/file/Path;I)Lorg/apache/tika/utils/FileProcessResult;
    .locals 9

    .line 43
    invoke-static {p3}, Lorg/apache/tika/pipes/pipesiterator/fs/a;->h(Ljava/nio/file/Path;)Ljava/nio/file/Path;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/nio/file/LinkOption;

    invoke-static {v0, v2}, LB/a;->z(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 44
    invoke-static {p3}, Lorg/apache/tika/pipes/pipesiterator/fs/a;->h(Ljava/nio/file/Path;)Ljava/nio/file/Path;

    move-result-object v0

    new-array v2, v1, [Ljava/nio/file/attribute/FileAttribute;

    invoke-static {v0, v2}, Lorg/apache/tika/pipes/pipesiterator/fs/a;->p(Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)V

    .line 45
    :cond_0
    invoke-static {p3}, Lio/flutter/plugin/editing/i;->e(Ljava/nio/file/Path;)Ljava/io/File;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/tika/pipes/pipesiterator/fs/a;->o(Ljava/lang/ProcessBuilder;Ljava/io/File;)V

    const/4 v0, 0x0

    .line 46
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/ProcessBuilder;->start()Ljava/lang/Process;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 47
    :try_start_1
    invoke-static {p0}, Lorg/apache/tika/utils/ProcessUtils;->register(Ljava/lang/Process;)Ljava/lang/String;

    move-result-object v0

    .line 48
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 49
    new-instance v4, Lorg/apache/tika/utils/StreamGobbler;

    invoke-virtual {p0}, Ljava/lang/Process;->getErrorStream()Ljava/io/InputStream;

    move-result-object v5

    invoke-direct {v4, v5, p4}, Lorg/apache/tika/utils/StreamGobbler;-><init>(Ljava/io/InputStream;I)V

    .line 50
    new-instance p4, Ljava/lang/Thread;

    invoke-direct {p4, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 51
    invoke-virtual {p4}, Ljava/lang/Thread;->start()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-wide/16 v5, -0x1

    .line 52
    :try_start_2
    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p0, p1, p2}, Lorg/apache/tika/pipes/pipesiterator/fs/a;->t(Ljava/lang/Process;J)Z

    move-result p1
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 53
    :try_start_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    sub-long/2addr v5, v2

    const-wide/16 v2, 0x3e8

    if-eqz p1, :cond_1

    .line 54
    invoke-virtual {p0}, Ljava/lang/Process;->exitValue()I

    move-result p2

    .line 55
    invoke-virtual {p4, v2, v3}, Ljava/lang/Thread;->join(J)V

    goto :goto_0

    :catchall_0
    move-exception p1

    move-object v8, v0

    move-object v0, p0

    move-object p0, v8

    goto :goto_1

    .line 56
    :cond_1
    invoke-static {p0}, Lorg/apache/tika/fork/a;->r(Ljava/lang/Process;)V

    .line 57
    invoke-virtual {p4, v2, v3}, Ljava/lang/Thread;->join(J)V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const/4 p2, -0x1

    goto :goto_0

    :catch_0
    move p1, v1

    :catch_1
    const/16 p2, -0x3e8

    .line 58
    :goto_0
    :try_start_4
    new-instance p4, Lorg/apache/tika/utils/FileProcessResult;

    invoke-direct {p4}, Lorg/apache/tika/utils/FileProcessResult;-><init>()V

    .line 59
    iput-wide v5, p4, Lorg/apache/tika/utils/FileProcessResult;->processTimeMillis:J

    .line 60
    invoke-virtual {v4}, Lorg/apache/tika/utils/StreamGobbler;->getStreamLength()J

    move-result-wide v2

    iput-wide v2, p4, Lorg/apache/tika/utils/FileProcessResult;->stderrLength:J

    .line 61
    invoke-static {p3}, Lorg/apache/tika/fork/a;->a(Ljava/nio/file/Path;)J

    move-result-wide v2

    iput-wide v2, p4, Lorg/apache/tika/utils/FileProcessResult;->stdoutLength:J

    xor-int/lit8 p1, p1, 0x1

    .line 62
    iput-boolean p1, p4, Lorg/apache/tika/utils/FileProcessResult;->isTimeout:Z

    .line 63
    iput p2, p4, Lorg/apache/tika/utils/FileProcessResult;->exitValue:I

    .line 64
    const-string p1, ""

    iput-object p1, p4, Lorg/apache/tika/utils/FileProcessResult;->stdout:Ljava/lang/String;

    .line 65
    const-string p1, "\n"

    invoke-virtual {v4}, Lorg/apache/tika/utils/StreamGobbler;->getLines()Ljava/util/List;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/tika/utils/StringUtils;->joinWith(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p4, Lorg/apache/tika/utils/FileProcessResult;->stderr:Ljava/lang/String;

    .line 66
    iput-boolean v1, p4, Lorg/apache/tika/utils/FileProcessResult;->stdoutTruncated:Z

    .line 67
    invoke-virtual {v4}, Lorg/apache/tika/utils/StreamGobbler;->getIsTruncated()Z

    move-result p1

    iput-boolean p1, p4, Lorg/apache/tika/utils/FileProcessResult;->stderrTruncated:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 68
    invoke-static {p0}, Lorg/apache/tika/fork/a;->r(Ljava/lang/Process;)V

    .line 69
    invoke-static {v0}, Lorg/apache/tika/utils/ProcessUtils;->release(Ljava/lang/String;)Ljava/lang/Process;

    return-object p4

    :catchall_1
    move-exception p1

    move-object p0, v0

    :goto_1
    if-eqz v0, :cond_2

    .line 70
    invoke-static {v0}, Lorg/apache/tika/fork/a;->r(Ljava/lang/Process;)V

    .line 71
    :cond_2
    invoke-static {p0}, Lorg/apache/tika/utils/ProcessUtils;->release(Ljava/lang/String;)Ljava/lang/Process;

    .line 72
    throw p1
.end method

.method private static synthetic lambda$static$0()V
    .locals 4

    .line 1
    sget-object v0, Lorg/apache/tika/utils/ProcessUtils;->PROCESS_MAP:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    new-instance v1, Lorg/apache/tika/mime/a;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-direct {v1, v2}, Lorg/apache/tika/mime/a;-><init>(I)V

    .line 7
    .line 8
    .line 9
    const-wide/16 v2, 0x1

    .line 10
    .line 11
    invoke-virtual {v0, v2, v3, v1}, Ljava/util/concurrent/ConcurrentHashMap;->forEachValue(JLjava/util/function/Consumer;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private static register(Ljava/lang/Process;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lorg/apache/tika/utils/ProcessUtils;->PROCESS_MAP:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    invoke-virtual {v1, v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method private static release(Ljava/lang/String;)Ljava/lang/Process;
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/tika/utils/ProcessUtils;->PROCESS_MAP:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Process;

    .line 8
    .line 9
    return-object p0
.end method

.method public static unescapeCommandLine(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, " "

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-boolean v0, Lorg/apache/tika/utils/SystemUtils;->IS_OS_WINDOWS:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string v0, "\""

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const/4 v1, 0x1

    .line 32
    sub-int/2addr v0, v1

    .line 33
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    :cond_0
    return-object p0
.end method

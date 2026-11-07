.class public Lorg/apache/tika/pipes/pipesiterator/filelist/FileListPipesIterator;
.super Lorg/apache/tika/pipes/pipesiterator/PipesIterator;
.source "SourceFile"

# interfaces
.implements Lorg/apache/tika/config/Initializable;


# instance fields
.field private fileList:Ljava/lang/String;
    .annotation runtime Lorg/apache/tika/config/Field;
    .end annotation
.end field

.field private fileListPath:Ljava/nio/file/Path;

.field private hasHeader:Z
    .annotation runtime Lorg/apache/tika/config/Field;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lorg/apache/tika/pipes/pipesiterator/filelist/FileListPipesIterator;->hasHeader:Z

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public checkInitialization(Lorg/apache/tika/config/InitializableProblemHandler;)V
    .locals 3

    .line 1
    const-string p1, "fileList"

    .line 2
    .line 3
    iget-object v0, p0, Lorg/apache/tika/pipes/pipesiterator/filelist/FileListPipesIterator;->fileList:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {p1, v0}, Lorg/apache/tika/config/TikaConfig;->mustNotBeEmpty(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string p1, "fetcherName"

    .line 9
    .line 10
    invoke-virtual {p0}, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->getFetcherName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {p1, v0}, Lorg/apache/tika/config/TikaConfig;->mustNotBeEmpty(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string p1, "emitterName"

    .line 18
    .line 19
    invoke-virtual {p0}, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->getFetcherName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {p1, v0}, Lorg/apache/tika/config/TikaConfig;->mustNotBeEmpty(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lorg/apache/tika/pipes/pipesiterator/filelist/FileListPipesIterator;->fileList:Ljava/lang/String;

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    new-array v1, v0, [Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {p1, v1}, Lio/flutter/plugin/editing/i;->k(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, Lorg/apache/tika/pipes/pipesiterator/filelist/FileListPipesIterator;->fileListPath:Ljava/nio/file/Path;

    .line 36
    .line 37
    new-array v0, v0, [Ljava/nio/file/LinkOption;

    .line 38
    .line 39
    invoke-static {p1, v0}, Lio/flutter/plugin/editing/i;->C(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_0

    .line 44
    .line 45
    return-void

    .line 46
    :cond_0
    new-instance p1, Lorg/apache/tika/exception/TikaConfigException;

    .line 47
    .line 48
    iget-object v0, p0, Lorg/apache/tika/pipes/pipesiterator/filelist/FileListPipesIterator;->fileList:Ljava/lang/String;

    .line 49
    .line 50
    const-string v1, "file list "

    .line 51
    .line 52
    const-string v2, " does not exist. Must specify an existing file"

    .line 53
    .line 54
    invoke-static {v1, v0, v2}, Lt/a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-direct {p1, v0}, Lorg/apache/tika/exception/TikaConfigException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p1
.end method

.method public enqueue()V
    .locals 9

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/pipesiterator/filelist/FileListPipesIterator;->fileListPath:Ljava/nio/file/Path;

    .line 2
    .line 3
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    invoke-static {v0}, LB/a;->A(Ljava/nio/file/Path;)Ljava/io/BufferedReader;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    :try_start_0
    iget-boolean v0, p0, Lorg/apache/tika/pipes/pipesiterator/filelist/FileListPipesIterator;->hasHeader:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    move-object v2, v0

    .line 19
    goto :goto_2

    .line 20
    :cond_0
    :goto_0
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    move-object v3, v0

    .line 25
    :goto_1
    if-eqz v3, :cond_2

    .line 26
    .line 27
    const-string v0, "#"

    .line 28
    .line 29
    invoke-virtual {v3, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    invoke-static {v3}, Lorg/apache/tika/utils/StringUtils;->isBlank(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    new-instance v4, Lorg/apache/tika/pipes/fetcher/FetchKey;

    .line 42
    .line 43
    invoke-virtual {p0}, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->getFetcherName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-direct {v4, v0, v3}, Lorg/apache/tika/pipes/fetcher/FetchKey;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    new-instance v5, Lorg/apache/tika/pipes/emitter/EmitKey;

    .line 51
    .line 52
    invoke-virtual {p0}, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->getEmitterName()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-direct {v5, v0, v3}, Lorg/apache/tika/pipes/emitter/EmitKey;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    new-instance v7, Lorg/apache/tika/parser/ParseContext;

    .line 60
    .line 61
    invoke-direct {v7}, Lorg/apache/tika/parser/ParseContext;-><init>()V

    .line 62
    .line 63
    .line 64
    const-class v0, Lorg/apache/tika/pipes/HandlerConfig;

    .line 65
    .line 66
    invoke-virtual {p0}, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->getHandlerConfig()Lorg/apache/tika/pipes/HandlerConfig;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v7, v0, v2}, Lorg/apache/tika/parser/ParseContext;->set(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    new-instance v2, Lorg/apache/tika/pipes/FetchEmitTuple;

    .line 74
    .line 75
    new-instance v6, Lorg/apache/tika/metadata/Metadata;

    .line 76
    .line 77
    invoke-direct {v6}, Lorg/apache/tika/metadata/Metadata;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->getOnParseException()Lorg/apache/tika/pipes/FetchEmitTuple$ON_PARSE_EXCEPTION;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    invoke-direct/range {v2 .. v8}, Lorg/apache/tika/pipes/FetchEmitTuple;-><init>(Ljava/lang/String;Lorg/apache/tika/pipes/fetcher/FetchKey;Lorg/apache/tika/pipes/emitter/EmitKey;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;Lorg/apache/tika/pipes/FetchEmitTuple$ON_PARSE_EXCEPTION;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, v2}, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->tryToAdd(Lorg/apache/tika/pipes/FetchEmitTuple;)V

    .line 88
    .line 89
    .line 90
    :cond_1
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    goto :goto_1

    .line 95
    :cond_2
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :goto_2
    if-eqz v1, :cond_3

    .line 100
    .line 101
    :try_start_1
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 102
    .line 103
    .line 104
    goto :goto_3

    .line 105
    :catchall_1
    move-exception v0

    .line 106
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 107
    .line 108
    .line 109
    :cond_3
    :goto_3
    throw v2
.end method

.method public setFileList(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lorg/apache/tika/config/Field;
    .end annotation

    .line 1
    iput-object p1, p0, Lorg/apache/tika/pipes/pipesiterator/filelist/FileListPipesIterator;->fileList:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setHasHeader(Z)V
    .locals 0
    .annotation runtime Lorg/apache/tika/config/Field;
    .end annotation

    .line 1
    iput-boolean p1, p0, Lorg/apache/tika/pipes/pipesiterator/filelist/FileListPipesIterator;->hasHeader:Z

    .line 2
    .line 3
    return-void
.end method

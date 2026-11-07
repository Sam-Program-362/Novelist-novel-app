.class public Lorg/apache/tika/detect/FileCommandDetector;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/apache/tika/detect/Detector;


# static fields
.field private static final DEFAULT_FILE_COMMAND_PATH:Ljava/lang/String; = "file"

.field private static final DEFAULT_TIMEOUT_MS:J = 0x1770L

.field public static FILE_MIME:Lorg/apache/tika/metadata/Property;

.field private static HAS_WARNED:Z

.field private static final LOGGER:LF2/b;


# instance fields
.field private fileCommandPath:Ljava/lang/String;

.field private hasFileCommand:Ljava/lang/Boolean;

.field private maxBytes:I

.field private timeoutMs:J

.field private useMime:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "file:mime"

    .line 2
    .line 3
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lorg/apache/tika/detect/FileCommandDetector;->FILE_MIME:Lorg/apache/tika/metadata/Property;

    .line 8
    .line 9
    const-class v0, Lorg/apache/tika/detect/FileCommandDetector;

    .line 10
    .line 11
    invoke-static {v0}, LF2/d;->b(Ljava/lang/Class;)LF2/b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lorg/apache/tika/detect/FileCommandDetector;->LOGGER:LF2/b;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    sput-boolean v0, Lorg/apache/tika/detect/FileCommandDetector;->HAS_WARNED:Z

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lorg/apache/tika/detect/FileCommandDetector;->hasFileCommand:Ljava/lang/Boolean;

    .line 6
    .line 7
    const-string v0, "file"

    .line 8
    .line 9
    iput-object v0, p0, Lorg/apache/tika/detect/FileCommandDetector;->fileCommandPath:Ljava/lang/String;

    .line 10
    .line 11
    const v0, 0xf4240

    .line 12
    .line 13
    .line 14
    iput v0, p0, Lorg/apache/tika/detect/FileCommandDetector;->maxBytes:I

    .line 15
    .line 16
    const-wide/16 v0, 0x1770

    .line 17
    .line 18
    iput-wide v0, p0, Lorg/apache/tika/detect/FileCommandDetector;->timeoutMs:J

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput-boolean v0, p0, Lorg/apache/tika/detect/FileCommandDetector;->useMime:Z

    .line 22
    .line 23
    return-void
.end method

.method public static checkHasFile()Z
    .locals 1

    .line 1
    const-string v0, "file"

    invoke-static {v0}, Lorg/apache/tika/detect/FileCommandDetector;->checkHasFile(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static checkHasFile(Ljava/lang/String;)Z
    .locals 1

    .line 2
    const-string v0, "-v"

    filled-new-array {p0, v0}, [Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    .line 3
    new-array v0, v0, [I

    invoke-static {p0, v0}, Lorg/apache/tika/parser/external/ExternalParser;->check([Ljava/lang/String;[I)Z

    move-result p0

    return p0
.end method

.method private detectOnPath(Ljava/nio/file/Path;Lorg/apache/tika/metadata/Metadata;)Lorg/apache/tika/mime/MediaType;
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/apache/tika/detect/FileCommandDetector;->fileCommandPath:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lorg/apache/tika/utils/ProcessUtils;->escapeCommandLine(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1}, Lio/flutter/plugin/editing/i;->l(Ljava/nio/file/Path;)Ljava/nio/file/Path;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Lio/flutter/plugin/editing/i;->i(Ljava/nio/file/Path;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, Lorg/apache/tika/utils/ProcessUtils;->escapeCommandLine(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string v1, "-b"

    .line 20
    .line 21
    const-string v2, "--mime-type"

    .line 22
    .line 23
    filled-new-array {v0, v1, v2, p1}, [Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    new-instance v0, Ljava/lang/ProcessBuilder;

    .line 28
    .line 29
    invoke-direct {v0, p1}, Ljava/lang/ProcessBuilder;-><init>([Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-wide v1, p0, Lorg/apache/tika/detect/FileCommandDetector;->timeoutMs:J

    .line 33
    .line 34
    const/16 p1, 0x2710

    .line 35
    .line 36
    invoke-static {v0, v1, v2, p1, p1}, Lorg/apache/tika/utils/ProcessUtils;->execute(Ljava/lang/ProcessBuilder;JII)Lorg/apache/tika/utils/FileProcessResult;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, Lorg/apache/tika/utils/FileProcessResult;->isTimeout()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    sget-object p1, Lorg/apache/tika/metadata/ExternalProcess;->IS_TIMEOUT:Lorg/apache/tika/metadata/Property;

    .line 47
    .line 48
    const/4 v0, 0x1

    .line 49
    invoke-virtual {p2, p1, v0}, Lorg/apache/tika/metadata/Metadata;->set(Lorg/apache/tika/metadata/Property;Z)V

    .line 50
    .line 51
    .line 52
    sget-object p1, Lorg/apache/tika/mime/MediaType;->OCTET_STREAM:Lorg/apache/tika/mime/MediaType;

    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_0
    invoke-virtual {p1}, Lorg/apache/tika/utils/FileProcessResult;->getExitValue()I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_1

    .line 60
    .line 61
    sget-object v0, Lorg/apache/tika/metadata/ExternalProcess;->EXIT_VALUE:Lorg/apache/tika/metadata/Property;

    .line 62
    .line 63
    invoke-virtual {p1}, Lorg/apache/tika/utils/FileProcessResult;->getExitValue()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    invoke-virtual {p2, v0, p1}, Lorg/apache/tika/metadata/Metadata;->set(Lorg/apache/tika/metadata/Property;I)V

    .line 68
    .line 69
    .line 70
    sget-object p1, Lorg/apache/tika/mime/MediaType;->OCTET_STREAM:Lorg/apache/tika/mime/MediaType;

    .line 71
    .line 72
    return-object p1

    .line 73
    :cond_1
    invoke-virtual {p1}, Lorg/apache/tika/utils/FileProcessResult;->getStdout()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-static {p1}, Lorg/apache/tika/utils/StringUtils;->isBlank(Ljava/lang/String;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_2

    .line 82
    .line 83
    sget-object p1, Lorg/apache/tika/mime/MediaType;->OCTET_STREAM:Lorg/apache/tika/mime/MediaType;

    .line 84
    .line 85
    return-object p1

    .line 86
    :cond_2
    sget-object v0, Lorg/apache/tika/detect/FileCommandDetector;->FILE_MIME:Lorg/apache/tika/metadata/Property;

    .line 87
    .line 88
    invoke-virtual {p2, v0, p1}, Lorg/apache/tika/metadata/Metadata;->set(Lorg/apache/tika/metadata/Property;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    iget-boolean p2, p0, Lorg/apache/tika/detect/FileCommandDetector;->useMime:Z

    .line 92
    .line 93
    if-eqz p2, :cond_4

    .line 94
    .line 95
    invoke-static {p1}, Lorg/apache/tika/mime/MediaType;->parse(Ljava/lang/String;)Lorg/apache/tika/mime/MediaType;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    if-nez p1, :cond_3

    .line 100
    .line 101
    sget-object p1, Lorg/apache/tika/mime/MediaType;->OCTET_STREAM:Lorg/apache/tika/mime/MediaType;

    .line 102
    .line 103
    :cond_3
    return-object p1

    .line 104
    :cond_4
    sget-object p1, Lorg/apache/tika/mime/MediaType;->OCTET_STREAM:Lorg/apache/tika/mime/MediaType;

    .line 105
    .line 106
    return-object p1
.end method


# virtual methods
.method public detect(Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;)Lorg/apache/tika/mime/MediaType;
    .locals 6

    .line 1
    iget-object v0, p0, Lorg/apache/tika/detect/FileCommandDetector;->hasFileCommand:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lorg/apache/tika/detect/FileCommandDetector;->fileCommandPath:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v0}, Lorg/apache/tika/detect/FileCommandDetector;->checkHasFile(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lorg/apache/tika/detect/FileCommandDetector;->hasFileCommand:Ljava/lang/Boolean;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lorg/apache/tika/detect/FileCommandDetector;->hasFileCommand:Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v1, 0x1

    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    sget-boolean p1, Lorg/apache/tika/detect/FileCommandDetector;->HAS_WARNED:Z

    .line 27
    .line 28
    if-nez p1, :cond_1

    .line 29
    .line 30
    sget-object p1, Lorg/apache/tika/detect/FileCommandDetector;->LOGGER:LF2/b;

    .line 31
    .line 32
    iget-object p2, p0, Lorg/apache/tika/detect/FileCommandDetector;->fileCommandPath:Ljava/lang/String;

    .line 33
    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    const-string v2, "\'file\' command isn\'t working: \'"

    .line 37
    .line 38
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string p2, "\'"

    .line 45
    .line 46
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-interface {p1, p2}, LF2/b;->m(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    sput-boolean v1, Lorg/apache/tika/detect/FileCommandDetector;->HAS_WARNED:Z

    .line 57
    .line 58
    :cond_1
    sget-object p1, Lorg/apache/tika/mime/MediaType;->OCTET_STREAM:Lorg/apache/tika/mime/MediaType;

    .line 59
    .line 60
    return-object p1

    .line 61
    :cond_2
    invoke-static {p1}, Lorg/apache/tika/io/TikaInputStream;->cast(Ljava/io/InputStream;)Lorg/apache/tika/io/TikaInputStream;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    invoke-virtual {v0}, Lorg/apache/tika/io/TikaInputStream;->getPath()Ljava/nio/file/Path;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-direct {p0, p1, p2}, Lorg/apache/tika/detect/FileCommandDetector;->detectOnPath(Ljava/nio/file/Path;Lorg/apache/tika/metadata/Metadata;)Lorg/apache/tika/mime/MediaType;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    return-object p1

    .line 76
    :cond_3
    iget v0, p0, Lorg/apache/tika/detect/FileCommandDetector;->maxBytes:I

    .line 77
    .line 78
    invoke-virtual {p1, v0}, Ljava/io/InputStream;->mark(I)V

    .line 79
    .line 80
    .line 81
    :try_start_0
    new-instance v0, Lorg/apache/tika/io/TemporaryResources;

    .line 82
    .line 83
    invoke-direct {v0}, Lorg/apache/tika/io/TemporaryResources;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    .line 85
    .line 86
    :try_start_1
    invoke-virtual {v0, p2}, Lorg/apache/tika/io/TemporaryResources;->createTempFile(Lorg/apache/tika/metadata/Metadata;)Ljava/nio/file/Path;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    new-instance v3, Lorg/apache/tika/io/BoundedInputStream;

    .line 91
    .line 92
    iget v4, p0, Lorg/apache/tika/detect/FileCommandDetector;->maxBytes:I

    .line 93
    .line 94
    int-to-long v4, v4

    .line 95
    invoke-direct {v3, v4, v5, p1}, Lorg/apache/tika/io/BoundedInputStream;-><init>(JLjava/io/InputStream;)V

    .line 96
    .line 97
    .line 98
    new-array v1, v1, [Ljava/nio/file/CopyOption;

    .line 99
    .line 100
    invoke-static {}, Lio/flutter/plugin/editing/i;->n()Ljava/nio/file/StandardCopyOption;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    const/4 v5, 0x0

    .line 105
    aput-object v4, v1, v5

    .line 106
    .line 107
    invoke-static {v3, v2, v1}, Lio/flutter/plugin/editing/i;->z(Lorg/apache/tika/io/BoundedInputStream;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)V

    .line 108
    .line 109
    .line 110
    invoke-direct {p0, v2, p2}, Lorg/apache/tika/detect/FileCommandDetector;->detectOnPath(Ljava/nio/file/Path;Lorg/apache/tika/metadata/Metadata;)Lorg/apache/tika/mime/MediaType;

    .line 111
    .line 112
    .line 113
    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 114
    :try_start_2
    invoke-virtual {v0}, Lorg/apache/tika/io/TemporaryResources;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    .line 118
    .line 119
    .line 120
    return-object p2

    .line 121
    :catchall_0
    move-exception p2

    .line 122
    goto :goto_1

    .line 123
    :catchall_1
    move-exception p2

    .line 124
    :try_start_3
    invoke-virtual {v0}, Lorg/apache/tika/io/TemporaryResources;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    :catchall_2
    move-exception v0

    .line 129
    :try_start_4
    invoke-virtual {p2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 130
    .line 131
    .line 132
    :goto_0
    throw p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 133
    :goto_1
    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    .line 134
    .line 135
    .line 136
    throw p2
.end method

.method public isUseMime()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/tika/detect/FileCommandDetector;->useMime:Z

    .line 2
    .line 3
    return v0
.end method

.method public setFilePath(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lorg/apache/tika/config/Field;
    .end annotation

    .line 1
    iput-object p1, p0, Lorg/apache/tika/detect/FileCommandDetector;->fileCommandPath:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p1}, Lorg/apache/tika/detect/FileCommandDetector;->checkHasFile(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setMaxBytes(I)V
    .locals 0
    .annotation runtime Lorg/apache/tika/config/Field;
    .end annotation

    .line 1
    iput p1, p0, Lorg/apache/tika/detect/FileCommandDetector;->maxBytes:I

    .line 2
    .line 3
    return-void
.end method

.method public setTimeoutMs(J)V
    .locals 0
    .annotation runtime Lorg/apache/tika/config/Field;
    .end annotation

    .line 1
    iput-wide p1, p0, Lorg/apache/tika/detect/FileCommandDetector;->timeoutMs:J

    .line 2
    .line 3
    return-void
.end method

.method public setUseMime(Z)V
    .locals 0
    .annotation runtime Lorg/apache/tika/config/Field;
    .end annotation

    .line 1
    iput-boolean p1, p0, Lorg/apache/tika/detect/FileCommandDetector;->useMime:Z

    .line 2
    .line 3
    return-void
.end method

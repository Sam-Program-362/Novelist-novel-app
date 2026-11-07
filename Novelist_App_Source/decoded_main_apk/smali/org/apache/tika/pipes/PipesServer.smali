.class public Lorg/apache/tika/pipes/PipesServer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/tika/pipes/PipesServer$MetadataListAndEmbeddedBytes;,
        Lorg/apache/tika/pipes/PipesServer$STATUS;
    }
.end annotation


# static fields
.field private static final LOG:LF2/b;

.field public static final TIMEOUT_EXIT_CODE:I = 0x11


# instance fields
.field private autoDetectParser:Lorg/apache/tika/parser/Parser;

.field private checkForTimeoutMs:J

.field private detector:Lorg/apache/tika/detect/Detector;

.field private digester:Lorg/apache/tika/parser/DigestingParser$Digester;

.field private emitterManager:Lorg/apache/tika/pipes/emitter/EmitterManager;

.field private fetcherManager:Lorg/apache/tika/pipes/fetcher/FetcherManager;

.field private final input:Ljava/io/DataInputStream;

.field private final lock:[Ljava/lang/Object;

.field private final maxForEmitBatchBytes:J

.field private final output:Ljava/io/DataOutputStream;

.field private volatile parsing:Z

.field private rMetaParser:Lorg/apache/tika/parser/Parser;

.field private final serverParseTimeoutMillis:J

.field private final serverWaitTimeoutMillis:J

.field private volatile since:J

.field private tikaConfig:Lorg/apache/tika/config/TikaConfig;

.field private final tikaConfigPath:Ljava/nio/file/Path;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lorg/apache/tika/pipes/PipesServer;

    .line 2
    .line 3
    invoke-static {v0}, LF2/d;->b(Ljava/lang/Class;)LF2/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/nio/file/Path;Ljava/io/InputStream;Ljava/io/PrintStream;JJJ)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    new-array v1, v0, [Ljava/lang/Object;

    .line 6
    .line 7
    iput-object v1, p0, Lorg/apache/tika/pipes/PipesServer;->lock:[Ljava/lang/Object;

    .line 8
    .line 9
    const-wide/16 v1, 0x3e8

    .line 10
    .line 11
    iput-wide v1, p0, Lorg/apache/tika/pipes/PipesServer;->checkForTimeoutMs:J

    .line 12
    .line 13
    iput-object p1, p0, Lorg/apache/tika/pipes/PipesServer;->tikaConfigPath:Ljava/nio/file/Path;

    .line 14
    .line 15
    new-instance p1, Ljava/io/DataInputStream;

    .line 16
    .line 17
    invoke-direct {p1, p2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lorg/apache/tika/pipes/PipesServer;->input:Ljava/io/DataInputStream;

    .line 21
    .line 22
    new-instance p1, Ljava/io/DataOutputStream;

    .line 23
    .line 24
    invoke-direct {p1, p3}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lorg/apache/tika/pipes/PipesServer;->output:Ljava/io/DataOutputStream;

    .line 28
    .line 29
    iput-wide p4, p0, Lorg/apache/tika/pipes/PipesServer;->maxForEmitBatchBytes:J

    .line 30
    .line 31
    iput-wide p6, p0, Lorg/apache/tika/pipes/PipesServer;->serverParseTimeoutMillis:J

    .line 32
    .line 33
    iput-wide p8, p0, Lorg/apache/tika/pipes/PipesServer;->serverWaitTimeoutMillis:J

    .line 34
    .line 35
    iput-boolean v0, p0, Lorg/apache/tika/pipes/PipesServer;->parsing:Z

    .line 36
    .line 37
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 38
    .line 39
    .line 40
    move-result-wide p1

    .line 41
    iput-wide p1, p0, Lorg/apache/tika/pipes/PipesServer;->since:J

    .line 42
    .line 43
    return-void
.end method

.method private _preParse(Lorg/apache/tika/pipes/FetchEmitTuple;Lorg/apache/tika/io/TikaInputStream;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesServer;->digester:Lorg/apache/tika/parser/DigestingParser$Digester;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    invoke-interface {v0, p2, p3, p4}, Lorg/apache/tika/parser/DigestingParser$Digester;->digest(Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :catch_0
    move-exception v0

    .line 10
    sget-object v1, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 11
    .line 12
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getId()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    new-instance v3, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v4, "problem digesting: "

    .line 19
    .line 20
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-interface {v1, v2, v0}, LF2/b;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    :goto_0
    :try_start_1
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesServer;->detector:Lorg/apache/tika/detect/Detector;

    .line 34
    .line 35
    invoke-interface {v0, p2, p3}, Lorg/apache/tika/detect/Detector;->detect(Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;)Lorg/apache/tika/mime/MediaType;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const-string v1, "Content-Type"

    .line 40
    .line 41
    invoke-virtual {v0}, Lorg/apache/tika/mime/MediaType;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {p3, v1, v2}, Lorg/apache/tika/metadata/Metadata;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    sget-object v1, Lorg/apache/tika/metadata/TikaCoreProperties;->CONTENT_TYPE_PARSER_OVERRIDE:Lorg/apache/tika/metadata/Property;

    .line 49
    .line 50
    invoke-virtual {v0}, Lorg/apache/tika/mime/MediaType;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {p3, v1, v0}, Lorg/apache/tika/metadata/Metadata;->set(Lorg/apache/tika/metadata/Property;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :catch_1
    move-exception v0

    .line 59
    sget-object v1, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 60
    .line 61
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getId()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    new-instance v2, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    const-string v3, "problem detecting: "

    .line 68
    .line 69
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-interface {v1, p1, v0}, LF2/b;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    :goto_1
    const-class p1, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;

    .line 83
    .line 84
    invoke-virtual {p4, p1}, Lorg/apache/tika/parser/ParseContext;->get(Ljava/lang/Class;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    check-cast p1, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;

    .line 89
    .line 90
    if-eqz p1, :cond_2

    .line 91
    .line 92
    invoke-virtual {p1}, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->isIncludeOriginal()Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    if-eqz p1, :cond_2

    .line 97
    .line 98
    const-class p1, Lorg/apache/tika/extractor/EmbeddedDocumentBytesHandler;

    .line 99
    .line 100
    invoke-virtual {p4, p1}, Lorg/apache/tika/parser/ParseContext;->get(Ljava/lang/Class;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    check-cast p1, Lorg/apache/tika/extractor/EmbeddedDocumentBytesHandler;

    .line 105
    .line 106
    :try_start_2
    invoke-virtual {p2}, Lorg/apache/tika/io/TikaInputStream;->getPath()Ljava/nio/file/Path;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    const/4 p4, 0x0

    .line 111
    new-array v0, p4, [Ljava/nio/file/OpenOption;

    .line 112
    .line 113
    invoke-static {p2, v0}, Lio/flutter/plugin/editing/i;->f(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/InputStream;

    .line 114
    .line 115
    .line 116
    move-result-object p2
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 117
    :try_start_3
    invoke-interface {p1, p4, p3, p2}, Lorg/apache/tika/extractor/EmbeddedDocumentBytesHandler;->add(ILorg/apache/tika/metadata/Metadata;Ljava/io/InputStream;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 118
    .line 119
    .line 120
    if-eqz p2, :cond_2

    .line 121
    .line 122
    :try_start_4
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 123
    .line 124
    .line 125
    goto :goto_4

    .line 126
    :catch_2
    move-exception p1

    .line 127
    goto :goto_3

    .line 128
    :catchall_0
    move-exception p1

    .line 129
    if-eqz p2, :cond_1

    .line 130
    .line 131
    :try_start_5
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 132
    .line 133
    .line 134
    goto :goto_2

    .line 135
    :catchall_1
    move-exception p2

    .line 136
    :try_start_6
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 137
    .line 138
    .line 139
    :cond_1
    :goto_2
    throw p1
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2

    .line 140
    :goto_3
    sget-object p2, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 141
    .line 142
    const-string p3, "problem reading source file into embedded document byte store"

    .line 143
    .line 144
    invoke-interface {p2, p3, p1}, LF2/b;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 145
    .line 146
    .line 147
    :cond_2
    :goto_4
    return-void
.end method

.method private actuallyParse(Lorg/apache/tika/pipes/FetchEmitTuple;)V
    .locals 8

    .line 1
    const-string v0, "problem closing embedded document byte store"

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-direct {p0, p1}, Lorg/apache/tika/pipes/PipesServer;->getFetcher(Lorg/apache/tika/pipes/FetchEmitTuple;)Lorg/apache/tika/pipes/fetcher/Fetcher;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    if-nez v3, :cond_0

    .line 12
    .line 13
    goto/16 :goto_2

    .line 14
    .line 15
    :cond_0
    sget-object v4, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 16
    .line 17
    invoke-interface {v4}, LF2/b;->v()Z

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    if-eqz v5, :cond_1

    .line 22
    .line 23
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 24
    .line 25
    .line 26
    move-result-wide v5

    .line 27
    sub-long/2addr v5, v1

    .line 28
    const-string v1, "timer -- got fetcher: {}ms"

    .line 29
    .line 30
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-interface {v4, v2, v1}, LF2/b;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 38
    .line 39
    .line 40
    move-result-wide v1

    .line 41
    :try_start_0
    invoke-virtual {p0, p1, v3}, Lorg/apache/tika/pipes/PipesServer;->parseFromTuple(Lorg/apache/tika/pipes/FetchEmitTuple;Lorg/apache/tika/pipes/fetcher/Fetcher;)Lorg/apache/tika/pipes/PipesServer$MetadataListAndEmbeddedBytes;

    .line 42
    .line 43
    .line 44
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 45
    :try_start_1
    invoke-interface {v4}, LF2/b;->v()Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-eqz v5, :cond_2

    .line 50
    .line 51
    const-string v5, "timer -- to parse: {} ms"

    .line 52
    .line 53
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 54
    .line 55
    .line 56
    move-result-wide v6

    .line 57
    sub-long/2addr v6, v1

    .line 58
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-interface {v4, v1, v5}, LF2/b;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :catchall_0
    move-exception p1

    .line 67
    goto :goto_3

    .line 68
    :cond_2
    :goto_0
    if-eqz v3, :cond_4

    .line 69
    .line 70
    invoke-virtual {v3}, Lorg/apache/tika/pipes/PipesServer$MetadataListAndEmbeddedBytes;->getMetadataList()Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-direct {p0, v1}, Lorg/apache/tika/pipes/PipesServer;->metadataIsEmpty(Ljava/util/List;)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_3

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    invoke-direct {p0, p1, v3}, Lorg/apache/tika/pipes/PipesServer;->emitParseData(Lorg/apache/tika/pipes/FetchEmitTuple;Lorg/apache/tika/pipes/PipesServer$MetadataListAndEmbeddedBytes;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3}, Lorg/apache/tika/pipes/PipesServer$MetadataListAndEmbeddedBytes;->hasEmbeddedDocumentByteStore()Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-eqz p1, :cond_5

    .line 89
    .line 90
    invoke-virtual {v3}, Lorg/apache/tika/pipes/PipesServer$MetadataListAndEmbeddedBytes;->getEmbeddedDocumentBytesHandler()Lorg/apache/tika/extractor/EmbeddedDocumentBytesHandler;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    if-eqz p1, :cond_5

    .line 95
    .line 96
    :try_start_2
    invoke-virtual {v3}, Lorg/apache/tika/pipes/PipesServer$MetadataListAndEmbeddedBytes;->getEmbeddedDocumentBytesHandler()Lorg/apache/tika/extractor/EmbeddedDocumentBytesHandler;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :catch_0
    move-exception p1

    .line 105
    sget-object v1, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 106
    .line 107
    invoke-interface {v1, v0, p1}, LF2/b;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :cond_4
    :goto_1
    :try_start_3
    sget-object p1, Lorg/apache/tika/pipes/PipesServer$STATUS;->EMPTY_OUTPUT:Lorg/apache/tika/pipes/PipesServer$STATUS;

    .line 112
    .line 113
    invoke-direct {p0, p1}, Lorg/apache/tika/pipes/PipesServer;->write(Lorg/apache/tika/pipes/PipesServer$STATUS;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 114
    .line 115
    .line 116
    if-eqz v3, :cond_5

    .line 117
    .line 118
    invoke-virtual {v3}, Lorg/apache/tika/pipes/PipesServer$MetadataListAndEmbeddedBytes;->hasEmbeddedDocumentByteStore()Z

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    if-eqz p1, :cond_5

    .line 123
    .line 124
    invoke-virtual {v3}, Lorg/apache/tika/pipes/PipesServer$MetadataListAndEmbeddedBytes;->getEmbeddedDocumentBytesHandler()Lorg/apache/tika/extractor/EmbeddedDocumentBytesHandler;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    if-eqz p1, :cond_5

    .line 129
    .line 130
    :try_start_4
    invoke-virtual {v3}, Lorg/apache/tika/pipes/PipesServer$MetadataListAndEmbeddedBytes;->getEmbeddedDocumentBytesHandler()Lorg/apache/tika/extractor/EmbeddedDocumentBytesHandler;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 135
    .line 136
    .line 137
    :cond_5
    :goto_2
    return-void

    .line 138
    :catchall_1
    move-exception p1

    .line 139
    const/4 v3, 0x0

    .line 140
    :goto_3
    if-eqz v3, :cond_6

    .line 141
    .line 142
    invoke-virtual {v3}, Lorg/apache/tika/pipes/PipesServer$MetadataListAndEmbeddedBytes;->hasEmbeddedDocumentByteStore()Z

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    if-eqz v1, :cond_6

    .line 147
    .line 148
    invoke-virtual {v3}, Lorg/apache/tika/pipes/PipesServer$MetadataListAndEmbeddedBytes;->getEmbeddedDocumentBytesHandler()Lorg/apache/tika/extractor/EmbeddedDocumentBytesHandler;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    if-eqz v1, :cond_6

    .line 153
    .line 154
    :try_start_5
    invoke-virtual {v3}, Lorg/apache/tika/pipes/PipesServer$MetadataListAndEmbeddedBytes;->getEmbeddedDocumentBytesHandler()Lorg/apache/tika/extractor/EmbeddedDocumentBytesHandler;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    .line 159
    .line 160
    .line 161
    goto :goto_4

    .line 162
    :catch_1
    move-exception v1

    .line 163
    sget-object v2, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 164
    .line 165
    invoke-interface {v2, v0, v1}, LF2/b;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 166
    .line 167
    .line 168
    :cond_6
    :goto_4
    throw p1
.end method

.method private emit(Ljava/lang/String;Lorg/apache/tika/pipes/emitter/EmitKey;ZLorg/apache/tika/pipes/PipesServer$MetadataListAndEmbeddedBytes;Ljava/lang/String;Lorg/apache/tika/parser/ParseContext;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesServer;->emitterManager:Lorg/apache/tika/pipes/emitter/EmitterManager;

    .line 2
    .line 3
    invoke-virtual {p2}, Lorg/apache/tika/pipes/emitter/EmitKey;->getEmitterName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Lorg/apache/tika/pipes/emitter/EmitterManager;->getEmitter(Ljava/lang/String;)Lorg/apache/tika/pipes/emitter/Emitter;

    .line 8
    .line 9
    .line 10
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2

    .line 11
    if-eqz p3, :cond_0

    .line 12
    .line 13
    :try_start_1
    invoke-virtual {p4}, Lorg/apache/tika/pipes/PipesServer$MetadataListAndEmbeddedBytes;->toBePackagedForStreamEmitter()Z

    .line 14
    .line 15
    .line 16
    move-result p3

    .line 17
    if-eqz p3, :cond_0

    .line 18
    .line 19
    invoke-direct {p0, p1, p2, p4}, Lorg/apache/tika/pipes/PipesServer;->emitContentsAndBytes(Lorg/apache/tika/pipes/emitter/Emitter;Lorg/apache/tika/pipes/emitter/EmitKey;Lorg/apache/tika/pipes/PipesServer$MetadataListAndEmbeddedBytes;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    move-exception p1

    .line 24
    goto :goto_1

    .line 25
    :catch_1
    move-exception p1

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    invoke-virtual {p2}, Lorg/apache/tika/pipes/emitter/EmitKey;->getEmitKey()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {p4}, Lorg/apache/tika/pipes/PipesServer$MetadataListAndEmbeddedBytes;->getMetadataList()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    invoke-interface {p1, p2, p3, p6}, Lorg/apache/tika/pipes/emitter/Emitter;->emit(Ljava/lang/String;Ljava/util/List;Lorg/apache/tika/parser/ParseContext;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lorg/apache/tika/pipes/emitter/TikaEmitterException; {:try_start_1 .. :try_end_1} :catch_0

    .line 36
    .line 37
    .line 38
    :goto_0
    invoke-static {p5}, Lorg/apache/tika/utils/StringUtils;->isBlank(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_1

    .line 43
    .line 44
    sget-object p1, Lorg/apache/tika/pipes/PipesServer$STATUS;->EMIT_SUCCESS:Lorg/apache/tika/pipes/PipesServer$STATUS;

    .line 45
    .line 46
    invoke-direct {p0, p1}, Lorg/apache/tika/pipes/PipesServer;->write(Lorg/apache/tika/pipes/PipesServer$STATUS;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_1
    sget-object p1, Lorg/apache/tika/pipes/PipesServer$STATUS;->EMIT_SUCCESS_PARSE_EXCEPTION:Lorg/apache/tika/pipes/PipesServer$STATUS;

    .line 51
    .line 52
    sget-object p2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 53
    .line 54
    invoke-virtual {p5, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-direct {p0, p1, p2}, Lorg/apache/tika/pipes/PipesServer;->write(Lorg/apache/tika/pipes/PipesServer$STATUS;[B)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :goto_1
    sget-object p2, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 63
    .line 64
    const-string p3, "emit exception"

    .line 65
    .line 66
    invoke-interface {p2, p3, p1}, LF2/b;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    invoke-static {p1}, Lorg/apache/tika/utils/ExceptionUtils;->getStackTrace(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    sget-object p2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 74
    .line 75
    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    sget-object p2, Lorg/apache/tika/pipes/PipesServer$STATUS;->EMIT_EXCEPTION:Lorg/apache/tika/pipes/PipesServer$STATUS;

    .line 80
    .line 81
    invoke-direct {p0, p2, p1}, Lorg/apache/tika/pipes/PipesServer;->write(Lorg/apache/tika/pipes/PipesServer$STATUS;[B)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :catch_2
    invoke-direct {p0, p1}, Lorg/apache/tika/pipes/PipesServer;->getNoEmitterMsg(Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    sget-object p2, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 90
    .line 91
    invoke-interface {p2, p1}, LF2/b;->m(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    sget-object p2, Lorg/apache/tika/pipes/PipesServer$STATUS;->EMITTER_NOT_FOUND:Lorg/apache/tika/pipes/PipesServer$STATUS;

    .line 95
    .line 96
    invoke-direct {p0, p2, p1}, Lorg/apache/tika/pipes/PipesServer;->write(Lorg/apache/tika/pipes/PipesServer$STATUS;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method private emitContentsAndBytes(Lorg/apache/tika/pipes/emitter/Emitter;Lorg/apache/tika/pipes/emitter/EmitKey;Lorg/apache/tika/pipes/PipesServer$MetadataListAndEmbeddedBytes;)V
    .locals 0

    .line 1
    instance-of p2, p1, Lorg/apache/tika/pipes/emitter/StreamEmitter;

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string p3, "The emitter for embedded document byte store must be a StreamEmitter. I see: "

    .line 16
    .line 17
    invoke-virtual {p3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p2

    .line 25
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 26
    .line 27
    const-string p2, "this is not yet implemented"

    .line 28
    .line 29
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1
.end method

.method private emitParseData(Lorg/apache/tika/pipes/FetchEmitTuple;Lorg/apache/tika/pipes/PipesServer$MetadataListAndEmbeddedBytes;)V
    .locals 12

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p2}, Lorg/apache/tika/pipes/PipesServer$MetadataListAndEmbeddedBytes;->getMetadataList()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-direct {p0, p1, v2}, Lorg/apache/tika/pipes/PipesServer;->getContainerStacktrace(Lorg/apache/tika/pipes/FetchEmitTuple;Ljava/util/List;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v8

    .line 13
    invoke-virtual {p2}, Lorg/apache/tika/pipes/PipesServer$MetadataListAndEmbeddedBytes;->getMetadataList()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-direct {p0, p1, v2}, Lorg/apache/tika/pipes/PipesServer;->filterMetadata(Lorg/apache/tika/pipes/FetchEmitTuple;Ljava/util/List;)V

    .line 18
    .line 19
    .line 20
    invoke-direct/range {p0 .. p2}, Lorg/apache/tika/pipes/PipesServer;->filterMetadataList(Lorg/apache/tika/pipes/FetchEmitTuple;Lorg/apache/tika/pipes/PipesServer$MetadataListAndEmbeddedBytes;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getParseContext()Lorg/apache/tika/parser/ParseContext;

    .line 24
    .line 25
    .line 26
    move-result-object v9

    .line 27
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getOnParseException()Lorg/apache/tika/pipes/FetchEmitTuple$ON_PARSE_EXCEPTION;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    const-class v3, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;

    .line 32
    .line 33
    invoke-virtual {v9, v3}, Lorg/apache/tika/parser/ParseContext;->get(Ljava/lang/Class;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;

    .line 38
    .line 39
    invoke-static {v8}, Lorg/apache/tika/utils/StringUtils;->isBlank(Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-nez v4, :cond_1

    .line 44
    .line 45
    sget-object v4, Lorg/apache/tika/pipes/FetchEmitTuple$ON_PARSE_EXCEPTION;->EMIT:Lorg/apache/tika/pipes/FetchEmitTuple$ON_PARSE_EXCEPTION;

    .line 46
    .line 47
    if-ne v2, v4, :cond_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    sget-object p1, Lorg/apache/tika/pipes/PipesServer$STATUS;->PARSE_EXCEPTION_NO_EMIT:Lorg/apache/tika/pipes/PipesServer$STATUS;

    .line 51
    .line 52
    invoke-direct {p0, p1, v8}, Lorg/apache/tika/pipes/PipesServer;->write(Lorg/apache/tika/pipes/PipesServer$STATUS;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getMetadata()Lorg/apache/tika/metadata/Metadata;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {p2}, Lorg/apache/tika/pipes/PipesServer$MetadataListAndEmbeddedBytes;->getMetadataList()Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-direct {p0, v2, v4}, Lorg/apache/tika/pipes/PipesServer;->injectUserMetadata(Lorg/apache/tika/metadata/Metadata;Ljava/util/List;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getEmitKey()Lorg/apache/tika/pipes/emitter/EmitKey;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {v2}, Lorg/apache/tika/pipes/emitter/EmitKey;->getEmitKey()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-static {v4}, Lorg/apache/tika/utils/StringUtils;->isBlank(Ljava/lang/String;)Z

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-eqz v4, :cond_2

    .line 80
    .line 81
    new-instance v4, Lorg/apache/tika/pipes/emitter/EmitKey;

    .line 82
    .line 83
    invoke-virtual {v2}, Lorg/apache/tika/pipes/emitter/EmitKey;->getEmitterName()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getFetchKey()Lorg/apache/tika/pipes/fetcher/FetchKey;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    invoke-virtual {v5}, Lorg/apache/tika/pipes/fetcher/FetchKey;->getFetchKey()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    invoke-direct {v4, v2, v5}, Lorg/apache/tika/pipes/emitter/EmitKey;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, v4}, Lorg/apache/tika/pipes/FetchEmitTuple;->setEmitKey(Lorg/apache/tika/pipes/emitter/EmitKey;)V

    .line 99
    .line 100
    .line 101
    move-object v5, v4

    .line 102
    goto :goto_1

    .line 103
    :cond_2
    move-object v5, v2

    .line 104
    :goto_1
    new-instance v2, Lorg/apache/tika/pipes/emitter/EmitData;

    .line 105
    .line 106
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getEmitKey()Lorg/apache/tika/pipes/emitter/EmitKey;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-virtual {p2}, Lorg/apache/tika/pipes/PipesServer$MetadataListAndEmbeddedBytes;->getMetadataList()Ljava/util/List;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    invoke-direct {v2, v4, v6, v8}, Lorg/apache/tika/pipes/emitter/EmitData;-><init>(Lorg/apache/tika/pipes/emitter/EmitKey;Ljava/util/List;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v3}, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->isExtractEmbeddedDocumentBytes()Z

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    if-eqz v4, :cond_3

    .line 122
    .line 123
    invoke-virtual {p2}, Lorg/apache/tika/pipes/PipesServer$MetadataListAndEmbeddedBytes;->toBePackagedForStreamEmitter()Z

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    if-eqz v4, :cond_3

    .line 128
    .line 129
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getId()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    invoke-virtual {v3}, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->isExtractEmbeddedDocumentBytes()Z

    .line 134
    .line 135
    .line 136
    move-result v6

    .line 137
    move-object v3, p0

    .line 138
    move-object v7, p2

    .line 139
    invoke-direct/range {v3 .. v9}, Lorg/apache/tika/pipes/PipesServer;->emit(Ljava/lang/String;Lorg/apache/tika/pipes/emitter/EmitKey;ZLorg/apache/tika/pipes/PipesServer$MetadataListAndEmbeddedBytes;Ljava/lang/String;Lorg/apache/tika/parser/ParseContext;)V

    .line 140
    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_3
    iget-wide v6, p0, Lorg/apache/tika/pipes/PipesServer;->maxForEmitBatchBytes:J

    .line 144
    .line 145
    const-wide/16 v10, 0x0

    .line 146
    .line 147
    cmp-long v6, v6, v10

    .line 148
    .line 149
    if-ltz v6, :cond_4

    .line 150
    .line 151
    invoke-virtual {v2}, Lorg/apache/tika/pipes/emitter/EmitData;->getEstimatedSizeBytes()J

    .line 152
    .line 153
    .line 154
    move-result-wide v6

    .line 155
    iget-wide v10, p0, Lorg/apache/tika/pipes/PipesServer;->maxForEmitBatchBytes:J

    .line 156
    .line 157
    cmp-long v6, v6, v10

    .line 158
    .line 159
    if-ltz v6, :cond_4

    .line 160
    .line 161
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getId()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-virtual {v3}, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->isExtractEmbeddedDocumentBytes()Z

    .line 166
    .line 167
    .line 168
    move-result v6

    .line 169
    move-object v3, p0

    .line 170
    move-object v4, p1

    .line 171
    move-object v7, p2

    .line 172
    invoke-direct/range {v3 .. v9}, Lorg/apache/tika/pipes/PipesServer;->emit(Ljava/lang/String;Lorg/apache/tika/pipes/emitter/EmitKey;ZLorg/apache/tika/pipes/PipesServer$MetadataListAndEmbeddedBytes;Ljava/lang/String;Lorg/apache/tika/parser/ParseContext;)V

    .line 173
    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_4
    invoke-direct {p0, v2}, Lorg/apache/tika/pipes/PipesServer;->write(Lorg/apache/tika/pipes/emitter/EmitData;)V

    .line 177
    .line 178
    .line 179
    :goto_2
    sget-object p1, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 180
    .line 181
    invoke-interface {p1}, LF2/b;->v()Z

    .line 182
    .line 183
    .line 184
    move-result p2

    .line 185
    if-eqz p2, :cond_5

    .line 186
    .line 187
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 188
    .line 189
    .line 190
    move-result-wide v4

    .line 191
    sub-long/2addr v4, v0

    .line 192
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 193
    .line 194
    .line 195
    move-result-object p2

    .line 196
    const-string v0, "timer -- emitted: {} ms"

    .line 197
    .line 198
    invoke-interface {p1, p2, v0}, LF2/b;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    :cond_5
    return-void
.end method

.method private exit(I)V
    .locals 3

    .line 1
    const-string v0, "exiting: {}"

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    sget-object v1, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-interface {v1, v2, v0}, LF2/b;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    sget-object v1, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 16
    .line 17
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-interface {v1, v0, v2}, LF2/b;->z(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-static {p1}, Ljava/lang/System;->exit(I)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method private filterMetadata(Lorg/apache/tika/pipes/FetchEmitTuple;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/tika/pipes/FetchEmitTuple;",
            "Ljava/util/List<",
            "Lorg/apache/tika/metadata/Metadata;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getParseContext()Lorg/apache/tika/parser/ParseContext;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-class v0, Lorg/apache/tika/metadata/filter/MetadataFilter;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lorg/apache/tika/parser/ParseContext;->get(Ljava/lang/Class;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lorg/apache/tika/metadata/filter/MetadataFilter;

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, Lorg/apache/tika/pipes/PipesServer;->tikaConfig:Lorg/apache/tika/config/TikaConfig;

    .line 16
    .line 17
    invoke-virtual {p1}, Lorg/apache/tika/config/TikaConfig;->getMetadataFilter()Lorg/apache/tika/metadata/filter/MetadataFilter;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lorg/apache/tika/metadata/Metadata;

    .line 36
    .line 37
    :try_start_0
    invoke-virtual {p1, v0}, Lorg/apache/tika/metadata/filter/MetadataFilter;->filter(Lorg/apache/tika/metadata/Metadata;)V
    :try_end_0
    .catch Lorg/apache/tika/exception/TikaException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catch_0
    move-exception v0

    .line 42
    sget-object v1, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 43
    .line 44
    const-string v2, "failed to filter metadata"

    .line 45
    .line 46
    invoke-interface {v1, v2, v0}, LF2/b;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    return-void
.end method

.method private filterMetadataList(Lorg/apache/tika/pipes/FetchEmitTuple;Lorg/apache/tika/pipes/PipesServer$MetadataListAndEmbeddedBytes;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getParseContext()Lorg/apache/tika/parser/ParseContext;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-class v0, Lorg/apache/tika/metadata/listfilter/MetadataListFilter;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lorg/apache/tika/parser/ParseContext;->get(Ljava/lang/Class;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lorg/apache/tika/metadata/listfilter/MetadataListFilter;

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, Lorg/apache/tika/pipes/PipesServer;->tikaConfig:Lorg/apache/tika/config/TikaConfig;

    .line 16
    .line 17
    invoke-virtual {p1}, Lorg/apache/tika/config/TikaConfig;->getMetadataListFilter()Lorg/apache/tika/metadata/listfilter/MetadataListFilter;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :cond_0
    instance-of v0, p1, Lorg/apache/tika/metadata/listfilter/NoOpListFilter;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    :try_start_0
    invoke-virtual {p2, p1}, Lorg/apache/tika/pipes/PipesServer$MetadataListAndEmbeddedBytes;->filter(Lorg/apache/tika/metadata/listfilter/MetadataListFilter;)V
    :try_end_0
    .catch Lorg/apache/tika/exception/TikaException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :catch_0
    move-exception p1

    .line 31
    sget-object p2, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 32
    .line 33
    const-string v0, "failed to filter metadata list"

    .line 34
    .line 35
    invoke-interface {p2, v0, p1}, LF2/b;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method private getContainerStacktrace(Lorg/apache/tika/pipes/FetchEmitTuple;Ljava/util/List;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/tika/pipes/FetchEmitTuple;",
            "Ljava/util/List<",
            "Lorg/apache/tika/metadata/Metadata;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p2}, Lorg/apache/tika/pipes/PipesServer;->metadataIsEmpty(Ljava/util/List;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const-string v0, ""

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lorg/apache/tika/metadata/Metadata;

    .line 16
    .line 17
    sget-object p2, Lorg/apache/tika/metadata/TikaCoreProperties;->CONTAINER_EXCEPTION:Lorg/apache/tika/metadata/Property;

    .line 18
    .line 19
    invoke-virtual {p1, p2}, Lorg/apache/tika/metadata/Metadata;->get(Lorg/apache/tika/metadata/Property;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_1
    return-object v0
.end method

.method private getFetcher(Lorg/apache/tika/pipes/FetchEmitTuple;)Lorg/apache/tika/pipes/fetcher/Fetcher;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lorg/apache/tika/pipes/PipesServer;->fetcherManager:Lorg/apache/tika/pipes/fetcher/FetcherManager;

    .line 3
    .line 4
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getFetchKey()Lorg/apache/tika/pipes/fetcher/FetchKey;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    invoke-virtual {v2}, Lorg/apache/tika/pipes/fetcher/FetchKey;->getFetcherName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v1, v2}, Lorg/apache/tika/pipes/fetcher/FetcherManager;->getFetcher(Ljava/lang/String;)Lorg/apache/tika/pipes/fetcher/Fetcher;

    .line 13
    .line 14
    .line 15
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lorg/apache/tika/exception/TikaException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    return-object p1

    .line 17
    :catch_0
    move-exception v1

    .line 18
    goto :goto_0

    .line 19
    :catch_1
    move-exception v1

    .line 20
    :goto_0
    sget-object v2, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 21
    .line 22
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getId()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    new-instance v3, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string v4, "Couldn\'t initialize fetcher for fetch id \'"

    .line 29
    .line 30
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string p1, "\'"

    .line 37
    .line 38
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-interface {v2, p1, v1}, LF2/b;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    sget-object p1, Lorg/apache/tika/pipes/PipesServer$STATUS;->FETCHER_INITIALIZATION_EXCEPTION:Lorg/apache/tika/pipes/PipesServer$STATUS;

    .line 49
    .line 50
    invoke-static {v1}, Lorg/apache/tika/utils/ExceptionUtils;->getStackTrace(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-direct {p0, p1, v1}, Lorg/apache/tika/pipes/PipesServer;->write(Lorg/apache/tika/pipes/PipesServer$STATUS;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-object v0

    .line 58
    :catch_2
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getFetchKey()Lorg/apache/tika/pipes/fetcher/FetchKey;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1}, Lorg/apache/tika/pipes/fetcher/FetchKey;->getFetcherName()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-direct {p0, p1}, Lorg/apache/tika/pipes/PipesServer;->getNoFetcherMsg(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    sget-object v1, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 71
    .line 72
    invoke-interface {v1, p1}, LF2/b;->m(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    sget-object v1, Lorg/apache/tika/pipes/PipesServer$STATUS;->FETCHER_NOT_FOUND:Lorg/apache/tika/pipes/PipesServer$STATUS;

    .line 76
    .line 77
    invoke-direct {p0, v1, p1}, Lorg/apache/tika/pipes/PipesServer;->write(Lorg/apache/tika/pipes/PipesServer$STATUS;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    return-object v0
.end method

.method private getNoEmitterMsg(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Emitter \'"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string p1, "\' not found.\nThe configured emitterManager supports:"

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lorg/apache/tika/pipes/PipesServer;->emitterManager:Lorg/apache/tika/pipes/emitter/EmitterManager;

    .line 17
    .line 18
    invoke-virtual {p1}, Lorg/apache/tika/pipes/emitter/EmitterManager;->getSupported()Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const/4 v1, 0x0

    .line 27
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Ljava/lang/String;

    .line 38
    .line 39
    add-int/lit8 v3, v1, 0x1

    .line 40
    .line 41
    if-lez v1, :cond_0

    .line 42
    .line 43
    const-string v1, ", "

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    :cond_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    move v1, v3

    .line 52
    goto :goto_0

    .line 53
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1
.end method

.method private getNoFetcherMsg(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Fetcher \'"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string p1, "\' not found.\nThe configured FetcherManager supports:"

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lorg/apache/tika/pipes/PipesServer;->fetcherManager:Lorg/apache/tika/pipes/fetcher/FetcherManager;

    .line 17
    .line 18
    invoke-virtual {p1}, Lorg/apache/tika/pipes/fetcher/FetcherManager;->getSupported()Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const/4 v1, 0x0

    .line 27
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Ljava/lang/String;

    .line 38
    .line 39
    add-int/lit8 v3, v1, 0x1

    .line 40
    .line 41
    if-lez v1, :cond_0

    .line 42
    .line 43
    const-string v1, ", "

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    :cond_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    move v1, v3

    .line 52
    goto :goto_0

    .line 53
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1
.end method

.method private handleOOM(Ljava/lang/String;Ljava/lang/OutOfMemoryError;)V
    .locals 3

    .line 1
    sget-object v0, Lorg/apache/tika/pipes/PipesServer$STATUS;->OOM:Lorg/apache/tika/pipes/PipesServer$STATUS;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lorg/apache/tika/pipes/PipesServer;->write(Lorg/apache/tika/pipes/PipesServer$STATUS;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 7
    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v2, "oom: "

    .line 11
    .line 12
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {v0, p1, p2}, LF2/b;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    invoke-direct {p0, p1}, Lorg/apache/tika/pipes/PipesServer;->exit(I)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method private injectUserMetadata(Lorg/apache/tika/metadata/Metadata;Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/tika/metadata/Metadata;",
            "Ljava/util/List<",
            "Lorg/apache/tika/metadata/Metadata;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lorg/apache/tika/metadata/Metadata;->names()[Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    move v3, v2

    .line 8
    :goto_0
    if-ge v3, v1, :cond_1

    .line 9
    .line 10
    aget-object v4, v0, v3

    .line 11
    .line 12
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v5

    .line 16
    check-cast v5, Lorg/apache/tika/metadata/Metadata;

    .line 17
    .line 18
    const/4 v6, 0x0

    .line 19
    invoke-virtual {v5, v4, v6}, Lorg/apache/tika/metadata/Metadata;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v4}, Lorg/apache/tika/metadata/Metadata;->getValues(Ljava/lang/String;)[Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    array-length v6, v5

    .line 27
    move v7, v2

    .line 28
    :goto_1
    if-ge v7, v6, :cond_0

    .line 29
    .line 30
    aget-object v8, v5, v7

    .line 31
    .line 32
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v9

    .line 36
    check-cast v9, Lorg/apache/tika/metadata/Metadata;

    .line 37
    .line 38
    invoke-virtual {v9, v4, v8}, Lorg/apache/tika/metadata/Metadata;->add(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    add-int/lit8 v7, v7, 0x1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    return-void
.end method

.method public static main([Ljava/lang/String;)V
    .locals 14

    .line 1
    const-string v1, "server shutting down"

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    :try_start_0
    aget-object v2, p0, v0

    .line 5
    .line 6
    new-array v3, v0, [Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {v2, v3}, Lio/flutter/plugin/editing/i;->k(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;

    .line 9
    .line 10
    .line 11
    move-result-object v5

    .line 12
    const/4 v2, 0x1

    .line 13
    aget-object v3, p0, v2

    .line 14
    .line 15
    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 16
    .line 17
    .line 18
    move-result-wide v8

    .line 19
    const/4 v3, 0x2

    .line 20
    aget-object v3, p0, v3

    .line 21
    .line 22
    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 23
    .line 24
    .line 25
    move-result-wide v10

    .line 26
    const/4 v3, 0x3

    .line 27
    aget-object p0, p0, v3

    .line 28
    .line 29
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 30
    .line 31
    .line 32
    move-result-wide v12

    .line 33
    new-instance v4, Lorg/apache/tika/pipes/PipesServer;

    .line 34
    .line 35
    sget-object v6, Ljava/lang/System;->in:Ljava/io/InputStream;

    .line 36
    .line 37
    sget-object v7, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 38
    .line 39
    invoke-direct/range {v4 .. v13}, Lorg/apache/tika/pipes/PipesServer;-><init>(Ljava/nio/file/Path;Ljava/io/InputStream;Ljava/io/PrintStream;JJJ)V

    .line 40
    .line 41
    .line 42
    sget p0, Lw2/h;->o:I

    .line 43
    .line 44
    new-instance p0, Lw2/g;

    .line 45
    .line 46
    invoke-direct {p0}, Lt2/d;-><init>()V

    .line 47
    .line 48
    .line 49
    new-array v0, v0, [B

    .line 50
    .line 51
    invoke-virtual {p0, v0}, Lw2/g;->W([B)V

    .line 52
    .line 53
    .line 54
    new-instance v0, Lw2/h;

    .line 55
    .line 56
    invoke-direct {v0, p0}, Lw2/h;-><init>(Lw2/g;)V

    .line 57
    .line 58
    .line 59
    invoke-static {v0}, Ljava/lang/System;->setIn(Ljava/io/InputStream;)V

    .line 60
    .line 61
    .line 62
    sget-object p0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 63
    .line 64
    invoke-static {p0}, Ljava/lang/System;->setOut(Ljava/io/PrintStream;)V

    .line 65
    .line 66
    .line 67
    new-instance p0, Ljava/lang/Thread;

    .line 68
    .line 69
    const-string v0, "Tika Watchdog"

    .line 70
    .line 71
    invoke-direct {p0, v4, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v2}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4}, Lorg/apache/tika/pipes/PipesServer;->processRequests()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    .line 82
    .line 83
    sget-object p0, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 84
    .line 85
    invoke-interface {p0, v1}, LF2/b;->k(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :catchall_0
    move-exception v0

    .line 90
    move-object p0, v0

    .line 91
    sget-object v0, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 92
    .line 93
    invoke-interface {v0, v1}, LF2/b;->k(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw p0
.end method

.method private metadataIsEmpty(Ljava/util/List;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lorg/apache/tika/metadata/Metadata;",
            ">;)Z"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    return p1

    .line 12
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 13
    return p1
.end method

.method private parseConcatenated(Lorg/apache/tika/pipes/FetchEmitTuple;Lorg/apache/tika/pipes/HandlerConfig;Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/tika/pipes/FetchEmitTuple;",
            "Lorg/apache/tika/pipes/HandlerConfig;",
            "Ljava/io/InputStream;",
            "Lorg/apache/tika/metadata/Metadata;",
            "Lorg/apache/tika/parser/ParseContext;",
            ")",
            "Ljava/util/List<",
            "Lorg/apache/tika/metadata/Metadata;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "timer -- parse only time: {} ms"

    .line 2
    .line 3
    const-string v1, "sax problem:"

    .line 4
    .line 5
    const-string v2, "encrypted document:"

    .line 6
    .line 7
    const-string v3, "security exception:"

    .line 8
    .line 9
    const-string v4, "parse exception: "

    .line 10
    .line 11
    new-instance v5, Lorg/apache/tika/sax/BasicContentHandlerFactory;

    .line 12
    .line 13
    invoke-virtual {p2}, Lorg/apache/tika/pipes/HandlerConfig;->getType()Lorg/apache/tika/sax/BasicContentHandlerFactory$HANDLER_TYPE;

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    invoke-virtual {p2}, Lorg/apache/tika/pipes/HandlerConfig;->getWriteLimit()I

    .line 18
    .line 19
    .line 20
    move-result v7

    .line 21
    invoke-virtual {p2}, Lorg/apache/tika/pipes/HandlerConfig;->isThrowOnWriteLimitReached()Z

    .line 22
    .line 23
    .line 24
    move-result v8

    .line 25
    invoke-direct {v5, v6, v7, v8, p5}, Lorg/apache/tika/sax/BasicContentHandlerFactory;-><init>(Lorg/apache/tika/sax/BasicContentHandlerFactory$HANDLER_TYPE;IZLorg/apache/tika/parser/ParseContext;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v5}, Lorg/apache/tika/sax/ContentHandlerFactory;->getNewContentHandler()Lorg/xml/sax/ContentHandler;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    new-instance v6, Lorg/apache/tika/pipes/PipesServer$1;

    .line 33
    .line 34
    invoke-direct {v6, p0, p2}, Lorg/apache/tika/pipes/PipesServer$1;-><init>(Lorg/apache/tika/pipes/PipesServer;Lorg/apache/tika/pipes/HandlerConfig;)V

    .line 35
    .line 36
    .line 37
    const-class p2, Lorg/apache/tika/extractor/DocumentSelector;

    .line 38
    .line 39
    invoke-virtual {p5, p2, v6}, Lorg/apache/tika/parser/ParseContext;->set(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 43
    .line 44
    .line 45
    move-result-wide v6

    .line 46
    invoke-direct {p0, p1, p3, p4, p5}, Lorg/apache/tika/pipes/PipesServer;->preParse(Lorg/apache/tika/pipes/FetchEmitTuple;Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)V

    .line 47
    .line 48
    .line 49
    const/4 p2, 0x0

    .line 50
    :try_start_0
    iget-object v8, p0, Lorg/apache/tika/pipes/PipesServer;->autoDetectParser:Lorg/apache/tika/parser/Parser;

    .line 51
    .line 52
    invoke-interface {v8, p3, v5, p4, p5}, Lorg/apache/tika/parser/Parser;->parse(Ljava/io/InputStream;Lorg/xml/sax/ContentHandler;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)V
    :try_end_0
    .catch Lorg/xml/sax/SAXException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lorg/apache/tika/exception/EncryptedDocumentException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    sget-object p1, Lorg/apache/tika/metadata/TikaCoreProperties;->TIKA_CONTENT:Lorg/apache/tika/metadata/Property;

    .line 56
    .line 57
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    invoke-virtual {p4, p1, p2}, Lorg/apache/tika/metadata/Metadata;->add(Lorg/apache/tika/metadata/Property;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    sget-object p1, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 65
    .line 66
    invoke-interface {p1}, LF2/b;->v()Z

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    if-eqz p2, :cond_3

    .line 71
    .line 72
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 73
    .line 74
    .line 75
    move-result-wide p2

    .line 76
    sub-long/2addr p2, v6

    .line 77
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-interface {p1, p2, v0}, LF2/b;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    goto/16 :goto_5

    .line 85
    .line 86
    :catchall_0
    move-exception p1

    .line 87
    goto/16 :goto_6

    .line 88
    .line 89
    :catch_0
    move-exception p3

    .line 90
    goto :goto_0

    .line 91
    :catch_1
    move-exception p3

    .line 92
    goto :goto_2

    .line 93
    :catch_2
    move-exception p3

    .line 94
    goto :goto_3

    .line 95
    :catch_3
    move-exception p3

    .line 96
    goto/16 :goto_4

    .line 97
    .line 98
    :goto_0
    :try_start_1
    invoke-static {p3}, Lorg/apache/tika/utils/ExceptionUtils;->getStackTrace(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    sget-object p5, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 103
    .line 104
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getId()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    new-instance v1, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-interface {p5, p1, p3}, LF2/b;->f(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 121
    .line 122
    .line 123
    sget-object p1, Lorg/apache/tika/metadata/TikaCoreProperties;->TIKA_CONTENT:Lorg/apache/tika/metadata/Property;

    .line 124
    .line 125
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p3

    .line 129
    invoke-virtual {p4, p1, p3}, Lorg/apache/tika/metadata/Metadata;->add(Lorg/apache/tika/metadata/Property;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    if-eqz p2, :cond_0

    .line 133
    .line 134
    sget-object p1, Lorg/apache/tika/metadata/TikaCoreProperties;->CONTAINER_EXCEPTION:Lorg/apache/tika/metadata/Property;

    .line 135
    .line 136
    invoke-virtual {p4, p1, p2}, Lorg/apache/tika/metadata/Metadata;->add(Lorg/apache/tika/metadata/Property;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    :cond_0
    invoke-interface {p5}, LF2/b;->v()Z

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    if-eqz p1, :cond_3

    .line 144
    .line 145
    :goto_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 146
    .line 147
    .line 148
    move-result-wide p1

    .line 149
    sub-long/2addr p1, v6

    .line 150
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-interface {p5, p1, v0}, LF2/b;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    goto/16 :goto_5

    .line 158
    .line 159
    :goto_2
    :try_start_2
    sget-object p5, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 160
    .line 161
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getId()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    new-instance v1, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    invoke-interface {p5, p1, p3}, LF2/b;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 178
    .line 179
    .line 180
    throw p3

    .line 181
    :goto_3
    invoke-static {p3}, Lorg/apache/tika/utils/ExceptionUtils;->getStackTrace(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p2

    .line 185
    sget-object p5, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 186
    .line 187
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getId()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    new-instance v1, Ljava/lang/StringBuilder;

    .line 192
    .line 193
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    invoke-interface {p5, p1, p3}, LF2/b;->f(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 204
    .line 205
    .line 206
    sget-object p1, Lorg/apache/tika/metadata/TikaCoreProperties;->TIKA_CONTENT:Lorg/apache/tika/metadata/Property;

    .line 207
    .line 208
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object p3

    .line 212
    invoke-virtual {p4, p1, p3}, Lorg/apache/tika/metadata/Metadata;->add(Lorg/apache/tika/metadata/Property;Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    if-eqz p2, :cond_1

    .line 216
    .line 217
    sget-object p1, Lorg/apache/tika/metadata/TikaCoreProperties;->CONTAINER_EXCEPTION:Lorg/apache/tika/metadata/Property;

    .line 218
    .line 219
    invoke-virtual {p4, p1, p2}, Lorg/apache/tika/metadata/Metadata;->add(Lorg/apache/tika/metadata/Property;Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    :cond_1
    invoke-interface {p5}, LF2/b;->v()Z

    .line 223
    .line 224
    .line 225
    move-result p1

    .line 226
    if-eqz p1, :cond_3

    .line 227
    .line 228
    goto :goto_1

    .line 229
    :goto_4
    :try_start_3
    invoke-static {p3}, Lorg/apache/tika/utils/ExceptionUtils;->getStackTrace(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p2

    .line 233
    sget-object p5, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 234
    .line 235
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getId()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    new-instance v2, Ljava/lang/StringBuilder;

    .line 240
    .line 241
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    invoke-interface {p5, p1, p3}, LF2/b;->f(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 252
    .line 253
    .line 254
    sget-object p1, Lorg/apache/tika/metadata/TikaCoreProperties;->TIKA_CONTENT:Lorg/apache/tika/metadata/Property;

    .line 255
    .line 256
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object p3

    .line 260
    invoke-virtual {p4, p1, p3}, Lorg/apache/tika/metadata/Metadata;->add(Lorg/apache/tika/metadata/Property;Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    if-eqz p2, :cond_2

    .line 264
    .line 265
    sget-object p1, Lorg/apache/tika/metadata/TikaCoreProperties;->CONTAINER_EXCEPTION:Lorg/apache/tika/metadata/Property;

    .line 266
    .line 267
    invoke-virtual {p4, p1, p2}, Lorg/apache/tika/metadata/Metadata;->add(Lorg/apache/tika/metadata/Property;Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    :cond_2
    invoke-interface {p5}, LF2/b;->v()Z

    .line 271
    .line 272
    .line 273
    move-result p1

    .line 274
    if-eqz p1, :cond_3

    .line 275
    .line 276
    goto/16 :goto_1

    .line 277
    .line 278
    :cond_3
    :goto_5
    invoke-static {p4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    return-object p1

    .line 283
    :goto_6
    sget-object p3, Lorg/apache/tika/metadata/TikaCoreProperties;->TIKA_CONTENT:Lorg/apache/tika/metadata/Property;

    .line 284
    .line 285
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object p5

    .line 289
    invoke-virtual {p4, p3, p5}, Lorg/apache/tika/metadata/Metadata;->add(Lorg/apache/tika/metadata/Property;Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    if-eqz p2, :cond_4

    .line 293
    .line 294
    sget-object p3, Lorg/apache/tika/metadata/TikaCoreProperties;->CONTAINER_EXCEPTION:Lorg/apache/tika/metadata/Property;

    .line 295
    .line 296
    invoke-virtual {p4, p3, p2}, Lorg/apache/tika/metadata/Metadata;->add(Lorg/apache/tika/metadata/Property;Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    :cond_4
    sget-object p2, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 300
    .line 301
    invoke-interface {p2}, LF2/b;->v()Z

    .line 302
    .line 303
    .line 304
    move-result p3

    .line 305
    if-eqz p3, :cond_5

    .line 306
    .line 307
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 308
    .line 309
    .line 310
    move-result-wide p3

    .line 311
    sub-long/2addr p3, v6

    .line 312
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 313
    .line 314
    .line 315
    move-result-object p3

    .line 316
    invoke-interface {p2, p3, v0}, LF2/b;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    :cond_5
    throw p1
.end method

.method private parseOne()V
    .locals 8

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesServer;->lock:[Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p0, Lorg/apache/tika/pipes/PipesServer;->parsing:Z

    .line 6
    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    iput-wide v1, p0, Lorg/apache/tika/pipes/PipesServer;->since:J

    .line 12
    .line 13
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 14
    const/4 v0, 0x0

    .line 15
    const/4 v1, 0x0

    .line 16
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 17
    .line 18
    .line 19
    move-result-wide v2

    .line 20
    invoke-direct {p0}, Lorg/apache/tika/pipes/PipesServer;->readFetchEmitTuple()Lorg/apache/tika/pipes/FetchEmitTuple;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    sget-object v4, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 25
    .line 26
    invoke-interface {v4}, LF2/b;->v()Z

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    if-eqz v5, :cond_0

    .line 31
    .line 32
    const-string v5, "timer -- read fetchEmitTuple: {} ms"

    .line 33
    .line 34
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 35
    .line 36
    .line 37
    move-result-wide v6

    .line 38
    sub-long/2addr v6, v2

    .line 39
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-interface {v4, v2, v5}, LF2/b;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception v1

    .line 48
    goto :goto_2

    .line 49
    :catch_0
    move-exception v2

    .line 50
    goto :goto_1

    .line 51
    :cond_0
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 52
    .line 53
    .line 54
    move-result-wide v2

    .line 55
    invoke-direct {p0, v1}, Lorg/apache/tika/pipes/PipesServer;->actuallyParse(Lorg/apache/tika/pipes/FetchEmitTuple;)V

    .line 56
    .line 57
    .line 58
    invoke-interface {v4}, LF2/b;->v()Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-eqz v5, :cond_1

    .line 63
    .line 64
    const-string v5, "timer -- actually parsed: {} ms"

    .line 65
    .line 66
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 67
    .line 68
    .line 69
    move-result-wide v6

    .line 70
    sub-long/2addr v6, v2

    .line 71
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-interface {v4, v2, v5}, LF2/b;->l(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    .line 77
    .line 78
    :cond_1
    iget-object v1, p0, Lorg/apache/tika/pipes/PipesServer;->lock:[Ljava/lang/Object;

    .line 79
    .line 80
    monitor-enter v1

    .line 81
    :try_start_2
    iput-boolean v0, p0, Lorg/apache/tika/pipes/PipesServer;->parsing:Z

    .line 82
    .line 83
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 84
    .line 85
    .line 86
    move-result-wide v2

    .line 87
    iput-wide v2, p0, Lorg/apache/tika/pipes/PipesServer;->since:J

    .line 88
    .line 89
    monitor-exit v1

    .line 90
    return-void

    .line 91
    :catchall_1
    move-exception v0

    .line 92
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 93
    throw v0

    .line 94
    :goto_1
    :try_start_3
    invoke-virtual {v1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getId()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-direct {p0, v1, v2}, Lorg/apache/tika/pipes/PipesServer;->handleOOM(Ljava/lang/String;Ljava/lang/OutOfMemoryError;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 99
    .line 100
    .line 101
    iget-object v1, p0, Lorg/apache/tika/pipes/PipesServer;->lock:[Ljava/lang/Object;

    .line 102
    .line 103
    monitor-enter v1

    .line 104
    :try_start_4
    iput-boolean v0, p0, Lorg/apache/tika/pipes/PipesServer;->parsing:Z

    .line 105
    .line 106
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 107
    .line 108
    .line 109
    move-result-wide v2

    .line 110
    iput-wide v2, p0, Lorg/apache/tika/pipes/PipesServer;->since:J

    .line 111
    .line 112
    monitor-exit v1

    .line 113
    return-void

    .line 114
    :catchall_2
    move-exception v0

    .line 115
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 116
    throw v0

    .line 117
    :goto_2
    iget-object v2, p0, Lorg/apache/tika/pipes/PipesServer;->lock:[Ljava/lang/Object;

    .line 118
    .line 119
    monitor-enter v2

    .line 120
    :try_start_5
    iput-boolean v0, p0, Lorg/apache/tika/pipes/PipesServer;->parsing:Z

    .line 121
    .line 122
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 123
    .line 124
    .line 125
    move-result-wide v3

    .line 126
    iput-wide v3, p0, Lorg/apache/tika/pipes/PipesServer;->since:J

    .line 127
    .line 128
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 129
    throw v1

    .line 130
    :catchall_3
    move-exception v0

    .line 131
    :try_start_6
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 132
    throw v0

    .line 133
    :catchall_4
    move-exception v1

    .line 134
    :try_start_7
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 135
    throw v1
.end method

.method private parseRecursive(Lorg/apache/tika/pipes/FetchEmitTuple;Lorg/apache/tika/pipes/HandlerConfig;Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/tika/pipes/FetchEmitTuple;",
            "Lorg/apache/tika/pipes/HandlerConfig;",
            "Ljava/io/InputStream;",
            "Lorg/apache/tika/metadata/Metadata;",
            "Lorg/apache/tika/parser/ParseContext;",
            ")",
            "Ljava/util/List<",
            "Lorg/apache/tika/metadata/Metadata;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "timer -- parse only time: {} ms"

    .line 2
    .line 3
    const-string v1, "sax problem:"

    .line 4
    .line 5
    const-string v2, "encrypted document:"

    .line 6
    .line 7
    const-string v3, "security exception:"

    .line 8
    .line 9
    const-string v4, "parse exception: "

    .line 10
    .line 11
    new-instance v5, Lorg/apache/tika/sax/RecursiveParserWrapperHandler;

    .line 12
    .line 13
    new-instance v6, Lorg/apache/tika/sax/BasicContentHandlerFactory;

    .line 14
    .line 15
    invoke-virtual {p2}, Lorg/apache/tika/pipes/HandlerConfig;->getType()Lorg/apache/tika/sax/BasicContentHandlerFactory$HANDLER_TYPE;

    .line 16
    .line 17
    .line 18
    move-result-object v7

    .line 19
    invoke-virtual {p2}, Lorg/apache/tika/pipes/HandlerConfig;->getWriteLimit()I

    .line 20
    .line 21
    .line 22
    move-result v8

    .line 23
    invoke-virtual {p2}, Lorg/apache/tika/pipes/HandlerConfig;->isThrowOnWriteLimitReached()Z

    .line 24
    .line 25
    .line 26
    move-result v9

    .line 27
    invoke-direct {v6, v7, v8, v9, p5}, Lorg/apache/tika/sax/BasicContentHandlerFactory;-><init>(Lorg/apache/tika/sax/BasicContentHandlerFactory$HANDLER_TYPE;IZLorg/apache/tika/parser/ParseContext;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2}, Lorg/apache/tika/pipes/HandlerConfig;->getMaxEmbeddedResources()I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    invoke-direct {v5, v6, p2}, Lorg/apache/tika/sax/RecursiveParserWrapperHandler;-><init>(Lorg/apache/tika/sax/ContentHandlerFactory;I)V

    .line 35
    .line 36
    .line 37
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 38
    .line 39
    .line 40
    move-result-wide v6

    .line 41
    invoke-direct {p0, p1, p3, p4, p5}, Lorg/apache/tika/pipes/PipesServer;->preParse(Lorg/apache/tika/pipes/FetchEmitTuple;Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)V

    .line 42
    .line 43
    .line 44
    :try_start_0
    iget-object p2, p0, Lorg/apache/tika/pipes/PipesServer;->rMetaParser:Lorg/apache/tika/parser/Parser;

    .line 45
    .line 46
    invoke-interface {p2, p3, v5, p4, p5}, Lorg/apache/tika/parser/Parser;->parse(Ljava/io/InputStream;Lorg/xml/sax/ContentHandler;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)V
    :try_end_0
    .catch Lorg/xml/sax/SAXException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lorg/apache/tika/exception/EncryptedDocumentException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    sget-object p1, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 50
    .line 51
    invoke-interface {p1}, LF2/b;->v()Z

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    if-eqz p2, :cond_0

    .line 56
    .line 57
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 58
    .line 59
    .line 60
    move-result-wide p2

    .line 61
    sub-long/2addr p2, v6

    .line 62
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    invoke-interface {p1, p2, v0}, LF2/b;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    goto/16 :goto_5

    .line 70
    .line 71
    :catchall_0
    move-exception p1

    .line 72
    goto/16 :goto_6

    .line 73
    .line 74
    :catch_0
    move-exception p2

    .line 75
    goto :goto_0

    .line 76
    :catch_1
    move-exception p2

    .line 77
    goto :goto_2

    .line 78
    :catch_2
    move-exception p2

    .line 79
    goto :goto_3

    .line 80
    :catch_3
    move-exception p2

    .line 81
    goto :goto_4

    .line 82
    :goto_0
    :try_start_1
    sget-object p3, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 83
    .line 84
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getId()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    new-instance p4, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {p4, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-interface {p3, p1, p2}, LF2/b;->f(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 101
    .line 102
    .line 103
    invoke-interface {p3}, LF2/b;->v()Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    if-eqz p1, :cond_0

    .line 108
    .line 109
    :goto_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 110
    .line 111
    .line 112
    move-result-wide p1

    .line 113
    sub-long/2addr p1, v6

    .line 114
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-interface {p3, p1, v0}, LF2/b;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    goto :goto_5

    .line 122
    :goto_2
    :try_start_2
    sget-object p3, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 123
    .line 124
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getId()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    new-instance p4, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    invoke-direct {p4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-interface {p3, p1, p2}, LF2/b;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 141
    .line 142
    .line 143
    throw p2

    .line 144
    :goto_3
    sget-object p3, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 145
    .line 146
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getId()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    new-instance p4, Ljava/lang/StringBuilder;

    .line 151
    .line 152
    invoke-direct {p4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    invoke-interface {p3, p1, p2}, LF2/b;->f(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 163
    .line 164
    .line 165
    invoke-interface {p3}, LF2/b;->v()Z

    .line 166
    .line 167
    .line 168
    move-result p1

    .line 169
    if-eqz p1, :cond_0

    .line 170
    .line 171
    goto :goto_1

    .line 172
    :goto_4
    :try_start_3
    sget-object p3, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 173
    .line 174
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getId()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    new-instance p4, Ljava/lang/StringBuilder;

    .line 179
    .line 180
    invoke-direct {p4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    invoke-interface {p3, p1, p2}, LF2/b;->f(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 191
    .line 192
    .line 193
    invoke-interface {p3}, LF2/b;->v()Z

    .line 194
    .line 195
    .line 196
    move-result p1

    .line 197
    if-eqz p1, :cond_0

    .line 198
    .line 199
    goto :goto_1

    .line 200
    :cond_0
    :goto_5
    invoke-virtual {v5}, Lorg/apache/tika/sax/RecursiveParserWrapperHandler;->getMetadataList()Ljava/util/List;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    return-object p1

    .line 205
    :goto_6
    sget-object p2, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 206
    .line 207
    invoke-interface {p2}, LF2/b;->v()Z

    .line 208
    .line 209
    .line 210
    move-result p3

    .line 211
    if-eqz p3, :cond_1

    .line 212
    .line 213
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 214
    .line 215
    .line 216
    move-result-wide p3

    .line 217
    sub-long/2addr p3, v6

    .line 218
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 219
    .line 220
    .line 221
    move-result-object p3

    .line 222
    invoke-interface {p2, p3, v0}, LF2/b;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    :cond_1
    throw p1
.end method

.method private parseWithStream(Lorg/apache/tika/pipes/FetchEmitTuple;Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;)Lorg/apache/tika/pipes/PipesServer$MetadataListAndEmbeddedBytes;
    .locals 6

    .line 1
    invoke-direct {p0, p1}, Lorg/apache/tika/pipes/PipesServer;->setupParseContext(Lorg/apache/tika/pipes/FetchEmitTuple;)Lorg/apache/tika/parser/ParseContext;

    .line 2
    .line 3
    .line 4
    move-result-object v5

    .line 5
    const-class v0, Lorg/apache/tika/pipes/HandlerConfig;

    .line 6
    .line 7
    invoke-virtual {v5, v0}, Lorg/apache/tika/parser/ParseContext;->get(Ljava/lang/Class;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    move-object v2, v0

    .line 12
    check-cast v2, Lorg/apache/tika/pipes/HandlerConfig;

    .line 13
    .line 14
    invoke-virtual {v2}, Lorg/apache/tika/pipes/HandlerConfig;->getParseMode()Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sget-object v1, Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;->RMETA:Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;

    .line 19
    .line 20
    if-ne v0, v1, :cond_0

    .line 21
    .line 22
    move-object v0, p0

    .line 23
    move-object v1, p1

    .line 24
    move-object v3, p2

    .line 25
    move-object v4, p3

    .line 26
    invoke-direct/range {v0 .. v5}, Lorg/apache/tika/pipes/PipesServer;->parseRecursive(Lorg/apache/tika/pipes/FetchEmitTuple;Lorg/apache/tika/pipes/HandlerConfig;Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object v0, p0

    .line 32
    move-object v1, p1

    .line 33
    move-object v3, p2

    .line 34
    move-object v4, p3

    .line 35
    invoke-direct/range {v0 .. v5}, Lorg/apache/tika/pipes/PipesServer;->parseConcatenated(Lorg/apache/tika/pipes/FetchEmitTuple;Lorg/apache/tika/pipes/HandlerConfig;Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    :goto_0
    new-instance p2, Lorg/apache/tika/pipes/PipesServer$MetadataListAndEmbeddedBytes;

    .line 40
    .line 41
    const-class p3, Lorg/apache/tika/extractor/EmbeddedDocumentBytesHandler;

    .line 42
    .line 43
    invoke-virtual {v5, p3}, Lorg/apache/tika/parser/ParseContext;->get(Ljava/lang/Class;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p3

    .line 47
    check-cast p3, Lorg/apache/tika/extractor/EmbeddedDocumentBytesHandler;

    .line 48
    .line 49
    invoke-direct {p2, p1, p3}, Lorg/apache/tika/pipes/PipesServer$MetadataListAndEmbeddedBytes;-><init>(Ljava/util/List;Lorg/apache/tika/extractor/EmbeddedDocumentBytesHandler;)V

    .line 50
    .line 51
    .line 52
    return-object p2
.end method

.method private preParse(Lorg/apache/tika/pipes/FetchEmitTuple;Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p2}, Lorg/apache/tika/io/TikaInputStream;->cast(Ljava/io/InputStream;)Lorg/apache/tika/io/TikaInputStream;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-static {p2, v0, p3}, Lorg/apache/tika/io/TikaInputStream;->get(Ljava/io/InputStream;Lorg/apache/tika/io/TemporaryResources;Lorg/apache/tika/metadata/Metadata;)Lorg/apache/tika/io/TikaInputStream;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    :goto_0
    invoke-direct {p0, p1, v0, p3, p4}, Lorg/apache/tika/pipes/PipesServer;->_preParse(Lorg/apache/tika/pipes/FetchEmitTuple;Lorg/apache/tika/io/TikaInputStream;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    sget-object p2, Ls2/c;->a:[B

    .line 19
    .line 20
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getEmitKey()Lorg/apache/tika/pipes/emitter/EmitKey;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-direct {p0, p1, p3}, Lorg/apache/tika/pipes/PipesServer;->writeIntermediate(Lorg/apache/tika/pipes/emitter/EmitKey;Lorg/apache/tika/metadata/Metadata;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :goto_1
    sget-object p2, Ls2/c;->a:[B

    .line 29
    .line 30
    throw p1
.end method

.method private readFetchEmitTuple()Lorg/apache/tika/pipes/FetchEmitTuple;
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    :try_start_0
    iget-object v1, p0, Lorg/apache/tika/pipes/PipesServer;->input:Ljava/io/DataInputStream;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readInt()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    new-array v1, v1, [B

    .line 9
    .line 10
    iget-object v2, p0, Lorg/apache/tika/pipes/PipesServer;->input:Ljava/io/DataInputStream;

    .line 11
    .line 12
    invoke-virtual {v2, v1}, Ljava/io/DataInputStream;->readFully([B)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Ljava/io/ObjectInputStream;

    .line 16
    .line 17
    sget v3, Lw2/h;->o:I

    .line 18
    .line 19
    new-instance v3, Lw2/g;

    .line 20
    .line 21
    invoke-direct {v3}, Lt2/d;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3, v1}, Lw2/g;->W([B)V

    .line 25
    .line 26
    .line 27
    new-instance v1, Lw2/h;

    .line 28
    .line 29
    invoke-direct {v1, v3}, Lw2/h;-><init>(Lw2/g;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {v2, v1}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    .line 35
    :try_start_1
    invoke-virtual {v2}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Lorg/apache/tika/pipes/FetchEmitTuple;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    .line 41
    :try_start_2
    invoke-virtual {v2}, Ljava/io/ObjectInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_0

    .line 42
    .line 43
    .line 44
    return-object v1

    .line 45
    :catch_0
    move-exception v1

    .line 46
    goto :goto_1

    .line 47
    :catch_1
    move-exception v1

    .line 48
    goto :goto_2

    .line 49
    :catchall_0
    move-exception v1

    .line 50
    :try_start_3
    invoke-virtual {v2}, Ljava/io/ObjectInputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catchall_1
    move-exception v2

    .line 55
    :try_start_4
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    :goto_0
    throw v1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_0

    .line 59
    :goto_1
    sget-object v2, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 60
    .line 61
    const-string v3, "can\'t find class?!"

    .line 62
    .line 63
    invoke-interface {v2, v3, v1}, LF2/b;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    invoke-direct {p0, v0}, Lorg/apache/tika/pipes/PipesServer;->exit(I)V

    .line 67
    .line 68
    .line 69
    goto :goto_3

    .line 70
    :goto_2
    sget-object v2, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 71
    .line 72
    const-string v3, "problem reading tuple"

    .line 73
    .line 74
    invoke-interface {v2, v3, v1}, LF2/b;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    invoke-direct {p0, v0}, Lorg/apache/tika/pipes/PipesServer;->exit(I)V

    .line 78
    .line 79
    .line 80
    :goto_3
    const/4 v0, 0x0

    .line 81
    return-object v0
.end method

.method private setupParseContext(Lorg/apache/tika/pipes/FetchEmitTuple;)Lorg/apache/tika/parser/ParseContext;
    .locals 5

    .line 1
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getParseContext()Lorg/apache/tika/parser/ParseContext;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lorg/apache/tika/pipes/HandlerConfig;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lorg/apache/tika/parser/ParseContext;->get(Ljava/lang/Class;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    sget-object v2, Lorg/apache/tika/pipes/HandlerConfig;->DEFAULT_HANDLER_CONFIG:Lorg/apache/tika/pipes/HandlerConfig;

    .line 14
    .line 15
    invoke-virtual {v0, v1, v2}, Lorg/apache/tika/parser/ParseContext;->set(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    const-class v1, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lorg/apache/tika/parser/ParseContext;->get(Ljava/lang/Class;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;

    .line 25
    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    sget-object p1, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->SKIP:Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;

    .line 29
    .line 30
    invoke-virtual {v0, v1, p1}, Lorg/apache/tika/parser/ParseContext;->set(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-object v0

    .line 34
    :cond_1
    iget-object v1, p0, Lorg/apache/tika/pipes/PipesServer;->autoDetectParser:Lorg/apache/tika/parser/Parser;

    .line 35
    .line 36
    check-cast v1, Lorg/apache/tika/parser/AutoDetectParser;

    .line 37
    .line 38
    invoke-virtual {v1}, Lorg/apache/tika/parser/AutoDetectParser;->getAutoDetectParserConfig()Lorg/apache/tika/parser/AutoDetectParserConfig;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Lorg/apache/tika/parser/AutoDetectParserConfig;->getEmbeddedDocumentExtractorFactory()Lorg/apache/tika/extractor/EmbeddedDocumentExtractorFactory;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    if-nez v1, :cond_2

    .line 47
    .line 48
    new-instance v1, Lorg/apache/tika/extractor/RUnpackExtractor;

    .line 49
    .line 50
    sget-wide v3, Lorg/apache/tika/extractor/RUnpackExtractorFactory;->DEFAULT_MAX_EMBEDDED_BYTES_FOR_EXTRACTION:J

    .line 51
    .line 52
    invoke-direct {v1, v0, v3, v4}, Lorg/apache/tika/extractor/RUnpackExtractor;-><init>(Lorg/apache/tika/parser/ParseContext;J)V

    .line 53
    .line 54
    .line 55
    const-class v3, Lorg/apache/tika/extractor/EmbeddedDocumentExtractor;

    .line 56
    .line 57
    invoke-virtual {v0, v3, v1}, Lorg/apache/tika/parser/ParseContext;->set(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    instance-of v3, v1, Lorg/apache/tika/extractor/EmbeddedDocumentByteStoreExtractorFactory;

    .line 62
    .line 63
    if-eqz v3, :cond_4

    .line 64
    .line 65
    :goto_0
    invoke-virtual {v2}, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->getEmitter()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-static {v1}, Lorg/apache/tika/utils/StringUtils;->isBlank(Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    const-class v3, Lorg/apache/tika/extractor/EmbeddedDocumentBytesHandler;

    .line 74
    .line 75
    if-nez v1, :cond_3

    .line 76
    .line 77
    new-instance v1, Lorg/apache/tika/pipes/extractor/EmittingEmbeddedDocumentBytesHandler;

    .line 78
    .line 79
    iget-object v2, p0, Lorg/apache/tika/pipes/PipesServer;->emitterManager:Lorg/apache/tika/pipes/emitter/EmitterManager;

    .line 80
    .line 81
    invoke-direct {v1, p1, v2}, Lorg/apache/tika/pipes/extractor/EmittingEmbeddedDocumentBytesHandler;-><init>(Lorg/apache/tika/pipes/FetchEmitTuple;Lorg/apache/tika/pipes/emitter/EmitterManager;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v3, v1}, Lorg/apache/tika/parser/ParseContext;->set(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    return-object v0

    .line 88
    :cond_3
    new-instance p1, Lorg/apache/tika/extractor/BasicEmbeddedDocumentBytesHandler;

    .line 89
    .line 90
    invoke-direct {p1, v2}, Lorg/apache/tika/extractor/BasicEmbeddedDocumentBytesHandler;-><init>(Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v3, p1}, Lorg/apache/tika/parser/ParseContext;->set(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    return-object v0

    .line 97
    :cond_4
    new-instance p1, Lorg/apache/tika/exception/TikaConfigException;

    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    const-string v2, "EmbeddedDocumentExtractorFactory must be an instance of EmbeddedDocumentByteStoreExtractorFactory if you wantto extract embedded bytes! I see this embedded doc factory: "

    .line 112
    .line 113
    const-string v3, "and a request: "

    .line 114
    .line 115
    invoke-static {v2, v0, v3, v1}, LB1/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-direct {p1, v0}, Lorg/apache/tika/exception/TikaConfigException;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    throw p1
.end method

.method private write(Lorg/apache/tika/pipes/PipesServer$STATUS;)V
    .locals 2

    .line 21
    :try_start_0
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesServer;->output:Ljava/io/DataOutputStream;

    invoke-virtual {p1}, Lorg/apache/tika/pipes/PipesServer$STATUS;->getByte()B

    move-result p1

    invoke-virtual {v0, p1}, Ljava/io/DataOutputStream;->write(I)V

    .line 22
    iget-object p1, p0, Lorg/apache/tika/pipes/PipesServer;->output:Ljava/io/DataOutputStream;

    invoke-virtual {p1}, Ljava/io/DataOutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 23
    sget-object v0, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    const-string v1, "problem writing data (forking process shutdown?)"

    invoke-interface {v0, v1, p1}, LF2/b;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x1

    .line 24
    invoke-direct {p0, p1}, Lorg/apache/tika/pipes/PipesServer;->exit(I)V

    return-void
.end method

.method private write(Lorg/apache/tika/pipes/PipesServer$STATUS;Ljava/lang/String;)V
    .locals 1

    .line 12
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p2

    .line 13
    invoke-direct {p0, p1, p2}, Lorg/apache/tika/pipes/PipesServer;->write(Lorg/apache/tika/pipes/PipesServer$STATUS;[B)V

    return-void
.end method

.method private write(Lorg/apache/tika/pipes/PipesServer$STATUS;[B)V
    .locals 2

    .line 14
    :try_start_0
    array-length v0, p2

    .line 15
    iget-object v1, p0, Lorg/apache/tika/pipes/PipesServer;->output:Ljava/io/DataOutputStream;

    invoke-virtual {p1}, Lorg/apache/tika/pipes/PipesServer$STATUS;->getByte()B

    move-result p1

    invoke-virtual {v1, p1}, Ljava/io/DataOutputStream;->write(I)V

    .line 16
    iget-object p1, p0, Lorg/apache/tika/pipes/PipesServer;->output:Ljava/io/DataOutputStream;

    invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 17
    iget-object p1, p0, Lorg/apache/tika/pipes/PipesServer;->output:Ljava/io/DataOutputStream;

    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    .line 18
    iget-object p1, p0, Lorg/apache/tika/pipes/PipesServer;->output:Ljava/io/DataOutputStream;

    invoke-virtual {p1}, Ljava/io/DataOutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 19
    sget-object p2, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    const-string v0, "problem writing data (forking process shutdown?)"

    invoke-interface {p2, v0, p1}, LF2/b;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x1

    .line 20
    invoke-direct {p0, p1}, Lorg/apache/tika/pipes/PipesServer;->exit(I)V

    return-void
.end method

.method private write(Lorg/apache/tika/pipes/emitter/EmitData;)V
    .locals 2

    .line 1
    :try_start_0
    sget v0, Lx2/c;->p:I

    .line 2
    new-instance v0, Lw2/e;

    .line 3
    invoke-direct {v0}, Lt2/d;-><init>()V

    .line 4
    new-instance v1, Lx2/c;

    invoke-direct {v1, v0}, Lx2/c;-><init>(Lw2/e;)V

    .line 5
    new-instance v0, Ljava/io/ObjectOutputStream;

    invoke-direct {v0, v1}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    :try_start_1
    invoke-virtual {v0, p1}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 7
    :try_start_2
    invoke-virtual {v0}, Ljava/io/ObjectOutputStream;->close()V

    .line 8
    sget-object p1, Lorg/apache/tika/pipes/PipesServer$STATUS;->PARSE_SUCCESS:Lorg/apache/tika/pipes/PipesServer$STATUS;

    invoke-virtual {v1}, Lx2/c;->b()[B

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lorg/apache/tika/pipes/PipesServer;->write(Lorg/apache/tika/pipes/PipesServer$STATUS;[B)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 9
    :try_start_3
    invoke-virtual {v0}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 10
    :goto_1
    sget-object v0, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    const-string v1, "problem writing emit data (forking process shutdown?)"

    invoke-interface {v0, v1, p1}, LF2/b;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x1

    .line 11
    invoke-direct {p0, p1}, Lorg/apache/tika/pipes/PipesServer;->exit(I)V

    return-void
.end method

.method private writeIntermediate(Lorg/apache/tika/pipes/emitter/EmitKey;Lorg/apache/tika/metadata/Metadata;)V
    .locals 1

    .line 1
    :try_start_0
    sget p1, Lx2/c;->p:I

    .line 2
    .line 3
    new-instance p1, Lw2/e;

    .line 4
    .line 5
    invoke-direct {p1}, Lt2/d;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lx2/c;

    .line 9
    .line 10
    invoke-direct {v0, p1}, Lx2/c;-><init>(Lw2/e;)V

    .line 11
    .line 12
    .line 13
    new-instance p1, Ljava/io/ObjectOutputStream;

    .line 14
    .line 15
    invoke-direct {p1, v0}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    :try_start_1
    invoke-virtual {p1, p2}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    .line 20
    .line 21
    :try_start_2
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->close()V

    .line 22
    .line 23
    .line 24
    sget-object p1, Lorg/apache/tika/pipes/PipesServer$STATUS;->INTERMEDIATE_RESULT:Lorg/apache/tika/pipes/PipesServer$STATUS;

    .line 25
    .line 26
    invoke-virtual {v0}, Lx2/c;->b()[B

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-direct {p0, p1, p2}, Lorg/apache/tika/pipes/PipesServer;->write(Lorg/apache/tika/pipes/PipesServer$STATUS;[B)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :catch_0
    move-exception p1

    .line 35
    goto :goto_1

    .line 36
    :catchall_0
    move-exception p2

    .line 37
    :try_start_3
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_1
    move-exception p1

    .line 42
    :try_start_4
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    :goto_0
    throw p2
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 46
    :goto_1
    sget-object p2, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 47
    .line 48
    const-string v0, "problem writing intermediate data (forking process shutdown?)"

    .line 49
    .line 50
    invoke-interface {p2, v0, p1}, LF2/b;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    const/4 p1, 0x1

    .line 54
    invoke-direct {p0, p1}, Lorg/apache/tika/pipes/PipesServer;->exit(I)V

    .line 55
    .line 56
    .line 57
    return-void
.end method


# virtual methods
.method public initializeResources()V
    .locals 4

    .line 1
    new-instance v0, Lorg/apache/tika/config/TikaConfig;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/apache/tika/pipes/PipesServer;->tikaConfigPath:Ljava/nio/file/Path;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lorg/apache/tika/config/TikaConfig;-><init>(Ljava/nio/file/Path;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lorg/apache/tika/pipes/PipesServer;->tikaConfig:Lorg/apache/tika/config/TikaConfig;

    .line 9
    .line 10
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesServer;->tikaConfigPath:Ljava/nio/file/Path;

    .line 11
    .line 12
    invoke-static {v0}, Lorg/apache/tika/pipes/fetcher/FetcherManager;->load(Ljava/nio/file/Path;)Lorg/apache/tika/pipes/fetcher/FetcherManager;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lorg/apache/tika/pipes/PipesServer;->fetcherManager:Lorg/apache/tika/pipes/fetcher/FetcherManager;

    .line 17
    .line 18
    iget-wide v0, p0, Lorg/apache/tika/pipes/PipesServer;->maxForEmitBatchBytes:J

    .line 19
    .line 20
    const-wide/16 v2, -0x1

    .line 21
    .line 22
    cmp-long v0, v0, v2

    .line 23
    .line 24
    if-lez v0, :cond_0

    .line 25
    .line 26
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesServer;->tikaConfigPath:Ljava/nio/file/Path;

    .line 27
    .line 28
    invoke-static {v0}, Lorg/apache/tika/pipes/emitter/EmitterManager;->load(Ljava/nio/file/Path;)Lorg/apache/tika/pipes/emitter/EmitterManager;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lorg/apache/tika/pipes/PipesServer;->emitterManager:Lorg/apache/tika/pipes/emitter/EmitterManager;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    sget-object v0, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 36
    .line 37
    const-string v1, "\'maxForEmitBatchBytes\' < 0. Not initializing emitters in PipesServer"

    .line 38
    .line 39
    invoke-interface {v0, v1}, LF2/b;->u(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    iput-object v0, p0, Lorg/apache/tika/pipes/PipesServer;->emitterManager:Lorg/apache/tika/pipes/emitter/EmitterManager;

    .line 44
    .line 45
    :goto_0
    new-instance v0, Lorg/apache/tika/parser/AutoDetectParser;

    .line 46
    .line 47
    iget-object v1, p0, Lorg/apache/tika/pipes/PipesServer;->tikaConfig:Lorg/apache/tika/config/TikaConfig;

    .line 48
    .line 49
    invoke-direct {v0, v1}, Lorg/apache/tika/parser/AutoDetectParser;-><init>(Lorg/apache/tika/config/TikaConfig;)V

    .line 50
    .line 51
    .line 52
    iput-object v0, p0, Lorg/apache/tika/pipes/PipesServer;->autoDetectParser:Lorg/apache/tika/parser/Parser;

    .line 53
    .line 54
    invoke-virtual {v0}, Lorg/apache/tika/parser/AutoDetectParser;->getAutoDetectParserConfig()Lorg/apache/tika/parser/AutoDetectParserConfig;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Lorg/apache/tika/parser/AutoDetectParserConfig;->getDigesterFactory()Lorg/apache/tika/parser/DigestingParser$DigesterFactory;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-eqz v0, :cond_1

    .line 63
    .line 64
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesServer;->autoDetectParser:Lorg/apache/tika/parser/Parser;

    .line 65
    .line 66
    check-cast v0, Lorg/apache/tika/parser/AutoDetectParser;

    .line 67
    .line 68
    invoke-virtual {v0}, Lorg/apache/tika/parser/AutoDetectParser;->getAutoDetectParserConfig()Lorg/apache/tika/parser/AutoDetectParserConfig;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, Lorg/apache/tika/parser/AutoDetectParserConfig;->getDigesterFactory()Lorg/apache/tika/parser/DigestingParser$DigesterFactory;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-interface {v0}, Lorg/apache/tika/parser/DigestingParser$DigesterFactory;->build()Lorg/apache/tika/parser/DigestingParser$Digester;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iput-object v0, p0, Lorg/apache/tika/pipes/PipesServer;->digester:Lorg/apache/tika/parser/DigestingParser$Digester;

    .line 81
    .line 82
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesServer;->autoDetectParser:Lorg/apache/tika/parser/Parser;

    .line 83
    .line 84
    check-cast v0, Lorg/apache/tika/parser/AutoDetectParser;

    .line 85
    .line 86
    invoke-virtual {v0}, Lorg/apache/tika/parser/AutoDetectParser;->getAutoDetectParserConfig()Lorg/apache/tika/parser/AutoDetectParserConfig;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v0}, Lorg/apache/tika/parser/AutoDetectParserConfig;->getDigesterFactory()Lorg/apache/tika/parser/DigestingParser$DigesterFactory;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    const/4 v1, 0x1

    .line 95
    invoke-interface {v0, v1}, Lorg/apache/tika/parser/DigestingParser$DigesterFactory;->setSkipContainerDocument(Z)V

    .line 96
    .line 97
    .line 98
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesServer;->autoDetectParser:Lorg/apache/tika/parser/Parser;

    .line 99
    .line 100
    check-cast v0, Lorg/apache/tika/parser/AutoDetectParser;

    .line 101
    .line 102
    invoke-virtual {v0}, Lorg/apache/tika/parser/AutoDetectParser;->getAutoDetectParserConfig()Lorg/apache/tika/parser/AutoDetectParserConfig;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {v0}, Lorg/apache/tika/parser/AutoDetectParserConfig;->getEmbeddedDocumentExtractorFactory()Lorg/apache/tika/extractor/EmbeddedDocumentExtractorFactory;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    if-nez v0, :cond_1

    .line 111
    .line 112
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesServer;->autoDetectParser:Lorg/apache/tika/parser/Parser;

    .line 113
    .line 114
    check-cast v0, Lorg/apache/tika/parser/AutoDetectParser;

    .line 115
    .line 116
    invoke-virtual {v0}, Lorg/apache/tika/parser/AutoDetectParser;->getAutoDetectParserConfig()Lorg/apache/tika/parser/AutoDetectParserConfig;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    new-instance v1, Lorg/apache/tika/extractor/RUnpackExtractorFactory;

    .line 121
    .line 122
    invoke-direct {v1}, Lorg/apache/tika/extractor/RUnpackExtractorFactory;-><init>()V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v1}, Lorg/apache/tika/parser/AutoDetectParserConfig;->setEmbeddedDocumentExtractorFactory(Lorg/apache/tika/extractor/EmbeddedDocumentExtractorFactory;)V

    .line 126
    .line 127
    .line 128
    :cond_1
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesServer;->autoDetectParser:Lorg/apache/tika/parser/Parser;

    .line 129
    .line 130
    check-cast v0, Lorg/apache/tika/parser/AutoDetectParser;

    .line 131
    .line 132
    invoke-virtual {v0}, Lorg/apache/tika/parser/AutoDetectParser;->getDetector()Lorg/apache/tika/detect/Detector;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    iput-object v0, p0, Lorg/apache/tika/pipes/PipesServer;->detector:Lorg/apache/tika/detect/Detector;

    .line 137
    .line 138
    new-instance v0, Lorg/apache/tika/parser/RecursiveParserWrapper;

    .line 139
    .line 140
    iget-object v1, p0, Lorg/apache/tika/pipes/PipesServer;->autoDetectParser:Lorg/apache/tika/parser/Parser;

    .line 141
    .line 142
    invoke-direct {v0, v1}, Lorg/apache/tika/parser/RecursiveParserWrapper;-><init>(Lorg/apache/tika/parser/Parser;)V

    .line 143
    .line 144
    .line 145
    iput-object v0, p0, Lorg/apache/tika/pipes/PipesServer;->rMetaParser:Lorg/apache/tika/parser/Parser;

    .line 146
    .line 147
    return-void
.end method

.method public parseFromTuple(Lorg/apache/tika/pipes/FetchEmitTuple;Lorg/apache/tika/pipes/fetcher/Fetcher;)Lorg/apache/tika/pipes/PipesServer$MetadataListAndEmbeddedBytes;
    .locals 3

    .line 1
    new-instance v0, Lorg/apache/tika/metadata/Metadata;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/apache/tika/metadata/Metadata;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getFetchKey()Lorg/apache/tika/pipes/fetcher/FetchKey;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Lorg/apache/tika/pipes/fetcher/FetchKey;->getFetchKey()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getParseContext()Lorg/apache/tika/parser/ParseContext;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-interface {p2, v1, v0, v2}, Lorg/apache/tika/pipes/fetcher/Fetcher;->fetch(Ljava/lang/String;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)Ljava/io/InputStream;

    .line 19
    .line 20
    .line 21
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lorg/apache/tika/exception/TikaException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    :try_start_1
    invoke-direct {p0, p1, p2, v0}, Lorg/apache/tika/pipes/PipesServer;->parseWithStream(Lorg/apache/tika/pipes/FetchEmitTuple;Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;)Lorg/apache/tika/pipes/PipesServer$MetadataListAndEmbeddedBytes;

    .line 23
    .line 24
    .line 25
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    if-eqz p2, :cond_0

    .line 27
    .line 28
    :try_start_2
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Lorg/apache/tika/exception/TikaException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 29
    .line 30
    .line 31
    return-object v0

    .line 32
    :catch_0
    move-exception p2

    .line 33
    goto :goto_1

    .line 34
    :catch_1
    move-exception p2

    .line 35
    goto :goto_1

    .line 36
    :catch_2
    move-exception p2

    .line 37
    goto :goto_2

    .line 38
    :cond_0
    return-object v0

    .line 39
    :catchall_0
    move-exception v0

    .line 40
    if-eqz p2, :cond_1

    .line 41
    .line 42
    :try_start_3
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_1
    move-exception p2

    .line 47
    :try_start_4
    invoke-virtual {v0, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    :goto_0
    throw v0
    :try_end_4
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Lorg/apache/tika/exception/TikaException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 51
    :goto_1
    sget-object v0, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 52
    .line 53
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getId()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    new-instance v1, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    const-string v2, "fetch exception "

    .line 60
    .line 61
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-interface {v0, p1, p2}, LF2/b;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    sget-object p1, Lorg/apache/tika/pipes/PipesServer$STATUS;->FETCH_EXCEPTION:Lorg/apache/tika/pipes/PipesServer$STATUS;

    .line 75
    .line 76
    invoke-static {p2}, Lorg/apache/tika/utils/ExceptionUtils;->getStackTrace(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-direct {p0, p1, p2}, Lorg/apache/tika/pipes/PipesServer;->write(Lorg/apache/tika/pipes/PipesServer$STATUS;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    const/4 p1, 0x0

    .line 84
    return-object p1

    .line 85
    :goto_2
    sget-object v0, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 86
    .line 87
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getId()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    new-instance v1, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    const-string v2, "security exception "

    .line 94
    .line 95
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-interface {v0, p1, p2}, LF2/b;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 106
    .line 107
    .line 108
    throw p2
.end method

.method public processRequests()V
    .locals 8

    .line 1
    sget-object v0, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 2
    .line 3
    const-string v1, "processing requests"

    .line 4
    .line 5
    invoke-interface {v0, v1}, LF2/b;->u(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    invoke-virtual {p0}, Lorg/apache/tika/pipes/PipesServer;->initializeResources()V

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, LF2/b;->v()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    const-string v3, "timer -- initialize parser and other resources: {} ms"

    .line 22
    .line 23
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 24
    .line 25
    .line 26
    move-result-wide v4

    .line 27
    sub-long/2addr v4, v1

    .line 28
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-interface {v0, v1, v3}, LF2/b;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    goto/16 :goto_4

    .line 38
    .line 39
    :cond_0
    :goto_0
    const-string v1, "pipes server initialized"

    .line 40
    .line 41
    invoke-interface {v0, v1}, LF2/b;->u(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    const/4 v0, 0x1

    .line 45
    :try_start_1
    sget-object v1, Lorg/apache/tika/pipes/PipesServer$STATUS;->READY:Lorg/apache/tika/pipes/PipesServer$STATUS;

    .line 46
    .line 47
    invoke-direct {p0, v1}, Lorg/apache/tika/pipes/PipesServer;->write(Lorg/apache/tika/pipes/PipesServer$STATUS;)V

    .line 48
    .line 49
    .line 50
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 51
    .line 52
    .line 53
    move-result-wide v1

    .line 54
    :goto_1
    iget-object v3, p0, Lorg/apache/tika/pipes/PipesServer;->input:Ljava/io/DataInputStream;

    .line 55
    .line 56
    invoke-virtual {v3}, Ljava/io/InputStream;->read()I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    const/4 v4, -0x1

    .line 61
    if-ne v3, v4, :cond_1

    .line 62
    .line 63
    sget-object v3, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 64
    .line 65
    const-string v4, "received -1 from client; shutting down"

    .line 66
    .line 67
    invoke-interface {v3, v4}, LF2/b;->m(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-direct {p0, v0}, Lorg/apache/tika/pipes/PipesServer;->exit(I)V

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :catchall_1
    move-exception v1

    .line 75
    goto :goto_3

    .line 76
    :cond_1
    sget-object v4, Lorg/apache/tika/pipes/PipesServer$STATUS;->PING:Lorg/apache/tika/pipes/PipesServer$STATUS;

    .line 77
    .line 78
    invoke-virtual {v4}, Lorg/apache/tika/pipes/PipesServer$STATUS;->getByte()B

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    if-ne v3, v5, :cond_3

    .line 83
    .line 84
    sget-object v3, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 85
    .line 86
    invoke-interface {v3}, LF2/b;->v()Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-eqz v5, :cond_2

    .line 91
    .line 92
    const-string v5, "timer -- ping: {} ms"

    .line 93
    .line 94
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 95
    .line 96
    .line 97
    move-result-wide v6

    .line 98
    sub-long/2addr v6, v1

    .line 99
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-interface {v3, v1, v5}, LF2/b;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    :cond_2
    invoke-direct {p0, v4}, Lorg/apache/tika/pipes/PipesServer;->write(Lorg/apache/tika/pipes/PipesServer$STATUS;)V

    .line 107
    .line 108
    .line 109
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 110
    .line 111
    .line 112
    move-result-wide v1

    .line 113
    goto :goto_2

    .line 114
    :cond_3
    sget-object v4, Lorg/apache/tika/pipes/PipesServer$STATUS;->CALL:Lorg/apache/tika/pipes/PipesServer$STATUS;

    .line 115
    .line 116
    invoke-virtual {v4}, Lorg/apache/tika/pipes/PipesServer$STATUS;->getByte()B

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    if-ne v3, v4, :cond_5

    .line 121
    .line 122
    invoke-direct {p0}, Lorg/apache/tika/pipes/PipesServer;->parseOne()V

    .line 123
    .line 124
    .line 125
    sget-object v3, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 126
    .line 127
    invoke-interface {v3}, LF2/b;->v()Z

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    if-eqz v4, :cond_4

    .line 132
    .line 133
    const-string v4, "timer -- parse one: {} ms"

    .line 134
    .line 135
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 136
    .line 137
    .line 138
    move-result-wide v5

    .line 139
    sub-long/2addr v5, v1

    .line 140
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-interface {v3, v1, v4}, LF2/b;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    :cond_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 148
    .line 149
    .line 150
    move-result-wide v1

    .line 151
    :goto_2
    iget-object v3, p0, Lorg/apache/tika/pipes/PipesServer;->output:Ljava/io/DataOutputStream;

    .line 152
    .line 153
    invoke-virtual {v3}, Ljava/io/DataOutputStream;->flush()V

    .line 154
    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 158
    .line 159
    const-string v2, "Unexpected request"

    .line 160
    .line 161
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 165
    :goto_3
    sget-object v2, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 166
    .line 167
    const-string v3, "main loop error (did the forking process shut down?)"

    .line 168
    .line 169
    invoke-interface {v2, v3, v1}, LF2/b;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 170
    .line 171
    .line 172
    invoke-direct {p0, v0}, Lorg/apache/tika/pipes/PipesServer;->exit(I)V

    .line 173
    .line 174
    .line 175
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 176
    .line 177
    invoke-virtual {v0}, Ljava/io/PrintStream;->flush()V

    .line 178
    .line 179
    .line 180
    return-void

    .line 181
    :goto_4
    sget-object v1, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 182
    .line 183
    const-string v2, "couldn\'t initialize parser"

    .line 184
    .line 185
    invoke-interface {v1, v2, v0}, LF2/b;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 186
    .line 187
    .line 188
    :try_start_2
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesServer;->output:Ljava/io/DataOutputStream;

    .line 189
    .line 190
    sget-object v1, Lorg/apache/tika/pipes/PipesServer$STATUS;->FAILED_TO_START:Lorg/apache/tika/pipes/PipesServer$STATUS;

    .line 191
    .line 192
    invoke-virtual {v1}, Lorg/apache/tika/pipes/PipesServer$STATUS;->getByte()B

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 197
    .line 198
    .line 199
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesServer;->output:Ljava/io/DataOutputStream;

    .line 200
    .line 201
    invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 202
    .line 203
    .line 204
    goto :goto_5

    .line 205
    :catch_0
    move-exception v0

    .line 206
    sget-object v1, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 207
    .line 208
    const-string v2, "couldn\'t notify of failure to start"

    .line 209
    .line 210
    invoke-interface {v1, v2, v0}, LF2/b;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 211
    .line 212
    .line 213
    :goto_5
    return-void
.end method

.method public run()V
    .locals 7

    .line 1
    :goto_0
    :try_start_0
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesServer;->lock:[Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 5
    .line 6
    .line 7
    move-result-wide v1

    .line 8
    iget-wide v3, p0, Lorg/apache/tika/pipes/PipesServer;->since:J

    .line 9
    .line 10
    sub-long/2addr v1, v3

    .line 11
    iget-boolean v3, p0, Lorg/apache/tika/pipes/PipesServer;->parsing:Z

    .line 12
    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    iget-wide v3, p0, Lorg/apache/tika/pipes/PipesServer;->serverParseTimeoutMillis:J

    .line 16
    .line 17
    cmp-long v3, v1, v3

    .line 18
    .line 19
    if-lez v3, :cond_0

    .line 20
    .line 21
    sget-object v3, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 22
    .line 23
    const-string v4, "timeout server; elapsed {}  with {}"

    .line 24
    .line 25
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iget-wide v5, p0, Lorg/apache/tika/pipes/PipesServer;->serverParseTimeoutMillis:J

    .line 30
    .line 31
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-interface {v3, v1, v2, v4}, LF2/b;->r(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/16 v1, 0x11

    .line 39
    .line 40
    invoke-direct {p0, v1}, Lorg/apache/tika/pipes/PipesServer;->exit(I)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :catchall_0
    move-exception v1

    .line 45
    goto :goto_2

    .line 46
    :cond_0
    iget-boolean v3, p0, Lorg/apache/tika/pipes/PipesServer;->parsing:Z

    .line 47
    .line 48
    if-nez v3, :cond_1

    .line 49
    .line 50
    iget-wide v3, p0, Lorg/apache/tika/pipes/PipesServer;->serverWaitTimeoutMillis:J

    .line 51
    .line 52
    const-wide/16 v5, 0x0

    .line 53
    .line 54
    cmp-long v5, v3, v5

    .line 55
    .line 56
    if-lez v5, :cond_1

    .line 57
    .line 58
    cmp-long v1, v1, v3

    .line 59
    .line 60
    if-lez v1, :cond_1

    .line 61
    .line 62
    sget-object v1, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 63
    .line 64
    const-string v2, "closing down from inactivity"

    .line 65
    .line 66
    invoke-interface {v1, v2}, LF2/b;->k(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const/4 v1, 0x0

    .line 70
    invoke-direct {p0, v1}, Lorg/apache/tika/pipes/PipesServer;->exit(I)V

    .line 71
    .line 72
    .line 73
    :cond_1
    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    :try_start_2
    iget-wide v0, p0, Lorg/apache/tika/pipes/PipesServer;->checkForTimeoutMs:J

    .line 75
    .line 76
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :goto_2
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 81
    :try_start_4
    throw v1
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_0

    .line 82
    :catch_0
    sget-object v0, Lorg/apache/tika/pipes/PipesServer;->LOG:LF2/b;

    .line 83
    .line 84
    const-string v1, "interrupted"

    .line 85
    .line 86
    invoke-interface {v0, v1}, LF2/b;->u(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.class public Lorg/apache/tika/utils/StreamGobbler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final is:Ljava/io/InputStream;

.field isTruncated:Z

.field lines:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final maxBufferLength:I

.field streamLength:J


# direct methods
.method public constructor <init>(Ljava/io/InputStream;I)V
    .locals 2

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
    iput-object v0, p0, Lorg/apache/tika/utils/StreamGobbler;->lines:Ljava/util/List;

    .line 10
    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    iput-wide v0, p0, Lorg/apache/tika/utils/StreamGobbler;->streamLength:J

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p0, Lorg/apache/tika/utils/StreamGobbler;->isTruncated:Z

    .line 17
    .line 18
    iput-object p1, p0, Lorg/apache/tika/utils/StreamGobbler;->is:Ljava/io/InputStream;

    .line 19
    .line 20
    iput p2, p0, Lorg/apache/tika/utils/StreamGobbler;->maxBufferLength:I

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public getIsTruncated()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/tika/utils/StreamGobbler;->isTruncated:Z

    .line 2
    .line 3
    return v0
.end method

.method public getLines()Ljava/util/List;
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
    iget-object v0, p0, Lorg/apache/tika/utils/StreamGobbler;->lines:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getStreamLength()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lorg/apache/tika/utils/StreamGobbler;->streamLength:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public run()V
    .locals 7

    .line 1
    :try_start_0
    new-instance v0, Ljava/io/BufferedReader;

    .line 2
    .line 3
    new-instance v1, Ljava/io/InputStreamReader;

    .line 4
    .line 5
    iget-object v2, p0, Lorg/apache/tika/utils/StreamGobbler;->is:Ljava/io/InputStream;

    .line 6
    .line 7
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 8
    .line 9
    invoke-direct {v1, v2, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    :try_start_1
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :goto_0
    if-eqz v1, :cond_2

    .line 20
    .line 21
    iget v2, p0, Lorg/apache/tika/utils/StreamGobbler;->maxBufferLength:I

    .line 22
    .line 23
    if-ltz v2, :cond_1

    .line 24
    .line 25
    iget-wide v2, p0, Lorg/apache/tika/utils/StreamGobbler;->streamLength:J

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    int-to-long v4, v4

    .line 32
    add-long/2addr v2, v4

    .line 33
    iget v4, p0, Lorg/apache/tika/utils/StreamGobbler;->maxBufferLength:I

    .line 34
    .line 35
    int-to-long v5, v4

    .line 36
    cmp-long v2, v2, v5

    .line 37
    .line 38
    if-lez v2, :cond_0

    .line 39
    .line 40
    iget-wide v2, p0, Lorg/apache/tika/utils/StreamGobbler;->streamLength:J

    .line 41
    .line 42
    long-to-int v2, v2

    .line 43
    sub-int/2addr v4, v2

    .line 44
    if-lez v4, :cond_1

    .line 45
    .line 46
    const/4 v2, 0x1

    .line 47
    iput-boolean v2, p0, Lorg/apache/tika/utils/StreamGobbler;->isTruncated:Z

    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    const/4 v3, 0x0

    .line 58
    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    iget-object v3, p0, Lorg/apache/tika/utils/StreamGobbler;->lines:Ljava/util/List;

    .line 63
    .line 64
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :catchall_0
    move-exception v1

    .line 69
    goto :goto_2

    .line 70
    :cond_0
    iget-object v2, p0, Lorg/apache/tika/utils/StreamGobbler;->lines:Ljava/util/List;

    .line 71
    .line 72
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    :cond_1
    :goto_1
    iget-wide v2, p0, Lorg/apache/tika/utils/StreamGobbler;->streamLength:J

    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    int-to-long v4, v1

    .line 82
    add-long/2addr v2, v4

    .line 83
    iput-wide v2, p0, Lorg/apache/tika/utils/StreamGobbler;->streamLength:J

    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 89
    goto :goto_0

    .line 90
    :cond_2
    :try_start_2
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :goto_2
    :try_start_3
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 95
    .line 96
    .line 97
    goto :goto_3

    .line 98
    :catchall_1
    move-exception v0

    .line 99
    :try_start_4
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 100
    .line 101
    .line 102
    :goto_3
    throw v1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 103
    :catch_0
    return-void
.end method

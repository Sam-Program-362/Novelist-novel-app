.class Lorg/apache/tika/mime/MagicMatch;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/apache/tika/mime/Clause;


# instance fields
.field private detector:Lorg/apache/tika/detect/MagicDetector;

.field private final mask:Ljava/lang/String;

.field private final mediaType:Lorg/apache/tika/mime/MediaType;

.field private final offset:Ljava/lang/String;

.field private final type:Ljava/lang/String;

.field private final value:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lorg/apache/tika/mime/MediaType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lorg/apache/tika/mime/MagicMatch;->detector:Lorg/apache/tika/detect/MagicDetector;

    .line 6
    .line 7
    iput-object p1, p0, Lorg/apache/tika/mime/MagicMatch;->mediaType:Lorg/apache/tika/mime/MediaType;

    .line 8
    .line 9
    iput-object p2, p0, Lorg/apache/tika/mime/MagicMatch;->type:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p3, p0, Lorg/apache/tika/mime/MagicMatch;->offset:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p4, p0, Lorg/apache/tika/mime/MagicMatch;->value:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p5, p0, Lorg/apache/tika/mime/MagicMatch;->mask:Ljava/lang/String;

    .line 16
    .line 17
    return-void
.end method

.method private declared-synchronized getDetector()Lorg/apache/tika/detect/MagicDetector;
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lorg/apache/tika/mime/MagicMatch;->detector:Lorg/apache/tika/detect/MagicDetector;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lorg/apache/tika/mime/MagicMatch;->mediaType:Lorg/apache/tika/mime/MediaType;

    .line 7
    .line 8
    iget-object v1, p0, Lorg/apache/tika/mime/MagicMatch;->type:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v2, p0, Lorg/apache/tika/mime/MagicMatch;->offset:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v3, p0, Lorg/apache/tika/mime/MagicMatch;->value:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v4, p0, Lorg/apache/tika/mime/MagicMatch;->mask:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {v0, v1, v2, v3, v4}, Lorg/apache/tika/detect/MagicDetector;->parse(Lorg/apache/tika/mime/MediaType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/apache/tika/detect/MagicDetector;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lorg/apache/tika/mime/MagicMatch;->detector:Lorg/apache/tika/detect/MagicDetector;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    :goto_0
    iget-object v0, p0, Lorg/apache/tika/mime/MagicMatch;->detector:Lorg/apache/tika/detect/MagicDetector;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    monitor-exit p0

    .line 28
    return-object v0

    .line 29
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    throw v0
.end method


# virtual methods
.method public eval([B)Z
    .locals 2

    .line 1
    :try_start_0
    invoke-direct {p0}, Lorg/apache/tika/mime/MagicMatch;->getDetector()Lorg/apache/tika/detect/MagicDetector;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, Lw2/h;->o:I

    .line 6
    .line 7
    new-instance v1, Lw2/g;

    .line 8
    .line 9
    invoke-direct {v1}, Lt2/d;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p1}, Lw2/g;->W([B)V

    .line 13
    .line 14
    .line 15
    new-instance p1, Lw2/h;

    .line 16
    .line 17
    invoke-direct {p1, v1}, Lw2/h;-><init>(Lw2/g;)V

    .line 18
    .line 19
    .line 20
    new-instance v1, Lorg/apache/tika/metadata/Metadata;

    .line 21
    .line 22
    invoke-direct {v1}, Lorg/apache/tika/metadata/Metadata;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1, v1}, Lorg/apache/tika/detect/MagicDetector;->detect(Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;)Lorg/apache/tika/mime/MediaType;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    sget-object v0, Lorg/apache/tika/mime/MediaType;->OCTET_STREAM:Lorg/apache/tika/mime/MediaType;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    if-eq p1, v0, :cond_0

    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    return p1

    .line 35
    :catch_0
    :cond_0
    const/4 p1, 0x0

    .line 36
    return p1
.end method

.method public size()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/apache/tika/mime/MagicMatch;->getDetector()Lorg/apache/tika/detect/MagicDetector;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lorg/apache/tika/detect/MagicDetector;->getLength()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p0, Lorg/apache/tika/mime/MagicMatch;->mediaType:Lorg/apache/tika/mime/MediaType;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/apache/tika/mime/MediaType;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lorg/apache/tika/mime/MagicMatch;->type:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, p0, Lorg/apache/tika/mime/MagicMatch;->offset:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v3, p0, Lorg/apache/tika/mime/MagicMatch;->value:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v4, p0, Lorg/apache/tika/mime/MagicMatch;->mask:Ljava/lang/String;

    .line 14
    .line 15
    new-instance v5, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v0, " "

    .line 24
    .line 25
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    return-object v0
.end method

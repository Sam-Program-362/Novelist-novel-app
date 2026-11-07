.class public Lorg/apache/tika/parser/digest/InputStreamDigester;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/apache/tika/parser/DigestingParser$Digester;


# instance fields
.field private final algorithm:Ljava/lang/String;

.field private final algorithmKeyName:Ljava/lang/String;

.field private final encoder:Lorg/apache/tika/parser/DigestingParser$Encoder;

.field private final markLimit:I


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Lorg/apache/tika/parser/DigestingParser$Encoder;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, Lorg/apache/tika/parser/digest/InputStreamDigester;->algorithm:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lorg/apache/tika/parser/digest/InputStreamDigester;->algorithmKeyName:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lorg/apache/tika/parser/digest/InputStreamDigester;->encoder:Lorg/apache/tika/parser/DigestingParser$Encoder;

    .line 6
    iput p1, p0, Lorg/apache/tika/parser/digest/InputStreamDigester;->markLimit:I

    if-ltz p1, :cond_0

    return-void

    .line 7
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "markLimit must be >= 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(ILjava/lang/String;Lorg/apache/tika/parser/DigestingParser$Encoder;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p2, p3}, Lorg/apache/tika/parser/digest/InputStreamDigester;-><init>(ILjava/lang/String;Ljava/lang/String;Lorg/apache/tika/parser/DigestingParser$Encoder;)V

    return-void
.end method

.method private digestFile(Ljava/io/File;JLorg/apache/tika/metadata/Metadata;)V
    .locals 2

    .line 1
    const-string v0, "Content-Length"

    .line 2
    .line 3
    invoke-virtual {p4, v0}, Lorg/apache/tika/metadata/Metadata;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lorg/apache/tika/utils/StringUtils;->isBlank(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const-wide/16 v0, 0x0

    .line 14
    .line 15
    cmp-long v0, p2, v0

    .line 16
    .line 17
    if-gez v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/io/File;->length()J

    .line 20
    .line 21
    .line 22
    move-result-wide p2

    .line 23
    :cond_0
    invoke-static {p2, p3, p4}, Lorg/apache/tika/parser/digest/InputStreamDigester;->setContentLength(JLorg/apache/tika/metadata/Metadata;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    new-instance p2, Ljava/io/FileInputStream;

    .line 27
    .line 28
    invoke-direct {p2, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 29
    .line 30
    .line 31
    :try_start_0
    invoke-direct {p0, p2, p4}, Lorg/apache/tika/parser/digest/InputStreamDigester;->digestStream(Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :catchall_0
    move-exception p1

    .line 39
    :try_start_1
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catchall_1
    move-exception p2

    .line 44
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    throw p1
.end method

.method private digestStream(Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;)Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/apache/tika/parser/digest/InputStreamDigester;->newMessageDigest()Ljava/security/MessageDigest;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1, p2}, Lorg/apache/tika/parser/digest/InputStreamDigester;->updateDigest(Ljava/security/MessageDigest;Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;)Ljava/security/MessageDigest;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    instance-of v1, p1, Lorg/apache/tika/io/BoundedInputStream;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    check-cast p1, Lorg/apache/tika/io/BoundedInputStream;

    .line 17
    .line 18
    invoke-virtual {p1}, Lorg/apache/tika/io/BoundedInputStream;->hasHitBound()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    return p1

    .line 26
    :cond_0
    invoke-direct {p0}, Lorg/apache/tika/parser/digest/InputStreamDigester;->getMetadataKey()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object v1, p0, Lorg/apache/tika/parser/digest/InputStreamDigester;->encoder:Lorg/apache/tika/parser/DigestingParser$Encoder;

    .line 31
    .line 32
    invoke-interface {v1, v0}, Lorg/apache/tika/parser/DigestingParser$Encoder;->encode([B)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {p2, p1, v0}, Lorg/apache/tika/metadata/Metadata;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    return p1
.end method

.method private getMetadataKey()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/tika/parser/digest/InputStreamDigester;->algorithmKeyName:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "X-TIKA:digest:"

    .line 4
    .line 5
    invoke-static {v1, v0}, Lt/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method private newMessageDigest()Ljava/security/MessageDigest;
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lorg/apache/tika/parser/digest/InputStreamDigester;->getProvider()Ljava/security/Provider;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lorg/apache/tika/parser/digest/InputStreamDigester;->algorithm:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :catch_0
    move-exception v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v1, p0, Lorg/apache/tika/parser/digest/InputStreamDigester;->algorithm:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v1, v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/MessageDigest;

    .line 19
    .line 20
    .line 21
    move-result-object v0
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    return-object v0

    .line 23
    :goto_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    throw v1
.end method

.method private static setContentLength(JLorg/apache/tika/metadata/Metadata;)V
    .locals 2

    .line 1
    const-string v0, "Content-Length"

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Lorg/apache/tika/metadata/Metadata;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v1}, Lorg/apache/tika/utils/StringUtils;->isBlank(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-static {p0, p1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p2, v0, p0}, Lorg/apache/tika/metadata/Metadata;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method private static updateDigest(Ljava/security/MessageDigest;Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;)Ljava/security/MessageDigest;
    .locals 8

    .line 1
    const/16 v0, 0x400

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-virtual {p1, v1, v2, v0}, Ljava/io/InputStream;->read([BII)I

    .line 7
    .line 8
    .line 9
    move-result v3

    .line 10
    const-wide/16 v4, 0x0

    .line 11
    .line 12
    :goto_0
    const/4 v6, -0x1

    .line 13
    if-le v3, v6, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, v1, v2, v3}, Ljava/security/MessageDigest;->update([BII)V

    .line 16
    .line 17
    .line 18
    int-to-long v6, v3

    .line 19
    add-long/2addr v4, v6

    .line 20
    invoke-virtual {p1, v1, v2, v0}, Ljava/io/InputStream;->read([BII)I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-static {v4, v5, p2}, Lorg/apache/tika/parser/digest/InputStreamDigester;->setContentLength(JLorg/apache/tika/metadata/Metadata;)V

    .line 26
    .line 27
    .line 28
    return-object p0
.end method


# virtual methods
.method public digest(Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)V
    .locals 6

    .line 1
    invoke-static {p1}, Lorg/apache/tika/io/TikaInputStream;->cast(Ljava/io/InputStream;)Lorg/apache/tika/io/TikaInputStream;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    const-wide/16 v0, -0x1

    .line 6
    .line 7
    if-eqz p3, :cond_1

    .line 8
    .line 9
    invoke-virtual {p3}, Lorg/apache/tika/io/TikaInputStream;->hasFile()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {p3}, Lorg/apache/tika/io/TikaInputStream;->hasFile()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {p3}, Lorg/apache/tika/io/TikaInputStream;->getLength()J

    .line 22
    .line 23
    .line 24
    move-result-wide v2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-wide v2, v0

    .line 27
    :goto_0
    iget v4, p0, Lorg/apache/tika/parser/digest/InputStreamDigester;->markLimit:I

    .line 28
    .line 29
    int-to-long v4, v4

    .line 30
    cmp-long v4, v2, v4

    .line 31
    .line 32
    if-lez v4, :cond_1

    .line 33
    .line 34
    invoke-virtual {p3}, Lorg/apache/tika/io/TikaInputStream;->getFile()Ljava/io/File;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-direct {p0, p1, v2, v3, p2}, Lorg/apache/tika/parser/digest/InputStreamDigester;->digestFile(Ljava/io/File;JLorg/apache/tika/metadata/Metadata;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    new-instance v2, Lorg/apache/tika/io/BoundedInputStream;

    .line 43
    .line 44
    iget v3, p0, Lorg/apache/tika/parser/digest/InputStreamDigester;->markLimit:I

    .line 45
    .line 46
    int-to-long v3, v3

    .line 47
    invoke-direct {v2, v3, v4, p1}, Lorg/apache/tika/io/BoundedInputStream;-><init>(JLjava/io/InputStream;)V

    .line 48
    .line 49
    .line 50
    iget v3, p0, Lorg/apache/tika/parser/digest/InputStreamDigester;->markLimit:I

    .line 51
    .line 52
    add-int/lit8 v3, v3, 0x1

    .line 53
    .line 54
    invoke-virtual {v2, v3}, Lorg/apache/tika/io/BoundedInputStream;->mark(I)V

    .line 55
    .line 56
    .line 57
    invoke-direct {p0, v2, p2}, Lorg/apache/tika/parser/digest/InputStreamDigester;->digestStream(Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;)Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    invoke-virtual {v2}, Lorg/apache/tika/io/BoundedInputStream;->reset()V

    .line 62
    .line 63
    .line 64
    if-eqz v3, :cond_2

    .line 65
    .line 66
    return-void

    .line 67
    :cond_2
    if-eqz p3, :cond_3

    .line 68
    .line 69
    invoke-virtual {p3}, Lorg/apache/tika/io/TikaInputStream;->getFile()Ljava/io/File;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-direct {p0, p1, v0, v1, p2}, Lorg/apache/tika/parser/digest/InputStreamDigester;->digestFile(Ljava/io/File;JLorg/apache/tika/metadata/Metadata;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_3
    new-instance p3, Lorg/apache/tika/io/TemporaryResources;

    .line 78
    .line 79
    invoke-direct {p3}, Lorg/apache/tika/io/TemporaryResources;-><init>()V

    .line 80
    .line 81
    .line 82
    :try_start_0
    invoke-static {p1, p3, p2}, Lorg/apache/tika/io/TikaInputStream;->get(Ljava/io/InputStream;Lorg/apache/tika/io/TemporaryResources;Lorg/apache/tika/metadata/Metadata;)Lorg/apache/tika/io/TikaInputStream;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {p1}, Lorg/apache/tika/io/TikaInputStream;->getFile()Ljava/io/File;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-direct {p0, p1, v0, v1, p2}, Lorg/apache/tika/parser/digest/InputStreamDigester;->digestFile(Ljava/io/File;JLorg/apache/tika/metadata/Metadata;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    .line 92
    .line 93
    :try_start_1
    invoke-virtual {p3}, Lorg/apache/tika/io/TemporaryResources;->dispose()V
    :try_end_1
    .catch Lorg/apache/tika/exception/TikaException; {:try_start_1 .. :try_end_1} :catch_0

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :catch_0
    move-exception p1

    .line 98
    new-instance p2, Ljava/io/IOException;

    .line 99
    .line 100
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    throw p2

    .line 104
    :catchall_0
    move-exception p1

    .line 105
    :try_start_2
    invoke-virtual {p3}, Lorg/apache/tika/io/TemporaryResources;->dispose()V
    :try_end_2
    .catch Lorg/apache/tika/exception/TikaException; {:try_start_2 .. :try_end_2} :catch_1

    .line 106
    .line 107
    .line 108
    throw p1

    .line 109
    :catch_1
    move-exception p1

    .line 110
    new-instance p2, Ljava/io/IOException;

    .line 111
    .line 112
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 113
    .line 114
    .line 115
    throw p2
.end method

.method public getProvider()Ljava/security/Provider;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

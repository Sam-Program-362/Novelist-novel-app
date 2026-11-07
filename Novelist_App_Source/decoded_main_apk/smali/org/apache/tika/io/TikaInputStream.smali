.class public Lorg/apache/tika/io/TikaInputStream;
.super Lw2/d;
.source "SourceFile"


# static fields
.field private static final BLOB_SIZE_THRESHOLD:I = 0x100000

.field private static final MAX_CONSECUTIVE_EOFS:I = 0x3e8


# instance fields
.field private consecutiveEOFs:I

.field private length:J

.field private mark:J

.field private openContainer:Ljava/lang/Object;

.field private path:Ljava/nio/file/Path;

.field private position:J

.field private skipBuffer:[B

.field private streamFactory:Lorg/apache/tika/io/InputStreamFactory;

.field private suffix:Ljava/lang/String;

.field private final tmp:Lorg/apache/tika/io/TemporaryResources;


# direct methods
.method private constructor <init>(Ljava/io/File;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 19
    new-instance v0, Ljava/io/BufferedInputStream;

    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-direct {p0, v0}, Lw2/d;-><init>(Ljava/io/InputStream;)V

    const-wide/16 v0, 0x0

    .line 20
    iput-wide v0, p0, Lorg/apache/tika/io/TikaInputStream;->position:J

    const-wide/16 v0, -0x1

    .line 21
    iput-wide v0, p0, Lorg/apache/tika/io/TikaInputStream;->mark:J

    const/4 v0, 0x0

    .line 22
    iput v0, p0, Lorg/apache/tika/io/TikaInputStream;->consecutiveEOFs:I

    const/4 v0, 0x0

    .line 23
    iput-object v0, p0, Lorg/apache/tika/io/TikaInputStream;->suffix:Ljava/lang/String;

    .line 24
    invoke-static {p1}, Lio/flutter/plugin/editing/i;->j(Ljava/io/File;)Ljava/nio/file/Path;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/tika/io/TikaInputStream;->path:Ljava/nio/file/Path;

    .line 25
    new-instance v0, Lorg/apache/tika/io/TemporaryResources;

    invoke-direct {v0}, Lorg/apache/tika/io/TemporaryResources;-><init>()V

    iput-object v0, p0, Lorg/apache/tika/io/TikaInputStream;->tmp:Lorg/apache/tika/io/TemporaryResources;

    .line 26
    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v0

    iput-wide v0, p0, Lorg/apache/tika/io/TikaInputStream;->length:J

    .line 27
    iget-object p1, p0, Lorg/apache/tika/io/TikaInputStream;->path:Ljava/nio/file/Path;

    invoke-static {p1}, Lorg/apache/tika/fork/a;->j(Ljava/nio/file/Path;)Ljava/nio/file/Path;

    move-result-object p1

    invoke-static {p1}, Lio/flutter/plugin/editing/i;->i(Ljava/nio/file/Path;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lorg/apache/tika/io/FilenameUtils;->getSuffixFromPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/apache/tika/io/TikaInputStream;->suffix:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Ljava/io/InputStream;Lorg/apache/tika/io/TemporaryResources;JLjava/lang/String;)V
    .locals 2

    .line 28
    invoke-direct {p0, p1}, Lw2/d;-><init>(Ljava/io/InputStream;)V

    const-wide/16 v0, 0x0

    .line 29
    iput-wide v0, p0, Lorg/apache/tika/io/TikaInputStream;->position:J

    const-wide/16 v0, -0x1

    .line 30
    iput-wide v0, p0, Lorg/apache/tika/io/TikaInputStream;->mark:J

    const/4 p1, 0x0

    .line 31
    iput p1, p0, Lorg/apache/tika/io/TikaInputStream;->consecutiveEOFs:I

    const/4 p1, 0x0

    .line 32
    iput-object p1, p0, Lorg/apache/tika/io/TikaInputStream;->path:Ljava/nio/file/Path;

    .line 33
    iput-object p2, p0, Lorg/apache/tika/io/TikaInputStream;->tmp:Lorg/apache/tika/io/TemporaryResources;

    .line 34
    iput-wide p3, p0, Lorg/apache/tika/io/TikaInputStream;->length:J

    .line 35
    iput-object p5, p0, Lorg/apache/tika/io/TikaInputStream;->suffix:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Ljava/nio/file/Path;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/io/BufferedInputStream;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/nio/file/OpenOption;

    invoke-static {p1, v2}, Lio/flutter/plugin/editing/i;->f(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/InputStream;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-direct {p0, v0}, Lw2/d;-><init>(Ljava/io/InputStream;)V

    const-wide/16 v2, 0x0

    .line 2
    iput-wide v2, p0, Lorg/apache/tika/io/TikaInputStream;->position:J

    const-wide/16 v2, -0x1

    .line 3
    iput-wide v2, p0, Lorg/apache/tika/io/TikaInputStream;->mark:J

    .line 4
    iput v1, p0, Lorg/apache/tika/io/TikaInputStream;->consecutiveEOFs:I

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lorg/apache/tika/io/TikaInputStream;->suffix:Ljava/lang/String;

    .line 6
    iput-object p1, p0, Lorg/apache/tika/io/TikaInputStream;->path:Ljava/nio/file/Path;

    .line 7
    new-instance v0, Lorg/apache/tika/io/TemporaryResources;

    invoke-direct {v0}, Lorg/apache/tika/io/TemporaryResources;-><init>()V

    iput-object v0, p0, Lorg/apache/tika/io/TikaInputStream;->tmp:Lorg/apache/tika/io/TemporaryResources;

    .line 8
    invoke-static {p1}, Lorg/apache/tika/fork/a;->a(Ljava/nio/file/Path;)J

    move-result-wide v0

    iput-wide v0, p0, Lorg/apache/tika/io/TikaInputStream;->length:J

    .line 9
    invoke-static {p1}, Lorg/apache/tika/fork/a;->j(Ljava/nio/file/Path;)Ljava/nio/file/Path;

    move-result-object p1

    invoke-static {p1}, Lio/flutter/plugin/editing/i;->i(Ljava/nio/file/Path;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lorg/apache/tika/io/FilenameUtils;->getSuffixFromPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/apache/tika/io/TikaInputStream;->suffix:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Ljava/nio/file/Path;Lorg/apache/tika/io/TemporaryResources;J)V
    .locals 4

    .line 10
    new-instance v0, Ljava/io/BufferedInputStream;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/nio/file/OpenOption;

    invoke-static {p1, v2}, Lio/flutter/plugin/editing/i;->f(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/InputStream;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-direct {p0, v0}, Lw2/d;-><init>(Ljava/io/InputStream;)V

    const-wide/16 v2, 0x0

    .line 11
    iput-wide v2, p0, Lorg/apache/tika/io/TikaInputStream;->position:J

    const-wide/16 v2, -0x1

    .line 12
    iput-wide v2, p0, Lorg/apache/tika/io/TikaInputStream;->mark:J

    .line 13
    iput v1, p0, Lorg/apache/tika/io/TikaInputStream;->consecutiveEOFs:I

    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Lorg/apache/tika/io/TikaInputStream;->suffix:Ljava/lang/String;

    .line 15
    iput-object p1, p0, Lorg/apache/tika/io/TikaInputStream;->path:Ljava/nio/file/Path;

    .line 16
    iput-object p2, p0, Lorg/apache/tika/io/TikaInputStream;->tmp:Lorg/apache/tika/io/TemporaryResources;

    .line 17
    iput-wide p3, p0, Lorg/apache/tika/io/TikaInputStream;->length:J

    .line 18
    invoke-static {p1}, Lorg/apache/tika/fork/a;->j(Ljava/nio/file/Path;)Ljava/nio/file/Path;

    move-result-object p1

    invoke-static {p1}, Lio/flutter/plugin/editing/i;->i(Ljava/nio/file/Path;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lorg/apache/tika/io/FilenameUtils;->getSuffixFromPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/apache/tika/io/TikaInputStream;->suffix:Ljava/lang/String;

    return-void
.end method

.method public static cast(Ljava/io/InputStream;)Lorg/apache/tika/io/TikaInputStream;
    .locals 1

    .line 1
    instance-of v0, p0, Lorg/apache/tika/io/TikaInputStream;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lorg/apache/tika/io/TikaInputStream;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return-object p0
.end method

.method public static get(Ljava/io/File;)Lorg/apache/tika/io/TikaInputStream;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 22
    new-instance v0, Lorg/apache/tika/metadata/Metadata;

    invoke-direct {v0}, Lorg/apache/tika/metadata/Metadata;-><init>()V

    invoke-static {p0, v0}, Lorg/apache/tika/io/TikaInputStream;->get(Ljava/io/File;Lorg/apache/tika/metadata/Metadata;)Lorg/apache/tika/io/TikaInputStream;

    move-result-object p0

    return-object p0
.end method

.method public static get(Ljava/io/File;Lorg/apache/tika/metadata/Metadata;)Lorg/apache/tika/io/TikaInputStream;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 23
    const-string v0, "resourceName"

    invoke-virtual {p1, v0}, Lorg/apache/tika/metadata/Metadata;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/apache/tika/utils/StringUtils;->isBlank(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 24
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lorg/apache/tika/metadata/Metadata;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->length()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Content-Length"

    invoke-virtual {p1, v1, v0}, Lorg/apache/tika/metadata/Metadata;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    new-instance p1, Lorg/apache/tika/io/TikaInputStream;

    invoke-direct {p1, p0}, Lorg/apache/tika/io/TikaInputStream;-><init>(Ljava/io/File;)V

    return-object p1
.end method

.method public static get(Ljava/io/InputStream;)Lorg/apache/tika/io/TikaInputStream;
    .locals 2

    .line 7
    new-instance v0, Lorg/apache/tika/io/TemporaryResources;

    invoke-direct {v0}, Lorg/apache/tika/io/TemporaryResources;-><init>()V

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lorg/apache/tika/io/TikaInputStream;->get(Ljava/io/InputStream;Lorg/apache/tika/io/TemporaryResources;Lorg/apache/tika/metadata/Metadata;)Lorg/apache/tika/io/TikaInputStream;

    move-result-object p0

    return-object p0
.end method

.method public static get(Ljava/io/InputStream;Lorg/apache/tika/io/TemporaryResources;Lorg/apache/tika/metadata/Metadata;)Lorg/apache/tika/io/TikaInputStream;
    .locals 7

    if-eqz p0, :cond_2

    .line 1
    instance-of v0, p0, Lorg/apache/tika/io/TikaInputStream;

    if-eqz v0, :cond_0

    .line 2
    check-cast p0, Lorg/apache/tika/io/TikaInputStream;

    return-object p0

    .line 3
    :cond_0
    invoke-virtual {p0}, Ljava/io/InputStream;->markSupported()Z

    move-result v0

    if-nez v0, :cond_1

    .line 4
    new-instance v0, Ljava/io/BufferedInputStream;

    invoke-direct {v0, p0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    move-object v2, v0

    goto :goto_0

    :cond_1
    move-object v2, p0

    .line 5
    :goto_0
    new-instance v1, Lorg/apache/tika/io/TikaInputStream;

    const-wide/16 v4, -0x1

    invoke-static {p2}, Lorg/apache/tika/io/TikaInputStream;->getExtension(Lorg/apache/tika/metadata/Metadata;)Ljava/lang/String;

    move-result-object v6

    move-object v3, p1

    invoke-direct/range {v1 .. v6}, Lorg/apache/tika/io/TikaInputStream;-><init>(Ljava/io/InputStream;Lorg/apache/tika/io/TemporaryResources;JLjava/lang/String;)V

    return-object v1

    .line 6
    :cond_2
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "The Stream must not be null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static get(Ljava/net/URI;)Lorg/apache/tika/io/TikaInputStream;
    .locals 1

    .line 36
    new-instance v0, Lorg/apache/tika/metadata/Metadata;

    invoke-direct {v0}, Lorg/apache/tika/metadata/Metadata;-><init>()V

    invoke-static {p0, v0}, Lorg/apache/tika/io/TikaInputStream;->get(Ljava/net/URI;Lorg/apache/tika/metadata/Metadata;)Lorg/apache/tika/io/TikaInputStream;

    move-result-object p0

    return-object p0
.end method

.method public static get(Ljava/net/URI;Lorg/apache/tika/metadata/Metadata;)Lorg/apache/tika/io/TikaInputStream;
    .locals 2

    .line 37
    const-string v0, "file"

    invoke-virtual {p0}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 38
    invoke-static {p0}, Lorg/apache/tika/fork/a;->i(Ljava/net/URI;)Ljava/nio/file/Path;

    move-result-object v0

    const/4 v1, 0x0

    .line 39
    new-array v1, v1, [Ljava/nio/file/LinkOption;

    invoke-static {v0, v1}, Lio/flutter/plugin/editing/i;->C(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 40
    invoke-static {v0, p1}, Lorg/apache/tika/io/TikaInputStream;->get(Ljava/nio/file/Path;Lorg/apache/tika/metadata/Metadata;)Lorg/apache/tika/io/TikaInputStream;

    move-result-object p0

    return-object p0

    .line 41
    :cond_0
    invoke-virtual {p0}, Ljava/net/URI;->toURL()Ljava/net/URL;

    move-result-object p0

    invoke-static {p0, p1}, Lorg/apache/tika/io/TikaInputStream;->get(Ljava/net/URL;Lorg/apache/tika/metadata/Metadata;)Lorg/apache/tika/io/TikaInputStream;

    move-result-object p0

    return-object p0
.end method

.method public static get(Ljava/net/URL;)Lorg/apache/tika/io/TikaInputStream;
    .locals 1

    .line 42
    new-instance v0, Lorg/apache/tika/metadata/Metadata;

    invoke-direct {v0}, Lorg/apache/tika/metadata/Metadata;-><init>()V

    invoke-static {p0, v0}, Lorg/apache/tika/io/TikaInputStream;->get(Ljava/net/URL;Lorg/apache/tika/metadata/Metadata;)Lorg/apache/tika/io/TikaInputStream;

    move-result-object p0

    return-object p0
.end method

.method public static get(Ljava/net/URL;Lorg/apache/tika/metadata/Metadata;)Lorg/apache/tika/io/TikaInputStream;
    .locals 9

    .line 43
    const-string v0, "file"

    invoke-virtual {p0}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 44
    :try_start_0
    invoke-virtual {p0}, Ljava/net/URL;->toURI()Ljava/net/URI;

    move-result-object v0

    invoke-static {v0}, Lorg/apache/tika/fork/a;->i(Ljava/net/URI;)Ljava/nio/file/Path;

    move-result-object v0

    const/4 v1, 0x0

    .line 45
    new-array v1, v1, [Ljava/nio/file/LinkOption;

    invoke-static {v0, v1}, Lio/flutter/plugin/editing/i;->C(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 46
    invoke-static {v0, p1}, Lorg/apache/tika/io/TikaInputStream;->get(Ljava/nio/file/Path;Lorg/apache/tika/metadata/Metadata;)Lorg/apache/tika/io/TikaInputStream;

    move-result-object p0
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 47
    :catch_0
    :cond_0
    invoke-virtual {p0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    .line 48
    invoke-virtual {p0}, Ljava/net/URL;->getPath()Ljava/lang/String;

    move-result-object p0

    const/16 v1, 0x2f

    .line 49
    invoke-virtual {p0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    .line 50
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 51
    const-string v2, "resourceName"

    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, v2, p0}, Lorg/apache/tika/metadata/Metadata;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    :cond_1
    invoke-virtual {v0}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_2

    .line 53
    const-string v1, "Content-Type"

    invoke-virtual {p1, v1, p0}, Lorg/apache/tika/metadata/Metadata;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    :cond_2
    invoke-virtual {v0}, Ljava/net/URLConnection;->getContentEncoding()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_3

    .line 55
    const-string v1, "Content-Encoding"

    invoke-virtual {p1, v1, p0}, Lorg/apache/tika/metadata/Metadata;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    :cond_3
    invoke-virtual {v0}, Ljava/net/URLConnection;->getContentLength()I

    move-result p0

    if-ltz p0, :cond_4

    .line 57
    const-string v1, "Content-Length"

    invoke-static {p0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lorg/apache/tika/metadata/Metadata;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    :cond_4
    new-instance v3, Lorg/apache/tika/io/TikaInputStream;

    new-instance v4, Ljava/io/BufferedInputStream;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    new-instance v5, Lorg/apache/tika/io/TemporaryResources;

    invoke-direct {v5}, Lorg/apache/tika/io/TemporaryResources;-><init>()V

    int-to-long v6, p0

    .line 59
    invoke-static {p1}, Lorg/apache/tika/io/TikaInputStream;->getExtension(Lorg/apache/tika/metadata/Metadata;)Ljava/lang/String;

    move-result-object v8

    invoke-direct/range {v3 .. v8}, Lorg/apache/tika/io/TikaInputStream;-><init>(Ljava/io/InputStream;Lorg/apache/tika/io/TemporaryResources;JLjava/lang/String;)V

    return-object v3
.end method

.method public static get(Ljava/nio/file/Path;)Lorg/apache/tika/io/TikaInputStream;
    .locals 1

    .line 12
    new-instance v0, Lorg/apache/tika/metadata/Metadata;

    invoke-direct {v0}, Lorg/apache/tika/metadata/Metadata;-><init>()V

    invoke-static {p0, v0}, Lorg/apache/tika/io/TikaInputStream;->get(Ljava/nio/file/Path;Lorg/apache/tika/metadata/Metadata;)Lorg/apache/tika/io/TikaInputStream;

    move-result-object p0

    return-object p0
.end method

.method public static get(Ljava/nio/file/Path;Lorg/apache/tika/metadata/Metadata;)Lorg/apache/tika/io/TikaInputStream;
    .locals 2

    .line 13
    const-string v0, "resourceName"

    invoke-virtual {p1, v0}, Lorg/apache/tika/metadata/Metadata;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/apache/tika/utils/StringUtils;->isBlank(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 14
    invoke-static {p0}, Lorg/apache/tika/fork/a;->j(Ljava/nio/file/Path;)Ljava/nio/file/Path;

    move-result-object v1

    invoke-static {v1}, Lio/flutter/plugin/editing/i;->i(Ljava/nio/file/Path;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lorg/apache/tika/metadata/Metadata;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    :cond_0
    invoke-static {p0}, Lorg/apache/tika/fork/a;->a(Ljava/nio/file/Path;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Content-Length"

    invoke-virtual {p1, v1, v0}, Lorg/apache/tika/metadata/Metadata;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    new-instance p1, Lorg/apache/tika/io/TikaInputStream;

    invoke-direct {p1, p0}, Lorg/apache/tika/io/TikaInputStream;-><init>(Ljava/nio/file/Path;)V

    return-object p1
.end method

.method public static get(Ljava/nio/file/Path;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/io/TemporaryResources;)Lorg/apache/tika/io/TikaInputStream;
    .locals 4

    .line 17
    invoke-static {p0}, Lorg/apache/tika/fork/a;->a(Ljava/nio/file/Path;)J

    move-result-wide v0

    .line 18
    const-string v2, "resourceName"

    invoke-virtual {p1, v2}, Lorg/apache/tika/metadata/Metadata;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lorg/apache/tika/utils/StringUtils;->isBlank(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 19
    invoke-static {p0}, Lorg/apache/tika/fork/a;->j(Ljava/nio/file/Path;)Ljava/nio/file/Path;

    move-result-object v3

    invoke-static {v3}, Lio/flutter/plugin/editing/i;->i(Ljava/nio/file/Path;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v2, v3}, Lorg/apache/tika/metadata/Metadata;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    :cond_0
    const-string v2, "Content-Length"

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v2, v3}, Lorg/apache/tika/metadata/Metadata;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    new-instance p1, Lorg/apache/tika/io/TikaInputStream;

    invoke-direct {p1, p0, p2, v0, v1}, Lorg/apache/tika/io/TikaInputStream;-><init>(Ljava/nio/file/Path;Lorg/apache/tika/io/TemporaryResources;J)V

    return-object p1
.end method

.method public static get(Ljava/sql/Blob;)Lorg/apache/tika/io/TikaInputStream;
    .locals 1

    .line 30
    new-instance v0, Lorg/apache/tika/metadata/Metadata;

    invoke-direct {v0}, Lorg/apache/tika/metadata/Metadata;-><init>()V

    invoke-static {p0, v0}, Lorg/apache/tika/io/TikaInputStream;->get(Ljava/sql/Blob;Lorg/apache/tika/metadata/Metadata;)Lorg/apache/tika/io/TikaInputStream;

    move-result-object p0

    return-object p0
.end method

.method public static get(Ljava/sql/Blob;Lorg/apache/tika/metadata/Metadata;)Lorg/apache/tika/io/TikaInputStream;
    .locals 8

    .line 31
    :try_start_0
    invoke-interface {p0}, Ljava/sql/Blob;->length()J

    move-result-wide v0
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_1

    .line 32
    :try_start_1
    const-string v2, "Content-Length"

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v2, v3}, Lorg/apache/tika/metadata/Metadata;->set(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/sql/SQLException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :goto_0
    move-wide v5, v0

    goto :goto_1

    :catch_1
    const-wide/16 v0, -0x1

    goto :goto_0

    :goto_1
    const-wide/16 v0, 0x0

    cmp-long v0, v0, v5

    if-gtz v0, :cond_0

    const-wide/32 v0, 0x100000

    cmp-long v0, v5, v0

    if-gtz v0, :cond_0

    const-wide/16 v0, 0x1

    long-to-int v2, v5

    .line 33
    invoke-interface {p0, v0, v1, v2}, Ljava/sql/Blob;->getBytes(JI)[B

    move-result-object p0

    invoke-static {p0, p1}, Lorg/apache/tika/io/TikaInputStream;->get([BLorg/apache/tika/metadata/Metadata;)Lorg/apache/tika/io/TikaInputStream;

    move-result-object p0

    return-object p0

    .line 34
    :cond_0
    new-instance v2, Lorg/apache/tika/io/TikaInputStream;

    new-instance v3, Ljava/io/BufferedInputStream;

    invoke-interface {p0}, Ljava/sql/Blob;->getBinaryStream()Ljava/io/InputStream;

    move-result-object p0

    invoke-direct {v3, p0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    new-instance v4, Lorg/apache/tika/io/TemporaryResources;

    invoke-direct {v4}, Lorg/apache/tika/io/TemporaryResources;-><init>()V

    .line 35
    invoke-static {p1}, Lorg/apache/tika/io/TikaInputStream;->getExtension(Lorg/apache/tika/metadata/Metadata;)Ljava/lang/String;

    move-result-object v7

    invoke-direct/range {v2 .. v7}, Lorg/apache/tika/io/TikaInputStream;-><init>(Ljava/io/InputStream;Lorg/apache/tika/io/TemporaryResources;JLjava/lang/String;)V

    return-object v2
.end method

.method public static get(Lorg/apache/tika/io/InputStreamFactory;)Lorg/apache/tika/io/TikaInputStream;
    .locals 1

    .line 27
    new-instance v0, Lorg/apache/tika/io/TemporaryResources;

    invoke-direct {v0}, Lorg/apache/tika/io/TemporaryResources;-><init>()V

    invoke-static {p0, v0}, Lorg/apache/tika/io/TikaInputStream;->get(Lorg/apache/tika/io/InputStreamFactory;Lorg/apache/tika/io/TemporaryResources;)Lorg/apache/tika/io/TikaInputStream;

    move-result-object p0

    return-object p0
.end method

.method public static get(Lorg/apache/tika/io/InputStreamFactory;Lorg/apache/tika/io/TemporaryResources;)Lorg/apache/tika/io/TikaInputStream;
    .locals 2

    .line 28
    invoke-interface {p0}, Lorg/apache/tika/io/InputStreamFactory;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lorg/apache/tika/io/TikaInputStream;->get(Ljava/io/InputStream;Lorg/apache/tika/io/TemporaryResources;Lorg/apache/tika/metadata/Metadata;)Lorg/apache/tika/io/TikaInputStream;

    move-result-object p1

    .line 29
    iput-object p0, p1, Lorg/apache/tika/io/TikaInputStream;->streamFactory:Lorg/apache/tika/io/InputStreamFactory;

    return-object p1
.end method

.method public static get([B)Lorg/apache/tika/io/TikaInputStream;
    .locals 1

    .line 8
    new-instance v0, Lorg/apache/tika/metadata/Metadata;

    invoke-direct {v0}, Lorg/apache/tika/metadata/Metadata;-><init>()V

    invoke-static {p0, v0}, Lorg/apache/tika/io/TikaInputStream;->get([BLorg/apache/tika/metadata/Metadata;)Lorg/apache/tika/io/TikaInputStream;

    move-result-object p0

    return-object p0
.end method

.method public static get([BLorg/apache/tika/metadata/Metadata;)Lorg/apache/tika/io/TikaInputStream;
    .locals 8

    .line 9
    array-length v0, p0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Content-Length"

    invoke-virtual {p1, v1, v0}, Lorg/apache/tika/metadata/Metadata;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    new-instance v2, Lorg/apache/tika/io/TikaInputStream;

    new-instance v3, Lw2/h;

    invoke-direct {v3, p0}, Lw2/h;-><init>([B)V

    new-instance v4, Lorg/apache/tika/io/TemporaryResources;

    invoke-direct {v4}, Lorg/apache/tika/io/TemporaryResources;-><init>()V

    array-length p0, p0

    int-to-long v5, p0

    .line 11
    invoke-static {p1}, Lorg/apache/tika/io/TikaInputStream;->getExtension(Lorg/apache/tika/metadata/Metadata;)Ljava/lang/String;

    move-result-object v7

    invoke-direct/range {v2 .. v7}, Lorg/apache/tika/io/TikaInputStream;-><init>(Ljava/io/InputStream;Lorg/apache/tika/io/TemporaryResources;JLjava/lang/String;)V

    return-object v2
.end method

.method private static getExtension(Lorg/apache/tika/metadata/Metadata;)Ljava/lang/String;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string v0, "resourceName"

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lorg/apache/tika/metadata/Metadata;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p0}, Lorg/apache/tika/io/FilenameUtils;->getSuffixFromPath(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static isTikaInputStream(Ljava/io/InputStream;)Z
    .locals 0

    .line 1
    instance-of p0, p0, Lorg/apache/tika/io/TikaInputStream;

    .line 2
    .line 3
    return p0
.end method


# virtual methods
.method public addCloseableResource(Ljava/io/Closeable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/io/TikaInputStream;->tmp:Lorg/apache/tika/io/TemporaryResources;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lorg/apache/tika/io/TemporaryResources;->addResource(Ljava/io/Closeable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public afterRead(I)V
    .locals 4

    .line 1
    const/4 v0, -0x1

    .line 2
    if-eq p1, v0, :cond_0

    .line 3
    .line 4
    iget-wide v0, p0, Lorg/apache/tika/io/TikaInputStream;->position:J

    .line 5
    .line 6
    int-to-long v2, p1

    .line 7
    add-long/2addr v0, v2

    .line 8
    iput-wide v0, p0, Lorg/apache/tika/io/TikaInputStream;->position:J

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget p1, p0, Lorg/apache/tika/io/TikaInputStream;->consecutiveEOFs:I

    .line 12
    .line 13
    add-int/lit8 p1, p1, 0x1

    .line 14
    .line 15
    iput p1, p0, Lorg/apache/tika/io/TikaInputStream;->consecutiveEOFs:I

    .line 16
    .line 17
    const/16 v0, 0x3e8

    .line 18
    .line 19
    if-gt p1, v0, :cond_1

    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    new-instance p1, Ljava/io/IOException;

    .line 23
    .line 24
    const-string v0, "Read too many -1 (EOFs); there could be an infinite loop.If you think your file is not corrupt, please open an issue on Tika\'s JIRA"

    .line 25
    .line 26
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1
.end method

.method public close()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lorg/apache/tika/io/TikaInputStream;->path:Ljava/nio/file/Path;

    .line 3
    .line 4
    const-wide/16 v0, -0x1

    .line 5
    .line 6
    iput-wide v0, p0, Lorg/apache/tika/io/TikaInputStream;->mark:J

    .line 7
    .line 8
    iget-object v0, p0, Lorg/apache/tika/io/TikaInputStream;->tmp:Lorg/apache/tika/io/TemporaryResources;

    .line 9
    .line 10
    iget-object v1, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lorg/apache/tika/io/TemporaryResources;->addResource(Ljava/io/Closeable;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lorg/apache/tika/io/TikaInputStream;->tmp:Lorg/apache/tika/io/TemporaryResources;

    .line 16
    .line 17
    invoke-virtual {v0}, Lorg/apache/tika/io/TemporaryResources;->close()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public getFile()Ljava/io/File;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/apache/tika/io/TikaInputStream;->getPath()Ljava/nio/file/Path;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lio/flutter/plugin/editing/i;->e(Ljava/nio/file/Path;)Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getFileChannel()Ljava/nio/channels/FileChannel;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lorg/apache/tika/io/TikaInputStream;->getPath()Ljava/nio/file/Path;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    new-array v1, v1, [Ljava/nio/file/OpenOption;

    .line 7
    .line 8
    invoke-static {v0, v1}, Lorg/apache/tika/fork/a;->e(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/nio/channels/FileChannel;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Lorg/apache/tika/io/TikaInputStream;->tmp:Lorg/apache/tika/io/TemporaryResources;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Lorg/apache/tika/io/TemporaryResources;->addResource(Ljava/io/Closeable;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public getInputStreamFactory()Lorg/apache/tika/io/InputStreamFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/io/TikaInputStream;->streamFactory:Lorg/apache/tika/io/InputStreamFactory;

    .line 2
    .line 3
    return-object v0
.end method

.method public getLength()J
    .locals 4

    .line 1
    iget-wide v0, p0, Lorg/apache/tika/io/TikaInputStream;->length:J

    .line 2
    .line 3
    const-wide/16 v2, -0x1

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lorg/apache/tika/io/TikaInputStream;->getPath()Ljava/nio/file/Path;

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-wide v0, p0, Lorg/apache/tika/io/TikaInputStream;->length:J

    .line 13
    .line 14
    return-wide v0
.end method

.method public getOpenContainer()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/io/TikaInputStream;->openContainer:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPath()Ljava/nio/file/Path;
    .locals 1

    const/4 v0, -0x1

    .line 1
    invoke-virtual {p0, v0}, Lorg/apache/tika/io/TikaInputStream;->getPath(I)Ljava/nio/file/Path;

    move-result-object v0

    return-object v0
.end method

.method public getPath(I)Ljava/nio/file/Path;
    .locals 8

    .line 2
    iget-object v0, p0, Lorg/apache/tika/io/TikaInputStream;->path:Ljava/nio/file/Path;

    if-eqz v0, :cond_0

    return-object v0

    .line 3
    :cond_0
    iget-wide v0, p0, Lorg/apache/tika/io/TikaInputStream;->position:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_3

    .line 4
    iget-object v0, p0, Lorg/apache/tika/io/TikaInputStream;->tmp:Lorg/apache/tika/io/TemporaryResources;

    iget-object v1, p0, Lorg/apache/tika/io/TikaInputStream;->suffix:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lorg/apache/tika/io/TemporaryResources;->createTempFile(Ljava/lang/String;)Ljava/nio/file/Path;

    move-result-object v0

    const/4 v1, -0x1

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-le p1, v1, :cond_2

    .line 5
    new-instance v1, Lorg/apache/tika/io/BoundedInputStream;

    int-to-long v6, p1

    invoke-direct {v1, v6, v7, p0}, Lorg/apache/tika/io/BoundedInputStream;-><init>(JLjava/io/InputStream;)V

    .line 6
    :try_start_0
    invoke-virtual {v1, p1}, Lorg/apache/tika/io/BoundedInputStream;->mark(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    :try_start_1
    new-array p1, v4, [Ljava/nio/file/CopyOption;

    invoke-static {}, Lio/flutter/plugin/editing/i;->n()Ljava/nio/file/StandardCopyOption;

    move-result-object v4

    aput-object v4, p1, v5

    invoke-static {v1, v0, p1}, Lio/flutter/plugin/editing/i;->z(Lorg/apache/tika/io/BoundedInputStream;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)V

    .line 8
    invoke-virtual {v1}, Lorg/apache/tika/io/BoundedInputStream;->hasHitBound()Z

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz p1, :cond_1

    .line 9
    :try_start_2
    invoke-virtual {v1}, Lorg/apache/tika/io/BoundedInputStream;->reset()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 10
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    const/4 p1, 0x0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    .line 11
    :cond_1
    :try_start_3
    invoke-virtual {v1}, Lorg/apache/tika/io/BoundedInputStream;->reset()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 12
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    goto :goto_2

    :catchall_1
    move-exception p1

    .line 13
    :try_start_4
    invoke-virtual {v1}, Lorg/apache/tika/io/BoundedInputStream;->reset()V

    .line 14
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 15
    :goto_0
    :try_start_5
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1

    .line 16
    :cond_2
    new-array p1, v4, [Ljava/nio/file/CopyOption;

    invoke-static {}, Lio/flutter/plugin/editing/i;->n()Ljava/nio/file/StandardCopyOption;

    move-result-object v1

    aput-object v1, p1, v5

    invoke-static {p0, v0, p1}, Lorg/apache/tika/fork/a;->v(Lorg/apache/tika/io/TikaInputStream;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)V

    .line 17
    :goto_2
    iput-object v0, p0, Lorg/apache/tika/io/TikaInputStream;->path:Ljava/nio/file/Path;

    .line 18
    new-array p1, v5, [Ljava/nio/file/OpenOption;

    invoke-static {v0, p1}, Lio/flutter/plugin/editing/i;->f(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/InputStream;

    move-result-object p1

    .line 19
    iget-object v0, p0, Lorg/apache/tika/io/TikaInputStream;->tmp:Lorg/apache/tika/io/TemporaryResources;

    invoke-virtual {v0, p1}, Lorg/apache/tika/io/TemporaryResources;->addResource(Ljava/io/Closeable;)V

    .line 20
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    .line 21
    new-instance v1, Lorg/apache/tika/io/TikaInputStream$1;

    invoke-direct {v1, p0, p1, v0}, Lorg/apache/tika/io/TikaInputStream$1;-><init>(Lorg/apache/tika/io/TikaInputStream;Ljava/io/InputStream;Ljava/io/InputStream;)V

    iput-object v1, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    .line 22
    iget-object p1, p0, Lorg/apache/tika/io/TikaInputStream;->path:Ljava/nio/file/Path;

    invoke-static {p1}, Lorg/apache/tika/fork/a;->a(Ljava/nio/file/Path;)J

    move-result-wide v0

    iput-wide v0, p0, Lorg/apache/tika/io/TikaInputStream;->length:J

    .line 23
    iput-wide v2, p0, Lorg/apache/tika/io/TikaInputStream;->position:J

    const-wide/16 v0, -0x1

    .line 24
    iput-wide v0, p0, Lorg/apache/tika/io/TikaInputStream;->mark:J

    .line 25
    iget-object p1, p0, Lorg/apache/tika/io/TikaInputStream;->path:Ljava/nio/file/Path;

    return-object p1

    .line 26
    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Stream is already being read"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getPosition()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lorg/apache/tika/io/TikaInputStream;->position:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public hasFile()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/io/TikaInputStream;->path:Ljava/nio/file/Path;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public hasInputStreamFactory()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/io/TikaInputStream;->streamFactory:Lorg/apache/tika/io/InputStreamFactory;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public hasLength()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lorg/apache/tika/io/TikaInputStream;->length:J

    .line 2
    .line 3
    const-wide/16 v2, -0x1

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public mark(I)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lw2/c;->mark(I)V

    .line 2
    .line 3
    .line 4
    iget-wide v0, p0, Lorg/apache/tika/io/TikaInputStream;->position:J

    .line 5
    .line 6
    iput-wide v0, p0, Lorg/apache/tika/io/TikaInputStream;->mark:J

    .line 7
    .line 8
    return-void
.end method

.method public markSupported()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public peek([B)I
    .locals 3

    .line 1
    array-length v0, p1

    .line 2
    invoke-virtual {p0, v0}, Lorg/apache/tika/io/TikaInputStream;->mark(I)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lw2/c;->read([B)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    const/4 v2, -0x1

    .line 11
    if-eq v0, v2, :cond_1

    .line 12
    .line 13
    add-int/2addr v1, v0

    .line 14
    array-length v0, p1

    .line 15
    if-ge v1, v0, :cond_0

    .line 16
    .line 17
    array-length v0, p1

    .line 18
    sub-int/2addr v0, v1

    .line 19
    invoke-virtual {p0, p1, v1, v0}, Lw2/c;->read([BII)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v0, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    invoke-virtual {p0}, Lorg/apache/tika/io/TikaInputStream;->reset()V

    .line 27
    .line 28
    .line 29
    return v1
.end method

.method public reset()V
    .locals 2

    .line 1
    invoke-super {p0}, Lw2/c;->reset()V

    .line 2
    .line 3
    .line 4
    iget-wide v0, p0, Lorg/apache/tika/io/TikaInputStream;->mark:J

    .line 5
    .line 6
    iput-wide v0, p0, Lorg/apache/tika/io/TikaInputStream;->position:J

    .line 7
    .line 8
    const-wide/16 v0, -0x1

    .line 9
    .line 10
    iput-wide v0, p0, Lorg/apache/tika/io/TikaInputStream;->mark:J

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput v0, p0, Lorg/apache/tika/io/TikaInputStream;->consecutiveEOFs:I

    .line 14
    .line 15
    return-void
.end method

.method public setOpenContainer(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lorg/apache/tika/io/TikaInputStream;->openContainer:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, p1, Ljava/io/Closeable;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lorg/apache/tika/io/TikaInputStream;->tmp:Lorg/apache/tika/io/TemporaryResources;

    .line 8
    .line 9
    check-cast p1, Ljava/io/Closeable;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lorg/apache/tika/io/TemporaryResources;->addResource(Ljava/io/Closeable;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public skip(J)J
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/tika/io/TikaInputStream;->skipBuffer:[B

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x1000

    .line 6
    .line 7
    new-array v0, v0, [B

    .line 8
    .line 9
    iput-object v0, p0, Lorg/apache/tika/io/TikaInputStream;->skipBuffer:[B

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    .line 12
    .line 13
    iget-object v1, p0, Lorg/apache/tika/io/TikaInputStream;->skipBuffer:[B

    .line 14
    .line 15
    invoke-static {v0, p1, p2, v1}, Lorg/apache/tika/io/IOUtils;->skip(Ljava/io/InputStream;J[B)J

    .line 16
    .line 17
    .line 18
    move-result-wide p1

    .line 19
    iget-wide v0, p0, Lorg/apache/tika/io/TikaInputStream;->position:J

    .line 20
    .line 21
    add-long/2addr v0, p1

    .line 22
    iput-wide v0, p0, Lorg/apache/tika/io/TikaInputStream;->position:J

    .line 23
    .line 24
    return-wide p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lorg/apache/tika/io/TikaInputStream;->hasFile()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "TikaInputStream of "

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lorg/apache/tika/io/TikaInputStream;->path:Ljava/nio/file/Path;

    .line 10
    .line 11
    invoke-static {v0}, Lio/flutter/plugin/editing/i;->i(Ljava/nio/file/Path;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v1, v0}, Lt/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v1, v0}, Lt/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :goto_0
    iget-object v1, p0, Lorg/apache/tika/io/TikaInputStream;->openContainer:Ljava/lang/Object;

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    new-instance v2, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v0, " (in "

    .line 47
    .line 48
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v0, ")"

    .line 55
    .line 56
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    :cond_1
    return-object v0
.end method

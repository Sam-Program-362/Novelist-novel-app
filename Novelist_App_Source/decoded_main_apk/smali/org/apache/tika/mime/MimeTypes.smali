.class public final Lorg/apache/tika/mime/MimeTypes;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/apache/tika/detect/Detector;
.implements Ljava/io/Serializable;


# static fields
.field private static final CLASSLOADER_SPECIFIC_DEFAULT_TYPES:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/ClassLoader;",
            "Lorg/apache/tika/mime/MimeTypes;",
            ">;"
        }
    .end annotation
.end field

.field private static DEFAULT_TYPES:Lorg/apache/tika/mime/MimeTypes; = null

.field public static final OCTET_STREAM:Ljava/lang/String; = "application/octet-stream"

.field public static final PLAIN_TEXT:Ljava/lang/String; = "text/plain"

.field public static final XML:Ljava/lang/String; = "application/xml"

.field private static final serialVersionUID:J = -0x12bf3ae564bb2fecL


# instance fields
.field private final htmlMimeType:Lorg/apache/tika/mime/MimeType;

.field private final magics:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/apache/tika/mime/Magic;",
            ">;"
        }
    .end annotation
.end field

.field private final patterns:Lorg/apache/tika/mime/Patterns;

.field private final registry:Lorg/apache/tika/mime/MediaTypeRegistry;

.field private final rootMimeType:Lorg/apache/tika/mime/MimeType;

.field private final rootMimeTypeL:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/apache/tika/mime/MimeType;",
            ">;"
        }
    .end annotation
.end field

.field private final textMimeType:Lorg/apache/tika/mime/MimeType;

.field private final types:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lorg/apache/tika/mime/MediaType;",
            "Lorg/apache/tika/mime/MimeType;",
            ">;"
        }
    .end annotation
.end field

.field private final xmlMimeType:Lorg/apache/tika/mime/MimeType;

.field private final xmls:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/apache/tika/mime/MimeType;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lorg/apache/tika/mime/MimeTypes;->CLASSLOADER_SPECIFIC_DEFAULT_TYPES:Ljava/util/Map;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    sput-object v0, Lorg/apache/tika/mime/MimeTypes;->DEFAULT_TYPES:Lorg/apache/tika/mime/MimeTypes;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/apache/tika/mime/MediaTypeRegistry;

    .line 5
    .line 6
    invoke-direct {v0}, Lorg/apache/tika/mime/MediaTypeRegistry;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lorg/apache/tika/mime/MimeTypes;->registry:Lorg/apache/tika/mime/MediaTypeRegistry;

    .line 10
    .line 11
    new-instance v1, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lorg/apache/tika/mime/MimeTypes;->types:Ljava/util/Map;

    .line 17
    .line 18
    new-instance v1, Lorg/apache/tika/mime/Patterns;

    .line 19
    .line 20
    invoke-direct {v1, v0}, Lorg/apache/tika/mime/Patterns;-><init>(Lorg/apache/tika/mime/MediaTypeRegistry;)V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Lorg/apache/tika/mime/MimeTypes;->patterns:Lorg/apache/tika/mime/Patterns;

    .line 24
    .line 25
    new-instance v0, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lorg/apache/tika/mime/MimeTypes;->magics:Ljava/util/List;

    .line 31
    .line 32
    new-instance v0, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lorg/apache/tika/mime/MimeTypes;->xmls:Ljava/util/List;

    .line 38
    .line 39
    new-instance v0, Lorg/apache/tika/mime/MimeType;

    .line 40
    .line 41
    sget-object v1, Lorg/apache/tika/mime/MediaType;->OCTET_STREAM:Lorg/apache/tika/mime/MediaType;

    .line 42
    .line 43
    invoke-direct {v0, v1}, Lorg/apache/tika/mime/MimeType;-><init>(Lorg/apache/tika/mime/MediaType;)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lorg/apache/tika/mime/MimeTypes;->rootMimeType:Lorg/apache/tika/mime/MimeType;

    .line 47
    .line 48
    new-instance v1, Lorg/apache/tika/mime/MimeType;

    .line 49
    .line 50
    sget-object v2, Lorg/apache/tika/mime/MediaType;->TEXT_PLAIN:Lorg/apache/tika/mime/MediaType;

    .line 51
    .line 52
    invoke-direct {v1, v2}, Lorg/apache/tika/mime/MimeType;-><init>(Lorg/apache/tika/mime/MediaType;)V

    .line 53
    .line 54
    .line 55
    iput-object v1, p0, Lorg/apache/tika/mime/MimeTypes;->textMimeType:Lorg/apache/tika/mime/MimeType;

    .line 56
    .line 57
    new-instance v2, Lorg/apache/tika/mime/MimeType;

    .line 58
    .line 59
    sget-object v3, Lorg/apache/tika/mime/MediaType;->TEXT_HTML:Lorg/apache/tika/mime/MediaType;

    .line 60
    .line 61
    invoke-direct {v2, v3}, Lorg/apache/tika/mime/MimeType;-><init>(Lorg/apache/tika/mime/MediaType;)V

    .line 62
    .line 63
    .line 64
    iput-object v2, p0, Lorg/apache/tika/mime/MimeTypes;->htmlMimeType:Lorg/apache/tika/mime/MimeType;

    .line 65
    .line 66
    new-instance v2, Lorg/apache/tika/mime/MimeType;

    .line 67
    .line 68
    sget-object v3, Lorg/apache/tika/mime/MediaType;->APPLICATION_XML:Lorg/apache/tika/mime/MediaType;

    .line 69
    .line 70
    invoke-direct {v2, v3}, Lorg/apache/tika/mime/MimeType;-><init>(Lorg/apache/tika/mime/MediaType;)V

    .line 71
    .line 72
    .line 73
    iput-object v2, p0, Lorg/apache/tika/mime/MimeTypes;->xmlMimeType:Lorg/apache/tika/mime/MimeType;

    .line 74
    .line 75
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    iput-object v3, p0, Lorg/apache/tika/mime/MimeTypes;->rootMimeTypeL:Ljava/util/List;

    .line 80
    .line 81
    invoke-virtual {p0, v0}, Lorg/apache/tika/mime/MimeTypes;->add(Lorg/apache/tika/mime/MimeType;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, v1}, Lorg/apache/tika/mime/MimeTypes;->add(Lorg/apache/tika/mime/MimeType;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, v2}, Lorg/apache/tika/mime/MimeTypes;->add(Lorg/apache/tika/mime/MimeType;)V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method private applyHint(Ljava/util/List;Lorg/apache/tika/mime/MimeType;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lorg/apache/tika/mime/MimeType;",
            ">;",
            "Lorg/apache/tika/mime/MimeType;",
            ")",
            "Ljava/util/List<",
            "Lorg/apache/tika/mime/MimeType;",
            ">;"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_4

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_3

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lorg/apache/tika/mime/MimeType;

    .line 25
    .line 26
    invoke-virtual {p2, v1}, Lorg/apache/tika/mime/MimeType;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_2

    .line 31
    .line 32
    iget-object v2, p0, Lorg/apache/tika/mime/MimeTypes;->registry:Lorg/apache/tika/mime/MediaTypeRegistry;

    .line 33
    .line 34
    invoke-virtual {p2}, Lorg/apache/tika/mime/MimeType;->getType()Lorg/apache/tika/mime/MediaType;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v1}, Lorg/apache/tika/mime/MimeType;->getType()Lorg/apache/tika/mime/MediaType;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v2, v3, v1}, Lorg/apache/tika/mime/MediaTypeRegistry;->isSpecializationOf(Lorg/apache/tika/mime/MediaType;Lorg/apache/tika/mime/MediaType;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    :cond_2
    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    :cond_3
    return-object p1

    .line 53
    :cond_4
    :goto_0
    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1
.end method

.method public static declared-synchronized getDefaultMimeTypes()Lorg/apache/tika/mime/MimeTypes;
    .locals 2

    const-class v0, Lorg/apache/tika/mime/MimeTypes;

    monitor-enter v0

    const/4 v1, 0x0

    .line 1
    :try_start_0
    invoke-static {v1}, Lorg/apache/tika/mime/MimeTypes;->getDefaultMimeTypes(Ljava/lang/ClassLoader;)Lorg/apache/tika/mime/MimeTypes;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static declared-synchronized getDefaultMimeTypes(Ljava/lang/ClassLoader;)Lorg/apache/tika/mime/MimeTypes;
    .locals 3

    const-class v0, Lorg/apache/tika/mime/MimeTypes;

    monitor-enter v0

    .line 2
    :try_start_0
    sget-object v1, Lorg/apache/tika/mime/MimeTypes;->DEFAULT_TYPES:Lorg/apache/tika/mime/MimeTypes;

    if-eqz p0, :cond_0

    .line 3
    sget-object v1, Lorg/apache/tika/mime/MimeTypes;->CLASSLOADER_SPECIFIC_DEFAULT_TYPES:Ljava/util/Map;

    invoke-interface {v1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/tika/mime/MimeTypes;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_4

    :cond_0
    :goto_0
    if-nez v1, :cond_2

    .line 4
    :try_start_1
    const-string v1, "tika-mimetypes.xml"

    const-string v2, "custom-mimetypes.xml"

    .line 5
    invoke-static {v1, v2, p0}, Lorg/apache/tika/mime/MimeTypesFactory;->create(Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)Lorg/apache/tika/mime/MimeTypes;

    move-result-object v1
    :try_end_1
    .catch Lorg/apache/tika/mime/MimeTypeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez p0, :cond_1

    .line 6
    :try_start_2
    sput-object v1, Lorg/apache/tika/mime/MimeTypes;->DEFAULT_TYPES:Lorg/apache/tika/mime/MimeTypes;

    goto :goto_3

    .line 7
    :cond_1
    sget-object v2, Lorg/apache/tika/mime/MimeTypes;->CLASSLOADER_SPECIFIC_DEFAULT_TYPES:Ljava/util/Map;

    invoke-interface {v2, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :catch_0
    move-exception p0

    goto :goto_1

    :catch_1
    move-exception p0

    goto :goto_2

    .line 8
    :goto_1
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Unable to read the default media type registry"

    invoke-direct {v1, v2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 9
    :goto_2
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Unable to parse the default media type registry"

    invoke-direct {v1, v2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 10
    :cond_2
    :goto_3
    monitor-exit v0

    return-object v1

    :goto_4
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p0
.end method


# virtual methods
.method public add(Lorg/apache/tika/mime/MimeType;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/tika/mime/MimeTypes;->registry:Lorg/apache/tika/mime/MediaTypeRegistry;

    .line 2
    .line 3
    invoke-virtual {p1}, Lorg/apache/tika/mime/MimeType;->getType()Lorg/apache/tika/mime/MediaType;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Lorg/apache/tika/mime/MediaTypeRegistry;->addType(Lorg/apache/tika/mime/MediaType;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lorg/apache/tika/mime/MimeTypes;->types:Ljava/util/Map;

    .line 11
    .line 12
    invoke-virtual {p1}, Lorg/apache/tika/mime/MimeType;->getType()Lorg/apache/tika/mime/MediaType;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lorg/apache/tika/mime/MimeType;->hasMagic()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, Lorg/apache/tika/mime/MimeTypes;->magics:Ljava/util/List;

    .line 26
    .line 27
    invoke-virtual {p1}, Lorg/apache/tika/mime/MimeType;->getMagics()Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual {p1}, Lorg/apache/tika/mime/MimeType;->hasRootXML()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    iget-object v0, p0, Lorg/apache/tika/mime/MimeTypes;->xmls:Ljava/util/List;

    .line 41
    .line 42
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    :cond_1
    return-void
.end method

.method public declared-synchronized addAlias(Lorg/apache/tika/mime/MimeType;Lorg/apache/tika/mime/MediaType;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lorg/apache/tika/mime/MimeTypes;->registry:Lorg/apache/tika/mime/MediaTypeRegistry;

    .line 3
    .line 4
    invoke-virtual {p1}, Lorg/apache/tika/mime/MimeType;->getType()Lorg/apache/tika/mime/MediaType;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {v0, p1, p2}, Lorg/apache/tika/mime/MediaTypeRegistry;->addAlias(Lorg/apache/tika/mime/MediaType;Lorg/apache/tika/mime/MediaType;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    throw p1
.end method

.method public addPattern(Lorg/apache/tika/mime/MimeType;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, v0}, Lorg/apache/tika/mime/MimeTypes;->addPattern(Lorg/apache/tika/mime/MimeType;Ljava/lang/String;Z)V

    return-void
.end method

.method public addPattern(Lorg/apache/tika/mime/MimeType;Ljava/lang/String;Z)V
    .locals 1

    .line 2
    iget-object v0, p0, Lorg/apache/tika/mime/MimeTypes;->patterns:Lorg/apache/tika/mime/Patterns;

    invoke-virtual {v0, p2, p3, p1}, Lorg/apache/tika/mime/Patterns;->add(Ljava/lang/String;ZLorg/apache/tika/mime/MimeType;)V

    return-void
.end method

.method public detect(Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;)Lorg/apache/tika/mime/MediaType;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p0}, Lorg/apache/tika/mime/MimeTypes;->getMinLength()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    invoke-virtual {p1, v1}, Ljava/io/InputStream;->mark(I)V

    .line 9
    .line 10
    .line 11
    :try_start_0
    invoke-virtual {p0, p1}, Lorg/apache/tika/mime/MimeTypes;->readMagicHeader(Ljava/io/InputStream;)[B

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p0, v1}, Lorg/apache/tika/mime/MimeTypes;->getMimeType([B)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p2

    .line 24
    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    .line 25
    .line 26
    .line 27
    throw p2

    .line 28
    :cond_0
    move-object v1, v0

    .line 29
    :goto_0
    const-string p1, "resourceName"

    .line 30
    .line 31
    invoke-virtual {p2, p1}, Lorg/apache/tika/metadata/Metadata;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const/4 v2, 0x0

    .line 36
    if-eqz p1, :cond_4

    .line 37
    .line 38
    :try_start_1
    new-instance v3, Ljava/net/URI;

    .line 39
    .line 40
    invoke-direct {v3, p1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    const/4 v5, 0x1

    .line 48
    if-eqz v4, :cond_1

    .line 49
    .line 50
    const-string v6, "http"

    .line 51
    .line 52
    invoke-virtual {v4, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result v4
    :try_end_1
    .catch Ljava/net/URISyntaxException; {:try_start_1 .. :try_end_1} :catch_0

    .line 56
    if-eqz v4, :cond_1

    .line 57
    .line 58
    move v4, v5

    .line 59
    goto :goto_1

    .line 60
    :catch_0
    move v4, v2

    .line 61
    goto :goto_2

    .line 62
    :cond_1
    move v4, v2

    .line 63
    :goto_1
    :try_start_2
    invoke-virtual {v3}, Ljava/net/URI;->getPath()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    if-eqz v3, :cond_2

    .line 68
    .line 69
    const/16 v6, 0x2f

    .line 70
    .line 71
    invoke-virtual {v3, v6}, Ljava/lang/String;->lastIndexOf(I)I

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    add-int/2addr v6, v5

    .line 76
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    if-ge v6, v5, :cond_2

    .line 81
    .line 82
    invoke-virtual {v3, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0
    :try_end_2
    .catch Ljava/net/URISyntaxException; {:try_start_2 .. :try_end_2} :catch_1

    .line 86
    :cond_2
    move-object p1, v0

    .line 87
    :catch_1
    :goto_2
    if-eqz p1, :cond_4

    .line 88
    .line 89
    invoke-virtual {p0, p1}, Lorg/apache/tika/mime/MimeTypes;->getMimeType(Ljava/lang/String;)Lorg/apache/tika/mime/MimeType;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    if-eqz v4, :cond_3

    .line 94
    .line 95
    invoke-virtual {p1}, Lorg/apache/tika/mime/MimeType;->isInterpreted()Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-nez v0, :cond_4

    .line 100
    .line 101
    :cond_3
    invoke-direct {p0, v1, p1}, Lorg/apache/tika/mime/MimeTypes;->applyHint(Ljava/util/List;Lorg/apache/tika/mime/MimeType;)Ljava/util/List;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    :cond_4
    const-string p1, "Content-Type"

    .line 106
    .line 107
    invoke-virtual {p2, p1}, Lorg/apache/tika/metadata/Metadata;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    if-eqz p1, :cond_5

    .line 112
    .line 113
    :try_start_3
    invoke-virtual {p0, p1}, Lorg/apache/tika/mime/MimeTypes;->forName(Ljava/lang/String;)Lorg/apache/tika/mime/MimeType;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-direct {p0, v1, p1}, Lorg/apache/tika/mime/MimeTypes;->applyHint(Ljava/util/List;Lorg/apache/tika/mime/MimeType;)Ljava/util/List;

    .line 118
    .line 119
    .line 120
    move-result-object v1
    :try_end_3
    .catch Lorg/apache/tika/mime/MimeTypeException; {:try_start_3 .. :try_end_3} :catch_2

    .line 121
    :catch_2
    :cond_5
    if-eqz v1, :cond_7

    .line 122
    .line 123
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    if-eqz p1, :cond_6

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_6
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    check-cast p1, Lorg/apache/tika/mime/MimeType;

    .line 135
    .line 136
    invoke-virtual {p1}, Lorg/apache/tika/mime/MimeType;->getType()Lorg/apache/tika/mime/MediaType;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    return-object p1

    .line 141
    :cond_7
    :goto_3
    sget-object p1, Lorg/apache/tika/mime/MediaType;->OCTET_STREAM:Lorg/apache/tika/mime/MediaType;

    .line 142
    .line 143
    return-object p1
.end method

.method public forName(Ljava/lang/String;)Lorg/apache/tika/mime/MimeType;
    .locals 2

    .line 1
    invoke-static {p1}, Lorg/apache/tika/mime/MediaType;->parse(Ljava/lang/String;)Lorg/apache/tika/mime/MediaType;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget-object p1, p0, Lorg/apache/tika/mime/MimeTypes;->registry:Lorg/apache/tika/mime/MediaTypeRegistry;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Lorg/apache/tika/mime/MediaTypeRegistry;->normalize(Lorg/apache/tika/mime/MediaType;)Lorg/apache/tika/mime/MediaType;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v1, p0, Lorg/apache/tika/mime/MimeTypes;->types:Ljava/util/Map;

    .line 14
    .line 15
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lorg/apache/tika/mime/MimeType;

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    monitor-enter p0

    .line 24
    :try_start_0
    iget-object v1, p0, Lorg/apache/tika/mime/MimeTypes;->types:Ljava/util/Map;

    .line 25
    .line 26
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Lorg/apache/tika/mime/MimeType;

    .line 31
    .line 32
    if-nez p1, :cond_0

    .line 33
    .line 34
    new-instance p1, Lorg/apache/tika/mime/MimeType;

    .line 35
    .line 36
    invoke-direct {p1, v0}, Lorg/apache/tika/mime/MimeType;-><init>(Lorg/apache/tika/mime/MediaType;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p1}, Lorg/apache/tika/mime/MimeTypes;->add(Lorg/apache/tika/mime/MimeType;)V

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Lorg/apache/tika/mime/MimeTypes;->types:Ljava/util/Map;

    .line 43
    .line 44
    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    :goto_0
    monitor-exit p0

    .line 51
    return-object p1

    .line 52
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    throw p1

    .line 54
    :cond_1
    return-object v1

    .line 55
    :cond_2
    new-instance v0, Lorg/apache/tika/mime/MimeTypeException;

    .line 56
    .line 57
    const-string v1, "Invalid media type name: "

    .line 58
    .line 59
    invoke-static {v1, p1}, Lt/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-direct {v0, p1}, Lorg/apache/tika/mime/MimeTypeException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw v0
.end method

.method public getMediaTypeRegistry()Lorg/apache/tika/mime/MediaTypeRegistry;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/mime/MimeTypes;->registry:Lorg/apache/tika/mime/MediaTypeRegistry;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMimeType([B)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Ljava/util/List<",
            "Lorg/apache/tika/mime/MimeType;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_d

    .line 5
    array-length v0, p1

    if-nez v0, :cond_0

    .line 6
    iget-object p1, p0, Lorg/apache/tika/mime/MimeTypes;->rootMimeTypeL:Ljava/util/List;

    return-object p1

    .line 7
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    iget-object v1, p0, Lorg/apache/tika/mime/MimeTypes;->magics:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, -0x1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/apache/tika/mime/Magic;

    if-lez v2, :cond_2

    .line 9
    invoke-virtual {v3}, Lorg/apache/tika/mime/Magic;->getPriority()I

    move-result v4

    if-le v2, v4, :cond_2

    goto :goto_1

    .line 10
    :cond_2
    invoke-virtual {v3, p1}, Lorg/apache/tika/mime/Magic;->eval([B)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 11
    invoke-virtual {v3}, Lorg/apache/tika/mime/Magic;->getType()Lorg/apache/tika/mime/MimeType;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 12
    invoke-virtual {v3}, Lorg/apache/tika/mime/Magic;->getPriority()I

    move-result v2

    goto :goto_0

    .line 13
    :cond_3
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_c

    const/4 v1, 0x0

    .line 14
    :goto_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_b

    .line 15
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/tika/mime/MimeType;

    .line 16
    invoke-virtual {v2}, Lorg/apache/tika/mime/MimeType;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "application/xml"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    const-string v3, "text/html"

    .line 17
    invoke-virtual {v2}, Lorg/apache/tika/mime/MimeType;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    .line 18
    :cond_4
    new-instance v3, Lorg/apache/tika/detect/XmlRootExtractor;

    invoke-direct {v3}, Lorg/apache/tika/detect/XmlRootExtractor;-><init>()V

    .line 19
    invoke-virtual {v3, p1}, Lorg/apache/tika/detect/XmlRootExtractor;->extractRootElement([B)Ljavax/xml/namespace/QName;

    move-result-object v3

    if-eqz v3, :cond_6

    .line 20
    iget-object v2, p0, Lorg/apache/tika/mime/MimeTypes;->xmls:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/apache/tika/mime/MimeType;

    .line 21
    invoke-virtual {v3}, Ljavax/xml/namespace/QName;->getNamespaceURI()Ljava/lang/String;

    move-result-object v5

    .line 22
    invoke-virtual {v3}, Ljavax/xml/namespace/QName;->getLocalPart()Ljava/lang/String;

    move-result-object v6

    .line 23
    invoke-virtual {v4, v5, v6}, Lorg/apache/tika/mime/MimeType;->matchesXML(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 24
    invoke-virtual {v0, v1, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    .line 25
    :cond_6
    invoke-virtual {v2}, Lorg/apache/tika/mime/MimeType;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    .line 26
    iget-object v2, p0, Lorg/apache/tika/mime/MimeTypes;->magics:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_7
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/apache/tika/mime/Magic;

    .line 27
    invoke-virtual {v3}, Lorg/apache/tika/mime/Magic;->getType()Lorg/apache/tika/mime/MimeType;

    move-result-object v4

    iget-object v5, p0, Lorg/apache/tika/mime/MimeTypes;->htmlMimeType:Lorg/apache/tika/mime/MimeType;

    invoke-virtual {v4, v5}, Lorg/apache/tika/mime/MimeType;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    goto :goto_3

    .line 28
    :cond_8
    invoke-virtual {v3, p1}, Lorg/apache/tika/mime/Magic;->eval([B)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 29
    iget-object v2, p0, Lorg/apache/tika/mime/MimeTypes;->htmlMimeType:Lorg/apache/tika/mime/MimeType;

    invoke-virtual {v0, v1, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    .line 30
    :cond_9
    iget-object v2, p0, Lorg/apache/tika/mime/MimeTypes;->textMimeType:Lorg/apache/tika/mime/MimeType;

    invoke-virtual {v0, v1, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_a
    :goto_4
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_2

    :cond_b
    return-object v0

    .line 31
    :cond_c
    :try_start_0
    new-instance v0, Lorg/apache/tika/detect/TextDetector;

    invoke-virtual {p0}, Lorg/apache/tika/mime/MimeTypes;->getMinLength()I

    move-result v1

    invoke-direct {v0, v1}, Lorg/apache/tika/detect/TextDetector;-><init>(I)V

    .line 32
    sget v1, Lw2/h;->o:I

    .line 33
    new-instance v1, Lw2/g;

    .line 34
    invoke-direct {v1}, Lt2/d;-><init>()V

    .line 35
    invoke-virtual {v1, p1}, Lw2/g;->W([B)V

    .line 36
    new-instance p1, Lw2/h;

    invoke-direct {p1, v1}, Lw2/h;-><init>(Lw2/g;)V

    .line 37
    new-instance v1, Lorg/apache/tika/metadata/Metadata;

    invoke-direct {v1}, Lorg/apache/tika/metadata/Metadata;-><init>()V

    invoke-virtual {v0, p1, v1}, Lorg/apache/tika/detect/TextDetector;->detect(Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;)Lorg/apache/tika/mime/MediaType;

    move-result-object p1

    invoke-virtual {p1}, Lorg/apache/tika/mime/MediaType;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/apache/tika/mime/MimeTypes;->forName(Ljava/lang/String;)Lorg/apache/tika/mime/MimeType;

    move-result-object p1

    .line 38
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 39
    :catch_0
    iget-object p1, p0, Lorg/apache/tika/mime/MimeTypes;->rootMimeTypeL:Ljava/util/List;

    return-object p1

    .line 40
    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Data is missing"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getMimeType(Ljava/io/File;)Lorg/apache/tika/mime/MimeType;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 4
    new-instance v0, Lorg/apache/tika/Tika;

    invoke-direct {v0, p0}, Lorg/apache/tika/Tika;-><init>(Lorg/apache/tika/detect/Detector;)V

    invoke-virtual {v0, p1}, Lorg/apache/tika/Tika;->detect(Ljava/io/File;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/apache/tika/mime/MimeTypes;->forName(Ljava/lang/String;)Lorg/apache/tika/mime/MimeType;

    move-result-object p1

    return-object p1
.end method

.method public getMimeType(Ljava/lang/String;)Lorg/apache/tika/mime/MimeType;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/apache/tika/mime/MimeTypes;->patterns:Lorg/apache/tika/mime/Patterns;

    invoke-virtual {v0, p1}, Lorg/apache/tika/mime/Patterns;->matches(Ljava/lang/String;)Lorg/apache/tika/mime/MimeType;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    iget-object v0, p0, Lorg/apache/tika/mime/MimeTypes;->patterns:Lorg/apache/tika/mime/Patterns;

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p1, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lorg/apache/tika/mime/Patterns;->matches(Ljava/lang/String;)Lorg/apache/tika/mime/MimeType;

    move-result-object p1

    if-eqz p1, :cond_1

    return-object p1

    .line 3
    :cond_1
    iget-object p1, p0, Lorg/apache/tika/mime/MimeTypes;->rootMimeType:Lorg/apache/tika/mime/MimeType;

    return-object p1
.end method

.method public getMinLength()I
    .locals 1

    const/high16 v0, 0x10000

    return v0
.end method

.method public getRegisteredMimeType(Ljava/lang/String;)Lorg/apache/tika/mime/MimeType;
    .locals 2

    .line 1
    invoke-static {p1}, Lorg/apache/tika/mime/MediaType;->parse(Ljava/lang/String;)Lorg/apache/tika/mime/MediaType;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget-object p1, p0, Lorg/apache/tika/mime/MimeTypes;->registry:Lorg/apache/tika/mime/MediaTypeRegistry;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Lorg/apache/tika/mime/MediaTypeRegistry;->normalize(Lorg/apache/tika/mime/MediaType;)Lorg/apache/tika/mime/MediaType;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v0, p0, Lorg/apache/tika/mime/MimeTypes;->types:Ljava/util/Map;

    .line 14
    .line 15
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lorg/apache/tika/mime/MimeType;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_0
    invoke-virtual {p1}, Lorg/apache/tika/mime/MediaType;->hasParameters()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    iget-object v0, p0, Lorg/apache/tika/mime/MimeTypes;->types:Ljava/util/Map;

    .line 31
    .line 32
    invoke-virtual {p1}, Lorg/apache/tika/mime/MediaType;->getBaseType()Lorg/apache/tika/mime/MediaType;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lorg/apache/tika/mime/MimeType;

    .line 41
    .line 42
    return-object p1

    .line 43
    :cond_1
    const/4 p1, 0x0

    .line 44
    return-object p1

    .line 45
    :cond_2
    new-instance v0, Lorg/apache/tika/mime/MimeTypeException;

    .line 46
    .line 47
    const-string v1, "Invalid media type name: "

    .line 48
    .line 49
    invoke-static {v1, p1}, Lt/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-direct {v0, p1}, Lorg/apache/tika/mime/MimeTypeException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw v0
.end method

.method public init()V
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/apache/tika/mime/MimeTypes;->types:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lorg/apache/tika/mime/MimeType;

    .line 22
    .line 23
    iget-object v2, p0, Lorg/apache/tika/mime/MimeTypes;->magics:Ljava/util/List;

    .line 24
    .line 25
    invoke-virtual {v1}, Lorg/apache/tika/mime/MimeType;->getMagics()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-interface {v2, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Lorg/apache/tika/mime/MimeType;->hasRootXML()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    iget-object v2, p0, Lorg/apache/tika/mime/MimeTypes;->xmls:Ljava/util/List;

    .line 39
    .line 40
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    iget-object v0, p0, Lorg/apache/tika/mime/MimeTypes;->magics:Ljava/util/List;

    .line 45
    .line 46
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lorg/apache/tika/mime/MimeTypes;->xmls:Ljava/util/List;

    .line 50
    .line 51
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public readMagicHeader(Ljava/io/InputStream;)[B
    .locals 6

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/apache/tika/mime/MimeTypes;->getMinLength()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    new-array v1, v0, [B

    .line 8
    .line 9
    invoke-virtual {p1, v1}, Ljava/io/InputStream;->read([B)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x0

    .line 14
    move v4, v3

    .line 15
    :goto_0
    const/4 v5, -0x1

    .line 16
    if-eq v2, v5, :cond_1

    .line 17
    .line 18
    add-int/2addr v4, v2

    .line 19
    if-ne v4, v0, :cond_0

    .line 20
    .line 21
    return-object v1

    .line 22
    :cond_0
    sub-int v2, v0, v4

    .line 23
    .line 24
    invoke-virtual {p1, v1, v4, v2}, Ljava/io/InputStream;->read([BII)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    new-array p1, v4, [B

    .line 30
    .line 31
    invoke-static {v1, v3, p1, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 32
    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 36
    .line 37
    const-string v0, "InputStream is missing"

    .line 38
    .line 39
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p1
.end method

.method public declared-synchronized setSuperType(Lorg/apache/tika/mime/MimeType;Lorg/apache/tika/mime/MediaType;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lorg/apache/tika/mime/MimeTypes;->registry:Lorg/apache/tika/mime/MediaTypeRegistry;

    .line 3
    .line 4
    invoke-virtual {p1}, Lorg/apache/tika/mime/MimeType;->getType()Lorg/apache/tika/mime/MediaType;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {v0, p1, p2}, Lorg/apache/tika/mime/MediaTypeRegistry;->addSuperType(Lorg/apache/tika/mime/MediaType;Lorg/apache/tika/mime/MediaType;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    throw p1
.end method

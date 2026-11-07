.class public Lorg/apache/tika/detect/AutoDetectReader;
.super Ljava/io/BufferedReader;
.source "SourceFile"


# static fields
.field private static final DEFAULT_DETECTOR:Lorg/apache/tika/detect/EncodingDetector;

.field private static final DEFAULT_LOADER:Lorg/apache/tika/config/ServiceLoader;


# instance fields
.field private final charset:Ljava/nio/charset/Charset;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lorg/apache/tika/config/ServiceLoader;

    .line 2
    .line 3
    const-class v1, Lorg/apache/tika/detect/AutoDetectReader;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Lorg/apache/tika/config/ServiceLoader;-><init>(Ljava/lang/ClassLoader;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lorg/apache/tika/detect/AutoDetectReader;->DEFAULT_LOADER:Lorg/apache/tika/config/ServiceLoader;

    .line 13
    .line 14
    new-instance v1, Lorg/apache/tika/detect/CompositeEncodingDetector;

    .line 15
    .line 16
    const-class v2, Lorg/apache/tika/detect/EncodingDetector;

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Lorg/apache/tika/config/ServiceLoader;->loadServiceProviders(Ljava/lang/Class;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-direct {v1, v0}, Lorg/apache/tika/detect/CompositeEncodingDetector;-><init>(Ljava/util/List;)V

    .line 23
    .line 24
    .line 25
    sput-object v1, Lorg/apache/tika/detect/AutoDetectReader;->DEFAULT_DETECTOR:Lorg/apache/tika/detect/EncodingDetector;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1

    .line 15
    new-instance v0, Lorg/apache/tika/metadata/Metadata;

    invoke-direct {v0}, Lorg/apache/tika/metadata/Metadata;-><init>()V

    invoke-direct {p0, p1, v0}, Lorg/apache/tika/detect/AutoDetectReader;-><init>(Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;)V

    return-void
.end method

.method private constructor <init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/io/InputStreamReader;

    invoke-direct {v0, p1, p2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {p0, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 2
    iput-object p2, p0, Lorg/apache/tika/detect/AutoDetectReader;->charset:Ljava/nio/charset/Charset;

    const/4 p1, 0x1

    .line 3
    invoke-virtual {p0, p1}, Ljava/io/Reader;->mark(I)V

    .line 4
    invoke-virtual {p0}, Ljava/io/Reader;->read()I

    move-result p1

    const p2, 0xfeff

    if-eq p1, p2, :cond_0

    .line 5
    invoke-virtual {p0}, Ljava/io/Reader;->reset()V

    :cond_0
    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;)V
    .locals 1

    .line 14
    sget-object v0, Lorg/apache/tika/detect/AutoDetectReader;->DEFAULT_DETECTOR:Lorg/apache/tika/detect/EncodingDetector;

    invoke-direct {p0, p1, p2, v0}, Lorg/apache/tika/detect/AutoDetectReader;-><init>(Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/detect/EncodingDetector;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/config/ServiceLoader;)V
    .locals 2

    .line 10
    invoke-static {p1}, Lorg/apache/tika/detect/AutoDetectReader;->getBuffered(Ljava/io/InputStream;)Ljava/io/InputStream;

    move-result-object p1

    new-instance v0, Lorg/apache/tika/detect/CompositeEncodingDetector;

    const-class v1, Lorg/apache/tika/detect/EncodingDetector;

    .line 11
    invoke-virtual {p3, v1}, Lorg/apache/tika/config/ServiceLoader;->loadServiceProviders(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/apache/tika/detect/CompositeEncodingDetector;-><init>(Ljava/util/List;)V

    .line 12
    invoke-virtual {p3}, Lorg/apache/tika/config/ServiceLoader;->getLoadErrorHandler()Lorg/apache/tika/config/LoadErrorHandler;

    move-result-object p3

    .line 13
    invoke-direct {p0, p1, p2, v0, p3}, Lorg/apache/tika/detect/AutoDetectReader;-><init>(Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/detect/EncodingDetector;Lorg/apache/tika/config/LoadErrorHandler;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/detect/EncodingDetector;)V
    .locals 1

    .line 7
    invoke-static {p1}, Lorg/apache/tika/detect/AutoDetectReader;->getBuffered(Ljava/io/InputStream;)Ljava/io/InputStream;

    move-result-object p1

    sget-object v0, Lorg/apache/tika/detect/AutoDetectReader;->DEFAULT_LOADER:Lorg/apache/tika/config/ServiceLoader;

    .line 8
    invoke-virtual {v0}, Lorg/apache/tika/config/ServiceLoader;->getLoadErrorHandler()Lorg/apache/tika/config/LoadErrorHandler;

    move-result-object v0

    .line 9
    invoke-direct {p0, p1, p2, p3, v0}, Lorg/apache/tika/detect/AutoDetectReader;-><init>(Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/detect/EncodingDetector;Lorg/apache/tika/config/LoadErrorHandler;)V

    return-void
.end method

.method private constructor <init>(Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/detect/EncodingDetector;Lorg/apache/tika/config/LoadErrorHandler;)V
    .locals 0

    .line 6
    invoke-static {p1, p2, p3, p4}, Lorg/apache/tika/detect/AutoDetectReader;->detect(Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/detect/EncodingDetector;Lorg/apache/tika/config/LoadErrorHandler;)Ljava/nio/charset/Charset;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lorg/apache/tika/detect/AutoDetectReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    return-void
.end method

.method private static detect(Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/detect/EncodingDetector;Lorg/apache/tika/config/LoadErrorHandler;)Ljava/nio/charset/Charset;
    .locals 0

    .line 1
    :try_start_0
    invoke-interface {p2, p0, p1}, Lorg/apache/tika/detect/EncodingDetector;->detect(Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;)Ljava/nio/charset/Charset;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :catch_0
    move-exception p0

    .line 9
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-interface {p3, p2, p0}, Lorg/apache/tika/config/LoadErrorHandler;->handleLoadError(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    const-string p0, "Content-Type"

    .line 21
    .line 22
    invoke-virtual {p1, p0}, Lorg/apache/tika/metadata/Metadata;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {p0}, Lorg/apache/tika/mime/MediaType;->parse(Ljava/lang/String;)Lorg/apache/tika/mime/MediaType;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0}, Lorg/apache/tika/mime/MediaType;->getParameters()Ljava/util/Map;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    const-string p2, "charset"

    .line 37
    .line 38
    invoke-interface {p0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    check-cast p0, Ljava/lang/String;

    .line 43
    .line 44
    if-eqz p0, :cond_1

    .line 45
    .line 46
    :try_start_1
    invoke-static {p0}, Lorg/apache/tika/utils/CharsetUtils;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    sget-object p2, Lorg/apache/tika/metadata/TikaCoreProperties;->DETECTED_ENCODING:Lorg/apache/tika/metadata/Property;

    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p3

    .line 56
    invoke-virtual {p1, p2, p3}, Lorg/apache/tika/metadata/Metadata;->set(Lorg/apache/tika/metadata/Property;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sget-object p2, Lorg/apache/tika/metadata/TikaCoreProperties;->ENCODING_DETECTOR:Lorg/apache/tika/metadata/Property;

    .line 60
    .line 61
    const-string p3, "AutoDetectReader-charset-metadata-fallback"

    .line 62
    .line 63
    invoke-virtual {p1, p2, p3}, Lorg/apache/tika/metadata/Metadata;->set(Lorg/apache/tika/metadata/Property;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 64
    .line 65
    .line 66
    return-object p0

    .line 67
    :catch_1
    :cond_1
    new-instance p0, Lorg/apache/tika/exception/TikaException;

    .line 68
    .line 69
    const-string p1, "Failed to detect the character encoding of a document"

    .line 70
    .line 71
    invoke-direct {p0, p1}, Lorg/apache/tika/exception/TikaException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p0
.end method

.method private static getBuffered(Ljava/io/InputStream;)Ljava/io/InputStream;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/io/InputStream;->markSupported()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    new-instance v0, Ljava/io/BufferedInputStream;

    .line 9
    .line 10
    invoke-direct {v0, p0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method


# virtual methods
.method public asInputSource()Lorg/xml/sax/InputSource;
    .locals 2

    .line 1
    new-instance v0, Lorg/xml/sax/InputSource;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lorg/xml/sax/InputSource;-><init>(Ljava/io/Reader;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lorg/apache/tika/detect/AutoDetectReader;->charset:Ljava/nio/charset/Charset;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Lorg/xml/sax/InputSource;->setEncoding(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public getCharset()Ljava/nio/charset/Charset;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/detect/AutoDetectReader;->charset:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    return-object v0
.end method

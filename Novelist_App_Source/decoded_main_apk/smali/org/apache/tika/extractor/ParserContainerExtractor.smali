.class public Lorg/apache/tika/extractor/ParserContainerExtractor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/apache/tika/extractor/ContainerExtractor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/tika/extractor/ParserContainerExtractor$RecursiveParser;
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x1f6126b4ba74704aL


# instance fields
.field private final detector:Lorg/apache/tika/detect/Detector;

.field private final parser:Lorg/apache/tika/parser/Parser;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, Lorg/apache/tika/config/TikaConfig;->getDefaultConfig()Lorg/apache/tika/config/TikaConfig;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/apache/tika/extractor/ParserContainerExtractor;-><init>(Lorg/apache/tika/config/TikaConfig;)V

    return-void
.end method

.method public constructor <init>(Lorg/apache/tika/config/TikaConfig;)V
    .locals 2

    .line 2
    new-instance v0, Lorg/apache/tika/parser/AutoDetectParser;

    invoke-direct {v0, p1}, Lorg/apache/tika/parser/AutoDetectParser;-><init>(Lorg/apache/tika/config/TikaConfig;)V

    new-instance v1, Lorg/apache/tika/detect/DefaultDetector;

    .line 3
    invoke-virtual {p1}, Lorg/apache/tika/config/TikaConfig;->getMimeRepository()Lorg/apache/tika/mime/MimeTypes;

    move-result-object p1

    invoke-direct {v1, p1}, Lorg/apache/tika/detect/DefaultDetector;-><init>(Lorg/apache/tika/mime/MimeTypes;)V

    .line 4
    invoke-direct {p0, v0, v1}, Lorg/apache/tika/extractor/ParserContainerExtractor;-><init>(Lorg/apache/tika/parser/Parser;Lorg/apache/tika/detect/Detector;)V

    return-void
.end method

.method public constructor <init>(Lorg/apache/tika/parser/Parser;Lorg/apache/tika/detect/Detector;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lorg/apache/tika/extractor/ParserContainerExtractor;->parser:Lorg/apache/tika/parser/Parser;

    .line 7
    iput-object p2, p0, Lorg/apache/tika/extractor/ParserContainerExtractor;->detector:Lorg/apache/tika/detect/Detector;

    return-void
.end method

.method public static bridge synthetic a(Lorg/apache/tika/extractor/ParserContainerExtractor;)Lorg/apache/tika/detect/Detector;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/tika/extractor/ParserContainerExtractor;->detector:Lorg/apache/tika/detect/Detector;

    return-object p0
.end method

.method public static bridge synthetic b(Lorg/apache/tika/extractor/ParserContainerExtractor;)Lorg/apache/tika/parser/Parser;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/tika/extractor/ParserContainerExtractor;->parser:Lorg/apache/tika/parser/Parser;

    return-object p0
.end method


# virtual methods
.method public extract(Lorg/apache/tika/io/TikaInputStream;Lorg/apache/tika/extractor/ContainerExtractor;Lorg/apache/tika/extractor/EmbeddedResourceHandler;)V
    .locals 7

    .line 1
    new-instance v0, Lorg/apache/tika/parser/ParseContext;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/apache/tika/parser/ParseContext;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lorg/apache/tika/extractor/ParserContainerExtractor$RecursiveParser;

    .line 7
    .line 8
    iget-object v3, p0, Lorg/apache/tika/extractor/ParserContainerExtractor;->parser:Lorg/apache/tika/parser/Parser;

    .line 9
    .line 10
    const/4 v6, 0x0

    .line 11
    move-object v2, p0

    .line 12
    move-object v4, p2

    .line 13
    move-object v5, p3

    .line 14
    invoke-direct/range {v1 .. v6}, Lorg/apache/tika/extractor/ParserContainerExtractor$RecursiveParser;-><init>(Lorg/apache/tika/extractor/ParserContainerExtractor;Lorg/apache/tika/parser/Parser;Lorg/apache/tika/extractor/ContainerExtractor;Lorg/apache/tika/extractor/EmbeddedResourceHandler;I)V

    .line 15
    .line 16
    .line 17
    const-class p2, Lorg/apache/tika/parser/Parser;

    .line 18
    .line 19
    invoke-virtual {v0, p2, v1}, Lorg/apache/tika/parser/ParseContext;->set(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :try_start_0
    iget-object p2, v2, Lorg/apache/tika/extractor/ParserContainerExtractor;->parser:Lorg/apache/tika/parser/Parser;

    .line 23
    .line 24
    new-instance p3, Lorg/xml/sax/helpers/DefaultHandler;

    .line 25
    .line 26
    invoke-direct {p3}, Lorg/xml/sax/helpers/DefaultHandler;-><init>()V

    .line 27
    .line 28
    .line 29
    new-instance v1, Lorg/apache/tika/metadata/Metadata;

    .line 30
    .line 31
    invoke-direct {v1}, Lorg/apache/tika/metadata/Metadata;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-interface {p2, p1, p3, v1, v0}, Lorg/apache/tika/parser/Parser;->parse(Ljava/io/InputStream;Lorg/xml/sax/ContentHandler;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)V
    :try_end_0
    .catch Lorg/xml/sax/SAXException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :catch_0
    move-exception v0

    .line 39
    move-object p1, v0

    .line 40
    new-instance p2, Lorg/apache/tika/exception/TikaException;

    .line 41
    .line 42
    const-string p3, "Unexpected SAX exception"

    .line 43
    .line 44
    invoke-direct {p2, p3, p1}, Lorg/apache/tika/exception/TikaException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    throw p2
.end method

.method public isSupported(Lorg/apache/tika/io/TikaInputStream;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/tika/extractor/ParserContainerExtractor;->detector:Lorg/apache/tika/detect/Detector;

    .line 2
    .line 3
    new-instance v1, Lorg/apache/tika/metadata/Metadata;

    .line 4
    .line 5
    invoke-direct {v1}, Lorg/apache/tika/metadata/Metadata;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, p1, v1}, Lorg/apache/tika/detect/Detector;->detect(Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;)Lorg/apache/tika/mime/MediaType;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object v0, p0, Lorg/apache/tika/extractor/ParserContainerExtractor;->parser:Lorg/apache/tika/parser/Parser;

    .line 13
    .line 14
    new-instance v1, Lorg/apache/tika/parser/ParseContext;

    .line 15
    .line 16
    invoke-direct {v1}, Lorg/apache/tika/parser/ParseContext;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-interface {v0, v1}, Lorg/apache/tika/parser/Parser;->getSupportedTypes(Lorg/apache/tika/parser/ParseContext;)Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1
.end method

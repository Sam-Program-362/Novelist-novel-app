.class public Lorg/apache/tika/extractor/EmbeddedDocumentUtil;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private final context:Lorg/apache/tika/parser/ParseContext;

.field private detector:Lorg/apache/tika/detect/Detector;

.field private final embeddedDocumentExtractor:Lorg/apache/tika/extractor/EmbeddedDocumentExtractor;

.field private mimeTypes:Lorg/apache/tika/mime/MimeTypes;

.field private tikaConfig:Lorg/apache/tika/config/TikaConfig;


# direct methods
.method public constructor <init>(Lorg/apache/tika/parser/ParseContext;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/apache/tika/extractor/EmbeddedDocumentUtil;->context:Lorg/apache/tika/parser/ParseContext;

    .line 5
    .line 6
    invoke-static {p1}, Lorg/apache/tika/extractor/EmbeddedDocumentUtil;->getEmbeddedDocumentExtractor(Lorg/apache/tika/parser/ParseContext;)Lorg/apache/tika/extractor/EmbeddedDocumentExtractor;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lorg/apache/tika/extractor/EmbeddedDocumentUtil;->embeddedDocumentExtractor:Lorg/apache/tika/extractor/EmbeddedDocumentExtractor;

    .line 11
    .line 12
    return-void
.end method

.method private static equals(Lorg/apache/tika/parser/Parser;Ljava/lang/Class;)Z
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method private static findInComposite(Lorg/apache/tika/parser/CompositeParser;Ljava/lang/Class;Lorg/apache/tika/parser/ParseContext;)Lorg/apache/tika/parser/Parser;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lorg/apache/tika/parser/CompositeParser;->getAllComponentParsers()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_5

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lorg/apache/tika/parser/Parser;

    .line 20
    .line 21
    invoke-static {v0, p1}, Lorg/apache/tika/extractor/EmbeddedDocumentUtil;->equals(Lorg/apache/tika/parser/Parser;Ljava/lang/Class;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_1
    instance-of v1, v0, Lorg/apache/tika/parser/ParserDecorator;

    .line 29
    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    check-cast v0, Lorg/apache/tika/parser/ParserDecorator;

    .line 33
    .line 34
    invoke-static {v0, p1}, Lorg/apache/tika/extractor/EmbeddedDocumentUtil;->findInDecorated(Lorg/apache/tika/parser/ParserDecorator;Ljava/lang/Class;)Lorg/apache/tika/parser/Parser;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :cond_2
    invoke-static {v0, p1}, Lorg/apache/tika/extractor/EmbeddedDocumentUtil;->equals(Lorg/apache/tika/parser/Parser;Ljava/lang/Class;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_3

    .line 43
    .line 44
    return-object v0

    .line 45
    :cond_3
    instance-of v1, v0, Lorg/apache/tika/parser/CompositeParser;

    .line 46
    .line 47
    if-eqz v1, :cond_4

    .line 48
    .line 49
    check-cast v0, Lorg/apache/tika/parser/CompositeParser;

    .line 50
    .line 51
    invoke-static {v0, p1, p2}, Lorg/apache/tika/extractor/EmbeddedDocumentUtil;->findInComposite(Lorg/apache/tika/parser/CompositeParser;Ljava/lang/Class;Lorg/apache/tika/parser/ParseContext;)Lorg/apache/tika/parser/Parser;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    :cond_4
    invoke-static {v0, p1}, Lorg/apache/tika/extractor/EmbeddedDocumentUtil;->equals(Lorg/apache/tika/parser/Parser;Ljava/lang/Class;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_0

    .line 60
    .line 61
    return-object v0

    .line 62
    :cond_5
    const/4 p0, 0x0

    .line 63
    return-object p0
.end method

.method private static findInDecorated(Lorg/apache/tika/parser/ParserDecorator;Ljava/lang/Class;)Lorg/apache/tika/parser/Parser;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/apache/tika/parser/ParserDecorator;->getWrappedParser()Lorg/apache/tika/parser/Parser;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0, p1}, Lorg/apache/tika/extractor/EmbeddedDocumentUtil;->equals(Lorg/apache/tika/parser/Parser;Ljava/lang/Class;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    instance-of v0, p0, Lorg/apache/tika/parser/ParserDecorator;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    check-cast p0, Lorg/apache/tika/parser/ParserDecorator;

    .line 17
    .line 18
    invoke-static {p0, p1}, Lorg/apache/tika/extractor/EmbeddedDocumentUtil;->findInDecorated(Lorg/apache/tika/parser/ParserDecorator;Ljava/lang/Class;)Lorg/apache/tika/parser/Parser;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    :cond_1
    :goto_0
    return-object p0
.end method

.method private getEmbeddedDocumentExtractor()Lorg/apache/tika/extractor/EmbeddedDocumentExtractor;
    .locals 1

    .line 8
    iget-object v0, p0, Lorg/apache/tika/extractor/EmbeddedDocumentUtil;->embeddedDocumentExtractor:Lorg/apache/tika/extractor/EmbeddedDocumentExtractor;

    return-object v0
.end method

.method public static getEmbeddedDocumentExtractor(Lorg/apache/tika/parser/ParseContext;)Lorg/apache/tika/extractor/EmbeddedDocumentExtractor;
    .locals 4

    .line 1
    const-class v0, Lorg/apache/tika/extractor/EmbeddedDocumentExtractor;

    invoke-virtual {p0, v0}, Lorg/apache/tika/parser/ParseContext;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/tika/extractor/EmbeddedDocumentExtractor;

    if-eqz v1, :cond_0

    return-object v1

    .line 2
    :cond_0
    const-class v1, Lorg/apache/tika/parser/Parser;

    invoke-virtual {p0, v1}, Lorg/apache/tika/parser/ParseContext;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/tika/parser/Parser;

    if-nez v2, :cond_2

    .line 3
    const-class v2, Lorg/apache/tika/config/TikaConfig;

    invoke-virtual {p0, v2}, Lorg/apache/tika/parser/ParseContext;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/tika/config/TikaConfig;

    if-nez v2, :cond_1

    .line 4
    new-instance v2, Lorg/apache/tika/parser/AutoDetectParser;

    invoke-direct {v2}, Lorg/apache/tika/parser/AutoDetectParser;-><init>()V

    invoke-virtual {p0, v1, v2}, Lorg/apache/tika/parser/ParseContext;->set(Ljava/lang/Class;Ljava/lang/Object;)V

    goto :goto_0

    .line 5
    :cond_1
    new-instance v3, Lorg/apache/tika/parser/AutoDetectParser;

    invoke-direct {v3, v2}, Lorg/apache/tika/parser/AutoDetectParser;-><init>(Lorg/apache/tika/config/TikaConfig;)V

    invoke-virtual {p0, v1, v3}, Lorg/apache/tika/parser/ParseContext;->set(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 6
    :cond_2
    :goto_0
    new-instance v1, Lorg/apache/tika/extractor/ParsingEmbeddedDocumentExtractor;

    invoke-direct {v1, p0}, Lorg/apache/tika/extractor/ParsingEmbeddedDocumentExtractor;-><init>(Lorg/apache/tika/parser/ParseContext;)V

    .line 7
    invoke-virtual {p0, v0, v1}, Lorg/apache/tika/parser/ParseContext;->set(Ljava/lang/Class;Ljava/lang/Object;)V

    return-object v1
.end method

.method public static getStatelessParser(Lorg/apache/tika/parser/ParseContext;)Lorg/apache/tika/parser/Parser;
    .locals 1

    .line 1
    const-class v0, Lorg/apache/tika/parser/Parser;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lorg/apache/tika/parser/ParseContext;->get(Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/apache/tika/parser/Parser;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_0
    instance-of v0, p0, Lorg/apache/tika/parser/StatefulParser;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    check-cast p0, Lorg/apache/tika/parser/StatefulParser;

    .line 18
    .line 19
    invoke-virtual {p0}, Lorg/apache/tika/parser/ParserDecorator;->getWrappedParser()Lorg/apache/tika/parser/Parser;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    :cond_1
    return-object p0
.end method

.method public static recordEmbeddedStreamException(Ljava/lang/Throwable;Lorg/apache/tika/metadata/Metadata;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lorg/apache/tika/utils/ExceptionUtils;->getFilteredStackTrace(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->TIKA_META_EXCEPTION_EMBEDDED_STREAM:Lorg/apache/tika/metadata/Property;

    .line 6
    .line 7
    invoke-virtual {p1, v0, p0}, Lorg/apache/tika/metadata/Metadata;->add(Lorg/apache/tika/metadata/Property;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static recordException(Ljava/lang/Throwable;Lorg/apache/tika/metadata/Metadata;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lorg/apache/tika/utils/ExceptionUtils;->getFilteredStackTrace(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->TIKA_META_EXCEPTION_WARNING:Lorg/apache/tika/metadata/Property;

    .line 6
    .line 7
    invoke-virtual {p1, v0, p0}, Lorg/apache/tika/metadata/Metadata;->add(Lorg/apache/tika/metadata/Property;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static tryToFindExistingLeafParser(Ljava/lang/Class;Lorg/apache/tika/parser/ParseContext;)Lorg/apache/tika/parser/Parser;
    .locals 3

    .line 1
    const-class v0, Lorg/apache/tika/parser/Parser;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lorg/apache/tika/parser/ParseContext;->get(Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lorg/apache/tika/parser/Parser;

    .line 8
    .line 9
    invoke-static {v0, p0}, Lorg/apache/tika/extractor/EmbeddedDocumentUtil;->equals(Lorg/apache/tika/parser/Parser;Ljava/lang/Class;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    if-eqz v0, :cond_3

    .line 18
    .line 19
    instance-of v2, v0, Lorg/apache/tika/parser/ParserDecorator;

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    check-cast v0, Lorg/apache/tika/parser/ParserDecorator;

    .line 24
    .line 25
    invoke-static {v0, p0}, Lorg/apache/tika/extractor/EmbeddedDocumentUtil;->findInDecorated(Lorg/apache/tika/parser/ParserDecorator;Ljava/lang/Class;)Lorg/apache/tika/parser/Parser;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :cond_1
    invoke-static {v0, p0}, Lorg/apache/tika/extractor/EmbeddedDocumentUtil;->equals(Lorg/apache/tika/parser/Parser;Ljava/lang/Class;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    return-object v0

    .line 36
    :cond_2
    instance-of v2, v0, Lorg/apache/tika/parser/CompositeParser;

    .line 37
    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    check-cast v0, Lorg/apache/tika/parser/CompositeParser;

    .line 41
    .line 42
    invoke-static {v0, p0, p1}, Lorg/apache/tika/extractor/EmbeddedDocumentUtil;->findInComposite(Lorg/apache/tika/parser/CompositeParser;Ljava/lang/Class;Lorg/apache/tika/parser/ParseContext;)Lorg/apache/tika/parser/Parser;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    goto :goto_0

    .line 47
    :cond_3
    move-object p1, v1

    .line 48
    :goto_0
    if-eqz p1, :cond_4

    .line 49
    .line 50
    invoke-static {p1, p0}, Lorg/apache/tika/extractor/EmbeddedDocumentUtil;->equals(Lorg/apache/tika/parser/Parser;Ljava/lang/Class;)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-eqz p0, :cond_4

    .line 55
    .line 56
    return-object p1

    .line 57
    :cond_4
    return-object v1
.end method


# virtual methods
.method public getDetector()Lorg/apache/tika/detect/Detector;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/tika/extractor/EmbeddedDocumentUtil;->context:Lorg/apache/tika/parser/ParseContext;

    .line 2
    .line 3
    const-class v1, Lorg/apache/tika/detect/Detector;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lorg/apache/tika/parser/ParseContext;->get(Ljava/lang/Class;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lorg/apache/tika/detect/Detector;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    iget-object v0, p0, Lorg/apache/tika/extractor/EmbeddedDocumentUtil;->detector:Lorg/apache/tika/detect/Detector;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_1
    invoke-virtual {p0}, Lorg/apache/tika/extractor/EmbeddedDocumentUtil;->getTikaConfig()Lorg/apache/tika/config/TikaConfig;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Lorg/apache/tika/config/TikaConfig;->getDetector()Lorg/apache/tika/detect/Detector;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, Lorg/apache/tika/extractor/EmbeddedDocumentUtil;->detector:Lorg/apache/tika/detect/Detector;

    .line 28
    .line 29
    return-object v0
.end method

.method public getExtension(Lorg/apache/tika/io/TikaInputStream;Lorg/apache/tika/metadata/Metadata;)Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "Content-Type"

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Lorg/apache/tika/metadata/Metadata;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0}, Lorg/apache/tika/extractor/EmbeddedDocumentUtil;->getMimeTypes()Lorg/apache/tika/mime/MimeTypes;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {v2, v1}, Lorg/apache/tika/mime/MimeTypes;->forName(Ljava/lang/String;)Lorg/apache/tika/mime/MimeType;

    .line 14
    .line 15
    .line 16
    move-result-object v1
    :try_end_0
    .catch Lorg/apache/tika/mime/MimeTypeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    goto :goto_0

    .line 18
    :catch_0
    :cond_0
    const/4 v1, 0x0

    .line 19
    :goto_0
    const/4 v3, 0x0

    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    :try_start_1
    invoke-virtual {p0}, Lorg/apache/tika/extractor/EmbeddedDocumentUtil;->getDetector()Lorg/apache/tika/detect/Detector;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-interface {v4, p1, p2}, Lorg/apache/tika/detect/Detector;->detect(Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;)Lorg/apache/tika/mime/MediaType;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-virtual {v4}, Lorg/apache/tika/mime/MediaType;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-virtual {v2, v4}, Lorg/apache/tika/mime/MimeTypes;->forName(Ljava/lang/String;)Lorg/apache/tika/mime/MimeType;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const/4 v3, 0x1

    .line 39
    invoke-virtual {p1}, Lorg/apache/tika/io/TikaInputStream;->reset()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lorg/apache/tika/mime/MimeTypeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 40
    .line 41
    .line 42
    :catch_1
    :cond_1
    if-eqz v1, :cond_3

    .line 43
    .line 44
    if-eqz v3, :cond_2

    .line 45
    .line 46
    invoke-virtual {v1}, Lorg/apache/tika/mime/MimeType;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p2, v0, p1}, Lorg/apache/tika/metadata/Metadata;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_2
    invoke-virtual {v1}, Lorg/apache/tika/mime/MimeType;->getExtension()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1

    .line 58
    :cond_3
    const-string p1, ".bin"

    .line 59
    .line 60
    return-object p1
.end method

.method public getMimeTypes()Lorg/apache/tika/mime/MimeTypes;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/tika/extractor/EmbeddedDocumentUtil;->context:Lorg/apache/tika/parser/ParseContext;

    .line 2
    .line 3
    const-class v1, Lorg/apache/tika/mime/MimeTypes;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lorg/apache/tika/parser/ParseContext;->get(Ljava/lang/Class;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lorg/apache/tika/mime/MimeTypes;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    iget-object v0, p0, Lorg/apache/tika/extractor/EmbeddedDocumentUtil;->mimeTypes:Lorg/apache/tika/mime/MimeTypes;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_1
    invoke-virtual {p0}, Lorg/apache/tika/extractor/EmbeddedDocumentUtil;->getTikaConfig()Lorg/apache/tika/config/TikaConfig;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Lorg/apache/tika/config/TikaConfig;->getMimeRepository()Lorg/apache/tika/mime/MimeTypes;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, Lorg/apache/tika/extractor/EmbeddedDocumentUtil;->mimeTypes:Lorg/apache/tika/mime/MimeTypes;

    .line 28
    .line 29
    return-object v0
.end method

.method public getPasswordProvider()Lorg/apache/tika/parser/PasswordProvider;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/tika/extractor/EmbeddedDocumentUtil;->context:Lorg/apache/tika/parser/ParseContext;

    .line 2
    .line 3
    const-class v1, Lorg/apache/tika/parser/PasswordProvider;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lorg/apache/tika/parser/ParseContext;->get(Ljava/lang/Class;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lorg/apache/tika/parser/PasswordProvider;

    .line 10
    .line 11
    return-object v0
.end method

.method public getTikaConfig()Lorg/apache/tika/config/TikaConfig;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/tika/extractor/EmbeddedDocumentUtil;->tikaConfig:Lorg/apache/tika/config/TikaConfig;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lorg/apache/tika/extractor/EmbeddedDocumentUtil;->context:Lorg/apache/tika/parser/ParseContext;

    .line 6
    .line 7
    const-class v1, Lorg/apache/tika/config/TikaConfig;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lorg/apache/tika/parser/ParseContext;->get(Ljava/lang/Class;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lorg/apache/tika/config/TikaConfig;

    .line 14
    .line 15
    iput-object v0, p0, Lorg/apache/tika/extractor/EmbeddedDocumentUtil;->tikaConfig:Lorg/apache/tika/config/TikaConfig;

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    invoke-static {}, Lorg/apache/tika/config/TikaConfig;->getDefaultConfig()Lorg/apache/tika/config/TikaConfig;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lorg/apache/tika/extractor/EmbeddedDocumentUtil;->tikaConfig:Lorg/apache/tika/config/TikaConfig;

    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lorg/apache/tika/extractor/EmbeddedDocumentUtil;->tikaConfig:Lorg/apache/tika/config/TikaConfig;

    .line 26
    .line 27
    return-object v0
.end method

.method public parseEmbedded(Ljava/io/InputStream;Lorg/xml/sax/ContentHandler;Lorg/apache/tika/metadata/Metadata;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/extractor/EmbeddedDocumentUtil;->embeddedDocumentExtractor:Lorg/apache/tika/extractor/EmbeddedDocumentExtractor;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3, p4}, Lorg/apache/tika/extractor/EmbeddedDocumentExtractor;->parseEmbedded(Ljava/io/InputStream;Lorg/xml/sax/ContentHandler;Lorg/apache/tika/metadata/Metadata;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public shouldParseEmbedded(Lorg/apache/tika/metadata/Metadata;)Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/apache/tika/extractor/EmbeddedDocumentUtil;->getEmbeddedDocumentExtractor()Lorg/apache/tika/extractor/EmbeddedDocumentExtractor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Lorg/apache/tika/extractor/EmbeddedDocumentExtractor;->shouldParseEmbedded(Lorg/apache/tika/metadata/Metadata;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

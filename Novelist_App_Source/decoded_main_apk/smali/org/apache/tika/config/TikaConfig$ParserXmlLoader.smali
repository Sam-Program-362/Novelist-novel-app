.class Lorg/apache/tika/config/TikaConfig$ParserXmlLoader;
.super Lorg/apache/tika/config/TikaConfig$XmlLoader;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/tika/config/TikaConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ParserXmlLoader"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/apache/tika/config/TikaConfig$XmlLoader<",
        "Lorg/apache/tika/parser/CompositeParser;",
        "Lorg/apache/tika/parser/Parser;",
        ">;"
    }
.end annotation


# instance fields
.field private final encodingDetector:Lorg/apache/tika/detect/EncodingDetector;

.field private final renderer:Lorg/apache/tika/renderer/Renderer;


# direct methods
.method private constructor <init>(Lorg/apache/tika/detect/EncodingDetector;Lorg/apache/tika/renderer/Renderer;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lorg/apache/tika/config/TikaConfig$XmlLoader;-><init>(I)V

    .line 3
    iput-object p1, p0, Lorg/apache/tika/config/TikaConfig$ParserXmlLoader;->encodingDetector:Lorg/apache/tika/detect/EncodingDetector;

    .line 4
    iput-object p2, p0, Lorg/apache/tika/config/TikaConfig$ParserXmlLoader;->renderer:Lorg/apache/tika/renderer/Renderer;

    return-void
.end method

.method public synthetic constructor <init>(Lorg/apache/tika/detect/EncodingDetector;Lorg/apache/tika/renderer/Renderer;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lorg/apache/tika/config/TikaConfig$ParserXmlLoader;-><init>(Lorg/apache/tika/detect/EncodingDetector;Lorg/apache/tika/renderer/Renderer;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic createComposite(Ljava/lang/Class;Ljava/util/List;Ljava/util/Set;Ljava/util/Map;Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p6}, Lorg/apache/tika/config/TikaConfig$ParserXmlLoader;->createComposite(Ljava/lang/Class;Ljava/util/List;Ljava/util/Set;Ljava/util/Map;Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;)Lorg/apache/tika/parser/Parser;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic createComposite(Ljava/util/List;Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lorg/apache/tika/config/TikaConfig$ParserXmlLoader;->createComposite(Ljava/util/List;Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;)Lorg/apache/tika/parser/CompositeParser;

    move-result-object p1

    return-object p1
.end method

.method public createComposite(Ljava/util/List;Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;)Lorg/apache/tika/parser/CompositeParser;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lorg/apache/tika/parser/Parser;",
            ">;",
            "Lorg/apache/tika/mime/MimeTypes;",
            "Lorg/apache/tika/config/ServiceLoader;",
            ")",
            "Lorg/apache/tika/parser/CompositeParser;"
        }
    .end annotation

    .line 3
    invoke-virtual {p2}, Lorg/apache/tika/mime/MimeTypes;->getMediaTypeRegistry()Lorg/apache/tika/mime/MediaTypeRegistry;

    move-result-object p2

    .line 4
    new-instance p3, Lorg/apache/tika/parser/CompositeParser;

    invoke-direct {p3, p2, p1}, Lorg/apache/tika/parser/CompositeParser;-><init>(Lorg/apache/tika/mime/MediaTypeRegistry;Ljava/util/List;)V

    return-object p3
.end method

.method public createComposite(Ljava/lang/Class;Ljava/util/List;Ljava/util/Set;Ljava/util/Map;Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;)Lorg/apache/tika/parser/Parser;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lorg/apache/tika/parser/Parser;",
            ">;",
            "Ljava/util/List<",
            "Lorg/apache/tika/parser/Parser;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Lorg/apache/tika/parser/Parser;",
            ">;>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lorg/apache/tika/config/Param;",
            ">;",
            "Lorg/apache/tika/mime/MimeTypes;",
            "Lorg/apache/tika/config/ServiceLoader;",
            ")",
            "Lorg/apache/tika/parser/Parser;"
        }
    .end annotation

    .line 5
    const-class v0, Lorg/apache/tika/detect/EncodingDetector;

    const-class v1, Lorg/apache/tika/config/ServiceLoader;

    const-class v2, Ljava/util/Collection;

    const-class v3, Lorg/apache/tika/mime/MediaTypeRegistry;

    .line 6
    invoke-virtual {p5}, Lorg/apache/tika/mime/MimeTypes;->getMediaTypeRegistry()Lorg/apache/tika/mime/MediaTypeRegistry;

    move-result-object p5

    .line 7
    :try_start_0
    const-class v4, Lorg/apache/tika/renderer/Renderer;

    filled-new-array {v3, v1, v2, v0, v4}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    .line 8
    iget-object v5, p0, Lorg/apache/tika/config/TikaConfig$ParserXmlLoader;->encodingDetector:Lorg/apache/tika/detect/EncodingDetector;

    iget-object v6, p0, Lorg/apache/tika/config/TikaConfig$ParserXmlLoader;->renderer:Lorg/apache/tika/renderer/Renderer;

    filled-new-array {p5, p6, p3, v5, v6}, [Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/apache/tika/parser/Parser;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v4, 0x0

    :goto_0
    if-nez v4, :cond_0

    .line 9
    :try_start_1
    filled-new-array {v3, v1, v2, v0}, [Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    .line 10
    iget-object v5, p0, Lorg/apache/tika/config/TikaConfig$ParserXmlLoader;->encodingDetector:Lorg/apache/tika/detect/EncodingDetector;

    filled-new-array {p5, p6, p3, v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/tika/parser/Parser;
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    move-object v4, v0

    :catch_1
    :cond_0
    if-nez v4, :cond_1

    .line 11
    :try_start_2
    filled-new-array {v3, v1, v2}, [Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    .line 12
    filled-new-array {p5, p6, p3}, [Ljava/lang/Object;

    move-result-object p6

    invoke-virtual {v0, p6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p6

    check-cast p6, Lorg/apache/tika/parser/Parser;
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_2

    move-object v4, p6

    .line 13
    :catch_2
    :cond_1
    const-class p6, Ljava/util/List;

    if-nez v4, :cond_2

    .line 14
    :try_start_3
    filled-new-array {v3, p6, v2}, [Ljava/lang/Class;

    move-result-object v0

    .line 15
    invoke-virtual {p1, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    .line 16
    filled-new-array {p5, p2, p3}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/tika/parser/Parser;
    :try_end_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_3 .. :try_end_3} :catch_3

    move-object v4, v0

    :catch_3
    :cond_2
    if-nez v4, :cond_3

    .line 17
    :try_start_4
    const-class v0, Ljava/util/Map;

    filled-new-array {v3, v2, v0}, [Ljava/lang/Class;

    move-result-object v0

    .line 18
    invoke-virtual {p1, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    .line 19
    filled-new-array {p5, p2, p4}, [Ljava/lang/Object;

    move-result-object p4

    invoke-virtual {v0, p4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lorg/apache/tika/parser/Parser;
    :try_end_4
    .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_4} :catch_4

    move-object v4, p4

    :catch_4
    :cond_3
    if-nez v4, :cond_4

    .line 20
    :try_start_5
    filled-new-array {v3, p6}, [Ljava/lang/Class;

    move-result-object p4

    invoke-virtual {p1, p4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p4

    .line 21
    filled-new-array {p5, p2}, [Ljava/lang/Object;

    move-result-object p6

    invoke-virtual {p4, p6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lorg/apache/tika/parser/Parser;
    :try_end_5
    .catch Ljava/lang/NoSuchMethodException; {:try_start_5 .. :try_end_5} :catch_5

    move-object v4, p4

    :catch_5
    :cond_4
    if-nez v4, :cond_6

    .line 22
    const-class p4, Lorg/apache/tika/parser/ParserDecorator;

    invoke-virtual {p4, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p4

    if-eqz p4, :cond_6

    .line 23
    :try_start_6
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p4

    const/4 p6, 0x1

    if-ne p4, p6, :cond_5

    invoke-interface {p3}, Ljava/util/Set;->isEmpty()Z

    move-result p4

    if-eqz p4, :cond_5

    const/4 p4, 0x0

    .line 24
    invoke-interface {p2, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p6

    instance-of p6, p6, Lorg/apache/tika/parser/CompositeParser;

    if-eqz p6, :cond_5

    .line 25
    invoke-interface {p2, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lorg/apache/tika/parser/CompositeParser;

    goto :goto_1

    .line 26
    :cond_5
    new-instance p4, Lorg/apache/tika/parser/CompositeParser;

    invoke-direct {p4, p5, p2, p3}, Lorg/apache/tika/parser/CompositeParser;-><init>(Lorg/apache/tika/mime/MediaTypeRegistry;Ljava/util/List;Ljava/util/Collection;)V

    move-object p2, p4

    .line 27
    :goto_1
    const-class p3, Lorg/apache/tika/parser/Parser;

    filled-new-array {p3}, [Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    .line 28
    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/apache/tika/parser/Parser;
    :try_end_6
    .catch Ljava/lang/NoSuchMethodException; {:try_start_6 .. :try_end_6} :catch_6

    move-object v4, p1

    :catch_6
    :cond_6
    return-object v4
.end method

.method public bridge synthetic createDefault(Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lorg/apache/tika/config/TikaConfig$ParserXmlLoader;->createDefault(Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;)Lorg/apache/tika/parser/CompositeParser;

    move-result-object p1

    return-object p1
.end method

.method public createDefault(Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;)Lorg/apache/tika/parser/CompositeParser;
    .locals 2

    .line 2
    iget-object v0, p0, Lorg/apache/tika/config/TikaConfig$ParserXmlLoader;->encodingDetector:Lorg/apache/tika/detect/EncodingDetector;

    iget-object v1, p0, Lorg/apache/tika/config/TikaConfig$ParserXmlLoader;->renderer:Lorg/apache/tika/renderer/Renderer;

    invoke-static {p1, p2, v0, v1}, Lorg/apache/tika/config/TikaConfig;->d(Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;Lorg/apache/tika/detect/EncodingDetector;Lorg/apache/tika/renderer/Renderer;)Lorg/apache/tika/parser/CompositeParser;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic decorate(Ljava/lang/Object;Lorg/w3c/dom/Element;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lorg/apache/tika/parser/Parser;

    invoke-virtual {p0, p1, p2}, Lorg/apache/tika/config/TikaConfig$ParserXmlLoader;->decorate(Lorg/apache/tika/parser/Parser;Lorg/w3c/dom/Element;)Lorg/apache/tika/parser/Parser;

    move-result-object p1

    return-object p1
.end method

.method public decorate(Lorg/apache/tika/parser/Parser;Lorg/w3c/dom/Element;)Lorg/apache/tika/parser/Parser;
    .locals 2

    .line 2
    const-string v0, "mime"

    invoke-static {p2, v0}, Lorg/apache/tika/config/TikaConfig;->i(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/util/Set;

    move-result-object v0

    .line 3
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 4
    invoke-static {p1, v0}, Lorg/apache/tika/parser/ParserDecorator;->withTypes(Lorg/apache/tika/parser/Parser;Ljava/util/Set;)Lorg/apache/tika/parser/Parser;

    move-result-object p1

    .line 5
    :cond_0
    const-string v0, "mime-exclude"

    invoke-static {p2, v0}, Lorg/apache/tika/config/TikaConfig;->i(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/util/Set;

    move-result-object p2

    .line 6
    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 7
    invoke-static {p1, p2}, Lorg/apache/tika/parser/ParserDecorator;->withoutTypes(Lorg/apache/tika/parser/Parser;Ljava/util/Set;)Lorg/apache/tika/parser/Parser;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public getLoaderClass()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+",
            "Lorg/apache/tika/parser/Parser;",
            ">;"
        }
    .end annotation

    .line 1
    const-class v0, Lorg/apache/tika/parser/Parser;

    .line 2
    .line 3
    return-object v0
.end method

.method public getLoaderTagName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "parser"

    .line 2
    .line 3
    return-object v0
.end method

.method public getParentTagName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "parsers"

    .line 2
    .line 3
    return-object v0
.end method

.method public isComposite(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lorg/apache/tika/parser/Parser;",
            ">;)Z"
        }
    .end annotation

    .line 3
    const-class v0, Lorg/apache/tika/parser/CompositeParser;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_1

    const-class v0, Lorg/apache/tika/parser/multiple/AbstractMultipleParser;

    .line 4
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_1

    const-class v0, Lorg/apache/tika/parser/ParserDecorator;

    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic isComposite(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lorg/apache/tika/parser/Parser;

    invoke-virtual {p0, p1}, Lorg/apache/tika/config/TikaConfig$ParserXmlLoader;->isComposite(Lorg/apache/tika/parser/Parser;)Z

    move-result p1

    return p1
.end method

.method public isComposite(Lorg/apache/tika/parser/Parser;)Z
    .locals 0

    .line 2
    instance-of p1, p1, Lorg/apache/tika/parser/CompositeParser;

    return p1
.end method

.method public bridge synthetic newInstance(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lorg/apache/tika/config/TikaConfig$ParserXmlLoader;->newInstance(Ljava/lang/Class;)Lorg/apache/tika/parser/Parser;

    move-result-object p1

    return-object p1
.end method

.method public newInstance(Ljava/lang/Class;)Lorg/apache/tika/parser/Parser;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lorg/apache/tika/parser/Parser;",
            ">;)",
            "Lorg/apache/tika/parser/Parser;"
        }
    .end annotation

    .line 2
    const-class v0, Lorg/apache/tika/parser/AbstractEncodingDetectorParser;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    const-class v0, Lorg/apache/tika/detect/EncodingDetector;

    filled-new-array {v0}, [Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    .line 4
    iget-object v0, p0, Lorg/apache/tika/config/TikaConfig$ParserXmlLoader;->encodingDetector:Lorg/apache/tika/detect/EncodingDetector;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/apache/tika/parser/Parser;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/apache/tika/parser/Parser;

    .line 6
    :goto_0
    instance-of v0, p1, Lorg/apache/tika/parser/RenderingParser;

    if-eqz v0, :cond_1

    .line 7
    move-object v0, p1

    check-cast v0, Lorg/apache/tika/parser/RenderingParser;

    iget-object v1, p0, Lorg/apache/tika/config/TikaConfig$ParserXmlLoader;->renderer:Lorg/apache/tika/renderer/Renderer;

    invoke-interface {v0, v1}, Lorg/apache/tika/parser/RenderingParser;->setRenderer(Lorg/apache/tika/renderer/Renderer;)V

    :cond_1
    return-object p1
.end method

.method public bridge synthetic preLoadOne(Ljava/lang/Class;Ljava/lang/String;Lorg/apache/tika/mime/MimeTypes;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lorg/apache/tika/config/TikaConfig$ParserXmlLoader;->preLoadOne(Ljava/lang/Class;Ljava/lang/String;Lorg/apache/tika/mime/MimeTypes;)Lorg/apache/tika/parser/Parser;

    move-result-object p1

    return-object p1
.end method

.method public preLoadOne(Ljava/lang/Class;Ljava/lang/String;Lorg/apache/tika/mime/MimeTypes;)Lorg/apache/tika/parser/Parser;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lorg/apache/tika/parser/Parser;",
            ">;",
            "Ljava/lang/String;",
            "Lorg/apache/tika/mime/MimeTypes;",
            ")",
            "Lorg/apache/tika/parser/Parser;"
        }
    .end annotation

    .line 2
    const-class p3, Lorg/apache/tika/parser/AutoDetectParser;

    invoke-virtual {p3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 3
    :cond_0
    new-instance p1, Lorg/apache/tika/exception/TikaException;

    const-string p3, "AutoDetectParser not supported in a <parser> configuration element: "

    .line 4
    invoke-static {p3, p2}, Lt/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 5
    invoke-direct {p1, p2}, Lorg/apache/tika/exception/TikaException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public supportsComposite()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.class public Lorg/apache/tika/parser/DefaultParser;
.super Lorg/apache/tika/parser/CompositeParser;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = 0x32218e4a2f8413d0L


# instance fields
.field private final transient loader:Lorg/apache/tika/config/ServiceLoader;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 12
    invoke-static {}, Lorg/apache/tika/mime/MediaTypeRegistry;->getDefaultRegistry()Lorg/apache/tika/mime/MediaTypeRegistry;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/apache/tika/parser/DefaultParser;-><init>(Lorg/apache/tika/mime/MediaTypeRegistry;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/ClassLoader;)V
    .locals 2

    .line 10
    invoke-static {}, Lorg/apache/tika/mime/MediaTypeRegistry;->getDefaultRegistry()Lorg/apache/tika/mime/MediaTypeRegistry;

    move-result-object v0

    new-instance v1, Lorg/apache/tika/config/ServiceLoader;

    invoke-direct {v1, p1}, Lorg/apache/tika/config/ServiceLoader;-><init>(Ljava/lang/ClassLoader;)V

    invoke-direct {p0, v0, v1}, Lorg/apache/tika/parser/DefaultParser;-><init>(Lorg/apache/tika/mime/MediaTypeRegistry;Lorg/apache/tika/config/ServiceLoader;)V

    return-void
.end method

.method public constructor <init>(Lorg/apache/tika/mime/MediaTypeRegistry;)V
    .locals 1

    .line 11
    new-instance v0, Lorg/apache/tika/config/ServiceLoader;

    invoke-direct {v0}, Lorg/apache/tika/config/ServiceLoader;-><init>()V

    invoke-direct {p0, p1, v0}, Lorg/apache/tika/parser/DefaultParser;-><init>(Lorg/apache/tika/mime/MediaTypeRegistry;Lorg/apache/tika/config/ServiceLoader;)V

    return-void
.end method

.method public constructor <init>(Lorg/apache/tika/mime/MediaTypeRegistry;Ljava/lang/ClassLoader;)V
    .locals 1

    .line 9
    new-instance v0, Lorg/apache/tika/config/ServiceLoader;

    invoke-direct {v0, p2}, Lorg/apache/tika/config/ServiceLoader;-><init>(Ljava/lang/ClassLoader;)V

    invoke-direct {p0, p1, v0}, Lorg/apache/tika/parser/DefaultParser;-><init>(Lorg/apache/tika/mime/MediaTypeRegistry;Lorg/apache/tika/config/ServiceLoader;)V

    return-void
.end method

.method public constructor <init>(Lorg/apache/tika/mime/MediaTypeRegistry;Lorg/apache/tika/config/ServiceLoader;)V
    .locals 6

    .line 8
    sget-object v3, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    new-instance v4, Lorg/apache/tika/detect/DefaultEncodingDetector;

    invoke-direct {v4, p2}, Lorg/apache/tika/detect/DefaultEncodingDetector;-><init>(Lorg/apache/tika/config/ServiceLoader;)V

    new-instance v5, Lorg/apache/tika/renderer/CompositeRenderer;

    invoke-direct {v5, p2}, Lorg/apache/tika/renderer/CompositeRenderer;-><init>(Lorg/apache/tika/config/ServiceLoader;)V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lorg/apache/tika/parser/DefaultParser;-><init>(Lorg/apache/tika/mime/MediaTypeRegistry;Lorg/apache/tika/config/ServiceLoader;Ljava/util/Collection;Lorg/apache/tika/detect/EncodingDetector;Lorg/apache/tika/renderer/Renderer;)V

    return-void
.end method

.method public constructor <init>(Lorg/apache/tika/mime/MediaTypeRegistry;Lorg/apache/tika/config/ServiceLoader;Ljava/util/Collection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/tika/mime/MediaTypeRegistry;",
            "Lorg/apache/tika/config/ServiceLoader;",
            "Ljava/util/Collection<",
            "Ljava/lang/Class<",
            "+",
            "Lorg/apache/tika/parser/Parser;",
            ">;>;)V"
        }
    .end annotation

    .line 3
    new-instance v0, Lorg/apache/tika/detect/DefaultEncodingDetector;

    invoke-direct {v0, p2}, Lorg/apache/tika/detect/DefaultEncodingDetector;-><init>(Lorg/apache/tika/config/ServiceLoader;)V

    new-instance v1, Lorg/apache/tika/renderer/CompositeRenderer;

    invoke-direct {v1, p2}, Lorg/apache/tika/renderer/CompositeRenderer;-><init>(Lorg/apache/tika/config/ServiceLoader;)V

    .line 4
    invoke-static {p2, v0, v1, p3}, Lorg/apache/tika/parser/DefaultParser;->getDefaultParsers(Lorg/apache/tika/config/ServiceLoader;Lorg/apache/tika/detect/EncodingDetector;Lorg/apache/tika/renderer/Renderer;Ljava/util/Collection;)Ljava/util/List;

    move-result-object p3

    .line 5
    invoke-direct {p0, p1, p3}, Lorg/apache/tika/parser/CompositeParser;-><init>(Lorg/apache/tika/mime/MediaTypeRegistry;Ljava/util/List;)V

    .line 6
    iput-object p2, p0, Lorg/apache/tika/parser/DefaultParser;->loader:Lorg/apache/tika/config/ServiceLoader;

    return-void
.end method

.method public constructor <init>(Lorg/apache/tika/mime/MediaTypeRegistry;Lorg/apache/tika/config/ServiceLoader;Ljava/util/Collection;Lorg/apache/tika/detect/EncodingDetector;Lorg/apache/tika/renderer/Renderer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/tika/mime/MediaTypeRegistry;",
            "Lorg/apache/tika/config/ServiceLoader;",
            "Ljava/util/Collection<",
            "Ljava/lang/Class<",
            "+",
            "Lorg/apache/tika/parser/Parser;",
            ">;>;",
            "Lorg/apache/tika/detect/EncodingDetector;",
            "Lorg/apache/tika/renderer/Renderer;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {p2, p4, p5, p3}, Lorg/apache/tika/parser/DefaultParser;->getDefaultParsers(Lorg/apache/tika/config/ServiceLoader;Lorg/apache/tika/detect/EncodingDetector;Lorg/apache/tika/renderer/Renderer;Ljava/util/Collection;)Ljava/util/List;

    move-result-object p3

    invoke-direct {p0, p1, p3}, Lorg/apache/tika/parser/CompositeParser;-><init>(Lorg/apache/tika/mime/MediaTypeRegistry;Ljava/util/List;)V

    .line 2
    iput-object p2, p0, Lorg/apache/tika/parser/DefaultParser;->loader:Lorg/apache/tika/config/ServiceLoader;

    return-void
.end method

.method public constructor <init>(Lorg/apache/tika/mime/MediaTypeRegistry;Lorg/apache/tika/config/ServiceLoader;Lorg/apache/tika/detect/EncodingDetector;Lorg/apache/tika/renderer/Renderer;)V
    .locals 6

    .line 7
    sget-object v3, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lorg/apache/tika/parser/DefaultParser;-><init>(Lorg/apache/tika/mime/MediaTypeRegistry;Lorg/apache/tika/config/ServiceLoader;Ljava/util/Collection;Lorg/apache/tika/detect/EncodingDetector;Lorg/apache/tika/renderer/Renderer;)V

    return-void
.end method

.method private static getDefaultParsers(Lorg/apache/tika/config/ServiceLoader;Lorg/apache/tika/detect/EncodingDetector;Lorg/apache/tika/renderer/Renderer;Ljava/util/Collection;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/tika/config/ServiceLoader;",
            "Lorg/apache/tika/detect/EncodingDetector;",
            "Lorg/apache/tika/renderer/Renderer;",
            "Ljava/util/Collection<",
            "Ljava/lang/Class<",
            "+",
            "Lorg/apache/tika/parser/Parser;",
            ">;>;)",
            "Ljava/util/List<",
            "Lorg/apache/tika/parser/Parser;",
            ">;"
        }
    .end annotation

    .line 1
    const-class v0, Lorg/apache/tika/parser/Parser;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p3}, Lorg/apache/tika/config/ServiceLoader;->loadStaticServiceProviders(Ljava/lang/Class;Ljava/util/Collection;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lorg/apache/tika/parser/Parser;

    .line 24
    .line 25
    invoke-static {v0, p1}, Lorg/apache/tika/parser/DefaultParser;->setEncodingDetector(Lorg/apache/tika/parser/Parser;Lorg/apache/tika/detect/EncodingDetector;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    if-eqz p2, :cond_1

    .line 30
    .line 31
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result p3

    .line 39
    if-eqz p3, :cond_1

    .line 40
    .line 41
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p3

    .line 45
    check-cast p3, Lorg/apache/tika/parser/Parser;

    .line 46
    .line 47
    invoke-static {p3, p2}, Lorg/apache/tika/parser/DefaultParser;->setRenderer(Lorg/apache/tika/parser/Parser;Lorg/apache/tika/renderer/Renderer;)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    invoke-static {p0}, Lorg/apache/tika/utils/ServiceLoaderUtils;->sortLoadedClasses(Ljava/util/List;)V

    .line 52
    .line 53
    .line 54
    invoke-static {p0}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 55
    .line 56
    .line 57
    return-object p0
.end method

.method private static setEncodingDetector(Lorg/apache/tika/parser/Parser;Lorg/apache/tika/detect/EncodingDetector;)V
    .locals 1

    .line 1
    instance-of v0, p0, Lorg/apache/tika/parser/AbstractEncodingDetectorParser;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lorg/apache/tika/parser/AbstractEncodingDetectorParser;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lorg/apache/tika/parser/AbstractEncodingDetectorParser;->setEncodingDetector(Lorg/apache/tika/detect/EncodingDetector;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    instance-of v0, p0, Lorg/apache/tika/parser/CompositeParser;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    check-cast p0, Lorg/apache/tika/parser/CompositeParser;

    .line 16
    .line 17
    invoke-virtual {p0}, Lorg/apache/tika/parser/CompositeParser;->getAllComponentParsers()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lorg/apache/tika/parser/Parser;

    .line 36
    .line 37
    invoke-static {v0, p1}, Lorg/apache/tika/parser/DefaultParser;->setEncodingDetector(Lorg/apache/tika/parser/Parser;Lorg/apache/tika/detect/EncodingDetector;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    instance-of v0, p0, Lorg/apache/tika/parser/ParserDecorator;

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    check-cast p0, Lorg/apache/tika/parser/ParserDecorator;

    .line 46
    .line 47
    invoke-virtual {p0}, Lorg/apache/tika/parser/ParserDecorator;->getWrappedParser()Lorg/apache/tika/parser/Parser;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {p0, p1}, Lorg/apache/tika/parser/DefaultParser;->setEncodingDetector(Lorg/apache/tika/parser/Parser;Lorg/apache/tika/detect/EncodingDetector;)V

    .line 52
    .line 53
    .line 54
    :cond_2
    return-void
.end method

.method private static setRenderer(Lorg/apache/tika/parser/Parser;Lorg/apache/tika/renderer/Renderer;)V
    .locals 1

    .line 1
    instance-of v0, p0, Lorg/apache/tika/parser/RenderingParser;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lorg/apache/tika/parser/RenderingParser;

    .line 6
    .line 7
    invoke-interface {p0, p1}, Lorg/apache/tika/parser/RenderingParser;->setRenderer(Lorg/apache/tika/renderer/Renderer;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    instance-of v0, p0, Lorg/apache/tika/parser/CompositeParser;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    check-cast p0, Lorg/apache/tika/parser/CompositeParser;

    .line 16
    .line 17
    invoke-virtual {p0}, Lorg/apache/tika/parser/CompositeParser;->getAllComponentParsers()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lorg/apache/tika/parser/Parser;

    .line 36
    .line 37
    invoke-static {v0, p1}, Lorg/apache/tika/parser/DefaultParser;->setRenderer(Lorg/apache/tika/parser/Parser;Lorg/apache/tika/renderer/Renderer;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    instance-of v0, p0, Lorg/apache/tika/parser/ParserDecorator;

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    check-cast p0, Lorg/apache/tika/parser/ParserDecorator;

    .line 46
    .line 47
    invoke-virtual {p0}, Lorg/apache/tika/parser/ParserDecorator;->getWrappedParser()Lorg/apache/tika/parser/Parser;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {p0, p1}, Lorg/apache/tika/parser/DefaultParser;->setRenderer(Lorg/apache/tika/parser/Parser;Lorg/apache/tika/renderer/Renderer;)V

    .line 52
    .line 53
    .line 54
    :cond_2
    return-void
.end method


# virtual methods
.method public getAllComponentParsers()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/apache/tika/parser/Parser;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-super {p0}, Lorg/apache/tika/parser/CompositeParser;->getAllComponentParsers()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lorg/apache/tika/parser/DefaultParser;->loader:Lorg/apache/tika/config/ServiceLoader;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lorg/apache/tika/parser/DefaultParser;->loader:Lorg/apache/tika/config/ServiceLoader;

    .line 15
    .line 16
    const-class v2, Lorg/apache/tika/parser/Parser;

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Lorg/apache/tika/config/ServiceLoader;->loadDynamicServiceProviders(Ljava/lang/Class;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 23
    .line 24
    .line 25
    return-object v1

    .line 26
    :cond_0
    return-object v0
.end method

.method public getParsers(Lorg/apache/tika/parser/ParseContext;)Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/tika/parser/ParseContext;",
            ")",
            "Ljava/util/Map<",
            "Lorg/apache/tika/mime/MediaType;",
            "Lorg/apache/tika/parser/Parser;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-super {p0, p1}, Lorg/apache/tika/parser/CompositeParser;->getParsers(Lorg/apache/tika/parser/ParseContext;)Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lorg/apache/tika/parser/DefaultParser;->loader:Lorg/apache/tika/config/ServiceLoader;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Lorg/apache/tika/parser/CompositeParser;->getMediaTypeRegistry()Lorg/apache/tika/mime/MediaTypeRegistry;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Lorg/apache/tika/parser/DefaultParser;->loader:Lorg/apache/tika/config/ServiceLoader;

    .line 14
    .line 15
    const-class v3, Lorg/apache/tika/parser/Parser;

    .line 16
    .line 17
    invoke-virtual {v2, v3}, Lorg/apache/tika/config/ServiceLoader;->loadDynamicServiceProviders(Ljava/lang/Class;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {v2}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Lorg/apache/tika/parser/Parser;

    .line 39
    .line 40
    invoke-interface {v3, p1}, Lorg/apache/tika/parser/Parser;->getSupportedTypes(Lorg/apache/tika/parser/ParseContext;)Ljava/util/Set;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-eqz v5, :cond_0

    .line 53
    .line 54
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    check-cast v5, Lorg/apache/tika/mime/MediaType;

    .line 59
    .line 60
    invoke-virtual {v1, v5}, Lorg/apache/tika/mime/MediaTypeRegistry;->normalize(Lorg/apache/tika/mime/MediaType;)Lorg/apache/tika/mime/MediaType;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    invoke-interface {v0, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    return-object v0
.end method

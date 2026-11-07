.class Lorg/apache/tika/config/TikaConfig$DetectorXmlLoader;
.super Lorg/apache/tika/config/TikaConfig$XmlLoader;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/tika/config/TikaConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DetectorXmlLoader"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/apache/tika/config/TikaConfig$XmlLoader<",
        "Lorg/apache/tika/detect/CompositeDetector;",
        "Lorg/apache/tika/detect/Detector;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lorg/apache/tika/config/TikaConfig$XmlLoader;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/apache/tika/config/TikaConfig$DetectorXmlLoader;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic createComposite(Ljava/lang/Class;Ljava/util/List;Ljava/util/Set;Ljava/util/Map;Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p6}, Lorg/apache/tika/config/TikaConfig$DetectorXmlLoader;->createComposite(Ljava/lang/Class;Ljava/util/List;Ljava/util/Set;Ljava/util/Map;Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;)Lorg/apache/tika/detect/Detector;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic createComposite(Ljava/util/List;Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lorg/apache/tika/config/TikaConfig$DetectorXmlLoader;->createComposite(Ljava/util/List;Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;)Lorg/apache/tika/detect/CompositeDetector;

    move-result-object p1

    return-object p1
.end method

.method public createComposite(Ljava/util/List;Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;)Lorg/apache/tika/detect/CompositeDetector;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lorg/apache/tika/detect/Detector;",
            ">;",
            "Lorg/apache/tika/mime/MimeTypes;",
            "Lorg/apache/tika/config/ServiceLoader;",
            ")",
            "Lorg/apache/tika/detect/CompositeDetector;"
        }
    .end annotation

    .line 3
    invoke-virtual {p2}, Lorg/apache/tika/mime/MimeTypes;->getMediaTypeRegistry()Lorg/apache/tika/mime/MediaTypeRegistry;

    move-result-object p2

    .line 4
    new-instance p3, Lorg/apache/tika/detect/CompositeDetector;

    invoke-direct {p3, p2, p1}, Lorg/apache/tika/detect/CompositeDetector;-><init>(Lorg/apache/tika/mime/MediaTypeRegistry;Ljava/util/List;)V

    return-object p3
.end method

.method public createComposite(Ljava/lang/Class;Ljava/util/List;Ljava/util/Set;Ljava/util/Map;Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;)Lorg/apache/tika/detect/Detector;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lorg/apache/tika/detect/Detector;",
            ">;",
            "Ljava/util/List<",
            "Lorg/apache/tika/detect/Detector;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Lorg/apache/tika/detect/Detector;",
            ">;>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lorg/apache/tika/config/Param;",
            ">;",
            "Lorg/apache/tika/mime/MimeTypes;",
            "Lorg/apache/tika/config/ServiceLoader;",
            ")",
            "Lorg/apache/tika/detect/Detector;"
        }
    .end annotation

    .line 5
    const-class p4, Ljava/util/Collection;

    .line 6
    invoke-virtual {p5}, Lorg/apache/tika/mime/MimeTypes;->getMediaTypeRegistry()Lorg/apache/tika/mime/MediaTypeRegistry;

    move-result-object v0

    .line 7
    :try_start_0
    const-class v1, Lorg/apache/tika/mime/MimeTypes;

    const-class v2, Lorg/apache/tika/config/ServiceLoader;

    filled-new-array {v1, v2, p4}, [Ljava/lang/Class;

    move-result-object v1

    .line 8
    invoke-virtual {p1, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    .line 9
    filled-new-array {p5, p6, p3}, [Ljava/lang/Object;

    move-result-object p5

    invoke-virtual {v1, p5}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Lorg/apache/tika/detect/Detector;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p5, 0x0

    .line 10
    :goto_0
    const-class p6, Lorg/apache/tika/mime/MediaTypeRegistry;

    const-class v1, Ljava/util/List;

    if-nez p5, :cond_0

    .line 11
    :try_start_1
    filled-new-array {p6, v1, p4}, [Ljava/lang/Class;

    move-result-object p4

    .line 12
    invoke-virtual {p1, p4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p4

    .line 13
    filled-new-array {v0, p2, p3}, [Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p4, p3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lorg/apache/tika/detect/Detector;
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    move-object p5, p3

    :catch_1
    :cond_0
    if-nez p5, :cond_1

    .line 14
    :try_start_2
    filled-new-array {p6, v1}, [Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p3

    .line 15
    filled-new-array {v0, p2}, [Ljava/lang/Object;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lorg/apache/tika/detect/Detector;
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_2

    move-object p5, p3

    :catch_2
    :cond_1
    if-nez p5, :cond_2

    .line 16
    :try_start_3
    filled-new-array {v1}, [Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    .line 17
    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/apache/tika/detect/Detector;
    :try_end_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_3 .. :try_end_3} :catch_3

    move-object p5, p1

    :catch_3
    :cond_2
    return-object p5
.end method

.method public bridge synthetic createDefault(Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lorg/apache/tika/config/TikaConfig$DetectorXmlLoader;->createDefault(Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;)Lorg/apache/tika/detect/CompositeDetector;

    move-result-object p1

    return-object p1
.end method

.method public createDefault(Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;)Lorg/apache/tika/detect/CompositeDetector;
    .locals 0

    .line 2
    invoke-static {p1, p2}, Lorg/apache/tika/config/TikaConfig;->getDefaultDetector(Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;)Lorg/apache/tika/detect/CompositeDetector;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic decorate(Ljava/lang/Object;Lorg/w3c/dom/Element;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lorg/apache/tika/detect/Detector;

    invoke-virtual {p0, p1, p2}, Lorg/apache/tika/config/TikaConfig$DetectorXmlLoader;->decorate(Lorg/apache/tika/detect/Detector;Lorg/w3c/dom/Element;)Lorg/apache/tika/detect/Detector;

    move-result-object p1

    return-object p1
.end method

.method public decorate(Lorg/apache/tika/detect/Detector;Lorg/w3c/dom/Element;)Lorg/apache/tika/detect/Detector;
    .locals 0

    .line 1
    return-object p1
.end method

.method public getLoaderClass()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+",
            "Lorg/apache/tika/detect/Detector;",
            ">;"
        }
    .end annotation

    .line 1
    const-class v0, Lorg/apache/tika/detect/Detector;

    .line 2
    .line 3
    return-object v0
.end method

.method public getLoaderTagName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "detector"

    .line 2
    .line 3
    return-object v0
.end method

.method public getParentTagName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "detectors"

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
            "Lorg/apache/tika/detect/Detector;",
            ">;)Z"
        }
    .end annotation

    .line 3
    const-class v0, Lorg/apache/tika/detect/CompositeDetector;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic isComposite(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lorg/apache/tika/detect/Detector;

    invoke-virtual {p0, p1}, Lorg/apache/tika/config/TikaConfig$DetectorXmlLoader;->isComposite(Lorg/apache/tika/detect/Detector;)Z

    move-result p1

    return p1
.end method

.method public isComposite(Lorg/apache/tika/detect/Detector;)Z
    .locals 0

    .line 2
    instance-of p1, p1, Lorg/apache/tika/detect/CompositeDetector;

    return p1
.end method

.method public bridge synthetic preLoadOne(Ljava/lang/Class;Ljava/lang/String;Lorg/apache/tika/mime/MimeTypes;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lorg/apache/tika/config/TikaConfig$DetectorXmlLoader;->preLoadOne(Ljava/lang/Class;Ljava/lang/String;Lorg/apache/tika/mime/MimeTypes;)Lorg/apache/tika/detect/Detector;

    move-result-object p1

    return-object p1
.end method

.method public preLoadOne(Ljava/lang/Class;Ljava/lang/String;Lorg/apache/tika/mime/MimeTypes;)Lorg/apache/tika/detect/Detector;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lorg/apache/tika/detect/Detector;",
            ">;",
            "Ljava/lang/String;",
            "Lorg/apache/tika/mime/MimeTypes;",
            ")",
            "Lorg/apache/tika/detect/Detector;"
        }
    .end annotation

    .line 2
    const-class p2, Lorg/apache/tika/mime/MimeTypes;

    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-object p3

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public supportsComposite()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

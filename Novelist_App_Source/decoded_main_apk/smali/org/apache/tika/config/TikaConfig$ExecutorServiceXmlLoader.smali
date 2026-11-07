.class Lorg/apache/tika/config/TikaConfig$ExecutorServiceXmlLoader;
.super Lorg/apache/tika/config/TikaConfig$XmlLoader;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/tika/config/TikaConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ExecutorServiceXmlLoader"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/apache/tika/config/TikaConfig$XmlLoader<",
        "Lorg/apache/tika/concurrent/ConfigurableThreadPoolExecutor;",
        "Lorg/apache/tika/concurrent/ConfigurableThreadPoolExecutor;",
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
    invoke-direct {p0}, Lorg/apache/tika/config/TikaConfig$ExecutorServiceXmlLoader;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic createComposite(Ljava/lang/Class;Ljava/util/List;Ljava/util/Set;Ljava/util/Map;Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p6}, Lorg/apache/tika/config/TikaConfig$ExecutorServiceXmlLoader;->createComposite(Ljava/lang/Class;Ljava/util/List;Ljava/util/Set;Ljava/util/Map;Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;)Lorg/apache/tika/concurrent/ConfigurableThreadPoolExecutor;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic createComposite(Ljava/util/List;Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lorg/apache/tika/config/TikaConfig$ExecutorServiceXmlLoader;->createComposite(Ljava/util/List;Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;)Lorg/apache/tika/concurrent/ConfigurableThreadPoolExecutor;

    move-result-object p1

    return-object p1
.end method

.method public createComposite(Ljava/lang/Class;Ljava/util/List;Ljava/util/Set;Ljava/util/Map;Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;)Lorg/apache/tika/concurrent/ConfigurableThreadPoolExecutor;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lorg/apache/tika/concurrent/ConfigurableThreadPoolExecutor;",
            ">;",
            "Ljava/util/List<",
            "Lorg/apache/tika/concurrent/ConfigurableThreadPoolExecutor;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Lorg/apache/tika/concurrent/ConfigurableThreadPoolExecutor;",
            ">;>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lorg/apache/tika/config/Param;",
            ">;",
            "Lorg/apache/tika/mime/MimeTypes;",
            "Lorg/apache/tika/config/ServiceLoader;",
            ")",
            "Lorg/apache/tika/concurrent/ConfigurableThreadPoolExecutor;"
        }
    .end annotation

    .line 3
    new-instance p1, Ljava/lang/InstantiationException;

    const-string p2, "Only one executor service supported"

    invoke-direct {p1, p2}, Ljava/lang/InstantiationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public createComposite(Ljava/util/List;Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;)Lorg/apache/tika/concurrent/ConfigurableThreadPoolExecutor;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lorg/apache/tika/concurrent/ConfigurableThreadPoolExecutor;",
            ">;",
            "Lorg/apache/tika/mime/MimeTypes;",
            "Lorg/apache/tika/config/ServiceLoader;",
            ")",
            "Lorg/apache/tika/concurrent/ConfigurableThreadPoolExecutor;"
        }
    .end annotation

    const/4 p2, 0x0

    .line 4
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/apache/tika/concurrent/ConfigurableThreadPoolExecutor;

    return-object p1
.end method

.method public bridge synthetic createDefault(Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lorg/apache/tika/config/TikaConfig$ExecutorServiceXmlLoader;->createDefault(Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;)Lorg/apache/tika/concurrent/ConfigurableThreadPoolExecutor;

    move-result-object p1

    return-object p1
.end method

.method public createDefault(Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;)Lorg/apache/tika/concurrent/ConfigurableThreadPoolExecutor;
    .locals 0

    .line 2
    invoke-static {}, Lorg/apache/tika/config/TikaConfig;->c()Lorg/apache/tika/concurrent/ConfigurableThreadPoolExecutor;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic decorate(Ljava/lang/Object;Lorg/w3c/dom/Element;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lorg/apache/tika/concurrent/ConfigurableThreadPoolExecutor;

    invoke-virtual {p0, p1, p2}, Lorg/apache/tika/config/TikaConfig$ExecutorServiceXmlLoader;->decorate(Lorg/apache/tika/concurrent/ConfigurableThreadPoolExecutor;Lorg/w3c/dom/Element;)Lorg/apache/tika/concurrent/ConfigurableThreadPoolExecutor;

    move-result-object p1

    return-object p1
.end method

.method public decorate(Lorg/apache/tika/concurrent/ConfigurableThreadPoolExecutor;Lorg/w3c/dom/Element;)Lorg/apache/tika/concurrent/ConfigurableThreadPoolExecutor;
    .locals 1

    .line 2
    const-string v0, "max-threads"

    invoke-static {p2, v0}, Lorg/apache/tika/config/TikaConfig;->b(Lorg/w3c/dom/Element;Ljava/lang/String;)Lorg/w3c/dom/Element;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-static {v0}, Lorg/apache/tika/config/TikaConfig;->g(Lorg/w3c/dom/Element;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Lorg/apache/tika/concurrent/ConfigurableThreadPoolExecutor;->setMaximumPoolSize(I)V

    .line 4
    :cond_0
    const-string v0, "core-threads"

    invoke-static {p2, v0}, Lorg/apache/tika/config/TikaConfig;->b(Lorg/w3c/dom/Element;Ljava/lang/String;)Lorg/w3c/dom/Element;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 5
    invoke-static {p2}, Lorg/apache/tika/config/TikaConfig;->g(Lorg/w3c/dom/Element;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p2

    invoke-interface {p1, p2}, Lorg/apache/tika/concurrent/ConfigurableThreadPoolExecutor;->setCorePoolSize(I)V

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
            "Lorg/apache/tika/concurrent/ConfigurableThreadPoolExecutor;",
            ">;"
        }
    .end annotation

    .line 1
    const-class v0, Lorg/apache/tika/concurrent/ConfigurableThreadPoolExecutor;

    .line 2
    .line 3
    return-object v0
.end method

.method public getLoaderTagName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "executor-service"

    .line 2
    .line 3
    return-object v0
.end method

.method public getParentTagName()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public isComposite(Ljava/lang/Class;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lorg/apache/tika/concurrent/ConfigurableThreadPoolExecutor;",
            ">;)Z"
        }
    .end annotation

    .line 1
    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic isComposite(Ljava/lang/Object;)Z
    .locals 0

    .line 3
    check-cast p1, Lorg/apache/tika/concurrent/ConfigurableThreadPoolExecutor;

    invoke-virtual {p0, p1}, Lorg/apache/tika/config/TikaConfig$ExecutorServiceXmlLoader;->isComposite(Lorg/apache/tika/concurrent/ConfigurableThreadPoolExecutor;)Z

    move-result p1

    return p1
.end method

.method public isComposite(Lorg/apache/tika/concurrent/ConfigurableThreadPoolExecutor;)Z
    .locals 0

    .line 2
    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic loadOne(Lorg/w3c/dom/Element;Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lorg/apache/tika/config/TikaConfig$ExecutorServiceXmlLoader;->loadOne(Lorg/w3c/dom/Element;Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;)Lorg/apache/tika/concurrent/ConfigurableThreadPoolExecutor;

    move-result-object p1

    return-object p1
.end method

.method public loadOne(Lorg/w3c/dom/Element;Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;)Lorg/apache/tika/concurrent/ConfigurableThreadPoolExecutor;
    .locals 0

    .line 2
    invoke-super {p0, p1, p2, p3}, Lorg/apache/tika/config/TikaConfig$XmlLoader;->loadOne(Lorg/w3c/dom/Element;Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/apache/tika/concurrent/ConfigurableThreadPoolExecutor;

    return-object p1
.end method

.method public bridge synthetic preLoadOne(Ljava/lang/Class;Ljava/lang/String;Lorg/apache/tika/mime/MimeTypes;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lorg/apache/tika/config/TikaConfig$ExecutorServiceXmlLoader;->preLoadOne(Ljava/lang/Class;Ljava/lang/String;Lorg/apache/tika/mime/MimeTypes;)Lorg/apache/tika/concurrent/ConfigurableThreadPoolExecutor;

    move-result-object p1

    return-object p1
.end method

.method public preLoadOne(Ljava/lang/Class;Ljava/lang/String;Lorg/apache/tika/mime/MimeTypes;)Lorg/apache/tika/concurrent/ConfigurableThreadPoolExecutor;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lorg/apache/tika/concurrent/ConfigurableThreadPoolExecutor;",
            ">;",
            "Ljava/lang/String;",
            "Lorg/apache/tika/mime/MimeTypes;",
            ")",
            "Lorg/apache/tika/concurrent/ConfigurableThreadPoolExecutor;"
        }
    .end annotation

    .line 1
    const/4 p1, 0x0

    return-object p1
.end method

.method public supportsComposite()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

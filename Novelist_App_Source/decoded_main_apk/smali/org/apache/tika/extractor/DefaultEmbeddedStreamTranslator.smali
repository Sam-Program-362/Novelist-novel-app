.class public Lorg/apache/tika/extractor/DefaultEmbeddedStreamTranslator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/apache/tika/extractor/EmbeddedStreamTranslator;


# instance fields
.field final translators:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/apache/tika/extractor/EmbeddedStreamTranslator;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/tika/config/ServiceLoader;

    invoke-direct {v0}, Lorg/apache/tika/config/ServiceLoader;-><init>()V

    invoke-static {v0}, Lorg/apache/tika/extractor/DefaultEmbeddedStreamTranslator;->getDefaultFilters(Lorg/apache/tika/config/ServiceLoader;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/apache/tika/extractor/DefaultEmbeddedStreamTranslator;-><init>(Ljava/util/List;)V

    return-void
.end method

.method private constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lorg/apache/tika/extractor/EmbeddedStreamTranslator;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lorg/apache/tika/extractor/DefaultEmbeddedStreamTranslator;->translators:Ljava/util/List;

    return-void
.end method

.method private static getDefaultFilters(Lorg/apache/tika/config/ServiceLoader;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/tika/config/ServiceLoader;",
            ")",
            "Ljava/util/List<",
            "Lorg/apache/tika/extractor/EmbeddedStreamTranslator;",
            ">;"
        }
    .end annotation

    .line 1
    const-class v0, Lorg/apache/tika/extractor/EmbeddedStreamTranslator;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lorg/apache/tika/config/ServiceLoader;->loadServiceProviders(Ljava/lang/Class;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Lorg/apache/tika/utils/ServiceLoaderUtils;->sortLoadedClasses(Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method


# virtual methods
.method public shouldTranslate(Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/tika/extractor/DefaultEmbeddedStreamTranslator;->translators:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lorg/apache/tika/extractor/EmbeddedStreamTranslator;

    .line 18
    .line 19
    invoke-interface {v1, p1, p2}, Lorg/apache/tika/extractor/EmbeddedStreamTranslator;->shouldTranslate(Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    return p1

    .line 27
    :cond_1
    const/4 p1, 0x0

    .line 28
    return p1
.end method

.method public translate(Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;)Ljava/io/InputStream;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/tika/extractor/DefaultEmbeddedStreamTranslator;->translators:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lorg/apache/tika/extractor/EmbeddedStreamTranslator;

    .line 18
    .line 19
    invoke-interface {v1, p1, p2}, Lorg/apache/tika/extractor/EmbeddedStreamTranslator;->translate(Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;)Ljava/io/InputStream;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    return-object v1

    .line 26
    :cond_1
    return-object p1
.end method

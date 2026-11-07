.class public Lorg/apache/tika/metadata/filter/DefaultMetadataFilter;
.super Lorg/apache/tika/metadata/filter/CompositeMetadataFilter;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 3
    new-instance v0, Lorg/apache/tika/config/ServiceLoader;

    invoke-direct {v0}, Lorg/apache/tika/config/ServiceLoader;-><init>()V

    invoke-direct {p0, v0}, Lorg/apache/tika/metadata/filter/DefaultMetadataFilter;-><init>(Lorg/apache/tika/config/ServiceLoader;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lorg/apache/tika/metadata/filter/MetadataFilter;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1}, Lorg/apache/tika/metadata/filter/CompositeMetadataFilter;-><init>(Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Lorg/apache/tika/config/ServiceLoader;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lorg/apache/tika/metadata/filter/DefaultMetadataFilter;->getDefaultFilters(Lorg/apache/tika/config/ServiceLoader;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/apache/tika/metadata/filter/CompositeMetadataFilter;-><init>(Ljava/util/List;)V

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
            "Lorg/apache/tika/metadata/filter/MetadataFilter;",
            ">;"
        }
    .end annotation

    .line 1
    const-class v0, Lorg/apache/tika/metadata/filter/MetadataFilter;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lorg/apache/tika/config/ServiceLoader;->loadStaticServiceProviders(Ljava/lang/Class;)Ljava/util/List;

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

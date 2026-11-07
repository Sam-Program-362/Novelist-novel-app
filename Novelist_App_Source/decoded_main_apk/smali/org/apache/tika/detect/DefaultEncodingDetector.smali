.class public Lorg/apache/tika/detect/DefaultEncodingDetector;
.super Lorg/apache/tika/detect/CompositeEncodingDetector;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/apache/tika/config/ServiceLoader;

    const-class v1, Lorg/apache/tika/detect/DefaultEncodingDetector;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/apache/tika/config/ServiceLoader;-><init>(Ljava/lang/ClassLoader;)V

    invoke-direct {p0, v0}, Lorg/apache/tika/detect/DefaultEncodingDetector;-><init>(Lorg/apache/tika/config/ServiceLoader;)V

    return-void
.end method

.method public constructor <init>(Lorg/apache/tika/config/ServiceLoader;)V
    .locals 1

    .line 2
    const-class v0, Lorg/apache/tika/detect/EncodingDetector;

    invoke-virtual {p1, v0}, Lorg/apache/tika/config/ServiceLoader;->loadServiceProviders(Ljava/lang/Class;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/apache/tika/detect/CompositeEncodingDetector;-><init>(Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Lorg/apache/tika/config/ServiceLoader;Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/tika/config/ServiceLoader;",
            "Ljava/util/Collection<",
            "Ljava/lang/Class<",
            "+",
            "Lorg/apache/tika/detect/EncodingDetector;",
            ">;>;)V"
        }
    .end annotation

    .line 3
    const-class v0, Lorg/apache/tika/detect/EncodingDetector;

    invoke-virtual {p1, v0}, Lorg/apache/tika/config/ServiceLoader;->loadServiceProviders(Ljava/lang/Class;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lorg/apache/tika/detect/CompositeEncodingDetector;-><init>(Ljava/util/List;Ljava/util/Collection;)V

    return-void
.end method

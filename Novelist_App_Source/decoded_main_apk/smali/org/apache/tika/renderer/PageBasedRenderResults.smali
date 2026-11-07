.class public Lorg/apache/tika/renderer/PageBasedRenderResults;
.super Lorg/apache/tika/renderer/RenderResults;
.source "SourceFile"


# instance fields
.field results:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Lorg/apache/tika/renderer/RenderResult;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lorg/apache/tika/io/TemporaryResources;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lorg/apache/tika/renderer/RenderResults;-><init>(Lorg/apache/tika/io/TemporaryResources;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lorg/apache/tika/renderer/PageBasedRenderResults;->results:Ljava/util/Map;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public add(Lorg/apache/tika/renderer/RenderResult;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lorg/apache/tika/renderer/RenderResult;->getMetadata()Lorg/apache/tika/metadata/Metadata;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lorg/apache/tika/metadata/TikaPagedText;->PAGE_NUMBER:Lorg/apache/tika/metadata/Property;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lorg/apache/tika/metadata/Metadata;->getInt(Lorg/apache/tika/metadata/Property;)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v1, p0, Lorg/apache/tika/renderer/PageBasedRenderResults;->results:Ljava/util/Map;

    .line 14
    .line 15
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ljava/util/List;

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    new-instance v1, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iget-object v2, p0, Lorg/apache/tika/renderer/PageBasedRenderResults;->results:Ljava/util/Map;

    .line 29
    .line 30
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-super {p0, p1}, Lorg/apache/tika/renderer/RenderResults;->add(Lorg/apache/tika/renderer/RenderResult;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public getPage(I)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lorg/apache/tika/renderer/RenderResult;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/apache/tika/renderer/PageBasedRenderResults;->results:Ljava/util/Map;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/util/List;

    .line 12
    .line 13
    return-object p1
.end method

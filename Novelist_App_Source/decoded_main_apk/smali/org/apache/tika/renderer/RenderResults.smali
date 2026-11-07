.class public Lorg/apache/tika/renderer/RenderResults;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field private results:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/apache/tika/renderer/RenderResult;",
            ">;"
        }
    .end annotation
.end field

.field private final tmp:Lorg/apache/tika/io/TemporaryResources;


# direct methods
.method public constructor <init>(Lorg/apache/tika/io/TemporaryResources;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lorg/apache/tika/renderer/RenderResults;->results:Ljava/util/List;

    .line 10
    .line 11
    iput-object p1, p0, Lorg/apache/tika/renderer/RenderResults;->tmp:Lorg/apache/tika/io/TemporaryResources;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public add(Lorg/apache/tika/renderer/RenderResult;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/renderer/RenderResults;->tmp:Lorg/apache/tika/io/TemporaryResources;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lorg/apache/tika/io/TemporaryResources;->addResource(Ljava/io/Closeable;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lorg/apache/tika/renderer/RenderResults;->results:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/renderer/RenderResults;->tmp:Lorg/apache/tika/io/TemporaryResources;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/apache/tika/io/TemporaryResources;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public getResults()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/apache/tika/renderer/RenderResult;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/apache/tika/renderer/RenderResults;->results:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.class Lorg/apache/tika/pipes/PipesServer$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/apache/tika/extractor/DocumentSelector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/tika/pipes/PipesServer;->parseConcatenated(Lorg/apache/tika/pipes/FetchEmitTuple;Lorg/apache/tika/pipes/HandlerConfig;Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field embedded:I

.field final maxEmbedded:I

.field final synthetic this$0:Lorg/apache/tika/pipes/PipesServer;

.field final synthetic val$handlerConfig:Lorg/apache/tika/pipes/HandlerConfig;


# direct methods
.method public constructor <init>(Lorg/apache/tika/pipes/PipesServer;Lorg/apache/tika/pipes/HandlerConfig;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/tika/pipes/PipesServer$1;->this$0:Lorg/apache/tika/pipes/PipesServer;

    .line 2
    .line 3
    iput-object p2, p0, Lorg/apache/tika/pipes/PipesServer$1;->val$handlerConfig:Lorg/apache/tika/pipes/HandlerConfig;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iget p1, p2, Lorg/apache/tika/pipes/HandlerConfig;->maxEmbeddedResources:I

    .line 9
    .line 10
    iput p1, p0, Lorg/apache/tika/pipes/PipesServer$1;->maxEmbedded:I

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iput p1, p0, Lorg/apache/tika/pipes/PipesServer$1;->embedded:I

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public select(Lorg/apache/tika/metadata/Metadata;)Z
    .locals 3

    .line 1
    iget p1, p0, Lorg/apache/tika/pipes/PipesServer$1;->maxEmbedded:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-gez p1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    iget v1, p0, Lorg/apache/tika/pipes/PipesServer$1;->embedded:I

    .line 8
    .line 9
    add-int/lit8 v2, v1, 0x1

    .line 10
    .line 11
    iput v2, p0, Lorg/apache/tika/pipes/PipesServer$1;->embedded:I

    .line 12
    .line 13
    if-ge v1, p1, :cond_1

    .line 14
    .line 15
    return v0

    .line 16
    :cond_1
    const/4 p1, 0x0

    .line 17
    return p1
.end method

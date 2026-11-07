.class public final synthetic Lorg/apache/tika/pipes/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic k:Lorg/apache/tika/pipes/PipesClient;

.field public final synthetic l:Lorg/apache/tika/pipes/FetchEmitTuple;

.field public final synthetic m:J

.field public final synthetic n:[Lorg/apache/tika/pipes/PipesResult;


# direct methods
.method public synthetic constructor <init>(Lorg/apache/tika/pipes/PipesClient;Lorg/apache/tika/pipes/FetchEmitTuple;J[Lorg/apache/tika/pipes/PipesResult;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/apache/tika/pipes/a;->k:Lorg/apache/tika/pipes/PipesClient;

    iput-object p2, p0, Lorg/apache/tika/pipes/a;->l:Lorg/apache/tika/pipes/FetchEmitTuple;

    iput-wide p3, p0, Lorg/apache/tika/pipes/a;->m:J

    iput-object p5, p0, Lorg/apache/tika/pipes/a;->n:[Lorg/apache/tika/pipes/PipesResult;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-wide v0, p0, Lorg/apache/tika/pipes/a;->m:J

    iget-object v2, p0, Lorg/apache/tika/pipes/a;->n:[Lorg/apache/tika/pipes/PipesResult;

    iget-object v3, p0, Lorg/apache/tika/pipes/a;->k:Lorg/apache/tika/pipes/PipesClient;

    iget-object v4, p0, Lorg/apache/tika/pipes/a;->l:Lorg/apache/tika/pipes/FetchEmitTuple;

    invoke-static {v3, v4, v0, v1, v2}, Lorg/apache/tika/pipes/PipesClient;->b(Lorg/apache/tika/pipes/PipesClient;Lorg/apache/tika/pipes/FetchEmitTuple;J[Lorg/apache/tika/pipes/PipesResult;)Lorg/apache/tika/pipes/PipesResult;

    move-result-object v0

    return-object v0
.end method

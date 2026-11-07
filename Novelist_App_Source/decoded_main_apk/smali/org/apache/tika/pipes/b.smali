.class public final synthetic Lorg/apache/tika/pipes/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic k:Lorg/apache/tika/pipes/PipesClient;

.field public final synthetic l:Lx2/c;


# direct methods
.method public synthetic constructor <init>(Lorg/apache/tika/pipes/PipesClient;Lx2/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/apache/tika/pipes/b;->k:Lorg/apache/tika/pipes/PipesClient;

    iput-object p2, p0, Lorg/apache/tika/pipes/b;->l:Lx2/c;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/b;->k:Lorg/apache/tika/pipes/PipesClient;

    iget-object v1, p0, Lorg/apache/tika/pipes/b;->l:Lx2/c;

    invoke-static {v0, v1}, Lorg/apache/tika/pipes/PipesClient;->a(Lorg/apache/tika/pipes/PipesClient;Lx2/c;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

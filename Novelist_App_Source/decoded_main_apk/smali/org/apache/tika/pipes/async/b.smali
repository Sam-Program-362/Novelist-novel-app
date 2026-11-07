.class public final synthetic Lorg/apache/tika/pipes/async/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic k:Lorg/apache/tika/pipes/async/AsyncProcessor;


# direct methods
.method public synthetic constructor <init>(Lorg/apache/tika/pipes/async/AsyncProcessor;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/apache/tika/pipes/async/b;->k:Lorg/apache/tika/pipes/async/AsyncProcessor;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/async/b;->k:Lorg/apache/tika/pipes/async/AsyncProcessor;

    invoke-static {v0}, Lorg/apache/tika/pipes/async/AsyncProcessor;->b(Lorg/apache/tika/pipes/async/AsyncProcessor;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

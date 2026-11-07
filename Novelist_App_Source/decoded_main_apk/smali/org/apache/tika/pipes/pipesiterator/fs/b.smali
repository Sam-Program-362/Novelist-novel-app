.class public final synthetic Lorg/apache/tika/pipes/pipesiterator/fs/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lorg/apache/tika/pipes/pipesiterator/fs/FileSystemPipesIterator$FileCountWorker;


# direct methods
.method public synthetic constructor <init>(Lorg/apache/tika/pipes/pipesiterator/fs/FileSystemPipesIterator$FileCountWorker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/apache/tika/pipes/pipesiterator/fs/b;->k:Lorg/apache/tika/pipes/pipesiterator/fs/FileSystemPipesIterator$FileCountWorker;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/pipesiterator/fs/b;->k:Lorg/apache/tika/pipes/pipesiterator/fs/FileSystemPipesIterator$FileCountWorker;

    invoke-static {v0}, Lorg/apache/tika/pipes/pipesiterator/fs/FileSystemPipesIterator$FileCountWorker;->a(Lorg/apache/tika/pipes/pipesiterator/fs/FileSystemPipesIterator$FileCountWorker;)V

    return-void
.end method

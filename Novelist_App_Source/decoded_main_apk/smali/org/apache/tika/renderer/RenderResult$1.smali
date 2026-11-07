.class Lorg/apache/tika/renderer/RenderResult$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/tika/renderer/RenderResult;-><init>(Lorg/apache/tika/renderer/RenderResult$STATUS;ILjava/lang/Object;Lorg/apache/tika/metadata/Metadata;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/tika/renderer/RenderResult;

.field final synthetic val$result:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lorg/apache/tika/renderer/RenderResult;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/tika/renderer/RenderResult$1;->this$0:Lorg/apache/tika/renderer/RenderResult;

    .line 2
    .line 3
    iput-object p2, p0, Lorg/apache/tika/renderer/RenderResult$1;->val$result:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/renderer/RenderResult$1;->val$result:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {v0}, Lorg/apache/tika/fork/a;->g(Ljava/lang/Object;)Ljava/nio/file/Path;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lorg/apache/tika/fork/a;->t(Ljava/nio/file/Path;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

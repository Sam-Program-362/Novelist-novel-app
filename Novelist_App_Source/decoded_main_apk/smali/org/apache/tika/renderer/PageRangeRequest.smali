.class public Lorg/apache/tika/renderer/PageRangeRequest;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/apache/tika/renderer/RenderRequest;


# static fields
.field public static RENDER_ALL:Lorg/apache/tika/renderer/PageRangeRequest;


# instance fields
.field private final from:I

.field private final to:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lorg/apache/tika/renderer/PageRangeRequest;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, -0x1

    .line 5
    invoke-direct {v0, v1, v2}, Lorg/apache/tika/renderer/PageRangeRequest;-><init>(II)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lorg/apache/tika/renderer/PageRangeRequest;->RENDER_ALL:Lorg/apache/tika/renderer/PageRangeRequest;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lorg/apache/tika/renderer/PageRangeRequest;->from:I

    .line 5
    .line 6
    iput p2, p0, Lorg/apache/tika/renderer/PageRangeRequest;->to:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    if-eq v2, v3, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    check-cast p1, Lorg/apache/tika/renderer/PageRangeRequest;

    .line 20
    .line 21
    iget v2, p0, Lorg/apache/tika/renderer/PageRangeRequest;->from:I

    .line 22
    .line 23
    iget v3, p1, Lorg/apache/tika/renderer/PageRangeRequest;->from:I

    .line 24
    .line 25
    if-ne v2, v3, :cond_2

    .line 26
    .line 27
    iget v2, p0, Lorg/apache/tika/renderer/PageRangeRequest;->to:I

    .line 28
    .line 29
    iget p1, p1, Lorg/apache/tika/renderer/PageRangeRequest;->to:I

    .line 30
    .line 31
    if-ne v2, p1, :cond_2

    .line 32
    .line 33
    return v0

    .line 34
    :cond_2
    :goto_0
    return v1
.end method

.method public getFrom()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/tika/renderer/PageRangeRequest;->from:I

    .line 2
    .line 3
    return v0
.end method

.method public getTo()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/tika/renderer/PageRangeRequest;->to:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lorg/apache/tika/renderer/PageRangeRequest;->from:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, Lorg/apache/tika/renderer/PageRangeRequest;->to:I

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    return v0
.end method

.class public Lorg/apache/tika/pipes/async/OfferLargerThanQueueSize;
.super Ljava/lang/IllegalArgumentException;
.source "SourceFile"


# instance fields
.field private final queueSize:I

.field private final sizeOffered:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lorg/apache/tika/pipes/async/OfferLargerThanQueueSize;->sizeOffered:I

    .line 5
    .line 6
    iput p2, p0, Lorg/apache/tika/pipes/async/OfferLargerThanQueueSize;->queueSize:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public getMessage()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Lorg/apache/tika/pipes/async/OfferLargerThanQueueSize;->sizeOffered:I

    .line 2
    .line 3
    iget v1, p0, Lorg/apache/tika/pipes/async/OfferLargerThanQueueSize;->queueSize:I

    .line 4
    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v3, "sizeOffered ("

    .line 8
    .line 9
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v0, ") is greater than queue size ("

    .line 16
    .line 17
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v0, ")"

    .line 24
    .line 25
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0
.end method

.method public getQueueSize()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/tika/pipes/async/OfferLargerThanQueueSize;->queueSize:I

    .line 2
    .line 3
    return v0
.end method

.method public getSizeOffered()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/tika/pipes/async/OfferLargerThanQueueSize;->sizeOffered:I

    .line 2
    .line 3
    return v0
.end method

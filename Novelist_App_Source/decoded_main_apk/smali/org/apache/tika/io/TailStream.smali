.class public Lorg/apache/tika/io/TailStream;
.super Ljava/io/FilterInputStream;
.source "SourceFile"


# static fields
.field private static final SKIP_SIZE:I = 0x1000


# instance fields
.field private bytesRead:J

.field private currentIndex:I

.field private markBuffer:[B

.field private markBytesRead:J

.field private markIndex:I

.field private final tailBuffer:[B

.field private final tailSize:I


# direct methods
.method public constructor <init>(Ljava/io/InputStream;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Lorg/apache/tika/io/TailStream;->tailSize:I

    .line 5
    .line 6
    new-array p1, p2, [B

    .line 7
    .line 8
    iput-object p1, p0, Lorg/apache/tika/io/TailStream;->tailBuffer:[B

    .line 9
    .line 10
    return-void
.end method

.method private appendBuf([BII)V
    .locals 2

    .line 1
    iget v0, p0, Lorg/apache/tika/io/TailStream;->tailSize:I

    .line 2
    .line 3
    if-lt p3, v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0, p1, p2, p3}, Lorg/apache/tika/io/TailStream;->replaceTailBuffer([BII)V

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lorg/apache/tika/io/TailStream;->copyToTailBuffer([BII)V

    .line 10
    .line 11
    .line 12
    :goto_0
    iget-wide p1, p0, Lorg/apache/tika/io/TailStream;->bytesRead:J

    .line 13
    .line 14
    int-to-long v0, p3

    .line 15
    add-long/2addr p1, v0

    .line 16
    iput-wide p1, p0, Lorg/apache/tika/io/TailStream;->bytesRead:J

    .line 17
    .line 18
    return-void
.end method

.method private appendByte(B)V
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/apache/tika/io/TailStream;->tailBuffer:[B

    .line 2
    .line 3
    iget v1, p0, Lorg/apache/tika/io/TailStream;->currentIndex:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iput v2, p0, Lorg/apache/tika/io/TailStream;->currentIndex:I

    .line 8
    .line 9
    aput-byte p1, v0, v1

    .line 10
    .line 11
    iget p1, p0, Lorg/apache/tika/io/TailStream;->tailSize:I

    .line 12
    .line 13
    if-lt v2, p1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput p1, p0, Lorg/apache/tika/io/TailStream;->currentIndex:I

    .line 17
    .line 18
    :cond_0
    iget-wide v0, p0, Lorg/apache/tika/io/TailStream;->bytesRead:J

    .line 19
    .line 20
    const-wide/16 v2, 0x1

    .line 21
    .line 22
    add-long/2addr v0, v2

    .line 23
    iput-wide v0, p0, Lorg/apache/tika/io/TailStream;->bytesRead:J

    .line 24
    .line 25
    return-void
.end method

.method private copyToTailBuffer([BII)V
    .locals 3

    .line 1
    iget v0, p0, Lorg/apache/tika/io/TailStream;->tailSize:I

    .line 2
    .line 3
    iget v1, p0, Lorg/apache/tika/io/TailStream;->currentIndex:I

    .line 4
    .line 5
    sub-int/2addr v0, v1

    .line 6
    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-object v1, p0, Lorg/apache/tika/io/TailStream;->tailBuffer:[B

    .line 11
    .line 12
    iget v2, p0, Lorg/apache/tika/io/TailStream;->currentIndex:I

    .line 13
    .line 14
    invoke-static {p1, p2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 15
    .line 16
    .line 17
    add-int/2addr p2, v0

    .line 18
    iget-object v1, p0, Lorg/apache/tika/io/TailStream;->tailBuffer:[B

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    sub-int v0, p3, v0

    .line 22
    .line 23
    invoke-static {p1, p2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 24
    .line 25
    .line 26
    iget p1, p0, Lorg/apache/tika/io/TailStream;->currentIndex:I

    .line 27
    .line 28
    add-int/2addr p1, p3

    .line 29
    iget p2, p0, Lorg/apache/tika/io/TailStream;->tailSize:I

    .line 30
    .line 31
    rem-int/2addr p1, p2

    .line 32
    iput p1, p0, Lorg/apache/tika/io/TailStream;->currentIndex:I

    .line 33
    .line 34
    return-void
.end method

.method private replaceTailBuffer([BII)V
    .locals 2

    .line 1
    add-int/2addr p2, p3

    .line 2
    iget p3, p0, Lorg/apache/tika/io/TailStream;->tailSize:I

    .line 3
    .line 4
    sub-int/2addr p2, p3

    .line 5
    iget-object v0, p0, Lorg/apache/tika/io/TailStream;->tailBuffer:[B

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 9
    .line 10
    .line 11
    iput v1, p0, Lorg/apache/tika/io/TailStream;->currentIndex:I

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public getTail()[B
    .locals 6

    .line 1
    iget v0, p0, Lorg/apache/tika/io/TailStream;->tailSize:I

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    iget-wide v2, p0, Lorg/apache/tika/io/TailStream;->bytesRead:J

    .line 5
    .line 6
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    long-to-int v0, v0

    .line 11
    new-array v1, v0, [B

    .line 12
    .line 13
    iget-object v2, p0, Lorg/apache/tika/io/TailStream;->tailBuffer:[B

    .line 14
    .line 15
    iget v3, p0, Lorg/apache/tika/io/TailStream;->currentIndex:I

    .line 16
    .line 17
    sub-int v4, v0, v3

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    invoke-static {v2, v3, v1, v5, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 21
    .line 22
    .line 23
    iget-object v2, p0, Lorg/apache/tika/io/TailStream;->tailBuffer:[B

    .line 24
    .line 25
    iget v3, p0, Lorg/apache/tika/io/TailStream;->currentIndex:I

    .line 26
    .line 27
    sub-int/2addr v0, v3

    .line 28
    invoke-static {v2, v5, v1, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 29
    .line 30
    .line 31
    return-object v1
.end method

.method public mark(I)V
    .locals 3

    .line 1
    iget p1, p0, Lorg/apache/tika/io/TailStream;->tailSize:I

    .line 2
    .line 3
    new-array v0, p1, [B

    .line 4
    .line 5
    iput-object v0, p0, Lorg/apache/tika/io/TailStream;->markBuffer:[B

    .line 6
    .line 7
    iget-object v1, p0, Lorg/apache/tika/io/TailStream;->tailBuffer:[B

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-static {v1, v2, v0, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 11
    .line 12
    .line 13
    iget p1, p0, Lorg/apache/tika/io/TailStream;->currentIndex:I

    .line 14
    .line 15
    iput p1, p0, Lorg/apache/tika/io/TailStream;->markIndex:I

    .line 16
    .line 17
    iget-wide v0, p0, Lorg/apache/tika/io/TailStream;->bytesRead:J

    .line 18
    .line 19
    iput-wide v0, p0, Lorg/apache/tika/io/TailStream;->markBytesRead:J

    .line 20
    .line 21
    return-void
.end method

.method public read()I
    .locals 2

    .line 1
    invoke-super {p0}, Ljava/io/FilterInputStream;->read()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    int-to-byte v1, v0

    .line 2
    invoke-direct {p0, v1}, Lorg/apache/tika/io/TailStream;->appendByte(B)V

    :cond_0
    return v0
.end method

.method public read([B)I
    .locals 2

    .line 3
    invoke-super {p0, p1}, Ljava/io/FilterInputStream;->read([B)I

    move-result v0

    if-lez v0, :cond_0

    const/4 v1, 0x0

    .line 4
    invoke-direct {p0, p1, v1, v0}, Lorg/apache/tika/io/TailStream;->appendBuf([BII)V

    :cond_0
    return v0
.end method

.method public read([BII)I
    .locals 0

    .line 5
    invoke-super {p0, p1, p2, p3}, Ljava/io/FilterInputStream;->read([BII)I

    move-result p3

    if-lez p3, :cond_0

    .line 6
    invoke-direct {p0, p1, p2, p3}, Lorg/apache/tika/io/TailStream;->appendBuf([BII)V

    :cond_0
    return p3
.end method

.method public reset()V
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/apache/tika/io/TailStream;->markBuffer:[B

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lorg/apache/tika/io/TailStream;->tailBuffer:[B

    .line 6
    .line 7
    iget v2, p0, Lorg/apache/tika/io/TailStream;->tailSize:I

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 11
    .line 12
    .line 13
    iget v0, p0, Lorg/apache/tika/io/TailStream;->markIndex:I

    .line 14
    .line 15
    iput v0, p0, Lorg/apache/tika/io/TailStream;->currentIndex:I

    .line 16
    .line 17
    iget-wide v0, p0, Lorg/apache/tika/io/TailStream;->markBytesRead:J

    .line 18
    .line 19
    iput-wide v0, p0, Lorg/apache/tika/io/TailStream;->bytesRead:J

    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public skip(J)J
    .locals 13

    .line 1
    const-wide/16 v0, 0x1000

    .line 2
    .line 3
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    long-to-int v0, v0

    .line 8
    new-array v1, v0, [B

    .line 9
    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    move-wide v5, v2

    .line 14
    move v7, v4

    .line 15
    :cond_0
    :goto_0
    cmp-long v8, v5, p1

    .line 16
    .line 17
    if-gez v8, :cond_1

    .line 18
    .line 19
    const/4 v8, -0x1

    .line 20
    if-eq v7, v8, :cond_1

    .line 21
    .line 22
    int-to-long v9, v0

    .line 23
    sub-long v11, p1, v5

    .line 24
    .line 25
    invoke-static {v9, v10, v11, v12}, Ljava/lang/Math;->min(JJ)J

    .line 26
    .line 27
    .line 28
    move-result-wide v9

    .line 29
    long-to-int v7, v9

    .line 30
    invoke-virtual {p0, v1, v4, v7}, Lorg/apache/tika/io/TailStream;->read([BII)I

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    if-eq v7, v8, :cond_0

    .line 35
    .line 36
    int-to-long v8, v7

    .line 37
    add-long/2addr v5, v8

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    if-gez v7, :cond_2

    .line 40
    .line 41
    cmp-long p1, v5, v2

    .line 42
    .line 43
    if-nez p1, :cond_2

    .line 44
    .line 45
    const-wide/16 p1, -0x1

    .line 46
    .line 47
    return-wide p1

    .line 48
    :cond_2
    return-wide v5
.end method

.class public final Lw2/f;
.super Ljava/io/InputStream;
.source "SourceFile"


# instance fields
.field public volatile k:Ljava/io/ByteArrayInputStream;

.field public volatile l:[B

.field public m:I

.field public n:I

.field public o:I

.field public p:I


# virtual methods
.method public final a(Ljava/io/ByteArrayInputStream;[B)I
    .locals 5

    .line 1
    iget v0, p0, Lw2/f;->o:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, -0x1

    .line 5
    if-eq v0, v2, :cond_5

    .line 6
    .line 7
    iget v3, p0, Lw2/f;->p:I

    .line 8
    .line 9
    sub-int/2addr v3, v0

    .line 10
    iget v4, p0, Lw2/f;->n:I

    .line 11
    .line 12
    if-lt v3, v4, :cond_0

    .line 13
    .line 14
    goto :goto_3

    .line 15
    :cond_0
    if-nez v0, :cond_2

    .line 16
    .line 17
    array-length v2, p2

    .line 18
    if-le v4, v2, :cond_2

    .line 19
    .line 20
    array-length v0, p2

    .line 21
    mul-int/lit8 v0, v0, 0x2

    .line 22
    .line 23
    if-le v0, v4, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move v4, v0

    .line 27
    :goto_0
    new-array v0, v4, [B

    .line 28
    .line 29
    array-length v2, p2

    .line 30
    invoke-static {p2, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lw2/f;->l:[B

    .line 34
    .line 35
    move-object p2, v0

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    if-lez v0, :cond_3

    .line 38
    .line 39
    array-length v2, p2

    .line 40
    sub-int/2addr v2, v0

    .line 41
    invoke-static {p2, v0, p2, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 42
    .line 43
    .line 44
    :cond_3
    :goto_1
    iget v0, p0, Lw2/f;->p:I

    .line 45
    .line 46
    iget v2, p0, Lw2/f;->o:I

    .line 47
    .line 48
    sub-int/2addr v0, v2

    .line 49
    iput v0, p0, Lw2/f;->p:I

    .line 50
    .line 51
    iput v1, p0, Lw2/f;->o:I

    .line 52
    .line 53
    iput v1, p0, Lw2/f;->m:I

    .line 54
    .line 55
    array-length v1, p2

    .line 56
    sub-int/2addr v1, v0

    .line 57
    invoke-virtual {p1, p2, v0, v1}, Ljava/io/InputStream;->read([BII)I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    iget p2, p0, Lw2/f;->p:I

    .line 62
    .line 63
    if-gtz p1, :cond_4

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_4
    add-int/2addr p2, p1

    .line 67
    :goto_2
    iput p2, p0, Lw2/f;->m:I

    .line 68
    .line 69
    return p1

    .line 70
    :cond_5
    :goto_3
    invoke-virtual {p1, p2}, Ljava/io/InputStream;->read([B)I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-lez p1, :cond_6

    .line 75
    .line 76
    iput v2, p0, Lw2/f;->o:I

    .line 77
    .line 78
    iput v1, p0, Lw2/f;->p:I

    .line 79
    .line 80
    iput p1, p0, Lw2/f;->m:I

    .line 81
    .line 82
    :cond_6
    return p1
.end method

.method public final available()I
    .locals 3

    .line 1
    iget-object v0, p0, Lw2/f;->k:Ljava/io/ByteArrayInputStream;

    .line 2
    .line 3
    iget-object v1, p0, Lw2/f;->l:[B

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget v1, p0, Lw2/f;->m:I

    .line 10
    .line 11
    iget v2, p0, Lw2/f;->p:I

    .line 12
    .line 13
    sub-int/2addr v1, v2

    .line 14
    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    add-int/2addr v0, v1

    .line 19
    return v0

    .line 20
    :cond_0
    new-instance v0, Ljava/io/IOException;

    .line 21
    .line 22
    const-string v1, "Stream is closed"

    .line 23
    .line 24
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v0
.end method

.method public final close()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lw2/f;->l:[B

    .line 3
    .line 4
    iget-object v1, p0, Lw2/f;->k:Ljava/io/ByteArrayInputStream;

    .line 5
    .line 6
    iput-object v0, p0, Lw2/f;->k:Ljava/io/ByteArrayInputStream;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final mark(I)V
    .locals 0

    .line 1
    iput p1, p0, Lw2/f;->n:I

    .line 2
    .line 3
    iget p1, p0, Lw2/f;->p:I

    .line 4
    .line 5
    iput p1, p0, Lw2/f;->o:I

    .line 6
    .line 7
    return-void
.end method

.method public final markSupported()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final read()I
    .locals 6

    .line 2
    iget-object v0, p0, Lw2/f;->l:[B

    .line 3
    iget-object v1, p0, Lw2/f;->k:Ljava/io/ByteArrayInputStream;

    .line 4
    const-string v2, "Stream is closed"

    if-eqz v0, :cond_4

    if-eqz v1, :cond_4

    .line 5
    iget v3, p0, Lw2/f;->p:I

    iget v4, p0, Lw2/f;->m:I

    const/4 v5, -0x1

    if-lt v3, v4, :cond_0

    invoke-virtual {p0, v1, v0}, Lw2/f;->a(Ljava/io/ByteArrayInputStream;[B)I

    move-result v1

    if-ne v1, v5, :cond_0

    goto :goto_1

    .line 6
    :cond_0
    iget-object v1, p0, Lw2/f;->l:[B

    if-eq v0, v1, :cond_2

    .line 7
    iget-object v0, p0, Lw2/f;->l:[B

    if-eqz v0, :cond_1

    goto :goto_0

    .line 8
    :cond_1
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 9
    :cond_2
    :goto_0
    iget v1, p0, Lw2/f;->m:I

    iget v2, p0, Lw2/f;->p:I

    sub-int/2addr v1, v2

    if-lez v1, :cond_3

    add-int/lit8 v1, v2, 0x1

    .line 10
    iput v1, p0, Lw2/f;->p:I

    aget-byte v0, v0, v2

    and-int/lit16 v0, v0, 0xff

    return v0

    :cond_3
    :goto_1
    return v5

    .line 11
    :cond_4
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final read([B)I
    .locals 2

    const/4 v0, 0x0

    .line 1
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lw2/f;->read([BII)I

    move-result p1

    return p1
.end method

.method public final read([BII)I
    .locals 6

    .line 12
    iget-object v0, p0, Lw2/f;->l:[B

    .line 13
    const-string v1, "Stream is closed"

    if-eqz v0, :cond_11

    .line 14
    array-length v2, p1

    sub-int/2addr v2, p3

    if-gt p2, v2, :cond_10

    if-ltz p2, :cond_10

    if-ltz p3, :cond_10

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    .line 15
    :cond_0
    iget-object v2, p0, Lw2/f;->k:Ljava/io/ByteArrayInputStream;

    if-eqz v2, :cond_f

    .line 16
    iget v3, p0, Lw2/f;->p:I

    iget v4, p0, Lw2/f;->m:I

    if-ge v3, v4, :cond_4

    sub-int/2addr v4, v3

    if-lt v4, p3, :cond_1

    move v4, p3

    .line 17
    :cond_1
    invoke-static {v0, v3, p1, p2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 18
    iget v3, p0, Lw2/f;->p:I

    add-int/2addr v3, v4

    iput v3, p0, Lw2/f;->p:I

    if-eq v4, p3, :cond_3

    .line 19
    invoke-virtual {v2}, Ljava/io/InputStream;->available()I

    move-result v3

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    add-int/2addr p2, v4

    sub-int v3, p3, v4

    goto :goto_1

    :cond_3
    :goto_0
    return v4

    :cond_4
    move v3, p3

    .line 20
    :goto_1
    iget v4, p0, Lw2/f;->o:I

    const/4 v5, -0x1

    if-ne v4, v5, :cond_6

    array-length v4, v0

    if-lt v3, v4, :cond_6

    .line 21
    invoke-virtual {v2, p1, p2, v3}, Ljava/io/InputStream;->read([BII)I

    move-result v4

    if-ne v4, v5, :cond_c

    if-ne v3, p3, :cond_5

    goto :goto_2

    :cond_5
    sub-int/2addr p3, v3

    return p3

    .line 22
    :cond_6
    invoke-virtual {p0, v2, v0}, Lw2/f;->a(Ljava/io/ByteArrayInputStream;[B)I

    move-result v4

    if-ne v4, v5, :cond_8

    if-ne v3, p3, :cond_7

    :goto_2
    return v5

    :cond_7
    sub-int/2addr p3, v3

    return p3

    .line 23
    :cond_8
    iget-object v4, p0, Lw2/f;->l:[B

    if-eq v0, v4, :cond_a

    .line 24
    iget-object v0, p0, Lw2/f;->l:[B

    if-eqz v0, :cond_9

    goto :goto_3

    .line 25
    :cond_9
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 26
    :cond_a
    :goto_3
    iget v4, p0, Lw2/f;->m:I

    iget v5, p0, Lw2/f;->p:I

    sub-int/2addr v4, v5

    if-lt v4, v3, :cond_b

    move v4, v3

    .line 27
    :cond_b
    invoke-static {v0, v5, p1, p2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 28
    iget v5, p0, Lw2/f;->p:I

    add-int/2addr v5, v4

    iput v5, p0, Lw2/f;->p:I

    :cond_c
    sub-int/2addr v3, v4

    if-nez v3, :cond_d

    return p3

    .line 29
    :cond_d
    invoke-virtual {v2}, Ljava/io/InputStream;->available()I

    move-result v5

    if-nez v5, :cond_e

    sub-int/2addr p3, v3

    return p3

    :cond_e
    add-int/2addr p2, v4

    goto :goto_1

    .line 30
    :cond_f
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 31
    :cond_10
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1

    .line 32
    :cond_11
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final reset()V
    .locals 2

    .line 1
    iget-object v0, p0, Lw2/f;->l:[B

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Lw2/f;->o:I

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    if-eq v1, v0, :cond_0

    .line 9
    .line 10
    iput v0, p0, Lw2/f;->p:I

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    new-instance v0, Ljava/io/IOException;

    .line 14
    .line 15
    const-string v1, "Mark has been invalidated"

    .line 16
    .line 17
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw v0

    .line 21
    :cond_1
    new-instance v0, Ljava/io/IOException;

    .line 22
    .line 23
    const-string v1, "Stream is closed"

    .line 24
    .line 25
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw v0
.end method

.method public final skip(J)J
    .locals 9

    .line 1
    iget-object v0, p0, Lw2/f;->l:[B

    .line 2
    .line 3
    iget-object v1, p0, Lw2/f;->k:Ljava/io/ByteArrayInputStream;

    .line 4
    .line 5
    const-string v2, "Stream is closed"

    .line 6
    .line 7
    if-eqz v0, :cond_6

    .line 8
    .line 9
    const-wide/16 v3, 0x1

    .line 10
    .line 11
    cmp-long v3, p1, v3

    .line 12
    .line 13
    if-gez v3, :cond_0

    .line 14
    .line 15
    const-wide/16 p1, 0x0

    .line 16
    .line 17
    return-wide p1

    .line 18
    :cond_0
    if-eqz v1, :cond_5

    .line 19
    .line 20
    iget v2, p0, Lw2/f;->m:I

    .line 21
    .line 22
    iget v3, p0, Lw2/f;->p:I

    .line 23
    .line 24
    sub-int v4, v2, v3

    .line 25
    .line 26
    int-to-long v5, v4

    .line 27
    cmp-long v7, v5, p1

    .line 28
    .line 29
    if-ltz v7, :cond_1

    .line 30
    .line 31
    long-to-int v0, p1

    .line 32
    add-int/2addr v3, v0

    .line 33
    iput v3, p0, Lw2/f;->p:I

    .line 34
    .line 35
    return-wide p1

    .line 36
    :cond_1
    iput v2, p0, Lw2/f;->p:I

    .line 37
    .line 38
    iget v2, p0, Lw2/f;->o:I

    .line 39
    .line 40
    const/4 v3, -0x1

    .line 41
    if-eq v2, v3, :cond_4

    .line 42
    .line 43
    iget v2, p0, Lw2/f;->n:I

    .line 44
    .line 45
    int-to-long v7, v2

    .line 46
    cmp-long v2, p1, v7

    .line 47
    .line 48
    if-gtz v2, :cond_4

    .line 49
    .line 50
    invoke-virtual {p0, v1, v0}, Lw2/f;->a(Ljava/io/ByteArrayInputStream;[B)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-ne v0, v3, :cond_2

    .line 55
    .line 56
    return-wide v5

    .line 57
    :cond_2
    iget v0, p0, Lw2/f;->m:I

    .line 58
    .line 59
    iget v1, p0, Lw2/f;->p:I

    .line 60
    .line 61
    sub-int v2, v0, v1

    .line 62
    .line 63
    int-to-long v7, v2

    .line 64
    sub-long v5, p1, v5

    .line 65
    .line 66
    cmp-long v3, v7, v5

    .line 67
    .line 68
    if-ltz v3, :cond_3

    .line 69
    .line 70
    long-to-int v0, p1

    .line 71
    sub-int/2addr v0, v4

    .line 72
    add-int/2addr v0, v1

    .line 73
    iput v0, p0, Lw2/f;->p:I

    .line 74
    .line 75
    return-wide p1

    .line 76
    :cond_3
    add-int/2addr v2, v4

    .line 77
    iput v0, p0, Lw2/f;->p:I

    .line 78
    .line 79
    int-to-long p1, v2

    .line 80
    return-wide p1

    .line 81
    :cond_4
    sub-long/2addr p1, v5

    .line 82
    invoke-virtual {v1, p1, p2}, Ljava/io/InputStream;->skip(J)J

    .line 83
    .line 84
    .line 85
    move-result-wide p1

    .line 86
    add-long/2addr p1, v5

    .line 87
    return-wide p1

    .line 88
    :cond_5
    new-instance p1, Ljava/io/IOException;

    .line 89
    .line 90
    invoke-direct {p1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw p1

    .line 94
    :cond_6
    new-instance p1, Ljava/io/IOException;

    .line 95
    .line 96
    invoke-direct {p1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw p1
.end method

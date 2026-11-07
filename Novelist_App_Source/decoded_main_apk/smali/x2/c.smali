.class public final Lx2/c;
.super Ljava/io/OutputStream;
.source "SourceFile"


# static fields
.field public static final synthetic p:I


# instance fields
.field public final k:Ljava/util/ArrayList;

.field public l:I

.field public m:[B

.field public n:I

.field public o:I


# direct methods
.method public constructor <init>(Lw2/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lx2/c;->k:Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 p1, -0x1

    .line 12
    iput p1, p0, Lx2/c;->n:I

    .line 13
    .line 14
    const/16 p1, 0x2000

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lx2/c;->a(I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 3

    .line 1
    iget v0, p0, Lx2/c;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Lx2/c;->k:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    add-int/lit8 v2, v2, -0x1

    .line 10
    .line 11
    if-ge v0, v2, :cond_0

    .line 12
    .line 13
    iget p1, p0, Lx2/c;->o:I

    .line 14
    .line 15
    iget-object v0, p0, Lx2/c;->m:[B

    .line 16
    .line 17
    array-length v0, v0

    .line 18
    add-int/2addr p1, v0

    .line 19
    iput p1, p0, Lx2/c;->o:I

    .line 20
    .line 21
    iget p1, p0, Lx2/c;->n:I

    .line 22
    .line 23
    add-int/lit8 p1, p1, 0x1

    .line 24
    .line 25
    iput p1, p0, Lx2/c;->n:I

    .line 26
    .line 27
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, [B

    .line 32
    .line 33
    iput-object p1, p0, Lx2/c;->m:[B

    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    iget-object v0, p0, Lx2/c;->m:[B

    .line 37
    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    if-lez p1, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/16 p1, 0x400

    .line 44
    .line 45
    :goto_0
    const/4 v0, 0x0

    .line 46
    iput v0, p0, Lx2/c;->o:I

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    array-length v0, v0

    .line 50
    shl-int/lit8 v0, v0, 0x1

    .line 51
    .line 52
    iget v2, p0, Lx2/c;->o:I

    .line 53
    .line 54
    sub-int/2addr p1, v2

    .line 55
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    iget v0, p0, Lx2/c;->o:I

    .line 60
    .line 61
    iget-object v2, p0, Lx2/c;->m:[B

    .line 62
    .line 63
    array-length v2, v2

    .line 64
    add-int/2addr v0, v2

    .line 65
    iput v0, p0, Lx2/c;->o:I

    .line 66
    .line 67
    :goto_1
    iget v0, p0, Lx2/c;->n:I

    .line 68
    .line 69
    add-int/lit8 v0, v0, 0x1

    .line 70
    .line 71
    iput v0, p0, Lx2/c;->n:I

    .line 72
    .line 73
    sget-object v0, Ls2/c;->a:[B

    .line 74
    .line 75
    new-array p1, p1, [B

    .line 76
    .line 77
    iput-object p1, p0, Lx2/c;->m:[B

    .line 78
    .line 79
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method public final b()[B
    .locals 9

    .line 1
    iget v0, p0, Lx2/c;->l:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Ls2/c;->a:[B

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    sget-object v1, Ls2/c;->a:[B

    .line 9
    .line 10
    new-array v1, v0, [B

    .line 11
    .line 12
    iget-object v2, p0, Lx2/c;->k:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    const/4 v4, 0x0

    .line 19
    move v5, v4

    .line 20
    move v6, v5

    .line 21
    :cond_1
    if-ge v6, v3, :cond_2

    .line 22
    .line 23
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v7

    .line 27
    add-int/lit8 v6, v6, 0x1

    .line 28
    .line 29
    check-cast v7, [B

    .line 30
    .line 31
    array-length v8, v7

    .line 32
    invoke-static {v8, v0}, Ljava/lang/Math;->min(II)I

    .line 33
    .line 34
    .line 35
    move-result v8

    .line 36
    invoke-static {v7, v4, v1, v5, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 37
    .line 38
    .line 39
    add-int/2addr v5, v8

    .line 40
    sub-int/2addr v0, v8

    .line 41
    if-nez v0, :cond_1

    .line 42
    .line 43
    :cond_2
    return-object v1
.end method

.method public final close()V
    .locals 0

    .line 1
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Lx2/c;->b()[B

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final write(I)V
    .locals 3

    .line 10
    iget v0, p0, Lx2/c;->l:I

    iget v1, p0, Lx2/c;->o:I

    sub-int v1, v0, v1

    .line 11
    iget-object v2, p0, Lx2/c;->m:[B

    array-length v2, v2

    if-ne v1, v2, :cond_0

    add-int/lit8 v0, v0, 0x1

    .line 12
    invoke-virtual {p0, v0}, Lx2/c;->a(I)V

    const/4 v1, 0x0

    .line 13
    :cond_0
    iget-object v0, p0, Lx2/c;->m:[B

    int-to-byte p1, p1

    aput-byte p1, v0, v1

    .line 14
    iget p1, p0, Lx2/c;->l:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lx2/c;->l:I

    return-void
.end method

.method public final write([B)V
    .locals 2

    const/4 v0, 0x0

    .line 9
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lx2/c;->write([BII)V

    return-void
.end method

.method public final write([BII)V
    .locals 5

    if-ltz p2, :cond_3

    .line 1
    array-length v0, p1

    if-gt p2, v0, :cond_3

    if-ltz p3, :cond_3

    add-int v0, p2, p3

    array-length v1, p1

    if-gt v0, v1, :cond_3

    if-ltz v0, :cond_3

    if-nez p3, :cond_0

    return-void

    .line 2
    :cond_0
    iget p2, p0, Lx2/c;->l:I

    add-int v1, p2, p3

    .line 3
    iget v2, p0, Lx2/c;->o:I

    sub-int/2addr p2, v2

    :cond_1
    :goto_0
    if-lez p3, :cond_2

    .line 4
    iget-object v2, p0, Lx2/c;->m:[B

    array-length v2, v2

    sub-int/2addr v2, p2

    invoke-static {p3, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    sub-int v3, v0, p3

    .line 5
    iget-object v4, p0, Lx2/c;->m:[B

    invoke-static {p1, v3, v4, p2, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sub-int/2addr p3, v2

    if-lez p3, :cond_1

    .line 6
    invoke-virtual {p0, v1}, Lx2/c;->a(I)V

    const/4 p2, 0x0

    goto :goto_0

    .line 7
    :cond_2
    iput v1, p0, Lx2/c;->l:I

    return-void

    .line 8
    :cond_3
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    filled-new-array {p2, p3}, [Ljava/lang/Object;

    move-result-object p2

    const-string p3, "offset=%,d, length=%,d"

    invoke-static {p3, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.class public final Lw2/h;
.super Ljava/io/InputStream;
.source "SourceFile"


# static fields
.field public static final synthetic o:I


# instance fields
.field public final k:[B

.field public final l:I

.field public m:I

.field public n:I


# direct methods
.method public constructor <init>(Lw2/g;)V
    .locals 4

    .line 1
    sget v0, Lw2/g;->o:I

    .line 2
    iget-object v0, p1, Lt2/b;->m:Lt2/a;

    if-eqz v0, :cond_3

    .line 3
    iget-object v0, v0, Lt2/a;->m:Ljava/lang/Object;

    .line 4
    check-cast v0, [B

    .line 5
    iget p1, p1, Lw2/g;->n:I

    .line 6
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 7
    const-string v1, "offset"

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lw2/h;->a(Ljava/lang/String;I)V

    .line 8
    const-string v1, "length"

    invoke-static {v1, p1}, Lw2/h;->a(Ljava/lang/String;I)V

    .line 9
    const-string v1, "data"

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object v0, p0, Lw2/h;->k:[B

    .line 10
    const-string v1, "defaultValue"

    invoke-static {v1, v2}, Lw2/h;->a(Ljava/lang/String;I)V

    .line 11
    array-length v3, v0

    if-lez v3, :cond_0

    array-length v3, v0

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    add-int/2addr v3, p1

    .line 12
    array-length p1, v0

    invoke-static {v3, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Lw2/h;->l:I

    .line 13
    invoke-static {v1, v2}, Lw2/h;->a(Ljava/lang/String;I)V

    .line 14
    array-length p1, v0

    if-lez p1, :cond_1

    array-length p1, v0

    goto :goto_1

    :cond_1
    move p1, v2

    :goto_1
    invoke-static {v2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 15
    iput p1, p0, Lw2/h;->m:I

    .line 16
    invoke-static {v1, v2}, Lw2/h;->a(Ljava/lang/String;I)V

    .line 17
    array-length p1, v0

    if-lez p1, :cond_2

    array-length p1, v0

    goto :goto_2

    :cond_2
    move p1, v2

    :goto_2
    invoke-static {v2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 18
    iput p1, p0, Lw2/h;->n:I

    return-void

    .line 19
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "origin == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>([B)V
    .locals 1

    .line 20
    array-length v0, p1

    .line 21
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 22
    iput-object p1, p0, Lw2/h;->k:[B

    .line 23
    iput v0, p0, Lw2/h;->l:I

    const/4 p1, 0x0

    .line 24
    iput p1, p0, Lw2/h;->m:I

    .line 25
    iput p1, p0, Lw2/h;->n:I

    return-void
.end method

.method public static a(Ljava/lang/String;I)V
    .locals 1

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 5
    .line 6
    const-string v0, " cannot be negative"

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw p1
.end method


# virtual methods
.method public final available()I
    .locals 2

    .line 1
    iget v0, p0, Lw2/h;->m:I

    .line 2
    .line 3
    iget v1, p0, Lw2/h;->l:I

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    sub-int/2addr v1, v0

    .line 8
    return v1

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public final mark(I)V
    .locals 0

    .line 1
    iget p1, p0, Lw2/h;->m:I

    .line 2
    .line 3
    iput p1, p0, Lw2/h;->n:I

    .line 4
    .line 5
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
    .locals 2

    .line 1
    iget v0, p0, Lw2/h;->m:I

    iget v1, p0, Lw2/h;->l:I

    if-ge v0, v1, :cond_0

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lw2/h;->m:I

    iget-object v1, p0, Lw2/h;->k:[B

    aget-byte v0, v1, v0

    and-int/lit16 v0, v0, 0xff

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public final read([B)I
    .locals 2

    .line 2
    const-string v0, "dest"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v0, 0x0

    .line 3
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lw2/h;->read([BII)I

    move-result p1

    return p1
.end method

.method public final read([BII)I
    .locals 2

    .line 4
    const-string v0, "dest"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    if-ltz p2, :cond_3

    if-ltz p3, :cond_3

    add-int v0, p2, p3

    .line 5
    array-length v1, p1

    if-gt v0, v1, :cond_3

    .line 6
    iget v0, p0, Lw2/h;->m:I

    iget v1, p0, Lw2/h;->l:I

    if-lt v0, v1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    sub-int/2addr v1, v0

    if-ge p3, v1, :cond_1

    goto :goto_0

    :cond_1
    move p3, v1

    :goto_0
    if-gtz p3, :cond_2

    const/4 p1, 0x0

    return p1

    .line 7
    :cond_2
    iget-object v1, p0, Lw2/h;->k:[B

    invoke-static {v1, v0, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 8
    iget p1, p0, Lw2/h;->m:I

    add-int/2addr p1, p3

    iput p1, p0, Lw2/h;->m:I

    return p3

    .line 9
    :cond_3
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final reset()V
    .locals 1

    .line 1
    iget v0, p0, Lw2/h;->n:I

    .line 2
    .line 3
    iput v0, p0, Lw2/h;->m:I

    .line 4
    .line 5
    return-void
.end method

.method public final skip(J)J
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-ltz v0, :cond_1

    .line 6
    .line 7
    iget v0, p0, Lw2/h;->m:I

    .line 8
    .line 9
    iget v1, p0, Lw2/h;->l:I

    .line 10
    .line 11
    sub-int/2addr v1, v0

    .line 12
    int-to-long v1, v1

    .line 13
    cmp-long v3, p1, v1

    .line 14
    .line 15
    if-gez v3, :cond_0

    .line 16
    .line 17
    move-wide v1, p1

    .line 18
    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Math;->toIntExact(J)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-static {v0, p1}, Ljava/lang/Math;->addExact(II)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    iput p1, p0, Lw2/h;->m:I

    .line 27
    .line 28
    return-wide v1

    .line 29
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 30
    .line 31
    const-string p2, "Skipping backward is not supported"

    .line 32
    .line 33
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p1
.end method

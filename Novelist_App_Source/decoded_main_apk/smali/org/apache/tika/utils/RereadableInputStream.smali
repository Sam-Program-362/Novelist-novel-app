.class public Lorg/apache/tika/utils/RereadableInputStream;
.super Ljava/io/InputStream;
.source "SourceFile"


# static fields
.field private static final DEFAULT_MAX_BYTES_IN_MEMORY:I = 0x20000000


# instance fields
.field private bufferHighWaterMark:I

.field private bufferPointer:I

.field private byteBuffer:[B

.field private final closeOriginalStreamOnClose:Z

.field private closed:Z

.field private inputStream:Ljava/io/InputStream;

.field private final maxBytesInMemory:I

.field private final originalInputStream:Ljava/io/InputStream;

.field private readingFromBuffer:Z

.field private storeFile:Ljava/io/File;

.field private storeOutputStream:Ljava/io/OutputStream;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 2

    const/high16 v0, 0x20000000

    const/4 v1, 0x1

    .line 1
    invoke-direct {p0, p1, v0, v1}, Lorg/apache/tika/utils/RereadableInputStream;-><init>(Ljava/io/InputStream;IZ)V

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;I)V
    .locals 1

    const/4 v0, 0x1

    .line 3
    invoke-direct {p0, p1, p2, v0}, Lorg/apache/tika/utils/RereadableInputStream;-><init>(Ljava/io/InputStream;IZ)V

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;IZ)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 5
    iput-object p1, p0, Lorg/apache/tika/utils/RereadableInputStream;->inputStream:Ljava/io/InputStream;

    .line 6
    iput-object p1, p0, Lorg/apache/tika/utils/RereadableInputStream;->originalInputStream:Ljava/io/InputStream;

    .line 7
    iput p2, p0, Lorg/apache/tika/utils/RereadableInputStream;->maxBytesInMemory:I

    .line 8
    new-array p1, p2, [B

    iput-object p1, p0, Lorg/apache/tika/utils/RereadableInputStream;->byteBuffer:[B

    .line 9
    iput-boolean p3, p0, Lorg/apache/tika/utils/RereadableInputStream;->closeOriginalStreamOnClose:Z

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;Z)V
    .locals 1

    const/high16 v0, 0x20000000

    .line 2
    invoke-direct {p0, p1, v0, p2}, Lorg/apache/tika/utils/RereadableInputStream;-><init>(Ljava/io/InputStream;IZ)V

    return-void
.end method

.method private closeStream()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/tika/utils/RereadableInputStream;->originalInputStream:Ljava/io/InputStream;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/apache/tika/utils/RereadableInputStream;->inputStream:Ljava/io/InputStream;

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-boolean v0, p0, Lorg/apache/tika/utils/RereadableInputStream;->closeOriginalStreamOnClose:Z

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lorg/apache/tika/utils/RereadableInputStream;->originalInputStream:Ljava/io/InputStream;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
.end method

.method private saveByte(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/apache/tika/utils/RereadableInputStream;->byteBuffer:[B

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget v1, p0, Lorg/apache/tika/utils/RereadableInputStream;->bufferPointer:I

    .line 6
    .line 7
    iget v2, p0, Lorg/apache/tika/utils/RereadableInputStream;->maxBytesInMemory:I

    .line 8
    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    new-array v1, v0, [Ljava/nio/file/attribute/FileAttribute;

    .line 13
    .line 14
    invoke-static {v1}, Lorg/apache/tika/pipes/pipesiterator/fs/a;->i([Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {v1}, Lio/flutter/plugin/editing/i;->e(Ljava/nio/file/Path;)Ljava/io/File;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iput-object v1, p0, Lorg/apache/tika/utils/RereadableInputStream;->storeFile:Ljava/io/File;

    .line 23
    .line 24
    new-instance v1, Ljava/io/BufferedOutputStream;

    .line 25
    .line 26
    new-instance v2, Ljava/io/FileOutputStream;

    .line 27
    .line 28
    iget-object v3, p0, Lorg/apache/tika/utils/RereadableInputStream;->storeFile:Ljava/io/File;

    .line 29
    .line 30
    invoke-direct {v2, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {v1, v2}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, Lorg/apache/tika/utils/RereadableInputStream;->storeOutputStream:Ljava/io/OutputStream;

    .line 37
    .line 38
    iget-object v2, p0, Lorg/apache/tika/utils/RereadableInputStream;->byteBuffer:[B

    .line 39
    .line 40
    iget v3, p0, Lorg/apache/tika/utils/RereadableInputStream;->bufferPointer:I

    .line 41
    .line 42
    invoke-virtual {v1, v2, v0, v3}, Ljava/io/OutputStream;->write([BII)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lorg/apache/tika/utils/RereadableInputStream;->storeOutputStream:Ljava/io/OutputStream;

    .line 46
    .line 47
    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x0

    .line 51
    iput-object p1, p0, Lorg/apache/tika/utils/RereadableInputStream;->byteBuffer:[B

    .line 52
    .line 53
    return-void

    .line 54
    :cond_0
    add-int/lit8 v2, v1, 0x1

    .line 55
    .line 56
    iput v2, p0, Lorg/apache/tika/utils/RereadableInputStream;->bufferPointer:I

    .line 57
    .line 58
    int-to-byte p1, p1

    .line 59
    aput-byte p1, v0, v1

    .line 60
    .line 61
    return-void

    .line 62
    :cond_1
    iget-object v0, p0, Lorg/apache/tika/utils/RereadableInputStream;->storeOutputStream:Ljava/io/OutputStream;

    .line 63
    .line 64
    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 65
    .line 66
    .line 67
    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/apache/tika/utils/RereadableInputStream;->closeStream()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/apache/tika/utils/RereadableInputStream;->storeOutputStream:Ljava/io/OutputStream;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lorg/apache/tika/utils/RereadableInputStream;->storeOutputStream:Ljava/io/OutputStream;

    .line 13
    .line 14
    :cond_0
    invoke-super {p0}, Ljava/io/InputStream;->close()V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lorg/apache/tika/utils/RereadableInputStream;->storeFile:Ljava/io/File;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 22
    .line 23
    .line 24
    :cond_1
    const/4 v0, 0x1

    .line 25
    iput-boolean v0, p0, Lorg/apache/tika/utils/RereadableInputStream;->closed:Z

    .line 26
    .line 27
    return-void
.end method

.method public read()I
    .locals 5

    .line 1
    iget-boolean v0, p0, Lorg/apache/tika/utils/RereadableInputStream;->closed:Z

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, Lorg/apache/tika/utils/RereadableInputStream;->inputStream:Ljava/io/InputStream;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, -0x1

    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    iget-object v2, p0, Lorg/apache/tika/utils/RereadableInputStream;->inputStream:Ljava/io/InputStream;

    .line 15
    .line 16
    iget-object v3, p0, Lorg/apache/tika/utils/RereadableInputStream;->originalInputStream:Ljava/io/InputStream;

    .line 17
    .line 18
    if-eq v2, v3, :cond_1

    .line 19
    .line 20
    iget-boolean v0, p0, Lorg/apache/tika/utils/RereadableInputStream;->readingFromBuffer:Z

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-boolean v0, p0, Lorg/apache/tika/utils/RereadableInputStream;->readingFromBuffer:Z

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 32
    .line 33
    .line 34
    new-instance v0, Ljava/io/BufferedOutputStream;

    .line 35
    .line 36
    new-instance v2, Ljava/io/FileOutputStream;

    .line 37
    .line 38
    iget-object v3, p0, Lorg/apache/tika/utils/RereadableInputStream;->storeFile:Ljava/io/File;

    .line 39
    .line 40
    const/4 v4, 0x1

    .line 41
    invoke-direct {v2, v3, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    .line 42
    .line 43
    .line 44
    invoke-direct {v0, v2}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Lorg/apache/tika/utils/RereadableInputStream;->storeOutputStream:Ljava/io/OutputStream;

    .line 48
    .line 49
    :goto_0
    iget-object v0, p0, Lorg/apache/tika/utils/RereadableInputStream;->originalInputStream:Ljava/io/InputStream;

    .line 50
    .line 51
    iput-object v0, p0, Lorg/apache/tika/utils/RereadableInputStream;->inputStream:Ljava/io/InputStream;

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    :cond_1
    if-eq v0, v1, :cond_2

    .line 58
    .line 59
    iget-object v1, p0, Lorg/apache/tika/utils/RereadableInputStream;->inputStream:Ljava/io/InputStream;

    .line 60
    .line 61
    iget-object v2, p0, Lorg/apache/tika/utils/RereadableInputStream;->originalInputStream:Ljava/io/InputStream;

    .line 62
    .line 63
    if-ne v1, v2, :cond_2

    .line 64
    .line 65
    invoke-direct {p0, v0}, Lorg/apache/tika/utils/RereadableInputStream;->saveByte(I)V

    .line 66
    .line 67
    .line 68
    :cond_2
    return v0

    .line 69
    :cond_3
    new-instance v0, Ljava/io/IOException;

    .line 70
    .line 71
    const-string v1, "Stream is already closed"

    .line 72
    .line 73
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw v0
.end method

.method public rewind()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lorg/apache/tika/utils/RereadableInputStream;->closed:Z

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    iget-object v0, p0, Lorg/apache/tika/utils/RereadableInputStream;->storeOutputStream:Ljava/io/OutputStream;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, Lorg/apache/tika/utils/RereadableInputStream;->storeOutputStream:Ljava/io/OutputStream;

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lorg/apache/tika/utils/RereadableInputStream;->inputStream:Ljava/io/InputStream;

    .line 16
    .line 17
    iget-object v1, p0, Lorg/apache/tika/utils/RereadableInputStream;->originalInputStream:Ljava/io/InputStream;

    .line 18
    .line 19
    if-eq v0, v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 22
    .line 23
    .line 24
    :cond_1
    iget v0, p0, Lorg/apache/tika/utils/RereadableInputStream;->bufferPointer:I

    .line 25
    .line 26
    iget v1, p0, Lorg/apache/tika/utils/RereadableInputStream;->bufferHighWaterMark:I

    .line 27
    .line 28
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iput v0, p0, Lorg/apache/tika/utils/RereadableInputStream;->bufferHighWaterMark:I

    .line 33
    .line 34
    iput v0, p0, Lorg/apache/tika/utils/RereadableInputStream;->bufferPointer:I

    .line 35
    .line 36
    if-lez v0, :cond_4

    .line 37
    .line 38
    iget-object v0, p0, Lorg/apache/tika/utils/RereadableInputStream;->byteBuffer:[B

    .line 39
    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    const/4 v0, 0x1

    .line 43
    iput-boolean v0, p0, Lorg/apache/tika/utils/RereadableInputStream;->readingFromBuffer:Z

    .line 44
    .line 45
    new-instance v0, Lw2/g;

    .line 46
    .line 47
    invoke-direct {v0}, Lt2/d;-><init>()V

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Lorg/apache/tika/utils/RereadableInputStream;->byteBuffer:[B

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Lw2/g;->W([B)V

    .line 53
    .line 54
    .line 55
    iget v1, p0, Lorg/apache/tika/utils/RereadableInputStream;->bufferHighWaterMark:I

    .line 56
    .line 57
    if-ltz v1, :cond_2

    .line 58
    .line 59
    iput v1, v0, Lw2/g;->n:I

    .line 60
    .line 61
    new-instance v1, Lw2/h;

    .line 62
    .line 63
    invoke-direct {v1, v0}, Lw2/h;-><init>(Lw2/g;)V

    .line 64
    .line 65
    .line 66
    iput-object v1, p0, Lorg/apache/tika/utils/RereadableInputStream;->inputStream:Ljava/io/InputStream;

    .line 67
    .line 68
    return-void

    .line 69
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 70
    .line 71
    const-string v1, "length cannot be negative"

    .line 72
    .line 73
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw v0

    .line 77
    :cond_3
    new-instance v0, Ljava/io/BufferedInputStream;

    .line 78
    .line 79
    new-instance v1, Ljava/io/FileInputStream;

    .line 80
    .line 81
    iget-object v2, p0, Lorg/apache/tika/utils/RereadableInputStream;->storeFile:Ljava/io/File;

    .line 82
    .line 83
    invoke-direct {v1, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 84
    .line 85
    .line 86
    invoke-direct {v0, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 87
    .line 88
    .line 89
    iput-object v0, p0, Lorg/apache/tika/utils/RereadableInputStream;->inputStream:Ljava/io/InputStream;

    .line 90
    .line 91
    return-void

    .line 92
    :cond_4
    iget-object v0, p0, Lorg/apache/tika/utils/RereadableInputStream;->originalInputStream:Ljava/io/InputStream;

    .line 93
    .line 94
    iput-object v0, p0, Lorg/apache/tika/utils/RereadableInputStream;->inputStream:Ljava/io/InputStream;

    .line 95
    .line 96
    return-void

    .line 97
    :cond_5
    new-instance v0, Ljava/io/IOException;

    .line 98
    .line 99
    const-string v1, "Stream is already closed"

    .line 100
    .line 101
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw v0
.end method

.class public Lorg/apache/tika/detect/TextDetector;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/apache/tika/detect/Detector;


# static fields
.field private static final DEFAULT_NUMBER_OF_BYTES_TO_TEST:I = 0x200

.field private static final IS_CONTROL_BYTE:[Z

.field private static final serialVersionUID:J = 0x4242ca628800d135L


# instance fields
.field private final bytesToTest:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    new-array v0, v0, [Z

    .line 4
    .line 5
    sput-object v0, Lorg/apache/tika/detect/TextDetector;->IS_CONTROL_BYTE:[Z

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([ZZ)V

    .line 9
    .line 10
    .line 11
    const/16 v1, 0x9

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    aput-boolean v2, v0, v1

    .line 15
    .line 16
    const/16 v1, 0xa

    .line 17
    .line 18
    aput-boolean v2, v0, v1

    .line 19
    .line 20
    const/16 v1, 0xc

    .line 21
    .line 22
    aput-boolean v2, v0, v1

    .line 23
    .line 24
    const/16 v1, 0xd

    .line 25
    .line 26
    aput-boolean v2, v0, v1

    .line 27
    .line 28
    const/16 v1, 0x1b

    .line 29
    .line 30
    aput-boolean v2, v0, v1

    .line 31
    .line 32
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x200

    .line 1
    invoke-direct {p0, v0}, Lorg/apache/tika/detect/TextDetector;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lorg/apache/tika/detect/TextDetector;->bytesToTest:I

    return-void
.end method


# virtual methods
.method public detect(Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;)Lorg/apache/tika/mime/MediaType;
    .locals 6

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lorg/apache/tika/mime/MediaType;->OCTET_STREAM:Lorg/apache/tika/mime/MediaType;

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    iget p2, p0, Lorg/apache/tika/detect/TextDetector;->bytesToTest:I

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Ljava/io/InputStream;->mark(I)V

    .line 9
    .line 10
    .line 11
    :try_start_0
    new-instance p2, Lorg/apache/tika/detect/TextStatistics;

    .line 12
    .line 13
    invoke-direct {p2}, Lorg/apache/tika/detect/TextStatistics;-><init>()V

    .line 14
    .line 15
    .line 16
    const/16 v0, 0x400

    .line 17
    .line 18
    new-array v1, v0, [B

    .line 19
    .line 20
    iget v2, p0, Lorg/apache/tika/detect/TextDetector;->bytesToTest:I

    .line 21
    .line 22
    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-virtual {p1, v1, v3, v2}, Ljava/io/InputStream;->read([BII)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    move v4, v3

    .line 32
    :goto_0
    const/4 v5, -0x1

    .line 33
    if-eq v2, v5, :cond_1

    .line 34
    .line 35
    iget v5, p0, Lorg/apache/tika/detect/TextDetector;->bytesToTest:I

    .line 36
    .line 37
    if-ge v4, v5, :cond_1

    .line 38
    .line 39
    invoke-virtual {p2, v1, v3, v2}, Lorg/apache/tika/detect/TextStatistics;->addData([BII)V

    .line 40
    .line 41
    .line 42
    add-int/2addr v4, v2

    .line 43
    iget v2, p0, Lorg/apache/tika/detect/TextDetector;->bytesToTest:I

    .line 44
    .line 45
    sub-int/2addr v2, v4

    .line 46
    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    invoke-virtual {p1, v1, v3, v2}, Ljava/io/InputStream;->read([BII)I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception p2

    .line 56
    goto :goto_2

    .line 57
    :cond_1
    invoke-virtual {p2}, Lorg/apache/tika/detect/TextStatistics;->isMostlyAscii()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_3

    .line 62
    .line 63
    invoke-virtual {p2}, Lorg/apache/tika/detect/TextStatistics;->looksLikeUTF8()Z

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    if-eqz p2, :cond_2

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    sget-object p2, Lorg/apache/tika/mime/MediaType;->OCTET_STREAM:Lorg/apache/tika/mime/MediaType;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    .line 73
    .line 74
    .line 75
    return-object p2

    .line 76
    :cond_3
    :goto_1
    :try_start_1
    sget-object p2, Lorg/apache/tika/mime/MediaType;->TEXT_PLAIN:Lorg/apache/tika/mime/MediaType;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    .line 79
    .line 80
    .line 81
    return-object p2

    .line 82
    :goto_2
    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    .line 83
    .line 84
    .line 85
    throw p2
.end method

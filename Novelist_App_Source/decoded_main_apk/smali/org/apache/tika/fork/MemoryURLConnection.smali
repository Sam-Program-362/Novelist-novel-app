.class Lorg/apache/tika/fork/MemoryURLConnection;
.super Ljava/net/URLConnection;
.source "SourceFile"


# instance fields
.field private final data:[B


# direct methods
.method public constructor <init>(Ljava/net/URL;[B)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/net/URLConnection;-><init>(Ljava/net/URL;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lorg/apache/tika/fork/MemoryURLConnection;->data:[B

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public connect()V
    .locals 0

    return-void
.end method

.method public getInputStream()Ljava/io/InputStream;
    .locals 2

    .line 1
    new-instance v0, Ljava/io/ByteArrayInputStream;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/apache/tika/fork/MemoryURLConnection;->data:[B

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

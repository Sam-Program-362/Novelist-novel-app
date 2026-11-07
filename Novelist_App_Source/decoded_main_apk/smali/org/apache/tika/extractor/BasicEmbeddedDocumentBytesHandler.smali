.class public Lorg/apache/tika/extractor/BasicEmbeddedDocumentBytesHandler;
.super Lorg/apache/tika/extractor/AbstractEmbeddedDocumentBytesHandler;
.source "SourceFile"


# instance fields
.field private final config:Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;

.field docBytes:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "[B>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/apache/tika/extractor/AbstractEmbeddedDocumentBytesHandler;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lorg/apache/tika/extractor/BasicEmbeddedDocumentBytesHandler;->docBytes:Ljava/util/Map;

    .line 10
    .line 11
    iput-object p1, p0, Lorg/apache/tika/extractor/BasicEmbeddedDocumentBytesHandler;->config:Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public add(ILorg/apache/tika/metadata/Metadata;Ljava/io/InputStream;)V
    .locals 5

    .line 1
    invoke-super {p0, p1, p2, p3}, Lorg/apache/tika/extractor/AbstractEmbeddedDocumentBytesHandler;->add(ILorg/apache/tika/metadata/Metadata;Ljava/io/InputStream;)V

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Lorg/apache/tika/extractor/BasicEmbeddedDocumentBytesHandler;->docBytes:Ljava/util/Map;

    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    sget-object v0, Ls2/c;->a:[B

    .line 11
    .line 12
    sget v0, Lx2/c;->p:I

    .line 13
    .line 14
    new-instance v0, Lw2/e;

    .line 15
    .line 16
    invoke-direct {v0}, Lt2/d;-><init>()V

    .line 17
    .line 18
    .line 19
    new-instance v1, Lx2/c;

    .line 20
    .line 21
    invoke-direct {v1, v0}, Lx2/c;-><init>(Lw2/e;)V

    .line 22
    .line 23
    .line 24
    new-instance v0, Lx2/b;

    .line 25
    .line 26
    new-instance v2, LM1/N;

    .line 27
    .line 28
    const/16 v3, 0xf

    .line 29
    .line 30
    invoke-direct {v2, v3}, LM1/N;-><init>(I)V

    .line 31
    .line 32
    .line 33
    new-instance v3, LM1/K;

    .line 34
    .line 35
    const/16 v4, 0xe

    .line 36
    .line 37
    invoke-direct {v3, v1, v4}, LM1/K;-><init>(Ljava/lang/Object;I)V

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, v2, v3}, Lx2/b;-><init>(LM1/N;LM1/K;)V

    .line 41
    .line 42
    .line 43
    :try_start_0
    invoke-static {p3, v0}, Ls2/c;->b(Ljava/io/InputStream;Ljava/io/OutputStream;)I

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Lx2/c;->b()[B

    .line 47
    .line 48
    .line 49
    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    invoke-virtual {v0}, Lx2/b;->close()V

    .line 51
    .line 52
    .line 53
    invoke-interface {p2, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :catchall_0
    move-exception p1

    .line 58
    :try_start_1
    invoke-virtual {v0}, Lx2/b;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :catchall_1
    move-exception p2

    .line 63
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    :goto_0
    throw p1
.end method

.method public close()V
    .locals 0

    return-void
.end method

.method public getDocument(I)Ljava/io/InputStream;
    .locals 2

    .line 1
    new-instance v0, Lw2/e;

    .line 2
    .line 3
    invoke-direct {v0}, Lt2/d;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lorg/apache/tika/extractor/BasicEmbeddedDocumentBytesHandler;->docBytes:Ljava/util/Map;

    .line 7
    .line 8
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, [B

    .line 17
    .line 18
    new-instance v1, Lt2/a;

    .line 19
    .line 20
    invoke-direct {v1, p1}, Lt2/a;-><init>([B)V

    .line 21
    .line 22
    .line 23
    iput-object v1, v0, Lt2/b;->m:Lt2/a;

    .line 24
    .line 25
    new-instance p1, Lw2/f;

    .line 26
    .line 27
    iget-object v0, v0, Lt2/b;->m:Lt2/a;

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    new-instance v1, Ljava/io/ByteArrayInputStream;

    .line 32
    .line 33
    iget-object v0, v0, Lt2/a;->m:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, [B

    .line 36
    .line 37
    invoke-direct {v1, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 38
    .line 39
    .line 40
    invoke-direct {p1}, Ljava/io/InputStream;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object v1, p1, Lw2/f;->k:Ljava/io/ByteArrayInputStream;

    .line 44
    .line 45
    const/4 v0, -0x1

    .line 46
    iput v0, p1, Lw2/f;->o:I

    .line 47
    .line 48
    const/16 v0, 0x2000

    .line 49
    .line 50
    new-array v0, v0, [B

    .line 51
    .line 52
    iput-object v0, p1, Lw2/f;->l:[B

    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string v0, "origin == null"

    .line 58
    .line 59
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p1
.end method

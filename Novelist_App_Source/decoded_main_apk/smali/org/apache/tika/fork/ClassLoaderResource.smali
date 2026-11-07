.class Lorg/apache/tika/fork/ClassLoaderResource;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/apache/tika/fork/ForkResource;


# instance fields
.field private final loader:Ljava/lang/ClassLoader;


# direct methods
.method public constructor <init>(Ljava/lang/ClassLoader;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/apache/tika/fork/ClassLoaderResource;->loader:Ljava/lang/ClassLoader;

    .line 5
    .line 6
    return-void
.end method

.method private writeAndCloseStream(Ljava/io/DataOutputStream;Ljava/io/InputStream;)V
    .locals 4

    .line 1
    const v0, 0xffff

    .line 2
    .line 3
    .line 4
    :try_start_0
    new-array v0, v0, [B

    .line 5
    .line 6
    :goto_0
    invoke-virtual {p2, v0}, Ljava/io/InputStream;->read([B)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, -0x1

    .line 11
    const/4 v3, 0x0

    .line 12
    if-eq v1, v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0, v3, v1}, Ljava/io/DataOutputStream;->write([BII)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    invoke-virtual {p1, v3}, Ljava/io/DataOutputStream;->writeShort(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :goto_1
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V

    .line 31
    .line 32
    .line 33
    throw p1
.end method


# virtual methods
.method public process(Ljava/io/DataInputStream;Ljava/io/DataOutputStream;)Ljava/lang/Throwable;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readByte()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x1

    .line 11
    if-ne v0, v2, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lorg/apache/tika/fork/ClassLoaderResource;->loader:Ljava/lang/ClassLoader;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p2, v2}, Ljava/io/DataOutputStream;->writeBoolean(Z)V

    .line 22
    .line 23
    .line 24
    invoke-direct {p0, p2, p1}, Lorg/apache/tika/fork/ClassLoaderResource;->writeAndCloseStream(Ljava/io/DataOutputStream;Ljava/io/InputStream;)V

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    invoke-virtual {p2, v1}, Ljava/io/DataOutputStream;->writeBoolean(Z)V

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    const/4 v3, 0x2

    .line 33
    if-ne v0, v3, :cond_3

    .line 34
    .line 35
    iget-object v0, p0, Lorg/apache/tika/fork/ClassLoaderResource;->loader:Ljava/lang/ClassLoader;

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->getResources(Ljava/lang/String;)Ljava/util/Enumeration;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    :goto_0
    invoke-interface {p1}, Ljava/util/Enumeration;->hasMoreElements()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    invoke-virtual {p2, v2}, Ljava/io/DataOutputStream;->writeBoolean(Z)V

    .line 48
    .line 49
    .line 50
    invoke-interface {p1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Ljava/net/URL;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/net/URL;->openStream()Ljava/io/InputStream;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-direct {p0, p2, v0}, Lorg/apache/tika/fork/ClassLoaderResource;->writeAndCloseStream(Ljava/io/DataOutputStream;Ljava/io/InputStream;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    invoke-virtual {p2, v1}, Ljava/io/DataOutputStream;->writeBoolean(Z)V

    .line 65
    .line 66
    .line 67
    :cond_3
    :goto_1
    invoke-virtual {p2}, Ljava/io/DataOutputStream;->flush()V

    .line 68
    .line 69
    .line 70
    const/4 p1, 0x0

    .line 71
    return-object p1
.end method

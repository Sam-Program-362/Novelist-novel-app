.class Lorg/apache/tika/fork/RecursiveMetadataContentHandlerProxy;
.super Lorg/apache/tika/sax/RecursiveParserWrapperHandler;
.source "SourceFile"

# interfaces
.implements Lorg/apache/tika/fork/ForkProxy;


# static fields
.field public static final COMPLETE:B = 0x5t

.field public static final EMBEDDED_DOCUMENT:B = 0x1t

.field public static final HANDLER_AND_METADATA:B = 0x3t

.field public static final MAIN_DOCUMENT:B = 0x2t

.field public static final METADATA_ONLY:B = 0x4t

.field private static final serialVersionUID:J = 0xa3c2a71864a79b4L


# instance fields
.field private transient output:Ljava/io/DataOutputStream;

.field private final resource:I


# direct methods
.method public constructor <init>(ILorg/apache/tika/sax/ContentHandlerFactory;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lorg/apache/tika/sax/RecursiveParserWrapperHandler;-><init>(Lorg/apache/tika/sax/ContentHandlerFactory;)V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lorg/apache/tika/fork/RecursiveMetadataContentHandlerProxy;->resource:I

    .line 5
    .line 6
    return-void
.end method

.method private doneSending()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lorg/apache/tika/fork/RecursiveMetadataContentHandlerProxy;->output:Ljava/io/DataOutputStream;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_0
    move-exception v0

    .line 8
    new-instance v1, Lorg/xml/sax/SAXException;

    .line 9
    .line 10
    const-string v2, "Unexpected fork proxy problem"

    .line 11
    .line 12
    invoke-direct {v1, v2, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 13
    .line 14
    .line 15
    throw v1
.end method

.method private proxyBackToClient(ILorg/xml/sax/ContentHandler;Lorg/apache/tika/metadata/Metadata;)V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lorg/apache/tika/fork/RecursiveMetadataContentHandlerProxy;->output:Ljava/io/DataOutputStream;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->write(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lorg/apache/tika/fork/RecursiveMetadataContentHandlerProxy;->output:Ljava/io/DataOutputStream;

    .line 8
    .line 9
    iget v2, p0, Lorg/apache/tika/fork/RecursiveMetadataContentHandlerProxy;->resource:I

    .line 10
    .line 11
    invoke-virtual {v0, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lorg/apache/tika/fork/RecursiveMetadataContentHandlerProxy;->output:Ljava/io/DataOutputStream;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 17
    .line 18
    .line 19
    instance-of p1, p2, Ljava/io/Serializable;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    const/4 v0, 0x5

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    :try_start_1
    invoke-direct {p0, p2}, Lorg/apache/tika/fork/RecursiveMetadataContentHandlerProxy;->serialize(Ljava/lang/Object;)[B

    .line 25
    .line 26
    .line 27
    move-result-object p1
    :try_end_1
    .catch Ljava/io/NotSerializableException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    const/4 v2, 0x1

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    goto :goto_2

    .line 32
    :catch_0
    move-exception p1

    .line 33
    goto :goto_1

    .line 34
    :catch_1
    const/4 v2, 0x0

    .line 35
    const/4 p1, 0x0

    .line 36
    :goto_0
    if-eqz v2, :cond_0

    .line 37
    .line 38
    :try_start_2
    iget-object p2, p0, Lorg/apache/tika/fork/RecursiveMetadataContentHandlerProxy;->output:Ljava/io/DataOutputStream;

    .line 39
    .line 40
    invoke-virtual {p2, v1}, Ljava/io/DataOutputStream;->write(I)V

    .line 41
    .line 42
    .line 43
    invoke-direct {p0, p1}, Lorg/apache/tika/fork/RecursiveMetadataContentHandlerProxy;->sendBytes([B)V

    .line 44
    .line 45
    .line 46
    invoke-direct {p0, p3}, Lorg/apache/tika/fork/RecursiveMetadataContentHandlerProxy;->send(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lorg/apache/tika/fork/RecursiveMetadataContentHandlerProxy;->output:Ljava/io/DataOutputStream;

    .line 50
    .line 51
    invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeByte(I)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 52
    .line 53
    .line 54
    invoke-direct {p0}, Lorg/apache/tika/fork/RecursiveMetadataContentHandlerProxy;->doneSending()V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_0
    :try_start_3
    sget-object p1, Lorg/apache/tika/metadata/TikaCoreProperties;->TIKA_CONTENT:Lorg/apache/tika/metadata/Property;

    .line 59
    .line 60
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    invoke-virtual {p3, p1, p2}, Lorg/apache/tika/metadata/Metadata;->set(Lorg/apache/tika/metadata/Property;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Lorg/apache/tika/fork/RecursiveMetadataContentHandlerProxy;->output:Ljava/io/DataOutputStream;

    .line 68
    .line 69
    const/4 p2, 0x4

    .line 70
    invoke-virtual {p1, p2}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 71
    .line 72
    .line 73
    invoke-direct {p0, p3}, Lorg/apache/tika/fork/RecursiveMetadataContentHandlerProxy;->send(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iget-object p1, p0, Lorg/apache/tika/fork/RecursiveMetadataContentHandlerProxy;->output:Ljava/io/DataOutputStream;

    .line 77
    .line 78
    invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeByte(I)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 79
    .line 80
    .line 81
    invoke-direct {p0}, Lorg/apache/tika/fork/RecursiveMetadataContentHandlerProxy;->doneSending()V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :goto_1
    :try_start_4
    new-instance p2, Lorg/xml/sax/SAXException;

    .line 86
    .line 87
    invoke-direct {p2, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/Exception;)V

    .line 88
    .line 89
    .line 90
    throw p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 91
    :goto_2
    invoke-direct {p0}, Lorg/apache/tika/fork/RecursiveMetadataContentHandlerProxy;->doneSending()V

    .line 92
    .line 93
    .line 94
    throw p1
.end method

.method private send(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lorg/apache/tika/fork/RecursiveMetadataContentHandlerProxy;->serialize(Ljava/lang/Object;)[B

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0, p1}, Lorg/apache/tika/fork/RecursiveMetadataContentHandlerProxy;->sendBytes([B)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private sendBytes([B)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/tika/fork/RecursiveMetadataContentHandlerProxy;->output:Ljava/io/DataOutputStream;

    .line 2
    .line 3
    array-length v1, p1

    .line 4
    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lorg/apache/tika/fork/RecursiveMetadataContentHandlerProxy;->output:Ljava/io/DataOutputStream;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lorg/apache/tika/fork/RecursiveMetadataContentHandlerProxy;->output:Ljava/io/DataOutputStream;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/io/DataOutputStream;->flush()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private serialize(Ljava/lang/Object;)[B
    .locals 2

    .line 1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/io/ObjectOutputStream;

    .line 7
    .line 8
    invoke-direct {v1, v0}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 9
    .line 10
    .line 11
    :try_start_0
    invoke-virtual {v1, p1}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/io/ObjectOutputStream;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/io/ObjectOutputStream;->close()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    :try_start_1
    invoke-virtual {v1}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_1
    move-exception v0

    .line 31
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    :goto_0
    throw p1
.end method


# virtual methods
.method public endDocument(Lorg/xml/sax/ContentHandler;Lorg/apache/tika/metadata/Metadata;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;->hasHitMaximumEmbeddedResources()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;->EMBEDDED_RESOURCE_LIMIT_REACHED:Lorg/apache/tika/metadata/Property;

    .line 8
    .line 9
    const-string v1, "true"

    .line 10
    .line 11
    invoke-virtual {p2, v0, v1}, Lorg/apache/tika/metadata/Metadata;->set(Lorg/apache/tika/metadata/Property;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const/4 v0, 0x2

    .line 15
    invoke-direct {p0, v0, p1, p2}, Lorg/apache/tika/fork/RecursiveMetadataContentHandlerProxy;->proxyBackToClient(ILorg/xml/sax/ContentHandler;Lorg/apache/tika/metadata/Metadata;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public endEmbeddedDocument(Lorg/xml/sax/ContentHandler;Lorg/apache/tika/metadata/Metadata;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0, p1, p2}, Lorg/apache/tika/fork/RecursiveMetadataContentHandlerProxy;->proxyBackToClient(ILorg/xml/sax/ContentHandler;Lorg/apache/tika/metadata/Metadata;)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;->decrementEmbeddedDepth()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public init(Ljava/io/DataInputStream;Ljava/io/DataOutputStream;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lorg/apache/tika/fork/RecursiveMetadataContentHandlerProxy;->output:Ljava/io/DataOutputStream;

    .line 2
    .line 3
    return-void
.end method

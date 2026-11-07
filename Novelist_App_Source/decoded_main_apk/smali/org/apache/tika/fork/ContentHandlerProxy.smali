.class Lorg/apache/tika/fork/ContentHandlerProxy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/xml/sax/ContentHandler;
.implements Lorg/apache/tika/fork/ForkProxy;


# static fields
.field public static final CHARACTERS:I = 0x7

.field public static final END_DOCUMENT:I = 0x2

.field public static final END_ELEMENT:I = 0x6

.field public static final END_PREFIX_MAPPING:I = 0x4

.field public static final IGNORABLE_WHITESPACE:I = 0x8

.field public static final PROCESSING_INSTRUCTION:I = 0x9

.field public static final SKIPPED_ENTITY:I = 0xa

.field public static final START_DOCUMENT:I = 0x1

.field public static final START_ELEMENT:I = 0x5

.field public static final START_PREFIX_MAPPING:I = 0x3

.field private static final serialVersionUID:J = 0xa3c2a71864a79b4L


# instance fields
.field private transient output:Ljava/io/DataOutputStream;

.field private final resource:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lorg/apache/tika/fork/ContentHandlerProxy;->resource:I

    .line 5
    .line 6
    return-void
.end method

.method private doneSending()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lorg/apache/tika/fork/ContentHandlerProxy;->output:Ljava/io/DataOutputStream;

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

.method private sendCharacters([CII)V
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Ljava/lang/String;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, Lorg/apache/tika/fork/ContentHandlerProxy;->writeString(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :catch_0
    move-exception p1

    .line 11
    new-instance p2, Lorg/xml/sax/SAXException;

    .line 12
    .line 13
    const-string p3, "Unexpected fork proxy problem"

    .line 14
    .line 15
    invoke-direct {p2, p3, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 16
    .line 17
    .line 18
    throw p2
.end method

.method private sendRequest(I)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lorg/apache/tika/fork/ContentHandlerProxy;->output:Ljava/io/DataOutputStream;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lorg/apache/tika/fork/ContentHandlerProxy;->output:Ljava/io/DataOutputStream;

    .line 8
    .line 9
    iget v1, p0, Lorg/apache/tika/fork/ContentHandlerProxy;->resource:I

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lorg/apache/tika/fork/ContentHandlerProxy;->output:Ljava/io/DataOutputStream;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/io/DataOutputStream;->writeByte(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :catch_0
    move-exception p1

    .line 21
    new-instance v0, Lorg/xml/sax/SAXException;

    .line 22
    .line 23
    const-string v1, "Unexpected fork proxy problem"

    .line 24
    .line 25
    invoke-direct {v0, v1, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 26
    .line 27
    .line 28
    throw v0
.end method

.method private sendString(Ljava/lang/String;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lorg/apache/tika/fork/ContentHandlerProxy;->output:Ljava/io/DataOutputStream;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeBoolean(Z)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, p1}, Lorg/apache/tika/fork/ContentHandlerProxy;->writeString(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catch_0
    move-exception p1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object p1, p0, Lorg/apache/tika/fork/ContentHandlerProxy;->output:Ljava/io/DataOutputStream;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeBoolean(Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :goto_0
    new-instance v0, Lorg/xml/sax/SAXException;

    .line 23
    .line 24
    const-string v1, "Unexpected fork proxy problem"

    .line 25
    .line 26
    invoke-direct {v0, v1, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 27
    .line 28
    .line 29
    throw v0
.end method

.method private writeString(Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-double v0, v0

    .line 6
    const/16 v2, 0x5555

    .line 7
    .line 8
    int-to-double v3, v2

    .line 9
    div-double/2addr v0, v3

    .line 10
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    double-to-int v0, v0

    .line 15
    iget-object v1, p0, Lorg/apache/tika/fork/ContentHandlerProxy;->output:Ljava/io/DataOutputStream;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    :goto_0
    if-ge v1, v0, :cond_1

    .line 22
    .line 23
    add-int/lit8 v3, v0, -0x1

    .line 24
    .line 25
    if-ge v1, v3, :cond_0

    .line 26
    .line 27
    add-int/lit8 v3, v1, 0x1

    .line 28
    .line 29
    mul-int/2addr v3, v2

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    :goto_1
    iget-object v4, p0, Lorg/apache/tika/fork/ContentHandlerProxy;->output:Ljava/io/DataOutputStream;

    .line 36
    .line 37
    mul-int/lit16 v5, v1, 0x5555

    .line 38
    .line 39
    invoke-virtual {p1, v5, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v4, v3}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    return-void
.end method


# virtual methods
.method public characters([CII)V
    .locals 1

    .line 1
    const/4 v0, 0x7

    .line 2
    invoke-direct {p0, v0}, Lorg/apache/tika/fork/ContentHandlerProxy;->sendRequest(I)V

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p1, p2, p3}, Lorg/apache/tika/fork/ContentHandlerProxy;->sendCharacters([CII)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lorg/apache/tika/fork/ContentHandlerProxy;->doneSending()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public endDocument()V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0}, Lorg/apache/tika/fork/ContentHandlerProxy;->sendRequest(I)V

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lorg/apache/tika/fork/ContentHandlerProxy;->doneSending()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x6

    .line 2
    invoke-direct {p0, v0}, Lorg/apache/tika/fork/ContentHandlerProxy;->sendRequest(I)V

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p1}, Lorg/apache/tika/fork/ContentHandlerProxy;->sendString(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p2}, Lorg/apache/tika/fork/ContentHandlerProxy;->sendString(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p3}, Lorg/apache/tika/fork/ContentHandlerProxy;->sendString(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lorg/apache/tika/fork/ContentHandlerProxy;->doneSending()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public endPrefixMapping(Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-direct {p0, v0}, Lorg/apache/tika/fork/ContentHandlerProxy;->sendRequest(I)V

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p1}, Lorg/apache/tika/fork/ContentHandlerProxy;->sendString(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lorg/apache/tika/fork/ContentHandlerProxy;->doneSending()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public ignorableWhitespace([CII)V
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lorg/apache/tika/fork/ContentHandlerProxy;->sendRequest(I)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1, p2, p3}, Lorg/apache/tika/fork/ContentHandlerProxy;->sendCharacters([CII)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lorg/apache/tika/fork/ContentHandlerProxy;->doneSending()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public init(Ljava/io/DataInputStream;Ljava/io/DataOutputStream;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lorg/apache/tika/fork/ContentHandlerProxy;->output:Ljava/io/DataOutputStream;

    .line 2
    .line 3
    return-void
.end method

.method public processingInstruction(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lorg/apache/tika/fork/ContentHandlerProxy;->sendRequest(I)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lorg/apache/tika/fork/ContentHandlerProxy;->sendString(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, p2}, Lorg/apache/tika/fork/ContentHandlerProxy;->sendString(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, Lorg/apache/tika/fork/ContentHandlerProxy;->doneSending()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setDocumentLocator(Lorg/xml/sax/Locator;)V
    .locals 0

    return-void
.end method

.method public skippedEntity(Ljava/lang/String;)V
    .locals 1

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lorg/apache/tika/fork/ContentHandlerProxy;->sendRequest(I)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lorg/apache/tika/fork/ContentHandlerProxy;->sendString(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lorg/apache/tika/fork/ContentHandlerProxy;->doneSending()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public startDocument()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lorg/apache/tika/fork/ContentHandlerProxy;->sendRequest(I)V

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lorg/apache/tika/fork/ContentHandlerProxy;->doneSending()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    invoke-direct {p0, v0}, Lorg/apache/tika/fork/ContentHandlerProxy;->sendRequest(I)V

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p1}, Lorg/apache/tika/fork/ContentHandlerProxy;->sendString(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p2}, Lorg/apache/tika/fork/ContentHandlerProxy;->sendString(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p3}, Lorg/apache/tika/fork/ContentHandlerProxy;->sendString(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    if-eqz p4, :cond_0

    .line 15
    .line 16
    invoke-interface {p4}, Lorg/xml/sax/Attributes;->getLength()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p1, -0x1

    .line 22
    :goto_0
    :try_start_0
    iget-object p2, p0, Lorg/apache/tika/fork/ContentHandlerProxy;->output:Ljava/io/DataOutputStream;

    .line 23
    .line 24
    invoke-virtual {p2, p1}, Ljava/io/DataOutputStream;->writeInt(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    const/4 p2, 0x0

    .line 28
    :goto_1
    if-ge p2, p1, :cond_1

    .line 29
    .line 30
    invoke-interface {p4, p2}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p3

    .line 34
    invoke-direct {p0, p3}, Lorg/apache/tika/fork/ContentHandlerProxy;->sendString(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-interface {p4, p2}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    invoke-direct {p0, p3}, Lorg/apache/tika/fork/ContentHandlerProxy;->sendString(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {p4, p2}, Lorg/xml/sax/Attributes;->getQName(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    invoke-direct {p0, p3}, Lorg/apache/tika/fork/ContentHandlerProxy;->sendString(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {p4, p2}, Lorg/xml/sax/Attributes;->getType(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p3

    .line 55
    invoke-direct {p0, p3}, Lorg/apache/tika/fork/ContentHandlerProxy;->sendString(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-interface {p4, p2}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p3

    .line 62
    invoke-direct {p0, p3}, Lorg/apache/tika/fork/ContentHandlerProxy;->sendString(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    add-int/lit8 p2, p2, 0x1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    invoke-direct {p0}, Lorg/apache/tika/fork/ContentHandlerProxy;->doneSending()V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :catch_0
    move-exception p1

    .line 73
    new-instance p2, Lorg/xml/sax/SAXException;

    .line 74
    .line 75
    const-string p3, "Unexpected fork proxy problem"

    .line 76
    .line 77
    invoke-direct {p2, p3, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 78
    .line 79
    .line 80
    throw p2
.end method

.method public startPrefixMapping(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-direct {p0, v0}, Lorg/apache/tika/fork/ContentHandlerProxy;->sendRequest(I)V

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p1}, Lorg/apache/tika/fork/ContentHandlerProxy;->sendString(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p2}, Lorg/apache/tika/fork/ContentHandlerProxy;->sendString(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lorg/apache/tika/fork/ContentHandlerProxy;->doneSending()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.class public Lorg/apache/tika/sax/SecureContentHandler;
.super Lorg/apache/tika/sax/ContentHandlerDecorator;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/tika/sax/SecureContentHandler$SecureSAXException;
    }
.end annotation


# instance fields
.field private characterCount:J

.field private currentDepth:I

.field private maxDepth:I

.field private maxPackageEntryDepth:I

.field private final packageEntryDepths:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private ratio:J

.field private final stream:Lorg/apache/tika/io/TikaInputStream;

.field private threshold:J


# direct methods
.method public constructor <init>(Lorg/xml/sax/ContentHandler;Lorg/apache/tika/io/TikaInputStream;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lorg/apache/tika/sax/ContentHandlerDecorator;-><init>(Lorg/xml/sax/ContentHandler;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/util/LinkedList;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lorg/apache/tika/sax/SecureContentHandler;->packageEntryDepths:Ljava/util/LinkedList;

    .line 10
    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    iput-wide v0, p0, Lorg/apache/tika/sax/SecureContentHandler;->characterCount:J

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput p1, p0, Lorg/apache/tika/sax/SecureContentHandler;->currentDepth:I

    .line 17
    .line 18
    const-wide/32 v0, 0xf4240

    .line 19
    .line 20
    .line 21
    iput-wide v0, p0, Lorg/apache/tika/sax/SecureContentHandler;->threshold:J

    .line 22
    .line 23
    const-wide/16 v0, 0x64

    .line 24
    .line 25
    iput-wide v0, p0, Lorg/apache/tika/sax/SecureContentHandler;->ratio:J

    .line 26
    .line 27
    const/16 p1, 0x64

    .line 28
    .line 29
    iput p1, p0, Lorg/apache/tika/sax/SecureContentHandler;->maxDepth:I

    .line 30
    .line 31
    const/16 p1, 0xa

    .line 32
    .line 33
    iput p1, p0, Lorg/apache/tika/sax/SecureContentHandler;->maxPackageEntryDepth:I

    .line 34
    .line 35
    iput-object p2, p0, Lorg/apache/tika/sax/SecureContentHandler;->stream:Lorg/apache/tika/io/TikaInputStream;

    .line 36
    .line 37
    return-void
.end method

.method private getByteCount()J
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lorg/apache/tika/sax/SecureContentHandler;->stream:Lorg/apache/tika/io/TikaInputStream;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/apache/tika/io/TikaInputStream;->hasLength()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lorg/apache/tika/sax/SecureContentHandler;->stream:Lorg/apache/tika/io/TikaInputStream;

    .line 10
    .line 11
    invoke-virtual {v0}, Lorg/apache/tika/io/TikaInputStream;->getLength()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    return-wide v0

    .line 16
    :catch_0
    move-exception v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, Lorg/apache/tika/sax/SecureContentHandler;->stream:Lorg/apache/tika/io/TikaInputStream;

    .line 19
    .line 20
    invoke-virtual {v0}, Lorg/apache/tika/io/TikaInputStream;->getPosition()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    return-wide v0

    .line 25
    :goto_0
    new-instance v1, Lorg/xml/sax/SAXException;

    .line 26
    .line 27
    const-string v2, "Unable to get stream length"

    .line 28
    .line 29
    invoke-direct {v1, v2, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 30
    .line 31
    .line 32
    throw v1
.end method


# virtual methods
.method public advance(I)V
    .locals 6

    .line 1
    iget-wide v0, p0, Lorg/apache/tika/sax/SecureContentHandler;->characterCount:J

    .line 2
    .line 3
    int-to-long v2, p1

    .line 4
    add-long/2addr v0, v2

    .line 5
    iput-wide v0, p0, Lorg/apache/tika/sax/SecureContentHandler;->characterCount:J

    .line 6
    .line 7
    invoke-direct {p0}, Lorg/apache/tika/sax/SecureContentHandler;->getByteCount()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    iget-wide v2, p0, Lorg/apache/tika/sax/SecureContentHandler;->characterCount:J

    .line 12
    .line 13
    iget-wide v4, p0, Lorg/apache/tika/sax/SecureContentHandler;->threshold:J

    .line 14
    .line 15
    cmp-long p1, v2, v4

    .line 16
    .line 17
    if-lez p1, :cond_1

    .line 18
    .line 19
    iget-wide v4, p0, Lorg/apache/tika/sax/SecureContentHandler;->ratio:J

    .line 20
    .line 21
    mul-long/2addr v4, v0

    .line 22
    cmp-long p1, v2, v4

    .line 23
    .line 24
    if-gtz p1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance p1, Lorg/apache/tika/sax/SecureContentHandler$SecureSAXException;

    .line 28
    .line 29
    iget-wide v2, p0, Lorg/apache/tika/sax/SecureContentHandler;->characterCount:J

    .line 30
    .line 31
    new-instance v4, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v5, "Suspected zip bomb: "

    .line 34
    .line 35
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v0, " input bytes produced "

    .line 42
    .line 43
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v0, " output characters"

    .line 50
    .line 51
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-direct {p1, p0, v0}, Lorg/apache/tika/sax/SecureContentHandler$SecureSAXException;-><init>(Lorg/apache/tika/sax/SecureContentHandler;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p1

    .line 62
    :cond_1
    :goto_0
    return-void
.end method

.method public characters([CII)V
    .locals 0

    .line 1
    invoke-virtual {p0, p3}, Lorg/apache/tika/sax/SecureContentHandler;->advance(I)V

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2, p3}, Lorg/apache/tika/sax/ContentHandlerDecorator;->characters([CII)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lorg/apache/tika/sax/ContentHandlerDecorator;->endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lorg/apache/tika/sax/SecureContentHandler;->packageEntryDepths:Ljava/util/LinkedList;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, Lorg/apache/tika/sax/SecureContentHandler;->packageEntryDepths:Ljava/util/LinkedList;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iget p2, p0, Lorg/apache/tika/sax/SecureContentHandler;->currentDepth:I

    .line 25
    .line 26
    if-ne p1, p2, :cond_0

    .line 27
    .line 28
    iget-object p1, p0, Lorg/apache/tika/sax/SecureContentHandler;->packageEntryDepths:Ljava/util/LinkedList;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/util/LinkedList;->removeLast()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    :cond_0
    iget p1, p0, Lorg/apache/tika/sax/SecureContentHandler;->currentDepth:I

    .line 34
    .line 35
    add-int/lit8 p1, p1, -0x1

    .line 36
    .line 37
    iput p1, p0, Lorg/apache/tika/sax/SecureContentHandler;->currentDepth:I

    .line 38
    .line 39
    return-void
.end method

.method public getMaximumCompressionRatio()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lorg/apache/tika/sax/SecureContentHandler;->ratio:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getMaximumDepth()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/tika/sax/SecureContentHandler;->maxDepth:I

    .line 2
    .line 3
    return v0
.end method

.method public getMaximumPackageEntryDepth()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/tika/sax/SecureContentHandler;->maxPackageEntryDepth:I

    .line 2
    .line 3
    return v0
.end method

.method public getOutputThreshold()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lorg/apache/tika/sax/SecureContentHandler;->threshold:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public ignorableWhitespace([CII)V
    .locals 0

    .line 1
    invoke-virtual {p0, p3}, Lorg/apache/tika/sax/SecureContentHandler;->advance(I)V

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2, p3}, Lorg/apache/tika/sax/ContentHandlerDecorator;->ignorableWhitespace([CII)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setMaximumCompressionRatio(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lorg/apache/tika/sax/SecureContentHandler;->ratio:J

    .line 2
    .line 3
    return-void
.end method

.method public setMaximumDepth(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/apache/tika/sax/SecureContentHandler;->maxDepth:I

    .line 2
    .line 3
    return-void
.end method

.method public setMaximumPackageEntryDepth(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/apache/tika/sax/SecureContentHandler;->maxPackageEntryDepth:I

    .line 2
    .line 3
    return-void
.end method

.method public setOutputThreshold(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lorg/apache/tika/sax/SecureContentHandler;->threshold:J

    .line 2
    .line 3
    return-void
.end method

.method public startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 3

    .line 1
    iget v0, p0, Lorg/apache/tika/sax/SecureContentHandler;->currentDepth:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lorg/apache/tika/sax/SecureContentHandler;->currentDepth:I

    .line 6
    .line 7
    iget v1, p0, Lorg/apache/tika/sax/SecureContentHandler;->maxDepth:I

    .line 8
    .line 9
    const-string v2, "Suspected zip bomb: "

    .line 10
    .line 11
    if-ge v0, v1, :cond_2

    .line 12
    .line 13
    const-string v0, "div"

    .line 14
    .line 15
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    const-string v0, "class"

    .line 22
    .line 23
    invoke-interface {p4, v0}, Lorg/xml/sax/Attributes;->getValue(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "package-entry"

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    iget-object v0, p0, Lorg/apache/tika/sax/SecureContentHandler;->packageEntryDepths:Ljava/util/LinkedList;

    .line 36
    .line 37
    iget v1, p0, Lorg/apache/tika/sax/SecureContentHandler;->currentDepth:I

    .line 38
    .line 39
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lorg/apache/tika/sax/SecureContentHandler;->packageEntryDepths:Ljava/util/LinkedList;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget v1, p0, Lorg/apache/tika/sax/SecureContentHandler;->maxPackageEntryDepth:I

    .line 53
    .line 54
    if-ge v0, v1, :cond_0

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    new-instance p1, Lorg/apache/tika/sax/SecureContentHandler$SecureSAXException;

    .line 58
    .line 59
    iget-object p2, p0, Lorg/apache/tika/sax/SecureContentHandler;->packageEntryDepths:Ljava/util/LinkedList;

    .line 60
    .line 61
    invoke-virtual {p2}, Ljava/util/LinkedList;->size()I

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    const-string p3, " levels of package entry nesting"

    .line 66
    .line 67
    invoke-static {v2, p2, p3}, LB1/e;->h(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    invoke-direct {p1, p0, p2}, Lorg/apache/tika/sax/SecureContentHandler$SecureSAXException;-><init>(Lorg/apache/tika/sax/SecureContentHandler;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p1

    .line 75
    :cond_1
    :goto_0
    invoke-super {p0, p1, p2, p3, p4}, Lorg/apache/tika/sax/ContentHandlerDecorator;->startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_2
    new-instance p1, Lorg/apache/tika/sax/SecureContentHandler$SecureSAXException;

    .line 80
    .line 81
    iget p2, p0, Lorg/apache/tika/sax/SecureContentHandler;->currentDepth:I

    .line 82
    .line 83
    const-string p3, " levels of XML element nesting"

    .line 84
    .line 85
    invoke-static {v2, p2, p3}, LB1/e;->h(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    invoke-direct {p1, p0, p2}, Lorg/apache/tika/sax/SecureContentHandler$SecureSAXException;-><init>(Lorg/apache/tika/sax/SecureContentHandler;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw p1
.end method

.method public throwIfCauseOf(Lorg/xml/sax/SAXException;)V
    .locals 2

    .line 1
    instance-of v0, p1, Lorg/apache/tika/sax/SecureContentHandler$SecureSAXException;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lorg/apache/tika/sax/SecureContentHandler$SecureSAXException;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Lorg/apache/tika/sax/SecureContentHandler$SecureSAXException;->isCausedBy(Lorg/apache/tika/sax/SecureContentHandler;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance v0, Lorg/apache/tika/exception/TikaException;

    .line 16
    .line 17
    const-string v1, "Zip bomb detected!"

    .line 18
    .line 19
    invoke-direct {v0, v1, p1}, Lorg/apache/tika/exception/TikaException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    throw v0

    .line 23
    :cond_1
    :goto_0
    return-void
.end method

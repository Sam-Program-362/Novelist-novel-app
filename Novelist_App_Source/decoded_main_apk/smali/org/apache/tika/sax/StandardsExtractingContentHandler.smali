.class public Lorg/apache/tika/sax/StandardsExtractingContentHandler;
.super Lorg/apache/tika/sax/ContentHandlerDecorator;
.source "SourceFile"


# static fields
.field public static final STANDARD_REFERENCES:Ljava/lang/String; = "standard_references"


# instance fields
.field private maxBufferLength:I

.field private final metadata:Lorg/apache/tika/metadata/Metadata;

.field private final stringBuilder:Ljava/lang/StringBuilder;

.field private threshold:D


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 6
    new-instance v0, Lorg/xml/sax/helpers/DefaultHandler;

    invoke-direct {v0}, Lorg/xml/sax/helpers/DefaultHandler;-><init>()V

    new-instance v1, Lorg/apache/tika/metadata/Metadata;

    invoke-direct {v1}, Lorg/apache/tika/metadata/Metadata;-><init>()V

    invoke-direct {p0, v0, v1}, Lorg/apache/tika/sax/StandardsExtractingContentHandler;-><init>(Lorg/xml/sax/ContentHandler;Lorg/apache/tika/metadata/Metadata;)V

    return-void
.end method

.method public constructor <init>(Lorg/xml/sax/ContentHandler;Lorg/apache/tika/metadata/Metadata;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lorg/apache/tika/sax/ContentHandlerDecorator;-><init>(Lorg/xml/sax/ContentHandler;)V

    const p1, 0x186a0

    .line 2
    iput p1, p0, Lorg/apache/tika/sax/StandardsExtractingContentHandler;->maxBufferLength:I

    const-wide/16 v0, 0x0

    .line 3
    iput-wide v0, p0, Lorg/apache/tika/sax/StandardsExtractingContentHandler;->threshold:D

    .line 4
    iput-object p2, p0, Lorg/apache/tika/sax/StandardsExtractingContentHandler;->metadata:Lorg/apache/tika/metadata/Metadata;

    .line 5
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iput-object p1, p0, Lorg/apache/tika/sax/StandardsExtractingContentHandler;->stringBuilder:Ljava/lang/StringBuilder;

    return-void
.end method


# virtual methods
.method public characters([CII)V
    .locals 2

    .line 1
    :try_start_0
    iget v0, p0, Lorg/apache/tika/sax/StandardsExtractingContentHandler;->maxBufferLength:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-le v0, v1, :cond_1

    .line 5
    .line 6
    iget-object v1, p0, Lorg/apache/tika/sax/StandardsExtractingContentHandler;->stringBuilder:Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    sub-int/2addr v0, v1

    .line 13
    if-le v0, p3, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move p3, v0

    .line 17
    goto :goto_0

    .line 18
    :catch_0
    move-exception p1

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/String;

    .line 21
    .line 22
    add-int v1, p2, p3

    .line 23
    .line 24
    invoke-static {p1, p2, v1}, Ljava/util/Arrays;->copyOfRange([CII)[C

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lorg/apache/tika/sax/StandardsExtractingContentHandler;->stringBuilder:Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-super {p0, p1, p2, p3}, Lorg/apache/tika/sax/ContentHandlerDecorator;->characters([CII)V
    :try_end_0
    .catch Lorg/xml/sax/SAXException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :goto_1
    invoke-virtual {p0, p1}, Lorg/apache/tika/sax/ContentHandlerDecorator;->handleException(Lorg/xml/sax/SAXException;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public endDocument()V
    .locals 6

    .line 1
    invoke-super {p0}, Lorg/apache/tika/sax/ContentHandlerDecorator;->endDocument()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/apache/tika/sax/StandardsExtractingContentHandler;->stringBuilder:Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-wide v1, p0, Lorg/apache/tika/sax/StandardsExtractingContentHandler;->threshold:D

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Lorg/apache/tika/sax/StandardsText;->extractStandardReferences(Ljava/lang/String;D)Ljava/util/ArrayList;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    :goto_0
    if-ge v2, v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    check-cast v3, Lorg/apache/tika/sax/StandardReference;

    .line 30
    .line 31
    iget-object v4, p0, Lorg/apache/tika/sax/StandardsExtractingContentHandler;->metadata:Lorg/apache/tika/metadata/Metadata;

    .line 32
    .line 33
    const-string v5, "standard_references"

    .line 34
    .line 35
    invoke-virtual {v3}, Lorg/apache/tika/sax/StandardReference;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v4, v5, v3}, Lorg/apache/tika/metadata/Metadata;->add(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    return-void
.end method

.method public getThreshold()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lorg/apache/tika/sax/StandardsExtractingContentHandler;->threshold:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public setMaxBufferLength(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/apache/tika/sax/StandardsExtractingContentHandler;->maxBufferLength:I

    .line 2
    .line 3
    return-void
.end method

.method public setThreshold(D)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lorg/apache/tika/sax/StandardsExtractingContentHandler;->threshold:D

    .line 2
    .line 3
    return-void
.end method

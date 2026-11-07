.class public Lorg/apache/tika/sax/TaggedContentHandler;
.super Lorg/apache/tika/sax/ContentHandlerDecorator;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lorg/xml/sax/ContentHandler;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lorg/apache/tika/sax/ContentHandlerDecorator;-><init>(Lorg/xml/sax/ContentHandler;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public handleException(Lorg/xml/sax/SAXException;)V
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/tika/sax/TaggedSAXException;

    .line 2
    .line 3
    invoke-direct {v0, p1, p0}, Lorg/apache/tika/sax/TaggedSAXException;-><init>(Lorg/xml/sax/SAXException;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    throw v0
.end method

.method public isCauseOf(Lorg/xml/sax/SAXException;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lorg/apache/tika/sax/TaggedSAXException;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Lorg/apache/tika/sax/TaggedSAXException;

    .line 7
    .line 8
    invoke-virtual {p1}, Lorg/apache/tika/sax/TaggedSAXException;->getTag()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-ne p0, p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    return p1

    .line 16
    :cond_0
    return v1
.end method

.method public throwIfCauseOf(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lorg/apache/tika/sax/TaggedSAXException;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p1, Lorg/apache/tika/sax/TaggedSAXException;

    .line 6
    .line 7
    invoke-virtual {p1}, Lorg/apache/tika/sax/TaggedSAXException;->getTag()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eq p0, v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p1}, Lorg/apache/tika/sax/TaggedSAXException;->getCause()Lorg/xml/sax/SAXException;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    throw p1

    .line 19
    :cond_1
    :goto_0
    return-void
.end method

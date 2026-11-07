.class public Lorg/apache/tika/sax/EndDocumentShieldingContentHandler;
.super Lorg/apache/tika/sax/ContentHandlerDecorator;
.source "SourceFile"


# instance fields
.field private endDocumentCalled:Z


# direct methods
.method public constructor <init>(Lorg/xml/sax/ContentHandler;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lorg/apache/tika/sax/ContentHandlerDecorator;-><init>(Lorg/xml/sax/ContentHandler;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Lorg/apache/tika/sax/EndDocumentShieldingContentHandler;->endDocumentCalled:Z

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public endDocument()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lorg/apache/tika/sax/EndDocumentShieldingContentHandler;->endDocumentCalled:Z

    .line 3
    .line 4
    return-void
.end method

.method public isEndDocumentWasCalled()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/tika/sax/EndDocumentShieldingContentHandler;->endDocumentCalled:Z

    .line 2
    .line 3
    return v0
.end method

.method public reallyEndDocument()V
    .locals 0

    .line 1
    invoke-super {p0}, Lorg/apache/tika/sax/ContentHandlerDecorator;->endDocument()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

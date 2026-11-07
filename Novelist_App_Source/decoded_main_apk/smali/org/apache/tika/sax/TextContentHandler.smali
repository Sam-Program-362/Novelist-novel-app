.class public Lorg/apache/tika/sax/TextContentHandler;
.super Lorg/xml/sax/helpers/DefaultHandler;
.source "SourceFile"


# static fields
.field private static final SPACE:[C


# instance fields
.field private final addSpaceBetweenElements:Z

.field private final delegate:Lorg/xml/sax/ContentHandler;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v0, v0, [C

    .line 3
    .line 4
    const/16 v1, 0x20

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-char v1, v0, v2

    .line 8
    .line 9
    sput-object v0, Lorg/apache/tika/sax/TextContentHandler;->SPACE:[C

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lorg/xml/sax/ContentHandler;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lorg/apache/tika/sax/TextContentHandler;-><init>(Lorg/xml/sax/ContentHandler;Z)V

    return-void
.end method

.method public constructor <init>(Lorg/xml/sax/ContentHandler;Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lorg/xml/sax/helpers/DefaultHandler;-><init>()V

    .line 3
    iput-object p1, p0, Lorg/apache/tika/sax/TextContentHandler;->delegate:Lorg/xml/sax/ContentHandler;

    .line 4
    iput-boolean p2, p0, Lorg/apache/tika/sax/TextContentHandler;->addSpaceBetweenElements:Z

    return-void
.end method


# virtual methods
.method public characters([CII)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/TextContentHandler;->delegate:Lorg/xml/sax/ContentHandler;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Lorg/xml/sax/ContentHandler;->characters([CII)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public endDocument()V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/TextContentHandler;->delegate:Lorg/xml/sax/ContentHandler;

    .line 2
    .line 3
    invoke-interface {v0}, Lorg/xml/sax/ContentHandler;->endDocument()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public ignorableWhitespace([CII)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/TextContentHandler;->delegate:Lorg/xml/sax/ContentHandler;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Lorg/xml/sax/ContentHandler;->ignorableWhitespace([CII)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setDocumentLocator(Lorg/xml/sax/Locator;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/TextContentHandler;->delegate:Lorg/xml/sax/ContentHandler;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lorg/xml/sax/ContentHandler;->setDocumentLocator(Lorg/xml/sax/Locator;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public startDocument()V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/TextContentHandler;->delegate:Lorg/xml/sax/ContentHandler;

    .line 2
    .line 3
    invoke-interface {v0}, Lorg/xml/sax/ContentHandler;->startDocument()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 0

    .line 1
    iget-boolean p1, p0, Lorg/apache/tika/sax/TextContentHandler;->addSpaceBetweenElements:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lorg/apache/tika/sax/TextContentHandler;->delegate:Lorg/xml/sax/ContentHandler;

    .line 6
    .line 7
    sget-object p2, Lorg/apache/tika/sax/TextContentHandler;->SPACE:[C

    .line 8
    .line 9
    const/4 p3, 0x0

    .line 10
    array-length p4, p2

    .line 11
    invoke-interface {p1, p2, p3, p4}, Lorg/xml/sax/ContentHandler;->characters([CII)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/TextContentHandler;->delegate:Lorg/xml/sax/ContentHandler;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

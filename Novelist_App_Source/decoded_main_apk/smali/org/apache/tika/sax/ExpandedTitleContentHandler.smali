.class public Lorg/apache/tika/sax/ExpandedTitleContentHandler;
.super Lorg/apache/tika/sax/ContentHandlerDecorator;
.source "SourceFile"


# static fields
.field private static final TITLE_TAG:Ljava/lang/String; = "TITLE"


# instance fields
.field private isTitleTagOpen:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/apache/tika/sax/ContentHandlerDecorator;-><init>()V

    return-void
.end method

.method public constructor <init>(Lorg/xml/sax/ContentHandler;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lorg/apache/tika/sax/ContentHandlerDecorator;-><init>(Lorg/xml/sax/ContentHandler;)V

    return-void
.end method


# virtual methods
.method public characters([CII)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/tika/sax/ExpandedTitleContentHandler;->isTitleTagOpen:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    if-nez p3, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    :try_start_0
    new-array p2, p1, [C

    .line 9
    .line 10
    const/4 p3, 0x1

    .line 11
    invoke-super {p0, p2, p1, p3}, Lorg/apache/tika/sax/ContentHandlerDecorator;->characters([CII)V
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    :catch_0
    return-void

    .line 15
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lorg/apache/tika/sax/ContentHandlerDecorator;->characters([CII)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lorg/apache/tika/sax/ContentHandlerDecorator;->endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    const-string p3, "TITLE"

    .line 5
    .line 6
    invoke-virtual {p3, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    const-string p2, "http://www.w3.org/1999/xhtml"

    .line 13
    .line 14
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    iput-boolean p1, p0, Lorg/apache/tika/sax/ExpandedTitleContentHandler;->isTitleTagOpen:Z

    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public startDocument()V
    .locals 1

    .line 1
    invoke-super {p0}, Lorg/apache/tika/sax/ContentHandlerDecorator;->startDocument()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lorg/apache/tika/sax/ExpandedTitleContentHandler;->isTitleTagOpen:Z

    .line 6
    .line 7
    return-void
.end method

.method public startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lorg/apache/tika/sax/ContentHandlerDecorator;->startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V

    .line 2
    .line 3
    .line 4
    const-string p3, "TITLE"

    .line 5
    .line 6
    invoke-virtual {p3, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    const-string p2, "http://www.w3.org/1999/xhtml"

    .line 13
    .line 14
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    iput-boolean p1, p0, Lorg/apache/tika/sax/ExpandedTitleContentHandler;->isTitleTagOpen:Z

    .line 22
    .line 23
    :cond_0
    return-void
.end method

.class public Lorg/apache/tika/sax/BodyContentHandler;
.super Lorg/apache/tika/sax/ContentHandlerDecorator;
.source "SourceFile"


# static fields
.field private static final MATCHER:Lorg/apache/tika/sax/xpath/Matcher;

.field private static final PARSER:Lorg/apache/tika/sax/xpath/XPathParser;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lorg/apache/tika/sax/xpath/XPathParser;

    .line 2
    .line 3
    const-string v1, "xhtml"

    .line 4
    .line 5
    const-string v2, "http://www.w3.org/1999/xhtml"

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lorg/apache/tika/sax/xpath/XPathParser;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lorg/apache/tika/sax/BodyContentHandler;->PARSER:Lorg/apache/tika/sax/xpath/XPathParser;

    .line 11
    .line 12
    const-string v1, "/xhtml:html/xhtml:body/descendant::node()"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lorg/apache/tika/sax/xpath/XPathParser;->parse(Ljava/lang/String;)Lorg/apache/tika/sax/xpath/Matcher;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, Lorg/apache/tika/sax/BodyContentHandler;->MATCHER:Lorg/apache/tika/sax/xpath/Matcher;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 4
    new-instance v0, Lorg/apache/tika/sax/WriteOutContentHandler;

    invoke-direct {v0}, Lorg/apache/tika/sax/WriteOutContentHandler;-><init>()V

    invoke-direct {p0, v0}, Lorg/apache/tika/sax/BodyContentHandler;-><init>(Lorg/xml/sax/ContentHandler;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 3
    new-instance v0, Lorg/apache/tika/sax/WriteOutContentHandler;

    invoke-direct {v0, p1}, Lorg/apache/tika/sax/WriteOutContentHandler;-><init>(I)V

    invoke-direct {p0, v0}, Lorg/apache/tika/sax/BodyContentHandler;-><init>(Lorg/xml/sax/ContentHandler;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/Writer;)V
    .locals 1

    .line 2
    new-instance v0, Lorg/apache/tika/sax/WriteOutContentHandler;

    invoke-direct {v0, p1}, Lorg/apache/tika/sax/WriteOutContentHandler;-><init>(Ljava/io/Writer;)V

    invoke-direct {p0, v0}, Lorg/apache/tika/sax/BodyContentHandler;-><init>(Lorg/xml/sax/ContentHandler;)V

    return-void
.end method

.method public constructor <init>(Lorg/xml/sax/ContentHandler;)V
    .locals 2

    .line 1
    new-instance v0, Lorg/apache/tika/sax/xpath/MatchingContentHandler;

    sget-object v1, Lorg/apache/tika/sax/BodyContentHandler;->MATCHER:Lorg/apache/tika/sax/xpath/Matcher;

    invoke-direct {v0, p1, v1}, Lorg/apache/tika/sax/xpath/MatchingContentHandler;-><init>(Lorg/xml/sax/ContentHandler;Lorg/apache/tika/sax/xpath/Matcher;)V

    invoke-direct {p0, v0}, Lorg/apache/tika/sax/ContentHandlerDecorator;-><init>(Lorg/xml/sax/ContentHandler;)V

    return-void
.end method

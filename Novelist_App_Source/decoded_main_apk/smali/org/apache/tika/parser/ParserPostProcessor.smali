.class public Lorg/apache/tika/parser/ParserPostProcessor;
.super Lorg/apache/tika/parser/ParserDecorator;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lorg/apache/tika/parser/Parser;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lorg/apache/tika/parser/ParserDecorator;-><init>(Lorg/apache/tika/parser/Parser;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public parse(Ljava/io/InputStream;Lorg/xml/sax/ContentHandler;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)V
    .locals 4

    .line 1
    new-instance v0, Lorg/apache/tika/sax/BodyContentHandler;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/apache/tika/sax/BodyContentHandler;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lorg/apache/tika/sax/TeeContentHandler;

    .line 7
    .line 8
    const/4 v2, 0x2

    .line 9
    new-array v2, v2, [Lorg/xml/sax/ContentHandler;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    aput-object p2, v2, v3

    .line 13
    .line 14
    const/4 p2, 0x1

    .line 15
    aput-object v0, v2, p2

    .line 16
    .line 17
    invoke-direct {v1, v2}, Lorg/apache/tika/sax/TeeContentHandler;-><init>([Lorg/xml/sax/ContentHandler;)V

    .line 18
    .line 19
    .line 20
    invoke-super {p0, p1, v1, p3, p4}, Lorg/apache/tika/parser/ParserDecorator;->parse(Ljava/io/InputStream;Lorg/xml/sax/ContentHandler;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lorg/apache/tika/sax/ContentHandlerDecorator;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const-string p2, "fulltext"

    .line 28
    .line 29
    invoke-virtual {p3, p2, p1}, Lorg/apache/tika/metadata/Metadata;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    const/16 p4, 0x1f4

    .line 37
    .line 38
    invoke-static {p2, p4}, Ljava/lang/Math;->min(II)I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    const-string p4, "summary"

    .line 43
    .line 44
    invoke-virtual {p1, v3, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-virtual {p3, p4, p2}, Lorg/apache/tika/metadata/Metadata;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-static {p1}, Lorg/apache/tika/utils/RegexUtils;->extractLinks(Ljava/lang/String;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    if-eqz p2, :cond_0

    .line 64
    .line 65
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    check-cast p2, Ljava/lang/String;

    .line 70
    .line 71
    const-string p4, "outlinks"

    .line 72
    .line 73
    invoke-virtual {p3, p4, p2}, Lorg/apache/tika/metadata/Metadata;->add(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    return-void
.end method

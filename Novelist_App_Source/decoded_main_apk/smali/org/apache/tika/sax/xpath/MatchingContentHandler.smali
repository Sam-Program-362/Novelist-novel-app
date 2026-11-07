.class public Lorg/apache/tika/sax/xpath/MatchingContentHandler;
.super Lorg/apache/tika/sax/ContentHandlerDecorator;
.source "SourceFile"


# instance fields
.field private matcher:Lorg/apache/tika/sax/xpath/Matcher;

.field private final matchers:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Lorg/apache/tika/sax/xpath/Matcher;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lorg/xml/sax/ContentHandler;Lorg/apache/tika/sax/xpath/Matcher;)V
    .locals 0

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
    iput-object p1, p0, Lorg/apache/tika/sax/xpath/MatchingContentHandler;->matchers:Ljava/util/LinkedList;

    .line 10
    .line 11
    iput-object p2, p0, Lorg/apache/tika/sax/xpath/MatchingContentHandler;->matcher:Lorg/apache/tika/sax/xpath/Matcher;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public characters([CII)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/xpath/MatchingContentHandler;->matcher:Lorg/apache/tika/sax/xpath/Matcher;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/apache/tika/sax/xpath/Matcher;->matchesText()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-super {p0, p1, p2, p3}, Lorg/apache/tika/sax/ContentHandlerDecorator;->characters([CII)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/xpath/MatchingContentHandler;->matcher:Lorg/apache/tika/sax/xpath/Matcher;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/apache/tika/sax/xpath/Matcher;->matchesElement()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-super {p0, p1, p2, p3}, Lorg/apache/tika/sax/ContentHandlerDecorator;->endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object p1, p0, Lorg/apache/tika/sax/xpath/MatchingContentHandler;->matchers:Ljava/util/LinkedList;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-nez p1, :cond_1

    .line 19
    .line 20
    iget-object p1, p0, Lorg/apache/tika/sax/xpath/MatchingContentHandler;->matchers:Ljava/util/LinkedList;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lorg/apache/tika/sax/xpath/Matcher;

    .line 27
    .line 28
    iput-object p1, p0, Lorg/apache/tika/sax/xpath/MatchingContentHandler;->matcher:Lorg/apache/tika/sax/xpath/Matcher;

    .line 29
    .line 30
    :cond_1
    return-void
.end method

.method public ignorableWhitespace([CII)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/xpath/MatchingContentHandler;->matcher:Lorg/apache/tika/sax/xpath/Matcher;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/apache/tika/sax/xpath/Matcher;->matchesText()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-super {p0, p1, p2, p3}, Lorg/apache/tika/sax/ContentHandlerDecorator;->ignorableWhitespace([CII)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public processingInstruction(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public skippedEntity(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/xpath/MatchingContentHandler;->matcher:Lorg/apache/tika/sax/xpath/Matcher;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/apache/tika/sax/xpath/Matcher;->matchesText()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-super {p0, p1}, Lorg/apache/tika/sax/ContentHandlerDecorator;->skippedEntity(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/xpath/MatchingContentHandler;->matchers:Ljava/util/LinkedList;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/apache/tika/sax/xpath/MatchingContentHandler;->matcher:Lorg/apache/tika/sax/xpath/Matcher;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lorg/apache/tika/sax/xpath/MatchingContentHandler;->matcher:Lorg/apache/tika/sax/xpath/Matcher;

    .line 9
    .line 10
    invoke-virtual {v0, p1, p2}, Lorg/apache/tika/sax/xpath/Matcher;->descend(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/tika/sax/xpath/Matcher;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lorg/apache/tika/sax/xpath/MatchingContentHandler;->matcher:Lorg/apache/tika/sax/xpath/Matcher;

    .line 15
    .line 16
    new-instance v1, Lorg/xml/sax/helpers/AttributesImpl;

    .line 17
    .line 18
    invoke-direct {v1}, Lorg/xml/sax/helpers/AttributesImpl;-><init>()V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    :goto_0
    invoke-interface {p4}, Lorg/xml/sax/Attributes;->getLength()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-ge v0, v2, :cond_1

    .line 27
    .line 28
    invoke-interface {p4, v0}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-interface {p4, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    iget-object v4, p0, Lorg/apache/tika/sax/xpath/MatchingContentHandler;->matcher:Lorg/apache/tika/sax/xpath/Matcher;

    .line 37
    .line 38
    invoke-virtual {v4, v2, v3}, Lorg/apache/tika/sax/xpath/Matcher;->matchesAttribute(Ljava/lang/String;Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_0

    .line 43
    .line 44
    invoke-interface {p4, v0}, Lorg/xml/sax/Attributes;->getQName(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-interface {p4, v0}, Lorg/xml/sax/Attributes;->getType(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-interface {p4, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    invoke-virtual/range {v1 .. v6}, Lorg/xml/sax/helpers/AttributesImpl;->addAttribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    iget-object p4, p0, Lorg/apache/tika/sax/xpath/MatchingContentHandler;->matcher:Lorg/apache/tika/sax/xpath/Matcher;

    .line 63
    .line 64
    invoke-virtual {p4}, Lorg/apache/tika/sax/xpath/Matcher;->matchesElement()Z

    .line 65
    .line 66
    .line 67
    move-result p4

    .line 68
    if-nez p4, :cond_2

    .line 69
    .line 70
    invoke-virtual {v1}, Lorg/xml/sax/helpers/AttributesImpl;->getLength()I

    .line 71
    .line 72
    .line 73
    move-result p4

    .line 74
    if-lez p4, :cond_3

    .line 75
    .line 76
    :cond_2
    invoke-super {p0, p1, p2, p3, v1}, Lorg/apache/tika/sax/ContentHandlerDecorator;->startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V

    .line 77
    .line 78
    .line 79
    iget-object p1, p0, Lorg/apache/tika/sax/xpath/MatchingContentHandler;->matcher:Lorg/apache/tika/sax/xpath/Matcher;

    .line 80
    .line 81
    invoke-virtual {p1}, Lorg/apache/tika/sax/xpath/Matcher;->matchesElement()Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-nez p1, :cond_3

    .line 86
    .line 87
    new-instance p1, Lorg/apache/tika/sax/xpath/CompositeMatcher;

    .line 88
    .line 89
    iget-object p2, p0, Lorg/apache/tika/sax/xpath/MatchingContentHandler;->matcher:Lorg/apache/tika/sax/xpath/Matcher;

    .line 90
    .line 91
    sget-object p3, Lorg/apache/tika/sax/xpath/ElementMatcher;->INSTANCE:Lorg/apache/tika/sax/xpath/Matcher;

    .line 92
    .line 93
    invoke-direct {p1, p2, p3}, Lorg/apache/tika/sax/xpath/CompositeMatcher;-><init>(Lorg/apache/tika/sax/xpath/Matcher;Lorg/apache/tika/sax/xpath/Matcher;)V

    .line 94
    .line 95
    .line 96
    iput-object p1, p0, Lorg/apache/tika/sax/xpath/MatchingContentHandler;->matcher:Lorg/apache/tika/sax/xpath/Matcher;

    .line 97
    .line 98
    :cond_3
    return-void
.end method

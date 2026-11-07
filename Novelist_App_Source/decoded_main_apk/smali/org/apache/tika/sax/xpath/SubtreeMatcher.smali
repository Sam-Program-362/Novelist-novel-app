.class public Lorg/apache/tika/sax/xpath/SubtreeMatcher;
.super Lorg/apache/tika/sax/xpath/Matcher;
.source "SourceFile"


# instance fields
.field private final then:Lorg/apache/tika/sax/xpath/Matcher;


# direct methods
.method public constructor <init>(Lorg/apache/tika/sax/xpath/Matcher;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/apache/tika/sax/xpath/Matcher;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/apache/tika/sax/xpath/SubtreeMatcher;->then:Lorg/apache/tika/sax/xpath/Matcher;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public descend(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/tika/sax/xpath/Matcher;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/xpath/SubtreeMatcher;->then:Lorg/apache/tika/sax/xpath/Matcher;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lorg/apache/tika/sax/xpath/Matcher;->descend(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/tika/sax/xpath/Matcher;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object p2, Lorg/apache/tika/sax/xpath/Matcher;->FAIL:Lorg/apache/tika/sax/xpath/Matcher;

    .line 8
    .line 9
    if-eq p1, p2, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lorg/apache/tika/sax/xpath/SubtreeMatcher;->then:Lorg/apache/tika/sax/xpath/Matcher;

    .line 12
    .line 13
    if-ne p1, p2, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p2, Lorg/apache/tika/sax/xpath/CompositeMatcher;

    .line 17
    .line 18
    invoke-direct {p2, p1, p0}, Lorg/apache/tika/sax/xpath/CompositeMatcher;-><init>(Lorg/apache/tika/sax/xpath/Matcher;Lorg/apache/tika/sax/xpath/Matcher;)V

    .line 19
    .line 20
    .line 21
    return-object p2

    .line 22
    :cond_1
    :goto_0
    return-object p0
.end method

.method public matchesAttribute(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/xpath/SubtreeMatcher;->then:Lorg/apache/tika/sax/xpath/Matcher;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lorg/apache/tika/sax/xpath/Matcher;->matchesAttribute(Ljava/lang/String;Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public matchesElement()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/xpath/SubtreeMatcher;->then:Lorg/apache/tika/sax/xpath/Matcher;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/apache/tika/sax/xpath/Matcher;->matchesElement()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public matchesText()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/xpath/SubtreeMatcher;->then:Lorg/apache/tika/sax/xpath/Matcher;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/apache/tika/sax/xpath/Matcher;->matchesText()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

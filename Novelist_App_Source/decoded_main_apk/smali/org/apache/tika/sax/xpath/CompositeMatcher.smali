.class public Lorg/apache/tika/sax/xpath/CompositeMatcher;
.super Lorg/apache/tika/sax/xpath/Matcher;
.source "SourceFile"


# instance fields
.field private final a:Lorg/apache/tika/sax/xpath/Matcher;

.field private final b:Lorg/apache/tika/sax/xpath/Matcher;


# direct methods
.method public constructor <init>(Lorg/apache/tika/sax/xpath/Matcher;Lorg/apache/tika/sax/xpath/Matcher;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/apache/tika/sax/xpath/Matcher;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/apache/tika/sax/xpath/CompositeMatcher;->a:Lorg/apache/tika/sax/xpath/Matcher;

    .line 5
    .line 6
    iput-object p2, p0, Lorg/apache/tika/sax/xpath/CompositeMatcher;->b:Lorg/apache/tika/sax/xpath/Matcher;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public descend(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/tika/sax/xpath/Matcher;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/xpath/CompositeMatcher;->a:Lorg/apache/tika/sax/xpath/Matcher;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lorg/apache/tika/sax/xpath/Matcher;->descend(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/tika/sax/xpath/Matcher;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lorg/apache/tika/sax/xpath/CompositeMatcher;->b:Lorg/apache/tika/sax/xpath/Matcher;

    .line 8
    .line 9
    invoke-virtual {v1, p1, p2}, Lorg/apache/tika/sax/xpath/Matcher;->descend(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/tika/sax/xpath/Matcher;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    sget-object p2, Lorg/apache/tika/sax/xpath/Matcher;->FAIL:Lorg/apache/tika/sax/xpath/Matcher;

    .line 14
    .line 15
    if-ne v0, p2, :cond_0

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    if-ne p1, p2, :cond_1

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_1
    iget-object p2, p0, Lorg/apache/tika/sax/xpath/CompositeMatcher;->a:Lorg/apache/tika/sax/xpath/Matcher;

    .line 22
    .line 23
    if-ne p2, v0, :cond_2

    .line 24
    .line 25
    iget-object p2, p0, Lorg/apache/tika/sax/xpath/CompositeMatcher;->b:Lorg/apache/tika/sax/xpath/Matcher;

    .line 26
    .line 27
    if-ne p2, p1, :cond_2

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_2
    new-instance p2, Lorg/apache/tika/sax/xpath/CompositeMatcher;

    .line 31
    .line 32
    invoke-direct {p2, v0, p1}, Lorg/apache/tika/sax/xpath/CompositeMatcher;-><init>(Lorg/apache/tika/sax/xpath/Matcher;Lorg/apache/tika/sax/xpath/Matcher;)V

    .line 33
    .line 34
    .line 35
    return-object p2
.end method

.method public matchesAttribute(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/xpath/CompositeMatcher;->a:Lorg/apache/tika/sax/xpath/Matcher;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lorg/apache/tika/sax/xpath/Matcher;->matchesAttribute(Ljava/lang/String;Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lorg/apache/tika/sax/xpath/CompositeMatcher;->b:Lorg/apache/tika/sax/xpath/Matcher;

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2}, Lorg/apache/tika/sax/xpath/Matcher;->matchesAttribute(Ljava/lang/String;Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    return p1

    .line 20
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 21
    return p1
.end method

.method public matchesElement()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/xpath/CompositeMatcher;->a:Lorg/apache/tika/sax/xpath/Matcher;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/apache/tika/sax/xpath/Matcher;->matchesElement()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lorg/apache/tika/sax/xpath/CompositeMatcher;->b:Lorg/apache/tika/sax/xpath/Matcher;

    .line 10
    .line 11
    invoke-virtual {v0}, Lorg/apache/tika/sax/xpath/Matcher;->matchesElement()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    return v0

    .line 20
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 21
    return v0
.end method

.method public matchesText()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/xpath/CompositeMatcher;->a:Lorg/apache/tika/sax/xpath/Matcher;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/apache/tika/sax/xpath/Matcher;->matchesText()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lorg/apache/tika/sax/xpath/CompositeMatcher;->b:Lorg/apache/tika/sax/xpath/Matcher;

    .line 10
    .line 11
    invoke-virtual {v0}, Lorg/apache/tika/sax/xpath/Matcher;->matchesText()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    return v0

    .line 20
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 21
    return v0
.end method

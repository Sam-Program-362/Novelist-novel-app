.class public Lorg/apache/tika/exception/WriteLimitReachedException;
.super Lorg/xml/sax/SAXException;
.source "SourceFile"


# static fields
.field private static final MAX_DEPTH:I = 0x64


# instance fields
.field private final writeLimit:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xml/sax/SAXException;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lorg/apache/tika/exception/WriteLimitReachedException;->writeLimit:I

    .line 5
    .line 6
    return-void
.end method

.method public static isWriteLimitReached(Ljava/lang/Throwable;)Z
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, v0}, Lorg/apache/tika/exception/WriteLimitReachedException;->isWriteLimitReached(Ljava/lang/Throwable;I)Z

    move-result p0

    return p0
.end method

.method private static isWriteLimitReached(Ljava/lang/Throwable;I)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    const/16 v1, 0x64

    if-le p1, v1, :cond_1

    return v0

    .line 2
    :cond_1
    instance-of v0, p0, Lorg/apache/tika/exception/WriteLimitReachedException;

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    return v1

    .line 3
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    add-int/2addr p1, v1

    invoke-static {p0, p1}, Lorg/apache/tika/exception/WriteLimitReachedException;->isWriteLimitReached(Ljava/lang/Throwable;I)Z

    move-result p0

    return p0
.end method

.method public static throwIfWriteLimitReached(Ljava/lang/Exception;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, v0}, Lorg/apache/tika/exception/WriteLimitReachedException;->throwIfWriteLimitReached(Ljava/lang/Throwable;I)V

    return-void
.end method

.method private static throwIfWriteLimitReached(Ljava/lang/Throwable;I)V
    .locals 1

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x64

    if-le p1, v0, :cond_1

    :goto_0
    return-void

    .line 2
    :cond_1
    instance-of v0, p0, Lorg/apache/tika/exception/WriteLimitReachedException;

    if-nez v0, :cond_2

    .line 3
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    add-int/lit8 p1, p1, 0x1

    invoke-static {p0, p1}, Lorg/apache/tika/exception/WriteLimitReachedException;->throwIfWriteLimitReached(Ljava/lang/Throwable;I)V

    return-void

    .line 4
    :cond_2
    check-cast p0, Lorg/xml/sax/SAXException;

    throw p0
.end method


# virtual methods
.method public getMessage()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Lorg/apache/tika/exception/WriteLimitReachedException;->writeLimit:I

    .line 2
    .line 3
    const-string v1, "Your document contained more than "

    .line 4
    .line 5
    const-string v2, " characters, and so your requested limit has been reached. To receive the full text of the document, increase your limit. (Text up to the limit is however available)."

    .line 6
    .line 7
    invoke-static {v1, v0, v2}, LB1/e;->h(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

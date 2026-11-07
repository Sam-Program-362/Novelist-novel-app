.class Lorg/apache/tika/parser/RecursiveParserWrapper$RecursivelySecureContentHandler;
.super Lorg/apache/tika/sax/SecureContentHandler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/tika/parser/RecursiveParserWrapper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RecursivelySecureContentHandler"
.end annotation


# static fields
.field private static COUNTER:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field private final handler:Lorg/xml/sax/ContentHandler;

.field private final handlerCounter:Lorg/apache/tika/parser/RecursiveParserWrapper$SecureHandlerCounter;

.field private final id:I

.field private final parseContext:Lorg/apache/tika/parser/ParseContext;

.field private final throwOnWriteLimitReached:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lorg/apache/tika/parser/RecursiveParserWrapper$RecursivelySecureContentHandler;->COUNTER:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lorg/xml/sax/ContentHandler;Lorg/apache/tika/io/TikaInputStream;Lorg/apache/tika/parser/RecursiveParserWrapper$SecureHandlerCounter;ZLorg/apache/tika/parser/ParseContext;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lorg/apache/tika/sax/SecureContentHandler;-><init>(Lorg/xml/sax/ContentHandler;Lorg/apache/tika/io/TikaInputStream;)V

    .line 2
    .line 3
    .line 4
    sget-object p2, Lorg/apache/tika/parser/RecursiveParserWrapper$RecursivelySecureContentHandler;->COUNTER:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    iput p2, p0, Lorg/apache/tika/parser/RecursiveParserWrapper$RecursivelySecureContentHandler;->id:I

    .line 11
    .line 12
    iput-object p1, p0, Lorg/apache/tika/parser/RecursiveParserWrapper$RecursivelySecureContentHandler;->handler:Lorg/xml/sax/ContentHandler;

    .line 13
    .line 14
    iput-object p3, p0, Lorg/apache/tika/parser/RecursiveParserWrapper$RecursivelySecureContentHandler;->handlerCounter:Lorg/apache/tika/parser/RecursiveParserWrapper$SecureHandlerCounter;

    .line 15
    .line 16
    iput-boolean p4, p0, Lorg/apache/tika/parser/RecursiveParserWrapper$RecursivelySecureContentHandler;->throwOnWriteLimitReached:Z

    .line 17
    .line 18
    iput-object p5, p0, Lorg/apache/tika/parser/RecursiveParserWrapper$RecursivelySecureContentHandler;->parseContext:Lorg/apache/tika/parser/ParseContext;

    .line 19
    .line 20
    return-void
.end method

.method public static bridge synthetic a(Lorg/apache/tika/parser/RecursiveParserWrapper$RecursivelySecureContentHandler;)Lorg/apache/tika/parser/RecursiveParserWrapper$SecureHandlerCounter;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/tika/parser/RecursiveParserWrapper$RecursivelySecureContentHandler;->handlerCounter:Lorg/apache/tika/parser/RecursiveParserWrapper$SecureHandlerCounter;

    return-object p0
.end method

.method public static bridge synthetic b(Lorg/apache/tika/parser/RecursiveParserWrapper$RecursivelySecureContentHandler;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lorg/apache/tika/parser/RecursiveParserWrapper$RecursivelySecureContentHandler;->throwOnWriteLimitReached:Z

    return p0
.end method

.method private handleWriteLimitReached()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/tika/parser/RecursiveParserWrapper$RecursivelySecureContentHandler;->handlerCounter:Lorg/apache/tika/parser/RecursiveParserWrapper$SecureHandlerCounter;

    .line 2
    .line 3
    invoke-static {v0}, Lorg/apache/tika/parser/RecursiveParserWrapper$SecureHandlerCounter;->c(Lorg/apache/tika/parser/RecursiveParserWrapper$SecureHandlerCounter;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lorg/apache/tika/parser/RecursiveParserWrapper$RecursivelySecureContentHandler;->throwOnWriteLimitReached:Z

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lorg/apache/tika/parser/RecursiveParserWrapper$RecursivelySecureContentHandler;->parseContext:Lorg/apache/tika/parser/ParseContext;

    .line 11
    .line 12
    const-class v1, Lorg/apache/tika/parser/ParseRecord;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lorg/apache/tika/parser/ParseContext;->get(Ljava/lang/Class;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lorg/apache/tika/parser/ParseRecord;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-virtual {v0, v1}, Lorg/apache/tika/parser/ParseRecord;->setWriteLimitReached(Z)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void

    .line 27
    :cond_1
    new-instance v0, Lorg/apache/tika/exception/WriteLimitReachedException;

    .line 28
    .line 29
    iget-object v1, p0, Lorg/apache/tika/parser/RecursiveParserWrapper$RecursivelySecureContentHandler;->handlerCounter:Lorg/apache/tika/parser/RecursiveParserWrapper$SecureHandlerCounter;

    .line 30
    .line 31
    invoke-static {v1}, Lorg/apache/tika/parser/RecursiveParserWrapper$SecureHandlerCounter;->a(Lorg/apache/tika/parser/RecursiveParserWrapper$SecureHandlerCounter;)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    invoke-direct {v0, v1}, Lorg/apache/tika/exception/WriteLimitReachedException;-><init>(I)V

    .line 36
    .line 37
    .line 38
    throw v0
.end method


# virtual methods
.method public characters([CII)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/parser/RecursiveParserWrapper$RecursivelySecureContentHandler;->handlerCounter:Lorg/apache/tika/parser/RecursiveParserWrapper$SecureHandlerCounter;

    .line 2
    .line 3
    invoke-static {v0}, Lorg/apache/tika/parser/RecursiveParserWrapper$SecureHandlerCounter;->b(Lorg/apache/tika/parser/RecursiveParserWrapper$SecureHandlerCounter;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lorg/apache/tika/parser/RecursiveParserWrapper$RecursivelySecureContentHandler;->handlerCounter:Lorg/apache/tika/parser/RecursiveParserWrapper$SecureHandlerCounter;

    .line 11
    .line 12
    invoke-static {v0}, Lorg/apache/tika/parser/RecursiveParserWrapper$SecureHandlerCounter;->a(Lorg/apache/tika/parser/RecursiveParserWrapper$SecureHandlerCounter;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-gez v0, :cond_1

    .line 17
    .line 18
    invoke-super {p0, p1, p2, p3}, Lorg/apache/tika/sax/SecureContentHandler;->characters([CII)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    iget-object v0, p0, Lorg/apache/tika/parser/RecursiveParserWrapper$RecursivelySecureContentHandler;->handlerCounter:Lorg/apache/tika/parser/RecursiveParserWrapper$SecureHandlerCounter;

    .line 23
    .line 24
    invoke-virtual {v0, p3}, Lorg/apache/tika/parser/RecursiveParserWrapper$SecureHandlerCounter;->getAvailable(I)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-super {p0, p1, p2, v0}, Lorg/apache/tika/sax/SecureContentHandler;->characters([CII)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lorg/apache/tika/parser/RecursiveParserWrapper$RecursivelySecureContentHandler;->handlerCounter:Lorg/apache/tika/parser/RecursiveParserWrapper$SecureHandlerCounter;

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Lorg/apache/tika/parser/RecursiveParserWrapper$SecureHandlerCounter;->addChars(I)V

    .line 34
    .line 35
    .line 36
    if-ge v0, p3, :cond_2

    .line 37
    .line 38
    invoke-direct {p0}, Lorg/apache/tika/parser/RecursiveParserWrapper$RecursivelySecureContentHandler;->handleWriteLimitReached()V

    .line 39
    .line 40
    .line 41
    :cond_2
    :goto_0
    return-void
.end method

.method public endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/parser/RecursiveParserWrapper$RecursivelySecureContentHandler;->handler:Lorg/xml/sax/ContentHandler;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Lorg/xml/sax/ContentHandler;->endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public ignorableWhitespace([CII)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/parser/RecursiveParserWrapper$RecursivelySecureContentHandler;->handlerCounter:Lorg/apache/tika/parser/RecursiveParserWrapper$SecureHandlerCounter;

    .line 2
    .line 3
    invoke-static {v0}, Lorg/apache/tika/parser/RecursiveParserWrapper$SecureHandlerCounter;->b(Lorg/apache/tika/parser/RecursiveParserWrapper$SecureHandlerCounter;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lorg/apache/tika/parser/RecursiveParserWrapper$RecursivelySecureContentHandler;->handlerCounter:Lorg/apache/tika/parser/RecursiveParserWrapper$SecureHandlerCounter;

    .line 11
    .line 12
    invoke-static {v0}, Lorg/apache/tika/parser/RecursiveParserWrapper$SecureHandlerCounter;->a(Lorg/apache/tika/parser/RecursiveParserWrapper$SecureHandlerCounter;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-gez v0, :cond_1

    .line 17
    .line 18
    invoke-super {p0, p1, p2, p3}, Lorg/apache/tika/sax/SecureContentHandler;->ignorableWhitespace([CII)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    iget-object v0, p0, Lorg/apache/tika/parser/RecursiveParserWrapper$RecursivelySecureContentHandler;->handlerCounter:Lorg/apache/tika/parser/RecursiveParserWrapper$SecureHandlerCounter;

    .line 23
    .line 24
    invoke-virtual {v0, p3}, Lorg/apache/tika/parser/RecursiveParserWrapper$SecureHandlerCounter;->getAvailable(I)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-super {p0, p1, p2, v0}, Lorg/apache/tika/sax/SecureContentHandler;->ignorableWhitespace([CII)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lorg/apache/tika/parser/RecursiveParserWrapper$RecursivelySecureContentHandler;->handlerCounter:Lorg/apache/tika/parser/RecursiveParserWrapper$SecureHandlerCounter;

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Lorg/apache/tika/parser/RecursiveParserWrapper$SecureHandlerCounter;->addChars(I)V

    .line 34
    .line 35
    .line 36
    if-ge v0, p3, :cond_2

    .line 37
    .line 38
    invoke-direct {p0}, Lorg/apache/tika/parser/RecursiveParserWrapper$RecursivelySecureContentHandler;->handleWriteLimitReached()V

    .line 39
    .line 40
    .line 41
    :cond_2
    :goto_0
    return-void
.end method

.method public startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/parser/RecursiveParserWrapper$RecursivelySecureContentHandler;->handler:Lorg/xml/sax/ContentHandler;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3, p4}, Lorg/xml/sax/ContentHandler;->startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

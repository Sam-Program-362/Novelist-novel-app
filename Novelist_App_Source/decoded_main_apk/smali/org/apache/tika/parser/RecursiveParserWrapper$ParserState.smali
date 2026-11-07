.class Lorg/apache/tika/parser/RecursiveParserWrapper$ParserState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/tika/parser/RecursiveParserWrapper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ParserState"
.end annotation


# instance fields
.field private embeddedCount:I

.field private final recursiveParserWrapperHandler:Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;

.field private unknownCount:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method private constructor <init>(Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lorg/apache/tika/parser/RecursiveParserWrapper$ParserState;->unknownCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 4
    iput v1, p0, Lorg/apache/tika/parser/RecursiveParserWrapper$ParserState;->embeddedCount:I

    .line 5
    iput-object p1, p0, Lorg/apache/tika/parser/RecursiveParserWrapper$ParserState;->recursiveParserWrapperHandler:Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;

    return-void
.end method

.method public synthetic constructor <init>(Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lorg/apache/tika/parser/RecursiveParserWrapper$ParserState;-><init>(Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;)V

    return-void
.end method

.method public static bridge synthetic a(Lorg/apache/tika/parser/RecursiveParserWrapper$ParserState;)I
    .locals 0

    .line 1
    iget p0, p0, Lorg/apache/tika/parser/RecursiveParserWrapper$ParserState;->embeddedCount:I

    return p0
.end method

.method public static bridge synthetic b(Lorg/apache/tika/parser/RecursiveParserWrapper$ParserState;)Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/tika/parser/RecursiveParserWrapper$ParserState;->recursiveParserWrapperHandler:Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;

    return-object p0
.end method

.method public static bridge synthetic c(Lorg/apache/tika/parser/RecursiveParserWrapper$ParserState;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/tika/parser/RecursiveParserWrapper$ParserState;->unknownCount:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object p0
.end method

.method public static bridge synthetic d(Lorg/apache/tika/parser/RecursiveParserWrapper$ParserState;I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/apache/tika/parser/RecursiveParserWrapper$ParserState;->embeddedCount:I

    return-void
.end method

.class public Lorg/apache/tika/parser/EmptyParser;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/apache/tika/parser/Parser;


# static fields
.field public static final INSTANCE:Lorg/apache/tika/parser/EmptyParser;

.field private static final serialVersionUID:J = -0x3a8ba78cca68df9bL


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/tika/parser/EmptyParser;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/apache/tika/parser/EmptyParser;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lorg/apache/tika/parser/EmptyParser;->INSTANCE:Lorg/apache/tika/parser/EmptyParser;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getSupportedTypes(Lorg/apache/tika/parser/ParseContext;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/tika/parser/ParseContext;",
            ")",
            "Ljava/util/Set<",
            "Lorg/apache/tika/mime/MediaType;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object p1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 2
    .line 3
    return-object p1
.end method

.method public parse(Ljava/io/InputStream;Lorg/xml/sax/ContentHandler;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)V
    .locals 0

    .line 1
    new-instance p1, Lorg/apache/tika/sax/XHTMLContentHandler;

    .line 2
    .line 3
    invoke-direct {p1, p2, p3}, Lorg/apache/tika/sax/XHTMLContentHandler;-><init>(Lorg/xml/sax/ContentHandler;Lorg/apache/tika/metadata/Metadata;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lorg/apache/tika/sax/XHTMLContentHandler;->startDocument()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lorg/apache/tika/sax/XHTMLContentHandler;->endDocument()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

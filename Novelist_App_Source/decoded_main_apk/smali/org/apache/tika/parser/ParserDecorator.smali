.class public Lorg/apache/tika/parser/ParserDecorator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/apache/tika/parser/Parser;


# static fields
.field private static final serialVersionUID:J = -0x35976799b9d89314L


# instance fields
.field private final parser:Lorg/apache/tika/parser/Parser;


# direct methods
.method public constructor <init>(Lorg/apache/tika/parser/Parser;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/apache/tika/parser/ParserDecorator;->parser:Lorg/apache/tika/parser/Parser;

    .line 5
    .line 6
    return-void
.end method

.method public static final withFallbacks(Ljava/util/Collection;Ljava/util/Set;)Lorg/apache/tika/parser/Parser;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lorg/apache/tika/parser/Parser;",
            ">;",
            "Ljava/util/Set<",
            "Lorg/apache/tika/mime/MediaType;",
            ">;)",
            "Lorg/apache/tika/parser/Parser;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-static {}, Lorg/apache/tika/mime/MediaTypeRegistry;->getDefaultRegistry()Lorg/apache/tika/mime/MediaTypeRegistry;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lorg/apache/tika/parser/multiple/FallbackParser;

    .line 6
    .line 7
    sget-object v2, Lorg/apache/tika/parser/multiple/AbstractMultipleParser$MetadataPolicy;->KEEP_ALL:Lorg/apache/tika/parser/multiple/AbstractMultipleParser$MetadataPolicy;

    .line 8
    .line 9
    invoke-direct {v1, v0, v2, p0}, Lorg/apache/tika/parser/multiple/FallbackParser;-><init>(Lorg/apache/tika/mime/MediaTypeRegistry;Lorg/apache/tika/parser/multiple/AbstractMultipleParser$MetadataPolicy;Ljava/util/Collection;)V

    .line 10
    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static {v1, p1}, Lorg/apache/tika/parser/ParserDecorator;->withTypes(Lorg/apache/tika/parser/Parser;Ljava/util/Set;)Lorg/apache/tika/parser/Parser;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_1
    :goto_0
    return-object v1
.end method

.method public static final withTypes(Lorg/apache/tika/parser/Parser;Ljava/util/Set;)Lorg/apache/tika/parser/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/tika/parser/Parser;",
            "Ljava/util/Set<",
            "Lorg/apache/tika/mime/MediaType;",
            ">;)",
            "Lorg/apache/tika/parser/Parser;"
        }
    .end annotation

    .line 1
    new-instance v0, Lorg/apache/tika/parser/ParserDecorator$1;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lorg/apache/tika/parser/ParserDecorator$1;-><init>(Lorg/apache/tika/parser/Parser;Ljava/util/Set;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final withoutTypes(Lorg/apache/tika/parser/Parser;Ljava/util/Set;)Lorg/apache/tika/parser/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/tika/parser/Parser;",
            "Ljava/util/Set<",
            "Lorg/apache/tika/mime/MediaType;",
            ">;)",
            "Lorg/apache/tika/parser/Parser;"
        }
    .end annotation

    .line 1
    new-instance v0, Lorg/apache/tika/parser/ParserDecorator$2;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lorg/apache/tika/parser/ParserDecorator$2;-><init>(Lorg/apache/tika/parser/Parser;Ljava/util/Set;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public getDecorationName()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getSupportedTypes(Lorg/apache/tika/parser/ParseContext;)Ljava/util/Set;
    .locals 1
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
    iget-object v0, p0, Lorg/apache/tika/parser/ParserDecorator;->parser:Lorg/apache/tika/parser/Parser;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lorg/apache/tika/parser/Parser;->getSupportedTypes(Lorg/apache/tika/parser/ParseContext;)Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public getWrappedParser()Lorg/apache/tika/parser/Parser;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/parser/ParserDecorator;->parser:Lorg/apache/tika/parser/Parser;

    .line 2
    .line 3
    return-object v0
.end method

.method public parse(Ljava/io/InputStream;Lorg/xml/sax/ContentHandler;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/parser/ParserDecorator;->parser:Lorg/apache/tika/parser/Parser;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3, p4}, Lorg/apache/tika/parser/Parser;->parse(Ljava/io/InputStream;Lorg/xml/sax/ContentHandler;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

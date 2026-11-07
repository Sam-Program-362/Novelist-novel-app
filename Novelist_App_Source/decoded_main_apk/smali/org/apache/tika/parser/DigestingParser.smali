.class public Lorg/apache/tika/parser/DigestingParser;
.super Lorg/apache/tika/parser/ParserDecorator;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/tika/parser/DigestingParser$Encoder;,
        Lorg/apache/tika/parser/DigestingParser$Digester;,
        Lorg/apache/tika/parser/DigestingParser$DigesterFactory;
    }
.end annotation


# instance fields
.field private final digester:Lorg/apache/tika/parser/DigestingParser$Digester;

.field private final skipContainerDocument:Z


# direct methods
.method public constructor <init>(Lorg/apache/tika/parser/Parser;Lorg/apache/tika/parser/DigestingParser$Digester;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lorg/apache/tika/parser/ParserDecorator;-><init>(Lorg/apache/tika/parser/Parser;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lorg/apache/tika/parser/DigestingParser;->digester:Lorg/apache/tika/parser/DigestingParser$Digester;

    .line 5
    .line 6
    iput-boolean p3, p0, Lorg/apache/tika/parser/DigestingParser;->skipContainerDocument:Z

    .line 7
    .line 8
    return-void
.end method

.method private shouldDigest(Lorg/apache/tika/metadata/Metadata;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/apache/tika/parser/DigestingParser;->digester:Lorg/apache/tika/parser/DigestingParser$Digester;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-boolean v0, p0, Lorg/apache/tika/parser/DigestingParser;->skipContainerDocument:Z

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    return v2

    .line 13
    :cond_1
    sget-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->EMBEDDED_DEPTH:Lorg/apache/tika/metadata/Property;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lorg/apache/tika/metadata/Metadata;->getInt(Lorg/apache/tika/metadata/Property;)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_3

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-nez p1, :cond_2

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    return v2

    .line 29
    :cond_3
    :goto_0
    return v1
.end method


# virtual methods
.method public parse(Ljava/io/InputStream;Lorg/xml/sax/ContentHandler;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)V
    .locals 2

    .line 1
    new-instance v0, Lorg/apache/tika/io/TemporaryResources;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/apache/tika/io/TemporaryResources;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0, p3}, Lorg/apache/tika/io/TikaInputStream;->get(Ljava/io/InputStream;Lorg/apache/tika/io/TemporaryResources;Lorg/apache/tika/metadata/Metadata;)Lorg/apache/tika/io/TikaInputStream;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :try_start_0
    invoke-direct {p0, p3}, Lorg/apache/tika/parser/DigestingParser;->shouldDigest(Lorg/apache/tika/metadata/Metadata;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, Lorg/apache/tika/parser/DigestingParser;->digester:Lorg/apache/tika/parser/DigestingParser$Digester;

    .line 17
    .line 18
    invoke-interface {v1, p1, p3, p4}, Lorg/apache/tika/parser/DigestingParser$Digester;->digest(Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    :goto_0
    invoke-super {p0, p1, p2, p3, p4}, Lorg/apache/tika/parser/ParserDecorator;->parse(Ljava/io/InputStream;Lorg/xml/sax/ContentHandler;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lorg/apache/tika/io/TemporaryResources;->dispose()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :goto_1
    invoke-virtual {v0}, Lorg/apache/tika/io/TemporaryResources;->dispose()V

    .line 32
    .line 33
    .line 34
    throw p1
.end method

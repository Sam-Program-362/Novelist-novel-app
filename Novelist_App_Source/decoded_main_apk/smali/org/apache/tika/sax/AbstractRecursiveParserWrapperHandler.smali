.class public abstract Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;
.super Lorg/xml/sax/helpers/DefaultHandler;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final EMBEDDED_RESOURCE_LIMIT_REACHED:Lorg/apache/tika/metadata/Property;

.field private static final MAX_DEPTH:I = 0x64


# instance fields
.field private final contentHandlerFactory:Lorg/apache/tika/sax/ContentHandlerFactory;

.field private embeddedDepth:I

.field private embeddedResources:I

.field private final maxEmbeddedResources:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "X-TIKA:EXCEPTION:embedded_resource_limit_reached"

    .line 2
    .line 3
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalBoolean(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;->EMBEDDED_RESOURCE_LIMIT_REACHED:Lorg/apache/tika/metadata/Property;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lorg/apache/tika/sax/ContentHandlerFactory;)V
    .locals 1

    const/4 v0, -0x1

    .line 1
    invoke-direct {p0, p1, v0}, Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;-><init>(Lorg/apache/tika/sax/ContentHandlerFactory;I)V

    return-void
.end method

.method public constructor <init>(Lorg/apache/tika/sax/ContentHandlerFactory;I)V
    .locals 1

    .line 2
    invoke-direct {p0}, Lorg/xml/sax/helpers/DefaultHandler;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;->embeddedResources:I

    .line 4
    iput v0, p0, Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;->embeddedDepth:I

    .line 5
    iput-object p1, p0, Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;->contentHandlerFactory:Lorg/apache/tika/sax/ContentHandlerFactory;

    .line 6
    iput p2, p0, Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;->maxEmbeddedResources:I

    return-void
.end method


# virtual methods
.method public decrementEmbeddedDepth()V
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;->embeddedDepth:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;->embeddedDepth:I

    .line 6
    .line 7
    return-void
.end method

.method public endDocument(Lorg/xml/sax/ContentHandler;Lorg/apache/tika/metadata/Metadata;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;->hasHitMaximumEmbeddedResources()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    sget-object p1, Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;->EMBEDDED_RESOURCE_LIMIT_REACHED:Lorg/apache/tika/metadata/Property;

    .line 8
    .line 9
    const-string v0, "true"

    .line 10
    .line 11
    invoke-virtual {p2, p1, v0}, Lorg/apache/tika/metadata/Metadata;->set(Lorg/apache/tika/metadata/Property;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    sget-object p1, Lorg/apache/tika/metadata/TikaCoreProperties;->EMBEDDED_DEPTH:Lorg/apache/tika/metadata/Property;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p2, p1, v0}, Lorg/apache/tika/metadata/Metadata;->set(Lorg/apache/tika/metadata/Property;I)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public endEmbeddedDocument(Lorg/xml/sax/ContentHandler;Lorg/apache/tika/metadata/Metadata;)V
    .locals 0

    .line 1
    iget p1, p0, Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;->embeddedDepth:I

    .line 2
    .line 3
    add-int/lit8 p1, p1, -0x1

    .line 4
    .line 5
    iput p1, p0, Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;->embeddedDepth:I

    .line 6
    .line 7
    return-void
.end method

.method public getContentHandlerFactory()Lorg/apache/tika/sax/ContentHandlerFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;->contentHandlerFactory:Lorg/apache/tika/sax/ContentHandlerFactory;

    .line 2
    .line 3
    return-object v0
.end method

.method public getNewContentHandler()Lorg/xml/sax/ContentHandler;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;->contentHandlerFactory:Lorg/apache/tika/sax/ContentHandlerFactory;

    invoke-interface {v0}, Lorg/apache/tika/sax/ContentHandlerFactory;->getNewContentHandler()Lorg/xml/sax/ContentHandler;

    move-result-object v0

    return-object v0
.end method

.method public getNewContentHandler(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)Lorg/xml/sax/ContentHandler;
    .locals 1

    .line 2
    iget-object v0, p0, Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;->contentHandlerFactory:Lorg/apache/tika/sax/ContentHandlerFactory;

    invoke-interface {v0, p1, p2}, Lorg/apache/tika/sax/ContentHandlerFactory;->getNewContentHandler(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)Lorg/xml/sax/ContentHandler;

    move-result-object p1

    return-object p1
.end method

.method public hasHitMaximumEmbeddedResources()Z
    .locals 2

    .line 1
    iget v0, p0, Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;->maxEmbeddedResources:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-le v0, v1, :cond_0

    .line 5
    .line 6
    iget v1, p0, Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;->embeddedResources:I

    .line 7
    .line 8
    if-lt v1, v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    return v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0
.end method

.method public startEmbeddedDocument(Lorg/xml/sax/ContentHandler;Lorg/apache/tika/metadata/Metadata;)V
    .locals 1

    .line 1
    iget p1, p0, Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;->embeddedResources:I

    .line 2
    .line 3
    add-int/lit8 p1, p1, 0x1

    .line 4
    .line 5
    iput p1, p0, Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;->embeddedResources:I

    .line 6
    .line 7
    iget p1, p0, Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;->embeddedDepth:I

    .line 8
    .line 9
    add-int/lit8 p1, p1, 0x1

    .line 10
    .line 11
    iput p1, p0, Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;->embeddedDepth:I

    .line 12
    .line 13
    const/16 v0, 0x64

    .line 14
    .line 15
    if-ge p1, v0, :cond_0

    .line 16
    .line 17
    sget-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->EMBEDDED_DEPTH:Lorg/apache/tika/metadata/Property;

    .line 18
    .line 19
    invoke-virtual {p2, v0, p1}, Lorg/apache/tika/metadata/Metadata;->set(Lorg/apache/tika/metadata/Property;I)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    new-instance p1, Lorg/xml/sax/SAXException;

    .line 24
    .line 25
    iget p2, p0, Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;->embeddedDepth:I

    .line 26
    .line 27
    const-string v0, "Max embedded depth reached: "

    .line 28
    .line 29
    invoke-static {v0, p2}, LB1/e;->g(Ljava/lang/String;I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-direct {p1, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p1
.end method

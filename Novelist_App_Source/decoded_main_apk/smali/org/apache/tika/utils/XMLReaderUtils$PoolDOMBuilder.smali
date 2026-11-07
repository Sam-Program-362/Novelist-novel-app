.class Lorg/apache/tika/utils/XMLReaderUtils$PoolDOMBuilder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/tika/utils/XMLReaderUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PoolDOMBuilder"
.end annotation


# instance fields
.field private final documentBuilder:Ljavax/xml/parsers/DocumentBuilder;

.field numUses:I

.field private final poolGeneration:I


# direct methods
.method public constructor <init>(ILjavax/xml/parsers/DocumentBuilder;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lorg/apache/tika/utils/XMLReaderUtils$PoolDOMBuilder;->numUses:I

    .line 6
    .line 7
    iput p1, p0, Lorg/apache/tika/utils/XMLReaderUtils$PoolDOMBuilder;->poolGeneration:I

    .line 8
    .line 9
    iput-object p2, p0, Lorg/apache/tika/utils/XMLReaderUtils$PoolDOMBuilder;->documentBuilder:Ljavax/xml/parsers/DocumentBuilder;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public getDocumentBuilder()Ljavax/xml/parsers/DocumentBuilder;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/utils/XMLReaderUtils$PoolDOMBuilder;->documentBuilder:Ljavax/xml/parsers/DocumentBuilder;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPoolGeneration()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/tika/utils/XMLReaderUtils$PoolDOMBuilder;->poolGeneration:I

    .line 2
    .line 3
    return v0
.end method

.method public incrementUses()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lorg/apache/tika/utils/XMLReaderUtils$PoolDOMBuilder;->numUses:I

    .line 3
    .line 4
    return-void
.end method

.method public reset()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/tika/utils/XMLReaderUtils$PoolDOMBuilder;->documentBuilder:Ljavax/xml/parsers/DocumentBuilder;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljavax/xml/parsers/DocumentBuilder;->reset()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lorg/apache/tika/utils/XMLReaderUtils$PoolDOMBuilder;->documentBuilder:Ljavax/xml/parsers/DocumentBuilder;

    .line 7
    .line 8
    invoke-static {}, Lorg/apache/tika/utils/XMLReaderUtils;->b()Lorg/xml/sax/EntityResolver;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljavax/xml/parsers/DocumentBuilder;->setEntityResolver(Lorg/xml/sax/EntityResolver;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lorg/apache/tika/utils/XMLReaderUtils$PoolDOMBuilder;->documentBuilder:Ljavax/xml/parsers/DocumentBuilder;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-virtual {v0, v1}, Ljavax/xml/parsers/DocumentBuilder;->setErrorHandler(Lorg/xml/sax/ErrorHandler;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

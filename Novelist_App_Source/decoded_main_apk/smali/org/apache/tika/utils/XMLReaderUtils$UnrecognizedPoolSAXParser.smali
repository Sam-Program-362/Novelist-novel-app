.class Lorg/apache/tika/utils/XMLReaderUtils$UnrecognizedPoolSAXParser;
.super Lorg/apache/tika/utils/XMLReaderUtils$PoolSAXParser;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/tika/utils/XMLReaderUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "UnrecognizedPoolSAXParser"
.end annotation


# direct methods
.method public constructor <init>(ILjavax/xml/parsers/SAXParser;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lorg/apache/tika/utils/XMLReaderUtils$PoolSAXParser;-><init>(ILjavax/xml/parsers/SAXParser;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public reset()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lorg/apache/tika/utils/XMLReaderUtils$PoolSAXParser;->saxParser:Ljavax/xml/parsers/SAXParser;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljavax/xml/parsers/SAXParser;->reset()V
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    :catch_0
    :try_start_1
    iget-object v0, p0, Lorg/apache/tika/utils/XMLReaderUtils$PoolSAXParser;->saxParser:Ljavax/xml/parsers/SAXParser;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljavax/xml/parsers/SAXParser;->getXMLReader()Lorg/xml/sax/XMLReader;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Lorg/apache/tika/utils/XMLReaderUtils;->d(Lorg/xml/sax/XMLReader;)V
    :try_end_1
    .catch Lorg/xml/sax/SAXException; {:try_start_1 .. :try_end_1} :catch_1

    .line 13
    .line 14
    .line 15
    :catch_1
    iget-object v0, p0, Lorg/apache/tika/utils/XMLReaderUtils$PoolSAXParser;->saxParser:Ljavax/xml/parsers/SAXParser;

    .line 16
    .line 17
    invoke-static {v0}, Lorg/apache/tika/utils/XMLReaderUtils;->e(Ljavax/xml/parsers/SAXParser;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

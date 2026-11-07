.class Lorg/apache/tika/utils/XMLReaderUtils$Xerces2PoolSAXParser;
.super Lorg/apache/tika/utils/XMLReaderUtils$PoolSAXParser;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/tika/utils/XMLReaderUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Xerces2PoolSAXParser"
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
    .locals 3

    .line 1
    const-string v0, "http://apache.org/xml/properties/security-manager"

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Lorg/apache/tika/utils/XMLReaderUtils$PoolSAXParser;->saxParser:Ljavax/xml/parsers/SAXParser;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljavax/xml/parsers/SAXParser;->getProperty(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lorg/apache/tika/utils/XMLReaderUtils$PoolSAXParser;->saxParser:Ljavax/xml/parsers/SAXParser;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljavax/xml/parsers/SAXParser;->reset()V

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, Lorg/apache/tika/utils/XMLReaderUtils$PoolSAXParser;->saxParser:Ljavax/xml/parsers/SAXParser;

    .line 15
    .line 16
    invoke-virtual {v2, v0, v1}, Ljavax/xml/parsers/SAXParser;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/xml/sax/SAXException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catch_0
    move-exception v0

    .line 21
    invoke-static {}, Lorg/apache/tika/utils/XMLReaderUtils;->c()LF2/b;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const-string v2, "problem resetting sax parser"

    .line 26
    .line 27
    invoke-interface {v1, v2, v0}, LF2/b;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    :try_start_1
    iget-object v0, p0, Lorg/apache/tika/utils/XMLReaderUtils$PoolSAXParser;->saxParser:Ljavax/xml/parsers/SAXParser;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljavax/xml/parsers/SAXParser;->getXMLReader()Lorg/xml/sax/XMLReader;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0}, Lorg/apache/tika/utils/XMLReaderUtils;->d(Lorg/xml/sax/XMLReader;)V
    :try_end_1
    .catch Lorg/xml/sax/SAXException; {:try_start_1 .. :try_end_1} :catch_1

    .line 37
    .line 38
    .line 39
    :catch_1
    return-void
.end method

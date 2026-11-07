.class public Lorg/apache/tika/sax/XMPContentHandler;
.super Lorg/apache/tika/sax/SafeContentHandler;
.source "SourceFile"


# static fields
.field private static final EMPTY_ATTRIBUTES:Lorg/xml/sax/Attributes;

.field public static final RDF:Ljava/lang/String; = "http://www.w3.org/1999/02/22-rdf-syntax-ns#"

.field public static final XMP:Ljava/lang/String; = "http://ns.adobe.com/xap/1.0/"


# instance fields
.field private prefix:Ljava/lang/String;

.field private uri:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lorg/xml/sax/helpers/AttributesImpl;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/xml/sax/helpers/AttributesImpl;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lorg/apache/tika/sax/XMPContentHandler;->EMPTY_ATTRIBUTES:Lorg/xml/sax/Attributes;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lorg/xml/sax/ContentHandler;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lorg/apache/tika/sax/SafeContentHandler;-><init>(Lorg/xml/sax/ContentHandler;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lorg/apache/tika/sax/XMPContentHandler;->prefix:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p1, p0, Lorg/apache/tika/sax/XMPContentHandler;->uri:Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method

.method private description(Lorg/apache/tika/metadata/Metadata;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-static {p2}, Lorg/apache/tika/metadata/Property;->getProperties(Ljava/lang/String;)Ljava/util/SortedSet;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_2

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Lorg/apache/tika/metadata/Property;

    .line 21
    .line 22
    invoke-virtual {p1, v2}, Lorg/apache/tika/metadata/Metadata;->get(Lorg/apache/tika/metadata/Property;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    add-int/lit8 v4, v1, 0x1

    .line 29
    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    const-string v1, ""

    .line 33
    .line 34
    invoke-virtual {p0, v1, p2, p3}, Lorg/apache/tika/sax/XMPContentHandler;->startDescription(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-virtual {v2}, Lorg/apache/tika/metadata/Property;->getName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    add-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {p0, v1, v3}, Lorg/apache/tika/sax/XMPContentHandler;->property(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    move v1, v4

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    if-lez v1, :cond_3

    .line 57
    .line 58
    invoke-virtual {p0}, Lorg/apache/tika/sax/XMPContentHandler;->endDescription()V

    .line 59
    .line 60
    .line 61
    :cond_3
    return-void
.end method


# virtual methods
.method public endDescription()V
    .locals 3

    .line 1
    const-string v0, "Description"

    .line 2
    .line 3
    const-string v1, "rdf:Description"

    .line 4
    .line 5
    const-string v2, "http://www.w3.org/1999/02/22-rdf-syntax-ns#"

    .line 6
    .line 7
    invoke-virtual {p0, v2, v0, v1}, Lorg/apache/tika/sax/SafeContentHandler;->endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lorg/apache/tika/sax/XMPContentHandler;->prefix:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lorg/apache/tika/sax/ContentHandlerDecorator;->endPrefixMapping(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, Lorg/apache/tika/sax/XMPContentHandler;->uri:Ljava/lang/String;

    .line 17
    .line 18
    iput-object v0, p0, Lorg/apache/tika/sax/XMPContentHandler;->prefix:Ljava/lang/String;

    .line 19
    .line 20
    return-void
.end method

.method public endDocument()V
    .locals 3

    .line 1
    const-string v0, "RDF"

    .line 2
    .line 3
    const-string v1, "rdf:RDF"

    .line 4
    .line 5
    const-string v2, "http://www.w3.org/1999/02/22-rdf-syntax-ns#"

    .line 6
    .line 7
    invoke-virtual {p0, v2, v0, v1}, Lorg/apache/tika/sax/SafeContentHandler;->endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v0, "xmp"

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lorg/apache/tika/sax/ContentHandlerDecorator;->endPrefixMapping(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v0, "rdf"

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lorg/apache/tika/sax/ContentHandlerDecorator;->endPrefixMapping(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-super {p0}, Lorg/apache/tika/sax/SafeContentHandler;->endDocument()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public metadata(Lorg/apache/tika/metadata/Metadata;)V
    .locals 2

    .line 1
    const-string v0, "xmp"

    .line 2
    .line 3
    const-string v1, "http://ns.adobe.com/xap/1.0/"

    .line 4
    .line 5
    invoke-direct {p0, p1, v0, v1}, Lorg/apache/tika/sax/XMPContentHandler;->description(Lorg/apache/tika/metadata/Metadata;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "dc"

    .line 9
    .line 10
    const-string v1, "http://purl.org/dc/elements/1.1/"

    .line 11
    .line 12
    invoke-direct {p0, p1, v0, v1}, Lorg/apache/tika/sax/XMPContentHandler;->description(Lorg/apache/tika/metadata/Metadata;Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v0, "xmpTPg"

    .line 16
    .line 17
    const-string v1, "http://ns.adobe.com/xap/1.0/t/pg/"

    .line 18
    .line 19
    invoke-direct {p0, p1, v0, v1}, Lorg/apache/tika/sax/XMPContentHandler;->description(Lorg/apache/tika/metadata/Metadata;Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v0, "xmpRigths"

    .line 23
    .line 24
    const-string v1, "http://ns.adobe.com/xap/1.0/rights/"

    .line 25
    .line 26
    invoke-direct {p0, p1, v0, v1}, Lorg/apache/tika/sax/XMPContentHandler;->description(Lorg/apache/tika/metadata/Metadata;Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string v0, "xmpMM"

    .line 30
    .line 31
    const-string v1, "http://ns.adobe.com/xap/1.0/mm/"

    .line 32
    .line 33
    invoke-direct {p0, p1, v0, v1}, Lorg/apache/tika/sax/XMPContentHandler;->description(Lorg/apache/tika/metadata/Metadata;Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v0, "xmpidq"

    .line 37
    .line 38
    const-string v1, "http://ns.adobe.com/xmp/identifier/qual/1.0/"

    .line 39
    .line 40
    invoke-direct {p0, p1, v0, v1}, Lorg/apache/tika/sax/XMPContentHandler;->description(Lorg/apache/tika/metadata/Metadata;Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const-string v0, "xmpBJ"

    .line 44
    .line 45
    const-string v1, "http://ns.adobe.com/xap/1.0/bj/"

    .line 46
    .line 47
    invoke-direct {p0, p1, v0, v1}, Lorg/apache/tika/sax/XMPContentHandler;->description(Lorg/apache/tika/metadata/Metadata;Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const-string v0, "xmpDM"

    .line 51
    .line 52
    const-string v1, "http://ns.adobe.com/xmp/1.0/DynamicMedia/"

    .line 53
    .line 54
    invoke-direct {p0, p1, v0, v1}, Lorg/apache/tika/sax/XMPContentHandler;->description(Lorg/apache/tika/metadata/Metadata;Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const-string v0, "pdf"

    .line 58
    .line 59
    const-string v1, "http://ns.adobe.com/pdf/1.3/"

    .line 60
    .line 61
    invoke-direct {p0, p1, v0, v1}, Lorg/apache/tika/sax/XMPContentHandler;->description(Lorg/apache/tika/metadata/Metadata;Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const-string v0, "photoshop"

    .line 65
    .line 66
    const-string v1, "s http://ns.adobe.com/photoshop/1.0/"

    .line 67
    .line 68
    invoke-direct {p0, p1, v0, v1}, Lorg/apache/tika/sax/XMPContentHandler;->description(Lorg/apache/tika/metadata/Metadata;Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const-string v0, "crs"

    .line 72
    .line 73
    const-string v1, "http://ns.adobe.com/camera-raw-settings/1.0/"

    .line 74
    .line 75
    invoke-direct {p0, p1, v0, v1}, Lorg/apache/tika/sax/XMPContentHandler;->description(Lorg/apache/tika/metadata/Metadata;Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const-string v0, "tiff"

    .line 79
    .line 80
    const-string v1, "http://ns.adobe.com/tiff/1.0/"

    .line 81
    .line 82
    invoke-direct {p0, p1, v0, v1}, Lorg/apache/tika/sax/XMPContentHandler;->description(Lorg/apache/tika/metadata/Metadata;Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    const-string v0, "exif"

    .line 86
    .line 87
    const-string v1, "http://ns.adobe.com/exif/1.0/"

    .line 88
    .line 89
    invoke-direct {p0, p1, v0, v1}, Lorg/apache/tika/sax/XMPContentHandler;->description(Lorg/apache/tika/metadata/Metadata;Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    const-string v0, "aux"

    .line 93
    .line 94
    const-string v1, "http://ns.adobe.com/exif/1.0/aux/"

    .line 95
    .line 96
    invoke-direct {p0, p1, v0, v1}, Lorg/apache/tika/sax/XMPContentHandler;->description(Lorg/apache/tika/metadata/Metadata;Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method public property(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/XMPContentHandler;->prefix:Ljava/lang/String;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v0, ":"

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v1, p0, Lorg/apache/tika/sax/XMPContentHandler;->uri:Ljava/lang/String;

    .line 24
    .line 25
    sget-object v2, Lorg/apache/tika/sax/XMPContentHandler;->EMPTY_ATTRIBUTES:Lorg/xml/sax/Attributes;

    .line 26
    .line 27
    invoke-virtual {p0, v1, p1, v0, v2}, Lorg/apache/tika/sax/SafeContentHandler;->startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2}, Ljava/lang/String;->toCharArray()[C

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    invoke-virtual {p0, v1, v2, p2}, Lorg/apache/tika/sax/SafeContentHandler;->characters([CII)V

    .line 40
    .line 41
    .line 42
    iget-object p2, p0, Lorg/apache/tika/sax/XMPContentHandler;->uri:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {p0, p2, p1, v0}, Lorg/apache/tika/sax/SafeContentHandler;->endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public startDescription(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 1
    iput-object p2, p0, Lorg/apache/tika/sax/XMPContentHandler;->prefix:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p3, p0, Lorg/apache/tika/sax/XMPContentHandler;->uri:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p3}, Lorg/apache/tika/sax/ContentHandlerDecorator;->startPrefixMapping(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lorg/xml/sax/helpers/AttributesImpl;

    .line 9
    .line 10
    invoke-direct {v0}, Lorg/xml/sax/helpers/AttributesImpl;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v3, "rdf:about"

    .line 14
    .line 15
    const-string v4, "CDATA"

    .line 16
    .line 17
    const-string v1, "http://www.w3.org/1999/02/22-rdf-syntax-ns#"

    .line 18
    .line 19
    const-string v2, "about"

    .line 20
    .line 21
    move-object v5, p1

    .line 22
    invoke-virtual/range {v0 .. v5}, Lorg/xml/sax/helpers/AttributesImpl;->addAttribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string p1, "Description"

    .line 26
    .line 27
    const-string p2, "rdf:Description"

    .line 28
    .line 29
    const-string p3, "http://www.w3.org/1999/02/22-rdf-syntax-ns#"

    .line 30
    .line 31
    invoke-virtual {p0, p3, p1, p2, v0}, Lorg/apache/tika/sax/SafeContentHandler;->startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public startDocument()V
    .locals 4

    .line 1
    invoke-super {p0}, Lorg/apache/tika/sax/ContentHandlerDecorator;->startDocument()V

    .line 2
    .line 3
    .line 4
    const-string v0, "rdf"

    .line 5
    .line 6
    const-string v1, "http://www.w3.org/1999/02/22-rdf-syntax-ns#"

    .line 7
    .line 8
    invoke-virtual {p0, v0, v1}, Lorg/apache/tika/sax/ContentHandlerDecorator;->startPrefixMapping(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "xmp"

    .line 12
    .line 13
    const-string v2, "http://ns.adobe.com/xap/1.0/"

    .line 14
    .line 15
    invoke-virtual {p0, v0, v2}, Lorg/apache/tika/sax/ContentHandlerDecorator;->startPrefixMapping(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v0, "rdf:RDF"

    .line 19
    .line 20
    sget-object v2, Lorg/apache/tika/sax/XMPContentHandler;->EMPTY_ATTRIBUTES:Lorg/xml/sax/Attributes;

    .line 21
    .line 22
    const-string v3, "RDF"

    .line 23
    .line 24
    invoke-virtual {p0, v1, v3, v0, v2}, Lorg/apache/tika/sax/SafeContentHandler;->startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

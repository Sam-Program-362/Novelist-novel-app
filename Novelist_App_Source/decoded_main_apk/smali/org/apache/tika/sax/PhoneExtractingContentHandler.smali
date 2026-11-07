.class public Lorg/apache/tika/sax/PhoneExtractingContentHandler;
.super Lorg/apache/tika/sax/ContentHandlerDecorator;
.source "SourceFile"


# static fields
.field private static final PHONE_NUMBERS:Ljava/lang/String; = "phonenumbers"


# instance fields
.field private final metadata:Lorg/apache/tika/metadata/Metadata;

.field private final stringBuilder:Ljava/lang/StringBuilder;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 4
    new-instance v0, Lorg/xml/sax/helpers/DefaultHandler;

    invoke-direct {v0}, Lorg/xml/sax/helpers/DefaultHandler;-><init>()V

    new-instance v1, Lorg/apache/tika/metadata/Metadata;

    invoke-direct {v1}, Lorg/apache/tika/metadata/Metadata;-><init>()V

    invoke-direct {p0, v0, v1}, Lorg/apache/tika/sax/PhoneExtractingContentHandler;-><init>(Lorg/xml/sax/ContentHandler;Lorg/apache/tika/metadata/Metadata;)V

    return-void
.end method

.method public constructor <init>(Lorg/xml/sax/ContentHandler;Lorg/apache/tika/metadata/Metadata;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lorg/apache/tika/sax/ContentHandlerDecorator;-><init>(Lorg/xml/sax/ContentHandler;)V

    .line 2
    iput-object p2, p0, Lorg/apache/tika/sax/PhoneExtractingContentHandler;->metadata:Lorg/apache/tika/metadata/Metadata;

    .line 3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iput-object p1, p0, Lorg/apache/tika/sax/PhoneExtractingContentHandler;->stringBuilder:Ljava/lang/StringBuilder;

    return-void
.end method


# virtual methods
.method public characters([CII)V
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Ljava/lang/String;

    .line 2
    .line 3
    add-int v1, p2, p3

    .line 4
    .line 5
    invoke-static {p1, p2, v1}, Ljava/util/Arrays;->copyOfRange([CII)[C

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lorg/apache/tika/sax/PhoneExtractingContentHandler;->stringBuilder:Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-super {p0, p1, p2, p3}, Lorg/apache/tika/sax/ContentHandlerDecorator;->characters([CII)V
    :try_end_0
    .catch Lorg/xml/sax/SAXException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catch_0
    move-exception p1

    .line 22
    invoke-virtual {p0, p1}, Lorg/apache/tika/sax/ContentHandlerDecorator;->handleException(Lorg/xml/sax/SAXException;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public endDocument()V
    .locals 6

    .line 1
    invoke-super {p0}, Lorg/apache/tika/sax/ContentHandlerDecorator;->endDocument()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/apache/tika/sax/PhoneExtractingContentHandler;->stringBuilder:Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, Lorg/apache/tika/sax/CleanPhoneText;->extractPhoneNumbers(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x0

    .line 19
    :goto_0
    if-ge v2, v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    check-cast v3, Ljava/lang/String;

    .line 28
    .line 29
    iget-object v4, p0, Lorg/apache/tika/sax/PhoneExtractingContentHandler;->metadata:Lorg/apache/tika/metadata/Metadata;

    .line 30
    .line 31
    const-string v5, "phonenumbers"

    .line 32
    .line 33
    invoke-virtual {v4, v5, v3}, Lorg/apache/tika/metadata/Metadata;->add(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    return-void
.end method

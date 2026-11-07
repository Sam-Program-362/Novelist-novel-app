.class public Lorg/apache/tika/sax/ToTextContentHandler;
.super Lorg/xml/sax/helpers/DefaultHandler;
.source "SourceFile"


# static fields
.field private static final SCRIPT:Ljava/lang/String; = "SCRIPT"

.field private static final STYLE:Ljava/lang/String; = "STYLE"


# instance fields
.field private scriptDepth:I

.field private styleDepth:I

.field private final writer:Ljava/io/Writer;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 6
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    invoke-direct {p0, v0}, Lorg/apache/tika/sax/ToTextContentHandler;-><init>(Ljava/io/Writer;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/OutputStream;Ljava/lang/String;)V
    .locals 1

    .line 5
    new-instance v0, Ljava/io/OutputStreamWriter;

    invoke-direct {v0, p1, p2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lorg/apache/tika/sax/ToTextContentHandler;-><init>(Ljava/io/Writer;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/Writer;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/xml/sax/helpers/DefaultHandler;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lorg/apache/tika/sax/ToTextContentHandler;->styleDepth:I

    .line 3
    iput v0, p0, Lorg/apache/tika/sax/ToTextContentHandler;->scriptDepth:I

    .line 4
    iput-object p1, p0, Lorg/apache/tika/sax/ToTextContentHandler;->writer:Ljava/io/Writer;

    return-void
.end method


# virtual methods
.method public characters([CII)V
    .locals 3

    .line 1
    iget v0, p0, Lorg/apache/tika/sax/ToTextContentHandler;->styleDepth:I

    .line 2
    .line 3
    iget v1, p0, Lorg/apache/tika/sax/ToTextContentHandler;->scriptDepth:I

    .line 4
    .line 5
    add-int/2addr v0, v1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    :try_start_0
    iget-object v0, p0, Lorg/apache/tika/sax/ToTextContentHandler;->writer:Ljava/io/Writer;

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2, p3}, Ljava/io/Writer;->write([CII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catch_0
    move-exception v0

    .line 16
    new-instance v1, Lorg/xml/sax/SAXException;

    .line 17
    .line 18
    new-instance v2, Ljava/lang/String;

    .line 19
    .line 20
    invoke-direct {v2, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V

    .line 21
    .line 22
    .line 23
    const-string p1, "Error writing: "

    .line 24
    .line 25
    invoke-virtual {p1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-direct {v1, p1, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 30
    .line 31
    .line 32
    throw v1
.end method

.method public endDocument()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lorg/apache/tika/sax/ToTextContentHandler;->writer:Ljava/io/Writer;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/Writer;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_0
    move-exception v0

    .line 8
    new-instance v1, Lorg/xml/sax/SAXException;

    .line 9
    .line 10
    const-string v2, "Error flushing character output"

    .line 11
    .line 12
    invoke-direct {v1, v2, v0}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 13
    .line 14
    .line 15
    throw v1
.end method

.method public endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    const-string p1, ""

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object p1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 7
    .line 8
    invoke-virtual {p3, p1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :goto_0
    const-string p2, "STYLE"

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-eqz p2, :cond_1

    .line 19
    .line 20
    iget p2, p0, Lorg/apache/tika/sax/ToTextContentHandler;->styleDepth:I

    .line 21
    .line 22
    add-int/lit8 p2, p2, -0x1

    .line 23
    .line 24
    iput p2, p0, Lorg/apache/tika/sax/ToTextContentHandler;->styleDepth:I

    .line 25
    .line 26
    :cond_1
    const-string p2, "SCRIPT"

    .line 27
    .line 28
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_2

    .line 33
    .line 34
    iget p1, p0, Lorg/apache/tika/sax/ToTextContentHandler;->scriptDepth:I

    .line 35
    .line 36
    add-int/lit8 p1, p1, -0x1

    .line 37
    .line 38
    iput p1, p0, Lorg/apache/tika/sax/ToTextContentHandler;->scriptDepth:I

    .line 39
    .line 40
    :cond_2
    return-void
.end method

.method public ignorableWhitespace([CII)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lorg/apache/tika/sax/ToTextContentHandler;->characters([CII)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 0

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    const-string p1, ""

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object p1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 7
    .line 8
    invoke-virtual {p3, p1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :goto_0
    const-string p2, "STYLE"

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-eqz p2, :cond_1

    .line 19
    .line 20
    iget p2, p0, Lorg/apache/tika/sax/ToTextContentHandler;->styleDepth:I

    .line 21
    .line 22
    add-int/lit8 p2, p2, 0x1

    .line 23
    .line 24
    iput p2, p0, Lorg/apache/tika/sax/ToTextContentHandler;->styleDepth:I

    .line 25
    .line 26
    :cond_1
    const-string p2, "SCRIPT"

    .line 27
    .line 28
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_2

    .line 33
    .line 34
    iget p1, p0, Lorg/apache/tika/sax/ToTextContentHandler;->scriptDepth:I

    .line 35
    .line 36
    add-int/lit8 p1, p1, 0x1

    .line 37
    .line 38
    iput p1, p0, Lorg/apache/tika/sax/ToTextContentHandler;->scriptDepth:I

    .line 39
    .line 40
    :cond_2
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/ToTextContentHandler;->writer:Ljava/io/Writer;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

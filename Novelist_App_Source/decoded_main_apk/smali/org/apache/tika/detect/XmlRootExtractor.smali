.class public Lorg/apache/tika/detect/XmlRootExtractor;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/tika/detect/XmlRootExtractor$MalformedCharException;,
        Lorg/apache/tika/detect/XmlRootExtractor$ExtractorHandler;
    }
.end annotation


# static fields
.field private static final EMPTY_CONTEXT:Lorg/apache/tika/parser/ParseContext;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/tika/parser/ParseContext;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/apache/tika/parser/ParseContext;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lorg/apache/tika/detect/XmlRootExtractor;->EMPTY_CONTEXT:Lorg/apache/tika/parser/ParseContext;

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

.method private extractRootElement(Ljava/io/InputStream;Z)Ljavax/xml/namespace/QName;
    .locals 2

    .line 6
    new-instance v0, Lorg/apache/tika/detect/XmlRootExtractor$ExtractorHandler;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/apache/tika/detect/XmlRootExtractor$ExtractorHandler;-><init>(I)V

    .line 7
    :try_start_0
    new-instance v1, Lw2/a;

    .line 8
    invoke-direct {v1, p1}, Lw2/c;-><init>(Ljava/io/InputStream;)V

    .line 9
    sget-object p1, Lorg/apache/tika/detect/XmlRootExtractor;->EMPTY_CONTEXT:Lorg/apache/tika/parser/ParseContext;

    invoke-static {v1, v0, p1}, Lorg/apache/tika/utils/XMLReaderUtils;->parseSAX(Ljava/io/InputStream;Lorg/xml/sax/ContentHandler;Lorg/apache/tika/parser/ParseContext;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_2

    :goto_0
    if-eqz p2, :cond_1

    .line 10
    instance-of p2, p1, Ljava/io/CharConversionException;

    if-nez p2, :cond_0

    .line 11
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    instance-of p2, p2, Ljava/io/CharConversionException;

    if-nez p2, :cond_0

    goto :goto_1

    .line 12
    :cond_0
    new-instance p2, Lorg/apache/tika/detect/XmlRootExtractor$MalformedCharException;

    invoke-direct {p2, p1}, Lorg/apache/tika/detect/XmlRootExtractor$MalformedCharException;-><init>(Ljava/lang/Exception;)V

    throw p2

    .line 13
    :cond_1
    :goto_1
    invoke-static {v0}, Lorg/apache/tika/detect/XmlRootExtractor$ExtractorHandler;->a(Lorg/apache/tika/detect/XmlRootExtractor$ExtractorHandler;)Ljavax/xml/namespace/QName;

    move-result-object p1

    return-object p1

    .line 14
    :goto_2
    throw p1
.end method


# virtual methods
.method public extractRootElement(Ljava/io/InputStream;)Ljavax/xml/namespace/QName;
    .locals 1

    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, p1, v0}, Lorg/apache/tika/detect/XmlRootExtractor;->extractRootElement(Ljava/io/InputStream;Z)Ljavax/xml/namespace/QName;

    move-result-object p1

    return-object p1
.end method

.method public extractRootElement([B)Ljavax/xml/namespace/QName;
    .locals 3

    :goto_0
    const/4 v0, 0x1

    .line 1
    :try_start_0
    new-instance v1, Lw2/h;

    invoke-direct {v1, p1}, Lw2/h;-><init>([B)V

    invoke-direct {p0, v1, v0}, Lorg/apache/tika/detect/XmlRootExtractor;->extractRootElement(Ljava/io/InputStream;Z)Ljavax/xml/namespace/QName;

    move-result-object p1
    :try_end_0
    .catch Lorg/apache/tika/detect/XmlRootExtractor$MalformedCharException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 2
    :catch_0
    array-length v1, p1

    div-int/lit8 v1, v1, 0x2

    .line 3
    rem-int/lit8 v2, v1, 0x2

    if-ne v2, v0, :cond_0

    add-int/lit8 v1, v1, -0x1

    :cond_0
    if-lez v1, :cond_1

    .line 4
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

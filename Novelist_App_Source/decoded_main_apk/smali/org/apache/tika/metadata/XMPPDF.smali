.class public interface abstract Lorg/apache/tika/metadata/XMPPDF;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ABOUT:Lorg/apache/tika/metadata/Property;

.field public static final KEY_WORDS:Lorg/apache/tika/metadata/Property;

.field public static final PDF_VERSION:Lorg/apache/tika/metadata/Property;

.field public static final PREFIX:Ljava/lang/String; = "xmp:pdf:"

.field public static final PRODUCER:Lorg/apache/tika/metadata/Property;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "xmp:pdf:About"

    .line 2
    .line 3
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lorg/apache/tika/metadata/XMPPDF;->ABOUT:Lorg/apache/tika/metadata/Property;

    .line 8
    .line 9
    const-string v0, "xmp:pdf:Keywords"

    .line 10
    .line 11
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lorg/apache/tika/metadata/XMPPDF;->KEY_WORDS:Lorg/apache/tika/metadata/Property;

    .line 16
    .line 17
    const-string v0, "xmp:pdf:PDFVersion"

    .line 18
    .line 19
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lorg/apache/tika/metadata/XMPPDF;->PDF_VERSION:Lorg/apache/tika/metadata/Property;

    .line 24
    .line 25
    const-string v0, "xmp:pdf:Producer"

    .line 26
    .line 27
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lorg/apache/tika/metadata/XMPPDF;->PRODUCER:Lorg/apache/tika/metadata/Property;

    .line 32
    .line 33
    return-void
.end method

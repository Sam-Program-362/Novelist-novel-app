.class public interface abstract Lorg/apache/tika/metadata/XMPRights;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final CERTIFICATE:Lorg/apache/tika/metadata/Property;

.field public static final MARKED:Lorg/apache/tika/metadata/Property;

.field public static final NAMESPACE_URI_XMP_RIGHTS:Ljava/lang/String; = "http://ns.adobe.com/xap/1.0/rights/"

.field public static final OWNER:Lorg/apache/tika/metadata/Property;

.field public static final PREFIX_:Ljava/lang/String; = "xmpRights:"

.field public static final PREFIX_XMP_RIGHTS:Ljava/lang/String; = "xmpRights"

.field public static final USAGE_TERMS:Lorg/apache/tika/metadata/Property;

.field public static final WEB_STATEMENT:Lorg/apache/tika/metadata/Property;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "xmpRights:Certificate"

    .line 2
    .line 3
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lorg/apache/tika/metadata/XMPRights;->CERTIFICATE:Lorg/apache/tika/metadata/Property;

    .line 8
    .line 9
    const-string v0, "xmpRights:Marked"

    .line 10
    .line 11
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalBoolean(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lorg/apache/tika/metadata/XMPRights;->MARKED:Lorg/apache/tika/metadata/Property;

    .line 16
    .line 17
    const-string v0, "xmpRights:Owner"

    .line 18
    .line 19
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lorg/apache/tika/metadata/XMPRights;->OWNER:Lorg/apache/tika/metadata/Property;

    .line 24
    .line 25
    const-string v0, "xmpRights:UsageTerms"

    .line 26
    .line 27
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lorg/apache/tika/metadata/XMPRights;->USAGE_TERMS:Lorg/apache/tika/metadata/Property;

    .line 32
    .line 33
    const-string v0, "xmpRights:WebStatement"

    .line 34
    .line 35
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lorg/apache/tika/metadata/XMPRights;->WEB_STATEMENT:Lorg/apache/tika/metadata/Property;

    .line 40
    .line 41
    return-void
.end method

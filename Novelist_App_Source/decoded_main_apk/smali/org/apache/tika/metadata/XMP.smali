.class public interface abstract Lorg/apache/tika/metadata/XMP;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ABOUT:Lorg/apache/tika/metadata/Property;

.field public static final ADVISORY:Lorg/apache/tika/metadata/Property;

.field public static final CREATE_DATE:Lorg/apache/tika/metadata/Property;

.field public static final CREATOR_TOOL:Lorg/apache/tika/metadata/Property;

.field public static final IDENTIFIER:Lorg/apache/tika/metadata/Property;

.field public static final LABEL:Lorg/apache/tika/metadata/Property;

.field public static final METADATA_DATE:Lorg/apache/tika/metadata/Property;

.field public static final MODIFY_DATE:Lorg/apache/tika/metadata/Property;

.field public static final NAMESPACE_URI:Ljava/lang/String; = "http://ns.adobe.com/xap/1.0/"

.field public static final NICKNAME:Lorg/apache/tika/metadata/Property;

.field public static final PREFIX:Ljava/lang/String; = "xmp"

.field public static final PREFIX_:Ljava/lang/String; = "xmp:"

.field public static final RATING:Lorg/apache/tika/metadata/Property;

.field public static final TITLE:Lorg/apache/tika/metadata/Property;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "xmp:About"

    .line 2
    .line 3
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lorg/apache/tika/metadata/XMP;->ABOUT:Lorg/apache/tika/metadata/Property;

    .line 8
    .line 9
    const-string v0, "xmp:Advisory"

    .line 10
    .line 11
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lorg/apache/tika/metadata/XMP;->ADVISORY:Lorg/apache/tika/metadata/Property;

    .line 16
    .line 17
    const-string v0, "xmp:CreateDate"

    .line 18
    .line 19
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalDate(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lorg/apache/tika/metadata/XMP;->CREATE_DATE:Lorg/apache/tika/metadata/Property;

    .line 24
    .line 25
    const-string v0, "xmp:CreatorTool"

    .line 26
    .line 27
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lorg/apache/tika/metadata/XMP;->CREATOR_TOOL:Lorg/apache/tika/metadata/Property;

    .line 32
    .line 33
    const-string v0, "xmp:Identifier"

    .line 34
    .line 35
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lorg/apache/tika/metadata/XMP;->IDENTIFIER:Lorg/apache/tika/metadata/Property;

    .line 40
    .line 41
    const-string v0, "xmp:Label"

    .line 42
    .line 43
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lorg/apache/tika/metadata/XMP;->LABEL:Lorg/apache/tika/metadata/Property;

    .line 48
    .line 49
    const-string v0, "xmp:MetadataDate"

    .line 50
    .line 51
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalDate(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, Lorg/apache/tika/metadata/XMP;->METADATA_DATE:Lorg/apache/tika/metadata/Property;

    .line 56
    .line 57
    const-string v0, "xmp:ModifyDate"

    .line 58
    .line 59
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalDate(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sput-object v0, Lorg/apache/tika/metadata/XMP;->MODIFY_DATE:Lorg/apache/tika/metadata/Property;

    .line 64
    .line 65
    const-string v0, "xmp:NickName"

    .line 66
    .line 67
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    sput-object v0, Lorg/apache/tika/metadata/XMP;->NICKNAME:Lorg/apache/tika/metadata/Property;

    .line 72
    .line 73
    const-string v0, "xmp:Rating"

    .line 74
    .line 75
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    sput-object v0, Lorg/apache/tika/metadata/XMP;->RATING:Lorg/apache/tika/metadata/Property;

    .line 80
    .line 81
    const-string v0, "xmp:Title"

    .line 82
    .line 83
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    sput-object v0, Lorg/apache/tika/metadata/XMP;->TITLE:Lorg/apache/tika/metadata/Property;

    .line 88
    .line 89
    return-void
.end method

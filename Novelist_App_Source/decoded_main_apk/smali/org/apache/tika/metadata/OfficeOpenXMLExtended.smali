.class public interface abstract Lorg/apache/tika/metadata/OfficeOpenXMLExtended;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final APPLICATION:Lorg/apache/tika/metadata/Property;

.field public static final APP_VERSION:Lorg/apache/tika/metadata/Property;

.field public static final COMMENTS:Lorg/apache/tika/metadata/Property;

.field public static final COMPANY:Lorg/apache/tika/metadata/Property;

.field public static final DOC_SECURITY:Lorg/apache/tika/metadata/Property;

.field public static final DOC_SECURITY_STRING:Lorg/apache/tika/metadata/Property;

.field public static final HIDDEN_SLIDES:Lorg/apache/tika/metadata/Property;

.field public static final MANAGER:Lorg/apache/tika/metadata/Property;

.field public static final NAMESPACE_URI:Ljava/lang/String; = "http://schemas.openxmlformats.org/officeDocument/2006/extended-properties/"

.field public static final NOTES:Lorg/apache/tika/metadata/Property;

.field public static final PREFIX:Ljava/lang/String; = "extended-properties"

.field public static final PRESENTATION_FORMAT:Lorg/apache/tika/metadata/Property;

.field public static final SECURITY_LOCKED_FOR_ANNOTATIONS:Ljava/lang/String; = "LockedForAnnotations"

.field public static final SECURITY_NONE:Ljava/lang/String; = "None"

.field public static final SECURITY_PASSWORD_PROTECTED:Ljava/lang/String; = "PasswordProtected"

.field public static final SECURITY_READ_ONLY_ENFORCED:Ljava/lang/String; = "ReadOnlyEnforced"

.field public static final SECURITY_READ_ONLY_RECOMMENDED:Ljava/lang/String; = "ReadOnlyRecommended"

.field public static final SECURITY_UNKNOWN:Ljava/lang/String; = "Unknown"

.field public static final TEMPLATE:Lorg/apache/tika/metadata/Property;

.field public static final TOTAL_TIME:Lorg/apache/tika/metadata/Property;

.field public static final WORD_PROCESSING_NAMESPACE_URI:Ljava/lang/String; = "http://schemas.openxmlformats.org/wordprocessingml/2006/main"

.field public static final WORD_PROCESSING_PREFIX:Ljava/lang/String; = "w"


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const-string v0, "extended-properties:Template"

    .line 2
    .line 3
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lorg/apache/tika/metadata/OfficeOpenXMLExtended;->TEMPLATE:Lorg/apache/tika/metadata/Property;

    .line 8
    .line 9
    const-string v0, "extended-properties:Manager"

    .line 10
    .line 11
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lorg/apache/tika/metadata/OfficeOpenXMLExtended;->MANAGER:Lorg/apache/tika/metadata/Property;

    .line 16
    .line 17
    const-string v0, "extended-properties:Company"

    .line 18
    .line 19
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lorg/apache/tika/metadata/OfficeOpenXMLExtended;->COMPANY:Lorg/apache/tika/metadata/Property;

    .line 24
    .line 25
    const-string v0, "extended-properties:PresentationFormat"

    .line 26
    .line 27
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lorg/apache/tika/metadata/OfficeOpenXMLExtended;->PRESENTATION_FORMAT:Lorg/apache/tika/metadata/Property;

    .line 32
    .line 33
    const-string v0, "extended-properties:Notes"

    .line 34
    .line 35
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lorg/apache/tika/metadata/OfficeOpenXMLExtended;->NOTES:Lorg/apache/tika/metadata/Property;

    .line 40
    .line 41
    const-string v0, "extended-properties:TotalTime"

    .line 42
    .line 43
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lorg/apache/tika/metadata/OfficeOpenXMLExtended;->TOTAL_TIME:Lorg/apache/tika/metadata/Property;

    .line 48
    .line 49
    const-string v0, "extended-properties:HiddedSlides"

    .line 50
    .line 51
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, Lorg/apache/tika/metadata/OfficeOpenXMLExtended;->HIDDEN_SLIDES:Lorg/apache/tika/metadata/Property;

    .line 56
    .line 57
    const-string v0, "extended-properties:Application"

    .line 58
    .line 59
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sput-object v0, Lorg/apache/tika/metadata/OfficeOpenXMLExtended;->APPLICATION:Lorg/apache/tika/metadata/Property;

    .line 64
    .line 65
    const-string v0, "extended-properties:AppVersion"

    .line 66
    .line 67
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    sput-object v0, Lorg/apache/tika/metadata/OfficeOpenXMLExtended;->APP_VERSION:Lorg/apache/tika/metadata/Property;

    .line 72
    .line 73
    const-string v0, "extended-properties:DocSecurity"

    .line 74
    .line 75
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    sput-object v0, Lorg/apache/tika/metadata/OfficeOpenXMLExtended;->DOC_SECURITY:Lorg/apache/tika/metadata/Property;

    .line 80
    .line 81
    const-string v5, "LockedForAnnotations"

    .line 82
    .line 83
    const-string v6, "Unknown"

    .line 84
    .line 85
    const-string v1, "None"

    .line 86
    .line 87
    const-string v2, "PasswordProtected"

    .line 88
    .line 89
    const-string v3, "ReadOnlyRecommended"

    .line 90
    .line 91
    const-string v4, "ReadOnlyEnforced"

    .line 92
    .line 93
    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    const-string v1, "extended-properties:DocSecurityString"

    .line 98
    .line 99
    invoke-static {v1, v0}, Lorg/apache/tika/metadata/Property;->externalClosedChoise(Ljava/lang/String;[Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    sput-object v0, Lorg/apache/tika/metadata/OfficeOpenXMLExtended;->DOC_SECURITY_STRING:Lorg/apache/tika/metadata/Property;

    .line 104
    .line 105
    const-string v0, "w:Comments"

    .line 106
    .line 107
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    sput-object v0, Lorg/apache/tika/metadata/OfficeOpenXMLExtended;->COMMENTS:Lorg/apache/tika/metadata/Property;

    .line 112
    .line 113
    return-void
.end method

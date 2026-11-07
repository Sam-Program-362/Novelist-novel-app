.class public interface abstract Lorg/apache/tika/metadata/OfficeOpenXMLCore;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final CATEGORY:Lorg/apache/tika/metadata/Property;

.field public static final CONTENT_STATUS:Lorg/apache/tika/metadata/Property;

.field public static final LAST_MODIFIED_BY:Lorg/apache/tika/metadata/Property;

.field public static final LAST_PRINTED:Lorg/apache/tika/metadata/Property;

.field public static final NAMESPACE_URI:Ljava/lang/String; = "http://schemas.openxmlformats.org/package/2006/metadata/core-properties/"

.field public static final PREFIX:Ljava/lang/String; = "cp"

.field public static final REVISION:Lorg/apache/tika/metadata/Property;

.field public static final SUBJECT:Lorg/apache/tika/metadata/Property;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final VERSION:Lorg/apache/tika/metadata/Property;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "cp:category"

    .line 2
    .line 3
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lorg/apache/tika/metadata/OfficeOpenXMLCore;->CATEGORY:Lorg/apache/tika/metadata/Property;

    .line 8
    .line 9
    const-string v0, "cp:contentStatus"

    .line 10
    .line 11
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lorg/apache/tika/metadata/OfficeOpenXMLCore;->CONTENT_STATUS:Lorg/apache/tika/metadata/Property;

    .line 16
    .line 17
    const-string v0, "cp:lastModifiedBy"

    .line 18
    .line 19
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lorg/apache/tika/metadata/OfficeOpenXMLCore;->LAST_MODIFIED_BY:Lorg/apache/tika/metadata/Property;

    .line 24
    .line 25
    const-string v0, "cp:lastPrinted"

    .line 26
    .line 27
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalDate(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lorg/apache/tika/metadata/OfficeOpenXMLCore;->LAST_PRINTED:Lorg/apache/tika/metadata/Property;

    .line 32
    .line 33
    const-string v0, "cp:revision"

    .line 34
    .line 35
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lorg/apache/tika/metadata/OfficeOpenXMLCore;->REVISION:Lorg/apache/tika/metadata/Property;

    .line 40
    .line 41
    const-string v0, "cp:version"

    .line 42
    .line 43
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lorg/apache/tika/metadata/OfficeOpenXMLCore;->VERSION:Lorg/apache/tika/metadata/Property;

    .line 48
    .line 49
    const-string v0, "cp:subject"

    .line 50
    .line 51
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sget-object v1, Lorg/apache/tika/metadata/DublinCore;->SUBJECT:Lorg/apache/tika/metadata/Property;

    .line 56
    .line 57
    filled-new-array {v1}, [Lorg/apache/tika/metadata/Property;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-static {v0, v1}, Lorg/apache/tika/metadata/Property;->composite(Lorg/apache/tika/metadata/Property;[Lorg/apache/tika/metadata/Property;)Lorg/apache/tika/metadata/Property;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sput-object v0, Lorg/apache/tika/metadata/OfficeOpenXMLCore;->SUBJECT:Lorg/apache/tika/metadata/Property;

    .line 66
    .line 67
    return-void
.end method

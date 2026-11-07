.class public interface abstract Lorg/apache/tika/metadata/WordPerfect;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ENCRYPTED:Lorg/apache/tika/metadata/Property;

.field public static final FILE_ID:Lorg/apache/tika/metadata/Property;

.field public static final FILE_SIZE:Lorg/apache/tika/metadata/Property;

.field public static final FILE_TYPE:Lorg/apache/tika/metadata/Property;

.field public static final MAJOR_VERSION:Lorg/apache/tika/metadata/Property;

.field public static final MINOR_VERSION:Lorg/apache/tika/metadata/Property;

.field public static final PRODUCT_TYPE:Lorg/apache/tika/metadata/Property;

.field public static final WORDPERFECT_METADATA_NAME_PREFIX:Ljava/lang/String; = "wordperfect"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "wordperfect:FileSize"

    .line 2
    .line 3
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lorg/apache/tika/metadata/WordPerfect;->FILE_SIZE:Lorg/apache/tika/metadata/Property;

    .line 8
    .line 9
    const-string v0, "wordperfect:FileId"

    .line 10
    .line 11
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lorg/apache/tika/metadata/WordPerfect;->FILE_ID:Lorg/apache/tika/metadata/Property;

    .line 16
    .line 17
    const-string v0, "wordperfect:ProductType"

    .line 18
    .line 19
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lorg/apache/tika/metadata/WordPerfect;->PRODUCT_TYPE:Lorg/apache/tika/metadata/Property;

    .line 24
    .line 25
    const-string v0, "wordperfect:FileType"

    .line 26
    .line 27
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lorg/apache/tika/metadata/WordPerfect;->FILE_TYPE:Lorg/apache/tika/metadata/Property;

    .line 32
    .line 33
    const-string v0, "wordperfect:MajorVersion"

    .line 34
    .line 35
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lorg/apache/tika/metadata/WordPerfect;->MAJOR_VERSION:Lorg/apache/tika/metadata/Property;

    .line 40
    .line 41
    const-string v0, "wordperfect:MinorVersion"

    .line 42
    .line 43
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lorg/apache/tika/metadata/WordPerfect;->MINOR_VERSION:Lorg/apache/tika/metadata/Property;

    .line 48
    .line 49
    const-string v0, "wordperfect:Encrypted"

    .line 50
    .line 51
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalBoolean(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, Lorg/apache/tika/metadata/WordPerfect;->ENCRYPTED:Lorg/apache/tika/metadata/Property;

    .line 56
    .line 57
    return-void
.end method

.class public interface abstract Lorg/apache/tika/metadata/QuattroPro;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final BUILD:Lorg/apache/tika/metadata/Property;

.field public static final ID:Lorg/apache/tika/metadata/Property;

.field public static final LOWEST_VERSION:Lorg/apache/tika/metadata/Property;

.field public static final QUATTROPRO_METADATA_NAME_PREFIX:Ljava/lang/String; = "wordperfect"

.field public static final VERSION:Lorg/apache/tika/metadata/Property;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "wordperfect:Id"

    .line 2
    .line 3
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lorg/apache/tika/metadata/QuattroPro;->ID:Lorg/apache/tika/metadata/Property;

    .line 8
    .line 9
    const-string v0, "wordperfect:Version"

    .line 10
    .line 11
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lorg/apache/tika/metadata/QuattroPro;->VERSION:Lorg/apache/tika/metadata/Property;

    .line 16
    .line 17
    const-string v0, "wordperfect:Build"

    .line 18
    .line 19
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lorg/apache/tika/metadata/QuattroPro;->BUILD:Lorg/apache/tika/metadata/Property;

    .line 24
    .line 25
    const-string v0, "wordperfect:LowestVersion"

    .line 26
    .line 27
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lorg/apache/tika/metadata/QuattroPro;->LOWEST_VERSION:Lorg/apache/tika/metadata/Property;

    .line 32
    .line 33
    return-void
.end method

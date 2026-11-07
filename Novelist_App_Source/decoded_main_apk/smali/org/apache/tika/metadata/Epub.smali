.class public interface abstract Lorg/apache/tika/metadata/Epub;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final EPUB_PREFIX:Ljava/lang/String; = "epub:"

.field public static final RENDITION_LAYOUT:Lorg/apache/tika/metadata/Property;

.field public static final VERSION:Lorg/apache/tika/metadata/Property;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "pre-paginated"

    .line 2
    .line 3
    const-string v1, "reflowable"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "epub:rendition:layout"

    .line 10
    .line 11
    invoke-static {v1, v0}, Lorg/apache/tika/metadata/Property;->externalClosedChoise(Ljava/lang/String;[Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lorg/apache/tika/metadata/Epub;->RENDITION_LAYOUT:Lorg/apache/tika/metadata/Property;

    .line 16
    .line 17
    const-string v0, "epub:version"

    .line 18
    .line 19
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lorg/apache/tika/metadata/Epub;->VERSION:Lorg/apache/tika/metadata/Property;

    .line 24
    .line 25
    return-void
.end method

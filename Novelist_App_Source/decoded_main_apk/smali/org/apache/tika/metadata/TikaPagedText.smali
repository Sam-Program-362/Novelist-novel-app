.class public interface abstract Lorg/apache/tika/metadata/TikaPagedText;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final PAGE_NUMBER:Lorg/apache/tika/metadata/Property;

.field public static final PAGE_ROTATION:Lorg/apache/tika/metadata/Property;

.field public static final TIKA_PAGED_TEXT_PREFIX:Ljava/lang/String; = "tika_pg:"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "tika_pg:page_number"

    .line 2
    .line 3
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lorg/apache/tika/metadata/TikaPagedText;->PAGE_NUMBER:Lorg/apache/tika/metadata/Property;

    .line 8
    .line 9
    const-string v0, "tika_pg:page_rotation"

    .line 10
    .line 11
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalRational(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lorg/apache/tika/metadata/TikaPagedText;->PAGE_ROTATION:Lorg/apache/tika/metadata/Property;

    .line 16
    .line 17
    return-void
.end method

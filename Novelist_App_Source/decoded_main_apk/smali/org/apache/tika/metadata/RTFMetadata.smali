.class public interface abstract Lorg/apache/tika/metadata/RTFMetadata;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final CONTAINS_ENCAPSULATED_HTML:Lorg/apache/tika/metadata/Property;

.field public static final EMB_APP_VERSION:Lorg/apache/tika/metadata/Property;

.field public static final EMB_CLASS:Lorg/apache/tika/metadata/Property;

.field public static final EMB_ITEM:Lorg/apache/tika/metadata/Property;

.field public static final EMB_TOPIC:Lorg/apache/tika/metadata/Property;

.field public static final PREFIX_RTF_META:Ljava/lang/String; = "rtf_meta"

.field public static final RTF_PICT_META_PREFIX:Ljava/lang/String; = "rtf_pict:"

.field public static final THUMBNAIL:Lorg/apache/tika/metadata/Property;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "rtf_meta:thumbnail"

    .line 2
    .line 3
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalBoolean(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lorg/apache/tika/metadata/RTFMetadata;->THUMBNAIL:Lorg/apache/tika/metadata/Property;

    .line 8
    .line 9
    const-string v0, "rtf_meta:emb_app_version"

    .line 10
    .line 11
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lorg/apache/tika/metadata/RTFMetadata;->EMB_APP_VERSION:Lorg/apache/tika/metadata/Property;

    .line 16
    .line 17
    const-string v0, "rtf_meta:emb_class"

    .line 18
    .line 19
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lorg/apache/tika/metadata/RTFMetadata;->EMB_CLASS:Lorg/apache/tika/metadata/Property;

    .line 24
    .line 25
    const-string v0, "rtf_meta:emb_topic"

    .line 26
    .line 27
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lorg/apache/tika/metadata/RTFMetadata;->EMB_TOPIC:Lorg/apache/tika/metadata/Property;

    .line 32
    .line 33
    const-string v0, "rtf_meta:emb_item"

    .line 34
    .line 35
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lorg/apache/tika/metadata/RTFMetadata;->EMB_ITEM:Lorg/apache/tika/metadata/Property;

    .line 40
    .line 41
    const-string v0, "rtf_meta:contains_encapsulated_html"

    .line 42
    .line 43
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalBoolean(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lorg/apache/tika/metadata/RTFMetadata;->CONTAINS_ENCAPSULATED_HTML:Lorg/apache/tika/metadata/Property;

    .line 48
    .line 49
    return-void
.end method

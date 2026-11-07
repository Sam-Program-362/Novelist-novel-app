.class public interface abstract Lorg/apache/tika/metadata/HTML;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final PREFIX_HTML_META:Ljava/lang/String; = "html_meta"

.field public static final SCRIPT_SOURCE:Lorg/apache/tika/metadata/Property;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "html_meta:scriptSrc"

    .line 2
    .line 3
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lorg/apache/tika/metadata/HTML;->SCRIPT_SOURCE:Lorg/apache/tika/metadata/Property;

    .line 8
    .line 9
    return-void
.end method

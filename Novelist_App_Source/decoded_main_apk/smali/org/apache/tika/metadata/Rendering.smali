.class public interface abstract Lorg/apache/tika/metadata/Rendering;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final RENDERED_BY:Lorg/apache/tika/metadata/Property;

.field public static final RENDERED_MS:Lorg/apache/tika/metadata/Property;

.field public static final RENDERING_PREFIX:Ljava/lang/String; = "rendering:"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "rendering:Rendered-By"

    .line 2
    .line 3
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lorg/apache/tika/metadata/Rendering;->RENDERED_BY:Lorg/apache/tika/metadata/Property;

    .line 8
    .line 9
    const-string v0, "rendering:rendering-time-ms"

    .line 10
    .line 11
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalReal(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lorg/apache/tika/metadata/Rendering;->RENDERED_MS:Lorg/apache/tika/metadata/Property;

    .line 16
    .line 17
    return-void
.end method

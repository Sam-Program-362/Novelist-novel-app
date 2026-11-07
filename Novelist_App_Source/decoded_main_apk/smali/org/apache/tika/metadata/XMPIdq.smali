.class public interface abstract Lorg/apache/tika/metadata/XMPIdq;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final NAMESPACE_URI:Ljava/lang/String; = "http://ns.adobe.com/xmp/identifier/qual/1.0/"

.field public static final PREFIX:Ljava/lang/String; = "xmpidq"

.field public static final PREFIX_:Ljava/lang/String; = "xmpidq:"

.field public static final SCHEME:Lorg/apache/tika/metadata/Property;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "xmpidq:Scheme"

    .line 2
    .line 3
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lorg/apache/tika/metadata/XMPIdq;->SCHEME:Lorg/apache/tika/metadata/Property;

    .line 8
    .line 9
    return-void
.end method

.class public interface abstract Lorg/apache/tika/metadata/ExternalProcess;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final EXIT_VALUE:Lorg/apache/tika/metadata/Property;

.field public static final IS_TIMEOUT:Lorg/apache/tika/metadata/Property;

.field public static final PREFIX_EXTERNAL_META:Ljava/lang/String; = "external-process"

.field public static final STD_ERR:Lorg/apache/tika/metadata/Property;

.field public static final STD_ERR_IS_TRUNCATED:Lorg/apache/tika/metadata/Property;

.field public static final STD_ERR_LENGTH:Lorg/apache/tika/metadata/Property;

.field public static final STD_OUT:Lorg/apache/tika/metadata/Property;

.field public static final STD_OUT_IS_TRUNCATED:Lorg/apache/tika/metadata/Property;

.field public static final STD_OUT_LENGTH:Lorg/apache/tika/metadata/Property;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "external-process:stdout"

    .line 2
    .line 3
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lorg/apache/tika/metadata/ExternalProcess;->STD_OUT:Lorg/apache/tika/metadata/Property;

    .line 8
    .line 9
    const-string v0, "external-process:stderr"

    .line 10
    .line 11
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lorg/apache/tika/metadata/ExternalProcess;->STD_ERR:Lorg/apache/tika/metadata/Property;

    .line 16
    .line 17
    const-string v0, "external-process:stdout-truncated"

    .line 18
    .line 19
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalBoolean(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lorg/apache/tika/metadata/ExternalProcess;->STD_OUT_IS_TRUNCATED:Lorg/apache/tika/metadata/Property;

    .line 24
    .line 25
    const-string v0, "external-process:stderr-truncated"

    .line 26
    .line 27
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalBoolean(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lorg/apache/tika/metadata/ExternalProcess;->STD_ERR_IS_TRUNCATED:Lorg/apache/tika/metadata/Property;

    .line 32
    .line 33
    const-string v0, "external-process:stdout-length"

    .line 34
    .line 35
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalReal(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lorg/apache/tika/metadata/ExternalProcess;->STD_OUT_LENGTH:Lorg/apache/tika/metadata/Property;

    .line 40
    .line 41
    const-string v0, "external-process:stderr-length"

    .line 42
    .line 43
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalReal(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lorg/apache/tika/metadata/ExternalProcess;->STD_ERR_LENGTH:Lorg/apache/tika/metadata/Property;

    .line 48
    .line 49
    const-string v0, "external-process:exit-value"

    .line 50
    .line 51
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, Lorg/apache/tika/metadata/ExternalProcess;->EXIT_VALUE:Lorg/apache/tika/metadata/Property;

    .line 56
    .line 57
    const-string v0, "external-process:timeout"

    .line 58
    .line 59
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalBoolean(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sput-object v0, Lorg/apache/tika/metadata/ExternalProcess;->IS_TIMEOUT:Lorg/apache/tika/metadata/Property;

    .line 64
    .line 65
    return-void
.end method

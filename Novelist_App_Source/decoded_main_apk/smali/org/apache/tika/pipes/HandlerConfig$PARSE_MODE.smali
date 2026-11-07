.class public final enum Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/tika/pipes/HandlerConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "PARSE_MODE"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;

.field public static final enum CONCATENATE:Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;

.field public static final enum RMETA:Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;

    .line 2
    .line 3
    const-string v1, "RMETA"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;->RMETA:Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;

    .line 10
    .line 11
    new-instance v1, Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;

    .line 12
    .line 13
    const-string v2, "CONCATENATE"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;->CONCATENATE:Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;

    .line 20
    .line 21
    filled-new-array {v0, v1}, [Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;->$VALUES:[Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;

    .line 26
    .line 27
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static parseMode(Ljava/lang/String;)Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;
    .locals 7

    .line 1
    invoke-static {}, Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;->values()[Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    move v3, v2

    .line 8
    :goto_0
    if-ge v3, v1, :cond_1

    .line 9
    .line 10
    aget-object v4, v0, v3

    .line 11
    .line 12
    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v5

    .line 16
    invoke-virtual {v5, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    if-eqz v5, :cond_0

    .line 21
    .line 22
    return-object v4

    .line 23
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;->values()[Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    array-length v3, v1

    .line 36
    move v4, v2

    .line 37
    :goto_1
    if-ge v2, v3, :cond_3

    .line 38
    .line 39
    aget-object v5, v1, v2

    .line 40
    .line 41
    add-int/lit8 v6, v4, 0x1

    .line 42
    .line 43
    if-lez v4, :cond_2

    .line 44
    .line 45
    const-string v4, ", "

    .line 46
    .line 47
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    :cond_2
    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 55
    .line 56
    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    add-int/lit8 v2, v2, 0x1

    .line 64
    .line 65
    move v4, v6

    .line 66
    goto :goto_1

    .line 67
    :cond_3
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 68
    .line 69
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    const-string v2, "mode must be one of: ("

    .line 74
    .line 75
    const-string v3, "). I regret I do not understand: "

    .line 76
    .line 77
    invoke-static {v2, v0, v3, p0}, LB1/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-direct {v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw v1
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;
    .locals 1

    .line 1
    const-class v0, Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;->$VALUES:[Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;

    .line 8
    .line 9
    return-object v0
.end method

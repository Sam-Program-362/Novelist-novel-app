.class public final enum Lorg/apache/tika/pipes/async/AsyncStatus$ASYNC_STATUS;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/tika/pipes/async/AsyncStatus;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ASYNC_STATUS"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/apache/tika/pipes/async/AsyncStatus$ASYNC_STATUS;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/apache/tika/pipes/async/AsyncStatus$ASYNC_STATUS;

.field public static final enum COMPLETED:Lorg/apache/tika/pipes/async/AsyncStatus$ASYNC_STATUS;

.field public static final enum CRASHED:Lorg/apache/tika/pipes/async/AsyncStatus$ASYNC_STATUS;

.field public static final enum STARTED:Lorg/apache/tika/pipes/async/AsyncStatus$ASYNC_STATUS;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lorg/apache/tika/pipes/async/AsyncStatus$ASYNC_STATUS;

    .line 2
    .line 3
    const-string v1, "STARTED"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lorg/apache/tika/pipes/async/AsyncStatus$ASYNC_STATUS;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lorg/apache/tika/pipes/async/AsyncStatus$ASYNC_STATUS;->STARTED:Lorg/apache/tika/pipes/async/AsyncStatus$ASYNC_STATUS;

    .line 10
    .line 11
    new-instance v1, Lorg/apache/tika/pipes/async/AsyncStatus$ASYNC_STATUS;

    .line 12
    .line 13
    const-string v2, "COMPLETED"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Lorg/apache/tika/pipes/async/AsyncStatus$ASYNC_STATUS;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lorg/apache/tika/pipes/async/AsyncStatus$ASYNC_STATUS;->COMPLETED:Lorg/apache/tika/pipes/async/AsyncStatus$ASYNC_STATUS;

    .line 20
    .line 21
    new-instance v2, Lorg/apache/tika/pipes/async/AsyncStatus$ASYNC_STATUS;

    .line 22
    .line 23
    const-string v3, "CRASHED"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4}, Lorg/apache/tika/pipes/async/AsyncStatus$ASYNC_STATUS;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v2, Lorg/apache/tika/pipes/async/AsyncStatus$ASYNC_STATUS;->CRASHED:Lorg/apache/tika/pipes/async/AsyncStatus$ASYNC_STATUS;

    .line 30
    .line 31
    filled-new-array {v0, v1, v2}, [Lorg/apache/tika/pipes/async/AsyncStatus$ASYNC_STATUS;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lorg/apache/tika/pipes/async/AsyncStatus$ASYNC_STATUS;->$VALUES:[Lorg/apache/tika/pipes/async/AsyncStatus$ASYNC_STATUS;

    .line 36
    .line 37
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

.method public static valueOf(Ljava/lang/String;)Lorg/apache/tika/pipes/async/AsyncStatus$ASYNC_STATUS;
    .locals 1

    .line 1
    const-class v0, Lorg/apache/tika/pipes/async/AsyncStatus$ASYNC_STATUS;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/apache/tika/pipes/async/AsyncStatus$ASYNC_STATUS;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lorg/apache/tika/pipes/async/AsyncStatus$ASYNC_STATUS;
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/tika/pipes/async/AsyncStatus$ASYNC_STATUS;->$VALUES:[Lorg/apache/tika/pipes/async/AsyncStatus$ASYNC_STATUS;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lorg/apache/tika/pipes/async/AsyncStatus$ASYNC_STATUS;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lorg/apache/tika/pipes/async/AsyncStatus$ASYNC_STATUS;

    .line 8
    .line 9
    return-object v0
.end method

.class public Lorg/apache/tika/pipes/PipesResult;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/tika/pipes/PipesResult$STATUS;
    }
.end annotation


# static fields
.field public static final CLIENT_UNAVAILABLE_WITHIN_MS:Lorg/apache/tika/pipes/PipesResult;

.field public static final EMIT_SUCCESS:Lorg/apache/tika/pipes/PipesResult;

.field public static final EMPTY_OUTPUT:Lorg/apache/tika/pipes/PipesResult;

.field public static final INTERRUPTED_EXCEPTION:Lorg/apache/tika/pipes/PipesResult;

.field public static final OOM:Lorg/apache/tika/pipes/PipesResult;

.field public static final TIMEOUT:Lorg/apache/tika/pipes/PipesResult;

.field public static final UNSPECIFIED_CRASH:Lorg/apache/tika/pipes/PipesResult;


# instance fields
.field private final emitData:Lorg/apache/tika/pipes/emitter/EmitData;

.field private intermediate:Z

.field private final message:Ljava/lang/String;

.field private final status:Lorg/apache/tika/pipes/PipesResult$STATUS;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/apache/tika/pipes/PipesResult;

    .line 2
    .line 3
    sget-object v1, Lorg/apache/tika/pipes/PipesResult$STATUS;->CLIENT_UNAVAILABLE_WITHIN_MS:Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lorg/apache/tika/pipes/PipesResult;-><init>(Lorg/apache/tika/pipes/PipesResult$STATUS;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lorg/apache/tika/pipes/PipesResult;->CLIENT_UNAVAILABLE_WITHIN_MS:Lorg/apache/tika/pipes/PipesResult;

    .line 9
    .line 10
    new-instance v0, Lorg/apache/tika/pipes/PipesResult;

    .line 11
    .line 12
    sget-object v1, Lorg/apache/tika/pipes/PipesResult$STATUS;->TIMEOUT:Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lorg/apache/tika/pipes/PipesResult;-><init>(Lorg/apache/tika/pipes/PipesResult$STATUS;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lorg/apache/tika/pipes/PipesResult;->TIMEOUT:Lorg/apache/tika/pipes/PipesResult;

    .line 18
    .line 19
    new-instance v0, Lorg/apache/tika/pipes/PipesResult;

    .line 20
    .line 21
    sget-object v1, Lorg/apache/tika/pipes/PipesResult$STATUS;->OOM:Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 22
    .line 23
    invoke-direct {v0, v1}, Lorg/apache/tika/pipes/PipesResult;-><init>(Lorg/apache/tika/pipes/PipesResult$STATUS;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lorg/apache/tika/pipes/PipesResult;->OOM:Lorg/apache/tika/pipes/PipesResult;

    .line 27
    .line 28
    new-instance v0, Lorg/apache/tika/pipes/PipesResult;

    .line 29
    .line 30
    sget-object v1, Lorg/apache/tika/pipes/PipesResult$STATUS;->UNSPECIFIED_CRASH:Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 31
    .line 32
    invoke-direct {v0, v1}, Lorg/apache/tika/pipes/PipesResult;-><init>(Lorg/apache/tika/pipes/PipesResult$STATUS;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lorg/apache/tika/pipes/PipesResult;->UNSPECIFIED_CRASH:Lorg/apache/tika/pipes/PipesResult;

    .line 36
    .line 37
    new-instance v0, Lorg/apache/tika/pipes/PipesResult;

    .line 38
    .line 39
    sget-object v1, Lorg/apache/tika/pipes/PipesResult$STATUS;->EMIT_SUCCESS:Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 40
    .line 41
    invoke-direct {v0, v1}, Lorg/apache/tika/pipes/PipesResult;-><init>(Lorg/apache/tika/pipes/PipesResult$STATUS;)V

    .line 42
    .line 43
    .line 44
    sput-object v0, Lorg/apache/tika/pipes/PipesResult;->EMIT_SUCCESS:Lorg/apache/tika/pipes/PipesResult;

    .line 45
    .line 46
    new-instance v0, Lorg/apache/tika/pipes/PipesResult;

    .line 47
    .line 48
    sget-object v1, Lorg/apache/tika/pipes/PipesResult$STATUS;->INTERRUPTED_EXCEPTION:Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 49
    .line 50
    invoke-direct {v0, v1}, Lorg/apache/tika/pipes/PipesResult;-><init>(Lorg/apache/tika/pipes/PipesResult$STATUS;)V

    .line 51
    .line 52
    .line 53
    sput-object v0, Lorg/apache/tika/pipes/PipesResult;->INTERRUPTED_EXCEPTION:Lorg/apache/tika/pipes/PipesResult;

    .line 54
    .line 55
    new-instance v0, Lorg/apache/tika/pipes/PipesResult;

    .line 56
    .line 57
    sget-object v1, Lorg/apache/tika/pipes/PipesResult$STATUS;->EMPTY_OUTPUT:Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 58
    .line 59
    invoke-direct {v0, v1}, Lorg/apache/tika/pipes/PipesResult;-><init>(Lorg/apache/tika/pipes/PipesResult$STATUS;)V

    .line 60
    .line 61
    .line 62
    sput-object v0, Lorg/apache/tika/pipes/PipesResult;->EMPTY_OUTPUT:Lorg/apache/tika/pipes/PipesResult;

    .line 63
    .line 64
    return-void
.end method

.method public constructor <init>(Lorg/apache/tika/pipes/PipesResult$STATUS;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 6
    invoke-direct {p0, p1, v0, v0, v1}, Lorg/apache/tika/pipes/PipesResult;-><init>(Lorg/apache/tika/pipes/PipesResult$STATUS;Lorg/apache/tika/pipes/emitter/EmitData;Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Lorg/apache/tika/pipes/PipesResult$STATUS;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 7
    invoke-direct {p0, p1, v0, p2, v1}, Lorg/apache/tika/pipes/PipesResult;-><init>(Lorg/apache/tika/pipes/PipesResult$STATUS;Lorg/apache/tika/pipes/emitter/EmitData;Ljava/lang/String;Z)V

    return-void
.end method

.method private constructor <init>(Lorg/apache/tika/pipes/PipesResult$STATUS;Lorg/apache/tika/pipes/emitter/EmitData;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lorg/apache/tika/pipes/PipesResult;->status:Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 3
    iput-object p2, p0, Lorg/apache/tika/pipes/PipesResult;->emitData:Lorg/apache/tika/pipes/emitter/EmitData;

    .line 4
    iput-object p3, p0, Lorg/apache/tika/pipes/PipesResult;->message:Ljava/lang/String;

    .line 5
    iput-boolean p4, p0, Lorg/apache/tika/pipes/PipesResult;->intermediate:Z

    return-void
.end method

.method public constructor <init>(Lorg/apache/tika/pipes/PipesResult$STATUS;Lorg/apache/tika/pipes/emitter/EmitData;Z)V
    .locals 1

    const/4 v0, 0x0

    .line 9
    invoke-direct {p0, p1, p2, v0, p3}, Lorg/apache/tika/pipes/PipesResult;-><init>(Lorg/apache/tika/pipes/PipesResult$STATUS;Lorg/apache/tika/pipes/emitter/EmitData;Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Lorg/apache/tika/pipes/emitter/EmitData;)V
    .locals 3

    .line 8
    sget-object v0, Lorg/apache/tika/pipes/PipesResult$STATUS;->PARSE_SUCCESS:Lorg/apache/tika/pipes/PipesResult$STATUS;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, p1, v1, v2}, Lorg/apache/tika/pipes/PipesResult;-><init>(Lorg/apache/tika/pipes/PipesResult$STATUS;Lorg/apache/tika/pipes/emitter/EmitData;Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Lorg/apache/tika/pipes/emitter/EmitData;Ljava/lang/String;)V
    .locals 2

    .line 10
    sget-object v0, Lorg/apache/tika/pipes/PipesResult$STATUS;->PARSE_SUCCESS_WITH_EXCEPTION:Lorg/apache/tika/pipes/PipesResult$STATUS;

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, p2, v1}, Lorg/apache/tika/pipes/PipesResult;-><init>(Lorg/apache/tika/pipes/PipesResult$STATUS;Lorg/apache/tika/pipes/emitter/EmitData;Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public getEmitData()Lorg/apache/tika/pipes/emitter/EmitData;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesResult;->emitData:Lorg/apache/tika/pipes/emitter/EmitData;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesResult;->message:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getStatus()Lorg/apache/tika/pipes/PipesResult$STATUS;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/PipesResult;->status:Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 2
    .line 3
    return-object v0
.end method

.method public isIntermediate()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/tika/pipes/PipesResult;->intermediate:Z

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-boolean v0, p0, Lorg/apache/tika/pipes/PipesResult;->intermediate:Z

    .line 2
    .line 3
    iget-object v1, p0, Lorg/apache/tika/pipes/PipesResult;->status:Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 4
    .line 5
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lorg/apache/tika/pipes/PipesResult;->emitData:Lorg/apache/tika/pipes/emitter/EmitData;

    .line 10
    .line 11
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-object v3, p0, Lorg/apache/tika/pipes/PipesResult;->message:Ljava/lang/String;

    .line 16
    .line 17
    new-instance v4, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v5, "PipesResult{intermediate="

    .line 20
    .line 21
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v0, ", status="

    .line 28
    .line 29
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v0, ", emitData="

    .line 36
    .line 37
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v0, ", message=\'"

    .line 44
    .line 45
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v0, "\'}"

    .line 52
    .line 53
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    return-object v0
.end method

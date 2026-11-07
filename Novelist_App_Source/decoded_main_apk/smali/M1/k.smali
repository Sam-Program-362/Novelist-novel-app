.class public final enum LM1/k;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final l:LB1/b;

.field public static final enum m:LM1/k;

.field public static final enum n:LM1/k;

.field public static final enum o:LM1/k;

.field public static final enum p:LM1/k;

.field public static final enum q:LM1/k;

.field public static final enum r:LM1/k;

.field public static final synthetic s:[LM1/k;


# instance fields
.field public final k:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, LM1/k;

    .line 2
    .line 3
    const-string v1, "DEBUG"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v2, v1, v2}, LM1/k;-><init>(ILjava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LM1/k;->m:LM1/k;

    .line 10
    .line 11
    new-instance v1, LM1/k;

    .line 12
    .line 13
    const-string v2, "ERROR"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v3, v2, v3}, LM1/k;-><init>(ILjava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, LM1/k;->n:LM1/k;

    .line 20
    .line 21
    new-instance v2, LM1/k;

    .line 22
    .line 23
    const-string v3, "LOG"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v4, v3, v4}, LM1/k;-><init>(ILjava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v2, LM1/k;->o:LM1/k;

    .line 30
    .line 31
    new-instance v3, LM1/k;

    .line 32
    .line 33
    const-string v4, "TIP"

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    invoke-direct {v3, v5, v4, v5}, LM1/k;-><init>(ILjava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v3, LM1/k;->p:LM1/k;

    .line 40
    .line 41
    new-instance v4, LM1/k;

    .line 42
    .line 43
    const-string v5, "WARNING"

    .line 44
    .line 45
    const/4 v6, 0x4

    .line 46
    invoke-direct {v4, v6, v5, v6}, LM1/k;-><init>(ILjava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v4, LM1/k;->q:LM1/k;

    .line 50
    .line 51
    new-instance v5, LM1/k;

    .line 52
    .line 53
    const-string v6, "UNKNOWN"

    .line 54
    .line 55
    const/4 v7, 0x5

    .line 56
    invoke-direct {v5, v7, v6, v7}, LM1/k;-><init>(ILjava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    sput-object v5, LM1/k;->r:LM1/k;

    .line 60
    .line 61
    filled-new-array/range {v0 .. v5}, [LM1/k;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sput-object v0, LM1/k;->s:[LM1/k;

    .line 66
    .line 67
    new-instance v0, LB1/b;

    .line 68
    .line 69
    const/16 v1, 0x17

    .line 70
    .line 71
    invoke-direct {v0, v1}, LB1/b;-><init>(I)V

    .line 72
    .line 73
    .line 74
    sput-object v0, LM1/k;->l:LB1/b;

    .line 75
    .line 76
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, LM1/k;->k:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LM1/k;
    .locals 1

    .line 1
    const-class v0, LM1/k;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LM1/k;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LM1/k;
    .locals 1

    .line 1
    sget-object v0, LM1/k;->s:[LM1/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LM1/k;

    .line 8
    .line 9
    return-object v0
.end method

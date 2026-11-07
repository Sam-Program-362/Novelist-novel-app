.class public final enum LM1/S;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final l:LM1/A;

.field public static final enum m:LM1/S;

.field public static final enum n:LM1/S;

.field public static final enum o:LM1/S;

.field public static final enum p:LM1/S;

.field public static final enum q:LM1/S;

.field public static final enum r:LM1/S;

.field public static final enum s:LM1/S;

.field public static final synthetic t:[LM1/S;


# instance fields
.field public final k:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, LM1/S;

    .line 2
    .line 3
    const-string v1, "DATE_INVALID"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v2, v1, v2}, LM1/S;-><init>(ILjava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LM1/S;->m:LM1/S;

    .line 10
    .line 11
    new-instance v1, LM1/S;

    .line 12
    .line 13
    const-string v2, "EXPIRED"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v3, v2, v3}, LM1/S;-><init>(ILjava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, LM1/S;->n:LM1/S;

    .line 20
    .line 21
    new-instance v2, LM1/S;

    .line 22
    .line 23
    const-string v3, "ID_MISMATCH"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v4, v3, v4}, LM1/S;-><init>(ILjava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v2, LM1/S;->o:LM1/S;

    .line 30
    .line 31
    new-instance v3, LM1/S;

    .line 32
    .line 33
    const-string v4, "INVALID"

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    invoke-direct {v3, v5, v4, v5}, LM1/S;-><init>(ILjava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v3, LM1/S;->p:LM1/S;

    .line 40
    .line 41
    new-instance v4, LM1/S;

    .line 42
    .line 43
    const-string v5, "NOT_YET_VALID"

    .line 44
    .line 45
    const/4 v6, 0x4

    .line 46
    invoke-direct {v4, v6, v5, v6}, LM1/S;-><init>(ILjava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v4, LM1/S;->q:LM1/S;

    .line 50
    .line 51
    new-instance v5, LM1/S;

    .line 52
    .line 53
    const-string v6, "UNTRUSTED"

    .line 54
    .line 55
    const/4 v7, 0x5

    .line 56
    invoke-direct {v5, v7, v6, v7}, LM1/S;-><init>(ILjava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    sput-object v5, LM1/S;->r:LM1/S;

    .line 60
    .line 61
    new-instance v6, LM1/S;

    .line 62
    .line 63
    const-string v7, "UNKNOWN"

    .line 64
    .line 65
    const/4 v8, 0x6

    .line 66
    invoke-direct {v6, v8, v7, v8}, LM1/S;-><init>(ILjava/lang/String;I)V

    .line 67
    .line 68
    .line 69
    sput-object v6, LM1/S;->s:LM1/S;

    .line 70
    .line 71
    filled-new-array/range {v0 .. v6}, [LM1/S;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    sput-object v0, LM1/S;->t:[LM1/S;

    .line 76
    .line 77
    new-instance v0, LM1/A;

    .line 78
    .line 79
    const/4 v1, 0x2

    .line 80
    invoke-direct {v0, v1}, LM1/A;-><init>(I)V

    .line 81
    .line 82
    .line 83
    sput-object v0, LM1/S;->l:LM1/A;

    .line 84
    .line 85
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, LM1/S;->k:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LM1/S;
    .locals 1

    .line 1
    const-class v0, LM1/S;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LM1/S;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LM1/S;
    .locals 1

    .line 1
    sget-object v0, LM1/S;->t:[LM1/S;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LM1/S;

    .line 8
    .line 9
    return-object v0
.end method

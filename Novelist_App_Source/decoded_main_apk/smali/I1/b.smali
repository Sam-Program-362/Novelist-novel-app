.class public final enum LI1/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final l:LB1/b;

.field public static final enum m:LI1/b;

.field public static final enum n:LI1/b;

.field public static final enum o:LI1/b;

.field public static final enum p:LI1/b;

.field public static final enum q:LI1/b;

.field public static final synthetic r:[LI1/b;


# instance fields
.field public final k:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, LI1/b;

    .line 2
    .line 3
    const-string v1, "UNAUTHORIZED"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v2, v1, v2}, LI1/b;-><init>(ILjava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LI1/b;->m:LI1/b;

    .line 10
    .line 11
    new-instance v1, LI1/b;

    .line 12
    .line 13
    const-string v2, "AUTHORIZE_FAILURE"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v3, v2, v3}, LI1/b;-><init>(ILjava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, LI1/b;->n:LI1/b;

    .line 20
    .line 21
    new-instance v2, LI1/b;

    .line 22
    .line 23
    const-string v3, "PENDING_INTENT_EXCEPTION"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v4, v3, v4}, LI1/b;-><init>(ILjava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v2, LI1/b;->o:LI1/b;

    .line 30
    .line 31
    new-instance v3, LI1/b;

    .line 32
    .line 33
    const-string v4, "API_EXCEPTION"

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    invoke-direct {v3, v5, v4, v5}, LI1/b;-><init>(ILjava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v3, LI1/b;->p:LI1/b;

    .line 40
    .line 41
    new-instance v4, LI1/b;

    .line 42
    .line 43
    const-string v5, "NO_ACTIVITY"

    .line 44
    .line 45
    const/4 v6, 0x4

    .line 46
    invoke-direct {v4, v6, v5, v6}, LI1/b;-><init>(ILjava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v4, LI1/b;->q:LI1/b;

    .line 50
    .line 51
    filled-new-array {v0, v1, v2, v3, v4}, [LI1/b;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, LI1/b;->r:[LI1/b;

    .line 56
    .line 57
    new-instance v0, LB1/b;

    .line 58
    .line 59
    const/16 v1, 0xa

    .line 60
    .line 61
    invoke-direct {v0, v1}, LB1/b;-><init>(I)V

    .line 62
    .line 63
    .line 64
    sput-object v0, LI1/b;->l:LB1/b;

    .line 65
    .line 66
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, LI1/b;->k:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LI1/b;
    .locals 1

    .line 1
    const-class v0, LI1/b;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LI1/b;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LI1/b;
    .locals 1

    .line 1
    sget-object v0, LI1/b;->r:[LI1/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LI1/b;

    .line 8
    .line 9
    return-object v0
.end method

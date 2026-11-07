.class public final enum LJ1/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final l:LB1/b;

.field public static final enum m:LJ1/c;

.field public static final enum n:LJ1/c;

.field public static final synthetic o:[LJ1/c;


# instance fields
.field public final k:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LJ1/c;

    .line 2
    .line 3
    const-string v1, "IMAGE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v2, v1, v2}, LJ1/c;-><init>(ILjava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LJ1/c;->m:LJ1/c;

    .line 10
    .line 11
    new-instance v1, LJ1/c;

    .line 12
    .line 13
    const-string v2, "VIDEO"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v3, v2, v3}, LJ1/c;-><init>(ILjava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, LJ1/c;->n:LJ1/c;

    .line 20
    .line 21
    filled-new-array {v0, v1}, [LJ1/c;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, LJ1/c;->o:[LJ1/c;

    .line 26
    .line 27
    new-instance v0, LB1/b;

    .line 28
    .line 29
    const/16 v1, 0xc

    .line 30
    .line 31
    invoke-direct {v0, v1}, LB1/b;-><init>(I)V

    .line 32
    .line 33
    .line 34
    sput-object v0, LJ1/c;->l:LB1/b;

    .line 35
    .line 36
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, LJ1/c;->k:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LJ1/c;
    .locals 1

    .line 1
    const-class v0, LJ1/c;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LJ1/c;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LJ1/c;
    .locals 1

    .line 1
    sget-object v0, LJ1/c;->o:[LJ1/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LJ1/c;

    .line 8
    .line 9
    return-object v0
.end method

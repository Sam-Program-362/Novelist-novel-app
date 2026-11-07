.class public final enum LM1/z;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final l:LB1/b;

.field public static final enum m:LM1/z;

.field public static final synthetic n:[LM1/z;


# instance fields
.field public final k:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, LM1/z;

    .line 2
    .line 3
    const-string v1, "ALWAYS"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v2, v1, v2}, LM1/z;-><init>(ILjava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    new-instance v1, LM1/z;

    .line 10
    .line 11
    const-string v2, "IF_CONTENT_SCROLLS"

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    invoke-direct {v1, v3, v2, v3}, LM1/z;-><init>(ILjava/lang/String;I)V

    .line 15
    .line 16
    .line 17
    new-instance v2, LM1/z;

    .line 18
    .line 19
    const-string v3, "NEVER"

    .line 20
    .line 21
    const/4 v4, 0x2

    .line 22
    invoke-direct {v2, v4, v3, v4}, LM1/z;-><init>(ILjava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    new-instance v3, LM1/z;

    .line 26
    .line 27
    const-string v4, "UNKNOWN"

    .line 28
    .line 29
    const/4 v5, 0x3

    .line 30
    invoke-direct {v3, v5, v4, v5}, LM1/z;-><init>(ILjava/lang/String;I)V

    .line 31
    .line 32
    .line 33
    sput-object v3, LM1/z;->m:LM1/z;

    .line 34
    .line 35
    filled-new-array {v0, v1, v2, v3}, [LM1/z;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, LM1/z;->n:[LM1/z;

    .line 40
    .line 41
    new-instance v0, LB1/b;

    .line 42
    .line 43
    const/16 v1, 0x1d

    .line 44
    .line 45
    invoke-direct {v0, v1}, LB1/b;-><init>(I)V

    .line 46
    .line 47
    .line 48
    sput-object v0, LM1/z;->l:LB1/b;

    .line 49
    .line 50
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, LM1/z;->k:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LM1/z;
    .locals 1

    .line 1
    const-class v0, LM1/z;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LM1/z;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LM1/z;
    .locals 1

    .line 1
    sget-object v0, LM1/z;->n:[LM1/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LM1/z;

    .line 8
    .line 9
    return-object v0
.end method

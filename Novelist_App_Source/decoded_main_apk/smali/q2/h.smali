.class public abstract Lq2/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:I

.field public static final b:LB1/g;

.field public static final c:LB1/g;

.field public static final d:LB1/g;

.field public static final e:LB1/g;

.field public static final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/16 v0, 0x64

    .line 2
    .line 3
    const-string v1, "kotlinx.coroutines.semaphore.maxSpinCycles"

    .line 4
    .line 5
    const/16 v2, 0xc

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Ln2/a;->j(ILjava/lang/String;I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    sput v0, Lq2/h;->a:I

    .line 12
    .line 13
    new-instance v0, LB1/g;

    .line 14
    .line 15
    const-string v1, "PERMIT"

    .line 16
    .line 17
    const/16 v3, 0x12

    .line 18
    .line 19
    invoke-direct {v0, v1, v3}, LB1/g;-><init>(Ljava/lang/Object;I)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lq2/h;->b:LB1/g;

    .line 23
    .line 24
    new-instance v0, LB1/g;

    .line 25
    .line 26
    const-string v1, "TAKEN"

    .line 27
    .line 28
    invoke-direct {v0, v1, v3}, LB1/g;-><init>(Ljava/lang/Object;I)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lq2/h;->c:LB1/g;

    .line 32
    .line 33
    new-instance v0, LB1/g;

    .line 34
    .line 35
    const-string v1, "BROKEN"

    .line 36
    .line 37
    invoke-direct {v0, v1, v3}, LB1/g;-><init>(Ljava/lang/Object;I)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Lq2/h;->d:LB1/g;

    .line 41
    .line 42
    new-instance v0, LB1/g;

    .line 43
    .line 44
    const-string v1, "CANCELLED"

    .line 45
    .line 46
    invoke-direct {v0, v1, v3}, LB1/g;-><init>(Ljava/lang/Object;I)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lq2/h;->e:LB1/g;

    .line 50
    .line 51
    const-string v0, "kotlinx.coroutines.semaphore.segmentSize"

    .line 52
    .line 53
    const/16 v1, 0x10

    .line 54
    .line 55
    invoke-static {v1, v0, v2}, Ln2/a;->j(ILjava/lang/String;I)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    sput v0, Lq2/h;->f:I

    .line 60
    .line 61
    return-void
.end method

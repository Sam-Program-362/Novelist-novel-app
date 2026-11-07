.class public final synthetic LM1/T;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD/o;


# instance fields
.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LM1/T;->k:I

    return-void
.end method


# virtual methods
.method public final c(LD/h0;)LD/h0;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x24

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, LD/S;

    .line 8
    .line 9
    invoke-direct {v0, p1}, LD/S;-><init>(LD/h0;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/16 v1, 0x23

    .line 14
    .line 15
    if-lt v0, v1, :cond_1

    .line 16
    .line 17
    new-instance v0, LD/Q;

    .line 18
    .line 19
    invoke-direct {v0, p1}, LD/Q;-><init>(LD/h0;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/16 v1, 0x22

    .line 24
    .line 25
    if-lt v0, v1, :cond_2

    .line 26
    .line 27
    new-instance v0, LD/P;

    .line 28
    .line 29
    invoke-direct {v0, p1}, LD/P;-><init>(LD/h0;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    const/16 v1, 0x1f

    .line 34
    .line 35
    if-lt v0, v1, :cond_3

    .line 36
    .line 37
    new-instance v0, LD/O;

    .line 38
    .line 39
    invoke-direct {v0, p1}, LD/O;-><init>(LD/h0;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    const/16 v1, 0x1e

    .line 44
    .line 45
    if-lt v0, v1, :cond_4

    .line 46
    .line 47
    new-instance v0, LD/N;

    .line 48
    .line 49
    invoke-direct {v0, p1}, LD/N;-><init>(LD/h0;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_4
    const/16 v1, 0x1d

    .line 54
    .line 55
    if-lt v0, v1, :cond_5

    .line 56
    .line 57
    new-instance v0, LD/M;

    .line 58
    .line 59
    invoke-direct {v0, p1}, LD/M;-><init>(LD/h0;)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_5
    new-instance v0, LD/K;

    .line 64
    .line 65
    invoke-direct {v0, p1}, LD/K;-><init>(LD/h0;)V

    .line 66
    .line 67
    .line 68
    :goto_0
    sget-object p1, Lw/b;->e:Lw/b;

    .line 69
    .line 70
    iget v1, p0, LM1/T;->k:I

    .line 71
    .line 72
    invoke-virtual {v0, v1, p1}, LD/T;->d(ILw/b;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, LD/T;->b()LD/h0;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    return-object p1
.end method

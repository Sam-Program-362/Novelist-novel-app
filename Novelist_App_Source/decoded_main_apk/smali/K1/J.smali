.class public final LK1/J;
.super LT1/h;
.source "SourceFile"

# interfaces
.implements LZ1/p;


# instance fields
.field public o:I

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:LK1/L;

.field public final synthetic r:J


# direct methods
.method public constructor <init>(Ljava/lang/String;LK1/L;JLR1/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK1/J;->p:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, LK1/J;->q:LK1/L;

    .line 4
    .line 5
    iput-wide p3, p0, LK1/J;->r:J

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p5}, LT1/h;-><init>(ILR1/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Li2/s;

    .line 2
    .line 3
    check-cast p2, LR1/c;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, LK1/J;->i(LR1/c;Ljava/lang/Object;)LR1/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LK1/J;

    .line 10
    .line 11
    sget-object p2, LO1/g;->a:LO1/g;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LK1/J;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final i(LR1/c;Ljava/lang/Object;)LR1/c;
    .locals 6

    .line 1
    new-instance v0, LK1/J;

    .line 2
    .line 3
    iget-object v2, p0, LK1/J;->q:LK1/L;

    .line 4
    .line 5
    iget-wide v3, p0, LK1/J;->r:J

    .line 6
    .line 7
    iget-object v1, p0, LK1/J;->p:Ljava/lang/String;

    .line 8
    .line 9
    move-object v5, p1

    .line 10
    invoke-direct/range {v0 .. v5}, LK1/J;-><init>(Ljava/lang/String;LK1/L;JLR1/c;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, LK1/J;->o:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1

    .line 20
    :cond_1
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    new-instance p1, LY/d;

    .line 24
    .line 25
    iget-object v0, p0, LK1/J;->p:Ljava/lang/String;

    .line 26
    .line 27
    invoke-direct {p1, v0}, LY/d;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, LK1/J;->q:LK1/L;

    .line 31
    .line 32
    iget-object v0, v0, LK1/L;->k:Landroid/content/Context;

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    invoke-static {v0}, LK1/M;->a(Landroid/content/Context;)LB1/g;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    new-instance v3, LK1/I;

    .line 42
    .line 43
    iget-wide v4, p0, LK1/J;->r:J

    .line 44
    .line 45
    invoke-direct {v3, p1, v4, v5, v2}, LK1/I;-><init>(LY/d;JLR1/c;)V

    .line 46
    .line 47
    .line 48
    iput v1, p0, LK1/J;->o:I

    .line 49
    .line 50
    new-instance p1, LY/h;

    .line 51
    .line 52
    invoke-direct {p1, v3, v2}, LY/h;-><init>(LZ1/p;LR1/c;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, p1, p0}, LB1/g;->d(LZ1/p;LT1/h;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    sget-object v0, LS1/a;->k:LS1/a;

    .line 60
    .line 61
    if-ne p1, v0, :cond_2

    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_2
    :goto_0
    sget-object p1, LO1/g;->a:LO1/g;

    .line 65
    .line 66
    return-object p1

    .line 67
    :cond_3
    const-string p1, "context"

    .line 68
    .line 69
    invoke-static {p1}, La2/h;->g(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v2
.end method

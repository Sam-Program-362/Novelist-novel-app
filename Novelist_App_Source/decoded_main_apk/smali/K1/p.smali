.class public final LK1/p;
.super LT1/h;
.source "SourceFile"

# interfaces
.implements LZ1/p;


# instance fields
.field public o:La2/o;

.field public p:I

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:LK1/L;

.field public final synthetic s:La2/o;


# direct methods
.method public constructor <init>(Ljava/lang/String;LK1/L;La2/o;LR1/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK1/p;->q:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, LK1/p;->r:LK1/L;

    .line 4
    .line 5
    iput-object p3, p0, LK1/p;->s:La2/o;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, LT1/h;-><init>(ILR1/c;)V

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
    invoke-virtual {p0, p2, p1}, LK1/p;->i(LR1/c;Ljava/lang/Object;)LR1/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LK1/p;

    .line 10
    .line 11
    sget-object p2, LO1/g;->a:LO1/g;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LK1/p;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final i(LR1/c;Ljava/lang/Object;)LR1/c;
    .locals 3

    .line 1
    new-instance p2, LK1/p;

    .line 2
    .line 3
    iget-object v0, p0, LK1/p;->r:LK1/L;

    .line 4
    .line 5
    iget-object v1, p0, LK1/p;->s:La2/o;

    .line 6
    .line 7
    iget-object v2, p0, LK1/p;->q:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {p2, v2, v0, v1, p1}, LK1/p;-><init>(Ljava/lang/String;LK1/L;La2/o;LR1/c;)V

    .line 10
    .line 11
    .line 12
    return-object p2
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LK1/p;->p:I

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
    iget-object v0, p0, LK1/p;->o:La2/o;

    .line 9
    .line 10
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_1
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    new-instance p1, LY/d;

    .line 26
    .line 27
    iget-object v0, p0, LK1/p;->q:Ljava/lang/String;

    .line 28
    .line 29
    invoke-direct {p1, v0}, LY/d;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, LK1/p;->r:LK1/L;

    .line 33
    .line 34
    iget-object v0, v0, LK1/L;->k:Landroid/content/Context;

    .line 35
    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-static {v0}, LK1/M;->a(Landroid/content/Context;)LB1/g;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget-object v0, v0, LB1/g;->l:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, LV/h;

    .line 45
    .line 46
    invoke-interface {v0}, LV/h;->getData()Ll2/d;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    new-instance v2, LK1/o;

    .line 51
    .line 52
    const/4 v3, 0x0

    .line 53
    invoke-direct {v2, v0, p1, v3}, LK1/o;-><init>(Ll2/d;LY/d;I)V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, LK1/p;->s:La2/o;

    .line 57
    .line 58
    iput-object v0, p0, LK1/p;->o:La2/o;

    .line 59
    .line 60
    iput v1, p0, LK1/p;->p:I

    .line 61
    .line 62
    invoke-static {v2, p0}, Ll2/r;->c(Ll2/d;LT1/c;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    sget-object v1, LS1/a;->k:LS1/a;

    .line 67
    .line 68
    if-ne p1, v1, :cond_2

    .line 69
    .line 70
    return-object v1

    .line 71
    :cond_2
    :goto_0
    iput-object p1, v0, La2/o;->k:Ljava/lang/Object;

    .line 72
    .line 73
    sget-object p1, LO1/g;->a:LO1/g;

    .line 74
    .line 75
    return-object p1

    .line 76
    :cond_3
    const-string p1, "context"

    .line 77
    .line 78
    invoke-static {p1}, La2/h;->g(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    const/4 p1, 0x0

    .line 82
    throw p1
.end method

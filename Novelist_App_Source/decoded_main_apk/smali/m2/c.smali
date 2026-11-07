.class public final Lm2/c;
.super LT1/h;
.source "SourceFile"

# interfaces
.implements LZ1/p;


# instance fields
.field public o:I

.field public synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ll2/e;

.field public final synthetic r:Lm2/e;


# direct methods
.method public constructor <init>(Ll2/e;Lm2/e;LR1/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm2/c;->q:Ll2/e;

    .line 2
    .line 3
    iput-object p2, p0, Lm2/c;->r:Lm2/e;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, LT1/h;-><init>(ILR1/c;)V

    .line 7
    .line 8
    .line 9
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
    invoke-virtual {p0, p2, p1}, Lm2/c;->i(LR1/c;Ljava/lang/Object;)LR1/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lm2/c;

    .line 10
    .line 11
    sget-object p2, LO1/g;->a:LO1/g;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lm2/c;->m(Ljava/lang/Object;)Ljava/lang/Object;

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
    new-instance v0, Lm2/c;

    .line 2
    .line 3
    iget-object v1, p0, Lm2/c;->q:Ll2/e;

    .line 4
    .line 5
    iget-object v2, p0, Lm2/c;->r:Lm2/e;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p1}, Lm2/c;-><init>(Ll2/e;Lm2/e;LR1/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, v0, Lm2/c;->p:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lm2/c;->o:I

    .line 2
    .line 3
    sget-object v1, LO1/g;->a:LO1/g;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    if-ne v0, v2, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-object v1

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
    iget-object p1, p0, Lm2/c;->p:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, Li2/s;

    .line 28
    .line 29
    iget-object v0, p0, Lm2/c;->r:Lm2/e;

    .line 30
    .line 31
    iget-object v3, v0, Lm2/e;->k:LR1/h;

    .line 32
    .line 33
    iget v4, v0, Lm2/e;->l:I

    .line 34
    .line 35
    const/4 v5, -0x3

    .line 36
    if-ne v4, v5, :cond_2

    .line 37
    .line 38
    const/4 v4, -0x2

    .line 39
    :cond_2
    iget-object v5, v0, Lm2/e;->m:Lk2/a;

    .line 40
    .line 41
    new-instance v6, Lm2/d;

    .line 42
    .line 43
    const/4 v7, 0x0

    .line 44
    invoke-direct {v6, v0, v7}, Lm2/d;-><init>(Lm2/e;LR1/c;)V

    .line 45
    .line 46
    .line 47
    const/4 v0, 0x4

    .line 48
    invoke-static {v4, v5, v0}, Lk2/j;->a(ILk2/a;I)Lk2/c;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-interface {p1}, Li2/s;->d()LR1/h;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-static {p1, v3, v2}, Li2/u;->b(LR1/h;LR1/h;Z)LR1/h;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    sget-object v3, Li2/A;->a:Lp2/e;

    .line 61
    .line 62
    if-eq p1, v3, :cond_3

    .line 63
    .line 64
    sget-object v4, LR1/d;->k:LR1/d;

    .line 65
    .line 66
    invoke-interface {p1, v4}, LR1/h;->e(LR1/g;)LR1/f;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    if-nez v4, :cond_3

    .line 71
    .line 72
    invoke-interface {p1, v3}, LR1/h;->i(LR1/h;)LR1/h;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    :cond_3
    new-instance v3, Lk2/p;

    .line 77
    .line 78
    invoke-direct {v3, p1, v0}, Lk2/p;-><init>(LR1/h;Lk2/c;)V

    .line 79
    .line 80
    .line 81
    sget-object p1, Li2/t;->l:Li2/t;

    .line 82
    .line 83
    invoke-virtual {v3, p1, v3, v6}, Li2/a;->T(Li2/t;Li2/a;LZ1/p;)V

    .line 84
    .line 85
    .line 86
    iput v2, p0, Lm2/c;->o:I

    .line 87
    .line 88
    iget-object p1, p0, Lm2/c;->q:Ll2/e;

    .line 89
    .line 90
    invoke-static {p1, v3, v2, p0}, Ll2/r;->b(Ll2/e;Lk2/p;ZLT1/c;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    sget-object v0, LS1/a;->k:LS1/a;

    .line 95
    .line 96
    if-ne p1, v0, :cond_4

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_4
    move-object p1, v1

    .line 100
    :goto_0
    if-ne p1, v0, :cond_5

    .line 101
    .line 102
    return-object v0

    .line 103
    :cond_5
    return-object v1
.end method

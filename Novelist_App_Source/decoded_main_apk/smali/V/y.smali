.class public final LV/y;
.super LT1/h;
.source "SourceFile"

# interfaces
.implements LZ1/p;


# instance fields
.field public o:I

.field public final synthetic p:LV/N;


# direct methods
.method public constructor <init>(LV/N;LR1/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV/y;->p:LV/N;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, LT1/h;-><init>(ILR1/c;)V

    .line 5
    .line 6
    .line 7
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
    invoke-virtual {p0, p2, p1}, LV/y;->i(LR1/c;Ljava/lang/Object;)LR1/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LV/y;

    .line 10
    .line 11
    sget-object p2, LO1/g;->a:LO1/g;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LV/y;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final i(LR1/c;Ljava/lang/Object;)LR1/c;
    .locals 1

    .line 1
    new-instance p2, LV/y;

    .line 2
    .line 3
    iget-object v0, p0, LV/y;->p:LV/N;

    .line 4
    .line 5
    invoke-direct {p2, v0, p1}, LV/y;-><init>(LV/N;LR1/c;)V

    .line 6
    .line 7
    .line 8
    return-object p2
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, LV/y;->o:I

    .line 2
    .line 3
    sget-object v1, LO1/g;->a:LO1/g;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, p0, LV/y;->p:LV/N;

    .line 8
    .line 9
    sget-object v5, LS1/a;->k:LS1/a;

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    if-eq v0, v3, :cond_1

    .line 14
    .line 15
    if-ne v0, v2, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-object v1

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_2
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, v4, LV/N;->s:LB1/s;

    .line 37
    .line 38
    iput v3, p0, LV/y;->o:I

    .line 39
    .line 40
    iget-object p1, p1, LB1/s;->l:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Li2/m;

    .line 43
    .line 44
    invoke-virtual {p1, p0}, Li2/m;->R(LT1/h;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    if-ne p1, v5, :cond_3

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    move-object p1, v1

    .line 52
    :goto_0
    if-ne p1, v5, :cond_4

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_4
    :goto_1
    invoke-virtual {v4}, LV/N;->g()LV/i0;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iget-object p1, p1, LV/i0;->c:LB1/a;

    .line 60
    .line 61
    instance-of v0, p1, Lm2/i;

    .line 62
    .line 63
    const/4 v6, 0x0

    .line 64
    sget-object v7, Lk2/a;->l:Lk2/a;

    .line 65
    .line 66
    if-eqz v0, :cond_5

    .line 67
    .line 68
    check-cast p1, Lm2/i;

    .line 69
    .line 70
    const/4 v0, 0x0

    .line 71
    check-cast p1, Ll2/c;

    .line 72
    .line 73
    invoke-static {p1, v0, v6, v7, v3}, Lm2/k;->a(Ll2/c;Lj2/c;ILk2/a;I)Ll2/d;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    goto :goto_2

    .line 78
    :cond_5
    new-instance v0, Lm2/g;

    .line 79
    .line 80
    sget-object v3, LR1/i;->k:LR1/i;

    .line 81
    .line 82
    invoke-direct {v0, p1, v3, v6, v7}, Lm2/g;-><init>(Ll2/d;LR1/h;ILk2/a;)V

    .line 83
    .line 84
    .line 85
    move-object p1, v0

    .line 86
    :goto_2
    new-instance v0, LV/x;

    .line 87
    .line 88
    const/4 v3, 0x0

    .line 89
    invoke-direct {v0, v4, v3}, LV/x;-><init>(Ljava/lang/Object;I)V

    .line 90
    .line 91
    .line 92
    iput v2, p0, LV/y;->o:I

    .line 93
    .line 94
    invoke-interface {p1, v0, p0}, Ll2/d;->h(Ll2/e;LR1/c;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    if-ne p1, v5, :cond_6

    .line 99
    .line 100
    :goto_3
    return-object v5

    .line 101
    :cond_6
    return-object v1
.end method

.class public final LV/I;
.super LT1/h;
.source "SourceFile"

# interfaces
.implements LZ1/p;


# instance fields
.field public o:I

.field public synthetic p:Ljava/lang/Object;

.field public final synthetic q:LV/N;

.field public final synthetic r:LT1/h;


# direct methods
.method public constructor <init>(LV/N;LZ1/p;LR1/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV/I;->q:LV/N;

    .line 2
    .line 3
    check-cast p2, LT1/h;

    .line 4
    .line 5
    iput-object p2, p0, LV/I;->r:LT1/h;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p3}, LT1/h;-><init>(ILR1/c;)V

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
    invoke-virtual {p0, p2, p1}, LV/I;->i(LR1/c;Ljava/lang/Object;)LR1/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LV/I;

    .line 10
    .line 11
    sget-object p2, LO1/g;->a:LO1/g;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LV/I;->m(Ljava/lang/Object;)Ljava/lang/Object;

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
    new-instance v0, LV/I;

    .line 2
    .line 3
    iget-object v1, p0, LV/I;->q:LV/N;

    .line 4
    .line 5
    iget-object v2, p0, LV/I;->r:LT1/h;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p1}, LV/I;-><init>(LV/N;LZ1/p;LR1/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, v0, LV/I;->p:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, LV/I;->o:I

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
    return-object p1

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
    iget-object p1, p0, LV/I;->p:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, Li2/s;

    .line 26
    .line 27
    new-instance v0, Li2/m;

    .line 28
    .line 29
    invoke-direct {v0, v1}, Li2/W;-><init>(Z)V

    .line 30
    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-virtual {v0, v2}, Li2/W;->C(Li2/N;)V

    .line 34
    .line 35
    .line 36
    iget-object v3, p0, LV/I;->q:LV/N;

    .line 37
    .line 38
    iget-object v4, v3, LV/N;->r:LB1/a;

    .line 39
    .line 40
    invoke-virtual {v4}, LB1/a;->g()LV/j0;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    new-instance v5, LV/a0;

    .line 45
    .line 46
    iget-object v6, p0, LV/I;->r:LT1/h;

    .line 47
    .line 48
    invoke-interface {p1}, Li2/s;->d()LR1/h;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-direct {v5, v6, v0, v4, p1}, LV/a0;-><init>(LZ1/p;Li2/m;LV/j0;LR1/h;)V

    .line 53
    .line 54
    .line 55
    iget-object p1, v3, LV/N;->v:LB1/s;

    .line 56
    .line 57
    iget-object v3, p1, LB1/s;->m:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v3, Lk2/c;

    .line 60
    .line 61
    invoke-interface {v3, v5}, Lk2/s;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    instance-of v4, v3, Lk2/h;

    .line 66
    .line 67
    if-eqz v4, :cond_5

    .line 68
    .line 69
    check-cast v3, Lk2/h;

    .line 70
    .line 71
    if-eqz v3, :cond_2

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    move-object v3, v2

    .line 75
    :goto_0
    if-eqz v3, :cond_3

    .line 76
    .line 77
    iget-object v2, v3, Lk2/h;->a:Ljava/lang/Throwable;

    .line 78
    .line 79
    :cond_3
    if-nez v2, :cond_4

    .line 80
    .line 81
    new-instance v2, Lg1/a;

    .line 82
    .line 83
    const-string p1, "Channel was closed normally"

    .line 84
    .line 85
    invoke-direct {v2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    :cond_4
    throw v2

    .line 89
    :cond_5
    instance-of v3, v3, Lk2/i;

    .line 90
    .line 91
    if-nez v3, :cond_8

    .line 92
    .line 93
    iget-object v3, p1, LB1/s;->n:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v3, LB1/g;

    .line 96
    .line 97
    iget-object v3, v3, LB1/g;->l:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v3, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 100
    .line 101
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    if-nez v3, :cond_6

    .line 106
    .line 107
    iget-object v3, p1, LB1/s;->k:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v3, Li2/s;

    .line 110
    .line 111
    new-instance v4, LV/e0;

    .line 112
    .line 113
    invoke-direct {v4, p1, v2}, LV/e0;-><init>(LB1/s;LR1/c;)V

    .line 114
    .line 115
    .line 116
    invoke-static {v3, v4}, Li2/u;->g(Li2/s;LZ1/p;)Li2/b0;

    .line 117
    .line 118
    .line 119
    :cond_6
    iput v1, p0, LV/I;->o:I

    .line 120
    .line 121
    invoke-virtual {v0, p0}, Li2/m;->R(LT1/h;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    sget-object v0, LS1/a;->k:LS1/a;

    .line 126
    .line 127
    if-ne p1, v0, :cond_7

    .line 128
    .line 129
    return-object v0

    .line 130
    :cond_7
    return-object p1

    .line 131
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 132
    .line 133
    const-string v0, "Check failed."

    .line 134
    .line 135
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw p1
.end method

.class public final LV/M;
.super LT1/h;
.source "SourceFile"

# interfaces
.implements LZ1/p;


# instance fields
.field public o:La2/n;

.field public p:I

.field public synthetic q:Ljava/lang/Object;

.field public final synthetic r:La2/n;

.field public final synthetic s:LV/N;

.field public final synthetic t:Ljava/lang/Object;

.field public final synthetic u:Z


# direct methods
.method public constructor <init>(La2/n;LV/N;Ljava/lang/Object;ZLR1/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV/M;->r:La2/n;

    .line 2
    .line 3
    iput-object p2, p0, LV/M;->s:LV/N;

    .line 4
    .line 5
    iput-object p3, p0, LV/M;->t:Ljava/lang/Object;

    .line 6
    .line 7
    iput-boolean p4, p0, LV/M;->u:Z

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, LT1/h;-><init>(ILR1/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LV/Y;

    .line 2
    .line 3
    check-cast p2, LR1/c;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, LV/M;->i(LR1/c;Ljava/lang/Object;)LR1/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LV/M;

    .line 10
    .line 11
    sget-object p2, LO1/g;->a:LO1/g;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LV/M;->m(Ljava/lang/Object;)Ljava/lang/Object;

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
    new-instance v0, LV/M;

    .line 2
    .line 3
    iget-object v3, p0, LV/M;->t:Ljava/lang/Object;

    .line 4
    .line 5
    iget-boolean v4, p0, LV/M;->u:Z

    .line 6
    .line 7
    iget-object v1, p0, LV/M;->r:La2/n;

    .line 8
    .line 9
    iget-object v2, p0, LV/M;->s:LV/N;

    .line 10
    .line 11
    move-object v5, p1

    .line 12
    invoke-direct/range {v0 .. v5}, LV/M;-><init>(La2/n;LV/N;Ljava/lang/Object;ZLR1/c;)V

    .line 13
    .line 14
    .line 15
    iput-object p2, v0, LV/M;->q:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, LV/M;->p:I

    .line 2
    .line 3
    iget-object v1, p0, LV/M;->t:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, LV/M;->s:LV/N;

    .line 6
    .line 7
    iget-object v3, p0, LV/M;->r:La2/n;

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x1

    .line 11
    sget-object v6, LS1/a;->k:LS1/a;

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    if-eq v0, v5, :cond_1

    .line 16
    .line 17
    if-ne v0, v4, :cond_0

    .line 18
    .line 19
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    iget-object v0, p0, LV/M;->o:La2/n;

    .line 32
    .line 33
    iget-object v5, p0, LV/M;->q:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v5, LV/Y;

    .line 36
    .line 37
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, LV/M;->q:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, LV/Y;

    .line 47
    .line 48
    invoke-virtual {v2}, LV/N;->g()LV/i0;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object p1, p0, LV/M;->q:Ljava/lang/Object;

    .line 53
    .line 54
    iput-object v3, p0, LV/M;->o:La2/n;

    .line 55
    .line 56
    iput v5, p0, LV/M;->p:I

    .line 57
    .line 58
    iget-object v0, v0, LV/i0;->b:LB1/g;

    .line 59
    .line 60
    iget-object v0, v0, LB1/g;->l:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    new-instance v5, Ljava/lang/Integer;

    .line 69
    .line 70
    invoke-direct {v5, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 71
    .line 72
    .line 73
    if-ne v5, v6, :cond_3

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    move-object v0, v5

    .line 77
    move-object v5, p1

    .line 78
    move-object p1, v0

    .line 79
    move-object v0, v3

    .line 80
    :goto_0
    check-cast p1, Ljava/lang/Number;

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    iput p1, v0, La2/n;->k:I

    .line 87
    .line 88
    const/4 p1, 0x0

    .line 89
    iput-object p1, p0, LV/M;->q:Ljava/lang/Object;

    .line 90
    .line 91
    iput-object p1, p0, LV/M;->o:La2/n;

    .line 92
    .line 93
    iput v4, p0, LV/M;->p:I

    .line 94
    .line 95
    invoke-virtual {v5, v1, p0}, LV/Y;->b(Ljava/lang/Object;LT1/c;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    if-ne p1, v6, :cond_4

    .line 100
    .line 101
    :goto_1
    return-object v6

    .line 102
    :cond_4
    :goto_2
    iget-boolean p1, p0, LV/M;->u:Z

    .line 103
    .line 104
    if-eqz p1, :cond_6

    .line 105
    .line 106
    iget-object p1, v2, LV/N;->r:LB1/a;

    .line 107
    .line 108
    new-instance v0, LV/c;

    .line 109
    .line 110
    if-eqz v1, :cond_5

    .line 111
    .line 112
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    goto :goto_3

    .line 117
    :cond_5
    const/4 v2, 0x0

    .line 118
    :goto_3
    iget v3, v3, La2/n;->k:I

    .line 119
    .line 120
    invoke-direct {v0, v1, v2, v3}, LV/c;-><init>(Ljava/lang/Object;II)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1, v0}, LB1/a;->m(LV/j0;)V

    .line 124
    .line 125
    .line 126
    :cond_6
    sget-object p1, LO1/g;->a:LO1/g;

    .line 127
    .line 128
    return-object p1
.end method

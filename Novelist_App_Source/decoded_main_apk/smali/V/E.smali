.class public final LV/E;
.super LT1/h;
.source "SourceFile"

# interfaces
.implements LZ1/p;


# instance fields
.field public o:Ljava/lang/Object;

.field public p:I

.field public synthetic q:Z

.field public final synthetic r:LV/N;

.field public final synthetic s:I


# direct methods
.method public constructor <init>(LV/N;ILR1/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV/E;->r:LV/N;

    .line 2
    .line 3
    iput p2, p0, LV/E;->s:I

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
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    check-cast p2, LR1/c;

    .line 7
    .line 8
    invoke-virtual {p0, p2, p1}, LV/E;->i(LR1/c;Ljava/lang/Object;)LR1/c;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, LV/E;

    .line 13
    .line 14
    sget-object p2, LO1/g;->a:LO1/g;

    .line 15
    .line 16
    invoke-virtual {p1, p2}, LV/E;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public final i(LR1/c;Ljava/lang/Object;)LR1/c;
    .locals 3

    .line 1
    new-instance v0, LV/E;

    .line 2
    .line 3
    iget-object v1, p0, LV/E;->r:LV/N;

    .line 4
    .line 5
    iget v2, p0, LV/E;->s:I

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p1}, LV/E;-><init>(LV/N;ILR1/c;)V

    .line 8
    .line 9
    .line 10
    check-cast p2, Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iput-boolean p1, v0, LV/E;->q:Z

    .line 17
    .line 18
    return-object v0
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, LV/E;->p:I

    .line 2
    .line 3
    iget-object v1, p0, LV/E;->r:LV/N;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    sget-object v4, LS1/a;->k:LS1/a;

    .line 8
    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    if-eq v0, v3, :cond_1

    .line 12
    .line 13
    if-ne v0, v2, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, LV/E;->o:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    goto :goto_2

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
    iget-boolean v0, p0, LV/E;->q:Z

    .line 30
    .line 31
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-boolean v0, p0, LV/E;->q:Z

    .line 39
    .line 40
    iput-boolean v0, p0, LV/E;->q:Z

    .line 41
    .line 42
    iput v3, p0, LV/E;->p:I

    .line 43
    .line 44
    invoke-virtual {v1, p0}, LV/N;->i(LT1/c;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    if-ne p1, v4, :cond_3

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_3
    :goto_0
    if-eqz v0, :cond_5

    .line 52
    .line 53
    invoke-virtual {v1}, LV/N;->g()LV/i0;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object p1, p0, LV/E;->o:Ljava/lang/Object;

    .line 58
    .line 59
    iput v2, p0, LV/E;->p:I

    .line 60
    .line 61
    invoke-virtual {v0}, LV/i0;->a()Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    if-ne v0, v4, :cond_4

    .line 66
    .line 67
    :goto_1
    return-object v4

    .line 68
    :cond_4
    move-object v5, v0

    .line 69
    move-object v0, p1

    .line 70
    move-object p1, v5

    .line 71
    :goto_2
    check-cast p1, Ljava/lang/Number;

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    goto :goto_3

    .line 78
    :cond_5
    iget v0, p0, LV/E;->s:I

    .line 79
    .line 80
    move v5, v0

    .line 81
    move-object v0, p1

    .line 82
    move p1, v5

    .line 83
    :goto_3
    new-instance v1, LV/c;

    .line 84
    .line 85
    if-eqz v0, :cond_6

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    goto :goto_4

    .line 92
    :cond_6
    const/4 v2, 0x0

    .line 93
    :goto_4
    invoke-direct {v1, v0, v2, p1}, LV/c;-><init>(Ljava/lang/Object;II)V

    .line 94
    .line 95
    .line 96
    return-object v1
.end method

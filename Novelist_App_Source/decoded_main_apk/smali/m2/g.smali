.class public final Lm2/g;
.super Lm2/e;
.source "SourceFile"


# instance fields
.field public final n:Ll2/d;


# direct methods
.method public constructor <init>(Ll2/d;LR1/h;ILk2/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p3, p4}, Lm2/e;-><init>(LR1/h;ILk2/a;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm2/g;->n:Ll2/d;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lk2/q;LR1/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Lm2/o;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lm2/o;-><init>(Lk2/q;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lm2/g;->n:Ll2/d;

    .line 7
    .line 8
    invoke-interface {p1, v0, p2}, Ll2/d;->h(Ll2/e;LR1/c;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object p2, LO1/g;->a:LO1/g;

    .line 13
    .line 14
    sget-object v0, LS1/a;->k:LS1/a;

    .line 15
    .line 16
    if-ne p1, v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object p1, p2

    .line 20
    :goto_0
    if-ne p1, v0, :cond_1

    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_1
    return-object p2
.end method

.method public final h(Ll2/e;LR1/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lm2/e;->l:I

    .line 2
    .line 3
    const/4 v1, -0x3

    .line 4
    sget-object v2, LS1/a;->k:LS1/a;

    .line 5
    .line 6
    sget-object v3, LO1/g;->a:LO1/g;

    .line 7
    .line 8
    if-ne v0, v1, :cond_4

    .line 9
    .line 10
    invoke-interface {p2}, LR1/c;->getContext()LR1/h;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 15
    .line 16
    new-instance v4, LN/d;

    .line 17
    .line 18
    const/4 v5, 0x7

    .line 19
    invoke-direct {v4, v5}, LN/d;-><init>(I)V

    .line 20
    .line 21
    .line 22
    iget-object v5, p0, Lm2/e;->k:LR1/h;

    .line 23
    .line 24
    invoke-interface {v5, v1, v4}, LR1/h;->f(Ljava/lang/Object;LZ1/p;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_0

    .line 35
    .line 36
    invoke-interface {v0, v5}, LR1/h;->i(LR1/h;)LR1/h;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const/4 v1, 0x0

    .line 42
    invoke-static {v0, v5, v1}, Li2/u;->b(LR1/h;LR1/h;Z)LR1/h;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    :goto_0
    invoke-static {v1, v0}, La2/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_2

    .line 51
    .line 52
    iget-object v0, p0, Lm2/g;->n:Ll2/d;

    .line 53
    .line 54
    invoke-interface {v0, p1, p2}, Ll2/d;->h(Ll2/e;LR1/c;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-ne p1, v2, :cond_1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    move-object p1, v3

    .line 62
    :goto_1
    if-ne p1, v2, :cond_5

    .line 63
    .line 64
    return-object p1

    .line 65
    :cond_2
    sget-object v4, LR1/d;->k:LR1/d;

    .line 66
    .line 67
    invoke-interface {v1, v4}, LR1/h;->e(LR1/g;)LR1/f;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    invoke-interface {v0, v4}, LR1/h;->e(LR1/g;)LR1/f;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {v5, v0}, La2/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_4

    .line 80
    .line 81
    invoke-interface {p2}, LR1/c;->getContext()LR1/h;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    instance-of v4, p1, Lm2/o;

    .line 86
    .line 87
    if-nez v4, :cond_3

    .line 88
    .line 89
    new-instance v4, LK1/r;

    .line 90
    .line 91
    invoke-direct {v4, p1, v0}, LK1/r;-><init>(Ll2/e;LR1/h;)V

    .line 92
    .line 93
    .line 94
    move-object p1, v4

    .line 95
    :cond_3
    new-instance v0, Lm2/f;

    .line 96
    .line 97
    const/4 v4, 0x0

    .line 98
    invoke-direct {v0, p0, v4}, Lm2/f;-><init>(Lm2/g;LR1/c;)V

    .line 99
    .line 100
    .line 101
    invoke-static {v1}, Ln2/a;->k(LR1/h;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    invoke-static {v1, p1, v4, v0, p2}, Lm2/k;->b(LR1/h;Ljava/lang/Object;Ljava/lang/Object;LZ1/p;LR1/c;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    if-ne p1, v2, :cond_5

    .line 110
    .line 111
    return-object p1

    .line 112
    :cond_4
    invoke-super {p0, p1, p2}, Lm2/e;->h(Ll2/e;LR1/c;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    if-ne p1, v2, :cond_5

    .line 117
    .line 118
    return-object p1

    .line 119
    :cond_5
    return-object v3
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lm2/g;->n:Ll2/d;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, " -> "

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-super {p0}, Lm2/e;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
.end method

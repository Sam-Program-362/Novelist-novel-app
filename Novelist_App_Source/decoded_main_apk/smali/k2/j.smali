.class public abstract Lk2/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lk2/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lk2/i;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lk2/j;->a:Lk2/i;

    .line 7
    .line 8
    return-void
.end method

.method public static a(ILk2/a;I)Lk2/c;
    .locals 2

    .line 1
    and-int/lit8 p2, p2, 0x2

    .line 2
    .line 3
    sget-object v0, Lk2/a;->k:Lk2/a;

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    move-object p1, v0

    .line 8
    :cond_0
    const/4 p2, -0x2

    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq p0, p2, :cond_7

    .line 11
    .line 12
    const/4 p2, -0x1

    .line 13
    if-eq p0, p2, :cond_5

    .line 14
    .line 15
    if-eqz p0, :cond_3

    .line 16
    .line 17
    const p2, 0x7fffffff

    .line 18
    .line 19
    .line 20
    if-eq p0, p2, :cond_2

    .line 21
    .line 22
    if-ne p1, v0, :cond_1

    .line 23
    .line 24
    new-instance p1, Lk2/c;

    .line 25
    .line 26
    invoke-direct {p1, p0}, Lk2/c;-><init>(I)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :cond_1
    new-instance p2, Lk2/m;

    .line 31
    .line 32
    invoke-direct {p2, p0, p1}, Lk2/m;-><init>(ILk2/a;)V

    .line 33
    .line 34
    .line 35
    return-object p2

    .line 36
    :cond_2
    new-instance p0, Lk2/c;

    .line 37
    .line 38
    invoke-direct {p0, p2}, Lk2/c;-><init>(I)V

    .line 39
    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_3
    if-ne p1, v0, :cond_4

    .line 43
    .line 44
    new-instance p0, Lk2/c;

    .line 45
    .line 46
    const/4 p1, 0x0

    .line 47
    invoke-direct {p0, p1}, Lk2/c;-><init>(I)V

    .line 48
    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_4
    new-instance p0, Lk2/m;

    .line 52
    .line 53
    invoke-direct {p0, v1, p1}, Lk2/m;-><init>(ILk2/a;)V

    .line 54
    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_5
    if-ne p1, v0, :cond_6

    .line 58
    .line 59
    new-instance p0, Lk2/m;

    .line 60
    .line 61
    sget-object p1, Lk2/a;->l:Lk2/a;

    .line 62
    .line 63
    invoke-direct {p0, v1, p1}, Lk2/m;-><init>(ILk2/a;)V

    .line 64
    .line 65
    .line 66
    return-object p0

    .line 67
    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 68
    .line 69
    const-string p1, "CONFLATED capacity cannot be used with non-default onBufferOverflow"

    .line 70
    .line 71
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p0

    .line 75
    :cond_7
    if-ne p1, v0, :cond_8

    .line 76
    .line 77
    new-instance p0, Lk2/c;

    .line 78
    .line 79
    sget-object p1, Lk2/g;->h:Lk2/f;

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    sget p1, Lk2/f;->b:I

    .line 85
    .line 86
    invoke-direct {p0, p1}, Lk2/c;-><init>(I)V

    .line 87
    .line 88
    .line 89
    return-object p0

    .line 90
    :cond_8
    new-instance p0, Lk2/m;

    .line 91
    .line 92
    invoke-direct {p0, v1, p1}, Lk2/m;-><init>(ILk2/a;)V

    .line 93
    .line 94
    .line 95
    return-object p0
.end method

.method public static final b(Lk2/q;LX/b;LT1/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lk2/n;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lk2/n;

    .line 7
    .line 8
    iget v1, v0, Lk2/n;->p:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lk2/n;->p:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lk2/n;

    .line 21
    .line 22
    invoke-direct {v0, p2}, LT1/c;-><init>(LR1/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lk2/n;->o:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lk2/n;->p:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget-object p1, v0, Lk2/n;->n:LX/b;

    .line 35
    .line 36
    :try_start_0
    invoke-static {p2}, LH2/h;->E(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    goto :goto_2

    .line 42
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p0

    .line 50
    :cond_2
    invoke-static {p2}, LH2/h;->E(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object p2, v0, LT1/c;->l:LR1/h;

    .line 54
    .line 55
    invoke-static {p2}, La2/h;->b(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    sget-object v1, Li2/r;->l:Li2/r;

    .line 59
    .line 60
    invoke-interface {p2, v1}, LR1/h;->e(LR1/g;)LR1/f;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    if-ne p2, p0, :cond_4

    .line 65
    .line 66
    :try_start_1
    iput-object p1, v0, Lk2/n;->n:LX/b;

    .line 67
    .line 68
    iput v2, v0, Lk2/n;->p:I

    .line 69
    .line 70
    new-instance p2, Li2/g;

    .line 71
    .line 72
    invoke-static {v0}, LH2/h;->s(LR1/c;)LR1/c;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-direct {p2, v2, v0}, Li2/g;-><init>(ILR1/c;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2}, Li2/g;->s()V

    .line 80
    .line 81
    .line 82
    new-instance v0, Lk2/o;

    .line 83
    .line 84
    invoke-direct {v0, p2}, Lk2/o;-><init>(Li2/g;)V

    .line 85
    .line 86
    .line 87
    check-cast p0, Lk2/p;

    .line 88
    .line 89
    invoke-virtual {p0, v0}, Lk2/p;->U(Lk2/o;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p2}, Li2/g;->r()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 96
    sget-object p2, LS1/a;->k:LS1/a;

    .line 97
    .line 98
    if-ne p0, p2, :cond_3

    .line 99
    .line 100
    return-object p2

    .line 101
    :cond_3
    :goto_1
    invoke-interface {p1}, LZ1/a;->a()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    sget-object p0, LO1/g;->a:LO1/g;

    .line 105
    .line 106
    return-object p0

    .line 107
    :goto_2
    invoke-interface {p1}, LZ1/a;->a()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    throw p0

    .line 111
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 112
    .line 113
    const-string p1, "awaitClose() can only be invoked from the producer context"

    .line 114
    .line 115
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw p0
.end method

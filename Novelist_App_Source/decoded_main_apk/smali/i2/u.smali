.class public abstract Li2/u;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LB1/g;

.field public static final b:LB1/g;

.field public static final c:LB1/g;

.field public static final d:LB1/g;

.field public static final e:LB1/g;

.field public static final f:LB1/g;

.field public static final g:LB1/g;

.field public static final h:Li2/D;

.field public static final i:Li2/D;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LB1/g;

    .line 2
    .line 3
    const-string v1, "RESUME_TOKEN"

    .line 4
    .line 5
    const/16 v2, 0x12

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, LB1/g;-><init>(Ljava/lang/Object;I)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Li2/u;->a:LB1/g;

    .line 11
    .line 12
    new-instance v0, LB1/g;

    .line 13
    .line 14
    const-string v1, "CLOSED_EMPTY"

    .line 15
    .line 16
    invoke-direct {v0, v1, v2}, LB1/g;-><init>(Ljava/lang/Object;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Li2/u;->b:LB1/g;

    .line 20
    .line 21
    new-instance v0, LB1/g;

    .line 22
    .line 23
    const-string v1, "COMPLETING_ALREADY"

    .line 24
    .line 25
    invoke-direct {v0, v1, v2}, LB1/g;-><init>(Ljava/lang/Object;I)V

    .line 26
    .line 27
    .line 28
    sput-object v0, Li2/u;->c:LB1/g;

    .line 29
    .line 30
    new-instance v0, LB1/g;

    .line 31
    .line 32
    const-string v1, "COMPLETING_WAITING_CHILDREN"

    .line 33
    .line 34
    invoke-direct {v0, v1, v2}, LB1/g;-><init>(Ljava/lang/Object;I)V

    .line 35
    .line 36
    .line 37
    sput-object v0, Li2/u;->d:LB1/g;

    .line 38
    .line 39
    new-instance v0, LB1/g;

    .line 40
    .line 41
    const-string v1, "COMPLETING_RETRY"

    .line 42
    .line 43
    invoke-direct {v0, v1, v2}, LB1/g;-><init>(Ljava/lang/Object;I)V

    .line 44
    .line 45
    .line 46
    sput-object v0, Li2/u;->e:LB1/g;

    .line 47
    .line 48
    new-instance v0, LB1/g;

    .line 49
    .line 50
    const-string v1, "TOO_LATE_TO_CANCEL"

    .line 51
    .line 52
    invoke-direct {v0, v1, v2}, LB1/g;-><init>(Ljava/lang/Object;I)V

    .line 53
    .line 54
    .line 55
    sput-object v0, Li2/u;->f:LB1/g;

    .line 56
    .line 57
    new-instance v0, LB1/g;

    .line 58
    .line 59
    const-string v1, "SEALED"

    .line 60
    .line 61
    invoke-direct {v0, v1, v2}, LB1/g;-><init>(Ljava/lang/Object;I)V

    .line 62
    .line 63
    .line 64
    sput-object v0, Li2/u;->g:LB1/g;

    .line 65
    .line 66
    new-instance v0, Li2/D;

    .line 67
    .line 68
    const/4 v1, 0x0

    .line 69
    invoke-direct {v0, v1}, Li2/D;-><init>(Z)V

    .line 70
    .line 71
    .line 72
    sput-object v0, Li2/u;->h:Li2/D;

    .line 73
    .line 74
    new-instance v0, Li2/D;

    .line 75
    .line 76
    const/4 v1, 0x1

    .line 77
    invoke-direct {v0, v1}, Li2/D;-><init>(Z)V

    .line 78
    .line 79
    .line 80
    sput-object v0, Li2/u;->i:Li2/D;

    .line 81
    .line 82
    return-void
.end method

.method public static final a(LR1/h;)Ln2/c;
    .locals 2

    .line 1
    new-instance v0, Ln2/c;

    .line 2
    .line 3
    sget-object v1, Li2/r;->l:Li2/r;

    .line 4
    .line 5
    invoke-interface {p0, v1}, LR1/h;->e(LR1/g;)LR1/f;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance v1, Li2/P;

    .line 13
    .line 14
    invoke-direct {v1}, Li2/P;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-interface {p0, v1}, LR1/h;->i(LR1/h;)LR1/h;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :goto_0
    invoke-direct {v0, p0}, Ln2/c;-><init>(LR1/h;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public static final b(LR1/h;LR1/h;Z)LR1/h;
    .locals 3

    .line 1
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2
    .line 3
    new-instance v0, LN/d;

    .line 4
    .line 5
    const/4 v1, 0x7

    .line 6
    invoke-direct {v0, v1}, LN/d;-><init>(I)V

    .line 7
    .line 8
    .line 9
    invoke-interface {p0, p2, v0}, LR1/h;->f(Ljava/lang/Object;LZ1/p;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    new-instance v1, LN/d;

    .line 20
    .line 21
    const/4 v2, 0x7

    .line 22
    invoke-direct {v1, v2}, LN/d;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p1, p2, v1}, LR1/h;->f(Ljava/lang/Object;LZ1/p;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    check-cast p2, Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    if-nez p2, :cond_0

    .line 38
    .line 39
    invoke-interface {p0, p1}, LR1/h;->i(LR1/h;)LR1/h;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :cond_0
    new-instance v0, LN/d;

    .line 45
    .line 46
    const/4 v1, 0x5

    .line 47
    invoke-direct {v0, v1}, LN/d;-><init>(I)V

    .line 48
    .line 49
    .line 50
    sget-object v1, LR1/i;->k:LR1/i;

    .line 51
    .line 52
    invoke-interface {p0, v1, v0}, LR1/h;->f(Ljava/lang/Object;LZ1/p;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, LR1/h;

    .line 57
    .line 58
    if-eqz p2, :cond_1

    .line 59
    .line 60
    check-cast p1, LR1/h;

    .line 61
    .line 62
    new-instance p2, LN/d;

    .line 63
    .line 64
    const/4 v0, 0x6

    .line 65
    invoke-direct {p2, v0}, LN/d;-><init>(I)V

    .line 66
    .line 67
    .line 68
    invoke-interface {p1, v1, p2}, LR1/h;->f(Ljava/lang/Object;LZ1/p;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    :cond_1
    check-cast p1, LR1/h;

    .line 73
    .line 74
    invoke-interface {p0, p1}, LR1/h;->i(LR1/h;)LR1/h;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0
.end method

.method public static final c(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static final d(LR1/c;)Li2/g;
    .locals 6

    .line 1
    instance-of v0, p0, Ln2/f;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Li2/g;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p0}, Li2/g;-><init>(ILR1/c;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    move-object v0, p0

    .line 13
    check-cast v0, Ln2/f;

    .line 14
    .line 15
    sget-object v1, Ln2/a;->c:LB1/g;

    .line 16
    .line 17
    sget-object v2, Ln2/f;->r:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 18
    .line 19
    :cond_1
    :goto_0
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const/4 v4, 0x0

    .line 24
    if-nez v3, :cond_2

    .line 25
    .line 26
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    move-object v3, v4

    .line 30
    goto :goto_1

    .line 31
    :cond_2
    instance-of v5, v3, Li2/g;

    .line 32
    .line 33
    if-eqz v5, :cond_8

    .line 34
    .line 35
    :cond_3
    invoke-virtual {v2, v0, v3, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-eqz v5, :cond_7

    .line 40
    .line 41
    check-cast v3, Li2/g;

    .line 42
    .line 43
    :goto_1
    if-eqz v3, :cond_6

    .line 44
    .line 45
    sget-object v0, Li2/g;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 46
    .line 47
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    instance-of v2, v1, Li2/n;

    .line 52
    .line 53
    if-eqz v2, :cond_4

    .line 54
    .line 55
    check-cast v1, Li2/n;

    .line 56
    .line 57
    iget-object v1, v1, Li2/n;->d:Ljava/lang/Object;

    .line 58
    .line 59
    if-eqz v1, :cond_4

    .line 60
    .line 61
    invoke-virtual {v3}, Li2/g;->o()V

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_4
    sget-object v1, Li2/g;->p:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 66
    .line 67
    const v2, 0x1fffffff

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v3, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->set(Ljava/lang/Object;I)V

    .line 71
    .line 72
    .line 73
    sget-object v1, Li2/b;->a:Li2/b;

    .line 74
    .line 75
    invoke-virtual {v0, v3, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    move-object v4, v3

    .line 79
    :goto_2
    if-nez v4, :cond_5

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_5
    return-object v4

    .line 83
    :cond_6
    :goto_3
    new-instance v0, Li2/g;

    .line 84
    .line 85
    const/4 v1, 0x2

    .line 86
    invoke-direct {v0, v1, p0}, Li2/g;-><init>(ILR1/c;)V

    .line 87
    .line 88
    .line 89
    return-object v0

    .line 90
    :cond_7
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    if-eq v5, v3, :cond_3

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_8
    if-eq v3, v1, :cond_1

    .line 98
    .line 99
    instance-of v4, v3, Ljava/lang/Throwable;

    .line 100
    .line 101
    if-eqz v4, :cond_9

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 105
    .line 106
    new-instance v0, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    const-string v1, "Inconsistent state "

    .line 109
    .line 110
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw p0
.end method

.method public static final e(LR1/h;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    :try_start_0
    sget-object v0, Li2/r;->k:Li2/r;

    .line 2
    .line 3
    invoke-interface {p0, v0}, LR1/h;->e(LR1/g;)LR1/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lj2/b;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lj2/b;->c(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-static {p0, p1}, Ln2/a;->d(LR1/h;Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :goto_0
    if-ne p1, v0, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    new-instance v1, Ljava/lang/RuntimeException;

    .line 25
    .line 26
    const-string v2, "Exception while trying to handle coroutine exception"

    .line 27
    .line 28
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v1, p1}, LE2/a;->b(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    move-object p1, v1

    .line 35
    :goto_1
    invoke-static {p0, p1}, Ln2/a;->d(LR1/h;Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public static final f(Li2/N;ZLi2/S;)Li2/B;
    .locals 9

    .line 1
    instance-of v0, p0, Li2/W;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Li2/W;

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Li2/W;->D(ZLi2/S;)Li2/B;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-virtual {p2}, Li2/S;->k()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    new-instance v1, Li2/Q;

    .line 17
    .line 18
    const/4 v7, 0x0

    .line 19
    const/4 v8, 0x0

    .line 20
    const/4 v2, 0x1

    .line 21
    const-class v4, Li2/S;

    .line 22
    .line 23
    const-string v5, "invoke"

    .line 24
    .line 25
    const-string v6, "invoke(Ljava/lang/Throwable;)V"

    .line 26
    .line 27
    move-object v3, p2

    .line 28
    invoke-direct/range {v1 .. v8}, La2/g;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 29
    .line 30
    .line 31
    check-cast p0, Li2/W;

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    new-instance p2, Li2/M;

    .line 36
    .line 37
    invoke-direct {p2, v1}, Li2/M;-><init>(Li2/Q;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    new-instance p2, Li2/i;

    .line 42
    .line 43
    const/4 v0, 0x1

    .line 44
    invoke-direct {p2, v1, v0}, Li2/i;-><init>(Ljava/lang/Object;I)V

    .line 45
    .line 46
    .line 47
    :goto_0
    invoke-virtual {p0, p1, p2}, Li2/W;->D(ZLi2/S;)Li2/B;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0
.end method

.method public static g(Li2/s;LZ1/p;)Li2/b0;
    .locals 3

    .line 1
    invoke-interface {p0}, Li2/s;->d()LR1/h;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, LR1/i;->k:LR1/i;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-static {p0, v0, v1}, Li2/u;->b(LR1/h;LR1/h;Z)LR1/h;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    sget-object v0, Li2/A;->a:Lp2/e;

    .line 13
    .line 14
    if-eq p0, v0, :cond_0

    .line 15
    .line 16
    sget-object v2, LR1/d;->k:LR1/d;

    .line 17
    .line 18
    invoke-interface {p0, v2}, LR1/h;->e(LR1/g;)LR1/f;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    invoke-interface {p0, v0}, LR1/h;->i(LR1/h;)LR1/h;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    :cond_0
    new-instance v0, Li2/b0;

    .line 29
    .line 30
    invoke-direct {v0, p0, v1}, Li2/a;-><init>(LR1/h;Z)V

    .line 31
    .line 32
    .line 33
    sget-object p0, Li2/t;->k:Li2/t;

    .line 34
    .line 35
    invoke-virtual {v0, p0, v0, p1}, Li2/a;->T(Li2/t;Li2/a;LZ1/p;)V

    .line 36
    .line 37
    .line 38
    return-object v0
.end method

.method public static final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p0, Li2/o;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Li2/o;

    .line 6
    .line 7
    iget-object p0, p0, Li2/o;->a:Ljava/lang/Throwable;

    .line 8
    .line 9
    invoke-static {p0}, LH2/h;->i(Ljava/lang/Throwable;)LO1/c;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :cond_0
    return-object p0
.end method

.method public static final i(Li2/g;LR1/c;Z)V
    .locals 2

    .line 1
    sget-object v0, Li2/g;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0, v0}, Li2/g;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-static {v1}, LH2/h;->i(Ljava/lang/Throwable;)LO1/c;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0, v0}, Li2/g;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    :goto_0
    if-eqz p2, :cond_6

    .line 23
    .line 24
    const-string p2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>"

    .line 25
    .line 26
    invoke-static {p1, p2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    check-cast p1, Ln2/f;

    .line 30
    .line 31
    iget-object p2, p1, Ln2/f;->o:LT1/c;

    .line 32
    .line 33
    iget-object p1, p1, Ln2/f;->q:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-interface {p2}, LR1/c;->getContext()LR1/h;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v0, p1}, Ln2/a;->l(LR1/h;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    sget-object v1, Ln2/a;->d:LB1/g;

    .line 44
    .line 45
    if-eq p1, v1, :cond_1

    .line 46
    .line 47
    invoke-static {p2, v0, p1}, Li2/u;->m(LR1/c;LR1/h;Ljava/lang/Object;)Li2/g0;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    const/4 v1, 0x0

    .line 53
    :goto_1
    :try_start_0
    invoke-virtual {p2, p0}, LT1/a;->resumeWith(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    invoke-virtual {v1}, Li2/g0;->U()Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-eqz p0, :cond_2

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    return-void

    .line 66
    :cond_3
    :goto_2
    invoke-static {v0, p1}, Ln2/a;->g(LR1/h;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :catchall_0
    move-exception p0

    .line 71
    if-eqz v1, :cond_4

    .line 72
    .line 73
    invoke-virtual {v1}, Li2/g0;->U()Z

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    if-eqz p2, :cond_5

    .line 78
    .line 79
    :cond_4
    invoke-static {v0, p1}, Ln2/a;->g(LR1/h;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    :cond_5
    throw p0

    .line 83
    :cond_6
    invoke-interface {p1, p0}, LR1/c;->resumeWith(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public static j(LZ1/p;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Li2/e0;->a()Li2/G;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, LR1/i;->k:LR1/i;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    invoke-static {v2, v1, v3}, Li2/u;->b(LR1/h;LR1/h;Z)LR1/h;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    sget-object v3, Li2/A;->a:Lp2/e;

    .line 17
    .line 18
    if-eq v2, v3, :cond_0

    .line 19
    .line 20
    sget-object v4, LR1/d;->k:LR1/d;

    .line 21
    .line 22
    invoke-interface {v2, v4}, LR1/h;->e(LR1/g;)LR1/f;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    if-nez v4, :cond_0

    .line 27
    .line 28
    invoke-interface {v2, v3}, LR1/h;->i(LR1/h;)LR1/h;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    :cond_0
    new-instance v3, Li2/c;

    .line 33
    .line 34
    invoke-direct {v3, v2, v0, v1}, Li2/c;-><init>(LR1/h;Ljava/lang/Thread;Li2/G;)V

    .line 35
    .line 36
    .line 37
    sget-object v0, Li2/t;->k:Li2/t;

    .line 38
    .line 39
    invoke-virtual {v3, v0, v3, p0}, Li2/a;->T(Li2/t;Li2/a;LZ1/p;)V

    .line 40
    .line 41
    .line 42
    const/4 p0, 0x0

    .line 43
    iget-object v0, v3, Li2/c;->o:Li2/G;

    .line 44
    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    sget v1, Li2/G;->p:I

    .line 48
    .line 49
    invoke-virtual {v0, p0}, Li2/G;->l(Z)V

    .line 50
    .line 51
    .line 52
    :cond_1
    :goto_0
    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-nez v1, :cond_7

    .line 57
    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    invoke-virtual {v0}, Li2/G;->m()J

    .line 61
    .line 62
    .line 63
    move-result-wide v1

    .line 64
    goto :goto_1

    .line 65
    :catchall_0
    move-exception v1

    .line 66
    goto :goto_3

    .line 67
    :cond_2
    const-wide v1, 0x7fffffffffffffffL

    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    :goto_1
    sget-object v4, Li2/W;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 73
    .line 74
    invoke-virtual {v4, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    instance-of v5, v5, Li2/K;

    .line 79
    .line 80
    if-eqz v5, :cond_3

    .line 81
    .line 82
    invoke-static {v3, v1, v2}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(Ljava/lang/Object;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_3
    if-eqz v0, :cond_4

    .line 87
    .line 88
    sget v1, Li2/G;->p:I

    .line 89
    .line 90
    invoke-virtual {v0, p0}, Li2/G;->h(Z)V

    .line 91
    .line 92
    .line 93
    :cond_4
    invoke-virtual {v4, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-static {p0}, Li2/u;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    instance-of v0, p0, Li2/o;

    .line 102
    .line 103
    if-eqz v0, :cond_5

    .line 104
    .line 105
    move-object v0, p0

    .line 106
    check-cast v0, Li2/o;

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_5
    const/4 v0, 0x0

    .line 110
    :goto_2
    if-nez v0, :cond_6

    .line 111
    .line 112
    return-object p0

    .line 113
    :cond_6
    iget-object p0, v0, Li2/o;->a:Ljava/lang/Throwable;

    .line 114
    .line 115
    throw p0

    .line 116
    :cond_7
    :try_start_1
    new-instance v1, Ljava/lang/InterruptedException;

    .line 117
    .line 118
    invoke-direct {v1}, Ljava/lang/InterruptedException;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v3, v1}, Li2/W;->o(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 125
    :goto_3
    if-eqz v0, :cond_8

    .line 126
    .line 127
    sget v2, Li2/G;->p:I

    .line 128
    .line 129
    invoke-virtual {v0, p0}, Li2/G;->h(Z)V

    .line 130
    .line 131
    .line 132
    :cond_8
    throw v1
.end method

.method public static final k(LR1/c;)Ljava/lang/String;
    .locals 3

    .line 1
    instance-of v0, p0, Ln2/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ln2/f;

    .line 6
    .line 7
    invoke-virtual {p0}, Ln2/f;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const/16 v0, 0x40

    .line 13
    .line 14
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-static {p0}, Li2/u;->c(Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception v1

    .line 38
    invoke-static {v1}, LH2/h;->i(Ljava/lang/Throwable;)LO1/c;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    :goto_0
    invoke-static {v1}, LO1/d;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    if-nez v2, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-static {p0}, Li2/u;->c(Ljava/lang/Object;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    :goto_1
    check-cast v1, Ljava/lang/String;

    .line 80
    .line 81
    return-object v1
.end method

.method public static final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p0, Li2/L;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Li2/L;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    if-eqz v0, :cond_2

    .line 11
    .line 12
    iget-object v0, v0, Li2/L;->a:Li2/K;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    return-object v0

    .line 18
    :cond_2
    :goto_1
    return-object p0
.end method

.method public static final m(LR1/c;LR1/h;Ljava/lang/Object;)Li2/g0;
    .locals 2

    .line 1
    instance-of v0, p0, LT1/d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    sget-object v0, Li2/h0;->k:Li2/h0;

    .line 8
    .line 9
    invoke-interface {p1, v0}, LR1/h;->e(LR1/g;)LR1/f;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_4

    .line 14
    .line 15
    check-cast p0, LT1/d;

    .line 16
    .line 17
    :cond_1
    instance-of v0, p0, Li2/y;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    invoke-interface {p0}, LT1/d;->c()LT1/d;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-nez p0, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    instance-of v0, p0, Li2/g0;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    move-object v1, p0

    .line 34
    check-cast v1, Li2/g0;

    .line 35
    .line 36
    :goto_0
    if-eqz v1, :cond_4

    .line 37
    .line 38
    invoke-virtual {v1, p1, p2}, Li2/g0;->V(LR1/h;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :cond_4
    :goto_1
    return-object v1
.end method

.method public static final n(LR1/h;LZ1/p;LT1/h;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p2, LT1/c;->l:LR1/h;

    .line 2
    .line 3
    invoke-static {v0}, La2/h;->b(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 7
    .line 8
    new-instance v2, LN/d;

    .line 9
    .line 10
    const/4 v3, 0x7

    .line 11
    invoke-direct {v2, v3}, LN/d;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p0, v1, v2}, LR1/h;->f(Ljava/lang/Object;LZ1/p;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v2, 0x0

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    invoke-interface {v0, p0}, LR1/h;->i(LR1/h;)LR1/h;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-static {v0, p0, v2}, Li2/u;->b(LR1/h;LR1/h;Z)LR1/h;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    :goto_0
    sget-object v1, Li2/r;->l:Li2/r;

    .line 37
    .line 38
    invoke-interface {p0, v1}, LR1/h;->e(LR1/g;)LR1/f;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Li2/N;

    .line 43
    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    invoke-interface {v1}, Li2/N;->a()Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    check-cast v1, Li2/W;

    .line 54
    .line 55
    invoke-virtual {v1}, Li2/W;->w()Ljava/util/concurrent/CancellationException;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    throw p0

    .line 60
    :cond_2
    :goto_1
    if-ne p0, v0, :cond_3

    .line 61
    .line 62
    new-instance v0, Ln2/q;

    .line 63
    .line 64
    invoke-direct {v0, p2, p0}, Ln2/q;-><init>(LR1/c;LR1/h;)V

    .line 65
    .line 66
    .line 67
    invoke-static {v0, v0, p1}, LH2/h;->C(Ln2/q;Ln2/q;LZ1/p;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    goto :goto_2

    .line 72
    :cond_3
    sget-object v1, LR1/d;->k:LR1/d;

    .line 73
    .line 74
    invoke-interface {p0, v1}, LR1/h;->e(LR1/g;)LR1/f;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-interface {v0, v1}, LR1/h;->e(LR1/g;)LR1/f;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-static {v3, v0}, La2/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_4

    .line 87
    .line 88
    new-instance v0, Li2/g0;

    .line 89
    .line 90
    invoke-direct {v0, p0, p2}, Li2/g0;-><init>(LR1/h;LT1/h;)V

    .line 91
    .line 92
    .line 93
    const/4 p0, 0x0

    .line 94
    iget-object p2, v0, Li2/a;->m:LR1/h;

    .line 95
    .line 96
    invoke-static {p2, p0}, Ln2/a;->l(LR1/h;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    :try_start_0
    invoke-static {v0, v0, p1}, LH2/h;->C(Ln2/q;Ln2/q;LZ1/p;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    invoke-static {p2, p0}, Ln2/a;->g(LR1/h;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    move-object p0, p1

    .line 108
    goto :goto_2

    .line 109
    :catchall_0
    move-exception p1

    .line 110
    invoke-static {p2, p0}, Ln2/a;->g(LR1/h;Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    throw p1

    .line 114
    :cond_4
    new-instance v0, Li2/y;

    .line 115
    .line 116
    invoke-direct {v0, p2, p0}, Ln2/q;-><init>(LR1/c;LR1/h;)V

    .line 117
    .line 118
    .line 119
    :try_start_1
    check-cast p1, LT1/a;

    .line 120
    .line 121
    invoke-virtual {p1, v0, v0}, LT1/a;->i(LR1/c;Ljava/lang/Object;)LR1/c;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-static {p0}, LH2/h;->s(LR1/c;)LR1/c;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    sget-object p1, LO1/g;->a:LO1/g;

    .line 130
    .line 131
    invoke-static {p0, p1}, Ln2/a;->h(LR1/c;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 132
    .line 133
    .line 134
    sget-object p0, Li2/y;->o:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 135
    .line 136
    :cond_5
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    if-eqz p1, :cond_8

    .line 141
    .line 142
    const/4 p0, 0x2

    .line 143
    if-ne p1, p0, :cond_7

    .line 144
    .line 145
    sget-object p0, Li2/W;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 146
    .line 147
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-static {p0}, Li2/u;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    instance-of p1, p0, Li2/o;

    .line 156
    .line 157
    if-nez p1, :cond_6

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_6
    check-cast p0, Li2/o;

    .line 161
    .line 162
    iget-object p0, p0, Li2/o;->a:Ljava/lang/Throwable;

    .line 163
    .line 164
    throw p0

    .line 165
    :cond_7
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 166
    .line 167
    const-string p1, "Already suspended"

    .line 168
    .line 169
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    throw p0

    .line 173
    :cond_8
    const/4 p1, 0x1

    .line 174
    invoke-virtual {p0, v0, v2, p1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    if-eqz p1, :cond_5

    .line 179
    .line 180
    sget-object p0, LS1/a;->k:LS1/a;

    .line 181
    .line 182
    :goto_2
    return-object p0

    .line 183
    :catchall_1
    move-exception p0

    .line 184
    invoke-static {p0}, LH2/h;->i(Ljava/lang/Throwable;)LO1/c;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-virtual {v0, p1}, Li2/a;->resumeWith(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    throw p0
.end method

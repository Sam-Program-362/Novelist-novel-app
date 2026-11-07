.class public final LV/N;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV/h;


# instance fields
.field public final k:LV/T;

.field public final l:LM1/A;

.field public final m:Li2/s;

.field public final n:LB1/a;

.field public final o:Lq2/c;

.field public p:I

.field public q:Li2/b0;

.field public final r:LB1/a;

.field public final s:LB1/s;

.field public final t:LO1/e;

.field public final u:LO1/e;

.field public final v:LB1/s;


# direct methods
.method public constructor <init>(LV/T;Ljava/util/List;LM1/A;Li2/s;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LV/N;->k:LV/T;

    .line 5
    .line 6
    iput-object p3, p0, LV/N;->l:LM1/A;

    .line 7
    .line 8
    iput-object p4, p0, LV/N;->m:Li2/s;

    .line 9
    .line 10
    new-instance p1, LV/s;

    .line 11
    .line 12
    const/4 p3, 0x0

    .line 13
    invoke-direct {p1, p0, p3}, LV/s;-><init>(LV/N;LR1/c;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, LB1/a;

    .line 17
    .line 18
    invoke-direct {v0, p1}, LB1/a;-><init>(LZ1/p;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, LV/N;->n:LB1/a;

    .line 22
    .line 23
    new-instance p1, Lq2/c;

    .line 24
    .line 25
    invoke-direct {p1}, Lq2/c;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, LV/N;->o:Lq2/c;

    .line 29
    .line 30
    new-instance p1, LB1/a;

    .line 31
    .line 32
    const/16 v0, 0xc

    .line 33
    .line 34
    invoke-direct {p1, v0}, LB1/a;-><init>(I)V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, LV/N;->r:LB1/a;

    .line 38
    .line 39
    new-instance p1, LB1/s;

    .line 40
    .line 41
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p0, p1, LB1/s;->n:Ljava/lang/Object;

    .line 45
    .line 46
    new-instance v0, Lq2/c;

    .line 47
    .line 48
    invoke-direct {v0}, Lq2/c;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object v0, p1, LB1/s;->k:Ljava/lang/Object;

    .line 52
    .line 53
    new-instance v0, Li2/m;

    .line 54
    .line 55
    const/4 v1, 0x1

    .line 56
    invoke-direct {v0, v1}, Li2/W;-><init>(Z)V

    .line 57
    .line 58
    .line 59
    const/4 v1, 0x0

    .line 60
    invoke-virtual {v0, v1}, Li2/W;->C(Li2/N;)V

    .line 61
    .line 62
    .line 63
    iput-object v0, p1, LB1/s;->l:Ljava/lang/Object;

    .line 64
    .line 65
    invoke-static {p2}, LP1/e;->l0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    iput-object p2, p1, LB1/s;->m:Ljava/lang/Object;

    .line 70
    .line 71
    iput-object p1, p0, LV/N;->s:LB1/s;

    .line 72
    .line 73
    new-instance p1, LV/m;

    .line 74
    .line 75
    const/4 p2, 0x1

    .line 76
    invoke-direct {p1, p0, p2}, LV/m;-><init>(LV/N;I)V

    .line 77
    .line 78
    .line 79
    new-instance p2, LO1/e;

    .line 80
    .line 81
    invoke-direct {p2, p1}, LO1/e;-><init>(LZ1/a;)V

    .line 82
    .line 83
    .line 84
    iput-object p2, p0, LV/N;->t:LO1/e;

    .line 85
    .line 86
    new-instance p1, LV/m;

    .line 87
    .line 88
    const/4 p2, 0x0

    .line 89
    invoke-direct {p1, p0, p2}, LV/m;-><init>(LV/N;I)V

    .line 90
    .line 91
    .line 92
    new-instance p2, LO1/e;

    .line 93
    .line 94
    invoke-direct {p2, p1}, LO1/e;-><init>(LZ1/a;)V

    .line 95
    .line 96
    .line 97
    iput-object p2, p0, LV/N;->u:LO1/e;

    .line 98
    .line 99
    new-instance p1, LB1/s;

    .line 100
    .line 101
    new-instance p2, LV/J;

    .line 102
    .line 103
    invoke-direct {p2, p0}, LV/J;-><init>(LV/N;)V

    .line 104
    .line 105
    .line 106
    new-instance v0, LV/K;

    .line 107
    .line 108
    invoke-direct {v0, p0, p3}, LV/K;-><init>(LV/N;LR1/c;)V

    .line 109
    .line 110
    .line 111
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 112
    .line 113
    .line 114
    iput-object p4, p1, LB1/s;->k:Ljava/lang/Object;

    .line 115
    .line 116
    iput-object v0, p1, LB1/s;->l:Ljava/lang/Object;

    .line 117
    .line 118
    const/4 v0, 0x6

    .line 119
    const v1, 0x7fffffff

    .line 120
    .line 121
    .line 122
    invoke-static {v1, p3, v0}, Lk2/j;->a(ILk2/a;I)Lk2/c;

    .line 123
    .line 124
    .line 125
    move-result-object p3

    .line 126
    iput-object p3, p1, LB1/s;->m:Ljava/lang/Object;

    .line 127
    .line 128
    new-instance p3, LB1/g;

    .line 129
    .line 130
    const/4 v0, 0x7

    .line 131
    invoke-direct {p3, v0}, LB1/g;-><init>(I)V

    .line 132
    .line 133
    .line 134
    iput-object p3, p1, LB1/s;->n:Ljava/lang/Object;

    .line 135
    .line 136
    invoke-interface {p4}, Li2/s;->d()LR1/h;

    .line 137
    .line 138
    .line 139
    move-result-object p3

    .line 140
    sget-object p4, Li2/r;->l:Li2/r;

    .line 141
    .line 142
    invoke-interface {p3, p4}, LR1/h;->e(LR1/g;)LR1/f;

    .line 143
    .line 144
    .line 145
    move-result-object p3

    .line 146
    check-cast p3, Li2/N;

    .line 147
    .line 148
    if-eqz p3, :cond_0

    .line 149
    .line 150
    new-instance p4, LV/d0;

    .line 151
    .line 152
    invoke-direct {p4, p2, p1}, LV/d0;-><init>(LV/J;LB1/s;)V

    .line 153
    .line 154
    .line 155
    check-cast p3, Li2/W;

    .line 156
    .line 157
    new-instance p2, Li2/i;

    .line 158
    .line 159
    const/4 v0, 0x1

    .line 160
    invoke-direct {p2, p4, v0}, Li2/i;-><init>(Ljava/lang/Object;I)V

    .line 161
    .line 162
    .line 163
    const/4 p4, 0x1

    .line 164
    invoke-virtual {p3, p4, p2}, Li2/W;->D(ZLi2/S;)Li2/B;

    .line 165
    .line 166
    .line 167
    :cond_0
    iput-object p1, p0, LV/N;->v:LB1/s;

    .line 168
    .line 169
    return-void
.end method

.method public static final a(LV/N;LT1/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, LV/t;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, LV/t;

    .line 7
    .line 8
    iget v1, v0, LV/t;->r:I

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
    iput v1, v0, LV/t;->r:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LV/t;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, LV/t;-><init>(LV/N;LT1/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, LV/t;->p:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, LV/t;->r:I

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
    iget-object p0, v0, LV/t;->o:Lq2/c;

    .line 35
    .line 36
    iget-object v0, v0, LV/t;->n:LV/N;

    .line 37
    .line 38
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    move-object p1, p0

    .line 42
    move-object p0, v0

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p0

    .line 52
    :cond_2
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, LV/N;->o:Lq2/c;

    .line 56
    .line 57
    iput-object p0, v0, LV/t;->n:LV/N;

    .line 58
    .line 59
    iput-object p1, v0, LV/t;->o:Lq2/c;

    .line 60
    .line 61
    iput v2, v0, LV/t;->r:I

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Lq2/c;->c(LT1/c;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    sget-object v1, LS1/a;->k:LS1/a;

    .line 68
    .line 69
    if-ne v0, v1, :cond_3

    .line 70
    .line 71
    return-object v1

    .line 72
    :cond_3
    :goto_1
    const/4 v0, 0x0

    .line 73
    :try_start_0
    iget v1, p0, LV/N;->p:I

    .line 74
    .line 75
    add-int/lit8 v1, v1, -0x1

    .line 76
    .line 77
    iput v1, p0, LV/N;->p:I

    .line 78
    .line 79
    if-nez v1, :cond_5

    .line 80
    .line 81
    iget-object v1, p0, LV/N;->q:Li2/b0;

    .line 82
    .line 83
    if-eqz v1, :cond_4

    .line 84
    .line 85
    invoke-virtual {v1, v0}, Li2/W;->b(Ljava/util/concurrent/CancellationException;)V

    .line 86
    .line 87
    .line 88
    goto :goto_2

    .line 89
    :catchall_0
    move-exception p0

    .line 90
    goto :goto_3

    .line 91
    :cond_4
    :goto_2
    iput-object v0, p0, LV/N;->q:Li2/b0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    .line 93
    :cond_5
    invoke-virtual {p1, v0}, Lq2/c;->e(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    sget-object p0, LO1/g;->a:LO1/g;

    .line 97
    .line 98
    return-object p0

    .line 99
    :goto_3
    invoke-virtual {p1, v0}, Lq2/c;->e(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    throw p0
.end method

.method public static final b(LV/N;LV/a0;LT1/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, LV/v;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LV/v;

    .line 7
    .line 8
    iget v1, v0, LV/v;->s:I

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
    iput v1, v0, LV/v;->s:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LV/v;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, LV/v;-><init>(LV/N;LT1/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LV/v;->q:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, LV/v;->s:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x3

    .line 31
    const/4 v4, 0x2

    .line 32
    const/4 v5, 0x1

    .line 33
    sget-object v6, LS1/a;->k:LS1/a;

    .line 34
    .line 35
    if-eqz v1, :cond_4

    .line 36
    .line 37
    if-eq v1, v5, :cond_3

    .line 38
    .line 39
    if-eq v1, v4, :cond_2

    .line 40
    .line 41
    if-ne v1, v3, :cond_1

    .line 42
    .line 43
    iget-object p0, v0, LV/v;->n:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p0, Li2/l;

    .line 46
    .line 47
    :goto_1
    :try_start_0
    invoke-static {p2}, LH2/h;->E(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    goto/16 :goto_8

    .line 51
    .line 52
    :catchall_0
    move-exception p1

    .line 53
    goto/16 :goto_7

    .line 54
    .line 55
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p0

    .line 63
    :cond_2
    iget-object p0, v0, LV/v;->p:Li2/m;

    .line 64
    .line 65
    iget-object p1, v0, LV/v;->o:LV/N;

    .line 66
    .line 67
    iget-object v1, v0, LV/v;->n:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v1, LV/a0;

    .line 70
    .line 71
    :try_start_1
    invoke-static {p2}, LH2/h;->E(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    .line 73
    .line 74
    move-object p2, p0

    .line 75
    move-object p0, p1

    .line 76
    move-object p1, v1

    .line 77
    goto :goto_5

    .line 78
    :cond_3
    iget-object p0, v0, LV/v;->n:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast p0, Li2/l;

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_4
    invoke-static {p2}, LH2/h;->E(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    iget-object p2, p1, LV/a0;->b:Li2/m;

    .line 87
    .line 88
    :try_start_2
    iget-object v1, p0, LV/N;->r:LB1/a;

    .line 89
    .line 90
    invoke-virtual {v1}, LB1/a;->g()LV/j0;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    instance-of v7, v1, LV/c;

    .line 95
    .line 96
    if-eqz v7, :cond_6

    .line 97
    .line 98
    iget-object v1, p1, LV/a0;->a:LT1/h;

    .line 99
    .line 100
    iget-object p1, p1, LV/a0;->d:LR1/h;

    .line 101
    .line 102
    iput-object p2, v0, LV/v;->n:Ljava/lang/Object;

    .line 103
    .line 104
    iput v5, v0, LV/v;->s:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 105
    .line 106
    :try_start_3
    invoke-virtual {p0}, LV/N;->g()LV/i0;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    new-instance v4, LV/F;

    .line 111
    .line 112
    invoke-direct {v4, p0, p1, v1, v2}, LV/F;-><init>(LV/N;LR1/h;LZ1/p;LR1/c;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v3, v4, v0}, LV/i0;->b(LZ1/l;LT1/c;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 119
    if-ne p0, v6, :cond_5

    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_5
    move-object v8, p2

    .line 123
    move-object p2, p0

    .line 124
    move-object p0, v8

    .line 125
    goto :goto_8

    .line 126
    :goto_2
    move-object p1, p0

    .line 127
    goto :goto_3

    .line 128
    :catchall_1
    move-exception p0

    .line 129
    goto :goto_2

    .line 130
    :goto_3
    move-object p0, p2

    .line 131
    goto :goto_7

    .line 132
    :catchall_2
    move-exception p1

    .line 133
    goto :goto_3

    .line 134
    :cond_6
    :try_start_4
    instance-of v7, v1, LV/b0;

    .line 135
    .line 136
    if-eqz v7, :cond_7

    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_7
    instance-of v5, v1, LV/k0;

    .line 140
    .line 141
    :goto_4
    if-eqz v5, :cond_a

    .line 142
    .line 143
    iget-object v5, p1, LV/a0;->c:LV/j0;

    .line 144
    .line 145
    if-ne v1, v5, :cond_9

    .line 146
    .line 147
    iput-object p1, v0, LV/v;->n:Ljava/lang/Object;

    .line 148
    .line 149
    iput-object p0, v0, LV/v;->o:LV/N;

    .line 150
    .line 151
    iput-object p2, v0, LV/v;->p:Li2/m;

    .line 152
    .line 153
    iput v4, v0, LV/v;->s:I

    .line 154
    .line 155
    invoke-virtual {p0, v0}, LV/N;->h(LT1/c;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    if-ne v1, v6, :cond_8

    .line 160
    .line 161
    goto :goto_6

    .line 162
    :cond_8
    :goto_5
    iget-object v1, p1, LV/a0;->a:LT1/h;

    .line 163
    .line 164
    iget-object p1, p1, LV/a0;->d:LR1/h;

    .line 165
    .line 166
    iput-object p2, v0, LV/v;->n:Ljava/lang/Object;

    .line 167
    .line 168
    iput-object v2, v0, LV/v;->o:LV/N;

    .line 169
    .line 170
    iput-object v2, v0, LV/v;->p:Li2/m;

    .line 171
    .line 172
    iput v3, v0, LV/v;->s:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 173
    .line 174
    :try_start_5
    invoke-virtual {p0}, LV/N;->g()LV/i0;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    new-instance v4, LV/F;

    .line 179
    .line 180
    invoke-direct {v4, p0, p1, v1, v2}, LV/F;-><init>(LV/N;LR1/h;LZ1/p;LR1/c;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v3, v4, v0}, LV/i0;->b(LZ1/l;LT1/c;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 187
    if-ne p0, v6, :cond_5

    .line 188
    .line 189
    :goto_6
    return-object v6

    .line 190
    :catchall_3
    move-exception p0

    .line 191
    goto :goto_2

    .line 192
    :cond_9
    :try_start_6
    const-string p0, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$2>"

    .line 193
    .line 194
    invoke-static {v1, p0}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    check-cast v1, LV/b0;

    .line 198
    .line 199
    iget-object p0, v1, LV/b0;->b:Ljava/lang/Throwable;

    .line 200
    .line 201
    throw p0

    .line 202
    :cond_a
    instance-of p0, v1, LV/Z;

    .line 203
    .line 204
    if-eqz p0, :cond_b

    .line 205
    .line 206
    check-cast v1, LV/Z;

    .line 207
    .line 208
    iget-object p0, v1, LV/Z;->b:Ljava/lang/Throwable;

    .line 209
    .line 210
    throw p0

    .line 211
    :cond_b
    new-instance p0, LD0/a;

    .line 212
    .line 213
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 214
    .line 215
    .line 216
    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 217
    :goto_7
    invoke-static {p1}, LH2/h;->i(Ljava/lang/Throwable;)LO1/c;

    .line 218
    .line 219
    .line 220
    move-result-object p2

    .line 221
    :goto_8
    invoke-static {p2}, LO1/d;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    check-cast p0, Li2/m;

    .line 226
    .line 227
    if-nez p1, :cond_c

    .line 228
    .line 229
    invoke-virtual {p0, p2}, Li2/W;->F(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    goto :goto_9

    .line 233
    :cond_c
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    new-instance p2, Li2/o;

    .line 237
    .line 238
    const/4 v0, 0x0

    .line 239
    invoke-direct {p2, p1, v0}, Li2/o;-><init>(Ljava/lang/Throwable;Z)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {p0, p2}, Li2/W;->F(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    :goto_9
    sget-object p0, LO1/g;->a:LO1/g;

    .line 246
    .line 247
    return-object p0
.end method

.method public static final c(LV/N;LT1/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, LV/w;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, LV/w;

    .line 7
    .line 8
    iget v1, v0, LV/w;->r:I

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
    iput v1, v0, LV/w;->r:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LV/w;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, LV/w;-><init>(LV/N;LT1/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, LV/w;->p:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, LV/w;->r:I

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
    iget-object p0, v0, LV/w;->o:Lq2/c;

    .line 35
    .line 36
    iget-object v0, v0, LV/w;->n:LV/N;

    .line 37
    .line 38
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    move-object p1, p0

    .line 42
    move-object p0, v0

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p0

    .line 52
    :cond_2
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, LV/N;->o:Lq2/c;

    .line 56
    .line 57
    iput-object p0, v0, LV/w;->n:LV/N;

    .line 58
    .line 59
    iput-object p1, v0, LV/w;->o:Lq2/c;

    .line 60
    .line 61
    iput v2, v0, LV/w;->r:I

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Lq2/c;->c(LT1/c;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    sget-object v1, LS1/a;->k:LS1/a;

    .line 68
    .line 69
    if-ne v0, v1, :cond_3

    .line 70
    .line 71
    return-object v1

    .line 72
    :cond_3
    :goto_1
    const/4 v0, 0x0

    .line 73
    :try_start_0
    iget v1, p0, LV/N;->p:I

    .line 74
    .line 75
    add-int/2addr v1, v2

    .line 76
    iput v1, p0, LV/N;->p:I

    .line 77
    .line 78
    if-ne v1, v2, :cond_4

    .line 79
    .line 80
    iget-object v1, p0, LV/N;->m:Li2/s;

    .line 81
    .line 82
    new-instance v2, LV/y;

    .line 83
    .line 84
    invoke-direct {v2, p0, v0}, LV/y;-><init>(LV/N;LR1/c;)V

    .line 85
    .line 86
    .line 87
    invoke-static {v1, v2}, Li2/u;->g(Li2/s;LZ1/p;)Li2/b0;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    iput-object v1, p0, LV/N;->q:Li2/b0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :catchall_0
    move-exception p0

    .line 95
    goto :goto_3

    .line 96
    :cond_4
    :goto_2
    invoke-virtual {p1, v0}, Lq2/c;->e(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    sget-object p0, LO1/g;->a:LO1/g;

    .line 100
    .line 101
    return-object p0

    .line 102
    :goto_3
    invoke-virtual {p1, v0}, Lq2/c;->e(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    throw p0
.end method

.method public static final e(LV/N;ZLR1/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, LV/A;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LV/A;

    .line 7
    .line 8
    iget v1, v0, LV/A;->s:I

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
    iput v1, v0, LV/A;->s:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LV/A;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, LV/A;-><init>(LV/N;LR1/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LV/A;->q:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, LV/A;->s:I

    .line 28
    .line 29
    const/4 v2, 0x3

    .line 30
    const/4 v3, 0x2

    .line 31
    const/4 v4, 0x1

    .line 32
    sget-object v5, LS1/a;->k:LS1/a;

    .line 33
    .line 34
    if-eqz v1, :cond_4

    .line 35
    .line 36
    if-eq v1, v4, :cond_3

    .line 37
    .line 38
    if-eq v1, v3, :cond_2

    .line 39
    .line 40
    if-ne v1, v2, :cond_1

    .line 41
    .line 42
    iget-object p0, v0, LV/A;->n:LV/N;

    .line 43
    .line 44
    invoke-static {p2}, LH2/h;->E(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto/16 :goto_5

    .line 48
    .line 49
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p0

    .line 57
    :cond_2
    iget-object p0, v0, LV/A;->n:LV/N;

    .line 58
    .line 59
    invoke-static {p2}, LH2/h;->E(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_3
    iget-boolean p1, v0, LV/A;->p:Z

    .line 64
    .line 65
    iget-object p0, v0, LV/A;->o:LV/j0;

    .line 66
    .line 67
    iget-object v1, v0, LV/A;->n:LV/N;

    .line 68
    .line 69
    invoke-static {p2}, LH2/h;->E(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    invoke-static {p2}, LH2/h;->E(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iget-object p2, p0, LV/N;->r:LB1/a;

    .line 77
    .line 78
    invoke-virtual {p2}, LB1/a;->g()LV/j0;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    instance-of v1, p2, LV/k0;

    .line 83
    .line 84
    if-nez v1, :cond_c

    .line 85
    .line 86
    invoke-virtual {p0}, LV/N;->g()LV/i0;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    iput-object p0, v0, LV/A;->n:LV/N;

    .line 91
    .line 92
    iput-object p2, v0, LV/A;->o:LV/j0;

    .line 93
    .line 94
    iput-boolean p1, v0, LV/A;->p:Z

    .line 95
    .line 96
    iput v4, v0, LV/A;->s:I

    .line 97
    .line 98
    invoke-virtual {v1}, LV/i0;->a()Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    if-ne v1, v5, :cond_5

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_5
    move-object v7, v1

    .line 106
    move-object v1, p0

    .line 107
    move-object p0, p2

    .line 108
    move-object p2, v7

    .line 109
    :goto_1
    check-cast p2, Ljava/lang/Number;

    .line 110
    .line 111
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 112
    .line 113
    .line 114
    move-result p2

    .line 115
    instance-of v4, p0, LV/c;

    .line 116
    .line 117
    if-eqz v4, :cond_6

    .line 118
    .line 119
    iget v6, p0, LV/j0;->a:I

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_6
    const/4 v6, -0x1

    .line 123
    :goto_2
    if-eqz v4, :cond_7

    .line 124
    .line 125
    if-ne p2, v6, :cond_7

    .line 126
    .line 127
    return-object p0

    .line 128
    :cond_7
    const/4 p0, 0x0

    .line 129
    if-eqz p1, :cond_9

    .line 130
    .line 131
    invoke-virtual {v1}, LV/N;->g()LV/i0;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    new-instance p2, LV/B;

    .line 136
    .line 137
    invoke-direct {p2, v1, p0}, LV/B;-><init>(LV/N;LR1/c;)V

    .line 138
    .line 139
    .line 140
    iput-object v1, v0, LV/A;->n:LV/N;

    .line 141
    .line 142
    iput-object p0, v0, LV/A;->o:LV/j0;

    .line 143
    .line 144
    iput v3, v0, LV/A;->s:I

    .line 145
    .line 146
    invoke-virtual {p1, p2, v0}, LV/i0;->b(LZ1/l;LT1/c;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p2

    .line 150
    if-ne p2, v5, :cond_8

    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_8
    move-object p0, v1

    .line 154
    :goto_3
    check-cast p2, LO1/b;

    .line 155
    .line 156
    goto :goto_6

    .line 157
    :cond_9
    invoke-virtual {v1}, LV/N;->g()LV/i0;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    new-instance p2, LV/C;

    .line 162
    .line 163
    invoke-direct {p2, v1, v6, p0}, LV/C;-><init>(LV/N;ILR1/c;)V

    .line 164
    .line 165
    .line 166
    iput-object v1, v0, LV/A;->n:LV/N;

    .line 167
    .line 168
    iput-object p0, v0, LV/A;->o:LV/j0;

    .line 169
    .line 170
    iput v2, v0, LV/A;->s:I

    .line 171
    .line 172
    invoke-virtual {p1, p2, v0}, LV/i0;->c(LZ1/p;LT1/c;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p2

    .line 176
    if-ne p2, v5, :cond_a

    .line 177
    .line 178
    :goto_4
    return-object v5

    .line 179
    :cond_a
    move-object p0, v1

    .line 180
    :goto_5
    check-cast p2, LO1/b;

    .line 181
    .line 182
    :goto_6
    iget-object p1, p2, LO1/b;->k:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast p1, LV/j0;

    .line 185
    .line 186
    iget-object p2, p2, LO1/b;->l:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast p2, Ljava/lang/Boolean;

    .line 189
    .line 190
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 191
    .line 192
    .line 193
    move-result p2

    .line 194
    if-eqz p2, :cond_b

    .line 195
    .line 196
    iget-object p0, p0, LV/N;->r:LB1/a;

    .line 197
    .line 198
    invoke-virtual {p0, p1}, LB1/a;->m(LV/j0;)V

    .line 199
    .line 200
    .line 201
    :cond_b
    return-object p1

    .line 202
    :cond_c
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 203
    .line 204
    const-string p1, "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"

    .line 205
    .line 206
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    throw p0
.end method

.method public static final f(LV/N;ZLT1/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, LV/D;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LV/D;

    .line 7
    .line 8
    iget v1, v0, LV/D;->v:I

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
    iput v1, v0, LV/D;->v:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LV/D;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, LV/D;-><init>(LV/N;LT1/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LV/D;->t:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, LV/D;->v:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x0

    .line 31
    sget-object v4, LS1/a;->k:LS1/a;

    .line 32
    .line 33
    packed-switch v1, :pswitch_data_0

    .line 34
    .line 35
    .line 36
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 37
    .line 38
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p0

    .line 44
    :pswitch_0
    iget-object p0, v0, LV/D;->p:Ljava/io/Serializable;

    .line 45
    .line 46
    check-cast p0, La2/n;

    .line 47
    .line 48
    iget-object p1, v0, LV/D;->o:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p1, La2/o;

    .line 51
    .line 52
    iget-object v0, v0, LV/D;->n:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, LV/b;

    .line 55
    .line 56
    :try_start_0
    invoke-static {p2}, LH2/h;->E(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :catchall_0
    move-exception p0

    .line 61
    goto :goto_4

    .line 62
    :pswitch_1
    iget-boolean p0, v0, LV/D;->r:Z

    .line 63
    .line 64
    iget-object p1, v0, LV/D;->q:La2/o;

    .line 65
    .line 66
    iget-object v1, v0, LV/D;->p:Ljava/io/Serializable;

    .line 67
    .line 68
    check-cast v1, La2/o;

    .line 69
    .line 70
    iget-object v5, v0, LV/D;->o:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v5, LV/b;

    .line 73
    .line 74
    iget-object v6, v0, LV/D;->n:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v6, LV/N;

    .line 77
    .line 78
    invoke-static {p2}, LH2/h;->E(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    iput-object p2, p1, La2/o;->k:Ljava/lang/Object;

    .line 82
    .line 83
    new-instance p1, La2/n;

    .line 84
    .line 85
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 86
    .line 87
    .line 88
    :try_start_1
    new-instance p2, LV/F;

    .line 89
    .line 90
    invoke-direct {p2, v1, v6, p1, v3}, LV/F;-><init>(La2/o;LV/N;La2/n;LR1/c;)V

    .line 91
    .line 92
    .line 93
    iput-object v5, v0, LV/D;->n:Ljava/lang/Object;

    .line 94
    .line 95
    iput-object v1, v0, LV/D;->o:Ljava/lang/Object;

    .line 96
    .line 97
    iput-object p1, v0, LV/D;->p:Ljava/io/Serializable;

    .line 98
    .line 99
    iput-object v3, v0, LV/D;->q:La2/o;

    .line 100
    .line 101
    const/4 v7, 0x6

    .line 102
    iput v7, v0, LV/D;->v:I

    .line 103
    .line 104
    if-eqz p0, :cond_1

    .line 105
    .line 106
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p2, v0}, LV/F;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    goto :goto_1

    .line 114
    :cond_1
    invoke-virtual {v6}, LV/N;->g()LV/i0;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    new-instance v6, LV/u;

    .line 119
    .line 120
    invoke-direct {v6, p2, v3}, LV/u;-><init>(LV/F;LR1/c;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, v6, v0}, LV/i0;->b(LZ1/l;LT1/c;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 127
    :goto_1
    if-ne p0, v4, :cond_2

    .line 128
    .line 129
    goto/16 :goto_8

    .line 130
    .line 131
    :cond_2
    move-object p0, p1

    .line 132
    move-object p1, v1

    .line 133
    :goto_2
    new-instance p2, LV/c;

    .line 134
    .line 135
    iget-object p1, p1, La2/o;->k:Ljava/lang/Object;

    .line 136
    .line 137
    if-eqz p1, :cond_3

    .line 138
    .line 139
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    :cond_3
    iget p0, p0, La2/n;->k:I

    .line 144
    .line 145
    invoke-direct {p2, p1, v2, p0}, LV/c;-><init>(Ljava/lang/Object;II)V

    .line 146
    .line 147
    .line 148
    return-object p2

    .line 149
    :goto_3
    move-object v0, v5

    .line 150
    goto :goto_4

    .line 151
    :catchall_1
    move-exception p0

    .line 152
    goto :goto_3

    .line 153
    :goto_4
    invoke-static {v0, p0}, LE2/a;->b(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 154
    .line 155
    .line 156
    throw v0

    .line 157
    :pswitch_2
    iget-boolean p1, v0, LV/D;->r:Z

    .line 158
    .line 159
    iget-object p0, v0, LV/D;->n:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast p0, LV/N;

    .line 162
    .line 163
    :try_start_2
    invoke-static {p2}, LH2/h;->E(Ljava/lang/Object;)V
    :try_end_2
    .catch LV/b; {:try_start_2 .. :try_end_2} :catch_0

    .line 164
    .line 165
    .line 166
    goto/16 :goto_9

    .line 167
    .line 168
    :catch_0
    move-exception p2

    .line 169
    goto/16 :goto_a

    .line 170
    .line 171
    :pswitch_3
    iget-boolean p1, v0, LV/D;->r:Z

    .line 172
    .line 173
    iget-object p0, v0, LV/D;->n:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast p0, LV/N;

    .line 176
    .line 177
    :try_start_3
    invoke-static {p2}, LH2/h;->E(Ljava/lang/Object;)V
    :try_end_3
    .catch LV/b; {:try_start_3 .. :try_end_3} :catch_0

    .line 178
    .line 179
    .line 180
    goto/16 :goto_7

    .line 181
    .line 182
    :pswitch_4
    iget p0, v0, LV/D;->s:I

    .line 183
    .line 184
    iget-boolean p1, v0, LV/D;->r:Z

    .line 185
    .line 186
    iget-object v1, v0, LV/D;->o:Ljava/lang/Object;

    .line 187
    .line 188
    iget-object v2, v0, LV/D;->n:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v2, LV/N;

    .line 191
    .line 192
    :try_start_4
    invoke-static {p2}, LH2/h;->E(Ljava/lang/Object;)V
    :try_end_4
    .catch LV/b; {:try_start_4 .. :try_end_4} :catch_1

    .line 193
    .line 194
    .line 195
    goto :goto_6

    .line 196
    :catch_1
    move-exception p2

    .line 197
    move-object p0, v2

    .line 198
    goto/16 :goto_a

    .line 199
    .line 200
    :pswitch_5
    iget-boolean p1, v0, LV/D;->r:Z

    .line 201
    .line 202
    iget-object p0, v0, LV/D;->n:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast p0, LV/N;

    .line 205
    .line 206
    :try_start_5
    invoke-static {p2}, LH2/h;->E(Ljava/lang/Object;)V
    :try_end_5
    .catch LV/b; {:try_start_5 .. :try_end_5} :catch_0

    .line 207
    .line 208
    .line 209
    goto :goto_5

    .line 210
    :pswitch_6
    invoke-static {p2}, LH2/h;->E(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    if-eqz p1, :cond_7

    .line 214
    .line 215
    :try_start_6
    iput-object p0, v0, LV/D;->n:Ljava/lang/Object;

    .line 216
    .line 217
    iput-boolean p1, v0, LV/D;->r:Z

    .line 218
    .line 219
    const/4 p2, 0x1

    .line 220
    iput p2, v0, LV/D;->v:I

    .line 221
    .line 222
    invoke-virtual {p0, v0}, LV/N;->i(LT1/c;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p2

    .line 226
    if-ne p2, v4, :cond_4

    .line 227
    .line 228
    goto :goto_8

    .line 229
    :cond_4
    :goto_5
    if-eqz p2, :cond_5

    .line 230
    .line 231
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    .line 232
    .line 233
    .line 234
    move-result v2

    .line 235
    :cond_5
    invoke-virtual {p0}, LV/N;->g()LV/i0;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    iput-object p0, v0, LV/D;->n:Ljava/lang/Object;

    .line 240
    .line 241
    iput-object p2, v0, LV/D;->o:Ljava/lang/Object;

    .line 242
    .line 243
    iput-boolean p1, v0, LV/D;->r:Z

    .line 244
    .line 245
    iput v2, v0, LV/D;->s:I

    .line 246
    .line 247
    const/4 v3, 0x2

    .line 248
    iput v3, v0, LV/D;->v:I

    .line 249
    .line 250
    invoke-virtual {v1}, LV/i0;->a()Ljava/lang/Integer;

    .line 251
    .line 252
    .line 253
    move-result-object v1
    :try_end_6
    .catch LV/b; {:try_start_6 .. :try_end_6} :catch_0

    .line 254
    if-ne v1, v4, :cond_6

    .line 255
    .line 256
    goto :goto_8

    .line 257
    :cond_6
    move v8, v2

    .line 258
    move-object v2, p0

    .line 259
    move p0, v8

    .line 260
    move-object v8, v1

    .line 261
    move-object v1, p2

    .line 262
    move-object p2, v8

    .line 263
    :goto_6
    :try_start_7
    check-cast p2, Ljava/lang/Number;

    .line 264
    .line 265
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 266
    .line 267
    .line 268
    move-result p2

    .line 269
    new-instance v3, LV/c;

    .line 270
    .line 271
    invoke-direct {v3, v1, p0, p2}, LV/c;-><init>(Ljava/lang/Object;II)V
    :try_end_7
    .catch LV/b; {:try_start_7 .. :try_end_7} :catch_1

    .line 272
    .line 273
    .line 274
    return-object v3

    .line 275
    :cond_7
    :try_start_8
    invoke-virtual {p0}, LV/N;->g()LV/i0;

    .line 276
    .line 277
    .line 278
    move-result-object p2

    .line 279
    iput-object p0, v0, LV/D;->n:Ljava/lang/Object;

    .line 280
    .line 281
    iput-boolean p1, v0, LV/D;->r:Z

    .line 282
    .line 283
    const/4 v1, 0x3

    .line 284
    iput v1, v0, LV/D;->v:I

    .line 285
    .line 286
    invoke-virtual {p2}, LV/i0;->a()Ljava/lang/Integer;

    .line 287
    .line 288
    .line 289
    move-result-object p2

    .line 290
    if-ne p2, v4, :cond_8

    .line 291
    .line 292
    goto :goto_8

    .line 293
    :cond_8
    :goto_7
    check-cast p2, Ljava/lang/Number;

    .line 294
    .line 295
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 296
    .line 297
    .line 298
    move-result p2

    .line 299
    invoke-virtual {p0}, LV/N;->g()LV/i0;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    new-instance v2, LV/E;

    .line 304
    .line 305
    invoke-direct {v2, p0, p2, v3}, LV/E;-><init>(LV/N;ILR1/c;)V

    .line 306
    .line 307
    .line 308
    iput-object p0, v0, LV/D;->n:Ljava/lang/Object;

    .line 309
    .line 310
    iput-boolean p1, v0, LV/D;->r:Z

    .line 311
    .line 312
    const/4 p2, 0x4

    .line 313
    iput p2, v0, LV/D;->v:I

    .line 314
    .line 315
    invoke-virtual {v1, v2, v0}, LV/i0;->c(LZ1/p;LT1/c;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object p2

    .line 319
    if-ne p2, v4, :cond_9

    .line 320
    .line 321
    :goto_8
    return-object v4

    .line 322
    :cond_9
    :goto_9
    check-cast p2, LV/c;
    :try_end_8
    .catch LV/b; {:try_start_8 .. :try_end_8} :catch_0

    .line 323
    .line 324
    return-object p2

    .line 325
    :goto_a
    new-instance v1, La2/o;

    .line 326
    .line 327
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 328
    .line 329
    .line 330
    iget-object v2, p0, LV/N;->l:LM1/A;

    .line 331
    .line 332
    iput-object p0, v0, LV/D;->n:Ljava/lang/Object;

    .line 333
    .line 334
    iput-object p2, v0, LV/D;->o:Ljava/lang/Object;

    .line 335
    .line 336
    iput-object v1, v0, LV/D;->p:Ljava/io/Serializable;

    .line 337
    .line 338
    iput-object v1, v0, LV/D;->q:La2/o;

    .line 339
    .line 340
    iput-boolean p1, v0, LV/D;->r:Z

    .line 341
    .line 342
    const/4 p0, 0x5

    .line 343
    iput p0, v0, LV/D;->v:I

    .line 344
    .line 345
    throw p2

    .line 346
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final d(LZ1/p;LT1/h;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p2, LT1/c;->l:LR1/h;

    .line 2
    .line 3
    invoke-static {v0}, La2/h;->b(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, LV/m0;->k:LV/m0;

    .line 7
    .line 8
    invoke-interface {v0, v1}, LR1/h;->e(LR1/g;)LR1/f;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, LV/n0;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0, p0}, LV/n0;->c(LV/N;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    new-instance v1, LV/n0;

    .line 20
    .line 21
    invoke-direct {v1, v0, p0}, LV/n0;-><init>(LV/n0;LV/N;)V

    .line 22
    .line 23
    .line 24
    new-instance v0, LV/I;

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-direct {v0, p0, p1, v2}, LV/I;-><init>(LV/N;LZ1/p;LR1/c;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v0, p2}, Li2/u;->n(LR1/h;LZ1/p;LT1/h;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1
.end method

.method public final g()LV/i0;
    .locals 1

    .line 1
    iget-object v0, p0, LV/N;->u:LO1/e;

    .line 2
    .line 3
    invoke-virtual {v0}, LO1/e;->a()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LV/i0;

    .line 8
    .line 9
    return-object v0
.end method

.method public final getData()Ll2/d;
    .locals 1

    .line 1
    iget-object v0, p0, LV/N;->n:LB1/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h(LT1/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, LV/z;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, LV/z;

    .line 7
    .line 8
    iget v1, v0, LV/z;->r:I

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
    iput v1, v0, LV/z;->r:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LV/z;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, LV/z;-><init>(LV/N;LT1/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, LV/z;->p:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, LV/z;->r:I

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    const/4 v3, 0x1

    .line 31
    sget-object v4, LS1/a;->k:LS1/a;

    .line 32
    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    if-eq v1, v3, :cond_2

    .line 36
    .line 37
    if-ne v1, v2, :cond_1

    .line 38
    .line 39
    iget v1, v0, LV/z;->o:I

    .line 40
    .line 41
    iget-object v0, v0, LV/z;->n:LV/N;

    .line 42
    .line 43
    :try_start_0
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    goto :goto_3

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    goto :goto_4

    .line 49
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :cond_2
    iget-object v1, v0, LV/z;->n:LV/N;

    .line 58
    .line 59
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, LV/N;->g()LV/i0;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iput-object p0, v0, LV/z;->n:LV/N;

    .line 71
    .line 72
    iput v3, v0, LV/z;->r:I

    .line 73
    .line 74
    invoke-virtual {p1}, LV/i0;->a()Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    if-ne p1, v4, :cond_4

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_4
    move-object v1, p0

    .line 82
    :goto_1
    check-cast p1, Ljava/lang/Number;

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    :try_start_1
    iget-object v3, v1, LV/N;->s:LB1/s;

    .line 89
    .line 90
    iput-object v1, v0, LV/z;->n:LV/N;

    .line 91
    .line 92
    iput p1, v0, LV/z;->o:I

    .line 93
    .line 94
    iput v2, v0, LV/z;->r:I

    .line 95
    .line 96
    invoke-virtual {v3, v0}, LB1/s;->w(LT1/c;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 100
    if-ne p1, v4, :cond_5

    .line 101
    .line 102
    :goto_2
    return-object v4

    .line 103
    :cond_5
    :goto_3
    sget-object p1, LO1/g;->a:LO1/g;

    .line 104
    .line 105
    return-object p1

    .line 106
    :catchall_1
    move-exception v0

    .line 107
    move-object v5, v1

    .line 108
    move v1, p1

    .line 109
    move-object p1, v0

    .line 110
    move-object v0, v5

    .line 111
    :goto_4
    iget-object v0, v0, LV/N;->r:LB1/a;

    .line 112
    .line 113
    new-instance v2, LV/b0;

    .line 114
    .line 115
    invoke-direct {v2, p1, v1}, LV/b0;-><init>(Ljava/lang/Throwable;I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v2}, LB1/a;->m(LV/j0;)V

    .line 119
    .line 120
    .line 121
    throw p1
.end method

.method public final i(LT1/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, LV/N;->t:LO1/e;

    .line 2
    .line 3
    invoke-virtual {v0}, LO1/e;->a()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LV/W;

    .line 8
    .line 9
    new-instance v1, LV/q;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x3

    .line 13
    invoke-direct {v1, v3, v2}, LV/q;-><init>(ILR1/c;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1, p1}, LV/W;->a(LV/q;LT1/c;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public final j(Ljava/lang/Object;ZLT1/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p3, LV/L;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, LV/L;

    .line 7
    .line 8
    iget v1, v0, LV/L;->q:I

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
    iput v1, v0, LV/L;->q:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LV/L;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, LV/L;-><init>(LV/N;LT1/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, LV/L;->o:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, LV/L;->q:I

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
    iget-object p1, v0, LV/L;->n:La2/n;

    .line 35
    .line 36
    invoke-static {p3}, LH2/h;->E(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_2
    invoke-static {p3}, LH2/h;->E(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    new-instance v4, La2/n;

    .line 52
    .line 53
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 54
    .line 55
    .line 56
    iget-object p3, p0, LV/N;->t:LO1/e;

    .line 57
    .line 58
    invoke-virtual {p3}, LO1/e;->a()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p3

    .line 62
    check-cast p3, LV/W;

    .line 63
    .line 64
    new-instance v3, LV/M;

    .line 65
    .line 66
    const/4 v8, 0x0

    .line 67
    move-object v5, p0

    .line 68
    move-object v6, p1

    .line 69
    move v7, p2

    .line 70
    invoke-direct/range {v3 .. v8}, LV/M;-><init>(La2/n;LV/N;Ljava/lang/Object;ZLR1/c;)V

    .line 71
    .line 72
    .line 73
    iput-object v4, v0, LV/L;->n:La2/n;

    .line 74
    .line 75
    iput v2, v0, LV/L;->q:I

    .line 76
    .line 77
    invoke-virtual {p3, v3, v0}, LV/W;->b(LV/M;LT1/c;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    sget-object p2, LS1/a;->k:LS1/a;

    .line 82
    .line 83
    if-ne p1, p2, :cond_3

    .line 84
    .line 85
    return-object p2

    .line 86
    :cond_3
    move-object p1, v4

    .line 87
    :goto_1
    iget p1, p1, La2/n;->k:I

    .line 88
    .line 89
    new-instance p2, Ljava/lang/Integer;

    .line 90
    .line 91
    invoke-direct {p2, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 92
    .line 93
    .line 94
    return-object p2
.end method

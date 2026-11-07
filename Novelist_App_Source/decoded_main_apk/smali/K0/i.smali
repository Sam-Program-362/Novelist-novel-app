.class public abstract LK0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:LA/c;

.field public final d:LK0/b;

.field public final e:LL0/a;

.field public final f:Landroid/os/Looper;

.field public final g:I

.field public final h:LL0/s;

.field public final i:LB1/b;

.field public final j:LL0/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;LA/c;LK0/b;LK0/h;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "Null context is not permitted."

    .line 5
    .line 6
    invoke-static {p1, v0}, LM0/r;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-string v0, "Api must not be null."

    .line 10
    .line 11
    invoke-static {p2, v0}, LM0/r;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead."

    .line 15
    .line 16
    invoke-static {p4, v0}, LM0/r;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "The provided context did not have an application context."

    .line 24
    .line 25
    invoke-static {v0, v1}, LM0/r;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, LK0/i;->a:Landroid/content/Context;

    .line 29
    .line 30
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 31
    .line 32
    const/16 v2, 0x1e

    .line 33
    .line 34
    if-lt v1, v2, :cond_0

    .line 35
    .line 36
    invoke-static {p1}, LB0/a;->k(Landroid/content/Context;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const/4 p1, 0x0

    .line 42
    :goto_0
    iput-object p1, p0, LK0/i;->b:Ljava/lang/String;

    .line 43
    .line 44
    iput-object p2, p0, LK0/i;->c:LA/c;

    .line 45
    .line 46
    iput-object p3, p0, LK0/i;->d:LK0/b;

    .line 47
    .line 48
    iget-object v1, p4, LK0/h;->b:Landroid/os/Looper;

    .line 49
    .line 50
    iput-object v1, p0, LK0/i;->f:Landroid/os/Looper;

    .line 51
    .line 52
    new-instance v1, LL0/a;

    .line 53
    .line 54
    invoke-direct {v1, p2, p3, p1}, LL0/a;-><init>(LA/c;LK0/b;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iput-object v1, p0, LK0/i;->e:LL0/a;

    .line 58
    .line 59
    new-instance p1, LL0/s;

    .line 60
    .line 61
    invoke-direct {p1, p0}, LL0/s;-><init>(LK0/i;)V

    .line 62
    .line 63
    .line 64
    iput-object p1, p0, LK0/i;->h:LL0/s;

    .line 65
    .line 66
    invoke-static {v0}, LL0/d;->f(Landroid/content/Context;)LL0/d;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iput-object p1, p0, LK0/i;->j:LL0/d;

    .line 71
    .line 72
    iget-object p2, p1, LL0/d;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 73
    .line 74
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    iput p2, p0, LK0/i;->g:I

    .line 79
    .line 80
    iget-object p2, p4, LK0/h;->a:LB1/b;

    .line 81
    .line 82
    iput-object p2, p0, LK0/i;->i:LB1/b;

    .line 83
    .line 84
    iget-object p1, p1, LL0/d;->m:LZ0/d;

    .line 85
    .line 86
    const/4 p2, 0x7

    .line 87
    invoke-virtual {p1, p2, p0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 92
    .line 93
    .line 94
    return-void
.end method


# virtual methods
.method public final a()LA0/j;
    .locals 4

    .line 1
    new-instance v0, LA0/j;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-direct {v0, v1}, LA0/j;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 9
    .line 10
    iget-object v2, v0, LA0/j;->l:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Lo/f;

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    new-instance v2, Lo/f;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-direct {v2, v3}, Lo/f;-><init>(I)V

    .line 20
    .line 21
    .line 22
    iput-object v2, v0, LA0/j;->l:Ljava/lang/Object;

    .line 23
    .line 24
    :cond_0
    iget-object v2, v0, LA0/j;->l:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, Lo/f;

    .line 27
    .line 28
    invoke-virtual {v2, v1}, Lo/f;->addAll(Ljava/util/Collection;)Z

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, LK0/i;->a:Landroid/content/Context;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    iput-object v2, v0, LA0/j;->n:Ljava/lang/Object;

    .line 42
    .line 43
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    iput-object v1, v0, LA0/j;->m:Ljava/lang/Object;

    .line 48
    .line 49
    return-object v0
.end method

.method public final b(ILL0/k;)Lg1/i;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    new-instance v2, Lg1/e;

    .line 6
    .line 7
    invoke-direct {v2}, Lg1/e;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v3, v2, Lg1/e;->a:Lg1/i;

    .line 11
    .line 12
    iget-object v4, v0, LK0/i;->i:LB1/b;

    .line 13
    .line 14
    iget-object v6, v0, LK0/i;->j:LL0/d;

    .line 15
    .line 16
    iget-object v13, v6, LL0/d;->m:LZ0/d;

    .line 17
    .line 18
    iget v7, v1, LL0/k;->c:I

    .line 19
    .line 20
    if-eqz v7, :cond_6

    .line 21
    .line 22
    iget-object v8, v0, LK0/i;->e:LL0/a;

    .line 23
    .line 24
    invoke-virtual {v6}, LL0/d;->b()Z

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-nez v5, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-static {}, LM0/h;->b()LM0/h;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    iget-object v5, v5, LM0/h;->a:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v5, LM0/i;

    .line 38
    .line 39
    const/4 v9, 0x1

    .line 40
    if-eqz v5, :cond_3

    .line 41
    .line 42
    iget-boolean v10, v5, LM0/i;->l:Z

    .line 43
    .line 44
    if-eqz v10, :cond_2

    .line 45
    .line 46
    iget-boolean v5, v5, LM0/i;->m:Z

    .line 47
    .line 48
    iget-object v10, v6, LL0/d;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 49
    .line 50
    invoke-virtual {v10, v8}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v10

    .line 54
    check-cast v10, LL0/p;

    .line 55
    .line 56
    if-eqz v10, :cond_1

    .line 57
    .line 58
    iget-object v11, v10, LL0/p;->b:LK0/c;

    .line 59
    .line 60
    instance-of v12, v11, Lcom/google/android/gms/common/internal/a;

    .line 61
    .line 62
    if-eqz v12, :cond_2

    .line 63
    .line 64
    check-cast v11, Lcom/google/android/gms/common/internal/a;

    .line 65
    .line 66
    iget-object v12, v11, Lcom/google/android/gms/common/internal/a;->u:LM0/z;

    .line 67
    .line 68
    if-eqz v12, :cond_1

    .line 69
    .line 70
    invoke-virtual {v11}, Lcom/google/android/gms/common/internal/a;->g()Z

    .line 71
    .line 72
    .line 73
    move-result v12

    .line 74
    if-nez v12, :cond_1

    .line 75
    .line 76
    invoke-static {v10, v11, v7}, LL0/v;->b(LL0/p;Lcom/google/android/gms/common/internal/a;I)LM0/d;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    if-eqz v5, :cond_2

    .line 81
    .line 82
    iget v11, v10, LL0/p;->l:I

    .line 83
    .line 84
    add-int/2addr v11, v9

    .line 85
    iput v11, v10, LL0/p;->l:I

    .line 86
    .line 87
    iget-boolean v9, v5, LM0/d;->m:Z

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_1
    move v9, v5

    .line 91
    goto :goto_1

    .line 92
    :cond_2
    :goto_0
    const/4 v5, 0x0

    .line 93
    goto :goto_3

    .line 94
    :cond_3
    :goto_1
    new-instance v5, LL0/v;

    .line 95
    .line 96
    const-wide/16 v10, 0x0

    .line 97
    .line 98
    if-eqz v9, :cond_4

    .line 99
    .line 100
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 101
    .line 102
    .line 103
    move-result-wide v14

    .line 104
    goto :goto_2

    .line 105
    :cond_4
    move-wide v14, v10

    .line 106
    :goto_2
    if-eqz v9, :cond_5

    .line 107
    .line 108
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 109
    .line 110
    .line 111
    move-result-wide v10

    .line 112
    :cond_5
    move-wide v11, v10

    .line 113
    move-wide v9, v14

    .line 114
    invoke-direct/range {v5 .. v12}, LL0/v;-><init>(LL0/d;ILL0/a;JJ)V

    .line 115
    .line 116
    .line 117
    :goto_3
    if-eqz v5, :cond_6

    .line 118
    .line 119
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    new-instance v7, LA/p;

    .line 123
    .line 124
    const/4 v8, 0x1

    .line 125
    invoke-direct {v7, v13, v8}, LA/p;-><init>(Landroid/os/Handler;I)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    new-instance v8, Lg1/g;

    .line 132
    .line 133
    invoke-direct {v8, v7, v5}, Lg1/g;-><init>(Ljava/util/concurrent/Executor;Lg1/b;)V

    .line 134
    .line 135
    .line 136
    iget-object v5, v3, Lg1/i;->d:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v5, Lg1/h;

    .line 139
    .line 140
    invoke-virtual {v5, v8}, Lg1/h;->e(Lg1/g;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v3}, Lg1/i;->f()V

    .line 144
    .line 145
    .line 146
    :cond_6
    new-instance v5, LL0/A;

    .line 147
    .line 148
    move/from16 v7, p1

    .line 149
    .line 150
    invoke-direct {v5, v7, v1, v2, v4}, LL0/A;-><init>(ILL0/k;Lg1/e;LB1/b;)V

    .line 151
    .line 152
    .line 153
    iget-object v1, v6, LL0/d;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 154
    .line 155
    new-instance v2, LL0/x;

    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    invoke-direct {v2, v5, v1, v0}, LL0/x;-><init>(LL0/C;ILK0/i;)V

    .line 162
    .line 163
    .line 164
    const/4 v1, 0x4

    .line 165
    invoke-virtual {v13, v1, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-virtual {v13, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 170
    .line 171
    .line 172
    return-object v3
.end method

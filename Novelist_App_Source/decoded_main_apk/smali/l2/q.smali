.class public final Ll2/q;
.super Lm2/b;
.source "SourceFile"

# interfaces
.implements Ll2/d;
.implements Ll2/e;
.implements Lm2/i;


# static fields
.field public static final synthetic o:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _state$volatile:Ljava/lang/Object;

.field public n:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, Ljava/lang/Object;

    .line 2
    .line 3
    const-string v1, "_state$volatile"

    .line 4
    .line 5
    const-class v2, Ll2/q;

    .line 6
    .line 7
    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Ll2/q;->o:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll2/q;->_state$volatile:Ljava/lang/Object;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, Ll2/q;->o:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lm2/k;->a:LB1/g;

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    :cond_0
    return-object v0
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lm2/k;->a:LB1/g;

    .line 4
    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0, p1}, Ll2/q;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Ll2/q;->o:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 3
    .line 4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-static {v1, p1}, La2/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    monitor-exit p0

    .line 18
    return v2

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto/16 :goto_5

    .line 21
    .line 22
    :cond_0
    :try_start_1
    invoke-static {v1, p2}, La2/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    const/4 v1, 0x1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    monitor-exit p0

    .line 30
    return v1

    .line 31
    :cond_1
    :try_start_2
    invoke-virtual {v0, p0, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget p1, p0, Ll2/q;->n:I

    .line 35
    .line 36
    and-int/lit8 p2, p1, 0x1

    .line 37
    .line 38
    if-nez p2, :cond_b

    .line 39
    .line 40
    add-int/2addr p1, v1

    .line 41
    iput p1, p0, Ll2/q;->n:I

    .line 42
    .line 43
    iget-object p2, p0, Lm2/b;->k:[Ll2/s;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 44
    .line 45
    monitor-exit p0

    .line 46
    :goto_0
    if-eqz p2, :cond_9

    .line 47
    .line 48
    array-length v0, p2

    .line 49
    move v3, v2

    .line 50
    :goto_1
    if-ge v3, v0, :cond_9

    .line 51
    .line 52
    aget-object v4, p2, v3

    .line 53
    .line 54
    if-eqz v4, :cond_8

    .line 55
    .line 56
    iget-object v4, v4, Ll2/s;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 57
    .line 58
    :goto_2
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    if-nez v5, :cond_2

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_2
    sget-object v6, Ll2/r;->b:LB1/g;

    .line 66
    .line 67
    if-ne v5, v6, :cond_3

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_3
    sget-object v7, Ll2/r;->a:LB1/g;

    .line 71
    .line 72
    if-ne v5, v7, :cond_6

    .line 73
    .line 74
    :cond_4
    invoke-virtual {v4, v5, v6}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    if-eqz v7, :cond_5

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_5
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    if-eq v7, v5, :cond_4

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_6
    invoke-virtual {v4, v5, v7}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    if-eqz v6, :cond_7

    .line 93
    .line 94
    check-cast v5, Li2/g;

    .line 95
    .line 96
    sget-object v4, LO1/g;->a:LO1/g;

    .line 97
    .line 98
    invoke-virtual {v5, v4}, Li2/g;->resumeWith(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_7
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    if-eq v6, v5, :cond_6

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_8
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_9
    monitor-enter p0

    .line 113
    :try_start_3
    iget p2, p0, Ll2/q;->n:I

    .line 114
    .line 115
    if-ne p2, p1, :cond_a

    .line 116
    .line 117
    add-int/2addr p1, v1

    .line 118
    iput p1, p0, Ll2/q;->n:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 119
    .line 120
    monitor-exit p0

    .line 121
    return v1

    .line 122
    :catchall_1
    move-exception p1

    .line 123
    goto :goto_4

    .line 124
    :cond_a
    :try_start_4
    iget-object p1, p0, Lm2/b;->k:[Ll2/s;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 125
    .line 126
    monitor-exit p0

    .line 127
    move v8, p2

    .line 128
    move-object p2, p1

    .line 129
    move p1, v8

    .line 130
    goto :goto_0

    .line 131
    :goto_4
    monitor-exit p0

    .line 132
    throw p1

    .line 133
    :cond_b
    add-int/lit8 p1, p1, 0x2

    .line 134
    .line 135
    :try_start_5
    iput p1, p0, Ll2/q;->n:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 136
    .line 137
    monitor-exit p0

    .line 138
    return v1

    .line 139
    :goto_5
    monitor-exit p0

    .line 140
    throw p1
.end method

.method public final g(Ljava/lang/Object;LR1/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ll2/q;->b(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    sget-object p1, LO1/g;->a:LO1/g;

    .line 5
    .line 6
    return-object p1
.end method

.method public final h(Ll2/e;LR1/c;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    instance-of v2, v0, Ll2/p;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Ll2/p;

    .line 11
    .line 12
    iget v3, v2, Ll2/p;->u:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Ll2/p;->u:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Ll2/p;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, Ll2/p;-><init>(Ll2/q;LR1/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, Ll2/p;->s:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, LS1/a;->k:LS1/a;

    .line 32
    .line 33
    iget v4, v2, Ll2/p;->u:I

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x0

    .line 37
    const/4 v7, 0x0

    .line 38
    const/4 v8, 0x2

    .line 39
    const/4 v9, 0x1

    .line 40
    if-eqz v4, :cond_4

    .line 41
    .line 42
    if-eq v4, v9, :cond_3

    .line 43
    .line 44
    if-eq v4, v8, :cond_2

    .line 45
    .line 46
    if-ne v4, v5, :cond_1

    .line 47
    .line 48
    iget-object v4, v2, Ll2/p;->r:Ljava/lang/Object;

    .line 49
    .line 50
    iget-object v10, v2, Ll2/p;->q:Li2/N;

    .line 51
    .line 52
    iget-object v11, v2, Ll2/p;->p:Ll2/s;

    .line 53
    .line 54
    iget-object v12, v2, Ll2/p;->o:Ll2/e;

    .line 55
    .line 56
    iget-object v13, v2, Ll2/p;->n:Ll2/q;

    .line 57
    .line 58
    :try_start_0
    invoke-static {v0}, LH2/h;->E(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    .line 61
    move-object v0, v4

    .line 62
    goto/16 :goto_b

    .line 63
    .line 64
    :catchall_0
    move-exception v0

    .line 65
    goto/16 :goto_c

    .line 66
    .line 67
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 68
    .line 69
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 70
    .line 71
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw v0

    .line 75
    :cond_2
    iget-object v4, v2, Ll2/p;->r:Ljava/lang/Object;

    .line 76
    .line 77
    iget-object v10, v2, Ll2/p;->q:Li2/N;

    .line 78
    .line 79
    iget-object v11, v2, Ll2/p;->p:Ll2/s;

    .line 80
    .line 81
    iget-object v12, v2, Ll2/p;->o:Ll2/e;

    .line 82
    .line 83
    iget-object v13, v2, Ll2/p;->n:Ll2/q;

    .line 84
    .line 85
    :try_start_1
    invoke-static {v0}, LH2/h;->E(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 86
    .line 87
    .line 88
    goto/16 :goto_7

    .line 89
    .line 90
    :cond_3
    iget-object v11, v2, Ll2/p;->p:Ll2/s;

    .line 91
    .line 92
    iget-object v4, v2, Ll2/p;->o:Ll2/e;

    .line 93
    .line 94
    iget-object v13, v2, Ll2/p;->n:Ll2/q;

    .line 95
    .line 96
    :try_start_2
    invoke-static {v0}, LH2/h;->E(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 97
    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_4
    invoke-static {v0}, LH2/h;->E(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    monitor-enter p0

    .line 104
    :try_start_3
    iget-object v0, v1, Lm2/b;->k:[Ll2/s;

    .line 105
    .line 106
    if-nez v0, :cond_5

    .line 107
    .line 108
    new-array v0, v8, [Ll2/s;

    .line 109
    .line 110
    iput-object v0, v1, Lm2/b;->k:[Ll2/s;

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :catchall_1
    move-exception v0

    .line 114
    goto/16 :goto_f

    .line 115
    .line 116
    :cond_5
    iget v4, v1, Lm2/b;->l:I

    .line 117
    .line 118
    array-length v10, v0

    .line 119
    if-lt v4, v10, :cond_6

    .line 120
    .line 121
    array-length v4, v0

    .line 122
    mul-int/2addr v4, v8

    .line 123
    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    const-string v4, "copyOf(...)"

    .line 128
    .line 129
    invoke-static {v0, v4}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    move-object v4, v0

    .line 133
    check-cast v4, [Ll2/s;

    .line 134
    .line 135
    iput-object v4, v1, Lm2/b;->k:[Ll2/s;

    .line 136
    .line 137
    check-cast v0, [Ll2/s;

    .line 138
    .line 139
    :cond_6
    :goto_1
    iget v4, v1, Lm2/b;->m:I

    .line 140
    .line 141
    :goto_2
    aget-object v10, v0, v4

    .line 142
    .line 143
    if-nez v10, :cond_7

    .line 144
    .line 145
    new-instance v10, Ll2/s;

    .line 146
    .line 147
    invoke-direct {v10}, Ll2/s;-><init>()V

    .line 148
    .line 149
    .line 150
    aput-object v10, v0, v4

    .line 151
    .line 152
    :cond_7
    add-int/lit8 v4, v4, 0x1

    .line 153
    .line 154
    array-length v11, v0

    .line 155
    if-lt v4, v11, :cond_8

    .line 156
    .line 157
    move v4, v7

    .line 158
    :cond_8
    iget-object v11, v10, Ll2/s;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 159
    .line 160
    invoke-virtual {v11}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v12

    .line 164
    if-eqz v12, :cond_9

    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_9
    sget-object v0, Ll2/r;->a:LB1/g;

    .line 168
    .line 169
    invoke-virtual {v11, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    iput v4, v1, Lm2/b;->m:I

    .line 173
    .line 174
    iget v0, v1, Lm2/b;->l:I

    .line 175
    .line 176
    add-int/2addr v0, v9

    .line 177
    iput v0, v1, Lm2/b;->l:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 178
    .line 179
    monitor-exit p0

    .line 180
    move-object/from16 v4, p1

    .line 181
    .line 182
    move-object v13, v1

    .line 183
    move-object v11, v10

    .line 184
    :goto_3
    :try_start_4
    iget-object v0, v2, LT1/c;->l:LR1/h;

    .line 185
    .line 186
    invoke-static {v0}, La2/h;->b(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    sget-object v10, Li2/r;->l:Li2/r;

    .line 190
    .line 191
    invoke-interface {v0, v10}, LR1/h;->e(LR1/g;)LR1/f;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    check-cast v0, Li2/N;

    .line 196
    .line 197
    move-object v10, v0

    .line 198
    move-object v12, v4

    .line 199
    move-object v0, v6

    .line 200
    :goto_4
    sget-object v4, Ll2/q;->o:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 201
    .line 202
    invoke-virtual {v4, v13}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    if-eqz v10, :cond_b

    .line 207
    .line 208
    invoke-interface {v10}, Li2/N;->a()Z

    .line 209
    .line 210
    .line 211
    move-result v14

    .line 212
    if-eqz v14, :cond_a

    .line 213
    .line 214
    goto :goto_5

    .line 215
    :cond_a
    check-cast v10, Li2/W;

    .line 216
    .line 217
    invoke-virtual {v10}, Li2/W;->w()Ljava/util/concurrent/CancellationException;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    throw v0

    .line 222
    :cond_b
    :goto_5
    if-eqz v0, :cond_c

    .line 223
    .line 224
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v14

    .line 228
    if-nez v14, :cond_f

    .line 229
    .line 230
    :cond_c
    sget-object v0, Lm2/k;->a:LB1/g;

    .line 231
    .line 232
    if-ne v4, v0, :cond_d

    .line 233
    .line 234
    move-object v0, v6

    .line 235
    goto :goto_6

    .line 236
    :cond_d
    move-object v0, v4

    .line 237
    :goto_6
    iput-object v13, v2, Ll2/p;->n:Ll2/q;

    .line 238
    .line 239
    iput-object v12, v2, Ll2/p;->o:Ll2/e;

    .line 240
    .line 241
    iput-object v11, v2, Ll2/p;->p:Ll2/s;

    .line 242
    .line 243
    iput-object v10, v2, Ll2/p;->q:Li2/N;

    .line 244
    .line 245
    iput-object v4, v2, Ll2/p;->r:Ljava/lang/Object;

    .line 246
    .line 247
    iput v8, v2, Ll2/p;->u:I

    .line 248
    .line 249
    invoke-interface {v12, v0, v2}, Ll2/e;->g(Ljava/lang/Object;LR1/c;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    if-ne v0, v3, :cond_e

    .line 254
    .line 255
    goto :goto_a

    .line 256
    :cond_e
    :goto_7
    move-object v0, v4

    .line 257
    :cond_f
    iget-object v4, v11, Ll2/s;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 258
    .line 259
    sget-object v14, Ll2/r;->a:LB1/g;

    .line 260
    .line 261
    invoke-virtual {v4, v14}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v4

    .line 265
    invoke-static {v4}, La2/h;->b(Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    sget-object v15, Ll2/r;->b:LB1/g;

    .line 269
    .line 270
    if-ne v4, v15, :cond_10

    .line 271
    .line 272
    goto :goto_4

    .line 273
    :cond_10
    iput-object v13, v2, Ll2/p;->n:Ll2/q;

    .line 274
    .line 275
    iput-object v12, v2, Ll2/p;->o:Ll2/e;

    .line 276
    .line 277
    iput-object v11, v2, Ll2/p;->p:Ll2/s;

    .line 278
    .line 279
    iput-object v10, v2, Ll2/p;->q:Li2/N;

    .line 280
    .line 281
    iput-object v0, v2, Ll2/p;->r:Ljava/lang/Object;

    .line 282
    .line 283
    iput v5, v2, Ll2/p;->u:I

    .line 284
    .line 285
    sget-object v4, LO1/g;->a:LO1/g;

    .line 286
    .line 287
    new-instance v15, Li2/g;

    .line 288
    .line 289
    invoke-static {v2}, LH2/h;->s(LR1/c;)LR1/c;

    .line 290
    .line 291
    .line 292
    move-result-object v5

    .line 293
    invoke-direct {v15, v9, v5}, Li2/g;-><init>(ILR1/c;)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v15}, Li2/g;->s()V

    .line 297
    .line 298
    .line 299
    iget-object v5, v11, Ll2/s;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 300
    .line 301
    :goto_8
    invoke-virtual {v5, v14, v15}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v16

    .line 305
    if-eqz v16, :cond_11

    .line 306
    .line 307
    goto :goto_9

    .line 308
    :cond_11
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v8

    .line 312
    if-eq v8, v14, :cond_14

    .line 313
    .line 314
    invoke-virtual {v15, v4}, Li2/g;->resumeWith(Ljava/lang/Object;)V

    .line 315
    .line 316
    .line 317
    :goto_9
    invoke-virtual {v15}, Li2/g;->r()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v5

    .line 321
    sget-object v8, LS1/a;->k:LS1/a;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 322
    .line 323
    if-ne v5, v8, :cond_12

    .line 324
    .line 325
    move-object v4, v5

    .line 326
    :cond_12
    if-ne v4, v3, :cond_13

    .line 327
    .line 328
    :goto_a
    return-object v3

    .line 329
    :cond_13
    :goto_b
    const/4 v5, 0x3

    .line 330
    const/4 v8, 0x2

    .line 331
    goto/16 :goto_4

    .line 332
    .line 333
    :cond_14
    const/4 v8, 0x2

    .line 334
    goto :goto_8

    .line 335
    :goto_c
    monitor-enter v13

    .line 336
    :try_start_5
    iget v2, v13, Lm2/b;->l:I

    .line 337
    .line 338
    add-int/lit8 v2, v2, -0x1

    .line 339
    .line 340
    iput v2, v13, Lm2/b;->l:I

    .line 341
    .line 342
    if-nez v2, :cond_15

    .line 343
    .line 344
    iput v7, v13, Lm2/b;->m:I

    .line 345
    .line 346
    goto :goto_d

    .line 347
    :catchall_2
    move-exception v0

    .line 348
    goto :goto_e

    .line 349
    :cond_15
    :goto_d
    const-string v2, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>"

    .line 350
    .line 351
    invoke-static {v11, v2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    iget-object v2, v11, Ll2/s;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 355
    .line 356
    invoke-virtual {v2, v6}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 357
    .line 358
    .line 359
    monitor-exit v13

    .line 360
    throw v0

    .line 361
    :goto_e
    monitor-exit v13

    .line 362
    throw v0

    .line 363
    :goto_f
    monitor-exit p0

    .line 364
    throw v0
.end method

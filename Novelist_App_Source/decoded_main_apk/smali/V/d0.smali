.class public final LV/d0;
.super La2/i;
.source "SourceFile"

# interfaces
.implements LZ1/l;


# instance fields
.field public final synthetic l:LV/J;

.field public final synthetic m:LB1/s;


# direct methods
.method public constructor <init>(LV/J;LB1/s;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV/d0;->l:LV/J;

    .line 2
    .line 3
    iput-object p2, p0, LV/d0;->m:LB1/s;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, La2/i;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    iget-object v0, p0, LV/d0;->l:LV/J;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, LV/J;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LV/d0;->m:LB1/s;

    .line 9
    .line 10
    iget-object v0, v0, LB1/s;->m:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v1, v0

    .line 13
    check-cast v1, Lk2/c;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-virtual {v1, p1, v0}, Lk2/c;->f(Ljava/lang/Throwable;Z)Z

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    sget-object v0, Lk2/c;->m:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    sget-object v7, Lk2/c;->l:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 29
    .line 30
    invoke-virtual {v7, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 31
    .line 32
    .line 33
    move-result-wide v4

    .line 34
    const/4 v8, 0x1

    .line 35
    invoke-virtual {v1, v4, v5, v8}, Lk2/c;->r(JZ)Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-eqz v6, :cond_1

    .line 40
    .line 41
    invoke-virtual {v1}, Lk2/c;->m()Ljava/lang/Throwable;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    new-instance v2, Lk2/h;

    .line 46
    .line 47
    invoke-direct {v2, v0}, Lk2/h;-><init>(Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    goto/16 :goto_3

    .line 51
    .line 52
    :cond_1
    const-wide v9, 0xfffffffffffffffL

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    and-long/2addr v4, v9

    .line 58
    cmp-long v2, v2, v4

    .line 59
    .line 60
    sget-object v9, Lk2/j;->a:Lk2/i;

    .line 61
    .line 62
    if-ltz v2, :cond_2

    .line 63
    .line 64
    :goto_0
    move-object v2, v9

    .line 65
    goto/16 :goto_3

    .line 66
    .line 67
    :cond_2
    sget-object v6, Lk2/e;->k:LB1/g;

    .line 68
    .line 69
    sget-object v2, Lk2/c;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 70
    .line 71
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    check-cast v2, Lk2/k;

    .line 76
    .line 77
    :cond_3
    :goto_1
    invoke-virtual {v7, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 78
    .line 79
    .line 80
    move-result-wide v3

    .line 81
    invoke-virtual {v1, v3, v4, v8}, Lk2/c;->r(JZ)Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-eqz v3, :cond_4

    .line 86
    .line 87
    invoke-virtual {v1}, Lk2/c;->m()Ljava/lang/Throwable;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    new-instance v2, Lk2/h;

    .line 92
    .line 93
    invoke-direct {v2, v0}, Lk2/h;-><init>(Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 98
    .line 99
    .line 100
    move-result-wide v4

    .line 101
    sget v3, Lk2/e;->b:I

    .line 102
    .line 103
    int-to-long v10, v3

    .line 104
    div-long v12, v4, v10

    .line 105
    .line 106
    rem-long v10, v4, v10

    .line 107
    .line 108
    long-to-int v3, v10

    .line 109
    iget-wide v10, v2, Ln2/r;->c:J

    .line 110
    .line 111
    cmp-long v10, v10, v12

    .line 112
    .line 113
    if-eqz v10, :cond_6

    .line 114
    .line 115
    invoke-virtual {v1, v12, v13, v2}, Lk2/c;->l(JLk2/k;)Lk2/k;

    .line 116
    .line 117
    .line 118
    move-result-object v10

    .line 119
    if-nez v10, :cond_5

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_5
    move-object v2, v10

    .line 123
    :cond_6
    invoke-virtual/range {v1 .. v6}, Lk2/c;->A(Lk2/k;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v10

    .line 127
    sget-object v11, Lk2/e;->m:LB1/g;

    .line 128
    .line 129
    if-ne v10, v11, :cond_9

    .line 130
    .line 131
    instance-of v0, v6, Li2/i0;

    .line 132
    .line 133
    if-eqz v0, :cond_7

    .line 134
    .line 135
    check-cast v6, Li2/i0;

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_7
    const/4 v6, 0x0

    .line 139
    :goto_2
    if-eqz v6, :cond_8

    .line 140
    .line 141
    invoke-interface {v6, v2, v3}, Li2/i0;->a(Ln2/r;I)V

    .line 142
    .line 143
    .line 144
    :cond_8
    invoke-virtual {v1, v4, v5}, Lk2/c;->C(J)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2}, Ln2/r;->h()V

    .line 148
    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_9
    sget-object v3, Lk2/e;->o:LB1/g;

    .line 152
    .line 153
    if-ne v10, v3, :cond_a

    .line 154
    .line 155
    invoke-virtual {v1}, Lk2/c;->p()J

    .line 156
    .line 157
    .line 158
    move-result-wide v10

    .line 159
    cmp-long v3, v4, v10

    .line 160
    .line 161
    if-gez v3, :cond_3

    .line 162
    .line 163
    invoke-virtual {v2}, Ln2/b;->a()V

    .line 164
    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_a
    sget-object v0, Lk2/e;->n:LB1/g;

    .line 168
    .line 169
    if-eq v10, v0, :cond_e

    .line 170
    .line 171
    invoke-virtual {v2}, Ln2/b;->a()V

    .line 172
    .line 173
    .line 174
    move-object v2, v10

    .line 175
    :goto_3
    instance-of v0, v2, Lk2/i;

    .line 176
    .line 177
    const/4 v3, 0x0

    .line 178
    if-nez v0, :cond_b

    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_b
    move-object v2, v3

    .line 182
    :goto_4
    sget-object v0, LO1/g;->a:LO1/g;

    .line 183
    .line 184
    if-eqz v2, :cond_d

    .line 185
    .line 186
    check-cast v2, LV/a0;

    .line 187
    .line 188
    iget-object v2, v2, LV/a0;->b:Li2/m;

    .line 189
    .line 190
    if-nez p1, :cond_c

    .line 191
    .line 192
    new-instance v3, Ljava/util/concurrent/CancellationException;

    .line 193
    .line 194
    const-string v4, "DataStore scope was cancelled before updateData could complete"

    .line 195
    .line 196
    invoke-direct {v3, v4}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    goto :goto_5

    .line 200
    :cond_c
    move-object v3, p1

    .line 201
    :goto_5
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    new-instance v4, Li2/o;

    .line 205
    .line 206
    const/4 v5, 0x0

    .line 207
    invoke-direct {v4, v3, v5}, Li2/o;-><init>(Ljava/lang/Throwable;Z)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2, v4}, Li2/W;->F(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-object v3, v0

    .line 214
    :cond_d
    if-nez v3, :cond_0

    .line 215
    .line 216
    return-object v0

    .line 217
    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 218
    .line 219
    const-string v0, "unexpected"

    .line 220
    .line 221
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    throw p1
.end method

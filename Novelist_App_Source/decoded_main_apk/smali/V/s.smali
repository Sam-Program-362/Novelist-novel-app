.class public final LV/s;
.super LT1/h;
.source "SourceFile"

# interfaces
.implements LZ1/p;


# instance fields
.field public o:LV/c;

.field public p:I

.field public synthetic q:Ljava/lang/Object;

.field public final synthetic r:LV/N;


# direct methods
.method public constructor <init>(LV/N;LR1/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV/s;->r:LV/N;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, LT1/h;-><init>(ILR1/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ll2/e;

    .line 2
    .line 3
    check-cast p2, LR1/c;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, LV/s;->i(LR1/c;Ljava/lang/Object;)LR1/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LV/s;

    .line 10
    .line 11
    sget-object p2, LO1/g;->a:LO1/g;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LV/s;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final i(LR1/c;Ljava/lang/Object;)LR1/c;
    .locals 2

    .line 1
    new-instance v0, LV/s;

    .line 2
    .line 3
    iget-object v1, p0, LV/s;->r:LV/N;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, LV/s;-><init>(LV/N;LR1/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, v0, LV/s;->q:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, LV/s;->p:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x1

    .line 5
    sget-object v3, LO1/g;->a:LO1/g;

    .line 6
    .line 7
    iget-object v4, p0, LV/s;->r:LV/N;

    .line 8
    .line 9
    const/4 v5, 0x2

    .line 10
    const/4 v6, 0x0

    .line 11
    sget-object v7, LS1/a;->k:LS1/a;

    .line 12
    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    if-eq v0, v2, :cond_2

    .line 16
    .line 17
    if-eq v0, v5, :cond_1

    .line 18
    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-object v3

    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :cond_1
    iget-object v0, p0, LV/s;->o:LV/c;

    .line 34
    .line 35
    iget-object v2, p0, LV/s;->q:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v2, Ll2/e;

    .line 38
    .line 39
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    iget-object v0, p0, LV/s;->q:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Ll2/e;

    .line 46
    .line 47
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    move-object v2, v0

    .line 51
    goto :goto_0

    .line 52
    :cond_3
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, LV/s;->q:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p1, Ll2/e;

    .line 58
    .line 59
    iput-object p1, p0, LV/s;->q:Ljava/lang/Object;

    .line 60
    .line 61
    iput v2, p0, LV/s;->p:I

    .line 62
    .line 63
    iget-object v0, v4, LV/N;->m:Li2/s;

    .line 64
    .line 65
    invoke-interface {v0}, Li2/s;->d()LR1/h;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    new-instance v2, LV/G;

    .line 70
    .line 71
    invoke-direct {v2, v4, v6}, LV/G;-><init>(LV/N;LR1/c;)V

    .line 72
    .line 73
    .line 74
    invoke-static {v0, v2, p0}, Li2/u;->n(LR1/h;LZ1/p;LT1/h;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    if-ne v0, v7, :cond_4

    .line 79
    .line 80
    goto/16 :goto_3

    .line 81
    .line 82
    :cond_4
    move-object v2, p1

    .line 83
    move-object p1, v0

    .line 84
    :goto_0
    move-object v0, p1

    .line 85
    check-cast v0, LV/j0;

    .line 86
    .line 87
    instance-of p1, v0, LV/c;

    .line 88
    .line 89
    if-eqz p1, :cond_5

    .line 90
    .line 91
    move-object p1, v0

    .line 92
    check-cast p1, LV/c;

    .line 93
    .line 94
    iget-object p1, p1, LV/c;->b:Ljava/lang/Object;

    .line 95
    .line 96
    iput-object v2, p0, LV/s;->q:Ljava/lang/Object;

    .line 97
    .line 98
    move-object v8, v0

    .line 99
    check-cast v8, LV/c;

    .line 100
    .line 101
    iput-object v8, p0, LV/s;->o:LV/c;

    .line 102
    .line 103
    iput v5, p0, LV/s;->p:I

    .line 104
    .line 105
    invoke-interface {v2, p1, p0}, Ll2/e;->g(Ljava/lang/Object;LR1/c;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    if-ne p1, v7, :cond_6

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_5
    instance-of p1, v0, LV/k0;

    .line 113
    .line 114
    if-nez p1, :cond_b

    .line 115
    .line 116
    instance-of p1, v0, LV/b0;

    .line 117
    .line 118
    if-nez p1, :cond_a

    .line 119
    .line 120
    instance-of p1, v0, LV/Z;

    .line 121
    .line 122
    if-eqz p1, :cond_6

    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_6
    :goto_1
    iget-object p1, v4, LV/N;->r:LB1/a;

    .line 126
    .line 127
    iget-object p1, p1, LB1/a;->l:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast p1, Ll2/q;

    .line 130
    .line 131
    new-instance v8, LV/n;

    .line 132
    .line 133
    invoke-direct {v8, v4, v6}, LV/n;-><init>(LV/N;LR1/c;)V

    .line 134
    .line 135
    .line 136
    new-instance v9, Lb1/Q;

    .line 137
    .line 138
    const/16 v10, 0x8

    .line 139
    .line 140
    invoke-direct {v9, v8, p1, v10}, Lb1/Q;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 141
    .line 142
    .line 143
    new-instance p1, LV/o;

    .line 144
    .line 145
    invoke-direct {p1, v5, v6}, LT1/h;-><init>(ILR1/c;)V

    .line 146
    .line 147
    .line 148
    new-instance v5, Lb1/Q;

    .line 149
    .line 150
    const/16 v8, 0xa

    .line 151
    .line 152
    invoke-direct {v5, v9, p1, v8}, Lb1/Q;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 153
    .line 154
    .line 155
    new-instance p1, LV/p;

    .line 156
    .line 157
    invoke-direct {p1, v0, v6}, LV/p;-><init>(LV/j0;LR1/c;)V

    .line 158
    .line 159
    .line 160
    new-instance v0, Lb1/Q;

    .line 161
    .line 162
    const/16 v8, 0x9

    .line 163
    .line 164
    invoke-direct {v0, v5, p1, v8}, Lb1/Q;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 165
    .line 166
    .line 167
    new-instance p1, LH0/i;

    .line 168
    .line 169
    const/16 v5, 0xe

    .line 170
    .line 171
    invoke-direct {p1, v0, v5}, LH0/i;-><init>(Ljava/lang/Object;I)V

    .line 172
    .line 173
    .line 174
    new-instance v0, LV/q;

    .line 175
    .line 176
    invoke-direct {v0, v4, v6}, LV/q;-><init>(LV/N;LR1/c;)V

    .line 177
    .line 178
    .line 179
    new-instance v4, Ll2/i;

    .line 180
    .line 181
    invoke-direct {v4, p1, v0}, Ll2/i;-><init>(LH0/i;LV/q;)V

    .line 182
    .line 183
    .line 184
    iput-object v6, p0, LV/s;->q:Ljava/lang/Object;

    .line 185
    .line 186
    iput-object v6, p0, LV/s;->o:LV/c;

    .line 187
    .line 188
    iput v1, p0, LV/s;->p:I

    .line 189
    .line 190
    instance-of p1, v2, Ll2/t;

    .line 191
    .line 192
    if-nez p1, :cond_9

    .line 193
    .line 194
    invoke-virtual {v4, v2, p0}, Ll2/i;->h(Ll2/e;LR1/c;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    if-ne p1, v7, :cond_7

    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_7
    move-object p1, v3

    .line 202
    :goto_2
    if-ne p1, v7, :cond_8

    .line 203
    .line 204
    :goto_3
    return-object v7

    .line 205
    :cond_8
    :goto_4
    return-object v3

    .line 206
    :cond_9
    check-cast v2, Ll2/t;

    .line 207
    .line 208
    iget-object p1, v2, Ll2/t;->k:Ljava/lang/Throwable;

    .line 209
    .line 210
    throw p1

    .line 211
    :cond_a
    check-cast v0, LV/b0;

    .line 212
    .line 213
    iget-object p1, v0, LV/b0;->b:Ljava/lang/Throwable;

    .line 214
    .line 215
    throw p1

    .line 216
    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 217
    .line 218
    const-string v0, "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"

    .line 219
    .line 220
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    throw p1
.end method

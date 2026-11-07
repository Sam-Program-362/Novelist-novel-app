.class public final LV/F;
.super LT1/h;
.source "SourceFile"

# interfaces
.implements LZ1/l;


# instance fields
.field public final synthetic o:I

.field public p:I

.field public final synthetic q:LV/N;

.field public r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;

.field public final synthetic t:Ljava/io/Serializable;


# direct methods
.method public constructor <init>(LV/N;LR1/h;LZ1/p;LR1/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LV/F;->o:I

    .line 1
    iput-object p1, p0, LV/F;->q:LV/N;

    iput-object p2, p0, LV/F;->s:Ljava/lang/Object;

    check-cast p3, LT1/h;

    iput-object p3, p0, LV/F;->t:Ljava/io/Serializable;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, LT1/h;-><init>(ILR1/c;)V

    return-void
.end method

.method public constructor <init>(La2/o;LV/N;La2/n;LR1/c;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LV/F;->o:I

    .line 2
    iput-object p1, p0, LV/F;->s:Ljava/lang/Object;

    iput-object p2, p0, LV/F;->q:LV/N;

    iput-object p3, p0, LV/F;->t:Ljava/io/Serializable;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, LT1/h;-><init>(ILR1/c;)V

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LV/F;->o:I

    .line 2
    .line 3
    check-cast p1, LR1/c;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, LV/F;

    .line 9
    .line 10
    iget-object v1, p0, LV/F;->s:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, LR1/h;

    .line 13
    .line 14
    iget-object v2, p0, LV/F;->t:Ljava/io/Serializable;

    .line 15
    .line 16
    check-cast v2, LT1/h;

    .line 17
    .line 18
    iget-object v3, p0, LV/F;->q:LV/N;

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2, p1}, LV/F;-><init>(LV/N;LR1/h;LZ1/p;LR1/c;)V

    .line 21
    .line 22
    .line 23
    sget-object p1, LO1/g;->a:LO1/g;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, LV/F;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    :pswitch_0
    new-instance v0, LV/F;

    .line 31
    .line 32
    iget-object v1, p0, LV/F;->s:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, La2/o;

    .line 35
    .line 36
    iget-object v2, p0, LV/F;->t:Ljava/io/Serializable;

    .line 37
    .line 38
    check-cast v2, La2/n;

    .line 39
    .line 40
    iget-object v3, p0, LV/F;->q:LV/N;

    .line 41
    .line 42
    invoke-direct {v0, v1, v3, v2, p1}, LV/F;-><init>(La2/o;LV/N;La2/n;LR1/c;)V

    .line 43
    .line 44
    .line 45
    sget-object p1, LO1/g;->a:LO1/g;

    .line 46
    .line 47
    invoke-virtual {v0, p1}, LV/F;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    return-object p1

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, LV/F;->o:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, LV/F;->p:I

    .line 7
    .line 8
    iget-object v1, p0, LV/F;->q:LV/N;

    .line 9
    .line 10
    const/4 v2, 0x3

    .line 11
    const/4 v3, 0x2

    .line 12
    const/4 v4, 0x1

    .line 13
    sget-object v5, LS1/a;->k:LS1/a;

    .line 14
    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    if-eq v0, v4, :cond_2

    .line 18
    .line 19
    if-eq v0, v3, :cond_1

    .line 20
    .line 21
    if-ne v0, v2, :cond_0

    .line 22
    .line 23
    iget-object v5, p0, LV/F;->r:Ljava/lang/Object;

    .line 24
    .line 25
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto :goto_3

    .line 29
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 32
    .line 33
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p1

    .line 37
    :cond_1
    iget-object v0, p0, LV/F;->r:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, LV/c;

    .line 40
    .line 41
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_3
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iput v4, p0, LV/F;->p:I

    .line 53
    .line 54
    invoke-static {v1, v4, p0}, LV/N;->f(LV/N;ZLT1/c;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-ne p1, v5, :cond_4

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_4
    :goto_0
    move-object v0, p1

    .line 62
    check-cast v0, LV/c;

    .line 63
    .line 64
    iget-object p1, p0, LV/F;->s:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, LR1/h;

    .line 67
    .line 68
    new-instance v6, LV/H;

    .line 69
    .line 70
    iget-object v7, p0, LV/F;->t:Ljava/io/Serializable;

    .line 71
    .line 72
    check-cast v7, LT1/h;

    .line 73
    .line 74
    const/4 v8, 0x0

    .line 75
    invoke-direct {v6, v7, v0, v8}, LV/H;-><init>(LZ1/p;LV/c;LR1/c;)V

    .line 76
    .line 77
    .line 78
    iput-object v0, p0, LV/F;->r:Ljava/lang/Object;

    .line 79
    .line 80
    iput v3, p0, LV/F;->p:I

    .line 81
    .line 82
    invoke-static {p1, v6, p0}, Li2/u;->n(LR1/h;LZ1/p;LT1/h;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    if-ne p1, v5, :cond_5

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_5
    :goto_1
    iget-object v3, v0, LV/c;->b:Ljava/lang/Object;

    .line 90
    .line 91
    if-eqz v3, :cond_6

    .line 92
    .line 93
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    goto :goto_2

    .line 98
    :cond_6
    const/4 v3, 0x0

    .line 99
    :goto_2
    iget v6, v0, LV/c;->c:I

    .line 100
    .line 101
    if-ne v3, v6, :cond_8

    .line 102
    .line 103
    iget-object v0, v0, LV/c;->b:Ljava/lang/Object;

    .line 104
    .line 105
    invoke-static {v0, p1}, La2/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-nez v0, :cond_7

    .line 110
    .line 111
    iput-object p1, p0, LV/F;->r:Ljava/lang/Object;

    .line 112
    .line 113
    iput v2, p0, LV/F;->p:I

    .line 114
    .line 115
    invoke-virtual {v1, p1, v4, p0}, LV/N;->j(Ljava/lang/Object;ZLT1/c;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    if-ne v0, v5, :cond_7

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_7
    move-object v5, p1

    .line 123
    :goto_3
    return-object v5

    .line 124
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 125
    .line 126
    const-string v0, "Data in DataStore was mutated but DataStore is only compatible with Immutable types."

    .line 127
    .line 128
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw p1

    .line 132
    :pswitch_0
    iget-object v0, p0, LV/F;->t:Ljava/io/Serializable;

    .line 133
    .line 134
    check-cast v0, La2/n;

    .line 135
    .line 136
    iget-object v1, p0, LV/F;->s:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v1, La2/o;

    .line 139
    .line 140
    iget v2, p0, LV/F;->p:I

    .line 141
    .line 142
    const/4 v3, 0x3

    .line 143
    const/4 v4, 0x2

    .line 144
    iget-object v5, p0, LV/F;->q:LV/N;

    .line 145
    .line 146
    const/4 v6, 0x1

    .line 147
    sget-object v7, LS1/a;->k:LS1/a;

    .line 148
    .line 149
    if-eqz v2, :cond_c

    .line 150
    .line 151
    if-eq v2, v6, :cond_b

    .line 152
    .line 153
    if-eq v2, v4, :cond_a

    .line 154
    .line 155
    if-ne v2, v3, :cond_9

    .line 156
    .line 157
    iget-object v0, p0, LV/F;->r:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v0, Ljava/io/Serializable;

    .line 160
    .line 161
    check-cast v0, La2/n;

    .line 162
    .line 163
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    goto :goto_6

    .line 167
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 168
    .line 169
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 170
    .line 171
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    throw p1

    .line 175
    :cond_a
    iget-object v2, p0, LV/F;->r:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v2, Ljava/io/Serializable;

    .line 178
    .line 179
    check-cast v2, La2/n;

    .line 180
    .line 181
    :try_start_0
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V
    :try_end_0
    .catch LV/b; {:try_start_0 .. :try_end_0} :catch_0

    .line 182
    .line 183
    .line 184
    goto :goto_5

    .line 185
    :cond_b
    iget-object v2, p0, LV/F;->r:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v2, Ljava/io/Serializable;

    .line 188
    .line 189
    check-cast v2, La2/o;

    .line 190
    .line 191
    :try_start_1
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V
    :try_end_1
    .catch LV/b; {:try_start_1 .. :try_end_1} :catch_0

    .line 192
    .line 193
    .line 194
    goto :goto_4

    .line 195
    :cond_c
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    :try_start_2
    iput-object v1, p0, LV/F;->r:Ljava/lang/Object;

    .line 199
    .line 200
    iput v6, p0, LV/F;->p:I

    .line 201
    .line 202
    invoke-virtual {v5, p0}, LV/N;->i(LT1/c;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    if-ne p1, v7, :cond_d

    .line 207
    .line 208
    goto :goto_8

    .line 209
    :cond_d
    move-object v2, v1

    .line 210
    :goto_4
    iput-object p1, v2, La2/o;->k:Ljava/lang/Object;

    .line 211
    .line 212
    invoke-virtual {v5}, LV/N;->g()LV/i0;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    iput-object v0, p0, LV/F;->r:Ljava/lang/Object;

    .line 217
    .line 218
    iput v4, p0, LV/F;->p:I

    .line 219
    .line 220
    invoke-virtual {p1}, LV/i0;->a()Ljava/lang/Integer;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    if-ne p1, v7, :cond_e

    .line 225
    .line 226
    goto :goto_8

    .line 227
    :cond_e
    move-object v2, v0

    .line 228
    :goto_5
    check-cast p1, Ljava/lang/Number;

    .line 229
    .line 230
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 231
    .line 232
    .line 233
    move-result p1

    .line 234
    iput p1, v2, La2/n;->k:I
    :try_end_2
    .catch LV/b; {:try_start_2 .. :try_end_2} :catch_0

    .line 235
    .line 236
    goto :goto_7

    .line 237
    :catch_0
    iget-object p1, v1, La2/o;->k:Ljava/lang/Object;

    .line 238
    .line 239
    iput-object v0, p0, LV/F;->r:Ljava/lang/Object;

    .line 240
    .line 241
    iput v3, p0, LV/F;->p:I

    .line 242
    .line 243
    invoke-virtual {v5, p1, v6, p0}, LV/N;->j(Ljava/lang/Object;ZLT1/c;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    if-ne p1, v7, :cond_f

    .line 248
    .line 249
    goto :goto_8

    .line 250
    :cond_f
    :goto_6
    check-cast p1, Ljava/lang/Number;

    .line 251
    .line 252
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 253
    .line 254
    .line 255
    move-result p1

    .line 256
    iput p1, v0, La2/n;->k:I

    .line 257
    .line 258
    :goto_7
    sget-object v7, LO1/g;->a:LO1/g;

    .line 259
    .line 260
    :goto_8
    return-object v7

    .line 261
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

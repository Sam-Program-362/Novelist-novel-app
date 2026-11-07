.class public final LK1/L;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/b;
.implements LK1/g;


# instance fields
.field public k:Landroid/content/Context;

.field public l:LA0/j;

.field public final m:LB1/b;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LB1/b;

    .line 5
    .line 6
    const/16 v1, 0x12

    .line 7
    .line 8
    invoke-direct {v0, v1}, LB1/b;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, LK1/L;->m:LB1/b;

    .line 12
    .line 13
    return-void
.end method

.method public static final h(LK1/L;Ljava/lang/String;Ljava/lang/String;LT1/h;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, LY/d;

    .line 2
    .line 3
    invoke-direct {v0, p1}, LY/d;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, LK1/L;->k:Landroid/content/Context;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    invoke-static {p0}, LK1/M;->a(Landroid/content/Context;)LB1/g;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    new-instance v1, LK1/k;

    .line 16
    .line 17
    invoke-direct {v1, v0, p2, p1}, LK1/k;-><init>(LY/d;Ljava/lang/String;LR1/c;)V

    .line 18
    .line 19
    .line 20
    new-instance p2, LY/h;

    .line 21
    .line 22
    invoke-direct {p2, v1, p1}, LY/h;-><init>(LZ1/p;LR1/c;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p2, p3}, LB1/g;->d(LZ1/p;LT1/h;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    sget-object p1, LS1/a;->k:LS1/a;

    .line 30
    .line 31
    if-ne p0, p1, :cond_0

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_0
    sget-object p0, LO1/g;->a:LO1/g;

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_1
    const-string p0, "context"

    .line 38
    .line 39
    invoke-static {p0}, La2/h;->g(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p1
.end method

.method public static final k(LK1/L;Ljava/util/List;LT1/c;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p2, LK1/w;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LK1/w;

    .line 7
    .line 8
    iget v1, v0, LK1/w;->u:I

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
    iput v1, v0, LK1/w;->u:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LK1/w;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, LK1/w;-><init>(LK1/L;LT1/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LK1/w;->s:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, LK1/w;->u:I

    .line 28
    .line 29
    const-string v2, "context"

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    const/4 v5, 0x0

    .line 34
    sget-object v6, LS1/a;->k:LS1/a;

    .line 35
    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    if-eq v1, v4, :cond_2

    .line 39
    .line 40
    if-ne v1, v3, :cond_1

    .line 41
    .line 42
    iget p1, v0, LK1/w;->r:I

    .line 43
    .line 44
    iget-object v1, v0, LK1/w;->q:LY/d;

    .line 45
    .line 46
    iget-object v4, v0, LK1/w;->p:Ljava/util/Iterator;

    .line 47
    .line 48
    iget-object v7, v0, LK1/w;->o:Ljava/util/Map;

    .line 49
    .line 50
    check-cast v7, Ljava/util/Map;

    .line 51
    .line 52
    iget-object v8, v0, LK1/w;->n:Ljava/util/Set;

    .line 53
    .line 54
    invoke-static {p2}, LH2/h;->E(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto/16 :goto_5

    .line 58
    .line 59
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 62
    .line 63
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p0

    .line 67
    :cond_2
    iget-object p1, v0, LK1/w;->o:Ljava/util/Map;

    .line 68
    .line 69
    check-cast p1, Ljava/util/Map;

    .line 70
    .line 71
    iget-object v1, v0, LK1/w;->n:Ljava/util/Set;

    .line 72
    .line 73
    invoke-static {p2}, LH2/h;->E(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_3
    invoke-static {p2}, LH2/h;->E(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    if-eqz p1, :cond_4

    .line 81
    .line 82
    invoke-static {p1}, LP1/e;->n0(Ljava/util/Collection;)Ljava/util/Set;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    move-object v1, p1

    .line 87
    goto :goto_1

    .line 88
    :cond_4
    move-object v1, v5

    .line 89
    :goto_1
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 90
    .line 91
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 92
    .line 93
    .line 94
    iput-object v1, v0, LK1/w;->n:Ljava/util/Set;

    .line 95
    .line 96
    iput-object p1, v0, LK1/w;->o:Ljava/util/Map;

    .line 97
    .line 98
    iput v4, v0, LK1/w;->u:I

    .line 99
    .line 100
    iget-object p2, p0, LK1/L;->k:Landroid/content/Context;

    .line 101
    .line 102
    if-eqz p2, :cond_b

    .line 103
    .line 104
    invoke-static {p2}, LK1/M;->a(Landroid/content/Context;)LB1/g;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    iget-object p2, p2, LB1/g;->l:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast p2, LV/h;

    .line 111
    .line 112
    invoke-interface {p2}, LV/h;->getData()Ll2/d;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    new-instance v4, LH0/i;

    .line 117
    .line 118
    const/16 v7, 0xc

    .line 119
    .line 120
    invoke-direct {v4, p2, v7}, LH0/i;-><init>(Ljava/lang/Object;I)V

    .line 121
    .line 122
    .line 123
    invoke-static {v4, v0}, Ll2/r;->c(Ll2/d;LT1/c;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    if-ne p2, v6, :cond_5

    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_5
    :goto_2
    check-cast p2, Ljava/util/Set;

    .line 131
    .line 132
    if-eqz p2, :cond_a

    .line 133
    .line 134
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    const/4 v4, 0x0

    .line 139
    move-object v7, p1

    .line 140
    move-object v8, v1

    .line 141
    move p1, v4

    .line 142
    move-object v4, p2

    .line 143
    :cond_6
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 144
    .line 145
    .line 146
    move-result p2

    .line 147
    if-eqz p2, :cond_9

    .line 148
    .line 149
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p2

    .line 153
    move-object v1, p2

    .line 154
    check-cast v1, LY/d;

    .line 155
    .line 156
    iput-object v8, v0, LK1/w;->n:Ljava/util/Set;

    .line 157
    .line 158
    move-object p2, v7

    .line 159
    check-cast p2, Ljava/util/Map;

    .line 160
    .line 161
    iput-object p2, v0, LK1/w;->o:Ljava/util/Map;

    .line 162
    .line 163
    iput-object v4, v0, LK1/w;->p:Ljava/util/Iterator;

    .line 164
    .line 165
    iput-object v1, v0, LK1/w;->q:LY/d;

    .line 166
    .line 167
    iput p1, v0, LK1/w;->r:I

    .line 168
    .line 169
    iput v3, v0, LK1/w;->u:I

    .line 170
    .line 171
    iget-object p2, p0, LK1/L;->k:Landroid/content/Context;

    .line 172
    .line 173
    if-eqz p2, :cond_8

    .line 174
    .line 175
    invoke-static {p2}, LK1/M;->a(Landroid/content/Context;)LB1/g;

    .line 176
    .line 177
    .line 178
    move-result-object p2

    .line 179
    iget-object p2, p2, LB1/g;->l:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast p2, LV/h;

    .line 182
    .line 183
    invoke-interface {p2}, LV/h;->getData()Ll2/d;

    .line 184
    .line 185
    .line 186
    move-result-object p2

    .line 187
    new-instance v9, LK1/o;

    .line 188
    .line 189
    const/4 v10, 0x3

    .line 190
    invoke-direct {v9, p2, v1, v10}, LK1/o;-><init>(Ll2/d;LY/d;I)V

    .line 191
    .line 192
    .line 193
    invoke-static {v9, v0}, Ll2/r;->c(Ll2/d;LT1/c;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object p2

    .line 197
    if-ne p2, v6, :cond_7

    .line 198
    .line 199
    :goto_4
    return-object v6

    .line 200
    :cond_7
    :goto_5
    iget-object v9, v1, LY/d;->a:Ljava/lang/String;

    .line 201
    .line 202
    invoke-static {v9, p2, v8}, LK1/M;->b(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Set;)Z

    .line 203
    .line 204
    .line 205
    move-result v9

    .line 206
    if-eqz v9, :cond_6

    .line 207
    .line 208
    iget-object v9, p0, LK1/L;->m:LB1/b;

    .line 209
    .line 210
    invoke-static {p2, v9}, LK1/M;->c(Ljava/lang/Object;LB1/b;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object p2

    .line 214
    if-eqz p2, :cond_6

    .line 215
    .line 216
    iget-object v1, v1, LY/d;->a:Ljava/lang/String;

    .line 217
    .line 218
    invoke-interface {v7, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    goto :goto_3

    .line 222
    :cond_8
    invoke-static {v2}, La2/h;->g(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    throw v5

    .line 226
    :cond_9
    return-object v7

    .line 227
    :cond_a
    return-object p1

    .line 228
    :cond_b
    invoke-static {v2}, La2/h;->g(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    throw v5
.end method


# virtual methods
.method public final a(Ljava/lang/String;LK1/h;)Ljava/lang/Long;
    .locals 2

    .line 1
    new-instance p2, La2/o;

    .line 2
    .line 3
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, LK1/u;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p1, p0, p2, v1}, LK1/u;-><init>(Ljava/lang/String;LK1/L;La2/o;LR1/c;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Li2/u;->j(LZ1/p;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    iget-object p1, p2, La2/o;->k:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, Ljava/lang/Long;

    .line 18
    .line 19
    return-object p1
.end method

.method public final b(Ljava/lang/String;DLK1/h;)V
    .locals 6

    .line 1
    new-instance v0, LK1/G;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    move-object v2, p0

    .line 5
    move-object v1, p1

    .line 6
    move-wide v3, p2

    .line 7
    invoke-direct/range {v0 .. v5}, LK1/G;-><init>(Ljava/lang/String;LK1/L;DLR1/c;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Li2/u;->j(LZ1/p;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final c(Ljava/util/List;LK1/h;)V
    .locals 1

    .line 1
    new-instance p2, LK1/j;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p2, p0, p1, v0}, LK1/j;-><init>(LK1/L;Ljava/util/List;LR1/c;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p2}, Li2/u;->j(LZ1/p;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final d(Ljava/lang/String;LK1/h;)Ljava/util/ArrayList;
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, LK1/L;->m(Ljava/lang/String;LK1/h;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_2

    .line 6
    .line 7
    const-string p2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!"

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    if-nez p2, :cond_2

    .line 14
    .line 15
    const-string p2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu"

    .line 16
    .line 17
    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    if-eqz p2, :cond_2

    .line 22
    .line 23
    iget-object p2, p0, LK1/L;->m:LB1/b;

    .line 24
    .line 25
    invoke-static {p1, p2}, LK1/M;->c(Ljava/lang/Object;LB1/b;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Ljava/util/List;

    .line 30
    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    new-instance p2, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    instance-of v1, v0, Ljava/lang/String;

    .line 53
    .line 54
    if-eqz v1, :cond_0

    .line 55
    .line 56
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    return-object p2

    .line 61
    :cond_2
    const/4 p1, 0x0

    .line 62
    return-object p1
.end method

.method public final e(Ljava/lang/String;Ljava/util/List;LK1/h;)V
    .locals 1

    .line 1
    iget-object p3, p0, LK1/L;->m:LB1/b;

    .line 2
    .line 3
    invoke-virtual {p3, p2}, LB1/b;->e(Ljava/util/List;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const-string p3, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu"

    .line 8
    .line 9
    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    new-instance p3, LK1/E;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-direct {p3, p0, p1, p2, v0}, LK1/E;-><init>(LK1/L;Ljava/lang/String;Ljava/lang/String;LR1/c;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p3}, Li2/u;->j(LZ1/p;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final f(Ljava/lang/String;JLK1/h;)V
    .locals 6

    .line 1
    new-instance v0, LK1/J;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    move-object v2, p0

    .line 5
    move-object v1, p1

    .line 6
    move-wide v3, p2

    .line 7
    invoke-direct/range {v0 .. v5}, LK1/J;-><init>(Ljava/lang/String;LK1/L;JLR1/c;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Li2/u;->j(LZ1/p;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final g(Ljava/util/List;LK1/h;)Ljava/util/Map;
    .locals 1

    .line 1
    new-instance p2, LK1/l;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p2, p0, p1, v0}, LK1/l;-><init>(LK1/L;Ljava/util/List;LR1/c;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p2}, Li2/u;->j(LZ1/p;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/util/Map;

    .line 12
    .line 13
    return-object p1
.end method

.method public final i(Ljava/lang/String;LK1/h;)LK1/P;
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2}, LK1/L;->m(Ljava/lang/String;LK1/h;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 p2, 0x0

    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    const-string v0, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!"

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    new-instance p2, LK1/P;

    .line 17
    .line 18
    sget-object v0, LK1/N;->n:LK1/N;

    .line 19
    .line 20
    invoke-direct {p2, p1, v0}, LK1/P;-><init>(Ljava/lang/String;LK1/N;)V

    .line 21
    .line 22
    .line 23
    return-object p2

    .line 24
    :cond_0
    const-string v0, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu"

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    new-instance p1, LK1/P;

    .line 33
    .line 34
    sget-object v0, LK1/N;->m:LK1/N;

    .line 35
    .line 36
    invoke-direct {p1, p2, v0}, LK1/P;-><init>(Ljava/lang/String;LK1/N;)V

    .line 37
    .line 38
    .line 39
    return-object p1

    .line 40
    :cond_1
    new-instance p1, LK1/P;

    .line 41
    .line 42
    sget-object v0, LK1/N;->o:LK1/N;

    .line 43
    .line 44
    invoke-direct {p1, p2, v0}, LK1/P;-><init>(Ljava/lang/String;LK1/N;)V

    .line 45
    .line 46
    .line 47
    return-object p1

    .line 48
    :cond_2
    return-object p2
.end method

.method public final j(Ljava/lang/String;ZLK1/h;)V
    .locals 1

    .line 1
    new-instance p3, LK1/D;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p3, p1, p0, p2, v0}, LK1/D;-><init>(Ljava/lang/String;LK1/L;ZLR1/c;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p3}, Li2/u;->j(LZ1/p;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final l(Ljava/lang/String;Ljava/lang/String;LK1/h;)V
    .locals 1

    .line 1
    new-instance p3, LK1/K;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p3, p0, p1, p2, v0}, LK1/K;-><init>(LK1/L;Ljava/lang/String;Ljava/lang/String;LR1/c;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p3}, Li2/u;->j(LZ1/p;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final m(Ljava/lang/String;LK1/h;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance p2, La2/o;

    .line 2
    .line 3
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, LK1/y;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p1, p0, p2, v1}, LK1/y;-><init>(Ljava/lang/String;LK1/L;La2/o;LR1/c;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Li2/u;->j(LZ1/p;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    iget-object p1, p2, La2/o;->k:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, Ljava/lang/String;

    .line 18
    .line 19
    return-object p1
.end method

.method public final n(Ljava/lang/String;Ljava/lang/String;LK1/h;)V
    .locals 1

    .line 1
    new-instance p3, LK1/H;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p3, p0, p1, p2, v0}, LK1/H;-><init>(LK1/L;Ljava/lang/String;Ljava/lang/String;LR1/c;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p3}, Li2/u;->j(LZ1/p;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final onAttachedToEngine(Ly1/a;)V
    .locals 4

    .line 1
    const-string v0, "binding"

    .line 2
    .line 3
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Ly1/a;->c:LC1/f;

    .line 7
    .line 8
    const-string v1, "getBinaryMessenger(...)"

    .line 9
    .line 10
    invoke-static {v0, v1}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p1, Ly1/a;->a:Landroid/content/Context;

    .line 14
    .line 15
    const-string v2, "getApplicationContext(...)"

    .line 16
    .line 17
    invoke-static {v1, v2}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, LK1/L;->k:Landroid/content/Context;

    .line 21
    .line 22
    :try_start_0
    sget-object v2, LK1/g;->f:LK1/f;

    .line 23
    .line 24
    const-string v3, "data_store"

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-static {v0, p0, v3}, LK1/f;->b(LC1/f;LK1/g;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    new-instance v2, LA0/j;

    .line 33
    .line 34
    iget-object v3, p0, LK1/L;->m:LB1/b;

    .line 35
    .line 36
    invoke-direct {v2, v0, v1, v3}, LA0/j;-><init>(LC1/f;Landroid/content/Context;LB1/b;)V

    .line 37
    .line 38
    .line 39
    iput-object v2, p0, LK1/L;->l:LA0/j;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catch_0
    move-exception v0

    .line 43
    const-string v1, "SharedPreferencesPlugin"

    .line 44
    .line 45
    const-string v2, "Received exception while setting up SharedPreferencesPlugin"

    .line 46
    .line 47
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 48
    .line 49
    .line 50
    :goto_0
    new-instance v0, LK1/a;

    .line 51
    .line 52
    invoke-direct {v0}, LK1/a;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, p1}, LK1/a;->onAttachedToEngine(Ly1/a;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final onDetachedFromEngine(Ly1/a;)V
    .locals 2

    .line 1
    const-string v0, "binding"

    .line 2
    .line 3
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Ly1/a;->c:LC1/f;

    .line 7
    .line 8
    const-string v0, "getBinaryMessenger(...)"

    .line 9
    .line 10
    invoke-static {p1, v0}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    sget-object v0, LK1/g;->f:LK1/f;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    const-string v1, "data_store"

    .line 20
    .line 21
    invoke-static {p1, v0, v1}, LK1/f;->b(LC1/f;LK1/g;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, LK1/L;->l:LA0/j;

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    iget-object p1, p1, LA0/j;->l:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, LC1/f;

    .line 31
    .line 32
    const-string v1, "shared_preferences"

    .line 33
    .line 34
    invoke-static {p1, v0, v1}, LK1/f;->b(LC1/f;LK1/g;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iput-object v0, p0, LK1/L;->l:LA0/j;

    .line 38
    .line 39
    return-void
.end method

.method public final p(Ljava/lang/String;LK1/h;)Ljava/lang/Boolean;
    .locals 2

    .line 1
    new-instance p2, La2/o;

    .line 2
    .line 3
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, LK1/p;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p1, p0, p2, v1}, LK1/p;-><init>(Ljava/lang/String;LK1/L;La2/o;LR1/c;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Li2/u;->j(LZ1/p;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    iget-object p1, p2, La2/o;->k:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, Ljava/lang/Boolean;

    .line 18
    .line 19
    return-object p1
.end method

.method public final q(Ljava/util/List;LK1/h;)Ljava/util/List;
    .locals 1

    .line 1
    new-instance p2, LK1/v;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p2, p0, p1, v0}, LK1/v;-><init>(LK1/L;Ljava/util/List;LR1/c;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p2}, Li2/u;->j(LZ1/p;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/util/Map;

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p1}, LP1/e;->l0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method

.method public final r(Ljava/lang/String;LK1/h;)Ljava/lang/Double;
    .locals 2

    .line 1
    new-instance p2, La2/o;

    .line 2
    .line 3
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, LK1/s;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p1, p0, p2, v1}, LK1/s;-><init>(Ljava/lang/String;LK1/L;La2/o;LR1/c;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Li2/u;->j(LZ1/p;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    iget-object p1, p2, La2/o;->k:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, Ljava/lang/Double;

    .line 18
    .line 19
    return-object p1
.end method

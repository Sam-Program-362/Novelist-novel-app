.class public final LK1/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll2/e;


# instance fields
.field public final synthetic k:I

.field public final synthetic l:Ll2/e;


# direct methods
.method public synthetic constructor <init>(Ll2/e;I)V
    .locals 0

    .line 1
    iput p2, p0, LK1/B;->k:I

    iput-object p1, p0, LK1/B;->l:Ll2/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;LR1/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LK1/B;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    instance-of v0, p2, LV/r;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p2

    .line 11
    check-cast v0, LV/r;

    .line 12
    .line 13
    iget v1, v0, LV/r;->o:I

    .line 14
    .line 15
    const/high16 v2, -0x80000000

    .line 16
    .line 17
    and-int v3, v1, v2

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    sub-int/2addr v1, v2

    .line 22
    iput v1, v0, LV/r;->o:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, LV/r;

    .line 26
    .line 27
    invoke-direct {v0, p0, p2}, LV/r;-><init>(LK1/B;LR1/c;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object p2, v0, LV/r;->n:Ljava/lang/Object;

    .line 31
    .line 32
    iget v1, v0, LV/r;->o:I

    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    if-ne v1, v2, :cond_1

    .line 38
    .line 39
    invoke-static {p2}, LH2/h;->E(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_2
    invoke-static {p2}, LH2/h;->E(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    check-cast p1, LV/j0;

    .line 55
    .line 56
    instance-of p2, p1, LV/b0;

    .line 57
    .line 58
    if-nez p2, :cond_7

    .line 59
    .line 60
    instance-of p2, p1, LV/c;

    .line 61
    .line 62
    if-eqz p2, :cond_4

    .line 63
    .line 64
    check-cast p1, LV/c;

    .line 65
    .line 66
    iget-object p1, p1, LV/c;->b:Ljava/lang/Object;

    .line 67
    .line 68
    iput v2, v0, LV/r;->o:I

    .line 69
    .line 70
    iget-object p2, p0, LK1/B;->l:Ll2/e;

    .line 71
    .line 72
    invoke-interface {p2, p1, v0}, Ll2/e;->g(Ljava/lang/Object;LR1/c;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    sget-object p2, LS1/a;->k:LS1/a;

    .line 77
    .line 78
    if-ne p1, p2, :cond_3

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_3
    :goto_1
    sget-object p2, LO1/g;->a:LO1/g;

    .line 82
    .line 83
    :goto_2
    return-object p2

    .line 84
    :cond_4
    instance-of p2, p1, LV/Z;

    .line 85
    .line 86
    if-eqz p2, :cond_5

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_5
    instance-of v2, p1, LV/k0;

    .line 90
    .line 91
    :goto_3
    if-eqz v2, :cond_6

    .line 92
    .line 93
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 94
    .line 95
    const-string p2, "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"

    .line 96
    .line 97
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw p1

    .line 101
    :cond_6
    new-instance p1, LD0/a;

    .line 102
    .line 103
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 104
    .line 105
    .line 106
    throw p1

    .line 107
    :cond_7
    check-cast p1, LV/b0;

    .line 108
    .line 109
    iget-object p1, p1, LV/b0;->b:Ljava/lang/Throwable;

    .line 110
    .line 111
    throw p1

    .line 112
    :pswitch_0
    instance-of v0, p2, LK1/A;

    .line 113
    .line 114
    if-eqz v0, :cond_8

    .line 115
    .line 116
    move-object v0, p2

    .line 117
    check-cast v0, LK1/A;

    .line 118
    .line 119
    iget v1, v0, LK1/A;->o:I

    .line 120
    .line 121
    const/high16 v2, -0x80000000

    .line 122
    .line 123
    and-int v3, v1, v2

    .line 124
    .line 125
    if-eqz v3, :cond_8

    .line 126
    .line 127
    sub-int/2addr v1, v2

    .line 128
    iput v1, v0, LK1/A;->o:I

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_8
    new-instance v0, LK1/A;

    .line 132
    .line 133
    invoke-direct {v0, p0, p2}, LK1/A;-><init>(LK1/B;LR1/c;)V

    .line 134
    .line 135
    .line 136
    :goto_4
    iget-object p2, v0, LK1/A;->n:Ljava/lang/Object;

    .line 137
    .line 138
    iget v1, v0, LK1/A;->o:I

    .line 139
    .line 140
    const/4 v2, 0x1

    .line 141
    if-eqz v1, :cond_a

    .line 142
    .line 143
    if-ne v1, v2, :cond_9

    .line 144
    .line 145
    invoke-static {p2}, LH2/h;->E(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    goto :goto_5

    .line 149
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 150
    .line 151
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 152
    .line 153
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    throw p1

    .line 157
    :cond_a
    invoke-static {p2}, LH2/h;->E(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    check-cast p1, LY/b;

    .line 161
    .line 162
    invoke-virtual {p1}, LY/b;->a()Ljava/util/Map;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    iput v2, v0, LK1/A;->o:I

    .line 171
    .line 172
    iget-object p2, p0, LK1/B;->l:Ll2/e;

    .line 173
    .line 174
    invoke-interface {p2, p1, v0}, Ll2/e;->g(Ljava/lang/Object;LR1/c;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    sget-object p2, LS1/a;->k:LS1/a;

    .line 179
    .line 180
    if-ne p1, p2, :cond_b

    .line 181
    .line 182
    goto :goto_6

    .line 183
    :cond_b
    :goto_5
    sget-object p2, LO1/g;->a:LO1/g;

    .line 184
    .line 185
    :goto_6
    return-object p2

    .line 186
    nop

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

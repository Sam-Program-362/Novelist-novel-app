.class public final Lio/flutter/plugin/platform/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/app/Activity;

.field public final b:LA/c;

.field public final c:Lr1/d;

.field public d:LB1/i;

.field public e:I

.field public f:Z


# direct methods
.method public constructor <init>(Lr1/b;LA/c;Lr1/b;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lio/flutter/plugin/platform/f;->f:Z

    .line 6
    .line 7
    new-instance v0, Lio/flutter/plugin/platform/o;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-direct {v0, p0, v1}, Lio/flutter/plugin/platform/o;-><init>(Ljava/lang/Object;I)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lio/flutter/plugin/platform/f;->a:Landroid/app/Activity;

    .line 14
    .line 15
    iput-object p2, p0, Lio/flutter/plugin/platform/f;->b:LA/c;

    .line 16
    .line 17
    iput-object v0, p2, LA/c;->m:Ljava/lang/Object;

    .line 18
    .line 19
    iput-object p3, p0, Lio/flutter/plugin/platform/f;->c:Lr1/d;

    .line 20
    .line 21
    const/16 p1, 0x500

    .line 22
    .line 23
    iput p1, p0, Lio/flutter/plugin/platform/f;->e:I

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a(LB1/i;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/platform/f;->a:Landroid/app/Activity;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 8
    .line 9
    .line 10
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 11
    .line 12
    const/16 v2, 0x1a

    .line 13
    .line 14
    const/16 v3, 0x1e

    .line 15
    .line 16
    const/16 v4, 0x23

    .line 17
    .line 18
    if-lt v1, v4, :cond_0

    .line 19
    .line 20
    new-instance v1, LD/l0;

    .line 21
    .line 22
    invoke-direct {v1, v0}, LD/k0;-><init>(Landroid/view/Window;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    if-lt v1, v3, :cond_1

    .line 27
    .line 28
    new-instance v1, LD/k0;

    .line 29
    .line 30
    invoke-direct {v1, v0}, LD/k0;-><init>(Landroid/view/Window;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    if-lt v1, v2, :cond_2

    .line 35
    .line 36
    new-instance v1, LD/j0;

    .line 37
    .line 38
    invoke-direct {v1, v0}, LD/i0;-><init>(Landroid/view/Window;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    new-instance v1, LD/i0;

    .line 43
    .line 44
    invoke-direct {v1, v0}, LD/i0;-><init>(Landroid/view/Window;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 48
    .line 49
    if-ge v5, v3, :cond_3

    .line 50
    .line 51
    const/high16 v3, -0x80000000

    .line 52
    .line 53
    invoke-virtual {v0, v3}, Landroid/view/Window;->addFlags(I)V

    .line 54
    .line 55
    .line 56
    const/high16 v3, 0xc000000

    .line 57
    .line 58
    invoke-virtual {v0, v3}, Landroid/view/Window;->clearFlags(I)V

    .line 59
    .line 60
    .line 61
    :cond_3
    iget v3, p1, LB1/i;->a:I

    .line 62
    .line 63
    const/4 v6, 0x0

    .line 64
    const/4 v7, 0x1

    .line 65
    if-eqz v3, :cond_6

    .line 66
    .line 67
    invoke-static {v3}, LX/j;->a(I)I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_5

    .line 72
    .line 73
    if-eq v3, v7, :cond_4

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_4
    invoke-virtual {v1, v7}, LE2/a;->N(Z)V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_5
    invoke-virtual {v1, v6}, LE2/a;->N(Z)V

    .line 81
    .line 82
    .line 83
    :cond_6
    :goto_1
    iget-object v3, p1, LB1/i;->c:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v3, Ljava/lang/Integer;

    .line 86
    .line 87
    if-eqz v3, :cond_7

    .line 88
    .line 89
    if-ge v5, v4, :cond_7

    .line 90
    .line 91
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    invoke-virtual {v0, v3}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 96
    .line 97
    .line 98
    :cond_7
    iget-object v3, p1, LB1/i;->f:Ljava/io/Serializable;

    .line 99
    .line 100
    check-cast v3, Ljava/lang/Boolean;

    .line 101
    .line 102
    const/16 v8, 0x1d

    .line 103
    .line 104
    if-eqz v3, :cond_8

    .line 105
    .line 106
    if-lt v5, v8, :cond_8

    .line 107
    .line 108
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    invoke-static {v0, v3}, LD/L;->p(Landroid/view/Window;Z)V

    .line 113
    .line 114
    .line 115
    :cond_8
    if-lt v5, v2, :cond_c

    .line 116
    .line 117
    iget v2, p1, LB1/i;->b:I

    .line 118
    .line 119
    if-eqz v2, :cond_b

    .line 120
    .line 121
    invoke-static {v2}, LX/j;->a(I)I

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    if-eqz v2, :cond_a

    .line 126
    .line 127
    if-eq v2, v7, :cond_9

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_9
    invoke-virtual {v1, v7}, LE2/a;->M(Z)V

    .line 131
    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_a
    invoke-virtual {v1, v6}, LE2/a;->M(Z)V

    .line 135
    .line 136
    .line 137
    :cond_b
    :goto_2
    iget-object v1, p1, LB1/i;->d:Ljava/io/Serializable;

    .line 138
    .line 139
    check-cast v1, Ljava/lang/Integer;

    .line 140
    .line 141
    if-eqz v1, :cond_c

    .line 142
    .line 143
    if-ge v5, v4, :cond_c

    .line 144
    .line 145
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    invoke-virtual {v0, v1}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 150
    .line 151
    .line 152
    :cond_c
    iget-object v1, p1, LB1/i;->e:Ljava/io/Serializable;

    .line 153
    .line 154
    check-cast v1, Ljava/lang/Integer;

    .line 155
    .line 156
    if-eqz v1, :cond_d

    .line 157
    .line 158
    const/16 v2, 0x1c

    .line 159
    .line 160
    if-lt v5, v2, :cond_d

    .line 161
    .line 162
    if-ge v5, v4, :cond_d

    .line 163
    .line 164
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    invoke-static {v0, v1}, LB/b;->p(Landroid/view/Window;I)V

    .line 169
    .line 170
    .line 171
    :cond_d
    iget-object v1, p1, LB1/i;->g:Ljava/io/Serializable;

    .line 172
    .line 173
    check-cast v1, Ljava/lang/Boolean;

    .line 174
    .line 175
    if-eqz v1, :cond_e

    .line 176
    .line 177
    if-lt v5, v8, :cond_e

    .line 178
    .line 179
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    invoke-static {v0, v1}, LD/L;->w(Landroid/view/Window;Z)V

    .line 184
    .line 185
    .line 186
    :cond_e
    iput-object p1, p0, Lio/flutter/plugin/platform/f;->d:LB1/i;

    .line 187
    .line 188
    return-void
.end method

.method public final b()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lio/flutter/plugin/platform/f;->f:Z

    .line 2
    .line 3
    iget-object v1, p0, Lio/flutter/plugin/platform/f;->a:Landroid/app/Activity;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-static {v0, v1}, LS0/a;->B(Landroid/view/Window;Z)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget v1, p0, Lio/flutter/plugin/platform/f;->e:I

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, p0, Lio/flutter/plugin/platform/f;->d:LB1/i;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Lio/flutter/plugin/platform/f;->a(LB1/i;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-void
.end method

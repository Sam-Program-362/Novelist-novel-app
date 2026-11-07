.class public Lb0/p;
.super Lb0/s;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final c0:Lb0/m;

.field public final d0:Lb0/n;

.field public e0:I

.field public f0:I

.field public g0:Z

.field public h0:Z

.field public i0:I

.field public j0:Z

.field public final k0:LB1/g;

.field public l0:Landroid/app/Dialog;

.field public m0:Z

.field public n0:Z

.field public o0:Z

.field public p0:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lb0/s;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LA/b;

    .line 5
    .line 6
    const/4 v1, 0x7

    .line 7
    invoke-direct {v0, p0, v1}, LA/b;-><init>(Ljava/lang/Object;I)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Lb0/m;

    .line 11
    .line 12
    invoke-direct {v0, p0}, Lb0/m;-><init>(Lb0/p;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lb0/p;->c0:Lb0/m;

    .line 16
    .line 17
    new-instance v0, Lb0/n;

    .line 18
    .line 19
    invoke-direct {v0, p0}, Lb0/n;-><init>(Lb0/p;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lb0/p;->d0:Lb0/n;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput v0, p0, Lb0/p;->e0:I

    .line 26
    .line 27
    iput v0, p0, Lb0/p;->f0:I

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    iput-boolean v1, p0, Lb0/p;->g0:Z

    .line 31
    .line 32
    iput-boolean v1, p0, Lb0/p;->h0:Z

    .line 33
    .line 34
    const/4 v1, -0x1

    .line 35
    iput v1, p0, Lb0/p;->i0:I

    .line 36
    .line 37
    new-instance v1, LB1/g;

    .line 38
    .line 39
    const/16 v2, 0xa

    .line 40
    .line 41
    invoke-direct {v1, p0, v2}, LB1/g;-><init>(Ljava/lang/Object;I)V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, Lb0/p;->k0:LB1/g;

    .line 45
    .line 46
    iput-boolean v0, p0, Lb0/p;->p0:Z

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public B()Landroid/app/Dialog;
    .locals 3

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lb0/I;->J(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v1, "onCreateDialog called for DialogFragment "

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "FragmentManager"

    .line 23
    .line 24
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    new-instance v0, Lb/m;

    .line 28
    .line 29
    invoke-virtual {p0}, Lb0/s;->z()Landroid/content/Context;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iget v2, p0, Lb0/p;->f0:I

    .line 34
    .line 35
    invoke-direct {v0, v1, v2}, Lb/m;-><init>(Landroid/content/Context;I)V

    .line 36
    .line 37
    .line 38
    return-object v0
.end method

.method public final d()La/a;
    .locals 2

    .line 1
    new-instance v0, Lb0/o;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lb0/o;-><init>(Lb0/s;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lb0/o;

    .line 7
    .line 8
    invoke-direct {v1, p0, v0}, Lb0/o;-><init>(Lb0/p;Lb0/o;)V

    .line 9
    .line 10
    .line 11
    return-object v1
.end method

.method public final o()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lb0/s;->N:Z

    .line 3
    .line 4
    return-void
.end method

.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 4

    .line 1
    iget-boolean p1, p0, Lb0/p;->m0:Z

    .line 2
    .line 3
    if-nez p1, :cond_7

    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-static {p1}, Lb0/I;->J(I)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v1, "onDismiss called for DialogFragment "

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v1, "FragmentManager"

    .line 27
    .line 28
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    :cond_0
    iget-boolean v0, p0, Lb0/p;->n0:Z

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const/4 v0, 0x1

    .line 37
    iput-boolean v0, p0, Lb0/p;->n0:Z

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    iput-boolean v1, p0, Lb0/p;->o0:Z

    .line 41
    .line 42
    iget-object v1, p0, Lb0/p;->l0:Landroid/app/Dialog;

    .line 43
    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    const/4 v2, 0x0

    .line 47
    invoke-virtual {v1, v2}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Lb0/p;->l0:Landroid/app/Dialog;

    .line 51
    .line 52
    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    .line 53
    .line 54
    .line 55
    :cond_2
    iput-boolean v0, p0, Lb0/p;->m0:Z

    .line 56
    .line 57
    iget v1, p0, Lb0/p;->i0:I

    .line 58
    .line 59
    if-ltz v1, :cond_4

    .line 60
    .line 61
    invoke-virtual {p0}, Lb0/s;->j()Lb0/I;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iget v1, p0, Lb0/p;->i0:I

    .line 66
    .line 67
    if-ltz v1, :cond_3

    .line 68
    .line 69
    new-instance v2, Lb0/G;

    .line 70
    .line 71
    invoke-direct {v2, p1, v1}, Lb0/G;-><init>(Lb0/I;I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, v2, v0}, Lb0/I;->y(Lb0/F;Z)V

    .line 75
    .line 76
    .line 77
    const/4 p1, -0x1

    .line 78
    iput p1, p0, Lb0/p;->i0:I

    .line 79
    .line 80
    return-void

    .line 81
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 82
    .line 83
    const-string v0, "Bad id: "

    .line 84
    .line 85
    invoke-static {v0, v1}, LB1/e;->g(Ljava/lang/String;I)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw p1

    .line 93
    :cond_4
    invoke-virtual {p0}, Lb0/s;->j()Lb0/I;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    new-instance v2, Lb0/a;

    .line 98
    .line 99
    invoke-direct {v2, v1}, Lb0/a;-><init>(Lb0/I;)V

    .line 100
    .line 101
    .line 102
    iput-boolean v0, v2, Lb0/a;->o:Z

    .line 103
    .line 104
    iget-object v1, p0, Lb0/s;->C:Lb0/I;

    .line 105
    .line 106
    if-eqz v1, :cond_6

    .line 107
    .line 108
    iget-object v3, v2, Lb0/a;->p:Lb0/I;

    .line 109
    .line 110
    if-ne v1, v3, :cond_5

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 114
    .line 115
    new-instance v0, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    const-string v1, "Cannot remove Fragment attached to a different FragmentManager. Fragment "

    .line 118
    .line 119
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0}, Lb0/s;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    const-string v1, " is already attached to a FragmentManager."

    .line 130
    .line 131
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    throw p1

    .line 142
    :cond_6
    :goto_0
    new-instance v1, Lb0/P;

    .line 143
    .line 144
    invoke-direct {v1, p1, p0}, Lb0/P;-><init>(ILb0/s;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2, v1}, Lb0/a;->b(Lb0/P;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2, v0}, Lb0/a;->d(Z)I

    .line 151
    .line 152
    .line 153
    :cond_7
    :goto_1
    return-void
.end method

.method public final q(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Lb0/s;->q(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lb0/s;->X:Landroidx/lifecycle/z;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const-string v0, "observeForever"

    .line 10
    .line 11
    invoke-static {v0}, Landroidx/lifecycle/z;->a(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-instance v0, Landroidx/lifecycle/w;

    .line 15
    .line 16
    iget-object v1, p0, Lb0/p;->k0:LB1/g;

    .line 17
    .line 18
    invoke-direct {v0, p1, v1}, Landroidx/lifecycle/y;-><init>(Landroidx/lifecycle/z;Landroidx/lifecycle/A;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p1, Landroidx/lifecycle/z;->b:Lm/f;

    .line 22
    .line 23
    invoke-virtual {p1, v1}, Lm/f;->a(Ljava/lang/Object;)Lm/c;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const/4 v3, 0x1

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    iget-object p1, v2, Lm/c;->l:Ljava/lang/Object;

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    new-instance v2, Lm/c;

    .line 34
    .line 35
    invoke-direct {v2, v1, v0}, Lm/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget v1, p1, Lm/f;->n:I

    .line 39
    .line 40
    add-int/2addr v1, v3

    .line 41
    iput v1, p1, Lm/f;->n:I

    .line 42
    .line 43
    iget-object v1, p1, Lm/f;->l:Lm/c;

    .line 44
    .line 45
    if-nez v1, :cond_1

    .line 46
    .line 47
    iput-object v2, p1, Lm/f;->k:Lm/c;

    .line 48
    .line 49
    iput-object v2, p1, Lm/f;->l:Lm/c;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    iput-object v2, v1, Lm/c;->m:Lm/c;

    .line 53
    .line 54
    iput-object v1, v2, Lm/c;->n:Lm/c;

    .line 55
    .line 56
    iput-object v2, p1, Lm/f;->l:Lm/c;

    .line 57
    .line 58
    :goto_0
    const/4 p1, 0x0

    .line 59
    :goto_1
    check-cast p1, Landroidx/lifecycle/y;

    .line 60
    .line 61
    instance-of v1, p1, Landroidx/lifecycle/x;

    .line 62
    .line 63
    if-nez v1, :cond_4

    .line 64
    .line 65
    if-eqz p1, :cond_2

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_2
    invoke-virtual {v0, v3}, Landroidx/lifecycle/y;->h(Z)V

    .line 69
    .line 70
    .line 71
    :goto_2
    iget-boolean p1, p0, Lb0/p;->o0:Z

    .line 72
    .line 73
    if-nez p1, :cond_3

    .line 74
    .line 75
    const/4 p1, 0x0

    .line 76
    iput-boolean p1, p0, Lb0/p;->n0:Z

    .line 77
    .line 78
    :cond_3
    return-void

    .line 79
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 80
    .line 81
    const-string v0, "Cannot add the same observer with different lifecycles"

    .line 82
    .line 83
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p1
.end method

.method public final r(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lb0/s;->N:Z

    .line 3
    .line 4
    iget-object v1, p0, Lb0/s;->l:Landroid/os/Bundle;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const-string v3, "childFragmentManager"

    .line 10
    .line 11
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget-object v3, p0, Lb0/s;->E:Lb0/I;

    .line 18
    .line 19
    invoke-virtual {v3, v1}, Lb0/I;->U(Landroid/os/Bundle;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lb0/s;->E:Lb0/I;

    .line 23
    .line 24
    iput-boolean v2, v1, Lb0/I;->G:Z

    .line 25
    .line 26
    iput-boolean v2, v1, Lb0/I;->H:Z

    .line 27
    .line 28
    iget-object v3, v1, Lb0/I;->N:Lb0/L;

    .line 29
    .line 30
    iput-boolean v2, v3, Lb0/L;->g:Z

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Lb0/I;->u(I)V

    .line 33
    .line 34
    .line 35
    :cond_0
    iget-object v1, p0, Lb0/s;->E:Lb0/I;

    .line 36
    .line 37
    iget v3, v1, Lb0/I;->u:I

    .line 38
    .line 39
    if-lt v3, v0, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    iput-boolean v2, v1, Lb0/I;->G:Z

    .line 43
    .line 44
    iput-boolean v2, v1, Lb0/I;->H:Z

    .line 45
    .line 46
    iget-object v3, v1, Lb0/I;->N:Lb0/L;

    .line 47
    .line 48
    iput-boolean v2, v3, Lb0/L;->g:Z

    .line 49
    .line 50
    invoke-virtual {v1, v0}, Lb0/I;->u(I)V

    .line 51
    .line 52
    .line 53
    :goto_0
    new-instance v1, Landroid/os/Handler;

    .line 54
    .line 55
    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    .line 56
    .line 57
    .line 58
    iget v1, p0, Lb0/s;->H:I

    .line 59
    .line 60
    if-nez v1, :cond_2

    .line 61
    .line 62
    move v1, v0

    .line 63
    goto :goto_1

    .line 64
    :cond_2
    move v1, v2

    .line 65
    :goto_1
    iput-boolean v1, p0, Lb0/p;->h0:Z

    .line 66
    .line 67
    if-eqz p1, :cond_3

    .line 68
    .line 69
    const-string v1, "android:style"

    .line 70
    .line 71
    invoke-virtual {p1, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    iput v1, p0, Lb0/p;->e0:I

    .line 76
    .line 77
    const-string v1, "android:theme"

    .line 78
    .line 79
    invoke-virtual {p1, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    iput v1, p0, Lb0/p;->f0:I

    .line 84
    .line 85
    const-string v1, "android:cancelable"

    .line 86
    .line 87
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    iput-boolean v0, p0, Lb0/p;->g0:Z

    .line 92
    .line 93
    const-string v0, "android:showsDialog"

    .line 94
    .line 95
    iget-boolean v1, p0, Lb0/p;->h0:Z

    .line 96
    .line 97
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    iput-boolean v0, p0, Lb0/p;->h0:Z

    .line 102
    .line 103
    const-string v0, "android:backStackId"

    .line 104
    .line 105
    const/4 v1, -0x1

    .line 106
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    iput p1, p0, Lb0/p;->i0:I

    .line 111
    .line 112
    :cond_3
    return-void
.end method

.method public final s()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lb0/s;->N:Z

    .line 3
    .line 4
    iget-object v1, p0, Lb0/p;->l0:Landroid/app/Dialog;

    .line 5
    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    iput-boolean v0, p0, Lb0/p;->m0:Z

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lb0/p;->l0:Landroid/app/Dialog;

    .line 15
    .line 16
    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    .line 17
    .line 18
    .line 19
    iget-boolean v1, p0, Lb0/p;->n0:Z

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    iget-object v1, p0, Lb0/p;->l0:Landroid/app/Dialog;

    .line 24
    .line 25
    invoke-virtual {p0, v1}, Lb0/p;->onDismiss(Landroid/content/DialogInterface;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    iput-object v0, p0, Lb0/p;->l0:Landroid/app/Dialog;

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    iput-boolean v0, p0, Lb0/p;->p0:Z

    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method public final t()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lb0/s;->N:Z

    .line 3
    .line 4
    iget-boolean v1, p0, Lb0/p;->o0:Z

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    iget-boolean v1, p0, Lb0/p;->n0:Z

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    iput-boolean v0, p0, Lb0/p;->n0:Z

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lb0/s;->X:Landroidx/lifecycle/z;

    .line 15
    .line 16
    iget-object v1, p0, Lb0/p;->k0:LB1/g;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroidx/lifecycle/z;->g(Landroidx/lifecycle/A;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final u(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .locals 8

    .line 1
    invoke-super {p0, p1}, Lb0/s;->u(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-boolean v0, p0, Lb0/p;->h0:Z

    .line 6
    .line 7
    const-string v1, "FragmentManager"

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    if-eqz v0, :cond_9

    .line 11
    .line 12
    iget-boolean v3, p0, Lb0/p;->j0:Z

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    goto/16 :goto_6

    .line 17
    .line 18
    :cond_0
    if-nez v0, :cond_1

    .line 19
    .line 20
    goto :goto_5

    .line 21
    :cond_1
    iget-boolean v0, p0, Lb0/p;->p0:Z

    .line 22
    .line 23
    if-nez v0, :cond_7

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    const/4 v3, 0x1

    .line 27
    :try_start_0
    iput-boolean v3, p0, Lb0/p;->j0:Z

    .line 28
    .line 29
    invoke-virtual {p0}, Lb0/p;->B()Landroid/app/Dialog;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    iput-object v4, p0, Lb0/p;->l0:Landroid/app/Dialog;

    .line 34
    .line 35
    iget-boolean v5, p0, Lb0/p;->h0:Z

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    if-eqz v5, :cond_6

    .line 39
    .line 40
    iget v5, p0, Lb0/p;->e0:I

    .line 41
    .line 42
    if-eq v5, v3, :cond_3

    .line 43
    .line 44
    if-eq v5, v2, :cond_3

    .line 45
    .line 46
    const/4 v7, 0x3

    .line 47
    if-eq v5, v7, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    invoke-virtual {v4}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    if-eqz v5, :cond_3

    .line 55
    .line 56
    const/16 v7, 0x18

    .line 57
    .line 58
    invoke-virtual {v5, v7}, Landroid/view/Window;->addFlags(I)V

    .line 59
    .line 60
    .line 61
    :cond_3
    invoke-virtual {v4, v3}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 62
    .line 63
    .line 64
    :goto_0
    iget-object v4, p0, Lb0/s;->D:Lb0/u;

    .line 65
    .line 66
    if-nez v4, :cond_4

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_4
    iget-object v6, v4, Lb0/u;->n:Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;

    .line 70
    .line 71
    :goto_1
    if-eqz v6, :cond_5

    .line 72
    .line 73
    iget-object v4, p0, Lb0/p;->l0:Landroid/app/Dialog;

    .line 74
    .line 75
    invoke-virtual {v4, v6}, Landroid/app/Dialog;->setOwnerActivity(Landroid/app/Activity;)V

    .line 76
    .line 77
    .line 78
    goto :goto_2

    .line 79
    :catchall_0
    move-exception p1

    .line 80
    goto :goto_4

    .line 81
    :cond_5
    :goto_2
    iget-object v4, p0, Lb0/p;->l0:Landroid/app/Dialog;

    .line 82
    .line 83
    iget-boolean v5, p0, Lb0/p;->g0:Z

    .line 84
    .line 85
    invoke-virtual {v4, v5}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 86
    .line 87
    .line 88
    iget-object v4, p0, Lb0/p;->l0:Landroid/app/Dialog;

    .line 89
    .line 90
    iget-object v5, p0, Lb0/p;->c0:Lb0/m;

    .line 91
    .line 92
    invoke-virtual {v4, v5}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 93
    .line 94
    .line 95
    iget-object v4, p0, Lb0/p;->l0:Landroid/app/Dialog;

    .line 96
    .line 97
    iget-object v5, p0, Lb0/p;->d0:Lb0/n;

    .line 98
    .line 99
    invoke-virtual {v4, v5}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 100
    .line 101
    .line 102
    iput-boolean v3, p0, Lb0/p;->p0:Z

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_6
    iput-object v6, p0, Lb0/p;->l0:Landroid/app/Dialog;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    .line 107
    :goto_3
    iput-boolean v0, p0, Lb0/p;->j0:Z

    .line 108
    .line 109
    goto :goto_5

    .line 110
    :goto_4
    iput-boolean v0, p0, Lb0/p;->j0:Z

    .line 111
    .line 112
    throw p1

    .line 113
    :cond_7
    :goto_5
    invoke-static {v2}, Lb0/I;->J(I)Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-eqz v0, :cond_8

    .line 118
    .line 119
    new-instance v0, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    const-string v2, "get layout inflater for DialogFragment "

    .line 122
    .line 123
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    const-string v2, " from dialog context"

    .line 130
    .line 131
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 139
    .line 140
    .line 141
    :cond_8
    iget-object v0, p0, Lb0/p;->l0:Landroid/app/Dialog;

    .line 142
    .line 143
    if-eqz v0, :cond_b

    .line 144
    .line 145
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-virtual {p1, v0}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    return-object p1

    .line 154
    :cond_9
    :goto_6
    invoke-static {v2}, Lb0/I;->J(I)Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-eqz v0, :cond_b

    .line 159
    .line 160
    new-instance v0, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    const-string v2, "getting layout inflater for DialogFragment "

    .line 163
    .line 164
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    iget-boolean v2, p0, Lb0/p;->h0:Z

    .line 175
    .line 176
    if-nez v2, :cond_a

    .line 177
    .line 178
    new-instance v2, Ljava/lang/StringBuilder;

    .line 179
    .line 180
    const-string v3, "mShowsDialog = false: "

    .line 181
    .line 182
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 193
    .line 194
    .line 195
    return-object p1

    .line 196
    :cond_a
    new-instance v2, Ljava/lang/StringBuilder;

    .line 197
    .line 198
    const-string v3, "mCreatingDialog = true: "

    .line 199
    .line 200
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 211
    .line 212
    .line 213
    :cond_b
    return-object p1
.end method

.method public final v(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lb0/p;->l0:Landroid/app/Dialog;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/app/Dialog;->onSaveInstanceState()Landroid/os/Bundle;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "android:dialogShowing"

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 13
    .line 14
    .line 15
    const-string v1, "android:savedDialogState"

    .line 16
    .line 17
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget v0, p0, Lb0/p;->e0:I

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    const-string v1, "android:style"

    .line 25
    .line 26
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    :cond_1
    iget v0, p0, Lb0/p;->f0:I

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    const-string v1, "android:theme"

    .line 34
    .line 35
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 36
    .line 37
    .line 38
    :cond_2
    iget-boolean v0, p0, Lb0/p;->g0:Z

    .line 39
    .line 40
    if-nez v0, :cond_3

    .line 41
    .line 42
    const-string v1, "android:cancelable"

    .line 43
    .line 44
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 45
    .line 46
    .line 47
    :cond_3
    iget-boolean v0, p0, Lb0/p;->h0:Z

    .line 48
    .line 49
    if-nez v0, :cond_4

    .line 50
    .line 51
    const-string v1, "android:showsDialog"

    .line 52
    .line 53
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 54
    .line 55
    .line 56
    :cond_4
    iget v0, p0, Lb0/p;->i0:I

    .line 57
    .line 58
    const/4 v1, -0x1

    .line 59
    if-eq v0, v1, :cond_5

    .line 60
    .line 61
    const-string v1, "android:backStackId"

    .line 62
    .line 63
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 64
    .line 65
    .line 66
    :cond_5
    return-void
.end method

.method public final w()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lb0/s;->N:Z

    .line 3
    .line 4
    iget-object v0, p0, Lb0/p;->l0:Landroid/app/Dialog;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput-boolean v1, p0, Lb0/p;->m0:Z

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lb0/p;->l0:Landroid/app/Dialog;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

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
    const-string v1, "<this>"

    .line 25
    .line 26
    invoke-static {v0, v1}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const v1, 0x7f0900e9

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    const v1, 0x7f0900ed

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    const v1, 0x7f0900ec

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    return-void
.end method

.method public final x()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lb0/s;->N:Z

    .line 3
    .line 4
    iget-object v0, p0, Lb0/p;->l0:Landroid/app/Dialog;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/app/Dialog;->hide()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final y(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lb0/s;->y(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lb0/p;->l0:Landroid/app/Dialog;

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    if-eqz p3, :cond_0

    .line 9
    .line 10
    const-string p1, "android:savedDialogState"

    .line 11
    .line 12
    invoke-virtual {p3, p1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    iget-object p2, p0, Lb0/p;->l0:Landroid/app/Dialog;

    .line 19
    .line 20
    invoke-virtual {p2, p1}, Landroid/app/Dialog;->onRestoreInstanceState(Landroid/os/Bundle;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

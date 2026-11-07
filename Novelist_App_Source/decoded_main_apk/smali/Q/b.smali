.class public final LQ/b;
.super LN/c;
.source "SourceFile"


# instance fields
.field public final d:Landroid/content/Context;

.field public e:LH/d;

.field public f:Ljava/util/concurrent/Executor;

.field public g:Landroid/os/CancellationSignal;

.field public final h:LO/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LQ/b;->d:Landroid/content/Context;

    .line 10
    .line 11
    new-instance p1, Landroid/os/Handler;

    .line 12
    .line 13
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 18
    .line 19
    .line 20
    new-instance v0, LO/c;

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-direct {v0, p0, p1, v1}, LO/c;-><init>(LN/c;Landroid/os/Handler;I)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, LQ/b;->h:LO/c;

    .line 27
    .line 28
    return-void
.end method

.method public static b(LH/k;)LF0/i;
    .locals 8

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p0, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, LH/k;->a:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x1

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const-string v0, "null cannot be cast to non-null type com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption"

    .line 21
    .line 22
    invoke-static {p0, v0}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    check-cast p0, Lh1/b;

    .line 26
    .line 27
    iget-object v1, p0, Lh1/b;->d:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v1}, LM0/r;->f(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object v2, p0, Lh1/b;->e:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v4, p0, Lh1/b;->f:Ljava/lang/String;

    .line 35
    .line 36
    new-instance v0, LF0/i;

    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    const/4 v5, 0x0

    .line 40
    const/4 v6, 0x0

    .line 41
    const/4 v7, 0x0

    .line 42
    invoke-direct/range {v0 .. v7}, LF0/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/util/List;)V

    .line 43
    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_0
    new-instance p0, LI/i;

    .line 47
    .line 48
    const-string v0, "GetSignInWithGoogleOption cannot be combined with other options."

    .line 49
    .line 50
    invoke-direct {p0, v0}, LI/i;-><init>(Ljava/lang/CharSequence;)V

    .line 51
    .line 52
    .line 53
    throw p0
.end method


# virtual methods
.method public final c(LF0/j;)LH/l;
    .locals 8

    .line 1
    iget-object v2, p1, LF0/j;->q:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz v2, :cond_5

    .line 5
    .line 6
    iget-object v1, p1, LF0/j;->k:Ljava/lang/String;

    .line 7
    .line 8
    const-string v3, "getId(...)"

    .line 9
    .line 10
    invoke-static {v1, v3}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v3, p1, LF0/j;->l:Ljava/lang/String;

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v3, v0

    .line 19
    :goto_0
    iget-object v4, p1, LF0/j;->m:Ljava/lang/String;

    .line 20
    .line 21
    if-eqz v4, :cond_1

    .line 22
    .line 23
    move-object v5, v4

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move-object v5, v0

    .line 26
    :goto_1
    iget-object v4, p1, LF0/j;->n:Ljava/lang/String;

    .line 27
    .line 28
    if-eqz v4, :cond_2

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_2
    move-object v4, v0

    .line 32
    :goto_2
    iget-object v6, p1, LF0/j;->r:Ljava/lang/String;

    .line 33
    .line 34
    if-eqz v6, :cond_3

    .line 35
    .line 36
    move-object v7, v6

    .line 37
    goto :goto_3

    .line 38
    :cond_3
    move-object v7, v0

    .line 39
    :goto_3
    iget-object p1, p1, LF0/j;->o:Landroid/net/Uri;

    .line 40
    .line 41
    if-eqz p1, :cond_4

    .line 42
    .line 43
    move-object v6, p1

    .line 44
    goto :goto_4

    .line 45
    :cond_4
    move-object v6, v0

    .line 46
    :goto_4
    new-instance v0, Lh1/c;

    .line 47
    .line 48
    invoke-direct/range {v0 .. v7}, Lh1/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    goto :goto_5

    .line 52
    :cond_5
    const-string p1, "GetSignInIntent"

    .line 53
    .line 54
    const-string v1, "Credential returned but no google Id found"

    .line 55
    .line 56
    invoke-static {p1, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    :goto_5
    if-eqz v0, :cond_6

    .line 60
    .line 61
    new-instance p1, LH/l;

    .line 62
    .line 63
    invoke-direct {p1, v0}, LH/l;-><init>(LH/c;)V

    .line 64
    .line 65
    .line 66
    return-object p1

    .line 67
    :cond_6
    new-instance p1, LI/e;

    .line 68
    .line 69
    const-string v0, "When attempting to convert get response, null credential found"

    .line 70
    .line 71
    invoke-direct {p1, v0}, LI/e;-><init>(Ljava/lang/CharSequence;)V

    .line 72
    .line 73
    .line 74
    throw p1
.end method

.method public final d()LH/d;
    .locals 1

    .line 1
    iget-object v0, p0, LQ/b;->e:LH/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {v0}, La2/h;->g(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    throw v0
.end method

.method public final e()Ljava/util/concurrent/Executor;
    .locals 1

    .line 1
    iget-object v0, p0, LQ/b;->f:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "executor"

    .line 7
    .line 8
    invoke-static {v0}, La2/h;->g(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    throw v0
.end method

.method public final f(LH/k;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;LH/d;)V
    .locals 8

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p4, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "executor"

    .line 12
    .line 13
    invoke-static {p3, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iput-object p2, p0, LQ/b;->g:Landroid/os/CancellationSignal;

    .line 17
    .line 18
    iput-object p4, p0, LQ/b;->e:LH/d;

    .line 19
    .line 20
    iput-object p3, p0, LQ/b;->f:Ljava/util/concurrent/Executor;

    .line 21
    .line 22
    sget-object p3, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:LM/h;

    .line 23
    .line 24
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-static {p2}, LM/h;->a(Landroid/os/CancellationSignal;)Z

    .line 28
    .line 29
    .line 30
    move-result p3

    .line 31
    if-eqz p3, :cond_0

    .line 32
    .line 33
    goto/16 :goto_0

    .line 34
    .line 35
    :cond_0
    :try_start_0
    invoke-static {p1}, LQ/b;->b(LH/k;)LF0/i;

    .line 36
    .line 37
    .line 38
    move-result-object p1
    :try_end_0
    .catch LI/i; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    iget-object p3, p0, LQ/b;->d:Landroid/content/Context;

    .line 40
    .line 41
    invoke-static {p3}, LS0/a;->v(Landroid/content/Context;)LY0/b;

    .line 42
    .line 43
    .line 44
    move-result-object p3

    .line 45
    iget-object v1, p1, LF0/i;->k:Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {v1}, LM0/r;->f(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object v4, p1, LF0/i;->n:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v2, p1, LF0/i;->l:Ljava/lang/String;

    .line 53
    .line 54
    iget-boolean v5, p1, LF0/i;->o:Z

    .line 55
    .line 56
    iget v6, p1, LF0/i;->p:I

    .line 57
    .line 58
    iget-object v7, p1, LF0/i;->q:Ljava/util/List;

    .line 59
    .line 60
    iget-object v3, p3, LY0/b;->k:Ljava/lang/String;

    .line 61
    .line 62
    new-instance v0, LF0/i;

    .line 63
    .line 64
    invoke-direct/range {v0 .. v7}, LF0/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/util/List;)V

    .line 65
    .line 66
    .line 67
    invoke-static {}, LL0/k;->b()LL0/k;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    sget-object p4, LY0/f;->e:LJ0/c;

    .line 72
    .line 73
    filled-new-array {p4}, [LJ0/c;

    .line 74
    .line 75
    .line 76
    move-result-object p4

    .line 77
    iput-object p4, p1, LL0/k;->a:Ljava/lang/Object;

    .line 78
    .line 79
    new-instance p4, LA/c;

    .line 80
    .line 81
    const/16 v1, 0x1a

    .line 82
    .line 83
    invoke-direct {p4, p3, v0, v1}, LA/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 84
    .line 85
    .line 86
    iput-object p4, p1, LL0/k;->d:Ljava/lang/Object;

    .line 87
    .line 88
    const/16 p4, 0x613

    .line 89
    .line 90
    iput p4, p1, LL0/k;->c:I

    .line 91
    .line 92
    invoke-virtual {p1}, LL0/k;->a()LL0/k;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    const/4 p4, 0x0

    .line 97
    invoke-virtual {p3, p4, p1}, LK0/i;->b(ILL0/k;)Lg1/i;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    new-instance p3, LM1/X;

    .line 102
    .line 103
    const/4 p4, 0x3

    .line 104
    invoke-direct {p3, p2, p0, p4}, LM1/X;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 105
    .line 106
    .line 107
    new-instance p4, LM1/K;

    .line 108
    .line 109
    const/16 v0, 0xa

    .line 110
    .line 111
    invoke-direct {p4, p3, v0}, LM1/K;-><init>(Ljava/lang/Object;I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, p4}, Lg1/i;->b(Lg1/d;)V

    .line 115
    .line 116
    .line 117
    new-instance p3, LO/b;

    .line 118
    .line 119
    const/4 p4, 0x1

    .line 120
    invoke-direct {p3, p0, p2, p4}, LO/b;-><init>(LN/c;Landroid/os/CancellationSignal;I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1, p3}, Lg1/i;->a(Lg1/c;)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :catch_0
    move-exception v0

    .line 128
    move-object p1, v0

    .line 129
    sget-object p3, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:LM/h;

    .line 130
    .line 131
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-static {p2}, LM/h;->a(Landroid/os/CancellationSignal;)Z

    .line 135
    .line 136
    .line 137
    move-result p2

    .line 138
    if-eqz p2, :cond_1

    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_1
    invoke-virtual {p0}, LQ/b;->e()Ljava/util/concurrent/Executor;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    new-instance p3, LM/c;

    .line 146
    .line 147
    const/16 p4, 0xb

    .line 148
    .line 149
    invoke-direct {p3, p0, p1, p4}, LM/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 150
    .line 151
    .line 152
    invoke-interface {p2, p3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 153
    .line 154
    .line 155
    :goto_0
    return-void
.end method

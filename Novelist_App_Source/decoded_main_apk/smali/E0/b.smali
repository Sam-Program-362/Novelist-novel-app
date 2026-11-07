.class public final LE0/b;
.super LH2/h;
.source "SourceFile"


# instance fields
.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LE0/b;->i:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/os/Looper;LM0/c;Ljava/lang/Object;LK0/j;LK0/k;)LK0/c;
    .locals 7

    .line 1
    iget v0, p0, LE0/b;->i:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super/range {p0 .. p6}, LH2/h;->a(Landroid/content/Context;Landroid/os/Looper;LM0/c;Ljava/lang/Object;LK0/j;LK0/k;)LK0/c;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :sswitch_0
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance p1, Ljava/lang/ClassCastException;

    .line 15
    .line 16
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 17
    .line 18
    .line 19
    throw p1

    .line 20
    :sswitch_1
    move-object v1, p1

    .line 21
    move-object v2, p2

    .line 22
    move-object v3, p3

    .line 23
    check-cast p4, Le1/a;

    .line 24
    .line 25
    new-instance v0, Lf1/a;

    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object p1, v3, LM0/c;->f:Ljava/io/Serializable;

    .line 31
    .line 32
    check-cast p1, Ljava/lang/Integer;

    .line 33
    .line 34
    new-instance v4, Landroid/os/Bundle;

    .line 35
    .line 36
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string p2, "com.google.android.gms.signin.internal.clientRequestedAccount"

    .line 40
    .line 41
    const/4 p3, 0x0

    .line 42
    invoke-virtual {v4, p2, p3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 43
    .line 44
    .line 45
    if-eqz p1, :cond_0

    .line 46
    .line 47
    const-string p2, "com.google.android.gms.common.internal.ClientSettings.sessionId"

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    invoke-virtual {v4, p2, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 54
    .line 55
    .line 56
    :cond_0
    const-string p1, "com.google.android.gms.signin.internal.offlineAccessRequested"

    .line 57
    .line 58
    const/4 p2, 0x0

    .line 59
    invoke-virtual {v4, p1, p2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 60
    .line 61
    .line 62
    const-string p1, "com.google.android.gms.signin.internal.idTokenRequested"

    .line 63
    .line 64
    invoke-virtual {v4, p1, p2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 65
    .line 66
    .line 67
    const-string p1, "com.google.android.gms.signin.internal.serverClientId"

    .line 68
    .line 69
    invoke-virtual {v4, p1, p3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    const-string p1, "com.google.android.gms.signin.internal.usePromptModeForAuthCode"

    .line 73
    .line 74
    const/4 p4, 0x1

    .line 75
    invoke-virtual {v4, p1, p4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 76
    .line 77
    .line 78
    const-string p1, "com.google.android.gms.signin.internal.forceCodeForRefreshToken"

    .line 79
    .line 80
    invoke-virtual {v4, p1, p2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 81
    .line 82
    .line 83
    const-string p1, "com.google.android.gms.signin.internal.hostedDomain"

    .line 84
    .line 85
    invoke-virtual {v4, p1, p3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    const-string p1, "com.google.android.gms.signin.internal.logSessionId"

    .line 89
    .line 90
    invoke-virtual {v4, p1, p3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    const-string p1, "com.google.android.gms.signin.internal.waitForAccessTokenRefresh"

    .line 94
    .line 95
    invoke-virtual {v4, p1, p2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 96
    .line 97
    .line 98
    move-object v5, p5

    .line 99
    move-object v6, p6

    .line 100
    invoke-direct/range {v0 .. v6}, Lf1/a;-><init>(Landroid/content/Context;Landroid/os/Looper;LM0/c;Landroid/os/Bundle;LK0/j;LK0/k;)V

    .line 101
    .line 102
    .line 103
    return-object v0

    .line 104
    :sswitch_2
    move-object v1, p1

    .line 105
    move-object v2, p2

    .line 106
    move-object v3, p3

    .line 107
    move-object v4, p4

    .line 108
    check-cast v4, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 109
    .line 110
    new-instance v0, LH0/e;

    .line 111
    .line 112
    move-object v5, p5

    .line 113
    check-cast v5, LL0/p;

    .line 114
    .line 115
    move-object v6, p6

    .line 116
    check-cast v6, LL0/p;

    .line 117
    .line 118
    invoke-direct/range {v0 .. v6}, LH0/e;-><init>(Landroid/content/Context;Landroid/os/Looper;LM0/c;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;LL0/p;LL0/p;)V

    .line 119
    .line 120
    .line 121
    return-object v0

    .line 122
    :sswitch_3
    move-object v1, p1

    .line 123
    move-object v2, p2

    .line 124
    move-object v3, p3

    .line 125
    move-object v4, p4

    .line 126
    check-cast v4, LE0/c;

    .line 127
    .line 128
    new-instance v0, LY0/o;

    .line 129
    .line 130
    move-object v5, p5

    .line 131
    check-cast v5, LL0/p;

    .line 132
    .line 133
    move-object v6, p6

    .line 134
    check-cast v6, LL0/p;

    .line 135
    .line 136
    invoke-direct/range {v0 .. v6}, LY0/o;-><init>(Landroid/content/Context;Landroid/os/Looper;LM0/c;LE0/c;LL0/p;LL0/p;)V

    .line 137
    .line 138
    .line 139
    return-object v0

    .line 140
    nop

    .line 141
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_3
        0x1 -> :sswitch_2
        0x6 -> :sswitch_1
        0x7 -> :sswitch_0
    .end sparse-switch
.end method

.method public b(Landroid/content/Context;Landroid/os/Looper;LM0/c;Ljava/lang/Object;LL0/p;LL0/p;)LK0/c;
    .locals 8

    .line 1
    iget v0, p0, LE0/b;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super/range {p0 .. p6}, LH2/h;->b(Landroid/content/Context;Landroid/os/Looper;LM0/c;Ljava/lang/Object;LL0/p;LL0/p;)LK0/c;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :pswitch_0
    move-object v1, p1

    .line 12
    move-object v2, p2

    .line 13
    move-object v3, p3

    .line 14
    move-object v4, p5

    .line 15
    move-object v5, p6

    .line 16
    check-cast p4, LF0/k;

    .line 17
    .line 18
    new-instance v0, LY0/q;

    .line 19
    .line 20
    invoke-direct/range {v0 .. v5}, LY0/q;-><init>(Landroid/content/Context;Landroid/os/Looper;LM0/c;LL0/p;LL0/p;)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_1
    move-object v1, p1

    .line 25
    move-object v2, p2

    .line 26
    move-object v3, p3

    .line 27
    move-object v4, p5

    .line 28
    move-object v5, p6

    .line 29
    check-cast p4, LF0/n;

    .line 30
    .line 31
    new-instance v0, LY0/e;

    .line 32
    .line 33
    invoke-direct/range {v0 .. v5}, LY0/e;-><init>(Landroid/content/Context;Landroid/os/Looper;LM0/c;LL0/p;LL0/p;)V

    .line 34
    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_2
    move-object v1, p1

    .line 38
    move-object v2, p2

    .line 39
    move-object v3, p3

    .line 40
    move-object v4, p5

    .line 41
    move-object v5, p6

    .line 42
    check-cast p4, LK0/a;

    .line 43
    .line 44
    const-string p1, "context"

    .line 45
    .line 46
    invoke-static {v1, p1}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const-string p1, "looper"

    .line 50
    .line 51
    invoke-static {v2, p1}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const-string p1, "apiOptions"

    .line 55
    .line 56
    invoke-static {p4, p1}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    new-instance v0, LX0/e;

    .line 60
    .line 61
    const/16 v3, 0x160

    .line 62
    .line 63
    const/4 v7, 0x0

    .line 64
    move-object v6, v5

    .line 65
    move-object v5, v4

    .line 66
    move-object v4, p3

    .line 67
    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/common/internal/a;-><init>(Landroid/content/Context;Landroid/os/Looper;ILM0/c;LK0/j;LK0/k;I)V

    .line 68
    .line 69
    .line 70
    return-object v0

    .line 71
    :pswitch_3
    move-object v1, p1

    .line 72
    move-object v2, p2

    .line 73
    move-object v3, p3

    .line 74
    move-object v4, p5

    .line 75
    move-object v5, p6

    .line 76
    check-cast p4, LM0/k;

    .line 77
    .line 78
    new-instance v0, LO0/c;

    .line 79
    .line 80
    move-object v6, v5

    .line 81
    move-object v5, v4

    .line 82
    move-object v4, p4

    .line 83
    invoke-direct/range {v0 .. v6}, LO0/c;-><init>(Landroid/content/Context;Landroid/os/Looper;LM0/c;LM0/k;LL0/p;LL0/p;)V

    .line 84
    .line 85
    .line 86
    return-object v0

    .line 87
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class public final LL0/y;
.super Lf1/c;
.source "SourceFile"

# interfaces
.implements LK0/j;
.implements LK0/k;


# static fields
.field public static final i:LE0/b;


# instance fields
.field public final b:Landroid/content/Context;

.field public final c:Landroid/os/Handler;

.field public final d:LE0/b;

.field public final e:Ljava/util/Set;

.field public final f:LM0/c;

.field public g:Lf1/a;

.field public h:LL0/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Le1/b;->a:LE0/b;

    .line 2
    .line 3
    sput-object v0, LL0/y;->i:LE0/b;

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LZ0/d;LM0/c;)V
    .locals 2

    .line 1
    const-string v0, "com.google.android.gms.signin.internal.ISignInCallbacks"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {p0, v0, v1}, LY0/h;-><init>(Ljava/lang/String;I)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, LL0/y;->b:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p2, p0, LL0/y;->c:Landroid/os/Handler;

    .line 10
    .line 11
    iput-object p3, p0, LL0/y;->f:LM0/c;

    .line 12
    .line 13
    iget-object p1, p3, LM0/c;->a:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Ljava/util/Set;

    .line 16
    .line 17
    iput-object p1, p0, LL0/y;->e:Ljava/util/Set;

    .line 18
    .line 19
    sget-object p1, LL0/y;->i:LE0/b;

    .line 20
    .line 21
    iput-object p1, p0, LL0/y;->d:LE0/b;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final d(I)V
    .locals 3

    .line 1
    iget-object v0, p0, LL0/y;->h:LL0/r;

    .line 2
    .line 3
    iget-object v1, v0, LL0/r;->f:LL0/d;

    .line 4
    .line 5
    iget-object v1, v1, LL0/d;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    iget-object v0, v0, LL0/r;->b:LL0/a;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, LL0/p;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-boolean v1, v0, LL0/p;->i:Z

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    new-instance p1, LJ0/a;

    .line 22
    .line 23
    const/16 v1, 0x11

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-direct {p1, v1, v2, v2}, LJ0/a;-><init>(ILandroid/app/PendingIntent;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p1}, LL0/p;->p(LJ0/a;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    invoke-virtual {v0, p1}, LL0/p;->d(I)V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-void
.end method

.method public final e()V
    .locals 9

    .line 1
    iget-object v0, p0, LL0/y;->g:Lf1/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-string v1, "<<default account>>"

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x1

    .line 10
    const/4 v4, 0x0

    .line 11
    :try_start_0
    iget-object v5, v0, Lf1/a;->z:LM0/c;

    .line 12
    .line 13
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance v5, Landroid/accounts/Account;

    .line 17
    .line 18
    const-string v6, "com.google"

    .line 19
    .line 20
    invoke-direct {v5, v1, v6}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v6, v5, Landroid/accounts/Account;->name:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    iget-object v1, v0, Lcom/google/android/gms/common/internal/a;->c:Landroid/content/Context;

    .line 32
    .line 33
    invoke-static {v1}, LH0/b;->a(Landroid/content/Context;)LH0/b;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1}, LH0/b;->b()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    goto :goto_0

    .line 42
    :catch_0
    move-exception v0

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    move-object v1, v4

    .line 45
    :goto_0
    new-instance v6, LM0/n;

    .line 46
    .line 47
    iget-object v7, v0, Lf1/a;->B:Ljava/lang/Integer;

    .line 48
    .line 49
    invoke-static {v7}, LM0/r;->f(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    const/4 v8, 0x2

    .line 57
    invoke-direct {v6, v8, v5, v7, v1}, LM0/n;-><init>(ILandroid/accounts/Account;ILcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/a;->q()Landroid/os/IInterface;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Lf1/d;

    .line 65
    .line 66
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    iget-object v5, v0, LY0/a;->c:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {v1, v5}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    sget v5, LZ0/a;->a:I

    .line 76
    .line 77
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 78
    .line 79
    .line 80
    const/16 v5, 0x4f45

    .line 81
    .line 82
    invoke-static {v1, v5}, LH2/h;->Q(Landroid/os/Parcel;I)I

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    const/4 v7, 0x4

    .line 87
    invoke-static {v1, v3, v7}, LH2/h;->P(Landroid/os/Parcel;II)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 91
    .line 92
    .line 93
    invoke-static {v1, v8, v6, v2}, LH2/h;->J(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    .line 94
    .line 95
    .line 96
    invoke-static {v1, v5}, LH2/h;->R(Landroid/os/Parcel;I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1, p0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 100
    .line 101
    .line 102
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 103
    .line 104
    .line 105
    move-result-object v5
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 106
    :try_start_1
    iget-object v0, v0, LY0/a;->b:Landroid/os/IBinder;

    .line 107
    .line 108
    const/16 v6, 0xc

    .line 109
    .line 110
    invoke-interface {v0, v6, v1, v5, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 111
    .line 112
    .line 113
    invoke-virtual {v5}, Landroid/os/Parcel;->readException()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 114
    .line 115
    .line 116
    :try_start_2
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v5}, Landroid/os/Parcel;->recycle()V

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :catchall_0
    move-exception v0

    .line 124
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v5}, Landroid/os/Parcel;->recycle()V

    .line 128
    .line 129
    .line 130
    throw v0
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0

    .line 131
    :goto_1
    const-string v1, "Remote service probably died when signIn is called"

    .line 132
    .line 133
    const-string v5, "SignInClientImpl"

    .line 134
    .line 135
    invoke-static {v5, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 136
    .line 137
    .line 138
    :try_start_3
    new-instance v1, Lf1/f;

    .line 139
    .line 140
    new-instance v6, LJ0/a;

    .line 141
    .line 142
    const/16 v7, 0x8

    .line 143
    .line 144
    invoke-direct {v6, v7, v4, v4}, LJ0/a;-><init>(ILandroid/app/PendingIntent;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-direct {v1, v3, v6, v4}, Lf1/f;-><init>(ILJ0/a;LM0/o;)V

    .line 148
    .line 149
    .line 150
    new-instance v3, LA/a;

    .line 151
    .line 152
    const/4 v4, 0x3

    .line 153
    invoke-direct {v3, p0, v1, v4, v2}, LA/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 154
    .line 155
    .line 156
    iget-object v1, p0, LL0/y;->c:Landroid/os/Handler;

    .line 157
    .line 158
    invoke-virtual {v1, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_1

    .line 159
    .line 160
    .line 161
    goto :goto_2

    .line 162
    :catch_1
    const-string v1, "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException."

    .line 163
    .line 164
    invoke-static {v5, v1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 165
    .line 166
    .line 167
    :goto_2
    return-void
.end method

.method public final j(LJ0/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, LL0/y;->h:LL0/r;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LL0/r;->b(LJ0/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

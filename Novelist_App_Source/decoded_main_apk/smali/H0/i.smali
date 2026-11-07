.class public final LH0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC1/m;
.implements Ll2/d;
.implements LL0/i;
.implements Ld/c;
.implements Lk/N;
.implements Lj/o;
.implements Ll0/L;
.implements Ll1/c;
.implements Lr1/B;
.implements Ls0/m;


# static fields
.field public static m:LH0/i;


# instance fields
.field public final synthetic k:I

.field public l:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 4

    const/16 v0, 0x19

    iput v0, p0, LH0/i;->k:I

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance v0, Ljava/util/LinkedHashMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/high16 v3, 0x3f400000    # 0.75f

    invoke-direct {v0, v2, v3, v1}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    iput-object v0, p0, LH0/i;->l:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LC1/f;)V
    .locals 4

    const/4 v0, 0x2

    iput v0, p0, LH0/i;->k:I

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance v0, LB1/s;

    sget-object v1, LC1/j;->a:LC1/j;

    const/4 v2, 0x0

    .line 12
    const-string v3, "flutter/keyevent"

    invoke-direct {v0, p1, v3, v1, v2}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 13
    iput-object v0, p0, LH0/i;->l:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, LH0/i;->k:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LH0/b;->a(Landroid/content/Context;)LH0/b;

    move-result-object p1

    iput-object p1, p0, LH0/i;->l:Ljava/lang/Object;

    .line 3
    invoke-virtual {p1}, LH0/b;->b()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 4
    const-string v0, "defaultGoogleSignInAccount"

    invoke-virtual {p1, v0}, LH0/b;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "googleSignInOptions"

    .line 6
    invoke-static {v1, v0}, LH0/b;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, LH0/b;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 7
    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->b(Ljava/lang/String;)Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    :goto_0
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LH0/i;->k:I

    iput-object p1, p0, LH0/i;->l:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lt1/c;)V
    .locals 5

    const/4 v0, 0x6

    iput v0, p0, LH0/i;->k:I

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance v0, LB1/g;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, LB1/g;-><init>(Ljava/lang/Object;I)V

    .line 16
    new-instance v1, LB1/s;

    sget-object v2, LC1/k;->a:LC1/k;

    const/4 v3, 0x0

    .line 17
    const-string v4, "flutter/scribe"

    invoke-direct {v1, p1, v4, v2, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 18
    invoke-virtual {v1, v0}, LB1/s;->z(LC1/m;)V

    return-void
.end method

.method public static t(I)Z
    .locals 1

    .line 1
    const/16 v0, 0x30

    .line 2
    .line 3
    if-gt v0, p0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x39

    .line 6
    .line 7
    if-le p0, v0, :cond_2

    .line 8
    .line 9
    :cond_0
    const/16 v0, 0x23

    .line 10
    .line 11
    if-eq p0, v0, :cond_2

    .line 12
    .line 13
    const/16 v0, 0x2a

    .line 14
    .line 15
    if-ne p0, v0, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 21
    return p0
.end method

.method private final v(LA/c;LB1/o;)V
    .locals 6

    .line 1
    iget-object v0, p0, LH0/i;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LA/c;

    .line 4
    .line 5
    iget-object v1, v0, LA/c;->m:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, LF1/a;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v1, p1, LA/c;->l:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ljava/lang/String;

    .line 15
    .line 16
    iget-object p1, p1, LA/c;->m:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const-string v2, "ProcessText.processTextAction"

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v3, 0x0

    .line 28
    const-string v4, "error"

    .line 29
    .line 30
    if-nez v2, :cond_2

    .line 31
    .line 32
    const-string p1, "ProcessText.queryTextActions"

    .line 33
    .line 34
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-nez p1, :cond_1

    .line 39
    .line 40
    invoke-virtual {p2}, LB1/o;->b()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    :try_start_0
    iget-object p1, v0, LA/c;->m:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, LF1/a;

    .line 47
    .line 48
    invoke-virtual {p1}, LF1/a;->c()Ljava/util/HashMap;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p2, p1}, LB1/o;->d(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :catch_0
    move-exception p1

    .line 57
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p2, v4, p1, v3}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    :try_start_1
    check-cast p1, Ljava/util/ArrayList;

    .line 66
    .line 67
    const/4 v1, 0x0

    .line 68
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    check-cast v1, Ljava/lang/String;

    .line 73
    .line 74
    const/4 v2, 0x1

    .line 75
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    check-cast v2, Ljava/lang/String;

    .line 80
    .line 81
    const/4 v5, 0x2

    .line 82
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    check-cast p1, Ljava/lang/Boolean;

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    iget-object v0, v0, LA/c;->m:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v0, LF1/a;

    .line 95
    .line 96
    invoke-virtual {v0, v1, v2, p1, p2}, LF1/a;->b(Ljava/lang/String;Ljava/lang/String;ZLB1/o;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :catch_1
    move-exception p1

    .line 101
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p2, v4, p1, v3}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    :goto_0
    return-void
.end method

.method public static declared-synchronized w(Landroid/content/Context;)LH0/i;
    .locals 3

    .line 1
    const-class v0, LH0/i;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const-class v1, LH0/i;

    .line 9
    .line 10
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    :try_start_1
    sget-object v2, LH0/i;->m:LH0/i;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    :goto_0
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    :try_start_3
    new-instance v2, LH0/i;

    .line 18
    .line 19
    invoke-direct {v2, p0}, LH0/i;-><init>(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    sput-object v2, LH0/i;->m:LH0/i;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :goto_1
    monitor-exit v0

    .line 26
    return-object v2

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 29
    :try_start_5
    throw p0

    .line 30
    :catchall_1
    move-exception p0

    .line 31
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 32
    throw p0
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, LH0/i;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LB1/o;

    .line 4
    .line 5
    const-string v1, "sqlite_error"

    .line 6
    .line 7
    invoke-virtual {v0, v1, p2, p1}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget v0, p0, LH0/i;->k:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    :pswitch_0
    check-cast p2, Lg1/e;

    .line 9
    .line 10
    iget-object v0, p0, LH0/i;->l:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, LY0/b;

    .line 13
    .line 14
    check-cast p1, LY0/e;

    .line 15
    .line 16
    new-instance v1, LY0/d;

    .line 17
    .line 18
    invoke-direct {v1, v0, p2, v2}, LY0/d;-><init>(LK0/i;Lg1/e;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->q()Landroid/os/IInterface;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, LY0/s;

    .line 26
    .line 27
    invoke-static {}, LY0/f;->a()LK0/f;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    iget-object v0, v0, LY0/b;->k:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {p1}, LY0/a;->d()Landroid/os/Parcel;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    sget v3, LY0/n;->a:I

    .line 38
    .line 39
    invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v2, p2}, LY0/n;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 46
    .line 47
    .line 48
    const/4 p2, 0x2

    .line 49
    invoke-virtual {p1, v2, p2}, LY0/a;->e(Landroid/os/Parcel;I)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_1
    check-cast p2, Lg1/e;

    .line 54
    .line 55
    iget-object v0, p0, LH0/i;->l:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, Lcom/google/android/gms/identitycredentials/GetCredentialRequest;

    .line 58
    .line 59
    check-cast p1, LX0/e;

    .line 60
    .line 61
    new-instance v3, LX0/f;

    .line 62
    .line 63
    invoke-direct {v3, p2, v1}, LX0/f;-><init>(Lg1/e;I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->q()Landroid/os/IInterface;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    check-cast p1, LX0/d;

    .line 71
    .line 72
    new-instance p2, LK0/g;

    .line 73
    .line 74
    const/4 v4, -0x1

    .line 75
    invoke-direct {p2, v4, v4, v2, v1}, LK0/g;-><init>(IIIZ)V

    .line 76
    .line 77
    .line 78
    new-instance v4, LK0/f;

    .line 79
    .line 80
    invoke-direct {v4, p2, v2}, LK0/f;-><init>(LK0/g;Z)V

    .line 81
    .line 82
    .line 83
    iput-boolean v2, v4, LK0/f;->m:Z

    .line 84
    .line 85
    check-cast p1, LX0/b;

    .line 86
    .line 87
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    const-string v2, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService"

    .line 92
    .line 93
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    sget v2, Lc1/a;->a:I

    .line 97
    .line 98
    invoke-virtual {p2, v3}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 99
    .line 100
    .line 101
    invoke-static {p2, v0}, Lc1/a;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 102
    .line 103
    .line 104
    invoke-static {p2, v4}, Lc1/a;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, p2, v1}, LX0/b;->d(Landroid/os/Parcel;I)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :pswitch_2
    check-cast p1, LO0/c;

    .line 112
    .line 113
    check-cast p2, Lg1/e;

    .line 114
    .line 115
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->q()Landroid/os/IInterface;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    check-cast p1, LO0/a;

    .line 120
    .line 121
    iget-object v0, p0, LH0/i;->l:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v0, LM0/j;

    .line 124
    .line 125
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    iget-object v4, p1, LY0/a;->c:Ljava/lang/String;

    .line 130
    .line 131
    invoke-virtual {v3, v4}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    sget v4, LZ0/a;->a:I

    .line 135
    .line 136
    if-nez v0, :cond_0

    .line 137
    .line 138
    invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 139
    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_0
    invoke-virtual {v3, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v3, v2}, LM0/j;->writeToParcel(Landroid/os/Parcel;I)V

    .line 146
    .line 147
    .line 148
    :goto_0
    :try_start_0
    iget-object p1, p1, LY0/a;->b:Landroid/os/IBinder;

    .line 149
    .line 150
    const/4 v0, 0x0

    .line 151
    invoke-interface {p1, v1, v3, v0, v1}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 152
    .line 153
    .line 154
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p2, v0}, Lg1/e;->b(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    return-void

    .line 161
    :catchall_0
    move-exception p1

    .line 162
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 163
    .line 164
    .line 165
    throw p1

    .line 166
    nop

    .line 167
    :pswitch_data_0
    .packed-switch 0xd
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public b(Lj/j;Z)V
    .locals 2

    .line 1
    instance-of v0, p1, Lj/t;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lj/t;

    .line 7
    .line 8
    iget-object v0, v0, Lj/t;->v:Lj/j;

    .line 9
    .line 10
    invoke-virtual {v0}, Lj/j;->j()Lj/j;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Lj/j;->c(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, LH0/i;->l:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lk/i;

    .line 21
    .line 22
    iget-object v0, v0, Lk/i;->o:Lj/o;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-interface {v0, p1, p2}, Lj/o;->b(Lj/j;Z)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public c(Lj/j;Landroid/view/MenuItem;)V
    .locals 0

    .line 1
    iget-object p2, p0, LH0/i;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p2, Lj/g;

    .line 4
    .line 5
    iget-object p2, p2, Lj/g;->p:Landroid/os/Handler;

    .line 6
    .line 7
    invoke-virtual {p2, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public d()[Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LH0/i;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;

    .line 4
    .line 5
    invoke-interface {v0}, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;->getSupportedFeatures()[Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public e(Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p1, Ld/b;

    .line 2
    .line 3
    iget-object v0, p0, LH0/i;->l:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lb0/I;

    .line 6
    .line 7
    iget-object v1, v0, Lb0/I;->E:Ljava/util/ArrayDeque;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lb0/E;

    .line 14
    .line 15
    const-string v2, "FragmentManager"

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    new-instance p1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v0, "No IntentSenders were started for "

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    iget-object v3, v1, Lb0/E;->k:Ljava/lang/String;

    .line 38
    .line 39
    iget v1, v1, Lb0/E;->l:I

    .line 40
    .line 41
    iget-object v0, v0, Lb0/I;->c:LB1/s;

    .line 42
    .line 43
    invoke-virtual {v0, v3}, LB1/s;->j(Ljava/lang/String;)Lb0/s;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-nez v0, :cond_1

    .line 48
    .line 49
    new-instance p1, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string v0, "Intent Sender result delivered for unknown Fragment "

    .line 52
    .line 53
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-static {v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_1
    iget v2, p1, Ld/b;->k:I

    .line 68
    .line 69
    iget-object p1, p1, Ld/b;->l:Landroid/content/Intent;

    .line 70
    .line 71
    invoke-virtual {v0, v1, v2, p1}, Lb0/s;->p(IILandroid/content/Intent;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public f()I
    .locals 2

    .line 1
    iget-object v0, p0, LH0/i;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ll0/t;

    .line 4
    .line 5
    iget v1, v0, Ll0/t;->f:I

    .line 6
    .line 7
    invoke-virtual {v0}, Ll0/t;->t()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    sub-int/2addr v1, v0

    .line 12
    return v1
.end method

.method public g()V
    .locals 3

    .line 1
    iget-object v0, p0, LH0/i;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lr1/C;

    .line 4
    .line 5
    iget-object v1, v0, Lr1/C;->a:Lr1/h;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, Lr1/C;->b:Lio/flutter/embedding/engine/renderer/k;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v2, v0, Lr1/C;->d:Lio/flutter/embedding/engine/renderer/a;

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Lio/flutter/embedding/engine/renderer/k;->g(Lio/flutter/embedding/engine/renderer/l;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    const/4 v1, 0x0

    .line 21
    iput-object v1, v0, Lr1/C;->b:Lio/flutter/embedding/engine/renderer/k;

    .line 22
    .line 23
    return-void
.end method

.method public getStatics()Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;
    .locals 2

    .line 1
    iget-object v0, p0, LH0/i;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;

    .line 4
    .line 5
    invoke-interface {v0}, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;->getStatics()Ljava/lang/reflect/InvocationHandler;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-class v1, Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;

    .line 10
    .line 11
    invoke-static {v1, v0}, LE2/a;->d(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;

    .line 16
    .line 17
    return-object v0
.end method

.method public getWebkitToCompatConverter()Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;
    .locals 2

    .line 1
    iget-object v0, p0, LH0/i;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;

    .line 4
    .line 5
    invoke-interface {v0}, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;->getWebkitToCompatConverter()Ljava/lang/reflect/InvocationHandler;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-class v1, Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;

    .line 10
    .line 11
    invoke-static {v1, v0}, LE2/a;->d(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;

    .line 16
    .line 17
    return-object v0
.end method

.method public h(Ll2/e;LR1/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LH0/i;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LH0/i;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lb1/Q;

    .line 9
    .line 10
    new-instance v1, LK1/B;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v1, p1, v2}, LK1/B;-><init>(Ll2/e;I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1, p2}, Lb1/Q;->h(Ll2/e;LR1/c;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    sget-object p2, LS1/a;->k:LS1/a;

    .line 21
    .line 22
    if-ne p1, p2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    sget-object p1, LO1/g;->a:LO1/g;

    .line 26
    .line 27
    :goto_0
    return-object p1

    .line 28
    :pswitch_0
    iget-object v0, p0, LH0/i;->l:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Ll2/d;

    .line 31
    .line 32
    new-instance v1, LK1/B;

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-direct {v1, p1, v2}, LK1/B;-><init>(Ll2/e;I)V

    .line 36
    .line 37
    .line 38
    invoke-interface {v0, v1, p2}, Ll2/d;->h(Ll2/e;LR1/c;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    sget-object p2, LS1/a;->k:LS1/a;

    .line 43
    .line 44
    if-ne p1, p2, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    sget-object p1, LO1/g;->a:LO1/g;

    .line 48
    .line 49
    :goto_1
    return-object p1

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_0
    .end packed-switch
.end method

.method public i(Landroid/view/View;)I
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ll0/u;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Ll0/u;

    .line 16
    .line 17
    iget-object p1, p1, Ll0/u;->a:Landroid/graphics/Rect;

    .line 18
    .line 19
    iget p1, p1, Landroid/graphics/Rect;->left:I

    .line 20
    .line 21
    sub-int/2addr v1, p1

    .line 22
    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 23
    .line 24
    sub-int/2addr v1, p1

    .line 25
    return v1
.end method

.method public j(Lj/j;)Z
    .locals 3

    .line 1
    iget-object v0, p0, LH0/i;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lk/i;

    .line 4
    .line 5
    iget-object v1, v0, Lk/i;->m:Lj/j;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-ne p1, v1, :cond_0

    .line 9
    .line 10
    return v2

    .line 11
    :cond_0
    move-object v1, p1

    .line 12
    check-cast v1, Lj/t;

    .line 13
    .line 14
    iget-object v1, v1, Lj/t;->w:Lj/k;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v0, v0, Lk/i;->o:Lj/o;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-interface {v0, p1}, Lj/o;->j(Lj/j;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1

    .line 31
    :cond_1
    return v2
.end method

.method public k(LA/c;LB1/o;)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget v3, v1, LH0/i;->k:I

    .line 8
    .line 9
    const/16 v4, 0xb

    .line 10
    .line 11
    const/16 v10, 0x8

    .line 12
    .line 13
    const/4 v11, 0x2

    .line 14
    const/4 v12, 0x3

    .line 15
    const/4 v13, 0x4

    .line 16
    const/4 v14, 0x0

    .line 17
    const/4 v15, 0x0

    .line 18
    const-string v5, "error"

    .line 19
    .line 20
    const/4 v6, 0x1

    .line 21
    packed-switch v3, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    :pswitch_0
    const-string v3, "data"

    .line 25
    .line 26
    iget-object v7, v1, LH0/i;->l:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v7, LA/c;

    .line 29
    .line 30
    iget-object v8, v7, LA/c;->m:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v8, LB1/g;

    .line 33
    .line 34
    if-nez v8, :cond_0

    .line 35
    .line 36
    goto/16 :goto_d

    .line 37
    .line 38
    :cond_0
    iget-object v8, v0, LA/c;->l:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v8, Ljava/lang/String;

    .line 41
    .line 42
    iget-object v0, v0, LA/c;->m:Ljava/lang/Object;

    .line 43
    .line 44
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    .line 48
    .line 49
    .line 50
    move-result v18

    .line 51
    sparse-switch v18, :sswitch_data_0

    .line 52
    .line 53
    .line 54
    :goto_0
    const/16 v18, -0x1

    .line 55
    .line 56
    goto/16 :goto_1

    .line 57
    .line 58
    :sswitch_0
    const-string v9, "TextInput.requestAutofill"

    .line 59
    .line 60
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v8

    .line 64
    if-nez v8, :cond_1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    const/16 v18, 0x9

    .line 68
    .line 69
    goto/16 :goto_1

    .line 70
    .line 71
    :sswitch_1
    const-string v9, "TextInput.clearClient"

    .line 72
    .line 73
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    if-nez v8, :cond_2

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    move/from16 v18, v10

    .line 81
    .line 82
    goto/16 :goto_1

    .line 83
    .line 84
    :sswitch_2
    const-string v9, "TextInput.finishAutofillContext"

    .line 85
    .line 86
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v8

    .line 90
    if-nez v8, :cond_3

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_3
    const/16 v18, 0x7

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :sswitch_3
    const-string v9, "TextInput.setEditableSizeAndTransform"

    .line 97
    .line 98
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    if-nez v8, :cond_4

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_4
    const/16 v18, 0x6

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :sswitch_4
    const-string v9, "TextInput.sendAppPrivateCommand"

    .line 109
    .line 110
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v8

    .line 114
    if-nez v8, :cond_5

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_5
    const/16 v18, 0x5

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :sswitch_5
    const-string v9, "TextInput.show"

    .line 121
    .line 122
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v8

    .line 126
    if-nez v8, :cond_6

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_6
    move/from16 v18, v13

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :sswitch_6
    const-string v9, "TextInput.hide"

    .line 133
    .line 134
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v8

    .line 138
    if-nez v8, :cond_7

    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_7
    move/from16 v18, v12

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :sswitch_7
    const-string v9, "TextInput.setClient"

    .line 145
    .line 146
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v8

    .line 150
    if-nez v8, :cond_8

    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_8
    move/from16 v18, v11

    .line 154
    .line 155
    goto :goto_1

    .line 156
    :sswitch_8
    const-string v9, "TextInput.setEditingState"

    .line 157
    .line 158
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v8

    .line 162
    if-nez v8, :cond_9

    .line 163
    .line 164
    goto :goto_0

    .line 165
    :cond_9
    move/from16 v18, v6

    .line 166
    .line 167
    goto :goto_1

    .line 168
    :sswitch_9
    const-string v9, "TextInput.setPlatformViewClient"

    .line 169
    .line 170
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v8

    .line 174
    if-nez v8, :cond_a

    .line 175
    .line 176
    goto :goto_0

    .line 177
    :cond_a
    move/from16 v18, v15

    .line 178
    .line 179
    :goto_1
    const/16 v8, 0x1a

    .line 180
    .line 181
    packed-switch v18, :pswitch_data_1

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2}, LB1/o;->b()V

    .line 185
    .line 186
    .line 187
    goto/16 :goto_d

    .line 188
    .line 189
    :pswitch_1
    iget-object v0, v7, LA/c;->m:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v0, LB1/g;

    .line 192
    .line 193
    iget-object v0, v0, LB1/g;->l:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v0, Lio/flutter/plugin/editing/j;

    .line 196
    .line 197
    iget-object v3, v0, Lio/flutter/plugin/editing/j;->a:Landroid/view/View;

    .line 198
    .line 199
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 200
    .line 201
    if-lt v4, v8, :cond_b

    .line 202
    .line 203
    iget-object v4, v0, Lio/flutter/plugin/editing/j;->c:Landroid/view/autofill/AutofillManager;

    .line 204
    .line 205
    if-eqz v4, :cond_b

    .line 206
    .line 207
    iget-object v4, v0, Lio/flutter/plugin/editing/j;->g:Landroid/util/SparseArray;

    .line 208
    .line 209
    if-eqz v4, :cond_b

    .line 210
    .line 211
    iget-object v4, v0, Lio/flutter/plugin/editing/j;->f:LB1/t;

    .line 212
    .line 213
    iget-object v4, v4, LB1/t;->j:LB1/s;

    .line 214
    .line 215
    iget-object v4, v4, LB1/s;->k:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v4, Ljava/lang/String;

    .line 218
    .line 219
    new-array v5, v11, [I

    .line 220
    .line 221
    invoke-virtual {v3, v5}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 222
    .line 223
    .line 224
    new-instance v7, Landroid/graphics/Rect;

    .line 225
    .line 226
    iget-object v8, v0, Lio/flutter/plugin/editing/j;->m:Landroid/graphics/Rect;

    .line 227
    .line 228
    invoke-direct {v7, v8}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 229
    .line 230
    .line 231
    aget v8, v5, v15

    .line 232
    .line 233
    aget v5, v5, v6

    .line 234
    .line 235
    invoke-virtual {v7, v8, v5}, Landroid/graphics/Rect;->offset(II)V

    .line 236
    .line 237
    .line 238
    iget-object v0, v0, Lio/flutter/plugin/editing/j;->c:Landroid/view/autofill/AutofillManager;

    .line 239
    .line 240
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 241
    .line 242
    .line 243
    move-result v4

    .line 244
    invoke-static {v0, v3, v4, v7}, Lio/flutter/plugin/editing/i;->t(Landroid/view/autofill/AutofillManager;Landroid/view/View;ILandroid/graphics/Rect;)V

    .line 245
    .line 246
    .line 247
    :cond_b
    invoke-virtual {v2, v14}, LB1/o;->d(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    goto/16 :goto_d

    .line 251
    .line 252
    :pswitch_2
    iget-object v0, v7, LA/c;->m:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v0, LB1/g;

    .line 255
    .line 256
    iget-object v0, v0, LB1/g;->l:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast v0, Lio/flutter/plugin/editing/j;

    .line 259
    .line 260
    iget-object v3, v0, Lio/flutter/plugin/editing/j;->a:Landroid/view/View;

    .line 261
    .line 262
    iget-object v4, v0, Lio/flutter/plugin/editing/j;->e:LD/n;

    .line 263
    .line 264
    iget v4, v4, LD/n;->b:I

    .line 265
    .line 266
    if-ne v4, v12, :cond_c

    .line 267
    .line 268
    goto :goto_2

    .line 269
    :cond_c
    iget-object v4, v0, Lio/flutter/plugin/editing/j;->h:Lio/flutter/plugin/editing/f;

    .line 270
    .line 271
    invoke-virtual {v4, v0}, Lio/flutter/plugin/editing/f;->e(Lio/flutter/plugin/editing/e;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v0}, Lio/flutter/plugin/editing/j;->d()V

    .line 275
    .line 276
    .line 277
    iput-object v14, v0, Lio/flutter/plugin/editing/j;->f:LB1/t;

    .line 278
    .line 279
    invoke-virtual {v0, v14}, Lio/flutter/plugin/editing/j;->e(LB1/t;)V

    .line 280
    .line 281
    .line 282
    new-instance v4, LD/n;

    .line 283
    .line 284
    invoke-direct {v4, v6, v15}, LD/n;-><init>(II)V

    .line 285
    .line 286
    .line 287
    iput-object v4, v0, Lio/flutter/plugin/editing/j;->e:LD/n;

    .line 288
    .line 289
    iput-object v14, v0, Lio/flutter/plugin/editing/j;->m:Landroid/graphics/Rect;

    .line 290
    .line 291
    sget-object v4, LD/G;->a:Ljava/lang/reflect/Field;

    .line 292
    .line 293
    invoke-static {v3}, LD/A;->a(Landroid/view/View;)LD/h0;

    .line 294
    .line 295
    .line 296
    move-result-object v4

    .line 297
    if-eqz v4, :cond_d

    .line 298
    .line 299
    iget-object v4, v4, LD/h0;->a:LD/d0;

    .line 300
    .line 301
    invoke-virtual {v4, v10}, LD/d0;->s(I)Z

    .line 302
    .line 303
    .line 304
    move-result v4

    .line 305
    if-nez v4, :cond_d

    .line 306
    .line 307
    iget-object v0, v0, Lio/flutter/plugin/editing/j;->b:Landroid/view/inputmethod/InputMethodManager;

    .line 308
    .line 309
    invoke-virtual {v0, v3}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    .line 310
    .line 311
    .line 312
    :cond_d
    :goto_2
    invoke-virtual {v2, v14}, LB1/o;->d(Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    goto/16 :goto_d

    .line 316
    .line 317
    :pswitch_3
    iget-object v3, v7, LA/c;->m:Ljava/lang/Object;

    .line 318
    .line 319
    check-cast v3, LB1/g;

    .line 320
    .line 321
    check-cast v0, Ljava/lang/Boolean;

    .line 322
    .line 323
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 324
    .line 325
    .line 326
    move-result v0

    .line 327
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 328
    .line 329
    if-lt v4, v8, :cond_10

    .line 330
    .line 331
    iget-object v3, v3, LB1/g;->l:Ljava/lang/Object;

    .line 332
    .line 333
    check-cast v3, Lio/flutter/plugin/editing/j;

    .line 334
    .line 335
    iget-object v3, v3, Lio/flutter/plugin/editing/j;->c:Landroid/view/autofill/AutofillManager;

    .line 336
    .line 337
    if-nez v3, :cond_e

    .line 338
    .line 339
    goto :goto_3

    .line 340
    :cond_e
    if-eqz v0, :cond_f

    .line 341
    .line 342
    invoke-static {v3}, Lio/flutter/plugin/editing/i;->s(Landroid/view/autofill/AutofillManager;)V

    .line 343
    .line 344
    .line 345
    goto :goto_3

    .line 346
    :cond_f
    invoke-static {v3}, Lio/flutter/plugin/editing/i;->D(Landroid/view/autofill/AutofillManager;)V

    .line 347
    .line 348
    .line 349
    goto :goto_3

    .line 350
    :cond_10
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 351
    .line 352
    .line 353
    :goto_3
    invoke-virtual {v2, v14}, LB1/o;->d(Ljava/lang/Object;)V

    .line 354
    .line 355
    .line 356
    goto/16 :goto_d

    .line 357
    .line 358
    :pswitch_4
    :try_start_0
    check-cast v0, Lorg/json/JSONObject;

    .line 359
    .line 360
    const-string v3, "width"

    .line 361
    .line 362
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    .line 363
    .line 364
    .line 365
    move-result-wide v9

    .line 366
    const-string v3, "height"

    .line 367
    .line 368
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    .line 369
    .line 370
    .line 371
    move-result-wide v11

    .line 372
    const-string v3, "transform"

    .line 373
    .line 374
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    const/16 v3, 0x10

    .line 379
    .line 380
    new-array v13, v3, [D

    .line 381
    .line 382
    :goto_4
    if-ge v15, v3, :cond_11

    .line 383
    .line 384
    invoke-virtual {v0, v15}, Lorg/json/JSONArray;->getDouble(I)D

    .line 385
    .line 386
    .line 387
    move-result-wide v16

    .line 388
    aput-wide v16, v13, v15

    .line 389
    .line 390
    add-int/lit8 v15, v15, 0x1

    .line 391
    .line 392
    goto :goto_4

    .line 393
    :catch_0
    move-exception v0

    .line 394
    goto :goto_5

    .line 395
    :cond_11
    iget-object v0, v7, LA/c;->m:Ljava/lang/Object;

    .line 396
    .line 397
    move-object v8, v0

    .line 398
    check-cast v8, LB1/g;

    .line 399
    .line 400
    invoke-virtual/range {v8 .. v13}, LB1/g;->o(DD[D)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v2, v14}, LB1/o;->d(Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 404
    .line 405
    .line 406
    goto/16 :goto_d

    .line 407
    .line 408
    :goto_5
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    invoke-virtual {v2, v5, v0, v14}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 413
    .line 414
    .line 415
    goto/16 :goto_d

    .line 416
    .line 417
    :pswitch_5
    :try_start_1
    check-cast v0, Lorg/json/JSONObject;

    .line 418
    .line 419
    const-string v4, "action"

    .line 420
    .line 421
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v4

    .line 425
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    if-eqz v0, :cond_12

    .line 430
    .line 431
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 432
    .line 433
    .line 434
    move-result v6

    .line 435
    if-nez v6, :cond_12

    .line 436
    .line 437
    new-instance v6, Landroid/os/Bundle;

    .line 438
    .line 439
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v6, v3, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    goto :goto_6

    .line 446
    :catch_1
    move-exception v0

    .line 447
    goto :goto_7

    .line 448
    :cond_12
    move-object v6, v14

    .line 449
    :goto_6
    iget-object v0, v7, LA/c;->m:Ljava/lang/Object;

    .line 450
    .line 451
    check-cast v0, LB1/g;

    .line 452
    .line 453
    iget-object v0, v0, LB1/g;->l:Ljava/lang/Object;

    .line 454
    .line 455
    check-cast v0, Lio/flutter/plugin/editing/j;

    .line 456
    .line 457
    iget-object v3, v0, Lio/flutter/plugin/editing/j;->b:Landroid/view/inputmethod/InputMethodManager;

    .line 458
    .line 459
    iget-object v0, v0, Lio/flutter/plugin/editing/j;->a:Landroid/view/View;

    .line 460
    .line 461
    invoke-virtual {v3, v0, v4, v6}, Landroid/view/inputmethod/InputMethodManager;->sendAppPrivateCommand(Landroid/view/View;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v2, v14}, LB1/o;->d(Ljava/lang/Object;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 465
    .line 466
    .line 467
    goto/16 :goto_d

    .line 468
    .line 469
    :goto_7
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    invoke-virtual {v2, v5, v0, v14}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 474
    .line 475
    .line 476
    goto/16 :goto_d

    .line 477
    .line 478
    :pswitch_6
    iget-object v0, v7, LA/c;->m:Ljava/lang/Object;

    .line 479
    .line 480
    check-cast v0, LB1/g;

    .line 481
    .line 482
    iget-object v0, v0, LB1/g;->l:Ljava/lang/Object;

    .line 483
    .line 484
    check-cast v0, Lio/flutter/plugin/editing/j;

    .line 485
    .line 486
    iget-object v3, v0, Lio/flutter/plugin/editing/j;->b:Landroid/view/inputmethod/InputMethodManager;

    .line 487
    .line 488
    iget-object v5, v0, Lio/flutter/plugin/editing/j;->a:Landroid/view/View;

    .line 489
    .line 490
    iget-object v6, v0, Lio/flutter/plugin/editing/j;->f:LB1/t;

    .line 491
    .line 492
    if-eqz v6, :cond_14

    .line 493
    .line 494
    iget-object v6, v6, LB1/t;->g:LB1/u;

    .line 495
    .line 496
    iget v6, v6, LB1/u;->a:I

    .line 497
    .line 498
    if-eq v6, v4, :cond_13

    .line 499
    .line 500
    goto :goto_8

    .line 501
    :cond_13
    invoke-virtual {v0}, Lio/flutter/plugin/editing/j;->d()V

    .line 502
    .line 503
    .line 504
    invoke-virtual {v5}, Landroid/view/View;->getApplicationWindowToken()Landroid/os/IBinder;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    invoke-virtual {v3, v0, v15}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 509
    .line 510
    .line 511
    goto :goto_9

    .line 512
    :cond_14
    :goto_8
    invoke-virtual {v5}, Landroid/view/View;->requestFocus()Z

    .line 513
    .line 514
    .line 515
    invoke-virtual {v3, v5, v15}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 516
    .line 517
    .line 518
    :goto_9
    invoke-virtual {v2, v14}, LB1/o;->d(Ljava/lang/Object;)V

    .line 519
    .line 520
    .line 521
    goto/16 :goto_d

    .line 522
    .line 523
    :pswitch_7
    iget-object v0, v7, LA/c;->m:Ljava/lang/Object;

    .line 524
    .line 525
    check-cast v0, LB1/g;

    .line 526
    .line 527
    iget-object v0, v0, LB1/g;->l:Ljava/lang/Object;

    .line 528
    .line 529
    check-cast v0, Lio/flutter/plugin/editing/j;

    .line 530
    .line 531
    iget-object v3, v0, Lio/flutter/plugin/editing/j;->e:LD/n;

    .line 532
    .line 533
    iget v3, v3, LD/n;->b:I

    .line 534
    .line 535
    if-ne v3, v13, :cond_15

    .line 536
    .line 537
    invoke-virtual {v0}, Lio/flutter/plugin/editing/j;->d()V

    .line 538
    .line 539
    .line 540
    goto :goto_a

    .line 541
    :cond_15
    iget-object v3, v0, Lio/flutter/plugin/editing/j;->a:Landroid/view/View;

    .line 542
    .line 543
    invoke-virtual {v0}, Lio/flutter/plugin/editing/j;->d()V

    .line 544
    .line 545
    .line 546
    iget-object v0, v0, Lio/flutter/plugin/editing/j;->b:Landroid/view/inputmethod/InputMethodManager;

    .line 547
    .line 548
    invoke-virtual {v3}, Landroid/view/View;->getApplicationWindowToken()Landroid/os/IBinder;

    .line 549
    .line 550
    .line 551
    move-result-object v3

    .line 552
    invoke-virtual {v0, v3, v15}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 553
    .line 554
    .line 555
    :goto_a
    invoke-virtual {v2, v14}, LB1/o;->d(Ljava/lang/Object;)V

    .line 556
    .line 557
    .line 558
    goto/16 :goto_d

    .line 559
    .line 560
    :pswitch_8
    :try_start_2
    check-cast v0, Lorg/json/JSONArray;

    .line 561
    .line 562
    invoke-virtual {v0, v15}, Lorg/json/JSONArray;->getInt(I)I

    .line 563
    .line 564
    .line 565
    move-result v3

    .line 566
    invoke-virtual {v0, v6}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 567
    .line 568
    .line 569
    move-result-object v0

    .line 570
    iget-object v4, v7, LA/c;->m:Ljava/lang/Object;

    .line 571
    .line 572
    check-cast v4, LB1/g;

    .line 573
    .line 574
    invoke-static {v0}, LB1/t;->a(Lorg/json/JSONObject;)LB1/t;

    .line 575
    .line 576
    .line 577
    move-result-object v0

    .line 578
    invoke-virtual {v4, v3, v0}, LB1/g;->n(ILB1/t;)V

    .line 579
    .line 580
    .line 581
    invoke-virtual {v2, v14}, LB1/o;->d(Ljava/lang/Object;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/NoSuchFieldException; {:try_start_2 .. :try_end_2} :catch_2

    .line 582
    .line 583
    .line 584
    goto :goto_d

    .line 585
    :catch_2
    move-exception v0

    .line 586
    goto :goto_b

    .line 587
    :catch_3
    move-exception v0

    .line 588
    :goto_b
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 589
    .line 590
    .line 591
    move-result-object v0

    .line 592
    invoke-virtual {v2, v5, v0, v14}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 593
    .line 594
    .line 595
    goto :goto_d

    .line 596
    :pswitch_9
    :try_start_3
    check-cast v0, Lorg/json/JSONObject;

    .line 597
    .line 598
    iget-object v3, v7, LA/c;->m:Ljava/lang/Object;

    .line 599
    .line 600
    check-cast v3, LB1/g;

    .line 601
    .line 602
    invoke-static {v0}, LB1/v;->a(Lorg/json/JSONObject;)LB1/v;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    invoke-virtual {v3, v0}, LB1/g;->p(LB1/v;)V

    .line 607
    .line 608
    .line 609
    invoke-virtual {v2, v14}, LB1/o;->d(Ljava/lang/Object;)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_4

    .line 610
    .line 611
    .line 612
    goto :goto_d

    .line 613
    :catch_4
    move-exception v0

    .line 614
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object v0

    .line 618
    invoke-virtual {v2, v5, v0, v14}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 619
    .line 620
    .line 621
    goto :goto_d

    .line 622
    :pswitch_a
    :try_start_4
    check-cast v0, Lorg/json/JSONObject;

    .line 623
    .line 624
    const-string v3, "platformViewId"

    .line 625
    .line 626
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 627
    .line 628
    .line 629
    move-result v3

    .line 630
    const-string v4, "usesVirtualDisplay"

    .line 631
    .line 632
    invoke-virtual {v0, v4, v15}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 633
    .line 634
    .line 635
    move-result v0

    .line 636
    iget-object v4, v7, LA/c;->m:Ljava/lang/Object;

    .line 637
    .line 638
    check-cast v4, LB1/g;

    .line 639
    .line 640
    iget-object v4, v4, LB1/g;->l:Ljava/lang/Object;

    .line 641
    .line 642
    check-cast v4, Lio/flutter/plugin/editing/j;

    .line 643
    .line 644
    iget-object v6, v4, Lio/flutter/plugin/editing/j;->a:Landroid/view/View;

    .line 645
    .line 646
    if-eqz v0, :cond_16

    .line 647
    .line 648
    invoke-virtual {v6}, Landroid/view/View;->requestFocus()Z

    .line 649
    .line 650
    .line 651
    new-instance v0, LD/n;

    .line 652
    .line 653
    invoke-direct {v0, v12, v3}, LD/n;-><init>(II)V

    .line 654
    .line 655
    .line 656
    iput-object v0, v4, Lio/flutter/plugin/editing/j;->e:LD/n;

    .line 657
    .line 658
    iget-object v0, v4, Lio/flutter/plugin/editing/j;->b:Landroid/view/inputmethod/InputMethodManager;

    .line 659
    .line 660
    invoke-virtual {v0, v6}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    .line 661
    .line 662
    .line 663
    iput-boolean v15, v4, Lio/flutter/plugin/editing/j;->i:Z

    .line 664
    .line 665
    goto :goto_c

    .line 666
    :cond_16
    new-instance v0, LD/n;

    .line 667
    .line 668
    invoke-direct {v0, v13, v3}, LD/n;-><init>(II)V

    .line 669
    .line 670
    .line 671
    iput-object v0, v4, Lio/flutter/plugin/editing/j;->e:LD/n;

    .line 672
    .line 673
    iput-object v14, v4, Lio/flutter/plugin/editing/j;->j:Landroid/view/inputmethod/InputConnection;

    .line 674
    .line 675
    :goto_c
    invoke-virtual {v2, v14}, LB1/o;->d(Ljava/lang/Object;)V
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_5

    .line 676
    .line 677
    .line 678
    goto :goto_d

    .line 679
    :catch_5
    move-exception v0

    .line 680
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 681
    .line 682
    .line 683
    move-result-object v0

    .line 684
    invoke-virtual {v2, v5, v0, v14}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 685
    .line 686
    .line 687
    :goto_d
    return-void

    .line 688
    :pswitch_b
    iget-object v3, v1, LH0/i;->l:Ljava/lang/Object;

    .line 689
    .line 690
    check-cast v3, LB1/a;

    .line 691
    .line 692
    iget-object v4, v3, LB1/a;->l:Ljava/lang/Object;

    .line 693
    .line 694
    check-cast v4, Lio/flutter/plugin/editing/g;

    .line 695
    .line 696
    if-nez v4, :cond_17

    .line 697
    .line 698
    goto :goto_e

    .line 699
    :cond_17
    iget-object v4, v0, LA/c;->l:Ljava/lang/Object;

    .line 700
    .line 701
    check-cast v4, Ljava/lang/String;

    .line 702
    .line 703
    iget-object v0, v0, LA/c;->m:Ljava/lang/Object;

    .line 704
    .line 705
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 706
    .line 707
    .line 708
    const-string v7, "SpellCheck.initiateSpellCheck"

    .line 709
    .line 710
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 711
    .line 712
    .line 713
    move-result v4

    .line 714
    if-nez v4, :cond_18

    .line 715
    .line 716
    invoke-virtual {v2}, LB1/o;->b()V

    .line 717
    .line 718
    .line 719
    goto :goto_e

    .line 720
    :cond_18
    :try_start_5
    check-cast v0, Ljava/util/ArrayList;

    .line 721
    .line 722
    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 723
    .line 724
    .line 725
    move-result-object v4

    .line 726
    check-cast v4, Ljava/lang/String;

    .line 727
    .line 728
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 729
    .line 730
    .line 731
    move-result-object v0

    .line 732
    check-cast v0, Ljava/lang/String;

    .line 733
    .line 734
    iget-object v3, v3, LB1/a;->l:Ljava/lang/Object;

    .line 735
    .line 736
    check-cast v3, Lio/flutter/plugin/editing/g;

    .line 737
    .line 738
    invoke-virtual {v3, v4, v0, v2}, Lio/flutter/plugin/editing/g;->a(Ljava/lang/String;Ljava/lang/String;LB1/o;)V
    :try_end_5
    .catch Ljava/lang/IllegalStateException; {:try_start_5 .. :try_end_5} :catch_6

    .line 739
    .line 740
    .line 741
    goto :goto_e

    .line 742
    :catch_6
    move-exception v0

    .line 743
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 744
    .line 745
    .line 746
    move-result-object v0

    .line 747
    invoke-virtual {v2, v5, v0, v14}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 748
    .line 749
    .line 750
    :goto_e
    return-void

    .line 751
    :pswitch_c
    invoke-direct/range {p0 .. p2}, LH0/i;->v(LA/c;LB1/o;)V

    .line 752
    .line 753
    .line 754
    return-void

    .line 755
    :pswitch_d
    const-string v3, "No such clipboard content format: "

    .line 756
    .line 757
    iget-object v7, v1, LH0/i;->l:Ljava/lang/Object;

    .line 758
    .line 759
    check-cast v7, LA/c;

    .line 760
    .line 761
    iget-object v8, v7, LA/c;->m:Ljava/lang/Object;

    .line 762
    .line 763
    check-cast v8, Lio/flutter/plugin/platform/o;

    .line 764
    .line 765
    if-nez v8, :cond_19

    .line 766
    .line 767
    goto/16 :goto_1a

    .line 768
    .line 769
    :cond_19
    iget-object v8, v0, LA/c;->l:Ljava/lang/Object;

    .line 770
    .line 771
    check-cast v8, Ljava/lang/String;

    .line 772
    .line 773
    iget-object v0, v0, LA/c;->m:Ljava/lang/Object;

    .line 774
    .line 775
    :try_start_6
    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    .line 776
    .line 777
    .line 778
    move-result v9

    .line 779
    sparse-switch v9, :sswitch_data_1

    .line 780
    .line 781
    .line 782
    goto/16 :goto_f

    .line 783
    .line 784
    :sswitch_a
    const-string v4, "SystemChrome.setPreferredOrientations"

    .line 785
    .line 786
    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 787
    .line 788
    .line 789
    move-result v4

    .line 790
    if-eqz v4, :cond_1a

    .line 791
    .line 792
    move v4, v11

    .line 793
    goto/16 :goto_10

    .line 794
    .line 795
    :catch_7
    move-exception v0

    .line 796
    goto/16 :goto_19

    .line 797
    .line 798
    :sswitch_b
    const-string v4, "SystemChrome.setEnabledSystemUIOverlays"

    .line 799
    .line 800
    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 801
    .line 802
    .line 803
    move-result v4

    .line 804
    if-eqz v4, :cond_1a

    .line 805
    .line 806
    move v4, v13

    .line 807
    goto/16 :goto_10

    .line 808
    .line 809
    :sswitch_c
    const-string v9, "Clipboard.getData"

    .line 810
    .line 811
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 812
    .line 813
    .line 814
    move-result v8

    .line 815
    if-eqz v8, :cond_1a

    .line 816
    .line 817
    goto/16 :goto_10

    .line 818
    .line 819
    :sswitch_d
    const-string v4, "SystemChrome.setSystemUIOverlayStyle"

    .line 820
    .line 821
    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 822
    .line 823
    .line 824
    move-result v4

    .line 825
    if-eqz v4, :cond_1a

    .line 826
    .line 827
    move v4, v10

    .line 828
    goto/16 :goto_10

    .line 829
    .line 830
    :sswitch_e
    const-string v4, "SystemChrome.setEnabledSystemUIMode"

    .line 831
    .line 832
    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 833
    .line 834
    .line 835
    move-result v4

    .line 836
    if-eqz v4, :cond_1a

    .line 837
    .line 838
    const/4 v4, 0x5

    .line 839
    goto/16 :goto_10

    .line 840
    .line 841
    :sswitch_f
    const-string v4, "Clipboard.hasStrings"

    .line 842
    .line 843
    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 844
    .line 845
    .line 846
    move-result v4

    .line 847
    if-eqz v4, :cond_1a

    .line 848
    .line 849
    const/16 v4, 0xd

    .line 850
    .line 851
    goto/16 :goto_10

    .line 852
    .line 853
    :sswitch_10
    const-string v4, "SystemChrome.restoreSystemUIOverlays"

    .line 854
    .line 855
    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 856
    .line 857
    .line 858
    move-result v4

    .line 859
    if-eqz v4, :cond_1a

    .line 860
    .line 861
    const/4 v4, 0x7

    .line 862
    goto :goto_10

    .line 863
    :sswitch_11
    const-string v4, "SystemSound.play"

    .line 864
    .line 865
    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 866
    .line 867
    .line 868
    move-result v4

    .line 869
    if-eqz v4, :cond_1a

    .line 870
    .line 871
    move v4, v15

    .line 872
    goto :goto_10

    .line 873
    :sswitch_12
    const-string v4, "HapticFeedback.vibrate"

    .line 874
    .line 875
    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 876
    .line 877
    .line 878
    move-result v4

    .line 879
    if-eqz v4, :cond_1a

    .line 880
    .line 881
    move v4, v6

    .line 882
    goto :goto_10

    .line 883
    :sswitch_13
    const-string v4, "SystemChrome.setApplicationSwitcherDescription"

    .line 884
    .line 885
    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 886
    .line 887
    .line 888
    move-result v4

    .line 889
    if-eqz v4, :cond_1a

    .line 890
    .line 891
    move v4, v12

    .line 892
    goto :goto_10

    .line 893
    :sswitch_14
    const-string v4, "SystemChrome.setSystemUIChangeListener"

    .line 894
    .line 895
    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 896
    .line 897
    .line 898
    move-result v4

    .line 899
    if-eqz v4, :cond_1a

    .line 900
    .line 901
    const/4 v4, 0x6

    .line 902
    goto :goto_10

    .line 903
    :sswitch_15
    const-string v4, "Clipboard.setData"

    .line 904
    .line 905
    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 906
    .line 907
    .line 908
    move-result v4

    .line 909
    if-eqz v4, :cond_1a

    .line 910
    .line 911
    const/16 v4, 0xc

    .line 912
    .line 913
    goto :goto_10

    .line 914
    :sswitch_16
    const-string v4, "SystemNavigator.pop"

    .line 915
    .line 916
    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 917
    .line 918
    .line 919
    move-result v4

    .line 920
    if-eqz v4, :cond_1a

    .line 921
    .line 922
    const/16 v4, 0xa

    .line 923
    .line 924
    goto :goto_10

    .line 925
    :sswitch_17
    const-string v4, "Share.invoke"

    .line 926
    .line 927
    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 928
    .line 929
    .line 930
    move-result v4

    .line 931
    if-eqz v4, :cond_1a

    .line 932
    .line 933
    const/16 v4, 0xe

    .line 934
    .line 935
    goto :goto_10

    .line 936
    :sswitch_18
    const-string v4, "SystemNavigator.setFrameworkHandlesBack"

    .line 937
    .line 938
    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 939
    .line 940
    .line 941
    move-result v4
    :try_end_6
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_7

    .line 942
    if-eqz v4, :cond_1a

    .line 943
    .line 944
    const/16 v4, 0x9

    .line 945
    .line 946
    goto :goto_10

    .line 947
    :cond_1a
    :goto_f
    const/4 v4, -0x1

    .line 948
    :goto_10
    const-string v8, "text"

    .line 949
    .line 950
    const-string v9, "clipboard"

    .line 951
    .line 952
    packed-switch v4, :pswitch_data_2

    .line 953
    .line 954
    .line 955
    :try_start_7
    invoke-virtual {v2}, LB1/o;->b()V

    .line 956
    .line 957
    .line 958
    goto/16 :goto_1a

    .line 959
    .line 960
    :pswitch_e
    check-cast v0, Ljava/lang/String;

    .line 961
    .line 962
    iget-object v3, v7, LA/c;->m:Ljava/lang/Object;

    .line 963
    .line 964
    check-cast v3, Lio/flutter/plugin/platform/o;

    .line 965
    .line 966
    iget-object v3, v3, Lio/flutter/plugin/platform/o;->l:Ljava/lang/Object;

    .line 967
    .line 968
    check-cast v3, Lio/flutter/plugin/platform/f;

    .line 969
    .line 970
    new-instance v4, Landroid/content/Intent;

    .line 971
    .line 972
    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 973
    .line 974
    .line 975
    const-string v6, "android.intent.action.SEND"

    .line 976
    .line 977
    invoke-virtual {v4, v6}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 978
    .line 979
    .line 980
    const-string v6, "text/plain"

    .line 981
    .line 982
    invoke-virtual {v4, v6}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 983
    .line 984
    .line 985
    const-string v6, "android.intent.extra.TEXT"

    .line 986
    .line 987
    invoke-virtual {v4, v6, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 988
    .line 989
    .line 990
    iget-object v0, v3, Lio/flutter/plugin/platform/f;->a:Landroid/app/Activity;

    .line 991
    .line 992
    invoke-static {v4, v14}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 993
    .line 994
    .line 995
    move-result-object v3

    .line 996
    invoke-virtual {v0, v3}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 997
    .line 998
    .line 999
    invoke-virtual {v2, v14}, LB1/o;->d(Ljava/lang/Object;)V

    .line 1000
    .line 1001
    .line 1002
    goto/16 :goto_1a

    .line 1003
    .line 1004
    :pswitch_f
    iget-object v0, v7, LA/c;->m:Ljava/lang/Object;

    .line 1005
    .line 1006
    check-cast v0, Lio/flutter/plugin/platform/o;

    .line 1007
    .line 1008
    iget-object v0, v0, Lio/flutter/plugin/platform/o;->l:Ljava/lang/Object;

    .line 1009
    .line 1010
    check-cast v0, Lio/flutter/plugin/platform/f;

    .line 1011
    .line 1012
    iget-object v0, v0, Lio/flutter/plugin/platform/f;->a:Landroid/app/Activity;

    .line 1013
    .line 1014
    invoke-virtual {v0, v9}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v0

    .line 1018
    check-cast v0, Landroid/content/ClipboardManager;

    .line 1019
    .line 1020
    invoke-virtual {v0}, Landroid/content/ClipboardManager;->hasPrimaryClip()Z

    .line 1021
    .line 1022
    .line 1023
    move-result v3

    .line 1024
    if-nez v3, :cond_1b

    .line 1025
    .line 1026
    goto :goto_11

    .line 1027
    :cond_1b
    invoke-virtual {v0}, Landroid/content/ClipboardManager;->getPrimaryClipDescription()Landroid/content/ClipDescription;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v0

    .line 1031
    if-nez v0, :cond_1c

    .line 1032
    .line 1033
    goto :goto_11

    .line 1034
    :cond_1c
    const-string v3, "text/*"

    .line 1035
    .line 1036
    invoke-virtual {v0, v3}, Landroid/content/ClipDescription;->hasMimeType(Ljava/lang/String;)Z

    .line 1037
    .line 1038
    .line 1039
    move-result v15

    .line 1040
    :goto_11
    new-instance v0, Lorg/json/JSONObject;

    .line 1041
    .line 1042
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 1043
    .line 1044
    .line 1045
    const-string v3, "value"

    .line 1046
    .line 1047
    invoke-virtual {v0, v3, v15}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 1048
    .line 1049
    .line 1050
    invoke-virtual {v2, v0}, LB1/o;->d(Ljava/lang/Object;)V

    .line 1051
    .line 1052
    .line 1053
    goto/16 :goto_1a

    .line 1054
    .line 1055
    :pswitch_10
    check-cast v0, Lorg/json/JSONObject;

    .line 1056
    .line 1057
    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v0

    .line 1061
    iget-object v3, v7, LA/c;->m:Ljava/lang/Object;

    .line 1062
    .line 1063
    check-cast v3, Lio/flutter/plugin/platform/o;

    .line 1064
    .line 1065
    iget-object v3, v3, Lio/flutter/plugin/platform/o;->l:Ljava/lang/Object;

    .line 1066
    .line 1067
    check-cast v3, Lio/flutter/plugin/platform/f;

    .line 1068
    .line 1069
    iget-object v3, v3, Lio/flutter/plugin/platform/f;->a:Landroid/app/Activity;

    .line 1070
    .line 1071
    invoke-virtual {v3, v9}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v3

    .line 1075
    check-cast v3, Landroid/content/ClipboardManager;

    .line 1076
    .line 1077
    const-string v4, "text label?"

    .line 1078
    .line 1079
    invoke-static {v4, v0}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v0

    .line 1083
    invoke-virtual {v3, v0}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 1084
    .line 1085
    .line 1086
    invoke-virtual {v2, v14}, LB1/o;->d(Ljava/lang/Object;)V

    .line 1087
    .line 1088
    .line 1089
    goto/16 :goto_1a

    .line 1090
    .line 1091
    :pswitch_11
    check-cast v0, Ljava/lang/String;
    :try_end_7
    .catch Lorg/json/JSONException; {:try_start_7 .. :try_end_7} :catch_7

    .line 1092
    .line 1093
    if-eqz v0, :cond_1d

    .line 1094
    .line 1095
    :try_start_8
    invoke-static {v0}, LB1/h;->a(Ljava/lang/String;)LB1/h;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v0
    :try_end_8
    .catch Ljava/lang/NoSuchFieldException; {:try_start_8 .. :try_end_8} :catch_8
    .catch Lorg/json/JSONException; {:try_start_8 .. :try_end_8} :catch_7

    .line 1099
    goto :goto_12

    .line 1100
    :catch_8
    :try_start_9
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v0

    .line 1104
    invoke-virtual {v2, v5, v0, v14}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1105
    .line 1106
    .line 1107
    :cond_1d
    move-object v0, v14

    .line 1108
    :goto_12
    iget-object v3, v7, LA/c;->m:Ljava/lang/Object;

    .line 1109
    .line 1110
    check-cast v3, Lio/flutter/plugin/platform/o;

    .line 1111
    .line 1112
    invoke-virtual {v3, v0}, Lio/flutter/plugin/platform/o;->c(LB1/h;)Ljava/lang/CharSequence;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v0

    .line 1116
    if-eqz v0, :cond_1e

    .line 1117
    .line 1118
    new-instance v3, Lorg/json/JSONObject;

    .line 1119
    .line 1120
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 1121
    .line 1122
    .line 1123
    invoke-virtual {v3, v8, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1124
    .line 1125
    .line 1126
    invoke-virtual {v2, v3}, LB1/o;->d(Ljava/lang/Object;)V

    .line 1127
    .line 1128
    .line 1129
    goto/16 :goto_1a

    .line 1130
    .line 1131
    :cond_1e
    invoke-virtual {v2, v14}, LB1/o;->d(Ljava/lang/Object;)V

    .line 1132
    .line 1133
    .line 1134
    goto/16 :goto_1a

    .line 1135
    .line 1136
    :pswitch_12
    iget-object v0, v7, LA/c;->m:Ljava/lang/Object;

    .line 1137
    .line 1138
    check-cast v0, Lio/flutter/plugin/platform/o;

    .line 1139
    .line 1140
    iget-object v0, v0, Lio/flutter/plugin/platform/o;->l:Ljava/lang/Object;

    .line 1141
    .line 1142
    check-cast v0, Lio/flutter/plugin/platform/f;

    .line 1143
    .line 1144
    iget-object v0, v0, Lio/flutter/plugin/platform/f;->a:Landroid/app/Activity;

    .line 1145
    .line 1146
    instance-of v3, v0, Lb/u;

    .line 1147
    .line 1148
    if-eqz v3, :cond_1f

    .line 1149
    .line 1150
    check-cast v0, Lb/u;

    .line 1151
    .line 1152
    invoke-interface {v0}, Lb/u;->b()Lb/t;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v0

    .line 1156
    invoke-virtual {v0}, Lb/t;->a()Lb/r;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v0

    .line 1160
    invoke-virtual {v0}, Lh0/d;->a()V

    .line 1161
    .line 1162
    .line 1163
    goto :goto_13

    .line 1164
    :cond_1f
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 1165
    .line 1166
    .line 1167
    :goto_13
    invoke-virtual {v2, v14}, LB1/o;->d(Ljava/lang/Object;)V

    .line 1168
    .line 1169
    .line 1170
    goto/16 :goto_1a

    .line 1171
    .line 1172
    :pswitch_13
    check-cast v0, Ljava/lang/Boolean;

    .line 1173
    .line 1174
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1175
    .line 1176
    .line 1177
    move-result v0

    .line 1178
    iget-object v3, v7, LA/c;->m:Ljava/lang/Object;

    .line 1179
    .line 1180
    check-cast v3, Lio/flutter/plugin/platform/o;

    .line 1181
    .line 1182
    iget-object v3, v3, Lio/flutter/plugin/platform/o;->l:Ljava/lang/Object;

    .line 1183
    .line 1184
    check-cast v3, Lio/flutter/plugin/platform/f;

    .line 1185
    .line 1186
    iget-object v3, v3, Lio/flutter/plugin/platform/f;->c:Lr1/d;

    .line 1187
    .line 1188
    if-eqz v3, :cond_20

    .line 1189
    .line 1190
    check-cast v3, Lr1/b;

    .line 1191
    .line 1192
    invoke-virtual {v3, v0}, Lr1/b;->j(Z)V

    .line 1193
    .line 1194
    .line 1195
    :cond_20
    invoke-virtual {v2, v14}, LB1/o;->d(Ljava/lang/Object;)V
    :try_end_9
    .catch Lorg/json/JSONException; {:try_start_9 .. :try_end_9} :catch_7

    .line 1196
    .line 1197
    .line 1198
    goto/16 :goto_1a

    .line 1199
    .line 1200
    :pswitch_14
    :try_start_a
    check-cast v0, Lorg/json/JSONObject;

    .line 1201
    .line 1202
    invoke-static {v7, v0}, LA/c;->g(LA/c;Lorg/json/JSONObject;)LB1/i;

    .line 1203
    .line 1204
    .line 1205
    move-result-object v0

    .line 1206
    iget-object v3, v7, LA/c;->m:Ljava/lang/Object;

    .line 1207
    .line 1208
    check-cast v3, Lio/flutter/plugin/platform/o;

    .line 1209
    .line 1210
    iget-object v3, v3, Lio/flutter/plugin/platform/o;->l:Ljava/lang/Object;

    .line 1211
    .line 1212
    check-cast v3, Lio/flutter/plugin/platform/f;

    .line 1213
    .line 1214
    invoke-virtual {v3, v0}, Lio/flutter/plugin/platform/f;->a(LB1/i;)V

    .line 1215
    .line 1216
    .line 1217
    invoke-virtual {v2, v14}, LB1/o;->d(Ljava/lang/Object;)V
    :try_end_a
    .catch Lorg/json/JSONException; {:try_start_a .. :try_end_a} :catch_a
    .catch Ljava/lang/NoSuchFieldException; {:try_start_a .. :try_end_a} :catch_9

    .line 1218
    .line 1219
    .line 1220
    goto/16 :goto_1a

    .line 1221
    .line 1222
    :catch_9
    move-exception v0

    .line 1223
    goto :goto_14

    .line 1224
    :catch_a
    move-exception v0

    .line 1225
    :goto_14
    :try_start_b
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1226
    .line 1227
    .line 1228
    move-result-object v0

    .line 1229
    invoke-virtual {v2, v5, v0, v14}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1230
    .line 1231
    .line 1232
    goto/16 :goto_1a

    .line 1233
    .line 1234
    :pswitch_15
    iget-object v0, v7, LA/c;->m:Ljava/lang/Object;

    .line 1235
    .line 1236
    check-cast v0, Lio/flutter/plugin/platform/o;

    .line 1237
    .line 1238
    iget-object v0, v0, Lio/flutter/plugin/platform/o;->l:Ljava/lang/Object;

    .line 1239
    .line 1240
    check-cast v0, Lio/flutter/plugin/platform/f;

    .line 1241
    .line 1242
    invoke-virtual {v0}, Lio/flutter/plugin/platform/f;->b()V

    .line 1243
    .line 1244
    .line 1245
    invoke-virtual {v2, v14}, LB1/o;->d(Ljava/lang/Object;)V

    .line 1246
    .line 1247
    .line 1248
    goto/16 :goto_1a

    .line 1249
    .line 1250
    :pswitch_16
    iget-object v0, v7, LA/c;->m:Ljava/lang/Object;

    .line 1251
    .line 1252
    check-cast v0, Lio/flutter/plugin/platform/o;

    .line 1253
    .line 1254
    iget-object v0, v0, Lio/flutter/plugin/platform/o;->l:Ljava/lang/Object;

    .line 1255
    .line 1256
    check-cast v0, Lio/flutter/plugin/platform/f;

    .line 1257
    .line 1258
    iget-object v3, v0, Lio/flutter/plugin/platform/f;->a:Landroid/app/Activity;

    .line 1259
    .line 1260
    invoke-virtual {v3}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v3

    .line 1264
    invoke-virtual {v3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v3

    .line 1268
    new-instance v4, Lio/flutter/plugin/platform/e;

    .line 1269
    .line 1270
    invoke-direct {v4, v0, v3}, Lio/flutter/plugin/platform/e;-><init>(Lio/flutter/plugin/platform/f;Landroid/view/View;)V

    .line 1271
    .line 1272
    .line 1273
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnSystemUiVisibilityChangeListener(Landroid/view/View$OnSystemUiVisibilityChangeListener;)V

    .line 1274
    .line 1275
    .line 1276
    invoke-virtual {v2, v14}, LB1/o;->d(Ljava/lang/Object;)V
    :try_end_b
    .catch Lorg/json/JSONException; {:try_start_b .. :try_end_b} :catch_7

    .line 1277
    .line 1278
    .line 1279
    goto/16 :goto_1a

    .line 1280
    .line 1281
    :pswitch_17
    :try_start_c
    check-cast v0, Ljava/lang/String;

    .line 1282
    .line 1283
    invoke-static {v7, v0}, LA/c;->f(LA/c;Ljava/lang/String;)I

    .line 1284
    .line 1285
    .line 1286
    move-result v0

    .line 1287
    iget-object v3, v7, LA/c;->m:Ljava/lang/Object;

    .line 1288
    .line 1289
    check-cast v3, Lio/flutter/plugin/platform/o;

    .line 1290
    .line 1291
    invoke-virtual {v3, v0}, Lio/flutter/plugin/platform/o;->h(I)V

    .line 1292
    .line 1293
    .line 1294
    invoke-virtual {v2, v14}, LB1/o;->d(Ljava/lang/Object;)V
    :try_end_c
    .catch Lorg/json/JSONException; {:try_start_c .. :try_end_c} :catch_c
    .catch Ljava/lang/NoSuchFieldException; {:try_start_c .. :try_end_c} :catch_b

    .line 1295
    .line 1296
    .line 1297
    goto/16 :goto_1a

    .line 1298
    .line 1299
    :catch_b
    move-exception v0

    .line 1300
    goto :goto_15

    .line 1301
    :catch_c
    move-exception v0

    .line 1302
    :goto_15
    :try_start_d
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1303
    .line 1304
    .line 1305
    move-result-object v0

    .line 1306
    invoke-virtual {v2, v5, v0, v14}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_d
    .catch Lorg/json/JSONException; {:try_start_d .. :try_end_d} :catch_7

    .line 1307
    .line 1308
    .line 1309
    goto/16 :goto_1a

    .line 1310
    .line 1311
    :pswitch_18
    :try_start_e
    check-cast v0, Lorg/json/JSONArray;

    .line 1312
    .line 1313
    invoke-static {v7, v0}, LA/c;->d(LA/c;Lorg/json/JSONArray;)Ljava/util/ArrayList;

    .line 1314
    .line 1315
    .line 1316
    move-result-object v0

    .line 1317
    iget-object v3, v7, LA/c;->m:Ljava/lang/Object;

    .line 1318
    .line 1319
    check-cast v3, Lio/flutter/plugin/platform/o;

    .line 1320
    .line 1321
    invoke-virtual {v3, v0}, Lio/flutter/plugin/platform/o;->g(Ljava/util/ArrayList;)V

    .line 1322
    .line 1323
    .line 1324
    invoke-virtual {v2, v14}, LB1/o;->d(Ljava/lang/Object;)V
    :try_end_e
    .catch Lorg/json/JSONException; {:try_start_e .. :try_end_e} :catch_e
    .catch Ljava/lang/NoSuchFieldException; {:try_start_e .. :try_end_e} :catch_d

    .line 1325
    .line 1326
    .line 1327
    goto/16 :goto_1a

    .line 1328
    .line 1329
    :catch_d
    move-exception v0

    .line 1330
    goto :goto_16

    .line 1331
    :catch_e
    move-exception v0

    .line 1332
    :goto_16
    :try_start_f
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v0

    .line 1336
    invoke-virtual {v2, v5, v0, v14}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_f
    .catch Lorg/json/JSONException; {:try_start_f .. :try_end_f} :catch_7

    .line 1337
    .line 1338
    .line 1339
    goto/16 :goto_1a

    .line 1340
    .line 1341
    :pswitch_19
    :try_start_10
    check-cast v0, Lorg/json/JSONObject;

    .line 1342
    .line 1343
    const-string v3, "primaryColor"

    .line 1344
    .line 1345
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 1346
    .line 1347
    .line 1348
    move-result v3

    .line 1349
    if-eqz v3, :cond_21

    .line 1350
    .line 1351
    const/high16 v4, -0x1000000

    .line 1352
    .line 1353
    or-int/2addr v3, v4

    .line 1354
    :cond_21
    const-string v4, "label"

    .line 1355
    .line 1356
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1357
    .line 1358
    .line 1359
    move-result-object v0

    .line 1360
    iget-object v4, v7, LA/c;->m:Ljava/lang/Object;

    .line 1361
    .line 1362
    check-cast v4, Lio/flutter/plugin/platform/o;

    .line 1363
    .line 1364
    iget-object v4, v4, Lio/flutter/plugin/platform/o;->l:Ljava/lang/Object;

    .line 1365
    .line 1366
    check-cast v4, Lio/flutter/plugin/platform/f;

    .line 1367
    .line 1368
    iget-object v4, v4, Lio/flutter/plugin/platform/f;->a:Landroid/app/Activity;

    .line 1369
    .line 1370
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1371
    .line 1372
    const/16 v7, 0x1c

    .line 1373
    .line 1374
    if-ge v6, v7, :cond_22

    .line 1375
    .line 1376
    new-instance v6, Landroid/app/ActivityManager$TaskDescription;

    .line 1377
    .line 1378
    invoke-direct {v6, v0, v14, v3}, Landroid/app/ActivityManager$TaskDescription;-><init>(Ljava/lang/String;Landroid/graphics/Bitmap;I)V

    .line 1379
    .line 1380
    .line 1381
    invoke-virtual {v4, v6}, Landroid/app/Activity;->setTaskDescription(Landroid/app/ActivityManager$TaskDescription;)V

    .line 1382
    .line 1383
    .line 1384
    goto :goto_17

    .line 1385
    :cond_22
    new-instance v6, Landroid/app/ActivityManager$TaskDescription;

    .line 1386
    .line 1387
    invoke-static {v0, v3}, LB/b;->c(Ljava/lang/String;I)Landroid/app/ActivityManager$TaskDescription;

    .line 1388
    .line 1389
    .line 1390
    move-result-object v0

    .line 1391
    invoke-virtual {v4, v0}, Landroid/app/Activity;->setTaskDescription(Landroid/app/ActivityManager$TaskDescription;)V

    .line 1392
    .line 1393
    .line 1394
    :goto_17
    invoke-virtual {v2, v14}, LB1/o;->d(Ljava/lang/Object;)V
    :try_end_10
    .catch Lorg/json/JSONException; {:try_start_10 .. :try_end_10} :catch_f

    .line 1395
    .line 1396
    .line 1397
    goto/16 :goto_1a

    .line 1398
    .line 1399
    :catch_f
    move-exception v0

    .line 1400
    :try_start_11
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1401
    .line 1402
    .line 1403
    move-result-object v0

    .line 1404
    invoke-virtual {v2, v5, v0, v14}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_11
    .catch Lorg/json/JSONException; {:try_start_11 .. :try_end_11} :catch_7

    .line 1405
    .line 1406
    .line 1407
    goto/16 :goto_1a

    .line 1408
    .line 1409
    :pswitch_1a
    :try_start_12
    check-cast v0, Lorg/json/JSONArray;

    .line 1410
    .line 1411
    invoke-static {v7, v0}, LA/c;->c(LA/c;Lorg/json/JSONArray;)I

    .line 1412
    .line 1413
    .line 1414
    move-result v0

    .line 1415
    iget-object v3, v7, LA/c;->m:Ljava/lang/Object;

    .line 1416
    .line 1417
    check-cast v3, Lio/flutter/plugin/platform/o;

    .line 1418
    .line 1419
    iget-object v3, v3, Lio/flutter/plugin/platform/o;->l:Ljava/lang/Object;

    .line 1420
    .line 1421
    check-cast v3, Lio/flutter/plugin/platform/f;

    .line 1422
    .line 1423
    iget-object v3, v3, Lio/flutter/plugin/platform/f;->a:Landroid/app/Activity;

    .line 1424
    .line 1425
    invoke-virtual {v3, v0}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 1426
    .line 1427
    .line 1428
    invoke-virtual {v2, v14}, LB1/o;->d(Ljava/lang/Object;)V
    :try_end_12
    .catch Lorg/json/JSONException; {:try_start_12 .. :try_end_12} :catch_11
    .catch Ljava/lang/NoSuchFieldException; {:try_start_12 .. :try_end_12} :catch_10

    .line 1429
    .line 1430
    .line 1431
    goto :goto_1a

    .line 1432
    :catch_10
    move-exception v0

    .line 1433
    goto :goto_18

    .line 1434
    :catch_11
    move-exception v0

    .line 1435
    :goto_18
    :try_start_13
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1436
    .line 1437
    .line 1438
    move-result-object v0

    .line 1439
    invoke-virtual {v2, v5, v0, v14}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_13
    .catch Lorg/json/JSONException; {:try_start_13 .. :try_end_13} :catch_7

    .line 1440
    .line 1441
    .line 1442
    goto :goto_1a

    .line 1443
    :pswitch_1b
    :try_start_14
    check-cast v0, Ljava/lang/String;

    .line 1444
    .line 1445
    invoke-static {v0}, LB1/e;->c(Ljava/lang/String;)I

    .line 1446
    .line 1447
    .line 1448
    move-result v0

    .line 1449
    iget-object v3, v7, LA/c;->m:Ljava/lang/Object;

    .line 1450
    .line 1451
    check-cast v3, Lio/flutter/plugin/platform/o;

    .line 1452
    .line 1453
    invoke-virtual {v3, v0}, Lio/flutter/plugin/platform/o;->k(I)V

    .line 1454
    .line 1455
    .line 1456
    invoke-virtual {v2, v14}, LB1/o;->d(Ljava/lang/Object;)V
    :try_end_14
    .catch Ljava/lang/NoSuchFieldException; {:try_start_14 .. :try_end_14} :catch_12
    .catch Lorg/json/JSONException; {:try_start_14 .. :try_end_14} :catch_7

    .line 1457
    .line 1458
    .line 1459
    goto :goto_1a

    .line 1460
    :catch_12
    move-exception v0

    .line 1461
    :try_start_15
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1462
    .line 1463
    .line 1464
    move-result-object v0

    .line 1465
    invoke-virtual {v2, v5, v0, v14}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_15
    .catch Lorg/json/JSONException; {:try_start_15 .. :try_end_15} :catch_7

    .line 1466
    .line 1467
    .line 1468
    goto :goto_1a

    .line 1469
    :pswitch_1c
    :try_start_16
    check-cast v0, Ljava/lang/String;

    .line 1470
    .line 1471
    invoke-static {v0}, LB1/e;->d(Ljava/lang/String;)I

    .line 1472
    .line 1473
    .line 1474
    move-result v0

    .line 1475
    iget-object v3, v7, LA/c;->m:Ljava/lang/Object;

    .line 1476
    .line 1477
    check-cast v3, Lio/flutter/plugin/platform/o;

    .line 1478
    .line 1479
    iget-object v3, v3, Lio/flutter/plugin/platform/o;->l:Ljava/lang/Object;

    .line 1480
    .line 1481
    check-cast v3, Lio/flutter/plugin/platform/f;

    .line 1482
    .line 1483
    if-ne v0, v6, :cond_23

    .line 1484
    .line 1485
    iget-object v0, v3, Lio/flutter/plugin/platform/f;->a:Landroid/app/Activity;

    .line 1486
    .line 1487
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 1488
    .line 1489
    .line 1490
    move-result-object v0

    .line 1491
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 1492
    .line 1493
    .line 1494
    move-result-object v0

    .line 1495
    invoke-virtual {v0, v15}, Landroid/view/View;->playSoundEffect(I)V

    .line 1496
    .line 1497
    .line 1498
    :cond_23
    invoke-virtual {v2, v14}, LB1/o;->d(Ljava/lang/Object;)V
    :try_end_16
    .catch Ljava/lang/NoSuchFieldException; {:try_start_16 .. :try_end_16} :catch_13
    .catch Lorg/json/JSONException; {:try_start_16 .. :try_end_16} :catch_7

    .line 1499
    .line 1500
    .line 1501
    goto :goto_1a

    .line 1502
    :catch_13
    move-exception v0

    .line 1503
    :try_start_17
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1504
    .line 1505
    .line 1506
    move-result-object v0

    .line 1507
    invoke-virtual {v2, v5, v0, v14}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_17
    .catch Lorg/json/JSONException; {:try_start_17 .. :try_end_17} :catch_7

    .line 1508
    .line 1509
    .line 1510
    goto :goto_1a

    .line 1511
    :goto_19
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1512
    .line 1513
    const-string v4, "JSON error: "

    .line 1514
    .line 1515
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1516
    .line 1517
    .line 1518
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1519
    .line 1520
    .line 1521
    move-result-object v0

    .line 1522
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1523
    .line 1524
    .line 1525
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1526
    .line 1527
    .line 1528
    move-result-object v0

    .line 1529
    invoke-virtual {v2, v5, v0, v14}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1530
    .line 1531
    .line 1532
    :goto_1a
    return-void

    .line 1533
    :pswitch_1d
    const-string v3, "Error when setting cursors: "

    .line 1534
    .line 1535
    iget-object v4, v1, LH0/i;->l:Ljava/lang/Object;

    .line 1536
    .line 1537
    check-cast v4, LB1/a;

    .line 1538
    .line 1539
    iget-object v6, v4, LB1/a;->l:Ljava/lang/Object;

    .line 1540
    .line 1541
    check-cast v6, LH0/i;

    .line 1542
    .line 1543
    if-nez v6, :cond_24

    .line 1544
    .line 1545
    goto :goto_1c

    .line 1546
    :cond_24
    iget-object v6, v0, LA/c;->l:Ljava/lang/Object;

    .line 1547
    .line 1548
    check-cast v6, Ljava/lang/String;

    .line 1549
    .line 1550
    :try_start_18
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 1551
    .line 1552
    .line 1553
    move-result v7

    .line 1554
    const v8, -0x4de8d908

    .line 1555
    .line 1556
    .line 1557
    if-eq v7, v8, :cond_25

    .line 1558
    .line 1559
    goto :goto_1c

    .line 1560
    :cond_25
    const-string v7, "activateSystemCursor"

    .line 1561
    .line 1562
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1563
    .line 1564
    .line 1565
    move-result v6

    .line 1566
    if-eqz v6, :cond_26

    .line 1567
    .line 1568
    iget-object v0, v0, LA/c;->m:Ljava/lang/Object;

    .line 1569
    .line 1570
    check-cast v0, Ljava/util/HashMap;

    .line 1571
    .line 1572
    const-string v6, "kind"

    .line 1573
    .line 1574
    invoke-virtual {v0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1575
    .line 1576
    .line 1577
    move-result-object v0

    .line 1578
    check-cast v0, Ljava/lang/String;
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_14

    .line 1579
    .line 1580
    :try_start_19
    iget-object v4, v4, LB1/a;->l:Ljava/lang/Object;

    .line 1581
    .line 1582
    check-cast v4, LH0/i;

    .line 1583
    .line 1584
    invoke-virtual {v4, v0}, LH0/i;->s(Ljava/lang/String;)V
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_15

    .line 1585
    .line 1586
    .line 1587
    :try_start_1a
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1588
    .line 1589
    invoke-virtual {v2, v0}, LB1/o;->d(Ljava/lang/Object;)V

    .line 1590
    .line 1591
    .line 1592
    goto :goto_1c

    .line 1593
    :catch_14
    move-exception v0

    .line 1594
    goto :goto_1b

    .line 1595
    :catch_15
    move-exception v0

    .line 1596
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1597
    .line 1598
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1599
    .line 1600
    .line 1601
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1602
    .line 1603
    .line 1604
    move-result-object v0

    .line 1605
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1606
    .line 1607
    .line 1608
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1609
    .line 1610
    .line 1611
    move-result-object v0

    .line 1612
    invoke-virtual {v2, v5, v0, v14}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_14

    .line 1613
    .line 1614
    .line 1615
    goto :goto_1c

    .line 1616
    :goto_1b
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1617
    .line 1618
    const-string v4, "Unhandled error: "

    .line 1619
    .line 1620
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1621
    .line 1622
    .line 1623
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1624
    .line 1625
    .line 1626
    move-result-object v0

    .line 1627
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1628
    .line 1629
    .line 1630
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1631
    .line 1632
    .line 1633
    move-result-object v0

    .line 1634
    invoke-virtual {v2, v5, v0, v14}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1635
    .line 1636
    .line 1637
    :cond_26
    :goto_1c
    return-void

    .line 1638
    nop

    .line 1639
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_1d
        :pswitch_d
        :pswitch_c
        :pswitch_0
        :pswitch_b
    .end packed-switch

    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    :sswitch_data_0
    .sparse-switch
        -0x6a0a6d0c -> :sswitch_9
        -0x3c861a16 -> :sswitch_8
        -0x23d2364 -> :sswitch_7
        0x101f2613 -> :sswitch_6
        0x102423ce -> :sswitch_5
        0x26b1e570 -> :sswitch_4
        0x47cf0f0b -> :sswitch_3
        0x66f8a3d9 -> :sswitch_2
        0x71834287 -> :sswitch_1
        0x7df775f0 -> :sswitch_0
    .end sparse-switch

    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    :sswitch_data_1
    .sparse-switch
        -0x59804db0 -> :sswitch_18
        -0x3789da79 -> :sswitch_17
        -0x2dad73d5 -> :sswitch_16
        -0x2af4a94c -> :sswitch_15
        -0x2267c49c -> :sswitch_14
        -0x20b0f718 -> :sswitch_13
        -0xebc6f23 -> :sswitch_12
        -0xcd4cf9e -> :sswitch_11
        0xe6a45af -> :sswitch_10
        0x3436a200 -> :sswitch_f
        0x4341194a -> :sswitch_e
        0x52e10221 -> :sswitch_d
        0x5a408fa8 -> :sswitch_c
        0x63cbfa4a -> :sswitch_b
        0x7e576127 -> :sswitch_a
    .end sparse-switch

    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
    .end packed-switch
.end method

.method public l(Lj/j;Lj/k;)V
    .locals 9

    .line 1
    iget-object v0, p0, LH0/i;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lj/g;

    .line 4
    .line 5
    iget-object v1, v0, Lj/g;->p:Landroid/os/Handler;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, Lj/g;->r:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/4 v4, 0x0

    .line 18
    :goto_0
    const/4 v5, -0x1

    .line 19
    if-ge v4, v3, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    check-cast v6, Lj/f;

    .line 26
    .line 27
    iget-object v6, v6, Lj/f;->b:Lj/j;

    .line 28
    .line 29
    if-ne p1, v6, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move v4, v5

    .line 36
    :goto_1
    if-ne v4, v5, :cond_2

    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-ge v4, v3, :cond_3

    .line 46
    .line 47
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    move-object v2, v0

    .line 52
    check-cast v2, Lj/f;

    .line 53
    .line 54
    :cond_3
    move-object v5, v2

    .line 55
    new-instance v3, Lj/e;

    .line 56
    .line 57
    const/4 v8, 0x0

    .line 58
    move-object v4, p0

    .line 59
    move-object v7, p1

    .line 60
    move-object v6, p2

    .line 61
    invoke-direct/range {v3 .. v8}, Lj/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 62
    .line 63
    .line 64
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 65
    .line 66
    .line 67
    move-result-wide p1

    .line 68
    const-wide/16 v4, 0xc8

    .line 69
    .line 70
    add-long/2addr p1, v4

    .line 71
    invoke-virtual {v1, v3, v7, p1, p2}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public m()V
    .locals 2

    .line 1
    iget-object v0, p0, LH0/i;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lr1/C;

    .line 4
    .line 5
    iget-object v1, v0, Lr1/C;->b:Lio/flutter/embedding/engine/renderer/k;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Lr1/C;->d:Lio/flutter/embedding/engine/renderer/a;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Lio/flutter/embedding/engine/renderer/k;->a(Lio/flutter/embedding/engine/renderer/l;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public n(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, LH0/i;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ll0/t;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ll0/t;->o(I)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public o()I
    .locals 1

    .line 1
    iget-object v0, p0, LH0/i;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ll0/t;

    .line 4
    .line 5
    invoke-virtual {v0}, Ll0/t;->s()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public p(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LH0/i;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LB1/o;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, LB1/o;->d(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public q(Landroid/view/View;)I
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ll0/u;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Ll0/u;

    .line 16
    .line 17
    iget-object p1, p1, Ll0/u;->a:Landroid/graphics/Rect;

    .line 18
    .line 19
    iget p1, p1, Landroid/graphics/Rect;->right:I

    .line 20
    .line 21
    add-int/2addr v1, p1

    .line 22
    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 23
    .line 24
    add-int/2addr v1, p1

    .line 25
    return v1
.end method

.method public r(Lio/flutter/embedding/engine/renderer/k;)V
    .locals 3

    .line 1
    iget-object v0, p0, LH0/i;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lr1/C;

    .line 4
    .line 5
    iget-object v1, v0, Lr1/C;->b:Lio/flutter/embedding/engine/renderer/k;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v2, v0, Lr1/C;->d:Lio/flutter/embedding/engine/renderer/a;

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Lio/flutter/embedding/engine/renderer/k;->g(Lio/flutter/embedding/engine/renderer/l;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iput-object p1, v0, Lr1/C;->b:Lio/flutter/embedding/engine/renderer/k;

    .line 15
    .line 16
    return-void
.end method

.method public s(Ljava/lang/String;)V
    .locals 9

    .line 1
    iget-object v0, p0, LH0/i;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LA/c;

    .line 4
    .line 5
    iget-object v0, v0, LA/c;->l:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, LE1/b;

    .line 8
    .line 9
    const/16 v1, 0x3e8

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    sget-object v2, LA/c;->n:LE1/a;

    .line 16
    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    new-instance v2, LE1/a;

    .line 20
    .line 21
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    const/16 v3, 0x3f2

    .line 25
    .line 26
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    const-string v4, "alias"

    .line 31
    .line 32
    invoke-virtual {v2, v4, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    const/16 v3, 0x3f5

    .line 36
    .line 37
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    const-string v4, "allScroll"

    .line 42
    .line 43
    invoke-virtual {v2, v4, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    const-string v4, "basic"

    .line 47
    .line 48
    invoke-virtual {v2, v4, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    const/16 v4, 0x3ee

    .line 52
    .line 53
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    const-string v5, "cell"

    .line 58
    .line 59
    invoke-virtual {v2, v5, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    const/16 v4, 0x3ea

    .line 63
    .line 64
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    const-string v5, "click"

    .line 69
    .line 70
    invoke-virtual {v2, v5, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    const/16 v4, 0x3e9

    .line 74
    .line 75
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    const-string v5, "contextMenu"

    .line 80
    .line 81
    invoke-virtual {v2, v5, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    const/16 v4, 0x3f3

    .line 85
    .line 86
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    const-string v5, "copy"

    .line 91
    .line 92
    invoke-virtual {v2, v5, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    const/16 v4, 0x3f4

    .line 96
    .line 97
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    const-string v5, "forbidden"

    .line 102
    .line 103
    invoke-virtual {v2, v5, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    const/16 v5, 0x3fc

    .line 107
    .line 108
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    const-string v6, "grab"

    .line 113
    .line 114
    invoke-virtual {v2, v6, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    const/16 v5, 0x3fd

    .line 118
    .line 119
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    const-string v6, "grabbing"

    .line 124
    .line 125
    invoke-virtual {v2, v6, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    const/16 v5, 0x3eb

    .line 129
    .line 130
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    const-string v6, "help"

    .line 135
    .line 136
    invoke-virtual {v2, v6, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    const-string v5, "move"

    .line 140
    .line 141
    invoke-virtual {v2, v5, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    const/4 v3, 0x0

    .line 145
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    const-string v5, "none"

    .line 150
    .line 151
    invoke-virtual {v2, v5, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    const-string v3, "noDrop"

    .line 155
    .line 156
    invoke-virtual {v2, v3, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    const/16 v3, 0x3ef

    .line 160
    .line 161
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    const-string v4, "precise"

    .line 166
    .line 167
    invoke-virtual {v2, v4, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    const/16 v3, 0x3f0

    .line 171
    .line 172
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    const-string v4, "text"

    .line 177
    .line 178
    invoke-virtual {v2, v4, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    const/16 v3, 0x3f6

    .line 182
    .line 183
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    const-string v4, "resizeColumn"

    .line 188
    .line 189
    invoke-virtual {v2, v4, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    const/16 v4, 0x3f7

    .line 193
    .line 194
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 195
    .line 196
    .line 197
    move-result-object v4

    .line 198
    const-string v5, "resizeDown"

    .line 199
    .line 200
    invoke-virtual {v2, v5, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    const/16 v5, 0x3f8

    .line 204
    .line 205
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 206
    .line 207
    .line 208
    move-result-object v5

    .line 209
    const-string v6, "resizeUpLeft"

    .line 210
    .line 211
    invoke-virtual {v2, v6, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    const/16 v7, 0x3f9

    .line 215
    .line 216
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 217
    .line 218
    .line 219
    move-result-object v7

    .line 220
    const-string v8, "resizeDownRight"

    .line 221
    .line 222
    invoke-virtual {v2, v8, v7}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    const-string v8, "resizeLeft"

    .line 226
    .line 227
    invoke-virtual {v2, v8, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    const-string v8, "resizeLeftRight"

    .line 231
    .line 232
    invoke-virtual {v2, v8, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    const-string v8, "resizeRight"

    .line 236
    .line 237
    invoke-virtual {v2, v8, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    const-string v3, "resizeRow"

    .line 241
    .line 242
    invoke-virtual {v2, v3, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    const-string v3, "resizeUp"

    .line 246
    .line 247
    invoke-virtual {v2, v3, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    const-string v3, "resizeUpDown"

    .line 251
    .line 252
    invoke-virtual {v2, v3, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v2, v6, v7}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    const-string v3, "resizeUpRight"

    .line 259
    .line 260
    invoke-virtual {v2, v3, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    const-string v3, "resizeUpLeftDownRight"

    .line 264
    .line 265
    invoke-virtual {v2, v3, v7}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    const-string v3, "resizeUpRightDownLeft"

    .line 269
    .line 270
    invoke-virtual {v2, v3, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    const/16 v3, 0x3f1

    .line 274
    .line 275
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 276
    .line 277
    .line 278
    move-result-object v3

    .line 279
    const-string v4, "verticalText"

    .line 280
    .line 281
    invoke-virtual {v2, v4, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    const/16 v3, 0x3ec

    .line 285
    .line 286
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 287
    .line 288
    .line 289
    move-result-object v3

    .line 290
    const-string v4, "wait"

    .line 291
    .line 292
    invoke-virtual {v2, v4, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    const/16 v3, 0x3fa

    .line 296
    .line 297
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    const-string v4, "zoomIn"

    .line 302
    .line 303
    invoke-virtual {v2, v4, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    const/16 v3, 0x3fb

    .line 307
    .line 308
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 309
    .line 310
    .line 311
    move-result-object v3

    .line 312
    const-string v4, "zoomOut"

    .line 313
    .line 314
    invoke-virtual {v2, v4, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    sput-object v2, LA/c;->n:LE1/a;

    .line 318
    .line 319
    :cond_0
    sget-object v2, LA/c;->n:LE1/a;

    .line 320
    .line 321
    invoke-virtual {v2, p1, v1}, Ljava/util/HashMap;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object p1

    .line 325
    check-cast p1, Ljava/lang/Integer;

    .line 326
    .line 327
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 328
    .line 329
    .line 330
    move-result p1

    .line 331
    move-object v1, v0

    .line 332
    check-cast v1, Lr1/n;

    .line 333
    .line 334
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    invoke-static {v1, p1}, Landroid/view/PointerIcon;->getSystemIcon(Landroid/content/Context;I)Landroid/view/PointerIcon;

    .line 339
    .line 340
    .line 341
    move-result-object p1

    .line 342
    invoke-interface {v0, p1}, LE1/b;->setPointerIcon(Landroid/view/PointerIcon;)V

    .line 343
    .line 344
    .line 345
    return-void
.end method

.method public u()V
    .locals 1

    .line 1
    iget-object v0, p0, LH0/i;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb0/u;

    .line 4
    .line 5
    iget-object v0, v0, Lb0/u;->p:Lb0/I;

    .line 6
    .line 7
    invoke-virtual {v0}, Lb0/I;->P()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public declared-synchronized x()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LH0/i;->l:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, LH0/b;

    .line 5
    .line 6
    iget-object v1, v0, LH0/b;->a:Ljava/util/concurrent/locks/ReentrantLock;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 9
    .line 10
    .line 11
    :try_start_1
    iget-object v0, v0, LH0/b;->b:Landroid/content/SharedPreferences;

    .line 12
    .line 13
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    .line 24
    :try_start_2
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 25
    .line 26
    .line 27
    monitor-exit p0

    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    :try_start_3
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 31
    .line 32
    .line 33
    throw v0

    .line 34
    :goto_0
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 35
    throw v0

    .line 36
    :catchall_1
    move-exception v0

    .line 37
    goto :goto_0
.end method

.class public final LY0/b;
.super LK0/i;
.source "SourceFile"


# static fields
.field public static final l:LA/c;

.field public static final m:LA/c;


# instance fields
.field public final k:Ljava/lang/String;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LK0/d;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, LE0/b;

    .line 7
    .line 8
    const/4 v2, 0x5

    .line 9
    invoke-direct {v1, v2}, LE0/b;-><init>(I)V

    .line 10
    .line 11
    .line 12
    new-instance v2, LA/c;

    .line 13
    .line 14
    const-string v3, "Auth.Api.Identity.Authorization.API"

    .line 15
    .line 16
    invoke-direct {v2, v3, v1, v0}, LA/c;-><init>(Ljava/lang/String;LH2/h;LK0/d;)V

    .line 17
    .line 18
    .line 19
    sput-object v2, LY0/b;->l:LA/c;

    .line 20
    .line 21
    new-instance v0, LK0/d;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    new-instance v1, LE0/b;

    .line 27
    .line 28
    const/4 v2, 0x4

    .line 29
    invoke-direct {v1, v2}, LE0/b;-><init>(I)V

    .line 30
    .line 31
    .line 32
    new-instance v2, LA/c;

    .line 33
    .line 34
    const-string v3, "Auth.Api.Identity.SignIn.API"

    .line 35
    .line 36
    invoke-direct {v2, v3, v1, v0}, LA/c;-><init>(Ljava/lang/String;LH2/h;LK0/d;)V

    .line 37
    .line 38
    .line 39
    sput-object v2, LY0/b;->m:LA/c;

    .line 40
    .line 41
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LF0/k;)V
    .locals 2

    .line 1
    sget-object v0, LY0/b;->l:LA/c;

    sget-object v1, LK0/h;->c:LK0/h;

    invoke-direct {p0, p1, v0, p2, v1}, LK0/i;-><init>(Landroid/content/Context;LA/c;LK0/b;LK0/h;)V

    .line 2
    invoke-static {}, LY0/g;->a()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LY0/b;->k:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LF0/n;)V
    .locals 2

    .line 3
    sget-object v0, LY0/b;->m:LA/c;

    sget-object v1, LK0/h;->c:LK0/h;

    invoke-direct {p0, p1, v0, p2, v1}, LK0/i;-><init>(Landroid/content/Context;LA/c;LK0/b;LK0/h;)V

    .line 4
    invoke-static {}, LY0/g;->a()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LY0/b;->k:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public c(Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;)Lg1/i;
    .locals 14

    .line 1
    iget-object v1, p1, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->k:Ljava/util/List;

    .line 2
    .line 3
    const/4 v12, 0x0

    .line 4
    const/4 v0, 0x1

    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    move v2, v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v2, v12

    .line 16
    :goto_0
    const-string v3, "requestedScopes cannot be null or empty"

    .line 17
    .line 18
    invoke-static {v3, v2}, LM0/r;->a(Ljava/lang/String;Z)V

    .line 19
    .line 20
    .line 21
    iget-object v2, p1, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->s:Landroid/os/Bundle;

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    if-eqz v2, :cond_6

    .line 25
    .line 26
    invoke-virtual {v2}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    move-object v5, v3

    .line 35
    :cond_1
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-eqz v6, :cond_5

    .line 40
    .line 41
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    check-cast v6, Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v2, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    const/16 v8, 0xb

    .line 52
    .line 53
    invoke-static {v8}, LX/j;->b(I)[I

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    array-length v9, v8

    .line 58
    move v10, v12

    .line 59
    :goto_2
    if-ge v10, v9, :cond_3

    .line 60
    .line 61
    aget v11, v8, v10

    .line 62
    .line 63
    invoke-static {v11}, LB1/e;->f(I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v13

    .line 67
    invoke-virtual {v13, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v13

    .line 71
    if-eqz v13, :cond_2

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_2
    add-int/lit8 v10, v10, 0x1

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_3
    move v11, v12

    .line 78
    :goto_3
    if-eqz v7, :cond_1

    .line 79
    .line 80
    if-eqz v11, :cond_1

    .line 81
    .line 82
    if-nez v5, :cond_4

    .line 83
    .line 84
    new-instance v5, Landroid/os/Bundle;

    .line 85
    .line 86
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 87
    .line 88
    .line 89
    :cond_4
    invoke-static {v11}, LB1/e;->f(I)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    invoke-virtual {v5, v6, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_5
    move-object v9, v5

    .line 98
    goto :goto_4

    .line 99
    :cond_6
    move-object v9, v3

    .line 100
    :goto_4
    iget-boolean v2, p1, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->r:Z

    .line 101
    .line 102
    iget-object v4, p1, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->p:Ljava/lang/String;

    .line 103
    .line 104
    iget-object v5, p1, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->o:Landroid/accounts/Account;

    .line 105
    .line 106
    iget-object v6, p1, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->l:Ljava/lang/String;

    .line 107
    .line 108
    if-eqz v4, :cond_7

    .line 109
    .line 110
    invoke-static {v4}, LM0/r;->d(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    goto :goto_5

    .line 114
    :cond_7
    move-object v4, v3

    .line 115
    :goto_5
    if-eqz v5, :cond_8

    .line 116
    .line 117
    goto :goto_6

    .line 118
    :cond_8
    move-object v5, v3

    .line 119
    :goto_6
    iget-boolean v7, p1, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->n:Z

    .line 120
    .line 121
    if-eqz v7, :cond_9

    .line 122
    .line 123
    if-eqz v6, :cond_9

    .line 124
    .line 125
    move-object v3, v6

    .line 126
    move-object v7, v3

    .line 127
    move-object v6, v4

    .line 128
    move v4, v0

    .line 129
    goto :goto_7

    .line 130
    :cond_9
    move-object v7, v6

    .line 131
    move-object v6, v4

    .line 132
    move v4, v12

    .line 133
    :goto_7
    iget-boolean v8, p1, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->m:Z

    .line 134
    .line 135
    if-eqz v8, :cond_c

    .line 136
    .line 137
    if-eqz v7, :cond_c

    .line 138
    .line 139
    if-eqz v3, :cond_a

    .line 140
    .line 141
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    if-eqz v3, :cond_b

    .line 146
    .line 147
    :cond_a
    move v3, v0

    .line 148
    goto :goto_8

    .line 149
    :cond_b
    move v3, v12

    .line 150
    :goto_8
    const-string v8, "two different server client ids provided"

    .line 151
    .line 152
    invoke-static {v8, v3}, LM0/r;->a(Ljava/lang/String;Z)V

    .line 153
    .line 154
    .line 155
    move v3, v0

    .line 156
    move v8, v2

    .line 157
    move-object v2, v7

    .line 158
    goto :goto_9

    .line 159
    :cond_c
    move-object v2, v3

    .line 160
    move v3, v12

    .line 161
    move v8, v3

    .line 162
    :goto_9
    iget-boolean v10, p1, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->t:Z

    .line 163
    .line 164
    iget v11, p1, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->u:I

    .line 165
    .line 166
    new-instance v0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;

    .line 167
    .line 168
    iget-object v7, p0, LY0/b;->k:Ljava/lang/String;

    .line 169
    .line 170
    invoke-direct/range {v0 .. v11}, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;-><init>(Ljava/util/List;Ljava/lang/String;ZZLandroid/accounts/Account;Ljava/lang/String;Ljava/lang/String;ZLandroid/os/Bundle;ZI)V

    .line 171
    .line 172
    .line 173
    invoke-static {}, LL0/k;->b()LL0/k;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    sget-object v1, LY0/f;->b:LJ0/c;

    .line 178
    .line 179
    filled-new-array {v1}, [LJ0/c;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    iput-object v1, p1, LL0/k;->a:Ljava/lang/Object;

    .line 184
    .line 185
    new-instance v1, LA/c;

    .line 186
    .line 187
    const/16 v2, 0x19

    .line 188
    .line 189
    invoke-direct {v1, p0, v0, v2}, LA/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 190
    .line 191
    .line 192
    iput-object v1, p1, LL0/k;->d:Ljava/lang/Object;

    .line 193
    .line 194
    iput-boolean v12, p1, LL0/k;->b:Z

    .line 195
    .line 196
    const/16 v0, 0x5fe

    .line 197
    .line 198
    iput v0, p1, LL0/k;->c:I

    .line 199
    .line 200
    invoke-virtual {p1}, LL0/k;->a()LL0/k;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    invoke-virtual {p0, v12, p1}, LK0/i;->b(ILL0/k;)Lg1/i;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    return-object p1
.end method

.method public d(Landroid/content/Intent;)LF0/a;
    .locals 4

    .line 1
    sget-object v0, Lcom/google/android/gms/common/api/Status;->q:Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    if-eqz p1, :cond_5

    .line 4
    .line 5
    sget-object v1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 6
    .line 7
    const-string v2, "status"

    .line 8
    .line 9
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/4 v3, 0x0

    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    move-object v1, v3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-static {v2, v1}, LS0/a;->p([BLandroid/os/Parcelable$Creator;)LN0/b;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    :goto_0
    check-cast v1, Lcom/google/android/gms/common/api/Status;

    .line 23
    .line 24
    if-eqz v1, :cond_4

    .line 25
    .line 26
    invoke-virtual {v1}, Lcom/google/android/gms/common/api/Status;->b()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_3

    .line 31
    .line 32
    sget-object v1, LF0/a;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 33
    .line 34
    const-string v2, "authorization_result"

    .line 35
    .line 36
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-static {p1, v1}, LS0/a;->p([BLandroid/os/Parcelable$Creator;)LN0/b;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    :goto_1
    check-cast v3, LF0/a;

    .line 48
    .line 49
    if-eqz v3, :cond_2

    .line 50
    .line 51
    return-object v3

    .line 52
    :cond_2
    new-instance p1, LK0/e;

    .line 53
    .line 54
    invoke-direct {p1, v0}, LK0/e;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 55
    .line 56
    .line 57
    throw p1

    .line 58
    :cond_3
    new-instance p1, LK0/e;

    .line 59
    .line 60
    invoke-direct {p1, v1}, LK0/e;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 61
    .line 62
    .line 63
    throw p1

    .line 64
    :cond_4
    new-instance p1, LK0/e;

    .line 65
    .line 66
    sget-object v0, Lcom/google/android/gms/common/api/Status;->s:Lcom/google/android/gms/common/api/Status;

    .line 67
    .line 68
    invoke-direct {p1, v0}, LK0/e;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 69
    .line 70
    .line 71
    throw p1

    .line 72
    :cond_5
    new-instance p1, LK0/e;

    .line 73
    .line 74
    invoke-direct {p1, v0}, LK0/e;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 75
    .line 76
    .line 77
    throw p1
.end method

.method public e(Landroid/content/Intent;)LF0/j;
    .locals 4

    .line 1
    sget-object v0, Lcom/google/android/gms/common/api/Status;->q:Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    if-eqz p1, :cond_5

    .line 4
    .line 5
    sget-object v1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 6
    .line 7
    const-string v2, "status"

    .line 8
    .line 9
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/4 v3, 0x0

    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    move-object v1, v3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-static {v2, v1}, LS0/a;->p([BLandroid/os/Parcelable$Creator;)LN0/b;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    :goto_0
    check-cast v1, Lcom/google/android/gms/common/api/Status;

    .line 23
    .line 24
    if-eqz v1, :cond_4

    .line 25
    .line 26
    invoke-virtual {v1}, Lcom/google/android/gms/common/api/Status;->b()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_3

    .line 31
    .line 32
    sget-object v1, LF0/j;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 33
    .line 34
    const-string v2, "sign_in_credential"

    .line 35
    .line 36
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-static {p1, v1}, LS0/a;->p([BLandroid/os/Parcelable$Creator;)LN0/b;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    :goto_1
    check-cast v3, LF0/j;

    .line 48
    .line 49
    if-eqz v3, :cond_2

    .line 50
    .line 51
    return-object v3

    .line 52
    :cond_2
    new-instance p1, LK0/e;

    .line 53
    .line 54
    invoke-direct {p1, v0}, LK0/e;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 55
    .line 56
    .line 57
    throw p1

    .line 58
    :cond_3
    new-instance p1, LK0/e;

    .line 59
    .line 60
    invoke-direct {p1, v1}, LK0/e;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 61
    .line 62
    .line 63
    throw p1

    .line 64
    :cond_4
    new-instance p1, LK0/e;

    .line 65
    .line 66
    sget-object v0, Lcom/google/android/gms/common/api/Status;->s:Lcom/google/android/gms/common/api/Status;

    .line 67
    .line 68
    invoke-direct {p1, v0}, LK0/e;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 69
    .line 70
    .line 71
    throw p1

    .line 72
    :cond_5
    new-instance p1, LK0/e;

    .line 73
    .line 74
    invoke-direct {p1, v0}, LK0/e;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 75
    .line 76
    .line 77
    throw p1
.end method

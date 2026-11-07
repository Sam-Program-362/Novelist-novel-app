.class public final LH0/e;
.super Lcom/google/android/gms/common/internal/a;
.source "SourceFile"


# instance fields
.field public final y:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;LM0/c;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;LL0/p;LL0/p;)V
    .locals 15

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    const/16 v4, 0x5b

    .line 4
    .line 5
    const/4 v8, 0x0

    .line 6
    move-object v1, p0

    .line 7
    move-object/from16 v2, p1

    .line 8
    .line 9
    move-object/from16 v3, p2

    .line 10
    .line 11
    move-object/from16 v5, p3

    .line 12
    .line 13
    move-object/from16 v6, p5

    .line 14
    .line 15
    move-object/from16 v7, p6

    .line 16
    .line 17
    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/common/internal/a;-><init>(Landroid/content/Context;Landroid/os/Looper;ILM0/c;LK0/j;LK0/k;I)V

    .line 18
    .line 19
    .line 20
    iget-object v1, v5, LM0/c;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Ljava/util/Set;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    new-instance v2, LG0/b;

    .line 27
    .line 28
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    new-instance v3, Ljava/util/HashSet;

    .line 32
    .line 33
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v3, v2, LG0/b;->a:Ljava/util/HashSet;

    .line 37
    .line 38
    new-instance v3, Ljava/util/HashMap;

    .line 39
    .line 40
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object v3, v2, LG0/b;->h:Ljava/util/HashMap;

    .line 44
    .line 45
    new-instance v3, Ljava/util/HashSet;

    .line 46
    .line 47
    iget-object v4, v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->l:Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-direct {v3, v4}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 50
    .line 51
    .line 52
    iput-object v3, v2, LG0/b;->a:Ljava/util/HashSet;

    .line 53
    .line 54
    iget-boolean v3, v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->o:Z

    .line 55
    .line 56
    iput-boolean v3, v2, LG0/b;->b:Z

    .line 57
    .line 58
    iget-boolean v3, v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->p:Z

    .line 59
    .line 60
    iput-boolean v3, v2, LG0/b;->c:Z

    .line 61
    .line 62
    iget-boolean v3, v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->n:Z

    .line 63
    .line 64
    iput-boolean v3, v2, LG0/b;->d:Z

    .line 65
    .line 66
    iget-object v3, v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->q:Ljava/lang/String;

    .line 67
    .line 68
    iput-object v3, v2, LG0/b;->e:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v3, v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->m:Landroid/accounts/Account;

    .line 71
    .line 72
    iput-object v3, v2, LG0/b;->f:Landroid/accounts/Account;

    .line 73
    .line 74
    iget-object v3, v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->r:Ljava/lang/String;

    .line 75
    .line 76
    iput-object v3, v2, LG0/b;->g:Ljava/lang/String;

    .line 77
    .line 78
    iget-object v3, v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->s:Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-static {v3}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->c(Ljava/util/ArrayList;)Ljava/util/HashMap;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    iput-object v3, v2, LG0/b;->h:Ljava/util/HashMap;

    .line 85
    .line 86
    iget-object v0, v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->t:Ljava/lang/String;

    .line 87
    .line 88
    iput-object v0, v2, LG0/b;->i:Ljava/lang/String;

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_0
    new-instance v2, LG0/b;

    .line 92
    .line 93
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 94
    .line 95
    .line 96
    new-instance v0, Ljava/util/HashSet;

    .line 97
    .line 98
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 99
    .line 100
    .line 101
    iput-object v0, v2, LG0/b;->a:Ljava/util/HashSet;

    .line 102
    .line 103
    new-instance v0, Ljava/util/HashMap;

    .line 104
    .line 105
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 106
    .line 107
    .line 108
    iput-object v0, v2, LG0/b;->h:Ljava/util/HashMap;

    .line 109
    .line 110
    :goto_0
    invoke-static {}, LY0/g;->a()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    iput-object v0, v2, LG0/b;->i:Ljava/lang/String;

    .line 115
    .line 116
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-nez v0, :cond_1

    .line 121
    .line 122
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-eqz v1, :cond_1

    .line 131
    .line 132
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    check-cast v1, Lcom/google/android/gms/common/api/Scope;

    .line 137
    .line 138
    const/4 v3, 0x0

    .line 139
    new-array v3, v3, [Lcom/google/android/gms/common/api/Scope;

    .line 140
    .line 141
    iget-object v4, v2, LG0/b;->a:Ljava/util/HashSet;

    .line 142
    .line 143
    invoke-virtual {v4, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-interface {v4, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 151
    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_1
    iget-object v0, v2, LG0/b;->a:Ljava/util/HashSet;

    .line 155
    .line 156
    sget-object v1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->x:Lcom/google/android/gms/common/api/Scope;

    .line 157
    .line 158
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    if-eqz v1, :cond_2

    .line 163
    .line 164
    sget-object v1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->w:Lcom/google/android/gms/common/api/Scope;

    .line 165
    .line 166
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    if-eqz v3, :cond_2

    .line 171
    .line 172
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    :cond_2
    iget-boolean v1, v2, LG0/b;->d:Z

    .line 176
    .line 177
    if-eqz v1, :cond_4

    .line 178
    .line 179
    iget-object v1, v2, LG0/b;->f:Landroid/accounts/Account;

    .line 180
    .line 181
    if-eqz v1, :cond_3

    .line 182
    .line 183
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    if-nez v1, :cond_4

    .line 188
    .line 189
    :cond_3
    iget-object v1, v2, LG0/b;->a:Ljava/util/HashSet;

    .line 190
    .line 191
    sget-object v3, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->v:Lcom/google/android/gms/common/api/Scope;

    .line 192
    .line 193
    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    :cond_4
    new-instance v4, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 197
    .line 198
    new-instance v6, Ljava/util/ArrayList;

    .line 199
    .line 200
    invoke-direct {v6, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 201
    .line 202
    .line 203
    iget-object v7, v2, LG0/b;->f:Landroid/accounts/Account;

    .line 204
    .line 205
    iget-boolean v8, v2, LG0/b;->d:Z

    .line 206
    .line 207
    iget-boolean v9, v2, LG0/b;->b:Z

    .line 208
    .line 209
    iget-boolean v10, v2, LG0/b;->c:Z

    .line 210
    .line 211
    iget-object v11, v2, LG0/b;->e:Ljava/lang/String;

    .line 212
    .line 213
    iget-object v12, v2, LG0/b;->g:Ljava/lang/String;

    .line 214
    .line 215
    iget-object v13, v2, LG0/b;->h:Ljava/util/HashMap;

    .line 216
    .line 217
    iget-object v14, v2, LG0/b;->i:Ljava/lang/String;

    .line 218
    .line 219
    const/4 v5, 0x3

    .line 220
    invoke-direct/range {v4 .. v14}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;-><init>(ILjava/util/ArrayList;Landroid/accounts/Account;ZZZLjava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    iput-object v4, p0, LH0/e;->y:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 224
    .line 225
    return-void
.end method


# virtual methods
.method public final e()I
    .locals 1

    .line 1
    const v0, 0xbdfcb8

    .line 2
    .line 3
    .line 4
    return v0
.end method

.method public final n(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    const-string v0, "com.google.android.gms.auth.api.signin.internal.ISignInService"

    .line 6
    .line 7
    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    instance-of v2, v1, LH0/k;

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    check-cast v1, LH0/k;

    .line 16
    .line 17
    return-object v1

    .line 18
    :cond_1
    new-instance v1, LH0/k;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-direct {v1, p1, v0, v2}, LY0/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    .line 22
    .line 23
    .line 24
    return-object v1
.end method

.method public final r()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "com.google.android.gms.auth.api.signin.internal.ISignInService"

    .line 2
    .line 3
    return-object v0
.end method

.method public final s()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "com.google.android.gms.auth.api.signin.service.START"

    .line 2
    .line 3
    return-object v0
.end method

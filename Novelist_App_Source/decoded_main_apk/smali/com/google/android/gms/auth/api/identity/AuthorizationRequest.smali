.class public Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;
.super LN0/a;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/internal/ReflectedParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final k:Ljava/util/List;

.field public final l:Ljava/lang/String;

.field public final m:Z

.field public final n:Z

.field public final o:Landroid/accounts/Account;

.field public final p:Ljava/lang/String;

.field public final q:Ljava/lang/String;

.field public final r:Z

.field public final s:Landroid/os/Bundle;

.field public final t:Z

.field public final u:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LF0/l;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LF0/l;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/lang/String;ZZLandroid/accounts/Account;Ljava/lang/String;Ljava/lang/String;ZLandroid/os/Bundle;ZI)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 2
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    const-string v1, "requestedScopes cannot be null or empty"

    .line 3
    invoke-static {v1, v0}, LM0/r;->a(Ljava/lang/String;Z)V

    iput-object p1, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->k:Ljava/util/List;

    iput-object p2, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->l:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->m:Z

    iput-boolean p4, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->n:Z

    iput-object p5, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->o:Landroid/accounts/Account;

    iput-object p6, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->p:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->q:Ljava/lang/String;

    iput-boolean p8, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->r:Z

    iput-object p9, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->s:Landroid/os/Bundle;

    iput-boolean p10, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->t:Z

    iput p11, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->u:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    instance-of v0, p1, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p1, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;

    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->k:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    iget-object v3, p1, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->k:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-ne v2, v4, :cond_8

    .line 22
    .line 23
    invoke-interface {v0, v3}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    goto/16 :goto_1

    .line 30
    .line 31
    :cond_1
    iget-object v0, p1, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->s:Landroid/os/Bundle;

    .line 32
    .line 33
    iget-object v2, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->s:Landroid/os/Bundle;

    .line 34
    .line 35
    if-nez v2, :cond_2

    .line 36
    .line 37
    if-nez v0, :cond_3

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    :cond_2
    if-eqz v2, :cond_4

    .line 41
    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    return v1

    .line 46
    :cond_4
    :goto_0
    if-eqz v2, :cond_7

    .line 47
    .line 48
    invoke-virtual {v2}, Landroid/os/BaseBundle;->size()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    invoke-virtual {v0}, Landroid/os/BaseBundle;->size()I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eq v3, v4, :cond_5

    .line 57
    .line 58
    return v1

    .line 59
    :cond_5
    invoke-virtual {v2}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    :cond_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-eqz v4, :cond_7

    .line 72
    .line 73
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    check-cast v4, Ljava/lang/String;

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    invoke-static {v5, v4}, LM0/r;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    if-nez v4, :cond_6

    .line 92
    .line 93
    return v1

    .line 94
    :cond_7
    iget-boolean v0, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->m:Z

    .line 95
    .line 96
    iget-boolean v2, p1, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->m:Z

    .line 97
    .line 98
    if-ne v0, v2, :cond_8

    .line 99
    .line 100
    iget-boolean v0, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->r:Z

    .line 101
    .line 102
    iget-boolean v2, p1, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->r:Z

    .line 103
    .line 104
    if-ne v0, v2, :cond_8

    .line 105
    .line 106
    iget-boolean v0, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->n:Z

    .line 107
    .line 108
    iget-boolean v2, p1, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->n:Z

    .line 109
    .line 110
    if-ne v0, v2, :cond_8

    .line 111
    .line 112
    iget-boolean v0, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->t:Z

    .line 113
    .line 114
    iget-boolean v2, p1, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->t:Z

    .line 115
    .line 116
    if-ne v0, v2, :cond_8

    .line 117
    .line 118
    iget v0, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->u:I

    .line 119
    .line 120
    iget v2, p1, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->u:I

    .line 121
    .line 122
    if-ne v0, v2, :cond_8

    .line 123
    .line 124
    iget-object v0, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->l:Ljava/lang/String;

    .line 125
    .line 126
    iget-object v2, p1, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->l:Ljava/lang/String;

    .line 127
    .line 128
    invoke-static {v0, v2}, LM0/r;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eqz v0, :cond_8

    .line 133
    .line 134
    iget-object v0, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->o:Landroid/accounts/Account;

    .line 135
    .line 136
    iget-object v2, p1, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->o:Landroid/accounts/Account;

    .line 137
    .line 138
    invoke-static {v0, v2}, LM0/r;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-eqz v0, :cond_8

    .line 143
    .line 144
    iget-object v0, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->p:Ljava/lang/String;

    .line 145
    .line 146
    iget-object v2, p1, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->p:Ljava/lang/String;

    .line 147
    .line 148
    invoke-static {v0, v2}, LM0/r;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-eqz v0, :cond_8

    .line 153
    .line 154
    iget-object v0, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->q:Ljava/lang/String;

    .line 155
    .line 156
    iget-object p1, p1, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->q:Ljava/lang/String;

    .line 157
    .line 158
    invoke-static {v0, p1}, LM0/r;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    if-eqz p1, :cond_8

    .line 163
    .line 164
    const/4 p1, 0x1

    .line 165
    return p1

    .line 166
    :cond_8
    :goto_1
    return v1
.end method

.method public final hashCode()I
    .locals 12

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->m:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    iget-boolean v0, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->r:Z

    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    iget-boolean v0, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->n:Z

    .line 14
    .line 15
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    iget-boolean v0, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->t:Z

    .line 20
    .line 21
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    move-result-object v10

    .line 25
    iget v0, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->u:I

    .line 26
    .line 27
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v11

    .line 31
    iget-object v1, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->k:Ljava/util/List;

    .line 32
    .line 33
    iget-object v2, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->l:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v6, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->o:Landroid/accounts/Account;

    .line 36
    .line 37
    iget-object v7, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->p:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v8, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->q:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v9, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->s:Landroid/os/Bundle;

    .line 42
    .line 43
    filled-new-array/range {v1 .. v11}, [Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    const/16 v0, 0x4f45

    .line 2
    .line 3
    invoke-static {p1, v0}, LH2/h;->Q(Landroid/os/Parcel;I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    iget-object v2, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->k:Ljava/util/List;

    .line 9
    .line 10
    invoke-static {p1, v1, v2}, LH2/h;->N(Landroid/os/Parcel;ILjava/util/List;)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    iget-object v2, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->l:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {p1, v1, v2}, LH2/h;->K(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    const/4 v2, 0x4

    .line 21
    invoke-static {p1, v1, v2}, LH2/h;->P(Landroid/os/Parcel;II)V

    .line 22
    .line 23
    .line 24
    iget-boolean v1, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->m:Z

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 27
    .line 28
    .line 29
    invoke-static {p1, v2, v2}, LH2/h;->P(Landroid/os/Parcel;II)V

    .line 30
    .line 31
    .line 32
    iget-boolean v1, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->n:Z

    .line 33
    .line 34
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 35
    .line 36
    .line 37
    const/4 v1, 0x5

    .line 38
    iget-object v3, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->o:Landroid/accounts/Account;

    .line 39
    .line 40
    invoke-static {p1, v1, v3, p2}, LH2/h;->J(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    .line 41
    .line 42
    .line 43
    const/4 p2, 0x6

    .line 44
    iget-object v1, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->p:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {p1, p2, v1}, LH2/h;->K(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p2, 0x7

    .line 50
    iget-object v1, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->q:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {p1, p2, v1}, LH2/h;->K(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/16 p2, 0x8

    .line 56
    .line 57
    invoke-static {p1, p2, v2}, LH2/h;->P(Landroid/os/Parcel;II)V

    .line 58
    .line 59
    .line 60
    iget-boolean p2, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->r:Z

    .line 61
    .line 62
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 63
    .line 64
    .line 65
    const/16 p2, 0x9

    .line 66
    .line 67
    iget-object v1, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->s:Landroid/os/Bundle;

    .line 68
    .line 69
    invoke-static {p1, p2, v1}, LH2/h;->G(Landroid/os/Parcel;ILandroid/os/Bundle;)V

    .line 70
    .line 71
    .line 72
    const/16 p2, 0xa

    .line 73
    .line 74
    invoke-static {p1, p2, v2}, LH2/h;->P(Landroid/os/Parcel;II)V

    .line 75
    .line 76
    .line 77
    iget-boolean p2, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->t:Z

    .line 78
    .line 79
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 80
    .line 81
    .line 82
    const/16 p2, 0xb

    .line 83
    .line 84
    invoke-static {p1, p2, v2}, LH2/h;->P(Landroid/os/Parcel;II)V

    .line 85
    .line 86
    .line 87
    iget p2, p0, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->u:I

    .line 88
    .line 89
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 90
    .line 91
    .line 92
    invoke-static {p1, v0}, LH2/h;->R(Landroid/os/Parcel;I)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

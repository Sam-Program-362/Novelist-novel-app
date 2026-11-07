.class public final LW0/h;
.super LN0/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LW0/h;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final k:Ljava/lang/String;

.field public final l:Landroid/os/Bundle;

.field public final m:Landroid/os/Bundle;

.field public final n:Ljava/lang/String;

.field public final o:Ljava/lang/String;

.field public final p:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LV0/l;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    invoke-direct {v0, v1}, LV0/l;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LW0/h;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "credentialRetrievalData"

    .line 7
    .line 8
    invoke-static {p2, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "candidateQueryData"

    .line 12
    .line 13
    invoke-static {p3, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "requestMatcher"

    .line 17
    .line 18
    invoke-static {p4, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "requestType"

    .line 22
    .line 23
    invoke-static {p5, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "protocolType"

    .line 27
    .line 28
    invoke-static {p6, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, LW0/h;->k:Ljava/lang/String;

    .line 35
    .line 36
    iput-object p2, p0, LW0/h;->l:Landroid/os/Bundle;

    .line 37
    .line 38
    iput-object p3, p0, LW0/h;->m:Landroid/os/Bundle;

    .line 39
    .line 40
    iput-object p4, p0, LW0/h;->n:Ljava/lang/String;

    .line 41
    .line 42
    iput-object p5, p0, LW0/h;->o:Ljava/lang/String;

    .line 43
    .line 44
    iput-object p6, p0, LW0/h;->p:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {p5}, Lh2/d;->d0(Ljava/lang/CharSequence;)Z

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    const/4 p3, 0x1

    .line 51
    const/4 p4, 0x0

    .line 52
    if-nez p2, :cond_0

    .line 53
    .line 54
    invoke-static {p6}, Lh2/d;->d0(Ljava/lang/CharSequence;)Z

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    if-nez p2, :cond_0

    .line 59
    .line 60
    move p2, p3

    .line 61
    goto :goto_0

    .line 62
    :cond_0
    move p2, p4

    .line 63
    :goto_0
    invoke-static {p1}, Lh2/d;->d0(Ljava/lang/CharSequence;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_1

    .line 68
    .line 69
    invoke-interface {p5}, Ljava/lang/CharSequence;->length()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_1

    .line 74
    .line 75
    invoke-interface {p6}, Ljava/lang/CharSequence;->length()I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-nez v0, :cond_1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_1
    move p3, p4

    .line 83
    :goto_1
    if-nez p2, :cond_3

    .line 84
    .line 85
    if-eqz p3, :cond_2

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_2
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    invoke-static {p5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p3

    .line 100
    add-int/lit8 p2, p2, 0x1f

    .line 101
    .line 102
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 103
    .line 104
    .line 105
    move-result p3

    .line 106
    invoke-static {p6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p4

    .line 110
    add-int/2addr p2, p3

    .line 111
    add-int/lit8 p2, p2, 0x13

    .line 112
    .line 113
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    .line 114
    .line 115
    .line 116
    move-result p3

    .line 117
    add-int/2addr p3, p2

    .line 118
    new-instance p2, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    add-int/lit8 p3, p3, 0x45

    .line 121
    .line 122
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 123
    .line 124
    .line 125
    const-string p3, "Either type: "

    .line 126
    .line 127
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    const-string p1, ", or requestType: "

    .line 134
    .line 135
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {p2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    const-string p1, " and protocolType: "

    .line 142
    .line 143
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p2, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    const-string p1, " must be specified, but at least one contains an invalid blank value."

    .line 150
    .line 151
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 159
    .line 160
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    throw p2

    .line 164
    :cond_3
    :goto_2
    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    const-string p2, "dest"

    .line 2
    .line 3
    invoke-static {p1, p2}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/16 p2, 0x4f45

    .line 7
    .line 8
    invoke-static {p1, p2}, LH2/h;->Q(Landroid/os/Parcel;I)I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    const/4 v0, 0x1

    .line 13
    iget-object v1, p0, LW0/h;->k:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {p1, v0, v1}, LH2/h;->K(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x2

    .line 19
    iget-object v1, p0, LW0/h;->l:Landroid/os/Bundle;

    .line 20
    .line 21
    invoke-static {p1, v0, v1}, LH2/h;->G(Landroid/os/Parcel;ILandroid/os/Bundle;)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x3

    .line 25
    iget-object v1, p0, LW0/h;->m:Landroid/os/Bundle;

    .line 26
    .line 27
    invoke-static {p1, v0, v1}, LH2/h;->G(Landroid/os/Parcel;ILandroid/os/Bundle;)V

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x4

    .line 31
    iget-object v1, p0, LW0/h;->n:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {p1, v0, v1}, LH2/h;->K(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x5

    .line 37
    iget-object v1, p0, LW0/h;->o:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {p1, v0, v1}, LH2/h;->K(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x6

    .line 43
    iget-object v1, p0, LW0/h;->p:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {p1, v0, v1}, LH2/h;->K(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-static {p1, p2}, LH2/h;->R(Landroid/os/Parcel;I)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

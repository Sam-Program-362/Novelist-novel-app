.class public final enum LV0/h;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LV0/h;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum l:LV0/h;

.field public static final enum m:LV0/h;

.field public static final enum n:LV0/h;

.field public static final enum o:LV0/h;

.field public static final enum p:LV0/h;

.field public static final enum q:LV0/h;

.field public static final enum r:LV0/h;

.field public static final enum s:LV0/h;

.field public static final enum t:LV0/h;

.field public static final enum u:LV0/h;

.field public static final enum v:LV0/h;

.field public static final enum w:LV0/h;

.field public static final synthetic x:[LV0/h;


# instance fields
.field public final k:I


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    new-instance v0, LV0/h;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "NOT_SUPPORTED_ERR"

    .line 5
    .line 6
    const/16 v3, 0x9

    .line 7
    .line 8
    invoke-direct {v0, v1, v2, v3}, LV0/h;-><init>(ILjava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    sput-object v0, LV0/h;->l:LV0/h;

    .line 12
    .line 13
    new-instance v1, LV0/h;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    const-string v4, "INVALID_STATE_ERR"

    .line 17
    .line 18
    const/16 v5, 0xb

    .line 19
    .line 20
    invoke-direct {v1, v2, v4, v5}, LV0/h;-><init>(ILjava/lang/String;I)V

    .line 21
    .line 22
    .line 23
    sput-object v1, LV0/h;->m:LV0/h;

    .line 24
    .line 25
    new-instance v2, LV0/h;

    .line 26
    .line 27
    const/4 v4, 0x2

    .line 28
    const/16 v6, 0x12

    .line 29
    .line 30
    const-string v7, "SECURITY_ERR"

    .line 31
    .line 32
    invoke-direct {v2, v4, v7, v6}, LV0/h;-><init>(ILjava/lang/String;I)V

    .line 33
    .line 34
    .line 35
    sput-object v2, LV0/h;->n:LV0/h;

    .line 36
    .line 37
    move v4, v3

    .line 38
    new-instance v3, LV0/h;

    .line 39
    .line 40
    const/4 v6, 0x3

    .line 41
    const/16 v7, 0x13

    .line 42
    .line 43
    const-string v8, "NETWORK_ERR"

    .line 44
    .line 45
    invoke-direct {v3, v6, v8, v7}, LV0/h;-><init>(ILjava/lang/String;I)V

    .line 46
    .line 47
    .line 48
    sput-object v3, LV0/h;->o:LV0/h;

    .line 49
    .line 50
    move v6, v4

    .line 51
    new-instance v4, LV0/h;

    .line 52
    .line 53
    const/4 v7, 0x4

    .line 54
    const/16 v8, 0x14

    .line 55
    .line 56
    const-string v9, "ABORT_ERR"

    .line 57
    .line 58
    invoke-direct {v4, v7, v9, v8}, LV0/h;-><init>(ILjava/lang/String;I)V

    .line 59
    .line 60
    .line 61
    sput-object v4, LV0/h;->p:LV0/h;

    .line 62
    .line 63
    move v7, v5

    .line 64
    new-instance v5, LV0/h;

    .line 65
    .line 66
    const/4 v8, 0x5

    .line 67
    const/16 v9, 0x17

    .line 68
    .line 69
    const-string v10, "TIMEOUT_ERR"

    .line 70
    .line 71
    invoke-direct {v5, v8, v10, v9}, LV0/h;-><init>(ILjava/lang/String;I)V

    .line 72
    .line 73
    .line 74
    sput-object v5, LV0/h;->q:LV0/h;

    .line 75
    .line 76
    move v8, v6

    .line 77
    new-instance v6, LV0/h;

    .line 78
    .line 79
    const/4 v9, 0x6

    .line 80
    const/16 v10, 0x1b

    .line 81
    .line 82
    const-string v11, "ENCODING_ERR"

    .line 83
    .line 84
    invoke-direct {v6, v9, v11, v10}, LV0/h;-><init>(ILjava/lang/String;I)V

    .line 85
    .line 86
    .line 87
    sput-object v6, LV0/h;->r:LV0/h;

    .line 88
    .line 89
    move v9, v7

    .line 90
    new-instance v7, LV0/h;

    .line 91
    .line 92
    const/4 v10, 0x7

    .line 93
    const/16 v11, 0x1c

    .line 94
    .line 95
    const-string v12, "UNKNOWN_ERR"

    .line 96
    .line 97
    invoke-direct {v7, v10, v12, v11}, LV0/h;-><init>(ILjava/lang/String;I)V

    .line 98
    .line 99
    .line 100
    sput-object v7, LV0/h;->s:LV0/h;

    .line 101
    .line 102
    move v10, v8

    .line 103
    new-instance v8, LV0/h;

    .line 104
    .line 105
    const/16 v11, 0x8

    .line 106
    .line 107
    const/16 v12, 0x1d

    .line 108
    .line 109
    const-string v13, "CONSTRAINT_ERR"

    .line 110
    .line 111
    invoke-direct {v8, v11, v13, v12}, LV0/h;-><init>(ILjava/lang/String;I)V

    .line 112
    .line 113
    .line 114
    sput-object v8, LV0/h;->t:LV0/h;

    .line 115
    .line 116
    move v11, v9

    .line 117
    new-instance v9, LV0/h;

    .line 118
    .line 119
    const-string v12, "DATA_ERR"

    .line 120
    .line 121
    const/16 v13, 0x1e

    .line 122
    .line 123
    invoke-direct {v9, v10, v12, v13}, LV0/h;-><init>(ILjava/lang/String;I)V

    .line 124
    .line 125
    .line 126
    sput-object v9, LV0/h;->u:LV0/h;

    .line 127
    .line 128
    new-instance v10, LV0/h;

    .line 129
    .line 130
    const/16 v12, 0xa

    .line 131
    .line 132
    const/16 v13, 0x23

    .line 133
    .line 134
    const-string v14, "NOT_ALLOWED_ERR"

    .line 135
    .line 136
    invoke-direct {v10, v12, v14, v13}, LV0/h;-><init>(ILjava/lang/String;I)V

    .line 137
    .line 138
    .line 139
    sput-object v10, LV0/h;->v:LV0/h;

    .line 140
    .line 141
    move v12, v11

    .line 142
    new-instance v11, LV0/h;

    .line 143
    .line 144
    const-string v13, "ATTESTATION_NOT_PRIVATE_ERR"

    .line 145
    .line 146
    const/16 v14, 0x24

    .line 147
    .line 148
    invoke-direct {v11, v12, v13, v14}, LV0/h;-><init>(ILjava/lang/String;I)V

    .line 149
    .line 150
    .line 151
    sput-object v11, LV0/h;->w:LV0/h;

    .line 152
    .line 153
    filled-new-array/range {v0 .. v11}, [LV0/h;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    sput-object v0, LV0/h;->x:[LV0/h;

    .line 158
    .line 159
    new-instance v0, LV0/l;

    .line 160
    .line 161
    const/4 v1, 0x6

    .line 162
    invoke-direct {v0, v1}, LV0/l;-><init>(I)V

    .line 163
    .line 164
    .line 165
    sput-object v0, LV0/h;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 166
    .line 167
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, LV0/h;->k:I

    .line 5
    .line 6
    return-void
.end method

.method public static a(I)LV0/h;
    .locals 5

    .line 1
    invoke-static {}, LV0/h;->values()[LV0/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    if-ge v2, v1, :cond_1

    .line 8
    .line 9
    aget-object v3, v0, v2

    .line 10
    .line 11
    iget v4, v3, LV0/h;->k:I

    .line 12
    .line 13
    if-ne p0, v4, :cond_0

    .line 14
    .line 15
    return-object v3

    .line 16
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    new-instance v0, LV0/g;

    .line 20
    .line 21
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 22
    .line 23
    const-string v1, "Error code "

    .line 24
    .line 25
    const-string v2, " is not supported"

    .line 26
    .line 27
    invoke-static {v1, p0, v2}, LB1/e;->h(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-direct {v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)LV0/h;
    .locals 1

    .line 1
    const-class v0, LV0/h;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LV0/h;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LV0/h;
    .locals 1

    .line 1
    sget-object v0, LV0/h;->x:[LV0/h;

    .line 2
    .line 3
    invoke-virtual {v0}, [LV0/h;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LV0/h;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    iget p2, p0, LV0/h;->k:I

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

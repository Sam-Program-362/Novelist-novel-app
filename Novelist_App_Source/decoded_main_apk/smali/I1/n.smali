.class public final LI1/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:LI1/n;

.field public static final b:LO1/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LI1/n;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LI1/n;->a:LI1/n;

    .line 7
    .line 8
    new-instance v0, LI1/l;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, LI1/l;-><init>(I)V

    .line 12
    .line 13
    .line 14
    new-instance v1, LO1/e;

    .line 15
    .line 16
    invoke-direct {v1, v0}, LO1/e;-><init>(LZ1/a;)V

    .line 17
    .line 18
    .line 19
    sput-object v1, LI1/n;->b:LO1/e;

    .line 20
    .line 21
    return-void
.end method

.method public static a()LC1/l;
    .locals 1

    .line 1
    sget-object v0, LI1/n;->b:LO1/e;

    .line 2
    .line 3
    invoke-virtual {v0}, LO1/e;->a()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LC1/l;

    .line 8
    .line 9
    return-object v0
.end method

.method public static b(LC1/f;LI1/s;)V
    .locals 5

    .line 1
    const-string v0, "binaryMessenger"

    .line 2
    .line 3
    invoke-static {p0, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LB1/s;

    .line 7
    .line 8
    const-string v1, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.getGoogleServicesJsonServerClientId"

    .line 9
    .line 10
    const-string v2, ""

    .line 11
    .line 12
    invoke-static {v1, v2}, Lt/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {}, LI1/n;->a()LC1/l;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    const/4 v4, 0x0

    .line 21
    invoke-direct {v0, p0, v1, v3, v4}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 22
    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    new-instance v1, LI1/m;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-direct {v1, p1, v3}, LI1/m;-><init>(LI1/o;I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, LB1/s;->y(LC1/b;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual {v0, v4}, LB1/s;->y(LC1/b;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    new-instance v0, LB1/s;

    .line 40
    .line 41
    const-string v1, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.getCredential"

    .line 42
    .line 43
    invoke-static {v1, v2}, Lt/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-static {}, LI1/n;->a()LC1/l;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-direct {v0, p0, v1, v3, v4}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 52
    .line 53
    .line 54
    if-eqz p1, :cond_1

    .line 55
    .line 56
    new-instance v1, LI1/m;

    .line 57
    .line 58
    const/4 v3, 0x1

    .line 59
    invoke-direct {v1, p1, v3}, LI1/m;-><init>(LI1/o;I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1}, LB1/s;->y(LC1/b;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    invoke-virtual {v0, v4}, LB1/s;->y(LC1/b;)V

    .line 67
    .line 68
    .line 69
    :goto_1
    new-instance v0, LB1/s;

    .line 70
    .line 71
    const-string v1, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.clearCredentialState"

    .line 72
    .line 73
    invoke-static {v1, v2}, Lt/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-static {}, LI1/n;->a()LC1/l;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-direct {v0, p0, v1, v3, v4}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 82
    .line 83
    .line 84
    if-eqz p1, :cond_2

    .line 85
    .line 86
    new-instance v1, LI1/m;

    .line 87
    .line 88
    const/4 v3, 0x2

    .line 89
    invoke-direct {v1, p1, v3}, LI1/m;-><init>(LI1/o;I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v1}, LB1/s;->y(LC1/b;)V

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_2
    invoke-virtual {v0, v4}, LB1/s;->y(LC1/b;)V

    .line 97
    .line 98
    .line 99
    :goto_2
    new-instance v0, LB1/s;

    .line 100
    .line 101
    const-string v1, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.clearAuthorizationToken"

    .line 102
    .line 103
    invoke-static {v1, v2}, Lt/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-static {}, LI1/n;->a()LC1/l;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-direct {v0, p0, v1, v3, v4}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 112
    .line 113
    .line 114
    if-eqz p1, :cond_3

    .line 115
    .line 116
    new-instance v1, LI1/m;

    .line 117
    .line 118
    const/4 v3, 0x3

    .line 119
    invoke-direct {v1, p1, v3}, LI1/m;-><init>(LI1/o;I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v1}, LB1/s;->y(LC1/b;)V

    .line 123
    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_3
    invoke-virtual {v0, v4}, LB1/s;->y(LC1/b;)V

    .line 127
    .line 128
    .line 129
    :goto_3
    new-instance v0, LB1/s;

    .line 130
    .line 131
    const-string v1, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.authorize"

    .line 132
    .line 133
    invoke-static {v1, v2}, Lt/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-static {}, LI1/n;->a()LC1/l;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-direct {v0, p0, v1, v3, v4}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 142
    .line 143
    .line 144
    if-eqz p1, :cond_4

    .line 145
    .line 146
    new-instance v1, LI1/m;

    .line 147
    .line 148
    const/4 v3, 0x4

    .line 149
    invoke-direct {v1, p1, v3}, LI1/m;-><init>(LI1/o;I)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, v1}, LB1/s;->y(LC1/b;)V

    .line 153
    .line 154
    .line 155
    goto :goto_4

    .line 156
    :cond_4
    invoke-virtual {v0, v4}, LB1/s;->y(LC1/b;)V

    .line 157
    .line 158
    .line 159
    :goto_4
    new-instance v0, LB1/s;

    .line 160
    .line 161
    const-string v1, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.revokeAccess"

    .line 162
    .line 163
    invoke-static {v1, v2}, Lt/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-static {}, LI1/n;->a()LC1/l;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    invoke-direct {v0, p0, v1, v2, v4}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 172
    .line 173
    .line 174
    if-eqz p1, :cond_5

    .line 175
    .line 176
    new-instance p0, LI1/m;

    .line 177
    .line 178
    const/4 v1, 0x5

    .line 179
    invoke-direct {p0, p1, v1}, LI1/m;-><init>(LI1/o;I)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0, p0}, LB1/s;->y(LC1/b;)V

    .line 183
    .line 184
    .line 185
    return-void

    .line 186
    :cond_5
    invoke-virtual {v0, v4}, LB1/s;->y(LC1/b;)V

    .line 187
    .line 188
    .line 189
    return-void
.end method

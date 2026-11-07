.class public final LL1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:LL1/d;

.field public static final b:LO1/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LL1/d;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LL1/d;->a:LL1/d;

    .line 7
    .line 8
    new-instance v0, LI1/l;

    .line 9
    .line 10
    const/4 v1, 0x4

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
    sput-object v1, LL1/d;->b:LO1/e;

    .line 20
    .line 21
    return-void
.end method

.method public static a(LC1/f;LA0/j;)V
    .locals 6

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
    const-string v1, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.canLaunchUrl"

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
    sget-object v3, LL1/d;->b:LO1/e;

    .line 17
    .line 18
    invoke-virtual {v3}, LO1/e;->a()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    check-cast v4, LC1/l;

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    invoke-direct {v0, p0, v1, v4, v5}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 26
    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    new-instance v1, LL1/c;

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    invoke-direct {v1, p1, v4}, LL1/c;-><init>(LL1/e;I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, LB1/s;->y(LC1/b;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {v0, v5}, LB1/s;->y(LC1/b;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    new-instance v0, LB1/s;

    .line 44
    .line 45
    const-string v1, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.launchUrl"

    .line 46
    .line 47
    invoke-static {v1, v2}, Lt/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v3}, LO1/e;->a()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    check-cast v4, LC1/l;

    .line 56
    .line 57
    invoke-direct {v0, p0, v1, v4, v5}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 58
    .line 59
    .line 60
    if-eqz p1, :cond_1

    .line 61
    .line 62
    new-instance v1, LL1/c;

    .line 63
    .line 64
    const/4 v4, 0x1

    .line 65
    invoke-direct {v1, p1, v4}, LL1/c;-><init>(LL1/e;I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v1}, LB1/s;->y(LC1/b;)V

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    invoke-virtual {v0, v5}, LB1/s;->y(LC1/b;)V

    .line 73
    .line 74
    .line 75
    :goto_1
    new-instance v0, LB1/s;

    .line 76
    .line 77
    const-string v1, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.openUrlInApp"

    .line 78
    .line 79
    invoke-static {v1, v2}, Lt/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v3}, LO1/e;->a()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    check-cast v4, LC1/l;

    .line 88
    .line 89
    invoke-direct {v0, p0, v1, v4, v5}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 90
    .line 91
    .line 92
    if-eqz p1, :cond_2

    .line 93
    .line 94
    new-instance v1, LL1/c;

    .line 95
    .line 96
    const/4 v4, 0x2

    .line 97
    invoke-direct {v1, p1, v4}, LL1/c;-><init>(LL1/e;I)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v1}, LB1/s;->y(LC1/b;)V

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_2
    invoke-virtual {v0, v5}, LB1/s;->y(LC1/b;)V

    .line 105
    .line 106
    .line 107
    :goto_2
    new-instance v0, LB1/s;

    .line 108
    .line 109
    const-string v1, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.supportsCustomTabs"

    .line 110
    .line 111
    invoke-static {v1, v2}, Lt/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-virtual {v3}, LO1/e;->a()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    check-cast v4, LC1/l;

    .line 120
    .line 121
    invoke-direct {v0, p0, v1, v4, v5}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 122
    .line 123
    .line 124
    if-eqz p1, :cond_3

    .line 125
    .line 126
    new-instance v1, LL1/c;

    .line 127
    .line 128
    const/4 v4, 0x3

    .line 129
    invoke-direct {v1, p1, v4}, LL1/c;-><init>(LL1/e;I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v1}, LB1/s;->y(LC1/b;)V

    .line 133
    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_3
    invoke-virtual {v0, v5}, LB1/s;->y(LC1/b;)V

    .line 137
    .line 138
    .line 139
    :goto_3
    new-instance v0, LB1/s;

    .line 140
    .line 141
    const-string v1, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.closeWebView"

    .line 142
    .line 143
    invoke-static {v1, v2}, Lt/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-virtual {v3}, LO1/e;->a()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    check-cast v2, LC1/l;

    .line 152
    .line 153
    invoke-direct {v0, p0, v1, v2, v5}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 154
    .line 155
    .line 156
    if-eqz p1, :cond_4

    .line 157
    .line 158
    new-instance p0, LL1/c;

    .line 159
    .line 160
    const/4 v1, 0x4

    .line 161
    invoke-direct {p0, p1, v1}, LL1/c;-><init>(LL1/e;I)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, p0}, LB1/s;->y(LC1/b;)V

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :cond_4
    invoke-virtual {v0, v5}, LB1/s;->y(LC1/b;)V

    .line 169
    .line 170
    .line 171
    return-void
.end method

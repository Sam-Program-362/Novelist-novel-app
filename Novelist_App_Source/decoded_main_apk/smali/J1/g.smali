.class public final LJ1/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:LJ1/g;

.field public static final b:LO1/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LJ1/g;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LJ1/g;->a:LJ1/g;

    .line 7
    .line 8
    new-instance v0, LI1/l;

    .line 9
    .line 10
    const/4 v1, 0x1

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
    sput-object v1, LJ1/g;->b:LO1/e;

    .line 20
    .line 21
    return-void
.end method

.method public static a(LC1/f;LJ1/p;)V
    .locals 7

    .line 1
    const-string v0, "binaryMessenger"

    .line 2
    .line 3
    invoke-static {p0, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LC1/k;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, v0}, LC1/f;->a(LC1/k;)Lt1/a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, LB1/s;

    .line 16
    .line 17
    const-string v2, "dev.flutter.pigeon.image_picker_android.ImagePickerApi.pickImages"

    .line 18
    .line 19
    const-string v3, ""

    .line 20
    .line 21
    invoke-static {v2, v3}, Lt/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    sget-object v4, LJ1/g;->b:LO1/e;

    .line 26
    .line 27
    invoke-virtual {v4}, LO1/e;->a()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    check-cast v5, LC1/l;

    .line 32
    .line 33
    invoke-direct {v1, p0, v2, v5, v0}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 34
    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    if-eqz p1, :cond_0

    .line 38
    .line 39
    new-instance v5, LJ1/f;

    .line 40
    .line 41
    const/4 v6, 0x0

    .line 42
    invoke-direct {v5, p1, v6}, LJ1/f;-><init>(LJ1/h;I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v5}, LB1/s;->y(LC1/b;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 50
    .line 51
    .line 52
    :goto_0
    new-instance v1, LB1/s;

    .line 53
    .line 54
    const-string v5, "dev.flutter.pigeon.image_picker_android.ImagePickerApi.pickVideos"

    .line 55
    .line 56
    invoke-static {v5, v3}, Lt/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-virtual {v4}, LO1/e;->a()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    check-cast v6, LC1/l;

    .line 65
    .line 66
    invoke-direct {v1, p0, v5, v6, v0}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 67
    .line 68
    .line 69
    if-eqz p1, :cond_1

    .line 70
    .line 71
    new-instance v5, LJ1/f;

    .line 72
    .line 73
    const/4 v6, 0x1

    .line 74
    invoke-direct {v5, p1, v6}, LJ1/f;-><init>(LJ1/h;I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, v5}, LB1/s;->y(LC1/b;)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 82
    .line 83
    .line 84
    :goto_1
    new-instance v1, LB1/s;

    .line 85
    .line 86
    const-string v5, "dev.flutter.pigeon.image_picker_android.ImagePickerApi.pickMedia"

    .line 87
    .line 88
    invoke-static {v5, v3}, Lt/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    invoke-virtual {v4}, LO1/e;->a()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    check-cast v6, LC1/l;

    .line 97
    .line 98
    invoke-direct {v1, p0, v5, v6, v2}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 99
    .line 100
    .line 101
    if-eqz p1, :cond_2

    .line 102
    .line 103
    new-instance v5, LJ1/f;

    .line 104
    .line 105
    const/4 v6, 0x2

    .line 106
    invoke-direct {v5, p1, v6}, LJ1/f;-><init>(LJ1/h;I)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1, v5}, LB1/s;->y(LC1/b;)V

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_2
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 114
    .line 115
    .line 116
    :goto_2
    new-instance v1, LB1/s;

    .line 117
    .line 118
    const-string v5, "dev.flutter.pigeon.image_picker_android.ImagePickerApi.retrieveLostResults"

    .line 119
    .line 120
    invoke-static {v5, v3}, Lt/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    invoke-virtual {v4}, LO1/e;->a()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    check-cast v4, LC1/l;

    .line 129
    .line 130
    invoke-direct {v1, p0, v3, v4, v0}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 131
    .line 132
    .line 133
    if-eqz p1, :cond_3

    .line 134
    .line 135
    new-instance p0, LJ1/f;

    .line 136
    .line 137
    const/4 v0, 0x3

    .line 138
    invoke-direct {p0, p1, v0}, LJ1/f;-><init>(LJ1/h;I)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v1, p0}, LB1/s;->y(LC1/b;)V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :cond_3
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 146
    .line 147
    .line 148
    return-void
.end method

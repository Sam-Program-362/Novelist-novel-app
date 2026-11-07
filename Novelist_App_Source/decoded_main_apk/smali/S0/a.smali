.class public abstract LS0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Landroid/content/Context;

.field public static b:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static A(Landroid/content/res/Resources;I)Ljava/util/List;
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->obtainTypedArray(I)Landroid/content/res/TypedArray;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :try_start_0
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 19
    .line 20
    .line 21
    return-object p0

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    goto :goto_3

    .line 24
    :cond_1
    :try_start_1
    new-instance v1, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getType(I)I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    const/4 v4, 0x1

    .line 35
    if-ne v3, v4, :cond_4

    .line 36
    .line 37
    move p1, v2

    .line 38
    :goto_0
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->length()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-ge p1, v3, :cond_6

    .line 43
    .line 44
    invoke-virtual {v0, p1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_3

    .line 49
    .line 50
    invoke-virtual {p0, v3}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    new-instance v4, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 57
    .line 58
    .line 59
    array-length v5, v3

    .line 60
    move v6, v2

    .line 61
    :goto_1
    if-ge v6, v5, :cond_2

    .line 62
    .line 63
    aget-object v7, v3, v6

    .line 64
    .line 65
    invoke-static {v7, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    add-int/lit8 v6, v6, 0x1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    :cond_3
    add-int/lit8 p1, p1, 0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_4
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    new-instance p1, Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 88
    .line 89
    .line 90
    array-length v3, p0

    .line 91
    move v4, v2

    .line 92
    :goto_2
    if-ge v4, v3, :cond_5

    .line 93
    .line 94
    aget-object v5, p0, v4

    .line 95
    .line 96
    invoke-static {v5, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    add-int/lit8 v4, v4, 0x1

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_5
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 107
    .line 108
    .line 109
    :cond_6
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 110
    .line 111
    .line 112
    return-object v1

    .line 113
    :goto_3
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 114
    .line 115
    .line 116
    throw p0
.end method

.method public static B(Landroid/view/Window;Z)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x23

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0, p1}, LD/J;->e(Landroid/view/Window;Z)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const/16 v1, 0x1e

    .line 12
    .line 13
    if-lt v0, v1, :cond_1

    .line 14
    .line 15
    invoke-static {p0, p1}, LD/J;->d(Landroid/view/Window;Z)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getSystemUiVisibility()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    and-int/lit16 p1, v0, -0x701

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    or-int/lit16 p1, v0, 0x700

    .line 33
    .line 34
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public static varargs C([Ljava/lang/Object;)Ljava/util/Set;
    .locals 4

    .line 1
    array-length v0, p0

    .line 2
    if-eqz v0, :cond_2

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x1

    .line 6
    if-eq v0, v2, :cond_1

    .line 7
    .line 8
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 9
    .line 10
    array-length v2, p0

    .line 11
    invoke-static {v2}, LP1/p;->S(I)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-direct {v0, v2}, Ljava/util/LinkedHashSet;-><init>(I)V

    .line 16
    .line 17
    .line 18
    array-length v2, p0

    .line 19
    :goto_0
    if-ge v1, v2, :cond_0

    .line 20
    .line 21
    aget-object v3, p0, v1

    .line 22
    .line 23
    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-object v0

    .line 30
    :cond_1
    aget-object p0, p0, v1

    .line 31
    .line 32
    invoke-static {p0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    const-string v0, "singleton(...)"

    .line 37
    .line 38
    invoke-static {p0, v0}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_2
    sget-object p0, LP1/o;->k:LP1/o;

    .line 43
    .line 44
    return-object p0
.end method

.method public static D(LC1/f;LM1/j;)V
    .locals 5

    .line 1
    const-string v0, "binaryMessenger"

    .line 2
    .line 3
    invoke-static {p0, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object v0, p1, LM1/j;->a:LM1/O;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, LM1/O;->a()LC1/l;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance v0, LI1/u;

    .line 18
    .line 19
    const/4 v1, 0x5

    .line 20
    invoke-direct {v0, v1}, LI1/u;-><init>(I)V

    .line 21
    .line 22
    .line 23
    :goto_0
    new-instance v1, LB1/s;

    .line 24
    .line 25
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getCName"

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 29
    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    new-instance v2, LM1/G;

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    invoke-direct {v2, p1, v4}, LM1/G;-><init>(LM1/j;I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 44
    .line 45
    .line 46
    :goto_1
    new-instance v1, LB1/s;

    .line 47
    .line 48
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getDName"

    .line 49
    .line 50
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 51
    .line 52
    .line 53
    if-eqz p1, :cond_2

    .line 54
    .line 55
    new-instance v2, LM1/G;

    .line 56
    .line 57
    const/4 v4, 0x1

    .line 58
    invoke-direct {v2, p1, v4}, LM1/G;-><init>(LM1/j;I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 66
    .line 67
    .line 68
    :goto_2
    new-instance v1, LB1/s;

    .line 69
    .line 70
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getOName"

    .line 71
    .line 72
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 73
    .line 74
    .line 75
    if-eqz p1, :cond_3

    .line 76
    .line 77
    new-instance v2, LM1/G;

    .line 78
    .line 79
    const/4 v4, 0x2

    .line 80
    invoke-direct {v2, p1, v4}, LM1/G;-><init>(LM1/j;I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 84
    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_3
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 88
    .line 89
    .line 90
    :goto_3
    new-instance v1, LB1/s;

    .line 91
    .line 92
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getUName"

    .line 93
    .line 94
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 95
    .line 96
    .line 97
    if-eqz p1, :cond_4

    .line 98
    .line 99
    new-instance p0, LM1/G;

    .line 100
    .line 101
    const/4 v0, 0x3

    .line 102
    invoke-direct {p0, p1, v0}, LM1/G;-><init>(LM1/j;I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, p0}, LB1/s;->y(LC1/b;)V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :cond_4
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 110
    .line 111
    .line 112
    return-void
.end method

.method public static E(LC1/f;LM1/n;)V
    .locals 5

    .line 1
    const-string v0, "binaryMessenger"

    .line 2
    .line 3
    invoke-static {p0, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object v0, p1, LM1/n;->a:LM1/O;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, LM1/O;->a()LC1/l;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance v0, LI1/u;

    .line 18
    .line 19
    const/4 v1, 0x5

    .line 20
    invoke-direct {v0, v1}, LI1/u;-><init>(I)V

    .line 21
    .line 22
    .line 23
    :goto_0
    new-instance v1, LB1/s;

    .line 24
    .line 25
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.CookieManager.instance"

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 29
    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    new-instance v2, LM1/C;

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    invoke-direct {v2, p1, v4}, LM1/C;-><init>(LM1/n;I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 44
    .line 45
    .line 46
    :goto_1
    new-instance v1, LB1/s;

    .line 47
    .line 48
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.CookieManager.setCookie"

    .line 49
    .line 50
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 51
    .line 52
    .line 53
    if-eqz p1, :cond_2

    .line 54
    .line 55
    new-instance v2, LM1/C;

    .line 56
    .line 57
    const/4 v4, 0x1

    .line 58
    invoke-direct {v2, p1, v4}, LM1/C;-><init>(LM1/n;I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 66
    .line 67
    .line 68
    :goto_2
    new-instance v1, LB1/s;

    .line 69
    .line 70
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.CookieManager.removeAllCookies"

    .line 71
    .line 72
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 73
    .line 74
    .line 75
    if-eqz p1, :cond_3

    .line 76
    .line 77
    new-instance v2, LM1/C;

    .line 78
    .line 79
    const/4 v4, 0x2

    .line 80
    invoke-direct {v2, p1, v4}, LM1/C;-><init>(LM1/n;I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 84
    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_3
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 88
    .line 89
    .line 90
    :goto_3
    new-instance v1, LB1/s;

    .line 91
    .line 92
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.CookieManager.setAcceptThirdPartyCookies"

    .line 93
    .line 94
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 95
    .line 96
    .line 97
    if-eqz p1, :cond_4

    .line 98
    .line 99
    new-instance v2, LM1/C;

    .line 100
    .line 101
    const/4 v4, 0x3

    .line 102
    invoke-direct {v2, p1, v4}, LM1/C;-><init>(LM1/n;I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 106
    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_4
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 110
    .line 111
    .line 112
    :goto_4
    new-instance v1, LB1/s;

    .line 113
    .line 114
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.CookieManager.getCookies"

    .line 115
    .line 116
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 117
    .line 118
    .line 119
    if-eqz p1, :cond_5

    .line 120
    .line 121
    new-instance p0, LM1/C;

    .line 122
    .line 123
    const/4 v0, 0x4

    .line 124
    invoke-direct {p0, p1, v0}, LM1/C;-><init>(LM1/n;I)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1, p0}, LB1/s;->y(LC1/b;)V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :cond_5
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 132
    .line 133
    .line 134
    return-void
.end method

.method public static F(LC1/f;LM1/s;)V
    .locals 5

    .line 1
    const-string v0, "binaryMessenger"

    .line 2
    .line 3
    invoke-static {p0, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object v0, p1, LM1/s;->a:LM1/O;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, LM1/O;->a()LC1/l;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance v0, LI1/u;

    .line 18
    .line 19
    const/4 v1, 0x5

    .line 20
    invoke-direct {v0, v1}, LI1/u;-><init>(I)V

    .line 21
    .line 22
    .line 23
    :goto_0
    new-instance v1, LB1/s;

    .line 24
    .line 25
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_defaultConstructor"

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 29
    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    new-instance v2, LM1/M;

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    invoke-direct {v2, p1, v4}, LM1/M;-><init>(LM1/s;I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 44
    .line 45
    .line 46
    :goto_1
    new-instance v1, LB1/s;

    .line 47
    .line 48
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.settings"

    .line 49
    .line 50
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 51
    .line 52
    .line 53
    if-eqz p1, :cond_2

    .line 54
    .line 55
    new-instance v2, LM1/M;

    .line 56
    .line 57
    const/4 v4, 0x2

    .line 58
    invoke-direct {v2, p1, v4}, LM1/M;-><init>(LM1/s;I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 66
    .line 67
    .line 68
    :goto_2
    new-instance v1, LB1/s;

    .line 69
    .line 70
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.loadData"

    .line 71
    .line 72
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 73
    .line 74
    .line 75
    if-eqz p1, :cond_3

    .line 76
    .line 77
    new-instance v2, LM1/M;

    .line 78
    .line 79
    const/4 v4, 0x6

    .line 80
    invoke-direct {v2, p1, v4}, LM1/M;-><init>(LM1/s;I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 84
    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_3
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 88
    .line 89
    .line 90
    :goto_3
    new-instance v1, LB1/s;

    .line 91
    .line 92
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.loadDataWithBaseUrl"

    .line 93
    .line 94
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 95
    .line 96
    .line 97
    if-eqz p1, :cond_4

    .line 98
    .line 99
    new-instance v2, LM1/M;

    .line 100
    .line 101
    const/4 v4, 0x7

    .line 102
    invoke-direct {v2, p1, v4}, LM1/M;-><init>(LM1/s;I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 106
    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_4
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 110
    .line 111
    .line 112
    :goto_4
    new-instance v1, LB1/s;

    .line 113
    .line 114
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.loadUrl"

    .line 115
    .line 116
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 117
    .line 118
    .line 119
    if-eqz p1, :cond_5

    .line 120
    .line 121
    new-instance v2, LM1/M;

    .line 122
    .line 123
    const/16 v4, 0x8

    .line 124
    .line 125
    invoke-direct {v2, p1, v4}, LM1/M;-><init>(LM1/s;I)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 129
    .line 130
    .line 131
    goto :goto_5

    .line 132
    :cond_5
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 133
    .line 134
    .line 135
    :goto_5
    new-instance v1, LB1/s;

    .line 136
    .line 137
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.postUrl"

    .line 138
    .line 139
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 140
    .line 141
    .line 142
    if-eqz p1, :cond_6

    .line 143
    .line 144
    new-instance v2, LM1/M;

    .line 145
    .line 146
    const/16 v4, 0x9

    .line 147
    .line 148
    invoke-direct {v2, p1, v4}, LM1/M;-><init>(LM1/s;I)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 152
    .line 153
    .line 154
    goto :goto_6

    .line 155
    :cond_6
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 156
    .line 157
    .line 158
    :goto_6
    new-instance v1, LB1/s;

    .line 159
    .line 160
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.getUrl"

    .line 161
    .line 162
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 163
    .line 164
    .line 165
    if-eqz p1, :cond_7

    .line 166
    .line 167
    new-instance v2, LM1/M;

    .line 168
    .line 169
    const/16 v4, 0xa

    .line 170
    .line 171
    invoke-direct {v2, p1, v4}, LM1/M;-><init>(LM1/s;I)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 175
    .line 176
    .line 177
    goto :goto_7

    .line 178
    :cond_7
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 179
    .line 180
    .line 181
    :goto_7
    new-instance v1, LB1/s;

    .line 182
    .line 183
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.canGoBack"

    .line 184
    .line 185
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 186
    .line 187
    .line 188
    if-eqz p1, :cond_8

    .line 189
    .line 190
    new-instance v2, LM1/M;

    .line 191
    .line 192
    const/16 v4, 0xc

    .line 193
    .line 194
    invoke-direct {v2, p1, v4}, LM1/M;-><init>(LM1/s;I)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 198
    .line 199
    .line 200
    goto :goto_8

    .line 201
    :cond_8
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 202
    .line 203
    .line 204
    :goto_8
    new-instance v1, LB1/s;

    .line 205
    .line 206
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.canGoForward"

    .line 207
    .line 208
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 209
    .line 210
    .line 211
    if-eqz p1, :cond_9

    .line 212
    .line 213
    new-instance v2, LM1/M;

    .line 214
    .line 215
    const/16 v4, 0xd

    .line 216
    .line 217
    invoke-direct {v2, p1, v4}, LM1/M;-><init>(LM1/s;I)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 221
    .line 222
    .line 223
    goto :goto_9

    .line 224
    :cond_9
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 225
    .line 226
    .line 227
    :goto_9
    new-instance v1, LB1/s;

    .line 228
    .line 229
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.goBack"

    .line 230
    .line 231
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 232
    .line 233
    .line 234
    if-eqz p1, :cond_a

    .line 235
    .line 236
    new-instance v2, LM1/M;

    .line 237
    .line 238
    const/16 v4, 0xe

    .line 239
    .line 240
    invoke-direct {v2, p1, v4}, LM1/M;-><init>(LM1/s;I)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 244
    .line 245
    .line 246
    goto :goto_a

    .line 247
    :cond_a
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 248
    .line 249
    .line 250
    :goto_a
    new-instance v1, LB1/s;

    .line 251
    .line 252
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.goForward"

    .line 253
    .line 254
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 255
    .line 256
    .line 257
    if-eqz p1, :cond_b

    .line 258
    .line 259
    new-instance v2, LM1/M;

    .line 260
    .line 261
    const/16 v4, 0xb

    .line 262
    .line 263
    invoke-direct {v2, p1, v4}, LM1/M;-><init>(LM1/s;I)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 267
    .line 268
    .line 269
    goto :goto_b

    .line 270
    :cond_b
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 271
    .line 272
    .line 273
    :goto_b
    new-instance v1, LB1/s;

    .line 274
    .line 275
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.reload"

    .line 276
    .line 277
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 278
    .line 279
    .line 280
    if-eqz p1, :cond_c

    .line 281
    .line 282
    new-instance v2, LM1/M;

    .line 283
    .line 284
    const/16 v4, 0xf

    .line 285
    .line 286
    invoke-direct {v2, p1, v4}, LM1/M;-><init>(LM1/s;I)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 290
    .line 291
    .line 292
    goto :goto_c

    .line 293
    :cond_c
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 294
    .line 295
    .line 296
    :goto_c
    new-instance v1, LB1/s;

    .line 297
    .line 298
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.clearCache"

    .line 299
    .line 300
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 301
    .line 302
    .line 303
    if-eqz p1, :cond_d

    .line 304
    .line 305
    new-instance v2, LM1/M;

    .line 306
    .line 307
    const/16 v4, 0x10

    .line 308
    .line 309
    invoke-direct {v2, p1, v4}, LM1/M;-><init>(LM1/s;I)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 313
    .line 314
    .line 315
    goto :goto_d

    .line 316
    :cond_d
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 317
    .line 318
    .line 319
    :goto_d
    new-instance v1, LB1/s;

    .line 320
    .line 321
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.evaluateJavascript"

    .line 322
    .line 323
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 324
    .line 325
    .line 326
    if-eqz p1, :cond_e

    .line 327
    .line 328
    new-instance v2, LM1/M;

    .line 329
    .line 330
    const/16 v4, 0x11

    .line 331
    .line 332
    invoke-direct {v2, p1, v4}, LM1/M;-><init>(LM1/s;I)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 336
    .line 337
    .line 338
    goto :goto_e

    .line 339
    :cond_e
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 340
    .line 341
    .line 342
    :goto_e
    new-instance v1, LB1/s;

    .line 343
    .line 344
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.getTitle"

    .line 345
    .line 346
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 347
    .line 348
    .line 349
    if-eqz p1, :cond_f

    .line 350
    .line 351
    new-instance v2, LM1/M;

    .line 352
    .line 353
    const/16 v4, 0x12

    .line 354
    .line 355
    invoke-direct {v2, p1, v4}, LM1/M;-><init>(LM1/s;I)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 359
    .line 360
    .line 361
    goto :goto_f

    .line 362
    :cond_f
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 363
    .line 364
    .line 365
    :goto_f
    new-instance v1, LB1/s;

    .line 366
    .line 367
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebContentsDebuggingEnabled"

    .line 368
    .line 369
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 370
    .line 371
    .line 372
    if-eqz p1, :cond_10

    .line 373
    .line 374
    new-instance v2, LM1/M;

    .line 375
    .line 376
    const/16 v4, 0x13

    .line 377
    .line 378
    invoke-direct {v2, p1, v4}, LM1/M;-><init>(LM1/s;I)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 382
    .line 383
    .line 384
    goto :goto_10

    .line 385
    :cond_10
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 386
    .line 387
    .line 388
    :goto_10
    new-instance v1, LB1/s;

    .line 389
    .line 390
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebViewClient"

    .line 391
    .line 392
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 393
    .line 394
    .line 395
    if-eqz p1, :cond_11

    .line 396
    .line 397
    new-instance v2, LM1/M;

    .line 398
    .line 399
    const/16 v4, 0x14

    .line 400
    .line 401
    invoke-direct {v2, p1, v4}, LM1/M;-><init>(LM1/s;I)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 405
    .line 406
    .line 407
    goto :goto_11

    .line 408
    :cond_11
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 409
    .line 410
    .line 411
    :goto_11
    new-instance v1, LB1/s;

    .line 412
    .line 413
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.addJavaScriptChannel"

    .line 414
    .line 415
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 416
    .line 417
    .line 418
    if-eqz p1, :cond_12

    .line 419
    .line 420
    new-instance v2, LM1/M;

    .line 421
    .line 422
    const/16 v4, 0x15

    .line 423
    .line 424
    invoke-direct {v2, p1, v4}, LM1/M;-><init>(LM1/s;I)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 428
    .line 429
    .line 430
    goto :goto_12

    .line 431
    :cond_12
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 432
    .line 433
    .line 434
    :goto_12
    new-instance v1, LB1/s;

    .line 435
    .line 436
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.removeJavaScriptChannel"

    .line 437
    .line 438
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 439
    .line 440
    .line 441
    if-eqz p1, :cond_13

    .line 442
    .line 443
    new-instance v2, LM1/M;

    .line 444
    .line 445
    const/16 v4, 0x16

    .line 446
    .line 447
    invoke-direct {v2, p1, v4}, LM1/M;-><init>(LM1/s;I)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 451
    .line 452
    .line 453
    goto :goto_13

    .line 454
    :cond_13
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 455
    .line 456
    .line 457
    :goto_13
    new-instance v1, LB1/s;

    .line 458
    .line 459
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.setDownloadListener"

    .line 460
    .line 461
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 462
    .line 463
    .line 464
    if-eqz p1, :cond_14

    .line 465
    .line 466
    new-instance v2, LM1/M;

    .line 467
    .line 468
    const/4 v4, 0x1

    .line 469
    invoke-direct {v2, p1, v4}, LM1/M;-><init>(LM1/s;I)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 473
    .line 474
    .line 475
    goto :goto_14

    .line 476
    :cond_14
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 477
    .line 478
    .line 479
    :goto_14
    new-instance v1, LB1/s;

    .line 480
    .line 481
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebChromeClient"

    .line 482
    .line 483
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 484
    .line 485
    .line 486
    if-eqz p1, :cond_15

    .line 487
    .line 488
    new-instance v2, LM1/M;

    .line 489
    .line 490
    const/4 v4, 0x3

    .line 491
    invoke-direct {v2, p1, v4}, LM1/M;-><init>(LM1/s;I)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 495
    .line 496
    .line 497
    goto :goto_15

    .line 498
    :cond_15
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 499
    .line 500
    .line 501
    :goto_15
    new-instance v1, LB1/s;

    .line 502
    .line 503
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.setBackgroundColor"

    .line 504
    .line 505
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 506
    .line 507
    .line 508
    if-eqz p1, :cond_16

    .line 509
    .line 510
    new-instance v2, LM1/M;

    .line 511
    .line 512
    const/4 v4, 0x4

    .line 513
    invoke-direct {v2, p1, v4}, LM1/M;-><init>(LM1/s;I)V

    .line 514
    .line 515
    .line 516
    invoke-virtual {v1, v2}, LB1/s;->y(LC1/b;)V

    .line 517
    .line 518
    .line 519
    goto :goto_16

    .line 520
    :cond_16
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 521
    .line 522
    .line 523
    :goto_16
    new-instance v1, LB1/s;

    .line 524
    .line 525
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.destroy"

    .line 526
    .line 527
    invoke-direct {v1, p0, v2, v0, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 528
    .line 529
    .line 530
    if-eqz p1, :cond_17

    .line 531
    .line 532
    new-instance p0, LM1/M;

    .line 533
    .line 534
    const/4 v0, 0x5

    .line 535
    invoke-direct {p0, p1, v0}, LM1/M;-><init>(LM1/s;I)V

    .line 536
    .line 537
    .line 538
    invoke-virtual {v1, p0}, LB1/s;->y(LC1/b;)V

    .line 539
    .line 540
    .line 541
    return-void

    .line 542
    :cond_17
    invoke-virtual {v1, v3}, LB1/s;->y(LC1/b;)V

    .line 543
    .line 544
    .line 545
    return-void
.end method

.method public static G(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    :goto_0
    if-lez v0, :cond_2

    .line 3
    .line 4
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const/4 v2, 0x2

    .line 9
    if-eq v1, v2, :cond_1

    .line 10
    .line 11
    const/4 v2, 0x3

    .line 12
    if-eq v1, v2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_2
    return-void
.end method

.method public static H(Landroid/content/Context;I)I
    .locals 1

    .line 1
    const v0, 0x1030001

    .line 2
    .line 3
    .line 4
    filled-new-array {p1}, [I

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p0, v0, p1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const/4 p1, 0x0

    .line 13
    const/4 v0, -0x1

    .line 14
    invoke-virtual {p0, p1, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 19
    .line 20
    .line 21
    return p1
.end method

.method public static final I(Ljava/lang/String;LZ1/a;)Z
    .locals 2

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const-string v1, "ReflectionGuard"

    .line 4
    .line 5
    :try_start_0
    invoke-interface {p1}, LZ1/a;->a()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-static {v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    :cond_0
    return p1

    .line 23
    :catch_0
    if-nez p0, :cond_1

    .line 24
    .line 25
    move-object p0, v0

    .line 26
    :cond_1
    const-string p1, "NoSuchMethod: "

    .line 27
    .line 28
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catch_1
    if-nez p0, :cond_2

    .line 37
    .line 38
    move-object p0, v0

    .line 39
    :cond_2
    const-string p1, "ClassNotFound: "

    .line 40
    .line 41
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    :goto_0
    const/4 p0, 0x0

    .line 49
    return p0
.end method

.method public static final J(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;
    .locals 2

    .line 1
    const-string v0, "serverClientId"

    .line 2
    .line 3
    invoke-static {p0, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/os/Bundle;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v1, "com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_SERVER_CLIENT_ID"

    .line 12
    .line 13
    invoke-virtual {v0, v1, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string p0, "com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_NONCE"

    .line 17
    .line 18
    invoke-virtual {v0, p0, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string p0, "com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_HOSTED_DOMAIN_FILTER"

    .line 22
    .line 23
    invoke-virtual {v0, p0, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string p0, "com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_AUTO_SELECT_ENABLED"

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    invoke-virtual {v0, p0, p1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const-string p0, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_GOOGLE_ID_TOKEN_SUBTYPE"

    .line 33
    .line 34
    const-string p1, "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_SIWG_CREDENTIAL"

    .line 35
    .line 36
    invoke-virtual {v0, p0, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-object v0
.end method

.method public static K(I[Ljava/lang/Object;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    if-ge v0, p0, :cond_1

    .line 3
    .line 4
    aget-object v1, p1, v0

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    add-int/lit8 v0, v0, 0x1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    .line 12
    .line 13
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    new-instance v1, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    add-int/lit8 p1, p1, 0x9

    .line 24
    .line 25
    invoke-direct {v1, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 26
    .line 27
    .line 28
    const-string p1, "at index "

    .line 29
    .line 30
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p0

    .line 44
    :cond_1
    return-void
.end method

.method public static final a(Ljava/util/List;LV/k;LT1/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, LV/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LV/e;

    .line 7
    .line 8
    iget v1, v0, LV/e;->q:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LV/e;->q:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LV/e;

    .line 21
    .line 22
    invoke-direct {v0, p2}, LT1/c;-><init>(LR1/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LV/e;->p:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, LV/e;->q:I

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    const/4 v3, 0x1

    .line 31
    sget-object v4, LS1/a;->k:LS1/a;

    .line 32
    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    if-eq v1, v3, :cond_2

    .line 36
    .line 37
    if-ne v1, v2, :cond_1

    .line 38
    .line 39
    iget-object p0, v0, LV/e;->o:Ljava/util/Iterator;

    .line 40
    .line 41
    iget-object p1, v0, LV/e;->n:Ljava/io/Serializable;

    .line 42
    .line 43
    check-cast p1, La2/o;

    .line 44
    .line 45
    :try_start_0
    invoke-static {p2}, LH2/h;->E(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    .line 48
    goto :goto_2

    .line 49
    :catchall_0
    move-exception p2

    .line 50
    goto :goto_3

    .line 51
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p0

    .line 59
    :cond_2
    iget-object p0, v0, LV/e;->n:Ljava/io/Serializable;

    .line 60
    .line 61
    check-cast p0, Ljava/util/List;

    .line 62
    .line 63
    invoke-static {p2}, LH2/h;->E(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    invoke-static {p2}, LH2/h;->E(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    new-instance p2, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 73
    .line 74
    .line 75
    new-instance v1, LV/g;

    .line 76
    .line 77
    const/4 v5, 0x0

    .line 78
    invoke-direct {v1, p0, p2, v5}, LV/g;-><init>(Ljava/util/List;Ljava/util/ArrayList;LR1/c;)V

    .line 79
    .line 80
    .line 81
    iput-object p2, v0, LV/e;->n:Ljava/io/Serializable;

    .line 82
    .line 83
    iput v3, v0, LV/e;->q:I

    .line 84
    .line 85
    invoke-virtual {p1, v1, v0}, LV/k;->a(LV/g;LT1/c;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    if-ne p0, v4, :cond_4

    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_4
    move-object p0, p2

    .line 93
    :goto_1
    new-instance p1, La2/o;

    .line 94
    .line 95
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    :cond_5
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result p2

    .line 106
    if-eqz p2, :cond_7

    .line 107
    .line 108
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    check-cast p2, LZ1/l;

    .line 113
    .line 114
    :try_start_1
    iput-object p1, v0, LV/e;->n:Ljava/io/Serializable;

    .line 115
    .line 116
    iput-object p0, v0, LV/e;->o:Ljava/util/Iterator;

    .line 117
    .line 118
    iput v2, v0, LV/e;->q:I

    .line 119
    .line 120
    invoke-interface {p2, v0}, LZ1/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 124
    if-ne p2, v4, :cond_5

    .line 125
    .line 126
    goto :goto_4

    .line 127
    :goto_3
    iget-object v1, p1, La2/o;->k:Ljava/lang/Object;

    .line 128
    .line 129
    if-nez v1, :cond_6

    .line 130
    .line 131
    iput-object p2, p1, La2/o;->k:Ljava/lang/Object;

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_6
    check-cast v1, Ljava/lang/Throwable;

    .line 135
    .line 136
    invoke-static {v1, p2}, LE2/a;->b(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 137
    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_7
    iget-object p0, p1, La2/o;->k:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast p0, Ljava/lang/Throwable;

    .line 143
    .line 144
    if-nez p0, :cond_8

    .line 145
    .line 146
    sget-object v4, LO1/g;->a:LO1/g;

    .line 147
    .line 148
    :goto_4
    return-object v4

    .line 149
    :cond_8
    throw p0
.end method

.method public static e(III)V
    .locals 3

    .line 1
    const-string v0, "fromIndex: "

    .line 2
    .line 3
    if-ltz p0, :cond_1

    .line 4
    .line 5
    if-gt p1, p2, :cond_1

    .line 6
    .line 7
    if-gt p0, p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 11
    .line 12
    const-string v1, " > toIndex: "

    .line 13
    .line 14
    invoke-static {v0, p0, v1, p1}, LB1/e;->i(Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-direct {p2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p2

    .line 22
    :cond_1
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    .line 23
    .line 24
    new-instance v2, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string p0, ", toIndex: "

    .line 33
    .line 34
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string p0, ", size: "

    .line 41
    .line 42
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-direct {v1, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw v1
.end method

.method public static final f(LZ1/l;LJ1/d;)V
    .locals 1

    .line 1
    invoke-static {p1}, LH2/h;->i(Ljava/lang/Throwable;)LO1/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, LO1/d;

    .line 6
    .line 7
    invoke-direct {v0, p1}, LO1/d;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p0, v0}, LZ1/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static g(Ll0/B;Ld0/b;Landroid/view/View;Landroid/view/View;Ll0/t;Z)I
    .locals 0

    .line 1
    invoke-virtual {p4}, Ll0/t;->p()I

    .line 2
    .line 3
    .line 4
    move-result p4

    .line 5
    if-eqz p4, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, Ll0/B;->a()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_2

    .line 12
    .line 13
    if-eqz p2, :cond_2

    .line 14
    .line 15
    if-nez p3, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    if-eqz p5, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1, p3}, Ld0/b;->b(Landroid/view/View;)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    invoke-virtual {p1, p2}, Ld0/b;->c(Landroid/view/View;)I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    sub-int/2addr p0, p2

    .line 29
    invoke-virtual {p1}, Ld0/b;->f()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    invoke-static {p1, p0}, Ljava/lang/Math;->min(II)I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    return p0

    .line 38
    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    check-cast p0, Ll0/u;

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    throw p0

    .line 49
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 50
    return p0
.end method

.method public static h(Ll0/B;Ld0/b;Landroid/view/View;Landroid/view/View;Ll0/t;Z)I
    .locals 0

    .line 1
    invoke-virtual {p4}, Ll0/t;->p()I

    .line 2
    .line 3
    .line 4
    move-result p4

    .line 5
    if-eqz p4, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, Ll0/B;->a()I

    .line 8
    .line 9
    .line 10
    move-result p4

    .line 11
    if-eqz p4, :cond_2

    .line 12
    .line 13
    if-eqz p2, :cond_2

    .line 14
    .line 15
    if-nez p3, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    if-nez p5, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Ll0/B;->a()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0

    .line 25
    :cond_1
    invoke-virtual {p1, p3}, Ld0/b;->b(Landroid/view/View;)I

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, p2}, Ld0/b;->c(Landroid/view/View;)I

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, Ll0/u;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x0

    .line 41
    throw p0

    .line 42
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 43
    return p0
.end method

.method public static m(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 5

    .line 1
    instance-of v0, p0, [B

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    instance-of v0, p1, [B

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p0, [B

    .line 10
    .line 11
    check-cast p1, [B

    .line 12
    .line 13
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :cond_0
    instance-of v0, p0, [I

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    instance-of v0, p1, [I

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    check-cast p0, [I

    .line 27
    .line 28
    check-cast p1, [I

    .line 29
    .line 30
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([I[I)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0

    .line 35
    :cond_1
    instance-of v0, p0, [J

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    instance-of v0, p1, [J

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    check-cast p0, [J

    .line 44
    .line 45
    check-cast p1, [J

    .line 46
    .line 47
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([J[J)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    return p0

    .line 52
    :cond_2
    instance-of v0, p0, [D

    .line 53
    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    instance-of v0, p1, [D

    .line 57
    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    check-cast p0, [D

    .line 61
    .line 62
    check-cast p1, [D

    .line 63
    .line 64
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([D[D)Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    return p0

    .line 69
    :cond_3
    instance-of v0, p0, [Ljava/lang/Object;

    .line 70
    .line 71
    const/4 v1, 0x1

    .line 72
    const/4 v2, 0x0

    .line 73
    if-eqz v0, :cond_6

    .line 74
    .line 75
    instance-of v0, p1, [Ljava/lang/Object;

    .line 76
    .line 77
    if-eqz v0, :cond_6

    .line 78
    .line 79
    check-cast p0, [Ljava/lang/Object;

    .line 80
    .line 81
    array-length v0, p0

    .line 82
    check-cast p1, [Ljava/lang/Object;

    .line 83
    .line 84
    array-length v3, p1

    .line 85
    if-ne v0, v3, :cond_c

    .line 86
    .line 87
    new-instance v0, Le2/c;

    .line 88
    .line 89
    array-length v3, p0

    .line 90
    sub-int/2addr v3, v1

    .line 91
    invoke-direct {v0, v2, v3, v1}, Le2/a;-><init>(III)V

    .line 92
    .line 93
    .line 94
    instance-of v3, v0, Ljava/util/Collection;

    .line 95
    .line 96
    if-eqz v3, :cond_4

    .line 97
    .line 98
    move-object v3, v0

    .line 99
    check-cast v3, Ljava/util/Collection;

    .line 100
    .line 101
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    if-eqz v3, :cond_4

    .line 106
    .line 107
    goto/16 :goto_1

    .line 108
    .line 109
    :cond_4
    invoke-virtual {v0}, Le2/a;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    :cond_5
    move-object v3, v0

    .line 114
    check-cast v3, Le2/b;

    .line 115
    .line 116
    iget-boolean v3, v3, Le2/b;->m:Z

    .line 117
    .line 118
    if-eqz v3, :cond_b

    .line 119
    .line 120
    move-object v3, v0

    .line 121
    check-cast v3, Le2/b;

    .line 122
    .line 123
    invoke-virtual {v3}, Le2/b;->nextInt()I

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    aget-object v4, p0, v3

    .line 128
    .line 129
    aget-object v3, p1, v3

    .line 130
    .line 131
    invoke-static {v4, v3}, LS0/a;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    if-nez v3, :cond_5

    .line 136
    .line 137
    goto/16 :goto_2

    .line 138
    .line 139
    :cond_6
    instance-of v0, p0, Ljava/util/List;

    .line 140
    .line 141
    if-eqz v0, :cond_9

    .line 142
    .line 143
    instance-of v0, p1, Ljava/util/List;

    .line 144
    .line 145
    if-eqz v0, :cond_9

    .line 146
    .line 147
    move-object v0, p0

    .line 148
    check-cast v0, Ljava/util/List;

    .line 149
    .line 150
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    check-cast p1, Ljava/util/List;

    .line 155
    .line 156
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    if-ne v3, v4, :cond_c

    .line 161
    .line 162
    check-cast p0, Ljava/util/Collection;

    .line 163
    .line 164
    invoke-static {p0}, LP1/f;->c0(Ljava/util/Collection;)Le2/c;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    instance-of v3, p0, Ljava/util/Collection;

    .line 169
    .line 170
    if-eqz v3, :cond_7

    .line 171
    .line 172
    move-object v3, p0

    .line 173
    check-cast v3, Ljava/util/Collection;

    .line 174
    .line 175
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    if-eqz v3, :cond_7

    .line 180
    .line 181
    goto/16 :goto_1

    .line 182
    .line 183
    :cond_7
    invoke-virtual {p0}, Le2/a;->iterator()Ljava/util/Iterator;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    :cond_8
    move-object v3, p0

    .line 188
    check-cast v3, Le2/b;

    .line 189
    .line 190
    iget-boolean v3, v3, Le2/b;->m:Z

    .line 191
    .line 192
    if-eqz v3, :cond_b

    .line 193
    .line 194
    move-object v3, p0

    .line 195
    check-cast v3, Le2/b;

    .line 196
    .line 197
    invoke-virtual {v3}, Le2/b;->nextInt()I

    .line 198
    .line 199
    .line 200
    move-result v3

    .line 201
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    invoke-static {v4, v3}, LS0/a;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    if-nez v3, :cond_8

    .line 214
    .line 215
    goto :goto_2

    .line 216
    :cond_9
    instance-of v0, p0, Ljava/util/Map;

    .line 217
    .line 218
    if-eqz v0, :cond_d

    .line 219
    .line 220
    instance-of v0, p1, Ljava/util/Map;

    .line 221
    .line 222
    if-eqz v0, :cond_d

    .line 223
    .line 224
    check-cast p0, Ljava/util/Map;

    .line 225
    .line 226
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    check-cast p1, Ljava/util/Map;

    .line 231
    .line 232
    invoke-interface {p1}, Ljava/util/Map;->size()I

    .line 233
    .line 234
    .line 235
    move-result v3

    .line 236
    if-ne v0, v3, :cond_c

    .line 237
    .line 238
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 239
    .line 240
    .line 241
    move-result v0

    .line 242
    if-eqz v0, :cond_a

    .line 243
    .line 244
    goto :goto_1

    .line 245
    :cond_a
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 246
    .line 247
    .line 248
    move-result-object p0

    .line 249
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 250
    .line 251
    .line 252
    move-result-object p0

    .line 253
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    if-eqz v0, :cond_b

    .line 258
    .line 259
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    check-cast v0, Ljava/util/Map$Entry;

    .line 264
    .line 265
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    invoke-interface {p1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v3

    .line 273
    if-eqz v3, :cond_c

    .line 274
    .line 275
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v3

    .line 279
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    invoke-static {v3, v0}, LS0/a;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    if-eqz v0, :cond_c

    .line 292
    .line 293
    goto :goto_0

    .line 294
    :cond_b
    :goto_1
    return v1

    .line 295
    :cond_c
    :goto_2
    return v2

    .line 296
    :cond_d
    invoke-static {p0, p1}, La2/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-result p0

    .line 300
    return p0
.end method

.method public static n(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 7

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_4

    .line 4
    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    if-eqz p0, :cond_17

    .line 7
    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    goto/16 :goto_5

    .line 11
    .line 12
    :cond_1
    instance-of v1, p0, [B

    .line 13
    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    instance-of v1, p1, [B

    .line 17
    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    check-cast p0, [B

    .line 21
    .line 22
    check-cast p1, [B

    .line 23
    .line 24
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    return p0

    .line 29
    :cond_2
    instance-of v1, p0, [I

    .line 30
    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    instance-of v1, p1, [I

    .line 34
    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    check-cast p0, [I

    .line 38
    .line 39
    check-cast p1, [I

    .line 40
    .line 41
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([I[I)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    return p0

    .line 46
    :cond_3
    instance-of v1, p0, [J

    .line 47
    .line 48
    if-eqz v1, :cond_4

    .line 49
    .line 50
    instance-of v1, p1, [J

    .line 51
    .line 52
    if-eqz v1, :cond_4

    .line 53
    .line 54
    check-cast p0, [J

    .line 55
    .line 56
    check-cast p1, [J

    .line 57
    .line 58
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([J[J)Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    return p0

    .line 63
    :cond_4
    instance-of v1, p0, [D

    .line 64
    .line 65
    if-eqz v1, :cond_7

    .line 66
    .line 67
    instance-of v1, p1, [D

    .line 68
    .line 69
    if-eqz v1, :cond_7

    .line 70
    .line 71
    check-cast p0, [D

    .line 72
    .line 73
    array-length v1, p0

    .line 74
    check-cast p1, [D

    .line 75
    .line 76
    array-length v2, p1

    .line 77
    if-eq v1, v2, :cond_5

    .line 78
    .line 79
    goto/16 :goto_5

    .line 80
    .line 81
    :cond_5
    array-length v1, p0

    .line 82
    move v2, v0

    .line 83
    :goto_0
    if-ge v2, v1, :cond_13

    .line 84
    .line 85
    aget-wide v3, p0, v2

    .line 86
    .line 87
    aget-wide v5, p1, v2

    .line 88
    .line 89
    invoke-static {v3, v4, v5, v6}, LS0/a;->q(DD)Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-nez v3, :cond_6

    .line 94
    .line 95
    goto/16 :goto_5

    .line 96
    .line 97
    :cond_6
    add-int/lit8 v2, v2, 0x1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_7
    instance-of v1, p0, [F

    .line 101
    .line 102
    if-eqz v1, :cond_a

    .line 103
    .line 104
    instance-of v1, p1, [F

    .line 105
    .line 106
    if-eqz v1, :cond_a

    .line 107
    .line 108
    check-cast p0, [F

    .line 109
    .line 110
    array-length v1, p0

    .line 111
    check-cast p1, [F

    .line 112
    .line 113
    array-length v2, p1

    .line 114
    if-eq v1, v2, :cond_8

    .line 115
    .line 116
    goto/16 :goto_5

    .line 117
    .line 118
    :cond_8
    array-length v1, p0

    .line 119
    move v2, v0

    .line 120
    :goto_1
    if-ge v2, v1, :cond_13

    .line 121
    .line 122
    aget v3, p0, v2

    .line 123
    .line 124
    aget v4, p1, v2

    .line 125
    .line 126
    invoke-static {v3, v4}, LS0/a;->u(FF)Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    if-nez v3, :cond_9

    .line 131
    .line 132
    goto/16 :goto_5

    .line 133
    .line 134
    :cond_9
    add-int/lit8 v2, v2, 0x1

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_a
    instance-of v1, p0, [Ljava/lang/Object;

    .line 138
    .line 139
    if-eqz v1, :cond_d

    .line 140
    .line 141
    instance-of v1, p1, [Ljava/lang/Object;

    .line 142
    .line 143
    if-eqz v1, :cond_d

    .line 144
    .line 145
    check-cast p0, [Ljava/lang/Object;

    .line 146
    .line 147
    array-length v1, p0

    .line 148
    check-cast p1, [Ljava/lang/Object;

    .line 149
    .line 150
    array-length v2, p1

    .line 151
    if-eq v1, v2, :cond_b

    .line 152
    .line 153
    goto/16 :goto_5

    .line 154
    .line 155
    :cond_b
    array-length v1, p0

    .line 156
    move v2, v0

    .line 157
    :goto_2
    if-ge v2, v1, :cond_13

    .line 158
    .line 159
    aget-object v3, p0, v2

    .line 160
    .line 161
    aget-object v4, p1, v2

    .line 162
    .line 163
    invoke-static {v3, v4}, LS0/a;->n(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    if-nez v3, :cond_c

    .line 168
    .line 169
    goto/16 :goto_5

    .line 170
    .line 171
    :cond_c
    add-int/lit8 v2, v2, 0x1

    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_d
    instance-of v1, p0, Ljava/util/List;

    .line 175
    .line 176
    if-eqz v1, :cond_10

    .line 177
    .line 178
    instance-of v1, p1, Ljava/util/List;

    .line 179
    .line 180
    if-eqz v1, :cond_10

    .line 181
    .line 182
    check-cast p0, Ljava/util/List;

    .line 183
    .line 184
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    check-cast p1, Ljava/util/List;

    .line 189
    .line 190
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    if-eq v1, v2, :cond_e

    .line 195
    .line 196
    goto/16 :goto_5

    .line 197
    .line 198
    :cond_e
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    :cond_f
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    if-eqz v1, :cond_13

    .line 211
    .line 212
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    if-eqz v1, :cond_13

    .line 217
    .line 218
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    invoke-static {v1, v2}, LS0/a;->n(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    if-nez v1, :cond_f

    .line 231
    .line 232
    goto/16 :goto_5

    .line 233
    .line 234
    :cond_10
    instance-of v1, p0, Ljava/util/Map;

    .line 235
    .line 236
    if-eqz v1, :cond_14

    .line 237
    .line 238
    instance-of v1, p1, Ljava/util/Map;

    .line 239
    .line 240
    if-eqz v1, :cond_14

    .line 241
    .line 242
    check-cast p0, Ljava/util/Map;

    .line 243
    .line 244
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    check-cast p1, Ljava/util/Map;

    .line 249
    .line 250
    invoke-interface {p1}, Ljava/util/Map;->size()I

    .line 251
    .line 252
    .line 253
    move-result v2

    .line 254
    if-eq v1, v2, :cond_11

    .line 255
    .line 256
    goto/16 :goto_5

    .line 257
    .line 258
    :cond_11
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 263
    .line 264
    .line 265
    move-result-object p0

    .line 266
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 267
    .line 268
    .line 269
    move-result v1

    .line 270
    if-eqz v1, :cond_13

    .line 271
    .line 272
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    check-cast v1, Ljava/util/Map$Entry;

    .line 277
    .line 278
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 287
    .line 288
    .line 289
    move-result-object v3

    .line 290
    :cond_12
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 291
    .line 292
    .line 293
    move-result v4

    .line 294
    if-eqz v4, :cond_17

    .line 295
    .line 296
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v4

    .line 300
    check-cast v4, Ljava/util/Map$Entry;

    .line 301
    .line 302
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v5

    .line 306
    invoke-static {v2, v5}, LS0/a;->n(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-result v5

    .line 310
    if-eqz v5, :cond_12

    .line 311
    .line 312
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v2

    .line 320
    invoke-static {v1, v2}, LS0/a;->n(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    if-eqz v1, :cond_17

    .line 325
    .line 326
    goto :goto_3

    .line 327
    :cond_13
    :goto_4
    const/4 p0, 0x1

    .line 328
    return p0

    .line 329
    :cond_14
    instance-of v0, p0, Ljava/lang/Double;

    .line 330
    .line 331
    if-eqz v0, :cond_15

    .line 332
    .line 333
    instance-of v0, p1, Ljava/lang/Double;

    .line 334
    .line 335
    if-eqz v0, :cond_15

    .line 336
    .line 337
    check-cast p0, Ljava/lang/Number;

    .line 338
    .line 339
    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    .line 340
    .line 341
    .line 342
    move-result-wide v0

    .line 343
    check-cast p1, Ljava/lang/Number;

    .line 344
    .line 345
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 346
    .line 347
    .line 348
    move-result-wide p0

    .line 349
    invoke-static {v0, v1, p0, p1}, LS0/a;->q(DD)Z

    .line 350
    .line 351
    .line 352
    move-result p0

    .line 353
    return p0

    .line 354
    :cond_15
    instance-of v0, p0, Ljava/lang/Float;

    .line 355
    .line 356
    if-eqz v0, :cond_16

    .line 357
    .line 358
    instance-of v0, p1, Ljava/lang/Float;

    .line 359
    .line 360
    if-eqz v0, :cond_16

    .line 361
    .line 362
    check-cast p0, Ljava/lang/Number;

    .line 363
    .line 364
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 365
    .line 366
    .line 367
    move-result p0

    .line 368
    check-cast p1, Ljava/lang/Number;

    .line 369
    .line 370
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 371
    .line 372
    .line 373
    move-result p1

    .line 374
    invoke-static {p0, p1}, LS0/a;->u(FF)Z

    .line 375
    .line 376
    .line 377
    move-result p0

    .line 378
    return p0

    .line 379
    :cond_16
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    move-result p0

    .line 383
    return p0

    .line 384
    :cond_17
    :goto_5
    return v0
.end method

.method public static o(Ljava/lang/Object;)I
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p0, [B

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast p0, [B

    .line 10
    .line 11
    invoke-static {p0}, Ljava/util/Arrays;->hashCode([B)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_1
    instance-of v1, p0, [I

    .line 17
    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    check-cast p0, [I

    .line 21
    .line 22
    invoke-static {p0}, Ljava/util/Arrays;->hashCode([I)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :cond_2
    instance-of v1, p0, [J

    .line 28
    .line 29
    if-eqz v1, :cond_3

    .line 30
    .line 31
    check-cast p0, [J

    .line 32
    .line 33
    invoke-static {p0}, Ljava/util/Arrays;->hashCode([J)I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    return p0

    .line 38
    :cond_3
    instance-of v1, p0, [D

    .line 39
    .line 40
    const/16 v2, 0x20

    .line 41
    .line 42
    const-wide/16 v3, 0x0

    .line 43
    .line 44
    const/4 v5, 0x1

    .line 45
    if-eqz v1, :cond_6

    .line 46
    .line 47
    check-cast p0, [D

    .line 48
    .line 49
    array-length v1, p0

    .line 50
    :goto_0
    if-ge v0, v1, :cond_5

    .line 51
    .line 52
    aget-wide v6, p0, v0

    .line 53
    .line 54
    mul-int/lit8 v5, v5, 0x1f

    .line 55
    .line 56
    cmpg-double v8, v6, v3

    .line 57
    .line 58
    if-nez v8, :cond_4

    .line 59
    .line 60
    move-wide v6, v3

    .line 61
    :cond_4
    invoke-static {v6, v7}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 62
    .line 63
    .line 64
    move-result-wide v6

    .line 65
    ushr-long v8, v6, v2

    .line 66
    .line 67
    xor-long/2addr v6, v8

    .line 68
    long-to-int v6, v6

    .line 69
    add-int/2addr v5, v6

    .line 70
    add-int/lit8 v0, v0, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_5
    return v5

    .line 74
    :cond_6
    instance-of v1, p0, [F

    .line 75
    .line 76
    const/4 v6, 0x0

    .line 77
    if-eqz v1, :cond_9

    .line 78
    .line 79
    check-cast p0, [F

    .line 80
    .line 81
    array-length v1, p0

    .line 82
    :goto_1
    if-ge v0, v1, :cond_8

    .line 83
    .line 84
    aget v2, p0, v0

    .line 85
    .line 86
    mul-int/lit8 v5, v5, 0x1f

    .line 87
    .line 88
    cmpg-float v3, v2, v6

    .line 89
    .line 90
    if-nez v3, :cond_7

    .line 91
    .line 92
    move v2, v6

    .line 93
    :cond_7
    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    add-int/2addr v5, v2

    .line 98
    add-int/lit8 v0, v0, 0x1

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_8
    return v5

    .line 102
    :cond_9
    instance-of v1, p0, [Ljava/lang/Object;

    .line 103
    .line 104
    if-eqz v1, :cond_b

    .line 105
    .line 106
    check-cast p0, [Ljava/lang/Object;

    .line 107
    .line 108
    array-length v1, p0

    .line 109
    :goto_2
    if-ge v0, v1, :cond_a

    .line 110
    .line 111
    aget-object v2, p0, v0

    .line 112
    .line 113
    mul-int/lit8 v5, v5, 0x1f

    .line 114
    .line 115
    invoke-static {v2}, LS0/a;->o(Ljava/lang/Object;)I

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    add-int/2addr v5, v2

    .line 120
    add-int/lit8 v0, v0, 0x1

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_a
    return v5

    .line 124
    :cond_b
    instance-of v1, p0, Ljava/util/List;

    .line 125
    .line 126
    if-eqz v1, :cond_d

    .line 127
    .line 128
    check-cast p0, Ljava/util/List;

    .line 129
    .line 130
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-eqz v0, :cond_c

    .line 139
    .line 140
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    mul-int/lit8 v5, v5, 0x1f

    .line 145
    .line 146
    invoke-static {v0}, LS0/a;->o(Ljava/lang/Object;)I

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    add-int/2addr v5, v0

    .line 151
    goto :goto_3

    .line 152
    :cond_c
    return v5

    .line 153
    :cond_d
    instance-of v1, p0, Ljava/util/Map;

    .line 154
    .line 155
    if-eqz v1, :cond_f

    .line 156
    .line 157
    check-cast p0, Ljava/util/Map;

    .line 158
    .line 159
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    if-eqz v1, :cond_e

    .line 172
    .line 173
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    check-cast v1, Ljava/util/Map$Entry;

    .line 178
    .line 179
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    invoke-static {v2}, LS0/a;->o(Ljava/lang/Object;)I

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    mul-int/lit8 v2, v2, 0x1f

    .line 188
    .line 189
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    invoke-static {v1}, LS0/a;->o(Ljava/lang/Object;)I

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    xor-int/2addr v1, v2

    .line 198
    add-int/2addr v0, v1

    .line 199
    goto :goto_4

    .line 200
    :cond_e
    return v0

    .line 201
    :cond_f
    instance-of v0, p0, Ljava/lang/Double;

    .line 202
    .line 203
    if-eqz v0, :cond_11

    .line 204
    .line 205
    check-cast p0, Ljava/lang/Number;

    .line 206
    .line 207
    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    .line 208
    .line 209
    .line 210
    move-result-wide v0

    .line 211
    cmpg-double p0, v0, v3

    .line 212
    .line 213
    if-nez p0, :cond_10

    .line 214
    .line 215
    goto :goto_5

    .line 216
    :cond_10
    move-wide v3, v0

    .line 217
    :goto_5
    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 218
    .line 219
    .line 220
    move-result-wide v0

    .line 221
    ushr-long v2, v0, v2

    .line 222
    .line 223
    xor-long/2addr v0, v2

    .line 224
    long-to-int p0, v0

    .line 225
    return p0

    .line 226
    :cond_11
    instance-of v0, p0, Ljava/lang/Float;

    .line 227
    .line 228
    if-eqz v0, :cond_13

    .line 229
    .line 230
    check-cast p0, Ljava/lang/Number;

    .line 231
    .line 232
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 233
    .line 234
    .line 235
    move-result p0

    .line 236
    cmpg-float v0, p0, v6

    .line 237
    .line 238
    if-nez v0, :cond_12

    .line 239
    .line 240
    goto :goto_6

    .line 241
    :cond_12
    move v6, p0

    .line 242
    :goto_6
    invoke-static {v6}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 243
    .line 244
    .line 245
    move-result p0

    .line 246
    return p0

    .line 247
    :cond_13
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 248
    .line 249
    .line 250
    move-result p0

    .line 251
    return p0
.end method

.method public static p([BLandroid/os/Parcelable$Creator;)LN0/b;
    .locals 3

    .line 1
    invoke-static {p1}, LM0/r;->f(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    array-length v1, p0

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v0, p0, v2, v1}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, LN0/b;

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 23
    .line 24
    .line 25
    return-object p0
.end method

.method public static q(DD)Z
    .locals 5

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmpg-double v2, p0, v0

    .line 4
    .line 5
    if-nez v2, :cond_0

    .line 6
    .line 7
    move-wide v2, v0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-wide v2, p0

    .line 10
    :goto_0
    cmpg-double v4, p2, v0

    .line 11
    .line 12
    if-nez v4, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    move-wide v0, p2

    .line 16
    :goto_1
    cmpg-double v0, v2, v0

    .line 17
    .line 18
    if-nez v0, :cond_2

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_2
    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eqz p0, :cond_3

    .line 26
    .line 27
    invoke-static {p2, p3}, Ljava/lang/Double;->isNaN(D)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_3

    .line 32
    .line 33
    :goto_2
    const/4 p0, 0x1

    .line 34
    return p0

    .line 35
    :cond_3
    const/4 p0, 0x0

    .line 36
    return p0
.end method

.method public static r(Landroidx/datastore/preferences/protobuf/g;)Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/g;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/g;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-ge v1, v2, :cond_4

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Landroidx/datastore/preferences/protobuf/g;->a(I)B

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/16 v3, 0x22

    .line 22
    .line 23
    if-eq v2, v3, :cond_3

    .line 24
    .line 25
    const/16 v3, 0x27

    .line 26
    .line 27
    if-eq v2, v3, :cond_2

    .line 28
    .line 29
    const/16 v3, 0x5c

    .line 30
    .line 31
    if-eq v2, v3, :cond_1

    .line 32
    .line 33
    packed-switch v2, :pswitch_data_0

    .line 34
    .line 35
    .line 36
    const/16 v4, 0x20

    .line 37
    .line 38
    if-lt v2, v4, :cond_0

    .line 39
    .line 40
    const/16 v4, 0x7e

    .line 41
    .line 42
    if-gt v2, v4, :cond_0

    .line 43
    .line 44
    int-to-char v2, v2

    .line 45
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    ushr-int/lit8 v3, v2, 0x6

    .line 53
    .line 54
    and-int/lit8 v3, v3, 0x3

    .line 55
    .line 56
    add-int/lit8 v3, v3, 0x30

    .line 57
    .line 58
    int-to-char v3, v3

    .line 59
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    ushr-int/lit8 v3, v2, 0x3

    .line 63
    .line 64
    and-int/lit8 v3, v3, 0x7

    .line 65
    .line 66
    add-int/lit8 v3, v3, 0x30

    .line 67
    .line 68
    int-to-char v3, v3

    .line 69
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    and-int/lit8 v2, v2, 0x7

    .line 73
    .line 74
    add-int/lit8 v2, v2, 0x30

    .line 75
    .line 76
    int-to-char v2, v2

    .line 77
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :pswitch_0
    const-string v2, "\\r"

    .line 82
    .line 83
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :pswitch_1
    const-string v2, "\\f"

    .line 88
    .line 89
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :pswitch_2
    const-string v2, "\\v"

    .line 94
    .line 95
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :pswitch_3
    const-string v2, "\\n"

    .line 100
    .line 101
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :pswitch_4
    const-string v2, "\\t"

    .line 106
    .line 107
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :pswitch_5
    const-string v2, "\\b"

    .line 112
    .line 113
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :pswitch_6
    const-string v2, "\\a"

    .line 118
    .line 119
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_1
    const-string v2, "\\\\"

    .line 124
    .line 125
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_2
    const-string v2, "\\\'"

    .line 130
    .line 131
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_3
    const-string v2, "\\\""

    .line 136
    .line 137
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 141
    .line 142
    goto/16 :goto_0

    .line 143
    .line 144
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    return-object p0

    .line 149
    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static s()Ljava/lang/reflect/InvocationHandler;
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-lt v0, v1, :cond_0

    .line 7
    .line 8
    invoke-static {}, Lj0/h;->i()Ljava/lang/ClassLoader;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    :try_start_0
    const-class v0, Landroid/webkit/WebView;

    .line 14
    .line 15
    const-string v1, "getFactory"

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :goto_0
    const-string v1, "org.chromium.support_lib_glue.SupportLibReflectionUtil"

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    invoke-static {v1, v3, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v1, "createWebViewProviderFactory"

    .line 45
    .line 46
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0, v2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Ljava/lang/reflect/InvocationHandler;

    .line 55
    .line 56
    return-object v0

    .line 57
    :catch_0
    move-exception v0

    .line 58
    new-instance v1, Ljava/lang/RuntimeException;

    .line 59
    .line 60
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    throw v1
.end method

.method public static t([LA/m;I)LA/m;
    .locals 10

    .line 1
    and-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x190

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/16 v0, 0x2bc

    .line 9
    .line 10
    :goto_0
    and-int/lit8 p1, p1, 0x2

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x1

    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    move p1, v2

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    move p1, v1

    .line 19
    :goto_1
    array-length v3, p0

    .line 20
    const/4 v4, 0x0

    .line 21
    const v5, 0x7fffffff

    .line 22
    .line 23
    .line 24
    move v6, v1

    .line 25
    :goto_2
    if-ge v6, v3, :cond_5

    .line 26
    .line 27
    aget-object v7, p0, v6

    .line 28
    .line 29
    iget v8, v7, LA/m;->c:I

    .line 30
    .line 31
    sub-int/2addr v8, v0

    .line 32
    invoke-static {v8}, Ljava/lang/Math;->abs(I)I

    .line 33
    .line 34
    .line 35
    move-result v8

    .line 36
    mul-int/lit8 v8, v8, 0x2

    .line 37
    .line 38
    iget-boolean v9, v7, LA/m;->d:Z

    .line 39
    .line 40
    if-ne v9, p1, :cond_2

    .line 41
    .line 42
    move v9, v1

    .line 43
    goto :goto_3

    .line 44
    :cond_2
    move v9, v2

    .line 45
    :goto_3
    add-int/2addr v8, v9

    .line 46
    if-eqz v4, :cond_3

    .line 47
    .line 48
    if-le v5, v8, :cond_4

    .line 49
    .line 50
    :cond_3
    move-object v4, v7

    .line 51
    move v5, v8

    .line 52
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_5
    return-object v4
.end method

.method public static u(FF)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v1, p0, v0

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    move v1, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move v1, p0

    .line 9
    :goto_0
    cmpg-float v2, p1, v0

    .line 10
    .line 11
    if-nez v2, :cond_1

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_1
    move v0, p1

    .line 15
    :goto_1
    cmpg-float v0, v1, v0

    .line 16
    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_2
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_3

    .line 25
    .line 26
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-eqz p0, :cond_3

    .line 31
    .line 32
    :goto_2
    const/4 p0, 0x1

    .line 33
    return p0

    .line 34
    :cond_3
    const/4 p0, 0x0

    .line 35
    return p0
.end method

.method public static v(Landroid/content/Context;)LY0/b;
    .locals 2

    .line 1
    new-instance v0, LY0/b;

    .line 2
    .line 3
    invoke-static {p0}, LM0/r;->f(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, LF0/n;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, p0, v1}, LY0/b;-><init>(Landroid/content/Context;LF0/n;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public static w()Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public static x(Landroid/content/res/XmlResourceParser;Landroid/content/res/Resources;)Lv/a;
    .locals 25

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    :goto_0
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x2

    .line 9
    if-eq v1, v3, :cond_0

    .line 10
    .line 11
    if-eq v1, v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    if-ne v1, v3, :cond_21

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const-string v4, "font-family"

    .line 18
    .line 19
    move-object/from16 v5, p0

    .line 20
    .line 21
    invoke-interface {v5, v3, v1, v4}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_20

    .line 33
    .line 34
    invoke-static {v5}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    sget-object v6, Lr/a;->a:[I

    .line 39
    .line 40
    invoke-virtual {v0, v4, v6}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    const/4 v6, 0x0

    .line 45
    invoke-virtual {v4, v6}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    const/4 v7, 0x5

    .line 50
    invoke-virtual {v4, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v9

    .line 54
    const/4 v10, 0x6

    .line 55
    invoke-virtual {v4, v10}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v14

    .line 59
    invoke-virtual {v4, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v15

    .line 63
    invoke-virtual {v4, v2, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 64
    .line 65
    .line 66
    move-result v11

    .line 67
    const/4 v12, 0x3

    .line 68
    invoke-virtual {v4, v12, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 69
    .line 70
    .line 71
    move-result v13

    .line 72
    move-object/from16 v16, v1

    .line 73
    .line 74
    const/16 v1, 0x1f4

    .line 75
    .line 76
    const/4 v7, 0x4

    .line 77
    invoke-virtual {v4, v7, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    const/4 v7, 0x7

    .line 82
    invoke-virtual {v4, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    .line 87
    .line 88
    .line 89
    if-eqz v8, :cond_14

    .line 90
    .line 91
    if-eqz v9, :cond_14

    .line 92
    .line 93
    invoke-static {v0, v11}, LS0/a;->A(Landroid/content/res/Resources;I)Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object v11

    .line 97
    new-instance v4, Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 100
    .line 101
    .line 102
    :goto_1
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    if-eq v7, v12, :cond_10

    .line 107
    .line 108
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    if-eq v7, v3, :cond_1

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_1
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    const-string v10, "fallback"

    .line 120
    .line 121
    invoke-virtual {v7, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v7

    .line 125
    if-eqz v7, :cond_f

    .line 126
    .line 127
    invoke-static {v5}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    sget-object v10, Lr/a;->c:[I

    .line 132
    .line 133
    invoke-virtual {v0, v7, v10}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    move/from16 v17, v13

    .line 138
    .line 139
    :try_start_0
    invoke-virtual {v7, v6}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v10

    .line 143
    const/4 v12, 0x1

    .line 144
    invoke-virtual {v7, v12}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v13

    .line 148
    move-object v12, v13

    .line 149
    invoke-virtual {v7, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v13

    .line 153
    if-eqz v10, :cond_9

    .line 154
    .line 155
    :goto_2
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 156
    .line 157
    .line 158
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 159
    const/4 v3, 0x3

    .line 160
    if-eq v6, v3, :cond_2

    .line 161
    .line 162
    :try_start_1
    invoke-static {v5}, LS0/a;->G(Lorg/xmlpull/v1/XmlPullParser;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 163
    .line 164
    .line 165
    const/4 v3, 0x2

    .line 166
    goto :goto_2

    .line 167
    :catchall_0
    move-exception v0

    .line 168
    move-object v1, v0

    .line 169
    move-object v3, v7

    .line 170
    const-wide/16 v14, 0x1

    .line 171
    .line 172
    goto/16 :goto_7

    .line 173
    .line 174
    :cond_2
    move-object v6, v7

    .line 175
    :try_start_2
    new-instance v7, LA/g;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 176
    .line 177
    move-object v3, v6

    .line 178
    move-object/from16 v19, v15

    .line 179
    .line 180
    move/from16 v6, v17

    .line 181
    .line 182
    move-object/from16 v17, v14

    .line 183
    .line 184
    const-wide/16 v14, 0x1

    .line 185
    .line 186
    :try_start_3
    invoke-direct/range {v7 .. v13}, LA/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 187
    .line 188
    .line 189
    instance-of v10, v3, Ljava/lang/AutoCloseable;

    .line 190
    .line 191
    if-eqz v10, :cond_3

    .line 192
    .line 193
    check-cast v3, Ljava/lang/AutoCloseable;

    .line 194
    .line 195
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    .line 196
    .line 197
    .line 198
    goto :goto_4

    .line 199
    :cond_3
    instance-of v10, v3, Ljava/util/concurrent/ExecutorService;

    .line 200
    .line 201
    if-eqz v10, :cond_7

    .line 202
    .line 203
    check-cast v3, Ljava/util/concurrent/ExecutorService;

    .line 204
    .line 205
    invoke-static {}, Ljava/util/concurrent/ForkJoinPool;->commonPool()Ljava/util/concurrent/ForkJoinPool;

    .line 206
    .line 207
    .line 208
    move-result-object v10

    .line 209
    if-ne v3, v10, :cond_4

    .line 210
    .line 211
    goto :goto_4

    .line 212
    :cond_4
    invoke-interface {v3}, Ljava/util/concurrent/ExecutorService;->isTerminated()Z

    .line 213
    .line 214
    .line 215
    move-result v10

    .line 216
    if-nez v10, :cond_8

    .line 217
    .line 218
    invoke-interface {v3}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 219
    .line 220
    .line 221
    const/4 v12, 0x0

    .line 222
    :cond_5
    :goto_3
    if-nez v10, :cond_6

    .line 223
    .line 224
    :try_start_4
    sget-object v13, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 225
    .line 226
    invoke-interface {v3, v14, v15, v13}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 227
    .line 228
    .line 229
    move-result v10
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_0

    .line 230
    goto :goto_3

    .line 231
    :catch_0
    if-nez v12, :cond_5

    .line 232
    .line 233
    invoke-interface {v3}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 234
    .line 235
    .line 236
    const/4 v12, 0x1

    .line 237
    goto :goto_3

    .line 238
    :cond_6
    if-eqz v12, :cond_8

    .line 239
    .line 240
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    invoke-virtual {v3}, Ljava/lang/Thread;->interrupt()V

    .line 245
    .line 246
    .line 247
    goto :goto_4

    .line 248
    :cond_7
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 249
    .line 250
    .line 251
    :cond_8
    :goto_4
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    goto/16 :goto_a

    .line 255
    .line 256
    :catchall_1
    move-exception v0

    .line 257
    :goto_5
    move-object v1, v0

    .line 258
    goto :goto_7

    .line 259
    :catchall_2
    move-exception v0

    .line 260
    move-object v3, v6

    .line 261
    :goto_6
    const-wide/16 v14, 0x1

    .line 262
    .line 263
    goto :goto_5

    .line 264
    :catchall_3
    move-exception v0

    .line 265
    move-object v3, v7

    .line 266
    goto :goto_6

    .line 267
    :cond_9
    move-object v3, v7

    .line 268
    const-wide/16 v14, 0x1

    .line 269
    .line 270
    :try_start_5
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 271
    .line 272
    const-string v1, "query attribute must be set in fallback element"

    .line 273
    .line 274
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 278
    :goto_7
    if-eqz v3, :cond_e

    .line 279
    .line 280
    :try_start_6
    instance-of v0, v3, Ljava/lang/AutoCloseable;

    .line 281
    .line 282
    if-nez v0, :cond_d

    .line 283
    .line 284
    instance-of v0, v3, Ljava/util/concurrent/ExecutorService;

    .line 285
    .line 286
    if-eqz v0, :cond_c

    .line 287
    .line 288
    move-object v7, v3

    .line 289
    check-cast v7, Ljava/util/concurrent/ExecutorService;

    .line 290
    .line 291
    invoke-static {}, Ljava/util/concurrent/ForkJoinPool;->commonPool()Ljava/util/concurrent/ForkJoinPool;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    if-eq v7, v0, :cond_e

    .line 296
    .line 297
    invoke-interface {v7}, Ljava/util/concurrent/ExecutorService;->isTerminated()Z

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    if-nez v0, :cond_e

    .line 302
    .line 303
    invoke-interface {v7}, Ljava/util/concurrent/ExecutorService;->shutdown()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 304
    .line 305
    .line 306
    const/4 v6, 0x0

    .line 307
    :cond_a
    :goto_8
    if-nez v0, :cond_b

    .line 308
    .line 309
    :try_start_7
    sget-object v2, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 310
    .line 311
    invoke-interface {v7, v14, v15, v2}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 312
    .line 313
    .line 314
    move-result v0
    :try_end_7
    .catch Ljava/lang/InterruptedException; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 315
    goto :goto_8

    .line 316
    :catch_1
    if-nez v6, :cond_a

    .line 317
    .line 318
    :try_start_8
    invoke-interface {v7}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 319
    .line 320
    .line 321
    const/4 v6, 0x1

    .line 322
    goto :goto_8

    .line 323
    :cond_b
    if-eqz v6, :cond_e

    .line 324
    .line 325
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 330
    .line 331
    .line 332
    goto :goto_9

    .line 333
    :cond_c
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 334
    .line 335
    .line 336
    goto :goto_9

    .line 337
    :cond_d
    move-object v7, v3

    .line 338
    check-cast v7, Ljava/lang/AutoCloseable;

    .line 339
    .line 340
    invoke-interface {v7}, Ljava/lang/AutoCloseable;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 341
    .line 342
    .line 343
    goto :goto_9

    .line 344
    :catchall_4
    move-exception v0

    .line 345
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 346
    .line 347
    .line 348
    :cond_e
    :goto_9
    throw v1

    .line 349
    :cond_f
    move v6, v13

    .line 350
    move-object/from16 v17, v14

    .line 351
    .line 352
    move-object/from16 v19, v15

    .line 353
    .line 354
    invoke-static {v5}, LS0/a;->G(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 355
    .line 356
    .line 357
    :goto_a
    move v13, v6

    .line 358
    move-object/from16 v14, v17

    .line 359
    .line 360
    move-object/from16 v15, v19

    .line 361
    .line 362
    const/4 v3, 0x2

    .line 363
    const/4 v6, 0x0

    .line 364
    const/4 v12, 0x3

    .line 365
    goto/16 :goto_1

    .line 366
    .line 367
    :cond_10
    move v6, v13

    .line 368
    move-object/from16 v17, v14

    .line 369
    .line 370
    move-object/from16 v19, v15

    .line 371
    .line 372
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 373
    .line 374
    .line 375
    move-result v0

    .line 376
    if-nez v0, :cond_11

    .line 377
    .line 378
    new-instance v0, Lv/d;

    .line 379
    .line 380
    invoke-direct {v0, v4, v6, v1, v2}, Lv/d;-><init>(Ljava/util/ArrayList;IILjava/lang/String;)V

    .line 381
    .line 382
    .line 383
    goto :goto_b

    .line 384
    :cond_11
    if-eqz v17, :cond_13

    .line 385
    .line 386
    new-instance v7, LA/g;

    .line 387
    .line 388
    const/4 v12, 0x0

    .line 389
    const/4 v13, 0x0

    .line 390
    move-object/from16 v10, v17

    .line 391
    .line 392
    invoke-direct/range {v7 .. v13}, LA/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    if-eqz v19, :cond_12

    .line 399
    .line 400
    new-instance v7, LA/g;

    .line 401
    .line 402
    const/4 v12, 0x0

    .line 403
    const/4 v13, 0x0

    .line 404
    move-object/from16 v10, v19

    .line 405
    .line 406
    invoke-direct/range {v7 .. v13}, LA/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    :cond_12
    new-instance v0, Lv/d;

    .line 413
    .line 414
    invoke-direct {v0, v4, v6, v1, v2}, Lv/d;-><init>(Ljava/util/ArrayList;IILjava/lang/String;)V

    .line 415
    .line 416
    .line 417
    :goto_b
    return-object v0

    .line 418
    :cond_13
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 419
    .line 420
    const-string v1, "The provider font XML requires query attribute or fallback children."

    .line 421
    .line 422
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    throw v0

    .line 426
    :cond_14
    new-instance v1, Ljava/util/ArrayList;

    .line 427
    .line 428
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 429
    .line 430
    .line 431
    :goto_c
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 432
    .line 433
    .line 434
    move-result v2

    .line 435
    const/4 v3, 0x3

    .line 436
    if-eq v2, v3, :cond_1e

    .line 437
    .line 438
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 439
    .line 440
    .line 441
    move-result v2

    .line 442
    const/4 v3, 0x2

    .line 443
    if-eq v2, v3, :cond_15

    .line 444
    .line 445
    goto :goto_c

    .line 446
    :cond_15
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v2

    .line 450
    const-string v4, "font"

    .line 451
    .line 452
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    move-result v2

    .line 456
    if-eqz v2, :cond_1d

    .line 457
    .line 458
    invoke-static {v5}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 459
    .line 460
    .line 461
    move-result-object v2

    .line 462
    sget-object v4, Lr/a;->b:[I

    .line 463
    .line 464
    invoke-virtual {v0, v2, v4}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 465
    .line 466
    .line 467
    move-result-object v2

    .line 468
    const/16 v12, 0x8

    .line 469
    .line 470
    invoke-virtual {v2, v12}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 471
    .line 472
    .line 473
    move-result v4

    .line 474
    if-eqz v4, :cond_16

    .line 475
    .line 476
    goto :goto_d

    .line 477
    :cond_16
    const/4 v12, 0x1

    .line 478
    :goto_d
    const/16 v4, 0x190

    .line 479
    .line 480
    invoke-virtual {v2, v12, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 481
    .line 482
    .line 483
    move-result v19

    .line 484
    invoke-virtual {v2, v10}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 485
    .line 486
    .line 487
    move-result v4

    .line 488
    if-eqz v4, :cond_17

    .line 489
    .line 490
    move v4, v10

    .line 491
    :goto_e
    const/4 v6, 0x0

    .line 492
    goto :goto_f

    .line 493
    :cond_17
    move v4, v3

    .line 494
    goto :goto_e

    .line 495
    :goto_f
    invoke-virtual {v2, v4, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 496
    .line 497
    .line 498
    move-result v4

    .line 499
    const/4 v12, 0x1

    .line 500
    if-ne v12, v4, :cond_18

    .line 501
    .line 502
    move/from16 v24, v12

    .line 503
    .line 504
    goto :goto_10

    .line 505
    :cond_18
    const/16 v24, 0x0

    .line 506
    .line 507
    :goto_10
    const/16 v4, 0x9

    .line 508
    .line 509
    invoke-virtual {v2, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 510
    .line 511
    .line 512
    move-result v6

    .line 513
    if-eqz v6, :cond_19

    .line 514
    .line 515
    goto :goto_11

    .line 516
    :cond_19
    const/4 v4, 0x3

    .line 517
    :goto_11
    invoke-virtual {v2, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 518
    .line 519
    .line 520
    move-result v6

    .line 521
    if-eqz v6, :cond_1a

    .line 522
    .line 523
    move v6, v7

    .line 524
    goto :goto_12

    .line 525
    :cond_1a
    const/4 v6, 0x4

    .line 526
    :goto_12
    invoke-virtual {v2, v6}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    move-result-object v23

    .line 530
    const/4 v6, 0x0

    .line 531
    invoke-virtual {v2, v4, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 532
    .line 533
    .line 534
    move-result v20

    .line 535
    const/4 v4, 0x5

    .line 536
    invoke-virtual {v2, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 537
    .line 538
    .line 539
    move-result v8

    .line 540
    if-eqz v8, :cond_1b

    .line 541
    .line 542
    move v8, v4

    .line 543
    goto :goto_13

    .line 544
    :cond_1b
    move v8, v6

    .line 545
    :goto_13
    invoke-virtual {v2, v8, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 546
    .line 547
    .line 548
    move-result v21

    .line 549
    invoke-virtual {v2, v8}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object v22

    .line 553
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 554
    .line 555
    .line 556
    :goto_14
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 557
    .line 558
    .line 559
    move-result v2

    .line 560
    const/4 v6, 0x3

    .line 561
    if-eq v2, v6, :cond_1c

    .line 562
    .line 563
    invoke-static {v5}, LS0/a;->G(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 564
    .line 565
    .line 566
    goto :goto_14

    .line 567
    :cond_1c
    new-instance v18, Lv/c;

    .line 568
    .line 569
    invoke-direct/range {v18 .. v24}, Lv/c;-><init>(IIILjava/lang/String;Ljava/lang/String;Z)V

    .line 570
    .line 571
    .line 572
    move-object/from16 v2, v18

    .line 573
    .line 574
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 575
    .line 576
    .line 577
    goto/16 :goto_c

    .line 578
    .line 579
    :cond_1d
    const/4 v4, 0x5

    .line 580
    const/4 v6, 0x3

    .line 581
    const/4 v12, 0x1

    .line 582
    invoke-static {v5}, LS0/a;->G(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 583
    .line 584
    .line 585
    goto/16 :goto_c

    .line 586
    .line 587
    :cond_1e
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 588
    .line 589
    .line 590
    move-result v0

    .line 591
    if-eqz v0, :cond_1f

    .line 592
    .line 593
    return-object v16

    .line 594
    :cond_1f
    new-instance v0, Lv/b;

    .line 595
    .line 596
    const/4 v6, 0x0

    .line 597
    new-array v2, v6, [Lv/c;

    .line 598
    .line 599
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v1

    .line 603
    check-cast v1, [Lv/c;

    .line 604
    .line 605
    invoke-direct {v0, v1}, Lv/b;-><init>([Lv/c;)V

    .line 606
    .line 607
    .line 608
    return-object v0

    .line 609
    :cond_20
    move-object/from16 v16, v1

    .line 610
    .line 611
    invoke-static {v5}, LS0/a;->G(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 612
    .line 613
    .line 614
    return-object v16

    .line 615
    :cond_21
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 616
    .line 617
    const-string v1, "No start tag found"

    .line 618
    .line 619
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 620
    .line 621
    .line 622
    throw v0
.end method


# virtual methods
.method public abstract b(Lq/g;Lq/c;)Z
.end method

.method public abstract c(Lq/g;Ljava/lang/Object;Ljava/lang/Object;)Z
.end method

.method public abstract d(Lq/g;Lq/f;Lq/f;)Z
.end method

.method public abstract i(Landroid/content/Context;Lv/b;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;
.end method

.method public abstract j(Landroid/content/Context;[LA/m;I)Landroid/graphics/Typeface;
.end method

.method public k(Landroid/content/Context;Ljava/util/List;I)Landroid/graphics/Typeface;
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string p2, "createFromFontInfoWithFallback must only be called on API 29+"

    .line 4
    .line 5
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public l(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;I)Landroid/graphics/Typeface;
    .locals 0

    .line 1
    invoke-static {p1}, La/a;->E(Landroid/content/Context;)Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 p4, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    return-object p4

    .line 9
    :cond_0
    :try_start_0
    invoke-static {p1, p2, p3}, La/a;->q(Ljava/io/File;Landroid/content/res/Resources;I)Z

    .line 10
    .line 11
    .line 12
    move-result p2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    if-nez p2, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 16
    .line 17
    .line 18
    return-object p4

    .line 19
    :cond_1
    :try_start_1
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-static {p2}, Landroid/graphics/Typeface;->createFromFile(Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 24
    .line 25
    .line 26
    move-result-object p2
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 28
    .line 29
    .line 30
    return-object p2

    .line 31
    :catchall_0
    move-exception p2

    .line 32
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 33
    .line 34
    .line 35
    throw p2

    .line 36
    :catch_0
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 37
    .line 38
    .line 39
    return-object p4
.end method

.method public abstract y(Lq/f;Lq/f;)V
.end method

.method public abstract z(Lq/f;Ljava/lang/Thread;)V
.end method

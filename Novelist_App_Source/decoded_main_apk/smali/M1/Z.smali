.class public final LM1/Z;
.super LM1/V;
.source "SourceFile"


# static fields
.field public static final synthetic h:I


# instance fields
.field public final b:LM1/n;

.field public c:Z

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:Z


# direct methods
.method public constructor <init>(LM1/n;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, LM1/Z;->c:Z

    .line 6
    .line 7
    iput-boolean v0, p0, LM1/Z;->d:Z

    .line 8
    .line 9
    iput-boolean v0, p0, LM1/Z;->e:Z

    .line 10
    .line 11
    iput-boolean v0, p0, LM1/Z;->f:Z

    .line 12
    .line 13
    iput-boolean v0, p0, LM1/Z;->g:Z

    .line 14
    .line 15
    iput-object p1, p0, LM1/Z;->b:LM1/n;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z
    .locals 6

    .line 1
    new-instance v0, LM1/q;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, LM1/q;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, LM1/Z;->b:LM1/n;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const-string v2, "messageArg"

    .line 13
    .line 14
    invoke-static {p1, v2}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, v1, LM1/n;->a:LM1/O;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v2, v1, LM1/O;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v2, LM1/d;

    .line 25
    .line 26
    invoke-virtual {v2, p0}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_0

    .line 31
    .line 32
    const-string p1, "Callback to `WebChromeClient.onConsoleMessage` failed because native instance was not in the instance manager."

    .line 33
    .line 34
    const-string v0, ""

    .line 35
    .line 36
    const-string v1, "missing-instance-error"

    .line 37
    .line 38
    invoke-static {v1, p1, v0}, LB1/e;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    iget-object v2, v1, LM1/O;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v2, LC1/f;

    .line 45
    .line 46
    invoke-virtual {v1}, LM1/O;->a()LC1/l;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    new-instance v3, LB1/s;

    .line 51
    .line 52
    const-string v4, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onConsoleMessage"

    .line 53
    .line 54
    const/4 v5, 0x0

    .line 55
    invoke-direct {v3, v2, v4, v1, v5}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 56
    .line 57
    .line 58
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    new-instance v1, LD/c;

    .line 67
    .line 68
    const/16 v2, 0x14

    .line 69
    .line 70
    invoke-direct {v1, v0, v2}, LD/c;-><init>(Ljava/lang/Object;I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3, p1, v1}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 74
    .line 75
    .line 76
    :goto_0
    iget-boolean p1, p0, LM1/Z;->d:Z

    .line 77
    .line 78
    return p1
.end method

.method public final onGeolocationPermissionsHidePrompt()V
    .locals 6

    .line 1
    new-instance v0, LM1/q;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, LM1/q;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, LM1/Z;->b:LM1/n;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v1, v1, LM1/n;->a:LM1/O;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v2, v1, LM1/O;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, LM1/d;

    .line 20
    .line 21
    invoke-virtual {v2, p0}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    const-string v0, "Callback to `WebChromeClient.onGeolocationPermissionsHidePrompt` failed because native instance was not in the instance manager."

    .line 28
    .line 29
    const-string v1, ""

    .line 30
    .line 31
    const-string v2, "missing-instance-error"

    .line 32
    .line 33
    invoke-static {v2, v0, v1}, LB1/e;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    iget-object v2, v1, LM1/O;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v2, LC1/f;

    .line 40
    .line 41
    invoke-virtual {v1}, LM1/O;->a()LC1/l;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    new-instance v3, LB1/s;

    .line 46
    .line 47
    const-string v4, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsHidePrompt"

    .line 48
    .line 49
    const/4 v5, 0x0

    .line 50
    invoke-direct {v3, v2, v4, v1, v5}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 51
    .line 52
    .line 53
    invoke-static {p0}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    new-instance v2, LD/c;

    .line 58
    .line 59
    const/16 v4, 0x16

    .line 60
    .line 61
    invoke-direct {v2, v0, v4}, LD/c;-><init>(Ljava/lang/Object;I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3, v1, v2}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public final onGeolocationPermissionsShowPrompt(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V
    .locals 6

    .line 1
    new-instance v0, LM1/q;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, LM1/q;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, LM1/Z;->b:LM1/n;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const-string v2, "originArg"

    .line 13
    .line 14
    invoke-static {p1, v2}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v2, "callbackArg"

    .line 18
    .line 19
    invoke-static {p2, v2}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, v1, LM1/n;->a:LM1/O;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object v2, v1, LM1/O;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v2, LM1/d;

    .line 30
    .line 31
    invoke-virtual {v2, p0}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_0

    .line 36
    .line 37
    const-string p1, "Callback to `WebChromeClient.onGeolocationPermissionsShowPrompt` failed because native instance was not in the instance manager."

    .line 38
    .line 39
    const-string p2, ""

    .line 40
    .line 41
    const-string v0, "missing-instance-error"

    .line 42
    .line 43
    invoke-static {v0, p1, p2}, LB1/e;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    iget-object v2, v1, LM1/O;->b:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v2, LC1/f;

    .line 50
    .line 51
    invoke-virtual {v1}, LM1/O;->a()LC1/l;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    new-instance v3, LB1/s;

    .line 56
    .line 57
    const-string v4, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsShowPrompt"

    .line 58
    .line 59
    const/4 v5, 0x0

    .line 60
    invoke-direct {v3, v2, v4, v1, v5}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 61
    .line 62
    .line 63
    filled-new-array {p0, p1, p2}, [Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    new-instance p2, LD/c;

    .line 72
    .line 73
    const/16 v1, 0x15

    .line 74
    .line 75
    invoke-direct {p2, v0, v1}, LD/c;-><init>(Ljava/lang/Object;I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3, p1, p2}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public final onHideCustomView()V
    .locals 6

    .line 1
    new-instance v0, LM1/q;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, LM1/q;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, LM1/Z;->b:LM1/n;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v1, v1, LM1/n;->a:LM1/O;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v2, v1, LM1/O;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, LM1/d;

    .line 20
    .line 21
    invoke-virtual {v2, p0}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    const-string v0, "Callback to `WebChromeClient.onHideCustomView` failed because native instance was not in the instance manager."

    .line 28
    .line 29
    const-string v1, ""

    .line 30
    .line 31
    const-string v2, "missing-instance-error"

    .line 32
    .line 33
    invoke-static {v2, v0, v1}, LB1/e;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    iget-object v2, v1, LM1/O;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v2, LC1/f;

    .line 40
    .line 41
    invoke-virtual {v1}, LM1/O;->a()LC1/l;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    new-instance v3, LB1/s;

    .line 46
    .line 47
    const-string v4, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onHideCustomView"

    .line 48
    .line 49
    const/4 v5, 0x0

    .line 50
    invoke-direct {v3, v2, v4, v1, v5}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 51
    .line 52
    .line 53
    invoke-static {p0}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    new-instance v2, LD/c;

    .line 58
    .line 59
    const/16 v4, 0x10

    .line 60
    .line 61
    invoke-direct {v2, v0, v4}, LD/c;-><init>(Ljava/lang/Object;I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3, v1, v2}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public final onJsAlert(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 5

    .line 1
    iget-boolean v0, p0, LM1/Z;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    new-instance v0, LM1/W;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, p0, p4, v1}, LM1/W;-><init>(LM1/Z;Landroid/webkit/JsResult;I)V

    .line 9
    .line 10
    .line 11
    new-instance p4, LM1/P;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {p4, v0, v1}, LM1/P;-><init>(Ljava/lang/Object;I)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, LM1/Z;->b:LM1/n;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    const-string v2, "webViewArg"

    .line 23
    .line 24
    invoke-static {p1, v2}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const-string v2, "urlArg"

    .line 28
    .line 29
    invoke-static {p2, v2}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const-string v2, "messageArg"

    .line 33
    .line 34
    invoke-static {p3, v2}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v1, v1, LM1/n;->a:LM1/O;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iget-object v2, v1, LM1/O;->c:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v2, LM1/d;

    .line 45
    .line 46
    invoke-virtual {v2, p0}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-nez v2, :cond_0

    .line 51
    .line 52
    new-instance p1, LM1/a;

    .line 53
    .line 54
    const-string p2, "Callback to `WebChromeClient.onJsAlert` failed because native instance was not in the instance manager."

    .line 55
    .line 56
    const-string p3, ""

    .line 57
    .line 58
    const-string p4, "missing-instance-error"

    .line 59
    .line 60
    invoke-direct {p1, p4, p2, p3}, LM1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-static {p1}, LH2/h;->i(Ljava/lang/Throwable;)LO1/c;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-static {p1}, LO1/d;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iget-object p2, v0, LM1/W;->l:LM1/Z;

    .line 72
    .line 73
    iget-object p2, p2, LM1/Z;->b:LM1/n;

    .line 74
    .line 75
    iget-object p2, p2, LM1/n;->a:LM1/O;

    .line 76
    .line 77
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-static {p1}, LM1/O;->d(Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_0
    iget-object v0, v1, LM1/O;->b:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, LC1/f;

    .line 90
    .line 91
    invoke-virtual {v1}, LM1/O;->a()LC1/l;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    new-instance v2, LB1/s;

    .line 96
    .line 97
    const-string v3, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsAlert"

    .line 98
    .line 99
    const/4 v4, 0x0

    .line 100
    invoke-direct {v2, v0, v3, v1, v4}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 101
    .line 102
    .line 103
    filled-new-array {p0, p1, p2, p3}, [Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    new-instance p2, LM1/I;

    .line 112
    .line 113
    const/4 p3, 0x1

    .line 114
    invoke-direct {p2, p4, p3}, LM1/I;-><init>(LM1/P;I)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, p1, p2}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 118
    .line 119
    .line 120
    :goto_0
    const/4 p1, 0x1

    .line 121
    return p1

    .line 122
    :cond_1
    const/4 p1, 0x0

    .line 123
    return p1
.end method

.method public final onJsConfirm(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 5

    .line 1
    iget-boolean v0, p0, LM1/Z;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    new-instance v0, LM1/W;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, p4, v1}, LM1/W;-><init>(LM1/Z;Landroid/webkit/JsResult;I)V

    .line 9
    .line 10
    .line 11
    new-instance p4, LM1/P;

    .line 12
    .line 13
    invoke-direct {p4, v0, v1}, LM1/P;-><init>(Ljava/lang/Object;I)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, LM1/Z;->b:LM1/n;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const-string v2, "webViewArg"

    .line 22
    .line 23
    invoke-static {p1, v2}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v2, "urlArg"

    .line 27
    .line 28
    invoke-static {p2, v2}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v2, "messageArg"

    .line 32
    .line 33
    invoke-static {p3, v2}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-object v1, v1, LM1/n;->a:LM1/O;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    iget-object v2, v1, LM1/O;->c:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v2, LM1/d;

    .line 44
    .line 45
    invoke-virtual {v2, p0}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-nez v2, :cond_0

    .line 50
    .line 51
    new-instance p1, LM1/a;

    .line 52
    .line 53
    const-string p2, "Callback to `WebChromeClient.onJsConfirm` failed because native instance was not in the instance manager."

    .line 54
    .line 55
    const-string p3, ""

    .line 56
    .line 57
    const-string p4, "missing-instance-error"

    .line 58
    .line 59
    invoke-direct {p1, p4, p2, p3}, LM1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-static {p1}, LH2/h;->i(Ljava/lang/Throwable;)LO1/c;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-static {p1}, LO1/d;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iget-object p2, v0, LM1/W;->l:LM1/Z;

    .line 71
    .line 72
    iget-object p2, p2, LM1/Z;->b:LM1/n;

    .line 73
    .line 74
    iget-object p2, p2, LM1/n;->a:LM1/O;

    .line 75
    .line 76
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-static {p1}, LM1/O;->d(Ljava/lang/Throwable;)V

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_0
    iget-object v0, v1, LM1/O;->b:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, LC1/f;

    .line 89
    .line 90
    invoke-virtual {v1}, LM1/O;->a()LC1/l;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    new-instance v2, LB1/s;

    .line 95
    .line 96
    const-string v3, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm"

    .line 97
    .line 98
    const/4 v4, 0x0

    .line 99
    invoke-direct {v2, v0, v3, v1, v4}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 100
    .line 101
    .line 102
    filled-new-array {p0, p1, p2, p3}, [Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    new-instance p2, LM1/I;

    .line 111
    .line 112
    const/4 p3, 0x3

    .line 113
    invoke-direct {p2, p4, p3}, LM1/I;-><init>(LM1/P;I)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2, p1, p2}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 117
    .line 118
    .line 119
    :goto_0
    const/4 p1, 0x1

    .line 120
    return p1

    .line 121
    :cond_1
    const/4 p1, 0x0

    .line 122
    return p1
.end method

.method public final onJsPrompt(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)Z
    .locals 5

    .line 1
    iget-boolean v0, p0, LM1/Z;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    new-instance v0, LM1/X;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, p5, v1}, LM1/X;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 9
    .line 10
    .line 11
    new-instance p5, LM1/P;

    .line 12
    .line 13
    invoke-direct {p5, v0, v1}, LM1/P;-><init>(Ljava/lang/Object;I)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, LM1/Z;->b:LM1/n;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const-string v2, "webViewArg"

    .line 22
    .line 23
    invoke-static {p1, v2}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v2, "urlArg"

    .line 27
    .line 28
    invoke-static {p2, v2}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v2, "messageArg"

    .line 32
    .line 33
    invoke-static {p3, v2}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v2, "defaultValueArg"

    .line 37
    .line 38
    invoke-static {p4, v2}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget-object v1, v1, LM1/n;->a:LM1/O;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    iget-object v2, v1, LM1/O;->c:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, LM1/d;

    .line 49
    .line 50
    invoke-virtual {v2, p0}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-nez v2, :cond_0

    .line 55
    .line 56
    new-instance p1, LM1/a;

    .line 57
    .line 58
    const-string p2, "Callback to `WebChromeClient.onJsPrompt` failed because native instance was not in the instance manager."

    .line 59
    .line 60
    const-string p3, ""

    .line 61
    .line 62
    const-string p4, "missing-instance-error"

    .line 63
    .line 64
    invoke-direct {p1, p4, p2, p3}, LM1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-static {p1}, LH2/h;->i(Ljava/lang/Throwable;)LO1/c;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-static {p1}, LO1/d;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    iget-object p2, v0, LM1/X;->l:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p2, LM1/Z;

    .line 78
    .line 79
    iget-object p2, p2, LM1/Z;->b:LM1/n;

    .line 80
    .line 81
    iget-object p2, p2, LM1/n;->a:LM1/O;

    .line 82
    .line 83
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-static {p1}, LM1/O;->d(Ljava/lang/Throwable;)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_0
    iget-object v0, v1, LM1/O;->b:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, LC1/f;

    .line 96
    .line 97
    invoke-virtual {v1}, LM1/O;->a()LC1/l;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    new-instance v2, LB1/s;

    .line 102
    .line 103
    const-string v3, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsPrompt"

    .line 104
    .line 105
    const/4 v4, 0x0

    .line 106
    invoke-direct {v2, v0, v3, v1, v4}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 107
    .line 108
    .line 109
    filled-new-array {p0, p1, p2, p3, p4}, [Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    new-instance p2, LM1/I;

    .line 118
    .line 119
    const/4 p3, 0x0

    .line 120
    invoke-direct {p2, p5, p3}, LM1/I;-><init>(LM1/P;I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, p1, p2}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 124
    .line 125
    .line 126
    :goto_0
    const/4 p1, 0x1

    .line 127
    return p1

    .line 128
    :cond_1
    const/4 p1, 0x0

    .line 129
    return p1
.end method

.method public final onPermissionRequest(Landroid/webkit/PermissionRequest;)V
    .locals 6

    .line 1
    new-instance v0, LM1/q;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, LM1/q;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, LM1/Z;->b:LM1/n;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const-string v2, "requestArg"

    .line 13
    .line 14
    invoke-static {p1, v2}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, v1, LM1/n;->a:LM1/O;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v2, v1, LM1/O;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v2, LM1/d;

    .line 25
    .line 26
    invoke-virtual {v2, p0}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_0

    .line 31
    .line 32
    const-string p1, "Callback to `WebChromeClient.onPermissionRequest` failed because native instance was not in the instance manager."

    .line 33
    .line 34
    const-string v0, ""

    .line 35
    .line 36
    const-string v1, "missing-instance-error"

    .line 37
    .line 38
    invoke-static {v1, p1, v0}, LB1/e;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_0
    iget-object v2, v1, LM1/O;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v2, LC1/f;

    .line 45
    .line 46
    invoke-virtual {v1}, LM1/O;->a()LC1/l;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    new-instance v3, LB1/s;

    .line 51
    .line 52
    const-string v4, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onPermissionRequest"

    .line 53
    .line 54
    const/4 v5, 0x0

    .line 55
    invoke-direct {v3, v2, v4, v1, v5}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 56
    .line 57
    .line 58
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    new-instance v1, LD/c;

    .line 67
    .line 68
    const/16 v2, 0x12

    .line 69
    .line 70
    invoke-direct {v1, v0, v2}, LD/c;-><init>(Ljava/lang/Object;I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3, p1, v1}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public final onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 7

    .line 1
    int-to-long v0, p2

    .line 2
    new-instance p2, LM1/q;

    .line 3
    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-direct {p2, v2}, LM1/q;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v2, p0, LM1/Z;->b:LM1/n;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-string v3, "webViewArg"

    .line 14
    .line 15
    invoke-static {p1, v3}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v2, v2, LM1/n;->a:LM1/O;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object v3, v2, LM1/O;->c:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v3, LM1/d;

    .line 26
    .line 27
    invoke-virtual {v3, p0}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-nez v3, :cond_0

    .line 32
    .line 33
    const-string p1, "Callback to `WebChromeClient.onProgressChanged` failed because native instance was not in the instance manager."

    .line 34
    .line 35
    const-string p2, ""

    .line 36
    .line 37
    const-string v0, "missing-instance-error"

    .line 38
    .line 39
    invoke-static {v0, p1, p2}, LB1/e;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_0
    iget-object v3, v2, LM1/O;->b:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v3, LC1/f;

    .line 46
    .line 47
    invoke-virtual {v2}, LM1/O;->a()LC1/l;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    new-instance v4, LB1/s;

    .line 52
    .line 53
    const-string v5, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onProgressChanged"

    .line 54
    .line 55
    const/4 v6, 0x0

    .line 56
    invoke-direct {v4, v3, v5, v2, v6}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 57
    .line 58
    .line 59
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    filled-new-array {p0, p1, v0}, [Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    new-instance v0, LD/c;

    .line 72
    .line 73
    const/16 v1, 0x11

    .line 74
    .line 75
    invoke-direct {v0, p2, v1}, LD/c;-><init>(Ljava/lang/Object;I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v4, p1, v0}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public final onShowCustomView(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V
    .locals 6

    .line 1
    new-instance v0, LM1/q;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, LM1/q;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, LM1/Z;->b:LM1/n;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const-string v2, "viewArg"

    .line 13
    .line 14
    invoke-static {p1, v2}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v2, "callbackArg"

    .line 18
    .line 19
    invoke-static {p2, v2}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, v1, LM1/n;->a:LM1/O;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object v2, v1, LM1/O;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v2, LM1/d;

    .line 30
    .line 31
    invoke-virtual {v2, p0}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_0

    .line 36
    .line 37
    const-string p1, "Callback to `WebChromeClient.onShowCustomView` failed because native instance was not in the instance manager."

    .line 38
    .line 39
    const-string p2, ""

    .line 40
    .line 41
    const-string v0, "missing-instance-error"

    .line 42
    .line 43
    invoke-static {v0, p1, p2}, LB1/e;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    iget-object v2, v1, LM1/O;->b:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v2, LC1/f;

    .line 50
    .line 51
    invoke-virtual {v1}, LM1/O;->a()LC1/l;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    new-instance v3, LB1/s;

    .line 56
    .line 57
    const-string v4, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowCustomView"

    .line 58
    .line 59
    const/4 v5, 0x0

    .line 60
    invoke-direct {v3, v2, v4, v1, v5}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 61
    .line 62
    .line 63
    filled-new-array {p0, p1, p2}, [Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    new-instance p2, LD/c;

    .line 72
    .line 73
    const/16 v1, 0x13

    .line 74
    .line 75
    invoke-direct {p2, v0, v1}, LD/c;-><init>(Ljava/lang/Object;I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3, p1, p2}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public final onShowFileChooser(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z
    .locals 6

    .line 1
    iget-boolean v0, p0, LM1/Z;->c:Z

    .line 2
    .line 3
    new-instance v1, LM1/Y;

    .line 4
    .line 5
    invoke-direct {v1, p0, v0, p2}, LM1/Y;-><init>(LM1/Z;ZLandroid/webkit/ValueCallback;)V

    .line 6
    .line 7
    .line 8
    new-instance p2, LM1/P;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {p2, v1, v2}, LM1/P;-><init>(Ljava/lang/Object;I)V

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, LM1/Z;->b:LM1/n;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const-string v3, "webViewArg"

    .line 20
    .line 21
    invoke-static {p1, v3}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string v3, "paramsArg"

    .line 25
    .line 26
    invoke-static {p3, v3}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-object v2, v2, LM1/n;->a:LM1/O;

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget-object v3, v2, LM1/O;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v3, LM1/d;

    .line 37
    .line 38
    invoke-virtual {v3, p0}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-nez v3, :cond_0

    .line 43
    .line 44
    new-instance p1, LM1/a;

    .line 45
    .line 46
    const-string p2, "Callback to `WebChromeClient.onShowFileChooser` failed because native instance was not in the instance manager."

    .line 47
    .line 48
    const-string p3, ""

    .line 49
    .line 50
    const-string v2, "missing-instance-error"

    .line 51
    .line 52
    invoke-direct {p1, v2, p2, p3}, LM1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-static {p1}, LH2/h;->i(Ljava/lang/Throwable;)LO1/c;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    new-instance p2, LM1/Q;

    .line 60
    .line 61
    invoke-direct {p2, p1}, LM1/Q;-><init>(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-interface {v1, p2}, LZ1/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    return v0

    .line 68
    :cond_0
    iget-object v1, v2, LM1/O;->b:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v1, LC1/f;

    .line 71
    .line 72
    invoke-virtual {v2}, LM1/O;->a()LC1/l;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    new-instance v3, LB1/s;

    .line 77
    .line 78
    const/4 v4, 0x0

    .line 79
    const-string v5, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowFileChooser"

    .line 80
    .line 81
    invoke-direct {v3, v1, v5, v2, v4}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 82
    .line 83
    .line 84
    filled-new-array {p0, p1, p3}, [Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-static {p1}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    new-instance p3, LM1/I;

    .line 93
    .line 94
    const/4 v1, 0x2

    .line 95
    invoke-direct {p3, p2, v1}, LM1/I;-><init>(LM1/P;I)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3, p1, p3}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 99
    .line 100
    .line 101
    return v0
.end method

.class public final synthetic LM1/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:LM1/g0;

.field public final synthetic l:Landroid/webkit/WebView;

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:Z


# direct methods
.method public synthetic constructor <init>(LM1/g0;Landroid/webkit/WebView;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM1/e0;->k:LM1/g0;

    iput-object p2, p0, LM1/e0;->l:Landroid/webkit/WebView;

    iput-object p3, p0, LM1/e0;->m:Ljava/lang/String;

    iput-boolean p4, p0, LM1/e0;->n:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget-object v0, p0, LM1/e0;->k:LM1/g0;

    .line 2
    .line 3
    iget-object v1, v0, LM1/g0;->a:LM1/n;

    .line 4
    .line 5
    new-instance v2, LM1/q;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    invoke-direct {v2, v3}, LM1/q;-><init>(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const-string v3, "webViewArg"

    .line 15
    .line 16
    iget-object v4, p0, LM1/e0;->l:Landroid/webkit/WebView;

    .line 17
    .line 18
    invoke-static {v4, v3}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v3, "urlArg"

    .line 22
    .line 23
    iget-object v5, p0, LM1/e0;->m:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v5, v3}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, v1, LM1/n;->a:LM1/O;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget-object v3, v1, LM1/O;->c:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v3, LM1/d;

    .line 36
    .line 37
    invoke-virtual {v3, v0}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-nez v3, :cond_0

    .line 42
    .line 43
    const-string v0, "Callback to `WebViewClient.doUpdateVisitedHistory` failed because native instance was not in the instance manager."

    .line 44
    .line 45
    const-string v1, ""

    .line 46
    .line 47
    const-string v2, "missing-instance-error"

    .line 48
    .line 49
    invoke-static {v2, v0, v1}, LB1/e;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_0
    iget-object v3, v1, LM1/O;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v3, LC1/f;

    .line 56
    .line 57
    invoke-virtual {v1}, LM1/O;->a()LC1/l;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    new-instance v6, LB1/s;

    .line 62
    .line 63
    const-string v7, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.doUpdateVisitedHistory"

    .line 64
    .line 65
    const/4 v8, 0x0

    .line 66
    invoke-direct {v6, v3, v7, v1, v8}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 67
    .line 68
    .line 69
    iget-boolean v1, p0, LM1/e0;->n:Z

    .line 70
    .line 71
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    filled-new-array {v0, v4, v5, v1}, [Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {v0}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    new-instance v1, LM1/N;

    .line 84
    .line 85
    const/16 v3, 0x9

    .line 86
    .line 87
    invoke-direct {v1, v2, v3}, LM1/N;-><init>(Ljava/lang/Object;I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v6, v0, v1}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 91
    .line 92
    .line 93
    return-void
.end method

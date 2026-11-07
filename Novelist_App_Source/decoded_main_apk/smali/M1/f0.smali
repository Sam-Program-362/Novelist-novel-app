.class public final synthetic LM1/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:LM1/g0;

.field public final synthetic l:Landroid/webkit/WebView;

.field public final synthetic m:F

.field public final synthetic n:F


# direct methods
.method public synthetic constructor <init>(LM1/g0;Landroid/webkit/WebView;FF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM1/f0;->k:LM1/g0;

    iput-object p2, p0, LM1/f0;->l:Landroid/webkit/WebView;

    iput p3, p0, LM1/f0;->m:F

    iput p4, p0, LM1/f0;->n:F

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    .line 1
    iget-object v0, p0, LM1/f0;->k:LM1/g0;

    .line 2
    .line 3
    iget-object v1, v0, LM1/g0;->a:LM1/n;

    .line 4
    .line 5
    iget v2, p0, LM1/f0;->m:F

    .line 6
    .line 7
    float-to-double v2, v2

    .line 8
    iget v4, p0, LM1/f0;->n:F

    .line 9
    .line 10
    float-to-double v4, v4

    .line 11
    new-instance v6, LM1/q;

    .line 12
    .line 13
    const/4 v7, 0x2

    .line 14
    invoke-direct {v6, v7}, LM1/q;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const-string v7, "viewArg"

    .line 21
    .line 22
    iget-object v8, p0, LM1/f0;->l:Landroid/webkit/WebView;

    .line 23
    .line 24
    invoke-static {v8, v7}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object v1, v1, LM1/n;->a:LM1/O;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object v7, v1, LM1/O;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v7, LM1/d;

    .line 35
    .line 36
    invoke-virtual {v7, v0}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    if-nez v7, :cond_0

    .line 41
    .line 42
    const-string v0, "Callback to `WebViewClient.onScaleChanged` failed because native instance was not in the instance manager."

    .line 43
    .line 44
    const-string v1, ""

    .line 45
    .line 46
    const-string v2, "missing-instance-error"

    .line 47
    .line 48
    invoke-static {v2, v0, v1}, LB1/e;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_0
    iget-object v7, v1, LM1/O;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v7, LC1/f;

    .line 55
    .line 56
    invoke-virtual {v1}, LM1/O;->a()LC1/l;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    new-instance v9, LB1/s;

    .line 61
    .line 62
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onScaleChanged"

    .line 63
    .line 64
    const/4 v11, 0x0

    .line 65
    invoke-direct {v9, v7, v10, v1, v11}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 66
    .line 67
    .line 68
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    filled-new-array {v0, v8, v1, v2}, [Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {v0}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    new-instance v1, LM1/N;

    .line 85
    .line 86
    const/16 v2, 0x8

    .line 87
    .line 88
    invoke-direct {v1, v6, v2}, LM1/N;-><init>(Ljava/lang/Object;I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v9, v0, v1}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 92
    .line 93
    .line 94
    return-void
.end method

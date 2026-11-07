.class public final synthetic LM1/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:LM1/r;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:Ljava/lang/String;

.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:J


# direct methods
.method public synthetic constructor <init>(LM1/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM1/p;->k:LM1/r;

    iput-object p2, p0, LM1/p;->l:Ljava/lang/String;

    iput-object p3, p0, LM1/p;->m:Ljava/lang/String;

    iput-object p4, p0, LM1/p;->n:Ljava/lang/String;

    iput-object p5, p0, LM1/p;->o:Ljava/lang/String;

    iput-wide p6, p0, LM1/p;->p:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget-object v0, p0, LM1/p;->k:LM1/r;

    .line 2
    .line 3
    iget-object v1, v0, LM1/r;->a:LM1/s;

    .line 4
    .line 5
    new-instance v6, LM1/q;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v6, v2}, LM1/q;-><init>(I)V

    .line 9
    .line 10
    .line 11
    const-string v2, "urlArg"

    .line 12
    .line 13
    move-object v3, v1

    .line 14
    iget-object v1, p0, LM1/p;->l:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {v1, v2}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v2, "userAgentArg"

    .line 20
    .line 21
    move-object v4, v2

    .line 22
    iget-object v2, p0, LM1/p;->m:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v2, v4}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const-string v4, "contentDispositionArg"

    .line 28
    .line 29
    move-object v5, v3

    .line 30
    iget-object v3, p0, LM1/p;->n:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v3, v4}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const-string v4, "mimetypeArg"

    .line 36
    .line 37
    move-object v7, v4

    .line 38
    iget-object v4, p0, LM1/p;->o:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v4, v7}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object v5, v5, LM1/s;->a:LM1/O;

    .line 44
    .line 45
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iget-object v7, v5, LM1/O;->c:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v7, LM1/d;

    .line 51
    .line 52
    invoke-virtual {v7, v0}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    if-nez v7, :cond_0

    .line 57
    .line 58
    const-string v0, "Callback to `DownloadListener.onDownloadStart` failed because native instance was not in the instance manager."

    .line 59
    .line 60
    const-string v1, ""

    .line 61
    .line 62
    const-string v2, "missing-instance-error"

    .line 63
    .line 64
    invoke-static {v2, v0, v1}, LB1/e;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_0
    iget-object v7, v5, LM1/O;->b:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v7, LC1/f;

    .line 71
    .line 72
    invoke-virtual {v5}, LM1/O;->a()LC1/l;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    new-instance v8, LB1/s;

    .line 77
    .line 78
    const-string v9, "dev.flutter.pigeon.webview_flutter_android.DownloadListener.onDownloadStart"

    .line 79
    .line 80
    const/4 v10, 0x0

    .line 81
    invoke-direct {v8, v7, v9, v5, v10}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 82
    .line 83
    .line 84
    iget-wide v9, p0, LM1/p;->p:J

    .line 85
    .line 86
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    filled-new-array/range {v0 .. v5}, [Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-static {v0}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    new-instance v1, LD/c;

    .line 99
    .line 100
    const/16 v2, 0x8

    .line 101
    .line 102
    invoke-direct {v1, v6, v2}, LD/c;-><init>(Ljava/lang/Object;I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v8, v0, v1}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 106
    .line 107
    .line 108
    return-void
.end method

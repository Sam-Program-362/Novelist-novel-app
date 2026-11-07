.class public final synthetic LM1/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:LM1/k0;

.field public final synthetic l:I

.field public final synthetic m:I

.field public final synthetic n:I

.field public final synthetic o:I


# direct methods
.method public synthetic constructor <init>(LM1/k0;IIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM1/j0;->k:LM1/k0;

    iput p2, p0, LM1/j0;->l:I

    iput p3, p0, LM1/j0;->m:I

    iput p4, p0, LM1/j0;->n:I

    iput p5, p0, LM1/j0;->o:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    iget-object v0, p0, LM1/j0;->k:LM1/k0;

    .line 2
    .line 3
    iget-object v1, v0, LM1/k0;->k:LM1/s;

    .line 4
    .line 5
    iget v2, p0, LM1/j0;->l:I

    .line 6
    .line 7
    int-to-long v2, v2

    .line 8
    iget v4, p0, LM1/j0;->m:I

    .line 9
    .line 10
    int-to-long v4, v4

    .line 11
    iget v6, p0, LM1/j0;->n:I

    .line 12
    .line 13
    int-to-long v6, v6

    .line 14
    iget v8, p0, LM1/j0;->o:I

    .line 15
    .line 16
    int-to-long v8, v8

    .line 17
    new-instance v10, LM1/q;

    .line 18
    .line 19
    const/4 v11, 0x3

    .line 20
    invoke-direct {v10, v11}, LM1/q;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v1, v1, LM1/s;->a:LM1/O;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-object v11, v1, LM1/O;->c:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v11, LM1/d;

    .line 34
    .line 35
    invoke-virtual {v11, v0}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v11

    .line 39
    if-nez v11, :cond_0

    .line 40
    .line 41
    const-string v0, "Callback to `WebView.onScrollChanged` failed because native instance was not in the instance manager."

    .line 42
    .line 43
    const-string v1, ""

    .line 44
    .line 45
    const-string v2, "missing-instance-error"

    .line 46
    .line 47
    invoke-static {v2, v0, v1}, LB1/e;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_0
    iget-object v11, v1, LM1/O;->b:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v11, LC1/f;

    .line 54
    .line 55
    invoke-virtual {v1}, LM1/O;->a()LC1/l;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    new-instance v12, LB1/s;

    .line 60
    .line 61
    const-string v13, "dev.flutter.pigeon.webview_flutter_android.WebView.onScrollChanged"

    .line 62
    .line 63
    const/4 v14, 0x0

    .line 64
    invoke-direct {v12, v11, v13, v1, v14}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 65
    .line 66
    .line 67
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    filled-new-array {v0, v1, v2, v3, v4}, [Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-static {v0}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    new-instance v1, LD/c;

    .line 92
    .line 93
    const/16 v2, 0x19

    .line 94
    .line 95
    invoke-direct {v1, v10, v2}, LD/c;-><init>(Ljava/lang/Object;I)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v12, v0, v1}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 99
    .line 100
    .line 101
    return-void
.end method

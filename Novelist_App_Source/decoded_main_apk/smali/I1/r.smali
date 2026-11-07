.class public final synthetic LI1/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg1/d;


# instance fields
.field public final synthetic k:LI1/s;

.field public final synthetic l:Z

.field public final synthetic m:LI1/k;


# direct methods
.method public synthetic constructor <init>(LI1/s;ZLI1/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI1/r;->k:LI1/s;

    iput-boolean p2, p0, LI1/r;->l:Z

    iput-object p3, p0, LI1/r;->m:LI1/k;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)V
    .locals 12

    .line 1
    check-cast p1, LF0/a;

    .line 2
    .line 3
    iget-object v1, p0, LI1/r;->k:LI1/s;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v0, p1, LF0/a;->p:Landroid/app/PendingIntent;

    .line 9
    .line 10
    iget-object v2, p0, LI1/r;->m:LI1/k;

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    iget-boolean p1, p0, LI1/r;->l:Z

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    iget-object v4, v1, LI1/s;->o:Landroid/app/Activity;

    .line 20
    .line 21
    if-nez v4, :cond_0

    .line 22
    .line 23
    new-instance p1, LI1/a;

    .line 24
    .line 25
    sget-object v0, LI1/b;->q:LI1/b;

    .line 26
    .line 27
    const-string v1, "No activity available"

    .line 28
    .line 29
    invoke-direct {p1, v0, v1, v3}, LI1/a;-><init>(LI1/b;Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v2, p1}, La/a;->o(LZ1/l;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    :try_start_0
    iput-object v2, v1, LI1/s;->p:LI1/k;

    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    const/4 v10, 0x0

    .line 43
    const/4 v11, 0x0

    .line 44
    const v6, 0xd02e

    .line 45
    .line 46
    .line 47
    const/4 v7, 0x0

    .line 48
    const/4 v8, 0x0

    .line 49
    const/4 v9, 0x0

    .line 50
    invoke-virtual/range {v4 .. v11}, Landroid/app/Activity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :catch_0
    move-exception v0

    .line 55
    move-object p1, v0

    .line 56
    iput-object v3, v1, LI1/s;->p:LI1/k;

    .line 57
    .line 58
    new-instance v0, LI1/a;

    .line 59
    .line 60
    sget-object v1, LI1/b;->o:LI1/b;

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-direct {v0, v1, p1, v3}, LI1/a;-><init>(LI1/b;Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-static {v2, v0}, La/a;->o(LZ1/l;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_1
    new-instance p1, LI1/a;

    .line 74
    .line 75
    sget-object v0, LI1/b;->m:LI1/b;

    .line 76
    .line 77
    invoke-direct {p1, v0, v3, v3}, LI1/a;-><init>(LI1/b;Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-static {v2, p1}, La/a;->o(LZ1/l;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_2
    new-instance v0, LI1/w;

    .line 85
    .line 86
    iget-object v1, p1, LF0/a;->l:Ljava/lang/String;

    .line 87
    .line 88
    iget-object v3, p1, LF0/a;->k:Ljava/lang/String;

    .line 89
    .line 90
    iget-object p1, p1, LF0/a;->n:Ljava/util/List;

    .line 91
    .line 92
    invoke-direct {v0, v1, p1, v3}, LI1/w;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-static {v2, v0}, La/a;->o(LZ1/l;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    return-void
.end method

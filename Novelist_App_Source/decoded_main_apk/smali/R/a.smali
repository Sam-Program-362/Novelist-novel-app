.class public final synthetic LR/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ1/l;


# instance fields
.field public final synthetic k:Landroid/os/CancellationSignal;

.field public final synthetic l:LR/b;

.field public final synthetic m:Ljava/util/concurrent/Executor;

.field public final synthetic n:LH/d;


# direct methods
.method public synthetic constructor <init>(Landroid/os/CancellationSignal;LR/b;Ljava/util/concurrent/Executor;LH/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR/a;->k:Landroid/os/CancellationSignal;

    iput-object p2, p0, LR/a;->l:LR/b;

    iput-object p3, p0, LR/a;->m:Ljava/util/concurrent/Executor;

    iput-object p4, p0, LR/a;->n:LH/d;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, LR/a;->l:LR/b;

    .line 2
    .line 3
    iget-object v1, v0, LR/b;->d:Landroid/content/Context;

    .line 4
    .line 5
    check-cast p1, LW0/l;

    .line 6
    .line 7
    sget-object v2, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:LM/h;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v2, p0, LR/a;->k:Landroid/os/CancellationSignal;

    .line 13
    .line 14
    invoke-static {v2}, LM/h;->a(Landroid/os/CancellationSignal;)Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance v3, Landroid/content/Intent;

    .line 22
    .line 23
    const-class v4, Landroidx/credentials/playservices/controllers/identityauth/HiddenActivity;

    .line 24
    .line 25
    invoke-direct {v3, v1, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, v0, LR/b;->h:LO/c;

    .line 29
    .line 30
    const-string v4, "BEGIN_SIGN_IN"

    .line 31
    .line 32
    invoke-static {v0, v3, v4}, LN/c;->a(Landroid/os/ResultReceiver;Landroid/content/Intent;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const-string v0, "EXTRA_FLOW_PENDING_INTENT"

    .line 36
    .line 37
    iget-object p1, p1, LW0/l;->k:Landroid/app/PendingIntent;

    .line 38
    .line 39
    invoke-virtual {v3, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 40
    .line 41
    .line 42
    :try_start_0
    invoke-virtual {v1, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catch_0
    sget-object p1, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:LM/h;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-static {v2}, LM/h;->a(Landroid/os/CancellationSignal;)Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    new-instance p1, LM/b;

    .line 59
    .line 60
    const/16 v0, 0x8

    .line 61
    .line 62
    iget-object v1, p0, LR/a;->n:LH/d;

    .line 63
    .line 64
    invoke-direct {p1, v1, v0}, LM/b;-><init>(LH/d;I)V

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, LR/a;->m:Ljava/util/concurrent/Executor;

    .line 68
    .line 69
    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 70
    .line 71
    .line 72
    :goto_0
    sget-object p1, LO1/g;->a:LO1/g;

    .line 73
    .line 74
    return-object p1
.end method

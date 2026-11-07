.class public final synthetic LM/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg1/c;


# instance fields
.field public final synthetic k:I

.field public final synthetic l:LH/d;

.field public final synthetic m:Ljava/util/concurrent/Executor;

.field public final synthetic n:Landroid/os/CancellationSignal;

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LH/k;LR/b;LH/d;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, LM/g;->k:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM/g;->o:Ljava/lang/Object;

    iput-object p2, p0, LM/g;->p:Ljava/lang/Object;

    iput-object p3, p0, LM/g;->l:LH/d;

    iput-object p4, p0, LM/g;->m:Ljava/util/concurrent/Executor;

    iput-object p5, p0, LM/g;->n:Landroid/os/CancellationSignal;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;LH/a;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;LH/d;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, LM/g;->k:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM/g;->o:Ljava/lang/Object;

    iput-object p2, p0, LM/g;->p:Ljava/lang/Object;

    iput-object p3, p0, LM/g;->n:Landroid/os/CancellationSignal;

    iput-object p4, p0, LM/g;->m:Ljava/util/concurrent/Executor;

    iput-object p5, p0, LM/g;->l:LH/d;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Exception;)V
    .locals 7

    .line 1
    iget v0, p0, LM/g;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LM/g;->o:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, LH/k;

    .line 9
    .line 10
    iget-object v0, p0, LM/g;->p:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, LR/b;

    .line 13
    .line 14
    iget-object v0, v0, LR/b;->d:Landroid/content/Context;

    .line 15
    .line 16
    sget-object v1, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:LM/h;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-static {p1}, LM/h;->b(LH/k;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    iget-object v2, p0, LM/g;->l:LH/d;

    .line 26
    .line 27
    iget-object v3, p0, LM/g;->m:Ljava/util/concurrent/Executor;

    .line 28
    .line 29
    iget-object v4, p0, LM/g;->n:Landroid/os/CancellationSignal;

    .line 30
    .line 31
    const-string v5, "GetCredentialController"

    .line 32
    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    const-string v1, "Pre-u credman get flow failed for get sign in intent; retrying with gis flow"

    .line 36
    .line 37
    invoke-static {v5, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    new-instance v1, LQ/b;

    .line 41
    .line 42
    invoke-direct {v1, v0}, LQ/b;-><init>(Landroid/content/Context;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, p1, v4, v3, v2}, LQ/b;->f(LH/k;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;LH/d;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    const-string v1, "Pre-u credman get flow failed; retrying with gis flow"

    .line 50
    .line 51
    invoke-static {v5, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    new-instance v1, LO/d;

    .line 55
    .line 56
    invoke-direct {v1, v0}, LO/d;-><init>(Landroid/content/Context;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, p1, v4, v3, v2}, LO/d;->e(LH/k;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;LH/d;)V

    .line 60
    .line 61
    .line 62
    :goto_0
    return-void

    .line 63
    :pswitch_0
    iget-object v0, p0, LM/g;->o:Ljava/lang/Object;

    .line 64
    .line 65
    move-object v1, v0

    .line 66
    check-cast v1, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;

    .line 67
    .line 68
    iget-object v0, p0, LM/g;->p:Ljava/lang/Object;

    .line 69
    .line 70
    move-object v2, v0

    .line 71
    check-cast v2, LH/a;

    .line 72
    .line 73
    iget-object v4, p0, LM/g;->m:Ljava/util/concurrent/Executor;

    .line 74
    .line 75
    iget-object v5, p0, LM/g;->l:LH/d;

    .line 76
    .line 77
    iget-object v3, p0, LM/g;->n:Landroid/os/CancellationSignal;

    .line 78
    .line 79
    move-object v6, p1

    .line 80
    invoke-static/range {v1 .. v6}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->$r8$lambda$1UTL-i4hwhJk_BYM4Zcx0ZRJ19w(Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;LH/a;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;LH/d;Ljava/lang/Exception;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.class public final synthetic LM/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ1/l;


# instance fields
.field public final synthetic k:Landroid/os/CancellationSignal;

.field public final synthetic l:Ljava/util/concurrent/Executor;

.field public final synthetic m:LH/d;


# direct methods
.method public synthetic constructor <init>(Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;LH/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM/d;->k:Landroid/os/CancellationSignal;

    iput-object p2, p0, LM/d;->l:Ljava/util/concurrent/Executor;

    iput-object p3, p0, LM/d;->m:LH/d;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LM/d;->m:LH/d;

    check-cast p1, Ljava/lang/Void;

    iget-object v1, p0, LM/d;->k:Landroid/os/CancellationSignal;

    iget-object v2, p0, LM/d;->l:Ljava/util/concurrent/Executor;

    invoke-static {v1, v2, v0, p1}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->$r8$lambda$CkXA6uyZF5r3Uy4uE_kF2MrG3TY(Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;LH/d;Ljava/lang/Void;)LO1/g;

    move-result-object p1

    return-object p1
.end method

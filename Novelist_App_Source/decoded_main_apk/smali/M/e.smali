.class public final synthetic LM/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg1/c;


# instance fields
.field public final synthetic k:Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;

.field public final synthetic l:Landroid/os/CancellationSignal;

.field public final synthetic m:Ljava/util/concurrent/Executor;

.field public final synthetic n:LH/d;


# direct methods
.method public synthetic constructor <init>(Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;LH/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM/e;->k:Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;

    iput-object p2, p0, LM/e;->l:Landroid/os/CancellationSignal;

    iput-object p3, p0, LM/e;->m:Ljava/util/concurrent/Executor;

    iput-object p4, p0, LM/e;->n:LH/d;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Exception;)V
    .locals 4

    .line 1
    iget-object v0, p0, LM/e;->m:Ljava/util/concurrent/Executor;

    iget-object v1, p0, LM/e;->n:LH/d;

    iget-object v2, p0, LM/e;->k:Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;

    iget-object v3, p0, LM/e;->l:Landroid/os/CancellationSignal;

    invoke-static {v2, v3, v0, v1, p1}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->$r8$lambda$KPnyPsbzUo0kEQwputkdgA68I1Y(Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;LH/d;Ljava/lang/Exception;)V

    return-void
.end method

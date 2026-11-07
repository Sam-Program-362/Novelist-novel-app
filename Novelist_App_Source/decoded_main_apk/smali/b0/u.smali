.class public final Lb0/u;
.super La/a;
.source "SourceFile"

# interfaces
.implements Lt/d;
.implements Landroidx/lifecycle/T;
.implements Lb/u;
.implements Lm0/e;
.implements Lb0/M;


# instance fields
.field public final m:Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;

.field public final n:Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;

.field public final o:Landroid/os/Handler;

.field public final p:Lb0/I;

.field public final synthetic q:Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;)V
    .locals 1

    .line 1
    const/16 v0, 0x12

    .line 2
    .line 3
    invoke-direct {p0, v0}, La/a;-><init>(I)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lb0/u;->q:Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;

    .line 7
    .line 8
    new-instance v0, Landroid/os/Handler;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lb0/u;->m:Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;

    .line 14
    .line 15
    iput-object p1, p0, Lb0/u;->n:Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;

    .line 16
    .line 17
    iput-object v0, p0, Lb0/u;->o:Landroid/os/Handler;

    .line 18
    .line 19
    new-instance p1, Lb0/I;

    .line 20
    .line 21
    invoke-direct {p1}, Lb0/I;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lb0/u;->p:Lb0/I;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final L(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lb0/u;->q:Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final M()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lb0/u;->q:Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public final b()Lb/t;
    .locals 1

    .line 1
    iget-object v0, p0, Lb0/u;->q:Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;

    .line 2
    .line 3
    invoke-virtual {v0}, Lb/k;->b()Lb/t;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final c()LB1/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lb0/u;->q:Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;

    .line 2
    .line 3
    iget-object v0, v0, Lb/k;->n:Lg1/h;

    .line 4
    .line 5
    iget-object v0, v0, Lg1/h;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, LB1/p;

    .line 8
    .line 9
    return-object v0
.end method

.method public final d()V
    .locals 0

    .line 1
    return-void
.end method

.method public final e(LC/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lb0/u;->q:Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lb/k;->e(LC/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final f()Landroidx/lifecycle/S;
    .locals 1

    .line 1
    iget-object v0, p0, Lb0/u;->q:Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;

    .line 2
    .line 3
    invoke-virtual {v0}, Lb/k;->f()Landroidx/lifecycle/S;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final g(LC/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lb0/u;->q:Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lb/k;->g(LC/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final h()Landroidx/lifecycle/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lb0/u;->q:Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;->D:Landroidx/lifecycle/u;

    .line 4
    .line 5
    return-object v0
.end method

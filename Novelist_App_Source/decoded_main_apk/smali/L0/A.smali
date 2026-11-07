.class public final LL0/A;
.super LL0/u;
.source "SourceFile"


# instance fields
.field public final b:LL0/k;

.field public final c:Lg1/e;

.field public final d:LB1/b;


# direct methods
.method public constructor <init>(ILL0/k;Lg1/e;LB1/b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LL0/C;-><init>(I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, LL0/A;->c:Lg1/e;

    .line 5
    .line 6
    iput-object p2, p0, LL0/A;->b:LL0/k;

    .line 7
    .line 8
    iput-object p4, p0, LL0/A;->d:LB1/b;

    .line 9
    .line 10
    const/4 p3, 0x2

    .line 11
    if-ne p1, p3, :cond_1

    .line 12
    .line 13
    iget-boolean p1, p2, LL0/k;->b:Z

    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 19
    .line 20
    const-string p2, "Best-effort write calls cannot pass methods that should auto-resolve missing features."

    .line 21
    .line 22
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1

    .line 26
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    .line 1
    iget-object v0, p0, LL0/A;->d:LB1/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, LM0/r;->j(Lcom/google/android/gms/common/api/Status;)LK0/e;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object v0, p0, LL0/A;->c:Lg1/e;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lg1/e;->c(Ljava/lang/Exception;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final b(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    iget-object v0, p0, LL0/A;->c:Lg1/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lg1/e;->c(Ljava/lang/Exception;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final c(LL0/p;)V
    .locals 2

    .line 1
    iget-object v0, p0, LL0/A;->c:Lg1/e;

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, LL0/A;->b:LL0/k;

    .line 4
    .line 5
    iget-object p1, p1, LL0/p;->b:LK0/c;

    .line 6
    .line 7
    iget-object v1, v1, LL0/k;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, LL0/k;

    .line 10
    .line 11
    iget-object v1, v1, LL0/k;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, LL0/i;

    .line 14
    .line 15
    invoke-interface {v1, p1, v0}, LL0/i;->accept(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catch_0
    move-exception p1

    .line 20
    goto :goto_0

    .line 21
    :catch_1
    move-exception p1

    .line 22
    goto :goto_1

    .line 23
    :catch_2
    move-exception p1

    .line 24
    goto :goto_2

    .line 25
    :goto_0
    invoke-virtual {v0, p1}, Lg1/e;->c(Ljava/lang/Exception;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :goto_1
    invoke-static {p1}, LL0/C;->e(Landroid/os/RemoteException;)Lcom/google/android/gms/common/api/Status;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p0, p1}, LL0/A;->a(Lcom/google/android/gms/common/api/Status;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :goto_2
    throw p1
.end method

.method public final d(LA/c;Z)V
    .locals 4

    .line 1
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget-object v0, p1, LA/c;->m:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/util/Map;

    .line 8
    .line 9
    iget-object v1, p0, LL0/A;->c:Lg1/e;

    .line 10
    .line 11
    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    iget-object p2, v1, Lg1/e;->a:Lg1/i;

    .line 15
    .line 16
    new-instance v0, LA/c;

    .line 17
    .line 18
    const/16 v2, 0x12

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-direct {v0, p1, v1, v2, v3}, LA/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    sget-object p1, Lg1/f;->a:LA/p;

    .line 28
    .line 29
    new-instance v1, Lg1/g;

    .line 30
    .line 31
    invoke-direct {v1, p1, v0}, Lg1/g;-><init>(Ljava/util/concurrent/Executor;Lg1/b;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p2, Lg1/i;->d:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, Lg1/h;

    .line 37
    .line 38
    invoke-virtual {p1, v1}, Lg1/h;->e(Lg1/g;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2}, Lg1/i;->f()V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final f(LL0/p;)Z
    .locals 0

    .line 1
    iget-object p1, p0, LL0/A;->b:LL0/k;

    .line 2
    .line 3
    iget-boolean p1, p1, LL0/k;->b:Z

    .line 4
    .line 5
    return p1
.end method

.method public final g(LL0/p;)[LJ0/c;
    .locals 0

    .line 1
    iget-object p1, p0, LL0/A;->b:LL0/k;

    .line 2
    .line 3
    iget-object p1, p1, LL0/k;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, [LJ0/c;

    .line 6
    .line 7
    return-object p1
.end method

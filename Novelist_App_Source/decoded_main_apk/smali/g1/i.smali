.class public final Lg1/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public final b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public e:Ljava/io/Serializable;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lg1/i;->b:Ljava/lang/Object;

    new-instance v0, Lg1/h;

    invoke-direct {v0}, Lg1/h;-><init>()V

    iput-object v0, p0, Lg1/i;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    .line 4
    const-string p1, "libapp.so"

    :cond_0
    iput-object p1, p0, Lg1/i;->b:Ljava/lang/Object;

    if-nez p2, :cond_1

    .line 5
    const-string p2, "flutter_assets"

    :cond_1
    iput-object p2, p0, Lg1/i;->c:Ljava/lang/Object;

    .line 6
    iput-object p4, p0, Lg1/i;->e:Ljava/io/Serializable;

    if-nez p3, :cond_2

    .line 7
    const-string p3, ""

    :cond_2
    iput-object p3, p0, Lg1/i;->d:Ljava/lang/Object;

    .line 8
    iput-boolean p5, p0, Lg1/i;->a:Z

    return-void
.end method


# virtual methods
.method public a(Lg1/c;)V
    .locals 2

    .line 1
    sget-object v0, Lg1/f;->a:LA/p;

    .line 2
    .line 3
    new-instance v1, Lg1/g;

    .line 4
    .line 5
    invoke-direct {v1, v0, p1}, Lg1/g;-><init>(Ljava/util/concurrent/Executor;Lg1/c;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lg1/i;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Lg1/h;

    .line 11
    .line 12
    invoke-virtual {p1, v1}, Lg1/h;->e(Lg1/g;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lg1/i;->f()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public b(Lg1/d;)V
    .locals 2

    .line 1
    sget-object v0, Lg1/f;->a:LA/p;

    .line 2
    .line 3
    new-instance v1, Lg1/g;

    .line 4
    .line 5
    invoke-direct {v1, v0, p1}, Lg1/g;-><init>(Ljava/util/concurrent/Executor;Lg1/d;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lg1/i;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Lg1/h;

    .line 11
    .line 12
    invoke-virtual {p1, v1}, Lg1/h;->e(Lg1/g;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lg1/i;->f()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public c()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lg1/i;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lg1/i;->a:Z

    .line 5
    .line 6
    const-string v2, "Task is not yet complete"

    .line 7
    .line 8
    invoke-static {v2, v1}, LM0/r;->h(Ljava/lang/String;Z)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lg1/i;->e:Ljava/io/Serializable;

    .line 12
    .line 13
    check-cast v1, Ljava/lang/Exception;

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Lg1/i;->c:Ljava/lang/Object;

    .line 18
    .line 19
    monitor-exit v0

    .line 20
    return-object v1

    .line 21
    :catchall_0
    move-exception v1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v2, LD0/a;

    .line 24
    .line 25
    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    throw v2

    .line 29
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    throw v1
.end method

.method public d()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lg1/i;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lg1/i;->a:Z

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lg1/i;->e:Ljava/io/Serializable;

    .line 10
    .line 11
    check-cast v1, Ljava/lang/Exception;

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    :cond_0
    monitor-exit v0

    .line 17
    return v2

    .line 18
    :catchall_0
    move-exception v1

    .line 19
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    throw v1
.end method

.method public e()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lg1/i;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    sget v0, Lg1/a;->k:I

    .line 6
    .line 7
    iget-object v0, p0, Lg1/i;->b:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    iget-boolean v1, p0, Lg1/i;->a:Z

    .line 11
    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    iget-object v0, p0, Lg1/i;->b:Ljava/lang/Object;

    .line 16
    .line 17
    monitor-enter v0

    .line 18
    :try_start_1
    iget-object v1, p0, Lg1/i;->e:Ljava/io/Serializable;

    .line 19
    .line 20
    check-cast v1, Ljava/lang/Exception;

    .line 21
    .line 22
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, Lg1/i;->d()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0}, Lg1/i;->c()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const-string v2, "result "

    .line 40
    .line 41
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const-string v0, "unknown issue"

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    const-string v0, "failure"

    .line 50
    .line 51
    :goto_0
    const-string v2, "Complete with: "

    .line 52
    .line 53
    new-instance v3, Lg1/a;

    .line 54
    .line 55
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-direct {v3, v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :catchall_0
    move-exception v1

    .line 64
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 65
    throw v1

    .line 66
    :cond_2
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    const-string v0, "DuplicateTaskCompletionException can only be created from completed Task."

    .line 69
    .line 70
    invoke-direct {v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    :goto_1
    throw v3

    .line 74
    :catchall_1
    move-exception v1

    .line 75
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 76
    throw v1

    .line 77
    :cond_3
    return-void
.end method

.method public f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lg1/i;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lg1/i;->a:Z

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    iget-object v0, p0, Lg1/i;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lg1/h;

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Lg1/h;->f(Lg1/i;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    throw v1
.end method

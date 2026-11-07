.class public final Lg1/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lg1/b;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lg1/g;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lg1/g;->c:Ljava/lang/Object;

    iput-object p1, p0, Lg1/g;->b:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lg1/g;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;Lg1/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lg1/g;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lg1/g;->c:Ljava/lang/Object;

    iput-object p1, p0, Lg1/g;->b:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lg1/g;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;Lg1/d;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lg1/g;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lg1/g;->c:Ljava/lang/Object;

    iput-object p1, p0, Lg1/g;->b:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lg1/g;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lg1/i;)V
    .locals 4

    .line 1
    iget v0, p0, Lg1/g;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lg1/i;->d()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lg1/g;->c:Ljava/lang/Object;

    .line 13
    .line 14
    monitor-enter v0

    .line 15
    :try_start_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    iget-object v0, p0, Lg1/g;->b:Ljava/util/concurrent/Executor;

    .line 17
    .line 18
    new-instance v1, LA/a;

    .line 19
    .line 20
    const/4 v2, 0x7

    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-direct {v1, p0, p1, v2, v3}, LA/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    throw p1

    .line 32
    :cond_0
    :goto_0
    return-void

    .line 33
    :pswitch_0
    invoke-virtual {p1}, Lg1/i;->d()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    iget-object v0, p0, Lg1/g;->c:Ljava/lang/Object;

    .line 40
    .line 41
    monitor-enter v0

    .line 42
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 43
    iget-object v0, p0, Lg1/g;->b:Ljava/util/concurrent/Executor;

    .line 44
    .line 45
    new-instance v1, LA/a;

    .line 46
    .line 47
    const/4 v2, 0x6

    .line 48
    const/4 v3, 0x0

    .line 49
    invoke-direct {v1, p0, p1, v2, v3}, LA/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 50
    .line 51
    .line 52
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :catchall_1
    move-exception p1

    .line 57
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 58
    throw p1

    .line 59
    :cond_1
    :goto_1
    return-void

    .line 60
    :pswitch_1
    iget-object v0, p0, Lg1/g;->c:Ljava/lang/Object;

    .line 61
    .line 62
    monitor-enter v0

    .line 63
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 64
    iget-object v0, p0, Lg1/g;->b:Ljava/util/concurrent/Executor;

    .line 65
    .line 66
    new-instance v1, LA/a;

    .line 67
    .line 68
    const/4 v2, 0x5

    .line 69
    const/4 v3, 0x0

    .line 70
    invoke-direct {v1, p0, p1, v2, v3}, LA/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 71
    .line 72
    .line 73
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :catchall_2
    move-exception p1

    .line 78
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 79
    throw p1

    .line 80
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

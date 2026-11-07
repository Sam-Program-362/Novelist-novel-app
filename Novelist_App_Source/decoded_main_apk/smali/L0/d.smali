.class public final LL0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# static fields
.field public static final o:Lcom/google/android/gms/common/api/Status;

.field public static final p:Lcom/google/android/gms/common/api/Status;

.field public static final q:Ljava/lang/Object;

.field public static r:LL0/d;


# instance fields
.field public a:J

.field public b:Z

.field public c:LM0/j;

.field public d:LO0/b;

.field public final e:Landroid/content/Context;

.field public final f:LJ0/d;

.field public final g:LA/c;

.field public final h:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final i:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final j:Ljava/util/concurrent/ConcurrentHashMap;

.field public final k:Lo/f;

.field public final l:Lo/f;

.field public final m:LZ0/d;

.field public volatile n:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const-string v2, "Sign-out occurred while this API call was in progress."

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    invoke-direct {v0, v1, v2, v3, v3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;LJ0/a;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, LL0/d;->o:Lcom/google/android/gms/common/api/Status;

    .line 11
    .line 12
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 13
    .line 14
    const-string v2, "The user must be signed in to make this API call."

    .line 15
    .line 16
    invoke-direct {v0, v1, v2, v3, v3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;LJ0/a;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, LL0/d;->p:Lcom/google/android/gms/common/api/Status;

    .line 20
    .line 21
    new-instance v0, Ljava/lang/Object;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    sput-object v0, LL0/d;->q:Ljava/lang/Object;

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;)V
    .locals 6

    .line 1
    sget-object v0, LJ0/d;->c:LJ0/d;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide/16 v1, 0x2710

    .line 7
    .line 8
    iput-wide v1, p0, LL0/d;->a:J

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput-boolean v1, p0, LL0/d;->b:Z

    .line 12
    .line 13
    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v2, p0, LL0/d;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 20
    .line 21
    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 22
    .line 23
    invoke-direct {v2, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 24
    .line 25
    .line 26
    iput-object v2, p0, LL0/d;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 27
    .line 28
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 29
    .line 30
    const/4 v4, 0x5

    .line 31
    const/high16 v5, 0x3f400000    # 0.75f

    .line 32
    .line 33
    invoke-direct {v2, v4, v5, v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    .line 34
    .line 35
    .line 36
    iput-object v2, p0, LL0/d;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 37
    .line 38
    new-instance v2, Lo/f;

    .line 39
    .line 40
    invoke-direct {v2, v1}, Lo/f;-><init>(I)V

    .line 41
    .line 42
    .line 43
    iput-object v2, p0, LL0/d;->k:Lo/f;

    .line 44
    .line 45
    new-instance v2, Lo/f;

    .line 46
    .line 47
    invoke-direct {v2, v1}, Lo/f;-><init>(I)V

    .line 48
    .line 49
    .line 50
    iput-object v2, p0, LL0/d;->l:Lo/f;

    .line 51
    .line 52
    iput-boolean v3, p0, LL0/d;->n:Z

    .line 53
    .line 54
    iput-object p1, p0, LL0/d;->e:Landroid/content/Context;

    .line 55
    .line 56
    new-instance v2, LZ0/d;

    .line 57
    .line 58
    invoke-direct {v2, p2, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 59
    .line 60
    .line 61
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 62
    .line 63
    .line 64
    iput-object v2, p0, LL0/d;->m:LZ0/d;

    .line 65
    .line 66
    iput-object v0, p0, LL0/d;->f:LJ0/d;

    .line 67
    .line 68
    new-instance p2, LA/c;

    .line 69
    .line 70
    const/16 v0, 0x16

    .line 71
    .line 72
    invoke-direct {p2, v0}, LA/c;-><init>(I)V

    .line 73
    .line 74
    .line 75
    iput-object p2, p0, LL0/d;->g:LA/c;

    .line 76
    .line 77
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    sget-object p2, LH2/h;->h:Ljava/lang/Boolean;

    .line 82
    .line 83
    if-nez p2, :cond_1

    .line 84
    .line 85
    invoke-static {}, LS0/a;->w()Z

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    if-eqz p2, :cond_0

    .line 90
    .line 91
    const-string p2, "android.hardware.type.automotive"

    .line 92
    .line 93
    invoke-virtual {p1, p2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-eqz p1, :cond_0

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_0
    move v3, v1

    .line 101
    :goto_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    sput-object p1, LH2/h;->h:Ljava/lang/Boolean;

    .line 106
    .line 107
    :cond_1
    sget-object p1, LH2/h;->h:Ljava/lang/Boolean;

    .line 108
    .line 109
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-eqz p1, :cond_2

    .line 114
    .line 115
    iput-boolean v1, p0, LL0/d;->n:Z

    .line 116
    .line 117
    :cond_2
    const/4 p1, 0x6

    .line 118
    invoke-virtual {v2, p1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-virtual {v2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 123
    .line 124
    .line 125
    return-void
.end method

.method public static a()V
    .locals 3

    .line 1
    sget-object v0, LL0/d;->q:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, LL0/d;->r:LL0/d;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    iget-object v2, v1, LL0/d;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 11
    .line 12
    .line 13
    iget-object v1, v1, LL0/d;->m:LZ0/d;

    .line 14
    .line 15
    const/16 v2, 0xa

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v1

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    :goto_0
    monitor-exit v0

    .line 28
    return-void

    .line 29
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    throw v1
.end method

.method public static d(LL0/a;LJ0/a;)Lcom/google/android/gms/common/api/Status;
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    iget-object p0, p0, LL0/a;->b:LA/c;

    .line 4
    .line 5
    iget-object p0, p0, LA/c;->m:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "API: "

    .line 14
    .line 15
    const-string v3, " is not available on this device. Connection failed with: "

    .line 16
    .line 17
    invoke-static {v2, p0, v3, v1}, LB1/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const/16 v1, 0x11

    .line 22
    .line 23
    iget-object v2, p1, LJ0/a;->m:Landroid/app/PendingIntent;

    .line 24
    .line 25
    invoke-direct {v0, v1, p0, v2, p1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;LJ0/a;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public static f(Landroid/content/Context;)LL0/d;
    .locals 5

    .line 1
    sget-object v0, LL0/d;->q:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, LL0/d;->r:LL0/d;

    .line 5
    .line 6
    if-nez v1, :cond_1

    .line 7
    .line 8
    sget-object v1, LM0/D;->g:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    :try_start_1
    sget-object v2, LM0/D;->i:Landroid/os/HandlerThread;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    monitor-exit v1

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    new-instance v2, Landroid/os/HandlerThread;

    .line 20
    .line 21
    const-string v3, "GoogleApiHandler"

    .line 22
    .line 23
    const/16 v4, 0x9

    .line 24
    .line 25
    invoke-direct {v2, v3, v4}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 26
    .line 27
    .line 28
    sput-object v2, LM0/D;->i:Landroid/os/HandlerThread;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 31
    .line 32
    .line 33
    sget-object v2, LM0/D;->i:Landroid/os/HandlerThread;

    .line 34
    .line 35
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    :goto_0
    :try_start_2
    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    new-instance v2, LL0/d;

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    sget-object v3, LJ0/d;->b:Ljava/lang/Object;

    .line 47
    .line 48
    invoke-direct {v2, p0, v1}, LL0/d;-><init>(Landroid/content/Context;Landroid/os/Looper;)V

    .line 49
    .line 50
    .line 51
    sput-object v2, LL0/d;->r:LL0/d;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :catchall_1
    move-exception p0

    .line 55
    goto :goto_3

    .line 56
    :goto_1
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 57
    :try_start_4
    throw p0

    .line 58
    :cond_1
    :goto_2
    sget-object p0, LL0/d;->r:LL0/d;

    .line 59
    .line 60
    monitor-exit v0

    .line 61
    return-object p0

    .line 62
    :goto_3
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 63
    throw p0
.end method


# virtual methods
.method public final b()Z
    .locals 3

    .line 1
    iget-boolean v0, p0, LL0/d;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, LM0/h;->b()LM0/h;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v0, v0, LM0/h;->a:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, LM0/i;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-boolean v0, v0, LM0/i;->l:Z

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    :cond_1
    iget-object v0, p0, LL0/d;->g:LA/c;

    .line 21
    .line 22
    iget-object v0, v0, LA/c;->l:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Landroid/util/SparseIntArray;

    .line 25
    .line 26
    const v1, 0xc1fa340

    .line 27
    .line 28
    .line 29
    const/4 v2, -0x1

    .line 30
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->get(II)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eq v0, v2, :cond_3

    .line 35
    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    :goto_0
    const/4 v0, 0x0

    .line 40
    return v0

    .line 41
    :cond_3
    :goto_1
    const/4 v0, 0x1

    .line 42
    return v0
.end method

.method public final c(LJ0/a;I)Z
    .locals 7

    .line 1
    iget-object v0, p0, LL0/d;->f:LJ0/d;

    .line 2
    .line 3
    iget-object v1, p0, LL0/d;->e:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-class v2, LS0/a;

    .line 9
    .line 10
    monitor-enter v2

    .line 11
    :try_start_0
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    sget-object v4, LS0/a;->a:Landroid/content/Context;

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    if-eqz v4, :cond_1

    .line 19
    .line 20
    sget-object v6, LS0/a;->b:Ljava/lang/Boolean;

    .line 21
    .line 22
    if-eqz v6, :cond_1

    .line 23
    .line 24
    if-eq v4, v3, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 28
    .line 29
    .line 30
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    monitor-exit v2

    .line 32
    goto :goto_2

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    goto/16 :goto_7

    .line 35
    .line 36
    :cond_1
    :goto_0
    :try_start_1
    sput-object v5, LS0/a;->b:Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-static {}, LS0/a;->w()Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-static {v4}, LB/a;->x(Landroid/content/pm/PackageManager;)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    sput-object v4, LS0/a;->b:Ljava/lang/Boolean;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    :try_start_2
    invoke-virtual {v1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    const-string v6, "com.google.android.instantapps.supervisor.InstantAppsRuntime"

    .line 64
    .line 65
    invoke-virtual {v4, v6}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 69
    .line 70
    sput-object v4, LS0/a;->b:Ljava/lang/Boolean;
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :catch_0
    :try_start_3
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 74
    .line 75
    sput-object v4, LS0/a;->b:Ljava/lang/Boolean;

    .line 76
    .line 77
    :goto_1
    sput-object v3, LS0/a;->a:Landroid/content/Context;

    .line 78
    .line 79
    sget-object v3, LS0/a;->b:Ljava/lang/Boolean;

    .line 80
    .line 81
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 82
    .line 83
    .line 84
    move-result v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 85
    monitor-exit v2

    .line 86
    :goto_2
    const/4 v2, 0x0

    .line 87
    if-eqz v3, :cond_3

    .line 88
    .line 89
    goto :goto_6

    .line 90
    :cond_3
    iget v3, p1, LJ0/a;->l:I

    .line 91
    .line 92
    const/4 v4, 0x1

    .line 93
    if-eqz v3, :cond_4

    .line 94
    .line 95
    iget-object v6, p1, LJ0/a;->m:Landroid/app/PendingIntent;

    .line 96
    .line 97
    if-eqz v6, :cond_4

    .line 98
    .line 99
    move v6, v4

    .line 100
    goto :goto_3

    .line 101
    :cond_4
    move v6, v2

    .line 102
    :goto_3
    if-eqz v6, :cond_5

    .line 103
    .line 104
    iget-object v3, p1, LJ0/a;->m:Landroid/app/PendingIntent;

    .line 105
    .line 106
    goto :goto_5

    .line 107
    :cond_5
    invoke-virtual {v0, v1, v3, v5}, LJ0/e;->a(Landroid/content/Context;ILjava/lang/String;)Landroid/content/Intent;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    if-nez v3, :cond_6

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_6
    const/high16 v5, 0xc000000

    .line 115
    .line 116
    invoke-static {v1, v2, v3, v5}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    :goto_4
    move-object v3, v5

    .line 121
    :goto_5
    if-eqz v3, :cond_7

    .line 122
    .line 123
    iget p1, p1, LJ0/a;->l:I

    .line 124
    .line 125
    sget v5, Lcom/google/android/gms/common/api/GoogleApiActivity;->l:I

    .line 126
    .line 127
    const-class v5, Lcom/google/android/gms/common/api/GoogleApiActivity;

    .line 128
    .line 129
    new-instance v6, Landroid/content/Intent;

    .line 130
    .line 131
    invoke-direct {v6, v1, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 132
    .line 133
    .line 134
    const-string v5, "pending_intent"

    .line 135
    .line 136
    invoke-virtual {v6, v5, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 137
    .line 138
    .line 139
    const-string v3, "failing_client_id"

    .line 140
    .line 141
    invoke-virtual {v6, v3, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 142
    .line 143
    .line 144
    const-string p2, "notify_manager"

    .line 145
    .line 146
    invoke-virtual {v6, p2, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 147
    .line 148
    .line 149
    sget p2, LZ0/c;->a:I

    .line 150
    .line 151
    const/high16 v3, 0x8000000

    .line 152
    .line 153
    or-int/2addr p2, v3

    .line 154
    invoke-static {v1, v2, v6, p2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 155
    .line 156
    .line 157
    move-result-object p2

    .line 158
    invoke-virtual {v0, v1, p1, p2}, LJ0/d;->f(Landroid/content/Context;ILandroid/app/PendingIntent;)V

    .line 159
    .line 160
    .line 161
    move v2, v4

    .line 162
    :cond_7
    :goto_6
    return v2

    .line 163
    :goto_7
    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 164
    throw p1
.end method

.method public final e(LK0/i;)LL0/p;
    .locals 3

    .line 1
    iget-object v0, p1, LK0/i;->e:LL0/a;

    .line 2
    .line 3
    iget-object v1, p0, LL0/d;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    check-cast v2, LL0/p;

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    new-instance v2, LL0/p;

    .line 14
    .line 15
    invoke-direct {v2, p0, p1}, LL0/p;-><init>(LL0/d;LK0/i;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object p1, v2, LL0/p;->b:LK0/c;

    .line 22
    .line 23
    invoke-interface {p1}, LK0/c;->l()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-object p1, p0, LL0/d;->l:Lo/f;

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Lo/f;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {v2}, LL0/p;->m()V

    .line 35
    .line 36
    .line 37
    return-object v2
.end method

.method public final g(LJ0/a;I)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1, p2}, LL0/d;->c(LJ0/a;I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x5

    .line 8
    const/4 v1, 0x0

    .line 9
    iget-object v2, p0, LL0/d;->m:LZ0/d;

    .line 10
    .line 11
    invoke-virtual {v2, v0, p2, v1, p1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {v2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 12

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const/16 v1, 0xd

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const-wide/32 v3, 0x493e0

    .line 7
    .line 8
    .line 9
    const/16 v5, 0x11

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v8, 0x1

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    new-instance p1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v1, "Unknown message id: "

    .line 20
    .line 21
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const-string v0, "GoogleApiManager"

    .line 32
    .line 33
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    return v6

    .line 37
    :pswitch_0
    iput-boolean v6, p0, LL0/d;->b:Z

    .line 38
    .line 39
    return v8

    .line 40
    :pswitch_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, LL0/w;

    .line 43
    .line 44
    iget-wide v3, p1, LL0/w;->c:J

    .line 45
    .line 46
    const-wide/16 v9, 0x0

    .line 47
    .line 48
    cmp-long v0, v3, v9

    .line 49
    .line 50
    if-nez v0, :cond_1

    .line 51
    .line 52
    new-instance v0, LM0/j;

    .line 53
    .line 54
    iget v3, p1, LL0/w;->b:I

    .line 55
    .line 56
    iget-object p1, p1, LL0/w;->a:LM0/g;

    .line 57
    .line 58
    filled-new-array {p1}, [LM0/g;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-direct {v0, v3, p1}, LM0/j;-><init>(ILjava/util/List;)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, LL0/d;->d:LO0/b;

    .line 70
    .line 71
    if-nez p1, :cond_0

    .line 72
    .line 73
    iget-object p1, p0, LL0/d;->e:Landroid/content/Context;

    .line 74
    .line 75
    sget-object v3, LM0/k;->k:LM0/k;

    .line 76
    .line 77
    new-instance v4, LO0/b;

    .line 78
    .line 79
    sget-object v5, LO0/b;->k:LA/c;

    .line 80
    .line 81
    sget-object v7, LK0/h;->c:LK0/h;

    .line 82
    .line 83
    invoke-direct {v4, p1, v5, v3, v7}, LK0/i;-><init>(Landroid/content/Context;LA/c;LK0/b;LK0/h;)V

    .line 84
    .line 85
    .line 86
    iput-object v4, p0, LL0/d;->d:LO0/b;

    .line 87
    .line 88
    :cond_0
    iget-object p1, p0, LL0/d;->d:LO0/b;

    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-static {}, LL0/k;->b()LL0/k;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    sget-object v4, LZ0/b;->a:LJ0/c;

    .line 98
    .line 99
    filled-new-array {v4}, [LJ0/c;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    iput-object v4, v3, LL0/k;->a:Ljava/lang/Object;

    .line 104
    .line 105
    iput-boolean v6, v3, LL0/k;->b:Z

    .line 106
    .line 107
    new-instance v4, LH0/i;

    .line 108
    .line 109
    invoke-direct {v4, v0, v1}, LH0/i;-><init>(Ljava/lang/Object;I)V

    .line 110
    .line 111
    .line 112
    iput-object v4, v3, LL0/k;->d:Ljava/lang/Object;

    .line 113
    .line 114
    invoke-virtual {v3}, LL0/k;->a()LL0/k;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {p1, v2, v0}, LK0/i;->b(ILL0/k;)Lg1/i;

    .line 119
    .line 120
    .line 121
    return v8

    .line 122
    :cond_1
    iget-object v0, p0, LL0/d;->c:LM0/j;

    .line 123
    .line 124
    if-eqz v0, :cond_8

    .line 125
    .line 126
    iget-object v3, v0, LM0/j;->l:Ljava/util/List;

    .line 127
    .line 128
    iget v0, v0, LM0/j;->k:I

    .line 129
    .line 130
    iget v4, p1, LL0/w;->b:I

    .line 131
    .line 132
    if-ne v0, v4, :cond_4

    .line 133
    .line 134
    if-eqz v3, :cond_2

    .line 135
    .line 136
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    iget v3, p1, LL0/w;->d:I

    .line 141
    .line 142
    if-lt v0, v3, :cond_2

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_2
    iget-object v0, p0, LL0/d;->c:LM0/j;

    .line 146
    .line 147
    iget-object v1, p1, LL0/w;->a:LM0/g;

    .line 148
    .line 149
    iget-object v2, v0, LM0/j;->l:Ljava/util/List;

    .line 150
    .line 151
    if-nez v2, :cond_3

    .line 152
    .line 153
    new-instance v2, Ljava/util/ArrayList;

    .line 154
    .line 155
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 156
    .line 157
    .line 158
    iput-object v2, v0, LM0/j;->l:Ljava/util/List;

    .line 159
    .line 160
    :cond_3
    iget-object v0, v0, LM0/j;->l:Ljava/util/List;

    .line 161
    .line 162
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_4
    :goto_0
    iget-object v0, p0, LL0/d;->m:LZ0/d;

    .line 167
    .line 168
    invoke-virtual {v0, v5}, Landroid/os/Handler;->removeMessages(I)V

    .line 169
    .line 170
    .line 171
    iget-object v0, p0, LL0/d;->c:LM0/j;

    .line 172
    .line 173
    if-eqz v0, :cond_8

    .line 174
    .line 175
    iget v3, v0, LM0/j;->k:I

    .line 176
    .line 177
    if-gtz v3, :cond_5

    .line 178
    .line 179
    invoke-virtual {p0}, LL0/d;->b()Z

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    if-eqz v3, :cond_7

    .line 184
    .line 185
    :cond_5
    iget-object v3, p0, LL0/d;->d:LO0/b;

    .line 186
    .line 187
    if-nez v3, :cond_6

    .line 188
    .line 189
    iget-object v3, p0, LL0/d;->e:Landroid/content/Context;

    .line 190
    .line 191
    sget-object v4, LM0/k;->k:LM0/k;

    .line 192
    .line 193
    new-instance v9, LO0/b;

    .line 194
    .line 195
    sget-object v10, LO0/b;->k:LA/c;

    .line 196
    .line 197
    sget-object v11, LK0/h;->c:LK0/h;

    .line 198
    .line 199
    invoke-direct {v9, v3, v10, v4, v11}, LK0/i;-><init>(Landroid/content/Context;LA/c;LK0/b;LK0/h;)V

    .line 200
    .line 201
    .line 202
    iput-object v9, p0, LL0/d;->d:LO0/b;

    .line 203
    .line 204
    :cond_6
    iget-object v3, p0, LL0/d;->d:LO0/b;

    .line 205
    .line 206
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    invoke-static {}, LL0/k;->b()LL0/k;

    .line 210
    .line 211
    .line 212
    move-result-object v4

    .line 213
    sget-object v9, LZ0/b;->a:LJ0/c;

    .line 214
    .line 215
    filled-new-array {v9}, [LJ0/c;

    .line 216
    .line 217
    .line 218
    move-result-object v9

    .line 219
    iput-object v9, v4, LL0/k;->a:Ljava/lang/Object;

    .line 220
    .line 221
    iput-boolean v6, v4, LL0/k;->b:Z

    .line 222
    .line 223
    new-instance v6, LH0/i;

    .line 224
    .line 225
    invoke-direct {v6, v0, v1}, LH0/i;-><init>(Ljava/lang/Object;I)V

    .line 226
    .line 227
    .line 228
    iput-object v6, v4, LL0/k;->d:Ljava/lang/Object;

    .line 229
    .line 230
    invoke-virtual {v4}, LL0/k;->a()LL0/k;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-virtual {v3, v2, v0}, LK0/i;->b(ILL0/k;)Lg1/i;

    .line 235
    .line 236
    .line 237
    :cond_7
    iput-object v7, p0, LL0/d;->c:LM0/j;

    .line 238
    .line 239
    :cond_8
    :goto_1
    iget-object v0, p0, LL0/d;->c:LM0/j;

    .line 240
    .line 241
    if-nez v0, :cond_25

    .line 242
    .line 243
    new-instance v0, Ljava/util/ArrayList;

    .line 244
    .line 245
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 246
    .line 247
    .line 248
    iget-object v1, p1, LL0/w;->a:LM0/g;

    .line 249
    .line 250
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    new-instance v1, LM0/j;

    .line 254
    .line 255
    iget v2, p1, LL0/w;->b:I

    .line 256
    .line 257
    invoke-direct {v1, v2, v0}, LM0/j;-><init>(ILjava/util/List;)V

    .line 258
    .line 259
    .line 260
    iput-object v1, p0, LL0/d;->c:LM0/j;

    .line 261
    .line 262
    iget-object v0, p0, LL0/d;->m:LZ0/d;

    .line 263
    .line 264
    invoke-virtual {v0, v5}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    iget-wide v2, p1, LL0/w;->c:J

    .line 269
    .line 270
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 271
    .line 272
    .line 273
    return v8

    .line 274
    :pswitch_2
    iget-object p1, p0, LL0/d;->c:LM0/j;

    .line 275
    .line 276
    if-eqz p1, :cond_25

    .line 277
    .line 278
    iget v0, p1, LM0/j;->k:I

    .line 279
    .line 280
    if-gtz v0, :cond_9

    .line 281
    .line 282
    invoke-virtual {p0}, LL0/d;->b()Z

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    if-eqz v0, :cond_b

    .line 287
    .line 288
    :cond_9
    iget-object v0, p0, LL0/d;->d:LO0/b;

    .line 289
    .line 290
    if-nez v0, :cond_a

    .line 291
    .line 292
    iget-object v0, p0, LL0/d;->e:Landroid/content/Context;

    .line 293
    .line 294
    sget-object v3, LM0/k;->k:LM0/k;

    .line 295
    .line 296
    new-instance v4, LO0/b;

    .line 297
    .line 298
    sget-object v5, LO0/b;->k:LA/c;

    .line 299
    .line 300
    sget-object v9, LK0/h;->c:LK0/h;

    .line 301
    .line 302
    invoke-direct {v4, v0, v5, v3, v9}, LK0/i;-><init>(Landroid/content/Context;LA/c;LK0/b;LK0/h;)V

    .line 303
    .line 304
    .line 305
    iput-object v4, p0, LL0/d;->d:LO0/b;

    .line 306
    .line 307
    :cond_a
    iget-object v0, p0, LL0/d;->d:LO0/b;

    .line 308
    .line 309
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    invoke-static {}, LL0/k;->b()LL0/k;

    .line 313
    .line 314
    .line 315
    move-result-object v3

    .line 316
    sget-object v4, LZ0/b;->a:LJ0/c;

    .line 317
    .line 318
    filled-new-array {v4}, [LJ0/c;

    .line 319
    .line 320
    .line 321
    move-result-object v4

    .line 322
    iput-object v4, v3, LL0/k;->a:Ljava/lang/Object;

    .line 323
    .line 324
    iput-boolean v6, v3, LL0/k;->b:Z

    .line 325
    .line 326
    new-instance v4, LH0/i;

    .line 327
    .line 328
    invoke-direct {v4, p1, v1}, LH0/i;-><init>(Ljava/lang/Object;I)V

    .line 329
    .line 330
    .line 331
    iput-object v4, v3, LL0/k;->d:Ljava/lang/Object;

    .line 332
    .line 333
    invoke-virtual {v3}, LL0/k;->a()LL0/k;

    .line 334
    .line 335
    .line 336
    move-result-object p1

    .line 337
    invoke-virtual {v0, v2, p1}, LK0/i;->b(ILL0/k;)Lg1/i;

    .line 338
    .line 339
    .line 340
    :cond_b
    iput-object v7, p0, LL0/d;->c:LM0/j;

    .line 341
    .line 342
    return v8

    .line 343
    :pswitch_3
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 344
    .line 345
    check-cast p1, LL0/q;

    .line 346
    .line 347
    iget-object v0, p0, LL0/d;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 348
    .line 349
    iget-object v1, p1, LL0/q;->a:LL0/a;

    .line 350
    .line 351
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    move-result v0

    .line 355
    if-eqz v0, :cond_25

    .line 356
    .line 357
    iget-object v0, p0, LL0/d;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 358
    .line 359
    iget-object v1, p1, LL0/q;->a:LL0/a;

    .line 360
    .line 361
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    check-cast v0, LL0/p;

    .line 366
    .line 367
    iget-object v1, v0, LL0/p;->j:Ljava/util/ArrayList;

    .line 368
    .line 369
    iget-object v2, v0, LL0/p;->m:LL0/d;

    .line 370
    .line 371
    iget-object v3, v0, LL0/p;->a:Ljava/util/LinkedList;

    .line 372
    .line 373
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    move-result v1

    .line 377
    if-eqz v1, :cond_25

    .line 378
    .line 379
    iget-object v1, v2, LL0/d;->m:LZ0/d;

    .line 380
    .line 381
    const/16 v4, 0xf

    .line 382
    .line 383
    invoke-virtual {v1, v4, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 384
    .line 385
    .line 386
    iget-object v1, v2, LL0/d;->m:LZ0/d;

    .line 387
    .line 388
    const/16 v2, 0x10

    .line 389
    .line 390
    invoke-virtual {v1, v2, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    iget-object p1, p1, LL0/q;->b:LJ0/c;

    .line 394
    .line 395
    new-instance v1, Ljava/util/ArrayList;

    .line 396
    .line 397
    invoke-virtual {v3}, Ljava/util/LinkedList;->size()I

    .line 398
    .line 399
    .line 400
    move-result v2

    .line 401
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 402
    .line 403
    .line 404
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 405
    .line 406
    .line 407
    move-result-object v2

    .line 408
    :cond_c
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 409
    .line 410
    .line 411
    move-result v4

    .line 412
    if-eqz v4, :cond_e

    .line 413
    .line 414
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v4

    .line 418
    check-cast v4, LL0/C;

    .line 419
    .line 420
    instance-of v5, v4, LL0/u;

    .line 421
    .line 422
    if-eqz v5, :cond_c

    .line 423
    .line 424
    move-object v5, v4

    .line 425
    check-cast v5, LL0/u;

    .line 426
    .line 427
    invoke-virtual {v5, v0}, LL0/u;->g(LL0/p;)[LJ0/c;

    .line 428
    .line 429
    .line 430
    move-result-object v5

    .line 431
    if-eqz v5, :cond_c

    .line 432
    .line 433
    array-length v7, v5

    .line 434
    move v9, v6

    .line 435
    :goto_3
    if-ge v9, v7, :cond_c

    .line 436
    .line 437
    aget-object v10, v5, v9

    .line 438
    .line 439
    invoke-static {v10, p1}, LM0/r;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 440
    .line 441
    .line 442
    move-result v10

    .line 443
    if-eqz v10, :cond_d

    .line 444
    .line 445
    if-ltz v9, :cond_c

    .line 446
    .line 447
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 448
    .line 449
    .line 450
    goto :goto_2

    .line 451
    :cond_d
    add-int/lit8 v9, v9, 0x1

    .line 452
    .line 453
    goto :goto_3

    .line 454
    :cond_e
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 455
    .line 456
    .line 457
    move-result v0

    .line 458
    :goto_4
    if-ge v6, v0, :cond_25

    .line 459
    .line 460
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v2

    .line 464
    check-cast v2, LL0/C;

    .line 465
    .line 466
    invoke-virtual {v3, v2}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 467
    .line 468
    .line 469
    new-instance v4, LK0/o;

    .line 470
    .line 471
    invoke-direct {v4, p1}, LK0/o;-><init>(LJ0/c;)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v2, v4}, LL0/C;->b(Ljava/lang/Exception;)V

    .line 475
    .line 476
    .line 477
    add-int/lit8 v6, v6, 0x1

    .line 478
    .line 479
    goto :goto_4

    .line 480
    :pswitch_4
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 481
    .line 482
    check-cast p1, LL0/q;

    .line 483
    .line 484
    iget-object v0, p0, LL0/d;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 485
    .line 486
    iget-object v1, p1, LL0/q;->a:LL0/a;

    .line 487
    .line 488
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 489
    .line 490
    .line 491
    move-result v0

    .line 492
    if-eqz v0, :cond_25

    .line 493
    .line 494
    iget-object v0, p0, LL0/d;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 495
    .line 496
    iget-object v1, p1, LL0/q;->a:LL0/a;

    .line 497
    .line 498
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    check-cast v0, LL0/p;

    .line 503
    .line 504
    iget-object v1, v0, LL0/p;->j:Ljava/util/ArrayList;

    .line 505
    .line 506
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 507
    .line 508
    .line 509
    move-result p1

    .line 510
    if-nez p1, :cond_f

    .line 511
    .line 512
    goto/16 :goto_11

    .line 513
    .line 514
    :cond_f
    iget-boolean p1, v0, LL0/p;->i:Z

    .line 515
    .line 516
    if-nez p1, :cond_25

    .line 517
    .line 518
    iget-object p1, v0, LL0/p;->b:LK0/c;

    .line 519
    .line 520
    invoke-interface {p1}, LK0/c;->a()Z

    .line 521
    .line 522
    .line 523
    move-result p1

    .line 524
    if-nez p1, :cond_10

    .line 525
    .line 526
    invoke-virtual {v0}, LL0/p;->m()V

    .line 527
    .line 528
    .line 529
    return v8

    .line 530
    :cond_10
    invoke-virtual {v0}, LL0/p;->f()V

    .line 531
    .line 532
    .line 533
    return v8

    .line 534
    :pswitch_5
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 535
    .line 536
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 537
    .line 538
    .line 539
    new-instance p1, Ljava/lang/ClassCastException;

    .line 540
    .line 541
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 542
    .line 543
    .line 544
    throw p1

    .line 545
    :pswitch_6
    iget-object v0, p0, LL0/d;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 546
    .line 547
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 548
    .line 549
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 550
    .line 551
    .line 552
    move-result v0

    .line 553
    if-eqz v0, :cond_25

    .line 554
    .line 555
    iget-object v0, p0, LL0/d;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 556
    .line 557
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 558
    .line 559
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    move-result-object p1

    .line 563
    check-cast p1, LL0/p;

    .line 564
    .line 565
    iget-object v0, p1, LL0/p;->m:LL0/d;

    .line 566
    .line 567
    iget-object v0, v0, LL0/d;->m:LZ0/d;

    .line 568
    .line 569
    invoke-static {v0}, LM0/r;->c(Landroid/os/Handler;)V

    .line 570
    .line 571
    .line 572
    iget-object v0, p1, LL0/p;->b:LK0/c;

    .line 573
    .line 574
    invoke-interface {v0}, LK0/c;->a()Z

    .line 575
    .line 576
    .line 577
    move-result v1

    .line 578
    if-eqz v1, :cond_13

    .line 579
    .line 580
    iget-object v1, p1, LL0/p;->f:Ljava/util/HashMap;

    .line 581
    .line 582
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 583
    .line 584
    .line 585
    move-result v1

    .line 586
    if-eqz v1, :cond_13

    .line 587
    .line 588
    iget-object v1, p1, LL0/p;->d:LA/c;

    .line 589
    .line 590
    iget-object v2, v1, LA/c;->l:Ljava/lang/Object;

    .line 591
    .line 592
    check-cast v2, Ljava/util/Map;

    .line 593
    .line 594
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 595
    .line 596
    .line 597
    move-result v2

    .line 598
    if-eqz v2, :cond_12

    .line 599
    .line 600
    iget-object v1, v1, LA/c;->m:Ljava/lang/Object;

    .line 601
    .line 602
    check-cast v1, Ljava/util/Map;

    .line 603
    .line 604
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 605
    .line 606
    .line 607
    move-result v1

    .line 608
    if-nez v1, :cond_11

    .line 609
    .line 610
    goto :goto_5

    .line 611
    :cond_11
    const-string p1, "Timing out service connection."

    .line 612
    .line 613
    invoke-interface {v0, p1}, LK0/c;->d(Ljava/lang/String;)V

    .line 614
    .line 615
    .line 616
    return v8

    .line 617
    :cond_12
    :goto_5
    invoke-virtual {p1}, LL0/p;->i()V

    .line 618
    .line 619
    .line 620
    :cond_13
    return v8

    .line 621
    :pswitch_7
    iget-object v0, p0, LL0/d;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 622
    .line 623
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 624
    .line 625
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 626
    .line 627
    .line 628
    move-result v0

    .line 629
    if-eqz v0, :cond_25

    .line 630
    .line 631
    iget-object v0, p0, LL0/d;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 632
    .line 633
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 634
    .line 635
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object p1

    .line 639
    check-cast p1, LL0/p;

    .line 640
    .line 641
    iget-object v0, p1, LL0/p;->m:LL0/d;

    .line 642
    .line 643
    iget-object v1, v0, LL0/d;->m:LZ0/d;

    .line 644
    .line 645
    invoke-static {v1}, LM0/r;->c(Landroid/os/Handler;)V

    .line 646
    .line 647
    .line 648
    iget-boolean v1, p1, LL0/p;->i:Z

    .line 649
    .line 650
    if-eqz v1, :cond_25

    .line 651
    .line 652
    iget-object v2, p1, LL0/p;->c:LL0/a;

    .line 653
    .line 654
    iget-object v3, p1, LL0/p;->m:LL0/d;

    .line 655
    .line 656
    iget-object v3, v3, LL0/d;->m:LZ0/d;

    .line 657
    .line 658
    if-eqz v1, :cond_14

    .line 659
    .line 660
    const/16 v1, 0xb

    .line 661
    .line 662
    invoke-virtual {v3, v1, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 663
    .line 664
    .line 665
    const/16 v1, 0x9

    .line 666
    .line 667
    invoke-virtual {v3, v1, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 668
    .line 669
    .line 670
    iput-boolean v6, p1, LL0/p;->i:Z

    .line 671
    .line 672
    :cond_14
    iget-object v1, v0, LL0/d;->f:LJ0/d;

    .line 673
    .line 674
    iget-object v0, v0, LL0/d;->e:Landroid/content/Context;

    .line 675
    .line 676
    sget v2, LJ0/e;->a:I

    .line 677
    .line 678
    invoke-virtual {v1, v0, v2}, LJ0/e;->b(Landroid/content/Context;I)I

    .line 679
    .line 680
    .line 681
    move-result v0

    .line 682
    const/16 v1, 0x12

    .line 683
    .line 684
    if-ne v0, v1, :cond_15

    .line 685
    .line 686
    const-string v0, "Connection timed out waiting for Google Play services update to complete."

    .line 687
    .line 688
    new-instance v1, Lcom/google/android/gms/common/api/Status;

    .line 689
    .line 690
    const/16 v2, 0x15

    .line 691
    .line 692
    invoke-direct {v1, v2, v0, v7, v7}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;LJ0/a;)V

    .line 693
    .line 694
    .line 695
    goto :goto_6

    .line 696
    :cond_15
    const-string v0, "API failed to connect while resuming due to an unknown error."

    .line 697
    .line 698
    new-instance v1, Lcom/google/android/gms/common/api/Status;

    .line 699
    .line 700
    const/16 v2, 0x16

    .line 701
    .line 702
    invoke-direct {v1, v2, v0, v7, v7}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;LJ0/a;)V

    .line 703
    .line 704
    .line 705
    :goto_6
    invoke-virtual {p1, v1}, LL0/p;->b(Lcom/google/android/gms/common/api/Status;)V

    .line 706
    .line 707
    .line 708
    iget-object p1, p1, LL0/p;->b:LK0/c;

    .line 709
    .line 710
    const-string v0, "Timing out connection while resuming."

    .line 711
    .line 712
    invoke-interface {p1, v0}, LK0/c;->d(Ljava/lang/String;)V

    .line 713
    .line 714
    .line 715
    return v8

    .line 716
    :pswitch_8
    iget-object p1, p0, LL0/d;->l:Lo/f;

    .line 717
    .line 718
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 719
    .line 720
    .line 721
    new-instance v0, Lo/a;

    .line 722
    .line 723
    invoke-direct {v0, p1}, Lo/a;-><init>(Lo/f;)V

    .line 724
    .line 725
    .line 726
    :cond_16
    :goto_7
    invoke-virtual {v0}, Lo/a;->hasNext()Z

    .line 727
    .line 728
    .line 729
    move-result p1

    .line 730
    if-eqz p1, :cond_17

    .line 731
    .line 732
    invoke-virtual {v0}, Lo/a;->next()Ljava/lang/Object;

    .line 733
    .line 734
    .line 735
    move-result-object p1

    .line 736
    check-cast p1, LL0/a;

    .line 737
    .line 738
    iget-object v1, p0, LL0/d;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 739
    .line 740
    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 741
    .line 742
    .line 743
    move-result-object p1

    .line 744
    check-cast p1, LL0/p;

    .line 745
    .line 746
    if-eqz p1, :cond_16

    .line 747
    .line 748
    invoke-virtual {p1}, LL0/p;->q()V

    .line 749
    .line 750
    .line 751
    goto :goto_7

    .line 752
    :cond_17
    iget-object p1, p0, LL0/d;->l:Lo/f;

    .line 753
    .line 754
    invoke-virtual {p1}, Lo/f;->clear()V

    .line 755
    .line 756
    .line 757
    return v8

    .line 758
    :pswitch_9
    iget-object v0, p0, LL0/d;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 759
    .line 760
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 761
    .line 762
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 763
    .line 764
    .line 765
    move-result v0

    .line 766
    if-eqz v0, :cond_25

    .line 767
    .line 768
    iget-object v0, p0, LL0/d;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 769
    .line 770
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 771
    .line 772
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 773
    .line 774
    .line 775
    move-result-object p1

    .line 776
    check-cast p1, LL0/p;

    .line 777
    .line 778
    iget-object v0, p1, LL0/p;->m:LL0/d;

    .line 779
    .line 780
    iget-object v0, v0, LL0/d;->m:LZ0/d;

    .line 781
    .line 782
    invoke-static {v0}, LM0/r;->c(Landroid/os/Handler;)V

    .line 783
    .line 784
    .line 785
    iget-boolean v0, p1, LL0/p;->i:Z

    .line 786
    .line 787
    if-eqz v0, :cond_25

    .line 788
    .line 789
    invoke-virtual {p1}, LL0/p;->m()V

    .line 790
    .line 791
    .line 792
    return v8

    .line 793
    :pswitch_a
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 794
    .line 795
    check-cast p1, LK0/i;

    .line 796
    .line 797
    invoke-virtual {p0, p1}, LL0/d;->e(LK0/i;)LL0/p;

    .line 798
    .line 799
    .line 800
    return v8

    .line 801
    :pswitch_b
    iget-object p1, p0, LL0/d;->e:Landroid/content/Context;

    .line 802
    .line 803
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 804
    .line 805
    .line 806
    move-result-object p1

    .line 807
    instance-of p1, p1, Landroid/app/Application;

    .line 808
    .line 809
    if-eqz p1, :cond_25

    .line 810
    .line 811
    iget-object p1, p0, LL0/d;->e:Landroid/content/Context;

    .line 812
    .line 813
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 814
    .line 815
    .line 816
    move-result-object p1

    .line 817
    check-cast p1, Landroid/app/Application;

    .line 818
    .line 819
    sget-object v0, LL0/b;->o:LL0/b;

    .line 820
    .line 821
    monitor-enter v0

    .line 822
    :try_start_0
    iget-boolean v1, v0, LL0/b;->n:Z

    .line 823
    .line 824
    if-nez v1, :cond_18

    .line 825
    .line 826
    invoke-virtual {p1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 827
    .line 828
    .line 829
    invoke-virtual {p1, v0}, Landroid/app/Application;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 830
    .line 831
    .line 832
    iput-boolean v8, v0, LL0/b;->n:Z

    .line 833
    .line 834
    goto :goto_8

    .line 835
    :catchall_0
    move-exception p1

    .line 836
    goto/16 :goto_c

    .line 837
    .line 838
    :cond_18
    :goto_8
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 839
    new-instance p1, LL0/n;

    .line 840
    .line 841
    invoke-direct {p1, p0}, LL0/n;-><init>(LL0/d;)V

    .line 842
    .line 843
    .line 844
    monitor-enter v0

    .line 845
    :try_start_1
    iget-object v1, v0, LL0/b;->m:Ljava/util/ArrayList;

    .line 846
    .line 847
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 848
    .line 849
    .line 850
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 851
    iget-object p1, v0, LL0/b;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 852
    .line 853
    iget-object v0, v0, LL0/b;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 854
    .line 855
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 856
    .line 857
    .line 858
    move-result v1

    .line 859
    if-nez v1, :cond_1d

    .line 860
    .line 861
    sget-object v1, La/a;->l:Ljava/lang/Boolean;

    .line 862
    .line 863
    if-nez v1, :cond_1b

    .line 864
    .line 865
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 866
    .line 867
    const/16 v2, 0x1c

    .line 868
    .line 869
    if-lt v1, v2, :cond_19

    .line 870
    .line 871
    invoke-static {}, LB/b;->t()Z

    .line 872
    .line 873
    .line 874
    move-result v1

    .line 875
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 876
    .line 877
    .line 878
    move-result-object v1

    .line 879
    goto :goto_9

    .line 880
    :cond_19
    :try_start_2
    const-class v1, Landroid/os/Process;

    .line 881
    .line 882
    const-string v2, "isIsolated"

    .line 883
    .line 884
    invoke-virtual {v1, v2, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 885
    .line 886
    .line 887
    move-result-object v1

    .line 888
    invoke-virtual {v1, v7, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 889
    .line 890
    .line 891
    move-result-object v1

    .line 892
    new-array v2, v6, [Ljava/lang/Object;

    .line 893
    .line 894
    const-string v5, "expected a non-null reference"

    .line 895
    .line 896
    if-eqz v1, :cond_1a

    .line 897
    .line 898
    check-cast v1, Ljava/lang/Boolean;

    .line 899
    .line 900
    goto :goto_9

    .line 901
    :cond_1a
    new-instance v1, LD0/a;

    .line 902
    .line 903
    invoke-static {v5, v2}, LE2/a;->Z(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 904
    .line 905
    .line 906
    move-result-object v2

    .line 907
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 908
    .line 909
    .line 910
    throw v1
    :try_end_2
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_2 .. :try_end_2} :catch_0

    .line 911
    :catch_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 912
    .line 913
    :goto_9
    sput-object v1, La/a;->l:Ljava/lang/Boolean;

    .line 914
    .line 915
    :cond_1b
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 916
    .line 917
    .line 918
    move-result v1

    .line 919
    if-nez v1, :cond_1c

    .line 920
    .line 921
    new-instance v1, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 922
    .line 923
    invoke-direct {v1}, Landroid/app/ActivityManager$RunningAppProcessInfo;-><init>()V

    .line 924
    .line 925
    .line 926
    invoke-static {v1}, Landroid/app/ActivityManager;->getMyMemoryState(Landroid/app/ActivityManager$RunningAppProcessInfo;)V

    .line 927
    .line 928
    .line 929
    invoke-virtual {v0, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 930
    .line 931
    .line 932
    move-result v0

    .line 933
    if-nez v0, :cond_1d

    .line 934
    .line 935
    iget v0, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    .line 936
    .line 937
    const/16 v1, 0x64

    .line 938
    .line 939
    if-le v0, v1, :cond_1d

    .line 940
    .line 941
    invoke-virtual {p1, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 942
    .line 943
    .line 944
    goto :goto_a

    .line 945
    :cond_1c
    move p1, v8

    .line 946
    goto :goto_b

    .line 947
    :cond_1d
    :goto_a
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 948
    .line 949
    .line 950
    move-result p1

    .line 951
    :goto_b
    if-nez p1, :cond_25

    .line 952
    .line 953
    iput-wide v3, p0, LL0/d;->a:J

    .line 954
    .line 955
    goto/16 :goto_11

    .line 956
    .line 957
    :catchall_1
    move-exception p1

    .line 958
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 959
    throw p1

    .line 960
    :goto_c
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 961
    throw p1

    .line 962
    :pswitch_c
    iget v0, p1, Landroid/os/Message;->arg1:I

    .line 963
    .line 964
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 965
    .line 966
    check-cast p1, LJ0/a;

    .line 967
    .line 968
    iget-object v2, p0, LL0/d;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 969
    .line 970
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 971
    .line 972
    .line 973
    move-result-object v2

    .line 974
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 975
    .line 976
    .line 977
    move-result-object v2

    .line 978
    :cond_1e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 979
    .line 980
    .line 981
    move-result v3

    .line 982
    if-eqz v3, :cond_1f

    .line 983
    .line 984
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 985
    .line 986
    .line 987
    move-result-object v3

    .line 988
    check-cast v3, LL0/p;

    .line 989
    .line 990
    iget v4, v3, LL0/p;->g:I

    .line 991
    .line 992
    if-ne v4, v0, :cond_1e

    .line 993
    .line 994
    goto :goto_d

    .line 995
    :cond_1f
    move-object v3, v7

    .line 996
    :goto_d
    if-eqz v3, :cond_21

    .line 997
    .line 998
    iget v0, p1, LJ0/a;->l:I

    .line 999
    .line 1000
    if-ne v0, v1, :cond_20

    .line 1001
    .line 1002
    iget-object v1, p0, LL0/d;->f:LJ0/d;

    .line 1003
    .line 1004
    new-instance v2, Lcom/google/android/gms/common/api/Status;

    .line 1005
    .line 1006
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1007
    .line 1008
    .line 1009
    sget v1, LJ0/f;->e:I

    .line 1010
    .line 1011
    invoke-static {v0}, LJ0/a;->b(I)Ljava/lang/String;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v0

    .line 1015
    iget-object p1, p1, LJ0/a;->n:Ljava/lang/String;

    .line 1016
    .line 1017
    const-string v1, "Error resolution was canceled by the user, original error message: "

    .line 1018
    .line 1019
    const-string v4, ": "

    .line 1020
    .line 1021
    invoke-static {v1, v0, v4, p1}, LB1/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1022
    .line 1023
    .line 1024
    move-result-object p1

    .line 1025
    invoke-direct {v2, v5, p1, v7, v7}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;LJ0/a;)V

    .line 1026
    .line 1027
    .line 1028
    invoke-virtual {v3, v2}, LL0/p;->b(Lcom/google/android/gms/common/api/Status;)V

    .line 1029
    .line 1030
    .line 1031
    return v8

    .line 1032
    :cond_20
    iget-object v0, v3, LL0/p;->c:LL0/a;

    .line 1033
    .line 1034
    invoke-static {v0, p1}, LL0/d;->d(LL0/a;LJ0/a;)Lcom/google/android/gms/common/api/Status;

    .line 1035
    .line 1036
    .line 1037
    move-result-object p1

    .line 1038
    invoke-virtual {v3, p1}, LL0/p;->b(Lcom/google/android/gms/common/api/Status;)V

    .line 1039
    .line 1040
    .line 1041
    return v8

    .line 1042
    :cond_21
    const-string p1, "Could not find API instance "

    .line 1043
    .line 1044
    const-string v1, " while trying to fail enqueued calls."

    .line 1045
    .line 1046
    invoke-static {p1, v0, v1}, LB1/e;->h(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 1047
    .line 1048
    .line 1049
    move-result-object p1

    .line 1050
    new-instance v0, Ljava/lang/Exception;

    .line 1051
    .line 1052
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 1053
    .line 1054
    .line 1055
    const-string v1, "GoogleApiManager"

    .line 1056
    .line 1057
    invoke-static {v1, p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1058
    .line 1059
    .line 1060
    return v8

    .line 1061
    :pswitch_d
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1062
    .line 1063
    check-cast p1, LL0/x;

    .line 1064
    .line 1065
    iget-object v0, p0, LL0/d;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1066
    .line 1067
    iget-object v1, p1, LL0/x;->c:LK0/i;

    .line 1068
    .line 1069
    iget-object v1, v1, LK0/i;->e:LL0/a;

    .line 1070
    .line 1071
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v0

    .line 1075
    check-cast v0, LL0/p;

    .line 1076
    .line 1077
    if-nez v0, :cond_22

    .line 1078
    .line 1079
    iget-object v0, p1, LL0/x;->c:LK0/i;

    .line 1080
    .line 1081
    invoke-virtual {p0, v0}, LL0/d;->e(LK0/i;)LL0/p;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v0

    .line 1085
    :cond_22
    iget-object v1, v0, LL0/p;->b:LK0/c;

    .line 1086
    .line 1087
    invoke-interface {v1}, LK0/c;->l()Z

    .line 1088
    .line 1089
    .line 1090
    move-result v1

    .line 1091
    if-eqz v1, :cond_23

    .line 1092
    .line 1093
    iget-object v1, p0, LL0/d;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1094
    .line 1095
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 1096
    .line 1097
    .line 1098
    move-result v1

    .line 1099
    iget v2, p1, LL0/x;->b:I

    .line 1100
    .line 1101
    if-eq v1, v2, :cond_23

    .line 1102
    .line 1103
    iget-object p1, p1, LL0/x;->a:LL0/C;

    .line 1104
    .line 1105
    sget-object v1, LL0/d;->o:Lcom/google/android/gms/common/api/Status;

    .line 1106
    .line 1107
    invoke-virtual {p1, v1}, LL0/C;->a(Lcom/google/android/gms/common/api/Status;)V

    .line 1108
    .line 1109
    .line 1110
    invoke-virtual {v0}, LL0/p;->q()V

    .line 1111
    .line 1112
    .line 1113
    return v8

    .line 1114
    :cond_23
    iget-object p1, p1, LL0/x;->a:LL0/C;

    .line 1115
    .line 1116
    invoke-virtual {v0, p1}, LL0/p;->n(LL0/C;)V

    .line 1117
    .line 1118
    .line 1119
    return v8

    .line 1120
    :pswitch_e
    iget-object p1, p0, LL0/d;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1121
    .line 1122
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 1123
    .line 1124
    .line 1125
    move-result-object p1

    .line 1126
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 1127
    .line 1128
    .line 1129
    move-result-object p1

    .line 1130
    :goto_e
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1131
    .line 1132
    .line 1133
    move-result v0

    .line 1134
    if-eqz v0, :cond_25

    .line 1135
    .line 1136
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v0

    .line 1140
    check-cast v0, LL0/p;

    .line 1141
    .line 1142
    iget-object v1, v0, LL0/p;->m:LL0/d;

    .line 1143
    .line 1144
    iget-object v1, v1, LL0/d;->m:LZ0/d;

    .line 1145
    .line 1146
    invoke-static {v1}, LM0/r;->c(Landroid/os/Handler;)V

    .line 1147
    .line 1148
    .line 1149
    iput-object v7, v0, LL0/p;->k:LJ0/a;

    .line 1150
    .line 1151
    invoke-virtual {v0}, LL0/p;->m()V

    .line 1152
    .line 1153
    .line 1154
    goto :goto_e

    .line 1155
    :pswitch_f
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1156
    .line 1157
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1158
    .line 1159
    .line 1160
    new-instance p1, Ljava/lang/ClassCastException;

    .line 1161
    .line 1162
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 1163
    .line 1164
    .line 1165
    throw p1

    .line 1166
    :pswitch_10
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1167
    .line 1168
    check-cast p1, Ljava/lang/Boolean;

    .line 1169
    .line 1170
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1171
    .line 1172
    .line 1173
    move-result p1

    .line 1174
    if-eq v8, p1, :cond_24

    .line 1175
    .line 1176
    goto :goto_f

    .line 1177
    :cond_24
    const-wide/16 v3, 0x2710

    .line 1178
    .line 1179
    :goto_f
    iput-wide v3, p0, LL0/d;->a:J

    .line 1180
    .line 1181
    iget-object p1, p0, LL0/d;->m:LZ0/d;

    .line 1182
    .line 1183
    const/16 v0, 0xc

    .line 1184
    .line 1185
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 1186
    .line 1187
    .line 1188
    iget-object p1, p0, LL0/d;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1189
    .line 1190
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    .line 1191
    .line 1192
    .line 1193
    move-result-object p1

    .line 1194
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1195
    .line 1196
    .line 1197
    move-result-object p1

    .line 1198
    :goto_10
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1199
    .line 1200
    .line 1201
    move-result v1

    .line 1202
    if-eqz v1, :cond_25

    .line 1203
    .line 1204
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v1

    .line 1208
    check-cast v1, LL0/a;

    .line 1209
    .line 1210
    iget-object v2, p0, LL0/d;->m:LZ0/d;

    .line 1211
    .line 1212
    invoke-virtual {v2, v0, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v1

    .line 1216
    iget-wide v3, p0, LL0/d;->a:J

    .line 1217
    .line 1218
    invoke-virtual {v2, v1, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 1219
    .line 1220
    .line 1221
    goto :goto_10

    .line 1222
    :cond_25
    :goto_11
    return v8

    .line 1223
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_d
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_d
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

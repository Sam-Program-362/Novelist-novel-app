.class public final LL0/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LS0/a;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LA/c;Lcom/google/android/gms/common/api/internal/BasePendingResult;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LL0/l;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LL0/l;->c:Ljava/lang/Object;

    iput-object p2, p0, LL0/l;->b:LS0/a;

    return-void
.end method

.method public constructor <init>(LS0/a;Lg1/e;LB1/b;)V
    .locals 0

    const/4 p3, 0x1

    iput p3, p0, LL0/l;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LL0/l;->b:LS0/a;

    iput-object p2, p0, LL0/l;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/Status;)V
    .locals 5

    .line 1
    iget v0, p0, LL0/l;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->b()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    iget-object p1, p0, LL0/l;->b:LS0/a;

    .line 13
    .line 14
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 15
    .line 16
    check-cast p1, Lcom/google/android/gms/common/api/internal/BasePendingResult;

    .line 17
    .line 18
    iget-boolean v1, p1, Lcom/google/android/gms/common/api/internal/BasePendingResult;->i:Z

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    xor-int/2addr v1, v2

    .line 22
    const-string v3, "Result has already been consumed."

    .line 23
    .line 24
    invoke-static {v3, v1}, LM0/r;->h(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    :try_start_0
    iget-object v1, p1, Lcom/google/android/gms/common/api/internal/BasePendingResult;->d:Ljava/util/concurrent/CountDownLatch;

    .line 28
    .line 29
    const-wide/16 v3, 0x0

    .line 30
    .line 31
    invoke-virtual {v1, v3, v4, v0}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    sget-object v0, Lcom/google/android/gms/common/api/Status;->r:Lcom/google/android/gms/common/api/Status;

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->N(Lcom/google/android/gms/common/api/Status;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catch_0
    sget-object v0, Lcom/google/android/gms/common/api/Status;->p:Lcom/google/android/gms/common/api/Status;

    .line 44
    .line 45
    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->N(Lcom/google/android/gms/common/api/Status;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->O()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    const-string v1, "Result is not ready."

    .line 53
    .line 54
    invoke-static {v1, v0}, LM0/r;->h(Ljava/lang/String;Z)V

    .line 55
    .line 56
    .line 57
    iget-object v0, p1, Lcom/google/android/gms/common/api/internal/BasePendingResult;->c:Ljava/lang/Object;

    .line 58
    .line 59
    monitor-enter v0

    .line 60
    :try_start_1
    iget-boolean v1, p1, Lcom/google/android/gms/common/api/internal/BasePendingResult;->i:Z

    .line 61
    .line 62
    xor-int/2addr v1, v2

    .line 63
    const-string v3, "Result has already been consumed."

    .line 64
    .line 65
    invoke-static {v3, v1}, LM0/r;->h(Ljava/lang/String;Z)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->O()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    const-string v3, "Result is not ready."

    .line 73
    .line 74
    invoke-static {v3, v1}, LM0/r;->h(Ljava/lang/String;Z)V

    .line 75
    .line 76
    .line 77
    iget-object v1, p1, Lcom/google/android/gms/common/api/internal/BasePendingResult;->g:LK0/n;

    .line 78
    .line 79
    const/4 v3, 0x0

    .line 80
    iput-object v3, p1, Lcom/google/android/gms/common/api/internal/BasePendingResult;->g:LK0/n;

    .line 81
    .line 82
    iput-boolean v2, p1, Lcom/google/android/gms/common/api/internal/BasePendingResult;->i:Z

    .line 83
    .line 84
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 85
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/BasePendingResult;->f:Ljava/util/concurrent/atomic/AtomicReference;

    .line 86
    .line 87
    invoke-virtual {p1, v3}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    if-nez p1, :cond_1

    .line 92
    .line 93
    invoke-static {v1}, LM0/r;->f(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    iget-object p1, p0, LL0/l;->c:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast p1, Lg1/e;

    .line 99
    .line 100
    invoke-virtual {p1, v3}, Lg1/e;->b(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_1
    new-instance p1, Ljava/lang/ClassCastException;

    .line 105
    .line 106
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 107
    .line 108
    .line 109
    throw p1

    .line 110
    :catchall_0
    move-exception p1

    .line 111
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 112
    throw p1

    .line 113
    :cond_2
    iget-object v0, p0, LL0/l;->c:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v0, Lg1/e;

    .line 116
    .line 117
    invoke-static {p1}, LM0/r;->j(Lcom/google/android/gms/common/api/Status;)LK0/e;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-virtual {v0, p1}, Lg1/e;->a(LK0/e;)V

    .line 122
    .line 123
    .line 124
    :goto_1
    return-void

    .line 125
    :pswitch_0
    iget-object p1, p0, LL0/l;->c:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast p1, LA/c;

    .line 128
    .line 129
    iget-object p1, p1, LA/c;->l:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast p1, Ljava/util/Map;

    .line 132
    .line 133
    iget-object v0, p0, LL0/l;->b:LS0/a;

    .line 134
    .line 135
    check-cast v0, Lcom/google/android/gms/common/api/internal/BasePendingResult;

    .line 136
    .line 137
    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    return-void

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

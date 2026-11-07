.class public final LL0/s;
.super LK0/l;
.source "SourceFile"


# instance fields
.field public final b:LK0/i;


# direct methods
.method public constructor <init>(LK0/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LL0/s;->b:LK0/i;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(LH0/g;)LH0/g;
    .locals 5

    .line 1
    iget-boolean v0, p1, Lcom/google/android/gms/common/api/internal/BasePendingResult;->k:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    sget-object v0, Lcom/google/android/gms/common/api/internal/BasePendingResult;->l:LL0/D;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v1, 0x0

    .line 22
    :cond_1
    :goto_0
    iput-boolean v1, p1, Lcom/google/android/gms/common/api/internal/BasePendingResult;->k:Z

    .line 23
    .line 24
    iget-object v0, p0, LL0/s;->b:LK0/i;

    .line 25
    .line 26
    iget-object v1, v0, LK0/i;->j:LL0/d;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    new-instance v2, LL0/z;

    .line 32
    .line 33
    invoke-direct {v2, p1}, LL0/z;-><init>(LH0/g;)V

    .line 34
    .line 35
    .line 36
    iget-object v3, v1, LL0/d;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 37
    .line 38
    new-instance v4, LL0/x;

    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    invoke-direct {v4, v2, v3, v0}, LL0/x;-><init>(LL0/C;ILK0/i;)V

    .line 45
    .line 46
    .line 47
    iget-object v0, v1, LL0/d;->m:LZ0/d;

    .line 48
    .line 49
    const/4 v1, 0x4

    .line 50
    invoke-virtual {v0, v1, v4}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 55
    .line 56
    .line 57
    return-object p1
.end method

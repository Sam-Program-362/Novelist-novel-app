.class public final LL0/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM0/b;


# instance fields
.field public final a:LK0/c;

.field public final b:LL0/a;

.field public c:LM0/f;

.field public d:Ljava/util/Set;

.field public e:Z

.field public final synthetic f:LL0/d;


# direct methods
.method public constructor <init>(LL0/d;LK0/c;LL0/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LL0/r;->f:LL0/d;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, LL0/r;->c:LM0/f;

    .line 8
    .line 9
    iput-object p1, p0, LL0/r;->d:Ljava/util/Set;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    iput-boolean p1, p0, LL0/r;->e:Z

    .line 13
    .line 14
    iput-object p2, p0, LL0/r;->a:LK0/c;

    .line 15
    .line 16
    iput-object p3, p0, LL0/r;->b:LL0/a;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(LJ0/a;)V
    .locals 4

    .line 1
    iget-object v0, p0, LL0/r;->f:LL0/d;

    .line 2
    .line 3
    iget-object v0, v0, LL0/d;->m:LZ0/d;

    .line 4
    .line 5
    new-instance v1, LA/a;

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-direct {v1, p0, p1, v2, v3}, LA/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final b(LJ0/a;)V
    .locals 2

    .line 1
    iget-object v0, p0, LL0/r;->f:LL0/d;

    .line 2
    .line 3
    iget-object v0, v0, LL0/d;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    iget-object v1, p0, LL0/r;->b:LL0/a;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, LL0/p;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, p1}, LL0/p;->p(LJ0/a;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

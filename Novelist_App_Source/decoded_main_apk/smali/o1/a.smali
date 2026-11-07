.class public final Lo1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/b;
.implements Lz1/a;


# instance fields
.field public k:LM1/O;

.field public l:Lo1/b;

.field public m:LB1/s;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final onAttachedToActivity(Lz1/b;)V
    .locals 2

    .line 1
    const-string v0, "binding"

    .line 2
    .line 3
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lo1/a;->l:Lo1/b;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    check-cast p1, Lk/u0;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lk/u0;->a(LC1/o;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lo1/a;->k:LM1/O;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object p1, p1, Lk/u0;->a:Landroid/content/Context;

    .line 21
    .line 22
    check-cast p1, Landroid/app/Activity;

    .line 23
    .line 24
    iput-object p1, v0, LM1/O;->b:Ljava/lang/Object;

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    const-string p1, "share"

    .line 28
    .line 29
    invoke-static {p1}, La2/h;->g(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v1

    .line 33
    :cond_1
    const-string p1, "manager"

    .line 34
    .line 35
    invoke-static {p1}, La2/h;->g(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v1
.end method

.method public final onAttachedToEngine(Ly1/a;)V
    .locals 3

    .line 1
    const-string v0, "binding"

    .line 2
    .line 3
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LB1/s;

    .line 7
    .line 8
    iget-object v1, p1, Ly1/a;->c:LC1/f;

    .line 9
    .line 10
    const-string v2, "dev.fluttercommunity.plus/share"

    .line 11
    .line 12
    invoke-direct {v0, v1, v2}, LB1/s;-><init>(LC1/f;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lo1/a;->m:LB1/s;

    .line 16
    .line 17
    new-instance v0, Lo1/b;

    .line 18
    .line 19
    iget-object p1, p1, Ly1/a;->a:Landroid/content/Context;

    .line 20
    .line 21
    const-string v1, "getApplicationContext(...)"

    .line 22
    .line 23
    invoke-static {p1, v1}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    invoke-direct {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 33
    .line 34
    .line 35
    iput-object v1, v0, Lo1/b;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 36
    .line 37
    iput-object v0, p0, Lo1/a;->l:Lo1/b;

    .line 38
    .line 39
    new-instance v1, LM1/O;

    .line 40
    .line 41
    invoke-direct {v1, p1, v0}, LM1/O;-><init>(Landroid/content/Context;Lo1/b;)V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, Lo1/a;->k:LM1/O;

    .line 45
    .line 46
    new-instance p1, Lb1/Q;

    .line 47
    .line 48
    iget-object v0, p0, Lo1/a;->l:Lo1/b;

    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    invoke-direct {p1, v1, v0}, Lb1/Q;-><init>(LM1/O;Lo1/b;)V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Lo1/a;->m:LB1/s;

    .line 57
    .line 58
    if-eqz v0, :cond_0

    .line 59
    .line 60
    invoke-virtual {v0, p1}, LB1/s;->z(LC1/m;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_0
    const-string p1, "methodChannel"

    .line 65
    .line 66
    invoke-static {p1}, La2/h;->g(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v2

    .line 70
    :cond_1
    const-string p1, "manager"

    .line 71
    .line 72
    invoke-static {p1}, La2/h;->g(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v2
.end method

.method public final onDetachedFromActivity()V
    .locals 2

    .line 1
    iget-object v0, p0, Lo1/a;->k:LM1/O;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-object v1, v0, LM1/O;->b:Ljava/lang/Object;

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const-string v0, "share"

    .line 10
    .line 11
    invoke-static {v0}, La2/h;->g(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    throw v1
.end method

.method public final onDetachedFromActivityForConfigChanges()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lo1/a;->onDetachedFromActivity()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onDetachedFromEngine(Ly1/a;)V
    .locals 1

    .line 1
    const-string v0, "binding"

    .line 2
    .line 3
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lo1/a;->m:LB1/s;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1, v0}, LB1/s;->z(LC1/m;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const-string p1, "methodChannel"

    .line 16
    .line 17
    invoke-static {p1}, La2/h;->g(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw v0
.end method

.method public final onReattachedToActivityForConfigChanges(Lz1/b;)V
    .locals 1

    .line 1
    const-string v0, "binding"

    .line 2
    .line 3
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lo1/a;->onAttachedToActivity(Lz1/b;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

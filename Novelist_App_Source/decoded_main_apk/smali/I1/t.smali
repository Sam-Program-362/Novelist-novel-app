.class public LI1/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/b;
.implements Lz1/a;


# instance fields
.field public k:LI1/s;

.field public l:LC1/f;

.field public m:Lz1/b;


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
    .locals 1

    .line 1
    iput-object p1, p0, LI1/t;->m:Lz1/b;

    .line 2
    .line 3
    iget-object v0, p0, LI1/t;->k:LI1/s;

    .line 4
    .line 5
    check-cast p1, Lk/u0;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lk/u0;->a(LC1/o;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, LI1/t;->k:LI1/s;

    .line 11
    .line 12
    iget-object p1, p1, Lk/u0;->a:Landroid/content/Context;

    .line 13
    .line 14
    check-cast p1, Landroid/app/Activity;

    .line 15
    .line 16
    iput-object p1, v0, LI1/s;->o:Landroid/app/Activity;

    .line 17
    .line 18
    return-void
.end method

.method public final onAttachedToEngine(Ly1/a;)V
    .locals 6

    .line 1
    iget-object v0, p1, Ly1/a;->c:LC1/f;

    .line 2
    .line 3
    iget-object p1, p1, Ly1/a;->a:Landroid/content/Context;

    .line 4
    .line 5
    new-instance v1, LI1/s;

    .line 6
    .line 7
    new-instance v2, LD/c;

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    invoke-direct {v2, v3}, LD/c;-><init>(I)V

    .line 11
    .line 12
    .line 13
    new-instance v3, LD/c;

    .line 14
    .line 15
    const/4 v4, 0x3

    .line 16
    invoke-direct {v3, v4}, LD/c;-><init>(I)V

    .line 17
    .line 18
    .line 19
    new-instance v4, LD/c;

    .line 20
    .line 21
    const/4 v5, 0x4

    .line 22
    invoke-direct {v4, v5}, LD/c;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-direct {v1, p1, v2, v3, v4}, LI1/s;-><init>(Landroid/content/Context;LD/c;LD/c;LD/c;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, LI1/t;->l:LC1/f;

    .line 29
    .line 30
    iput-object v1, p0, LI1/t;->k:LI1/s;

    .line 31
    .line 32
    sget-object p1, LI1/o;->b:LI1/n;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v1}, LI1/n;->b(LC1/f;LI1/s;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final onDetachedFromActivity()V
    .locals 2

    .line 1
    iget-object v0, p0, LI1/t;->m:Lz1/b;

    .line 2
    .line 3
    iget-object v1, p0, LI1/t;->k:LI1/s;

    .line 4
    .line 5
    check-cast v0, Lk/u0;

    .line 6
    .line 7
    iget-object v0, v0, Lk/u0;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/util/HashSet;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, LI1/t;->k:LI1/s;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    iput-object v1, v0, LI1/s;->o:Landroid/app/Activity;

    .line 18
    .line 19
    iput-object v1, p0, LI1/t;->m:Lz1/b;

    .line 20
    .line 21
    return-void
.end method

.method public final onDetachedFromActivityForConfigChanges()V
    .locals 2

    .line 1
    iget-object v0, p0, LI1/t;->m:Lz1/b;

    .line 2
    .line 3
    iget-object v1, p0, LI1/t;->k:LI1/s;

    .line 4
    .line 5
    check-cast v0, Lk/u0;

    .line 6
    .line 7
    iget-object v0, v0, Lk/u0;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/util/HashSet;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, LI1/t;->k:LI1/s;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    iput-object v1, v0, LI1/s;->o:Landroid/app/Activity;

    .line 18
    .line 19
    iput-object v1, p0, LI1/t;->m:Lz1/b;

    .line 20
    .line 21
    return-void
.end method

.method public final onDetachedFromEngine(Ly1/a;)V
    .locals 2

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, LI1/t;->k:LI1/s;

    .line 3
    .line 4
    iget-object v0, p0, LI1/t;->l:LC1/f;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    sget-object v1, LI1/o;->b:LI1/n;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {v0, p1}, LI1/n;->b(LC1/f;LI1/s;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, LI1/t;->l:LC1/f;

    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final onReattachedToActivityForConfigChanges(Lz1/b;)V
    .locals 1

    .line 1
    iput-object p1, p0, LI1/t;->m:Lz1/b;

    .line 2
    .line 3
    iget-object v0, p0, LI1/t;->k:LI1/s;

    .line 4
    .line 5
    check-cast p1, Lk/u0;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lk/u0;->a(LC1/o;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, LI1/t;->k:LI1/s;

    .line 11
    .line 12
    iget-object p1, p1, Lk/u0;->a:Landroid/content/Context;

    .line 13
    .line 14
    check-cast p1, Landroid/app/Activity;

    .line 15
    .line 16
    iput-object p1, v0, LI1/s;->o:Landroid/app/Activity;

    .line 17
    .line 18
    return-void
.end method

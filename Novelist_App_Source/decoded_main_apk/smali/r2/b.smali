.class public Lr2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/b;


# instance fields
.field public k:LB1/s;

.field public l:LA0/j;

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
.method public final onAttachedToEngine(Ly1/a;)V
    .locals 3

    .line 1
    iget-object v0, p1, Ly1/a;->a:Landroid/content/Context;

    .line 2
    .line 3
    new-instance v1, LB1/s;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object v0, v1, LB1/s;->k:Ljava/lang/Object;

    .line 9
    .line 10
    const-string v2, "clipboard"

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Landroid/content/ClipboardManager;

    .line 17
    .line 18
    iput-object v0, v1, LB1/s;->l:Ljava/lang/Object;

    .line 19
    .line 20
    iput-object v1, p0, Lr2/b;->m:LB1/s;

    .line 21
    .line 22
    new-instance v0, LB1/s;

    .line 23
    .line 24
    iget-object p1, p1, Ly1/a;->c:LC1/f;

    .line 25
    .line 26
    const-string v1, "net.cubiclab.clipboard/methods"

    .line 27
    .line 28
    invoke-direct {v0, p1, v1}, LB1/s;-><init>(LC1/f;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lr2/b;->k:LB1/s;

    .line 32
    .line 33
    iget-object v1, p0, Lr2/b;->m:LB1/s;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, LB1/s;->z(LC1/m;)V

    .line 36
    .line 37
    .line 38
    new-instance v0, LA0/j;

    .line 39
    .line 40
    const-string v1, "net.cubiclab.clipboard/events"

    .line 41
    .line 42
    invoke-direct {v0, p1, v1}, LA0/j;-><init>(LC1/f;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, Lr2/b;->l:LA0/j;

    .line 46
    .line 47
    iget-object p1, p0, Lr2/b;->m:LB1/s;

    .line 48
    .line 49
    invoke-virtual {v0, p1}, LA0/j;->L(LC1/h;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final onDetachedFromEngine(Ly1/a;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lr2/b;->k:LB1/s;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, v0}, LB1/s;->z(LC1/m;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lr2/b;->l:LA0/j;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, LA0/j;->L(LC1/h;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lr2/b;->m:LB1/s;

    .line 13
    .line 14
    return-void
.end method

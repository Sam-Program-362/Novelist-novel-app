.class public Lp1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/b;


# instance fields
.field public k:LB1/s;


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
    .locals 2

    .line 1
    new-instance v0, LB1/s;

    .line 2
    .line 3
    iget-object p1, p1, Ly1/a;->c:LC1/f;

    .line 4
    .line 5
    const-string v1, "sqlite3_flutter_libs"

    .line 6
    .line 7
    invoke-direct {v0, p1, v1}, LB1/s;-><init>(LC1/f;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lp1/a;->k:LB1/s;

    .line 11
    .line 12
    new-instance p1, LM1/A;

    .line 13
    .line 14
    const/16 v1, 0x1c

    .line 15
    .line 16
    invoke-direct {p1, v1}, LM1/A;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, LB1/s;->z(LC1/m;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final onDetachedFromEngine(Ly1/a;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lp1/a;->k:LB1/s;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p1, v0}, LB1/s;->z(LC1/m;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lp1/a;->k:LB1/s;

    .line 10
    .line 11
    :cond_0
    return-void
.end method

.class public Ln2/q;
.super Li2/a;
.source "SourceFile"

# interfaces
.implements LT1/d;


# instance fields
.field public final n:LR1/c;


# direct methods
.method public constructor <init>(LR1/c;LR1/h;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p2, v0}, Li2/a;-><init>(LR1/h;Z)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Ln2/q;->n:LR1/c;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final E()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final c()LT1/d;
    .locals 2

    .line 1
    iget-object v0, p0, Ln2/q;->n:LR1/c;

    .line 2
    .line 3
    instance-of v1, v0, LT1/d;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, LT1/d;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public m(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ln2/q;->n:LR1/c;

    .line 2
    .line 3
    invoke-static {v0}, LH2/h;->s(LR1/c;)LR1/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1}, Li2/u;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {v0, p1}, Ln2/a;->h(LR1/c;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public n(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ln2/q;->n:LR1/c;

    .line 2
    .line 3
    invoke-static {p1}, Li2/u;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, LR1/c;->resumeWith(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

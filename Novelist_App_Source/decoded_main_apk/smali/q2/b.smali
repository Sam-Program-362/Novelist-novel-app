.class public final Lq2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li2/e;
.implements Li2/i0;


# instance fields
.field public final k:Li2/g;

.field public final synthetic l:Lq2/c;


# direct methods
.method public constructor <init>(Lq2/c;Li2/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq2/b;->l:Lq2/c;

    .line 5
    .line 6
    iput-object p2, p0, Lq2/b;->k:Li2/g;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ln2/r;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq2/b;->k:Li2/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Li2/g;->a(Ln2/r;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final getContext()LR1/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lq2/b;->k:Li2/g;

    .line 2
    .line 3
    iget-object v0, v0, Li2/g;->o:LR1/h;

    .line 4
    .line 5
    return-object v0
.end method

.method public final k(Ljava/lang/Object;LZ1/q;)LB1/g;
    .locals 2

    .line 1
    check-cast p1, LO1/g;

    .line 2
    .line 3
    new-instance p2, Li2/f;

    .line 4
    .line 5
    iget-object v0, p0, Lq2/b;->l:Lq2/c;

    .line 6
    .line 7
    invoke-direct {p2, v0, p0}, Li2/f;-><init>(Lq2/c;Lq2/b;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lq2/b;->k:Li2/g;

    .line 11
    .line 12
    invoke-virtual {v1, p1, p2}, Li2/g;->k(Ljava/lang/Object;LZ1/q;)LB1/g;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    sget-object p2, Lq2/c;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-object p1
.end method

.method public final l(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq2/b;->k:Li2/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Li2/g;->l(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq2/b;->k:Li2/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Li2/g;->resumeWith(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

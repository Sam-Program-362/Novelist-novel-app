.class public final LK1/l;
.super LT1/h;
.source "SourceFile"

# interfaces
.implements LZ1/p;


# instance fields
.field public o:I

.field public final synthetic p:LK1/L;

.field public final synthetic q:Ljava/util/List;


# direct methods
.method public constructor <init>(LK1/L;Ljava/util/List;LR1/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK1/l;->p:LK1/L;

    .line 2
    .line 3
    iput-object p2, p0, LK1/l;->q:Ljava/util/List;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, LT1/h;-><init>(ILR1/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Li2/s;

    .line 2
    .line 3
    check-cast p2, LR1/c;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, LK1/l;->i(LR1/c;Ljava/lang/Object;)LR1/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LK1/l;

    .line 10
    .line 11
    sget-object p2, LO1/g;->a:LO1/g;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LK1/l;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final i(LR1/c;Ljava/lang/Object;)LR1/c;
    .locals 2

    .line 1
    new-instance p2, LK1/l;

    .line 2
    .line 3
    iget-object v0, p0, LK1/l;->p:LK1/L;

    .line 4
    .line 5
    iget-object v1, p0, LK1/l;->q:Ljava/util/List;

    .line 6
    .line 7
    invoke-direct {p2, v0, v1, p1}, LK1/l;-><init>(LK1/L;Ljava/util/List;LR1/c;)V

    .line 8
    .line 9
    .line 10
    return-object p2
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LK1/l;->o:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1

    .line 20
    :cond_1
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iput v1, p0, LK1/l;->o:I

    .line 24
    .line 25
    iget-object p1, p0, LK1/l;->p:LK1/L;

    .line 26
    .line 27
    iget-object v0, p0, LK1/l;->q:Ljava/util/List;

    .line 28
    .line 29
    invoke-static {p1, v0, p0}, LK1/L;->k(LK1/L;Ljava/util/List;LT1/c;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    sget-object v0, LS1/a;->k:LS1/a;

    .line 34
    .line 35
    if-ne p1, v0, :cond_2

    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_2
    return-object p1
.end method

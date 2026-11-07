.class public final LV/f;
.super LT1/h;
.source "SourceFile"

# interfaces
.implements LZ1/l;


# instance fields
.field public o:I


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, LR1/c;

    .line 2
    .line 3
    new-instance v0, LV/f;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-direct {v0, v1, p1}, LT1/h;-><init>(ILR1/c;)V

    .line 7
    .line 8
    .line 9
    sget-object p1, LO1/g;->a:LO1/g;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, LV/f;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-object p1
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LV/f;->o:I

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
    sget-object p1, LO1/g;->a:LO1/g;

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_1
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iput v1, p0, LV/f;->o:I

    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    throw p1
.end method

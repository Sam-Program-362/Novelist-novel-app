.class public final LV/h0;
.super LT1/h;
.source "SourceFile"

# interfaces
.implements LZ1/p;


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ll2/e;

    .line 2
    .line 3
    check-cast p2, LR1/c;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, LV/h0;->i(LR1/c;Ljava/lang/Object;)LR1/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LV/h0;

    .line 10
    .line 11
    sget-object p2, LO1/g;->a:LO1/g;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LV/h0;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final i(LR1/c;Ljava/lang/Object;)LR1/c;
    .locals 1

    .line 1
    new-instance p2, LV/h0;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    invoke-direct {p2, v0, p1}, LT1/h;-><init>(ILR1/c;)V

    .line 5
    .line 6
    .line 7
    return-object p2
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    sget-object p1, LO1/g;->a:LO1/g;

    .line 5
    .line 6
    return-object p1
.end method

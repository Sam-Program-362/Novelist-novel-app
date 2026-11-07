.class public final Lv0/a;
.super LT1/h;
.source "SourceFile"

# interfaces
.implements LZ1/p;


# instance fields
.field public o:I

.field public final synthetic p:Ll2/d;

.field public final synthetic q:LC/a;


# direct methods
.method public constructor <init>(Ll2/d;LC/a;LR1/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lv0/a;->p:Ll2/d;

    .line 2
    .line 3
    iput-object p2, p0, Lv0/a;->q:LC/a;

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
    invoke-virtual {p0, p2, p1}, Lv0/a;->i(LR1/c;Ljava/lang/Object;)LR1/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lv0/a;

    .line 10
    .line 11
    sget-object p2, LO1/g;->a:LO1/g;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lv0/a;->m(Ljava/lang/Object;)Ljava/lang/Object;

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
    new-instance p2, Lv0/a;

    .line 2
    .line 3
    iget-object v0, p0, Lv0/a;->p:Ll2/d;

    .line 4
    .line 5
    iget-object v1, p0, Lv0/a;->q:LC/a;

    .line 6
    .line 7
    invoke-direct {p2, v0, v1, p1}, Lv0/a;-><init>(Ll2/d;LC/a;LR1/c;)V

    .line 8
    .line 9
    .line 10
    return-object p2
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lv0/a;->o:I

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
    goto :goto_0

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
    new-instance p1, LV/x;

    .line 24
    .line 25
    iget-object v0, p0, Lv0/a;->q:LC/a;

    .line 26
    .line 27
    const/4 v2, 0x2

    .line 28
    invoke-direct {p1, v0, v2}, LV/x;-><init>(Ljava/lang/Object;I)V

    .line 29
    .line 30
    .line 31
    iput v1, p0, Lv0/a;->o:I

    .line 32
    .line 33
    iget-object v0, p0, Lv0/a;->p:Ll2/d;

    .line 34
    .line 35
    invoke-interface {v0, p1, p0}, Ll2/d;->h(Ll2/e;LR1/c;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    sget-object v0, LS1/a;->k:LS1/a;

    .line 40
    .line 41
    if-ne p1, v0, :cond_2

    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_2
    :goto_0
    sget-object p1, LO1/g;->a:LO1/g;

    .line 45
    .line 46
    return-object p1
.end method

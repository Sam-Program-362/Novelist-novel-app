.class public final LV/u;
.super LT1/h;
.source "SourceFile"

# interfaces
.implements LZ1/l;


# instance fields
.field public o:I

.field public final synthetic p:LV/F;


# direct methods
.method public constructor <init>(LV/F;LR1/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV/u;->p:LV/F;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1, p2}, LT1/h;-><init>(ILR1/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, LR1/c;

    .line 2
    .line 3
    new-instance v0, LV/u;

    .line 4
    .line 5
    iget-object v1, p0, LV/u;->p:LV/F;

    .line 6
    .line 7
    invoke-direct {v0, v1, p1}, LV/u;-><init>(LV/F;LR1/c;)V

    .line 8
    .line 9
    .line 10
    sget-object p1, LO1/g;->a:LO1/g;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, LV/u;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LV/u;->o:I

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
    iput v1, p0, LV/u;->o:I

    .line 24
    .line 25
    iget-object p1, p0, LV/u;->p:LV/F;

    .line 26
    .line 27
    invoke-virtual {p1, p0}, LV/F;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    sget-object v0, LS1/a;->k:LS1/a;

    .line 32
    .line 33
    if-ne p1, v0, :cond_2

    .line 34
    .line 35
    return-object v0

    .line 36
    :cond_2
    return-object p1
.end method

.class public final LV/p;
.super LT1/h;
.source "SourceFile"

# interfaces
.implements LZ1/p;


# instance fields
.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:LV/j0;


# direct methods
.method public constructor <init>(LV/j0;LR1/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV/p;->p:LV/j0;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, LT1/h;-><init>(ILR1/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LV/j0;

    .line 2
    .line 3
    check-cast p2, LR1/c;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, LV/p;->i(LR1/c;Ljava/lang/Object;)LR1/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LV/p;

    .line 10
    .line 11
    sget-object p2, LO1/g;->a:LO1/g;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LV/p;->m(Ljava/lang/Object;)Ljava/lang/Object;

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
    new-instance v0, LV/p;

    .line 2
    .line 3
    iget-object v1, p0, LV/p;->p:LV/j0;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, LV/p;-><init>(LV/j0;LR1/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, v0, LV/p;->o:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, LV/p;->o:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p1, LV/j0;

    .line 7
    .line 8
    instance-of v0, p1, LV/c;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget p1, p1, LV/j0;->a:I

    .line 13
    .line 14
    iget-object v0, p0, LV/p;->p:LV/j0;

    .line 15
    .line 16
    iget v0, v0, LV/j0;->a:I

    .line 17
    .line 18
    if-gt p1, v0, :cond_0

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1
.end method

.class public final LK1/F;
.super LT1/h;
.source "SourceFile"

# interfaces
.implements LZ1/p;


# instance fields
.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:LY/d;

.field public final synthetic q:D


# direct methods
.method public constructor <init>(LY/d;DLR1/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK1/F;->p:LY/d;

    .line 2
    .line 3
    iput-wide p2, p0, LK1/F;->q:D

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p4}, LT1/h;-><init>(ILR1/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY/b;

    .line 2
    .line 3
    check-cast p2, LR1/c;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, LK1/F;->i(LR1/c;Ljava/lang/Object;)LR1/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LK1/F;

    .line 10
    .line 11
    sget-object p2, LO1/g;->a:LO1/g;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LK1/F;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final i(LR1/c;Ljava/lang/Object;)LR1/c;
    .locals 4

    .line 1
    new-instance v0, LK1/F;

    .line 2
    .line 3
    iget-object v1, p0, LK1/F;->p:LY/d;

    .line 4
    .line 5
    iget-wide v2, p0, LK1/F;->q:D

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, v3, p1}, LK1/F;-><init>(LY/d;DLR1/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, v0, LK1/F;->o:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LK1/F;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LY/b;

    .line 4
    .line 5
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    new-instance p1, Ljava/lang/Double;

    .line 9
    .line 10
    iget-wide v1, p0, LK1/F;->q:D

    .line 11
    .line 12
    invoke-direct {p1, v1, v2}, Ljava/lang/Double;-><init>(D)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, LK1/F;->p:LY/d;

    .line 16
    .line 17
    invoke-virtual {v0, v1, p1}, LY/b;->d(LY/d;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    sget-object p1, LO1/g;->a:LO1/g;

    .line 21
    .line 22
    return-object p1
.end method

.class public final LK1/C;
.super LT1/h;
.source "SourceFile"

# interfaces
.implements LZ1/p;


# instance fields
.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:LY/d;

.field public final synthetic q:Z


# direct methods
.method public constructor <init>(LY/d;ZLR1/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK1/C;->p:LY/d;

    .line 2
    .line 3
    iput-boolean p2, p0, LK1/C;->q:Z

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
    check-cast p1, LY/b;

    .line 2
    .line 3
    check-cast p2, LR1/c;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, LK1/C;->i(LR1/c;Ljava/lang/Object;)LR1/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LK1/C;

    .line 10
    .line 11
    sget-object p2, LO1/g;->a:LO1/g;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LK1/C;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final i(LR1/c;Ljava/lang/Object;)LR1/c;
    .locals 3

    .line 1
    new-instance v0, LK1/C;

    .line 2
    .line 3
    iget-object v1, p0, LK1/C;->p:LY/d;

    .line 4
    .line 5
    iget-boolean v2, p0, LK1/C;->q:Z

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p1}, LK1/C;-><init>(LY/d;ZLR1/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, v0, LK1/C;->o:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LK1/C;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LY/b;

    .line 4
    .line 5
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-boolean p1, p0, LK1/C;->q:Z

    .line 9
    .line 10
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object v1, p0, LK1/C;->p:LY/d;

    .line 15
    .line 16
    invoke-virtual {v0, v1, p1}, LY/b;->d(LY/d;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    sget-object p1, LO1/g;->a:LO1/g;

    .line 20
    .line 21
    return-object p1
.end method

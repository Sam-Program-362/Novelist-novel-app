.class public final LV/J;
.super La2/i;
.source "SourceFile"

# interfaces
.implements LZ1/l;


# instance fields
.field public final synthetic l:LV/N;


# direct methods
.method public constructor <init>(LV/N;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV/J;->l:LV/N;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, La2/i;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    iget-object v0, p0, LV/J;->l:LV/N;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object v1, v0, LV/N;->r:LB1/a;

    .line 8
    .line 9
    new-instance v2, LV/Z;

    .line 10
    .line 11
    invoke-direct {v2, p1}, LV/Z;-><init>(Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2}, LB1/a;->m(LV/j0;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object p1, v0, LV/N;->t:LO1/e;

    .line 18
    .line 19
    iget-object p1, p1, LO1/e;->l:Ljava/lang/Object;

    .line 20
    .line 21
    sget-object v1, LO1/f;->a:LO1/f;

    .line 22
    .line 23
    if-eq p1, v1, :cond_1

    .line 24
    .line 25
    iget-object p1, v0, LV/N;->t:LO1/e;

    .line 26
    .line 27
    invoke-virtual {p1}, LO1/e;->a()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, LV/W;

    .line 32
    .line 33
    invoke-virtual {p1}, LV/W;->close()V

    .line 34
    .line 35
    .line 36
    :cond_1
    sget-object p1, LO1/g;->a:LO1/g;

    .line 37
    .line 38
    return-object p1
.end method

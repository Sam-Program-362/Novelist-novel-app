.class public final LK1/i;
.super LT1/h;
.source "SourceFile"

# interfaces
.implements LZ1/p;


# instance fields
.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;LR1/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK1/i;->p:Ljava/util/List;

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
    check-cast p1, LY/b;

    .line 2
    .line 3
    check-cast p2, LR1/c;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, LK1/i;->i(LR1/c;Ljava/lang/Object;)LR1/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LK1/i;

    .line 10
    .line 11
    sget-object p2, LO1/g;->a:LO1/g;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LK1/i;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final i(LR1/c;Ljava/lang/Object;)LR1/c;
    .locals 2

    .line 1
    new-instance v0, LK1/i;

    .line 2
    .line 3
    iget-object v1, p0, LK1/i;->p:Ljava/util/List;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, LK1/i;-><init>(Ljava/util/List;LR1/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, v0, LK1/i;->o:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LK1/i;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LY/b;

    .line 4
    .line 5
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, LK1/i;->p:Ljava/util/List;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ljava/lang/String;

    .line 27
    .line 28
    const-string v2, "name"

    .line 29
    .line 30
    invoke-static {v1, v2}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    new-instance v2, LY/d;

    .line 34
    .line 35
    invoke-direct {v2, v1}, LY/d;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, LY/b;->b()V

    .line 39
    .line 40
    .line 41
    iget-object v1, v0, LY/b;->a:Ljava/util/LinkedHashMap;

    .line 42
    .line 43
    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {v0}, LY/b;->b()V

    .line 48
    .line 49
    .line 50
    iget-object p1, v0, LY/b;->a:Ljava/util/LinkedHashMap;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->clear()V

    .line 53
    .line 54
    .line 55
    :cond_1
    sget-object p1, LO1/g;->a:LO1/g;

    .line 56
    .line 57
    return-object p1
.end method

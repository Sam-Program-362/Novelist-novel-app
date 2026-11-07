.class public final Lb/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lb/p;

.field public b:Z

.field public c:LB1/s;

.field public final d:Lb0/z;

.field public e:Z


# direct methods
.method public constructor <init>(Lb0/z;Lb/p;)V
    .locals 1

    .line 1
    const-string v0, "onBackPressedCallback"

    .line 2
    .line 3
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p1, Lb0/z;->b:Z

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Lb/o;->a:Lb/p;

    .line 12
    .line 13
    iput-boolean v0, p0, Lb/o;->b:Z

    .line 14
    .line 15
    iput-object p1, p0, Lb/o;->d:Lb0/z;

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    iput-boolean p1, p0, Lb/o;->e:Z

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lb/o;->d:Lb0/z;

    .line 2
    .line 3
    iget-object v0, v0, Lb0/z;->d:Lb0/I;

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    invoke-static {v1}, Lb0/I;->J(I)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v2, "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager "

    .line 15
    .line 16
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v2, "FragmentManager"

    .line 27
    .line 28
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    :cond_0
    iget-object v1, v0, Lb0/I;->h:Lb0/a;

    .line 32
    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    iput-boolean v2, v1, Lb0/a;->q:Z

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Lb0/a;->d(Z)I

    .line 39
    .line 40
    .line 41
    const/4 v1, 0x1

    .line 42
    invoke-virtual {v0, v1}, Lb0/I;->A(Z)Z

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lb0/I;->D()V

    .line 46
    .line 47
    .line 48
    iget-object v1, v0, Lb0/I;->m:Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-nez v2, :cond_1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    new-instance v0, Ljava/lang/ClassCastException;

    .line 69
    .line 70
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 71
    .line 72
    .line 73
    throw v0

    .line 74
    :cond_2
    :goto_0
    const/4 v1, 0x0

    .line 75
    iput-object v1, v0, Lb0/I;->h:Lb0/a;

    .line 76
    .line 77
    return-void
.end method

.method public final b()V
    .locals 4

    .line 1
    iget-object v0, p0, Lb/o;->c:LB1/s;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v1, v0, LB1/s;->m:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/LinkedHashSet;

    .line 8
    .line 9
    invoke-interface {v1, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    iget-object v0, v0, LB1/s;->l:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lh0/e;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v1, v0, Lh0/e;->f:Lb/o;

    .line 23
    .line 24
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v2, 0x0

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    iget v1, v0, Lh0/e;->g:I

    .line 32
    .line 33
    const/4 v3, -0x1

    .line 34
    if-eq v1, v3, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {p0}, Lb/o;->a()V

    .line 38
    .line 39
    .line 40
    :goto_0
    iput-object v2, v0, Lh0/e;->f:Lb/o;

    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    iput v1, v0, Lh0/e;->g:I

    .line 44
    .line 45
    iput-object v2, v0, Lh0/e;->h:Lh0/d;

    .line 46
    .line 47
    :cond_1
    iget-object v1, v0, Lh0/e;->d:LP1/c;

    .line 48
    .line 49
    invoke-virtual {v1, p0}, LP1/c;->remove(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    iget-object v1, v0, Lh0/e;->e:LP1/c;

    .line 53
    .line 54
    invoke-virtual {v1, p0}, LP1/c;->remove(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    iput-object v2, p0, Lb/o;->c:LB1/s;

    .line 58
    .line 59
    invoke-virtual {v0}, Lh0/e;->b()V

    .line 60
    .line 61
    .line 62
    :cond_2
    return-void
.end method

.method public final c(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lb/o;->b:Z

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iput-boolean p1, p0, Lb/o;->b:Z

    .line 7
    .line 8
    iget-object p1, p0, Lb/o;->c:LB1/s;

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    iget-object p1, p1, LB1/s;->l:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, Lh0/e;

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1}, Lh0/e;->b()V

    .line 19
    .line 20
    .line 21
    :cond_1
    :goto_0
    return-void
.end method

.method public final d(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lb/o;->e:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lb/o;->d:Lb0/z;

    .line 6
    .line 7
    iget-boolean p1, p1, Lb0/z;->b:Z

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    :goto_0
    invoke-virtual {p0, p1}, Lb/o;->c(Z)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

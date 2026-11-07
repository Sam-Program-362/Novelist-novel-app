.class public LD/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:LD/h0;


# instance fields
.field public final a:LD/h0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x24

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, LD/S;

    .line 8
    .line 9
    invoke-direct {v0}, LD/S;-><init>()V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/16 v1, 0x23

    .line 14
    .line 15
    if-lt v0, v1, :cond_1

    .line 16
    .line 17
    new-instance v0, LD/Q;

    .line 18
    .line 19
    invoke-direct {v0}, LD/Q;-><init>()V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/16 v1, 0x22

    .line 24
    .line 25
    if-lt v0, v1, :cond_2

    .line 26
    .line 27
    new-instance v0, LD/P;

    .line 28
    .line 29
    invoke-direct {v0}, LD/P;-><init>()V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    const/16 v1, 0x1f

    .line 34
    .line 35
    if-lt v0, v1, :cond_3

    .line 36
    .line 37
    new-instance v0, LD/O;

    .line 38
    .line 39
    invoke-direct {v0}, LD/O;-><init>()V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    const/16 v1, 0x1e

    .line 44
    .line 45
    if-lt v0, v1, :cond_4

    .line 46
    .line 47
    new-instance v0, LD/N;

    .line 48
    .line 49
    invoke-direct {v0}, LD/N;-><init>()V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_4
    const/16 v1, 0x1d

    .line 54
    .line 55
    if-lt v0, v1, :cond_5

    .line 56
    .line 57
    new-instance v0, LD/M;

    .line 58
    .line 59
    invoke-direct {v0}, LD/M;-><init>()V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_5
    new-instance v0, LD/K;

    .line 64
    .line 65
    invoke-direct {v0}, LD/K;-><init>()V

    .line 66
    .line 67
    .line 68
    :goto_0
    invoke-virtual {v0}, LD/T;->b()LD/h0;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iget-object v0, v0, LD/h0;->a:LD/d0;

    .line 73
    .line 74
    invoke-virtual {v0}, LD/d0;->a()LD/h0;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iget-object v0, v0, LD/h0;->a:LD/d0;

    .line 79
    .line 80
    invoke-virtual {v0}, LD/d0;->b()LD/h0;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iget-object v0, v0, LD/h0;->a:LD/d0;

    .line 85
    .line 86
    invoke-virtual {v0}, LD/d0;->c()LD/h0;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    sput-object v0, LD/d0;->b:LD/h0;

    .line 91
    .line 92
    return-void
.end method

.method public constructor <init>(LD/h0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LD/d0;->a:LD/h0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()LD/h0;
    .locals 1

    .line 1
    iget-object v0, p0, LD/d0;->a:LD/h0;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()LD/h0;
    .locals 1

    .line 1
    iget-object v0, p0, LD/d0;->a:LD/h0;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()LD/h0;
    .locals 1

    .line 1
    iget-object v0, p0, LD/d0;->a:LD/h0;

    .line 2
    .line 3
    return-object v0
.end method

.method public d(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method public e(I)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Landroid/graphics/Rect;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, LD/d0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, LD/d0;

    .line 12
    .line 13
    invoke-virtual {p0}, LD/d0;->r()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {p1}, LD/d0;->r()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-ne v1, v3, :cond_2

    .line 22
    .line 23
    invoke-virtual {p0}, LD/d0;->q()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {p1}, LD/d0;->q()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-ne v1, v3, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0}, LD/d0;->l()Lw/b;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {p1}, LD/d0;->l()Lw/b;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    invoke-virtual {p0}, LD/d0;->j()Lw/b;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {p1}, LD/d0;->j()Lw/b;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_2

    .line 60
    .line 61
    invoke-virtual {p0}, LD/d0;->g()LD/g;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {p1}, LD/d0;->g()LD/g;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eqz p1, :cond_2

    .line 74
    .line 75
    return v0

    .line 76
    :cond_2
    return v2
.end method

.method public f(I)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Landroid/graphics/Rect;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public g()LD/g;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public h(I)Lw/b;
    .locals 0

    .line 1
    sget-object p1, Lw/b;->e:Lw/b;

    .line 2
    .line 3
    return-object p1
.end method

.method public hashCode()I
    .locals 5

    .line 1
    invoke-virtual {p0}, LD/d0;->r()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, LD/d0;->q()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p0}, LD/d0;->l()Lw/b;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {p0}, LD/d0;->j()Lw/b;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {p0}, LD/d0;->g()LD/g;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    filled-new-array {v0, v1, v2, v3, v4}, [Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    return v0
.end method

.method public i()Lw/b;
    .locals 1

    .line 1
    invoke-virtual {p0}, LD/d0;->l()Lw/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public j()Lw/b;
    .locals 1

    .line 1
    sget-object v0, Lw/b;->e:Lw/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public k()Lw/b;
    .locals 1

    .line 1
    invoke-virtual {p0}, LD/d0;->l()Lw/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public l()Lw/b;
    .locals 1

    .line 1
    sget-object v0, Lw/b;->e:Lw/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public m()Lw/b;
    .locals 1

    .line 1
    invoke-virtual {p0}, LD/d0;->l()Lw/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public n(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method public o()V
    .locals 0

    .line 1
    return-void
.end method

.method public p(IIII)LD/h0;
    .locals 0

    .line 1
    sget-object p1, LD/d0;->b:LD/h0;

    .line 2
    .line 3
    return-object p1
.end method

.method public q()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public r()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public s(I)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method

.method public t(LD/i;)V
    .locals 0

    .line 1
    return-void
.end method

.method public u([Lw/b;)V
    .locals 0

    .line 1
    return-void
.end method

.method public v(LD/h0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public w(Lw/b;)V
    .locals 0

    .line 1
    return-void
.end method

.method public x(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public y([[Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    return-void
.end method

.method public z([[Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    return-void
.end method

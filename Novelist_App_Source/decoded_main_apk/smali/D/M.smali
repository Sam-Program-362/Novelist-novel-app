.class public LD/M;
.super LD/T;
.source "SourceFile"


# instance fields
.field public final e:Landroid/view/WindowInsets$Builder;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, LD/T;-><init>()V

    .line 2
    invoke-static {}, LD/L;->f()Landroid/view/WindowInsets$Builder;

    move-result-object v0

    iput-object v0, p0, LD/M;->e:Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public constructor <init>(LD/h0;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, LD/T;-><init>(LD/h0;)V

    .line 4
    invoke-virtual {p1}, LD/h0;->b()Landroid/view/WindowInsets;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 5
    invoke-static {p1}, LD/L;->g(Landroid/view/WindowInsets;)Landroid/view/WindowInsets$Builder;

    move-result-object p1

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, LD/L;->f()Landroid/view/WindowInsets$Builder;

    move-result-object p1

    :goto_0
    iput-object p1, p0, LD/M;->e:Landroid/view/WindowInsets$Builder;

    return-void
.end method


# virtual methods
.method public b()LD/h0;
    .locals 4

    .line 1
    invoke-virtual {p0}, LD/T;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LD/M;->e:Landroid/view/WindowInsets$Builder;

    .line 5
    .line 6
    invoke-static {v0}, LD/L;->h(Landroid/view/WindowInsets$Builder;)Landroid/view/WindowInsets;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {v0, v1}, LD/h0;->c(Landroid/view/WindowInsets;Landroid/view/View;)LD/h0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v2, p0, LD/T;->b:[Lw/b;

    .line 16
    .line 17
    iget-object v3, v0, LD/h0;->a:LD/d0;

    .line 18
    .line 19
    invoke-virtual {v3, v2}, LD/d0;->u([Lw/b;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3, v1}, LD/d0;->t(LD/i;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, LD/T;->c:[[Landroid/graphics/Rect;

    .line 26
    .line 27
    invoke-virtual {v3, v1}, LD/d0;->y([[Landroid/graphics/Rect;)V

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, LD/T;->d:[[Landroid/graphics/Rect;

    .line 31
    .line 32
    invoke-virtual {v3, v1}, LD/d0;->z([[Landroid/graphics/Rect;)V

    .line 33
    .line 34
    .line 35
    return-object v0
.end method

.method public e(Lw/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, LD/M;->e:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-virtual {p1}, Lw/b;->d()Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {v0, p1}, LD/L;->C(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public f(Lw/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, LD/M;->e:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-virtual {p1}, Lw/b;->d()Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {v0, p1}, LD/L;->x(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public g(Lw/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, LD/M;->e:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-virtual {p1}, Lw/b;->d()Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {v0, p1}, LD/L;->A(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public h(Lw/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, LD/M;->e:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-virtual {p1}, Lw/b;->d()Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {v0, p1}, LD/L;->q(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public i(Lw/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, LD/M;->e:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-virtual {p1}, Lw/b;->d()Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {v0, p1}, LD/L;->D(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

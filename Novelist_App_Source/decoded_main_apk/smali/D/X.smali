.class public LD/X;
.super LD/W;
.source "SourceFile"


# instance fields
.field public s:Lw/b;

.field public t:Lw/b;

.field public u:Lw/b;


# direct methods
.method public constructor <init>(LD/h0;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LD/W;-><init>(LD/h0;Landroid/view/WindowInsets;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, LD/X;->s:Lw/b;

    .line 6
    .line 7
    iput-object p1, p0, LD/X;->t:Lw/b;

    .line 8
    .line 9
    iput-object p1, p0, LD/X;->u:Lw/b;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public i()Lw/b;
    .locals 1

    .line 1
    iget-object v0, p0, LD/X;->t:Lw/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LD/U;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, LD/L;->s(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lw/b;->c(Landroid/graphics/Insets;)Lw/b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, LD/X;->t:Lw/b;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, LD/X;->t:Lw/b;

    .line 18
    .line 19
    return-object v0
.end method

.method public k()Lw/b;
    .locals 1

    .line 1
    iget-object v0, p0, LD/X;->s:Lw/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LD/U;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, LD/L;->y(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lw/b;->c(Landroid/graphics/Insets;)Lw/b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, LD/X;->s:Lw/b;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, LD/X;->s:Lw/b;

    .line 18
    .line 19
    return-object v0
.end method

.method public m()Lw/b;
    .locals 1

    .line 1
    iget-object v0, p0, LD/X;->u:Lw/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LD/U;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, LD/L;->b(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lw/b;->c(Landroid/graphics/Insets;)Lw/b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, LD/X;->u:Lw/b;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, LD/X;->u:Lw/b;

    .line 18
    .line 19
    return-object v0
.end method

.method public p(IIII)LD/h0;
    .locals 1

    .line 1
    iget-object v0, p0, LD/U;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {v0, p1, p2, p3, p4}, LD/L;->i(Landroid/view/WindowInsets;IIII)Landroid/view/WindowInsets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 p2, 0x0

    .line 8
    invoke-static {p1, p2}, LD/h0;->c(Landroid/view/WindowInsets;Landroid/view/View;)LD/h0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public w(Lw/b;)V
    .locals 0

    .line 1
    return-void
.end method

.class public LD/Y;
.super LD/X;
.source "SourceFile"


# static fields
.field public static final v:LD/h0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, LB0/a;->e()Landroid/view/WindowInsets;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {v0, v1}, LD/h0;->c(Landroid/view/WindowInsets;Landroid/view/View;)LD/h0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, LD/Y;->v:LD/h0;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(LD/h0;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LD/X;-><init>(LD/h0;Landroid/view/WindowInsets;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public F(I)Lw/b;
    .locals 1

    .line 1
    iget-object v0, p0, LD/U;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {p1}, LD/e0;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-static {v0, p1}, LB0/a;->c(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Lw/b;->c(Landroid/graphics/Insets;)Lw/b;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final d(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method public h(I)Lw/b;
    .locals 1

    .line 1
    iget-object v0, p0, LD/U;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {p1}, LD/e0;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-static {v0, p1}, LB0/a;->s(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Lw/b;->c(Landroid/graphics/Insets;)Lw/b;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public s(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, LD/U;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {p1}, LD/e0;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-static {v0, p1}, LB0/a;->q(Landroid/view/WindowInsets;I)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

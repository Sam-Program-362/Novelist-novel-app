.class public LD/k0;
.super LE2/a;
.source "SourceFile"


# instance fields
.field public final e:Landroid/view/WindowInsetsController;

.field public final f:Landroid/view/Window;


# direct methods
.method public constructor <init>(Landroid/view/Window;)V
    .locals 1

    .line 1
    invoke-static {p1}, LB0/a;->h(Landroid/view/Window;)Landroid/view/WindowInsetsController;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, LD/k0;->e:Landroid/view/WindowInsetsController;

    .line 9
    .line 10
    iput-object p1, p0, LD/k0;->f:Landroid/view/Window;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public M(Z)V
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    invoke-virtual {p0, v0, v0, p1}, LD/k0;->c0(IIZ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public N(Z)V
    .locals 2

    .line 1
    const/16 v0, 0x2000

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1, p1}, LD/k0;->c0(IIZ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final c0(IIZ)V
    .locals 1

    .line 1
    iget-object v0, p0, LD/k0;->f:Landroid/view/Window;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p2}, Landroid/view/View;->getSystemUiVisibility()I

    .line 12
    .line 13
    .line 14
    move-result p3

    .line 15
    or-int/2addr p1, p3

    .line 16
    invoke-virtual {p2, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-virtual {p2}, Landroid/view/View;->getSystemUiVisibility()I

    .line 25
    .line 26
    .line 27
    move-result p3

    .line 28
    not-int p1, p1

    .line 29
    and-int/2addr p1, p3

    .line 30
    invoke-virtual {p2, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    if-eqz p3, :cond_2

    .line 35
    .line 36
    iget-object p1, p0, LD/k0;->e:Landroid/view/WindowInsetsController;

    .line 37
    .line 38
    invoke-static {p1, p2, p2}, LB0/a;->p(Landroid/view/WindowInsetsController;II)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    iget-object p1, p0, LD/k0;->e:Landroid/view/WindowInsetsController;

    .line 43
    .line 44
    invoke-static {p1, p2}, LB0/a;->o(Landroid/view/WindowInsetsController;I)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.class public final Lb/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Runnable;

.field public final b:LO1/e;


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb/t;->a:Ljava/lang/Runnable;

    .line 5
    .line 6
    new-instance p1, Lb/q;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {p1, p0, v0}, Lb/q;-><init>(Ljava/lang/Object;I)V

    .line 10
    .line 11
    .line 12
    new-instance v0, LO1/e;

    .line 13
    .line 14
    invoke-direct {v0, p1}, LO1/e;-><init>(LZ1/a;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lb/t;->b:LO1/e;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a()Lb/r;
    .locals 1

    .line 1
    iget-object v0, p0, Lb/t;->b:LO1/e;

    .line 2
    .line 3
    invoke-virtual {v0}, LO1/e;->a()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lb/r;

    .line 8
    .line 9
    return-object v0
.end method

.method public final b(Landroid/window/OnBackInvokedDispatcher;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lb/t;->a()Lb/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lb/r;->c:LB1/s;

    .line 6
    .line 7
    new-instance v1, Lh0/i;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v1, p1, v2}, Lh0/i;-><init>(Landroid/window/OnBackInvokedDispatcher;I)V

    .line 11
    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    invoke-virtual {v0, v1, v3}, LB1/s;->d(Lh0/i;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lb/t;->a()Lb/r;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v0, v0, Lb/r;->c:LB1/s;

    .line 22
    .line 23
    new-instance v1, Lh0/i;

    .line 24
    .line 25
    const v3, 0xf4240

    .line 26
    .line 27
    .line 28
    invoke-direct {v1, p1, v3}, Lh0/i;-><init>(Landroid/window/OnBackInvokedDispatcher;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, LB1/s;->d(Lh0/i;I)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

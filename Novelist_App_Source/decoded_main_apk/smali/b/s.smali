.class public final Lb/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/q;
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final synthetic k:Lb/o;

.field public final synthetic l:Landroidx/lifecycle/n;


# direct methods
.method public constructor <init>(Lb/o;Lb/t;Landroidx/lifecycle/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb/s;->k:Lb/o;

    .line 5
    .line 6
    iput-object p3, p0, Lb/s;->l:Landroidx/lifecycle/n;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lb/s;->l:Landroidx/lifecycle/n;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Landroidx/lifecycle/n;->b(Landroidx/lifecycle/r;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d(Landroidx/lifecycle/s;Landroidx/lifecycle/l;)V
    .locals 1

    .line 1
    sget-object p1, Landroidx/lifecycle/l;->ON_START:Landroidx/lifecycle/l;

    .line 2
    .line 3
    iget-object v0, p0, Lb/s;->k:Lb/o;

    .line 4
    .line 5
    if-ne p2, p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-virtual {v0, p1}, Lb/o;->d(Z)V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object p1, Landroidx/lifecycle/l;->ON_STOP:Landroidx/lifecycle/l;

    .line 13
    .line 14
    if-ne p2, p1, :cond_1

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    invoke-virtual {v0, p1}, Lb/o;->d(Z)V

    .line 18
    .line 19
    .line 20
    :cond_1
    :goto_0
    sget-object p1, Landroidx/lifecycle/l;->ON_DESTROY:Landroidx/lifecycle/l;

    .line 21
    .line 22
    if-ne p2, p1, :cond_2

    .line 23
    .line 24
    invoke-virtual {v0}, Lb/o;->b()V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lb/s;->l:Landroidx/lifecycle/n;

    .line 28
    .line 29
    invoke-virtual {p1, p0}, Landroidx/lifecycle/n;->b(Landroidx/lifecycle/r;)V

    .line 30
    .line 31
    .line 32
    :cond_2
    return-void
.end method

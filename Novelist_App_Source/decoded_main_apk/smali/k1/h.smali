.class public interface abstract Lk1/h;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract a()V
.end method

.method public abstract b(Lk1/f;)V
.end method

.method public c(Lk1/e;Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    new-instance v0, LH0/i;

    .line 6
    .line 7
    const/16 v1, 0x16

    .line 8
    .line 9
    invoke-direct {v0, p1, v1}, LH0/i;-><init>(Ljava/lang/Object;I)V

    .line 10
    .line 11
    .line 12
    move-object p1, v0

    .line 13
    :goto_0
    new-instance v0, Lk1/f;

    .line 14
    .line 15
    invoke-direct {v0, p1, p2}, Lk1/f;-><init>(LH0/i;Ljava/lang/Runnable;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p0, v0}, Lk1/h;->b(Lk1/f;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public abstract start()V
.end method

.class public final Lb0/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lb0/s;


# direct methods
.method public constructor <init>(Lb0/s;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb0/q;->a:Lb0/s;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lb0/q;->a:Lb0/s;

    .line 2
    .line 3
    iget-object v1, v0, Lb0/s;->Y:Lg1/h;

    .line 4
    .line 5
    invoke-virtual {v1}, Lg1/h;->b()V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Landroidx/lifecycle/L;->d(Lm0/e;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, Lb0/s;->l:Landroid/os/Bundle;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const-string v2, "registryState"

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v1, 0x0

    .line 23
    :goto_0
    iget-object v0, v0, Lb0/s;->Y:Lg1/h;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lg1/h;->c(Landroid/os/Bundle;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

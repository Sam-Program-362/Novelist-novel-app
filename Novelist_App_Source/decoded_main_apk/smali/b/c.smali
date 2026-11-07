.class public final synthetic Lb/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/q;


# instance fields
.field public final synthetic k:Lb/t;

.field public final synthetic l:Lb/k;


# direct methods
.method public synthetic constructor <init>(Lb/t;Lb/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb/c;->k:Lb/t;

    iput-object p2, p0, Lb/c;->l:Lb/k;

    return-void
.end method


# virtual methods
.method public final d(Landroidx/lifecycle/s;Landroidx/lifecycle/l;)V
    .locals 0

    .line 1
    sget-object p1, Landroidx/lifecycle/l;->ON_CREATE:Landroidx/lifecycle/l;

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lb/c;->l:Lb/k;

    .line 6
    .line 7
    invoke-static {p1}, LE/c;->l(Lb/k;)Landroid/window/OnBackInvokedDispatcher;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string p2, "getOnBackInvokedDispatcher(...)"

    .line 12
    .line 13
    invoke-static {p1, p2}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object p2, p0, Lb/c;->k:Lb/t;

    .line 17
    .line 18
    invoke-virtual {p2, p1}, Lb/t;->b(Landroid/window/OnBackInvokedDispatcher;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

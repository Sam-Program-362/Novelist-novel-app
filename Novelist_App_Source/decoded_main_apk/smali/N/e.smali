.class public final synthetic LN/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:I

.field public final synthetic l:LH/d;

.field public final synthetic m:LI/f;


# direct methods
.method public synthetic constructor <init>(LH/d;LI/f;I)V
    .locals 0

    .line 1
    iput p3, p0, LN/e;->k:I

    iput-object p1, p0, LN/e;->l:LH/d;

    iput-object p2, p0, LN/e;->m:LI/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, LN/e;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LN/e;->m:LI/f;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    new-instance v0, LI/e;

    .line 11
    .line 12
    const-string v1, "No provider data returned"

    .line 13
    .line 14
    invoke-direct {v0, v1}, LI/e;-><init>(Ljava/lang/CharSequence;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object v1, p0, LN/e;->l:LH/d;

    .line 18
    .line 19
    invoke-interface {v1, v0}, LH/d;->b(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    iget-object v0, p0, LN/e;->l:LH/d;

    .line 24
    .line 25
    iget-object v1, p0, LN/e;->m:LI/f;

    .line 26
    .line 27
    invoke-interface {v0, v1}, LH/d;->b(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

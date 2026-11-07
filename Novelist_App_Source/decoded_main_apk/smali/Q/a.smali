.class public final synthetic LQ/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:I

.field public final synthetic l:LQ/b;

.field public final synthetic m:LI/f;


# direct methods
.method public synthetic constructor <init>(LQ/b;LI/f;I)V
    .locals 0

    .line 1
    iput p3, p0, LQ/a;->k:I

    iput-object p1, p0, LQ/a;->l:LQ/b;

    iput-object p2, p0, LQ/a;->m:LI/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, LQ/a;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LQ/a;->m:LI/f;

    .line 7
    .line 8
    iget-object v1, p0, LQ/a;->l:LQ/b;

    .line 9
    .line 10
    invoke-virtual {v1}, LQ/b;->d()LH/d;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {v1, v0}, LH/d;->b(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object v0, p0, LQ/a;->m:LI/f;

    .line 19
    .line 20
    iget-object v1, p0, LQ/a;->l:LQ/b;

    .line 21
    .line 22
    invoke-virtual {v1}, LQ/b;->d()LH/d;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-interface {v1, v0}, LH/d;->b(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_1
    iget-object v0, p0, LQ/a;->m:LI/f;

    .line 31
    .line 32
    iget-object v1, p0, LQ/a;->l:LQ/b;

    .line 33
    .line 34
    invoke-virtual {v1}, LQ/b;->d()LH/d;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-interface {v1, v0}, LH/d;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

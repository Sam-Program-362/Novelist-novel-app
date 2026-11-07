.class public final synthetic LN/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ1/a;


# instance fields
.field public final synthetic k:I

.field public final synthetic l:Ljava/util/concurrent/Executor;

.field public final synthetic m:LH/d;

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Executor;LH/d;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, LN/a;->k:I

    iput-object p1, p0, LN/a;->l:Ljava/util/concurrent/Executor;

    iput-object p2, p0, LN/a;->m:LH/d;

    iput-object p3, p0, LN/a;->n:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LN/a;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LN/a;->n:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LI/f;

    .line 9
    .line 10
    new-instance v1, LN/e;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    iget-object v3, p0, LN/a;->m:LH/d;

    .line 14
    .line 15
    invoke-direct {v1, v3, v0, v2}, LN/e;-><init>(LH/d;LI/f;I)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, LN/a;->l:Ljava/util/concurrent/Executor;

    .line 19
    .line 20
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 21
    .line 22
    .line 23
    :goto_0
    sget-object v0, LO1/g;->a:LO1/g;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_0
    iget-object v0, p0, LN/a;->n:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, LH/l;

    .line 29
    .line 30
    new-instance v1, LM/c;

    .line 31
    .line 32
    const/4 v2, 0x4

    .line 33
    iget-object v3, p0, LN/a;->m:LH/d;

    .line 34
    .line 35
    invoke-direct {v1, v3, v0, v2}, LM/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, LN/a;->l:Ljava/util/concurrent/Executor;

    .line 39
    .line 40
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :pswitch_1
    new-instance v0, LM/c;

    .line 45
    .line 46
    const/4 v1, 0x3

    .line 47
    iget-object v2, p0, LN/a;->m:LH/d;

    .line 48
    .line 49
    iget-object v3, p0, LN/a;->n:Ljava/lang/Object;

    .line 50
    .line 51
    invoke-direct {v0, v2, v3, v1}, LM/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 52
    .line 53
    .line 54
    iget-object v1, p0, LN/a;->l:Ljava/util/concurrent/Executor;

    .line 55
    .line 56
    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

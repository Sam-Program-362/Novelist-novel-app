.class public final synthetic LN/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ1/a;


# instance fields
.field public final synthetic k:I

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, LN/b;->k:I

    iput-object p1, p0, LN/b;->l:Ljava/lang/Object;

    iput-object p2, p0, LN/b;->m:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, LN/b;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LN/b;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LQ/b;

    .line 9
    .line 10
    iget-object v1, p0, LN/b;->m:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, LH/l;

    .line 13
    .line 14
    invoke-virtual {v0}, LQ/b;->e()Ljava/util/concurrent/Executor;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    new-instance v3, LM/c;

    .line 19
    .line 20
    const/16 v4, 0xa

    .line 21
    .line 22
    invoke-direct {v3, v0, v1, v4}, LM/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 23
    .line 24
    .line 25
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    sget-object v0, LO1/g;->a:LO1/g;

    .line 29
    .line 30
    return-object v0

    .line 31
    :pswitch_0
    iget-object v0, p0, LN/b;->l:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, LO/d;

    .line 34
    .line 35
    iget-object v1, p0, LN/b;->m:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, LH/l;

    .line 38
    .line 39
    invoke-virtual {v0}, LO/d;->d()Ljava/util/concurrent/Executor;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    new-instance v3, LM/c;

    .line 44
    .line 45
    const/4 v4, 0x6

    .line 46
    invoke-direct {v3, v0, v1, v4}, LM/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 47
    .line 48
    .line 49
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :pswitch_1
    iget-object v0, p0, LN/b;->l:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Ljava/util/concurrent/Executor;

    .line 56
    .line 57
    iget-object v1, p0, LN/b;->m:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v1, LH/d;

    .line 60
    .line 61
    new-instance v2, LM/b;

    .line 62
    .line 63
    const/4 v3, 0x7

    .line 64
    invoke-direct {v2, v1, v3}, LM/b;-><init>(LH/d;I)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :pswitch_2
    iget-object v0, p0, LN/b;->l:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, LZ1/l;

    .line 74
    .line 75
    iget-object v1, p0, LN/b;->m:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v1, La2/o;

    .line 78
    .line 79
    iget-object v1, v1, La2/o;->k:Ljava/lang/Object;

    .line 80
    .line 81
    invoke-interface {v0, v1}, LZ1/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

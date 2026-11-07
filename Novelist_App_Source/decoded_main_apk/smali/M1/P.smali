.class public final synthetic LM1/P;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ1/l;


# instance fields
.field public final synthetic k:I

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LM1/P;->k:I

    iput-object p1, p0, LM1/P;->l:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lq2/c;Lq2/b;)V
    .locals 0

    .line 2
    const/4 p2, 0x4

    iput p2, p0, LM1/P;->k:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM1/P;->l:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LM1/P;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LM1/P;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lq2/c;

    .line 9
    .line 10
    check-cast p1, Ljava/lang/Throwable;

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    invoke-virtual {v0, p1}, Lq2/c;->e(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    sget-object p1, LO1/g;->a:LO1/g;

    .line 17
    .line 18
    return-object p1

    .line 19
    :pswitch_0
    iget-object v0, p0, LM1/P;->l:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, LI1/l;

    .line 22
    .line 23
    const-string v1, "it"

    .line 24
    .line 25
    invoke-static {p1, v1}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, LI1/l;->a()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1

    .line 33
    :pswitch_1
    iget-object v0, p0, LM1/P;->l:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, LQ/b;

    .line 36
    .line 37
    check-cast p1, LI/f;

    .line 38
    .line 39
    const-string v1, "e"

    .line 40
    .line 41
    invoke-static {p1, v1}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, LQ/b;->e()Ljava/util/concurrent/Executor;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    new-instance v2, LQ/a;

    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    invoke-direct {v2, v0, p1, v3}, LQ/a;-><init>(LQ/b;LI/f;I)V

    .line 52
    .line 53
    .line 54
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 55
    .line 56
    .line 57
    sget-object p1, LO1/g;->a:LO1/g;

    .line 58
    .line 59
    return-object p1

    .line 60
    :pswitch_2
    iget-object v0, p0, LM1/P;->l:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v0, LO/d;

    .line 63
    .line 64
    check-cast p1, LI/f;

    .line 65
    .line 66
    const-string v1, "e"

    .line 67
    .line 68
    invoke-static {p1, v1}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, LO/d;->d()Ljava/util/concurrent/Executor;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    new-instance v2, LO/a;

    .line 76
    .line 77
    const/4 v3, 0x1

    .line 78
    invoke-direct {v2, v0, p1, v3}, LO/a;-><init>(LO/d;LI/f;I)V

    .line 79
    .line 80
    .line 81
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 82
    .line 83
    .line 84
    sget-object p1, LO1/g;->a:LO1/g;

    .line 85
    .line 86
    return-object p1

    .line 87
    :pswitch_3
    iget-object v0, p0, LM1/P;->l:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, LZ1/l;

    .line 90
    .line 91
    check-cast p1, LO1/d;

    .line 92
    .line 93
    new-instance v1, LM1/Q;

    .line 94
    .line 95
    iget-object p1, p1, LO1/d;->k:Ljava/lang/Object;

    .line 96
    .line 97
    invoke-direct {v1, p1}, LM1/Q;-><init>(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-interface {v0, v1}, LZ1/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    sget-object p1, LO1/g;->a:LO1/g;

    .line 104
    .line 105
    return-object p1

    .line 106
    nop

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

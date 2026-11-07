.class public final LM1/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LM1/O;


# direct methods
.method public constructor <init>(LM1/O;I)V
    .locals 0

    .line 1
    packed-switch p2, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    const-string p2, "pigeonRegistrar"

    .line 5
    .line 6
    invoke-static {p1, p2}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, LM1/s;->a:LM1/O;

    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    const-string p2, "pigeonRegistrar"

    .line 16
    .line 17
    invoke-static {p1, p2}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, LM1/s;->a:LM1/O;

    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    const-string p2, "pigeonRegistrar"

    .line 27
    .line 28
    invoke-static {p1, p2}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, LM1/s;->a:LM1/O;

    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_2
    const-string p2, "pigeonRegistrar"

    .line 38
    .line 39
    invoke-static {p1, p2}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, LM1/s;->a:LM1/O;

    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_3
    const-string p2, "pigeonRegistrar"

    .line 49
    .line 50
    invoke-static {p1, p2}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, LM1/s;->a:LM1/O;

    .line 57
    .line 58
    return-void

    .line 59
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a()LM1/k0;
    .locals 7

    .line 1
    iget-object v0, p0, LM1/s;->a:LM1/O;

    .line 2
    .line 3
    iget-object v0, v0, LM1/O;->a:Landroid/content/Context;

    .line 4
    .line 5
    const-string v1, "display"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/hardware/display/DisplayManager;

    .line 12
    .line 13
    invoke-static {v0}, LE2/a;->Y(Landroid/hardware/display/DisplayManager;)Ljava/util/ArrayList;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    new-instance v2, LM1/k0;

    .line 18
    .line 19
    invoke-direct {v2, p0}, LM1/k0;-><init>(LM1/s;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, LE2/a;->Y(Landroid/hardware/display/DisplayManager;)Ljava/util/ArrayList;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    const/4 v4, 0x0

    .line 41
    :goto_0
    if-ge v4, v1, :cond_1

    .line 42
    .line 43
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    add-int/lit8 v4, v4, 0x1

    .line 48
    .line 49
    check-cast v5, Landroid/hardware/display/DisplayManager$DisplayListener;

    .line 50
    .line 51
    invoke-virtual {v0, v5}, Landroid/hardware/display/DisplayManager;->unregisterDisplayListener(Landroid/hardware/display/DisplayManager$DisplayListener;)V

    .line 52
    .line 53
    .line 54
    new-instance v5, LM1/o;

    .line 55
    .line 56
    const/4 v6, 0x0

    .line 57
    invoke-direct {v5, v3, v0, v6}, LM1/o;-><init>(Ljava/lang/Object;Landroid/hardware/display/DisplayManager;I)V

    .line 58
    .line 59
    .line 60
    const/4 v6, 0x0

    .line 61
    invoke-virtual {v0, v5, v6}, Landroid/hardware/display/DisplayManager;->registerDisplayListener(Landroid/hardware/display/DisplayManager$DisplayListener;Landroid/os/Handler;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    :goto_1
    return-object v2
.end method

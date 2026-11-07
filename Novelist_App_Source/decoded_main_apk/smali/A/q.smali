.class public final LA/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:I

.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;

.field public n:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, LA/q;->k:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lk1/l;Lk1/e;LB1/o;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LA/q;->k:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LA/q;->l:Ljava/lang/Object;

    iput-object p3, p0, LA/q;->m:Ljava/lang/Object;

    iput-object p1, p0, LA/q;->n:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, LA/q;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Lk1/l;->p:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-object v1, p0, LA/q;->n:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Lk1/l;

    .line 12
    .line 13
    iget-object v2, p0, LA/q;->l:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, Lk1/e;

    .line 16
    .line 17
    invoke-static {v1, v2}, Lk1/l;->a(Lk1/l;Lk1/e;)V

    .line 18
    .line 19
    .line 20
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    iget-object v0, p0, LA/q;->m:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, LB1/o;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-virtual {v0, v1}, LB1/o;->d(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :catchall_0
    move-exception v1

    .line 31
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    throw v1

    .line 33
    :pswitch_0
    :try_start_2
    iget-object v0, p0, LA/q;->l:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, LA/h;

    .line 36
    .line 37
    invoke-virtual {v0}, LA/h;->call()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 41
    goto :goto_0

    .line 42
    :catch_0
    const/4 v0, 0x0

    .line 43
    :goto_0
    iget-object v1, p0, LA/q;->m:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, LA/i;

    .line 46
    .line 47
    iget-object v2, p0, LA/q;->n:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v2, Landroid/os/Handler;

    .line 50
    .line 51
    new-instance v3, LA/a;

    .line 52
    .line 53
    const/4 v4, 0x1

    .line 54
    invoke-direct {v3, v1, v0, v4}, LA/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

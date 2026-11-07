.class public final synthetic Lb/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ1/a;


# instance fields
.field public final synthetic k:I

.field public final synthetic l:Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lb/b;->k:I

    iput-object p1, p0, Lb/b;->l:Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lb/b;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lb/t;

    .line 7
    .line 8
    new-instance v1, Lb/d;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    iget-object v3, p0, Lb/b;->l:Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;

    .line 12
    .line 13
    invoke-direct {v1, v3, v2}, Lb/d;-><init>(Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;I)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1}, Lb/t;-><init>(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 20
    .line 21
    const/16 v2, 0x21

    .line 22
    .line 23
    if-lt v1, v2, :cond_1

    .line 24
    .line 25
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-static {v1, v2}, La2/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_0

    .line 38
    .line 39
    new-instance v1, Landroid/os/Handler;

    .line 40
    .line 41
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 46
    .line 47
    .line 48
    new-instance v2, LM/c;

    .line 49
    .line 50
    const/16 v4, 0xc

    .line 51
    .line 52
    invoke-direct {v2, v3, v0, v4}, LM/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    iget-object v1, v3, Ls/b;->k:Landroidx/lifecycle/u;

    .line 60
    .line 61
    new-instance v2, Lb/c;

    .line 62
    .line 63
    invoke-direct {v2, v0, v3}, Lb/c;-><init>(Lb/t;Lb/k;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v2}, Landroidx/lifecycle/u;->a(Landroidx/lifecycle/r;)V

    .line 67
    .line 68
    .line 69
    :cond_1
    :goto_0
    return-object v0

    .line 70
    :pswitch_0
    new-instance v0, Lh0/a;

    .line 71
    .line 72
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 73
    .line 74
    .line 75
    iget-object v1, p0, Lb/b;->l:Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;

    .line 76
    .line 77
    invoke-virtual {v1}, Lb/k;->b()Lb/t;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v1}, Lb/t;->a()Lb/r;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    iget-object v1, v1, Lb/r;->c:LB1/s;

    .line 86
    .line 87
    invoke-virtual {v1, v0}, LB1/s;->c(Lh0/d;)V

    .line 88
    .line 89
    .line 90
    return-object v0

    .line 91
    :pswitch_1
    new-instance v0, Lb/n;

    .line 92
    .line 93
    iget-object v1, p0, Lb/b;->l:Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;

    .line 94
    .line 95
    iget-object v2, v1, Lb/k;->p:Lb/i;

    .line 96
    .line 97
    new-instance v3, Lb/b;

    .line 98
    .line 99
    const/4 v4, 0x0

    .line 100
    invoke-direct {v3, v1, v4}, Lb/b;-><init>(Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;I)V

    .line 101
    .line 102
    .line 103
    invoke-direct {v0, v2, v3}, Lb/n;-><init>(Ljava/util/concurrent/Executor;Lb/b;)V

    .line 104
    .line 105
    .line 106
    return-object v0

    .line 107
    :pswitch_2
    iget-object v0, p0, Lb/b;->l:Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;

    .line 108
    .line 109
    invoke-virtual {v0}, Lb/k;->reportFullyDrawn()V

    .line 110
    .line 111
    .line 112
    sget-object v0, LO1/g;->a:LO1/g;

    .line 113
    .line 114
    return-object v0

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

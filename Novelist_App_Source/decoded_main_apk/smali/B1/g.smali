.class public LB1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC1/m;
.implements LL0/i;
.implements LV/h;
.implements Landroidx/lifecycle/A;
.implements Ld/c;
.implements LC1/h;
.implements Lk/l;
.implements Lr1/B;
.implements LC1/f;


# instance fields
.field public final synthetic k:I

.field public l:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, LB1/g;->k:I

    sparse-switch p1, :sswitch_data_0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p1, p0, LB1/g;->l:Ljava/lang/Object;

    return-void

    .line 4
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    .line 5
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/ArrayDeque;

    const/16 v0, 0x10

    invoke-direct {p1, v0}, Ljava/util/ArrayDeque;-><init>(I)V

    iput-object p1, p0, LB1/g;->l:Ljava/lang/Object;

    return-void

    :sswitch_data_0
    .sparse-switch
        0xc -> :sswitch_1
        0x11 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LB1/g;->k:I

    iput-object p1, p0, LB1/g;->l:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lt1/c;I)V
    .locals 4

    iput p2, p0, LB1/g;->k:I

    packed-switch p2, :pswitch_data_0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance p2, LB1/a;

    const/4 v0, 0x5

    invoke-direct {p2, p0, v0}, LB1/a;-><init>(Ljava/lang/Object;I)V

    .line 8
    new-instance v0, LB1/s;

    sget-object v1, LC1/r;->a:LC1/r;

    const/4 v2, 0x0

    .line 9
    const-string v3, "flutter/sensitivecontent"

    invoke-direct {v0, p1, v3, v1, v2}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 10
    invoke-virtual {v0, p2}, LB1/s;->z(LC1/m;)V

    return-void

    .line 11
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    new-instance p2, LB1/s;

    sget-object v0, LC1/j;->a:LC1/j;

    const/4 v1, 0x0

    .line 13
    const-string v2, "flutter/system"

    invoke-direct {p2, p1, v2, v0, v1}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 14
    iput-object p2, p0, LB1/g;->l:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(LC1/k;)Lt1/a;
    .locals 1

    .line 1
    iget-object v0, p0, LB1/g;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lt1/j;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lt1/j;->a(LC1/k;)Lt1/a;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 5

    .line 1
    check-cast p2, Lg1/e;

    .line 2
    .line 3
    iget-object v0, p0, LB1/g;->l:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LW0/b;

    .line 6
    .line 7
    check-cast p1, LX0/e;

    .line 8
    .line 9
    new-instance v1, LX0/f;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {v1, p2, v2}, LX0/f;-><init>(Lg1/e;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->q()Landroid/os/IInterface;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, LX0/d;

    .line 20
    .line 21
    new-instance p2, LK0/g;

    .line 22
    .line 23
    const/4 v3, -0x1

    .line 24
    const/4 v4, 0x1

    .line 25
    invoke-direct {p2, v3, v3, v2, v4}, LK0/g;-><init>(IIIZ)V

    .line 26
    .line 27
    .line 28
    new-instance v3, LK0/f;

    .line 29
    .line 30
    invoke-direct {v3, p2, v2}, LK0/f;-><init>(LK0/g;Z)V

    .line 31
    .line 32
    .line 33
    iput-boolean v2, v3, LK0/f;->m:Z

    .line 34
    .line 35
    check-cast p1, LX0/b;

    .line 36
    .line 37
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    const-string v2, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService"

    .line 42
    .line 43
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    sget v2, Lc1/a;->a:I

    .line 47
    .line 48
    invoke-virtual {p2, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 49
    .line 50
    .line 51
    invoke-static {p2, v0}, Lc1/a;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 52
    .line 53
    .line 54
    invoke-static {p2, v3}, Lc1/a;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 55
    .line 56
    .line 57
    const/16 v0, 0x9

    .line 58
    .line 59
    invoke-virtual {p1, p2, v0}, LX0/b;->d(Landroid/os/Parcel;I)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public b(Ljava/lang/String;LC1/d;)V
    .locals 2

    .line 1
    iget-object v0, p0, LB1/g;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lt1/j;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, p1, p2, v1}, Lt1/j;->c(Ljava/lang/String;LC1/d;Lt1/a;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public c(Ljava/lang/String;LC1/d;Lt1/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, LB1/g;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lt1/j;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, Lt1/j;->c(Ljava/lang/String;LC1/d;Lt1/a;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public d(LZ1/p;LT1/h;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LB1/g;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LV/h;

    .line 4
    .line 5
    new-instance v1, LY/c;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p1, v2}, LY/c;-><init>(LZ1/p;LR1/c;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1, p2}, LV/h;->d(LZ1/p;LT1/h;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public e(Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p1, Ld/b;

    .line 2
    .line 3
    iget-object v0, p0, LB1/g;->l:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lb0/I;

    .line 6
    .line 7
    iget-object v1, v0, Lb0/I;->E:Ljava/util/ArrayDeque;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pollLast()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lb0/E;

    .line 14
    .line 15
    const-string v2, "FragmentManager"

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    new-instance p1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v0, "No Activities were started for result for "

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    iget-object v3, v1, Lb0/E;->k:Ljava/lang/String;

    .line 38
    .line 39
    iget v1, v1, Lb0/E;->l:I

    .line 40
    .line 41
    iget-object v0, v0, Lb0/I;->c:LB1/s;

    .line 42
    .line 43
    invoke-virtual {v0, v3}, LB1/s;->j(Ljava/lang/String;)Lb0/s;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-nez v0, :cond_1

    .line 48
    .line 49
    new-instance p1, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string v0, "Activity result delivered for unknown Fragment "

    .line 52
    .line 53
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-static {v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_1
    iget v2, p1, Ld/b;->k:I

    .line 68
    .line 69
    iget-object p1, p1, Ld/b;->l:Landroid/content/Intent;

    .line 70
    .line 71
    invoke-virtual {v0, v1, v2, p1}, Lb0/s;->p(IILandroid/content/Intent;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public f(Ljava/lang/String;Ljava/nio/ByteBuffer;LC1/e;)V
    .locals 1

    .line 1
    iget-object v0, p0, LB1/g;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lt1/j;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, Lt1/j;->f(Ljava/lang/String;Ljava/nio/ByteBuffer;LC1/e;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public g()V
    .locals 2

    .line 1
    iget-object v0, p0, LB1/g;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lr1/C;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iput-object v1, v0, Lr1/C;->b:Lio/flutter/embedding/engine/renderer/k;

    .line 7
    .line 8
    return-void
.end method

.method public getData()Ll2/d;
    .locals 1

    .line 1
    iget-object v0, p0, LB1/g;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LV/h;

    .line 4
    .line 5
    invoke-interface {v0}, LV/h;->getData()Ll2/d;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public h(Ljava/lang/String;Ljava/nio/ByteBuffer;)V
    .locals 2

    .line 1
    iget-object v0, p0, LB1/g;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lt1/j;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, p1, p2, v1}, Lt1/j;->f(Ljava/lang/String;Ljava/nio/ByteBuffer;LC1/e;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public i(LC1/g;)V
    .locals 1

    .line 1
    iget-object v0, p0, LB1/g;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lj1/c;

    .line 4
    .line 5
    iput-object p1, v0, Lj1/c;->r:LC1/g;

    .line 6
    .line 7
    return-void
.end method

.method public j(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, Landroidx/lifecycle/s;

    .line 2
    .line 3
    iget-object v0, p0, LB1/g;->l:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lb0/p;

    .line 6
    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    iget-boolean p1, v0, Lb0/p;->h0:Z

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v2, "Fragment "

    .line 22
    .line 23
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v0, " did not return a View from onCreateView() or this was called before onCreateView()."

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p1

    .line 42
    :cond_1
    :goto_0
    return-void
.end method

.method public k(LA/c;LB1/o;)V
    .locals 33

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget v3, v1, LB1/g;->k:I

    .line 8
    .line 9
    const/4 v4, -0x1

    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x0

    .line 12
    const-string v7, "error"

    .line 13
    .line 14
    const/4 v8, 0x1

    .line 15
    const/4 v9, 0x0

    .line 16
    packed-switch v3, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    iget-object v3, v1, LB1/g;->l:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v3, LH0/i;

    .line 22
    .line 23
    iget-object v10, v3, LH0/i;->l:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v10, Lb1/Q;

    .line 26
    .line 27
    if-nez v10, :cond_0

    .line 28
    .line 29
    goto/16 :goto_2

    .line 30
    .line 31
    :cond_0
    iget-object v0, v0, LA/c;->l:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result v10

    .line 42
    sparse-switch v10, :sswitch_data_0

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :sswitch_0
    const-string v10, "Scribe.isStylusHandwritingAvailable"

    .line 47
    .line 48
    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    move v4, v5

    .line 56
    goto :goto_0

    .line 57
    :sswitch_1
    const-string v5, "Scribe.startStylusHandwriting"

    .line 58
    .line 59
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_2

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    move v4, v8

    .line 67
    goto :goto_0

    .line 68
    :sswitch_2
    const-string v5, "Scribe.isFeatureAvailable"

    .line 69
    .line 70
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_3

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    move v4, v9

    .line 78
    :goto_0
    const/16 v0, 0x22

    .line 79
    .line 80
    packed-switch v4, :pswitch_data_1

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2}, LB1/o;->b()V

    .line 84
    .line 85
    .line 86
    goto/16 :goto_2

    .line 87
    .line 88
    :pswitch_0
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 89
    .line 90
    if-ge v4, v0, :cond_4

    .line 91
    .line 92
    const-string v0, "Requires API level 34 or higher."

    .line 93
    .line 94
    invoke-virtual {v2, v7, v0, v6}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    goto/16 :goto_2

    .line 98
    .line 99
    :cond_4
    :try_start_0
    iget-object v0, v3, LH0/i;->l:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v0, Lb1/Q;

    .line 102
    .line 103
    iget-object v0, v0, Lb1/Q;->l:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 106
    .line 107
    invoke-static {v0}, LD/f0;->w(Landroid/view/inputmethod/InputMethodManager;)Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-virtual {v2, v0}, LB1/o;->d(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 116
    .line 117
    .line 118
    goto :goto_2

    .line 119
    :catch_0
    move-exception v0

    .line 120
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-virtual {v2, v7, v0, v6}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    goto :goto_2

    .line 128
    :pswitch_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 129
    .line 130
    const/16 v4, 0x21

    .line 131
    .line 132
    if-ge v0, v4, :cond_5

    .line 133
    .line 134
    const-string v0, "Requires API level 33 or higher."

    .line 135
    .line 136
    invoke-virtual {v2, v7, v0, v6}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_5
    :try_start_1
    iget-object v0, v3, LH0/i;->l:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v0, Lb1/Q;

    .line 143
    .line 144
    iget-object v3, v0, Lb1/Q;->l:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v3, Landroid/view/inputmethod/InputMethodManager;

    .line 147
    .line 148
    iget-object v0, v0, Lb1/Q;->m:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v0, Landroid/view/View;

    .line 151
    .line 152
    invoke-static {v3, v0}, LE/c;->x(Landroid/view/inputmethod/InputMethodManager;Landroid/view/View;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2, v6}, LB1/o;->d(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 156
    .line 157
    .line 158
    goto :goto_2

    .line 159
    :catch_1
    move-exception v0

    .line 160
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-virtual {v2, v7, v0, v6}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    goto :goto_2

    .line 168
    :pswitch_2
    :try_start_2
    iget-object v3, v3, LH0/i;->l:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v3, Lb1/Q;

    .line 171
    .line 172
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 173
    .line 174
    if-lt v4, v0, :cond_6

    .line 175
    .line 176
    iget-object v0, v3, Lb1/Q;->l:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 179
    .line 180
    invoke-static {v0}, LD/f0;->w(Landroid/view/inputmethod/InputMethodManager;)Z

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-eqz v0, :cond_7

    .line 185
    .line 186
    goto :goto_1

    .line 187
    :cond_6
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    :cond_7
    move v8, v9

    .line 191
    :goto_1
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-virtual {v2, v0}, LB1/o;->d(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_2

    .line 196
    .line 197
    .line 198
    goto :goto_2

    .line 199
    :catch_2
    move-exception v0

    .line 200
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-virtual {v2, v7, v0, v6}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    :goto_2
    return-void

    .line 208
    :pswitch_3
    iget-object v3, v1, LB1/g;->l:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast v3, LA/c;

    .line 211
    .line 212
    iget-object v10, v3, LA/c;->m:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v10, Lio/flutter/plugin/platform/o;

    .line 215
    .line 216
    if-nez v10, :cond_8

    .line 217
    .line 218
    goto/16 :goto_8

    .line 219
    .line 220
    :cond_8
    iget-object v10, v0, LA/c;->l:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v10, Ljava/lang/String;

    .line 223
    .line 224
    iget-object v0, v0, LA/c;->m:Ljava/lang/Object;

    .line 225
    .line 226
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    .line 230
    .line 231
    .line 232
    move-result v11

    .line 233
    const/4 v12, 0x5

    .line 234
    const/4 v13, 0x4

    .line 235
    const/4 v14, 0x3

    .line 236
    sparse-switch v11, :sswitch_data_1

    .line 237
    .line 238
    .line 239
    goto :goto_3

    .line 240
    :sswitch_3
    const-string v11, "dispose"

    .line 241
    .line 242
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v10

    .line 246
    if-nez v10, :cond_9

    .line 247
    .line 248
    goto :goto_3

    .line 249
    :cond_9
    move v4, v12

    .line 250
    goto :goto_3

    .line 251
    :sswitch_4
    const-string v11, "isSurfaceControlEnabled"

    .line 252
    .line 253
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v10

    .line 257
    if-nez v10, :cond_a

    .line 258
    .line 259
    goto :goto_3

    .line 260
    :cond_a
    move v4, v13

    .line 261
    goto :goto_3

    .line 262
    :sswitch_5
    const-string v11, "setDirection"

    .line 263
    .line 264
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v10

    .line 268
    if-nez v10, :cond_b

    .line 269
    .line 270
    goto :goto_3

    .line 271
    :cond_b
    move v4, v14

    .line 272
    goto :goto_3

    .line 273
    :sswitch_6
    const-string v11, "touch"

    .line 274
    .line 275
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v10

    .line 279
    if-nez v10, :cond_c

    .line 280
    .line 281
    goto :goto_3

    .line 282
    :cond_c
    move v4, v5

    .line 283
    goto :goto_3

    .line 284
    :sswitch_7
    const-string v11, "clearFocus"

    .line 285
    .line 286
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v10

    .line 290
    if-nez v10, :cond_d

    .line 291
    .line 292
    goto :goto_3

    .line 293
    :cond_d
    move v4, v8

    .line 294
    goto :goto_3

    .line 295
    :sswitch_8
    const-string v11, "create"

    .line 296
    .line 297
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result v10

    .line 301
    if-nez v10, :cond_e

    .line 302
    .line 303
    goto :goto_3

    .line 304
    :cond_e
    move v4, v9

    .line 305
    :goto_3
    const-string v10, "direction"

    .line 306
    .line 307
    const-string v11, "id"

    .line 308
    .line 309
    packed-switch v4, :pswitch_data_2

    .line 310
    .line 311
    .line 312
    invoke-virtual {v2}, LB1/o;->b()V

    .line 313
    .line 314
    .line 315
    goto/16 :goto_8

    .line 316
    .line 317
    :pswitch_4
    check-cast v0, Ljava/util/Map;

    .line 318
    .line 319
    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    check-cast v0, Ljava/lang/Integer;

    .line 324
    .line 325
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 326
    .line 327
    .line 328
    move-result v0

    .line 329
    :try_start_3
    iget-object v3, v3, LA/c;->m:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast v3, Lio/flutter/plugin/platform/o;

    .line 332
    .line 333
    invoke-virtual {v3, v0}, Lio/flutter/plugin/platform/o;->p(I)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v2, v6}, LB1/o;->d(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_3

    .line 337
    .line 338
    .line 339
    goto/16 :goto_8

    .line 340
    .line 341
    :catch_3
    move-exception v0

    .line 342
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    invoke-virtual {v2, v7, v0, v6}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 347
    .line 348
    .line 349
    goto/16 :goto_8

    .line 350
    .line 351
    :pswitch_5
    iget-object v0, v3, LA/c;->m:Ljava/lang/Object;

    .line 352
    .line 353
    check-cast v0, Lio/flutter/plugin/platform/o;

    .line 354
    .line 355
    iget-object v0, v0, Lio/flutter/plugin/platform/o;->l:Ljava/lang/Object;

    .line 356
    .line 357
    check-cast v0, Lio/flutter/plugin/platform/r;

    .line 358
    .line 359
    iget-object v0, v0, Lio/flutter/plugin/platform/r;->o:Lio/flutter/embedding/engine/FlutterJNI;

    .line 360
    .line 361
    if-nez v0, :cond_f

    .line 362
    .line 363
    goto :goto_4

    .line 364
    :cond_f
    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterJNI;->IsSurfaceControlEnabled()Z

    .line 365
    .line 366
    .line 367
    move-result v9

    .line 368
    :goto_4
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    invoke-virtual {v2, v0}, LB1/o;->d(Ljava/lang/Object;)V

    .line 373
    .line 374
    .line 375
    goto/16 :goto_8

    .line 376
    .line 377
    :pswitch_6
    check-cast v0, Ljava/util/Map;

    .line 378
    .line 379
    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v4

    .line 383
    check-cast v4, Ljava/lang/Integer;

    .line 384
    .line 385
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 386
    .line 387
    .line 388
    move-result v4

    .line 389
    invoke-interface {v0, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    check-cast v0, Ljava/lang/Integer;

    .line 394
    .line 395
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 396
    .line 397
    .line 398
    move-result v0

    .line 399
    :try_start_4
    iget-object v3, v3, LA/c;->m:Ljava/lang/Object;

    .line 400
    .line 401
    check-cast v3, Lio/flutter/plugin/platform/o;

    .line 402
    .line 403
    invoke-virtual {v3, v4, v0}, Lio/flutter/plugin/platform/o;->f(II)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v2, v6}, LB1/o;->d(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_4

    .line 407
    .line 408
    .line 409
    goto/16 :goto_8

    .line 410
    .line 411
    :catch_4
    move-exception v0

    .line 412
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    invoke-virtual {v2, v7, v0, v6}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 417
    .line 418
    .line 419
    goto/16 :goto_8

    .line 420
    .line 421
    :pswitch_7
    check-cast v0, Ljava/util/List;

    .line 422
    .line 423
    new-instance v15, LB1/l;

    .line 424
    .line 425
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v4

    .line 429
    check-cast v4, Ljava/lang/Integer;

    .line 430
    .line 431
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 432
    .line 433
    .line 434
    move-result v16

    .line 435
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v4

    .line 439
    move-object/from16 v17, v4

    .line 440
    .line 441
    check-cast v17, Ljava/lang/Number;

    .line 442
    .line 443
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v4

    .line 447
    move-object/from16 v18, v4

    .line 448
    .line 449
    check-cast v18, Ljava/lang/Number;

    .line 450
    .line 451
    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v4

    .line 455
    check-cast v4, Ljava/lang/Integer;

    .line 456
    .line 457
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 458
    .line 459
    .line 460
    move-result v19

    .line 461
    invoke-interface {v0, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v4

    .line 465
    check-cast v4, Ljava/lang/Integer;

    .line 466
    .line 467
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 468
    .line 469
    .line 470
    move-result v20

    .line 471
    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v21

    .line 475
    const/4 v4, 0x6

    .line 476
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object v22

    .line 480
    const/4 v4, 0x7

    .line 481
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v4

    .line 485
    check-cast v4, Ljava/lang/Integer;

    .line 486
    .line 487
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 488
    .line 489
    .line 490
    move-result v23

    .line 491
    const/16 v4, 0x8

    .line 492
    .line 493
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v4

    .line 497
    check-cast v4, Ljava/lang/Integer;

    .line 498
    .line 499
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 500
    .line 501
    .line 502
    move-result v24

    .line 503
    const/16 v4, 0x9

    .line 504
    .line 505
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v4

    .line 509
    check-cast v4, Ljava/lang/Double;

    .line 510
    .line 511
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 512
    .line 513
    .line 514
    move-result-wide v4

    .line 515
    double-to-float v4, v4

    .line 516
    const/16 v5, 0xa

    .line 517
    .line 518
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v5

    .line 522
    check-cast v5, Ljava/lang/Double;

    .line 523
    .line 524
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    .line 525
    .line 526
    .line 527
    move-result-wide v8

    .line 528
    double-to-float v5, v8

    .line 529
    const/16 v8, 0xb

    .line 530
    .line 531
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v8

    .line 535
    check-cast v8, Ljava/lang/Integer;

    .line 536
    .line 537
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 538
    .line 539
    .line 540
    move-result v27

    .line 541
    const/16 v8, 0xc

    .line 542
    .line 543
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v8

    .line 547
    check-cast v8, Ljava/lang/Integer;

    .line 548
    .line 549
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 550
    .line 551
    .line 552
    move-result v28

    .line 553
    const/16 v8, 0xd

    .line 554
    .line 555
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v8

    .line 559
    check-cast v8, Ljava/lang/Integer;

    .line 560
    .line 561
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 562
    .line 563
    .line 564
    move-result v29

    .line 565
    const/16 v8, 0xe

    .line 566
    .line 567
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v8

    .line 571
    check-cast v8, Ljava/lang/Integer;

    .line 572
    .line 573
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 574
    .line 575
    .line 576
    move-result v30

    .line 577
    const/16 v8, 0xf

    .line 578
    .line 579
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    check-cast v0, Ljava/lang/Number;

    .line 584
    .line 585
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 586
    .line 587
    .line 588
    move-result-wide v31

    .line 589
    move/from16 v25, v4

    .line 590
    .line 591
    move/from16 v26, v5

    .line 592
    .line 593
    invoke-direct/range {v15 .. v32}, LB1/l;-><init>(ILjava/lang/Number;Ljava/lang/Number;IILjava/lang/Object;Ljava/lang/Object;IIFFIIIIJ)V

    .line 594
    .line 595
    .line 596
    :try_start_5
    iget-object v0, v3, LA/c;->m:Ljava/lang/Object;

    .line 597
    .line 598
    check-cast v0, Lio/flutter/plugin/platform/o;

    .line 599
    .line 600
    invoke-virtual {v0, v15}, Lio/flutter/plugin/platform/o;->i(LB1/l;)V

    .line 601
    .line 602
    .line 603
    invoke-virtual {v2, v6}, LB1/o;->d(Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/lang/IllegalStateException; {:try_start_5 .. :try_end_5} :catch_5

    .line 604
    .line 605
    .line 606
    goto/16 :goto_8

    .line 607
    .line 608
    :catch_5
    move-exception v0

    .line 609
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    invoke-virtual {v2, v7, v0, v6}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 614
    .line 615
    .line 616
    goto/16 :goto_8

    .line 617
    .line 618
    :pswitch_8
    check-cast v0, Ljava/lang/Integer;

    .line 619
    .line 620
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 621
    .line 622
    .line 623
    move-result v0

    .line 624
    :try_start_6
    iget-object v3, v3, LA/c;->m:Ljava/lang/Object;

    .line 625
    .line 626
    check-cast v3, Lio/flutter/plugin/platform/o;

    .line 627
    .line 628
    invoke-virtual {v3, v0}, Lio/flutter/plugin/platform/o;->m(I)V

    .line 629
    .line 630
    .line 631
    invoke-virtual {v2, v6}, LB1/o;->d(Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/IllegalStateException; {:try_start_6 .. :try_end_6} :catch_6

    .line 632
    .line 633
    .line 634
    goto/16 :goto_8

    .line 635
    .line 636
    :catch_6
    move-exception v0

    .line 637
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    move-result-object v0

    .line 641
    invoke-virtual {v2, v7, v0, v6}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 642
    .line 643
    .line 644
    goto/16 :goto_8

    .line 645
    .line 646
    :pswitch_9
    check-cast v0, Ljava/util/Map;

    .line 647
    .line 648
    const-string v4, "params"

    .line 649
    .line 650
    invoke-interface {v0, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 651
    .line 652
    .line 653
    move-result v5

    .line 654
    if-eqz v5, :cond_10

    .line 655
    .line 656
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v4

    .line 660
    check-cast v4, [B

    .line 661
    .line 662
    invoke-static {v4}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 663
    .line 664
    .line 665
    move-result-object v4

    .line 666
    goto :goto_5

    .line 667
    :cond_10
    move-object v4, v6

    .line 668
    :goto_5
    :try_start_7
    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 669
    .line 670
    .line 671
    move-result-object v5

    .line 672
    check-cast v5, Ljava/lang/Integer;

    .line 673
    .line 674
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 675
    .line 676
    .line 677
    move-result v5

    .line 678
    const-string v8, "viewType"

    .line 679
    .line 680
    invoke-interface {v0, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 681
    .line 682
    .line 683
    move-result-object v8

    .line 684
    check-cast v8, Ljava/lang/String;

    .line 685
    .line 686
    invoke-interface {v0, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 687
    .line 688
    .line 689
    move-result-object v0

    .line 690
    check-cast v0, Ljava/lang/Integer;

    .line 691
    .line 692
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 693
    .line 694
    .line 695
    move-result v0

    .line 696
    iget-object v3, v3, LA/c;->m:Ljava/lang/Object;

    .line 697
    .line 698
    check-cast v3, Lio/flutter/plugin/platform/o;

    .line 699
    .line 700
    iget-object v3, v3, Lio/flutter/plugin/platform/o;->l:Ljava/lang/Object;

    .line 701
    .line 702
    check-cast v3, Lio/flutter/plugin/platform/r;

    .line 703
    .line 704
    iget-object v9, v3, Lio/flutter/plugin/platform/r;->k:Lio/flutter/plugin/platform/o;

    .line 705
    .line 706
    iget-object v9, v9, Lio/flutter/plugin/platform/o;->l:Ljava/lang/Object;

    .line 707
    .line 708
    check-cast v9, Ljava/util/HashMap;

    .line 709
    .line 710
    invoke-virtual {v9, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 711
    .line 712
    .line 713
    move-result-object v9

    .line 714
    check-cast v9, LM1/w;

    .line 715
    .line 716
    if-eqz v9, :cond_13

    .line 717
    .line 718
    if-eqz v4, :cond_11

    .line 719
    .line 720
    iget-object v8, v9, LM1/w;->a:LC1/q;

    .line 721
    .line 722
    invoke-virtual {v8, v4}, LC1/q;->b(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 723
    .line 724
    .line 725
    move-result-object v4

    .line 726
    goto :goto_6

    .line 727
    :cond_11
    move-object v4, v6

    .line 728
    :goto_6
    invoke-virtual {v9, v4}, LM1/w;->a(Ljava/lang/Object;)Lio/flutter/plugin/platform/g;

    .line 729
    .line 730
    .line 731
    move-result-object v4

    .line 732
    invoke-interface {v4}, Lio/flutter/plugin/platform/g;->getView()Landroid/view/View;

    .line 733
    .line 734
    .line 735
    move-result-object v8

    .line 736
    if-eqz v8, :cond_12

    .line 737
    .line 738
    invoke-virtual {v8, v0}, Landroid/view/View;->setLayoutDirection(I)V

    .line 739
    .line 740
    .line 741
    iget-object v0, v3, Lio/flutter/plugin/platform/r;->s:Landroid/util/SparseArray;

    .line 742
    .line 743
    invoke-virtual {v0, v5, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 744
    .line 745
    .line 746
    invoke-virtual {v2, v6}, LB1/o;->d(Ljava/lang/Object;)V

    .line 747
    .line 748
    .line 749
    goto :goto_8

    .line 750
    :catch_7
    move-exception v0

    .line 751
    goto :goto_7

    .line 752
    :cond_12
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 753
    .line 754
    const-string v3, "PlatformView#getView() returned null, but an Android view reference was expected."

    .line 755
    .line 756
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 757
    .line 758
    .line 759
    throw v0

    .line 760
    :cond_13
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 761
    .line 762
    new-instance v3, Ljava/lang/StringBuilder;

    .line 763
    .line 764
    const-string v4, "Trying to create a platform view of unregistered type: "

    .line 765
    .line 766
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 767
    .line 768
    .line 769
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 770
    .line 771
    .line 772
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 773
    .line 774
    .line 775
    move-result-object v3

    .line 776
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 777
    .line 778
    .line 779
    throw v0
    :try_end_7
    .catch Ljava/lang/IllegalStateException; {:try_start_7 .. :try_end_7} :catch_7

    .line 780
    :goto_7
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 781
    .line 782
    .line 783
    move-result-object v0

    .line 784
    invoke-virtual {v2, v7, v0, v6}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 785
    .line 786
    .line 787
    :goto_8
    return-void

    .line 788
    :pswitch_a
    const-string v3, "locale"

    .line 789
    .line 790
    iget-object v4, v1, LB1/g;->l:Ljava/lang/Object;

    .line 791
    .line 792
    check-cast v4, LA/c;

    .line 793
    .line 794
    iget-object v5, v4, LA/c;->m:Ljava/lang/Object;

    .line 795
    .line 796
    check-cast v5, LB1/a;

    .line 797
    .line 798
    if-nez v5, :cond_14

    .line 799
    .line 800
    goto :goto_b

    .line 801
    :cond_14
    iget-object v5, v0, LA/c;->l:Ljava/lang/Object;

    .line 802
    .line 803
    check-cast v5, Ljava/lang/String;

    .line 804
    .line 805
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 806
    .line 807
    .line 808
    const-string v8, "Localization.getStringResource"

    .line 809
    .line 810
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 811
    .line 812
    .line 813
    move-result v5

    .line 814
    if-nez v5, :cond_15

    .line 815
    .line 816
    invoke-virtual {v2}, LB1/o;->b()V

    .line 817
    .line 818
    .line 819
    goto :goto_b

    .line 820
    :cond_15
    iget-object v0, v0, LA/c;->m:Ljava/lang/Object;

    .line 821
    .line 822
    check-cast v0, Lorg/json/JSONObject;

    .line 823
    .line 824
    :try_start_8
    const-string v5, "key"

    .line 825
    .line 826
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 827
    .line 828
    .line 829
    move-result-object v5

    .line 830
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 831
    .line 832
    .line 833
    move-result v8

    .line 834
    if-eqz v8, :cond_16

    .line 835
    .line 836
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 837
    .line 838
    .line 839
    move-result-object v0

    .line 840
    goto :goto_9

    .line 841
    :catch_8
    move-exception v0

    .line 842
    goto :goto_a

    .line 843
    :cond_16
    move-object v0, v6

    .line 844
    :goto_9
    iget-object v3, v4, LA/c;->m:Ljava/lang/Object;

    .line 845
    .line 846
    check-cast v3, LB1/a;

    .line 847
    .line 848
    invoke-virtual {v3, v5, v0}, LB1/a;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 849
    .line 850
    .line 851
    move-result-object v0

    .line 852
    invoke-virtual {v2, v0}, LB1/o;->d(Ljava/lang/Object;)V
    :try_end_8
    .catch Lorg/json/JSONException; {:try_start_8 .. :try_end_8} :catch_8

    .line 853
    .line 854
    .line 855
    goto :goto_b

    .line 856
    :goto_a
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 857
    .line 858
    .line 859
    move-result-object v0

    .line 860
    invoke-virtual {v2, v7, v0, v6}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 861
    .line 862
    .line 863
    :goto_b
    return-void

    .line 864
    nop

    .line 865
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_3
    .end packed-switch

    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    :sswitch_data_0
    .sparse-switch
        -0x2a11fcff -> :sswitch_2
        0x68dc8e5d -> :sswitch_1
        0x7e58a2bc -> :sswitch_0
    .end sparse-switch

    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    :sswitch_data_1
    .sparse-switch
        -0x509a5f04 -> :sswitch_8
        -0x2d106975 -> :sswitch_7
        0x696df3f -> :sswitch_6
        0x2261393d -> :sswitch_5
        0x2cc8f227 -> :sswitch_4
        0x63a5261f -> :sswitch_3
    .end sparse-switch

    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch
.end method

.method public l(Ljava/nio/ByteBuffer;Lv1/d;)Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    invoke-static {p1}, Lj0/h;->c(Ljava/nio/ByteBuffer;)Landroid/graphics/ImageDecoder$Source;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :try_start_0
    new-instance p2, Lv1/a;

    .line 6
    .line 7
    invoke-direct {p2, p0}, Lv1/a;-><init>(LB1/g;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1, p2}, Lj0/h;->b(Landroid/graphics/ImageDecoder$Source;Lv1/a;)Landroid/graphics/Bitmap;

    .line 11
    .line 12
    .line 13
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    return-object p1

    .line 15
    :catch_0
    move-exception p1

    .line 16
    const-string p2, "FlutterImageDecoderImplDefault"

    .line 17
    .line 18
    const-string v0, "Failed to decode image"

    .line 19
    .line 20
    invoke-static {p2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    return-object p1
.end method

.method public m()V
    .locals 0

    .line 1
    return-void
.end method

.method public n(ILB1/t;)V
    .locals 4

    .line 1
    iget-object v0, p0, LB1/g;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/flutter/plugin/editing/j;

    .line 4
    .line 5
    invoke-virtual {v0}, Lio/flutter/plugin/editing/j;->d()V

    .line 6
    .line 7
    .line 8
    iput-object p2, v0, Lio/flutter/plugin/editing/j;->f:LB1/t;

    .line 9
    .line 10
    new-instance v1, LD/n;

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    invoke-direct {v1, v2, p1}, LD/n;-><init>(II)V

    .line 14
    .line 15
    .line 16
    iput-object v1, v0, Lio/flutter/plugin/editing/j;->e:LD/n;

    .line 17
    .line 18
    iget-object p1, v0, Lio/flutter/plugin/editing/j;->h:Lio/flutter/plugin/editing/f;

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Lio/flutter/plugin/editing/f;->e(Lio/flutter/plugin/editing/e;)V

    .line 21
    .line 22
    .line 23
    new-instance p1, Lio/flutter/plugin/editing/f;

    .line 24
    .line 25
    iget-object v1, p2, LB1/t;->j:LB1/s;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    iget-object v1, v1, LB1/s;->n:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, LB1/v;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object v1, v2

    .line 36
    :goto_0
    iget-object v3, v0, Lio/flutter/plugin/editing/j;->a:Landroid/view/View;

    .line 37
    .line 38
    invoke-direct {p1, v1, v3}, Lio/flutter/plugin/editing/f;-><init>(LB1/v;Landroid/view/View;)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, Lio/flutter/plugin/editing/j;->h:Lio/flutter/plugin/editing/f;

    .line 42
    .line 43
    invoke-virtual {v0, p2}, Lio/flutter/plugin/editing/j;->e(LB1/t;)V

    .line 44
    .line 45
    .line 46
    const/4 p1, 0x1

    .line 47
    iput-boolean p1, v0, Lio/flutter/plugin/editing/j;->i:Z

    .line 48
    .line 49
    iget-object p1, v0, Lio/flutter/plugin/editing/j;->e:LD/n;

    .line 50
    .line 51
    iget p1, p1, LD/n;->b:I

    .line 52
    .line 53
    const/4 p2, 0x3

    .line 54
    if-ne p1, p2, :cond_1

    .line 55
    .line 56
    const/4 p1, 0x0

    .line 57
    iput-boolean p1, v0, Lio/flutter/plugin/editing/j;->p:Z

    .line 58
    .line 59
    :cond_1
    iput-object v2, v0, Lio/flutter/plugin/editing/j;->m:Landroid/graphics/Rect;

    .line 60
    .line 61
    iget-object p1, v0, Lio/flutter/plugin/editing/j;->h:Lio/flutter/plugin/editing/f;

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Lio/flutter/plugin/editing/f;->a(Lio/flutter/plugin/editing/e;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public o(DD[D)V
    .locals 19

    .line 1
    move-wide/from16 v0, p1

    .line 2
    .line 3
    move-wide/from16 v2, p3

    .line 4
    .line 5
    move-object/from16 v4, p0

    .line 6
    .line 7
    move-object/from16 v5, p5

    .line 8
    .line 9
    iget-object v6, v4, LB1/g;->l:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v6, Lio/flutter/plugin/editing/j;

    .line 12
    .line 13
    const/4 v7, 0x4

    .line 14
    new-array v7, v7, [D

    .line 15
    .line 16
    const/4 v8, 0x3

    .line 17
    aget-wide v9, v5, v8

    .line 18
    .line 19
    const-wide/16 v11, 0x0

    .line 20
    .line 21
    cmpl-double v9, v9, v11

    .line 22
    .line 23
    const/16 v10, 0xf

    .line 24
    .line 25
    const/4 v13, 0x0

    .line 26
    const/4 v14, 0x1

    .line 27
    if-nez v9, :cond_0

    .line 28
    .line 29
    const/4 v9, 0x7

    .line 30
    aget-wide v15, v5, v9

    .line 31
    .line 32
    cmpl-double v9, v15, v11

    .line 33
    .line 34
    if-nez v9, :cond_0

    .line 35
    .line 36
    aget-wide v15, v5, v10

    .line 37
    .line 38
    const-wide/high16 v17, 0x3ff0000000000000L    # 1.0

    .line 39
    .line 40
    cmpl-double v9, v15, v17

    .line 41
    .line 42
    if-nez v9, :cond_0

    .line 43
    .line 44
    move v9, v14

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move v9, v13

    .line 47
    :goto_0
    const/16 v15, 0xc

    .line 48
    .line 49
    aget-wide v15, v5, v15

    .line 50
    .line 51
    aget-wide v17, v5, v10

    .line 52
    .line 53
    div-double v15, v15, v17

    .line 54
    .line 55
    aput-wide v15, v7, v14

    .line 56
    .line 57
    aput-wide v15, v7, v13

    .line 58
    .line 59
    const/16 v10, 0xd

    .line 60
    .line 61
    aget-wide v15, v5, v10

    .line 62
    .line 63
    div-double v15, v15, v17

    .line 64
    .line 65
    aput-wide v15, v7, v8

    .line 66
    .line 67
    const/4 v10, 0x2

    .line 68
    aput-wide v15, v7, v10

    .line 69
    .line 70
    new-instance v15, Lg1/h;

    .line 71
    .line 72
    invoke-direct {v15, v9, v5, v7}, Lg1/h;-><init>(Z[D[D)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v15, v0, v1, v11, v12}, Lg1/h;->a(DD)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v15, v0, v1, v2, v3}, Lg1/h;->a(DD)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v15, v11, v12, v2, v3}, Lg1/h;->a(DD)V

    .line 82
    .line 83
    .line 84
    iget-object v0, v6, Lio/flutter/plugin/editing/j;->a:Landroid/view/View;

    .line 85
    .line 86
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 99
    .line 100
    new-instance v1, Landroid/graphics/Rect;

    .line 101
    .line 102
    aget-wide v2, v7, v13

    .line 103
    .line 104
    float-to-double v11, v0

    .line 105
    mul-double/2addr v2, v11

    .line 106
    double-to-int v0, v2

    .line 107
    aget-wide v2, v7, v10

    .line 108
    .line 109
    mul-double/2addr v2, v11

    .line 110
    double-to-int v2, v2

    .line 111
    aget-wide v9, v7, v14

    .line 112
    .line 113
    mul-double/2addr v9, v11

    .line 114
    invoke-static {v9, v10}, Ljava/lang/Math;->ceil(D)D

    .line 115
    .line 116
    .line 117
    move-result-wide v9

    .line 118
    double-to-int v3, v9

    .line 119
    aget-wide v8, v7, v8

    .line 120
    .line 121
    mul-double/2addr v8, v11

    .line 122
    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    .line 123
    .line 124
    .line 125
    move-result-wide v7

    .line 126
    double-to-int v5, v7

    .line 127
    invoke-direct {v1, v0, v2, v3, v5}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 128
    .line 129
    .line 130
    iput-object v1, v6, Lio/flutter/plugin/editing/j;->m:Landroid/graphics/Rect;

    .line 131
    .line 132
    return-void
.end method

.method public onCancel()V
    .locals 2

    .line 1
    iget-object v0, p0, LB1/g;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lj1/c;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iput-object v1, v0, Lj1/c;->r:LC1/g;

    .line 7
    .line 8
    return-void
.end method

.method public p(LB1/v;)V
    .locals 12

    .line 1
    iget-object v0, p0, LB1/g;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/flutter/plugin/editing/j;

    .line 4
    .line 5
    iget-object v1, v0, Lio/flutter/plugin/editing/j;->a:Landroid/view/View;

    .line 6
    .line 7
    iget-boolean v2, v0, Lio/flutter/plugin/editing/j;->i:Z

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-nez v2, :cond_3

    .line 11
    .line 12
    iget-object v2, v0, Lio/flutter/plugin/editing/j;->o:LB1/v;

    .line 13
    .line 14
    if-eqz v2, :cond_3

    .line 15
    .line 16
    iget v4, v2, LB1/v;->d:I

    .line 17
    .line 18
    if-ltz v4, :cond_3

    .line 19
    .line 20
    iget v5, v2, LB1/v;->e:I

    .line 21
    .line 22
    if-le v5, v4, :cond_3

    .line 23
    .line 24
    sub-int/2addr v5, v4

    .line 25
    iget v6, p1, LB1/v;->e:I

    .line 26
    .line 27
    iget v7, p1, LB1/v;->d:I

    .line 28
    .line 29
    sub-int/2addr v6, v7

    .line 30
    const/4 v8, 0x1

    .line 31
    if-eq v5, v6, :cond_0

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    move v6, v3

    .line 35
    :goto_0
    if-ge v6, v5, :cond_2

    .line 36
    .line 37
    iget-object v9, v2, LB1/v;->a:Ljava/lang/String;

    .line 38
    .line 39
    add-int v10, v6, v4

    .line 40
    .line 41
    invoke-virtual {v9, v10}, Ljava/lang/String;->charAt(I)C

    .line 42
    .line 43
    .line 44
    move-result v9

    .line 45
    iget-object v10, p1, LB1/v;->a:Ljava/lang/String;

    .line 46
    .line 47
    add-int v11, v6, v7

    .line 48
    .line 49
    invoke-virtual {v10, v11}, Ljava/lang/String;->charAt(I)C

    .line 50
    .line 51
    .line 52
    move-result v10

    .line 53
    if-eq v9, v10, :cond_1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    add-int/lit8 v6, v6, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    move v8, v3

    .line 60
    :goto_1
    iput-boolean v8, v0, Lio/flutter/plugin/editing/j;->i:Z

    .line 61
    .line 62
    :cond_3
    iput-object p1, v0, Lio/flutter/plugin/editing/j;->o:LB1/v;

    .line 63
    .line 64
    iget-object v2, v0, Lio/flutter/plugin/editing/j;->h:Lio/flutter/plugin/editing/f;

    .line 65
    .line 66
    invoke-virtual {v2, p1}, Lio/flutter/plugin/editing/f;->f(LB1/v;)V

    .line 67
    .line 68
    .line 69
    iget-boolean p1, v0, Lio/flutter/plugin/editing/j;->i:Z

    .line 70
    .line 71
    if-eqz p1, :cond_4

    .line 72
    .line 73
    iget-object p1, v0, Lio/flutter/plugin/editing/j;->b:Landroid/view/inputmethod/InputMethodManager;

    .line 74
    .line 75
    invoke-virtual {p1, v1}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    .line 76
    .line 77
    .line 78
    iput-boolean v3, v0, Lio/flutter/plugin/editing/j;->i:Z

    .line 79
    .line 80
    :cond_4
    return-void
.end method

.method public q(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LB1/g;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;->setPaymentRequestEnabled(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public r(Lio/flutter/embedding/engine/renderer/k;)V
    .locals 1

    .line 1
    iget-object v0, p0, LB1/g;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lr1/C;

    .line 4
    .line 5
    iput-object p1, v0, Lr1/C;->b:Lio/flutter/embedding/engine/renderer/k;

    .line 6
    .line 7
    return-void
.end method

.method public s()V
    .locals 5

    .line 1
    iget-object v0, p0, LB1/g;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p0}, LB1/g;->u()J

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    new-instance v3, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v4, "data item not completed, stackSize: "

    .line 23
    .line 24
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v0, " scope: "

    .line 31
    .line 32
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    new-instance v1, Ljava/io/IOException;

    .line 43
    .line 44
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v1
.end method

.method public t(J)V
    .locals 4

    .line 1
    invoke-virtual {p0}, LB1/g;->u()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    cmp-long v2, v0, p1

    .line 6
    .line 7
    if-eqz v2, :cond_2

    .line 8
    .line 9
    const-wide/16 v2, -0x1

    .line 10
    .line 11
    cmp-long v2, v0, v2

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    const-wide/16 v2, -0x2

    .line 16
    .line 17
    cmp-long v0, v0, v2

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-wide v0, v2

    .line 23
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v3, "expected non-string scope or scope "

    .line 26
    .line 27
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string p1, " but found "

    .line 34
    .line 35
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    new-instance p2, Ljava/io/IOException;

    .line 46
    .line 47
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p2

    .line 51
    :cond_2
    :goto_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, LB1/g;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "<"

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, LB1/g;->l:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const/16 v1, 0x3e

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0

    .line 35
    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_0
    .end packed-switch
.end method

.method public u()J
    .locals 2

    .line 1
    iget-object v0, p0, LB1/g;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    return-wide v0

    .line 14
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ljava/lang/Long;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    return-wide v0
.end method

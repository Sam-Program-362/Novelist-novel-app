.class public final LH0/g;
.super Lcom/google/android/gms/common/api/internal/BasePendingResult;
.source "SourceFile"


# instance fields
.field public final synthetic m:I


# direct methods
.method public constructor <init>(LK0/l;I)V
    .locals 0

    .line 1
    iput p2, p0, LH0/g;->m:I

    .line 2
    .line 3
    const-string p2, "GoogleApiClient must not be null"

    .line 4
    .line 5
    invoke-static {p1, p2}, LM0/r;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;-><init>(LK0/l;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "Api must not be null"

    .line 12
    .line 13
    sget-object p2, LE0/a;->a:LA/c;

    .line 14
    .line 15
    invoke-static {p2, p1}, LM0/r;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final bridge synthetic M(Lcom/google/android/gms/common/api/Status;)LK0/n;
    .locals 1

    .line 1
    iget v0, p0, LH0/g;->m:I

    return-object p1
.end method

.method public final Q(LK0/c;)V
    .locals 4

    .line 1
    iget v0, p0, LH0/g;->m:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LH0/e;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->q()Landroid/os/IInterface;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, LH0/k;

    .line 13
    .line 14
    new-instance v1, LH0/f;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-direct {v1, p0, v2}, LH0/f;-><init>(LH0/g;I)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p1, LH0/e;->y:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 21
    .line 22
    invoke-virtual {v0}, LY0/a;->d()Landroid/os/Parcel;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    sget v3, LY0/n;->a:I

    .line 27
    .line 28
    invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v2, p1}, LY0/n;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 32
    .line 33
    .line 34
    const/16 p1, 0x67

    .line 35
    .line 36
    invoke-virtual {v0, v2, p1}, LY0/a;->e(Landroid/os/Parcel;I)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_0
    check-cast p1, LH0/e;

    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->q()Landroid/os/IInterface;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, LH0/k;

    .line 47
    .line 48
    new-instance v1, LH0/f;

    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    invoke-direct {v1, p0, v2}, LH0/f;-><init>(LH0/g;I)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p1, LH0/e;->y:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 55
    .line 56
    invoke-virtual {v0}, LY0/a;->d()Landroid/os/Parcel;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    sget v3, LY0/n;->a:I

    .line 61
    .line 62
    invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v2, p1}, LY0/n;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 66
    .line 67
    .line 68
    const/16 p1, 0x66

    .line 69
    .line 70
    invoke-virtual {v0, v2, p1}, LY0/a;->e(Landroid/os/Parcel;I)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final R(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    const-string v1, "Failed result must not be success"

    .line 8
    .line 9
    invoke-static {v1, v0}, LM0/r;->a(Ljava/lang/String;Z)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->M(Lcom/google/android/gms/common/api/Status;)LK0/n;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->P(LK0/n;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.class public final LX0/f;
.super LY0/h;
.source "SourceFile"

# interfaces
.implements LX0/a;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lg1/e;


# direct methods
.method public constructor <init>(Lg1/e;I)V
    .locals 0

    .line 1
    iput p2, p0, LX0/f;->b:I

    .line 2
    .line 3
    iput-object p1, p0, LX0/f;->c:Lg1/e;

    .line 4
    .line 5
    invoke-direct {p0}, LY0/h;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string p1, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks"

    .line 9
    .line 10
    invoke-virtual {p0, p0, p1}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public b(Lcom/google/android/gms/common/api/Status;LW0/q;)V
    .locals 0

    .line 1
    const-string p2, "status"

    .line 2
    .line 3
    invoke-static {p1, p2}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 9
    .line 10
    .line 11
    throw p1
.end method

.method public c(Lcom/google/android/gms/common/api/Status;LW0/f;)V
    .locals 0

    .line 1
    const-string p2, "status"

    .line 2
    .line 3
    invoke-static {p1, p2}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 9
    .line 10
    .line 11
    throw p1
.end method

.method public g(Lcom/google/android/gms/common/api/Status;LW0/l;)V
    .locals 1

    .line 1
    iget v0, p0, LX0/f;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string p2, "status"

    .line 7
    .line 8
    invoke-static {p1, p2}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 14
    .line 15
    .line 16
    throw p1

    .line 17
    :pswitch_0
    const-string v0, "status"

    .line 18
    .line 19
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, LX0/f;->c:Lg1/e;

    .line 23
    .line 24
    invoke-static {p1, p2, v0}, LH2/h;->y(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lg1/e;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public h(Lcom/google/android/gms/common/api/Status;LW0/c;)V
    .locals 1

    .line 1
    iget v0, p0, LX0/f;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string p2, "status"

    .line 7
    .line 8
    invoke-static {p1, p2}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 14
    .line 15
    .line 16
    throw p1

    .line 17
    :pswitch_0
    const-string v0, "status"

    .line 18
    .line 19
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, LX0/f;->c:Lg1/e;

    .line 23
    .line 24
    invoke-static {p1, p2, v0}, LH2/h;->y(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lg1/e;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

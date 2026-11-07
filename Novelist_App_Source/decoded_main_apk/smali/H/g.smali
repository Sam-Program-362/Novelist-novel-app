.class public final LH/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/OutcomeReceiver;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LH/d;


# direct methods
.method public constructor <init>(LA/c;LH/h;)V
    .locals 0

    const/4 p2, 0x1

    iput p2, p0, LH/g;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LH/g;->b:LH/d;

    return-void
.end method

.method public constructor <init>(LB1/a;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LH/g;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, LH/g;->b:LH/d;

    return-void
.end method


# virtual methods
.method public final onError(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    iget v0, p0, LH/g;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, LD/f0;->l(Ljava/lang/Throwable;)Landroid/credentials/GetCredentialException;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string v0, "error"

    .line 11
    .line 12
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v0, "CredManProvService"

    .line 16
    .line 17
    const-string v1, "GetCredentialResponse error returned from framework"

    .line 18
    .line 19
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, LH/g;->b:LH/d;

    .line 23
    .line 24
    check-cast v0, LA/c;

    .line 25
    .line 26
    invoke-static {p1}, LD/f0;->r(Landroid/credentials/GetCredentialException;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-string v2, "getType(...)"

    .line 31
    .line 32
    invoke-static {v1, v2}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-static {p1}, LD/f0;->y(Landroid/credentials/GetCredentialException;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {p1, v1}, LE2/a;->U(Ljava/lang/CharSequence;Ljava/lang/String;)LI/f;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {v0, p1}, LA/c;->b(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :pswitch_0
    invoke-static {p1}, LD/f0;->d(Ljava/lang/Throwable;)Landroid/credentials/ClearCredentialStateException;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-string v0, "error"

    .line 52
    .line 53
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const-string p1, "CredManProvService"

    .line 57
    .line 58
    const-string v0, "ClearCredentialStateException error returned from framework"

    .line 59
    .line 60
    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    iget-object p1, p0, LH/g;->b:LH/d;

    .line 64
    .line 65
    check-cast p1, LB1/a;

    .line 66
    .line 67
    new-instance v0, LI/a;

    .line 68
    .line 69
    const/4 v1, 0x0

    .line 70
    invoke-direct {v0, v1}, LI/a;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v0}, LB1/a;->b(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onResult(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget v0, p0, LH/g;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, LD/f0;->o(Ljava/lang/Object;)Landroid/credentials/GetCredentialResponse;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string v0, "response"

    .line 11
    .line 12
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v0, "CredManProvService"

    .line 16
    .line 17
    const-string v1, "GetCredentialResponse returned from framework"

    .line 18
    .line 19
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, LH/g;->b:LH/d;

    .line 23
    .line 24
    check-cast v0, LA/c;

    .line 25
    .line 26
    invoke-static {p1}, LD/f0;->f(Landroid/credentials/GetCredentialResponse;)Landroid/credentials/Credential;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const-string v1, "getCredential(...)"

    .line 31
    .line 32
    invoke-static {p1, v1}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    new-instance v1, LH/l;

    .line 36
    .line 37
    invoke-static {p1}, LD/f0;->q(Landroid/credentials/Credential;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    const-string v3, "getType(...)"

    .line 42
    .line 43
    invoke-static {v2, v3}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-static {p1}, LD/f0;->p(Landroid/credentials/Credential;)Landroid/os/Bundle;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const-string v3, "getData(...)"

    .line 51
    .line 52
    invoke-static {p1, v3}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-static {v2, p1}, LH2/h;->j(Ljava/lang/String;Landroid/os/Bundle;)LH/c;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-direct {v1, p1}, LH/l;-><init>(LH/c;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1}, LA/c;->onResult(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :pswitch_0
    check-cast p1, Ljava/lang/Void;

    .line 67
    .line 68
    const-string v0, "CredManProvService"

    .line 69
    .line 70
    const-string v1, "Clear result returned from framework: "

    .line 71
    .line 72
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    iget-object v0, p0, LH/g;->b:LH/d;

    .line 76
    .line 77
    check-cast v0, LB1/a;

    .line 78
    .line 79
    invoke-virtual {v0, p1}, LB1/a;->onResult(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

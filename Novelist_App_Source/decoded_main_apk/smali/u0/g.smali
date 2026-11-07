.class public final Lu0/g;
.super LE2/a;
.source "SourceFile"


# instance fields
.field public final e:Ljava/lang/Object;

.field public final f:I

.field public final g:Lu0/a;


# direct methods
.method public constructor <init>(Ljava/lang/Object;ILu0/a;)V
    .locals 1

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "verificationMode"

    .line 7
    .line 8
    invoke-static {v0, p2}, LB1/e;->q(Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lu0/g;->e:Ljava/lang/Object;

    .line 15
    .line 16
    iput p2, p0, Lu0/g;->f:I

    .line 17
    .line 18
    iput-object p3, p0, Lu0/g;->g:Lu0/a;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final L(Ljava/lang/String;LZ1/l;)LE2/a;
    .locals 3

    .line 1
    iget-object v0, p0, Lu0/g;->e:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-interface {p2, v0}, LZ1/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    new-instance p2, Lu0/f;

    .line 17
    .line 18
    iget-object v1, p0, Lu0/g;->g:Lu0/a;

    .line 19
    .line 20
    iget v2, p0, Lu0/g;->f:I

    .line 21
    .line 22
    invoke-direct {p2, v0, p1, v1, v2}, Lu0/f;-><init>(Ljava/lang/Object;Ljava/lang/String;Lu0/a;I)V

    .line 23
    .line 24
    .line 25
    return-object p2
.end method

.method public final e()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lu0/g;->e:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

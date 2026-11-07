.class public final Lb0/f;
.super LH2/h;
.source "SourceFile"


# instance fields
.field public final i:Z

.field public j:Z

.field public k:LA/c;


# direct methods
.method public constructor <init>(Lb0/U;Z)V
    .locals 1

    .line 1
    const-string v0, "operation"

    .line 2
    .line 3
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, LH2/h;-><init>(Lb0/U;)V

    .line 7
    .line 8
    .line 9
    iput-boolean p2, p0, Lb0/f;->i:Z

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final S(Landroid/content/Context;)LA/c;
    .locals 0

    .line 1
    iget-boolean p1, p0, Lb0/f;->j:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lb0/f;->k:LA/c;

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    throw p1
.end method

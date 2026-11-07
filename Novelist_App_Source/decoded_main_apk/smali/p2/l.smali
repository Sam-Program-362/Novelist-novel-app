.class public final Lp2/l;
.super Li2/q;
.source "SourceFile"


# static fields
.field public static final m:Lp2/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lp2/l;

    .line 2
    .line 3
    invoke-direct {v0}, Li2/q;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lp2/l;->m:Lp2/l;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c(LR1/h;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    sget-object p1, Lp2/e;->n:Lp2/e;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    iget-object p1, p1, Lp2/h;->m:Lp2/c;

    .line 5
    .line 6
    invoke-virtual {p1, p2, v0}, Lp2/c;->b(Ljava/lang/Runnable;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final g(I)Li2/q;
    .locals 1

    .line 1
    invoke-static {p1}, Ln2/a;->a(I)V

    .line 2
    .line 3
    .line 4
    sget v0, Lp2/k;->d:I

    .line 5
    .line 6
    if-lt p1, v0, :cond_0

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-super {p0, p1}, Li2/q;->g(I)Li2/q;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "Dispatchers.IO"

    .line 2
    .line 3
    return-object v0
.end method

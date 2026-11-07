.class public LD/Q;
.super LD/P;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LD/P;-><init>()V

    return-void
.end method

.method public constructor <init>(LD/h0;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LD/P;-><init>(LD/h0;)V

    .line 3
    iget-object p1, p1, LD/h0;->a:LD/d0;

    .line 4
    invoke-virtual {p1}, LD/d0;->q()Z

    return-void
.end method


# virtual methods
.method public c(LD/h0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public d(ILw/b;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, LD/P;->d(ILw/b;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

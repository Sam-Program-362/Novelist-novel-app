.class public final Ll2/k;
.super LT1/c;
.source "SourceFile"


# instance fields
.field public n:LK1/r;

.field public o:Ljava/lang/Object;

.field public synthetic p:Ljava/lang/Object;

.field public final synthetic q:LK1/r;

.field public r:I


# direct methods
.method public constructor <init>(LK1/r;LR1/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll2/k;->q:LK1/r;

    .line 2
    .line 3
    invoke-direct {p0, p2}, LT1/c;-><init>(LR1/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, Ll2/k;->p:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Ll2/k;->r:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Ll2/k;->r:I

    .line 9
    .line 10
    iget-object p1, p0, Ll2/k;->q:LK1/r;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, LK1/r;->g(Ljava/lang/Object;LR1/c;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.class public final LV/A;
.super LT1/c;
.source "SourceFile"


# instance fields
.field public n:LV/N;

.field public o:LV/j0;

.field public p:Z

.field public synthetic q:Ljava/lang/Object;

.field public final synthetic r:LV/N;

.field public s:I


# direct methods
.method public constructor <init>(LV/N;LR1/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV/A;->r:LV/N;

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
    iput-object p1, p0, LV/A;->q:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LV/A;->s:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LV/A;->s:I

    .line 9
    .line 10
    iget-object p1, p0, LV/A;->r:LV/N;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {p1, v0, p0}, LV/N;->e(LV/N;ZLR1/c;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

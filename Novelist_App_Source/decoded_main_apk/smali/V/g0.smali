.class public final LV/g0;
.super LT1/c;
.source "SourceFile"


# instance fields
.field public n:Lq2/c;

.field public o:Z

.field public synthetic p:Ljava/lang/Object;

.field public final synthetic q:LV/i0;

.field public r:I


# direct methods
.method public constructor <init>(LV/i0;LT1/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV/g0;->q:LV/i0;

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
    iput-object p1, p0, LV/g0;->p:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LV/g0;->r:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LV/g0;->r:I

    .line 9
    .line 10
    iget-object p1, p0, LV/g0;->q:LV/i0;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, LV/i0;->c(LZ1/p;LT1/c;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

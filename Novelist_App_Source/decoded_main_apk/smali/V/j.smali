.class public final LV/j;
.super LT1/c;
.source "SourceFile"


# instance fields
.field public n:Ljava/lang/Object;

.field public o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;

.field public q:La2/o;

.field public r:LV/N;

.field public synthetic s:Ljava/lang/Object;

.field public final synthetic t:LV/k;

.field public u:I


# direct methods
.method public constructor <init>(LV/k;LT1/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV/j;->t:LV/k;

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
    iput-object p1, p0, LV/j;->s:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LV/j;->u:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LV/j;->u:I

    .line 9
    .line 10
    iget-object p1, p0, LV/j;->t:LV/k;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, LV/k;->a(LV/g;LT1/c;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

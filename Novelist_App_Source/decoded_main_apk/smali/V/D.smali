.class public final LV/D;
.super LT1/c;
.source "SourceFile"


# instance fields
.field public n:Ljava/lang/Object;

.field public o:Ljava/lang/Object;

.field public p:Ljava/io/Serializable;

.field public q:La2/o;

.field public r:Z

.field public s:I

.field public synthetic t:Ljava/lang/Object;

.field public final synthetic u:LV/N;

.field public v:I


# direct methods
.method public constructor <init>(LV/N;LT1/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV/D;->u:LV/N;

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
    iput-object p1, p0, LV/D;->t:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LV/D;->v:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LV/D;->v:I

    .line 9
    .line 10
    iget-object p1, p0, LV/D;->u:LV/N;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {p1, v0, p0}, LV/N;->f(LV/N;ZLT1/c;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

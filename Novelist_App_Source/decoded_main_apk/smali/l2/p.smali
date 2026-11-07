.class public final Ll2/p;
.super LT1/c;
.source "SourceFile"


# instance fields
.field public n:Ll2/q;

.field public o:Ll2/e;

.field public p:Ll2/s;

.field public q:Li2/N;

.field public r:Ljava/lang/Object;

.field public synthetic s:Ljava/lang/Object;

.field public final synthetic t:Ll2/q;

.field public u:I


# direct methods
.method public constructor <init>(Ll2/q;LR1/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll2/p;->t:Ll2/q;

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
    iput-object p1, p0, Ll2/p;->s:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Ll2/p;->u:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Ll2/p;->u:I

    .line 9
    .line 10
    iget-object p1, p0, Ll2/p;->t:Ll2/q;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, Ll2/q;->h(Ll2/e;LR1/c;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    sget-object p1, LS1/a;->k:LS1/a;

    .line 17
    .line 18
    return-object p1
.end method

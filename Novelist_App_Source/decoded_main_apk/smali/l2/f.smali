.class public final Ll2/f;
.super LT1/c;
.source "SourceFile"


# instance fields
.field public n:Ll2/e;

.field public o:Lk2/r;

.field public p:Lk2/b;

.field public q:Z

.field public synthetic r:Ljava/lang/Object;

.field public s:I


# virtual methods
.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, Ll2/f;->r:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Ll2/f;->s:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Ll2/f;->s:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-static {p1, p1, v0, p0}, Ll2/r;->b(Ll2/e;Lk2/p;ZLT1/c;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

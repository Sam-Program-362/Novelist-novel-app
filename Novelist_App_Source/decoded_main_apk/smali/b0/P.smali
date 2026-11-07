.class public final Lb0/P;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:Lb0/s;

.field public c:Z

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:Landroidx/lifecycle/m;

.field public i:Landroidx/lifecycle/m;


# direct methods
.method public constructor <init>(ILb0/s;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lb0/P;->a:I

    .line 3
    iput-object p2, p0, Lb0/P;->b:Lb0/s;

    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lb0/P;->c:Z

    .line 5
    sget-object p1, Landroidx/lifecycle/m;->o:Landroidx/lifecycle/m;

    iput-object p1, p0, Lb0/P;->h:Landroidx/lifecycle/m;

    .line 6
    iput-object p1, p0, Lb0/P;->i:Landroidx/lifecycle/m;

    return-void
.end method

.method public constructor <init>(ILb0/s;I)V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput p1, p0, Lb0/P;->a:I

    .line 9
    iput-object p2, p0, Lb0/P;->b:Lb0/s;

    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lb0/P;->c:Z

    .line 11
    sget-object p1, Landroidx/lifecycle/m;->o:Landroidx/lifecycle/m;

    iput-object p1, p0, Lb0/P;->h:Landroidx/lifecycle/m;

    .line 12
    iput-object p1, p0, Lb0/P;->i:Landroidx/lifecycle/m;

    return-void
.end method

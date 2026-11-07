.class public final LV/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LT1/h;

.field public final b:Li2/m;

.field public final c:LV/j0;

.field public final d:LR1/h;


# direct methods
.method public constructor <init>(LZ1/p;Li2/m;LV/j0;LR1/h;)V
    .locals 1

    .line 1
    const-string v0, "callerContext"

    .line 2
    .line 3
    invoke-static {p4, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    check-cast p1, LT1/h;

    .line 10
    .line 11
    iput-object p1, p0, LV/a0;->a:LT1/h;

    .line 12
    .line 13
    iput-object p2, p0, LV/a0;->b:Li2/m;

    .line 14
    .line 15
    iput-object p3, p0, LV/a0;->c:LV/j0;

    .line 16
    .line 17
    iput-object p4, p0, LV/a0;->d:LR1/h;

    .line 18
    .line 19
    return-void
.end method

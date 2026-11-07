.class public final Li2/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR1/g;


# instance fields
.field public final k:LZ1/l;

.field public final l:LR1/g;


# direct methods
.method public constructor <init>(LR1/g;LZ1/l;)V
    .locals 1

    .line 1
    const-string v0, "baseKey"

    .line 2
    .line 3
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Li2/p;->k:LZ1/l;

    .line 10
    .line 11
    instance-of p2, p1, Li2/p;

    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    check-cast p1, Li2/p;

    .line 16
    .line 17
    iget-object p1, p1, Li2/p;->l:LR1/g;

    .line 18
    .line 19
    :cond_0
    iput-object p1, p0, Li2/p;->l:LR1/g;

    .line 20
    .line 21
    return-void
.end method

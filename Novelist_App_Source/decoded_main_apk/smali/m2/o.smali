.class public final Lm2/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll2/e;


# instance fields
.field public final k:Lk2/s;


# direct methods
.method public constructor <init>(Lk2/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm2/o;->k:Lk2/s;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;LR1/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lm2/o;->k:Lk2/s;

    .line 2
    .line 3
    invoke-interface {v0, p2, p1}, Lk2/s;->g(LR1/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object p2, LS1/a;->k:LS1/a;

    .line 8
    .line 9
    if-ne p1, p2, :cond_0

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    sget-object p1, LO1/g;->a:LO1/g;

    .line 13
    .line 14
    return-object p1
.end method

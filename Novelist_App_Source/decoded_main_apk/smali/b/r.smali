.class public final Lb/r;
.super Lh0/d;
.source "SourceFile"


# instance fields
.field public final c:LB1/s;

.field public final synthetic d:Lb/t;


# direct methods
.method public constructor <init>(Lb/t;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb/r;->d:Lb/t;

    .line 5
    .line 6
    new-instance v0, LB1/s;

    .line 7
    .line 8
    new-instance v1, LM1/K;

    .line 9
    .line 10
    const/16 v2, 0xc

    .line 11
    .line 12
    invoke-direct {v1, p1, v2}, LM1/K;-><init>(Ljava/lang/Object;I)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v1, v0, LB1/s;->k:Ljava/lang/Object;

    .line 19
    .line 20
    new-instance p1, Lh0/e;

    .line 21
    .line 22
    invoke-direct {p1}, Lh0/e;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, v0, LB1/s;->l:Ljava/lang/Object;

    .line 26
    .line 27
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 28
    .line 29
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 30
    .line 31
    .line 32
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 33
    .line 34
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, v0, LB1/s;->m:Ljava/lang/Object;

    .line 38
    .line 39
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 40
    .line 41
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p1, v0, LB1/s;->n:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-virtual {v0, p0}, LB1/s;->c(Lh0/d;)V

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, Lb/r;->c:LB1/s;

    .line 50
    .line 51
    return-void
.end method


# virtual methods
.method public final b(Z)V
    .locals 0

    .line 1
    iget-object p1, p0, Lb/r;->d:Lb/t;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    return-void
.end method

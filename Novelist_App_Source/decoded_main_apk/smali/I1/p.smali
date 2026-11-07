.class public final synthetic LI1/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg1/d;
.implements Lg1/c;


# instance fields
.field public final synthetic k:LI1/k;


# direct methods
.method public synthetic constructor <init>(LI1/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, LI1/p;->k:LI1/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    new-instance v0, LI1/d;

    .line 2
    .line 3
    const-string v1, "clearAuthorizationToken failed"

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-direct {v0, v1, p1}, LI1/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, LI1/p;->k:LI1/k;

    .line 13
    .line 14
    invoke-static {p1, v0}, La/a;->n(LZ1/l;LI1/d;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    new-instance p1, LO1/d;

    .line 4
    .line 5
    sget-object v0, LO1/g;->a:LO1/g;

    .line 6
    .line 7
    invoke-direct {p1, v0}, LO1/d;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, LI1/p;->k:LI1/k;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, LI1/k;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    return-void
.end method

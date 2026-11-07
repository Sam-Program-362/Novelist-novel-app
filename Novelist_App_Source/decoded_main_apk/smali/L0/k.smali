.class public final LL0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Z

.field public c:I

.field public d:Ljava/lang/Object;


# direct methods
.method public static b()LL0/k;
    .locals 2

    .line 1
    new-instance v0, LL0/k;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, v0, LL0/k;->b:Z

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    iput v1, v0, LL0/k;->c:I

    .line 11
    .line 12
    return-object v0
.end method


# virtual methods
.method public a()LL0/k;
    .locals 5

    .line 1
    iget-object v0, p0, LL0/k;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LL0/i;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    const-string v1, "execute parameter required"

    .line 11
    .line 12
    invoke-static {v1, v0}, LM0/r;->a(Ljava/lang/String;Z)V

    .line 13
    .line 14
    .line 15
    new-instance v0, LL0/k;

    .line 16
    .line 17
    iget-object v1, p0, LL0/k;->a:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, [LJ0/c;

    .line 20
    .line 21
    iget-boolean v2, p0, LL0/k;->b:Z

    .line 22
    .line 23
    iget v3, p0, LL0/k;->c:I

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p0, v0, LL0/k;->d:Ljava/lang/Object;

    .line 29
    .line 30
    iput-object v1, v0, LL0/k;->a:Ljava/lang/Object;

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    const/4 v4, 0x1

    .line 38
    :cond_1
    iput-boolean v4, v0, LL0/k;->b:Z

    .line 39
    .line 40
    iput v3, v0, LL0/k;->c:I

    .line 41
    .line 42
    return-object v0
.end method

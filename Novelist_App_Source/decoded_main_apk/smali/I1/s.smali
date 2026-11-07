.class public final LI1/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC1/o;
.implements LI1/o;


# instance fields
.field public final k:Landroid/content/Context;

.field public final l:LD/c;

.field public final m:LD/c;

.field public final n:LD/c;

.field public o:Landroid/app/Activity;

.field public p:LI1/k;


# direct methods
.method public constructor <init>(Landroid/content/Context;LD/c;LD/c;LD/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LI1/s;->k:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, LI1/s;->l:LD/c;

    .line 7
    .line 8
    iput-object p3, p0, LI1/s;->m:LD/c;

    .line 9
    .line 10
    iput-object p4, p0, LI1/s;->n:LD/c;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(IILandroid/content/Intent;)Z
    .locals 2

    .line 1
    const p2, 0xd02e

    .line 2
    .line 3
    .line 4
    if-ne p1, p2, :cond_1

    .line 5
    .line 6
    iget-object p1, p0, LI1/s;->p:LI1/k;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    :try_start_0
    iget-object p1, p0, LI1/s;->k:Landroid/content/Context;

    .line 11
    .line 12
    invoke-static {p1}, LD/c;->b(Landroid/content/Context;)LY0/b;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1, p3}, LY0/b;->d(Landroid/content/Intent;)LF0/a;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object p2, p0, LI1/s;->p:LI1/k;

    .line 21
    .line 22
    new-instance p3, LI1/w;

    .line 23
    .line 24
    iget-object v0, p1, LF0/a;->l:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v1, p1, LF0/a;->k:Ljava/lang/String;

    .line 27
    .line 28
    iget-object p1, p1, LF0/a;->n:Ljava/util/List;

    .line 29
    .line 30
    invoke-direct {p3, v0, p1, v1}, LI1/w;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p2, p3}, La/a;->o(LZ1/l;Ljava/lang/Object;)V
    :try_end_0
    .catch LK0/e; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    .line 35
    .line 36
    const/4 p1, 0x1

    .line 37
    return p1

    .line 38
    :catch_0
    move-exception p1

    .line 39
    iget-object p2, p0, LI1/s;->p:LI1/k;

    .line 40
    .line 41
    new-instance p3, LI1/a;

    .line 42
    .line 43
    sget-object v0, LI1/b;->p:LI1/b;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const/4 v1, 0x0

    .line 50
    invoke-direct {p3, v0, p1, v1}, LI1/a;-><init>(LI1/b;Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-static {p2, p3}, La/a;->o(LZ1/l;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iput-object v1, p0, LI1/s;->p:LI1/k;

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    const-string p1, "google_sign_in"

    .line 60
    .line 61
    const-string p2, "Unexpected authorization result callback"

    .line 62
    .line 63
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 67
    return p1
.end method

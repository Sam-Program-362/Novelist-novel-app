.class public final Lx0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:Lx0/g;

.field public static final b:LO1/e;

.field public static final c:Lx0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lx0/g;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lx0/g;->a:Lx0/g;

    .line 7
    .line 8
    const-class v0, Lx0/h;

    .line 9
    .line 10
    invoke-static {v0}, La2/p;->a(Ljava/lang/Class;)La2/e;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, La2/e;->c()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    new-instance v0, LO1/e;

    .line 18
    .line 19
    sget-object v1, Lx0/f;->l:Lx0/f;

    .line 20
    .line 21
    invoke-direct {v0, v1}, LO1/e;-><init>(LZ1/a;)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lx0/g;->b:LO1/e;

    .line 25
    .line 26
    sget-object v0, Lx0/a;->a:Lx0/a;

    .line 27
    .line 28
    sput-object v0, Lx0/g;->c:Lx0/a;

    .line 29
    .line 30
    return-void
.end method

.method public static a(Landroid/content/Context;)Lx0/b;
    .locals 5

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p0, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lx0/g;->b:LO1/e;

    .line 7
    .line 8
    invoke-virtual {v0}, LO1/e;->a()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ly0/a;

    .line 13
    .line 14
    if-nez v0, :cond_5

    .line 15
    .line 16
    sget-object v0, LA0/n;->c:LA0/n;

    .line 17
    .line 18
    sget-object v0, LA0/n;->c:LA0/n;

    .line 19
    .line 20
    if-nez v0, :cond_4

    .line 21
    .line 22
    sget-object v0, LA0/n;->d:Ljava/util/concurrent/locks/ReentrantLock;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 25
    .line 26
    .line 27
    :try_start_0
    sget-object v1, LA0/n;->c:LA0/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 28
    .line 29
    if-nez v1, :cond_3

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    :try_start_1
    invoke-static {}, LA0/i;->b()Lu0/h;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    if-nez v2, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    sget-object v3, Lu0/h;->p:Lu0/h;

    .line 40
    .line 41
    const-string v4, "other"

    .line 42
    .line 43
    invoke-static {v3, v4}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-object v2, v2, Lu0/h;->o:LO1/e;

    .line 47
    .line 48
    invoke-virtual {v2}, LO1/e;->a()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    const-string v4, "<get-bigInteger>(...)"

    .line 53
    .line 54
    invoke-static {v2, v4}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    check-cast v2, Ljava/math/BigInteger;

    .line 58
    .line 59
    iget-object v3, v3, Lu0/h;->o:LO1/e;

    .line 60
    .line 61
    invoke-virtual {v3}, LO1/e;->a()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-static {v3, v4}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    check-cast v3, Ljava/math/BigInteger;

    .line 69
    .line 70
    invoke-virtual {v2, v3}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-ltz v2, :cond_2

    .line 75
    .line 76
    new-instance v2, LA0/l;

    .line 77
    .line 78
    invoke-direct {v2, p0}, LA0/l;-><init>(Landroid/content/Context;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2}, LA0/l;->e()Z

    .line 82
    .line 83
    .line 84
    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 85
    if-nez p0, :cond_1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_1
    move-object v1, v2

    .line 89
    :catchall_0
    :cond_2
    :goto_0
    :try_start_2
    new-instance p0, LA0/n;

    .line 90
    .line 91
    invoke-direct {p0, v1}, LA0/n;-><init>(LA0/l;)V

    .line 92
    .line 93
    .line 94
    sput-object p0, LA0/n;->c:LA0/n;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :catchall_1
    move-exception p0

    .line 98
    goto :goto_2

    .line 99
    :cond_3
    :goto_1
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 100
    .line 101
    .line 102
    goto :goto_3

    .line 103
    :goto_2
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 104
    .line 105
    .line 106
    throw p0

    .line 107
    :cond_4
    :goto_3
    sget-object v0, LA0/n;->c:LA0/n;

    .line 108
    .line 109
    invoke-static {v0}, La2/h;->b(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    :cond_5
    new-instance p0, Lx0/b;

    .line 113
    .line 114
    sget v1, Lx0/m;->b:I

    .line 115
    .line 116
    invoke-direct {p0, v0}, Lx0/b;-><init>(Ly0/a;)V

    .line 117
    .line 118
    .line 119
    sget-object v0, Lx0/g;->c:Lx0/a;

    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    return-object p0
.end method

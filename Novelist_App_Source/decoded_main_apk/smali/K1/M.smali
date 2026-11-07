.class public abstract LK1/M;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:[Lf2/c;

.field public static final b:LX/c;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La2/k;

    .line 2
    .line 3
    const-string v1, "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"

    .line 4
    .line 5
    sget-object v2, La2/b;->k:La2/b;

    .line 6
    .line 7
    const-class v3, LK1/M;

    .line 8
    .line 9
    const-string v4, "sharedPreferencesDataStore"

    .line 10
    .line 11
    invoke-direct {v0, v2, v3, v4, v1}, La2/l;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    sget-object v1, La2/p;->a:La2/q;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    new-array v1, v1, [Lf2/c;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    aput-object v0, v1, v2

    .line 24
    .line 25
    sput-object v1, LK1/M;->a:[Lf2/c;

    .line 26
    .line 27
    sget-object v0, Li2/A;->a:Lp2/e;

    .line 28
    .line 29
    sget-object v0, Lp2/d;->m:Lp2/d;

    .line 30
    .line 31
    new-instance v1, Li2/c0;

    .line 32
    .line 33
    invoke-direct {v1}, Li2/P;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    sget-object v2, LR1/i;->k:LR1/i;

    .line 40
    .line 41
    if-ne v1, v2, :cond_0

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    invoke-interface {v1}, LR1/f;->getKey()LR1/g;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-interface {v0, v3}, LR1/h;->j(LR1/g;)LR1/h;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-ne v0, v2, :cond_1

    .line 53
    .line 54
    move-object v0, v1

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    sget-object v3, LR1/d;->k:LR1/d;

    .line 57
    .line 58
    invoke-interface {v0, v3}, LR1/h;->e(LR1/g;)LR1/f;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    check-cast v4, LR1/e;

    .line 63
    .line 64
    if-nez v4, :cond_2

    .line 65
    .line 66
    new-instance v2, LR1/b;

    .line 67
    .line 68
    invoke-direct {v2, v0, v1}, LR1/b;-><init>(LR1/h;LR1/f;)V

    .line 69
    .line 70
    .line 71
    :goto_0
    move-object v0, v2

    .line 72
    goto :goto_1

    .line 73
    :cond_2
    invoke-interface {v0, v3}, LR1/h;->j(LR1/g;)LR1/h;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    if-ne v0, v2, :cond_3

    .line 78
    .line 79
    new-instance v0, LR1/b;

    .line 80
    .line 81
    invoke-direct {v0, v1, v4}, LR1/b;-><init>(LR1/h;LR1/f;)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    new-instance v2, LR1/b;

    .line 86
    .line 87
    new-instance v3, LR1/b;

    .line 88
    .line 89
    invoke-direct {v3, v0, v1}, LR1/b;-><init>(LR1/h;LR1/f;)V

    .line 90
    .line 91
    .line 92
    invoke-direct {v2, v3, v4}, LR1/b;-><init>(LR1/h;LR1/f;)V

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :goto_1
    invoke-static {v0}, Li2/u;->a(LR1/h;)Ln2/c;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    new-instance v1, LX/c;

    .line 101
    .line 102
    sget-object v2, LX/a;->l:LX/a;

    .line 103
    .line 104
    invoke-direct {v1, v2, v0}, LX/c;-><init>(LZ1/l;Li2/s;)V

    .line 105
    .line 106
    .line 107
    sput-object v1, LK1/M;->b:LX/c;

    .line 108
    .line 109
    return-void
.end method

.method public static final a(Landroid/content/Context;)LB1/g;
    .locals 8

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LK1/M;->b:LX/c;

    .line 7
    .line 8
    sget-object v1, LK1/M;->a:[Lf2/c;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    aget-object v1, v1, v2

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const-string v2, "property"

    .line 17
    .line 18
    invoke-static {v1, v2}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object v1, v0, LX/c;->d:LB1/g;

    .line 22
    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    iget-object v1, v0, LX/c;->c:Ljava/lang/Object;

    .line 26
    .line 27
    monitor-enter v1

    .line 28
    :try_start_0
    iget-object v2, v0, LX/c;->d:LB1/g;

    .line 29
    .line 30
    if-nez v2, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    iget-object v2, v0, LX/c;->a:LZ1/l;

    .line 37
    .line 38
    const-string v3, "applicationContext"

    .line 39
    .line 40
    invoke-static {p0, v3}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {v2, p0}, LZ1/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Ljava/util/List;

    .line 48
    .line 49
    iget-object v3, v0, LX/c;->b:Li2/s;

    .line 50
    .line 51
    new-instance v4, LX/b;

    .line 52
    .line 53
    const/4 v5, 0x0

    .line 54
    invoke-direct {v4, p0, v0, v5}, LX/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 55
    .line 56
    .line 57
    const-string p0, "migrations"

    .line 58
    .line 59
    invoke-static {v2, p0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    new-instance p0, LV/T;

    .line 63
    .line 64
    new-instance v5, LV/S;

    .line 65
    .line 66
    const/4 v6, 0x1

    .line 67
    invoke-direct {v5, v4, v6}, LV/S;-><init>(Ljava/lang/Object;I)V

    .line 68
    .line 69
    .line 70
    invoke-direct {p0, v5}, LV/T;-><init>(LV/S;)V

    .line 71
    .line 72
    .line 73
    new-instance v4, LB1/g;

    .line 74
    .line 75
    new-instance v5, LM1/A;

    .line 76
    .line 77
    const/4 v6, 0x7

    .line 78
    invoke-direct {v5, v6}, LM1/A;-><init>(I)V

    .line 79
    .line 80
    .line 81
    new-instance v6, LV/d;

    .line 82
    .line 83
    const/4 v7, 0x0

    .line 84
    invoke-direct {v6, v2, v7}, LV/d;-><init>(Ljava/util/List;LR1/c;)V

    .line 85
    .line 86
    .line 87
    invoke-static {v6}, LE2/a;->B(Ljava/lang/Object;)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    new-instance v6, LV/N;

    .line 92
    .line 93
    invoke-direct {v6, p0, v2, v5, v3}, LV/N;-><init>(LV/T;Ljava/util/List;LM1/A;Li2/s;)V

    .line 94
    .line 95
    .line 96
    const/16 p0, 0x9

    .line 97
    .line 98
    invoke-direct {v4, v6, p0}, LB1/g;-><init>(Ljava/lang/Object;I)V

    .line 99
    .line 100
    .line 101
    new-instance p0, LB1/g;

    .line 102
    .line 103
    const/16 v2, 0x9

    .line 104
    .line 105
    invoke-direct {p0, v4, v2}, LB1/g;-><init>(Ljava/lang/Object;I)V

    .line 106
    .line 107
    .line 108
    iput-object p0, v0, LX/c;->d:LB1/g;

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :catchall_0
    move-exception p0

    .line 112
    goto :goto_1

    .line 113
    :cond_0
    :goto_0
    iget-object p0, v0, LX/c;->d:LB1/g;

    .line 114
    .line 115
    invoke-static {p0}, La2/h;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    .line 117
    .line 118
    monitor-exit v1

    .line 119
    return-object p0

    .line 120
    :goto_1
    monitor-exit v1

    .line 121
    throw p0

    .line 122
    :cond_1
    return-object v1
.end method

.method public static final b(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Set;)Z
    .locals 1

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p0, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-nez p2, :cond_2

    .line 7
    .line 8
    instance-of p0, p1, Ljava/lang/Boolean;

    .line 9
    .line 10
    if-nez p0, :cond_1

    .line 11
    .line 12
    instance-of p0, p1, Ljava/lang/Long;

    .line 13
    .line 14
    if-nez p0, :cond_1

    .line 15
    .line 16
    instance-of p0, p1, Ljava/lang/String;

    .line 17
    .line 18
    if-nez p0, :cond_1

    .line 19
    .line 20
    instance-of p0, p1, Ljava/lang/Double;

    .line 21
    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    return p0

    .line 27
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 28
    return p0

    .line 29
    :cond_2
    invoke-interface {p2, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    return p0
.end method

.method public static final c(Ljava/lang/Object;LB1/b;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p0, Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Ljava/lang/String;

    .line 7
    .line 8
    const-string v1, "<this>"

    .line 9
    .line 10
    invoke-static {v0, v1}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v1, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const-string v2, "substring(...)"

    .line 20
    .line 21
    const/16 v3, 0x28

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    const-string v1, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p0, v2}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, p0}, LB1/b;->d(Ljava/lang/String;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :cond_1
    const-string p1, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu"

    .line 47
    .line 48
    invoke-virtual {v0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {p0, v2}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 62
    .line 63
    .line 64
    move-result-wide p0

    .line 65
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    :cond_2
    return-object p0
.end method

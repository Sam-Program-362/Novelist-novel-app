.class public final Lj1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC1/o;


# static fields
.field public static final t:I

.field public static final u:I


# instance fields
.field public final k:Landroid/app/Activity;

.field public l:LB1/o;

.field public m:Z

.field public n:Z

.field public o:Ljava/lang/String;

.field public p:I

.field public q:Ljava/util/ArrayList;

.field public r:LC1/g;

.field public s:[B


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, Lj1/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/lit8 v1, v1, 0x2b

    .line 8
    .line 9
    const v2, 0xffff

    .line 10
    .line 11
    .line 12
    and-int/2addr v1, v2

    .line 13
    sput v1, Lj1/c;->t:I

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    add-int/lit8 v0, v0, 0x53

    .line 20
    .line 21
    and-int/2addr v0, v2

    .line 22
    sput v0, Lj1/c;->u:I

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    .line 1
    const-string v0, "activity"

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
    iput-object p1, p0, Lj1/c;->k:Landroid/app/Activity;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    iput-object p1, p0, Lj1/c;->l:LB1/o;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(IILandroid/content/Intent;)Z
    .locals 10

    .line 1
    sget v0, Lj1/c;->u:I

    .line 2
    .line 3
    iget-object v4, p0, Lj1/c;->k:Landroid/app/Activity;

    .line 4
    .line 5
    const/4 v9, 0x1

    .line 6
    const/4 v1, -0x1

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    if-ne p1, v0, :cond_6

    .line 10
    .line 11
    if-eq p2, v1, :cond_1

    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    goto :goto_3

    .line 16
    :cond_0
    invoke-virtual {p0, v2}, Lj1/c;->d(Ljava/io/Serializable;)V

    .line 17
    .line 18
    .line 19
    return v3

    .line 20
    :cond_1
    if-eqz p3, :cond_2

    .line 21
    .line 22
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    :cond_2
    if-nez v2, :cond_3

    .line 27
    .line 28
    :goto_0
    move v9, v3

    .line 29
    goto :goto_2

    .line 30
    :cond_3
    invoke-virtual {p0, v9}, Lj1/c;->b(Z)V

    .line 31
    .line 32
    .line 33
    :try_start_0
    iget-object p1, p0, Lj1/c;->s:[B

    .line 34
    .line 35
    const-string p2, "context"

    .line 36
    .line 37
    invoke-static {v4, p2}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-virtual {p2, v2}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    .line 45
    .line 46
    .line 47
    move-result-object p2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    if-eqz p2, :cond_5

    .line 49
    .line 50
    if-eqz p1, :cond_4

    .line 51
    .line 52
    :try_start_1
    invoke-virtual {p2, p1}, Ljava/io/OutputStream;->write([B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :catchall_0
    move-exception v0

    .line 57
    move-object p1, v0

    .line 58
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 59
    :catchall_1
    move-exception v0

    .line 60
    move-object p3, v0

    .line 61
    :try_start_3
    invoke-static {p2, p1}, La/a;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    throw p3

    .line 65
    :cond_4
    :goto_1
    invoke-interface {p2}, Ljava/io/Closeable;->close()V

    .line 66
    .line 67
    .line 68
    :cond_5
    invoke-virtual {v2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p0, p1}, Lj1/c;->d(Ljava/io/Serializable;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 73
    .line 74
    .line 75
    goto :goto_2

    .line 76
    :catch_0
    move-exception v0

    .line 77
    move-object p1, v0

    .line 78
    const-string p2, "FilePickerDelegate"

    .line 79
    .line 80
    const-string p3, "Error while saving file"

    .line 81
    .line 82
    invoke-static {p2, p3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {p0, p3, p1}, Lj1/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :goto_2
    return v9

    .line 94
    :cond_6
    sget v0, Lj1/c;->t:I

    .line 95
    .line 96
    if-ne p1, v0, :cond_a

    .line 97
    .line 98
    if-eq p2, v1, :cond_8

    .line 99
    .line 100
    if-eqz p2, :cond_7

    .line 101
    .line 102
    :goto_3
    return v3

    .line 103
    :cond_7
    invoke-virtual {p0, v2}, Lj1/c;->d(Ljava/io/Serializable;)V

    .line 104
    .line 105
    .line 106
    return v9

    .line 107
    :cond_8
    invoke-virtual {p0, v9}, Lj1/c;->b(Z)V

    .line 108
    .line 109
    .line 110
    iget v5, p0, Lj1/c;->p:I

    .line 111
    .line 112
    iget-boolean v6, p0, Lj1/c;->n:Z

    .line 113
    .line 114
    iget-object p1, p0, Lj1/c;->o:Ljava/lang/String;

    .line 115
    .line 116
    if-nez p1, :cond_9

    .line 117
    .line 118
    const-string p1, ""

    .line 119
    .line 120
    :cond_9
    move-object v7, p1

    .line 121
    const-string p1, "activity"

    .line 122
    .line 123
    invoke-static {v4, p1}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    sget-object p1, Li2/A;->a:Lp2/e;

    .line 127
    .line 128
    sget-object p1, Lp2/d;->m:Lp2/d;

    .line 129
    .line 130
    invoke-static {p1}, Li2/u;->a(LR1/h;)Ln2/c;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    new-instance v1, Lj1/g;

    .line 135
    .line 136
    const/4 v8, 0x0

    .line 137
    move-object v3, p0

    .line 138
    move-object v2, p3

    .line 139
    invoke-direct/range {v1 .. v8}, Lj1/g;-><init>(Landroid/content/Intent;Lj1/c;Landroid/app/Activity;IZLjava/lang/String;LR1/c;)V

    .line 140
    .line 141
    .line 142
    move-object p2, v3

    .line 143
    invoke-static {p1, v1}, Li2/u;->g(Li2/s;LZ1/p;)Li2/b0;

    .line 144
    .line 145
    .line 146
    return v9

    .line 147
    :cond_a
    move-object p2, p0

    .line 148
    const-string p1, "unknown_activity"

    .line 149
    .line 150
    const-string p3, "Unknown activity error, please file an issue."

    .line 151
    .line 152
    invoke-virtual {p0, p1, p3}, Lj1/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    return v3
.end method

.method public final b(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lj1/c;->r:LC1/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lj1/c;->o:Ljava/lang/String;

    .line 6
    .line 7
    const-string v1, "dir"

    .line 8
    .line 9
    invoke-static {v0, v1}, La2/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Landroid/os/Handler;

    .line 16
    .line 17
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 22
    .line 23
    .line 24
    new-instance v1, Lj1/b;

    .line 25
    .line 26
    invoke-direct {v1, p0, p1}, Lj1/b;-><init>(Lj1/c;Z)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lj1/c;->b(Z)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lj1/c;->l:LB1/o;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, p1, p2, v1}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iput-object v1, p0, Lj1/c;->l:LB1/o;

    .line 14
    .line 15
    return-void
.end method

.method public final d(Ljava/io/Serializable;)V
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lj1/c;->b(Z)V

    .line 3
    .line 4
    .line 5
    iget-object v1, p0, Lj1/c;->l:LB1/o;

    .line 6
    .line 7
    if-eqz v1, :cond_8

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    instance-of v3, p1, Ljava/lang/String;

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    move-object v3, p1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v3, v2

    .line 19
    :goto_0
    if-nez v3, :cond_7

    .line 20
    .line 21
    :cond_1
    instance-of v3, p1, Ljava/util/ArrayList;

    .line 22
    .line 23
    if-eqz v3, :cond_2

    .line 24
    .line 25
    check-cast p1, Ljava/util/ArrayList;

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_2
    move-object p1, v2

    .line 29
    :goto_1
    if-eqz p1, :cond_6

    .line 30
    .line 31
    new-instance v3, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    :cond_3
    :goto_2
    if-ge v0, v4, :cond_7

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    add-int/lit8 v0, v0, 0x1

    .line 47
    .line 48
    instance-of v6, v5, Lj1/a;

    .line 49
    .line 50
    if-eqz v6, :cond_4

    .line 51
    .line 52
    check-cast v5, Lj1/a;

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_4
    move-object v5, v2

    .line 56
    :goto_3
    if-eqz v5, :cond_5

    .line 57
    .line 58
    new-instance v6, LO1/b;

    .line 59
    .line 60
    const-string v7, "path"

    .line 61
    .line 62
    iget-object v8, v5, Lj1/a;->a:Ljava/lang/String;

    .line 63
    .line 64
    invoke-direct {v6, v7, v8}, LO1/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    new-instance v7, LO1/b;

    .line 68
    .line 69
    const-string v8, "name"

    .line 70
    .line 71
    iget-object v9, v5, Lj1/a;->b:Ljava/lang/String;

    .line 72
    .line 73
    invoke-direct {v7, v8, v9}, LO1/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    new-instance v8, LO1/b;

    .line 77
    .line 78
    iget-wide v9, v5, Lj1/a;->d:J

    .line 79
    .line 80
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    const-string v10, "size"

    .line 85
    .line 86
    invoke-direct {v8, v10, v9}, LO1/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    new-instance v9, LO1/b;

    .line 90
    .line 91
    const-string v10, "bytes"

    .line 92
    .line 93
    iget-object v11, v5, Lj1/a;->e:[B

    .line 94
    .line 95
    invoke-direct {v9, v10, v11}, LO1/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    new-instance v10, LO1/b;

    .line 99
    .line 100
    iget-object v5, v5, Lj1/a;->c:Landroid/net/Uri;

    .line 101
    .line 102
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    const-string v11, "identifier"

    .line 107
    .line 108
    invoke-direct {v10, v11, v5}, LO1/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    filled-new-array {v6, v7, v8, v9, v10}, [LO1/b;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    new-instance v6, Ljava/util/HashMap;

    .line 116
    .line 117
    const/4 v7, 0x5

    .line 118
    invoke-static {v7}, LP1/p;->S(I)I

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    invoke-direct {v6, v7}, Ljava/util/HashMap;-><init>(I)V

    .line 123
    .line 124
    .line 125
    invoke-static {v6, v5}, LP1/p;->T(Ljava/util/HashMap;[LO1/b;)V

    .line 126
    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_5
    move-object v6, v2

    .line 130
    :goto_4
    if-eqz v6, :cond_3

    .line 131
    .line 132
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_6
    move-object v3, v2

    .line 137
    :cond_7
    invoke-virtual {v1, v3}, LB1/o;->d(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    iput-object v2, p0, Lj1/c;->l:LB1/o;

    .line 141
    .line 142
    :cond_8
    return-void
.end method

.class public final Lj/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:I

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Lj/e;->k:I

    iput-object p1, p0, Lj/e;->o:Ljava/lang/Object;

    iput-object p2, p0, Lj/e;->l:Ljava/lang/Object;

    iput-object p3, p0, Lj/e;->m:Ljava/lang/Object;

    iput-object p4, p0, Lj/e;->n:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lj/e;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "error "

    .line 7
    .line 8
    const-string v1, "delete database "

    .line 9
    .line 10
    sget-object v2, Lk1/l;->p:Ljava/lang/Object;

    .line 11
    .line 12
    monitor-enter v2

    .line 13
    :try_start_0
    iget-object v3, p0, Lj/e;->l:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Lk1/e;

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    iget-object v4, p0, Lj/e;->o:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v4, Lk1/l;

    .line 22
    .line 23
    invoke-static {v4, v3}, Lk1/l;->a(Lk1/l;Lk1/e;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    goto :goto_4

    .line 29
    :cond_0
    :goto_0
    :try_start_1
    sget v3, Lk1/l;->q:I

    .line 30
    .line 31
    invoke-static {v3}, Lk1/a;->a(I)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    const-string v3, "Sqflite"

    .line 38
    .line 39
    new-instance v4, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget-object v1, p0, Lj/e;->m:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-static {v3, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :catch_0
    move-exception v1

    .line 60
    goto :goto_2

    .line 61
    :cond_1
    :goto_1
    iget-object v1, p0, Lj/e;->m:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v1, Ljava/lang/String;

    .line 64
    .line 65
    new-instance v3, Ljava/io/File;

    .line 66
    .line 67
    invoke-direct {v3, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-static {v3}, Landroid/database/sqlite/SQLiteDatabase;->deleteDatabase(Ljava/io/File;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    .line 72
    .line 73
    goto :goto_3

    .line 74
    :goto_2
    :try_start_2
    const-string v3, "Sqflite"

    .line 75
    .line 76
    new-instance v4, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v0, " while closing database "

    .line 85
    .line 86
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    sget v0, Lk1/l;->u:I

    .line 90
    .line 91
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-static {v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 99
    .line 100
    .line 101
    :goto_3
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 102
    iget-object v0, p0, Lj/e;->n:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v0, LB1/o;

    .line 105
    .line 106
    const/4 v1, 0x0

    .line 107
    invoke-virtual {v0, v1}, LB1/o;->d(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :goto_4
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 112
    throw v0

    .line 113
    :pswitch_0
    iget-object v0, p0, Lj/e;->o:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v0, LH0/i;

    .line 116
    .line 117
    iget-object v0, v0, LH0/i;->l:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v0, Lj/g;

    .line 120
    .line 121
    iget-object v1, p0, Lj/e;->m:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v1, Lj/k;

    .line 124
    .line 125
    iget-object v2, p0, Lj/e;->l:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v2, Lj/f;

    .line 128
    .line 129
    if-eqz v2, :cond_2

    .line 130
    .line 131
    const/4 v3, 0x1

    .line 132
    iput-boolean v3, v0, Lj/g;->J:Z

    .line 133
    .line 134
    iget-object v2, v2, Lj/f;->b:Lj/j;

    .line 135
    .line 136
    const/4 v3, 0x0

    .line 137
    invoke-virtual {v2, v3}, Lj/j;->c(Z)V

    .line 138
    .line 139
    .line 140
    iput-boolean v3, v0, Lj/g;->J:Z

    .line 141
    .line 142
    :cond_2
    invoke-virtual {v1}, Lj/k;->isEnabled()Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-eqz v0, :cond_3

    .line 147
    .line 148
    invoke-virtual {v1}, Lj/k;->hasSubMenu()Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-eqz v0, :cond_3

    .line 153
    .line 154
    iget-object v0, p0, Lj/e;->n:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v0, Lj/j;

    .line 157
    .line 158
    const/4 v2, 0x4

    .line 159
    const/4 v3, 0x0

    .line 160
    invoke-virtual {v0, v1, v3, v2}, Lj/j;->p(Landroid/view/MenuItem;Lj/l;I)Z

    .line 161
    .line 162
    .line 163
    :cond_3
    return-void

    .line 164
    nop

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.class public final Lr1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lr1/b;

.field public b:Ls1/c;

.field public c:Lr1/n;

.field public d:Lio/flutter/plugin/platform/f;

.field public e:LG1/a;

.field public f:Lr1/c;

.field public g:Z

.field public h:Z

.field public i:Z

.field public j:Z

.field public k:Ljava/lang/Integer;

.field public final l:Lio/flutter/embedding/engine/renderer/a;


# direct methods
.method public constructor <init>(Lr1/b;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/flutter/embedding/engine/renderer/a;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, p0, v1}, Lio/flutter/embedding/engine/renderer/a;-><init>(Ljava/lang/Object;I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lr1/e;->l:Lio/flutter/embedding/engine/renderer/a;

    .line 11
    .line 12
    iput-object p1, p0, Lr1/e;->a:Lr1/b;

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    iput-boolean p1, p0, Lr1/e;->i:Z

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a(Ls1/g;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lr1/e;->a:Lr1/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr1/b;->a()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    :cond_0
    invoke-static {}, LA0/j;->E()LA0/j;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v0, v0, LA0/j;->l:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lw1/c;

    .line 22
    .line 23
    iget-object v0, v0, Lw1/c;->e:Lg1/i;

    .line 24
    .line 25
    iget-object v0, v0, Lg1/i;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Ljava/lang/String;

    .line 28
    .line 29
    :cond_1
    new-instance v1, Lt1/b;

    .line 30
    .line 31
    iget-object v2, p0, Lr1/e;->a:Lr1/b;

    .line 32
    .line 33
    invoke-virtual {v2}, Lr1/b;->f()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-direct {v1, v0, v2}, Lt1/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lr1/e;->a:Lr1/b;

    .line 41
    .line 42
    invoke-virtual {v0}, Lr1/b;->g()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-nez v0, :cond_2

    .line 47
    .line 48
    iget-object v0, p0, Lr1/e;->a:Lr1/b;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {p0, v0}, Lr1/e;->d(Landroid/content/Intent;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    if-nez v0, :cond_2

    .line 62
    .line 63
    const-string v0, "/"

    .line 64
    .line 65
    :cond_2
    iput-object v1, p1, Ls1/g;->b:Lt1/b;

    .line 66
    .line 67
    iput-object v0, p1, Ls1/g;->c:Ljava/lang/String;

    .line 68
    .line 69
    iget-object v0, p0, Lr1/e;->a:Lr1/b;

    .line 70
    .line 71
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    const-string v1, "dart_entrypoint_args"

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, Ljava/util/List;

    .line 82
    .line 83
    iput-object v0, p1, Ls1/g;->d:Ljava/util/List;

    .line 84
    .line 85
    return-void
.end method

.method public final b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lr1/e;->a:Lr1/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr1/b;->k()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lr1/e;->a:Lr1/b;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v2, "FlutterActivity "

    .line 17
    .line 18
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v2, " connection to the engine "

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object v2, v0, Lr1/b;->l:Lr1/e;

    .line 30
    .line 31
    iget-object v2, v2, Lr1/e;->b:Ls1/c;

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v2, " evicted by another attaching activity"

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const-string v2, "FlutterActivity"

    .line 46
    .line 47
    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    iget-object v1, v0, Lr1/b;->l:Lr1/e;

    .line 51
    .line 52
    if-eqz v1, :cond_0

    .line 53
    .line 54
    invoke-virtual {v1}, Lr1/e;->e()V

    .line 55
    .line 56
    .line 57
    iget-object v0, v0, Lr1/b;->l:Lr1/e;

    .line 58
    .line 59
    invoke-virtual {v0}, Lr1/e;->f()V

    .line 60
    .line 61
    .line 62
    :cond_0
    return-void

    .line 63
    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    .line 64
    .line 65
    new-instance v1, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    const-string v2, "The internal FlutterEngine created by "

    .line 68
    .line 69
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    iget-object v2, p0, Lr1/e;->a:Lr1/b;

    .line 73
    .line 74
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v2, " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine"

    .line 78
    .line 79
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    throw v0
.end method

.method public final c()V
    .locals 2

    .line 1
    iget-object v0, p0, Lr1/e;->a:Lr1/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v1, "Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate."

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method public final d(Landroid/content/Intent;)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lr1/e;->a:Lr1/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {v0}, Lr1/b;->i()Landroid/os/Bundle;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "flutter_deeplinking_enabled"

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x1

    .line 26
    goto :goto_0

    .line 27
    :catch_0
    const/4 v0, 0x0

    .line 28
    :goto_0
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    return-object p1

    .line 41
    :cond_1
    const/4 p1, 0x0

    .line 42
    return-object p1
.end method

.method public final e()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lr1/e;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lr1/e;->f:Lr1/c;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lr1/e;->c:Lr1/n;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lr1/e;->f:Lr1/c;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-object v0, p0, Lr1/e;->f:Lr1/c;

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lr1/e;->c:Lr1/n;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, Lr1/n;->a()V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lr1/e;->c:Lr1/n;

    .line 30
    .line 31
    iget-object v1, p0, Lr1/e;->l:Lio/flutter/embedding/engine/renderer/a;

    .line 32
    .line 33
    iget-object v0, v0, Lr1/n;->q:Ljava/util/HashSet;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    :cond_1
    return-void
.end method

.method public final f()V
    .locals 11

    .line 1
    iget-boolean v0, p0, Lr1/e;->j:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, Lr1/e;->c()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lr1/e;->a:Lr1/b;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lr1/e;->a:Lr1/b;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lr1/e;->a:Lr1/b;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/4 v1, 0x1

    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    iget-object v0, p0, Lr1/e;->b:Ls1/c;

    .line 32
    .line 33
    iget-object v0, v0, Ls1/c;->d:Lj0/a;

    .line 34
    .line 35
    invoke-virtual {v0}, Lj0/a;->f()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    const-string v2, "FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges"

    .line 42
    .line 43
    invoke-static {v2}, LN1/a;->b(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :try_start_0
    iput-boolean v1, v0, Lj0/a;->a:Z

    .line 47
    .line 48
    iget-object v2, v0, Lj0/a;->f:Ljava/io/Serializable;

    .line 49
    .line 50
    check-cast v2, Ljava/util/HashMap;

    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_1

    .line 65
    .line 66
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    check-cast v3, Lz1/a;

    .line 71
    .line 72
    invoke-interface {v3}, Lz1/a;->onDetachedFromActivityForConfigChanges()V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :catchall_0
    move-exception v0

    .line 77
    goto :goto_1

    .line 78
    :cond_1
    invoke-virtual {v0}, Lj0/a;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    .line 80
    .line 81
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 82
    .line 83
    .line 84
    goto :goto_3

    .line 85
    :goto_1
    :try_start_1
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 86
    .line 87
    .line 88
    goto :goto_2

    .line 89
    :catchall_1
    move-exception v1

    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 91
    .line 92
    .line 93
    :goto_2
    throw v0

    .line 94
    :cond_2
    const-string v0, "FlutterEngineCxnRegstry"

    .line 95
    .line 96
    const-string v2, "Attempted to detach plugins from an Activity when no Activity was attached."

    .line 97
    .line 98
    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 99
    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_3
    iget-object v0, p0, Lr1/e;->b:Ls1/c;

    .line 103
    .line 104
    iget-object v0, v0, Ls1/c;->d:Lj0/a;

    .line 105
    .line 106
    invoke-virtual {v0}, Lj0/a;->c()V

    .line 107
    .line 108
    .line 109
    :goto_3
    iget-object v0, p0, Lr1/e;->d:Lio/flutter/plugin/platform/f;

    .line 110
    .line 111
    const/4 v2, 0x0

    .line 112
    if-eqz v0, :cond_4

    .line 113
    .line 114
    iget-object v0, v0, Lio/flutter/plugin/platform/f;->b:LA/c;

    .line 115
    .line 116
    iput-object v2, v0, LA/c;->m:Ljava/lang/Object;

    .line 117
    .line 118
    iput-object v2, p0, Lr1/e;->d:Lio/flutter/plugin/platform/f;

    .line 119
    .line 120
    :cond_4
    iget-object v0, p0, Lr1/e;->e:LG1/a;

    .line 121
    .line 122
    if-eqz v0, :cond_5

    .line 123
    .line 124
    iget-object v3, v0, LG1/a;->c:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v3, LB1/g;

    .line 127
    .line 128
    iput-object v2, v3, LB1/g;->l:Ljava/lang/Object;

    .line 129
    .line 130
    iput-object v2, v0, LG1/a;->b:Ljava/lang/Object;

    .line 131
    .line 132
    iput-object v2, p0, Lr1/e;->e:LG1/a;

    .line 133
    .line 134
    :cond_5
    iget-object v0, p0, Lr1/e;->a:Lr1/b;

    .line 135
    .line 136
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    iget-object v0, p0, Lr1/e;->b:Ls1/c;

    .line 140
    .line 141
    if-eqz v0, :cond_6

    .line 142
    .line 143
    iget-object v0, v0, Ls1/c;->g:LB1/f;

    .line 144
    .line 145
    iget-boolean v3, v0, LB1/f;->c:Z

    .line 146
    .line 147
    invoke-virtual {v0, v1, v3}, LB1/f;->a(IZ)V

    .line 148
    .line 149
    .line 150
    :cond_6
    iget-object v0, p0, Lr1/e;->a:Lr1/b;

    .line 151
    .line 152
    invoke-virtual {v0}, Lr1/b;->k()Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    const/4 v1, 0x0

    .line 157
    if-eqz v0, :cond_10

    .line 158
    .line 159
    iget-object v0, p0, Lr1/e;->b:Ls1/c;

    .line 160
    .line 161
    iget-object v3, v0, Ls1/c;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 162
    .line 163
    iget-object v4, v0, Ls1/c;->v:Ljava/util/HashSet;

    .line 164
    .line 165
    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 166
    .line 167
    .line 168
    move-result-object v4

    .line 169
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 170
    .line 171
    .line 172
    move-result v5

    .line 173
    if-eqz v5, :cond_7

    .line 174
    .line 175
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    check-cast v5, Ls1/b;

    .line 180
    .line 181
    invoke-interface {v5}, Ls1/b;->a()V

    .line 182
    .line 183
    .line 184
    goto :goto_4

    .line 185
    :cond_7
    iget-object v4, v0, Ls1/c;->d:Lj0/a;

    .line 186
    .line 187
    invoke-virtual {v4}, Lj0/a;->e()V

    .line 188
    .line 189
    .line 190
    new-instance v5, Ljava/util/HashSet;

    .line 191
    .line 192
    iget-object v6, v4, Lj0/a;->b:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v6, Ljava/util/HashMap;

    .line 195
    .line 196
    invoke-virtual {v6}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 197
    .line 198
    .line 199
    move-result-object v7

    .line 200
    invoke-direct {v5, v7}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 204
    .line 205
    .line 206
    move-result-object v5

    .line 207
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 208
    .line 209
    .line 210
    move-result v7

    .line 211
    if-eqz v7, :cond_b

    .line 212
    .line 213
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v7

    .line 217
    check-cast v7, Ljava/lang/Class;

    .line 218
    .line 219
    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v8

    .line 223
    check-cast v8, Ly1/b;

    .line 224
    .line 225
    if-nez v8, :cond_8

    .line 226
    .line 227
    goto :goto_5

    .line 228
    :cond_8
    invoke-virtual {v7}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v9

    .line 232
    const-string v10, "FlutterEngineConnectionRegistry#remove "

    .line 233
    .line 234
    invoke-virtual {v10, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v9

    .line 238
    invoke-static {v9}, LN1/a;->b(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    :try_start_2
    instance-of v9, v8, Lz1/a;

    .line 242
    .line 243
    if-eqz v9, :cond_a

    .line 244
    .line 245
    invoke-virtual {v4}, Lj0/a;->f()Z

    .line 246
    .line 247
    .line 248
    move-result v9

    .line 249
    if-eqz v9, :cond_9

    .line 250
    .line 251
    move-object v9, v8

    .line 252
    check-cast v9, Lz1/a;

    .line 253
    .line 254
    invoke-interface {v9}, Lz1/a;->onDetachedFromActivity()V

    .line 255
    .line 256
    .line 257
    goto :goto_6

    .line 258
    :catchall_2
    move-exception v0

    .line 259
    goto :goto_7

    .line 260
    :cond_9
    :goto_6
    iget-object v9, v4, Lj0/a;->f:Ljava/io/Serializable;

    .line 261
    .line 262
    check-cast v9, Ljava/util/HashMap;

    .line 263
    .line 264
    invoke-virtual {v9, v7}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    :cond_a
    iget-object v9, v4, Lj0/a;->e:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast v9, Ly1/a;

    .line 270
    .line 271
    invoke-interface {v8, v9}, Ly1/b;->onDetachedFromEngine(Ly1/a;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v6, v7}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 275
    .line 276
    .line 277
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 278
    .line 279
    .line 280
    goto :goto_5

    .line 281
    :goto_7
    :try_start_3
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 282
    .line 283
    .line 284
    goto :goto_8

    .line 285
    :catchall_3
    move-exception v1

    .line 286
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 287
    .line 288
    .line 289
    :goto_8
    throw v0

    .line 290
    :cond_b
    invoke-virtual {v6}, Ljava/util/HashMap;->clear()V

    .line 291
    .line 292
    .line 293
    iget-object v4, v0, Ls1/c;->s:Lio/flutter/plugin/platform/s;

    .line 294
    .line 295
    iget-object v5, v4, Lio/flutter/plugin/platform/s;->v:Landroid/util/SparseArray;

    .line 296
    .line 297
    :goto_9
    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    .line 298
    .line 299
    .line 300
    move-result v6

    .line 301
    if-lez v6, :cond_c

    .line 302
    .line 303
    invoke-virtual {v5, v1}, Landroid/util/SparseArray;->keyAt(I)I

    .line 304
    .line 305
    .line 306
    move-result v6

    .line 307
    iget-object v7, v4, Lio/flutter/plugin/platform/s;->G:Lio/flutter/plugin/platform/o;

    .line 308
    .line 309
    invoke-virtual {v7, v6}, Lio/flutter/plugin/platform/o;->p(I)V

    .line 310
    .line 311
    .line 312
    goto :goto_9

    .line 313
    :cond_c
    iget-object v4, v0, Ls1/c;->t:Lio/flutter/plugin/platform/r;

    .line 314
    .line 315
    iget-object v5, v4, Lio/flutter/plugin/platform/r;->s:Landroid/util/SparseArray;

    .line 316
    .line 317
    :goto_a
    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    .line 318
    .line 319
    .line 320
    move-result v6

    .line 321
    if-lez v6, :cond_d

    .line 322
    .line 323
    invoke-virtual {v5, v1}, Landroid/util/SparseArray;->keyAt(I)I

    .line 324
    .line 325
    .line 326
    move-result v6

    .line 327
    iget-object v7, v4, Lio/flutter/plugin/platform/r;->A:Lio/flutter/plugin/platform/o;

    .line 328
    .line 329
    invoke-virtual {v7, v6}, Lio/flutter/plugin/platform/o;->p(I)V

    .line 330
    .line 331
    .line 332
    goto :goto_a

    .line 333
    :cond_d
    iget-object v4, v0, Ls1/c;->c:Lt1/c;

    .line 334
    .line 335
    iget-object v4, v4, Lt1/c;->k:Lio/flutter/embedding/engine/FlutterJNI;

    .line 336
    .line 337
    invoke-virtual {v4, v2}, Lio/flutter/embedding/engine/FlutterJNI;->setPlatformMessageHandler(Lt1/k;)V

    .line 338
    .line 339
    .line 340
    iget-object v4, v0, Ls1/c;->x:Ls1/a;

    .line 341
    .line 342
    invoke-virtual {v3, v4}, Lio/flutter/embedding/engine/FlutterJNI;->removeEngineLifecycleListener(Ls1/b;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v3, v2}, Lio/flutter/embedding/engine/FlutterJNI;->setDeferredComponentManager(Lu1/a;)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v3}, Lio/flutter/embedding/engine/FlutterJNI;->detachFromNativeAndReleaseResources()V

    .line 349
    .line 350
    .line 351
    invoke-static {}, LA0/j;->E()LA0/j;

    .line 352
    .line 353
    .line 354
    move-result-object v3

    .line 355
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    sget-object v3, Ls1/c;->z:Ljava/util/HashMap;

    .line 359
    .line 360
    iget-wide v4, v0, Ls1/c;->w:J

    .line 361
    .line 362
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    invoke-virtual {v3, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    iget-object v0, p0, Lr1/e;->a:Lr1/b;

    .line 370
    .line 371
    invoke-virtual {v0}, Lr1/b;->e()Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    if-eqz v0, :cond_f

    .line 376
    .line 377
    sget-object v0, Ls1/i;->c:Ls1/i;

    .line 378
    .line 379
    if-nez v0, :cond_e

    .line 380
    .line 381
    new-instance v0, Ls1/i;

    .line 382
    .line 383
    const/4 v3, 0x1

    .line 384
    invoke-direct {v0, v3}, Ls1/i;-><init>(I)V

    .line 385
    .line 386
    .line 387
    sput-object v0, Ls1/i;->c:Ls1/i;

    .line 388
    .line 389
    :cond_e
    sget-object v0, Ls1/i;->c:Ls1/i;

    .line 390
    .line 391
    iget-object v3, p0, Lr1/e;->a:Lr1/b;

    .line 392
    .line 393
    invoke-virtual {v3}, Lr1/b;->e()Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v3

    .line 397
    iget-object v0, v0, Ls1/i;->a:Ljava/util/HashMap;

    .line 398
    .line 399
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    :cond_f
    iput-object v2, p0, Lr1/e;->b:Ls1/c;

    .line 403
    .line 404
    :cond_10
    iput-boolean v1, p0, Lr1/e;->j:Z

    .line 405
    .line 406
    return-void
.end method

.class public final LJ1/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# instance fields
.field public final k:Landroid/app/Activity;

.field public final synthetic l:LJ1/p;


# direct methods
.method public constructor <init>(LJ1/p;Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LJ1/o;->l:LJ1/p;

    .line 5
    .line 6
    iput-object p2, p0, LJ1/o;->k:Landroid/app/Activity;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/s;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final b(Landroidx/lifecycle/s;)V
    .locals 0

    .line 1
    iget-object p1, p0, LJ1/o;->k:Landroid/app/Activity;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LJ1/o;->onActivityDestroyed(Landroid/app/Activity;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final c(Landroidx/lifecycle/s;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final e(Landroidx/lifecycle/s;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final f(Landroidx/lifecycle/s;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final g(Landroidx/lifecycle/s;)V
    .locals 0

    .line 1
    iget-object p1, p0, LJ1/o;->k:Landroid/app/Activity;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LJ1/o;->onActivityStopped(Landroid/app/Activity;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget-object v0, p0, LJ1/o;->k:Landroid/app/Activity;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Landroid/app/Application;

    .line 16
    .line 17
    invoke-virtual {p1, p0}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 7

    .line 1
    iget-object v0, p0, LJ1/o;->k:Landroid/app/Activity;

    .line 2
    .line 3
    if-ne v0, p1, :cond_7

    .line 4
    .line 5
    iget-object p1, p0, LJ1/o;->l:LJ1/p;

    .line 6
    .line 7
    iget-object p1, p1, LJ1/p;->l:Lk/u0;

    .line 8
    .line 9
    iget-object p1, p1, Lk/u0;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, LJ1/n;

    .line 12
    .line 13
    iget-object v0, p1, LJ1/n;->v:Ljava/lang/Object;

    .line 14
    .line 15
    monitor-enter v0

    .line 16
    :try_start_0
    iget-object v1, p1, LJ1/n;->u:LA0/j;

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    goto/16 :goto_2

    .line 24
    .line 25
    :cond_0
    iget-object v1, v1, LA0/j;->l:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, LJ1/q;

    .line 28
    .line 29
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    iget-object v0, p1, LJ1/n;->n:LH/f;

    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    move v3, v2

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v3, 0x2

    .line 38
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {v3}, LX/j;->a(I)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    const/4 v4, 0x0

    .line 46
    if-eqz v3, :cond_3

    .line 47
    .line 48
    if-eq v3, v2, :cond_2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    const-string v2, "video"

    .line 52
    .line 53
    iget-object v0, v0, LH/f;->a:Landroid/content/Context;

    .line 54
    .line 55
    const-string v3, "flutter_image_picker_shared_preference"

    .line 56
    .line 57
    invoke-virtual {v0, v3, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    const-string v3, "flutter_image_picker_type"

    .line 66
    .line 67
    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    const-string v2, "image"

    .line 76
    .line 77
    iget-object v0, v0, LH/f;->a:Landroid/content/Context;

    .line 78
    .line 79
    const-string v3, "flutter_image_picker_shared_preference"

    .line 80
    .line 81
    invoke-virtual {v0, v3, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    const-string v3, "flutter_image_picker_type"

    .line 90
    .line 91
    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 96
    .line 97
    .line 98
    :goto_1
    if-eqz v1, :cond_6

    .line 99
    .line 100
    iget-object v0, p1, LJ1/n;->n:LH/f;

    .line 101
    .line 102
    iget-object v0, v0, LH/f;->a:Landroid/content/Context;

    .line 103
    .line 104
    const-string v2, "flutter_image_picker_shared_preference"

    .line 105
    .line 106
    invoke-virtual {v0, v2, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    iget-object v2, v1, LJ1/q;->a:Ljava/lang/Double;

    .line 115
    .line 116
    if-eqz v2, :cond_4

    .line 117
    .line 118
    const-string v3, "flutter_image_picker_max_width"

    .line 119
    .line 120
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 121
    .line 122
    .line 123
    move-result-wide v5

    .line 124
    invoke-static {v5, v6}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 125
    .line 126
    .line 127
    move-result-wide v5

    .line 128
    invoke-interface {v0, v3, v5, v6}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 129
    .line 130
    .line 131
    :cond_4
    iget-object v2, v1, LJ1/q;->b:Ljava/lang/Double;

    .line 132
    .line 133
    if-eqz v2, :cond_5

    .line 134
    .line 135
    const-string v3, "flutter_image_picker_max_height"

    .line 136
    .line 137
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 138
    .line 139
    .line 140
    move-result-wide v5

    .line 141
    invoke-static {v5, v6}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 142
    .line 143
    .line 144
    move-result-wide v5

    .line 145
    invoke-interface {v0, v3, v5, v6}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 146
    .line 147
    .line 148
    :cond_5
    const-string v2, "flutter_image_picker_image_quality"

    .line 149
    .line 150
    iget-wide v5, v1, LJ1/q;->c:J

    .line 151
    .line 152
    long-to-int v1, v5

    .line 153
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 154
    .line 155
    .line 156
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 157
    .line 158
    .line 159
    :cond_6
    iget-object v0, p1, LJ1/n;->t:Landroid/net/Uri;

    .line 160
    .line 161
    if-eqz v0, :cond_7

    .line 162
    .line 163
    iget-object p1, p1, LJ1/n;->n:LH/f;

    .line 164
    .line 165
    iget-object p1, p1, LH/f;->a:Landroid/content/Context;

    .line 166
    .line 167
    const-string v1, "flutter_image_picker_shared_preference"

    .line 168
    .line 169
    invoke-virtual {p1, v1, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    const-string v1, "flutter_image_picker_pending_image_uri"

    .line 178
    .line 179
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 188
    .line 189
    .line 190
    return-void

    .line 191
    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 192
    throw p1

    .line 193
    :cond_7
    return-void
.end method

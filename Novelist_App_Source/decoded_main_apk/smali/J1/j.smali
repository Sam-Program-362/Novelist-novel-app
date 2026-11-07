.class public final synthetic LJ1/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:I

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;II)V
    .locals 0

    .line 1
    iput p3, p0, LJ1/j;->k:I

    iput-object p1, p0, LJ1/j;->l:Ljava/lang/Object;

    iput p2, p0, LJ1/j;->m:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, LJ1/j;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LJ1/j;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lio/flutter/plugin/platform/e;

    .line 9
    .line 10
    iget-object v0, v0, Lio/flutter/plugin/platform/e;->b:Lio/flutter/plugin/platform/f;

    .line 11
    .line 12
    iget-object v0, v0, Lio/flutter/plugin/platform/f;->b:LA/c;

    .line 13
    .line 14
    iget v1, p0, LJ1/j;->m:I

    .line 15
    .line 16
    and-int/lit8 v1, v1, 0x4

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    const-string v3, "SystemChrome.systemUIChange"

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    iget-object v0, v0, LA/c;->l:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, LB1/s;

    .line 26
    .line 27
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 28
    .line 29
    filled-new-array {v1}, [Ljava/lang/Boolean;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v3, v1, v2}, LB1/s;->s(Ljava/lang/String;Ljava/lang/Object;LB1/o;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    iget-object v0, v0, LA/c;->l:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, LB1/s;

    .line 44
    .line 45
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 46
    .line 47
    filled-new-array {v1}, [Ljava/lang/Boolean;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v0, v3, v1, v2}, LB1/s;->s(Ljava/lang/String;Ljava/lang/Object;LB1/o;)V

    .line 56
    .line 57
    .line 58
    :goto_0
    return-void

    .line 59
    :pswitch_0
    iget-object v0, p0, LJ1/j;->l:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, LJ1/n;

    .line 62
    .line 63
    iget v1, p0, LJ1/j;->m:I

    .line 64
    .line 65
    const/4 v2, -0x1

    .line 66
    const/4 v3, 0x0

    .line 67
    if-ne v1, v2, :cond_3

    .line 68
    .line 69
    iget-object v1, v0, LJ1/n;->t:Landroid/net/Uri;

    .line 70
    .line 71
    iget-object v2, v0, LJ1/n;->p:LB1/a;

    .line 72
    .line 73
    const-string v4, ""

    .line 74
    .line 75
    if-eqz v1, :cond_1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    iget-object v1, v0, LJ1/n;->n:LH/f;

    .line 79
    .line 80
    iget-object v1, v1, LH/f;->a:Landroid/content/Context;

    .line 81
    .line 82
    const-string v5, "flutter_image_picker_shared_preference"

    .line 83
    .line 84
    const/4 v6, 0x0

    .line 85
    invoke-virtual {v1, v5, v6}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    const-string v5, "flutter_image_picker_pending_image_uri"

    .line 90
    .line 91
    invoke-interface {v1, v5, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    :goto_1
    new-instance v5, LJ1/k;

    .line 100
    .line 101
    const/4 v6, 0x1

    .line 102
    invoke-direct {v5, v0, v6}, LJ1/k;-><init>(LJ1/n;I)V

    .line 103
    .line 104
    .line 105
    iget-object v0, v2, LB1/a;->l:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v0, Landroid/app/Activity;

    .line 108
    .line 109
    if-eqz v1, :cond_2

    .line 110
    .line 111
    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    :cond_2
    filled-new-array {v4}, [Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    new-instance v2, LJ1/l;

    .line 120
    .line 121
    invoke-direct {v2, v5}, LJ1/l;-><init>(LJ1/k;)V

    .line 122
    .line 123
    .line 124
    invoke-static {v0, v1, v3, v2}, Landroid/media/MediaScannerConnection;->scanFile(Landroid/content/Context;[Ljava/lang/String;[Ljava/lang/String;Landroid/media/MediaScannerConnection$OnScanCompletedListener;)V

    .line 125
    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_3
    invoke-virtual {v0, v3}, LJ1/n;->e(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    :goto_2
    return-void

    .line 132
    :pswitch_1
    iget-object v0, p0, LJ1/j;->l:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v0, LJ1/n;

    .line 135
    .line 136
    iget v1, p0, LJ1/j;->m:I

    .line 137
    .line 138
    const/4 v2, -0x1

    .line 139
    const/4 v3, 0x0

    .line 140
    if-ne v1, v2, :cond_6

    .line 141
    .line 142
    iget-object v1, v0, LJ1/n;->t:Landroid/net/Uri;

    .line 143
    .line 144
    iget-object v2, v0, LJ1/n;->p:LB1/a;

    .line 145
    .line 146
    const-string v4, ""

    .line 147
    .line 148
    if-eqz v1, :cond_4

    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_4
    iget-object v1, v0, LJ1/n;->n:LH/f;

    .line 152
    .line 153
    iget-object v1, v1, LH/f;->a:Landroid/content/Context;

    .line 154
    .line 155
    const-string v5, "flutter_image_picker_shared_preference"

    .line 156
    .line 157
    const/4 v6, 0x0

    .line 158
    invoke-virtual {v1, v5, v6}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    const-string v5, "flutter_image_picker_pending_image_uri"

    .line 163
    .line 164
    invoke-interface {v1, v5, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    :goto_3
    new-instance v5, LJ1/k;

    .line 173
    .line 174
    const/4 v6, 0x0

    .line 175
    invoke-direct {v5, v0, v6}, LJ1/k;-><init>(LJ1/n;I)V

    .line 176
    .line 177
    .line 178
    iget-object v0, v2, LB1/a;->l:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v0, Landroid/app/Activity;

    .line 181
    .line 182
    if-eqz v1, :cond_5

    .line 183
    .line 184
    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    :cond_5
    filled-new-array {v4}, [Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    new-instance v2, LJ1/l;

    .line 193
    .line 194
    invoke-direct {v2, v5}, LJ1/l;-><init>(LJ1/k;)V

    .line 195
    .line 196
    .line 197
    invoke-static {v0, v1, v3, v2}, Landroid/media/MediaScannerConnection;->scanFile(Landroid/content/Context;[Ljava/lang/String;[Ljava/lang/String;Landroid/media/MediaScannerConnection$OnScanCompletedListener;)V

    .line 198
    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_6
    invoke-virtual {v0, v3}, LJ1/n;->e(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    :goto_4
    return-void

    .line 205
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

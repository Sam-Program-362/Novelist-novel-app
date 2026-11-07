.class public final synthetic LJ1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:I

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:I

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, LJ1/i;->k:I

    iput-object p1, p0, LJ1/i;->l:Ljava/lang/Object;

    iput p2, p0, LJ1/i;->m:I

    iput-object p3, p0, LJ1/i;->n:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, LJ1/i;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LJ1/i;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lj0/a;

    .line 9
    .line 10
    iget-object v0, v0, Lj0/a;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lj0/d;

    .line 13
    .line 14
    iget v1, p0, LJ1/i;->m:I

    .line 15
    .line 16
    iget-object v2, p0, LJ1/i;->n:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-interface {v0, v1, v2}, Lj0/d;->d(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    iget-object v0, p0, LJ1/i;->l:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, LJ1/n;

    .line 25
    .line 26
    iget-object v1, p0, LJ1/i;->n:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Landroid/content/Intent;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    const/4 v2, -0x1

    .line 34
    iget v3, p0, LJ1/i;->m:I

    .line 35
    .line 36
    if-ne v3, v2, :cond_2

    .line 37
    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-virtual {v0, v1, v2}, LJ1/n;->f(Landroid/content/Intent;Z)Ljava/util/ArrayList;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    const/4 v4, 0x1

    .line 52
    if-ge v3, v4, :cond_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, LJ1/m;

    .line 60
    .line 61
    iget-object v1, v1, LJ1/m;->a:Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, LJ1/n;->e(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    :goto_0
    const-string v1, "no_valid_video_uri"

    .line 68
    .line 69
    const-string v2, "Cannot find the selected video."

    .line 70
    .line 71
    invoke-virtual {v0, v1, v2}, LJ1/n;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    const/4 v1, 0x0

    .line 76
    invoke-virtual {v0, v1}, LJ1/n;->e(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :goto_1
    return-void

    .line 80
    :pswitch_1
    iget-object v0, p0, LJ1/i;->l:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v0, LJ1/n;

    .line 83
    .line 84
    iget-object v1, p0, LJ1/i;->n:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v1, Landroid/content/Intent;

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    const/4 v2, -0x1

    .line 92
    iget v3, p0, LJ1/i;->m:I

    .line 93
    .line 94
    if-ne v3, v2, :cond_4

    .line 95
    .line 96
    if-eqz v1, :cond_4

    .line 97
    .line 98
    const/4 v2, 0x1

    .line 99
    invoke-virtual {v0, v1, v2}, LJ1/n;->f(Landroid/content/Intent;Z)Ljava/util/ArrayList;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    if-nez v1, :cond_3

    .line 104
    .line 105
    const-string v1, "no_valid_media_uri"

    .line 106
    .line 107
    const-string v2, "Cannot find the selected media."

    .line 108
    .line 109
    invoke-virtual {v0, v1, v2}, LJ1/n;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_3
    invoke-virtual {v0, v1}, LJ1/n;->h(Ljava/util/ArrayList;)V

    .line 114
    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_4
    const/4 v1, 0x0

    .line 118
    invoke-virtual {v0, v1}, LJ1/n;->e(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    :goto_2
    return-void

    .line 122
    :pswitch_2
    iget-object v0, p0, LJ1/i;->l:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v0, LJ1/n;

    .line 125
    .line 126
    iget-object v1, p0, LJ1/i;->n:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v1, Landroid/content/Intent;

    .line 129
    .line 130
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    const/4 v2, -0x1

    .line 134
    iget v3, p0, LJ1/i;->m:I

    .line 135
    .line 136
    if-ne v3, v2, :cond_6

    .line 137
    .line 138
    if-eqz v1, :cond_6

    .line 139
    .line 140
    const/4 v2, 0x0

    .line 141
    invoke-virtual {v0, v1, v2}, LJ1/n;->f(Landroid/content/Intent;Z)Ljava/util/ArrayList;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    if-nez v1, :cond_5

    .line 146
    .line 147
    const-string v1, "missing_valid_video_uri"

    .line 148
    .line 149
    const-string v2, "Cannot find at least one of the selected videos."

    .line 150
    .line 151
    invoke-virtual {v0, v1, v2}, LJ1/n;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_5
    invoke-virtual {v0, v1}, LJ1/n;->h(Ljava/util/ArrayList;)V

    .line 156
    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_6
    const/4 v1, 0x0

    .line 160
    invoke-virtual {v0, v1}, LJ1/n;->e(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    :goto_3
    return-void

    .line 164
    :pswitch_3
    iget-object v0, p0, LJ1/i;->l:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v0, LJ1/n;

    .line 167
    .line 168
    iget-object v1, p0, LJ1/i;->n:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v1, Landroid/content/Intent;

    .line 171
    .line 172
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    const/4 v2, -0x1

    .line 176
    iget v3, p0, LJ1/i;->m:I

    .line 177
    .line 178
    if-ne v3, v2, :cond_8

    .line 179
    .line 180
    if-eqz v1, :cond_8

    .line 181
    .line 182
    const/4 v2, 0x0

    .line 183
    invoke-virtual {v0, v1, v2}, LJ1/n;->f(Landroid/content/Intent;Z)Ljava/util/ArrayList;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    if-nez v1, :cond_7

    .line 188
    .line 189
    const-string v1, "missing_valid_image_uri"

    .line 190
    .line 191
    const-string v2, "Cannot find at least one of the selected images."

    .line 192
    .line 193
    invoke-virtual {v0, v1, v2}, LJ1/n;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_7
    invoke-virtual {v0, v1}, LJ1/n;->h(Ljava/util/ArrayList;)V

    .line 198
    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_8
    const/4 v1, 0x0

    .line 202
    invoke-virtual {v0, v1}, LJ1/n;->e(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    :goto_4
    return-void

    .line 206
    :pswitch_4
    iget-object v0, p0, LJ1/i;->l:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v0, LJ1/n;

    .line 209
    .line 210
    iget-object v1, p0, LJ1/i;->n:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v1, Landroid/content/Intent;

    .line 213
    .line 214
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    const/4 v2, -0x1

    .line 218
    iget v3, p0, LJ1/i;->m:I

    .line 219
    .line 220
    if-ne v3, v2, :cond_a

    .line 221
    .line 222
    if-eqz v1, :cond_a

    .line 223
    .line 224
    const/4 v2, 0x0

    .line 225
    invoke-virtual {v0, v1, v2}, LJ1/n;->f(Landroid/content/Intent;Z)Ljava/util/ArrayList;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    if-nez v1, :cond_9

    .line 230
    .line 231
    const-string v1, "no_valid_image_uri"

    .line 232
    .line 233
    const-string v2, "Cannot find the selected image."

    .line 234
    .line 235
    invoke-virtual {v0, v1, v2}, LJ1/n;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    goto :goto_5

    .line 239
    :cond_9
    invoke-virtual {v0, v1}, LJ1/n;->h(Ljava/util/ArrayList;)V

    .line 240
    .line 241
    .line 242
    goto :goto_5

    .line 243
    :cond_a
    const/4 v1, 0x0

    .line 244
    invoke-virtual {v0, v1}, LJ1/n;->e(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    :goto_5
    return-void

    .line 248
    nop

    .line 249
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

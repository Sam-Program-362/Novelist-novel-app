.class public final Lj1/g;
.super LT1/h;
.source "SourceFile"

# interfaces
.implements LZ1/p;


# instance fields
.field public final synthetic o:Landroid/content/Intent;

.field public final synthetic p:Lj1/c;

.field public final synthetic q:Landroid/app/Activity;

.field public final synthetic r:I

.field public final synthetic s:Z

.field public final synthetic t:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Intent;Lj1/c;Landroid/app/Activity;IZLjava/lang/String;LR1/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lj1/g;->o:Landroid/content/Intent;

    .line 2
    .line 3
    iput-object p2, p0, Lj1/g;->p:Lj1/c;

    .line 4
    .line 5
    iput-object p3, p0, Lj1/g;->q:Landroid/app/Activity;

    .line 6
    .line 7
    iput p4, p0, Lj1/g;->r:I

    .line 8
    .line 9
    iput-boolean p5, p0, Lj1/g;->s:Z

    .line 10
    .line 11
    iput-object p6, p0, Lj1/g;->t:Ljava/lang/String;

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p7}, LT1/h;-><init>(ILR1/c;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Li2/s;

    .line 2
    .line 3
    check-cast p2, LR1/c;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lj1/g;->i(LR1/c;Ljava/lang/Object;)LR1/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lj1/g;

    .line 10
    .line 11
    sget-object p2, LO1/g;->a:LO1/g;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lj1/g;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final i(LR1/c;Ljava/lang/Object;)LR1/c;
    .locals 8

    .line 1
    new-instance v0, Lj1/g;

    .line 2
    .line 3
    iget-boolean v5, p0, Lj1/g;->s:Z

    .line 4
    .line 5
    iget-object v6, p0, Lj1/g;->t:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v1, p0, Lj1/g;->o:Landroid/content/Intent;

    .line 8
    .line 9
    iget-object v2, p0, Lj1/g;->p:Lj1/c;

    .line 10
    .line 11
    iget-object v3, p0, Lj1/g;->q:Landroid/app/Activity;

    .line 12
    .line 13
    iget v4, p0, Lj1/g;->r:I

    .line 14
    .line 15
    move-object v7, p1

    .line 16
    invoke-direct/range {v0 .. v7}, Lj1/g;-><init>(Landroid/content/Intent;Lj1/c;Landroid/app/Activity;IZLjava/lang/String;LR1/c;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    const-string v0, "selectedItems"

    .line 2
    .line 3
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, LO1/g;->a:LO1/g;

    .line 7
    .line 8
    const-string v1, "Unknown activity error, please fill an issue."

    .line 9
    .line 10
    const-string v2, "unknown_activity"

    .line 11
    .line 12
    iget-object v3, p0, Lj1/g;->p:Lj1/c;

    .line 13
    .line 14
    iget-object v4, p0, Lj1/g;->o:Landroid/content/Intent;

    .line 15
    .line 16
    if-nez v4, :cond_0

    .line 17
    .line 18
    invoke-virtual {v3, v2, v1}, Lj1/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    new-instance v5, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    :try_start_0
    invoke-virtual {v4}, Landroid/content/Intent;->getClipData()Landroid/content/ClipData;

    .line 28
    .line 29
    .line 30
    move-result-object v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    iget v7, p0, Lj1/g;->r:I

    .line 32
    .line 33
    iget-boolean v8, p0, Lj1/g;->s:Z

    .line 34
    .line 35
    const/4 v9, 0x0

    .line 36
    iget-object v10, p0, Lj1/g;->q:Landroid/app/Activity;

    .line 37
    .line 38
    if-eqz v6, :cond_2

    .line 39
    .line 40
    :try_start_1
    invoke-virtual {v4}, Landroid/content/Intent;->getClipData()Landroid/content/ClipData;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v0}, La2/h;->b(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Landroid/content/ClipData;->getItemCount()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    :goto_0
    if-ge v9, v0, :cond_1

    .line 52
    .line 53
    invoke-virtual {v4}, Landroid/content/Intent;->getClipData()Landroid/content/ClipData;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-static {v1}, La2/h;->b(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v9}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v1}, Landroid/content/ClipData$Item;->getUri()Landroid/net/Uri;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-static {v1}, La2/h;->b(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    invoke-static {v10, v1, v7}, Lj1/h;->b(Landroid/app/Activity;Landroid/net/Uri;I)Landroid/net/Uri;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-static {v10, v1, v8, v5}, Lj1/h;->a(Landroid/app/Activity;Landroid/net/Uri;ZLjava/util/ArrayList;)V

    .line 76
    .line 77
    .line 78
    add-int/lit8 v9, v9, 0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :catch_0
    move-exception v0

    .line 82
    goto/16 :goto_4

    .line 83
    .line 84
    :cond_1
    invoke-virtual {v3, v5}, Lj1/c;->d(Ljava/io/Serializable;)V

    .line 85
    .line 86
    .line 87
    return-object p1

    .line 88
    :cond_2
    invoke-virtual {v4}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    if-eqz v6, :cond_6

    .line 93
    .line 94
    invoke-virtual {v4}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-static {v0}, La2/h;->b(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    invoke-static {v10, v0, v7}, Lj1/h;->b(Landroid/app/Activity;Landroid/net/Uri;I)Landroid/net/Uri;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    iget-object v1, p0, Lj1/g;->t:Ljava/lang/String;

    .line 106
    .line 107
    const-string v2, "dir"

    .line 108
    .line 109
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 113
    const-string v2, "unknown_path"

    .line 114
    .line 115
    if-eqz v1, :cond_4

    .line 116
    .line 117
    :try_start_2
    invoke-static {v0}, Landroid/provider/DocumentsContract;->getTreeDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-static {v0, v1}, Landroid/provider/DocumentsContract;->buildDocumentUriUsingTree(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    const-string v1, "buildDocumentUriUsingTree(...)"

    .line 126
    .line 127
    invoke-static {v0, v1}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-static {v10, v0}, Lj1/h;->g(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    if-eqz v0, :cond_3

    .line 135
    .line 136
    invoke-virtual {v3, v0}, Lj1/c;->d(Ljava/io/Serializable;)V

    .line 137
    .line 138
    .line 139
    return-object p1

    .line 140
    :cond_3
    const-string v0, "Failed to retrieve directory path."

    .line 141
    .line 142
    invoke-virtual {v3, v2, v0}, Lj1/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    return-object p1

    .line 146
    :cond_4
    invoke-static {v10, v0, v8, v5}, Lj1/h;->a(Landroid/app/Activity;Landroid/net/Uri;ZLjava/util/ArrayList;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-nez v0, :cond_5

    .line 154
    .line 155
    invoke-virtual {v3, v5}, Lj1/c;->d(Ljava/io/Serializable;)V

    .line 156
    .line 157
    .line 158
    return-object p1

    .line 159
    :cond_5
    const-string v0, "Failed to retrieve path."

    .line 160
    .line 161
    invoke-virtual {v3, v2, v0}, Lj1/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    return-object p1

    .line 165
    :cond_6
    invoke-virtual {v4}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    if-eqz v6, :cond_b

    .line 170
    .line 171
    invoke-virtual {v6, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 172
    .line 173
    .line 174
    move-result v6

    .line 175
    const/4 v7, 0x1

    .line 176
    if-ne v6, v7, :cond_b

    .line 177
    .line 178
    invoke-virtual {v4}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    invoke-static {v1}, La2/h;->b(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 186
    .line 187
    const/16 v4, 0x21

    .line 188
    .line 189
    if-lt v2, v4, :cond_7

    .line 190
    .line 191
    invoke-static {v1}, LE/c;->p(Landroid/os/Bundle;)Ljava/util/ArrayList;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    goto :goto_1

    .line 196
    :cond_7
    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    :goto_1
    if-eqz v0, :cond_a

    .line 201
    .line 202
    new-instance v1, Ljava/util/ArrayList;

    .line 203
    .line 204
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    move v4, v9

    .line 212
    :cond_8
    :goto_2
    if-ge v4, v2, :cond_9

    .line 213
    .line 214
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v6

    .line 218
    add-int/lit8 v4, v4, 0x1

    .line 219
    .line 220
    instance-of v7, v6, Landroid/net/Uri;

    .line 221
    .line 222
    if-eqz v7, :cond_8

    .line 223
    .line 224
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    goto :goto_2

    .line 228
    :cond_9
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    :goto_3
    if-ge v9, v0, :cond_a

    .line 233
    .line 234
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    add-int/lit8 v9, v9, 0x1

    .line 239
    .line 240
    check-cast v2, Landroid/net/Uri;

    .line 241
    .line 242
    invoke-static {v10, v2, v8, v5}, Lj1/h;->a(Landroid/app/Activity;Landroid/net/Uri;ZLjava/util/ArrayList;)V

    .line 243
    .line 244
    .line 245
    goto :goto_3

    .line 246
    :cond_a
    invoke-virtual {v3, v5}, Lj1/c;->d(Ljava/io/Serializable;)V

    .line 247
    .line 248
    .line 249
    return-object p1

    .line 250
    :cond_b
    invoke-virtual {v3, v2, v1}, Lj1/c;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 251
    .line 252
    .line 253
    return-object p1

    .line 254
    :goto_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    if-nez v0, :cond_c

    .line 259
    .line 260
    const-string v0, "Unknown error"

    .line 261
    .line 262
    :cond_c
    const-string v1, "file_picker_error"

    .line 263
    .line 264
    invoke-virtual {v3, v1, v0}, Lj1/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    return-object p1
.end method

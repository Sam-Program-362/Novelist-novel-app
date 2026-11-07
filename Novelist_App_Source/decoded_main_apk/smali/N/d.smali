.class public final synthetic LN/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ1/p;


# instance fields
.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LN/d;->k:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, LN/d;->k:I

    .line 2
    .line 3
    const-string v1, "element"

    .line 4
    .line 5
    const-string v2, "acc"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    sget-object v5, LO1/g;->a:LO1/g;

    .line 10
    .line 11
    const-string v6, "f"

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast p1, Ln2/v;

    .line 17
    .line 18
    check-cast p2, LR1/f;

    .line 19
    .line 20
    return-object p1

    .line 21
    :pswitch_0
    check-cast p1, Li2/d0;

    .line 22
    .line 23
    check-cast p2, LR1/f;

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    move-object v4, p1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    instance-of p1, p2, Li2/d0;

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    move-object v4, p2

    .line 34
    check-cast v4, Li2/d0;

    .line 35
    .line 36
    :cond_1
    :goto_0
    return-object v4

    .line 37
    :pswitch_1
    check-cast p2, LR1/f;

    .line 38
    .line 39
    instance-of v0, p2, Li2/d0;

    .line 40
    .line 41
    if-eqz v0, :cond_5

    .line 42
    .line 43
    instance-of v0, p1, Ljava/lang/Integer;

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    move-object v4, p1

    .line 48
    check-cast v4, Ljava/lang/Integer;

    .line 49
    .line 50
    :cond_2
    if-eqz v4, :cond_3

    .line 51
    .line 52
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    goto :goto_1

    .line 57
    :cond_3
    move p1, v3

    .line 58
    :goto_1
    if-nez p1, :cond_4

    .line 59
    .line 60
    move-object p1, p2

    .line 61
    goto :goto_2

    .line 62
    :cond_4
    add-int/2addr p1, v3

    .line 63
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    :cond_5
    :goto_2
    return-object p1

    .line 68
    :pswitch_2
    check-cast p1, Ljava/lang/Integer;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    check-cast p2, LR1/f;

    .line 75
    .line 76
    add-int/2addr p1, v3

    .line 77
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    return-object p1

    .line 82
    :pswitch_3
    check-cast p1, Ljava/lang/Boolean;

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 85
    .line 86
    .line 87
    check-cast p2, LR1/f;

    .line 88
    .line 89
    return-object p1

    .line 90
    :pswitch_4
    check-cast p1, LR1/h;

    .line 91
    .line 92
    check-cast p2, LR1/f;

    .line 93
    .line 94
    invoke-interface {p1, p2}, LR1/h;->i(LR1/h;)LR1/h;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    return-object p1

    .line 99
    :pswitch_5
    check-cast p1, LR1/h;

    .line 100
    .line 101
    check-cast p2, LR1/f;

    .line 102
    .line 103
    invoke-interface {p1, p2}, LR1/h;->i(LR1/h;)LR1/h;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    return-object p1

    .line 108
    :pswitch_6
    check-cast p1, LR1/h;

    .line 109
    .line 110
    check-cast p2, LR1/f;

    .line 111
    .line 112
    invoke-static {p1, v2}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-static {p2, v1}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-interface {p2}, LR1/f;->getKey()LR1/g;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-interface {p1, v0}, LR1/h;->j(LR1/g;)LR1/h;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    sget-object v0, LR1/i;->k:LR1/i;

    .line 127
    .line 128
    if-ne p1, v0, :cond_6

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_6
    sget-object v1, LR1/d;->k:LR1/d;

    .line 132
    .line 133
    invoke-interface {p1, v1}, LR1/h;->e(LR1/g;)LR1/f;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    check-cast v2, LR1/e;

    .line 138
    .line 139
    if-nez v2, :cond_7

    .line 140
    .line 141
    new-instance v0, LR1/b;

    .line 142
    .line 143
    invoke-direct {v0, p1, p2}, LR1/b;-><init>(LR1/h;LR1/f;)V

    .line 144
    .line 145
    .line 146
    :goto_3
    move-object p2, v0

    .line 147
    goto :goto_4

    .line 148
    :cond_7
    invoke-interface {p1, v1}, LR1/h;->j(LR1/g;)LR1/h;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    if-ne p1, v0, :cond_8

    .line 153
    .line 154
    new-instance p1, LR1/b;

    .line 155
    .line 156
    invoke-direct {p1, p2, v2}, LR1/b;-><init>(LR1/h;LR1/f;)V

    .line 157
    .line 158
    .line 159
    move-object p2, p1

    .line 160
    goto :goto_4

    .line 161
    :cond_8
    new-instance v0, LR1/b;

    .line 162
    .line 163
    new-instance v1, LR1/b;

    .line 164
    .line 165
    invoke-direct {v1, p1, p2}, LR1/b;-><init>(LR1/h;LR1/f;)V

    .line 166
    .line 167
    .line 168
    invoke-direct {v0, v1, v2}, LR1/b;-><init>(LR1/h;LR1/f;)V

    .line 169
    .line 170
    .line 171
    goto :goto_3

    .line 172
    :goto_4
    return-object p2

    .line 173
    :pswitch_7
    check-cast p1, Ljava/lang/String;

    .line 174
    .line 175
    check-cast p2, LR1/f;

    .line 176
    .line 177
    invoke-static {p1, v2}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    invoke-static {p2, v1}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    if-nez v0, :cond_9

    .line 188
    .line 189
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    goto :goto_5

    .line 194
    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 195
    .line 196
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    const-string p1, ", "

    .line 203
    .line 204
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    :goto_5
    return-object p1

    .line 215
    :pswitch_8
    check-cast p1, Landroid/os/CancellationSignal;

    .line 216
    .line 217
    check-cast p2, LZ1/a;

    .line 218
    .line 219
    invoke-static {p2, v6}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    sget-object v0, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:LM/h;

    .line 223
    .line 224
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    invoke-static {p1}, LM/h;->a(Landroid/os/CancellationSignal;)Z

    .line 228
    .line 229
    .line 230
    move-result p1

    .line 231
    if-eqz p1, :cond_a

    .line 232
    .line 233
    goto :goto_6

    .line 234
    :cond_a
    invoke-interface {p2}, LZ1/a;->a()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    :goto_6
    return-object v5

    .line 238
    :pswitch_9
    check-cast p1, Landroid/os/CancellationSignal;

    .line 239
    .line 240
    check-cast p2, LZ1/a;

    .line 241
    .line 242
    invoke-static {p2, v6}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    sget-object v0, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:LM/h;

    .line 246
    .line 247
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    invoke-static {p1}, LM/h;->a(Landroid/os/CancellationSignal;)Z

    .line 251
    .line 252
    .line 253
    move-result p1

    .line 254
    if-eqz p1, :cond_b

    .line 255
    .line 256
    goto :goto_7

    .line 257
    :cond_b
    invoke-interface {p2}, LZ1/a;->a()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    :goto_7
    return-object v5

    .line 261
    :pswitch_a
    check-cast p1, Landroid/os/CancellationSignal;

    .line 262
    .line 263
    check-cast p2, LZ1/a;

    .line 264
    .line 265
    invoke-static {p2, v6}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    sget v0, LN/c;->c:I

    .line 269
    .line 270
    invoke-static {p1, p2}, La/a;->l(Landroid/os/CancellationSignal;LZ1/a;)V

    .line 271
    .line 272
    .line 273
    return-object v5

    .line 274
    nop

    .line 275
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

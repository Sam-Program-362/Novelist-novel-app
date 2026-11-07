.class public final synthetic LO/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg1/c;


# instance fields
.field public final synthetic k:I

.field public final synthetic l:Landroid/os/CancellationSignal;

.field public final synthetic m:LN/c;


# direct methods
.method public synthetic constructor <init>(LN/c;Landroid/os/CancellationSignal;I)V
    .locals 0

    .line 1
    iput p3, p0, LO/b;->k:I

    iput-object p1, p0, LO/b;->m:LN/c;

    iput-object p2, p0, LO/b;->l:Landroid/os/CancellationSignal;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Exception;)V
    .locals 6

    .line 1
    iget v0, p0, LO/b;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LO/b;->m:LN/c;

    .line 7
    .line 8
    check-cast v0, LQ/b;

    .line 9
    .line 10
    instance-of v1, p1, LK0/e;

    .line 11
    .line 12
    const-string v2, "GET_INTERRUPTED"

    .line 13
    .line 14
    const-string v3, "GET_NO_CREDENTIALS"

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    sget-object v1, LN/c;->a:Ljava/util/Set;

    .line 19
    .line 20
    move-object v4, p1

    .line 21
    check-cast v4, LK0/e;

    .line 22
    .line 23
    iget-object v4, v4, LK0/e;->k:Lcom/google/android/gms/common/api/Status;

    .line 24
    .line 25
    iget v4, v4, Lcom/google/android/gms/common/api/Status;->k:I

    .line 26
    .line 27
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-interface {v1, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    move-object v1, v2

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move-object v1, v3

    .line 40
    :goto_0
    new-instance v4, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v5, "During get sign-in intent, failure response from one tap: "

    .line 43
    .line 44
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    const v5, -0x5d754ec3

    .line 63
    .line 64
    .line 65
    if-eq v4, v5, :cond_5

    .line 66
    .line 67
    const v5, -0x936ed67

    .line 68
    .line 69
    .line 70
    if-eq v4, v5, :cond_3

    .line 71
    .line 72
    const v2, 0x77034d87

    .line 73
    .line 74
    .line 75
    if-eq v4, v2, :cond_1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-nez v1, :cond_2

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    new-instance v1, LI/j;

    .line 86
    .line 87
    invoke-direct {v1, p1}, LI/j;-><init>(Ljava/lang/CharSequence;)V

    .line 88
    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_3
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-nez v1, :cond_4

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_4
    new-instance v1, LI/g;

    .line 99
    .line 100
    invoke-direct {v1, p1}, LI/g;-><init>(Ljava/lang/CharSequence;)V

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_5
    const-string v2, "GET_CANCELED_TAG"

    .line 105
    .line 106
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-eqz v1, :cond_6

    .line 111
    .line 112
    new-instance v1, LI/d;

    .line 113
    .line 114
    invoke-direct {v1, p1}, LI/d;-><init>(Ljava/lang/CharSequence;)V

    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_6
    :goto_1
    new-instance v1, LI/e;

    .line 119
    .line 120
    invoke-direct {v1, p1}, LI/e;-><init>(Ljava/lang/CharSequence;)V

    .line 121
    .line 122
    .line 123
    :goto_2
    sget-object p1, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:LM/h;

    .line 124
    .line 125
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    iget-object p1, p0, LO/b;->l:Landroid/os/CancellationSignal;

    .line 129
    .line 130
    invoke-static {p1}, LM/h;->a(Landroid/os/CancellationSignal;)Z

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    if-eqz p1, :cond_7

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_7
    invoke-virtual {v0}, LQ/b;->e()Ljava/util/concurrent/Executor;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    new-instance v2, LQ/a;

    .line 142
    .line 143
    const/4 v3, 0x1

    .line 144
    invoke-direct {v2, v0, v1, v3}, LQ/a;-><init>(LQ/b;LI/f;I)V

    .line 145
    .line 146
    .line 147
    invoke-interface {p1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 148
    .line 149
    .line 150
    :goto_3
    return-void

    .line 151
    :pswitch_0
    iget-object v0, p0, LO/b;->m:LN/c;

    .line 152
    .line 153
    check-cast v0, LO/d;

    .line 154
    .line 155
    instance-of v1, p1, LK0/e;

    .line 156
    .line 157
    const-string v2, "GET_INTERRUPTED"

    .line 158
    .line 159
    const-string v3, "GET_NO_CREDENTIALS"

    .line 160
    .line 161
    if-eqz v1, :cond_8

    .line 162
    .line 163
    sget-object v1, LN/c;->a:Ljava/util/Set;

    .line 164
    .line 165
    move-object v4, p1

    .line 166
    check-cast v4, LK0/e;

    .line 167
    .line 168
    iget-object v4, v4, LK0/e;->k:Lcom/google/android/gms/common/api/Status;

    .line 169
    .line 170
    iget v4, v4, Lcom/google/android/gms/common/api/Status;->k:I

    .line 171
    .line 172
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    invoke-interface {v1, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    if-eqz v1, :cond_8

    .line 181
    .line 182
    move-object v1, v2

    .line 183
    goto :goto_4

    .line 184
    :cond_8
    move-object v1, v3

    .line 185
    :goto_4
    new-instance v4, Ljava/lang/StringBuilder;

    .line 186
    .line 187
    const-string v5, "During begin sign in, failure response from one tap: "

    .line 188
    .line 189
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 204
    .line 205
    .line 206
    move-result v4

    .line 207
    const v5, -0x5d754ec3

    .line 208
    .line 209
    .line 210
    if-eq v4, v5, :cond_d

    .line 211
    .line 212
    const v5, -0x936ed67

    .line 213
    .line 214
    .line 215
    if-eq v4, v5, :cond_b

    .line 216
    .line 217
    const v2, 0x77034d87

    .line 218
    .line 219
    .line 220
    if-eq v4, v2, :cond_9

    .line 221
    .line 222
    goto :goto_5

    .line 223
    :cond_9
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    if-nez v1, :cond_a

    .line 228
    .line 229
    goto :goto_5

    .line 230
    :cond_a
    new-instance v1, LI/j;

    .line 231
    .line 232
    invoke-direct {v1, p1}, LI/j;-><init>(Ljava/lang/CharSequence;)V

    .line 233
    .line 234
    .line 235
    goto :goto_6

    .line 236
    :cond_b
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    if-nez v1, :cond_c

    .line 241
    .line 242
    goto :goto_5

    .line 243
    :cond_c
    new-instance v1, LI/g;

    .line 244
    .line 245
    invoke-direct {v1, p1}, LI/g;-><init>(Ljava/lang/CharSequence;)V

    .line 246
    .line 247
    .line 248
    goto :goto_6

    .line 249
    :cond_d
    const-string v2, "GET_CANCELED_TAG"

    .line 250
    .line 251
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    if-eqz v1, :cond_e

    .line 256
    .line 257
    new-instance v1, LI/d;

    .line 258
    .line 259
    invoke-direct {v1, p1}, LI/d;-><init>(Ljava/lang/CharSequence;)V

    .line 260
    .line 261
    .line 262
    goto :goto_6

    .line 263
    :cond_e
    :goto_5
    new-instance v1, LI/e;

    .line 264
    .line 265
    invoke-direct {v1, p1}, LI/e;-><init>(Ljava/lang/CharSequence;)V

    .line 266
    .line 267
    .line 268
    :goto_6
    sget-object p1, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:LM/h;

    .line 269
    .line 270
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    iget-object p1, p0, LO/b;->l:Landroid/os/CancellationSignal;

    .line 274
    .line 275
    invoke-static {p1}, LM/h;->a(Landroid/os/CancellationSignal;)Z

    .line 276
    .line 277
    .line 278
    move-result p1

    .line 279
    if-eqz p1, :cond_f

    .line 280
    .line 281
    goto :goto_7

    .line 282
    :cond_f
    invoke-virtual {v0}, LO/d;->d()Ljava/util/concurrent/Executor;

    .line 283
    .line 284
    .line 285
    move-result-object p1

    .line 286
    new-instance v2, LO/a;

    .line 287
    .line 288
    const/4 v3, 0x0

    .line 289
    invoke-direct {v2, v0, v1, v3}, LO/a;-><init>(LO/d;LI/f;I)V

    .line 290
    .line 291
    .line 292
    invoke-interface {p1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 293
    .line 294
    .line 295
    :goto_7
    return-void

    .line 296
    nop

    .line 297
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

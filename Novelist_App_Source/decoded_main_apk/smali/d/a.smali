.class public final Ld/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ld/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Ld/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroidx/versionedparcelable/ParcelImpl;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Landroidx/versionedparcelable/ParcelImpl;-><init>(Landroid/os/Parcel;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_0
    new-instance v0, Ll0/I;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iput v1, v0, Ll0/I;->k:I

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    iput v1, v0, Ll0/I;->l:I

    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    iput v1, v0, Ll0/I;->m:I

    .line 34
    .line 35
    if-lez v1, :cond_0

    .line 36
    .line 37
    new-array v1, v1, [I

    .line 38
    .line 39
    iput-object v1, v0, Ll0/I;->n:[I

    .line 40
    .line 41
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readIntArray([I)V

    .line 42
    .line 43
    .line 44
    :cond_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    iput v1, v0, Ll0/I;->o:I

    .line 49
    .line 50
    if-lez v1, :cond_1

    .line 51
    .line 52
    new-array v1, v1, [I

    .line 53
    .line 54
    iput-object v1, v0, Ll0/I;->p:[I

    .line 55
    .line 56
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readIntArray([I)V

    .line 57
    .line 58
    .line 59
    :cond_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    const/4 v2, 0x0

    .line 64
    const/4 v3, 0x1

    .line 65
    if-ne v1, v3, :cond_2

    .line 66
    .line 67
    move v1, v3

    .line 68
    goto :goto_0

    .line 69
    :cond_2
    move v1, v2

    .line 70
    :goto_0
    iput-boolean v1, v0, Ll0/I;->r:Z

    .line 71
    .line 72
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-ne v1, v3, :cond_3

    .line 77
    .line 78
    move v1, v3

    .line 79
    goto :goto_1

    .line 80
    :cond_3
    move v1, v2

    .line 81
    :goto_1
    iput-boolean v1, v0, Ll0/I;->s:Z

    .line 82
    .line 83
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-ne v1, v3, :cond_4

    .line 88
    .line 89
    move v2, v3

    .line 90
    :cond_4
    iput-boolean v2, v0, Ll0/I;->t:Z

    .line 91
    .line 92
    const-class v1, Ll0/H;

    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    iput-object p1, v0, Ll0/I;->q:Ljava/util/ArrayList;

    .line 103
    .line 104
    return-object v0

    .line 105
    :pswitch_1
    new-instance v0, Ll0/H;

    .line 106
    .line 107
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    iput v1, v0, Ll0/H;->k:I

    .line 115
    .line 116
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    iput v1, v0, Ll0/H;->l:I

    .line 121
    .line 122
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    const/4 v2, 0x1

    .line 127
    if-ne v1, v2, :cond_5

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_5
    const/4 v2, 0x0

    .line 131
    :goto_2
    iput-boolean v2, v0, Ll0/H;->n:Z

    .line 132
    .line 133
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    if-lez v1, :cond_6

    .line 138
    .line 139
    new-array v1, v1, [I

    .line 140
    .line 141
    iput-object v1, v0, Ll0/H;->m:[I

    .line 142
    .line 143
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readIntArray([I)V

    .line 144
    .line 145
    .line 146
    :cond_6
    return-object v0

    .line 147
    :pswitch_2
    new-instance v0, Ll0/m;

    .line 148
    .line 149
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    iput v1, v0, Ll0/m;->k:I

    .line 157
    .line 158
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    iput v1, v0, Ll0/m;->l:I

    .line 163
    .line 164
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    const/4 v1, 0x1

    .line 169
    if-ne p1, v1, :cond_7

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_7
    const/4 v1, 0x0

    .line 173
    :goto_3
    iput-boolean v1, v0, Ll0/m;->m:Z

    .line 174
    .line 175
    return-object v0

    .line 176
    :pswitch_3
    invoke-static {p1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    const/4 v1, 0x0

    .line 181
    const/4 v2, 0x0

    .line 182
    move v3, v2

    .line 183
    move-object v2, v1

    .line 184
    :goto_4
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 185
    .line 186
    .line 187
    move-result v4

    .line 188
    if-ge v4, v0, :cond_b

    .line 189
    .line 190
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 191
    .line 192
    .line 193
    move-result v4

    .line 194
    int-to-char v5, v4

    .line 195
    const/4 v6, 0x1

    .line 196
    if-eq v5, v6, :cond_a

    .line 197
    .line 198
    const/4 v6, 0x2

    .line 199
    if-eq v5, v6, :cond_9

    .line 200
    .line 201
    const/4 v6, 0x3

    .line 202
    if-eq v5, v6, :cond_8

    .line 203
    .line 204
    invoke-static {p1, v4}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 205
    .line 206
    .line 207
    goto :goto_4

    .line 208
    :cond_8
    sget-object v2, LM0/o;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 209
    .line 210
    invoke-static {p1, v4, v2}, LE2/a;->j(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    check-cast v2, LM0/o;

    .line 215
    .line 216
    goto :goto_4

    .line 217
    :cond_9
    sget-object v1, LJ0/a;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 218
    .line 219
    invoke-static {p1, v4, v1}, LE2/a;->j(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    check-cast v1, LJ0/a;

    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_a
    invoke-static {p1, v4}, LE2/a;->H(Landroid/os/Parcel;I)I

    .line 227
    .line 228
    .line 229
    move-result v3

    .line 230
    goto :goto_4

    .line 231
    :cond_b
    invoke-static {p1, v0}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 232
    .line 233
    .line 234
    new-instance p1, Lf1/f;

    .line 235
    .line 236
    invoke-direct {p1, v3, v1, v2}, Lf1/f;-><init>(ILJ0/a;LM0/o;)V

    .line 237
    .line 238
    .line 239
    return-object p1

    .line 240
    :pswitch_4
    invoke-static {p1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 241
    .line 242
    .line 243
    move-result v0

    .line 244
    const/4 v1, 0x0

    .line 245
    move-object v2, v1

    .line 246
    :goto_5
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 247
    .line 248
    .line 249
    move-result v3

    .line 250
    if-ge v3, v0, :cond_e

    .line 251
    .line 252
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    int-to-char v4, v3

    .line 257
    const/4 v5, 0x1

    .line 258
    if-eq v4, v5, :cond_d

    .line 259
    .line 260
    const/4 v5, 0x2

    .line 261
    if-eq v4, v5, :cond_c

    .line 262
    .line 263
    invoke-static {p1, v3}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 264
    .line 265
    .line 266
    goto :goto_5

    .line 267
    :cond_c
    invoke-static {p1, v3}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    goto :goto_5

    .line 272
    :cond_d
    invoke-static {p1, v3}, LE2/a;->l(Landroid/os/Parcel;I)Ljava/util/ArrayList;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    goto :goto_5

    .line 277
    :cond_e
    invoke-static {p1, v0}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 278
    .line 279
    .line 280
    new-instance p1, Lf1/e;

    .line 281
    .line 282
    invoke-direct {p1, v1, v2}, Lf1/e;-><init>(Ljava/util/ArrayList;Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    return-object p1

    .line 286
    :pswitch_5
    invoke-static {p1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 287
    .line 288
    .line 289
    move-result v0

    .line 290
    const/4 v1, 0x0

    .line 291
    const/4 v2, 0x0

    .line 292
    move v3, v2

    .line 293
    :goto_6
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 294
    .line 295
    .line 296
    move-result v4

    .line 297
    if-ge v4, v0, :cond_12

    .line 298
    .line 299
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 300
    .line 301
    .line 302
    move-result v4

    .line 303
    int-to-char v5, v4

    .line 304
    const/4 v6, 0x1

    .line 305
    if-eq v5, v6, :cond_11

    .line 306
    .line 307
    const/4 v6, 0x2

    .line 308
    if-eq v5, v6, :cond_10

    .line 309
    .line 310
    const/4 v6, 0x3

    .line 311
    if-eq v5, v6, :cond_f

    .line 312
    .line 313
    invoke-static {p1, v4}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 314
    .line 315
    .line 316
    goto :goto_6

    .line 317
    :cond_f
    sget-object v1, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 318
    .line 319
    invoke-static {p1, v4, v1}, LE2/a;->j(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    check-cast v1, Landroid/content/Intent;

    .line 324
    .line 325
    goto :goto_6

    .line 326
    :cond_10
    invoke-static {p1, v4}, LE2/a;->H(Landroid/os/Parcel;I)I

    .line 327
    .line 328
    .line 329
    move-result v3

    .line 330
    goto :goto_6

    .line 331
    :cond_11
    invoke-static {p1, v4}, LE2/a;->H(Landroid/os/Parcel;I)I

    .line 332
    .line 333
    .line 334
    move-result v2

    .line 335
    goto :goto_6

    .line 336
    :cond_12
    invoke-static {p1, v0}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 337
    .line 338
    .line 339
    new-instance p1, Lf1/b;

    .line 340
    .line 341
    invoke-direct {p1, v2, v3, v1}, Lf1/b;-><init>(IILandroid/content/Intent;)V

    .line 342
    .line 343
    .line 344
    return-object p1

    .line 345
    :pswitch_6
    const-string v0, "parcel"

    .line 346
    .line 347
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    new-instance v0, Ld/b;

    .line 351
    .line 352
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 353
    .line 354
    .line 355
    move-result v1

    .line 356
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 357
    .line 358
    .line 359
    move-result v2

    .line 360
    if-nez v2, :cond_13

    .line 361
    .line 362
    const/4 p1, 0x0

    .line 363
    goto :goto_7

    .line 364
    :cond_13
    sget-object v2, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 365
    .line 366
    invoke-interface {v2, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object p1

    .line 370
    check-cast p1, Landroid/content/Intent;

    .line 371
    .line 372
    :goto_7
    invoke-direct {v0, p1, v1}, Ld/b;-><init>(Landroid/content/Intent;I)V

    .line 373
    .line 374
    .line 375
    return-object v0

    .line 376
    nop

    .line 377
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Ld/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p1, p1, [Landroidx/versionedparcelable/ParcelImpl;

    .line 7
    .line 8
    return-object p1

    .line 9
    :pswitch_0
    new-array p1, p1, [Ll0/I;

    .line 10
    .line 11
    return-object p1

    .line 12
    :pswitch_1
    new-array p1, p1, [Ll0/H;

    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_2
    new-array p1, p1, [Ll0/m;

    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_3
    new-array p1, p1, [Lf1/f;

    .line 19
    .line 20
    return-object p1

    .line 21
    :pswitch_4
    new-array p1, p1, [Lf1/e;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_5
    new-array p1, p1, [Lf1/b;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_6
    new-array p1, p1, [Ld/b;

    .line 28
    .line 29
    return-object p1

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

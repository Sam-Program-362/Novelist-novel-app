.class public final LF0/l;
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
    iput p1, p0, LF0/l;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(LM0/e;Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    const/16 v0, 0x4f45

    .line 2
    .line 3
    invoke-static {p1, v0}, LH2/h;->Q(Landroid/os/Parcel;I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, LM0/e;->k:I

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x4

    .line 11
    invoke-static {p1, v2, v3}, LH2/h;->P(Landroid/os/Parcel;II)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 15
    .line 16
    .line 17
    iget v1, p0, LM0/e;->l:I

    .line 18
    .line 19
    const/4 v2, 0x2

    .line 20
    invoke-static {p1, v2, v3}, LH2/h;->P(Landroid/os/Parcel;II)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 24
    .line 25
    .line 26
    iget v1, p0, LM0/e;->m:I

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    invoke-static {p1, v2, v3}, LH2/h;->P(Landroid/os/Parcel;II)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, LM0/e;->n:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {p1, v3, v1}, LH2/h;->K(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, LM0/e;->o:Landroid/os/IBinder;

    .line 41
    .line 42
    if-nez v1, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 v2, 0x5

    .line 46
    invoke-static {p1, v2}, LH2/h;->Q(Landroid/os/Parcel;I)I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 51
    .line 52
    .line 53
    invoke-static {p1, v2}, LH2/h;->R(Landroid/os/Parcel;I)V

    .line 54
    .line 55
    .line 56
    :goto_0
    const/4 v1, 0x6

    .line 57
    iget-object v2, p0, LM0/e;->p:[Lcom/google/android/gms/common/api/Scope;

    .line 58
    .line 59
    invoke-static {p1, v1, v2, p2}, LH2/h;->M(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    .line 60
    .line 61
    .line 62
    const/4 v1, 0x7

    .line 63
    iget-object v2, p0, LM0/e;->q:Landroid/os/Bundle;

    .line 64
    .line 65
    invoke-static {p1, v1, v2}, LH2/h;->G(Landroid/os/Parcel;ILandroid/os/Bundle;)V

    .line 66
    .line 67
    .line 68
    const/16 v1, 0x8

    .line 69
    .line 70
    iget-object v2, p0, LM0/e;->r:Landroid/accounts/Account;

    .line 71
    .line 72
    invoke-static {p1, v1, v2, p2}, LH2/h;->J(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    .line 73
    .line 74
    .line 75
    const/16 v1, 0xa

    .line 76
    .line 77
    iget-object v2, p0, LM0/e;->s:[LJ0/c;

    .line 78
    .line 79
    invoke-static {p1, v1, v2, p2}, LH2/h;->M(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    .line 80
    .line 81
    .line 82
    const/16 v1, 0xb

    .line 83
    .line 84
    iget-object v2, p0, LM0/e;->t:[LJ0/c;

    .line 85
    .line 86
    invoke-static {p1, v1, v2, p2}, LH2/h;->M(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    .line 87
    .line 88
    .line 89
    iget-boolean p2, p0, LM0/e;->u:Z

    .line 90
    .line 91
    const/16 v1, 0xc

    .line 92
    .line 93
    invoke-static {p1, v1, v3}, LH2/h;->P(Landroid/os/Parcel;II)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 97
    .line 98
    .line 99
    iget p2, p0, LM0/e;->v:I

    .line 100
    .line 101
    const/16 v1, 0xd

    .line 102
    .line 103
    invoke-static {p1, v1, v3}, LH2/h;->P(Landroid/os/Parcel;II)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 107
    .line 108
    .line 109
    iget-boolean p2, p0, LM0/e;->w:Z

    .line 110
    .line 111
    const/16 v1, 0xe

    .line 112
    .line 113
    invoke-static {p1, v1, v3}, LH2/h;->P(Landroid/os/Parcel;II)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 117
    .line 118
    .line 119
    const/16 p2, 0xf

    .line 120
    .line 121
    iget-object p0, p0, LM0/e;->x:Ljava/lang/String;

    .line 122
    .line 123
    invoke-static {p1, p2, p0}, LH2/h;->K(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-static {p1, v0}, LH2/h;->R(Landroid/os/Parcel;I)V

    .line 127
    .line 128
    .line 129
    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, LF0/l;->a:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    move-object v5, v3

    .line 16
    move-object v6, v5

    .line 17
    move-object v7, v6

    .line 18
    move-object v8, v7

    .line 19
    move-object v9, v8

    .line 20
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-ge v3, v2, :cond_5

    .line 25
    .line 26
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    int-to-char v4, v3

    .line 31
    const/4 v10, 0x1

    .line 32
    if-eq v4, v10, :cond_4

    .line 33
    .line 34
    const/4 v10, 0x2

    .line 35
    if-eq v4, v10, :cond_3

    .line 36
    .line 37
    const/4 v10, 0x3

    .line 38
    if-eq v4, v10, :cond_2

    .line 39
    .line 40
    const/4 v10, 0x4

    .line 41
    if-eq v4, v10, :cond_1

    .line 42
    .line 43
    const/4 v10, 0x5

    .line 44
    if-eq v4, v10, :cond_0

    .line 45
    .line 46
    invoke-static {v1, v3}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-static {v1, v3}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v9

    .line 54
    goto :goto_0

    .line 55
    :cond_1
    sget-object v4, LV0/n;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 56
    .line 57
    invoke-static {v1, v3, v4}, LE2/a;->j(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    move-object v8, v3

    .line 62
    check-cast v8, LV0/n;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    sget-object v4, LV0/b;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 66
    .line 67
    invoke-static {v1, v3, v4}, LE2/a;->j(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    move-object v7, v3

    .line 72
    check-cast v7, LV0/b;

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    sget-object v4, LV0/m;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 76
    .line 77
    invoke-static {v1, v3, v4}, LE2/a;->j(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    move-object v6, v3

    .line 82
    check-cast v6, LV0/m;

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_4
    sget-object v4, LV0/j;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 86
    .line 87
    invoke-static {v1, v3, v4}, LE2/a;->j(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    move-object v5, v3

    .line 92
    check-cast v5, LV0/j;

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_5
    invoke-static {v1, v2}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 96
    .line 97
    .line 98
    new-instance v4, LV0/a;

    .line 99
    .line 100
    invoke-direct/range {v4 .. v9}, LV0/a;-><init>(LV0/j;LV0/m;LV0/b;LV0/n;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    return-object v4

    .line 104
    :pswitch_0
    invoke-static {v1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    const/4 v3, 0x0

    .line 109
    move v4, v3

    .line 110
    move v5, v4

    .line 111
    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    if-ge v6, v2, :cond_9

    .line 116
    .line 117
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 118
    .line 119
    .line 120
    move-result v6

    .line 121
    int-to-char v7, v6

    .line 122
    const/4 v8, 0x1

    .line 123
    if-eq v7, v8, :cond_8

    .line 124
    .line 125
    const/4 v8, 0x2

    .line 126
    const/4 v9, 0x4

    .line 127
    if-eq v7, v8, :cond_7

    .line 128
    .line 129
    const/4 v8, 0x3

    .line 130
    if-eq v7, v8, :cond_6

    .line 131
    .line 132
    invoke-static {v1, v6}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 133
    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_6
    invoke-static {v1, v6, v9}, LE2/a;->a0(Landroid/os/Parcel;II)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 140
    .line 141
    .line 142
    move-result v5

    .line 143
    int-to-short v5, v5

    .line 144
    goto :goto_1

    .line 145
    :cond_7
    invoke-static {v1, v6, v9}, LE2/a;->a0(Landroid/os/Parcel;II)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 149
    .line 150
    .line 151
    move-result v4

    .line 152
    int-to-short v4, v4

    .line 153
    goto :goto_1

    .line 154
    :cond_8
    invoke-static {v1, v6}, LE2/a;->H(Landroid/os/Parcel;I)I

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    goto :goto_1

    .line 159
    :cond_9
    invoke-static {v1, v2}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 160
    .line 161
    .line 162
    new-instance v1, LV0/k;

    .line 163
    .line 164
    invoke-direct {v1, v3, v4, v5}, LV0/k;-><init>(ISS)V

    .line 165
    .line 166
    .line 167
    return-object v1

    .line 168
    :pswitch_1
    invoke-static {v1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    const/4 v3, 0x0

    .line 173
    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    if-ge v4, v2, :cond_b

    .line 178
    .line 179
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 180
    .line 181
    .line 182
    move-result v4

    .line 183
    int-to-char v5, v4

    .line 184
    const/4 v6, 0x1

    .line 185
    if-eq v5, v6, :cond_a

    .line 186
    .line 187
    invoke-static {v1, v4}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 188
    .line 189
    .line 190
    goto :goto_2

    .line 191
    :cond_a
    sget-object v3, LV0/k;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 192
    .line 193
    invoke-static {v1, v4, v3}, LE2/a;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    goto :goto_2

    .line 198
    :cond_b
    invoke-static {v1, v2}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 199
    .line 200
    .line 201
    new-instance v1, LV0/j;

    .line 202
    .line 203
    invoke-direct {v1, v3}, LV0/j;-><init>(Ljava/util/ArrayList;)V

    .line 204
    .line 205
    .line 206
    return-object v1

    .line 207
    :pswitch_2
    invoke-static {v1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    const/4 v3, 0x0

    .line 212
    move-object v5, v3

    .line 213
    move-object v6, v5

    .line 214
    move-object v7, v6

    .line 215
    move-object v8, v7

    .line 216
    move-object v9, v8

    .line 217
    move-object v10, v9

    .line 218
    move-object v11, v10

    .line 219
    move-object v12, v11

    .line 220
    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 221
    .line 222
    .line 223
    move-result v3

    .line 224
    if-ge v3, v2, :cond_c

    .line 225
    .line 226
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 227
    .line 228
    .line 229
    move-result v3

    .line 230
    int-to-char v4, v3

    .line 231
    packed-switch v4, :pswitch_data_1

    .line 232
    .line 233
    .line 234
    invoke-static {v1, v3}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 235
    .line 236
    .line 237
    goto :goto_3

    .line 238
    :pswitch_3
    invoke-static {v1, v3}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    goto :goto_3

    .line 242
    :pswitch_4
    invoke-static {v1, v3}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v12

    .line 246
    goto :goto_3

    .line 247
    :pswitch_5
    sget-object v4, LV0/a;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 248
    .line 249
    invoke-static {v1, v3, v4}, LE2/a;->j(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    move-object v11, v3

    .line 254
    check-cast v11, LV0/a;

    .line 255
    .line 256
    goto :goto_3

    .line 257
    :pswitch_6
    sget-object v4, LV0/e;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 258
    .line 259
    invoke-static {v1, v3, v4}, LE2/a;->j(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    move-object v10, v3

    .line 264
    check-cast v10, LV0/e;

    .line 265
    .line 266
    goto :goto_3

    .line 267
    :pswitch_7
    sget-object v4, LV0/c;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 268
    .line 269
    invoke-static {v1, v3, v4}, LE2/a;->j(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    move-object v9, v3

    .line 274
    check-cast v9, LV0/c;

    .line 275
    .line 276
    goto :goto_3

    .line 277
    :pswitch_8
    sget-object v4, LV0/d;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 278
    .line 279
    invoke-static {v1, v3, v4}, LE2/a;->j(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 280
    .line 281
    .line 282
    move-result-object v3

    .line 283
    move-object v8, v3

    .line 284
    check-cast v8, LV0/d;

    .line 285
    .line 286
    goto :goto_3

    .line 287
    :pswitch_9
    invoke-static {v1, v3}, LE2/a;->g(Landroid/os/Parcel;I)[B

    .line 288
    .line 289
    .line 290
    move-result-object v7

    .line 291
    goto :goto_3

    .line 292
    :pswitch_a
    invoke-static {v1, v3}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v6

    .line 296
    goto :goto_3

    .line 297
    :pswitch_b
    invoke-static {v1, v3}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v5

    .line 301
    goto :goto_3

    .line 302
    :cond_c
    invoke-static {v1, v2}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 303
    .line 304
    .line 305
    new-instance v4, LV0/i;

    .line 306
    .line 307
    invoke-direct/range {v4 .. v12}, LV0/i;-><init>(Ljava/lang/String;Ljava/lang/String;[BLV0/d;LV0/c;LV0/e;LV0/a;Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    return-object v4

    .line 311
    :pswitch_c
    invoke-static {v1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 312
    .line 313
    .line 314
    move-result v2

    .line 315
    new-instance v3, Landroid/os/Bundle;

    .line 316
    .line 317
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 318
    .line 319
    .line 320
    sget-object v4, LM0/e;->y:[Lcom/google/android/gms/common/api/Scope;

    .line 321
    .line 322
    const/4 v5, 0x0

    .line 323
    const/4 v6, 0x0

    .line 324
    sget-object v7, LM0/e;->z:[LJ0/c;

    .line 325
    .line 326
    move-object v15, v3

    .line 327
    move-object v14, v4

    .line 328
    move-object v12, v5

    .line 329
    move-object v13, v12

    .line 330
    move-object/from16 v16, v13

    .line 331
    .line 332
    move-object/from16 v22, v16

    .line 333
    .line 334
    move v9, v6

    .line 335
    move v10, v9

    .line 336
    move v11, v10

    .line 337
    move/from16 v19, v11

    .line 338
    .line 339
    move/from16 v20, v19

    .line 340
    .line 341
    move/from16 v21, v20

    .line 342
    .line 343
    move-object/from16 v17, v7

    .line 344
    .line 345
    move-object/from16 v18, v17

    .line 346
    .line 347
    :goto_4
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 348
    .line 349
    .line 350
    move-result v3

    .line 351
    if-ge v3, v2, :cond_e

    .line 352
    .line 353
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 354
    .line 355
    .line 356
    move-result v3

    .line 357
    int-to-char v4, v3

    .line 358
    packed-switch v4, :pswitch_data_2

    .line 359
    .line 360
    .line 361
    :pswitch_d
    invoke-static {v1, v3}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 362
    .line 363
    .line 364
    goto :goto_4

    .line 365
    :pswitch_e
    invoke-static {v1, v3}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v22

    .line 369
    goto :goto_4

    .line 370
    :pswitch_f
    invoke-static {v1, v3}, LE2/a;->G(Landroid/os/Parcel;I)Z

    .line 371
    .line 372
    .line 373
    move-result v21

    .line 374
    goto :goto_4

    .line 375
    :pswitch_10
    invoke-static {v1, v3}, LE2/a;->H(Landroid/os/Parcel;I)I

    .line 376
    .line 377
    .line 378
    move-result v20

    .line 379
    goto :goto_4

    .line 380
    :pswitch_11
    invoke-static {v1, v3}, LE2/a;->G(Landroid/os/Parcel;I)Z

    .line 381
    .line 382
    .line 383
    move-result v19

    .line 384
    goto :goto_4

    .line 385
    :pswitch_12
    sget-object v4, LJ0/c;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 386
    .line 387
    invoke-static {v1, v3, v4}, LE2/a;->m(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v3

    .line 391
    move-object/from16 v18, v3

    .line 392
    .line 393
    check-cast v18, [LJ0/c;

    .line 394
    .line 395
    goto :goto_4

    .line 396
    :pswitch_13
    sget-object v4, LJ0/c;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 397
    .line 398
    invoke-static {v1, v3, v4}, LE2/a;->m(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v3

    .line 402
    move-object/from16 v17, v3

    .line 403
    .line 404
    check-cast v17, [LJ0/c;

    .line 405
    .line 406
    goto :goto_4

    .line 407
    :pswitch_14
    sget-object v4, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 408
    .line 409
    invoke-static {v1, v3, v4}, LE2/a;->j(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 410
    .line 411
    .line 412
    move-result-object v3

    .line 413
    move-object/from16 v16, v3

    .line 414
    .line 415
    check-cast v16, Landroid/accounts/Account;

    .line 416
    .line 417
    goto :goto_4

    .line 418
    :pswitch_15
    invoke-static {v1, v3}, LE2/a;->f(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 419
    .line 420
    .line 421
    move-result-object v15

    .line 422
    goto :goto_4

    .line 423
    :pswitch_16
    sget-object v4, Lcom/google/android/gms/common/api/Scope;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 424
    .line 425
    invoke-static {v1, v3, v4}, LE2/a;->m(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v3

    .line 429
    move-object v14, v3

    .line 430
    check-cast v14, [Lcom/google/android/gms/common/api/Scope;

    .line 431
    .line 432
    goto :goto_4

    .line 433
    :pswitch_17
    invoke-static {v1, v3}, LE2/a;->J(Landroid/os/Parcel;I)I

    .line 434
    .line 435
    .line 436
    move-result v3

    .line 437
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 438
    .line 439
    .line 440
    move-result v4

    .line 441
    if-nez v3, :cond_d

    .line 442
    .line 443
    move-object v13, v5

    .line 444
    goto :goto_4

    .line 445
    :cond_d
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 446
    .line 447
    .line 448
    move-result-object v6

    .line 449
    add-int/2addr v4, v3

    .line 450
    invoke-virtual {v1, v4}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 451
    .line 452
    .line 453
    move-object v13, v6

    .line 454
    goto :goto_4

    .line 455
    :pswitch_18
    invoke-static {v1, v3}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v12

    .line 459
    goto :goto_4

    .line 460
    :pswitch_19
    invoke-static {v1, v3}, LE2/a;->H(Landroid/os/Parcel;I)I

    .line 461
    .line 462
    .line 463
    move-result v11

    .line 464
    goto :goto_4

    .line 465
    :pswitch_1a
    invoke-static {v1, v3}, LE2/a;->H(Landroid/os/Parcel;I)I

    .line 466
    .line 467
    .line 468
    move-result v10

    .line 469
    goto :goto_4

    .line 470
    :pswitch_1b
    invoke-static {v1, v3}, LE2/a;->H(Landroid/os/Parcel;I)I

    .line 471
    .line 472
    .line 473
    move-result v9

    .line 474
    goto :goto_4

    .line 475
    :cond_e
    invoke-static {v1, v2}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 476
    .line 477
    .line 478
    new-instance v8, LM0/e;

    .line 479
    .line 480
    invoke-direct/range {v8 .. v22}, LM0/e;-><init>(IIILjava/lang/String;Landroid/os/IBinder;[Lcom/google/android/gms/common/api/Scope;Landroid/os/Bundle;Landroid/accounts/Account;[LJ0/c;[LJ0/c;ZIZLjava/lang/String;)V

    .line 481
    .line 482
    .line 483
    return-object v8

    .line 484
    :pswitch_1c
    invoke-static {v1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 485
    .line 486
    .line 487
    move-result v2

    .line 488
    const/4 v3, 0x0

    .line 489
    const/4 v4, 0x0

    .line 490
    move-object v6, v3

    .line 491
    move-object v9, v6

    .line 492
    move-object v11, v9

    .line 493
    move v7, v4

    .line 494
    move v8, v7

    .line 495
    move v10, v8

    .line 496
    :goto_5
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 497
    .line 498
    .line 499
    move-result v4

    .line 500
    if-ge v4, v2, :cond_11

    .line 501
    .line 502
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 503
    .line 504
    .line 505
    move-result v4

    .line 506
    int-to-char v5, v4

    .line 507
    packed-switch v5, :pswitch_data_3

    .line 508
    .line 509
    .line 510
    invoke-static {v1, v4}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 511
    .line 512
    .line 513
    goto :goto_5

    .line 514
    :pswitch_1d
    invoke-static {v1, v4}, LE2/a;->J(Landroid/os/Parcel;I)I

    .line 515
    .line 516
    .line 517
    move-result v4

    .line 518
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 519
    .line 520
    .line 521
    move-result v5

    .line 522
    if-nez v4, :cond_f

    .line 523
    .line 524
    move-object v11, v3

    .line 525
    goto :goto_5

    .line 526
    :cond_f
    invoke-virtual {v1}, Landroid/os/Parcel;->createIntArray()[I

    .line 527
    .line 528
    .line 529
    move-result-object v11

    .line 530
    add-int/2addr v5, v4

    .line 531
    invoke-virtual {v1, v5}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 532
    .line 533
    .line 534
    goto :goto_5

    .line 535
    :pswitch_1e
    invoke-static {v1, v4}, LE2/a;->H(Landroid/os/Parcel;I)I

    .line 536
    .line 537
    .line 538
    move-result v10

    .line 539
    goto :goto_5

    .line 540
    :pswitch_1f
    invoke-static {v1, v4}, LE2/a;->J(Landroid/os/Parcel;I)I

    .line 541
    .line 542
    .line 543
    move-result v4

    .line 544
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 545
    .line 546
    .line 547
    move-result v5

    .line 548
    if-nez v4, :cond_10

    .line 549
    .line 550
    move-object v9, v3

    .line 551
    goto :goto_5

    .line 552
    :cond_10
    invoke-virtual {v1}, Landroid/os/Parcel;->createIntArray()[I

    .line 553
    .line 554
    .line 555
    move-result-object v9

    .line 556
    add-int/2addr v5, v4

    .line 557
    invoke-virtual {v1, v5}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 558
    .line 559
    .line 560
    goto :goto_5

    .line 561
    :pswitch_20
    invoke-static {v1, v4}, LE2/a;->G(Landroid/os/Parcel;I)Z

    .line 562
    .line 563
    .line 564
    move-result v8

    .line 565
    goto :goto_5

    .line 566
    :pswitch_21
    invoke-static {v1, v4}, LE2/a;->G(Landroid/os/Parcel;I)Z

    .line 567
    .line 568
    .line 569
    move-result v7

    .line 570
    goto :goto_5

    .line 571
    :pswitch_22
    sget-object v5, LM0/i;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 572
    .line 573
    invoke-static {v1, v4, v5}, LE2/a;->j(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 574
    .line 575
    .line 576
    move-result-object v4

    .line 577
    move-object v6, v4

    .line 578
    check-cast v6, LM0/i;

    .line 579
    .line 580
    goto :goto_5

    .line 581
    :cond_11
    invoke-static {v1, v2}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 582
    .line 583
    .line 584
    new-instance v5, LM0/d;

    .line 585
    .line 586
    invoke-direct/range {v5 .. v11}, LM0/d;-><init>(LM0/i;ZZ[II[I)V

    .line 587
    .line 588
    .line 589
    return-object v5

    .line 590
    :pswitch_23
    invoke-static {v1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 591
    .line 592
    .line 593
    move-result v2

    .line 594
    const/4 v3, 0x0

    .line 595
    const/4 v4, 0x0

    .line 596
    move-object v5, v3

    .line 597
    move v6, v4

    .line 598
    move-object v4, v5

    .line 599
    :goto_6
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 600
    .line 601
    .line 602
    move-result v7

    .line 603
    if-ge v7, v2, :cond_16

    .line 604
    .line 605
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 606
    .line 607
    .line 608
    move-result v7

    .line 609
    int-to-char v8, v7

    .line 610
    const/4 v9, 0x1

    .line 611
    if-eq v8, v9, :cond_15

    .line 612
    .line 613
    const/4 v9, 0x2

    .line 614
    if-eq v8, v9, :cond_14

    .line 615
    .line 616
    const/4 v9, 0x3

    .line 617
    if-eq v8, v9, :cond_13

    .line 618
    .line 619
    const/4 v9, 0x4

    .line 620
    if-eq v8, v9, :cond_12

    .line 621
    .line 622
    invoke-static {v1, v7}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 623
    .line 624
    .line 625
    goto :goto_6

    .line 626
    :cond_12
    sget-object v5, LM0/d;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 627
    .line 628
    invoke-static {v1, v7, v5}, LE2/a;->j(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 629
    .line 630
    .line 631
    move-result-object v5

    .line 632
    check-cast v5, LM0/d;

    .line 633
    .line 634
    goto :goto_6

    .line 635
    :cond_13
    invoke-static {v1, v7}, LE2/a;->H(Landroid/os/Parcel;I)I

    .line 636
    .line 637
    .line 638
    move-result v6

    .line 639
    goto :goto_6

    .line 640
    :cond_14
    sget-object v4, LJ0/c;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 641
    .line 642
    invoke-static {v1, v7, v4}, LE2/a;->m(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 643
    .line 644
    .line 645
    move-result-object v4

    .line 646
    check-cast v4, [LJ0/c;

    .line 647
    .line 648
    goto :goto_6

    .line 649
    :cond_15
    invoke-static {v1, v7}, LE2/a;->f(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 650
    .line 651
    .line 652
    move-result-object v3

    .line 653
    goto :goto_6

    .line 654
    :cond_16
    invoke-static {v1, v2}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 655
    .line 656
    .line 657
    new-instance v1, LM0/z;

    .line 658
    .line 659
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 660
    .line 661
    .line 662
    iput-object v3, v1, LM0/z;->k:Landroid/os/Bundle;

    .line 663
    .line 664
    iput-object v4, v1, LM0/z;->l:[LJ0/c;

    .line 665
    .line 666
    iput v6, v1, LM0/z;->m:I

    .line 667
    .line 668
    iput-object v5, v1, LM0/z;->n:LM0/d;

    .line 669
    .line 670
    return-object v1

    .line 671
    :pswitch_24
    invoke-static {v1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 672
    .line 673
    .line 674
    move-result v2

    .line 675
    const/4 v3, 0x0

    .line 676
    move v5, v3

    .line 677
    move v6, v5

    .line 678
    move v7, v6

    .line 679
    move v8, v7

    .line 680
    move v9, v8

    .line 681
    :goto_7
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 682
    .line 683
    .line 684
    move-result v3

    .line 685
    if-ge v3, v2, :cond_1c

    .line 686
    .line 687
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 688
    .line 689
    .line 690
    move-result v3

    .line 691
    int-to-char v4, v3

    .line 692
    const/4 v10, 0x1

    .line 693
    if-eq v4, v10, :cond_1b

    .line 694
    .line 695
    const/4 v10, 0x2

    .line 696
    if-eq v4, v10, :cond_1a

    .line 697
    .line 698
    const/4 v10, 0x3

    .line 699
    if-eq v4, v10, :cond_19

    .line 700
    .line 701
    const/4 v10, 0x4

    .line 702
    if-eq v4, v10, :cond_18

    .line 703
    .line 704
    const/4 v10, 0x5

    .line 705
    if-eq v4, v10, :cond_17

    .line 706
    .line 707
    invoke-static {v1, v3}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 708
    .line 709
    .line 710
    goto :goto_7

    .line 711
    :cond_17
    invoke-static {v1, v3}, LE2/a;->H(Landroid/os/Parcel;I)I

    .line 712
    .line 713
    .line 714
    move-result v9

    .line 715
    goto :goto_7

    .line 716
    :cond_18
    invoke-static {v1, v3}, LE2/a;->H(Landroid/os/Parcel;I)I

    .line 717
    .line 718
    .line 719
    move-result v8

    .line 720
    goto :goto_7

    .line 721
    :cond_19
    invoke-static {v1, v3}, LE2/a;->G(Landroid/os/Parcel;I)Z

    .line 722
    .line 723
    .line 724
    move-result v7

    .line 725
    goto :goto_7

    .line 726
    :cond_1a
    invoke-static {v1, v3}, LE2/a;->G(Landroid/os/Parcel;I)Z

    .line 727
    .line 728
    .line 729
    move-result v6

    .line 730
    goto :goto_7

    .line 731
    :cond_1b
    invoke-static {v1, v3}, LE2/a;->H(Landroid/os/Parcel;I)I

    .line 732
    .line 733
    .line 734
    move-result v5

    .line 735
    goto :goto_7

    .line 736
    :cond_1c
    invoke-static {v1, v2}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 737
    .line 738
    .line 739
    new-instance v4, LM0/i;

    .line 740
    .line 741
    invoke-direct/range {v4 .. v9}, LM0/i;-><init>(IZZII)V

    .line 742
    .line 743
    .line 744
    return-object v4

    .line 745
    :pswitch_25
    invoke-static {v1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 746
    .line 747
    .line 748
    move-result v2

    .line 749
    const/4 v3, 0x0

    .line 750
    const/4 v4, 0x0

    .line 751
    move v6, v3

    .line 752
    move v9, v6

    .line 753
    move v10, v9

    .line 754
    move-object v7, v4

    .line 755
    move-object v8, v7

    .line 756
    :goto_8
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 757
    .line 758
    .line 759
    move-result v3

    .line 760
    if-ge v3, v2, :cond_23

    .line 761
    .line 762
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 763
    .line 764
    .line 765
    move-result v3

    .line 766
    int-to-char v5, v3

    .line 767
    const/4 v11, 0x1

    .line 768
    if-eq v5, v11, :cond_22

    .line 769
    .line 770
    const/4 v11, 0x2

    .line 771
    if-eq v5, v11, :cond_20

    .line 772
    .line 773
    const/4 v11, 0x3

    .line 774
    if-eq v5, v11, :cond_1f

    .line 775
    .line 776
    const/4 v11, 0x4

    .line 777
    if-eq v5, v11, :cond_1e

    .line 778
    .line 779
    const/4 v11, 0x5

    .line 780
    if-eq v5, v11, :cond_1d

    .line 781
    .line 782
    invoke-static {v1, v3}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 783
    .line 784
    .line 785
    goto :goto_8

    .line 786
    :cond_1d
    invoke-static {v1, v3}, LE2/a;->G(Landroid/os/Parcel;I)Z

    .line 787
    .line 788
    .line 789
    move-result v10

    .line 790
    goto :goto_8

    .line 791
    :cond_1e
    invoke-static {v1, v3}, LE2/a;->G(Landroid/os/Parcel;I)Z

    .line 792
    .line 793
    .line 794
    move-result v9

    .line 795
    goto :goto_8

    .line 796
    :cond_1f
    sget-object v5, LJ0/a;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 797
    .line 798
    invoke-static {v1, v3, v5}, LE2/a;->j(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 799
    .line 800
    .line 801
    move-result-object v3

    .line 802
    move-object v8, v3

    .line 803
    check-cast v8, LJ0/a;

    .line 804
    .line 805
    goto :goto_8

    .line 806
    :cond_20
    invoke-static {v1, v3}, LE2/a;->J(Landroid/os/Parcel;I)I

    .line 807
    .line 808
    .line 809
    move-result v3

    .line 810
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 811
    .line 812
    .line 813
    move-result v5

    .line 814
    if-nez v3, :cond_21

    .line 815
    .line 816
    move-object v7, v4

    .line 817
    goto :goto_8

    .line 818
    :cond_21
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 819
    .line 820
    .line 821
    move-result-object v7

    .line 822
    add-int/2addr v5, v3

    .line 823
    invoke-virtual {v1, v5}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 824
    .line 825
    .line 826
    goto :goto_8

    .line 827
    :cond_22
    invoke-static {v1, v3}, LE2/a;->H(Landroid/os/Parcel;I)I

    .line 828
    .line 829
    .line 830
    move-result v6

    .line 831
    goto :goto_8

    .line 832
    :cond_23
    invoke-static {v1, v2}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 833
    .line 834
    .line 835
    new-instance v5, LM0/o;

    .line 836
    .line 837
    invoke-direct/range {v5 .. v10}, LM0/o;-><init>(ILandroid/os/IBinder;LJ0/a;ZZ)V

    .line 838
    .line 839
    .line 840
    return-object v5

    .line 841
    :pswitch_26
    invoke-static {v1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 842
    .line 843
    .line 844
    move-result v2

    .line 845
    const/4 v3, 0x0

    .line 846
    const/4 v4, 0x0

    .line 847
    move v5, v4

    .line 848
    move v6, v5

    .line 849
    move-object v4, v3

    .line 850
    :goto_9
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 851
    .line 852
    .line 853
    move-result v7

    .line 854
    if-ge v7, v2, :cond_28

    .line 855
    .line 856
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 857
    .line 858
    .line 859
    move-result v7

    .line 860
    int-to-char v8, v7

    .line 861
    const/4 v9, 0x1

    .line 862
    if-eq v8, v9, :cond_27

    .line 863
    .line 864
    const/4 v9, 0x2

    .line 865
    if-eq v8, v9, :cond_26

    .line 866
    .line 867
    const/4 v9, 0x3

    .line 868
    if-eq v8, v9, :cond_25

    .line 869
    .line 870
    const/4 v9, 0x4

    .line 871
    if-eq v8, v9, :cond_24

    .line 872
    .line 873
    invoke-static {v1, v7}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 874
    .line 875
    .line 876
    goto :goto_9

    .line 877
    :cond_24
    sget-object v4, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 878
    .line 879
    invoke-static {v1, v7, v4}, LE2/a;->j(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 880
    .line 881
    .line 882
    move-result-object v4

    .line 883
    check-cast v4, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 884
    .line 885
    goto :goto_9

    .line 886
    :cond_25
    invoke-static {v1, v7}, LE2/a;->H(Landroid/os/Parcel;I)I

    .line 887
    .line 888
    .line 889
    move-result v6

    .line 890
    goto :goto_9

    .line 891
    :cond_26
    sget-object v3, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 892
    .line 893
    invoke-static {v1, v7, v3}, LE2/a;->j(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 894
    .line 895
    .line 896
    move-result-object v3

    .line 897
    check-cast v3, Landroid/accounts/Account;

    .line 898
    .line 899
    goto :goto_9

    .line 900
    :cond_27
    invoke-static {v1, v7}, LE2/a;->H(Landroid/os/Parcel;I)I

    .line 901
    .line 902
    .line 903
    move-result v5

    .line 904
    goto :goto_9

    .line 905
    :cond_28
    invoke-static {v1, v2}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 906
    .line 907
    .line 908
    new-instance v1, LM0/n;

    .line 909
    .line 910
    invoke-direct {v1, v5, v3, v6, v4}, LM0/n;-><init>(ILandroid/accounts/Account;ILcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V

    .line 911
    .line 912
    .line 913
    return-object v1

    .line 914
    :pswitch_27
    invoke-static {v1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 915
    .line 916
    .line 917
    move-result v2

    .line 918
    const/4 v3, -0x1

    .line 919
    const/4 v4, 0x0

    .line 920
    const/4 v5, 0x0

    .line 921
    const-wide/16 v6, 0x0

    .line 922
    .line 923
    move/from16 v19, v3

    .line 924
    .line 925
    move v9, v4

    .line 926
    move v10, v9

    .line 927
    move v11, v10

    .line 928
    move/from16 v18, v11

    .line 929
    .line 930
    move-object/from16 v16, v5

    .line 931
    .line 932
    move-object/from16 v17, v16

    .line 933
    .line 934
    move-wide v12, v6

    .line 935
    move-wide v14, v12

    .line 936
    :goto_a
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 937
    .line 938
    .line 939
    move-result v3

    .line 940
    if-ge v3, v2, :cond_29

    .line 941
    .line 942
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 943
    .line 944
    .line 945
    move-result v3

    .line 946
    int-to-char v4, v3

    .line 947
    packed-switch v4, :pswitch_data_4

    .line 948
    .line 949
    .line 950
    invoke-static {v1, v3}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 951
    .line 952
    .line 953
    goto :goto_a

    .line 954
    :pswitch_28
    invoke-static {v1, v3}, LE2/a;->H(Landroid/os/Parcel;I)I

    .line 955
    .line 956
    .line 957
    move-result v3

    .line 958
    move/from16 v19, v3

    .line 959
    .line 960
    goto :goto_a

    .line 961
    :pswitch_29
    invoke-static {v1, v3}, LE2/a;->H(Landroid/os/Parcel;I)I

    .line 962
    .line 963
    .line 964
    move-result v3

    .line 965
    move/from16 v18, v3

    .line 966
    .line 967
    goto :goto_a

    .line 968
    :pswitch_2a
    invoke-static {v1, v3}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 969
    .line 970
    .line 971
    move-result-object v3

    .line 972
    move-object/from16 v17, v3

    .line 973
    .line 974
    goto :goto_a

    .line 975
    :pswitch_2b
    invoke-static {v1, v3}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 976
    .line 977
    .line 978
    move-result-object v3

    .line 979
    move-object/from16 v16, v3

    .line 980
    .line 981
    goto :goto_a

    .line 982
    :pswitch_2c
    invoke-static {v1, v3}, LE2/a;->I(Landroid/os/Parcel;I)J

    .line 983
    .line 984
    .line 985
    move-result-wide v3

    .line 986
    move-wide v14, v3

    .line 987
    goto :goto_a

    .line 988
    :pswitch_2d
    invoke-static {v1, v3}, LE2/a;->I(Landroid/os/Parcel;I)J

    .line 989
    .line 990
    .line 991
    move-result-wide v3

    .line 992
    move-wide v12, v3

    .line 993
    goto :goto_a

    .line 994
    :pswitch_2e
    invoke-static {v1, v3}, LE2/a;->H(Landroid/os/Parcel;I)I

    .line 995
    .line 996
    .line 997
    move-result v3

    .line 998
    move v11, v3

    .line 999
    goto :goto_a

    .line 1000
    :pswitch_2f
    invoke-static {v1, v3}, LE2/a;->H(Landroid/os/Parcel;I)I

    .line 1001
    .line 1002
    .line 1003
    move-result v3

    .line 1004
    move v10, v3

    .line 1005
    goto :goto_a

    .line 1006
    :pswitch_30
    invoke-static {v1, v3}, LE2/a;->H(Landroid/os/Parcel;I)I

    .line 1007
    .line 1008
    .line 1009
    move-result v3

    .line 1010
    move v9, v3

    .line 1011
    goto :goto_a

    .line 1012
    :cond_29
    invoke-static {v1, v2}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 1013
    .line 1014
    .line 1015
    new-instance v8, LM0/g;

    .line 1016
    .line 1017
    invoke-direct/range {v8 .. v19}, LM0/g;-><init>(IIIJJLjava/lang/String;Ljava/lang/String;II)V

    .line 1018
    .line 1019
    .line 1020
    return-object v8

    .line 1021
    :pswitch_31
    invoke-static {v1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 1022
    .line 1023
    .line 1024
    move-result v2

    .line 1025
    const/4 v3, 0x0

    .line 1026
    const/4 v4, 0x0

    .line 1027
    :goto_b
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1028
    .line 1029
    .line 1030
    move-result v5

    .line 1031
    if-ge v5, v2, :cond_2c

    .line 1032
    .line 1033
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1034
    .line 1035
    .line 1036
    move-result v5

    .line 1037
    int-to-char v6, v5

    .line 1038
    const/4 v7, 0x1

    .line 1039
    if-eq v6, v7, :cond_2b

    .line 1040
    .line 1041
    const/4 v7, 0x2

    .line 1042
    if-eq v6, v7, :cond_2a

    .line 1043
    .line 1044
    invoke-static {v1, v5}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 1045
    .line 1046
    .line 1047
    goto :goto_b

    .line 1048
    :cond_2a
    sget-object v3, LM0/g;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1049
    .line 1050
    invoke-static {v1, v5, v3}, LE2/a;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v3

    .line 1054
    goto :goto_b

    .line 1055
    :cond_2b
    invoke-static {v1, v5}, LE2/a;->H(Landroid/os/Parcel;I)I

    .line 1056
    .line 1057
    .line 1058
    move-result v4

    .line 1059
    goto :goto_b

    .line 1060
    :cond_2c
    invoke-static {v1, v2}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 1061
    .line 1062
    .line 1063
    new-instance v1, LM0/j;

    .line 1064
    .line 1065
    invoke-direct {v1, v4, v3}, LM0/j;-><init>(ILjava/util/List;)V

    .line 1066
    .line 1067
    .line 1068
    return-object v1

    .line 1069
    :pswitch_32
    invoke-static {v1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 1070
    .line 1071
    .line 1072
    move-result v2

    .line 1073
    const/4 v3, 0x0

    .line 1074
    const-wide/16 v4, -0x1

    .line 1075
    .line 1076
    const/4 v6, 0x0

    .line 1077
    move v9, v3

    .line 1078
    move v12, v9

    .line 1079
    move-wide v10, v4

    .line 1080
    move-object v8, v6

    .line 1081
    :goto_c
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1082
    .line 1083
    .line 1084
    move-result v3

    .line 1085
    if-ge v3, v2, :cond_31

    .line 1086
    .line 1087
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1088
    .line 1089
    .line 1090
    move-result v3

    .line 1091
    int-to-char v4, v3

    .line 1092
    const/4 v5, 0x1

    .line 1093
    if-eq v4, v5, :cond_30

    .line 1094
    .line 1095
    const/4 v5, 0x2

    .line 1096
    if-eq v4, v5, :cond_2f

    .line 1097
    .line 1098
    const/4 v5, 0x3

    .line 1099
    if-eq v4, v5, :cond_2e

    .line 1100
    .line 1101
    const/4 v5, 0x4

    .line 1102
    if-eq v4, v5, :cond_2d

    .line 1103
    .line 1104
    invoke-static {v1, v3}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 1105
    .line 1106
    .line 1107
    goto :goto_c

    .line 1108
    :cond_2d
    invoke-static {v1, v3}, LE2/a;->G(Landroid/os/Parcel;I)Z

    .line 1109
    .line 1110
    .line 1111
    move-result v3

    .line 1112
    move v12, v3

    .line 1113
    goto :goto_c

    .line 1114
    :cond_2e
    invoke-static {v1, v3}, LE2/a;->I(Landroid/os/Parcel;I)J

    .line 1115
    .line 1116
    .line 1117
    move-result-wide v3

    .line 1118
    move-wide v10, v3

    .line 1119
    goto :goto_c

    .line 1120
    :cond_2f
    invoke-static {v1, v3}, LE2/a;->H(Landroid/os/Parcel;I)I

    .line 1121
    .line 1122
    .line 1123
    move-result v3

    .line 1124
    move v9, v3

    .line 1125
    goto :goto_c

    .line 1126
    :cond_30
    invoke-static {v1, v3}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v3

    .line 1130
    move-object v8, v3

    .line 1131
    goto :goto_c

    .line 1132
    :cond_31
    invoke-static {v1, v2}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 1133
    .line 1134
    .line 1135
    new-instance v7, LJ0/c;

    .line 1136
    .line 1137
    invoke-direct/range {v7 .. v12}, LJ0/c;-><init>(Ljava/lang/String;IJZ)V

    .line 1138
    .line 1139
    .line 1140
    return-object v7

    .line 1141
    :pswitch_33
    invoke-static {v1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 1142
    .line 1143
    .line 1144
    move-result v2

    .line 1145
    const/4 v3, 0x0

    .line 1146
    const/4 v4, 0x0

    .line 1147
    move-object v8, v3

    .line 1148
    move-object v9, v8

    .line 1149
    move-object v10, v9

    .line 1150
    move v6, v4

    .line 1151
    move v7, v6

    .line 1152
    :goto_d
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1153
    .line 1154
    .line 1155
    move-result v3

    .line 1156
    if-ge v3, v2, :cond_39

    .line 1157
    .line 1158
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1159
    .line 1160
    .line 1161
    move-result v3

    .line 1162
    int-to-char v4, v3

    .line 1163
    const/4 v5, 0x1

    .line 1164
    if-eq v4, v5, :cond_38

    .line 1165
    .line 1166
    const/4 v5, 0x2

    .line 1167
    if-eq v4, v5, :cond_37

    .line 1168
    .line 1169
    const/4 v5, 0x3

    .line 1170
    if-eq v4, v5, :cond_36

    .line 1171
    .line 1172
    const/4 v5, 0x4

    .line 1173
    if-eq v4, v5, :cond_35

    .line 1174
    .line 1175
    const/4 v5, 0x5

    .line 1176
    if-eq v4, v5, :cond_32

    .line 1177
    .line 1178
    invoke-static {v1, v3}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 1179
    .line 1180
    .line 1181
    goto :goto_d

    .line 1182
    :cond_32
    invoke-static {v1, v3}, LE2/a;->J(Landroid/os/Parcel;I)I

    .line 1183
    .line 1184
    .line 1185
    move-result v3

    .line 1186
    if-nez v3, :cond_33

    .line 1187
    .line 1188
    const/4 v3, 0x0

    .line 1189
    :goto_e
    move-object v10, v3

    .line 1190
    goto :goto_d

    .line 1191
    :cond_33
    const/4 v4, 0x4

    .line 1192
    if-ne v3, v4, :cond_34

    .line 1193
    .line 1194
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1195
    .line 1196
    .line 1197
    move-result v3

    .line 1198
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v3

    .line 1202
    goto :goto_e

    .line 1203
    :cond_34
    new-instance v2, LD0/a;

    .line 1204
    .line 1205
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 1206
    .line 1207
    .line 1208
    move-result-object v5

    .line 1209
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v6

    .line 1213
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 1214
    .line 1215
    .line 1216
    move-result v6

    .line 1217
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v7

    .line 1221
    add-int/lit8 v6, v6, 0x13

    .line 1222
    .line 1223
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 1224
    .line 1225
    .line 1226
    move-result v7

    .line 1227
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v8

    .line 1231
    add-int/2addr v6, v7

    .line 1232
    add-int/lit8 v6, v6, 0x4

    .line 1233
    .line 1234
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 1235
    .line 1236
    .line 1237
    move-result v7

    .line 1238
    add-int/2addr v7, v6

    .line 1239
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1240
    .line 1241
    add-int/lit8 v7, v7, 0x1

    .line 1242
    .line 1243
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1244
    .line 1245
    .line 1246
    const-string v7, "Expected size "

    .line 1247
    .line 1248
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1249
    .line 1250
    .line 1251
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1252
    .line 1253
    .line 1254
    const-string v4, " got "

    .line 1255
    .line 1256
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1257
    .line 1258
    .line 1259
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1260
    .line 1261
    .line 1262
    const-string v3, " (0x"

    .line 1263
    .line 1264
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1265
    .line 1266
    .line 1267
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1268
    .line 1269
    .line 1270
    const-string v3, ")"

    .line 1271
    .line 1272
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1273
    .line 1274
    .line 1275
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1276
    .line 1277
    .line 1278
    move-result-object v3

    .line 1279
    invoke-direct {v2, v3, v1}, LD0/a;-><init>(Ljava/lang/String;Landroid/os/Parcel;)V

    .line 1280
    .line 1281
    .line 1282
    throw v2

    .line 1283
    :cond_35
    invoke-static {v1, v3}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1284
    .line 1285
    .line 1286
    move-result-object v9

    .line 1287
    goto/16 :goto_d

    .line 1288
    .line 1289
    :cond_36
    sget-object v4, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1290
    .line 1291
    invoke-static {v1, v3, v4}, LE2/a;->j(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v3

    .line 1295
    move-object v8, v3

    .line 1296
    check-cast v8, Landroid/app/PendingIntent;

    .line 1297
    .line 1298
    goto/16 :goto_d

    .line 1299
    .line 1300
    :cond_37
    invoke-static {v1, v3}, LE2/a;->H(Landroid/os/Parcel;I)I

    .line 1301
    .line 1302
    .line 1303
    move-result v7

    .line 1304
    goto/16 :goto_d

    .line 1305
    .line 1306
    :cond_38
    invoke-static {v1, v3}, LE2/a;->H(Landroid/os/Parcel;I)I

    .line 1307
    .line 1308
    .line 1309
    move-result v6

    .line 1310
    goto/16 :goto_d

    .line 1311
    .line 1312
    :cond_39
    invoke-static {v1, v2}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 1313
    .line 1314
    .line 1315
    new-instance v5, LJ0/a;

    .line 1316
    .line 1317
    invoke-direct/range {v5 .. v10}, LJ0/a;-><init>(IILandroid/app/PendingIntent;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 1318
    .line 1319
    .line 1320
    return-object v5

    .line 1321
    :pswitch_34
    invoke-static {v1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 1322
    .line 1323
    .line 1324
    move-result v2

    .line 1325
    const/4 v3, 0x0

    .line 1326
    move-object v4, v3

    .line 1327
    :goto_f
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1328
    .line 1329
    .line 1330
    move-result v5

    .line 1331
    if-ge v5, v2, :cond_3c

    .line 1332
    .line 1333
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1334
    .line 1335
    .line 1336
    move-result v5

    .line 1337
    int-to-char v6, v5

    .line 1338
    const/4 v7, 0x2

    .line 1339
    if-eq v6, v7, :cond_3b

    .line 1340
    .line 1341
    const/4 v7, 0x5

    .line 1342
    if-eq v6, v7, :cond_3a

    .line 1343
    .line 1344
    invoke-static {v1, v5}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 1345
    .line 1346
    .line 1347
    goto :goto_f

    .line 1348
    :cond_3a
    sget-object v4, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1349
    .line 1350
    invoke-static {v1, v5, v4}, LE2/a;->j(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1351
    .line 1352
    .line 1353
    move-result-object v4

    .line 1354
    check-cast v4, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 1355
    .line 1356
    goto :goto_f

    .line 1357
    :cond_3b
    invoke-static {v1, v5}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1358
    .line 1359
    .line 1360
    move-result-object v3

    .line 1361
    goto :goto_f

    .line 1362
    :cond_3c
    invoke-static {v1, v2}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 1363
    .line 1364
    .line 1365
    new-instance v1, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;

    .line 1366
    .line 1367
    invoke-direct {v1, v3, v4}, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;-><init>(Ljava/lang/String;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V

    .line 1368
    .line 1369
    .line 1370
    return-object v1

    .line 1371
    :pswitch_35
    invoke-static {v1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 1372
    .line 1373
    .line 1374
    move-result v2

    .line 1375
    const/4 v3, 0x0

    .line 1376
    const/4 v4, 0x0

    .line 1377
    move v5, v4

    .line 1378
    :goto_10
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1379
    .line 1380
    .line 1381
    move-result v6

    .line 1382
    if-ge v6, v2, :cond_40

    .line 1383
    .line 1384
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1385
    .line 1386
    .line 1387
    move-result v6

    .line 1388
    int-to-char v7, v6

    .line 1389
    const/4 v8, 0x1

    .line 1390
    if-eq v7, v8, :cond_3f

    .line 1391
    .line 1392
    const/4 v8, 0x2

    .line 1393
    if-eq v7, v8, :cond_3e

    .line 1394
    .line 1395
    const/4 v8, 0x3

    .line 1396
    if-eq v7, v8, :cond_3d

    .line 1397
    .line 1398
    invoke-static {v1, v6}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 1399
    .line 1400
    .line 1401
    goto :goto_10

    .line 1402
    :cond_3d
    invoke-static {v1, v6}, LE2/a;->f(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 1403
    .line 1404
    .line 1405
    move-result-object v3

    .line 1406
    goto :goto_10

    .line 1407
    :cond_3e
    invoke-static {v1, v6}, LE2/a;->H(Landroid/os/Parcel;I)I

    .line 1408
    .line 1409
    .line 1410
    move-result v5

    .line 1411
    goto :goto_10

    .line 1412
    :cond_3f
    invoke-static {v1, v6}, LE2/a;->H(Landroid/os/Parcel;I)I

    .line 1413
    .line 1414
    .line 1415
    move-result v4

    .line 1416
    goto :goto_10

    .line 1417
    :cond_40
    invoke-static {v1, v2}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 1418
    .line 1419
    .line 1420
    new-instance v1, LH0/a;

    .line 1421
    .line 1422
    invoke-direct {v1, v4, v5, v3}, LH0/a;-><init>(IILandroid/os/Bundle;)V

    .line 1423
    .line 1424
    .line 1425
    return-object v1

    .line 1426
    :pswitch_36
    new-instance v2, LG/g;

    .line 1427
    .line 1428
    invoke-direct {v2, v1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 1429
    .line 1430
    .line 1431
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1432
    .line 1433
    .line 1434
    move-result v1

    .line 1435
    iput v1, v2, LG/g;->k:I

    .line 1436
    .line 1437
    return-object v2

    .line 1438
    :pswitch_37
    invoke-static {v1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 1439
    .line 1440
    .line 1441
    move-result v2

    .line 1442
    const/4 v3, 0x0

    .line 1443
    move-object v5, v3

    .line 1444
    move-object v6, v5

    .line 1445
    move-object v7, v6

    .line 1446
    move-object v8, v7

    .line 1447
    move-object v9, v8

    .line 1448
    move-object v10, v9

    .line 1449
    move-object v11, v10

    .line 1450
    move-object v12, v11

    .line 1451
    move-object v13, v12

    .line 1452
    :goto_11
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1453
    .line 1454
    .line 1455
    move-result v3

    .line 1456
    if-ge v3, v2, :cond_41

    .line 1457
    .line 1458
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1459
    .line 1460
    .line 1461
    move-result v3

    .line 1462
    int-to-char v4, v3

    .line 1463
    packed-switch v4, :pswitch_data_5

    .line 1464
    .line 1465
    .line 1466
    invoke-static {v1, v3}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 1467
    .line 1468
    .line 1469
    goto :goto_11

    .line 1470
    :pswitch_38
    sget-object v4, LV0/i;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1471
    .line 1472
    invoke-static {v1, v3, v4}, LE2/a;->j(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1473
    .line 1474
    .line 1475
    move-result-object v3

    .line 1476
    move-object v13, v3

    .line 1477
    check-cast v13, LV0/i;

    .line 1478
    .line 1479
    goto :goto_11

    .line 1480
    :pswitch_39
    invoke-static {v1, v3}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1481
    .line 1482
    .line 1483
    move-result-object v12

    .line 1484
    goto :goto_11

    .line 1485
    :pswitch_3a
    invoke-static {v1, v3}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1486
    .line 1487
    .line 1488
    move-result-object v11

    .line 1489
    goto :goto_11

    .line 1490
    :pswitch_3b
    invoke-static {v1, v3}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1491
    .line 1492
    .line 1493
    move-result-object v10

    .line 1494
    goto :goto_11

    .line 1495
    :pswitch_3c
    sget-object v4, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1496
    .line 1497
    invoke-static {v1, v3, v4}, LE2/a;->j(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1498
    .line 1499
    .line 1500
    move-result-object v3

    .line 1501
    move-object v9, v3

    .line 1502
    check-cast v9, Landroid/net/Uri;

    .line 1503
    .line 1504
    goto :goto_11

    .line 1505
    :pswitch_3d
    invoke-static {v1, v3}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1506
    .line 1507
    .line 1508
    move-result-object v8

    .line 1509
    goto :goto_11

    .line 1510
    :pswitch_3e
    invoke-static {v1, v3}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1511
    .line 1512
    .line 1513
    move-result-object v7

    .line 1514
    goto :goto_11

    .line 1515
    :pswitch_3f
    invoke-static {v1, v3}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1516
    .line 1517
    .line 1518
    move-result-object v6

    .line 1519
    goto :goto_11

    .line 1520
    :pswitch_40
    invoke-static {v1, v3}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1521
    .line 1522
    .line 1523
    move-result-object v5

    .line 1524
    goto :goto_11

    .line 1525
    :cond_41
    invoke-static {v1, v2}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 1526
    .line 1527
    .line 1528
    new-instance v4, LF0/j;

    .line 1529
    .line 1530
    invoke-direct/range {v4 .. v13}, LF0/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LV0/i;)V

    .line 1531
    .line 1532
    .line 1533
    return-object v4

    .line 1534
    :pswitch_41
    invoke-static {v1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 1535
    .line 1536
    .line 1537
    move-result v2

    .line 1538
    const/4 v3, 0x0

    .line 1539
    move-object v4, v3

    .line 1540
    move-object v5, v4

    .line 1541
    :goto_12
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1542
    .line 1543
    .line 1544
    move-result v6

    .line 1545
    if-ge v6, v2, :cond_45

    .line 1546
    .line 1547
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1548
    .line 1549
    .line 1550
    move-result v6

    .line 1551
    int-to-char v7, v6

    .line 1552
    const/4 v8, 0x1

    .line 1553
    if-eq v7, v8, :cond_44

    .line 1554
    .line 1555
    const/4 v8, 0x2

    .line 1556
    if-eq v7, v8, :cond_43

    .line 1557
    .line 1558
    const/4 v8, 0x3

    .line 1559
    if-eq v7, v8, :cond_42

    .line 1560
    .line 1561
    invoke-static {v1, v6}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 1562
    .line 1563
    .line 1564
    goto :goto_12

    .line 1565
    :cond_42
    invoke-static {v1, v6}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1566
    .line 1567
    .line 1568
    move-result-object v5

    .line 1569
    goto :goto_12

    .line 1570
    :cond_43
    sget-object v4, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1571
    .line 1572
    invoke-static {v1, v6, v4}, LE2/a;->j(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1573
    .line 1574
    .line 1575
    move-result-object v4

    .line 1576
    check-cast v4, Landroid/accounts/Account;

    .line 1577
    .line 1578
    goto :goto_12

    .line 1579
    :cond_44
    sget-object v3, Lcom/google/android/gms/common/api/Scope;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1580
    .line 1581
    invoke-static {v1, v6, v3}, LE2/a;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1582
    .line 1583
    .line 1584
    move-result-object v3

    .line 1585
    goto :goto_12

    .line 1586
    :cond_45
    invoke-static {v1, v2}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 1587
    .line 1588
    .line 1589
    new-instance v1, Lcom/google/android/gms/auth/api/identity/RevokeAccessRequest;

    .line 1590
    .line 1591
    invoke-direct {v1, v3, v4, v5}, Lcom/google/android/gms/auth/api/identity/RevokeAccessRequest;-><init>(Ljava/util/List;Landroid/accounts/Account;Ljava/lang/String;)V

    .line 1592
    .line 1593
    .line 1594
    return-object v1

    .line 1595
    :pswitch_42
    invoke-static {v1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 1596
    .line 1597
    .line 1598
    move-result v2

    .line 1599
    const/4 v3, 0x0

    .line 1600
    :goto_13
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1601
    .line 1602
    .line 1603
    move-result v4

    .line 1604
    if-ge v4, v2, :cond_47

    .line 1605
    .line 1606
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1607
    .line 1608
    .line 1609
    move-result v4

    .line 1610
    int-to-char v5, v4

    .line 1611
    const/4 v6, 0x1

    .line 1612
    if-eq v5, v6, :cond_46

    .line 1613
    .line 1614
    invoke-static {v1, v4}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 1615
    .line 1616
    .line 1617
    goto :goto_13

    .line 1618
    :cond_46
    invoke-static {v1, v4}, LE2/a;->G(Landroid/os/Parcel;I)Z

    .line 1619
    .line 1620
    .line 1621
    move-result v3

    .line 1622
    goto :goto_13

    .line 1623
    :cond_47
    invoke-static {v1, v2}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 1624
    .line 1625
    .line 1626
    new-instance v1, LF0/f;

    .line 1627
    .line 1628
    invoke-direct {v1, v3}, LF0/f;-><init>(Z)V

    .line 1629
    .line 1630
    .line 1631
    return-object v1

    .line 1632
    :pswitch_43
    invoke-static {v1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 1633
    .line 1634
    .line 1635
    move-result v2

    .line 1636
    const/4 v3, 0x0

    .line 1637
    const/4 v4, 0x0

    .line 1638
    move v5, v4

    .line 1639
    move-object v4, v3

    .line 1640
    :goto_14
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1641
    .line 1642
    .line 1643
    move-result v6

    .line 1644
    if-ge v6, v2, :cond_4b

    .line 1645
    .line 1646
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1647
    .line 1648
    .line 1649
    move-result v6

    .line 1650
    int-to-char v7, v6

    .line 1651
    const/4 v8, 0x1

    .line 1652
    if-eq v7, v8, :cond_4a

    .line 1653
    .line 1654
    const/4 v8, 0x2

    .line 1655
    if-eq v7, v8, :cond_49

    .line 1656
    .line 1657
    const/4 v8, 0x3

    .line 1658
    if-eq v7, v8, :cond_48

    .line 1659
    .line 1660
    invoke-static {v1, v6}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 1661
    .line 1662
    .line 1663
    goto :goto_14

    .line 1664
    :cond_48
    invoke-static {v1, v6}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1665
    .line 1666
    .line 1667
    move-result-object v4

    .line 1668
    goto :goto_14

    .line 1669
    :cond_49
    invoke-static {v1, v6}, LE2/a;->g(Landroid/os/Parcel;I)[B

    .line 1670
    .line 1671
    .line 1672
    move-result-object v3

    .line 1673
    goto :goto_14

    .line 1674
    :cond_4a
    invoke-static {v1, v6}, LE2/a;->G(Landroid/os/Parcel;I)Z

    .line 1675
    .line 1676
    .line 1677
    move-result v5

    .line 1678
    goto :goto_14

    .line 1679
    :cond_4b
    invoke-static {v1, v2}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 1680
    .line 1681
    .line 1682
    new-instance v1, LF0/e;

    .line 1683
    .line 1684
    invoke-direct {v1, v5, v3, v4}, LF0/e;-><init>(Z[BLjava/lang/String;)V

    .line 1685
    .line 1686
    .line 1687
    return-object v1

    .line 1688
    :pswitch_44
    invoke-static {v1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 1689
    .line 1690
    .line 1691
    move-result v2

    .line 1692
    const/4 v3, 0x0

    .line 1693
    const/4 v4, 0x0

    .line 1694
    :goto_15
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1695
    .line 1696
    .line 1697
    move-result v5

    .line 1698
    if-ge v5, v2, :cond_4e

    .line 1699
    .line 1700
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1701
    .line 1702
    .line 1703
    move-result v5

    .line 1704
    int-to-char v6, v5

    .line 1705
    const/4 v7, 0x1

    .line 1706
    if-eq v6, v7, :cond_4d

    .line 1707
    .line 1708
    const/4 v7, 0x2

    .line 1709
    if-eq v6, v7, :cond_4c

    .line 1710
    .line 1711
    invoke-static {v1, v5}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 1712
    .line 1713
    .line 1714
    goto :goto_15

    .line 1715
    :cond_4c
    invoke-static {v1, v5}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1716
    .line 1717
    .line 1718
    move-result-object v3

    .line 1719
    goto :goto_15

    .line 1720
    :cond_4d
    invoke-static {v1, v5}, LE2/a;->G(Landroid/os/Parcel;I)Z

    .line 1721
    .line 1722
    .line 1723
    move-result v4

    .line 1724
    goto :goto_15

    .line 1725
    :cond_4e
    invoke-static {v1, v2}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 1726
    .line 1727
    .line 1728
    new-instance v1, LF0/d;

    .line 1729
    .line 1730
    invoke-direct {v1, v3, v4}, LF0/d;-><init>(Ljava/lang/String;Z)V

    .line 1731
    .line 1732
    .line 1733
    return-object v1

    .line 1734
    :pswitch_45
    invoke-static {v1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 1735
    .line 1736
    .line 1737
    move-result v2

    .line 1738
    const/4 v3, 0x0

    .line 1739
    const/4 v4, 0x0

    .line 1740
    move-object v7, v3

    .line 1741
    move-object v8, v7

    .line 1742
    move-object v10, v8

    .line 1743
    move-object v11, v10

    .line 1744
    move-object v13, v11

    .line 1745
    move-object v14, v13

    .line 1746
    move v6, v4

    .line 1747
    move v9, v6

    .line 1748
    move v12, v9

    .line 1749
    :goto_16
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1750
    .line 1751
    .line 1752
    move-result v3

    .line 1753
    if-ge v3, v2, :cond_4f

    .line 1754
    .line 1755
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1756
    .line 1757
    .line 1758
    move-result v3

    .line 1759
    int-to-char v4, v3

    .line 1760
    packed-switch v4, :pswitch_data_6

    .line 1761
    .line 1762
    .line 1763
    invoke-static {v1, v3}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 1764
    .line 1765
    .line 1766
    goto :goto_16

    .line 1767
    :pswitch_46
    invoke-static {v1, v3}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1768
    .line 1769
    .line 1770
    move-result-object v14

    .line 1771
    goto :goto_16

    .line 1772
    :pswitch_47
    sget-object v4, LF0/m;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1773
    .line 1774
    invoke-static {v1, v3, v4}, LE2/a;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1775
    .line 1776
    .line 1777
    move-result-object v13

    .line 1778
    goto :goto_16

    .line 1779
    :pswitch_48
    invoke-static {v1, v3}, LE2/a;->G(Landroid/os/Parcel;I)Z

    .line 1780
    .line 1781
    .line 1782
    move-result v12

    .line 1783
    goto :goto_16

    .line 1784
    :pswitch_49
    invoke-static {v1, v3}, LE2/a;->l(Landroid/os/Parcel;I)Ljava/util/ArrayList;

    .line 1785
    .line 1786
    .line 1787
    move-result-object v11

    .line 1788
    goto :goto_16

    .line 1789
    :pswitch_4a
    invoke-static {v1, v3}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1790
    .line 1791
    .line 1792
    move-result-object v10

    .line 1793
    goto :goto_16

    .line 1794
    :pswitch_4b
    invoke-static {v1, v3}, LE2/a;->G(Landroid/os/Parcel;I)Z

    .line 1795
    .line 1796
    .line 1797
    move-result v9

    .line 1798
    goto :goto_16

    .line 1799
    :pswitch_4c
    invoke-static {v1, v3}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1800
    .line 1801
    .line 1802
    move-result-object v8

    .line 1803
    goto :goto_16

    .line 1804
    :pswitch_4d
    invoke-static {v1, v3}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1805
    .line 1806
    .line 1807
    move-result-object v7

    .line 1808
    goto :goto_16

    .line 1809
    :pswitch_4e
    invoke-static {v1, v3}, LE2/a;->G(Landroid/os/Parcel;I)Z

    .line 1810
    .line 1811
    .line 1812
    move-result v6

    .line 1813
    goto :goto_16

    .line 1814
    :cond_4f
    invoke-static {v1, v2}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 1815
    .line 1816
    .line 1817
    new-instance v5, LF0/c;

    .line 1818
    .line 1819
    invoke-direct/range {v5 .. v14}, LF0/c;-><init>(ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/ArrayList;ZLjava/util/ArrayList;Ljava/lang/String;)V

    .line 1820
    .line 1821
    .line 1822
    return-object v5

    .line 1823
    :pswitch_4f
    invoke-static {v1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 1824
    .line 1825
    .line 1826
    move-result v2

    .line 1827
    const/4 v3, 0x0

    .line 1828
    const/4 v4, 0x0

    .line 1829
    move-object v6, v3

    .line 1830
    move-object v7, v6

    .line 1831
    move-object v8, v7

    .line 1832
    move-object v9, v8

    .line 1833
    move-object v12, v9

    .line 1834
    move v10, v4

    .line 1835
    move v11, v10

    .line 1836
    :goto_17
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1837
    .line 1838
    .line 1839
    move-result v3

    .line 1840
    if-ge v3, v2, :cond_50

    .line 1841
    .line 1842
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1843
    .line 1844
    .line 1845
    move-result v3

    .line 1846
    int-to-char v4, v3

    .line 1847
    packed-switch v4, :pswitch_data_7

    .line 1848
    .line 1849
    .line 1850
    invoke-static {v1, v3}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 1851
    .line 1852
    .line 1853
    goto :goto_17

    .line 1854
    :pswitch_50
    sget-object v4, LF0/m;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1855
    .line 1856
    invoke-static {v1, v3, v4}, LE2/a;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1857
    .line 1858
    .line 1859
    move-result-object v12

    .line 1860
    goto :goto_17

    .line 1861
    :pswitch_51
    invoke-static {v1, v3}, LE2/a;->H(Landroid/os/Parcel;I)I

    .line 1862
    .line 1863
    .line 1864
    move-result v11

    .line 1865
    goto :goto_17

    .line 1866
    :pswitch_52
    invoke-static {v1, v3}, LE2/a;->G(Landroid/os/Parcel;I)Z

    .line 1867
    .line 1868
    .line 1869
    move-result v10

    .line 1870
    goto :goto_17

    .line 1871
    :pswitch_53
    invoke-static {v1, v3}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1872
    .line 1873
    .line 1874
    move-result-object v9

    .line 1875
    goto :goto_17

    .line 1876
    :pswitch_54
    invoke-static {v1, v3}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1877
    .line 1878
    .line 1879
    move-result-object v8

    .line 1880
    goto :goto_17

    .line 1881
    :pswitch_55
    invoke-static {v1, v3}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1882
    .line 1883
    .line 1884
    move-result-object v7

    .line 1885
    goto :goto_17

    .line 1886
    :pswitch_56
    invoke-static {v1, v3}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1887
    .line 1888
    .line 1889
    move-result-object v6

    .line 1890
    goto :goto_17

    .line 1891
    :cond_50
    invoke-static {v1, v2}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 1892
    .line 1893
    .line 1894
    new-instance v5, LF0/i;

    .line 1895
    .line 1896
    invoke-direct/range {v5 .. v12}, LF0/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/util/List;)V

    .line 1897
    .line 1898
    .line 1899
    return-object v5

    .line 1900
    :pswitch_57
    invoke-static {v1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 1901
    .line 1902
    .line 1903
    move-result v2

    .line 1904
    const/4 v3, 0x0

    .line 1905
    move-object v4, v3

    .line 1906
    :goto_18
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1907
    .line 1908
    .line 1909
    move-result v5

    .line 1910
    if-ge v5, v2, :cond_53

    .line 1911
    .line 1912
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1913
    .line 1914
    .line 1915
    move-result v5

    .line 1916
    int-to-char v6, v5

    .line 1917
    const/4 v7, 0x1

    .line 1918
    if-eq v6, v7, :cond_52

    .line 1919
    .line 1920
    const/4 v7, 0x2

    .line 1921
    if-eq v6, v7, :cond_51

    .line 1922
    .line 1923
    invoke-static {v1, v5}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 1924
    .line 1925
    .line 1926
    goto :goto_18

    .line 1927
    :cond_51
    invoke-static {v1, v5}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1928
    .line 1929
    .line 1930
    move-result-object v4

    .line 1931
    goto :goto_18

    .line 1932
    :cond_52
    invoke-static {v1, v5}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1933
    .line 1934
    .line 1935
    move-result-object v3

    .line 1936
    goto :goto_18

    .line 1937
    :cond_53
    invoke-static {v1, v2}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 1938
    .line 1939
    .line 1940
    new-instance v1, Lcom/google/android/gms/auth/api/identity/ClearTokenRequest;

    .line 1941
    .line 1942
    invoke-direct {v1, v3, v4}, Lcom/google/android/gms/auth/api/identity/ClearTokenRequest;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1943
    .line 1944
    .line 1945
    return-object v1

    .line 1946
    :pswitch_58
    invoke-static {v1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 1947
    .line 1948
    .line 1949
    move-result v2

    .line 1950
    const/4 v3, 0x0

    .line 1951
    const/4 v4, 0x0

    .line 1952
    :goto_19
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1953
    .line 1954
    .line 1955
    move-result v5

    .line 1956
    if-ge v5, v2, :cond_56

    .line 1957
    .line 1958
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1959
    .line 1960
    .line 1961
    move-result v5

    .line 1962
    int-to-char v6, v5

    .line 1963
    const/4 v7, 0x1

    .line 1964
    if-eq v6, v7, :cond_55

    .line 1965
    .line 1966
    const/4 v7, 0x2

    .line 1967
    if-eq v6, v7, :cond_54

    .line 1968
    .line 1969
    invoke-static {v1, v5}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 1970
    .line 1971
    .line 1972
    goto :goto_19

    .line 1973
    :cond_54
    invoke-static {v1, v5}, LE2/a;->G(Landroid/os/Parcel;I)Z

    .line 1974
    .line 1975
    .line 1976
    move-result v3

    .line 1977
    goto :goto_19

    .line 1978
    :cond_55
    invoke-static {v1, v5}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1979
    .line 1980
    .line 1981
    move-result-object v4

    .line 1982
    goto :goto_19

    .line 1983
    :cond_56
    invoke-static {v1, v2}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 1984
    .line 1985
    .line 1986
    new-instance v1, LF0/m;

    .line 1987
    .line 1988
    invoke-direct {v1, v4, v3}, LF0/m;-><init>(Ljava/lang/String;Z)V

    .line 1989
    .line 1990
    .line 1991
    return-object v1

    .line 1992
    :pswitch_59
    invoke-static {v1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 1993
    .line 1994
    .line 1995
    move-result v2

    .line 1996
    const/4 v3, 0x0

    .line 1997
    :goto_1a
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1998
    .line 1999
    .line 2000
    move-result v4

    .line 2001
    if-ge v4, v2, :cond_58

    .line 2002
    .line 2003
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 2004
    .line 2005
    .line 2006
    move-result v4

    .line 2007
    int-to-char v5, v4

    .line 2008
    const/4 v6, 0x1

    .line 2009
    if-eq v5, v6, :cond_57

    .line 2010
    .line 2011
    invoke-static {v1, v4}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 2012
    .line 2013
    .line 2014
    goto :goto_1a

    .line 2015
    :cond_57
    sget-object v3, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 2016
    .line 2017
    invoke-static {v1, v4, v3}, LE2/a;->j(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 2018
    .line 2019
    .line 2020
    move-result-object v3

    .line 2021
    check-cast v3, Landroid/app/PendingIntent;

    .line 2022
    .line 2023
    goto :goto_1a

    .line 2024
    :cond_58
    invoke-static {v1, v2}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 2025
    .line 2026
    .line 2027
    new-instance v1, LF0/h;

    .line 2028
    .line 2029
    invoke-direct {v1, v3}, LF0/h;-><init>(Landroid/app/PendingIntent;)V

    .line 2030
    .line 2031
    .line 2032
    return-object v1

    .line 2033
    :pswitch_5a
    invoke-static {v1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 2034
    .line 2035
    .line 2036
    move-result v2

    .line 2037
    const/4 v3, 0x0

    .line 2038
    const/4 v4, 0x0

    .line 2039
    move v9, v3

    .line 2040
    move v10, v9

    .line 2041
    move v13, v10

    .line 2042
    move-object v6, v4

    .line 2043
    move-object v7, v6

    .line 2044
    move-object v8, v7

    .line 2045
    move-object v11, v8

    .line 2046
    move-object v12, v11

    .line 2047
    :goto_1b
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 2048
    .line 2049
    .line 2050
    move-result v3

    .line 2051
    if-ge v3, v2, :cond_59

    .line 2052
    .line 2053
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 2054
    .line 2055
    .line 2056
    move-result v3

    .line 2057
    int-to-char v4, v3

    .line 2058
    packed-switch v4, :pswitch_data_8

    .line 2059
    .line 2060
    .line 2061
    invoke-static {v1, v3}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 2062
    .line 2063
    .line 2064
    goto :goto_1b

    .line 2065
    :pswitch_5b
    invoke-static {v1, v3}, LE2/a;->G(Landroid/os/Parcel;I)Z

    .line 2066
    .line 2067
    .line 2068
    move-result v13

    .line 2069
    goto :goto_1b

    .line 2070
    :pswitch_5c
    sget-object v4, LF0/d;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 2071
    .line 2072
    invoke-static {v1, v3, v4}, LE2/a;->j(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 2073
    .line 2074
    .line 2075
    move-result-object v3

    .line 2076
    move-object v12, v3

    .line 2077
    check-cast v12, LF0/d;

    .line 2078
    .line 2079
    goto :goto_1b

    .line 2080
    :pswitch_5d
    sget-object v4, LF0/e;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 2081
    .line 2082
    invoke-static {v1, v3, v4}, LE2/a;->j(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 2083
    .line 2084
    .line 2085
    move-result-object v3

    .line 2086
    move-object v11, v3

    .line 2087
    check-cast v11, LF0/e;

    .line 2088
    .line 2089
    goto :goto_1b

    .line 2090
    :pswitch_5e
    invoke-static {v1, v3}, LE2/a;->H(Landroid/os/Parcel;I)I

    .line 2091
    .line 2092
    .line 2093
    move-result v10

    .line 2094
    goto :goto_1b

    .line 2095
    :pswitch_5f
    invoke-static {v1, v3}, LE2/a;->G(Landroid/os/Parcel;I)Z

    .line 2096
    .line 2097
    .line 2098
    move-result v9

    .line 2099
    goto :goto_1b

    .line 2100
    :pswitch_60
    invoke-static {v1, v3}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 2101
    .line 2102
    .line 2103
    move-result-object v8

    .line 2104
    goto :goto_1b

    .line 2105
    :pswitch_61
    sget-object v4, LF0/c;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 2106
    .line 2107
    invoke-static {v1, v3, v4}, LE2/a;->j(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 2108
    .line 2109
    .line 2110
    move-result-object v3

    .line 2111
    move-object v7, v3

    .line 2112
    check-cast v7, LF0/c;

    .line 2113
    .line 2114
    goto :goto_1b

    .line 2115
    :pswitch_62
    sget-object v4, LF0/f;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 2116
    .line 2117
    invoke-static {v1, v3, v4}, LE2/a;->j(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 2118
    .line 2119
    .line 2120
    move-result-object v3

    .line 2121
    move-object v6, v3

    .line 2122
    check-cast v6, LF0/f;

    .line 2123
    .line 2124
    goto :goto_1b

    .line 2125
    :cond_59
    invoke-static {v1, v2}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 2126
    .line 2127
    .line 2128
    new-instance v5, LF0/g;

    .line 2129
    .line 2130
    invoke-direct/range {v5 .. v13}, LF0/g;-><init>(LF0/f;LF0/c;Ljava/lang/String;ZILF0/e;LF0/d;Z)V

    .line 2131
    .line 2132
    .line 2133
    return-object v5

    .line 2134
    :pswitch_63
    invoke-static {v1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 2135
    .line 2136
    .line 2137
    move-result v2

    .line 2138
    const/4 v3, 0x0

    .line 2139
    move-object v5, v3

    .line 2140
    move-object v6, v5

    .line 2141
    move-object v7, v6

    .line 2142
    move-object v8, v7

    .line 2143
    move-object v9, v8

    .line 2144
    move-object v10, v9

    .line 2145
    move-object v11, v10

    .line 2146
    :goto_1c
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 2147
    .line 2148
    .line 2149
    move-result v3

    .line 2150
    if-ge v3, v2, :cond_5a

    .line 2151
    .line 2152
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 2153
    .line 2154
    .line 2155
    move-result v3

    .line 2156
    int-to-char v4, v3

    .line 2157
    packed-switch v4, :pswitch_data_9

    .line 2158
    .line 2159
    .line 2160
    invoke-static {v1, v3}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 2161
    .line 2162
    .line 2163
    goto :goto_1c

    .line 2164
    :pswitch_64
    invoke-static {v1, v3}, LE2/a;->f(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 2165
    .line 2166
    .line 2167
    move-result-object v11

    .line 2168
    goto :goto_1c

    .line 2169
    :pswitch_65
    sget-object v4, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 2170
    .line 2171
    invoke-static {v1, v3, v4}, LE2/a;->j(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 2172
    .line 2173
    .line 2174
    move-result-object v3

    .line 2175
    move-object v10, v3

    .line 2176
    check-cast v10, Landroid/app/PendingIntent;

    .line 2177
    .line 2178
    goto :goto_1c

    .line 2179
    :pswitch_66
    sget-object v4, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 2180
    .line 2181
    invoke-static {v1, v3, v4}, LE2/a;->j(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 2182
    .line 2183
    .line 2184
    move-result-object v3

    .line 2185
    move-object v9, v3

    .line 2186
    check-cast v9, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 2187
    .line 2188
    goto :goto_1c

    .line 2189
    :pswitch_67
    invoke-static {v1, v3}, LE2/a;->l(Landroid/os/Parcel;I)Ljava/util/ArrayList;

    .line 2190
    .line 2191
    .line 2192
    move-result-object v8

    .line 2193
    goto :goto_1c

    .line 2194
    :pswitch_68
    invoke-static {v1, v3}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 2195
    .line 2196
    .line 2197
    move-result-object v7

    .line 2198
    goto :goto_1c

    .line 2199
    :pswitch_69
    invoke-static {v1, v3}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 2200
    .line 2201
    .line 2202
    move-result-object v6

    .line 2203
    goto :goto_1c

    .line 2204
    :pswitch_6a
    invoke-static {v1, v3}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 2205
    .line 2206
    .line 2207
    move-result-object v5

    .line 2208
    goto :goto_1c

    .line 2209
    :cond_5a
    invoke-static {v1, v2}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 2210
    .line 2211
    .line 2212
    new-instance v4, LF0/a;

    .line 2213
    .line 2214
    invoke-direct/range {v4 .. v11}, LF0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Landroid/app/PendingIntent;Landroid/os/Bundle;)V

    .line 2215
    .line 2216
    .line 2217
    return-object v4

    .line 2218
    :pswitch_6b
    invoke-static {v1}, LE2/a;->W(Landroid/os/Parcel;)I

    .line 2219
    .line 2220
    .line 2221
    move-result v2

    .line 2222
    const/4 v3, 0x0

    .line 2223
    const/4 v4, 0x0

    .line 2224
    move v8, v3

    .line 2225
    move v9, v8

    .line 2226
    move v13, v9

    .line 2227
    move v15, v13

    .line 2228
    move/from16 v16, v15

    .line 2229
    .line 2230
    move-object v6, v4

    .line 2231
    move-object v7, v6

    .line 2232
    move-object v10, v7

    .line 2233
    move-object v11, v10

    .line 2234
    move-object v12, v11

    .line 2235
    move-object v14, v12

    .line 2236
    :goto_1d
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 2237
    .line 2238
    .line 2239
    move-result v3

    .line 2240
    if-ge v3, v2, :cond_5b

    .line 2241
    .line 2242
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 2243
    .line 2244
    .line 2245
    move-result v3

    .line 2246
    int-to-char v4, v3

    .line 2247
    packed-switch v4, :pswitch_data_a

    .line 2248
    .line 2249
    .line 2250
    invoke-static {v1, v3}, LE2/a;->T(Landroid/os/Parcel;I)V

    .line 2251
    .line 2252
    .line 2253
    goto :goto_1d

    .line 2254
    :pswitch_6c
    invoke-static {v1, v3}, LE2/a;->H(Landroid/os/Parcel;I)I

    .line 2255
    .line 2256
    .line 2257
    move-result v16

    .line 2258
    goto :goto_1d

    .line 2259
    :pswitch_6d
    invoke-static {v1, v3}, LE2/a;->G(Landroid/os/Parcel;I)Z

    .line 2260
    .line 2261
    .line 2262
    move-result v15

    .line 2263
    goto :goto_1d

    .line 2264
    :pswitch_6e
    invoke-static {v1, v3}, LE2/a;->f(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 2265
    .line 2266
    .line 2267
    move-result-object v14

    .line 2268
    goto :goto_1d

    .line 2269
    :pswitch_6f
    invoke-static {v1, v3}, LE2/a;->G(Landroid/os/Parcel;I)Z

    .line 2270
    .line 2271
    .line 2272
    move-result v13

    .line 2273
    goto :goto_1d

    .line 2274
    :pswitch_70
    invoke-static {v1, v3}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 2275
    .line 2276
    .line 2277
    move-result-object v12

    .line 2278
    goto :goto_1d

    .line 2279
    :pswitch_71
    invoke-static {v1, v3}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 2280
    .line 2281
    .line 2282
    move-result-object v11

    .line 2283
    goto :goto_1d

    .line 2284
    :pswitch_72
    sget-object v4, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 2285
    .line 2286
    invoke-static {v1, v3, v4}, LE2/a;->j(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 2287
    .line 2288
    .line 2289
    move-result-object v3

    .line 2290
    move-object v10, v3

    .line 2291
    check-cast v10, Landroid/accounts/Account;

    .line 2292
    .line 2293
    goto :goto_1d

    .line 2294
    :pswitch_73
    invoke-static {v1, v3}, LE2/a;->G(Landroid/os/Parcel;I)Z

    .line 2295
    .line 2296
    .line 2297
    move-result v9

    .line 2298
    goto :goto_1d

    .line 2299
    :pswitch_74
    invoke-static {v1, v3}, LE2/a;->G(Landroid/os/Parcel;I)Z

    .line 2300
    .line 2301
    .line 2302
    move-result v8

    .line 2303
    goto :goto_1d

    .line 2304
    :pswitch_75
    invoke-static {v1, v3}, LE2/a;->k(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 2305
    .line 2306
    .line 2307
    move-result-object v7

    .line 2308
    goto :goto_1d

    .line 2309
    :pswitch_76
    sget-object v4, Lcom/google/android/gms/common/api/Scope;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 2310
    .line 2311
    invoke-static {v1, v3, v4}, LE2/a;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 2312
    .line 2313
    .line 2314
    move-result-object v6

    .line 2315
    goto :goto_1d

    .line 2316
    :cond_5b
    invoke-static {v1, v2}, LE2/a;->r(Landroid/os/Parcel;I)V

    .line 2317
    .line 2318
    .line 2319
    new-instance v5, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;

    .line 2320
    .line 2321
    invoke-direct/range {v5 .. v16}, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;-><init>(Ljava/util/List;Ljava/lang/String;ZZLandroid/accounts/Account;Ljava/lang/String;Ljava/lang/String;ZLandroid/os/Bundle;ZI)V

    .line 2322
    .line 2323
    .line 2324
    return-object v5

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6b
        :pswitch_63
        :pswitch_5a
        :pswitch_59
        :pswitch_58
        :pswitch_57
        :pswitch_4f
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_1c
        :pswitch_c
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_d
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x1
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x1
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
    .end packed-switch

    :pswitch_data_6
    .packed-switch 0x1
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
    .end packed-switch

    :pswitch_data_7
    .packed-switch 0x1
        :pswitch_56
        :pswitch_55
        :pswitch_54
        :pswitch_53
        :pswitch_52
        :pswitch_51
        :pswitch_50
    .end packed-switch

    :pswitch_data_8
    .packed-switch 0x1
        :pswitch_62
        :pswitch_61
        :pswitch_60
        :pswitch_5f
        :pswitch_5e
        :pswitch_5d
        :pswitch_5c
        :pswitch_5b
    .end packed-switch

    :pswitch_data_9
    .packed-switch 0x1
        :pswitch_6a
        :pswitch_69
        :pswitch_68
        :pswitch_67
        :pswitch_66
        :pswitch_65
        :pswitch_64
    .end packed-switch

    :pswitch_data_a
    .packed-switch 0x1
        :pswitch_76
        :pswitch_75
        :pswitch_74
        :pswitch_73
        :pswitch_72
        :pswitch_71
        :pswitch_70
        :pswitch_6f
        :pswitch_6e
        :pswitch_6d
        :pswitch_6c
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, LF0/l;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p1, p1, [LV0/a;

    .line 7
    .line 8
    return-object p1

    .line 9
    :pswitch_0
    new-array p1, p1, [LV0/k;

    .line 10
    .line 11
    return-object p1

    .line 12
    :pswitch_1
    new-array p1, p1, [LV0/j;

    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_2
    new-array p1, p1, [LV0/i;

    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_3
    new-array p1, p1, [LM0/e;

    .line 19
    .line 20
    return-object p1

    .line 21
    :pswitch_4
    new-array p1, p1, [LM0/d;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_5
    new-array p1, p1, [LM0/z;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_6
    new-array p1, p1, [LM0/i;

    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_7
    new-array p1, p1, [LM0/o;

    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_8
    new-array p1, p1, [LM0/n;

    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_9
    new-array p1, p1, [LM0/g;

    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_a
    new-array p1, p1, [LM0/j;

    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_b
    new-array p1, p1, [LJ0/c;

    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_c
    new-array p1, p1, [LJ0/a;

    .line 46
    .line 47
    return-object p1

    .line 48
    :pswitch_d
    new-array p1, p1, [Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;

    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_e
    new-array p1, p1, [LH0/a;

    .line 52
    .line 53
    return-object p1

    .line 54
    :pswitch_f
    new-array p1, p1, [LG/g;

    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_10
    new-array p1, p1, [LF0/j;

    .line 58
    .line 59
    return-object p1

    .line 60
    :pswitch_11
    new-array p1, p1, [Lcom/google/android/gms/auth/api/identity/RevokeAccessRequest;

    .line 61
    .line 62
    return-object p1

    .line 63
    :pswitch_12
    new-array p1, p1, [LF0/f;

    .line 64
    .line 65
    return-object p1

    .line 66
    :pswitch_13
    new-array p1, p1, [LF0/e;

    .line 67
    .line 68
    return-object p1

    .line 69
    :pswitch_14
    new-array p1, p1, [LF0/d;

    .line 70
    .line 71
    return-object p1

    .line 72
    :pswitch_15
    new-array p1, p1, [LF0/c;

    .line 73
    .line 74
    return-object p1

    .line 75
    :pswitch_16
    new-array p1, p1, [LF0/i;

    .line 76
    .line 77
    return-object p1

    .line 78
    :pswitch_17
    new-array p1, p1, [Lcom/google/android/gms/auth/api/identity/ClearTokenRequest;

    .line 79
    .line 80
    return-object p1

    .line 81
    :pswitch_18
    new-array p1, p1, [LF0/m;

    .line 82
    .line 83
    return-object p1

    .line 84
    :pswitch_19
    new-array p1, p1, [LF0/h;

    .line 85
    .line 86
    return-object p1

    .line 87
    :pswitch_1a
    new-array p1, p1, [LF0/g;

    .line 88
    .line 89
    return-object p1

    .line 90
    :pswitch_1b
    new-array p1, p1, [LF0/a;

    .line 91
    .line 92
    return-object p1

    .line 93
    :pswitch_1c
    new-array p1, p1, [Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;

    .line 94
    .line 95
    return-object p1

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
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

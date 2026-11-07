.class public abstract LY0/h;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x3

    iput v0, p0, LY0/h;->a:I

    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    iput p2, p0, LY0/h;->a:I

    packed-switch p2, :pswitch_data_0

    .line 2
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 3
    invoke-virtual {p0, p0, p1}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void

    .line 4
    :pswitch_0
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 5
    invoke-virtual {p0, p0, p1}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void

    .line 6
    :pswitch_1
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 7
    invoke-virtual {p0, p0, p1}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static k(Landroid/os/Parcel;)V
    .locals 3

    .line 1
    sget v0, Lc1/a;->a:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/os/Parcel;->dataAvail()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-gtz p0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Landroid/os/BadParcelableException;

    .line 11
    .line 12
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    new-instance v2, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    add-int/lit8 v1, v1, 0x2d

    .line 23
    .line 24
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 25
    .line 26
    .line 27
    const-string v1, "Parcel data not fully consumed, unread size: "

    .line 28
    .line 29
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-direct {v0, p0}, Landroid/os/BadParcelableException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v0
.end method


# virtual methods
.method public final asBinder()Landroid/os/IBinder;
    .locals 1

    .line 1
    iget v0, p0, LY0/h;->a:I

    return-object p0
.end method

.method public abstract l(ILandroid/os/Parcel;Landroid/os/Parcel;)Z
.end method

.method public abstract m(ILandroid/os/Parcel;Landroid/os/Parcel;)Z
.end method

.method public n(ILandroid/os/Parcel;Landroid/os/Parcel;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public final onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 2

    .line 1
    iget v0, p0, LY0/h;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const v0, 0xffffff

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-le p1, v0, :cond_0

    .line 11
    .line 12
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p0}, Landroid/os/Binder;->getInterfaceDescriptor()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    invoke-virtual {p2, p3}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    move p3, v1

    .line 25
    :goto_0
    const/4 p4, 0x1

    .line 26
    if-eqz p3, :cond_1

    .line 27
    .line 28
    :goto_1
    move v1, p4

    .line 29
    goto/16 :goto_2

    .line 30
    .line 31
    :cond_1
    move-object p3, p0

    .line 32
    check-cast p3, LX0/f;

    .line 33
    .line 34
    const-string v0, "status"

    .line 35
    .line 36
    packed-switch p1, :pswitch_data_1

    .line 37
    .line 38
    .line 39
    goto/16 :goto_2

    .line 40
    .line 41
    :pswitch_0
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 42
    .line 43
    invoke-static {p2, p1}, Lc1/a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 48
    .line 49
    sget-object p3, LW0/a;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 50
    .line 51
    invoke-static {p2, p3}, Lc1/a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 52
    .line 53
    .line 54
    move-result-object p3

    .line 55
    check-cast p3, LW0/a;

    .line 56
    .line 57
    invoke-static {p2}, LY0/h;->k(Landroid/os/Parcel;)V

    .line 58
    .line 59
    .line 60
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 64
    .line 65
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :pswitch_1
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 70
    .line 71
    invoke-static {p2, p1}, Lc1/a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 76
    .line 77
    sget-object p3, LW0/i;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 78
    .line 79
    invoke-static {p2, p3}, Lc1/a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 80
    .line 81
    .line 82
    move-result-object p3

    .line 83
    check-cast p3, LW0/i;

    .line 84
    .line 85
    invoke-static {p2}, LY0/h;->k(Landroid/os/Parcel;)V

    .line 86
    .line 87
    .line 88
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 92
    .line 93
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 94
    .line 95
    .line 96
    throw p1

    .line 97
    :pswitch_2
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 98
    .line 99
    invoke-static {p2, p1}, Lc1/a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 104
    .line 105
    sget-object p3, LW0/j;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 106
    .line 107
    invoke-static {p2, p3}, Lc1/a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 108
    .line 109
    .line 110
    move-result-object p3

    .line 111
    check-cast p3, LW0/j;

    .line 112
    .line 113
    invoke-static {p2}, LY0/h;->k(Landroid/os/Parcel;)V

    .line 114
    .line 115
    .line 116
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 120
    .line 121
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 122
    .line 123
    .line 124
    throw p1

    .line 125
    :pswitch_3
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 126
    .line 127
    invoke-static {p2, p1}, Lc1/a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 132
    .line 133
    sget-object p3, LW0/k;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 134
    .line 135
    invoke-static {p2, p3}, Lc1/a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 136
    .line 137
    .line 138
    move-result-object p3

    .line 139
    check-cast p3, LW0/k;

    .line 140
    .line 141
    invoke-static {p2}, LY0/h;->k(Landroid/os/Parcel;)V

    .line 142
    .line 143
    .line 144
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 148
    .line 149
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 150
    .line 151
    .line 152
    throw p1

    .line 153
    :pswitch_4
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 154
    .line 155
    invoke-static {p2, p1}, Lc1/a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 160
    .line 161
    sget-object p3, LW0/d;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 162
    .line 163
    invoke-static {p2, p3}, Lc1/a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 164
    .line 165
    .line 166
    move-result-object p3

    .line 167
    check-cast p3, LW0/d;

    .line 168
    .line 169
    invoke-static {p2}, LY0/h;->k(Landroid/os/Parcel;)V

    .line 170
    .line 171
    .line 172
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 176
    .line 177
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 178
    .line 179
    .line 180
    throw p1

    .line 181
    :pswitch_5
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 182
    .line 183
    invoke-static {p2, p1}, Lc1/a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 188
    .line 189
    sget-object v0, LW0/q;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 190
    .line 191
    invoke-static {p2, v0}, Lc1/a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    check-cast v0, LW0/q;

    .line 196
    .line 197
    invoke-static {p2}, LY0/h;->k(Landroid/os/Parcel;)V

    .line 198
    .line 199
    .line 200
    invoke-interface {p3, p1, v0}, LX0/a;->b(Lcom/google/android/gms/common/api/Status;LW0/q;)V

    .line 201
    .line 202
    .line 203
    goto/16 :goto_1

    .line 204
    .line 205
    :pswitch_6
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 206
    .line 207
    invoke-static {p2, p1}, Lc1/a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 212
    .line 213
    sget-object v0, LW0/c;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 214
    .line 215
    invoke-static {p2, v0}, Lc1/a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    check-cast v0, LW0/c;

    .line 220
    .line 221
    invoke-static {p2}, LY0/h;->k(Landroid/os/Parcel;)V

    .line 222
    .line 223
    .line 224
    invoke-interface {p3, p1, v0}, LX0/a;->h(Lcom/google/android/gms/common/api/Status;LW0/c;)V

    .line 225
    .line 226
    .line 227
    goto/16 :goto_1

    .line 228
    .line 229
    :pswitch_7
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 230
    .line 231
    invoke-static {p2, p1}, Lc1/a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 236
    .line 237
    sget-object p3, LW0/n;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 238
    .line 239
    invoke-static {p2, p3}, Lc1/a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 240
    .line 241
    .line 242
    move-result-object p3

    .line 243
    check-cast p3, LW0/n;

    .line 244
    .line 245
    invoke-static {p2}, LY0/h;->k(Landroid/os/Parcel;)V

    .line 246
    .line 247
    .line 248
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 252
    .line 253
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 254
    .line 255
    .line 256
    throw p1

    .line 257
    :pswitch_8
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 258
    .line 259
    invoke-static {p2, p1}, Lc1/a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 264
    .line 265
    sget-object v0, LW0/f;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 266
    .line 267
    invoke-static {p2, v0}, Lc1/a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    check-cast v0, LW0/f;

    .line 272
    .line 273
    invoke-static {p2}, LY0/h;->k(Landroid/os/Parcel;)V

    .line 274
    .line 275
    .line 276
    invoke-interface {p3, p1, v0}, LX0/a;->c(Lcom/google/android/gms/common/api/Status;LW0/f;)V

    .line 277
    .line 278
    .line 279
    goto/16 :goto_1

    .line 280
    .line 281
    :pswitch_9
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 282
    .line 283
    invoke-static {p2, p1}, Lc1/a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 284
    .line 285
    .line 286
    move-result-object p1

    .line 287
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 288
    .line 289
    sget-object p3, LW0/g;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 290
    .line 291
    invoke-static {p2, p3}, Lc1/a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 292
    .line 293
    .line 294
    move-result-object p3

    .line 295
    check-cast p3, LW0/g;

    .line 296
    .line 297
    invoke-static {p2}, LY0/h;->k(Landroid/os/Parcel;)V

    .line 298
    .line 299
    .line 300
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 304
    .line 305
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 306
    .line 307
    .line 308
    throw p1

    .line 309
    :pswitch_a
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 310
    .line 311
    invoke-static {p2, p1}, Lc1/a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 312
    .line 313
    .line 314
    move-result-object p1

    .line 315
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 316
    .line 317
    sget-object p3, LW0/o;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 318
    .line 319
    invoke-static {p2, p3}, Lc1/a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 320
    .line 321
    .line 322
    move-result-object p3

    .line 323
    check-cast p3, LW0/o;

    .line 324
    .line 325
    invoke-static {p2}, LY0/h;->k(Landroid/os/Parcel;)V

    .line 326
    .line 327
    .line 328
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 332
    .line 333
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 334
    .line 335
    .line 336
    throw p1

    .line 337
    :pswitch_b
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 338
    .line 339
    invoke-static {p2, p1}, Lc1/a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 340
    .line 341
    .line 342
    move-result-object p1

    .line 343
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 344
    .line 345
    sget-object p3, LW0/m;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 346
    .line 347
    invoke-static {p2, p3}, Lc1/a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 348
    .line 349
    .line 350
    move-result-object p3

    .line 351
    check-cast p3, LW0/m;

    .line 352
    .line 353
    invoke-static {p2}, LY0/h;->k(Landroid/os/Parcel;)V

    .line 354
    .line 355
    .line 356
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 360
    .line 361
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 362
    .line 363
    .line 364
    throw p1

    .line 365
    :pswitch_c
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 366
    .line 367
    invoke-static {p2, p1}, Lc1/a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 368
    .line 369
    .line 370
    move-result-object p1

    .line 371
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 372
    .line 373
    sget-object p3, LW0/e;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 374
    .line 375
    invoke-static {p2, p3}, Lc1/a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 376
    .line 377
    .line 378
    move-result-object p3

    .line 379
    check-cast p3, LW0/e;

    .line 380
    .line 381
    invoke-static {p2}, LY0/h;->k(Landroid/os/Parcel;)V

    .line 382
    .line 383
    .line 384
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 388
    .line 389
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 390
    .line 391
    .line 392
    throw p1

    .line 393
    :pswitch_d
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 394
    .line 395
    invoke-static {p2, p1}, Lc1/a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 396
    .line 397
    .line 398
    move-result-object p1

    .line 399
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 400
    .line 401
    sget-object p3, LW0/p;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 402
    .line 403
    invoke-static {p2, p3}, Lc1/a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 404
    .line 405
    .line 406
    move-result-object p3

    .line 407
    check-cast p3, LW0/p;

    .line 408
    .line 409
    invoke-static {p2}, LY0/h;->k(Landroid/os/Parcel;)V

    .line 410
    .line 411
    .line 412
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 413
    .line 414
    .line 415
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 416
    .line 417
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 418
    .line 419
    .line 420
    throw p1

    .line 421
    :pswitch_e
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 422
    .line 423
    invoke-static {p2, p1}, Lc1/a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 424
    .line 425
    .line 426
    move-result-object p1

    .line 427
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 428
    .line 429
    sget-object v0, LW0/l;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 430
    .line 431
    invoke-static {p2, v0}, Lc1/a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    check-cast v0, LW0/l;

    .line 436
    .line 437
    invoke-static {p2}, LY0/h;->k(Landroid/os/Parcel;)V

    .line 438
    .line 439
    .line 440
    invoke-interface {p3, p1, v0}, LX0/a;->g(Lcom/google/android/gms/common/api/Status;LW0/l;)V

    .line 441
    .line 442
    .line 443
    goto/16 :goto_1

    .line 444
    .line 445
    :goto_2
    return v1

    .line 446
    :pswitch_f
    const v0, 0xffffff

    .line 447
    .line 448
    .line 449
    if-le p1, v0, :cond_2

    .line 450
    .line 451
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 452
    .line 453
    .line 454
    move-result p4

    .line 455
    if-eqz p4, :cond_3

    .line 456
    .line 457
    const/4 p1, 0x1

    .line 458
    goto :goto_3

    .line 459
    :cond_2
    invoke-virtual {p0}, Landroid/os/Binder;->getInterfaceDescriptor()Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object p4

    .line 463
    invoke-virtual {p2, p4}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 464
    .line 465
    .line 466
    :cond_3
    invoke-virtual {p0, p1, p2, p3}, LY0/h;->n(ILandroid/os/Parcel;Landroid/os/Parcel;)Z

    .line 467
    .line 468
    .line 469
    move-result p1

    .line 470
    :goto_3
    return p1

    .line 471
    :pswitch_10
    const v0, 0xffffff

    .line 472
    .line 473
    .line 474
    if-le p1, v0, :cond_4

    .line 475
    .line 476
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 477
    .line 478
    .line 479
    move-result p4

    .line 480
    if-eqz p4, :cond_5

    .line 481
    .line 482
    const/4 p1, 0x1

    .line 483
    goto :goto_4

    .line 484
    :cond_4
    invoke-virtual {p0}, Landroid/os/Binder;->getInterfaceDescriptor()Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object p4

    .line 488
    invoke-virtual {p2, p4}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 489
    .line 490
    .line 491
    :cond_5
    invoke-virtual {p0, p1, p2, p3}, LY0/h;->l(ILandroid/os/Parcel;Landroid/os/Parcel;)Z

    .line 492
    .line 493
    .line 494
    move-result p1

    .line 495
    :goto_4
    return p1

    .line 496
    :pswitch_11
    const v0, 0xffffff

    .line 497
    .line 498
    .line 499
    if-le p1, v0, :cond_6

    .line 500
    .line 501
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 502
    .line 503
    .line 504
    move-result p4

    .line 505
    if-eqz p4, :cond_7

    .line 506
    .line 507
    const/4 p1, 0x1

    .line 508
    goto :goto_5

    .line 509
    :cond_6
    invoke-virtual {p0}, Landroid/os/Binder;->getInterfaceDescriptor()Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object p4

    .line 513
    invoke-virtual {p2, p4}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 514
    .line 515
    .line 516
    :cond_7
    invoke-virtual {p0, p1, p2, p3}, LY0/h;->m(ILandroid/os/Parcel;Landroid/os/Parcel;)Z

    .line 517
    .line 518
    .line 519
    move-result p1

    .line 520
    :goto_5
    return p1

    .line 521
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
    .end packed-switch

    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    :pswitch_data_1
    .packed-switch 0x1
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

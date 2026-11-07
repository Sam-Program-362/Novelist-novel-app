.class public final LM0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/io/Serializable;

.field public final d:Ljava/io/Serializable;

.field public final e:Ljava/lang/Object;

.field public f:Ljava/io/Serializable;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7f080051

    const/high16 v1, 0x7f080000

    const v2, 0x7f080053

    .line 10
    filled-new-array {v2, v0, v1}, [I

    move-result-object v0

    iput-object v0, p0, LM0/c;->a:Ljava/lang/Object;

    const/4 v0, 0x7

    .line 11
    new-array v0, v0, [I

    fill-array-data v0, :array_0

    iput-object v0, p0, LM0/c;->b:Ljava/lang/Object;

    const/16 v0, 0xa

    .line 12
    new-array v0, v0, [I

    fill-array-data v0, :array_1

    iput-object v0, p0, LM0/c;->c:Ljava/io/Serializable;

    const v0, 0x7f08000f

    const v1, 0x7f080036

    const v2, 0x7f080037

    .line 13
    filled-new-array {v2, v0, v1}, [I

    move-result-object v0

    iput-object v0, p0, LM0/c;->d:Ljava/io/Serializable;

    const v0, 0x7f080047

    const v1, 0x7f080054

    .line 14
    filled-new-array {v0, v1}, [I

    move-result-object v0

    iput-object v0, p0, LM0/c;->e:Ljava/lang/Object;

    const v0, 0x7f080004

    const v1, 0x7f08000a

    const v2, 0x7f080003

    const v3, 0x7f080009

    .line 15
    filled-new-array {v2, v3, v0, v1}, [I

    move-result-object v0

    iput-object v0, p0, LM0/c;->f:Ljava/io/Serializable;

    return-void

    :array_0
    .array-data 4
        0x7f080018
        0x7f080041
        0x7f08001f
        0x7f08001a
        0x7f08001b
        0x7f08001e
        0x7f08001d
    .end array-data

    :array_1
    .array-data 4
        0x7f080050
        0x7f080052
        0x7f080011
        0x7f080049
        0x7f08004a
        0x7f08004c
        0x7f08004e
        0x7f08004b
        0x7f08004d
        0x7f08004f
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p3, :cond_0

    sget-object p3, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    goto :goto_0

    :cond_0
    invoke-static {p3}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p3

    :goto_0
    iput-object p3, p0, LM0/c;->a:Ljava/lang/Object;

    .line 2
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    iput-object p1, p0, LM0/c;->c:Ljava/io/Serializable;

    iput-object p2, p0, LM0/c;->d:Ljava/io/Serializable;

    sget-object p1, Le1/a;->k:Le1/a;

    iput-object p1, p0, LM0/c;->e:Ljava/lang/Object;

    new-instance p1, Ljava/util/HashSet;

    .line 3
    invoke-direct {p1, p3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 4
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-nez p3, :cond_1

    .line 5
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, LM0/c;->b:Ljava/lang/Object;

    return-void

    .line 6
    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1
.end method

.method public static a([II)Z
    .locals 4

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v2, v0, :cond_1

    .line 5
    .line 6
    aget v3, p0, v2

    .line 7
    .line 8
    if-ne v3, p1, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    return v1
.end method

.method public static b(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    .locals 6

    .line 1
    const v0, 0x7f04005c

    .line 2
    .line 3
    .line 4
    invoke-static {p0, v0}, Lk/j0;->c(Landroid/content/Context;I)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const v1, 0x7f04005a

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v1}, Lk/j0;->b(Landroid/content/Context;I)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    sget-object v1, Lk/j0;->b:[I

    .line 16
    .line 17
    sget-object v2, Lk/j0;->d:[I

    .line 18
    .line 19
    invoke-static {v0, p1}, Lw/a;->a(II)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    sget-object v4, Lk/j0;->c:[I

    .line 24
    .line 25
    invoke-static {v0, p1}, Lw/a;->a(II)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    sget-object v5, Lk/j0;->f:[I

    .line 30
    .line 31
    filled-new-array {v1, v2, v4, v5}, [[I

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    filled-new-array {p0, v3, v0, p1}, [I

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    new-instance p1, Landroid/content/res/ColorStateList;

    .line 40
    .line 41
    invoke-direct {p1, v1, p0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 42
    .line 43
    .line 44
    return-object p1
.end method

.method public static d(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lk/B;->a(Landroid/graphics/drawable/Drawable;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :cond_0
    if-nez p2, :cond_1

    .line 12
    .line 13
    sget-object p2, Lk/o;->b:Landroid/graphics/PorterDuff$Mode;

    .line 14
    .line 15
    :cond_1
    sget-object v0, Lk/o;->b:Landroid/graphics/PorterDuff$Mode;

    .line 16
    .line 17
    const-class v0, Lk/o;

    .line 18
    .line 19
    monitor-enter v0

    .line 20
    :try_start_0
    invoke-static {p1, p2}, Lk/S;->e(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    .line 21
    .line 22
    .line 23
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    monitor-exit v0

    .line 25
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    throw p0
.end method


# virtual methods
.method public c(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    .locals 8

    .line 1
    const v0, 0x7f080014

    .line 2
    .line 3
    .line 4
    if-ne p2, v0, :cond_0

    .line 5
    .line 6
    sget-object p2, Lg/a;->a:Ljava/lang/Object;

    .line 7
    .line 8
    const p2, 0x7f060015

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, p2}, Landroid/content/Context;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    const v0, 0x7f080046

    .line 17
    .line 18
    .line 19
    if-ne p2, v0, :cond_1

    .line 20
    .line 21
    sget-object p2, Lg/a;->a:Ljava/lang/Object;

    .line 22
    .line 23
    const p2, 0x7f060018

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p2}, Landroid/content/Context;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1

    .line 31
    :cond_1
    const v0, 0x7f080045

    .line 32
    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    if-ne p2, v0, :cond_3

    .line 36
    .line 37
    const/4 p2, 0x3

    .line 38
    new-array v0, p2, [[I

    .line 39
    .line 40
    new-array p2, p2, [I

    .line 41
    .line 42
    const v2, 0x7f040062

    .line 43
    .line 44
    .line 45
    invoke-static {p1, v2}, Lk/j0;->d(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    const/4 v4, 0x2

    .line 50
    const v5, 0x7f04005b

    .line 51
    .line 52
    .line 53
    const/4 v6, 0x1

    .line 54
    if-eqz v3, :cond_2

    .line 55
    .line 56
    invoke-virtual {v3}, Landroid/content/res/ColorStateList;->isStateful()Z

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    if-eqz v7, :cond_2

    .line 61
    .line 62
    sget-object v2, Lk/j0;->b:[I

    .line 63
    .line 64
    aput-object v2, v0, v1

    .line 65
    .line 66
    invoke-virtual {v3, v2, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    aput v2, p2, v1

    .line 71
    .line 72
    sget-object v1, Lk/j0;->e:[I

    .line 73
    .line 74
    aput-object v1, v0, v6

    .line 75
    .line 76
    invoke-static {p1, v5}, Lk/j0;->c(Landroid/content/Context;I)I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    aput p1, p2, v6

    .line 81
    .line 82
    sget-object p1, Lk/j0;->f:[I

    .line 83
    .line 84
    aput-object p1, v0, v4

    .line 85
    .line 86
    invoke-virtual {v3}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    aput p1, p2, v4

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_2
    sget-object v3, Lk/j0;->b:[I

    .line 94
    .line 95
    aput-object v3, v0, v1

    .line 96
    .line 97
    invoke-static {p1, v2}, Lk/j0;->b(Landroid/content/Context;I)I

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    aput v3, p2, v1

    .line 102
    .line 103
    sget-object v1, Lk/j0;->e:[I

    .line 104
    .line 105
    aput-object v1, v0, v6

    .line 106
    .line 107
    invoke-static {p1, v5}, Lk/j0;->c(Landroid/content/Context;I)I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    aput v1, p2, v6

    .line 112
    .line 113
    sget-object v1, Lk/j0;->f:[I

    .line 114
    .line 115
    aput-object v1, v0, v4

    .line 116
    .line 117
    invoke-static {p1, v2}, Lk/j0;->c(Landroid/content/Context;I)I

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    aput p1, p2, v4

    .line 122
    .line 123
    :goto_0
    new-instance p1, Landroid/content/res/ColorStateList;

    .line 124
    .line 125
    invoke-direct {p1, v0, p2}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 126
    .line 127
    .line 128
    return-object p1

    .line 129
    :cond_3
    const v0, 0x7f080008

    .line 130
    .line 131
    .line 132
    if-ne p2, v0, :cond_4

    .line 133
    .line 134
    const p2, 0x7f04005a

    .line 135
    .line 136
    .line 137
    invoke-static {p1, p2}, Lk/j0;->c(Landroid/content/Context;I)I

    .line 138
    .line 139
    .line 140
    move-result p2

    .line 141
    invoke-static {p1, p2}, LM0/c;->b(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    return-object p1

    .line 146
    :cond_4
    const v0, 0x7f080002

    .line 147
    .line 148
    .line 149
    if-ne p2, v0, :cond_5

    .line 150
    .line 151
    invoke-static {p1, v1}, LM0/c;->b(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    return-object p1

    .line 156
    :cond_5
    const v0, 0x7f080007

    .line 157
    .line 158
    .line 159
    if-ne p2, v0, :cond_6

    .line 160
    .line 161
    const p2, 0x7f040058

    .line 162
    .line 163
    .line 164
    invoke-static {p1, p2}, Lk/j0;->c(Landroid/content/Context;I)I

    .line 165
    .line 166
    .line 167
    move-result p2

    .line 168
    invoke-static {p1, p2}, LM0/c;->b(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    return-object p1

    .line 173
    :cond_6
    const v0, 0x7f080043

    .line 174
    .line 175
    .line 176
    if-eq p2, v0, :cond_c

    .line 177
    .line 178
    const v0, 0x7f080044

    .line 179
    .line 180
    .line 181
    if-ne p2, v0, :cond_7

    .line 182
    .line 183
    goto :goto_1

    .line 184
    :cond_7
    iget-object v0, p0, LM0/c;->b:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v0, [I

    .line 187
    .line 188
    invoke-static {v0, p2}, LM0/c;->a([II)Z

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    if-eqz v0, :cond_8

    .line 193
    .line 194
    const p2, 0x7f04005d

    .line 195
    .line 196
    .line 197
    invoke-static {p1, p2}, Lk/j0;->d(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    return-object p1

    .line 202
    :cond_8
    iget-object v0, p0, LM0/c;->e:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v0, [I

    .line 205
    .line 206
    invoke-static {v0, p2}, LM0/c;->a([II)Z

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    if-eqz v0, :cond_9

    .line 211
    .line 212
    sget-object p2, Lg/a;->a:Ljava/lang/Object;

    .line 213
    .line 214
    const p2, 0x7f060014

    .line 215
    .line 216
    .line 217
    invoke-virtual {p1, p2}, Landroid/content/Context;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    return-object p1

    .line 222
    :cond_9
    iget-object v0, p0, LM0/c;->f:Ljava/io/Serializable;

    .line 223
    .line 224
    check-cast v0, [I

    .line 225
    .line 226
    invoke-static {v0, p2}, LM0/c;->a([II)Z

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    if-eqz v0, :cond_a

    .line 231
    .line 232
    sget-object p2, Lg/a;->a:Ljava/lang/Object;

    .line 233
    .line 234
    const p2, 0x7f060013

    .line 235
    .line 236
    .line 237
    invoke-virtual {p1, p2}, Landroid/content/Context;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    return-object p1

    .line 242
    :cond_a
    const v0, 0x7f080040

    .line 243
    .line 244
    .line 245
    if-ne p2, v0, :cond_b

    .line 246
    .line 247
    sget-object p2, Lg/a;->a:Ljava/lang/Object;

    .line 248
    .line 249
    const p2, 0x7f060016

    .line 250
    .line 251
    .line 252
    invoke-virtual {p1, p2}, Landroid/content/Context;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    return-object p1

    .line 257
    :cond_b
    const/4 p1, 0x0

    .line 258
    return-object p1

    .line 259
    :cond_c
    :goto_1
    sget-object p2, Lg/a;->a:Ljava/lang/Object;

    .line 260
    .line 261
    const p2, 0x7f060017

    .line 262
    .line 263
    .line 264
    invoke-virtual {p1, p2}, Landroid/content/Context;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    return-object p1
.end method

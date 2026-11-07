.class public final LB1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC1/b;
.implements LC1/m;
.implements LH/d;
.implements Ld/c;
.implements Lio/flutter/plugin/editing/a;
.implements Lj0/d;
.implements Ll0/L;
.implements Ll2/d;


# instance fields
.field public final synthetic k:I

.field public l:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, LB1/a;->k:I

    packed-switch p1, :pswitch_data_0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance p1, Ll2/q;

    sget-object v0, LV/k0;->b:LV/k0;

    invoke-direct {p1, v0}, Ll2/q;-><init>(Ljava/lang/Object;)V

    .line 14
    iput-object p1, p0, LB1/a;->l:Ljava/lang/Object;

    return-void

    .line 15
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance p1, Landroid/util/SparseIntArray;

    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p1, p0, LB1/a;->l:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x14
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(LC1/f;)V
    .locals 5

    const/4 v0, 0x1

    iput v0, p0, LB1/a;->k:I

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v0, LA/c;

    invoke-direct {v0, p0}, LA/c;-><init>(LB1/a;)V

    .line 21
    new-instance v1, LB1/s;

    sget-object v2, LC1/r;->a:LC1/r;

    const/4 v3, 0x0

    .line 22
    const-string v4, "flutter/keyboard"

    invoke-direct {v1, p1, v4, v2, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 23
    invoke-virtual {v1, v0}, LB1/s;->z(LC1/m;)V

    return-void
.end method

.method public constructor <init>(LZ1/p;)V
    .locals 1

    const/16 v0, 0x16

    iput v0, p0, LB1/a;->k:I

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    check-cast p1, LT1/h;

    iput-object p1, p0, LB1/a;->l:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LB1/a;->k:I

    iput-object p1, p0, LB1/a;->l:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lt1/c;I)V
    .locals 4

    iput p2, p0, LB1/a;->k:I

    packed-switch p2, :pswitch_data_0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance p2, LH0/i;

    const/4 v0, 0x3

    invoke-direct {p2, p0, v0}, LH0/i;-><init>(Ljava/lang/Object;I)V

    .line 4
    new-instance v0, LB1/s;

    sget-object v1, LC1/r;->a:LC1/r;

    const/4 v2, 0x0

    .line 5
    const-string v3, "flutter/mousecursor"

    invoke-direct {v0, p1, v3, v1, v2}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 6
    invoke-virtual {v0, p2}, LB1/s;->z(LC1/m;)V

    return-void

    .line 7
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    new-instance p2, LH0/i;

    const/4 v0, 0x7

    invoke-direct {p2, p0, v0}, LH0/i;-><init>(Ljava/lang/Object;I)V

    .line 9
    new-instance v0, LB1/s;

    sget-object v1, LC1/r;->a:LC1/r;

    const/4 v2, 0x0

    .line 10
    const-string v3, "flutter/spellcheck"

    invoke-direct {v0, p1, v3, v1, v2}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 11
    invoke-virtual {v0, p2}, LB1/s;->z(LC1/m;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Z)V
    .locals 1

    const/16 v0, 0xd

    iput v0, p0, LB1/a;->k:I

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, LB1/a;->l:Ljava/lang/Object;

    return-void
.end method

.method public static j(II)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    move v2, v1

    .line 4
    move v3, v2

    .line 5
    :goto_0
    const/4 v4, 0x1

    .line 6
    if-ge v1, p0, :cond_2

    .line 7
    .line 8
    add-int/lit8 v2, v2, 0x1

    .line 9
    .line 10
    if-ne v2, p1, :cond_0

    .line 11
    .line 12
    add-int/lit8 v3, v3, 0x1

    .line 13
    .line 14
    move v2, v0

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    if-le v2, p1, :cond_1

    .line 17
    .line 18
    add-int/lit8 v3, v3, 0x1

    .line 19
    .line 20
    move v2, v4

    .line 21
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    add-int/2addr v2, v4

    .line 25
    if-le v2, p1, :cond_3

    .line 26
    .line 27
    add-int/2addr v3, v4

    .line 28
    :cond_3
    return v3
.end method


# virtual methods
.method public a(Ljava/lang/Object;LA/c;)V
    .locals 9

    .line 1
    iget-object v0, p0, LB1/a;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LA0/j;

    .line 4
    .line 5
    iget-object v1, v0, LA0/j;->n:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lio/flutter/view/c;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p2, v2}, LA/c;->e(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    check-cast p1, Ljava/util/HashMap;

    .line 17
    .line 18
    const-string v1, "type"

    .line 19
    .line 20
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/lang/String;

    .line 25
    .line 26
    const-string v3, "data"

    .line 27
    .line 28
    invoke-virtual {p1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Ljava/util/HashMap;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    const/4 v5, 0x2

    .line 42
    const/4 v6, 0x1

    .line 43
    const/4 v7, 0x0

    .line 44
    const/4 v8, -0x1

    .line 45
    sparse-switch v4, :sswitch_data_0

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :sswitch_0
    const-string v4, "longPress"

    .line 50
    .line 51
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-nez v1, :cond_1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    const/4 v8, 0x4

    .line 59
    goto :goto_0

    .line 60
    :sswitch_1
    const-string v4, "focus"

    .line 61
    .line 62
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-nez v1, :cond_2

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    const/4 v8, 0x3

    .line 70
    goto :goto_0

    .line 71
    :sswitch_2
    const-string v4, "tap"

    .line 72
    .line 73
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-nez v1, :cond_3

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    move v8, v5

    .line 81
    goto :goto_0

    .line 82
    :sswitch_3
    const-string v4, "announce"

    .line 83
    .line 84
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-nez v1, :cond_4

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_4
    move v8, v6

    .line 92
    goto :goto_0

    .line 93
    :sswitch_4
    const-string v4, "tooltip"

    .line 94
    .line 95
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-nez v1, :cond_5

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_5
    move v8, v7

    .line 103
    :goto_0
    const-string v1, "message"

    .line 104
    .line 105
    const-string v4, "nodeId"

    .line 106
    .line 107
    packed-switch v8, :pswitch_data_0

    .line 108
    .line 109
    .line 110
    goto/16 :goto_1

    .line 111
    .line 112
    :pswitch_0
    invoke-virtual {p1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    check-cast p1, Ljava/lang/Integer;

    .line 117
    .line 118
    if-eqz p1, :cond_8

    .line 119
    .line 120
    iget-object v0, v0, LA0/j;->n:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v0, Lio/flutter/view/c;

    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    iget-object v0, v0, Lio/flutter/view/c;->a:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v0, Lio/flutter/view/i;

    .line 131
    .line 132
    invoke-virtual {v0, p1, v5}, Lio/flutter/view/i;->h(II)V

    .line 133
    .line 134
    .line 135
    goto/16 :goto_1

    .line 136
    .line 137
    :pswitch_1
    invoke-virtual {p1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    check-cast p1, Ljava/lang/Integer;

    .line 142
    .line 143
    if-eqz p1, :cond_8

    .line 144
    .line 145
    iget-object v0, v0, LA0/j;->n:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v0, Lio/flutter/view/c;

    .line 148
    .line 149
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    iget-object v0, v0, Lio/flutter/view/c;->a:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v0, Lio/flutter/view/i;

    .line 156
    .line 157
    const/16 v1, 0x8

    .line 158
    .line 159
    invoke-virtual {v0, p1, v1}, Lio/flutter/view/i;->h(II)V

    .line 160
    .line 161
    .line 162
    goto :goto_1

    .line 163
    :pswitch_2
    invoke-virtual {p1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    check-cast p1, Ljava/lang/Integer;

    .line 168
    .line 169
    if-eqz p1, :cond_8

    .line 170
    .line 171
    iget-object v0, v0, LA0/j;->n:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v0, Lio/flutter/view/c;

    .line 174
    .line 175
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    iget-object v0, v0, Lio/flutter/view/c;->a:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v0, Lio/flutter/view/i;

    .line 182
    .line 183
    invoke-virtual {v0, p1, v6}, Lio/flutter/view/i;->h(II)V

    .line 184
    .line 185
    .line 186
    goto :goto_1

    .line 187
    :pswitch_3
    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    check-cast p1, Ljava/lang/String;

    .line 192
    .line 193
    if-eqz p1, :cond_8

    .line 194
    .line 195
    iget-object v0, v0, LA0/j;->n:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v0, Lio/flutter/view/c;

    .line 198
    .line 199
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 200
    .line 201
    const/16 v3, 0x24

    .line 202
    .line 203
    if-lt v1, v3, :cond_6

    .line 204
    .line 205
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    const-string v1, "AccessibilityBridge"

    .line 209
    .line 210
    const-string v3, "Using AnnounceSemanticsEvent for accessibility is deprecated on Android. Migrate to using semantic properties for a more robust and accessible user experience.\nFlutter: If you are unsure why you are seeing this bug, it might be because you are using a widget that calls this method. See https://github.com/flutter/flutter/issues/165510 for more details.\nAndroid documentation: https://developer.android.com/reference/android/view/View#announceForAccessibility(java.lang.CharSequence)"

    .line 211
    .line 212
    invoke-static {v1, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 213
    .line 214
    .line 215
    :cond_6
    iget-object v0, v0, Lio/flutter/view/c;->a:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v0, Lio/flutter/view/i;

    .line 218
    .line 219
    iget-object v0, v0, Lio/flutter/view/i;->a:Landroid/view/View;

    .line 220
    .line 221
    invoke-virtual {v0, p1}, Landroid/view/View;->announceForAccessibility(Ljava/lang/CharSequence;)V

    .line 222
    .line 223
    .line 224
    goto :goto_1

    .line 225
    :pswitch_4
    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    check-cast p1, Ljava/lang/String;

    .line 230
    .line 231
    if-eqz p1, :cond_8

    .line 232
    .line 233
    iget-object v0, v0, LA0/j;->n:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v0, Lio/flutter/view/c;

    .line 236
    .line 237
    iget-object v0, v0, Lio/flutter/view/c;->a:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v0, Lio/flutter/view/i;

    .line 240
    .line 241
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 242
    .line 243
    const/16 v3, 0x1c

    .line 244
    .line 245
    if-lt v1, v3, :cond_7

    .line 246
    .line 247
    goto :goto_1

    .line 248
    :cond_7
    const/16 v1, 0x20

    .line 249
    .line 250
    invoke-virtual {v0, v7, v1}, Lio/flutter/view/i;->e(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 255
    .line 256
    .line 257
    move-result-object v3

    .line 258
    invoke-interface {v3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    invoke-virtual {v0, v1}, Lio/flutter/view/i;->i(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 262
    .line 263
    .line 264
    :cond_8
    :goto_1
    invoke-virtual {p2, v2}, LA/c;->e(Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    return-void

    .line 268
    nop

    .line 269
    :sswitch_data_0
    .sparse-switch
        -0x43f42ffd -> :sswitch_4
        -0x26b86b97 -> :sswitch_3
        0x1bfa3 -> :sswitch_2
        0x5d154d8 -> :sswitch_1
        0x6ce9b27 -> :sswitch_0
    .end sparse-switch

    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, LI/a;

    .line 2
    .line 3
    iget-object v0, p0, LB1/a;->l:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LI1/k;

    .line 6
    .line 7
    new-instance v1, LI1/d;

    .line 8
    .line 9
    const-string v2, "Clear Failed"

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-direct {v1, v2, p1}, LI1/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1}, La/a;->n(LZ1/l;LI1/d;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public c()V
    .locals 2

    .line 1
    const-string v0, "DIAGNOSTIC_PROFILE_IS_COMPRESSED"

    .line 2
    .line 3
    const-string v1, "ProfileInstaller"

    .line 4
    .line 5
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public d(ILjava/lang/Object;)V
    .locals 3

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    :pswitch_0
    const-string v0, ""

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_1
    const-string v0, "RESULT_DELETE_SKIP_FILE_SUCCESS"

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :pswitch_2
    const-string v0, "RESULT_INSTALL_SKIP_FILE_SUCCESS"

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :pswitch_3
    const-string v0, "RESULT_PARSE_EXCEPTION"

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :pswitch_4
    const-string v0, "RESULT_IO_EXCEPTION"

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :pswitch_5
    const-string v0, "RESULT_BASELINE_PROFILE_NOT_FOUND"

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :pswitch_6
    const-string v0, "RESULT_DESIRED_FORMAT_UNSUPPORTED"

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :pswitch_7
    const-string v0, "RESULT_NOT_WRITABLE"

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :pswitch_8
    const-string v0, "RESULT_UNSUPPORTED_ART_VERSION"

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :pswitch_9
    const-string v0, "RESULT_ALREADY_INSTALLED"

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :pswitch_a
    const-string v0, "RESULT_INSTALL_SUCCESS"

    .line 35
    .line 36
    :goto_0
    const/4 v1, 0x6

    .line 37
    const-string v2, "ProfileInstaller"

    .line 38
    .line 39
    if-eq p1, v1, :cond_0

    .line 40
    .line 41
    const/4 v1, 0x7

    .line 42
    if-eq p1, v1, :cond_0

    .line 43
    .line 44
    const/16 v1, 0x8

    .line 45
    .line 46
    if-eq p1, v1, :cond_0

    .line 47
    .line 48
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    check-cast p2, Ljava/lang/Throwable;

    .line 53
    .line 54
    invoke-static {v2, v0, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 55
    .line 56
    .line 57
    :goto_1
    iget-object p2, p0, LB1/a;->l:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p2, Landroidx/profileinstaller/ProfileInstallReceiver;

    .line 60
    .line 61
    invoke-virtual {p2, p1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public e(Ljava/lang/Object;)V
    .locals 5

    .line 1
    check-cast p1, Ljava/util/Map;

    .line 2
    .line 3
    iget-object v0, p0, LB1/a;->l:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lb0/I;

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x0

    .line 12
    new-array v3, v2, [Ljava/lang/String;

    .line 13
    .line 14
    invoke-interface {v1, v3}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, [Ljava/lang/String;

    .line 19
    .line 20
    new-instance v1, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    new-array p1, p1, [I

    .line 34
    .line 35
    move v3, v2

    .line 36
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-ge v3, v4, :cond_1

    .line 41
    .line 42
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, Ljava/lang/Boolean;

    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_0

    .line 53
    .line 54
    move v4, v2

    .line 55
    goto :goto_1

    .line 56
    :cond_0
    const/4 v4, -0x1

    .line 57
    :goto_1
    aput v4, p1, v3

    .line 58
    .line 59
    add-int/lit8 v3, v3, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    iget-object p1, v0, Lb0/I;->E:Ljava/util/ArrayDeque;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    check-cast p1, Lb0/E;

    .line 69
    .line 70
    const-string v1, "FragmentManager"

    .line 71
    .line 72
    if-nez p1, :cond_2

    .line 73
    .line 74
    new-instance p1, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    const-string v0, "No permissions were requested for "

    .line 77
    .line 78
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_2
    iget-object p1, p1, Lb0/E;->k:Ljava/lang/String;

    .line 93
    .line 94
    iget-object v0, v0, Lb0/I;->c:LB1/s;

    .line 95
    .line 96
    invoke-virtual {v0, p1}, LB1/s;->j(Ljava/lang/String;)Lb0/s;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    if-nez v0, :cond_3

    .line 101
    .line 102
    new-instance v0, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    const-string v2, "Permission request result delivered for unknown Fragment "

    .line 105
    .line 106
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 117
    .line 118
    .line 119
    :cond_3
    return-void
.end method

.method public f()I
    .locals 2

    .line 1
    iget-object v0, p0, LB1/a;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ll0/t;

    .line 4
    .line 5
    iget v1, v0, Ll0/t;->g:I

    .line 6
    .line 7
    invoke-virtual {v0}, Ll0/t;->r()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    sub-int/2addr v1, v0

    .line 12
    return v1
.end method

.method public g()LV/j0;
    .locals 1

    .line 1
    iget-object v0, p0, LB1/a;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ll2/q;

    .line 4
    .line 5
    invoke-virtual {v0}, Ll2/q;->a()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, LV/j0;

    .line 10
    .line 11
    return-object v0
.end method

.method public h(Ll2/e;LR1/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Ll2/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Ll2/a;

    .line 7
    .line 8
    iget v1, v0, Ll2/a;->q:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Ll2/a;->q:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ll2/a;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Ll2/a;-><init>(LB1/a;LR1/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Ll2/a;->o:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Ll2/a;->q:I

    .line 28
    .line 29
    sget-object v2, LO1/g;->a:LO1/g;

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    if-ne v1, v3, :cond_1

    .line 35
    .line 36
    iget-object p1, v0, Ll2/a;->n:Lm2/l;

    .line 37
    .line 38
    :try_start_0
    invoke-static {p2}, LH2/h;->E(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :catchall_0
    move-exception p2

    .line 43
    goto :goto_4

    .line 44
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_2
    invoke-static {p2}, LH2/h;->E(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    new-instance p2, Lm2/l;

    .line 56
    .line 57
    iget-object v1, v0, LT1/c;->l:LR1/h;

    .line 58
    .line 59
    invoke-static {v1}, La2/h;->b(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-direct {p2, p1, v1}, Lm2/l;-><init>(Ll2/e;LR1/h;)V

    .line 63
    .line 64
    .line 65
    :try_start_1
    iput-object p2, v0, Ll2/a;->n:Lm2/l;

    .line 66
    .line 67
    iput v3, v0, Ll2/a;->q:I

    .line 68
    .line 69
    iget-object p1, p0, LB1/a;->l:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p1, LT1/h;

    .line 72
    .line 73
    invoke-interface {p1, p2, v0}, LZ1/p;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 77
    sget-object v0, LS1/a;->k:LS1/a;

    .line 78
    .line 79
    if-ne p1, v0, :cond_3

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    move-object p1, v2

    .line 83
    :goto_1
    if-ne p1, v0, :cond_4

    .line 84
    .line 85
    return-object v0

    .line 86
    :cond_4
    move-object p1, p2

    .line 87
    :goto_2
    invoke-virtual {p1}, LT1/c;->n()V

    .line 88
    .line 89
    .line 90
    return-object v2

    .line 91
    :goto_3
    move-object v4, p2

    .line 92
    move-object p2, p1

    .line 93
    move-object p1, v4

    .line 94
    goto :goto_4

    .line 95
    :catchall_1
    move-exception p1

    .line 96
    goto :goto_3

    .line 97
    :goto_4
    invoke-virtual {p1}, LT1/c;->n()V

    .line 98
    .line 99
    .line 100
    throw p2
.end method

.method public i(Landroid/view/View;)I
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ll0/u;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Ll0/u;

    .line 16
    .line 17
    iget-object p1, p1, Ll0/u;->a:Landroid/graphics/Rect;

    .line 18
    .line 19
    iget p1, p1, Landroid/graphics/Rect;->top:I

    .line 20
    .line 21
    sub-int/2addr v1, p1

    .line 22
    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 23
    .line 24
    sub-int/2addr v1, p1

    .line 25
    return v1
.end method

.method public k(LA/c;LB1/o;)V
    .locals 40

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget v3, v1, LB1/a;->k:I

    .line 8
    .line 9
    const-string v5, "error"

    .line 10
    .line 11
    const/4 v6, 0x3

    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v8, 0x2

    .line 14
    const/4 v9, 0x0

    .line 15
    const/4 v10, 0x1

    .line 16
    packed-switch v3, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    iget-object v3, v1, LB1/a;->l:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v3, LB1/g;

    .line 22
    .line 23
    iget-object v11, v3, LB1/g;->l:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v11, LG1/a;

    .line 26
    .line 27
    if-nez v11, :cond_0

    .line 28
    .line 29
    goto/16 :goto_6

    .line 30
    .line 31
    :cond_0
    iget-object v11, v0, LA/c;->l:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v11, Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result v12

    .line 42
    sparse-switch v12, :sswitch_data_0

    .line 43
    .line 44
    .line 45
    :goto_0
    const/4 v4, -0x1

    .line 46
    goto :goto_1

    .line 47
    :sswitch_0
    const-string v12, "SensitiveContent.isSupported"

    .line 48
    .line 49
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v11

    .line 53
    if-nez v11, :cond_1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    move v4, v8

    .line 57
    goto :goto_1

    .line 58
    :sswitch_1
    const-string v12, "SensitiveContent.setContentSensitivity"

    .line 59
    .line 60
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v11

    .line 64
    if-nez v11, :cond_2

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    move v4, v10

    .line 68
    goto :goto_1

    .line 69
    :sswitch_2
    const-string v12, "SensitiveContent.getContentSensitivity"

    .line 70
    .line 71
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v11

    .line 75
    if-nez v11, :cond_3

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    move v4, v9

    .line 79
    :goto_1
    packed-switch v4, :pswitch_data_1

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2}, LB1/o;->b()V

    .line 83
    .line 84
    .line 85
    goto/16 :goto_6

    .line 86
    .line 87
    :pswitch_0
    iget-object v0, v3, LB1/g;->l:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, LG1/a;

    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 95
    .line 96
    const/16 v3, 0x23

    .line 97
    .line 98
    if-lt v0, v3, :cond_4

    .line 99
    .line 100
    move v9, v10

    .line 101
    :cond_4
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v2, v0}, LB1/o;->d(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    goto/16 :goto_6

    .line 109
    .line 110
    :pswitch_1
    iget-object v0, v0, LA/c;->m:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v0, Ljava/lang/Integer;

    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    :try_start_0
    iget-object v3, v3, LB1/g;->l:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v3, LG1/a;

    .line 121
    .line 122
    if-eqz v0, :cond_7

    .line 123
    .line 124
    if-eq v0, v10, :cond_6

    .line 125
    .line 126
    if-ne v0, v8, :cond_5

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_5
    new-instance v3, Ljava/lang/IllegalArgumentException;

    .line 130
    .line 131
    const-string v4, "contentSensitivityIndex "

    .line 132
    .line 133
    const-string v6, " not known to the SensitiveContentChannel."

    .line 134
    .line 135
    invoke-static {v4, v0, v6}, LB1/e;->h(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-direct {v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    throw v3

    .line 143
    :cond_6
    move v8, v10

    .line 144
    goto :goto_2

    .line 145
    :cond_7
    move v8, v9

    .line 146
    :goto_2
    invoke-virtual {v3, v8}, LG1/a;->e(I)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 147
    .line 148
    .line 149
    goto :goto_6

    .line 150
    :catch_0
    move-exception v0

    .line 151
    goto :goto_3

    .line 152
    :catch_1
    move-exception v0

    .line 153
    :goto_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {v2, v5, v0, v7}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    goto :goto_6

    .line 161
    :pswitch_2
    :try_start_1
    iget-object v0, v3, LB1/g;->l:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v0, LG1/a;

    .line 164
    .line 165
    invoke-virtual {v0}, LG1/a;->d()I

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    if-eqz v0, :cond_a

    .line 170
    .line 171
    if-eq v0, v10, :cond_9

    .line 172
    .line 173
    if-eq v0, v8, :cond_8

    .line 174
    .line 175
    goto :goto_4

    .line 176
    :cond_8
    move v6, v8

    .line 177
    goto :goto_4

    .line 178
    :cond_9
    move v6, v10

    .line 179
    goto :goto_4

    .line 180
    :cond_a
    move v6, v9

    .line 181
    :goto_4
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-virtual {v2, v0}, LB1/o;->d(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_2

    .line 186
    .line 187
    .line 188
    goto :goto_6

    .line 189
    :catch_2
    move-exception v0

    .line 190
    goto :goto_5

    .line 191
    :catch_3
    move-exception v0

    .line 192
    :goto_5
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-virtual {v2, v5, v0, v7}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    :goto_6
    return-void

    .line 200
    :pswitch_3
    iget-object v3, v1, LB1/a;->l:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v3, LB1/p;

    .line 203
    .line 204
    iget-object v4, v0, LA/c;->l:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v4, Ljava/lang/String;

    .line 207
    .line 208
    iget-object v0, v0, LA/c;->m:Ljava/lang/Object;

    .line 209
    .line 210
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    const-string v5, "get"

    .line 214
    .line 215
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v5

    .line 219
    if-nez v5, :cond_c

    .line 220
    .line 221
    const-string v5, "put"

    .line 222
    .line 223
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v4

    .line 227
    if-nez v4, :cond_b

    .line 228
    .line 229
    invoke-virtual {v2}, LB1/o;->b()V

    .line 230
    .line 231
    .line 232
    goto :goto_8

    .line 233
    :cond_b
    check-cast v0, [B

    .line 234
    .line 235
    iput-object v0, v3, LB1/p;->d:Ljava/lang/Object;

    .line 236
    .line 237
    invoke-virtual {v2, v7}, LB1/o;->d(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    goto :goto_8

    .line 241
    :cond_c
    iput-boolean v10, v3, LB1/p;->c:Z

    .line 242
    .line 243
    iget-boolean v0, v3, LB1/p;->b:Z

    .line 244
    .line 245
    if-nez v0, :cond_e

    .line 246
    .line 247
    iget-boolean v0, v3, LB1/p;->a:Z

    .line 248
    .line 249
    if-nez v0, :cond_d

    .line 250
    .line 251
    goto :goto_7

    .line 252
    :cond_d
    iput-object v2, v3, LB1/p;->f:Ljava/lang/Object;

    .line 253
    .line 254
    goto :goto_8

    .line 255
    :cond_e
    :goto_7
    iget-object v0, v3, LB1/p;->d:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v0, [B

    .line 258
    .line 259
    invoke-static {v0}, LB1/p;->b([B)Ljava/util/HashMap;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-virtual {v2, v0}, LB1/o;->d(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    :goto_8
    return-void

    .line 267
    :pswitch_4
    iget-object v3, v1, LB1/a;->l:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast v3, LA/c;

    .line 270
    .line 271
    iget-object v11, v3, LA/c;->m:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v11, LB1/n;

    .line 274
    .line 275
    if-nez v11, :cond_f

    .line 276
    .line 277
    goto/16 :goto_12

    .line 278
    .line 279
    :cond_f
    iget-object v11, v0, LA/c;->l:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast v11, Ljava/lang/String;

    .line 282
    .line 283
    iget-object v0, v0, LA/c;->m:Ljava/lang/Object;

    .line 284
    .line 285
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    .line 289
    .line 290
    .line 291
    move-result v12

    .line 292
    sparse-switch v12, :sswitch_data_1

    .line 293
    .line 294
    .line 295
    :goto_9
    const/16 v16, -0x1

    .line 296
    .line 297
    goto/16 :goto_a

    .line 298
    .line 299
    :sswitch_3
    const-string v12, "dispose"

    .line 300
    .line 301
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v11

    .line 305
    if-nez v11, :cond_10

    .line 306
    .line 307
    goto :goto_9

    .line 308
    :cond_10
    const/16 v16, 0x7

    .line 309
    .line 310
    goto :goto_a

    .line 311
    :sswitch_4
    const-string v12, "setDirection"

    .line 312
    .line 313
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v11

    .line 317
    if-nez v11, :cond_11

    .line 318
    .line 319
    goto :goto_9

    .line 320
    :cond_11
    const/16 v16, 0x6

    .line 321
    .line 322
    goto :goto_a

    .line 323
    :sswitch_5
    const-string v12, "touch"

    .line 324
    .line 325
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v11

    .line 329
    if-nez v11, :cond_12

    .line 330
    .line 331
    goto :goto_9

    .line 332
    :cond_12
    const/16 v16, 0x5

    .line 333
    .line 334
    goto :goto_a

    .line 335
    :sswitch_6
    const-string v12, "synchronizeToNativeViewHierarchy"

    .line 336
    .line 337
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    move-result v11

    .line 341
    if-nez v11, :cond_13

    .line 342
    .line 343
    goto :goto_9

    .line 344
    :cond_13
    const/16 v16, 0x4

    .line 345
    .line 346
    goto :goto_a

    .line 347
    :sswitch_7
    const-string v12, "clearFocus"

    .line 348
    .line 349
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    move-result v11

    .line 353
    if-nez v11, :cond_14

    .line 354
    .line 355
    goto :goto_9

    .line 356
    :cond_14
    move/from16 v16, v6

    .line 357
    .line 358
    goto :goto_a

    .line 359
    :sswitch_8
    const-string v12, "resize"

    .line 360
    .line 361
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    move-result v11

    .line 365
    if-nez v11, :cond_15

    .line 366
    .line 367
    goto :goto_9

    .line 368
    :cond_15
    move/from16 v16, v8

    .line 369
    .line 370
    goto :goto_a

    .line 371
    :sswitch_9
    const-string v12, "offset"

    .line 372
    .line 373
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    move-result v11

    .line 377
    if-nez v11, :cond_16

    .line 378
    .line 379
    goto :goto_9

    .line 380
    :cond_16
    move/from16 v16, v10

    .line 381
    .line 382
    goto :goto_a

    .line 383
    :sswitch_a
    const-string v12, "create"

    .line 384
    .line 385
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    move-result v11

    .line 389
    if-nez v11, :cond_17

    .line 390
    .line 391
    goto :goto_9

    .line 392
    :cond_17
    move/from16 v16, v9

    .line 393
    .line 394
    :goto_a
    const-string v11, "left"

    .line 395
    .line 396
    const-string v12, "top"

    .line 397
    .line 398
    const-string v13, "height"

    .line 399
    .line 400
    const-string v14, "width"

    .line 401
    .line 402
    const-string v15, "direction"

    .line 403
    .line 404
    const-string v4, "id"

    .line 405
    .line 406
    packed-switch v16, :pswitch_data_2

    .line 407
    .line 408
    .line 409
    invoke-virtual {v2}, LB1/o;->b()V

    .line 410
    .line 411
    .line 412
    goto/16 :goto_12

    .line 413
    .line 414
    :pswitch_5
    check-cast v0, Ljava/util/Map;

    .line 415
    .line 416
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    check-cast v0, Ljava/lang/Integer;

    .line 421
    .line 422
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 423
    .line 424
    .line 425
    move-result v0

    .line 426
    :try_start_2
    iget-object v3, v3, LA/c;->m:Ljava/lang/Object;

    .line 427
    .line 428
    check-cast v3, LB1/n;

    .line 429
    .line 430
    invoke-interface {v3, v0}, LB1/n;->p(I)V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v2, v7}, LB1/o;->d(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_4

    .line 434
    .line 435
    .line 436
    goto/16 :goto_12

    .line 437
    .line 438
    :catch_4
    move-exception v0

    .line 439
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    invoke-virtual {v2, v5, v0, v7}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 444
    .line 445
    .line 446
    goto/16 :goto_12

    .line 447
    .line 448
    :pswitch_6
    check-cast v0, Ljava/util/Map;

    .line 449
    .line 450
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v4

    .line 454
    check-cast v4, Ljava/lang/Integer;

    .line 455
    .line 456
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 457
    .line 458
    .line 459
    move-result v4

    .line 460
    invoke-interface {v0, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    check-cast v0, Ljava/lang/Integer;

    .line 465
    .line 466
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 467
    .line 468
    .line 469
    move-result v0

    .line 470
    :try_start_3
    iget-object v3, v3, LA/c;->m:Ljava/lang/Object;

    .line 471
    .line 472
    check-cast v3, LB1/n;

    .line 473
    .line 474
    invoke-interface {v3, v4, v0}, LB1/n;->f(II)V

    .line 475
    .line 476
    .line 477
    invoke-virtual {v2, v7}, LB1/o;->d(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_5

    .line 478
    .line 479
    .line 480
    goto/16 :goto_12

    .line 481
    .line 482
    :catch_5
    move-exception v0

    .line 483
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    invoke-virtual {v2, v5, v0, v7}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 488
    .line 489
    .line 490
    goto/16 :goto_12

    .line 491
    .line 492
    :pswitch_7
    check-cast v0, Ljava/util/List;

    .line 493
    .line 494
    new-instance v20, LB1/l;

    .line 495
    .line 496
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    move-result-object v4

    .line 500
    check-cast v4, Ljava/lang/Integer;

    .line 501
    .line 502
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 503
    .line 504
    .line 505
    move-result v21

    .line 506
    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v4

    .line 510
    move-object/from16 v22, v4

    .line 511
    .line 512
    check-cast v22, Ljava/lang/Number;

    .line 513
    .line 514
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    move-result-object v4

    .line 518
    move-object/from16 v23, v4

    .line 519
    .line 520
    check-cast v23, Ljava/lang/Number;

    .line 521
    .line 522
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v4

    .line 526
    check-cast v4, Ljava/lang/Integer;

    .line 527
    .line 528
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 529
    .line 530
    .line 531
    move-result v24

    .line 532
    const/4 v4, 0x4

    .line 533
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v4

    .line 537
    check-cast v4, Ljava/lang/Integer;

    .line 538
    .line 539
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 540
    .line 541
    .line 542
    move-result v25

    .line 543
    const/4 v4, 0x5

    .line 544
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    move-result-object v26

    .line 548
    const/4 v4, 0x6

    .line 549
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    move-result-object v27

    .line 553
    const/4 v4, 0x7

    .line 554
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    move-result-object v4

    .line 558
    check-cast v4, Ljava/lang/Integer;

    .line 559
    .line 560
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 561
    .line 562
    .line 563
    move-result v28

    .line 564
    const/16 v4, 0x8

    .line 565
    .line 566
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object v4

    .line 570
    check-cast v4, Ljava/lang/Integer;

    .line 571
    .line 572
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 573
    .line 574
    .line 575
    move-result v29

    .line 576
    const/16 v4, 0x9

    .line 577
    .line 578
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object v4

    .line 582
    check-cast v4, Ljava/lang/Double;

    .line 583
    .line 584
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 585
    .line 586
    .line 587
    move-result-wide v8

    .line 588
    double-to-float v4, v8

    .line 589
    const/16 v6, 0xa

    .line 590
    .line 591
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    move-result-object v6

    .line 595
    check-cast v6, Ljava/lang/Double;

    .line 596
    .line 597
    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    .line 598
    .line 599
    .line 600
    move-result-wide v8

    .line 601
    double-to-float v6, v8

    .line 602
    const/16 v8, 0xb

    .line 603
    .line 604
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 605
    .line 606
    .line 607
    move-result-object v8

    .line 608
    check-cast v8, Ljava/lang/Integer;

    .line 609
    .line 610
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 611
    .line 612
    .line 613
    move-result v32

    .line 614
    const/16 v8, 0xc

    .line 615
    .line 616
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    move-result-object v8

    .line 620
    check-cast v8, Ljava/lang/Integer;

    .line 621
    .line 622
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 623
    .line 624
    .line 625
    move-result v33

    .line 626
    const/16 v8, 0xd

    .line 627
    .line 628
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    move-result-object v8

    .line 632
    check-cast v8, Ljava/lang/Integer;

    .line 633
    .line 634
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 635
    .line 636
    .line 637
    move-result v34

    .line 638
    const/16 v8, 0xe

    .line 639
    .line 640
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    move-result-object v8

    .line 644
    check-cast v8, Ljava/lang/Integer;

    .line 645
    .line 646
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 647
    .line 648
    .line 649
    move-result v35

    .line 650
    const/16 v8, 0xf

    .line 651
    .line 652
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    move-result-object v0

    .line 656
    check-cast v0, Ljava/lang/Number;

    .line 657
    .line 658
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 659
    .line 660
    .line 661
    move-result-wide v36

    .line 662
    move/from16 v30, v4

    .line 663
    .line 664
    move/from16 v31, v6

    .line 665
    .line 666
    invoke-direct/range {v20 .. v37}, LB1/l;-><init>(ILjava/lang/Number;Ljava/lang/Number;IILjava/lang/Object;Ljava/lang/Object;IIFFIIIIJ)V

    .line 667
    .line 668
    .line 669
    move-object/from16 v0, v20

    .line 670
    .line 671
    :try_start_4
    iget-object v3, v3, LA/c;->m:Ljava/lang/Object;

    .line 672
    .line 673
    check-cast v3, LB1/n;

    .line 674
    .line 675
    invoke-interface {v3, v0}, LB1/n;->i(LB1/l;)V

    .line 676
    .line 677
    .line 678
    invoke-virtual {v2, v7}, LB1/o;->d(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_6

    .line 679
    .line 680
    .line 681
    goto/16 :goto_12

    .line 682
    .line 683
    :catch_6
    move-exception v0

    .line 684
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 685
    .line 686
    .line 687
    move-result-object v0

    .line 688
    invoke-virtual {v2, v5, v0, v7}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 689
    .line 690
    .line 691
    goto/16 :goto_12

    .line 692
    .line 693
    :pswitch_8
    check-cast v0, Ljava/lang/Boolean;

    .line 694
    .line 695
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 696
    .line 697
    .line 698
    move-result v0

    .line 699
    :try_start_5
    iget-object v3, v3, LA/c;->m:Ljava/lang/Object;

    .line 700
    .line 701
    check-cast v3, LB1/n;

    .line 702
    .line 703
    invoke-interface {v3, v0}, LB1/n;->a(Z)V

    .line 704
    .line 705
    .line 706
    invoke-virtual {v2, v7}, LB1/o;->d(Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/lang/IllegalStateException; {:try_start_5 .. :try_end_5} :catch_7

    .line 707
    .line 708
    .line 709
    goto/16 :goto_12

    .line 710
    .line 711
    :catch_7
    move-exception v0

    .line 712
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 713
    .line 714
    .line 715
    move-result-object v0

    .line 716
    invoke-virtual {v2, v5, v0, v7}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 717
    .line 718
    .line 719
    goto/16 :goto_12

    .line 720
    .line 721
    :pswitch_9
    check-cast v0, Ljava/lang/Integer;

    .line 722
    .line 723
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 724
    .line 725
    .line 726
    move-result v0

    .line 727
    :try_start_6
    iget-object v3, v3, LA/c;->m:Ljava/lang/Object;

    .line 728
    .line 729
    check-cast v3, LB1/n;

    .line 730
    .line 731
    invoke-interface {v3, v0}, LB1/n;->m(I)V

    .line 732
    .line 733
    .line 734
    invoke-virtual {v2, v7}, LB1/o;->d(Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/IllegalStateException; {:try_start_6 .. :try_end_6} :catch_8

    .line 735
    .line 736
    .line 737
    goto/16 :goto_12

    .line 738
    .line 739
    :catch_8
    move-exception v0

    .line 740
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 741
    .line 742
    .line 743
    move-result-object v0

    .line 744
    invoke-virtual {v2, v5, v0, v7}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 745
    .line 746
    .line 747
    goto/16 :goto_12

    .line 748
    .line 749
    :pswitch_a
    check-cast v0, Ljava/util/Map;

    .line 750
    .line 751
    new-instance v15, LB1/m;

    .line 752
    .line 753
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 754
    .line 755
    .line 756
    move-result-object v4

    .line 757
    check-cast v4, Ljava/lang/Integer;

    .line 758
    .line 759
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 760
    .line 761
    .line 762
    move-result v16

    .line 763
    invoke-interface {v0, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 764
    .line 765
    .line 766
    move-result-object v4

    .line 767
    check-cast v4, Ljava/lang/Double;

    .line 768
    .line 769
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 770
    .line 771
    .line 772
    move-result-wide v17

    .line 773
    invoke-interface {v0, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 774
    .line 775
    .line 776
    move-result-object v0

    .line 777
    check-cast v0, Ljava/lang/Double;

    .line 778
    .line 779
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 780
    .line 781
    .line 782
    move-result-wide v19

    .line 783
    invoke-direct/range {v15 .. v20}, LB1/m;-><init>(IDD)V

    .line 784
    .line 785
    .line 786
    :try_start_7
    iget-object v0, v3, LA/c;->m:Ljava/lang/Object;

    .line 787
    .line 788
    check-cast v0, LB1/n;

    .line 789
    .line 790
    new-instance v3, LB1/d;

    .line 791
    .line 792
    invoke-direct {v3, v2, v10}, LB1/d;-><init>(Ljava/lang/Object;I)V

    .line 793
    .line 794
    .line 795
    invoke-interface {v0, v15, v3}, LB1/n;->e(LB1/m;LB1/d;)V
    :try_end_7
    .catch Ljava/lang/IllegalStateException; {:try_start_7 .. :try_end_7} :catch_9

    .line 796
    .line 797
    .line 798
    goto/16 :goto_12

    .line 799
    .line 800
    :catch_9
    move-exception v0

    .line 801
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 802
    .line 803
    .line 804
    move-result-object v0

    .line 805
    invoke-virtual {v2, v5, v0, v7}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 806
    .line 807
    .line 808
    goto/16 :goto_12

    .line 809
    .line 810
    :pswitch_b
    check-cast v0, Ljava/util/Map;

    .line 811
    .line 812
    :try_start_8
    iget-object v3, v3, LA/c;->m:Ljava/lang/Object;

    .line 813
    .line 814
    move-object v13, v3

    .line 815
    check-cast v13, LB1/n;

    .line 816
    .line 817
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 818
    .line 819
    .line 820
    move-result-object v3

    .line 821
    check-cast v3, Ljava/lang/Integer;

    .line 822
    .line 823
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 824
    .line 825
    .line 826
    move-result v14

    .line 827
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 828
    .line 829
    .line 830
    move-result-object v3

    .line 831
    check-cast v3, Ljava/lang/Double;

    .line 832
    .line 833
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 834
    .line 835
    .line 836
    move-result-wide v15

    .line 837
    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 838
    .line 839
    .line 840
    move-result-object v0

    .line 841
    check-cast v0, Ljava/lang/Double;

    .line 842
    .line 843
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 844
    .line 845
    .line 846
    move-result-wide v17

    .line 847
    invoke-interface/range {v13 .. v18}, LB1/n;->d(IDD)V

    .line 848
    .line 849
    .line 850
    invoke-virtual {v2, v7}, LB1/o;->d(Ljava/lang/Object;)V
    :try_end_8
    .catch Ljava/lang/IllegalStateException; {:try_start_8 .. :try_end_8} :catch_a

    .line 851
    .line 852
    .line 853
    goto/16 :goto_12

    .line 854
    .line 855
    :catch_a
    move-exception v0

    .line 856
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 857
    .line 858
    .line 859
    move-result-object v0

    .line 860
    invoke-virtual {v2, v5, v0, v7}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 861
    .line 862
    .line 863
    goto/16 :goto_12

    .line 864
    .line 865
    :pswitch_c
    const-string v6, "hybridFallback"

    .line 866
    .line 867
    check-cast v0, Ljava/util/Map;

    .line 868
    .line 869
    const-string v8, "hybrid"

    .line 870
    .line 871
    invoke-interface {v0, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 872
    .line 873
    .line 874
    move-result v17

    .line 875
    if-eqz v17, :cond_18

    .line 876
    .line 877
    invoke-interface {v0, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 878
    .line 879
    .line 880
    move-result-object v8

    .line 881
    check-cast v8, Ljava/lang/Boolean;

    .line 882
    .line 883
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 884
    .line 885
    .line 886
    move-result v8

    .line 887
    if-eqz v8, :cond_18

    .line 888
    .line 889
    move v8, v10

    .line 890
    goto :goto_b

    .line 891
    :cond_18
    move v8, v9

    .line 892
    :goto_b
    const-string v9, "params"

    .line 893
    .line 894
    invoke-interface {v0, v9}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 895
    .line 896
    .line 897
    move-result v18

    .line 898
    if-eqz v18, :cond_19

    .line 899
    .line 900
    invoke-interface {v0, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 901
    .line 902
    .line 903
    move-result-object v9

    .line 904
    check-cast v9, [B

    .line 905
    .line 906
    invoke-static {v9}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 907
    .line 908
    .line 909
    move-result-object v9

    .line 910
    move-object/from16 v31, v9

    .line 911
    .line 912
    goto :goto_c

    .line 913
    :cond_19
    move-object/from16 v31, v7

    .line 914
    .line 915
    :goto_c
    :try_start_9
    iget-object v9, v3, LA/c;->m:Ljava/lang/Object;

    .line 916
    .line 917
    check-cast v9, LB1/n;

    .line 918
    .line 919
    invoke-interface {v9}, LB1/n;->r()Z

    .line 920
    .line 921
    .line 922
    move-result v9
    :try_end_9
    .catch Ljava/lang/IllegalStateException; {:try_start_9 .. :try_end_9} :catch_b

    .line 923
    const-string v10, "viewType"

    .line 924
    .line 925
    if-eqz v9, :cond_1a

    .line 926
    .line 927
    :try_start_a
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 928
    .line 929
    .line 930
    move-result-object v4

    .line 931
    check-cast v4, Ljava/lang/Integer;

    .line 932
    .line 933
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 934
    .line 935
    .line 936
    move-result v19

    .line 937
    invoke-interface {v0, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 938
    .line 939
    .line 940
    move-result-object v4

    .line 941
    move-object/from16 v20, v4

    .line 942
    .line 943
    check-cast v20, Ljava/lang/String;

    .line 944
    .line 945
    invoke-interface {v0, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 946
    .line 947
    .line 948
    move-result-object v0

    .line 949
    check-cast v0, Ljava/lang/Integer;

    .line 950
    .line 951
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 952
    .line 953
    .line 954
    move-result v29

    .line 955
    new-instance v18, LB1/k;

    .line 956
    .line 957
    const-wide/16 v27, 0x0

    .line 958
    .line 959
    const/16 v30, 0x0

    .line 960
    .line 961
    const-wide/16 v21, 0x0

    .line 962
    .line 963
    const-wide/16 v23, 0x0

    .line 964
    .line 965
    const-wide/16 v25, 0x0

    .line 966
    .line 967
    invoke-direct/range {v18 .. v31}, LB1/k;-><init>(ILjava/lang/String;DDDDIILjava/nio/ByteBuffer;)V

    .line 968
    .line 969
    .line 970
    move-object/from16 v0, v18

    .line 971
    .line 972
    iget-object v3, v3, LA/c;->m:Ljava/lang/Object;

    .line 973
    .line 974
    check-cast v3, LB1/n;

    .line 975
    .line 976
    invoke-interface {v3, v0}, LB1/n;->q(LB1/k;)V

    .line 977
    .line 978
    .line 979
    invoke-virtual {v2, v7}, LB1/o;->d(Ljava/lang/Object;)V

    .line 980
    .line 981
    .line 982
    goto/16 :goto_12

    .line 983
    .line 984
    :catch_b
    move-exception v0

    .line 985
    goto/16 :goto_11

    .line 986
    .line 987
    :cond_1a
    if-eqz v8, :cond_1b

    .line 988
    .line 989
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 990
    .line 991
    .line 992
    move-result-object v4

    .line 993
    check-cast v4, Ljava/lang/Integer;

    .line 994
    .line 995
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 996
    .line 997
    .line 998
    move-result v19

    .line 999
    invoke-interface {v0, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v4

    .line 1003
    move-object/from16 v20, v4

    .line 1004
    .line 1005
    check-cast v20, Ljava/lang/String;

    .line 1006
    .line 1007
    invoke-interface {v0, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v0

    .line 1011
    check-cast v0, Ljava/lang/Integer;

    .line 1012
    .line 1013
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1014
    .line 1015
    .line 1016
    move-result v29

    .line 1017
    new-instance v18, LB1/k;

    .line 1018
    .line 1019
    const-wide/16 v27, 0x0

    .line 1020
    .line 1021
    const/16 v30, 0x3

    .line 1022
    .line 1023
    const-wide/16 v21, 0x0

    .line 1024
    .line 1025
    const-wide/16 v23, 0x0

    .line 1026
    .line 1027
    const-wide/16 v25, 0x0

    .line 1028
    .line 1029
    invoke-direct/range {v18 .. v31}, LB1/k;-><init>(ILjava/lang/String;DDDDIILjava/nio/ByteBuffer;)V

    .line 1030
    .line 1031
    .line 1032
    move-object/from16 v0, v18

    .line 1033
    .line 1034
    iget-object v3, v3, LA/c;->m:Ljava/lang/Object;

    .line 1035
    .line 1036
    check-cast v3, LB1/n;

    .line 1037
    .line 1038
    invoke-interface {v3, v0}, LB1/n;->n(LB1/k;)V

    .line 1039
    .line 1040
    .line 1041
    invoke-virtual {v2, v7}, LB1/o;->d(Ljava/lang/Object;)V

    .line 1042
    .line 1043
    .line 1044
    goto/16 :goto_12

    .line 1045
    .line 1046
    :cond_1b
    invoke-interface {v0, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1047
    .line 1048
    .line 1049
    move-result v8

    .line 1050
    if-eqz v8, :cond_1c

    .line 1051
    .line 1052
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v6

    .line 1056
    check-cast v6, Ljava/lang/Boolean;

    .line 1057
    .line 1058
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1059
    .line 1060
    .line 1061
    move-result v6

    .line 1062
    if-eqz v6, :cond_1c

    .line 1063
    .line 1064
    const/4 v9, 0x1

    .line 1065
    goto :goto_d

    .line 1066
    :cond_1c
    const/4 v9, 0x0

    .line 1067
    :goto_d
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v4

    .line 1071
    check-cast v4, Ljava/lang/Integer;

    .line 1072
    .line 1073
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1074
    .line 1075
    .line 1076
    move-result v19

    .line 1077
    invoke-interface {v0, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v4

    .line 1081
    move-object/from16 v20, v4

    .line 1082
    .line 1083
    check-cast v20, Ljava/lang/String;

    .line 1084
    .line 1085
    invoke-interface {v0, v12}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1086
    .line 1087
    .line 1088
    move-result v4

    .line 1089
    const-wide/16 v21, 0x0

    .line 1090
    .line 1091
    if-eqz v4, :cond_1d

    .line 1092
    .line 1093
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v4

    .line 1097
    check-cast v4, Ljava/lang/Double;

    .line 1098
    .line 1099
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 1100
    .line 1101
    .line 1102
    move-result-wide v23

    .line 1103
    goto :goto_e

    .line 1104
    :cond_1d
    move-wide/from16 v23, v21

    .line 1105
    .line 1106
    :goto_e
    invoke-interface {v0, v11}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1107
    .line 1108
    .line 1109
    move-result v4

    .line 1110
    if-eqz v4, :cond_1e

    .line 1111
    .line 1112
    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v4

    .line 1116
    check-cast v4, Ljava/lang/Double;

    .line 1117
    .line 1118
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 1119
    .line 1120
    .line 1121
    move-result-wide v21

    .line 1122
    :cond_1e
    invoke-interface {v0, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v4

    .line 1126
    check-cast v4, Ljava/lang/Double;

    .line 1127
    .line 1128
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 1129
    .line 1130
    .line 1131
    move-result-wide v25

    .line 1132
    invoke-interface {v0, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v4

    .line 1136
    check-cast v4, Ljava/lang/Double;

    .line 1137
    .line 1138
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 1139
    .line 1140
    .line 1141
    move-result-wide v27

    .line 1142
    invoke-interface {v0, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v0

    .line 1146
    check-cast v0, Ljava/lang/Integer;

    .line 1147
    .line 1148
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1149
    .line 1150
    .line 1151
    move-result v29

    .line 1152
    const/4 v0, 0x1

    .line 1153
    new-instance v18, LB1/k;

    .line 1154
    .line 1155
    if-eqz v9, :cond_1f

    .line 1156
    .line 1157
    const/16 v30, 0x2

    .line 1158
    .line 1159
    :goto_f
    move-wide/from16 v38, v23

    .line 1160
    .line 1161
    move-wide/from16 v23, v21

    .line 1162
    .line 1163
    move-wide/from16 v21, v38

    .line 1164
    .line 1165
    goto :goto_10

    .line 1166
    :cond_1f
    move/from16 v30, v0

    .line 1167
    .line 1168
    goto :goto_f

    .line 1169
    :goto_10
    invoke-direct/range {v18 .. v31}, LB1/k;-><init>(ILjava/lang/String;DDDDIILjava/nio/ByteBuffer;)V

    .line 1170
    .line 1171
    .line 1172
    move-object/from16 v0, v18

    .line 1173
    .line 1174
    iget-object v3, v3, LA/c;->m:Ljava/lang/Object;

    .line 1175
    .line 1176
    check-cast v3, LB1/n;

    .line 1177
    .line 1178
    invoke-interface {v3, v0}, LB1/n;->j(LB1/k;)J

    .line 1179
    .line 1180
    .line 1181
    move-result-wide v3

    .line 1182
    const-wide/16 v10, -0x2

    .line 1183
    .line 1184
    cmp-long v0, v3, v10

    .line 1185
    .line 1186
    if-nez v0, :cond_21

    .line 1187
    .line 1188
    if-eqz v9, :cond_20

    .line 1189
    .line 1190
    invoke-virtual {v2, v7}, LB1/o;->d(Ljava/lang/Object;)V

    .line 1191
    .line 1192
    .line 1193
    goto :goto_12

    .line 1194
    :cond_20
    new-instance v0, Ljava/lang/AssertionError;

    .line 1195
    .line 1196
    const-string v3, "Platform view attempted to fall back to hybrid mode when not requested."

    .line 1197
    .line 1198
    invoke-direct {v0, v3}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 1199
    .line 1200
    .line 1201
    throw v0

    .line 1202
    :cond_21
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1203
    .line 1204
    .line 1205
    move-result-object v0

    .line 1206
    invoke-virtual {v2, v0}, LB1/o;->d(Ljava/lang/Object;)V
    :try_end_a
    .catch Ljava/lang/IllegalStateException; {:try_start_a .. :try_end_a} :catch_b

    .line 1207
    .line 1208
    .line 1209
    goto :goto_12

    .line 1210
    :goto_11
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v0

    .line 1214
    invoke-virtual {v2, v5, v0, v7}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1215
    .line 1216
    .line 1217
    :goto_12
    return-void

    .line 1218
    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_4
        :pswitch_3
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        -0x7383582f -> :sswitch_2
        0x23a829dd -> :sswitch_1
        0x604c7e59 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x509a5f04 -> :sswitch_a
        -0x3cc89b6d -> :sswitch_9
        -0x37b2634c -> :sswitch_8
        -0x2d106975 -> :sswitch_7
        -0x126acbb2 -> :sswitch_6
        0x696df3f -> :sswitch_5
        0x2261393d -> :sswitch_4
        0x63a5261f -> :sswitch_3
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
    .end packed-switch
.end method

.method public l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, LB1/a;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LD1/a;

    .line 4
    .line 5
    iget-object v1, v0, LD1/a;->b:Landroid/content/Context;

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    invoke-static {p2}, LD1/a;->a(Ljava/lang/String;)Ljava/util/Locale;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    new-instance v1, Landroid/content/res/Configuration;

    .line 14
    .line 15
    iget-object v2, v0, LD1/a;->b:Landroid/content/Context;

    .line 16
    .line 17
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-direct {v1, v2}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p2}, Landroid/content/res/Configuration;->setLocale(Ljava/util/Locale;)V

    .line 29
    .line 30
    .line 31
    iget-object p2, v0, LD1/a;->b:Landroid/content/Context;

    .line 32
    .line 33
    invoke-virtual {p2, v1}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    :cond_0
    iget-object p2, v0, LD1/a;->b:Landroid/content/Context;

    .line 38
    .line 39
    invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v2, "string"

    .line 48
    .line 49
    invoke-virtual {v0, p1, v2, p2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_1

    .line 54
    .line 55
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-virtual {p2, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    return-object p1

    .line 64
    :cond_1
    const/4 p1, 0x0

    .line 65
    return-object p1
.end method

.method public m(LV/j0;)V
    .locals 5

    .line 1
    const-string v0, "newState"

    .line 2
    .line 3
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LB1/a;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ll2/q;

    .line 9
    .line 10
    :cond_0
    invoke-virtual {v0}, Ll2/q;->a()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    move-object v2, v1

    .line 15
    check-cast v2, LV/j0;

    .line 16
    .line 17
    instance-of v3, v2, LV/b0;

    .line 18
    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    sget-object v3, LV/k0;->b:LV/k0;

    .line 24
    .line 25
    invoke-static {v2, v3}, La2/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    :goto_0
    if-eqz v3, :cond_2

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    instance-of v3, v2, LV/c;

    .line 33
    .line 34
    if-eqz v3, :cond_3

    .line 35
    .line 36
    iget v3, p1, LV/j0;->a:I

    .line 37
    .line 38
    iget v4, v2, LV/j0;->a:I

    .line 39
    .line 40
    if-le v3, v4, :cond_4

    .line 41
    .line 42
    :goto_1
    move-object v2, p1

    .line 43
    goto :goto_2

    .line 44
    :cond_3
    instance-of v3, v2, LV/Z;

    .line 45
    .line 46
    if-eqz v3, :cond_7

    .line 47
    .line 48
    :cond_4
    :goto_2
    sget-object v3, Lm2/k;->a:LB1/g;

    .line 49
    .line 50
    if-nez v1, :cond_5

    .line 51
    .line 52
    move-object v1, v3

    .line 53
    :cond_5
    if-nez v2, :cond_6

    .line 54
    .line 55
    move-object v2, v3

    .line 56
    :cond_6
    invoke-virtual {v0, v1, v2}, Ll2/q;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_0

    .line 61
    .line 62
    return-void

    .line 63
    :cond_7
    new-instance p1, LD0/a;

    .line 64
    .line 65
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 66
    .line 67
    .line 68
    throw p1
.end method

.method public n(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, LB1/a;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ll0/t;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ll0/t;->o(I)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public o()I
    .locals 1

    .line 1
    iget-object v0, p0, LB1/a;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ll0/t;

    .line 4
    .line 5
    invoke-virtual {v0}, Ll0/t;->u()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public onResult(Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    iget-object p1, p0, LB1/a;->l:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, LI1/k;

    .line 6
    .line 7
    new-instance v0, LO1/d;

    .line 8
    .line 9
    sget-object v1, LO1/g;->a:LO1/g;

    .line 10
    .line 11
    invoke-direct {v0, v1}, LO1/d;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, LI1/k;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public q(Landroid/view/View;)I
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ll0/u;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Ll0/u;

    .line 16
    .line 17
    iget-object p1, p1, Ll0/u;->a:Landroid/graphics/Rect;

    .line 18
    .line 19
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 20
    .line 21
    add-int/2addr v1, p1

    .line 22
    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 23
    .line 24
    add-int/2addr v1, p1

    .line 25
    return v1
.end method

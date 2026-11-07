.class public final LD/a;
.super Landroid/view/View$AccessibilityDelegate;
.source "SourceFile"


# instance fields
.field public final a:LD/b;


# direct methods
.method public constructor <init>(LD/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/view/View$AccessibilityDelegate;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LD/a;->a:LD/b;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LD/a;->a:LD/b;

    .line 2
    .line 3
    iget-object v0, v0, LD/b;->a:Landroid/view/View$AccessibilityDelegate;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public final getAccessibilityNodeProvider(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeProvider;
    .locals 3

    .line 1
    iget-object v0, p0, LD/a;->a:LD/b;

    .line 2
    .line 3
    iget-object v0, v0, LD/b;->a:Landroid/view/View$AccessibilityDelegate;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/View$AccessibilityDelegate;->getAccessibilityNodeProvider(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeProvider;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x0

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    new-instance v1, LB1/g;

    .line 13
    .line 14
    const/4 v2, 0x5

    .line 15
    invoke-direct {v1, p1, v2}, LB1/g;-><init>(Ljava/lang/Object;I)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v1, v0

    .line 20
    :goto_0
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iget-object p1, v1, LB1/g;->l:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p1, Landroid/view/accessibility/AccessibilityNodeProvider;

    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_1
    return-object v0
.end method

.method public final onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, LD/a;->a:LD/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LD/b;->a(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    new-instance v2, LE/h;

    .line 6
    .line 7
    invoke-direct {v2, v1}, LE/h;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 8
    .line 9
    .line 10
    sget-object v3, LD/G;->a:Ljava/lang/reflect/Field;

    .line 11
    .line 12
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    const-class v5, Ljava/lang/Boolean;

    .line 16
    .line 17
    const/16 v6, 0x1c

    .line 18
    .line 19
    if-lt v3, v6, :cond_0

    .line 20
    .line 21
    invoke-static {v0}, LD/C;->c(Landroid/view/View;)Z

    .line 22
    .line 23
    .line 24
    move-result v7

    .line 25
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const v7, 0x7f0900cd

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v7}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v7

    .line 37
    invoke-virtual {v5, v7}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v8

    .line 41
    if-eqz v8, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    move-object v7, v4

    .line 45
    :goto_0
    check-cast v7, Ljava/lang/Boolean;

    .line 46
    .line 47
    const/4 v8, 0x1

    .line 48
    const/4 v9, 0x0

    .line 49
    if-eqz v7, :cond_2

    .line 50
    .line 51
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    if-eqz v7, :cond_2

    .line 56
    .line 57
    move v7, v8

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    move v7, v9

    .line 60
    :goto_1
    const-string v10, "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY"

    .line 61
    .line 62
    if-lt v3, v6, :cond_3

    .line 63
    .line 64
    invoke-static {v1, v7}, LB/b;->s(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_3
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 69
    .line 70
    .line 71
    move-result-object v11

    .line 72
    if-eqz v11, :cond_4

    .line 73
    .line 74
    invoke-virtual {v11, v10, v9}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 75
    .line 76
    .line 77
    move-result v12

    .line 78
    and-int/lit8 v12, v12, -0x2

    .line 79
    .line 80
    or-int/2addr v7, v12

    .line 81
    invoke-virtual {v11, v10, v7}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 82
    .line 83
    .line 84
    :cond_4
    :goto_2
    if-lt v3, v6, :cond_5

    .line 85
    .line 86
    invoke-static {v0}, LD/C;->b(Landroid/view/View;)Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    goto :goto_3

    .line 95
    :cond_5
    const v7, 0x7f0900c7

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v7}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    invoke-virtual {v5, v7}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    if-eqz v5, :cond_6

    .line 107
    .line 108
    move-object v5, v7

    .line 109
    goto :goto_3

    .line 110
    :cond_6
    move-object v5, v4

    .line 111
    :goto_3
    check-cast v5, Ljava/lang/Boolean;

    .line 112
    .line 113
    if-eqz v5, :cond_7

    .line 114
    .line 115
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    if-eqz v5, :cond_7

    .line 120
    .line 121
    goto :goto_4

    .line 122
    :cond_7
    move v8, v9

    .line 123
    :goto_4
    if-lt v3, v6, :cond_8

    .line 124
    .line 125
    invoke-static {v1, v8}, LB/b;->A(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V

    .line 126
    .line 127
    .line 128
    goto :goto_6

    .line 129
    :cond_8
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    if-eqz v5, :cond_a

    .line 134
    .line 135
    invoke-virtual {v5, v10, v9}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 136
    .line 137
    .line 138
    move-result v7

    .line 139
    and-int/lit8 v7, v7, -0x3

    .line 140
    .line 141
    if-eqz v8, :cond_9

    .line 142
    .line 143
    const/4 v8, 0x2

    .line 144
    goto :goto_5

    .line 145
    :cond_9
    move v8, v9

    .line 146
    :goto_5
    or-int/2addr v7, v8

    .line 147
    invoke-virtual {v5, v10, v7}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 148
    .line 149
    .line 150
    :cond_a
    :goto_6
    const-class v5, Ljava/lang/CharSequence;

    .line 151
    .line 152
    if-lt v3, v6, :cond_b

    .line 153
    .line 154
    invoke-static {v0}, LD/C;->a(Landroid/view/View;)Ljava/lang/CharSequence;

    .line 155
    .line 156
    .line 157
    move-result-object v7

    .line 158
    goto :goto_7

    .line 159
    :cond_b
    const v7, 0x7f0900c8

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0, v7}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v7

    .line 166
    invoke-virtual {v5, v7}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v8

    .line 170
    if-eqz v8, :cond_c

    .line 171
    .line 172
    goto :goto_7

    .line 173
    :cond_c
    move-object v7, v4

    .line 174
    :goto_7
    check-cast v7, Ljava/lang/CharSequence;

    .line 175
    .line 176
    if-lt v3, v6, :cond_d

    .line 177
    .line 178
    invoke-static {v1, v7}, LB/b;->q(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/CharSequence;)V

    .line 179
    .line 180
    .line 181
    goto :goto_8

    .line 182
    :cond_d
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    const-string v8, "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY"

    .line 187
    .line 188
    invoke-virtual {v6, v8, v7}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 189
    .line 190
    .line 191
    :goto_8
    const/16 v6, 0x1e

    .line 192
    .line 193
    if-lt v3, v6, :cond_e

    .line 194
    .line 195
    invoke-static {v0}, LD/E;->b(Landroid/view/View;)Ljava/lang/CharSequence;

    .line 196
    .line 197
    .line 198
    move-result-object v5

    .line 199
    goto :goto_9

    .line 200
    :cond_e
    const v7, 0x7f0900ce

    .line 201
    .line 202
    .line 203
    invoke-virtual {v0, v7}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v7

    .line 207
    invoke-virtual {v5, v7}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v5

    .line 211
    if-eqz v5, :cond_f

    .line 212
    .line 213
    move-object v5, v7

    .line 214
    goto :goto_9

    .line 215
    :cond_f
    move-object v5, v4

    .line 216
    :goto_9
    check-cast v5, Ljava/lang/CharSequence;

    .line 217
    .line 218
    if-lt v3, v6, :cond_10

    .line 219
    .line 220
    invoke-static {v1, v5}, LD/J;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/CharSequence;)V

    .line 221
    .line 222
    .line 223
    :goto_a
    move-object/from16 v5, p0

    .line 224
    .line 225
    goto :goto_b

    .line 226
    :cond_10
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 227
    .line 228
    .line 229
    move-result-object v6

    .line 230
    const-string v7, "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"

    .line 231
    .line 232
    invoke-virtual {v6, v7, v5}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 233
    .line 234
    .line 235
    goto :goto_a

    .line 236
    :goto_b
    iget-object v6, v5, LD/a;->a:LD/b;

    .line 237
    .line 238
    invoke-virtual {v6, v0, v2}, LD/b;->b(Landroid/view/View;LE/h;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    .line 242
    .line 243
    .line 244
    move-result-object v6

    .line 245
    const/16 v7, 0x1a

    .line 246
    .line 247
    if-ge v3, v7, :cond_18

    .line 248
    .line 249
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    const-string v7, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY"

    .line 254
    .line 255
    invoke-virtual {v3, v7}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 259
    .line 260
    .line 261
    move-result-object v3

    .line 262
    const-string v8, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY"

    .line 263
    .line 264
    invoke-virtual {v3, v8}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 268
    .line 269
    .line 270
    move-result-object v3

    .line 271
    const-string v10, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY"

    .line 272
    .line 273
    invoke-virtual {v3, v10}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 277
    .line 278
    .line 279
    move-result-object v3

    .line 280
    const-string v11, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY"

    .line 281
    .line 282
    invoke-virtual {v3, v11}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    const v3, 0x7f0900c6

    .line 286
    .line 287
    .line 288
    invoke-virtual {v0, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v12

    .line 292
    check-cast v12, Landroid/util/SparseArray;

    .line 293
    .line 294
    if-eqz v12, :cond_13

    .line 295
    .line 296
    new-instance v13, Ljava/util/ArrayList;

    .line 297
    .line 298
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 299
    .line 300
    .line 301
    move v14, v9

    .line 302
    :goto_c
    invoke-virtual {v12}, Landroid/util/SparseArray;->size()I

    .line 303
    .line 304
    .line 305
    move-result v15

    .line 306
    if-ge v14, v15, :cond_12

    .line 307
    .line 308
    invoke-virtual {v12, v14}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v15

    .line 312
    check-cast v15, Ljava/lang/ref/WeakReference;

    .line 313
    .line 314
    invoke-virtual {v15}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v15

    .line 318
    if-nez v15, :cond_11

    .line 319
    .line 320
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 321
    .line 322
    .line 323
    move-result-object v15

    .line 324
    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    :cond_11
    add-int/lit8 v14, v14, 0x1

    .line 328
    .line 329
    goto :goto_c

    .line 330
    :cond_12
    move v14, v9

    .line 331
    :goto_d
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 332
    .line 333
    .line 334
    move-result v15

    .line 335
    if-ge v14, v15, :cond_13

    .line 336
    .line 337
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v15

    .line 341
    check-cast v15, Ljava/lang/Integer;

    .line 342
    .line 343
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 344
    .line 345
    .line 346
    move-result v15

    .line 347
    invoke-virtual {v12, v15}, Landroid/util/SparseArray;->remove(I)V

    .line 348
    .line 349
    .line 350
    add-int/lit8 v14, v14, 0x1

    .line 351
    .line 352
    goto :goto_d

    .line 353
    :cond_13
    instance-of v12, v6, Landroid/text/Spanned;

    .line 354
    .line 355
    if-eqz v12, :cond_14

    .line 356
    .line 357
    move-object v4, v6

    .line 358
    check-cast v4, Landroid/text/Spanned;

    .line 359
    .line 360
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    .line 361
    .line 362
    .line 363
    move-result v12

    .line 364
    const-class v13, Landroid/text/style/ClickableSpan;

    .line 365
    .line 366
    invoke-interface {v4, v9, v12, v13}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v4

    .line 370
    check-cast v4, [Landroid/text/style/ClickableSpan;

    .line 371
    .line 372
    :cond_14
    if-eqz v4, :cond_18

    .line 373
    .line 374
    array-length v12, v4

    .line 375
    if-lez v12, :cond_18

    .line 376
    .line 377
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    const-string v12, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY"

    .line 382
    .line 383
    const v13, 0x7f090006

    .line 384
    .line 385
    .line 386
    invoke-virtual {v1, v12, v13}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v0, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v1

    .line 393
    check-cast v1, Landroid/util/SparseArray;

    .line 394
    .line 395
    if-nez v1, :cond_15

    .line 396
    .line 397
    new-instance v1, Landroid/util/SparseArray;

    .line 398
    .line 399
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v0, v3, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 403
    .line 404
    .line 405
    :cond_15
    move v3, v9

    .line 406
    :goto_e
    array-length v12, v4

    .line 407
    if-ge v3, v12, :cond_18

    .line 408
    .line 409
    aget-object v12, v4, v3

    .line 410
    .line 411
    move v13, v9

    .line 412
    :goto_f
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 413
    .line 414
    .line 415
    move-result v14

    .line 416
    if-ge v13, v14, :cond_17

    .line 417
    .line 418
    invoke-virtual {v1, v13}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v14

    .line 422
    check-cast v14, Ljava/lang/ref/WeakReference;

    .line 423
    .line 424
    invoke-virtual {v14}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v14

    .line 428
    check-cast v14, Landroid/text/style/ClickableSpan;

    .line 429
    .line 430
    invoke-virtual {v12, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 431
    .line 432
    .line 433
    move-result v14

    .line 434
    if-eqz v14, :cond_16

    .line 435
    .line 436
    invoke-virtual {v1, v13}, Landroid/util/SparseArray;->keyAt(I)I

    .line 437
    .line 438
    .line 439
    move-result v12

    .line 440
    goto :goto_10

    .line 441
    :cond_16
    add-int/lit8 v13, v13, 0x1

    .line 442
    .line 443
    goto :goto_f

    .line 444
    :cond_17
    sget v12, LE/h;->b:I

    .line 445
    .line 446
    add-int/lit8 v13, v12, 0x1

    .line 447
    .line 448
    sput v13, LE/h;->b:I

    .line 449
    .line 450
    :goto_10
    new-instance v13, Ljava/lang/ref/WeakReference;

    .line 451
    .line 452
    aget-object v14, v4, v3

    .line 453
    .line 454
    invoke-direct {v13, v14}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v1, v12, v13}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 458
    .line 459
    .line 460
    aget-object v13, v4, v3

    .line 461
    .line 462
    move-object v14, v6

    .line 463
    check-cast v14, Landroid/text/Spanned;

    .line 464
    .line 465
    invoke-virtual {v2, v7}, LE/h;->a(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 466
    .line 467
    .line 468
    move-result-object v15

    .line 469
    invoke-interface {v14, v13}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 470
    .line 471
    .line 472
    move-result v16

    .line 473
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 474
    .line 475
    .line 476
    move-result-object v9

    .line 477
    invoke-interface {v15, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 478
    .line 479
    .line 480
    invoke-virtual {v2, v8}, LE/h;->a(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 481
    .line 482
    .line 483
    move-result-object v9

    .line 484
    invoke-interface {v14, v13}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 485
    .line 486
    .line 487
    move-result v15

    .line 488
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 489
    .line 490
    .line 491
    move-result-object v15

    .line 492
    invoke-interface {v9, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 493
    .line 494
    .line 495
    invoke-virtual {v2, v10}, LE/h;->a(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 496
    .line 497
    .line 498
    move-result-object v9

    .line 499
    invoke-interface {v14, v13}, Landroid/text/Spanned;->getSpanFlags(Ljava/lang/Object;)I

    .line 500
    .line 501
    .line 502
    move-result v13

    .line 503
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 504
    .line 505
    .line 506
    move-result-object v13

    .line 507
    invoke-interface {v9, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 508
    .line 509
    .line 510
    invoke-virtual {v2, v11}, LE/h;->a(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 511
    .line 512
    .line 513
    move-result-object v9

    .line 514
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 515
    .line 516
    .line 517
    move-result-object v12

    .line 518
    invoke-interface {v9, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 519
    .line 520
    .line 521
    add-int/lit8 v3, v3, 0x1

    .line 522
    .line 523
    const/4 v9, 0x0

    .line 524
    goto :goto_e

    .line 525
    :cond_18
    const v1, 0x7f0900c5

    .line 526
    .line 527
    .line 528
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    check-cast v0, Ljava/util/List;

    .line 533
    .line 534
    if-nez v0, :cond_19

    .line 535
    .line 536
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 537
    .line 538
    :cond_19
    const/4 v9, 0x0

    .line 539
    :goto_11
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 540
    .line 541
    .line 542
    move-result v1

    .line 543
    if-ge v9, v1, :cond_1a

    .line 544
    .line 545
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    move-result-object v1

    .line 549
    check-cast v1, LE/d;

    .line 550
    .line 551
    iget-object v1, v1, LE/d;->a:Ljava/lang/Object;

    .line 552
    .line 553
    check-cast v1, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    .line 554
    .line 555
    iget-object v3, v2, LE/h;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 556
    .line 557
    invoke-virtual {v3, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;)V

    .line 558
    .line 559
    .line 560
    add-int/lit8 v9, v9, 0x1

    .line 561
    .line 562
    goto :goto_11

    .line 563
    :cond_1a
    return-void
.end method

.method public final onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, LD/a;->a:LD/b;

    .line 2
    .line 3
    iget-object v0, v0, LD/b;->a:Landroid/view/View$AccessibilityDelegate;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LD/a;->a:LD/b;

    .line 2
    .line 3
    iget-object v0, v0, LD/b;->a:Landroid/view/View$AccessibilityDelegate;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, Landroid/view/View$AccessibilityDelegate;->onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public final performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LD/a;->a:LD/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, LD/b;->c(Landroid/view/View;ILandroid/os/Bundle;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final sendAccessibilityEvent(Landroid/view/View;I)V
    .locals 1

    .line 1
    iget-object v0, p0, LD/a;->a:LD/b;

    .line 2
    .line 3
    iget-object v0, v0, LD/b;->a:Landroid/view/View$AccessibilityDelegate;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->sendAccessibilityEvent(Landroid/view/View;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, LD/a;->a:LD/b;

    .line 2
    .line 3
    iget-object v0, v0, LD/b;->a:Landroid/view/View$AccessibilityDelegate;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

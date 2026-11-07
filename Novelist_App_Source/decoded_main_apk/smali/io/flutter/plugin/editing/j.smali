.class public final Lio/flutter/plugin/editing/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/editing/e;


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Landroid/view/inputmethod/InputMethodManager;

.field public final c:Landroid/view/autofill/AutofillManager;

.field public final d:LA/c;

.field public e:LD/n;

.field public f:LB1/t;

.field public g:Landroid/util/SparseArray;

.field public h:Lio/flutter/plugin/editing/f;

.field public i:Z

.field public j:Landroid/view/inputmethod/InputConnection;

.field public final k:Lio/flutter/plugin/platform/s;

.field public final l:Lio/flutter/plugin/platform/r;

.field public m:Landroid/graphics/Rect;

.field public final n:Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;

.field public o:LB1/v;

.field public p:Z


# direct methods
.method public constructor <init>(Landroid/view/View;LA/c;LH0/i;Lio/flutter/plugin/platform/s;Lio/flutter/plugin/platform/r;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance p3, LD/n;

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {p3, v0, v1}, LD/n;-><init>(II)V

    .line 9
    .line 10
    .line 11
    iput-object p3, p0, Lio/flutter/plugin/editing/j;->e:LD/n;

    .line 12
    .line 13
    iput-object p1, p0, Lio/flutter/plugin/editing/j;->a:Landroid/view/View;

    .line 14
    .line 15
    new-instance p3, Lio/flutter/plugin/editing/f;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p3, v0, p1}, Lio/flutter/plugin/editing/f;-><init>(LB1/v;Landroid/view/View;)V

    .line 19
    .line 20
    .line 21
    iput-object p3, p0, Lio/flutter/plugin/editing/j;->h:Lio/flutter/plugin/editing/f;

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    const-string v1, "input_method"

    .line 28
    .line 29
    invoke-virtual {p3, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    check-cast p3, Landroid/view/inputmethod/InputMethodManager;

    .line 34
    .line 35
    iput-object p3, p0, Lio/flutter/plugin/editing/j;->b:Landroid/view/inputmethod/InputMethodManager;

    .line 36
    .line 37
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 38
    .line 39
    const/16 v1, 0x1a

    .line 40
    .line 41
    if-lt p3, v1, :cond_0

    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-static {}, LB/a;->B()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-static {v1}, LB/a;->f(Ljava/lang/Object;)Landroid/view/autofill/AutofillManager;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    iput-object v1, p0, Lio/flutter/plugin/editing/j;->c:Landroid/view/autofill/AutofillManager;

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    iput-object v0, p0, Lio/flutter/plugin/editing/j;->c:Landroid/view/autofill/AutofillManager;

    .line 63
    .line 64
    :goto_0
    const/16 v1, 0x1e

    .line 65
    .line 66
    if-lt p3, v1, :cond_1

    .line 67
    .line 68
    new-instance p3, Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;

    .line 69
    .line 70
    invoke-direct {p3, p1}, Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;-><init>(Landroid/view/View;)V

    .line 71
    .line 72
    .line 73
    iput-object p3, p0, Lio/flutter/plugin/editing/j;->n:Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;

    .line 74
    .line 75
    invoke-virtual {p3}, Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;->install()V

    .line 76
    .line 77
    .line 78
    new-instance p1, LB1/a;

    .line 79
    .line 80
    const/16 v1, 0x11

    .line 81
    .line 82
    invoke-direct {p1, p0, v1}, LB1/a;-><init>(Ljava/lang/Object;I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p3, p1}, Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;->setImeVisibilityListener(Lio/flutter/plugin/editing/a;)V

    .line 86
    .line 87
    .line 88
    :cond_1
    iput-object p2, p0, Lio/flutter/plugin/editing/j;->d:LA/c;

    .line 89
    .line 90
    new-instance p1, LB1/g;

    .line 91
    .line 92
    const/16 p3, 0xd

    .line 93
    .line 94
    invoke-direct {p1, p0, p3}, LB1/g;-><init>(Ljava/lang/Object;I)V

    .line 95
    .line 96
    .line 97
    iput-object p1, p2, LA/c;->m:Ljava/lang/Object;

    .line 98
    .line 99
    iget-object p1, p2, LA/c;->l:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p1, LB1/s;

    .line 102
    .line 103
    const-string p2, "TextInputClient.requestExistingInputState"

    .line 104
    .line 105
    invoke-virtual {p1, p2, v0, v0}, LB1/s;->s(Ljava/lang/String;Ljava/lang/Object;LB1/o;)V

    .line 106
    .line 107
    .line 108
    iput-object p4, p0, Lio/flutter/plugin/editing/j;->k:Lio/flutter/plugin/platform/s;

    .line 109
    .line 110
    iput-object p0, p4, Lio/flutter/plugin/platform/s;->q:Lio/flutter/plugin/editing/j;

    .line 111
    .line 112
    iput-object p5, p0, Lio/flutter/plugin/editing/j;->l:Lio/flutter/plugin/platform/r;

    .line 113
    .line 114
    iput-object p0, p5, Lio/flutter/plugin/platform/r;->p:Lio/flutter/plugin/editing/j;

    .line 115
    .line 116
    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object v0, v1, Lio/flutter/plugin/editing/j;->h:Lio/flutter/plugin/editing/f;

    .line 6
    .line 7
    invoke-virtual {v0}, Lio/flutter/plugin/editing/f;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 12
    .line 13
    const/16 v3, 0x1a

    .line 14
    .line 15
    if-lt v2, v3, :cond_0

    .line 16
    .line 17
    iget-object v2, v1, Lio/flutter/plugin/editing/j;->c:Landroid/view/autofill/AutofillManager;

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    iget-object v3, v1, Lio/flutter/plugin/editing/j;->g:Landroid/util/SparseArray;

    .line 22
    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    iget-object v3, v1, Lio/flutter/plugin/editing/j;->f:LB1/t;

    .line 26
    .line 27
    iget-object v3, v3, LB1/t;->j:LB1/s;

    .line 28
    .line 29
    iget-object v3, v3, LB1/s;->k:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v3, Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-static {v0}, Lio/flutter/plugin/editing/i;->c(Ljava/lang/String;)Landroid/view/autofill/AutofillValue;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v4, v1, Lio/flutter/plugin/editing/j;->a:Landroid/view/View;

    .line 42
    .line 43
    invoke-static {v2, v4, v3, v0}, Lio/flutter/plugin/editing/i;->u(Landroid/view/autofill/AutofillManager;Landroid/view/View;ILandroid/view/autofill/AutofillValue;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    iget-object v0, v1, Lio/flutter/plugin/editing/j;->h:Lio/flutter/plugin/editing/f;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-static {v0}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    iget-object v0, v1, Lio/flutter/plugin/editing/j;->h:Lio/flutter/plugin/editing/f;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-static {v0}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    iget-object v0, v1, Lio/flutter/plugin/editing/j;->h:Lio/flutter/plugin/editing/f;

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-static {v0}, Landroid/view/inputmethod/BaseInputConnection;->getComposingSpanStart(Landroid/text/Spannable;)I

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    iget-object v0, v1, Lio/flutter/plugin/editing/j;->h:Lio/flutter/plugin/editing/f;

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-static {v0}, Landroid/view/inputmethod/BaseInputConnection;->getComposingSpanEnd(Landroid/text/Spannable;)I

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    iget-object v0, v1, Lio/flutter/plugin/editing/j;->h:Lio/flutter/plugin/editing/f;

    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    new-instance v2, Ljava/util/ArrayList;

    .line 88
    .line 89
    iget-object v0, v0, Lio/flutter/plugin/editing/f;->o:Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 95
    .line 96
    .line 97
    iget-object v0, v1, Lio/flutter/plugin/editing/j;->o:LB1/v;

    .line 98
    .line 99
    if-eqz v0, :cond_4

    .line 100
    .line 101
    iget-object v0, v1, Lio/flutter/plugin/editing/j;->h:Lio/flutter/plugin/editing/f;

    .line 102
    .line 103
    invoke-virtual {v0}, Lio/flutter/plugin/editing/f;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    iget-object v3, v1, Lio/flutter/plugin/editing/j;->o:LB1/v;

    .line 108
    .line 109
    iget-object v3, v3, LB1/v;->a:Ljava/lang/String;

    .line 110
    .line 111
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_1

    .line 116
    .line 117
    iget-object v0, v1, Lio/flutter/plugin/editing/j;->o:LB1/v;

    .line 118
    .line 119
    iget v3, v0, LB1/v;->b:I

    .line 120
    .line 121
    if-ne v4, v3, :cond_1

    .line 122
    .line 123
    iget v3, v0, LB1/v;->c:I

    .line 124
    .line 125
    if-ne v5, v3, :cond_1

    .line 126
    .line 127
    iget v3, v0, LB1/v;->d:I

    .line 128
    .line 129
    if-ne v6, v3, :cond_1

    .line 130
    .line 131
    iget v0, v0, LB1/v;->e:I

    .line 132
    .line 133
    if-ne v7, v0, :cond_1

    .line 134
    .line 135
    goto/16 :goto_3

    .line 136
    .line 137
    :cond_1
    iget-object v0, v1, Lio/flutter/plugin/editing/j;->h:Lio/flutter/plugin/editing/f;

    .line 138
    .line 139
    invoke-virtual {v0}, Lio/flutter/plugin/editing/f;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    iget-object v0, v1, Lio/flutter/plugin/editing/j;->f:LB1/t;

    .line 143
    .line 144
    iget-boolean v0, v0, LB1/t;->e:Z

    .line 145
    .line 146
    const/4 v3, 0x2

    .line 147
    iget-object v11, v1, Lio/flutter/plugin/editing/j;->d:LA/c;

    .line 148
    .line 149
    if-eqz v0, :cond_3

    .line 150
    .line 151
    iget-object v0, v1, Lio/flutter/plugin/editing/j;->e:LD/n;

    .line 152
    .line 153
    iget v12, v0, LD/n;->c:I

    .line 154
    .line 155
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 159
    .line 160
    .line 161
    new-instance v13, Ljava/util/HashMap;

    .line 162
    .line 163
    invoke-direct {v13}, Ljava/util/HashMap;-><init>()V

    .line 164
    .line 165
    .line 166
    new-instance v14, Lorg/json/JSONArray;

    .line 167
    .line 168
    invoke-direct {v14}, Lorg/json/JSONArray;-><init>()V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 172
    .line 173
    .line 174
    move-result v15

    .line 175
    const/4 v0, 0x0

    .line 176
    :goto_0
    if-ge v0, v15, :cond_2

    .line 177
    .line 178
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v16

    .line 182
    add-int/lit8 v17, v0, 0x1

    .line 183
    .line 184
    move-object/from16 v0, v16

    .line 185
    .line 186
    check-cast v0, Lio/flutter/plugin/editing/h;

    .line 187
    .line 188
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    const/16 p1, 0x1

    .line 192
    .line 193
    new-instance v8, Lorg/json/JSONObject;

    .line 194
    .line 195
    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 196
    .line 197
    .line 198
    const/16 v16, 0x0

    .line 199
    .line 200
    :try_start_0
    const-string v9, "oldText"

    .line 201
    .line 202
    iget-object v10, v0, Lio/flutter/plugin/editing/h;->a:Ljava/lang/CharSequence;

    .line 203
    .line 204
    invoke-interface {v10}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v10

    .line 208
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 209
    .line 210
    .line 211
    const-string v9, "deltaText"

    .line 212
    .line 213
    iget-object v10, v0, Lio/flutter/plugin/editing/h;->b:Ljava/lang/CharSequence;

    .line 214
    .line 215
    invoke-interface {v10}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v10

    .line 219
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 220
    .line 221
    .line 222
    const-string v9, "deltaStart"

    .line 223
    .line 224
    iget v10, v0, Lio/flutter/plugin/editing/h;->c:I

    .line 225
    .line 226
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 227
    .line 228
    .line 229
    const-string v9, "deltaEnd"

    .line 230
    .line 231
    iget v10, v0, Lio/flutter/plugin/editing/h;->d:I

    .line 232
    .line 233
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 234
    .line 235
    .line 236
    const-string v9, "selectionBase"

    .line 237
    .line 238
    iget v10, v0, Lio/flutter/plugin/editing/h;->e:I

    .line 239
    .line 240
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 241
    .line 242
    .line 243
    const-string v9, "selectionExtent"

    .line 244
    .line 245
    iget v10, v0, Lio/flutter/plugin/editing/h;->f:I

    .line 246
    .line 247
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 248
    .line 249
    .line 250
    const-string v9, "composingBase"

    .line 251
    .line 252
    iget v10, v0, Lio/flutter/plugin/editing/h;->g:I

    .line 253
    .line 254
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 255
    .line 256
    .line 257
    const-string v9, "composingExtent"

    .line 258
    .line 259
    iget v0, v0, Lio/flutter/plugin/editing/h;->h:I

    .line 260
    .line 261
    invoke-virtual {v8, v9, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 262
    .line 263
    .line 264
    goto :goto_1

    .line 265
    :catch_0
    move-exception v0

    .line 266
    new-instance v9, Ljava/lang/StringBuilder;

    .line 267
    .line 268
    const-string v10, "unable to create JSONObject: "

    .line 269
    .line 270
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    const-string v9, "TextEditingDelta"

    .line 281
    .line 282
    invoke-static {v9, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 283
    .line 284
    .line 285
    :goto_1
    invoke-virtual {v14, v8}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 286
    .line 287
    .line 288
    move/from16 v0, v17

    .line 289
    .line 290
    goto :goto_0

    .line 291
    :cond_2
    const/16 p1, 0x1

    .line 292
    .line 293
    const/16 v16, 0x0

    .line 294
    .line 295
    const-string v0, "deltas"

    .line 296
    .line 297
    invoke-virtual {v13, v0, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    iget-object v0, v11, LA/c;->l:Ljava/lang/Object;

    .line 301
    .line 302
    check-cast v0, LB1/s;

    .line 303
    .line 304
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    new-array v3, v3, [Ljava/io/Serializable;

    .line 309
    .line 310
    aput-object v2, v3, v16

    .line 311
    .line 312
    aput-object v13, v3, p1

    .line 313
    .line 314
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 315
    .line 316
    .line 317
    move-result-object v2

    .line 318
    const-string v3, "TextInputClient.updateEditingStateWithDeltas"

    .line 319
    .line 320
    const/4 v8, 0x0

    .line 321
    invoke-virtual {v0, v3, v2, v8}, LB1/s;->s(Ljava/lang/String;Ljava/lang/Object;LB1/o;)V

    .line 322
    .line 323
    .line 324
    iget-object v0, v1, Lio/flutter/plugin/editing/j;->h:Lio/flutter/plugin/editing/f;

    .line 325
    .line 326
    iget-object v0, v0, Lio/flutter/plugin/editing/f;->o:Ljava/util/ArrayList;

    .line 327
    .line 328
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 329
    .line 330
    .line 331
    goto :goto_2

    .line 332
    :cond_3
    const/16 p1, 0x1

    .line 333
    .line 334
    const/16 v16, 0x0

    .line 335
    .line 336
    iget-object v0, v1, Lio/flutter/plugin/editing/j;->e:LD/n;

    .line 337
    .line 338
    iget v0, v0, LD/n;->c:I

    .line 339
    .line 340
    iget-object v2, v1, Lio/flutter/plugin/editing/j;->h:Lio/flutter/plugin/editing/f;

    .line 341
    .line 342
    invoke-virtual {v2}, Lio/flutter/plugin/editing/f;->toString()Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v2

    .line 346
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 347
    .line 348
    .line 349
    invoke-static {v2, v4, v5, v6, v7}, LA/c;->j(Ljava/lang/String;IIII)Ljava/util/HashMap;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    iget-object v8, v11, LA/c;->l:Ljava/lang/Object;

    .line 354
    .line 355
    check-cast v8, LB1/s;

    .line 356
    .line 357
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    new-array v3, v3, [Ljava/io/Serializable;

    .line 362
    .line 363
    aput-object v0, v3, v16

    .line 364
    .line 365
    aput-object v2, v3, p1

    .line 366
    .line 367
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    const-string v2, "TextInputClient.updateEditingState"

    .line 372
    .line 373
    const/4 v3, 0x0

    .line 374
    invoke-virtual {v8, v2, v0, v3}, LB1/s;->s(Ljava/lang/String;Ljava/lang/Object;LB1/o;)V

    .line 375
    .line 376
    .line 377
    :goto_2
    new-instance v2, LB1/v;

    .line 378
    .line 379
    iget-object v0, v1, Lio/flutter/plugin/editing/j;->h:Lio/flutter/plugin/editing/f;

    .line 380
    .line 381
    invoke-virtual {v0}, Lio/flutter/plugin/editing/f;->toString()Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v3

    .line 385
    invoke-direct/range {v2 .. v7}, LB1/v;-><init>(Ljava/lang/String;IIII)V

    .line 386
    .line 387
    .line 388
    iput-object v2, v1, Lio/flutter/plugin/editing/j;->o:LB1/v;

    .line 389
    .line 390
    return-void

    .line 391
    :cond_4
    :goto_3
    iget-object v0, v1, Lio/flutter/plugin/editing/j;->h:Lio/flutter/plugin/editing/f;

    .line 392
    .line 393
    iget-object v0, v0, Lio/flutter/plugin/editing/f;->o:Ljava/util/ArrayList;

    .line 394
    .line 395
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 396
    .line 397
    .line 398
    return-void
.end method

.method public final b(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/editing/j;->e:LD/n;

    .line 2
    .line 3
    iget v1, v0, LD/n;->b:I

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    if-eq v1, v2, :cond_0

    .line 7
    .line 8
    const/4 v2, 0x4

    .line 9
    if-ne v1, v2, :cond_1

    .line 10
    .line 11
    :cond_0
    iget v0, v0, LD/n;->c:I

    .line 12
    .line 13
    if-ne v0, p1, :cond_1

    .line 14
    .line 15
    new-instance p1, LD/n;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-direct {p1, v0, v1}, LD/n;-><init>(II)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lio/flutter/plugin/editing/j;->e:LD/n;

    .line 23
    .line 24
    invoke-virtual {p0}, Lio/flutter/plugin/editing/j;->d()V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lio/flutter/plugin/editing/j;->a:Landroid/view/View;

    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/view/View;->getApplicationWindowToken()Landroid/os/IBinder;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v2, p0, Lio/flutter/plugin/editing/j;->b:Landroid/view/inputmethod/InputMethodManager;

    .line 34
    .line 35
    invoke-virtual {v2, v0, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, p1}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    .line 39
    .line 40
    .line 41
    iput-boolean v1, p0, Lio/flutter/plugin/editing/j;->i:Z

    .line 42
    .line 43
    :cond_1
    return-void
.end method

.method public final c()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/editing/j;->k:Lio/flutter/plugin/platform/s;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-object v1, v0, Lio/flutter/plugin/platform/s;->q:Lio/flutter/plugin/editing/j;

    .line 5
    .line 6
    iget-object v0, p0, Lio/flutter/plugin/editing/j;->l:Lio/flutter/plugin/platform/r;

    .line 7
    .line 8
    iput-object v1, v0, Lio/flutter/plugin/platform/r;->p:Lio/flutter/plugin/editing/j;

    .line 9
    .line 10
    iget-object v0, p0, Lio/flutter/plugin/editing/j;->d:LA/c;

    .line 11
    .line 12
    iput-object v1, v0, LA/c;->m:Ljava/lang/Object;

    .line 13
    .line 14
    invoke-virtual {p0}, Lio/flutter/plugin/editing/j;->d()V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lio/flutter/plugin/editing/j;->h:Lio/flutter/plugin/editing/f;

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Lio/flutter/plugin/editing/f;->e(Lio/flutter/plugin/editing/e;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lio/flutter/plugin/editing/j;->n:Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {v0}, Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;->remove()V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method public final d()V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lio/flutter/plugin/editing/j;->c:Landroid/view/autofill/AutofillManager;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lio/flutter/plugin/editing/j;->f:LB1/t;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v1, v1, LB1/t;->j:LB1/s;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget-object v2, p0, Lio/flutter/plugin/editing/j;->g:Landroid/util/SparseArray;

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    iget-object v1, v1, LB1/s;->k:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Ljava/lang/String;

    .line 26
    .line 27
    iget-object v2, p0, Lio/flutter/plugin/editing/j;->a:Landroid/view/View;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-static {v0, v2, v1}, LB/a;->w(Landroid/view/autofill/AutofillManager;Landroid/view/View;I)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method

.method public final e(LB1/t;)V
    .locals 7

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    if-eqz p1, :cond_5

    .line 9
    .line 10
    iget-object v0, p1, LB1/t;->j:LB1/s;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_1
    iget-object v1, p1, LB1/t;->l:[LB1/t;

    .line 16
    .line 17
    new-instance v2, Landroid/util/SparseArray;

    .line 18
    .line 19
    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v2, p0, Lio/flutter/plugin/editing/j;->g:Landroid/util/SparseArray;

    .line 23
    .line 24
    if-nez v1, :cond_2

    .line 25
    .line 26
    iget-object v0, v0, LB1/s;->k:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-virtual {v2, v0, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_2
    array-length p1, v1

    .line 39
    const/4 v0, 0x0

    .line 40
    :goto_0
    if-ge v0, p1, :cond_4

    .line 41
    .line 42
    aget-object v2, v1, v0

    .line 43
    .line 44
    iget-object v3, v2, LB1/t;->j:LB1/s;

    .line 45
    .line 46
    if-eqz v3, :cond_3

    .line 47
    .line 48
    iget-object v4, v3, LB1/s;->k:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v4, Ljava/lang/String;

    .line 51
    .line 52
    iget-object v5, p0, Lio/flutter/plugin/editing/j;->g:Landroid/util/SparseArray;

    .line 53
    .line 54
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    invoke-virtual {v5, v6, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object v2, p0, Lio/flutter/plugin/editing/j;->c:Landroid/view/autofill/AutofillManager;

    .line 62
    .line 63
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    iget-object v3, v3, LB1/s;->n:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v3, LB1/v;

    .line 70
    .line 71
    iget-object v3, v3, LB1/v;->a:Ljava/lang/String;

    .line 72
    .line 73
    invoke-static {v3}, Lio/flutter/plugin/editing/i;->b(Ljava/lang/CharSequence;)Landroid/view/autofill/AutofillValue;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    iget-object v5, p0, Lio/flutter/plugin/editing/j;->a:Landroid/view/View;

    .line 78
    .line 79
    invoke-static {v2, v5, v4, v3}, Lio/flutter/plugin/editing/i;->u(Landroid/view/autofill/AutofillManager;Landroid/view/View;ILandroid/view/autofill/AutofillValue;)V

    .line 80
    .line 81
    .line 82
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_4
    :goto_1
    return-void

    .line 86
    :cond_5
    :goto_2
    const/4 p1, 0x0

    .line 87
    iput-object p1, p0, Lio/flutter/plugin/editing/j;->g:Landroid/util/SparseArray;

    .line 88
    .line 89
    return-void
.end method

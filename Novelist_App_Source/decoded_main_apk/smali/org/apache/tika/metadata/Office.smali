.class public interface abstract Lorg/apache/tika/metadata/Office;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final AUTHOR:Lorg/apache/tika/metadata/Property;

.field public static final CHARACTER_COUNT:Lorg/apache/tika/metadata/Property;

.field public static final CHARACTER_COUNT_WITH_SPACES:Lorg/apache/tika/metadata/Property;

.field public static final COMMENT_PERSONS:Lorg/apache/tika/metadata/Property;

.field public static final CREATION_DATE:Lorg/apache/tika/metadata/Property;

.field public static final HAS_COMMENTS:Lorg/apache/tika/metadata/Property;

.field public static final HAS_HIDDEN_COLUMNS:Lorg/apache/tika/metadata/Property;

.field public static final HAS_HIDDEN_ROWS:Lorg/apache/tika/metadata/Property;

.field public static final HAS_HIDDEN_SHEETS:Lorg/apache/tika/metadata/Property;

.field public static final HAS_VERY_HIDDEN_SHEETS:Lorg/apache/tika/metadata/Property;

.field public static final HIDDEN_SHEET_NAMES:Lorg/apache/tika/metadata/Property;

.field public static final IMAGE_COUNT:Lorg/apache/tika/metadata/Property;

.field public static final INITIAL_AUTHOR:Lorg/apache/tika/metadata/Property;

.field public static final KEYWORDS:Lorg/apache/tika/metadata/Property;

.field public static final LAST_AUTHOR:Lorg/apache/tika/metadata/Property;

.field public static final LINE_COUNT:Lorg/apache/tika/metadata/Property;

.field public static final MAPI_FROM_REPRESENTING_EMAIL:Lorg/apache/tika/metadata/Property;

.field public static final MAPI_FROM_REPRESENTING_NAME:Lorg/apache/tika/metadata/Property;

.field public static final MAPI_IMPORTANCE:Lorg/apache/tika/metadata/Property;

.field public static final MAPI_IS_FLAGGED:Lorg/apache/tika/metadata/Property;

.field public static final MAPI_MESSAGE_CLASS:Lorg/apache/tika/metadata/Property;

.field public static final MAPI_MESSAGE_CLIENT_SUBMIT_TIME:Lorg/apache/tika/metadata/Property;

.field public static final MAPI_PRIORTY:Lorg/apache/tika/metadata/Property;

.field public static final MAPI_RECIPIENTS_STRING:Lorg/apache/tika/metadata/Property;

.field public static final MAPI_SENT_BY_SERVER_TYPE:Lorg/apache/tika/metadata/Property;

.field public static final NAMESPACE_URI_DOC_META:Ljava/lang/String; = "urn:oasis:names:tc:opendocument:xmlns:meta:1.0"

.field public static final OBJECT_COUNT:Lorg/apache/tika/metadata/Property;

.field public static final OCX_NAME:Lorg/apache/tika/metadata/Property;

.field public static final PAGE_COUNT:Lorg/apache/tika/metadata/Property;

.field public static final PARAGRAPH_COUNT:Lorg/apache/tika/metadata/Property;

.field public static final PREFIX_DOC_META:Ljava/lang/String; = "meta"

.field public static final PRINT_DATE:Lorg/apache/tika/metadata/Property;

.field public static final PROG_ID:Lorg/apache/tika/metadata/Property;

.field public static final PROTECTED_WORKSHEET:Lorg/apache/tika/metadata/Property;

.field public static final SAVE_DATE:Lorg/apache/tika/metadata/Property;

.field public static final SLIDE_COUNT:Lorg/apache/tika/metadata/Property;

.field public static final TABLE_COUNT:Lorg/apache/tika/metadata/Property;

.field public static final USER_DEFINED_METADATA_NAME_PREFIX:Ljava/lang/String; = "custom:"

.field public static final VERY_HIDDEN_SHEET_NAMES:Lorg/apache/tika/metadata/Property;

.field public static final WORD_COUNT:Lorg/apache/tika/metadata/Property;

.field public static final WORKBOOK_CODENAME:Lorg/apache/tika/metadata/Property;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    const-string v0, "meta:keyword"

    .line 2
    .line 3
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lorg/apache/tika/metadata/DublinCore;->SUBJECT:Lorg/apache/tika/metadata/Property;

    .line 8
    .line 9
    filled-new-array {v1}, [Lorg/apache/tika/metadata/Property;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v0, v1}, Lorg/apache/tika/metadata/Property;->composite(Lorg/apache/tika/metadata/Property;[Lorg/apache/tika/metadata/Property;)Lorg/apache/tika/metadata/Property;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lorg/apache/tika/metadata/Office;->KEYWORDS:Lorg/apache/tika/metadata/Property;

    .line 18
    .line 19
    const-string v0, "meta:initial-author"

    .line 20
    .line 21
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lorg/apache/tika/metadata/Office;->INITIAL_AUTHOR:Lorg/apache/tika/metadata/Property;

    .line 26
    .line 27
    const-string v0, "meta:last-author"

    .line 28
    .line 29
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Lorg/apache/tika/metadata/Office;->LAST_AUTHOR:Lorg/apache/tika/metadata/Property;

    .line 34
    .line 35
    const-string v0, "meta:author"

    .line 36
    .line 37
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lorg/apache/tika/metadata/Office;->AUTHOR:Lorg/apache/tika/metadata/Property;

    .line 42
    .line 43
    const-string v0, "meta:creation-date"

    .line 44
    .line 45
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalDate(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sput-object v0, Lorg/apache/tika/metadata/Office;->CREATION_DATE:Lorg/apache/tika/metadata/Property;

    .line 50
    .line 51
    const-string v0, "meta:save-date"

    .line 52
    .line 53
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalDate(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    sput-object v0, Lorg/apache/tika/metadata/Office;->SAVE_DATE:Lorg/apache/tika/metadata/Property;

    .line 58
    .line 59
    const-string v0, "meta:print-date"

    .line 60
    .line 61
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalDate(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sput-object v0, Lorg/apache/tika/metadata/Office;->PRINT_DATE:Lorg/apache/tika/metadata/Property;

    .line 66
    .line 67
    const-string v0, "meta:slide-count"

    .line 68
    .line 69
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    sput-object v0, Lorg/apache/tika/metadata/Office;->SLIDE_COUNT:Lorg/apache/tika/metadata/Property;

    .line 74
    .line 75
    const-string v0, "meta:page-count"

    .line 76
    .line 77
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    sput-object v0, Lorg/apache/tika/metadata/Office;->PAGE_COUNT:Lorg/apache/tika/metadata/Property;

    .line 82
    .line 83
    const-string v0, "meta:paragraph-count"

    .line 84
    .line 85
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    sput-object v0, Lorg/apache/tika/metadata/Office;->PARAGRAPH_COUNT:Lorg/apache/tika/metadata/Property;

    .line 90
    .line 91
    const-string v0, "meta:line-count"

    .line 92
    .line 93
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    sput-object v0, Lorg/apache/tika/metadata/Office;->LINE_COUNT:Lorg/apache/tika/metadata/Property;

    .line 98
    .line 99
    const-string v0, "meta:word-count"

    .line 100
    .line 101
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    sput-object v0, Lorg/apache/tika/metadata/Office;->WORD_COUNT:Lorg/apache/tika/metadata/Property;

    .line 106
    .line 107
    const-string v0, "meta:character-count"

    .line 108
    .line 109
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    sput-object v0, Lorg/apache/tika/metadata/Office;->CHARACTER_COUNT:Lorg/apache/tika/metadata/Property;

    .line 114
    .line 115
    const-string v0, "meta:character-count-with-spaces"

    .line 116
    .line 117
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    sput-object v0, Lorg/apache/tika/metadata/Office;->CHARACTER_COUNT_WITH_SPACES:Lorg/apache/tika/metadata/Property;

    .line 122
    .line 123
    const-string v0, "meta:table-count"

    .line 124
    .line 125
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    sput-object v0, Lorg/apache/tika/metadata/Office;->TABLE_COUNT:Lorg/apache/tika/metadata/Property;

    .line 130
    .line 131
    const-string v0, "meta:image-count"

    .line 132
    .line 133
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    sput-object v0, Lorg/apache/tika/metadata/Office;->IMAGE_COUNT:Lorg/apache/tika/metadata/Property;

    .line 138
    .line 139
    const-string v0, "meta:object-count"

    .line 140
    .line 141
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    sput-object v0, Lorg/apache/tika/metadata/Office;->OBJECT_COUNT:Lorg/apache/tika/metadata/Property;

    .line 146
    .line 147
    const-string v7, "UNKNOWN"

    .line 148
    .line 149
    const-string v8, "UNSPECIFIED"

    .line 150
    .line 151
    const-string v1, "APPOINTMENT"

    .line 152
    .line 153
    const-string v2, "CONTACT"

    .line 154
    .line 155
    const-string v3, "NOTE"

    .line 156
    .line 157
    const-string v4, "STICKY_NOTE"

    .line 158
    .line 159
    const-string v5, "POST"

    .line 160
    .line 161
    const-string v6, "TASK"

    .line 162
    .line 163
    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    const-string v1, "meta:mapi-message-class"

    .line 168
    .line 169
    invoke-static {v1, v0}, Lorg/apache/tika/metadata/Property;->internalClosedChoise(Ljava/lang/String;[Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    sput-object v0, Lorg/apache/tika/metadata/Office;->MAPI_MESSAGE_CLASS:Lorg/apache/tika/metadata/Property;

    .line 174
    .line 175
    const-string v0, "meta:mapi-sent-by-server-type"

    .line 176
    .line 177
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    sput-object v0, Lorg/apache/tika/metadata/Office;->MAPI_SENT_BY_SERVER_TYPE:Lorg/apache/tika/metadata/Property;

    .line 182
    .line 183
    const-string v0, "meta:mapi-from-representing-name"

    .line 184
    .line 185
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    sput-object v0, Lorg/apache/tika/metadata/Office;->MAPI_FROM_REPRESENTING_NAME:Lorg/apache/tika/metadata/Property;

    .line 190
    .line 191
    const-string v0, "meta:mapi-from-representing-email"

    .line 192
    .line 193
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    sput-object v0, Lorg/apache/tika/metadata/Office;->MAPI_FROM_REPRESENTING_EMAIL:Lorg/apache/tika/metadata/Property;

    .line 198
    .line 199
    const-string v0, "meta:mapi-msg-client-submit-time"

    .line 200
    .line 201
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalDate(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    sput-object v0, Lorg/apache/tika/metadata/Office;->MAPI_MESSAGE_CLIENT_SUBMIT_TIME:Lorg/apache/tika/metadata/Property;

    .line 206
    .line 207
    const-string v0, "msoffice:progID"

    .line 208
    .line 209
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    sput-object v0, Lorg/apache/tika/metadata/Office;->PROG_ID:Lorg/apache/tika/metadata/Property;

    .line 214
    .line 215
    const-string v0, "msoffice:ocxName"

    .line 216
    .line 217
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    sput-object v0, Lorg/apache/tika/metadata/Office;->OCX_NAME:Lorg/apache/tika/metadata/Property;

    .line 222
    .line 223
    const-string v0, "meta:mapi-recipients-string"

    .line 224
    .line 225
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    sput-object v0, Lorg/apache/tika/metadata/Office;->MAPI_RECIPIENTS_STRING:Lorg/apache/tika/metadata/Property;

    .line 230
    .line 231
    const-string v0, "meta:mapi-importance"

    .line 232
    .line 233
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    sput-object v1, Lorg/apache/tika/metadata/Office;->MAPI_IMPORTANCE:Lorg/apache/tika/metadata/Property;

    .line 238
    .line 239
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    sput-object v0, Lorg/apache/tika/metadata/Office;->MAPI_PRIORTY:Lorg/apache/tika/metadata/Property;

    .line 244
    .line 245
    const-string v0, "meta:mapi-is-flagged"

    .line 246
    .line 247
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalBoolean(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    sput-object v0, Lorg/apache/tika/metadata/Office;->MAPI_IS_FLAGGED:Lorg/apache/tika/metadata/Property;

    .line 252
    .line 253
    const-string v0, "msoffice:excel:has-hidden-sheets"

    .line 254
    .line 255
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalBoolean(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    sput-object v0, Lorg/apache/tika/metadata/Office;->HAS_HIDDEN_SHEETS:Lorg/apache/tika/metadata/Property;

    .line 260
    .line 261
    const-string v0, "msoffice:excel:has-hidden-cols"

    .line 262
    .line 263
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalBoolean(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    sput-object v0, Lorg/apache/tika/metadata/Office;->HAS_HIDDEN_COLUMNS:Lorg/apache/tika/metadata/Property;

    .line 268
    .line 269
    const-string v0, "msoffice:excel:has-hidden-rows"

    .line 270
    .line 271
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalBoolean(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    sput-object v0, Lorg/apache/tika/metadata/Office;->HAS_HIDDEN_ROWS:Lorg/apache/tika/metadata/Property;

    .line 276
    .line 277
    const-string v0, "msoffice:excel:has-very-hidden-sheets"

    .line 278
    .line 279
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalBoolean(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    sput-object v0, Lorg/apache/tika/metadata/Office;->HAS_VERY_HIDDEN_SHEETS:Lorg/apache/tika/metadata/Property;

    .line 284
    .line 285
    const-string v0, "msoffice:excel:hidden-sheet-names"

    .line 286
    .line 287
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    sput-object v0, Lorg/apache/tika/metadata/Office;->HIDDEN_SHEET_NAMES:Lorg/apache/tika/metadata/Property;

    .line 292
    .line 293
    const-string v0, "msoffice:excel:very-hidden-sheet-names"

    .line 294
    .line 295
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    sput-object v0, Lorg/apache/tika/metadata/Office;->VERY_HIDDEN_SHEET_NAMES:Lorg/apache/tika/metadata/Property;

    .line 300
    .line 301
    const-string v0, "msoffice:excel:protected-worksheet"

    .line 302
    .line 303
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalBoolean(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    sput-object v0, Lorg/apache/tika/metadata/Office;->PROTECTED_WORKSHEET:Lorg/apache/tika/metadata/Property;

    .line 308
    .line 309
    const-string v0, "msoffice:excel:workbook-codename"

    .line 310
    .line 311
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    sput-object v0, Lorg/apache/tika/metadata/Office;->WORKBOOK_CODENAME:Lorg/apache/tika/metadata/Property;

    .line 316
    .line 317
    const-string v0, "msoffice:has-comments"

    .line 318
    .line 319
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalBoolean(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    sput-object v0, Lorg/apache/tika/metadata/Office;->HAS_COMMENTS:Lorg/apache/tika/metadata/Property;

    .line 324
    .line 325
    const-string v0, "msoffice:comment-person-display-name"

    .line 326
    .line 327
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    sput-object v0, Lorg/apache/tika/metadata/Office;->COMMENT_PERSONS:Lorg/apache/tika/metadata/Property;

    .line 332
    .line 333
    return-void
.end method

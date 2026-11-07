.class public interface abstract Lorg/apache/tika/metadata/PDF;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ACTION_TRIGGER:Lorg/apache/tika/metadata/Property;

.field public static final ACTION_TRIGGERS:Lorg/apache/tika/metadata/Property;

.field public static final ACTION_TYPES:Lorg/apache/tika/metadata/Property;

.field public static final ANNOTATION_SUBTYPES:Lorg/apache/tika/metadata/Property;

.field public static final ANNOTATION_TYPES:Lorg/apache/tika/metadata/Property;

.field public static final ASSOCIATED_FILE_RELATIONSHIP:Lorg/apache/tika/metadata/Property;

.field public static final CHARACTERS_PER_PAGE:Lorg/apache/tika/metadata/Property;

.field public static final CONTAINS_DAMAGED_FONT:Lorg/apache/tika/metadata/Property;

.field public static final CONTAINS_NON_EMBEDDED_FONT:Lorg/apache/tika/metadata/Property;

.field public static final DOC_INFO_CREATED:Lorg/apache/tika/metadata/Property;

.field public static final DOC_INFO_CREATOR:Lorg/apache/tika/metadata/Property;

.field public static final DOC_INFO_CREATOR_TOOL:Lorg/apache/tika/metadata/Property;

.field public static final DOC_INFO_KEY_WORDS:Lorg/apache/tika/metadata/Property;

.field public static final DOC_INFO_MODIFICATION_DATE:Lorg/apache/tika/metadata/Property;

.field public static final DOC_INFO_PRODUCER:Lorg/apache/tika/metadata/Property;

.field public static final DOC_INFO_SUBJECT:Lorg/apache/tika/metadata/Property;

.field public static final DOC_INFO_TITLE:Lorg/apache/tika/metadata/Property;

.field public static final DOC_INFO_TRAPPED:Lorg/apache/tika/metadata/Property;

.field public static final EMBEDDED_FILE_ANNOTATION_TYPE:Lorg/apache/tika/metadata/Property;

.field public static final EMBEDDED_FILE_DESCRIPTION:Lorg/apache/tika/metadata/Property;

.field public static final EMBEDDED_FILE_SUBTYPE:Lorg/apache/tika/metadata/Property;

.field public static final EOF_OFFSETS:Lorg/apache/tika/metadata/Property;

.field public static final HAS_3D:Lorg/apache/tika/metadata/Property;

.field public static final HAS_ACROFORM_FIELDS:Lorg/apache/tika/metadata/Property;

.field public static final HAS_COLLECTION:Lorg/apache/tika/metadata/Property;

.field public static final HAS_MARKED_CONTENT:Lorg/apache/tika/metadata/Property;

.field public static final HAS_XFA:Lorg/apache/tika/metadata/Property;

.field public static final HAS_XMP:Lorg/apache/tika/metadata/Property;

.field public static final ILLUSTRATOR_TYPE:Lorg/apache/tika/metadata/Property;

.field public static final INCREMENTAL_UPDATE_NUMBER:Lorg/apache/tika/metadata/Property;

.field public static final IS_ENCRYPTED:Lorg/apache/tika/metadata/Property;

.field public static final NUM_3D_ANNOTATIONS:Lorg/apache/tika/metadata/Property;

.field public static final OCR_PAGE_COUNT:Lorg/apache/tika/metadata/Property;

.field public static final OVERALL_PERCENTAGE_UNMAPPED_UNICODE_CHARS:Lorg/apache/tika/metadata/Property;

.field public static final PDFAID_CONFORMANCE:Lorg/apache/tika/metadata/Property;

.field public static final PDFAID_PART:Lorg/apache/tika/metadata/Property;

.field public static final PDFAID_PREFIX:Ljava/lang/String; = "pdfaid:"

.field public static final PDFA_PREFIX:Ljava/lang/String; = "pdfa:"

.field public static final PDFA_VERSION:Lorg/apache/tika/metadata/Property;

.field public static final PDFUAID_PART:Lorg/apache/tika/metadata/Property;

.field public static final PDFVT_MODIFIED:Lorg/apache/tika/metadata/Property;

.field public static final PDFVT_VERSION:Lorg/apache/tika/metadata/Property;

.field public static final PDFXID_VERSION:Lorg/apache/tika/metadata/Property;

.field public static final PDFX_CONFORMANCE:Lorg/apache/tika/metadata/Property;

.field public static final PDFX_VERSION:Lorg/apache/tika/metadata/Property;

.field public static final PDF_DOC_INFO_CUSTOM_PREFIX:Ljava/lang/String; = "pdf:docinfo:custom:"

.field public static final PDF_DOC_INFO_PREFIX:Ljava/lang/String; = "pdf:docinfo:"

.field public static final PDF_EXTENSION_VERSION:Lorg/apache/tika/metadata/Property;

.field public static final PDF_INCREMENTAL_UPDATE_COUNT:Lorg/apache/tika/metadata/Property;

.field public static final PDF_PREFIX:Ljava/lang/String; = "pdf:"

.field public static final PDF_VERSION:Lorg/apache/tika/metadata/Property;

.field public static final PRODUCER:Lorg/apache/tika/metadata/Property;

.field public static final TOTAL_UNMAPPED_UNICODE_CHARS:Lorg/apache/tika/metadata/Property;

.field public static final UNMAPPED_UNICODE_CHARS_PER_PAGE:Lorg/apache/tika/metadata/Property;

.field public static final XMP_LOCATION:Lorg/apache/tika/metadata/Property;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "pdf:eofOffsets"

    .line 2
    .line 3
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalRealSeq(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lorg/apache/tika/metadata/PDF;->EOF_OFFSETS:Lorg/apache/tika/metadata/Property;

    .line 8
    .line 9
    const-string v0, "pdf:docinfo:created"

    .line 10
    .line 11
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalDate(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lorg/apache/tika/metadata/PDF;->DOC_INFO_CREATED:Lorg/apache/tika/metadata/Property;

    .line 16
    .line 17
    const-string v0, "pdf:docinfo:creator"

    .line 18
    .line 19
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lorg/apache/tika/metadata/PDF;->DOC_INFO_CREATOR:Lorg/apache/tika/metadata/Property;

    .line 24
    .line 25
    const-string v0, "pdf:docinfo:creator_tool"

    .line 26
    .line 27
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lorg/apache/tika/metadata/PDF;->DOC_INFO_CREATOR_TOOL:Lorg/apache/tika/metadata/Property;

    .line 32
    .line 33
    const-string v0, "pdf:docinfo:modified"

    .line 34
    .line 35
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalDate(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lorg/apache/tika/metadata/PDF;->DOC_INFO_MODIFICATION_DATE:Lorg/apache/tika/metadata/Property;

    .line 40
    .line 41
    const-string v0, "pdf:docinfo:keywords"

    .line 42
    .line 43
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lorg/apache/tika/metadata/PDF;->DOC_INFO_KEY_WORDS:Lorg/apache/tika/metadata/Property;

    .line 48
    .line 49
    const-string v0, "pdf:docinfo:producer"

    .line 50
    .line 51
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, Lorg/apache/tika/metadata/PDF;->DOC_INFO_PRODUCER:Lorg/apache/tika/metadata/Property;

    .line 56
    .line 57
    const-string v0, "pdf:docinfo:subject"

    .line 58
    .line 59
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sput-object v0, Lorg/apache/tika/metadata/PDF;->DOC_INFO_SUBJECT:Lorg/apache/tika/metadata/Property;

    .line 64
    .line 65
    const-string v0, "pdf:docinfo:title"

    .line 66
    .line 67
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    sput-object v0, Lorg/apache/tika/metadata/PDF;->DOC_INFO_TITLE:Lorg/apache/tika/metadata/Property;

    .line 72
    .line 73
    const-string v0, "pdf:docinfo:trapped"

    .line 74
    .line 75
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    sput-object v0, Lorg/apache/tika/metadata/PDF;->DOC_INFO_TRAPPED:Lorg/apache/tika/metadata/Property;

    .line 80
    .line 81
    const-string v0, "pdf:PDFVersion"

    .line 82
    .line 83
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalRational(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    sput-object v0, Lorg/apache/tika/metadata/PDF;->PDF_VERSION:Lorg/apache/tika/metadata/Property;

    .line 88
    .line 89
    const-string v0, "pdfa:PDFVersion"

    .line 90
    .line 91
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalRational(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    sput-object v0, Lorg/apache/tika/metadata/PDF;->PDFA_VERSION:Lorg/apache/tika/metadata/Property;

    .line 96
    .line 97
    const-string v0, "pdf:PDFExtensionVersion"

    .line 98
    .line 99
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalRational(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    sput-object v0, Lorg/apache/tika/metadata/PDF;->PDF_EXTENSION_VERSION:Lorg/apache/tika/metadata/Property;

    .line 104
    .line 105
    const-string v0, "pdfaid:conformance"

    .line 106
    .line 107
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    sput-object v0, Lorg/apache/tika/metadata/PDF;->PDFAID_CONFORMANCE:Lorg/apache/tika/metadata/Property;

    .line 112
    .line 113
    const-string v0, "pdfaid:part"

    .line 114
    .line 115
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    sput-object v0, Lorg/apache/tika/metadata/PDF;->PDFAID_PART:Lorg/apache/tika/metadata/Property;

    .line 120
    .line 121
    const-string v0, "pdfuaid:part"

    .line 122
    .line 123
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    sput-object v0, Lorg/apache/tika/metadata/PDF;->PDFUAID_PART:Lorg/apache/tika/metadata/Property;

    .line 128
    .line 129
    const-string v0, "pdfvt:version"

    .line 130
    .line 131
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    sput-object v0, Lorg/apache/tika/metadata/PDF;->PDFVT_VERSION:Lorg/apache/tika/metadata/Property;

    .line 136
    .line 137
    const-string v0, "pdfvt:modified"

    .line 138
    .line 139
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalDate(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    sput-object v0, Lorg/apache/tika/metadata/PDF;->PDFVT_MODIFIED:Lorg/apache/tika/metadata/Property;

    .line 144
    .line 145
    const-string v0, "pdfxid:version"

    .line 146
    .line 147
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    sput-object v0, Lorg/apache/tika/metadata/PDF;->PDFXID_VERSION:Lorg/apache/tika/metadata/Property;

    .line 152
    .line 153
    const-string v0, "pdfx:version"

    .line 154
    .line 155
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    sput-object v0, Lorg/apache/tika/metadata/PDF;->PDFX_VERSION:Lorg/apache/tika/metadata/Property;

    .line 160
    .line 161
    const-string v0, "pdfx:conformance"

    .line 162
    .line 163
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    sput-object v0, Lorg/apache/tika/metadata/PDF;->PDFX_CONFORMANCE:Lorg/apache/tika/metadata/Property;

    .line 168
    .line 169
    const-string v0, "pdf:illustrator:type"

    .line 170
    .line 171
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    sput-object v0, Lorg/apache/tika/metadata/PDF;->ILLUSTRATOR_TYPE:Lorg/apache/tika/metadata/Property;

    .line 176
    .line 177
    const-string v0, "pdf:encrypted"

    .line 178
    .line 179
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalBoolean(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    sput-object v0, Lorg/apache/tika/metadata/PDF;->IS_ENCRYPTED:Lorg/apache/tika/metadata/Property;

    .line 184
    .line 185
    const-string v0, "pdf:producer"

    .line 186
    .line 187
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    sput-object v0, Lorg/apache/tika/metadata/PDF;->PRODUCER:Lorg/apache/tika/metadata/Property;

    .line 192
    .line 193
    const-string v0, "pdf:actionTrigger"

    .line 194
    .line 195
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    sput-object v0, Lorg/apache/tika/metadata/PDF;->ACTION_TRIGGER:Lorg/apache/tika/metadata/Property;

    .line 200
    .line 201
    const-string v0, "pdf:actionTriggers"

    .line 202
    .line 203
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    sput-object v0, Lorg/apache/tika/metadata/PDF;->ACTION_TRIGGERS:Lorg/apache/tika/metadata/Property;

    .line 208
    .line 209
    const-string v0, "pdf:actionTypes"

    .line 210
    .line 211
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    sput-object v0, Lorg/apache/tika/metadata/PDF;->ACTION_TYPES:Lorg/apache/tika/metadata/Property;

    .line 216
    .line 217
    const-string v0, "pdf:charsPerPage"

    .line 218
    .line 219
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalIntegerSequence(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    sput-object v0, Lorg/apache/tika/metadata/PDF;->CHARACTERS_PER_PAGE:Lorg/apache/tika/metadata/Property;

    .line 224
    .line 225
    const-string v0, "pdf:unmappedUnicodeCharsPerPage"

    .line 226
    .line 227
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalIntegerSequence(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    sput-object v0, Lorg/apache/tika/metadata/PDF;->UNMAPPED_UNICODE_CHARS_PER_PAGE:Lorg/apache/tika/metadata/Property;

    .line 232
    .line 233
    const-string v0, "pdf:totalUnmappedUnicodeChars"

    .line 234
    .line 235
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    sput-object v0, Lorg/apache/tika/metadata/PDF;->TOTAL_UNMAPPED_UNICODE_CHARS:Lorg/apache/tika/metadata/Property;

    .line 240
    .line 241
    const-string v0, "pdf:overallPercentageUnmappedUnicodeChars"

    .line 242
    .line 243
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalReal(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    sput-object v0, Lorg/apache/tika/metadata/PDF;->OVERALL_PERCENTAGE_UNMAPPED_UNICODE_CHARS:Lorg/apache/tika/metadata/Property;

    .line 248
    .line 249
    const-string v0, "pdf:containsDamagedFont"

    .line 250
    .line 251
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalBoolean(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    sput-object v0, Lorg/apache/tika/metadata/PDF;->CONTAINS_DAMAGED_FONT:Lorg/apache/tika/metadata/Property;

    .line 256
    .line 257
    const-string v0, "pdf:containsNonEmbeddedFont"

    .line 258
    .line 259
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalBoolean(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    sput-object v0, Lorg/apache/tika/metadata/PDF;->CONTAINS_NON_EMBEDDED_FONT:Lorg/apache/tika/metadata/Property;

    .line 264
    .line 265
    const-string v0, "pdf:hasXFA"

    .line 266
    .line 267
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalBoolean(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    sput-object v0, Lorg/apache/tika/metadata/PDF;->HAS_XFA:Lorg/apache/tika/metadata/Property;

    .line 272
    .line 273
    const-string v0, "pdf:hasXMP"

    .line 274
    .line 275
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalBoolean(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    sput-object v0, Lorg/apache/tika/metadata/PDF;->HAS_XMP:Lorg/apache/tika/metadata/Property;

    .line 280
    .line 281
    const-string v0, "pdf:xmpLocation"

    .line 282
    .line 283
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    sput-object v0, Lorg/apache/tika/metadata/PDF;->XMP_LOCATION:Lorg/apache/tika/metadata/Property;

    .line 288
    .line 289
    const-string v0, "pdf:hasAcroFormFields"

    .line 290
    .line 291
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalBoolean(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    sput-object v0, Lorg/apache/tika/metadata/PDF;->HAS_ACROFORM_FIELDS:Lorg/apache/tika/metadata/Property;

    .line 296
    .line 297
    const-string v0, "pdf:hasMarkedContent"

    .line 298
    .line 299
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalBoolean(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    sput-object v0, Lorg/apache/tika/metadata/PDF;->HAS_MARKED_CONTENT:Lorg/apache/tika/metadata/Property;

    .line 304
    .line 305
    const-string v0, "pdf:hasCollection"

    .line 306
    .line 307
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalBoolean(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    sput-object v0, Lorg/apache/tika/metadata/PDF;->HAS_COLLECTION:Lorg/apache/tika/metadata/Property;

    .line 312
    .line 313
    const-string v0, "pdf:embeddedFileDescription"

    .line 314
    .line 315
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    sput-object v0, Lorg/apache/tika/metadata/PDF;->EMBEDDED_FILE_DESCRIPTION:Lorg/apache/tika/metadata/Property;

    .line 320
    .line 321
    const-string v0, "pdf:embeddedFileAnnotationType"

    .line 322
    .line 323
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    sput-object v0, Lorg/apache/tika/metadata/PDF;->EMBEDDED_FILE_ANNOTATION_TYPE:Lorg/apache/tika/metadata/Property;

    .line 328
    .line 329
    const-string v0, "pdf:embeddedFileSubtype"

    .line 330
    .line 331
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    sput-object v0, Lorg/apache/tika/metadata/PDF;->EMBEDDED_FILE_SUBTYPE:Lorg/apache/tika/metadata/Property;

    .line 336
    .line 337
    const-string v0, "pdf:has3D"

    .line 338
    .line 339
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalBoolean(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    sput-object v0, Lorg/apache/tika/metadata/PDF;->HAS_3D:Lorg/apache/tika/metadata/Property;

    .line 344
    .line 345
    const-string v0, "pdf:annotationTypes"

    .line 346
    .line 347
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    sput-object v0, Lorg/apache/tika/metadata/PDF;->ANNOTATION_TYPES:Lorg/apache/tika/metadata/Property;

    .line 352
    .line 353
    const-string v0, "pdf:annotationSubtypes"

    .line 354
    .line 355
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    sput-object v0, Lorg/apache/tika/metadata/PDF;->ANNOTATION_SUBTYPES:Lorg/apache/tika/metadata/Property;

    .line 360
    .line 361
    const-string v0, "pdf:num3DAnnotations"

    .line 362
    .line 363
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    sput-object v0, Lorg/apache/tika/metadata/PDF;->NUM_3D_ANNOTATIONS:Lorg/apache/tika/metadata/Property;

    .line 368
    .line 369
    const-string v0, "pdf:associatedFileRelationship"

    .line 370
    .line 371
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    sput-object v0, Lorg/apache/tika/metadata/PDF;->ASSOCIATED_FILE_RELATIONSHIP:Lorg/apache/tika/metadata/Property;

    .line 376
    .line 377
    const-string v0, "pdf:incrementalUpdateNumber"

    .line 378
    .line 379
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    sget-object v1, Lorg/apache/tika/metadata/TikaCoreProperties;->VERSION_NUMBER:Lorg/apache/tika/metadata/Property;

    .line 384
    .line 385
    filled-new-array {v1}, [Lorg/apache/tika/metadata/Property;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    invoke-static {v0, v1}, Lorg/apache/tika/metadata/Property;->composite(Lorg/apache/tika/metadata/Property;[Lorg/apache/tika/metadata/Property;)Lorg/apache/tika/metadata/Property;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    sput-object v0, Lorg/apache/tika/metadata/PDF;->INCREMENTAL_UPDATE_NUMBER:Lorg/apache/tika/metadata/Property;

    .line 394
    .line 395
    const-string v0, "pdf:incrementalUpdateCount"

    .line 396
    .line 397
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    sget-object v1, Lorg/apache/tika/metadata/TikaCoreProperties;->VERSION_COUNT:Lorg/apache/tika/metadata/Property;

    .line 402
    .line 403
    filled-new-array {v1}, [Lorg/apache/tika/metadata/Property;

    .line 404
    .line 405
    .line 406
    move-result-object v1

    .line 407
    invoke-static {v0, v1}, Lorg/apache/tika/metadata/Property;->composite(Lorg/apache/tika/metadata/Property;[Lorg/apache/tika/metadata/Property;)Lorg/apache/tika/metadata/Property;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    sput-object v0, Lorg/apache/tika/metadata/PDF;->PDF_INCREMENTAL_UPDATE_COUNT:Lorg/apache/tika/metadata/Property;

    .line 412
    .line 413
    const-string v0, "pdf:ocrPageCount"

    .line 414
    .line 415
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    sput-object v0, Lorg/apache/tika/metadata/PDF;->OCR_PAGE_COUNT:Lorg/apache/tika/metadata/Property;

    .line 420
    .line 421
    return-void
.end method

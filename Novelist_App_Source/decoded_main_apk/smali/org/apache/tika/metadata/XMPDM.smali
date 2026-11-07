.class public interface abstract Lorg/apache/tika/metadata/XMPDM;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/tika/metadata/XMPDM$ChannelTypePropertyConverter;
    }
.end annotation


# static fields
.field public static final ABS_PEAK_AUDIO_FILE_PATH:Lorg/apache/tika/metadata/Property;

.field public static final ALBUM:Lorg/apache/tika/metadata/Property;

.field public static final ALBUM_ARTIST:Lorg/apache/tika/metadata/Property;

.field public static final ALT_TAPE_NAME:Lorg/apache/tika/metadata/Property;

.field public static final ARTIST:Lorg/apache/tika/metadata/Property;

.field public static final AUDIO_CHANNEL_TYPE:Lorg/apache/tika/metadata/Property;

.field public static final AUDIO_COMPRESSOR:Lorg/apache/tika/metadata/Property;

.field public static final AUDIO_MOD_DATE:Lorg/apache/tika/metadata/Property;

.field public static final AUDIO_SAMPLE_RATE:Lorg/apache/tika/metadata/Property;

.field public static final AUDIO_SAMPLE_TYPE:Lorg/apache/tika/metadata/Property;

.field public static final COMPILATION:Lorg/apache/tika/metadata/Property;

.field public static final COMPOSER:Lorg/apache/tika/metadata/Property;

.field public static final COPYRIGHT:Lorg/apache/tika/metadata/Property;

.field public static final DISC_NUMBER:Lorg/apache/tika/metadata/Property;

.field public static final DURATION:Lorg/apache/tika/metadata/Property;

.field public static final ENGINEER:Lorg/apache/tika/metadata/Property;

.field public static final FILE_DATA_RATE:Lorg/apache/tika/metadata/Property;

.field public static final GENRE:Lorg/apache/tika/metadata/Property;

.field public static final INSTRUMENT:Lorg/apache/tika/metadata/Property;

.field public static final KEY:Lorg/apache/tika/metadata/Property;

.field public static final LOG_COMMENT:Lorg/apache/tika/metadata/Property;

.field public static final LOOP:Lorg/apache/tika/metadata/Property;

.field public static final METADATA_MOD_DATE:Lorg/apache/tika/metadata/Property;

.field public static final NUMBER_OF_BEATS:Lorg/apache/tika/metadata/Property;

.field public static final PULL_DOWN:Lorg/apache/tika/metadata/Property;

.field public static final RELATIVE_PEAK_AUDIO_FILE_PATH:Lorg/apache/tika/metadata/Property;

.field public static final RELEASE_DATE:Lorg/apache/tika/metadata/Property;

.field public static final SCALE_TYPE:Lorg/apache/tika/metadata/Property;

.field public static final SCENE:Lorg/apache/tika/metadata/Property;

.field public static final SHOT_DATE:Lorg/apache/tika/metadata/Property;

.field public static final SHOT_LOCATION:Lorg/apache/tika/metadata/Property;

.field public static final SHOT_NAME:Lorg/apache/tika/metadata/Property;

.field public static final SPEAKER_PLACEMENT:Lorg/apache/tika/metadata/Property;

.field public static final STRETCH_MODE:Lorg/apache/tika/metadata/Property;

.field public static final TAPE_NAME:Lorg/apache/tika/metadata/Property;

.field public static final TEMPO:Lorg/apache/tika/metadata/Property;

.field public static final TIME_SIGNATURE:Lorg/apache/tika/metadata/Property;

.field public static final TRACK_NUMBER:Lorg/apache/tika/metadata/Property;

.field public static final VIDEO_ALPHA_MODE:Lorg/apache/tika/metadata/Property;

.field public static final VIDEO_ALPHA_UNITY_IS_TRANSPARENT:Lorg/apache/tika/metadata/Property;

.field public static final VIDEO_COLOR_SPACE:Lorg/apache/tika/metadata/Property;

.field public static final VIDEO_COMPRESSOR:Lorg/apache/tika/metadata/Property;

.field public static final VIDEO_FIELD_ORDER:Lorg/apache/tika/metadata/Property;

.field public static final VIDEO_FRAME_RATE:Lorg/apache/tika/metadata/Property;

.field public static final VIDEO_MOD_DATE:Lorg/apache/tika/metadata/Property;

.field public static final VIDEO_PIXEL_ASPECT_RATIO:Lorg/apache/tika/metadata/Property;

.field public static final VIDEO_PIXEL_DEPTH:Lorg/apache/tika/metadata/Property;


# direct methods
.method static constructor <clinit>()V
    .locals 17

    .line 1
    const-string v0, "xmpDM:absPeakAudioFilePath"

    .line 2
    .line 3
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalURI(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lorg/apache/tika/metadata/XMPDM;->ABS_PEAK_AUDIO_FILE_PATH:Lorg/apache/tika/metadata/Property;

    .line 8
    .line 9
    const-string v0, "xmpDM:album"

    .line 10
    .line 11
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lorg/apache/tika/metadata/XMPDM;->ALBUM:Lorg/apache/tika/metadata/Property;

    .line 16
    .line 17
    const-string v0, "xmpDM:altTapeName"

    .line 18
    .line 19
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lorg/apache/tika/metadata/XMPDM;->ALT_TAPE_NAME:Lorg/apache/tika/metadata/Property;

    .line 24
    .line 25
    const-string v0, "xmpDM:artist"

    .line 26
    .line 27
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lorg/apache/tika/metadata/XMPDM;->ARTIST:Lorg/apache/tika/metadata/Property;

    .line 32
    .line 33
    const-string v0, "xmpDM:albumArtist"

    .line 34
    .line 35
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lorg/apache/tika/metadata/XMPDM;->ALBUM_ARTIST:Lorg/apache/tika/metadata/Property;

    .line 40
    .line 41
    const-string v0, "xmpDM:audioModDate"

    .line 42
    .line 43
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalDate(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lorg/apache/tika/metadata/XMPDM;->AUDIO_MOD_DATE:Lorg/apache/tika/metadata/Property;

    .line 48
    .line 49
    const-string v0, "xmpDM:audioSampleRate"

    .line 50
    .line 51
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, Lorg/apache/tika/metadata/XMPDM;->AUDIO_SAMPLE_RATE:Lorg/apache/tika/metadata/Property;

    .line 56
    .line 57
    const-string v0, "8Int"

    .line 58
    .line 59
    const-string v1, "16Int"

    .line 60
    .line 61
    const-string v2, "32Int"

    .line 62
    .line 63
    const-string v3, "32Float"

    .line 64
    .line 65
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    const-string v5, "xmpDM:audioSampleType"

    .line 70
    .line 71
    invoke-static {v5, v4}, Lorg/apache/tika/metadata/Property;->internalClosedChoise(Ljava/lang/String;[Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    sput-object v4, Lorg/apache/tika/metadata/XMPDM;->AUDIO_SAMPLE_TYPE:Lorg/apache/tika/metadata/Property;

    .line 76
    .line 77
    const-string v4, "5.1"

    .line 78
    .line 79
    const-string v5, "7.1"

    .line 80
    .line 81
    const-string v6, "Mono"

    .line 82
    .line 83
    const-string v7, "Stereo"

    .line 84
    .line 85
    filled-new-array {v6, v7, v4, v5}, [Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    const-string v5, "xmpDM:audioChannelType"

    .line 90
    .line 91
    invoke-static {v5, v4}, Lorg/apache/tika/metadata/Property;->internalClosedChoise(Ljava/lang/String;[Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    sput-object v4, Lorg/apache/tika/metadata/XMPDM;->AUDIO_CHANNEL_TYPE:Lorg/apache/tika/metadata/Property;

    .line 96
    .line 97
    const-string v4, "xmpDM:audioCompressor"

    .line 98
    .line 99
    invoke-static {v4}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    sput-object v4, Lorg/apache/tika/metadata/XMPDM;->AUDIO_COMPRESSOR:Lorg/apache/tika/metadata/Property;

    .line 104
    .line 105
    const-string v4, "xmpDM:compilation"

    .line 106
    .line 107
    invoke-static {v4}, Lorg/apache/tika/metadata/Property;->externalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    sput-object v4, Lorg/apache/tika/metadata/XMPDM;->COMPILATION:Lorg/apache/tika/metadata/Property;

    .line 112
    .line 113
    const-string v4, "xmpDM:composer"

    .line 114
    .line 115
    invoke-static {v4}, Lorg/apache/tika/metadata/Property;->externalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    sput-object v4, Lorg/apache/tika/metadata/XMPDM;->COMPOSER:Lorg/apache/tika/metadata/Property;

    .line 120
    .line 121
    const-string v4, "xmpDM:copyright"

    .line 122
    .line 123
    invoke-static {v4}, Lorg/apache/tika/metadata/Property;->externalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    sput-object v4, Lorg/apache/tika/metadata/XMPDM;->COPYRIGHT:Lorg/apache/tika/metadata/Property;

    .line 128
    .line 129
    const-string v4, "xmpDM:discNumber"

    .line 130
    .line 131
    invoke-static {v4}, Lorg/apache/tika/metadata/Property;->externalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    sput-object v4, Lorg/apache/tika/metadata/XMPDM;->DISC_NUMBER:Lorg/apache/tika/metadata/Property;

    .line 136
    .line 137
    const-string v4, "xmpDM:duration"

    .line 138
    .line 139
    invoke-static {v4}, Lorg/apache/tika/metadata/Property;->externalReal(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    sput-object v4, Lorg/apache/tika/metadata/XMPDM;->DURATION:Lorg/apache/tika/metadata/Property;

    .line 144
    .line 145
    const-string v4, "xmpDM:engineer"

    .line 146
    .line 147
    invoke-static {v4}, Lorg/apache/tika/metadata/Property;->externalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    sput-object v4, Lorg/apache/tika/metadata/XMPDM;->ENGINEER:Lorg/apache/tika/metadata/Property;

    .line 152
    .line 153
    const-string v4, "xmpDM:fileDataRate"

    .line 154
    .line 155
    invoke-static {v4}, Lorg/apache/tika/metadata/Property;->internalRational(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    sput-object v4, Lorg/apache/tika/metadata/XMPDM;->FILE_DATA_RATE:Lorg/apache/tika/metadata/Property;

    .line 160
    .line 161
    const-string v4, "xmpDM:genre"

    .line 162
    .line 163
    invoke-static {v4}, Lorg/apache/tika/metadata/Property;->externalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    sput-object v4, Lorg/apache/tika/metadata/XMPDM;->GENRE:Lorg/apache/tika/metadata/Property;

    .line 168
    .line 169
    const-string v4, "xmpDM:instrument"

    .line 170
    .line 171
    invoke-static {v4}, Lorg/apache/tika/metadata/Property;->externalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    sput-object v4, Lorg/apache/tika/metadata/XMPDM;->INSTRUMENT:Lorg/apache/tika/metadata/Property;

    .line 176
    .line 177
    const-string v15, "A#"

    .line 178
    .line 179
    const-string v16, "B"

    .line 180
    .line 181
    const-string v5, "C"

    .line 182
    .line 183
    const-string v6, "C#"

    .line 184
    .line 185
    const-string v7, "D"

    .line 186
    .line 187
    const-string v8, "D#"

    .line 188
    .line 189
    const-string v9, "E"

    .line 190
    .line 191
    const-string v10, "F"

    .line 192
    .line 193
    const-string v11, "F#"

    .line 194
    .line 195
    const-string v12, "G"

    .line 196
    .line 197
    const-string v13, "G#"

    .line 198
    .line 199
    const-string v14, "A"

    .line 200
    .line 201
    filled-new-array/range {v5 .. v16}, [Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    const-string v5, "xmpDM:key"

    .line 206
    .line 207
    invoke-static {v5, v4}, Lorg/apache/tika/metadata/Property;->internalClosedChoise(Ljava/lang/String;[Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    sput-object v4, Lorg/apache/tika/metadata/XMPDM;->KEY:Lorg/apache/tika/metadata/Property;

    .line 212
    .line 213
    const-string v4, "xmpDM:logComment"

    .line 214
    .line 215
    invoke-static {v4}, Lorg/apache/tika/metadata/Property;->externalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    sput-object v4, Lorg/apache/tika/metadata/XMPDM;->LOG_COMMENT:Lorg/apache/tika/metadata/Property;

    .line 220
    .line 221
    const-string v4, "xmpDM:loop"

    .line 222
    .line 223
    invoke-static {v4}, Lorg/apache/tika/metadata/Property;->internalBoolean(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 224
    .line 225
    .line 226
    move-result-object v4

    .line 227
    sput-object v4, Lorg/apache/tika/metadata/XMPDM;->LOOP:Lorg/apache/tika/metadata/Property;

    .line 228
    .line 229
    const-string v4, "xmpDM:numberOfBeats"

    .line 230
    .line 231
    invoke-static {v4}, Lorg/apache/tika/metadata/Property;->internalReal(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 232
    .line 233
    .line 234
    move-result-object v4

    .line 235
    sput-object v4, Lorg/apache/tika/metadata/XMPDM;->NUMBER_OF_BEATS:Lorg/apache/tika/metadata/Property;

    .line 236
    .line 237
    const-string v4, "xmpDM:metadataModDate"

    .line 238
    .line 239
    invoke-static {v4}, Lorg/apache/tika/metadata/Property;->internalDate(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 240
    .line 241
    .line 242
    move-result-object v4

    .line 243
    sput-object v4, Lorg/apache/tika/metadata/XMPDM;->METADATA_MOD_DATE:Lorg/apache/tika/metadata/Property;

    .line 244
    .line 245
    const-string v13, "WWWSS_24p"

    .line 246
    .line 247
    const-string v14, "WWSSW_24p"

    .line 248
    .line 249
    const-string v5, "WSSWW"

    .line 250
    .line 251
    const-string v6, "SSWWW"

    .line 252
    .line 253
    const-string v7, "SWWWS"

    .line 254
    .line 255
    const-string v8, "WWWSS"

    .line 256
    .line 257
    const-string v9, "WWSSW"

    .line 258
    .line 259
    const-string v10, "WSSWW_24p"

    .line 260
    .line 261
    const-string v11, "SSWWW_24p"

    .line 262
    .line 263
    const-string v12, "SWWWS_24p"

    .line 264
    .line 265
    filled-new-array/range {v5 .. v14}, [Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v4

    .line 269
    const-string v5, "xmpDM:pullDown"

    .line 270
    .line 271
    invoke-static {v5, v4}, Lorg/apache/tika/metadata/Property;->internalClosedChoise(Ljava/lang/String;[Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 272
    .line 273
    .line 274
    move-result-object v4

    .line 275
    sput-object v4, Lorg/apache/tika/metadata/XMPDM;->PULL_DOWN:Lorg/apache/tika/metadata/Property;

    .line 276
    .line 277
    const-string v4, "xmpDM:relativePeakAudioFilePath"

    .line 278
    .line 279
    invoke-static {v4}, Lorg/apache/tika/metadata/Property;->internalURI(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 280
    .line 281
    .line 282
    move-result-object v4

    .line 283
    sput-object v4, Lorg/apache/tika/metadata/XMPDM;->RELATIVE_PEAK_AUDIO_FILE_PATH:Lorg/apache/tika/metadata/Property;

    .line 284
    .line 285
    const-string v4, "xmpDM:releaseDate"

    .line 286
    .line 287
    invoke-static {v4}, Lorg/apache/tika/metadata/Property;->externalDate(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 288
    .line 289
    .line 290
    move-result-object v4

    .line 291
    sput-object v4, Lorg/apache/tika/metadata/XMPDM;->RELEASE_DATE:Lorg/apache/tika/metadata/Property;

    .line 292
    .line 293
    const-string v4, "Both"

    .line 294
    .line 295
    const-string v5, "Neither"

    .line 296
    .line 297
    const-string v6, "Major"

    .line 298
    .line 299
    const-string v7, "Minor"

    .line 300
    .line 301
    filled-new-array {v6, v7, v4, v5}, [Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v4

    .line 305
    const-string v5, "xmpDM:scaleType"

    .line 306
    .line 307
    invoke-static {v5, v4}, Lorg/apache/tika/metadata/Property;->internalClosedChoise(Ljava/lang/String;[Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 308
    .line 309
    .line 310
    move-result-object v4

    .line 311
    sput-object v4, Lorg/apache/tika/metadata/XMPDM;->SCALE_TYPE:Lorg/apache/tika/metadata/Property;

    .line 312
    .line 313
    const-string v4, "xmpDM:scene"

    .line 314
    .line 315
    invoke-static {v4}, Lorg/apache/tika/metadata/Property;->externalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 316
    .line 317
    .line 318
    move-result-object v4

    .line 319
    sput-object v4, Lorg/apache/tika/metadata/XMPDM;->SCENE:Lorg/apache/tika/metadata/Property;

    .line 320
    .line 321
    const-string v4, "xmpDM:shotDate"

    .line 322
    .line 323
    invoke-static {v4}, Lorg/apache/tika/metadata/Property;->externalDate(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 324
    .line 325
    .line 326
    move-result-object v4

    .line 327
    sput-object v4, Lorg/apache/tika/metadata/XMPDM;->SHOT_DATE:Lorg/apache/tika/metadata/Property;

    .line 328
    .line 329
    const-string v4, "xmpDM:shotLocation"

    .line 330
    .line 331
    invoke-static {v4}, Lorg/apache/tika/metadata/Property;->externalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 332
    .line 333
    .line 334
    move-result-object v4

    .line 335
    sput-object v4, Lorg/apache/tika/metadata/XMPDM;->SHOT_LOCATION:Lorg/apache/tika/metadata/Property;

    .line 336
    .line 337
    const-string v4, "xmpDM:shotName"

    .line 338
    .line 339
    invoke-static {v4}, Lorg/apache/tika/metadata/Property;->externalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 340
    .line 341
    .line 342
    move-result-object v4

    .line 343
    sput-object v4, Lorg/apache/tika/metadata/XMPDM;->SHOT_NAME:Lorg/apache/tika/metadata/Property;

    .line 344
    .line 345
    const-string v4, "xmpDM:speakerPlacement"

    .line 346
    .line 347
    invoke-static {v4}, Lorg/apache/tika/metadata/Property;->externalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 348
    .line 349
    .line 350
    move-result-object v4

    .line 351
    sput-object v4, Lorg/apache/tika/metadata/XMPDM;->SPEAKER_PLACEMENT:Lorg/apache/tika/metadata/Property;

    .line 352
    .line 353
    const-string v4, "Beat Splice"

    .line 354
    .line 355
    const-string v5, "Hybrid"

    .line 356
    .line 357
    const-string v6, "Fixed length"

    .line 358
    .line 359
    const-string v7, "Time-Scale"

    .line 360
    .line 361
    const-string v8, "Resample"

    .line 362
    .line 363
    filled-new-array {v6, v7, v8, v4, v5}, [Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v4

    .line 367
    const-string v5, "xmpDM:stretchMode"

    .line 368
    .line 369
    invoke-static {v5, v4}, Lorg/apache/tika/metadata/Property;->internalClosedChoise(Ljava/lang/String;[Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 370
    .line 371
    .line 372
    move-result-object v4

    .line 373
    sput-object v4, Lorg/apache/tika/metadata/XMPDM;->STRETCH_MODE:Lorg/apache/tika/metadata/Property;

    .line 374
    .line 375
    const-string v4, "xmpDM:tapeName"

    .line 376
    .line 377
    invoke-static {v4}, Lorg/apache/tika/metadata/Property;->externalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 378
    .line 379
    .line 380
    move-result-object v4

    .line 381
    sput-object v4, Lorg/apache/tika/metadata/XMPDM;->TAPE_NAME:Lorg/apache/tika/metadata/Property;

    .line 382
    .line 383
    const-string v4, "xmpDM:tempo"

    .line 384
    .line 385
    invoke-static {v4}, Lorg/apache/tika/metadata/Property;->internalReal(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 386
    .line 387
    .line 388
    move-result-object v4

    .line 389
    sput-object v4, Lorg/apache/tika/metadata/XMPDM;->TEMPO:Lorg/apache/tika/metadata/Property;

    .line 390
    .line 391
    const-string v12, "12/8"

    .line 392
    .line 393
    const-string v13, "other"

    .line 394
    .line 395
    const-string v5, "2/4"

    .line 396
    .line 397
    const-string v6, "3/4"

    .line 398
    .line 399
    const-string v7, "4/4"

    .line 400
    .line 401
    const-string v8, "5/4"

    .line 402
    .line 403
    const-string v9, "7/4"

    .line 404
    .line 405
    const-string v10, "6/8"

    .line 406
    .line 407
    const-string v11, "9/8"

    .line 408
    .line 409
    filled-new-array/range {v5 .. v13}, [Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v4

    .line 413
    const-string v5, "xmpDM:timeSignature"

    .line 414
    .line 415
    invoke-static {v5, v4}, Lorg/apache/tika/metadata/Property;->internalClosedChoise(Ljava/lang/String;[Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 416
    .line 417
    .line 418
    move-result-object v4

    .line 419
    sput-object v4, Lorg/apache/tika/metadata/XMPDM;->TIME_SIGNATURE:Lorg/apache/tika/metadata/Property;

    .line 420
    .line 421
    const-string v4, "xmpDM:trackNumber"

    .line 422
    .line 423
    invoke-static {v4}, Lorg/apache/tika/metadata/Property;->externalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 424
    .line 425
    .line 426
    move-result-object v4

    .line 427
    sput-object v4, Lorg/apache/tika/metadata/XMPDM;->TRACK_NUMBER:Lorg/apache/tika/metadata/Property;

    .line 428
    .line 429
    const-string v4, "straight"

    .line 430
    .line 431
    const-string v5, "pre-multiplied"

    .line 432
    .line 433
    filled-new-array {v4, v5}, [Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v4

    .line 437
    const-string v5, "xmpDM:videoAlphaMode"

    .line 438
    .line 439
    invoke-static {v5, v4}, Lorg/apache/tika/metadata/Property;->externalClosedChoise(Ljava/lang/String;[Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 440
    .line 441
    .line 442
    move-result-object v4

    .line 443
    sput-object v4, Lorg/apache/tika/metadata/XMPDM;->VIDEO_ALPHA_MODE:Lorg/apache/tika/metadata/Property;

    .line 444
    .line 445
    const-string v4, "xmpDM:videoAlphaUnityIsTransparent"

    .line 446
    .line 447
    invoke-static {v4}, Lorg/apache/tika/metadata/Property;->internalBoolean(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 448
    .line 449
    .line 450
    move-result-object v4

    .line 451
    sput-object v4, Lorg/apache/tika/metadata/XMPDM;->VIDEO_ALPHA_UNITY_IS_TRANSPARENT:Lorg/apache/tika/metadata/Property;

    .line 452
    .line 453
    const-string v4, "CCIR-601"

    .line 454
    .line 455
    const-string v5, "CCIR-709"

    .line 456
    .line 457
    const-string v6, "sRGB"

    .line 458
    .line 459
    filled-new-array {v6, v4, v5}, [Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v4

    .line 463
    const-string v5, "xmpDM:videoColorSpace"

    .line 464
    .line 465
    invoke-static {v5, v4}, Lorg/apache/tika/metadata/Property;->internalClosedChoise(Ljava/lang/String;[Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 466
    .line 467
    .line 468
    move-result-object v4

    .line 469
    sput-object v4, Lorg/apache/tika/metadata/XMPDM;->VIDEO_COLOR_SPACE:Lorg/apache/tika/metadata/Property;

    .line 470
    .line 471
    const-string v4, "xmpDM:videoCompressor"

    .line 472
    .line 473
    invoke-static {v4}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 474
    .line 475
    .line 476
    move-result-object v4

    .line 477
    sput-object v4, Lorg/apache/tika/metadata/XMPDM;->VIDEO_COMPRESSOR:Lorg/apache/tika/metadata/Property;

    .line 478
    .line 479
    const-string v4, "Lower"

    .line 480
    .line 481
    const-string v5, "Progressive"

    .line 482
    .line 483
    const-string v6, "Upper"

    .line 484
    .line 485
    filled-new-array {v6, v4, v5}, [Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object v4

    .line 489
    const-string v5, "xmpDM:videoFieldOrder"

    .line 490
    .line 491
    invoke-static {v5, v4}, Lorg/apache/tika/metadata/Property;->internalClosedChoise(Ljava/lang/String;[Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 492
    .line 493
    .line 494
    move-result-object v4

    .line 495
    sput-object v4, Lorg/apache/tika/metadata/XMPDM;->VIDEO_FIELD_ORDER:Lorg/apache/tika/metadata/Property;

    .line 496
    .line 497
    const-string v4, "NTSC"

    .line 498
    .line 499
    const-string v5, "PAL"

    .line 500
    .line 501
    const-string v6, "24"

    .line 502
    .line 503
    filled-new-array {v6, v4, v5}, [Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v4

    .line 507
    const-string v5, "xmpDM:videoFrameRate"

    .line 508
    .line 509
    invoke-static {v5, v4}, Lorg/apache/tika/metadata/Property;->internalOpenChoise(Ljava/lang/String;[Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 510
    .line 511
    .line 512
    move-result-object v4

    .line 513
    sput-object v4, Lorg/apache/tika/metadata/XMPDM;->VIDEO_FRAME_RATE:Lorg/apache/tika/metadata/Property;

    .line 514
    .line 515
    const-string v4, "xmpDM:videoModDate"

    .line 516
    .line 517
    invoke-static {v4}, Lorg/apache/tika/metadata/Property;->internalDate(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 518
    .line 519
    .line 520
    move-result-object v4

    .line 521
    sput-object v4, Lorg/apache/tika/metadata/XMPDM;->VIDEO_MOD_DATE:Lorg/apache/tika/metadata/Property;

    .line 522
    .line 523
    const-string v4, "xmpDM:videoPixelDepth"

    .line 524
    .line 525
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    invoke-static {v4, v0}, Lorg/apache/tika/metadata/Property;->internalClosedChoise(Ljava/lang/String;[Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    sput-object v0, Lorg/apache/tika/metadata/XMPDM;->VIDEO_PIXEL_DEPTH:Lorg/apache/tika/metadata/Property;

    .line 534
    .line 535
    const-string v0, "xmpDM:videoPixelAspectRatio"

    .line 536
    .line 537
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalRational(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    sput-object v0, Lorg/apache/tika/metadata/XMPDM;->VIDEO_PIXEL_ASPECT_RATIO:Lorg/apache/tika/metadata/Property;

    .line 542
    .line 543
    return-void
.end method

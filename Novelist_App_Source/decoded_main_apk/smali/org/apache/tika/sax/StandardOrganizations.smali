.class public Lorg/apache/tika/sax/StandardOrganizations;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final organizations:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/TreeMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lorg/apache/tika/sax/StandardOrganizations;->organizations:Ljava/util/Map;

    .line 7
    .line 8
    const-string v1, "3GPP"

    .line 9
    .line 10
    const-string v2, "3rd Generation Partnership Project"

    .line 11
    .line 12
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    const-string v1, "3GPP2"

    .line 16
    .line 17
    const-string v2, "3rd Generation Partnership Project 2"

    .line 18
    .line 19
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    const-string v1, "Accellera"

    .line 23
    .line 24
    const-string v2, "Accellera Organization"

    .line 25
    .line 26
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    const-string v1, "A4L"

    .line 30
    .line 31
    const-string v2, "Access for Learning Community (formerly known as the Schools Interoperability Framework)"

    .line 32
    .line 33
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    const-string v1, "AES"

    .line 37
    .line 38
    const-string v2, "Audio Engineering Society"

    .line 39
    .line 40
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    const-string v1, "AIIM"

    .line 44
    .line 45
    const-string v2, "Association for Information and Image Management"

    .line 46
    .line 47
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    const-string v1, "ASAM"

    .line 51
    .line 52
    const-string v2, "Association for Automation and Measuring Systems - Automotive technology"

    .line 53
    .line 54
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    const-string v1, "ASHRAE"

    .line 58
    .line 59
    const-string v2, "American Society of Heating, Refrigerating and Air-Conditioning Engineers (ASHRAE is an international organization, despite its name)"

    .line 60
    .line 61
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    const-string v1, "ASME"

    .line 65
    .line 66
    const-string v2, "formerly The American Society of Mechanical Engineers"

    .line 67
    .line 68
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    const-string v1, "ASTM"

    .line 72
    .line 73
    const-string v2, "ASTM (American Society for Testing and Materials) International"

    .line 74
    .line 75
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    const-string v1, "ATIS"

    .line 79
    .line 80
    const-string v2, "Alliance for Telecommunications Industry Solutions"

    .line 81
    .line 82
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    const-string v1, "AUTOSAR"

    .line 86
    .line 87
    const-string v2, "Automotive technology"

    .line 88
    .line 89
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    const-string v1, "BIPM, CGPM, and CIPM"

    .line 93
    .line 94
    const-string v2, "Bureau International des Poids et Mesures and the related organizations established under the Metre Convention of 1875."

    .line 95
    .line 96
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    const-string v1, "CableLabs"

    .line 100
    .line 101
    const-string v2, "Cable Television Laboratories"

    .line 102
    .line 103
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    const-string v1, "CCSDS"

    .line 107
    .line 108
    const-string v2, "Consultative Committee for Space Data Sciences"

    .line 109
    .line 110
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    const-string v1, "CISPR"

    .line 114
    .line 115
    const-string v2, "International Special Committee on Radio Interference"

    .line 116
    .line 117
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    const-string v1, "CFA"

    .line 121
    .line 122
    const-string v2, "Compact flash association"

    .line 123
    .line 124
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    const-string v1, "DCMI"

    .line 128
    .line 129
    const-string v2, "Dublin Core Metadata Initiative"

    .line 130
    .line 131
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    const-string v1, "DMTF"

    .line 135
    .line 136
    const-string v2, "Distributed Management Task Force"

    .line 137
    .line 138
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    const-string v1, "Ecma International"

    .line 142
    .line 143
    const-string v2, "Ecma International (previously called ECMA)"

    .line 144
    .line 145
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    const-string v1, "EKOenergy"

    .line 149
    .line 150
    const-string v2, "EKOenergy Network managed by environmental NGOs"

    .line 151
    .line 152
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    const-string v1, "FAI"

    .line 156
    .line 157
    const-string v2, "F\u00e9d\u00e9ration A\u00e9ronautique Internationale"

    .line 158
    .line 159
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    const-string v1, "GlobalPlatform"

    .line 163
    .line 164
    const-string v2, "Secure element and TEE standards"

    .line 165
    .line 166
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    const-string v1, "GS1"

    .line 170
    .line 171
    const-string v2, "Global supply chain standards (identification numbers, barcodes, electronic commerce transactions, RFID)"

    .line 172
    .line 173
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    const-string v1, "HGI"

    .line 177
    .line 178
    const-string v2, "Home Gateway Initiative"

    .line 179
    .line 180
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    const-string v1, "HFSB"

    .line 184
    .line 185
    const-string v2, "Hedge Fund Standards Board"

    .line 186
    .line 187
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    const-string v1, "IATA"

    .line 191
    .line 192
    const-string v2, "International Air Transport Association"

    .line 193
    .line 194
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    const-string v1, "IAU*"

    .line 198
    .line 199
    const-string v2, "International Arabic Union"

    .line 200
    .line 201
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    const-string v1, "ICAO"

    .line 205
    .line 206
    const-string v3, "International Civil Aviation Organization"

    .line 207
    .line 208
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    const-string v1, "IEC"

    .line 212
    .line 213
    const-string v3, "International Electrotechnical Commission"

    .line 214
    .line 215
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    const-string v1, "IEEE"

    .line 219
    .line 220
    const-string v3, "Institute of Electrical and Electronics Engineers"

    .line 221
    .line 222
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    const-string v1, "IEEE-SA"

    .line 226
    .line 227
    const-string v3, "IEEE Standards Association"

    .line 228
    .line 229
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    const-string v1, "IETF"

    .line 233
    .line 234
    const-string v3, "Internet Engineering Task Force"

    .line 235
    .line 236
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    const-string v1, "IFOAM"

    .line 240
    .line 241
    const-string v3, "International Federation of Organic Agriculture Movements"

    .line 242
    .line 243
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    const-string v1, "IFSWF"

    .line 247
    .line 248
    const-string v3, "International Forum of Sovereign Wealth Funds"

    .line 249
    .line 250
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    const-string v1, "IMO"

    .line 254
    .line 255
    const-string v3, "International Maritime Organization"

    .line 256
    .line 257
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    const-string v1, "IMS"

    .line 261
    .line 262
    const-string v3, "IMS Global Learning Consortium"

    .line 263
    .line 264
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    const-string v1, "ISO"

    .line 268
    .line 269
    const-string v3, "International Organization for Standardization"

    .line 270
    .line 271
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    const-string v1, "IPTC"

    .line 275
    .line 276
    const-string v3, "International Press Telecommunications Council"

    .line 277
    .line 278
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    const-string v1, "ITU"

    .line 282
    .line 283
    const-string v3, "The International Telecommunication Union"

    .line 284
    .line 285
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    const-string v1, "ITU-R"

    .line 289
    .line 290
    const-string v3, "ITU Radiocommunications Sector (formerly known as CCIR)"

    .line 291
    .line 292
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    const-string v1, "CCIR"

    .line 296
    .line 297
    const-string v3, "Comit\u00e9 Consultatif International pour la Radio, a forerunner of the ITU-R"

    .line 298
    .line 299
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    const-string v1, "ITU-T"

    .line 303
    .line 304
    const-string v3, "ITU Telecommunications Sector (formerly known as CCITT)"

    .line 305
    .line 306
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    const-string v1, "CCITT"

    .line 310
    .line 311
    const-string v3, "Comit\u00e9 Consultatif International T\u00e9l\u00e9phonique et T\u00e9l\u00e9graphique, renamed ITU-T in 1993"

    .line 312
    .line 313
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    const-string v1, "ITU-D"

    .line 317
    .line 318
    const-string v3, "ITU Telecom Development (formerly known as BDT)"

    .line 319
    .line 320
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    const-string v1, "BDT"

    .line 324
    .line 325
    const-string v3, "Bureau de d\u00e9veloppement des t\u00e9l\u00e9communications, renamed ITU-D"

    .line 326
    .line 327
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    const-string v1, "IUPAC"

    .line 331
    .line 332
    const-string v3, "International Union of Pure and Applied Chemistry"

    .line 333
    .line 334
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    const-string v1, "Liberty Alliance"

    .line 338
    .line 339
    invoke-interface {v0, v1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    const-string v1, "Media Grid"

    .line 343
    .line 344
    const-string v3, "Media Grid Standards Organization"

    .line 345
    .line 346
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    const-string v1, "NACE International"

    .line 350
    .line 351
    const-string v3, "Formerly known as National Association of Corrosion Engineers"

    .line 352
    .line 353
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    const-string v1, "OASIS"

    .line 357
    .line 358
    const-string v3, "Organization for the Advancement of Structured Information Standards"

    .line 359
    .line 360
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    const-string v1, "OGC"

    .line 364
    .line 365
    const-string v3, "Open Geospatial Consortium"

    .line 366
    .line 367
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    const-string v1, "OHICC"

    .line 371
    .line 372
    const-string v3, "Organization of Hotel Industry Classification & Certification"

    .line 373
    .line 374
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    const-string v1, "OMA"

    .line 378
    .line 379
    const-string v3, "Open Mobile Alliance"

    .line 380
    .line 381
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    const-string v1, "OMG"

    .line 385
    .line 386
    const-string v3, "Object Management Group"

    .line 387
    .line 388
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    const-string v1, "OGF"

    .line 392
    .line 393
    const-string v3, "Open Grid Forum (merger of Global Grid Forum (GGF) and Enterprise Grid Alliance (EGA))"

    .line 394
    .line 395
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    const-string v1, "GGF"

    .line 399
    .line 400
    const-string v3, "Global Grid Forum"

    .line 401
    .line 402
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    const-string v1, "EGA"

    .line 406
    .line 407
    const-string v3, "Enterprise Grid Alliance"

    .line 408
    .line 409
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    const-string v1, "OpenTravel Alliance (previously known as OTA)"

    .line 413
    .line 414
    const-string v3, "OpenTravel Alliance"

    .line 415
    .line 416
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    const-string v1, "OTA"

    .line 420
    .line 421
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    const-string v1, "OSGi"

    .line 425
    .line 426
    const-string v3, "OSGi Alliance"

    .line 427
    .line 428
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    const-string v1, "PESC"

    .line 432
    .line 433
    const-string v3, "P20 Education Standards Council[1]"

    .line 434
    .line 435
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    const-string v1, "SAI"

    .line 439
    .line 440
    const-string v3, "Social Accountability International"

    .line 441
    .line 442
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    const-string v1, "SDA"

    .line 446
    .line 447
    const-string v3, "Secure Digital Association"

    .line 448
    .line 449
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    const-string v1, "SNIA"

    .line 453
    .line 454
    const-string v3, "Storage Networking Industry Association"

    .line 455
    .line 456
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    const-string v1, "SMPTE"

    .line 460
    .line 461
    const-string v3, "Society of Motion Picture and Television Engineers"

    .line 462
    .line 463
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    const-string v1, "SSDA"

    .line 467
    .line 468
    const-string v3, "Solid State Drive Alliance"

    .line 469
    .line 470
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    const-string v1, "The Open Group"

    .line 474
    .line 475
    invoke-interface {v0, v1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    const-string v1, "TIA"

    .line 479
    .line 480
    const-string v3, "Telecommunications Industry Association"

    .line 481
    .line 482
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    const-string v1, "TM Forum"

    .line 486
    .line 487
    const-string v3, "Telemanagement Forum"

    .line 488
    .line 489
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    const-string v1, "UIC"

    .line 493
    .line 494
    const-string v3, "International Union of Railways"

    .line 495
    .line 496
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    const-string v1, "UL"

    .line 500
    .line 501
    const-string v3, "Underwriters Laboratories"

    .line 502
    .line 503
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    const-string v1, "UPU"

    .line 507
    .line 508
    const-string v3, "Universal Postal Union"

    .line 509
    .line 510
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    const-string v1, "WMO"

    .line 514
    .line 515
    const-string v3, "World Meteorological Organization"

    .line 516
    .line 517
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    const-string v1, "W3C"

    .line 521
    .line 522
    const-string v3, "World Wide Web Consortium"

    .line 523
    .line 524
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    const-string v1, "WSA"

    .line 528
    .line 529
    const-string v3, "Website Standards Association"

    .line 530
    .line 531
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    const-string v1, "WHO"

    .line 535
    .line 536
    const-string v3, "World Health Organization"

    .line 537
    .line 538
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    const-string v1, "XSF"

    .line 542
    .line 543
    const-string v3, "The XMPP Standards Foundation"

    .line 544
    .line 545
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    const-string v1, "FAO"

    .line 549
    .line 550
    const-string v3, "Food and Agriculture Organization"

    .line 551
    .line 552
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    const-string v1, "ARSO"

    .line 556
    .line 557
    const-string v3, "African Regional Organization for Standarization"

    .line 558
    .line 559
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    const-string v1, "SADCSTAN"

    .line 563
    .line 564
    const-string v3, "Southern African Development Community (SADC) Cooperation in Standarization"

    .line 565
    .line 566
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    const-string v1, "COPANT"

    .line 570
    .line 571
    const-string v3, "Pan American Standards Commission"

    .line 572
    .line 573
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    const-string v1, "AMN"

    .line 577
    .line 578
    const-string v3, "MERCOSUR Standardization Association"

    .line 579
    .line 580
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    const-string v1, "CROSQ"

    .line 584
    .line 585
    const-string v3, "CARICOM Regional Organization for Standards and Quality"

    .line 586
    .line 587
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    const-string v1, "AAQG"

    .line 591
    .line 592
    const-string v3, "America\'s Aerospace Quality Group"

    .line 593
    .line 594
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    const-string v1, "PASC"

    .line 598
    .line 599
    const-string v3, "Pacific Area Standards Congress"

    .line 600
    .line 601
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    const-string v1, "ACCSQ"

    .line 605
    .line 606
    const-string v3, "ASEAN Consultative Committee for Standards and Quality"

    .line 607
    .line 608
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    const-string v1, "RoyalCert"

    .line 612
    .line 613
    const-string v3, "RoyalCert International Registrars"

    .line 614
    .line 615
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 616
    .line 617
    .line 618
    const-string v1, "CEN"

    .line 619
    .line 620
    const-string v3, "European Committee for Standardization"

    .line 621
    .line 622
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 623
    .line 624
    .line 625
    const-string v1, "CENELEC"

    .line 626
    .line 627
    const-string v3, "European Committee for Electrotechnical Standardization"

    .line 628
    .line 629
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    const-string v1, "URS"

    .line 633
    .line 634
    const-string v3, "United Registrar of Systems, UK"

    .line 635
    .line 636
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 637
    .line 638
    .line 639
    const-string v1, "ETSI"

    .line 640
    .line 641
    const-string v3, "European Telecommunications Standards Institute"

    .line 642
    .line 643
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 644
    .line 645
    .line 646
    const-string v1, "EASC"

    .line 647
    .line 648
    const-string v3, "Euro-Asian Council for Standardization, Metrology and Certification"

    .line 649
    .line 650
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 651
    .line 652
    .line 653
    const-string v1, "IRMM"

    .line 654
    .line 655
    const-string v3, "Institute for Reference Materials and Measurements (European Union)"

    .line 656
    .line 657
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 658
    .line 659
    .line 660
    const-string v1, "AIDMO"

    .line 661
    .line 662
    const-string v3, "Arab Industrial Development and Mining Organization"

    .line 663
    .line 664
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 665
    .line 666
    .line 667
    const-string v1, "IAU"

    .line 668
    .line 669
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 670
    .line 671
    .line 672
    const-string v1, "BSI"

    .line 673
    .line 674
    const-string v2, "British Standards Institution aka BSI Group"

    .line 675
    .line 676
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 677
    .line 678
    .line 679
    const-string v1, "DStan"

    .line 680
    .line 681
    const-string v2, "UK Defence Standardization"

    .line 682
    .line 683
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 684
    .line 685
    .line 686
    const-string v1, "ANSI"

    .line 687
    .line 688
    const-string v2, "American National Standards Institute"

    .line 689
    .line 690
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 691
    .line 692
    .line 693
    const-string v1, "ACI"

    .line 694
    .line 695
    const-string v2, "American Concrete Institute"

    .line 696
    .line 697
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 698
    .line 699
    .line 700
    const-string v1, "NIST"

    .line 701
    .line 702
    const-string v2, "National Institute of Standards and Technology"

    .line 703
    .line 704
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 705
    .line 706
    .line 707
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static getOrganizations()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lorg/apache/tika/sax/StandardOrganizations;->organizations:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public static getOrganzationsRegex()Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Lorg/apache/tika/sax/StandardOrganizations;->organizations:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ljava/lang/CharSequence;

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    const-string v2, "|"

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v1, "("

    .line 48
    .line 49
    const-string v2, ")"

    .line 50
    .line 51
    invoke-static {v1, v0, v2}, Lt/a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    return-object v0
.end method

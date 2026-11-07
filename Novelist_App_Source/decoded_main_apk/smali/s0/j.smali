.class public abstract Ls0/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ls0/b;

.field public static final b:Ls0/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ls0/b;

    .line 2
    .line 3
    const-string v1, "VISUAL_STATE_CALLBACK"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    new-instance v0, Ls0/b;

    .line 10
    .line 11
    const-string v1, "OFF_SCREEN_PRERASTER"

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Ls0/b;

    .line 17
    .line 18
    const-string v1, "SAFE_BROWSING_ENABLE"

    .line 19
    .line 20
    const/4 v2, 0x3

    .line 21
    invoke-direct {v0, v1, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    new-instance v0, Ls0/b;

    .line 25
    .line 26
    const-string v1, "DISABLED_ACTION_MODE_MENU_ITEMS"

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    invoke-direct {v0, v1, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    new-instance v0, Ls0/b;

    .line 33
    .line 34
    const-string v1, "START_SAFE_BROWSING"

    .line 35
    .line 36
    const/4 v2, 0x4

    .line 37
    invoke-direct {v0, v1, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    new-instance v0, Ls0/b;

    .line 41
    .line 42
    const/4 v1, 0x4

    .line 43
    const-string v2, "SAFE_BROWSING_WHITELIST"

    .line 44
    .line 45
    invoke-direct {v0, v2, v1, v2}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 46
    .line 47
    .line 48
    new-instance v0, Ls0/b;

    .line 49
    .line 50
    const-string v3, "SAFE_BROWSING_ALLOWLIST"

    .line 51
    .line 52
    invoke-direct {v0, v2, v1, v3}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 53
    .line 54
    .line 55
    new-instance v0, Ls0/b;

    .line 56
    .line 57
    invoke-direct {v0, v3, v1, v2}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 58
    .line 59
    .line 60
    new-instance v0, Ls0/b;

    .line 61
    .line 62
    invoke-direct {v0, v3, v1, v3}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 63
    .line 64
    .line 65
    new-instance v0, Ls0/b;

    .line 66
    .line 67
    const-string v1, "SAFE_BROWSING_PRIVACY_POLICY_URL"

    .line 68
    .line 69
    const/4 v2, 0x4

    .line 70
    invoke-direct {v0, v1, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 71
    .line 72
    .line 73
    new-instance v0, Ls0/b;

    .line 74
    .line 75
    const-string v1, "SERVICE_WORKER_BASIC_USAGE"

    .line 76
    .line 77
    const/4 v2, 0x1

    .line 78
    invoke-direct {v0, v1, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 79
    .line 80
    .line 81
    new-instance v0, Ls0/b;

    .line 82
    .line 83
    const-string v1, "SERVICE_WORKER_CACHE_MODE"

    .line 84
    .line 85
    invoke-direct {v0, v1, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 86
    .line 87
    .line 88
    new-instance v0, Ls0/b;

    .line 89
    .line 90
    const-string v1, "SERVICE_WORKER_CONTENT_ACCESS"

    .line 91
    .line 92
    invoke-direct {v0, v1, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 93
    .line 94
    .line 95
    new-instance v0, Ls0/b;

    .line 96
    .line 97
    const-string v1, "SERVICE_WORKER_FILE_ACCESS"

    .line 98
    .line 99
    invoke-direct {v0, v1, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 100
    .line 101
    .line 102
    new-instance v0, Ls0/b;

    .line 103
    .line 104
    const-string v1, "SERVICE_WORKER_BLOCK_NETWORK_LOADS"

    .line 105
    .line 106
    invoke-direct {v0, v1, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 107
    .line 108
    .line 109
    new-instance v0, Ls0/b;

    .line 110
    .line 111
    const-string v1, "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST"

    .line 112
    .line 113
    invoke-direct {v0, v1, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 114
    .line 115
    .line 116
    new-instance v0, Ls0/b;

    .line 117
    .line 118
    const-string v1, "RECEIVE_WEB_RESOURCE_ERROR"

    .line 119
    .line 120
    const/4 v2, 0x0

    .line 121
    invoke-direct {v0, v1, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 122
    .line 123
    .line 124
    new-instance v0, Ls0/b;

    .line 125
    .line 126
    const-string v1, "RECEIVE_HTTP_ERROR"

    .line 127
    .line 128
    invoke-direct {v0, v1, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 129
    .line 130
    .line 131
    new-instance v0, Ls0/b;

    .line 132
    .line 133
    const-string v1, "SHOULD_OVERRIDE_WITH_REDIRECTS"

    .line 134
    .line 135
    const/4 v2, 0x1

    .line 136
    invoke-direct {v0, v1, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 137
    .line 138
    .line 139
    new-instance v0, Ls0/b;

    .line 140
    .line 141
    const-string v1, "SAFE_BROWSING_HIT"

    .line 142
    .line 143
    const/4 v2, 0x4

    .line 144
    invoke-direct {v0, v1, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 145
    .line 146
    .line 147
    new-instance v0, Ls0/b;

    .line 148
    .line 149
    const-string v1, "WEB_RESOURCE_REQUEST_IS_REDIRECT"

    .line 150
    .line 151
    const/4 v2, 0x1

    .line 152
    invoke-direct {v0, v1, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 153
    .line 154
    .line 155
    new-instance v0, Ls0/b;

    .line 156
    .line 157
    const-string v1, "WEB_RESOURCE_ERROR_GET_DESCRIPTION"

    .line 158
    .line 159
    const/4 v2, 0x0

    .line 160
    invoke-direct {v0, v1, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 161
    .line 162
    .line 163
    new-instance v0, Ls0/b;

    .line 164
    .line 165
    const-string v1, "WEB_RESOURCE_ERROR_GET_CODE"

    .line 166
    .line 167
    invoke-direct {v0, v1, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 168
    .line 169
    .line 170
    new-instance v0, Ls0/b;

    .line 171
    .line 172
    const-string v1, "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY"

    .line 173
    .line 174
    const/4 v2, 0x4

    .line 175
    invoke-direct {v0, v1, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 176
    .line 177
    .line 178
    new-instance v0, Ls0/b;

    .line 179
    .line 180
    const-string v1, "SAFE_BROWSING_RESPONSE_PROCEED"

    .line 181
    .line 182
    invoke-direct {v0, v1, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 183
    .line 184
    .line 185
    new-instance v0, Ls0/b;

    .line 186
    .line 187
    const-string v1, "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL"

    .line 188
    .line 189
    invoke-direct {v0, v1, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 190
    .line 191
    .line 192
    new-instance v0, Ls0/b;

    .line 193
    .line 194
    const-string v1, "WEB_MESSAGE_PORT_POST_MESSAGE"

    .line 195
    .line 196
    const/4 v2, 0x0

    .line 197
    invoke-direct {v0, v1, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 198
    .line 199
    .line 200
    new-instance v0, Ls0/b;

    .line 201
    .line 202
    const-string v1, "WEB_MESSAGE_PORT_CLOSE"

    .line 203
    .line 204
    invoke-direct {v0, v1, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 205
    .line 206
    .line 207
    new-instance v0, Ls0/b;

    .line 208
    .line 209
    const-string v1, "WEB_MESSAGE_ARRAY_BUFFER"

    .line 210
    .line 211
    const/4 v2, 0x2

    .line 212
    invoke-direct {v0, v1, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 213
    .line 214
    .line 215
    new-instance v0, Ls0/b;

    .line 216
    .line 217
    const-string v1, "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK"

    .line 218
    .line 219
    const/4 v2, 0x0

    .line 220
    invoke-direct {v0, v1, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 221
    .line 222
    .line 223
    new-instance v0, Ls0/b;

    .line 224
    .line 225
    const-string v1, "CREATE_WEB_MESSAGE_CHANNEL"

    .line 226
    .line 227
    invoke-direct {v0, v1, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 228
    .line 229
    .line 230
    new-instance v0, Ls0/b;

    .line 231
    .line 232
    const-string v1, "POST_WEB_MESSAGE"

    .line 233
    .line 234
    invoke-direct {v0, v1, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 235
    .line 236
    .line 237
    new-instance v0, Ls0/b;

    .line 238
    .line 239
    const-string v1, "WEB_MESSAGE_CALLBACK_ON_MESSAGE"

    .line 240
    .line 241
    invoke-direct {v0, v1, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 242
    .line 243
    .line 244
    new-instance v0, Ls0/b;

    .line 245
    .line 246
    const-string v1, "GET_WEB_VIEW_CLIENT"

    .line 247
    .line 248
    const/4 v2, 0x3

    .line 249
    invoke-direct {v0, v1, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 250
    .line 251
    .line 252
    new-instance v0, Ls0/b;

    .line 253
    .line 254
    const-string v1, "GET_WEB_CHROME_CLIENT"

    .line 255
    .line 256
    invoke-direct {v0, v1, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 257
    .line 258
    .line 259
    new-instance v0, Ls0/b;

    .line 260
    .line 261
    const-string v1, "GET_WEB_VIEW_RENDERER"

    .line 262
    .line 263
    const/4 v2, 0x6

    .line 264
    invoke-direct {v0, v1, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 265
    .line 266
    .line 267
    new-instance v0, Ls0/b;

    .line 268
    .line 269
    const-string v1, "WEB_VIEW_RENDERER_TERMINATE"

    .line 270
    .line 271
    invoke-direct {v0, v1, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 272
    .line 273
    .line 274
    new-instance v0, Ls0/b;

    .line 275
    .line 276
    const-string v1, "TRACING_CONTROLLER_BASIC_USAGE"

    .line 277
    .line 278
    const/4 v2, 0x5

    .line 279
    invoke-direct {v0, v1, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 280
    .line 281
    .line 282
    new-instance v0, Ls0/f;

    .line 283
    .line 284
    invoke-direct {v0}, Ls0/f;-><init>()V

    .line 285
    .line 286
    .line 287
    new-instance v0, Ls0/f;

    .line 288
    .line 289
    invoke-direct {v0}, Ls0/f;-><init>()V

    .line 290
    .line 291
    .line 292
    new-instance v0, Ls0/f;

    .line 293
    .line 294
    invoke-direct {v0}, Ls0/f;-><init>()V

    .line 295
    .line 296
    .line 297
    new-instance v0, Ls0/b;

    .line 298
    .line 299
    const-string v1, "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"

    .line 300
    .line 301
    const/4 v2, 0x6

    .line 302
    invoke-direct {v0, v1, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 303
    .line 304
    .line 305
    new-instance v0, Ls0/h;

    .line 306
    .line 307
    invoke-direct {v0}, Ls0/h;-><init>()V

    .line 308
    .line 309
    .line 310
    new-instance v0, Ls0/b;

    .line 311
    .line 312
    const-string v1, "PROXY_OVERRIDE:3"

    .line 313
    .line 314
    const/4 v2, 0x2

    .line 315
    const-string v3, "PROXY_OVERRIDE"

    .line 316
    .line 317
    invoke-direct {v0, v3, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 318
    .line 319
    .line 320
    new-instance v0, Ls0/b;

    .line 321
    .line 322
    const-string v1, "MULTI_PROCESS_QUERY"

    .line 323
    .line 324
    const-string v3, "MULTI_PROCESS"

    .line 325
    .line 326
    invoke-direct {v0, v3, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 327
    .line 328
    .line 329
    sput-object v0, Ls0/j;->a:Ls0/b;

    .line 330
    .line 331
    new-instance v0, Ls0/b;

    .line 332
    .line 333
    const-string v1, "FORCE_DARK"

    .line 334
    .line 335
    const/4 v2, 0x6

    .line 336
    invoke-direct {v0, v1, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 337
    .line 338
    .line 339
    new-instance v0, Ls0/b;

    .line 340
    .line 341
    const-string v1, "FORCE_DARK_BEHAVIOR"

    .line 342
    .line 343
    const/4 v2, 0x2

    .line 344
    const-string v3, "FORCE_DARK_STRATEGY"

    .line 345
    .line 346
    invoke-direct {v0, v3, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 347
    .line 348
    .line 349
    new-instance v0, Ls0/b;

    .line 350
    .line 351
    const-string v1, "WEB_MESSAGE_LISTENER"

    .line 352
    .line 353
    invoke-direct {v0, v1, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 354
    .line 355
    .line 356
    new-instance v0, Ls0/b;

    .line 357
    .line 358
    const-string v1, "DOCUMENT_START_SCRIPT:1"

    .line 359
    .line 360
    const-string v3, "DOCUMENT_START_SCRIPT"

    .line 361
    .line 362
    invoke-direct {v0, v3, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 363
    .line 364
    .line 365
    new-instance v0, Ls0/b;

    .line 366
    .line 367
    const-string v1, "PROXY_OVERRIDE_REVERSE_BYPASS"

    .line 368
    .line 369
    invoke-direct {v0, v1, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 370
    .line 371
    .line 372
    new-instance v0, Ls0/b;

    .line 373
    .line 374
    const-string v1, "GET_VARIATIONS_HEADER"

    .line 375
    .line 376
    invoke-direct {v0, v1, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 377
    .line 378
    .line 379
    new-instance v0, Ls0/b;

    .line 380
    .line 381
    const-string v1, "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY"

    .line 382
    .line 383
    invoke-direct {v0, v1, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 384
    .line 385
    .line 386
    new-instance v0, Ls0/b;

    .line 387
    .line 388
    const-string v1, "GET_COOKIE_INFO"

    .line 389
    .line 390
    invoke-direct {v0, v1, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 391
    .line 392
    .line 393
    new-instance v0, Ls0/b;

    .line 394
    .line 395
    const-string v1, "REQUESTED_WITH_HEADER_ALLOW_LIST"

    .line 396
    .line 397
    const-string v3, "REQUESTED_WITH_HEADER_ALLOW_LIST"

    .line 398
    .line 399
    invoke-direct {v0, v3, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 400
    .line 401
    .line 402
    new-instance v0, Ls0/b;

    .line 403
    .line 404
    const/4 v1, 0x2

    .line 405
    const-string v2, "USER_AGENT_METADATA"

    .line 406
    .line 407
    invoke-direct {v0, v2, v1, v2}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 408
    .line 409
    .line 410
    new-instance v0, Ls0/i;

    .line 411
    .line 412
    const-string v1, "USER_AGENT_METADATA_FORM_FACTORS"

    .line 413
    .line 414
    const/4 v3, 0x0

    .line 415
    invoke-direct {v0, v1, v3, v2}, Ls0/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 416
    .line 417
    .line 418
    new-instance v0, Ls0/i;

    .line 419
    .line 420
    const-string v1, "MULTI_PROFILE"

    .line 421
    .line 422
    const/4 v2, 0x1

    .line 423
    const-string v3, "MULTI_PROFILE"

    .line 424
    .line 425
    invoke-direct {v0, v3, v2, v1}, Ls0/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 426
    .line 427
    .line 428
    new-instance v0, Ls0/b;

    .line 429
    .line 430
    const-string v1, "ATTRIBUTION_BEHAVIOR"

    .line 431
    .line 432
    const/4 v2, 0x2

    .line 433
    const-string v3, "ATTRIBUTION_REGISTRATION_BEHAVIOR"

    .line 434
    .line 435
    invoke-direct {v0, v3, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 436
    .line 437
    .line 438
    new-instance v0, Ls0/b;

    .line 439
    .line 440
    const-string v1, "WEBVIEW_INTEGRITY_API_STATUS"

    .line 441
    .line 442
    const-string v3, "WEBVIEW_MEDIA_INTEGRITY_API_STATUS"

    .line 443
    .line 444
    invoke-direct {v0, v3, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 445
    .line 446
    .line 447
    new-instance v0, Ls0/b;

    .line 448
    .line 449
    const-string v1, "MUTE_AUDIO"

    .line 450
    .line 451
    const-string v3, "MUTE_AUDIO"

    .line 452
    .line 453
    invoke-direct {v0, v3, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 454
    .line 455
    .line 456
    new-instance v0, Ls0/b;

    .line 457
    .line 458
    const-string v1, "WEB_AUTHENTICATION"

    .line 459
    .line 460
    const-string v3, "WEB_AUTHENTICATION"

    .line 461
    .line 462
    invoke-direct {v0, v3, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 463
    .line 464
    .line 465
    new-instance v0, Ls0/b;

    .line 466
    .line 467
    const-string v1, "SPECULATIVE_LOADING"

    .line 468
    .line 469
    const-string v3, "SPECULATIVE_LOADING_STATUS"

    .line 470
    .line 471
    invoke-direct {v0, v3, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 472
    .line 473
    .line 474
    new-instance v0, Ls0/b;

    .line 475
    .line 476
    const-string v1, "BACK_FORWARD_CACHE"

    .line 477
    .line 478
    const-string v3, "BACK_FORWARD_CACHE"

    .line 479
    .line 480
    invoke-direct {v0, v3, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 481
    .line 482
    .line 483
    new-instance v0, Ls0/b;

    .line 484
    .line 485
    const-string v1, "BACK_FORWARD_CACHE_SETTINGS"

    .line 486
    .line 487
    const-string v3, "BACK_FORWARD_CACHE_SETTINGS"

    .line 488
    .line 489
    invoke-direct {v0, v3, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 490
    .line 491
    .line 492
    new-instance v0, Ls0/b;

    .line 493
    .line 494
    const-string v1, "WEB_STORAGE_DELETE_BROWSING_DATA"

    .line 495
    .line 496
    const-string v3, "DELETE_BROWSING_DATA"

    .line 497
    .line 498
    invoke-direct {v0, v3, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 499
    .line 500
    .line 501
    new-instance v0, Ls0/i;

    .line 502
    .line 503
    const-string v1, "PREFETCH_URL_V5"

    .line 504
    .line 505
    const-string v3, "PREFETCH_URL_V5"

    .line 506
    .line 507
    invoke-direct {v0, v3, v2, v1}, Ls0/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 508
    .line 509
    .line 510
    new-instance v0, Ls0/b;

    .line 511
    .line 512
    const-string v1, "ASYNC_WEBVIEW_STARTUP"

    .line 513
    .line 514
    const-string v3, "IMPLEMENTATION_ONLY_FEATURE"

    .line 515
    .line 516
    invoke-direct {v0, v3, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 517
    .line 518
    .line 519
    new-instance v0, Ls0/b;

    .line 520
    .line 521
    const-string v1, "ASYNC_WEBVIEW_STARTUP_ASYNC_STARTUP_LOCATIONS"

    .line 522
    .line 523
    const-string v3, "IMPLEMENTATION_ONLY_FEATURE"

    .line 524
    .line 525
    invoke-direct {v0, v3, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 526
    .line 527
    .line 528
    new-instance v0, Ls0/b;

    .line 529
    .line 530
    const-string v1, "DEFAULT_TRAFFICSTATS_TAGGING"

    .line 531
    .line 532
    const-string v3, "DEFAULT_TRAFFICSTATS_TAGGING"

    .line 533
    .line 534
    invoke-direct {v0, v3, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 535
    .line 536
    .line 537
    new-instance v0, Ls0/b;

    .line 538
    .line 539
    const-string v1, "PRERENDER_URL_V3"

    .line 540
    .line 541
    const-string v3, "PRERENDER_URL_V2"

    .line 542
    .line 543
    invoke-direct {v0, v3, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 544
    .line 545
    .line 546
    new-instance v0, Ls0/b;

    .line 547
    .line 548
    const-string v1, "SPECULATIVE_LOADING_CONFIG_V2"

    .line 549
    .line 550
    const-string v3, "SPECULATIVE_LOADING_CONFIG_V2"

    .line 551
    .line 552
    invoke-direct {v0, v3, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 553
    .line 554
    .line 555
    new-instance v0, Ls0/b;

    .line 556
    .line 557
    const-string v1, "SAVE_STATE"

    .line 558
    .line 559
    const-string v3, "SAVE_STATE"

    .line 560
    .line 561
    invoke-direct {v0, v3, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 562
    .line 563
    .line 564
    new-instance v0, Ls0/b;

    .line 565
    .line 566
    const-string v1, "WEB_VIEW_NAVIGATION_CLIENT_BASIC_USAGE"

    .line 567
    .line 568
    const-string v3, "WEB_VIEW_NAVIGATION_CLIENT_BASIC_USAGE"

    .line 569
    .line 570
    invoke-direct {v0, v3, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 571
    .line 572
    .line 573
    new-instance v0, Ls0/b;

    .line 574
    .line 575
    const-string v1, "WEB_VIEW_NAVIGATION_LISTENER_V1"

    .line 576
    .line 577
    const-string v3, "NAVIGATION_LISTENER_V1"

    .line 578
    .line 579
    invoke-direct {v0, v3, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 580
    .line 581
    .line 582
    new-instance v0, Ls0/b;

    .line 583
    .line 584
    const-string v1, "PROVIDER_WEAKLY_REF_WEBVIEW"

    .line 585
    .line 586
    const-string v3, "PROVIDER_WEAKLY_REF_WEBVIEW"

    .line 587
    .line 588
    invoke-direct {v0, v3, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 589
    .line 590
    .line 591
    new-instance v0, Ls0/b;

    .line 592
    .line 593
    const-string v1, "PAYMENT_REQUEST"

    .line 594
    .line 595
    const-string v3, "PAYMENT_REQUEST"

    .line 596
    .line 597
    invoke-direct {v0, v3, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 598
    .line 599
    .line 600
    sput-object v0, Ls0/j;->b:Ls0/b;

    .line 601
    .line 602
    new-instance v0, Ls0/b;

    .line 603
    .line 604
    const-string v1, "WEBVIEW_BUILDER_V1"

    .line 605
    .line 606
    const-string v3, "WEBVIEW_BUILDER_EXPERIMENTAL_V1"

    .line 607
    .line 608
    invoke-direct {v0, v3, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 609
    .line 610
    .line 611
    new-instance v0, Ls0/b;

    .line 612
    .line 613
    const-string v1, "COOKIE_INTERCEPT"

    .line 614
    .line 615
    const-string v3, "COOKIE_INTERCEPT"

    .line 616
    .line 617
    invoke-direct {v0, v3, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 618
    .line 619
    .line 620
    new-instance v0, Ls0/b;

    .line 621
    .line 622
    const-string v1, "WARM_UP_RENDERER_PROCESS"

    .line 623
    .line 624
    const-string v3, "WARM_UP_RENDERER_PROCESS"

    .line 625
    .line 626
    invoke-direct {v0, v3, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 627
    .line 628
    .line 629
    new-instance v0, Ls0/b;

    .line 630
    .line 631
    const-string v1, "EXTRA_HEADER_FOR_ORIGINS"

    .line 632
    .line 633
    const-string v3, "ORIGIN_MATCHED_HEADERS"

    .line 634
    .line 635
    invoke-direct {v0, v3, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 636
    .line 637
    .line 638
    new-instance v0, Ls0/b;

    .line 639
    .line 640
    const-string v1, "CUSTOM_REQUEST_HEADERS"

    .line 641
    .line 642
    const-string v3, "CUSTOM_REQUEST_HEADERS"

    .line 643
    .line 644
    invoke-direct {v0, v3, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 645
    .line 646
    .line 647
    new-instance v0, Ls0/f;

    .line 648
    .line 649
    invoke-direct {v0}, Ls0/f;-><init>()V

    .line 650
    .line 651
    .line 652
    new-instance v0, Ls0/f;

    .line 653
    .line 654
    invoke-direct {v0}, Ls0/f;-><init>()V

    .line 655
    .line 656
    .line 657
    new-instance v0, Ls0/f;

    .line 658
    .line 659
    invoke-direct {v0}, Ls0/f;-><init>()V

    .line 660
    .line 661
    .line 662
    new-instance v0, Ls0/b;

    .line 663
    .line 664
    const-string v1, "PRECONNECT"

    .line 665
    .line 666
    const-string v3, "PRECONNECT"

    .line 667
    .line 668
    invoke-direct {v0, v3, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 669
    .line 670
    .line 671
    new-instance v0, Ls0/b;

    .line 672
    .line 673
    const-string v1, "ADD_QUIC_HINTS_V1"

    .line 674
    .line 675
    const-string v3, "ADD_QUIC_HINTS"

    .line 676
    .line 677
    invoke-direct {v0, v3, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 678
    .line 679
    .line 680
    new-instance v0, Ls0/b;

    .line 681
    .line 682
    const-string v1, "HYPERLINK_CONTEXT_MENU_ITEMS"

    .line 683
    .line 684
    const-string v3, "HYPERLINK_CONTEXT_MENU_ITEMS"

    .line 685
    .line 686
    invoke-direct {v0, v3, v2, v1}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 687
    .line 688
    .line 689
    return-void
.end method

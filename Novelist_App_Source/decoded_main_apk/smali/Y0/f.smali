.class public abstract LY0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LJ0/c;

.field public static final b:LJ0/c;

.field public static final c:LJ0/c;

.field public static final d:LJ0/c;

.field public static final e:LJ0/c;

.field public static final f:[LJ0/c;


# direct methods
.method static constructor <clinit>()V
    .locals 29

    .line 1
    new-instance v0, LJ0/c;

    .line 2
    .line 3
    const/4 v5, 0x1

    .line 4
    const/4 v2, -0x1

    .line 5
    const-string v1, "auth_api_credentials_begin_sign_in"

    .line 6
    .line 7
    const-wide/16 v3, 0x9

    .line 8
    .line 9
    invoke-direct/range {v0 .. v5}, LJ0/c;-><init>(Ljava/lang/String;IJZ)V

    .line 10
    .line 11
    .line 12
    new-instance v1, LJ0/c;

    .line 13
    .line 14
    const/4 v6, 0x1

    .line 15
    const/4 v3, -0x1

    .line 16
    const-string v2, "auth_api_credentials_sign_out"

    .line 17
    .line 18
    const-wide/16 v4, 0x2

    .line 19
    .line 20
    invoke-direct/range {v1 .. v6}, LJ0/c;-><init>(Ljava/lang/String;IJZ)V

    .line 21
    .line 22
    .line 23
    sput-object v1, LY0/f;->a:LJ0/c;

    .line 24
    .line 25
    new-instance v2, LJ0/c;

    .line 26
    .line 27
    const/4 v7, 0x1

    .line 28
    const/4 v4, -0x1

    .line 29
    const-string v3, "auth_api_credentials_authorize"

    .line 30
    .line 31
    const-wide/16 v5, 0x1

    .line 32
    .line 33
    invoke-direct/range {v2 .. v7}, LJ0/c;-><init>(Ljava/lang/String;IJZ)V

    .line 34
    .line 35
    .line 36
    sput-object v2, LY0/f;->b:LJ0/c;

    .line 37
    .line 38
    new-instance v3, LJ0/c;

    .line 39
    .line 40
    const/4 v8, 0x1

    .line 41
    const/4 v5, -0x1

    .line 42
    const-string v4, "auth_api_credentials_revoke_access"

    .line 43
    .line 44
    const-wide/16 v6, 0x1

    .line 45
    .line 46
    invoke-direct/range {v3 .. v8}, LJ0/c;-><init>(Ljava/lang/String;IJZ)V

    .line 47
    .line 48
    .line 49
    sput-object v3, LY0/f;->c:LJ0/c;

    .line 50
    .line 51
    new-instance v4, LJ0/c;

    .line 52
    .line 53
    const/4 v9, 0x1

    .line 54
    const/4 v6, -0x1

    .line 55
    const-string v5, "auth_api_credentials_clear_token"

    .line 56
    .line 57
    const-wide/16 v7, 0x1

    .line 58
    .line 59
    invoke-direct/range {v4 .. v9}, LJ0/c;-><init>(Ljava/lang/String;IJZ)V

    .line 60
    .line 61
    .line 62
    sput-object v4, LY0/f;->d:LJ0/c;

    .line 63
    .line 64
    new-instance v5, LJ0/c;

    .line 65
    .line 66
    const/4 v10, 0x1

    .line 67
    const/4 v7, -0x1

    .line 68
    const-string v6, "auth_api_credentials_save_password"

    .line 69
    .line 70
    const-wide/16 v8, 0x4

    .line 71
    .line 72
    invoke-direct/range {v5 .. v10}, LJ0/c;-><init>(Ljava/lang/String;IJZ)V

    .line 73
    .line 74
    .line 75
    new-instance v6, LJ0/c;

    .line 76
    .line 77
    const/4 v11, 0x1

    .line 78
    const/4 v8, -0x1

    .line 79
    const-string v7, "auth_api_credentials_get_sign_in_intent"

    .line 80
    .line 81
    const-wide/16 v9, 0x6

    .line 82
    .line 83
    invoke-direct/range {v6 .. v11}, LJ0/c;-><init>(Ljava/lang/String;IJZ)V

    .line 84
    .line 85
    .line 86
    sput-object v6, LY0/f;->e:LJ0/c;

    .line 87
    .line 88
    new-instance v7, LJ0/c;

    .line 89
    .line 90
    const/4 v12, 0x1

    .line 91
    const/4 v9, -0x1

    .line 92
    const-string v8, "auth_api_credentials_save_account_linking_token"

    .line 93
    .line 94
    const-wide/16 v10, 0x3

    .line 95
    .line 96
    invoke-direct/range {v7 .. v12}, LJ0/c;-><init>(Ljava/lang/String;IJZ)V

    .line 97
    .line 98
    .line 99
    new-instance v8, LJ0/c;

    .line 100
    .line 101
    const/4 v13, 0x1

    .line 102
    const/4 v10, -0x1

    .line 103
    const-string v9, "auth_api_credentials_get_phone_number_hint_intent"

    .line 104
    .line 105
    const-wide/16 v11, 0x3

    .line 106
    .line 107
    invoke-direct/range {v8 .. v13}, LJ0/c;-><init>(Ljava/lang/String;IJZ)V

    .line 108
    .line 109
    .line 110
    new-instance v9, LJ0/c;

    .line 111
    .line 112
    const/4 v14, 0x1

    .line 113
    const/4 v11, -0x1

    .line 114
    const-string v10, "auth_api_credentials_verify_with_google"

    .line 115
    .line 116
    const-wide/16 v12, 0x1

    .line 117
    .line 118
    invoke-direct/range {v9 .. v14}, LJ0/c;-><init>(Ljava/lang/String;IJZ)V

    .line 119
    .line 120
    .line 121
    new-instance v10, LJ0/c;

    .line 122
    .line 123
    const/4 v15, 0x1

    .line 124
    const/4 v12, -0x1

    .line 125
    const-string v11, "auth_api_credentials_credential_provider"

    .line 126
    .line 127
    const-wide/16 v13, 0x1

    .line 128
    .line 129
    invoke-direct/range {v10 .. v15}, LJ0/c;-><init>(Ljava/lang/String;IJZ)V

    .line 130
    .line 131
    .line 132
    new-instance v11, LJ0/c;

    .line 133
    .line 134
    const/16 v16, 0x1

    .line 135
    .line 136
    const/4 v13, -0x1

    .line 137
    const-string v12, "auth_api_credentials_save_webauthn_credential_specifics"

    .line 138
    .line 139
    const-wide/16 v14, 0x1

    .line 140
    .line 141
    invoke-direct/range {v11 .. v16}, LJ0/c;-><init>(Ljava/lang/String;IJZ)V

    .line 142
    .line 143
    .line 144
    new-instance v12, LJ0/c;

    .line 145
    .line 146
    const/16 v17, 0x1

    .line 147
    .line 148
    const/4 v14, -0x1

    .line 149
    const-string v13, "auth_api_credentials_delete_webauthn_credential_specifics"

    .line 150
    .line 151
    const-wide/16 v15, 0x1

    .line 152
    .line 153
    invoke-direct/range {v12 .. v17}, LJ0/c;-><init>(Ljava/lang/String;IJZ)V

    .line 154
    .line 155
    .line 156
    new-instance v13, LJ0/c;

    .line 157
    .line 158
    const/16 v18, 0x1

    .line 159
    .line 160
    const/4 v15, -0x1

    .line 161
    const-string v14, "auth_api_credentials_list_webauthn_credential_specifics"

    .line 162
    .line 163
    const-wide/16 v16, 0x1

    .line 164
    .line 165
    invoke-direct/range {v13 .. v18}, LJ0/c;-><init>(Ljava/lang/String;IJZ)V

    .line 166
    .line 167
    .line 168
    new-instance v14, LJ0/c;

    .line 169
    .line 170
    const/16 v19, 0x1

    .line 171
    .line 172
    const/16 v16, -0x1

    .line 173
    .line 174
    const-string v15, "auth_api_credentials_get_google_passkey_for_export"

    .line 175
    .line 176
    const-wide/16 v17, 0x2

    .line 177
    .line 178
    invoke-direct/range {v14 .. v19}, LJ0/c;-><init>(Ljava/lang/String;IJZ)V

    .line 179
    .line 180
    .line 181
    new-instance v16, LJ0/c;

    .line 182
    .line 183
    const/16 v20, 0x1

    .line 184
    .line 185
    const/16 v17, -0x1

    .line 186
    .line 187
    move-object/from16 v15, v16

    .line 188
    .line 189
    const-string v16, "auth_api_credentials_get_authentication_intent"

    .line 190
    .line 191
    const-wide/16 v18, 0x1

    .line 192
    .line 193
    invoke-direct/range {v15 .. v20}, LJ0/c;-><init>(Ljava/lang/String;IJZ)V

    .line 194
    .line 195
    .line 196
    new-instance v16, LJ0/c;

    .line 197
    .line 198
    const/16 v21, 0x1

    .line 199
    .line 200
    const/16 v18, -0x1

    .line 201
    .line 202
    const-string v17, "auth_api_credentials_get_registration_intent"

    .line 203
    .line 204
    const-wide/16 v19, 0x1

    .line 205
    .line 206
    invoke-direct/range {v16 .. v21}, LJ0/c;-><init>(Ljava/lang/String;IJZ)V

    .line 207
    .line 208
    .line 209
    new-instance v17, LJ0/c;

    .line 210
    .line 211
    const/16 v22, 0x1

    .line 212
    .line 213
    const/16 v19, -0x1

    .line 214
    .line 215
    const-string v18, "auth_api_credentials_check_key_availability"

    .line 216
    .line 217
    const-wide/16 v20, 0x1

    .line 218
    .line 219
    invoke-direct/range {v17 .. v22}, LJ0/c;-><init>(Ljava/lang/String;IJZ)V

    .line 220
    .line 221
    .line 222
    new-instance v18, LJ0/c;

    .line 223
    .line 224
    const/16 v23, 0x1

    .line 225
    .line 226
    const/16 v20, -0x1

    .line 227
    .line 228
    const-string v19, "auth_api_credentials_has_discoverable_key"

    .line 229
    .line 230
    const-wide/16 v21, 0x1

    .line 231
    .line 232
    invoke-direct/range {v18 .. v23}, LJ0/c;-><init>(Ljava/lang/String;IJZ)V

    .line 233
    .line 234
    .line 235
    new-instance v19, LJ0/c;

    .line 236
    .line 237
    const/16 v24, 0x1

    .line 238
    .line 239
    const/16 v21, -0x1

    .line 240
    .line 241
    const-string v20, "auth_api_credentials_validate_calling_browser"

    .line 242
    .line 243
    const-wide/16 v22, 0x1

    .line 244
    .line 245
    invoke-direct/range {v19 .. v24}, LJ0/c;-><init>(Ljava/lang/String;IJZ)V

    .line 246
    .line 247
    .line 248
    new-instance v20, LJ0/c;

    .line 249
    .line 250
    const/16 v25, 0x1

    .line 251
    .line 252
    const/16 v22, -0x1

    .line 253
    .line 254
    const-string v21, "auth_api_credentials_validate_rp_id_and_calling_package"

    .line 255
    .line 256
    const-wide/16 v23, 0x1

    .line 257
    .line 258
    invoke-direct/range {v20 .. v25}, LJ0/c;-><init>(Ljava/lang/String;IJZ)V

    .line 259
    .line 260
    .line 261
    new-instance v21, LJ0/c;

    .line 262
    .line 263
    const/16 v26, 0x1

    .line 264
    .line 265
    const/16 v23, -0x1

    .line 266
    .line 267
    const-string v22, "auth_api_credentials_get_credential_list_for_browser"

    .line 268
    .line 269
    const-wide/16 v24, 0x1

    .line 270
    .line 271
    invoke-direct/range {v21 .. v26}, LJ0/c;-><init>(Ljava/lang/String;IJZ)V

    .line 272
    .line 273
    .line 274
    new-instance v22, LJ0/c;

    .line 275
    .line 276
    const/16 v27, 0x1

    .line 277
    .line 278
    const/16 v24, -0x1

    .line 279
    .line 280
    const-string v23, "auth_api_credentials_share_passwords_with_ai_agent"

    .line 281
    .line 282
    const-wide/16 v25, 0x1

    .line 283
    .line 284
    invoke-direct/range {v22 .. v27}, LJ0/c;-><init>(Ljava/lang/String;IJZ)V

    .line 285
    .line 286
    .line 287
    new-instance v23, LJ0/c;

    .line 288
    .line 289
    const/16 v28, 0x1

    .line 290
    .line 291
    const/16 v25, -0x1

    .line 292
    .line 293
    const-string v24, "auth_api_credentials_update_webauthn_credential_specifics"

    .line 294
    .line 295
    const-wide/16 v26, 0x1

    .line 296
    .line 297
    invoke-direct/range {v23 .. v28}, LJ0/c;-><init>(Ljava/lang/String;IJZ)V

    .line 298
    .line 299
    .line 300
    move-object/from16 v24, v23

    .line 301
    .line 302
    move-object/from16 v23, v22

    .line 303
    .line 304
    move-object/from16 v22, v21

    .line 305
    .line 306
    move-object/from16 v21, v20

    .line 307
    .line 308
    move-object/from16 v20, v19

    .line 309
    .line 310
    move-object/from16 v19, v18

    .line 311
    .line 312
    move-object/from16 v18, v17

    .line 313
    .line 314
    move-object/from16 v17, v16

    .line 315
    .line 316
    move-object/from16 v16, v15

    .line 317
    .line 318
    move-object v15, v14

    .line 319
    move-object v14, v13

    .line 320
    move-object v13, v12

    .line 321
    move-object v12, v11

    .line 322
    move-object v11, v10

    .line 323
    move-object v10, v9

    .line 324
    move-object v9, v8

    .line 325
    move-object v8, v7

    .line 326
    move-object v7, v6

    .line 327
    move-object v6, v5

    .line 328
    move-object v5, v4

    .line 329
    move-object v4, v3

    .line 330
    move-object v3, v2

    .line 331
    move-object v2, v1

    .line 332
    move-object v1, v0

    .line 333
    filled-new-array/range {v1 .. v24}, [LJ0/c;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    sput-object v0, LY0/f;->f:[LJ0/c;

    .line 338
    .line 339
    return-void
.end method

.method public static a()LK0/f;
    .locals 4

    .line 1
    new-instance v0, LK0/g;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, -0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-direct {v0, v2, v2, v3, v1}, LK0/g;-><init>(IIIZ)V

    .line 7
    .line 8
    .line 9
    new-instance v1, LK0/f;

    .line 10
    .line 11
    invoke-direct {v1, v0, v3}, LK0/f;-><init>(LK0/g;Z)V

    .line 12
    .line 13
    .line 14
    iput-boolean v3, v1, LK0/f;->m:Z

    .line 15
    .line 16
    return-object v1
.end method

.method public static varargs b(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 7

    .line 1
    array-length v0, p1

    .line 2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    mul-int/lit8 v0, v0, 0x10

    .line 7
    .line 8
    new-instance v2, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    add-int/2addr v1, v0

    .line 11
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    move v1, v0

    .line 16
    :goto_0
    array-length v3, p1

    .line 17
    if-ge v0, v3, :cond_1

    .line 18
    .line 19
    const-string v4, "%s"

    .line 20
    .line 21
    invoke-virtual {p0, v4, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    const/4 v5, -0x1

    .line 26
    if-ne v4, v5, :cond_0

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    invoke-virtual {v2, p0, v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    add-int/lit8 v1, v0, 0x1

    .line 33
    .line 34
    aget-object v0, p1, v0

    .line 35
    .line 36
    invoke-static {v0}, LY0/f;->d(Ljava/lang/Object;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    add-int/lit8 v0, v4, 0x2

    .line 44
    .line 45
    move v6, v1

    .line 46
    move v1, v0

    .line 47
    move v0, v6

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    invoke-virtual {v2, p0, v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    if-ge v0, v3, :cond_3

    .line 57
    .line 58
    const-string p0, " ["

    .line 59
    .line 60
    :goto_2
    array-length v1, p1

    .line 61
    if-ge v0, v1, :cond_2

    .line 62
    .line 63
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    aget-object p0, p1, v0

    .line 67
    .line 68
    invoke-static {p0}, LY0/f;->d(Ljava/lang/Object;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    add-int/lit8 v0, v0, 0x1

    .line 76
    .line 77
    const-string p0, ", "

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_2
    const/16 p0, 0x5d

    .line 81
    .line 82
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    :cond_3
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0
.end method

.method public static c(II)V
    .locals 2

    .line 1
    if-ltz p0, :cond_1

    .line 2
    .line 3
    if-lt p0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    return-void

    .line 7
    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 8
    .line 9
    const-string v1, "index"

    .line 10
    .line 11
    if-ltz p0, :cond_3

    .line 12
    .line 13
    if-gez p1, :cond_2

    .line 14
    .line 15
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 16
    .line 17
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    new-instance v1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    add-int/lit8 v0, v0, 0xf

    .line 28
    .line 29
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 30
    .line 31
    .line 32
    const-string v0, "negative size: "

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p0

    .line 48
    :cond_2
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    filled-new-array {v1, p0, p1}, [Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    const-string p1, "%s (%s) must be less than size (%s)"

    .line 61
    .line 62
    invoke-static {p1, p0}, LY0/f;->b(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    goto :goto_1

    .line 67
    :cond_3
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    filled-new-array {v1, p0}, [Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    const-string p1, "%s (%s) must not be negative"

    .line 76
    .line 77
    invoke-static {p1, p0}, LY0/f;->b(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    :goto_1
    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw v0
.end method

.method public static d(Ljava/lang/Object;)Ljava/lang/String;
    .locals 6

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, "null"

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    return-object p0

    .line 11
    :catch_0
    move-exception v0

    .line 12
    move-object v5, v0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    new-instance v3, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    add-int/2addr v1, v2

    .line 46
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v0, "@"

    .line 53
    .line 54
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    const-string v0, "com.google.common.base.Strings"

    .line 65
    .line 66
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    sget-object v1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 71
    .line 72
    const-string v3, "lenientToString"

    .line 73
    .line 74
    const-string v2, "Exception during lenientFormat for "

    .line 75
    .line 76
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    const-string v2, "com.google.common.base.Strings"

    .line 81
    .line 82
    invoke-virtual/range {v0 .. v5}, Ljava/util/logging/Logger;->logp(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    add-int/lit8 v1, v1, 0x8

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    new-instance v3, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    add-int/2addr v1, v2

    .line 106
    add-int/lit8 v1, v1, 0x1

    .line 107
    .line 108
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 109
    .line 110
    .line 111
    const-string v1, "<"

    .line 112
    .line 113
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    const-string p0, " threw "

    .line 120
    .line 121
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    const-string p0, ">"

    .line 128
    .line 129
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    return-object p0
.end method

.method public static e(III)V
    .locals 1

    .line 1
    if-ltz p0, :cond_1

    .line 2
    .line 3
    if-lt p1, p0, :cond_1

    .line 4
    .line 5
    if-le p1, p2, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    return-void

    .line 9
    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 10
    .line 11
    if-ltz p0, :cond_4

    .line 12
    .line 13
    if-gt p0, p2, :cond_4

    .line 14
    .line 15
    if-ltz p1, :cond_3

    .line 16
    .line 17
    if-le p1, p2, :cond_2

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    filled-new-array {p1, p0}, [Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const-string p1, "end index (%s) must not be less than start index (%s)"

    .line 33
    .line 34
    invoke-static {p1, p0}, LY0/f;->b(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    goto :goto_2

    .line 39
    :cond_3
    :goto_1
    const-string p0, "end index"

    .line 40
    .line 41
    invoke-static {p1, p0, p2}, LY0/f;->f(ILjava/lang/String;I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    goto :goto_2

    .line 46
    :cond_4
    const-string p1, "start index"

    .line 47
    .line 48
    invoke-static {p0, p1, p2}, LY0/f;->f(ILjava/lang/String;I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    :goto_2
    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw v0
.end method

.method public static f(ILjava/lang/String;I)Ljava/lang/String;
    .locals 1

    .line 1
    if-gez p0, :cond_0

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    filled-new-array {p1, p0}, [Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string p1, "%s (%s) must not be negative"

    .line 12
    .line 13
    invoke-static {p1, p0}, LY0/f;->b(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    if-ltz p2, :cond_1

    .line 19
    .line 20
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    filled-new-array {p1, p0, p2}, [Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const-string p1, "%s (%s) must not be greater than size (%s)"

    .line 33
    .line 34
    invoke-static {p1, p0}, LY0/f;->b(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 40
    .line 41
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    add-int/lit8 p1, p1, 0xf

    .line 52
    .line 53
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 54
    .line 55
    .line 56
    const-string p1, "negative size: "

    .line 57
    .line 58
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw p0
.end method

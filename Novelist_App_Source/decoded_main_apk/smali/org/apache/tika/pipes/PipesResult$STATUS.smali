.class public final enum Lorg/apache/tika/pipes/PipesResult$STATUS;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/tika/pipes/PipesResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "STATUS"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/apache/tika/pipes/PipesResult$STATUS;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/apache/tika/pipes/PipesResult$STATUS;

.field public static final enum CLIENT_UNAVAILABLE_WITHIN_MS:Lorg/apache/tika/pipes/PipesResult$STATUS;

.field public static final enum EMIT_EXCEPTION:Lorg/apache/tika/pipes/PipesResult$STATUS;

.field public static final enum EMIT_SUCCESS:Lorg/apache/tika/pipes/PipesResult$STATUS;

.field public static final enum EMIT_SUCCESS_PARSE_EXCEPTION:Lorg/apache/tika/pipes/PipesResult$STATUS;

.field public static final enum EMPTY_OUTPUT:Lorg/apache/tika/pipes/PipesResult$STATUS;

.field public static final enum FETCHER_INITIALIZATION_EXCEPTION:Lorg/apache/tika/pipes/PipesResult$STATUS;

.field public static final enum FETCH_EXCEPTION:Lorg/apache/tika/pipes/PipesResult$STATUS;

.field public static final enum INTERMEDIATE_RESULT:Lorg/apache/tika/pipes/PipesResult$STATUS;

.field public static final enum INTERRUPTED_EXCEPTION:Lorg/apache/tika/pipes/PipesResult$STATUS;

.field public static final enum NO_EMITTER_FOUND:Lorg/apache/tika/pipes/PipesResult$STATUS;

.field public static final enum NO_FETCHER_FOUND:Lorg/apache/tika/pipes/PipesResult$STATUS;

.field public static final enum OOM:Lorg/apache/tika/pipes/PipesResult$STATUS;

.field public static final enum PARSE_EXCEPTION_EMIT:Lorg/apache/tika/pipes/PipesResult$STATUS;

.field public static final enum PARSE_EXCEPTION_NO_EMIT:Lorg/apache/tika/pipes/PipesResult$STATUS;

.field public static final enum PARSE_SUCCESS:Lorg/apache/tika/pipes/PipesResult$STATUS;

.field public static final enum PARSE_SUCCESS_WITH_EXCEPTION:Lorg/apache/tika/pipes/PipesResult$STATUS;

.field public static final enum TIMEOUT:Lorg/apache/tika/pipes/PipesResult$STATUS;

.field public static final enum UNSPECIFIED_CRASH:Lorg/apache/tika/pipes/PipesResult$STATUS;


# direct methods
.method static constructor <clinit>()V
    .locals 20

    .line 1
    new-instance v1, Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 2
    .line 3
    const-string v0, "CLIENT_UNAVAILABLE_WITHIN_MS"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, v0, v2}, Lorg/apache/tika/pipes/PipesResult$STATUS;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v1, Lorg/apache/tika/pipes/PipesResult$STATUS;->CLIENT_UNAVAILABLE_WITHIN_MS:Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 10
    .line 11
    new-instance v2, Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 12
    .line 13
    const-string v0, "FETCHER_INITIALIZATION_EXCEPTION"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v2, v0, v3}, Lorg/apache/tika/pipes/PipesResult$STATUS;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v2, Lorg/apache/tika/pipes/PipesResult$STATUS;->FETCHER_INITIALIZATION_EXCEPTION:Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 20
    .line 21
    new-instance v3, Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 22
    .line 23
    const-string v0, "FETCH_EXCEPTION"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v3, v0, v4}, Lorg/apache/tika/pipes/PipesResult$STATUS;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Lorg/apache/tika/pipes/PipesResult$STATUS;->FETCH_EXCEPTION:Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 30
    .line 31
    new-instance v4, Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 32
    .line 33
    const-string v0, "EMPTY_OUTPUT"

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    invoke-direct {v4, v0, v5}, Lorg/apache/tika/pipes/PipesResult$STATUS;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v4, Lorg/apache/tika/pipes/PipesResult$STATUS;->EMPTY_OUTPUT:Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 40
    .line 41
    new-instance v5, Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 42
    .line 43
    const-string v0, "PARSE_EXCEPTION_NO_EMIT"

    .line 44
    .line 45
    const/4 v6, 0x4

    .line 46
    invoke-direct {v5, v0, v6}, Lorg/apache/tika/pipes/PipesResult$STATUS;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v5, Lorg/apache/tika/pipes/PipesResult$STATUS;->PARSE_EXCEPTION_NO_EMIT:Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 50
    .line 51
    new-instance v6, Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 52
    .line 53
    const-string v0, "PARSE_EXCEPTION_EMIT"

    .line 54
    .line 55
    const/4 v7, 0x5

    .line 56
    invoke-direct {v6, v0, v7}, Lorg/apache/tika/pipes/PipesResult$STATUS;-><init>(Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    sput-object v6, Lorg/apache/tika/pipes/PipesResult$STATUS;->PARSE_EXCEPTION_EMIT:Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 60
    .line 61
    new-instance v7, Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 62
    .line 63
    const-string v0, "PARSE_SUCCESS"

    .line 64
    .line 65
    const/4 v8, 0x6

    .line 66
    invoke-direct {v7, v0, v8}, Lorg/apache/tika/pipes/PipesResult$STATUS;-><init>(Ljava/lang/String;I)V

    .line 67
    .line 68
    .line 69
    sput-object v7, Lorg/apache/tika/pipes/PipesResult$STATUS;->PARSE_SUCCESS:Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 70
    .line 71
    new-instance v8, Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 72
    .line 73
    const-string v0, "PARSE_SUCCESS_WITH_EXCEPTION"

    .line 74
    .line 75
    const/4 v9, 0x7

    .line 76
    invoke-direct {v8, v0, v9}, Lorg/apache/tika/pipes/PipesResult$STATUS;-><init>(Ljava/lang/String;I)V

    .line 77
    .line 78
    .line 79
    sput-object v8, Lorg/apache/tika/pipes/PipesResult$STATUS;->PARSE_SUCCESS_WITH_EXCEPTION:Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 80
    .line 81
    new-instance v9, Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 82
    .line 83
    const-string v0, "OOM"

    .line 84
    .line 85
    const/16 v10, 0x8

    .line 86
    .line 87
    invoke-direct {v9, v0, v10}, Lorg/apache/tika/pipes/PipesResult$STATUS;-><init>(Ljava/lang/String;I)V

    .line 88
    .line 89
    .line 90
    sput-object v9, Lorg/apache/tika/pipes/PipesResult$STATUS;->OOM:Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 91
    .line 92
    new-instance v10, Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 93
    .line 94
    const-string v0, "TIMEOUT"

    .line 95
    .line 96
    const/16 v11, 0x9

    .line 97
    .line 98
    invoke-direct {v10, v0, v11}, Lorg/apache/tika/pipes/PipesResult$STATUS;-><init>(Ljava/lang/String;I)V

    .line 99
    .line 100
    .line 101
    sput-object v10, Lorg/apache/tika/pipes/PipesResult$STATUS;->TIMEOUT:Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 102
    .line 103
    new-instance v11, Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 104
    .line 105
    const-string v0, "UNSPECIFIED_CRASH"

    .line 106
    .line 107
    const/16 v12, 0xa

    .line 108
    .line 109
    invoke-direct {v11, v0, v12}, Lorg/apache/tika/pipes/PipesResult$STATUS;-><init>(Ljava/lang/String;I)V

    .line 110
    .line 111
    .line 112
    sput-object v11, Lorg/apache/tika/pipes/PipesResult$STATUS;->UNSPECIFIED_CRASH:Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 113
    .line 114
    new-instance v12, Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 115
    .line 116
    const-string v0, "NO_EMITTER_FOUND"

    .line 117
    .line 118
    const/16 v13, 0xb

    .line 119
    .line 120
    invoke-direct {v12, v0, v13}, Lorg/apache/tika/pipes/PipesResult$STATUS;-><init>(Ljava/lang/String;I)V

    .line 121
    .line 122
    .line 123
    sput-object v12, Lorg/apache/tika/pipes/PipesResult$STATUS;->NO_EMITTER_FOUND:Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 124
    .line 125
    new-instance v13, Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 126
    .line 127
    const-string v0, "EMIT_SUCCESS"

    .line 128
    .line 129
    const/16 v14, 0xc

    .line 130
    .line 131
    invoke-direct {v13, v0, v14}, Lorg/apache/tika/pipes/PipesResult$STATUS;-><init>(Ljava/lang/String;I)V

    .line 132
    .line 133
    .line 134
    sput-object v13, Lorg/apache/tika/pipes/PipesResult$STATUS;->EMIT_SUCCESS:Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 135
    .line 136
    new-instance v14, Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 137
    .line 138
    const-string v0, "EMIT_SUCCESS_PARSE_EXCEPTION"

    .line 139
    .line 140
    const/16 v15, 0xd

    .line 141
    .line 142
    invoke-direct {v14, v0, v15}, Lorg/apache/tika/pipes/PipesResult$STATUS;-><init>(Ljava/lang/String;I)V

    .line 143
    .line 144
    .line 145
    sput-object v14, Lorg/apache/tika/pipes/PipesResult$STATUS;->EMIT_SUCCESS_PARSE_EXCEPTION:Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 146
    .line 147
    new-instance v15, Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 148
    .line 149
    const-string v0, "EMIT_EXCEPTION"

    .line 150
    .line 151
    move-object/from16 v16, v1

    .line 152
    .line 153
    const/16 v1, 0xe

    .line 154
    .line 155
    invoke-direct {v15, v0, v1}, Lorg/apache/tika/pipes/PipesResult$STATUS;-><init>(Ljava/lang/String;I)V

    .line 156
    .line 157
    .line 158
    sput-object v15, Lorg/apache/tika/pipes/PipesResult$STATUS;->EMIT_EXCEPTION:Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 159
    .line 160
    new-instance v0, Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 161
    .line 162
    const-string v1, "INTERRUPTED_EXCEPTION"

    .line 163
    .line 164
    move-object/from16 v17, v2

    .line 165
    .line 166
    const/16 v2, 0xf

    .line 167
    .line 168
    invoke-direct {v0, v1, v2}, Lorg/apache/tika/pipes/PipesResult$STATUS;-><init>(Ljava/lang/String;I)V

    .line 169
    .line 170
    .line 171
    sput-object v0, Lorg/apache/tika/pipes/PipesResult$STATUS;->INTERRUPTED_EXCEPTION:Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 172
    .line 173
    new-instance v1, Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 174
    .line 175
    const-string v2, "NO_FETCHER_FOUND"

    .line 176
    .line 177
    move-object/from16 v18, v0

    .line 178
    .line 179
    const/16 v0, 0x10

    .line 180
    .line 181
    invoke-direct {v1, v2, v0}, Lorg/apache/tika/pipes/PipesResult$STATUS;-><init>(Ljava/lang/String;I)V

    .line 182
    .line 183
    .line 184
    sput-object v1, Lorg/apache/tika/pipes/PipesResult$STATUS;->NO_FETCHER_FOUND:Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 185
    .line 186
    new-instance v0, Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 187
    .line 188
    const-string v2, "INTERMEDIATE_RESULT"

    .line 189
    .line 190
    move-object/from16 v19, v1

    .line 191
    .line 192
    const/16 v1, 0x11

    .line 193
    .line 194
    invoke-direct {v0, v2, v1}, Lorg/apache/tika/pipes/PipesResult$STATUS;-><init>(Ljava/lang/String;I)V

    .line 195
    .line 196
    .line 197
    sput-object v0, Lorg/apache/tika/pipes/PipesResult$STATUS;->INTERMEDIATE_RESULT:Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 198
    .line 199
    move-object/from16 v1, v16

    .line 200
    .line 201
    move-object/from16 v2, v17

    .line 202
    .line 203
    move-object/from16 v16, v18

    .line 204
    .line 205
    move-object/from16 v17, v19

    .line 206
    .line 207
    move-object/from16 v18, v0

    .line 208
    .line 209
    filled-new-array/range {v1 .. v18}, [Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    sput-object v0, Lorg/apache/tika/pipes/PipesResult$STATUS;->$VALUES:[Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 214
    .line 215
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/apache/tika/pipes/PipesResult$STATUS;
    .locals 1

    .line 1
    const-class v0, Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lorg/apache/tika/pipes/PipesResult$STATUS;
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/tika/pipes/PipesResult$STATUS;->$VALUES:[Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lorg/apache/tika/pipes/PipesResult$STATUS;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lorg/apache/tika/pipes/PipesResult$STATUS;

    .line 8
    .line 9
    return-object v0
.end method

.class public Lorg/apache/tika/utils/CharsetUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final CHARSET_NAME_PATTERN:Ljava/util/regex/Pattern;

.field private static final COMMON_CHARSETS:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/nio/charset/Charset;",
            ">;"
        }
    .end annotation
.end field

.field private static final CP_NAME_PATTERN:Ljava/util/regex/Pattern;

.field private static final ISO_NAME_PATTERN:Ljava/util/regex/Pattern;

.field private static final WIN_NAME_PATTERN:Ljava/util/regex/Pattern;

.field private static getCharsetICU:Ljava/lang/reflect/Method;

.field private static isSupportedICU:Ljava/lang/reflect/Method;


# direct methods
.method static constructor <clinit>()V
    .locals 35

    .line 1
    const-class v0, Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "[ \\\"]*([^ >,;\\\"]+).*"

    .line 4
    .line 5
    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sput-object v1, Lorg/apache/tika/utils/CharsetUtils;->CHARSET_NAME_PATTERN:Ljava/util/regex/Pattern;

    .line 10
    .line 11
    const-string v1, ".*8859-(\\d+)"

    .line 12
    .line 13
    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    sput-object v1, Lorg/apache/tika/utils/CharsetUtils;->ISO_NAME_PATTERN:Ljava/util/regex/Pattern;

    .line 18
    .line 19
    const-string v1, "cp-(\\d+)"

    .line 20
    .line 21
    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    sput-object v1, Lorg/apache/tika/utils/CharsetUtils;->CP_NAME_PATTERN:Ljava/util/regex/Pattern;

    .line 26
    .line 27
    const-string v1, "win-?(\\d+)"

    .line 28
    .line 29
    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    sput-object v1, Lorg/apache/tika/utils/CharsetUtils;->WIN_NAME_PATTERN:Ljava/util/regex/Pattern;

    .line 34
    .line 35
    new-instance v1, Ljava/util/HashMap;

    .line 36
    .line 37
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 38
    .line 39
    .line 40
    sput-object v1, Lorg/apache/tika/utils/CharsetUtils;->COMMON_CHARSETS:Ljava/util/Map;

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    sput-object v2, Lorg/apache/tika/utils/CharsetUtils;->getCharsetICU:Ljava/lang/reflect/Method;

    .line 44
    .line 45
    sput-object v2, Lorg/apache/tika/utils/CharsetUtils;->isSupportedICU:Ljava/lang/reflect/Method;

    .line 46
    .line 47
    const-string v33, "windows-1253"

    .line 48
    .line 49
    const-string v34, "windows-1255"

    .line 50
    .line 51
    const-string v3, "Big5"

    .line 52
    .line 53
    const-string v4, "EUC-JP"

    .line 54
    .line 55
    const-string v5, "EUC-KR"

    .line 56
    .line 57
    const-string v6, "x-EUC-TW"

    .line 58
    .line 59
    const-string v7, "GB18030"

    .line 60
    .line 61
    const-string v8, "IBM855"

    .line 62
    .line 63
    const-string v9, "IBM866"

    .line 64
    .line 65
    const-string v10, "ISO-2022-CN"

    .line 66
    .line 67
    const-string v11, "ISO-2022-JP"

    .line 68
    .line 69
    const-string v12, "ISO-2022-KR"

    .line 70
    .line 71
    const-string v13, "ISO-8859-1"

    .line 72
    .line 73
    const-string v14, "ISO-8859-2"

    .line 74
    .line 75
    const-string v15, "ISO-8859-3"

    .line 76
    .line 77
    const-string v16, "ISO-8859-4"

    .line 78
    .line 79
    const-string v17, "ISO-8859-5"

    .line 80
    .line 81
    const-string v18, "ISO-8859-6"

    .line 82
    .line 83
    const-string v19, "ISO-8859-7"

    .line 84
    .line 85
    const-string v20, "ISO-8859-8"

    .line 86
    .line 87
    const-string v21, "ISO-8859-9"

    .line 88
    .line 89
    const-string v22, "ISO-8859-11"

    .line 90
    .line 91
    const-string v23, "ISO-8859-13"

    .line 92
    .line 93
    const-string v24, "ISO-8859-15"

    .line 94
    .line 95
    const-string v25, "KOI8-R"

    .line 96
    .line 97
    const-string v26, "x-MacCyrillic"

    .line 98
    .line 99
    const-string v27, "SHIFT_JIS"

    .line 100
    .line 101
    const-string v28, "UTF-8"

    .line 102
    .line 103
    const-string v29, "UTF-16BE"

    .line 104
    .line 105
    const-string v30, "UTF-16LE"

    .line 106
    .line 107
    const-string v31, "windows-1251"

    .line 108
    .line 109
    const-string v32, "windows-1252"

    .line 110
    .line 111
    filled-new-array/range {v3 .. v34}, [Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-static {v3}, Lorg/apache/tika/utils/CharsetUtils;->initCommonCharsets([Ljava/lang/String;)Ljava/util/Map;

    .line 116
    .line 117
    .line 118
    const-string v3, "iso-8859-1"

    .line 119
    .line 120
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    check-cast v3, Ljava/nio/charset/Charset;

    .line 125
    .line 126
    const-string v4, "iso-8851-1"

    .line 127
    .line 128
    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    const-string v3, "windows-1252"

    .line 132
    .line 133
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    check-cast v3, Ljava/nio/charset/Charset;

    .line 138
    .line 139
    const-string v4, "windows"

    .line 140
    .line 141
    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    const-string v3, "koi8-r"

    .line 145
    .line 146
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    check-cast v3, Ljava/nio/charset/Charset;

    .line 151
    .line 152
    const-string v4, "koi8r"

    .line 153
    .line 154
    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    :try_start_0
    const-class v1, Lorg/apache/tika/utils/CharsetUtils;

    .line 158
    .line 159
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    const-string v3, "com.ibm.icu.charset.CharsetICU"

    .line 164
    .line 165
    invoke-virtual {v1, v3}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 169
    :catch_0
    if-eqz v2, :cond_0

    .line 170
    .line 171
    :try_start_1
    const-string v1, "forNameICU"

    .line 172
    .line 173
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    invoke-virtual {v2, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    sput-object v1, Lorg/apache/tika/utils/CharsetUtils;->getCharsetICU:Ljava/lang/reflect/Method;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 182
    .line 183
    :try_start_2
    const-string v1, "isSupported"

    .line 184
    .line 185
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-virtual {v2, v1, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    sput-object v0, Lorg/apache/tika/utils/CharsetUtils;->isSupportedICU:Ljava/lang/reflect/Method;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 194
    .line 195
    goto :goto_0

    .line 196
    :catchall_0
    move-exception v0

    .line 197
    new-instance v1, Ljava/lang/RuntimeException;

    .line 198
    .line 199
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 200
    .line 201
    .line 202
    throw v1

    .line 203
    :catchall_1
    :cond_0
    :goto_0
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

.method public static clean(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    :try_start_0
    invoke-static {p0}, Lorg/apache/tika/utils/CharsetUtils;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-object p0

    .line 10
    :catch_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public static forName(Ljava/lang/String;)Ljava/nio/charset/Charset;
    .locals 7

    .line 1
    if-eqz p0, :cond_8

    .line 2
    .line 3
    sget-object v0, Lorg/apache/tika/utils/CharsetUtils;->CHARSET_NAME_PATTERN:Ljava/util/regex/Pattern;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_7

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    invoke-virtual {v0, p0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    sget-object v2, Lorg/apache/tika/utils/CharsetUtils;->COMMON_CHARSETS:Ljava/util/Map;

    .line 27
    .line 28
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Ljava/nio/charset/Charset;

    .line 33
    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    return-object v3

    .line 37
    :cond_0
    const-string v4, "none"

    .line 38
    .line 39
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-nez v4, :cond_6

    .line 44
    .line 45
    const-string v4, "no"

    .line 46
    .line 47
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-nez v4, :cond_6

    .line 52
    .line 53
    sget-object v4, Lorg/apache/tika/utils/CharsetUtils;->ISO_NAME_PATTERN:Ljava/util/regex/Pattern;

    .line 54
    .line 55
    invoke-virtual {v4, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    sget-object v5, Lorg/apache/tika/utils/CharsetUtils;->CP_NAME_PATTERN:Ljava/util/regex/Pattern;

    .line 60
    .line 61
    invoke-virtual {v5, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    sget-object v6, Lorg/apache/tika/utils/CharsetUtils;->WIN_NAME_PATTERN:Ljava/util/regex/Pattern;

    .line 66
    .line 67
    invoke-virtual {v6, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    if-eqz v6, :cond_1

    .line 76
    .line 77
    invoke-virtual {v4, p0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    const-string v0, "iso-8859-"

    .line 82
    .line 83
    invoke-static {v0, p0}, Lt/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    move-object v3, p0

    .line 92
    check-cast v3, Ljava/nio/charset/Charset;

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_1
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->matches()Z

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    if-eqz v4, :cond_2

    .line 100
    .line 101
    invoke-virtual {v5, p0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    const-string v0, "cp"

    .line 106
    .line 107
    invoke-static {v0, p0}, Lt/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    move-object v3, p0

    .line 116
    check-cast v3, Ljava/nio/charset/Charset;

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_2
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    if-eqz v4, :cond_3

    .line 124
    .line 125
    invoke-virtual {v1, p0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    const-string v0, "windows-"

    .line 130
    .line 131
    invoke-static {v0, p0}, Lt/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    move-object v3, p0

    .line 140
    check-cast v3, Ljava/nio/charset/Charset;

    .line 141
    .line 142
    :cond_3
    :goto_0
    if-eqz v3, :cond_4

    .line 143
    .line 144
    return-object v3

    .line 145
    :cond_4
    sget-object p0, Lorg/apache/tika/utils/CharsetUtils;->getCharsetICU:Ljava/lang/reflect/Method;

    .line 146
    .line 147
    if-eqz p0, :cond_5

    .line 148
    .line 149
    :try_start_0
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    const/4 v2, 0x0

    .line 154
    invoke-virtual {p0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    check-cast p0, Ljava/nio/charset/Charset;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 159
    .line 160
    if-eqz p0, :cond_5

    .line 161
    .line 162
    return-object p0

    .line 163
    :catch_0
    :cond_5
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    return-object p0

    .line 168
    :cond_6
    new-instance p0, Ljava/nio/charset/IllegalCharsetNameException;

    .line 169
    .line 170
    invoke-direct {p0, v0}, Ljava/nio/charset/IllegalCharsetNameException;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    throw p0

    .line 174
    :cond_7
    new-instance v0, Ljava/nio/charset/IllegalCharsetNameException;

    .line 175
    .line 176
    invoke-direct {v0, p0}, Ljava/nio/charset/IllegalCharsetNameException;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    throw v0

    .line 180
    :cond_8
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 181
    .line 182
    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 183
    .line 184
    .line 185
    throw p0
.end method

.method private static varargs initCommonCharsets([Ljava/lang/String;)Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/nio/charset/Charset;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    array-length v1, p0

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v1, :cond_1

    .line 9
    .line 10
    aget-object v3, p0, v2

    .line 11
    .line 12
    :try_start_0
    invoke-static {v3}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    sget-object v5, Lorg/apache/tika/utils/CharsetUtils;->COMMON_CHARSETS:Ljava/util/Map;

    .line 17
    .line 18
    sget-object v6, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 19
    .line 20
    invoke-virtual {v3, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v4}, Ljava/nio/charset/Charset;->aliases()Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-eqz v5, :cond_0

    .line 40
    .line 41
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    check-cast v5, Ljava/lang/String;

    .line 46
    .line 47
    sget-object v6, Lorg/apache/tika/utils/CharsetUtils;->COMMON_CHARSETS:Ljava/util/Map;

    .line 48
    .line 49
    sget-object v7, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 50
    .line 51
    invoke-virtual {v5, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-interface {v6, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :catch_0
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    return-object v0
.end method

.method public static isSupported(Ljava/lang/String;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, Lorg/apache/tika/utils/CharsetUtils;->isSupportedICU:Ljava/lang/reflect/Method;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-virtual {v1, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_0
    invoke-static {p0}, Ljava/nio/charset/Charset;->isSupported(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result p0
    :try_end_0
    .catch Ljava/nio/charset/IllegalCharsetNameException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    return p0

    .line 30
    :catch_0
    return v0
.end method

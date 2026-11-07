.class public Lorg/apache/tika/sax/xpath/XPathParser;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final prefixes:Ljava/util/Map;
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
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/apache/tika/sax/xpath/XPathParser;->prefixes:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/apache/tika/sax/xpath/XPathParser;->prefixes:Ljava/util/Map;

    .line 5
    invoke-virtual {p0, p1, p2}, Lorg/apache/tika/sax/xpath/XPathParser;->addPrefix(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public addPrefix(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/xpath/XPathParser;->prefixes:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public parse(Ljava/lang/String;)Lorg/apache/tika/sax/xpath/Matcher;
    .locals 7

    .line 1
    const-string v0, "/text()"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p1, Lorg/apache/tika/sax/xpath/TextMatcher;->INSTANCE:Lorg/apache/tika/sax/xpath/Matcher;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    const-string v0, "/node()"

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    sget-object p1, Lorg/apache/tika/sax/xpath/NodeMatcher;->INSTANCE:Lorg/apache/tika/sax/xpath/Matcher;

    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_1
    const-string v0, "/descendant::node()"

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_f

    .line 30
    .line 31
    const-string v0, "/descendant:node()"

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    goto/16 :goto_0

    .line 40
    .line 41
    :cond_2
    const-string v0, "/@*"

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    sget-object p1, Lorg/apache/tika/sax/xpath/AttributeMatcher;->INSTANCE:Lorg/apache/tika/sax/xpath/Matcher;

    .line 50
    .line 51
    return-object p1

    .line 52
    :cond_3
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_4

    .line 57
    .line 58
    sget-object p1, Lorg/apache/tika/sax/xpath/ElementMatcher;->INSTANCE:Lorg/apache/tika/sax/xpath/Matcher;

    .line 59
    .line 60
    return-object p1

    .line 61
    :cond_4
    const-string v0, "/@"

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    const/4 v1, 0x0

    .line 68
    const/16 v2, 0x3a

    .line 69
    .line 70
    const/4 v3, 0x0

    .line 71
    const/4 v4, 0x2

    .line 72
    const/4 v5, -0x1

    .line 73
    const/4 v6, 0x1

    .line 74
    if-eqz v0, :cond_7

    .line 75
    .line 76
    invoke-virtual {p1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(I)I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eq v0, v5, :cond_5

    .line 85
    .line 86
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    add-int/2addr v0, v6

    .line 91
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    :cond_5
    iget-object v0, p0, Lorg/apache/tika/sax/xpath/XPathParser;->prefixes:Ljava/util/Map;

    .line 96
    .line 97
    invoke-interface {v0, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_6

    .line 102
    .line 103
    new-instance v0, Lorg/apache/tika/sax/xpath/NamedAttributeMatcher;

    .line 104
    .line 105
    iget-object v1, p0, Lorg/apache/tika/sax/xpath/XPathParser;->prefixes:Ljava/util/Map;

    .line 106
    .line 107
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    check-cast v1, Ljava/lang/String;

    .line 112
    .line 113
    invoke-direct {v0, v1, p1}, Lorg/apache/tika/sax/xpath/NamedAttributeMatcher;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    return-object v0

    .line 117
    :cond_6
    sget-object p1, Lorg/apache/tika/sax/xpath/Matcher;->FAIL:Lorg/apache/tika/sax/xpath/Matcher;

    .line 118
    .line 119
    return-object p1

    .line 120
    :cond_7
    const-string v0, "/*"

    .line 121
    .line 122
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-eqz v0, :cond_8

    .line 127
    .line 128
    new-instance v0, Lorg/apache/tika/sax/xpath/ChildMatcher;

    .line 129
    .line 130
    invoke-virtual {p1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-virtual {p0, p1}, Lorg/apache/tika/sax/xpath/XPathParser;->parse(Ljava/lang/String;)Lorg/apache/tika/sax/xpath/Matcher;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-direct {v0, p1}, Lorg/apache/tika/sax/xpath/ChildMatcher;-><init>(Lorg/apache/tika/sax/xpath/Matcher;)V

    .line 139
    .line 140
    .line 141
    return-object v0

    .line 142
    :cond_8
    const-string v0, "///"

    .line 143
    .line 144
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-eqz v0, :cond_9

    .line 149
    .line 150
    sget-object p1, Lorg/apache/tika/sax/xpath/Matcher;->FAIL:Lorg/apache/tika/sax/xpath/Matcher;

    .line 151
    .line 152
    return-object p1

    .line 153
    :cond_9
    const-string v0, "//"

    .line 154
    .line 155
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-eqz v0, :cond_a

    .line 160
    .line 161
    new-instance v0, Lorg/apache/tika/sax/xpath/SubtreeMatcher;

    .line 162
    .line 163
    invoke-virtual {p1, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-virtual {p0, p1}, Lorg/apache/tika/sax/xpath/XPathParser;->parse(Ljava/lang/String;)Lorg/apache/tika/sax/xpath/Matcher;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    invoke-direct {v0, p1}, Lorg/apache/tika/sax/xpath/SubtreeMatcher;-><init>(Lorg/apache/tika/sax/xpath/Matcher;)V

    .line 172
    .line 173
    .line 174
    return-object v0

    .line 175
    :cond_a
    const-string v0, "/"

    .line 176
    .line 177
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    if-eqz v0, :cond_e

    .line 182
    .line 183
    const/16 v0, 0x2f

    .line 184
    .line 185
    invoke-virtual {p1, v0, v6}, Ljava/lang/String;->indexOf(II)I

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    if-ne v0, v5, :cond_b

    .line 190
    .line 191
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    :cond_b
    invoke-virtual {p1, v6, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    invoke-virtual {v4, v2}, Ljava/lang/String;->indexOf(I)I

    .line 200
    .line 201
    .line 202
    move-result v2

    .line 203
    if-eq v2, v5, :cond_c

    .line 204
    .line 205
    invoke-virtual {v4, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    add-int/2addr v2, v6

    .line 210
    invoke-virtual {v4, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v4

    .line 214
    :cond_c
    iget-object v1, p0, Lorg/apache/tika/sax/xpath/XPathParser;->prefixes:Ljava/util/Map;

    .line 215
    .line 216
    invoke-interface {v1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    if-eqz v1, :cond_d

    .line 221
    .line 222
    new-instance v1, Lorg/apache/tika/sax/xpath/NamedElementMatcher;

    .line 223
    .line 224
    iget-object v2, p0, Lorg/apache/tika/sax/xpath/XPathParser;->prefixes:Ljava/util/Map;

    .line 225
    .line 226
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    check-cast v2, Ljava/lang/String;

    .line 231
    .line 232
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    invoke-virtual {p0, p1}, Lorg/apache/tika/sax/xpath/XPathParser;->parse(Ljava/lang/String;)Lorg/apache/tika/sax/xpath/Matcher;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    invoke-direct {v1, v2, v4, p1}, Lorg/apache/tika/sax/xpath/NamedElementMatcher;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/apache/tika/sax/xpath/Matcher;)V

    .line 241
    .line 242
    .line 243
    return-object v1

    .line 244
    :cond_d
    sget-object p1, Lorg/apache/tika/sax/xpath/Matcher;->FAIL:Lorg/apache/tika/sax/xpath/Matcher;

    .line 245
    .line 246
    return-object p1

    .line 247
    :cond_e
    sget-object p1, Lorg/apache/tika/sax/xpath/Matcher;->FAIL:Lorg/apache/tika/sax/xpath/Matcher;

    .line 248
    .line 249
    return-object p1

    .line 250
    :cond_f
    :goto_0
    new-instance p1, Lorg/apache/tika/sax/xpath/CompositeMatcher;

    .line 251
    .line 252
    sget-object v0, Lorg/apache/tika/sax/xpath/TextMatcher;->INSTANCE:Lorg/apache/tika/sax/xpath/Matcher;

    .line 253
    .line 254
    new-instance v1, Lorg/apache/tika/sax/xpath/ChildMatcher;

    .line 255
    .line 256
    new-instance v2, Lorg/apache/tika/sax/xpath/SubtreeMatcher;

    .line 257
    .line 258
    sget-object v3, Lorg/apache/tika/sax/xpath/NodeMatcher;->INSTANCE:Lorg/apache/tika/sax/xpath/Matcher;

    .line 259
    .line 260
    invoke-direct {v2, v3}, Lorg/apache/tika/sax/xpath/SubtreeMatcher;-><init>(Lorg/apache/tika/sax/xpath/Matcher;)V

    .line 261
    .line 262
    .line 263
    invoke-direct {v1, v2}, Lorg/apache/tika/sax/xpath/ChildMatcher;-><init>(Lorg/apache/tika/sax/xpath/Matcher;)V

    .line 264
    .line 265
    .line 266
    invoke-direct {p1, v0, v1}, Lorg/apache/tika/sax/xpath/CompositeMatcher;-><init>(Lorg/apache/tika/sax/xpath/Matcher;Lorg/apache/tika/sax/xpath/Matcher;)V

    .line 267
    .line 268
    .line 269
    return-object p1
.end method

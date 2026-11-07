.class public Lorg/apache/tika/sax/DIFContentHandler;
.super Lorg/xml/sax/helpers/DefaultHandler;
.source "SourceFile"


# static fields
.field private static final EMPTY_ATTRIBUTES:Lorg/xml/sax/Attributes;

.field private static final NEWLINE:[C

.field private static final TABSPACE:[C


# instance fields
.field private final dataStack:Ljava/util/Stack;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Stack<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final delegate:Lorg/xml/sax/ContentHandler;

.field private isLeaf:Z

.field private final metadata:Lorg/apache/tika/metadata/Metadata;

.field private final treeStack:Ljava/util/Stack;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Stack<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v1, v0, [C

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    const/16 v3, 0xa

    .line 6
    .line 7
    aput-char v3, v1, v2

    .line 8
    .line 9
    sput-object v1, Lorg/apache/tika/sax/DIFContentHandler;->NEWLINE:[C

    .line 10
    .line 11
    new-array v0, v0, [C

    .line 12
    .line 13
    const/16 v1, 0x9

    .line 14
    .line 15
    aput-char v1, v0, v2

    .line 16
    .line 17
    sput-object v0, Lorg/apache/tika/sax/DIFContentHandler;->TABSPACE:[C

    .line 18
    .line 19
    new-instance v0, Lorg/xml/sax/helpers/AttributesImpl;

    .line 20
    .line 21
    invoke-direct {v0}, Lorg/xml/sax/helpers/AttributesImpl;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lorg/apache/tika/sax/DIFContentHandler;->EMPTY_ATTRIBUTES:Lorg/xml/sax/Attributes;

    .line 25
    .line 26
    return-void
.end method

.method public constructor <init>(Lorg/xml/sax/ContentHandler;Lorg/apache/tika/metadata/Metadata;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xml/sax/helpers/DefaultHandler;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->delegate:Lorg/xml/sax/ContentHandler;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->isLeaf:Z

    .line 8
    .line 9
    iput-object p2, p0, Lorg/apache/tika/sax/DIFContentHandler;->metadata:Lorg/apache/tika/metadata/Metadata;

    .line 10
    .line 11
    new-instance p1, Ljava/util/Stack;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/util/Stack;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->treeStack:Ljava/util/Stack;

    .line 17
    .line 18
    new-instance p1, Ljava/util/Stack;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/util/Stack;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->dataStack:Ljava/util/Stack;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public characters([CII)V
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/String;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->dataStack:Ljava/util/Stack;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->treeStack:Ljava/util/Stack;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Ljava/lang/String;

    .line 18
    .line 19
    const-string p2, "Entry_Title"

    .line 20
    .line 21
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    const-string p2, ""

    .line 26
    .line 27
    const/4 p3, 0x0

    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    iget-object p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->delegate:Lorg/xml/sax/ContentHandler;

    .line 31
    .line 32
    sget-object v1, Lorg/apache/tika/sax/DIFContentHandler;->NEWLINE:[C

    .line 33
    .line 34
    array-length v2, v1

    .line 35
    invoke-interface {p1, v1, p3, v2}, Lorg/xml/sax/ContentHandler;->characters([CII)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->delegate:Lorg/xml/sax/ContentHandler;

    .line 39
    .line 40
    sget-object v1, Lorg/apache/tika/sax/DIFContentHandler;->TABSPACE:[C

    .line 41
    .line 42
    array-length v2, v1

    .line 43
    invoke-interface {p1, v1, p3, v2}, Lorg/xml/sax/ContentHandler;->characters([CII)V

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->delegate:Lorg/xml/sax/ContentHandler;

    .line 47
    .line 48
    sget-object v1, Lorg/apache/tika/sax/DIFContentHandler;->EMPTY_ATTRIBUTES:Lorg/xml/sax/Attributes;

    .line 49
    .line 50
    const-string v2, "h3"

    .line 51
    .line 52
    invoke-interface {p1, p2, v2, v2, v1}, Lorg/xml/sax/ContentHandler;->startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V

    .line 53
    .line 54
    .line 55
    const-string p1, "Title: "

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iget-object v1, p0, Lorg/apache/tika/sax/DIFContentHandler;->delegate:Lorg/xml/sax/ContentHandler;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    invoke-interface {v1, v3, p3, p1}, Lorg/xml/sax/ContentHandler;->characters([CII)V

    .line 72
    .line 73
    .line 74
    iget-object p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->delegate:Lorg/xml/sax/ContentHandler;

    .line 75
    .line 76
    invoke-interface {p1, p2, v2, v2}, Lorg/xml/sax/ContentHandler;->endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :cond_0
    iget-object p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->treeStack:Ljava/util/Stack;

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    check-cast p1, Ljava/lang/String;

    .line 86
    .line 87
    const-string v1, "Southernmost_Latitude"

    .line 88
    .line 89
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-nez p1, :cond_2

    .line 94
    .line 95
    iget-object p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->treeStack:Ljava/util/Stack;

    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    check-cast p1, Ljava/lang/String;

    .line 102
    .line 103
    const-string v1, "Northernmost_Latitude"

    .line 104
    .line 105
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-nez p1, :cond_2

    .line 110
    .line 111
    iget-object p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->treeStack:Ljava/util/Stack;

    .line 112
    .line 113
    invoke-virtual {p1}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    check-cast p1, Ljava/lang/String;

    .line 118
    .line 119
    const-string v1, "Westernmost_Longitude"

    .line 120
    .line 121
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    if-nez p1, :cond_2

    .line 126
    .line 127
    iget-object p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->treeStack:Ljava/util/Stack;

    .line 128
    .line 129
    invoke-virtual {p1}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    check-cast p1, Ljava/lang/String;

    .line 134
    .line 135
    const-string v1, "Easternmost_Longitude"

    .line 136
    .line 137
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    if-eqz p1, :cond_1

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_1
    return-void

    .line 145
    :cond_2
    :goto_0
    iget-object p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->delegate:Lorg/xml/sax/ContentHandler;

    .line 146
    .line 147
    sget-object v1, Lorg/apache/tika/sax/DIFContentHandler;->NEWLINE:[C

    .line 148
    .line 149
    array-length v2, v1

    .line 150
    invoke-interface {p1, v1, p3, v2}, Lorg/xml/sax/ContentHandler;->characters([CII)V

    .line 151
    .line 152
    .line 153
    iget-object p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->delegate:Lorg/xml/sax/ContentHandler;

    .line 154
    .line 155
    sget-object v1, Lorg/apache/tika/sax/DIFContentHandler;->TABSPACE:[C

    .line 156
    .line 157
    array-length v2, v1

    .line 158
    invoke-interface {p1, v1, p3, v2}, Lorg/xml/sax/ContentHandler;->characters([CII)V

    .line 159
    .line 160
    .line 161
    iget-object p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->delegate:Lorg/xml/sax/ContentHandler;

    .line 162
    .line 163
    array-length v2, v1

    .line 164
    invoke-interface {p1, v1, p3, v2}, Lorg/xml/sax/ContentHandler;->characters([CII)V

    .line 165
    .line 166
    .line 167
    iget-object p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->delegate:Lorg/xml/sax/ContentHandler;

    .line 168
    .line 169
    sget-object v1, Lorg/apache/tika/sax/DIFContentHandler;->EMPTY_ATTRIBUTES:Lorg/xml/sax/Attributes;

    .line 170
    .line 171
    const-string v2, "tr"

    .line 172
    .line 173
    invoke-interface {p1, p2, v2, v2, v1}, Lorg/xml/sax/ContentHandler;->startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V

    .line 174
    .line 175
    .line 176
    iget-object p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->delegate:Lorg/xml/sax/ContentHandler;

    .line 177
    .line 178
    const-string v3, "td"

    .line 179
    .line 180
    invoke-interface {p1, p2, v3, v3, v1}, Lorg/xml/sax/ContentHandler;->startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V

    .line 181
    .line 182
    .line 183
    iget-object p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->treeStack:Ljava/util/Stack;

    .line 184
    .line 185
    invoke-virtual {p1}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    check-cast p1, Ljava/lang/String;

    .line 190
    .line 191
    const-string v4, " : "

    .line 192
    .line 193
    invoke-static {p1, v4}, LB1/e;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    iget-object v4, p0, Lorg/apache/tika/sax/DIFContentHandler;->delegate:Lorg/xml/sax/ContentHandler;

    .line 198
    .line 199
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    .line 200
    .line 201
    .line 202
    move-result-object v5

    .line 203
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 204
    .line 205
    .line 206
    move-result p1

    .line 207
    invoke-interface {v4, v5, p3, p1}, Lorg/xml/sax/ContentHandler;->characters([CII)V

    .line 208
    .line 209
    .line 210
    iget-object p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->delegate:Lorg/xml/sax/ContentHandler;

    .line 211
    .line 212
    invoke-interface {p1, p2, v3, v3}, Lorg/xml/sax/ContentHandler;->endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    iget-object p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->delegate:Lorg/xml/sax/ContentHandler;

    .line 216
    .line 217
    invoke-interface {p1, p2, v3, v3, v1}, Lorg/xml/sax/ContentHandler;->startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V

    .line 218
    .line 219
    .line 220
    iget-object p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->delegate:Lorg/xml/sax/ContentHandler;

    .line 221
    .line 222
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    invoke-interface {p1, v1, p3, v0}, Lorg/xml/sax/ContentHandler;->characters([CII)V

    .line 231
    .line 232
    .line 233
    iget-object p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->delegate:Lorg/xml/sax/ContentHandler;

    .line 234
    .line 235
    invoke-interface {p1, p2, v3, v3}, Lorg/xml/sax/ContentHandler;->endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    iget-object p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->delegate:Lorg/xml/sax/ContentHandler;

    .line 239
    .line 240
    invoke-interface {p1, p2, v2, v2}, Lorg/xml/sax/ContentHandler;->endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    return-void
.end method

.method public endDocument()V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/DIFContentHandler;->delegate:Lorg/xml/sax/ContentHandler;

    .line 2
    .line 3
    invoke-interface {v0}, Lorg/xml/sax/ContentHandler;->endDocument()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string p1, "Spatial_Coverage"

    .line 2
    .line 3
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 p2, 0x0

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->delegate:Lorg/xml/sax/ContentHandler;

    .line 11
    .line 12
    sget-object p3, Lorg/apache/tika/sax/DIFContentHandler;->NEWLINE:[C

    .line 13
    .line 14
    array-length v0, p3

    .line 15
    invoke-interface {p1, p3, p2, v0}, Lorg/xml/sax/ContentHandler;->characters([CII)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->delegate:Lorg/xml/sax/ContentHandler;

    .line 19
    .line 20
    sget-object p3, Lorg/apache/tika/sax/DIFContentHandler;->TABSPACE:[C

    .line 21
    .line 22
    array-length v0, p3

    .line 23
    invoke-interface {p1, p3, p2, v0}, Lorg/xml/sax/ContentHandler;->characters([CII)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->delegate:Lorg/xml/sax/ContentHandler;

    .line 27
    .line 28
    const-string p3, ""

    .line 29
    .line 30
    const-string v0, "table"

    .line 31
    .line 32
    invoke-interface {p1, p3, v0, v0}, Lorg/xml/sax/ContentHandler;->endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    iget-boolean p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->isLeaf:Z

    .line 36
    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    iget-object p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->treeStack:Ljava/util/Stack;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, Ljava/util/Stack;

    .line 46
    .line 47
    new-instance p3, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    :goto_0
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_2

    .line 57
    .line 58
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->length()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_1

    .line 63
    .line 64
    new-instance p3, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    check-cast v0, Ljava/lang/String;

    .line 71
    .line 72
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    invoke-virtual {p1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, Ljava/lang/String;

    .line 81
    .line 82
    new-instance v1, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v0, "-"

    .line 91
    .line 92
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {p3, p2, v0}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_2
    iget-object p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->dataStack:Ljava/util/Stack;

    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    check-cast p1, Ljava/lang/String;

    .line 110
    .line 111
    iget-object v0, p0, Lorg/apache/tika/sax/DIFContentHandler;->metadata:Lorg/apache/tika/metadata/Metadata;

    .line 112
    .line 113
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p3

    .line 117
    invoke-virtual {v0, p3, p1}, Lorg/apache/tika/metadata/Metadata;->add(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    iput-boolean p2, p0, Lorg/apache/tika/sax/DIFContentHandler;->isLeaf:Z

    .line 121
    .line 122
    :cond_3
    iget-object p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->treeStack:Ljava/util/Stack;

    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    iget-object p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->dataStack:Ljava/util/Stack;

    .line 128
    .line 129
    invoke-virtual {p1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    return-void
.end method

.method public ignorableWhitespace([CII)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/DIFContentHandler;->delegate:Lorg/xml/sax/ContentHandler;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Lorg/xml/sax/ContentHandler;->ignorableWhitespace([CII)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setDocumentLocator(Lorg/xml/sax/Locator;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/DIFContentHandler;->delegate:Lorg/xml/sax/ContentHandler;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lorg/xml/sax/ContentHandler;->setDocumentLocator(Lorg/xml/sax/Locator;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public startDocument()V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/DIFContentHandler;->delegate:Lorg/xml/sax/ContentHandler;

    .line 2
    .line 3
    invoke-interface {v0}, Lorg/xml/sax/ContentHandler;->startDocument()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 6

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->isLeaf:Z

    .line 3
    .line 4
    const-string p1, "Spatial_Coverage"

    .line 5
    .line 6
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->delegate:Lorg/xml/sax/ContentHandler;

    .line 13
    .line 14
    sget-object p3, Lorg/apache/tika/sax/DIFContentHandler;->NEWLINE:[C

    .line 15
    .line 16
    array-length p4, p3

    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-interface {p1, p3, v0, p4}, Lorg/xml/sax/ContentHandler;->characters([CII)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->delegate:Lorg/xml/sax/ContentHandler;

    .line 22
    .line 23
    sget-object p4, Lorg/apache/tika/sax/DIFContentHandler;->TABSPACE:[C

    .line 24
    .line 25
    array-length v1, p4

    .line 26
    invoke-interface {p1, p4, v0, v1}, Lorg/xml/sax/ContentHandler;->characters([CII)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->delegate:Lorg/xml/sax/ContentHandler;

    .line 30
    .line 31
    sget-object v1, Lorg/apache/tika/sax/DIFContentHandler;->EMPTY_ATTRIBUTES:Lorg/xml/sax/Attributes;

    .line 32
    .line 33
    const-string v2, ""

    .line 34
    .line 35
    const-string v3, "h3"

    .line 36
    .line 37
    invoke-interface {p1, v2, v3, v3, v1}, Lorg/xml/sax/ContentHandler;->startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->delegate:Lorg/xml/sax/ContentHandler;

    .line 41
    .line 42
    const-string v4, "Geographic Data: "

    .line 43
    .line 44
    invoke-virtual {v4}, Ljava/lang/String;->toCharArray()[C

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    const/16 v5, 0x11

    .line 49
    .line 50
    invoke-interface {p1, v4, v0, v5}, Lorg/xml/sax/ContentHandler;->characters([CII)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->delegate:Lorg/xml/sax/ContentHandler;

    .line 54
    .line 55
    invoke-interface {p1, v2, v3, v3}, Lorg/xml/sax/ContentHandler;->endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->delegate:Lorg/xml/sax/ContentHandler;

    .line 59
    .line 60
    array-length v3, p3

    .line 61
    invoke-interface {p1, p3, v0, v3}, Lorg/xml/sax/ContentHandler;->characters([CII)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->delegate:Lorg/xml/sax/ContentHandler;

    .line 65
    .line 66
    array-length p3, p4

    .line 67
    invoke-interface {p1, p4, v0, p3}, Lorg/xml/sax/ContentHandler;->characters([CII)V

    .line 68
    .line 69
    .line 70
    iget-object p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->delegate:Lorg/xml/sax/ContentHandler;

    .line 71
    .line 72
    const-string p3, "table"

    .line 73
    .line 74
    invoke-interface {p1, v2, p3, p3, v1}, Lorg/xml/sax/ContentHandler;->startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V

    .line 75
    .line 76
    .line 77
    :cond_0
    iget-object p1, p0, Lorg/apache/tika/sax/DIFContentHandler;->treeStack:Ljava/util/Stack;

    .line 78
    .line 79
    invoke-virtual {p1, p2}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/DIFContentHandler;->delegate:Lorg/xml/sax/ContentHandler;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

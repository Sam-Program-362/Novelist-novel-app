.class Lorg/apache/tika/fork/ContentHandlerResource;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/apache/tika/fork/ForkResource;


# instance fields
.field private final handler:Lorg/xml/sax/ContentHandler;


# direct methods
.method public constructor <init>(Lorg/xml/sax/ContentHandler;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/apache/tika/fork/ContentHandlerResource;->handler:Lorg/xml/sax/ContentHandler;

    .line 5
    .line 6
    return-void
.end method

.method private internalProcess(Ljava/io/DataInputStream;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedByte()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget-object p1, p0, Lorg/apache/tika/fork/ContentHandlerResource;->handler:Lorg/xml/sax/ContentHandler;

    .line 9
    .line 10
    invoke-interface {p1}, Lorg/xml/sax/ContentHandler;->startDocument()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const/4 v1, 0x2

    .line 15
    if-ne v0, v1, :cond_1

    .line 16
    .line 17
    iget-object p1, p0, Lorg/apache/tika/fork/ContentHandlerResource;->handler:Lorg/xml/sax/ContentHandler;

    .line 18
    .line 19
    invoke-interface {p1}, Lorg/xml/sax/ContentHandler;->endDocument()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    const/4 v1, 0x3

    .line 24
    if-ne v0, v1, :cond_2

    .line 25
    .line 26
    iget-object v0, p0, Lorg/apache/tika/fork/ContentHandlerResource;->handler:Lorg/xml/sax/ContentHandler;

    .line 27
    .line 28
    invoke-direct {p0, p1}, Lorg/apache/tika/fork/ContentHandlerResource;->readString(Ljava/io/DataInputStream;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-direct {p0, p1}, Lorg/apache/tika/fork/ContentHandlerResource;->readString(Ljava/io/DataInputStream;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-interface {v0, v1, p1}, Lorg/xml/sax/ContentHandler;->startPrefixMapping(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_2
    const/4 v1, 0x4

    .line 41
    if-ne v0, v1, :cond_3

    .line 42
    .line 43
    iget-object v0, p0, Lorg/apache/tika/fork/ContentHandlerResource;->handler:Lorg/xml/sax/ContentHandler;

    .line 44
    .line 45
    invoke-direct {p0, p1}, Lorg/apache/tika/fork/ContentHandlerResource;->readString(Ljava/io/DataInputStream;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-interface {v0, p1}, Lorg/xml/sax/ContentHandler;->endPrefixMapping(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_3
    const/4 v1, 0x5

    .line 54
    const/4 v2, 0x0

    .line 55
    if-ne v0, v1, :cond_6

    .line 56
    .line 57
    invoke-direct {p0, p1}, Lorg/apache/tika/fork/ContentHandlerResource;->readString(Ljava/io/DataInputStream;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-direct {p0, p1}, Lorg/apache/tika/fork/ContentHandlerResource;->readString(Ljava/io/DataInputStream;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-direct {p0, p1}, Lorg/apache/tika/fork/ContentHandlerResource;->readString(Ljava/io/DataInputStream;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readInt()I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-ltz v4, :cond_4

    .line 74
    .line 75
    new-instance v5, Lorg/xml/sax/helpers/AttributesImpl;

    .line 76
    .line 77
    invoke-direct {v5}, Lorg/xml/sax/helpers/AttributesImpl;-><init>()V

    .line 78
    .line 79
    .line 80
    :goto_0
    if-ge v2, v4, :cond_5

    .line 81
    .line 82
    invoke-direct {p0, p1}, Lorg/apache/tika/fork/ContentHandlerResource;->readString(Ljava/io/DataInputStream;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    invoke-direct {p0, p1}, Lorg/apache/tika/fork/ContentHandlerResource;->readString(Ljava/io/DataInputStream;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    invoke-direct {p0, p1}, Lorg/apache/tika/fork/ContentHandlerResource;->readString(Ljava/io/DataInputStream;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v8

    .line 94
    invoke-direct {p0, p1}, Lorg/apache/tika/fork/ContentHandlerResource;->readString(Ljava/io/DataInputStream;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v9

    .line 98
    invoke-direct {p0, p1}, Lorg/apache/tika/fork/ContentHandlerResource;->readString(Ljava/io/DataInputStream;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v10

    .line 102
    invoke-virtual/range {v5 .. v10}, Lorg/xml/sax/helpers/AttributesImpl;->addAttribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    add-int/lit8 v2, v2, 0x1

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_4
    const/4 v5, 0x0

    .line 109
    :cond_5
    iget-object p1, p0, Lorg/apache/tika/fork/ContentHandlerResource;->handler:Lorg/xml/sax/ContentHandler;

    .line 110
    .line 111
    invoke-interface {p1, v0, v1, v3, v5}, Lorg/xml/sax/ContentHandler;->startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :cond_6
    const/4 v1, 0x6

    .line 116
    if-ne v0, v1, :cond_7

    .line 117
    .line 118
    invoke-direct {p0, p1}, Lorg/apache/tika/fork/ContentHandlerResource;->readString(Ljava/io/DataInputStream;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-direct {p0, p1}, Lorg/apache/tika/fork/ContentHandlerResource;->readString(Ljava/io/DataInputStream;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-direct {p0, p1}, Lorg/apache/tika/fork/ContentHandlerResource;->readString(Ljava/io/DataInputStream;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    iget-object v2, p0, Lorg/apache/tika/fork/ContentHandlerResource;->handler:Lorg/xml/sax/ContentHandler;

    .line 131
    .line 132
    invoke-interface {v2, v0, v1, p1}, Lorg/xml/sax/ContentHandler;->endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :cond_7
    const/4 v1, 0x7

    .line 137
    if-ne v0, v1, :cond_8

    .line 138
    .line 139
    invoke-direct {p0, p1}, Lorg/apache/tika/fork/ContentHandlerResource;->readCharacters(Ljava/io/DataInputStream;)[C

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    iget-object v0, p0, Lorg/apache/tika/fork/ContentHandlerResource;->handler:Lorg/xml/sax/ContentHandler;

    .line 144
    .line 145
    array-length v1, p1

    .line 146
    invoke-interface {v0, p1, v2, v1}, Lorg/xml/sax/ContentHandler;->characters([CII)V

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :cond_8
    const/16 v1, 0x8

    .line 151
    .line 152
    if-ne v0, v1, :cond_9

    .line 153
    .line 154
    invoke-direct {p0, p1}, Lorg/apache/tika/fork/ContentHandlerResource;->readCharacters(Ljava/io/DataInputStream;)[C

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    iget-object v0, p0, Lorg/apache/tika/fork/ContentHandlerResource;->handler:Lorg/xml/sax/ContentHandler;

    .line 159
    .line 160
    array-length v1, p1

    .line 161
    invoke-interface {v0, p1, v2, v1}, Lorg/xml/sax/ContentHandler;->characters([CII)V

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :cond_9
    const/16 v1, 0x9

    .line 166
    .line 167
    if-ne v0, v1, :cond_a

    .line 168
    .line 169
    iget-object v0, p0, Lorg/apache/tika/fork/ContentHandlerResource;->handler:Lorg/xml/sax/ContentHandler;

    .line 170
    .line 171
    invoke-direct {p0, p1}, Lorg/apache/tika/fork/ContentHandlerResource;->readString(Ljava/io/DataInputStream;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    invoke-direct {p0, p1}, Lorg/apache/tika/fork/ContentHandlerResource;->readString(Ljava/io/DataInputStream;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-interface {v0, v1, p1}, Lorg/xml/sax/ContentHandler;->processingInstruction(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :cond_a
    const/16 v1, 0xa

    .line 184
    .line 185
    if-ne v0, v1, :cond_b

    .line 186
    .line 187
    iget-object v0, p0, Lorg/apache/tika/fork/ContentHandlerResource;->handler:Lorg/xml/sax/ContentHandler;

    .line 188
    .line 189
    invoke-direct {p0, p1}, Lorg/apache/tika/fork/ContentHandlerResource;->readString(Ljava/io/DataInputStream;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    invoke-interface {v0, p1}, Lorg/xml/sax/ContentHandler;->skippedEntity(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    :cond_b
    return-void
.end method

.method private readCharacters(Ljava/io/DataInputStream;)[C
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lorg/apache/tika/fork/ContentHandlerResource;->readStringUTF(Ljava/io/DataInputStream;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method private readString(Ljava/io/DataInputStream;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readBoolean()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lorg/apache/tika/fork/ContentHandlerResource;->readStringUTF(Ljava/io/DataInputStream;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    return-object p1
.end method

.method private readStringUTF(Ljava/io/DataInputStream;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readInt()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    if-ge v2, v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    add-int/lit8 v2, v2, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1
.end method


# virtual methods
.method public process(Ljava/io/DataInputStream;Ljava/io/DataOutputStream;)Ljava/lang/Throwable;
    .locals 0

    .line 1
    :try_start_0
    invoke-direct {p0, p1}, Lorg/apache/tika/fork/ContentHandlerResource;->internalProcess(Ljava/io/DataInputStream;)V
    :try_end_0
    .catch Lorg/xml/sax/SAXException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    return-object p1

    .line 6
    :catch_0
    move-exception p1

    .line 7
    return-object p1
.end method

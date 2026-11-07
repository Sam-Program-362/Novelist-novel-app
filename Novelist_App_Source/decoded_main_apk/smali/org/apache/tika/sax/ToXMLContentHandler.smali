.class public Lorg/apache/tika/sax/ToXMLContentHandler;
.super Lorg/apache/tika/sax/ToTextContentHandler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/tika/sax/ToXMLContentHandler$ElementInfo;
    }
.end annotation


# instance fields
.field private currentElement:Lorg/apache/tika/sax/ToXMLContentHandler$ElementInfo;

.field private final encoding:Ljava/lang/String;

.field protected inStartElement:Z

.field protected final namespaces:Ljava/util/Map;
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

    .line 9
    invoke-direct {p0}, Lorg/apache/tika/sax/ToTextContentHandler;-><init>()V

    .line 10
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/apache/tika/sax/ToXMLContentHandler;->namespaces:Ljava/util/Map;

    const/4 v0, 0x0

    .line 11
    iput-boolean v0, p0, Lorg/apache/tika/sax/ToXMLContentHandler;->inStartElement:Z

    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lorg/apache/tika/sax/ToXMLContentHandler;->encoding:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/io/OutputStream;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lorg/apache/tika/sax/ToTextContentHandler;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 2
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lorg/apache/tika/sax/ToXMLContentHandler;->namespaces:Ljava/util/Map;

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, Lorg/apache/tika/sax/ToXMLContentHandler;->inStartElement:Z

    .line 4
    iput-object p2, p0, Lorg/apache/tika/sax/ToXMLContentHandler;->encoding:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Lorg/apache/tika/sax/ToTextContentHandler;-><init>()V

    .line 6
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/apache/tika/sax/ToXMLContentHandler;->namespaces:Ljava/util/Map;

    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lorg/apache/tika/sax/ToXMLContentHandler;->inStartElement:Z

    .line 8
    iput-object p1, p0, Lorg/apache/tika/sax/ToXMLContentHandler;->encoding:Ljava/lang/String;

    return-void
.end method

.method private lazyCloseStartElement()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/tika/sax/ToXMLContentHandler;->inStartElement:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x3e

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lorg/apache/tika/sax/ToXMLContentHandler;->write(C)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-boolean v0, p0, Lorg/apache/tika/sax/ToXMLContentHandler;->inStartElement:Z

    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method private writeCharsAndEntity([CIILjava/lang/String;)I
    .locals 1

    .line 1
    sub-int v0, p3, p2

    .line 2
    .line 3
    invoke-super {p0, p1, p2, v0}, Lorg/apache/tika/sax/ToTextContentHandler;->characters([CII)V

    .line 4
    .line 5
    .line 6
    const/16 p1, 0x26

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lorg/apache/tika/sax/ToXMLContentHandler;->write(C)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p4}, Lorg/apache/tika/sax/ToXMLContentHandler;->write(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/16 p1, 0x3b

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lorg/apache/tika/sax/ToXMLContentHandler;->write(C)V

    .line 17
    .line 18
    .line 19
    add-int/lit8 p3, p3, 0x1

    .line 20
    .line 21
    return p3
.end method

.method private writeEscaped([CIIZ)V
    .locals 3

    .line 1
    move v0, p2

    .line 2
    :goto_0
    if-ge p2, p3, :cond_4

    .line 3
    .line 4
    aget-char v1, p1, p2

    .line 5
    .line 6
    const/16 v2, 0x3c

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    const-string v1, "lt"

    .line 11
    .line 12
    invoke-direct {p0, p1, v0, p2, v1}, Lorg/apache/tika/sax/ToXMLContentHandler;->writeCharsAndEntity([CIILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    :goto_1
    move p2, v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/16 v2, 0x3e

    .line 19
    .line 20
    if-ne v1, v2, :cond_1

    .line 21
    .line 22
    const-string v1, "gt"

    .line 23
    .line 24
    invoke-direct {p0, p1, v0, p2, v1}, Lorg/apache/tika/sax/ToXMLContentHandler;->writeCharsAndEntity([CIILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    const/16 v2, 0x26

    .line 30
    .line 31
    if-ne v1, v2, :cond_2

    .line 32
    .line 33
    const-string v1, "amp"

    .line 34
    .line 35
    invoke-direct {p0, p1, v0, p2, v1}, Lorg/apache/tika/sax/ToXMLContentHandler;->writeCharsAndEntity([CIILjava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    if-eqz p4, :cond_3

    .line 41
    .line 42
    const/16 v2, 0x22

    .line 43
    .line 44
    if-ne v1, v2, :cond_3

    .line 45
    .line 46
    const-string v1, "quot"

    .line 47
    .line 48
    invoke-direct {p0, p1, v0, p2, v1}, Lorg/apache/tika/sax/ToXMLContentHandler;->writeCharsAndEntity([CIILjava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    goto :goto_1

    .line 53
    :cond_3
    add-int/lit8 p2, p2, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_4
    sub-int/2addr p3, v0

    .line 57
    invoke-super {p0, p1, v0, p3}, Lorg/apache/tika/sax/ToTextContentHandler;->characters([CII)V

    .line 58
    .line 59
    .line 60
    return-void
.end method


# virtual methods
.method public characters([CII)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/apache/tika/sax/ToXMLContentHandler;->lazyCloseStartElement()V

    .line 2
    .line 3
    .line 4
    add-int/2addr p3, p2

    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-direct {p0, p1, p2, p3, v0}, Lorg/apache/tika/sax/ToXMLContentHandler;->writeEscaped([CIIZ)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-boolean p1, p0, Lorg/apache/tika/sax/ToXMLContentHandler;->inStartElement:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const-string p1, " />"

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lorg/apache/tika/sax/ToXMLContentHandler;->write(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput-boolean p1, p0, Lorg/apache/tika/sax/ToXMLContentHandler;->inStartElement:Z

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-string p1, "</"

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lorg/apache/tika/sax/ToXMLContentHandler;->write(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p3}, Lorg/apache/tika/sax/ToXMLContentHandler;->write(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/16 p1, 0x3e

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lorg/apache/tika/sax/ToXMLContentHandler;->write(C)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p1, p0, Lorg/apache/tika/sax/ToXMLContentHandler;->namespaces:Ljava/util/Map;

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/Map;->clear()V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lorg/apache/tika/sax/ToXMLContentHandler;->currentElement:Lorg/apache/tika/sax/ToXMLContentHandler$ElementInfo;

    .line 33
    .line 34
    invoke-static {p1}, Lorg/apache/tika/sax/ToXMLContentHandler$ElementInfo;->a(Lorg/apache/tika/sax/ToXMLContentHandler$ElementInfo;)Lorg/apache/tika/sax/ToXMLContentHandler$ElementInfo;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Lorg/apache/tika/sax/ToXMLContentHandler;->currentElement:Lorg/apache/tika/sax/ToXMLContentHandler$ElementInfo;

    .line 39
    .line 40
    return-void
.end method

.method public startDocument()V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/ToXMLContentHandler;->encoding:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "<?xml version=\"1.0\" encoding=\""

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lorg/apache/tika/sax/ToXMLContentHandler;->write(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lorg/apache/tika/sax/ToXMLContentHandler;->encoding:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lorg/apache/tika/sax/ToXMLContentHandler;->write(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v0, "\"?>\n"

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lorg/apache/tika/sax/ToXMLContentHandler;->write(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Lorg/apache/tika/sax/ToXMLContentHandler;->currentElement:Lorg/apache/tika/sax/ToXMLContentHandler$ElementInfo;

    .line 22
    .line 23
    iget-object v0, p0, Lorg/apache/tika/sax/ToXMLContentHandler;->namespaces:Ljava/util/Map;

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Lorg/apache/tika/sax/ToXMLContentHandler;->lazyCloseStartElement()V

    .line 2
    .line 3
    .line 4
    new-instance p3, Lorg/apache/tika/sax/ToXMLContentHandler$ElementInfo;

    .line 5
    .line 6
    iget-object v0, p0, Lorg/apache/tika/sax/ToXMLContentHandler;->currentElement:Lorg/apache/tika/sax/ToXMLContentHandler$ElementInfo;

    .line 7
    .line 8
    iget-object v1, p0, Lorg/apache/tika/sax/ToXMLContentHandler;->namespaces:Ljava/util/Map;

    .line 9
    .line 10
    invoke-direct {p3, v0, v1}, Lorg/apache/tika/sax/ToXMLContentHandler$ElementInfo;-><init>(Lorg/apache/tika/sax/ToXMLContentHandler$ElementInfo;Ljava/util/Map;)V

    .line 11
    .line 12
    .line 13
    iput-object p3, p0, Lorg/apache/tika/sax/ToXMLContentHandler;->currentElement:Lorg/apache/tika/sax/ToXMLContentHandler$ElementInfo;

    .line 14
    .line 15
    const/16 p3, 0x3c

    .line 16
    .line 17
    invoke-virtual {p0, p3}, Lorg/apache/tika/sax/ToXMLContentHandler;->write(C)V

    .line 18
    .line 19
    .line 20
    iget-object p3, p0, Lorg/apache/tika/sax/ToXMLContentHandler;->currentElement:Lorg/apache/tika/sax/ToXMLContentHandler$ElementInfo;

    .line 21
    .line 22
    invoke-virtual {p3, p1, p2}, Lorg/apache/tika/sax/ToXMLContentHandler$ElementInfo;->getQName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p0, p1}, Lorg/apache/tika/sax/ToXMLContentHandler;->write(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    move p2, p1

    .line 31
    :goto_0
    invoke-interface {p4}, Lorg/xml/sax/Attributes;->getLength()I

    .line 32
    .line 33
    .line 34
    move-result p3

    .line 35
    const/16 v0, 0x3d

    .line 36
    .line 37
    const/16 v1, 0x20

    .line 38
    .line 39
    const/4 v2, 0x1

    .line 40
    const/16 v3, 0x22

    .line 41
    .line 42
    if-ge p2, p3, :cond_0

    .line 43
    .line 44
    invoke-virtual {p0, v1}, Lorg/apache/tika/sax/ToXMLContentHandler;->write(C)V

    .line 45
    .line 46
    .line 47
    iget-object p3, p0, Lorg/apache/tika/sax/ToXMLContentHandler;->currentElement:Lorg/apache/tika/sax/ToXMLContentHandler$ElementInfo;

    .line 48
    .line 49
    invoke-interface {p4, p2}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-interface {p4, p2}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-virtual {p3, v1, v4}, Lorg/apache/tika/sax/ToXMLContentHandler$ElementInfo;->getQName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    invoke-virtual {p0, p3}, Lorg/apache/tika/sax/ToXMLContentHandler;->write(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, v0}, Lorg/apache/tika/sax/ToXMLContentHandler;->write(C)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v3}, Lorg/apache/tika/sax/ToXMLContentHandler;->write(C)V

    .line 68
    .line 69
    .line 70
    invoke-interface {p4, p2}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p3

    .line 74
    invoke-virtual {p3}, Ljava/lang/String;->toCharArray()[C

    .line 75
    .line 76
    .line 77
    move-result-object p3

    .line 78
    array-length v0, p3

    .line 79
    invoke-direct {p0, p3, p1, v0, v2}, Lorg/apache/tika/sax/ToXMLContentHandler;->writeEscaped([CIIZ)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v3}, Lorg/apache/tika/sax/ToXMLContentHandler;->write(C)V

    .line 83
    .line 84
    .line 85
    add-int/lit8 p2, p2, 0x1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_0
    iget-object p2, p0, Lorg/apache/tika/sax/ToXMLContentHandler;->namespaces:Ljava/util/Map;

    .line 89
    .line 90
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result p3

    .line 102
    if-eqz p3, :cond_2

    .line 103
    .line 104
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p3

    .line 108
    check-cast p3, Ljava/util/Map$Entry;

    .line 109
    .line 110
    invoke-virtual {p0, v1}, Lorg/apache/tika/sax/ToXMLContentHandler;->write(C)V

    .line 111
    .line 112
    .line 113
    const-string p4, "xmlns"

    .line 114
    .line 115
    invoke-virtual {p0, p4}, Lorg/apache/tika/sax/ToXMLContentHandler;->write(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p4

    .line 122
    check-cast p4, Ljava/lang/String;

    .line 123
    .line 124
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    if-lez v4, :cond_1

    .line 129
    .line 130
    const/16 v4, 0x3a

    .line 131
    .line 132
    invoke-virtual {p0, v4}, Lorg/apache/tika/sax/ToXMLContentHandler;->write(C)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0, p4}, Lorg/apache/tika/sax/ToXMLContentHandler;->write(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    :cond_1
    invoke-virtual {p0, v0}, Lorg/apache/tika/sax/ToXMLContentHandler;->write(C)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0, v3}, Lorg/apache/tika/sax/ToXMLContentHandler;->write(C)V

    .line 142
    .line 143
    .line 144
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p3

    .line 148
    check-cast p3, Ljava/lang/String;

    .line 149
    .line 150
    invoke-virtual {p3}, Ljava/lang/String;->toCharArray()[C

    .line 151
    .line 152
    .line 153
    move-result-object p3

    .line 154
    array-length p4, p3

    .line 155
    invoke-direct {p0, p3, p1, p4, v2}, Lorg/apache/tika/sax/ToXMLContentHandler;->writeEscaped([CIIZ)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0, v3}, Lorg/apache/tika/sax/ToXMLContentHandler;->write(C)V

    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_2
    iget-object p1, p0, Lorg/apache/tika/sax/ToXMLContentHandler;->namespaces:Ljava/util/Map;

    .line 163
    .line 164
    invoke-interface {p1}, Ljava/util/Map;->clear()V

    .line 165
    .line 166
    .line 167
    iput-boolean v2, p0, Lorg/apache/tika/sax/ToXMLContentHandler;->inStartElement:Z

    .line 168
    .line 169
    return-void
.end method

.method public startPrefixMapping(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lorg/apache/tika/sax/ToXMLContentHandler;->currentElement:Lorg/apache/tika/sax/ToXMLContentHandler$ElementInfo;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p2}, Lorg/apache/tika/sax/ToXMLContentHandler$ElementInfo;->getPrefix(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0
    :try_end_0
    .catch Lorg/xml/sax/SAXException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :catch_0
    :cond_0
    iget-object v0, p0, Lorg/apache/tika/sax/ToXMLContentHandler;->namespaces:Ljava/util/Map;

    .line 17
    .line 18
    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public write(C)V
    .locals 3

    const/4 v0, 0x1

    .line 1
    new-array v1, v0, [C

    const/4 v2, 0x0

    aput-char p1, v1, v2

    invoke-super {p0, v1, v2, v0}, Lorg/apache/tika/sax/ToTextContentHandler;->characters([CII)V

    return-void
.end method

.method public write(Ljava/lang/String;)V
    .locals 2

    .line 2
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-super {p0, v0, v1, p1}, Lorg/apache/tika/sax/ToTextContentHandler;->characters([CII)V

    return-void
.end method

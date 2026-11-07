.class public Lorg/apache/tika/sax/XHTMLContentHandler;
.super Lorg/apache/tika/sax/SafeContentHandler;
.source "SourceFile"


# static fields
.field private static final AUTO:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final EMPTY_ATTRIBUTES:Lorg/xml/sax/Attributes;

.field public static final ENDLINE:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final HEAD:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final INDENT:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final NL:[C

.field private static final TAB:[C

.field public static final XHTML:Ljava/lang/String; = "http://www.w3.org/1999/xhtml"


# instance fields
.field private documentStarted:Z

.field private headEnded:Z

.field private headStarted:Z

.field private final metadata:Lorg/apache/tika/metadata/Metadata;

.field private useFrameset:Z


# direct methods
.method static constructor <clinit>()V
    .locals 30

    .line 1
    const-string v28, "link"

    .line 2
    .line 3
    const-string v29, "script"

    .line 4
    .line 5
    const-string v1, "p"

    .line 6
    .line 7
    const-string v2, "h1"

    .line 8
    .line 9
    const-string v3, "h2"

    .line 10
    .line 11
    const-string v4, "h3"

    .line 12
    .line 13
    const-string v5, "h4"

    .line 14
    .line 15
    const-string v6, "h5"

    .line 16
    .line 17
    const-string v7, "h6"

    .line 18
    .line 19
    const-string v8, "div"

    .line 20
    .line 21
    const-string v9, "ul"

    .line 22
    .line 23
    const-string v10, "ol"

    .line 24
    .line 25
    const-string v11, "dl"

    .line 26
    .line 27
    const-string v12, "pre"

    .line 28
    .line 29
    const-string v13, "hr"

    .line 30
    .line 31
    const-string v14, "blockquote"

    .line 32
    .line 33
    const-string v15, "address"

    .line 34
    .line 35
    const-string v16, "fieldset"

    .line 36
    .line 37
    const-string v17, "table"

    .line 38
    .line 39
    const-string v18, "form"

    .line 40
    .line 41
    const-string v19, "noscript"

    .line 42
    .line 43
    const-string v20, "li"

    .line 44
    .line 45
    const-string v21, "dt"

    .line 46
    .line 47
    const-string v22, "dd"

    .line 48
    .line 49
    const-string v23, "noframes"

    .line 50
    .line 51
    const-string v24, "br"

    .line 52
    .line 53
    const-string v25, "tr"

    .line 54
    .line 55
    const-string v26, "select"

    .line 56
    .line 57
    const-string v27, "option"

    .line 58
    .line 59
    filled-new-array/range {v1 .. v29}, [Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {v0}, Lorg/apache/tika/sax/XHTMLContentHandler;->unmodifiableSet([Ljava/lang/String;)Ljava/util/Set;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    sput-object v0, Lorg/apache/tika/sax/XHTMLContentHandler;->ENDLINE:Ljava/util/Set;

    .line 68
    .line 69
    const/4 v0, 0x1

    .line 70
    new-array v1, v0, [C

    .line 71
    .line 72
    const/4 v2, 0x0

    .line 73
    const/16 v3, 0xa

    .line 74
    .line 75
    aput-char v3, v1, v2

    .line 76
    .line 77
    sput-object v1, Lorg/apache/tika/sax/XHTMLContentHandler;->NL:[C

    .line 78
    .line 79
    new-array v0, v0, [C

    .line 80
    .line 81
    const/16 v1, 0x9

    .line 82
    .line 83
    aput-char v1, v0, v2

    .line 84
    .line 85
    sput-object v0, Lorg/apache/tika/sax/XHTMLContentHandler;->TAB:[C

    .line 86
    .line 87
    const-string v0, "meta"

    .line 88
    .line 89
    const-string v1, "script"

    .line 90
    .line 91
    const-string v2, "title"

    .line 92
    .line 93
    const-string v3, "link"

    .line 94
    .line 95
    const-string v4, "base"

    .line 96
    .line 97
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-static {v0}, Lorg/apache/tika/sax/XHTMLContentHandler;->unmodifiableSet([Ljava/lang/String;)Ljava/util/Set;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    sput-object v0, Lorg/apache/tika/sax/XHTMLContentHandler;->HEAD:Ljava/util/Set;

    .line 106
    .line 107
    const-string v0, "head"

    .line 108
    .line 109
    const-string v1, "frameset"

    .line 110
    .line 111
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-static {v0}, Lorg/apache/tika/sax/XHTMLContentHandler;->unmodifiableSet([Ljava/lang/String;)Ljava/util/Set;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    sput-object v0, Lorg/apache/tika/sax/XHTMLContentHandler;->AUTO:Ljava/util/Set;

    .line 120
    .line 121
    const-string v5, "th"

    .line 122
    .line 123
    const-string v6, "frame"

    .line 124
    .line 125
    const-string v1, "li"

    .line 126
    .line 127
    const-string v2, "dd"

    .line 128
    .line 129
    const-string v3, "dt"

    .line 130
    .line 131
    const-string v4, "td"

    .line 132
    .line 133
    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-static {v0}, Lorg/apache/tika/sax/XHTMLContentHandler;->unmodifiableSet([Ljava/lang/String;)Ljava/util/Set;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    sput-object v0, Lorg/apache/tika/sax/XHTMLContentHandler;->INDENT:Ljava/util/Set;

    .line 142
    .line 143
    new-instance v0, Lorg/xml/sax/helpers/AttributesImpl;

    .line 144
    .line 145
    invoke-direct {v0}, Lorg/xml/sax/helpers/AttributesImpl;-><init>()V

    .line 146
    .line 147
    .line 148
    sput-object v0, Lorg/apache/tika/sax/XHTMLContentHandler;->EMPTY_ATTRIBUTES:Lorg/xml/sax/Attributes;

    .line 149
    .line 150
    return-void
.end method

.method public constructor <init>(Lorg/xml/sax/ContentHandler;Lorg/apache/tika/metadata/Metadata;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lorg/apache/tika/sax/SafeContentHandler;-><init>(Lorg/xml/sax/ContentHandler;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Lorg/apache/tika/sax/XHTMLContentHandler;->documentStarted:Z

    .line 6
    .line 7
    iput-boolean p1, p0, Lorg/apache/tika/sax/XHTMLContentHandler;->headStarted:Z

    .line 8
    .line 9
    iput-boolean p1, p0, Lorg/apache/tika/sax/XHTMLContentHandler;->headEnded:Z

    .line 10
    .line 11
    iput-boolean p1, p0, Lorg/apache/tika/sax/XHTMLContentHandler;->useFrameset:Z

    .line 12
    .line 13
    iput-object p2, p0, Lorg/apache/tika/sax/XHTMLContentHandler;->metadata:Lorg/apache/tika/metadata/Metadata;

    .line 14
    .line 15
    return-void
.end method

.method private lazyEndHead(Z)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/apache/tika/sax/XHTMLContentHandler;->lazyStartHead()V

    .line 4
    .line 5
    .line 6
    iget-boolean v1, v0, Lorg/apache/tika/sax/XHTMLContentHandler;->headEnded:Z

    .line 7
    .line 8
    if-nez v1, :cond_6

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    iput-boolean v1, v0, Lorg/apache/tika/sax/XHTMLContentHandler;->headEnded:Z

    .line 12
    .line 13
    move/from16 v1, p1

    .line 14
    .line 15
    iput-boolean v1, v0, Lorg/apache/tika/sax/XHTMLContentHandler;->useFrameset:Z

    .line 16
    .line 17
    iget-object v1, v0, Lorg/apache/tika/sax/XHTMLContentHandler;->metadata:Lorg/apache/tika/metadata/Metadata;

    .line 18
    .line 19
    invoke-virtual {v1}, Lorg/apache/tika/metadata/Metadata;->names()[Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    array-length v2, v1

    .line 24
    const/4 v3, 0x0

    .line 25
    move v4, v3

    .line 26
    :goto_0
    const-string v5, "title"

    .line 27
    .line 28
    const-string v6, "http://www.w3.org/1999/xhtml"

    .line 29
    .line 30
    if-ge v4, v2, :cond_3

    .line 31
    .line 32
    aget-object v12, v1, v4

    .line 33
    .line 34
    invoke-virtual {v12, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-eqz v5, :cond_0

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_0
    iget-object v5, v0, Lorg/apache/tika/sax/XHTMLContentHandler;->metadata:Lorg/apache/tika/metadata/Metadata;

    .line 42
    .line 43
    invoke-virtual {v5, v12}, Lorg/apache/tika/metadata/Metadata;->getValues(Ljava/lang/String;)[Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    array-length v13, v5

    .line 48
    move v14, v3

    .line 49
    :goto_1
    if-ge v14, v13, :cond_2

    .line 50
    .line 51
    aget-object v20, v5, v14

    .line 52
    .line 53
    if-eqz v20, :cond_1

    .line 54
    .line 55
    new-instance v15, Lorg/xml/sax/helpers/AttributesImpl;

    .line 56
    .line 57
    invoke-direct {v15}, Lorg/xml/sax/helpers/AttributesImpl;-><init>()V

    .line 58
    .line 59
    .line 60
    const-string v10, "name"

    .line 61
    .line 62
    const-string v11, "CDATA"

    .line 63
    .line 64
    const-string v8, ""

    .line 65
    .line 66
    const-string v9, "name"

    .line 67
    .line 68
    move-object v7, v15

    .line 69
    invoke-virtual/range {v7 .. v12}, Lorg/xml/sax/helpers/AttributesImpl;->addAttribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    const-string v18, "content"

    .line 73
    .line 74
    const-string v19, "CDATA"

    .line 75
    .line 76
    const-string v16, ""

    .line 77
    .line 78
    const-string v17, "content"

    .line 79
    .line 80
    invoke-virtual/range {v15 .. v20}, Lorg/xml/sax/helpers/AttributesImpl;->addAttribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    const-string v7, "meta"

    .line 84
    .line 85
    invoke-super {v0, v6, v7, v7, v15}, Lorg/apache/tika/sax/SafeContentHandler;->startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V

    .line 86
    .line 87
    .line 88
    invoke-super {v0, v6, v7, v7}, Lorg/apache/tika/sax/SafeContentHandler;->endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Lorg/apache/tika/sax/XHTMLContentHandler;->newline()V

    .line 92
    .line 93
    .line 94
    :cond_1
    add-int/lit8 v14, v14, 0x1

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_2
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_3
    sget-object v1, Lorg/apache/tika/sax/XHTMLContentHandler;->EMPTY_ATTRIBUTES:Lorg/xml/sax/Attributes;

    .line 101
    .line 102
    invoke-super {v0, v6, v5, v5, v1}, Lorg/apache/tika/sax/SafeContentHandler;->startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V

    .line 103
    .line 104
    .line 105
    iget-object v2, v0, Lorg/apache/tika/sax/XHTMLContentHandler;->metadata:Lorg/apache/tika/metadata/Metadata;

    .line 106
    .line 107
    sget-object v4, Lorg/apache/tika/metadata/TikaCoreProperties;->TITLE:Lorg/apache/tika/metadata/Property;

    .line 108
    .line 109
    invoke-virtual {v2, v4}, Lorg/apache/tika/metadata/Metadata;->get(Lorg/apache/tika/metadata/Property;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    if-eqz v2, :cond_4

    .line 114
    .line 115
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    if-lez v4, :cond_4

    .line 120
    .line 121
    invoke-virtual {v2}, Ljava/lang/String;->toCharArray()[C

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    array-length v4, v2

    .line 126
    invoke-super {v0, v2, v3, v4}, Lorg/apache/tika/sax/SafeContentHandler;->characters([CII)V

    .line 127
    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_4
    new-array v2, v3, [C

    .line 131
    .line 132
    invoke-super {v0, v2, v3, v3}, Lorg/apache/tika/sax/SafeContentHandler;->characters([CII)V

    .line 133
    .line 134
    .line 135
    :goto_3
    invoke-super {v0, v6, v5, v5}, Lorg/apache/tika/sax/SafeContentHandler;->endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0}, Lorg/apache/tika/sax/XHTMLContentHandler;->newline()V

    .line 139
    .line 140
    .line 141
    const-string v2, "head"

    .line 142
    .line 143
    invoke-super {v0, v6, v2, v2}, Lorg/apache/tika/sax/SafeContentHandler;->endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0}, Lorg/apache/tika/sax/XHTMLContentHandler;->newline()V

    .line 147
    .line 148
    .line 149
    iget-boolean v2, v0, Lorg/apache/tika/sax/XHTMLContentHandler;->useFrameset:Z

    .line 150
    .line 151
    if-eqz v2, :cond_5

    .line 152
    .line 153
    const-string v2, "frameset"

    .line 154
    .line 155
    invoke-super {v0, v6, v2, v2, v1}, Lorg/apache/tika/sax/SafeContentHandler;->startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V

    .line 156
    .line 157
    .line 158
    return-void

    .line 159
    :cond_5
    const-string v2, "body"

    .line 160
    .line 161
    invoke-super {v0, v6, v2, v2, v1}, Lorg/apache/tika/sax/SafeContentHandler;->startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V

    .line 162
    .line 163
    .line 164
    :cond_6
    return-void
.end method

.method private lazyStartHead()V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lorg/apache/tika/sax/XHTMLContentHandler;->headStarted:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lorg/apache/tika/sax/XHTMLContentHandler;->headStarted:Z

    .line 7
    .line 8
    new-instance v1, Lorg/xml/sax/helpers/AttributesImpl;

    .line 9
    .line 10
    invoke-direct {v1}, Lorg/xml/sax/helpers/AttributesImpl;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lorg/apache/tika/sax/XHTMLContentHandler;->metadata:Lorg/apache/tika/metadata/Metadata;

    .line 14
    .line 15
    const-string v2, "Content-Language"

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Lorg/apache/tika/metadata/Metadata;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v6

    .line 21
    if-eqz v6, :cond_0

    .line 22
    .line 23
    const-string v4, "lang"

    .line 24
    .line 25
    const-string v5, "CDATA"

    .line 26
    .line 27
    const-string v2, ""

    .line 28
    .line 29
    const-string v3, "lang"

    .line 30
    .line 31
    invoke-virtual/range {v1 .. v6}, Lorg/xml/sax/helpers/AttributesImpl;->addAttribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    const-string v0, "http://www.w3.org/1999/xhtml"

    .line 35
    .line 36
    const-string v2, "html"

    .line 37
    .line 38
    invoke-super {p0, v0, v2, v2, v1}, Lorg/apache/tika/sax/SafeContentHandler;->startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lorg/apache/tika/sax/XHTMLContentHandler;->newline()V

    .line 42
    .line 43
    .line 44
    sget-object v1, Lorg/apache/tika/sax/XHTMLContentHandler;->EMPTY_ATTRIBUTES:Lorg/xml/sax/Attributes;

    .line 45
    .line 46
    const-string v2, "head"

    .line 47
    .line 48
    invoke-super {p0, v0, v2, v2, v1}, Lorg/apache/tika/sax/SafeContentHandler;->startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lorg/apache/tika/sax/XHTMLContentHandler;->newline()V

    .line 52
    .line 53
    .line 54
    :cond_1
    return-void
.end method

.method private static varargs unmodifiableSet([Ljava/lang/String;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method


# virtual methods
.method public characters(Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {p0, v0, v1, p1}, Lorg/apache/tika/sax/XHTMLContentHandler;->characters([CII)V

    :cond_0
    return-void
.end method

.method public characters([CII)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/tika/sax/XHTMLContentHandler;->useFrameset:Z

    invoke-direct {p0, v0}, Lorg/apache/tika/sax/XHTMLContentHandler;->lazyEndHead(Z)V

    .line 2
    invoke-super {p0, p1, p2, p3}, Lorg/apache/tika/sax/SafeContentHandler;->characters([CII)V

    return-void
.end method

.method public element(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lorg/apache/tika/sax/XHTMLContentHandler;->startElement(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p2}, Lorg/apache/tika/sax/XHTMLContentHandler;->characters(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lorg/apache/tika/sax/XHTMLContentHandler;->endElement(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public endDocument()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lorg/apache/tika/sax/XHTMLContentHandler;->useFrameset:Z

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lorg/apache/tika/sax/XHTMLContentHandler;->lazyEndHead(Z)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lorg/apache/tika/sax/XHTMLContentHandler;->useFrameset:Z

    .line 7
    .line 8
    const-string v1, "http://www.w3.org/1999/xhtml"

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const-string v0, "frameset"

    .line 13
    .line 14
    invoke-super {p0, v1, v0, v0}, Lorg/apache/tika/sax/SafeContentHandler;->endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string v0, "body"

    .line 19
    .line 20
    invoke-super {p0, v1, v0, v0}, Lorg/apache/tika/sax/SafeContentHandler;->endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :goto_0
    const-string v0, "html"

    .line 24
    .line 25
    invoke-super {p0, v1, v0, v0}, Lorg/apache/tika/sax/SafeContentHandler;->endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v0, ""

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Lorg/apache/tika/sax/ContentHandlerDecorator;->endPrefixMapping(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-super {p0}, Lorg/apache/tika/sax/SafeContentHandler;->endDocument()V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public endElement(Ljava/lang/String;)V
    .locals 1

    .line 5
    const-string v0, "http://www.w3.org/1999/xhtml"

    invoke-virtual {p0, v0, p1, p1}, Lorg/apache/tika/sax/XHTMLContentHandler;->endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/tika/sax/XHTMLContentHandler;->AUTO:Ljava/util/Set;

    invoke-interface {v0, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-super {p0, p1, p2, p3}, Lorg/apache/tika/sax/SafeContentHandler;->endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    const-string p2, "http://www.w3.org/1999/xhtml"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lorg/apache/tika/sax/XHTMLContentHandler;->ENDLINE:Ljava/util/Set;

    invoke-interface {p1, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {p0}, Lorg/apache/tika/sax/XHTMLContentHandler;->newline()V

    :cond_0
    return-void
.end method

.method public isInvalid(I)Z
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lorg/apache/tika/sax/SafeContentHandler;->isInvalid(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    const/16 v0, 0x7f

    .line 10
    .line 11
    if-gt v0, p1, :cond_1

    .line 12
    .line 13
    const/16 v0, 0x9f

    .line 14
    .line 15
    if-gt p1, v0, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    const/4 p1, 0x0

    .line 19
    return p1
.end method

.method public newline()V
    .locals 3

    .line 1
    sget-object v0, Lorg/apache/tika/sax/XHTMLContentHandler;->NL:[C

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    array-length v2, v0

    .line 5
    invoke-virtual {p0, v0, v1, v2}, Lorg/apache/tika/sax/SafeContentHandler;->ignorableWhitespace([CII)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public startDocument()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lorg/apache/tika/sax/XHTMLContentHandler;->documentStarted:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lorg/apache/tika/sax/XHTMLContentHandler;->documentStarted:Z

    .line 7
    .line 8
    invoke-super {p0}, Lorg/apache/tika/sax/ContentHandlerDecorator;->startDocument()V

    .line 9
    .line 10
    .line 11
    const-string v0, ""

    .line 12
    .line 13
    const-string v1, "http://www.w3.org/1999/xhtml"

    .line 14
    .line 15
    invoke-virtual {p0, v0, v1}, Lorg/apache/tika/sax/ContentHandlerDecorator;->startPrefixMapping(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public startElement(Ljava/lang/String;)V
    .locals 2

    .line 10
    const-string v0, "http://www.w3.org/1999/xhtml"

    sget-object v1, Lorg/apache/tika/sax/XHTMLContentHandler;->EMPTY_ATTRIBUTES:Lorg/xml/sax/Attributes;

    invoke-virtual {p0, v0, p1, p1, v1}, Lorg/apache/tika/sax/XHTMLContentHandler;->startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V

    return-void
.end method

.method public startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 11
    new-instance v0, Lorg/xml/sax/helpers/AttributesImpl;

    invoke-direct {v0}, Lorg/xml/sax/helpers/AttributesImpl;-><init>()V

    .line 12
    const-string v1, ""

    const-string v4, "CDATA"

    move-object v3, p2

    move-object v2, p2

    move-object v5, p3

    invoke-virtual/range {v0 .. v5}, Lorg/xml/sax/helpers/AttributesImpl;->addAttribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    const-string p2, "http://www.w3.org/1999/xhtml"

    invoke-virtual {p0, p2, p1, p1, v0}, Lorg/apache/tika/sax/XHTMLContentHandler;->startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V

    return-void
.end method

.method public startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 3

    .line 1
    const-string v0, "frameset"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    .line 2
    invoke-direct {p0, p1}, Lorg/apache/tika/sax/XHTMLContentHandler;->lazyEndHead(Z)V

    return-void

    .line 3
    :cond_0
    sget-object v0, Lorg/apache/tika/sax/XHTMLContentHandler;->AUTO:Ljava/util/Set;

    invoke-interface {v0, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 4
    sget-object v0, Lorg/apache/tika/sax/XHTMLContentHandler;->HEAD:Ljava/util/Set;

    invoke-interface {v0, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 5
    invoke-direct {p0}, Lorg/apache/tika/sax/XHTMLContentHandler;->lazyStartHead()V

    goto :goto_0

    .line 6
    :cond_1
    invoke-direct {p0, v1}, Lorg/apache/tika/sax/XHTMLContentHandler;->lazyEndHead(Z)V

    .line 7
    :goto_0
    const-string v0, "http://www.w3.org/1999/xhtml"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lorg/apache/tika/sax/XHTMLContentHandler;->INDENT:Ljava/util/Set;

    invoke-interface {v0, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 8
    sget-object v0, Lorg/apache/tika/sax/XHTMLContentHandler;->TAB:[C

    array-length v2, v0

    invoke-virtual {p0, v0, v1, v2}, Lorg/apache/tika/sax/SafeContentHandler;->ignorableWhitespace([CII)V

    .line 9
    :cond_2
    invoke-super {p0, p1, p2, p3, p4}, Lorg/apache/tika/sax/SafeContentHandler;->startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V

    :cond_3
    return-void
.end method

.method public startElement(Ljava/lang/String;Lorg/xml/sax/helpers/AttributesImpl;)V
    .locals 1

    .line 14
    const-string v0, "http://www.w3.org/1999/xhtml"

    invoke-virtual {p0, v0, p1, p1, p2}, Lorg/apache/tika/sax/XHTMLContentHandler;->startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V

    return-void
.end method

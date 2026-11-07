.class public Lorg/apache/tika/parser/RecursiveParserWrapper;
.super Lorg/apache/tika/parser/ParserDecorator;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/tika/parser/RecursiveParserWrapper$RecursivelySecureContentHandler;,
        Lorg/apache/tika/parser/RecursiveParserWrapper$SecureHandlerCounter;,
        Lorg/apache/tika/parser/RecursiveParserWrapper$ParserState;,
        Lorg/apache/tika/parser/RecursiveParserWrapper$EmbeddedParserDecorator;
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x7e19dcddbd6e48faL


# instance fields
.field private final catchEmbeddedExceptions:Z

.field private final inlineContent:Z


# direct methods
.method public constructor <init>(Lorg/apache/tika/parser/Parser;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, p1, v0}, Lorg/apache/tika/parser/RecursiveParserWrapper;-><init>(Lorg/apache/tika/parser/Parser;Z)V

    return-void
.end method

.method public constructor <init>(Lorg/apache/tika/parser/Parser;Z)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lorg/apache/tika/parser/ParserDecorator;-><init>(Lorg/apache/tika/parser/Parser;)V

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, Lorg/apache/tika/parser/RecursiveParserWrapper;->inlineContent:Z

    .line 4
    iput-boolean p2, p0, Lorg/apache/tika/parser/RecursiveParserWrapper;->catchEmbeddedExceptions:Z

    return-void
.end method

.method public static bridge synthetic a(Lorg/apache/tika/parser/RecursiveParserWrapper;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lorg/apache/tika/parser/RecursiveParserWrapper;->catchEmbeddedExceptions:Z

    return p0
.end method

.method public static getResourceName(Lorg/apache/tika/metadata/Metadata;Ljava/util/concurrent/atomic/AtomicInteger;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "resourceName"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lorg/apache/tika/metadata/Metadata;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lorg/apache/tika/metadata/Metadata;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-string v0, "embeddedRelationshipId"

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lorg/apache/tika/metadata/Metadata;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lorg/apache/tika/metadata/Metadata;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    sget-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->VERSION_NUMBER:Lorg/apache/tika/metadata/Property;

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Lorg/apache/tika/metadata/Metadata;->get(Lorg/apache/tika/metadata/Property;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Lorg/apache/tika/metadata/Metadata;->get(Lorg/apache/tika/metadata/Property;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    const-string p1, "version-number-"

    .line 40
    .line 41
    invoke-static {p1, p0}, Lt/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    const-string p1, "embedded-"

    .line 51
    .line 52
    invoke-static {p1, p0}, LB1/e;->g(Ljava/lang/String;I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    :goto_0
    invoke-static {p0}, Lorg/apache/tika/io/FilenameUtils;->getName(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0
.end method


# virtual methods
.method public getSupportedTypes(Lorg/apache/tika/parser/ParseContext;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/tika/parser/ParseContext;",
            ")",
            "Ljava/util/Set<",
            "Lorg/apache/tika/mime/MediaType;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lorg/apache/tika/parser/ParserDecorator;->getWrappedParser()Lorg/apache/tika/parser/Parser;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Lorg/apache/tika/parser/Parser;->getSupportedTypes(Lorg/apache/tika/parser/ParseContext;)Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public parse(Ljava/io/InputStream;Lorg/xml/sax/ContentHandler;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)V
    .locals 16

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move-object/from16 v7, p4

    .line 6
    .line 7
    const-class v8, Lorg/apache/tika/parser/RecursiveParserWrapper$RecursivelySecureContentHandler;

    .line 8
    .line 9
    instance-of v2, v0, Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;

    .line 10
    .line 11
    if-eqz v2, :cond_3

    .line 12
    .line 13
    new-instance v9, Lorg/apache/tika/parser/RecursiveParserWrapper$ParserState;

    .line 14
    .line 15
    move-object v2, v0

    .line 16
    check-cast v2, Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-direct {v9, v2, v3}, Lorg/apache/tika/parser/RecursiveParserWrapper$ParserState;-><init>(Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;I)V

    .line 20
    .line 21
    .line 22
    new-instance v4, Lorg/apache/tika/parser/RecursiveParserWrapper$EmbeddedParserDecorator;

    .line 23
    .line 24
    invoke-virtual/range {p0 .. p0}, Lorg/apache/tika/parser/ParserDecorator;->getWrappedParser()Lorg/apache/tika/parser/Parser;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    move-object/from16 v10, p0

    .line 29
    .line 30
    invoke-direct {v4, v10, v5, v9}, Lorg/apache/tika/parser/RecursiveParserWrapper$EmbeddedParserDecorator;-><init>(Lorg/apache/tika/parser/RecursiveParserWrapper;Lorg/apache/tika/parser/Parser;Lorg/apache/tika/parser/RecursiveParserWrapper$ParserState;)V

    .line 31
    .line 32
    .line 33
    const-class v5, Lorg/apache/tika/parser/Parser;

    .line 34
    .line 35
    invoke-virtual {v7, v5, v4}, Lorg/apache/tika/parser/ParseContext;->set(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-static {v9}, Lorg/apache/tika/parser/RecursiveParserWrapper$ParserState;->b(Lorg/apache/tika/parser/RecursiveParserWrapper$ParserState;)Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-virtual {v4}, Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;->getNewContentHandler()Lorg/xml/sax/ContentHandler;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 47
    .line 48
    .line 49
    move-result-wide v11

    .line 50
    invoke-static {v9}, Lorg/apache/tika/parser/RecursiveParserWrapper$ParserState;->b(Lorg/apache/tika/parser/RecursiveParserWrapper$ParserState;)Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-virtual {v5}, Lorg/xml/sax/helpers/DefaultHandler;->startDocument()V

    .line 55
    .line 56
    .line 57
    new-instance v13, Lorg/apache/tika/io/TemporaryResources;

    .line 58
    .line 59
    invoke-direct {v13}, Lorg/apache/tika/io/TemporaryResources;-><init>()V

    .line 60
    .line 61
    .line 62
    if-eqz v0, :cond_0

    .line 63
    .line 64
    invoke-virtual {v2}, Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;->getContentHandlerFactory()Lorg/apache/tika/sax/ContentHandlerFactory;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    instance-of v2, v0, Lorg/apache/tika/sax/WriteLimiter;

    .line 69
    .line 70
    if-eqz v2, :cond_0

    .line 71
    .line 72
    check-cast v0, Lorg/apache/tika/sax/WriteLimiter;

    .line 73
    .line 74
    invoke-interface {v0}, Lorg/apache/tika/sax/WriteLimiter;->getWriteLimit()I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    invoke-interface {v0}, Lorg/apache/tika/sax/WriteLimiter;->isThrowOnWriteLimitReached()Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    :goto_0
    move v6, v0

    .line 83
    goto :goto_1

    .line 84
    :cond_0
    const/4 v2, -0x1

    .line 85
    const/4 v0, 0x1

    .line 86
    goto :goto_0

    .line 87
    :goto_1
    const/4 v14, 0x0

    .line 88
    move-object/from16 v0, p1

    .line 89
    .line 90
    :try_start_0
    invoke-static {v0, v13, v1}, Lorg/apache/tika/io/TikaInputStream;->get(Ljava/io/InputStream;Lorg/apache/tika/io/TemporaryResources;Lorg/apache/tika/metadata/Metadata;)Lorg/apache/tika/io/TikaInputStream;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    new-instance v5, Lorg/apache/tika/parser/RecursiveParserWrapper$RecursivelySecureContentHandler;

    .line 95
    .line 96
    move-object v15, v5

    .line 97
    new-instance v5, Lorg/apache/tika/parser/RecursiveParserWrapper$SecureHandlerCounter;

    .line 98
    .line 99
    invoke-direct {v5, v2, v3}, Lorg/apache/tika/parser/RecursiveParserWrapper$SecureHandlerCounter;-><init>(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 100
    .line 101
    .line 102
    move-object v3, v4

    .line 103
    move-object v2, v15

    .line 104
    move-object v4, v0

    .line 105
    :try_start_1
    invoke-direct/range {v2 .. v7}, Lorg/apache/tika/parser/RecursiveParserWrapper$RecursivelySecureContentHandler;-><init>(Lorg/xml/sax/ContentHandler;Lorg/apache/tika/io/TikaInputStream;Lorg/apache/tika/parser/RecursiveParserWrapper$SecureHandlerCounter;ZLorg/apache/tika/parser/ParseContext;)V

    .line 106
    .line 107
    .line 108
    move-object v15, v2

    .line 109
    invoke-virtual {v7, v8, v15}, Lorg/apache/tika/parser/ParseContext;->set(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v10}, Lorg/apache/tika/parser/ParserDecorator;->getWrappedParser()Lorg/apache/tika/parser/Parser;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-interface {v0, v4, v15, v1, v7}, Lorg/apache/tika/parser/Parser;->parse(Ljava/io/InputStream;Lorg/xml/sax/ContentHandler;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 117
    .line 118
    .line 119
    :goto_2
    invoke-virtual {v13}, Lorg/apache/tika/io/TemporaryResources;->dispose()V

    .line 120
    .line 121
    .line 122
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 123
    .line 124
    .line 125
    move-result-wide v4

    .line 126
    sub-long/2addr v4, v11

    .line 127
    sget-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->PARSE_TIME_MILLIS:Lorg/apache/tika/metadata/Property;

    .line 128
    .line 129
    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-virtual {v1, v0, v2}, Lorg/apache/tika/metadata/Metadata;->set(Lorg/apache/tika/metadata/Property;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-static {v9}, Lorg/apache/tika/parser/RecursiveParserWrapper$ParserState;->b(Lorg/apache/tika/parser/RecursiveParserWrapper$ParserState;)Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-virtual {v0, v3, v1}, Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;->endDocument(Lorg/xml/sax/ContentHandler;Lorg/apache/tika/metadata/Metadata;)V

    .line 141
    .line 142
    .line 143
    invoke-static {v9}, Lorg/apache/tika/parser/RecursiveParserWrapper$ParserState;->b(Lorg/apache/tika/parser/RecursiveParserWrapper$ParserState;)Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-virtual {v0}, Lorg/xml/sax/helpers/DefaultHandler;->endDocument()V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v7, v8, v14}, Lorg/apache/tika/parser/ParseContext;->set(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :catchall_0
    move-exception v0

    .line 155
    goto :goto_3

    .line 156
    :catchall_1
    move-exception v0

    .line 157
    move-object v3, v4

    .line 158
    :goto_3
    :try_start_2
    instance-of v2, v0, Lorg/apache/tika/exception/EncryptedDocumentException;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 159
    .line 160
    const-string v4, "true"

    .line 161
    .line 162
    if-eqz v2, :cond_1

    .line 163
    .line 164
    :try_start_3
    sget-object v2, Lorg/apache/tika/metadata/TikaCoreProperties;->IS_ENCRYPTED:Lorg/apache/tika/metadata/Property;

    .line 165
    .line 166
    invoke-virtual {v1, v2, v4}, Lorg/apache/tika/metadata/Metadata;->set(Lorg/apache/tika/metadata/Property;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    goto :goto_4

    .line 170
    :catchall_2
    move-exception v0

    .line 171
    goto :goto_5

    .line 172
    :cond_1
    :goto_4
    invoke-static {v0}, Lorg/apache/tika/exception/WriteLimitReachedException;->isWriteLimitReached(Ljava/lang/Throwable;)Z

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    if-eqz v2, :cond_2

    .line 177
    .line 178
    sget-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->WRITE_LIMIT_REACHED:Lorg/apache/tika/metadata/Property;

    .line 179
    .line 180
    invoke-virtual {v1, v0, v4}, Lorg/apache/tika/metadata/Metadata;->set(Lorg/apache/tika/metadata/Property;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_2
    invoke-static {v0}, Lorg/apache/tika/utils/ExceptionUtils;->getFilteredStackTrace(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    sget-object v4, Lorg/apache/tika/metadata/TikaCoreProperties;->CONTAINER_EXCEPTION:Lorg/apache/tika/metadata/Property;

    .line 189
    .line 190
    invoke-virtual {v1, v4, v2}, Lorg/apache/tika/metadata/Metadata;->add(Lorg/apache/tika/metadata/Property;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 194
    :goto_5
    invoke-virtual {v13}, Lorg/apache/tika/io/TemporaryResources;->dispose()V

    .line 195
    .line 196
    .line 197
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 198
    .line 199
    .line 200
    move-result-wide v4

    .line 201
    sub-long/2addr v4, v11

    .line 202
    sget-object v2, Lorg/apache/tika/metadata/TikaCoreProperties;->PARSE_TIME_MILLIS:Lorg/apache/tika/metadata/Property;

    .line 203
    .line 204
    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    invoke-virtual {v1, v2, v4}, Lorg/apache/tika/metadata/Metadata;->set(Lorg/apache/tika/metadata/Property;Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-static {v9}, Lorg/apache/tika/parser/RecursiveParserWrapper$ParserState;->b(Lorg/apache/tika/parser/RecursiveParserWrapper$ParserState;)Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    invoke-virtual {v2, v3, v1}, Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;->endDocument(Lorg/xml/sax/ContentHandler;Lorg/apache/tika/metadata/Metadata;)V

    .line 216
    .line 217
    .line 218
    invoke-static {v9}, Lorg/apache/tika/parser/RecursiveParserWrapper$ParserState;->b(Lorg/apache/tika/parser/RecursiveParserWrapper$ParserState;)Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    invoke-virtual {v1}, Lorg/xml/sax/helpers/DefaultHandler;->endDocument()V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v7, v8, v14}, Lorg/apache/tika/parser/ParseContext;->set(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    throw v0

    .line 229
    :cond_3
    move-object/from16 v10, p0

    .line 230
    .line 231
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 232
    .line 233
    const-string v1, "ContentHandler must implement RecursiveParserWrapperHandler"

    .line 234
    .line 235
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    throw v0
.end method

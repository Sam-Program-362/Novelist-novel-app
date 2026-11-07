.class public Lorg/apache/tika/embedder/ExternalEmbedder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/apache/tika/embedder/Embedder;


# static fields
.field public static final METADATA_COMMAND_ARGUMENTS_SERIALIZED_TOKEN:Ljava/lang/String; = "${METADATA_SERIALIZED}"

.field public static final METADATA_COMMAND_ARGUMENTS_TOKEN:Ljava/lang/String; = "${METADATA}"

.field private static final serialVersionUID:J = -0x2742053d08e534b1L


# instance fields
.field private command:[Ljava/lang/String;

.field private commandAppendOperator:Ljava/lang/String;

.field private commandAssignmentDelimeter:Ljava/lang/String;

.field private commandAssignmentOperator:Ljava/lang/String;

.field private metadataCommandArguments:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lorg/apache/tika/metadata/Property;",
            "[",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private quoteAssignmentValues:Z

.field private supportedEmbedTypes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lorg/apache/tika/mime/MediaType;",
            ">;"
        }
    .end annotation
.end field

.field private final tmp:Lorg/apache/tika/io/TemporaryResources;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/apache/tika/io/TemporaryResources;

    .line 5
    .line 6
    invoke-direct {v0}, Lorg/apache/tika/io/TemporaryResources;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lorg/apache/tika/embedder/ExternalEmbedder;->tmp:Lorg/apache/tika/io/TemporaryResources;

    .line 10
    .line 11
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 12
    .line 13
    iput-object v0, p0, Lorg/apache/tika/embedder/ExternalEmbedder;->supportedEmbedTypes:Ljava/util/Set;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, Lorg/apache/tika/embedder/ExternalEmbedder;->metadataCommandArguments:Ljava/util/Map;

    .line 17
    .line 18
    const-string v0, "$a\\\n${METADATA_SERIALIZED}"

    .line 19
    .line 20
    const-string v1, "${INPUT}"

    .line 21
    .line 22
    const-string v2, "sed"

    .line 23
    .line 24
    const-string v3, "-e"

    .line 25
    .line 26
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lorg/apache/tika/embedder/ExternalEmbedder;->command:[Ljava/lang/String;

    .line 31
    .line 32
    const-string v0, "="

    .line 33
    .line 34
    iput-object v0, p0, Lorg/apache/tika/embedder/ExternalEmbedder;->commandAssignmentOperator:Ljava/lang/String;

    .line 35
    .line 36
    const-string v1, ", "

    .line 37
    .line 38
    iput-object v1, p0, Lorg/apache/tika/embedder/ExternalEmbedder;->commandAssignmentDelimeter:Ljava/lang/String;

    .line 39
    .line 40
    iput-object v0, p0, Lorg/apache/tika/embedder/ExternalEmbedder;->commandAppendOperator:Ljava/lang/String;

    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    iput-boolean v0, p0, Lorg/apache/tika/embedder/ExternalEmbedder;->quoteAssignmentValues:Z

    .line 44
    .line 45
    return-void
.end method

.method public static synthetic a(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lorg/apache/tika/embedder/ExternalEmbedder;->lambda$multiThreadedStreamCopy$2(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    return-void
.end method

.method public static synthetic b(I)[Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lorg/apache/tika/embedder/ExternalEmbedder;->lambda$embed$1(I)[Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(I)[Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lorg/apache/tika/embedder/ExternalEmbedder;->lambda$embed$0(I)[Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static varargs check(Ljava/lang/String;[I)Z
    .locals 0

    .line 1
    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, p1}, Lorg/apache/tika/embedder/ExternalEmbedder;->check([Ljava/lang/String;[I)Z

    move-result p0

    return p0
.end method

.method public static varargs check([Ljava/lang/String;[I)Z
    .locals 5

    .line 2
    array-length v0, p1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    .line 3
    new-array p1, v1, [I

    const/16 v0, 0x7f

    aput v0, p1, v2

    .line 4
    :cond_0
    :try_start_0
    array-length v0, p0

    if-ne v0, v1, :cond_1

    .line 5
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    aget-object p0, p0, v2

    invoke-virtual {v0, p0}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    move-result-object p0

    goto :goto_0

    .line 6
    :cond_1
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/Runtime;->exec([Ljava/lang/String;)Ljava/lang/Process;

    move-result-object p0

    .line 7
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Process;->waitFor()I

    move-result p0

    .line 8
    array-length v0, p1

    move v3, v2

    :goto_1
    if-ge v3, v0, :cond_3

    aget v4, p1, v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    if-ne p0, v4, :cond_2

    return v2

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    return v1

    :catch_0
    return v2
.end method

.method private static synthetic lambda$embed$0(I)[Ljava/lang/String;
    .locals 0

    .line 1
    new-array p0, p0, [Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method private static synthetic lambda$embed$1(I)[Ljava/lang/String;
    .locals 0

    .line 1
    new-array p0, p0, [Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method private static synthetic lambda$multiThreadedStreamCopy$2(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {p0, p1}, Ls2/c;->b(Ljava/io/InputStream;Ljava/io/OutputStream;)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catch_0
    move-exception p0

    .line 6
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v1, "ERROR: "

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p1, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method private multiThreadedStreamCopy(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/Thread;

    .line 2
    .line 3
    new-instance v1, LM/c;

    .line 4
    .line 5
    const/16 v2, 0x14

    .line 6
    .line 7
    invoke-direct {v1, p1, p2, v2}, LM/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private sendInputStreamToStdIn(Ljava/io/InputStream;Ljava/lang/Process;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Process;->getOutputStream()Ljava/io/OutputStream;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-direct {p0, p1, p2}, Lorg/apache/tika/embedder/ExternalEmbedder;->multiThreadedStreamCopy(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private sendStdErrToOutputStream(Ljava/lang/Process;Ljava/io/OutputStream;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Process;->getErrorStream()Ljava/io/InputStream;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0, p1, p2}, Lorg/apache/tika/embedder/ExternalEmbedder;->multiThreadedStreamCopy(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private sendStdOutToOutputStream(Ljava/lang/Process;Ljava/io/OutputStream;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1, p2}, Ls2/c;->b(Ljava/io/InputStream;Ljava/io/OutputStream;)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :catch_0
    move-exception p1

    .line 10
    sget-object p2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v1, "ERROR: "

    .line 19
    .line 20
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p2, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public static serializeMetadata(Ljava/util/List;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, ""

    .line 13
    .line 14
    return-object p0
.end method


# virtual methods
.method public embed(Lorg/apache/tika/metadata/Metadata;Ljava/io/InputStream;Ljava/io/OutputStream;Lorg/apache/tika/parser/ParseContext;)V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p3

    .line 4
    .line 5
    const-string v3, "\nExecutable Error:\n\n"

    .line 6
    .line 7
    const-string v4, "There was an error executing the command line\nExecutable Command:\n\n"

    .line 8
    .line 9
    iget-object v0, v1, Lorg/apache/tika/embedder/ExternalEmbedder;->metadataCommandArguments:Ljava/util/Map;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    :goto_0
    invoke-static/range {p2 .. p2}, Lorg/apache/tika/io/TikaInputStream;->get(Ljava/io/InputStream;)Lorg/apache/tika/io/TikaInputStream;

    .line 23
    .line 24
    .line 25
    move-result-object v7

    .line 26
    const/4 v8, 0x0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual/range {p0 .. p1}, Lorg/apache/tika/embedder/ExternalEmbedder;->getCommandMetadataSegments(Lorg/apache/tika/metadata/Metadata;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v9

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move-object v9, v8

    .line 35
    :goto_1
    iget-object v10, v1, Lorg/apache/tika/embedder/ExternalEmbedder;->command:[Ljava/lang/String;

    .line 36
    .line 37
    new-instance v11, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    array-length v12, v10

    .line 43
    const/4 v13, 0x0

    .line 44
    const/4 v14, 0x0

    .line 45
    const/4 v15, 0x0

    .line 46
    const/16 v16, 0x1

    .line 47
    .line 48
    const/16 v17, 0x1

    .line 49
    .line 50
    :goto_2
    const-string v5, "${METADATA_SERIALIZED}"

    .line 51
    .line 52
    if-ge v13, v12, :cond_7

    .line 53
    .line 54
    aget-object v6, v10, v13

    .line 55
    .line 56
    move/from16 v18, v0

    .line 57
    .line 58
    const-string v0, "${INPUT}"

    .line 59
    .line 60
    invoke-virtual {v6, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 61
    .line 62
    .line 63
    move-result v19

    .line 64
    if-eqz v19, :cond_2

    .line 65
    .line 66
    invoke-virtual {v7}, Lorg/apache/tika/io/TikaInputStream;->getFile()Ljava/io/File;

    .line 67
    .line 68
    .line 69
    move-result-object v16

    .line 70
    move-object/from16 v19, v7

    .line 71
    .line 72
    invoke-virtual/range {v16 .. v16}, Ljava/io/File;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    invoke-virtual {v6, v0, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    const/16 v16, 0x0

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_2
    move-object/from16 v19, v7

    .line 84
    .line 85
    :goto_3
    const-string v0, "${OUTPUT}"

    .line 86
    .line 87
    invoke-virtual {v6, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 88
    .line 89
    .line 90
    move-result v7

    .line 91
    if-eqz v7, :cond_3

    .line 92
    .line 93
    iget-object v7, v1, Lorg/apache/tika/embedder/ExternalEmbedder;->tmp:Lorg/apache/tika/io/TemporaryResources;

    .line 94
    .line 95
    invoke-virtual {v7}, Lorg/apache/tika/io/TemporaryResources;->createTemporaryFile()Ljava/io/File;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    invoke-virtual {v7}, Ljava/io/File;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    invoke-virtual {v6, v0, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    move-object v8, v7

    .line 108
    const/16 v17, 0x0

    .line 109
    .line 110
    :cond_3
    invoke-virtual {v6, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eqz v0, :cond_4

    .line 115
    .line 116
    const/4 v14, 0x1

    .line 117
    :cond_4
    const-string v0, "${METADATA}"

    .line 118
    .line 119
    invoke-virtual {v6, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-eqz v0, :cond_6

    .line 124
    .line 125
    if-eqz v18, :cond_5

    .line 126
    .line 127
    invoke-virtual {v11, v9}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 128
    .line 129
    .line 130
    :cond_5
    const/4 v15, 0x1

    .line 131
    goto :goto_4

    .line 132
    :cond_6
    invoke-virtual {v11, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    :goto_4
    add-int/lit8 v13, v13, 0x1

    .line 136
    .line 137
    move/from16 v0, v18

    .line 138
    .line 139
    move-object/from16 v7, v19

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_7
    move/from16 v18, v0

    .line 143
    .line 144
    move-object/from16 v19, v7

    .line 145
    .line 146
    if-eqz v18, :cond_a

    .line 147
    .line 148
    if-eqz v14, :cond_9

    .line 149
    .line 150
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    const/4 v6, 0x0

    .line 155
    const/4 v7, 0x0

    .line 156
    :goto_5
    if-ge v7, v0, :cond_a

    .line 157
    .line 158
    invoke-virtual {v11, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v10

    .line 162
    add-int/lit8 v7, v7, 0x1

    .line 163
    .line 164
    check-cast v10, Ljava/lang/String;

    .line 165
    .line 166
    invoke-virtual {v10, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 167
    .line 168
    .line 169
    move-result v12

    .line 170
    if-eqz v12, :cond_8

    .line 171
    .line 172
    invoke-static {v9}, Lorg/apache/tika/embedder/ExternalEmbedder;->serializeMetadata(Ljava/util/List;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v12

    .line 176
    invoke-virtual {v10, v5, v12}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v10

    .line 180
    invoke-virtual {v11, v6, v10}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    :cond_8
    add-int/lit8 v6, v6, 0x1

    .line 184
    .line 185
    goto :goto_5

    .line 186
    :cond_9
    if-nez v15, :cond_a

    .line 187
    .line 188
    if-nez v14, :cond_a

    .line 189
    .line 190
    invoke-virtual {v11, v9}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 191
    .line 192
    .line 193
    :cond_a
    invoke-virtual {v11}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    array-length v0, v0

    .line 198
    const/4 v5, 0x1

    .line 199
    if-ne v0, v5, :cond_b

    .line 200
    .line 201
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    new-instance v5, Lz2/a;

    .line 206
    .line 207
    const/4 v6, 0x0

    .line 208
    invoke-direct {v5, v6}, Lz2/a;-><init>(I)V

    .line 209
    .line 210
    .line 211
    invoke-static {v11, v5}, Lorg/apache/tika/io/a;->e(Ljava/util/ArrayList;Lz2/a;)[Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v5

    .line 215
    check-cast v5, [Ljava/lang/String;

    .line 216
    .line 217
    aget-object v5, v5, v6

    .line 218
    .line 219
    invoke-virtual {v0, v5}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    :goto_6
    move-object v5, v0

    .line 224
    goto :goto_7

    .line 225
    :cond_b
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    new-instance v6, Lz2/a;

    .line 230
    .line 231
    invoke-direct {v6, v5}, Lz2/a;-><init>(I)V

    .line 232
    .line 233
    .line 234
    invoke-static {v11, v6}, Lorg/apache/tika/io/a;->f(Ljava/util/ArrayList;Lz2/a;)[Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v5

    .line 238
    check-cast v5, [Ljava/lang/String;

    .line 239
    .line 240
    invoke-virtual {v0, v5}, Ljava/lang/Runtime;->exec([Ljava/lang/String;)Ljava/lang/Process;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    goto :goto_6

    .line 245
    :goto_7
    sget v0, Lx2/c;->p:I

    .line 246
    .line 247
    new-instance v0, Lw2/e;

    .line 248
    .line 249
    invoke-direct {v0}, Lt2/d;-><init>()V

    .line 250
    .line 251
    .line 252
    new-instance v6, Lx2/c;

    .line 253
    .line 254
    invoke-direct {v6, v0}, Lx2/c;-><init>(Lw2/e;)V

    .line 255
    .line 256
    .line 257
    :try_start_0
    invoke-direct {v1, v5, v6}, Lorg/apache/tika/embedder/ExternalEmbedder;->sendStdErrToOutputStream(Ljava/lang/Process;Ljava/io/OutputStream;)V

    .line 258
    .line 259
    .line 260
    if-eqz v16, :cond_c

    .line 261
    .line 262
    move-object/from16 v0, p2

    .line 263
    .line 264
    invoke-direct {v1, v0, v5}, Lorg/apache/tika/embedder/ExternalEmbedder;->sendInputStreamToStdIn(Ljava/io/InputStream;Ljava/lang/Process;)V

    .line 265
    .line 266
    .line 267
    goto :goto_8

    .line 268
    :catchall_0
    move-exception v0

    .line 269
    goto :goto_b

    .line 270
    :cond_c
    invoke-virtual {v5}, Ljava/lang/Process;->getOutputStream()Ljava/io/OutputStream;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 275
    .line 276
    .line 277
    :goto_8
    if-eqz v17, :cond_d

    .line 278
    .line 279
    invoke-direct {v1, v5, v2}, Lorg/apache/tika/embedder/ExternalEmbedder;->sendStdOutToOutputStream(Ljava/lang/Process;Ljava/io/OutputStream;)V

    .line 280
    .line 281
    .line 282
    goto :goto_9

    .line 283
    :cond_d
    iget-object v0, v1, Lorg/apache/tika/embedder/ExternalEmbedder;->tmp:Lorg/apache/tika/io/TemporaryResources;

    .line 284
    .line 285
    invoke-virtual {v0}, Lorg/apache/tika/io/TemporaryResources;->dispose()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 286
    .line 287
    .line 288
    :try_start_1
    invoke-virtual {v5}, Ljava/lang/Process;->waitFor()I
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 289
    .line 290
    .line 291
    :catch_0
    :try_start_2
    invoke-static {v8}, Lio/flutter/plugin/editing/i;->j(Ljava/io/File;)Ljava/nio/file/Path;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    invoke-static {v0}, Lorg/apache/tika/io/TikaInputStream;->get(Ljava/nio/file/Path;)Lorg/apache/tika/io/TikaInputStream;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    invoke-static {v0, v2}, Ls2/c;->b(Ljava/io/InputStream;Ljava/io/OutputStream;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 300
    .line 301
    .line 302
    :goto_9
    if-eqz v17, :cond_e

    .line 303
    .line 304
    :try_start_3
    invoke-virtual {v5}, Ljava/lang/Process;->waitFor()I
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_1

    .line 305
    .line 306
    .line 307
    goto :goto_a

    .line 308
    :cond_e
    :try_start_4
    invoke-virtual {v8}, Ljava/io/File;->delete()Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 309
    .line 310
    .line 311
    :catch_1
    :goto_a
    if-nez v16, :cond_f

    .line 312
    .line 313
    invoke-static/range {v19 .. v19}, Ls2/c;->a(Ljava/io/Closeable;)V

    .line 314
    .line 315
    .line 316
    :cond_f
    invoke-static {v2}, Ls2/c;->a(Ljava/io/Closeable;)V

    .line 317
    .line 318
    .line 319
    invoke-static {v6}, Ls2/c;->a(Ljava/io/Closeable;)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v5}, Ljava/lang/Process;->exitValue()I

    .line 323
    .line 324
    .line 325
    move-result v0

    .line 326
    if-nez v0, :cond_10

    .line 327
    .line 328
    return-void

    .line 329
    :cond_10
    new-instance v0, Lorg/apache/tika/exception/TikaException;

    .line 330
    .line 331
    invoke-static {v11}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 336
    .line 337
    invoke-virtual {v5}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v5

    .line 341
    new-instance v7, Ljava/lang/String;

    .line 342
    .line 343
    invoke-virtual {v6}, Lx2/c;->b()[B

    .line 344
    .line 345
    .line 346
    move-result-object v6

    .line 347
    invoke-direct {v7, v6, v5}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 348
    .line 349
    .line 350
    invoke-static {v4, v2, v3, v7}, LB1/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v2

    .line 354
    invoke-direct {v0, v2}, Lorg/apache/tika/exception/TikaException;-><init>(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    throw v0

    .line 358
    :goto_b
    if-eqz v17, :cond_11

    .line 359
    .line 360
    :try_start_5
    invoke-virtual {v5}, Ljava/lang/Process;->waitFor()I
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_2

    .line 361
    .line 362
    .line 363
    goto :goto_c

    .line 364
    :cond_11
    :try_start_6
    invoke-virtual {v8}, Ljava/io/File;->delete()Z
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    .line 365
    .line 366
    .line 367
    :catch_2
    :goto_c
    if-nez v16, :cond_12

    .line 368
    .line 369
    invoke-static/range {v19 .. v19}, Ls2/c;->a(Ljava/io/Closeable;)V

    .line 370
    .line 371
    .line 372
    :cond_12
    invoke-static {v2}, Ls2/c;->a(Ljava/io/Closeable;)V

    .line 373
    .line 374
    .line 375
    invoke-static {v6}, Ls2/c;->a(Ljava/io/Closeable;)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v5}, Ljava/lang/Process;->exitValue()I

    .line 379
    .line 380
    .line 381
    move-result v2

    .line 382
    if-eqz v2, :cond_13

    .line 383
    .line 384
    new-instance v0, Lorg/apache/tika/exception/TikaException;

    .line 385
    .line 386
    invoke-static {v11}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 391
    .line 392
    invoke-virtual {v5}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v5

    .line 396
    new-instance v7, Ljava/lang/String;

    .line 397
    .line 398
    invoke-virtual {v6}, Lx2/c;->b()[B

    .line 399
    .line 400
    .line 401
    move-result-object v6

    .line 402
    invoke-direct {v7, v6, v5}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 403
    .line 404
    .line 405
    invoke-static {v4, v2, v3, v7}, LB1/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v2

    .line 409
    invoke-direct {v0, v2}, Lorg/apache/tika/exception/TikaException;-><init>(Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    throw v0

    .line 413
    :cond_13
    throw v0
.end method

.method public getCommand()[Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/embedder/ExternalEmbedder;->command:[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getCommandAppendOperator()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/embedder/ExternalEmbedder;->commandAppendOperator:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getCommandAssignmentDelimeter()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/embedder/ExternalEmbedder;->commandAssignmentDelimeter:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getCommandAssignmentOperator()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/embedder/ExternalEmbedder;->commandAssignmentOperator:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getCommandMetadataSegments(Lorg/apache/tika/metadata/Metadata;)Ljava/util/List;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/tika/metadata/Metadata;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    new-instance v2, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    if-eqz v1, :cond_7

    .line 11
    .line 12
    invoke-virtual {v1}, Lorg/apache/tika/metadata/Metadata;->names()[Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    if-nez v3, :cond_0

    .line 17
    .line 18
    goto/16 :goto_5

    .line 19
    .line 20
    :cond_0
    invoke-virtual {v1}, Lorg/apache/tika/metadata/Metadata;->names()[Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    array-length v4, v3

    .line 25
    const/4 v6, 0x0

    .line 26
    :goto_0
    if-ge v6, v4, :cond_7

    .line 27
    .line 28
    aget-object v7, v3, v6

    .line 29
    .line 30
    invoke-virtual {v0}, Lorg/apache/tika/embedder/ExternalEmbedder;->getMetadataCommandArguments()Ljava/util/Map;

    .line 31
    .line 32
    .line 33
    move-result-object v8

    .line 34
    invoke-interface {v8}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 35
    .line 36
    .line 37
    move-result-object v8

    .line 38
    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v9

    .line 46
    if-eqz v9, :cond_6

    .line 47
    .line 48
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v9

    .line 52
    check-cast v9, Lorg/apache/tika/metadata/Property;

    .line 53
    .line 54
    invoke-virtual {v9}, Lorg/apache/tika/metadata/Property;->getName()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v10

    .line 58
    invoke-virtual {v7, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v10

    .line 62
    if-eqz v10, :cond_5

    .line 63
    .line 64
    invoke-virtual {v0}, Lorg/apache/tika/embedder/ExternalEmbedder;->getMetadataCommandArguments()Ljava/util/Map;

    .line 65
    .line 66
    .line 67
    move-result-object v10

    .line 68
    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v9

    .line 72
    check-cast v9, [Ljava/lang/String;

    .line 73
    .line 74
    if-eqz v9, :cond_5

    .line 75
    .line 76
    array-length v10, v9

    .line 77
    const/4 v11, 0x0

    .line 78
    :goto_2
    if-ge v11, v10, :cond_5

    .line 79
    .line 80
    aget-object v12, v9, v11

    .line 81
    .line 82
    invoke-virtual {v1, v7}, Lorg/apache/tika/metadata/Metadata;->isMultiValued(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result v13

    .line 86
    const-string v14, "\'"

    .line 87
    .line 88
    if-eqz v13, :cond_3

    .line 89
    .line 90
    invoke-virtual {v1, v7}, Lorg/apache/tika/metadata/Metadata;->getValues(Ljava/lang/String;)[Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v13

    .line 94
    array-length v15, v13

    .line 95
    const/4 v5, 0x0

    .line 96
    :goto_3
    move-object/from16 v16, v3

    .line 97
    .line 98
    if-ge v5, v15, :cond_2

    .line 99
    .line 100
    aget-object v3, v13, v5

    .line 101
    .line 102
    move/from16 v17, v4

    .line 103
    .line 104
    iget-boolean v4, v0, Lorg/apache/tika/embedder/ExternalEmbedder;->quoteAssignmentValues:Z

    .line 105
    .line 106
    if-eqz v4, :cond_1

    .line 107
    .line 108
    invoke-static {v14, v3, v14}, Lt/a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    :cond_1
    iget-object v4, v0, Lorg/apache/tika/embedder/ExternalEmbedder;->commandAppendOperator:Ljava/lang/String;

    .line 113
    .line 114
    move/from16 v18, v5

    .line 115
    .line 116
    new-instance v5, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    add-int/lit8 v5, v18, 0x1

    .line 138
    .line 139
    move-object/from16 v3, v16

    .line 140
    .line 141
    move/from16 v4, v17

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_2
    move/from16 v17, v4

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_3
    move-object/from16 v16, v3

    .line 148
    .line 149
    move/from16 v17, v4

    .line 150
    .line 151
    invoke-virtual {v1, v7}, Lorg/apache/tika/metadata/Metadata;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    iget-boolean v4, v0, Lorg/apache/tika/embedder/ExternalEmbedder;->quoteAssignmentValues:Z

    .line 156
    .line 157
    if-eqz v4, :cond_4

    .line 158
    .line 159
    invoke-static {v14, v3, v14}, Lt/a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    :cond_4
    iget-object v4, v0, Lorg/apache/tika/embedder/ExternalEmbedder;->commandAssignmentOperator:Ljava/lang/String;

    .line 164
    .line 165
    new-instance v5, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    :goto_4
    add-int/lit8 v11, v11, 0x1

    .line 187
    .line 188
    move-object/from16 v3, v16

    .line 189
    .line 190
    move/from16 v4, v17

    .line 191
    .line 192
    goto :goto_2

    .line 193
    :cond_5
    move-object/from16 v16, v3

    .line 194
    .line 195
    move/from16 v17, v4

    .line 196
    .line 197
    move-object/from16 v3, v16

    .line 198
    .line 199
    move/from16 v4, v17

    .line 200
    .line 201
    goto/16 :goto_1

    .line 202
    .line 203
    :cond_6
    move-object/from16 v16, v3

    .line 204
    .line 205
    move/from16 v17, v4

    .line 206
    .line 207
    add-int/lit8 v6, v6, 0x1

    .line 208
    .line 209
    goto/16 :goto_0

    .line 210
    .line 211
    :cond_7
    :goto_5
    return-object v2
.end method

.method public getMetadataCommandArguments()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lorg/apache/tika/metadata/Property;",
            "[",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/apache/tika/embedder/ExternalEmbedder;->metadataCommandArguments:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSupportedEmbedTypes()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lorg/apache/tika/mime/MediaType;",
            ">;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lorg/apache/tika/embedder/ExternalEmbedder;->supportedEmbedTypes:Ljava/util/Set;

    return-object v0
.end method

.method public getSupportedEmbedTypes(Lorg/apache/tika/parser/ParseContext;)Ljava/util/Set;
    .locals 0
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
    invoke-virtual {p0}, Lorg/apache/tika/embedder/ExternalEmbedder;->getSupportedEmbedTypes()Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public isQuoteAssignmentValues()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/tika/embedder/ExternalEmbedder;->quoteAssignmentValues:Z

    .line 2
    .line 3
    return v0
.end method

.method public varargs setCommand([Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/tika/embedder/ExternalEmbedder;->command:[Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setCommandAppendOperator(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/tika/embedder/ExternalEmbedder;->commandAppendOperator:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setCommandAssignmentDelimeter(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/tika/embedder/ExternalEmbedder;->commandAssignmentDelimeter:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setCommandAssignmentOperator(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/tika/embedder/ExternalEmbedder;->commandAssignmentOperator:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setMetadataCommandArguments(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lorg/apache/tika/metadata/Property;",
            "[",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lorg/apache/tika/embedder/ExternalEmbedder;->metadataCommandArguments:Ljava/util/Map;

    .line 2
    .line 3
    return-void
.end method

.method public setQuoteAssignmentValues(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/apache/tika/embedder/ExternalEmbedder;->quoteAssignmentValues:Z

    .line 2
    .line 3
    return-void
.end method

.method public setSupportedEmbedTypes(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lorg/apache/tika/mime/MediaType;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lorg/apache/tika/embedder/ExternalEmbedder;->supportedEmbedTypes:Ljava/util/Set;

    .line 11
    .line 12
    return-void
.end method

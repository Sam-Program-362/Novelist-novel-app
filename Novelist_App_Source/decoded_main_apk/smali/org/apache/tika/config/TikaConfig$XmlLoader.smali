.class abstract Lorg/apache/tika/config/TikaConfig$XmlLoader;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/tika/config/TikaConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "XmlLoader"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<CT:",
        "Ljava/lang/Object;",
        "T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field protected static final PARAMS_TAG_NAME:Ljava/lang/String; = "params"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/apache/tika/config/TikaConfig$XmlLoader;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract createComposite(Ljava/lang/Class;Ljava/util/List;Ljava/util/Set;Ljava/util/Map;Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+TT;>;",
            "Ljava/util/List<",
            "TT;>;",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+TT;>;>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lorg/apache/tika/config/Param;",
            ">;",
            "Lorg/apache/tika/mime/MimeTypes;",
            "Lorg/apache/tika/config/ServiceLoader;",
            ")TT;"
        }
    .end annotation
.end method

.method public abstract createComposite(Ljava/util/List;Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TT;>;",
            "Lorg/apache/tika/mime/MimeTypes;",
            "Lorg/apache/tika/config/ServiceLoader;",
            ")TCT;"
        }
    .end annotation
.end method

.method public abstract createDefault(Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/tika/mime/MimeTypes;",
            "Lorg/apache/tika/config/ServiceLoader;",
            ")TCT;"
        }
    .end annotation
.end method

.method public abstract decorate(Ljava/lang/Object;Lorg/w3c/dom/Element;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lorg/w3c/dom/Element;",
            ")TT;"
        }
    .end annotation
.end method

.method public abstract getLoaderClass()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+TT;>;"
        }
    .end annotation
.end method

.method public abstract getLoaderTagName()Ljava/lang/String;
.end method

.method public getParams(Lorg/w3c/dom/Element;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/w3c/dom/Element;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lorg/apache/tika/config/Param;",
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
    invoke-interface {p1}, Lorg/w3c/dom/Node;->getFirstChild()Lorg/w3c/dom/Node;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :goto_0
    if-eqz p1, :cond_2

    .line 11
    .line 12
    const-string v1, "params"

    .line 13
    .line 14
    invoke-interface {p1}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-interface {p1}, Lorg/w3c/dom/Node;->hasChildNodes()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    invoke-interface {p1}, Lorg/w3c/dom/Node;->getChildNodes()Lorg/w3c/dom/NodeList;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const/4 v1, 0x0

    .line 35
    :goto_1
    invoke-interface {p1}, Lorg/w3c/dom/NodeList;->getLength()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-ge v1, v2, :cond_2

    .line 40
    .line 41
    invoke-interface {p1, v1}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-interface {v2}, Lorg/w3c/dom/Node;->getNodeType()S

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    const/4 v4, 0x1

    .line 50
    if-ne v3, v4, :cond_0

    .line 51
    .line 52
    invoke-static {v2}, Lorg/apache/tika/config/Param;->load(Lorg/w3c/dom/Node;)Lorg/apache/tika/config/Param;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v2}, Lorg/apache/tika/config/Param;->getName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    invoke-interface {p1}, Lorg/w3c/dom/Node;->getNextSibling()Lorg/w3c/dom/Node;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    goto :goto_0

    .line 71
    :cond_2
    return-object v0
.end method

.method public abstract getParentTagName()Ljava/lang/String;
.end method

.method public abstract isComposite(Ljava/lang/Class;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+TT;>;)Z"
        }
    .end annotation
.end method

.method public abstract isComposite(Ljava/lang/Object;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation
.end method

.method public loadOne(Lorg/w3c/dom/Element;Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/w3c/dom/Element;",
            "Lorg/apache/tika/mime/MimeTypes;",
            "Lorg/apache/tika/config/ServiceLoader;",
            ")TT;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v6, p2

    .line 6
    .line 7
    move-object/from16 v7, p3

    .line 8
    .line 9
    const-string v8, " class: "

    .line 10
    .line 11
    const-string v2, "class"

    .line 12
    .line 13
    invoke-interface {v0, v2}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v9

    .line 17
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const/4 v4, 0x0

    .line 22
    move v5, v4

    .line 23
    :goto_0
    if-ge v5, v3, :cond_b

    .line 24
    .line 25
    invoke-virtual {v9, v5}, Ljava/lang/String;->codePointAt(I)I

    .line 26
    .line 27
    .line 28
    move-result v10

    .line 29
    invoke-static {v10}, Ljava/lang/Character;->isWhitespace(I)Z

    .line 30
    .line 31
    .line 32
    move-result v11

    .line 33
    if-nez v11, :cond_a

    .line 34
    .line 35
    const-string v3, "initializableProblemHandler"

    .line 36
    .line 37
    invoke-interface {v0, v3}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    move v10, v4

    .line 46
    :goto_1
    if-ge v10, v5, :cond_1

    .line 47
    .line 48
    invoke-virtual {v3, v10}, Ljava/lang/String;->codePointAt(I)I

    .line 49
    .line 50
    .line 51
    move-result v11

    .line 52
    invoke-static {v11}, Ljava/lang/Character;->isWhitespace(I)Z

    .line 53
    .line 54
    .line 55
    move-result v12

    .line 56
    if-nez v12, :cond_0

    .line 57
    .line 58
    invoke-static {v3}, Lorg/apache/tika/config/TikaConfig;->f(Ljava/lang/String;)Lorg/apache/tika/config/InitializableProblemHandler;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    :goto_2
    move-object v10, v3

    .line 63
    goto :goto_3

    .line 64
    :cond_0
    invoke-static {v11}, Ljava/lang/Character;->charCount(I)I

    .line 65
    .line 66
    .line 67
    move-result v11

    .line 68
    add-int/2addr v10, v11

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    invoke-virtual {v7}, Lorg/apache/tika/config/ServiceLoader;->getInitializableProblemHandler()Lorg/apache/tika/config/InitializableProblemHandler;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    goto :goto_2

    .line 75
    :goto_3
    :try_start_0
    invoke-virtual {v1}, Lorg/apache/tika/config/TikaConfig$XmlLoader;->getLoaderClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v7, v3, v9}, Lorg/apache/tika/config/ServiceLoader;->getServiceClass(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-virtual {v1, v3, v9, v6}, Lorg/apache/tika/config/TikaConfig$XmlLoader;->preLoadOne(Ljava/lang/Class;Ljava/lang/String;Lorg/apache/tika/mime/MimeTypes;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v5
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    if-eqz v5, :cond_2

    .line 88
    .line 89
    return-object v5

    .line 90
    :cond_2
    :try_start_1
    invoke-virtual/range {p0 .. p1}, Lorg/apache/tika/config/TikaConfig$XmlLoader;->getParams(Lorg/w3c/dom/Element;)Ljava/util/Map;

    .line 91
    .line 92
    .line 93
    move-result-object v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_6

    .line 94
    :try_start_2
    invoke-virtual {v1, v3}, Lorg/apache/tika/config/TikaConfig$XmlLoader;->isComposite(Ljava/lang/Class;)Z

    .line 95
    .line 96
    .line 97
    move-result v11

    .line 98
    if-eqz v11, :cond_6

    .line 99
    .line 100
    move-object v11, v3

    .line 101
    new-instance v3, Ljava/util/ArrayList;

    .line 102
    .line 103
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1}, Lorg/apache/tika/config/TikaConfig$XmlLoader;->getLoaderTagName()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v12

    .line 110
    invoke-interface {v0, v12}, Lorg/w3c/dom/Element;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    .line 111
    .line 112
    .line 113
    move-result-object v12

    .line 114
    invoke-interface {v12}, Lorg/w3c/dom/NodeList;->getLength()I

    .line 115
    .line 116
    .line 117
    move-result v13

    .line 118
    if-lez v13, :cond_4

    .line 119
    .line 120
    move v13, v4

    .line 121
    :goto_4
    invoke-interface {v12}, Lorg/w3c/dom/NodeList;->getLength()I

    .line 122
    .line 123
    .line 124
    move-result v14

    .line 125
    if-ge v13, v14, :cond_4

    .line 126
    .line 127
    invoke-interface {v12, v13}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    .line 128
    .line 129
    .line 130
    move-result-object v14

    .line 131
    check-cast v14, Lorg/w3c/dom/Element;

    .line 132
    .line 133
    invoke-virtual {v1, v14, v6, v7}, Lorg/apache/tika/config/TikaConfig$XmlLoader;->loadOne(Lorg/w3c/dom/Element;Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v14

    .line 137
    if-eqz v14, :cond_3

    .line 138
    .line 139
    invoke-virtual {v3, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    goto :goto_5

    .line 143
    :catch_0
    move-exception v0

    .line 144
    goto/16 :goto_8

    .line 145
    .line 146
    :catch_1
    move-exception v0

    .line 147
    goto/16 :goto_9

    .line 148
    .line 149
    :catch_2
    move-exception v0

    .line 150
    goto/16 :goto_a

    .line 151
    .line 152
    :catch_3
    move-exception v0

    .line 153
    goto/16 :goto_b

    .line 154
    .line 155
    :catch_4
    move-exception v0

    .line 156
    goto/16 :goto_c

    .line 157
    .line 158
    :cond_3
    :goto_5
    add-int/lit8 v13, v13, 0x1

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_4
    move v12, v4

    .line 162
    new-instance v4, Ljava/util/HashSet;

    .line 163
    .line 164
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1}, Lorg/apache/tika/config/TikaConfig$XmlLoader;->getLoaderTagName()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v13

    .line 171
    new-instance v14, Ljava/lang/StringBuilder;

    .line 172
    .line 173
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    const-string v13, "-exclude"

    .line 180
    .line 181
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v13

    .line 188
    invoke-interface {v0, v13}, Lorg/w3c/dom/Element;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    .line 189
    .line 190
    .line 191
    move-result-object v13

    .line 192
    invoke-interface {v13}, Lorg/w3c/dom/NodeList;->getLength()I

    .line 193
    .line 194
    .line 195
    move-result v14

    .line 196
    if-lez v14, :cond_5

    .line 197
    .line 198
    :goto_6
    invoke-interface {v13}, Lorg/w3c/dom/NodeList;->getLength()I

    .line 199
    .line 200
    .line 201
    move-result v14

    .line 202
    if-ge v12, v14, :cond_5

    .line 203
    .line 204
    invoke-interface {v13, v12}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    .line 205
    .line 206
    .line 207
    move-result-object v14

    .line 208
    check-cast v14, Lorg/w3c/dom/Element;

    .line 209
    .line 210
    invoke-interface {v14, v2}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v14
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_0

    .line 214
    :try_start_3
    invoke-virtual {v1}, Lorg/apache/tika/config/TikaConfig$XmlLoader;->getLoaderClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    move-result-object v15

    .line 218
    invoke-virtual {v7, v15, v14}, Lorg/apache/tika/config/ServiceLoader;->getServiceClass(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    move-result-object v15

    .line 222
    invoke-virtual {v4, v15}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_5
    .catch Ljava/lang/IllegalAccessException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_3 .. :try_end_3} :catch_0

    .line 223
    .line 224
    .line 225
    add-int/lit8 v12, v12, 0x1

    .line 226
    .line 227
    goto :goto_6

    .line 228
    :catch_5
    :try_start_4
    new-instance v0, Lorg/apache/tika/exception/TikaConfigException;

    .line 229
    .line 230
    new-instance v2, Ljava/lang/StringBuilder;

    .line 231
    .line 232
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 233
    .line 234
    .line 235
    const-string v3, "Class not found in -exclude list: "

    .line 236
    .line 237
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    invoke-direct {v0, v2}, Lorg/apache/tika/exception/TikaConfigException;-><init>(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    throw v0

    .line 251
    :cond_5
    move-object v2, v11

    .line 252
    invoke-virtual/range {v1 .. v7}, Lorg/apache/tika/config/TikaConfig$XmlLoader;->createComposite(Ljava/lang/Class;Ljava/util/List;Ljava/util/Set;Ljava/util/Map;Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v3

    .line 256
    if-nez v3, :cond_7

    .line 257
    .line 258
    invoke-virtual {v1, v2}, Lorg/apache/tika/config/TikaConfig$XmlLoader;->newInstance(Ljava/lang/Class;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v3

    .line 262
    goto :goto_7

    .line 263
    :cond_6
    move-object v2, v3

    .line 264
    invoke-virtual {v1, v2}, Lorg/apache/tika/config/TikaConfig$XmlLoader;->newInstance(Ljava/lang/Class;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    :cond_7
    :goto_7
    invoke-static {v3, v5}, Lorg/apache/tika/utils/AnnotationUtils;->assignFieldParams(Ljava/lang/Object;Ljava/util/Map;)V

    .line 269
    .line 270
    .line 271
    instance-of v2, v3, Lorg/apache/tika/config/Initializable;

    .line 272
    .line 273
    if-eqz v2, :cond_8

    .line 274
    .line 275
    move-object v2, v3

    .line 276
    check-cast v2, Lorg/apache/tika/config/Initializable;

    .line 277
    .line 278
    invoke-interface {v2, v5}, Lorg/apache/tika/config/Initializable;->initialize(Ljava/util/Map;)V

    .line 279
    .line 280
    .line 281
    move-object v2, v3

    .line 282
    check-cast v2, Lorg/apache/tika/config/Initializable;

    .line 283
    .line 284
    invoke-interface {v2, v10}, Lorg/apache/tika/config/Initializable;->checkInitialization(Lorg/apache/tika/config/InitializableProblemHandler;)V

    .line 285
    .line 286
    .line 287
    :cond_8
    invoke-virtual {v1, v3, v0}, Lorg/apache/tika/config/TikaConfig$XmlLoader;->decorate(Ljava/lang/Object;Lorg/w3c/dom/Element;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    return-object v0

    .line 292
    :catch_6
    move-exception v0

    .line 293
    new-instance v2, Lorg/apache/tika/exception/TikaConfigException;

    .line 294
    .line 295
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v3

    .line 299
    invoke-direct {v2, v3, v0}, Lorg/apache/tika/exception/TikaConfigException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 300
    .line 301
    .line 302
    throw v2
    :try_end_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_4} :catch_0

    .line 303
    :goto_8
    new-instance v2, Lorg/apache/tika/exception/TikaException;

    .line 304
    .line 305
    invoke-virtual {v1}, Lorg/apache/tika/config/TikaConfig$XmlLoader;->getLoaderTagName()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v3

    .line 309
    const-string v4, "Unable to find the right constructor for "

    .line 310
    .line 311
    invoke-static {v4, v3, v8, v9}, LB1/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v3

    .line 315
    invoke-direct {v2, v3, v0}, Lorg/apache/tika/exception/TikaException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 316
    .line 317
    .line 318
    throw v2

    .line 319
    :goto_9
    new-instance v2, Lorg/apache/tika/exception/TikaException;

    .line 320
    .line 321
    invoke-virtual {v1}, Lorg/apache/tika/config/TikaConfig$XmlLoader;->getLoaderTagName()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v3

    .line 325
    const-string v4, "Unable to instantiate a "

    .line 326
    .line 327
    invoke-static {v4, v3, v8, v9}, LB1/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v3

    .line 331
    invoke-direct {v2, v3, v0}, Lorg/apache/tika/exception/TikaException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 332
    .line 333
    .line 334
    throw v2

    .line 335
    :goto_a
    new-instance v2, Lorg/apache/tika/exception/TikaException;

    .line 336
    .line 337
    invoke-virtual {v1}, Lorg/apache/tika/config/TikaConfig$XmlLoader;->getLoaderTagName()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v3

    .line 341
    const-string v4, "Unable to create a "

    .line 342
    .line 343
    invoke-static {v4, v3, v8, v9}, LB1/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v3

    .line 347
    invoke-direct {v2, v3, v0}, Lorg/apache/tika/exception/TikaException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 348
    .line 349
    .line 350
    throw v2

    .line 351
    :goto_b
    new-instance v2, Lorg/apache/tika/exception/TikaException;

    .line 352
    .line 353
    invoke-virtual {v1}, Lorg/apache/tika/config/TikaConfig$XmlLoader;->getLoaderTagName()Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v3

    .line 357
    const-string v4, "Unable to access a "

    .line 358
    .line 359
    invoke-static {v4, v3, v8, v9}, LB1/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v3

    .line 363
    invoke-direct {v2, v3, v0}, Lorg/apache/tika/exception/TikaException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 364
    .line 365
    .line 366
    throw v2

    .line 367
    :goto_c
    invoke-virtual/range {p3 .. p3}, Lorg/apache/tika/config/ServiceLoader;->getLoadErrorHandler()Lorg/apache/tika/config/LoadErrorHandler;

    .line 368
    .line 369
    .line 370
    move-result-object v2

    .line 371
    sget-object v3, Lorg/apache/tika/config/LoadErrorHandler;->THROW:Lorg/apache/tika/config/LoadErrorHandler;

    .line 372
    .line 373
    if-eq v2, v3, :cond_9

    .line 374
    .line 375
    invoke-virtual/range {p3 .. p3}, Lorg/apache/tika/config/ServiceLoader;->getLoadErrorHandler()Lorg/apache/tika/config/LoadErrorHandler;

    .line 376
    .line 377
    .line 378
    move-result-object v2

    .line 379
    invoke-interface {v2, v9, v0}, Lorg/apache/tika/config/LoadErrorHandler;->handleLoadError(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 380
    .line 381
    .line 382
    const/4 v0, 0x0

    .line 383
    return-object v0

    .line 384
    :cond_9
    new-instance v2, Lorg/apache/tika/exception/TikaConfigException;

    .line 385
    .line 386
    invoke-virtual {v1}, Lorg/apache/tika/config/TikaConfig$XmlLoader;->getLoaderTagName()Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v3

    .line 390
    const-string v4, "Unable to find a "

    .line 391
    .line 392
    invoke-static {v4, v3, v8, v9}, LB1/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v3

    .line 396
    invoke-direct {v2, v3, v0}, Lorg/apache/tika/exception/TikaConfigException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 397
    .line 398
    .line 399
    throw v2

    .line 400
    :cond_a
    move v12, v4

    .line 401
    invoke-static {v10}, Ljava/lang/Character;->charCount(I)I

    .line 402
    .line 403
    .line 404
    move-result v4

    .line 405
    add-int/2addr v5, v4

    .line 406
    move-object/from16 v6, p2

    .line 407
    .line 408
    move-object/from16 v7, p3

    .line 409
    .line 410
    move v4, v12

    .line 411
    goto/16 :goto_0

    .line 412
    .line 413
    :cond_b
    new-instance v2, Lorg/apache/tika/exception/TikaConfigException;

    .line 414
    .line 415
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    const-string v3, "class attribute must not be empty: "

    .line 420
    .line 421
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    invoke-direct {v2, v0}, Lorg/apache/tika/exception/TikaConfigException;-><init>(Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    throw v2
.end method

.method public loadOverall(Lorg/w3c/dom/Element;Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/w3c/dom/Element;",
            "Lorg/apache/tika/mime/MimeTypes;",
            "Lorg/apache/tika/config/ServiceLoader;",
            ")TCT;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lorg/apache/tika/config/TikaConfig$XmlLoader;->getParentTagName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {p0}, Lorg/apache/tika/config/TikaConfig$XmlLoader;->getLoaderTagName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-static {p1, v1, v2}, Lorg/apache/tika/config/TikaConfig;->h(Lorg/w3c/dom/Element;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Lorg/w3c/dom/Element;

    .line 33
    .line 34
    invoke-virtual {p0, v1, p2, p3}, Lorg/apache/tika/config/TikaConfig$XmlLoader;->loadOne(Lorg/w3c/dom/Element;Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    invoke-virtual {p0, p2, p3}, Lorg/apache/tika/config/TikaConfig$XmlLoader;->createDefault(Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1

    .line 55
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    const/4 v1, 0x1

    .line 60
    if-ne p1, v1, :cond_3

    .line 61
    .line 62
    const/4 p1, 0x0

    .line 63
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p0, p1}, Lorg/apache/tika/config/TikaConfig$XmlLoader;->isComposite(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_4

    .line 72
    .line 73
    return-object p1

    .line 74
    :cond_3
    invoke-virtual {p0}, Lorg/apache/tika/config/TikaConfig$XmlLoader;->supportsComposite()Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-eqz p1, :cond_5

    .line 79
    .line 80
    :cond_4
    invoke-virtual {p0, v0, p2, p3}, Lorg/apache/tika/config/TikaConfig$XmlLoader;->createComposite(Ljava/util/List;Lorg/apache/tika/mime/MimeTypes;Lorg/apache/tika/config/ServiceLoader;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    return-object p1

    .line 85
    :cond_5
    new-instance p1, Lorg/apache/tika/exception/TikaConfigException;

    .line 86
    .line 87
    invoke-virtual {p0}, Lorg/apache/tika/config/TikaConfig$XmlLoader;->getParentTagName()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    const-string p3, "Composite not supported for "

    .line 92
    .line 93
    const-string v0, ". Must specify only one child!"

    .line 94
    .line 95
    invoke-static {p3, p2, v0}, Lt/a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    invoke-direct {p1, p2}, Lorg/apache/tika/exception/TikaConfigException;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw p1
.end method

.method public newInstance(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+TT;>;)TT;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public abstract preLoadOne(Ljava/lang/Class;Ljava/lang/String;Lorg/apache/tika/mime/MimeTypes;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+TT;>;",
            "Ljava/lang/String;",
            "Lorg/apache/tika/mime/MimeTypes;",
            ")TT;"
        }
    .end annotation
.end method

.method public abstract supportsComposite()Z
.end method

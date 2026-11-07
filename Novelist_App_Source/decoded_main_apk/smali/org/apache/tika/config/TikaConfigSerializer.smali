.class public Lorg/apache/tika/config/TikaConfigSerializer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/tika/config/TikaConfigSerializer$Mode;,
        Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;,
        Lorg/apache/tika/config/TikaConfigSerializer$MethodTuples;
    }
.end annotation


# static fields
.field private static final LOG:LF2/b;

.field private static PRIMITIVES:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, Lorg/apache/tika/config/TikaConfigSerializer;

    .line 2
    .line 3
    invoke-static {v0}, LF2/d;->b(Ljava/lang/Class;)LF2/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lorg/apache/tika/config/TikaConfigSerializer;->LOG:LF2/b;

    .line 8
    .line 9
    new-instance v0, Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lorg/apache/tika/config/TikaConfigSerializer;->PRIMITIVES:Ljava/util/Map;

    .line 15
    .line 16
    const-class v1, Ljava/lang/Integer;

    .line 17
    .line 18
    const-string v2, "int"

    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    sget-object v0, Lorg/apache/tika/config/TikaConfigSerializer;->PRIMITIVES:Ljava/util/Map;

    .line 24
    .line 25
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 26
    .line 27
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    sget-object v0, Lorg/apache/tika/config/TikaConfigSerializer;->PRIMITIVES:Ljava/util/Map;

    .line 31
    .line 32
    const-class v1, Ljava/lang/String;

    .line 33
    .line 34
    const-string v2, "string"

    .line 35
    .line 36
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    sget-object v0, Lorg/apache/tika/config/TikaConfigSerializer;->PRIMITIVES:Ljava/util/Map;

    .line 40
    .line 41
    const-class v1, Ljava/lang/Boolean;

    .line 42
    .line 43
    const-string v2, "bool"

    .line 44
    .line 45
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    sget-object v0, Lorg/apache/tika/config/TikaConfigSerializer;->PRIMITIVES:Ljava/util/Map;

    .line 49
    .line 50
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 51
    .line 52
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    sget-object v0, Lorg/apache/tika/config/TikaConfigSerializer;->PRIMITIVES:Ljava/util/Map;

    .line 56
    .line 57
    const-class v1, Ljava/lang/Float;

    .line 58
    .line 59
    const-string v2, "float"

    .line 60
    .line 61
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    sget-object v0, Lorg/apache/tika/config/TikaConfigSerializer;->PRIMITIVES:Ljava/util/Map;

    .line 65
    .line 66
    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 67
    .line 68
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    sget-object v0, Lorg/apache/tika/config/TikaConfigSerializer;->PRIMITIVES:Ljava/util/Map;

    .line 72
    .line 73
    const-class v1, Ljava/lang/Double;

    .line 74
    .line 75
    const-string v2, "double"

    .line 76
    .line 77
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    sget-object v0, Lorg/apache/tika/config/TikaConfigSerializer;->PRIMITIVES:Ljava/util/Map;

    .line 81
    .line 82
    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 83
    .line 84
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    sget-object v0, Lorg/apache/tika/config/TikaConfigSerializer;->PRIMITIVES:Ljava/util/Map;

    .line 88
    .line 89
    const-class v1, Ljava/lang/Long;

    .line 90
    .line 91
    const-string v2, "long"

    .line 92
    .line 93
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    sget-object v0, Lorg/apache/tika/config/TikaConfigSerializer;->PRIMITIVES:Ljava/util/Map;

    .line 97
    .line 98
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 99
    .line 100
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    sget-object v0, Lorg/apache/tika/config/TikaConfigSerializer;->PRIMITIVES:Ljava/util/Map;

    .line 104
    .line 105
    const-class v1, Ljava/util/Map;

    .line 106
    .line 107
    const-string v2, "map"

    .line 108
    .line 109
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    sget-object v0, Lorg/apache/tika/config/TikaConfigSerializer;->PRIMITIVES:Ljava/util/Map;

    .line 113
    .line 114
    const-class v1, Ljava/util/List;

    .line 115
    .line 116
    const-string v2, "list"

    .line 117
    .line 118
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
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

.method private static addDetectors(Lorg/apache/tika/config/TikaConfigSerializer$Mode;Lorg/w3c/dom/Element;Lorg/w3c/dom/Document;Lorg/apache/tika/config/TikaConfig;)V
    .locals 5

    .line 1
    invoke-virtual {p3}, Lorg/apache/tika/config/TikaConfig;->getDetector()Lorg/apache/tika/detect/Detector;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    sget-object v0, Lorg/apache/tika/config/TikaConfigSerializer$Mode;->MINIMAL:Lorg/apache/tika/config/TikaConfigSerializer$Mode;

    .line 6
    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    .line 9
    instance-of v0, p3, Lorg/apache/tika/detect/DefaultDetector;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string p0, "for example: <detectors><detector class=\"org.apache.tika.detector.MimeTypes\"></detectors>"

    .line 14
    .line 15
    invoke-interface {p2, p0}, Lorg/w3c/dom/Document;->createComment(Ljava/lang/String;)Lorg/w3c/dom/Comment;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-interface {p1, p0}, Lorg/w3c/dom/Node;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const-string v0, "detectors"

    .line 24
    .line 25
    invoke-interface {p2, v0}, Lorg/w3c/dom/Document;->createElement(Ljava/lang/String;)Lorg/w3c/dom/Element;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sget-object v1, Lorg/apache/tika/config/TikaConfigSerializer$Mode;->CURRENT:Lorg/apache/tika/config/TikaConfigSerializer$Mode;

    .line 30
    .line 31
    const-string v2, "class"

    .line 32
    .line 33
    const-string v3, "detector"

    .line 34
    .line 35
    if-ne p0, v1, :cond_1

    .line 36
    .line 37
    instance-of p0, p3, Lorg/apache/tika/detect/DefaultDetector;

    .line 38
    .line 39
    if-nez p0, :cond_2

    .line 40
    .line 41
    :cond_1
    instance-of p0, p3, Lorg/apache/tika/detect/CompositeDetector;

    .line 42
    .line 43
    if-nez p0, :cond_3

    .line 44
    .line 45
    :cond_2
    invoke-interface {p2, v3}, Lorg/w3c/dom/Document;->createElement(Ljava/lang/String;)Lorg/w3c/dom/Element;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-virtual {p2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-interface {p0, v2, p2}, Lorg/w3c/dom/Element;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-interface {v0, p0}, Lorg/w3c/dom/Node;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    check-cast p3, Lorg/apache/tika/detect/CompositeDetector;

    .line 65
    .line 66
    invoke-virtual {p3}, Lorg/apache/tika/detect/CompositeDetector;->getDetectors()Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result p3

    .line 78
    if-eqz p3, :cond_4

    .line 79
    .line 80
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p3

    .line 84
    check-cast p3, Lorg/apache/tika/detect/Detector;

    .line 85
    .line 86
    invoke-interface {p2, v3}, Lorg/w3c/dom/Document;->createElement(Ljava/lang/String;)Lorg/w3c/dom/Element;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-virtual {v4}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    invoke-interface {v1, v2, v4}, Lorg/w3c/dom/Element;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-static {p2, v1, p3}, Lorg/apache/tika/config/TikaConfigSerializer;->serializeParams(Lorg/w3c/dom/Document;Lorg/w3c/dom/Element;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    invoke-interface {v0, v1}, Lorg/w3c/dom/Node;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_4
    :goto_1
    invoke-interface {p1, v0}, Lorg/w3c/dom/Node;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    .line 109
    .line 110
    .line 111
    return-void
.end method

.method private static addEncodingDetectors(Lorg/apache/tika/config/TikaConfigSerializer$Mode;Lorg/w3c/dom/Element;Lorg/w3c/dom/Document;Lorg/apache/tika/config/TikaConfig;)V
    .locals 5

    .line 1
    invoke-virtual {p3}, Lorg/apache/tika/config/TikaConfig;->getEncodingDetector()Lorg/apache/tika/detect/EncodingDetector;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    sget-object v0, Lorg/apache/tika/config/TikaConfigSerializer$Mode;->MINIMAL:Lorg/apache/tika/config/TikaConfigSerializer$Mode;

    .line 6
    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    .line 9
    instance-of v0, p3, Lorg/apache/tika/detect/DefaultEncodingDetector;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string p0, "for example: <encodingDetectors><encodingDetector class=\"org.apache.tika.detect.DefaultEncodingDetector\"></encodingDetectors>"

    .line 14
    .line 15
    invoke-interface {p2, p0}, Lorg/w3c/dom/Document;->createComment(Ljava/lang/String;)Lorg/w3c/dom/Comment;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-interface {p1, p0}, Lorg/w3c/dom/Node;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const-string v0, "encodingDetectors"

    .line 24
    .line 25
    invoke-interface {p2, v0}, Lorg/w3c/dom/Document;->createElement(Ljava/lang/String;)Lorg/w3c/dom/Element;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sget-object v1, Lorg/apache/tika/config/TikaConfigSerializer$Mode;->CURRENT:Lorg/apache/tika/config/TikaConfigSerializer$Mode;

    .line 30
    .line 31
    const-string v2, "class"

    .line 32
    .line 33
    const-string v3, "encodingDetector"

    .line 34
    .line 35
    if-ne p0, v1, :cond_1

    .line 36
    .line 37
    instance-of p0, p3, Lorg/apache/tika/detect/DefaultEncodingDetector;

    .line 38
    .line 39
    if-nez p0, :cond_2

    .line 40
    .line 41
    :cond_1
    instance-of p0, p3, Lorg/apache/tika/detect/CompositeEncodingDetector;

    .line 42
    .line 43
    if-nez p0, :cond_3

    .line 44
    .line 45
    :cond_2
    invoke-interface {p2, v3}, Lorg/w3c/dom/Document;->createElement(Ljava/lang/String;)Lorg/w3c/dom/Element;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-virtual {p2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-interface {p0, v2, p2}, Lorg/w3c/dom/Element;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-interface {v0, p0}, Lorg/w3c/dom/Node;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    check-cast p3, Lorg/apache/tika/detect/CompositeEncodingDetector;

    .line 65
    .line 66
    invoke-virtual {p3}, Lorg/apache/tika/detect/CompositeEncodingDetector;->getDetectors()Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result p3

    .line 78
    if-eqz p3, :cond_4

    .line 79
    .line 80
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p3

    .line 84
    check-cast p3, Lorg/apache/tika/detect/EncodingDetector;

    .line 85
    .line 86
    invoke-interface {p2, v3}, Lorg/w3c/dom/Document;->createElement(Ljava/lang/String;)Lorg/w3c/dom/Element;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-virtual {v4}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    invoke-interface {v1, v2, v4}, Lorg/w3c/dom/Element;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-static {p2, v1, p3}, Lorg/apache/tika/config/TikaConfigSerializer;->serializeParams(Lorg/w3c/dom/Document;Lorg/w3c/dom/Element;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    invoke-interface {v0, v1}, Lorg/w3c/dom/Node;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_4
    :goto_1
    invoke-interface {p1, v0}, Lorg/w3c/dom/Node;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    .line 109
    .line 110
    .line 111
    return-void
.end method

.method private static addExecutorService(Lorg/apache/tika/config/TikaConfigSerializer$Mode;Lorg/w3c/dom/Element;Lorg/w3c/dom/Document;Lorg/apache/tika/config/TikaConfig;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Lorg/apache/tika/config/TikaConfig;->getExecutorService()Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static addList(Lorg/w3c/dom/Element;Lorg/w3c/dom/Document;Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/w3c/dom/Element;",
            "Lorg/w3c/dom/Document;",
            "Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result p3

    .line 9
    if-eqz p3, :cond_0

    .line 10
    .line 11
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    check-cast p3, Ljava/lang/String;

    .line 16
    .line 17
    const-string v0, "string"

    .line 18
    .line 19
    invoke-interface {p1, v0}, Lorg/w3c/dom/Document;->createElement(Ljava/lang/String;)Lorg/w3c/dom/Element;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v0, p3}, Lorg/w3c/dom/Node;->setTextContent(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p0, v0}, Lorg/w3c/dom/Node;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-void
.end method

.method private static addMap(Lorg/w3c/dom/Element;Lorg/w3c/dom/Document;Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/w3c/dom/Element;",
            "Lorg/w3c/dom/Document;",
            "Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance p2, Ljava/util/TreeMap;

    .line 2
    .line 3
    invoke-direct {p2, p3}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result p3

    .line 18
    if-eqz p3, :cond_0

    .line 19
    .line 20
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    check-cast p3, Ljava/util/Map$Entry;

    .line 25
    .line 26
    const-string v0, "string"

    .line 27
    .line 28
    invoke-interface {p1, v0}, Lorg/w3c/dom/Document;->createElement(Ljava/lang/String;)Lorg/w3c/dom/Element;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Ljava/lang/String;

    .line 37
    .line 38
    const-string v2, "key"

    .line 39
    .line 40
    invoke-interface {v0, v2, v1}, Lorg/w3c/dom/Element;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p3

    .line 47
    check-cast p3, Ljava/lang/String;

    .line 48
    .line 49
    const-string v1, "value"

    .line 50
    .line 51
    invoke-interface {v0, v1, p3}, Lorg/w3c/dom/Element;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-interface {p0, v0}, Lorg/w3c/dom/Node;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    return-void
.end method

.method private static addMimeComment(Lorg/apache/tika/config/TikaConfigSerializer$Mode;Lorg/w3c/dom/Element;Lorg/w3c/dom/Document;)V
    .locals 0

    .line 1
    const-string p0, "for example: <mimeTypeRepository resource=\"/org/apache/tika/mime/tika-mimetypes.xml\"/>"

    .line 2
    .line 3
    invoke-interface {p2, p0}, Lorg/w3c/dom/Document;->createComment(Ljava/lang/String;)Lorg/w3c/dom/Comment;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p1, p0}, Lorg/w3c/dom/Node;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private static addParser(Lorg/apache/tika/config/TikaConfigSerializer$Mode;Lorg/w3c/dom/Element;Lorg/w3c/dom/Document;Lorg/apache/tika/parser/Parser;Lorg/apache/tika/parser/ParserDecorator;)Lorg/w3c/dom/Element;
    .locals 4

    .line 16
    new-instance v0, Lorg/apache/tika/parser/ParseContext;

    invoke-direct {v0}, Lorg/apache/tika/parser/ParseContext;-><init>()V

    .line 17
    new-instance v1, Ljava/util/TreeSet;

    invoke-direct {v1}, Ljava/util/TreeSet;-><init>()V

    .line 18
    new-instance v2, Ljava/util/TreeSet;

    invoke-direct {v2}, Ljava/util/TreeSet;-><init>()V

    if-eqz p4, :cond_1

    .line 19
    new-instance p0, Ljava/util/TreeSet;

    invoke-virtual {p4, v0}, Lorg/apache/tika/parser/ParserDecorator;->getSupportedTypes(Lorg/apache/tika/parser/ParseContext;)Ljava/util/Set;

    move-result-object p4

    invoke-direct {p0, p4}, Ljava/util/TreeSet;-><init>(Ljava/util/Collection;)V

    .line 20
    invoke-virtual {v1, p0}, Ljava/util/TreeSet;->addAll(Ljava/util/Collection;)Z

    .line 21
    invoke-interface {p3, v0}, Lorg/apache/tika/parser/Parser;->getSupportedTypes(Lorg/apache/tika/parser/ParseContext;)Ljava/util/Set;

    move-result-object p4

    invoke-interface {p4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/tika/mime/MediaType;

    .line 22
    invoke-virtual {p0, v0}, Ljava/util/TreeSet;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 23
    invoke-virtual {v2, v0}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 24
    :cond_0
    invoke-virtual {v1, v0}, Ljava/util/TreeSet;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 25
    :cond_1
    sget-object p4, Lorg/apache/tika/config/TikaConfigSerializer$Mode;->STATIC_FULL:Lorg/apache/tika/config/TikaConfigSerializer$Mode;

    if-ne p0, p4, :cond_2

    .line 26
    invoke-interface {p3, v0}, Lorg/apache/tika/parser/Parser;->getSupportedTypes(Lorg/apache/tika/parser/ParseContext;)Ljava/util/Set;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/util/TreeSet;->addAll(Ljava/util/Collection;)Z

    .line 27
    :cond_2
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p0

    .line 28
    const-string p4, "parser"

    invoke-interface {p2, p4}, Lorg/w3c/dom/Document;->createElement(Ljava/lang/String;)Lorg/w3c/dom/Element;

    move-result-object p4

    .line 29
    const-string v0, "class"

    invoke-interface {p4, v0, p0}, Lorg/w3c/dom/Element;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    invoke-interface {p1, p4}, Lorg/w3c/dom/Node;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    .line 31
    invoke-static {p2, p4, p3}, Lorg/apache/tika/config/TikaConfigSerializer;->serializeParams(Lorg/w3c/dom/Document;Lorg/w3c/dom/Element;Ljava/lang/Object;)V

    .line 32
    invoke-virtual {v1}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/apache/tika/mime/MediaType;

    .line 33
    const-string p3, "mime"

    invoke-interface {p2, p3}, Lorg/w3c/dom/Document;->createElement(Ljava/lang/String;)Lorg/w3c/dom/Element;

    move-result-object p3

    .line 34
    invoke-virtual {p1}, Lorg/apache/tika/mime/MediaType;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lorg/w3c/dom/Document;->createTextNode(Ljava/lang/String;)Lorg/w3c/dom/Text;

    move-result-object p1

    invoke-interface {p3, p1}, Lorg/w3c/dom/Node;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    .line 35
    invoke-interface {p4, p3}, Lorg/w3c/dom/Node;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    goto :goto_1

    .line 36
    :cond_3
    invoke-virtual {v2}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/apache/tika/mime/MediaType;

    .line 37
    const-string p3, "mime-exclude"

    invoke-interface {p2, p3}, Lorg/w3c/dom/Document;->createElement(Ljava/lang/String;)Lorg/w3c/dom/Element;

    move-result-object p3

    .line 38
    invoke-virtual {p1}, Lorg/apache/tika/mime/MediaType;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lorg/w3c/dom/Document;->createTextNode(Ljava/lang/String;)Lorg/w3c/dom/Text;

    move-result-object p1

    invoke-interface {p3, p1}, Lorg/w3c/dom/Node;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    .line 39
    invoke-interface {p4, p3}, Lorg/w3c/dom/Node;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    goto :goto_2

    :cond_4
    return-object p4
.end method

.method private static addParser(Lorg/apache/tika/config/TikaConfigSerializer$Mode;Lorg/w3c/dom/Element;Lorg/w3c/dom/Document;Lorg/apache/tika/parser/Parser;)V
    .locals 6

    .line 1
    instance-of v0, p3, Lorg/apache/tika/parser/ParserDecorator;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-class v1, Lorg/apache/tika/parser/ParserDecorator;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "$"

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    check-cast p3, Lorg/apache/tika/parser/ParserDecorator;

    .line 4
    invoke-virtual {p3}, Lorg/apache/tika/parser/ParserDecorator;->getWrappedParser()Lorg/apache/tika/parser/Parser;

    move-result-object v0

    move-object v5, v0

    move-object v0, p3

    move-object p3, v5

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 5
    :goto_0
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 6
    sget-object v2, Lorg/apache/tika/config/TikaConfigSerializer$Mode;->CURRENT:Lorg/apache/tika/config/TikaConfigSerializer$Mode;

    const/4 v3, 0x1

    if-ne p0, v2, :cond_1

    instance-of v2, p3, Lorg/apache/tika/parser/DefaultParser;

    if-eqz v2, :cond_1

    goto :goto_1

    .line 7
    :cond_1
    instance-of v2, p3, Lorg/apache/tika/parser/CompositeParser;

    if-eqz v2, :cond_3

    .line 8
    move-object v1, p3

    check-cast v1, Lorg/apache/tika/parser/CompositeParser;

    invoke-virtual {v1}, Lorg/apache/tika/parser/CompositeParser;->getAllComponentParsers()Ljava/util/List;

    move-result-object v1

    .line 9
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v4, Lorg/apache/tika/parser/CompositeParser;

    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    xor-int/2addr v3, v2

    .line 10
    instance-of v2, p3, Lorg/apache/tika/parser/DefaultParser;

    if-eqz v2, :cond_4

    sget-object v2, Lorg/apache/tika/config/TikaConfigSerializer$Mode;->STATIC:Lorg/apache/tika/config/TikaConfigSerializer$Mode;

    if-eq p0, v2, :cond_2

    sget-object v2, Lorg/apache/tika/config/TikaConfigSerializer$Mode;->STATIC_FULL:Lorg/apache/tika/config/TikaConfigSerializer$Mode;

    if-ne p0, v2, :cond_4

    :cond_2
    const/4 v3, 0x0

    goto :goto_1

    .line 11
    :cond_3
    instance-of v2, p3, Lorg/apache/tika/parser/multiple/AbstractMultipleParser;

    if-eqz v2, :cond_4

    .line 12
    move-object v1, p3

    check-cast v1, Lorg/apache/tika/parser/multiple/AbstractMultipleParser;

    invoke-virtual {v1}, Lorg/apache/tika/parser/multiple/AbstractMultipleParser;->getAllParsers()Ljava/util/List;

    move-result-object v1

    :cond_4
    :goto_1
    if-eqz v3, :cond_5

    .line 13
    invoke-static {p0, p1, p2, p3, v0}, Lorg/apache/tika/config/TikaConfigSerializer;->addParser(Lorg/apache/tika/config/TikaConfigSerializer$Mode;Lorg/w3c/dom/Element;Lorg/w3c/dom/Document;Lorg/apache/tika/parser/Parser;Lorg/apache/tika/parser/ParserDecorator;)Lorg/w3c/dom/Element;

    move-result-object p1

    .line 14
    :cond_5
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/tika/parser/Parser;

    .line 15
    invoke-static {p0, p1, p2, v0}, Lorg/apache/tika/config/TikaConfigSerializer;->addParser(Lorg/apache/tika/config/TikaConfigSerializer$Mode;Lorg/w3c/dom/Element;Lorg/w3c/dom/Document;Lorg/apache/tika/parser/Parser;)V

    goto :goto_2

    :cond_6
    return-void
.end method

.method private static addParsers(Lorg/apache/tika/config/TikaConfigSerializer$Mode;Lorg/w3c/dom/Element;Lorg/w3c/dom/Document;Lorg/apache/tika/config/TikaConfig;)V
    .locals 2

    .line 1
    invoke-virtual {p3}, Lorg/apache/tika/config/TikaConfig;->getParser()Lorg/apache/tika/parser/Parser;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    sget-object v0, Lorg/apache/tika/config/TikaConfigSerializer$Mode;->MINIMAL:Lorg/apache/tika/config/TikaConfigSerializer$Mode;

    .line 6
    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    .line 9
    instance-of v1, p3, Lorg/apache/tika/parser/DefaultParser;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    if-ne p0, v0, :cond_1

    .line 15
    .line 16
    sget-object p0, Lorg/apache/tika/config/TikaConfigSerializer$Mode;->CURRENT:Lorg/apache/tika/config/TikaConfigSerializer$Mode;

    .line 17
    .line 18
    :cond_1
    const-string v0, "parsers"

    .line 19
    .line 20
    invoke-interface {p2, v0}, Lorg/w3c/dom/Document;->createElement(Ljava/lang/String;)Lorg/w3c/dom/Element;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {p1, v0}, Lorg/w3c/dom/Node;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    .line 25
    .line 26
    .line 27
    invoke-static {p0, v0, p2, p3}, Lorg/apache/tika/config/TikaConfigSerializer;->addParser(Lorg/apache/tika/config/TikaConfigSerializer$Mode;Lorg/w3c/dom/Element;Lorg/w3c/dom/Document;Lorg/apache/tika/parser/Parser;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method private static addServiceLoader(Lorg/apache/tika/config/TikaConfigSerializer$Mode;Lorg/w3c/dom/Element;Lorg/w3c/dom/Document;Lorg/apache/tika/config/TikaConfig;)V
    .locals 1

    .line 1
    invoke-virtual {p3}, Lorg/apache/tika/config/TikaConfig;->getServiceLoader()Lorg/apache/tika/config/ServiceLoader;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    sget-object v0, Lorg/apache/tika/config/TikaConfigSerializer$Mode;->MINIMAL:Lorg/apache/tika/config/TikaConfigSerializer$Mode;

    .line 6
    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p3}, Lorg/apache/tika/config/ServiceLoader;->isDynamic()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p3}, Lorg/apache/tika/config/ServiceLoader;->getLoadErrorHandler()Lorg/apache/tika/config/LoadErrorHandler;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    sget-object v0, Lorg/apache/tika/config/LoadErrorHandler;->IGNORE:Lorg/apache/tika/config/LoadErrorHandler;

    .line 20
    .line 21
    if-ne p0, v0, :cond_0

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    const-string p0, "service-loader"

    .line 25
    .line 26
    invoke-interface {p2, p0}, Lorg/w3c/dom/Document;->createElement(Ljava/lang/String;)Lorg/w3c/dom/Element;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p3}, Lorg/apache/tika/config/ServiceLoader;->isDynamic()Z

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    invoke-static {p2}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    const-string v0, "dynamic"

    .line 39
    .line 40
    invoke-interface {p0, v0, p2}, Lorg/w3c/dom/Element;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p3}, Lorg/apache/tika/config/ServiceLoader;->getLoadErrorHandler()Lorg/apache/tika/config/LoadErrorHandler;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    const-string p3, "loadErrorHandler"

    .line 52
    .line 53
    invoke-interface {p0, p3, p2}, Lorg/w3c/dom/Element;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-interface {p1, p0}, Lorg/w3c/dom/Node;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method private static addTranslator(Lorg/apache/tika/config/TikaConfigSerializer$Mode;Lorg/w3c/dom/Element;Lorg/w3c/dom/Document;Lorg/apache/tika/config/TikaConfig;)V
    .locals 1

    .line 1
    invoke-virtual {p3}, Lorg/apache/tika/config/TikaConfig;->getTranslator()Lorg/apache/tika/language/translate/Translator;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    sget-object v0, Lorg/apache/tika/config/TikaConfigSerializer$Mode;->MINIMAL:Lorg/apache/tika/config/TikaConfigSerializer$Mode;

    .line 6
    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    .line 9
    instance-of v0, p3, Lorg/apache/tika/language/translate/DefaultTranslator;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string p0, "for example: <translator class=\"org.apache.tika.language.translate.GoogleTranslator\"/>"

    .line 14
    .line 15
    invoke-interface {p2, p0}, Lorg/w3c/dom/Document;->createComment(Ljava/lang/String;)Lorg/w3c/dom/Comment;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-interface {p1, p0}, Lorg/w3c/dom/Node;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    instance-of v0, p3, Lorg/apache/tika/language/translate/DefaultTranslator;

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    sget-object v0, Lorg/apache/tika/config/TikaConfigSerializer$Mode;->STATIC:Lorg/apache/tika/config/TikaConfigSerializer$Mode;

    .line 28
    .line 29
    if-eq p0, v0, :cond_1

    .line 30
    .line 31
    sget-object v0, Lorg/apache/tika/config/TikaConfigSerializer$Mode;->STATIC_FULL:Lorg/apache/tika/config/TikaConfigSerializer$Mode;

    .line 32
    .line 33
    if-ne p0, v0, :cond_2

    .line 34
    .line 35
    :cond_1
    check-cast p3, Lorg/apache/tika/language/translate/DefaultTranslator;

    .line 36
    .line 37
    invoke-virtual {p3}, Lorg/apache/tika/language/translate/DefaultTranslator;->getTranslator()Lorg/apache/tika/language/translate/Translator;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    :cond_2
    if-eqz p3, :cond_3

    .line 42
    .line 43
    const-string p0, "translator"

    .line 44
    .line 45
    invoke-interface {p2, p0}, Lorg/w3c/dom/Document;->createElement(Ljava/lang/String;)Lorg/w3c/dom/Element;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-virtual {p2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    const-string p3, "class"

    .line 58
    .line 59
    invoke-interface {p0, p3, p2}, Lorg/w3c/dom/Element;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-interface {p1, p0}, Lorg/w3c/dom/Node;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_3
    const-string p0, "No translators available"

    .line 67
    .line 68
    invoke-interface {p2, p0}, Lorg/w3c/dom/Document;->createComment(Ljava/lang/String;)Lorg/w3c/dom/Comment;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-interface {p1, p0}, Lorg/w3c/dom/Node;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method private static findGetter(Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;Ljava/lang/Object;)Ljava/lang/reflect/Method;
    .locals 9

    .line 1
    const-string v0, "\\A(?:get|is)([A-Z].+)\\Z"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, ""

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    array-length v2, v1

    .line 22
    const/4 v3, 0x0

    .line 23
    :goto_0
    if-ge v3, v2, :cond_3

    .line 24
    .line 25
    aget-object v4, v1, v3

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    const-string v6, "PDF"

    .line 36
    .line 37
    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-eqz v5, :cond_0

    .line 42
    .line 43
    sget-object v5, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 44
    .line 45
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    invoke-virtual {v5, v7}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    invoke-virtual {v0, v5}, Ljava/util/regex/Matcher;->reset(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->find()Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_2

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    if-eqz v5, :cond_1

    .line 79
    .line 80
    sget-object v5, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 81
    .line 82
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    new-instance v7, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    const-string v8, "2: "

    .line 89
    .line 90
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    invoke-virtual {v5, v6}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    :cond_1
    const/4 v5, 0x1

    .line 104
    invoke-virtual {v0, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    iget-object v6, p0, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;->name:Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    if-eqz v5, :cond_2

    .line 115
    .line 116
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    iget-object v6, p0, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;->singleParam:Ljava/lang/Class;

    .line 121
    .line 122
    invoke-virtual {v6, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    if-eqz v5, :cond_2

    .line 127
    .line 128
    return-object v4

    .line 129
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_3
    const/4 p0, 0x0

    .line 133
    return-object p0
.end method

.method private static methodToParamName(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, Lorg/apache/tika/utils/StringUtils;->isBlank(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {v0, p0}, LB1/e;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method private static pickBestSetter(Ljava/util/Set;)Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;",
            ">;)",
            "Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return-object p0
.end method

.method private static processNonPrimitive(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;Lorg/w3c/dom/Document;Lorg/w3c/dom/Element;Ljava/lang/Object;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;",
            ">;",
            "Ljava/util/Set<",
            "Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;",
            ">;",
            "Lorg/w3c/dom/Document;",
            "Lorg/w3c/dom/Element;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    move-object v4, v0

    .line 16
    check-cast v4, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;

    .line 17
    .line 18
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    move-object v5, v1

    .line 33
    check-cast v5, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;

    .line 34
    .line 35
    iget-object v1, v4, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;->singleParam:Ljava/lang/Class;

    .line 36
    .line 37
    iget-object v2, v5, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;->singleParam:Ljava/lang/Class;

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    move-object v1, p0

    .line 46
    move-object v2, p3

    .line 47
    move-object v3, p4

    .line 48
    move-object v6, p5

    .line 49
    invoke-static/range {v1 .. v6}, Lorg/apache/tika/config/TikaConfigSerializer;->serializeObject(Ljava/lang/String;Lorg/w3c/dom/Document;Lorg/w3c/dom/Element;Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :cond_2
    return-void
.end method

.method public static serialize(Lorg/apache/tika/config/TikaConfig;Lorg/apache/tika/config/TikaConfigSerializer$Mode;Ljava/io/Writer;Ljava/nio/charset/Charset;)V
    .locals 2

    .line 1
    invoke-static {}, Lorg/apache/tika/utils/XMLReaderUtils;->getDocumentBuilder()Ljavax/xml/parsers/DocumentBuilder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljavax/xml/parsers/DocumentBuilder;->newDocument()Lorg/w3c/dom/Document;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "properties"

    .line 10
    .line 11
    invoke-interface {v0, v1}, Lorg/w3c/dom/Document;->createElement(Ljava/lang/String;)Lorg/w3c/dom/Element;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v0, v1}, Lorg/w3c/dom/Node;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v1, v0}, Lorg/apache/tika/config/TikaConfigSerializer;->addMimeComment(Lorg/apache/tika/config/TikaConfigSerializer$Mode;Lorg/w3c/dom/Element;Lorg/w3c/dom/Document;)V

    .line 19
    .line 20
    .line 21
    invoke-static {p1, v1, v0, p0}, Lorg/apache/tika/config/TikaConfigSerializer;->addServiceLoader(Lorg/apache/tika/config/TikaConfigSerializer$Mode;Lorg/w3c/dom/Element;Lorg/w3c/dom/Document;Lorg/apache/tika/config/TikaConfig;)V

    .line 22
    .line 23
    .line 24
    invoke-static {p1, v1, v0, p0}, Lorg/apache/tika/config/TikaConfigSerializer;->addExecutorService(Lorg/apache/tika/config/TikaConfigSerializer$Mode;Lorg/w3c/dom/Element;Lorg/w3c/dom/Document;Lorg/apache/tika/config/TikaConfig;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p1, v1, v0, p0}, Lorg/apache/tika/config/TikaConfigSerializer;->addEncodingDetectors(Lorg/apache/tika/config/TikaConfigSerializer$Mode;Lorg/w3c/dom/Element;Lorg/w3c/dom/Document;Lorg/apache/tika/config/TikaConfig;)V

    .line 28
    .line 29
    .line 30
    invoke-static {p1, v1, v0, p0}, Lorg/apache/tika/config/TikaConfigSerializer;->addTranslator(Lorg/apache/tika/config/TikaConfigSerializer$Mode;Lorg/w3c/dom/Element;Lorg/w3c/dom/Document;Lorg/apache/tika/config/TikaConfig;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1, v1, v0, p0}, Lorg/apache/tika/config/TikaConfigSerializer;->addDetectors(Lorg/apache/tika/config/TikaConfigSerializer$Mode;Lorg/w3c/dom/Element;Lorg/w3c/dom/Document;Lorg/apache/tika/config/TikaConfig;)V

    .line 34
    .line 35
    .line 36
    invoke-static {p1, v1, v0, p0}, Lorg/apache/tika/config/TikaConfigSerializer;->addParsers(Lorg/apache/tika/config/TikaConfigSerializer$Mode;Lorg/w3c/dom/Element;Lorg/w3c/dom/Document;Lorg/apache/tika/config/TikaConfig;)V

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lorg/apache/tika/utils/XMLReaderUtils;->getTransformer()Ljavax/xml/transform/Transformer;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    const-string p1, "indent"

    .line 44
    .line 45
    const-string v1, "yes"

    .line 46
    .line 47
    invoke-virtual {p0, p1, v1}, Ljavax/xml/transform/Transformer;->setOutputProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const-string p1, "{http://xml.apache.org/xslt}indent-amount"

    .line 51
    .line 52
    const-string v1, "2"

    .line 53
    .line 54
    invoke-virtual {p0, p1, v1}, Ljavax/xml/transform/Transformer;->setOutputProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const-string p1, "encoding"

    .line 58
    .line 59
    invoke-virtual {p3}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p3

    .line 63
    invoke-virtual {p0, p1, p3}, Ljavax/xml/transform/Transformer;->setOutputProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    new-instance p1, Ljavax/xml/transform/dom/DOMSource;

    .line 67
    .line 68
    invoke-direct {p1, v0}, Ljavax/xml/transform/dom/DOMSource;-><init>(Lorg/w3c/dom/Node;)V

    .line 69
    .line 70
    .line 71
    new-instance p3, Ljavax/xml/transform/stream/StreamResult;

    .line 72
    .line 73
    invoke-direct {p3, p2}, Ljavax/xml/transform/stream/StreamResult;-><init>(Ljava/io/Writer;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, p1, p3}, Ljavax/xml/transform/Transformer;->transform(Ljavax/xml/transform/Source;Ljavax/xml/transform/Result;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method private static serializeNonPrimitives(Lorg/w3c/dom/Document;Lorg/w3c/dom/Element;Ljava/lang/Object;Lorg/apache/tika/config/TikaConfigSerializer$MethodTuples;Lorg/apache/tika/config/TikaConfigSerializer$MethodTuples;)V
    .locals 8

    .line 1
    iget-object p3, p3, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuples;->tuples:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ljava/util/Map$Entry;

    .line 22
    .line 23
    iget-object v1, p4, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuples;->tuples:Ljava/util/Map;

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    move-object v4, v1

    .line 34
    check-cast v4, Ljava/util/Set;

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    move-object v2, v1

    .line 41
    check-cast v2, Ljava/lang/String;

    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    move-object v3, v1

    .line 48
    check-cast v3, Ljava/util/Set;

    .line 49
    .line 50
    move-object v5, p0

    .line 51
    move-object v6, p1

    .line 52
    move-object v7, p2

    .line 53
    invoke-static/range {v2 .. v7}, Lorg/apache/tika/config/TikaConfigSerializer;->processNonPrimitive(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;Lorg/w3c/dom/Document;Lorg/w3c/dom/Element;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object p0, p4, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuples;->tuples:Ljava/util/Map;

    .line 57
    .line 58
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-interface {p0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-nez p0, :cond_0

    .line 67
    .line 68
    sget-object p0, Lorg/apache/tika/config/TikaConfigSerializer;->LOG:LF2/b;

    .line 69
    .line 70
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    const-string v0, "no getter for setter non-primitive: {} in {}"

    .line 79
    .line 80
    invoke-interface {p0, p1, p2, v0}, LF2/b;->r(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :cond_0
    move-object p0, v5

    .line 84
    move-object p1, v6

    .line 85
    move-object p2, v7

    .line 86
    goto :goto_0

    .line 87
    :cond_1
    return-void
.end method

.method private static serializeObject(Ljava/lang/String;Lorg/w3c/dom/Document;Lorg/w3c/dom/Element;Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;Ljava/lang/Object;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object p3, p4, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;->method:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p3, p5, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p3
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    if-nez p3, :cond_0

    .line 9
    .line 10
    sget-object v0, Lorg/apache/tika/config/TikaConfigSerializer;->LOG:LF2/b;

    .line 11
    .line 12
    iget-object p4, p4, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;->name:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object p5

    .line 18
    const-string v1, "Getter {} on {} returned null"

    .line 19
    .line 20
    invoke-interface {v0, p4, p5, v1}, LF2/b;->r(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-interface {p1, p0}, Lorg/w3c/dom/Document;->createElement(Ljava/lang/String;)Lorg/w3c/dom/Element;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object p4

    .line 31
    invoke-virtual {p4}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p4

    .line 35
    const-string p5, "class"

    .line 36
    .line 37
    invoke-interface {p0, p5, p4}, Lorg/w3c/dom/Element;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-interface {p2, p0}, Lorg/w3c/dom/Node;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    .line 41
    .line 42
    .line 43
    invoke-static {p1, p2, p3}, Lorg/apache/tika/config/TikaConfigSerializer;->serializeParams(Lorg/w3c/dom/Document;Lorg/w3c/dom/Element;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :catch_0
    move-exception p1

    .line 48
    goto :goto_0

    .line 49
    :catch_1
    move-exception p1

    .line 50
    :goto_0
    sget-object p2, Lorg/apache/tika/config/TikaConfigSerializer;->LOG:LF2/b;

    .line 51
    .line 52
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object p3

    .line 56
    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p3

    .line 60
    const-string p4, "couldn\'t get "

    .line 61
    .line 62
    const-string p5, " on "

    .line 63
    .line 64
    invoke-static {p4, p0, p5, p3}, LB1/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-interface {p2, p0, p1}, LF2/b;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public static serializeParams(Lorg/w3c/dom/Document;Lorg/w3c/dom/Element;Ljava/lang/Object;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const-string v3, "\\Aset([A-Z].*)"

    .line 8
    .line 9
    invoke-static {v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    const-string v4, ""

    .line 14
    .line 15
    invoke-virtual {v3, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    const-string v5, "\\A(?:get|is)([A-Z].+)\\Z"

    .line 20
    .line 21
    invoke-static {v5}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    invoke-virtual {v5, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    new-instance v5, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuples;

    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    invoke-direct {v5, v6}, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuples;-><init>(I)V

    .line 33
    .line 34
    .line 35
    new-instance v7, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuples;

    .line 36
    .line 37
    invoke-direct {v7, v6}, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuples;-><init>(I)V

    .line 38
    .line 39
    .line 40
    new-instance v8, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuples;

    .line 41
    .line 42
    invoke-direct {v8, v6}, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuples;-><init>(I)V

    .line 43
    .line 44
    .line 45
    new-instance v9, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuples;

    .line 46
    .line 47
    invoke-direct {v9, v6}, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuples;-><init>(I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v10

    .line 54
    invoke-virtual {v10}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 55
    .line 56
    .line 57
    move-result-object v10

    .line 58
    array-length v11, v10

    .line 59
    move v12, v6

    .line 60
    :goto_0
    if-ge v12, v11, :cond_8

    .line 61
    .line 62
    aget-object v13, v10, v12

    .line 63
    .line 64
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-result-object v14

    .line 68
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v15

    .line 72
    invoke-virtual {v3, v15}, Ljava/util/regex/Matcher;->reset(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 73
    .line 74
    .line 75
    move-result-object v15

    .line 76
    invoke-virtual {v15}, Ljava/util/regex/Matcher;->find()Z

    .line 77
    .line 78
    .line 79
    move-result v15

    .line 80
    move/from16 v16, v6

    .line 81
    .line 82
    const/4 v6, 0x1

    .line 83
    if-eqz v15, :cond_4

    .line 84
    .line 85
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 86
    .line 87
    .line 88
    move-result v15

    .line 89
    invoke-static {v15}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 90
    .line 91
    .line 92
    move-result v15

    .line 93
    if-nez v15, :cond_0

    .line 94
    .line 95
    sget-object v6, Lorg/apache/tika/config/TikaConfigSerializer;->LOG:LF2/b;

    .line 96
    .line 97
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v13

    .line 101
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    move-result-object v14

    .line 105
    const-string v15, "inaccessible setter: {} in {}"

    .line 106
    .line 107
    invoke-interface {v6, v15, v13, v14}, LF2/b;->y(Ljava/lang/String;Ljava/lang/Object;Ljava/io/Serializable;)V

    .line 108
    .line 109
    .line 110
    :goto_1
    move-object/from16 v17, v10

    .line 111
    .line 112
    goto/16 :goto_2

    .line 113
    .line 114
    :cond_0
    const-class v15, Lorg/apache/tika/config/Field;

    .line 115
    .line 116
    invoke-virtual {v13, v15}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 117
    .line 118
    .line 119
    move-result-object v15

    .line 120
    if-nez v15, :cond_1

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_1
    array-length v15, v14

    .line 124
    if-eq v15, v6, :cond_2

    .line 125
    .line 126
    sget-object v6, Lorg/apache/tika/config/TikaConfigSerializer;->LOG:LF2/b;

    .line 127
    .line 128
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v13

    .line 132
    array-length v14, v14

    .line 133
    new-instance v15, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    move-object/from16 v17, v10

    .line 136
    .line 137
    const-string v10, "setter with wrong number of params "

    .line 138
    .line 139
    invoke-direct {v15, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const-string v10, " "

    .line 146
    .line 147
    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v10

    .line 157
    invoke-interface {v6, v10}, LF2/b;->m(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_2
    move-object/from16 v17, v10

    .line 162
    .line 163
    invoke-virtual {v3, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    invoke-static {v6}, Lorg/apache/tika/config/TikaConfigSerializer;->methodToParamName(Ljava/lang/String;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    sget-object v10, Lorg/apache/tika/config/TikaConfigSerializer;->PRIMITIVES:Ljava/util/Map;

    .line 172
    .line 173
    aget-object v15, v14, v16

    .line 174
    .line 175
    invoke-interface {v10, v15}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v10

    .line 179
    if-eqz v10, :cond_3

    .line 180
    .line 181
    new-instance v10, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;

    .line 182
    .line 183
    aget-object v14, v14, v16

    .line 184
    .line 185
    invoke-direct {v10, v6, v13, v14}, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;-><init>(Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/lang/Class;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v7, v10}, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuples;->add(Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;)V

    .line 189
    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_3
    new-instance v10, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;

    .line 193
    .line 194
    aget-object v14, v14, v16

    .line 195
    .line 196
    invoke-direct {v10, v6, v13, v14}, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;-><init>(Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/lang/Class;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v5, v10}, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuples;->add(Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;)V

    .line 200
    .line 201
    .line 202
    goto :goto_2

    .line 203
    :cond_4
    move-object/from16 v17, v10

    .line 204
    .line 205
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v10

    .line 209
    invoke-virtual {v4, v10}, Ljava/util/regex/Matcher;->reset(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 210
    .line 211
    .line 212
    move-result-object v10

    .line 213
    invoke-virtual {v10}, Ljava/util/regex/Matcher;->find()Z

    .line 214
    .line 215
    .line 216
    move-result v10

    .line 217
    if-eqz v10, :cond_7

    .line 218
    .line 219
    array-length v10, v14

    .line 220
    if-eqz v10, :cond_5

    .line 221
    .line 222
    goto :goto_2

    .line 223
    :cond_5
    invoke-virtual {v4, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v6

    .line 227
    invoke-static {v6}, Lorg/apache/tika/config/TikaConfigSerializer;->methodToParamName(Ljava/lang/String;)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    sget-object v10, Lorg/apache/tika/config/TikaConfigSerializer;->PRIMITIVES:Ljava/util/Map;

    .line 232
    .line 233
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    move-result-object v14

    .line 237
    invoke-interface {v10, v14}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v10

    .line 241
    if-eqz v10, :cond_6

    .line 242
    .line 243
    new-instance v10, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;

    .line 244
    .line 245
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    move-result-object v14

    .line 249
    invoke-direct {v10, v6, v13, v14}, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;-><init>(Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/lang/Class;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v9, v10}, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuples;->add(Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;)V

    .line 253
    .line 254
    .line 255
    goto :goto_2

    .line 256
    :cond_6
    new-instance v10, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;

    .line 257
    .line 258
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    move-result-object v14

    .line 262
    invoke-direct {v10, v6, v13, v14}, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;-><init>(Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/lang/Class;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v8, v10}, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuples;->add(Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;)V

    .line 266
    .line 267
    .line 268
    :cond_7
    :goto_2
    add-int/lit8 v12, v12, 0x1

    .line 269
    .line 270
    move/from16 v6, v16

    .line 271
    .line 272
    move-object/from16 v10, v17

    .line 273
    .line 274
    goto/16 :goto_0

    .line 275
    .line 276
    :cond_8
    invoke-static {v0, v1, v2, v7, v9}, Lorg/apache/tika/config/TikaConfigSerializer;->serializePrimitives(Lorg/w3c/dom/Document;Lorg/w3c/dom/Element;Ljava/lang/Object;Lorg/apache/tika/config/TikaConfigSerializer$MethodTuples;Lorg/apache/tika/config/TikaConfigSerializer$MethodTuples;)V

    .line 277
    .line 278
    .line 279
    invoke-static {v0, v1, v2, v5, v8}, Lorg/apache/tika/config/TikaConfigSerializer;->serializeNonPrimitives(Lorg/w3c/dom/Document;Lorg/w3c/dom/Element;Ljava/lang/Object;Lorg/apache/tika/config/TikaConfigSerializer$MethodTuples;Lorg/apache/tika/config/TikaConfigSerializer$MethodTuples;)V

    .line 280
    .line 281
    .line 282
    return-void
.end method

.method private static serializePrimitives(Lorg/w3c/dom/Document;Lorg/w3c/dom/Element;Ljava/lang/Object;Lorg/apache/tika/config/TikaConfigSerializer$MethodTuples;Lorg/apache/tika/config/TikaConfigSerializer$MethodTuples;)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v4, p4

    .line 8
    .line 9
    const-string v5, "couldn\'t invoke "

    .line 10
    .line 11
    instance-of v0, v3, Lorg/apache/tika/parser/multiple/AbstractMultipleParser;

    .line 12
    .line 13
    const-string v6, "name"

    .line 14
    .line 15
    const-string v7, "param"

    .line 16
    .line 17
    const-string v8, "params"

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-interface {v1, v8}, Lorg/w3c/dom/Document;->createElement(Ljava/lang/String;)Lorg/w3c/dom/Element;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v1, v7}, Lorg/w3c/dom/Document;->createElement(Ljava/lang/String;)Lorg/w3c/dom/Element;

    .line 26
    .line 27
    .line 28
    move-result-object v10

    .line 29
    const-string v11, "metadataPolicy"

    .line 30
    .line 31
    invoke-interface {v10, v6, v11}, Lorg/w3c/dom/Element;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    move-object v11, v3

    .line 35
    check-cast v11, Lorg/apache/tika/parser/multiple/AbstractMultipleParser;

    .line 36
    .line 37
    invoke-virtual {v11}, Lorg/apache/tika/parser/multiple/AbstractMultipleParser;->getMetadataPolicy()Lorg/apache/tika/parser/multiple/AbstractMultipleParser$MetadataPolicy;

    .line 38
    .line 39
    .line 40
    move-result-object v11

    .line 41
    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v11

    .line 45
    const-string v12, "value"

    .line 46
    .line 47
    invoke-interface {v10, v12, v11}, Lorg/w3c/dom/Element;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-interface {v0, v10}, Lorg/w3c/dom/Node;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    .line 51
    .line 52
    .line 53
    invoke-interface {v2, v0}, Lorg/w3c/dom/Node;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    .line 54
    .line 55
    .line 56
    :goto_0
    move-object/from16 v10, p3

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_0
    const/4 v0, 0x0

    .line 60
    goto :goto_0

    .line 61
    :goto_1
    iget-object v10, v10, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuples;->tuples:Ljava/util/Map;

    .line 62
    .line 63
    invoke-interface {v10}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 64
    .line 65
    .line 66
    move-result-object v10

    .line 67
    invoke-interface {v10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v10

    .line 71
    move-object v11, v0

    .line 72
    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_b

    .line 77
    .line 78
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, Ljava/util/Map$Entry;

    .line 83
    .line 84
    iget-object v12, v4, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuples;->tuples:Ljava/util/Map;

    .line 85
    .line 86
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v13

    .line 90
    invoke-interface {v12, v13}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v12

    .line 94
    if-nez v12, :cond_1

    .line 95
    .line 96
    sget-object v12, Lorg/apache/tika/config/TikaConfigSerializer;->LOG:LF2/b;

    .line 97
    .line 98
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-result-object v13

    .line 106
    const-string v14, "no getter for setter: {} in {}"

    .line 107
    .line 108
    invoke-interface {v12, v14, v0, v13}, LF2/b;->A(Ljava/lang/String;Ljava/lang/Object;Ljava/io/Serializable;)V

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_1
    iget-object v12, v4, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuples;->tuples:Ljava/util/Map;

    .line 113
    .line 114
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v13

    .line 118
    invoke-interface {v12, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v12

    .line 122
    check-cast v12, Ljava/util/Set;

    .line 123
    .line 124
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v13

    .line 128
    check-cast v13, Ljava/util/Set;

    .line 129
    .line 130
    invoke-interface {v12}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object v12

    .line 134
    const/4 v14, 0x0

    .line 135
    :goto_3
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result v15

    .line 139
    if-eqz v15, :cond_4

    .line 140
    .line 141
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v15

    .line 145
    check-cast v15, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;

    .line 146
    .line 147
    invoke-interface {v13}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 148
    .line 149
    .line 150
    move-result-object v16

    .line 151
    :goto_4
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 152
    .line 153
    .line 154
    move-result v17

    .line 155
    if-eqz v17, :cond_3

    .line 156
    .line 157
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v17

    .line 161
    move-object/from16 v9, v17

    .line 162
    .line 163
    check-cast v9, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;

    .line 164
    .line 165
    move-object/from16 p3, v0

    .line 166
    .line 167
    iget-object v0, v15, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;->singleParam:Ljava/lang/Class;

    .line 168
    .line 169
    iget-object v9, v9, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;->singleParam:Ljava/lang/Class;

    .line 170
    .line 171
    invoke-virtual {v0, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    if-eqz v0, :cond_2

    .line 176
    .line 177
    move-object v14, v15

    .line 178
    goto :goto_5

    .line 179
    :cond_2
    move-object/from16 v0, p3

    .line 180
    .line 181
    goto :goto_4

    .line 182
    :cond_3
    move-object/from16 p3, v0

    .line 183
    .line 184
    :goto_5
    move-object/from16 v0, p3

    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_4
    move-object/from16 p3, v0

    .line 188
    .line 189
    if-nez v14, :cond_5

    .line 190
    .line 191
    sget-object v0, Lorg/apache/tika/config/TikaConfigSerializer;->LOG:LF2/b;

    .line 192
    .line 193
    const-string v9, "Could not find getter to match setter for: {}"

    .line 194
    .line 195
    invoke-interface/range {p3 .. p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v12

    .line 199
    invoke-interface {v0, v12, v9}, LF2/b;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    goto/16 :goto_2

    .line 203
    .line 204
    :cond_5
    :try_start_0
    iget-object v0, v14, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;->method:Ljava/lang/reflect/Method;

    .line 205
    .line 206
    const/4 v9, 0x0

    .line 207
    invoke-virtual {v0, v3, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 211
    if-nez v0, :cond_6

    .line 212
    .line 213
    sget-object v12, Lorg/apache/tika/config/TikaConfigSerializer;->LOG:LF2/b;

    .line 214
    .line 215
    iget-object v13, v14, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;->name:Ljava/lang/String;

    .line 216
    .line 217
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    move-result-object v15

    .line 221
    const-string v9, "null value: {} in {}"

    .line 222
    .line 223
    invoke-interface {v12, v13, v15, v9}, LF2/b;->w(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    :cond_6
    if-nez v0, :cond_7

    .line 227
    .line 228
    const-string v9, ""

    .line 229
    .line 230
    goto :goto_6

    .line 231
    :cond_7
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v9

    .line 235
    :goto_6
    invoke-interface {v1, v7}, Lorg/w3c/dom/Document;->createElement(Ljava/lang/String;)Lorg/w3c/dom/Element;

    .line 236
    .line 237
    .line 238
    move-result-object v12

    .line 239
    iget-object v13, v14, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;->name:Ljava/lang/String;

    .line 240
    .line 241
    invoke-interface {v12, v6, v13}, Lorg/w3c/dom/Element;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    sget-object v13, Lorg/apache/tika/config/TikaConfigSerializer;->PRIMITIVES:Ljava/util/Map;

    .line 245
    .line 246
    iget-object v15, v14, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;->singleParam:Ljava/lang/Class;

    .line 247
    .line 248
    invoke-interface {v13, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v13

    .line 252
    check-cast v13, Ljava/lang/String;

    .line 253
    .line 254
    const-string v15, "type"

    .line 255
    .line 256
    invoke-interface {v12, v15, v13}, Lorg/w3c/dom/Element;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    const-class v13, Ljava/util/List;

    .line 260
    .line 261
    iget-object v15, v14, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;->singleParam:Ljava/lang/Class;

    .line 262
    .line 263
    invoke-virtual {v13, v15}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 264
    .line 265
    .line 266
    move-result v13

    .line 267
    if-eqz v13, :cond_8

    .line 268
    .line 269
    check-cast v0, Ljava/util/List;

    .line 270
    .line 271
    invoke-static {v12, v1, v14, v0}, Lorg/apache/tika/config/TikaConfigSerializer;->addList(Lorg/w3c/dom/Element;Lorg/w3c/dom/Document;Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;Ljava/util/List;)V

    .line 272
    .line 273
    .line 274
    goto :goto_7

    .line 275
    :cond_8
    const-class v13, Ljava/util/Map;

    .line 276
    .line 277
    iget-object v15, v14, Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;->singleParam:Ljava/lang/Class;

    .line 278
    .line 279
    invoke-virtual {v13, v15}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 280
    .line 281
    .line 282
    move-result v13

    .line 283
    if-eqz v13, :cond_9

    .line 284
    .line 285
    check-cast v0, Ljava/util/Map;

    .line 286
    .line 287
    invoke-static {v12, v1, v14, v0}, Lorg/apache/tika/config/TikaConfigSerializer;->addMap(Lorg/w3c/dom/Element;Lorg/w3c/dom/Document;Lorg/apache/tika/config/TikaConfigSerializer$MethodTuple;Ljava/util/Map;)V

    .line 288
    .line 289
    .line 290
    goto :goto_7

    .line 291
    :cond_9
    invoke-interface {v12, v9}, Lorg/w3c/dom/Node;->setTextContent(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    :goto_7
    if-nez v11, :cond_a

    .line 295
    .line 296
    invoke-interface {v1, v8}, Lorg/w3c/dom/Document;->createElement(Ljava/lang/String;)Lorg/w3c/dom/Element;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    invoke-interface {v2, v0}, Lorg/w3c/dom/Node;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    .line 301
    .line 302
    .line 303
    move-object v11, v0

    .line 304
    :cond_a
    invoke-interface {v11, v12}, Lorg/w3c/dom/Node;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    .line 305
    .line 306
    .line 307
    goto/16 :goto_2

    .line 308
    .line 309
    :catch_0
    move-exception v0

    .line 310
    goto :goto_8

    .line 311
    :catch_1
    move-exception v0

    .line 312
    goto :goto_9

    .line 313
    :goto_8
    sget-object v9, Lorg/apache/tika/config/TikaConfigSerializer;->LOG:LF2/b;

    .line 314
    .line 315
    invoke-static {v14}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v12

    .line 319
    invoke-virtual {v5, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v12

    .line 323
    invoke-interface {v9, v12, v0}, LF2/b;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 324
    .line 325
    .line 326
    goto/16 :goto_2

    .line 327
    .line 328
    :goto_9
    sget-object v9, Lorg/apache/tika/config/TikaConfigSerializer;->LOG:LF2/b;

    .line 329
    .line 330
    invoke-static {v14}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v12

    .line 334
    invoke-virtual {v5, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v12

    .line 338
    invoke-interface {v9, v12, v0}, LF2/b;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 339
    .line 340
    .line 341
    goto/16 :goto_2

    .line 342
    .line 343
    :cond_b
    return-void
.end method

.class Lorg/apache/tika/pipes/async/AsyncEmitter$EmitDataCache;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/tika/pipes/async/AsyncEmitter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "EmitDataCache"
.end annotation


# instance fields
.field estimatedSize:J

.field map:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lorg/apache/tika/pipes/emitter/EmitData;",
            ">;>;"
        }
    .end annotation
.end field

.field private final maxBytes:J

.field size:I

.field final synthetic this$0:Lorg/apache/tika/pipes/async/AsyncEmitter;


# direct methods
.method public constructor <init>(Lorg/apache/tika/pipes/async/AsyncEmitter;J)V
    .locals 2

    .line 1
    iput-object p1, p0, Lorg/apache/tika/pipes/async/AsyncEmitter$EmitDataCache;->this$0:Lorg/apache/tika/pipes/async/AsyncEmitter;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    iput-wide v0, p0, Lorg/apache/tika/pipes/async/AsyncEmitter$EmitDataCache;->estimatedSize:J

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput p1, p0, Lorg/apache/tika/pipes/async/AsyncEmitter$EmitDataCache;->size:I

    .line 12
    .line 13
    new-instance p1, Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lorg/apache/tika/pipes/async/AsyncEmitter$EmitDataCache;->map:Ljava/util/Map;

    .line 19
    .line 20
    iput-wide p2, p0, Lorg/apache/tika/pipes/async/AsyncEmitter$EmitDataCache;->maxBytes:J

    .line 21
    .line 22
    return-void
.end method

.method public static synthetic a(Ljava/lang/String;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, Lorg/apache/tika/pipes/async/AsyncEmitter$EmitDataCache;->lambda$add$0(Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic b(Lorg/apache/tika/pipes/async/AsyncEmitter$EmitDataCache;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/apache/tika/pipes/async/AsyncEmitter$EmitDataCache;->emitAll()V

    return-void
.end method

.method private emitAll()V
    .locals 6

    .line 1
    invoke-static {}, Lorg/apache/tika/pipes/async/AsyncEmitter;->b()LF2/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lorg/apache/tika/pipes/async/AsyncEmitter$EmitDataCache;->size:I

    .line 6
    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-wide v2, p0, Lorg/apache/tika/pipes/async/AsyncEmitter$EmitDataCache;->estimatedSize:J

    .line 12
    .line 13
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const-string v3, "about to emit {} files, {} estimated bytes"

    .line 18
    .line 19
    invoke-interface {v0, v1, v2, v3}, LF2/b;->w(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lorg/apache/tika/pipes/async/AsyncEmitter$EmitDataCache;->map:Ljava/util/Map;

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const/4 v1, 0x0

    .line 33
    move v2, v1

    .line 34
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, Ljava/util/Map$Entry;

    .line 45
    .line 46
    iget-object v4, p0, Lorg/apache/tika/pipes/async/AsyncEmitter$EmitDataCache;->this$0:Lorg/apache/tika/pipes/async/AsyncEmitter;

    .line 47
    .line 48
    invoke-static {v4}, Lorg/apache/tika/pipes/async/AsyncEmitter;->a(Lorg/apache/tika/pipes/async/AsyncEmitter;)Lorg/apache/tika/pipes/emitter/EmitterManager;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    check-cast v5, Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v4, v5}, Lorg/apache/tika/pipes/emitter/EmitterManager;->getEmitter(Ljava/lang/String;)Lorg/apache/tika/pipes/emitter/Emitter;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    check-cast v5, Ljava/util/List;

    .line 67
    .line 68
    invoke-direct {p0, v4, v5}, Lorg/apache/tika/pipes/async/AsyncEmitter$EmitDataCache;->tryToEmit(Lorg/apache/tika/pipes/emitter/Emitter;Ljava/util/List;)V

    .line 69
    .line 70
    .line 71
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    check-cast v3, Ljava/util/List;

    .line 76
    .line 77
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    add-int/2addr v2, v3

    .line 82
    goto :goto_0

    .line 83
    :cond_0
    invoke-static {}, Lorg/apache/tika/pipes/async/AsyncEmitter;->b()LF2/b;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    const-string v3, "emitted: {} files"

    .line 88
    .line 89
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-interface {v0, v2, v3}, LF2/b;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    const-wide/16 v2, 0x0

    .line 97
    .line 98
    iput-wide v2, p0, Lorg/apache/tika/pipes/async/AsyncEmitter$EmitDataCache;->estimatedSize:J

    .line 99
    .line 100
    iput v1, p0, Lorg/apache/tika/pipes/async/AsyncEmitter$EmitDataCache;->size:I

    .line 101
    .line 102
    iget-object v0, p0, Lorg/apache/tika/pipes/async/AsyncEmitter$EmitDataCache;->map:Ljava/util/Map;

    .line 103
    .line 104
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 105
    .line 106
    .line 107
    iget-object v0, p0, Lorg/apache/tika/pipes/async/AsyncEmitter$EmitDataCache;->this$0:Lorg/apache/tika/pipes/async/AsyncEmitter;

    .line 108
    .line 109
    invoke-static {}, Lorg/apache/tika/fork/a;->m()Ljava/time/Instant;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    iput-object v1, v0, Lorg/apache/tika/pipes/async/AsyncEmitter;->lastEmitted:Ljava/time/Instant;

    .line 114
    .line 115
    return-void
.end method

.method private static synthetic lambda$add$0(Ljava/lang/String;)Ljava/util/List;
    .locals 0

    .line 1
    new-instance p0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method private tryToEmit(Lorg/apache/tika/pipes/emitter/Emitter;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/tika/pipes/emitter/Emitter;",
            "Ljava/util/List<",
            "Lorg/apache/tika/pipes/emitter/EmitData;",
            ">;)V"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-interface {p1, p2}, Lorg/apache/tika/pipes/emitter/Emitter;->emit(Ljava/util/List;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lorg/apache/tika/pipes/emitter/TikaEmitterException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catch_0
    move-exception p2

    .line 6
    goto :goto_0

    .line 7
    :catch_1
    move-exception p2

    .line 8
    :goto_0
    invoke-static {}, Lorg/apache/tika/pipes/async/AsyncEmitter;->b()LF2/b;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p2}, Lorg/apache/tika/utils/ExceptionUtils;->getStackTrace(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    const-string v1, "emitter class ({}): {}"

    .line 21
    .line 22
    invoke-interface {v0, p1, p2, v1}, LF2/b;->r(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public add(Lorg/apache/tika/pipes/emitter/EmitData;)V
    .locals 6

    .line 1
    iget v0, p0, Lorg/apache/tika/pipes/async/AsyncEmitter$EmitDataCache;->size:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lorg/apache/tika/pipes/async/AsyncEmitter$EmitDataCache;->size:I

    .line 6
    .line 7
    invoke-virtual {p1}, Lorg/apache/tika/pipes/emitter/EmitData;->getEstimatedSizeBytes()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    iget-wide v2, p0, Lorg/apache/tika/pipes/async/AsyncEmitter$EmitDataCache;->estimatedSize:J

    .line 12
    .line 13
    add-long/2addr v2, v0

    .line 14
    iget-wide v4, p0, Lorg/apache/tika/pipes/async/AsyncEmitter$EmitDataCache;->maxBytes:J

    .line 15
    .line 16
    cmp-long v2, v2, v4

    .line 17
    .line 18
    if-lez v2, :cond_0

    .line 19
    .line 20
    invoke-static {}, Lorg/apache/tika/pipes/async/AsyncEmitter;->b()LF2/b;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    iget-wide v3, p0, Lorg/apache/tika/pipes/async/AsyncEmitter$EmitDataCache;->estimatedSize:J

    .line 25
    .line 26
    add-long/2addr v3, v0

    .line 27
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    iget-wide v4, p0, Lorg/apache/tika/pipes/async/AsyncEmitter$EmitDataCache;->maxBytes:J

    .line 32
    .line 33
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    const-string v5, "estimated size ({}) > maxBytes({}), going to emitAll"

    .line 38
    .line 39
    invoke-interface {v2, v3, v4, v5}, LF2/b;->w(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-direct {p0}, Lorg/apache/tika/pipes/async/AsyncEmitter$EmitDataCache;->emitAll()V

    .line 43
    .line 44
    .line 45
    :cond_0
    iget-object v2, p0, Lorg/apache/tika/pipes/async/AsyncEmitter$EmitDataCache;->map:Ljava/util/Map;

    .line 46
    .line 47
    invoke-virtual {p1}, Lorg/apache/tika/pipes/emitter/EmitData;->getEmitKey()Lorg/apache/tika/pipes/emitter/EmitKey;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v3}, Lorg/apache/tika/pipes/emitter/EmitKey;->getEmitterName()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    new-instance v4, Lorg/apache/tika/pipes/async/a;

    .line 56
    .line 57
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-interface {v2, v3, v4}, Ljava/util/Map;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, Ljava/util/List;

    .line 65
    .line 66
    invoke-virtual {p0, v0, v1}, Lorg/apache/tika/pipes/async/AsyncEmitter$EmitDataCache;->updateEstimatedSize(J)V

    .line 67
    .line 68
    .line 69
    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public updateEstimatedSize(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lorg/apache/tika/pipes/async/AsyncEmitter$EmitDataCache;->estimatedSize:J

    .line 2
    .line 3
    add-long/2addr v0, p1

    .line 4
    iput-wide v0, p0, Lorg/apache/tika/pipes/async/AsyncEmitter$EmitDataCache;->estimatedSize:J

    .line 5
    .line 6
    return-void
.end method

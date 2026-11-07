.class public Lorg/apache/tika/pipes/async/AsyncEmitter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/tika/pipes/async/AsyncEmitter$EmitDataCache;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# static fields
.field static final EMITTER_FUTURE_CODE:I = 0x2

.field static final EMIT_DATA_STOP_SEMAPHORE:Lorg/apache/tika/pipes/emitter/EmitData;

.field private static final LOG:LF2/b;


# instance fields
.field private final asyncConfig:Lorg/apache/tika/pipes/async/AsyncConfig;

.field private final emitDataQueue:Ljava/util/concurrent/ArrayBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ArrayBlockingQueue<",
            "Lorg/apache/tika/pipes/emitter/EmitData;",
            ">;"
        }
    .end annotation
.end field

.field private final emitterManager:Lorg/apache/tika/pipes/emitter/EmitterManager;

.field lastEmitted:Ljava/time/Instant;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/apache/tika/pipes/emitter/EmitData;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, v1, v1}, Lorg/apache/tika/pipes/emitter/EmitData;-><init>(Lorg/apache/tika/pipes/emitter/EmitKey;Ljava/util/List;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/apache/tika/pipes/async/AsyncEmitter;->EMIT_DATA_STOP_SEMAPHORE:Lorg/apache/tika/pipes/emitter/EmitData;

    .line 8
    .line 9
    const-class v0, Lorg/apache/tika/pipes/async/AsyncEmitter;

    .line 10
    .line 11
    invoke-static {v0}, LF2/d;->b(Ljava/lang/Class;)LF2/b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lorg/apache/tika/pipes/async/AsyncEmitter;->LOG:LF2/b;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Lorg/apache/tika/pipes/async/AsyncConfig;Ljava/util/concurrent/ArrayBlockingQueue;Lorg/apache/tika/pipes/emitter/EmitterManager;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/tika/pipes/async/AsyncConfig;",
            "Ljava/util/concurrent/ArrayBlockingQueue<",
            "Lorg/apache/tika/pipes/emitter/EmitData;",
            ">;",
            "Lorg/apache/tika/pipes/emitter/EmitterManager;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lorg/apache/tika/fork/a;->m()Ljava/time/Instant;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lorg/apache/tika/pipes/async/AsyncEmitter;->lastEmitted:Ljava/time/Instant;

    .line 9
    .line 10
    iput-object p1, p0, Lorg/apache/tika/pipes/async/AsyncEmitter;->asyncConfig:Lorg/apache/tika/pipes/async/AsyncConfig;

    .line 11
    .line 12
    iput-object p2, p0, Lorg/apache/tika/pipes/async/AsyncEmitter;->emitDataQueue:Ljava/util/concurrent/ArrayBlockingQueue;

    .line 13
    .line 14
    iput-object p3, p0, Lorg/apache/tika/pipes/async/AsyncEmitter;->emitterManager:Lorg/apache/tika/pipes/emitter/EmitterManager;

    .line 15
    .line 16
    return-void
.end method

.method public static bridge synthetic a(Lorg/apache/tika/pipes/async/AsyncEmitter;)Lorg/apache/tika/pipes/emitter/EmitterManager;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/tika/pipes/async/AsyncEmitter;->emitterManager:Lorg/apache/tika/pipes/emitter/EmitterManager;

    return-object p0
.end method

.method public static bridge synthetic b()LF2/b;
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/tika/pipes/async/AsyncEmitter;->LOG:LF2/b;

    return-object v0
.end method


# virtual methods
.method public call()Ljava/lang/Integer;
    .locals 6

    .line 2
    new-instance v0, Lorg/apache/tika/pipes/async/AsyncEmitter$EmitDataCache;

    iget-object v1, p0, Lorg/apache/tika/pipes/async/AsyncEmitter;->asyncConfig:Lorg/apache/tika/pipes/async/AsyncConfig;

    invoke-virtual {v1}, Lorg/apache/tika/pipes/async/AsyncConfig;->getEmitMaxEstimatedBytes()J

    move-result-wide v1

    invoke-direct {v0, p0, v1, v2}, Lorg/apache/tika/pipes/async/AsyncEmitter$EmitDataCache;-><init>(Lorg/apache/tika/pipes/async/AsyncEmitter;J)V

    .line 3
    :cond_0
    :goto_0
    iget-object v1, p0, Lorg/apache/tika/pipes/async/AsyncEmitter;->emitDataQueue:Ljava/util/concurrent/ArrayBlockingQueue;

    const-wide/16 v2, 0x1f4

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v2, v3, v4}, Ljava/util/concurrent/ArrayBlockingQueue;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/tika/pipes/emitter/EmitData;

    .line 4
    sget-object v2, Lorg/apache/tika/pipes/async/AsyncEmitter;->EMIT_DATA_STOP_SEMAPHORE:Lorg/apache/tika/pipes/emitter/EmitData;

    if-ne v1, v2, :cond_1

    .line 5
    invoke-static {v0}, Lorg/apache/tika/pipes/async/AsyncEmitter$EmitDataCache;->b(Lorg/apache/tika/pipes/async/AsyncEmitter$EmitDataCache;)V

    const/4 v0, 0x2

    .line 6
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_1
    if-eqz v1, :cond_2

    .line 7
    invoke-virtual {v0, v1}, Lorg/apache/tika/pipes/async/AsyncEmitter$EmitDataCache;->add(Lorg/apache/tika/pipes/emitter/EmitData;)V

    goto :goto_1

    .line 8
    :cond_2
    sget-object v1, Lorg/apache/tika/pipes/async/AsyncEmitter;->LOG:LF2/b;

    const-string v2, "Nothing on the async queue"

    invoke-interface {v1, v2}, LF2/b;->n(Ljava/lang/String;)V

    .line 9
    :goto_1
    sget-object v1, Lorg/apache/tika/pipes/async/AsyncEmitter;->LOG:LF2/b;

    iget-wide v2, v0, Lorg/apache/tika/pipes/async/AsyncEmitter$EmitDataCache;->estimatedSize:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iget v3, v0, Lorg/apache/tika/pipes/async/AsyncEmitter$EmitDataCache;->size:I

    .line 10
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 11
    const-string v4, "cache size: ({}) bytes and extract count: {}"

    invoke-interface {v1, v2, v3, v4}, LF2/b;->w(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-static {}, Lorg/apache/tika/fork/a;->p()Ljava/time/temporal/ChronoUnit;

    iget-object v2, p0, Lorg/apache/tika/pipes/async/AsyncEmitter;->lastEmitted:Ljava/time/Instant;

    invoke-static {}, Lorg/apache/tika/fork/a;->m()Ljava/time/Instant;

    move-result-object v3

    invoke-static {v2, v3}, Lorg/apache/tika/fork/a;->b(Ljava/time/temporal/Temporal;Ljava/time/Instant;)J

    move-result-wide v2

    .line 13
    iget-object v4, p0, Lorg/apache/tika/pipes/async/AsyncEmitter;->asyncConfig:Lorg/apache/tika/pipes/async/AsyncConfig;

    invoke-virtual {v4}, Lorg/apache/tika/pipes/async/AsyncConfig;->getEmitWithinMillis()J

    move-result-wide v4

    cmp-long v4, v2, v4

    if-lez v4, :cond_0

    .line 14
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iget-object v3, p0, Lorg/apache/tika/pipes/async/AsyncEmitter;->asyncConfig:Lorg/apache/tika/pipes/async/AsyncConfig;

    invoke-virtual {v3}, Lorg/apache/tika/pipes/async/AsyncConfig;->getEmitWithinMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "{} elapsed > {}, going to emitAll"

    invoke-interface {v1, v2, v3, v4}, LF2/b;->w(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-static {v0}, Lorg/apache/tika/pipes/async/AsyncEmitter$EmitDataCache;->b(Lorg/apache/tika/pipes/async/AsyncEmitter$EmitDataCache;)V

    goto :goto_0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/apache/tika/pipes/async/AsyncEmitter;->call()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

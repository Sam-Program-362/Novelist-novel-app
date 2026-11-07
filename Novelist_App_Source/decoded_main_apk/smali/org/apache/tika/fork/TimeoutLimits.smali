.class Lorg/apache/tika/fork/TimeoutLimits;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final parseTimeoutMS:J

.field private final pulseMS:J

.field private final waitTimeoutMS:J


# direct methods
.method public constructor <init>(JJJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lorg/apache/tika/fork/TimeoutLimits;->pulseMS:J

    .line 5
    .line 6
    iput-wide p3, p0, Lorg/apache/tika/fork/TimeoutLimits;->parseTimeoutMS:J

    .line 7
    .line 8
    iput-wide p5, p0, Lorg/apache/tika/fork/TimeoutLimits;->waitTimeoutMS:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public getParseTimeoutMS()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lorg/apache/tika/fork/TimeoutLimits;->parseTimeoutMS:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getPulseMS()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lorg/apache/tika/fork/TimeoutLimits;->pulseMS:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getWaitTimeoutMS()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lorg/apache/tika/fork/TimeoutLimits;->waitTimeoutMS:J

    .line 2
    .line 3
    return-wide v0
.end method

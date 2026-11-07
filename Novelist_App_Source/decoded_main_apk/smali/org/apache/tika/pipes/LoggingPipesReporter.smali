.class public Lorg/apache/tika/pipes/LoggingPipesReporter;
.super Lorg/apache/tika/pipes/PipesReporter;
.source "SourceFile"


# instance fields
.field LOGGER:LF2/b;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/apache/tika/pipes/PipesReporter;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, Lorg/apache/tika/pipes/LoggingPipesReporter;

    .line 5
    .line 6
    invoke-static {v0}, LF2/d;->b(Ljava/lang/Class;)LF2/b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lorg/apache/tika/pipes/LoggingPipesReporter;->LOGGER:LF2/b;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public error(Ljava/lang/String;)V
    .locals 2

    .line 2
    iget-object v0, p0, Lorg/apache/tika/pipes/LoggingPipesReporter;->LOGGER:LF2/b;

    const-string v1, "error {}"

    invoke-interface {v0, p1, v1}, LF2/b;->a(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public error(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/LoggingPipesReporter;->LOGGER:LF2/b;

    const-string v1, "pipes error"

    invoke-interface {v0, v1, p1}, LF2/b;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public report(Lorg/apache/tika/pipes/FetchEmitTuple;Lorg/apache/tika/pipes/PipesResult;J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/LoggingPipesReporter;->LOGGER:LF2/b;

    .line 2
    .line 3
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string p2, "{} {} {}"

    .line 12
    .line 13
    invoke-interface {v0, p2, p1}, LF2/b;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

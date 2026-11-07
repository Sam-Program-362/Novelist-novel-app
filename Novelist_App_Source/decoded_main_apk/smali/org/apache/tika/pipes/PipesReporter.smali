.class public abstract Lorg/apache/tika/pipes/PipesReporter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final NO_OP_REPORTER:Lorg/apache/tika/pipes/PipesReporter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/tika/pipes/PipesReporter$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/apache/tika/pipes/PipesReporter$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lorg/apache/tika/pipes/PipesReporter;->NO_OP_REPORTER:Lorg/apache/tika/pipes/PipesReporter;

    .line 7
    .line 8
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


# virtual methods
.method public close()V
    .locals 0

    return-void
.end method

.method public abstract error(Ljava/lang/String;)V
.end method

.method public abstract error(Ljava/lang/Throwable;)V
.end method

.method public abstract report(Lorg/apache/tika/pipes/FetchEmitTuple;Lorg/apache/tika/pipes/PipesResult;J)V
.end method

.method public report(Lorg/apache/tika/pipes/pipesiterator/TotalCountResult;)V
    .locals 0

    .line 1
    return-void
.end method

.method public supportsTotalCount()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

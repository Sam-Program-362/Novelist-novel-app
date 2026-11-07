.class public Lorg/apache/tika/pipes/HandlerConfig;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;
    }
.end annotation


# static fields
.field public static final DEFAULT_HANDLER_CONFIG:Lorg/apache/tika/pipes/HandlerConfig;

.field private static final serialVersionUID:J = -0x35976799b9d89314L


# instance fields
.field maxEmbeddedResources:I

.field parseMode:Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;

.field throwOnWriteLimitReached:Z

.field private type:Lorg/apache/tika/sax/BasicContentHandlerFactory$HANDLER_TYPE;

.field writeLimit:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lorg/apache/tika/pipes/HandlerConfig;

    .line 2
    .line 3
    sget-object v1, Lorg/apache/tika/sax/BasicContentHandlerFactory$HANDLER_TYPE;->TEXT:Lorg/apache/tika/sax/BasicContentHandlerFactory$HANDLER_TYPE;

    .line 4
    .line 5
    sget-object v2, Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;->RMETA:Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;

    .line 6
    .line 7
    const/4 v4, -0x1

    .line 8
    const/4 v5, 0x1

    .line 9
    const/4 v3, -0x1

    .line 10
    invoke-direct/range {v0 .. v5}, Lorg/apache/tika/pipes/HandlerConfig;-><init>(Lorg/apache/tika/sax/BasicContentHandlerFactory$HANDLER_TYPE;Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;IIZ)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lorg/apache/tika/pipes/HandlerConfig;->DEFAULT_HANDLER_CONFIG:Lorg/apache/tika/pipes/HandlerConfig;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Lorg/apache/tika/sax/BasicContentHandlerFactory$HANDLER_TYPE;->TEXT:Lorg/apache/tika/sax/BasicContentHandlerFactory$HANDLER_TYPE;

    iput-object v0, p0, Lorg/apache/tika/pipes/HandlerConfig;->type:Lorg/apache/tika/sax/BasicContentHandlerFactory$HANDLER_TYPE;

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Lorg/apache/tika/pipes/HandlerConfig;->writeLimit:I

    .line 4
    iput v0, p0, Lorg/apache/tika/pipes/HandlerConfig;->maxEmbeddedResources:I

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lorg/apache/tika/pipes/HandlerConfig;->throwOnWriteLimitReached:Z

    .line 6
    sget-object v0, Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;->RMETA:Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;

    iput-object v0, p0, Lorg/apache/tika/pipes/HandlerConfig;->parseMode:Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;

    return-void
.end method

.method public constructor <init>(Lorg/apache/tika/sax/BasicContentHandlerFactory$HANDLER_TYPE;Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;IIZ)V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    sget-object v0, Lorg/apache/tika/sax/BasicContentHandlerFactory$HANDLER_TYPE;->TEXT:Lorg/apache/tika/sax/BasicContentHandlerFactory$HANDLER_TYPE;

    iput-object v0, p0, Lorg/apache/tika/pipes/HandlerConfig;->type:Lorg/apache/tika/sax/BasicContentHandlerFactory$HANDLER_TYPE;

    const/4 v0, -0x1

    .line 9
    iput v0, p0, Lorg/apache/tika/pipes/HandlerConfig;->writeLimit:I

    .line 10
    iput v0, p0, Lorg/apache/tika/pipes/HandlerConfig;->maxEmbeddedResources:I

    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lorg/apache/tika/pipes/HandlerConfig;->throwOnWriteLimitReached:Z

    .line 12
    sget-object v0, Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;->RMETA:Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;

    .line 13
    iput-object p1, p0, Lorg/apache/tika/pipes/HandlerConfig;->type:Lorg/apache/tika/sax/BasicContentHandlerFactory$HANDLER_TYPE;

    .line 14
    iput-object p2, p0, Lorg/apache/tika/pipes/HandlerConfig;->parseMode:Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;

    .line 15
    iput p3, p0, Lorg/apache/tika/pipes/HandlerConfig;->writeLimit:I

    .line 16
    iput p4, p0, Lorg/apache/tika/pipes/HandlerConfig;->maxEmbeddedResources:I

    .line 17
    iput-boolean p5, p0, Lorg/apache/tika/pipes/HandlerConfig;->throwOnWriteLimitReached:Z

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    if-eq v2, v3, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    check-cast p1, Lorg/apache/tika/pipes/HandlerConfig;

    .line 20
    .line 21
    iget v2, p0, Lorg/apache/tika/pipes/HandlerConfig;->writeLimit:I

    .line 22
    .line 23
    iget v3, p1, Lorg/apache/tika/pipes/HandlerConfig;->writeLimit:I

    .line 24
    .line 25
    if-ne v2, v3, :cond_2

    .line 26
    .line 27
    iget v2, p0, Lorg/apache/tika/pipes/HandlerConfig;->maxEmbeddedResources:I

    .line 28
    .line 29
    iget v3, p1, Lorg/apache/tika/pipes/HandlerConfig;->maxEmbeddedResources:I

    .line 30
    .line 31
    if-ne v2, v3, :cond_2

    .line 32
    .line 33
    iget-boolean v2, p0, Lorg/apache/tika/pipes/HandlerConfig;->throwOnWriteLimitReached:Z

    .line 34
    .line 35
    iget-boolean v3, p1, Lorg/apache/tika/pipes/HandlerConfig;->throwOnWriteLimitReached:Z

    .line 36
    .line 37
    if-ne v2, v3, :cond_2

    .line 38
    .line 39
    iget-object v2, p0, Lorg/apache/tika/pipes/HandlerConfig;->type:Lorg/apache/tika/sax/BasicContentHandlerFactory$HANDLER_TYPE;

    .line 40
    .line 41
    iget-object v3, p1, Lorg/apache/tika/pipes/HandlerConfig;->type:Lorg/apache/tika/sax/BasicContentHandlerFactory$HANDLER_TYPE;

    .line 42
    .line 43
    if-ne v2, v3, :cond_2

    .line 44
    .line 45
    iget-object v2, p0, Lorg/apache/tika/pipes/HandlerConfig;->parseMode:Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;

    .line 46
    .line 47
    iget-object p1, p1, Lorg/apache/tika/pipes/HandlerConfig;->parseMode:Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;

    .line 48
    .line 49
    if-ne v2, p1, :cond_2

    .line 50
    .line 51
    return v0

    .line 52
    :cond_2
    :goto_0
    return v1
.end method

.method public getMaxEmbeddedResources()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/tika/pipes/HandlerConfig;->maxEmbeddedResources:I

    .line 2
    .line 3
    return v0
.end method

.method public getParseMode()Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/HandlerConfig;->parseMode:Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;

    .line 2
    .line 3
    return-object v0
.end method

.method public getType()Lorg/apache/tika/sax/BasicContentHandlerFactory$HANDLER_TYPE;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/HandlerConfig;->type:Lorg/apache/tika/sax/BasicContentHandlerFactory$HANDLER_TYPE;

    .line 2
    .line 3
    return-object v0
.end method

.method public getWriteLimit()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/tika/pipes/HandlerConfig;->writeLimit:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/HandlerConfig;->type:Lorg/apache/tika/sax/BasicContentHandlerFactory$HANDLER_TYPE;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget v1, p0, Lorg/apache/tika/pipes/HandlerConfig;->writeLimit:I

    .line 10
    .line 11
    add-int/2addr v0, v1

    .line 12
    mul-int/lit8 v0, v0, 0x1f

    .line 13
    .line 14
    iget v1, p0, Lorg/apache/tika/pipes/HandlerConfig;->maxEmbeddedResources:I

    .line 15
    .line 16
    add-int/2addr v0, v1

    .line 17
    mul-int/lit8 v0, v0, 0x1f

    .line 18
    .line 19
    iget-boolean v1, p0, Lorg/apache/tika/pipes/HandlerConfig;->throwOnWriteLimitReached:Z

    .line 20
    .line 21
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    add-int/2addr v1, v0

    .line 26
    mul-int/lit8 v1, v1, 0x1f

    .line 27
    .line 28
    iget-object v0, p0, Lorg/apache/tika/pipes/HandlerConfig;->parseMode:Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;

    .line 29
    .line 30
    invoke-static {v0}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    add-int/2addr v0, v1

    .line 35
    return v0
.end method

.method public isThrowOnWriteLimitReached()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/tika/pipes/HandlerConfig;->throwOnWriteLimitReached:Z

    .line 2
    .line 3
    return v0
.end method

.method public setMaxEmbeddedResources(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/apache/tika/pipes/HandlerConfig;->maxEmbeddedResources:I

    .line 2
    .line 3
    return-void
.end method

.method public setParseMode(Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-static {p1}, Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;->parseMode(Ljava/lang/String;)Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;

    move-result-object p1

    iput-object p1, p0, Lorg/apache/tika/pipes/HandlerConfig;->parseMode:Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;

    return-void
.end method

.method public setParseMode(Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/tika/pipes/HandlerConfig;->parseMode:Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;

    return-void
.end method

.method public setThrowOnWriteLimitReached(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/apache/tika/pipes/HandlerConfig;->throwOnWriteLimitReached:Z

    .line 2
    .line 3
    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-static {p1}, Lorg/apache/tika/sax/BasicContentHandlerFactory$HANDLER_TYPE;->valueOf(Ljava/lang/String;)Lorg/apache/tika/sax/BasicContentHandlerFactory$HANDLER_TYPE;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/apache/tika/pipes/HandlerConfig;->setType(Lorg/apache/tika/sax/BasicContentHandlerFactory$HANDLER_TYPE;)V

    return-void
.end method

.method public setType(Lorg/apache/tika/sax/BasicContentHandlerFactory$HANDLER_TYPE;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/tika/pipes/HandlerConfig;->type:Lorg/apache/tika/sax/BasicContentHandlerFactory$HANDLER_TYPE;

    return-void
.end method

.method public setWriteLimit(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/apache/tika/pipes/HandlerConfig;->writeLimit:I

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/HandlerConfig;->type:Lorg/apache/tika/sax/BasicContentHandlerFactory$HANDLER_TYPE;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, Lorg/apache/tika/pipes/HandlerConfig;->writeLimit:I

    .line 8
    .line 9
    iget v2, p0, Lorg/apache/tika/pipes/HandlerConfig;->maxEmbeddedResources:I

    .line 10
    .line 11
    iget-boolean v3, p0, Lorg/apache/tika/pipes/HandlerConfig;->throwOnWriteLimitReached:Z

    .line 12
    .line 13
    iget-object v4, p0, Lorg/apache/tika/pipes/HandlerConfig;->parseMode:Lorg/apache/tika/pipes/HandlerConfig$PARSE_MODE;

    .line 14
    .line 15
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    new-instance v5, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v6, "HandlerConfig{type="

    .line 22
    .line 23
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v0, ", writeLimit="

    .line 30
    .line 31
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v0, ", maxEmbeddedResources="

    .line 38
    .line 39
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v0, ", throwOnWriteLimitReached="

    .line 46
    .line 47
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v0, ", parseMode="

    .line 54
    .line 55
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v0, "}"

    .line 59
    .line 60
    invoke-static {v5, v4, v0}, LB1/e;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    return-object v0
.end method

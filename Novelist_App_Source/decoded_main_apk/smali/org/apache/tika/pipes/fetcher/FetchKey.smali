.class public Lorg/apache/tika/pipes/fetcher/FetchKey;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = -0x35976799b9d89314L


# instance fields
.field private fetchKey:Ljava/lang/String;

.field private fetcherName:Ljava/lang/String;

.field private rangeEnd:J

.field private rangeStart:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 2
    iput-wide v0, p0, Lorg/apache/tika/pipes/fetcher/FetchKey;->rangeStart:J

    .line 3
    iput-wide v0, p0, Lorg/apache/tika/pipes/fetcher/FetchKey;->rangeEnd:J

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    const-wide/16 v3, -0x1

    const-wide/16 v5, -0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 4
    invoke-direct/range {v0 .. v6}, Lorg/apache/tika/pipes/fetcher/FetchKey;-><init>(Ljava/lang/String;Ljava/lang/String;JJ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JJ)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lorg/apache/tika/pipes/fetcher/FetchKey;->fetcherName:Ljava/lang/String;

    .line 7
    iput-object p2, p0, Lorg/apache/tika/pipes/fetcher/FetchKey;->fetchKey:Ljava/lang/String;

    .line 8
    iput-wide p3, p0, Lorg/apache/tika/pipes/fetcher/FetchKey;->rangeStart:J

    .line 9
    iput-wide p5, p0, Lorg/apache/tika/pipes/fetcher/FetchKey;->rangeEnd:J

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 6

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
    check-cast p1, Lorg/apache/tika/pipes/fetcher/FetchKey;

    .line 20
    .line 21
    iget-wide v2, p0, Lorg/apache/tika/pipes/fetcher/FetchKey;->rangeStart:J

    .line 22
    .line 23
    iget-wide v4, p1, Lorg/apache/tika/pipes/fetcher/FetchKey;->rangeStart:J

    .line 24
    .line 25
    cmp-long v2, v2, v4

    .line 26
    .line 27
    if-nez v2, :cond_2

    .line 28
    .line 29
    iget-wide v2, p0, Lorg/apache/tika/pipes/fetcher/FetchKey;->rangeEnd:J

    .line 30
    .line 31
    iget-wide v4, p1, Lorg/apache/tika/pipes/fetcher/FetchKey;->rangeEnd:J

    .line 32
    .line 33
    cmp-long v2, v2, v4

    .line 34
    .line 35
    if-nez v2, :cond_2

    .line 36
    .line 37
    iget-object v2, p0, Lorg/apache/tika/pipes/fetcher/FetchKey;->fetcherName:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v3, p1, Lorg/apache/tika/pipes/fetcher/FetchKey;->fetcherName:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    iget-object v2, p0, Lorg/apache/tika/pipes/fetcher/FetchKey;->fetchKey:Ljava/lang/String;

    .line 48
    .line 49
    iget-object p1, p1, Lorg/apache/tika/pipes/fetcher/FetchKey;->fetchKey:Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {v2, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_2

    .line 56
    .line 57
    return v0

    .line 58
    :cond_2
    :goto_0
    return v1
.end method

.method public getFetchKey()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/fetcher/FetchKey;->fetchKey:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getFetcherName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/fetcher/FetchKey;->fetcherName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRangeEnd()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lorg/apache/tika/pipes/fetcher/FetchKey;->rangeEnd:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getRangeStart()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lorg/apache/tika/pipes/fetcher/FetchKey;->rangeStart:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public hasRange()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lorg/apache/tika/pipes/fetcher/FetchKey;->rangeStart:J

    .line 2
    .line 3
    const-wide/16 v2, -0x1

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    iget-wide v0, p0, Lorg/apache/tika/pipes/fetcher/FetchKey;->rangeEnd:J

    .line 10
    .line 11
    cmp-long v0, v0, v2

    .line 12
    .line 13
    if-lez v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/fetcher/FetchKey;->fetcherName:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/apache/tika/pipes/fetcher/FetchKey;->fetchKey:Ljava/lang/String;

    .line 4
    .line 5
    iget-wide v2, p0, Lorg/apache/tika/pipes/fetcher/FetchKey;->rangeStart:J

    .line 6
    .line 7
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-wide v3, p0, Lorg/apache/tika/pipes/fetcher/FetchKey;->rangeEnd:J

    .line 12
    .line 13
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/fetcher/FetchKey;->fetcherName:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/apache/tika/pipes/fetcher/FetchKey;->fetchKey:Ljava/lang/String;

    .line 4
    .line 5
    iget-wide v2, p0, Lorg/apache/tika/pipes/fetcher/FetchKey;->rangeStart:J

    .line 6
    .line 7
    iget-wide v4, p0, Lorg/apache/tika/pipes/fetcher/FetchKey;->rangeEnd:J

    .line 8
    .line 9
    new-instance v6, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v7, "FetchKey{fetcherName=\'"

    .line 12
    .line 13
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v0, "\', fetchKey=\'"

    .line 20
    .line 21
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v0, "\', rangeStart="

    .line 28
    .line 29
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v6, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v0, ", rangeEnd="

    .line 36
    .line 37
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v0, "}"

    .line 44
    .line 45
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    return-object v0
.end method

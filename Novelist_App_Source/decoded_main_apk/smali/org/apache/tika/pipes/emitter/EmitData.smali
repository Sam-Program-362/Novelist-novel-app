.class public Lorg/apache/tika/pipes/emitter/EmitData;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = -0x35976799b9d89314L


# instance fields
.field private final containerStackTrace:Ljava/lang/String;

.field private final emitKey:Lorg/apache/tika/pipes/emitter/EmitKey;

.field private final metadataList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/apache/tika/metadata/Metadata;",
            ">;"
        }
    .end annotation
.end field

.field private parseContext:Lorg/apache/tika/parser/ParseContext;


# direct methods
.method public constructor <init>(Lorg/apache/tika/pipes/emitter/EmitKey;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/tika/pipes/emitter/EmitKey;",
            "Ljava/util/List<",
            "Lorg/apache/tika/metadata/Metadata;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, ""

    invoke-direct {p0, p1, p2, v0}, Lorg/apache/tika/pipes/emitter/EmitData;-><init>(Lorg/apache/tika/pipes/emitter/EmitKey;Ljava/util/List;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lorg/apache/tika/pipes/emitter/EmitKey;Ljava/util/List;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/tika/pipes/emitter/EmitKey;",
            "Ljava/util/List<",
            "Lorg/apache/tika/metadata/Metadata;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 2
    new-instance v0, Lorg/apache/tika/parser/ParseContext;

    invoke-direct {v0}, Lorg/apache/tika/parser/ParseContext;-><init>()V

    invoke-direct {p0, p1, p2, p3, v0}, Lorg/apache/tika/pipes/emitter/EmitData;-><init>(Lorg/apache/tika/pipes/emitter/EmitKey;Ljava/util/List;Ljava/lang/String;Lorg/apache/tika/parser/ParseContext;)V

    return-void
.end method

.method public constructor <init>(Lorg/apache/tika/pipes/emitter/EmitKey;Ljava/util/List;Ljava/lang/String;Lorg/apache/tika/parser/ParseContext;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/tika/pipes/emitter/EmitKey;",
            "Ljava/util/List<",
            "Lorg/apache/tika/metadata/Metadata;",
            ">;",
            "Ljava/lang/String;",
            "Lorg/apache/tika/parser/ParseContext;",
            ")V"
        }
    .end annotation

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lorg/apache/tika/pipes/emitter/EmitData;->parseContext:Lorg/apache/tika/parser/ParseContext;

    .line 5
    iput-object p1, p0, Lorg/apache/tika/pipes/emitter/EmitData;->emitKey:Lorg/apache/tika/pipes/emitter/EmitKey;

    .line 6
    iput-object p2, p0, Lorg/apache/tika/pipes/emitter/EmitData;->metadataList:Ljava/util/List;

    if-nez p3, :cond_0

    .line 7
    const-string p3, ""

    .line 8
    :cond_0
    iput-object p3, p0, Lorg/apache/tika/pipes/emitter/EmitData;->containerStackTrace:Ljava/lang/String;

    .line 9
    iput-object p4, p0, Lorg/apache/tika/pipes/emitter/EmitData;->parseContext:Lorg/apache/tika/parser/ParseContext;

    return-void
.end method

.method private static estimateSizeInBytes(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)J
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lorg/apache/tika/metadata/Metadata;",
            ">;",
            "Ljava/lang/String;",
            ")J"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    mul-int/lit8 p0, p0, 0x2

    .line 6
    .line 7
    add-int/lit8 p0, p0, 0x24

    .line 8
    .line 9
    int-to-long v0, p0

    .line 10
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    mul-int/lit8 p0, p0, 0x2

    .line 15
    .line 16
    add-int/lit8 p0, p0, 0x24

    .line 17
    .line 18
    int-to-long v2, p0

    .line 19
    add-long/2addr v0, v2

    .line 20
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_2

    .line 29
    .line 30
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Lorg/apache/tika/metadata/Metadata;

    .line 35
    .line 36
    invoke-virtual {p1}, Lorg/apache/tika/metadata/Metadata;->names()[Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    array-length v2, p2

    .line 41
    const/4 v3, 0x0

    .line 42
    move v4, v3

    .line 43
    :goto_0
    if-ge v4, v2, :cond_0

    .line 44
    .line 45
    aget-object v5, p2, v4

    .line 46
    .line 47
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    mul-int/lit8 v6, v6, 0x2

    .line 52
    .line 53
    add-int/lit8 v6, v6, 0x24

    .line 54
    .line 55
    int-to-long v6, v6

    .line 56
    add-long/2addr v0, v6

    .line 57
    invoke-virtual {p1, v5}, Lorg/apache/tika/metadata/Metadata;->getValues(Ljava/lang/String;)[Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    array-length v6, v5

    .line 62
    move v7, v3

    .line 63
    :goto_1
    if-ge v7, v6, :cond_1

    .line 64
    .line 65
    aget-object v8, v5, v7

    .line 66
    .line 67
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    mul-int/lit8 v8, v8, 0x2

    .line 72
    .line 73
    add-int/lit8 v8, v8, 0x24

    .line 74
    .line 75
    int-to-long v8, v8

    .line 76
    add-long/2addr v0, v8

    .line 77
    add-int/lit8 v7, v7, 0x1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    return-wide v0
.end method


# virtual methods
.method public getContainerStackTrace()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/emitter/EmitData;->containerStackTrace:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getEmitKey()Lorg/apache/tika/pipes/emitter/EmitKey;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/emitter/EmitData;->emitKey:Lorg/apache/tika/pipes/emitter/EmitKey;

    .line 2
    .line 3
    return-object v0
.end method

.method public getEstimatedSizeBytes()J
    .locals 3

    .line 1
    invoke-virtual {p0}, Lorg/apache/tika/pipes/emitter/EmitData;->getEmitKey()Lorg/apache/tika/pipes/emitter/EmitKey;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lorg/apache/tika/pipes/emitter/EmitKey;->getEmitKey()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Lorg/apache/tika/pipes/emitter/EmitData;->getMetadataList()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Lorg/apache/tika/pipes/emitter/EmitData;->containerStackTrace:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0, v1, v2}, Lorg/apache/tika/pipes/emitter/EmitData;->estimateSizeInBytes(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    return-wide v0
.end method

.method public getMetadataList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/apache/tika/metadata/Metadata;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/emitter/EmitData;->metadataList:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getParseContext()Lorg/apache/tika/parser/ParseContext;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/emitter/EmitData;->parseContext:Lorg/apache/tika/parser/ParseContext;

    .line 2
    .line 3
    return-object v0
.end method

.method public setParseContext(Lorg/apache/tika/parser/ParseContext;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/tika/pipes/emitter/EmitData;->parseContext:Lorg/apache/tika/parser/ParseContext;

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/emitter/EmitData;->emitKey:Lorg/apache/tika/pipes/emitter/EmitKey;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lorg/apache/tika/pipes/emitter/EmitData;->metadataList:Ljava/util/List;

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Lorg/apache/tika/pipes/emitter/EmitData;->containerStackTrace:Ljava/lang/String;

    .line 14
    .line 15
    new-instance v3, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v4, "EmitData{emitKey="

    .line 18
    .line 19
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v0, ", metadataList="

    .line 26
    .line 27
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v0, ", containerStackTrace=\'"

    .line 34
    .line 35
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v0, "\'}"

    .line 39
    .line 40
    invoke-static {v3, v2, v0}, LB1/e;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    return-object v0
.end method

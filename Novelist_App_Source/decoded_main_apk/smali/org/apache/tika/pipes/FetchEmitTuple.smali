.class public Lorg/apache/tika/pipes/FetchEmitTuple;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/tika/pipes/FetchEmitTuple$ON_PARSE_EXCEPTION;
    }
.end annotation


# static fields
.field public static final DEFAULT_ON_PARSE_EXCEPTION:Lorg/apache/tika/pipes/FetchEmitTuple$ON_PARSE_EXCEPTION;


# instance fields
.field private embeddedDocumentBytesConfig:Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;

.field private emitKey:Lorg/apache/tika/pipes/emitter/EmitKey;

.field private final fetchKey:Lorg/apache/tika/pipes/fetcher/FetchKey;

.field private final id:Ljava/lang/String;

.field private final metadata:Lorg/apache/tika/metadata/Metadata;

.field private final onParseException:Lorg/apache/tika/pipes/FetchEmitTuple$ON_PARSE_EXCEPTION;

.field private final parseContext:Lorg/apache/tika/parser/ParseContext;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/tika/pipes/FetchEmitTuple$ON_PARSE_EXCEPTION;->EMIT:Lorg/apache/tika/pipes/FetchEmitTuple$ON_PARSE_EXCEPTION;

    .line 2
    .line 3
    sput-object v0, Lorg/apache/tika/pipes/FetchEmitTuple;->DEFAULT_ON_PARSE_EXCEPTION:Lorg/apache/tika/pipes/FetchEmitTuple$ON_PARSE_EXCEPTION;

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/apache/tika/pipes/fetcher/FetchKey;Lorg/apache/tika/pipes/emitter/EmitKey;)V
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/tika/metadata/Metadata;

    invoke-direct {v0}, Lorg/apache/tika/metadata/Metadata;-><init>()V

    invoke-direct {p0, p1, p2, p3, v0}, Lorg/apache/tika/pipes/FetchEmitTuple;-><init>(Ljava/lang/String;Lorg/apache/tika/pipes/fetcher/FetchKey;Lorg/apache/tika/pipes/emitter/EmitKey;Lorg/apache/tika/metadata/Metadata;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/apache/tika/pipes/fetcher/FetchKey;Lorg/apache/tika/pipes/emitter/EmitKey;Lorg/apache/tika/metadata/Metadata;)V
    .locals 6

    .line 2
    new-instance v5, Lorg/apache/tika/parser/ParseContext;

    invoke-direct {v5}, Lorg/apache/tika/parser/ParseContext;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lorg/apache/tika/pipes/FetchEmitTuple;-><init>(Ljava/lang/String;Lorg/apache/tika/pipes/fetcher/FetchKey;Lorg/apache/tika/pipes/emitter/EmitKey;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/apache/tika/pipes/fetcher/FetchKey;Lorg/apache/tika/pipes/emitter/EmitKey;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)V
    .locals 7

    .line 3
    sget-object v6, Lorg/apache/tika/pipes/FetchEmitTuple$ON_PARSE_EXCEPTION;->EMIT:Lorg/apache/tika/pipes/FetchEmitTuple$ON_PARSE_EXCEPTION;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lorg/apache/tika/pipes/FetchEmitTuple;-><init>(Ljava/lang/String;Lorg/apache/tika/pipes/fetcher/FetchKey;Lorg/apache/tika/pipes/emitter/EmitKey;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;Lorg/apache/tika/pipes/FetchEmitTuple$ON_PARSE_EXCEPTION;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/apache/tika/pipes/fetcher/FetchKey;Lorg/apache/tika/pipes/emitter/EmitKey;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;Lorg/apache/tika/pipes/FetchEmitTuple$ON_PARSE_EXCEPTION;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lorg/apache/tika/pipes/FetchEmitTuple;->id:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lorg/apache/tika/pipes/FetchEmitTuple;->fetchKey:Lorg/apache/tika/pipes/fetcher/FetchKey;

    .line 7
    iput-object p3, p0, Lorg/apache/tika/pipes/FetchEmitTuple;->emitKey:Lorg/apache/tika/pipes/emitter/EmitKey;

    .line 8
    iput-object p4, p0, Lorg/apache/tika/pipes/FetchEmitTuple;->metadata:Lorg/apache/tika/metadata/Metadata;

    .line 9
    iput-object p5, p0, Lorg/apache/tika/pipes/FetchEmitTuple;->parseContext:Lorg/apache/tika/parser/ParseContext;

    .line 10
    iput-object p6, p0, Lorg/apache/tika/pipes/FetchEmitTuple;->onParseException:Lorg/apache/tika/pipes/FetchEmitTuple$ON_PARSE_EXCEPTION;

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
    check-cast p1, Lorg/apache/tika/pipes/FetchEmitTuple;

    .line 20
    .line 21
    iget-object v2, p0, Lorg/apache/tika/pipes/FetchEmitTuple;->id:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v3, p1, Lorg/apache/tika/pipes/FetchEmitTuple;->id:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    iget-object v2, p0, Lorg/apache/tika/pipes/FetchEmitTuple;->fetchKey:Lorg/apache/tika/pipes/fetcher/FetchKey;

    .line 32
    .line 33
    iget-object v3, p1, Lorg/apache/tika/pipes/FetchEmitTuple;->fetchKey:Lorg/apache/tika/pipes/fetcher/FetchKey;

    .line 34
    .line 35
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    iget-object v2, p0, Lorg/apache/tika/pipes/FetchEmitTuple;->emitKey:Lorg/apache/tika/pipes/emitter/EmitKey;

    .line 42
    .line 43
    iget-object v3, p1, Lorg/apache/tika/pipes/FetchEmitTuple;->emitKey:Lorg/apache/tika/pipes/emitter/EmitKey;

    .line 44
    .line 45
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    iget-object v2, p0, Lorg/apache/tika/pipes/FetchEmitTuple;->metadata:Lorg/apache/tika/metadata/Metadata;

    .line 52
    .line 53
    iget-object v3, p1, Lorg/apache/tika/pipes/FetchEmitTuple;->metadata:Lorg/apache/tika/metadata/Metadata;

    .line 54
    .line 55
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_2

    .line 60
    .line 61
    iget-object v2, p0, Lorg/apache/tika/pipes/FetchEmitTuple;->parseContext:Lorg/apache/tika/parser/ParseContext;

    .line 62
    .line 63
    iget-object v3, p1, Lorg/apache/tika/pipes/FetchEmitTuple;->parseContext:Lorg/apache/tika/parser/ParseContext;

    .line 64
    .line 65
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_2

    .line 70
    .line 71
    iget-object v2, p0, Lorg/apache/tika/pipes/FetchEmitTuple;->onParseException:Lorg/apache/tika/pipes/FetchEmitTuple$ON_PARSE_EXCEPTION;

    .line 72
    .line 73
    iget-object v3, p1, Lorg/apache/tika/pipes/FetchEmitTuple;->onParseException:Lorg/apache/tika/pipes/FetchEmitTuple$ON_PARSE_EXCEPTION;

    .line 74
    .line 75
    if-ne v2, v3, :cond_2

    .line 76
    .line 77
    iget-object v2, p0, Lorg/apache/tika/pipes/FetchEmitTuple;->embeddedDocumentBytesConfig:Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;

    .line 78
    .line 79
    iget-object p1, p1, Lorg/apache/tika/pipes/FetchEmitTuple;->embeddedDocumentBytesConfig:Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;

    .line 80
    .line 81
    invoke-static {v2, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_2

    .line 86
    .line 87
    return v0

    .line 88
    :cond_2
    :goto_0
    return v1
.end method

.method public getEmitKey()Lorg/apache/tika/pipes/emitter/EmitKey;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/FetchEmitTuple;->emitKey:Lorg/apache/tika/pipes/emitter/EmitKey;

    .line 2
    .line 3
    return-object v0
.end method

.method public getFetchKey()Lorg/apache/tika/pipes/fetcher/FetchKey;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/FetchEmitTuple;->fetchKey:Lorg/apache/tika/pipes/fetcher/FetchKey;

    .line 2
    .line 3
    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/FetchEmitTuple;->id:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMetadata()Lorg/apache/tika/metadata/Metadata;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/FetchEmitTuple;->metadata:Lorg/apache/tika/metadata/Metadata;

    .line 2
    .line 3
    return-object v0
.end method

.method public getOnParseException()Lorg/apache/tika/pipes/FetchEmitTuple$ON_PARSE_EXCEPTION;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/FetchEmitTuple;->onParseException:Lorg/apache/tika/pipes/FetchEmitTuple$ON_PARSE_EXCEPTION;

    .line 2
    .line 3
    return-object v0
.end method

.method public getParseContext()Lorg/apache/tika/parser/ParseContext;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/FetchEmitTuple;->parseContext:Lorg/apache/tika/parser/ParseContext;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/FetchEmitTuple;->id:Ljava/lang/String;

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
    iget-object v1, p0, Lorg/apache/tika/pipes/FetchEmitTuple;->fetchKey:Lorg/apache/tika/pipes/fetcher/FetchKey;

    .line 10
    .line 11
    invoke-static {v1}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    iget-object v0, p0, Lorg/apache/tika/pipes/FetchEmitTuple;->emitKey:Lorg/apache/tika/pipes/emitter/EmitKey;

    .line 19
    .line 20
    invoke-static {v0}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v1

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-object v1, p0, Lorg/apache/tika/pipes/FetchEmitTuple;->metadata:Lorg/apache/tika/metadata/Metadata;

    .line 28
    .line 29
    invoke-static {v1}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v1, v0

    .line 34
    mul-int/lit8 v1, v1, 0x1f

    .line 35
    .line 36
    iget-object v0, p0, Lorg/apache/tika/pipes/FetchEmitTuple;->parseContext:Lorg/apache/tika/parser/ParseContext;

    .line 37
    .line 38
    invoke-static {v0}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    add-int/2addr v0, v1

    .line 43
    mul-int/lit8 v0, v0, 0x1f

    .line 44
    .line 45
    iget-object v1, p0, Lorg/apache/tika/pipes/FetchEmitTuple;->onParseException:Lorg/apache/tika/pipes/FetchEmitTuple$ON_PARSE_EXCEPTION;

    .line 46
    .line 47
    invoke-static {v1}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    add-int/2addr v1, v0

    .line 52
    mul-int/lit8 v1, v1, 0x1f

    .line 53
    .line 54
    iget-object v0, p0, Lorg/apache/tika/pipes/FetchEmitTuple;->embeddedDocumentBytesConfig:Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;

    .line 55
    .line 56
    invoke-static {v0}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    add-int/2addr v0, v1

    .line 61
    return v0
.end method

.method public setEmitKey(Lorg/apache/tika/pipes/emitter/EmitKey;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/tika/pipes/FetchEmitTuple;->emitKey:Lorg/apache/tika/pipes/emitter/EmitKey;

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/FetchEmitTuple;->id:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/apache/tika/pipes/FetchEmitTuple;->fetchKey:Lorg/apache/tika/pipes/fetcher/FetchKey;

    .line 4
    .line 5
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lorg/apache/tika/pipes/FetchEmitTuple;->emitKey:Lorg/apache/tika/pipes/emitter/EmitKey;

    .line 10
    .line 11
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-object v3, p0, Lorg/apache/tika/pipes/FetchEmitTuple;->metadata:Lorg/apache/tika/metadata/Metadata;

    .line 16
    .line 17
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    iget-object v4, p0, Lorg/apache/tika/pipes/FetchEmitTuple;->parseContext:Lorg/apache/tika/parser/ParseContext;

    .line 22
    .line 23
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    iget-object v5, p0, Lorg/apache/tika/pipes/FetchEmitTuple;->onParseException:Lorg/apache/tika/pipes/FetchEmitTuple$ON_PARSE_EXCEPTION;

    .line 28
    .line 29
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    iget-object v6, p0, Lorg/apache/tika/pipes/FetchEmitTuple;->embeddedDocumentBytesConfig:Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;

    .line 34
    .line 35
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    new-instance v7, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v8, "FetchEmitTuple{id=\'"

    .line 42
    .line 43
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v0, "\', fetchKey="

    .line 50
    .line 51
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v0, ", emitKey="

    .line 58
    .line 59
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v0, ", metadata="

    .line 66
    .line 67
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v0, ", parseContext="

    .line 74
    .line 75
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string v0, ", onParseException="

    .line 82
    .line 83
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const-string v0, ", embeddedDocumentBytesConfig="

    .line 90
    .line 91
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v0, "}"

    .line 95
    .line 96
    invoke-static {v7, v6, v0}, LB1/e;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    return-object v0
.end method

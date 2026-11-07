.class public Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig$SUFFIX_STRATEGY;
    }
.end annotation


# static fields
.field public static SKIP:Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig; = null

.field private static final serialVersionUID:J = -0x35976799b9d89314L


# instance fields
.field private embeddedIdPrefix:Ljava/lang/String;

.field private emitKeyBase:Ljava/lang/String;

.field private emitter:Ljava/lang/String;

.field private extractEmbeddedDocumentBytes:Z

.field private includeOriginal:Z

.field private suffixStrategy:Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig$SUFFIX_STRATEGY;

.field private zeroPadName:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->SKIP:Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->zeroPadName:I

    .line 3
    sget-object v1, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig$SUFFIX_STRATEGY;->NONE:Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig$SUFFIX_STRATEGY;

    iput-object v1, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->suffixStrategy:Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig$SUFFIX_STRATEGY;

    .line 4
    const-string v1, "-"

    iput-object v1, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->embeddedIdPrefix:Ljava/lang/String;

    .line 5
    iput-boolean v0, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->includeOriginal:Z

    .line 6
    const-string v0, ""

    iput-object v0, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->emitKeyBase:Ljava/lang/String;

    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->extractEmbeddedDocumentBytes:Z

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 2

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 9
    iput v0, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->zeroPadName:I

    .line 10
    sget-object v1, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig$SUFFIX_STRATEGY;->NONE:Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig$SUFFIX_STRATEGY;

    iput-object v1, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->suffixStrategy:Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig$SUFFIX_STRATEGY;

    .line 11
    const-string v1, "-"

    iput-object v1, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->embeddedIdPrefix:Ljava/lang/String;

    .line 12
    iput-boolean v0, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->includeOriginal:Z

    .line 13
    const-string v0, ""

    iput-object v0, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->emitKeyBase:Ljava/lang/String;

    .line 14
    iput-boolean p1, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->extractEmbeddedDocumentBytes:Z

    return-void
.end method

.method public static getSKIP()Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->SKIP:Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;

    .line 2
    .line 3
    return-object v0
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
    check-cast p1, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;

    .line 20
    .line 21
    iget-boolean v2, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->extractEmbeddedDocumentBytes:Z

    .line 22
    .line 23
    iget-boolean v3, p1, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->extractEmbeddedDocumentBytes:Z

    .line 24
    .line 25
    if-ne v2, v3, :cond_2

    .line 26
    .line 27
    iget v2, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->zeroPadName:I

    .line 28
    .line 29
    iget v3, p1, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->zeroPadName:I

    .line 30
    .line 31
    if-ne v2, v3, :cond_2

    .line 32
    .line 33
    iget-boolean v2, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->includeOriginal:Z

    .line 34
    .line 35
    iget-boolean v3, p1, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->includeOriginal:Z

    .line 36
    .line 37
    if-ne v2, v3, :cond_2

    .line 38
    .line 39
    iget-object v2, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->suffixStrategy:Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig$SUFFIX_STRATEGY;

    .line 40
    .line 41
    iget-object v3, p1, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->suffixStrategy:Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig$SUFFIX_STRATEGY;

    .line 42
    .line 43
    if-ne v2, v3, :cond_2

    .line 44
    .line 45
    iget-object v2, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->embeddedIdPrefix:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v3, p1, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->embeddedIdPrefix:Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    iget-object v2, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->emitter:Ljava/lang/String;

    .line 56
    .line 57
    iget-object v3, p1, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->emitter:Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_2

    .line 64
    .line 65
    iget-object v2, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->emitKeyBase:Ljava/lang/String;

    .line 66
    .line 67
    iget-object p1, p1, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->emitKeyBase:Ljava/lang/String;

    .line 68
    .line 69
    invoke-static {v2, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eqz p1, :cond_2

    .line 74
    .line 75
    return v0

    .line 76
    :cond_2
    :goto_0
    return v1
.end method

.method public getEmbeddedIdPrefix()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->embeddedIdPrefix:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getEmitKeyBase()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->emitKeyBase:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getEmitter()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->emitter:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSuffixStrategy()Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig$SUFFIX_STRATEGY;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->suffixStrategy:Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig$SUFFIX_STRATEGY;

    .line 2
    .line 3
    return-object v0
.end method

.method public getZeroPadName()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->zeroPadName:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-boolean v0, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->extractEmbeddedDocumentBytes:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget v1, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->zeroPadName:I

    .line 10
    .line 11
    add-int/2addr v0, v1

    .line 12
    mul-int/lit8 v0, v0, 0x1f

    .line 13
    .line 14
    iget-object v1, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->suffixStrategy:Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig$SUFFIX_STRATEGY;

    .line 15
    .line 16
    invoke-static {v1}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    add-int/2addr v1, v0

    .line 21
    mul-int/lit8 v1, v1, 0x1f

    .line 22
    .line 23
    iget-object v0, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->embeddedIdPrefix:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v0}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    add-int/2addr v0, v1

    .line 30
    mul-int/lit8 v0, v0, 0x1f

    .line 31
    .line 32
    iget-object v1, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->emitter:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v1}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    add-int/2addr v1, v0

    .line 39
    mul-int/lit8 v1, v1, 0x1f

    .line 40
    .line 41
    iget-boolean v0, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->includeOriginal:Z

    .line 42
    .line 43
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    add-int/2addr v0, v1

    .line 48
    mul-int/lit8 v0, v0, 0x1f

    .line 49
    .line 50
    iget-object v1, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->emitKeyBase:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v1}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    add-int/2addr v1, v0

    .line 57
    return v1
.end method

.method public isExtractEmbeddedDocumentBytes()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->extractEmbeddedDocumentBytes:Z

    .line 2
    .line 3
    return v0
.end method

.method public isIncludeOriginal()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->includeOriginal:Z

    .line 2
    .line 3
    return v0
.end method

.method public setEmbeddedIdPrefix(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->embeddedIdPrefix:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setEmitKeyBase(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->emitKeyBase:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setEmitter(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->emitter:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setExtractEmbeddedDocumentBytes(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->extractEmbeddedDocumentBytes:Z

    .line 2
    .line 3
    return-void
.end method

.method public setIncludeOriginal(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->includeOriginal:Z

    .line 2
    .line 3
    return-void
.end method

.method public setSuffixStrategy(Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-static {p1}, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig$SUFFIX_STRATEGY;->valueOf(Ljava/lang/String;)Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig$SUFFIX_STRATEGY;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->setSuffixStrategy(Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig$SUFFIX_STRATEGY;)V

    return-void
.end method

.method public setSuffixStrategy(Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig$SUFFIX_STRATEGY;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->suffixStrategy:Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig$SUFFIX_STRATEGY;

    return-void
.end method

.method public setZeroPadName(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->zeroPadName:I

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    .line 1
    iget-boolean v0, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->extractEmbeddedDocumentBytes:Z

    .line 2
    .line 3
    iget v1, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->zeroPadName:I

    .line 4
    .line 5
    iget-object v2, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->suffixStrategy:Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig$SUFFIX_STRATEGY;

    .line 6
    .line 7
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v3, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->embeddedIdPrefix:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v4, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->emitter:Ljava/lang/String;

    .line 14
    .line 15
    iget-boolean v5, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->includeOriginal:Z

    .line 16
    .line 17
    iget-object v6, p0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->emitKeyBase:Ljava/lang/String;

    .line 18
    .line 19
    new-instance v7, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v8, "EmbeddedDocumentBytesConfig{extractEmbeddedDocumentBytes="

    .line 22
    .line 23
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v0, ", zeroPadName="

    .line 30
    .line 31
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v0, ", suffixStrategy="

    .line 38
    .line 39
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v0, ", embeddedIdPrefix=\'"

    .line 46
    .line 47
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v0, "\', emitter=\'"

    .line 54
    .line 55
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v0, "\', includeOriginal="

    .line 62
    .line 63
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v0, ", emitKeyBase=\'"

    .line 70
    .line 71
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v0, "\'}"

    .line 75
    .line 76
    invoke-static {v7, v6, v0}, LB1/e;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    return-object v0
.end method

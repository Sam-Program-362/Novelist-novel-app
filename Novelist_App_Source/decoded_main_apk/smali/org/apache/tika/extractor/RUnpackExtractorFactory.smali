.class public Lorg/apache/tika/extractor/RUnpackExtractorFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/apache/tika/extractor/EmbeddedDocumentByteStoreExtractorFactory;


# static fields
.field public static DEFAULT_MAX_EMBEDDED_BYTES_FOR_EXTRACTION:J = 0x280000000L


# instance fields
.field private embeddedBytesExcludeEmbeddedResourceTypes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private embeddedBytesExcludeMimeTypes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private embeddedBytesIncludeEmbeddedResourceTypes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private embeddedBytesIncludeMimeTypes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private maxEmbeddedBytesForExtraction:J

.field private writeFileNameToContent:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lorg/apache/tika/extractor/RUnpackExtractorFactory;->writeFileNameToContent:Z

    .line 6
    .line 7
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 8
    .line 9
    iput-object v0, p0, Lorg/apache/tika/extractor/RUnpackExtractorFactory;->embeddedBytesIncludeMimeTypes:Ljava/util/Set;

    .line 10
    .line 11
    iput-object v0, p0, Lorg/apache/tika/extractor/RUnpackExtractorFactory;->embeddedBytesExcludeMimeTypes:Ljava/util/Set;

    .line 12
    .line 13
    iput-object v0, p0, Lorg/apache/tika/extractor/RUnpackExtractorFactory;->embeddedBytesIncludeEmbeddedResourceTypes:Ljava/util/Set;

    .line 14
    .line 15
    iput-object v0, p0, Lorg/apache/tika/extractor/RUnpackExtractorFactory;->embeddedBytesExcludeEmbeddedResourceTypes:Ljava/util/Set;

    .line 16
    .line 17
    sget-wide v0, Lorg/apache/tika/extractor/RUnpackExtractorFactory;->DEFAULT_MAX_EMBEDDED_BYTES_FOR_EXTRACTION:J

    .line 18
    .line 19
    iput-wide v0, p0, Lorg/apache/tika/extractor/RUnpackExtractorFactory;->maxEmbeddedBytesForExtraction:J

    .line 20
    .line 21
    return-void
.end method

.method private createEmbeddedBytesSelector()Lorg/apache/tika/extractor/EmbeddedBytesSelector;
    .locals 5

    .line 1
    iget-object v0, p0, Lorg/apache/tika/extractor/RUnpackExtractorFactory;->embeddedBytesIncludeMimeTypes:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Set;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lorg/apache/tika/extractor/RUnpackExtractorFactory;->embeddedBytesExcludeMimeTypes:Ljava/util/Set;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Set;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lorg/apache/tika/extractor/RUnpackExtractorFactory;->embeddedBytesIncludeEmbeddedResourceTypes:Ljava/util/Set;

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Set;->size()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, Lorg/apache/tika/extractor/RUnpackExtractorFactory;->embeddedBytesExcludeEmbeddedResourceTypes:Ljava/util/Set;

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Set;->size()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    sget-object v0, Lorg/apache/tika/extractor/EmbeddedBytesSelector;->ACCEPT_ALL:Lorg/apache/tika/extractor/EmbeddedBytesSelector;

    .line 34
    .line 35
    return-object v0

    .line 36
    :cond_0
    new-instance v0, Lorg/apache/tika/extractor/BasicEmbeddedBytesSelector;

    .line 37
    .line 38
    iget-object v1, p0, Lorg/apache/tika/extractor/RUnpackExtractorFactory;->embeddedBytesIncludeMimeTypes:Ljava/util/Set;

    .line 39
    .line 40
    iget-object v2, p0, Lorg/apache/tika/extractor/RUnpackExtractorFactory;->embeddedBytesExcludeMimeTypes:Ljava/util/Set;

    .line 41
    .line 42
    iget-object v3, p0, Lorg/apache/tika/extractor/RUnpackExtractorFactory;->embeddedBytesIncludeEmbeddedResourceTypes:Ljava/util/Set;

    .line 43
    .line 44
    iget-object v4, p0, Lorg/apache/tika/extractor/RUnpackExtractorFactory;->embeddedBytesExcludeEmbeddedResourceTypes:Ljava/util/Set;

    .line 45
    .line 46
    invoke-direct {v0, v1, v2, v3, v4}, Lorg/apache/tika/extractor/BasicEmbeddedBytesSelector;-><init>(Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;)V

    .line 47
    .line 48
    .line 49
    return-object v0
.end method


# virtual methods
.method public newInstance(Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)Lorg/apache/tika/extractor/EmbeddedDocumentExtractor;
    .locals 2

    .line 1
    new-instance p1, Lorg/apache/tika/extractor/RUnpackExtractor;

    .line 2
    .line 3
    iget-wide v0, p0, Lorg/apache/tika/extractor/RUnpackExtractorFactory;->maxEmbeddedBytesForExtraction:J

    .line 4
    .line 5
    invoke-direct {p1, p2, v0, v1}, Lorg/apache/tika/extractor/RUnpackExtractor;-><init>(Lorg/apache/tika/parser/ParseContext;J)V

    .line 6
    .line 7
    .line 8
    iget-boolean p2, p0, Lorg/apache/tika/extractor/RUnpackExtractorFactory;->writeFileNameToContent:Z

    .line 9
    .line 10
    invoke-virtual {p1, p2}, Lorg/apache/tika/extractor/ParsingEmbeddedDocumentExtractor;->setWriteFileNameToContent(Z)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Lorg/apache/tika/extractor/RUnpackExtractorFactory;->createEmbeddedBytesSelector()Lorg/apache/tika/extractor/EmbeddedBytesSelector;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-virtual {p1, p2}, Lorg/apache/tika/extractor/RUnpackExtractor;->setEmbeddedBytesSelector(Lorg/apache/tika/extractor/EmbeddedBytesSelector;)V

    .line 18
    .line 19
    .line 20
    return-object p1
.end method

.method public setEmbeddedBytesExcludeEmbeddedResourceTypes(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Lorg/apache/tika/config/Field;
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lorg/apache/tika/extractor/RUnpackExtractorFactory;->embeddedBytesExcludeEmbeddedResourceTypes:Ljava/util/Set;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setEmbeddedBytesExcludeMimeTypes(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Lorg/apache/tika/config/Field;
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lorg/apache/tika/extractor/RUnpackExtractorFactory;->embeddedBytesExcludeMimeTypes:Ljava/util/Set;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setEmbeddedBytesIncludeEmbeddedResourceTypes(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Lorg/apache/tika/config/Field;
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lorg/apache/tika/extractor/RUnpackExtractorFactory;->embeddedBytesIncludeEmbeddedResourceTypes:Ljava/util/Set;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setEmbeddedBytesIncludeMimeTypes(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Lorg/apache/tika/config/Field;
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lorg/apache/tika/extractor/RUnpackExtractorFactory;->embeddedBytesIncludeMimeTypes:Ljava/util/Set;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setMaxEmbeddedBytesForExtraction(J)V
    .locals 2
    .annotation runtime Lorg/apache/tika/config/Field;
    .end annotation

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    iput-wide p1, p0, Lorg/apache/tika/extractor/RUnpackExtractorFactory;->maxEmbeddedBytesForExtraction:J

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance p1, Lorg/apache/tika/exception/TikaConfigException;

    .line 11
    .line 12
    const-string p2, "maxEmbeddedBytesForExtraction must be >= 0"

    .line 13
    .line 14
    invoke-direct {p1, p2}, Lorg/apache/tika/exception/TikaConfigException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw p1
.end method

.method public setWriteFileNameToContent(Z)V
    .locals 0
    .annotation runtime Lorg/apache/tika/config/Field;
    .end annotation

    .line 1
    iput-boolean p1, p0, Lorg/apache/tika/extractor/RUnpackExtractorFactory;->writeFileNameToContent:Z

    .line 2
    .line 3
    return-void
.end method

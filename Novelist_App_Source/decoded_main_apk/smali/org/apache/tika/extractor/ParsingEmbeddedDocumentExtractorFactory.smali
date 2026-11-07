.class public Lorg/apache/tika/extractor/ParsingEmbeddedDocumentExtractorFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/apache/tika/extractor/EmbeddedDocumentExtractorFactory;


# instance fields
.field private writeFileNameToContent:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lorg/apache/tika/extractor/ParsingEmbeddedDocumentExtractorFactory;->writeFileNameToContent:Z

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public newInstance(Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)Lorg/apache/tika/extractor/EmbeddedDocumentExtractor;
    .locals 0

    .line 1
    new-instance p1, Lorg/apache/tika/extractor/ParsingEmbeddedDocumentExtractor;

    .line 2
    .line 3
    invoke-direct {p1, p2}, Lorg/apache/tika/extractor/ParsingEmbeddedDocumentExtractor;-><init>(Lorg/apache/tika/parser/ParseContext;)V

    .line 4
    .line 5
    .line 6
    iget-boolean p2, p0, Lorg/apache/tika/extractor/ParsingEmbeddedDocumentExtractorFactory;->writeFileNameToContent:Z

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Lorg/apache/tika/extractor/ParsingEmbeddedDocumentExtractor;->setWriteFileNameToContent(Z)V

    .line 9
    .line 10
    .line 11
    return-object p1
.end method

.method public setWriteFileNameToContent(Z)V
    .locals 0
    .annotation runtime Lorg/apache/tika/config/Field;
    .end annotation

    .line 1
    iput-boolean p1, p0, Lorg/apache/tika/extractor/ParsingEmbeddedDocumentExtractorFactory;->writeFileNameToContent:Z

    .line 2
    .line 3
    return-void
.end method

.class public Lorg/apache/tika/parser/AutoDetectParserConfig;
.super Lorg/apache/tika/config/ConfigBase;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static DEFAULT:Lorg/apache/tika/parser/AutoDetectParserConfig;

.field private static NOOP_CONTENT_HANDLER_DECORATOR_FACTORY:Lorg/apache/tika/sax/ContentHandlerDecoratorFactory;


# instance fields
.field private contentHandlerDecoratorFactory:Lorg/apache/tika/sax/ContentHandlerDecoratorFactory;

.field private digesterFactory:Lorg/apache/tika/parser/DigestingParser$DigesterFactory;

.field private embeddedDocumentExtractorFactory:Lorg/apache/tika/extractor/EmbeddedDocumentExtractorFactory;

.field private maximumCompressionRatio:Ljava/lang/Long;

.field private maximumDepth:Ljava/lang/Integer;

.field private maximumPackageEntryDepth:Ljava/lang/Integer;

.field private metadataWriteFilterFactory:Lorg/apache/tika/metadata/writefilter/MetadataWriteFilterFactory;

.field private outputThreshold:Ljava/lang/Long;

.field private spoolToDisk:Ljava/lang/Long;

.field private throwOnZeroBytes:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/tika/parser/AutoDetectParserConfig$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/apache/tika/parser/AutoDetectParserConfig$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lorg/apache/tika/parser/AutoDetectParserConfig;->NOOP_CONTENT_HANDLER_DECORATOR_FACTORY:Lorg/apache/tika/sax/ContentHandlerDecoratorFactory;

    .line 7
    .line 8
    new-instance v0, Lorg/apache/tika/parser/AutoDetectParserConfig;

    .line 9
    .line 10
    invoke-direct {v0}, Lorg/apache/tika/parser/AutoDetectParserConfig;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lorg/apache/tika/parser/AutoDetectParserConfig;->DEFAULT:Lorg/apache/tika/parser/AutoDetectParserConfig;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 12
    invoke-direct {p0}, Lorg/apache/tika/config/ConfigBase;-><init>()V

    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->spoolToDisk:Ljava/lang/Long;

    .line 14
    iput-object v0, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->outputThreshold:Ljava/lang/Long;

    .line 15
    iput-object v0, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->maximumCompressionRatio:Ljava/lang/Long;

    .line 16
    iput-object v0, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->maximumDepth:Ljava/lang/Integer;

    .line 17
    iput-object v0, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->maximumPackageEntryDepth:Ljava/lang/Integer;

    .line 18
    iput-object v0, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->metadataWriteFilterFactory:Lorg/apache/tika/metadata/writefilter/MetadataWriteFilterFactory;

    .line 19
    iput-object v0, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->embeddedDocumentExtractorFactory:Lorg/apache/tika/extractor/EmbeddedDocumentExtractorFactory;

    .line 20
    sget-object v1, Lorg/apache/tika/parser/AutoDetectParserConfig;->NOOP_CONTENT_HANDLER_DECORATOR_FACTORY:Lorg/apache/tika/sax/ContentHandlerDecoratorFactory;

    iput-object v1, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->contentHandlerDecoratorFactory:Lorg/apache/tika/sax/ContentHandlerDecoratorFactory;

    .line 21
    iput-object v0, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->digesterFactory:Lorg/apache/tika/parser/DigestingParser$DigesterFactory;

    const/4 v0, 0x1

    .line 22
    iput-boolean v0, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->throwOnZeroBytes:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/apache/tika/config/ConfigBase;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->metadataWriteFilterFactory:Lorg/apache/tika/metadata/writefilter/MetadataWriteFilterFactory;

    .line 3
    iput-object v0, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->embeddedDocumentExtractorFactory:Lorg/apache/tika/extractor/EmbeddedDocumentExtractorFactory;

    .line 4
    sget-object v1, Lorg/apache/tika/parser/AutoDetectParserConfig;->NOOP_CONTENT_HANDLER_DECORATOR_FACTORY:Lorg/apache/tika/sax/ContentHandlerDecoratorFactory;

    iput-object v1, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->contentHandlerDecoratorFactory:Lorg/apache/tika/sax/ContentHandlerDecoratorFactory;

    .line 5
    iput-object v0, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->digesterFactory:Lorg/apache/tika/parser/DigestingParser$DigesterFactory;

    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->throwOnZeroBytes:Z

    .line 7
    iput-object p1, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->spoolToDisk:Ljava/lang/Long;

    .line 8
    iput-object p2, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->outputThreshold:Ljava/lang/Long;

    .line 9
    iput-object p3, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->maximumCompressionRatio:Ljava/lang/Long;

    .line 10
    iput-object p4, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->maximumDepth:Ljava/lang/Integer;

    .line 11
    iput-object p5, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->maximumPackageEntryDepth:Ljava/lang/Integer;

    return-void
.end method

.method public static load(Lorg/w3c/dom/Element;)Lorg/apache/tika/parser/AutoDetectParserConfig;
    .locals 3

    .line 1
    const-class v0, Lorg/apache/tika/parser/AutoDetectParserConfig;

    .line 2
    .line 3
    sget-object v1, Lorg/apache/tika/parser/AutoDetectParserConfig;->DEFAULT:Lorg/apache/tika/parser/AutoDetectParserConfig;

    .line 4
    .line 5
    const-string v2, "autoDetectParserConfig"

    .line 6
    .line 7
    invoke-static {v2, v0, p0, v1}, Lorg/apache/tika/config/ConfigBase;->buildSingle(Ljava/lang/String;Ljava/lang/Class;Lorg/w3c/dom/Element;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lorg/apache/tika/parser/AutoDetectParserConfig;

    .line 12
    .line 13
    return-object p0
.end method


# virtual methods
.method public getContentHandlerDecoratorFactory()Lorg/apache/tika/sax/ContentHandlerDecoratorFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->contentHandlerDecoratorFactory:Lorg/apache/tika/sax/ContentHandlerDecoratorFactory;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDigesterFactory()Lorg/apache/tika/parser/DigestingParser$DigesterFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->digesterFactory:Lorg/apache/tika/parser/DigestingParser$DigesterFactory;

    .line 2
    .line 3
    return-object v0
.end method

.method public getEmbeddedDocumentExtractorFactory()Lorg/apache/tika/extractor/EmbeddedDocumentExtractorFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->embeddedDocumentExtractorFactory:Lorg/apache/tika/extractor/EmbeddedDocumentExtractorFactory;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMaximumCompressionRatio()Ljava/lang/Long;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->maximumCompressionRatio:Ljava/lang/Long;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMaximumDepth()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->maximumDepth:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMaximumPackageEntryDepth()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->maximumPackageEntryDepth:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMetadataWriteFilterFactory()Lorg/apache/tika/metadata/writefilter/MetadataWriteFilterFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->metadataWriteFilterFactory:Lorg/apache/tika/metadata/writefilter/MetadataWriteFilterFactory;

    .line 2
    .line 3
    return-object v0
.end method

.method public getOutputThreshold()Ljava/lang/Long;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->outputThreshold:Ljava/lang/Long;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSpoolToDisk()Ljava/lang/Long;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->spoolToDisk:Ljava/lang/Long;

    .line 2
    .line 3
    return-object v0
.end method

.method public getThrowOnZeroBytes()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->throwOnZeroBytes:Z

    .line 2
    .line 3
    return v0
.end method

.method public setContentHandlerDecoratorFactory(Lorg/apache/tika/sax/ContentHandlerDecoratorFactory;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->contentHandlerDecoratorFactory:Lorg/apache/tika/sax/ContentHandlerDecoratorFactory;

    .line 2
    .line 3
    return-void
.end method

.method public setDigesterFactory(Lorg/apache/tika/parser/DigestingParser$DigesterFactory;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->digesterFactory:Lorg/apache/tika/parser/DigestingParser$DigesterFactory;

    .line 2
    .line 3
    return-void
.end method

.method public setEmbeddedDocumentExtractorFactory(Lorg/apache/tika/extractor/EmbeddedDocumentExtractorFactory;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->embeddedDocumentExtractorFactory:Lorg/apache/tika/extractor/EmbeddedDocumentExtractorFactory;

    .line 2
    .line 3
    return-void
.end method

.method public setMaximumCompressionRatio(J)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->maximumCompressionRatio:Ljava/lang/Long;

    .line 6
    .line 7
    return-void
.end method

.method public setMaximumDepth(I)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->maximumDepth:Ljava/lang/Integer;

    .line 6
    .line 7
    return-void
.end method

.method public setMaximumPackageEntryDepth(I)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->maximumPackageEntryDepth:Ljava/lang/Integer;

    .line 6
    .line 7
    return-void
.end method

.method public setMetadataWriteFilterFactory(Lorg/apache/tika/metadata/writefilter/MetadataWriteFilterFactory;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->metadataWriteFilterFactory:Lorg/apache/tika/metadata/writefilter/MetadataWriteFilterFactory;

    .line 2
    .line 3
    return-void
.end method

.method public setOutputThreshold(J)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->outputThreshold:Ljava/lang/Long;

    .line 6
    .line 7
    return-void
.end method

.method public setSpoolToDisk(J)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->spoolToDisk:Ljava/lang/Long;

    .line 6
    .line 7
    return-void
.end method

.method public setThrowOnZeroBytes(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->throwOnZeroBytes:Z

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    .line 1
    iget-object v0, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->spoolToDisk:Ljava/lang/Long;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->outputThreshold:Ljava/lang/Long;

    .line 4
    .line 5
    iget-object v2, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->maximumCompressionRatio:Ljava/lang/Long;

    .line 6
    .line 7
    iget-object v3, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->maximumDepth:Ljava/lang/Integer;

    .line 8
    .line 9
    iget-object v4, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->maximumPackageEntryDepth:Ljava/lang/Integer;

    .line 10
    .line 11
    iget-object v5, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->metadataWriteFilterFactory:Lorg/apache/tika/metadata/writefilter/MetadataWriteFilterFactory;

    .line 12
    .line 13
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    iget-object v6, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->embeddedDocumentExtractorFactory:Lorg/apache/tika/extractor/EmbeddedDocumentExtractorFactory;

    .line 18
    .line 19
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    iget-object v7, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->contentHandlerDecoratorFactory:Lorg/apache/tika/sax/ContentHandlerDecoratorFactory;

    .line 24
    .line 25
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    iget-object v8, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->digesterFactory:Lorg/apache/tika/parser/DigestingParser$DigesterFactory;

    .line 30
    .line 31
    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v8

    .line 35
    iget-boolean v9, p0, Lorg/apache/tika/parser/AutoDetectParserConfig;->throwOnZeroBytes:Z

    .line 36
    .line 37
    new-instance v10, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v11, "AutoDetectParserConfig{spoolToDisk="

    .line 40
    .line 41
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v0, ", outputThreshold="

    .line 48
    .line 49
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v0, ", maximumCompressionRatio="

    .line 56
    .line 57
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v0, ", maximumDepth="

    .line 64
    .line 65
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v0, ", maximumPackageEntryDepth="

    .line 72
    .line 73
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v0, ", metadataWriteFilterFactory="

    .line 80
    .line 81
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v0, ", embeddedDocumentExtractorFactory="

    .line 88
    .line 89
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string v0, ", contentHandlerDecoratorFactory="

    .line 96
    .line 97
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v0, ", digesterFactory="

    .line 104
    .line 105
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const-string v0, ", throwOnZeroBytes="

    .line 112
    .line 113
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    const-string v0, "}"

    .line 120
    .line 121
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    return-object v0
.end method

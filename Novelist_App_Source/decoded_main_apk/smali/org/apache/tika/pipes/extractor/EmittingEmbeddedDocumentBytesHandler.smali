.class public Lorg/apache/tika/pipes/extractor/EmittingEmbeddedDocumentBytesHandler;
.super Lorg/apache/tika/extractor/AbstractEmbeddedDocumentBytesHandler;
.source "SourceFile"


# static fields
.field private static final METADATA:Lorg/apache/tika/metadata/Metadata;

.field private static final PARSE_CONTEXT:Lorg/apache/tika/parser/ParseContext;


# instance fields
.field private final containerEmitKey:Lorg/apache/tika/pipes/emitter/EmitKey;

.field private final embeddedDocumentBytesConfig:Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;

.field private final emitter:Lorg/apache/tika/pipes/emitter/StreamEmitter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/tika/metadata/Metadata;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/apache/tika/metadata/Metadata;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lorg/apache/tika/pipes/extractor/EmittingEmbeddedDocumentBytesHandler;->METADATA:Lorg/apache/tika/metadata/Metadata;

    .line 7
    .line 8
    new-instance v0, Lorg/apache/tika/parser/ParseContext;

    .line 9
    .line 10
    invoke-direct {v0}, Lorg/apache/tika/parser/ParseContext;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lorg/apache/tika/pipes/extractor/EmittingEmbeddedDocumentBytesHandler;->PARSE_CONTEXT:Lorg/apache/tika/parser/ParseContext;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Lorg/apache/tika/pipes/FetchEmitTuple;Lorg/apache/tika/pipes/emitter/EmitterManager;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/apache/tika/extractor/AbstractEmbeddedDocumentBytesHandler;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getEmitKey()Lorg/apache/tika/pipes/emitter/EmitKey;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lorg/apache/tika/pipes/extractor/EmittingEmbeddedDocumentBytesHandler;->containerEmitKey:Lorg/apache/tika/pipes/emitter/EmitKey;

    .line 9
    .line 10
    invoke-virtual {p1}, Lorg/apache/tika/pipes/FetchEmitTuple;->getParseContext()Lorg/apache/tika/parser/ParseContext;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const-class v0, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Lorg/apache/tika/parser/ParseContext;->get(Ljava/lang/Class;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;

    .line 21
    .line 22
    iput-object p1, p0, Lorg/apache/tika/pipes/extractor/EmittingEmbeddedDocumentBytesHandler;->embeddedDocumentBytesConfig:Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p1}, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->getEmitter()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p2, v0}, Lorg/apache/tika/pipes/emitter/EmitterManager;->getEmitter(Ljava/lang/String;)Lorg/apache/tika/pipes/emitter/Emitter;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    instance-of v0, p2, Lorg/apache/tika/pipes/emitter/StreamEmitter;

    .line 35
    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    check-cast p2, Lorg/apache/tika/pipes/emitter/StreamEmitter;

    .line 39
    .line 40
    iput-object p2, p0, Lorg/apache/tika/pipes/extractor/EmittingEmbeddedDocumentBytesHandler;->emitter:Lorg/apache/tika/pipes/emitter/StreamEmitter;

    .line 41
    .line 42
    return-void

    .line 43
    :cond_0
    new-instance p2, Lorg/apache/tika/exception/TikaConfigException;

    .line 44
    .line 45
    invoke-virtual {p1}, Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;->getEmitter()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const-string v0, "Emitter "

    .line 50
    .line 51
    const-string v1, " must implement a StreamEmitter"

    .line 52
    .line 53
    invoke-static {v0, p1, v1}, Lt/a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-direct {p2, p1}, Lorg/apache/tika/exception/TikaConfigException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p2

    .line 61
    :cond_1
    new-instance p1, Lorg/apache/tika/exception/TikaConfigException;

    .line 62
    .line 63
    const-string p2, "EmbeddedDocumentBytesConfig must not be null!"

    .line 64
    .line 65
    invoke-direct {p1, p2}, Lorg/apache/tika/exception/TikaConfigException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1
.end method


# virtual methods
.method public add(ILorg/apache/tika/metadata/Metadata;Ljava/io/InputStream;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/extractor/EmittingEmbeddedDocumentBytesHandler;->containerEmitKey:Lorg/apache/tika/pipes/emitter/EmitKey;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/apache/tika/pipes/emitter/EmitKey;->getEmitKey()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lorg/apache/tika/pipes/extractor/EmittingEmbeddedDocumentBytesHandler;->embeddedDocumentBytesConfig:Lorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;

    .line 8
    .line 9
    invoke-virtual {p0, v0, p1, v1, p2}, Lorg/apache/tika/extractor/AbstractEmbeddedDocumentBytesHandler;->getEmitKey(Ljava/lang/String;ILorg/apache/tika/pipes/extractor/EmbeddedDocumentBytesConfig;Lorg/apache/tika/metadata/Metadata;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    :try_start_0
    iget-object p2, p0, Lorg/apache/tika/pipes/extractor/EmittingEmbeddedDocumentBytesHandler;->emitter:Lorg/apache/tika/pipes/emitter/StreamEmitter;

    .line 14
    .line 15
    sget-object v0, Lorg/apache/tika/pipes/extractor/EmittingEmbeddedDocumentBytesHandler;->METADATA:Lorg/apache/tika/metadata/Metadata;

    .line 16
    .line 17
    sget-object v1, Lorg/apache/tika/pipes/extractor/EmittingEmbeddedDocumentBytesHandler;->PARSE_CONTEXT:Lorg/apache/tika/parser/ParseContext;

    .line 18
    .line 19
    invoke-interface {p2, p1, p3, v0, v1}, Lorg/apache/tika/pipes/emitter/StreamEmitter;->emit(Ljava/lang/String;Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)V
    :try_end_0
    .catch Lorg/apache/tika/pipes/emitter/TikaEmitterException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catch_0
    move-exception p1

    .line 24
    new-instance p2, Ljava/io/IOException;

    .line 25
    .line 26
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    throw p2
.end method

.method public close()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/extractor/EmittingEmbeddedDocumentBytesHandler;->emitter:Lorg/apache/tika/pipes/emitter/StreamEmitter;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/io/Closeable;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/io/Closeable;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

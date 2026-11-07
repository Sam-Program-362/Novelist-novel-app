.class public Lorg/apache/tika/language/detect/LanguageHandler;
.super Lorg/apache/tika/sax/WriteOutContentHandler;
.source "SourceFile"


# instance fields
.field private final writer:Lorg/apache/tika/language/detect/LanguageWriter;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/apache/tika/language/detect/LanguageWriter;

    invoke-static {}, Lorg/apache/tika/language/detect/LanguageDetector;->getDefaultLanguageDetector()Lorg/apache/tika/language/detect/LanguageDetector;

    move-result-object v1

    invoke-virtual {v1}, Lorg/apache/tika/language/detect/LanguageDetector;->loadModels()Lorg/apache/tika/language/detect/LanguageDetector;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/apache/tika/language/detect/LanguageWriter;-><init>(Lorg/apache/tika/language/detect/LanguageDetector;)V

    invoke-direct {p0, v0}, Lorg/apache/tika/language/detect/LanguageHandler;-><init>(Lorg/apache/tika/language/detect/LanguageWriter;)V

    return-void
.end method

.method public constructor <init>(Lorg/apache/tika/language/detect/LanguageDetector;)V
    .locals 1

    .line 4
    new-instance v0, Lorg/apache/tika/language/detect/LanguageWriter;

    invoke-direct {v0, p1}, Lorg/apache/tika/language/detect/LanguageWriter;-><init>(Lorg/apache/tika/language/detect/LanguageDetector;)V

    invoke-direct {p0, v0}, Lorg/apache/tika/language/detect/LanguageHandler;-><init>(Lorg/apache/tika/language/detect/LanguageWriter;)V

    return-void
.end method

.method public constructor <init>(Lorg/apache/tika/language/detect/LanguageWriter;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lorg/apache/tika/sax/WriteOutContentHandler;-><init>(Ljava/io/Writer;)V

    .line 3
    iput-object p1, p0, Lorg/apache/tika/language/detect/LanguageHandler;->writer:Lorg/apache/tika/language/detect/LanguageWriter;

    return-void
.end method


# virtual methods
.method public getDetector()Lorg/apache/tika/language/detect/LanguageDetector;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/language/detect/LanguageHandler;->writer:Lorg/apache/tika/language/detect/LanguageWriter;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/apache/tika/language/detect/LanguageWriter;->getDetector()Lorg/apache/tika/language/detect/LanguageDetector;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getLanguage()Lorg/apache/tika/language/detect/LanguageResult;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/language/detect/LanguageHandler;->writer:Lorg/apache/tika/language/detect/LanguageWriter;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/apache/tika/language/detect/LanguageWriter;->getLanguage()Lorg/apache/tika/language/detect/LanguageResult;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

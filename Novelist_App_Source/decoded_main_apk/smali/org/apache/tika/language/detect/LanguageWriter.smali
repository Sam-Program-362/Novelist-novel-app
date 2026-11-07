.class public Lorg/apache/tika/language/detect/LanguageWriter;
.super Ljava/io/Writer;
.source "SourceFile"


# instance fields
.field private final detector:Lorg/apache/tika/language/detect/LanguageDetector;


# direct methods
.method public constructor <init>(Lorg/apache/tika/language/detect/LanguageDetector;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/io/Writer;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/apache/tika/language/detect/LanguageWriter;->detector:Lorg/apache/tika/language/detect/LanguageDetector;

    .line 5
    .line 6
    invoke-virtual {p1}, Lorg/apache/tika/language/detect/LanguageDetector;->reset()V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public close()V
    .locals 0

    return-void
.end method

.method public flush()V
    .locals 0

    return-void
.end method

.method public getDetector()Lorg/apache/tika/language/detect/LanguageDetector;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/language/detect/LanguageWriter;->detector:Lorg/apache/tika/language/detect/LanguageDetector;

    .line 2
    .line 3
    return-object v0
.end method

.method public getLanguage()Lorg/apache/tika/language/detect/LanguageResult;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/language/detect/LanguageWriter;->detector:Lorg/apache/tika/language/detect/LanguageDetector;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/apache/tika/language/detect/LanguageDetector;->detect()Lorg/apache/tika/language/detect/LanguageResult;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public reset()V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/language/detect/LanguageWriter;->detector:Lorg/apache/tika/language/detect/LanguageDetector;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/apache/tika/language/detect/LanguageDetector;->reset()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public write([CII)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/language/detect/LanguageWriter;->detector:Lorg/apache/tika/language/detect/LanguageDetector;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lorg/apache/tika/language/detect/LanguageDetector;->addText([CII)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

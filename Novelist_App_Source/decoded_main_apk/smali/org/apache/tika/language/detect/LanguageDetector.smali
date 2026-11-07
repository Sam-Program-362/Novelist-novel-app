.class public abstract Lorg/apache/tika/language/detect/LanguageDetector;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final BUFFER_LENGTH:I = 0x1000

.field private static final DEFAULT_SERVICE_LOADER:Lorg/apache/tika/config/ServiceLoader;


# instance fields
.field protected mixedLanguages:Z

.field protected shortText:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/tika/config/ServiceLoader;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/apache/tika/config/ServiceLoader;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lorg/apache/tika/language/detect/LanguageDetector;->DEFAULT_SERVICE_LOADER:Lorg/apache/tika/config/ServiceLoader;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lorg/apache/tika/language/detect/LanguageDetector;->mixedLanguages:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lorg/apache/tika/language/detect/LanguageDetector;->shortText:Z

    .line 8
    .line 9
    return-void
.end method

.method public static getDefaultLanguageDetector()Lorg/apache/tika/language/detect/LanguageDetector;
    .locals 2

    .line 1
    invoke-static {}, Lorg/apache/tika/language/detect/LanguageDetector;->getLanguageDetectors()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lorg/apache/tika/language/detect/LanguageDetector;

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v1, "No language detectors available"

    .line 22
    .line 23
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw v0
.end method

.method public static getLanguageDetectors()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/apache/tika/language/detect/LanguageDetector;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lorg/apache/tika/language/detect/LanguageDetector;->DEFAULT_SERVICE_LOADER:Lorg/apache/tika/config/ServiceLoader;

    invoke-static {v0}, Lorg/apache/tika/language/detect/LanguageDetector;->getLanguageDetectors(Lorg/apache/tika/config/ServiceLoader;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static getLanguageDetectors(Lorg/apache/tika/config/ServiceLoader;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/tika/config/ServiceLoader;",
            ")",
            "Ljava/util/List<",
            "Lorg/apache/tika/language/detect/LanguageDetector;",
            ">;"
        }
    .end annotation

    .line 2
    const-class v0, Lorg/apache/tika/language/detect/LanguageDetector;

    .line 3
    invoke-virtual {p0, v0}, Lorg/apache/tika/config/ServiceLoader;->loadStaticServiceProviders(Ljava/lang/Class;)Ljava/util/List;

    move-result-object p0

    .line 4
    new-instance v0, LA/d;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, LA/d;-><init>(I)V

    invoke-interface {p0, v0}, Ljava/util/List;->sort(Ljava/util/Comparator;)V

    return-object p0
.end method


# virtual methods
.method public addText(Ljava/lang/CharSequence;)V
    .locals 5

    .line 1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/16 v1, 0x1000

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    .line 2
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object p1

    .line 3
    array-length v0, p1

    invoke-virtual {p0, p1, v2, v0}, Lorg/apache/tika/language/detect/LanguageDetector;->addText([CII)V

    return-void

    :cond_0
    move v1, v2

    .line 4
    :goto_0
    invoke-virtual {p0}, Lorg/apache/tika/language/detect/LanguageDetector;->hasEnoughText()Z

    move-result v3

    if-nez v3, :cond_1

    if-ge v1, v0, :cond_1

    add-int/lit16 v3, v1, 0x1000

    .line 5
    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    move-result v4

    .line 6
    invoke-interface {p1, v1, v4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    .line 7
    array-length v4, v1

    invoke-virtual {p0, v1, v2, v4}, Lorg/apache/tika/language/detect/LanguageDetector;->addText([CII)V

    move v1, v3

    goto :goto_0

    :cond_1
    return-void
.end method

.method public abstract addText([CII)V
.end method

.method public detect()Lorg/apache/tika/language/detect/LanguageResult;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lorg/apache/tika/language/detect/LanguageDetector;->detectAll()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    .line 2
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/tika/language/detect/LanguageResult;

    return-object v0
.end method

.method public detect(Ljava/lang/CharSequence;)Lorg/apache/tika/language/detect/LanguageResult;
    .locals 0

    .line 3
    invoke-virtual {p0}, Lorg/apache/tika/language/detect/LanguageDetector;->reset()V

    .line 4
    invoke-virtual {p0, p1}, Lorg/apache/tika/language/detect/LanguageDetector;->addText(Ljava/lang/CharSequence;)V

    .line 5
    invoke-virtual {p0}, Lorg/apache/tika/language/detect/LanguageDetector;->detect()Lorg/apache/tika/language/detect/LanguageResult;

    move-result-object p1

    return-object p1
.end method

.method public abstract detectAll()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/apache/tika/language/detect/LanguageResult;",
            ">;"
        }
    .end annotation
.end method

.method public detectAll(Ljava/lang/String;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lorg/apache/tika/language/detect/LanguageResult;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lorg/apache/tika/language/detect/LanguageDetector;->reset()V

    .line 2
    invoke-virtual {p0, p1}, Lorg/apache/tika/language/detect/LanguageDetector;->addText(Ljava/lang/CharSequence;)V

    .line 3
    invoke-virtual {p0}, Lorg/apache/tika/language/detect/LanguageDetector;->detectAll()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public hasEnoughText()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract hasModel(Ljava/lang/String;)Z
.end method

.method public isMixedLanguages()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/tika/language/detect/LanguageDetector;->mixedLanguages:Z

    .line 2
    .line 3
    return v0
.end method

.method public isShortText()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/tika/language/detect/LanguageDetector;->shortText:Z

    .line 2
    .line 3
    return v0
.end method

.method public abstract loadModels()Lorg/apache/tika/language/detect/LanguageDetector;
.end method

.method public abstract loadModels(Ljava/util/Set;)Lorg/apache/tika/language/detect/LanguageDetector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/apache/tika/language/detect/LanguageDetector;"
        }
    .end annotation
.end method

.method public abstract reset()V
.end method

.method public setMixedLanguages(Z)Lorg/apache/tika/language/detect/LanguageDetector;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/apache/tika/language/detect/LanguageDetector;->mixedLanguages:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public abstract setPriors(Ljava/util/Map;)Lorg/apache/tika/language/detect/LanguageDetector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Float;",
            ">;)",
            "Lorg/apache/tika/language/detect/LanguageDetector;"
        }
    .end annotation
.end method

.method public setShortText(Z)Lorg/apache/tika/language/detect/LanguageDetector;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/apache/tika/language/detect/LanguageDetector;->shortText:Z

    .line 2
    .line 3
    return-object p0
.end method

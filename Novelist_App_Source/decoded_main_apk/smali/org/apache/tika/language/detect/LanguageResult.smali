.class public Lorg/apache/tika/language/detect/LanguageResult;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final NULL:Lorg/apache/tika/language/detect/LanguageResult;


# instance fields
.field private final confidence:Lorg/apache/tika/language/detect/LanguageConfidence;

.field private final language:Ljava/lang/String;

.field private final rawScore:F


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lorg/apache/tika/language/detect/LanguageResult;

    .line 2
    .line 3
    sget-object v1, Lorg/apache/tika/language/detect/LanguageConfidence;->NONE:Lorg/apache/tika/language/detect/LanguageConfidence;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, ""

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lorg/apache/tika/language/detect/LanguageResult;-><init>(Ljava/lang/String;Lorg/apache/tika/language/detect/LanguageConfidence;F)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lorg/apache/tika/language/detect/LanguageResult;->NULL:Lorg/apache/tika/language/detect/LanguageResult;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/apache/tika/language/detect/LanguageConfidence;F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/apache/tika/language/detect/LanguageResult;->language:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lorg/apache/tika/language/detect/LanguageResult;->confidence:Lorg/apache/tika/language/detect/LanguageConfidence;

    .line 7
    .line 8
    iput p3, p0, Lorg/apache/tika/language/detect/LanguageResult;->rawScore:F

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public getConfidence()Lorg/apache/tika/language/detect/LanguageConfidence;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/language/detect/LanguageResult;->confidence:Lorg/apache/tika/language/detect/LanguageConfidence;

    .line 2
    .line 3
    return-object v0
.end method

.method public getLanguage()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/language/detect/LanguageResult;->language:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRawScore()F
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/tika/language/detect/LanguageResult;->rawScore:F

    .line 2
    .line 3
    return v0
.end method

.method public isLanguage(Ljava/lang/String;)Z
    .locals 6

    .line 1
    const-string v0, "\\-"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v1, p0, Lorg/apache/tika/language/detect/LanguageResult;->language:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    array-length v1, p1

    .line 14
    array-length v2, v0

    .line 15
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    move v3, v2

    .line 21
    :goto_0
    if-ge v3, v1, :cond_1

    .line 22
    .line 23
    aget-object v4, p1, v3

    .line 24
    .line 25
    aget-object v5, v0, v3

    .line 26
    .line 27
    invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-nez v4, :cond_0

    .line 32
    .line 33
    return v2

    .line 34
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 p1, 0x1

    .line 38
    return p1
.end method

.method public isReasonablyCertain()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/tika/language/detect/LanguageResult;->confidence:Lorg/apache/tika/language/detect/LanguageConfidence;

    .line 2
    .line 3
    sget-object v1, Lorg/apache/tika/language/detect/LanguageConfidence;->HIGH:Lorg/apache/tika/language/detect/LanguageConfidence;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public isUnknown()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/tika/language/detect/LanguageResult;->confidence:Lorg/apache/tika/language/detect/LanguageConfidence;

    .line 2
    .line 3
    sget-object v1, Lorg/apache/tika/language/detect/LanguageConfidence;->NONE:Lorg/apache/tika/language/detect/LanguageConfidence;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/apache/tika/language/detect/LanguageResult;->language:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lorg/apache/tika/language/detect/LanguageResult;->confidence:Lorg/apache/tika/language/detect/LanguageConfidence;

    .line 6
    .line 7
    iget v3, p0, Lorg/apache/tika/language/detect/LanguageResult;->rawScore:F

    .line 8
    .line 9
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    filled-new-array {v1, v2, v3}, [Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "%s: %s (%f)"

    .line 18
    .line 19
    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0
.end method

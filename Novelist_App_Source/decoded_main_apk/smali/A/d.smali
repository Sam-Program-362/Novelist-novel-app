.class public final synthetic LA/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LA/d;->k:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4

    .line 1
    iget v0, p0, LA/d;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1, p2}, Lorg/apache/tika/utils/CompareUtils;->compareClassName(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :pswitch_0
    check-cast p1, Lorg/apache/tika/language/detect/LanguageDetector;

    .line 12
    .line 13
    check-cast p2, Lorg/apache/tika/language/detect/LanguageDetector;

    .line 14
    .line 15
    :goto_0
    invoke-static {p1, p2}, Lorg/apache/tika/utils/CompareUtils;->compareClassName(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :pswitch_1
    check-cast p1, Lorg/apache/tika/language/translate/Translator;

    .line 21
    .line 22
    check-cast p2, Lorg/apache/tika/language/translate/Translator;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :pswitch_2
    check-cast p1, [B

    .line 26
    .line 27
    check-cast p2, [B

    .line 28
    .line 29
    array-length v0, p1

    .line 30
    array-length v1, p2

    .line 31
    if-eq v0, v1, :cond_0

    .line 32
    .line 33
    array-length p1, p1

    .line 34
    array-length p2, p2

    .line 35
    sub-int/2addr p1, p2

    .line 36
    goto :goto_2

    .line 37
    :cond_0
    const/4 v0, 0x0

    .line 38
    move v1, v0

    .line 39
    :goto_1
    array-length v2, p1

    .line 40
    if-ge v1, v2, :cond_2

    .line 41
    .line 42
    aget-byte v2, p1, v1

    .line 43
    .line 44
    aget-byte v3, p2, v1

    .line 45
    .line 46
    if-eq v2, v3, :cond_1

    .line 47
    .line 48
    sub-int p1, v2, v3

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    move p1, v0

    .line 55
    :goto_2
    return p1

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

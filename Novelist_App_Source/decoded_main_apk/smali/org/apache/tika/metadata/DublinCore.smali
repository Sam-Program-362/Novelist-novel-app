.class public interface abstract Lorg/apache/tika/metadata/DublinCore;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final CONTRIBUTOR:Lorg/apache/tika/metadata/Property;

.field public static final COVERAGE:Lorg/apache/tika/metadata/Property;

.field public static final CREATED:Lorg/apache/tika/metadata/Property;

.field public static final CREATOR:Lorg/apache/tika/metadata/Property;

.field public static final DATE:Lorg/apache/tika/metadata/Property;

.field public static final DESCRIPTION:Lorg/apache/tika/metadata/Property;

.field public static final FORMAT:Lorg/apache/tika/metadata/Property;

.field public static final IDENTIFIER:Lorg/apache/tika/metadata/Property;

.field public static final LANGUAGE:Lorg/apache/tika/metadata/Property;

.field public static final MODIFIED:Lorg/apache/tika/metadata/Property;

.field public static final NAMESPACE_URI_DC:Ljava/lang/String; = "http://purl.org/dc/elements/1.1/"

.field public static final NAMESPACE_URI_DC_TERMS:Ljava/lang/String; = "http://purl.org/dc/terms/"

.field public static final PREFIX_DC:Ljava/lang/String; = "dc"

.field public static final PREFIX_DC_TERMS:Ljava/lang/String; = "dcterms"

.field public static final PUBLISHER:Lorg/apache/tika/metadata/Property;

.field public static final RELATION:Lorg/apache/tika/metadata/Property;

.field public static final RIGHTS:Lorg/apache/tika/metadata/Property;

.field public static final SOURCE:Lorg/apache/tika/metadata/Property;

.field public static final SUBJECT:Lorg/apache/tika/metadata/Property;

.field public static final TITLE:Lorg/apache/tika/metadata/Property;

.field public static final TYPE:Lorg/apache/tika/metadata/Property;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "dc:format"

    .line 2
    .line 3
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lorg/apache/tika/metadata/DublinCore;->FORMAT:Lorg/apache/tika/metadata/Property;

    .line 8
    .line 9
    const-string v0, "dc:identifier"

    .line 10
    .line 11
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lorg/apache/tika/metadata/DublinCore;->IDENTIFIER:Lorg/apache/tika/metadata/Property;

    .line 16
    .line 17
    const-string v0, "dcterms:modified"

    .line 18
    .line 19
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalDate(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lorg/apache/tika/metadata/DublinCore;->MODIFIED:Lorg/apache/tika/metadata/Property;

    .line 24
    .line 25
    const-string v0, "dc:contributor"

    .line 26
    .line 27
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lorg/apache/tika/metadata/DublinCore;->CONTRIBUTOR:Lorg/apache/tika/metadata/Property;

    .line 32
    .line 33
    const-string v0, "dc:coverage"

    .line 34
    .line 35
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lorg/apache/tika/metadata/DublinCore;->COVERAGE:Lorg/apache/tika/metadata/Property;

    .line 40
    .line 41
    const-string v0, "dc:creator"

    .line 42
    .line 43
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lorg/apache/tika/metadata/DublinCore;->CREATOR:Lorg/apache/tika/metadata/Property;

    .line 48
    .line 49
    const-string v0, "dcterms:created"

    .line 50
    .line 51
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalDate(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, Lorg/apache/tika/metadata/DublinCore;->CREATED:Lorg/apache/tika/metadata/Property;

    .line 56
    .line 57
    const-string v0, "dc:date"

    .line 58
    .line 59
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalDate(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sput-object v0, Lorg/apache/tika/metadata/DublinCore;->DATE:Lorg/apache/tika/metadata/Property;

    .line 64
    .line 65
    const-string v0, "dc:description"

    .line 66
    .line 67
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    sput-object v0, Lorg/apache/tika/metadata/DublinCore;->DESCRIPTION:Lorg/apache/tika/metadata/Property;

    .line 72
    .line 73
    const-string v0, "dc:language"

    .line 74
    .line 75
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    sput-object v0, Lorg/apache/tika/metadata/DublinCore;->LANGUAGE:Lorg/apache/tika/metadata/Property;

    .line 80
    .line 81
    const-string v0, "dc:publisher"

    .line 82
    .line 83
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    sput-object v0, Lorg/apache/tika/metadata/DublinCore;->PUBLISHER:Lorg/apache/tika/metadata/Property;

    .line 88
    .line 89
    const-string v0, "dc:relation"

    .line 90
    .line 91
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    sput-object v0, Lorg/apache/tika/metadata/DublinCore;->RELATION:Lorg/apache/tika/metadata/Property;

    .line 96
    .line 97
    const-string v0, "dc:rights"

    .line 98
    .line 99
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    sput-object v0, Lorg/apache/tika/metadata/DublinCore;->RIGHTS:Lorg/apache/tika/metadata/Property;

    .line 104
    .line 105
    const-string v0, "dc:source"

    .line 106
    .line 107
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    sput-object v0, Lorg/apache/tika/metadata/DublinCore;->SOURCE:Lorg/apache/tika/metadata/Property;

    .line 112
    .line 113
    const-string v0, "dc:subject"

    .line 114
    .line 115
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    sput-object v0, Lorg/apache/tika/metadata/DublinCore;->SUBJECT:Lorg/apache/tika/metadata/Property;

    .line 120
    .line 121
    const-string v0, "dc:title"

    .line 122
    .line 123
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    sput-object v0, Lorg/apache/tika/metadata/DublinCore;->TITLE:Lorg/apache/tika/metadata/Property;

    .line 128
    .line 129
    const-string v0, "dc:type"

    .line 130
    .line 131
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    sput-object v0, Lorg/apache/tika/metadata/DublinCore;->TYPE:Lorg/apache/tika/metadata/Property;

    .line 136
    .line 137
    return-void
.end method

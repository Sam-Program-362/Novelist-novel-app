.class public Lorg/apache/tika/metadata/filter/DateNormalizingMetadataFilter;
.super Lorg/apache/tika/metadata/filter/MetadataFilter;
.source "SourceFile"


# static fields
.field private static final LOGGER:LF2/b;

.field private static UTC:Ljava/util/TimeZone;


# instance fields
.field private defaultTimeZone:Ljava/util/TimeZone;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "UTC"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lorg/apache/tika/metadata/filter/DateNormalizingMetadataFilter;->UTC:Ljava/util/TimeZone;

    .line 8
    .line 9
    const-class v0, Lorg/apache/tika/metadata/filter/DateNormalizingMetadataFilter;

    .line 10
    .line 11
    invoke-static {v0}, LF2/d;->b(Ljava/lang/Class;)LF2/b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lorg/apache/tika/metadata/filter/DateNormalizingMetadataFilter;->LOGGER:LF2/b;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/apache/tika/metadata/filter/MetadataFilter;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lorg/apache/tika/metadata/filter/DateNormalizingMetadataFilter;->UTC:Ljava/util/TimeZone;

    .line 5
    .line 6
    iput-object v0, p0, Lorg/apache/tika/metadata/filter/DateNormalizingMetadataFilter;->defaultTimeZone:Ljava/util/TimeZone;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public filter(Lorg/apache/tika/metadata/Metadata;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Lorg/apache/tika/metadata/Metadata;->names()[Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    move v4, v3

    .line 9
    move-object v3, v2

    .line 10
    :goto_0
    if-ge v4, v1, :cond_3

    .line 11
    .line 12
    aget-object v5, v0, v4

    .line 13
    .line 14
    invoke-static {v5}, Lorg/apache/tika/metadata/Property;->get(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    if-eqz v5, :cond_2

    .line 19
    .line 20
    invoke-virtual {v5}, Lorg/apache/tika/metadata/Property;->getValueType()Lorg/apache/tika/metadata/Property$ValueType;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    sget-object v7, Lorg/apache/tika/metadata/Property$ValueType;->DATE:Lorg/apache/tika/metadata/Property$ValueType;

    .line 25
    .line 26
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    if-eqz v6, :cond_2

    .line 31
    .line 32
    invoke-virtual {p1, v5}, Lorg/apache/tika/metadata/Metadata;->get(Lorg/apache/tika/metadata/Property;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    const-string v7, "Z"

    .line 37
    .line 38
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    if-eqz v7, :cond_0

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    if-nez v2, :cond_1

    .line 46
    .line 47
    new-instance v2, Ljava/text/SimpleDateFormat;

    .line 48
    .line 49
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 50
    .line 51
    const-string v7, "yyyy-MM-dd\'T\'HH:mm:ss"

    .line 52
    .line 53
    invoke-direct {v2, v7, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 54
    .line 55
    .line 56
    iget-object v7, p0, Lorg/apache/tika/metadata/filter/DateNormalizingMetadataFilter;->defaultTimeZone:Ljava/util/TimeZone;

    .line 57
    .line 58
    invoke-virtual {v2, v7}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 59
    .line 60
    .line 61
    new-instance v7, Ljava/text/SimpleDateFormat;

    .line 62
    .line 63
    const-string v8, "yyyy-MM-dd\'T\'HH:mm:ss\'Z\'"

    .line 64
    .line 65
    invoke-direct {v7, v8, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 66
    .line 67
    .line 68
    sget-object v3, Lorg/apache/tika/metadata/filter/DateNormalizingMetadataFilter;->UTC:Ljava/util/TimeZone;

    .line 69
    .line 70
    invoke-virtual {v7, v3}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 71
    .line 72
    .line 73
    move-object v3, v7

    .line 74
    :cond_1
    :try_start_0
    invoke-virtual {v2, v6}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    invoke-virtual {v3, v7}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    invoke-virtual {p1, v5, v7}, Lorg/apache/tika/metadata/Metadata;->set(Lorg/apache/tika/metadata/Property;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :catch_0
    sget-object v5, Lorg/apache/tika/metadata/filter/DateNormalizingMetadataFilter;->LOGGER:LF2/b;

    .line 87
    .line 88
    new-instance v7, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    const-string v8, "Couldn\'t convert date to default time zone: >"

    .line 91
    .line 92
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string v6, "<"

    .line 99
    .line 100
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    invoke-interface {v5, v6}, LF2/b;->m(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    :cond_2
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_3
    return-void
.end method

.method public getDefaultTimeZone()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/metadata/filter/DateNormalizingMetadataFilter;->defaultTimeZone:Ljava/util/TimeZone;

    .line 2
    .line 3
    invoke-static {v0}, Lorg/apache/tika/fork/a;->o(Ljava/util/TimeZone;)Ljava/time/ZoneId;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lorg/apache/tika/fork/a;->d(Ljava/time/ZoneId;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public setDefaultTimeZone(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lorg/apache/tika/config/Field;
    .end annotation

    .line 1
    invoke-static {p1}, Lorg/apache/tika/fork/a;->n(Ljava/lang/String;)Ljava/time/ZoneId;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Lorg/apache/tika/fork/a;->q(Ljava/time/ZoneId;)Ljava/util/TimeZone;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lorg/apache/tika/metadata/filter/DateNormalizingMetadataFilter;->defaultTimeZone:Ljava/util/TimeZone;

    .line 10
    .line 11
    return-void
.end method

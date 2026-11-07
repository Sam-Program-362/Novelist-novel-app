.class public Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/apache/tika/metadata/writefilter/MetadataWriteFilter;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/tika/metadata/writefilter/StandardWriteFilter$StringSizePair;
    }
.end annotation


# static fields
.field public static final ALWAYS_ADD_FIELDS:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final ALWAYS_SET_FIELDS:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final METADATA_TRUNCATED_KEY:Ljava/lang/String;

.field private static final TIKA_CONTENT_KEY:Ljava/lang/String;

.field private static final TRUE:[Ljava/lang/String;


# instance fields
.field estimatedSize:I

.field private final excludeFields:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private fieldSizes:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final includeEmpty:Z

.field private final includeFields:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final maxFieldSize:I

.field private final maxKeySize:I

.field private final maxTotalEstimatedSize:I

.field private final maxValuesPerField:I

.field private final minimumMaxFieldSizeInAlwaysFields:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->ALWAYS_SET_FIELDS:Ljava/util/Set;

    .line 7
    .line 8
    new-instance v1, Ljava/util/HashSet;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->ALWAYS_ADD_FIELDS:Ljava/util/Set;

    .line 14
    .line 15
    const-string v2, "Content-Length"

    .line 16
    .line 17
    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    const-string v2, "Content-Type"

    .line 21
    .line 22
    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    const-string v2, "Content-Encoding"

    .line 26
    .line 27
    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    sget-object v2, Lorg/apache/tika/metadata/TikaCoreProperties;->CONTENT_TYPE_USER_OVERRIDE:Lorg/apache/tika/metadata/Property;

    .line 31
    .line 32
    invoke-virtual {v2}, Lorg/apache/tika/metadata/Property;->getName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    sget-object v2, Lorg/apache/tika/metadata/TikaCoreProperties;->CONTENT_TYPE_PARSER_OVERRIDE:Lorg/apache/tika/metadata/Property;

    .line 40
    .line 41
    invoke-virtual {v2}, Lorg/apache/tika/metadata/Property;->getName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    sget-object v2, Lorg/apache/tika/metadata/TikaCoreProperties;->CONTENT_TYPE_HINT:Lorg/apache/tika/metadata/Property;

    .line 49
    .line 50
    invoke-virtual {v2}, Lorg/apache/tika/metadata/Property;->getName()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    sget-object v2, Lorg/apache/tika/metadata/TikaCoreProperties;->TIKA_CONTENT:Lorg/apache/tika/metadata/Property;

    .line 58
    .line 59
    invoke-virtual {v2}, Lorg/apache/tika/metadata/Property;->getName()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    const-string v3, "resourceName"

    .line 67
    .line 68
    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    sget-object v3, Lorg/apache/tika/metadata/AccessPermissions;->EXTRACT_CONTENT:Lorg/apache/tika/metadata/Property;

    .line 72
    .line 73
    invoke-virtual {v3}, Lorg/apache/tika/metadata/Property;->getName()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    sget-object v3, Lorg/apache/tika/metadata/AccessPermissions;->EXTRACT_FOR_ACCESSIBILITY:Lorg/apache/tika/metadata/Property;

    .line 81
    .line 82
    invoke-virtual {v3}, Lorg/apache/tika/metadata/Property;->getName()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    const-string v3, "Content-Disposition"

    .line 90
    .line 91
    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    sget-object v3, Lorg/apache/tika/metadata/TikaCoreProperties;->CONTAINER_EXCEPTION:Lorg/apache/tika/metadata/Property;

    .line 95
    .line 96
    invoke-virtual {v3}, Lorg/apache/tika/metadata/Property;->getName()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    sget-object v3, Lorg/apache/tika/metadata/TikaCoreProperties;->EMBEDDED_EXCEPTION:Lorg/apache/tika/metadata/Property;

    .line 104
    .line 105
    invoke-virtual {v3}, Lorg/apache/tika/metadata/Property;->getName()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    sget-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->TIKA_PARSED_BY:Lorg/apache/tika/metadata/Property;

    .line 113
    .line 114
    invoke-virtual {v0}, Lorg/apache/tika/metadata/Property;->getName()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    sget-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->TRUNCATED_METADATA:Lorg/apache/tika/metadata/Property;

    .line 122
    .line 123
    invoke-virtual {v0}, Lorg/apache/tika/metadata/Property;->getName()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    sput-object v0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->METADATA_TRUNCATED_KEY:Ljava/lang/String;

    .line 128
    .line 129
    invoke-virtual {v2}, Lorg/apache/tika/metadata/Property;->getName()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    sput-object v0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->TIKA_CONTENT_KEY:Ljava/lang/String;

    .line 134
    .line 135
    const-string v0, "true"

    .line 136
    .line 137
    filled-new-array {v0}, [Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    sput-object v0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->TRUE:[Ljava/lang/String;

    .line 142
    .line 143
    return-void
.end method

.method public constructor <init>(IIIILjava/util/Set;Ljava/util/Set;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIII",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x12c

    .line 5
    .line 6
    iput v0, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->minimumMaxFieldSizeInAlwaysFields:I

    .line 7
    .line 8
    new-instance v0, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->fieldSizes:Ljava/util/Map;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput v0, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->estimatedSize:I

    .line 17
    .line 18
    iput p1, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->maxKeySize:I

    .line 19
    .line 20
    iput p2, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->maxFieldSize:I

    .line 21
    .line 22
    iput p3, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->maxTotalEstimatedSize:I

    .line 23
    .line 24
    iput p4, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->maxValuesPerField:I

    .line 25
    .line 26
    iput-object p5, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->includeFields:Ljava/util/Set;

    .line 27
    .line 28
    iput-object p6, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->excludeFields:Ljava/util/Set;

    .line 29
    .line 30
    iput-boolean p7, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->includeEmpty:Z

    .line 31
    .line 32
    return-void
.end method

.method private addAlwaysInclude(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->TIKA_CONTENT_KEY:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    filled-new-array {p2}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-interface {p3, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-interface {p3, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    invoke-direct {p0, p1, p2, p3}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->setAlwaysInclude(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    invoke-static {p2}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->estimateSize(Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const/16 v1, 0x12c

    .line 32
    .line 33
    iget v2, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->maxFieldSize:I

    .line 34
    .line 35
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-le v0, v1, :cond_2

    .line 40
    .line 41
    invoke-direct {p0, p2, v1, p3}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->truncate(Ljava/lang/String;ILjava/util/Map;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-static {p2}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->estimateSize(Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    :cond_2
    invoke-interface {p3, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_3

    .line 54
    .line 55
    const/4 v1, 0x0

    .line 56
    goto :goto_0

    .line 57
    :cond_3
    invoke-static {p1}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->estimateSize(Ljava/lang/String;)I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    :goto_0
    add-int/2addr v1, v0

    .line 62
    iget v0, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->estimatedSize:I

    .line 63
    .line 64
    add-int/2addr v0, v1

    .line 65
    iput v0, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->estimatedSize:I

    .line 66
    .line 67
    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, [Ljava/lang/String;

    .line 72
    .line 73
    invoke-direct {p0, v0, p2}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->appendValue([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    invoke-interface {p3, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method private appendValue([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
    .locals 4

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-object p1

    .line 4
    :cond_0
    array-length v0, p1

    .line 5
    add-int/lit8 v1, v0, 0x1

    .line 6
    .line 7
    new-array v1, v1, [Ljava/lang/String;

    .line 8
    .line 9
    array-length v2, p1

    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {p1, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 12
    .line 13
    .line 14
    aput-object p2, v1, v0

    .line 15
    .line 16
    return-object v1
.end method

.method private static estimateSize(Ljava/lang/String;)I
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    mul-int/lit8 p0, p0, 0x2

    .line 10
    .line 11
    return p0
.end method

.method private filterKey(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lorg/apache/tika/metadata/writefilter/StandardWriteFilter$StringSizePair;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/apache/tika/metadata/writefilter/StandardWriteFilter$StringSizePair;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->estimateSize(Ljava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    iget v0, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->maxKeySize:I

    .line 6
    .line 7
    if-gt p2, v0, :cond_0

    .line 8
    .line 9
    new-instance p3, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter$StringSizePair;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {p3, p1, p2, v0}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter$StringSizePair;-><init>(Ljava/lang/String;IZ)V

    .line 13
    .line 14
    .line 15
    return-object p3

    .line 16
    :cond_0
    invoke-direct {p0, p1, v0, p3}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->truncate(Ljava/lang/String;ILjava/util/Map;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    new-instance p2, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter$StringSizePair;

    .line 21
    .line 22
    invoke-static {p1}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->estimateSize(Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result p3

    .line 26
    const/4 v0, 0x1

    .line 27
    invoke-direct {p2, p1, p3, v0}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter$StringSizePair;-><init>(Ljava/lang/String;IZ)V

    .line 28
    .line 29
    .line 30
    return-object p2
.end method

.method private include(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->includeField(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-direct {p0, p2}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->includeValue(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    return p1
.end method

.method private includeField(Ljava/lang/String;)Z
    .locals 3

    .line 1
    if-eqz p1, :cond_4

    .line 2
    .line 3
    sget-object v0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->ALWAYS_SET_FIELDS:Ljava/util/Set;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    iget-object v0, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->excludeFields:Ljava/util/Set;

    .line 14
    .line 15
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    return v2

    .line 23
    :cond_1
    iget-object v0, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->includeFields:Ljava/util/Set;

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_3

    .line 30
    .line 31
    iget-object v0, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->includeFields:Ljava/util/Set;

    .line 32
    .line 33
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    return v2

    .line 41
    :cond_3
    :goto_0
    return v1

    .line 42
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    .line 43
    .line 44
    const-string v0, "property name must not be null"

    .line 45
    .line 46
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1
.end method

.method private includeValue(Ljava/lang/String;)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->includeEmpty:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-static {p1}, Lorg/apache/tika/utils/StringUtils;->isBlank(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    return p1

    .line 15
    :cond_1
    return v1
.end method

.method private maxAllowedToAdd(Lorg/apache/tika/metadata/writefilter/StandardWriteFilter$StringSizePair;)I
    .locals 5

    .line 1
    iget-object v0, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->fieldSizes:Ljava/util/Map;

    .line 2
    .line 3
    iget-object v1, p1, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter$StringSizePair;->string:Ljava/lang/String;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/Integer;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    move v2, v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    :goto_0
    iget v3, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->maxFieldSize:I

    .line 21
    .line 22
    sub-int/2addr v3, v2

    .line 23
    iget v2, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->maxTotalEstimatedSize:I

    .line 24
    .line 25
    iget v4, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->estimatedSize:I

    .line 26
    .line 27
    sub-int/2addr v2, v4

    .line 28
    add-int/lit8 v2, v2, -0x1

    .line 29
    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    iget v1, p1, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter$StringSizePair;->size:I

    .line 33
    .line 34
    :cond_1
    sub-int/2addr v2, v1

    .line 35
    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    return p1
.end method

.method private maxAllowedToSet(Lorg/apache/tika/metadata/writefilter/StandardWriteFilter$StringSizePair;)I
    .locals 5

    .line 1
    iget-object v0, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->fieldSizes:Ljava/util/Map;

    .line 2
    .line 3
    iget-object v1, p1, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter$StringSizePair;->string:Ljava/lang/String;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/Integer;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    move v2, v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    :goto_0
    iget v3, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->maxTotalEstimatedSize:I

    .line 21
    .line 22
    iget v4, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->estimatedSize:I

    .line 23
    .line 24
    sub-int/2addr v3, v4

    .line 25
    add-int/2addr v3, v2

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    iget v1, p1, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter$StringSizePair;->size:I

    .line 29
    .line 30
    :cond_1
    sub-int/2addr v3, v1

    .line 31
    iget p1, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->maxFieldSize:I

    .line 32
    .line 33
    invoke-static {p1, v3}, Ljava/lang/Math;->min(II)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    return p1
.end method

.method private setAlwaysInclude(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->TIKA_CONTENT_KEY:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    filled-new-array {p2}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-interface {p3, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-static {p2}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->estimateSize(Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/16 v1, 0x12c

    .line 22
    .line 23
    iget v2, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->maxFieldSize:I

    .line 24
    .line 25
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-le v0, v1, :cond_1

    .line 30
    .line 31
    invoke-direct {p0, p2, v1, p3}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->truncate(Ljava/lang/String;ILjava/util/Map;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-static {p2}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->estimateSize(Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    :cond_1
    invoke-interface {p3, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const/4 v2, 0x0

    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    move v1, v2

    .line 47
    goto :goto_0

    .line 48
    :cond_2
    invoke-static {p1}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->estimateSize(Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    :goto_0
    add-int/2addr v1, v0

    .line 53
    invoke-interface {p3, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, [Ljava/lang/String;

    .line 64
    .line 65
    array-length v3, v0

    .line 66
    if-lez v3, :cond_3

    .line 67
    .line 68
    aget-object v0, v0, v2

    .line 69
    .line 70
    invoke-static {v0}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->estimateSize(Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    sub-int/2addr v1, v0

    .line 75
    :cond_3
    iget v0, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->estimatedSize:I

    .line 76
    .line 77
    add-int/2addr v0, v1

    .line 78
    iput v0, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->estimatedSize:I

    .line 79
    .line 80
    filled-new-array {p2}, [Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    invoke-interface {p3, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method private setFilterKey(Lorg/apache/tika/metadata/writefilter/StandardWriteFilter$StringSizePair;Ljava/lang/String;Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/tika/metadata/writefilter/StandardWriteFilter$StringSizePair;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p1, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter$StringSizePair;->string:Ljava/lang/String;

    .line 2
    .line 3
    invoke-interface {p3, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget v0, p1, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter$StringSizePair;->size:I

    .line 10
    .line 11
    iget v1, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->estimatedSize:I

    .line 12
    .line 13
    add-int/2addr v0, v1

    .line 14
    iget v1, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->maxTotalEstimatedSize:I

    .line 15
    .line 16
    if-le v0, v1, :cond_0

    .line 17
    .line 18
    invoke-direct {p0, p3}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->setTruncated(Ljava/util/Map;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    iget-object v0, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->fieldSizes:Ljava/util/Map;

    .line 23
    .line 24
    iget-object v1, p1, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter$StringSizePair;->string:Ljava/lang/String;

    .line 25
    .line 26
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Ljava/lang/Integer;

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    move v2, v1

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    :goto_0
    invoke-direct {p0, p1}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->maxAllowedToSet(Lorg/apache/tika/metadata/writefilter/StandardWriteFilter$StringSizePair;)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-gtz v3, :cond_2

    .line 46
    .line 47
    invoke-direct {p0, p3}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->setTruncated(Ljava/util/Map;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_2
    invoke-static {p2}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->estimateSize(Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-le v4, v3, :cond_3

    .line 56
    .line 57
    invoke-direct {p0, p2, v3, p3}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->truncate(Ljava/lang/String;ILjava/util/Map;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    invoke-static {p2}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->estimateSize(Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    if-nez v4, :cond_3

    .line 66
    .line 67
    return-void

    .line 68
    :cond_3
    if-nez v0, :cond_4

    .line 69
    .line 70
    iget v1, p1, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter$StringSizePair;->size:I

    .line 71
    .line 72
    :cond_4
    sub-int v0, v4, v2

    .line 73
    .line 74
    add-int/2addr v0, v1

    .line 75
    iget v1, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->estimatedSize:I

    .line 76
    .line 77
    add-int/2addr v1, v0

    .line 78
    iput v1, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->estimatedSize:I

    .line 79
    .line 80
    iget-object v0, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->fieldSizes:Ljava/util/Map;

    .line 81
    .line 82
    iget-object v1, p1, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter$StringSizePair;->string:Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    iget-object p1, p1, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter$StringSizePair;->string:Ljava/lang/String;

    .line 92
    .line 93
    filled-new-array {p2}, [Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    invoke-interface {p3, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    return-void
.end method

.method private setTruncated(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->METADATA_TRUNCATED_KEY:Ljava/lang/String;

    .line 2
    .line 3
    sget-object v1, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->TRUE:[Ljava/lang/String;

    .line 4
    .line 5
    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private truncate(Ljava/lang/String;ILjava/util/Map;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p3}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->setTruncated(Ljava/util/Map;)V

    .line 2
    .line 3
    .line 4
    sget-object p3, Ljava/nio/charset/StandardCharsets;->UTF_16BE:Ljava/nio/charset/Charset;

    .line 5
    .line 6
    invoke-virtual {p1, p3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-static {p1, v0, p2}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p2}, Ljava/nio/CharBuffer;->allocate(I)Ljava/nio/CharBuffer;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-virtual {p3}, Ljava/nio/charset/Charset;->newDecoder()Ljava/nio/charset/CharsetDecoder;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    sget-object v1, Ljava/nio/charset/CodingErrorAction;->IGNORE:Ljava/nio/charset/CodingErrorAction;

    .line 24
    .line 25
    invoke-virtual {p3, v1}, Ljava/nio/charset/CharsetDecoder;->onMalformedInput(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-virtual {p3, p1, p2, v1}, Ljava/nio/charset/CharsetDecoder;->decode(Ljava/nio/ByteBuffer;Ljava/nio/CharBuffer;Z)Ljava/nio/charset/CoderResult;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p3, p2}, Ljava/nio/charset/CharsetDecoder;->flush(Ljava/nio/CharBuffer;)Ljava/nio/charset/CoderResult;

    .line 33
    .line 34
    .line 35
    new-instance p1, Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {p2}, Ljava/nio/CharBuffer;->array()[C

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    invoke-virtual {p2}, Ljava/nio/Buffer;->position()I

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    invoke-direct {p1, p3, v0, p2}, Ljava/lang/String;-><init>([CII)V

    .line 46
    .line 47
    .line 48
    return-object p1
.end method


# virtual methods
.method public add(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->include(Ljava/lang/String;Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    sget-object v0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->ALWAYS_SET_FIELDS:Ljava/util/Set;

    .line 9
    .line 10
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-direct {p0, p1, p2, p3}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->setAlwaysInclude(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    sget-object v0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->ALWAYS_ADD_FIELDS:Ljava/util/Set;

    .line 21
    .line 22
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    invoke-direct {p0, p1, p2, p3}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->addAlwaysInclude(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->filterKey(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lorg/apache/tika/metadata/writefilter/StandardWriteFilter$StringSizePair;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iget-object v0, p1, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter$StringSizePair;->string:Ljava/lang/String;

    .line 37
    .line 38
    invoke-interface {p3, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_3

    .line 43
    .line 44
    invoke-direct {p0, p1, p2, p3}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->setFilterKey(Lorg/apache/tika/metadata/writefilter/StandardWriteFilter$StringSizePair;Ljava/lang/String;Ljava/util/Map;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_3
    iget-object v0, p1, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter$StringSizePair;->string:Ljava/lang/String;

    .line 49
    .line 50
    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, [Ljava/lang/String;

    .line 55
    .line 56
    if-eqz v0, :cond_4

    .line 57
    .line 58
    array-length v0, v0

    .line 59
    iget v1, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->maxValuesPerField:I

    .line 60
    .line 61
    if-lt v0, v1, :cond_4

    .line 62
    .line 63
    invoke-direct {p0, p3}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->setTruncated(Ljava/util/Map;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_4
    iget-object v0, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->fieldSizes:Ljava/util/Map;

    .line 68
    .line 69
    iget-object v1, p1, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter$StringSizePair;->string:Ljava/lang/String;

    .line 70
    .line 71
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, Ljava/lang/Integer;

    .line 76
    .line 77
    if-nez v0, :cond_5

    .line 78
    .line 79
    const/4 v1, 0x0

    .line 80
    goto :goto_0

    .line 81
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    :goto_0
    invoke-direct {p0, p1}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->maxAllowedToAdd(Lorg/apache/tika/metadata/writefilter/StandardWriteFilter$StringSizePair;)I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-gtz v2, :cond_6

    .line 90
    .line 91
    invoke-direct {p0, p3}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->setTruncated(Ljava/util/Map;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_6
    invoke-static {p2}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->estimateSize(Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-le v3, v2, :cond_7

    .line 100
    .line 101
    invoke-direct {p0, p2, v2, p3}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->truncate(Ljava/lang/String;ILjava/util/Map;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    invoke-static {p2}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->estimateSize(Ljava/lang/String;)I

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-nez v3, :cond_7

    .line 110
    .line 111
    :goto_1
    return-void

    .line 112
    :cond_7
    if-nez v0, :cond_8

    .line 113
    .line 114
    iget v0, p1, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter$StringSizePair;->size:I

    .line 115
    .line 116
    add-int/2addr v0, v3

    .line 117
    goto :goto_2

    .line 118
    :cond_8
    move v0, v3

    .line 119
    :goto_2
    iget v2, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->estimatedSize:I

    .line 120
    .line 121
    add-int/2addr v2, v0

    .line 122
    iput v2, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->estimatedSize:I

    .line 123
    .line 124
    iget-object v0, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->fieldSizes:Ljava/util/Map;

    .line 125
    .line 126
    iget-object v2, p1, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter$StringSizePair;->string:Ljava/lang/String;

    .line 127
    .line 128
    add-int/2addr v3, v1

    .line 129
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    iget-object p1, p1, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter$StringSizePair;->string:Ljava/lang/String;

    .line 137
    .line 138
    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    check-cast v0, [Ljava/lang/String;

    .line 143
    .line 144
    invoke-direct {p0, v0, p2}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->appendValue([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    invoke-interface {p3, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    return-void
.end method

.method public filterExisting(Ljava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_3

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Ljava/util/Map$Entry;

    .line 25
    .line 26
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Ljava/lang/String;

    .line 31
    .line 32
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, [Ljava/lang/String;

    .line 37
    .line 38
    invoke-direct {p0, v3}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->includeField(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-nez v4, :cond_1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const/4 v4, 0x0

    .line 46
    :goto_1
    array-length v5, v2

    .line 47
    if-ge v4, v5, :cond_0

    .line 48
    .line 49
    aget-object v5, v2, v4

    .line 50
    .line 51
    invoke-direct {p0, v3, v5}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->include(Ljava/lang/String;Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-eqz v6, :cond_2

    .line 56
    .line 57
    invoke-virtual {p0, v3, v5, v0}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->add(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 58
    .line 59
    .line 60
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    invoke-interface {p1}, Ljava/util/Map;->clear()V

    .line 64
    .line 65
    .line 66
    invoke-interface {p1, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public set(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-interface {p3, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->include(Ljava/lang/String;Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    return-void

    .line 14
    :cond_1
    sget-object v0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->ALWAYS_SET_FIELDS:Ljava/util/Set;

    .line 15
    .line 16
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_3

    .line 21
    .line 22
    sget-object v0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->ALWAYS_ADD_FIELDS:Ljava/util/Set;

    .line 23
    .line 24
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->filterKey(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lorg/apache/tika/metadata/writefilter/StandardWriteFilter$StringSizePair;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-direct {p0, p1, p2, p3}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->setFilterKey(Lorg/apache/tika/metadata/writefilter/StandardWriteFilter$StringSizePair;Ljava/lang/String;Ljava/util/Map;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_3
    :goto_0
    invoke-direct {p0, p1, p2, p3}, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;->setAlwaysInclude(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

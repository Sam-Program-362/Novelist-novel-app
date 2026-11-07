.class public abstract Lorg/apache/tika/metadata/filter/MetadataFilter;
.super Lorg/apache/tika/config/ConfigBase;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/apache/tika/config/ConfigBase;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static load(Lorg/w3c/dom/Element;Z)Lorg/apache/tika/metadata/filter/MetadataFilter;
    .locals 4

    .line 1
    :try_start_0
    const-string v0, "metadataFilters"

    .line 2
    .line 3
    const-class v1, Lorg/apache/tika/metadata/filter/CompositeMetadataFilter;

    .line 4
    .line 5
    const-string v2, "metadataFilter"

    .line 6
    .line 7
    const-class v3, Lorg/apache/tika/metadata/filter/MetadataFilter;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3, p0}, Lorg/apache/tika/config/ConfigBase;->buildComposite(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;Lorg/w3c/dom/Element;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Lorg/apache/tika/metadata/filter/MetadataFilter;
    :try_end_0
    .catch Lorg/apache/tika/exception/TikaConfigException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    return-object p0

    .line 16
    :catch_0
    move-exception p0

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string v0, "could not find metadataFilters"

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    new-instance p0, Lorg/apache/tika/metadata/filter/NoOpFilter;

    .line 32
    .line 33
    invoke-direct {p0}, Lorg/apache/tika/metadata/filter/NoOpFilter;-><init>()V

    .line 34
    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_0
    throw p0
.end method


# virtual methods
.method public abstract filter(Lorg/apache/tika/metadata/Metadata;)V
.end method

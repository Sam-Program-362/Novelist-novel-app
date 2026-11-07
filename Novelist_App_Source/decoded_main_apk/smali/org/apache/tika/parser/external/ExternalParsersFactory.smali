.class public Lorg/apache/tika/parser/external/ExternalParsersFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static attachExternalParsers(Ljava/util/List;Lorg/apache/tika/config/TikaConfig;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lorg/apache/tika/parser/external/ExternalParser;",
            ">;",
            "Lorg/apache/tika/config/TikaConfig;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-virtual {p1}, Lorg/apache/tika/config/TikaConfig;->getParser()Lorg/apache/tika/parser/Parser;

    move-result-object p0

    .line 3
    instance-of p1, p0, Lorg/apache/tika/parser/CompositeParser;

    if-eqz p1, :cond_0

    .line 4
    check-cast p0, Lorg/apache/tika/parser/CompositeParser;

    .line 5
    invoke-virtual {p0}, Lorg/apache/tika/parser/CompositeParser;->getParsers()Ljava/util/Map;

    :cond_0
    return-void
.end method

.method public static attachExternalParsers(Lorg/apache/tika/config/TikaConfig;)V
    .locals 1

    .line 1
    invoke-static {}, Lorg/apache/tika/parser/external/ExternalParsersFactory;->create()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, p0}, Lorg/apache/tika/parser/external/ExternalParsersFactory;->attachExternalParsers(Ljava/util/List;Lorg/apache/tika/config/TikaConfig;)V

    return-void
.end method

.method public static create()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/apache/tika/parser/external/ExternalParser;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lorg/apache/tika/config/ServiceLoader;

    invoke-direct {v0}, Lorg/apache/tika/config/ServiceLoader;-><init>()V

    invoke-static {v0}, Lorg/apache/tika/parser/external/ExternalParsersFactory;->create(Lorg/apache/tika/config/ServiceLoader;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static create(Ljava/lang/String;Lorg/apache/tika/config/ServiceLoader;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/apache/tika/config/ServiceLoader;",
            ")",
            "Ljava/util/List<",
            "Lorg/apache/tika/parser/external/ExternalParser;",
            ">;"
        }
    .end annotation

    .line 3
    const-class v0, Lorg/apache/tika/parser/external/ExternalParsersFactory;

    .line 4
    invoke-virtual {v0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x2e

    const/16 v2, 0x2f

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 5
    invoke-virtual {p1, p0}, Lorg/apache/tika/config/ServiceLoader;->findServiceResources(Ljava/lang/String;)Ljava/util/Enumeration;

    move-result-object p0

    .line 6
    invoke-static {p0}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    move-result-object p0

    const/4 p1, 0x0

    .line 7
    new-array p1, p1, [Ljava/net/URL;

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/net/URL;

    .line 8
    invoke-static {p0}, Lorg/apache/tika/parser/external/ExternalParsersFactory;->create([Ljava/net/URL;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static create(Lorg/apache/tika/config/ServiceLoader;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/tika/config/ServiceLoader;",
            ")",
            "Ljava/util/List<",
            "Lorg/apache/tika/parser/external/ExternalParser;",
            ">;"
        }
    .end annotation

    .line 2
    const-string v0, "tika-external-parsers.xml"

    invoke-static {v0, p0}, Lorg/apache/tika/parser/external/ExternalParsersFactory;->create(Ljava/lang/String;Lorg/apache/tika/config/ServiceLoader;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static varargs create([Ljava/net/URL;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/net/URL;",
            ")",
            "Ljava/util/List<",
            "Lorg/apache/tika/parser/external/ExternalParser;",
            ">;"
        }
    .end annotation

    .line 9
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, p0, v2

    .line 11
    invoke-virtual {v3}, Ljava/net/URL;->openStream()Ljava/io/InputStream;

    move-result-object v3

    .line 12
    :try_start_0
    invoke-static {v3}, Lorg/apache/tika/parser/external/ExternalParsersConfigReader;->read(Ljava/io/InputStream;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_0

    .line 13
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catchall_0
    move-exception p0

    if-eqz v3, :cond_1

    .line 14
    :try_start_1
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_1
    throw p0

    :cond_2
    return-object v0
.end method

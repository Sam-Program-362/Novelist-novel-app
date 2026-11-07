.class public Lorg/apache/tika/io/TemporaryResources;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field private static final LOG:LF2/b;


# instance fields
.field private final resources:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Ljava/io/Closeable;",
            ">;"
        }
    .end annotation
.end field

.field private tempFileDir:Ljava/nio/file/Path;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lorg/apache/tika/io/TemporaryResources;

    .line 2
    .line 3
    invoke-static {v0}, LF2/d;->b(Ljava/lang/Class;)LF2/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lorg/apache/tika/io/TemporaryResources;->LOG:LF2/b;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lorg/apache/tika/io/TemporaryResources;->resources:Ljava/util/LinkedList;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lorg/apache/tika/io/TemporaryResources;->tempFileDir:Ljava/nio/file/Path;

    .line 13
    .line 14
    return-void
.end method

.method public static synthetic a(Ljava/nio/file/Path;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lorg/apache/tika/io/TemporaryResources;->lambda$createTempFile$0(Ljava/nio/file/Path;)V

    return-void
.end method

.method private static synthetic lambda$createTempFile$0(Ljava/nio/file/Path;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {p0}, Lorg/apache/tika/fork/a;->t(Ljava/nio/file/Path;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catch_0
    sget-object v0, Lorg/apache/tika/io/TemporaryResources;->LOG:LF2/b;

    .line 6
    .line 7
    const-string v1, "delete tmp file fail, will delete it on exit"

    .line 8
    .line 9
    invoke-interface {v0, v1}, LF2/b;->m(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p0}, Lio/flutter/plugin/editing/i;->e(Ljava/nio/file/Path;)Ljava/io/File;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/io/File;->deleteOnExit()V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public addResource(Ljava/io/Closeable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/io/TemporaryResources;->resources:Ljava/util/LinkedList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public close()V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/apache/tika/io/TemporaryResources;->resources:Ljava/util/LinkedList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Ljava/io/Closeable;

    .line 19
    .line 20
    :try_start_0
    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catch_0
    move-exception v2

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    move-object v1, v2

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    iget-object v0, p0, Lorg/apache/tika/io/TemporaryResources;->resources:Ljava/util/LinkedList;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    .line 36
    .line 37
    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    throw v1
.end method

.method public createTempFile()Ljava/nio/file/Path;
    .locals 1

    .line 5
    const-string v0, ""

    invoke-virtual {p0, v0}, Lorg/apache/tika/io/TemporaryResources;->createTempFile(Ljava/lang/String;)Ljava/nio/file/Path;

    move-result-object v0

    return-object v0
.end method

.method public createTempFile(Ljava/lang/String;)Ljava/nio/file/Path;
    .locals 2

    .line 1
    invoke-static {p1}, Lorg/apache/tika/utils/StringUtils;->isBlank(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, ".tmp"

    .line 2
    :cond_0
    iget-object v0, p0, Lorg/apache/tika/io/TemporaryResources;->tempFileDir:Ljava/nio/file/Path;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    new-array v0, v1, [Ljava/nio/file/attribute/FileAttribute;

    invoke-static {p1, v0}, Lorg/apache/tika/fork/a;->h(Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;

    move-result-object p1

    goto :goto_0

    .line 3
    :cond_1
    new-array v1, v1, [Ljava/nio/file/attribute/FileAttribute;

    invoke-static {v0, p1, v1}, Lorg/apache/tika/fork/a;->k(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;

    move-result-object p1

    .line 4
    :goto_0
    new-instance v0, Lorg/apache/tika/io/b;

    invoke-direct {v0, p1}, Lorg/apache/tika/io/b;-><init>(Ljava/nio/file/Path;)V

    invoke-virtual {p0, v0}, Lorg/apache/tika/io/TemporaryResources;->addResource(Ljava/io/Closeable;)V

    return-object p1
.end method

.method public createTempFile(Lorg/apache/tika/metadata/Metadata;)Ljava/nio/file/Path;
    .locals 1

    .line 6
    const-string v0, "resourceName"

    invoke-virtual {p1, v0}, Lorg/apache/tika/metadata/Metadata;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 7
    invoke-static {p1}, Lorg/apache/tika/utils/StringUtils;->isBlank(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 8
    const-string p1, ""

    invoke-virtual {p0, p1}, Lorg/apache/tika/io/TemporaryResources;->createTempFile(Ljava/lang/String;)Ljava/nio/file/Path;

    move-result-object p1

    return-object p1

    .line 9
    :cond_0
    invoke-static {p1}, Lorg/apache/tika/io/FilenameUtils;->getSuffixFromPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/apache/tika/io/TemporaryResources;->createTempFile(Ljava/lang/String;)Ljava/nio/file/Path;

    move-result-object p1

    return-object p1
.end method

.method public createTemporaryFile()Ljava/io/File;
    .locals 1

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lorg/apache/tika/io/TemporaryResources;->createTempFile(Ljava/lang/String;)Ljava/nio/file/Path;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lio/flutter/plugin/editing/i;->e(Ljava/nio/file/Path;)Ljava/io/File;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public dispose()V
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lorg/apache/tika/io/TemporaryResources;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catch_0
    move-exception v0

    .line 6
    new-instance v1, Lorg/apache/tika/exception/TikaException;

    .line 7
    .line 8
    const-string v2, "Failed to close temporary resources"

    .line 9
    .line 10
    invoke-direct {v1, v2, v0}, Lorg/apache/tika/exception/TikaException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    throw v1
.end method

.method public getResource(Ljava/lang/Class;)Ljava/io/Closeable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/io/Closeable;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/apache/tika/io/TemporaryResources;->resources:Ljava/util/LinkedList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Ljava/io/Closeable;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {p1, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    return-object v1

    .line 30
    :cond_1
    const/4 p1, 0x0

    .line 31
    return-object p1
.end method

.method public setTemporaryFileDirectory(Ljava/io/File;)V
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 2
    :cond_0
    invoke-static {p1}, Lio/flutter/plugin/editing/i;->j(Ljava/io/File;)Ljava/nio/file/Path;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lorg/apache/tika/io/TemporaryResources;->tempFileDir:Ljava/nio/file/Path;

    return-void
.end method

.method public setTemporaryFileDirectory(Ljava/nio/file/Path;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/tika/io/TemporaryResources;->tempFileDir:Ljava/nio/file/Path;

    return-void
.end method

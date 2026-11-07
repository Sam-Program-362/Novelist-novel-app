.class public Lorg/apache/tika/mime/MimeTypesFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final CUSTOM_MIMES_SYS_PROP:Ljava/lang/String; = "tika.custom-mimetypes"

.field private static final LOG:LF2/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lorg/apache/tika/mime/MimeTypesFactory;

    .line 2
    .line 3
    invoke-static {v0}, LF2/d;->b(Ljava/lang/Class;)LF2/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lorg/apache/tika/mime/MimeTypesFactory;->LOG:LF2/b;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(Ljava/net/URL;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lorg/apache/tika/mime/MimeTypesFactory;->lambda$create$0(Ljava/net/URL;)V

    return-void
.end method

.method public static create()Lorg/apache/tika/mime/MimeTypes;
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/tika/mime/MimeTypes;

    invoke-direct {v0}, Lorg/apache/tika/mime/MimeTypes;-><init>()V

    return-object v0
.end method

.method public static create(Ljava/io/InputStream;)Lorg/apache/tika/mime/MimeTypes;
    .locals 0

    .line 10
    filled-new-array {p0}, [Ljava/io/InputStream;

    move-result-object p0

    invoke-static {p0}, Lorg/apache/tika/mime/MimeTypesFactory;->create([Ljava/io/InputStream;)Lorg/apache/tika/mime/MimeTypes;

    move-result-object p0

    return-object p0
.end method

.method public static create(Ljava/lang/String;)Lorg/apache/tika/mime/MimeTypes;
    .locals 1

    .line 20
    const-class v0, Lorg/apache/tika/mime/MimeTypesReader;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->getResource(Ljava/lang/String;)Ljava/net/URL;

    move-result-object p0

    invoke-static {p0}, Lorg/apache/tika/mime/MimeTypesFactory;->create(Ljava/net/URL;)Lorg/apache/tika/mime/MimeTypes;

    move-result-object p0

    return-object p0
.end method

.method public static create(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/tika/mime/MimeTypes;
    .locals 1

    const/4 v0, 0x0

    .line 21
    invoke-static {p0, p1, v0}, Lorg/apache/tika/mime/MimeTypesFactory;->create(Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)Lorg/apache/tika/mime/MimeTypes;

    move-result-object p0

    return-object p0
.end method

.method public static create(Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)Lorg/apache/tika/mime/MimeTypes;
    .locals 3

    .line 22
    const-class v0, Lorg/apache/tika/mime/MimeTypesReader;

    if-nez p2, :cond_0

    .line 23
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p2

    .line 24
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x2e

    const/16 v2, 0x2f

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    const-string v1, "/"

    .line 25
    invoke-static {v0, v1}, LB1/e;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 26
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/ClassLoader;->getResource(Ljava/lang/String;)Ljava/net/URL;

    move-result-object p0

    .line 27
    invoke-virtual {p2, p1}, Ljava/lang/ClassLoader;->getResources(Ljava/lang/String;)Ljava/util/Enumeration;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    move-result-object p1

    .line 28
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 29
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 31
    sget-object p0, Lorg/apache/tika/mime/MimeTypesFactory;->LOG:LF2/b;

    invoke-interface {p0}, LF2/b;->d()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 32
    invoke-interface {p2}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    move-result-object p1

    new-instance v0, Lorg/apache/tika/mime/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/apache/tika/mime/a;-><init>(I)V

    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->forEach(Ljava/util/function/Consumer;)V

    .line 33
    :cond_1
    const-string p1, "tika.custom-mimetypes"

    invoke-static {p1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 34
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 35
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 36
    invoke-virtual {v0}, Ljava/io/File;->toURI()Ljava/net/URI;

    move-result-object p1

    invoke-virtual {p1}, Ljava/net/URI;->toURL()Ljava/net/URL;

    move-result-object p1

    .line 37
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    invoke-interface {p0}, LF2/b;->d()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 39
    const-string p1, "Loaded external custom mimetypes file: {}"

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0, p1}, LF2/b;->s(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 40
    :cond_2
    new-instance p0, Ljava/io/IOException;

    const-string p2, "Specified custom mimetypes file not found: "

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 41
    new-array p0, p0, [Ljava/net/URL;

    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/net/URL;

    invoke-static {p0}, Lorg/apache/tika/mime/MimeTypesFactory;->create([Ljava/net/URL;)Lorg/apache/tika/mime/MimeTypes;

    move-result-object p0

    return-object p0
.end method

.method public static create(Ljava/net/URL;)Lorg/apache/tika/mime/MimeTypes;
    .locals 0

    .line 19
    filled-new-array {p0}, [Ljava/net/URL;

    move-result-object p0

    invoke-static {p0}, Lorg/apache/tika/mime/MimeTypesFactory;->create([Ljava/net/URL;)Lorg/apache/tika/mime/MimeTypes;

    move-result-object p0

    return-object p0
.end method

.method public static create(Lorg/w3c/dom/Document;)Lorg/apache/tika/mime/MimeTypes;
    .locals 2

    .line 2
    new-instance v0, Lorg/apache/tika/mime/MimeTypes;

    invoke-direct {v0}, Lorg/apache/tika/mime/MimeTypes;-><init>()V

    .line 3
    new-instance v1, Lorg/apache/tika/mime/MimeTypesReader;

    invoke-direct {v1, v0}, Lorg/apache/tika/mime/MimeTypesReader;-><init>(Lorg/apache/tika/mime/MimeTypes;)V

    invoke-virtual {v1, p0}, Lorg/apache/tika/mime/MimeTypesReader;->read(Lorg/w3c/dom/Document;)V

    .line 4
    invoke-virtual {v0}, Lorg/apache/tika/mime/MimeTypes;->init()V

    return-object v0
.end method

.method public static varargs create([Ljava/io/InputStream;)Lorg/apache/tika/mime/MimeTypes;
    .locals 5

    .line 5
    new-instance v0, Lorg/apache/tika/mime/MimeTypes;

    invoke-direct {v0}, Lorg/apache/tika/mime/MimeTypes;-><init>()V

    .line 6
    new-instance v1, Lorg/apache/tika/mime/MimeTypesReader;

    invoke-direct {v1, v0}, Lorg/apache/tika/mime/MimeTypesReader;-><init>(Lorg/apache/tika/mime/MimeTypes;)V

    .line 7
    array-length v2, p0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, p0, v3

    .line 8
    invoke-virtual {v1, v4}, Lorg/apache/tika/mime/MimeTypesReader;->read(Ljava/io/InputStream;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {v0}, Lorg/apache/tika/mime/MimeTypes;->init()V

    return-object v0
.end method

.method public static varargs create([Ljava/net/URL;)Lorg/apache/tika/mime/MimeTypes;
    .locals 5

    .line 11
    array-length v0, p0

    new-array v1, v0, [Ljava/io/InputStream;

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_0

    .line 12
    aget-object v4, p0, v3

    invoke-virtual {v4}, Ljava/net/URL;->openStream()Ljava/io/InputStream;

    move-result-object v4

    aput-object v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 13
    :cond_0
    :try_start_0
    invoke-static {v1}, Lorg/apache/tika/mime/MimeTypesFactory;->create([Ljava/io/InputStream;)Lorg/apache/tika/mime/MimeTypes;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    if-ge v2, v0, :cond_1

    .line 14
    aget-object v3, v1, v2

    .line 15
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-object p0

    :catchall_0
    move-exception p0

    :goto_2
    if-ge v2, v0, :cond_2

    .line 16
    aget-object v3, v1, v2

    .line 17
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 18
    :cond_2
    throw p0
.end method

.method private static synthetic lambda$create$0(Ljava/net/URL;)V
    .locals 2

    .line 1
    sget-object v0, Lorg/apache/tika/mime/MimeTypesFactory;->LOG:LF2/b;

    .line 2
    .line 3
    const-string v1, "Loaded custom mimes file: {}"

    .line 4
    .line 5
    invoke-interface {v0, p0, v1}, LF2/b;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

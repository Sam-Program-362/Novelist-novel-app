.class public Lorg/apache/tika/pipes/fetcher/fs/config/FileSystemFetcherConfig;
.super Lorg/apache/tika/pipes/fetcher/config/AbstractConfig;
.source "SourceFile"


# instance fields
.field private basePath:Ljava/lang/String;

.field private extractFileSystemMetadata:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/apache/tika/pipes/fetcher/config/AbstractConfig;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getBasePath()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/fetcher/fs/config/FileSystemFetcherConfig;->basePath:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public isExtractFileSystemMetadata()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/tika/pipes/fetcher/fs/config/FileSystemFetcherConfig;->extractFileSystemMetadata:Z

    .line 2
    .line 3
    return v0
.end method

.method public setBasePath(Ljava/lang/String;)Lorg/apache/tika/pipes/fetcher/fs/config/FileSystemFetcherConfig;
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/tika/pipes/fetcher/fs/config/FileSystemFetcherConfig;->basePath:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public setExtractFileSystemMetadata(Z)Lorg/apache/tika/pipes/fetcher/fs/config/FileSystemFetcherConfig;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/apache/tika/pipes/fetcher/fs/config/FileSystemFetcherConfig;->extractFileSystemMetadata:Z

    .line 2
    .line 3
    return-object p0
.end method

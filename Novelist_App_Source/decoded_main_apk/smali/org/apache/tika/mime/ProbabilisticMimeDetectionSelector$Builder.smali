.class public Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private extension_neg:F

.field private extension_trust:F

.field private magic_neg:F

.field private magic_trust:F

.field private meta_neg:F

.field private meta_trust:F

.field private priorExtensionFileType:F

.field private priorMagicFileType:F

.field private priorMetaFileType:F

.field private threshold:F


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

.method public static bridge synthetic a(Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector$Builder;)F
    .locals 0

    .line 1
    iget p0, p0, Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector$Builder;->extension_neg:F

    return p0
.end method

.method public static bridge synthetic b(Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector$Builder;)F
    .locals 0

    .line 1
    iget p0, p0, Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector$Builder;->extension_trust:F

    return p0
.end method

.method public static bridge synthetic c(Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector$Builder;)F
    .locals 0

    .line 1
    iget p0, p0, Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector$Builder;->magic_neg:F

    return p0
.end method

.method public static bridge synthetic d(Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector$Builder;)F
    .locals 0

    .line 1
    iget p0, p0, Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector$Builder;->magic_trust:F

    return p0
.end method

.method public static bridge synthetic e(Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector$Builder;)F
    .locals 0

    .line 1
    iget p0, p0, Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector$Builder;->meta_neg:F

    return p0
.end method

.method public static bridge synthetic f(Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector$Builder;)F
    .locals 0

    .line 1
    iget p0, p0, Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector$Builder;->meta_trust:F

    return p0
.end method

.method public static bridge synthetic g(Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector$Builder;)F
    .locals 0

    .line 1
    iget p0, p0, Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector$Builder;->priorExtensionFileType:F

    return p0
.end method

.method public static bridge synthetic h(Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector$Builder;)F
    .locals 0

    .line 1
    iget p0, p0, Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector$Builder;->priorMagicFileType:F

    return p0
.end method

.method public static bridge synthetic i(Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector$Builder;)F
    .locals 0

    .line 1
    iget p0, p0, Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector$Builder;->priorMetaFileType:F

    return p0
.end method

.method public static bridge synthetic j(Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector$Builder;)F
    .locals 0

    .line 1
    iget p0, p0, Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector$Builder;->threshold:F

    return p0
.end method


# virtual methods
.method public build2()Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector;
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector;-><init>(Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector$Builder;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public declared-synchronized extension_neg(F)Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector$Builder;
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput p1, p0, Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector$Builder;->extension_neg:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object p0

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
.end method

.method public declared-synchronized extension_trust(F)Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector$Builder;
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput p1, p0, Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector$Builder;->extension_trust:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object p0

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
.end method

.method public declared-synchronized magic_neg(F)Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector$Builder;
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput p1, p0, Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector$Builder;->magic_neg:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object p0

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
.end method

.method public declared-synchronized magic_trust(F)Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector$Builder;
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput p1, p0, Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector$Builder;->magic_trust:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object p0

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
.end method

.method public declared-synchronized meta_neg(F)Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector$Builder;
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput p1, p0, Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector$Builder;->meta_neg:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object p0

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
.end method

.method public declared-synchronized meta_trust(F)Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector$Builder;
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput p1, p0, Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector$Builder;->meta_trust:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object p0

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
.end method

.method public declared-synchronized priorExtensionFileType(F)Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector$Builder;
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput p1, p0, Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector$Builder;->priorExtensionFileType:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object p0

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
.end method

.method public declared-synchronized priorMagicFileType(F)Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector$Builder;
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput p1, p0, Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector$Builder;->priorMagicFileType:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object p0

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
.end method

.method public declared-synchronized priorMetaFileType(F)Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector$Builder;
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput p1, p0, Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector$Builder;->priorMetaFileType:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object p0

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
.end method

.method public declared-synchronized threshold(F)Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector$Builder;
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput p1, p0, Lorg/apache/tika/mime/ProbabilisticMimeDetectionSelector$Builder;->threshold:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object p0

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
.end method

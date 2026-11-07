.class public Lorg/apache/tika/exception/ZeroByteFileException;
.super Lorg/apache/tika/exception/TikaException;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/tika/exception/ZeroByteFileException$IgnoreZeroByteFileException;
    }
.end annotation


# static fields
.field public static IGNORE_ZERO_BYTE_FILE_EXCEPTION:Lorg/apache/tika/exception/ZeroByteFileException$IgnoreZeroByteFileException;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/tika/exception/ZeroByteFileException$IgnoreZeroByteFileException;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/apache/tika/exception/ZeroByteFileException$IgnoreZeroByteFileException;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lorg/apache/tika/exception/ZeroByteFileException;->IGNORE_ZERO_BYTE_FILE_EXCEPTION:Lorg/apache/tika/exception/ZeroByteFileException$IgnoreZeroByteFileException;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lorg/apache/tika/exception/TikaException;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

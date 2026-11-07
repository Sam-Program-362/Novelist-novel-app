.class Lorg/apache/tika/metadata/writefilter/StandardWriteFilter$StringSizePair;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/tika/metadata/writefilter/StandardWriteFilter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "StringSizePair"
.end annotation


# instance fields
.field final size:I

.field final string:Ljava/lang/String;

.field final truncated:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;IZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter$StringSizePair;->string:Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter$StringSizePair;->size:I

    .line 7
    .line 8
    iput-boolean p3, p0, Lorg/apache/tika/metadata/writefilter/StandardWriteFilter$StringSizePair;->truncated:Z

    .line 9
    .line 10
    return-void
.end method

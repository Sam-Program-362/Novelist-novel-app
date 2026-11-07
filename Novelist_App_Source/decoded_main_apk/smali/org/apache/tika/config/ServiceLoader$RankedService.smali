.class Lorg/apache/tika/config/ServiceLoader$RankedService;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/tika/config/ServiceLoader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RankedService"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lorg/apache/tika/config/ServiceLoader$RankedService;",
        ">;"
    }
.end annotation


# instance fields
.field private final rank:I

.field private final service:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/apache/tika/config/ServiceLoader$RankedService;->service:Ljava/lang/Object;

    .line 5
    .line 6
    iput p2, p0, Lorg/apache/tika/config/ServiceLoader$RankedService;->rank:I

    .line 7
    .line 8
    return-void
.end method

.method public static bridge synthetic a(Lorg/apache/tika/config/ServiceLoader$RankedService;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/tika/config/ServiceLoader$RankedService;->service:Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lorg/apache/tika/config/ServiceLoader$RankedService;

    invoke-virtual {p0, p1}, Lorg/apache/tika/config/ServiceLoader$RankedService;->compareTo(Lorg/apache/tika/config/ServiceLoader$RankedService;)I

    move-result p1

    return p1
.end method

.method public compareTo(Lorg/apache/tika/config/ServiceLoader$RankedService;)I
    .locals 1

    .line 2
    iget p1, p1, Lorg/apache/tika/config/ServiceLoader$RankedService;->rank:I

    iget v0, p0, Lorg/apache/tika/config/ServiceLoader$RankedService;->rank:I

    sub-int/2addr p1, v0

    return p1
.end method

.method public isInstanceOf(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/apache/tika/config/ServiceLoader$RankedService;->service:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

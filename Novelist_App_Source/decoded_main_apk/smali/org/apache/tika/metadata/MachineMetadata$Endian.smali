.class public final Lorg/apache/tika/metadata/MachineMetadata$Endian;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/tika/metadata/MachineMetadata;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Endian"
.end annotation


# static fields
.field public static final BIG:Lorg/apache/tika/metadata/MachineMetadata$Endian;

.field public static final LITTLE:Lorg/apache/tika/metadata/MachineMetadata$Endian;


# instance fields
.field private final msb:Z

.field private final name:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lorg/apache/tika/metadata/MachineMetadata$Endian;

    .line 2
    .line 3
    const-string v1, "Little"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lorg/apache/tika/metadata/MachineMetadata$Endian;-><init>(Ljava/lang/String;Z)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lorg/apache/tika/metadata/MachineMetadata$Endian;->LITTLE:Lorg/apache/tika/metadata/MachineMetadata$Endian;

    .line 10
    .line 11
    new-instance v0, Lorg/apache/tika/metadata/MachineMetadata$Endian;

    .line 12
    .line 13
    const-string v1, "Big"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lorg/apache/tika/metadata/MachineMetadata$Endian;-><init>(Ljava/lang/String;Z)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lorg/apache/tika/metadata/MachineMetadata$Endian;->BIG:Lorg/apache/tika/metadata/MachineMetadata$Endian;

    .line 20
    .line 21
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/apache/tika/metadata/MachineMetadata$Endian;->name:Ljava/lang/String;

    .line 5
    .line 6
    iput-boolean p2, p0, Lorg/apache/tika/metadata/MachineMetadata$Endian;->msb:Z

    .line 7
    .line 8
    return-void
.end method

.method public static bridge synthetic a(Lorg/apache/tika/metadata/MachineMetadata$Endian;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/tika/metadata/MachineMetadata$Endian;->name:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public getMSB()Ljava/lang/String;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/tika/metadata/MachineMetadata$Endian;->msb:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "MSB"

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const-string v0, "LSB"

    .line 9
    .line 10
    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/metadata/MachineMetadata$Endian;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public isMSB()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/tika/metadata/MachineMetadata$Endian;->msb:Z

    .line 2
    .line 3
    return v0
.end method

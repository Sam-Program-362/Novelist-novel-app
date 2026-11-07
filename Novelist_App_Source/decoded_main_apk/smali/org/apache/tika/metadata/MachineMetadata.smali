.class public interface abstract Lorg/apache/tika/metadata/MachineMetadata;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/tika/metadata/MachineMetadata$Endian;
    }
.end annotation


# static fields
.field public static final ARCHITECTURE_BITS:Lorg/apache/tika/metadata/Property;

.field public static final ENDIAN:Lorg/apache/tika/metadata/Property;

.field public static final MACHINE_ALPHA:Ljava/lang/String; = "Alpha"

.field public static final MACHINE_ARM:Ljava/lang/String; = "ARM"

.field public static final MACHINE_EFI:Ljava/lang/String; = "EFI"

.field public static final MACHINE_IA_64:Ljava/lang/String; = "IA-64"

.field public static final MACHINE_M32R:Ljava/lang/String; = "M32R"

.field public static final MACHINE_M68K:Ljava/lang/String; = "Motorola-68000"

.field public static final MACHINE_M88K:Ljava/lang/String; = "Motorola-88000"

.field public static final MACHINE_MIPS:Ljava/lang/String; = "MIPS"

.field public static final MACHINE_PPC:Ljava/lang/String; = "PPC"

.field public static final MACHINE_S370:Ljava/lang/String; = "S370"

.field public static final MACHINE_S390:Ljava/lang/String; = "S390"

.field public static final MACHINE_SH3:Ljava/lang/String; = "SH3"

.field public static final MACHINE_SH4:Ljava/lang/String; = "SH4"

.field public static final MACHINE_SH5:Ljava/lang/String; = "SH5"

.field public static final MACHINE_SPARC:Ljava/lang/String; = "SPARC"

.field public static final MACHINE_TYPE:Lorg/apache/tika/metadata/Property;

.field public static final MACHINE_UNKNOWN:Ljava/lang/String; = "Unknown"

.field public static final MACHINE_VAX:Ljava/lang/String; = "Vax"

.field public static final MACHINE_x86_32:Ljava/lang/String; = "x86-32"

.field public static final MACHINE_x86_64:Ljava/lang/String; = "x86-64"

.field public static final PLATFORM:Lorg/apache/tika/metadata/Property;

.field public static final PLATFORM_AIX:Ljava/lang/String; = "AIX"

.field public static final PLATFORM_ARM:Ljava/lang/String; = "ARM"

.field public static final PLATFORM_EMBEDDED:Ljava/lang/String; = "Embedded"

.field public static final PLATFORM_FREEBSD:Ljava/lang/String; = "FreeBSD"

.field public static final PLATFORM_HPUX:Ljava/lang/String; = "HP-UX"

.field public static final PLATFORM_IRIX:Ljava/lang/String; = "IRIX"

.field public static final PLATFORM_LINUX:Ljava/lang/String; = "Linux"

.field public static final PLATFORM_NETBSD:Ljava/lang/String; = "NetBSD"

.field public static final PLATFORM_SOLARIS:Ljava/lang/String; = "Solaris"

.field public static final PLATFORM_SYSV:Ljava/lang/String; = "System V"

.field public static final PLATFORM_TRU64:Ljava/lang/String; = "Tru64"

.field public static final PLATFORM_WINDOWS:Ljava/lang/String; = "Windows"

.field public static final PREFIX:Ljava/lang/String; = "machine:"


# direct methods
.method static constructor <clinit>()V
    .locals 20

    .line 1
    const-string v0, "32"

    .line 2
    .line 3
    const-string v1, "64"

    .line 4
    .line 5
    const-string v2, "8"

    .line 6
    .line 7
    const-string v3, "16"

    .line 8
    .line 9
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "machine:architectureBits"

    .line 14
    .line 15
    invoke-static {v1, v0}, Lorg/apache/tika/metadata/Property;->internalClosedChoise(Ljava/lang/String;[Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lorg/apache/tika/metadata/MachineMetadata;->ARCHITECTURE_BITS:Lorg/apache/tika/metadata/Property;

    .line 20
    .line 21
    const-string v11, "Embedded"

    .line 22
    .line 23
    const-string v12, "Windows"

    .line 24
    .line 25
    const-string v1, "System V"

    .line 26
    .line 27
    const-string v2, "HP-UX"

    .line 28
    .line 29
    const-string v3, "NetBSD"

    .line 30
    .line 31
    const-string v4, "Linux"

    .line 32
    .line 33
    const-string v5, "Solaris"

    .line 34
    .line 35
    const-string v6, "AIX"

    .line 36
    .line 37
    const-string v7, "IRIX"

    .line 38
    .line 39
    const-string v8, "FreeBSD"

    .line 40
    .line 41
    const-string v9, "Tru64"

    .line 42
    .line 43
    const-string v10, "ARM"

    .line 44
    .line 45
    filled-new-array/range {v1 .. v12}, [Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const-string v1, "machine:platform"

    .line 50
    .line 51
    invoke-static {v1, v0}, Lorg/apache/tika/metadata/Property;->internalClosedChoise(Ljava/lang/String;[Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, Lorg/apache/tika/metadata/MachineMetadata;->PLATFORM:Lorg/apache/tika/metadata/Property;

    .line 56
    .line 57
    const-string v18, "SH5"

    .line 58
    .line 59
    const-string v19, "Unknown"

    .line 60
    .line 61
    const-string v1, "x86-32"

    .line 62
    .line 63
    const-string v2, "x86-64"

    .line 64
    .line 65
    const-string v3, "IA-64"

    .line 66
    .line 67
    const-string v4, "SPARC"

    .line 68
    .line 69
    const-string v5, "Motorola-68000"

    .line 70
    .line 71
    const-string v6, "Motorola-88000"

    .line 72
    .line 73
    const-string v7, "MIPS"

    .line 74
    .line 75
    const-string v8, "PPC"

    .line 76
    .line 77
    const-string v9, "S370"

    .line 78
    .line 79
    const-string v10, "S390"

    .line 80
    .line 81
    const-string v11, "ARM"

    .line 82
    .line 83
    const-string v12, "Vax"

    .line 84
    .line 85
    const-string v13, "Alpha"

    .line 86
    .line 87
    const-string v14, "EFI"

    .line 88
    .line 89
    const-string v15, "M32R"

    .line 90
    .line 91
    const-string v16, "SH3"

    .line 92
    .line 93
    const-string v17, "SH4"

    .line 94
    .line 95
    filled-new-array/range {v1 .. v19}, [Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    const-string v1, "machine:machineType"

    .line 100
    .line 101
    invoke-static {v1, v0}, Lorg/apache/tika/metadata/Property;->internalClosedChoise(Ljava/lang/String;[Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    sput-object v0, Lorg/apache/tika/metadata/MachineMetadata;->MACHINE_TYPE:Lorg/apache/tika/metadata/Property;

    .line 106
    .line 107
    sget-object v0, Lorg/apache/tika/metadata/MachineMetadata$Endian;->LITTLE:Lorg/apache/tika/metadata/MachineMetadata$Endian;

    .line 108
    .line 109
    invoke-static {v0}, Lorg/apache/tika/metadata/MachineMetadata$Endian;->a(Lorg/apache/tika/metadata/MachineMetadata$Endian;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    sget-object v1, Lorg/apache/tika/metadata/MachineMetadata$Endian;->BIG:Lorg/apache/tika/metadata/MachineMetadata$Endian;

    .line 114
    .line 115
    invoke-static {v1}, Lorg/apache/tika/metadata/MachineMetadata$Endian;->a(Lorg/apache/tika/metadata/MachineMetadata$Endian;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    const-string v1, "machine:endian"

    .line 124
    .line 125
    invoke-static {v1, v0}, Lorg/apache/tika/metadata/Property;->internalClosedChoise(Ljava/lang/String;[Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    sput-object v0, Lorg/apache/tika/metadata/MachineMetadata;->ENDIAN:Lorg/apache/tika/metadata/Property;

    .line 130
    .line 131
    return-void
.end method

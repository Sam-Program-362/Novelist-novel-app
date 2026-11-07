.class public Lorg/apache/tika/utils/SystemUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final IS_OS_AIX:Z

.field public static final IS_OS_HP_UX:Z

.field public static final IS_OS_IRIX:Z

.field public static final IS_OS_LINUX:Z

.field public static final IS_OS_MAC:Z

.field public static final IS_OS_MAC_OSX:Z

.field public static final IS_OS_OS2:Z

.field public static final IS_OS_SOLARIS:Z

.field public static final IS_OS_SUN_OS:Z

.field public static final IS_OS_UNIX:Z

.field public static final IS_OS_VERSION_WSL:Z

.field public static final IS_OS_WINDOWS:Z

.field public static final OS_NAME:Ljava/lang/String;

.field private static final OS_NAME_WINDOWS_PREFIX:Ljava/lang/String; = "Windows"

.field public static final OS_VERSION:Ljava/lang/String;

.field private static final OS_VERSION_WSL:Ljava/lang/String; = "WSL"


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    const-string v0, "os.name"

    .line 2
    .line 3
    invoke-static {v0}, Lorg/apache/tika/utils/SystemUtils;->getSystemProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lorg/apache/tika/utils/SystemUtils;->OS_NAME:Ljava/lang/String;

    .line 8
    .line 9
    const-string v0, "os.version"

    .line 10
    .line 11
    invoke-static {v0}, Lorg/apache/tika/utils/SystemUtils;->getSystemProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lorg/apache/tika/utils/SystemUtils;->OS_VERSION:Ljava/lang/String;

    .line 16
    .line 17
    const-string v0, "AIX"

    .line 18
    .line 19
    invoke-static {v0}, Lorg/apache/tika/utils/SystemUtils;->getOSMatchesName(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    sput-boolean v0, Lorg/apache/tika/utils/SystemUtils;->IS_OS_AIX:Z

    .line 24
    .line 25
    const-string v1, "HP-UX"

    .line 26
    .line 27
    invoke-static {v1}, Lorg/apache/tika/utils/SystemUtils;->getOSMatchesName(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    sput-boolean v1, Lorg/apache/tika/utils/SystemUtils;->IS_OS_HP_UX:Z

    .line 32
    .line 33
    const-string v2, "Irix"

    .line 34
    .line 35
    invoke-static {v2}, Lorg/apache/tika/utils/SystemUtils;->getOSMatchesName(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    sput-boolean v2, Lorg/apache/tika/utils/SystemUtils;->IS_OS_IRIX:Z

    .line 40
    .line 41
    const-string v3, "Linux"

    .line 42
    .line 43
    invoke-static {v3}, Lorg/apache/tika/utils/SystemUtils;->getOSMatchesName(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    const/4 v4, 0x1

    .line 48
    const/4 v5, 0x0

    .line 49
    if-nez v3, :cond_1

    .line 50
    .line 51
    const-string v3, "LINUX"

    .line 52
    .line 53
    invoke-static {v3}, Lorg/apache/tika/utils/SystemUtils;->getOSMatchesName(Ljava/lang/String;)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_0

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    move v3, v5

    .line 61
    goto :goto_1

    .line 62
    :cond_1
    :goto_0
    move v3, v4

    .line 63
    :goto_1
    sput-boolean v3, Lorg/apache/tika/utils/SystemUtils;->IS_OS_LINUX:Z

    .line 64
    .line 65
    const-string v6, "Mac"

    .line 66
    .line 67
    invoke-static {v6}, Lorg/apache/tika/utils/SystemUtils;->getOSMatchesName(Ljava/lang/String;)Z

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    sput-boolean v6, Lorg/apache/tika/utils/SystemUtils;->IS_OS_MAC:Z

    .line 72
    .line 73
    const-string v6, "Mac OS X"

    .line 74
    .line 75
    invoke-static {v6}, Lorg/apache/tika/utils/SystemUtils;->getOSMatchesName(Ljava/lang/String;)Z

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    sput-boolean v6, Lorg/apache/tika/utils/SystemUtils;->IS_OS_MAC_OSX:Z

    .line 80
    .line 81
    const-string v7, "OS/2"

    .line 82
    .line 83
    invoke-static {v7}, Lorg/apache/tika/utils/SystemUtils;->getOSMatchesName(Ljava/lang/String;)Z

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    sput-boolean v7, Lorg/apache/tika/utils/SystemUtils;->IS_OS_OS2:Z

    .line 88
    .line 89
    const-string v7, "Solaris"

    .line 90
    .line 91
    invoke-static {v7}, Lorg/apache/tika/utils/SystemUtils;->getOSMatchesName(Ljava/lang/String;)Z

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    sput-boolean v7, Lorg/apache/tika/utils/SystemUtils;->IS_OS_SOLARIS:Z

    .line 96
    .line 97
    const-string v8, "SunOS"

    .line 98
    .line 99
    invoke-static {v8}, Lorg/apache/tika/utils/SystemUtils;->getOSMatchesName(Ljava/lang/String;)Z

    .line 100
    .line 101
    .line 102
    move-result v8

    .line 103
    sput-boolean v8, Lorg/apache/tika/utils/SystemUtils;->IS_OS_SUN_OS:Z

    .line 104
    .line 105
    if-nez v0, :cond_3

    .line 106
    .line 107
    if-nez v1, :cond_3

    .line 108
    .line 109
    if-nez v2, :cond_3

    .line 110
    .line 111
    if-nez v3, :cond_3

    .line 112
    .line 113
    if-nez v6, :cond_3

    .line 114
    .line 115
    if-nez v7, :cond_3

    .line 116
    .line 117
    if-eqz v8, :cond_2

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_2
    move v4, v5

    .line 121
    :cond_3
    :goto_2
    sput-boolean v4, Lorg/apache/tika/utils/SystemUtils;->IS_OS_UNIX:Z

    .line 122
    .line 123
    const-string v0, "Windows"

    .line 124
    .line 125
    invoke-static {v0}, Lorg/apache/tika/utils/SystemUtils;->getOSMatchesName(Ljava/lang/String;)Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    sput-boolean v0, Lorg/apache/tika/utils/SystemUtils;->IS_OS_WINDOWS:Z

    .line 130
    .line 131
    const-string v0, "WSL"

    .line 132
    .line 133
    invoke-static {v0}, Lorg/apache/tika/utils/SystemUtils;->getOSContainsVersion(Ljava/lang/String;)Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    sput-boolean v0, Lorg/apache/tika/utils/SystemUtils;->IS_OS_VERSION_WSL:Z

    .line 138
    .line 139
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

.method public static doesOSVersionContain(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method private static getOSContainsVersion(Ljava/lang/String;)Z
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/tika/utils/SystemUtils;->OS_VERSION:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0, p0}, Lorg/apache/tika/utils/SystemUtils;->doesOSVersionContain(Ljava/lang/String;Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method private static getOSMatchesName(Ljava/lang/String;)Z
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/tika/utils/SystemUtils;->OS_NAME:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0, p0}, Lorg/apache/tika/utils/SystemUtils;->isOSNameMatch(Ljava/lang/String;Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method private static getSystemProperty(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    :try_start_0
    invoke-static {p0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    const/4 p0, 0x0

    .line 7
    return-object p0
.end method

.method public static isOSNameMatch(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

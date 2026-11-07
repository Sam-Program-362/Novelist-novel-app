.class public final Ls0/i;
.super Ls0/b;
.source "SourceFile"


# instance fields
.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    iput p2, p0, Ls0/i;->e:I

    const/4 p2, 0x2

    invoke-direct {p0, p1, p2, p3}, Ls0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 6

    .line 1
    iget v0, p0, Ls0/i;->e:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    const-string v0, "MULTI_PROFILE"

    .line 8
    .line 9
    invoke-static {v0}, La/a;->H(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-super {p0}, Ls0/c;->b()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    :goto_0
    return v1

    .line 21
    :pswitch_0
    invoke-super {p0}, Ls0/c;->b()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    const-string v0, "MULTI_PROCESS"

    .line 29
    .line 30
    invoke-static {v0}, La/a;->H(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    sget v0, Lr0/a;->a:I

    .line 37
    .line 38
    sget-object v0, Ls0/j;->a:Ls0/b;

    .line 39
    .line 40
    invoke-virtual {v0}, Ls0/c;->b()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    sget-object v0, Ls0/l;->a:Ls0/m;

    .line 47
    .line 48
    invoke-interface {v0}, Ls0/m;->getStatics()Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-interface {v0}, Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;->isMultiProcessEnabled()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    goto :goto_1

    .line 57
    :cond_2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 58
    .line 59
    const-string v1, "This method is not supported by the current version of the framework and the current WebView APK"

    .line 60
    .line 61
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v0

    .line 65
    :cond_3
    :goto_1
    return v1

    .line 66
    :pswitch_1
    invoke-super {p0}, Ls0/c;->b()Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-nez v0, :cond_4

    .line 71
    .line 72
    goto :goto_4

    .line 73
    :cond_4
    sget v0, Lr0/a;->a:I

    .line 74
    .line 75
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 76
    .line 77
    const/16 v2, 0x1a

    .line 78
    .line 79
    if-lt v0, v2, :cond_5

    .line 80
    .line 81
    invoke-static {}, Lorg/apache/tika/pipes/pipesiterator/fs/a;->b()Landroid/content/pm/PackageInfo;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    goto :goto_2

    .line 86
    :cond_5
    :try_start_0
    invoke-static {}, Lr0/a;->a()Landroid/content/pm/PackageInfo;

    .line 87
    .line 88
    .line 89
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    goto :goto_2

    .line 91
    :catch_0
    const/4 v0, 0x0

    .line 92
    :goto_2
    if-nez v0, :cond_6

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_6
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 96
    .line 97
    const/16 v3, 0x1c

    .line 98
    .line 99
    if-lt v2, v3, :cond_7

    .line 100
    .line 101
    invoke-static {v0}, LD/f;->c(Landroid/content/pm/PackageInfo;)J

    .line 102
    .line 103
    .line 104
    move-result-wide v2

    .line 105
    goto :goto_3

    .line 106
    :cond_7
    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 107
    .line 108
    int-to-long v2, v0

    .line 109
    :goto_3
    const-wide/32 v4, 0x25f34560

    .line 110
    .line 111
    .line 112
    cmp-long v0, v2, v4

    .line 113
    .line 114
    if-ltz v0, :cond_8

    .line 115
    .line 116
    const/4 v1, 0x1

    .line 117
    :cond_8
    :goto_4
    return v1

    .line 118
    nop

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

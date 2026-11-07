.class public final LA/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC1/m;
.implements LC1/c;
.implements LC1/d;
.implements LH/d;
.implements Lg1/b;
.implements LL0/i;


# static fields
.field public static n:LE1/a;


# instance fields
.field public final synthetic k:I

.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, LA/c;->k:I

    packed-switch p1, :pswitch_data_0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 5
    invoke-static {p1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, LA/c;->l:Ljava/lang/Object;

    new-instance p1, Ljava/util/WeakHashMap;

    .line 6
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 7
    invoke-static {p1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, LA/c;->m:Ljava/lang/Object;

    return-void

    .line 8
    :pswitch_0
    sget-object p1, LJ0/d;->c:LJ0/d;

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, LA/c;->l:Ljava/lang/Object;

    .line 10
    iput-object p1, p0, LA/c;->m:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x16
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 1
    iput p1, p0, LA/c;->k:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LB1/a;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LA/c;->k:I

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA/c;->m:Ljava/lang/Object;

    .line 23
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LA/c;->l:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LE1/b;LB1/a;)V
    .locals 1

    const/16 v0, 0xf

    iput v0, p0, LA/c;->k:I

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, LA/c;->l:Ljava/lang/Object;

    .line 17
    iput-object p2, p0, LA/c;->m:Ljava/lang/Object;

    .line 18
    new-instance p1, LH0/i;

    const/16 v0, 0x9

    invoke-direct {p1, p0, v0}, LH0/i;-><init>(Ljava/lang/Object;I)V

    .line 19
    iput-object p1, p2, LB1/a;->l:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/animation/Animator;)V
    .locals 1

    const/16 v0, 0x1c

    iput v0, p0, LA/c;->k:I

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 64
    iput-object v0, p0, LA/c;->l:Ljava/lang/Object;

    .line 65
    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object v0, p0, LA/c;->m:Ljava/lang/Object;

    .line 66
    invoke-virtual {v0, p1}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    return-void
.end method

.method public constructor <init>(Landroid/view/animation/Animation;)V
    .locals 1

    const/16 v0, 0x1c

    iput v0, p0, LA/c;->k:I

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    iput-object p1, p0, LA/c;->l:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 62
    iput-object p1, p0, LA/c;->m:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lb0/I;)V
    .locals 1

    const/16 v0, 0x1d

    iput v0, p0, LA/c;->k:I

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA/c;->l:Ljava/lang/Object;

    .line 21
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p1, p0, LA/c;->m:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 1

    const/16 v0, 0x15

    iput v0, p0, LA/c;->k:I

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA/c;->m:Ljava/lang/Object;

    new-instance p1, Ljava/util/ArrayList;

    .line 12
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LA/c;->l:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p3, p0, LA/c;->k:I

    iput-object p1, p0, LA/c;->l:Ljava/lang/Object;

    iput-object p2, p0, LA/c;->m:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V
    .locals 0

    .line 3
    iput p3, p0, LA/c;->k:I

    iput-object p1, p0, LA/c;->m:Ljava/lang/Object;

    iput-object p2, p0, LA/c;->l:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LH2/h;LK0/d;)V
    .locals 0

    const/16 p3, 0x11

    iput p3, p0, LA/c;->k:I

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, LA/c;->m:Ljava/lang/Object;

    iput-object p2, p0, LA/c;->l:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lt1/c;I)V
    .locals 4

    iput p2, p0, LA/c;->k:I

    packed-switch p2, :pswitch_data_0

    .line 24
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance p2, LB1/g;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0}, LB1/g;-><init>(Ljava/lang/Object;I)V

    .line 26
    new-instance v0, LB1/s;

    sget-object v1, LC1/k;->a:LC1/k;

    const/4 v2, 0x0

    .line 27
    const-string v3, "flutter/localization"

    invoke-direct {v0, p1, v3, v1, v2}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 28
    iput-object v0, p0, LA/c;->l:Ljava/lang/Object;

    .line 29
    invoke-virtual {v0, p2}, LB1/s;->z(LC1/m;)V

    return-void

    .line 30
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance p2, LH0/i;

    const/16 v0, 0x8

    invoke-direct {p2, p0, v0}, LH0/i;-><init>(Ljava/lang/Object;I)V

    .line 32
    new-instance v0, LB1/s;

    sget-object v1, LC1/k;->a:LC1/k;

    const/4 v2, 0x0

    .line 33
    const-string v3, "flutter/textinput"

    invoke-direct {v0, p1, v3, v1, v2}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 34
    iput-object v0, p0, LA/c;->l:Ljava/lang/Object;

    .line 35
    invoke-virtual {v0, p2}, LB1/s;->z(LC1/m;)V

    return-void

    .line 36
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance p2, LB1/a;

    const/4 v0, 0x3

    invoke-direct {p2, p0, v0}, LB1/a;-><init>(Ljava/lang/Object;I)V

    .line 38
    new-instance v0, LB1/s;

    sget-object v1, LC1/r;->a:LC1/r;

    const/4 v2, 0x0

    .line 39
    const-string v3, "flutter/platform_views"

    invoke-direct {v0, p1, v3, v1, v2}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 40
    iput-object v0, p0, LA/c;->l:Ljava/lang/Object;

    .line 41
    invoke-virtual {v0, p2}, LB1/s;->z(LC1/m;)V

    return-void

    .line 42
    :pswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    new-instance p2, LB1/g;

    const/4 v0, 0x1

    invoke-direct {p2, p0, v0}, LB1/g;-><init>(Ljava/lang/Object;I)V

    .line 44
    new-instance v0, LB1/s;

    sget-object v1, LC1/r;->a:LC1/r;

    const/4 v2, 0x0

    .line 45
    const-string v3, "flutter/platform_views_2"

    invoke-direct {v0, p1, v3, v1, v2}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 46
    iput-object v0, p0, LA/c;->l:Ljava/lang/Object;

    .line 47
    invoke-virtual {v0, p2}, LB1/s;->z(LC1/m;)V

    return-void

    .line 48
    :pswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    new-instance p2, LH0/i;

    const/4 v0, 0x4

    invoke-direct {p2, p0, v0}, LH0/i;-><init>(Ljava/lang/Object;I)V

    .line 50
    new-instance v0, LB1/s;

    sget-object v1, LC1/k;->a:LC1/k;

    const/4 v2, 0x0

    .line 51
    const-string v3, "flutter/platform"

    invoke-direct {v0, p1, v3, v1, v2}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 52
    iput-object v0, p0, LA/c;->l:Ljava/lang/Object;

    .line 53
    invoke-virtual {v0, p2}, LB1/s;->z(LC1/m;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public constructor <init>(Lt1/c;Landroid/content/pm/PackageManager;)V
    .locals 4

    const/4 v0, 0x6

    iput v0, p0, LA/c;->k:I

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    new-instance v0, LH0/i;

    const/4 v1, 0x5

    invoke-direct {v0, p0, v1}, LH0/i;-><init>(Ljava/lang/Object;I)V

    .line 56
    iput-object p2, p0, LA/c;->l:Ljava/lang/Object;

    .line 57
    new-instance p2, LB1/s;

    sget-object v1, LC1/r;->a:LC1/r;

    const/4 v2, 0x0

    .line 58
    const-string v3, "flutter/processtext"

    invoke-direct {p2, p1, v3, v1, v2}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 59
    invoke-virtual {p2, v0}, LB1/s;->z(LC1/m;)V

    return-void
.end method

.method public static c(LA/c;Lorg/json/JSONArray;)I
    .locals 11

    .line 1
    const/4 p0, 0x0

    .line 2
    move v0, p0

    .line 3
    move v1, v0

    .line 4
    move v2, v1

    .line 5
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    const/4 v4, 0x4

    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x1

    .line 12
    if-ge v0, v3, :cond_b

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-static {v4}, LX/j;->b(I)[I

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    array-length v7, v4

    .line 23
    move v8, p0

    .line 24
    :goto_1
    if-ge v8, v7, :cond_a

    .line 25
    .line 26
    aget v9, v4, v8

    .line 27
    .line 28
    const/4 v10, 0x1

    .line 29
    if-eq v9, v10, :cond_3

    .line 30
    .line 31
    const/4 v10, 0x2

    .line 32
    if-eq v9, v10, :cond_2

    .line 33
    .line 34
    const/4 v10, 0x3

    .line 35
    if-eq v9, v10, :cond_1

    .line 36
    .line 37
    const/4 v10, 0x4

    .line 38
    if-ne v9, v10, :cond_0

    .line 39
    .line 40
    const-string v10, "DeviceOrientation.landscapeRight"

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_0
    const/4 p0, 0x0

    .line 44
    throw p0

    .line 45
    :cond_1
    const-string v10, "DeviceOrientation.landscapeLeft"

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const-string v10, "DeviceOrientation.portraitDown"

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_3
    const-string v10, "DeviceOrientation.portraitUp"

    .line 52
    .line 53
    :goto_2
    invoke-virtual {v10, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v10

    .line 57
    if-eqz v10, :cond_9

    .line 58
    .line 59
    invoke-static {v9}, LX/j;->a(I)I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-eqz v3, :cond_7

    .line 64
    .line 65
    if-eq v3, v6, :cond_6

    .line 66
    .line 67
    if-eq v3, v5, :cond_5

    .line 68
    .line 69
    const/4 v4, 0x3

    .line 70
    if-eq v3, v4, :cond_4

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_4
    or-int/lit8 v1, v1, 0x8

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_5
    or-int/lit8 v1, v1, 0x2

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_6
    or-int/lit8 v1, v1, 0x4

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_7
    or-int/lit8 v1, v1, 0x1

    .line 83
    .line 84
    :goto_3
    if-nez v2, :cond_8

    .line 85
    .line 86
    move v2, v1

    .line 87
    :cond_8
    add-int/lit8 v0, v0, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_9
    add-int/lit8 v8, v8, 0x1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_a
    new-instance p0, Ljava/lang/NoSuchFieldException;

    .line 94
    .line 95
    const-string p1, "No such DeviceOrientation: "

    .line 96
    .line 97
    invoke-static {p1, v3}, Lt/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-direct {p0, p1}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw p0

    .line 105
    :cond_b
    if-eqz v1, :cond_f

    .line 106
    .line 107
    const/16 p1, 0x8

    .line 108
    .line 109
    packed-switch v1, :pswitch_data_0

    .line 110
    .line 111
    .line 112
    goto :goto_4

    .line 113
    :pswitch_0
    const/16 p0, 0xd

    .line 114
    .line 115
    return p0

    .line 116
    :pswitch_1
    return v5

    .line 117
    :pswitch_2
    const/16 p0, 0xb

    .line 118
    .line 119
    return p0

    .line 120
    :pswitch_3
    const/16 p0, 0xc

    .line 121
    .line 122
    return p0

    .line 123
    :pswitch_4
    if-eq v2, v5, :cond_e

    .line 124
    .line 125
    if-eq v2, v4, :cond_d

    .line 126
    .line 127
    if-eq v2, p1, :cond_c

    .line 128
    .line 129
    :goto_4
    return v6

    .line 130
    :cond_c
    :pswitch_5
    return p1

    .line 131
    :cond_d
    :pswitch_6
    const/16 p0, 0x9

    .line 132
    .line 133
    :cond_e
    :pswitch_7
    return p0

    .line 134
    :cond_f
    const/4 p0, -0x1

    .line 135
    return p0

    .line 136
    nop

    .line 137
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_7
        :pswitch_4
        :pswitch_6
        :pswitch_3
        :pswitch_4
        :pswitch_4
        :pswitch_5
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_0
    .end packed-switch
.end method

.method public static d(LA/c;Lorg/json/JSONArray;)Ljava/util/ArrayList;
    .locals 8

    .line 1
    new-instance p0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    move v1, v0

    .line 8
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-ge v1, v2, :cond_4

    .line 13
    .line 14
    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-static {}, LB1/j;->values()[LB1/j;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    array-length v4, v3

    .line 23
    move v5, v0

    .line 24
    :goto_1
    if-ge v5, v4, :cond_3

    .line 25
    .line 26
    aget-object v6, v3, v5

    .line 27
    .line 28
    iget-object v7, v6, LB1/j;->k:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    if-eqz v7, :cond_2

    .line 35
    .line 36
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    const/4 v3, 0x1

    .line 43
    if-eq v2, v3, :cond_0

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_0
    sget-object v2, LB1/j;->m:LB1/j;

    .line 47
    .line 48
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_1
    sget-object v2, LB1/j;->l:LB1/j;

    .line 53
    .line 54
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    new-instance p0, Ljava/lang/NoSuchFieldException;

    .line 64
    .line 65
    const-string p1, "No such SystemUiOverlay: "

    .line 66
    .line 67
    invoke-static {p1, v2}, Lt/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-direct {p0, p1}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p0

    .line 75
    :cond_4
    return-object p0
.end method

.method public static f(LA/c;Ljava/lang/String;)I
    .locals 5

    .line 1
    const/4 p0, 0x4

    .line 2
    invoke-static {p0}, LX/j;->b(I)[I

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    array-length v1, v0

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v1, :cond_8

    .line 9
    .line 10
    aget v3, v0, v2

    .line 11
    .line 12
    const/4 v4, 0x1

    .line 13
    if-eq v3, v4, :cond_3

    .line 14
    .line 15
    const/4 v4, 0x2

    .line 16
    if-eq v3, v4, :cond_2

    .line 17
    .line 18
    const/4 v4, 0x3

    .line 19
    if-eq v3, v4, :cond_1

    .line 20
    .line 21
    const/4 v4, 0x4

    .line 22
    if-ne v3, v4, :cond_0

    .line 23
    .line 24
    const-string v4, "SystemUiMode.edgeToEdge"

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    throw p0

    .line 29
    :cond_1
    const-string v4, "SystemUiMode.immersiveSticky"

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    const-string v4, "SystemUiMode.immersive"

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_3
    const-string v4, "SystemUiMode.leanBack"

    .line 36
    .line 37
    :goto_1
    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_7

    .line 42
    .line 43
    invoke-static {v3}, LX/j;->a(I)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    const/4 v0, 0x1

    .line 48
    if-eqz p1, :cond_6

    .line 49
    .line 50
    const/4 v1, 0x2

    .line 51
    if-eq p1, v0, :cond_5

    .line 52
    .line 53
    if-eq p1, v1, :cond_4

    .line 54
    .line 55
    return p0

    .line 56
    :cond_4
    const/4 p0, 0x3

    .line 57
    return p0

    .line 58
    :cond_5
    return v1

    .line 59
    :cond_6
    return v0

    .line 60
    :cond_7
    add-int/lit8 v2, v2, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_8
    new-instance p0, Ljava/lang/NoSuchFieldException;

    .line 64
    .line 65
    const-string v0, "No such SystemUiMode: "

    .line 66
    .line 67
    invoke-static {v0, p1}, Lt/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-direct {p0, p1}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p0
.end method

.method public static g(LA/c;Lorg/json/JSONObject;)LB1/i;
    .locals 10

    .line 1
    const-string p0, "statusBarColor"

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    move-object v3, p0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v3, v1

    .line 21
    :goto_0
    const-string p0, "statusBarIconBrightness"

    .line 22
    .line 23
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v2, 0x0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {p0}, LB1/e;->b(Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    move v4, p0

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move v4, v2

    .line 41
    :goto_1
    const-string p0, "systemStatusBarContrastEnforced"

    .line 42
    .line 43
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_2

    .line 48
    .line 49
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    move-object v5, p0

    .line 58
    goto :goto_2

    .line 59
    :cond_2
    move-object v5, v1

    .line 60
    :goto_2
    const-string p0, "systemNavigationBarColor"

    .line 61
    .line 62
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_3

    .line 67
    .line 68
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    move-object v6, p0

    .line 77
    goto :goto_3

    .line 78
    :cond_3
    move-object v6, v1

    .line 79
    :goto_3
    const-string p0, "systemNavigationBarIconBrightness"

    .line 80
    .line 81
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-nez v0, :cond_4

    .line 86
    .line 87
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-static {p0}, LB1/e;->b(Ljava/lang/String;)I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    :cond_4
    move v7, v2

    .line 96
    const-string p0, "systemNavigationBarDividerColor"

    .line 97
    .line 98
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-nez v0, :cond_5

    .line 103
    .line 104
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    move-object v8, p0

    .line 113
    goto :goto_4

    .line 114
    :cond_5
    move-object v8, v1

    .line 115
    :goto_4
    const-string p0, "systemNavigationBarContrastEnforced"

    .line 116
    .line 117
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-nez v0, :cond_6

    .line 122
    .line 123
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 124
    .line 125
    .line 126
    move-result p0

    .line 127
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    :cond_6
    move-object v9, v1

    .line 132
    new-instance v2, LB1/i;

    .line 133
    .line 134
    invoke-direct/range {v2 .. v9}, LB1/i;-><init>(Ljava/lang/Integer;ILjava/lang/Boolean;Ljava/lang/Integer;ILjava/lang/Integer;Ljava/lang/Boolean;)V

    .line 135
    .line 136
    .line 137
    return-object v2
.end method

.method public static j(Ljava/lang/String;IIII)Ljava/util/HashMap;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "text"

    .line 7
    .line 8
    invoke-virtual {v0, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    const-string p0, "selectionBase"

    .line 12
    .line 13
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {v0, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    const-string p0, "selectionExtent"

    .line 21
    .line 22
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {v0, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    const-string p0, "composingBase"

    .line 30
    .line 31
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {v0, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    const-string p0, "composingExtent"

    .line 39
    .line 40
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {v0, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    return-object v0
.end method


# virtual methods
.method public A(ZLcom/google/android/gms/common/api/Status;)V
    .locals 4

    .line 1
    iget-object v0, p0, LA/c;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Map;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    new-instance v1, Ljava/util/HashMap;

    .line 7
    .line 8
    iget-object v2, p0, LA/c;->l:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, Ljava/util/Map;

    .line 11
    .line 12
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 13
    .line 14
    .line 15
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 16
    iget-object v0, p0, LA/c;->m:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v2, v0

    .line 19
    check-cast v2, Ljava/util/Map;

    .line 20
    .line 21
    monitor-enter v2

    .line 22
    :try_start_1
    new-instance v0, Ljava/util/HashMap;

    .line 23
    .line 24
    iget-object v3, p0, LA/c;->m:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v3, Ljava/util/Map;

    .line 27
    .line 28
    invoke-direct {v0, v3}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 29
    .line 30
    .line 31
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Ljava/util/Map$Entry;

    .line 51
    .line 52
    if-nez p1, :cond_1

    .line 53
    .line 54
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    check-cast v3, Ljava/lang/Boolean;

    .line 59
    .line 60
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_0

    .line 65
    .line 66
    :cond_1
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, Lcom/google/android/gms/common/api/internal/BasePendingResult;

    .line 71
    .line 72
    invoke-virtual {v2, p2}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->N(Lcom/google/android/gms/common/api/Status;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-eqz v1, :cond_5

    .line 89
    .line 90
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    check-cast v1, Ljava/util/Map$Entry;

    .line 95
    .line 96
    if-nez p1, :cond_4

    .line 97
    .line 98
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    check-cast v2, Ljava/lang/Boolean;

    .line 103
    .line 104
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-eqz v2, :cond_3

    .line 109
    .line 110
    :cond_4
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    check-cast v1, Lg1/e;

    .line 115
    .line 116
    new-instance v2, LK0/e;

    .line 117
    .line 118
    invoke-direct {v2, p2}, LK0/e;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1, v2}, Lg1/e;->c(Ljava/lang/Exception;)V

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_5
    return-void

    .line 126
    :catchall_0
    move-exception p1

    .line 127
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 128
    throw p1

    .line 129
    :catchall_1
    move-exception p1

    .line 130
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 131
    throw p1
.end method

.method public a(Lg1/i;)V
    .locals 1

    .line 1
    iget-object p1, p0, LA/c;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, LA/c;

    .line 4
    .line 5
    iget-object p1, p1, LA/c;->m:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p1, Ljava/util/Map;

    .line 8
    .line 9
    iget-object v0, p0, LA/c;->l:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lg1/e;

    .line 12
    .line 13
    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget v0, p0, LA/c;->k:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x1

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LA/c;->l:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, LY0/b;

    .line 11
    .line 12
    check-cast p2, Lg1/e;

    .line 13
    .line 14
    check-cast p1, LY0/e;

    .line 15
    .line 16
    new-instance v1, LY0/c;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-direct {v1, v0, p2, v3}, LY0/c;-><init>(LY0/b;Lg1/e;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->q()Landroid/os/IInterface;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, LY0/s;

    .line 27
    .line 28
    iget-object p2, p0, LA/c;->m:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p2, LF0/g;

    .line 31
    .line 32
    invoke-static {}, LY0/f;->a()LK0/f;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {p1}, LY0/a;->d()Landroid/os/Parcel;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    sget v4, LY0/n;->a:I

    .line 41
    .line 42
    invoke-virtual {v3, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v3, p2}, LY0/n;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 46
    .line 47
    .line 48
    invoke-static {v3, v0}, LY0/n;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v3, v2}, LY0/a;->e(Landroid/os/Parcel;I)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_0
    iget-object v0, p0, LA/c;->l:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, LY0/b;

    .line 58
    .line 59
    check-cast p2, Lg1/e;

    .line 60
    .line 61
    check-cast p1, LY0/e;

    .line 62
    .line 63
    new-instance v3, LY0/c;

    .line 64
    .line 65
    invoke-direct {v3, v0, p2, v2}, LY0/c;-><init>(LY0/b;Lg1/e;I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->q()Landroid/os/IInterface;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    check-cast p1, LY0/s;

    .line 73
    .line 74
    iget-object p2, p0, LA/c;->m:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p2, LF0/i;

    .line 77
    .line 78
    invoke-static {}, LY0/f;->a()LK0/f;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {p1}, LY0/a;->d()Landroid/os/Parcel;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    sget v4, LY0/n;->a:I

    .line 87
    .line 88
    invoke-virtual {v2, v3}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 89
    .line 90
    .line 91
    invoke-static {v2, p2}, LY0/n;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 92
    .line 93
    .line 94
    invoke-static {v2, v0}, LY0/n;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, v2, v1}, LY0/a;->e(Landroid/os/Parcel;I)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :pswitch_1
    iget-object v0, p0, LA/c;->l:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v0, LY0/b;

    .line 104
    .line 105
    check-cast p2, Lg1/e;

    .line 106
    .line 107
    check-cast p1, LY0/q;

    .line 108
    .line 109
    new-instance v1, LY0/c;

    .line 110
    .line 111
    invoke-direct {v1, v0, p2}, LY0/c;-><init>(LY0/b;Lg1/e;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->q()Landroid/os/IInterface;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    check-cast p1, LY0/r;

    .line 119
    .line 120
    iget-object p2, p0, LA/c;->m:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast p2, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;

    .line 123
    .line 124
    invoke-static {}, LY0/f;->a()LK0/f;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {p1}, LY0/a;->d()Landroid/os/Parcel;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    sget v4, LY0/n;->a:I

    .line 133
    .line 134
    invoke-virtual {v3, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 135
    .line 136
    .line 137
    invoke-static {v3, p2}, LY0/n;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 138
    .line 139
    .line 140
    invoke-static {v3, v0}, LY0/n;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1, v3, v2}, LY0/a;->e(Landroid/os/Parcel;I)V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :pswitch_2
    iget-object v0, p0, LA/c;->l:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v0, LY0/b;

    .line 150
    .line 151
    check-cast p2, Lg1/e;

    .line 152
    .line 153
    check-cast p1, LY0/q;

    .line 154
    .line 155
    new-instance v1, LY0/d;

    .line 156
    .line 157
    const/4 v2, 0x2

    .line 158
    invoke-direct {v1, v0, p2, v2}, LY0/d;-><init>(LK0/i;Lg1/e;I)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->q()Landroid/os/IInterface;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    check-cast p1, LY0/r;

    .line 166
    .line 167
    iget-object p2, p0, LA/c;->m:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast p2, Lcom/google/android/gms/auth/api/identity/ClearTokenRequest;

    .line 170
    .line 171
    invoke-static {}, LY0/f;->a()LK0/f;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-virtual {p1}, LY0/a;->d()Landroid/os/Parcel;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    sget v3, LY0/n;->a:I

    .line 180
    .line 181
    invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 182
    .line 183
    .line 184
    invoke-static {v2, p2}, LY0/n;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 185
    .line 186
    .line 187
    invoke-static {v2, v0}, LY0/n;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 188
    .line 189
    .line 190
    const/4 p2, 0x4

    .line 191
    invoke-virtual {p1, v2, p2}, LY0/a;->e(Landroid/os/Parcel;I)V

    .line 192
    .line 193
    .line 194
    return-void

    .line 195
    :pswitch_3
    iget-object v0, p0, LA/c;->l:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v0, LY0/b;

    .line 198
    .line 199
    check-cast p2, Lg1/e;

    .line 200
    .line 201
    check-cast p1, LY0/q;

    .line 202
    .line 203
    new-instance v3, LY0/d;

    .line 204
    .line 205
    invoke-direct {v3, v0, p2, v2}, LY0/d;-><init>(LK0/i;Lg1/e;I)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->q()Landroid/os/IInterface;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    check-cast p1, LY0/r;

    .line 213
    .line 214
    iget-object p2, p0, LA/c;->m:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast p2, Lcom/google/android/gms/auth/api/identity/RevokeAccessRequest;

    .line 217
    .line 218
    invoke-static {}, LY0/f;->a()LK0/f;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-virtual {p1}, LY0/a;->d()Landroid/os/Parcel;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    sget v4, LY0/n;->a:I

    .line 227
    .line 228
    invoke-virtual {v2, v3}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 229
    .line 230
    .line 231
    invoke-static {v2, p2}, LY0/n;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 232
    .line 233
    .line 234
    invoke-static {v2, v0}, LY0/n;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {p1, v2, v1}, LY0/a;->e(Landroid/os/Parcel;I)V

    .line 238
    .line 239
    .line 240
    return-void

    .line 241
    :pswitch_data_0
    .packed-switch 0x17
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b(Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p1, LI/f;

    .line 2
    .line 3
    instance-of v0, p1, LI/d;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, LI1/f;->q:LI1/f;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    instance-of v0, p1, LI/g;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    sget-object v0, LI1/f;->p:LI1/f;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    instance-of v0, p1, LI/h;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    sget-object v0, LI1/f;->s:LI1/f;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    instance-of v0, p1, LI/i;

    .line 25
    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    sget-object v0, LI1/f;->t:LI1/f;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_3
    instance-of v0, p1, LI/j;

    .line 32
    .line 33
    if-eqz v0, :cond_4

    .line 34
    .line 35
    sget-object v0, LI1/f;->r:LI1/f;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_4
    sget-object v0, LI1/f;->u:LI1/f;

    .line 39
    .line 40
    :goto_0
    iget-object v1, p0, LA/c;->l:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, LI1/k;

    .line 43
    .line 44
    new-instance v2, LI1/e;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const/4 v3, 0x0

    .line 51
    invoke-direct {v2, v0, p1, v3}, LI1/e;-><init>(LI1/f;Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v1, v2}, La/a;->o(LZ1/l;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public e(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, LA/c;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA/c;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lt1/h;

    .line 9
    .line 10
    iget-object v1, p0, LA/c;->m:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, LA/c;

    .line 13
    .line 14
    iget-object v1, v1, LA/c;->m:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, LB1/s;

    .line 17
    .line 18
    iget-object v1, v1, LB1/s;->m:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, LC1/l;

    .line 21
    .line 22
    invoke-interface {v1, p1}, LC1/l;->a(Ljava/lang/Object;)Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {v0, p1}, Lt1/h;->a(Ljava/nio/ByteBuffer;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_0
    iget-object p1, p0, LA/c;->m:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p1, LA0/j;

    .line 33
    .line 34
    iget-object v0, p1, LA0/j;->l:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 37
    .line 38
    iget-object v1, p0, LA/c;->l:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, LB1/q;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    iget-object p1, p1, LA0/j;->l:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-nez p1, :cond_0

    .line 54
    .line 55
    new-instance p1, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v0, "The queue becomes empty after removing config generation "

    .line 58
    .line 59
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    iget v0, v1, LB1/q;->a:I

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    const-string v0, "SettingsChannel"

    .line 72
    .line 73
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    :cond_0
    return-void

    .line 77
    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_0
    .end packed-switch
.end method

.method public h(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    add-int/lit8 v0, v0, 0x1

    .line 16
    .line 17
    add-int/2addr v0, v1

    .line 18
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p2, "="

    .line 25
    .line 26
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iget-object p2, p0, LA/c;->l:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p2, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public i(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LA/c;->m:Ljava/lang/Object;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return-object p1

    .line 7
    :cond_0
    instance-of v1, v0, Ljava/util/Map;

    .line 8
    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    check-cast v0, Ljava/util/Map;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1

    .line 18
    :cond_1
    instance-of v1, v0, Lorg/json/JSONObject;

    .line 19
    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    check-cast v0, Lorg/json/JSONObject;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1

    .line 29
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 30
    .line 31
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 32
    .line 33
    .line 34
    throw p1
.end method

.method public k(LA/c;LB1/o;)V
    .locals 2

    .line 1
    iget-object v0, p0, LA/c;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LB1/a;

    .line 4
    .line 5
    iget-object v1, v0, LB1/a;->l:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, LA0/j;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, LA/c;->l:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Ljava/util/Map;

    .line 14
    .line 15
    invoke-virtual {p2, p1}, LB1/o;->d(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object p1, p1, LA/c;->l:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    const-string v1, "getKeyboardState"

    .line 27
    .line 28
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-nez p1, :cond_1

    .line 33
    .line 34
    invoke-virtual {p2}, LB1/o;->b()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    :try_start_0
    iget-object p1, v0, LB1/a;->l:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, LA0/j;

    .line 41
    .line 42
    iget-object p1, p1, LA0/j;->l:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, [Lr1/u;

    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    aget-object p1, p1, v0

    .line 48
    .line 49
    check-cast p1, Lr1/s;

    .line 50
    .line 51
    iget-object p1, p1, Lr1/s;->l:Ljava/util/HashMap;

    .line 52
    .line 53
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iput-object p1, p0, LA/c;->l:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :catch_0
    move-exception p1

    .line 61
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    const/4 v0, 0x0

    .line 66
    const-string v1, "error"

    .line 67
    .line 68
    invoke-virtual {p2, v1, p1, v0}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    :goto_0
    iget-object p1, p0, LA/c;->l:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p1, Ljava/util/Map;

    .line 74
    .line 75
    invoke-virtual {p2, p1}, LB1/o;->d(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public l(Lb0/s;Z)V
    .locals 2

    .line 1
    const-string v0, "f"

    .line 2
    .line 3
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA/c;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lb0/I;

    .line 9
    .line 10
    iget-object v0, v0, Lb0/I;->x:Lb0/s;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Lb0/s;->j()Lb0/I;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v0, v0, Lb0/I;->n:LA/c;

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-virtual {v0, p1, v1}, LA/c;->l(Lb0/s;Z)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object p1, p0, LA/c;->m:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-nez p1, :cond_2

    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    if-eqz p2, :cond_1

    .line 46
    .line 47
    throw p1

    .line 48
    :cond_1
    throw p1

    .line 49
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 50
    .line 51
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_3
    return-void
.end method

.method public m(Lb0/s;Z)V
    .locals 2

    .line 1
    const-string v0, "f"

    .line 2
    .line 3
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA/c;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lb0/I;

    .line 9
    .line 10
    iget-object v1, v0, Lb0/I;->v:Lb0/u;

    .line 11
    .line 12
    iget-object v1, v1, Lb0/u;->n:Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;

    .line 13
    .line 14
    iget-object v0, v0, Lb0/I;->x:Lb0/s;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Lb0/s;->j()Lb0/I;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v0, v0, Lb0/I;->n:LA/c;

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-virtual {v0, p1, v1}, LA/c;->m(Lb0/s;Z)V

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object p1, p0, LA/c;->m:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-nez p1, :cond_2

    .line 47
    .line 48
    const/4 p1, 0x0

    .line 49
    if-eqz p2, :cond_1

    .line 50
    .line 51
    throw p1

    .line 52
    :cond_1
    throw p1

    .line 53
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 54
    .line 55
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_3
    return-void
.end method

.method public n(Lb0/s;Z)V
    .locals 2

    .line 1
    const-string v0, "f"

    .line 2
    .line 3
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA/c;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lb0/I;

    .line 9
    .line 10
    iget-object v0, v0, Lb0/I;->x:Lb0/s;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Lb0/s;->j()Lb0/I;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v0, v0, Lb0/I;->n:LA/c;

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-virtual {v0, p1, v1}, LA/c;->n(Lb0/s;Z)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object p1, p0, LA/c;->m:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-nez p1, :cond_2

    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    if-eqz p2, :cond_1

    .line 46
    .line 47
    throw p1

    .line 48
    :cond_1
    throw p1

    .line 49
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 50
    .line 51
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_3
    return-void
.end method

.method public o(Ljava/nio/ByteBuffer;Lt1/h;)V
    .locals 5

    .line 1
    iget v0, p0, LA/c;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA/c;->m:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LB1/s;

    .line 9
    .line 10
    iget-object v1, v0, LB1/s;->m:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, LC1/n;

    .line 13
    .line 14
    invoke-interface {v1, p1}, LC1/n;->d(Ljava/nio/ByteBuffer;)LA/c;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :try_start_0
    iget-object v2, p0, LA/c;->l:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, LC1/m;

    .line 21
    .line 22
    new-instance v3, LB1/o;

    .line 23
    .line 24
    const/4 v4, 0x1

    .line 25
    invoke-direct {v3, p0, p2, v4}, LB1/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v2, p1, v3}, LC1/m;->k(LA/c;LB1/o;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catch_0
    move-exception p1

    .line 33
    new-instance v2, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v3, "MethodChannel#"

    .line 36
    .line 37
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, v0, LB1/s;->k:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v2, "Failed to handle method call"

    .line 52
    .line 53
    invoke-static {v0, v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-interface {v1, v0, p1}, LC1/n;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/nio/ByteBuffer;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p2, p1}, Lt1/h;->a(Ljava/nio/ByteBuffer;)V

    .line 69
    .line 70
    .line 71
    :goto_0
    return-void

    .line 72
    :pswitch_0
    iget-object v0, p0, LA/c;->m:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, LB1/s;

    .line 75
    .line 76
    :try_start_1
    iget-object v1, p0, LA/c;->l:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v1, LC1/b;

    .line 79
    .line 80
    iget-object v2, v0, LB1/s;->m:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v2, LC1/l;

    .line 83
    .line 84
    invoke-interface {v2, p1}, LC1/l;->b(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    new-instance v2, LA/c;

    .line 89
    .line 90
    const/16 v3, 0x9

    .line 91
    .line 92
    const/4 v4, 0x0

    .line 93
    invoke-direct {v2, p0, p2, v3, v4}, LA/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 94
    .line 95
    .line 96
    invoke-interface {v1, p1, v2}, LC1/b;->a(Ljava/lang/Object;LA/c;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :catch_1
    move-exception p1

    .line 101
    new-instance v1, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    const-string v2, "BasicMessageChannel#"

    .line 104
    .line 105
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    iget-object v0, v0, LB1/s;->k:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v0, Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    const-string v1, "Failed to handle message"

    .line 120
    .line 121
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 122
    .line 123
    .line 124
    const/4 p1, 0x0

    .line 125
    invoke-virtual {p2, p1}, Lt1/h;->a(Ljava/nio/ByteBuffer;)V

    .line 126
    .line 127
    .line 128
    :goto_1
    return-void

    .line 129
    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_0
    .end packed-switch
.end method

.method public onResult(Ljava/lang/Object;)V
    .locals 12

    .line 1
    check-cast p1, LH/l;

    .line 2
    .line 3
    iget-object v0, p0, LA/c;->l:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LI1/k;

    .line 6
    .line 7
    iget-object p1, p1, LH/l;->a:LH/c;

    .line 8
    .line 9
    instance-of v1, p1, LH/i;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    iget-object v1, p1, LH/c;->a:Ljava/lang/String;

    .line 15
    .line 16
    const-string v3, "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL"

    .line 17
    .line 18
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    iget-object v1, p0, LA/c;->m:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, LI1/s;

    .line 27
    .line 28
    iget-object v1, v1, LI1/s;->n:LD/c;

    .line 29
    .line 30
    iget-object p1, p1, LH/c;->b:Landroid/os/Bundle;

    .line 31
    .line 32
    const-string v1, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI"

    .line 33
    .line 34
    const-string v3, "data"

    .line 35
    .line 36
    invoke-static {p1, v3}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :try_start_0
    const-string v3, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID"

    .line 40
    .line 41
    invoke-virtual {p1, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    const-string v3, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN"

    .line 46
    .line 47
    invoke-virtual {p1, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    const-string v3, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME"

    .line 52
    .line 53
    invoke-virtual {p1, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    const-string v3, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME"

    .line 58
    .line 59
    invoke-virtual {p1, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v8

    .line 63
    const-string v3, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME"

    .line 64
    .line 65
    invoke-virtual {p1, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v9

    .line 69
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 70
    .line 71
    const/16 v4, 0x21

    .line 72
    .line 73
    if-lt v3, v4, :cond_0

    .line 74
    .line 75
    invoke-static {p1}, LE/c;->o(Landroid/os/Bundle;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    check-cast v1, Landroid/net/Uri;

    .line 80
    .line 81
    :goto_0
    move-object v10, v1

    .line 82
    goto :goto_1

    .line 83
    :catch_0
    move-exception v0

    .line 84
    move-object p1, v0

    .line 85
    goto :goto_4

    .line 86
    :cond_0
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    check-cast v1, Landroid/net/Uri;

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :goto_1
    const-string v1, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER"

    .line 94
    .line 95
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v11

    .line 99
    new-instance v4, Lh1/c;

    .line 100
    .line 101
    invoke-static {v5}, La2/h;->b(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    invoke-static {v6}, La2/h;->b(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    invoke-direct/range {v4 .. v11}, Lh1/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 108
    .line 109
    .line 110
    new-instance p1, LI1/j;

    .line 111
    .line 112
    new-instance v5, LI1/x;

    .line 113
    .line 114
    iget-object v1, v4, Lh1/c;->g:Landroid/net/Uri;

    .line 115
    .line 116
    if-nez v1, :cond_1

    .line 117
    .line 118
    :goto_2
    move-object v11, v2

    .line 119
    goto :goto_3

    .line 120
    :cond_1
    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    goto :goto_2

    .line 125
    :goto_3
    iget-object v6, v4, Lh1/c;->d:Ljava/lang/String;

    .line 126
    .line 127
    iget-object v7, v4, Lh1/c;->e:Ljava/lang/String;

    .line 128
    .line 129
    iget-object v8, v4, Lh1/c;->f:Ljava/lang/String;

    .line 130
    .line 131
    iget-object v9, v4, Lh1/c;->h:Ljava/lang/String;

    .line 132
    .line 133
    iget-object v10, v4, Lh1/c;->c:Ljava/lang/String;

    .line 134
    .line 135
    invoke-direct/range {v5 .. v11}, LI1/x;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-direct {p1, v5}, LI1/j;-><init>(LI1/x;)V

    .line 139
    .line 140
    .line 141
    invoke-static {v0, p1}, La/a;->o(LZ1/l;Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :goto_4
    new-instance v0, LK/c;

    .line 146
    .line 147
    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 148
    .line 149
    .line 150
    throw v0

    .line 151
    :cond_2
    new-instance v1, LI1/e;

    .line 152
    .line 153
    new-instance v3, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    const-string v4, "Unexpected credential type: "

    .line 156
    .line 157
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    sget-object v3, LI1/f;->m:LI1/f;

    .line 168
    .line 169
    invoke-direct {v1, v3, p1, v2}, LI1/e;-><init>(LI1/f;Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-static {v0, v1}, La/a;->o(LZ1/l;Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    return-void
.end method

.method public p(Lb0/s;Z)V
    .locals 2

    .line 1
    const-string v0, "f"

    .line 2
    .line 3
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA/c;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lb0/I;

    .line 9
    .line 10
    iget-object v0, v0, Lb0/I;->x:Lb0/s;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Lb0/s;->j()Lb0/I;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v0, v0, Lb0/I;->n:LA/c;

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-virtual {v0, p1, v1}, LA/c;->p(Lb0/s;Z)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object p1, p0, LA/c;->m:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-nez p1, :cond_2

    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    if-eqz p2, :cond_1

    .line 46
    .line 47
    throw p1

    .line 48
    :cond_1
    throw p1

    .line 49
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 50
    .line 51
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_3
    return-void
.end method

.method public q(Lb0/s;Z)V
    .locals 2

    .line 1
    const-string v0, "f"

    .line 2
    .line 3
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA/c;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lb0/I;

    .line 9
    .line 10
    iget-object v0, v0, Lb0/I;->x:Lb0/s;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Lb0/s;->j()Lb0/I;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v0, v0, Lb0/I;->n:LA/c;

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-virtual {v0, p1, v1}, LA/c;->q(Lb0/s;Z)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object p1, p0, LA/c;->m:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-nez p1, :cond_2

    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    if-eqz p2, :cond_1

    .line 46
    .line 47
    throw p1

    .line 48
    :cond_1
    throw p1

    .line 49
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 50
    .line 51
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_3
    return-void
.end method

.method public r(Lb0/s;Z)V
    .locals 2

    .line 1
    const-string v0, "f"

    .line 2
    .line 3
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA/c;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lb0/I;

    .line 9
    .line 10
    iget-object v0, v0, Lb0/I;->x:Lb0/s;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Lb0/s;->j()Lb0/I;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v0, v0, Lb0/I;->n:LA/c;

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-virtual {v0, p1, v1}, LA/c;->r(Lb0/s;Z)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object p1, p0, LA/c;->m:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-nez p1, :cond_2

    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    if-eqz p2, :cond_1

    .line 46
    .line 47
    throw p1

    .line 48
    :cond_1
    throw p1

    .line 49
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 50
    .line 51
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_3
    return-void
.end method

.method public s(Lb0/s;Z)V
    .locals 2

    .line 1
    const-string v0, "f"

    .line 2
    .line 3
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA/c;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lb0/I;

    .line 9
    .line 10
    iget-object v1, v0, Lb0/I;->v:Lb0/u;

    .line 11
    .line 12
    iget-object v1, v1, Lb0/u;->n:Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;

    .line 13
    .line 14
    iget-object v0, v0, Lb0/I;->x:Lb0/s;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Lb0/s;->j()Lb0/I;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v0, v0, Lb0/I;->n:LA/c;

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-virtual {v0, p1, v1}, LA/c;->s(Lb0/s;Z)V

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object p1, p0, LA/c;->m:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-nez p1, :cond_2

    .line 47
    .line 48
    const/4 p1, 0x0

    .line 49
    if-eqz p2, :cond_1

    .line 50
    .line 51
    throw p1

    .line 52
    :cond_1
    throw p1

    .line 53
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 54
    .line 55
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_3
    return-void
.end method

.method public t(Lb0/s;Z)V
    .locals 2

    .line 1
    const-string v0, "f"

    .line 2
    .line 3
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA/c;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lb0/I;

    .line 9
    .line 10
    iget-object v0, v0, Lb0/I;->x:Lb0/s;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Lb0/s;->j()Lb0/I;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v0, v0, Lb0/I;->n:LA/c;

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-virtual {v0, p1, v1}, LA/c;->t(Lb0/s;Z)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object p1, p0, LA/c;->m:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-nez p1, :cond_2

    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    if-eqz p2, :cond_1

    .line 46
    .line 47
    throw p1

    .line 48
    :cond_1
    throw p1

    .line 49
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 50
    .line 51
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget v0, p0, LA/c;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const/16 v1, 0x64

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, LA/c;->m:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const/16 v1, 0x7b

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, LA/c;->l:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    const/4 v3, 0x0

    .line 45
    :goto_0
    if-ge v3, v2, :cond_1

    .line 46
    .line 47
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v4, Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    add-int/lit8 v4, v2, -0x1

    .line 57
    .line 58
    if-ge v3, v4, :cond_0

    .line 59
    .line 60
    const-string v4, ", "

    .line 61
    .line 62
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    const/16 v1, 0x7d

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    return-object v0

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_0
    .end packed-switch
.end method

.method public u(Lb0/s;Z)V
    .locals 2

    .line 1
    const-string v0, "f"

    .line 2
    .line 3
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA/c;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lb0/I;

    .line 9
    .line 10
    iget-object v0, v0, Lb0/I;->x:Lb0/s;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Lb0/s;->j()Lb0/I;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v0, v0, Lb0/I;->n:LA/c;

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-virtual {v0, p1, v1}, LA/c;->u(Lb0/s;Z)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object p1, p0, LA/c;->m:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-nez p1, :cond_2

    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    if-eqz p2, :cond_1

    .line 46
    .line 47
    throw p1

    .line 48
    :cond_1
    throw p1

    .line 49
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 50
    .line 51
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_3
    return-void
.end method

.method public v(Lb0/s;Landroid/os/Bundle;Z)V
    .locals 2

    .line 1
    const-string v0, "f"

    .line 2
    .line 3
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA/c;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lb0/I;

    .line 9
    .line 10
    iget-object v0, v0, Lb0/I;->x:Lb0/s;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Lb0/s;->j()Lb0/I;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v0, v0, Lb0/I;->n:LA/c;

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-virtual {v0, p1, p2, v1}, LA/c;->v(Lb0/s;Landroid/os/Bundle;Z)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object p1, p0, LA/c;->m:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    if-eqz p2, :cond_3

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-nez p1, :cond_2

    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    if-eqz p3, :cond_1

    .line 46
    .line 47
    throw p1

    .line 48
    :cond_1
    throw p1

    .line 49
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 50
    .line 51
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_3
    return-void
.end method

.method public w(Lb0/s;Z)V
    .locals 2

    .line 1
    const-string v0, "f"

    .line 2
    .line 3
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA/c;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lb0/I;

    .line 9
    .line 10
    iget-object v0, v0, Lb0/I;->x:Lb0/s;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Lb0/s;->j()Lb0/I;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v0, v0, Lb0/I;->n:LA/c;

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-virtual {v0, p1, v1}, LA/c;->w(Lb0/s;Z)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object p1, p0, LA/c;->m:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-nez p1, :cond_2

    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    if-eqz p2, :cond_1

    .line 46
    .line 47
    throw p1

    .line 48
    :cond_1
    throw p1

    .line 49
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 50
    .line 51
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_3
    return-void
.end method

.method public x(Lb0/s;Z)V
    .locals 2

    .line 1
    const-string v0, "f"

    .line 2
    .line 3
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA/c;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lb0/I;

    .line 9
    .line 10
    iget-object v0, v0, Lb0/I;->x:Lb0/s;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Lb0/s;->j()Lb0/I;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v0, v0, Lb0/I;->n:LA/c;

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-virtual {v0, p1, v1}, LA/c;->x(Lb0/s;Z)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object p1, p0, LA/c;->m:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-nez p1, :cond_2

    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    if-eqz p2, :cond_1

    .line 46
    .line 47
    throw p1

    .line 48
    :cond_1
    throw p1

    .line 49
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 50
    .line 51
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_3
    return-void
.end method

.method public y(Lb0/s;Z)V
    .locals 2

    .line 1
    const-string v0, "f"

    .line 2
    .line 3
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA/c;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lb0/I;

    .line 9
    .line 10
    iget-object v0, v0, Lb0/I;->x:Lb0/s;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Lb0/s;->j()Lb0/I;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v0, v0, Lb0/I;->n:LA/c;

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-virtual {v0, p1, v1}, LA/c;->y(Lb0/s;Z)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object p1, p0, LA/c;->m:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-nez p1, :cond_2

    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    if-eqz p2, :cond_1

    .line 46
    .line 47
    throw p1

    .line 48
    :cond_1
    throw p1

    .line 49
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 50
    .line 51
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_3
    return-void
.end method

.method public z(LA/j;)V
    .locals 4

    .line 1
    iget-object v0, p0, LA/c;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LA/p;

    .line 4
    .line 5
    iget-object v1, p0, LA/c;->l:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lw/d;

    .line 8
    .line 9
    iget v2, p1, LA/j;->b:I

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    iget-object p1, p1, LA/j;->a:Landroid/graphics/Typeface;

    .line 14
    .line 15
    new-instance v2, LA/a;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v1, p1, v3}, LA/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v2}, LA/p;->execute(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    new-instance p1, LA/b;

    .line 26
    .line 27
    invoke-direct {p1, v1, v2}, LA/b;-><init>(Lw/d;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, LA/p;->execute(Ljava/lang/Runnable;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

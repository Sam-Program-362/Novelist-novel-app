.class public final Lb0/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb0/F;


# instance fields
.field public final synthetic a:Lb0/I;


# direct methods
.method public constructor <init>(Lb0/I;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb0/H;->a:Lb0/I;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lb0/H;->a:Lb0/I;

    .line 2
    .line 3
    iget-object v1, v0, Lb0/I;->d:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x1

    .line 10
    sub-int/2addr v2, v3

    .line 11
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lb0/a;

    .line 16
    .line 17
    iput-object v1, v0, Lb0/I;->h:Lb0/a;

    .line 18
    .line 19
    iget-object v1, v1, Lb0/a;->a:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v4, 0x0

    .line 26
    move v5, v4

    .line 27
    :cond_0
    :goto_0
    if-ge v5, v2, :cond_1

    .line 28
    .line 29
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    add-int/lit8 v5, v5, 0x1

    .line 34
    .line 35
    check-cast v6, Lb0/P;

    .line 36
    .line 37
    iget-object v6, v6, Lb0/P;->b:Lb0/s;

    .line 38
    .line 39
    if-eqz v6, :cond_0

    .line 40
    .line 41
    iput-boolean v3, v6, Lb0/s;->w:Z

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 v1, -0x1

    .line 45
    invoke-virtual {v0, p1, p2, v1, v4}, Lb0/I;->R(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    iget-object v2, v0, Lb0/I;->m:Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-nez v2, :cond_5

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-lez v2, :cond_5

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    sub-int/2addr v2, v3

    .line 68
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    check-cast p2, Ljava/lang/Boolean;

    .line 73
    .line 74
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    new-instance p2, Ljava/util/LinkedHashSet;

    .line 78
    .line 79
    invoke-direct {p2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    move v3, v4

    .line 87
    :goto_1
    if-ge v3, v2, :cond_2

    .line 88
    .line 89
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    add-int/lit8 v3, v3, 0x1

    .line 94
    .line 95
    check-cast v5, Lb0/a;

    .line 96
    .line 97
    invoke-static {v5}, Lb0/I;->E(Lb0/a;)Ljava/util/HashSet;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    invoke-interface {p2, v5}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_2
    iget-object p1, v0, Lb0/I;->m:Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    :goto_2
    if-ge v4, v0, :cond_5

    .line 112
    .line 113
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    add-int/lit8 v4, v4, 0x1

    .line 118
    .line 119
    if-nez v2, :cond_4

    .line 120
    .line 121
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    if-nez v3, :cond_3

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    check-cast p1, Lb0/s;

    .line 137
    .line 138
    const/4 p1, 0x0

    .line 139
    throw p1

    .line 140
    :cond_4
    new-instance p1, Ljava/lang/ClassCastException;

    .line 141
    .line 142
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 143
    .line 144
    .line 145
    throw p1

    .line 146
    :cond_5
    return v1
.end method

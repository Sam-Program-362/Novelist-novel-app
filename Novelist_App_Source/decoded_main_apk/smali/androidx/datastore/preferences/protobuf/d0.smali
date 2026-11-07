.class public final Landroidx/datastore/preferences/protobuf/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/c0;
    .locals 5

    .line 1
    check-cast p0, Landroidx/datastore/preferences/protobuf/v;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/v;->unknownFields:Landroidx/datastore/preferences/protobuf/c0;

    .line 4
    .line 5
    sget-object v1, Landroidx/datastore/preferences/protobuf/c0;->f:Landroidx/datastore/preferences/protobuf/c0;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    new-instance v0, Landroidx/datastore/preferences/protobuf/c0;

    .line 10
    .line 11
    const/16 v1, 0x8

    .line 12
    .line 13
    new-array v2, v1, [I

    .line 14
    .line 15
    new-array v1, v1, [Ljava/lang/Object;

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-direct {v0, v4, v2, v1, v3}, Landroidx/datastore/preferences/protobuf/c0;-><init>(I[I[Ljava/lang/Object;Z)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Landroidx/datastore/preferences/protobuf/v;->unknownFields:Landroidx/datastore/preferences/protobuf/c0;

    .line 23
    .line 24
    :cond_0
    return-object v0
.end method

.method public static b(ILandroidx/datastore/preferences/protobuf/k;Ljava/lang/Object;)Z
    .locals 8

    .line 1
    iget-object v0, p1, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    .line 2
    .line 3
    iget v1, p1, Landroidx/datastore/preferences/protobuf/k;->b:I

    .line 4
    .line 5
    ushr-int/lit8 v2, v1, 0x3

    .line 6
    .line 7
    and-int/lit8 v1, v1, 0x7

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    const/4 v5, 0x3

    .line 12
    if-eqz v1, :cond_a

    .line 13
    .line 14
    if-eq v1, v4, :cond_9

    .line 15
    .line 16
    const/4 v6, 0x2

    .line 17
    if-eq v1, v6, :cond_8

    .line 18
    .line 19
    if-eq v1, v5, :cond_2

    .line 20
    .line 21
    const/4 p0, 0x4

    .line 22
    if-eq v1, p0, :cond_1

    .line 23
    .line 24
    const/4 p0, 0x5

    .line 25
    if-ne v1, p0, :cond_0

    .line 26
    .line 27
    invoke-virtual {p1, p0}, Landroidx/datastore/preferences/protobuf/k;->w(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/j;->j()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    check-cast p2, Landroidx/datastore/preferences/protobuf/c0;

    .line 35
    .line 36
    shl-int/lit8 v0, v2, 0x3

    .line 37
    .line 38
    or-int/2addr p0, v0

    .line 39
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p2, p0, p1}, Landroidx/datastore/preferences/protobuf/c0;->c(ILjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return v4

    .line 47
    :cond_0
    invoke-static {}, Landroidx/datastore/preferences/protobuf/z;->b()Landroidx/datastore/preferences/protobuf/y;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    throw p0

    .line 52
    :cond_1
    return v3

    .line 53
    :cond_2
    new-instance v0, Landroidx/datastore/preferences/protobuf/c0;

    .line 54
    .line 55
    const/16 v1, 0x8

    .line 56
    .line 57
    new-array v6, v1, [I

    .line 58
    .line 59
    new-array v1, v1, [Ljava/lang/Object;

    .line 60
    .line 61
    invoke-direct {v0, v3, v6, v1, v4}, Landroidx/datastore/preferences/protobuf/c0;-><init>(I[I[Ljava/lang/Object;Z)V

    .line 62
    .line 63
    .line 64
    shl-int/lit8 v1, v2, 0x3

    .line 65
    .line 66
    or-int/lit8 v2, v1, 0x4

    .line 67
    .line 68
    add-int/2addr p0, v4

    .line 69
    const/16 v6, 0x64

    .line 70
    .line 71
    if-ge p0, v6, :cond_7

    .line 72
    .line 73
    :cond_3
    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/k;->a()I

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    const v7, 0x7fffffff

    .line 78
    .line 79
    .line 80
    if-eq v6, v7, :cond_4

    .line 81
    .line 82
    invoke-static {p0, p1, v0}, Landroidx/datastore/preferences/protobuf/d0;->b(ILandroidx/datastore/preferences/protobuf/k;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    if-nez v6, :cond_3

    .line 87
    .line 88
    :cond_4
    iget p0, p1, Landroidx/datastore/preferences/protobuf/k;->b:I

    .line 89
    .line 90
    if-ne v2, p0, :cond_6

    .line 91
    .line 92
    iget-boolean p0, v0, Landroidx/datastore/preferences/protobuf/c0;->e:Z

    .line 93
    .line 94
    if-eqz p0, :cond_5

    .line 95
    .line 96
    iput-boolean v3, v0, Landroidx/datastore/preferences/protobuf/c0;->e:Z

    .line 97
    .line 98
    :cond_5
    check-cast p2, Landroidx/datastore/preferences/protobuf/c0;

    .line 99
    .line 100
    or-int/lit8 p0, v1, 0x3

    .line 101
    .line 102
    invoke-virtual {p2, p0, v0}, Landroidx/datastore/preferences/protobuf/c0;->c(ILjava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    return v4

    .line 106
    :cond_6
    new-instance p0, Landroidx/datastore/preferences/protobuf/z;

    .line 107
    .line 108
    const-string p1, "Protocol message end-group tag did not match expected tag."

    .line 109
    .line 110
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw p0

    .line 114
    :cond_7
    new-instance p0, Landroidx/datastore/preferences/protobuf/z;

    .line 115
    .line 116
    const-string p1, "Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit."

    .line 117
    .line 118
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw p0

    .line 122
    :cond_8
    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/k;->e()Landroidx/datastore/preferences/protobuf/g;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    check-cast p2, Landroidx/datastore/preferences/protobuf/c0;

    .line 127
    .line 128
    shl-int/lit8 p1, v2, 0x3

    .line 129
    .line 130
    or-int/2addr p1, v6

    .line 131
    invoke-virtual {p2, p1, p0}, Landroidx/datastore/preferences/protobuf/c0;->c(ILjava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    return v4

    .line 135
    :cond_9
    invoke-virtual {p1, v4}, Landroidx/datastore/preferences/protobuf/k;->w(I)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/j;->k()J

    .line 139
    .line 140
    .line 141
    move-result-wide p0

    .line 142
    check-cast p2, Landroidx/datastore/preferences/protobuf/c0;

    .line 143
    .line 144
    shl-int/lit8 v0, v2, 0x3

    .line 145
    .line 146
    or-int/2addr v0, v4

    .line 147
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-virtual {p2, v0, p0}, Landroidx/datastore/preferences/protobuf/c0;->c(ILjava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    return v4

    .line 155
    :cond_a
    invoke-virtual {p1, v3}, Landroidx/datastore/preferences/protobuf/k;->w(I)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/j;->n()J

    .line 159
    .line 160
    .line 161
    move-result-wide p0

    .line 162
    check-cast p2, Landroidx/datastore/preferences/protobuf/c0;

    .line 163
    .line 164
    shl-int/lit8 v0, v2, 0x3

    .line 165
    .line 166
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    invoke-virtual {p2, v0, p0}, Landroidx/datastore/preferences/protobuf/c0;->c(ILjava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    return v4
.end method

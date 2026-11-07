.class public final LB1/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll1/c;
.implements LC1/m;
.implements LC1/h;


# instance fields
.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;

.field public n:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    packed-switch p1, :pswitch_data_0

    .line 2
    new-instance p1, LB1/b;

    const/4 v0, 0x6

    .line 3
    invoke-direct {p1, v0}, LB1/b;-><init>(I)V

    .line 4
    new-instance v0, LB1/b;

    const/4 v1, 0x5

    .line 5
    invoke-direct {v0, v1}, LB1/b;-><init>(I)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, LB1/s;->k:Ljava/lang/Object;

    .line 8
    iput-object p1, p0, LB1/s;->l:Ljava/lang/Object;

    .line 9
    iput-object v0, p0, LB1/s;->m:Ljava/lang/Object;

    return-void

    .line 10
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LB1/s;->k:Ljava/lang/Object;

    .line 12
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LB1/s;->l:Ljava/lang/Object;

    .line 13
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LB1/s;->m:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(LC1/f;Ljava/lang/String;)V
    .locals 2

    .line 14
    sget-object v0, LC1/r;->a:LC1/r;

    const/4 v1, 0x0

    .line 15
    invoke-direct {p0, p1, p2, v0, v1}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    return-void
.end method

.method public synthetic constructor <init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, LB1/s;->l:Ljava/lang/Object;

    iput-object p2, p0, LB1/s;->k:Ljava/lang/Object;

    iput-object p3, p0, LB1/s;->m:Ljava/lang/Object;

    iput-object p4, p0, LB1/s;->n:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public A(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 1

    .line 1
    iget-object v0, p0, LB1/s;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Landroid/os/Bundle;

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Landroid/os/Bundle;

    .line 19
    .line 20
    return-object p1
.end method

.method public a(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "sqlite_error"

    .line 2
    .line 3
    iput-object v0, p0, LB1/s;->k:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, LB1/s;->l:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p1, p0, LB1/s;->n:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method

.method public b(Lb0/s;)V
    .locals 3

    .line 1
    iget-object v0, p0, LB1/s;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, LB1/s;->k:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    monitor-enter v0

    .line 16
    :try_start_0
    iget-object v1, p0, LB1/s;->k:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    const/4 v0, 0x1

    .line 25
    iput-boolean v0, p1, Lb0/s;->u:Z

    .line 26
    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    throw p1

    .line 31
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    new-instance v1, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v2, "Fragment already added: "

    .line 36
    .line 37
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v0
.end method

.method public c(Lh0/d;)V
    .locals 2

    .line 1
    iget-object v0, p0, LB1/s;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/LinkedHashSet;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, LB1/s;->l:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lh0/e;

    .line 14
    .line 15
    const/4 v1, -0x1

    .line 16
    invoke-virtual {v0, p0, p1, v1}, Lh0/e;->a(LB1/s;Lh0/d;I)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public d(Lh0/i;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p2, v0, :cond_1

    .line 3
    .line 4
    if-nez p2, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const-string p1, "Unsupported priority value: "

    .line 8
    .line 9
    invoke-static {p1, p2}, LB1/e;->g(Ljava/lang/String;I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p2

    .line 23
    :cond_1
    :goto_0
    iget-object v0, p0, LB1/s;->n:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Ljava/util/LinkedHashSet;

    .line 26
    .line 27
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    iget-object v0, p0, LB1/s;->l:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Lh0/e;

    .line 36
    .line 37
    invoke-virtual {v0, p0, p1, p2}, Lh0/e;->a(LB1/s;Lh0/d;I)V

    .line 38
    .line 39
    .line 40
    :cond_2
    return-void
.end method

.method public e()Landroid/text/SpannableString;
    .locals 6

    .line 1
    iget-object v0, p0, LB1/s;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_0
    new-instance v0, Landroid/text/SpannableString;

    .line 10
    .line 11
    iget-object v1, p0, LB1/s;->k:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Ljava/lang/String;

    .line 14
    .line 15
    invoke-direct {v0, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, LB1/s;->m:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Ljava/util/List;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    if-eqz v1, :cond_3

    .line 24
    .line 25
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_3

    .line 34
    .line 35
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Lio/flutter/view/l;

    .line 40
    .line 41
    iget v4, v3, Lio/flutter/view/l;->c:I

    .line 42
    .line 43
    invoke-static {v4}, LX/j;->a(I)I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_2

    .line 48
    .line 49
    const/4 v5, 0x1

    .line 50
    if-eq v4, v5, :cond_1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    move-object v4, v3

    .line 54
    check-cast v4, Lio/flutter/view/j;

    .line 55
    .line 56
    iget-object v4, v4, Lio/flutter/view/j;->d:Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {v4}, Ljava/util/Locale;->forLanguageTag(Ljava/lang/String;)Ljava/util/Locale;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    new-instance v5, Landroid/text/style/LocaleSpan;

    .line 63
    .line 64
    invoke-direct {v5, v4}, Landroid/text/style/LocaleSpan;-><init>(Ljava/util/Locale;)V

    .line 65
    .line 66
    .line 67
    iget v4, v3, Lio/flutter/view/l;->a:I

    .line 68
    .line 69
    iget v3, v3, Lio/flutter/view/l;->b:I

    .line 70
    .line 71
    invoke-virtual {v0, v5, v4, v3, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    new-instance v4, Landroid/text/style/TtsSpan$Builder;

    .line 76
    .line 77
    const-string v5, "android.type.verbatim"

    .line 78
    .line 79
    invoke-direct {v4, v5}, Landroid/text/style/TtsSpan$Builder;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v4}, Landroid/text/style/TtsSpan$Builder;->build()Landroid/text/style/TtsSpan;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    iget v5, v3, Lio/flutter/view/l;->a:I

    .line 87
    .line 88
    iget v3, v3, Lio/flutter/view/l;->b:I

    .line 89
    .line 90
    invoke-virtual {v0, v4, v5, v3, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_3
    iget-object v1, p0, LB1/s;->n:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v1, Ljava/lang/String;

    .line 97
    .line 98
    if-eqz v1, :cond_4

    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-nez v1, :cond_4

    .line 105
    .line 106
    new-instance v1, Landroid/text/style/URLSpan;

    .line 107
    .line 108
    iget-object v3, p0, LB1/s;->n:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v3, Ljava/lang/String;

    .line 111
    .line 112
    invoke-direct {v1, v3}, Landroid/text/style/URLSpan;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    iget-object v3, p0, LB1/s;->k:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v3, Ljava/lang/String;

    .line 118
    .line 119
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    invoke-virtual {v0, v1, v2, v3, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 124
    .line 125
    .line 126
    :cond_4
    iget-object v1, p0, LB1/s;->l:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v1, Ljava/lang/String;

    .line 129
    .line 130
    if-eqz v1, :cond_5

    .line 131
    .line 132
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-nez v1, :cond_5

    .line 137
    .line 138
    iget-object v1, p0, LB1/s;->l:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v1, Ljava/lang/String;

    .line 141
    .line 142
    invoke-static {v1}, Ljava/util/Locale;->forLanguageTag(Ljava/lang/String;)Ljava/util/Locale;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    new-instance v3, Landroid/text/style/LocaleSpan;

    .line 147
    .line 148
    invoke-direct {v3, v1}, Landroid/text/style/LocaleSpan;-><init>(Ljava/util/Locale;)V

    .line 149
    .line 150
    .line 151
    iget-object v1, p0, LB1/s;->k:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v1, Ljava/lang/String;

    .line 154
    .line 155
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    invoke-virtual {v0, v3, v2, v1, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 160
    .line 161
    .line 162
    :cond_5
    return-object v0
.end method

.method public f(Lh0/d;Lh0/b;)V
    .locals 3

    .line 1
    iget-object v0, p0, LB1/s;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh0/e;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget v1, v0, Lh0/e;->g:I

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v1, -0x1

    .line 14
    invoke-virtual {v0, v1}, Lh0/e;->c(I)Lb/o;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iput-object v2, v0, Lh0/e;->f:Lb/o;

    .line 19
    .line 20
    iput v1, v0, Lh0/e;->g:I

    .line 21
    .line 22
    iput-object p1, v0, Lh0/e;->h:Lh0/d;

    .line 23
    .line 24
    if-eqz p2, :cond_3

    .line 25
    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    iget-object p1, v2, Lb/o;->d:Lb0/z;

    .line 29
    .line 30
    iget-object p1, p1, Lb0/z;->d:Lb0/I;

    .line 31
    .line 32
    const/4 v1, 0x3

    .line 33
    invoke-static {v1}, Lb0/I;->J(I)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    new-instance v1, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v2, "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager "

    .line 42
    .line 43
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    const-string v2, "FragmentManager"

    .line 54
    .line 55
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    :cond_1
    invoke-virtual {p1}, Lb0/I;->x()V

    .line 59
    .line 60
    .line 61
    new-instance v1, Lb0/H;

    .line 62
    .line 63
    invoke-direct {v1, p1}, Lb0/H;-><init>(Lb0/I;)V

    .line 64
    .line 65
    .line 66
    const/4 v2, 0x0

    .line 67
    invoke-virtual {p1, v1, v2}, Lb0/I;->y(Lb0/F;Z)V

    .line 68
    .line 69
    .line 70
    :cond_2
    iget-object p1, v0, Lh0/e;->a:Ll2/q;

    .line 71
    .line 72
    new-instance v0, Lh0/g;

    .line 73
    .line 74
    invoke-direct {v0, p2}, Lh0/g;-><init>(Lh0/b;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    const/4 p2, 0x0

    .line 81
    invoke-virtual {p1, p2, v0}, Ll2/q;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    :cond_3
    :goto_0
    return-void
.end method

.method public g(LT1/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, LB1/s;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LV/N;

    .line 4
    .line 5
    instance-of v1, p1, LV/i;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, p1

    .line 10
    check-cast v1, LV/i;

    .line 11
    .line 12
    iget v2, v1, LV/i;->q:I

    .line 13
    .line 14
    const/high16 v3, -0x80000000

    .line 15
    .line 16
    and-int v4, v2, v3

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    sub-int/2addr v2, v3

    .line 21
    iput v2, v1, LV/i;->q:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, LV/i;

    .line 25
    .line 26
    invoke-direct {v1, p0, p1}, LV/i;-><init>(LB1/s;LT1/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p1, v1, LV/i;->o:Ljava/lang/Object;

    .line 30
    .line 31
    iget v2, v1, LV/i;->q:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v4, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    iget-object v0, v1, LV/i;->n:LB1/s;

    .line 42
    .line 43
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_2
    iget-object v0, v1, LV/i;->n:LB1/s;

    .line 56
    .line 57
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_4

    .line 61
    :cond_3
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, LB1/s;->m:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, Ljava/util/List;

    .line 67
    .line 68
    sget-object v2, LS1/a;->k:LS1/a;

    .line 69
    .line 70
    if-eqz p1, :cond_6

    .line 71
    .line 72
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p1, :cond_4

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_4
    invoke-virtual {v0}, LV/N;->g()LV/i0;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    new-instance v4, LV/l;

    .line 84
    .line 85
    const/4 v5, 0x0

    .line 86
    invoke-direct {v4, v0, p0, v5}, LV/l;-><init>(LV/N;LB1/s;LR1/c;)V

    .line 87
    .line 88
    .line 89
    iput-object p0, v1, LV/i;->n:LB1/s;

    .line 90
    .line 91
    iput v3, v1, LV/i;->q:I

    .line 92
    .line 93
    invoke-virtual {p1, v4, v1}, LV/i0;->b(LZ1/l;LT1/c;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    if-ne p1, v2, :cond_5

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_5
    move-object v0, p0

    .line 101
    :goto_1
    check-cast p1, LV/c;

    .line 102
    .line 103
    goto :goto_5

    .line 104
    :cond_6
    :goto_2
    iput-object p0, v1, LV/i;->n:LB1/s;

    .line 105
    .line 106
    iput v4, v1, LV/i;->q:I

    .line 107
    .line 108
    const/4 p1, 0x0

    .line 109
    invoke-static {v0, p1, v1}, LV/N;->f(LV/N;ZLT1/c;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    if-ne p1, v2, :cond_7

    .line 114
    .line 115
    :goto_3
    return-object v2

    .line 116
    :cond_7
    move-object v0, p0

    .line 117
    :goto_4
    check-cast p1, LV/c;

    .line 118
    .line 119
    :goto_5
    iget-object v0, v0, LB1/s;->n:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v0, LV/N;

    .line 122
    .line 123
    iget-object v0, v0, LV/N;->r:LB1/a;

    .line 124
    .line 125
    invoke-virtual {v0, p1}, LB1/a;->m(LV/j0;)V

    .line 126
    .line 127
    .line 128
    sget-object p1, LO1/g;->a:LO1/g;

    .line 129
    .line 130
    return-object p1
.end method

.method public h(Ljava/lang/String;)Lb0/s;
    .locals 1

    .line 1
    iget-object v0, p0, LB1/s;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lb0/O;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p1, Lb0/O;->c:Lb0/s;

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return-object p1
.end method

.method public i(LC1/g;)V
    .locals 1

    .line 1
    iput-object p1, p0, LB1/s;->m:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object p1, p0, LB1/s;->n:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Lr2/a;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance p1, Lr2/a;

    .line 11
    .line 12
    invoke-direct {p1, p0}, Lr2/a;-><init>(LB1/s;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, LB1/s;->n:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v0, p0, LB1/s;->l:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Landroid/content/ClipboardManager;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Landroid/content/ClipboardManager;->addPrimaryClipChangedListener(Landroid/content/ClipboardManager$OnPrimaryClipChangedListener;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public j(Ljava/lang/String;)Lb0/s;
    .locals 3

    .line 1
    iget-object v0, p0, LB1/s;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lb0/O;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    iget-object v1, v1, Lb0/O;->c:Lb0/s;

    .line 28
    .line 29
    iget-object v2, v1, Lb0/s;->o:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    iget-object v1, v1, Lb0/s;->E:Lb0/I;

    .line 39
    .line 40
    iget-object v1, v1, Lb0/I;->c:LB1/s;

    .line 41
    .line 42
    invoke-virtual {v1, p1}, LB1/s;->j(Ljava/lang/String;)Lb0/s;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    :goto_0
    if-eqz v1, :cond_0

    .line 47
    .line 48
    return-object v1

    .line 49
    :cond_2
    const/4 p1, 0x0

    .line 50
    return-object p1
.end method

.method public k(LA/c;LB1/o;)V
    .locals 13

    .line 1
    iget-object v0, p0, LB1/s;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/Context;

    .line 4
    .line 5
    iget-object v1, p0, LB1/s;->l:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/content/ClipboardManager;

    .line 8
    .line 9
    iget-object v2, p1, LA/c;->l:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    const/4 v4, 0x0

    .line 21
    const/4 v5, -0x1

    .line 22
    sparse-switch v3, :sswitch_data_0

    .line 23
    .line 24
    .line 25
    goto/16 :goto_0

    .line 26
    .line 27
    :sswitch_0
    const-string v3, "pasteImage"

    .line 28
    .line 29
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_0

    .line 34
    .line 35
    goto/16 :goto_0

    .line 36
    .line 37
    :cond_0
    const/16 v5, 0xc

    .line 38
    .line 39
    goto/16 :goto_0

    .line 40
    .line 41
    :sswitch_1
    const-string v3, "copyImage"

    .line 42
    .line 43
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-nez v2, :cond_1

    .line 48
    .line 49
    goto/16 :goto_0

    .line 50
    .line 51
    :cond_1
    const/16 v5, 0xb

    .line 52
    .line 53
    goto/16 :goto_0

    .line 54
    .line 55
    :sswitch_2
    const-string v3, "hasData"

    .line 56
    .line 57
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-nez v2, :cond_2

    .line 62
    .line 63
    goto/16 :goto_0

    .line 64
    .line 65
    :cond_2
    const/16 v5, 0xa

    .line 66
    .line 67
    goto/16 :goto_0

    .line 68
    .line 69
    :sswitch_3
    const-string v3, "copyRichText"

    .line 70
    .line 71
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-nez v2, :cond_3

    .line 76
    .line 77
    goto/16 :goto_0

    .line 78
    .line 79
    :cond_3
    const/16 v5, 0x9

    .line 80
    .line 81
    goto/16 :goto_0

    .line 82
    .line 83
    :sswitch_4
    const-string v3, "paste"

    .line 84
    .line 85
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-nez v2, :cond_4

    .line 90
    .line 91
    goto/16 :goto_0

    .line 92
    .line 93
    :cond_4
    const/16 v5, 0x8

    .line 94
    .line 95
    goto/16 :goto_0

    .line 96
    .line 97
    :sswitch_5
    const-string v3, "clear"

    .line 98
    .line 99
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-nez v2, :cond_5

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_5
    const/4 v5, 0x7

    .line 107
    goto :goto_0

    .line 108
    :sswitch_6
    const-string v3, "copy"

    .line 109
    .line 110
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-nez v2, :cond_6

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_6
    const/4 v5, 0x6

    .line 118
    goto :goto_0

    .line 119
    :sswitch_7
    const-string v3, "pasteRichText"

    .line 120
    .line 121
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    if-nez v2, :cond_7

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_7
    const/4 v5, 0x5

    .line 129
    goto :goto_0

    .line 130
    :sswitch_8
    const-string v3, "stopMonitoring"

    .line 131
    .line 132
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    if-nez v2, :cond_8

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_8
    const/4 v5, 0x4

    .line 140
    goto :goto_0

    .line 141
    :sswitch_9
    const-string v3, "getDataSize"

    .line 142
    .line 143
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    if-nez v2, :cond_9

    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_9
    const/4 v5, 0x3

    .line 151
    goto :goto_0

    .line 152
    :sswitch_a
    const-string v3, "startMonitoring"

    .line 153
    .line 154
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    if-nez v2, :cond_a

    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_a
    const/4 v5, 0x2

    .line 162
    goto :goto_0

    .line 163
    :sswitch_b
    const-string v3, "getContentType"

    .line 164
    .line 165
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    if-nez v2, :cond_b

    .line 170
    .line 171
    goto :goto_0

    .line 172
    :cond_b
    const/4 v5, 0x1

    .line 173
    goto :goto_0

    .line 174
    :sswitch_c
    const-string v3, "copyMultiple"

    .line 175
    .line 176
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    if-nez v2, :cond_c

    .line 181
    .line 182
    goto :goto_0

    .line 183
    :cond_c
    move v5, v4

    .line 184
    :goto_0
    const-string v2, "image"

    .line 185
    .line 186
    const-string v3, "html"

    .line 187
    .line 188
    const-string v6, "imageBytes"

    .line 189
    .line 190
    const-string v7, "text"

    .line 191
    .line 192
    const-string v8, ""

    .line 193
    .line 194
    const/4 v9, 0x0

    .line 195
    packed-switch v5, :pswitch_data_0

    .line 196
    .line 197
    .line 198
    invoke-virtual {p2}, LB1/o;->b()V

    .line 199
    .line 200
    .line 201
    return-void

    .line 202
    :pswitch_0
    :try_start_0
    invoke-virtual {v1}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    if-eqz p1, :cond_d

    .line 207
    .line 208
    invoke-virtual {p1}, Landroid/content/ClipData;->getItemCount()I

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    if-lez v0, :cond_d

    .line 213
    .line 214
    invoke-virtual {p1, v4}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    goto :goto_1

    .line 219
    :catch_0
    move-exception p1

    .line 220
    goto :goto_2

    .line 221
    :cond_d
    move-object p1, v9

    .line 222
    :goto_1
    invoke-virtual {p0, p1}, LB1/s;->o(Landroid/content/ClipData$Item;)Ljava/util/ArrayList;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    new-instance v0, Ljava/util/HashMap;

    .line 227
    .line 228
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v0, v6, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    invoke-virtual {p2, v0}, LB1/o;->d(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 235
    .line 236
    .line 237
    goto/16 :goto_19

    .line 238
    .line 239
    :goto_2
    const-string v0, "PASTE_IMAGE_ERROR"

    .line 240
    .line 241
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    invoke-virtual {p2, v0, p1, v9}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    goto/16 :goto_19

    .line 249
    .line 250
    :pswitch_1
    invoke-virtual {p1, v6}, LA/c;->i(Ljava/lang/String;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    check-cast p1, Ljava/util/List;

    .line 255
    .line 256
    if-eqz p1, :cond_12

    .line 257
    .line 258
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 259
    .line 260
    .line 261
    move-result v3

    .line 262
    if-eqz v3, :cond_e

    .line 263
    .line 264
    goto :goto_5

    .line 265
    :cond_e
    :try_start_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 266
    .line 267
    .line 268
    move-result v3

    .line 269
    new-array v5, v3, [B

    .line 270
    .line 271
    move v6, v4

    .line 272
    :goto_3
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 273
    .line 274
    .line 275
    move-result v7

    .line 276
    if-ge v6, v7, :cond_f

    .line 277
    .line 278
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v7

    .line 282
    check-cast v7, Ljava/lang/Integer;

    .line 283
    .line 284
    invoke-virtual {v7}, Ljava/lang/Integer;->byteValue()B

    .line 285
    .line 286
    .line 287
    move-result v7

    .line 288
    aput-byte v7, v5, v6

    .line 289
    .line 290
    add-int/lit8 v6, v6, 0x1

    .line 291
    .line 292
    goto :goto_3

    .line 293
    :catch_1
    move-exception p1

    .line 294
    goto :goto_4

    .line 295
    :cond_f
    invoke-static {v5, v4, v3}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    if-nez p1, :cond_10

    .line 300
    .line 301
    const-string p1, "INVALID_IMAGE"

    .line 302
    .line 303
    const-string v0, "Failed to decode image"

    .line 304
    .line 305
    invoke-virtual {p2, p1, v0, v9}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    goto/16 :goto_19

    .line 309
    .line 310
    :cond_10
    invoke-virtual {p0, p1}, LB1/s;->r(Landroid/graphics/Bitmap;)Landroid/net/Uri;

    .line 311
    .line 312
    .line 313
    move-result-object p1

    .line 314
    if-nez p1, :cond_11

    .line 315
    .line 316
    const-string p1, "SAVE_ERROR"

    .line 317
    .line 318
    const-string v0, "Failed to save image to MediaStore"

    .line 319
    .line 320
    invoke-virtual {p2, p1, v0, v9}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    goto/16 :goto_19

    .line 324
    .line 325
    :cond_11
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    invoke-static {v0, v2, p1}, Landroid/content/ClipData;->newUri(Landroid/content/ContentResolver;Ljava/lang/CharSequence;Landroid/net/Uri;)Landroid/content/ClipData;

    .line 330
    .line 331
    .line 332
    move-result-object p1

    .line 333
    invoke-virtual {v1, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 334
    .line 335
    .line 336
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 337
    .line 338
    invoke-virtual {p2, p1}, LB1/o;->d(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 339
    .line 340
    .line 341
    goto/16 :goto_19

    .line 342
    .line 343
    :goto_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 344
    .line 345
    const-string v1, "Failed to copy image: "

    .line 346
    .line 347
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object p1

    .line 354
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object p1

    .line 361
    const-string v0, "COPY_IMAGE_ERROR"

    .line 362
    .line 363
    invoke-virtual {p2, v0, p1, v9}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 364
    .line 365
    .line 366
    goto/16 :goto_19

    .line 367
    .line 368
    :cond_12
    :goto_5
    const-string p1, "EMPTY_IMAGE"

    .line 369
    .line 370
    const-string v0, "Image bytes cannot be empty"

    .line 371
    .line 372
    invoke-virtual {p2, p1, v0, v9}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 373
    .line 374
    .line 375
    goto/16 :goto_19

    .line 376
    .line 377
    :pswitch_2
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 378
    .line 379
    invoke-virtual {p2, p1}, LB1/o;->d(Ljava/lang/Object;)V

    .line 380
    .line 381
    .line 382
    return-void

    .line 383
    :pswitch_3
    invoke-virtual {p1, v7}, LA/c;->i(Ljava/lang/String;)Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    check-cast v0, Ljava/lang/String;

    .line 388
    .line 389
    invoke-virtual {p1, v3}, LA/c;->i(Ljava/lang/String;)Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object p1

    .line 393
    check-cast p1, Ljava/lang/String;

    .line 394
    .line 395
    if-eqz v0, :cond_13

    .line 396
    .line 397
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 398
    .line 399
    .line 400
    move-result v2

    .line 401
    if-eqz v2, :cond_14

    .line 402
    .line 403
    :cond_13
    if-eqz p1, :cond_18

    .line 404
    .line 405
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 406
    .line 407
    .line 408
    move-result v2

    .line 409
    if-eqz v2, :cond_14

    .line 410
    .line 411
    goto :goto_8

    .line 412
    :cond_14
    if-eqz p1, :cond_16

    .line 413
    .line 414
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 415
    .line 416
    .line 417
    move-result v2

    .line 418
    if-nez v2, :cond_16

    .line 419
    .line 420
    if-eqz v0, :cond_15

    .line 421
    .line 422
    move-object v8, v0

    .line 423
    :cond_15
    invoke-static {v3, v8, p1}, Landroid/content/ClipData;->newHtmlText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;)Landroid/content/ClipData;

    .line 424
    .line 425
    .line 426
    move-result-object p1

    .line 427
    invoke-virtual {v1, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 428
    .line 429
    .line 430
    goto :goto_6

    .line 431
    :catch_2
    move-exception p1

    .line 432
    goto :goto_7

    .line 433
    :cond_16
    if-eqz v0, :cond_17

    .line 434
    .line 435
    move-object v8, v0

    .line 436
    :cond_17
    invoke-static {v7, v8}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 437
    .line 438
    .line 439
    move-result-object p1

    .line 440
    invoke-virtual {v1, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 441
    .line 442
    .line 443
    :goto_6
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 444
    .line 445
    invoke-virtual {p2, p1}, LB1/o;->d(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 446
    .line 447
    .line 448
    goto/16 :goto_19

    .line 449
    .line 450
    :goto_7
    const-string v0, "COPY_RICH_ERROR"

    .line 451
    .line 452
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 453
    .line 454
    .line 455
    move-result-object p1

    .line 456
    invoke-virtual {p2, v0, p1, v9}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 457
    .line 458
    .line 459
    goto/16 :goto_19

    .line 460
    .line 461
    :cond_18
    :goto_8
    const-string p1, "EMPTY_CONTENT"

    .line 462
    .line 463
    const-string v0, "Either text or html must be provided"

    .line 464
    .line 465
    invoke-virtual {p2, p1, v0, v9}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 466
    .line 467
    .line 468
    goto/16 :goto_19

    .line 469
    .line 470
    :pswitch_4
    :try_start_3
    invoke-virtual {v1}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    .line 471
    .line 472
    .line 473
    move-result-object p1

    .line 474
    if-eqz p1, :cond_19

    .line 475
    .line 476
    invoke-virtual {p1}, Landroid/content/ClipData;->getItemCount()I

    .line 477
    .line 478
    .line 479
    move-result v0

    .line 480
    if-lez v0, :cond_19

    .line 481
    .line 482
    invoke-virtual {p1, v4}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    .line 483
    .line 484
    .line 485
    move-result-object p1

    .line 486
    invoke-virtual {p1}, Landroid/content/ClipData$Item;->getText()Ljava/lang/CharSequence;

    .line 487
    .line 488
    .line 489
    move-result-object p1

    .line 490
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object v8

    .line 494
    goto :goto_9

    .line 495
    :catch_3
    move-exception p1

    .line 496
    goto :goto_a

    .line 497
    :cond_19
    :goto_9
    new-instance p1, Ljava/util/HashMap;

    .line 498
    .line 499
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 500
    .line 501
    .line 502
    invoke-virtual {p1, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    invoke-virtual {p2, p1}, LB1/o;->d(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 506
    .line 507
    .line 508
    goto/16 :goto_19

    .line 509
    .line 510
    :goto_a
    const-string v0, "PASTE_ERROR"

    .line 511
    .line 512
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object p1

    .line 516
    invoke-virtual {p2, v0, p1, v9}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 517
    .line 518
    .line 519
    goto/16 :goto_19

    .line 520
    .line 521
    :pswitch_5
    :try_start_4
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 522
    .line 523
    const/16 v0, 0x1c

    .line 524
    .line 525
    if-lt p1, v0, :cond_1a

    .line 526
    .line 527
    invoke-static {v1}, Lj0/h;->k(Landroid/content/ClipboardManager;)V

    .line 528
    .line 529
    .line 530
    goto :goto_b

    .line 531
    :catch_4
    move-exception p1

    .line 532
    goto :goto_c

    .line 533
    :cond_1a
    invoke-static {v8, v8}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 534
    .line 535
    .line 536
    move-result-object p1

    .line 537
    invoke-virtual {v1, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 538
    .line 539
    .line 540
    :goto_b
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 541
    .line 542
    invoke-virtual {p2, p1}, LB1/o;->d(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 543
    .line 544
    .line 545
    goto/16 :goto_19

    .line 546
    .line 547
    :goto_c
    const-string v0, "CLEAR_ERROR"

    .line 548
    .line 549
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object p1

    .line 553
    invoke-virtual {p2, v0, p1, v9}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 554
    .line 555
    .line 556
    goto/16 :goto_19

    .line 557
    .line 558
    :pswitch_6
    invoke-virtual {p1, v7}, LA/c;->i(Ljava/lang/String;)Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object p1

    .line 562
    check-cast p1, Ljava/lang/String;

    .line 563
    .line 564
    if-eqz p1, :cond_1c

    .line 565
    .line 566
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 567
    .line 568
    .line 569
    move-result v0

    .line 570
    if-eqz v0, :cond_1b

    .line 571
    .line 572
    goto :goto_d

    .line 573
    :cond_1b
    :try_start_5
    invoke-static {v7, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 574
    .line 575
    .line 576
    move-result-object p1

    .line 577
    invoke-virtual {v1, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 578
    .line 579
    .line 580
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 581
    .line 582
    invoke-virtual {p2, p1}, LB1/o;->d(Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    .line 583
    .line 584
    .line 585
    goto/16 :goto_19

    .line 586
    .line 587
    :catch_5
    move-exception p1

    .line 588
    const-string v0, "COPY_ERROR"

    .line 589
    .line 590
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 591
    .line 592
    .line 593
    move-result-object p1

    .line 594
    invoke-virtual {p2, v0, p1, v9}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 595
    .line 596
    .line 597
    goto/16 :goto_19

    .line 598
    .line 599
    :cond_1c
    :goto_d
    const-string p1, "EMPTY_TEXT"

    .line 600
    .line 601
    const-string v0, "Text cannot be empty"

    .line 602
    .line 603
    invoke-virtual {p2, p1, v0, v9}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 604
    .line 605
    .line 606
    goto/16 :goto_19

    .line 607
    .line 608
    :pswitch_7
    :try_start_6
    invoke-virtual {v1}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    .line 609
    .line 610
    .line 611
    move-result-object p1

    .line 612
    if-eqz p1, :cond_1d

    .line 613
    .line 614
    invoke-virtual {p1}, Landroid/content/ClipData;->getItemCount()I

    .line 615
    .line 616
    .line 617
    move-result v0

    .line 618
    if-lez v0, :cond_1d

    .line 619
    .line 620
    invoke-virtual {p1, v4}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    .line 621
    .line 622
    .line 623
    move-result-object p1

    .line 624
    goto :goto_e

    .line 625
    :catch_6
    move-exception p1

    .line 626
    goto :goto_10

    .line 627
    :cond_1d
    move-object p1, v9

    .line 628
    :goto_e
    if-eqz p1, :cond_1e

    .line 629
    .line 630
    invoke-virtual {p1}, Landroid/content/ClipData$Item;->getText()Ljava/lang/CharSequence;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    if-eqz v0, :cond_1e

    .line 635
    .line 636
    invoke-virtual {p1}, Landroid/content/ClipData$Item;->getText()Ljava/lang/CharSequence;

    .line 637
    .line 638
    .line 639
    move-result-object v0

    .line 640
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 641
    .line 642
    .line 643
    move-result-object v8

    .line 644
    :cond_1e
    if-eqz p1, :cond_1f

    .line 645
    .line 646
    invoke-virtual {p1}, Landroid/content/ClipData$Item;->getHtmlText()Ljava/lang/String;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    goto :goto_f

    .line 651
    :cond_1f
    move-object v0, v9

    .line 652
    :goto_f
    invoke-virtual {p0, p1}, LB1/s;->o(Landroid/content/ClipData$Item;)Ljava/util/ArrayList;

    .line 653
    .line 654
    .line 655
    move-result-object p1

    .line 656
    new-instance v1, Ljava/util/HashMap;

    .line 657
    .line 658
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 659
    .line 660
    .line 661
    invoke-virtual {v1, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 662
    .line 663
    .line 664
    invoke-virtual {v1, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 665
    .line 666
    .line 667
    invoke-virtual {v1, v6, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    const-string p1, "timestamp"

    .line 671
    .line 672
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 673
    .line 674
    .line 675
    move-result-wide v2

    .line 676
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 677
    .line 678
    .line 679
    move-result-object v0

    .line 680
    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 681
    .line 682
    .line 683
    invoke-virtual {p2, v1}, LB1/o;->d(Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    .line 684
    .line 685
    .line 686
    goto/16 :goto_19

    .line 687
    .line 688
    :goto_10
    const-string v0, "PASTE_RICH_ERROR"

    .line 689
    .line 690
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 691
    .line 692
    .line 693
    move-result-object p1

    .line 694
    invoke-virtual {p2, v0, p1, v9}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 695
    .line 696
    .line 697
    goto/16 :goto_19

    .line 698
    .line 699
    :pswitch_8
    iget-object p1, p0, LB1/s;->n:Ljava/lang/Object;

    .line 700
    .line 701
    check-cast p1, Lr2/a;

    .line 702
    .line 703
    if-eqz p1, :cond_20

    .line 704
    .line 705
    invoke-virtual {v1, p1}, Landroid/content/ClipboardManager;->removePrimaryClipChangedListener(Landroid/content/ClipboardManager$OnPrimaryClipChangedListener;)V

    .line 706
    .line 707
    .line 708
    iput-object v9, p0, LB1/s;->n:Ljava/lang/Object;

    .line 709
    .line 710
    :cond_20
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 711
    .line 712
    invoke-virtual {p2, p1}, LB1/o;->d(Ljava/lang/Object;)V

    .line 713
    .line 714
    .line 715
    return-void

    .line 716
    :pswitch_9
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 717
    .line 718
    .line 719
    move-result-object p1

    .line 720
    invoke-virtual {p2, p1}, LB1/o;->d(Ljava/lang/Object;)V

    .line 721
    .line 722
    .line 723
    return-void

    .line 724
    :pswitch_a
    iget-object p1, p0, LB1/s;->n:Ljava/lang/Object;

    .line 725
    .line 726
    check-cast p1, Lr2/a;

    .line 727
    .line 728
    if-eqz p1, :cond_21

    .line 729
    .line 730
    goto :goto_11

    .line 731
    :cond_21
    new-instance p1, Lr2/a;

    .line 732
    .line 733
    invoke-direct {p1, p0}, Lr2/a;-><init>(LB1/s;)V

    .line 734
    .line 735
    .line 736
    iput-object p1, p0, LB1/s;->n:Ljava/lang/Object;

    .line 737
    .line 738
    invoke-virtual {v1, p1}, Landroid/content/ClipboardManager;->addPrimaryClipChangedListener(Landroid/content/ClipboardManager$OnPrimaryClipChangedListener;)V

    .line 739
    .line 740
    .line 741
    :goto_11
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 742
    .line 743
    invoke-virtual {p2, p1}, LB1/o;->d(Ljava/lang/Object;)V

    .line 744
    .line 745
    .line 746
    return-void

    .line 747
    :pswitch_b
    const-string p1, "unknown"

    .line 748
    .line 749
    invoke-virtual {p2, p1}, LB1/o;->d(Ljava/lang/Object;)V

    .line 750
    .line 751
    .line 752
    return-void

    .line 753
    :pswitch_c
    const-string v5, "image/png"

    .line 754
    .line 755
    const-string v6, "text/html"

    .line 756
    .line 757
    const-string v10, "text/plain"

    .line 758
    .line 759
    const-string v11, "formats"

    .line 760
    .line 761
    invoke-virtual {p1, v11}, LA/c;->i(Ljava/lang/String;)Ljava/lang/Object;

    .line 762
    .line 763
    .line 764
    move-result-object p1

    .line 765
    check-cast p1, Ljava/util/Map;

    .line 766
    .line 767
    if-eqz p1, :cond_2b

    .line 768
    .line 769
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    .line 770
    .line 771
    .line 772
    move-result v11

    .line 773
    if-eqz v11, :cond_22

    .line 774
    .line 775
    goto/16 :goto_18

    .line 776
    .line 777
    :cond_22
    :try_start_7
    invoke-interface {p1, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 778
    .line 779
    .line 780
    move-result-object v11

    .line 781
    if-eqz v11, :cond_23

    .line 782
    .line 783
    invoke-interface {p1, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 784
    .line 785
    .line 786
    move-result-object v8

    .line 787
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 788
    .line 789
    .line 790
    move-result-object v8

    .line 791
    goto :goto_12

    .line 792
    :catch_7
    move-exception p1

    .line 793
    goto/16 :goto_17

    .line 794
    .line 795
    :cond_23
    :goto_12
    invoke-interface {p1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 796
    .line 797
    .line 798
    move-result-object v10

    .line 799
    if-eqz v10, :cond_24

    .line 800
    .line 801
    invoke-interface {p1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 802
    .line 803
    .line 804
    move-result-object v6

    .line 805
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 806
    .line 807
    .line 808
    move-result-object v6

    .line 809
    goto :goto_13

    .line 810
    :cond_24
    move-object v6, v9

    .line 811
    :goto_13
    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 812
    .line 813
    .line 814
    move-result-object v10

    .line 815
    instance-of v10, v10, Ljava/util/List;

    .line 816
    .line 817
    if-eqz v10, :cond_25

    .line 818
    .line 819
    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 820
    .line 821
    .line 822
    move-result-object p1

    .line 823
    check-cast p1, Ljava/util/List;

    .line 824
    .line 825
    goto :goto_14

    .line 826
    :cond_25
    move-object p1, v9

    .line 827
    :goto_14
    if-eqz p1, :cond_28

    .line 828
    .line 829
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 830
    .line 831
    .line 832
    move-result v5

    .line 833
    if-nez v5, :cond_28

    .line 834
    .line 835
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 836
    .line 837
    .line 838
    move-result v5

    .line 839
    new-array v10, v5, [B

    .line 840
    .line 841
    move v11, v4

    .line 842
    :goto_15
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 843
    .line 844
    .line 845
    move-result v12

    .line 846
    if-ge v11, v12, :cond_26

    .line 847
    .line 848
    invoke-interface {p1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 849
    .line 850
    .line 851
    move-result-object v12

    .line 852
    check-cast v12, Ljava/lang/Integer;

    .line 853
    .line 854
    invoke-virtual {v12}, Ljava/lang/Integer;->byteValue()B

    .line 855
    .line 856
    .line 857
    move-result v12

    .line 858
    aput-byte v12, v10, v11

    .line 859
    .line 860
    add-int/lit8 v11, v11, 0x1

    .line 861
    .line 862
    goto :goto_15

    .line 863
    :cond_26
    invoke-static {v10, v4, v5}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    .line 864
    .line 865
    .line 866
    move-result-object p1

    .line 867
    if-eqz p1, :cond_28

    .line 868
    .line 869
    invoke-virtual {p0, p1}, LB1/s;->r(Landroid/graphics/Bitmap;)Landroid/net/Uri;

    .line 870
    .line 871
    .line 872
    move-result-object p1

    .line 873
    if-eqz p1, :cond_28

    .line 874
    .line 875
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 876
    .line 877
    .line 878
    move-result-object v0

    .line 879
    invoke-static {v0, v2, p1}, Landroid/content/ClipData;->newUri(Landroid/content/ContentResolver;Ljava/lang/CharSequence;Landroid/net/Uri;)Landroid/content/ClipData;

    .line 880
    .line 881
    .line 882
    move-result-object p1

    .line 883
    if-eqz v8, :cond_27

    .line 884
    .line 885
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    .line 886
    .line 887
    .line 888
    move-result v0

    .line 889
    if-nez v0, :cond_27

    .line 890
    .line 891
    new-instance v0, Landroid/content/ClipData$Item;

    .line 892
    .line 893
    invoke-direct {v0, v8}, Landroid/content/ClipData$Item;-><init>(Ljava/lang/CharSequence;)V

    .line 894
    .line 895
    .line 896
    invoke-virtual {p1, v0}, Landroid/content/ClipData;->addItem(Landroid/content/ClipData$Item;)V

    .line 897
    .line 898
    .line 899
    :cond_27
    invoke-virtual {v1, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 900
    .line 901
    .line 902
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 903
    .line 904
    invoke-virtual {p2, p1}, LB1/o;->d(Ljava/lang/Object;)V

    .line 905
    .line 906
    .line 907
    goto :goto_19

    .line 908
    :cond_28
    if-eqz v6, :cond_29

    .line 909
    .line 910
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    .line 911
    .line 912
    .line 913
    move-result p1

    .line 914
    if-nez p1, :cond_29

    .line 915
    .line 916
    invoke-static {v3, v8, v6}, Landroid/content/ClipData;->newHtmlText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;)Landroid/content/ClipData;

    .line 917
    .line 918
    .line 919
    move-result-object p1

    .line 920
    invoke-virtual {v1, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 921
    .line 922
    .line 923
    goto :goto_16

    .line 924
    :cond_29
    if-eqz v8, :cond_2a

    .line 925
    .line 926
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    .line 927
    .line 928
    .line 929
    move-result p1

    .line 930
    if-nez p1, :cond_2a

    .line 931
    .line 932
    invoke-static {v7, v8}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 933
    .line 934
    .line 935
    move-result-object p1

    .line 936
    invoke-virtual {v1, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 937
    .line 938
    .line 939
    :cond_2a
    :goto_16
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 940
    .line 941
    invoke-virtual {p2, p1}, LB1/o;->d(Ljava/lang/Object;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7

    .line 942
    .line 943
    .line 944
    goto :goto_19

    .line 945
    :goto_17
    const-string v0, "COPY_MULTIPLE_ERROR"

    .line 946
    .line 947
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 948
    .line 949
    .line 950
    move-result-object p1

    .line 951
    invoke-virtual {p2, v0, p1, v9}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 952
    .line 953
    .line 954
    goto :goto_19

    .line 955
    :cond_2b
    :goto_18
    const-string p1, "EMPTY_FORMATS"

    .line 956
    .line 957
    const-string v0, "At least one format must be provided"

    .line 958
    .line 959
    invoke-virtual {p2, p1, v0, v9}, LB1/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 960
    .line 961
    .line 962
    :goto_19
    return-void

    .line 963
    :sswitch_data_0
    .sparse-switch
        -0x57d68b5b -> :sswitch_c
        -0x3d5b65e3 -> :sswitch_b
        -0x20574db6 -> :sswitch_a
        -0x198363bf -> :sswitch_9
        -0x16b41216 -> :sswitch_8
        -0x1fa6c24 -> :sswitch_7
        0x2eaf75 -> :sswitch_6
        0x5a5b64d -> :sswitch_5
        0x6581e93 -> :sswitch_4
        0x24b622be -> :sswitch_3
        0x29831964 -> :sswitch_2
        0x58856ae6 -> :sswitch_1
        0x611abe88 -> :sswitch_0
    .end sparse-switch

    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public l()Ljava/util/ArrayList;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LB1/s;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Lb0/O;

    .line 29
    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return-object v0
.end method

.method public m()Ljava/util/ArrayList;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LB1/s;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Lb0/O;

    .line 29
    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    iget-object v2, v2, Lb0/O;->c:Lb0/s;

    .line 33
    .line 34
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v2, 0x0

    .line 39
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    return-object v0
.end method

.method public n()Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, LB1/s;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    iget-object v0, p0, LB1/s;->k:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    monitor-enter v0

    .line 19
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    .line 20
    .line 21
    iget-object v2, p0, LB1/s;->k:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 26
    .line 27
    .line 28
    monitor-exit v0

    .line 29
    return-object v1

    .line 30
    :catchall_0
    move-exception v1

    .line 31
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    throw v1
.end method

.method public o(Landroid/content/ClipData$Item;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    if-eqz p1, :cond_5

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/content/ClipData$Item;->getUri()Landroid/net/Uri;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    :try_start_0
    iget-object v0, p0, LB1/s;->k:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Landroid/content/Context;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p1}, Landroid/content/ClipData$Item;->getUri()Landroid/net/Uri;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    if-eqz v1, :cond_5

    .line 27
    .line 28
    const-string v2, "image/"

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-virtual {p1}, Landroid/content/ClipData$Item;->getUri()Landroid/net/Uri;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {v0, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-nez p1, :cond_2

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    .line 53
    .line 54
    .line 55
    if-nez v0, :cond_3

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    new-instance p1, Ljava/io/ByteArrayOutputStream;

    .line 59
    .line 60
    invoke-direct {p1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 61
    .line 62
    .line 63
    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 64
    .line 65
    const/16 v2, 0x64

    .line 66
    .line 67
    invoke-virtual {v0, v1, v2, p1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 75
    .line 76
    .line 77
    new-instance p1, Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 80
    .line 81
    .line 82
    array-length v1, v0

    .line 83
    const/4 v2, 0x0

    .line 84
    :goto_0
    if-ge v2, v1, :cond_4

    .line 85
    .line 86
    aget-byte v3, v0, v2

    .line 87
    .line 88
    and-int/lit16 v3, v3, 0xff

    .line 89
    .line 90
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 95
    .line 96
    .line 97
    add-int/lit8 v2, v2, 0x1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_4
    return-object p1

    .line 101
    :catch_0
    :cond_5
    :goto_1
    const/4 p1, 0x0

    .line 102
    return-object p1
.end method

.method public onCancel()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LB1/s;->m:Ljava/lang/Object;

    .line 3
    .line 4
    iget-object v1, p0, LB1/s;->n:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Lr2/a;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget-object v2, p0, LB1/s;->l:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Landroid/content/ClipboardManager;

    .line 13
    .line 14
    invoke-virtual {v2, v1}, Landroid/content/ClipboardManager;->removePrimaryClipChangedListener(Landroid/content/ClipboardManager$OnPrimaryClipChangedListener;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, LB1/s;->n:Ljava/lang/Object;

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public p(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, LB1/s;->m:Ljava/lang/Object;

    .line 2
    .line 3
    return-void
.end method

.method public q(Landroid/content/Context;)Ljava/io/File;
    .locals 4

    .line 1
    iget-object v0, p0, LB1/s;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LB1/b;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v0, "flutter"

    .line 9
    .line 10
    invoke-static {v0}, Ljava/lang/System;->mapLibraryName(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Ljava/io/File;

    .line 15
    .line 16
    const-string v2, "lib"

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-virtual {p1, v2, v3}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-direct {v1, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object v1
.end method

.method public r(Landroid/graphics/Bitmap;)Landroid/net/Uri;
    .locals 10

    .line 1
    iget-object v0, p0, LB1/s;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/Context;

    .line 4
    .line 5
    const-string v1, "clipboard_image_"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    :try_start_0
    new-instance v3, Landroid/content/ContentValues;

    .line 9
    .line 10
    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v4, "_display_name"

    .line 14
    .line 15
    new-instance v5, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 21
    .line 22
    .line 23
    move-result-wide v6

    .line 24
    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, ".png"

    .line 28
    .line 29
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v3, v4, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v1, "mime_type"

    .line 40
    .line 41
    const-string v4, "image/png"

    .line 42
    .line 43
    invoke-virtual {v3, v1, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 47
    .line 48
    const-string v4, "is_pending"

    .line 49
    .line 50
    const/16 v5, 0x1d

    .line 51
    .line 52
    if-lt v1, v5, :cond_0

    .line 53
    .line 54
    :try_start_1
    const-string v6, "relative_path"

    .line 55
    .line 56
    sget-object v7, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v3, v6, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const/4 v6, 0x1

    .line 62
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    invoke-virtual {v3, v4, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 67
    .line 68
    .line 69
    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    sget-object v7, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 74
    .line 75
    invoke-virtual {v6, v7, v3}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    .line 76
    .line 77
    .line 78
    move-result-object v6
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 79
    if-nez v6, :cond_1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    :try_start_2
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    invoke-virtual {v7, v6}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    if-nez v7, :cond_2

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_2
    sget-object v8, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 94
    .line 95
    const/16 v9, 0x64

    .line 96
    .line 97
    invoke-virtual {p1, v8, v9, v7}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 98
    .line 99
    .line 100
    invoke-virtual {v7}, Ljava/io/OutputStream;->close()V

    .line 101
    .line 102
    .line 103
    if-lt v1, v5, :cond_3

    .line 104
    .line 105
    invoke-virtual {v3}, Landroid/content/ContentValues;->clear()V

    .line 106
    .line 107
    .line 108
    const/4 p1, 0x0

    .line 109
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {v3, v4, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-virtual {p1, v6, v3, v2, v2}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 121
    .line 122
    .line 123
    :cond_3
    return-object v6

    .line 124
    :catch_0
    :try_start_3
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-virtual {p1, v6, v2, v2}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 129
    .line 130
    .line 131
    :catch_1
    :goto_0
    return-object v2
.end method

.method public s(Ljava/lang/String;Ljava/lang/Object;LB1/o;)V
    .locals 5

    .line 1
    iget-object v0, p0, LB1/s;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LC1/f;

    .line 4
    .line 5
    iget-object v1, p0, LB1/s;->k:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, p0, LB1/s;->m:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, LC1/n;

    .line 12
    .line 13
    new-instance v3, LA/c;

    .line 14
    .line 15
    const/16 v4, 0xb

    .line 16
    .line 17
    invoke-direct {v3, p1, p2, v4}, LA/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v2, v3}, LC1/n;->f(LA/c;)Ljava/nio/ByteBuffer;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-nez p3, :cond_0

    .line 25
    .line 26
    const/4 p2, 0x0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance p2, LC1/a;

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    invoke-direct {p2, p0, p3, v2}, LC1/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 32
    .line 33
    .line 34
    :goto_0
    invoke-interface {v0, v1, p1, p2}, LC1/f;->f(Ljava/lang/String;Ljava/nio/ByteBuffer;LC1/e;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public varargs t(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 2
    .line 3
    invoke-static {v0, p1, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p2, p0, LB1/s;->n:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p2, LM1/N;

    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Lio/flutter/embedding/engine/FlutterJNI;->a(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public u(Lb0/O;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lb0/O;->c:Lb0/s;

    .line 2
    .line 3
    iget-object v1, v0, Lb0/s;->o:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, LB1/s;->l:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object v1, v0, Lb0/s;->o:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v2, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x2

    .line 22
    invoke-static {p1}, Lb0/I;->J(I)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    new-instance p1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v1, "Added fragment to active set "

    .line 31
    .line 32
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const-string v0, "FragmentManager"

    .line 43
    .line 44
    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    :cond_1
    return-void
.end method

.method public v(Lb0/O;)V
    .locals 3

    .line 1
    iget-object v0, p0, LB1/s;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    iget-object v1, p1, Lb0/O;->c:Lb0/s;

    .line 6
    .line 7
    iget-boolean v2, v1, Lb0/s;->L:Z

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    iget-object v2, p0, LB1/s;->n:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Lb0/L;

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Lb0/L;->f(Lb0/s;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v2, v1, Lb0/s;->o:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-eq v2, p1, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    iget-object p1, v1, Lb0/s;->o:Ljava/lang/String;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-virtual {v0, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Lb0/O;

    .line 35
    .line 36
    if-nez p1, :cond_2

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    const/4 p1, 0x2

    .line 40
    invoke-static {p1}, Lb0/I;->J(I)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_3

    .line 45
    .line 46
    new-instance p1, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string v0, "Removed fragment from active set "

    .line 49
    .line 50
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    const-string v0, "FragmentManager"

    .line 61
    .line 62
    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    :cond_3
    :goto_0
    return-void
.end method

.method public w(LT1/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p1, LV/c0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, LV/c0;

    .line 7
    .line 8
    iget v1, v0, LV/c0;->r:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LV/c0;->r:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LV/c0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, LV/c0;-><init>(LB1/s;LT1/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, LV/c0;->p:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, LV/c0;->r:I

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    const/4 v3, 0x1

    .line 31
    sget-object v4, LO1/g;->a:LO1/g;

    .line 32
    .line 33
    const/4 v5, 0x0

    .line 34
    sget-object v6, LS1/a;->k:LS1/a;

    .line 35
    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    if-eq v1, v3, :cond_2

    .line 39
    .line 40
    if-ne v1, v2, :cond_1

    .line 41
    .line 42
    iget-object v1, v0, LV/c0;->o:Lq2/a;

    .line 43
    .line 44
    iget-object v0, v0, LV/c0;->n:LB1/s;

    .line 45
    .line 46
    :try_start_0
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    goto :goto_4

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    goto :goto_5

    .line 52
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_2
    iget-object v1, v0, LV/c0;->o:Lq2/a;

    .line 61
    .line 62
    iget-object v3, v0, LV/c0;->n:LB1/s;

    .line 63
    .line 64
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    invoke-static {p1}, LH2/h;->E(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-object p1, p0, LB1/s;->l:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p1, Li2/m;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    sget-object v1, Li2/W;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 79
    .line 80
    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    instance-of p1, p1, Li2/K;

    .line 85
    .line 86
    if-nez p1, :cond_4

    .line 87
    .line 88
    return-object v4

    .line 89
    :cond_4
    iget-object p1, p0, LB1/s;->k:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast p1, Lq2/c;

    .line 92
    .line 93
    iput-object p0, v0, LV/c0;->n:LB1/s;

    .line 94
    .line 95
    iput-object p1, v0, LV/c0;->o:Lq2/a;

    .line 96
    .line 97
    iput v3, v0, LV/c0;->r:I

    .line 98
    .line 99
    invoke-virtual {p1, v0}, Lq2/c;->c(LT1/c;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    if-ne v1, v6, :cond_5

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_5
    move-object v3, p0

    .line 107
    move-object v1, p1

    .line 108
    :goto_1
    :try_start_1
    iget-object p1, v3, LB1/s;->l:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast p1, Li2/m;

    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    sget-object v7, Li2/W;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 116
    .line 117
    invoke-virtual {v7, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    instance-of p1, p1, Li2/K;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 122
    .line 123
    if-nez p1, :cond_6

    .line 124
    .line 125
    :goto_2
    check-cast v1, Lq2/c;

    .line 126
    .line 127
    invoke-virtual {v1, v5}, Lq2/c;->e(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    return-object v4

    .line 131
    :cond_6
    :try_start_2
    iput-object v3, v0, LV/c0;->n:LB1/s;

    .line 132
    .line 133
    iput-object v1, v0, LV/c0;->o:Lq2/a;

    .line 134
    .line 135
    iput v2, v0, LV/c0;->r:I

    .line 136
    .line 137
    invoke-virtual {v3, v0}, LB1/s;->g(LT1/c;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    if-ne p1, v6, :cond_7

    .line 142
    .line 143
    :goto_3
    return-object v6

    .line 144
    :cond_7
    move-object v0, v3

    .line 145
    :goto_4
    iget-object p1, v0, LB1/s;->l:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast p1, Li2/m;

    .line 148
    .line 149
    invoke-virtual {p1, v4}, Li2/W;->F(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 150
    .line 151
    .line 152
    goto :goto_2

    .line 153
    :goto_5
    check-cast v1, Lq2/c;

    .line 154
    .line 155
    invoke-virtual {v1, v5}, Lq2/c;->e(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    throw p1
.end method

.method public x(Ljava/lang/Object;LC1/c;)V
    .locals 4

    .line 1
    iget-object v0, p0, LB1/s;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LC1/f;

    .line 4
    .line 5
    iget-object v1, p0, LB1/s;->k:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, p0, LB1/s;->m:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, LC1/l;

    .line 12
    .line 13
    invoke-interface {v2, p1}, LC1/l;->a(Ljava/lang/Object;)Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-nez p2, :cond_0

    .line 18
    .line 19
    const/4 p2, 0x0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance v2, LC1/a;

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-direct {v2, p0, p2, v3}, LC1/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 25
    .line 26
    .line 27
    move-object p2, v2

    .line 28
    :goto_0
    invoke-interface {v0, v1, p1, p2}, LC1/f;->f(Ljava/lang/String;Ljava/nio/ByteBuffer;LC1/e;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public y(LC1/b;)V
    .locals 6

    .line 1
    iget-object v0, p0, LB1/s;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, LB1/s;->l:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, LC1/f;

    .line 8
    .line 9
    iget-object v2, p0, LB1/s;->n:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lt1/a;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance v3, LA/c;

    .line 20
    .line 21
    const/16 v4, 0xa

    .line 22
    .line 23
    const/4 v5, 0x0

    .line 24
    invoke-direct {v3, p0, p1, v4, v5}, LA/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 25
    .line 26
    .line 27
    :goto_0
    invoke-interface {v1, v0, v3, v2}, LC1/f;->c(Ljava/lang/String;LC1/d;Lt1/a;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    if-nez p1, :cond_2

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    new-instance v3, LA/c;

    .line 35
    .line 36
    const/16 v2, 0xa

    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    invoke-direct {v3, p0, p1, v2, v4}, LA/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 40
    .line 41
    .line 42
    :goto_1
    invoke-interface {v1, v0, v3}, LC1/f;->b(Ljava/lang/String;LC1/d;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public z(LC1/m;)V
    .locals 6

    .line 1
    iget-object v0, p0, LB1/s;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, LB1/s;->l:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, LC1/f;

    .line 8
    .line 9
    iget-object v2, p0, LB1/s;->n:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lt1/a;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance v3, LA/c;

    .line 20
    .line 21
    const/16 v4, 0xc

    .line 22
    .line 23
    const/4 v5, 0x0

    .line 24
    invoke-direct {v3, p0, p1, v4, v5}, LA/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 25
    .line 26
    .line 27
    :goto_0
    invoke-interface {v1, v0, v3, v2}, LC1/f;->c(Ljava/lang/String;LC1/d;Lt1/a;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    if-nez p1, :cond_2

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    new-instance v3, LA/c;

    .line 35
    .line 36
    const/16 v2, 0xc

    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    invoke-direct {v3, p0, p1, v2, v4}, LA/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 40
    .line 41
    .line 42
    :goto_1
    invoke-interface {v1, v0, v3}, LC1/f;->b(Ljava/lang/String;LC1/d;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.class public final synthetic Lio/flutter/plugin/platform/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lio/flutter/plugin/platform/o;

.field public final synthetic l:Lio/flutter/plugin/platform/D;

.field public final synthetic m:F

.field public final synthetic n:LB1/d;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugin/platform/o;Lio/flutter/plugin/platform/D;FLB1/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugin/platform/n;->k:Lio/flutter/plugin/platform/o;

    iput-object p2, p0, Lio/flutter/plugin/platform/n;->l:Lio/flutter/plugin/platform/D;

    iput p3, p0, Lio/flutter/plugin/platform/n;->m:F

    iput-object p4, p0, Lio/flutter/plugin/platform/n;->n:LB1/d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/platform/n;->k:Lio/flutter/plugin/platform/o;

    .line 2
    .line 3
    iget-object v0, v0, Lio/flutter/plugin/platform/o;->l:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lio/flutter/plugin/platform/s;

    .line 6
    .line 7
    iget-object v1, v0, Lio/flutter/plugin/platform/s;->q:Lio/flutter/plugin/editing/j;

    .line 8
    .line 9
    iget-object v2, p0, Lio/flutter/plugin/platform/n;->l:Lio/flutter/plugin/platform/D;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v3, v1, Lio/flutter/plugin/editing/j;->e:LD/n;

    .line 15
    .line 16
    iget v3, v3, LD/n;->b:I

    .line 17
    .line 18
    const/4 v4, 0x3

    .line 19
    if-ne v3, v4, :cond_1

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    iput-boolean v3, v1, Lio/flutter/plugin/editing/j;->p:Z

    .line 23
    .line 24
    :cond_1
    iget-object v1, v2, Lio/flutter/plugin/platform/D;->a:Lio/flutter/plugin/platform/SingleViewPresentation;

    .line 25
    .line 26
    if-eqz v1, :cond_3

    .line 27
    .line 28
    invoke-virtual {v1}, Lio/flutter/plugin/platform/SingleViewPresentation;->getView()Lio/flutter/plugin/platform/g;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    if-nez v1, :cond_2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    iget-object v1, v2, Lio/flutter/plugin/platform/D;->a:Lio/flutter/plugin/platform/SingleViewPresentation;

    .line 36
    .line 37
    invoke-virtual {v1}, Lio/flutter/plugin/platform/SingleViewPresentation;->getView()Lio/flutter/plugin/platform/g;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    :cond_3
    :goto_0
    iget-object v1, v0, Lio/flutter/plugin/platform/s;->m:Lr1/b;

    .line 45
    .line 46
    if-nez v1, :cond_4

    .line 47
    .line 48
    iget v0, p0, Lio/flutter/plugin/platform/n;->m:F

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_4
    invoke-virtual {v0}, Lio/flutter/plugin/platform/s;->f()F

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    :goto_1
    iget-object v1, v2, Lio/flutter/plugin/platform/D;->f:Lio/flutter/plugin/platform/h;

    .line 56
    .line 57
    invoke-interface {v1}, Lio/flutter/plugin/platform/h;->getWidth()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    int-to-double v3, v1

    .line 62
    float-to-double v0, v0

    .line 63
    div-double/2addr v3, v0

    .line 64
    invoke-static {v3, v4}, Ljava/lang/Math;->round(D)J

    .line 65
    .line 66
    .line 67
    move-result-wide v3

    .line 68
    long-to-int v3, v3

    .line 69
    iget-object v2, v2, Lio/flutter/plugin/platform/D;->f:Lio/flutter/plugin/platform/h;

    .line 70
    .line 71
    invoke-interface {v2}, Lio/flutter/plugin/platform/h;->getHeight()I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    int-to-double v4, v2

    .line 76
    div-double/2addr v4, v0

    .line 77
    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    .line 78
    .line 79
    .line 80
    move-result-wide v0

    .line 81
    long-to-int v0, v0

    .line 82
    iget-object v1, p0, Lio/flutter/plugin/platform/n;->n:LB1/d;

    .line 83
    .line 84
    iget-object v1, v1, LB1/d;->l:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v1, LB1/o;

    .line 87
    .line 88
    new-instance v2, Ljava/util/HashMap;

    .line 89
    .line 90
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 91
    .line 92
    .line 93
    int-to-double v3, v3

    .line 94
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    const-string v4, "width"

    .line 99
    .line 100
    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    int-to-double v3, v0

    .line 104
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    const-string v3, "height"

    .line 109
    .line 110
    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, v2}, LB1/o;->d(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    return-void
.end method

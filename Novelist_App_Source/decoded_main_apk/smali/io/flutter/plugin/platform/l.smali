.class public final synthetic Lio/flutter/plugin/platform/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Lio/flutter/plugin/platform/k;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugin/platform/k;II)V
    .locals 0

    .line 1
    iput p3, p0, Lio/flutter/plugin/platform/l;->a:I

    iput-object p1, p0, Lio/flutter/plugin/platform/l;->c:Lio/flutter/plugin/platform/k;

    iput p2, p0, Lio/flutter/plugin/platform/l;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 2

    .line 1
    iget p1, p0, Lio/flutter/plugin/platform/l;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lio/flutter/plugin/platform/l;->c:Lio/flutter/plugin/platform/k;

    .line 7
    .line 8
    check-cast p1, Lio/flutter/plugin/platform/r;

    .line 9
    .line 10
    iget v0, p0, Lio/flutter/plugin/platform/l;->b:I

    .line 11
    .line 12
    if-eqz p2, :cond_1

    .line 13
    .line 14
    iget-object p1, p1, Lio/flutter/plugin/platform/r;->q:LA/c;

    .line 15
    .line 16
    iget-object p1, p1, LA/c;->l:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, LB1/s;

    .line 19
    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    const/4 v0, 0x0

    .line 28
    const-string v1, "viewFocused"

    .line 29
    .line 30
    invoke-virtual {p1, v1, p2, v0}, LB1/s;->s(Ljava/lang/String;Ljava/lang/Object;LB1/o;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget-object p1, p1, Lio/flutter/plugin/platform/r;->p:Lio/flutter/plugin/editing/j;

    .line 35
    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Lio/flutter/plugin/editing/j;->b(I)V

    .line 39
    .line 40
    .line 41
    :cond_2
    :goto_0
    return-void

    .line 42
    :pswitch_0
    iget-object p1, p0, Lio/flutter/plugin/platform/l;->c:Lio/flutter/plugin/platform/k;

    .line 43
    .line 44
    check-cast p1, Lio/flutter/plugin/platform/s;

    .line 45
    .line 46
    iget v0, p0, Lio/flutter/plugin/platform/l;->b:I

    .line 47
    .line 48
    if-eqz p2, :cond_4

    .line 49
    .line 50
    iget-object p1, p1, Lio/flutter/plugin/platform/s;->r:LA/c;

    .line 51
    .line 52
    iget-object p1, p1, LA/c;->l:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p1, LB1/s;

    .line 55
    .line 56
    if-nez p1, :cond_3

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    const/4 v0, 0x0

    .line 64
    const-string v1, "viewFocused"

    .line 65
    .line 66
    invoke-virtual {p1, v1, p2, v0}, LB1/s;->s(Ljava/lang/String;Ljava/lang/Object;LB1/o;)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_4
    iget-object p1, p1, Lio/flutter/plugin/platform/s;->q:Lio/flutter/plugin/editing/j;

    .line 71
    .line 72
    if-eqz p1, :cond_5

    .line 73
    .line 74
    invoke-virtual {p1, v0}, Lio/flutter/plugin/editing/j;->b(I)V

    .line 75
    .line 76
    .line 77
    :cond_5
    :goto_1
    return-void

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

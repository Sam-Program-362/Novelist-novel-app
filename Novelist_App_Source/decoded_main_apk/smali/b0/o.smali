.class public final Lb0/o;
.super La/a;
.source "SourceFile"


# instance fields
.field public final synthetic m:I

.field public final synthetic n:Lb0/s;


# direct methods
.method public constructor <init>(Lb0/p;Lb0/o;)V
    .locals 0

    const/4 p2, 0x0

    iput p2, p0, Lb0/o;->m:I

    const/16 p2, 0x12

    .line 1
    invoke-direct {p0, p2}, La/a;-><init>(I)V

    .line 2
    iput-object p1, p0, Lb0/o;->n:Lb0/s;

    return-void
.end method

.method public constructor <init>(Lb0/s;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lb0/o;->m:I

    const/16 v0, 0x12

    .line 3
    invoke-direct {p0, v0}, La/a;-><init>(I)V

    .line 4
    iput-object p1, p0, Lb0/o;->n:Lb0/s;

    return-void
.end method


# virtual methods
.method public final L(I)Landroid/view/View;
    .locals 2

    .line 1
    iget v0, p0, Lb0/o;->m:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v1, "Fragment "

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lb0/o;->n:Lb0/s;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, " does not have a view"

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :pswitch_0
    iget-object v0, p0, Lb0/o;->n:Lb0/s;

    .line 34
    .line 35
    check-cast v0, Lb0/p;

    .line 36
    .line 37
    iget-object v0, v0, Lb0/p;->l0:Landroid/app/Dialog;

    .line 38
    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    invoke-virtual {v0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const/4 p1, 0x0

    .line 47
    :goto_0
    return-object p1

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final M()Z
    .locals 1

    .line 1
    iget v0, p0, Lb0/o;->m:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    return v0

    .line 8
    :pswitch_0
    iget-object v0, p0, Lb0/o;->n:Lb0/s;

    .line 9
    .line 10
    check-cast v0, Lb0/p;

    .line 11
    .line 12
    iget-boolean v0, v0, Lb0/p;->p0:Z

    .line 13
    .line 14
    return v0

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

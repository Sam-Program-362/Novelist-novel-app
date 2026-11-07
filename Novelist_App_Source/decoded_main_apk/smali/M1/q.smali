.class public final synthetic LM1/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ1/l;


# instance fields
.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LM1/q;->k:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LM1/q;->k:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    check-cast p1, LR1/f;

    .line 8
    .line 9
    instance-of v0, p1, Li2/q;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    move-object v1, p1

    .line 14
    check-cast v1, Li2/q;

    .line 15
    .line 16
    :cond_0
    return-object v1

    .line 17
    :pswitch_0
    check-cast p1, LO1/d;

    .line 18
    .line 19
    sget p1, LM1/k0;->n:I

    .line 20
    .line 21
    return-object v1

    .line 22
    :pswitch_1
    check-cast p1, LO1/d;

    .line 23
    .line 24
    sget p1, LM1/g0;->c:I

    .line 25
    .line 26
    return-object v1

    .line 27
    :pswitch_2
    check-cast p1, LO1/d;

    .line 28
    .line 29
    sget p1, LM1/Z;->h:I

    .line 30
    .line 31
    return-object v1

    .line 32
    :pswitch_3
    check-cast p1, LO1/d;

    .line 33
    .line 34
    return-object v1

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

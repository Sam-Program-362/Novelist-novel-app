.class public final synthetic Lb/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ1/a;


# instance fields
.field public final synthetic k:I

.field public final synthetic l:Lb/m;


# direct methods
.method public synthetic constructor <init>(Lb/m;I)V
    .locals 0

    .line 1
    iput p2, p0, Lb/l;->k:I

    iput-object p1, p0, Lb/l;->l:Lb/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lb/l;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lb/t;

    .line 7
    .line 8
    new-instance v1, LM1/b;

    .line 9
    .line 10
    const/4 v2, 0x5

    .line 11
    iget-object v3, p0, Lb/l;->l:Lb/m;

    .line 12
    .line 13
    invoke-direct {v1, v3, v2}, LM1/b;-><init>(Ljava/lang/Object;I)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1}, Lb/t;-><init>(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    new-instance v0, Lh0/a;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lb/l;->l:Lb/m;

    .line 26
    .line 27
    invoke-virtual {v1}, Lb/m;->b()Lb/t;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Lb/t;->a()Lb/r;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iget-object v1, v1, Lb/r;->c:LB1/s;

    .line 36
    .line 37
    invoke-virtual {v1, v0}, LB1/s;->c(Lh0/d;)V

    .line 38
    .line 39
    .line 40
    return-object v0

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

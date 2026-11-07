.class public final Lg2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg2/d;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:LO1/a;


# direct methods
.method public constructor <init>(LI1/l;LM1/P;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lg2/c;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg2/c;->b:Ljava/lang/Object;

    iput-object p2, p0, Lg2/c;->c:LO1/a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;Lh2/m;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lg2/c;->a:I

    const-string v0, "input"

    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lg2/c;->b:Ljava/lang/Object;

    .line 4
    iput-object p2, p0, Lg2/c;->c:LO1/a;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget v0, p0, Lg2/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lh2/b;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lh2/b;-><init>(Lg2/c;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_0
    new-instance v0, Lg2/b;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Lg2/b;-><init>(Lg2/c;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

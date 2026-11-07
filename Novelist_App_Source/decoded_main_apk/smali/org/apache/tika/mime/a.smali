.class public final synthetic Lorg/apache/tika/mime/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/apache/tika/mime/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/tika/mime/a;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Process;

    invoke-static {p1}, Lorg/apache/tika/fork/a;->r(Ljava/lang/Process;)V

    return-void

    :pswitch_0
    check-cast p1, Ljava/lang/Process;

    invoke-static {p1}, Lorg/apache/tika/fork/a;->r(Ljava/lang/Process;)V

    return-void

    :pswitch_1
    check-cast p1, Ljava/net/URL;

    invoke-static {p1}, Lorg/apache/tika/mime/MimeTypesFactory;->a(Ljava/net/URL;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

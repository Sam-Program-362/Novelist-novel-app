.class public final synthetic Lorg/apache/tika/sax/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/apache/tika/sax/SafeContentHandler$Output;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lorg/apache/tika/sax/SafeContentHandler;


# direct methods
.method public synthetic constructor <init>(Lorg/apache/tika/sax/SafeContentHandler;I)V
    .locals 0

    .line 1
    iput p2, p0, Lorg/apache/tika/sax/a;->a:I

    iput-object p1, p0, Lorg/apache/tika/sax/a;->b:Lorg/apache/tika/sax/SafeContentHandler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final write([CII)V
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/tika/sax/a;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lorg/apache/tika/sax/a;->b:Lorg/apache/tika/sax/SafeContentHandler;

    invoke-static {v0, p1, p2, p3}, Lorg/apache/tika/sax/SafeContentHandler;->b(Lorg/apache/tika/sax/SafeContentHandler;[CII)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lorg/apache/tika/sax/a;->b:Lorg/apache/tika/sax/SafeContentHandler;

    invoke-static {v0, p1, p2, p3}, Lorg/apache/tika/sax/SafeContentHandler;->a(Lorg/apache/tika/sax/SafeContentHandler;[CII)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

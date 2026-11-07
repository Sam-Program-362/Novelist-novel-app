.class Lorg/apache/tika/sax/SecureContentHandler$SecureSAXException;
.super Lorg/xml/sax/SAXException;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/tika/sax/SecureContentHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "SecureSAXException"
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x1fb6d290ceae7fb5L


# instance fields
.field final synthetic this$0:Lorg/apache/tika/sax/SecureContentHandler;


# direct methods
.method public constructor <init>(Lorg/apache/tika/sax/SecureContentHandler;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/tika/sax/SecureContentHandler$SecureSAXException;->this$0:Lorg/apache/tika/sax/SecureContentHandler;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public isCausedBy(Lorg/apache/tika/sax/SecureContentHandler;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/SecureContentHandler$SecureSAXException;->this$0:Lorg/apache/tika/sax/SecureContentHandler;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    return p1

    .line 7
    :cond_0
    const/4 p1, 0x0

    .line 8
    return p1
.end method

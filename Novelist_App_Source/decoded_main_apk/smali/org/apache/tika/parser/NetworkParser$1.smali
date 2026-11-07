.class Lorg/apache/tika/parser/NetworkParser$1;
.super Ljava/io/FilterOutputStream;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/tika/parser/NetworkParser;->parse(Lorg/apache/tika/io/TikaInputStream;Lorg/xml/sax/ContentHandler;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/tika/parser/NetworkParser;

.field final synthetic val$socket:Ljava/net/Socket;


# direct methods
.method public constructor <init>(Lorg/apache/tika/parser/NetworkParser;Ljava/io/OutputStream;Ljava/net/Socket;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/tika/parser/NetworkParser$1;->this$0:Lorg/apache/tika/parser/NetworkParser;

    .line 2
    .line 3
    iput-object p3, p0, Lorg/apache/tika/parser/NetworkParser$1;->val$socket:Ljava/net/Socket;

    .line 4
    .line 5
    invoke-direct {p0, p2}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/parser/NetworkParser$1;->val$socket:Ljava/net/Socket;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/net/Socket;->shutdownOutput()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

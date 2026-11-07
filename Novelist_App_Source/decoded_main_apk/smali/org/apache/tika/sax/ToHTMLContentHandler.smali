.class public Lorg/apache/tika/sax/ToHTMLContentHandler;
.super Lorg/apache/tika/sax/ToXMLContentHandler;
.source "SourceFile"


# static fields
.field private static final EMPTY_ELEMENTS:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    const-string v12, "meta"

    .line 4
    .line 5
    const-string v13, "param"

    .line 6
    .line 7
    const-string v1, "area"

    .line 8
    .line 9
    const-string v2, "base"

    .line 10
    .line 11
    const-string v3, "basefont"

    .line 12
    .line 13
    const-string v4, "br"

    .line 14
    .line 15
    const-string v5, "col"

    .line 16
    .line 17
    const-string v6, "frame"

    .line 18
    .line 19
    const-string v7, "hr"

    .line 20
    .line 21
    const-string v8, "img"

    .line 22
    .line 23
    const-string v9, "input"

    .line 24
    .line 25
    const-string v10, "isindex"

    .line 26
    .line 27
    const-string v11, "link"

    .line 28
    .line 29
    filled-new-array/range {v1 .. v13}, [Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Lorg/apache/tika/sax/ToHTMLContentHandler;->EMPTY_ELEMENTS:Ljava/util/Set;

    .line 41
    .line 42
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Lorg/apache/tika/sax/ToXMLContentHandler;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/io/OutputStream;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lorg/apache/tika/sax/ToXMLContentHandler;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/tika/sax/ToXMLContentHandler;->inStartElement:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x3e

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lorg/apache/tika/sax/ToXMLContentHandler;->write(C)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-boolean v0, p0, Lorg/apache/tika/sax/ToXMLContentHandler;->inStartElement:Z

    .line 12
    .line 13
    sget-object v0, Lorg/apache/tika/sax/ToHTMLContentHandler;->EMPTY_ELEMENTS:Ljava/util/Set;

    .line 14
    .line 15
    invoke-interface {v0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object p1, p0, Lorg/apache/tika/sax/ToXMLContentHandler;->namespaces:Ljava/util/Map;

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/Map;->clear()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lorg/apache/tika/sax/ToXMLContentHandler;->endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public startDocument()V
    .locals 0

    return-void
.end method

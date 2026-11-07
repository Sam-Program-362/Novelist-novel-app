.class Lorg/apache/tika/sax/LinkBuilder;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private rel:Ljava/lang/String;

.field private final text:Ljava/lang/StringBuilder;

.field private title:Ljava/lang/String;

.field private final type:Ljava/lang/String;

.field private uri:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lorg/apache/tika/sax/LinkBuilder;->text:Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v0, ""

    .line 12
    .line 13
    iput-object v0, p0, Lorg/apache/tika/sax/LinkBuilder;->uri:Ljava/lang/String;

    .line 14
    .line 15
    iput-object v0, p0, Lorg/apache/tika/sax/LinkBuilder;->title:Ljava/lang/String;

    .line 16
    .line 17
    iput-object v0, p0, Lorg/apache/tika/sax/LinkBuilder;->rel:Ljava/lang/String;

    .line 18
    .line 19
    iput-object p1, p0, Lorg/apache/tika/sax/LinkBuilder;->type:Ljava/lang/String;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public characters([CII)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/LinkBuilder;->text:Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public getLink()Lorg/apache/tika/sax/Link;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lorg/apache/tika/sax/LinkBuilder;->getLink(Z)Lorg/apache/tika/sax/Link;

    move-result-object v0

    return-object v0
.end method

.method public getLink(Z)Lorg/apache/tika/sax/Link;
    .locals 7

    .line 2
    iget-object v0, p0, Lorg/apache/tika/sax/LinkBuilder;->text:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz p1, :cond_0

    .line 3
    const-string p1, "\\s+"

    const-string v1, " "

    invoke-virtual {v0, p1, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    :cond_0
    move-object v5, v0

    .line 4
    new-instance v1, Lorg/apache/tika/sax/Link;

    iget-object v2, p0, Lorg/apache/tika/sax/LinkBuilder;->type:Ljava/lang/String;

    iget-object v3, p0, Lorg/apache/tika/sax/LinkBuilder;->uri:Ljava/lang/String;

    iget-object v4, p0, Lorg/apache/tika/sax/LinkBuilder;->title:Ljava/lang/String;

    iget-object v6, p0, Lorg/apache/tika/sax/LinkBuilder;->rel:Ljava/lang/String;

    invoke-direct/range {v1 .. v6}, Lorg/apache/tika/sax/Link;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/LinkBuilder;->type:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public setRel(Ljava/lang/String;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lorg/apache/tika/sax/LinkBuilder;->rel:Ljava/lang/String;

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p1, ""

    .line 7
    .line 8
    iput-object p1, p0, Lorg/apache/tika/sax/LinkBuilder;->rel:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lorg/apache/tika/sax/LinkBuilder;->title:Ljava/lang/String;

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p1, ""

    .line 7
    .line 8
    iput-object p1, p0, Lorg/apache/tika/sax/LinkBuilder;->title:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method

.method public setURI(Ljava/lang/String;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lorg/apache/tika/sax/LinkBuilder;->uri:Ljava/lang/String;

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p1, ""

    .line 7
    .line 8
    iput-object p1, p0, Lorg/apache/tika/sax/LinkBuilder;->uri:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method

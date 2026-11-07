.class Lorg/apache/tika/mime/MimeType$RootXML;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/tika/mime/MimeType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RootXML"
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x4756b66c6cf94d9aL


# instance fields
.field private localName:Ljava/lang/String;

.field private namespaceURI:Ljava/lang/String;

.field private type:Lorg/apache/tika/mime/MimeType;


# direct methods
.method public constructor <init>(Lorg/apache/tika/mime/MimeType;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lorg/apache/tika/mime/MimeType$RootXML;->type:Lorg/apache/tika/mime/MimeType;

    .line 6
    .line 7
    iput-object v0, p0, Lorg/apache/tika/mime/MimeType$RootXML;->namespaceURI:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, Lorg/apache/tika/mime/MimeType$RootXML;->localName:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {p0, p2}, Lorg/apache/tika/mime/MimeType$RootXML;->isEmpty(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-direct {p0, p3}, Lorg/apache/tika/mime/MimeType$RootXML;->isEmpty(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 25
    .line 26
    const-string p2, "Both namespaceURI and localName cannot be empty"

    .line 27
    .line 28
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_1
    :goto_0
    iput-object p1, p0, Lorg/apache/tika/mime/MimeType$RootXML;->type:Lorg/apache/tika/mime/MimeType;

    .line 33
    .line 34
    iput-object p2, p0, Lorg/apache/tika/mime/MimeType$RootXML;->namespaceURI:Ljava/lang/String;

    .line 35
    .line 36
    iput-object p3, p0, Lorg/apache/tika/mime/MimeType$RootXML;->localName:Ljava/lang/String;

    .line 37
    .line 38
    return-void
.end method

.method private isEmpty(Ljava/lang/String;)Z
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    const-string v0, ""

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    return p1

    .line 14
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 15
    return p1
.end method


# virtual methods
.method public getLocalName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/mime/MimeType$RootXML;->localName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getNameSpaceURI()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/mime/MimeType$RootXML;->namespaceURI:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getType()Lorg/apache/tika/mime/MimeType;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/mime/MimeType$RootXML;->type:Lorg/apache/tika/mime/MimeType;

    .line 2
    .line 3
    return-object v0
.end method

.method public matches(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/tika/mime/MimeType$RootXML;->namespaceURI:Ljava/lang/String;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lorg/apache/tika/mime/MimeType$RootXML;->isEmpty(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lorg/apache/tika/mime/MimeType$RootXML;->namespaceURI:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    return v1

    .line 19
    :cond_0
    invoke-direct {p0, p1}, Lorg/apache/tika/mime/MimeType$RootXML;->isEmpty(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    return v1

    .line 26
    :cond_1
    iget-object p1, p0, Lorg/apache/tika/mime/MimeType$RootXML;->localName:Ljava/lang/String;

    .line 27
    .line 28
    invoke-direct {p0, p1}, Lorg/apache/tika/mime/MimeType$RootXML;->isEmpty(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-nez p1, :cond_2

    .line 33
    .line 34
    iget-object p1, p0, Lorg/apache/tika/mime/MimeType$RootXML;->localName:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    return p1

    .line 41
    :cond_2
    invoke-direct {p0, p2}, Lorg/apache/tika/mime/MimeType$RootXML;->isEmpty(Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/apache/tika/mime/MimeType$RootXML;->type:Lorg/apache/tika/mime/MimeType;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lorg/apache/tika/mime/MimeType$RootXML;->namespaceURI:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, p0, Lorg/apache/tika/mime/MimeType$RootXML;->localName:Ljava/lang/String;

    .line 10
    .line 11
    new-instance v3, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v0, ", "

    .line 20
    .line 21
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    return-object v0
.end method

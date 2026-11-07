.class public final Lorg/apache/tika/mime/MimeType;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/tika/mime/MimeType$RootXML;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lorg/apache/tika/mime/MimeType;",
        ">;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x3c7a1fb23f487571L


# instance fields
.field private acronym:Ljava/lang/String;

.field private description:Ljava/lang/String;

.field private extensions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private isInterpreted:Z

.field private links:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/net/URI;",
            ">;"
        }
    .end annotation
.end field

.field private magics:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/apache/tika/mime/Magic;",
            ">;"
        }
    .end annotation
.end field

.field private final minLength:I

.field private rootXML:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/apache/tika/mime/MimeType$RootXML;",
            ">;"
        }
    .end annotation
.end field

.field private final type:Lorg/apache/tika/mime/MediaType;

.field private uti:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lorg/apache/tika/mime/MediaType;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lorg/apache/tika/mime/MimeType;->minLength:I

    .line 6
    .line 7
    const-string v1, ""

    .line 8
    .line 9
    iput-object v1, p0, Lorg/apache/tika/mime/MimeType;->acronym:Ljava/lang/String;

    .line 10
    .line 11
    iput-object v1, p0, Lorg/apache/tika/mime/MimeType;->uti:Ljava/lang/String;

    .line 12
    .line 13
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 14
    .line 15
    iput-object v2, p0, Lorg/apache/tika/mime/MimeType;->links:Ljava/util/List;

    .line 16
    .line 17
    iput-object v1, p0, Lorg/apache/tika/mime/MimeType;->description:Ljava/lang/String;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    iput-object v1, p0, Lorg/apache/tika/mime/MimeType;->magics:Ljava/util/List;

    .line 21
    .line 22
    iput-object v1, p0, Lorg/apache/tika/mime/MimeType;->rootXML:Ljava/util/List;

    .line 23
    .line 24
    iput-object v1, p0, Lorg/apache/tika/mime/MimeType;->extensions:Ljava/util/List;

    .line 25
    .line 26
    iput-boolean v0, p0, Lorg/apache/tika/mime/MimeType;->isInterpreted:Z

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    iput-object p1, p0, Lorg/apache/tika/mime/MimeType;->type:Lorg/apache/tika/mime/MediaType;

    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 34
    .line 35
    const-string v0, "Media type name is missing"

    .line 36
    .line 37
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1
.end method

.method public static isValid(Ljava/lang/String;)Z
    .locals 5

    .line 1
    if-eqz p0, :cond_6

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    move v1, v0

    .line 5
    move v2, v1

    .line 6
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v3

    .line 10
    if-ge v1, v3, :cond_5

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    const/16 v4, 0x20

    .line 17
    .line 18
    if-le v3, v4, :cond_4

    .line 19
    .line 20
    const/16 v4, 0x7f

    .line 21
    .line 22
    if-ge v3, v4, :cond_4

    .line 23
    .line 24
    const/16 v4, 0x28

    .line 25
    .line 26
    if-eq v3, v4, :cond_4

    .line 27
    .line 28
    const/16 v4, 0x29

    .line 29
    .line 30
    if-eq v3, v4, :cond_4

    .line 31
    .line 32
    const/16 v4, 0x3c

    .line 33
    .line 34
    if-eq v3, v4, :cond_4

    .line 35
    .line 36
    const/16 v4, 0x3e

    .line 37
    .line 38
    if-eq v3, v4, :cond_4

    .line 39
    .line 40
    const/16 v4, 0x40

    .line 41
    .line 42
    if-eq v3, v4, :cond_4

    .line 43
    .line 44
    const/16 v4, 0x2c

    .line 45
    .line 46
    if-eq v3, v4, :cond_4

    .line 47
    .line 48
    const/16 v4, 0x3b

    .line 49
    .line 50
    if-eq v3, v4, :cond_4

    .line 51
    .line 52
    const/16 v4, 0x3a

    .line 53
    .line 54
    if-eq v3, v4, :cond_4

    .line 55
    .line 56
    const/16 v4, 0x5c

    .line 57
    .line 58
    if-eq v3, v4, :cond_4

    .line 59
    .line 60
    const/16 v4, 0x22

    .line 61
    .line 62
    if-eq v3, v4, :cond_4

    .line 63
    .line 64
    const/16 v4, 0x5b

    .line 65
    .line 66
    if-eq v3, v4, :cond_4

    .line 67
    .line 68
    const/16 v4, 0x5d

    .line 69
    .line 70
    if-eq v3, v4, :cond_4

    .line 71
    .line 72
    const/16 v4, 0x3f

    .line 73
    .line 74
    if-eq v3, v4, :cond_4

    .line 75
    .line 76
    const/16 v4, 0x3d

    .line 77
    .line 78
    if-ne v3, v4, :cond_0

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_0
    const/16 v4, 0x2f

    .line 82
    .line 83
    if-ne v3, v4, :cond_3

    .line 84
    .line 85
    if-nez v2, :cond_2

    .line 86
    .line 87
    if-eqz v1, :cond_2

    .line 88
    .line 89
    add-int/lit8 v2, v1, 0x1

    .line 90
    .line 91
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-ne v2, v3, :cond_1

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_1
    const/4 v2, 0x1

    .line 99
    goto :goto_2

    .line 100
    :cond_2
    :goto_1
    return v0

    .line 101
    :cond_3
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_4
    :goto_3
    return v0

    .line 105
    :cond_5
    return v2

    .line 106
    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 107
    .line 108
    const-string v0, "Name is missing"

    .line 109
    .line 110
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw p0
.end method


# virtual methods
.method public addExtension(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/tika/mime/MimeType;->extensions:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lorg/apache/tika/mime/MimeType;->extensions:Ljava/util/List;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x1

    .line 17
    if-ne v0, v1, :cond_1

    .line 18
    .line 19
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    iget-object v1, p0, Lorg/apache/tika/mime/MimeType;->extensions:Ljava/util/List;

    .line 22
    .line 23
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lorg/apache/tika/mime/MimeType;->extensions:Ljava/util/List;

    .line 27
    .line 28
    :cond_1
    :goto_0
    iget-object v0, p0, Lorg/apache/tika/mime/MimeType;->extensions:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_2

    .line 35
    .line 36
    iget-object v0, p0, Lorg/apache/tika/mime/MimeType;->extensions:Ljava/util/List;

    .line 37
    .line 38
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    :cond_2
    return-void
.end method

.method public addLink(Ljava/net/URI;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v1, p0, Lorg/apache/tika/mime/MimeType;->links:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    add-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lorg/apache/tika/mime/MimeType;->links:Ljava/util/List;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, Lorg/apache/tika/mime/MimeType;->links:Ljava/util/List;

    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 32
    .line 33
    const-string v0, "Missing Link"

    .line 34
    .line 35
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p1
.end method

.method public addMagic(Lorg/apache/tika/mime/Magic;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lorg/apache/tika/mime/MimeType;->magics:Ljava/util/List;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lorg/apache/tika/mime/MimeType;->magics:Ljava/util/List;

    .line 14
    .line 15
    :cond_1
    iget-object v0, p0, Lorg/apache/tika/mime/MimeType;->magics:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public addRootXML(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/tika/mime/MimeType;->rootXML:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lorg/apache/tika/mime/MimeType;->rootXML:Ljava/util/List;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lorg/apache/tika/mime/MimeType;->rootXML:Ljava/util/List;

    .line 13
    .line 14
    new-instance v1, Lorg/apache/tika/mime/MimeType$RootXML;

    .line 15
    .line 16
    invoke-direct {v1, p0, p1, p2}, Lorg/apache/tika/mime/MimeType$RootXML;-><init>(Lorg/apache/tika/mime/MimeType;Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lorg/apache/tika/mime/MimeType;

    invoke-virtual {p0, p1}, Lorg/apache/tika/mime/MimeType;->compareTo(Lorg/apache/tika/mime/MimeType;)I

    move-result p1

    return p1
.end method

.method public compareTo(Lorg/apache/tika/mime/MimeType;)I
    .locals 1

    .line 2
    iget-object v0, p0, Lorg/apache/tika/mime/MimeType;->type:Lorg/apache/tika/mime/MediaType;

    iget-object p1, p1, Lorg/apache/tika/mime/MimeType;->type:Lorg/apache/tika/mime/MediaType;

    invoke-virtual {v0, p1}, Lorg/apache/tika/mime/MediaType;->compareTo(Lorg/apache/tika/mime/MediaType;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lorg/apache/tika/mime/MimeType;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lorg/apache/tika/mime/MimeType;

    .line 6
    .line 7
    iget-object v0, p0, Lorg/apache/tika/mime/MimeType;->type:Lorg/apache/tika/mime/MediaType;

    .line 8
    .line 9
    iget-object p1, p1, Lorg/apache/tika/mime/MimeType;->type:Lorg/apache/tika/mime/MediaType;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lorg/apache/tika/mime/MediaType;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return p1
.end method

.method public getAcronym()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/mime/MimeType;->acronym:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/mime/MimeType;->description:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getExtension()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/tika/mime/MimeType;->extensions:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const/4 v1, 0x0

    .line 9
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/String;

    .line 14
    .line 15
    return-object v0
.end method

.method public getExtensions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/apache/tika/mime/MimeType;->extensions:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 11
    .line 12
    return-object v0
.end method

.method public getLinks()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/net/URI;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/apache/tika/mime/MimeType;->links:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMagics()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/apache/tika/mime/Magic;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/apache/tika/mime/MimeType;->magics:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 7
    .line 8
    return-object v0
.end method

.method public getMinLength()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/mime/MimeType;->type:Lorg/apache/tika/mime/MediaType;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/apache/tika/mime/MediaType;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getType()Lorg/apache/tika/mime/MediaType;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/mime/MimeType;->type:Lorg/apache/tika/mime/MediaType;

    .line 2
    .line 3
    return-object v0
.end method

.method public getUniformTypeIdentifier()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/mime/MimeType;->uti:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public hasMagic()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/mime/MimeType;->magics:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public hasRootXML()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/mime/MimeType;->rootXML:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/mime/MimeType;->type:Lorg/apache/tika/mime/MediaType;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/apache/tika/mime/MediaType;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public isInterpreted()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/tika/mime/MimeType;->isInterpreted:Z

    .line 2
    .line 3
    return v0
.end method

.method public matches([B)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lorg/apache/tika/mime/MimeType;->matchesMagic([B)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public matchesMagic([B)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Lorg/apache/tika/mime/MimeType;->magics:Ljava/util/List;

    .line 4
    .line 5
    if-eqz v2, :cond_1

    .line 6
    .line 7
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_1

    .line 12
    .line 13
    iget-object v2, p0, Lorg/apache/tika/mime/MimeType;->magics:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Lorg/apache/tika/mime/Magic;

    .line 20
    .line 21
    invoke-virtual {v2, p1}, Lorg/apache/tika/mime/Magic;->eval([B)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    return p1

    .line 29
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    return v0
.end method

.method public matchesXML(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/tika/mime/MimeType;->rootXML:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lorg/apache/tika/mime/MimeType$RootXML;

    .line 20
    .line 21
    invoke-virtual {v1, p1, p2}, Lorg/apache/tika/mime/MimeType$RootXML;->matches(Ljava/lang/String;Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    return p1

    .line 29
    :cond_1
    const/4 p1, 0x0

    .line 30
    return p1
.end method

.method public setAcronym(Ljava/lang/String;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lorg/apache/tika/mime/MimeType;->acronym:Ljava/lang/String;

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 7
    .line 8
    const-string v0, "Acronym is missing"

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p1
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lorg/apache/tika/mime/MimeType;->description:Ljava/lang/String;

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 7
    .line 8
    const-string v0, "Description is missing"

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p1
.end method

.method public setInterpreted(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/apache/tika/mime/MimeType;->isInterpreted:Z

    .line 2
    .line 3
    return-void
.end method

.method public setUniformTypeIdentifier(Ljava/lang/String;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lorg/apache/tika/mime/MimeType;->uti:Ljava/lang/String;

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 7
    .line 8
    const-string v0, "Uniform Type Identifier is missing"

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/mime/MimeType;->type:Lorg/apache/tika/mime/MediaType;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/apache/tika/mime/MediaType;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

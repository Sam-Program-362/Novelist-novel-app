.class Lorg/apache/tika/mime/Magic;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/apache/tika/mime/Clause;
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lorg/apache/tika/mime/Clause;",
        "Ljava/lang/Comparable<",
        "Lorg/apache/tika/mime/Magic;",
        ">;"
    }
.end annotation


# instance fields
.field private final clause:Lorg/apache/tika/mime/Clause;

.field private final priority:I

.field private final string:Ljava/lang/String;

.field private final type:Lorg/apache/tika/mime/MimeType;


# direct methods
.method public constructor <init>(Lorg/apache/tika/mime/MimeType;ILorg/apache/tika/mime/Clause;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/apache/tika/mime/Magic;->type:Lorg/apache/tika/mime/MimeType;

    .line 5
    .line 6
    iput p2, p0, Lorg/apache/tika/mime/Magic;->priority:I

    .line 7
    .line 8
    iput-object p3, p0, Lorg/apache/tika/mime/Magic;->clause:Lorg/apache/tika/mime/Clause;

    .line 9
    .line 10
    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    new-instance p3, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v0, "["

    .line 17
    .line 18
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p2, "/"

    .line 25
    .line 26
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string p1, "]"

    .line 33
    .line 34
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, Lorg/apache/tika/mime/Magic;->string:Ljava/lang/String;

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lorg/apache/tika/mime/Magic;

    invoke-virtual {p0, p1}, Lorg/apache/tika/mime/Magic;->compareTo(Lorg/apache/tika/mime/Magic;)I

    move-result p1

    return p1
.end method

.method public compareTo(Lorg/apache/tika/mime/Magic;)I
    .locals 2

    .line 2
    iget v0, p1, Lorg/apache/tika/mime/Magic;->priority:I

    iget v1, p0, Lorg/apache/tika/mime/Magic;->priority:I

    sub-int/2addr v0, v1

    if-nez v0, :cond_0

    .line 3
    invoke-virtual {p1}, Lorg/apache/tika/mime/Magic;->size()I

    move-result v0

    invoke-virtual {p0}, Lorg/apache/tika/mime/Magic;->size()I

    move-result v1

    sub-int/2addr v0, v1

    :cond_0
    if-nez v0, :cond_1

    .line 4
    iget-object v0, p1, Lorg/apache/tika/mime/Magic;->type:Lorg/apache/tika/mime/MimeType;

    iget-object v1, p0, Lorg/apache/tika/mime/Magic;->type:Lorg/apache/tika/mime/MimeType;

    invoke-virtual {v0, v1}, Lorg/apache/tika/mime/MimeType;->compareTo(Lorg/apache/tika/mime/MimeType;)I

    move-result v0

    :cond_1
    if-nez v0, :cond_2

    .line 5
    iget-object p1, p1, Lorg/apache/tika/mime/Magic;->string:Ljava/lang/String;

    iget-object v0, p0, Lorg/apache/tika/mime/Magic;->string:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1

    :cond_2
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lorg/apache/tika/mime/Magic;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Lorg/apache/tika/mime/Magic;

    .line 7
    .line 8
    iget-object v0, p0, Lorg/apache/tika/mime/Magic;->type:Lorg/apache/tika/mime/MimeType;

    .line 9
    .line 10
    iget-object v2, p1, Lorg/apache/tika/mime/Magic;->type:Lorg/apache/tika/mime/MimeType;

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Lorg/apache/tika/mime/MimeType;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lorg/apache/tika/mime/Magic;->string:Ljava/lang/String;

    .line 19
    .line 20
    iget-object p1, p1, Lorg/apache/tika/mime/Magic;->string:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    return p1

    .line 30
    :cond_0
    return v1
.end method

.method public eval([B)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/mime/Magic;->clause:Lorg/apache/tika/mime/Clause;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lorg/apache/tika/mime/Clause;->eval([B)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public getPriority()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/tika/mime/Magic;->priority:I

    .line 2
    .line 3
    return v0
.end method

.method public getType()Lorg/apache/tika/mime/MimeType;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/mime/Magic;->type:Lorg/apache/tika/mime/MimeType;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/tika/mime/Magic;->type:Lorg/apache/tika/mime/MimeType;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/apache/tika/mime/MimeType;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lorg/apache/tika/mime/Magic;->string:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    xor-int/2addr v0, v1

    .line 14
    return v0
.end method

.method public size()I
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/mime/Magic;->clause:Lorg/apache/tika/mime/Clause;

    .line 2
    .line 3
    invoke-interface {v0}, Lorg/apache/tika/mime/Clause;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/mime/Magic;->string:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

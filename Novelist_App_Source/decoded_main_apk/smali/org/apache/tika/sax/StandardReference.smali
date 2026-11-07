.class public Lorg/apache/tika/sax/StandardReference;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/tika/sax/StandardReference$StandardReferenceBuilder;
    }
.end annotation


# instance fields
.field private identifier:Ljava/lang/String;

.field private mainOrganization:Ljava/lang/String;

.field private score:D

.field private secondOrganization:Ljava/lang/String;

.field private separator:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lorg/apache/tika/sax/StandardReference;->mainOrganization:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lorg/apache/tika/sax/StandardReference;->separator:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lorg/apache/tika/sax/StandardReference;->secondOrganization:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lorg/apache/tika/sax/StandardReference;->identifier:Ljava/lang/String;

    .line 7
    iput-wide p5, p0, Lorg/apache/tika/sax/StandardReference;->score:D

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DI)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Lorg/apache/tika/sax/StandardReference;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V

    return-void
.end method


# virtual methods
.method public getIdentifier()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/StandardReference;->identifier:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMainOrganizationAcronym()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/StandardReference;->mainOrganization:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getScore()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lorg/apache/tika/sax/StandardReference;->score:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public getSecondOrganizationAcronym()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/StandardReference;->secondOrganization:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSeparator()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/StandardReference;->separator:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public setIdentifier(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/tika/sax/StandardReference;->identifier:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setMainOrganizationAcronym(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/tika/sax/StandardReference;->mainOrganization:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setScore(D)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lorg/apache/tika/sax/StandardReference;->score:D

    .line 2
    .line 3
    return-void
.end method

.method public setSecondOrganizationAcronym(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/tika/sax/StandardReference;->secondOrganization:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setSeparator(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/tika/sax/StandardReference;->separator:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/StandardReference;->mainOrganization:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/apache/tika/sax/StandardReference;->separator:Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lorg/apache/tika/sax/StandardReference;->separator:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v2, p0, Lorg/apache/tika/sax/StandardReference;->secondOrganization:Ljava/lang/String;

    .line 16
    .line 17
    new-instance v3, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    :cond_0
    iget-object v1, p0, Lorg/apache/tika/sax/StandardReference;->identifier:Ljava/lang/String;

    .line 36
    .line 37
    new-instance v2, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v0, " "

    .line 46
    .line 47
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    return-object v0
.end method

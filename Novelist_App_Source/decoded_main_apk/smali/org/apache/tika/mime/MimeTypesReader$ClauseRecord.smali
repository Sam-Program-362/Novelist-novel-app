.class Lorg/apache/tika/mime/MimeTypesReader$ClauseRecord;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/tika/mime/MimeTypesReader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ClauseRecord"
.end annotation


# instance fields
.field private clause:Lorg/apache/tika/mime/Clause;

.field private final parent:Lorg/apache/tika/mime/MimeTypesReader$ClauseRecord;

.field private subclauses:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/apache/tika/mime/Clause;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lorg/apache/tika/mime/MimeTypesReader;


# direct methods
.method public constructor <init>(Lorg/apache/tika/mime/MimeTypesReader;Lorg/apache/tika/mime/Clause;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lorg/apache/tika/mime/MimeTypesReader$ClauseRecord;->this$0:Lorg/apache/tika/mime/MimeTypesReader;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lorg/apache/tika/mime/MimeTypesReader$ClauseRecord;->subclauses:Ljava/util/List;

    .line 8
    .line 9
    invoke-static {p1}, Lorg/apache/tika/mime/MimeTypesReader;->a(Lorg/apache/tika/mime/MimeTypesReader;)Lorg/apache/tika/mime/MimeTypesReader$ClauseRecord;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Lorg/apache/tika/mime/MimeTypesReader$ClauseRecord;->parent:Lorg/apache/tika/mime/MimeTypesReader$ClauseRecord;

    .line 14
    .line 15
    iput-object p2, p0, Lorg/apache/tika/mime/MimeTypesReader$ClauseRecord;->clause:Lorg/apache/tika/mime/Clause;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public getClauses()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/apache/tika/mime/Clause;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/apache/tika/mime/MimeTypesReader$ClauseRecord;->subclauses:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public stop()V
    .locals 6

    .line 1
    iget-object v0, p0, Lorg/apache/tika/mime/MimeTypesReader$ClauseRecord;->clause:Lorg/apache/tika/mime/Clause;

    .line 2
    .line 3
    instance-of v1, v0, Lorg/apache/tika/mime/MimeTypesReader$MinShouldMatchVal;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Lorg/apache/tika/mime/MinShouldMatchClause;

    .line 9
    .line 10
    check-cast v0, Lorg/apache/tika/mime/MimeTypesReader$MinShouldMatchVal;

    .line 11
    .line 12
    invoke-virtual {v0}, Lorg/apache/tika/mime/MimeTypesReader$MinShouldMatchVal;->getVal()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v3, p0, Lorg/apache/tika/mime/MimeTypesReader$ClauseRecord;->subclauses:Ljava/util/List;

    .line 17
    .line 18
    invoke-direct {v1, v0, v3}, Lorg/apache/tika/mime/MinShouldMatchClause;-><init>(ILjava/util/List;)V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, Lorg/apache/tika/mime/MimeTypesReader$ClauseRecord;->clause:Lorg/apache/tika/mime/Clause;

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    iget-object v0, p0, Lorg/apache/tika/mime/MimeTypesReader$ClauseRecord;->subclauses:Ljava/util/List;

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v1, 0x0

    .line 33
    if-ne v0, v2, :cond_1

    .line 34
    .line 35
    iget-object v0, p0, Lorg/apache/tika/mime/MimeTypesReader$ClauseRecord;->subclauses:Ljava/util/List;

    .line 36
    .line 37
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Lorg/apache/tika/mime/Clause;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    new-instance v0, Lorg/apache/tika/mime/OrClause;

    .line 45
    .line 46
    iget-object v3, p0, Lorg/apache/tika/mime/MimeTypesReader$ClauseRecord;->subclauses:Ljava/util/List;

    .line 47
    .line 48
    invoke-direct {v0, v3}, Lorg/apache/tika/mime/OrClause;-><init>(Ljava/util/List;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    new-instance v3, Lorg/apache/tika/mime/AndClause;

    .line 52
    .line 53
    iget-object v4, p0, Lorg/apache/tika/mime/MimeTypesReader$ClauseRecord;->clause:Lorg/apache/tika/mime/Clause;

    .line 54
    .line 55
    const/4 v5, 0x2

    .line 56
    new-array v5, v5, [Lorg/apache/tika/mime/Clause;

    .line 57
    .line 58
    aput-object v4, v5, v1

    .line 59
    .line 60
    aput-object v0, v5, v2

    .line 61
    .line 62
    invoke-direct {v3, v5}, Lorg/apache/tika/mime/AndClause;-><init>([Lorg/apache/tika/mime/Clause;)V

    .line 63
    .line 64
    .line 65
    iput-object v3, p0, Lorg/apache/tika/mime/MimeTypesReader$ClauseRecord;->clause:Lorg/apache/tika/mime/Clause;

    .line 66
    .line 67
    :cond_2
    :goto_1
    iget-object v0, p0, Lorg/apache/tika/mime/MimeTypesReader$ClauseRecord;->parent:Lorg/apache/tika/mime/MimeTypesReader$ClauseRecord;

    .line 68
    .line 69
    iget-object v1, v0, Lorg/apache/tika/mime/MimeTypesReader$ClauseRecord;->subclauses:Ljava/util/List;

    .line 70
    .line 71
    if-nez v1, :cond_3

    .line 72
    .line 73
    iget-object v1, p0, Lorg/apache/tika/mime/MimeTypesReader$ClauseRecord;->clause:Lorg/apache/tika/mime/Clause;

    .line 74
    .line 75
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    iput-object v1, v0, Lorg/apache/tika/mime/MimeTypesReader$ClauseRecord;->subclauses:Ljava/util/List;

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-ne v0, v2, :cond_4

    .line 87
    .line 88
    iget-object v0, p0, Lorg/apache/tika/mime/MimeTypesReader$ClauseRecord;->parent:Lorg/apache/tika/mime/MimeTypesReader$ClauseRecord;

    .line 89
    .line 90
    new-instance v1, Ljava/util/ArrayList;

    .line 91
    .line 92
    iget-object v2, p0, Lorg/apache/tika/mime/MimeTypesReader$ClauseRecord;->parent:Lorg/apache/tika/mime/MimeTypesReader$ClauseRecord;

    .line 93
    .line 94
    iget-object v2, v2, Lorg/apache/tika/mime/MimeTypesReader$ClauseRecord;->subclauses:Ljava/util/List;

    .line 95
    .line 96
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 97
    .line 98
    .line 99
    iput-object v1, v0, Lorg/apache/tika/mime/MimeTypesReader$ClauseRecord;->subclauses:Ljava/util/List;

    .line 100
    .line 101
    :cond_4
    iget-object v0, p0, Lorg/apache/tika/mime/MimeTypesReader$ClauseRecord;->parent:Lorg/apache/tika/mime/MimeTypesReader$ClauseRecord;

    .line 102
    .line 103
    iget-object v0, v0, Lorg/apache/tika/mime/MimeTypesReader$ClauseRecord;->subclauses:Ljava/util/List;

    .line 104
    .line 105
    iget-object v1, p0, Lorg/apache/tika/mime/MimeTypesReader$ClauseRecord;->clause:Lorg/apache/tika/mime/Clause;

    .line 106
    .line 107
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    :goto_2
    iget-object v0, p0, Lorg/apache/tika/mime/MimeTypesReader$ClauseRecord;->this$0:Lorg/apache/tika/mime/MimeTypesReader;

    .line 111
    .line 112
    invoke-static {v0}, Lorg/apache/tika/mime/MimeTypesReader;->a(Lorg/apache/tika/mime/MimeTypesReader;)Lorg/apache/tika/mime/MimeTypesReader$ClauseRecord;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    iget-object v1, v1, Lorg/apache/tika/mime/MimeTypesReader$ClauseRecord;->parent:Lorg/apache/tika/mime/MimeTypesReader$ClauseRecord;

    .line 117
    .line 118
    invoke-static {v0, v1}, Lorg/apache/tika/mime/MimeTypesReader;->b(Lorg/apache/tika/mime/MimeTypesReader;Lorg/apache/tika/mime/MimeTypesReader$ClauseRecord;)V

    .line 119
    .line 120
    .line 121
    return-void
.end method

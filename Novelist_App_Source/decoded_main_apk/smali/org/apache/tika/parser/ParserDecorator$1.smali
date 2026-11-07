.class Lorg/apache/tika/parser/ParserDecorator$1;
.super Lorg/apache/tika/parser/ParserDecorator;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/tika/parser/ParserDecorator;->withTypes(Lorg/apache/tika/parser/Parser;Ljava/util/Set;)Lorg/apache/tika/parser/Parser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x65eedd70f8a2792bL


# instance fields
.field final synthetic val$types:Ljava/util/Set;


# direct methods
.method public constructor <init>(Lorg/apache/tika/parser/Parser;Ljava/util/Set;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lorg/apache/tika/parser/ParserDecorator$1;->val$types:Ljava/util/Set;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lorg/apache/tika/parser/ParserDecorator;-><init>(Lorg/apache/tika/parser/Parser;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getDecorationName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "With Types"

    .line 2
    .line 3
    return-object v0
.end method

.method public getSupportedTypes(Lorg/apache/tika/parser/ParseContext;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/tika/parser/ParseContext;",
            ")",
            "Ljava/util/Set<",
            "Lorg/apache/tika/mime/MediaType;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lorg/apache/tika/parser/ParserDecorator$1;->val$types:Ljava/util/Set;

    .line 2
    .line 3
    return-object p1
.end method

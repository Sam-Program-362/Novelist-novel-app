.class public Lorg/apache/tika/parser/multiple/SupplementingParser;
.super Lorg/apache/tika/parser/multiple/AbstractMultipleParser;
.source "SourceFile"


# static fields
.field public static final allowedPolicies:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/apache/tika/parser/multiple/AbstractMultipleParser$MetadataPolicy;",
            ">;"
        }
    .end annotation
.end field

.field private static final serialVersionUID:J = 0x458a2df6b63ae52L


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Lorg/apache/tika/parser/multiple/AbstractMultipleParser$MetadataPolicy;->FIRST_WINS:Lorg/apache/tika/parser/multiple/AbstractMultipleParser$MetadataPolicy;

    .line 2
    .line 3
    sget-object v1, Lorg/apache/tika/parser/multiple/AbstractMultipleParser$MetadataPolicy;->LAST_WINS:Lorg/apache/tika/parser/multiple/AbstractMultipleParser$MetadataPolicy;

    .line 4
    .line 5
    sget-object v2, Lorg/apache/tika/parser/multiple/AbstractMultipleParser$MetadataPolicy;->KEEP_ALL:Lorg/apache/tika/parser/multiple/AbstractMultipleParser$MetadataPolicy;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [Lorg/apache/tika/parser/multiple/AbstractMultipleParser$MetadataPolicy;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lorg/apache/tika/parser/multiple/SupplementingParser;->allowedPolicies:Ljava/util/List;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Lorg/apache/tika/mime/MediaTypeRegistry;Ljava/util/Collection;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/tika/mime/MediaTypeRegistry;",
            "Ljava/util/Collection<",
            "+",
            "Lorg/apache/tika/parser/Parser;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lorg/apache/tika/config/Param;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lorg/apache/tika/parser/multiple/AbstractMultipleParser;-><init>(Lorg/apache/tika/mime/MediaTypeRegistry;Ljava/util/Collection;Ljava/util/Map;)V

    return-void
.end method

.method public constructor <init>(Lorg/apache/tika/mime/MediaTypeRegistry;Lorg/apache/tika/parser/multiple/AbstractMultipleParser$MetadataPolicy;Ljava/util/Collection;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/tika/mime/MediaTypeRegistry;",
            "Lorg/apache/tika/parser/multiple/AbstractMultipleParser$MetadataPolicy;",
            "Ljava/util/Collection<",
            "+",
            "Lorg/apache/tika/parser/Parser;",
            ">;)V"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lorg/apache/tika/parser/multiple/AbstractMultipleParser;-><init>(Lorg/apache/tika/mime/MediaTypeRegistry;Lorg/apache/tika/parser/multiple/AbstractMultipleParser$MetadataPolicy;Ljava/util/Collection;)V

    .line 4
    sget-object p1, Lorg/apache/tika/parser/multiple/SupplementingParser;->allowedPolicies:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 5
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "Unsupported policy for SupplementingParser: "

    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public varargs constructor <init>(Lorg/apache/tika/mime/MediaTypeRegistry;Lorg/apache/tika/parser/multiple/AbstractMultipleParser$MetadataPolicy;[Lorg/apache/tika/parser/Parser;)V
    .locals 0

    .line 2
    invoke-static {p3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    invoke-direct {p0, p1, p2, p3}, Lorg/apache/tika/parser/multiple/SupplementingParser;-><init>(Lorg/apache/tika/mime/MediaTypeRegistry;Lorg/apache/tika/parser/multiple/AbstractMultipleParser$MetadataPolicy;Ljava/util/Collection;)V

    return-void
.end method


# virtual methods
.method public parserCompleted(Lorg/apache/tika/parser/Parser;Lorg/apache/tika/metadata/Metadata;Lorg/xml/sax/ContentHandler;Lorg/apache/tika/parser/ParseContext;Ljava/lang/Exception;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

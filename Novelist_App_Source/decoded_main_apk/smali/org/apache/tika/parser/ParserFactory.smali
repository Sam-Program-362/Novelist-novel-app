.class public abstract Lorg/apache/tika/parser/ParserFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final args:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/apache/tika/parser/ParserFactory;->args:Ljava/util/Map;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public abstract build()Lorg/apache/tika/parser/Parser;
.end method

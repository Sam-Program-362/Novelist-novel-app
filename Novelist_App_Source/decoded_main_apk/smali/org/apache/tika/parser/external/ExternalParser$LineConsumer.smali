.class public interface abstract Lorg/apache/tika/parser/external/ExternalParser$LineConsumer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/tika/parser/external/ExternalParser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "LineConsumer"
.end annotation


# static fields
.field public static final NULL:Lorg/apache/tika/parser/external/ExternalParser$LineConsumer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/tika/parser/external/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lorg/apache/tika/parser/external/ExternalParser$LineConsumer;->NULL:Lorg/apache/tika/parser/external/ExternalParser$LineConsumer;

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic h(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lorg/apache/tika/parser/external/ExternalParser$LineConsumer;->lambda$static$e2402a94$1(Ljava/lang/String;)V

    return-void
.end method

.method private static synthetic lambda$static$e2402a94$1(Ljava/lang/String;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public abstract consume(Ljava/lang/String;)V
.end method

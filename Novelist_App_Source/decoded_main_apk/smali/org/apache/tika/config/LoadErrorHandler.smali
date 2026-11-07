.class public interface abstract Lorg/apache/tika/config/LoadErrorHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final IGNORE:Lorg/apache/tika/config/LoadErrorHandler;

.field public static final THROW:Lorg/apache/tika/config/LoadErrorHandler;

.field public static final WARN:Lorg/apache/tika/config/LoadErrorHandler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/tika/config/LoadErrorHandler$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/apache/tika/config/LoadErrorHandler$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lorg/apache/tika/config/LoadErrorHandler;->IGNORE:Lorg/apache/tika/config/LoadErrorHandler;

    .line 7
    .line 8
    new-instance v0, Lorg/apache/tika/config/LoadErrorHandler$2;

    .line 9
    .line 10
    invoke-direct {v0}, Lorg/apache/tika/config/LoadErrorHandler$2;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lorg/apache/tika/config/LoadErrorHandler;->WARN:Lorg/apache/tika/config/LoadErrorHandler;

    .line 14
    .line 15
    new-instance v0, Lorg/apache/tika/config/LoadErrorHandler$3;

    .line 16
    .line 17
    invoke-direct {v0}, Lorg/apache/tika/config/LoadErrorHandler$3;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lorg/apache/tika/config/LoadErrorHandler;->THROW:Lorg/apache/tika/config/LoadErrorHandler;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public abstract handleLoadError(Ljava/lang/String;Ljava/lang/Throwable;)V
.end method

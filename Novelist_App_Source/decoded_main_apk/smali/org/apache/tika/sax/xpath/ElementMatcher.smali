.class public Lorg/apache/tika/sax/xpath/ElementMatcher;
.super Lorg/apache/tika/sax/xpath/Matcher;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lorg/apache/tika/sax/xpath/Matcher;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/tika/sax/xpath/ElementMatcher;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/apache/tika/sax/xpath/ElementMatcher;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lorg/apache/tika/sax/xpath/ElementMatcher;->INSTANCE:Lorg/apache/tika/sax/xpath/Matcher;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/apache/tika/sax/xpath/Matcher;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public matchesElement()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

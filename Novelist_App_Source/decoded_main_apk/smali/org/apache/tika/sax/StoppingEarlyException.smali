.class public Lorg/apache/tika/sax/StoppingEarlyException;
.super Lorg/xml/sax/SAXException;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lorg/apache/tika/sax/StoppingEarlyException;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/tika/sax/StoppingEarlyException;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/apache/tika/sax/StoppingEarlyException;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lorg/apache/tika/sax/StoppingEarlyException;->INSTANCE:Lorg/apache/tika/sax/StoppingEarlyException;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xml/sax/SAXException;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

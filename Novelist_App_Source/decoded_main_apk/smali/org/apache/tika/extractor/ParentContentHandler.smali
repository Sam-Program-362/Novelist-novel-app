.class public Lorg/apache/tika/extractor/ParentContentHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final contentHandler:Lorg/xml/sax/ContentHandler;


# direct methods
.method public constructor <init>(Lorg/xml/sax/ContentHandler;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/apache/tika/extractor/ParentContentHandler;->contentHandler:Lorg/xml/sax/ContentHandler;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getContentHandler()Lorg/xml/sax/ContentHandler;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/extractor/ParentContentHandler;->contentHandler:Lorg/xml/sax/ContentHandler;

    .line 2
    .line 3
    return-object v0
.end method

.class public interface abstract Lorg/apache/tika/sax/ContentHandlerFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# virtual methods
.method public abstract getNewContentHandler()Lorg/xml/sax/ContentHandler;
.end method

.method public abstract getNewContentHandler(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)Lorg/xml/sax/ContentHandler;
.end method

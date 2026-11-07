.class public interface abstract Lorg/apache/tika/extractor/EmbeddedDocumentBytesHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# virtual methods
.method public abstract add(ILorg/apache/tika/metadata/Metadata;Ljava/io/InputStream;)V
.end method

.method public abstract getIds()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

.class public interface abstract Lorg/apache/tika/pipes/fetcher/RangeFetcher;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/apache/tika/pipes/fetcher/Fetcher;


# virtual methods
.method public fetch(Ljava/lang/String;JJLorg/apache/tika/metadata/Metadata;)Ljava/io/InputStream;
    .locals 8

    .line 1
    new-instance v7, Lorg/apache/tika/parser/ParseContext;

    invoke-direct {v7}, Lorg/apache/tika/parser/ParseContext;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    move-object v6, p6

    invoke-interface/range {v0 .. v7}, Lorg/apache/tika/pipes/fetcher/RangeFetcher;->fetch(Ljava/lang/String;JJLorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method

.method public abstract fetch(Ljava/lang/String;JJLorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)Ljava/io/InputStream;
.end method

.class public final synthetic Lorg/apache/tika/utils/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/xml/sax/EntityResolver;


# virtual methods
.method public final resolveEntity(Ljava/lang/String;Ljava/lang/String;)Lorg/xml/sax/InputSource;
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lorg/apache/tika/utils/XMLReaderUtils;->a(Ljava/lang/String;Ljava/lang/String;)Lorg/xml/sax/InputSource;

    move-result-object p1

    return-object p1
.end method

.class public interface abstract Lorg/apache/tika/parser/DigestingParser$DigesterFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/tika/parser/DigestingParser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "DigesterFactory"
.end annotation


# virtual methods
.method public abstract build()Lorg/apache/tika/parser/DigestingParser$Digester;
.end method

.method public abstract isSkipContainerDocument()Z
.end method

.method public abstract setSkipContainerDocument(Z)V
.end method

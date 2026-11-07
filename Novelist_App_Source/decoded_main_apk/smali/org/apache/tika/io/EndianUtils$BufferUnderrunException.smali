.class public Lorg/apache/tika/io/EndianUtils$BufferUnderrunException;
.super Lorg/apache/tika/exception/TikaException;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/tika/io/EndianUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "BufferUnderrunException"
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x73fe9adcb3502674L


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "Insufficient data left in stream for required read"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lorg/apache/tika/exception/TikaException;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

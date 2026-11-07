.class public Lorg/apache/tika/metadata/XMPDM$ChannelTypePropertyConverter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/tika/metadata/XMPDM;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ChannelTypePropertyConverter"
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field private static final property:Lorg/apache/tika/metadata/Property;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/tika/metadata/XMPDM;->AUDIO_CHANNEL_TYPE:Lorg/apache/tika/metadata/Property;

    .line 2
    .line 3
    sput-object v0, Lorg/apache/tika/metadata/XMPDM$ChannelTypePropertyConverter;->property:Lorg/apache/tika/metadata/Property;

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static convert(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 1
    instance-of v0, p0, Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/String;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    instance-of v0, p0, Ljava/lang/Integer;

    .line 9
    .line 10
    if-eqz v0, :cond_4

    .line 11
    .line 12
    check-cast p0, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    const/4 v0, 0x1

    .line 19
    if-ne p0, v0, :cond_1

    .line 20
    .line 21
    const-string p0, "Mono"

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_1
    const/4 v0, 0x2

    .line 25
    if-ne p0, v0, :cond_2

    .line 26
    .line 27
    const-string p0, "Stereo"

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_2
    const/4 v0, 0x5

    .line 31
    if-ne p0, v0, :cond_3

    .line 32
    .line 33
    const-string p0, "5.1"

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_3
    const/4 v0, 0x7

    .line 37
    if-ne p0, v0, :cond_4

    .line 38
    .line 39
    const-string p0, "7.1"

    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_4
    const/4 p0, 0x0

    .line 43
    return-object p0
.end method

.method public static convertAndSet(Lorg/apache/tika/metadata/Metadata;Ljava/lang/Object;)V
    .locals 2

    .line 1
    instance-of v0, p1, Ljava/lang/Integer;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    instance-of v0, p1, Ljava/lang/Long;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    :cond_0
    sget-object v0, Lorg/apache/tika/metadata/XMPDM$ChannelTypePropertyConverter;->property:Lorg/apache/tika/metadata/Property;

    .line 10
    .line 11
    invoke-static {p1}, Lorg/apache/tika/metadata/XMPDM$ChannelTypePropertyConverter;->convert(Ljava/lang/Object;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p0, v0, v1}, Lorg/apache/tika/metadata/Metadata;->set(Lorg/apache/tika/metadata/Property;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :cond_1
    instance-of v0, p1, Ljava/util/Date;

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    sget-object v0, Lorg/apache/tika/metadata/XMPDM$ChannelTypePropertyConverter;->property:Lorg/apache/tika/metadata/Property;

    .line 23
    .line 24
    move-object v1, p1

    .line 25
    check-cast v1, Ljava/util/Date;

    .line 26
    .line 27
    invoke-virtual {p0, v0, v1}, Lorg/apache/tika/metadata/Metadata;->set(Lorg/apache/tika/metadata/Property;Ljava/util/Date;)V

    .line 28
    .line 29
    .line 30
    :cond_2
    instance-of v0, p1, Ljava/lang/String;

    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    sget-object v0, Lorg/apache/tika/metadata/XMPDM$ChannelTypePropertyConverter;->property:Lorg/apache/tika/metadata/Property;

    .line 35
    .line 36
    check-cast p1, Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {p0, v0, p1}, Lorg/apache/tika/metadata/Metadata;->set(Lorg/apache/tika/metadata/Property;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :cond_3
    return-void
.end method

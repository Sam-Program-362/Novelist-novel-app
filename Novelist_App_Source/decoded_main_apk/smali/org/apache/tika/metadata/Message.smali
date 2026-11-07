.class public interface abstract Lorg/apache/tika/metadata/Message;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final MESSAGE_BCC:Ljava/lang/String; = "Message-Bcc"

.field public static final MESSAGE_BCC_DISPLAY_NAME:Lorg/apache/tika/metadata/Property;

.field public static final MESSAGE_BCC_EMAIL:Lorg/apache/tika/metadata/Property;

.field public static final MESSAGE_BCC_NAME:Lorg/apache/tika/metadata/Property;

.field public static final MESSAGE_CC:Ljava/lang/String; = "Message-Cc"

.field public static final MESSAGE_CC_DISPLAY_NAME:Lorg/apache/tika/metadata/Property;

.field public static final MESSAGE_CC_EMAIL:Lorg/apache/tika/metadata/Property;

.field public static final MESSAGE_CC_NAME:Lorg/apache/tika/metadata/Property;

.field public static final MESSAGE_FROM:Ljava/lang/String; = "Message-From"

.field public static final MESSAGE_FROM_EMAIL:Lorg/apache/tika/metadata/Property;

.field public static final MESSAGE_FROM_NAME:Lorg/apache/tika/metadata/Property;

.field public static final MESSAGE_PREFIX:Ljava/lang/String; = "Message:"

.field public static final MESSAGE_RAW_HEADER_PREFIX:Ljava/lang/String; = "Message:Raw-Header:"

.field public static final MESSAGE_RECIPIENT_ADDRESS:Ljava/lang/String; = "Message-Recipient-Address"

.field public static final MESSAGE_TO:Ljava/lang/String; = "Message-To"

.field public static final MESSAGE_TO_DISPLAY_NAME:Lorg/apache/tika/metadata/Property;

.field public static final MESSAGE_TO_EMAIL:Lorg/apache/tika/metadata/Property;

.field public static final MESSAGE_TO_NAME:Lorg/apache/tika/metadata/Property;

.field public static final MULTIPART_BOUNDARY:Ljava/lang/String; = "Multipart-Boundary"

.field public static final MULTIPART_SUBTYPE:Ljava/lang/String; = "Multipart-Subtype"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "Message:From-Name"

    .line 2
    .line 3
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lorg/apache/tika/metadata/Message;->MESSAGE_FROM_NAME:Lorg/apache/tika/metadata/Property;

    .line 8
    .line 9
    const-string v0, "Message:From-Email"

    .line 10
    .line 11
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lorg/apache/tika/metadata/Message;->MESSAGE_FROM_EMAIL:Lorg/apache/tika/metadata/Property;

    .line 16
    .line 17
    const-string v0, "Message:To-Name"

    .line 18
    .line 19
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lorg/apache/tika/metadata/Message;->MESSAGE_TO_NAME:Lorg/apache/tika/metadata/Property;

    .line 24
    .line 25
    const-string v0, "Message:To-Display-Name"

    .line 26
    .line 27
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lorg/apache/tika/metadata/Message;->MESSAGE_TO_DISPLAY_NAME:Lorg/apache/tika/metadata/Property;

    .line 32
    .line 33
    const-string v0, "Message:To-Email"

    .line 34
    .line 35
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lorg/apache/tika/metadata/Message;->MESSAGE_TO_EMAIL:Lorg/apache/tika/metadata/Property;

    .line 40
    .line 41
    const-string v0, "Message:CC-Name"

    .line 42
    .line 43
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lorg/apache/tika/metadata/Message;->MESSAGE_CC_NAME:Lorg/apache/tika/metadata/Property;

    .line 48
    .line 49
    const-string v0, "Message:CC-Display-Name"

    .line 50
    .line 51
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, Lorg/apache/tika/metadata/Message;->MESSAGE_CC_DISPLAY_NAME:Lorg/apache/tika/metadata/Property;

    .line 56
    .line 57
    const-string v0, "Message:CC-Email"

    .line 58
    .line 59
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sput-object v0, Lorg/apache/tika/metadata/Message;->MESSAGE_CC_EMAIL:Lorg/apache/tika/metadata/Property;

    .line 64
    .line 65
    const-string v0, "Message:BCC-Name"

    .line 66
    .line 67
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    sput-object v0, Lorg/apache/tika/metadata/Message;->MESSAGE_BCC_NAME:Lorg/apache/tika/metadata/Property;

    .line 72
    .line 73
    const-string v0, "Message:BCC-Display-Name"

    .line 74
    .line 75
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    sput-object v0, Lorg/apache/tika/metadata/Message;->MESSAGE_BCC_DISPLAY_NAME:Lorg/apache/tika/metadata/Property;

    .line 80
    .line 81
    const-string v0, "Message:BCC-Email"

    .line 82
    .line 83
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    sput-object v0, Lorg/apache/tika/metadata/Message;->MESSAGE_BCC_EMAIL:Lorg/apache/tika/metadata/Property;

    .line 88
    .line 89
    return-void
.end method

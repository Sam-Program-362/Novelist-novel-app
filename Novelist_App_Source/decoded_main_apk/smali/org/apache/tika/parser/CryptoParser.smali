.class public abstract Lorg/apache/tika/parser/CryptoParser;
.super Lorg/apache/tika/parser/DelegatingParser;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = -0x30aee78d0744ed23L


# instance fields
.field private final provider:Ljava/security/Provider;

.field private final transformation:Ljava/lang/String;

.field private final types:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lorg/apache/tika/mime/MediaType;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/security/Provider;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/security/Provider;",
            "Ljava/util/Set<",
            "Lorg/apache/tika/mime/MediaType;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lorg/apache/tika/parser/DelegatingParser;-><init>()V

    .line 2
    iput-object p1, p0, Lorg/apache/tika/parser/CryptoParser;->transformation:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lorg/apache/tika/parser/CryptoParser;->provider:Ljava/security/Provider;

    .line 4
    iput-object p3, p0, Lorg/apache/tika/parser/CryptoParser;->types:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Lorg/apache/tika/mime/MediaType;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, p1, v0, p2}, Lorg/apache/tika/parser/CryptoParser;-><init>(Ljava/lang/String;Ljava/security/Provider;Ljava/util/Set;)V

    return-void
.end method


# virtual methods
.method public getSupportedTypes(Lorg/apache/tika/parser/ParseContext;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/tika/parser/ParseContext;",
            ")",
            "Ljava/util/Set<",
            "Lorg/apache/tika/mime/MediaType;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lorg/apache/tika/parser/CryptoParser;->types:Ljava/util/Set;

    .line 2
    .line 3
    return-object p1
.end method

.method public parse(Ljava/io/InputStream;Lorg/xml/sax/ContentHandler;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)V
    .locals 5

    .line 1
    :try_start_0
    iget-object v0, p0, Lorg/apache/tika/parser/CryptoParser;->provider:Ljava/security/Provider;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lorg/apache/tika/parser/CryptoParser;->transformation:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v1, v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/Cipher;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :catch_0
    move-exception p1

    .line 13
    goto :goto_2

    .line 14
    :cond_0
    iget-object v0, p0, Lorg/apache/tika/parser/CryptoParser;->transformation:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :goto_0
    const-class v1, Ljava/security/Key;

    .line 21
    .line 22
    invoke-virtual {p4, v1}, Lorg/apache/tika/parser/ParseContext;->get(Ljava/lang/Class;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ljava/security/Key;

    .line 27
    .line 28
    if-eqz v1, :cond_4

    .line 29
    .line 30
    const-class v2, Ljava/security/AlgorithmParameters;

    .line 31
    .line 32
    invoke-virtual {p4, v2}, Lorg/apache/tika/parser/ParseContext;->get(Ljava/lang/Class;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Ljava/security/AlgorithmParameters;

    .line 37
    .line 38
    const-class v3, Ljava/security/SecureRandom;

    .line 39
    .line 40
    invoke-virtual {p4, v3}, Lorg/apache/tika/parser/ParseContext;->get(Ljava/lang/Class;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, Ljava/security/SecureRandom;

    .line 45
    .line 46
    const/4 v4, 0x2

    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    if-eqz v3, :cond_1

    .line 50
    .line 51
    invoke-virtual {v0, v4, v1, v2, v3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/AlgorithmParameters;Ljava/security/SecureRandom;)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    if-eqz v2, :cond_2

    .line 56
    .line 57
    invoke-virtual {v0, v4, v1, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/AlgorithmParameters;)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    if-eqz v3, :cond_3

    .line 62
    .line 63
    invoke-virtual {v0, v4, v1, v3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/SecureRandom;)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    invoke-virtual {v0, v4, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    .line 68
    .line 69
    .line 70
    :goto_1
    new-instance v1, Ljavax/crypto/CipherInputStream;

    .line 71
    .line 72
    invoke-direct {v1, p1, v0}, Ljavax/crypto/CipherInputStream;-><init>(Ljava/io/InputStream;Ljavax/crypto/Cipher;)V

    .line 73
    .line 74
    .line 75
    invoke-super {p0, v1, p2, p3, p4}, Lorg/apache/tika/parser/DelegatingParser;->parse(Ljava/io/InputStream;Lorg/xml/sax/ContentHandler;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_4
    new-instance p1, Lorg/apache/tika/exception/EncryptedDocumentException;

    .line 80
    .line 81
    const-string p2, "No decryption key provided"

    .line 82
    .line 83
    invoke-direct {p1, p2}, Lorg/apache/tika/exception/EncryptedDocumentException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p1
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    :goto_2
    new-instance p2, Lorg/apache/tika/exception/TikaException;

    .line 88
    .line 89
    const-string p3, "Unable to decrypt document stream"

    .line 90
    .line 91
    invoke-direct {p2, p3, p1}, Lorg/apache/tika/exception/TikaException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    throw p2
.end method

.class Lorg/apache/tika/parser/NetworkParser$ParsingTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/tika/parser/NetworkParser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ParsingTask"
.end annotation


# instance fields
.field private volatile exception:Ljava/lang/Exception;

.field private final input:Lorg/apache/tika/io/TikaInputStream;

.field private final output:Ljava/io/OutputStream;


# direct methods
.method public constructor <init>(Lorg/apache/tika/io/TikaInputStream;Ljava/io/OutputStream;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lorg/apache/tika/parser/NetworkParser$ParsingTask;->exception:Ljava/lang/Exception;

    .line 6
    .line 7
    iput-object p1, p0, Lorg/apache/tika/parser/NetworkParser$ParsingTask;->input:Lorg/apache/tika/io/TikaInputStream;

    .line 8
    .line 9
    iput-object p2, p0, Lorg/apache/tika/parser/NetworkParser$ParsingTask;->output:Ljava/io/OutputStream;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public parse(Ljava/io/InputStream;Lorg/xml/sax/ContentHandler;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)V
    .locals 8

    .line 1
    const-string v0, "Network parser interrupted"

    .line 2
    .line 3
    const-string v1, "Unexpected network parser error"

    .line 4
    .line 5
    new-instance v2, Ljava/lang/Thread;

    .line 6
    .line 7
    const-string v3, "Tika network parser"

    .line 8
    .line 9
    invoke-direct {v2, p0, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 13
    .line 14
    .line 15
    new-instance v3, Lorg/apache/tika/sax/TaggedContentHandler;

    .line 16
    .line 17
    invoke-direct {v3, p2}, Lorg/apache/tika/sax/TaggedContentHandler;-><init>(Lorg/xml/sax/ContentHandler;)V

    .line 18
    .line 19
    .line 20
    const-wide/16 v4, 0x3e8

    .line 21
    .line 22
    :try_start_0
    new-instance p2, Lorg/apache/tika/sax/TeeContentHandler;

    .line 23
    .line 24
    new-instance v6, Lorg/apache/tika/parser/NetworkParser$MetaHandler;

    .line 25
    .line 26
    invoke-direct {v6, p3}, Lorg/apache/tika/parser/NetworkParser$MetaHandler;-><init>(Lorg/apache/tika/metadata/Metadata;)V

    .line 27
    .line 28
    .line 29
    const/4 p3, 0x2

    .line 30
    new-array p3, p3, [Lorg/xml/sax/ContentHandler;

    .line 31
    .line 32
    const/4 v7, 0x0

    .line 33
    aput-object v3, p3, v7

    .line 34
    .line 35
    const/4 v7, 0x1

    .line 36
    aput-object v6, p3, v7

    .line 37
    .line 38
    invoke-direct {p2, p3}, Lorg/apache/tika/sax/TeeContentHandler;-><init>([Lorg/xml/sax/ContentHandler;)V

    .line 39
    .line 40
    .line 41
    invoke-static {p1, p2, p4}, Lorg/apache/tika/utils/XMLReaderUtils;->parseSAX(Ljava/io/InputStream;Lorg/xml/sax/ContentHandler;Lorg/apache/tika/parser/ParseContext;)V
    :try_end_0
    .catch Lorg/xml/sax/SAXException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    :try_start_1
    invoke-virtual {v2, v4, v5}, Ljava/lang/Thread;->join(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lorg/apache/tika/parser/NetworkParser$ParsingTask;->exception:Ljava/lang/Exception;

    .line 48
    .line 49
    if-nez p1, :cond_0

    .line 50
    .line 51
    return-void

    .line 52
    :cond_0
    iget-object p1, p0, Lorg/apache/tika/parser/NetworkParser$ParsingTask;->input:Lorg/apache/tika/io/TikaInputStream;

    .line 53
    .line 54
    iget-object p2, p0, Lorg/apache/tika/parser/NetworkParser$ParsingTask;->exception:Ljava/lang/Exception;

    .line 55
    .line 56
    invoke-virtual {p1, p2}, Lw2/d;->throwIfCauseOf(Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    new-instance p1, Lorg/apache/tika/exception/TikaException;

    .line 60
    .line 61
    iget-object p2, p0, Lorg/apache/tika/parser/NetworkParser$ParsingTask;->exception:Ljava/lang/Exception;

    .line 62
    .line 63
    invoke-direct {p1, v1, p2}, Lorg/apache/tika/exception/TikaException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    throw p1

    .line 67
    :catch_0
    move-exception p1

    .line 68
    new-instance p2, Lorg/apache/tika/exception/TikaException;

    .line 69
    .line 70
    invoke-direct {p2, v0, p1}, Lorg/apache/tika/exception/TikaException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    throw p2

    .line 74
    :catchall_0
    move-exception p1

    .line 75
    goto :goto_2

    .line 76
    :catch_1
    move-exception p1

    .line 77
    goto :goto_0

    .line 78
    :catch_2
    move-exception p1

    .line 79
    goto :goto_1

    .line 80
    :goto_0
    :try_start_2
    new-instance p2, Lorg/apache/tika/exception/TikaException;

    .line 81
    .line 82
    const-string p3, "Unable to read network parser output"

    .line 83
    .line 84
    invoke-direct {p2, p3, p1}, Lorg/apache/tika/exception/TikaException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 85
    .line 86
    .line 87
    throw p2

    .line 88
    :goto_1
    invoke-virtual {v3, p1}, Lorg/apache/tika/sax/TaggedContentHandler;->throwIfCauseOf(Ljava/lang/Exception;)V

    .line 89
    .line 90
    .line 91
    new-instance p2, Lorg/apache/tika/exception/TikaException;

    .line 92
    .line 93
    const-string p3, "Invalid network parser output"

    .line 94
    .line 95
    invoke-direct {p2, p3, p1}, Lorg/apache/tika/exception/TikaException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 96
    .line 97
    .line 98
    throw p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 99
    :goto_2
    :try_start_3
    invoke-virtual {v2, v4, v5}, Ljava/lang/Thread;->join(J)V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_3

    .line 100
    .line 101
    .line 102
    iget-object p2, p0, Lorg/apache/tika/parser/NetworkParser$ParsingTask;->exception:Ljava/lang/Exception;

    .line 103
    .line 104
    if-eqz p2, :cond_1

    .line 105
    .line 106
    iget-object p1, p0, Lorg/apache/tika/parser/NetworkParser$ParsingTask;->input:Lorg/apache/tika/io/TikaInputStream;

    .line 107
    .line 108
    iget-object p2, p0, Lorg/apache/tika/parser/NetworkParser$ParsingTask;->exception:Ljava/lang/Exception;

    .line 109
    .line 110
    invoke-virtual {p1, p2}, Lw2/d;->throwIfCauseOf(Ljava/lang/Throwable;)V

    .line 111
    .line 112
    .line 113
    new-instance p1, Lorg/apache/tika/exception/TikaException;

    .line 114
    .line 115
    iget-object p2, p0, Lorg/apache/tika/parser/NetworkParser$ParsingTask;->exception:Ljava/lang/Exception;

    .line 116
    .line 117
    invoke-direct {p1, v1, p2}, Lorg/apache/tika/exception/TikaException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 118
    .line 119
    .line 120
    throw p1

    .line 121
    :cond_1
    throw p1

    .line 122
    :catch_3
    move-exception p1

    .line 123
    new-instance p2, Lorg/apache/tika/exception/TikaException;

    .line 124
    .line 125
    invoke-direct {p2, v0, p1}, Lorg/apache/tika/exception/TikaException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 126
    .line 127
    .line 128
    throw p2
.end method

.method public run()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lorg/apache/tika/parser/NetworkParser$ParsingTask;->input:Lorg/apache/tika/io/TikaInputStream;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/apache/tika/parser/NetworkParser$ParsingTask;->output:Ljava/io/OutputStream;

    .line 4
    .line 5
    invoke-static {v0, v1}, Ls2/c;->b(Ljava/io/InputStream;Ljava/io/OutputStream;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    :try_start_1
    iget-object v0, p0, Lorg/apache/tika/parser/NetworkParser$ParsingTask;->output:Ljava/io/OutputStream;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :catch_0
    move-exception v0

    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    iget-object v1, p0, Lorg/apache/tika/parser/NetworkParser$ParsingTask;->output:Ljava/io/OutputStream;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 20
    .line 21
    .line 22
    throw v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 23
    :goto_0
    iput-object v0, p0, Lorg/apache/tika/parser/NetworkParser$ParsingTask;->exception:Ljava/lang/Exception;

    .line 24
    .line 25
    return-void
.end method

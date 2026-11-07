.class public Lorg/apache/tika/parser/external/ExternalParser;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/apache/tika/parser/Parser;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/tika/parser/external/ExternalParser$LineConsumer;
    }
.end annotation


# static fields
.field public static final INPUT_FILE_TOKEN:Ljava/lang/String; = "${INPUT}"

.field private static final LOG:LF2/b;

.field public static final OUTPUT_FILE_TOKEN:Ljava/lang/String; = "${OUTPUT}"

.field private static final serialVersionUID:J = -0xef9d6197a8f5e3dL


# instance fields
.field private command:[Ljava/lang/String;

.field private ignoredLineConsumer:Lorg/apache/tika/parser/external/ExternalParser$LineConsumer;

.field private metadataPatterns:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/util/regex/Pattern;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private supportedTypes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lorg/apache/tika/mime/MediaType;",
            ">;"
        }
    .end annotation
.end field

.field private final timeoutMs:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lorg/apache/tika/parser/external/ExternalParser;

    .line 2
    .line 3
    invoke-static {v0}, LF2/d;->b(Ljava/lang/Class;)LF2/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lorg/apache/tika/parser/external/ExternalParser;->LOG:LF2/b;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/32 v0, 0xea60

    .line 5
    .line 6
    .line 7
    iput-wide v0, p0, Lorg/apache/tika/parser/external/ExternalParser;->timeoutMs:J

    .line 8
    .line 9
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 10
    .line 11
    iput-object v0, p0, Lorg/apache/tika/parser/external/ExternalParser;->supportedTypes:Ljava/util/Set;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Lorg/apache/tika/parser/external/ExternalParser;->metadataPatterns:Ljava/util/Map;

    .line 15
    .line 16
    const-string v0, "cat"

    .line 17
    .line 18
    filled-new-array {v0}, [Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Lorg/apache/tika/parser/external/ExternalParser;->command:[Ljava/lang/String;

    .line 23
    .line 24
    sget-object v0, Lorg/apache/tika/parser/external/ExternalParser$LineConsumer;->NULL:Lorg/apache/tika/parser/external/ExternalParser$LineConsumer;

    .line 25
    .line 26
    iput-object v0, p0, Lorg/apache/tika/parser/external/ExternalParser;->ignoredLineConsumer:Lorg/apache/tika/parser/external/ExternalParser$LineConsumer;

    .line 27
    .line 28
    return-void
.end method

.method public static synthetic a(Ljava/io/InputStream;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lorg/apache/tika/parser/external/ExternalParser;->lambda$ignoreStream$0(Ljava/io/InputStream;)V

    return-void
.end method

.method public static synthetic b(Ljava/lang/Process;Ljava/io/InputStream;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lorg/apache/tika/parser/external/ExternalParser;->lambda$sendInput$1(Ljava/lang/Process;Ljava/io/InputStream;)V

    return-void
.end method

.method public static synthetic c(Lorg/apache/tika/parser/external/ExternalParser;Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lorg/apache/tika/parser/external/ExternalParser;->lambda$extractMetadata$2(Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;)V

    return-void
.end method

.method public static varargs check(Ljava/lang/String;[I)Z
    .locals 0

    .line 1
    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, p1}, Lorg/apache/tika/parser/external/ExternalParser;->check([Ljava/lang/String;[I)Z

    move-result p0

    return p0
.end method

.method public static varargs check([Ljava/lang/String;[I)Z
    .locals 8

    .line 2
    array-length v0, p1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    .line 3
    new-array p1, v1, [I

    const/16 v0, 0x7f

    aput v0, p1, v2

    :cond_0
    const/4 v0, 0x0

    .line 4
    :try_start_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v3

    invoke-virtual {v3, p0}, Ljava/lang/Runtime;->exec([Ljava/lang/String;)Ljava/lang/Process;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Process;->getErrorStream()Ljava/io/InputStream;

    move-result-object v3

    invoke-static {v3, v2}, Lorg/apache/tika/parser/external/ExternalParser;->ignoreStream(Ljava/io/InputStream;Z)Ljava/lang/Thread;

    move-result-object v3

    .line 6
    invoke-virtual {v0}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v4

    invoke-static {v4, v2}, Lorg/apache/tika/parser/external/ExternalParser;->ignoreStream(Ljava/io/InputStream;Z)Ljava/lang/Thread;

    move-result-object v4

    .line 7
    invoke-virtual {v3}, Ljava/lang/Thread;->join()V

    .line 8
    invoke-virtual {v4}, Ljava/lang/Thread;->join()V

    .line 9
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v0}, Lorg/apache/tika/fork/a;->w(Ljava/lang/Process;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 10
    invoke-virtual {v0}, Ljava/lang/Process;->exitValue()I

    move-result v3

    .line 11
    sget-object v4, Lorg/apache/tika/parser/external/ExternalParser;->LOG:LF2/b;

    const-string v5, "exit value for {}: {}"

    aget-object v6, p0, v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v4, v6, v7, v5}, LF2/b;->w(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    array-length v4, p1

    move v5, v2

    :goto_0
    if-ge v5, v4, :cond_2

    aget v6, p1, v5
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v3, v6, :cond_1

    .line 13
    invoke-static {v0}, Lorg/apache/tika/fork/a;->r(Ljava/lang/Process;)V

    return v2

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :catchall_0
    move-exception p0

    goto/16 :goto_6

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p0

    goto :goto_3

    :catch_2
    move-exception p1

    goto :goto_4

    :catch_3
    move-exception p1

    goto :goto_4

    :catch_4
    move-exception p1

    goto :goto_4

    :cond_2
    invoke-static {v0}, Lorg/apache/tika/fork/a;->r(Ljava/lang/Process;)V

    return v1

    .line 14
    :cond_3
    :try_start_1
    new-instance p1, Ljava/util/concurrent/TimeoutException;

    invoke-direct {p1}, Ljava/util/concurrent/TimeoutException;-><init>()V

    throw p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    :goto_1
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v3, "posix_spawn"

    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 16
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v3, "UNIXProcess"

    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 17
    :cond_4
    sget-object v1, Lorg/apache/tika/parser/external/ExternalParser;->LOG:LF2/b;

    aget-object p0, p0, v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "(TIKA-1526): exception trying to run: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v1, p0, p1}, LF2/b;->i(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v0, :cond_6

    .line 18
    :goto_2
    invoke-static {v0}, Lorg/apache/tika/fork/a;->r(Ljava/lang/Process;)V

    goto :goto_5

    .line 19
    :cond_5
    :try_start_3
    throw p1

    .line 20
    :goto_3
    throw p0

    .line 21
    :goto_4
    sget-object v1, Lorg/apache/tika/parser/external/ExternalParser;->LOG:LF2/b;

    aget-object p0, p0, v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "exception trying to run  "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v1, p0, p1}, LF2/b;->i(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v0, :cond_6

    goto :goto_2

    :cond_6
    :goto_5
    return v2

    :goto_6
    if-eqz v0, :cond_7

    .line 22
    invoke-static {v0}, Lorg/apache/tika/fork/a;->r(Ljava/lang/Process;)V

    .line 23
    :cond_7
    throw p0
.end method

.method private extractMetadata(Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/Thread;

    .line 2
    .line 3
    new-instance v1, LM1/b0;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-direct {v1, p0, p1, p2, v2}, LM1/b0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 13
    .line 14
    .line 15
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Thread;->join()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    :catch_0
    return-void
.end method

.method private extractOutput(Ljava/io/InputStream;Lorg/apache/tika/sax/XHTMLContentHandler;)V
    .locals 4

    .line 1
    const-string v0, "p"

    .line 2
    .line 3
    new-instance v1, Ljava/io/InputStreamReader;

    .line 4
    .line 5
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 6
    .line 7
    invoke-direct {v1, p1, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 8
    .line 9
    .line 10
    :try_start_0
    invoke-virtual {p2}, Lorg/apache/tika/sax/XHTMLContentHandler;->startDocument()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2, v0}, Lorg/apache/tika/sax/XHTMLContentHandler;->startElement(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/16 p1, 0x400

    .line 17
    .line 18
    new-array p1, p1, [C

    .line 19
    .line 20
    :goto_0
    invoke-virtual {v1, p1}, Ljava/io/Reader;->read([C)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v3, -0x1

    .line 25
    if-eq v2, v3, :cond_0

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-virtual {p2, p1, v3, v2}, Lorg/apache/tika/sax/XHTMLContentHandler;->characters([CII)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    invoke-virtual {p2, v0}, Lorg/apache/tika/sax/XHTMLContentHandler;->endElement(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2}, Lorg/apache/tika/sax/XHTMLContentHandler;->endDocument()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/io/Reader;->close()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :goto_1
    :try_start_1
    invoke-virtual {v1}, Ljava/io/Reader;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :catchall_1
    move-exception p2

    .line 49
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    :goto_2
    throw p1
.end method

.method private static ignoreStream(Ljava/io/InputStream;Z)Ljava/lang/Thread;
    .locals 3

    .line 2
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, LM1/b;

    const/16 v2, 0xa

    invoke-direct {v1, p0, v2}, LM1/b;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 3
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    if-eqz p1, :cond_0

    .line 4
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Thread;->join()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-object v0
.end method

.method private static ignoreStream(Ljava/io/InputStream;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-static {p0, v0}, Lorg/apache/tika/parser/external/ExternalParser;->ignoreStream(Ljava/io/InputStream;Z)Ljava/lang/Thread;

    return-void
.end method

.method private lambda$extractMetadata$2(Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;)V
    .locals 8

    .line 1
    new-instance v0, Ljava/io/BufferedReader;

    .line 2
    .line 3
    new-instance v1, Ljava/io/InputStreamReader;

    .line 4
    .line 5
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 6
    .line 7
    invoke-direct {v1, p1, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    :goto_0
    :try_start_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz v1, :cond_4

    .line 18
    .line 19
    iget-object v2, p0, Lorg/apache/tika/parser/external/ExternalParser;->metadataPatterns:Ljava/util/Map;

    .line 20
    .line 21
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const/4 v3, 0x0

    .line 30
    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-eqz v4, :cond_3

    .line 35
    .line 36
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    check-cast v4, Ljava/util/Map$Entry;

    .line 41
    .line 42
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    check-cast v5, Ljava/util/regex/Pattern;

    .line 47
    .line 48
    invoke-virtual {v5, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->find()Z

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    if-eqz v6, :cond_1

    .line 57
    .line 58
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    const/4 v6, 0x1

    .line 63
    if-eqz v3, :cond_2

    .line 64
    .line 65
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    check-cast v3, Ljava/lang/String;

    .line 70
    .line 71
    const-string v7, ""

    .line 72
    .line 73
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-nez v3, :cond_2

    .line 78
    .line 79
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    check-cast v3, Ljava/lang/String;

    .line 84
    .line 85
    invoke-virtual {v5, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-virtual {p2, v3, v4}, Lorg/apache/tika/metadata/Metadata;->add(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :catchall_0
    move-exception p2

    .line 94
    goto :goto_3

    .line 95
    :cond_2
    invoke-virtual {v5, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    const/4 v4, 0x2

    .line 100
    invoke-virtual {v5, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    invoke-virtual {p2, v3, v4}, Lorg/apache/tika/metadata/Metadata;->add(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    :goto_2
    move v3, v6

    .line 108
    goto :goto_1

    .line 109
    :cond_3
    if-nez v3, :cond_0

    .line 110
    .line 111
    iget-object v2, p0, Lorg/apache/tika/parser/external/ExternalParser;->ignoredLineConsumer:Lorg/apache/tika/parser/external/ExternalParser$LineConsumer;

    .line 112
    .line 113
    invoke-interface {v2, v1}, Lorg/apache/tika/parser/external/ExternalParser$LineConsumer;->consume(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 114
    .line 115
    .line 116
    goto :goto_0

    .line 117
    :catch_0
    :cond_4
    invoke-static {v0}, Ls2/c;->a(Ljava/io/Closeable;)V

    .line 118
    .line 119
    .line 120
    invoke-static {p1}, Ls2/c;->a(Ljava/io/Closeable;)V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :goto_3
    invoke-static {v0}, Ls2/c;->a(Ljava/io/Closeable;)V

    .line 125
    .line 126
    .line 127
    invoke-static {p1}, Ls2/c;->a(Ljava/io/Closeable;)V

    .line 128
    .line 129
    .line 130
    throw p2
.end method

.method private static lambda$ignoreStream$0(Ljava/io/InputStream;)V
    .locals 1

    .line 1
    :try_start_0
    sget-object v0, Lx2/a;->k:Lx2/a;

    .line 2
    .line 3
    invoke-static {p0, v0}, Ls2/c;->b(Ljava/io/InputStream;Ljava/io/OutputStream;)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Ls2/c;->a(Ljava/io/Closeable;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    invoke-static {p0}, Ls2/c;->a(Ljava/io/Closeable;)V

    .line 12
    .line 13
    .line 14
    throw v0

    .line 15
    :catch_0
    invoke-static {p0}, Ls2/c;->a(Ljava/io/Closeable;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method private static synthetic lambda$sendInput$1(Ljava/lang/Process;Ljava/io/InputStream;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Process;->getOutputStream()Ljava/io/OutputStream;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :try_start_0
    invoke-static {p1, p0}, Ls2/c;->b(Ljava/io/InputStream;Ljava/io/OutputStream;)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    :catch_0
    return-void
.end method

.method private parse(Lorg/apache/tika/io/TikaInputStream;Lorg/apache/tika/sax/XHTMLContentHandler;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/io/TemporaryResources;)V
    .locals 11

    .line 6
    iget-object v0, p0, Lorg/apache/tika/parser/external/ExternalParser;->metadataPatterns:Ljava/util/Map;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    .line 7
    :goto_0
    iget-object v3, p0, Lorg/apache/tika/parser/external/ExternalParser;->command:[Ljava/lang/String;

    array-length v4, v3

    if-ne v4, v2, :cond_1

    .line 8
    aget-object v3, v3, v1

    const-string v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    .line 9
    :cond_1
    array-length v4, v3

    new-array v4, v4, [Ljava/lang/String;

    .line 10
    array-length v5, v3

    invoke-static {v3, v1, v4, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v3, v4

    :goto_1
    const/4 v4, 0x0

    move v5, v1

    move v6, v2

    move v7, v6

    move-object v8, v4

    .line 11
    :goto_2
    array-length v9, v3

    if-ge v5, v9, :cond_4

    .line 12
    aget-object v9, v3, v5

    const-string v10, "${INPUT}"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_2

    .line 13
    aget-object v6, v3, v5

    invoke-virtual {p1}, Lorg/apache/tika/io/TikaInputStream;->getFile()Ljava/io/File;

    move-result-object v9

    invoke-virtual {v9}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v10, v9}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v3, v5

    move v6, v1

    .line 14
    :cond_2
    aget-object v9, v3, v5

    const-string v10, "${OUTPUT}"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_3

    .line 15
    invoke-virtual {p4}, Lorg/apache/tika/io/TemporaryResources;->createTemporaryFile()Ljava/io/File;

    move-result-object v8

    .line 16
    aget-object v7, v3, v5

    invoke-virtual {v8}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v10, v9}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v3, v5

    move v7, v1

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 17
    :cond_4
    :try_start_0
    array-length p4, v3

    if-ne p4, v2, :cond_5

    .line 18
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object p4

    aget-object v1, v3, v1

    invoke-virtual {p4, v1}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    move-result-object p4

    :goto_3
    move-object v4, p4

    goto :goto_5

    :catch_0
    move-exception p4

    goto :goto_4

    .line 19
    :cond_5
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object p4

    invoke-virtual {p4, v3}, Ljava/lang/Runtime;->exec([Ljava/lang/String;)Ljava/lang/Process;

    move-result-object p4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    .line 20
    :goto_4
    sget-object v1, Lorg/apache/tika/parser/external/ExternalParser;->LOG:LF2/b;

    const-string v2, "problem with process exec"

    invoke-interface {v1, v2, p4}, LF2/b;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_5
    if-eqz v6, :cond_6

    .line 21
    :try_start_1
    invoke-direct {p0, v4, p1}, Lorg/apache/tika/parser/external/ExternalParser;->sendInput(Ljava/lang/Process;Ljava/io/InputStream;)V

    goto :goto_6

    :catchall_0
    move-exception p1

    goto :goto_a

    .line 22
    :cond_6
    invoke-virtual {v4}, Ljava/lang/Process;->getOutputStream()Ljava/io/OutputStream;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V

    .line 23
    :goto_6
    invoke-virtual {v4}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object p1

    .line 24
    invoke-virtual {v4}, Ljava/lang/Process;->getErrorStream()Ljava/io/InputStream;

    move-result-object p4

    if-eqz v0, :cond_8

    .line 25
    invoke-direct {p0, p4, p3}, Lorg/apache/tika/parser/external/ExternalParser;->extractMetadata(Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;)V

    if-eqz v7, :cond_7

    .line 26
    invoke-direct {p0, p1, p2}, Lorg/apache/tika/parser/external/ExternalParser;->extractOutput(Ljava/io/InputStream;Lorg/apache/tika/sax/XHTMLContentHandler;)V

    goto :goto_7

    .line 27
    :cond_7
    invoke-direct {p0, p1, p3}, Lorg/apache/tika/parser/external/ExternalParser;->extractMetadata(Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;)V

    goto :goto_7

    .line 28
    :cond_8
    invoke-static {p4}, Lorg/apache/tika/parser/external/ExternalParser;->ignoreStream(Ljava/io/InputStream;)V

    if-eqz v7, :cond_9

    .line 29
    invoke-direct {p0, p1, p2}, Lorg/apache/tika/parser/external/ExternalParser;->extractOutput(Ljava/io/InputStream;Lorg/apache/tika/sax/XHTMLContentHandler;)V

    goto :goto_7

    .line 30
    :cond_9
    invoke-static {p1}, Lorg/apache/tika/parser/external/ExternalParser;->ignoreStream(Ljava/io/InputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    :goto_7
    :try_start_2
    invoke-virtual {v4}, Ljava/lang/Process;->waitFor()I
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    if-nez v7, :cond_a

    .line 32
    new-instance p1, Ljava/io/FileInputStream;

    invoke-direct {p1, v8}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 33
    :try_start_3
    invoke-direct {p0, p1, p2}, Lorg/apache/tika/parser/external/ExternalParser;->extractOutput(Ljava/io/InputStream;Lorg/apache/tika/sax/XHTMLContentHandler;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 34
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V

    goto :goto_9

    :catchall_1
    move-exception p2

    .line 35
    :try_start_4
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_8

    :catchall_2
    move-exception p1

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_8
    throw p2

    :cond_a
    :goto_9
    return-void

    .line 36
    :goto_a
    :try_start_5
    invoke-virtual {v4}, Ljava/lang/Process;->waitFor()I
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_2

    .line 37
    :catch_2
    throw p1
.end method

.method private sendInput(Ljava/lang/Process;Ljava/io/InputStream;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/Thread;

    .line 2
    .line 3
    new-instance v1, LM/c;

    .line 4
    .line 5
    const/16 v2, 0x11

    .line 6
    .line 7
    invoke-direct {v1, p1, p2, v2}, LM/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 14
    .line 15
    .line 16
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Thread;->join()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    :catch_0
    return-void
.end method


# virtual methods
.method public getCommand()[Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/parser/external/ExternalParser;->command:[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getIgnoredLineConsumer()Lorg/apache/tika/parser/external/ExternalParser$LineConsumer;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/parser/external/ExternalParser;->ignoredLineConsumer:Lorg/apache/tika/parser/external/ExternalParser$LineConsumer;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMetadataExtractionPatterns()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/util/regex/Pattern;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/apache/tika/parser/external/ExternalParser;->metadataPatterns:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSupportedTypes()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lorg/apache/tika/mime/MediaType;",
            ">;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lorg/apache/tika/parser/external/ExternalParser;->supportedTypes:Ljava/util/Set;

    return-object v0
.end method

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
    invoke-virtual {p0}, Lorg/apache/tika/parser/external/ExternalParser;->getSupportedTypes()Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public parse(Ljava/io/InputStream;Lorg/xml/sax/ContentHandler;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)V
    .locals 0

    .line 1
    new-instance p4, Lorg/apache/tika/sax/XHTMLContentHandler;

    invoke-direct {p4, p2, p3}, Lorg/apache/tika/sax/XHTMLContentHandler;-><init>(Lorg/xml/sax/ContentHandler;Lorg/apache/tika/metadata/Metadata;)V

    .line 2
    new-instance p2, Lorg/apache/tika/io/TemporaryResources;

    invoke-direct {p2}, Lorg/apache/tika/io/TemporaryResources;-><init>()V

    .line 3
    :try_start_0
    invoke-static {p1, p2, p3}, Lorg/apache/tika/io/TikaInputStream;->get(Ljava/io/InputStream;Lorg/apache/tika/io/TemporaryResources;Lorg/apache/tika/metadata/Metadata;)Lorg/apache/tika/io/TikaInputStream;

    move-result-object p1

    invoke-direct {p0, p1, p4, p3, p2}, Lorg/apache/tika/parser/external/ExternalParser;->parse(Lorg/apache/tika/io/TikaInputStream;Lorg/apache/tika/sax/XHTMLContentHandler;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/io/TemporaryResources;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    invoke-virtual {p2}, Lorg/apache/tika/io/TemporaryResources;->dispose()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p2}, Lorg/apache/tika/io/TemporaryResources;->dispose()V

    .line 5
    throw p1
.end method

.method public varargs setCommand([Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/tika/parser/external/ExternalParser;->command:[Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setIgnoredLineConsumer(Lorg/apache/tika/parser/external/ExternalParser$LineConsumer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/tika/parser/external/ExternalParser;->ignoredLineConsumer:Lorg/apache/tika/parser/external/ExternalParser$LineConsumer;

    .line 2
    .line 3
    return-void
.end method

.method public setMetadataExtractionPatterns(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/util/regex/Pattern;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lorg/apache/tika/parser/external/ExternalParser;->metadataPatterns:Ljava/util/Map;

    .line 2
    .line 3
    return-void
.end method

.method public setSupportedTypes(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lorg/apache/tika/mime/MediaType;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lorg/apache/tika/parser/external/ExternalParser;->supportedTypes:Ljava/util/Set;

    .line 11
    .line 12
    return-void
.end method

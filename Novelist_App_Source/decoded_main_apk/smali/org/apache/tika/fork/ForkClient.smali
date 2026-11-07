.class Lorg/apache/tika/fork/ForkClient;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final CLIENT_COUNTER:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field private volatile filesProcessed:I

.field private final id:I

.field private final input:Ljava/io/DataInputStream;

.field private final jar:Ljava/io/File;

.field private final loader:Ljava/lang/ClassLoader;

.field private final output:Ljava/io/DataOutputStream;

.field private final process:Ljava/lang/Process;

.field private final resources:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/apache/tika/fork/ForkResource;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/apache/tika/fork/ForkClient;->CLIENT_COUNTER:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/util/List;Lorg/apache/tika/fork/TimeoutLimits;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Ljava/lang/Object;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lorg/apache/tika/fork/TimeoutLimits;",
            ")V"
        }
    .end annotation

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/apache/tika/fork/ForkClient;->resources:Ljava/util/List;

    .line 39
    sget-object v1, Lorg/apache/tika/fork/ForkClient;->CLIENT_COUNTER:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v1

    iput v1, p0, Lorg/apache/tika/fork/ForkClient;->id:I

    const/4 v1, 0x0

    .line 40
    iput v1, p0, Lorg/apache/tika/fork/ForkClient;->filesProcessed:I

    .line 41
    :try_start_0
    iput-object p1, p0, Lorg/apache/tika/fork/ForkClient;->loader:Ljava/lang/ClassLoader;

    .line 42
    invoke-static {}, Lorg/apache/tika/fork/ForkClient;->createBootstrapJar()Ljava/io/File;

    move-result-object v2

    iput-object v2, p0, Lorg/apache/tika/fork/ForkClient;->jar:Ljava/io/File;

    .line 43
    new-instance v3, Ljava/lang/ProcessBuilder;

    new-array v1, v1, [Ljava/lang/String;

    invoke-direct {v3, v1}, Ljava/lang/ProcessBuilder;-><init>([Ljava/lang/String;)V

    .line 44
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 45
    const-string p3, "-jar"

    invoke-virtual {v1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    invoke-virtual {p4}, Lorg/apache/tika/fork/TimeoutLimits;->getPulseMS()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    invoke-virtual {p4}, Lorg/apache/tika/fork/TimeoutLimits;->getParseTimeoutMS()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    invoke-virtual {p4}, Lorg/apache/tika/fork/TimeoutLimits;->getWaitTimeoutMS()J

    move-result-wide p3

    invoke-static {p3, p4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    invoke-virtual {v3, v1}, Ljava/lang/ProcessBuilder;->command(Ljava/util/List;)Ljava/lang/ProcessBuilder;

    .line 51
    invoke-static {}, Lorg/apache/tika/fork/a;->c()Ljava/lang/ProcessBuilder$Redirect;

    invoke-static {v3}, Lorg/apache/tika/fork/a;->s(Ljava/lang/ProcessBuilder;)V

    .line 52
    invoke-virtual {v3}, Ljava/lang/ProcessBuilder;->start()Ljava/lang/Process;

    move-result-object p3

    iput-object p3, p0, Lorg/apache/tika/fork/ForkClient;->process:Ljava/lang/Process;

    .line 53
    new-instance p4, Ljava/io/DataOutputStream;

    invoke-virtual {p3}, Ljava/lang/Process;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    invoke-direct {p4, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    iput-object p4, p0, Lorg/apache/tika/fork/ForkClient;->output:Ljava/io/DataOutputStream;

    .line 54
    new-instance v1, Ljava/io/DataInputStream;

    invoke-virtual {p3}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object p3

    invoke-direct {v1, p3}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    iput-object v1, p0, Lorg/apache/tika/fork/ForkClient;->input:Ljava/io/DataInputStream;

    .line 55
    invoke-direct {p0}, Lorg/apache/tika/fork/ForkClient;->waitForStartBeacon()V

    const/4 p3, 0x7

    .line 56
    invoke-virtual {p4, p3}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 57
    invoke-virtual {p4}, Ljava/io/DataOutputStream;->flush()V

    .line 58
    invoke-direct {p0, p1, v0}, Lorg/apache/tika/fork/ForkClient;->sendObject(Ljava/lang/Object;Ljava/util/List;)V

    .line 59
    invoke-direct {p0, p2, v0}, Lorg/apache/tika/fork/ForkClient;->sendObject(Ljava/lang/Object;Ljava/util/List;)V

    .line 60
    invoke-direct {p0}, Lorg/apache/tika/fork/ForkClient;->waitForStartBeacon()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 61
    invoke-virtual {p0}, Lorg/apache/tika/fork/ForkClient;->close()V

    .line 62
    throw p1
.end method

.method public constructor <init>(Ljava/nio/file/Path;Lorg/apache/tika/fork/ParserFactoryFactory;Ljava/lang/ClassLoader;Ljava/util/List;Lorg/apache/tika/fork/TimeoutLimits;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/nio/file/Path;",
            "Lorg/apache/tika/fork/ParserFactoryFactory;",
            "Ljava/lang/ClassLoader;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lorg/apache/tika/fork/TimeoutLimits;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/apache/tika/fork/ForkClient;->resources:Ljava/util/List;

    .line 4
    sget-object v1, Lorg/apache/tika/fork/ForkClient;->CLIENT_COUNTER:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v1

    iput v1, p0, Lorg/apache/tika/fork/ForkClient;->id:I

    const/4 v1, 0x0

    .line 5
    iput v1, p0, Lorg/apache/tika/fork/ForkClient;->filesProcessed:I

    const/4 v2, 0x0

    .line 6
    iput-object v2, p0, Lorg/apache/tika/fork/ForkClient;->jar:Ljava/io/File;

    .line 7
    iput-object v2, p0, Lorg/apache/tika/fork/ForkClient;->loader:Ljava/lang/ClassLoader;

    .line 8
    new-instance v2, Ljava/lang/ProcessBuilder;

    new-array v1, v1, [Ljava/lang/String;

    invoke-direct {v2, v1}, Ljava/lang/ProcessBuilder;-><init>([Ljava/lang/String;)V

    .line 9
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 10
    const-string p4, "-cp"

    invoke-virtual {v1, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    invoke-static {p1}, Lio/flutter/plugin/editing/i;->l(Ljava/nio/file/Path;)Ljava/nio/file/Path;

    move-result-object p1

    invoke-static {p1}, Lio/flutter/plugin/editing/i;->i(Ljava/nio/file/Path;)Ljava/lang/String;

    move-result-object p1

    .line 12
    const-string p4, "/"

    invoke-virtual {p1, p4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 13
    const-string p4, "/*"

    invoke-virtual {p1, p4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p1, p4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 15
    :goto_0
    invoke-static {p1}, Lorg/apache/tika/utils/ProcessUtils;->escapeCommandLine(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 16
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    const-string p1, "org.apache.tika.fork.ForkServer"

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 18
    invoke-virtual {p5}, Lorg/apache/tika/fork/TimeoutLimits;->getPulseMS()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    invoke-virtual {p5}, Lorg/apache/tika/fork/TimeoutLimits;->getParseTimeoutMS()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 20
    invoke-virtual {p5}, Lorg/apache/tika/fork/TimeoutLimits;->getWaitTimeoutMS()J

    move-result-wide p4

    invoke-static {p4, p5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    invoke-virtual {v2, v1}, Ljava/lang/ProcessBuilder;->command(Ljava/util/List;)Ljava/lang/ProcessBuilder;

    .line 22
    invoke-static {}, Lorg/apache/tika/fork/a;->c()Ljava/lang/ProcessBuilder$Redirect;

    invoke-static {v2}, Lorg/apache/tika/fork/a;->s(Ljava/lang/ProcessBuilder;)V

    .line 23
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/ProcessBuilder;->start()Ljava/lang/Process;

    move-result-object p1

    iput-object p1, p0, Lorg/apache/tika/fork/ForkClient;->process:Ljava/lang/Process;

    .line 24
    new-instance p4, Ljava/io/DataOutputStream;

    invoke-virtual {p1}, Ljava/lang/Process;->getOutputStream()Ljava/io/OutputStream;

    move-result-object p5

    invoke-direct {p4, p5}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    iput-object p4, p0, Lorg/apache/tika/fork/ForkClient;->output:Ljava/io/DataOutputStream;

    .line 25
    new-instance p5, Ljava/io/DataInputStream;

    invoke-virtual {p1}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object p1

    invoke-direct {p5, p1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    iput-object p5, p0, Lorg/apache/tika/fork/ForkClient;->input:Ljava/io/DataInputStream;

    .line 26
    invoke-direct {p0}, Lorg/apache/tika/fork/ForkClient;->waitForStartBeacon()V

    if-eqz p3, :cond_1

    const/16 p1, 0x8

    .line 27
    invoke-virtual {p4, p1}, Ljava/io/DataOutputStream;->writeByte(I)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    const/4 p1, 0x6

    .line 28
    invoke-virtual {p4, p1}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 29
    :goto_1
    invoke-virtual {p4}, Ljava/io/DataOutputStream;->flush()V

    .line 30
    invoke-direct {p0, p2, v0}, Lorg/apache/tika/fork/ForkClient;->sendObject(Ljava/lang/Object;Ljava/util/List;)V

    if-eqz p3, :cond_2

    .line 31
    invoke-direct {p0, p3, v0}, Lorg/apache/tika/fork/ForkClient;->sendObject(Ljava/lang/Object;Ljava/util/List;)V

    .line 32
    :cond_2
    invoke-direct {p0}, Lorg/apache/tika/fork/ForkClient;->waitForStartBeacon()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 33
    :goto_2
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 34
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception p1

    .line 35
    invoke-virtual {p0}, Lorg/apache/tika/fork/ForkClient;->close()V

    .line 36
    throw p1
.end method

.method public constructor <init>(Ljava/nio/file/Path;Lorg/apache/tika/fork/ParserFactoryFactory;Ljava/util/List;Lorg/apache/tika/fork/TimeoutLimits;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/nio/file/Path;",
            "Lorg/apache/tika/fork/ParserFactoryFactory;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lorg/apache/tika/fork/TimeoutLimits;",
            ")V"
        }
    .end annotation

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    .line 1
    invoke-direct/range {v0 .. v5}, Lorg/apache/tika/fork/ForkClient;-><init>(Ljava/nio/file/Path;Lorg/apache/tika/fork/ParserFactoryFactory;Ljava/lang/ClassLoader;Ljava/util/List;Lorg/apache/tika/fork/TimeoutLimits;)V

    return-void
.end method

.method private static createBootstrapJar()Ljava/io/File;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/nio/file/attribute/FileAttribute;

    .line 3
    .line 4
    invoke-static {v0}, Lio/flutter/plugin/editing/i;->m([Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, Lio/flutter/plugin/editing/i;->e(Ljava/nio/file/Path;)Ljava/io/File;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :try_start_0
    invoke-static {v0}, Lorg/apache/tika/fork/ForkClient;->fillBootstrapJar(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 18
    .line 19
    .line 20
    throw v1
.end method

.method private static fillBootstrapJar(Ljava/io/File;)V
    .locals 12

    .line 1
    const-class v0, Lorg/apache/tika/fork/ForkServer;

    .line 2
    .line 3
    const-string v1, "Main-Class: "

    .line 4
    .line 5
    new-instance v2, Ljava/util/jar/JarOutputStream;

    .line 6
    .line 7
    new-instance v3, Ljava/io/FileOutputStream;

    .line 8
    .line 9
    invoke-direct {v3, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v2, v3}, Ljava/util/jar/JarOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 13
    .line 14
    .line 15
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    new-instance v3, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string p0, "\n"

    .line 28
    .line 29
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    new-instance v1, Ljava/util/zip/ZipEntry;

    .line 37
    .line 38
    const-string v3, "META-INF/MANIFEST.MF"

    .line 39
    .line 40
    invoke-direct {v1, v3}, Ljava/util/zip/ZipEntry;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, v1}, Ljava/util/jar/JarOutputStream;->putNextEntry(Ljava/util/zip/ZipEntry;)V

    .line 44
    .line 45
    .line 46
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 47
    .line 48
    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {v2, p0}, Ljava/io/OutputStream;->write([B)V

    .line 53
    .line 54
    .line 55
    const-class v3, Lorg/apache/tika/fork/ForkServer;

    .line 56
    .line 57
    const-class v4, Lorg/apache/tika/fork/ForkObjectInputStream;

    .line 58
    .line 59
    const-class v5, Lorg/apache/tika/fork/ForkProxy;

    .line 60
    .line 61
    const-class v6, Lorg/apache/tika/fork/ClassLoaderProxy;

    .line 62
    .line 63
    const-class v7, Lorg/apache/tika/fork/MemoryURLConnection;

    .line 64
    .line 65
    const-class v8, Lorg/apache/tika/fork/MemoryURLStreamHandler;

    .line 66
    .line 67
    const-class v9, Lorg/apache/tika/fork/MemoryURLStreamHandlerFactory;

    .line 68
    .line 69
    const-class v10, Lorg/apache/tika/fork/MemoryURLStreamRecord;

    .line 70
    .line 71
    const-class v11, Lorg/apache/tika/exception/TikaException;

    .line 72
    .line 73
    filled-new-array/range {v3 .. v11}, [Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    const/4 v1, 0x0

    .line 82
    :goto_0
    const/16 v3, 0x9

    .line 83
    .line 84
    if-ge v1, v3, :cond_1

    .line 85
    .line 86
    aget-object v3, p0, v1

    .line 87
    .line 88
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    const/16 v4, 0x2e

    .line 93
    .line 94
    const/16 v5, 0x2f

    .line 95
    .line 96
    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    new-instance v4, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string v3, ".class"

    .line 109
    .line 110
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-virtual {v0, v3}, Ljava/lang/ClassLoader;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    .line 118
    .line 119
    .line 120
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    :try_start_1
    new-instance v5, Ljava/util/jar/JarEntry;

    .line 122
    .line 123
    invoke-direct {v5, v3}, Ljava/util/jar/JarEntry;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v5}, Ljava/util/jar/JarOutputStream;->putNextEntry(Ljava/util/zip/ZipEntry;)V

    .line 127
    .line 128
    .line 129
    invoke-static {v4, v2}, Ls2/c;->b(Ljava/io/InputStream;Ljava/io/OutputStream;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 130
    .line 131
    .line 132
    :try_start_2
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 133
    .line 134
    .line 135
    add-int/lit8 v1, v1, 0x1

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :catchall_0
    move-exception v0

    .line 139
    move-object p0, v0

    .line 140
    goto :goto_2

    .line 141
    :catchall_1
    move-exception v0

    .line 142
    move-object p0, v0

    .line 143
    if-eqz v4, :cond_0

    .line 144
    .line 145
    :try_start_3
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 146
    .line 147
    .line 148
    goto :goto_1

    .line 149
    :catchall_2
    move-exception v0

    .line 150
    :try_start_4
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 151
    .line 152
    .line 153
    :cond_0
    :goto_1
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 154
    :cond_1
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :goto_2
    :try_start_5
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 159
    .line 160
    .line 161
    goto :goto_3

    .line 162
    :catchall_3
    move-exception v0

    .line 163
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 164
    .line 165
    .line 166
    :goto_3
    throw p0
.end method

.method private sendObject(Ljava/lang/Object;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/util/List<",
            "Lorg/apache/tika/fork/ForkResource;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    instance-of v1, p1, Ljava/io/InputStream;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v1, Lorg/apache/tika/fork/InputStreamResource;

    .line 10
    .line 11
    check-cast p1, Ljava/io/InputStream;

    .line 12
    .line 13
    invoke-direct {v1, p1}, Lorg/apache/tika/fork/InputStreamResource;-><init>(Ljava/io/InputStream;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    new-instance p1, Lorg/apache/tika/fork/InputStreamProxy;

    .line 20
    .line 21
    invoke-direct {p1, v0}, Lorg/apache/tika/fork/InputStreamProxy;-><init>(I)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    instance-of v1, p1, Lorg/apache/tika/sax/RecursiveParserWrapperHandler;

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    new-instance v1, Lorg/apache/tika/fork/RecursiveMetadataContentHandlerResource;

    .line 30
    .line 31
    check-cast p1, Lorg/apache/tika/sax/RecursiveParserWrapperHandler;

    .line 32
    .line 33
    invoke-direct {v1, p1}, Lorg/apache/tika/fork/RecursiveMetadataContentHandlerResource;-><init>(Lorg/apache/tika/sax/RecursiveParserWrapperHandler;)V

    .line 34
    .line 35
    .line 36
    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    new-instance v1, Lorg/apache/tika/fork/RecursiveMetadataContentHandlerProxy;

    .line 40
    .line 41
    invoke-virtual {p1}, Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;->getContentHandlerFactory()Lorg/apache/tika/sax/ContentHandlerFactory;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-direct {v1, v0, p1}, Lorg/apache/tika/fork/RecursiveMetadataContentHandlerProxy;-><init>(ILorg/apache/tika/sax/ContentHandlerFactory;)V

    .line 46
    .line 47
    .line 48
    move-object p1, v1

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    instance-of v1, p1, Lorg/xml/sax/ContentHandler;

    .line 51
    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    instance-of v1, p1, Lorg/apache/tika/sax/AbstractRecursiveParserWrapperHandler;

    .line 55
    .line 56
    if-nez v1, :cond_2

    .line 57
    .line 58
    new-instance v1, Lorg/apache/tika/fork/ContentHandlerResource;

    .line 59
    .line 60
    check-cast p1, Lorg/xml/sax/ContentHandler;

    .line 61
    .line 62
    invoke-direct {v1, p1}, Lorg/apache/tika/fork/ContentHandlerResource;-><init>(Lorg/xml/sax/ContentHandler;)V

    .line 63
    .line 64
    .line 65
    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    new-instance p1, Lorg/apache/tika/fork/ContentHandlerProxy;

    .line 69
    .line 70
    invoke-direct {p1, v0}, Lorg/apache/tika/fork/ContentHandlerProxy;-><init>(I)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    instance-of v1, p1, Ljava/lang/ClassLoader;

    .line 75
    .line 76
    if-eqz v1, :cond_3

    .line 77
    .line 78
    new-instance v1, Lorg/apache/tika/fork/ClassLoaderResource;

    .line 79
    .line 80
    check-cast p1, Ljava/lang/ClassLoader;

    .line 81
    .line 82
    invoke-direct {v1, p1}, Lorg/apache/tika/fork/ClassLoaderResource;-><init>(Ljava/lang/ClassLoader;)V

    .line 83
    .line 84
    .line 85
    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    new-instance p1, Lorg/apache/tika/fork/ClassLoaderProxy;

    .line 89
    .line 90
    invoke-direct {p1, v0}, Lorg/apache/tika/fork/ClassLoaderProxy;-><init>(I)V

    .line 91
    .line 92
    .line 93
    :cond_3
    :goto_0
    :try_start_0
    iget-object v0, p0, Lorg/apache/tika/fork/ForkClient;->output:Ljava/io/DataOutputStream;

    .line 94
    .line 95
    invoke-static {p1, v0}, Lorg/apache/tika/fork/ForkObjectInputStream;->sendObject(Ljava/lang/Object;Ljava/io/DataOutputStream;)V
    :try_end_0
    .catch Ljava/io/NotSerializableException; {:try_start_0 .. :try_end_0} :catch_0

    .line 96
    .line 97
    .line 98
    invoke-direct {p0, p2}, Lorg/apache/tika/fork/ForkClient;->waitForResponse(Ljava/util/List;)Ljava/lang/Throwable;

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :catch_0
    move-exception p2

    .line 103
    new-instance v0, Lorg/apache/tika/exception/TikaException;

    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    const-string v1, "Unable to serialize "

    .line 114
    .line 115
    const-string v2, " to pass to the Forked Parser"

    .line 116
    .line 117
    invoke-static {v1, p1, v2}, Lt/a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-direct {v0, p1, p2}, Lorg/apache/tika/exception/TikaException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 122
    .line 123
    .line 124
    throw v0
.end method

.method private waitForResponse(Ljava/util/List;)Ljava/lang/Throwable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lorg/apache/tika/fork/ForkResource;",
            ">;)",
            "Ljava/lang/Throwable;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/apache/tika/fork/ForkClient;->output:Ljava/io/DataOutputStream;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V

    .line 4
    .line 5
    .line 6
    :goto_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_3

    .line 15
    .line 16
    iget-object v0, p0, Lorg/apache/tika/fork/ForkClient;->input:Ljava/io/DataInputStream;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, -0x1

    .line 23
    if-eq v0, v1, :cond_2

    .line 24
    .line 25
    const/4 v2, 0x3

    .line 26
    if-ne v0, v2, :cond_0

    .line 27
    .line 28
    iget-object v0, p0, Lorg/apache/tika/fork/ForkClient;->input:Ljava/io/DataInputStream;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Lorg/apache/tika/fork/ForkResource;

    .line 39
    .line 40
    iget-object v1, p0, Lorg/apache/tika/fork/ForkClient;->input:Ljava/io/DataInputStream;

    .line 41
    .line 42
    iget-object v2, p0, Lorg/apache/tika/fork/ForkClient;->output:Ljava/io/DataOutputStream;

    .line 43
    .line 44
    invoke-interface {v0, v1, v2}, Lorg/apache/tika/fork/ForkResource;->process(Ljava/io/DataInputStream;Ljava/io/DataOutputStream;)Ljava/lang/Throwable;

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    int-to-byte p1, v0

    .line 49
    if-ne p1, v1, :cond_1

    .line 50
    .line 51
    :try_start_0
    iget-object p1, p0, Lorg/apache/tika/fork/ForkClient;->input:Ljava/io/DataInputStream;

    .line 52
    .line 53
    iget-object v0, p0, Lorg/apache/tika/fork/ForkClient;->loader:Ljava/lang/ClassLoader;

    .line 54
    .line 55
    invoke-static {p1, v0}, Lorg/apache/tika/fork/ForkObjectInputStream;->readObject(Ljava/io/DataInputStream;Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, Ljava/lang/Throwable;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    .line 61
    return-object p1

    .line 62
    :catch_0
    move-exception p1

    .line 63
    new-instance v0, Ljava/io/IOException;

    .line 64
    .line 65
    const-string v1, "Unable to deserialize an exception"

    .line 66
    .line 67
    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    throw v0

    .line 71
    :cond_1
    const/4 p1, 0x0

    .line 72
    return-object p1

    .line 73
    :cond_2
    new-instance p1, Ljava/io/IOException;

    .line 74
    .line 75
    const-string v0, "Lost connection to a forked server process"

    .line 76
    .line 77
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw p1

    .line 81
    :cond_3
    new-instance p1, Ljava/io/IOException;

    .line 82
    .line 83
    new-instance v0, Ljava/lang/InterruptedException;

    .line 84
    .line 85
    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    throw p1
.end method

.method private waitForStartBeacon()V
    .locals 3

    .line 1
    :goto_0
    iget-object v0, p0, Lorg/apache/tika/fork/ForkClient;->input:Ljava/io/DataInputStream;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    int-to-byte v1, v0

    .line 8
    const/4 v2, 0x4

    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const/4 v2, 0x5

    .line 13
    if-eq v1, v2, :cond_2

    .line 14
    .line 15
    const/4 v1, -0x1

    .line 16
    if-eq v0, v1, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    new-instance v0, Ljava/io/IOException;

    .line 20
    .line 21
    const-string v1, "EOF while waiting for start beacon"

    .line 22
    .line 23
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw v0

    .line 27
    :cond_2
    new-instance v0, Ljava/io/IOException;

    .line 28
    .line 29
    const-string v1, "Server had a catastrophic initialization failure"

    .line 30
    .line 31
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v0
.end method


# virtual methods
.method public varargs declared-synchronized call(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Lorg/apache/tika/fork/ForkClient;->filesProcessed:I

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    add-int/2addr v0, v1

    .line 6
    iput v0, p0, Lorg/apache/tika/fork/ForkClient;->filesProcessed:I

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    iget-object v2, p0, Lorg/apache/tika/fork/ForkClient;->resources:Ljava/util/List;

    .line 11
    .line 12
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 13
    .line 14
    .line 15
    iget-object v2, p0, Lorg/apache/tika/fork/ForkClient;->output:Ljava/io/DataOutputStream;

    .line 16
    .line 17
    invoke-virtual {v2, v1}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lorg/apache/tika/fork/ForkClient;->output:Ljava/io/DataOutputStream;

    .line 21
    .line 22
    invoke-virtual {v1, p1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    array-length p1, p2

    .line 26
    const/4 v1, 0x0

    .line 27
    :goto_0
    if-ge v1, p1, :cond_0

    .line 28
    .line 29
    aget-object v2, p2, v1

    .line 30
    .line 31
    invoke-direct {p0, v2, v0}, Lorg/apache/tika/fork/ForkClient;->sendObject(Ljava/lang/Object;Ljava/util/List;)V

    .line 32
    .line 33
    .line 34
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    invoke-direct {p0, v0}, Lorg/apache/tika/fork/ForkClient;->waitForResponse(Ljava/util/List;)Ljava/lang/Throwable;

    .line 40
    .line 41
    .line 42
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    monitor-exit p0

    .line 44
    return-object p1

    .line 45
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    throw p1
.end method

.method public declared-synchronized close()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lorg/apache/tika/fork/ForkClient;->output:Ljava/io/DataOutputStream;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    goto :goto_1

    .line 12
    :cond_0
    :goto_0
    iget-object v0, p0, Lorg/apache/tika/fork/ForkClient;->input:Ljava/io/DataInputStream;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    :catch_0
    :cond_1
    :try_start_1
    iget-object v0, p0, Lorg/apache/tika/fork/ForkClient;->process:Ljava/lang/Process;

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-static {v0}, Lorg/apache/tika/fork/a;->r(Ljava/lang/Process;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    .line 25
    .line 26
    :try_start_2
    iget-object v0, p0, Lorg/apache/tika/fork/ForkClient;->process:Ljava/lang/Process;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Process;->waitFor()I
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 29
    .line 30
    .line 31
    :catch_1
    :cond_2
    :try_start_3
    iget-object v0, p0, Lorg/apache/tika/fork/ForkClient;->jar:Ljava/io/File;

    .line 32
    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 36
    .line 37
    .line 38
    :cond_3
    monitor-exit p0

    .line 39
    return-void

    .line 40
    :goto_1
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 41
    throw v0
.end method

.method public getFilesProcessed()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/tika/fork/ForkClient;->filesProcessed:I

    .line 2
    .line 3
    return v0
.end method

.method public getId()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/tika/fork/ForkClient;->id:I

    .line 2
    .line 3
    return v0
.end method

.method public declared-synchronized ping()Z
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x0

    .line 3
    :try_start_0
    iget-object v1, p0, Lorg/apache/tika/fork/ForkClient;->output:Ljava/io/DataOutputStream;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-virtual {v1, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lorg/apache/tika/fork/ForkClient;->output:Ljava/io/DataOutputStream;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/io/DataOutputStream;->flush()V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lorg/apache/tika/fork/ForkClient;->input:Ljava/io/DataInputStream;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/io/InputStream;->read()I

    .line 17
    .line 18
    .line 19
    move-result v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    if-ne v1, v2, :cond_0

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    :cond_0
    monitor-exit p0

    .line 24
    return v0

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    throw v0

    .line 28
    :catch_0
    monitor-exit p0

    .line 29
    return v0
.end method

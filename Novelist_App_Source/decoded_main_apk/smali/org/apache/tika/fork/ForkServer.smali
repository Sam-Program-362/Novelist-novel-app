.class Lorg/apache/tika/fork/ForkServer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final CALL:B = 0x1t

.field public static final DONE:B = 0x0t

.field public static final ERROR:B = -0x1t

.field public static final FAILED_TO_START:B = 0x5t

.field public static final INIT_LOADER_PARSER:B = 0x7t

.field public static final INIT_PARSER_FACTORY_FACTORY:B = 0x6t

.field public static final INIT_PARSER_FACTORY_FACTORY_LOADER:B = 0x8t

.field public static final PING:B = 0x2t

.field public static final READY:B = 0x4t

.field public static final RESOURCE:B = 0x3t


# instance fields
.field private final active:Z

.field private classLoader:Ljava/lang/ClassLoader;

.field private final input:Ljava/io/DataInputStream;

.field private final lock:[Ljava/lang/Object;

.field private final output:Ljava/io/DataOutputStream;

.field private parser:Ljava/lang/Object;

.field private parsing:Z

.field private serverParserTimeoutMillis:J

.field private serverPulseMillis:J

.field private serverWaitTimeoutMillis:J

.field private since:J


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Ljava/io/OutputStream;JJJ)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    new-array v1, v0, [Ljava/lang/Object;

    .line 6
    .line 7
    iput-object v1, p0, Lorg/apache/tika/fork/ForkServer;->lock:[Ljava/lang/Object;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    iput-boolean v1, p0, Lorg/apache/tika/fork/ForkServer;->active:Z

    .line 11
    .line 12
    const-wide/16 v1, 0x1388

    .line 13
    .line 14
    iput-wide v1, p0, Lorg/apache/tika/fork/ForkServer;->serverPulseMillis:J

    .line 15
    .line 16
    const-wide/32 v1, 0xea60

    .line 17
    .line 18
    .line 19
    iput-wide v1, p0, Lorg/apache/tika/fork/ForkServer;->serverParserTimeoutMillis:J

    .line 20
    .line 21
    iput-wide v1, p0, Lorg/apache/tika/fork/ForkServer;->serverWaitTimeoutMillis:J

    .line 22
    .line 23
    iput-boolean v0, p0, Lorg/apache/tika/fork/ForkServer;->parsing:Z

    .line 24
    .line 25
    new-instance v1, Ljava/io/DataInputStream;

    .line 26
    .line 27
    invoke-direct {v1, p1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, Lorg/apache/tika/fork/ForkServer;->input:Ljava/io/DataInputStream;

    .line 31
    .line 32
    new-instance p1, Ljava/io/DataOutputStream;

    .line 33
    .line 34
    invoke-direct {p1, p2}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lorg/apache/tika/fork/ForkServer;->output:Ljava/io/DataOutputStream;

    .line 38
    .line 39
    iput-wide p3, p0, Lorg/apache/tika/fork/ForkServer;->serverPulseMillis:J

    .line 40
    .line 41
    iput-wide p5, p0, Lorg/apache/tika/fork/ForkServer;->serverParserTimeoutMillis:J

    .line 42
    .line 43
    iput-wide p7, p0, Lorg/apache/tika/fork/ForkServer;->serverWaitTimeoutMillis:J

    .line 44
    .line 45
    iput-boolean v0, p0, Lorg/apache/tika/fork/ForkServer;->parsing:Z

    .line 46
    .line 47
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 48
    .line 49
    .line 50
    move-result-wide p1

    .line 51
    iput-wide p1, p0, Lorg/apache/tika/fork/ForkServer;->since:J

    .line 52
    .line 53
    return-void
.end method

.method private call(Ljava/lang/ClassLoader;Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lorg/apache/tika/fork/ForkServer;->lock:[Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p0, Lorg/apache/tika/fork/ForkServer;->parsing:Z

    .line 6
    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    iput-wide v1, p0, Lorg/apache/tika/fork/ForkServer;->since:J

    .line 12
    .line 13
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 14
    const/4 v0, 0x0

    .line 15
    :try_start_1
    iget-object v1, p0, Lorg/apache/tika/fork/ForkServer;->input:Ljava/io/DataInputStream;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-direct {p0, p2, v1}, Lorg/apache/tika/fork/ForkServer;->getMethod(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    array-length v2, v2

    .line 30
    new-array v3, v2, [Ljava/lang/Object;

    .line 31
    .line 32
    move v4, v0

    .line 33
    :goto_0
    if-ge v4, v2, :cond_0

    .line 34
    .line 35
    invoke-direct {p0, p1}, Lorg/apache/tika/fork/ForkServer;->readObject(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    aput-object v5, v3, v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    .line 41
    add-int/lit8 v4, v4, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    goto :goto_2

    .line 46
    :cond_0
    :try_start_2
    invoke-virtual {v1, p2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lorg/apache/tika/fork/ForkServer;->output:Ljava/io/DataOutputStream;

    .line 50
    .line 51
    invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->write(I)V
    :try_end_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :catch_0
    move-exception p1

    .line 56
    :try_start_3
    iget-object p2, p0, Lorg/apache/tika/fork/ForkServer;->output:Ljava/io/DataOutputStream;

    .line 57
    .line 58
    const/4 v1, -0x1

    .line 59
    invoke-virtual {p2, v1}, Ljava/io/DataOutputStream;->write(I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 63
    .line 64
    .line 65
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 66
    :try_start_4
    iget-object p2, p0, Lorg/apache/tika/fork/ForkServer;->output:Ljava/io/DataOutputStream;

    .line 67
    .line 68
    invoke-static {p1, p2}, Lorg/apache/tika/fork/ForkObjectInputStream;->sendObject(Ljava/lang/Object;Ljava/io/DataOutputStream;)V
    :try_end_4
    .catch Ljava/io/NotSerializableException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :catch_1
    :try_start_5
    new-instance p2, Lorg/apache/tika/exception/TikaException;

    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-direct {p2, v1}, Lorg/apache/tika/exception/TikaException;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    .line 86
    .line 87
    .line 88
    iget-object p1, p0, Lorg/apache/tika/fork/ForkServer;->output:Ljava/io/DataOutputStream;

    .line 89
    .line 90
    invoke-static {p2, p1}, Lorg/apache/tika/fork/ForkObjectInputStream;->sendObject(Ljava/lang/Object;Ljava/io/DataOutputStream;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 91
    .line 92
    .line 93
    :goto_1
    iget-object p1, p0, Lorg/apache/tika/fork/ForkServer;->lock:[Ljava/lang/Object;

    .line 94
    .line 95
    monitor-enter p1

    .line 96
    :try_start_6
    iput-boolean v0, p0, Lorg/apache/tika/fork/ForkServer;->parsing:Z

    .line 97
    .line 98
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 99
    .line 100
    .line 101
    move-result-wide v0

    .line 102
    iput-wide v0, p0, Lorg/apache/tika/fork/ForkServer;->since:J

    .line 103
    .line 104
    monitor-exit p1

    .line 105
    return-void

    .line 106
    :catchall_1
    move-exception p2

    .line 107
    monitor-exit p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 108
    throw p2

    .line 109
    :goto_2
    iget-object p2, p0, Lorg/apache/tika/fork/ForkServer;->lock:[Ljava/lang/Object;

    .line 110
    .line 111
    monitor-enter p2

    .line 112
    :try_start_7
    iput-boolean v0, p0, Lorg/apache/tika/fork/ForkServer;->parsing:Z

    .line 113
    .line 114
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 115
    .line 116
    .line 117
    move-result-wide v0

    .line 118
    iput-wide v0, p0, Lorg/apache/tika/fork/ForkServer;->since:J

    .line 119
    .line 120
    monitor-exit p2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 121
    throw p1

    .line 122
    :catchall_2
    move-exception p1

    .line 123
    :try_start_8
    monitor-exit p2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 124
    throw p1

    .line 125
    :catchall_3
    move-exception p1

    .line 126
    :try_start_9
    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 127
    throw p1
.end method

.method private getMethod(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/reflect/Method;
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :goto_0
    if-eqz p1, :cond_3

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    array-length v1, v0

    .line 12
    const/4 v2, 0x0

    .line 13
    move v3, v2

    .line 14
    :goto_1
    if-ge v3, v1, :cond_2

    .line 15
    .line 16
    aget-object v4, v0, v3

    .line 17
    .line 18
    invoke-virtual {v4}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    array-length v5, v4

    .line 23
    move v6, v2

    .line 24
    :goto_2
    if-ge v6, v5, :cond_1

    .line 25
    .line 26
    aget-object v7, v4, v6

    .line 27
    .line 28
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v8

    .line 32
    invoke-virtual {p2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v8

    .line 36
    if-eqz v8, :cond_0

    .line 37
    .line 38
    return-object v7

    .line 39
    :cond_0
    add-int/lit8 v6, v6, 0x1

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    goto :goto_0

    .line 50
    :cond_3
    const/4 p1, 0x0

    .line 51
    return-object p1
.end method

.method private initializeParserAndLoader()V
    .locals 5

    .line 1
    iget-object v0, p0, Lorg/apache/tika/fork/ForkServer;->output:Ljava/io/DataOutputStream;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lorg/apache/tika/fork/ForkServer;->output:Ljava/io/DataOutputStream;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lorg/apache/tika/fork/ForkServer;->input:Ljava/io/DataInputStream;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v2, -0x1

    .line 19
    if-eq v0, v2, :cond_6

    .line 20
    .line 21
    const-class v2, Lorg/apache/tika/fork/ForkServer;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-direct {p0, v3}, Lorg/apache/tika/fork/ForkServer;->readObject(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    const/4 v4, 0x6

    .line 32
    if-eq v0, v4, :cond_4

    .line 33
    .line 34
    const/4 v4, 0x7

    .line 35
    if-eq v0, v4, :cond_2

    .line 36
    .line 37
    const/16 v4, 0x8

    .line 38
    .line 39
    if-eq v0, v4, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    instance-of v0, v3, Lorg/apache/tika/fork/ParserFactoryFactory;

    .line 43
    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    check-cast v3, Lorg/apache/tika/fork/ParserFactoryFactory;

    .line 47
    .line 48
    invoke-virtual {v3}, Lorg/apache/tika/fork/ParserFactoryFactory;->build()Lorg/apache/tika/parser/ParserFactory;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Lorg/apache/tika/parser/ParserFactory;->build()Lorg/apache/tika/parser/Parser;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iput-object v0, p0, Lorg/apache/tika/fork/ForkServer;->parser:Ljava/lang/Object;

    .line 57
    .line 58
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-direct {p0, v0}, Lorg/apache/tika/fork/ForkServer;->readObject(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Ljava/lang/ClassLoader;

    .line 67
    .line 68
    iput-object v0, p0, Lorg/apache/tika/fork/ForkServer;->classLoader:Ljava/lang/ClassLoader;

    .line 69
    .line 70
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iget-object v2, p0, Lorg/apache/tika/fork/ForkServer;->classLoader:Ljava/lang/ClassLoader;

    .line 75
    .line 76
    invoke-virtual {v0, v2}, Ljava/lang/Thread;->setContextClassLoader(Ljava/lang/ClassLoader;)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 81
    .line 82
    const-string v1, "Expecing ParserFactoryFactory followed by a class loader"

    .line 83
    .line 84
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw v0

    .line 88
    :cond_2
    instance-of v0, v3, Ljava/lang/ClassLoader;

    .line 89
    .line 90
    if-eqz v0, :cond_3

    .line 91
    .line 92
    check-cast v3, Ljava/lang/ClassLoader;

    .line 93
    .line 94
    iput-object v3, p0, Lorg/apache/tika/fork/ForkServer;->classLoader:Ljava/lang/ClassLoader;

    .line 95
    .line 96
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    iget-object v2, p0, Lorg/apache/tika/fork/ForkServer;->classLoader:Ljava/lang/ClassLoader;

    .line 101
    .line 102
    invoke-virtual {v0, v2}, Ljava/lang/Thread;->setContextClassLoader(Ljava/lang/ClassLoader;)V

    .line 103
    .line 104
    .line 105
    iget-object v0, p0, Lorg/apache/tika/fork/ForkServer;->classLoader:Ljava/lang/ClassLoader;

    .line 106
    .line 107
    invoke-direct {p0, v0}, Lorg/apache/tika/fork/ForkServer;->readObject(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    iput-object v0, p0, Lorg/apache/tika/fork/ForkServer;->parser:Ljava/lang/Object;

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 115
    .line 116
    const-string v1, "Expecting ClassLoader followed by a Parser"

    .line 117
    .line 118
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw v0

    .line 122
    :cond_4
    instance-of v0, v3, Lorg/apache/tika/fork/ParserFactoryFactory;

    .line 123
    .line 124
    if-eqz v0, :cond_5

    .line 125
    .line 126
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    iput-object v0, p0, Lorg/apache/tika/fork/ForkServer;->classLoader:Ljava/lang/ClassLoader;

    .line 131
    .line 132
    check-cast v3, Lorg/apache/tika/fork/ParserFactoryFactory;

    .line 133
    .line 134
    invoke-virtual {v3}, Lorg/apache/tika/fork/ParserFactoryFactory;->build()Lorg/apache/tika/parser/ParserFactory;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-virtual {v0}, Lorg/apache/tika/parser/ParserFactory;->build()Lorg/apache/tika/parser/Parser;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    iput-object v0, p0, Lorg/apache/tika/fork/ForkServer;->parser:Ljava/lang/Object;

    .line 143
    .line 144
    :goto_0
    iget-object v0, p0, Lorg/apache/tika/fork/ForkServer;->output:Ljava/io/DataOutputStream;

    .line 145
    .line 146
    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 147
    .line 148
    .line 149
    iget-object v0, p0, Lorg/apache/tika/fork/ForkServer;->output:Ljava/io/DataOutputStream;

    .line 150
    .line 151
    invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 156
    .line 157
    const-string v1, "Expecting only one object of class ParserFactoryFactory"

    .line 158
    .line 159
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    throw v0

    .line 163
    :cond_6
    new-instance v0, Lorg/apache/tika/exception/TikaException;

    .line 164
    .line 165
    const-string v1, "eof! pipe closed?!"

    .line 166
    .line 167
    invoke-direct {v0, v1}, Lorg/apache/tika/exception/TikaException;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    throw v0
.end method

.method public static main([Ljava/lang/String;)V
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    aget-object v1, p0, v0

    .line 3
    .line 4
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 5
    .line 6
    .line 7
    move-result-wide v5

    .line 8
    const/4 v1, 0x1

    .line 9
    aget-object v2, p0, v1

    .line 10
    .line 11
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v7

    .line 15
    const/4 v2, 0x2

    .line 16
    aget-object p0, p0, v2

    .line 17
    .line 18
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 19
    .line 20
    .line 21
    move-result-wide v9

    .line 22
    new-instance p0, Lorg/apache/tika/fork/MemoryURLStreamHandlerFactory;

    .line 23
    .line 24
    invoke-direct {p0}, Lorg/apache/tika/fork/MemoryURLStreamHandlerFactory;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-static {p0}, Ljava/net/URL;->setURLStreamHandlerFactory(Ljava/net/URLStreamHandlerFactory;)V

    .line 28
    .line 29
    .line 30
    new-instance v2, Lorg/apache/tika/fork/ForkServer;

    .line 31
    .line 32
    sget-object v3, Ljava/lang/System;->in:Ljava/io/InputStream;

    .line 33
    .line 34
    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 35
    .line 36
    invoke-direct/range {v2 .. v10}, Lorg/apache/tika/fork/ForkServer;-><init>(Ljava/io/InputStream;Ljava/io/OutputStream;JJJ)V

    .line 37
    .line 38
    .line 39
    new-instance p0, Ljava/io/ByteArrayInputStream;

    .line 40
    .line 41
    new-array v0, v0, [B

    .line 42
    .line 43
    invoke-direct {p0, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 44
    .line 45
    .line 46
    invoke-static {p0}, Ljava/lang/System;->setIn(Ljava/io/InputStream;)V

    .line 47
    .line 48
    .line 49
    sget-object p0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 50
    .line 51
    invoke-static {p0}, Ljava/lang/System;->setOut(Ljava/io/PrintStream;)V

    .line 52
    .line 53
    .line 54
    new-instance p0, Ljava/lang/Thread;

    .line 55
    .line 56
    const-string v0, "Tika Watchdog"

    .line 57
    .line 58
    invoke-direct {p0, v2, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, v1}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2}, Lorg/apache/tika/fork/ForkServer;->processRequests()V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method private readObject(Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/apache/tika/fork/ForkServer;->input:Ljava/io/DataInputStream;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lorg/apache/tika/fork/ForkObjectInputStream;->readObject(Ljava/io/DataInputStream;Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    instance-of v0, p1, Lorg/apache/tika/fork/ForkProxy;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    move-object v0, p1

    .line 12
    check-cast v0, Lorg/apache/tika/fork/ForkProxy;

    .line 13
    .line 14
    iget-object v1, p0, Lorg/apache/tika/fork/ForkServer;->input:Ljava/io/DataInputStream;

    .line 15
    .line 16
    iget-object v2, p0, Lorg/apache/tika/fork/ForkServer;->output:Ljava/io/DataOutputStream;

    .line 17
    .line 18
    invoke-interface {v0, v1, v2}, Lorg/apache/tika/fork/ForkProxy;->init(Ljava/io/DataInputStream;Ljava/io/DataOutputStream;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lorg/apache/tika/fork/ForkServer;->output:Ljava/io/DataOutputStream;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lorg/apache/tika/fork/ForkServer;->output:Ljava/io/DataOutputStream;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V

    .line 30
    .line 31
    .line 32
    return-object p1
.end method


# virtual methods
.method public processRequests()V
    .locals 2

    .line 1
    :try_start_0
    invoke-direct {p0}, Lorg/apache/tika/fork/ForkServer;->initializeParserAndLoader()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 2
    .line 3
    .line 4
    :goto_0
    :try_start_1
    iget-object v0, p0, Lorg/apache/tika/fork/ForkServer;->input:Ljava/io/DataInputStream;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, -0x1

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    goto :goto_3

    .line 14
    :cond_0
    const/4 v1, 0x2

    .line 15
    if-ne v0, v1, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lorg/apache/tika/fork/ForkServer;->output:Ljava/io/DataOutputStream;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 20
    .line 21
    .line 22
    goto :goto_1

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    goto :goto_2

    .line 25
    :cond_1
    const/4 v1, 0x1

    .line 26
    if-ne v0, v1, :cond_2

    .line 27
    .line 28
    iget-object v0, p0, Lorg/apache/tika/fork/ForkServer;->classLoader:Ljava/lang/ClassLoader;

    .line 29
    .line 30
    iget-object v1, p0, Lorg/apache/tika/fork/ForkServer;->parser:Ljava/lang/Object;

    .line 31
    .line 32
    invoke-direct {p0, v0, v1}, Lorg/apache/tika/fork/ForkServer;->call(Ljava/lang/ClassLoader;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :goto_1
    iget-object v0, p0, Lorg/apache/tika/fork/ForkServer;->output:Ljava/io/DataOutputStream;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 42
    .line 43
    const-string v1, "Unexpected request"

    .line 44
    .line 45
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 50
    .line 51
    .line 52
    :goto_3
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/io/PrintStream;->flush()V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :catchall_1
    move-exception v0

    .line 59
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 60
    .line 61
    .line 62
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/io/PrintStream;->flush()V

    .line 65
    .line 66
    .line 67
    :try_start_2
    iget-object v0, p0, Lorg/apache/tika/fork/ForkServer;->output:Ljava/io/DataOutputStream;

    .line 68
    .line 69
    const/4 v1, 0x5

    .line 70
    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, Lorg/apache/tika/fork/ForkServer;->output:Ljava/io/DataOutputStream;

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 76
    .line 77
    .line 78
    goto :goto_4

    .line 79
    :catch_0
    move-exception v0

    .line 80
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 81
    .line 82
    .line 83
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/io/PrintStream;->flush()V

    .line 86
    .line 87
    .line 88
    :goto_4
    return-void
.end method

.method public run()V
    .locals 7

    .line 1
    :goto_0
    :try_start_0
    iget-object v0, p0, Lorg/apache/tika/fork/ForkServer;->lock:[Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 5
    .line 6
    .line 7
    move-result-wide v1

    .line 8
    iget-wide v3, p0, Lorg/apache/tika/fork/ForkServer;->since:J

    .line 9
    .line 10
    sub-long/2addr v1, v3

    .line 11
    iget-boolean v3, p0, Lorg/apache/tika/fork/ForkServer;->parsing:Z

    .line 12
    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    iget-wide v4, p0, Lorg/apache/tika/fork/ForkServer;->serverParserTimeoutMillis:J

    .line 16
    .line 17
    cmp-long v4, v1, v4

    .line 18
    .line 19
    if-lez v4, :cond_0

    .line 20
    .line 21
    monitor-exit v0

    .line 22
    goto :goto_1

    .line 23
    :catchall_0
    move-exception v1

    .line 24
    goto :goto_2

    .line 25
    :cond_0
    if-nez v3, :cond_1

    .line 26
    .line 27
    iget-wide v3, p0, Lorg/apache/tika/fork/ForkServer;->serverWaitTimeoutMillis:J

    .line 28
    .line 29
    const-wide/16 v5, 0x0

    .line 30
    .line 31
    cmp-long v5, v3, v5

    .line 32
    .line 33
    if-lez v5, :cond_1

    .line 34
    .line 35
    cmp-long v1, v1, v3

    .line 36
    .line 37
    if-lez v1, :cond_1

    .line 38
    .line 39
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    :goto_1
    const/4 v0, 0x0

    .line 41
    :try_start_2
    invoke-static {v0}, Ljava/lang/System;->exit(I)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 46
    :try_start_4
    iget-wide v0, p0, Lorg/apache/tika/fork/ForkServer;->serverPulseMillis:J

    .line 47
    .line 48
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_0

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :goto_2
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 53
    :try_start_6
    throw v1
    :try_end_6
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_6} :catch_0

    .line 54
    :catch_0
    return-void
.end method

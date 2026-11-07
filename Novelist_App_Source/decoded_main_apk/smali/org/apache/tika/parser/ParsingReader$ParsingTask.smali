.class Lorg/apache/tika/parser/ParsingReader$ParsingTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/tika/parser/ParsingReader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ParsingTask"
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/tika/parser/ParsingReader;


# direct methods
.method private constructor <init>(Lorg/apache/tika/parser/ParsingReader;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lorg/apache/tika/parser/ParsingReader$ParsingTask;->this$0:Lorg/apache/tika/parser/ParsingReader;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lorg/apache/tika/parser/ParsingReader;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lorg/apache/tika/parser/ParsingReader$ParsingTask;-><init>(Lorg/apache/tika/parser/ParsingReader;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    :try_start_0
    new-instance v0, Lorg/apache/tika/sax/BodyContentHandler;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/apache/tika/parser/ParsingReader$ParsingTask;->this$0:Lorg/apache/tika/parser/ParsingReader;

    .line 4
    .line 5
    invoke-static {v1}, Lorg/apache/tika/parser/ParsingReader;->g(Lorg/apache/tika/parser/ParsingReader;)Ljava/io/Writer;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Lorg/apache/tika/sax/BodyContentHandler;-><init>(Ljava/io/Writer;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lorg/apache/tika/parser/ParsingReader$ParsingTask;->this$0:Lorg/apache/tika/parser/ParsingReader;

    .line 13
    .line 14
    invoke-static {v1}, Lorg/apache/tika/parser/ParsingReader;->d(Lorg/apache/tika/parser/ParsingReader;)Lorg/apache/tika/parser/Parser;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-object v2, p0, Lorg/apache/tika/parser/ParsingReader$ParsingTask;->this$0:Lorg/apache/tika/parser/ParsingReader;

    .line 19
    .line 20
    invoke-static {v2}, Lorg/apache/tika/parser/ParsingReader;->e(Lorg/apache/tika/parser/ParsingReader;)Ljava/io/InputStream;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    iget-object v3, p0, Lorg/apache/tika/parser/ParsingReader$ParsingTask;->this$0:Lorg/apache/tika/parser/ParsingReader;

    .line 25
    .line 26
    invoke-static {v3}, Lorg/apache/tika/parser/ParsingReader;->c(Lorg/apache/tika/parser/ParsingReader;)Lorg/apache/tika/metadata/Metadata;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    iget-object v4, p0, Lorg/apache/tika/parser/ParsingReader$ParsingTask;->this$0:Lorg/apache/tika/parser/ParsingReader;

    .line 31
    .line 32
    invoke-static {v4}, Lorg/apache/tika/parser/ParsingReader;->b(Lorg/apache/tika/parser/ParsingReader;)Lorg/apache/tika/parser/ParseContext;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-interface {v1, v2, v0, v3, v4}, Lorg/apache/tika/parser/Parser;->parse(Ljava/io/InputStream;Lorg/xml/sax/ContentHandler;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    iget-object v1, p0, Lorg/apache/tika/parser/ParsingReader$ParsingTask;->this$0:Lorg/apache/tika/parser/ParsingReader;

    .line 42
    .line 43
    invoke-static {v1, v0}, Lorg/apache/tika/parser/ParsingReader;->h(Lorg/apache/tika/parser/ParsingReader;Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    :goto_0
    :try_start_1
    iget-object v0, p0, Lorg/apache/tika/parser/ParsingReader$ParsingTask;->this$0:Lorg/apache/tika/parser/ParsingReader;

    .line 47
    .line 48
    invoke-static {v0}, Lorg/apache/tika/parser/ParsingReader;->e(Lorg/apache/tika/parser/ParsingReader;)Ljava/io/InputStream;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :catchall_1
    move-exception v0

    .line 57
    iget-object v1, p0, Lorg/apache/tika/parser/ParsingReader$ParsingTask;->this$0:Lorg/apache/tika/parser/ParsingReader;

    .line 58
    .line 59
    invoke-static {v1}, Lorg/apache/tika/parser/ParsingReader;->f(Lorg/apache/tika/parser/ParsingReader;)Ljava/lang/Throwable;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    if-nez v1, :cond_0

    .line 64
    .line 65
    iget-object v1, p0, Lorg/apache/tika/parser/ParsingReader$ParsingTask;->this$0:Lorg/apache/tika/parser/ParsingReader;

    .line 66
    .line 67
    invoke-static {v1, v0}, Lorg/apache/tika/parser/ParsingReader;->h(Lorg/apache/tika/parser/ParsingReader;Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    :cond_0
    :goto_1
    :try_start_2
    iget-object v0, p0, Lorg/apache/tika/parser/ParsingReader$ParsingTask;->this$0:Lorg/apache/tika/parser/ParsingReader;

    .line 71
    .line 72
    invoke-static {v0}, Lorg/apache/tika/parser/ParsingReader;->g(Lorg/apache/tika/parser/ParsingReader;)Ljava/io/Writer;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0}, Ljava/io/Writer;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 77
    .line 78
    .line 79
    goto :goto_2

    .line 80
    :catchall_2
    move-exception v0

    .line 81
    iget-object v1, p0, Lorg/apache/tika/parser/ParsingReader$ParsingTask;->this$0:Lorg/apache/tika/parser/ParsingReader;

    .line 82
    .line 83
    invoke-static {v1}, Lorg/apache/tika/parser/ParsingReader;->f(Lorg/apache/tika/parser/ParsingReader;)Ljava/lang/Throwable;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    if-nez v1, :cond_1

    .line 88
    .line 89
    iget-object v1, p0, Lorg/apache/tika/parser/ParsingReader$ParsingTask;->this$0:Lorg/apache/tika/parser/ParsingReader;

    .line 90
    .line 91
    invoke-static {v1, v0}, Lorg/apache/tika/parser/ParsingReader;->h(Lorg/apache/tika/parser/ParsingReader;Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    :cond_1
    :goto_2
    return-void
.end method

.class Lcom/github/dart_lang/jni/PortCleaner;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/github/dart_lang/jni/PortCleaner$PortPhantom;
    }
.end annotation


# instance fields
.field private final list:Lcom/github/dart_lang/jni/PortCleaner$PortPhantom;

.field private final queue:Ljava/lang/ref/ReferenceQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/ReferenceQueue<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "dartjni"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/ref/ReferenceQueue;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/github/dart_lang/jni/PortCleaner;->queue:Ljava/lang/ref/ReferenceQueue;

    .line 10
    .line 11
    new-instance v0, Lcom/github/dart_lang/jni/PortCleaner$PortPhantom;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lcom/github/dart_lang/jni/PortCleaner$PortPhantom;-><init>(Lcom/github/dart_lang/jni/PortCleaner;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/github/dart_lang/jni/PortCleaner;->list:Lcom/github/dart_lang/jni/PortCleaner$PortPhantom;

    .line 17
    .line 18
    new-instance v0, Ljava/lang/Thread;

    .line 19
    .line 20
    new-instance v1, Lcom/github/dart_lang/jni/a;

    .line 21
    .line 22
    invoke-direct {v1, p0}, Lcom/github/dart_lang/jni/a;-><init>(Lcom/github/dart_lang/jni/PortCleaner;)V

    .line 23
    .line 24
    .line 25
    const-string v2, "PortCleaner"

    .line 26
    .line 27
    invoke-direct {v0, v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public static synthetic a(Lcom/github/dart_lang/jni/PortCleaner;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/github/dart_lang/jni/PortCleaner;->lambda$new$0()V

    return-void
.end method

.method public static bridge synthetic b(Lcom/github/dart_lang/jni/PortCleaner;)Lcom/github/dart_lang/jni/PortCleaner$PortPhantom;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/github/dart_lang/jni/PortCleaner;->list:Lcom/github/dart_lang/jni/PortCleaner$PortPhantom;

    return-object p0
.end method

.method public static bridge synthetic c(Lcom/github/dart_lang/jni/PortCleaner;)Ljava/lang/ref/ReferenceQueue;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/github/dart_lang/jni/PortCleaner;->queue:Ljava/lang/ref/ReferenceQueue;

    return-object p0
.end method

.method private static native clean(J)V
.end method

.method private synthetic lambda$new$0()V
    .locals 4

    .line 1
    :catchall_0
    :cond_0
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/github/dart_lang/jni/PortCleaner;->queue:Ljava/lang/ref/ReferenceQueue;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/ReferenceQueue;->remove()Ljava/lang/ref/Reference;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/github/dart_lang/jni/PortCleaner$PortPhantom;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/github/dart_lang/jni/PortCleaner$PortPhantom;->a(Lcom/github/dart_lang/jni/PortCleaner$PortPhantom;)V

    .line 10
    .line 11
    .line 12
    iget-wide v0, v0, Lcom/github/dart_lang/jni/PortCleaner$PortPhantom;->port:J

    .line 13
    .line 14
    const-wide/16 v2, 0x0

    .line 15
    .line 16
    cmp-long v2, v0, v2

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-static {v0, v1}, Lcom/github/dart_lang/jni/PortCleaner;->clean(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    goto :goto_0
.end method


# virtual methods
.method public register(Ljava/lang/Object;J)V
    .locals 1

    .line 1
    new-instance v0, Lcom/github/dart_lang/jni/PortCleaner$PortPhantom;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/github/dart_lang/jni/PortCleaner$PortPhantom;-><init>(Lcom/github/dart_lang/jni/PortCleaner;Ljava/lang/Object;J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

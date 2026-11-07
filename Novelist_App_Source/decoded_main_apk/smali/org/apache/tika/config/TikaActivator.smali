.class public Lorg/apache/tika/config/TikaActivator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/osgi/framework/BundleActivator;
.implements Lorg/osgi/util/tracker/ServiceTrackerCustomizer;


# instance fields
.field private bundleContext:Lorg/osgi/framework/BundleContext;

.field private detectorTracker:Lorg/osgi/util/tracker/ServiceTracker;

.field private parserTracker:Lorg/osgi/util/tracker/ServiceTracker;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public addingService(Lorg/osgi/framework/ServiceReference;)Ljava/lang/Object;
    .locals 2

    .line 1
    const-string v0, "service.ranking"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lorg/osgi/framework/ServiceReference;->getProperty(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, Ljava/lang/Integer;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    check-cast v0, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    iget-object v1, p0, Lorg/apache/tika/config/TikaActivator;->bundleContext:Lorg/osgi/framework/BundleContext;

    .line 20
    .line 21
    invoke-interface {v1, p1}, Lorg/osgi/framework/BundleContext;->getService(Lorg/osgi/framework/ServiceReference;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {p1, v1, v0}, Lorg/apache/tika/config/ServiceLoader;->addService(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 26
    .line 27
    .line 28
    return-object v1
.end method

.method public modifiedService(Lorg/osgi/framework/ServiceReference;Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public removedService(Lorg/osgi/framework/ServiceReference;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lorg/apache/tika/config/ServiceLoader;->removeService(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Lorg/apache/tika/config/TikaActivator;->bundleContext:Lorg/osgi/framework/BundleContext;

    .line 5
    .line 6
    invoke-interface {p2, p1}, Lorg/osgi/framework/BundleContext;->ungetService(Lorg/osgi/framework/ServiceReference;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public start(Lorg/osgi/framework/BundleContext;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lorg/apache/tika/config/TikaActivator;->bundleContext:Lorg/osgi/framework/BundleContext;

    .line 2
    .line 3
    new-instance v0, Lorg/osgi/util/tracker/ServiceTracker;

    .line 4
    .line 5
    const-class v1, Lorg/apache/tika/detect/Detector;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, p1, v1, p0}, Lorg/osgi/util/tracker/ServiceTracker;-><init>(Lorg/osgi/framework/BundleContext;Ljava/lang/String;Lorg/osgi/util/tracker/ServiceTrackerCustomizer;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lorg/apache/tika/config/TikaActivator;->detectorTracker:Lorg/osgi/util/tracker/ServiceTracker;

    .line 15
    .line 16
    new-instance v0, Lorg/osgi/util/tracker/ServiceTracker;

    .line 17
    .line 18
    const-class v1, Lorg/apache/tika/parser/Parser;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-direct {v0, p1, v1, p0}, Lorg/osgi/util/tracker/ServiceTracker;-><init>(Lorg/osgi/framework/BundleContext;Ljava/lang/String;Lorg/osgi/util/tracker/ServiceTrackerCustomizer;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lorg/apache/tika/config/TikaActivator;->parserTracker:Lorg/osgi/util/tracker/ServiceTracker;

    .line 28
    .line 29
    iget-object p1, p0, Lorg/apache/tika/config/TikaActivator;->detectorTracker:Lorg/osgi/util/tracker/ServiceTracker;

    .line 30
    .line 31
    invoke-virtual {p1}, Lorg/osgi/util/tracker/ServiceTracker;->open()V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lorg/apache/tika/config/TikaActivator;->parserTracker:Lorg/osgi/util/tracker/ServiceTracker;

    .line 35
    .line 36
    invoke-virtual {p1}, Lorg/osgi/util/tracker/ServiceTracker;->open()V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public stop(Lorg/osgi/framework/BundleContext;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lorg/apache/tika/config/TikaActivator;->parserTracker:Lorg/osgi/util/tracker/ServiceTracker;

    .line 2
    .line 3
    invoke-virtual {p1}, Lorg/osgi/util/tracker/ServiceTracker;->close()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lorg/apache/tika/config/TikaActivator;->detectorTracker:Lorg/osgi/util/tracker/ServiceTracker;

    .line 7
    .line 8
    invoke-virtual {p1}, Lorg/osgi/util/tracker/ServiceTracker;->close()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

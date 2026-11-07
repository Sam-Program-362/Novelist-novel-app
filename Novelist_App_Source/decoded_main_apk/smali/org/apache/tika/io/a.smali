.class public abstract synthetic Lorg/apache/tika/io/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static bridge synthetic a(Lr1/b;)Landroid/window/OnBackInvokedDispatcher;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getOnBackInvokedDispatcher()Landroid/window/OnBackInvokedDispatcher;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic b()Ljava/io/InputStream;
    .locals 1

    .line 1
    invoke-static {}, Ljava/io/InputStream;->nullInputStream()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public static bridge synthetic c(Landroid/window/OnBackInvokedDispatcher;Landroid/window/OnBackInvokedCallback;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-interface {p0, v0, p1}, Landroid/window/OnBackInvokedDispatcher;->registerOnBackInvokedCallback(ILandroid/window/OnBackInvokedCallback;)V

    return-void
.end method

.method public static bridge synthetic d(Ljava/io/InputStream;I)[B
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ljava/io/InputStream;->readNBytes(I)[B

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic e(Ljava/util/ArrayList;Lz2/a;)[Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Ljava/util/List;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic f(Ljava/util/ArrayList;Lz2/a;)[Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Ljava/util/List;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

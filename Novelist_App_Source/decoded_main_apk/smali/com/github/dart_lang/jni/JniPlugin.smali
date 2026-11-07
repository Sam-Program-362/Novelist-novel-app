.class public Lcom/github/dart_lang/jni/JniPlugin;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/b;


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
    const-class v0, Lcom/github/dart_lang/jni/JniPlugin;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Lcom/github/dart_lang/jni/JniPlugin;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static native setClassLoader(Ljava/lang/ClassLoader;)V
.end method


# virtual methods
.method public onAttachedToEngine(Ly1/a;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onDetachedFromEngine(Ly1/a;)V
    .locals 0

    .line 1
    return-void
.end method

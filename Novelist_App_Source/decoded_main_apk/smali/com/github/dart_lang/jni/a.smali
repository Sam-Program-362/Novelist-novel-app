.class public final synthetic Lcom/github/dart_lang/jni/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lcom/github/dart_lang/jni/PortCleaner;


# direct methods
.method public synthetic constructor <init>(Lcom/github/dart_lang/jni/PortCleaner;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/github/dart_lang/jni/a;->k:Lcom/github/dart_lang/jni/PortCleaner;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/github/dart_lang/jni/a;->k:Lcom/github/dart_lang/jni/PortCleaner;

    invoke-static {v0}, Lcom/github/dart_lang/jni/PortCleaner;->a(Lcom/github/dart_lang/jni/PortCleaner;)V

    return-void
.end method

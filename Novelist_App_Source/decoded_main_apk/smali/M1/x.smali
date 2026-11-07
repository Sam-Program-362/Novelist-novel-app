.class public final LM1/x;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:LM1/s;


# direct methods
.method public constructor <init>(Ljava/lang/String;LM1/s;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LM1/x;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, LM1/x;->b:LM1/s;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public postMessage(Ljava/lang/String;)V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LM1/x;->b:LM1/s;

    .line 2
    .line 3
    iget-object v0, v0, LM1/s;->a:LM1/O;

    .line 4
    .line 5
    new-instance v1, LM/c;

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    invoke-direct {v1, p0, p1, v2}, LM/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, LM1/O;->e(Ljava/lang/Runnable;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

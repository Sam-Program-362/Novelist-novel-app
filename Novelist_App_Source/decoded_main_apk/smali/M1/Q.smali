.class public final LM1/Q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Throwable;

.field public final d:Z


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LM1/Q;->a:Ljava/lang/Object;

    .line 5
    .line 6
    instance-of v0, p1, LO1/c;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object v1, p1

    .line 13
    :goto_0
    iput-object v1, p0, LM1/Q;->b:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-static {p1}, LO1/d;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, LM1/Q;->c:Ljava/lang/Throwable;

    .line 20
    .line 21
    iput-boolean v0, p0, LM1/Q;->d:Z

    .line 22
    .line 23
    return-void
.end method

.class public final LL1/b;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# instance fields
.field public final k:Ljava/lang/String;

.field public final l:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "NO_ACTIVITY"

    .line 5
    .line 6
    iput-object v0, p0, LL1/b;->k:Ljava/lang/String;

    .line 7
    .line 8
    const-string v0, "Launching a URL requires a foreground activity."

    .line 9
    .line 10
    iput-object v0, p0, LL1/b;->l:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final getMessage()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LL1/b;->l:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

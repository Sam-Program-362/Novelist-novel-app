.class public final Li2/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li2/K;


# instance fields
.field public final a:Li2/X;


# direct methods
.method public constructor <init>(Li2/X;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li2/J;->a:Li2/X;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final d()Li2/X;
    .locals 1

    .line 1
    iget-object v0, p0, Li2/J;->a:Li2/X;

    .line 2
    .line 3
    return-object v0
.end method

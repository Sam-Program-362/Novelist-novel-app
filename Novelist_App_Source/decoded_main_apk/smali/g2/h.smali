.class public final Lg2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lb2/a;


# instance fields
.field public final synthetic k:Lg2/c;


# direct methods
.method public constructor <init>(Lg2/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg2/h;->k:Lg2/c;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    new-instance v0, Lh2/b;

    .line 2
    .line 3
    iget-object v1, p0, Lg2/h;->k:Lg2/c;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lh2/b;-><init>(Lg2/c;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

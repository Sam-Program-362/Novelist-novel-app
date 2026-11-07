.class public final synthetic Lj1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lj1/c;

.field public final synthetic l:Z


# direct methods
.method public synthetic constructor <init>(Lj1/c;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj1/b;->k:Lj1/c;

    iput-boolean p2, p0, Lj1/b;->l:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lj1/b;->k:Lj1/c;

    .line 2
    .line 3
    iget-object v0, v0, Lj1/c;->r:LC1/g;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-boolean v1, p0, Lj1/b;->l:Z

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, LC1/g;->a(Ljava/io/Serializable;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

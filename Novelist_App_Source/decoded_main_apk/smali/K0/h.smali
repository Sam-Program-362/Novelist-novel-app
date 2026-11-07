.class public final LK0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:LK0/h;


# instance fields
.field public final a:LB1/b;

.field public final b:Landroid/os/Looper;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LB1/b;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    invoke-direct {v0, v1}, LB1/b;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, LK0/h;

    .line 13
    .line 14
    invoke-direct {v2, v0, v1}, LK0/h;-><init>(LB1/b;Landroid/os/Looper;)V

    .line 15
    .line 16
    .line 17
    sput-object v2, LK0/h;->c:LK0/h;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(LB1/b;Landroid/os/Looper;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LK0/h;->a:LB1/b;

    .line 5
    .line 6
    iput-object p2, p0, LK0/h;->b:Landroid/os/Looper;

    .line 7
    .line 8
    return-void
.end method

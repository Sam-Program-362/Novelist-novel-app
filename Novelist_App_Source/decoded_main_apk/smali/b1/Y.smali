.class public final Lb1/Y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lb1/Y;


# instance fields
.field public final a:Lb1/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lb1/Y;

    .line 2
    .line 3
    invoke-direct {v0}, Lb1/Y;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lb1/Y;->b:Lb1/Y;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lb1/a0;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lb1/c;

    .line 10
    .line 11
    invoke-direct {v1, v0}, Lb1/c;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput-object v1, p0, Lb1/Y;->a:Lb1/c;

    .line 15
    .line 16
    return-void
.end method

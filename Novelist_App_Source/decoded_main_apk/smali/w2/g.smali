.class public final Lw2/g;
.super Lt2/d;
.source "SourceFile"


# static fields
.field public static final synthetic o:I


# instance fields
.field public n:I


# virtual methods
.method public final W([B)V
    .locals 1

    .line 1
    const-string v0, "origin"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    array-length v0, p1

    .line 7
    iput v0, p0, Lw2/g;->n:I

    .line 8
    .line 9
    new-instance v0, Lt2/a;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Lt2/a;-><init>([B)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lt2/b;->m:Lt2/a;

    .line 15
    .line 16
    return-void
.end method

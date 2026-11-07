.class public final Lw2/b;
.super Ljava/io/InputStream;
.source "SourceFile"


# static fields
.field public static final k:Lw2/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lw2/b;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/InputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lw2/b;->k:Lw2/b;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final read()I
    .locals 1

    .line 1
    const/4 v0, -0x1

    return v0
.end method

.method public final read([BII)I
    .locals 0

    .line 2
    const/4 p1, -0x1

    return p1
.end method

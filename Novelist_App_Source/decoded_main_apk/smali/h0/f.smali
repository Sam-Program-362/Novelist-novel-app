.class public final Lh0/f;
.super La/a;
.source "SourceFile"


# static fields
.field public static final m:Lh0/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lh0/f;

    .line 2
    .line 3
    const/16 v1, 0x13

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/a;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lh0/f;->m:Lh0/f;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "Idle()"

    .line 2
    .line 3
    return-object v0
.end method

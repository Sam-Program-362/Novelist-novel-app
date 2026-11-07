.class public final LX/a;
.super La2/i;
.source "SourceFile"

# interfaces
.implements LZ1/l;


# static fields
.field public static final l:LX/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LX/a;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, La2/i;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LX/a;->l:LX/a;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Landroid/content/Context;

    .line 2
    .line 3
    const-string v0, "it"

    .line 4
    .line 5
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object p1, LP1/m;->k:LP1/m;

    .line 9
    .line 10
    return-object p1
.end method

.class public abstract LE0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LA/c;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LK0/d;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, LE0/b;

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-direct {v1, v2}, LE0/b;-><init>(I)V

    .line 10
    .line 11
    .line 12
    new-instance v2, LA/c;

    .line 13
    .line 14
    const-string v3, "Auth.GOOGLE_SIGN_IN_API"

    .line 15
    .line 16
    invoke-direct {v2, v3, v1, v0}, LA/c;-><init>(Ljava/lang/String;LH2/h;LK0/d;)V

    .line 17
    .line 18
    .line 19
    sput-object v2, LE0/a;->a:LA/c;

    .line 20
    .line 21
    return-void
.end method

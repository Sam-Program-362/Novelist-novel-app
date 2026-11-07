.class public abstract LT1/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LT1/f;

.field public static b:LT1/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LT1/f;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, v1, v1}, LT1/f;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LT1/g;->a:LT1/f;

    .line 8
    .line 9
    return-void
.end method

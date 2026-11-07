.class public abstract Ls0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LB1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LB1/a;

    .line 2
    .line 3
    sget-object v1, Ls0/l;->a:Ls0/m;

    .line 4
    .line 5
    invoke-interface {v1}, Ls0/m;->getWebkitToCompatConverter()Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/16 v2, 0x19

    .line 10
    .line 11
    invoke-direct {v0, v1, v2}, LB1/a;-><init>(Ljava/lang/Object;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Ls0/k;->a:LB1/a;

    .line 15
    .line 16
    return-void
.end method

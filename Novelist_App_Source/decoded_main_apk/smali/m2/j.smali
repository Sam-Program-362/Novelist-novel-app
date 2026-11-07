.class public final Lm2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR1/c;


# static fields
.field public static final k:Lm2/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lm2/j;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lm2/j;->k:Lm2/j;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getContext()LR1/h;
    .locals 1

    .line 1
    sget-object v0, LR1/i;->k:LR1/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method

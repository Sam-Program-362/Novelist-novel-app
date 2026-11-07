.class public final LM1/a;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# instance fields
.field public final k:Ljava/lang/String;

.field public final l:Ljava/lang/String;

.field public final m:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LM1/a;->k:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, LM1/a;->l:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, LM1/a;->m:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final getMessage()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LM1/a;->l:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

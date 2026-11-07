.class public final LB1/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LA0/j;

.field public final b:LB1/s;


# direct methods
.method public constructor <init>(Lt1/c;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LA0/j;

    .line 5
    .line 6
    invoke-direct {v0}, LA0/j;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LB1/r;->a:LA0/j;

    .line 10
    .line 11
    new-instance v0, LB1/s;

    .line 12
    .line 13
    sget-object v1, LC1/j;->a:LC1/j;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const-string v3, "flutter/settings"

    .line 17
    .line 18
    invoke-direct {v0, p1, v3, v1, v2}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, LB1/r;->b:LB1/s;

    .line 22
    .line 23
    return-void
.end method

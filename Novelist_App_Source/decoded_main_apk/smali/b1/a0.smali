.class public final Lb1/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb1/Z;


# static fields
.field public static final a:LB1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget v0, Lb1/k;->m:I

    .line 2
    .line 3
    sget-object v0, Lb1/u;->s:[Ljava/lang/Object;

    .line 4
    .line 5
    new-instance v0, Lb1/x;

    .line 6
    .line 7
    const-string v1, "FIDO"

    .line 8
    .line 9
    invoke-direct {v0, v1}, Lb1/x;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    new-instance v0, LB1/a;

    .line 13
    .line 14
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 15
    .line 16
    const/16 v2, 0x10

    .line 17
    .line 18
    invoke-direct {v0, v1, v2}, LB1/a;-><init>(Ljava/lang/Object;I)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lb1/a0;->a:LB1/a;

    .line 22
    .line 23
    return-void
.end method

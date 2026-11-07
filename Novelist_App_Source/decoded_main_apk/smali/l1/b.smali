.class public final Ll1/b;
.super La/a;
.source "SourceFile"


# instance fields
.field public final m:LH0/i;

.field public final n:LA/c;


# direct methods
.method public constructor <init>(LA/c;LB1/o;)V
    .locals 1

    .line 1
    const/16 v0, 0x15

    .line 2
    .line 3
    invoke-direct {p0, v0}, La/a;-><init>(I)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Ll1/b;->n:LA/c;

    .line 7
    .line 8
    new-instance p1, LH0/i;

    .line 9
    .line 10
    const/16 v0, 0x18

    .line 11
    .line 12
    invoke-direct {p1, p2, v0}, LH0/i;-><init>(Ljava/lang/Object;I)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Ll1/b;->m:LH0/i;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final A()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ll1/b;->n:LA/c;

    .line 2
    .line 3
    iget-object v0, v0, LA/c;->l:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/lang/String;

    .line 6
    .line 7
    return-object v0
.end method

.method public final C()Ll1/c;
    .locals 1

    .line 1
    iget-object v0, p0, Ll1/b;->m:LH0/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public final F()Z
    .locals 3

    .line 1
    iget-object v0, p0, Ll1/b;->n:LA/c;

    .line 2
    .line 3
    iget-object v0, v0, LA/c;->m:Ljava/lang/Object;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    :cond_0
    instance-of v1, v0, Ljava/util/Map;

    .line 10
    .line 11
    const-string v2, "transactionId"

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    check-cast v0, Ljava/util/Map;

    .line 16
    .line 17
    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    return v0

    .line 22
    :cond_1
    instance-of v1, v0, Lorg/json/JSONObject;

    .line 23
    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    check-cast v0, Lorg/json/JSONObject;

    .line 27
    .line 28
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    return v0

    .line 33
    :cond_2
    new-instance v0, Ljava/lang/ClassCastException;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 36
    .line 37
    .line 38
    throw v0
.end method

.method public final x(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ll1/b;->n:LA/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LA/c;->i(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

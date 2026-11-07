.class public final Ld0/c;
.super Ld0/b;
.source "SourceFile"


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    sget-object p1, Ld0/a;->b:Ld0/a;

    invoke-direct {p0, p1}, Ld0/c;-><init>(Ld0/b;)V

    return-void
.end method

.method public constructor <init>(Ld0/b;)V
    .locals 1

    const-string v0, "initialExtras"

    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ld0/b;-><init>()V

    .line 3
    iget-object v0, p0, Ld0/b;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedHashMap;

    iget-object p1, p1, Ld0/b;->a:Ljava/lang/Object;

    check-cast p1, Ljava/util/LinkedHashMap;

    .line 4
    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method

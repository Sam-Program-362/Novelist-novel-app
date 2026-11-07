.class public final synthetic LM1/W;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ1/l;


# instance fields
.field public final synthetic k:I

.field public final synthetic l:LM1/Z;

.field public final synthetic m:Landroid/webkit/JsResult;


# direct methods
.method public synthetic constructor <init>(LM1/Z;Landroid/webkit/JsResult;I)V
    .locals 0

    .line 1
    iput p3, p0, LM1/W;->k:I

    iput-object p1, p0, LM1/W;->l:LM1/Z;

    iput-object p2, p0, LM1/W;->m:Landroid/webkit/JsResult;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, LM1/W;->k:I

    .line 2
    .line 3
    check-cast p1, LM1/Q;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p1, LM1/Q;->d:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, LM1/W;->l:LM1/Z;

    .line 13
    .line 14
    iget-object v0, v0, LM1/Z;->b:LM1/n;

    .line 15
    .line 16
    iget-object v0, v0, LM1/n;->a:LM1/O;

    .line 17
    .line 18
    iget-object p1, p1, LM1/Q;->c:Ljava/lang/Throwable;

    .line 19
    .line 20
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-static {p1}, LM1/O;->d(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object p1, p0, LM1/W;->m:Landroid/webkit/JsResult;

    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/webkit/JsResult;->confirm()V

    .line 33
    .line 34
    .line 35
    :goto_0
    const/4 p1, 0x0

    .line 36
    return-object p1

    .line 37
    :pswitch_0
    iget-boolean v0, p1, LM1/Q;->d:Z

    .line 38
    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    iget-object v0, p0, LM1/W;->l:LM1/Z;

    .line 42
    .line 43
    iget-object v0, v0, LM1/Z;->b:LM1/n;

    .line 44
    .line 45
    iget-object v0, v0, LM1/n;->a:LM1/O;

    .line 46
    .line 47
    iget-object p1, p1, LM1/Q;->c:Ljava/lang/Throwable;

    .line 48
    .line 49
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-static {p1}, LM1/O;->d(Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 60
    .line 61
    iget-object p1, p1, LM1/Q;->b:Ljava/lang/Object;

    .line 62
    .line 63
    invoke-virtual {v0, p1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    iget-object v0, p0, LM1/W;->m:Landroid/webkit/JsResult;

    .line 68
    .line 69
    if-eqz p1, :cond_2

    .line 70
    .line 71
    invoke-virtual {v0}, Landroid/webkit/JsResult;->confirm()V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    invoke-virtual {v0}, Landroid/webkit/JsResult;->cancel()V

    .line 76
    .line 77
    .line 78
    :goto_1
    const/4 p1, 0x0

    .line 79
    return-object p1

    .line 80
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

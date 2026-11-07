.class public abstract Lr1/b;
.super Landroid/app/Activity;
.source "SourceFile"

# interfaces
.implements Lr1/d;
.implements Landroidx/lifecycle/s;


# static fields
.field public static final o:I


# instance fields
.field public k:Z

.field public l:Lr1/e;

.field public final m:Landroidx/lifecycle/u;

.field public final n:Landroid/window/OnBackInvokedCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sput v0, Lr1/b;->o:I

    .line 6
    .line 7
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lr1/b;->k:Z

    .line 6
    .line 7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 8
    .line 9
    const/16 v1, 0x21

    .line 10
    .line 11
    if-ge v0, v1, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/16 v1, 0x22

    .line 16
    .line 17
    if-lt v0, v1, :cond_1

    .line 18
    .line 19
    new-instance v0, Lh0/k;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-direct {v0, p0, v1}, Lh0/k;-><init>(Ljava/lang/Object;I)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    new-instance v0, Lh0/j;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-direct {v0, p0, v1}, Lh0/j;-><init>(Ljava/lang/Object;I)V

    .line 30
    .line 31
    .line 32
    :goto_0
    iput-object v0, p0, Lr1/b;->n:Landroid/window/OnBackInvokedCallback;

    .line 33
    .line 34
    new-instance v0, Landroidx/lifecycle/u;

    .line 35
    .line 36
    invoke-direct {v0, p0}, Landroidx/lifecycle/u;-><init>(Landroidx/lifecycle/s;)V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Lr1/b;->m:Landroidx/lifecycle/u;

    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 6
    .line 7
    and-int/lit8 v0, v0, 0x2

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "android.intent.action.RUN"

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_0
    const/4 v0, 0x0

    .line 39
    return-object v0
.end method

.method public final d()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "background_mode"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    const-string v1, "opaque"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const-string v1, "transparent"

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    const/4 v0, 0x2

    .line 42
    :goto_0
    return v0

    .line 43
    :cond_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 44
    .line 45
    const-string v2, "No enum constant io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode."

    .line 46
    .line 47
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v1

    .line 55
    :cond_2
    new-instance v0, Ljava/lang/NullPointerException;

    .line 56
    .line 57
    const-string v1, "Name is null"

    .line 58
    .line 59
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v0

    .line 63
    :cond_3
    const/4 v0, 0x1

    .line 64
    return v0
.end method

.method public final e()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "cached_engine_id"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "dart_entrypoint"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0

    .line 22
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lr1/b;->i()Landroid/os/Bundle;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    const-string v1, "io.flutter.Entrypoint"

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v0, 0x0

    .line 36
    :goto_0
    if-eqz v0, :cond_2

    .line 37
    .line 38
    return-object v0

    .line 39
    :catch_0
    :cond_2
    const-string v0, "main"

    .line 40
    .line 41
    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "route"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0

    .line 22
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lr1/b;->i()Landroid/os/Bundle;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    const-string v1, "io.flutter.InitialRoute"

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    return-object v0

    .line 35
    :catch_0
    :cond_1
    const/4 v0, 0x0

    .line 36
    return-object v0
.end method

.method public final h()Landroidx/lifecycle/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lr1/b;->m:Landroidx/lifecycle/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()Landroid/os/Bundle;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/16 v2, 0x80

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->metaData:Landroid/os/Bundle;

    .line 16
    .line 17
    return-object v0
.end method

.method public final j(Z)V
    .locals 2

    .line 1
    const/16 v0, 0x21

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-boolean v1, p0, Lr1/b;->k:Z

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    if-lt p1, v0, :cond_1

    .line 12
    .line 13
    invoke-static {p0}, Lorg/apache/tika/io/a;->a(Lr1/b;)Landroid/window/OnBackInvokedDispatcher;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object v0, p0, Lr1/b;->n:Landroid/window/OnBackInvokedCallback;

    .line 18
    .line 19
    invoke-static {p1, v0}, Lorg/apache/tika/io/a;->c(Landroid/window/OnBackInvokedDispatcher;Landroid/window/OnBackInvokedCallback;)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    iput-boolean p1, p0, Lr1/b;->k:Z

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    if-nez p1, :cond_1

    .line 27
    .line 28
    iget-boolean p1, p0, Lr1/b;->k:Z

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 33
    .line 34
    if-lt p1, v0, :cond_1

    .line 35
    .line 36
    invoke-static {p0}, Lorg/apache/tika/io/a;->a(Lr1/b;)Landroid/window/OnBackInvokedDispatcher;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iget-object v0, p0, Lr1/b;->n:Landroid/window/OnBackInvokedCallback;

    .line 41
    .line 42
    invoke-static {p1, v0}, LE/c;->z(Landroid/window/OnBackInvokedDispatcher;Landroid/window/OnBackInvokedCallback;)V

    .line 43
    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    iput-boolean p1, p0, Lr1/b;->k:Z

    .line 47
    .line 48
    :cond_1
    return-void
.end method

.method public final k()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const-string v2, "destroy_engine_with_activity"

    .line 7
    .line 8
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p0}, Lr1/b;->e()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    iget-object v1, p0, Lr1/b;->l:Lr1/e;

    .line 19
    .line 20
    iget-boolean v1, v1, Lr1/e;->g:Z

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const/4 v1, 0x1

    .line 30
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    :cond_1
    :goto_0
    return v0
.end method

.method public final l()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "enable_state_restoration"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    return v0

    .line 23
    :cond_0
    invoke-virtual {p0}, Lr1/b;->e()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    return v2

    .line 30
    :cond_1
    const/4 v0, 0x1

    .line 31
    return v0
.end method

.method public final m(Ljava/lang/String;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lr1/b;->l:Lr1/e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, " "

    .line 5
    .line 6
    const-string v3, "FlutterActivity "

    .line 7
    .line 8
    const-string v4, "FlutterActivity"

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string p1, " called after release."

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {v4, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 40
    .line 41
    .line 42
    return v1

    .line 43
    :cond_0
    iget-boolean v0, v0, Lr1/e;->j:Z

    .line 44
    .line 45
    if-nez v0, :cond_1

    .line 46
    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string p1, " called after detach."

    .line 66
    .line 67
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-static {v4, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 75
    .line 76
    .line 77
    return v1

    .line 78
    :cond_1
    const/4 p1, 0x1

    .line 79
    return p1
.end method

.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    .line 1
    const-string v0, "onActivityResult"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lr1/b;->m(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_5

    .line 8
    .line 9
    iget-object v0, p0, Lr1/b;->l:Lr1/e;

    .line 10
    .line 11
    invoke-virtual {v0}, Lr1/e;->c()V

    .line 12
    .line 13
    .line 14
    iget-object v1, v0, Lr1/e;->b:Ls1/c;

    .line 15
    .line 16
    if-eqz v1, :cond_4

    .line 17
    .line 18
    invoke-static {p3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    iget-object v0, v0, Lr1/e;->b:Ls1/c;

    .line 22
    .line 23
    iget-object v0, v0, Ls1/c;->d:Lj0/a;

    .line 24
    .line 25
    invoke-virtual {v0}, Lj0/a;->f()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_3

    .line 30
    .line 31
    const-string v1, "FlutterEngineConnectionRegistry#onActivityResult"

    .line 32
    .line 33
    invoke-static {v1}, LN1/a;->b(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :try_start_0
    iget-object v0, v0, Lj0/a;->h:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Lk/u0;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    new-instance v1, Ljava/util/HashSet;

    .line 44
    .line 45
    iget-object v0, v0, Lk/u0;->d:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Ljava/util/HashSet;

    .line 48
    .line 49
    invoke-direct {v1, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const/4 v1, 0x0

    .line 57
    :cond_0
    move v2, v1

    .line 58
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-eqz v3, :cond_2

    .line 63
    .line 64
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    check-cast v3, LC1/o;

    .line 69
    .line 70
    invoke-interface {v3, p1, p2, p3}, LC1/o;->a(IILandroid/content/Intent;)Z

    .line 71
    .line 72
    .line 73
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    if-nez v3, :cond_1

    .line 75
    .line 76
    if-eqz v2, :cond_0

    .line 77
    .line 78
    :cond_1
    const/4 v2, 0x1

    .line 79
    goto :goto_0

    .line 80
    :catchall_0
    move-exception p1

    .line 81
    goto :goto_1

    .line 82
    :cond_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :goto_1
    :try_start_1
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :catchall_1
    move-exception p2

    .line 91
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    :goto_2
    throw p1

    .line 95
    :cond_3
    const-string p1, "FlutterEngineCxnRegstry"

    .line 96
    .line 97
    const-string p2, "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached."

    .line 98
    .line 99
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :cond_4
    const-string p1, "FlutterActivityAndFragmentDelegate"

    .line 104
    .line 105
    const-string p2, "onActivityResult() invoked before FlutterFragment was attached to an Activity."

    .line 106
    .line 107
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 108
    .line 109
    .line 110
    :cond_5
    return-void
.end method

.method public final onBackPressed()V
    .locals 3

    .line 1
    const-string v0, "onBackPressed"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lr1/b;->m(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lr1/b;->l:Lr1/e;

    .line 10
    .line 11
    invoke-virtual {v0}, Lr1/e;->c()V

    .line 12
    .line 13
    .line 14
    iget-object v0, v0, Lr1/e;->b:Ls1/c;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v0, v0, Ls1/c;->i:LB1/c;

    .line 19
    .line 20
    iget-object v0, v0, LB1/c;->a:LB1/s;

    .line 21
    .line 22
    const-string v1, "popRoute"

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-virtual {v0, v1, v2, v2}, LB1/s;->s(Ljava/lang/String;Ljava/lang/Object;LB1/o;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    const-string v0, "FlutterActivityAndFragmentDelegate"

    .line 30
    .line 31
    const-string v1, "Invoked onBackPressed() before FlutterFragment was attached to an Activity."

    .line 32
    .line 33
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    :cond_1
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {v1}, Lr1/b;->i()Landroid/os/Bundle;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    const-string v3, "io.flutter.embedding.android.NormalTheme"

    .line 12
    .line 13
    const/4 v4, -0x1

    .line 14
    invoke-virtual {v2, v3, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eq v2, v4, :cond_0

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Landroid/content/Context;->setTheme(I)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catch_0
    const-string v2, "FlutterActivity"

    .line 25
    .line 26
    const-string v3, "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme."

    .line 27
    .line 28
    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    :cond_0
    :goto_0
    invoke-super/range {p0 .. p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 32
    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    const-string v2, "enableOnBackInvokedCallbackState"

    .line 37
    .line 38
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-virtual {v1, v2}, Lr1/b;->j(Z)V

    .line 43
    .line 44
    .line 45
    :cond_1
    new-instance v2, Lr1/e;

    .line 46
    .line 47
    invoke-direct {v2, v1}, Lr1/e;-><init>(Lr1/b;)V

    .line 48
    .line 49
    .line 50
    iput-object v2, v1, Lr1/b;->l:Lr1/e;

    .line 51
    .line 52
    invoke-virtual {v2}, Lr1/e;->c()V

    .line 53
    .line 54
    .line 55
    iget-object v3, v2, Lr1/e;->b:Ls1/c;

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    const/4 v5, 0x0

    .line 59
    const/4 v6, 0x1

    .line 60
    if-nez v3, :cond_27

    .line 61
    .line 62
    iget-object v3, v2, Lr1/e;->a:Lr1/b;

    .line 63
    .line 64
    invoke-virtual {v3}, Lr1/b;->e()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    if-eqz v3, :cond_4

    .line 69
    .line 70
    sget-object v7, Ls1/i;->c:Ls1/i;

    .line 71
    .line 72
    if-nez v7, :cond_2

    .line 73
    .line 74
    new-instance v7, Ls1/i;

    .line 75
    .line 76
    const/4 v8, 0x1

    .line 77
    invoke-direct {v7, v8}, Ls1/i;-><init>(I)V

    .line 78
    .line 79
    .line 80
    sput-object v7, Ls1/i;->c:Ls1/i;

    .line 81
    .line 82
    :cond_2
    sget-object v7, Ls1/i;->c:Ls1/i;

    .line 83
    .line 84
    iget-object v7, v7, Ls1/i;->a:Ljava/util/HashMap;

    .line 85
    .line 86
    invoke-virtual {v7, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    check-cast v7, Ls1/c;

    .line 91
    .line 92
    iput-object v7, v2, Lr1/e;->b:Ls1/c;

    .line 93
    .line 94
    iput-boolean v6, v2, Lr1/e;->g:Z

    .line 95
    .line 96
    if-eqz v7, :cond_3

    .line 97
    .line 98
    goto/16 :goto_7

    .line 99
    .line 100
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 101
    .line 102
    const-string v2, "The requested cached FlutterEngine did not exist in the FlutterEngineCache: \'"

    .line 103
    .line 104
    const-string v4, "\'"

    .line 105
    .line 106
    invoke-static {v2, v3, v4}, Lt/a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw v0

    .line 114
    :cond_4
    iget-object v3, v2, Lr1/e;->a:Lr1/b;

    .line 115
    .line 116
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    iput-object v4, v2, Lr1/e;->b:Ls1/c;

    .line 120
    .line 121
    iget-object v3, v2, Lr1/e;->a:Lr1/b;

    .line 122
    .line 123
    invoke-virtual {v3}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    const-string v7, "cached_engine_group_id"

    .line 128
    .line 129
    invoke-virtual {v3, v7}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    if-eqz v3, :cond_8

    .line 134
    .line 135
    sget-object v7, Ls1/i;->b:Ls1/i;

    .line 136
    .line 137
    if-nez v7, :cond_6

    .line 138
    .line 139
    const-class v7, Ls1/i;

    .line 140
    .line 141
    monitor-enter v7

    .line 142
    :try_start_1
    sget-object v8, Ls1/i;->b:Ls1/i;

    .line 143
    .line 144
    if-nez v8, :cond_5

    .line 145
    .line 146
    new-instance v8, Ls1/i;

    .line 147
    .line 148
    const/4 v9, 0x0

    .line 149
    invoke-direct {v8, v9}, Ls1/i;-><init>(I)V

    .line 150
    .line 151
    .line 152
    sput-object v8, Ls1/i;->b:Ls1/i;

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :catchall_0
    move-exception v0

    .line 156
    goto :goto_2

    .line 157
    :cond_5
    :goto_1
    monitor-exit v7

    .line 158
    goto :goto_3

    .line 159
    :goto_2
    monitor-exit v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 160
    throw v0

    .line 161
    :cond_6
    :goto_3
    sget-object v7, Ls1/i;->b:Ls1/i;

    .line 162
    .line 163
    iget-object v7, v7, Ls1/i;->a:Ljava/util/HashMap;

    .line 164
    .line 165
    invoke-virtual {v7, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v7

    .line 169
    check-cast v7, Ls1/h;

    .line 170
    .line 171
    if-eqz v7, :cond_7

    .line 172
    .line 173
    new-instance v3, Ls1/g;

    .line 174
    .line 175
    iget-object v8, v2, Lr1/e;->a:Lr1/b;

    .line 176
    .line 177
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    invoke-direct {v3, v8}, Ls1/g;-><init>(Lr1/b;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2, v3}, Lr1/e;->a(Ls1/g;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v7, v3}, Ls1/h;->a(Ls1/g;)Ls1/c;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    iput-object v3, v2, Lr1/e;->b:Ls1/c;

    .line 191
    .line 192
    iput-boolean v5, v2, Lr1/e;->g:Z

    .line 193
    .line 194
    goto/16 :goto_7

    .line 195
    .line 196
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 197
    .line 198
    const-string v2, "The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: \'"

    .line 199
    .line 200
    const-string v4, "\'"

    .line 201
    .line 202
    invoke-static {v2, v3, v4}, Lt/a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    throw v0

    .line 210
    :cond_8
    iget-object v3, v2, Lr1/e;->a:Lr1/b;

    .line 211
    .line 212
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v3}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    invoke-virtual {v3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 220
    .line 221
    .line 222
    move-result-object v7

    .line 223
    if-nez v7, :cond_9

    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_9
    invoke-virtual {v3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 227
    .line 228
    .line 229
    move-result-object v3

    .line 230
    invoke-virtual {v3}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    :cond_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 239
    .line 240
    .line 241
    move-result v7

    .line 242
    if-eqz v7, :cond_d

    .line 243
    .line 244
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v7

    .line 248
    check-cast v7, Ljava/lang/String;

    .line 249
    .line 250
    const-string v8, "--"

    .line 251
    .line 252
    invoke-static {v7}, Ls1/e;->a(Ljava/lang/String;)Ls1/d;

    .line 253
    .line 254
    .line 255
    move-result-object v9

    .line 256
    if-nez v9, :cond_b

    .line 257
    .line 258
    invoke-virtual {v8, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v9

    .line 262
    invoke-static {v9}, Ls1/e;->a(Ljava/lang/String;)Ls1/d;

    .line 263
    .line 264
    .line 265
    move-result-object v9

    .line 266
    :cond_b
    if-nez v9, :cond_c

    .line 267
    .line 268
    new-instance v9, Ljava/lang/StringBuilder;

    .line 269
    .line 270
    invoke-direct {v9, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    const-string v7, "="

    .line 277
    .line 278
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v7

    .line 285
    invoke-static {v7}, Ls1/e;->a(Ljava/lang/String;)Ls1/d;

    .line 286
    .line 287
    .line 288
    move-result-object v9

    .line 289
    :cond_c
    if-eqz v9, :cond_a

    .line 290
    .line 291
    :cond_d
    :goto_4
    new-instance v3, Ls1/h;

    .line 292
    .line 293
    iget-object v7, v2, Lr1/e;->a:Lr1/b;

    .line 294
    .line 295
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    iget-object v8, v2, Lr1/e;->a:Lr1/b;

    .line 299
    .line 300
    invoke-virtual {v8}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 301
    .line 302
    .line 303
    move-result-object v8

    .line 304
    const-string v9, "dart-flags"

    .line 305
    .line 306
    const-string v10, "enable-hcpp-and-surface-control"

    .line 307
    .line 308
    const-string v11, "enable-impeller"

    .line 309
    .line 310
    const-string v12, "trace-to-file"

    .line 311
    .line 312
    new-instance v13, Ljava/util/ArrayList;

    .line 313
    .line 314
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 315
    .line 316
    .line 317
    const-string v14, "trace-startup"

    .line 318
    .line 319
    invoke-virtual {v8, v14, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 320
    .line 321
    .line 322
    move-result v14

    .line 323
    if-eqz v14, :cond_e

    .line 324
    .line 325
    const-string v14, "--trace-startup"

    .line 326
    .line 327
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    :cond_e
    const-string v14, "start-paused"

    .line 331
    .line 332
    invoke-virtual {v8, v14, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 333
    .line 334
    .line 335
    move-result v14

    .line 336
    if-eqz v14, :cond_f

    .line 337
    .line 338
    const-string v14, "--start-paused"

    .line 339
    .line 340
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    :cond_f
    const-string v14, "vm-service-port"

    .line 344
    .line 345
    invoke-virtual {v8, v14, v5}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 346
    .line 347
    .line 348
    move-result v14

    .line 349
    if-lez v14, :cond_10

    .line 350
    .line 351
    new-instance v15, Ljava/lang/StringBuilder;

    .line 352
    .line 353
    const-string v4, "--vm-service-port="

    .line 354
    .line 355
    invoke-direct {v15, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v4

    .line 365
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    :cond_10
    const-string v4, "disable-service-auth-codes"

    .line 369
    .line 370
    invoke-virtual {v8, v4, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 371
    .line 372
    .line 373
    move-result v4

    .line 374
    if-eqz v4, :cond_11

    .line 375
    .line 376
    const-string v4, "--disable-service-auth-codes"

    .line 377
    .line 378
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    :cond_11
    const-string v4, "endless-trace-buffer"

    .line 382
    .line 383
    invoke-virtual {v8, v4, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 384
    .line 385
    .line 386
    move-result v4

    .line 387
    if-eqz v4, :cond_12

    .line 388
    .line 389
    const-string v4, "--endless-trace-buffer"

    .line 390
    .line 391
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 392
    .line 393
    .line 394
    :cond_12
    const-string v4, "use-test-fonts"

    .line 395
    .line 396
    invoke-virtual {v8, v4, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 397
    .line 398
    .line 399
    move-result v4

    .line 400
    if-eqz v4, :cond_13

    .line 401
    .line 402
    const-string v4, "--use-test-fonts"

    .line 403
    .line 404
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    :cond_13
    const-string v4, "enable-dart-profiling"

    .line 408
    .line 409
    invoke-virtual {v8, v4, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 410
    .line 411
    .line 412
    move-result v4

    .line 413
    if-eqz v4, :cond_14

    .line 414
    .line 415
    const-string v4, "--enable-dart-profiling"

    .line 416
    .line 417
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 418
    .line 419
    .line 420
    :cond_14
    const-string v4, "profile-startup"

    .line 421
    .line 422
    invoke-virtual {v8, v4, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 423
    .line 424
    .line 425
    move-result v4

    .line 426
    if-eqz v4, :cond_15

    .line 427
    .line 428
    const-string v4, "--profile-startup"

    .line 429
    .line 430
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 431
    .line 432
    .line 433
    :cond_15
    const-string v4, "enable-software-rendering"

    .line 434
    .line 435
    invoke-virtual {v8, v4, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 436
    .line 437
    .line 438
    move-result v4

    .line 439
    if-eqz v4, :cond_16

    .line 440
    .line 441
    const-string v4, "--enable-software-rendering"

    .line 442
    .line 443
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 444
    .line 445
    .line 446
    :cond_16
    const-string v4, "skia-deterministic-rendering"

    .line 447
    .line 448
    invoke-virtual {v8, v4, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 449
    .line 450
    .line 451
    move-result v4

    .line 452
    if-eqz v4, :cond_17

    .line 453
    .line 454
    const-string v4, "--skia-deterministic-rendering"

    .line 455
    .line 456
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 457
    .line 458
    .line 459
    :cond_17
    const-string v4, "trace-skia"

    .line 460
    .line 461
    invoke-virtual {v8, v4, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 462
    .line 463
    .line 464
    move-result v4

    .line 465
    if-eqz v4, :cond_18

    .line 466
    .line 467
    const-string v4, "--trace-skia"

    .line 468
    .line 469
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 470
    .line 471
    .line 472
    :cond_18
    const-string v4, "trace-skia-allowlist"

    .line 473
    .line 474
    invoke-virtual {v8, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v4

    .line 478
    if-eqz v4, :cond_19

    .line 479
    .line 480
    const-string v14, "--trace-skia-allowlist="

    .line 481
    .line 482
    invoke-virtual {v14, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v4

    .line 486
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 487
    .line 488
    .line 489
    :cond_19
    const-string v4, "trace-systrace"

    .line 490
    .line 491
    invoke-virtual {v8, v4, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 492
    .line 493
    .line 494
    move-result v4

    .line 495
    if-eqz v4, :cond_1a

    .line 496
    .line 497
    const-string v4, "--trace-systrace"

    .line 498
    .line 499
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 500
    .line 501
    .line 502
    :cond_1a
    invoke-virtual {v8, v12}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 503
    .line 504
    .line 505
    move-result v4

    .line 506
    if-eqz v4, :cond_1b

    .line 507
    .line 508
    new-instance v4, Ljava/lang/StringBuilder;

    .line 509
    .line 510
    const-string v14, "--trace-to-file="

    .line 511
    .line 512
    invoke-direct {v4, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 513
    .line 514
    .line 515
    invoke-virtual {v8, v12}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object v12

    .line 519
    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 520
    .line 521
    .line 522
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    move-result-object v4

    .line 526
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 527
    .line 528
    .line 529
    :cond_1b
    const-string v4, "profile-microtasks"

    .line 530
    .line 531
    invoke-virtual {v8, v4}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 532
    .line 533
    .line 534
    move-result v4

    .line 535
    if-eqz v4, :cond_1c

    .line 536
    .line 537
    const-string v4, "--profile-microtasks"

    .line 538
    .line 539
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 540
    .line 541
    .line 542
    :cond_1c
    invoke-virtual {v8, v11}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 543
    .line 544
    .line 545
    move-result v4

    .line 546
    if-eqz v4, :cond_1e

    .line 547
    .line 548
    invoke-virtual {v8, v11, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 549
    .line 550
    .line 551
    move-result v4

    .line 552
    if-eqz v4, :cond_1d

    .line 553
    .line 554
    const-string v4, "--enable-impeller=true"

    .line 555
    .line 556
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 557
    .line 558
    .line 559
    goto :goto_5

    .line 560
    :cond_1d
    const-string v4, "--enable-impeller=false"

    .line 561
    .line 562
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 563
    .line 564
    .line 565
    :cond_1e
    :goto_5
    const-string v4, "enable-vulkan-validation"

    .line 566
    .line 567
    invoke-virtual {v8, v4, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 568
    .line 569
    .line 570
    move-result v4

    .line 571
    if-eqz v4, :cond_1f

    .line 572
    .line 573
    const-string v4, "--enable-vulkan-validation"

    .line 574
    .line 575
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 576
    .line 577
    .line 578
    :cond_1f
    invoke-virtual {v8, v10}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 579
    .line 580
    .line 581
    move-result v4

    .line 582
    if-eqz v4, :cond_21

    .line 583
    .line 584
    invoke-virtual {v8, v10, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 585
    .line 586
    .line 587
    move-result v4

    .line 588
    if-eqz v4, :cond_20

    .line 589
    .line 590
    const-string v4, "--enable-hcpp-and-surface-control=true"

    .line 591
    .line 592
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 593
    .line 594
    .line 595
    goto :goto_6

    .line 596
    :cond_20
    const-string v4, "--enable-hcpp-and-surface-control=false"

    .line 597
    .line 598
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 599
    .line 600
    .line 601
    :cond_21
    :goto_6
    const-string v4, "dump-skp-on-shader-compilation"

    .line 602
    .line 603
    invoke-virtual {v8, v4, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 604
    .line 605
    .line 606
    move-result v4

    .line 607
    if-eqz v4, :cond_22

    .line 608
    .line 609
    const-string v4, "--dump-skp-on-shader-compilation"

    .line 610
    .line 611
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 612
    .line 613
    .line 614
    :cond_22
    const-string v4, "cache-sksl"

    .line 615
    .line 616
    invoke-virtual {v8, v4, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 617
    .line 618
    .line 619
    move-result v4

    .line 620
    if-eqz v4, :cond_23

    .line 621
    .line 622
    const-string v4, "--cache-sksl"

    .line 623
    .line 624
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 625
    .line 626
    .line 627
    :cond_23
    const-string v4, "purge-persistent-cache"

    .line 628
    .line 629
    invoke-virtual {v8, v4, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 630
    .line 631
    .line 632
    move-result v4

    .line 633
    if-eqz v4, :cond_24

    .line 634
    .line 635
    const-string v4, "--purge-persistent-cache"

    .line 636
    .line 637
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 638
    .line 639
    .line 640
    :cond_24
    const-string v4, "verbose-logging"

    .line 641
    .line 642
    invoke-virtual {v8, v4, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 643
    .line 644
    .line 645
    move-result v4

    .line 646
    if-eqz v4, :cond_25

    .line 647
    .line 648
    const-string v4, "--verbose-logging"

    .line 649
    .line 650
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 651
    .line 652
    .line 653
    :cond_25
    invoke-virtual {v8, v9}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 654
    .line 655
    .line 656
    move-result v4

    .line 657
    if-eqz v4, :cond_26

    .line 658
    .line 659
    new-instance v4, Ljava/lang/StringBuilder;

    .line 660
    .line 661
    const-string v10, "--dart-flags="

    .line 662
    .line 663
    invoke-direct {v4, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 664
    .line 665
    .line 666
    invoke-virtual {v8, v9}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 667
    .line 668
    .line 669
    move-result-object v8

    .line 670
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 671
    .line 672
    .line 673
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 674
    .line 675
    .line 676
    move-result-object v4

    .line 677
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 678
    .line 679
    .line 680
    :cond_26
    new-instance v4, Ljava/util/HashSet;

    .line 681
    .line 682
    invoke-direct {v4, v13}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 683
    .line 684
    .line 685
    invoke-virtual {v4}, Ljava/util/HashSet;->size()I

    .line 686
    .line 687
    .line 688
    move-result v8

    .line 689
    new-array v8, v8, [Ljava/lang/String;

    .line 690
    .line 691
    invoke-virtual {v4, v8}, Ljava/util/HashSet;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 692
    .line 693
    .line 694
    move-result-object v4

    .line 695
    check-cast v4, [Ljava/lang/String;

    .line 696
    .line 697
    invoke-direct {v3, v7, v4}, Ls1/h;-><init>(Lr1/b;[Ljava/lang/String;)V

    .line 698
    .line 699
    .line 700
    new-instance v4, Ls1/g;

    .line 701
    .line 702
    iget-object v7, v2, Lr1/e;->a:Lr1/b;

    .line 703
    .line 704
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 705
    .line 706
    .line 707
    invoke-direct {v4, v7}, Ls1/g;-><init>(Lr1/b;)V

    .line 708
    .line 709
    .line 710
    iput-boolean v5, v4, Ls1/g;->e:Z

    .line 711
    .line 712
    iget-object v7, v2, Lr1/e;->a:Lr1/b;

    .line 713
    .line 714
    invoke-virtual {v7}, Lr1/b;->l()Z

    .line 715
    .line 716
    .line 717
    move-result v7

    .line 718
    iput-boolean v7, v4, Ls1/g;->f:Z

    .line 719
    .line 720
    invoke-virtual {v2, v4}, Lr1/e;->a(Ls1/g;)V

    .line 721
    .line 722
    .line 723
    invoke-virtual {v3, v4}, Ls1/h;->a(Ls1/g;)Ls1/c;

    .line 724
    .line 725
    .line 726
    move-result-object v3

    .line 727
    iput-object v3, v2, Lr1/e;->b:Ls1/c;

    .line 728
    .line 729
    iput-boolean v5, v2, Lr1/e;->g:Z

    .line 730
    .line 731
    :cond_27
    :goto_7
    iget-object v3, v2, Lr1/e;->a:Lr1/b;

    .line 732
    .line 733
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 734
    .line 735
    .line 736
    iget-object v3, v2, Lr1/e;->b:Ls1/c;

    .line 737
    .line 738
    iget-object v3, v3, Ls1/c;->d:Lj0/a;

    .line 739
    .line 740
    iget-object v4, v2, Lr1/e;->a:Lr1/b;

    .line 741
    .line 742
    iget-object v4, v4, Lr1/b;->m:Landroidx/lifecycle/u;

    .line 743
    .line 744
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 745
    .line 746
    .line 747
    const-string v7, "FlutterEngineConnectionRegistry#attachToActivity"

    .line 748
    .line 749
    invoke-static {v7}, LN1/a;->b(Ljava/lang/String;)V

    .line 750
    .line 751
    .line 752
    :try_start_2
    iget-object v7, v3, Lj0/a;->g:Ljava/lang/Object;

    .line 753
    .line 754
    check-cast v7, Lr1/e;

    .line 755
    .line 756
    if-eqz v7, :cond_28

    .line 757
    .line 758
    invoke-virtual {v7}, Lr1/e;->b()V

    .line 759
    .line 760
    .line 761
    goto :goto_8

    .line 762
    :catchall_1
    move-exception v0

    .line 763
    move-object v2, v0

    .line 764
    goto/16 :goto_1c

    .line 765
    .line 766
    :cond_28
    :goto_8
    invoke-virtual {v3}, Lj0/a;->e()V

    .line 767
    .line 768
    .line 769
    iput-object v2, v3, Lj0/a;->g:Ljava/lang/Object;

    .line 770
    .line 771
    iget-object v7, v2, Lr1/e;->a:Lr1/b;

    .line 772
    .line 773
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 774
    .line 775
    .line 776
    invoke-virtual {v3, v7, v4}, Lj0/a;->b(Lr1/b;Landroidx/lifecycle/u;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 777
    .line 778
    .line 779
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 780
    .line 781
    .line 782
    iget-object v3, v2, Lr1/e;->a:Lr1/b;

    .line 783
    .line 784
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 785
    .line 786
    .line 787
    iget-object v4, v2, Lr1/e;->a:Lr1/b;

    .line 788
    .line 789
    iget-object v7, v2, Lr1/e;->b:Ls1/c;

    .line 790
    .line 791
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 792
    .line 793
    .line 794
    new-instance v8, Lio/flutter/plugin/platform/f;

    .line 795
    .line 796
    iget-object v7, v7, Ls1/c;->l:LA/c;

    .line 797
    .line 798
    invoke-direct {v8, v4, v7, v4}, Lio/flutter/plugin/platform/f;-><init>(Lr1/b;LA/c;Lr1/b;)V

    .line 799
    .line 800
    .line 801
    iput-object v8, v2, Lr1/e;->d:Lio/flutter/plugin/platform/f;

    .line 802
    .line 803
    iget-object v4, v2, Lr1/e;->a:Lr1/b;

    .line 804
    .line 805
    iget-object v7, v2, Lr1/e;->b:Ls1/c;

    .line 806
    .line 807
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 808
    .line 809
    .line 810
    new-instance v4, LG1/a;

    .line 811
    .line 812
    sget v8, Lr1/b;->o:I

    .line 813
    .line 814
    iget-object v7, v7, Ls1/c;->n:LB1/g;

    .line 815
    .line 816
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 817
    .line 818
    .line 819
    iput-object v3, v4, LG1/a;->b:Ljava/lang/Object;

    .line 820
    .line 821
    iput v8, v4, LG1/a;->a:I

    .line 822
    .line 823
    iput-object v7, v4, LG1/a;->c:Ljava/lang/Object;

    .line 824
    .line 825
    iput-object v4, v7, LB1/g;->l:Ljava/lang/Object;

    .line 826
    .line 827
    iput-object v4, v2, Lr1/e;->e:LG1/a;

    .line 828
    .line 829
    iget-object v3, v2, Lr1/e;->a:Lr1/b;

    .line 830
    .line 831
    iget-object v4, v2, Lr1/e;->b:Ls1/c;

    .line 832
    .line 833
    iget-object v3, v3, Lr1/b;->l:Lr1/e;

    .line 834
    .line 835
    iget-boolean v3, v3, Lr1/e;->g:Z

    .line 836
    .line 837
    if-eqz v3, :cond_29

    .line 838
    .line 839
    goto :goto_9

    .line 840
    :cond_29
    invoke-static {v4}, LE2/a;->K(Ls1/c;)V

    .line 841
    .line 842
    .line 843
    :goto_9
    iput-boolean v6, v2, Lr1/e;->j:Z

    .line 844
    .line 845
    iget-object v2, v1, Lr1/b;->l:Lr1/e;

    .line 846
    .line 847
    invoke-virtual {v2}, Lr1/e;->c()V

    .line 848
    .line 849
    .line 850
    if-eqz v0, :cond_2a

    .line 851
    .line 852
    const-string v3, "plugins"

    .line 853
    .line 854
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 855
    .line 856
    .line 857
    const-string v3, "framework"

    .line 858
    .line 859
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    .line 860
    .line 861
    .line 862
    move-result-object v0

    .line 863
    goto :goto_a

    .line 864
    :cond_2a
    const/4 v0, 0x0

    .line 865
    :goto_a
    iget-object v3, v2, Lr1/e;->a:Lr1/b;

    .line 866
    .line 867
    invoke-virtual {v3}, Lr1/b;->l()Z

    .line 868
    .line 869
    .line 870
    move-result v3

    .line 871
    if-eqz v3, :cond_2d

    .line 872
    .line 873
    iget-object v3, v2, Lr1/e;->b:Ls1/c;

    .line 874
    .line 875
    iget-object v3, v3, Ls1/c;->k:LB1/p;

    .line 876
    .line 877
    iput-boolean v6, v3, LB1/p;->b:Z

    .line 878
    .line 879
    iget-object v4, v3, LB1/p;->f:Ljava/lang/Object;

    .line 880
    .line 881
    check-cast v4, LB1/o;

    .line 882
    .line 883
    if-eqz v4, :cond_2b

    .line 884
    .line 885
    invoke-static {v0}, LB1/p;->b([B)Ljava/util/HashMap;

    .line 886
    .line 887
    .line 888
    move-result-object v7

    .line 889
    invoke-virtual {v4, v7}, LB1/o;->d(Ljava/lang/Object;)V

    .line 890
    .line 891
    .line 892
    const/4 v4, 0x0

    .line 893
    iput-object v4, v3, LB1/p;->f:Ljava/lang/Object;

    .line 894
    .line 895
    iput-object v0, v3, LB1/p;->d:Ljava/lang/Object;

    .line 896
    .line 897
    goto :goto_b

    .line 898
    :cond_2b
    iget-boolean v4, v3, LB1/p;->c:Z

    .line 899
    .line 900
    if-eqz v4, :cond_2c

    .line 901
    .line 902
    iget-object v4, v3, LB1/p;->e:Ljava/lang/Object;

    .line 903
    .line 904
    check-cast v4, LB1/s;

    .line 905
    .line 906
    const-string v7, "push"

    .line 907
    .line 908
    invoke-static {v0}, LB1/p;->b([B)Ljava/util/HashMap;

    .line 909
    .line 910
    .line 911
    move-result-object v9

    .line 912
    new-instance v10, LB1/o;

    .line 913
    .line 914
    const/4 v11, 0x0

    .line 915
    invoke-direct {v10, v3, v0, v11}, LB1/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 916
    .line 917
    .line 918
    invoke-virtual {v4, v7, v9, v10}, LB1/s;->s(Ljava/lang/String;Ljava/lang/Object;LB1/o;)V

    .line 919
    .line 920
    .line 921
    goto :goto_b

    .line 922
    :cond_2c
    iput-object v0, v3, LB1/p;->d:Ljava/lang/Object;

    .line 923
    .line 924
    :cond_2d
    :goto_b
    iget-object v0, v2, Lr1/e;->a:Lr1/b;

    .line 925
    .line 926
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 927
    .line 928
    .line 929
    iget-object v0, v2, Lr1/e;->b:Ls1/c;

    .line 930
    .line 931
    iget-object v0, v0, Ls1/c;->d:Lj0/a;

    .line 932
    .line 933
    invoke-virtual {v0}, Lj0/a;->f()Z

    .line 934
    .line 935
    .line 936
    move-result v2

    .line 937
    if-eqz v2, :cond_30

    .line 938
    .line 939
    const-string v2, "FlutterEngineConnectionRegistry#onRestoreInstanceState"

    .line 940
    .line 941
    invoke-static {v2}, LN1/a;->b(Ljava/lang/String;)V

    .line 942
    .line 943
    .line 944
    :try_start_3
    iget-object v0, v0, Lj0/a;->h:Ljava/lang/Object;

    .line 945
    .line 946
    check-cast v0, Lk/u0;

    .line 947
    .line 948
    iget-object v0, v0, Lk/u0;->g:Ljava/lang/Object;

    .line 949
    .line 950
    check-cast v0, Ljava/util/HashSet;

    .line 951
    .line 952
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 953
    .line 954
    .line 955
    move-result-object v0

    .line 956
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 957
    .line 958
    .line 959
    move-result v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 960
    if-nez v2, :cond_2e

    .line 961
    .line 962
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 963
    .line 964
    .line 965
    goto :goto_d

    .line 966
    :cond_2e
    :try_start_4
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 967
    .line 968
    .line 969
    move-result-object v0

    .line 970
    if-nez v0, :cond_2f

    .line 971
    .line 972
    const/16 v16, 0x0

    .line 973
    .line 974
    throw v16

    .line 975
    :cond_2f
    new-instance v0, Ljava/lang/ClassCastException;

    .line 976
    .line 977
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 978
    .line 979
    .line 980
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 981
    :catchall_2
    move-exception v0

    .line 982
    move-object v2, v0

    .line 983
    :try_start_5
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 984
    .line 985
    .line 986
    goto :goto_c

    .line 987
    :catchall_3
    move-exception v0

    .line 988
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 989
    .line 990
    .line 991
    :goto_c
    throw v2

    .line 992
    :cond_30
    const-string v0, "FlutterEngineCxnRegstry"

    .line 993
    .line 994
    const-string v2, "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached."

    .line 995
    .line 996
    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 997
    .line 998
    .line 999
    :goto_d
    iget-object v0, v1, Lr1/b;->m:Landroidx/lifecycle/u;

    .line 1000
    .line 1001
    sget-object v2, Landroidx/lifecycle/l;->ON_CREATE:Landroidx/lifecycle/l;

    .line 1002
    .line 1003
    invoke-virtual {v0, v2}, Landroidx/lifecycle/u;->e(Landroidx/lifecycle/l;)V

    .line 1004
    .line 1005
    .line 1006
    invoke-virtual {v1}, Lr1/b;->d()I

    .line 1007
    .line 1008
    .line 1009
    move-result v0

    .line 1010
    const/4 v2, 0x2

    .line 1011
    if-ne v0, v2, :cond_31

    .line 1012
    .line 1013
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v0

    .line 1017
    new-instance v3, Landroid/graphics/drawable/ColorDrawable;

    .line 1018
    .line 1019
    invoke-direct {v3, v5}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 1020
    .line 1021
    .line 1022
    invoke-virtual {v0, v3}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1023
    .line 1024
    .line 1025
    :cond_31
    iget-object v0, v1, Lr1/b;->l:Lr1/e;

    .line 1026
    .line 1027
    invoke-virtual {v1}, Lr1/b;->d()I

    .line 1028
    .line 1029
    .line 1030
    move-result v3

    .line 1031
    if-ne v3, v6, :cond_32

    .line 1032
    .line 1033
    move v2, v6

    .line 1034
    :cond_32
    if-ne v2, v6, :cond_33

    .line 1035
    .line 1036
    move v2, v6

    .line 1037
    goto :goto_e

    .line 1038
    :cond_33
    move v2, v5

    .line 1039
    :goto_e
    invoke-virtual {v0}, Lr1/e;->c()V

    .line 1040
    .line 1041
    .line 1042
    iget-object v3, v0, Lr1/e;->a:Lr1/b;

    .line 1043
    .line 1044
    invoke-virtual {v3}, Lr1/b;->d()I

    .line 1045
    .line 1046
    .line 1047
    move-result v3

    .line 1048
    if-ne v3, v6, :cond_35

    .line 1049
    .line 1050
    new-instance v3, Lr1/h;

    .line 1051
    .line 1052
    iget-object v4, v0, Lr1/e;->a:Lr1/b;

    .line 1053
    .line 1054
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1055
    .line 1056
    .line 1057
    iget-object v7, v0, Lr1/e;->a:Lr1/b;

    .line 1058
    .line 1059
    invoke-virtual {v7}, Lr1/b;->d()I

    .line 1060
    .line 1061
    .line 1062
    move-result v7

    .line 1063
    if-ne v7, v6, :cond_34

    .line 1064
    .line 1065
    move v7, v5

    .line 1066
    goto :goto_f

    .line 1067
    :cond_34
    move v7, v6

    .line 1068
    :goto_f
    invoke-direct {v3, v4, v7}, Lr1/h;-><init>(Lr1/b;Z)V

    .line 1069
    .line 1070
    .line 1071
    iget-object v4, v0, Lr1/e;->a:Lr1/b;

    .line 1072
    .line 1073
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1074
    .line 1075
    .line 1076
    new-instance v4, Lr1/n;

    .line 1077
    .line 1078
    iget-object v7, v0, Lr1/e;->a:Lr1/b;

    .line 1079
    .line 1080
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1081
    .line 1082
    .line 1083
    invoke-direct {v4, v7, v3}, Lr1/n;-><init>(Lr1/b;Lr1/h;)V

    .line 1084
    .line 1085
    .line 1086
    iput-object v4, v0, Lr1/e;->c:Lr1/n;

    .line 1087
    .line 1088
    goto :goto_11

    .line 1089
    :cond_35
    new-instance v3, Lr1/j;

    .line 1090
    .line 1091
    iget-object v4, v0, Lr1/e;->a:Lr1/b;

    .line 1092
    .line 1093
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1094
    .line 1095
    .line 1096
    invoke-direct {v3, v4}, Lr1/j;-><init>(Lr1/b;)V

    .line 1097
    .line 1098
    .line 1099
    iget-object v4, v0, Lr1/e;->a:Lr1/b;

    .line 1100
    .line 1101
    invoke-virtual {v4}, Lr1/b;->d()I

    .line 1102
    .line 1103
    .line 1104
    move-result v4

    .line 1105
    if-ne v4, v6, :cond_36

    .line 1106
    .line 1107
    move v4, v6

    .line 1108
    goto :goto_10

    .line 1109
    :cond_36
    move v4, v5

    .line 1110
    :goto_10
    invoke-virtual {v3, v4}, Landroid/view/TextureView;->setOpaque(Z)V

    .line 1111
    .line 1112
    .line 1113
    iget-object v4, v0, Lr1/e;->a:Lr1/b;

    .line 1114
    .line 1115
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1116
    .line 1117
    .line 1118
    new-instance v4, Lr1/n;

    .line 1119
    .line 1120
    iget-object v7, v0, Lr1/e;->a:Lr1/b;

    .line 1121
    .line 1122
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1123
    .line 1124
    .line 1125
    invoke-direct {v4, v7, v3}, Lr1/n;-><init>(Lr1/b;Lr1/j;)V

    .line 1126
    .line 1127
    .line 1128
    iput-object v4, v0, Lr1/e;->c:Lr1/n;

    .line 1129
    .line 1130
    :goto_11
    iget-object v3, v0, Lr1/e;->c:Lr1/n;

    .line 1131
    .line 1132
    iget-object v4, v0, Lr1/e;->l:Lio/flutter/embedding/engine/renderer/a;

    .line 1133
    .line 1134
    iget-object v3, v3, Lr1/n;->q:Ljava/util/HashSet;

    .line 1135
    .line 1136
    invoke-virtual {v3, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1137
    .line 1138
    .line 1139
    iget-object v3, v0, Lr1/e;->a:Lr1/b;

    .line 1140
    .line 1141
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1142
    .line 1143
    .line 1144
    iget-object v10, v0, Lr1/e;->c:Lr1/n;

    .line 1145
    .line 1146
    iget-object v3, v0, Lr1/e;->b:Ls1/c;

    .line 1147
    .line 1148
    iget-object v4, v10, Lr1/n;->H:Lio/flutter/embedding/engine/renderer/a;

    .line 1149
    .line 1150
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 1151
    .line 1152
    .line 1153
    invoke-virtual {v10}, Lr1/n;->c()Z

    .line 1154
    .line 1155
    .line 1156
    move-result v7

    .line 1157
    if-eqz v7, :cond_38

    .line 1158
    .line 1159
    iget-object v7, v10, Lr1/n;->s:Ls1/c;

    .line 1160
    .line 1161
    if-ne v3, v7, :cond_37

    .line 1162
    .line 1163
    goto/16 :goto_1a

    .line 1164
    .line 1165
    :cond_37
    invoke-virtual {v10}, Lr1/n;->a()V

    .line 1166
    .line 1167
    .line 1168
    :cond_38
    iput-object v3, v10, Lr1/n;->s:Ls1/c;

    .line 1169
    .line 1170
    iget-object v7, v3, Ls1/c;->b:Lio/flutter/embedding/engine/renderer/k;

    .line 1171
    .line 1172
    iget-boolean v9, v7, Lio/flutter/embedding/engine/renderer/k;->d:Z

    .line 1173
    .line 1174
    iput-boolean v9, v10, Lr1/n;->r:Z

    .line 1175
    .line 1176
    iget-object v9, v10, Lr1/n;->o:Landroid/view/View;

    .line 1177
    .line 1178
    invoke-interface {v9, v7}, Lio/flutter/embedding/engine/renderer/n;->c(Lio/flutter/embedding/engine/renderer/k;)V

    .line 1179
    .line 1180
    .line 1181
    invoke-virtual {v7, v4}, Lio/flutter/embedding/engine/renderer/k;->a(Lio/flutter/embedding/engine/renderer/l;)V

    .line 1182
    .line 1183
    .line 1184
    iget-boolean v9, v10, Lr1/n;->k:Z

    .line 1185
    .line 1186
    if-eqz v9, :cond_39

    .line 1187
    .line 1188
    iget-object v9, v10, Lr1/n;->G:Lr1/l;

    .line 1189
    .line 1190
    iget-object v7, v7, Lio/flutter/embedding/engine/renderer/k;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 1191
    .line 1192
    invoke-virtual {v7, v9}, Lio/flutter/embedding/engine/FlutterJNI;->addResizingFlutterUiListener(Lio/flutter/embedding/engine/renderer/m;)V

    .line 1193
    .line 1194
    .line 1195
    :cond_39
    new-instance v7, LA/c;

    .line 1196
    .line 1197
    iget-object v9, v10, Lr1/n;->s:Ls1/c;

    .line 1198
    .line 1199
    iget-object v9, v9, Ls1/c;->h:LB1/a;

    .line 1200
    .line 1201
    invoke-direct {v7, v10, v9}, LA/c;-><init>(LE1/b;LB1/a;)V

    .line 1202
    .line 1203
    .line 1204
    iput-object v7, v10, Lr1/n;->u:LA/c;

    .line 1205
    .line 1206
    new-instance v9, Lio/flutter/plugin/editing/j;

    .line 1207
    .line 1208
    iget-object v7, v10, Lr1/n;->s:Ls1/c;

    .line 1209
    .line 1210
    iget-object v11, v7, Ls1/c;->r:LA/c;

    .line 1211
    .line 1212
    iget-object v12, v7, Ls1/c;->m:LH0/i;

    .line 1213
    .line 1214
    iget-object v13, v7, Ls1/c;->s:Lio/flutter/plugin/platform/s;

    .line 1215
    .line 1216
    iget-object v14, v7, Ls1/c;->t:Lio/flutter/plugin/platform/r;

    .line 1217
    .line 1218
    invoke-direct/range {v9 .. v14}, Lio/flutter/plugin/editing/j;-><init>(Landroid/view/View;LA/c;LH0/i;Lio/flutter/plugin/platform/s;Lio/flutter/plugin/platform/r;)V

    .line 1219
    .line 1220
    .line 1221
    iput-object v9, v10, Lr1/n;->v:Lio/flutter/plugin/editing/j;

    .line 1222
    .line 1223
    :try_start_6
    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1224
    .line 1225
    .line 1226
    move-result-object v7

    .line 1227
    const-string v9, "textservices"

    .line 1228
    .line 1229
    invoke-virtual {v7, v9}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1230
    .line 1231
    .line 1232
    move-result-object v7

    .line 1233
    check-cast v7, Landroid/view/textservice/TextServicesManager;

    .line 1234
    .line 1235
    iput-object v7, v10, Lr1/n;->B:Landroid/view/textservice/TextServicesManager;

    .line 1236
    .line 1237
    new-instance v9, Lio/flutter/plugin/editing/g;

    .line 1238
    .line 1239
    iget-object v11, v10, Lr1/n;->s:Ls1/c;

    .line 1240
    .line 1241
    iget-object v11, v11, Ls1/c;->p:LB1/a;

    .line 1242
    .line 1243
    invoke-direct {v9, v7, v11}, Lio/flutter/plugin/editing/g;-><init>(Landroid/view/textservice/TextServicesManager;LB1/a;)V

    .line 1244
    .line 1245
    .line 1246
    iput-object v9, v10, Lr1/n;->w:Lio/flutter/plugin/editing/g;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    .line 1247
    .line 1248
    goto :goto_12

    .line 1249
    :catch_1
    const-string v7, "FlutterView"

    .line 1250
    .line 1251
    const-string v9, "TextServicesManager not supported by device, spell check disabled."

    .line 1252
    .line 1253
    invoke-static {v7, v9}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1254
    .line 1255
    .line 1256
    :goto_12
    new-instance v7, Lb1/Q;

    .line 1257
    .line 1258
    iget-object v9, v10, Lr1/n;->v:Lio/flutter/plugin/editing/j;

    .line 1259
    .line 1260
    iget-object v9, v9, Lio/flutter/plugin/editing/j;->b:Landroid/view/inputmethod/InputMethodManager;

    .line 1261
    .line 1262
    iget-object v11, v10, Lr1/n;->s:Ls1/c;

    .line 1263
    .line 1264
    iget-object v11, v11, Ls1/c;->m:LH0/i;

    .line 1265
    .line 1266
    invoke-direct {v7, v10, v9, v11}, Lb1/Q;-><init>(Landroid/view/View;Landroid/view/inputmethod/InputMethodManager;LH0/i;)V

    .line 1267
    .line 1268
    .line 1269
    iget-object v7, v10, Lr1/n;->s:Ls1/c;

    .line 1270
    .line 1271
    iget-object v7, v7, Ls1/c;->e:LD1/a;

    .line 1272
    .line 1273
    iput-object v7, v10, Lr1/n;->x:LD1/a;

    .line 1274
    .line 1275
    new-instance v7, LA0/j;

    .line 1276
    .line 1277
    invoke-direct {v7, v10}, LA0/j;-><init>(Lr1/v;)V

    .line 1278
    .line 1279
    .line 1280
    iput-object v7, v10, Lr1/n;->y:LA0/j;

    .line 1281
    .line 1282
    new-instance v7, Lr1/a;

    .line 1283
    .line 1284
    iget-object v9, v10, Lr1/n;->s:Ls1/c;

    .line 1285
    .line 1286
    iget-object v9, v9, Ls1/c;->b:Lio/flutter/embedding/engine/renderer/k;

    .line 1287
    .line 1288
    invoke-direct {v7, v9, v5}, Lr1/a;-><init>(Lio/flutter/embedding/engine/renderer/k;Z)V

    .line 1289
    .line 1290
    .line 1291
    iput-object v7, v10, Lr1/n;->z:Lr1/a;

    .line 1292
    .line 1293
    new-instance v9, Lio/flutter/view/i;

    .line 1294
    .line 1295
    iget-object v11, v3, Ls1/c;->f:LA0/j;

    .line 1296
    .line 1297
    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1298
    .line 1299
    .line 1300
    move-result-object v7

    .line 1301
    const-string v12, "accessibility"

    .line 1302
    .line 1303
    invoke-virtual {v7, v12}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1304
    .line 1305
    .line 1306
    move-result-object v7

    .line 1307
    move-object v12, v7

    .line 1308
    check-cast v12, Landroid/view/accessibility/AccessibilityManager;

    .line 1309
    .line 1310
    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1311
    .line 1312
    .line 1313
    move-result-object v7

    .line 1314
    invoke-virtual {v7}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 1315
    .line 1316
    .line 1317
    move-result-object v13

    .line 1318
    iget-object v14, v3, Ls1/c;->u:Lb1/Q;

    .line 1319
    .line 1320
    invoke-direct/range {v9 .. v14}, Lio/flutter/view/i;-><init>(Landroid/view/View;LA0/j;Landroid/view/accessibility/AccessibilityManager;Landroid/content/ContentResolver;Lio/flutter/plugin/platform/k;)V

    .line 1321
    .line 1322
    .line 1323
    iput-object v9, v10, Lr1/n;->A:Lio/flutter/view/i;

    .line 1324
    .line 1325
    iget-object v7, v10, Lr1/n;->E:LB1/a;

    .line 1326
    .line 1327
    iput-object v7, v9, Lio/flutter/view/i;->s:LB1/a;

    .line 1328
    .line 1329
    iget-object v7, v9, Lio/flutter/view/i;->c:Landroid/view/accessibility/AccessibilityManager;

    .line 1330
    .line 1331
    invoke-virtual {v7}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 1332
    .line 1333
    .line 1334
    move-result v7

    .line 1335
    iget-object v9, v10, Lr1/n;->A:Lio/flutter/view/i;

    .line 1336
    .line 1337
    iget-object v9, v9, Lio/flutter/view/i;->c:Landroid/view/accessibility/AccessibilityManager;

    .line 1338
    .line 1339
    invoke-virtual {v9}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    .line 1340
    .line 1341
    .line 1342
    move-result v9

    .line 1343
    iget-object v11, v10, Lr1/n;->s:Ls1/c;

    .line 1344
    .line 1345
    iget-object v11, v11, Ls1/c;->b:Lio/flutter/embedding/engine/renderer/k;

    .line 1346
    .line 1347
    iget-object v11, v11, Lio/flutter/embedding/engine/renderer/k;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 1348
    .line 1349
    invoke-virtual {v11}, Lio/flutter/embedding/engine/FlutterJNI;->getIsSoftwareRenderingEnabled()Z

    .line 1350
    .line 1351
    .line 1352
    move-result v11

    .line 1353
    if-nez v11, :cond_3b

    .line 1354
    .line 1355
    if-nez v7, :cond_3a

    .line 1356
    .line 1357
    if-nez v9, :cond_3a

    .line 1358
    .line 1359
    move v7, v6

    .line 1360
    goto :goto_13

    .line 1361
    :cond_3a
    move v7, v5

    .line 1362
    :goto_13
    invoke-virtual {v10, v7}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 1363
    .line 1364
    .line 1365
    goto :goto_14

    .line 1366
    :cond_3b
    invoke-virtual {v10, v5}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 1367
    .line 1368
    .line 1369
    :goto_14
    iget-object v7, v10, Lr1/n;->s:Ls1/c;

    .line 1370
    .line 1371
    iget-object v9, v7, Ls1/c;->s:Lio/flutter/plugin/platform/s;

    .line 1372
    .line 1373
    iget-object v11, v10, Lr1/n;->A:Lio/flutter/view/i;

    .line 1374
    .line 1375
    iget-object v12, v9, Lio/flutter/plugin/platform/s;->s:Lio/flutter/plugin/platform/a;

    .line 1376
    .line 1377
    iput-object v11, v12, Lio/flutter/plugin/platform/a;->a:Lio/flutter/view/i;

    .line 1378
    .line 1379
    iget-object v7, v7, Ls1/c;->b:Lio/flutter/embedding/engine/renderer/k;

    .line 1380
    .line 1381
    new-instance v11, Lr1/a;

    .line 1382
    .line 1383
    invoke-direct {v11, v7, v6}, Lr1/a;-><init>(Lio/flutter/embedding/engine/renderer/k;Z)V

    .line 1384
    .line 1385
    .line 1386
    iput-object v11, v9, Lio/flutter/plugin/platform/s;->l:Lr1/a;

    .line 1387
    .line 1388
    iget-object v7, v10, Lr1/n;->s:Ls1/c;

    .line 1389
    .line 1390
    iget-object v9, v7, Ls1/c;->t:Lio/flutter/plugin/platform/r;

    .line 1391
    .line 1392
    iget-object v11, v10, Lr1/n;->A:Lio/flutter/view/i;

    .line 1393
    .line 1394
    iget-object v12, v9, Lio/flutter/plugin/platform/r;->r:Lio/flutter/plugin/platform/a;

    .line 1395
    .line 1396
    iput-object v11, v12, Lio/flutter/plugin/platform/a;->a:Lio/flutter/view/i;

    .line 1397
    .line 1398
    iget-object v7, v7, Ls1/c;->b:Lio/flutter/embedding/engine/renderer/k;

    .line 1399
    .line 1400
    new-instance v11, Lr1/a;

    .line 1401
    .line 1402
    invoke-direct {v11, v7, v6}, Lr1/a;-><init>(Lio/flutter/embedding/engine/renderer/k;Z)V

    .line 1403
    .line 1404
    .line 1405
    iput-object v11, v9, Lio/flutter/plugin/platform/r;->l:Lr1/a;

    .line 1406
    .line 1407
    iget-object v7, v10, Lr1/n;->v:Lio/flutter/plugin/editing/j;

    .line 1408
    .line 1409
    iget-object v7, v7, Lio/flutter/plugin/editing/j;->b:Landroid/view/inputmethod/InputMethodManager;

    .line 1410
    .line 1411
    invoke-virtual {v7, v10}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    .line 1412
    .line 1413
    .line 1414
    invoke-virtual {v10}, Lr1/n;->d()V

    .line 1415
    .line 1416
    .line 1417
    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1418
    .line 1419
    .line 1420
    move-result-object v7

    .line 1421
    invoke-virtual {v7}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 1422
    .line 1423
    .line 1424
    move-result-object v7

    .line 1425
    const-string v9, "show_password"

    .line 1426
    .line 1427
    invoke-static {v9}, Landroid/provider/Settings$System;->getUriFor(Ljava/lang/String;)Landroid/net/Uri;

    .line 1428
    .line 1429
    .line 1430
    move-result-object v9

    .line 1431
    iget-object v11, v10, Lr1/n;->F:LT/a;

    .line 1432
    .line 1433
    invoke-virtual {v7, v9, v5, v11}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 1434
    .line 1435
    .line 1436
    invoke-virtual {v10}, Lr1/n;->e()V

    .line 1437
    .line 1438
    .line 1439
    iget-object v7, v3, Ls1/c;->s:Lio/flutter/plugin/platform/s;

    .line 1440
    .line 1441
    iget-object v9, v7, Lio/flutter/plugin/platform/s;->v:Landroid/util/SparseArray;

    .line 1442
    .line 1443
    iget-object v11, v7, Lio/flutter/plugin/platform/s;->w:Landroid/util/SparseArray;

    .line 1444
    .line 1445
    iget-object v12, v7, Lio/flutter/plugin/platform/s;->y:Landroid/util/SparseArray;

    .line 1446
    .line 1447
    iput-object v10, v7, Lio/flutter/plugin/platform/s;->n:Lr1/n;

    .line 1448
    .line 1449
    move v13, v5

    .line 1450
    :goto_15
    invoke-virtual {v12}, Landroid/util/SparseArray;->size()I

    .line 1451
    .line 1452
    .line 1453
    move-result v14

    .line 1454
    if-ge v13, v14, :cond_3c

    .line 1455
    .line 1456
    invoke-virtual {v12, v13}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 1457
    .line 1458
    .line 1459
    move-result-object v14

    .line 1460
    check-cast v14, Lio/flutter/plugin/platform/j;

    .line 1461
    .line 1462
    iget-object v15, v7, Lio/flutter/plugin/platform/s;->n:Lr1/n;

    .line 1463
    .line 1464
    invoke-virtual {v15, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1465
    .line 1466
    .line 1467
    add-int/lit8 v13, v13, 0x1

    .line 1468
    .line 1469
    goto :goto_15

    .line 1470
    :cond_3c
    move v12, v5

    .line 1471
    :goto_16
    invoke-virtual {v11}, Landroid/util/SparseArray;->size()I

    .line 1472
    .line 1473
    .line 1474
    move-result v13

    .line 1475
    if-ge v12, v13, :cond_3d

    .line 1476
    .line 1477
    invoke-virtual {v11, v12}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 1478
    .line 1479
    .line 1480
    move-result-object v13

    .line 1481
    check-cast v13, Lx1/a;

    .line 1482
    .line 1483
    iget-object v14, v7, Lio/flutter/plugin/platform/s;->n:Lr1/n;

    .line 1484
    .line 1485
    invoke-virtual {v14, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1486
    .line 1487
    .line 1488
    add-int/lit8 v12, v12, 0x1

    .line 1489
    .line 1490
    goto :goto_16

    .line 1491
    :cond_3d
    move v7, v5

    .line 1492
    :goto_17
    invoke-virtual {v9}, Landroid/util/SparseArray;->size()I

    .line 1493
    .line 1494
    .line 1495
    move-result v11

    .line 1496
    if-ge v7, v11, :cond_3e

    .line 1497
    .line 1498
    invoke-virtual {v9, v7}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 1499
    .line 1500
    .line 1501
    move-result-object v11

    .line 1502
    check-cast v11, Lio/flutter/plugin/platform/g;

    .line 1503
    .line 1504
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1505
    .line 1506
    .line 1507
    add-int/lit8 v7, v7, 0x1

    .line 1508
    .line 1509
    goto :goto_17

    .line 1510
    :cond_3e
    iget-object v3, v3, Ls1/c;->t:Lio/flutter/plugin/platform/r;

    .line 1511
    .line 1512
    iget-object v7, v3, Lio/flutter/plugin/platform/r;->s:Landroid/util/SparseArray;

    .line 1513
    .line 1514
    iget-object v9, v3, Lio/flutter/plugin/platform/r;->t:Landroid/util/SparseArray;

    .line 1515
    .line 1516
    iput-object v10, v3, Lio/flutter/plugin/platform/r;->n:Lr1/n;

    .line 1517
    .line 1518
    move v11, v5

    .line 1519
    :goto_18
    invoke-virtual {v9}, Landroid/util/SparseArray;->size()I

    .line 1520
    .line 1521
    .line 1522
    move-result v12

    .line 1523
    if-ge v11, v12, :cond_3f

    .line 1524
    .line 1525
    invoke-virtual {v9, v11}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 1526
    .line 1527
    .line 1528
    move-result-object v12

    .line 1529
    check-cast v12, Lx1/a;

    .line 1530
    .line 1531
    iget-object v13, v3, Lio/flutter/plugin/platform/r;->n:Lr1/n;

    .line 1532
    .line 1533
    invoke-virtual {v13, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1534
    .line 1535
    .line 1536
    add-int/lit8 v11, v11, 0x1

    .line 1537
    .line 1538
    goto :goto_18

    .line 1539
    :cond_3f
    :goto_19
    invoke-virtual {v7}, Landroid/util/SparseArray;->size()I

    .line 1540
    .line 1541
    .line 1542
    move-result v3

    .line 1543
    if-ge v5, v3, :cond_40

    .line 1544
    .line 1545
    invoke-virtual {v7, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 1546
    .line 1547
    .line 1548
    move-result-object v3

    .line 1549
    check-cast v3, Lio/flutter/plugin/platform/g;

    .line 1550
    .line 1551
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1552
    .line 1553
    .line 1554
    add-int/lit8 v5, v5, 0x1

    .line 1555
    .line 1556
    goto :goto_19

    .line 1557
    :cond_40
    iget-object v3, v10, Lr1/n;->t:Ljava/util/HashSet;

    .line 1558
    .line 1559
    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 1560
    .line 1561
    .line 1562
    move-result-object v3

    .line 1563
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1564
    .line 1565
    .line 1566
    move-result v5

    .line 1567
    if-nez v5, :cond_46

    .line 1568
    .line 1569
    iget-boolean v3, v10, Lr1/n;->r:Z

    .line 1570
    .line 1571
    if-eqz v3, :cond_41

    .line 1572
    .line 1573
    invoke-virtual {v4}, Lio/flutter/embedding/engine/renderer/a;->b()V

    .line 1574
    .line 1575
    .line 1576
    :cond_41
    :goto_1a
    iget-object v3, v0, Lr1/e;->c:Lr1/n;

    .line 1577
    .line 1578
    invoke-virtual {v3, v8}, Landroid/view/View;->setId(I)V

    .line 1579
    .line 1580
    .line 1581
    if-eqz v2, :cond_44

    .line 1582
    .line 1583
    iget-object v2, v0, Lr1/e;->c:Lr1/n;

    .line 1584
    .line 1585
    iget-object v3, v0, Lr1/e;->a:Lr1/b;

    .line 1586
    .line 1587
    invoke-virtual {v3}, Lr1/b;->d()I

    .line 1588
    .line 1589
    .line 1590
    move-result v3

    .line 1591
    if-ne v3, v6, :cond_43

    .line 1592
    .line 1593
    iget-object v3, v0, Lr1/e;->f:Lr1/c;

    .line 1594
    .line 1595
    if-eqz v3, :cond_42

    .line 1596
    .line 1597
    invoke-virtual {v2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 1598
    .line 1599
    .line 1600
    move-result-object v3

    .line 1601
    iget-object v4, v0, Lr1/e;->f:Lr1/c;

    .line 1602
    .line 1603
    invoke-virtual {v3, v4}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 1604
    .line 1605
    .line 1606
    :cond_42
    new-instance v3, Lr1/c;

    .line 1607
    .line 1608
    invoke-direct {v3, v0, v2}, Lr1/c;-><init>(Lr1/e;Lr1/n;)V

    .line 1609
    .line 1610
    .line 1611
    iput-object v3, v0, Lr1/e;->f:Lr1/c;

    .line 1612
    .line 1613
    invoke-virtual {v2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 1614
    .line 1615
    .line 1616
    move-result-object v2

    .line 1617
    iget-object v3, v0, Lr1/e;->f:Lr1/c;

    .line 1618
    .line 1619
    invoke-virtual {v2, v3}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 1620
    .line 1621
    .line 1622
    goto :goto_1b

    .line 1623
    :cond_43
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1624
    .line 1625
    const-string v2, "Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`."

    .line 1626
    .line 1627
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1628
    .line 1629
    .line 1630
    throw v0

    .line 1631
    :cond_44
    :goto_1b
    iget-object v0, v0, Lr1/e;->c:Lr1/n;

    .line 1632
    .line 1633
    invoke-virtual {v1, v0}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    .line 1634
    .line 1635
    .line 1636
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 1637
    .line 1638
    .line 1639
    move-result-object v0

    .line 1640
    const/high16 v2, -0x80000000

    .line 1641
    .line 1642
    invoke-virtual {v0, v2}, Landroid/view/Window;->addFlags(I)V

    .line 1643
    .line 1644
    .line 1645
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1646
    .line 1647
    const/16 v3, 0x23

    .line 1648
    .line 1649
    if-ge v2, v3, :cond_45

    .line 1650
    .line 1651
    const/high16 v2, 0x40000000    # 2.0f

    .line 1652
    .line 1653
    invoke-virtual {v0, v2}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 1654
    .line 1655
    .line 1656
    :cond_45
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 1657
    .line 1658
    .line 1659
    move-result-object v0

    .line 1660
    const/16 v2, 0x500

    .line 1661
    .line 1662
    invoke-virtual {v0, v2}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 1663
    .line 1664
    .line 1665
    return-void

    .line 1666
    :cond_46
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1667
    .line 1668
    .line 1669
    move-result-object v0

    .line 1670
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1671
    .line 1672
    .line 1673
    new-instance v0, Ljava/lang/ClassCastException;

    .line 1674
    .line 1675
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 1676
    .line 1677
    .line 1678
    throw v0

    .line 1679
    :goto_1c
    :try_start_7
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 1680
    .line 1681
    .line 1682
    goto :goto_1d

    .line 1683
    :catchall_4
    move-exception v0

    .line 1684
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 1685
    .line 1686
    .line 1687
    :goto_1d
    throw v2
.end method

.method public final onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 2
    .line 3
    .line 4
    const-string v0, "onDestroy"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lr1/b;->m(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lr1/b;->l:Lr1/e;

    .line 13
    .line 14
    invoke-virtual {v0}, Lr1/e;->e()V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lr1/b;->l:Lr1/e;

    .line 18
    .line 19
    invoke-virtual {v0}, Lr1/e;->f()V

    .line 20
    .line 21
    .line 22
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 23
    .line 24
    const/16 v1, 0x21

    .line 25
    .line 26
    if-lt v0, v1, :cond_1

    .line 27
    .line 28
    invoke-static {p0}, Lorg/apache/tika/io/a;->a(Lr1/b;)Landroid/window/OnBackInvokedDispatcher;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-object v1, p0, Lr1/b;->n:Landroid/window/OnBackInvokedCallback;

    .line 33
    .line 34
    invoke-static {v0, v1}, LE/c;->z(Landroid/window/OnBackInvokedDispatcher;Landroid/window/OnBackInvokedCallback;)V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    iput-boolean v0, p0, Lr1/b;->k:Z

    .line 39
    .line 40
    :cond_1
    iget-object v0, p0, Lr1/b;->l:Lr1/e;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    iput-object v1, v0, Lr1/e;->a:Lr1/b;

    .line 46
    .line 47
    iput-object v1, v0, Lr1/e;->b:Ls1/c;

    .line 48
    .line 49
    iput-object v1, v0, Lr1/e;->c:Lr1/n;

    .line 50
    .line 51
    iput-object v1, v0, Lr1/e;->d:Lio/flutter/plugin/platform/f;

    .line 52
    .line 53
    iput-object v1, v0, Lr1/e;->e:LG1/a;

    .line 54
    .line 55
    iput-object v1, p0, Lr1/b;->l:Lr1/e;

    .line 56
    .line 57
    :cond_2
    iget-object v0, p0, Lr1/b;->m:Landroidx/lifecycle/u;

    .line 58
    .line 59
    sget-object v1, Landroidx/lifecycle/l;->ON_DESTROY:Landroidx/lifecycle/l;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Landroidx/lifecycle/u;->e(Landroidx/lifecycle/l;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public final onNewIntent(Landroid/content/Intent;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "onNewIntent"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lr1/b;->m(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_4

    .line 11
    .line 12
    iget-object v0, p0, Lr1/b;->l:Lr1/e;

    .line 13
    .line 14
    invoke-virtual {v0}, Lr1/e;->c()V

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, Lr1/e;->b:Ls1/c;

    .line 18
    .line 19
    if-eqz v1, :cond_3

    .line 20
    .line 21
    iget-object v1, v1, Ls1/c;->d:Lj0/a;

    .line 22
    .line 23
    invoke-virtual {v1}, Lj0/a;->f()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v3, 0x0

    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    const-string v2, "FlutterEngineConnectionRegistry#onNewIntent"

    .line 31
    .line 32
    invoke-static {v2}, LN1/a;->b(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :try_start_0
    iget-object v1, v1, Lj0/a;->h:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Lk/u0;

    .line 38
    .line 39
    iget-object v1, v1, Lk/u0;->e:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Ljava/util/HashSet;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    if-nez v2, :cond_0

    .line 52
    .line 53
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_0
    :try_start_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    if-nez p1, :cond_1

    .line 62
    .line 63
    throw v3

    .line 64
    :cond_1
    new-instance p1, Ljava/lang/ClassCastException;

    .line 65
    .line 66
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 67
    .line 68
    .line 69
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    :catchall_0
    move-exception p1

    .line 71
    :try_start_2
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :catchall_1
    move-exception v0

    .line 76
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    :goto_0
    throw p1

    .line 80
    :cond_2
    const-string v1, "FlutterEngineCxnRegstry"

    .line 81
    .line 82
    const-string v2, "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached."

    .line 83
    .line 84
    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    :goto_1
    invoke-virtual {v0, p1}, Lr1/e;->d(Landroid/content/Intent;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    if-eqz p1, :cond_4

    .line 92
    .line 93
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-nez v1, :cond_4

    .line 98
    .line 99
    iget-object v0, v0, Lr1/e;->b:Ls1/c;

    .line 100
    .line 101
    iget-object v0, v0, Ls1/c;->i:LB1/c;

    .line 102
    .line 103
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    new-instance v1, Ljava/util/HashMap;

    .line 107
    .line 108
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 109
    .line 110
    .line 111
    const-string v2, "location"

    .line 112
    .line 113
    invoke-virtual {v1, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    iget-object p1, v0, LB1/c;->a:LB1/s;

    .line 117
    .line 118
    const-string v0, "pushRouteInformation"

    .line 119
    .line 120
    invoke-virtual {p1, v0, v1, v3}, LB1/s;->s(Ljava/lang/String;Ljava/lang/Object;LB1/o;)V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :cond_3
    const-string p1, "FlutterActivityAndFragmentDelegate"

    .line 125
    .line 126
    const-string v0, "onNewIntent() invoked before FlutterFragment was attached to an Activity."

    .line 127
    .line 128
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 129
    .line 130
    .line 131
    :cond_4
    return-void
.end method

.method public final onPause()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 2
    .line 3
    .line 4
    const-string v0, "onPause"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lr1/b;->m(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lr1/b;->l:Lr1/e;

    .line 13
    .line 14
    invoke-virtual {v0}, Lr1/e;->c()V

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, Lr1/e;->a:Lr1/b;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v0, v0, Lr1/e;->b:Ls1/c;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iget-object v0, v0, Ls1/c;->g:LB1/f;

    .line 27
    .line 28
    const/4 v1, 0x3

    .line 29
    iget-boolean v2, v0, LB1/f;->c:Z

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, LB1/f;->a(IZ)V

    .line 32
    .line 33
    .line 34
    :cond_0
    iget-object v0, p0, Lr1/b;->m:Landroidx/lifecycle/u;

    .line 35
    .line 36
    sget-object v1, Landroidx/lifecycle/l;->ON_PAUSE:Landroidx/lifecycle/l;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroidx/lifecycle/u;->e(Landroidx/lifecycle/l;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final onPostResume()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onPostResume()V

    .line 2
    .line 3
    .line 4
    const-string v0, "onPostResume"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lr1/b;->m(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    iget-object v0, p0, Lr1/b;->l:Lr1/e;

    .line 13
    .line 14
    invoke-virtual {v0}, Lr1/e;->c()V

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, Lr1/e;->b:Ls1/c;

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    iget-object v1, v0, Lr1/e;->d:Lio/flutter/plugin/platform/f;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-virtual {v1}, Lio/flutter/plugin/platform/f;->b()V

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object v0, v0, Lr1/e;->b:Ls1/c;

    .line 29
    .line 30
    iget-object v0, v0, Ls1/c;->s:Lio/flutter/plugin/platform/s;

    .line 31
    .line 32
    invoke-virtual {v0}, Lio/flutter/plugin/platform/s;->j()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    const-string v0, "FlutterActivityAndFragmentDelegate"

    .line 37
    .line 38
    const-string v1, "onPostResume() invoked before FlutterFragment was attached to an Activity."

    .line 39
    .line 40
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    :cond_2
    return-void
.end method

.method public final onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 7

    .line 1
    const-string v0, "onRequestPermissionsResult"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lr1/b;->m(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_a

    .line 8
    .line 9
    iget-object v0, p0, Lr1/b;->l:Lr1/e;

    .line 10
    .line 11
    invoke-virtual {v0}, Lr1/e;->c()V

    .line 12
    .line 13
    .line 14
    iget-object v1, v0, Lr1/e;->b:Ls1/c;

    .line 15
    .line 16
    if-eqz v1, :cond_9

    .line 17
    .line 18
    invoke-static {p2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    invoke-static {p3}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    iget-object p2, v0, Lr1/e;->b:Ls1/c;

    .line 25
    .line 26
    iget-object p2, p2, Ls1/c;->d:Lj0/a;

    .line 27
    .line 28
    invoke-virtual {p2}, Lj0/a;->f()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_8

    .line 33
    .line 34
    const-string v0, "FlutterEngineConnectionRegistry#onRequestPermissionsResult"

    .line 35
    .line 36
    invoke-static {v0}, LN1/a;->b(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :try_start_0
    iget-object p2, p2, Lj0/a;->h:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p2, Lk/u0;

    .line 42
    .line 43
    iget-object p2, p2, Lk/u0;->c:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p2, Ljava/util/HashSet;

    .line 46
    .line 47
    invoke-virtual {p2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    const/4 v0, 0x0

    .line 52
    :cond_0
    move v1, v0

    .line 53
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_7

    .line 58
    .line 59
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    check-cast v2, LJ1/n;

    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    array-length v3, p3

    .line 69
    const/4 v4, 0x1

    .line 70
    if-lez v3, :cond_1

    .line 71
    .line 72
    aget v3, p3, v0

    .line 73
    .line 74
    if-nez v3, :cond_1

    .line 75
    .line 76
    move v3, v4

    .line 77
    goto :goto_1

    .line 78
    :cond_1
    move v3, v0

    .line 79
    :goto_1
    const/16 v5, 0x933

    .line 80
    .line 81
    const/16 v6, 0x929

    .line 82
    .line 83
    if-eq p1, v6, :cond_3

    .line 84
    .line 85
    if-eq p1, v5, :cond_2

    .line 86
    .line 87
    if-eqz v1, :cond_0

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_2
    if-eqz v3, :cond_4

    .line 91
    .line 92
    invoke-virtual {v2}, LJ1/n;->j()V

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_3
    if-eqz v3, :cond_4

    .line 97
    .line 98
    invoke-virtual {v2}, LJ1/n;->i()V

    .line 99
    .line 100
    .line 101
    :cond_4
    :goto_2
    if-nez v3, :cond_6

    .line 102
    .line 103
    if-eq p1, v6, :cond_5

    .line 104
    .line 105
    if-eq p1, v5, :cond_5

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_5
    const-string v1, "camera_access_denied"

    .line 109
    .line 110
    const-string v3, "The user did not allow camera access."

    .line 111
    .line 112
    invoke-virtual {v2, v1, v3}, LJ1/n;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    .line 114
    .line 115
    goto :goto_3

    .line 116
    :catchall_0
    move-exception p1

    .line 117
    goto :goto_4

    .line 118
    :cond_6
    :goto_3
    move v1, v4

    .line 119
    goto :goto_0

    .line 120
    :cond_7
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :goto_4
    :try_start_1
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 125
    .line 126
    .line 127
    goto :goto_5

    .line 128
    :catchall_1
    move-exception p2

    .line 129
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 130
    .line 131
    .line 132
    :goto_5
    throw p1

    .line 133
    :cond_8
    const-string p1, "FlutterEngineCxnRegstry"

    .line 134
    .line 135
    const-string p2, "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached."

    .line 136
    .line 137
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 138
    .line 139
    .line 140
    return-void

    .line 141
    :cond_9
    const-string p1, "FlutterActivityAndFragmentDelegate"

    .line 142
    .line 143
    const-string p2, "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity."

    .line 144
    .line 145
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 146
    .line 147
    .line 148
    :cond_a
    return-void
.end method

.method public final onResume()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lr1/b;->m:Landroidx/lifecycle/u;

    .line 5
    .line 6
    sget-object v1, Landroidx/lifecycle/l;->ON_RESUME:Landroidx/lifecycle/l;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroidx/lifecycle/u;->e(Landroidx/lifecycle/l;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onResume"

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lr1/b;->m(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lr1/b;->l:Lr1/e;

    .line 20
    .line 21
    invoke-virtual {v0}, Lr1/e;->c()V

    .line 22
    .line 23
    .line 24
    iget-object v1, v0, Lr1/e;->b:Ls1/c;

    .line 25
    .line 26
    iget-object v1, v1, Ls1/c;->b:Lio/flutter/embedding/engine/renderer/k;

    .line 27
    .line 28
    invoke-virtual {v1}, Lio/flutter/embedding/engine/renderer/k;->i()V

    .line 29
    .line 30
    .line 31
    iget-object v1, v0, Lr1/e;->a:Lr1/b;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget-object v0, v0, Lr1/e;->b:Ls1/c;

    .line 37
    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    iget-object v0, v0, Ls1/c;->g:LB1/f;

    .line 41
    .line 42
    const/4 v1, 0x2

    .line 43
    iget-boolean v2, v0, LB1/f;->c:Z

    .line 44
    .line 45
    invoke-virtual {v0, v1, v2}, LB1/f;->a(IZ)V

    .line 46
    .line 47
    .line 48
    :cond_0
    return-void
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "onSaveInstanceState"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lr1/b;->m(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_4

    .line 11
    .line 12
    iget-object v0, p0, Lr1/b;->l:Lr1/e;

    .line 13
    .line 14
    invoke-virtual {v0}, Lr1/e;->c()V

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, Lr1/e;->a:Lr1/b;

    .line 18
    .line 19
    invoke-virtual {v1}, Lr1/b;->l()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iget-object v1, v0, Lr1/e;->b:Ls1/c;

    .line 26
    .line 27
    iget-object v1, v1, Ls1/c;->k:LB1/p;

    .line 28
    .line 29
    iget-object v1, v1, LB1/p;->d:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, [B

    .line 32
    .line 33
    const-string v2, "framework"

    .line 34
    .line 35
    invoke-virtual {p1, v2, v1}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 36
    .line 37
    .line 38
    :cond_0
    iget-object v1, v0, Lr1/e;->a:Lr1/b;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    new-instance v1, Landroid/os/Bundle;

    .line 44
    .line 45
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 46
    .line 47
    .line 48
    iget-object v2, v0, Lr1/e;->b:Ls1/c;

    .line 49
    .line 50
    iget-object v2, v2, Ls1/c;->d:Lj0/a;

    .line 51
    .line 52
    invoke-virtual {v2}, Lj0/a;->f()Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-eqz v3, :cond_3

    .line 57
    .line 58
    const-string v3, "FlutterEngineConnectionRegistry#onSaveInstanceState"

    .line 59
    .line 60
    invoke-static {v3}, LN1/a;->b(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :try_start_0
    iget-object v2, v2, Lj0/a;->h:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v2, Lk/u0;

    .line 66
    .line 67
    iget-object v2, v2, Lk/u0;->g:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v2, Ljava/util/HashSet;

    .line 70
    .line 71
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    if-nez v3, :cond_1

    .line 80
    .line 81
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    :try_start_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    if-nez p1, :cond_2

    .line 90
    .line 91
    const/4 p1, 0x0

    .line 92
    throw p1

    .line 93
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 94
    .line 95
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 96
    .line 97
    .line 98
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 99
    :catchall_0
    move-exception p1

    .line 100
    :try_start_2
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :catchall_1
    move-exception v0

    .line 105
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 106
    .line 107
    .line 108
    :goto_0
    throw p1

    .line 109
    :cond_3
    const-string v2, "FlutterEngineCxnRegstry"

    .line 110
    .line 111
    const-string v3, "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached."

    .line 112
    .line 113
    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 114
    .line 115
    .line 116
    :goto_1
    const-string v2, "plugins"

    .line 117
    .line 118
    invoke-virtual {p1, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 119
    .line 120
    .line 121
    iget-object v1, v0, Lr1/e;->a:Lr1/b;

    .line 122
    .line 123
    invoke-virtual {v1}, Lr1/b;->e()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    if-eqz v1, :cond_4

    .line 128
    .line 129
    iget-object v1, v0, Lr1/e;->a:Lr1/b;

    .line 130
    .line 131
    invoke-virtual {v1}, Lr1/b;->k()Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-nez v1, :cond_4

    .line 136
    .line 137
    iget-object v0, v0, Lr1/e;->a:Lr1/b;

    .line 138
    .line 139
    iget-boolean v0, v0, Lr1/b;->k:Z

    .line 140
    .line 141
    const-string v1, "enableOnBackInvokedCallbackState"

    .line 142
    .line 143
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 144
    .line 145
    .line 146
    :cond_4
    return-void
.end method

.method public final onStart()V
    .locals 6

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lr1/b;->m:Landroidx/lifecycle/u;

    .line 5
    .line 6
    sget-object v1, Landroidx/lifecycle/l;->ON_START:Landroidx/lifecycle/l;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroidx/lifecycle/u;->e(Landroidx/lifecycle/l;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onStart"

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lr1/b;->m(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_7

    .line 18
    .line 19
    iget-object v0, p0, Lr1/b;->l:Lr1/e;

    .line 20
    .line 21
    invoke-virtual {v0}, Lr1/e;->c()V

    .line 22
    .line 23
    .line 24
    iget-object v1, v0, Lr1/e;->a:Lr1/b;

    .line 25
    .line 26
    invoke-virtual {v1}, Lr1/b;->e()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    goto/16 :goto_2

    .line 33
    .line 34
    :cond_0
    iget-object v1, v0, Lr1/e;->b:Ls1/c;

    .line 35
    .line 36
    iget-object v1, v1, Ls1/c;->c:Lt1/c;

    .line 37
    .line 38
    iget-boolean v1, v1, Lt1/c;->p:Z

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    goto/16 :goto_2

    .line 43
    .line 44
    :cond_1
    iget-object v1, v0, Lr1/e;->a:Lr1/b;

    .line 45
    .line 46
    invoke-virtual {v1}, Lr1/b;->g()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    if-nez v1, :cond_2

    .line 51
    .line 52
    iget-object v1, v0, Lr1/e;->a:Lr1/b;

    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v0, v1}, Lr1/e;->d(Landroid/content/Intent;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    if-nez v1, :cond_2

    .line 66
    .line 67
    const-string v1, "/"

    .line 68
    .line 69
    :cond_2
    iget-object v2, v0, Lr1/e;->a:Lr1/b;

    .line 70
    .line 71
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    const/4 v3, 0x0

    .line 75
    :try_start_0
    invoke-virtual {v2}, Lr1/b;->i()Landroid/os/Bundle;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    if-eqz v2, :cond_3

    .line 80
    .line 81
    const-string v4, "io.flutter.EntrypointUri"

    .line 82
    .line 83
    invoke-virtual {v2, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v2
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    goto :goto_0

    .line 88
    :catch_0
    :cond_3
    move-object v2, v3

    .line 89
    :goto_0
    iget-object v4, v0, Lr1/e;->a:Lr1/b;

    .line 90
    .line 91
    invoke-virtual {v4}, Lr1/b;->f()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    iget-object v4, v0, Lr1/e;->b:Ls1/c;

    .line 95
    .line 96
    iget-object v4, v4, Ls1/c;->i:LB1/c;

    .line 97
    .line 98
    iget-object v4, v4, LB1/c;->a:LB1/s;

    .line 99
    .line 100
    const-string v5, "setInitialRoute"

    .line 101
    .line 102
    invoke-virtual {v4, v5, v1, v3}, LB1/s;->s(Ljava/lang/String;Ljava/lang/Object;LB1/o;)V

    .line 103
    .line 104
    .line 105
    iget-object v1, v0, Lr1/e;->a:Lr1/b;

    .line 106
    .line 107
    invoke-virtual {v1}, Lr1/b;->a()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    if-eqz v1, :cond_4

    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    if-eqz v3, :cond_5

    .line 118
    .line 119
    :cond_4
    invoke-static {}, LA0/j;->E()LA0/j;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    iget-object v1, v1, LA0/j;->l:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v1, Lw1/c;

    .line 126
    .line 127
    iget-object v1, v1, Lw1/c;->e:Lg1/i;

    .line 128
    .line 129
    iget-object v1, v1, Lg1/i;->c:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v1, Ljava/lang/String;

    .line 132
    .line 133
    :cond_5
    if-nez v2, :cond_6

    .line 134
    .line 135
    new-instance v2, Lt1/b;

    .line 136
    .line 137
    iget-object v3, v0, Lr1/e;->a:Lr1/b;

    .line 138
    .line 139
    invoke-virtual {v3}, Lr1/b;->f()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    invoke-direct {v2, v1, v3}, Lt1/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_6
    new-instance v3, Lt1/b;

    .line 148
    .line 149
    iget-object v4, v0, Lr1/e;->a:Lr1/b;

    .line 150
    .line 151
    invoke-virtual {v4}, Lr1/b;->f()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    invoke-direct {v3, v1, v2, v4}, Lt1/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    move-object v2, v3

    .line 159
    :goto_1
    iget-object v1, v0, Lr1/e;->b:Ls1/c;

    .line 160
    .line 161
    iget-object v1, v1, Ls1/c;->c:Lt1/c;

    .line 162
    .line 163
    iget-object v3, v0, Lr1/e;->a:Lr1/b;

    .line 164
    .line 165
    invoke-virtual {v3}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    const-string v4, "dart_entrypoint_args"

    .line 170
    .line 171
    invoke-virtual {v3, v4}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    check-cast v3, Ljava/util/List;

    .line 176
    .line 177
    invoke-virtual {v1, v2, v3}, Lt1/c;->d(Lt1/b;Ljava/util/List;)V

    .line 178
    .line 179
    .line 180
    :goto_2
    iget-object v1, v0, Lr1/e;->k:Ljava/lang/Integer;

    .line 181
    .line 182
    if-eqz v1, :cond_7

    .line 183
    .line 184
    iget-object v0, v0, Lr1/e;->c:Lr1/n;

    .line 185
    .line 186
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    invoke-virtual {v0, v1}, Lr1/n;->setVisibility(I)V

    .line 191
    .line 192
    .line 193
    :cond_7
    return-void
.end method

.method public final onStop()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 2
    .line 3
    .line 4
    const-string v0, "onStop"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lr1/b;->m(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lr1/b;->l:Lr1/e;

    .line 13
    .line 14
    invoke-virtual {v0}, Lr1/e;->c()V

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, Lr1/e;->a:Lr1/b;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v1, v0, Lr1/e;->b:Ls1/c;

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    iget-object v1, v1, Ls1/c;->g:LB1/f;

    .line 27
    .line 28
    const/4 v2, 0x5

    .line 29
    iget-boolean v3, v1, LB1/f;->c:Z

    .line 30
    .line 31
    invoke-virtual {v1, v2, v3}, LB1/f;->a(IZ)V

    .line 32
    .line 33
    .line 34
    :cond_0
    iget-object v1, v0, Lr1/e;->c:Lr1/n;

    .line 35
    .line 36
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iput-object v1, v0, Lr1/e;->k:Ljava/lang/Integer;

    .line 45
    .line 46
    iget-object v1, v0, Lr1/e;->c:Lr1/n;

    .line 47
    .line 48
    const/16 v2, 0x8

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Lr1/n;->setVisibility(I)V

    .line 51
    .line 52
    .line 53
    iget-object v0, v0, Lr1/e;->b:Ls1/c;

    .line 54
    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    iget-object v0, v0, Ls1/c;->b:Lio/flutter/embedding/engine/renderer/k;

    .line 58
    .line 59
    const/16 v1, 0x28

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Lio/flutter/embedding/engine/renderer/k;->f(I)V

    .line 62
    .line 63
    .line 64
    :cond_1
    iget-object v0, p0, Lr1/b;->m:Landroidx/lifecycle/u;

    .line 65
    .line 66
    sget-object v1, Landroidx/lifecycle/l;->ON_STOP:Landroidx/lifecycle/l;

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Landroidx/lifecycle/u;->e(Landroidx/lifecycle/l;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public final onTrimMemory(I)V
    .locals 6

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onTrimMemory(I)V

    .line 2
    .line 3
    .line 4
    const-string v0, "onTrimMemory"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lr1/b;->m(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    iget-object v0, p0, Lr1/b;->l:Lr1/e;

    .line 13
    .line 14
    invoke-virtual {v0}, Lr1/e;->c()V

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, Lr1/e;->b:Ls1/c;

    .line 18
    .line 19
    if-eqz v1, :cond_3

    .line 20
    .line 21
    iget-boolean v2, v0, Lr1/e;->i:Z

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    const/16 v2, 0xa

    .line 27
    .line 28
    if-lt p1, v2, :cond_1

    .line 29
    .line 30
    iget-object v1, v1, Ls1/c;->c:Lt1/c;

    .line 31
    .line 32
    iget-object v1, v1, Lt1/c;->k:Lio/flutter/embedding/engine/FlutterJNI;

    .line 33
    .line 34
    invoke-virtual {v1}, Lio/flutter/embedding/engine/FlutterJNI;->isAttached()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    invoke-virtual {v1}, Lio/flutter/embedding/engine/FlutterJNI;->notifyLowMemoryWarning()V

    .line 41
    .line 42
    .line 43
    :cond_0
    iget-object v1, v0, Lr1/e;->b:Ls1/c;

    .line 44
    .line 45
    iget-object v1, v1, Ls1/c;->q:LB1/g;

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    new-instance v2, Ljava/util/HashMap;

    .line 51
    .line 52
    const/4 v4, 0x1

    .line 53
    invoke-direct {v2, v4}, Ljava/util/HashMap;-><init>(I)V

    .line 54
    .line 55
    .line 56
    const-string v4, "type"

    .line 57
    .line 58
    const-string v5, "memoryPressure"

    .line 59
    .line 60
    invoke-virtual {v2, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    iget-object v1, v1, LB1/g;->l:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, LB1/s;

    .line 66
    .line 67
    invoke-virtual {v1, v2, v3}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    iget-object v1, v0, Lr1/e;->b:Ls1/c;

    .line 71
    .line 72
    iget-object v1, v1, Ls1/c;->b:Lio/flutter/embedding/engine/renderer/k;

    .line 73
    .line 74
    invoke-virtual {v1, p1}, Lio/flutter/embedding/engine/renderer/k;->f(I)V

    .line 75
    .line 76
    .line 77
    iget-object v0, v0, Lr1/e;->b:Ls1/c;

    .line 78
    .line 79
    iget-object v0, v0, Ls1/c;->s:Lio/flutter/plugin/platform/s;

    .line 80
    .line 81
    const/16 v1, 0x28

    .line 82
    .line 83
    if-ge p1, v1, :cond_2

    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_2
    iget-object p1, v0, Lio/flutter/plugin/platform/s;->t:Ljava/util/HashMap;

    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_3

    .line 104
    .line 105
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    check-cast v0, Lio/flutter/plugin/platform/D;

    .line 110
    .line 111
    iget-object v0, v0, Lio/flutter/plugin/platform/D;->h:Landroid/hardware/display/VirtualDisplay;

    .line 112
    .line 113
    invoke-virtual {v0, v3}, Landroid/hardware/display/VirtualDisplay;->setSurface(Landroid/view/Surface;)V

    .line 114
    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_3
    return-void
.end method

.method public final onUserLeaveHint()V
    .locals 2

    .line 1
    const-string v0, "onUserLeaveHint"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lr1/b;->m(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_4

    .line 8
    .line 9
    iget-object v0, p0, Lr1/b;->l:Lr1/e;

    .line 10
    .line 11
    invoke-virtual {v0}, Lr1/e;->c()V

    .line 12
    .line 13
    .line 14
    iget-object v0, v0, Lr1/e;->b:Ls1/c;

    .line 15
    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    iget-object v0, v0, Ls1/c;->d:Lj0/a;

    .line 19
    .line 20
    invoke-virtual {v0}, Lj0/a;->f()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    const-string v1, "FlutterEngineConnectionRegistry#onUserLeaveHint"

    .line 27
    .line 28
    invoke-static {v1}, LN1/a;->b(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    :try_start_0
    iget-object v0, v0, Lj0/a;->h:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Lk/u0;

    .line 34
    .line 35
    iget-object v0, v0, Lk/u0;->f:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Ljava/util/HashSet;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    if-nez v1, :cond_0

    .line 48
    .line 49
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_0
    :try_start_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-nez v0, :cond_1

    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    throw v0

    .line 61
    :cond_1
    new-instance v0, Ljava/lang/ClassCastException;

    .line 62
    .line 63
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 64
    .line 65
    .line 66
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    :catchall_0
    move-exception v0

    .line 68
    :try_start_2
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :catchall_1
    move-exception v1

    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    :goto_0
    throw v0

    .line 77
    :cond_2
    const-string v0, "FlutterEngineCxnRegstry"

    .line 78
    .line 79
    const-string v1, "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached."

    .line 80
    .line 81
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_3
    const-string v0, "FlutterActivityAndFragmentDelegate"

    .line 86
    .line 87
    const-string v1, "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity."

    .line 88
    .line 89
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    :cond_4
    return-void
.end method

.method public final onWindowFocusChanged(Z)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onWindowFocusChanged(Z)V

    .line 2
    .line 3
    .line 4
    const-string v0, "onWindowFocusChanged"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lr1/b;->m(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lr1/b;->l:Lr1/e;

    .line 13
    .line 14
    invoke-virtual {v0}, Lr1/e;->c()V

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, Lr1/e;->a:Lr1/b;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v0, v0, Lr1/e;->b:Ls1/c;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-object v0, v0, Ls1/c;->g:LB1/f;

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    iget p1, v0, LB1/f;->a:I

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    invoke-virtual {v0, p1, v1}, LB1/f;->a(IZ)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    iget p1, v0, LB1/f;->a:I

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-virtual {v0, p1, v1}, LB1/f;->a(IZ)V

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void
.end method

.class public abstract Lw/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LS0/a;

.field public static final b:Lo/i;

.field public static c:Landroid/graphics/Paint;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "TypefaceCompat static init"

    .line 2
    .line 3
    invoke-static {v0}, LE2/a;->V(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 11
    .line 12
    const/16 v1, 0x1f

    .line 13
    .line 14
    if-lt v0, v1, :cond_0

    .line 15
    .line 16
    new-instance v0, Lw/k;

    .line 17
    .line 18
    invoke-direct {v0}, LS0/a;-><init>()V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lw/e;->a:LS0/a;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/16 v1, 0x1d

    .line 25
    .line 26
    if-lt v0, v1, :cond_1

    .line 27
    .line 28
    new-instance v0, Lw/j;

    .line 29
    .line 30
    invoke-direct {v0}, LS0/a;-><init>()V

    .line 31
    .line 32
    .line 33
    sput-object v0, Lw/e;->a:LS0/a;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/16 v1, 0x1c

    .line 37
    .line 38
    if-lt v0, v1, :cond_2

    .line 39
    .line 40
    new-instance v0, Lw/i;

    .line 41
    .line 42
    invoke-direct {v0}, Lw/h;-><init>()V

    .line 43
    .line 44
    .line 45
    sput-object v0, Lw/e;->a:LS0/a;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    const/16 v1, 0x1a

    .line 49
    .line 50
    if-lt v0, v1, :cond_3

    .line 51
    .line 52
    new-instance v0, Lw/h;

    .line 53
    .line 54
    invoke-direct {v0}, Lw/h;-><init>()V

    .line 55
    .line 56
    .line 57
    sput-object v0, Lw/e;->a:LS0/a;

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    sget-object v0, Lw/g;->e:Ljava/lang/reflect/Method;

    .line 61
    .line 62
    if-nez v0, :cond_4

    .line 63
    .line 64
    const-string v1, "TypefaceCompatApi24Impl"

    .line 65
    .line 66
    const-string v2, "Unable to collect necessary private methods.Fallback to legacy implementation."

    .line 67
    .line 68
    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 69
    .line 70
    .line 71
    :cond_4
    if-eqz v0, :cond_5

    .line 72
    .line 73
    new-instance v0, Lw/g;

    .line 74
    .line 75
    invoke-direct {v0}, LS0/a;-><init>()V

    .line 76
    .line 77
    .line 78
    sput-object v0, Lw/e;->a:LS0/a;

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_5
    new-instance v0, Lw/f;

    .line 82
    .line 83
    invoke-direct {v0}, LS0/a;-><init>()V

    .line 84
    .line 85
    .line 86
    sput-object v0, Lw/e;->a:LS0/a;

    .line 87
    .line 88
    :goto_0
    new-instance v0, Lo/i;

    .line 89
    .line 90
    const/16 v1, 0x10

    .line 91
    .line 92
    invoke-direct {v0, v1}, Lo/i;-><init>(I)V

    .line 93
    .line 94
    .line 95
    sput-object v0, Lw/e;->b:Lo/i;

    .line 96
    .line 97
    const/4 v0, 0x0

    .line 98
    sput-object v0, Lw/e;->c:Landroid/graphics/Paint;

    .line 99
    .line 100
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 101
    .line 102
    .line 103
    return-void
.end method

.method public static a(Landroid/content/Context;Lv/a;Landroid/content/res/Resources;ILjava/lang/String;IILk/s;)Landroid/graphics/Typeface;
    .locals 14

    move/from16 v4, p6

    move-object/from16 v1, p7

    .line 1
    instance-of v2, p1, Lv/d;

    const/16 v3, 0x13

    if-eqz v2, :cond_13

    .line 2
    move-object v0, p1

    check-cast v0, Lv/d;

    .line 3
    const-string v2, "TypefaceCompat"

    .line 4
    iget-object v5, v0, Lv/d;->d:Ljava/lang/String;

    .line 5
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-nez v6, :cond_0

    .line 6
    invoke-static {v5}, Lw/e;->c(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v5

    if-eqz v5, :cond_0

    goto/16 :goto_6

    .line 7
    :cond_0
    iget-object v5, v0, Lv/d;->a:Ljava/util/ArrayList;

    .line 8
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ne v6, v8, :cond_1

    .line 9
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LA/g;

    .line 10
    iget-object v2, v2, LA/g;->e:Ljava/lang/String;

    .line 11
    invoke-static {v2}, Lw/e;->c(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v5

    goto/16 :goto_6

    .line 12
    :cond_1
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v10, 0x1f

    if-ge v6, v10, :cond_2

    :goto_0
    move-object v5, v7

    goto/16 :goto_6

    :cond_2
    move v6, v9

    .line 13
    :goto_1
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v10

    if-ge v6, v10, :cond_4

    .line 14
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LA/g;

    .line 15
    iget-object v10, v10, LA/g;->e:Ljava/lang/String;

    .line 16
    invoke-static {v10}, Lw/e;->c(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v10

    if-nez v10, :cond_3

    goto :goto_0

    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_4
    move-object v10, v7

    move v6, v9

    .line 17
    :goto_2
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v11

    if-ge v6, v11, :cond_9

    .line 18
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LA/g;

    .line 19
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v12

    sub-int/2addr v12, v8

    if-ne v6, v12, :cond_5

    .line 20
    iget-object v12, v11, LA/g;->f:Ljava/lang/String;

    .line 21
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    if-eqz v12, :cond_5

    .line 22
    iget-object v2, v11, LA/g;->e:Ljava/lang/String;

    .line 23
    invoke-static {v10, v2}, Lw/c;->f(Landroid/graphics/Typeface$CustomFallbackBuilder;Ljava/lang/String;)V

    goto :goto_5

    .line 24
    :cond_5
    iget-object v12, v11, LA/g;->e:Ljava/lang/String;

    iget-object v13, v11, LA/g;->f:Ljava/lang/String;

    .line 25
    invoke-static {v12}, Lw/e;->c(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v12

    invoke-static {v12}, Lw/e;->d(Landroid/graphics/Typeface;)Landroid/graphics/fonts/Font;

    move-result-object v12

    if-nez v12, :cond_6

    .line 26
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Unable identify the primary font for "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    iget-object v6, v11, LA/g;->e:Ljava/lang/String;

    .line 28
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, ". Falling back to provider font."

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 29
    :cond_6
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_7

    .line 30
    :try_start_0
    invoke-static {}, Lio/flutter/plugin/platform/p;->o()V

    invoke-static {}, Lw/c;->d()V

    invoke-static {v12}, LD/e;->e(Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/Font$Builder;

    move-result-object v11

    .line 31
    invoke-static {v11, v13}, Lw/c;->a(Landroid/graphics/fonts/Font$Builder;Ljava/lang/String;)Landroid/graphics/fonts/Font$Builder;

    move-result-object v11

    .line 32
    invoke-static {v11}, Lw/c;->b(Landroid/graphics/fonts/Font$Builder;)Landroid/graphics/fonts/Font;

    move-result-object v11

    invoke-static {v11}, Lio/flutter/plugin/platform/p;->f(Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/FontFamily$Builder;

    move-result-object v11

    invoke-static {v11}, Lw/c;->c(Landroid/graphics/fonts/FontFamily$Builder;)Landroid/graphics/fonts/FontFamily;

    move-result-object v11
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    .line 33
    :catch_0
    const-string v5, "Failed to clone Font instance. Fall back to provider font."

    invoke-static {v2, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    .line 34
    :cond_7
    invoke-static {v12}, Lio/flutter/plugin/platform/p;->f(Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/FontFamily$Builder;

    move-result-object v11

    invoke-static {v11}, Lw/c;->c(Landroid/graphics/fonts/FontFamily$Builder;)Landroid/graphics/fonts/FontFamily;

    move-result-object v11

    :goto_3
    if-nez v10, :cond_8

    .line 35
    invoke-static {v11}, Lio/flutter/plugin/platform/p;->d(Landroid/graphics/fonts/FontFamily;)Landroid/graphics/Typeface$CustomFallbackBuilder;

    move-result-object v10

    goto :goto_4

    .line 36
    :cond_8
    invoke-static {v10, v11}, Lw/c;->e(Landroid/graphics/Typeface$CustomFallbackBuilder;Landroid/graphics/fonts/FontFamily;)V

    :goto_4
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_2

    .line 37
    :cond_9
    :goto_5
    invoke-static {v10}, Lio/flutter/plugin/platform/p;->e(Landroid/graphics/Typeface$CustomFallbackBuilder;)Landroid/graphics/Typeface;

    move-result-object v5

    :goto_6
    if-eqz v5, :cond_a

    .line 38
    new-instance p0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 39
    new-instance v0, LM/c;

    invoke-direct {v0, v1, v5, v3}, LM/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 40
    sget-object p0, Lw/e;->b:Lo/i;

    invoke-static/range {p2 .. p6}, Lw/e;->b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, v5}, Lo/i;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v5

    .line 41
    :cond_a
    iget v2, v0, Lv/d;->c:I

    if-nez v2, :cond_b

    move v2, v8

    goto :goto_7

    :cond_b
    move v2, v9

    .line 42
    :goto_7
    iget v6, v0, Lv/d;->b:I

    .line 43
    new-instance v3, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v5

    invoke-direct {v3, v5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 44
    new-instance v5, Lw/d;

    .line 45
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object v1, v5, Lw/d;->a:Ljava/lang/Object;

    .line 47
    iget-object v0, v0, Lv/d;->a:Ljava/util/ArrayList;

    .line 48
    new-instance v10, LA/c;

    .line 49
    new-instance v1, LA/p;

    invoke-direct {v1, v3, v9}, LA/p;-><init>(Landroid/os/Handler;I)V

    .line 50
    invoke-direct {v10, v5, v1, v9}, LA/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    if-eqz v2, :cond_f

    .line 51
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-gt v2, v8, :cond_e

    .line 52
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LA/g;

    sget-object v0, LA/k;->a:Lo/i;

    .line 53
    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v0

    .line 54
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v8}, Ljava/util/ArrayList;-><init>(I)V

    aget-object v0, v0, v9

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 55
    invoke-static {v4, v0}, LA/k;->a(ILjava/util/List;)Ljava/lang/String;

    move-result-object v0

    .line 56
    sget-object v2, LA/k;->a:Lo/i;

    invoke-virtual {v2, v0}, Lo/i;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Typeface;

    if-eqz v2, :cond_c

    .line 57
    new-instance p0, LA/a;

    invoke-direct {p0, v5, v2, v9}, LA/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v1, p0}, LA/p;->execute(Ljava/lang/Runnable;)V

    move-object v7, v2

    goto/16 :goto_b

    :cond_c
    const/4 v1, -0x1

    if-ne v6, v1, :cond_d

    .line 58
    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v1

    .line 59
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v8}, Ljava/util/ArrayList;-><init>(I)V

    aget-object v1, v1, v9

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    .line 60
    invoke-static {v0, p0, v1, v4}, LA/k;->b(Ljava/lang/String;Landroid/content/Context;Ljava/util/List;I)LA/j;

    move-result-object p0

    .line 61
    invoke-virtual {v10, p0}, LA/c;->z(LA/j;)V

    .line 62
    iget-object v7, p0, LA/j;->a:Landroid/graphics/Typeface;

    goto/16 :goto_b

    :cond_d
    move-object v1, v0

    .line 63
    new-instance v0, LA/h;

    const/4 v5, 0x0

    move-object v2, p0

    invoke-direct/range {v0 .. v5}, LA/h;-><init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/Object;II)V

    .line 64
    :try_start_1
    sget-object p0, LA/k;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 65
    invoke-interface {p0, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p0
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_4

    int-to-long v0, v6

    .line 66
    :try_start_2
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p0, v0, v1, v2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p0
    :try_end_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_2 .. :try_end_2} :catch_3

    .line 67
    :try_start_3
    check-cast p0, LA/j;

    .line 68
    invoke-virtual {v10, p0}, LA/c;->z(LA/j;)V

    .line 69
    iget-object v7, p0, LA/j;->a:Landroid/graphics/Typeface;

    goto/16 :goto_b

    :catch_1
    move-exception v0

    move-object p0, v0

    goto :goto_8

    :catch_2
    move-exception v0

    move-object p0, v0

    goto :goto_9

    .line 70
    :catch_3
    new-instance p0, Ljava/lang/InterruptedException;

    const-string v0, "timeout"

    invoke-direct {p0, v0}, Ljava/lang/InterruptedException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 71
    :goto_8
    throw p0

    .line 72
    :goto_9
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_4

    .line 73
    :catch_4
    iget-object p0, v10, LA/c;->m:Ljava/lang/Object;

    check-cast p0, LA/p;

    .line 74
    iget-object v0, v10, LA/c;->l:Ljava/lang/Object;

    check-cast v0, Lw/d;

    .line 75
    new-instance v1, LA/b;

    const/4 v2, -0x3

    invoke-direct {v1, v0, v2}, LA/b;-><init>(Lw/d;I)V

    invoke-virtual {p0, v1}, LA/p;->execute(Ljava/lang/Runnable;)V

    goto/16 :goto_b

    .line 76
    :cond_e
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Fallbacks with blocking fetches are not supported for performance reasons"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 77
    :cond_f
    invoke-static {v4, v0}, LA/k;->a(ILjava/util/List;)Ljava/lang/String;

    move-result-object v2

    .line 78
    sget-object v3, LA/k;->a:Lo/i;

    invoke-virtual {v3, v2}, Lo/i;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/Typeface;

    if-eqz v3, :cond_10

    .line 79
    new-instance p0, LA/a;

    invoke-direct {p0, v5, v3, v9}, LA/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v1, p0}, LA/p;->execute(Ljava/lang/Runnable;)V

    move-object v7, v3

    goto :goto_b

    .line 80
    :cond_10
    new-instance v1, LA/i;

    invoke-direct {v1, v10, v9}, LA/i;-><init>(Ljava/lang/Object;I)V

    .line 81
    sget-object v5, LA/k;->c:Ljava/lang/Object;

    monitor-enter v5

    .line 82
    :try_start_4
    sget-object v3, LA/k;->d:Lo/j;

    invoke-virtual {v3, v2}, Lo/j;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/ArrayList;

    if-eqz v6, :cond_11

    .line 83
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    monitor-exit v5

    goto :goto_b

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_c

    .line 85
    :cond_11
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 86
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 87
    invoke-virtual {v3, v2, v6}, Lo/j;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    monitor-exit v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-object v3, v0

    .line 89
    new-instance v0, LA/h;

    const/4 v5, 0x1

    move-object v1, v2

    move-object v2, p0

    invoke-direct/range {v0 .. v5}, LA/h;-><init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/Object;II)V

    .line 90
    sget-object p0, LA/k;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 91
    new-instance v2, LA/i;

    invoke-direct {v2, v1, v8}, LA/i;-><init>(Ljava/lang/Object;I)V

    .line 92
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-nez v1, :cond_12

    .line 93
    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v1, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    goto :goto_a

    .line 94
    :cond_12
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    .line 95
    :goto_a
    new-instance v3, LA/q;

    .line 96
    invoke-direct {v3}, LA/q;-><init>()V

    .line 97
    iput-object v0, v3, LA/q;->l:Ljava/lang/Object;

    .line 98
    iput-object v2, v3, LA/q;->m:Ljava/lang/Object;

    .line 99
    iput-object v1, v3, LA/q;->n:Ljava/lang/Object;

    .line 100
    invoke-virtual {p0, v3}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    :goto_b
    move-object/from16 v6, p2

    goto :goto_d

    .line 101
    :goto_c
    :try_start_5
    monitor-exit v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw p0

    .line 102
    :cond_13
    sget-object v5, Lw/e;->a:LS0/a;

    move-object v0, p1

    check-cast v0, Lv/b;

    move-object/from16 v6, p2

    invoke-virtual {v5, p0, v0, v6, v4}, LS0/a;->i(Landroid/content/Context;Lv/b;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;

    move-result-object v7

    if-eqz v7, :cond_14

    .line 103
    new-instance p0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 104
    new-instance v0, LM/c;

    invoke-direct {v0, v1, v7, v3}, LM/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_d

    .line 105
    :cond_14
    invoke-virtual {v1}, Lk/s;->a()V

    :goto_d
    if-eqz v7, :cond_15

    .line 106
    sget-object p0, Lw/e;->b:Lo/i;

    invoke-static/range {p2 .. p6}, Lw/e;->b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, v7}, Lo/i;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_15
    return-object v7
.end method

.method public static b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 p0, 0x2d

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method

.method public static c(Ljava/lang/String;)Landroid/graphics/Typeface;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    invoke-static {p0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sget-object v2, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 17
    .line 18
    invoke-static {v2, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0, v1}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_1
    :goto_0
    return-object v0
.end method

.method public static d(Landroid/graphics/Typeface;)Landroid/graphics/fonts/Font;
    .locals 2

    .line 1
    sget-object v0, Lw/e;->c:Landroid/graphics/Paint;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/graphics/Paint;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lw/e;->c:Landroid/graphics/Paint;

    .line 11
    .line 12
    :cond_0
    sget-object v0, Lw/e;->c:Landroid/graphics/Paint;

    .line 13
    .line 14
    const/high16 v1, 0x41200000    # 10.0f

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 17
    .line 18
    .line 19
    sget-object v0, Lw/e;->c:Landroid/graphics/Paint;

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 22
    .line 23
    .line 24
    sget-object p0, Lw/e;->c:Landroid/graphics/Paint;

    .line 25
    .line 26
    invoke-static {p0}, LD/e;->g(Landroid/graphics/Paint;)Landroid/graphics/text/PositionedGlyphs;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0}, LD/e;->b(Landroid/graphics/text/PositionedGlyphs;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    return-object p0

    .line 38
    :cond_1
    invoke-static {p0}, LD/e;->f(Landroid/graphics/text/PositionedGlyphs;)Landroid/graphics/fonts/Font;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method

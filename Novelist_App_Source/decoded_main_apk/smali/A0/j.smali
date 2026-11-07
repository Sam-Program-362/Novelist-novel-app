.class public LA0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC1/d;
.implements LK1/g;
.implements Ll2/d;
.implements LL1/e;
.implements LC1/m;


# static fields
.field public static o:LA0/j;


# instance fields
.field public final synthetic k:I

.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;

.field public n:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LA0/j;->k:I

    .line 237
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 238
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, LA0/j;->l:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LA0/j;->k:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LA0/j;LC1/h;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, LA0/j;->k:I

    .line 239
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA0/j;->n:Ljava/lang/Object;

    .line 240
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, LA0/j;->m:Ljava/lang/Object;

    .line 241
    iput-object p2, p0, LA0/j;->l:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LB1/g;)V
    .locals 1

    const/16 v0, 0x10

    iput v0, p0, LA0/j;->k:I

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, LA0/j;->l:Ljava/lang/Object;

    .line 12
    new-instance p1, Ll0/b;

    invoke-direct {p1}, Ll0/b;-><init>()V

    iput-object p1, p0, LA0/j;->m:Ljava/lang/Object;

    .line 13
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LA0/j;->n:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LC1/f;Landroid/content/Context;LB1/b;)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, LA0/j;->k:I

    const-string v0, "messenger"

    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 242
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 243
    iput-object p1, p0, LA0/j;->l:Ljava/lang/Object;

    .line 244
    iput-object p2, p0, LA0/j;->m:Ljava/lang/Object;

    .line 245
    iput-object p3, p0, LA0/j;->n:Ljava/lang/Object;

    .line 246
    :try_start_0
    sget-object p2, LK1/g;->f:LK1/f;

    const-string p3, "shared_preferences"

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, p0, p3}, LK1/f;->b(LC1/f;LK1/g;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 247
    const-string p2, "SharedPreferencesPlugin"

    const-string p3, "Received exception while setting up SharedPreferencesBackend"

    invoke-static {p2, p3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method

.method public constructor <init>(LC1/f;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, LA0/j;->k:I

    .line 14
    sget-object v0, LC1/r;->a:LC1/r;

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, LA0/j;->l:Ljava/lang/Object;

    .line 17
    iput-object p2, p0, LA0/j;->m:Ljava/lang/Object;

    .line 18
    iput-object v0, p0, LA0/j;->n:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LH0/i;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LA0/j;->k:I

    .line 248
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 249
    iput-object p1, p0, LA0/j;->l:Ljava/lang/Object;

    .line 250
    new-instance p1, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, LA0/j;->m:Ljava/lang/Object;

    .line 251
    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object p1, p0, LA0/j;->n:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LM1/A;)V
    .locals 1

    const/16 p1, 0xf

    iput p1, p0, LA0/j;->k:I

    .line 217
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 218
    new-instance p1, LA/l;

    const/16 v0, 0x1e

    invoke-direct {p1, v0}, LA/l;-><init>(I)V

    iput-object p1, p0, LA0/j;->l:Ljava/lang/Object;

    .line 219
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LA0/j;->m:Ljava/lang/Object;

    .line 220
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LA0/j;->n:Ljava/lang/Object;

    .line 221
    new-instance p1, LM1/A;

    const/16 v0, 0x16

    invoke-direct {p1, p0, v0}, LM1/A;-><init>(Ljava/lang/Object;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/16 v0, 0x9

    iput v0, p0, LA0/j;->k:I

    .line 19
    new-instance v0, LB1/d;

    const/4 v1, 0x3

    invoke-direct {v0, p1, v1}, LB1/d;-><init>(Ljava/lang/Object;I)V

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, LA0/j;->l:Ljava/lang/Object;

    .line 22
    iput-object v0, p0, LA0/j;->m:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V
    .locals 1

    const/16 v0, 0xe

    iput v0, p0, LA0/j;->k:I

    .line 210
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 211
    iput-object p1, p0, LA0/j;->l:Ljava/lang/Object;

    .line 212
    iput-object p2, p0, LA0/j;->m:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/S;Landroidx/lifecycle/Q;Ld0/b;)V
    .locals 1

    const/16 v0, 0xd

    iput v0, p0, LA0/j;->k:I

    const-string v0, "store"

    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    invoke-static {p3, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, LA0/j;->l:Ljava/lang/Object;

    .line 8
    iput-object p2, p0, LA0/j;->m:Ljava/lang/Object;

    .line 9
    iput-object p3, p0, LA0/j;->n:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lb/d;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, LA0/j;->k:I

    .line 213
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 214
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, LA0/j;->m:Ljava/lang/Object;

    .line 215
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LA0/j;->n:Ljava/lang/Object;

    .line 216
    iput-object p1, p0, LA0/j;->l:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, LA0/j;->k:I

    iput-object p1, p0, LA0/j;->l:Ljava/lang/Object;

    iput-object p2, p0, LA0/j;->m:Ljava/lang/Object;

    iput-object p3, p0, LA0/j;->n:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    const/16 v0, 0xc

    iput v0, p0, LA0/j;->k:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LA0/j;

    const/16 v1, 0xb

    .line 4
    invoke-direct {v0, v1}, LA0/j;-><init>(I)V

    .line 5
    iput-object v0, p0, LA0/j;->m:Ljava/lang/Object;

    iput-object v0, p0, LA0/j;->n:Ljava/lang/Object;

    iput-object p1, p0, LA0/j;->l:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lr1/v;)V
    .locals 4

    const/16 v0, 0x13

    iput v0, p0, LA0/j;->k:I

    .line 229
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 230
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, LA0/j;->m:Ljava/lang/Object;

    .line 231
    iput-object p1, p0, LA0/j;->n:Ljava/lang/Object;

    .line 232
    new-instance v0, Lr1/s;

    .line 233
    check-cast p1, Lr1/n;

    invoke-virtual {p1}, Lr1/n;->getBinaryMessenger()LC1/f;

    move-result-object v1

    invoke-direct {v0, v1}, Lr1/s;-><init>(LC1/f;)V

    new-instance v1, Lb1/Q;

    new-instance v2, LH0/i;

    .line 234
    invoke-virtual {p1}, Lr1/n;->getBinaryMessenger()LC1/f;

    move-result-object v3

    invoke-direct {v2, v3}, LH0/i;-><init>(LC1/f;)V

    invoke-direct {v1, v2}, Lb1/Q;-><init>(LH0/i;)V

    const/4 v2, 0x2

    new-array v2, v2, [Lr1/u;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    iput-object v2, p0, LA0/j;->l:Ljava/lang/Object;

    .line 235
    new-instance v0, LB1/a;

    invoke-virtual {p1}, Lr1/n;->getBinaryMessenger()LC1/f;

    move-result-object p1

    invoke-direct {v0, p1}, LB1/a;-><init>(LC1/f;)V

    .line 236
    iput-object p0, v0, LB1/a;->l:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ls/e;)V
    .locals 28

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const/16 v0, 0x14

    iput v0, v1, LA0/j;->k:I

    .line 23
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, v1, LA0/j;->n:Ljava/lang/Object;

    .line 25
    iput-object v2, v1, LA0/j;->m:Ljava/lang/Object;

    .line 26
    iget-object v0, v2, Ls/e;->a:Landroid/content/Context;

    iget-object v3, v2, Ls/e;->p:Ljava/util/ArrayList;

    iget-object v4, v2, Ls/e;->c:Ljava/util/ArrayList;

    iget-object v5, v2, Ls/e;->d:Ljava/util/ArrayList;

    .line 27
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x1a

    if-lt v6, v7, :cond_0

    .line 28
    iget-object v6, v2, Ls/e;->m:Ljava/lang/String;

    invoke-static {v0, v6}, LD/j;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/app/Notification$Builder;

    move-result-object v0

    iput-object v0, v1, LA0/j;->l:Ljava/lang/Object;

    goto :goto_0

    .line 29
    :cond_0
    new-instance v0, Landroid/app/Notification$Builder;

    iget-object v6, v2, Ls/e;->a:Landroid/content/Context;

    invoke-direct {v0, v6}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    iput-object v0, v1, LA0/j;->l:Ljava/lang/Object;

    .line 30
    :goto_0
    iget-object v6, v2, Ls/e;->o:Landroid/app/Notification;

    .line 31
    iget-object v0, v1, LA0/j;->l:Ljava/lang/Object;

    check-cast v0, Landroid/app/Notification$Builder;

    iget-wide v8, v6, Landroid/app/Notification;->when:J

    invoke-virtual {v0, v8, v9}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    move-result-object v0

    iget v8, v6, Landroid/app/Notification;->icon:I

    iget v9, v6, Landroid/app/Notification;->iconLevel:I

    .line 32
    invoke-virtual {v0, v8, v9}, Landroid/app/Notification$Builder;->setSmallIcon(II)Landroid/app/Notification$Builder;

    move-result-object v0

    iget-object v8, v6, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 33
    invoke-virtual {v0, v8}, Landroid/app/Notification$Builder;->setContent(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    move-result-object v0

    iget-object v8, v6, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    const/4 v9, 0x0

    .line 34
    invoke-virtual {v0, v8, v9}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    move-result-object v0

    iget-object v8, v6, Landroid/app/Notification;->vibrate:[J

    .line 35
    invoke-virtual {v0, v8}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    move-result-object v0

    iget v8, v6, Landroid/app/Notification;->ledARGB:I

    iget v10, v6, Landroid/app/Notification;->ledOnMS:I

    iget v11, v6, Landroid/app/Notification;->ledOffMS:I

    .line 36
    invoke-virtual {v0, v8, v10, v11}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    move-result-object v0

    iget v8, v6, Landroid/app/Notification;->flags:I

    const/4 v10, 0x2

    and-int/2addr v8, v10

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-eqz v8, :cond_1

    move v8, v11

    goto :goto_1

    :cond_1
    move v8, v12

    .line 37
    :goto_1
    invoke-virtual {v0, v8}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    move-result-object v0

    iget v8, v6, Landroid/app/Notification;->flags:I

    and-int/lit8 v8, v8, 0x8

    if-eqz v8, :cond_2

    move v8, v11

    goto :goto_2

    :cond_2
    move v8, v12

    .line 38
    :goto_2
    invoke-virtual {v0, v8}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;

    move-result-object v0

    iget v8, v6, Landroid/app/Notification;->flags:I

    and-int/lit8 v8, v8, 0x10

    if-eqz v8, :cond_3

    move v8, v11

    goto :goto_3

    :cond_3
    move v8, v12

    .line 39
    :goto_3
    invoke-virtual {v0, v8}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    move-result-object v0

    iget v8, v6, Landroid/app/Notification;->defaults:I

    .line 40
    invoke-virtual {v0, v8}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    move-result-object v0

    iget-object v8, v2, Ls/e;->e:Ljava/lang/CharSequence;

    .line 41
    invoke-virtual {v0, v8}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v0

    iget-object v8, v2, Ls/e;->f:Ljava/lang/CharSequence;

    .line 42
    invoke-virtual {v0, v8}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v0

    .line 43
    invoke-virtual {v0, v9}, Landroid/app/Notification$Builder;->setContentInfo(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v0

    iget-object v8, v2, Ls/e;->g:Landroid/app/PendingIntent;

    .line 44
    invoke-virtual {v0, v8}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v0

    iget-object v8, v6, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    .line 45
    invoke-virtual {v0, v8}, Landroid/app/Notification$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v0

    iget v8, v6, Landroid/app/Notification;->flags:I

    and-int/lit16 v8, v8, 0x80

    if-eqz v8, :cond_4

    goto :goto_4

    :cond_4
    move v11, v12

    .line 46
    :goto_4
    invoke-virtual {v0, v9, v11}, Landroid/app/Notification$Builder;->setFullScreenIntent(Landroid/app/PendingIntent;Z)Landroid/app/Notification$Builder;

    move-result-object v0

    .line 47
    invoke-virtual {v0, v12}, Landroid/app/Notification$Builder;->setNumber(I)Landroid/app/Notification$Builder;

    move-result-object v0

    .line 48
    invoke-virtual {v0, v12, v12, v12}, Landroid/app/Notification$Builder;->setProgress(IIZ)Landroid/app/Notification$Builder;

    .line 49
    iget-object v0, v1, LA0/j;->l:Ljava/lang/Object;

    check-cast v0, Landroid/app/Notification$Builder;

    invoke-virtual {v0, v9}, Landroid/app/Notification$Builder;->setLargeIcon(Landroid/graphics/drawable/Icon;)Landroid/app/Notification$Builder;

    .line 50
    iget-object v0, v1, LA0/j;->l:Ljava/lang/Object;

    check-cast v0, Landroid/app/Notification$Builder;

    invoke-virtual {v0, v9}, Landroid/app/Notification$Builder;->setSubText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v0

    .line 51
    invoke-virtual {v0, v12}, Landroid/app/Notification$Builder;->setUsesChronometer(Z)Landroid/app/Notification$Builder;

    move-result-object v0

    .line 52
    iget v8, v2, Ls/e;->h:I

    invoke-virtual {v0, v8}, Landroid/app/Notification$Builder;->setPriority(I)Landroid/app/Notification$Builder;

    .line 53
    iget-object v8, v2, Ls/e;->b:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v11

    move v0, v12

    :goto_5
    const-string v14, "android.support.allowGeneratedReplies"

    if-ge v0, v11, :cond_14

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v16

    add-int/lit8 v17, v0, 0x1

    move-object/from16 v13, v16

    check-cast v13, Ls/d;

    .line 54
    iget-object v0, v13, Ls/d;->b:Landroidx/core/graphics/drawable/IconCompat;

    if-nez v0, :cond_5

    .line 55
    iget v0, v13, Ls/d;->e:I

    if-eqz v0, :cond_5

    .line 56
    invoke-static {v0}, Landroidx/core/graphics/drawable/IconCompat;->a(I)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v0

    iput-object v0, v13, Ls/d;->b:Landroidx/core/graphics/drawable/IconCompat;

    :cond_5
    move/from16 v16, v12

    .line 57
    iget-object v12, v13, Ls/d;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 58
    iget-boolean v10, v13, Ls/d;->c:Z

    iget-object v9, v13, Ls/d;->a:Landroid/os/Bundle;

    .line 59
    new-instance v15, Landroid/app/Notification$Action$Builder;

    if-eqz v12, :cond_e

    .line 60
    const-string v7, "IconCompat"

    iget v0, v12, Landroidx/core/graphics/drawable/IconCompat;->a:I

    packed-switch v0, :pswitch_data_0

    .line 61
    :pswitch_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "Unknown type"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 62
    :pswitch_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x1e

    if-lt v0, v7, :cond_6

    .line 63
    invoke-virtual {v12}, Landroidx/core/graphics/drawable/IconCompat;->c()Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, LD/J;->a(Landroid/net/Uri;)Landroid/graphics/drawable/Icon;

    move-result-object v0

    :goto_6
    move-object/from16 v24, v3

    move-object/from16 v18, v4

    move-object/from16 v22, v5

    move-object/from16 v27, v6

    move-object/from16 v19, v8

    move/from16 v21, v11

    :goto_7
    const/4 v4, 0x2

    goto/16 :goto_f

    .line 64
    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Context is required to resolve the file uri of the icon: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 65
    invoke-virtual {v12}, Landroidx/core/graphics/drawable/IconCompat;->c()Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 66
    :pswitch_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x1a

    if-lt v0, v7, :cond_7

    .line 67
    iget-object v0, v12, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/Bitmap;

    invoke-static {v0}, LD/j;->b(Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;

    move-result-object v0

    goto :goto_6

    .line 68
    :cond_7
    iget-object v0, v12, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/Bitmap;

    .line 69
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    move-object/from16 v18, v4

    .line 70
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    .line 71
    invoke-static {v7, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    int-to-float v4, v4

    const v7, 0x3f2aaaab

    mul-float/2addr v4, v7

    float-to-int v4, v4

    .line 72
    sget-object v7, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v4, v4, v7}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v7

    move-object/from16 v19, v8

    .line 73
    new-instance v8, Landroid/graphics/Canvas;

    invoke-direct {v8, v7}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    move-object/from16 v20, v7

    .line 74
    new-instance v7, Landroid/graphics/Paint;

    move/from16 v21, v11

    const/4 v11, 0x3

    invoke-direct {v7, v11}, Landroid/graphics/Paint;-><init>(I)V

    int-to-float v11, v4

    const/high16 v22, 0x3f000000    # 0.5f

    mul-float v11, v11, v22

    const v22, 0x3f6aaaab

    move/from16 v23, v4

    mul-float v4, v11, v22

    move-object/from16 v22, v5

    const/high16 v5, -0x1000000

    .line 75
    invoke-virtual {v7, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 76
    new-instance v5, Landroid/graphics/BitmapShader;

    move-object/from16 v24, v3

    sget-object v3, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct {v5, v0, v3, v3}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    .line 77
    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 78
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v25

    move-object/from16 v26, v0

    sub-int v0, v25, v23

    neg-int v0, v0

    int-to-float v0, v0

    const/high16 v25, 0x40000000    # 2.0f

    div-float v0, v0, v25

    .line 79
    invoke-virtual/range {v26 .. v26}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v26

    move-object/from16 v27, v6

    sub-int v6, v26, v23

    neg-int v6, v6

    int-to-float v6, v6

    div-float v6, v6, v25

    .line 80
    invoke-virtual {v3, v0, v6}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 81
    invoke-virtual {v5, v3}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 82
    invoke-virtual {v7, v5}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 83
    invoke-virtual {v8, v11, v11, v4, v7}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    const/4 v0, 0x0

    .line 84
    invoke-virtual {v8, v0}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 85
    invoke-static/range {v20 .. v20}, Landroid/graphics/drawable/Icon;->createWithBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;

    move-result-object v0

    goto/16 :goto_7

    :pswitch_3
    move-object/from16 v24, v3

    move-object/from16 v18, v4

    move-object/from16 v22, v5

    move-object/from16 v27, v6

    move-object/from16 v19, v8

    move/from16 v21, v11

    .line 86
    iget-object v0, v12, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Landroid/graphics/drawable/Icon;->createWithContentUri(Ljava/lang/String;)Landroid/graphics/drawable/Icon;

    move-result-object v0

    goto/16 :goto_7

    :pswitch_4
    move-object/from16 v24, v3

    move-object/from16 v18, v4

    move-object/from16 v22, v5

    move-object/from16 v27, v6

    move-object/from16 v19, v8

    move/from16 v21, v11

    .line 87
    iget-object v0, v12, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    check-cast v0, [B

    iget v3, v12, Landroidx/core/graphics/drawable/IconCompat;->e:I

    iget v4, v12, Landroidx/core/graphics/drawable/IconCompat;->f:I

    invoke-static {v0, v3, v4}, Landroid/graphics/drawable/Icon;->createWithData([BII)Landroid/graphics/drawable/Icon;

    move-result-object v0

    goto/16 :goto_7

    :pswitch_5
    move-object/from16 v24, v3

    move-object/from16 v18, v4

    move-object/from16 v22, v5

    move-object/from16 v27, v6

    move-object/from16 v19, v8

    move/from16 v21, v11

    const/4 v3, -0x1

    if-ne v0, v3, :cond_9

    .line 88
    iget-object v0, v12, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    .line 89
    const-string v3, "Unable to get icon package"

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1c

    if-lt v4, v5, :cond_8

    .line 90
    invoke-static {v0}, LD/f;->f(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_8
    const/4 v4, 0x2

    goto :goto_e

    .line 91
    :cond_8
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    const-string v5, "getResPackage"

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-virtual {v4, v0, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_8

    :catch_0
    move-exception v0

    goto :goto_9

    :catch_1
    move-exception v0

    goto :goto_a

    :catch_2
    move-exception v0

    goto :goto_b

    .line 92
    :goto_9
    invoke-static {v7, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_c

    .line 93
    :goto_a
    invoke-static {v7, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_c

    .line 94
    :goto_b
    invoke-static {v7, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_c
    const/4 v0, 0x0

    goto :goto_8

    :cond_9
    const/4 v4, 0x2

    if-ne v0, v4, :cond_c

    .line 95
    iget-object v0, v12, Landroidx/core/graphics/drawable/IconCompat;->j:Ljava/lang/String;

    if-eqz v0, :cond_b

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_a

    goto :goto_d

    .line 96
    :cond_a
    iget-object v0, v12, Landroidx/core/graphics/drawable/IconCompat;->j:Ljava/lang/String;

    goto :goto_e

    .line 97
    :cond_b
    :goto_d
    iget-object v0, v12, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    const-string v5, ":"

    invoke-virtual {v0, v5, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v0

    aget-object v0, v0, v16

    .line 98
    :goto_e
    iget v3, v12, Landroidx/core/graphics/drawable/IconCompat;->e:I

    invoke-static {v0, v3}, Landroid/graphics/drawable/Icon;->createWithResource(Ljava/lang/String;I)Landroid/graphics/drawable/Icon;

    move-result-object v0

    goto :goto_f

    .line 99
    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "called getResPackage() on "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_6
    move-object/from16 v24, v3

    move-object/from16 v18, v4

    move-object/from16 v22, v5

    move-object/from16 v27, v6

    move-object/from16 v19, v8

    move/from16 v21, v11

    const/4 v4, 0x2

    .line 100
    iget-object v0, v12, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/Bitmap;

    invoke-static {v0}, Landroid/graphics/drawable/Icon;->createWithBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;

    move-result-object v0

    .line 101
    :goto_f
    iget-object v3, v12, Landroidx/core/graphics/drawable/IconCompat;->g:Landroid/content/res/ColorStateList;

    if-eqz v3, :cond_d

    .line 102
    invoke-virtual {v0, v3}, Landroid/graphics/drawable/Icon;->setTintList(Landroid/content/res/ColorStateList;)Landroid/graphics/drawable/Icon;

    .line 103
    :cond_d
    iget-object v3, v12, Landroidx/core/graphics/drawable/IconCompat;->h:Landroid/graphics/PorterDuff$Mode;

    sget-object v5, Landroidx/core/graphics/drawable/IconCompat;->k:Landroid/graphics/PorterDuff$Mode;

    if-eq v3, v5, :cond_f

    .line 104
    invoke-virtual {v0, v3}, Landroid/graphics/drawable/Icon;->setTintMode(Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/drawable/Icon;

    goto :goto_10

    :pswitch_7
    move-object/from16 v24, v3

    move-object/from16 v18, v4

    move-object/from16 v22, v5

    move-object/from16 v27, v6

    move-object/from16 v19, v8

    move/from16 v21, v11

    const/4 v4, 0x2

    .line 105
    iget-object v0, v12, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/drawable/Icon;

    goto :goto_10

    :cond_e
    move-object/from16 v24, v3

    move-object/from16 v18, v4

    move-object/from16 v22, v5

    move-object/from16 v27, v6

    move-object/from16 v19, v8

    move/from16 v21, v11

    const/4 v4, 0x2

    const/4 v0, 0x0

    .line 106
    :cond_f
    :goto_10
    iget-object v3, v13, Ls/d;->f:Ljava/lang/CharSequence;

    .line 107
    iget-object v5, v13, Ls/d;->g:Landroid/app/PendingIntent;

    .line 108
    invoke-direct {v15, v0, v3, v5}, Landroid/app/Notification$Action$Builder;-><init>(Landroid/graphics/drawable/Icon;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    if-eqz v9, :cond_10

    .line 109
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0, v9}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    goto :goto_11

    .line 110
    :cond_10
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 111
    :goto_11
    invoke-virtual {v0, v14, v10}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 112
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 113
    invoke-virtual {v15, v10}, Landroid/app/Notification$Action$Builder;->setAllowGeneratedReplies(Z)Landroid/app/Notification$Action$Builder;

    .line 114
    const-string v5, "android.support.action.semanticAction"

    move/from16 v6, v16

    invoke-virtual {v0, v5, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const/16 v5, 0x1c

    if-lt v3, v5, :cond_11

    .line 115
    invoke-static {v15}, LD/f;->p(Landroid/app/Notification$Action$Builder;)V

    :cond_11
    const/16 v5, 0x1d

    if-lt v3, v5, :cond_12

    .line 116
    invoke-static {v15}, Ls/f;->d(Landroid/app/Notification$Action$Builder;)V

    :cond_12
    const/16 v5, 0x1f

    if-lt v3, v5, :cond_13

    .line 117
    invoke-static {v15}, Ls/g;->a(Landroid/app/Notification$Action$Builder;)V

    .line 118
    :cond_13
    const-string v3, "android.support.action.showsUserInterface"

    .line 119
    iget-boolean v5, v13, Ls/d;->d:Z

    .line 120
    invoke-virtual {v0, v3, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 121
    invoke-virtual {v15, v0}, Landroid/app/Notification$Action$Builder;->addExtras(Landroid/os/Bundle;)Landroid/app/Notification$Action$Builder;

    .line 122
    iget-object v0, v1, LA0/j;->l:Ljava/lang/Object;

    check-cast v0, Landroid/app/Notification$Builder;

    invoke-virtual {v15}, Landroid/app/Notification$Action$Builder;->build()Landroid/app/Notification$Action;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/app/Notification$Builder;->addAction(Landroid/app/Notification$Action;)Landroid/app/Notification$Builder;

    move v10, v4

    move/from16 v0, v17

    move-object/from16 v4, v18

    move-object/from16 v8, v19

    move/from16 v11, v21

    move-object/from16 v5, v22

    move-object/from16 v3, v24

    move-object/from16 v6, v27

    const/16 v7, 0x1a

    const/4 v9, 0x0

    const/4 v12, 0x0

    goto/16 :goto_5

    :cond_14
    move-object/from16 v24, v3

    move-object/from16 v18, v4

    move-object/from16 v22, v5

    move-object/from16 v27, v6

    .line 123
    iget-object v0, v2, Ls/e;->l:Landroid/os/Bundle;

    if-eqz v0, :cond_15

    .line 124
    iget-object v3, v1, LA0/j;->n:Ljava/lang/Object;

    check-cast v3, Landroid/os/Bundle;

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 125
    :cond_15
    iget-object v0, v1, LA0/j;->l:Ljava/lang/Object;

    check-cast v0, Landroid/app/Notification$Builder;

    iget-boolean v3, v2, Ls/e;->i:Z

    invoke-virtual {v0, v3}, Landroid/app/Notification$Builder;->setShowWhen(Z)Landroid/app/Notification$Builder;

    .line 126
    iget-object v0, v1, LA0/j;->l:Ljava/lang/Object;

    check-cast v0, Landroid/app/Notification$Builder;

    iget-boolean v3, v2, Ls/e;->k:Z

    invoke-virtual {v0, v3}, Landroid/app/Notification$Builder;->setLocalOnly(Z)Landroid/app/Notification$Builder;

    .line 127
    iget-object v0, v1, LA0/j;->l:Ljava/lang/Object;

    check-cast v0, Landroid/app/Notification$Builder;

    const/4 v6, 0x0

    invoke-virtual {v0, v6}, Landroid/app/Notification$Builder;->setGroup(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 128
    iget-object v0, v1, LA0/j;->l:Ljava/lang/Object;

    check-cast v0, Landroid/app/Notification$Builder;

    invoke-virtual {v0, v6}, Landroid/app/Notification$Builder;->setSortKey(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 129
    iget-object v0, v1, LA0/j;->l:Ljava/lang/Object;

    check-cast v0, Landroid/app/Notification$Builder;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/app/Notification$Builder;->setGroupSummary(Z)Landroid/app/Notification$Builder;

    .line 130
    iget-object v0, v1, LA0/j;->l:Ljava/lang/Object;

    check-cast v0, Landroid/app/Notification$Builder;

    invoke-virtual {v0, v6}, Landroid/app/Notification$Builder;->setCategory(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 131
    iget-object v0, v1, LA0/j;->l:Ljava/lang/Object;

    check-cast v0, Landroid/app/Notification$Builder;

    invoke-virtual {v0, v3}, Landroid/app/Notification$Builder;->setColor(I)Landroid/app/Notification$Builder;

    .line 132
    iget-object v0, v1, LA0/j;->l:Ljava/lang/Object;

    check-cast v0, Landroid/app/Notification$Builder;

    invoke-virtual {v0, v3}, Landroid/app/Notification$Builder;->setVisibility(I)Landroid/app/Notification$Builder;

    .line 133
    iget-object v0, v1, LA0/j;->l:Ljava/lang/Object;

    check-cast v0, Landroid/app/Notification$Builder;

    invoke-virtual {v0, v6}, Landroid/app/Notification$Builder;->setPublicVersion(Landroid/app/Notification;)Landroid/app/Notification$Builder;

    .line 134
    iget-object v0, v1, LA0/j;->l:Ljava/lang/Object;

    check-cast v0, Landroid/app/Notification$Builder;

    move-object/from16 v3, v27

    iget-object v4, v3, Landroid/app/Notification;->sound:Landroid/net/Uri;

    iget-object v3, v3, Landroid/app/Notification;->audioAttributes:Landroid/media/AudioAttributes;

    invoke-virtual {v0, v4, v3}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;Landroid/media/AudioAttributes;)Landroid/app/Notification$Builder;

    .line 135
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1c

    if-ge v0, v5, :cond_1a

    if-nez v18, :cond_16

    const/4 v0, 0x0

    goto :goto_12

    .line 136
    :cond_16
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual/range {v18 .. v18}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 137
    invoke-virtual/range {v18 .. v18}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_19

    :goto_12
    if-nez v0, :cond_17

    move-object/from16 v3, v24

    goto :goto_14

    :cond_17
    if-nez v24, :cond_18

    :goto_13
    move-object v3, v0

    goto :goto_14

    .line 138
    :cond_18
    new-instance v3, Lo/f;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    invoke-virtual/range {v24 .. v24}, Ljava/util/ArrayList;->size()I

    move-result v5

    add-int/2addr v5, v4

    invoke-direct {v3, v5}, Lo/f;-><init>(I)V

    .line 139
    invoke-virtual {v3, v0}, Lo/f;->addAll(Ljava/util/Collection;)Z

    move-object/from16 v4, v24

    .line 140
    invoke-virtual {v3, v4}, Lo/f;->addAll(Ljava/util/Collection;)Z

    .line 141
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    goto :goto_13

    .line 142
    :cond_19
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 143
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0

    :cond_1a
    move-object/from16 v4, v24

    move-object v3, v4

    :goto_14
    if-eqz v3, :cond_1b

    .line 145
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1b

    .line 146
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v4, 0x0

    :goto_15
    if-ge v4, v0, :cond_1b

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v4, v4, 0x1

    check-cast v5, Ljava/lang/String;

    .line 147
    iget-object v6, v1, LA0/j;->l:Ljava/lang/Object;

    check-cast v6, Landroid/app/Notification$Builder;

    invoke-virtual {v6, v5}, Landroid/app/Notification$Builder;->addPerson(Ljava/lang/String;)Landroid/app/Notification$Builder;

    goto :goto_15

    .line 148
    :cond_1b
    invoke-virtual/range {v22 .. v22}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_23

    .line 149
    iget-object v0, v2, Ls/e;->l:Landroid/os/Bundle;

    if-nez v0, :cond_1c

    .line 150
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, v2, Ls/e;->l:Landroid/os/Bundle;

    .line 151
    :cond_1c
    iget-object v0, v2, Ls/e;->l:Landroid/os/Bundle;

    .line 152
    const-string v3, "android.car.EXTENSIONS"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_1d

    .line 153
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 154
    :cond_1d
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4, v0}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 155
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    const/4 v6, 0x0

    .line 156
    :goto_16
    invoke-virtual/range {v22 .. v22}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ge v6, v7, :cond_21

    .line 157
    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v8, v22

    .line 158
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ls/d;

    .line 159
    new-instance v10, Landroid/os/Bundle;

    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    .line 160
    iget-object v11, v9, Ls/d;->b:Landroidx/core/graphics/drawable/IconCompat;

    if-nez v11, :cond_1e

    .line 161
    iget v11, v9, Ls/d;->e:I

    if-eqz v11, :cond_1e

    .line 162
    invoke-static {v11}, Landroidx/core/graphics/drawable/IconCompat;->a(I)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v11

    iput-object v11, v9, Ls/d;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 163
    :cond_1e
    iget-object v11, v9, Ls/d;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 164
    iget-object v12, v9, Ls/d;->a:Landroid/os/Bundle;

    if-eqz v11, :cond_1f

    .line 165
    invoke-virtual {v11}, Landroidx/core/graphics/drawable/IconCompat;->b()I

    move-result v11

    goto :goto_17

    :cond_1f
    const/4 v11, 0x0

    :goto_17
    const-string v13, "icon"

    invoke-virtual {v10, v13, v11}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 166
    const-string v11, "title"

    .line 167
    iget-object v13, v9, Ls/d;->f:Ljava/lang/CharSequence;

    .line 168
    invoke-virtual {v10, v11, v13}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 169
    const-string v11, "actionIntent"

    .line 170
    iget-object v13, v9, Ls/d;->g:Landroid/app/PendingIntent;

    .line 171
    invoke-virtual {v10, v11, v13}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    if-eqz v12, :cond_20

    .line 172
    new-instance v11, Landroid/os/Bundle;

    invoke-direct {v11, v12}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    goto :goto_18

    .line 173
    :cond_20
    new-instance v11, Landroid/os/Bundle;

    invoke-direct {v11}, Landroid/os/Bundle;-><init>()V

    .line 174
    :goto_18
    iget-boolean v12, v9, Ls/d;->c:Z

    .line 175
    invoke-virtual {v11, v14, v12}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 176
    const-string v12, "extras"

    invoke-virtual {v10, v12, v11}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 177
    const-string v11, "remoteInputs"

    const/4 v12, 0x0

    invoke-virtual {v10, v11, v12}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 178
    const-string v11, "showsUserInterface"

    .line 179
    iget-boolean v9, v9, Ls/d;->d:Z

    .line 180
    invoke-virtual {v10, v11, v9}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 181
    const-string v9, "semanticAction"

    const/4 v11, 0x0

    invoke-virtual {v10, v9, v11}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 182
    invoke-virtual {v5, v7, v10}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    add-int/lit8 v6, v6, 0x1

    move-object/from16 v22, v8

    goto :goto_16

    .line 183
    :cond_21
    const-string v6, "invisible_actions"

    invoke-virtual {v0, v6, v5}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 184
    invoke-virtual {v4, v6, v5}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 185
    iget-object v5, v2, Ls/e;->l:Landroid/os/Bundle;

    if-nez v5, :cond_22

    .line 186
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    iput-object v5, v2, Ls/e;->l:Landroid/os/Bundle;

    .line 187
    :cond_22
    iget-object v5, v2, Ls/e;->l:Landroid/os/Bundle;

    .line 188
    invoke-virtual {v5, v3, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 189
    iget-object v0, v1, LA0/j;->n:Ljava/lang/Object;

    check-cast v0, Landroid/os/Bundle;

    invoke-virtual {v0, v3, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 190
    :cond_23
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 191
    iget-object v3, v1, LA0/j;->l:Ljava/lang/Object;

    check-cast v3, Landroid/app/Notification$Builder;

    iget-object v4, v2, Ls/e;->l:Landroid/os/Bundle;

    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    .line 192
    iget-object v3, v1, LA0/j;->l:Ljava/lang/Object;

    check-cast v3, Landroid/app/Notification$Builder;

    const/4 v6, 0x0

    .line 193
    invoke-virtual {v3, v6}, Landroid/app/Notification$Builder;->setRemoteInputHistory([Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    const/16 v7, 0x1a

    if-lt v0, v7, :cond_24

    .line 194
    iget-object v3, v1, LA0/j;->l:Ljava/lang/Object;

    check-cast v3, Landroid/app/Notification$Builder;

    invoke-static {v3}, LD/j;->i(Landroid/app/Notification$Builder;)V

    .line 195
    iget-object v3, v1, LA0/j;->l:Ljava/lang/Object;

    check-cast v3, Landroid/app/Notification$Builder;

    invoke-static {v3}, LD/j;->o(Landroid/app/Notification$Builder;)V

    .line 196
    iget-object v3, v1, LA0/j;->l:Ljava/lang/Object;

    check-cast v3, Landroid/app/Notification$Builder;

    invoke-static {v3}, LD/j;->p(Landroid/app/Notification$Builder;)V

    .line 197
    iget-object v3, v1, LA0/j;->l:Ljava/lang/Object;

    check-cast v3, Landroid/app/Notification$Builder;

    invoke-static {v3}, LD/j;->q(Landroid/app/Notification$Builder;)V

    .line 198
    iget-object v3, v1, LA0/j;->l:Ljava/lang/Object;

    check-cast v3, Landroid/app/Notification$Builder;

    invoke-static {v3}, LD/j;->k(Landroid/app/Notification$Builder;)V

    .line 199
    iget-object v3, v2, Ls/e;->m:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_24

    .line 200
    iget-object v3, v1, LA0/j;->l:Ljava/lang/Object;

    check-cast v3, Landroid/app/Notification$Builder;

    const/4 v6, 0x0

    invoke-virtual {v3, v6}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;)Landroid/app/Notification$Builder;

    move-result-object v3

    const/4 v11, 0x0

    .line 201
    invoke-virtual {v3, v11}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    move-result-object v3

    .line 202
    invoke-virtual {v3, v11, v11, v11}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    move-result-object v3

    .line 203
    invoke-virtual {v3, v6}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    :cond_24
    const/16 v5, 0x1c

    if-lt v0, v5, :cond_25

    .line 204
    invoke-virtual/range {v18 .. v18}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_26

    :cond_25
    const/16 v5, 0x1d

    goto :goto_19

    :cond_26
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 205
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0

    :goto_19
    if-lt v0, v5, :cond_27

    .line 207
    iget-object v3, v1, LA0/j;->l:Ljava/lang/Object;

    check-cast v3, Landroid/app/Notification$Builder;

    iget-boolean v2, v2, Ls/e;->n:Z

    invoke-static {v3, v2}, Ls/f;->b(Landroid/app/Notification$Builder;Z)V

    .line 208
    iget-object v2, v1, LA0/j;->l:Ljava/lang/Object;

    check-cast v2, Landroid/app/Notification$Builder;

    invoke-static {v2}, Ls/f;->c(Landroid/app/Notification$Builder;)V

    :cond_27
    const/16 v2, 0x24

    if-lt v0, v2, :cond_28

    .line 209
    iget-object v0, v1, LA0/j;->l:Ljava/lang/Object;

    check-cast v0, Landroid/app/Notification$Builder;

    invoke-static {v0}, LE/f;->f(Landroid/app/Notification$Builder;)V

    :cond_28
    return-void

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public constructor <init>(Lt1/c;Lio/flutter/embedding/engine/FlutterJNI;)V
    .locals 5

    const/4 v0, 0x1

    iput v0, p0, LA0/j;->k:I

    .line 222
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 223
    new-instance v0, LB1/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LB1/a;-><init>(Ljava/lang/Object;I)V

    .line 224
    new-instance v1, LB1/s;

    sget-object v2, LC1/q;->a:LC1/q;

    const/4 v3, 0x0

    .line 225
    const-string v4, "flutter/accessibility"

    invoke-direct {v1, p1, v4, v2, v3}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 226
    iput-object v1, p0, LA0/j;->l:Ljava/lang/Object;

    .line 227
    invoke-virtual {v1, v0}, LB1/s;->y(LC1/b;)V

    .line 228
    iput-object p2, p0, LA0/j;->m:Ljava/lang/Object;

    return-void
.end method

.method public static E()LA0/j;
    .locals 5

    .line 1
    sget-object v0, LA0/j;->o:LA0/j;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LM1/A;

    .line 6
    .line 7
    const/16 v1, 0x1d

    .line 8
    .line 9
    invoke-direct {v0, v1}, LM1/A;-><init>(I)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Lq1/a;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    iput v2, v1, Lq1/a;->a:I

    .line 19
    .line 20
    invoke-static {v1}, Ljava/util/concurrent/Executors;->newCachedThreadPool(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    new-instance v3, Lw1/c;

    .line 25
    .line 26
    new-instance v4, Lio/flutter/embedding/engine/FlutterJNI;

    .line 27
    .line 28
    invoke-direct {v4}, Lio/flutter/embedding/engine/FlutterJNI;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-boolean v2, v3, Lw1/c;->a:Z

    .line 35
    .line 36
    iput-boolean v2, v3, Lw1/c;->b:Z

    .line 37
    .line 38
    iput-object v4, v3, Lw1/c;->f:Lio/flutter/embedding/engine/FlutterJNI;

    .line 39
    .line 40
    iput-object v1, v3, Lw1/c;->g:Ljava/util/concurrent/ExecutorService;

    .line 41
    .line 42
    new-instance v2, LA0/j;

    .line 43
    .line 44
    const/16 v4, 0x12

    .line 45
    .line 46
    invoke-direct {v2, v4}, LA0/j;-><init>(I)V

    .line 47
    .line 48
    .line 49
    iput-object v3, v2, LA0/j;->l:Ljava/lang/Object;

    .line 50
    .line 51
    iput-object v0, v2, LA0/j;->m:Ljava/lang/Object;

    .line 52
    .line 53
    iput-object v1, v2, LA0/j;->n:Ljava/lang/Object;

    .line 54
    .line 55
    sput-object v2, LA0/j;->o:LA0/j;

    .line 56
    .line 57
    :cond_0
    sget-object v0, LA0/j;->o:LA0/j;

    .line 58
    .line 59
    return-object v0
.end method

.method public static F(Landroid/content/Context;Landroid/util/AttributeSet;[II)LA0/j;
    .locals 2

    .line 1
    new-instance v0, LA0/j;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, p1, p2, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-direct {v0, p0, p1}, LA0/j;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static v(Ljava/util/Map;)Landroid/os/Bundle;
    .locals 4

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Ljava/lang/String;

    .line 25
    .line 26
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    return-object v0
.end method


# virtual methods
.method public A(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, LA0/j;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LB1/g;

    .line 4
    .line 5
    iget-object v0, v0, LB1/g;->l:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public B()I
    .locals 1

    .line 1
    iget-object v0, p0, LA0/j;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LB1/g;

    .line 4
    .line 5
    iget-object v0, v0, LB1/g;->l:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public C(La2/e;Ljava/lang/String;)Landroidx/lifecycle/P;
    .locals 5

    .line 1
    iget-object v0, p0, LA0/j;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/lifecycle/Q;

    .line 4
    .line 5
    const-string v1, "key"

    .line 6
    .line 7
    invoke-static {p2, v1}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, LA0/j;->l:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Landroidx/lifecycle/S;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v1, v1, Landroidx/lifecycle/S;->a:Ljava/util/LinkedHashMap;

    .line 18
    .line 19
    invoke-virtual {v1, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Landroidx/lifecycle/P;

    .line 24
    .line 25
    invoke-virtual {p1, v2}, La2/e;->d(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    instance-of p1, v0, Landroidx/lifecycle/O;

    .line 32
    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    check-cast v0, Landroidx/lifecycle/O;

    .line 36
    .line 37
    invoke-static {v2}, La2/h;->b(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    const-string p1, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel"

    .line 41
    .line 42
    invoke-static {v2, p1}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-object v2

    .line 46
    :cond_1
    new-instance v2, Ld0/c;

    .line 47
    .line 48
    iget-object v3, p0, LA0/j;->n:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v3, Ld0/b;

    .line 51
    .line 52
    invoke-direct {v2, v3}, Ld0/c;-><init>(Ld0/b;)V

    .line 53
    .line 54
    .line 55
    iget-object v3, v2, Ld0/b;->a:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v3, Ljava/util/LinkedHashMap;

    .line 58
    .line 59
    sget-object v4, Le0/b;->a:Le0/b;

    .line 60
    .line 61
    invoke-interface {v3, v4, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-static {p1}, LE2/a;->t(La2/e;)Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-interface {v0, v3, v2}, Landroidx/lifecycle/Q;->b(Ljava/lang/Class;Ld0/c;)Landroidx/lifecycle/P;

    .line 72
    .line 73
    .line 74
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    goto :goto_0

    .line 76
    :catch_0
    :try_start_1
    invoke-static {p1}, LE2/a;->t(La2/e;)Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-interface {v0, v3, v2}, Landroidx/lifecycle/Q;->b(Ljava/lang/Class;Ld0/c;)Landroidx/lifecycle/P;

    .line 81
    .line 82
    .line 83
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/AbstractMethodError; {:try_start_1 .. :try_end_1} :catch_1

    .line 84
    goto :goto_0

    .line 85
    :catch_1
    invoke-static {p1}, LE2/a;->t(La2/e;)Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-interface {v0, p1}, Landroidx/lifecycle/Q;->a(Ljava/lang/Class;)Landroidx/lifecycle/P;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    :goto_0
    const-string v0, "viewModel"

    .line 94
    .line 95
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-interface {v1, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    check-cast p2, Landroidx/lifecycle/P;

    .line 103
    .line 104
    if-eqz p2, :cond_2

    .line 105
    .line 106
    invoke-virtual {p2}, Landroidx/lifecycle/P;->a()V

    .line 107
    .line 108
    .line 109
    :cond_2
    return-object p1
.end method

.method public D(Landroid/view/KeyEvent;)Z
    .locals 7

    .line 1
    iget-object v0, p0, LA0/j;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [Lr1/u;

    .line 4
    .line 5
    iget-object v1, p0, LA0/j;->m:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/HashSet;

    .line 8
    .line 9
    invoke-virtual {v1, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    return v2

    .line 17
    :cond_0
    array-length v1, v0

    .line 18
    const/4 v3, 0x1

    .line 19
    if-lez v1, :cond_2

    .line 20
    .line 21
    new-instance v1, LL0/k;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p0, v1, LL0/k;->a:Ljava/lang/Object;

    .line 27
    .line 28
    iget-object v4, p0, LA0/j;->l:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v4, [Lr1/u;

    .line 31
    .line 32
    array-length v4, v4

    .line 33
    iput v4, v1, LL0/k;->c:I

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    iput-boolean v4, v1, LL0/k;->b:Z

    .line 37
    .line 38
    iput-object p1, v1, LL0/k;->d:Ljava/lang/Object;

    .line 39
    .line 40
    array-length v4, v0

    .line 41
    :goto_0
    if-ge v2, v4, :cond_1

    .line 42
    .line 43
    aget-object v5, v0, v2

    .line 44
    .line 45
    new-instance v6, LM0/E;

    .line 46
    .line 47
    invoke-direct {v6, v1}, LM0/E;-><init>(LL0/k;)V

    .line 48
    .line 49
    .line 50
    invoke-interface {v5, p1, v6}, Lr1/u;->b(Landroid/view/KeyEvent;LM0/E;)V

    .line 51
    .line 52
    .line 53
    add-int/lit8 v2, v2, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    return v3

    .line 57
    :cond_2
    invoke-virtual {p0, p1}, LA0/j;->G(Landroid/view/KeyEvent;)V

    .line 58
    .line 59
    .line 60
    return v3
.end method

.method public G(Landroid/view/KeyEvent;)V
    .locals 9

    .line 1
    iget-object v0, p0, LA0/j;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashSet;

    .line 4
    .line 5
    iget-object v1, p0, LA0/j;->n:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lr1/v;

    .line 8
    .line 9
    if-eqz v1, :cond_c

    .line 10
    .line 11
    move-object v2, v1

    .line 12
    check-cast v2, Lr1/n;

    .line 13
    .line 14
    iget-object v2, v2, Lr1/n;->v:Lio/flutter/plugin/editing/j;

    .line 15
    .line 16
    iget-object v3, v2, Lio/flutter/plugin/editing/j;->b:Landroid/view/inputmethod/InputMethodManager;

    .line 17
    .line 18
    invoke-virtual {v3}, Landroid/view/inputmethod/InputMethodManager;->isAcceptingText()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const/4 v4, 0x0

    .line 23
    if-eqz v3, :cond_a

    .line 24
    .line 25
    iget-object v2, v2, Lio/flutter/plugin/editing/j;->j:Landroid/view/inputmethod/InputConnection;

    .line 26
    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    goto/16 :goto_1

    .line 30
    .line 31
    :cond_0
    instance-of v3, v2, Lio/flutter/plugin/editing/c;

    .line 32
    .line 33
    if-eqz v3, :cond_9

    .line 34
    .line 35
    check-cast v2, Lio/flutter/plugin/editing/c;

    .line 36
    .line 37
    iget-object v3, v2, Lio/flutter/plugin/editing/c;->d:Lio/flutter/plugin/editing/f;

    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    if-nez v5, :cond_a

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    const/16 v6, 0x15

    .line 50
    .line 51
    const/4 v7, 0x1

    .line 52
    if-ne v5, v6, :cond_1

    .line 53
    .line 54
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isShiftPressed()Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    invoke-virtual {v2, v7, v3}, Lio/flutter/plugin/editing/c;->d(ZZ)Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    goto/16 :goto_1

    .line 63
    .line 64
    :cond_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    const/16 v6, 0x16

    .line 69
    .line 70
    if-ne v5, v6, :cond_2

    .line 71
    .line 72
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isShiftPressed()Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    invoke-virtual {v2, v4, v3}, Lio/flutter/plugin/editing/c;->d(ZZ)Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    goto/16 :goto_1

    .line 81
    .line 82
    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    const/16 v6, 0x13

    .line 87
    .line 88
    if-ne v5, v6, :cond_3

    .line 89
    .line 90
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isShiftPressed()Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    invoke-virtual {v2, v7, v3}, Lio/flutter/plugin/editing/c;->e(ZZ)Z

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    goto :goto_1

    .line 99
    :cond_3
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    const/16 v6, 0x14

    .line 104
    .line 105
    if-ne v5, v6, :cond_4

    .line 106
    .line 107
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isShiftPressed()Z

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    invoke-virtual {v2, v4, v3}, Lio/flutter/plugin/editing/c;->e(ZZ)Z

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    goto :goto_1

    .line 116
    :cond_4
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    const/16 v6, 0x42

    .line 121
    .line 122
    if-eq v5, v6, :cond_5

    .line 123
    .line 124
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    const/16 v6, 0xa0

    .line 129
    .line 130
    if-ne v5, v6, :cond_6

    .line 131
    .line 132
    :cond_5
    iget-object v5, v2, Lio/flutter/plugin/editing/c;->e:Landroid/view/inputmethod/EditorInfo;

    .line 133
    .line 134
    iget v6, v5, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 135
    .line 136
    const/high16 v8, 0x20000

    .line 137
    .line 138
    and-int/2addr v6, v8

    .line 139
    if-nez v6, :cond_6

    .line 140
    .line 141
    iget v3, v5, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 142
    .line 143
    and-int/lit16 v3, v3, 0xff

    .line 144
    .line 145
    invoke-virtual {v2, v3}, Lio/flutter/plugin/editing/c;->performEditorAction(I)Z

    .line 146
    .line 147
    .line 148
    :goto_0
    move v4, v7

    .line 149
    goto :goto_1

    .line 150
    :cond_6
    invoke-static {v3}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    invoke-static {v3}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    .line 155
    .line 156
    .line 157
    move-result v6

    .line 158
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getUnicodeChar()I

    .line 159
    .line 160
    .line 161
    move-result v8

    .line 162
    if-ltz v5, :cond_a

    .line 163
    .line 164
    if-ltz v6, :cond_a

    .line 165
    .line 166
    if-nez v8, :cond_7

    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_7
    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    .line 170
    .line 171
    .line 172
    move-result v4

    .line 173
    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    .line 174
    .line 175
    .line 176
    move-result v5

    .line 177
    invoke-virtual {v2}, Lio/flutter/plugin/editing/c;->beginBatchEdit()Z

    .line 178
    .line 179
    .line 180
    if-eq v4, v5, :cond_8

    .line 181
    .line 182
    invoke-virtual {v3, v4, v5}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 183
    .line 184
    .line 185
    :cond_8
    int-to-char v5, v8

    .line 186
    invoke-static {v5}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    invoke-virtual {v3, v4, v5}, Landroid/text/SpannableStringBuilder;->insert(ILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 191
    .line 192
    .line 193
    add-int/2addr v4, v7

    .line 194
    invoke-virtual {v2, v4, v4}, Lio/flutter/plugin/editing/c;->setSelection(II)Z

    .line 195
    .line 196
    .line 197
    invoke-virtual {v2}, Lio/flutter/plugin/editing/c;->endBatchEdit()Z

    .line 198
    .line 199
    .line 200
    goto :goto_0

    .line 201
    :cond_9
    invoke-interface {v2, p1}, Landroid/view/inputmethod/InputConnection;->sendKeyEvent(Landroid/view/KeyEvent;)Z

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    :cond_a
    :goto_1
    if-eqz v4, :cond_b

    .line 206
    .line 207
    goto :goto_2

    .line 208
    :cond_b
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    check-cast v1, Lr1/n;

    .line 212
    .line 213
    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    invoke-virtual {v1, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result p1

    .line 224
    if-eqz p1, :cond_c

    .line 225
    .line 226
    const-string p1, "KeyboardManager"

    .line 227
    .line 228
    const-string v0, "A redispatched key event was consumed before reaching KeyboardManager"

    .line 229
    .line 230
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 231
    .line 232
    .line 233
    :cond_c
    :goto_2
    return-void
.end method

.method public H(Landroid/app/Activity;Lx0/j;)V
    .locals 3

    .line 1
    iget-object v0, p0, LA0/j;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/WeakHashMap;

    .line 4
    .line 5
    const-string v1, "activity"

    .line 6
    .line 7
    invoke-static {p1, v1}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, LA0/j;->m:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/util/concurrent/locks/ReentrantLock;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 15
    .line 16
    .line 17
    :try_start_0
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lx0/j;

    .line 22
    .line 23
    invoke-virtual {p2, v2}, Lx0/j;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    :try_start_1
    invoke-virtual {v0, p1, p2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Lx0/j;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, LA0/j;->l:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, LH0/i;

    .line 45
    .line 46
    iget-object v0, v0, LH0/i;->l:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, LA0/n;

    .line 49
    .line 50
    iget-object v0, v0, LA0/n;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_2

    .line 61
    .line 62
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    check-cast v1, LA0/m;

    .line 67
    .line 68
    iget-object v2, v1, LA0/m;->a:Landroid/app/Activity;

    .line 69
    .line 70
    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-nez v2, :cond_1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    iput-object p2, v1, LA0/m;->c:Lx0/j;

    .line 78
    .line 79
    iget-object v1, v1, LA0/m;->b:Lr1/k;

    .line 80
    .line 81
    invoke-virtual {v1, p2}, Lr1/k;->accept(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_2
    return-void

    .line 86
    :catchall_0
    move-exception p1

    .line 87
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 88
    .line 89
    .line 90
    throw p1
.end method

.method public I(Ljava/lang/String;ZLL1/k;LL1/a;)Z
    .locals 11

    .line 1
    iget-object v0, p3, LL1/k;->c:Ljava/util/Map;

    .line 2
    .line 3
    iget-object v1, p0, LA0/j;->n:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/app/Activity;

    .line 6
    .line 7
    if-eqz v1, :cond_e

    .line 8
    .line 9
    invoke-static {v0}, LA0/j;->v(Ljava/util/Map;)Landroid/os/Bundle;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x0

    .line 14
    const-string v3, "com.android.browser.headers"

    .line 15
    .line 16
    const/4 v4, 0x1

    .line 17
    if-eqz p2, :cond_d

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    :pswitch_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_4

    .line 32
    .line 33
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Ljava/lang/String;

    .line 38
    .line 39
    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 40
    .line 41
    invoke-virtual {v0, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    const/4 v6, -0x1

    .line 53
    sparse-switch v5, :sswitch_data_0

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :sswitch_0
    const-string v5, "accept-language"

    .line 58
    .line 59
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_0

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    const/4 v6, 0x3

    .line 67
    goto :goto_0

    .line 68
    :sswitch_1
    const-string v5, "content-type"

    .line 69
    .line 70
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    const/4 v6, 0x2

    .line 78
    goto :goto_0

    .line 79
    :sswitch_2
    const-string v5, "content-language"

    .line 80
    .line 81
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-nez v0, :cond_2

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_2
    move v6, v4

    .line 89
    goto :goto_0

    .line 90
    :sswitch_3
    const-string v5, "accept"

    .line 91
    .line 92
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-nez v0, :cond_3

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_3
    move v6, v2

    .line 100
    :goto_0
    packed-switch v6, :pswitch_data_0

    .line 101
    .line 102
    .line 103
    goto/16 :goto_4

    .line 104
    .line 105
    :cond_4
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    iget-object v0, p0, LA0/j;->n:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v0, Landroid/app/Activity;

    .line 112
    .line 113
    new-instance v5, Landroid/content/Intent;

    .line 114
    .line 115
    const-string v6, "android.intent.action.VIEW"

    .line 116
    .line 117
    invoke-direct {v5, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    iget-boolean p4, p4, LL1/a;->a:Z

    .line 121
    .line 122
    const-string v6, "android.support.customtabs.extra.TITLE_VISIBILITY"

    .line 123
    .line 124
    invoke-virtual {v5, v6, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 125
    .line 126
    .line 127
    const-string p4, "android.support.customtabs.extra.SESSION"

    .line 128
    .line 129
    invoke-virtual {v5, p4}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    const/4 v7, 0x0

    .line 134
    if-nez v6, :cond_5

    .line 135
    .line 136
    new-instance v6, Landroid/os/Bundle;

    .line 137
    .line 138
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v6, p4, v7}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v5, v6}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 145
    .line 146
    .line 147
    :cond_5
    const-string p4, "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS"

    .line 148
    .line 149
    invoke-virtual {v5, p4, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 150
    .line 151
    .line 152
    new-instance p4, Landroid/os/Bundle;

    .line 153
    .line 154
    invoke-direct {p4}, Landroid/os/Bundle;-><init>()V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v5, p4}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 158
    .line 159
    .line 160
    const-string p4, "androidx.browser.customtabs.extra.SHARE_STATE"

    .line 161
    .line 162
    invoke-virtual {v5, p4, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 163
    .line 164
    .line 165
    sget p4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 166
    .line 167
    invoke-static {}, Landroid/os/LocaleList;->getAdjustedDefault()Landroid/os/LocaleList;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    invoke-virtual {v6}, Landroid/os/LocaleList;->size()I

    .line 172
    .line 173
    .line 174
    move-result v8

    .line 175
    if-lez v8, :cond_6

    .line 176
    .line 177
    invoke-virtual {v6, v2}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    invoke-virtual {v6}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v6

    .line 185
    goto :goto_1

    .line 186
    :cond_6
    move-object v6, v7

    .line 187
    :goto_1
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 188
    .line 189
    .line 190
    move-result v8

    .line 191
    if-nez v8, :cond_8

    .line 192
    .line 193
    invoke-virtual {v5, v3}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 194
    .line 195
    .line 196
    move-result v8

    .line 197
    if-eqz v8, :cond_7

    .line 198
    .line 199
    invoke-virtual {v5, v3}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    .line 200
    .line 201
    .line 202
    move-result-object v8

    .line 203
    goto :goto_2

    .line 204
    :cond_7
    new-instance v8, Landroid/os/Bundle;

    .line 205
    .line 206
    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 207
    .line 208
    .line 209
    :goto_2
    const-string v9, "Accept-Language"

    .line 210
    .line 211
    invoke-virtual {v8, v9}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 212
    .line 213
    .line 214
    move-result v10

    .line 215
    if-nez v10, :cond_8

    .line 216
    .line 217
    invoke-virtual {v8, v9, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v5, v3, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 221
    .line 222
    .line 223
    :cond_8
    const/16 v6, 0x22

    .line 224
    .line 225
    if-lt p4, v6, :cond_9

    .line 226
    .line 227
    invoke-static {}, Landroid/app/ActivityOptions;->makeBasic()Landroid/app/ActivityOptions;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    invoke-static {v6}, LD/u;->j(Landroid/app/ActivityOptions;)V

    .line 232
    .line 233
    .line 234
    goto :goto_3

    .line 235
    :cond_9
    move-object v6, v7

    .line 236
    :goto_3
    const/16 v8, 0x24

    .line 237
    .line 238
    if-lt p4, v8, :cond_b

    .line 239
    .line 240
    if-nez v6, :cond_a

    .line 241
    .line 242
    invoke-static {}, Landroid/app/ActivityOptions;->makeBasic()Landroid/app/ActivityOptions;

    .line 243
    .line 244
    .line 245
    move-result-object v6

    .line 246
    :cond_a
    const-string p4, "androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION"

    .line 247
    .line 248
    invoke-virtual {v5, p4, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 249
    .line 250
    .line 251
    move-result p4

    .line 252
    xor-int/2addr p4, v4

    .line 253
    invoke-static {v6, p4}, LE/f;->e(Landroid/app/ActivityOptions;Z)V

    .line 254
    .line 255
    .line 256
    :cond_b
    if-eqz v6, :cond_c

    .line 257
    .line 258
    invoke-virtual {v6}, Landroid/app/ActivityOptions;->toBundle()Landroid/os/Bundle;

    .line 259
    .line 260
    .line 261
    move-result-object v7

    .line 262
    :cond_c
    invoke-virtual {v5, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 263
    .line 264
    .line 265
    :try_start_0
    invoke-virtual {v5, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v0, v5, v7}, Landroid/content/Context;->startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 269
    .line 270
    .line 271
    return v4

    .line 272
    :catch_0
    :cond_d
    :goto_4
    iget-object p2, p0, LA0/j;->n:Ljava/lang/Object;

    .line 273
    .line 274
    check-cast p2, Landroid/app/Activity;

    .line 275
    .line 276
    iget-boolean p4, p3, LL1/k;->a:Z

    .line 277
    .line 278
    iget-boolean p3, p3, LL1/k;->b:Z

    .line 279
    .line 280
    sget v0, Lio/flutter/plugins/urllauncher/WebViewActivity;->o:I

    .line 281
    .line 282
    new-instance v0, Landroid/content/Intent;

    .line 283
    .line 284
    const-class v5, Lio/flutter/plugins/urllauncher/WebViewActivity;

    .line 285
    .line 286
    invoke-direct {v0, p2, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 287
    .line 288
    .line 289
    const-string p2, "url"

    .line 290
    .line 291
    invoke-virtual {v0, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 292
    .line 293
    .line 294
    move-result-object p1

    .line 295
    const-string p2, "enableJavaScript"

    .line 296
    .line 297
    invoke-virtual {p1, p2, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    const-string p2, "enableDomStorage"

    .line 302
    .line 303
    invoke-virtual {p1, p2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 304
    .line 305
    .line 306
    move-result-object p1

    .line 307
    invoke-virtual {p1, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 308
    .line 309
    .line 310
    move-result-object p1

    .line 311
    :try_start_1
    iget-object p2, p0, LA0/j;->n:Ljava/lang/Object;

    .line 312
    .line 313
    check-cast p2, Landroid/app/Activity;

    .line 314
    .line 315
    invoke-virtual {p2, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 316
    .line 317
    .line 318
    return v4

    .line 319
    :catch_1
    return v2

    .line 320
    :cond_e
    new-instance p1, LL1/b;

    .line 321
    .line 322
    invoke-direct {p1}, LL1/b;-><init>()V

    .line 323
    .line 324
    .line 325
    throw p1

    .line 326
    nop

    .line 327
    :sswitch_data_0
    .sparse-switch
        -0x54d84af8 -> :sswitch_3
        -0x494c25d4 -> :sswitch_2
        0x2ed4600e -> :sswitch_1
        0x2fd98a7d -> :sswitch_0
    .end sparse-switch

    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public J()V
    .locals 1

    .line 1
    iget-object v0, p0, LA0/j;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public K(Ljava/util/ArrayList;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_3

    .line 7
    .line 8
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    check-cast v2, Ll0/a;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v3, p0, LA0/j;->l:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, LA/l;

    .line 20
    .line 21
    iget-object v4, v3, LA/l;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v4, [Ljava/lang/Object;

    .line 24
    .line 25
    const-string v5, "instance"

    .line 26
    .line 27
    invoke-static {v2, v5}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget v5, v3, LA/l;->a:I

    .line 31
    .line 32
    const/4 v6, 0x0

    .line 33
    :goto_1
    if-ge v6, v5, :cond_1

    .line 34
    .line 35
    aget-object v7, v4, v6

    .line 36
    .line 37
    if-eq v7, v2, :cond_0

    .line 38
    .line 39
    add-int/lit8 v6, v6, 0x1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v0, "Already in the pool!"

    .line 45
    .line 46
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_1
    iget v5, v3, LA/l;->a:I

    .line 51
    .line 52
    array-length v6, v4

    .line 53
    if-ge v5, v6, :cond_2

    .line 54
    .line 55
    aput-object v2, v4, v5

    .line 56
    .line 57
    add-int/lit8 v5, v5, 0x1

    .line 58
    .line 59
    iput v5, v3, LA/l;->a:I

    .line 60
    .line 61
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public L(LC1/h;)V
    .locals 3

    .line 1
    iget-object v0, p0, LA0/j;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, LA0/j;->l:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, LC1/f;

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance v2, LA0/j;

    .line 14
    .line 15
    invoke-direct {v2, p0, p1}, LA0/j;-><init>(LA0/j;LC1/h;)V

    .line 16
    .line 17
    .line 18
    move-object p1, v2

    .line 19
    :goto_0
    invoke-interface {v1, v0, p1}, LC1/f;->b(Ljava/lang/String;LC1/d;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public M()Z
    .locals 7

    .line 1
    iget-object v0, p0, LA0/j;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/Context;

    .line 4
    .line 5
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    new-instance v2, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v2, v1

    .line 20
    :goto_0
    new-instance v3, Landroid/content/Intent;

    .line 21
    .line 22
    const-string v4, "http://"

    .line 23
    .line 24
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    const-string v5, "android.intent.action.VIEW"

    .line 29
    .line 30
    invoke-direct {v3, v5, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 31
    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-virtual {v0, v3, v4}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    const/4 v5, 0x1

    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    iget-object v3, v3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 42
    .line 43
    iget-object v3, v3, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 44
    .line 45
    new-instance v6, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    add-int/2addr v2, v5

    .line 52
    invoke-direct {v6, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 61
    .line 62
    .line 63
    :cond_1
    move-object v2, v6

    .line 64
    :cond_2
    new-instance v1, Landroid/content/Intent;

    .line 65
    .line 66
    const-string v3, "android.support.customtabs.action.CustomTabsService"

    .line 67
    .line 68
    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-eqz v3, :cond_4

    .line 80
    .line 81
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    check-cast v3, Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {v1, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v1, v4}, Landroid/content/pm/PackageManager;->resolveService(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    if-eqz v6, :cond_3

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 98
    .line 99
    const/16 v1, 0x1e

    .line 100
    .line 101
    if-lt v0, v1, :cond_5

    .line 102
    .line 103
    const-string v0, "CustomTabsClient"

    .line 104
    .line 105
    const-string v1, "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName."

    .line 106
    .line 107
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 108
    .line 109
    .line 110
    :cond_5
    const/4 v3, 0x0

    .line 111
    :goto_1
    if-eqz v3, :cond_6

    .line 112
    .line 113
    return v5

    .line 114
    :cond_6
    return v4
.end method

.method public N(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, LA0/j;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    invoke-direct {v0, v1}, LA0/j;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, LA0/j;->n:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, LA0/j;

    .line 11
    .line 12
    iput-object v0, v1, LA0/j;->n:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object v0, p0, LA0/j;->n:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object p1, v0, LA0/j;->m:Ljava/lang/Object;

    .line 17
    .line 18
    iput-object p2, v0, LA0/j;->l:Ljava/lang/Object;

    .line 19
    .line 20
    return-void
.end method

.method public a(Ljava/lang/String;LK1/h;)Ljava/lang/Long;
    .locals 2

    .line 1
    invoke-virtual {p0, p2}, LA0/j;->s(LK1/h;)Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p2, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    :try_start_0
    invoke-interface {p2, p1, v0, v1}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 14
    .line 15
    .line 16
    move-result-wide p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    goto :goto_0

    .line 18
    :catch_0
    const/4 v0, 0x0

    .line 19
    invoke-interface {p2, p1, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    int-to-long p1, p1

    .line 24
    :goto_0
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    return-object p1
.end method

.method public b(Ljava/lang/String;DLK1/h;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p4}, LA0/j;->s(LK1/h;)Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object p4

    .line 5
    invoke-interface {p4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 6
    .line 7
    .line 8
    move-result-object p4

    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v1, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu"

    .line 12
    .line 13
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-interface {p4, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public c(Ljava/util/List;LK1/h;)V
    .locals 6

    .line 1
    invoke-virtual {p0, p2}, LA0/j;->s(LK1/h;)Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "edit(...)"

    .line 10
    .line 11
    invoke-static {v0, v1}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p2}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    const-string v1, "getAll(...)"

    .line 19
    .line 20
    invoke-static {p2, v1}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, Ljava/lang/String;

    .line 47
    .line 48
    invoke-interface {p2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    if-eqz p1, :cond_1

    .line 53
    .line 54
    invoke-static {p1}, LP1/e;->n0(Ljava/util/Collection;)Ljava/util/Set;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    goto :goto_1

    .line 59
    :cond_1
    const/4 v5, 0x0

    .line 60
    :goto_1
    invoke-static {v3, v4, v5}, LK1/M;->b(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Set;)Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    if-eqz v4, :cond_0

    .line 65
    .line 66
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    const-string p2, "iterator(...)"

    .line 75
    .line 76
    invoke-static {p1, p2}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    if-eqz p2, :cond_3

    .line 84
    .line 85
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    const-string v1, "next(...)"

    .line 90
    .line 91
    invoke-static {p2, v1}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    check-cast p2, Ljava/lang/String;

    .line 95
    .line 96
    invoke-interface {v0, p2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 97
    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_3
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 101
    .line 102
    .line 103
    return-void
.end method

.method public d(Ljava/lang/String;LK1/h;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    invoke-virtual {p0, p2}, LA0/j;->s(LK1/h;)Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p2, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    const-string v0, ""

    .line 12
    .line 13
    invoke-interface {p2, p1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v1}, La2/h;->b(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    const-string v2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu"

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    const-string v2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!"

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_2

    .line 35
    .line 36
    invoke-interface {p2, p1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iget-object p2, p0, LA0/j;->n:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p2, LB1/b;

    .line 43
    .line 44
    invoke-static {p1, p2}, LK1/M;->c(Ljava/lang/Object;LB1/b;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Ljava/util/List;

    .line 49
    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    new-instance p2, Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_1

    .line 66
    .line 67
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    instance-of v1, v0, Ljava/lang/String;

    .line 72
    .line 73
    if-eqz v1, :cond_0

    .line 74
    .line 75
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    return-object p2

    .line 80
    :cond_2
    const/4 p1, 0x0

    .line 81
    return-object p1
.end method

.method public e(Ljava/lang/String;Ljava/util/List;LK1/h;)V
    .locals 1

    .line 1
    iget-object v0, p0, LA0/j;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LB1/b;

    .line 4
    .line 5
    invoke-virtual {v0, p2}, LB1/b;->e(Ljava/util/List;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    const-string v0, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu"

    .line 10
    .line 11
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p0, p3}, LA0/j;->s(LK1/h;)Landroid/content/SharedPreferences;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    invoke-interface {p3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    invoke-interface {p3, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public f(Ljava/lang/String;JLK1/h;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p4}, LA0/j;->s(LK1/h;)Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object p4

    .line 5
    invoke-interface {p4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 6
    .line 7
    .line 8
    move-result-object p4

    .line 9
    invoke-interface {p4, p1, p2, p3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public g(Ljava/util/List;LK1/h;)Ljava/util/Map;
    .locals 5

    .line 1
    invoke-virtual {p0, p2}, LA0/j;->s(LK1/h;)Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p2}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    const-string v0, "getAll(...)"

    .line 10
    .line 11
    invoke-static {p2, v0}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-instance v0, Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Ljava/util/Map$Entry;

    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Ljava/lang/String;

    .line 44
    .line 45
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    if-eqz p1, :cond_1

    .line 50
    .line 51
    invoke-static {p1}, LP1/e;->n0(Ljava/util/Collection;)Ljava/util/Set;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    const/4 v4, 0x0

    .line 57
    :goto_1
    invoke-static {v2, v3, v4}, LK1/M;->b(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Set;)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_0

    .line 62
    .line 63
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    if-eqz v2, :cond_0

    .line 68
    .line 69
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iget-object v3, p0, LA0/j;->n:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v3, LB1/b;

    .line 76
    .line 77
    invoke-static {v2, v3}, LK1/M;->c(Ljava/lang/Object;LB1/b;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    const-string v3, "null cannot be cast to non-null type kotlin.Any"

    .line 82
    .line 83
    invoke-static {v2, v3}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_2
    return-object v0
.end method

.method public h(Ll2/e;LR1/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, LA0/j;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ll2/d;

    .line 4
    .line 5
    new-instance v1, LK1/r;

    .line 6
    .line 7
    iget-object v2, p0, LA0/j;->m:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, LY/d;

    .line 10
    .line 11
    iget-object v3, p0, LA0/j;->n:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, LK1/L;

    .line 14
    .line 15
    invoke-direct {v1, p1, v2, v3}, LK1/r;-><init>(Ll2/e;LY/d;LK1/L;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, v1, p2}, Ll2/d;->h(Ll2/e;LR1/c;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    sget-object p2, LS1/a;->k:LS1/a;

    .line 23
    .line 24
    if-ne p1, p2, :cond_0

    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_0
    sget-object p1, LO1/g;->a:LO1/g;

    .line 28
    .line 29
    return-object p1
.end method

.method public i(Ljava/lang/String;LK1/h;)LK1/P;
    .locals 2

    .line 1
    invoke-virtual {p0, p2}, LA0/j;->s(LK1/h;)Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p2, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    const-string v0, ""

    .line 13
    .line 14
    invoke-interface {p2, p1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p1}, La2/h;->b(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    const-string p2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!"

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    if-eqz p2, :cond_0

    .line 28
    .line 29
    new-instance p2, LK1/P;

    .line 30
    .line 31
    sget-object v0, LK1/N;->n:LK1/N;

    .line 32
    .line 33
    invoke-direct {p2, p1, v0}, LK1/P;-><init>(Ljava/lang/String;LK1/N;)V

    .line 34
    .line 35
    .line 36
    return-object p2

    .line 37
    :cond_0
    const-string p2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu"

    .line 38
    .line 39
    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    new-instance p1, LK1/P;

    .line 46
    .line 47
    sget-object p2, LK1/N;->m:LK1/N;

    .line 48
    .line 49
    invoke-direct {p1, v1, p2}, LK1/P;-><init>(Ljava/lang/String;LK1/N;)V

    .line 50
    .line 51
    .line 52
    return-object p1

    .line 53
    :cond_1
    new-instance p1, LK1/P;

    .line 54
    .line 55
    sget-object p2, LK1/N;->o:LK1/N;

    .line 56
    .line 57
    invoke-direct {p1, v1, p2}, LK1/P;-><init>(Ljava/lang/String;LK1/N;)V

    .line 58
    .line 59
    .line 60
    return-object p1

    .line 61
    :cond_2
    return-object v1
.end method

.method public j(Ljava/lang/String;ZLK1/h;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p3}, LA0/j;->s(LK1/h;)Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    invoke-interface {p3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    invoke-interface {p3, p1, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public k(LA/c;LB1/o;)V
    .locals 10

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, LA/c;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Ljava/lang/String;

    .line 9
    .line 10
    const-string v0, "getDeviceInfo"

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_8

    .line 17
    .line 18
    new-instance p1, Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v0, "board"

    .line 24
    .line 25
    sget-object v1, Landroid/os/Build;->BOARD:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    const-string v0, "bootloader"

    .line 31
    .line 32
    sget-object v1, Landroid/os/Build;->BOOTLOADER:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 38
    .line 39
    const-string v1, "brand"

    .line 40
    .line 41
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    sget-object v1, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 45
    .line 46
    const-string v2, "device"

    .line 47
    .line 48
    invoke-virtual {p1, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    const-string v2, "display"

    .line 52
    .line 53
    sget-object v3, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {p1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    sget-object v2, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 59
    .line 60
    const-string v3, "fingerprint"

    .line 61
    .line 62
    invoke-virtual {p1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    sget-object v3, Landroid/os/Build;->HARDWARE:Ljava/lang/String;

    .line 66
    .line 67
    const-string v4, "hardware"

    .line 68
    .line 69
    invoke-virtual {p1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    const-string v4, "host"

    .line 73
    .line 74
    sget-object v5, Landroid/os/Build;->HOST:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {p1, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    const-string v4, "id"

    .line 80
    .line 81
    sget-object v5, Landroid/os/Build;->ID:Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {p1, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    sget-object v4, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 87
    .line 88
    const-string v5, "manufacturer"

    .line 89
    .line 90
    invoke-virtual {p1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    sget-object v5, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 94
    .line 95
    const-string v6, "model"

    .line 96
    .line 97
    invoke-virtual {p1, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    sget-object v6, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    .line 101
    .line 102
    const-string v7, "product"

    .line 103
    .line 104
    invoke-virtual {p1, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 108
    .line 109
    const/16 v8, 0x19

    .line 110
    .line 111
    if-lt v7, v8, :cond_1

    .line 112
    .line 113
    iget-object v7, p0, LA0/j;->n:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v7, Landroid/content/ContentResolver;

    .line 116
    .line 117
    const-string v8, "device_name"

    .line 118
    .line 119
    invoke-static {v7, v8}, Landroid/provider/Settings$Global;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    if-nez v7, :cond_0

    .line 124
    .line 125
    const-string v7, ""

    .line 126
    .line 127
    :cond_0
    const-string v8, "name"

    .line 128
    .line 129
    invoke-virtual {p1, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    :cond_1
    sget-object v7, Landroid/os/Build;->SUPPORTED_32_BIT_ABIS:[Ljava/lang/String;

    .line 133
    .line 134
    array-length v8, v7

    .line 135
    invoke-static {v7, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v7

    .line 139
    invoke-static {v7}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    const-string v8, "supported32BitAbis"

    .line 144
    .line 145
    invoke-virtual {p1, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    sget-object v7, Landroid/os/Build;->SUPPORTED_64_BIT_ABIS:[Ljava/lang/String;

    .line 149
    .line 150
    array-length v8, v7

    .line 151
    invoke-static {v7, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    invoke-static {v7}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 156
    .line 157
    .line 158
    move-result-object v7

    .line 159
    const-string v8, "supported64BitAbis"

    .line 160
    .line 161
    invoke-virtual {p1, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    sget-object v7, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    .line 165
    .line 166
    array-length v8, v7

    .line 167
    invoke-static {v7, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v7

    .line 171
    invoke-static {v7}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 172
    .line 173
    .line 174
    move-result-object v7

    .line 175
    const-string v8, "supportedAbis"

    .line 176
    .line 177
    invoke-virtual {p1, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    const-string v7, "tags"

    .line 181
    .line 182
    sget-object v8, Landroid/os/Build;->TAGS:Ljava/lang/String;

    .line 183
    .line 184
    invoke-virtual {p1, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    const-string v7, "type"

    .line 188
    .line 189
    sget-object v8, Landroid/os/Build;->TYPE:Ljava/lang/String;

    .line 190
    .line 191
    invoke-virtual {p1, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    const-string v7, "BRAND"

    .line 195
    .line 196
    invoke-static {v0, v7}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    const-string v7, "generic"

    .line 200
    .line 201
    invoke-virtual {v0, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    const/4 v8, 0x0

    .line 206
    const/4 v9, 0x1

    .line 207
    if-eqz v0, :cond_2

    .line 208
    .line 209
    const-string v0, "DEVICE"

    .line 210
    .line 211
    invoke-static {v1, v0}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v1, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-nez v0, :cond_4

    .line 219
    .line 220
    :cond_2
    const-string v0, "FINGERPRINT"

    .line 221
    .line 222
    invoke-static {v2, v0}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    if-nez v0, :cond_4

    .line 230
    .line 231
    const-string v0, "unknown"

    .line 232
    .line 233
    invoke-virtual {v2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    if-nez v0, :cond_4

    .line 238
    .line 239
    const-string v0, "HARDWARE"

    .line 240
    .line 241
    invoke-static {v3, v0}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    const-string v0, "goldfish"

    .line 245
    .line 246
    invoke-static {v3, v0}, Lh2/d;->Y(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 247
    .line 248
    .line 249
    move-result v0

    .line 250
    if-nez v0, :cond_4

    .line 251
    .line 252
    const-string v0, "ranchu"

    .line 253
    .line 254
    invoke-static {v3, v0}, Lh2/d;->Y(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    if-nez v0, :cond_4

    .line 259
    .line 260
    const-string v0, "MODEL"

    .line 261
    .line 262
    invoke-static {v5, v0}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    const-string v0, "google_sdk"

    .line 266
    .line 267
    invoke-static {v5, v0}, Lh2/d;->Y(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    if-nez v0, :cond_4

    .line 272
    .line 273
    const-string v0, "Emulator"

    .line 274
    .line 275
    invoke-static {v5, v0}, Lh2/d;->Y(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    if-nez v0, :cond_4

    .line 280
    .line 281
    const-string v0, "Android SDK built for x86"

    .line 282
    .line 283
    invoke-static {v5, v0}, Lh2/d;->Y(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 284
    .line 285
    .line 286
    move-result v0

    .line 287
    if-nez v0, :cond_4

    .line 288
    .line 289
    const-string v0, "MANUFACTURER"

    .line 290
    .line 291
    invoke-static {v4, v0}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    const-string v0, "Genymotion"

    .line 295
    .line 296
    invoke-static {v4, v0}, Lh2/d;->Y(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 297
    .line 298
    .line 299
    move-result v0

    .line 300
    if-nez v0, :cond_4

    .line 301
    .line 302
    const-string v0, "PRODUCT"

    .line 303
    .line 304
    invoke-static {v6, v0}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    const-string v0, "sdk"

    .line 308
    .line 309
    invoke-static {v6, v0}, Lh2/d;->Y(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 310
    .line 311
    .line 312
    move-result v0

    .line 313
    if-nez v0, :cond_4

    .line 314
    .line 315
    const-string v0, "vbox86p"

    .line 316
    .line 317
    invoke-static {v6, v0}, Lh2/d;->Y(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 318
    .line 319
    .line 320
    move-result v0

    .line 321
    if-nez v0, :cond_4

    .line 322
    .line 323
    const-string v0, "emulator"

    .line 324
    .line 325
    invoke-static {v6, v0}, Lh2/d;->Y(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 326
    .line 327
    .line 328
    move-result v0

    .line 329
    if-nez v0, :cond_4

    .line 330
    .line 331
    const-string v0, "simulator"

    .line 332
    .line 333
    invoke-static {v6, v0}, Lh2/d;->Y(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 334
    .line 335
    .line 336
    move-result v0

    .line 337
    if-eqz v0, :cond_3

    .line 338
    .line 339
    goto :goto_0

    .line 340
    :cond_3
    move v0, v8

    .line 341
    goto :goto_1

    .line 342
    :cond_4
    :goto_0
    move v0, v9

    .line 343
    :goto_1
    xor-int/2addr v0, v9

    .line 344
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    const-string v1, "isPhysicalDevice"

    .line 349
    .line 350
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    iget-object v0, p0, LA0/j;->l:Ljava/lang/Object;

    .line 354
    .line 355
    check-cast v0, Landroid/content/pm/PackageManager;

    .line 356
    .line 357
    invoke-virtual {v0}, Landroid/content/pm/PackageManager;->getSystemAvailableFeatures()[Landroid/content/pm/FeatureInfo;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    const-string v1, "getSystemAvailableFeatures(...)"

    .line 362
    .line 363
    invoke-static {v0, v1}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    new-instance v1, Ljava/util/ArrayList;

    .line 367
    .line 368
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 369
    .line 370
    .line 371
    array-length v2, v0

    .line 372
    move v3, v8

    .line 373
    :goto_2
    if-ge v3, v2, :cond_6

    .line 374
    .line 375
    aget-object v4, v0, v3

    .line 376
    .line 377
    iget-object v5, v4, Landroid/content/pm/FeatureInfo;->name:Ljava/lang/String;

    .line 378
    .line 379
    if-nez v5, :cond_5

    .line 380
    .line 381
    goto :goto_3

    .line 382
    :cond_5
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 386
    .line 387
    goto :goto_2

    .line 388
    :cond_6
    new-instance v0, Ljava/util/ArrayList;

    .line 389
    .line 390
    invoke-static {v1}, LP1/g;->e0(Ljava/lang/Iterable;)I

    .line 391
    .line 392
    .line 393
    move-result v2

    .line 394
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 395
    .line 396
    .line 397
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 398
    .line 399
    .line 400
    move-result v2

    .line 401
    :goto_4
    if-ge v8, v2, :cond_7

    .line 402
    .line 403
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v3

    .line 407
    add-int/lit8 v8, v8, 0x1

    .line 408
    .line 409
    check-cast v3, Landroid/content/pm/FeatureInfo;

    .line 410
    .line 411
    iget-object v3, v3, Landroid/content/pm/FeatureInfo;->name:Ljava/lang/String;

    .line 412
    .line 413
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    goto :goto_4

    .line 417
    :cond_7
    const-string v1, "systemFeatures"

    .line 418
    .line 419
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    new-instance v0, Landroid/os/StatFs;

    .line 423
    .line 424
    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    .line 425
    .line 426
    .line 427
    move-result-object v1

    .line 428
    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v1

    .line 432
    invoke-direct {v0, v1}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v0}, Landroid/os/StatFs;->getFreeBytes()J

    .line 436
    .line 437
    .line 438
    move-result-wide v1

    .line 439
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 440
    .line 441
    .line 442
    move-result-object v1

    .line 443
    const-string v2, "freeDiskSize"

    .line 444
    .line 445
    invoke-virtual {p1, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v0}, Landroid/os/StatFs;->getTotalBytes()J

    .line 449
    .line 450
    .line 451
    move-result-wide v0

    .line 452
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    const-string v1, "totalDiskSize"

    .line 457
    .line 458
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    new-instance v0, Ljava/util/HashMap;

    .line 462
    .line 463
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 464
    .line 465
    .line 466
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 467
    .line 468
    const-string v2, "baseOS"

    .line 469
    .line 470
    sget-object v3, Landroid/os/Build$VERSION;->BASE_OS:Ljava/lang/String;

    .line 471
    .line 472
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    sget v2, Landroid/os/Build$VERSION;->PREVIEW_SDK_INT:I

    .line 476
    .line 477
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 478
    .line 479
    .line 480
    move-result-object v2

    .line 481
    const-string v3, "previewSdkInt"

    .line 482
    .line 483
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    const-string v2, "securityPatch"

    .line 487
    .line 488
    sget-object v3, Landroid/os/Build$VERSION;->SECURITY_PATCH:Ljava/lang/String;

    .line 489
    .line 490
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    const-string v2, "codename"

    .line 494
    .line 495
    sget-object v3, Landroid/os/Build$VERSION;->CODENAME:Ljava/lang/String;

    .line 496
    .line 497
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    const-string v2, "incremental"

    .line 501
    .line 502
    sget-object v3, Landroid/os/Build$VERSION;->INCREMENTAL:Ljava/lang/String;

    .line 503
    .line 504
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    const-string v2, "release"

    .line 508
    .line 509
    sget-object v3, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 510
    .line 511
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    const-string v2, "sdkInt"

    .line 515
    .line 516
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 517
    .line 518
    .line 519
    move-result-object v1

    .line 520
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    const-string v1, "version"

    .line 524
    .line 525
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    new-instance v0, Landroid/app/ActivityManager$MemoryInfo;

    .line 529
    .line 530
    invoke-direct {v0}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V

    .line 531
    .line 532
    .line 533
    iget-object v1, p0, LA0/j;->m:Ljava/lang/Object;

    .line 534
    .line 535
    check-cast v1, Landroid/app/ActivityManager;

    .line 536
    .line 537
    invoke-virtual {v1, v0}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V

    .line 538
    .line 539
    .line 540
    iget-boolean v1, v0, Landroid/app/ActivityManager$MemoryInfo;->lowMemory:Z

    .line 541
    .line 542
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 543
    .line 544
    .line 545
    move-result-object v1

    .line 546
    const-string v2, "isLowRamDevice"

    .line 547
    .line 548
    invoke-virtual {p1, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    iget-wide v1, v0, Landroid/app/ActivityManager$MemoryInfo;->totalMem:J

    .line 552
    .line 553
    const-wide/32 v3, 0x100000

    .line 554
    .line 555
    .line 556
    div-long/2addr v1, v3

    .line 557
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 558
    .line 559
    .line 560
    move-result-object v1

    .line 561
    const-string v2, "physicalRamSize"

    .line 562
    .line 563
    invoke-virtual {p1, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    iget-wide v0, v0, Landroid/app/ActivityManager$MemoryInfo;->availMem:J

    .line 567
    .line 568
    div-long/2addr v0, v3

    .line 569
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    const-string v1, "availableRamSize"

    .line 574
    .line 575
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 576
    .line 577
    .line 578
    invoke-virtual {p2, p1}, LB1/o;->d(Ljava/lang/Object;)V

    .line 579
    .line 580
    .line 581
    return-void

    .line 582
    :cond_8
    invoke-virtual {p2}, LB1/o;->b()V

    .line 583
    .line 584
    .line 585
    return-void
.end method

.method public l(Ljava/lang/String;Ljava/lang/String;LK1/h;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p3}, LA0/j;->s(LK1/h;)Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    invoke-interface {p3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    invoke-interface {p3, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public m(Ljava/lang/String;LK1/h;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0, p2}, LA0/j;->s(LK1/h;)Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p2, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const-string v0, ""

    .line 12
    .line 13
    invoke-interface {p2, p1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    return-object p1
.end method

.method public n(Ljava/lang/String;Ljava/lang/String;LK1/h;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p3}, LA0/j;->s(LK1/h;)Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    invoke-interface {p3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    invoke-interface {p3, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public o(Ljava/nio/ByteBuffer;Lt1/h;)V
    .locals 10

    .line 1
    iget-object v0, p0, LA0/j;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 4
    .line 5
    iget-object v1, p0, LA0/j;->l:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, LC1/h;

    .line 8
    .line 9
    iget-object v2, p0, LA0/j;->n:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, LA0/j;

    .line 12
    .line 13
    iget-object v3, v2, LA0/j;->m:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Ljava/lang/String;

    .line 16
    .line 17
    iget-object v2, v2, LA0/j;->n:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, LC1/n;

    .line 20
    .line 21
    invoke-interface {v2, p1}, LC1/n;->d(Ljava/nio/ByteBuffer;)LA/c;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object p1, p1, LA/c;->l:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, Ljava/lang/String;

    .line 28
    .line 29
    const-string v4, "listen"

    .line 30
    .line 31
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    const-string v5, "error"

    .line 36
    .line 37
    const-string v6, "EventChannel#"

    .line 38
    .line 39
    const/4 v7, 0x0

    .line 40
    if-eqz v4, :cond_1

    .line 41
    .line 42
    new-instance p1, LC1/g;

    .line 43
    .line 44
    invoke-direct {p1, p0}, LC1/g;-><init>(LA0/j;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v4, LC1/g;

    .line 52
    .line 53
    if-eqz v4, :cond_0

    .line 54
    .line 55
    :try_start_0
    invoke-interface {v1}, LC1/h;->onCancel()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catch_0
    move-exception v4

    .line 60
    new-instance v8, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v8, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    const-string v9, "Failed to close existing event stream"

    .line 73
    .line 74
    invoke-static {v8, v9, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 75
    .line 76
    .line 77
    :cond_0
    :goto_0
    :try_start_1
    invoke-interface {v1, p1}, LC1/h;->i(LC1/g;)V

    .line 78
    .line 79
    .line 80
    invoke-interface {v2, v7}, LC1/n;->a(Ljava/lang/Object;)Ljava/nio/ByteBuffer;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {p2, p1}, Lt1/h;->a(Ljava/nio/ByteBuffer;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :catch_1
    move-exception p1

    .line 89
    invoke-virtual {v0, v7}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    new-instance v0, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    const-string v1, "Failed to open event stream"

    .line 105
    .line 106
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-interface {v2, v5, p1, v7}, LC1/n;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/nio/ByteBuffer;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-virtual {p2, p1}, Lt1/h;->a(Ljava/nio/ByteBuffer;)V

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_1
    const-string v4, "cancel"

    .line 122
    .line 123
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    if-eqz p1, :cond_3

    .line 128
    .line 129
    invoke-virtual {v0, v7}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    check-cast p1, LC1/g;

    .line 134
    .line 135
    if-eqz p1, :cond_2

    .line 136
    .line 137
    :try_start_2
    invoke-interface {v1}, LC1/h;->onCancel()V

    .line 138
    .line 139
    .line 140
    invoke-interface {v2, v7}, LC1/n;->a(Ljava/lang/Object;)Ljava/nio/ByteBuffer;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-virtual {p2, p1}, Lt1/h;->a(Ljava/nio/ByteBuffer;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2

    .line 145
    .line 146
    .line 147
    goto :goto_1

    .line 148
    :catch_2
    move-exception p1

    .line 149
    new-instance v0, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    const-string v1, "Failed to close event stream"

    .line 162
    .line 163
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    invoke-interface {v2, v5, p1, v7}, LC1/n;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/nio/ByteBuffer;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-virtual {p2, p1}, Lt1/h;->a(Ljava/nio/ByteBuffer;)V

    .line 175
    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_2
    const-string p1, "No active stream to cancel"

    .line 179
    .line 180
    invoke-interface {v2, v5, p1, v7}, LC1/n;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/nio/ByteBuffer;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-virtual {p2, p1}, Lt1/h;->a(Ljava/nio/ByteBuffer;)V

    .line 185
    .line 186
    .line 187
    :goto_1
    return-void

    .line 188
    :cond_3
    invoke-virtual {p2, v7}, Lt1/h;->a(Ljava/nio/ByteBuffer;)V

    .line 189
    .line 190
    .line 191
    return-void
.end method

.method public p(Ljava/lang/String;LK1/h;)Ljava/lang/Boolean;
    .locals 1

    .line 1
    invoke-virtual {p0, p2}, LA0/j;->s(LK1/h;)Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p2, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    invoke-interface {p2, p1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    return-object p1
.end method

.method public q(Ljava/util/List;LK1/h;)Ljava/util/List;
    .locals 5

    .line 1
    invoke-virtual {p0, p2}, LA0/j;->s(LK1/h;)Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p2}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    const-string v0, "getAll(...)"

    .line 10
    .line 11
    invoke-static {p2, v0}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Ljava/util/Map$Entry;

    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    const-string v3, "<get-key>(...)"

    .line 44
    .line 45
    invoke-static {v2, v3}, La2/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    check-cast v2, Ljava/lang/String;

    .line 49
    .line 50
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    if-eqz p1, :cond_1

    .line 55
    .line 56
    invoke-static {p1}, LP1/e;->n0(Ljava/util/Collection;)Ljava/util/Set;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    goto :goto_1

    .line 61
    :cond_1
    const/4 v4, 0x0

    .line 62
    :goto_1
    invoke-static {v2, v3, v4}, LK1/M;->b(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Set;)Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-eqz v2, :cond_0

    .line 67
    .line 68
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-static {p1}, LP1/e;->l0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    return-object p1
.end method

.method public r(Ljava/lang/String;LK1/h;)Ljava/lang/Double;
    .locals 1

    .line 1
    invoke-virtual {p0, p2}, LA0/j;->s(LK1/h;)Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p2, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const-string v0, ""

    .line 12
    .line 13
    invoke-interface {p2, p1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object p2, p0, LA0/j;->n:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p2, LB1/b;

    .line 20
    .line 21
    invoke-static {p1, p2}, LK1/M;->c(Ljava/lang/Object;LB1/b;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string p2, "null cannot be cast to non-null type kotlin.Double"

    .line 26
    .line 27
    invoke-static {p1, p2}, La2/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    check-cast p1, Ljava/lang/Double;

    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_0
    const/4 p1, 0x0

    .line 34
    return-object p1
.end method

.method public s(LK1/h;)Landroid/content/SharedPreferences;
    .locals 3

    .line 1
    iget-object v0, p0, LA0/j;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/Context;

    .line 4
    .line 5
    iget-object p1, p1, LK1/h;->a:Ljava/lang/String;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    new-instance p1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v2, "_preferences"

    .line 23
    .line 24
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-static {p1}, La2/h;->b(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    return-object p1

    .line 39
    :cond_0
    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {p1}, La2/h;->b(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-object p1
.end method

.method public t(ILio/flutter/view/f;)V
    .locals 1

    .line 1
    iget-object v0, p0, LA0/j;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/flutter/embedding/engine/FlutterJNI;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lio/flutter/embedding/engine/FlutterJNI;->dispatchSemanticsAction(ILio/flutter/view/f;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget v0, p0, LA0/j;->k:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :sswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, LA0/j;->m:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Ll0/b;

    .line 19
    .line 20
    invoke-virtual {v1}, Ll0/b;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, ", hidden list:"

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, LA0/j;->n:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0

    .line 48
    :sswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    const/16 v1, 0x20

    .line 51
    .line 52
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, LA0/j;->l:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v1, Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const/16 v1, 0x7b

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, LA0/j;->m:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v1, LA0/j;

    .line 70
    .line 71
    iget-object v1, v1, LA0/j;->n:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v1, LA0/j;

    .line 74
    .line 75
    const-string v2, ""

    .line 76
    .line 77
    :goto_0
    if-eqz v1, :cond_2

    .line 78
    .line 79
    iget-object v3, v1, LA0/j;->m:Ljava/lang/Object;

    .line 80
    .line 81
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    iget-object v2, v1, LA0/j;->l:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v2, Ljava/lang/String;

    .line 87
    .line 88
    if-eqz v2, :cond_0

    .line 89
    .line 90
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const/16 v2, 0x3d

    .line 94
    .line 95
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    :cond_0
    if-eqz v3, :cond_1

    .line 99
    .line 100
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-eqz v2, :cond_1

    .line 109
    .line 110
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-static {v2}, Ljava/util/Arrays;->deepToString([Ljava/lang/Object;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    add-int/lit8 v3, v3, -0x1

    .line 123
    .line 124
    const/4 v4, 0x1

    .line 125
    invoke-virtual {v0, v2, v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_1
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    :goto_1
    iget-object v1, v1, LA0/j;->n:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v1, LA0/j;

    .line 135
    .line 136
    const-string v2, ", "

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_2
    const/16 v1, 0x7d

    .line 140
    .line 141
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    return-object v0

    .line 149
    :sswitch_data_0
    .sparse-switch
        0xc -> :sswitch_1
        0x10 -> :sswitch_0
    .end sparse-switch
.end method

.method public u(ILio/flutter/view/f;Ljava/io/Serializable;)V
    .locals 1

    .line 1
    iget-object v0, p0, LA0/j;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/flutter/embedding/engine/FlutterJNI;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, Lio/flutter/embedding/engine/FlutterJNI;->dispatchSemanticsAction(ILio/flutter/view/f;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public w(II)I
    .locals 3

    .line 1
    iget-object v0, p0, LA0/j;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    :goto_0
    if-ge p2, v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Ll0/a;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    add-int/lit8 p2, p2, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return p1
.end method

.method public x(I)Landroid/content/res/ColorStateList;
    .locals 4

    .line 1
    iget-object v0, p0, LA0/j;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object v2, p0, LA0/j;->l:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Landroid/content/Context;

    .line 21
    .line 22
    sget-object v3, Lg/a;->a:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {v2, v1}, Landroid/content/Context;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    return-object v1

    .line 31
    :cond_0
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1
.end method

.method public y(I)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    iget-object v0, p0, LA0/j;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object p1, p0, LA0/j;->l:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Landroid/content/Context;

    .line 21
    .line 22
    invoke-static {p1, v1}, Lg/a;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :cond_0
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1
.end method

.method public z(IILk/s;)Landroid/graphics/Typeface;
    .locals 11

    .line 1
    iget-object v0, p0, LA0/j;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 7
    .line 8
    .line 9
    move-result v5

    .line 10
    const/4 p1, 0x0

    .line 11
    if-nez v5, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, LA0/j;->n:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Landroid/util/TypedValue;

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    new-instance v0, Landroid/util/TypedValue;

    .line 21
    .line 22
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, LA0/j;->n:Ljava/lang/Object;

    .line 26
    .line 27
    :cond_1
    iget-object v0, p0, LA0/j;->l:Ljava/lang/Object;

    .line 28
    .line 29
    move-object v2, v0

    .line 30
    check-cast v2, Landroid/content/Context;

    .line 31
    .line 32
    iget-object v0, p0, LA0/j;->n:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Landroid/util/TypedValue;

    .line 35
    .line 36
    sget-object v1, Lv/e;->a:Ljava/lang/Object;

    .line 37
    .line 38
    invoke-virtual {v2}, Landroid/content/Context;->isRestricted()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    :goto_0
    return-object p1

    .line 45
    :cond_2
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    const/4 v1, 0x1

    .line 50
    invoke-virtual {v4, v5, v0, v1}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 51
    .line 52
    .line 53
    const-string v1, "ResourcesCompat"

    .line 54
    .line 55
    iget-object v3, v0, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    .line 56
    .line 57
    if-eqz v3, :cond_9

    .line 58
    .line 59
    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    const-string v3, "res/"

    .line 64
    .line 65
    invoke-virtual {v6, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-nez v3, :cond_3

    .line 70
    .line 71
    invoke-virtual {p3}, Lk/s;->a()V

    .line 72
    .line 73
    .line 74
    goto/16 :goto_7

    .line 75
    .line 76
    :cond_3
    iget v3, v0, Landroid/util/TypedValue;->assetCookie:I

    .line 77
    .line 78
    sget-object v8, Lw/e;->b:Lo/i;

    .line 79
    .line 80
    invoke-static {v4, v5, v6, v3, p2}, Lw/e;->b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-virtual {v8, v3}, Lo/i;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    check-cast v3, Landroid/graphics/Typeface;

    .line 89
    .line 90
    const/16 v9, 0x13

    .line 91
    .line 92
    if-eqz v3, :cond_4

    .line 93
    .line 94
    new-instance p1, Landroid/os/Handler;

    .line 95
    .line 96
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 101
    .line 102
    .line 103
    new-instance p2, LM/c;

    .line 104
    .line 105
    invoke-direct {p2, p3, v3, v9}, LM/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 109
    .line 110
    .line 111
    move-object p1, v3

    .line 112
    goto/16 :goto_7

    .line 113
    .line 114
    :cond_4
    :try_start_0
    invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    const-string v7, ".xml"

    .line 119
    .line 120
    invoke-virtual {v3, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    if-eqz v3, :cond_6

    .line 125
    .line 126
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    invoke-static {v3, v4}, LS0/a;->x(Landroid/content/res/XmlResourceParser;Landroid/content/res/Resources;)Lv/a;

    .line 131
    .line 132
    .line 133
    move-result-object v3
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4

    .line 134
    if-nez v3, :cond_5

    .line 135
    .line 136
    :try_start_1
    const-string p2, "Failed to find font-family tag"

    .line 137
    .line 138
    invoke-static {v1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 139
    .line 140
    .line 141
    invoke-virtual {p3}, Lk/s;->a()V
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 142
    .line 143
    .line 144
    goto/16 :goto_7

    .line 145
    .line 146
    :catch_0
    move-exception v0

    .line 147
    move-object p2, v0

    .line 148
    move-object v10, p3

    .line 149
    move-object p3, p2

    .line 150
    move-object p2, v10

    .line 151
    goto/16 :goto_4

    .line 152
    .line 153
    :catch_1
    move-exception v0

    .line 154
    move-object p2, v0

    .line 155
    move-object v10, p3

    .line 156
    move-object p3, p2

    .line 157
    move-object p2, v10

    .line 158
    goto/16 :goto_5

    .line 159
    .line 160
    :cond_5
    :try_start_2
    iget v7, v0, Landroid/util/TypedValue;->assetCookie:I
    :try_end_2
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4

    .line 161
    .line 162
    move v8, p2

    .line 163
    move-object v9, p3

    .line 164
    :try_start_3
    invoke-static/range {v2 .. v9}, Lw/e;->a(Landroid/content/Context;Lv/a;Landroid/content/res/Resources;ILjava/lang/String;IILk/s;)Landroid/graphics/Typeface;

    .line 165
    .line 166
    .line 167
    move-result-object p1
    :try_end_3
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 168
    goto/16 :goto_7

    .line 169
    .line 170
    :catch_2
    move-exception v0

    .line 171
    move-object p2, v9

    .line 172
    :goto_1
    move-object p3, v0

    .line 173
    goto :goto_4

    .line 174
    :catch_3
    move-exception v0

    .line 175
    move-object p2, v9

    .line 176
    :goto_2
    move-object p3, v0

    .line 177
    goto :goto_5

    .line 178
    :catch_4
    move-exception v0

    .line 179
    move-object p2, p3

    .line 180
    goto :goto_1

    .line 181
    :catch_5
    move-exception v0

    .line 182
    move-object p2, p3

    .line 183
    goto :goto_2

    .line 184
    :cond_6
    move v7, p2

    .line 185
    move-object p2, p3

    .line 186
    :try_start_4
    iget p3, v0, Landroid/util/TypedValue;->assetCookie:I

    .line 187
    .line 188
    move-object v3, v2

    .line 189
    sget-object v2, Lw/e;->a:LS0/a;

    .line 190
    .line 191
    invoke-virtual/range {v2 .. v7}, LS0/a;->l(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;I)Landroid/graphics/Typeface;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    if-eqz v0, :cond_7

    .line 196
    .line 197
    invoke-static {v4, v5, v6, p3, v7}, Lw/e;->b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p3

    .line 201
    invoke-virtual {v8, p3, v0}, Lo/i;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    :cond_7
    if-eqz v0, :cond_8

    .line 205
    .line 206
    new-instance p3, Landroid/os/Handler;

    .line 207
    .line 208
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    invoke-direct {p3, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 213
    .line 214
    .line 215
    new-instance v2, LM/c;

    .line 216
    .line 217
    invoke-direct {v2, p2, v0, v9}, LM/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {p3, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 221
    .line 222
    .line 223
    :goto_3
    move-object p1, v0

    .line 224
    goto :goto_7

    .line 225
    :cond_8
    invoke-virtual {p2}, Lk/s;->a()V
    :try_end_4
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_4 .. :try_end_4} :catch_7
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_6

    .line 226
    .line 227
    .line 228
    goto :goto_3

    .line 229
    :catch_6
    move-exception v0

    .line 230
    goto :goto_1

    .line 231
    :catch_7
    move-exception v0

    .line 232
    goto :goto_2

    .line 233
    :goto_4
    const-string v0, "Failed to read xml resource "

    .line 234
    .line 235
    invoke-virtual {v0, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    invoke-static {v1, v0, p3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 240
    .line 241
    .line 242
    goto :goto_6

    .line 243
    :goto_5
    const-string v0, "Failed to parse xml resource "

    .line 244
    .line 245
    invoke-virtual {v0, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-static {v1, v0, p3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 250
    .line 251
    .line 252
    :goto_6
    invoke-virtual {p2}, Lk/s;->a()V

    .line 253
    .line 254
    .line 255
    :goto_7
    return-object p1

    .line 256
    :cond_9
    new-instance p1, Landroid/content/res/Resources$NotFoundException;

    .line 257
    .line 258
    new-instance p2, Ljava/lang/StringBuilder;

    .line 259
    .line 260
    const-string p3, "Resource \""

    .line 261
    .line 262
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object p3

    .line 269
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    const-string p3, "\" ("

    .line 273
    .line 274
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object p3

    .line 281
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    const-string p3, ") is not a Font: "

    .line 285
    .line 286
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object p2

    .line 296
    invoke-direct {p1, p2}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    throw p1
.end method

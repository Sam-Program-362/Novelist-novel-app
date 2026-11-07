.class public final Lb0/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/LayoutInflater$Factory2;


# instance fields
.field public final k:Lb0/I;


# direct methods
.method public constructor <init>(Lb0/I;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb0/x;->k:Lb0/I;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 16

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    .line 2
    const-class v3, Lb0/w;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    move-object/from16 v4, p0

    iget-object v5, v4, Lb0/x;->k:Lb0/I;

    if-eqz v3, :cond_0

    .line 3
    new-instance v0, Lb0/w;

    invoke-direct {v0, v1, v2, v5}, Lb0/w;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;Lb0/I;)V

    return-object v0

    .line 4
    :cond_0
    const-string v3, "fragment"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v3, 0x0

    if-nez v0, :cond_2

    :cond_1
    :goto_0
    move-object/from16 p2, v3

    goto/16 :goto_a

    .line 5
    :cond_2
    const-string v0, "class"

    invoke-interface {v2, v3, v0}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 6
    sget-object v6, La0/a;->a:[I

    invoke-virtual {v1, v2, v6}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v6

    const/4 v7, 0x0

    if-nez v0, :cond_3

    .line 7
    invoke-virtual {v6, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    :cond_3
    const/4 v8, 0x1

    const/4 v9, -0x1

    .line 8
    invoke-virtual {v6, v8, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v10

    const/4 v11, 0x2

    .line 9
    invoke-virtual {v6, v11}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v12

    .line 10
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz v0, :cond_1

    .line 11
    invoke-virtual {v1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v6

    .line 12
    :try_start_0
    invoke-static {v0, v6}, Lb0/B;->b(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v6

    .line 13
    const-class v13, Lb0/s;

    invoke-virtual {v13, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move v6, v7

    :goto_1
    if-nez v6, :cond_4

    goto :goto_0

    :cond_4
    if-eqz p1, :cond_5

    .line 14
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getId()I

    move-result v7

    :cond_5
    if-ne v7, v9, :cond_7

    if-ne v10, v9, :cond_7

    if-eqz v12, :cond_6

    goto :goto_2

    .line 15
    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": Must specify unique android:id, android:tag, or have a parent with an id for "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    :goto_2
    if-eq v10, v9, :cond_8

    .line 16
    invoke-virtual {v5, v10}, Lb0/I;->C(I)Lb0/s;

    move-result-object v6

    goto :goto_3

    :cond_8
    move-object v6, v3

    :goto_3
    if-nez v6, :cond_d

    if-eqz v12, :cond_d

    .line 17
    iget-object v6, v5, Lb0/I;->c:LB1/s;

    .line 18
    iget-object v13, v6, LB1/s;->k:Ljava/lang/Object;

    check-cast v13, Ljava/util/ArrayList;

    .line 19
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v14

    sub-int/2addr v14, v8

    :goto_4
    if-ltz v14, :cond_a

    .line 20
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lb0/s;

    move-object/from16 p2, v3

    if-eqz v15, :cond_9

    .line 21
    iget-object v3, v15, Lb0/s;->I:Ljava/lang/String;

    invoke-virtual {v12, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    move-object v6, v15

    goto :goto_5

    :cond_9
    add-int/lit8 v14, v14, -0x1

    move-object/from16 v3, p2

    goto :goto_4

    :cond_a
    move-object/from16 p2, v3

    .line 22
    iget-object v3, v6, LB1/s;->l:Ljava/lang/Object;

    check-cast v3, Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lb0/O;

    if-eqz v6, :cond_b

    .line 23
    iget-object v6, v6, Lb0/O;->c:Lb0/s;

    .line 24
    iget-object v13, v6, Lb0/s;->I:Ljava/lang/String;

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_b

    goto :goto_5

    :cond_c
    move-object/from16 v6, p2

    goto :goto_5

    :cond_d
    move-object/from16 p2, v3

    :goto_5
    if-nez v6, :cond_e

    if-eq v7, v9, :cond_e

    .line 25
    invoke-virtual {v5, v7}, Lb0/I;->C(I)Lb0/s;

    move-result-object v6

    .line 26
    :cond_e
    const-string v3, "Fragment "

    const-string v9, "FragmentManager"

    if-nez v6, :cond_12

    .line 27
    invoke-virtual {v5}, Lb0/I;->G()Lb0/B;

    move-result-object v2

    .line 28
    invoke-virtual {v1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 29
    invoke-virtual {v2, v0}, Lb0/B;->a(Ljava/lang/String;)Lb0/s;

    move-result-object v6

    .line 30
    iput-boolean v8, v6, Lb0/s;->x:Z

    if-eqz v10, :cond_f

    move v1, v10

    goto :goto_6

    :cond_f
    move v1, v7

    .line 31
    :goto_6
    iput v1, v6, Lb0/s;->G:I

    .line 32
    iput v7, v6, Lb0/s;->H:I

    .line 33
    iput-object v12, v6, Lb0/s;->I:Ljava/lang/String;

    .line 34
    iput-boolean v8, v6, Lb0/s;->y:Z

    .line 35
    iput-object v5, v6, Lb0/s;->C:Lb0/I;

    .line 36
    iget-object v1, v5, Lb0/I;->v:Lb0/u;

    .line 37
    iput-object v1, v6, Lb0/s;->D:Lb0/u;

    .line 38
    iget-object v2, v1, Lb0/u;->n:Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;

    .line 39
    iput-boolean v8, v6, Lb0/s;->N:Z

    if-nez v1, :cond_10

    move-object/from16 v1, p2

    goto :goto_7

    .line 40
    :cond_10
    iget-object v1, v1, Lb0/u;->m:Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;

    :goto_7
    if-eqz v1, :cond_11

    .line 41
    iput-boolean v8, v6, Lb0/s;->N:Z

    .line 42
    :cond_11
    invoke-virtual {v5, v6}, Lb0/I;->a(Lb0/s;)Lb0/O;

    move-result-object v1

    .line 43
    invoke-static {v11}, Lb0/I;->J(I)Z

    move-result v2

    if-eqz v2, :cond_15

    .line 44
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " has been inflated via the <fragment> tag: id=0x"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    invoke-static {v10}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 46
    invoke-static {v9, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_9

    .line 47
    :cond_12
    iget-boolean v1, v6, Lb0/s;->y:Z

    if-nez v1, :cond_16

    .line 48
    iput-boolean v8, v6, Lb0/s;->y:Z

    .line 49
    iput-object v5, v6, Lb0/s;->C:Lb0/I;

    .line 50
    iget-object v1, v5, Lb0/I;->v:Lb0/u;

    .line 51
    iput-object v1, v6, Lb0/s;->D:Lb0/u;

    .line 52
    iget-object v2, v1, Lb0/u;->n:Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;

    .line 53
    iput-boolean v8, v6, Lb0/s;->N:Z

    if-nez v1, :cond_13

    move-object/from16 v1, p2

    goto :goto_8

    .line 54
    :cond_13
    iget-object v1, v1, Lb0/u;->m:Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;

    :goto_8
    if-eqz v1, :cond_14

    .line 55
    iput-boolean v8, v6, Lb0/s;->N:Z

    .line 56
    :cond_14
    invoke-virtual {v5, v6}, Lb0/I;->g(Lb0/s;)Lb0/O;

    move-result-object v1

    .line 57
    invoke-static {v11}, Lb0/I;->J(I)Z

    move-result v2

    if-eqz v2, :cond_15

    .line 58
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "Retained Fragment "

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " has been re-attached via the <fragment> tag: id=0x"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    invoke-static {v10}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 60
    invoke-static {v9, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 61
    :cond_15
    :goto_9
    move-object/from16 v2, p1

    check-cast v2, Landroid/view/ViewGroup;

    sget-object v5, Lc0/d;->a:Lc0/c;

    .line 62
    new-instance v5, Lc0/a;

    .line 63
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "Attempting to use <fragment> tag to add fragment "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v8, " to container "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 64
    invoke-direct {v5, v6, v7}, Lc0/a;-><init>(Lb0/s;Ljava/lang/String;)V

    .line 65
    invoke-static {v5}, Lc0/d;->b(Lc0/a;)V

    .line 66
    invoke-static {v6}, Lc0/d;->a(Lb0/s;)Lc0/c;

    move-result-object v5

    .line 67
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    iput-object v2, v6, Lb0/s;->O:Landroid/view/ViewGroup;

    .line 69
    invoke-virtual {v1}, Lb0/O;->j()V

    .line 70
    invoke-virtual {v1}, Lb0/O;->i()V

    .line 71
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, " did not create a view."

    .line 72
    invoke-static {v3, v0, v2}, Lt/a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 73
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 74
    :cond_16
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": Duplicate id 0x"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    invoke-static {v10}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", tag "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", or parent id 0x"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    invoke-static {v7}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " with another fragment for "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :goto_a
    return-object p2
.end method

.method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0, p1, p2, p3}, Lb0/x;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

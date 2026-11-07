.class public final Lio/flutter/plugin/platform/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/platform/h;


# instance fields
.field public final k:Lio/flutter/embedding/engine/renderer/h;

.field public l:Landroid/graphics/SurfaceTexture;

.field public m:Landroid/view/Surface;

.field public n:I

.field public o:I

.field public p:Z


# direct methods
.method public constructor <init>(Lio/flutter/embedding/engine/renderer/h;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lio/flutter/plugin/platform/z;->n:I

    .line 6
    .line 7
    iput v0, p0, Lio/flutter/plugin/platform/z;->o:I

    .line 8
    .line 9
    iput-boolean v0, p0, Lio/flutter/plugin/platform/z;->p:Z

    .line 10
    .line 11
    new-instance v0, Lio/flutter/plugin/platform/y;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lio/flutter/plugin/platform/y;-><init>(Lio/flutter/plugin/platform/z;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lio/flutter/plugin/platform/z;->k:Lio/flutter/embedding/engine/renderer/h;

    .line 17
    .line 18
    iget-object v1, p1, Lio/flutter/embedding/engine/renderer/h;->b:Lio/flutter/embedding/engine/renderer/SurfaceTextureWrapper;

    .line 19
    .line 20
    invoke-virtual {v1}, Lio/flutter/embedding/engine/renderer/SurfaceTextureWrapper;->surfaceTexture()Landroid/graphics/SurfaceTexture;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iput-object v1, p0, Lio/flutter/plugin/platform/z;->l:Landroid/graphics/SurfaceTexture;

    .line 25
    .line 26
    iput-object v0, p1, Lio/flutter/embedding/engine/renderer/h;->d:Lio/flutter/view/p;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final b(II)V
    .locals 1

    .line 1
    iput p1, p0, Lio/flutter/plugin/platform/z;->n:I

    .line 2
    .line 3
    iput p2, p0, Lio/flutter/plugin/platform/z;->o:I

    .line 4
    .line 5
    iget-object v0, p0, Lio/flutter/plugin/platform/z;->l:Landroid/graphics/SurfaceTexture;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final getHeight()I
    .locals 1

    .line 1
    iget v0, p0, Lio/flutter/plugin/platform/z;->o:I

    .line 2
    .line 3
    return v0
.end method

.method public final getId()J
    .locals 2

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/platform/z;->k:Lio/flutter/embedding/engine/renderer/h;

    .line 2
    .line 3
    iget-wide v0, v0, Lio/flutter/embedding/engine/renderer/h;->a:J

    .line 4
    .line 5
    return-wide v0
.end method

.method public final getSurface()Landroid/view/Surface;
    .locals 3

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/platform/z;->m:Landroid/view/Surface;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-boolean v2, p0, Lio/flutter/plugin/platform/z;->p:Z

    .line 7
    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lio/flutter/plugin/platform/z;->m:Landroid/view/Surface;

    .line 17
    .line 18
    :cond_1
    new-instance v0, Landroid/view/Surface;

    .line 19
    .line 20
    iget-object v2, p0, Lio/flutter/plugin/platform/z;->l:Landroid/graphics/SurfaceTexture;

    .line 21
    .line 22
    invoke-direct {v0, v2}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lio/flutter/plugin/platform/z;->m:Landroid/view/Surface;

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    iput-boolean v0, p0, Lio/flutter/plugin/platform/z;->p:Z

    .line 29
    .line 30
    :goto_0
    iget-object v0, p0, Lio/flutter/plugin/platform/z;->l:Landroid/graphics/SurfaceTexture;

    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    invoke-static {v0}, Lio/flutter/plugin/editing/i;->A(Landroid/graphics/SurfaceTexture;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    iget-object v0, p0, Lio/flutter/plugin/platform/z;->m:Landroid/view/Surface;

    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_3
    :goto_1
    return-object v1
.end method

.method public final getWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lio/flutter/plugin/platform/z;->n:I

    .line 2
    .line 3
    return v0
.end method

.method public final release()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lio/flutter/plugin/platform/z;->l:Landroid/graphics/SurfaceTexture;

    .line 3
    .line 4
    iget-object v1, p0, Lio/flutter/plugin/platform/z;->m:Landroid/view/Surface;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {v1}, Landroid/view/Surface;->release()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lio/flutter/plugin/platform/z;->m:Landroid/view/Surface;

    .line 12
    .line 13
    :cond_0
    return-void
.end method

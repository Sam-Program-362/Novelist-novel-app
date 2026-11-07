.class public final LV0/i;
.super LN0/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LV0/i;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final k:Ljava/lang/String;

.field public final l:Ljava/lang/String;

.field public final m:Lb1/J;

.field public final n:LV0/d;

.field public final o:LV0/c;

.field public final p:LV0/e;

.field public final q:LV0/a;

.field public final r:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LF0/l;

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    invoke-direct {v0, v1}, LF0/l;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LV0/i;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;[BLV0/d;LV0/c;LV0/e;LV0/a;Ljava/lang/String;)V
    .locals 4

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    const/4 p3, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    array-length v0, p3

    .line 6
    invoke-static {p3, v0}, Lb1/J;->i([BI)Lb1/J;

    .line 7
    .line 8
    .line 9
    move-result-object p3

    .line 10
    :goto_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    const/4 v1, 0x1

    .line 15
    if-eqz p4, :cond_2

    .line 16
    .line 17
    if-nez p5, :cond_2

    .line 18
    .line 19
    if-eqz p6, :cond_1

    .line 20
    .line 21
    goto :goto_2

    .line 22
    :cond_1
    :goto_1
    move v2, v1

    .line 23
    goto :goto_3

    .line 24
    :cond_2
    :goto_2
    if-nez p4, :cond_3

    .line 25
    .line 26
    if-eqz p5, :cond_3

    .line 27
    .line 28
    if-eqz p6, :cond_1

    .line 29
    .line 30
    :cond_3
    if-nez p4, :cond_4

    .line 31
    .line 32
    if-nez p5, :cond_4

    .line 33
    .line 34
    if-eqz p6, :cond_4

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_4
    move v2, v0

    .line 38
    :goto_3
    const-string v3, "Must provide a response object."

    .line 39
    .line 40
    invoke-static {v3, v2}, LM0/r;->a(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    if-nez p6, :cond_5

    .line 44
    .line 45
    if-eqz p1, :cond_6

    .line 46
    .line 47
    if-eqz p3, :cond_6

    .line 48
    .line 49
    :cond_5
    move v0, v1

    .line 50
    :cond_6
    const-string v1, "Must provide id and rawId if not an error response."

    .line 51
    .line 52
    invoke-static {v1, v0}, LM0/r;->a(Ljava/lang/String;Z)V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, LV0/i;->k:Ljava/lang/String;

    .line 56
    .line 57
    iput-object p2, p0, LV0/i;->l:Ljava/lang/String;

    .line 58
    .line 59
    iput-object p3, p0, LV0/i;->m:Lb1/J;

    .line 60
    .line 61
    iput-object p4, p0, LV0/i;->n:LV0/d;

    .line 62
    .line 63
    iput-object p5, p0, LV0/i;->o:LV0/c;

    .line 64
    .line 65
    iput-object p6, p0, LV0/i;->p:LV0/e;

    .line 66
    .line 67
    iput-object p7, p0, LV0/i;->q:LV0/a;

    .line 68
    .line 69
    iput-object p8, p0, LV0/i;->r:Ljava/lang/String;

    .line 70
    .line 71
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, LV0/i;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    check-cast p1, LV0/i;

    .line 7
    .line 8
    iget-object v0, p0, LV0/i;->k:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v1, p1, LV0/i;->k:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1}, LM0/r;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, LV0/i;->l:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v1, p1, LV0/i;->l:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v0, v1}, LM0/r;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, LV0/i;->m:Lb1/J;

    .line 29
    .line 30
    iget-object v1, p1, LV0/i;->m:Lb1/J;

    .line 31
    .line 32
    invoke-static {v0, v1}, LM0/r;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    iget-object v0, p0, LV0/i;->n:LV0/d;

    .line 39
    .line 40
    iget-object v1, p1, LV0/i;->n:LV0/d;

    .line 41
    .line 42
    invoke-static {v0, v1}, LM0/r;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    iget-object v0, p0, LV0/i;->o:LV0/c;

    .line 49
    .line 50
    iget-object v1, p1, LV0/i;->o:LV0/c;

    .line 51
    .line 52
    invoke-static {v0, v1}, LM0/r;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_1

    .line 57
    .line 58
    iget-object v0, p0, LV0/i;->p:LV0/e;

    .line 59
    .line 60
    iget-object v1, p1, LV0/i;->p:LV0/e;

    .line 61
    .line 62
    invoke-static {v0, v1}, LM0/r;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_1

    .line 67
    .line 68
    iget-object v0, p0, LV0/i;->q:LV0/a;

    .line 69
    .line 70
    iget-object v1, p1, LV0/i;->q:LV0/a;

    .line 71
    .line 72
    invoke-static {v0, v1}, LM0/r;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_1

    .line 77
    .line 78
    iget-object v0, p0, LV0/i;->r:Ljava/lang/String;

    .line 79
    .line 80
    iget-object p1, p1, LV0/i;->r:Ljava/lang/String;

    .line 81
    .line 82
    invoke-static {v0, p1}, LM0/r;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-eqz p1, :cond_1

    .line 87
    .line 88
    const/4 p1, 0x1

    .line 89
    return p1

    .line 90
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 91
    return p1
.end method

.method public final hashCode()I
    .locals 8

    .line 1
    iget-object v6, p0, LV0/i;->q:LV0/a;

    .line 2
    .line 3
    iget-object v7, p0, LV0/i;->r:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v0, p0, LV0/i;->k:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v1, p0, LV0/i;->l:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, p0, LV0/i;->m:Lb1/J;

    .line 10
    .line 11
    iget-object v3, p0, LV0/i;->o:LV0/c;

    .line 12
    .line 13
    iget-object v4, p0, LV0/i;->n:LV0/d;

    .line 14
    .line 15
    iget-object v5, p0, LV0/i;->p:LV0/e;

    .line 16
    .line 17
    filled-new-array/range {v0 .. v7}, [Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 1
    iget-object v0, p0, LV0/i;->m:Lb1/J;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lb1/J;->j()[B

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-static {v0}, LE2/a;->p([B)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, LV0/i;->n:LV0/d;

    .line 16
    .line 17
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v2, p0, LV0/i;->o:LV0/c;

    .line 22
    .line 23
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    iget-object v3, p0, LV0/i;->p:LV0/e;

    .line 28
    .line 29
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    iget-object v4, p0, LV0/i;->q:LV0/a;

    .line 34
    .line 35
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    new-instance v5, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v6, "PublicKeyCredential{\n id=\'"

    .line 42
    .line 43
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-object v6, p0, LV0/i;->k:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v6, "\', \n type=\'"

    .line 52
    .line 53
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget-object v6, p0, LV0/i;->l:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v6, "\', \n rawId="

    .line 62
    .line 63
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v0, ", \n registerResponse="

    .line 70
    .line 71
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v0, ", \n signResponse="

    .line 78
    .line 79
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v0, ", \n errorResponse="

    .line 86
    .line 87
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v0, ", \n extensionsClientOutputs="

    .line 94
    .line 95
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string v0, ", \n authenticatorAttachment=\'"

    .line 102
    .line 103
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    iget-object v0, p0, LV0/i;->r:Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const-string v0, "\'}"

    .line 112
    .line 113
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    sget-object p1, Lb1/Y;->b:Lb1/Y;

    .line 2
    .line 3
    iget-object p1, p1, Lb1/Y;->a:Lb1/c;

    .line 4
    .line 5
    iget-object p1, p1, Lb1/c;->k:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p1, Lb1/Z;

    .line 8
    .line 9
    sget-object p1, Lb1/a0;->a:LB1/a;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sget-object p1, Lb1/a;->b:LK/c;

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    new-instance p1, LK/c;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    .line 21
    .line 22
    .line 23
    sput-object p1, Lb1/a;->b:LK/c;

    .line 24
    .line 25
    :cond_0
    sget-object p1, Lb1/a;->a:Ljava/lang/Object;

    .line 26
    .line 27
    monitor-enter p1

    .line 28
    :try_start_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    const-string p2, "Must call PhenotypeContext.setContext() first"

    .line 32
    .line 33
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p1

    .line 37
    :catchall_0
    move-exception p2

    .line 38
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    throw p2
.end method

.class public final LW0/k;
.super LN0/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LW0/k;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final k:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LV0/l;

    .line 2
    .line 3
    const/16 v1, 0x12

    .line 4
    .line 5
    invoke-direct {v0, v1}, LV0/l;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LW0/k;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const-string v0, "responseBundle"

    .line 2
    .line 3
    invoke-static {p1, v0}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LW0/k;->k:Landroid/os/Bundle;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    const-string p2, "dest"

    .line 2
    .line 3
    invoke-static {p1, p2}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/16 p2, 0x4f45

    .line 7
    .line 8
    invoke-static {p1, p2}, LH2/h;->Q(Landroid/os/Parcel;I)I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    const/4 v0, 0x1

    .line 13
    iget-object v1, p0, LW0/k;->k:Landroid/os/Bundle;

    .line 14
    .line 15
    invoke-static {p1, v0, v1}, LH2/h;->G(Landroid/os/Parcel;ILandroid/os/Bundle;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1, p2}, LH2/h;->R(Landroid/os/Parcel;I)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

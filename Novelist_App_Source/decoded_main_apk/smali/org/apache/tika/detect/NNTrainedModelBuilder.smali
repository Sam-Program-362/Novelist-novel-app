.class public Lorg/apache/tika/detect/NNTrainedModelBuilder;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private numOfHidden:I

.field private numOfInputs:I

.field private numOfOutputs:I

.field private params:[F

.field private type:Lorg/apache/tika/mime/MediaType;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public build()Lorg/apache/tika/detect/NNTrainedModel;
    .locals 5

    .line 1
    new-instance v0, Lorg/apache/tika/detect/NNTrainedModel;

    .line 2
    .line 3
    iget v1, p0, Lorg/apache/tika/detect/NNTrainedModelBuilder;->numOfInputs:I

    .line 4
    .line 5
    iget v2, p0, Lorg/apache/tika/detect/NNTrainedModelBuilder;->numOfHidden:I

    .line 6
    .line 7
    iget v3, p0, Lorg/apache/tika/detect/NNTrainedModelBuilder;->numOfOutputs:I

    .line 8
    .line 9
    iget-object v4, p0, Lorg/apache/tika/detect/NNTrainedModelBuilder;->params:[F

    .line 10
    .line 11
    invoke-direct {v0, v1, v2, v3, v4}, Lorg/apache/tika/detect/NNTrainedModel;-><init>(III[F)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public getNumOfHidden()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/tika/detect/NNTrainedModelBuilder;->numOfHidden:I

    .line 2
    .line 3
    return v0
.end method

.method public getNumOfInputs()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/tika/detect/NNTrainedModelBuilder;->numOfInputs:I

    .line 2
    .line 3
    return v0
.end method

.method public getNumOfOutputs()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/tika/detect/NNTrainedModelBuilder;->numOfOutputs:I

    .line 2
    .line 3
    return v0
.end method

.method public getParams()[F
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/detect/NNTrainedModelBuilder;->params:[F

    .line 2
    .line 3
    return-object v0
.end method

.method public getType()Lorg/apache/tika/mime/MediaType;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/detect/NNTrainedModelBuilder;->type:Lorg/apache/tika/mime/MediaType;

    .line 2
    .line 3
    return-object v0
.end method

.method public setNumOfHidden(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/apache/tika/detect/NNTrainedModelBuilder;->numOfHidden:I

    .line 2
    .line 3
    return-void
.end method

.method public setNumOfInputs(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/apache/tika/detect/NNTrainedModelBuilder;->numOfInputs:I

    .line 2
    .line 3
    return-void
.end method

.method public setNumOfOutputs(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/apache/tika/detect/NNTrainedModelBuilder;->numOfOutputs:I

    .line 2
    .line 3
    return-void
.end method

.method public setParams([F)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/tika/detect/NNTrainedModelBuilder;->params:[F

    .line 2
    .line 3
    return-void
.end method

.method public setType(Lorg/apache/tika/mime/MediaType;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/tika/detect/NNTrainedModelBuilder;->type:Lorg/apache/tika/mime/MediaType;

    .line 2
    .line 3
    return-void
.end method

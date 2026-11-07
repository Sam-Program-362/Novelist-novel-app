package org.apache.tika.detect;

import org.apache.tika.mime.MediaType;

/* JADX INFO: loaded from: classes.dex */
public class NNTrainedModelBuilder {
    private int numOfHidden;
    private int numOfInputs;
    private int numOfOutputs;
    private float[] params;
    private MediaType type;

    public NNTrainedModel build() {
        return new NNTrainedModel(this.numOfInputs, this.numOfHidden, this.numOfOutputs, this.params);
    }

    public int getNumOfHidden() {
        return this.numOfHidden;
    }

    public int getNumOfInputs() {
        return this.numOfInputs;
    }

    public int getNumOfOutputs() {
        return this.numOfOutputs;
    }

    public float[] getParams() {
        return this.params;
    }

    public MediaType getType() {
        return this.type;
    }

    public void setNumOfHidden(int i3) {
        this.numOfHidden = i3;
    }

    public void setNumOfInputs(int i3) {
        this.numOfInputs = i3;
    }

    public void setNumOfOutputs(int i3) {
        this.numOfOutputs = i3;
    }

    public void setParams(float[] fArr) {
        this.params = fArr;
    }

    public void setType(MediaType mediaType) {
        this.type = mediaType;
    }
}

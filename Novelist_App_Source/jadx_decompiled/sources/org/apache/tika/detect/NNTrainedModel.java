package org.apache.tika.detect;

import java.lang.reflect.Array;

/* loaded from: classes.dex */
public class NNTrainedModel extends TrainedModel {
    private final float[][] Theta1;
    private final float[][] Theta2;
    private final int numOfHidden;
    private final int numOfInputs;
    private final int numOfOutputs;

    public NNTrainedModel(int i3, int i4, int i5, float[] fArr) {
        this.numOfInputs = i3;
        this.numOfHidden = i4;
        this.numOfOutputs = i5;
        Class cls = Float.TYPE;
        this.Theta1 = (float[][]) Array.newInstance((Class<?>) cls, i4, i3 + 1);
        this.Theta2 = (float[][]) Array.newInstance((Class<?>) cls, i5, i4 + 1);
        populateThetas(fArr);
    }

    private void populateThetas(float[] fArr) {
        float[][] fArr2 = this.Theta1;
        int length = fArr2.length;
        int length2 = fArr2[0].length;
        int i3 = 0;
        for (int i4 = 0; i4 < length2; i4++) {
            for (int i5 = 0; i5 < length; i5++) {
                this.Theta1[i5][i4] = fArr[i3];
                i3++;
            }
        }
        float[][] fArr3 = this.Theta2;
        int length3 = fArr3.length;
        int length4 = fArr3[0].length;
        for (int i6 = 0; i6 < length4; i6++) {
            for (int i7 = 0; i7 < length3; i7++) {
                this.Theta2[i7][i6] = fArr[i3];
                i3++;
            }
        }
    }

    @Override // org.apache.tika.detect.TrainedModel
    public double predict(double[] dArr) {
        return 0.0d;
    }

    @Override // org.apache.tika.detect.TrainedModel
    public float predict(float[] fArr) {
        float[][] fArr2 = this.Theta1;
        int length = fArr2.length;
        int length2 = fArr2[0].length;
        float[] fArr3 = new float[length + 1];
        fArr3[0] = 1.0f;
        int i3 = 0;
        while (true) {
            double d3 = 0.0d;
            if (i3 >= length) {
                break;
            }
            for (int i4 = 0; i4 < length2; i4++) {
                d3 += this.Theta1[i3][i4] * fArr[i4];
            }
            i3++;
            fArr3[i3] = (float) (1.0d / (Math.exp(-d3) + 1.0d));
        }
        float[][] fArr4 = this.Theta2;
        int length3 = fArr4.length;
        int length4 = fArr4[0].length;
        float[] fArr5 = new float[length3];
        for (int i5 = 0; i5 < length3; i5++) {
            double d4 = 0.0d;
            for (int i6 = 0; i6 < length4; i6++) {
                d4 += this.Theta2[i5][i6] * fArr3[i6];
            }
            fArr5[i5] = (float) (1.0d / (Math.exp(-d4) + 1.0d));
        }
        return fArr5[0];
    }
}

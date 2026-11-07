package org.apache.tika.mime;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import org.apache.tika.detect.Detector;
import org.apache.tika.metadata.HttpHeaders;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;

/* JADX INFO: loaded from: classes.dex */
public class ProbabilisticMimeDetectionSelector implements Detector {
    private static final float DEFAULT_EXTENSION_TRUST = 0.8f;
    private static final float DEFAULT_MAGIC_TRUST = 0.9f;
    private static final float DEFAULT_META_TRUST = 0.8f;
    private static final long serialVersionUID = 224589862960269260L;
    private final float changeRate;
    private float extension_neg;
    private float extension_trust;
    private float magic_neg;
    private float magic_trust;
    private float meta_neg;
    private float meta_trust;
    private final MimeTypes mimeTypes;
    private float priorExtensionFileType;
    private float priorMagicFileType;
    private float priorMetaFileType;
    private final MediaType rootMediaType;
    private float threshold;

    public static class Builder {
        private float extension_neg;
        private float extension_trust;
        private float magic_neg;
        private float magic_trust;
        private float meta_neg;
        private float meta_trust;
        private float priorExtensionFileType;
        private float priorMagicFileType;
        private float priorMetaFileType;
        private float threshold;

        public ProbabilisticMimeDetectionSelector build2() {
            return new ProbabilisticMimeDetectionSelector(this);
        }

        public synchronized Builder extension_neg(float f3) {
            this.extension_neg = f3;
            return this;
        }

        public synchronized Builder extension_trust(float f3) {
            this.extension_trust = f3;
            return this;
        }

        public synchronized Builder magic_neg(float f3) {
            this.magic_neg = f3;
            return this;
        }

        public synchronized Builder magic_trust(float f3) {
            this.magic_trust = f3;
            return this;
        }

        public synchronized Builder meta_neg(float f3) {
            this.meta_neg = f3;
            return this;
        }

        public synchronized Builder meta_trust(float f3) {
            this.meta_trust = f3;
            return this;
        }

        public synchronized Builder priorExtensionFileType(float f3) {
            this.priorExtensionFileType = f3;
            return this;
        }

        public synchronized Builder priorMagicFileType(float f3) {
            this.priorMagicFileType = f3;
            return this;
        }

        public synchronized Builder priorMetaFileType(float f3) {
            this.priorMetaFileType = f3;
            return this;
        }

        public synchronized Builder threshold(float f3) {
            this.threshold = f3;
            return this;
        }
    }

    public ProbabilisticMimeDetectionSelector() {
        this(MimeTypes.getDefaultMimeTypes(), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [org.apache.tika.mime.MediaType] */
    /* JADX WARN: Type inference failed for: r14v1, types: [org.apache.tika.mime.MediaType] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2, types: [org.apache.tika.mime.MediaType] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, org.apache.tika.mime.MediaType] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v3, types: [org.apache.tika.mime.MediaTypeRegistry] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, org.apache.tika.mime.MediaType] */
    private MediaType applyProbilities(List<MimeType> list, MimeType mimeType, MimeType mimeType2) {
        ?? r4;
        ?? r5;
        List<MimeType> list2 = list;
        MimeType mimeType3 = mimeType;
        MediaType type = mimeType3 == null ? null : mimeType3.getType();
        MediaType type2 = mimeType2 != null ? mimeType2.getType() : null;
        int size = list2.size();
        float f3 = this.magic_trust;
        float f4 = this.magic_neg;
        float f5 = this.extension_trust;
        float f6 = this.extension_neg;
        float f7 = this.meta_trust;
        float f8 = this.meta_neg;
        if (type == null || type.compareTo(this.rootMediaType) == 0) {
            f5 = 1.0f;
            f6 = 1.0f;
        }
        if (type2 == null || type2.compareTo(this.rootMediaType) == 0) {
            f7 = 1.0f;
            f8 = 1.0f;
        }
        ?? r14 = this.rootMediaType;
        float f9 = -1.0f;
        if (!list2.isEmpty()) {
            int i3 = 0;
            while (i3 < size) {
                MediaType type3 = list2.get(i3).getType();
                int i4 = size;
                ?? mediaTypeRegistry = this.mimeTypes.getMediaTypeRegistry();
                float f10 = f3;
                if (type3 == null || !type3.equals(this.rootMediaType)) {
                    if (type != null) {
                        if (type.equals(type3) || mediaTypeRegistry.isSpecializationOf(type, type3)) {
                            list2.set(i3, mimeType3);
                        } else if (mediaTypeRegistry.isSpecializationOf(type3, type)) {
                            type = type3;
                        }
                    }
                    if (r4 != 0) {
                        if (r4.equals(type3) || mediaTypeRegistry.isSpecializationOf(r4, type3)) {
                            list2.set(i3, mimeType2);
                        } else if (mediaTypeRegistry.isSpecializationOf(type3, r4)) {
                            r4 = type3;
                        }
                    }
                    f3 = f10;
                    r5 = r4;
                } else {
                    r4 = type2;
                    r14 = r14;
                    f3 = 1.0f;
                    f4 = 1.0f;
                    r5 = r4;
                }
                float[] fArr = new float[3];
                float[] fArr2 = new float[3];
                float[] fArr3 = new float[3];
                ?? type4 = list2.get(i3).getType();
                if (i3 > 0) {
                    float f11 = this.changeRate;
                    f4 = (f11 + 1.0f) * f4;
                    f3 = (1.0f - f11) * f3;
                }
                if (type4 == 0 || f3 == 1.0f) {
                    fArr[0] = 0.1f;
                } else {
                    fArr2[0] = f3;
                    fArr3[0] = f4;
                    if (r5 == 0 || f7 == 1.0f) {
                        fArr2[1] = 1.0f;
                        fArr3[1] = 1.0f;
                    } else if (type4.equals(r5)) {
                        fArr2[1] = f7;
                        fArr3[1] = f8;
                    } else {
                        fArr2[1] = 1.0f - f7;
                        fArr3[1] = 1.0f - f8;
                    }
                    if (type == null || f5 == 1.0f) {
                        fArr2[2] = 1.0f;
                        fArr3[2] = 1.0f;
                    } else if (type4.equals(type)) {
                        fArr2[2] = f5;
                        fArr3[2] = f6;
                    } else {
                        fArr2[2] = 1.0f - f5;
                        fArr3[2] = 1.0f - f6;
                    }
                }
                float[] fArr4 = new float[3];
                float[] fArr5 = new float[3];
                if (mimeType2 == null || f7 == 1.0f) {
                    fArr[1] = 0.1f;
                } else {
                    fArr4[1] = f7;
                    fArr5[1] = f8;
                    if (type4 == 0 || f3 == 1.0f) {
                        fArr4[0] = 1.0f;
                        fArr5[0] = 1.0f;
                    } else if (r5.equals(type4)) {
                        fArr4[0] = f3;
                        fArr5[0] = f4;
                    } else {
                        fArr4[0] = 1.0f - f3;
                        fArr5[0] = 1.0f - f4;
                    }
                    if (type == null || f5 == 1.0f) {
                        fArr4[2] = 1.0f;
                        fArr5[2] = 1.0f;
                    } else if (r5.equals(type)) {
                        fArr4[2] = f5;
                        fArr5[2] = f6;
                    } else {
                        fArr4[2] = 1.0f - f5;
                        fArr5[2] = 1.0f - f6;
                    }
                }
                float[] fArr6 = new float[3];
                float[] fArr7 = new float[3];
                if (type == null || f5 == 1.0f) {
                    fArr[2] = 0.1f;
                } else {
                    fArr6[2] = f5;
                    fArr7[2] = f6;
                    if (type4 == 0 || f3 == 1.0f) {
                        fArr6[0] = 1.0f;
                        fArr7[0] = 1.0f;
                    } else if (type4.equals(type)) {
                        fArr6[0] = f3;
                        fArr7[0] = f4;
                    } else {
                        fArr6[0] = 1.0f - f3;
                        fArr7[0] = 1.0f - f4;
                    }
                    if (r5 == 0 || f7 == 1.0f) {
                        fArr6[1] = 1.0f;
                        fArr7[1] = 1.0f;
                    } else if (r5.equals(type)) {
                        fArr6[1] = f7;
                        fArr7[1] = f8;
                    } else {
                        fArr6[1] = 1.0f - f7;
                        fArr7[1] = 1.0f - f8;
                    }
                }
                float f12 = this.priorMagicFileType;
                float f13 = 1.0f - f12;
                if (fArr[0] == 0.0f) {
                    float f14 = f12;
                    for (int i5 = 0; i5 < 3; i5++) {
                        float f15 = fArr2[i5];
                        f14 *= f15;
                        if (f15 != 1.0f) {
                            f13 *= fArr3[i5];
                        }
                    }
                    fArr[0] = f14 / (f14 + f13);
                }
                float f16 = fArr[0];
                ?? r15 = r14;
                if (f9 < f16) {
                    f9 = f16;
                    r15 = type4;
                }
                float f17 = this.priorMetaFileType;
                float f18 = 1.0f - f17;
                if (fArr[1] == 0.0f) {
                    float f19 = f17;
                    for (int i6 = 0; i6 < 3; i6++) {
                        float f20 = fArr4[i6];
                        f19 *= f20;
                        if (f20 != 1.0f) {
                            f18 *= fArr5[i6];
                        }
                    }
                    fArr[1] = f19 / (f19 + f18);
                }
                float f21 = fArr[1];
                ?? r16 = r15;
                if (f9 < f21) {
                    f9 = f21;
                    r16 = r5;
                }
                float f22 = this.priorExtensionFileType;
                float f23 = 1.0f - f22;
                if (fArr[2] == 0.0f) {
                    float f24 = f22;
                    for (int i7 = 0; i7 < 3; i7++) {
                        float f25 = fArr6[i7];
                        f24 *= f25;
                        if (f25 != 1.0f) {
                            f23 *= fArr7[i7];
                        }
                    }
                    fArr[2] = f24 / (f24 + f23);
                }
                float f26 = fArr[2];
                if (f9 < f26) {
                    f9 = f26;
                    r16 = type;
                }
                i3++;
                list2 = list;
                mimeType3 = mimeType;
                size = i4;
                r4 = r5;
                r14 = r16;
            }
            r4 = type2;
            r14 = r14;
        }
        return f9 < this.threshold ? this.rootMediaType : r14;
    }

    private void initializeDefaultProbabilityParameters() {
        this.priorMagicFileType = 0.5f;
        this.priorExtensionFileType = 0.5f;
        this.priorMetaFileType = 0.5f;
        this.magic_trust = DEFAULT_MAGIC_TRUST;
        this.extension_trust = 0.8f;
        this.meta_trust = 0.8f;
        this.magic_neg = 0.100000024f;
        this.extension_neg = 0.19999999f;
        this.meta_neg = 0.19999999f;
        this.threshold = 0.5001f;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    @Override // org.apache.tika.detect.Detector
    public MediaType detect(InputStream inputStream, Metadata metadata) throws IOException {
        MimeType mimeType;
        int iLastIndexOf;
        ArrayList arrayList = new ArrayList();
        if (inputStream != null) {
            inputStream.mark(this.mimeTypes.getMinLength());
            try {
                arrayList.addAll(this.mimeTypes.getMimeType(this.mimeTypes.readMagicHeader(inputStream)));
                inputStream.reset();
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        String strSubstring = metadata.get(TikaCoreProperties.RESOURCE_NAME_KEY);
        MimeType mimeTypeForName = null;
        if (strSubstring != null) {
            try {
                String path = new URI(strSubstring).getPath();
                strSubstring = (path == null || (iLastIndexOf = path.lastIndexOf(47) + 1) >= path.length()) ? null : path.substring(iLastIndexOf);
            } catch (URISyntaxException unused) {
            }
            if (strSubstring != null) {
                mimeType = this.mimeTypes.getMimeType(strSubstring);
            } else {
                mimeType = null;
            }
        } else {
            mimeType = null;
        }
        String str = metadata.get(HttpHeaders.CONTENT_TYPE);
        if (str != null) {
            try {
                mimeTypeForName = this.mimeTypes.forName(str);
            } catch (MimeTypeException unused2) {
            }
        }
        return applyProbilities(arrayList, mimeType, mimeTypeForName);
    }

    public MediaTypeRegistry getMediaTypeRegistry() {
        return this.mimeTypes.getMediaTypeRegistry();
    }

    public ProbabilisticMimeDetectionSelector(Builder builder) {
        this(MimeTypes.getDefaultMimeTypes(), builder);
    }

    public ProbabilisticMimeDetectionSelector(MimeTypes mimeTypes) {
        this(mimeTypes, null);
    }

    public ProbabilisticMimeDetectionSelector(MimeTypes mimeTypes, Builder builder) {
        this.mimeTypes = mimeTypes;
        this.rootMediaType = MediaType.OCTET_STREAM;
        initializeDefaultProbabilityParameters();
        this.changeRate = 0.1f;
        if (builder != null) {
            this.priorMagicFileType = builder.priorMagicFileType == 0.0f ? this.priorMagicFileType : builder.priorMagicFileType;
            this.priorExtensionFileType = builder.priorExtensionFileType == 0.0f ? this.priorExtensionFileType : builder.priorExtensionFileType;
            this.priorMetaFileType = builder.priorMetaFileType == 0.0f ? this.priorMetaFileType : builder.priorMetaFileType;
            this.magic_trust = builder.magic_trust == 0.0f ? this.magic_trust : builder.extension_neg;
            this.extension_trust = builder.extension_trust == 0.0f ? this.extension_trust : builder.extension_trust;
            this.meta_trust = builder.meta_trust == 0.0f ? this.meta_trust : builder.meta_trust;
            this.magic_neg = builder.magic_neg == 0.0f ? this.magic_neg : builder.magic_neg;
            this.extension_neg = builder.extension_neg == 0.0f ? this.extension_neg : builder.extension_neg;
            this.meta_neg = builder.meta_neg == 0.0f ? this.meta_neg : builder.meta_neg;
            this.threshold = builder.threshold == 0.0f ? this.threshold : builder.threshold;
        }
    }
}

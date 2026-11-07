package org.apache.tika.mime;

import java.util.List;
import org.apache.tika.detect.Detector;

/* loaded from: classes.dex */
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

    private MediaType applyProbilities(List<MimeType> list, MimeType mimeType, MimeType mimeType2) {
        MediaType mediaType;
        float[] fArr;
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
        MediaType mediaType2 = this.rootMediaType;
        float f9 = -1.0f;
        if (!list2.isEmpty()) {
            int i3 = 0;
            MediaType mediaType3 = type2;
            while (i3 < size) {
                MediaType type3 = list2.get(i3).getType();
                int i4 = size;
                MediaTypeRegistry mediaTypeRegistry = this.mimeTypes.getMediaTypeRegistry();
                float f10 = f3;
                if (type3 == null || !type3.equals(this.rootMediaType)) {
                    if (type != null) {
                        if (type.equals(type3) || mediaTypeRegistry.isSpecializationOf(type, type3)) {
                            list2.set(i3, mimeType3);
                        } else if (mediaTypeRegistry.isSpecializationOf(type3, type)) {
                            type = type3;
                        }
                    }
                    if (mediaType3 != null) {
                        if (mediaType3.equals(type3) || mediaTypeRegistry.isSpecializationOf(mediaType3, type3)) {
                            list2.set(i3, mimeType2);
                        } else if (mediaTypeRegistry.isSpecializationOf(type3, mediaType3)) {
                            mediaType3 = type3;
                        }
                    }
                    f3 = f10;
                    mediaType = mediaType3;
                } else {
                    f3 = 1.0f;
                    f4 = 1.0f;
                    mediaType = mediaType3;
                }
                float[] fArr2 = new float[3];
                float[] fArr3 = new float[3];
                float[] fArr4 = new float[3];
                MediaType type4 = list2.get(i3).getType();
                if (i3 > 0) {
                    float f11 = this.changeRate;
                    f4 = (f11 + 1.0f) * f4;
                    f3 = (1.0f - f11) * f3;
                }
                if (type4 == null || f3 == 1.0f) {
                    fArr2[0] = 0.1f;
                } else {
                    fArr3[0] = f3;
                    fArr4[0] = f4;
                    if (mediaType == null || f7 == 1.0f) {
                        fArr3[1] = 1.0f;
                        fArr4[1] = 1.0f;
                    } else if (type4.equals(mediaType)) {
                        fArr3[1] = f7;
                        fArr4[1] = f8;
                    } else {
                        fArr3[1] = 1.0f - f7;
                        fArr4[1] = 1.0f - f8;
                    }
                    if (type == null || f5 == 1.0f) {
                        fArr3[2] = 1.0f;
                        fArr4[2] = 1.0f;
                    } else if (type4.equals(type)) {
                        fArr3[2] = f5;
                        fArr4[2] = f6;
                    } else {
                        fArr3[2] = 1.0f - f5;
                        fArr4[2] = 1.0f - f6;
                    }
                }
                float[] fArr5 = new float[3];
                float[] fArr6 = new float[3];
                if (mimeType2 == null || f7 == 1.0f) {
                    fArr2[1] = 0.1f;
                } else {
                    fArr5[1] = f7;
                    fArr6[1] = f8;
                    if (type4 == null || f3 == 1.0f) {
                        fArr5[0] = 1.0f;
                        fArr6[0] = 1.0f;
                    } else if (mediaType.equals(type4)) {
                        fArr5[0] = f3;
                        fArr6[0] = f4;
                    } else {
                        fArr5[0] = 1.0f - f3;
                        fArr6[0] = 1.0f - f4;
                    }
                    if (type == null || f5 == 1.0f) {
                        fArr5[2] = 1.0f;
                        fArr6[2] = 1.0f;
                    } else if (mediaType.equals(type)) {
                        fArr5[2] = f5;
                        fArr6[2] = f6;
                    } else {
                        fArr5[2] = 1.0f - f5;
                        fArr6[2] = 1.0f - f6;
                    }
                }
                float[] fArr7 = new float[3];
                float[] fArr8 = new float[3];
                if (type == null || f5 == 1.0f) {
                    fArr2[2] = 0.1f;
                } else {
                    fArr7[2] = f5;
                    fArr8[2] = f6;
                    if (type4 == null || f3 == 1.0f) {
                        fArr7[0] = 1.0f;
                        fArr8[0] = 1.0f;
                    } else if (type4.equals(type)) {
                        fArr7[0] = f3;
                        fArr8[0] = f4;
                    } else {
                        fArr7[0] = 1.0f - f3;
                        fArr8[0] = 1.0f - f4;
                    }
                    if (mediaType == null || f7 == 1.0f) {
                        fArr7[1] = 1.0f;
                        fArr8[1] = 1.0f;
                    } else if (mediaType.equals(type)) {
                        fArr7[1] = f7;
                        fArr8[1] = f8;
                    } else {
                        fArr7[1] = 1.0f - f7;
                        fArr8[1] = 1.0f - f8;
                    }
                }
                float f12 = this.priorMagicFileType;
                float f13 = 1.0f - f12;
                if (fArr2[0] == 0.0f) {
                    float f14 = f12;
                    fArr = fArr8;
                    for (int i5 = 0; i5 < 3; i5++) {
                        float f15 = fArr3[i5];
                        f14 *= f15;
                        if (f15 != 1.0f) {
                            f13 *= fArr4[i5];
                        }
                    }
                    fArr2[0] = f14 / (f14 + f13);
                } else {
                    fArr = fArr8;
                }
                float f16 = fArr2[0];
                if (f9 < f16) {
                    f9 = f16;
                    mediaType2 = type4;
                }
                float f17 = this.priorMetaFileType;
                float f18 = 1.0f - f17;
                if (fArr2[1] == 0.0f) {
                    float f19 = f17;
                    for (int i6 = 0; i6 < 3; i6++) {
                        float f20 = fArr5[i6];
                        f19 *= f20;
                        if (f20 != 1.0f) {
                            f18 *= fArr6[i6];
                        }
                    }
                    fArr2[1] = f19 / (f19 + f18);
                }
                float f21 = fArr2[1];
                if (f9 < f21) {
                    f9 = f21;
                    mediaType2 = mediaType;
                }
                float f22 = this.priorExtensionFileType;
                float f23 = 1.0f - f22;
                if (fArr2[2] == 0.0f) {
                    float f24 = f22;
                    for (int i7 = 0; i7 < 3; i7++) {
                        float f25 = fArr7[i7];
                        f24 *= f25;
                        if (f25 != 1.0f) {
                            f23 *= fArr[i7];
                        }
                    }
                    fArr2[2] = f24 / (f24 + f23);
                }
                float f26 = fArr2[2];
                if (f9 < f26) {
                    f9 = f26;
                    mediaType2 = type;
                }
                i3++;
                list2 = list;
                mimeType3 = mimeType;
                size = i4;
                mediaType3 = mediaType;
            }
        }
        return f9 < this.threshold ? this.rootMediaType : mediaType2;
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

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // org.apache.tika.detect.Detector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.apache.tika.mime.MediaType detect(java.io.InputStream r6, org.apache.tika.metadata.Metadata r7) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r6 == 0) goto L28
            org.apache.tika.mime.MimeTypes r1 = r5.mimeTypes
            int r1 = r1.getMinLength()
            r6.mark(r1)
            org.apache.tika.mime.MimeTypes r1 = r5.mimeTypes     // Catch: java.lang.Throwable -> L23
            byte[] r1 = r1.readMagicHeader(r6)     // Catch: java.lang.Throwable -> L23
            org.apache.tika.mime.MimeTypes r2 = r5.mimeTypes     // Catch: java.lang.Throwable -> L23
            java.util.List r1 = r2.getMimeType(r1)     // Catch: java.lang.Throwable -> L23
            r0.addAll(r1)     // Catch: java.lang.Throwable -> L23
            r6.reset()
            goto L28
        L23:
            r7 = move-exception
            r6.reset()
            throw r7
        L28:
            java.lang.String r6 = "resourceName"
            java.lang.String r6 = r7.get(r6)
            r1 = 0
            if (r6 == 0) goto L59
            java.net.URI r2 = new java.net.URI     // Catch: java.net.URISyntaxException -> L50
            r2.<init>(r6)     // Catch: java.net.URISyntaxException -> L50
            java.lang.String r2 = r2.getPath()     // Catch: java.net.URISyntaxException -> L50
            if (r2 == 0) goto L4f
            r3 = 47
            int r3 = r2.lastIndexOf(r3)     // Catch: java.net.URISyntaxException -> L50
            int r3 = r3 + 1
            int r4 = r2.length()     // Catch: java.net.URISyntaxException -> L50
            if (r3 >= r4) goto L4f
            java.lang.String r6 = r2.substring(r3)     // Catch: java.net.URISyntaxException -> L50
            goto L50
        L4f:
            r6 = r1
        L50:
            if (r6 == 0) goto L59
            org.apache.tika.mime.MimeTypes r2 = r5.mimeTypes
            org.apache.tika.mime.MimeType r6 = r2.getMimeType(r6)
            goto L5a
        L59:
            r6 = r1
        L5a:
            java.lang.String r2 = "Content-Type"
            java.lang.String r7 = r7.get(r2)
            if (r7 == 0) goto L68
            org.apache.tika.mime.MimeTypes r2 = r5.mimeTypes     // Catch: org.apache.tika.mime.MimeTypeException -> L68
            org.apache.tika.mime.MimeType r1 = r2.forName(r7)     // Catch: org.apache.tika.mime.MimeTypeException -> L68
        L68:
            org.apache.tika.mime.MediaType r6 = r5.applyProbilities(r0, r6, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.mime.ProbabilisticMimeDetectionSelector.detect(java.io.InputStream, org.apache.tika.metadata.Metadata):org.apache.tika.mime.MediaType");
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

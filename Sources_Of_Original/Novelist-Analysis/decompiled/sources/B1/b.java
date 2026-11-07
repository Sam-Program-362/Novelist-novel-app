package B1;

import D.InterfaceC0017s;
import K1.O;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.net.Uri;
import android.system.Os;
import android.system.OsConstants;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.webkit.MimeTypeMap;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.apache.tika.fork.ContentHandlerProxy;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.pipes.PipesServer;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public final class b implements C1.m, InterfaceC0017s, F2.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f81k;

    public /* synthetic */ b(int i3) {
        this.f81k = i3;
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0301  */
    /* JADX WARN: Code duplicated, block: B:110:0x0307  */
    /* JADX WARN: Code duplicated, block: B:112:0x0318  */
    /* JADX WARN: Code duplicated, block: B:128:0x0348  */
    /* JADX WARN: Code duplicated, block: B:143:0x03d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:144:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:145:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:148:0x03f7 A[LOOP:3: B:146:0x03f4->B:148:0x03f7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:151:0x0416 A[LOOP:4: B:150:0x0414->B:151:0x0416, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:153:0x0437  */
    /* JADX WARN: Code duplicated, block: B:156:0x0447 A[LOOP:5: B:154:0x0444->B:156:0x0447, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:159:0x049c A[LOOP:6: B:158:0x049a->B:159:0x049c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:162:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:165:0x04d8 A[LOOP:7: B:163:0x04d5->B:165:0x04d8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:168:0x04f7 A[LOOP:8: B:167:0x04f5->B:168:0x04f7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:170:0x050e  */
    /* JADX WARN: Code duplicated, block: B:173:0x0524 A[LOOP:9: B:171:0x0521->B:173:0x0524, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:175:0x0561  */
    /* JADX WARN: Code duplicated, block: B:178:0x0575 A[LOOP:10: B:176:0x0572->B:178:0x0575, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:180:0x058c  */
    /* JADX WARN: Code duplicated, block: B:183:0x05a0 A[LOOP:11: B:181:0x059d->B:183:0x05a0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:185:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:186:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:278:0x070b A[Catch: all -> 0x0714, Exception -> 0x0719, TryCatch #27 {Exception -> 0x0719, all -> 0x0714, blocks: (B:276:0x0707, B:278:0x070b, B:286:0x072d, B:285:0x071c), top: B:345:0x0707 }] */
    /* JADX WARN: Code duplicated, block: B:285:0x071c A[Catch: all -> 0x0714, Exception -> 0x0719, TryCatch #27 {Exception -> 0x0719, all -> 0x0714, blocks: (B:276:0x0707, B:278:0x070b, B:286:0x072d, B:285:0x071c), top: B:345:0x0707 }] */
    /* JADX WARN: Code duplicated, block: B:305:0x0774  */
    /* JADX WARN: Code duplicated, block: B:95:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:98:0x02df  */
    /* JADX WARN: Instruction removed from duplicated block: B:144:0x03d7, please report this as an issue */
    public static void c(Z.h hVar, Z.h hVar2) throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        FileOutputStream fileOutputStream2;
        FileInputStream fileInputStream3;
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2;
        boolean z3;
        boolean z4;
        FileInputStream fileInputStream4;
        FileOutputStream fileOutputStream3;
        FileOutputStream fileOutputStream4;
        String str;
        int i3;
        Z.e eVar;
        int i4;
        int i5;
        Pair pairO;
        int i6;
        String[] strArrSplit;
        int[] iArr;
        int i7;
        String[] strArrSplit2;
        long[] jArr;
        int i8;
        String str2;
        int i9;
        String[] strArrSplit3;
        Z.f[] fVarArr;
        int i10;
        String[] strArrSplit4;
        int length;
        int[] iArr2;
        int i11;
        ByteBuffer byteBufferWrap;
        int i12;
        int i13;
        String[] strArrSplit5;
        int length2;
        Z.f[] fVarArr2;
        int i14;
        Z.f[] fVarArr3;
        ByteBuffer byteBufferWrap2;
        int i15;
        String[] strArrSplit6;
        int length3;
        double[] dArr;
        int i16;
        ByteBuffer byteBufferWrap3;
        int i17;
        String str3;
        Z.f fVar;
        for (String str4 : Arrays.asList("ImageDescription", "Make", "Model", "Software", "DateTime", "Artist", "Copyright", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "ISOSpeedRatings", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ExifVersion", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "FocalLength", "MakerNote", "UserComment", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "FlashpixVersion", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "Orientation")) {
            if (hVar.b(str4) != null) {
                String strB = hVar.b(str4);
                int[] iArr3 = Z.h.f1641R;
                boolean z5 = Z.h.u;
                HashMap[] mapArr = hVar2.f1661e;
                String str5 = "ExifInterface";
                if ("ISOSpeedRatings".equals(str4)) {
                    if (z5) {
                        Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
                    }
                    str4 = "PhotographicSensitivity";
                }
                if (strB != null) {
                    String str6 = "Invalid value for ";
                    if (!Z.h.f1646Y.contains(str4) || strB.contains("/")) {
                        str = "/";
                        if (str4.equals("GPSTimeStamp")) {
                            Matcher matcher = Z.h.f1651d0.matcher(strB);
                            if (matcher.find()) {
                                strB = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
                            } else {
                                Log.w("ExifInterface", "Invalid value for " + str4 + " : " + strB);
                            }
                        } else if ("DateTime".equals(str4) || "DateTimeOriginal".equals(str4) || "DateTimeDigitized".equals(str4)) {
                            boolean zFind = Z.h.f1652e0.matcher(strB).find();
                            boolean zFind2 = Z.h.f1653f0.matcher(strB).find();
                            if (strB.length() != 19 || (!zFind && !zFind2)) {
                                Log.w("ExifInterface", "Invalid value for " + str4 + " : " + strB);
                            } else if (zFind2) {
                                strB = strB.replaceAll("-", TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
                            }
                        }
                    } else {
                        try {
                            double d3 = Double.parseDouble(strB);
                            str = "/";
                            long j3 = 1;
                            if (d3 >= 9.223372036854776E18d || d3 <= -9.223372036854776E18d) {
                                fVar = new Z.f(d3 > 0.0d ? Long.MAX_VALUE : Long.MIN_VALUE, 1L);
                            } else {
                                double dAbs = Math.abs(d3);
                                long j4 = 1;
                                double d4 = dAbs;
                                long j5 = 0;
                                long j6 = 0;
                                while (true) {
                                    double d5 = d4 % 1.0d;
                                    long j7 = (long) (d4 - d5);
                                    str3 = str6;
                                    long j8 = (j7 * j3) + j5;
                                    long j9 = (j7 * j6) + j4;
                                    d4 = 1.0d / d5;
                                    j5 = j3;
                                    try {
                                        if (Math.abs(dAbs - (j8 / j9)) <= 1.0E-8d * dAbs) {
                                            if (d3 < 0.0d) {
                                                j8 = -j8;
                                            }
                                            fVar = new Z.f(j8, j9);
                                        } else {
                                            j3 = j8;
                                            j4 = j6;
                                            str6 = str3;
                                            j6 = j9;
                                        }
                                    } catch (NumberFormatException unused) {
                                        Log.w("ExifInterface", str3 + str4 + " : " + strB);
                                    }
                                }
                            }
                            strB = fVar.toString();
                        } catch (NumberFormatException unused2) {
                            str3 = "Invalid value for ";
                        }
                    }
                } else {
                    str = "/";
                }
                char c3 = '\f';
                int i18 = 9;
                if ("Xmp".equals(str4)) {
                    boolean z6 = mapArr[0].containsKey("Xmp") || mapArr[5].containsKey("Xmp");
                    int i19 = hVar2.f1659c;
                    char c4 = i19 != 4 ? (i19 == 9 || i19 == 15 || i19 == 12 || i19 == 13) ? (char) 2 : (char) 1 : (char) 3;
                    if ((c4 != 2 || (hVar2.f1674s == null && z6)) && (c4 != 3 || z6)) {
                        i3 = 0;
                        while (i3 < Z.h.f1643U.length) {
                            if (i3 == 4) {
                                i4 = eVar.f1621d;
                                i5 = eVar.f1620c;
                                if (strB != null) {
                                    pairO = Z.h.o(strB);
                                    i6 = i18;
                                    if (i5 != ((Integer) pairO.first).intValue()) {
                                        i4 = i5;
                                        switch (i4) {
                                            case 1:
                                                i3 = i3;
                                                str5 = str5;
                                                mapArr[i3].put(str4, Z.d.a(strB));
                                                break;
                                            case 2:
                                            case 7:
                                                i3 = i3;
                                                str5 = str5;
                                                mapArr[i3].put(str4, Z.d.b(strB));
                                                break;
                                            case 3:
                                                i3 = i3;
                                                str5 = str5;
                                                strArrSplit = strB.split(",", -1);
                                                iArr = new int[strArrSplit.length];
                                                for (i7 = 0; i7 < strArrSplit.length; i7++) {
                                                    iArr[i7] = Integer.parseInt(strArrSplit[i7]);
                                                }
                                                mapArr[i3].put(str4, Z.d.g(iArr, hVar2.f1663g));
                                                break;
                                            case 4:
                                                i3 = i3;
                                                str5 = str5;
                                                strArrSplit2 = strB.split(",", -1);
                                                jArr = new long[strArrSplit2.length];
                                                for (i8 = 0; i8 < strArrSplit2.length; i8++) {
                                                    jArr[i8] = Long.parseLong(strArrSplit2[i8]);
                                                }
                                                mapArr[i3].put(str4, Z.d.d(jArr, hVar2.f1663g));
                                                break;
                                            case 5:
                                                i3 = i3;
                                                str5 = str5;
                                                str2 = str;
                                                i9 = -1;
                                                strArrSplit3 = strB.split(",", -1);
                                                fVarArr = new Z.f[strArrSplit3.length];
                                                i10 = 0;
                                                while (i10 < strArrSplit3.length) {
                                                    String[] strArrSplit7 = strArrSplit3[i10].split(str2, i9);
                                                    int i20 = i10;
                                                    fVarArr[i20] = new Z.f((long) Double.parseDouble(strArrSplit7[0]), (long) Double.parseDouble(strArrSplit7[1]));
                                                    i10 = i20 + 1;
                                                    str2 = str2;
                                                    i9 = -1;
                                                }
                                                str = str2;
                                                mapArr[i3].put(str4, Z.d.e(fVarArr, hVar2.f1663g));
                                                break;
                                            case 6:
                                            case 8:
                                            case 11:
                                            default:
                                                if (z5) {
                                                    Log.d(str5, "Data format isn't one of expected formats: " + i4);
                                                }
                                                break;
                                            case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                                                i3 = i3;
                                                strArrSplit4 = strB.split(",", -1);
                                                length = strArrSplit4.length;
                                                iArr2 = new int[length];
                                                for (i11 = 0; i11 < strArrSplit4.length; i11++) {
                                                    iArr2[i11] = Integer.parseInt(strArrSplit4[i11]);
                                                }
                                                HashMap map = mapArr[i3];
                                                ByteOrder byteOrder = hVar2.f1663g;
                                                byteBufferWrap = ByteBuffer.wrap(new byte[iArr3[i6] * length]);
                                                byteBufferWrap.order(byteOrder);
                                                for (i12 = 0; i12 < length; i12++) {
                                                    byteBufferWrap.putInt(iArr2[i12]);
                                                }
                                                map.put(str4, new Z.d(byteBufferWrap.array(), i6, length));
                                                str = str;
                                                break;
                                            case 10:
                                                i13 = -1;
                                                strArrSplit5 = strB.split(",", -1);
                                                length2 = strArrSplit5.length;
                                                fVarArr2 = new Z.f[length2];
                                                i14 = 0;
                                                while (i14 < strArrSplit5.length) {
                                                    String[] strArrSplit8 = strArrSplit5[i14].split(str, i13);
                                                    int i21 = i14;
                                                    Z.f[] fVarArr4 = fVarArr2;
                                                    fVarArr4[i21] = new Z.f((long) Double.parseDouble(strArrSplit8[0]), (long) Double.parseDouble(strArrSplit8[1]));
                                                    i14 = i21 + 1;
                                                    strArrSplit5 = strArrSplit5;
                                                    fVarArr2 = fVarArr4;
                                                    i3 = i3;
                                                    i13 = -1;
                                                }
                                                i3 = i3;
                                                fVarArr3 = fVarArr2;
                                                HashMap map2 = mapArr[i3];
                                                ByteOrder byteOrder2 = hVar2.f1663g;
                                                byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr3[10] * length2]);
                                                byteBufferWrap2.order(byteOrder2);
                                                i15 = 0;
                                                while (i15 < length2) {
                                                    Z.f fVar2 = fVarArr3[i15];
                                                    byteBufferWrap2.putInt((int) fVar2.f1622a);
                                                    byteBufferWrap2.putInt((int) fVar2.f1623b);
                                                    i15++;
                                                    length2 = length2;
                                                }
                                                map2.put(str4, new Z.d(byteBufferWrap2.array(), 10, length2));
                                                str = str;
                                                break;
                                            case 12:
                                                strArrSplit6 = strB.split(",", -1);
                                                length3 = strArrSplit6.length;
                                                dArr = new double[length3];
                                                for (i16 = 0; i16 < strArrSplit6.length; i16++) {
                                                    dArr[i16] = Double.parseDouble(strArrSplit6[i16]);
                                                }
                                                HashMap map3 = mapArr[i3];
                                                ByteOrder byteOrder3 = hVar2.f1663g;
                                                byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr3[c3] * length3]);
                                                byteBufferWrap3.order(byteOrder3);
                                                i17 = 0;
                                                while (i17 < length3) {
                                                    double[] dArr2 = dArr;
                                                    byteBufferWrap3.putDouble(dArr2[i17]);
                                                    i17++;
                                                    str5 = str5;
                                                    dArr = dArr2;
                                                }
                                                str5 = str5;
                                                map3.put(str4, new Z.d(byteBufferWrap3.array(), c3, length3));
                                                break;
                                        }
                                    } else {
                                        i4 = i5;
                                        switch (i4) {
                                            case 1:
                                                i3 = i3;
                                                str5 = str5;
                                                mapArr[i3].put(str4, Z.d.a(strB));
                                                break;
                                            case 2:
                                            case 7:
                                                i3 = i3;
                                                str5 = str5;
                                                mapArr[i3].put(str4, Z.d.b(strB));
                                                break;
                                            case 3:
                                                i3 = i3;
                                                str5 = str5;
                                                strArrSplit = strB.split(",", -1);
                                                iArr = new int[strArrSplit.length];
                                                while (i7 < strArrSplit.length) {
                                                    iArr[i7] = Integer.parseInt(strArrSplit[i7]);
                                                }
                                                mapArr[i3].put(str4, Z.d.g(iArr, hVar2.f1663g));
                                                break;
                                            case 4:
                                                i3 = i3;
                                                str5 = str5;
                                                strArrSplit2 = strB.split(",", -1);
                                                jArr = new long[strArrSplit2.length];
                                                while (i8 < strArrSplit2.length) {
                                                    jArr[i8] = Long.parseLong(strArrSplit2[i8]);
                                                }
                                                mapArr[i3].put(str4, Z.d.d(jArr, hVar2.f1663g));
                                                break;
                                            case 5:
                                                i3 = i3;
                                                str5 = str5;
                                                str2 = str;
                                                i9 = -1;
                                                strArrSplit3 = strB.split(",", -1);
                                                fVarArr = new Z.f[strArrSplit3.length];
                                                i10 = 0;
                                                while (i10 < strArrSplit3.length) {
                                                    String[] strArrSplit9 = strArrSplit3[i10].split(str2, i9);
                                                    int i22 = i10;
                                                    fVarArr[i22] = new Z.f((long) Double.parseDouble(strArrSplit9[0]), (long) Double.parseDouble(strArrSplit9[1]));
                                                    i10 = i22 + 1;
                                                    str2 = str2;
                                                    i9 = -1;
                                                }
                                                str = str2;
                                                mapArr[i3].put(str4, Z.d.e(fVarArr, hVar2.f1663g));
                                                break;
                                            case 6:
                                            case 8:
                                            case 11:
                                            default:
                                                if (z5) {
                                                    Log.d(str5, "Data format isn't one of expected formats: " + i4);
                                                }
                                                break;
                                            case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                                                i3 = i3;
                                                strArrSplit4 = strB.split(",", -1);
                                                length = strArrSplit4.length;
                                                iArr2 = new int[length];
                                                while (i11 < strArrSplit4.length) {
                                                    iArr2[i11] = Integer.parseInt(strArrSplit4[i11]);
                                                }
                                                HashMap map4 = mapArr[i3];
                                                ByteOrder byteOrder4 = hVar2.f1663g;
                                                byteBufferWrap = ByteBuffer.wrap(new byte[iArr3[i6] * length]);
                                                byteBufferWrap.order(byteOrder4);
                                                while (i12 < length) {
                                                    byteBufferWrap.putInt(iArr2[i12]);
                                                }
                                                map4.put(str4, new Z.d(byteBufferWrap.array(), i6, length));
                                                str = str;
                                                break;
                                            case 10:
                                                i13 = -1;
                                                strArrSplit5 = strB.split(",", -1);
                                                length2 = strArrSplit5.length;
                                                fVarArr2 = new Z.f[length2];
                                                i14 = 0;
                                                while (i14 < strArrSplit5.length) {
                                                    String[] strArrSplit10 = strArrSplit5[i14].split(str, i13);
                                                    int i23 = i14;
                                                    Z.f[] fVarArr5 = fVarArr2;
                                                    fVarArr5[i23] = new Z.f((long) Double.parseDouble(strArrSplit10[0]), (long) Double.parseDouble(strArrSplit10[1]));
                                                    i14 = i23 + 1;
                                                    strArrSplit5 = strArrSplit5;
                                                    fVarArr2 = fVarArr5;
                                                    i3 = i3;
                                                    i13 = -1;
                                                }
                                                i3 = i3;
                                                fVarArr3 = fVarArr2;
                                                HashMap map5 = mapArr[i3];
                                                ByteOrder byteOrder5 = hVar2.f1663g;
                                                byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr3[10] * length2]);
                                                byteBufferWrap2.order(byteOrder5);
                                                i15 = 0;
                                                while (i15 < length2) {
                                                    Z.f fVar3 = fVarArr3[i15];
                                                    byteBufferWrap2.putInt((int) fVar3.f1622a);
                                                    byteBufferWrap2.putInt((int) fVar3.f1623b);
                                                    i15++;
                                                    length2 = length2;
                                                }
                                                map5.put(str4, new Z.d(byteBufferWrap2.array(), 10, length2));
                                                str = str;
                                                break;
                                            case 12:
                                                strArrSplit6 = strB.split(",", -1);
                                                length3 = strArrSplit6.length;
                                                dArr = new double[length3];
                                                while (i16 < strArrSplit6.length) {
                                                    dArr[i16] = Double.parseDouble(strArrSplit6[i16]);
                                                }
                                                HashMap map6 = mapArr[i3];
                                                ByteOrder byteOrder6 = hVar2.f1663g;
                                                byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr3[c3] * length3]);
                                                byteBufferWrap3.order(byteOrder6);
                                                i17 = 0;
                                                while (i17 < length3) {
                                                    double[] dArr3 = dArr;
                                                    byteBufferWrap3.putDouble(dArr3[i17]);
                                                    i17++;
                                                    str5 = str5;
                                                    dArr = dArr3;
                                                }
                                                str5 = str5;
                                                map6.put(str4, new Z.d(byteBufferWrap3.array(), c3, length3));
                                                break;
                                        }
                                    }
                                } else {
                                    mapArr[i3].remove(str4);
                                }
                                str5 = str5;
                            } else {
                                i4 = eVar.f1621d;
                                i5 = eVar.f1620c;
                                if (strB != null) {
                                    pairO = Z.h.o(strB);
                                    i6 = i18;
                                    if (i5 != ((Integer) pairO.first).intValue()) {
                                        i4 = i5;
                                        switch (i4) {
                                            case 1:
                                                i3 = i3;
                                                str5 = str5;
                                                mapArr[i3].put(str4, Z.d.a(strB));
                                                break;
                                            case 2:
                                            case 7:
                                                i3 = i3;
                                                str5 = str5;
                                                mapArr[i3].put(str4, Z.d.b(strB));
                                                break;
                                            case 3:
                                                i3 = i3;
                                                str5 = str5;
                                                strArrSplit = strB.split(",", -1);
                                                iArr = new int[strArrSplit.length];
                                                while (i7 < strArrSplit.length) {
                                                    iArr[i7] = Integer.parseInt(strArrSplit[i7]);
                                                }
                                                mapArr[i3].put(str4, Z.d.g(iArr, hVar2.f1663g));
                                                break;
                                            case 4:
                                                i3 = i3;
                                                str5 = str5;
                                                strArrSplit2 = strB.split(",", -1);
                                                jArr = new long[strArrSplit2.length];
                                                while (i8 < strArrSplit2.length) {
                                                    jArr[i8] = Long.parseLong(strArrSplit2[i8]);
                                                }
                                                mapArr[i3].put(str4, Z.d.d(jArr, hVar2.f1663g));
                                                break;
                                            case 5:
                                                i3 = i3;
                                                str5 = str5;
                                                str2 = str;
                                                i9 = -1;
                                                strArrSplit3 = strB.split(",", -1);
                                                fVarArr = new Z.f[strArrSplit3.length];
                                                i10 = 0;
                                                while (i10 < strArrSplit3.length) {
                                                    String[] strArrSplit11 = strArrSplit3[i10].split(str2, i9);
                                                    int i24 = i10;
                                                    fVarArr[i24] = new Z.f((long) Double.parseDouble(strArrSplit11[0]), (long) Double.parseDouble(strArrSplit11[1]));
                                                    i10 = i24 + 1;
                                                    str2 = str2;
                                                    i9 = -1;
                                                }
                                                str = str2;
                                                mapArr[i3].put(str4, Z.d.e(fVarArr, hVar2.f1663g));
                                                break;
                                            case 6:
                                            case 8:
                                            case 11:
                                            default:
                                                if (z5) {
                                                    Log.d(str5, "Data format isn't one of expected formats: " + i4);
                                                }
                                                break;
                                            case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                                                i3 = i3;
                                                strArrSplit4 = strB.split(",", -1);
                                                length = strArrSplit4.length;
                                                iArr2 = new int[length];
                                                while (i11 < strArrSplit4.length) {
                                                    iArr2[i11] = Integer.parseInt(strArrSplit4[i11]);
                                                }
                                                HashMap map7 = mapArr[i3];
                                                ByteOrder byteOrder7 = hVar2.f1663g;
                                                byteBufferWrap = ByteBuffer.wrap(new byte[iArr3[i6] * length]);
                                                byteBufferWrap.order(byteOrder7);
                                                while (i12 < length) {
                                                    byteBufferWrap.putInt(iArr2[i12]);
                                                }
                                                map7.put(str4, new Z.d(byteBufferWrap.array(), i6, length));
                                                str = str;
                                                break;
                                            case 10:
                                                i13 = -1;
                                                strArrSplit5 = strB.split(",", -1);
                                                length2 = strArrSplit5.length;
                                                fVarArr2 = new Z.f[length2];
                                                i14 = 0;
                                                while (i14 < strArrSplit5.length) {
                                                    String[] strArrSplit12 = strArrSplit5[i14].split(str, i13);
                                                    int i25 = i14;
                                                    Z.f[] fVarArr6 = fVarArr2;
                                                    fVarArr6[i25] = new Z.f((long) Double.parseDouble(strArrSplit12[0]), (long) Double.parseDouble(strArrSplit12[1]));
                                                    i14 = i25 + 1;
                                                    strArrSplit5 = strArrSplit5;
                                                    fVarArr2 = fVarArr6;
                                                    i3 = i3;
                                                    i13 = -1;
                                                }
                                                i3 = i3;
                                                fVarArr3 = fVarArr2;
                                                HashMap map8 = mapArr[i3];
                                                ByteOrder byteOrder8 = hVar2.f1663g;
                                                byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr3[10] * length2]);
                                                byteBufferWrap2.order(byteOrder8);
                                                i15 = 0;
                                                while (i15 < length2) {
                                                    Z.f fVar4 = fVarArr3[i15];
                                                    byteBufferWrap2.putInt((int) fVar4.f1622a);
                                                    byteBufferWrap2.putInt((int) fVar4.f1623b);
                                                    i15++;
                                                    length2 = length2;
                                                }
                                                map8.put(str4, new Z.d(byteBufferWrap2.array(), 10, length2));
                                                str = str;
                                                break;
                                            case 12:
                                                strArrSplit6 = strB.split(",", -1);
                                                length3 = strArrSplit6.length;
                                                dArr = new double[length3];
                                                while (i16 < strArrSplit6.length) {
                                                    dArr[i16] = Double.parseDouble(strArrSplit6[i16]);
                                                }
                                                HashMap map9 = mapArr[i3];
                                                ByteOrder byteOrder9 = hVar2.f1663g;
                                                byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr3[c3] * length3]);
                                                byteBufferWrap3.order(byteOrder9);
                                                i17 = 0;
                                                while (i17 < length3) {
                                                    double[] dArr4 = dArr;
                                                    byteBufferWrap3.putDouble(dArr4[i17]);
                                                    i17++;
                                                    str5 = str5;
                                                    dArr = dArr4;
                                                }
                                                str5 = str5;
                                                map9.put(str4, new Z.d(byteBufferWrap3.array(), c3, length3));
                                                break;
                                        }
                                    } else {
                                        i4 = i5;
                                        switch (i4) {
                                            case 1:
                                                i3 = i3;
                                                str5 = str5;
                                                mapArr[i3].put(str4, Z.d.a(strB));
                                                break;
                                            case 2:
                                            case 7:
                                                i3 = i3;
                                                str5 = str5;
                                                mapArr[i3].put(str4, Z.d.b(strB));
                                                break;
                                            case 3:
                                                i3 = i3;
                                                str5 = str5;
                                                strArrSplit = strB.split(",", -1);
                                                iArr = new int[strArrSplit.length];
                                                while (i7 < strArrSplit.length) {
                                                    iArr[i7] = Integer.parseInt(strArrSplit[i7]);
                                                }
                                                mapArr[i3].put(str4, Z.d.g(iArr, hVar2.f1663g));
                                                break;
                                            case 4:
                                                i3 = i3;
                                                str5 = str5;
                                                strArrSplit2 = strB.split(",", -1);
                                                jArr = new long[strArrSplit2.length];
                                                while (i8 < strArrSplit2.length) {
                                                    jArr[i8] = Long.parseLong(strArrSplit2[i8]);
                                                }
                                                mapArr[i3].put(str4, Z.d.d(jArr, hVar2.f1663g));
                                                break;
                                            case 5:
                                                i3 = i3;
                                                str5 = str5;
                                                str2 = str;
                                                i9 = -1;
                                                strArrSplit3 = strB.split(",", -1);
                                                fVarArr = new Z.f[strArrSplit3.length];
                                                i10 = 0;
                                                while (i10 < strArrSplit3.length) {
                                                    String[] strArrSplit13 = strArrSplit3[i10].split(str2, i9);
                                                    int i26 = i10;
                                                    fVarArr[i26] = new Z.f((long) Double.parseDouble(strArrSplit13[0]), (long) Double.parseDouble(strArrSplit13[1]));
                                                    i10 = i26 + 1;
                                                    str2 = str2;
                                                    i9 = -1;
                                                }
                                                str = str2;
                                                mapArr[i3].put(str4, Z.d.e(fVarArr, hVar2.f1663g));
                                                break;
                                            case 6:
                                            case 8:
                                            case 11:
                                            default:
                                                if (z5) {
                                                    Log.d(str5, "Data format isn't one of expected formats: " + i4);
                                                }
                                                break;
                                            case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                                                i3 = i3;
                                                strArrSplit4 = strB.split(",", -1);
                                                length = strArrSplit4.length;
                                                iArr2 = new int[length];
                                                while (i11 < strArrSplit4.length) {
                                                    iArr2[i11] = Integer.parseInt(strArrSplit4[i11]);
                                                }
                                                HashMap map10 = mapArr[i3];
                                                ByteOrder byteOrder10 = hVar2.f1663g;
                                                byteBufferWrap = ByteBuffer.wrap(new byte[iArr3[i6] * length]);
                                                byteBufferWrap.order(byteOrder10);
                                                while (i12 < length) {
                                                    byteBufferWrap.putInt(iArr2[i12]);
                                                }
                                                map10.put(str4, new Z.d(byteBufferWrap.array(), i6, length));
                                                str = str;
                                                break;
                                            case 10:
                                                i13 = -1;
                                                strArrSplit5 = strB.split(",", -1);
                                                length2 = strArrSplit5.length;
                                                fVarArr2 = new Z.f[length2];
                                                i14 = 0;
                                                while (i14 < strArrSplit5.length) {
                                                    String[] strArrSplit14 = strArrSplit5[i14].split(str, i13);
                                                    int i27 = i14;
                                                    Z.f[] fVarArr7 = fVarArr2;
                                                    fVarArr7[i27] = new Z.f((long) Double.parseDouble(strArrSplit14[0]), (long) Double.parseDouble(strArrSplit14[1]));
                                                    i14 = i27 + 1;
                                                    strArrSplit5 = strArrSplit5;
                                                    fVarArr2 = fVarArr7;
                                                    i3 = i3;
                                                    i13 = -1;
                                                }
                                                i3 = i3;
                                                fVarArr3 = fVarArr2;
                                                HashMap map11 = mapArr[i3];
                                                ByteOrder byteOrder11 = hVar2.f1663g;
                                                byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr3[10] * length2]);
                                                byteBufferWrap2.order(byteOrder11);
                                                i15 = 0;
                                                while (i15 < length2) {
                                                    Z.f fVar5 = fVarArr3[i15];
                                                    byteBufferWrap2.putInt((int) fVar5.f1622a);
                                                    byteBufferWrap2.putInt((int) fVar5.f1623b);
                                                    i15++;
                                                    length2 = length2;
                                                }
                                                map11.put(str4, new Z.d(byteBufferWrap2.array(), 10, length2));
                                                str = str;
                                                break;
                                            case 12:
                                                strArrSplit6 = strB.split(",", -1);
                                                length3 = strArrSplit6.length;
                                                dArr = new double[length3];
                                                while (i16 < strArrSplit6.length) {
                                                    dArr[i16] = Double.parseDouble(strArrSplit6[i16]);
                                                }
                                                HashMap map12 = mapArr[i3];
                                                ByteOrder byteOrder12 = hVar2.f1663g;
                                                byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr3[c3] * length3]);
                                                byteBufferWrap3.order(byteOrder12);
                                                i17 = 0;
                                                while (i17 < length3) {
                                                    double[] dArr5 = dArr;
                                                    byteBufferWrap3.putDouble(dArr5[i17]);
                                                    i17++;
                                                    str5 = str5;
                                                    dArr = dArr5;
                                                }
                                                str5 = str5;
                                                map12.put(str4, new Z.d(byteBufferWrap3.array(), c3, length3));
                                                break;
                                        }
                                    }
                                } else {
                                    mapArr[i3].remove(str4);
                                }
                                str5 = str5;
                            }
                            i3++;
                            str5 = str5;
                            c3 = '\f';
                            i18 = 9;
                        }
                    } else {
                        hVar2.f1674s = strB != null ? Z.d.a(strB) : null;
                    }
                } else {
                    i3 = 0;
                    while (i3 < Z.h.f1643U.length) {
                        if ((i3 == 4 || hVar2.f1664h) && (eVar = (Z.e) Z.h.f1645X[i3].get(str4)) != null) {
                            i4 = eVar.f1621d;
                            i5 = eVar.f1620c;
                            if (strB != null) {
                                pairO = Z.h.o(strB);
                                i6 = i18;
                                if (i5 != ((Integer) pairO.first).intValue() || i5 == ((Integer) pairO.second).intValue()) {
                                    i4 = i5;
                                    switch (i4) {
                                        case 1:
                                            i3 = i3;
                                            str5 = str5;
                                            mapArr[i3].put(str4, Z.d.a(strB));
                                            break;
                                        case 2:
                                        case 7:
                                            i3 = i3;
                                            str5 = str5;
                                            mapArr[i3].put(str4, Z.d.b(strB));
                                            break;
                                        case 3:
                                            i3 = i3;
                                            str5 = str5;
                                            strArrSplit = strB.split(",", -1);
                                            iArr = new int[strArrSplit.length];
                                            while (i7 < strArrSplit.length) {
                                                iArr[i7] = Integer.parseInt(strArrSplit[i7]);
                                            }
                                            mapArr[i3].put(str4, Z.d.g(iArr, hVar2.f1663g));
                                            break;
                                        case 4:
                                            i3 = i3;
                                            str5 = str5;
                                            strArrSplit2 = strB.split(",", -1);
                                            jArr = new long[strArrSplit2.length];
                                            while (i8 < strArrSplit2.length) {
                                                jArr[i8] = Long.parseLong(strArrSplit2[i8]);
                                            }
                                            mapArr[i3].put(str4, Z.d.d(jArr, hVar2.f1663g));
                                            break;
                                        case 5:
                                            i3 = i3;
                                            str5 = str5;
                                            str2 = str;
                                            i9 = -1;
                                            strArrSplit3 = strB.split(",", -1);
                                            fVarArr = new Z.f[strArrSplit3.length];
                                            i10 = 0;
                                            while (i10 < strArrSplit3.length) {
                                                String[] strArrSplit15 = strArrSplit3[i10].split(str2, i9);
                                                int i28 = i10;
                                                fVarArr[i28] = new Z.f((long) Double.parseDouble(strArrSplit15[0]), (long) Double.parseDouble(strArrSplit15[1]));
                                                i10 = i28 + 1;
                                                str2 = str2;
                                                i9 = -1;
                                            }
                                            str = str2;
                                            mapArr[i3].put(str4, Z.d.e(fVarArr, hVar2.f1663g));
                                            break;
                                        case 6:
                                        case 8:
                                        case 11:
                                        default:
                                            if (z5) {
                                                Log.d(str5, "Data format isn't one of expected formats: " + i4);
                                            }
                                            break;
                                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                                            i3 = i3;
                                            strArrSplit4 = strB.split(",", -1);
                                            length = strArrSplit4.length;
                                            iArr2 = new int[length];
                                            while (i11 < strArrSplit4.length) {
                                                iArr2[i11] = Integer.parseInt(strArrSplit4[i11]);
                                            }
                                            HashMap map13 = mapArr[i3];
                                            ByteOrder byteOrder13 = hVar2.f1663g;
                                            byteBufferWrap = ByteBuffer.wrap(new byte[iArr3[i6] * length]);
                                            byteBufferWrap.order(byteOrder13);
                                            while (i12 < length) {
                                                byteBufferWrap.putInt(iArr2[i12]);
                                            }
                                            map13.put(str4, new Z.d(byteBufferWrap.array(), i6, length));
                                            str = str;
                                            break;
                                        case 10:
                                            i13 = -1;
                                            strArrSplit5 = strB.split(",", -1);
                                            length2 = strArrSplit5.length;
                                            fVarArr2 = new Z.f[length2];
                                            i14 = 0;
                                            while (i14 < strArrSplit5.length) {
                                                String[] strArrSplit16 = strArrSplit5[i14].split(str, i13);
                                                int i29 = i14;
                                                Z.f[] fVarArr8 = fVarArr2;
                                                fVarArr8[i29] = new Z.f((long) Double.parseDouble(strArrSplit16[0]), (long) Double.parseDouble(strArrSplit16[1]));
                                                i14 = i29 + 1;
                                                strArrSplit5 = strArrSplit5;
                                                fVarArr2 = fVarArr8;
                                                i3 = i3;
                                                i13 = -1;
                                            }
                                            i3 = i3;
                                            fVarArr3 = fVarArr2;
                                            HashMap map14 = mapArr[i3];
                                            ByteOrder byteOrder14 = hVar2.f1663g;
                                            byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr3[10] * length2]);
                                            byteBufferWrap2.order(byteOrder14);
                                            i15 = 0;
                                            while (i15 < length2) {
                                                Z.f fVar6 = fVarArr3[i15];
                                                byteBufferWrap2.putInt((int) fVar6.f1622a);
                                                byteBufferWrap2.putInt((int) fVar6.f1623b);
                                                i15++;
                                                length2 = length2;
                                            }
                                            map14.put(str4, new Z.d(byteBufferWrap2.array(), 10, length2));
                                            str = str;
                                            break;
                                        case 12:
                                            strArrSplit6 = strB.split(",", -1);
                                            length3 = strArrSplit6.length;
                                            dArr = new double[length3];
                                            while (i16 < strArrSplit6.length) {
                                                dArr[i16] = Double.parseDouble(strArrSplit6[i16]);
                                            }
                                            HashMap map15 = mapArr[i3];
                                            ByteOrder byteOrder15 = hVar2.f1663g;
                                            byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr3[c3] * length3]);
                                            byteBufferWrap3.order(byteOrder15);
                                            i17 = 0;
                                            while (i17 < length3) {
                                                double[] dArr6 = dArr;
                                                byteBufferWrap3.putDouble(dArr6[i17]);
                                                i17++;
                                                str5 = str5;
                                                dArr = dArr6;
                                            }
                                            str5 = str5;
                                            map15.put(str4, new Z.d(byteBufferWrap3.array(), c3, length3));
                                            break;
                                    }
                                } else if (i4 != -1 && (i4 == ((Integer) pairO.first).intValue() || i4 == ((Integer) pairO.second).intValue())) {
                                    switch (i4) {
                                        case 1:
                                            i3 = i3;
                                            str5 = str5;
                                            mapArr[i3].put(str4, Z.d.a(strB));
                                            break;
                                        case 2:
                                        case 7:
                                            i3 = i3;
                                            str5 = str5;
                                            mapArr[i3].put(str4, Z.d.b(strB));
                                            break;
                                        case 3:
                                            i3 = i3;
                                            str5 = str5;
                                            strArrSplit = strB.split(",", -1);
                                            iArr = new int[strArrSplit.length];
                                            while (i7 < strArrSplit.length) {
                                                iArr[i7] = Integer.parseInt(strArrSplit[i7]);
                                            }
                                            mapArr[i3].put(str4, Z.d.g(iArr, hVar2.f1663g));
                                            break;
                                        case 4:
                                            i3 = i3;
                                            str5 = str5;
                                            strArrSplit2 = strB.split(",", -1);
                                            jArr = new long[strArrSplit2.length];
                                            while (i8 < strArrSplit2.length) {
                                                jArr[i8] = Long.parseLong(strArrSplit2[i8]);
                                            }
                                            mapArr[i3].put(str4, Z.d.d(jArr, hVar2.f1663g));
                                            break;
                                        case 5:
                                            i3 = i3;
                                            str5 = str5;
                                            str2 = str;
                                            i9 = -1;
                                            strArrSplit3 = strB.split(",", -1);
                                            fVarArr = new Z.f[strArrSplit3.length];
                                            i10 = 0;
                                            while (i10 < strArrSplit3.length) {
                                                String[] strArrSplit17 = strArrSplit3[i10].split(str2, i9);
                                                int i210 = i10;
                                                fVarArr[i210] = new Z.f((long) Double.parseDouble(strArrSplit17[0]), (long) Double.parseDouble(strArrSplit17[1]));
                                                i10 = i210 + 1;
                                                str2 = str2;
                                                i9 = -1;
                                            }
                                            str = str2;
                                            mapArr[i3].put(str4, Z.d.e(fVarArr, hVar2.f1663g));
                                            break;
                                        case 6:
                                        case 8:
                                        case 11:
                                        default:
                                            if (z5) {
                                                Log.d(str5, "Data format isn't one of expected formats: " + i4);
                                            }
                                            break;
                                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                                            i3 = i3;
                                            strArrSplit4 = strB.split(",", -1);
                                            length = strArrSplit4.length;
                                            iArr2 = new int[length];
                                            while (i11 < strArrSplit4.length) {
                                                iArr2[i11] = Integer.parseInt(strArrSplit4[i11]);
                                            }
                                            HashMap map16 = mapArr[i3];
                                            ByteOrder byteOrder16 = hVar2.f1663g;
                                            byteBufferWrap = ByteBuffer.wrap(new byte[iArr3[i6] * length]);
                                            byteBufferWrap.order(byteOrder16);
                                            while (i12 < length) {
                                                byteBufferWrap.putInt(iArr2[i12]);
                                            }
                                            map16.put(str4, new Z.d(byteBufferWrap.array(), i6, length));
                                            str = str;
                                            break;
                                        case 10:
                                            i13 = -1;
                                            strArrSplit5 = strB.split(",", -1);
                                            length2 = strArrSplit5.length;
                                            fVarArr2 = new Z.f[length2];
                                            i14 = 0;
                                            while (i14 < strArrSplit5.length) {
                                                String[] strArrSplit18 = strArrSplit5[i14].split(str, i13);
                                                int i211 = i14;
                                                Z.f[] fVarArr9 = fVarArr2;
                                                fVarArr9[i211] = new Z.f((long) Double.parseDouble(strArrSplit18[0]), (long) Double.parseDouble(strArrSplit18[1]));
                                                i14 = i211 + 1;
                                                strArrSplit5 = strArrSplit5;
                                                fVarArr2 = fVarArr9;
                                                i3 = i3;
                                                i13 = -1;
                                            }
                                            i3 = i3;
                                            fVarArr3 = fVarArr2;
                                            HashMap map17 = mapArr[i3];
                                            ByteOrder byteOrder17 = hVar2.f1663g;
                                            byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr3[10] * length2]);
                                            byteBufferWrap2.order(byteOrder17);
                                            i15 = 0;
                                            while (i15 < length2) {
                                                Z.f fVar7 = fVarArr3[i15];
                                                byteBufferWrap2.putInt((int) fVar7.f1622a);
                                                byteBufferWrap2.putInt((int) fVar7.f1623b);
                                                i15++;
                                                length2 = length2;
                                            }
                                            map17.put(str4, new Z.d(byteBufferWrap2.array(), 10, length2));
                                            str = str;
                                            break;
                                        case 12:
                                            strArrSplit6 = strB.split(",", -1);
                                            length3 = strArrSplit6.length;
                                            dArr = new double[length3];
                                            while (i16 < strArrSplit6.length) {
                                                dArr[i16] = Double.parseDouble(strArrSplit6[i16]);
                                            }
                                            HashMap map18 = mapArr[i3];
                                            ByteOrder byteOrder18 = hVar2.f1663g;
                                            byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr3[c3] * length3]);
                                            byteBufferWrap3.order(byteOrder18);
                                            i17 = 0;
                                            while (i17 < length3) {
                                                double[] dArr7 = dArr;
                                                byteBufferWrap3.putDouble(dArr7[i17]);
                                                i17++;
                                                str5 = str5;
                                                dArr = dArr7;
                                            }
                                            str5 = str5;
                                            map18.put(str4, new Z.d(byteBufferWrap3.array(), c3, length3));
                                            break;
                                    }
                                } else if (i5 == 1 || i5 == 7 || i5 == 2) {
                                    i4 = i5;
                                    switch (i4) {
                                        case 1:
                                            i3 = i3;
                                            str5 = str5;
                                            mapArr[i3].put(str4, Z.d.a(strB));
                                            break;
                                        case 2:
                                        case 7:
                                            i3 = i3;
                                            str5 = str5;
                                            mapArr[i3].put(str4, Z.d.b(strB));
                                            break;
                                        case 3:
                                            i3 = i3;
                                            str5 = str5;
                                            strArrSplit = strB.split(",", -1);
                                            iArr = new int[strArrSplit.length];
                                            while (i7 < strArrSplit.length) {
                                                iArr[i7] = Integer.parseInt(strArrSplit[i7]);
                                            }
                                            mapArr[i3].put(str4, Z.d.g(iArr, hVar2.f1663g));
                                            break;
                                        case 4:
                                            i3 = i3;
                                            str5 = str5;
                                            strArrSplit2 = strB.split(",", -1);
                                            jArr = new long[strArrSplit2.length];
                                            while (i8 < strArrSplit2.length) {
                                                jArr[i8] = Long.parseLong(strArrSplit2[i8]);
                                            }
                                            mapArr[i3].put(str4, Z.d.d(jArr, hVar2.f1663g));
                                            break;
                                        case 5:
                                            i3 = i3;
                                            str5 = str5;
                                            str2 = str;
                                            i9 = -1;
                                            strArrSplit3 = strB.split(",", -1);
                                            fVarArr = new Z.f[strArrSplit3.length];
                                            i10 = 0;
                                            while (i10 < strArrSplit3.length) {
                                                String[] strArrSplit19 = strArrSplit3[i10].split(str2, i9);
                                                int i212 = i10;
                                                fVarArr[i212] = new Z.f((long) Double.parseDouble(strArrSplit19[0]), (long) Double.parseDouble(strArrSplit19[1]));
                                                i10 = i212 + 1;
                                                str2 = str2;
                                                i9 = -1;
                                            }
                                            str = str2;
                                            mapArr[i3].put(str4, Z.d.e(fVarArr, hVar2.f1663g));
                                            break;
                                        case 6:
                                        case 8:
                                        case 11:
                                        default:
                                            if (z5) {
                                                Log.d(str5, "Data format isn't one of expected formats: " + i4);
                                            }
                                            break;
                                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                                            i3 = i3;
                                            strArrSplit4 = strB.split(",", -1);
                                            length = strArrSplit4.length;
                                            iArr2 = new int[length];
                                            while (i11 < strArrSplit4.length) {
                                                iArr2[i11] = Integer.parseInt(strArrSplit4[i11]);
                                            }
                                            HashMap map19 = mapArr[i3];
                                            ByteOrder byteOrder19 = hVar2.f1663g;
                                            byteBufferWrap = ByteBuffer.wrap(new byte[iArr3[i6] * length]);
                                            byteBufferWrap.order(byteOrder19);
                                            while (i12 < length) {
                                                byteBufferWrap.putInt(iArr2[i12]);
                                            }
                                            map19.put(str4, new Z.d(byteBufferWrap.array(), i6, length));
                                            str = str;
                                            break;
                                        case 10:
                                            i13 = -1;
                                            strArrSplit5 = strB.split(",", -1);
                                            length2 = strArrSplit5.length;
                                            fVarArr2 = new Z.f[length2];
                                            i14 = 0;
                                            while (i14 < strArrSplit5.length) {
                                                String[] strArrSplit110 = strArrSplit5[i14].split(str, i13);
                                                int i213 = i14;
                                                Z.f[] fVarArr10 = fVarArr2;
                                                fVarArr10[i213] = new Z.f((long) Double.parseDouble(strArrSplit110[0]), (long) Double.parseDouble(strArrSplit110[1]));
                                                i14 = i213 + 1;
                                                strArrSplit5 = strArrSplit5;
                                                fVarArr2 = fVarArr10;
                                                i3 = i3;
                                                i13 = -1;
                                            }
                                            i3 = i3;
                                            fVarArr3 = fVarArr2;
                                            HashMap map110 = mapArr[i3];
                                            ByteOrder byteOrder110 = hVar2.f1663g;
                                            byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr3[10] * length2]);
                                            byteBufferWrap2.order(byteOrder110);
                                            i15 = 0;
                                            while (i15 < length2) {
                                                Z.f fVar8 = fVarArr3[i15];
                                                byteBufferWrap2.putInt((int) fVar8.f1622a);
                                                byteBufferWrap2.putInt((int) fVar8.f1623b);
                                                i15++;
                                                length2 = length2;
                                            }
                                            map110.put(str4, new Z.d(byteBufferWrap2.array(), 10, length2));
                                            str = str;
                                            break;
                                        case 12:
                                            strArrSplit6 = strB.split(",", -1);
                                            length3 = strArrSplit6.length;
                                            dArr = new double[length3];
                                            while (i16 < strArrSplit6.length) {
                                                dArr[i16] = Double.parseDouble(strArrSplit6[i16]);
                                            }
                                            HashMap map111 = mapArr[i3];
                                            ByteOrder byteOrder111 = hVar2.f1663g;
                                            byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr3[c3] * length3]);
                                            byteBufferWrap3.order(byteOrder111);
                                            i17 = 0;
                                            while (i17 < length3) {
                                                double[] dArr8 = dArr;
                                                byteBufferWrap3.putDouble(dArr8[i17]);
                                                i17++;
                                                str5 = str5;
                                                dArr = dArr8;
                                            }
                                            str5 = str5;
                                            map111.put(str4, new Z.d(byteBufferWrap3.array(), c3, length3));
                                            break;
                                    }
                                } else if (z5) {
                                    StringBuilder sb = new StringBuilder("Given tag (");
                                    sb.append(str4);
                                    sb.append(") value didn't match with one of expected formats: ");
                                    String[] strArr = Z.h.f1640Q;
                                    sb.append(strArr[i5]);
                                    String str7 = StringUtils.EMPTY;
                                    sb.append(i4 == -1 ? StringUtils.EMPTY : ", " + strArr[i4]);
                                    sb.append(" (guess: ");
                                    sb.append(strArr[((Integer) pairO.first).intValue()]);
                                    if (((Integer) pairO.second).intValue() != -1) {
                                        str7 = ", " + strArr[((Integer) pairO.second).intValue()];
                                    }
                                    sb.append(str7);
                                    sb.append(")");
                                    Log.d(str5, sb.toString());
                                } else {
                                    i3 = i3;
                                    str5 = str5;
                                }
                            } else {
                                mapArr[i3].remove(str4);
                            }
                            str5 = str5;
                        } else {
                            str5 = str5;
                        }
                        i3++;
                        str5 = str5;
                        c3 = '\f';
                        i18 = 9;
                    }
                }
            }
        }
        int i30 = hVar2.f1659c;
        if (i30 != 4 && i30 != 13 && i30 != 14) {
            throw new IOException("ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats.");
        }
        if (hVar2.f1658b == null && hVar2.f1657a == null) {
            throw new IOException("ExifInterface does not support saving attributes for the current input.");
        }
        if (hVar2.f1664h && hVar2.f1665i && !hVar2.f1666j) {
            throw new IOException("ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips");
        }
        int i31 = hVar2.n;
        hVar2.f1669m = (i31 == 6 || i31 == 7) ? hVar2.m() : null;
        try {
            File fileCreateTempFile = File.createTempFile("temp", "tmp");
            if (hVar2.f1657a != null) {
                try {
                    fileInputStream2 = new FileInputStream(hVar2.f1657a);
                } catch (Exception e3) {
                    e = e3;
                    fileOutputStream = null;
                    fileInputStream = null;
                    try {
                        throw new IOException("Failed to copy original file to temp file", e);
                    } catch (Throwable th) {
                        th = th;
                        H2.h.e(fileInputStream);
                        H2.h.e(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = null;
                    fileInputStream = null;
                    H2.h.e(fileInputStream);
                    H2.h.e(fileOutputStream);
                    throw th;
                }
            } else {
                Os.lseek(hVar2.f1658b, 0L, OsConstants.SEEK_SET);
                fileInputStream2 = new FileInputStream(hVar2.f1658b);
            }
            FileInputStream fileInputStream5 = fileInputStream2;
            try {
                FileOutputStream fileOutputStream5 = new FileOutputStream(fileCreateTempFile);
                try {
                    H2.h.h(fileInputStream5, fileOutputStream5);
                    H2.h.e(fileInputStream5);
                    H2.h.e(fileOutputStream5);
                    try {
                        try {
                            FileInputStream fileInputStream6 = new FileInputStream(fileCreateTempFile);
                            try {
                                if (hVar2.f1657a != null) {
                                    try {
                                        fileOutputStream4 = new FileOutputStream(hVar2.f1657a);
                                    } catch (Exception e4) {
                                        e = e4;
                                        fileInputStream3 = fileInputStream6;
                                        fileOutputStream2 = null;
                                        bufferedOutputStream = null;
                                        bufferedInputStream = null;
                                        try {
                                            fileInputStream4 = new FileInputStream(fileCreateTempFile);
                                            try {
                                                if (hVar2.f1657a != null) {
                                                    fileOutputStream3 = new FileOutputStream(hVar2.f1657a);
                                                } else {
                                                    Os.lseek(hVar2.f1658b, 0L, OsConstants.SEEK_SET);
                                                    fileOutputStream3 = new FileOutputStream(hVar2.f1658b);
                                                }
                                                fileOutputStream2 = fileOutputStream3;
                                                H2.h.h(fileInputStream4, fileOutputStream2);
                                                try {
                                                    H2.h.e(fileInputStream4);
                                                    H2.h.e(fileOutputStream2);
                                                    throw new IOException("Failed to save new file", e);
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    z3 = false;
                                                    bufferedInputStream2 = bufferedInputStream;
                                                    H2.h.e(bufferedInputStream2);
                                                    H2.h.e(bufferedOutputStream);
                                                    if (!z3) {
                                                        fileCreateTempFile.delete();
                                                    }
                                                    throw th;
                                                }
                                            } catch (Exception e5) {
                                                e = e5;
                                                fileInputStream3 = fileInputStream4;
                                                try {
                                                    throw new IOException("Failed to save new file. Original file is stored in " + fileCreateTempFile.getAbsolutePath(), e);
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    z4 = true;
                                                    try {
                                                        H2.h.e(fileInputStream3);
                                                        H2.h.e(fileOutputStream2);
                                                        throw th;
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        z3 = z4;
                                                        bufferedInputStream2 = bufferedInputStream;
                                                        H2.h.e(bufferedInputStream2);
                                                        H2.h.e(bufferedOutputStream);
                                                        if (!z3) {
                                                            fileCreateTempFile.delete();
                                                        }
                                                        throw th;
                                                    }
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                fileInputStream3 = fileInputStream4;
                                                z4 = false;
                                                H2.h.e(fileInputStream3);
                                                H2.h.e(fileOutputStream2);
                                                throw th;
                                            }
                                        } catch (Exception e6) {
                                            e = e6;
                                        } catch (Throwable th7) {
                                            th = th7;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        z3 = false;
                                        bufferedOutputStream = null;
                                        bufferedInputStream2 = null;
                                        H2.h.e(bufferedInputStream2);
                                        H2.h.e(bufferedOutputStream);
                                        if (!z3) {
                                            fileCreateTempFile.delete();
                                        }
                                        throw th;
                                    }
                                } else {
                                    Os.lseek(hVar2.f1658b, 0L, OsConstants.SEEK_SET);
                                    fileOutputStream4 = new FileOutputStream(hVar2.f1658b);
                                }
                                FileOutputStream fileOutputStream6 = fileOutputStream4;
                                try {
                                    bufferedInputStream2 = new BufferedInputStream(fileInputStream6);
                                    try {
                                        bufferedOutputStream = new BufferedOutputStream(fileOutputStream6);
                                        try {
                                            int i32 = hVar2.f1659c;
                                            if (i32 == 4) {
                                                hVar2.z(bufferedInputStream2, bufferedOutputStream);
                                            } else if (i32 == 13) {
                                                hVar2.A(bufferedInputStream2, bufferedOutputStream);
                                            } else if (i32 == 14) {
                                                hVar2.B(bufferedInputStream2, bufferedOutputStream);
                                            }
                                            H2.h.e(bufferedInputStream2);
                                            H2.h.e(bufferedOutputStream);
                                            fileCreateTempFile.delete();
                                            hVar2.f1669m = null;
                                        } catch (Exception e7) {
                                            e = e7;
                                            fileOutputStream2 = fileOutputStream6;
                                            bufferedInputStream = bufferedInputStream2;
                                            fileInputStream3 = fileInputStream6;
                                            fileInputStream4 = new FileInputStream(fileCreateTempFile);
                                            if (hVar2.f1657a != null) {
                                                fileOutputStream3 = new FileOutputStream(hVar2.f1657a);
                                            } else {
                                                Os.lseek(hVar2.f1658b, 0L, OsConstants.SEEK_SET);
                                                fileOutputStream3 = new FileOutputStream(hVar2.f1658b);
                                            }
                                            fileOutputStream2 = fileOutputStream3;
                                            H2.h.h(fileInputStream4, fileOutputStream2);
                                            H2.h.e(fileInputStream4);
                                            H2.h.e(fileOutputStream2);
                                            throw new IOException("Failed to save new file", e);
                                        } catch (Throwable th9) {
                                            th = th9;
                                            bufferedOutputStream = bufferedOutputStream;
                                            z3 = false;
                                            H2.h.e(bufferedInputStream2);
                                            H2.h.e(bufferedOutputStream);
                                            if (!z3) {
                                                fileCreateTempFile.delete();
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e8) {
                                        e = e8;
                                        bufferedOutputStream = null;
                                    } catch (Throwable th10) {
                                        th = th10;
                                        bufferedOutputStream = null;
                                    }
                                } catch (Exception e9) {
                                    e = e9;
                                    bufferedOutputStream = null;
                                    bufferedInputStream = null;
                                    fileInputStream3 = fileInputStream6;
                                    fileOutputStream2 = fileOutputStream6;
                                    fileInputStream4 = new FileInputStream(fileCreateTempFile);
                                    if (hVar2.f1657a != null) {
                                        fileOutputStream3 = new FileOutputStream(hVar2.f1657a);
                                    } else {
                                        Os.lseek(hVar2.f1658b, 0L, OsConstants.SEEK_SET);
                                        fileOutputStream3 = new FileOutputStream(hVar2.f1658b);
                                    }
                                    fileOutputStream2 = fileOutputStream3;
                                    H2.h.h(fileInputStream4, fileOutputStream2);
                                    H2.h.e(fileInputStream4);
                                    H2.h.e(fileOutputStream2);
                                    throw new IOException("Failed to save new file", e);
                                }
                            } catch (Exception e10) {
                                e = e10;
                                fileOutputStream2 = null;
                                bufferedOutputStream = null;
                                bufferedInputStream = null;
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            bufferedOutputStream = null;
                            bufferedInputStream2 = null;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        fileOutputStream2 = null;
                        fileInputStream3 = null;
                        bufferedOutputStream = null;
                        bufferedInputStream = null;
                    }
                } catch (Exception e12) {
                    e = e12;
                    fileInputStream = fileInputStream5;
                    fileOutputStream = fileOutputStream5;
                    throw new IOException("Failed to copy original file to temp file", e);
                } catch (Throwable th12) {
                    th = th12;
                    fileInputStream = fileInputStream5;
                    fileOutputStream = fileOutputStream5;
                    H2.h.e(fileInputStream);
                    H2.h.e(fileOutputStream);
                    throw th;
                }
            } catch (Exception e13) {
                e = e13;
                fileOutputStream = null;
                fileInputStream = fileInputStream5;
            } catch (Throwable th13) {
                th = th13;
                fileOutputStream = null;
                fileInputStream = fileInputStream5;
            }
        } catch (Exception e14) {
            e = e14;
            fileOutputStream = null;
            fileInputStream = null;
        } catch (Throwable th14) {
            th = th14;
            fileOutputStream = null;
            fileInputStream = null;
        }
    }

    public static A.c f(Context context, String[] strArr, String str, s sVar) {
        String[] strArrN = n(context);
        int length = strArrN.length;
        int i3 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i3 >= length) {
                return null;
            }
            String str2 = strArrN[i3];
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                if (i4 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i4 = i5;
                }
            }
            if (zipFile != null) {
                int i6 = 0;
                while (true) {
                    int i7 = i6 + 1;
                    if (i6 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder sb = new StringBuilder("lib");
                            char c3 = File.separatorChar;
                            sb.append(c3);
                            sb.append(str3);
                            sb.append(c3);
                            sb.append(str);
                            String string = sb.toString();
                            sVar.t("Looking for %s in APK %s...", string, str2);
                            ZipEntry entry = zipFile.getEntry(string);
                            if (entry != null) {
                                A.c cVar = new A.c(13, false);
                                cVar.f6l = zipFile;
                                cVar.f7m = entry;
                                return cVar;
                            }
                        }
                        i6 = i7;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i3++;
        }
    }

    public static String g(Context context, Uri uri) {
        try {
            String extensionFromMimeType = uri.getScheme().equals("content") ? MimeTypeMap.getSingleton().getExtensionFromMimeType(context.getContentResolver().getType(uri)) : MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(new File(uri.getPath())).toString());
            if (extensionFromMimeType == null || extensionFromMimeType.isEmpty()) {
                return null;
            }
            return "." + m(extensionFromMimeType);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0061 A[Catch: all -> 0x0081, TryCatch #1 {all -> 0x0081, blocks: (B:4:0x000d, B:13:0x004f, B:26:0x0065, B:28:0x006b, B:33:0x0084, B:40:0x00a7, B:47:0x00d3, B:57:0x00e5, B:56:0x00e2, B:35:0x008b, B:39:0x009d, B:38:0x0099, B:24:0x0061, B:22:0x005e, B:21:0x005b, B:52:0x00dc, B:7:0x0039, B:9:0x003f, B:12:0x0047, B:17:0x0055, B:42:0x00bf, B:43:0x00c1, B:45:0x00c8, B:46:0x00cc), top: B:68:0x000d, inners: #0, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x00e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:? A[Catch: IOException | IllegalArgumentException | SecurityException -> 0x00f2, IOException | IllegalArgumentException | SecurityException -> 0x00f2, IOException | IllegalArgumentException | SecurityException -> 0x00f2, SYNTHETIC, TRY_LEAVE, TryCatch #6 {IOException | IllegalArgumentException | SecurityException -> 0x00f2, blocks: (B:3:0x0005, B:48:0x00d6, B:48:0x00d6, B:48:0x00d6, B:64:0x00f1, B:64:0x00f1, B:64:0x00f1, B:63:0x00ee, B:63:0x00ee, B:63:0x00ee), top: B:77:0x0005 }] */
    public static String h(Context context, Uri uri) {
        String strM;
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            try {
                File file = new File(context.getCacheDir(), UUID.randomUUID().toString());
                file.mkdir();
                file.deleteOnExit();
                Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (!cursorQuery.moveToFirst() || cursorQuery.getColumnCount() < 1) {
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            strM = null;
                        } else {
                            strM = m(cursorQuery.getString(0));
                            cursorQuery.close();
                        }
                    } catch (Throwable th) {
                        try {
                            cursorQuery.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } else {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    strM = null;
                }
                String strG = g(context, uri);
                if (strM == null) {
                    Log.w("FileUtils", "Cannot get file name for " + uri);
                    if (strG == null) {
                        strG = ".jpg";
                    }
                    strM = "image_picker".concat(strG);
                } else if (strG != null) {
                    StringBuilder sb = new StringBuilder();
                    int iLastIndexOf = strM.lastIndexOf(46);
                    if (iLastIndexOf >= 0) {
                        strM = strM.substring(0, iLastIndexOf);
                    }
                    sb.append(strM);
                    sb.append(strG);
                    strM = sb.toString();
                }
                File fileL = l(new File(file, strM).getPath(), file.getCanonicalPath());
                FileOutputStream fileOutputStream = new FileOutputStream(fileL);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i3 = inputStreamOpenInputStream.read(bArr);
                        if (i3 == -1) {
                            fileOutputStream.flush();
                            String path = fileL.getPath();
                            fileOutputStream.close();
                            inputStreamOpenInputStream.close();
                            return path;
                        }
                        fileOutputStream.write(bArr, 0, i3);
                        if (inputStreamOpenInputStream != null) {
                            throw th;
                        }
                        try {
                            inputStreamOpenInputStream.close();
                            throw th;
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    try {
                        fileOutputStream.close();
                        throw th4;
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                        throw th4;
                    }
                }
            } catch (Throwable th6) {
                if (inputStreamOpenInputStream != null) {
                    throw th6;
                }
                inputStreamOpenInputStream.close();
                throw th6;
            }
        } catch (IOException | IllegalArgumentException | SecurityException unused) {
            return null;
        }
    }

    public static String[] i(Context context, String str) {
        StringBuilder sb = new StringBuilder("lib");
        char c3 = File.separatorChar;
        sb.append(c3);
        sb.append("([^\\");
        sb.append(c3);
        sb.append("]*)");
        sb.append(c3);
        sb.append(str);
        Pattern patternCompile = Pattern.compile(sb.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : n(context)) {
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = new ZipFile(new File(str2), 1).entries();
                while (enumerationEntries.hasMoreElements()) {
                    Matcher matcher = patternCompile.matcher(enumerationEntries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public static File l(String str, String str2) {
        File file = new File(str);
        if (file.getCanonicalPath().startsWith(str2)) {
            return file;
        }
        throw new IllegalArgumentException("Trying to open path outside of the expected directory. File: " + file.getCanonicalPath() + " was expected to be within directory: " + str2 + ".");
    }

    public static String m(String str) {
        if (str == null) {
            return null;
        }
        String[] strArr = {"..", "/"};
        String[] strArrSplit = str.split("/");
        String strReplace = strArrSplit[strArrSplit.length - 1];
        for (int i3 = 0; i3 < 2; i3++) {
            strReplace = strReplace.replace(strArr[i3], "_");
        }
        return strReplace;
    }

    public static String[] n(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    @Override // F2.a
    public F2.b a(String str) {
        return H2.b.f444k;
    }

    public List d(String str) {
        switch (this.f81k) {
            case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                try {
                    return (List) new O(new ByteArrayInputStream(Base64.decode(str, 0))).readObject();
                } catch (IOException | ClassNotFoundException e3) {
                    throw new RuntimeException(e3);
                }
            default:
                a2.h.e(str, "listString");
                Object object = new O(new ByteArrayInputStream(Base64.decode(str, 0))).readObject();
                a2.h.c(object, "null cannot be cast to non-null type kotlin.collections.List<*>");
                ArrayList arrayList = new ArrayList();
                for (Object obj : (List) object) {
                    if (obj instanceof String) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
        }
    }

    public String e(List list) throws IOException {
        switch (this.f81k) {
            case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    objectOutputStream.writeObject(list);
                    objectOutputStream.flush();
                    return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                } catch (IOException e3) {
                    throw new RuntimeException(e3);
                }
            default:
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream2);
                objectOutputStream2.writeObject(list);
                objectOutputStream2.flush();
                String strEncodeToString = Base64.encodeToString(byteArrayOutputStream2.toByteArray(), 0);
                a2.h.d(strEncodeToString, "encodeToString(...)");
                return strEncodeToString;
        }
    }

    @Override // C1.m
    public void k(A.c cVar, o oVar) {
        switch (this.f81k) {
            case 0:
                oVar.d(null);
                break;
            case 1:
                break;
            default:
                oVar.d(null);
                break;
        }
    }

    public b(b bVar) {
        this.f81k = 1;
    }

    public b(p057t1.c cVar) {
        this.f81k = 2;
        new s(cVar, "flutter/deferredcomponent", C1.r.f180a, null).z(new b(this));
        A0.j.E().getClass();
        new HashMap();
    }

    private final void j(A.c cVar, o oVar) {
    }

    @Override // D.InterfaceC0017s
    public void onScrollLimit(int i3, int i4, int i5, boolean z3) {
    }

    @Override // D.InterfaceC0017s
    public void onScrollProgress(int i3, int i4, int i5, int i6) {
    }
}

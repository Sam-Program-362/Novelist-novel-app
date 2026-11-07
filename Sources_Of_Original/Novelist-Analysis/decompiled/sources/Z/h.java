package Z;

import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final byte[] f1624A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final byte[] f1625B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final byte[] f1626C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final byte[] f1627D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final byte[] f1628E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final byte[] f1629F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final byte[] f1630G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final byte[] f1631H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final byte[] f1632I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final byte[] f1633J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final byte[] f1634K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final byte[] f1635L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final byte[] f1636M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final byte[] f1637N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final byte[] f1638O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final byte[] f1639P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final String[] f1640Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final int[] f1641R;
    public static final byte[] S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final e f1642T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final e[][] f1643U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final e[] f1644V;
    public static final HashMap[] W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final HashMap[] f1645X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final Set f1646Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final HashMap f1647Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final Charset f1648a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final byte[] f1649b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final byte[] f1650c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final Pattern f1651d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final Pattern f1652e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final Pattern f1653f0;
    public static final boolean u = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int[] f1654v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int[] f1655w;
    public static final byte[] x;
    public static final byte[] y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final byte[] f1656z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FileDescriptor f1658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap[] f1661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f1662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteOrder f1663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1664h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1665i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1666j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1667k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1668l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f1669m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1670o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1671p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1672q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1673r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public d f1674s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f1675t;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f1654v = new int[]{8, 8, 8};
        f1655w = new int[]{8};
        x = new byte[]{-1, -40, -1};
        y = new byte[]{102, 116, 121, 112};
        f1656z = new byte[]{109, 105, 102, 49};
        f1624A = new byte[]{104, 101, 105, 99};
        f1625B = new byte[]{97, 118, 105, 102};
        f1626C = new byte[]{97, 118, 105, 115};
        f1627D = new byte[]{79, 76, 89, 77, 80, 0};
        f1628E = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f1629F = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        f1630G = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
        f1631H = new byte[]{82, 73, 70, 70};
        f1632I = new byte[]{87, 69, 66, 80};
        f1633J = new byte[]{69, 88, 73, 70};
        f1634K = new byte[]{-99, 1, 42};
        f1635L = "VP8X".getBytes(Charset.defaultCharset());
        f1636M = "VP8L".getBytes(Charset.defaultCharset());
        f1637N = "VP8 ".getBytes(Charset.defaultCharset());
        f1638O = "ANIM".getBytes(Charset.defaultCharset());
        f1639P = "ANMF".getBytes(Charset.defaultCharset());
        f1640Q = new String[]{StringUtils.EMPTY, "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f1641R = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        S = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        e[] eVarArr = {new e(254, "NewSubfileType", 4), new e(255, "SubfileType", 4), new e(256, 3, 4, "ImageWidth"), new e(257, 3, 4, "ImageLength"), new e(258, "BitsPerSample", 3), new e(259, "Compression", 3), new e(262, "PhotometricInterpretation", 3), new e(270, "ImageDescription", 2), new e(271, "Make", 2), new e(272, "Model", 2), new e(273, 3, 4, "StripOffsets"), new e(274, "Orientation", 3), new e(277, "SamplesPerPixel", 3), new e(278, 3, 4, "RowsPerStrip"), new e(279, 3, 4, "StripByteCounts"), new e(282, "XResolution", 5), new e(283, "YResolution", 5), new e(284, "PlanarConfiguration", 3), new e(296, "ResolutionUnit", 3), new e(301, "TransferFunction", 3), new e(305, "Software", 2), new e(306, "DateTime", 2), new e(315, "Artist", 2), new e(318, "WhitePoint", 5), new e(319, "PrimaryChromaticities", 5), new e(330, "SubIFDPointer", 4), new e(513, "JPEGInterchangeFormat", 4), new e(514, "JPEGInterchangeFormatLength", 4), new e(529, "YCbCrCoefficients", 5), new e(530, "YCbCrSubSampling", 3), new e(531, "YCbCrPositioning", 3), new e(532, "ReferenceBlackWhite", 5), new e(33432, "Copyright", 2), new e(34665, "ExifIFDPointer", 4), new e(34853, "GPSInfoIFDPointer", 4), new e(4, "SensorTopBorder", 4), new e(5, "SensorLeftBorder", 4), new e(6, "SensorBottomBorder", 4), new e(7, "SensorRightBorder", 4), new e(23, "ISO", 3), new e(46, "JpgFromRaw", 7), new e(700, "Xmp", 1)};
        e[] eVarArr2 = {new e(33434, "ExposureTime", 5), new e(33437, "FNumber", 5), new e(34850, "ExposureProgram", 3), new e(34852, "SpectralSensitivity", 2), new e(34855, "PhotographicSensitivity", 3), new e(34856, "OECF", 7), new e(34864, "SensitivityType", 3), new e(34865, "StandardOutputSensitivity", 4), new e(34866, "RecommendedExposureIndex", 4), new e(34867, "ISOSpeed", 4), new e(34868, "ISOSpeedLatitudeyyy", 4), new e(34869, "ISOSpeedLatitudezzz", 4), new e(36864, "ExifVersion", 2), new e(36867, "DateTimeOriginal", 2), new e(36868, "DateTimeDigitized", 2), new e(36880, "OffsetTime", 2), new e(36881, "OffsetTimeOriginal", 2), new e(36882, "OffsetTimeDigitized", 2), new e(37121, "ComponentsConfiguration", 7), new e(37122, "CompressedBitsPerPixel", 5), new e(37377, "ShutterSpeedValue", 10), new e(37378, "ApertureValue", 5), new e(37379, "BrightnessValue", 10), new e(37380, "ExposureBiasValue", 10), new e(37381, "MaxApertureValue", 5), new e(37382, "SubjectDistance", 5), new e(37383, "MeteringMode", 3), new e(37384, "LightSource", 3), new e(37385, "Flash", 3), new e(37386, "FocalLength", 5), new e(37396, "SubjectArea", 3), new e(37500, "MakerNote", 7), new e(37510, "UserComment", 7), new e(37520, "SubSecTime", 2), new e(37521, "SubSecTimeOriginal", 2), new e(37522, "SubSecTimeDigitized", 2), new e(40960, "FlashpixVersion", 7), new e(40961, "ColorSpace", 3), new e(40962, 3, 4, "PixelXDimension"), new e(40963, 3, 4, "PixelYDimension"), new e(40964, "RelatedSoundFile", 2), new e(40965, "InteroperabilityIFDPointer", 4), new e(41483, "FlashEnergy", 5), new e(41484, "SpatialFrequencyResponse", 7), new e(41486, "FocalPlaneXResolution", 5), new e(41487, "FocalPlaneYResolution", 5), new e(41488, "FocalPlaneResolutionUnit", 3), new e(41492, "SubjectLocation", 3), new e(41493, "ExposureIndex", 5), new e(41495, "SensingMethod", 3), new e(41728, "FileSource", 7), new e(41729, "SceneType", 7), new e(41730, "CFAPattern", 7), new e(41985, "CustomRendered", 3), new e(41986, "ExposureMode", 3), new e(41987, "WhiteBalance", 3), new e(41988, "DigitalZoomRatio", 5), new e(41989, "FocalLengthIn35mmFilm", 3), new e(41990, "SceneCaptureType", 3), new e(41991, "GainControl", 3), new e(41992, "Contrast", 3), new e(41993, "Saturation", 3), new e(41994, "Sharpness", 3), new e(41995, "DeviceSettingDescription", 7), new e(41996, "SubjectDistanceRange", 3), new e(42016, "ImageUniqueID", 2), new e(42032, "CameraOwnerName", 2), new e(42033, "BodySerialNumber", 2), new e(42034, "LensSpecification", 5), new e(42035, "LensMake", 2), new e(42036, "LensModel", 2), new e(42240, "Gamma", 5), new e(50706, "DNGVersion", 1), new e(50720, 3, 4, "DefaultCropSize")};
        e[] eVarArr3 = {new e(0, "GPSVersionID", 1), new e(1, "GPSLatitudeRef", 2), new e(2, 5, 10, "GPSLatitude"), new e(3, "GPSLongitudeRef", 2), new e(4, 5, 10, "GPSLongitude"), new e(5, "GPSAltitudeRef", 1), new e(6, "GPSAltitude", 5), new e(7, "GPSTimeStamp", 5), new e(8, "GPSSatellites", 2), new e(9, "GPSStatus", 2), new e(10, "GPSMeasureMode", 2), new e(11, "GPSDOP", 5), new e(12, "GPSSpeedRef", 2), new e(13, "GPSSpeed", 5), new e(14, "GPSTrackRef", 2), new e(15, "GPSTrack", 5), new e(16, "GPSImgDirectionRef", 2), new e(17, "GPSImgDirection", 5), new e(18, "GPSMapDatum", 2), new e(19, "GPSDestLatitudeRef", 2), new e(20, "GPSDestLatitude", 5), new e(21, "GPSDestLongitudeRef", 2), new e(22, "GPSDestLongitude", 5), new e(23, "GPSDestBearingRef", 2), new e(24, "GPSDestBearing", 5), new e(25, "GPSDestDistanceRef", 2), new e(26, "GPSDestDistance", 5), new e(27, "GPSProcessingMethod", 7), new e(28, "GPSAreaInformation", 7), new e(29, "GPSDateStamp", 2), new e(30, "GPSDifferential", 3), new e(31, "GPSHPositioningError", 5)};
        e[] eVarArr4 = {new e(1, "InteroperabilityIndex", 2)};
        e[] eVarArr5 = {new e(254, "NewSubfileType", 4), new e(255, "SubfileType", 4), new e(256, 3, 4, "ThumbnailImageWidth"), new e(257, 3, 4, "ThumbnailImageLength"), new e(258, "BitsPerSample", 3), new e(259, "Compression", 3), new e(262, "PhotometricInterpretation", 3), new e(270, "ImageDescription", 2), new e(271, "Make", 2), new e(272, "Model", 2), new e(273, 3, 4, "StripOffsets"), new e(274, "ThumbnailOrientation", 3), new e(277, "SamplesPerPixel", 3), new e(278, 3, 4, "RowsPerStrip"), new e(279, 3, 4, "StripByteCounts"), new e(282, "XResolution", 5), new e(283, "YResolution", 5), new e(284, "PlanarConfiguration", 3), new e(296, "ResolutionUnit", 3), new e(301, "TransferFunction", 3), new e(305, "Software", 2), new e(306, "DateTime", 2), new e(315, "Artist", 2), new e(318, "WhitePoint", 5), new e(319, "PrimaryChromaticities", 5), new e(330, "SubIFDPointer", 4), new e(513, "JPEGInterchangeFormat", 4), new e(514, "JPEGInterchangeFormatLength", 4), new e(529, "YCbCrCoefficients", 5), new e(530, "YCbCrSubSampling", 3), new e(531, "YCbCrPositioning", 3), new e(532, "ReferenceBlackWhite", 5), new e(33432, "Copyright", 2), new e(34665, "ExifIFDPointer", 4), new e(34853, "GPSInfoIFDPointer", 4), new e(50706, "DNGVersion", 1), new e(50720, 3, 4, "DefaultCropSize")};
        f1642T = new e(273, "StripOffsets", 3);
        f1643U = new e[][]{eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, new e[]{new e(256, "ThumbnailImage", 7), new e(8224, "CameraSettingsIFDPointer", 4), new e(8256, "ImageProcessingIFDPointer", 4)}, new e[]{new e(257, "PreviewImageStart", 4), new e(258, "PreviewImageLength", 4)}, new e[]{new e(4371, "AspectFrame", 3)}, new e[]{new e(55, "ColorSpace", 3)}};
        f1644V = new e[]{new e(330, "SubIFDPointer", 4), new e(34665, "ExifIFDPointer", 4), new e(34853, "GPSInfoIFDPointer", 4), new e(40965, "InteroperabilityIFDPointer", 4), new e(8224, "CameraSettingsIFDPointer", 1), new e(8256, "ImageProcessingIFDPointer", 1)};
        W = new HashMap[10];
        f1645X = new HashMap[10];
        f1646Y = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        f1647Z = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f1648a0 = charsetForName;
        f1649b0 = "Exif\u0000\u0000".getBytes(charsetForName);
        f1650c0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i3 = 0;
        while (true) {
            e[][] eVarArr6 = f1643U;
            if (i3 >= eVarArr6.length) {
                HashMap map = f1647Z;
                e[] eVarArr7 = f1644V;
                map.put(Integer.valueOf(eVarArr7[0].f1618a), 5);
                map.put(Integer.valueOf(eVarArr7[1].f1618a), 1);
                map.put(Integer.valueOf(eVarArr7[2].f1618a), 2);
                map.put(Integer.valueOf(eVarArr7[3].f1618a), 3);
                map.put(Integer.valueOf(eVarArr7[4].f1618a), 7);
                map.put(Integer.valueOf(eVarArr7[5].f1618a), 8);
                Pattern.compile(".*[1-9].*");
                f1651d0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f1652e0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f1653f0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            W[i3] = new HashMap();
            f1645X[i3] = new HashMap();
            for (e eVar : eVarArr6[i3]) {
                W[i3].put(Integer.valueOf(eVar.f1618a), eVar);
                f1645X[i3].put(eVar.f1619b, eVar);
            }
            i3++;
        }
    }

    public h(String str) throws Throwable {
        boolean z3;
        e[][] eVarArr = f1643U;
        this.f1661e = new HashMap[eVarArr.length];
        this.f1662f = new HashSet(eVarArr.length);
        this.f1663g = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        this.f1657a = str;
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                try {
                    Os.lseek(fileInputStream2.getFD(), 0L, OsConstants.SEEK_CUR);
                    z3 = true;
                } catch (Exception unused) {
                    if (u) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                    z3 = false;
                }
                if (z3) {
                    this.f1658b = fileInputStream2.getFD();
                } else {
                    this.f1658b = null;
                }
                r(fileInputStream2);
                H2.h.e(fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                H2.h.e(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static Pair o(String str) {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair pairO = o(strArrSplit[0]);
            if (((Integer) pairO.first).intValue() == 2) {
                return pairO;
            }
            for (int i3 = 1; i3 < strArrSplit.length; i3++) {
                Pair pairO2 = o(strArrSplit[i3]);
                int iIntValue = (((Integer) pairO2.first).equals(pairO.first) || ((Integer) pairO2.second).equals(pairO.first)) ? ((Integer) pairO.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairO.second).intValue() == -1 || !(((Integer) pairO2.first).equals(pairO.second) || ((Integer) pairO2.second).equals(pairO.second))) ? -1 : ((Integer) pairO.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (iIntValue == -1) {
                    pairO = new Pair(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairO = new Pair(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairO;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long j3 = Long.parseLong(str);
                    if (j3 < 0 || j3 > 65535) {
                        return j3 < 0 ? new Pair(9, -1) : new Pair(4, -1);
                    }
                    return new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair(12, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j4 = (long) Double.parseDouble(strArrSplit2[0]);
                long j5 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j4 >= 0 && j5 >= 0) {
                    if (j4 <= 2147483647L && j5 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    public static ByteOrder u(b bVar) throws IOException {
        short s3 = bVar.readShort();
        boolean z3 = u;
        if (s3 == 18761) {
            if (z3) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s3 == 19789) {
            if (z3) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s3));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0043 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:19:0x0066  */
    /* JADX WARN: Code duplicated, block: B:28:0x007c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x006e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0088 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0041 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0075 -> B:10:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0041
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final void A(java.io.BufferedInputStream r9, java.io.BufferedOutputStream r10) {
        /*
            r8 = this;
            boolean r0 = Z.h.u
            if (r0 == 0) goto L24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "savePngAttributes starting with (inputStream: "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r1 = ", outputStream: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ExifInterface"
            android.util.Log.d(r1, r0)
        L24:
            Z.b r0 = new Z.b
            r0.<init>(r9)
            Z.c r9 = new Z.c
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r9.<init>(r10, r1)
            byte[] r10 = Z.h.f1629F
            int r10 = r10.length
            H2.h.g(r0, r9, r10)
            Z.d r10 = r8.f1674s
            r1 = 1
            r2 = 0
            if (r10 != 0) goto L40
            boolean r10 = r8.f1675t
            if (r10 == 0) goto L75
        L40:
            r10 = r1
        L41:
            if (r1 != 0) goto L4a
            if (r10 == 0) goto L46
            goto L4a
        L46:
            H2.h.h(r0, r9)
            return
        L4a:
            int r3 = r0.readInt()
            int r4 = r0.readInt()
            r5 = 1229472850(0x49484452, float:820293.1)
            if (r4 != r5) goto L77
            r9.b(r3)
            r9.b(r4)
            int r3 = r3 + 4
            H2.h.g(r0, r9, r3)
            int r3 = r8.f1670o
            if (r3 != 0) goto L6a
            r8.H(r9)
            r1 = r2
        L6a:
            Z.d r3 = r8.f1674s
            if (r3 == 0) goto L41
            boolean r3 = r8.f1675t
            if (r3 != 0) goto L41
            r8.I(r9)
        L75:
            r10 = r2
            goto L41
        L77:
            r5 = 1700284774(0x65584966, float:6.383657E22)
            if (r4 != r5) goto L88
            if (r1 == 0) goto L88
            r8.H(r9)
            int r3 = r3 + 4
            r0.a(r3)
            r1 = r2
            goto L41
        L88:
            r5 = 1767135348(0x69545874, float:1.6044374E25)
            if (r4 != r5) goto Lba
            byte[] r5 = Z.h.f1630G
            int r6 = r5.length
            if (r3 < r6) goto Lba
            int r6 = r5.length
            byte[] r7 = new byte[r6]
            r0.readFully(r7)
            int r6 = r3 - r6
            int r6 = r6 + 4
            boolean r5 = java.util.Arrays.equals(r7, r5)
            if (r5 == 0) goto Lad
            Z.d r10 = r8.f1674s
            if (r10 == 0) goto La9
            r8.I(r9)
        La9:
            r0.a(r6)
            goto L75
        Lad:
            r9.b(r3)
            r9.b(r4)
            r9.write(r7)
            H2.h.g(r0, r9, r6)
            goto L41
        Lba:
            r9.b(r3)
            r9.b(r4)
            int r3 = r3 + 4
            H2.h.g(r0, r9, r3)
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.h.A(java.io.BufferedInputStream, java.io.BufferedOutputStream):void");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 6941. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final void B(java.io.BufferedInputStream r23, java.io.BufferedOutputStream r24) {
        /*
            Method dump skipped, instruction units count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.h.B(java.io.BufferedInputStream, java.io.BufferedOutputStream):void");
    }

    public final void C(b bVar) throws Throwable {
        String str;
        d dVar;
        int i3;
        HashMap map = this.f1661e[4];
        d dVar2 = (d) map.get("Compression");
        if (dVar2 == null) {
            this.n = 6;
            p(bVar, map);
            return;
        }
        int i4 = dVar2.i(this.f1663g);
        this.n = i4;
        int i5 = 1;
        if (i4 != 1) {
            if (i4 == 6) {
                p(bVar, map);
                return;
            } else if (i4 != 7) {
                return;
            }
        }
        d dVar3 = (d) map.get("BitsPerSample");
        String str2 = "ExifInterface";
        if (dVar3 != null) {
            int[] iArr = (int[]) dVar3.k(this.f1663g);
            int[] iArr2 = f1654v;
            if (Arrays.equals(iArr2, iArr) || (this.f1659c == 3 && (dVar = (d) map.get("PhotometricInterpretation")) != null && (((i3 = dVar.i(this.f1663g)) == 1 && Arrays.equals(iArr, f1655w)) || (i3 == 6 && Arrays.equals(iArr, iArr2))))) {
                d dVar4 = (d) map.get("StripOffsets");
                d dVar5 = (d) map.get("StripByteCounts");
                if (dVar4 == null || dVar5 == null) {
                    return;
                }
                long[] jArrF = H2.h.f(dVar4.k(this.f1663g));
                long[] jArrF2 = H2.h.f(dVar5.k(this.f1663g));
                if (jArrF == null || jArrF.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrF2 == null || jArrF2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrF.length != jArrF2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j3 = 0;
                for (long j4 : jArrF2) {
                    j3 += j4;
                }
                int i6 = (int) j3;
                byte[] bArr = new byte[i6];
                this.f1666j = true;
                this.f1665i = true;
                this.f1664h = true;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                while (i7 < jArrF.length) {
                    int i10 = (int) jArrF[i7];
                    int i11 = (int) jArrF2[i7];
                    if (i7 < jArrF.length - i5) {
                        str = str2;
                        if (i10 + i11 != jArrF[i7 + 1]) {
                            this.f1666j = false;
                        }
                    } else {
                        str = str2;
                    }
                    int i12 = i10 - i8;
                    if (i12 < 0) {
                        Log.d(str, "Invalid strip offset value");
                        return;
                    }
                    String str3 = str;
                    try {
                        bVar.a(i12);
                        int i13 = i8 + i12;
                        byte[] bArr2 = new byte[i11];
                        try {
                            bVar.readFully(bArr2);
                            i8 = i13 + i11;
                            System.arraycopy(bArr2, 0, bArr, i9, i11);
                            i9 += i11;
                            i7++;
                            str2 = str3;
                            i5 = 1;
                        } catch (EOFException unused) {
                            Log.d(str3, "Failed to read " + i11 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d(str3, "Failed to skip " + i12 + " bytes.");
                        return;
                    }
                }
                this.f1669m = bArr;
                if (this.f1666j) {
                    this.f1667k = (int) jArrF[0];
                    this.f1668l = i6;
                    return;
                }
                return;
            }
        }
        if (u) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void D(int i3, int i4) throws Throwable {
        HashMap[] mapArr = this.f1661e;
        boolean zIsEmpty = mapArr[i3].isEmpty();
        boolean z3 = u;
        if (zIsEmpty || mapArr[i4].isEmpty()) {
            if (z3) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        d dVar = (d) mapArr[i3].get("ImageLength");
        d dVar2 = (d) mapArr[i3].get("ImageWidth");
        d dVar3 = (d) mapArr[i4].get("ImageLength");
        d dVar4 = (d) mapArr[i4].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            if (z3) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (dVar3 == null || dVar4 == null) {
            if (z3) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int i5 = dVar.i(this.f1663g);
        int i6 = dVar2.i(this.f1663g);
        int i7 = dVar3.i(this.f1663g);
        int i8 = dVar4.i(this.f1663g);
        if (i5 >= i7 || i6 >= i8) {
            return;
        }
        HashMap map = mapArr[i3];
        mapArr[i3] = mapArr[i4];
        mapArr[i4] = map;
    }

    public final void E(g gVar, int i3) throws Throwable {
        d dVarF;
        d dVarF2;
        HashMap[] mapArr = this.f1661e;
        d dVar = (d) mapArr[i3].get("DefaultCropSize");
        d dVar2 = (d) mapArr[i3].get("SensorTopBorder");
        d dVar3 = (d) mapArr[i3].get("SensorLeftBorder");
        d dVar4 = (d) mapArr[i3].get("SensorBottomBorder");
        d dVar5 = (d) mapArr[i3].get("SensorRightBorder");
        if (dVar != null) {
            if (dVar.f1614a == 5) {
                f[] fVarArr = (f[]) dVar.k(this.f1663g);
                if (fVarArr == null || fVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(fVarArr));
                    return;
                } else {
                    dVarF = d.e(new f[]{fVarArr[0]}, this.f1663g);
                    dVarF2 = d.e(new f[]{fVarArr[1]}, this.f1663g);
                }
            } else {
                int[] iArr = (int[]) dVar.k(this.f1663g);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                dVarF = d.f(iArr[0], this.f1663g);
                dVarF2 = d.f(iArr[1], this.f1663g);
            }
            mapArr[i3].put("ImageWidth", dVarF);
            mapArr[i3].put("ImageLength", dVarF2);
            return;
        }
        if (dVar2 != null && dVar3 != null && dVar4 != null && dVar5 != null) {
            int i4 = dVar2.i(this.f1663g);
            int i5 = dVar4.i(this.f1663g);
            int i6 = dVar5.i(this.f1663g);
            int i7 = dVar3.i(this.f1663g);
            if (i5 <= i4 || i6 <= i7) {
                return;
            }
            d dVarF3 = d.f(i5 - i4, this.f1663g);
            d dVarF4 = d.f(i6 - i7, this.f1663g);
            mapArr[i3].put("ImageLength", dVarF3);
            mapArr[i3].put("ImageWidth", dVarF4);
            return;
        }
        d dVar6 = (d) mapArr[i3].get("ImageLength");
        d dVar7 = (d) mapArr[i3].get("ImageWidth");
        if (dVar6 == null || dVar7 == null) {
            d dVar8 = (d) mapArr[i3].get("JPEGInterchangeFormat");
            d dVar9 = (d) mapArr[i3].get("JPEGInterchangeFormatLength");
            if (dVar8 == null || dVar9 == null) {
                return;
            }
            int i8 = dVar8.i(this.f1663g);
            int i9 = dVar8.i(this.f1663g);
            gVar.b(i8);
            byte[] bArr = new byte[i9];
            gVar.readFully(bArr);
            e(new b(bArr), i8, i3);
        }
    }

    public final void F() throws Throwable {
        D(0, 5);
        D(0, 4);
        D(5, 4);
        HashMap[] mapArr = this.f1661e;
        d dVar = (d) mapArr[1].get("PixelXDimension");
        d dVar2 = (d) mapArr[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            mapArr[0].put("ImageWidth", dVar);
            mapArr[0].put("ImageLength", dVar2);
        }
        if (mapArr[4].isEmpty() && q(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!q(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        y("ThumbnailOrientation", 0, "Orientation");
        y("ThumbnailImageLength", 0, "ImageLength");
        y("ThumbnailImageWidth", 0, "ImageWidth");
        y("ThumbnailOrientation", 5, "Orientation");
        y("ThumbnailImageLength", 5, "ImageLength");
        y("ThumbnailImageWidth", 5, "ImageWidth");
        y("Orientation", 4, "ThumbnailOrientation");
        y("ImageLength", 4, "ThumbnailImageLength");
        y("ImageWidth", 4, "ThumbnailImageWidth");
    }

    public final int G(c cVar) throws IOException {
        HashMap[] mapArr;
        int i3;
        int[] iArr;
        int i4;
        e[][] eVarArr = f1643U;
        int[] iArr2 = new int[eVarArr.length];
        int[] iArr3 = new int[eVarArr.length];
        e[] eVarArr2 = f1644V;
        for (e eVar : eVarArr2) {
            x(eVar.f1619b);
        }
        if (this.f1664h) {
            if (this.f1665i) {
                x("StripOffsets");
                x("StripByteCounts");
            } else {
                x("JPEGInterchangeFormat");
                x("JPEGInterchangeFormatLength");
            }
        }
        int i5 = 0;
        while (true) {
            int length = eVarArr.length;
            mapArr = this.f1661e;
            if (i5 >= length) {
                break;
            }
            Iterator it2 = mapArr[i5].entrySet().iterator();
            while (it2.hasNext()) {
                if (((Map.Entry) it2.next()).getValue() == null) {
                    it2.remove();
                }
            }
            i5++;
        }
        if (mapArr[1].isEmpty()) {
            i3 = 1;
        } else {
            i3 = 1;
            mapArr[0].put(eVarArr2[1].f1619b, d.c(0L, this.f1663g));
        }
        if (!mapArr[2].isEmpty()) {
            mapArr[r7].put(eVarArr2[2].f1619b, d.c(0L, this.f1663g));
        }
        if (!mapArr[3].isEmpty()) {
            mapArr[i3].put(eVarArr2[3].f1619b, d.c(0L, this.f1663g));
        }
        int i6 = 4;
        if (this.f1664h) {
            if (this.f1665i) {
                mapArr[4].put("StripOffsets", d.f(0, this.f1663g));
                mapArr[4].put("StripByteCounts", d.f(this.f1668l, this.f1663g));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", d.c(0L, this.f1663g));
                mapArr[4].put("JPEGInterchangeFormatLength", d.c(this.f1668l, this.f1663g));
            }
        }
        int i7 = 0;
        while (true) {
            int length2 = eVarArr.length;
            iArr = f1641R;
            if (i7 >= length2) {
                break;
            }
            Iterator it3 = mapArr[i7].entrySet().iterator();
            int i8 = 0;
            while (it3.hasNext()) {
                d dVar = (d) ((Map.Entry) it3.next()).getValue();
                dVar.getClass();
                int i9 = iArr[dVar.f1614a] * dVar.f1615b;
                if (i9 > 4) {
                    i8 += i9;
                }
            }
            iArr3[i7] = iArr3[i7] + i8;
            i7++;
        }
        int size = 8;
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            if (!mapArr[i10].isEmpty()) {
                iArr2[i10] = size;
                size = (mapArr[i10].size() * 12) + 6 + iArr3[i10] + size;
            }
        }
        if (this.f1664h) {
            if (this.f1665i) {
                mapArr[4].put("StripOffsets", d.f(size, this.f1663g));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", d.c(size, this.f1663g));
            }
            this.f1667k = size;
            size += this.f1668l;
        }
        if (this.f1659c == 4) {
            size += 8;
        }
        if (u) {
            for (int i11 = 0; i11 < eVarArr.length; i11++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i11), Integer.valueOf(iArr2[i11]), Integer.valueOf(mapArr[i11].size()), Integer.valueOf(iArr3[i11]), Integer.valueOf(size)));
            }
        }
        if (!mapArr[i3].isEmpty()) {
            mapArr[0].put(eVarArr2[i3].f1619b, d.c(iArr2[i3], this.f1663g));
        }
        if (!mapArr[r6].isEmpty()) {
            mapArr[0].put(eVarArr2[r6].f1619b, d.c(iArr2[2], this.f1663g));
        }
        if (!mapArr[r6].isEmpty()) {
            mapArr[i3].put(eVarArr2[r6].f1619b, d.c(iArr2[3], this.f1663g));
        }
        int i12 = this.f1659c;
        if (i12 == 4) {
            if (size > 65535) {
                throw new IllegalStateException(B1.e.h("Size of exif data (", size, " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)"));
            }
            cVar.e(size);
            cVar.write(f1649b0);
        } else if (i12 == 13) {
            cVar.b(size);
            cVar.b(1700284774);
        } else if (i12 == 14) {
            cVar.write(f1633J);
            cVar.b(size);
        }
        int size2 = cVar.f1612k.size();
        cVar.c(this.f1663g == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.f1613l = this.f1663g;
        cVar.e(42);
        cVar.d(8L);
        int i13 = 0;
        while (i13 < eVarArr.length) {
            if (mapArr[i13].isEmpty()) {
                i4 = i6;
            } else {
                cVar.e(mapArr[i13].size());
                int size3 = (mapArr[i13].size() * 12) + iArr2[i13] + 2 + i6;
                for (Map.Entry entry : mapArr[i13].entrySet()) {
                    int i14 = ((e) f1645X[i13].get(entry.getKey())).f1618a;
                    d dVar2 = (d) entry.getValue();
                    dVar2.getClass();
                    int i15 = dVar2.f1615b;
                    int i16 = dVar2.f1614a;
                    int i17 = iArr[i16] * i15;
                    cVar.e(i14);
                    cVar.e(i16);
                    cVar.b(i15);
                    if (i17 > 4) {
                        cVar.d(size3);
                        size3 += i17;
                    } else {
                        cVar.write(dVar2.f1617d);
                        if (i17 < 4) {
                            while (i17 < 4) {
                                cVar.a(0);
                                i17++;
                            }
                        }
                    }
                    i6 = 4;
                }
                int i18 = i6;
                if (i13 != 0 || mapArr[i18].isEmpty()) {
                    cVar.d(0L);
                } else {
                    cVar.d(iArr2[i18]);
                }
                Iterator it4 = mapArr[i13].entrySet().iterator();
                while (it4.hasNext()) {
                    byte[] bArr = ((d) ((Map.Entry) it4.next()).getValue()).f1617d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
                i4 = 4;
            }
            i13++;
            i6 = i4;
        }
        if (this.f1664h) {
            cVar.write(m());
        }
        if (this.f1659c == 14 && size % 2 == i3) {
            cVar.a(0);
        }
        cVar.f1613l = ByteOrder.BIG_ENDIAN;
        return size2;
    }

    public final void H(c cVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f1670o = cVar.f1612k.size() + G(new c(byteArrayOutputStream, ByteOrder.BIG_ENDIAN));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        cVar.write(byteArray);
        CRC32 crc32 = new CRC32();
        crc32.update(byteArray, 4, byteArray.length - 4);
        cVar.b((int) crc32.getValue());
    }

    public final void I(c cVar) throws IOException {
        cVar.b(this.f1674s.f1617d.length + 22);
        CRC32 crc32 = new CRC32();
        cVar.b(1767135348);
        crc32.update(105);
        crc32.update(26964);
        crc32.update(6902872);
        crc32.update(1767135348);
        byte[] bArr = f1630G;
        cVar.write(bArr);
        crc32.update(bArr);
        cVar.write(this.f1674s.f1617d);
        crc32.update(this.f1674s.f1617d);
        cVar.b((int) crc32.getValue());
        this.f1675t = true;
    }

    public final void a() {
        String strB = b("DateTimeOriginal");
        HashMap[] mapArr = this.f1661e;
        if (strB != null && b("DateTime") == null) {
            mapArr[0].put("DateTime", d.b(strB));
        }
        if (b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", d.c(0L, this.f1663g));
        }
        if (b("ImageLength") == null) {
            mapArr[0].put("ImageLength", d.c(0L, this.f1663g));
        }
        if (b("Orientation") == null) {
            mapArr[0].put("Orientation", d.c(0L, this.f1663g));
        }
        if (b("LightSource") == null) {
            mapArr[1].put("LightSource", d.c(0L, this.f1663g));
        }
    }

    public final String b(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarC = c(str);
        if (dVarC != null) {
            int i3 = dVarC.f1614a;
            if (str.equals("GPSTimeStamp")) {
                if (i3 != 5 && i3 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i3);
                    return null;
                }
                f[] fVarArr = (f[]) dVarC.k(this.f1663g);
                if (fVarArr == null || fVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr));
                    return null;
                }
                f fVar = fVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (fVar.f1622a / fVar.f1623b));
                f fVar2 = fVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (fVar2.f1622a / fVar2.f1623b));
                f fVar3 = fVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (fVar3.f1622a / fVar3.f1623b)));
            }
            if (!f1646Y.contains(str)) {
                return dVarC.j(this.f1663g);
            }
            try {
                return Double.toString(dVarC.h(this.f1663g));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final d c(String str) {
        d dVar;
        int i3;
        d dVar2;
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (u) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i3 = this.f1659c) != 4 && ((i3 == 9 || i3 == 15 || i3 == 12 || i3 == 13) && (dVar2 = this.f1674s) != null)) {
            return dVar2;
        }
        for (int i4 = 0; i4 < f1643U.length; i4++) {
            d dVar3 = (d) this.f1661e[i4].get(str);
            if (dVar3 != null) {
                return dVar3;
            }
        }
        if (!"Xmp".equals(str) || (dVar = this.f1674s) == null) {
            return null;
        }
        return dVar;
    }

    public final void d(g gVar, int i3) {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i4;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIC files is supported from SDK 28 and above");
        }
        if (i3 == 15 && i5 < 31) {
            throw new UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(new a(gVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.f1661e;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", d.f(Integer.parseInt(strExtractMetadata), this.f1663g));
                }
                if (strExtractMetadata3 != null) {
                    mapArr[0].put("ImageLength", d.f(Integer.parseInt(strExtractMetadata3), this.f1663g));
                }
                if (strExtractMetadata2 != null) {
                    int i6 = Integer.parseInt(strExtractMetadata2);
                    if (i6 == 90) {
                        i4 = 6;
                    } else if (i6 != 180) {
                        i4 = i6 != 270 ? 1 : 8;
                    } else {
                        i4 = 3;
                    }
                    mapArr[0].put("Orientation", d.f(i4, this.f1663g));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i7 = Integer.parseInt(strExtractMetadata4);
                    int i8 = Integer.parseInt(strExtractMetadata5);
                    if (i8 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    gVar.b(i7);
                    byte[] bArr = new byte[6];
                    gVar.readFully(bArr);
                    int i9 = i7 + 6;
                    int i10 = i8 - 6;
                    if (!Arrays.equals(bArr, f1649b0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i10];
                    gVar.readFully(bArr2);
                    this.f1670o = i9;
                    v(bArr2, 0);
                }
                String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(41);
                String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(42);
                if (strExtractMetadata8 != null && strExtractMetadata9 != null) {
                    int i11 = Integer.parseInt(strExtractMetadata8);
                    int i12 = Integer.parseInt(strExtractMetadata9);
                    long j3 = i11;
                    gVar.b(j3);
                    byte[] bArr3 = new byte[i12];
                    gVar.readFully(bArr3);
                    this.f1674s = new d(j3, bArr3, 1, i12);
                    this.f1675t = true;
                }
                if (u) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata3 + ", rotation " + strExtractMetadata2);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e3) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e3);
            }
        } catch (Throwable th) {
            try {
                mediaMetadataRetriever.release();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1068)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final void e(Z.b r22, int r23, int r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.h.e(Z.b, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0142  */
    /* JADX WARN: Code duplicated, block: B:104:0x0144  */
    /* JADX WARN: Code duplicated, block: B:119:0x0163 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:121:0x0166  */
    /* JADX WARN: Code duplicated, block: B:124:0x016d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0176 A[LOOP:2: B:122:0x0168->B:127:0x0176, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:130:0x017c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:132:0x017f  */
    /* JADX WARN: Code duplicated, block: B:135:0x0186  */
    /* JADX WARN: Code duplicated, block: B:138:0x018f A[LOOP:3: B:133:0x0181->B:138:0x018f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:142:0x0199  */
    /* JADX WARN: Code duplicated, block: B:145:0x01a3 A[LOOP:4: B:140:0x0194->B:145:0x01a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:147:0x01a8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:149:0x01ab A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:168:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:174:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x018c A[EDGE_INSN: B:183:0x018c->B:137:0x018c BREAK  A[LOOP:3: B:133:0x0181->B:138:0x018f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x01a6 A[EDGE_INSN: B:184:0x01a6->B:146:0x01a6 BREAK  A[LOOP:4: B:140:0x0194->B:145:0x01a3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x018c A[EDGE_INSN: B:185:0x018c->B:137:0x018c BREAK  A[LOOP:3: B:133:0x0181->B:138:0x018f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00f1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:83:0x010f  */
    /* JADX WARN: Code duplicated, block: B:97:0x012b A[RETURN] */
    public final int f(BufferedInputStream bufferedInputStream) throws Throwable {
        b bVar;
        int i3;
        b bVar2;
        int i4;
        b bVar3;
        b bVar4;
        int i5;
        b bVar5;
        b bVar6;
        int i6;
        int i7;
        byte[] bArr;
        int i8;
        int i9;
        byte[] bArr2;
        int i10;
        byte[] bArr3;
        b bVar7;
        short s3;
        long j3;
        bufferedInputStream.mark(5000);
        byte[] bArr4 = new byte[5000];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i11 = 0;
        while (true) {
            byte[] bArr5 = x;
            if (i11 >= bArr5.length) {
                return 4;
            }
            if (bArr4[i11] != bArr5[i11]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i12 = 0; i12 < bytes.length; i12++) {
                    if (bArr4[i12] != bytes[i12]) {
                        int i13 = 1;
                        try {
                            bVar2 = new b(bArr4);
                            try {
                                try {
                                    long j4 = bVar2.readInt();
                                    byte[] bArr6 = new byte[4];
                                    bVar2.readFully(bArr6);
                                    if (Arrays.equals(bArr6, y)) {
                                        if (j4 == 1) {
                                            j4 = bVar2.readLong();
                                            j3 = 16;
                                            if (j4 < 16) {
                                                bVar2.close();
                                                i3 = 0;
                                                i4 = 0;
                                            }
                                        } else {
                                            j3 = 8;
                                        }
                                        i3 = 0;
                                        long j5 = 5000;
                                        if (j4 > j5) {
                                            j4 = j5;
                                        }
                                        long j6 = j4 - j3;
                                        if (j6 >= 8) {
                                            try {
                                                byte[] bArr7 = new byte[4];
                                                long j7 = 0;
                                                boolean z3 = false;
                                                boolean z4 = false;
                                                boolean z5 = false;
                                                while (true) {
                                                    if (j7 < j6 / 4) {
                                                        try {
                                                            bVar2.readFully(bArr7);
                                                            if (j7 != 1) {
                                                                if (Arrays.equals(bArr7, f1656z)) {
                                                                    z3 = true;
                                                                } else if (Arrays.equals(bArr7, f1624A)) {
                                                                    z4 = true;
                                                                } else if (Arrays.equals(bArr7, f1625B) || Arrays.equals(bArr7, f1626C)) {
                                                                    z5 = true;
                                                                }
                                                                if (!z3) {
                                                                    continue;
                                                                } else if (z4) {
                                                                    bVar2.close();
                                                                    i4 = 12;
                                                                } else if (z5) {
                                                                    bVar2.close();
                                                                    i4 = 15;
                                                                }
                                                            }
                                                            j7++;
                                                        } catch (EOFException unused) {
                                                            bVar2.close();
                                                            i4 = i3;
                                                        }
                                                    }
                                                }
                                            } catch (Exception e3) {
                                                e = e3;
                                                if (u) {
                                                    Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                                }
                                                if (bVar2 != null) {
                                                }
                                                i4 = i3;
                                                if (i4 != 0) {
                                                    return i4;
                                                }
                                                try {
                                                    bVar4 = new b(bArr4);
                                                    try {
                                                        ByteOrder byteOrderU = u(bVar4);
                                                        this.f1663g = byteOrderU;
                                                        bVar4.f1610m = byteOrderU;
                                                        s3 = bVar4.readShort();
                                                        if (s3 != 20306) {
                                                            i5 = 1;
                                                        } else {
                                                            i5 = 1;
                                                        }
                                                        bVar4.close();
                                                    } catch (Exception unused2) {
                                                        if (bVar4 != null) {
                                                            bVar4.close();
                                                        }
                                                        i5 = i3;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        bVar3 = bVar4;
                                                        if (bVar3 != null) {
                                                            bVar3.close();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Exception unused3) {
                                                    bVar4 = null;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    bVar3 = null;
                                                }
                                                if (i5 != 0) {
                                                    return 7;
                                                }
                                                try {
                                                    bVar7 = new b(bArr4);
                                                    try {
                                                        ByteOrder byteOrderU2 = u(bVar7);
                                                        this.f1663g = byteOrderU2;
                                                        bVar7.f1610m = byteOrderU2;
                                                        if (bVar7.readShort() == 85) {
                                                            i6 = 1;
                                                        } else {
                                                            i6 = i3;
                                                        }
                                                        bVar7.close();
                                                    } catch (Exception unused4) {
                                                        bVar6 = bVar7;
                                                        if (bVar6 != null) {
                                                            bVar6.close();
                                                        }
                                                        i6 = i3;
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        bVar5 = bVar7;
                                                        if (bVar5 != null) {
                                                            bVar5.close();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Exception unused5) {
                                                    bVar6 = null;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    bVar5 = null;
                                                }
                                                if (i6 != 0) {
                                                    return 10;
                                                }
                                                i7 = i3;
                                                while (true) {
                                                    bArr = f1629F;
                                                    if (i7 < bArr.length) {
                                                        i8 = 1;
                                                        break;
                                                    }
                                                    if (bArr4[i7] != bArr[i7]) {
                                                        i8 = i3;
                                                        break;
                                                    }
                                                    i7++;
                                                }
                                                if (i8 != 0) {
                                                    return 13;
                                                }
                                                i9 = i3;
                                                while (true) {
                                                    bArr2 = f1631H;
                                                    if (i9 < bArr2.length) {
                                                        i10 = i3;
                                                        while (true) {
                                                            bArr3 = f1632I;
                                                            if (i10 >= bArr3.length) {
                                                                break;
                                                            }
                                                            if (bArr4[bArr2.length + i10 + 4] != bArr3[i10]) {
                                                                break;
                                                            }
                                                            i10++;
                                                        }
                                                        if (i13 != 0) {
                                                            return 14;
                                                        }
                                                        return i3;
                                                    }
                                                    if (bArr4[i9] != bArr2[i9]) {
                                                        break;
                                                    }
                                                    i9++;
                                                }
                                                i13 = i3;
                                                if (i13 != 0) {
                                                    return 14;
                                                }
                                                return i3;
                                            }
                                        }
                                        bVar2.close();
                                        i4 = i3;
                                    } else {
                                        bVar2.close();
                                        i3 = 0;
                                        i4 = 0;
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    i3 = 0;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                bVar = bVar2;
                                if (bVar != null) {
                                    bVar.close();
                                }
                                throw th;
                            }
                        } catch (Exception e5) {
                            e = e5;
                            i3 = 0;
                            bVar2 = null;
                        } catch (Throwable th6) {
                            th = th6;
                            bVar = null;
                        }
                        if (i4 != 0) {
                            return i4;
                        }
                        bVar4 = new b(bArr4);
                        ByteOrder byteOrderU3 = u(bVar4);
                        this.f1663g = byteOrderU3;
                        bVar4.f1610m = byteOrderU3;
                        s3 = bVar4.readShort();
                        if (s3 != 20306 || s3 == 21330) {
                            i5 = 1;
                        } else {
                            i5 = i3;
                        }
                        bVar4.close();
                        if (i5 != 0) {
                            return 7;
                        }
                        bVar7 = new b(bArr4);
                        ByteOrder byteOrderU4 = u(bVar7);
                        this.f1663g = byteOrderU4;
                        bVar7.f1610m = byteOrderU4;
                        if (bVar7.readShort() == 85) {
                            i6 = 1;
                        } else {
                            i6 = i3;
                        }
                        bVar7.close();
                        if (i6 != 0) {
                            return 10;
                        }
                        i7 = i3;
                        while (true) {
                            bArr = f1629F;
                            if (i7 < bArr.length) {
                                i8 = 1;
                                break;
                            }
                            if (bArr4[i7] != bArr[i7]) {
                                i8 = i3;
                                break;
                            }
                            i7++;
                        }
                        if (i8 != 0) {
                            return 13;
                        }
                        i9 = i3;
                        while (true) {
                            bArr2 = f1631H;
                            if (i9 < bArr2.length) {
                                i10 = i3;
                                while (true) {
                                    bArr3 = f1632I;
                                    if (i10 >= bArr3.length) {
                                        break;
                                        break;
                                    }
                                    if (bArr4[bArr2.length + i10 + 4] != bArr3[i10]) {
                                        break;
                                        break;
                                    }
                                    i10++;
                                }
                                if (i13 != 0) {
                                    return 14;
                                }
                                return i3;
                            }
                            if (bArr4[i9] != bArr2[i9]) {
                                break;
                                break;
                            }
                            i9++;
                        }
                        i13 = i3;
                        if (i13 != 0) {
                            return 14;
                        }
                        return i3;
                    }
                }
                return 9;
            }
            i11++;
        }
    }

    public final void g(g gVar) throws Throwable {
        int i3;
        int i4;
        j(gVar);
        HashMap[] mapArr = this.f1661e;
        d dVar = (d) mapArr[1].get("MakerNote");
        if (dVar != null) {
            g gVar2 = new g(dVar.f1617d);
            gVar2.f1610m = this.f1663g;
            byte[] bArr = f1627D;
            byte[] bArr2 = new byte[bArr.length];
            gVar2.readFully(bArr2);
            gVar2.b(0L);
            byte[] bArr3 = f1628E;
            byte[] bArr4 = new byte[bArr3.length];
            gVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                gVar2.b(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                gVar2.b(12L);
            }
            w(gVar2, 6);
            d dVar2 = (d) mapArr[7].get("PreviewImageStart");
            d dVar3 = (d) mapArr[7].get("PreviewImageLength");
            if (dVar2 != null && dVar3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", dVar2);
                mapArr[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            d dVar4 = (d) mapArr[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.k(this.f1663g);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i5 = iArr[2];
                int i6 = iArr[0];
                if (i5 <= i6 || (i3 = iArr[3]) <= (i4 = iArr[1])) {
                    return;
                }
                int i7 = (i5 - i6) + 1;
                int i8 = (i3 - i4) + 1;
                if (i7 < i8) {
                    int i9 = i7 + i8;
                    i8 = i9 - i8;
                    i7 = i9 - i8;
                }
                d dVarF = d.f(i7, this.f1663g);
                d dVarF2 = d.f(i8, this.f1663g);
                mapArr[0].put("ImageWidth", dVarF);
                mapArr[0].put("ImageLength", dVarF2);
            }
        }
    }

    public final void h(b bVar) throws Throwable {
        if (u) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f1610m = ByteOrder.BIG_ENDIAN;
        int i3 = bVar.f1609l;
        bVar.a(f1629F.length);
        boolean z3 = false;
        boolean z4 = false;
        while (true) {
            if (z3 && z4) {
                break;
            }
            try {
                int i4 = bVar.readInt();
                int i5 = bVar.readInt();
                int i6 = bVar.f1609l;
                int i7 = i6 + i4 + 4;
                int i8 = i6 - i3;
                if (i8 == 16 && i5 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (i5 == 1229278788) {
                    break;
                }
                if (i5 == 1700284774 && !z3) {
                    this.f1670o = i8;
                    byte[] bArr = new byte[i4];
                    bVar.readFully(bArr);
                    int i9 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(i5 >>> 24);
                    crc32.update(i5 >>> 16);
                    crc32.update(i5 >>> 8);
                    crc32.update(i5);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != i9) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i9 + ", calculated CRC value: " + crc32.getValue());
                    }
                    v(bArr, 0);
                    F();
                    C(new b(bArr));
                    z3 = true;
                } else if (i5 == 1767135348 && !z4) {
                    byte[] bArr2 = f1630G;
                    if (i4 >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        bVar.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i10 = bVar.f1609l - i3;
                            int i11 = i4 - length;
                            byte[] bArr4 = new byte[i11];
                            bVar.readFully(bArr4);
                            this.f1674s = new d(i10, bArr4, 1, i11);
                            z4 = true;
                        }
                    }
                }
                bVar.a(i7 - bVar.f1609l);
            } catch (EOFException e3) {
                throw new IOException("Encountered corrupt PNG file.", e3);
            }
        }
        this.f1675t = z4;
    }

    public final void i(b bVar) throws Throwable {
        boolean z3 = u;
        if (z3) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i3 = ByteBuffer.wrap(bArr).getInt();
        int i4 = ByteBuffer.wrap(bArr2).getInt();
        int i5 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i4];
        bVar.a(i3 - bVar.f1609l);
        bVar.readFully(bArr4);
        e(new b(bArr4), i3, 5);
        bVar.a(i5 - bVar.f1609l);
        bVar.f1610m = ByteOrder.BIG_ENDIAN;
        int i6 = bVar.readInt();
        if (z3) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i6);
        }
        for (int i7 = 0; i7 < i6; i7++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == f1642T.f1618a) {
                short s3 = bVar.readShort();
                short s4 = bVar.readShort();
                d dVarF = d.f(s3, this.f1663g);
                d dVarF2 = d.f(s4, this.f1663g);
                HashMap[] mapArr = this.f1661e;
                mapArr[0].put("ImageLength", dVarF);
                mapArr[0].put("ImageWidth", dVarF2);
                if (z3) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s3) + ", width: " + ((int) s4));
                    return;
                }
                return;
            }
            bVar.a(unsignedShort2);
        }
    }

    public final void j(g gVar) throws Throwable {
        s(gVar);
        w(gVar, 0);
        E(gVar, 0);
        E(gVar, 5);
        E(gVar, 4);
        F();
        if (this.f1659c == 8) {
            HashMap[] mapArr = this.f1661e;
            d dVar = (d) mapArr[1].get("MakerNote");
            if (dVar != null) {
                g gVar2 = new g(dVar.f1617d);
                gVar2.f1610m = this.f1663g;
                gVar2.a(6);
                w(gVar2, 9);
                d dVar2 = (d) mapArr[9].get("ColorSpace");
                if (dVar2 != null) {
                    mapArr[1].put("ColorSpace", dVar2);
                }
            }
        }
    }

    public final void k(g gVar) throws Throwable {
        if (u) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + gVar);
        }
        j(gVar);
        HashMap[] mapArr = this.f1661e;
        d dVar = (d) mapArr[0].get("JpgFromRaw");
        if (dVar != null) {
            e(new b(dVar.f1617d), (int) dVar.f1616c, 5);
        }
        d dVar2 = (d) mapArr[0].get("ISO");
        d dVar3 = (d) mapArr[1].get("PhotographicSensitivity");
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", dVar2);
    }

    public final boolean l(g gVar) throws IOException {
        byte[] bArr = f1649b0;
        byte[] bArr2 = new byte[bArr.length];
        gVar.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            Log.w("ExifInterface", "Given data is not EXIF-only.");
            return false;
        }
        byte[] bArrCopyOf = new byte[1024];
        int i3 = 0;
        while (true) {
            if (i3 == bArrCopyOf.length) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
            }
            int i4 = gVar.f1608k.read(bArrCopyOf, i3, bArrCopyOf.length - i3);
            if (i4 == -1) {
                byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i3);
                this.f1670o = bArr.length;
                v(bArrCopyOf2, 0);
                return true;
            }
            i3 += i4;
            gVar.f1609l += i4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final byte[] m() throws Throwable {
        FileDescriptor fileDescriptor;
        FileInputStream fileInputStream;
        FileDescriptor fileDescriptor2;
        FileInputStream fileInputStream2;
        FileInputStream fileInputStream3 = null;
        if (this.f1664h) {
            byte[] bArr = this.f1669m;
            if (bArr != null) {
                return bArr;
            }
            try {
                if (this.f1657a != null) {
                    fileInputStream2 = new FileInputStream(this.f1657a);
                    fileDescriptor = null;
                } else {
                    FileDescriptor fileDescriptorDup = Os.dup(this.f1658b);
                    try {
                        Os.lseek(fileDescriptorDup, 0L, OsConstants.SEEK_SET);
                        fileDescriptor = fileDescriptorDup;
                        fileInputStream2 = new FileInputStream(fileDescriptorDup);
                    } catch (Exception e3) {
                        fileDescriptor2 = fileDescriptorDup;
                        e = e3;
                        fileInputStream = null;
                        try {
                            Log.d("ExifInterface", "Encountered exception while getting thumbnail", e);
                            H2.h.e(fileInputStream);
                            if (fileDescriptor2 != null) {
                                try {
                                    Os.close(fileDescriptor2);
                                } catch (ErrnoException e4) {
                                    Log.e("ExifInterfaceUtils", "Error closing fd.", e4);
                                }
                            }
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream3 = fileInputStream;
                            fileDescriptor = fileDescriptor2;
                            H2.h.e(fileInputStream3);
                            if (fileDescriptor != null) {
                                try {
                                    Os.close(fileDescriptor);
                                } catch (ErrnoException e5) {
                                    Log.e("ExifInterfaceUtils", "Error closing fd.", e5);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileDescriptor = fileDescriptorDup;
                        H2.h.e(fileInputStream3);
                        if (fileDescriptor != null) {
                            Os.close(fileDescriptor);
                        }
                        throw th;
                    }
                }
                try {
                    b bVar = new b(fileInputStream2);
                    bVar.a(this.f1667k + this.f1670o);
                    byte[] bArr2 = new byte[this.f1668l];
                    bVar.readFully(bArr2);
                    this.f1669m = bArr2;
                    H2.h.e(fileInputStream2);
                    if (fileDescriptor != null) {
                        try {
                            Os.close(fileDescriptor);
                            return bArr2;
                        } catch (ErrnoException e6) {
                            Log.e("ExifInterfaceUtils", "Error closing fd.", e6);
                        }
                    }
                    return bArr2;
                } catch (Exception e7) {
                    FileDescriptor fileDescriptor3 = fileDescriptor;
                    fileInputStream = fileInputStream2;
                    e = e7;
                    fileDescriptor2 = fileDescriptor3;
                    Log.d("ExifInterface", "Encountered exception while getting thumbnail", e);
                    H2.h.e(fileInputStream);
                    if (fileDescriptor2 != null) {
                        Os.close(fileDescriptor2);
                    }
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream3 = fileInputStream2;
                    H2.h.e(fileInputStream3);
                    if (fileDescriptor != null) {
                        Os.close(fileDescriptor);
                    }
                    throw th;
                }
            } catch (Exception e8) {
                e = e8;
                fileInputStream = null;
                fileDescriptor2 = null;
            } catch (Throwable th4) {
                th = th4;
                fileDescriptor = null;
            }
        }
        return null;
    }

    public final void n(b bVar) throws Throwable {
        if (u) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f1610m = ByteOrder.LITTLE_ENDIAN;
        bVar.a(f1631H.length);
        int i3 = bVar.readInt() + 8;
        byte[] bArr = f1632I;
        bVar.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i4 = bVar.readInt();
                int i5 = length + 8;
                if (Arrays.equals(f1633J, bArr2)) {
                    byte[] bArrCopyOfRange = new byte[i4];
                    bVar.readFully(bArrCopyOfRange);
                    byte[] bArr3 = f1649b0;
                    if (H2.h.D(bArrCopyOfRange, bArr3)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr3.length, i4);
                    }
                    this.f1670o = i5;
                    v(bArrCopyOfRange, 0);
                    C(new b(bArrCopyOfRange));
                    return;
                }
                if (i4 % 2 == 1) {
                    i4++;
                }
                length = i5 + i4;
                if (length == i3) {
                    return;
                }
                if (length > i3) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.a(i4);
            } catch (EOFException e3) {
                throw new IOException("Encountered corrupt WebP file.", e3);
            }
        }
    }

    public final void p(b bVar, HashMap map) throws Throwable {
        d dVar = (d) map.get("JPEGInterchangeFormat");
        d dVar2 = (d) map.get("JPEGInterchangeFormatLength");
        if (dVar == null || dVar2 == null) {
            return;
        }
        int i3 = dVar.i(this.f1663g);
        int i4 = dVar2.i(this.f1663g);
        if (this.f1659c == 7) {
            i3 += this.f1671p;
        }
        if (i3 > 0 && i4 > 0) {
            this.f1664h = true;
            if (this.f1657a == null && this.f1658b == null) {
                byte[] bArr = new byte[i4];
                bVar.a(i3);
                bVar.readFully(bArr);
                this.f1669m = bArr;
            }
            this.f1667k = i3;
            this.f1668l = i4;
        }
        if (u) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + i3 + ", length: " + i4);
        }
    }

    public final boolean q(HashMap map) {
        d dVar = (d) map.get("ImageLength");
        d dVar2 = (d) map.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.i(this.f1663g) <= 512 && dVar2.i(this.f1663g) <= 512;
    }

    public final void r(InputStream inputStream) {
        boolean z3 = u;
        for (int i3 = 0; i3 < f1643U.length; i3++) {
            try {
                try {
                    this.f1661e[i3] = new HashMap();
                } catch (Throwable th) {
                    a();
                    if (z3) {
                        t();
                    }
                    throw th;
                }
            } catch (IOException | UnsupportedOperationException e3) {
                if (z3) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e3);
                }
                a();
                if (z3) {
                    t();
                    return;
                }
                return;
            }
        }
        boolean z4 = this.f1660d;
        if (!z4) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f1659c = f(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        int i4 = this.f1659c;
        if (i4 == 4 || i4 == 9 || i4 == 13 || i4 == 14) {
            b bVar = new b(inputStream);
            int i5 = this.f1659c;
            if (i5 == 4) {
                e(bVar, 0, 0);
            } else if (i5 == 13) {
                h(bVar);
            } else if (i5 == 9) {
                i(bVar);
            } else if (i5 == 14) {
                n(bVar);
            }
        } else {
            g gVar = new g(inputStream);
            if (!z4) {
                int i6 = this.f1659c;
                if (i6 == 12 || i6 == 15) {
                    d(gVar, i6);
                } else if (i6 == 7) {
                    g(gVar);
                } else if (i6 == 10) {
                    k(gVar);
                } else {
                    j(gVar);
                }
            } else if (!l(gVar)) {
                a();
                if (z3) {
                    t();
                    return;
                }
                return;
            }
            gVar.b(this.f1670o);
            C(gVar);
        }
        a();
        if (z3) {
            t();
        }
    }

    public final void s(g gVar) throws IOException {
        ByteOrder byteOrderU = u(gVar);
        this.f1663g = byteOrderU;
        gVar.f1610m = byteOrderU;
        int unsignedShort = gVar.readUnsignedShort();
        int i3 = this.f1659c;
        if (i3 != 7 && i3 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i4 = gVar.readInt();
        if (i4 < 8) {
            throw new IOException(B1.e.g("Invalid first Ifd offset: ", i4));
        }
        int i5 = i4 - 8;
        if (i5 > 0) {
            gVar.a(i5);
        }
    }

    public final void t() {
        int i3 = 0;
        while (true) {
            HashMap[] mapArr = this.f1661e;
            if (i3 >= mapArr.length) {
                return;
            }
            Log.d("ExifInterface", "The size of tag group[" + i3 + "]: " + mapArr[i3].size());
            for (Map.Entry entry : mapArr[i3].entrySet()) {
                d dVar = (d) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + dVar.toString() + ", tagValue: '" + dVar.j(this.f1663g) + "'");
            }
            i3++;
        }
    }

    public final void v(byte[] bArr, int i3) throws IOException {
        g gVar = new g(bArr);
        s(gVar);
        w(gVar, i3);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0210  */
    /* JADX WARN: Code duplicated, block: B:103:0x0214  */
    /* JADX WARN: Code duplicated, block: B:108:0x0221  */
    /* JADX WARN: Code duplicated, block: B:109:0x0226  */
    /* JADX WARN: Code duplicated, block: B:110:0x0232  */
    /* JADX WARN: Code duplicated, block: B:112:0x0239  */
    /* JADX WARN: Code duplicated, block: B:115:0x0253 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x025b  */
    /* JADX WARN: Code duplicated, block: B:127:0x0299  */
    /* JADX WARN: Code duplicated, block: B:129:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:132:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:134:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:137:0x0301  */
    /* JADX WARN: Code duplicated, block: B:139:0x0309  */
    /* JADX WARN: Code duplicated, block: B:148:0x0333  */
    /* JADX WARN: Code duplicated, block: B:175:0x0336 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x014f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0158  */
    /* JADX WARN: Code duplicated, block: B:74:0x0160  */
    /* JADX WARN: Code duplicated, block: B:76:0x0166  */
    /* JADX WARN: Code duplicated, block: B:77:0x017a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0181  */
    /* JADX WARN: Code duplicated, block: B:82:0x018b  */
    /* JADX WARN: Code duplicated, block: B:83:0x018d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0191  */
    /* JADX WARN: Code duplicated, block: B:86:0x0194  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:93:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:95:0x0206  */
    /* JADX WARN: Code duplicated, block: B:97:0x0209  */
    /* JADX WARN: Code duplicated, block: B:99:0x020c  */
    /* JADX WARN: Instruction removed from duplicated block: B:127:0x0299, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:129:0x02a9, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x0166, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:93:0x01eb, please report this as an issue */
    public final void w(g gVar, int i3) throws IOException {
        HashMap[] mapArr;
        long j3;
        long j4;
        boolean z3;
        int i4;
        long j5;
        Integer num;
        HashSet hashSet;
        long j6;
        String str;
        int unsignedShort;
        long j7;
        String str2;
        int i5;
        int i6 = gVar.f1609l;
        int i7 = gVar.f1611o;
        Integer numValueOf = Integer.valueOf(i6);
        HashSet hashSet2 = this.f1662f;
        hashSet2.add(numValueOf);
        short s3 = gVar.readShort();
        boolean z4 = u;
        if (z4) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s3));
        }
        if (s3 <= 0) {
            return;
        }
        short s4 = 0;
        while (true) {
            mapArr = this.f1661e;
            if (s4 >= s3) {
                break;
            }
            int unsignedShort2 = gVar.readUnsignedShort();
            int unsignedShort3 = gVar.readUnsignedShort();
            int i8 = gVar.readInt();
            long j8 = ((long) gVar.f1609l) + 4;
            short s5 = s3;
            e eVar = (e) W[i3].get(Integer.valueOf(unsignedShort2));
            if (z4) {
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i3), Integer.valueOf(unsignedShort2), eVar != null ? eVar.f1619b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i8)));
            }
            if (eVar != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = f1641R;
                    if (unsignedShort3 < iArr.length) {
                        int i9 = eVar.f1620c;
                        if (i9 == 7 || unsignedShort3 == 7 || i9 == unsignedShort3 || (i4 = eVar.f1621d) == unsignedShort3 || (((i9 == 4 || i4 == 4) && unsignedShort3 == 3) || (((i9 == 9 || i4 == 9) && unsignedShort3 == 8) || ((i9 == 12 || i4 == 12) && unsignedShort3 == 11)))) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = i9;
                            }
                            j3 = j8;
                            j4 = ((long) i8) * ((long) iArr[unsignedShort3]);
                            if (j4 < 0 || j4 > 2147483647L) {
                                if (z4 != 0) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i8);
                                }
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                        } else if (z4 != 0) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + f1640Q[unsignedShort3] + ") is unexpected for tag: " + eVar.f1619b);
                        }
                    }
                    if (z3) {
                        j5 = j3;
                        if (j4 > 4) {
                            i5 = gVar.readInt();
                            if (z4 != 0) {
                                Log.d("ExifInterface", "seek to data offset: " + i5);
                            }
                            if (this.f1659c == 7) {
                                if ("MakerNote".equals(eVar.f1619b)) {
                                    this.f1671p = i5;
                                } else if (i3 != 6 && "ThumbnailImage".equals(eVar.f1619b)) {
                                    this.f1672q = i5;
                                    this.f1673r = i8;
                                    d dVarF = d.f(6, this.f1663g);
                                    d dVarC = d.c(this.f1672q, this.f1663g);
                                    d dVarC2 = d.c(this.f1673r, this.f1663g);
                                    mapArr[4].put("Compression", dVarF);
                                    mapArr[4].put("JPEGInterchangeFormat", dVarC);
                                    mapArr[4].put("JPEGInterchangeFormatLength", dVarC2);
                                }
                            }
                            gVar.b(i5);
                        } else {
                            j5 = j5;
                            unsignedShort2 = unsignedShort2;
                            eVar = eVar;
                        }
                        num = (Integer) f1647Z.get(Integer.valueOf(unsignedShort2));
                        if (z4 != 0) {
                            Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j4);
                        }
                        if (num != null) {
                            if (unsignedShort3 != 3) {
                                if (unsignedShort3 == 4) {
                                    j7 = ((long) gVar.readInt()) & 4294967295L;
                                } else if (unsignedShort3 == 8) {
                                    unsignedShort = gVar.readShort();
                                } else if (unsignedShort3 != 9 || unsignedShort3 == 13) {
                                    unsignedShort = gVar.readInt();
                                } else {
                                    j7 = -1;
                                }
                                if (z4 != 0) {
                                    Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j7), eVar.f1619b));
                                }
                                if (j7 > 0 || (i7 != -1 && j7 >= i7)) {
                                    hashSet = hashSet2;
                                    if (z4 != 0) {
                                        str2 = "Skip jump into the IFD since its offset is invalid: " + j7;
                                        if (i7 != -1) {
                                            str2 = str2 + " (total length: " + i7 + ")";
                                        }
                                        Log.d("ExifInterface", str2);
                                    }
                                } else {
                                    hashSet = hashSet2;
                                    if (!hashSet.contains(Integer.valueOf((int) j7))) {
                                        gVar.b(j7);
                                        w(gVar, num.intValue());
                                    } else if (z4 != 0) {
                                        Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j7 + ")");
                                    }
                                }
                                gVar.b(j5);
                            } else {
                                unsignedShort = gVar.readUnsignedShort();
                            }
                            j7 = unsignedShort;
                            if (z4 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j7), eVar.f1619b));
                            }
                            if (j7 > 0) {
                                hashSet = hashSet2;
                                if (z4 != 0) {
                                    str2 = "Skip jump into the IFD since its offset is invalid: " + j7;
                                    if (i7 != -1) {
                                        str2 = str2 + " (total length: " + i7 + ")";
                                    }
                                    Log.d("ExifInterface", str2);
                                }
                            } else {
                                hashSet = hashSet2;
                                if (z4 != 0) {
                                    str2 = "Skip jump into the IFD since its offset is invalid: " + j7;
                                    if (i7 != -1) {
                                        str2 = str2 + " (total length: " + i7 + ")";
                                    }
                                    Log.d("ExifInterface", str2);
                                }
                            }
                            gVar.b(j5);
                        } else {
                            hashSet = hashSet2;
                            j6 = j5;
                            int i10 = gVar.f1609l + this.f1670o;
                            byte[] bArr = new byte[(int) j4];
                            gVar.readFully(bArr);
                            d dVar = new d(i10, bArr, unsignedShort3, i8);
                            HashMap map = mapArr[i3];
                            str = eVar.f1619b;
                            map.put(str, dVar);
                            if ("DNGVersion".equals(str)) {
                                this.f1659c = 3;
                            }
                            if (((!"Make".equals(str) || "Model".equals(str)) && dVar.j(this.f1663g).contains("PENTAX")) || ("Compression".equals(str) && dVar.i(this.f1663g) == 65535)) {
                                this.f1659c = 8;
                            }
                            if (gVar.f1609l != j6) {
                                gVar.b(j6);
                            }
                        }
                    } else {
                        gVar.b(j3);
                        hashSet = hashSet2;
                    }
                    s4 = (short) (s4 + 1);
                    hashSet2 = hashSet;
                    s3 = s5;
                    z4 = z4;
                }
                j3 = j8;
                if (z4 != 0) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j4 = 0;
                z3 = false;
                if (z3) {
                    gVar.b(j3);
                    hashSet = hashSet2;
                } else {
                    j5 = j3;
                    if (j4 > 4) {
                        i5 = gVar.readInt();
                        if (z4 != 0) {
                            Log.d("ExifInterface", "seek to data offset: " + i5);
                        }
                        if (this.f1659c == 7) {
                            if ("MakerNote".equals(eVar.f1619b)) {
                                this.f1671p = i5;
                            } else if (i3 != 6) {
                            }
                        }
                        gVar.b(i5);
                    } else {
                        j5 = j5;
                        unsignedShort2 = unsignedShort2;
                        eVar = eVar;
                    }
                    num = (Integer) f1647Z.get(Integer.valueOf(unsignedShort2));
                    if (z4 != 0) {
                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j4);
                    }
                    if (num != null) {
                        if (unsignedShort3 != 3) {
                            if (unsignedShort3 == 4) {
                                j7 = ((long) gVar.readInt()) & 4294967295L;
                            } else if (unsignedShort3 == 8) {
                                if (unsignedShort3 != 9) {
                                }
                                unsignedShort = gVar.readInt();
                            } else {
                                unsignedShort = gVar.readShort();
                            }
                            if (z4 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j7), eVar.f1619b));
                            }
                            if (j7 > 0) {
                                hashSet = hashSet2;
                                if (z4 != 0) {
                                    str2 = "Skip jump into the IFD since its offset is invalid: " + j7;
                                    if (i7 != -1) {
                                        str2 = str2 + " (total length: " + i7 + ")";
                                    }
                                    Log.d("ExifInterface", str2);
                                }
                            } else {
                                hashSet = hashSet2;
                                if (z4 != 0) {
                                    str2 = "Skip jump into the IFD since its offset is invalid: " + j7;
                                    if (i7 != -1) {
                                        str2 = str2 + " (total length: " + i7 + ")";
                                    }
                                    Log.d("ExifInterface", str2);
                                }
                            }
                            gVar.b(j5);
                        } else {
                            unsignedShort = gVar.readUnsignedShort();
                        }
                        j7 = unsignedShort;
                        if (z4 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j7), eVar.f1619b));
                        }
                        if (j7 > 0) {
                            hashSet = hashSet2;
                            if (z4 != 0) {
                                str2 = "Skip jump into the IFD since its offset is invalid: " + j7;
                                if (i7 != -1) {
                                    str2 = str2 + " (total length: " + i7 + ")";
                                }
                                Log.d("ExifInterface", str2);
                            }
                        } else {
                            hashSet = hashSet2;
                            if (z4 != 0) {
                                str2 = "Skip jump into the IFD since its offset is invalid: " + j7;
                                if (i7 != -1) {
                                    str2 = str2 + " (total length: " + i7 + ")";
                                }
                                Log.d("ExifInterface", str2);
                            }
                        }
                        gVar.b(j5);
                    } else {
                        hashSet = hashSet2;
                        j6 = j5;
                        int i11 = gVar.f1609l + this.f1670o;
                        byte[] bArr2 = new byte[(int) j4];
                        gVar.readFully(bArr2);
                        d dVar2 = new d(i11, bArr2, unsignedShort3, i8);
                        HashMap map2 = mapArr[i3];
                        str = eVar.f1619b;
                        map2.put(str, dVar2);
                        if ("DNGVersion".equals(str)) {
                            this.f1659c = 3;
                        }
                        if (!"Make".equals(str)) {
                        }
                        this.f1659c = 8;
                        if (gVar.f1609l != j6) {
                            gVar.b(j6);
                        }
                    }
                }
                s4 = (short) (s4 + 1);
                hashSet2 = hashSet;
                s3 = s5;
                z4 = z4;
            } else if (z4) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            j3 = j8;
            j4 = 0;
            z3 = false;
            if (z3) {
                gVar.b(j3);
                hashSet = hashSet2;
            } else {
                j5 = j3;
                if (j4 > 4) {
                    i5 = gVar.readInt();
                    if (z4 != 0) {
                        Log.d("ExifInterface", "seek to data offset: " + i5);
                    }
                    if (this.f1659c == 7) {
                        if ("MakerNote".equals(eVar.f1619b)) {
                            this.f1671p = i5;
                        } else if (i3 != 6) {
                        }
                    }
                    gVar.b(i5);
                } else {
                    j5 = j5;
                    unsignedShort2 = unsignedShort2;
                    eVar = eVar;
                }
                num = (Integer) f1647Z.get(Integer.valueOf(unsignedShort2));
                if (z4 != 0) {
                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j4);
                }
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == 4) {
                            j7 = ((long) gVar.readInt()) & 4294967295L;
                        } else if (unsignedShort3 == 8) {
                            if (unsignedShort3 != 9) {
                            }
                            unsignedShort = gVar.readInt();
                        } else {
                            unsignedShort = gVar.readShort();
                        }
                        if (z4 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j7), eVar.f1619b));
                        }
                        if (j7 > 0) {
                            hashSet = hashSet2;
                            if (z4 != 0) {
                                str2 = "Skip jump into the IFD since its offset is invalid: " + j7;
                                if (i7 != -1) {
                                    str2 = str2 + " (total length: " + i7 + ")";
                                }
                                Log.d("ExifInterface", str2);
                            }
                        } else {
                            hashSet = hashSet2;
                            if (z4 != 0) {
                                str2 = "Skip jump into the IFD since its offset is invalid: " + j7;
                                if (i7 != -1) {
                                    str2 = str2 + " (total length: " + i7 + ")";
                                }
                                Log.d("ExifInterface", str2);
                            }
                        }
                        gVar.b(j5);
                    } else {
                        unsignedShort = gVar.readUnsignedShort();
                    }
                    j7 = unsignedShort;
                    if (z4 != 0) {
                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j7), eVar.f1619b));
                    }
                    if (j7 > 0) {
                        hashSet = hashSet2;
                        if (z4 != 0) {
                            str2 = "Skip jump into the IFD since its offset is invalid: " + j7;
                            if (i7 != -1) {
                                str2 = str2 + " (total length: " + i7 + ")";
                            }
                            Log.d("ExifInterface", str2);
                        }
                    } else {
                        hashSet = hashSet2;
                        if (z4 != 0) {
                            str2 = "Skip jump into the IFD since its offset is invalid: " + j7;
                            if (i7 != -1) {
                                str2 = str2 + " (total length: " + i7 + ")";
                            }
                            Log.d("ExifInterface", str2);
                        }
                    }
                    gVar.b(j5);
                } else {
                    hashSet = hashSet2;
                    j6 = j5;
                    int i12 = gVar.f1609l + this.f1670o;
                    byte[] bArr3 = new byte[(int) j4];
                    gVar.readFully(bArr3);
                    d dVar3 = new d(i12, bArr3, unsignedShort3, i8);
                    HashMap map3 = mapArr[i3];
                    str = eVar.f1619b;
                    map3.put(str, dVar3);
                    if ("DNGVersion".equals(str)) {
                        this.f1659c = 3;
                    }
                    if (!"Make".equals(str)) {
                    }
                    this.f1659c = 8;
                    if (gVar.f1609l != j6) {
                        gVar.b(j6);
                    }
                }
            }
            s4 = (short) (s4 + 1);
            hashSet2 = hashSet;
            s3 = s5;
            z4 = z4;
        }
        HashSet hashSet3 = hashSet2;
        boolean z5 = z4;
        int i13 = gVar.readInt();
        if (z5) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i13)));
        }
        long j9 = i13;
        if (j9 <= 0) {
            if (z5) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i13);
                return;
            }
            return;
        }
        if (hashSet3.contains(Integer.valueOf(i13))) {
            if (z5) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i13);
                return;
            }
            return;
        }
        gVar.b(j9);
        if (mapArr[4].isEmpty()) {
            w(gVar, 4);
        } else if (mapArr[5].isEmpty()) {
            w(gVar, 5);
        }
    }

    public final void x(String str) {
        for (int i3 = 0; i3 < f1643U.length; i3++) {
            this.f1661e[i3].remove(str);
        }
    }

    public final void y(String str, int i3, String str2) {
        HashMap[] mapArr = this.f1661e;
        if (mapArr[i3].isEmpty() || mapArr[i3].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i3];
        map.put(str2, (d) map.get(str));
        mapArr[i3].remove(str);
    }

    public final void z(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws IOException {
        byte b3;
        byte[] bArr;
        if (u) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        b bVar = new b(bufferedInputStream);
        c cVar = new c(bufferedOutputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.a(-1);
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.a(-40);
        cVar.a(-1);
        cVar.a(-31);
        this.f1670o = G(cVar);
        d dVar = this.f1674s;
        byte[] bArr2 = f1650c0;
        if (dVar != null) {
            cVar.write(-1);
            cVar.a(-31);
            cVar.e(bArr2.length + 2 + this.f1674s.f1617d.length);
            cVar.write(bArr2);
            cVar.write(this.f1674s.f1617d);
            this.f1675t = true;
        }
        byte[] bArr3 = new byte[4096];
        while (bVar.readByte() == -1) {
            do {
                b3 = bVar.readByte();
            } while (b3 == -1);
            if (b3 == -39 || b3 == -38) {
                cVar.a(-1);
                cVar.a(b3);
                H2.h.h(bVar, cVar);
                return;
            }
            if (b3 != -31) {
                cVar.a(-1);
                cVar.a(b3);
                int unsignedShort = bVar.readUnsignedShort();
                cVar.e(unsignedShort);
                int i3 = unsignedShort - 2;
                if (i3 < 0) {
                    throw new IOException("Invalid length");
                }
                while (i3 > 0) {
                    int i4 = bVar.read(bArr3, 0, Math.min(i3, 4096));
                    if (i4 < 0) {
                        break;
                    }
                    cVar.write(bArr3, 0, i4);
                    i3 -= i4;
                }
            } else {
                int unsignedShort2 = bVar.readUnsignedShort();
                int length = unsignedShort2 - 2;
                if (length < 0) {
                    throw new IOException("Invalid length");
                }
                int length2 = bArr2.length;
                byte[] bArr4 = f1649b0;
                if (length >= length2) {
                    bArr = new byte[bArr2.length];
                } else {
                    bArr = length >= bArr4.length ? new byte[bArr4.length] : null;
                }
                if (bArr != null) {
                    bVar.readFully(bArr);
                    if (H2.h.D(bArr, bArr4) || H2.h.D(bArr, bArr2)) {
                        bVar.a(length - bArr.length);
                    }
                }
                cVar.a(-1);
                cVar.a(b3);
                cVar.e(unsignedShort2);
                if (bArr != null) {
                    length -= bArr.length;
                    cVar.write(bArr);
                }
                while (length > 0) {
                    int i5 = bVar.read(bArr3, 0, Math.min(length, 4096));
                    if (i5 < 0) {
                        break;
                    }
                    cVar.write(bArr3, 0, i5);
                    length -= i5;
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    public h(ByteArrayInputStream byteArrayInputStream) {
        e[][] eVarArr = f1643U;
        this.f1661e = new HashMap[eVarArr.length];
        this.f1662f = new HashSet(eVarArr.length);
        this.f1663g = ByteOrder.BIG_ENDIAN;
        this.f1657a = null;
        this.f1660d = false;
        this.f1658b = null;
        r(byteArrayInputStream);
    }
}

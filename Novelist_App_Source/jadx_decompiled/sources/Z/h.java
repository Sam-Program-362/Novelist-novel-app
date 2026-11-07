package Z;

import android.media.MediaMetadataRetriever;
import android.os.Build;
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

/* loaded from: classes.dex */
public final class h {

    /* renamed from: A, reason: collision with root package name */
    public static final byte[] f1624A;

    /* renamed from: B, reason: collision with root package name */
    public static final byte[] f1625B;

    /* renamed from: C, reason: collision with root package name */
    public static final byte[] f1626C;

    /* renamed from: D, reason: collision with root package name */
    public static final byte[] f1627D;

    /* renamed from: E, reason: collision with root package name */
    public static final byte[] f1628E;

    /* renamed from: F, reason: collision with root package name */
    public static final byte[] f1629F;

    /* renamed from: G, reason: collision with root package name */
    public static final byte[] f1630G;

    /* renamed from: H, reason: collision with root package name */
    public static final byte[] f1631H;

    /* renamed from: I, reason: collision with root package name */
    public static final byte[] f1632I;

    /* renamed from: J, reason: collision with root package name */
    public static final byte[] f1633J;

    /* renamed from: K, reason: collision with root package name */
    public static final byte[] f1634K;

    /* renamed from: L, reason: collision with root package name */
    public static final byte[] f1635L;

    /* renamed from: M, reason: collision with root package name */
    public static final byte[] f1636M;

    /* renamed from: N, reason: collision with root package name */
    public static final byte[] f1637N;

    /* renamed from: O, reason: collision with root package name */
    public static final byte[] f1638O;

    /* renamed from: P, reason: collision with root package name */
    public static final byte[] f1639P;

    /* renamed from: Q, reason: collision with root package name */
    public static final String[] f1640Q;

    /* renamed from: R, reason: collision with root package name */
    public static final int[] f1641R;
    public static final byte[] S;

    /* renamed from: T, reason: collision with root package name */
    public static final e f1642T;

    /* renamed from: U, reason: collision with root package name */
    public static final e[][] f1643U;

    /* renamed from: V, reason: collision with root package name */
    public static final e[] f1644V;
    public static final HashMap[] W;

    /* renamed from: X, reason: collision with root package name */
    public static final HashMap[] f1645X;

    /* renamed from: Y, reason: collision with root package name */
    public static final Set f1646Y;

    /* renamed from: Z, reason: collision with root package name */
    public static final HashMap f1647Z;

    /* renamed from: a0, reason: collision with root package name */
    public static final Charset f1648a0;

    /* renamed from: b0, reason: collision with root package name */
    public static final byte[] f1649b0;

    /* renamed from: c0, reason: collision with root package name */
    public static final byte[] f1650c0;

    /* renamed from: d0, reason: collision with root package name */
    public static final Pattern f1651d0;

    /* renamed from: e0, reason: collision with root package name */
    public static final Pattern f1652e0;

    /* renamed from: f0, reason: collision with root package name */
    public static final Pattern f1653f0;
    public static final boolean u = Log.isLoggable("ExifInterface", 3);

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f1654v;

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f1655w;
    public static final byte[] x;
    public static final byte[] y;

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f1656z;

    /* renamed from: a, reason: collision with root package name */
    public final String f1657a;

    /* renamed from: b, reason: collision with root package name */
    public final FileDescriptor f1658b;

    /* renamed from: c, reason: collision with root package name */
    public int f1659c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1660d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap[] f1661e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f1662f;

    /* renamed from: g, reason: collision with root package name */
    public ByteOrder f1663g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1664h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1665i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1666j;

    /* renamed from: k, reason: collision with root package name */
    public int f1667k;

    /* renamed from: l, reason: collision with root package name */
    public int f1668l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f1669m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public int f1670o;

    /* renamed from: p, reason: collision with root package name */
    public int f1671p;

    /* renamed from: q, reason: collision with root package name */
    public int f1672q;

    /* renamed from: r, reason: collision with root package name */
    public int f1673r;

    /* renamed from: s, reason: collision with root package name */
    public d f1674s;

    /* renamed from: t, reason: collision with root package name */
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
        Charset forName = Charset.forName("US-ASCII");
        f1648a0 = forName;
        f1649b0 = "Exif\u0000\u0000".getBytes(forName);
        f1650c0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i3 = 0;
        while (true) {
            e[][] eVarArr6 = f1643U;
            if (i3 >= eVarArr6.length) {
                HashMap hashMap = f1647Z;
                e[] eVarArr7 = f1644V;
                hashMap.put(Integer.valueOf(eVarArr7[0].f1618a), 5);
                hashMap.put(Integer.valueOf(eVarArr7[1].f1618a), 1);
                hashMap.put(Integer.valueOf(eVarArr7[2].f1618a), 2);
                hashMap.put(Integer.valueOf(eVarArr7[3].f1618a), 3);
                hashMap.put(Integer.valueOf(eVarArr7[4].f1618a), 7);
                hashMap.put(Integer.valueOf(eVarArr7[5].f1618a), 8);
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

    public h(String str) {
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
            String[] split = str.split(",", -1);
            Pair o2 = o(split[0]);
            if (((Integer) o2.first).intValue() == 2) {
                return o2;
            }
            for (int i3 = 1; i3 < split.length; i3++) {
                Pair o3 = o(split[i3]);
                int intValue = (((Integer) o3.first).equals(o2.first) || ((Integer) o3.second).equals(o2.first)) ? ((Integer) o2.first).intValue() : -1;
                int intValue2 = (((Integer) o2.second).intValue() == -1 || !(((Integer) o3.first).equals(o2.second) || ((Integer) o3.second).equals(o2.second))) ? -1 : ((Integer) o2.second).intValue();
                if (intValue == -1 && intValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (intValue == -1) {
                    o2 = new Pair(Integer.valueOf(intValue2), -1);
                } else if (intValue2 == -1) {
                    o2 = new Pair(Integer.valueOf(intValue), -1);
                }
            }
            return o2;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long parseLong = Long.parseLong(str);
                    return (parseLong < 0 || parseLong > 65535) ? parseLong < 0 ? new Pair(9, -1) : new Pair(4, -1) : new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair(12, -1);
            }
        }
        String[] split2 = str.split("/", -1);
        if (split2.length == 2) {
            try {
                long parseDouble = (long) Double.parseDouble(split2[0]);
                long parseDouble2 = (long) Double.parseDouble(split2[1]);
                if (parseDouble >= 0 && parseDouble2 >= 0) {
                    if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
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

    public static ByteOrder u(b bVar) {
        short readShort = bVar.readShort();
        boolean z3 = u;
        if (readShort == 18761) {
            if (z3) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            if (z3) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0043 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0075 -> B:9:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x027e A[Catch: all -> 0x0246, Exception -> 0x024b, TRY_ENTER, TRY_LEAVE, TryCatch #11 {Exception -> 0x024b, all -> 0x0246, blocks: (B:22:0x027e, B:121:0x023c, B:126:0x0257), top: B:11:0x0056 }] */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.io.BufferedOutputStream, java.io.OutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v10, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r24v13 */
    /* JADX WARN: Type inference failed for: r24v14 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v8 */
    /* JADX WARN: Type inference failed for: r24v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(java.io.BufferedInputStream r23, java.io.BufferedOutputStream r24) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.h.B(java.io.BufferedInputStream, java.io.BufferedOutputStream):void");
    }

    public final void C(b bVar) {
        String str;
        d dVar;
        int i3;
        HashMap hashMap = this.f1661e[4];
        d dVar2 = (d) hashMap.get("Compression");
        if (dVar2 == null) {
            this.n = 6;
            p(bVar, hashMap);
            return;
        }
        int i4 = dVar2.i(this.f1663g);
        this.n = i4;
        int i5 = 1;
        if (i4 != 1) {
            if (i4 == 6) {
                p(bVar, hashMap);
                return;
            } else if (i4 != 7) {
                return;
            }
        }
        d dVar3 = (d) hashMap.get("BitsPerSample");
        String str2 = "ExifInterface";
        if (dVar3 != null) {
            int[] iArr = (int[]) dVar3.k(this.f1663g);
            int[] iArr2 = f1654v;
            if (Arrays.equals(iArr2, iArr) || (this.f1659c == 3 && (dVar = (d) hashMap.get("PhotometricInterpretation")) != null && (((i3 = dVar.i(this.f1663g)) == 1 && Arrays.equals(iArr, f1655w)) || (i3 == 6 && Arrays.equals(iArr, iArr2))))) {
                d dVar4 = (d) hashMap.get("StripOffsets");
                d dVar5 = (d) hashMap.get("StripByteCounts");
                if (dVar4 == null || dVar5 == null) {
                    return;
                }
                long[] f3 = H2.h.f(dVar4.k(this.f1663g));
                long[] f4 = H2.h.f(dVar5.k(this.f1663g));
                if (f3 == null || f3.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (f4 == null || f4.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (f3.length != f4.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j3 = 0;
                for (long j4 : f4) {
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
                while (i7 < f3.length) {
                    int i10 = (int) f3[i7];
                    int i11 = (int) f4[i7];
                    if (i7 < f3.length - i5) {
                        str = str2;
                        if (i10 + i11 != f3[i7 + 1]) {
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
                    this.f1667k = (int) f3[0];
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

    public final void D(int i3, int i4) {
        HashMap[] hashMapArr = this.f1661e;
        boolean isEmpty = hashMapArr[i3].isEmpty();
        boolean z3 = u;
        if (isEmpty || hashMapArr[i4].isEmpty()) {
            if (z3) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        d dVar = (d) hashMapArr[i3].get("ImageLength");
        d dVar2 = (d) hashMapArr[i3].get("ImageWidth");
        d dVar3 = (d) hashMapArr[i4].get("ImageLength");
        d dVar4 = (d) hashMapArr[i4].get("ImageWidth");
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
        HashMap hashMap = hashMapArr[i3];
        hashMapArr[i3] = hashMapArr[i4];
        hashMapArr[i4] = hashMap;
    }

    public final void E(g gVar, int i3) {
        d f3;
        d f4;
        HashMap[] hashMapArr = this.f1661e;
        d dVar = (d) hashMapArr[i3].get("DefaultCropSize");
        d dVar2 = (d) hashMapArr[i3].get("SensorTopBorder");
        d dVar3 = (d) hashMapArr[i3].get("SensorLeftBorder");
        d dVar4 = (d) hashMapArr[i3].get("SensorBottomBorder");
        d dVar5 = (d) hashMapArr[i3].get("SensorRightBorder");
        if (dVar != null) {
            if (dVar.f1614a == 5) {
                f[] fVarArr = (f[]) dVar.k(this.f1663g);
                if (fVarArr == null || fVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(fVarArr));
                    return;
                } else {
                    f3 = d.e(new f[]{fVarArr[0]}, this.f1663g);
                    f4 = d.e(new f[]{fVarArr[1]}, this.f1663g);
                }
            } else {
                int[] iArr = (int[]) dVar.k(this.f1663g);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                f3 = d.f(iArr[0], this.f1663g);
                f4 = d.f(iArr[1], this.f1663g);
            }
            hashMapArr[i3].put("ImageWidth", f3);
            hashMapArr[i3].put("ImageLength", f4);
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
            d f5 = d.f(i5 - i4, this.f1663g);
            d f6 = d.f(i6 - i7, this.f1663g);
            hashMapArr[i3].put("ImageLength", f5);
            hashMapArr[i3].put("ImageWidth", f6);
            return;
        }
        d dVar6 = (d) hashMapArr[i3].get("ImageLength");
        d dVar7 = (d) hashMapArr[i3].get("ImageWidth");
        if (dVar6 == null || dVar7 == null) {
            d dVar8 = (d) hashMapArr[i3].get("JPEGInterchangeFormat");
            d dVar9 = (d) hashMapArr[i3].get("JPEGInterchangeFormatLength");
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

    public final void F() {
        D(0, 5);
        D(0, 4);
        D(5, 4);
        HashMap[] hashMapArr = this.f1661e;
        d dVar = (d) hashMapArr[1].get("PixelXDimension");
        d dVar2 = (d) hashMapArr[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            hashMapArr[0].put("ImageWidth", dVar);
            hashMapArr[0].put("ImageLength", dVar2);
        }
        if (hashMapArr[4].isEmpty() && q(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!q(hashMapArr[4])) {
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

    public final int G(c cVar) {
        HashMap[] hashMapArr;
        int i3;
        int i4;
        char c3;
        char c4;
        int[] iArr;
        int i5;
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
        int i6 = 0;
        while (true) {
            int length = eVarArr.length;
            hashMapArr = this.f1661e;
            if (i6 >= length) {
                break;
            }
            Iterator it2 = hashMapArr[i6].entrySet().iterator();
            while (it2.hasNext()) {
                if (((Map.Entry) it2.next()).getValue() == null) {
                    it2.remove();
                }
            }
            i6++;
        }
        if (hashMapArr[1].isEmpty()) {
            i3 = 1;
            i4 = 0;
        } else {
            i3 = 1;
            i4 = 0;
            hashMapArr[0].put(eVarArr2[1].f1619b, d.c(0L, this.f1663g));
        }
        if (hashMapArr[2].isEmpty()) {
            c3 = 2;
        } else {
            c3 = 2;
            hashMapArr[i4].put(eVarArr2[2].f1619b, d.c(0L, this.f1663g));
        }
        if (hashMapArr[3].isEmpty()) {
            c4 = 3;
        } else {
            c4 = 3;
            hashMapArr[i3].put(eVarArr2[3].f1619b, d.c(0L, this.f1663g));
        }
        int i7 = 4;
        if (this.f1664h) {
            if (this.f1665i) {
                hashMapArr[4].put("StripOffsets", d.f(i4, this.f1663g));
                hashMapArr[4].put("StripByteCounts", d.f(this.f1668l, this.f1663g));
            } else {
                hashMapArr[4].put("JPEGInterchangeFormat", d.c(0L, this.f1663g));
                hashMapArr[4].put("JPEGInterchangeFormatLength", d.c(this.f1668l, this.f1663g));
            }
        }
        int i8 = 0;
        while (true) {
            int length2 = eVarArr.length;
            iArr = f1641R;
            if (i8 >= length2) {
                break;
            }
            Iterator it3 = hashMapArr[i8].entrySet().iterator();
            int i9 = 0;
            while (it3.hasNext()) {
                d dVar = (d) ((Map.Entry) it3.next()).getValue();
                dVar.getClass();
                int i10 = iArr[dVar.f1614a] * dVar.f1615b;
                if (i10 > 4) {
                    i9 += i10;
                }
            }
            iArr3[i8] = iArr3[i8] + i9;
            i8++;
        }
        int i11 = 8;
        for (int i12 = 0; i12 < eVarArr.length; i12++) {
            if (!hashMapArr[i12].isEmpty()) {
                iArr2[i12] = i11;
                i11 = (hashMapArr[i12].size() * 12) + 6 + iArr3[i12] + i11;
            }
        }
        if (this.f1664h) {
            if (this.f1665i) {
                hashMapArr[4].put("StripOffsets", d.f(i11, this.f1663g));
            } else {
                hashMapArr[4].put("JPEGInterchangeFormat", d.c(i11, this.f1663g));
            }
            this.f1667k = i11;
            i11 += this.f1668l;
        }
        if (this.f1659c == 4) {
            i11 += 8;
        }
        if (u) {
            for (int i13 = 0; i13 < eVarArr.length; i13++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i13), Integer.valueOf(iArr2[i13]), Integer.valueOf(hashMapArr[i13].size()), Integer.valueOf(iArr3[i13]), Integer.valueOf(i11)));
            }
        }
        if (!hashMapArr[i3].isEmpty()) {
            hashMapArr[0].put(eVarArr2[i3].f1619b, d.c(iArr2[i3], this.f1663g));
        }
        if (!hashMapArr[c3].isEmpty()) {
            hashMapArr[0].put(eVarArr2[c3].f1619b, d.c(iArr2[c3], this.f1663g));
        }
        if (!hashMapArr[c4].isEmpty()) {
            hashMapArr[i3].put(eVarArr2[c4].f1619b, d.c(iArr2[c4], this.f1663g));
        }
        int i14 = this.f1659c;
        if (i14 == 4) {
            if (i11 > 65535) {
                throw new IllegalStateException(B1.e.h("Size of exif data (", i11, " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)"));
            }
            cVar.e(i11);
            cVar.write(f1649b0);
        } else if (i14 == 13) {
            cVar.b(i11);
            cVar.b(1700284774);
        } else if (i14 == 14) {
            cVar.write(f1633J);
            cVar.b(i11);
        }
        int size = cVar.f1612k.size();
        cVar.c(this.f1663g == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.f1613l = this.f1663g;
        cVar.e(42);
        cVar.d(8L);
        int i15 = 0;
        while (i15 < eVarArr.length) {
            if (hashMapArr[i15].isEmpty()) {
                i5 = i7;
            } else {
                cVar.e(hashMapArr[i15].size());
                int size2 = (hashMapArr[i15].size() * 12) + iArr2[i15] + 2 + i7;
                for (Map.Entry entry : hashMapArr[i15].entrySet()) {
                    int i16 = ((e) f1645X[i15].get(entry.getKey())).f1618a;
                    d dVar2 = (d) entry.getValue();
                    dVar2.getClass();
                    int i17 = dVar2.f1615b;
                    int i18 = dVar2.f1614a;
                    int i19 = iArr[i18] * i17;
                    cVar.e(i16);
                    cVar.e(i18);
                    cVar.b(i17);
                    if (i19 > 4) {
                        cVar.d(size2);
                        size2 += i19;
                    } else {
                        cVar.write(dVar2.f1617d);
                        if (i19 < 4) {
                            while (i19 < 4) {
                                cVar.a(0);
                                i19++;
                            }
                        }
                    }
                    i7 = 4;
                }
                int i20 = i7;
                if (i15 != 0 || hashMapArr[i20].isEmpty()) {
                    cVar.d(0L);
                } else {
                    cVar.d(iArr2[i20]);
                }
                Iterator it4 = hashMapArr[i15].entrySet().iterator();
                while (it4.hasNext()) {
                    byte[] bArr = ((d) ((Map.Entry) it4.next()).getValue()).f1617d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
                i5 = 4;
            }
            i15++;
            i7 = i5;
        }
        if (this.f1664h) {
            cVar.write(m());
        }
        if (this.f1659c == 14 && i11 % 2 == i3) {
            cVar.a(0);
        }
        cVar.f1613l = ByteOrder.BIG_ENDIAN;
        return size;
    }

    public final void H(c cVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f1670o = cVar.f1612k.size() + G(new c(byteArrayOutputStream, ByteOrder.BIG_ENDIAN));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        cVar.write(byteArray);
        CRC32 crc32 = new CRC32();
        crc32.update(byteArray, 4, byteArray.length - 4);
        cVar.b((int) crc32.getValue());
    }

    public final void I(c cVar) {
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
        String b3 = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.f1661e;
        if (b3 != null && b("DateTime") == null) {
            hashMapArr[0].put("DateTime", d.b(b3));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", d.c(0L, this.f1663g));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", d.c(0L, this.f1663g));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", d.c(0L, this.f1663g));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", d.c(0L, this.f1663g));
        }
    }

    public final String b(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d c3 = c(str);
        if (c3 != null) {
            int i3 = c3.f1614a;
            if (str.equals("GPSTimeStamp")) {
                if (i3 != 5 && i3 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i3);
                    return null;
                }
                f[] fVarArr = (f[]) c3.k(this.f1663g);
                if (fVarArr == null || fVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr));
                    return null;
                }
                f fVar = fVarArr[0];
                Integer valueOf = Integer.valueOf((int) (fVar.f1622a / fVar.f1623b));
                f fVar2 = fVarArr[1];
                Integer valueOf2 = Integer.valueOf((int) (fVar2.f1622a / fVar2.f1623b));
                f fVar3 = fVarArr[2];
                return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (fVar3.f1622a / fVar3.f1623b)));
            }
            if (!f1646Y.contains(str)) {
                return c3.j(this.f1663g);
            }
            try {
                return Double.toString(c3.h(this.f1663g));
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
        String str;
        String str2;
        String str3;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIC files is supported from SDK 28 and above");
        }
        if (i3 == 15 && i4 < 31) {
            throw new UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(new a(gVar));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(extractMetadata3)) {
                    str = mediaMetadataRetriever.extractMetadata(29);
                    str3 = mediaMetadataRetriever.extractMetadata(30);
                    str2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str = mediaMetadataRetriever.extractMetadata(18);
                    str3 = mediaMetadataRetriever.extractMetadata(19);
                    str2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                HashMap[] hashMapArr = this.f1661e;
                if (str != null) {
                    hashMapArr[0].put("ImageWidth", d.f(Integer.parseInt(str), this.f1663g));
                }
                if (str3 != null) {
                    hashMapArr[0].put("ImageLength", d.f(Integer.parseInt(str3), this.f1663g));
                }
                if (str2 != null) {
                    int parseInt = Integer.parseInt(str2);
                    hashMapArr[0].put("Orientation", d.f(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f1663g));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    gVar.b(parseInt2);
                    byte[] bArr = new byte[6];
                    gVar.readFully(bArr);
                    int i5 = parseInt2 + 6;
                    int i6 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, f1649b0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i6];
                    gVar.readFully(bArr2);
                    this.f1670o = i5;
                    v(bArr2, 0);
                }
                String extractMetadata5 = mediaMetadataRetriever.extractMetadata(41);
                String extractMetadata6 = mediaMetadataRetriever.extractMetadata(42);
                if (extractMetadata5 != null && extractMetadata6 != null) {
                    int parseInt4 = Integer.parseInt(extractMetadata5);
                    int parseInt5 = Integer.parseInt(extractMetadata6);
                    long j3 = parseInt4;
                    gVar.b(j3);
                    byte[] bArr3 = new byte[parseInt5];
                    gVar.readFully(bArr3);
                    this.f1674s = new d(j3, bArr3, 1, parseInt5);
                    this.f1675t = true;
                }
                if (u) {
                    Log.d("ExifInterface", "Heif meta: " + str + "x" + str3 + ", rotation " + str2);
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

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0167, code lost:
    
        r22.f1610m = r21.f1663g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x016b, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(Z.b r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.h.e(Z.b, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0062, code lost:
    
        if (r9 < 16) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x00ec, code lost:
    
        if (r8 != null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0163 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(java.io.BufferedInputStream r18) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.h.f(java.io.BufferedInputStream):int");
    }

    public final void g(g gVar) {
        int i3;
        int i4;
        j(gVar);
        HashMap[] hashMapArr = this.f1661e;
        d dVar = (d) hashMapArr[1].get("MakerNote");
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
            d dVar2 = (d) hashMapArr[7].get("PreviewImageStart");
            d dVar3 = (d) hashMapArr[7].get("PreviewImageLength");
            if (dVar2 != null && dVar3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", dVar2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            d dVar4 = (d) hashMapArr[8].get("AspectFrame");
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
                d f3 = d.f(i7, this.f1663g);
                d f4 = d.f(i8, this.f1663g);
                hashMapArr[0].put("ImageWidth", f3);
                hashMapArr[0].put("ImageLength", f4);
            }
        }
    }

    public final void h(b bVar) {
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
                int readInt = bVar.readInt();
                int readInt2 = bVar.readInt();
                int i4 = bVar.f1609l;
                int i5 = i4 + readInt + 4;
                int i6 = i4 - i3;
                if (i6 == 16 && readInt2 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (readInt2 == 1229278788) {
                    break;
                }
                if (readInt2 == 1700284774 && !z3) {
                    this.f1670o = i6;
                    byte[] bArr = new byte[readInt];
                    bVar.readFully(bArr);
                    int readInt3 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(readInt2 >>> 24);
                    crc32.update(readInt2 >>> 16);
                    crc32.update(readInt2 >>> 8);
                    crc32.update(readInt2);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != readInt3) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt3 + ", calculated CRC value: " + crc32.getValue());
                    }
                    v(bArr, 0);
                    F();
                    C(new b(bArr));
                    z3 = true;
                } else if (readInt2 == 1767135348 && !z4) {
                    byte[] bArr2 = f1630G;
                    if (readInt >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        bVar.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i7 = bVar.f1609l - i3;
                            int i8 = readInt - length;
                            byte[] bArr4 = new byte[i8];
                            bVar.readFully(bArr4);
                            this.f1674s = new d(i7, bArr4, 1, i8);
                            z4 = true;
                        }
                    }
                }
                bVar.a(i5 - bVar.f1609l);
            } catch (EOFException e3) {
                throw new IOException("Encountered corrupt PNG file.", e3);
            }
        }
        this.f1675t = z4;
    }

    public final void i(b bVar) {
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
        int readInt = bVar.readInt();
        if (z3) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i6 = 0; i6 < readInt; i6++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f1642T.f1618a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                d f3 = d.f(readShort, this.f1663g);
                d f4 = d.f(readShort2, this.f1663g);
                HashMap[] hashMapArr = this.f1661e;
                hashMapArr[0].put("ImageLength", f3);
                hashMapArr[0].put("ImageWidth", f4);
                if (z3) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.a(readUnsignedShort2);
        }
    }

    public final void j(g gVar) {
        s(gVar);
        w(gVar, 0);
        E(gVar, 0);
        E(gVar, 5);
        E(gVar, 4);
        F();
        if (this.f1659c == 8) {
            HashMap[] hashMapArr = this.f1661e;
            d dVar = (d) hashMapArr[1].get("MakerNote");
            if (dVar != null) {
                g gVar2 = new g(dVar.f1617d);
                gVar2.f1610m = this.f1663g;
                gVar2.a(6);
                w(gVar2, 9);
                d dVar2 = (d) hashMapArr[9].get("ColorSpace");
                if (dVar2 != null) {
                    hashMapArr[1].put("ColorSpace", dVar2);
                }
            }
        }
    }

    public final void k(g gVar) {
        if (u) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + gVar);
        }
        j(gVar);
        HashMap[] hashMapArr = this.f1661e;
        d dVar = (d) hashMapArr[0].get("JpgFromRaw");
        if (dVar != null) {
            e(new b(dVar.f1617d), (int) dVar.f1616c, 5);
        }
        d dVar2 = (d) hashMapArr[0].get("ISO");
        d dVar3 = (d) hashMapArr[1].get("PhotographicSensitivity");
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        hashMapArr[1].put("PhotographicSensitivity", dVar2);
    }

    public final boolean l(g gVar) {
        byte[] bArr = f1649b0;
        byte[] bArr2 = new byte[bArr.length];
        gVar.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            Log.w("ExifInterface", "Given data is not EXIF-only.");
            return false;
        }
        byte[] bArr3 = new byte[1024];
        int i3 = 0;
        while (true) {
            if (i3 == bArr3.length) {
                bArr3 = Arrays.copyOf(bArr3, bArr3.length * 2);
            }
            int read = gVar.f1608k.read(bArr3, i3, bArr3.length - i3);
            if (read == -1) {
                byte[] copyOf = Arrays.copyOf(bArr3, i3);
                this.f1670o = bArr.length;
                v(copyOf, 0);
                return true;
            }
            i3 += read;
            gVar.f1609l += read;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] m() {
        /*
            r10 = this;
            java.lang.String r0 = "Error closing fd."
            java.lang.String r1 = "ExifInterfaceUtils"
            java.lang.String r2 = "ExifInterface"
            boolean r3 = r10.f1664h
            r4 = 0
            if (r3 != 0) goto Ld
            goto L82
        Ld:
            byte[] r3 = r10.f1669m
            if (r3 == 0) goto L12
            return r3
        L12:
            java.lang.String r3 = r10.f1657a     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L23
            if (r3 == 0) goto L27
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L23
            java.lang.String r5 = r10.f1657a     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L23
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L23
            r5 = r4
            goto L3c
        L1f:
            r2 = move-exception
            r5 = r4
            goto L86
        L23:
            r3 = move-exception
            r5 = r4
            r6 = r5
            goto L70
        L27:
            java.io.FileDescriptor r3 = r10.f1658b     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L23
            java.io.FileDescriptor r3 = android.system.Os.dup(r3)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L23
            int r5 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r6 = 0
            android.system.Os.lseek(r3, r6, r5)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r9 = r5
            r5 = r3
            r3 = r9
        L3c:
            Z.b r6 = new Z.b     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            int r7 = r10.f1667k     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            int r8 = r10.f1670o     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            int r7 = r7 + r8
            r6.a(r7)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            int r7 = r10.f1668l     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            r6.readFully(r7)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            r10.f1669m = r7     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            H2.h.e(r3)
            if (r5 == 0) goto L5f
            android.system.Os.close(r5)     // Catch: android.system.ErrnoException -> L5b
            return r7
        L5b:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L5f:
            return r7
        L60:
            r2 = move-exception
            r4 = r3
            goto L86
        L63:
            r6 = move-exception
            r9 = r5
            r5 = r3
            r3 = r6
            r6 = r9
            goto L70
        L69:
            r2 = move-exception
            r5 = r3
            goto L86
        L6c:
            r5 = move-exception
            r6 = r3
            r3 = r5
            r5 = r4
        L70:
            java.lang.String r7 = "Encountered exception while getting thumbnail"
            android.util.Log.d(r2, r7, r3)     // Catch: java.lang.Throwable -> L83
            H2.h.e(r5)
            if (r6 == 0) goto L82
            android.system.Os.close(r6)     // Catch: android.system.ErrnoException -> L7e
            goto L82
        L7e:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L82:
            return r4
        L83:
            r2 = move-exception
            r4 = r5
            r5 = r6
        L86:
            H2.h.e(r4)
            if (r5 == 0) goto L93
            android.system.Os.close(r5)     // Catch: android.system.ErrnoException -> L8f
            goto L93
        L8f:
            r3 = move-exception
            android.util.Log.e(r1, r0, r3)
        L93:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.h.m():byte[]");
    }

    public final void n(b bVar) {
        if (u) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f1610m = ByteOrder.LITTLE_ENDIAN;
        bVar.a(f1631H.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = f1632I;
        bVar.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int readInt2 = bVar.readInt();
                int i3 = length + 8;
                if (Arrays.equals(f1633J, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    bVar.readFully(bArr3);
                    byte[] bArr4 = f1649b0;
                    if (H2.h.D(bArr3, bArr4)) {
                        bArr3 = Arrays.copyOfRange(bArr3, bArr4.length, readInt2);
                    }
                    this.f1670o = i3;
                    v(bArr3, 0);
                    C(new b(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i3 + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.a(readInt2);
            } catch (EOFException e3) {
                throw new IOException("Encountered corrupt WebP file.", e3);
            }
        }
    }

    public final void p(b bVar, HashMap hashMap) {
        d dVar = (d) hashMap.get("JPEGInterchangeFormat");
        d dVar2 = (d) hashMap.get("JPEGInterchangeFormatLength");
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

    public final boolean q(HashMap hashMap) {
        d dVar = (d) hashMap.get("ImageLength");
        d dVar2 = (d) hashMap.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.i(this.f1663g) <= 512 && dVar2.i(this.f1663g) <= 512;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(java.io.InputStream r9) {
        /*
            r8 = this;
            boolean r0 = Z.h.u
            r1 = 0
            r2 = r1
        L4:
            Z.e[][] r3 = Z.h.f1643U     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r3 = r3.length     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r2 >= r3) goto L1e
            java.util.HashMap[] r3 = r8.f1661e     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r4.<init>()     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r3[r2] = r4     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r2 = r2 + 1
            goto L4
        L15:
            r9 = move-exception
            goto Lb4
        L18:
            r9 = move-exception
            goto Laa
        L1b:
            r9 = move-exception
            goto Laa
        L1e:
            boolean r2 = r8.f1660d
            if (r2 != 0) goto L30
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r4 = 5000(0x1388, float:7.006E-42)
            r3.<init>(r9, r4)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r9 = r8.f(r3)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r8.f1659c = r9     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r9 = r3
        L30:
            int r3 = r8.f1659c     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r4 = 14
            r5 = 13
            r6 = 9
            r7 = 4
            if (r3 == r7) goto L83
            if (r3 == r6) goto L83
            if (r3 == r5) goto L83
            if (r3 != r4) goto L42
            goto L83
        L42:
            Z.g r1 = new Z.g     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r1.<init>(r9)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r2 == 0) goto L58
            boolean r9 = r8.l(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r9 != 0) goto L79
            r8.a()
            if (r0 == 0) goto Lc5
            r8.t()
            return
        L58:
            int r9 = r8.f1659c     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2 = 12
            if (r9 == r2) goto L76
            r2 = 15
            if (r9 != r2) goto L63
            goto L76
        L63:
            r2 = 7
            if (r9 != r2) goto L6a
            r8.g(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L79
        L6a:
            r2 = 10
            if (r9 != r2) goto L72
            r8.k(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L79
        L72:
            r8.j(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L79
        L76:
            r8.d(r1, r9)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
        L79:
            int r9 = r8.f1670o     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            long r2 = (long) r9     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r1.b(r2)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r8.C(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto La1
        L83:
            Z.b r2 = new Z.b     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r9 = r8.f1659c     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r9 != r7) goto L90
            r8.e(r2, r1, r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto La1
        L90:
            if (r9 != r5) goto L96
            r8.h(r2)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto La1
        L96:
            if (r9 != r6) goto L9c
            r8.i(r2)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto La1
        L9c:
            if (r9 != r4) goto La1
            r8.n(r2)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
        La1:
            r8.a()
            if (r0 == 0) goto Lc5
            r8.t()
            return
        Laa:
            if (r0 == 0) goto Lbd
            java.lang.String r1 = "ExifInterface"
            java.lang.String r2 = "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r1, r2, r9)     // Catch: java.lang.Throwable -> L15
            goto Lbd
        Lb4:
            r8.a()
            if (r0 == 0) goto Lbc
            r8.t()
        Lbc:
            throw r9
        Lbd:
            r8.a()
            if (r0 == 0) goto Lc5
            r8.t()
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.h.r(java.io.InputStream):void");
    }

    public final void s(g gVar) {
        ByteOrder u3 = u(gVar);
        this.f1663g = u3;
        gVar.f1610m = u3;
        int readUnsignedShort = gVar.readUnsignedShort();
        int i3 = this.f1659c;
        if (i3 != 7 && i3 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = gVar.readInt();
        if (readInt < 8) {
            throw new IOException(B1.e.g("Invalid first Ifd offset: ", readInt));
        }
        int i4 = readInt - 8;
        if (i4 > 0) {
            gVar.a(i4);
        }
    }

    public final void t() {
        int i3 = 0;
        while (true) {
            HashMap[] hashMapArr = this.f1661e;
            if (i3 >= hashMapArr.length) {
                return;
            }
            Log.d("ExifInterface", "The size of tag group[" + i3 + "]: " + hashMapArr[i3].size());
            for (Map.Entry entry : hashMapArr[i3].entrySet()) {
                d dVar = (d) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + dVar.toString() + ", tagValue: '" + dVar.j(this.f1663g) + "'");
            }
            i3++;
        }
    }

    public final void v(byte[] bArr, int i3) {
        g gVar = new g(bArr);
        s(gVar);
        w(gVar, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0299  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(Z.g r30, int r31) {
        /*
            Method dump skipped, instructions count: 948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.h.w(Z.g, int):void");
    }

    public final void x(String str) {
        for (int i3 = 0; i3 < f1643U.length; i3++) {
            this.f1661e[i3].remove(str);
        }
    }

    public final void y(String str, int i3, String str2) {
        HashMap[] hashMapArr = this.f1661e;
        if (hashMapArr[i3].isEmpty() || hashMapArr[i3].get(str) == null) {
            return;
        }
        HashMap hashMap = hashMapArr[i3];
        hashMap.put(str2, (d) hashMap.get(str));
        hashMapArr[i3].remove(str);
    }

    public final void z(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) {
        byte readByte;
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
        byte[] bArr = f1650c0;
        if (dVar != null) {
            cVar.write(-1);
            cVar.a(-31);
            cVar.e(bArr.length + 2 + this.f1674s.f1617d.length);
            cVar.write(bArr);
            cVar.write(this.f1674s.f1617d);
            this.f1675t = true;
        }
        byte[] bArr2 = new byte[4096];
        while (bVar.readByte() == -1) {
            do {
                readByte = bVar.readByte();
            } while (readByte == -1);
            if (readByte == -39 || readByte == -38) {
                cVar.a(-1);
                cVar.a(readByte);
                H2.h.h(bVar, cVar);
                return;
            }
            if (readByte != -31) {
                cVar.a(-1);
                cVar.a(readByte);
                int readUnsignedShort = bVar.readUnsignedShort();
                cVar.e(readUnsignedShort);
                int i3 = readUnsignedShort - 2;
                if (i3 < 0) {
                    throw new IOException("Invalid length");
                }
                while (i3 > 0) {
                    int read = bVar.read(bArr2, 0, Math.min(i3, 4096));
                    if (read >= 0) {
                        cVar.write(bArr2, 0, read);
                        i3 -= read;
                    }
                }
            } else {
                int readUnsignedShort2 = bVar.readUnsignedShort();
                int i4 = readUnsignedShort2 - 2;
                if (i4 < 0) {
                    throw new IOException("Invalid length");
                }
                int length = bArr.length;
                byte[] bArr3 = f1649b0;
                byte[] bArr4 = i4 >= length ? new byte[bArr.length] : i4 >= bArr3.length ? new byte[bArr3.length] : null;
                if (bArr4 != null) {
                    bVar.readFully(bArr4);
                    if (H2.h.D(bArr4, bArr3) || H2.h.D(bArr4, bArr)) {
                        bVar.a(i4 - bArr4.length);
                    }
                }
                cVar.a(-1);
                cVar.a(readByte);
                cVar.e(readUnsignedShort2);
                if (bArr4 != null) {
                    i4 -= bArr4.length;
                    cVar.write(bArr4);
                }
                while (i4 > 0) {
                    int read2 = bVar.read(bArr2, 0, Math.min(i4, 4096));
                    if (read2 >= 0) {
                        cVar.write(bArr2, 0, read2);
                        i4 -= read2;
                    }
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

.class public interface abstract Lorg/apache/tika/metadata/TIFF;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final BITS_PER_SAMPLE:Lorg/apache/tika/metadata/Property;

.field public static final EQUIPMENT_MAKE:Lorg/apache/tika/metadata/Property;

.field public static final EQUIPMENT_MODEL:Lorg/apache/tika/metadata/Property;

.field public static final EXIF_PAGE_COUNT:Lorg/apache/tika/metadata/Property;

.field public static final EXPOSURE_TIME:Lorg/apache/tika/metadata/Property;

.field public static final FLASH_FIRED:Lorg/apache/tika/metadata/Property;

.field public static final FOCAL_LENGTH:Lorg/apache/tika/metadata/Property;

.field public static final F_NUMBER:Lorg/apache/tika/metadata/Property;

.field public static final IMAGE_LENGTH:Lorg/apache/tika/metadata/Property;

.field public static final IMAGE_WIDTH:Lorg/apache/tika/metadata/Property;

.field public static final ISO_SPEED_RATINGS:Lorg/apache/tika/metadata/Property;

.field public static final ORIENTATION:Lorg/apache/tika/metadata/Property;

.field public static final ORIGINAL_DATE:Lorg/apache/tika/metadata/Property;

.field public static final RESOLUTION_HORIZONTAL:Lorg/apache/tika/metadata/Property;

.field public static final RESOLUTION_UNIT:Lorg/apache/tika/metadata/Property;

.field public static final RESOLUTION_VERTICAL:Lorg/apache/tika/metadata/Property;

.field public static final SAMPLES_PER_PIXEL:Lorg/apache/tika/metadata/Property;

.field public static final SOFTWARE:Lorg/apache/tika/metadata/Property;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    const-string v0, "tiff:BitsPerSample"

    .line 2
    .line 3
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalIntegerSequence(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lorg/apache/tika/metadata/TIFF;->BITS_PER_SAMPLE:Lorg/apache/tika/metadata/Property;

    .line 8
    .line 9
    const-string v0, "tiff:ImageLength"

    .line 10
    .line 11
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lorg/apache/tika/metadata/TIFF;->IMAGE_LENGTH:Lorg/apache/tika/metadata/Property;

    .line 16
    .line 17
    const-string v0, "tiff:ImageWidth"

    .line 18
    .line 19
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lorg/apache/tika/metadata/TIFF;->IMAGE_WIDTH:Lorg/apache/tika/metadata/Property;

    .line 24
    .line 25
    const-string v0, "tiff:SamplesPerPixel"

    .line 26
    .line 27
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lorg/apache/tika/metadata/TIFF;->SAMPLES_PER_PIXEL:Lorg/apache/tika/metadata/Property;

    .line 32
    .line 33
    const-string v0, "exif:Flash"

    .line 34
    .line 35
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalBoolean(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lorg/apache/tika/metadata/TIFF;->FLASH_FIRED:Lorg/apache/tika/metadata/Property;

    .line 40
    .line 41
    const-string v0, "exif:ExposureTime"

    .line 42
    .line 43
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalRational(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lorg/apache/tika/metadata/TIFF;->EXPOSURE_TIME:Lorg/apache/tika/metadata/Property;

    .line 48
    .line 49
    const-string v0, "exif:FNumber"

    .line 50
    .line 51
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalRational(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, Lorg/apache/tika/metadata/TIFF;->F_NUMBER:Lorg/apache/tika/metadata/Property;

    .line 56
    .line 57
    const-string v0, "exif:FocalLength"

    .line 58
    .line 59
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalRational(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sput-object v0, Lorg/apache/tika/metadata/TIFF;->FOCAL_LENGTH:Lorg/apache/tika/metadata/Property;

    .line 64
    .line 65
    const-string v0, "exif:IsoSpeedRatings"

    .line 66
    .line 67
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalIntegerSequence(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    sput-object v0, Lorg/apache/tika/metadata/TIFF;->ISO_SPEED_RATINGS:Lorg/apache/tika/metadata/Property;

    .line 72
    .line 73
    const-string v0, "tiff:Make"

    .line 74
    .line 75
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    sput-object v0, Lorg/apache/tika/metadata/TIFF;->EQUIPMENT_MAKE:Lorg/apache/tika/metadata/Property;

    .line 80
    .line 81
    const-string v0, "tiff:Model"

    .line 82
    .line 83
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    sput-object v0, Lorg/apache/tika/metadata/TIFF;->EQUIPMENT_MODEL:Lorg/apache/tika/metadata/Property;

    .line 88
    .line 89
    const-string v0, "tiff:Software"

    .line 90
    .line 91
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    sput-object v0, Lorg/apache/tika/metadata/TIFF;->SOFTWARE:Lorg/apache/tika/metadata/Property;

    .line 96
    .line 97
    const-string v7, "7"

    .line 98
    .line 99
    const-string v8, "8"

    .line 100
    .line 101
    const-string v1, "1"

    .line 102
    .line 103
    const-string v2, "2"

    .line 104
    .line 105
    const-string v3, "3"

    .line 106
    .line 107
    const-string v4, "4"

    .line 108
    .line 109
    const-string v5, "5"

    .line 110
    .line 111
    const-string v6, "6"

    .line 112
    .line 113
    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    const-string v1, "tiff:Orientation"

    .line 118
    .line 119
    invoke-static {v1, v0}, Lorg/apache/tika/metadata/Property;->internalClosedChoise(Ljava/lang/String;[Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    sput-object v0, Lorg/apache/tika/metadata/TIFF;->ORIENTATION:Lorg/apache/tika/metadata/Property;

    .line 124
    .line 125
    const-string v0, "tiff:XResolution"

    .line 126
    .line 127
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalRational(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    sput-object v0, Lorg/apache/tika/metadata/TIFF;->RESOLUTION_HORIZONTAL:Lorg/apache/tika/metadata/Property;

    .line 132
    .line 133
    const-string v0, "tiff:YResolution"

    .line 134
    .line 135
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalRational(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    sput-object v0, Lorg/apache/tika/metadata/TIFF;->RESOLUTION_VERTICAL:Lorg/apache/tika/metadata/Property;

    .line 140
    .line 141
    const-string v0, "Inch"

    .line 142
    .line 143
    const-string v1, "cm"

    .line 144
    .line 145
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    const-string v1, "tiff:ResolutionUnit"

    .line 150
    .line 151
    invoke-static {v1, v0}, Lorg/apache/tika/metadata/Property;->internalClosedChoise(Ljava/lang/String;[Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    sput-object v0, Lorg/apache/tika/metadata/TIFF;->RESOLUTION_UNIT:Lorg/apache/tika/metadata/Property;

    .line 156
    .line 157
    const-string v0, "exif:DateTimeOriginal"

    .line 158
    .line 159
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalDate(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    sput-object v0, Lorg/apache/tika/metadata/TIFF;->ORIGINAL_DATE:Lorg/apache/tika/metadata/Property;

    .line 164
    .line 165
    const-string v0, "exif:PageCount"

    .line 166
    .line 167
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    sput-object v0, Lorg/apache/tika/metadata/TIFF;->EXIF_PAGE_COUNT:Lorg/apache/tika/metadata/Property;

    .line 172
    .line 173
    return-void
.end method

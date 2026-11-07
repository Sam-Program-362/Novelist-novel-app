.class public interface abstract Lorg/apache/tika/metadata/TikaCoreProperties;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/tika/metadata/TikaCoreProperties$EmbeddedResourceType;
    }
.end annotation


# static fields
.field public static final ALTITUDE:Lorg/apache/tika/metadata/Property;

.field public static final COMMENTS:Lorg/apache/tika/metadata/Property;

.field public static final CONTAINER_EXCEPTION:Lorg/apache/tika/metadata/Property;

.field public static final CONTENT_TYPE_HINT:Lorg/apache/tika/metadata/Property;

.field public static final CONTENT_TYPE_PARSER_OVERRIDE:Lorg/apache/tika/metadata/Property;

.field public static final CONTENT_TYPE_USER_OVERRIDE:Lorg/apache/tika/metadata/Property;

.field public static final CONTRIBUTOR:Lorg/apache/tika/metadata/Property;

.field public static final COVERAGE:Lorg/apache/tika/metadata/Property;

.field public static final CREATED:Lorg/apache/tika/metadata/Property;

.field public static final CREATOR:Lorg/apache/tika/metadata/Property;

.field public static final CREATOR_TOOL:Lorg/apache/tika/metadata/Property;

.field public static final DESCRIPTION:Lorg/apache/tika/metadata/Property;

.field public static final DETECTED_ENCODING:Lorg/apache/tika/metadata/Property;

.field public static final EMBEDDED_BYTES_EXCEPTION:Lorg/apache/tika/metadata/Property;

.field public static final EMBEDDED_DEPTH:Lorg/apache/tika/metadata/Property;

.field public static final EMBEDDED_EXCEPTION:Lorg/apache/tika/metadata/Property;

.field public static final EMBEDDED_ID:Lorg/apache/tika/metadata/Property;

.field public static final EMBEDDED_ID_PATH:Lorg/apache/tika/metadata/Property;

.field public static final EMBEDDED_RELATIONSHIP_ID:Ljava/lang/String; = "embeddedRelationshipId"

.field public static final EMBEDDED_RESOURCE_PATH:Lorg/apache/tika/metadata/Property;

.field public static final EMBEDDED_RESOURCE_TYPE:Lorg/apache/tika/metadata/Property;

.field public static final EMBEDDED_RESOURCE_TYPE_KEY:Ljava/lang/String; = "embeddedResourceType"

.field public static final EMBEDDED_STORAGE_CLASS_ID:Ljava/lang/String; = "embeddedStorageClassId"

.field public static final EMBEDDED_WARNING:Lorg/apache/tika/metadata/Property;

.field public static final ENCODING_DETECTOR:Lorg/apache/tika/metadata/Property;

.field public static final FINAL_EMBEDDED_RESOURCE_PATH:Lorg/apache/tika/metadata/Property;

.field public static final FORMAT:Lorg/apache/tika/metadata/Property;

.field public static final HAS_SIGNATURE:Lorg/apache/tika/metadata/Property;

.field public static final IDENTIFIER:Lorg/apache/tika/metadata/Property;

.field public static final IS_ENCRYPTED:Lorg/apache/tika/metadata/Property;

.field public static final LANGUAGE:Lorg/apache/tika/metadata/Property;

.field public static final LATITUDE:Lorg/apache/tika/metadata/Property;

.field public static final LONGITUDE:Lorg/apache/tika/metadata/Property;

.field public static final METADATA_DATE:Lorg/apache/tika/metadata/Property;

.field public static final MODIFIED:Lorg/apache/tika/metadata/Property;

.field public static final MODIFIER:Lorg/apache/tika/metadata/Property;

.field public static final NAMESPACE_PREFIX_DELIMITER:Ljava/lang/String; = ":"

.field public static final NUM_IMAGES:Lorg/apache/tika/metadata/Property;

.field public static final ORIGINAL_RESOURCE_NAME:Lorg/apache/tika/metadata/Property;

.field public static final PARSE_TIME_MILLIS:Lorg/apache/tika/metadata/Property;

.field public static final PIPES_RESULT:Lorg/apache/tika/metadata/Property;

.field public static final PRINT_DATE:Lorg/apache/tika/metadata/Property;

.field public static final PROTECTED:Ljava/lang/String; = "protected"

.field public static final PUBLISHER:Lorg/apache/tika/metadata/Property;

.field public static final RATING:Lorg/apache/tika/metadata/Property;

.field public static final RELATION:Lorg/apache/tika/metadata/Property;

.field public static final RESOURCE_NAME_KEY:Ljava/lang/String; = "resourceName"

.field public static final RIGHTS:Lorg/apache/tika/metadata/Property;

.field public static final SIGNATURE_CONTACT_INFO:Lorg/apache/tika/metadata/Property;

.field public static final SIGNATURE_DATE:Lorg/apache/tika/metadata/Property;

.field public static final SIGNATURE_FILTER:Lorg/apache/tika/metadata/Property;

.field public static final SIGNATURE_LOCATION:Lorg/apache/tika/metadata/Property;

.field public static final SIGNATURE_NAME:Lorg/apache/tika/metadata/Property;

.field public static final SIGNATURE_REASON:Lorg/apache/tika/metadata/Property;

.field public static final SOURCE:Lorg/apache/tika/metadata/Property;

.field public static final SOURCE_PATH:Lorg/apache/tika/metadata/Property;

.field public static final SUBJECT:Lorg/apache/tika/metadata/Property;

.field public static final TIKA_CONTENT:Lorg/apache/tika/metadata/Property;

.field public static final TIKA_CONTENT_HANDLER:Lorg/apache/tika/metadata/Property;

.field public static final TIKA_DETECTED_LANGUAGE:Lorg/apache/tika/metadata/Property;

.field public static final TIKA_DETECTED_LANGUAGE_CONFIDENCE:Lorg/apache/tika/metadata/Property;

.field public static final TIKA_DETECTED_LANGUAGE_CONFIDENCE_RAW:Lorg/apache/tika/metadata/Property;

.field public static final TIKA_META_EXCEPTION_EMBEDDED_STREAM:Lorg/apache/tika/metadata/Property;

.field public static final TIKA_META_EXCEPTION_PREFIX:Ljava/lang/String; = "X-TIKA:EXCEPTION:"

.field public static final TIKA_META_EXCEPTION_WARNING:Lorg/apache/tika/metadata/Property;

.field public static final TIKA_META_PREFIX:Ljava/lang/String; = "X-TIKA:"

.field public static final TIKA_META_WARN_PREFIX:Ljava/lang/String; = "X-TIKA:WARN:"

.field public static final TIKA_PARSED_BY:Lorg/apache/tika/metadata/Property;

.field public static final TIKA_PARSED_BY_FULL_SET:Lorg/apache/tika/metadata/Property;

.field public static final TITLE:Lorg/apache/tika/metadata/Property;

.field public static final TRUNCATED_METADATA:Lorg/apache/tika/metadata/Property;

.field public static final TYPE:Lorg/apache/tika/metadata/Property;

.field public static final VERSION_COUNT:Lorg/apache/tika/metadata/Property;

.field public static final VERSION_NUMBER:Lorg/apache/tika/metadata/Property;

.field public static final WRITE_LIMIT_REACHED:Lorg/apache/tika/metadata/Property;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const-string v0, "X-TIKA:embedded_depth"

    .line 2
    .line 3
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->EMBEDDED_DEPTH:Lorg/apache/tika/metadata/Property;

    .line 8
    .line 9
    const-string v0, "X-TIKA:embedded_resource_path"

    .line 10
    .line 11
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->EMBEDDED_RESOURCE_PATH:Lorg/apache/tika/metadata/Property;

    .line 16
    .line 17
    const-string v0, "X-TIKA:final_embedded_resource_path"

    .line 18
    .line 19
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->FINAL_EMBEDDED_RESOURCE_PATH:Lorg/apache/tika/metadata/Property;

    .line 24
    .line 25
    const-string v0, "X-TIKA:embedded_id_path"

    .line 26
    .line 27
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->EMBEDDED_ID_PATH:Lorg/apache/tika/metadata/Property;

    .line 32
    .line 33
    const-string v0, "X-TIKA:embedded_id"

    .line 34
    .line 35
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->EMBEDDED_ID:Lorg/apache/tika/metadata/Property;

    .line 40
    .line 41
    const-string v0, "X-TIKA:parse_time_millis"

    .line 42
    .line 43
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->PARSE_TIME_MILLIS:Lorg/apache/tika/metadata/Property;

    .line 48
    .line 49
    const-string v0, "X-TIKA:content_handler"

    .line 50
    .line 51
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->TIKA_CONTENT_HANDLER:Lorg/apache/tika/metadata/Property;

    .line 56
    .line 57
    const-string v0, "X-TIKA:content"

    .line 58
    .line 59
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->TIKA_CONTENT:Lorg/apache/tika/metadata/Property;

    .line 64
    .line 65
    const-string v0, "X-TIKA:EXCEPTION:container_exception"

    .line 66
    .line 67
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->CONTAINER_EXCEPTION:Lorg/apache/tika/metadata/Property;

    .line 72
    .line 73
    const-string v0, "X-TIKA:EXCEPTION:embedded_exception"

    .line 74
    .line 75
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->EMBEDDED_EXCEPTION:Lorg/apache/tika/metadata/Property;

    .line 80
    .line 81
    const-string v0, "X-TIKA:EXCEPTION:embedded_bytes_exception"

    .line 82
    .line 83
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->EMBEDDED_BYTES_EXCEPTION:Lorg/apache/tika/metadata/Property;

    .line 88
    .line 89
    const-string v0, "X-TIKA:EXCEPTION:embedded_warning"

    .line 90
    .line 91
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->EMBEDDED_WARNING:Lorg/apache/tika/metadata/Property;

    .line 96
    .line 97
    const-string v0, "X-TIKA:EXCEPTION:write_limit_reached"

    .line 98
    .line 99
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalBoolean(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->WRITE_LIMIT_REACHED:Lorg/apache/tika/metadata/Property;

    .line 104
    .line 105
    const-string v0, "X-TIKA:EXCEPTION:warn"

    .line 106
    .line 107
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->TIKA_META_EXCEPTION_WARNING:Lorg/apache/tika/metadata/Property;

    .line 112
    .line 113
    const-string v0, "X-TIKA:WARN:truncated_metadata"

    .line 114
    .line 115
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalBoolean(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->TRUNCATED_METADATA:Lorg/apache/tika/metadata/Property;

    .line 120
    .line 121
    const-string v0, "X-TIKA:EXCEPTION:embedded_stream_exception"

    .line 122
    .line 123
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->TIKA_META_EXCEPTION_EMBEDDED_STREAM:Lorg/apache/tika/metadata/Property;

    .line 128
    .line 129
    const-string v0, "X-TIKA:Parsed-By"

    .line 130
    .line 131
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->TIKA_PARSED_BY:Lorg/apache/tika/metadata/Property;

    .line 136
    .line 137
    const-string v0, "X-TIKA:Parsed-By-Full-Set"

    .line 138
    .line 139
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->TIKA_PARSED_BY_FULL_SET:Lorg/apache/tika/metadata/Property;

    .line 144
    .line 145
    const-string v0, "X-TIKA:detected_language"

    .line 146
    .line 147
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->TIKA_DETECTED_LANGUAGE:Lorg/apache/tika/metadata/Property;

    .line 152
    .line 153
    const-string v0, "X-TIKA:detected_language_confidence"

    .line 154
    .line 155
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->TIKA_DETECTED_LANGUAGE_CONFIDENCE:Lorg/apache/tika/metadata/Property;

    .line 160
    .line 161
    const-string v0, "X-TIKA:detected_language_confidence_raw"

    .line 162
    .line 163
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalRealSeq(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->TIKA_DETECTED_LANGUAGE_CONFIDENCE_RAW:Lorg/apache/tika/metadata/Property;

    .line 168
    .line 169
    const-string v0, "X-TIKA:origResourceName"

    .line 170
    .line 171
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->ORIGINAL_RESOURCE_NAME:Lorg/apache/tika/metadata/Property;

    .line 176
    .line 177
    const-string v0, "X-TIKA:sourcePath"

    .line 178
    .line 179
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->SOURCE_PATH:Lorg/apache/tika/metadata/Property;

    .line 184
    .line 185
    const-string v0, "Content-Type-Hint"

    .line 186
    .line 187
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->CONTENT_TYPE_HINT:Lorg/apache/tika/metadata/Property;

    .line 192
    .line 193
    const-string v0, "Content-Type-Override"

    .line 194
    .line 195
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->CONTENT_TYPE_USER_OVERRIDE:Lorg/apache/tika/metadata/Property;

    .line 200
    .line 201
    const-string v0, "Content-Type-Parser-Override"

    .line 202
    .line 203
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->CONTENT_TYPE_PARSER_OVERRIDE:Lorg/apache/tika/metadata/Property;

    .line 208
    .line 209
    sget-object v0, Lorg/apache/tika/metadata/DublinCore;->FORMAT:Lorg/apache/tika/metadata/Property;

    .line 210
    .line 211
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->FORMAT:Lorg/apache/tika/metadata/Property;

    .line 212
    .line 213
    sget-object v0, Lorg/apache/tika/metadata/DublinCore;->IDENTIFIER:Lorg/apache/tika/metadata/Property;

    .line 214
    .line 215
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->IDENTIFIER:Lorg/apache/tika/metadata/Property;

    .line 216
    .line 217
    sget-object v0, Lorg/apache/tika/metadata/DublinCore;->CONTRIBUTOR:Lorg/apache/tika/metadata/Property;

    .line 218
    .line 219
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->CONTRIBUTOR:Lorg/apache/tika/metadata/Property;

    .line 220
    .line 221
    sget-object v0, Lorg/apache/tika/metadata/DublinCore;->COVERAGE:Lorg/apache/tika/metadata/Property;

    .line 222
    .line 223
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->COVERAGE:Lorg/apache/tika/metadata/Property;

    .line 224
    .line 225
    sget-object v0, Lorg/apache/tika/metadata/DublinCore;->CREATOR:Lorg/apache/tika/metadata/Property;

    .line 226
    .line 227
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->CREATOR:Lorg/apache/tika/metadata/Property;

    .line 228
    .line 229
    sget-object v0, Lorg/apache/tika/metadata/Office;->LAST_AUTHOR:Lorg/apache/tika/metadata/Property;

    .line 230
    .line 231
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->MODIFIER:Lorg/apache/tika/metadata/Property;

    .line 232
    .line 233
    sget-object v0, Lorg/apache/tika/metadata/XMP;->CREATOR_TOOL:Lorg/apache/tika/metadata/Property;

    .line 234
    .line 235
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->CREATOR_TOOL:Lorg/apache/tika/metadata/Property;

    .line 236
    .line 237
    sget-object v0, Lorg/apache/tika/metadata/DublinCore;->LANGUAGE:Lorg/apache/tika/metadata/Property;

    .line 238
    .line 239
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->LANGUAGE:Lorg/apache/tika/metadata/Property;

    .line 240
    .line 241
    sget-object v0, Lorg/apache/tika/metadata/DublinCore;->PUBLISHER:Lorg/apache/tika/metadata/Property;

    .line 242
    .line 243
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->PUBLISHER:Lorg/apache/tika/metadata/Property;

    .line 244
    .line 245
    sget-object v0, Lorg/apache/tika/metadata/DublinCore;->RELATION:Lorg/apache/tika/metadata/Property;

    .line 246
    .line 247
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->RELATION:Lorg/apache/tika/metadata/Property;

    .line 248
    .line 249
    sget-object v0, Lorg/apache/tika/metadata/DublinCore;->RIGHTS:Lorg/apache/tika/metadata/Property;

    .line 250
    .line 251
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->RIGHTS:Lorg/apache/tika/metadata/Property;

    .line 252
    .line 253
    sget-object v0, Lorg/apache/tika/metadata/DublinCore;->SOURCE:Lorg/apache/tika/metadata/Property;

    .line 254
    .line 255
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->SOURCE:Lorg/apache/tika/metadata/Property;

    .line 256
    .line 257
    sget-object v0, Lorg/apache/tika/metadata/DublinCore;->TYPE:Lorg/apache/tika/metadata/Property;

    .line 258
    .line 259
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->TYPE:Lorg/apache/tika/metadata/Property;

    .line 260
    .line 261
    sget-object v0, Lorg/apache/tika/metadata/DublinCore;->TITLE:Lorg/apache/tika/metadata/Property;

    .line 262
    .line 263
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->TITLE:Lorg/apache/tika/metadata/Property;

    .line 264
    .line 265
    sget-object v0, Lorg/apache/tika/metadata/DublinCore;->DESCRIPTION:Lorg/apache/tika/metadata/Property;

    .line 266
    .line 267
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->DESCRIPTION:Lorg/apache/tika/metadata/Property;

    .line 268
    .line 269
    sget-object v0, Lorg/apache/tika/metadata/DublinCore;->SUBJECT:Lorg/apache/tika/metadata/Property;

    .line 270
    .line 271
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->SUBJECT:Lorg/apache/tika/metadata/Property;

    .line 272
    .line 273
    sget-object v0, Lorg/apache/tika/metadata/DublinCore;->CREATED:Lorg/apache/tika/metadata/Property;

    .line 274
    .line 275
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->CREATED:Lorg/apache/tika/metadata/Property;

    .line 276
    .line 277
    sget-object v0, Lorg/apache/tika/metadata/DublinCore;->MODIFIED:Lorg/apache/tika/metadata/Property;

    .line 278
    .line 279
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->MODIFIED:Lorg/apache/tika/metadata/Property;

    .line 280
    .line 281
    sget-object v0, Lorg/apache/tika/metadata/Office;->PRINT_DATE:Lorg/apache/tika/metadata/Property;

    .line 282
    .line 283
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->PRINT_DATE:Lorg/apache/tika/metadata/Property;

    .line 284
    .line 285
    sget-object v0, Lorg/apache/tika/metadata/XMP;->METADATA_DATE:Lorg/apache/tika/metadata/Property;

    .line 286
    .line 287
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->METADATA_DATE:Lorg/apache/tika/metadata/Property;

    .line 288
    .line 289
    sget-object v0, Lorg/apache/tika/metadata/Geographic;->LATITUDE:Lorg/apache/tika/metadata/Property;

    .line 290
    .line 291
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->LATITUDE:Lorg/apache/tika/metadata/Property;

    .line 292
    .line 293
    sget-object v0, Lorg/apache/tika/metadata/Geographic;->LONGITUDE:Lorg/apache/tika/metadata/Property;

    .line 294
    .line 295
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->LONGITUDE:Lorg/apache/tika/metadata/Property;

    .line 296
    .line 297
    sget-object v0, Lorg/apache/tika/metadata/Geographic;->ALTITUDE:Lorg/apache/tika/metadata/Property;

    .line 298
    .line 299
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->ALTITUDE:Lorg/apache/tika/metadata/Property;

    .line 300
    .line 301
    sget-object v0, Lorg/apache/tika/metadata/XMP;->RATING:Lorg/apache/tika/metadata/Property;

    .line 302
    .line 303
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->RATING:Lorg/apache/tika/metadata/Property;

    .line 304
    .line 305
    const-string v0, "imagereader:NumImages"

    .line 306
    .line 307
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->NUM_IMAGES:Lorg/apache/tika/metadata/Property;

    .line 312
    .line 313
    sget-object v0, Lorg/apache/tika/metadata/OfficeOpenXMLExtended;->COMMENTS:Lorg/apache/tika/metadata/Property;

    .line 314
    .line 315
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->COMMENTS:Lorg/apache/tika/metadata/Property;

    .line 316
    .line 317
    sget-object v0, Lorg/apache/tika/metadata/TikaCoreProperties$EmbeddedResourceType;->ATTACHMENT:Lorg/apache/tika/metadata/TikaCoreProperties$EmbeddedResourceType;

    .line 318
    .line 319
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    sget-object v0, Lorg/apache/tika/metadata/TikaCoreProperties$EmbeddedResourceType;->INLINE:Lorg/apache/tika/metadata/TikaCoreProperties$EmbeddedResourceType;

    .line 324
    .line 325
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    sget-object v0, Lorg/apache/tika/metadata/TikaCoreProperties$EmbeddedResourceType;->METADATA:Lorg/apache/tika/metadata/TikaCoreProperties$EmbeddedResourceType;

    .line 330
    .line 331
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v3

    .line 335
    sget-object v0, Lorg/apache/tika/metadata/TikaCoreProperties$EmbeddedResourceType;->MACRO:Lorg/apache/tika/metadata/TikaCoreProperties$EmbeddedResourceType;

    .line 336
    .line 337
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v4

    .line 341
    sget-object v0, Lorg/apache/tika/metadata/TikaCoreProperties$EmbeddedResourceType;->THUMBNAIL:Lorg/apache/tika/metadata/TikaCoreProperties$EmbeddedResourceType;

    .line 342
    .line 343
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v5

    .line 347
    sget-object v0, Lorg/apache/tika/metadata/TikaCoreProperties$EmbeddedResourceType;->RENDERING:Lorg/apache/tika/metadata/TikaCoreProperties$EmbeddedResourceType;

    .line 348
    .line 349
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v6

    .line 353
    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    const-string v1, "embeddedResourceType"

    .line 358
    .line 359
    invoke-static {v1, v0}, Lorg/apache/tika/metadata/Property;->internalClosedChoise(Ljava/lang/String;[Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->EMBEDDED_RESOURCE_TYPE:Lorg/apache/tika/metadata/Property;

    .line 364
    .line 365
    const-string v0, "hasSignature"

    .line 366
    .line 367
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalBoolean(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->HAS_SIGNATURE:Lorg/apache/tika/metadata/Property;

    .line 372
    .line 373
    const-string v0, "signature:name"

    .line 374
    .line 375
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->SIGNATURE_NAME:Lorg/apache/tika/metadata/Property;

    .line 380
    .line 381
    const-string v0, "signature:date"

    .line 382
    .line 383
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalDateBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->SIGNATURE_DATE:Lorg/apache/tika/metadata/Property;

    .line 388
    .line 389
    const-string v0, "signature:location"

    .line 390
    .line 391
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->SIGNATURE_LOCATION:Lorg/apache/tika/metadata/Property;

    .line 396
    .line 397
    const-string v0, "signature:reason"

    .line 398
    .line 399
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->SIGNATURE_REASON:Lorg/apache/tika/metadata/Property;

    .line 404
    .line 405
    const-string v0, "signature:filter"

    .line 406
    .line 407
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->SIGNATURE_FILTER:Lorg/apache/tika/metadata/Property;

    .line 412
    .line 413
    const-string v0, "signature:contact-info"

    .line 414
    .line 415
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->SIGNATURE_CONTACT_INFO:Lorg/apache/tika/metadata/Property;

    .line 420
    .line 421
    const-string v0, "X-TIKA:encrypted"

    .line 422
    .line 423
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalBoolean(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->IS_ENCRYPTED:Lorg/apache/tika/metadata/Property;

    .line 428
    .line 429
    const-string v0, "X-TIKA:detectedEncoding"

    .line 430
    .line 431
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->DETECTED_ENCODING:Lorg/apache/tika/metadata/Property;

    .line 436
    .line 437
    const-string v0, "X-TIKA:encodingDetector"

    .line 438
    .line 439
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->ENCODING_DETECTOR:Lorg/apache/tika/metadata/Property;

    .line 444
    .line 445
    const-string v0, "X-TIKA:versionCount"

    .line 446
    .line 447
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->VERSION_COUNT:Lorg/apache/tika/metadata/Property;

    .line 452
    .line 453
    const-string v0, "X-TIKA:versionNumber"

    .line 454
    .line 455
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->VERSION_NUMBER:Lorg/apache/tika/metadata/Property;

    .line 460
    .line 461
    const-string v0, "X-TIKA:pipes_result"

    .line 462
    .line 463
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    sput-object v0, Lorg/apache/tika/metadata/TikaCoreProperties;->PIPES_RESULT:Lorg/apache/tika/metadata/Property;

    .line 468
    .line 469
    return-void
.end method

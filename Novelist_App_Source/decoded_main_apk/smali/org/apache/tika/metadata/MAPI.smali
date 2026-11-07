.class public interface abstract Lorg/apache/tika/metadata/MAPI;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ATTACH_CONTENT_ID:Lorg/apache/tika/metadata/Property;

.field public static final ATTACH_CONTENT_LOCATION:Lorg/apache/tika/metadata/Property;

.field public static final ATTACH_DISPLAY_NAME:Lorg/apache/tika/metadata/Property;

.field public static final ATTACH_EXTENSION:Lorg/apache/tika/metadata/Property;

.field public static final ATTACH_FILE_NAME:Lorg/apache/tika/metadata/Property;

.field public static final ATTACH_LANGUAGE:Lorg/apache/tika/metadata/Property;

.field public static final ATTACH_LONG_FILE_NAME:Lorg/apache/tika/metadata/Property;

.field public static final ATTACH_LONG_PATH_NAME:Lorg/apache/tika/metadata/Property;

.field public static final ATTACH_MIME:Lorg/apache/tika/metadata/Property;

.field public static final BODY_TYPES_PROCESSED:Lorg/apache/tika/metadata/Property;

.field public static final CONVERSATION_INDEX:Lorg/apache/tika/metadata/Property;

.field public static final CONVERSATION_TOPIC:Lorg/apache/tika/metadata/Property;

.field public static final FROM_REPRESENTING_EMAIL:Lorg/apache/tika/metadata/Property;

.field public static final FROM_REPRESENTING_NAME:Lorg/apache/tika/metadata/Property;

.field public static final IMPORTANCE:Lorg/apache/tika/metadata/Property;

.field public static final INTERNET_MESSAGE_ID:Lorg/apache/tika/metadata/Property;

.field public static final INTERNET_REFERENCES:Lorg/apache/tika/metadata/Property;

.field public static final IN_REPLY_TO_ID:Lorg/apache/tika/metadata/Property;

.field public static final IS_FLAGGED:Lorg/apache/tika/metadata/Property;

.field public static final MESSAGE_CLASS:Lorg/apache/tika/metadata/Property;

.field public static final MESSAGE_CLASS_RAW:Lorg/apache/tika/metadata/Property;

.field public static final PREFIX_MAPI_ATTACH_META:Ljava/lang/String; = "mapi:attach:"

.field public static final PREFIX_MAPI_META:Ljava/lang/String; = "mapi:"

.field public static final PREFIX_MAPI_PROPERTY:Ljava/lang/String; = "mapi:property:"

.field public static final PRIORTY:Lorg/apache/tika/metadata/Property;

.field public static final RECIPIENTS_STRING:Lorg/apache/tika/metadata/Property;

.field public static final SENT_BY_SERVER_TYPE:Lorg/apache/tika/metadata/Property;

.field public static final SUBMISSION_ACCEPTED_AT_TIME:Lorg/apache/tika/metadata/Property;

.field public static final SUBMISSION_ID:Lorg/apache/tika/metadata/Property;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "mapi:message-class"

    .line 2
    .line 3
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lorg/apache/tika/metadata/MAPI;->MESSAGE_CLASS:Lorg/apache/tika/metadata/Property;

    .line 8
    .line 9
    const-string v0, "mapi:message-class-raw"

    .line 10
    .line 11
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lorg/apache/tika/metadata/MAPI;->MESSAGE_CLASS_RAW:Lorg/apache/tika/metadata/Property;

    .line 16
    .line 17
    const-string v0, "mapi:sent-by-server-type"

    .line 18
    .line 19
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lorg/apache/tika/metadata/MAPI;->SENT_BY_SERVER_TYPE:Lorg/apache/tika/metadata/Property;

    .line 24
    .line 25
    const-string v0, "mapi:from-representing-name"

    .line 26
    .line 27
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lorg/apache/tika/metadata/MAPI;->FROM_REPRESENTING_NAME:Lorg/apache/tika/metadata/Property;

    .line 32
    .line 33
    const-string v0, "mapi:from-representing-email"

    .line 34
    .line 35
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lorg/apache/tika/metadata/MAPI;->FROM_REPRESENTING_EMAIL:Lorg/apache/tika/metadata/Property;

    .line 40
    .line 41
    const-string v0, "mapi:msg-submission-accepted-at-time"

    .line 42
    .line 43
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalDate(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lorg/apache/tika/metadata/MAPI;->SUBMISSION_ACCEPTED_AT_TIME:Lorg/apache/tika/metadata/Property;

    .line 48
    .line 49
    const-string v0, "mapi:msg-submission-id"

    .line 50
    .line 51
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, Lorg/apache/tika/metadata/MAPI;->SUBMISSION_ID:Lorg/apache/tika/metadata/Property;

    .line 56
    .line 57
    const-string v0, "mapi:internet-message-id"

    .line 58
    .line 59
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sput-object v0, Lorg/apache/tika/metadata/MAPI;->INTERNET_MESSAGE_ID:Lorg/apache/tika/metadata/Property;

    .line 64
    .line 65
    const-string v0, "mapi:internet-references"

    .line 66
    .line 67
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    sput-object v0, Lorg/apache/tika/metadata/MAPI;->INTERNET_REFERENCES:Lorg/apache/tika/metadata/Property;

    .line 72
    .line 73
    const-string v0, "mapi:conversation-topic"

    .line 74
    .line 75
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    sput-object v0, Lorg/apache/tika/metadata/MAPI;->CONVERSATION_TOPIC:Lorg/apache/tika/metadata/Property;

    .line 80
    .line 81
    const-string v0, "mapi:conversation-index"

    .line 82
    .line 83
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    sput-object v0, Lorg/apache/tika/metadata/MAPI;->CONVERSATION_INDEX:Lorg/apache/tika/metadata/Property;

    .line 88
    .line 89
    const-string v0, "mapi:in-reply-to-id"

    .line 90
    .line 91
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    sput-object v0, Lorg/apache/tika/metadata/MAPI;->IN_REPLY_TO_ID:Lorg/apache/tika/metadata/Property;

    .line 96
    .line 97
    const-string v0, "mapi:recipients-string"

    .line 98
    .line 99
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    sput-object v0, Lorg/apache/tika/metadata/MAPI;->RECIPIENTS_STRING:Lorg/apache/tika/metadata/Property;

    .line 104
    .line 105
    const-string v0, "mapi:importance"

    .line 106
    .line 107
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    sput-object v0, Lorg/apache/tika/metadata/MAPI;->IMPORTANCE:Lorg/apache/tika/metadata/Property;

    .line 112
    .line 113
    const-string v0, "mapi:priority"

    .line 114
    .line 115
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    sput-object v0, Lorg/apache/tika/metadata/MAPI;->PRIORTY:Lorg/apache/tika/metadata/Property;

    .line 120
    .line 121
    const-string v0, "mapi:is-flagged"

    .line 122
    .line 123
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalBoolean(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    sput-object v0, Lorg/apache/tika/metadata/MAPI;->IS_FLAGGED:Lorg/apache/tika/metadata/Property;

    .line 128
    .line 129
    const-string v0, "mapi:body-types-processed"

    .line 130
    .line 131
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    sput-object v0, Lorg/apache/tika/metadata/MAPI;->BODY_TYPES_PROCESSED:Lorg/apache/tika/metadata/Property;

    .line 136
    .line 137
    const-string v0, "mapi:attach:long-path-name"

    .line 138
    .line 139
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    sput-object v0, Lorg/apache/tika/metadata/MAPI;->ATTACH_LONG_PATH_NAME:Lorg/apache/tika/metadata/Property;

    .line 144
    .line 145
    const-string v0, "mapi:attach:long-file-name"

    .line 146
    .line 147
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    sput-object v0, Lorg/apache/tika/metadata/MAPI;->ATTACH_LONG_FILE_NAME:Lorg/apache/tika/metadata/Property;

    .line 152
    .line 153
    const-string v0, "mapi:attach:file-name"

    .line 154
    .line 155
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    sput-object v0, Lorg/apache/tika/metadata/MAPI;->ATTACH_FILE_NAME:Lorg/apache/tika/metadata/Property;

    .line 160
    .line 161
    const-string v0, "mapi:attach:content-id"

    .line 162
    .line 163
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    sput-object v0, Lorg/apache/tika/metadata/MAPI;->ATTACH_CONTENT_ID:Lorg/apache/tika/metadata/Property;

    .line 168
    .line 169
    const-string v0, "mapi:attach:content-location"

    .line 170
    .line 171
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    sput-object v0, Lorg/apache/tika/metadata/MAPI;->ATTACH_CONTENT_LOCATION:Lorg/apache/tika/metadata/Property;

    .line 176
    .line 177
    const-string v0, "mapi:attach:display-name"

    .line 178
    .line 179
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    sput-object v0, Lorg/apache/tika/metadata/MAPI;->ATTACH_DISPLAY_NAME:Lorg/apache/tika/metadata/Property;

    .line 184
    .line 185
    const-string v0, "mapi:attach:extension"

    .line 186
    .line 187
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    sput-object v0, Lorg/apache/tika/metadata/MAPI;->ATTACH_EXTENSION:Lorg/apache/tika/metadata/Property;

    .line 192
    .line 193
    const-string v0, "mapi:attach:mime"

    .line 194
    .line 195
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    sput-object v0, Lorg/apache/tika/metadata/MAPI;->ATTACH_MIME:Lorg/apache/tika/metadata/Property;

    .line 200
    .line 201
    const-string v0, "mapi:attach:language"

    .line 202
    .line 203
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    sput-object v0, Lorg/apache/tika/metadata/MAPI;->ATTACH_LANGUAGE:Lorg/apache/tika/metadata/Property;

    .line 208
    .line 209
    return-void
.end method

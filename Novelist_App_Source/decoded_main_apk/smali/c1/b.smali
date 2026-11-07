.class public abstract Lc1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LJ0/c;

.field public static final b:LJ0/c;

.field public static final c:[LJ0/c;


# direct methods
.method static constructor <clinit>()V
    .locals 17

    .line 1
    new-instance v0, LJ0/c;

    .line 2
    .line 3
    const-string v1, "GET_CREDENTIAL"

    .line 4
    .line 5
    const-wide/16 v2, 0x1

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, v3}, LJ0/c;-><init>(Ljava/lang/String;J)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lc1/b;->a:LJ0/c;

    .line 11
    .line 12
    new-instance v1, LJ0/c;

    .line 13
    .line 14
    const-string v4, "CREDENTIAL_REGISTRY"

    .line 15
    .line 16
    invoke-direct {v1, v4, v2, v3}, LJ0/c;-><init>(Ljava/lang/String;J)V

    .line 17
    .line 18
    .line 19
    new-instance v4, LJ0/c;

    .line 20
    .line 21
    const-string v5, "CLEAR_REGISTRY"

    .line 22
    .line 23
    const-wide/16 v6, 0x2

    .line 24
    .line 25
    invoke-direct {v4, v5, v6, v7}, LJ0/c;-><init>(Ljava/lang/String;J)V

    .line 26
    .line 27
    .line 28
    new-instance v5, LJ0/c;

    .line 29
    .line 30
    const-string v6, "CLEAR_CREATION_OPTIONS"

    .line 31
    .line 32
    invoke-direct {v5, v6, v2, v3}, LJ0/c;-><init>(Ljava/lang/String;J)V

    .line 33
    .line 34
    .line 35
    move-object v6, v4

    .line 36
    new-instance v4, LJ0/c;

    .line 37
    .line 38
    const-string v7, "CLEAR_CREDENTIAL_STATE"

    .line 39
    .line 40
    invoke-direct {v4, v7, v2, v3}, LJ0/c;-><init>(Ljava/lang/String;J)V

    .line 41
    .line 42
    .line 43
    sput-object v4, Lc1/b;->b:LJ0/c;

    .line 44
    .line 45
    move-object v7, v5

    .line 46
    new-instance v5, LJ0/c;

    .line 47
    .line 48
    const-string v8, "CREATE_CREDENTIAL"

    .line 49
    .line 50
    const-wide/16 v9, 0x3

    .line 51
    .line 52
    invoke-direct {v5, v8, v9, v10}, LJ0/c;-><init>(Ljava/lang/String;J)V

    .line 53
    .line 54
    .line 55
    move-object v8, v6

    .line 56
    new-instance v6, LJ0/c;

    .line 57
    .line 58
    const-string v11, "REGISTER_CREATION_OPTIONS"

    .line 59
    .line 60
    invoke-direct {v6, v11, v2, v3}, LJ0/c;-><init>(Ljava/lang/String;J)V

    .line 61
    .line 62
    .line 63
    move-object v11, v7

    .line 64
    new-instance v7, LJ0/c;

    .line 65
    .line 66
    const-string v12, "REGISTER_EXPORT"

    .line 67
    .line 68
    invoke-direct {v7, v12, v2, v3}, LJ0/c;-><init>(Ljava/lang/String;J)V

    .line 69
    .line 70
    .line 71
    move-object v12, v8

    .line 72
    new-instance v8, LJ0/c;

    .line 73
    .line 74
    const-string v13, "IMPORT_CREDENTIALS"

    .line 75
    .line 76
    invoke-direct {v8, v13, v2, v3}, LJ0/c;-><init>(Ljava/lang/String;J)V

    .line 77
    .line 78
    .line 79
    new-instance v13, LJ0/c;

    .line 80
    .line 81
    const-string v14, "SIGNAL_CREDENTIAL_STATE"

    .line 82
    .line 83
    invoke-direct {v13, v14, v2, v3}, LJ0/c;-><init>(Ljava/lang/String;J)V

    .line 84
    .line 85
    .line 86
    new-instance v14, LJ0/c;

    .line 87
    .line 88
    const-string v15, "CLEAR_EXPORT"

    .line 89
    .line 90
    invoke-direct {v14, v15, v2, v3}, LJ0/c;-><init>(Ljava/lang/String;J)V

    .line 91
    .line 92
    .line 93
    move-object v3, v11

    .line 94
    new-instance v11, LJ0/c;

    .line 95
    .line 96
    const-string v2, "IMPORT_CREDENTIALS_FOR_DEVICE_SETUP"

    .line 97
    .line 98
    invoke-direct {v11, v2, v9, v10}, LJ0/c;-><init>(Ljava/lang/String;J)V

    .line 99
    .line 100
    .line 101
    move-object v2, v12

    .line 102
    new-instance v12, LJ0/c;

    .line 103
    .line 104
    const-string v15, "EXPORT_CREDENTIALS_TO_DEVICE_SETUP"

    .line 105
    .line 106
    invoke-direct {v12, v15, v9, v10}, LJ0/c;-><init>(Ljava/lang/String;J)V

    .line 107
    .line 108
    .line 109
    move-object v15, v13

    .line 110
    new-instance v13, LJ0/c;

    .line 111
    .line 112
    move-object/from16 v16, v0

    .line 113
    .line 114
    const-string v0, "GET_CREDENTIAL_TRANSFER_CAPABILITIES"

    .line 115
    .line 116
    invoke-direct {v13, v0, v9, v10}, LJ0/c;-><init>(Ljava/lang/String;J)V

    .line 117
    .line 118
    .line 119
    move-object v10, v14

    .line 120
    move-object v9, v15

    .line 121
    move-object/from16 v0, v16

    .line 122
    .line 123
    filled-new-array/range {v0 .. v13}, [LJ0/c;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    sput-object v0, Lc1/b;->c:[LJ0/c;

    .line 128
    .line 129
    return-void
.end method

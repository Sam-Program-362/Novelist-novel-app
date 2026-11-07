.class public final synthetic LM1/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:I

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, LM1/b0;->k:I

    iput-object p1, p0, LM1/b0;->l:Ljava/lang/Object;

    iput-object p2, p0, LM1/b0;->m:Ljava/lang/Object;

    iput-object p3, p0, LM1/b0;->n:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget v0, p0, LM1/b0;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LM1/b0;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lorg/apache/tika/parser/external/ExternalParser;

    .line 9
    .line 10
    iget-object v1, p0, LM1/b0;->m:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/io/InputStream;

    .line 13
    .line 14
    iget-object v2, p0, LM1/b0;->n:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Lorg/apache/tika/metadata/Metadata;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Lorg/apache/tika/parser/external/ExternalParser;->c(Lorg/apache/tika/parser/external/ExternalParser;Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    iget-object v0, p0, LM1/b0;->l:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, LM1/g0;

    .line 25
    .line 26
    iget-object v1, p0, LM1/b0;->m:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Landroid/webkit/WebView;

    .line 29
    .line 30
    iget-object v2, p0, LM1/b0;->n:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, Landroid/webkit/WebResourceRequest;

    .line 33
    .line 34
    iget-object v3, v0, LM1/g0;->a:LM1/n;

    .line 35
    .line 36
    new-instance v4, LM1/q;

    .line 37
    .line 38
    const/4 v5, 0x2

    .line 39
    invoke-direct {v4, v5}, LM1/q;-><init>(I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    const-string v5, "webViewArg"

    .line 46
    .line 47
    invoke-static {v1, v5}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const-string v5, "requestArg"

    .line 51
    .line 52
    invoke-static {v2, v5}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iget-object v3, v3, LM1/n;->a:LM1/O;

    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    iget-object v5, v3, LM1/O;->c:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v5, LM1/d;

    .line 63
    .line 64
    invoke-virtual {v5, v0}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-nez v5, :cond_0

    .line 69
    .line 70
    const-string v0, "Callback to `WebViewClient.requestLoading` failed because native instance was not in the instance manager."

    .line 71
    .line 72
    const-string v1, ""

    .line 73
    .line 74
    const-string v2, "missing-instance-error"

    .line 75
    .line 76
    invoke-static {v2, v0, v1}, LB1/e;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_0
    iget-object v5, v3, LM1/O;->b:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v5, LC1/f;

    .line 83
    .line 84
    invoke-virtual {v3}, LM1/O;->a()LC1/l;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    new-instance v6, LB1/s;

    .line 89
    .line 90
    const-string v7, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.requestLoading"

    .line 91
    .line 92
    const/4 v8, 0x0

    .line 93
    invoke-direct {v6, v5, v7, v3, v8}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 94
    .line 95
    .line 96
    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-static {v0}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    new-instance v1, LM1/N;

    .line 105
    .line 106
    const/4 v2, 0x1

    .line 107
    invoke-direct {v1, v4, v2}, LM1/N;-><init>(Ljava/lang/Object;I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v6, v0, v1}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 111
    .line 112
    .line 113
    :goto_0
    return-void

    .line 114
    :pswitch_1
    iget-object v0, p0, LM1/b0;->l:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v0, LM1/g0;

    .line 117
    .line 118
    iget-object v1, p0, LM1/b0;->m:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v1, Landroid/webkit/WebView;

    .line 121
    .line 122
    iget-object v2, p0, LM1/b0;->n:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v2, Landroid/webkit/ClientCertRequest;

    .line 125
    .line 126
    iget-object v3, v0, LM1/g0;->a:LM1/n;

    .line 127
    .line 128
    new-instance v4, LM1/q;

    .line 129
    .line 130
    const/4 v5, 0x2

    .line 131
    invoke-direct {v4, v5}, LM1/q;-><init>(I)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    const-string v5, "viewArg"

    .line 138
    .line 139
    invoke-static {v1, v5}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    const-string v5, "requestArg"

    .line 143
    .line 144
    invoke-static {v2, v5}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    iget-object v3, v3, LM1/n;->a:LM1/O;

    .line 148
    .line 149
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    iget-object v5, v3, LM1/O;->c:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v5, LM1/d;

    .line 155
    .line 156
    invoke-virtual {v5, v0}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    if-nez v5, :cond_1

    .line 161
    .line 162
    const-string v0, "Callback to `WebViewClient.onReceivedClientCertRequest` failed because native instance was not in the instance manager."

    .line 163
    .line 164
    const-string v1, ""

    .line 165
    .line 166
    const-string v2, "missing-instance-error"

    .line 167
    .line 168
    invoke-static {v2, v0, v1}, LB1/e;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    goto :goto_1

    .line 172
    :cond_1
    iget-object v5, v3, LM1/O;->b:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v5, LC1/f;

    .line 175
    .line 176
    invoke-virtual {v3}, LM1/O;->a()LC1/l;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    new-instance v6, LB1/s;

    .line 181
    .line 182
    const-string v7, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedClientCertRequest"

    .line 183
    .line 184
    const/4 v8, 0x0

    .line 185
    invoke-direct {v6, v5, v7, v3, v8}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 186
    .line 187
    .line 188
    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-static {v0}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    new-instance v1, LM1/N;

    .line 197
    .line 198
    const/4 v2, 0x0

    .line 199
    invoke-direct {v1, v4, v2}, LM1/N;-><init>(Ljava/lang/Object;I)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v6, v0, v1}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 203
    .line 204
    .line 205
    :goto_1
    return-void

    .line 206
    nop

    .line 207
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

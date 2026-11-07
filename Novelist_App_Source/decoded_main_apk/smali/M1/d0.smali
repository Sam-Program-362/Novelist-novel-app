.class public final synthetic LM1/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:I

.field public final synthetic l:LM1/g0;

.field public final synthetic m:Landroid/webkit/WebView;

.field public final synthetic n:Ljava/lang/String;

.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LM1/g0;Landroid/webkit/WebView;Landroid/webkit/HttpAuthHandler;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, LM1/d0;->k:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM1/d0;->l:LM1/g0;

    iput-object p2, p0, LM1/d0;->m:Landroid/webkit/WebView;

    iput-object p3, p0, LM1/d0;->p:Ljava/lang/Object;

    iput-object p4, p0, LM1/d0;->n:Ljava/lang/String;

    iput-object p5, p0, LM1/d0;->o:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(LM1/g0;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, LM1/d0;->k:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM1/d0;->l:LM1/g0;

    iput-object p2, p0, LM1/d0;->m:Landroid/webkit/WebView;

    iput-object p3, p0, LM1/d0;->n:Ljava/lang/String;

    iput-object p4, p0, LM1/d0;->o:Ljava/lang/String;

    iput-object p5, p0, LM1/d0;->p:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget v0, p0, LM1/d0;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LM1/d0;->p:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/webkit/HttpAuthHandler;

    .line 9
    .line 10
    iget-object v1, p0, LM1/d0;->l:LM1/g0;

    .line 11
    .line 12
    iget-object v2, v1, LM1/g0;->a:LM1/n;

    .line 13
    .line 14
    new-instance v3, LM1/q;

    .line 15
    .line 16
    const/4 v4, 0x2

    .line 17
    invoke-direct {v3, v4}, LM1/q;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    const-string v4, "webViewArg"

    .line 24
    .line 25
    iget-object v5, p0, LM1/d0;->m:Landroid/webkit/WebView;

    .line 26
    .line 27
    invoke-static {v5, v4}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const-string v4, "handlerArg"

    .line 31
    .line 32
    invoke-static {v0, v4}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const-string v4, "hostArg"

    .line 36
    .line 37
    iget-object v6, p0, LM1/d0;->n:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v6, v4}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const-string v4, "realmArg"

    .line 43
    .line 44
    iget-object v7, p0, LM1/d0;->o:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v7, v4}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-object v2, v2, LM1/n;->a:LM1/O;

    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    iget-object v4, v2, LM1/O;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v4, LM1/d;

    .line 57
    .line 58
    invoke-virtual {v4, v1}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-nez v4, :cond_0

    .line 63
    .line 64
    const-string v0, "Callback to `WebViewClient.onReceivedHttpAuthRequest` failed because native instance was not in the instance manager."

    .line 65
    .line 66
    const-string v1, ""

    .line 67
    .line 68
    const-string v2, "missing-instance-error"

    .line 69
    .line 70
    invoke-static {v2, v0, v1}, LB1/e;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    iget-object v4, v2, LM1/O;->b:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v4, LC1/f;

    .line 77
    .line 78
    invoke-virtual {v2}, LM1/O;->a()LC1/l;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    new-instance v8, LB1/s;

    .line 83
    .line 84
    const-string v9, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpAuthRequest"

    .line 85
    .line 86
    const/4 v10, 0x0

    .line 87
    invoke-direct {v8, v4, v9, v2, v10}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 88
    .line 89
    .line 90
    filled-new-array {v1, v5, v0, v6, v7}, [Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-static {v0}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    new-instance v1, LM1/N;

    .line 99
    .line 100
    const/4 v2, 0x5

    .line 101
    invoke-direct {v1, v3, v2}, LM1/N;-><init>(Ljava/lang/Object;I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v8, v0, v1}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

    .line 105
    .line 106
    .line 107
    :goto_0
    return-void

    .line 108
    :pswitch_0
    iget-object v0, p0, LM1/d0;->p:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v0, Ljava/lang/String;

    .line 111
    .line 112
    iget-object v1, p0, LM1/d0;->l:LM1/g0;

    .line 113
    .line 114
    iget-object v2, v1, LM1/g0;->a:LM1/n;

    .line 115
    .line 116
    new-instance v3, LM1/q;

    .line 117
    .line 118
    const/4 v4, 0x2

    .line 119
    invoke-direct {v3, v4}, LM1/q;-><init>(I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    const-string v4, "viewArg"

    .line 126
    .line 127
    iget-object v5, p0, LM1/d0;->m:Landroid/webkit/WebView;

    .line 128
    .line 129
    invoke-static {v5, v4}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    const-string v4, "realmArg"

    .line 133
    .line 134
    iget-object v6, p0, LM1/d0;->n:Ljava/lang/String;

    .line 135
    .line 136
    invoke-static {v6, v4}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    const-string v4, "argsArg"

    .line 140
    .line 141
    invoke-static {v0, v4}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    iget-object v2, v2, LM1/n;->a:LM1/O;

    .line 145
    .line 146
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    iget-object v4, v2, LM1/O;->c:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v4, LM1/d;

    .line 152
    .line 153
    invoke-virtual {v4, v1}, LM1/d;->d(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v4

    .line 157
    if-nez v4, :cond_1

    .line 158
    .line 159
    const-string v0, "Callback to `WebViewClient.onReceivedLoginRequest` failed because native instance was not in the instance manager."

    .line 160
    .line 161
    const-string v1, ""

    .line 162
    .line 163
    const-string v2, "missing-instance-error"

    .line 164
    .line 165
    invoke-static {v2, v0, v1}, LB1/e;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_1
    iget-object v4, v2, LM1/O;->b:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v4, LC1/f;

    .line 172
    .line 173
    invoke-virtual {v2}, LM1/O;->a()LC1/l;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    new-instance v7, LB1/s;

    .line 178
    .line 179
    const-string v8, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedLoginRequest"

    .line 180
    .line 181
    const/4 v9, 0x0

    .line 182
    invoke-direct {v7, v4, v8, v2, v9}, LB1/s;-><init>(LC1/f;Ljava/lang/String;Ljava/lang/Object;Lt1/a;)V

    .line 183
    .line 184
    .line 185
    iget-object v2, p0, LM1/d0;->o:Ljava/lang/String;

    .line 186
    .line 187
    filled-new-array {v1, v5, v6, v2, v0}, [Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-static {v0}, LP1/f;->d0([Ljava/lang/Object;)Ljava/util/List;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    new-instance v1, LD/c;

    .line 196
    .line 197
    const/16 v2, 0x1c

    .line 198
    .line 199
    invoke-direct {v1, v3, v2}, LD/c;-><init>(Ljava/lang/Object;I)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v7, v0, v1}, LB1/s;->x(Ljava/lang/Object;LC1/c;)V

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
        :pswitch_0
    .end packed-switch
.end method

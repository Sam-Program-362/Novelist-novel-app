.class public final synthetic LM1/X;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ1/l;


# instance fields
.field public final synthetic k:I

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, LM1/X;->k:I

    iput-object p1, p0, LM1/X;->l:Ljava/lang/Object;

    iput-object p2, p0, LM1/X;->m:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, LM1/X;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LM1/X;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/os/CancellationSignal;

    .line 9
    .line 10
    iget-object v1, p0, LM1/X;->m:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, LQ/b;

    .line 13
    .line 14
    iget-object v2, v1, LQ/b;->d:Landroid/content/Context;

    .line 15
    .line 16
    check-cast p1, Landroid/app/PendingIntent;

    .line 17
    .line 18
    const-string v3, "result"

    .line 19
    .line 20
    invoke-static {p1, v3}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sget-object v3, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:LM/h;

    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, LM/h;->a(Landroid/os/CancellationSignal;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    new-instance v3, Landroid/content/Intent;

    .line 36
    .line 37
    const-class v4, Landroidx/credentials/playservices/controllers/identityauth/HiddenActivity;

    .line 38
    .line 39
    invoke-direct {v3, v2, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 40
    .line 41
    .line 42
    iget-object v4, v1, LQ/b;->h:LO/c;

    .line 43
    .line 44
    const-string v5, "SIGN_IN_INTENT"

    .line 45
    .line 46
    invoke-static {v4, v3, v5}, LN/c;->a(Landroid/os/ResultReceiver;Landroid/content/Intent;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const-string v4, "EXTRA_FLOW_PENDING_INTENT"

    .line 50
    .line 51
    invoke-virtual {v3, v4, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 52
    .line 53
    .line 54
    :try_start_0
    invoke-virtual {v2, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :catch_0
    sget-object p1, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:LM/h;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-static {v0}, LM/h;->a(Landroid/os/CancellationSignal;)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eqz p1, :cond_1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    invoke-virtual {v1}, LQ/b;->e()Ljava/util/concurrent/Executor;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    new-instance v0, LM1/b;

    .line 75
    .line 76
    const/4 v2, 0x2

    .line 77
    invoke-direct {v0, v1, v2}, LM1/b;-><init>(Ljava/lang/Object;I)V

    .line 78
    .line 79
    .line 80
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 81
    .line 82
    .line 83
    :goto_0
    sget-object p1, LO1/g;->a:LO1/g;

    .line 84
    .line 85
    return-object p1

    .line 86
    :pswitch_0
    iget-object v0, p0, LM1/X;->l:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, Landroid/os/CancellationSignal;

    .line 89
    .line 90
    iget-object v1, p0, LM1/X;->m:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v1, LO/d;

    .line 93
    .line 94
    iget-object v2, v1, LO/d;->d:Landroid/content/Context;

    .line 95
    .line 96
    check-cast p1, LF0/h;

    .line 97
    .line 98
    sget-object v3, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:LM/h;

    .line 99
    .line 100
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-static {v0}, LM/h;->a(Landroid/os/CancellationSignal;)Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    if-eqz v3, :cond_2

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_2
    new-instance v3, Landroid/content/Intent;

    .line 111
    .line 112
    const-class v4, Landroidx/credentials/playservices/controllers/identityauth/HiddenActivity;

    .line 113
    .line 114
    invoke-direct {v3, v2, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 115
    .line 116
    .line 117
    iget-object v4, v1, LO/d;->h:LO/c;

    .line 118
    .line 119
    const-string v5, "BEGIN_SIGN_IN"

    .line 120
    .line 121
    invoke-static {v4, v3, v5}, LN/c;->a(Landroid/os/ResultReceiver;Landroid/content/Intent;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    const-string v4, "EXTRA_FLOW_PENDING_INTENT"

    .line 125
    .line 126
    iget-object p1, p1, LF0/h;->k:Landroid/app/PendingIntent;

    .line 127
    .line 128
    invoke-virtual {v3, v4, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 129
    .line 130
    .line 131
    :try_start_1
    invoke-virtual {v2, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :catch_1
    sget-object p1, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:LM/h;

    .line 136
    .line 137
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-static {v0}, LM/h;->a(Landroid/os/CancellationSignal;)Z

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    if-eqz p1, :cond_3

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_3
    invoke-virtual {v1}, LO/d;->d()Ljava/util/concurrent/Executor;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    new-instance v0, LM1/b;

    .line 152
    .line 153
    const/4 v2, 0x1

    .line 154
    invoke-direct {v0, v1, v2}, LM1/b;-><init>(Ljava/lang/Object;I)V

    .line 155
    .line 156
    .line 157
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 158
    .line 159
    .line 160
    :goto_1
    sget-object p1, LO1/g;->a:LO1/g;

    .line 161
    .line 162
    return-object p1

    .line 163
    :pswitch_1
    iget-object v0, p0, LM1/X;->l:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v0, Ljava/util/concurrent/Executor;

    .line 166
    .line 167
    iget-object v1, p0, LM1/X;->m:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v1, LH/d;

    .line 170
    .line 171
    check-cast p1, LI/f;

    .line 172
    .line 173
    const-string v2, "e"

    .line 174
    .line 175
    invoke-static {p1, v2}, La2/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    new-instance v2, LN/e;

    .line 179
    .line 180
    const/4 v3, 0x0

    .line 181
    invoke-direct {v2, v1, p1, v3}, LN/e;-><init>(LH/d;LI/f;I)V

    .line 182
    .line 183
    .line 184
    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 185
    .line 186
    .line 187
    sget-object p1, LO1/g;->a:LO1/g;

    .line 188
    .line 189
    return-object p1

    .line 190
    :pswitch_2
    iget-object v0, p0, LM1/X;->l:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v0, LM1/Z;

    .line 193
    .line 194
    iget-object v1, p0, LM1/X;->m:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v1, Landroid/webkit/JsPromptResult;

    .line 197
    .line 198
    check-cast p1, LM1/Q;

    .line 199
    .line 200
    iget-boolean v2, p1, LM1/Q;->d:Z

    .line 201
    .line 202
    if-eqz v2, :cond_4

    .line 203
    .line 204
    iget-object v0, v0, LM1/Z;->b:LM1/n;

    .line 205
    .line 206
    iget-object v0, v0, LM1/n;->a:LM1/O;

    .line 207
    .line 208
    iget-object p1, p1, LM1/Q;->c:Ljava/lang/Throwable;

    .line 209
    .line 210
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    invoke-static {p1}, LM1/O;->d(Ljava/lang/Throwable;)V

    .line 217
    .line 218
    .line 219
    goto :goto_2

    .line 220
    :cond_4
    iget-object p1, p1, LM1/Q;->b:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast p1, Ljava/lang/String;

    .line 223
    .line 224
    if-eqz p1, :cond_5

    .line 225
    .line 226
    invoke-virtual {v1, p1}, Landroid/webkit/JsPromptResult;->confirm(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    goto :goto_2

    .line 230
    :cond_5
    invoke-virtual {v1}, Landroid/webkit/JsResult;->cancel()V

    .line 231
    .line 232
    .line 233
    :goto_2
    const/4 p1, 0x0

    .line 234
    return-object p1

    .line 235
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

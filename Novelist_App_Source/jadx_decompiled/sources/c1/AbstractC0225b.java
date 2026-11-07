package c1;

import J0.c;

/* renamed from: c1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0225b {

    /* renamed from: a, reason: collision with root package name */
    public static final c f2659a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f2660b;

    /* renamed from: c, reason: collision with root package name */
    public static final c[] f2661c;

    static {
        c cVar = new c("GET_CREDENTIAL", 1L);
        f2659a = cVar;
        c cVar2 = new c("CREDENTIAL_REGISTRY", 1L);
        c cVar3 = new c("CLEAR_REGISTRY", 2L);
        c cVar4 = new c("CLEAR_CREATION_OPTIONS", 1L);
        c cVar5 = new c("CLEAR_CREDENTIAL_STATE", 1L);
        f2660b = cVar5;
        f2661c = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, new c("CREATE_CREDENTIAL", 3L), new c("REGISTER_CREATION_OPTIONS", 1L), new c("REGISTER_EXPORT", 1L), new c("IMPORT_CREDENTIALS", 1L), new c("SIGNAL_CREDENTIAL_STATE", 1L), new c("CLEAR_EXPORT", 1L), new c("IMPORT_CREDENTIALS_FOR_DEVICE_SETUP", 3L), new c("EXPORT_CREDENTIALS_TO_DEVICE_SETUP", 3L), new c("GET_CREDENTIAL_TRANSFER_CAPABILITIES", 3L)};
    }
}

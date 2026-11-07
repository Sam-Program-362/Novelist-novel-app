package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.apache.tika.fork.ContentHandlerProxy;
import org.apache.tika.pipes.PipesConfigBase;
import org.apache.tika.pipes.PipesServer;
import org.apache.tika.utils.StringUtils;
import org.apache.tika.utils.XMLReaderUtils;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class M implements V {
    public static final int[] n = new int[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Unsafe f1984o = i0.i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f1985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f1986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC0102a f1989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1990f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f1991g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f1992h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f1993i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final O f1994j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final B f1995k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d0 f1996l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final I f1997m;

    public M(int[] iArr, Object[] objArr, int i3, int i4, AbstractC0102a abstractC0102a, int[] iArr2, int i5, int i6, O o2, B b3, d0 d0Var, C0116o c0116o, I i7) {
        this.f1985a = iArr;
        this.f1986b = objArr;
        this.f1987c = i3;
        this.f1988d = i4;
        this.f1990f = abstractC0102a instanceof AbstractC0122v;
        this.f1991g = iArr2;
        this.f1992h = i5;
        this.f1993i = i6;
        this.f1994j = o2;
        this.f1995k = b3;
        this.f1996l = d0Var;
        this.f1989e = abstractC0102a;
        this.f1997m = i7;
    }

    public static Field E(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static int J(int i3) {
        return (i3 & 267386880) >>> 20;
    }

    public static boolean o(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0122v) {
            return ((AbstractC0122v) obj).g();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0263  */
    /* JADX WARN: Code duplicated, block: B:128:0x0266  */
    /* JADX WARN: Code duplicated, block: B:131:0x027d  */
    /* JADX WARN: Code duplicated, block: B:132:0x0280  */
    /* JADX WARN: Code duplicated, block: B:169:0x033c  */
    /* JADX WARN: Code duplicated, block: B:184:0x0386  */
    /* JADX WARN: Code duplicated, block: B:187:0x0390  */
    /* JADX WARN: Code duplicated, block: B:190:0x03a0  */
    public static M v(U u, O o2, B b3, d0 d0Var, C0116o c0116o, I i3) {
        int i4;
        int iCharAt;
        int i5;
        int i6;
        int i7;
        int[] iArr;
        int i8;
        int i9;
        int i10;
        int i11;
        char cCharAt;
        int i12;
        char cCharAt2;
        int i13;
        char cCharAt3;
        int i14;
        char cCharAt4;
        int i15;
        char cCharAt5;
        int i16;
        char cCharAt6;
        int i17;
        char cCharAt7;
        int i18;
        char cCharAt8;
        int i19;
        int i20;
        int i21;
        int i22;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i23;
        int i24;
        int i25;
        int i26;
        Field fieldE;
        char cCharAt9;
        int i27;
        int i28;
        int i29;
        Object obj;
        Field fieldE2;
        int i30;
        Object obj2;
        Field fieldE3;
        int i31;
        char cCharAt10;
        int i32;
        char cCharAt11;
        int i33;
        char cCharAt12;
        int i34;
        char cCharAt13;
        String str = u.f2009b;
        int length = str.length();
        int i35 = 55296;
        if (str.charAt(0) >= 55296) {
            int i36 = 1;
            while (true) {
                i4 = i36 + 1;
                if (str.charAt(i36) < 55296) {
                    break;
                }
                i36 = i4;
            }
        } else {
            i4 = 1;
        }
        int i37 = i4 + 1;
        int iCharAt2 = str.charAt(i4);
        if (iCharAt2 >= 55296) {
            int i38 = iCharAt2 & 8191;
            int i39 = 13;
            while (true) {
                i34 = i37 + 1;
                cCharAt13 = str.charAt(i37);
                if (cCharAt13 < 55296) {
                    break;
                }
                i38 |= (cCharAt13 & 8191) << i39;
                i39 += 13;
                i37 = i34;
            }
            iCharAt2 = i38 | (cCharAt13 << i39);
            i37 = i34;
        }
        if (iCharAt2 == 0) {
            i6 = 0;
            i9 = 0;
            iCharAt = 0;
            i5 = 0;
            i8 = 0;
            i10 = 0;
            iArr = n;
            i7 = 0;
        } else {
            int i40 = i37 + 1;
            int iCharAt3 = str.charAt(i37);
            if (iCharAt3 >= 55296) {
                int i41 = iCharAt3 & 8191;
                int i42 = 13;
                while (true) {
                    i18 = i40 + 1;
                    cCharAt8 = str.charAt(i40);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i41 |= (cCharAt8 & 8191) << i42;
                    i42 += 13;
                    i40 = i18;
                }
                iCharAt3 = i41 | (cCharAt8 << i42);
                i40 = i18;
            }
            int i43 = i40 + 1;
            int iCharAt4 = str.charAt(i40);
            if (iCharAt4 >= 55296) {
                int i44 = iCharAt4 & 8191;
                int i45 = 13;
                while (true) {
                    i17 = i43 + 1;
                    cCharAt7 = str.charAt(i43);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt7 & 8191) << i45;
                    i45 += 13;
                    i43 = i17;
                }
                iCharAt4 = i44 | (cCharAt7 << i45);
                i43 = i17;
            }
            int i46 = i43 + 1;
            int iCharAt5 = str.charAt(i43);
            if (iCharAt5 >= 55296) {
                int i47 = iCharAt5 & 8191;
                int i48 = 13;
                while (true) {
                    i16 = i46 + 1;
                    cCharAt6 = str.charAt(i46);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt6 & 8191) << i48;
                    i48 += 13;
                    i46 = i16;
                }
                iCharAt5 = i47 | (cCharAt6 << i48);
                i46 = i16;
            }
            int i49 = i46 + 1;
            int iCharAt6 = str.charAt(i46);
            if (iCharAt6 >= 55296) {
                int i50 = iCharAt6 & 8191;
                int i51 = 13;
                while (true) {
                    i15 = i49 + 1;
                    cCharAt5 = str.charAt(i49);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt5 & 8191) << i51;
                    i51 += 13;
                    i49 = i15;
                }
                iCharAt6 = i50 | (cCharAt5 << i51);
                i49 = i15;
            }
            int i52 = i49 + 1;
            iCharAt = str.charAt(i49);
            if (iCharAt >= 55296) {
                int i53 = iCharAt & 8191;
                int i54 = 13;
                while (true) {
                    i14 = i52 + 1;
                    cCharAt4 = str.charAt(i52);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt4 & 8191) << i54;
                    i54 += 13;
                    i52 = i14;
                }
                iCharAt = i53 | (cCharAt4 << i54);
                i52 = i14;
            }
            int i55 = i52 + 1;
            int iCharAt7 = str.charAt(i52);
            if (iCharAt7 >= 55296) {
                int i56 = iCharAt7 & 8191;
                int i57 = 13;
                while (true) {
                    i13 = i55 + 1;
                    cCharAt3 = str.charAt(i55);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt3 & 8191) << i57;
                    i57 += 13;
                    i55 = i13;
                }
                iCharAt7 = i56 | (cCharAt3 << i57);
                i55 = i13;
            }
            int i58 = i55 + 1;
            int iCharAt8 = str.charAt(i55);
            if (iCharAt8 >= 55296) {
                int i59 = iCharAt8 & 8191;
                int i60 = 13;
                while (true) {
                    i12 = i58 + 1;
                    cCharAt2 = str.charAt(i58);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i59 |= (cCharAt2 & 8191) << i60;
                    i60 += 13;
                    i58 = i12;
                }
                iCharAt8 = i59 | (cCharAt2 << i60);
                i58 = i12;
            }
            int i61 = i58 + 1;
            int iCharAt9 = str.charAt(i58);
            if (iCharAt9 >= 55296) {
                int i62 = iCharAt9 & 8191;
                int i63 = 13;
                while (true) {
                    i11 = i61 + 1;
                    cCharAt = str.charAt(i61);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i62 |= (cCharAt & 8191) << i63;
                    i63 += 13;
                    i61 = i11;
                }
                iCharAt9 = i62 | (cCharAt << i63);
                i61 = i11;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i64 = (iCharAt3 * 2) + iCharAt4;
            int i65 = iCharAt7;
            i5 = iCharAt5;
            i6 = i65;
            i7 = iCharAt3;
            i37 = i61;
            iArr = iArr2;
            i8 = iCharAt6;
            i9 = i64;
            i10 = iCharAt9;
        }
        Unsafe unsafe = f1984o;
        Object[] objArr = u.f2010c;
        Class<?> cls = u.f2008a.getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr2 = new Object[iCharAt * 2];
        int i66 = i10 + i6;
        int i67 = i66;
        int i68 = i10;
        int i69 = 0;
        int i70 = 0;
        while (i37 < length) {
            int i71 = i37 + 1;
            int iCharAt10 = str.charAt(i37);
            if (iCharAt10 >= i35) {
                int i72 = iCharAt10 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i33 = i73 + 1;
                    cCharAt12 = str.charAt(i73);
                    i19 = length;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i72 |= (cCharAt12 & 8191) << i74;
                    i74 += 13;
                    i73 = i33;
                    length = i19;
                }
                iCharAt10 = i72 | (cCharAt12 << i74);
                i20 = i33;
            } else {
                i19 = length;
                i20 = i71;
            }
            int i75 = i20 + 1;
            int iCharAt11 = str.charAt(i20);
            Object[] objArr3 = objArr;
            char c3 = 55296;
            if (iCharAt11 >= 55296) {
                int i76 = iCharAt11 & 8191;
                int i77 = 13;
                while (true) {
                    i32 = i75 + 1;
                    cCharAt11 = str.charAt(i75);
                    if (cCharAt11 < c3) {
                        break;
                    }
                    i76 |= (cCharAt11 & 8191) << i77;
                    i77 += 13;
                    i75 = i32;
                    c3 = 55296;
                }
                iCharAt11 = i76 | (cCharAt11 << i77);
                i75 = i32;
            }
            int i78 = iCharAt11 & 255;
            int i79 = iCharAt10;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i69] = i70;
                i69++;
            }
            int[] iArr4 = iArr3;
            if (i78 >= 51) {
                int i80 = i75 + 1;
                int iCharAt12 = str.charAt(i75);
                char c4 = 55296;
                if (iCharAt12 >= 55296) {
                    int i81 = iCharAt12 & 8191;
                    int i82 = 13;
                    while (true) {
                        i31 = i80 + 1;
                        cCharAt10 = str.charAt(i80);
                        if (cCharAt10 < c4) {
                            break;
                        }
                        i81 |= (cCharAt10 & 8191) << i82;
                        i82 += 13;
                        i80 = i31;
                        c4 = 55296;
                    }
                    iCharAt12 = i81 | (cCharAt10 << i82);
                    i80 = i31;
                }
                int i83 = i78 - 51;
                int i84 = i80;
                if (i83 == 9 || i83 == 17) {
                    i28 = i9 + 1;
                    objArr2[((i70 / 3) * 2) + 1] = objArr3[i9];
                } else {
                    if (i83 == 12) {
                        int iA = u.a();
                        if (iA == 0) {
                            throw null;
                        }
                        if ((iA == 1) || (iCharAt11 & 2048) != 0) {
                            i28 = i9 + 1;
                            objArr2[((i70 / 3) * 2) + 1] = objArr3[i9];
                        }
                    }
                    i29 = iCharAt12 * 2;
                    obj = objArr3[i29];
                    if (obj instanceof Field) {
                        fieldE2 = (Field) obj;
                    } else {
                        fieldE2 = E(cls, (String) obj);
                        objArr3[i29] = fieldE2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldE2);
                    i30 = i29 + 1;
                    obj2 = objArr3[i30];
                    if (obj2 instanceof Field) {
                        fieldE3 = (Field) obj2;
                    } else {
                        fieldE3 = E(cls, (String) obj2);
                        objArr3[i30] = fieldE3;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldE3);
                    int i85 = i7;
                    iObjectFieldOffset2 = iObjectFieldOffset4;
                    i26 = iObjectFieldOffset3;
                    i21 = i85;
                    i25 = i9;
                    i23 = i84;
                    i24 = 0;
                    cls = cls;
                }
                i9 = i28;
                i29 = iCharAt12 * 2;
                obj = objArr3[i29];
                if (obj instanceof Field) {
                    fieldE2 = (Field) obj;
                } else {
                    fieldE2 = E(cls, (String) obj);
                    objArr3[i29] = fieldE2;
                }
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldE2);
                i30 = i29 + 1;
                obj2 = objArr3[i30];
                if (obj2 instanceof Field) {
                    fieldE3 = (Field) obj2;
                } else {
                    fieldE3 = E(cls, (String) obj2);
                    objArr3[i30] = fieldE3;
                }
                int iObjectFieldOffset6 = (int) unsafe.objectFieldOffset(fieldE3);
                int i86 = i7;
                iObjectFieldOffset2 = iObjectFieldOffset6;
                i26 = iObjectFieldOffset5;
                i21 = i86;
                i25 = i9;
                i23 = i84;
                i24 = 0;
                cls = cls;
            } else {
                int i87 = i9 + 1;
                Field fieldE4 = E(cls, (String) objArr3[i9]);
                if (i78 == 9 || i78 == 17) {
                    i21 = i7;
                    objArr2[((i70 / 3) * 2) + 1] = fieldE4.getType();
                } else {
                    if (i78 == 27 || i78 == 49) {
                        i21 = i7;
                        i27 = i9 + 2;
                        objArr2[((i70 / 3) * 2) + 1] = objArr3[i87];
                    } else if (i78 == 12 || i78 == 30 || i78 == 44) {
                        i21 = i7;
                        if (u.a() == 1 || (iCharAt11 & 2048) != 0) {
                            i27 = i9 + 2;
                            objArr2[((i70 / 3) * 2) + 1] = objArr3[i87];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldE4);
                        if ((iCharAt11 & 4096) != 0 || i78 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i23 = i75;
                            i24 = 0;
                        } else {
                            int i88 = i75 + 1;
                            int iCharAt13 = str.charAt(i75);
                            if (iCharAt13 >= 55296) {
                                int i89 = iCharAt13 & 8191;
                                int i90 = 13;
                                while (true) {
                                    i23 = i88 + 1;
                                    cCharAt9 = str.charAt(i88);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i89 |= (cCharAt9 & 8191) << i90;
                                    i90 += 13;
                                    i88 = i23;
                                }
                                iCharAt13 = i89 | (cCharAt9 << i90);
                            } else {
                                i23 = i88;
                            }
                            int i91 = (iCharAt13 / 32) + (i21 * 2);
                            Object obj3 = objArr3[i91];
                            if (obj3 instanceof Field) {
                                fieldE = (Field) obj3;
                            } else {
                                fieldE = E(cls, (String) obj3);
                                objArr3[i91] = fieldE;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldE);
                            i24 = iCharAt13 % 32;
                        }
                        if (i78 >= 18 || i78 > 49) {
                            i25 = i22;
                            i26 = iObjectFieldOffset;
                        } else {
                            iArr[i67] = iObjectFieldOffset;
                            i25 = i22;
                            i26 = iObjectFieldOffset;
                            i67++;
                        }
                    } else {
                        if (i78 == 50) {
                            int i92 = i68 + 1;
                            iArr[i68] = i70;
                            int i93 = (i70 / 3) * 2;
                            int i94 = i9 + 2;
                            objArr2[i93] = objArr3[i87];
                            if ((iCharAt11 & 2048) != 0) {
                                i22 = i9 + 3;
                                objArr2[i93 + 1] = objArr3[i94];
                                i21 = i7;
                                i68 = i92;
                            } else {
                                i22 = i94;
                                i68 = i92;
                                i21 = i7;
                            }
                        } else {
                            i21 = i7;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldE4);
                        if ((iCharAt11 & 4096) != 0) {
                            iObjectFieldOffset2 = 1048575;
                            i23 = i75;
                            i24 = 0;
                        } else {
                            iObjectFieldOffset2 = 1048575;
                            i23 = i75;
                            i24 = 0;
                        }
                        if (i78 >= 18) {
                            i25 = i22;
                            i26 = iObjectFieldOffset;
                        } else {
                            i25 = i22;
                            i26 = iObjectFieldOffset;
                        }
                    }
                    i22 = i27;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldE4);
                    if ((iCharAt11 & 4096) != 0) {
                        iObjectFieldOffset2 = 1048575;
                        i23 = i75;
                        i24 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i23 = i75;
                        i24 = 0;
                    }
                    if (i78 >= 18) {
                        i25 = i22;
                        i26 = iObjectFieldOffset;
                    } else {
                        i25 = i22;
                        i26 = iObjectFieldOffset;
                    }
                }
                i22 = i87;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldE4);
                if ((iCharAt11 & 4096) != 0) {
                    iObjectFieldOffset2 = 1048575;
                    i23 = i75;
                    i24 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i23 = i75;
                    i24 = 0;
                }
                if (i78 >= 18) {
                    i25 = i22;
                    i26 = iObjectFieldOffset;
                } else {
                    i25 = i22;
                    i26 = iObjectFieldOffset;
                }
            }
            int i95 = i70 + 1;
            iArr4[i70] = i79;
            int i96 = i70 + 2;
            String str2 = str;
            iArr4[i95] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i78 << 20) | i26;
            i70 += 3;
            iArr4[i96] = (i24 << 20) | iObjectFieldOffset2;
            cls = cls;
            objArr = objArr3;
            str = str2;
            length = i19;
            i7 = i21;
            i37 = i23;
            i35 = 55296;
            i9 = i25;
            iArr3 = iArr4;
        }
        return new M(iArr3, objArr2, i5, i8, u.f2008a, iArr, i10, i66, o2, b3, d0Var, c0116o, i3);
    }

    public static long w(int i3) {
        return i3 & 1048575;
    }

    public static int x(long j3, Object obj) {
        return ((Integer) i0.f2065c.h(j3, obj)).intValue();
    }

    public static long y(long j3, Object obj) {
        return ((Long) i0.f2065c.h(j3, obj)).longValue();
    }

    public final void A(Object obj, long j3, C0112k c0112k, V v3, C0115n c0115n) throws C0125y {
        int iU;
        this.f1995k.getClass();
        InterfaceC0123w interfaceC0123wA = B.a(j3, obj);
        AbstractC0111j abstractC0111j = c0112k.f2073a;
        int i3 = c0112k.f2074b;
        if ((i3 & 7) != 3) {
            throw C0126z.b();
        }
        do {
            AbstractC0122v abstractC0122vNewInstance = v3.newInstance();
            c0112k.b(abstractC0122vNewInstance, v3, c0115n);
            v3.d(abstractC0122vNewInstance);
            ((T) interfaceC0123wA).add(abstractC0122vNewInstance);
            if (abstractC0111j.c() || c0112k.f2076d != 0) {
                return;
            } else {
                iU = abstractC0111j.u();
            }
        } while (iU == i3);
        c0112k.f2076d = iU;
    }

    public final void B(Object obj, int i3, C0112k c0112k, V v3, C0115n c0115n) throws C0126z {
        int iU;
        this.f1995k.getClass();
        InterfaceC0123w interfaceC0123wA = B.a(i3 & 1048575, obj);
        AbstractC0111j abstractC0111j = c0112k.f2073a;
        int i4 = c0112k.f2074b;
        if ((i4 & 7) != 2) {
            throw C0126z.b();
        }
        do {
            AbstractC0122v abstractC0122vNewInstance = v3.newInstance();
            c0112k.c(abstractC0122vNewInstance, v3, c0115n);
            v3.d(abstractC0122vNewInstance);
            ((T) interfaceC0123wA).add(abstractC0122vNewInstance);
            if (abstractC0111j.c() || c0112k.f2076d != 0) {
                return;
            } else {
                iU = abstractC0111j.u();
            }
        } while (iU == i4);
        c0112k.f2076d = iU;
    }

    public final void C(int i3, C0112k c0112k, Object obj) throws C0125y {
        AbstractC0111j abstractC0111j = c0112k.f2073a;
        if ((536870912 & i3) != 0) {
            c0112k.w(2);
            i0.o(obj, i3 & 1048575, abstractC0111j.t());
        } else if (!this.f1990f) {
            i0.o(obj, i3 & 1048575, c0112k.e());
        } else {
            c0112k.w(2);
            i0.o(obj, i3 & 1048575, abstractC0111j.s());
        }
    }

    public final void D(int i3, C0112k c0112k, Object obj) throws C0125y {
        int i4 = 536870912 & i3;
        B b3 = this.f1995k;
        if (i4 != 0) {
            b3.getClass();
            c0112k.s(B.a(i3 & 1048575, obj), true);
        } else {
            b3.getClass();
            c0112k.s(B.a(i3 & 1048575, obj), false);
        }
    }

    public final void F(int i3, Object obj) {
        int i4 = this.f1985a[i3 + 2];
        long j3 = 1048575 & i4;
        if (j3 == 1048575) {
            return;
        }
        i0.m(obj, j3, (1 << (i4 >>> 20)) | i0.f2065c.f(j3, obj));
    }

    public final void G(Object obj, int i3, int i4) {
        i0.m(obj, this.f1985a[i4 + 2] & 1048575, i3);
    }

    public final void H(Object obj, int i3, AbstractC0102a abstractC0102a) {
        f1984o.putObject(obj, K(i3) & 1048575, abstractC0102a);
        F(i3, obj);
    }

    public final void I(Object obj, int i3, int i4, AbstractC0102a abstractC0102a) {
        f1984o.putObject(obj, K(i4) & 1048575, abstractC0102a);
        G(obj, i3, i4);
    }

    public final int K(int i3) {
        return this.f1985a[i3 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void L(Object obj, E e3) throws IOException {
        int i3;
        int i4;
        boolean z3;
        M m3 = this;
        int[] iArr = m3.f1985a;
        int length = iArr.length;
        Unsafe unsafe = f1984o;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            int iK = m3.K(i7);
            int i9 = iArr[i7];
            int iJ = J(iK);
            if (iJ <= 17) {
                int i10 = iArr[i7 + 2];
                int i11 = i10 & i5;
                if (i11 != i6) {
                    i8 = i11 == i5 ? 0 : unsafe.getInt(obj, i11);
                    i6 = i11;
                }
                i3 = 1 << (i10 >>> 20);
            } else {
                i3 = 0;
            }
            long j3 = iK & i5;
            switch (iJ) {
                case 0:
                    if (m3.n(obj, i7, i6, i8, i3)) {
                        double d3 = i0.f2065c.d(j3, obj);
                        C0113l c0113l = (C0113l) e3.f1973a;
                        c0113l.getClass();
                        c0113l.l0(Double.doubleToRawLongBits(d3), i9);
                    }
                    break;
                case 1:
                    if (m3.n(obj, i7, i6, i8, i3)) {
                        float fE = i0.f2065c.e(j3, obj);
                        C0113l c0113l2 = (C0113l) e3.f1973a;
                        c0113l2.getClass();
                        c0113l2.j0(i9, Float.floatToRawIntBits(fE));
                    }
                    m3 = this;
                    break;
                case 2:
                    if (m3.n(obj, i7, i6, i8, i3)) {
                        ((C0113l) e3.f1973a).v0(unsafe.getLong(obj, j3), i9);
                    }
                    m3 = this;
                    break;
                case 3:
                    if (m3.n(obj, i7, i6, i8, i3)) {
                        ((C0113l) e3.f1973a).v0(unsafe.getLong(obj, j3), i9);
                    }
                    m3 = this;
                    break;
                case 4:
                    if (m3.n(obj, i7, i6, i8, i3)) {
                        ((C0113l) e3.f1973a).n0(i9, unsafe.getInt(obj, j3));
                    }
                    m3 = this;
                    break;
                case 5:
                    if (m3.n(obj, i7, i6, i8, i3)) {
                        ((C0113l) e3.f1973a).l0(unsafe.getLong(obj, j3), i9);
                    }
                    m3 = this;
                    break;
                case 6:
                    if (m3.n(obj, i7, i6, i8, i3)) {
                        ((C0113l) e3.f1973a).j0(i9, unsafe.getInt(obj, j3));
                    }
                    m3 = this;
                    break;
                case 7:
                    if (m3.n(obj, i7, i6, i8, i3)) {
                        ((C0113l) e3.f1973a).g0(i9, i0.f2065c.c(j3, obj));
                    }
                    m3 = this;
                    break;
                case 8:
                    if (m3.n(obj, i7, i6, i8, i3)) {
                        Object object = unsafe.getObject(obj, j3);
                        if (object instanceof String) {
                            ((C0113l) e3.f1973a).q0((String) object, i9);
                        } else {
                            ((C0113l) e3.f1973a).h0(i9, (C0108g) object);
                        }
                    }
                    m3 = this;
                    break;
                case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                    if (m3.n(obj, i7, i6, i8, i3)) {
                        ((C0113l) e3.f1973a).p0(i9, (AbstractC0102a) unsafe.getObject(obj, j3), m3.l(i7));
                    }
                    break;
                case 10:
                    if (m3.n(obj, i7, i6, i8, i3)) {
                        ((C0113l) e3.f1973a).h0(i9, (C0108g) unsafe.getObject(obj, j3));
                    }
                    m3 = this;
                    break;
                case 11:
                    if (m3.n(obj, i7, i6, i8, i3)) {
                        ((C0113l) e3.f1973a).t0(i9, unsafe.getInt(obj, j3));
                    }
                    m3 = this;
                    break;
                case 12:
                    if (m3.n(obj, i7, i6, i8, i3)) {
                        ((C0113l) e3.f1973a).n0(i9, unsafe.getInt(obj, j3));
                    }
                    m3 = this;
                    break;
                case 13:
                    if (m3.n(obj, i7, i6, i8, i3)) {
                        ((C0113l) e3.f1973a).j0(i9, unsafe.getInt(obj, j3));
                    }
                    m3 = this;
                    break;
                case 14:
                    if (m3.n(obj, i7, i6, i8, i3)) {
                        ((C0113l) e3.f1973a).l0(unsafe.getLong(obj, j3), i9);
                    }
                    m3 = this;
                    break;
                case 15:
                    if (m3.n(obj, i7, i6, i8, i3)) {
                        int i12 = unsafe.getInt(obj, j3);
                        ((C0113l) e3.f1973a).t0(i9, (i12 >> 31) ^ (i12 << 1));
                    }
                    m3 = this;
                    break;
                case 16:
                    if (m3.n(obj, i7, i6, i8, i3)) {
                        long j4 = unsafe.getLong(obj, j3);
                        ((C0113l) e3.f1973a).v0((j4 >> 63) ^ (j4 << 1), i9);
                    }
                    m3 = this;
                    break;
                case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                    if (m3.n(obj, i7, i6, i8, i3)) {
                        e3.a(i9, unsafe.getObject(obj, j3), m3.l(i7));
                    }
                    break;
                case 18:
                    i6 = i6;
                    W.n(iArr[i7], (List) unsafe.getObject(obj, j3), e3, false);
                    i6 = i6;
                    break;
                case 19:
                    i6 = i6;
                    W.r(iArr[i7], (List) unsafe.getObject(obj, j3), e3, false);
                    i6 = i6;
                    break;
                case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                    i6 = i6;
                    W.t(iArr[i7], (List) unsafe.getObject(obj, j3), e3, false);
                    i6 = i6;
                    break;
                case 21:
                    i6 = i6;
                    W.z(iArr[i7], (List) unsafe.getObject(obj, j3), e3, false);
                    i6 = i6;
                    break;
                case 22:
                    i6 = i6;
                    W.s(iArr[i7], (List) unsafe.getObject(obj, j3), e3, false);
                    i6 = i6;
                    break;
                case 23:
                    i6 = i6;
                    W.q(iArr[i7], (List) unsafe.getObject(obj, j3), e3, false);
                    i6 = i6;
                    break;
                case 24:
                    i6 = i6;
                    W.p(iArr[i7], (List) unsafe.getObject(obj, j3), e3, false);
                    i6 = i6;
                    break;
                case 25:
                    i6 = i6;
                    W.m(iArr[i7], (List) unsafe.getObject(obj, j3), e3, false);
                    i6 = i6;
                    break;
                case 26:
                    i4 = i6;
                    int i13 = iArr[i7];
                    List list = (List) unsafe.getObject(obj, j3);
                    Class cls = W.f2012a;
                    if (list != null && !list.isEmpty()) {
                        e3.getClass();
                        for (int i14 = 0; i14 < list.size(); i14++) {
                            ((C0113l) e3.f1973a).q0((String) list.get(i14), i13);
                        }
                    }
                    i6 = i4;
                    break;
                case 27:
                    i4 = i6;
                    int i15 = iArr[i7];
                    List list2 = (List) unsafe.getObject(obj, j3);
                    V vL = m3.l(i7);
                    Class cls2 = W.f2012a;
                    if (list2 != null && !list2.isEmpty()) {
                        e3.getClass();
                        for (int i16 = 0; i16 < list2.size(); i16++) {
                            ((C0113l) e3.f1973a).p0(i15, (AbstractC0102a) list2.get(i16), vL);
                        }
                    }
                    i6 = i4;
                    break;
                case 28:
                    i4 = i6;
                    int i17 = iArr[i7];
                    List list3 = (List) unsafe.getObject(obj, j3);
                    Class cls3 = W.f2012a;
                    if (list3 != null && !list3.isEmpty()) {
                        e3.getClass();
                        for (int i18 = 0; i18 < list3.size(); i18++) {
                            ((C0113l) e3.f1973a).h0(i17, (C0108g) list3.get(i18));
                        }
                    }
                    i6 = i4;
                    break;
                case 29:
                    z3 = false;
                    W.y(iArr[i7], (List) unsafe.getObject(obj, j3), e3, false);
                    i6 = i6;
                    break;
                case 30:
                    z3 = false;
                    W.o(iArr[i7], (List) unsafe.getObject(obj, j3), e3, false);
                    i6 = i6;
                    break;
                case 31:
                    z3 = false;
                    W.u(iArr[i7], (List) unsafe.getObject(obj, j3), e3, false);
                    i6 = i6;
                    break;
                case 32:
                    z3 = false;
                    W.v(iArr[i7], (List) unsafe.getObject(obj, j3), e3, false);
                    i6 = i6;
                    break;
                case 33:
                    z3 = false;
                    W.w(iArr[i7], (List) unsafe.getObject(obj, j3), e3, false);
                    i6 = i6;
                    break;
                case 34:
                    z3 = false;
                    W.x(iArr[i7], (List) unsafe.getObject(obj, j3), e3, false);
                    i6 = i6;
                    break;
                case 35:
                    i4 = i6;
                    W.n(iArr[i7], (List) unsafe.getObject(obj, j3), e3, true);
                    i6 = i4;
                    break;
                case 36:
                    i4 = i6;
                    W.r(iArr[i7], (List) unsafe.getObject(obj, j3), e3, true);
                    i6 = i4;
                    break;
                case 37:
                    i4 = i6;
                    W.t(iArr[i7], (List) unsafe.getObject(obj, j3), e3, true);
                    i6 = i4;
                    break;
                case 38:
                    i4 = i6;
                    W.z(iArr[i7], (List) unsafe.getObject(obj, j3), e3, true);
                    i6 = i4;
                    break;
                case 39:
                    i4 = i6;
                    W.s(iArr[i7], (List) unsafe.getObject(obj, j3), e3, true);
                    i6 = i4;
                    break;
                case 40:
                    i4 = i6;
                    W.q(iArr[i7], (List) unsafe.getObject(obj, j3), e3, true);
                    i6 = i4;
                    break;
                case 41:
                    i4 = i6;
                    W.p(iArr[i7], (List) unsafe.getObject(obj, j3), e3, true);
                    i6 = i4;
                    break;
                case 42:
                    i4 = i6;
                    W.m(iArr[i7], (List) unsafe.getObject(obj, j3), e3, true);
                    i6 = i4;
                    break;
                case 43:
                    i4 = i6;
                    W.y(iArr[i7], (List) unsafe.getObject(obj, j3), e3, true);
                    i6 = i4;
                    break;
                case 44:
                    i4 = i6;
                    W.o(iArr[i7], (List) unsafe.getObject(obj, j3), e3, true);
                    i6 = i4;
                    break;
                case 45:
                    i4 = i6;
                    W.u(iArr[i7], (List) unsafe.getObject(obj, j3), e3, true);
                    i6 = i4;
                    break;
                case 46:
                    i4 = i6;
                    W.v(iArr[i7], (List) unsafe.getObject(obj, j3), e3, true);
                    i6 = i4;
                    break;
                case 47:
                    i4 = i6;
                    W.w(iArr[i7], (List) unsafe.getObject(obj, j3), e3, true);
                    i6 = i4;
                    break;
                case 48:
                    i4 = i6;
                    W.x(iArr[i7], (List) unsafe.getObject(obj, j3), e3, true);
                    i6 = i4;
                    break;
                case 49:
                    i4 = i6;
                    int i19 = iArr[i7];
                    List list4 = (List) unsafe.getObject(obj, j3);
                    V vL2 = m3.l(i7);
                    Class cls4 = W.f2012a;
                    if (list4 != null && !list4.isEmpty()) {
                        e3.getClass();
                        for (int i20 = 0; i20 < list4.size(); i20++) {
                            e3.a(i19, list4.get(i20), vL2);
                        }
                    }
                    i6 = i4;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j3);
                    if (object2 != null) {
                        int i21 = 2;
                        Object obj2 = m3.f1986b[(i7 / 3) * 2];
                        m3.f1997m.getClass();
                        F f3 = ((G) obj2).f1977a;
                        C0113l c0113l3 = (C0113l) e3.f1973a;
                        c0113l3.getClass();
                        for (Map.Entry entry : ((H) object2).entrySet()) {
                            c0113l3.s0(i9, i21);
                            c0113l3.u0(G.a(f3, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            C0118q.b(c0113l3, f3.f1974a, 1, key);
                            i21 = 2;
                            C0118q.b(c0113l3, f3.f1975b, 2, value);
                            i6 = i6;
                        }
                    }
                    i4 = i6;
                    i6 = i4;
                    break;
                case 51:
                    if (m3.p(obj, i9, i7)) {
                        double dDoubleValue = ((Double) i0.f2065c.h(j3, obj)).doubleValue();
                        C0113l c0113l4 = (C0113l) e3.f1973a;
                        c0113l4.getClass();
                        c0113l4.l0(Double.doubleToRawLongBits(dDoubleValue), i9);
                    }
                    break;
                case 52:
                    if (m3.p(obj, i9, i7)) {
                        float fFloatValue = ((Float) i0.f2065c.h(j3, obj)).floatValue();
                        C0113l c0113l5 = (C0113l) e3.f1973a;
                        c0113l5.getClass();
                        c0113l5.j0(i9, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case 53:
                    if (m3.p(obj, i9, i7)) {
                        ((C0113l) e3.f1973a).v0(y(j3, obj), i9);
                    }
                    break;
                case 54:
                    if (m3.p(obj, i9, i7)) {
                        ((C0113l) e3.f1973a).v0(y(j3, obj), i9);
                    }
                    break;
                case 55:
                    if (m3.p(obj, i9, i7)) {
                        ((C0113l) e3.f1973a).n0(i9, x(j3, obj));
                    }
                    break;
                case 56:
                    if (m3.p(obj, i9, i7)) {
                        ((C0113l) e3.f1973a).l0(y(j3, obj), i9);
                    }
                    break;
                case 57:
                    if (m3.p(obj, i9, i7)) {
                        ((C0113l) e3.f1973a).j0(i9, x(j3, obj));
                    }
                    break;
                case 58:
                    if (m3.p(obj, i9, i7)) {
                        ((C0113l) e3.f1973a).g0(i9, ((Boolean) i0.f2065c.h(j3, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (m3.p(obj, i9, i7)) {
                        Object object3 = unsafe.getObject(obj, j3);
                        if (object3 instanceof String) {
                            ((C0113l) e3.f1973a).q0((String) object3, i9);
                        } else {
                            ((C0113l) e3.f1973a).h0(i9, (C0108g) object3);
                        }
                    }
                    break;
                case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                    if (m3.p(obj, i9, i7)) {
                        ((C0113l) e3.f1973a).p0(i9, (AbstractC0102a) unsafe.getObject(obj, j3), m3.l(i7));
                    }
                    break;
                case 61:
                    if (m3.p(obj, i9, i7)) {
                        ((C0113l) e3.f1973a).h0(i9, (C0108g) unsafe.getObject(obj, j3));
                    }
                    break;
                case 62:
                    if (m3.p(obj, i9, i7)) {
                        ((C0113l) e3.f1973a).t0(i9, x(j3, obj));
                    }
                    break;
                case 63:
                    if (m3.p(obj, i9, i7)) {
                        ((C0113l) e3.f1973a).n0(i9, x(j3, obj));
                    }
                    break;
                case 64:
                    if (m3.p(obj, i9, i7)) {
                        ((C0113l) e3.f1973a).j0(i9, x(j3, obj));
                    }
                    break;
                case 65:
                    if (m3.p(obj, i9, i7)) {
                        ((C0113l) e3.f1973a).l0(y(j3, obj), i9);
                    }
                    break;
                case 66:
                    if (m3.p(obj, i9, i7)) {
                        int iX = x(j3, obj);
                        ((C0113l) e3.f1973a).t0(i9, (iX >> 31) ^ (iX << 1));
                    }
                    break;
                case 67:
                    if (m3.p(obj, i9, i7)) {
                        long jY = y(j3, obj);
                        ((C0113l) e3.f1973a).v0((jY << 1) ^ (jY >> 63), i9);
                    }
                    break;
                case 68:
                    if (m3.p(obj, i9, i7)) {
                        e3.a(i9, unsafe.getObject(obj, j3), m3.l(i7));
                    }
                    break;
                default:
                    break;
            }
            i7 += 3;
            i5 = 1048575;
        }
        m3.f1996l.getClass();
        ((AbstractC0122v) obj).unknownFields.d(e3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    @Override // androidx.datastore.preferences.protobuf.V
    public final void a(Object obj, Object obj2) {
        Object obj3;
        if (!o(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
        obj2.getClass();
        int i3 = 0;
        while (true) {
            int[] iArr = this.f1985a;
            if (i3 >= iArr.length) {
                W.k(this.f1996l, obj, obj2);
                return;
            }
            int iK = K(i3);
            long j3 = 1048575 & iK;
            int i4 = iArr[i3];
            switch (J(iK)) {
                case 0:
                    if (!m(i3, obj2)) {
                        obj3 = obj;
                    } else {
                        h0 h0Var = i0.f2065c;
                        obj3 = obj;
                        h0Var.l(obj3, j3, h0Var.d(j3, obj2));
                        F(i3, obj3);
                    }
                    break;
                case 1:
                    if (m(i3, obj2)) {
                        h0 h0Var2 = i0.f2065c;
                        h0Var2.m(obj, j3, h0Var2.e(j3, obj2));
                        F(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (m(i3, obj2)) {
                        i0.n(obj, j3, i0.f2065c.g(j3, obj2));
                        F(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (m(i3, obj2)) {
                        i0.n(obj, j3, i0.f2065c.g(j3, obj2));
                        F(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (m(i3, obj2)) {
                        i0.m(obj, j3, i0.f2065c.f(j3, obj2));
                        F(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (m(i3, obj2)) {
                        i0.n(obj, j3, i0.f2065c.g(j3, obj2));
                        F(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (m(i3, obj2)) {
                        i0.m(obj, j3, i0.f2065c.f(j3, obj2));
                        F(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (m(i3, obj2)) {
                        h0 h0Var3 = i0.f2065c;
                        h0Var3.j(obj, j3, h0Var3.c(j3, obj2));
                        F(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (m(i3, obj2)) {
                        i0.o(obj, j3, i0.f2065c.h(j3, obj2));
                        F(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                    r(obj, obj2, i3);
                    obj3 = obj;
                    break;
                case 10:
                    if (m(i3, obj2)) {
                        i0.o(obj, j3, i0.f2065c.h(j3, obj2));
                        F(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (m(i3, obj2)) {
                        i0.m(obj, j3, i0.f2065c.f(j3, obj2));
                        F(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (m(i3, obj2)) {
                        i0.m(obj, j3, i0.f2065c.f(j3, obj2));
                        F(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (m(i3, obj2)) {
                        i0.m(obj, j3, i0.f2065c.f(j3, obj2));
                        F(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (m(i3, obj2)) {
                        i0.n(obj, j3, i0.f2065c.g(j3, obj2));
                        F(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (m(i3, obj2)) {
                        i0.m(obj, j3, i0.f2065c.f(j3, obj2));
                        F(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (m(i3, obj2)) {
                        i0.n(obj, j3, i0.f2065c.g(j3, obj2));
                        F(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                    r(obj, obj2, i3);
                    obj3 = obj;
                    break;
                case 18:
                case 19:
                case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f1995k.getClass();
                    h0 h0Var4 = i0.f2065c;
                    InterfaceC0123w interfaceC0123wC = (InterfaceC0123w) h0Var4.h(j3, obj);
                    InterfaceC0123w interfaceC0123w = (InterfaceC0123w) h0Var4.h(j3, obj2);
                    T t3 = (T) interfaceC0123wC;
                    int i5 = t3.f2007m;
                    int i6 = ((T) interfaceC0123w).f2007m;
                    if (i5 > 0 && i6 > 0) {
                        if (!((AbstractC0103b) interfaceC0123wC).f2028k) {
                            interfaceC0123wC = t3.c(i6 + i5);
                        }
                        ((AbstractC0103b) interfaceC0123wC).addAll(interfaceC0123w);
                    }
                    if (i5 > 0) {
                        interfaceC0123w = interfaceC0123wC;
                    }
                    i0.o(obj, j3, interfaceC0123w);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = W.f2012a;
                    h0 h0Var5 = i0.f2065c;
                    Object objH = h0Var5.h(j3, obj);
                    Object objH2 = h0Var5.h(j3, obj2);
                    this.f1997m.getClass();
                    i0.o(obj, j3, I.a(objH, objH2));
                    obj3 = obj;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (p(obj2, i4, i3)) {
                        i0.o(obj, j3, i0.f2065c.h(j3, obj2));
                        G(obj, i4, i3);
                    }
                    obj3 = obj;
                    break;
                case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                    s(obj, obj2, i3);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (p(obj2, i4, i3)) {
                        i0.o(obj, j3, i0.f2065c.h(j3, obj2));
                        G(obj, i4, i3);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    s(obj, obj2, i3);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i3 += 3;
            obj = obj3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void b(Object obj, E e3) throws IOException {
        e3.getClass();
        L(obj, e3);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.V
    public final int c(AbstractC0122v abstractC0122v) {
        int i3;
        int iB;
        int i4;
        int[] iArr = this.f1985a;
        int length = iArr.length;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6 += 3) {
            int iK = K(i6);
            int i7 = iArr[i6];
            long j3 = 1048575 & iK;
            int i8 = 1237;
            int iHashCode = 37;
            switch (J(iK)) {
                case 0:
                    i3 = i5 * 53;
                    iB = AbstractC0124x.b(Double.doubleToLongBits(i0.f2065c.d(j3, abstractC0122v)));
                    i5 = iB + i3;
                    break;
                case 1:
                    i3 = i5 * 53;
                    iB = Float.floatToIntBits(i0.f2065c.e(j3, abstractC0122v));
                    i5 = iB + i3;
                    break;
                case 2:
                    i3 = i5 * 53;
                    iB = AbstractC0124x.b(i0.f2065c.g(j3, abstractC0122v));
                    i5 = iB + i3;
                    break;
                case 3:
                    i3 = i5 * 53;
                    iB = AbstractC0124x.b(i0.f2065c.g(j3, abstractC0122v));
                    i5 = iB + i3;
                    break;
                case 4:
                    i3 = i5 * 53;
                    iB = i0.f2065c.f(j3, abstractC0122v);
                    i5 = iB + i3;
                    break;
                case 5:
                    i3 = i5 * 53;
                    iB = AbstractC0124x.b(i0.f2065c.g(j3, abstractC0122v));
                    i5 = iB + i3;
                    break;
                case 6:
                    i3 = i5 * 53;
                    iB = i0.f2065c.f(j3, abstractC0122v);
                    i5 = iB + i3;
                    break;
                case 7:
                    i4 = i5 * 53;
                    boolean zC = i0.f2065c.c(j3, abstractC0122v);
                    Charset charset = AbstractC0124x.f2114a;
                    if (zC) {
                        i8 = 1231;
                    }
                    i5 = i8 + i4;
                    break;
                case 8:
                    i3 = i5 * 53;
                    iB = ((String) i0.f2065c.h(j3, abstractC0122v)).hashCode();
                    i5 = iB + i3;
                    break;
                case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                    Object objH = i0.f2065c.h(j3, abstractC0122v);
                    if (objH != null) {
                        iHashCode = objH.hashCode();
                    }
                    i5 = (i5 * 53) + iHashCode;
                    break;
                case 10:
                    i3 = i5 * 53;
                    iB = i0.f2065c.h(j3, abstractC0122v).hashCode();
                    i5 = iB + i3;
                    break;
                case 11:
                    i3 = i5 * 53;
                    iB = i0.f2065c.f(j3, abstractC0122v);
                    i5 = iB + i3;
                    break;
                case 12:
                    i3 = i5 * 53;
                    iB = i0.f2065c.f(j3, abstractC0122v);
                    i5 = iB + i3;
                    break;
                case 13:
                    i3 = i5 * 53;
                    iB = i0.f2065c.f(j3, abstractC0122v);
                    i5 = iB + i3;
                    break;
                case 14:
                    i3 = i5 * 53;
                    iB = AbstractC0124x.b(i0.f2065c.g(j3, abstractC0122v));
                    i5 = iB + i3;
                    break;
                case 15:
                    i3 = i5 * 53;
                    iB = i0.f2065c.f(j3, abstractC0122v);
                    i5 = iB + i3;
                    break;
                case 16:
                    i3 = i5 * 53;
                    iB = AbstractC0124x.b(i0.f2065c.g(j3, abstractC0122v));
                    i5 = iB + i3;
                    break;
                case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                    Object objH2 = i0.f2065c.h(j3, abstractC0122v);
                    if (objH2 != null) {
                        iHashCode = objH2.hashCode();
                    }
                    i5 = (i5 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i3 = i5 * 53;
                    iB = i0.f2065c.h(j3, abstractC0122v).hashCode();
                    i5 = iB + i3;
                    break;
                case 50:
                    i3 = i5 * 53;
                    iB = i0.f2065c.h(j3, abstractC0122v).hashCode();
                    i5 = iB + i3;
                    break;
                case 51:
                    if (p(abstractC0122v, i7, i6)) {
                        i3 = i5 * 53;
                        iB = AbstractC0124x.b(Double.doubleToLongBits(((Double) i0.f2065c.h(j3, abstractC0122v)).doubleValue()));
                        i5 = iB + i3;
                    }
                    break;
                case 52:
                    if (p(abstractC0122v, i7, i6)) {
                        i3 = i5 * 53;
                        iB = Float.floatToIntBits(((Float) i0.f2065c.h(j3, abstractC0122v)).floatValue());
                        i5 = iB + i3;
                    }
                    break;
                case 53:
                    if (p(abstractC0122v, i7, i6)) {
                        i3 = i5 * 53;
                        iB = AbstractC0124x.b(y(j3, abstractC0122v));
                        i5 = iB + i3;
                    }
                    break;
                case 54:
                    if (p(abstractC0122v, i7, i6)) {
                        i3 = i5 * 53;
                        iB = AbstractC0124x.b(y(j3, abstractC0122v));
                        i5 = iB + i3;
                    }
                    break;
                case 55:
                    if (p(abstractC0122v, i7, i6)) {
                        i3 = i5 * 53;
                        iB = x(j3, abstractC0122v);
                        i5 = iB + i3;
                    }
                    break;
                case 56:
                    if (p(abstractC0122v, i7, i6)) {
                        i3 = i5 * 53;
                        iB = AbstractC0124x.b(y(j3, abstractC0122v));
                        i5 = iB + i3;
                    }
                    break;
                case 57:
                    if (p(abstractC0122v, i7, i6)) {
                        i3 = i5 * 53;
                        iB = x(j3, abstractC0122v);
                        i5 = iB + i3;
                    }
                    break;
                case 58:
                    if (p(abstractC0122v, i7, i6)) {
                        i4 = i5 * 53;
                        boolean zBooleanValue = ((Boolean) i0.f2065c.h(j3, abstractC0122v)).booleanValue();
                        Charset charset2 = AbstractC0124x.f2114a;
                        if (zBooleanValue) {
                            i8 = 1231;
                        }
                        i5 = i8 + i4;
                    }
                    break;
                case 59:
                    if (p(abstractC0122v, i7, i6)) {
                        i3 = i5 * 53;
                        iB = ((String) i0.f2065c.h(j3, abstractC0122v)).hashCode();
                        i5 = iB + i3;
                    }
                    break;
                case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                    if (p(abstractC0122v, i7, i6)) {
                        i3 = i5 * 53;
                        iB = i0.f2065c.h(j3, abstractC0122v).hashCode();
                        i5 = iB + i3;
                    }
                    break;
                case 61:
                    if (p(abstractC0122v, i7, i6)) {
                        i3 = i5 * 53;
                        iB = i0.f2065c.h(j3, abstractC0122v).hashCode();
                        i5 = iB + i3;
                    }
                    break;
                case 62:
                    if (p(abstractC0122v, i7, i6)) {
                        i3 = i5 * 53;
                        iB = x(j3, abstractC0122v);
                        i5 = iB + i3;
                    }
                    break;
                case 63:
                    if (p(abstractC0122v, i7, i6)) {
                        i3 = i5 * 53;
                        iB = x(j3, abstractC0122v);
                        i5 = iB + i3;
                    }
                    break;
                case 64:
                    if (p(abstractC0122v, i7, i6)) {
                        i3 = i5 * 53;
                        iB = x(j3, abstractC0122v);
                        i5 = iB + i3;
                    }
                    break;
                case 65:
                    if (p(abstractC0122v, i7, i6)) {
                        i3 = i5 * 53;
                        iB = AbstractC0124x.b(y(j3, abstractC0122v));
                        i5 = iB + i3;
                    }
                    break;
                case 66:
                    if (p(abstractC0122v, i7, i6)) {
                        i3 = i5 * 53;
                        iB = x(j3, abstractC0122v);
                        i5 = iB + i3;
                    }
                    break;
                case 67:
                    if (p(abstractC0122v, i7, i6)) {
                        i3 = i5 * 53;
                        iB = AbstractC0124x.b(y(j3, abstractC0122v));
                        i5 = iB + i3;
                    }
                    break;
                case 68:
                    if (p(abstractC0122v, i7, i6)) {
                        i3 = i5 * 53;
                        iB = i0.f2065c.h(j3, abstractC0122v).hashCode();
                        i5 = iB + i3;
                    }
                    break;
            }
        }
        this.f1996l.getClass();
        return abstractC0122v.unknownFields.hashCode() + (i5 * 53);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:43:0x0093 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.V
    public final void d(Object obj) {
        if (o(obj)) {
            if (obj instanceof AbstractC0122v) {
                AbstractC0122v abstractC0122v = (AbstractC0122v) obj;
                abstractC0122v.k(Integer.MAX_VALUE);
                abstractC0122v.memoizedHashCode = 0;
                abstractC0122v.h();
            }
            int[] iArr = this.f1985a;
            int length = iArr.length;
            for (int i3 = 0; i3 < length; i3 += 3) {
                int iK = K(i3);
                long j3 = 1048575 & iK;
                int iJ = J(iK);
                if (iJ != 9) {
                    if (iJ != 60 && iJ != 68) {
                        switch (iJ) {
                            case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                                if (m(i3, obj)) {
                                    l(i3).d(f1984o.getObject(obj, j3));
                                }
                                break;
                            case 18:
                            case 19:
                            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.f1995k.getClass();
                                AbstractC0103b abstractC0103b = (AbstractC0103b) ((InterfaceC0123w) i0.f2065c.h(j3, obj));
                                if (abstractC0103b.f2028k) {
                                    abstractC0103b.f2028k = false;
                                }
                                break;
                            case 50:
                                Unsafe unsafe = f1984o;
                                Object object = unsafe.getObject(obj, j3);
                                if (object != null) {
                                    this.f1997m.getClass();
                                    ((H) object).f1980k = false;
                                    unsafe.putObject(obj, j3, object);
                                }
                                break;
                        }
                    } else if (p(obj, iArr[i3], i3)) {
                        l(i3).d(f1984o.getObject(obj, j3));
                    }
                } else if (m(i3, obj)) {
                    l(i3).d(f1984o.getObject(obj, j3));
                }
            }
            this.f1996l.getClass();
            c0 c0Var = ((AbstractC0122v) obj).unknownFields;
            if (c0Var.f2036e) {
                c0Var.f2036e = false;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final boolean e(Object obj) {
        int i3;
        int i4;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i7 < this.f1992h) {
            int i8 = this.f1991g[i7];
            int[] iArr = this.f1985a;
            int i9 = iArr[i8];
            int iK = K(i8);
            int i10 = iArr[i8 + 2];
            int i11 = i10 & 1048575;
            int i12 = 1 << (i10 >>> 20);
            if (i11 != i5) {
                if (i11 != 1048575) {
                    i6 = f1984o.getInt(obj, i11);
                }
                i4 = i6;
                i3 = i11;
            } else {
                int i13 = i6;
                i3 = i5;
                i4 = i13;
            }
            if ((268435456 & iK) == 0 || n(obj, i8, i3, i4, i12)) {
                int iJ = J(iK);
                if (iJ == 9 || iJ == 17) {
                    if (n(obj, i8, i3, i4, i12)) {
                        if (!l(i8).e(i0.f2065c.h(iK & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i7++;
                    i5 = i3;
                    i6 = i4;
                } else {
                    if (iJ != 27) {
                        if (iJ == 60 || iJ == 68) {
                            if (p(obj, i9, i8)) {
                                if (!l(i8).e(i0.f2065c.h(iK & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                            i7++;
                            i5 = i3;
                            i6 = i4;
                        } else if (iJ != 49) {
                            if (iJ != 50) {
                                continue;
                            } else {
                                Object objH = i0.f2065c.h(iK & 1048575, obj);
                                this.f1997m.getClass();
                                H h3 = (H) objH;
                                if (h3.isEmpty()) {
                                    continue;
                                } else {
                                    if (((G) this.f1986b[(i8 / 3) * 2]).f1977a.f1975b.f2095k != r0.MESSAGE) {
                                        continue;
                                    } else {
                                        V vA = null;
                                        for (Object obj2 : h3.values()) {
                                            if (vA == null) {
                                                vA = S.f2003c.a(obj2.getClass());
                                            }
                                            if (!vA.e(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i7++;
                            i5 = i3;
                            i6 = i4;
                        }
                    }
                    List list = (List) i0.f2065c.h(iK & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        V vL = l(i8);
                        for (int i14 = 0; i14 < list.size(); i14++) {
                            if (vL.e(list.get(i14))) {
                            }
                        }
                    }
                    i7++;
                    i5 = i3;
                    i6 = i4;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // androidx.datastore.preferences.protobuf.V
    public final boolean f(AbstractC0122v abstractC0122v, AbstractC0122v abstractC0122v2) {
        int[] iArr = this.f1985a;
        int length = iArr.length;
        int i3 = 0;
        while (true) {
            boolean zL = true;
            if (i3 < length) {
                int iK = K(i3);
                long j3 = iK & 1048575;
                switch (J(iK)) {
                    case 0:
                        if (!i(abstractC0122v, abstractC0122v2, i3)) {
                            zL = false;
                        } else {
                            h0 h0Var = i0.f2065c;
                            if (Double.doubleToLongBits(h0Var.d(j3, abstractC0122v)) != Double.doubleToLongBits(h0Var.d(j3, abstractC0122v2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 1:
                        if (!i(abstractC0122v, abstractC0122v2, i3)) {
                            zL = false;
                        } else {
                            h0 h0Var2 = i0.f2065c;
                            if (Float.floatToIntBits(h0Var2.e(j3, abstractC0122v)) != Float.floatToIntBits(h0Var2.e(j3, abstractC0122v2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 2:
                        if (!i(abstractC0122v, abstractC0122v2, i3)) {
                            zL = false;
                        } else {
                            h0 h0Var3 = i0.f2065c;
                            if (h0Var3.g(j3, abstractC0122v) != h0Var3.g(j3, abstractC0122v2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 3:
                        if (!i(abstractC0122v, abstractC0122v2, i3)) {
                            zL = false;
                        } else {
                            h0 h0Var4 = i0.f2065c;
                            if (h0Var4.g(j3, abstractC0122v) != h0Var4.g(j3, abstractC0122v2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 4:
                        if (!i(abstractC0122v, abstractC0122v2, i3)) {
                            zL = false;
                        } else {
                            h0 h0Var5 = i0.f2065c;
                            if (h0Var5.f(j3, abstractC0122v) != h0Var5.f(j3, abstractC0122v2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 5:
                        if (!i(abstractC0122v, abstractC0122v2, i3)) {
                            zL = false;
                        } else {
                            h0 h0Var6 = i0.f2065c;
                            if (h0Var6.g(j3, abstractC0122v) != h0Var6.g(j3, abstractC0122v2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 6:
                        if (!i(abstractC0122v, abstractC0122v2, i3)) {
                            zL = false;
                        } else {
                            h0 h0Var7 = i0.f2065c;
                            if (h0Var7.f(j3, abstractC0122v) != h0Var7.f(j3, abstractC0122v2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 7:
                        if (!i(abstractC0122v, abstractC0122v2, i3)) {
                            zL = false;
                        } else {
                            h0 h0Var8 = i0.f2065c;
                            if (h0Var8.c(j3, abstractC0122v) != h0Var8.c(j3, abstractC0122v2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 8:
                        if (!i(abstractC0122v, abstractC0122v2, i3)) {
                            zL = false;
                        } else {
                            h0 h0Var9 = i0.f2065c;
                            if (!W.l(h0Var9.h(j3, abstractC0122v), h0Var9.h(j3, abstractC0122v2))) {
                                zL = false;
                            }
                        }
                        break;
                    case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                        if (!i(abstractC0122v, abstractC0122v2, i3)) {
                            zL = false;
                        } else {
                            h0 h0Var10 = i0.f2065c;
                            if (!W.l(h0Var10.h(j3, abstractC0122v), h0Var10.h(j3, abstractC0122v2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 10:
                        if (!i(abstractC0122v, abstractC0122v2, i3)) {
                            zL = false;
                        } else {
                            h0 h0Var11 = i0.f2065c;
                            if (!W.l(h0Var11.h(j3, abstractC0122v), h0Var11.h(j3, abstractC0122v2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 11:
                        if (!i(abstractC0122v, abstractC0122v2, i3)) {
                            zL = false;
                        } else {
                            h0 h0Var12 = i0.f2065c;
                            if (h0Var12.f(j3, abstractC0122v) != h0Var12.f(j3, abstractC0122v2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 12:
                        if (!i(abstractC0122v, abstractC0122v2, i3)) {
                            zL = false;
                        } else {
                            h0 h0Var13 = i0.f2065c;
                            if (h0Var13.f(j3, abstractC0122v) != h0Var13.f(j3, abstractC0122v2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 13:
                        if (!i(abstractC0122v, abstractC0122v2, i3)) {
                            zL = false;
                        } else {
                            h0 h0Var14 = i0.f2065c;
                            if (h0Var14.f(j3, abstractC0122v) != h0Var14.f(j3, abstractC0122v2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 14:
                        if (!i(abstractC0122v, abstractC0122v2, i3)) {
                            zL = false;
                        } else {
                            h0 h0Var15 = i0.f2065c;
                            if (h0Var15.g(j3, abstractC0122v) != h0Var15.g(j3, abstractC0122v2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 15:
                        if (!i(abstractC0122v, abstractC0122v2, i3)) {
                            zL = false;
                        } else {
                            h0 h0Var16 = i0.f2065c;
                            if (h0Var16.f(j3, abstractC0122v) != h0Var16.f(j3, abstractC0122v2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 16:
                        if (!i(abstractC0122v, abstractC0122v2, i3)) {
                            zL = false;
                        } else {
                            h0 h0Var17 = i0.f2065c;
                            if (h0Var17.g(j3, abstractC0122v) != h0Var17.g(j3, abstractC0122v2)) {
                                zL = false;
                            }
                        }
                        break;
                    case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                        if (!i(abstractC0122v, abstractC0122v2, i3)) {
                            zL = false;
                        } else {
                            h0 h0Var18 = i0.f2065c;
                            if (!W.l(h0Var18.h(j3, abstractC0122v), h0Var18.h(j3, abstractC0122v2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 18:
                    case 19:
                    case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        h0 h0Var19 = i0.f2065c;
                        zL = W.l(h0Var19.h(j3, abstractC0122v), h0Var19.h(j3, abstractC0122v2));
                        break;
                    case 50:
                        h0 h0Var20 = i0.f2065c;
                        zL = W.l(h0Var20.h(j3, abstractC0122v), h0Var20.h(j3, abstractC0122v2));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j4 = iArr[i3 + 2] & 1048575;
                        h0 h0Var21 = i0.f2065c;
                        if (h0Var21.f(j4, abstractC0122v) != h0Var21.f(j4, abstractC0122v2) || !W.l(h0Var21.h(j3, abstractC0122v), h0Var21.h(j3, abstractC0122v2))) {
                            zL = false;
                        }
                        break;
                }
                if (zL) {
                    i3 += 3;
                }
            } else {
                this.f1996l.getClass();
                if (abstractC0122v.unknownFields.equals(abstractC0122v2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 18841. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // androidx.datastore.preferences.protobuf.V
    public final void g(java.lang.Object r19, androidx.datastore.preferences.protobuf.C0112k r20, androidx.datastore.preferences.protobuf.C0115n r21) {
        /*
            Method dump skipped, instruction units count: 1884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.g(java.lang.Object, androidx.datastore.preferences.protobuf.k, androidx.datastore.preferences.protobuf.n):void");
    }

    /* JADX WARN: Code duplicated, block: B:144:0x038c  */
    /* JADX WARN: Code duplicated, block: B:86:0x01cd  */
    @Override // androidx.datastore.preferences.protobuf.V
    public final int h(AbstractC0122v abstractC0122v) {
        int i3;
        int iZ;
        int iZ2;
        int iZ3;
        int iB0;
        int iZ4;
        int iB1;
        int iZ5;
        int iZ6;
        int iX;
        int iZ7;
        int iA;
        int iC;
        int iZ8;
        int size;
        int i4;
        int iZ9;
        int iZ10;
        int size2;
        int iZ11;
        int iA0;
        int iB2;
        int iA2;
        int iZ12;
        int iA1;
        M m3 = this;
        AbstractC0122v abstractC0122v2 = abstractC0122v;
        Unsafe unsafe = f1984o;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int iX2 = 0;
        while (true) {
            int[] iArr = m3.f1985a;
            if (i6 >= iArr.length) {
                m3.f1996l.getClass();
                return abstractC0122v2.unknownFields.b() + iX2;
            }
            int iK = m3.K(i6);
            int iJ = J(iK);
            int i8 = iArr[i6];
            int i9 = iArr[i6 + 2];
            int i10 = i9 & 1048575;
            if (iJ <= 17) {
                if (i10 != i5) {
                    i7 = i10 == 1048575 ? 0 : unsafe.getInt(abstractC0122v2, i10);
                    i5 = i10;
                }
                i3 = 1 << (i9 >>> 20);
            } else {
                i3 = 0;
            }
            long j3 = iK & 1048575;
            if (iJ >= r.f2097l.f2100k) {
                int i11 = r.f2098m.f2100k;
            }
            switch (iJ) {
                case 0:
                    if (m3.n(abstractC0122v2, i6, i5, i7, i3)) {
                        iZ = C0113l.Z(i8);
                        iC = iZ + 8;
                        iX2 += iC;
                    }
                    break;
                case 1:
                    if (m3.n(abstractC0122v2, i6, i5, i7, i3)) {
                        iZ2 = C0113l.Z(i8);
                        iZ6 = iZ2 + 4;
                        iX2 += iZ6;
                    }
                    m3 = this;
                    abstractC0122v2 = abstractC0122v;
                    break;
                case 2:
                    if (m3.n(abstractC0122v2, i6, i5, i7, i3)) {
                        long j4 = unsafe.getLong(abstractC0122v2, j3);
                        iZ3 = C0113l.Z(i8);
                        iB0 = C0113l.b0(j4);
                        iX2 += iB0 + iZ3;
                    }
                    m3 = this;
                    break;
                case 3:
                    if (m3.n(abstractC0122v2, i6, i5, i7, i3)) {
                        long j5 = unsafe.getLong(abstractC0122v2, j3);
                        iZ3 = C0113l.Z(i8);
                        iB0 = C0113l.b0(j5);
                        iX2 += iB0 + iZ3;
                    }
                    m3 = this;
                    break;
                case 4:
                    if (m3.n(abstractC0122v2, i6, i5, i7, i3)) {
                        int i12 = unsafe.getInt(abstractC0122v2, j3);
                        iZ4 = C0113l.Z(i8);
                        iB1 = C0113l.b0(i12);
                        iX = iB1 + iZ4;
                        iX2 += iX;
                    }
                    m3 = this;
                    break;
                case 5:
                    if (m3.n(abstractC0122v2, i6, i5, i7, i3)) {
                        iZ5 = C0113l.Z(i8);
                        iZ6 = iZ5 + 8;
                        iX2 += iZ6;
                    }
                    m3 = this;
                    abstractC0122v2 = abstractC0122v;
                    break;
                case 6:
                    if (m3.n(abstractC0122v2, i6, i5, i7, i3)) {
                        iZ2 = C0113l.Z(i8);
                        iZ6 = iZ2 + 4;
                        iX2 += iZ6;
                    }
                    m3 = this;
                    abstractC0122v2 = abstractC0122v;
                    break;
                case 7:
                    if (m3.n(abstractC0122v2, i6, i5, i7, i3)) {
                        iZ6 = C0113l.Z(i8) + 1;
                        iX2 += iZ6;
                    }
                    m3 = this;
                    abstractC0122v2 = abstractC0122v;
                    break;
                case 8:
                    if (m3.n(abstractC0122v2, i6, i5, i7, i3)) {
                        Object object = unsafe.getObject(abstractC0122v2, j3);
                        iX2 = (object instanceof C0108g ? C0113l.X(i8, (C0108g) object) : C0113l.Y((String) object) + C0113l.Z(i8)) + iX2;
                    }
                    m3 = this;
                    break;
                case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                    if (m3.n(abstractC0122v2, i6, i5, i7, i3)) {
                        Object object2 = unsafe.getObject(abstractC0122v2, j3);
                        V vL = m3.l(i6);
                        Class cls = W.f2012a;
                        int iZ13 = C0113l.Z(i8);
                        int iA3 = ((AbstractC0102a) object2).a(vL);
                        iX2 += C0113l.a0(iA3) + iA3 + iZ13;
                    }
                    break;
                case 10:
                    if (m3.n(abstractC0122v2, i6, i5, i7, i3)) {
                        iX = C0113l.X(i8, (C0108g) unsafe.getObject(abstractC0122v2, j3));
                        iX2 += iX;
                    }
                    m3 = this;
                    break;
                case 11:
                    if (m3.n(abstractC0122v2, i6, i5, i7, i3)) {
                        int i13 = unsafe.getInt(abstractC0122v2, j3);
                        iZ4 = C0113l.Z(i8);
                        iB1 = C0113l.a0(i13);
                        iX = iB1 + iZ4;
                        iX2 += iX;
                    }
                    m3 = this;
                    break;
                case 12:
                    if (m3.n(abstractC0122v2, i6, i5, i7, i3)) {
                        int i14 = unsafe.getInt(abstractC0122v2, j3);
                        iZ4 = C0113l.Z(i8);
                        iB1 = C0113l.b0(i14);
                        iX = iB1 + iZ4;
                        iX2 += iX;
                    }
                    m3 = this;
                    break;
                case 13:
                    if (m3.n(abstractC0122v2, i6, i5, i7, i3)) {
                        iZ2 = C0113l.Z(i8);
                        iZ6 = iZ2 + 4;
                        iX2 += iZ6;
                    }
                    m3 = this;
                    abstractC0122v2 = abstractC0122v;
                    break;
                case 14:
                    if (m3.n(abstractC0122v2, i6, i5, i7, i3)) {
                        iZ5 = C0113l.Z(i8);
                        iZ6 = iZ5 + 8;
                        iX2 += iZ6;
                    }
                    m3 = this;
                    abstractC0122v2 = abstractC0122v;
                    break;
                case 15:
                    if (m3.n(abstractC0122v2, i6, i5, i7, i3)) {
                        int i15 = unsafe.getInt(abstractC0122v2, j3);
                        iZ4 = C0113l.Z(i8);
                        iB1 = C0113l.a0((i15 >> 31) ^ (i15 << 1));
                        iX = iB1 + iZ4;
                        iX2 += iX;
                    }
                    m3 = this;
                    break;
                case 16:
                    if (m3.n(abstractC0122v2, i6, i5, i7, i3)) {
                        long j6 = unsafe.getLong(abstractC0122v2, j3);
                        iZ3 = C0113l.Z(i8);
                        iB0 = C0113l.b0((j6 << 1) ^ (j6 >> 63));
                        iX2 += iB0 + iZ3;
                    }
                    m3 = this;
                    break;
                case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                    if (m3.n(abstractC0122v2, i6, i5, i7, i3)) {
                        AbstractC0102a abstractC0102a = (AbstractC0102a) unsafe.getObject(abstractC0122v2, j3);
                        V vL2 = m3.l(i6);
                        iZ7 = C0113l.Z(i8) * 2;
                        iA = abstractC0102a.a(vL2);
                        iC = iA + iZ7;
                        iX2 += iC;
                    }
                    break;
                case 18:
                    iC = W.c(i8, (List) unsafe.getObject(abstractC0122v2, j3));
                    iX2 += iC;
                    break;
                case 19:
                    iC = W.b(i8, (List) unsafe.getObject(abstractC0122v2, j3));
                    iX2 += iC;
                    break;
                case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                    List list = (List) unsafe.getObject(abstractC0122v2, j3);
                    Class cls2 = W.f2012a;
                    if (list.size() == 0) {
                        iZ8 = 0;
                    } else {
                        iZ8 = (C0113l.Z(i8) * list.size()) + W.e(list);
                    }
                    iX2 += iZ8;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(abstractC0122v2, j3);
                    Class cls3 = W.f2012a;
                    size = list2.size();
                    if (size == 0) {
                        iZ8 = 0;
                    } else {
                        i4 = W.i(list2);
                        iZ9 = C0113l.Z(i8);
                        iZ8 = (iZ9 * size) + i4;
                    }
                    iX2 += iZ8;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(abstractC0122v2, j3);
                    Class cls4 = W.f2012a;
                    size = list3.size();
                    if (size == 0) {
                        iZ8 = 0;
                    } else {
                        i4 = W.d(list3);
                        iZ9 = C0113l.Z(i8);
                        iZ8 = (iZ9 * size) + i4;
                    }
                    iX2 += iZ8;
                    break;
                case 23:
                    iC = W.c(i8, (List) unsafe.getObject(abstractC0122v2, j3));
                    iX2 += iC;
                    break;
                case 24:
                    iC = W.b(i8, (List) unsafe.getObject(abstractC0122v2, j3));
                    iX2 += iC;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(abstractC0122v2, j3);
                    Class cls5 = W.f2012a;
                    int size3 = list4.size();
                    iX2 += size3 == 0 ? 0 : (C0113l.Z(i8) + 1) * size3;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(abstractC0122v2, j3);
                    Class cls6 = W.f2012a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iZ8 = 0;
                    } else {
                        iZ8 = C0113l.Z(i8) * size4;
                        for (int i16 = 0; i16 < size4; i16++) {
                            Object obj = list5.get(i16);
                            if (obj instanceof C0108g) {
                                int size5 = ((C0108g) obj).size();
                                iZ8 = C0113l.a0(size5) + size5 + iZ8;
                            } else {
                                iZ8 = C0113l.Y((String) obj) + iZ8;
                            }
                        }
                    }
                    iX2 += iZ8;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(abstractC0122v2, j3);
                    V vL3 = m3.l(i6);
                    Class cls7 = W.f2012a;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        iZ10 = 0;
                    } else {
                        iZ10 = C0113l.Z(i8) * size6;
                        for (int i17 = 0; i17 < size6; i17++) {
                            int iA4 = ((AbstractC0102a) list6.get(i17)).a(vL3);
                            iZ10 += C0113l.a0(iA4) + iA4;
                        }
                    }
                    iX2 += iZ10;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(abstractC0122v2, j3);
                    Class cls8 = W.f2012a;
                    int size7 = list7.size();
                    if (size7 == 0) {
                        iZ8 = 0;
                    } else {
                        iZ8 = C0113l.Z(i8) * size7;
                        for (int i18 = 0; i18 < list7.size(); i18++) {
                            int size8 = ((C0108g) list7.get(i18)).size();
                            iZ8 += C0113l.a0(size8) + size8;
                        }
                    }
                    iX2 += iZ8;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(abstractC0122v2, j3);
                    Class cls9 = W.f2012a;
                    size = list8.size();
                    if (size == 0) {
                        iZ8 = 0;
                    } else {
                        i4 = W.h(list8);
                        iZ9 = C0113l.Z(i8);
                        iZ8 = (iZ9 * size) + i4;
                    }
                    iX2 += iZ8;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(abstractC0122v2, j3);
                    Class cls10 = W.f2012a;
                    size = list9.size();
                    if (size == 0) {
                        iZ8 = 0;
                    } else {
                        i4 = W.a(list9);
                        iZ9 = C0113l.Z(i8);
                        iZ8 = (iZ9 * size) + i4;
                    }
                    iX2 += iZ8;
                    break;
                case 31:
                    iC = W.b(i8, (List) unsafe.getObject(abstractC0122v2, j3));
                    iX2 += iC;
                    break;
                case 32:
                    iC = W.c(i8, (List) unsafe.getObject(abstractC0122v2, j3));
                    iX2 += iC;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(abstractC0122v2, j3);
                    Class cls11 = W.f2012a;
                    size = list10.size();
                    if (size == 0) {
                        iZ8 = 0;
                    } else {
                        i4 = W.f(list10);
                        iZ9 = C0113l.Z(i8);
                        iZ8 = (iZ9 * size) + i4;
                    }
                    iX2 += iZ8;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(abstractC0122v2, j3);
                    Class cls12 = W.f2012a;
                    size = list11.size();
                    if (size == 0) {
                        iZ8 = 0;
                    } else {
                        i4 = W.g(list11);
                        iZ9 = C0113l.Z(i8);
                        iZ8 = (iZ9 * size) + i4;
                    }
                    iX2 += iZ8;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(abstractC0122v2, j3);
                    Class cls13 = W.f2012a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iZ11 = C0113l.Z(i8);
                        iA0 = C0113l.a0(size2);
                        iB2 = iA0 + iZ11;
                        iA1 = iB2 + size2;
                        iX2 += iA1;
                    }
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(abstractC0122v2, j3);
                    Class cls14 = W.f2012a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iZ11 = C0113l.Z(i8);
                        iA0 = C0113l.a0(size2);
                        iB2 = iA0 + iZ11;
                        iA1 = iB2 + size2;
                        iX2 += iA1;
                    }
                    break;
                case 37:
                    size2 = W.e((List) unsafe.getObject(abstractC0122v2, j3));
                    if (size2 > 0) {
                        iZ11 = C0113l.Z(i8);
                        iA0 = C0113l.a0(size2);
                        iB2 = iA0 + iZ11;
                        iA1 = iB2 + size2;
                        iX2 += iA1;
                    }
                    break;
                case 38:
                    size2 = W.i((List) unsafe.getObject(abstractC0122v2, j3));
                    if (size2 > 0) {
                        iZ11 = C0113l.Z(i8);
                        iA0 = C0113l.a0(size2);
                        iB2 = iA0 + iZ11;
                        iA1 = iB2 + size2;
                        iX2 += iA1;
                    }
                    break;
                case 39:
                    size2 = W.d((List) unsafe.getObject(abstractC0122v2, j3));
                    if (size2 > 0) {
                        iZ11 = C0113l.Z(i8);
                        iA0 = C0113l.a0(size2);
                        iB2 = iA0 + iZ11;
                        iA1 = iB2 + size2;
                        iX2 += iA1;
                    }
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(abstractC0122v2, j3);
                    Class cls15 = W.f2012a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iZ11 = C0113l.Z(i8);
                        iA0 = C0113l.a0(size2);
                        iB2 = iA0 + iZ11;
                        iA1 = iB2 + size2;
                        iX2 += iA1;
                    }
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(abstractC0122v2, j3);
                    Class cls16 = W.f2012a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iZ11 = C0113l.Z(i8);
                        iA0 = C0113l.a0(size2);
                        iB2 = iA0 + iZ11;
                        iA1 = iB2 + size2;
                        iX2 += iA1;
                    }
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(abstractC0122v2, j3);
                    Class cls17 = W.f2012a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iZ11 = C0113l.Z(i8);
                        iA0 = C0113l.a0(size2);
                        iB2 = iA0 + iZ11;
                        iA1 = iB2 + size2;
                        iX2 += iA1;
                    }
                    break;
                case 43:
                    size2 = W.h((List) unsafe.getObject(abstractC0122v2, j3));
                    if (size2 > 0) {
                        iZ11 = C0113l.Z(i8);
                        iA0 = C0113l.a0(size2);
                        iB2 = iA0 + iZ11;
                        iA1 = iB2 + size2;
                        iX2 += iA1;
                    }
                    break;
                case 44:
                    size2 = W.a((List) unsafe.getObject(abstractC0122v2, j3));
                    if (size2 > 0) {
                        iZ11 = C0113l.Z(i8);
                        iA0 = C0113l.a0(size2);
                        iB2 = iA0 + iZ11;
                        iA1 = iB2 + size2;
                        iX2 += iA1;
                    }
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(abstractC0122v2, j3);
                    Class cls18 = W.f2012a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iZ11 = C0113l.Z(i8);
                        iA0 = C0113l.a0(size2);
                        iB2 = iA0 + iZ11;
                        iA1 = iB2 + size2;
                        iX2 += iA1;
                    }
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(abstractC0122v2, j3);
                    Class cls19 = W.f2012a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iZ11 = C0113l.Z(i8);
                        iA0 = C0113l.a0(size2);
                        iB2 = iA0 + iZ11;
                        iA1 = iB2 + size2;
                        iX2 += iA1;
                    }
                    break;
                case 47:
                    size2 = W.f((List) unsafe.getObject(abstractC0122v2, j3));
                    if (size2 > 0) {
                        iZ11 = C0113l.Z(i8);
                        iA0 = C0113l.a0(size2);
                        iB2 = iA0 + iZ11;
                        iA1 = iB2 + size2;
                        iX2 += iA1;
                    }
                    break;
                case 48:
                    size2 = W.g((List) unsafe.getObject(abstractC0122v2, j3));
                    if (size2 > 0) {
                        iZ11 = C0113l.Z(i8);
                        iA0 = C0113l.a0(size2);
                        iB2 = iA0 + iZ11;
                        iA1 = iB2 + size2;
                        iX2 += iA1;
                    }
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(abstractC0122v2, j3);
                    V vL4 = m3.l(i6);
                    Class cls20 = W.f2012a;
                    int size9 = list19.size();
                    if (size9 == 0) {
                        iA2 = 0;
                    } else {
                        iA2 = 0;
                        for (int i19 = 0; i19 < size9; i19++) {
                            iA2 += ((AbstractC0102a) list19.get(i19)).a(vL4) + (C0113l.Z(i8) * 2);
                        }
                    }
                    iX2 += iA2;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(abstractC0122v2, j3);
                    Object obj2 = m3.f1986b[(i6 / 3) * 2];
                    m3.f1997m.getClass();
                    H h3 = (H) object3;
                    G g3 = (G) obj2;
                    if (h3.isEmpty()) {
                        iZ10 = 0;
                    } else {
                        iZ10 = 0;
                        for (Map.Entry entry : h3.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            g3.getClass();
                            int iZ14 = C0113l.Z(i8);
                            int iA5 = G.a(g3.f1977a, key, value);
                            iZ10 += C0113l.a0(iA5) + iA5 + iZ14;
                        }
                    }
                    iX2 += iZ10;
                    break;
                case 51:
                    if (m3.p(abstractC0122v2, i8, i6)) {
                        iZ = C0113l.Z(i8);
                        iC = iZ + 8;
                        iX2 += iC;
                    }
                    break;
                case 52:
                    if (m3.p(abstractC0122v2, i8, i6)) {
                        iZ12 = C0113l.Z(i8);
                        iC = iZ12 + 4;
                        iX2 += iC;
                    }
                    break;
                case 53:
                    if (m3.p(abstractC0122v2, i8, i6)) {
                        long jY = y(j3, abstractC0122v2);
                        size2 = C0113l.Z(i8);
                        iB2 = C0113l.b0(jY);
                        iA1 = iB2 + size2;
                        iX2 += iA1;
                    }
                    break;
                case 54:
                    if (m3.p(abstractC0122v2, i8, i6)) {
                        long jY2 = y(j3, abstractC0122v2);
                        size2 = C0113l.Z(i8);
                        iB2 = C0113l.b0(jY2);
                        iA1 = iB2 + size2;
                        iX2 += iA1;
                    }
                    break;
                case 55:
                    if (m3.p(abstractC0122v2, i8, i6)) {
                        int iX3 = x(j3, abstractC0122v2);
                        iZ7 = C0113l.Z(i8);
                        iA = C0113l.b0(iX3);
                        iC = iA + iZ7;
                        iX2 += iC;
                    }
                    break;
                case 56:
                    if (m3.p(abstractC0122v2, i8, i6)) {
                        iZ = C0113l.Z(i8);
                        iC = iZ + 8;
                        iX2 += iC;
                    }
                    break;
                case 57:
                    if (m3.p(abstractC0122v2, i8, i6)) {
                        iZ12 = C0113l.Z(i8);
                        iC = iZ12 + 4;
                        iX2 += iC;
                    }
                    break;
                case 58:
                    if (m3.p(abstractC0122v2, i8, i6)) {
                        iC = C0113l.Z(i8) + 1;
                        iX2 += iC;
                    }
                    break;
                case 59:
                    if (m3.p(abstractC0122v2, i8, i6)) {
                        Object object4 = unsafe.getObject(abstractC0122v2, j3);
                        iX2 = (object4 instanceof C0108g ? C0113l.X(i8, (C0108g) object4) : C0113l.Y((String) object4) + C0113l.Z(i8)) + iX2;
                    }
                    break;
                case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                    if (m3.p(abstractC0122v2, i8, i6)) {
                        Object object5 = unsafe.getObject(abstractC0122v2, j3);
                        V vL5 = m3.l(i6);
                        Class cls21 = W.f2012a;
                        int iZ15 = C0113l.Z(i8);
                        int iA6 = ((AbstractC0102a) object5).a(vL5);
                        iA1 = C0113l.a0(iA6) + iA6 + iZ15;
                        iX2 += iA1;
                    }
                    break;
                case 61:
                    if (m3.p(abstractC0122v2, i8, i6)) {
                        iC = C0113l.X(i8, (C0108g) unsafe.getObject(abstractC0122v2, j3));
                        iX2 += iC;
                    }
                    break;
                case 62:
                    if (m3.p(abstractC0122v2, i8, i6)) {
                        int iX4 = x(j3, abstractC0122v2);
                        iZ7 = C0113l.Z(i8);
                        iA = C0113l.a0(iX4);
                        iC = iA + iZ7;
                        iX2 += iC;
                    }
                    break;
                case 63:
                    if (m3.p(abstractC0122v2, i8, i6)) {
                        int iX5 = x(j3, abstractC0122v2);
                        iZ7 = C0113l.Z(i8);
                        iA = C0113l.b0(iX5);
                        iC = iA + iZ7;
                        iX2 += iC;
                    }
                    break;
                case 64:
                    if (m3.p(abstractC0122v2, i8, i6)) {
                        iZ12 = C0113l.Z(i8);
                        iC = iZ12 + 4;
                        iX2 += iC;
                    }
                    break;
                case 65:
                    if (m3.p(abstractC0122v2, i8, i6)) {
                        iZ = C0113l.Z(i8);
                        iC = iZ + 8;
                        iX2 += iC;
                    }
                    break;
                case 66:
                    if (m3.p(abstractC0122v2, i8, i6)) {
                        int iX6 = x(j3, abstractC0122v2);
                        iZ7 = C0113l.Z(i8);
                        iA = C0113l.a0((iX6 >> 31) ^ (iX6 << 1));
                        iC = iA + iZ7;
                        iX2 += iC;
                    }
                    break;
                case 67:
                    if (m3.p(abstractC0122v2, i8, i6)) {
                        long jY3 = y(j3, abstractC0122v2);
                        size2 = C0113l.Z(i8);
                        iB2 = C0113l.b0((jY3 << 1) ^ (jY3 >> 63));
                        iA1 = iB2 + size2;
                        iX2 += iA1;
                    }
                    break;
                case 68:
                    if (m3.p(abstractC0122v2, i8, i6)) {
                        iC = ((AbstractC0102a) unsafe.getObject(abstractC0122v2, j3)).a(m3.l(i6)) + (C0113l.Z(i8) * 2);
                        iX2 += iC;
                    }
                    break;
            }
            i6 += 3;
        }
    }

    public final boolean i(AbstractC0122v abstractC0122v, AbstractC0122v abstractC0122v2, int i3) {
        return m(i3, abstractC0122v) == m(i3, abstractC0122v2);
    }

    public final void j(Object obj, Object obj2, int i3) {
        int i4 = this.f1985a[i3];
        if (i0.f2065c.h(K(i3) & 1048575, obj) == null) {
            return;
        }
        k(i3);
    }

    public final void k(int i3) {
        if (this.f1986b[((i3 / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final V l(int i3) {
        int i4 = (i3 / 3) * 2;
        Object[] objArr = this.f1986b;
        V v3 = (V) objArr[i4];
        if (v3 != null) {
            return v3;
        }
        V vA = S.f2003c.a((Class) objArr[i4 + 1]);
        objArr[i4] = vA;
        return vA;
    }

    public final boolean m(int i3, Object obj) {
        int i4 = this.f1985a[i3 + 2];
        long j3 = i4 & 1048575;
        if (j3 == 1048575) {
            int iK = K(i3);
            long j4 = iK & 1048575;
            switch (J(iK)) {
                case 0:
                    if (Double.doubleToRawLongBits(i0.f2065c.d(j4, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(i0.f2065c.e(j4, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (i0.f2065c.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (i0.f2065c.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (i0.f2065c.f(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (i0.f2065c.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (i0.f2065c.f(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return i0.f2065c.c(j4, obj);
                case 8:
                    Object objH = i0.f2065c.h(j4, obj);
                    if (objH instanceof String) {
                        return !((String) objH).isEmpty();
                    }
                    if (objH instanceof C0108g) {
                        return !C0108g.f2044m.equals(objH);
                    }
                    throw new IllegalArgumentException();
                case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                    if (i0.f2065c.h(j4, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !C0108g.f2044m.equals(i0.f2065c.h(j4, obj));
                case 11:
                    if (i0.f2065c.f(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (i0.f2065c.f(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (i0.f2065c.f(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (i0.f2065c.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (i0.f2065c.f(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (i0.f2065c.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                    if (i0.f2065c.h(j4, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i4 >>> 20)) & i0.f2065c.f(j3, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean n(Object obj, int i3, int i4, int i5, int i6) {
        if (i4 == 1048575) {
            return m(i3, obj);
        }
        return (i5 & i6) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final AbstractC0122v newInstance() {
        this.f1994j.getClass();
        return ((AbstractC0122v) this.f1989e).i();
    }

    public final boolean p(Object obj, int i3, int i4) {
        return i0.f2065c.f((long) (this.f1985a[i4 + 2] & 1048575), obj) == i3;
    }

    public final void q(Object obj, int i3, Object obj2, C0115n c0115n, C0112k c0112k) throws C0125y {
        long jK = K(i3) & 1048575;
        Object objH = i0.f2065c.h(jK, obj);
        I i4 = this.f1997m;
        if (objH == null) {
            i4.getClass();
            objH = H.f1979l.b();
            i0.o(obj, jK, objH);
        } else {
            i4.getClass();
            if (!((H) objH).f1980k) {
                H hB = H.f1979l.b();
                I.a(hB, objH);
                i0.o(obj, jK, hB);
                objH = hB;
            }
        }
        i4.getClass();
        H h3 = (H) objH;
        F f3 = ((G) obj2).f1977a;
        c0112k.w(2);
        AbstractC0111j abstractC0111j = c0112k.f2073a;
        int iE = abstractC0111j.e(abstractC0111j.v());
        Object obj3 = f3.f1976c;
        Object objI = StringUtils.EMPTY;
        Object objI2 = obj3;
        while (true) {
            try {
                int iA = c0112k.a();
                if (iA == Integer.MAX_VALUE || abstractC0111j.c()) {
                    break;
                }
                if (iA == 1) {
                    objI = c0112k.i(f3.f1974a, null, null);
                } else if (iA != 2) {
                    try {
                        if (!c0112k.x()) {
                            throw new C0126z("Unable to parse map entry.");
                        }
                    } catch (C0125y unused) {
                        if (!c0112k.x()) {
                            throw new C0126z("Unable to parse map entry.");
                        }
                    }
                } else {
                    objI2 = c0112k.i(f3.f1975b, obj3.getClass(), c0115n);
                }
            } catch (Throwable th) {
                abstractC0111j.d(iE);
                throw th;
            }
        }
        h3.put(objI, objI2);
        abstractC0111j.d(iE);
    }

    public final void r(Object obj, Object obj2, int i3) {
        if (m(i3, obj2)) {
            long jK = K(i3) & 1048575;
            Unsafe unsafe = f1984o;
            Object object = unsafe.getObject(obj2, jK);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f1985a[i3] + " is present but null: " + obj2);
            }
            V vL = l(i3);
            if (!m(i3, obj)) {
                if (o(object)) {
                    AbstractC0122v abstractC0122vNewInstance = vL.newInstance();
                    vL.a(abstractC0122vNewInstance, object);
                    unsafe.putObject(obj, jK, abstractC0122vNewInstance);
                } else {
                    unsafe.putObject(obj, jK, object);
                }
                F(i3, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jK);
            if (!o(object2)) {
                AbstractC0122v abstractC0122vNewInstance2 = vL.newInstance();
                vL.a(abstractC0122vNewInstance2, object2);
                unsafe.putObject(obj, jK, abstractC0122vNewInstance2);
                object2 = abstractC0122vNewInstance2;
            }
            vL.a(object2, object);
        }
    }

    public final void s(Object obj, Object obj2, int i3) {
        int[] iArr = this.f1985a;
        int i4 = iArr[i3];
        if (p(obj2, i4, i3)) {
            long jK = K(i3) & 1048575;
            Unsafe unsafe = f1984o;
            Object object = unsafe.getObject(obj2, jK);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i3] + " is present but null: " + obj2);
            }
            V vL = l(i3);
            if (!p(obj, i4, i3)) {
                if (o(object)) {
                    AbstractC0122v abstractC0122vNewInstance = vL.newInstance();
                    vL.a(abstractC0122vNewInstance, object);
                    unsafe.putObject(obj, jK, abstractC0122vNewInstance);
                } else {
                    unsafe.putObject(obj, jK, object);
                }
                G(obj, i4, i3);
                return;
            }
            Object object2 = unsafe.getObject(obj, jK);
            if (!o(object2)) {
                AbstractC0122v abstractC0122vNewInstance2 = vL.newInstance();
                vL.a(abstractC0122vNewInstance2, object2);
                unsafe.putObject(obj, jK, abstractC0122vNewInstance2);
                object2 = abstractC0122vNewInstance2;
            }
            vL.a(object2, object);
        }
    }

    public final Object t(int i3, Object obj) {
        V vL = l(i3);
        long jK = K(i3) & 1048575;
        if (!m(i3, obj)) {
            return vL.newInstance();
        }
        Object object = f1984o.getObject(obj, jK);
        if (o(object)) {
            return object;
        }
        AbstractC0122v abstractC0122vNewInstance = vL.newInstance();
        if (object != null) {
            vL.a(abstractC0122vNewInstance, object);
        }
        return abstractC0122vNewInstance;
    }

    public final Object u(Object obj, int i3, int i4) {
        V vL = l(i4);
        if (!p(obj, i3, i4)) {
            return vL.newInstance();
        }
        Object object = f1984o.getObject(obj, K(i4) & 1048575);
        if (o(object)) {
            return object;
        }
        AbstractC0122v abstractC0122vNewInstance = vL.newInstance();
        if (object != null) {
            vL.a(abstractC0122vNewInstance, object);
        }
        return abstractC0122vNewInstance;
    }

    public final int z(int i3) {
        if (i3 >= this.f1987c && i3 <= this.f1988d) {
            int[] iArr = this.f1985a;
            int length = (iArr.length / 3) - 1;
            int i4 = 0;
            while (i4 <= length) {
                int i5 = (length + i4) >>> 1;
                int i6 = i5 * 3;
                int i7 = iArr[i6];
                if (i3 == i7) {
                    return i6;
                }
                if (i3 < i7) {
                    length = i5 - 1;
                } else {
                    i4 = i5 + 1;
                }
            }
        }
        return -1;
    }
}

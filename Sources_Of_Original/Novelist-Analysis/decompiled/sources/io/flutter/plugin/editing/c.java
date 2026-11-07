package io.flutter.plugin.editing;

import B1.s;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import org.apache.tika.utils.StringUtils;
import p052r1.n;

/* JADX INFO: loaded from: classes.dex */
public final class c extends BaseInputConnection implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f3100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A.c f3102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f3103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EditorInfo f3104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ExtractedTextRequest f3105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3106g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CursorAnchorInfo.Builder f3107h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ExtractedText f3108i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InputMethodManager f3109j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final DynamicLayout f3110k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final H0.i f3111l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final A0.j f3112m;
    public int n;

    public c(n nVar, int i3, A.c cVar, A0.j jVar, f fVar, EditorInfo editorInfo) {
        FlutterJNI flutterJNI = new FlutterJNI();
        super(nVar, true);
        this.f3106g = false;
        this.f3108i = new ExtractedText();
        this.n = 0;
        this.f3100a = nVar;
        this.f3101b = i3;
        this.f3102c = cVar;
        this.f3103d = fVar;
        fVar.a(this);
        this.f3104e = editorInfo;
        this.f3112m = jVar;
        this.f3111l = new H0.i(flutterJNI, 19);
        this.f3110k = new DynamicLayout(fVar, new TextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f3109j = (InputMethodManager) nVar.getContext().getSystemService("input_method");
    }

    @Override // io.flutter.plugin.editing.e
    public final void a(boolean z3) {
        f fVar = this.f3103d;
        fVar.getClass();
        int selectionStart = Selection.getSelectionStart(fVar);
        int selectionEnd = Selection.getSelectionEnd(fVar);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(fVar);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(fVar);
        InputMethodManager inputMethodManager = this.f3109j;
        n nVar = this.f3100a;
        inputMethodManager.updateSelection(nVar, selectionStart, selectionEnd, composingSpanStart, composingSpanEnd);
        ExtractedTextRequest extractedTextRequest = this.f3105f;
        if (extractedTextRequest != null) {
            inputMethodManager.updateExtractedText(nVar, extractedTextRequest.token, c(extractedTextRequest));
        }
        if (this.f3106g) {
            inputMethodManager.updateCursorAnchorInfo(nVar, b());
        }
    }

    public final CursorAnchorInfo b() {
        CursorAnchorInfo.Builder builder = this.f3107h;
        if (builder == null) {
            this.f3107h = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        CursorAnchorInfo.Builder builder2 = this.f3107h;
        f fVar = this.f3103d;
        fVar.getClass();
        int selectionStart = Selection.getSelectionStart(fVar);
        fVar.getClass();
        builder2.setSelectionRange(selectionStart, Selection.getSelectionEnd(fVar));
        fVar.getClass();
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(fVar);
        fVar.getClass();
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(fVar);
        if (composingSpanStart < 0 || composingSpanEnd <= composingSpanStart) {
            this.f3107h.setComposingText(-1, StringUtils.EMPTY);
        } else {
            this.f3107h.setComposingText(composingSpanStart, fVar.toString().subSequence(composingSpanStart, composingSpanEnd));
        }
        return this.f3107h.build();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        this.f3103d.b();
        this.n++;
        return super.beginBatchEdit();
    }

    public final ExtractedText c(ExtractedTextRequest extractedTextRequest) {
        ExtractedText extractedText = this.f3108i;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        CharSequence string = this.f3103d;
        string.getClass();
        extractedText.selectionStart = Selection.getSelectionStart(string);
        string.getClass();
        extractedText.selectionEnd = Selection.getSelectionEnd(string);
        if (extractedTextRequest == null || (extractedTextRequest.flags & 1) == 0) {
            string = string.toString();
        }
        extractedText.text = string;
        return extractedText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final void closeConnection() {
        super.closeConnection();
        this.f3103d.e(this);
        while (this.n > 0) {
            endBatchEdit();
            this.n--;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i3, Bundle bundle) {
        int i4;
        if (Build.VERSION.SDK_INT >= 25 && (i3 & 1) != 0) {
            try {
                inputContentInfo.requestPermission();
                if (inputContentInfo.getDescription().getMimeTypeCount() > 0) {
                    inputContentInfo.requestPermission();
                    Uri contentUri = inputContentInfo.getContentUri();
                    String mimeType = inputContentInfo.getDescription().getMimeType(0);
                    Context context = this.f3100a.getContext();
                    if (contentUri != null) {
                        try {
                            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(contentUri);
                            if (inputStreamOpenInputStream != null) {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr = new byte[65536];
                                while (true) {
                                    try {
                                        i4 = inputStreamOpenInputStream.read(bArr);
                                    } catch (IOException unused) {
                                        i4 = -1;
                                    }
                                    if (i4 == -1) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        HashMap map = new HashMap();
                                        map.put("mimeType", mimeType);
                                        map.put("data", byteArray);
                                        map.put("uri", contentUri.toString());
                                        ((s) this.f3102c.f6l).s("TextInputClient.performAction", Arrays.asList(Integer.valueOf(this.f3101b), "TextInputAction.commitContent", map), null);
                                        inputContentInfo.releasePermission();
                                        return true;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i4);
                                }
                            }
                        } catch (FileNotFoundException unused2) {
                            inputContentInfo.releasePermission();
                            return false;
                        }
                    }
                    inputContentInfo.releasePermission();
                }
            } catch (Exception unused3) {
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:179:0x02c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:196:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x01ab A[ADDED_TO_REGION, EDGE_INSN: B:205:0x01ab->B:108:0x01ab BREAK  A[LOOP:4: B:143:0x022c->B:210:?], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:75:0x0131  */
    /* JADX WARN: Code duplicated, block: B:78:0x0138 A[EDGE_INSN: B:78:0x0138->B:18:0x0040 BREAK  A[LOOP:2: B:63:0x00fb->B:200:?]] */
    /* JADX WARN: Code duplicated, block: B:79:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x0141  */
    /* JADX WARN: Code duplicated, block: B:82:0x014c  */
    /* JADX WARN: Code duplicated, block: B:88:0x016d  */
    /* JADX WARN: Code duplicated, block: B:89:0x016f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0170 A[PHI: r11 r13
      0x0170: PHI (r11v5 int) = (r11v4 int), (r11v7 int) binds: [B:79:0x013f, B:89:0x016f] A[DONT_GENERATE, DONT_INLINE]
      0x0170: PHI (r13v16 int) = (r13v14 int), (r13v18 int) binds: [B:79:0x013f, B:89:0x016f] A[DONT_GENERATE, DONT_INLINE]] */
    public final boolean d(boolean z3, boolean z4) {
        int iCharCount;
        int iCharCount2;
        int iCharCount3;
        int iCharCount4;
        int iMin;
        int iCodePointBefore;
        int iCharCount5;
        int iCharCount6;
        boolean z5;
        int iCharCount7;
        int iCodePointBefore2;
        int iCharCount8;
        int iCharCount9;
        int iCodePointBefore3;
        int i3;
        int iCharCount10;
        f fVar = this.f3103d;
        int selectionStart = Selection.getSelectionStart(fVar);
        int selectionEnd = Selection.getSelectionEnd(fVar);
        int i4 = 0;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        H0.i iVar = this.f3111l;
        if (z3) {
            FlutterJNI flutterJNI = (FlutterJNI) iVar.f443l;
            if (selectionEnd > 1 && (iCharCount6 = selectionEnd - (iCharCount5 = Character.charCount((iCodePointBefore = Character.codePointBefore(fVar, selectionEnd))))) != 0) {
                if (iCodePointBefore == 10) {
                    if (Character.codePointBefore(fVar, iCharCount6) == 13) {
                        iCharCount5++;
                    }
                } else if (flutterJNI.isCodePointRegionalIndicator(iCodePointBefore)) {
                    int iCodePointBefore4 = Character.codePointBefore(fVar, iCharCount6);
                    int iCharCount11 = iCharCount6 - Character.charCount(iCodePointBefore4);
                    int i5 = 1;
                    while (iCharCount11 > 0 && flutterJNI.isCodePointRegionalIndicator(iCodePointBefore4)) {
                        iCodePointBefore4 = Character.codePointBefore(fVar, iCharCount11);
                        iCharCount11 -= Character.charCount(iCodePointBefore4);
                        i5++;
                    }
                    if (i5 % 2 == 0) {
                        iCharCount5 += 2;
                    }
                } else if (iCodePointBefore == 8419) {
                    int iCodePointBefore5 = Character.codePointBefore(fVar, iCharCount6);
                    int iCharCount12 = iCharCount6 - Character.charCount(iCodePointBefore5);
                    if (iCharCount12 > 0 && flutterJNI.isCodePointVariantSelector(iCodePointBefore5)) {
                        int iCodePointBefore6 = Character.codePointBefore(fVar, iCharCount12);
                        if (H0.i.t(iCodePointBefore6)) {
                            iCharCount10 = Character.charCount(iCodePointBefore6) + Character.charCount(iCodePointBefore5);
                            iCharCount5 += iCharCount10;
                        }
                    } else if (H0.i.t(iCodePointBefore5)) {
                        iCharCount10 = Character.charCount(iCodePointBefore5);
                        iCharCount5 += iCharCount10;
                    }
                } else {
                    if (iCodePointBefore == 917631) {
                        int iCodePointBefore7 = Character.codePointBefore(fVar, iCharCount6);
                        iCharCount6 -= Character.charCount(iCodePointBefore7);
                        iCodePointBefore = iCodePointBefore7;
                        while (iCharCount6 > 0 && 917536 <= iCodePointBefore && iCodePointBefore <= 917630) {
                            iCharCount5 += Character.charCount(iCodePointBefore);
                            iCodePointBefore = Character.codePointBefore(fVar, iCharCount6);
                            iCharCount6 -= Character.charCount(iCodePointBefore);
                        }
                        if (flutterJNI.isCodePointEmoji(iCodePointBefore)) {
                            iCharCount5 += Character.charCount(iCodePointBefore);
                        } else {
                            i3 = selectionEnd - 2;
                        }
                    }
                    if (flutterJNI.isCodePointVariantSelector(iCodePointBefore)) {
                        iCodePointBefore = Character.codePointBefore(fVar, iCharCount6);
                        if (flutterJNI.isCodePointEmoji(iCodePointBefore)) {
                            iCharCount5 += Character.charCount(iCodePointBefore);
                            iCharCount6 -= iCharCount5;
                            if (flutterJNI.isCodePointEmoji(iCodePointBefore)) {
                                z5 = false;
                                iCharCount7 = 0;
                                do {
                                    if (z5) {
                                        iCharCount5 = Character.charCount(iCodePointBefore) + iCharCount7 + 1 + iCharCount5;
                                        z5 = false;
                                    }
                                    if (!flutterJNI.isCodePointEmojiModifier(iCodePointBefore)) {
                                        if (iCharCount6 > 0) {
                                            iCodePointBefore3 = Character.codePointBefore(fVar, iCharCount6);
                                            iCharCount6 -= Character.charCount(iCodePointBefore3);
                                            if (iCodePointBefore3 == 8205) {
                                                int iCodePointBefore8 = Character.codePointBefore(fVar, iCharCount6);
                                                iCharCount6 -= Character.charCount(iCodePointBefore8);
                                                if (iCharCount6 > 0 || !flutterJNI.isCodePointVariantSelector(iCodePointBefore8)) {
                                                    iCharCount7 = 0;
                                                } else {
                                                    iCodePointBefore8 = Character.codePointBefore(fVar, iCharCount6);
                                                    iCharCount7 = Character.charCount(iCodePointBefore8);
                                                    iCharCount6 -= Character.charCount(iCodePointBefore8);
                                                }
                                                iCodePointBefore = iCodePointBefore8;
                                                z5 = true;
                                            } else {
                                                iCodePointBefore = iCodePointBefore3;
                                                iCharCount7 = 0;
                                            }
                                        } else {
                                            iCharCount7 = 0;
                                        }
                                        if (iCharCount6 != 0 || !z5) {
                                            break;
                                        }
                                    } else {
                                        iCodePointBefore2 = Character.codePointBefore(fVar, iCharCount6);
                                        iCharCount8 = iCharCount6 - Character.charCount(iCodePointBefore2);
                                        if (iCharCount8 > 0 && flutterJNI.isCodePointVariantSelector(iCodePointBefore2)) {
                                            iCodePointBefore2 = Character.codePointBefore(fVar, iCharCount8);
                                            if (!flutterJNI.isCodePointEmoji(iCodePointBefore2)) {
                                                break;
                                            }
                                            iCharCount9 = Character.charCount(iCodePointBefore2);
                                            Character.charCount(iCodePointBefore2);
                                        } else {
                                            iCharCount9 = 0;
                                        }
                                        if (!flutterJNI.isCodePointEmojiModifierBase(iCodePointBefore2)) {
                                            break;
                                        }
                                        iCharCount5 += Character.charCount(iCodePointBefore2) + iCharCount9;
                                        break;
                                    }
                                } while (flutterJNI.isCodePointEmoji(iCodePointBefore));
                            }
                        }
                    } else if (flutterJNI.isCodePointEmoji(iCodePointBefore)) {
                        z5 = false;
                        iCharCount7 = 0;
                        do {
                            if (z5) {
                                iCharCount5 = Character.charCount(iCodePointBefore) + iCharCount7 + 1 + iCharCount5;
                                z5 = false;
                            }
                            if (!flutterJNI.isCodePointEmojiModifier(iCodePointBefore)) {
                                iCodePointBefore2 = Character.codePointBefore(fVar, iCharCount6);
                                iCharCount8 = iCharCount6 - Character.charCount(iCodePointBefore2);
                                if (iCharCount8 > 0) {
                                    iCharCount9 = 0;
                                    if (!flutterJNI.isCodePointEmojiModifierBase(iCodePointBefore2)) {
                                        break;
                                    }
                                    iCharCount5 += Character.charCount(iCodePointBefore2) + iCharCount9;
                                    break;
                                }
                                iCharCount9 = 0;
                                if (!flutterJNI.isCodePointEmojiModifierBase(iCodePointBefore2)) {
                                    break;
                                }
                                iCharCount5 += Character.charCount(iCodePointBefore2) + iCharCount9;
                                break;
                            }
                            if (iCharCount6 > 0) {
                                iCodePointBefore3 = Character.codePointBefore(fVar, iCharCount6);
                                iCharCount6 -= Character.charCount(iCodePointBefore3);
                                if (iCodePointBefore3 == 8205) {
                                    int iCodePointBefore9 = Character.codePointBefore(fVar, iCharCount6);
                                    iCharCount6 -= Character.charCount(iCodePointBefore9);
                                    if (iCharCount6 > 0) {
                                        iCharCount7 = 0;
                                    } else {
                                        iCharCount7 = 0;
                                    }
                                    iCodePointBefore = iCodePointBefore9;
                                    z5 = true;
                                } else {
                                    iCodePointBefore = iCodePointBefore3;
                                    iCharCount7 = 0;
                                }
                            } else {
                                iCharCount7 = 0;
                            }
                            if (iCharCount6 != 0) {
                                break;
                            }
                        } while (flutterJNI.isCodePointEmoji(iCodePointBefore));
                    }
                }
                i3 = selectionEnd - iCharCount5;
            } else {
                i3 = 0;
            }
            iMin = Math.max(i3, 0);
        } else {
            FlutterJNI flutterJNI2 = (FlutterJNI) iVar.f443l;
            int length = fVar.length();
            int i6 = length - 1;
            if (selectionEnd >= i6) {
                i4 = length;
            } else {
                int iCodePointAt = Character.codePointAt(fVar, selectionEnd);
                int iCharCount13 = Character.charCount(iCodePointAt);
                int i7 = selectionEnd + iCharCount13;
                if (i7 != 0) {
                    if (iCodePointAt != 10) {
                        if (!flutterJNI2.isCodePointRegionalIndicator(iCodePointAt)) {
                            if (H0.i.t(iCodePointAt)) {
                                iCharCount13 += Character.charCount(iCodePointAt);
                            }
                            if (iCodePointAt != 8419) {
                                if (flutterJNI2.isCodePointEmoji(iCodePointAt)) {
                                    boolean z6 = false;
                                    int i8 = 0;
                                    do {
                                        if (z6) {
                                            iCharCount13 = Character.charCount(iCodePointAt) + i8 + 1 + iCharCount13;
                                            z6 = false;
                                        }
                                        if (flutterJNI2.isCodePointEmojiModifier(iCodePointAt)) {
                                            break;
                                        }
                                        if (i7 < length) {
                                            int iCodePointAt2 = Character.codePointAt(fVar, i7);
                                            int iCharCount14 = Character.charCount(iCodePointAt2) + i7;
                                            if (iCodePointAt2 != 8419) {
                                                if (flutterJNI2.isCodePointEmojiModifier(iCodePointAt2)) {
                                                    iCharCount4 = Character.charCount(iCodePointAt2);
                                                } else if (flutterJNI2.isCodePointVariantSelector(iCodePointAt2)) {
                                                    iCharCount4 = Character.charCount(iCodePointAt2);
                                                } else {
                                                    if (iCodePointAt2 == 8205) {
                                                        int iCodePointAt3 = Character.codePointAt(fVar, iCharCount14);
                                                        int iCharCount15 = Character.charCount(iCodePointAt3) + iCharCount14;
                                                        if (iCharCount15 >= length || !flutterJNI2.isCodePointVariantSelector(iCodePointAt3)) {
                                                            iCodePointAt = iCodePointAt3;
                                                            i7 = iCharCount15;
                                                            z6 = true;
                                                        } else {
                                                            int iCodePointAt4 = Character.codePointAt(fVar, iCharCount15);
                                                            int iCharCount16 = Character.charCount(iCodePointAt4);
                                                            int iCharCount17 = Character.charCount(iCodePointAt4) + iCharCount15;
                                                            i8 = iCharCount16;
                                                            i7 = iCharCount17;
                                                            iCodePointAt = iCodePointAt4;
                                                            z6 = true;
                                                        }
                                                        if (i7 < length || !z6) {
                                                            break;
                                                        }
                                                    } else {
                                                        iCodePointAt = iCodePointAt2;
                                                        i7 = iCharCount14;
                                                    }
                                                    i8 = 0;
                                                    if (i7 < length) {
                                                        break;
                                                    }
                                                }
                                                iCharCount13 += iCharCount4;
                                                break;
                                            }
                                            int iCodePointBefore10 = Character.codePointBefore(fVar, iCharCount14);
                                            int iCharCount18 = Character.charCount(iCodePointBefore10) + iCharCount14;
                                            if (iCharCount18 < length && flutterJNI2.isCodePointVariantSelector(iCodePointBefore10)) {
                                                int iCodePointAt5 = Character.codePointAt(fVar, iCharCount18);
                                                if (!H0.i.t(iCodePointAt5)) {
                                                    break;
                                                }
                                                iCharCount2 = Character.charCount(iCodePointBefore10);
                                                iCharCount3 = Character.charCount(iCodePointAt5);
                                                iCharCount13 += iCharCount3 + iCharCount2;
                                                break;
                                            }
                                            if (!H0.i.t(iCodePointBefore10)) {
                                                break;
                                            }
                                            iCharCount = Character.charCount(iCodePointBefore10);
                                            iCharCount13 += iCharCount;
                                            break;
                                        }
                                        i8 = 0;
                                        if (i7 < length) {
                                            break;
                                            break;
                                        }
                                    } while (flutterJNI2.isCodePointEmoji(iCodePointAt));
                                }
                            } else {
                                int iCodePointBefore11 = Character.codePointBefore(fVar, i7);
                                int iCharCount19 = Character.charCount(iCodePointBefore11) + i7;
                                if (iCharCount19 < length && flutterJNI2.isCodePointVariantSelector(iCodePointBefore11)) {
                                    int iCodePointAt6 = Character.codePointAt(fVar, iCharCount19);
                                    if (H0.i.t(iCodePointAt6)) {
                                        iCharCount2 = Character.charCount(iCodePointBefore11);
                                        iCharCount3 = Character.charCount(iCodePointAt6);
                                        iCharCount13 += iCharCount3 + iCharCount2;
                                        break;
                                    }
                                } else if (H0.i.t(iCodePointBefore11)) {
                                    iCharCount = Character.charCount(iCodePointBefore11);
                                    iCharCount13 += iCharCount;
                                    break;
                                }
                            }
                        } else if (i7 >= i6 || !flutterJNI2.isCodePointRegionalIndicator(Character.codePointAt(fVar, i7))) {
                            i4 = i7;
                        } else {
                            int iCharCount20 = selectionEnd;
                            while (iCharCount20 > 0 && flutterJNI2.isCodePointRegionalIndicator(Character.codePointBefore(fVar, selectionEnd))) {
                                iCharCount20 -= Character.charCount(Character.codePointBefore(fVar, selectionEnd));
                                i4++;
                            }
                            if (i4 % 2 == 0) {
                                iCharCount13 += 2;
                            }
                        }
                    } else if (Character.codePointAt(fVar, i7) == 13) {
                        iCharCount13++;
                    }
                    i4 = selectionEnd + iCharCount13;
                }
            }
            iMin = Math.min(i4, fVar.length());
        }
        if (selectionStart != selectionEnd || z4) {
            setSelection(selectionStart, iMin);
            return true;
        }
        setSelection(iMin, iMin);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i3, int i4) {
        f fVar = this.f3103d;
        fVar.getClass();
        if (Selection.getSelectionStart(fVar) == -1) {
            return true;
        }
        return super.deleteSurroundingText(i3, i4);
    }

    public final boolean e(boolean z3, boolean z4) {
        f fVar = this.f3103d;
        int selectionStart = Selection.getSelectionStart(fVar);
        int selectionEnd = Selection.getSelectionEnd(fVar);
        boolean z5 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z4) {
            z5 = true;
        }
        beginBatchEdit();
        DynamicLayout dynamicLayout = this.f3110k;
        if (z5) {
            if (z3) {
                Selection.moveUp(fVar, dynamicLayout);
            } else {
                Selection.moveDown(fVar, dynamicLayout);
            }
            int selectionStart2 = Selection.getSelectionStart(fVar);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z3) {
                Selection.extendUp(fVar, dynamicLayout);
            } else {
                Selection.extendDown(fVar, dynamicLayout);
            }
            setSelection(Selection.getSelectionStart(fVar), Selection.getSelectionEnd(fVar));
        }
        endBatchEdit();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        boolean zEndBatchEdit = super.endBatchEdit();
        this.n--;
        this.f3103d.c();
        return zEndBatchEdit;
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public final Editable getEditable() {
        return this.f3103d;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i3) {
        this.f3105f = (i3 & 1) != 0 ? extractedTextRequest : null;
        return c(extractedTextRequest);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i3) {
        beginBatchEdit();
        boolean z3 = true;
        f fVar = this.f3103d;
        if (i3 == 16908319) {
            setSelection(0, fVar.length());
        } else {
            n nVar = this.f3100a;
            if (i3 == 16908320) {
                int selectionStart = Selection.getSelectionStart(fVar);
                int selectionEnd = Selection.getSelectionEnd(fVar);
                if (selectionStart != selectionEnd) {
                    int iMin = Math.min(selectionStart, selectionEnd);
                    int iMax = Math.max(selectionStart, selectionEnd);
                    ((ClipboardManager) nVar.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", fVar.subSequence(iMin, iMax)));
                    fVar.delete(iMin, iMax);
                    setSelection(iMin, iMin);
                }
            } else if (i3 == 16908321) {
                int selectionStart2 = Selection.getSelectionStart(fVar);
                int selectionEnd2 = Selection.getSelectionEnd(fVar);
                if (selectionStart2 != selectionEnd2) {
                    ((ClipboardManager) nVar.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", fVar.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
                }
            } else if (i3 == 16908322) {
                ClipData primaryClip = ((ClipboardManager) nVar.getContext().getSystemService("clipboard")).getPrimaryClip();
                if (primaryClip != null) {
                    CharSequence charSequenceCoerceToText = primaryClip.getItemAt(0).coerceToText(nVar.getContext());
                    int iMax2 = Math.max(0, Selection.getSelectionStart(fVar));
                    int iMax3 = Math.max(0, Selection.getSelectionEnd(fVar));
                    int iMin2 = Math.min(iMax2, iMax3);
                    int iMax4 = Math.max(iMax2, iMax3);
                    if (iMin2 != iMax4) {
                        fVar.delete(iMin2, iMax4);
                    }
                    fVar.insert(iMin2, charSequenceCoerceToText);
                    int length = charSequenceCoerceToText.length() + iMin2;
                    setSelection(length, length);
                }
            } else {
                z3 = false;
            }
        }
        endBatchEdit();
        return z3;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i3) {
        int i4 = this.f3101b;
        A.c cVar = this.f3102c;
        if (i3 == 0) {
            ((s) cVar.f6l).s("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.unspecified"), null);
            return true;
        }
        if (i3 == 1) {
            ((s) cVar.f6l).s("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.newline"), null);
            return true;
        }
        if (i3 == 2) {
            ((s) cVar.f6l).s("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.go"), null);
            return true;
        }
        if (i3 == 3) {
            ((s) cVar.f6l).s("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.search"), null);
            return true;
        }
        if (i3 == 4) {
            ((s) cVar.f6l).s("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.send"), null);
            return true;
        }
        if (i3 == 5) {
            ((s) cVar.f6l).s("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.next"), null);
            return true;
        }
        if (i3 != 7) {
            ((s) cVar.f6l).s("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.done"), null);
            return true;
        }
        ((s) cVar.f6l).s("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.previous"), null);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        A.c cVar = this.f3102c;
        cVar.getClass();
        HashMap map = new HashMap();
        map.put("action", str);
        if (bundle != null) {
            HashMap map2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    map2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    map2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    map2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    map2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    map2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    map2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    map2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    map2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            map.put("data", map2);
        }
        ((s) cVar.f6l).s("TextInputClient.performPrivateCommand", Arrays.asList(Integer.valueOf(this.f3101b), map), null);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i3) {
        if ((i3 & 1) != 0) {
            this.f3109j.updateCursorAnchorInfo(this.f3100a, b());
        }
        this.f3106g = (i3 & 2) != 0;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        return this.f3112m.D(keyEvent);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i3) {
        beginBatchEdit();
        boolean zCommitText = charSequence.length() == 0 ? super.commitText(charSequence, i3) : super.setComposingText(charSequence, i3);
        endBatchEdit();
        return zCommitText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setSelection(int i3, int i4) {
        beginBatchEdit();
        boolean selection = super.setSelection(i3, i4);
        endBatchEdit();
        return selection;
    }
}

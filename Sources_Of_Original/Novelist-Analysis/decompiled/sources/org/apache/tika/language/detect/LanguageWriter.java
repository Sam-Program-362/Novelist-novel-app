package org.apache.tika.language.detect;

import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public class LanguageWriter extends Writer {
    private final LanguageDetector detector;

    public LanguageWriter(LanguageDetector languageDetector) {
        this.detector = languageDetector;
        languageDetector.reset();
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    public LanguageDetector getDetector() {
        return this.detector;
    }

    public LanguageResult getLanguage() {
        return this.detector.detect();
    }

    public void reset() {
        this.detector.reset();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i3, int i4) {
        this.detector.addText(cArr, i3, i4);
    }
}

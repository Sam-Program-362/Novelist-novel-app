package org.apache.tika.language.detect;

import A.d;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.tika.config.ServiceLoader;

/* JADX INFO: loaded from: classes.dex */
public abstract class LanguageDetector {
    private static final int BUFFER_LENGTH = 4096;
    private static final ServiceLoader DEFAULT_SERVICE_LOADER = new ServiceLoader();
    protected boolean mixedLanguages = false;
    protected boolean shortText = false;

    public static LanguageDetector getDefaultLanguageDetector() {
        List<LanguageDetector> languageDetectors = getLanguageDetectors();
        if (languageDetectors.isEmpty()) {
            throw new IllegalStateException("No language detectors available");
        }
        return languageDetectors.get(0);
    }

    public static List<LanguageDetector> getLanguageDetectors() {
        return getLanguageDetectors(DEFAULT_SERVICE_LOADER);
    }

    public void addText(CharSequence charSequence) {
        int length = charSequence.length();
        if (length < BUFFER_LENGTH) {
            char[] charArray = charSequence.toString().toCharArray();
            addText(charArray, 0, charArray.length);
            return;
        }
        int i3 = 0;
        while (!hasEnoughText() && i3 < length) {
            int i4 = i3 + BUFFER_LENGTH;
            char[] charArray2 = charSequence.subSequence(i3, Math.min(i4, length)).toString().toCharArray();
            addText(charArray2, 0, charArray2.length);
            i3 = i4;
        }
    }

    public abstract void addText(char[] cArr, int i3, int i4);

    public LanguageResult detect() {
        return detectAll().get(0);
    }

    public abstract List<LanguageResult> detectAll();

    public List<LanguageResult> detectAll(String str) {
        reset();
        addText(str);
        return detectAll();
    }

    public boolean hasEnoughText() {
        return false;
    }

    public abstract boolean hasModel(String str);

    public boolean isMixedLanguages() {
        return this.mixedLanguages;
    }

    public boolean isShortText() {
        return this.shortText;
    }

    public abstract LanguageDetector loadModels();

    public abstract LanguageDetector loadModels(Set<String> set);

    public abstract void reset();

    public LanguageDetector setMixedLanguages(boolean z3) {
        this.mixedLanguages = z3;
        return this;
    }

    public abstract LanguageDetector setPriors(Map<String, Float> map);

    public LanguageDetector setShortText(boolean z3) {
        this.shortText = z3;
        return this;
    }

    public static List<LanguageDetector> getLanguageDetectors(ServiceLoader serviceLoader) {
        List<LanguageDetector> listLoadStaticServiceProviders = serviceLoader.loadStaticServiceProviders(LanguageDetector.class);
        listLoadStaticServiceProviders.sort(new d(2));
        return listLoadStaticServiceProviders;
    }

    public LanguageResult detect(CharSequence charSequence) {
        reset();
        addText(charSequence);
        return detect();
    }
}

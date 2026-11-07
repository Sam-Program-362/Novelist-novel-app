package org.apache.tika.mime;

import java.io.Serializable;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import t.AbstractC0468a;

/* loaded from: classes.dex */
class Patterns implements Serializable {
    private static final long serialVersionUID = -5778015347278111140L;
    private final MediaTypeRegistry registry;
    private final Map<String, MimeType> names = new HashMap();
    private final Map<String, MimeType> extensions = new HashMap();
    private final SortedMap<String, MimeType> globs = new TreeMap(new LengthComparator(0));
    private int minExtensionLength = Integer.MAX_VALUE;
    private int maxExtensionLength = 0;

    public static final class LengthComparator implements Comparator<String>, Serializable {
        private static final long serialVersionUID = 8468289702915532359L;

        public /* synthetic */ LengthComparator(int i3) {
            this();
        }

        private LengthComparator() {
        }

        @Override // java.util.Comparator
        public int compare(String str, String str2) {
            int length = str2.length() - str.length();
            return length == 0 ? str.compareTo(str2) : length;
        }
    }

    public Patterns(MediaTypeRegistry mediaTypeRegistry) {
        this.registry = mediaTypeRegistry;
    }

    private void addExtension(String str, MimeType mimeType) {
        MimeType mimeType2 = this.extensions.get(str);
        if (mimeType2 != null && !this.registry.isSpecializationOf(mimeType2.getType(), mimeType.getType())) {
            if (mimeType2 != mimeType && !this.registry.isSpecializationOf(mimeType.getType(), mimeType2.getType())) {
                throw new MimeTypeException(AbstractC0468a.a("Conflicting extension pattern: ", str));
            }
        } else {
            this.extensions.put(str, mimeType);
            int length = str.length();
            this.minExtensionLength = Math.min(this.minExtensionLength, length);
            this.maxExtensionLength = Math.max(this.maxExtensionLength, length);
        }
    }

    private void addGlob(String str, MimeType mimeType) {
        MimeType mimeType2 = this.globs.get(str);
        if (mimeType2 == null || this.registry.isSpecializationOf(mimeType2.getType(), mimeType.getType())) {
            this.globs.put(str, mimeType);
        } else if (mimeType2 != mimeType && !this.registry.isSpecializationOf(mimeType.getType(), mimeType2.getType())) {
            throw new MimeTypeException(AbstractC0468a.a("Conflicting glob pattern: ", str));
        }
    }

    private void addName(String str, MimeType mimeType) {
        MimeType mimeType2 = this.names.get(str);
        if (mimeType2 == null || this.registry.isSpecializationOf(mimeType2.getType(), mimeType.getType())) {
            this.names.put(str, mimeType);
        } else if (mimeType2 != mimeType && !this.registry.isSpecializationOf(mimeType.getType(), mimeType2.getType())) {
            throw new MimeTypeException(AbstractC0468a.a("Conflicting name pattern: ", str));
        }
    }

    private String compile(String str) {
        StringBuilder sb = new StringBuilder("\\A");
        for (int i3 = 0; i3 < str.length(); i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '?') {
                sb.append('.');
            } else if (charAt == '*') {
                sb.append(".*");
            } else if ("\\[]^.-$+(){}|".indexOf(charAt) != -1) {
                sb.append('\\');
                sb.append(charAt);
            } else {
                sb.append(charAt);
            }
        }
        sb.append("\\z");
        return sb.toString();
    }

    public void add(String str, MimeType mimeType) {
        add(str, false, mimeType);
    }

    public MimeType matches(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Name is missing");
        }
        if (this.names.containsKey(str)) {
            return this.names.get(str);
        }
        for (int min = Math.min(this.maxExtensionLength, str.length()); min >= this.minExtensionLength; min--) {
            String substring = str.substring(str.length() - min);
            if (this.extensions.containsKey(substring)) {
                return this.extensions.get(substring);
            }
        }
        for (Map.Entry<String, MimeType> entry : this.globs.entrySet()) {
            if (str.matches(entry.getKey())) {
                return entry.getValue();
            }
        }
        return null;
    }

    public void add(String str, boolean z3, MimeType mimeType) {
        if (str == null || mimeType == null) {
            throw new IllegalArgumentException("Pattern and/or mime type is missing");
        }
        if (z3) {
            addGlob(str, mimeType);
            return;
        }
        if (str.indexOf(42) == -1 && str.indexOf(63) == -1 && str.indexOf(91) == -1) {
            addName(str, mimeType);
            return;
        }
        if (!str.startsWith("*") || str.indexOf(42, 1) != -1 || str.indexOf(63) != -1 || str.indexOf(91) != -1) {
            addGlob(compile(str), mimeType);
            return;
        }
        String substring = str.substring(1);
        addExtension(substring, mimeType);
        mimeType.addExtension(substring);
    }
}

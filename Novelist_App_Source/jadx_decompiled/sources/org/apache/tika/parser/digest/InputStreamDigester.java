package org.apache.tika.parser.digest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import org.apache.tika.exception.TikaException;
import org.apache.tika.io.BoundedInputStream;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.HttpHeaders;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.DigestingParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.utils.StringUtils;
import t.AbstractC0468a;

/* loaded from: classes.dex */
public class InputStreamDigester implements DigestingParser.Digester {
    private final String algorithm;
    private final String algorithmKeyName;
    private final DigestingParser.Encoder encoder;
    private final int markLimit;

    public InputStreamDigester(int i3, String str, DigestingParser.Encoder encoder) {
        this(i3, str, str, encoder);
    }

    private void digestFile(File file, long j3, Metadata metadata) {
        if (StringUtils.isBlank(metadata.get(HttpHeaders.CONTENT_LENGTH))) {
            if (j3 < 0) {
                j3 = file.length();
            }
            setContentLength(j3, metadata);
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            digestStream(fileInputStream, metadata);
            fileInputStream.close();
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private boolean digestStream(InputStream inputStream, Metadata metadata) {
        MessageDigest newMessageDigest = newMessageDigest();
        updateDigest(newMessageDigest, inputStream, metadata);
        byte[] digest = newMessageDigest.digest();
        if ((inputStream instanceof BoundedInputStream) && ((BoundedInputStream) inputStream).hasHitBound()) {
            return false;
        }
        metadata.set(getMetadataKey(), this.encoder.encode(digest));
        return true;
    }

    private String getMetadataKey() {
        return AbstractC0468a.a("X-TIKA:digest:", this.algorithmKeyName);
    }

    private MessageDigest newMessageDigest() {
        try {
            Provider provider = getProvider();
            return provider == null ? MessageDigest.getInstance(this.algorithm) : MessageDigest.getInstance(this.algorithm, provider);
        } catch (NoSuchAlgorithmException e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    private static void setContentLength(long j3, Metadata metadata) {
        if (StringUtils.isBlank(metadata.get(HttpHeaders.CONTENT_LENGTH))) {
            metadata.set(HttpHeaders.CONTENT_LENGTH, Long.toString(j3));
        }
    }

    private static MessageDigest updateDigest(MessageDigest messageDigest, InputStream inputStream, Metadata metadata) {
        byte[] bArr = new byte[1024];
        int read = inputStream.read(bArr, 0, 1024);
        long j3 = 0;
        while (read > -1) {
            messageDigest.update(bArr, 0, read);
            j3 += read;
            read = inputStream.read(bArr, 0, 1024);
        }
        setContentLength(j3, metadata);
        return messageDigest;
    }

    @Override // org.apache.tika.parser.DigestingParser.Digester
    public void digest(InputStream inputStream, Metadata metadata, ParseContext parseContext) {
        TikaInputStream cast = TikaInputStream.cast(inputStream);
        if (cast != null && cast.hasFile()) {
            long length = cast.hasFile() ? cast.getLength() : -1L;
            if (length > this.markLimit) {
                digestFile(cast.getFile(), length, metadata);
                return;
            }
        }
        BoundedInputStream boundedInputStream = new BoundedInputStream(this.markLimit, inputStream);
        boundedInputStream.mark(this.markLimit + 1);
        boolean digestStream = digestStream(boundedInputStream, metadata);
        boundedInputStream.reset();
        if (digestStream) {
            return;
        }
        if (cast != null) {
            digestFile(cast.getFile(), -1L, metadata);
            return;
        }
        TemporaryResources temporaryResources = new TemporaryResources();
        try {
            digestFile(TikaInputStream.get(inputStream, temporaryResources, metadata).getFile(), -1L, metadata);
            try {
                temporaryResources.dispose();
            } catch (TikaException e3) {
                throw new IOException(e3);
            }
        } catch (Throwable th) {
            try {
                temporaryResources.dispose();
                throw th;
            } catch (TikaException e4) {
                throw new IOException(e4);
            }
        }
    }

    public Provider getProvider() {
        return null;
    }

    public InputStreamDigester(int i3, String str, String str2, DigestingParser.Encoder encoder) {
        this.algorithm = str;
        this.algorithmKeyName = str2;
        this.encoder = encoder;
        this.markLimit = i3;
        if (i3 < 0) {
            throw new IllegalArgumentException("markLimit must be >= 0");
        }
    }
}

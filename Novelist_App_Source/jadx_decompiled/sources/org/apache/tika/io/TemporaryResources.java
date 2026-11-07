package org.apache.tika.io;

import F2.d;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Iterator;
import java.util.LinkedList;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public class TemporaryResources implements Closeable {
    private static final F2.b LOG = d.b(TemporaryResources.class);
    private final LinkedList<Closeable> resources = new LinkedList<>();
    private Path tempFileDir = null;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createTempFile$0(Path path) {
        File file;
        try {
            Files.delete(path);
        } catch (IOException unused) {
            LOG.m("delete tmp file fail, will delete it on exit");
            file = path.toFile();
            file.deleteOnExit();
        }
    }

    public void addResource(Closeable closeable) {
        this.resources.addFirst(closeable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Iterator<Closeable> it2 = this.resources.iterator();
        IOException iOException = null;
        while (it2.hasNext()) {
            try {
                it2.next().close();
            } catch (IOException e3) {
                if (iOException == null) {
                    iOException = e3;
                } else {
                    iOException.addSuppressed(e3);
                }
            }
        }
        this.resources.clear();
        if (iOException != null) {
            throw iOException;
        }
    }

    public Path createTempFile(String str) {
        if (StringUtils.isBlank(str)) {
            str = ".tmp";
        }
        Path path = this.tempFileDir;
        final Path createTempFile = path == null ? Files.createTempFile("apache-tika-", str, new FileAttribute[0]) : Files.createTempFile(path, "apache-tika-", str, new FileAttribute[0]);
        addResource(new Closeable() { // from class: org.apache.tika.io.b
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                TemporaryResources.lambda$createTempFile$0(createTempFile);
            }
        });
        return createTempFile;
    }

    public File createTemporaryFile() {
        File file;
        file = createTempFile(StringUtils.EMPTY).toFile();
        return file;
    }

    public void dispose() {
        try {
            close();
        } catch (IOException e3) {
            throw new TikaException("Failed to close temporary resources", e3);
        }
    }

    public <T extends Closeable> T getResource(Class<T> cls) {
        Iterator<Closeable> it2 = this.resources.iterator();
        while (it2.hasNext()) {
            T t3 = (T) it2.next();
            if (cls.isAssignableFrom(t3.getClass())) {
                return t3;
            }
        }
        return null;
    }

    public void setTemporaryFileDirectory(Path path) {
        this.tempFileDir = path;
    }

    public void setTemporaryFileDirectory(File file) {
        this.tempFileDir = file == null ? null : file.toPath();
    }

    public Path createTempFile() {
        return createTempFile(StringUtils.EMPTY);
    }

    public Path createTempFile(Metadata metadata) {
        String str = metadata.get(TikaCoreProperties.RESOURCE_NAME_KEY);
        if (StringUtils.isBlank(str)) {
            return createTempFile(StringUtils.EMPTY);
        }
        return createTempFile(FilenameUtils.getSuffixFromPath(str));
    }
}

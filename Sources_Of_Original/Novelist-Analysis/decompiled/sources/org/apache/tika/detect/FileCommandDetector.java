package org.apache.tika.detect;

import F2.b;
import F2.d;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import org.apache.tika.config.Field;
import org.apache.tika.io.BoundedInputStream;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.ExternalProcess;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.Property;
import org.apache.tika.mime.MediaType;
import org.apache.tika.parser.external.ExternalParser;
import org.apache.tika.pipes.PipesConfigBase;
import org.apache.tika.utils.FileProcessResult;
import org.apache.tika.utils.ProcessUtils;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public class FileCommandDetector implements Detector {
    private static final String DEFAULT_FILE_COMMAND_PATH = "file";
    private static final long DEFAULT_TIMEOUT_MS = 6000;
    public static Property FILE_MIME = Property.externalText("file:mime");
    private static final b LOGGER = d.b(FileCommandDetector.class);
    private static boolean HAS_WARNED = false;
    private Boolean hasFileCommand = null;
    private String fileCommandPath = DEFAULT_FILE_COMMAND_PATH;
    private int maxBytes = 1000000;
    private long timeoutMs = DEFAULT_TIMEOUT_MS;
    private boolean useMime = false;

    public static boolean checkHasFile() {
        return checkHasFile(DEFAULT_FILE_COMMAND_PATH);
    }

    private MediaType detectOnPath(Path path, Metadata metadata) throws Throwable {
        FileProcessResult fileProcessResultExecute = ProcessUtils.execute(new ProcessBuilder(ProcessUtils.escapeCommandLine(this.fileCommandPath), "-b", "--mime-type", ProcessUtils.escapeCommandLine(path.toAbsolutePath().toString())), this.timeoutMs, PipesConfigBase.DEFAULT_MAX_FILES_PROCESSED_PER_PROCESS, PipesConfigBase.DEFAULT_MAX_FILES_PROCESSED_PER_PROCESS);
        if (fileProcessResultExecute.isTimeout()) {
            metadata.set(ExternalProcess.IS_TIMEOUT, true);
            return MediaType.OCTET_STREAM;
        }
        if (fileProcessResultExecute.getExitValue() != 0) {
            metadata.set(ExternalProcess.EXIT_VALUE, fileProcessResultExecute.getExitValue());
            return MediaType.OCTET_STREAM;
        }
        String stdout = fileProcessResultExecute.getStdout();
        if (StringUtils.isBlank(stdout)) {
            return MediaType.OCTET_STREAM;
        }
        metadata.set(FILE_MIME, stdout);
        if (!this.useMime) {
            return MediaType.OCTET_STREAM;
        }
        MediaType mediaType = MediaType.parse(stdout);
        return mediaType == null ? MediaType.OCTET_STREAM : mediaType;
    }

    @Override // org.apache.tika.detect.Detector
    public MediaType detect(InputStream inputStream, Metadata metadata) throws IOException {
        if (this.hasFileCommand == null) {
            this.hasFileCommand = Boolean.valueOf(checkHasFile(this.fileCommandPath));
        }
        if (!this.hasFileCommand.booleanValue()) {
            if (!HAS_WARNED) {
                LOGGER.m("'file' command isn't working: '" + this.fileCommandPath + "'");
                HAS_WARNED = true;
            }
            return MediaType.OCTET_STREAM;
        }
        TikaInputStream tikaInputStreamCast = TikaInputStream.cast(inputStream);
        if (tikaInputStreamCast != null) {
            return detectOnPath(tikaInputStreamCast.getPath(), metadata);
        }
        inputStream.mark(this.maxBytes);
        try {
            TemporaryResources temporaryResources = new TemporaryResources();
            try {
                Path pathCreateTempFile = temporaryResources.createTempFile(metadata);
                Files.copy(new BoundedInputStream(this.maxBytes, inputStream), pathCreateTempFile, StandardCopyOption.REPLACE_EXISTING);
                MediaType mediaTypeDetectOnPath = detectOnPath(pathCreateTempFile, metadata);
                temporaryResources.close();
                inputStream.reset();
                return mediaTypeDetectOnPath;
            } catch (Throwable th) {
                try {
                    temporaryResources.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            inputStream.reset();
            throw th3;
        }
    }

    public boolean isUseMime() {
        return this.useMime;
    }

    @Field
    public void setFilePath(String str) {
        this.fileCommandPath = str;
        checkHasFile(str);
    }

    @Field
    public void setMaxBytes(int i3) {
        this.maxBytes = i3;
    }

    @Field
    public void setTimeoutMs(long j3) {
        this.timeoutMs = j3;
    }

    @Field
    public void setUseMime(boolean z3) {
        this.useMime = z3;
    }

    public static boolean checkHasFile(String str) {
        return ExternalParser.check(new String[]{str, "-v"}, new int[0]);
    }
}

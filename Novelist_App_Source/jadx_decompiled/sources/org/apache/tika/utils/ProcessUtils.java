package org.apache.tika.utils;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import t.AbstractC0468a;

/* loaded from: classes.dex */
public class ProcessUtils {
    private static final ConcurrentHashMap<String, Process> PROCESS_MAP = new ConcurrentHashMap<>();

    static {
        Runtime.getRuntime().addShutdownHook(new Thread(new org.apache.tika.parser.a(1)));
    }

    public static String escapeCommandLine(String str) {
        return str == null ? str : (!str.contains(StringUtils.SPACE) || !SystemUtils.IS_OS_WINDOWS || str.startsWith("\"") || str.endsWith("\"")) ? str : AbstractC0468a.b("\"", str, "\"");
    }

    public static FileProcessResult execute(ProcessBuilder processBuilder, long j3, int i3, int i4) {
        String str;
        Process start;
        int i5;
        boolean waitFor;
        Process process = null;
        String str2 = null;
        try {
            start = processBuilder.start();
        } catch (Throwable th) {
            th = th;
            str = null;
        }
        try {
            str2 = register(start);
            long currentTimeMillis = System.currentTimeMillis();
            StreamGobbler streamGobbler = new StreamGobbler(start.getInputStream(), i3);
            StreamGobbler streamGobbler2 = new StreamGobbler(start.getErrorStream(), i4);
            Thread thread = new Thread(streamGobbler);
            thread.start();
            Thread thread2 = new Thread(streamGobbler2);
            thread2.start();
            long j4 = -1;
            boolean z3 = false;
            try {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                z3 = start.waitFor(j3, TimeUnit.MILLISECONDS);
                j4 = System.currentTimeMillis() - currentTimeMillis;
                if (z3) {
                    i5 = start.exitValue();
                    thread.join(1000L);
                    thread2.join(1000L);
                } else {
                    start.destroyForcibly();
                    thread.join(1000L);
                    thread2.join(1000L);
                    waitFor = start.waitFor(500L, TimeUnit.MILLISECONDS);
                    if (waitFor) {
                        try {
                            i5 = start.exitValue();
                        } catch (IllegalThreadStateException unused) {
                        }
                    }
                    i5 = -1;
                }
                thread.interrupt();
                thread2.interrupt();
            } catch (InterruptedException unused2) {
                thread.interrupt();
                thread2.interrupt();
                i5 = -1000;
            } catch (Throwable th2) {
                thread.interrupt();
                thread2.interrupt();
                throw th2;
            }
            FileProcessResult fileProcessResult = new FileProcessResult();
            fileProcessResult.processTimeMillis = j4;
            fileProcessResult.stderrLength = streamGobbler2.getStreamLength();
            fileProcessResult.stdoutLength = streamGobbler.getStreamLength();
            fileProcessResult.isTimeout = !z3;
            fileProcessResult.exitValue = i5;
            fileProcessResult.stdout = StringUtils.joinWith("\n", streamGobbler.getLines());
            fileProcessResult.stderr = StringUtils.joinWith("\n", streamGobbler2.getLines());
            fileProcessResult.stdoutTruncated = streamGobbler.getIsTruncated();
            fileProcessResult.stderrTruncated = streamGobbler2.getIsTruncated();
            start.destroyForcibly();
            if (str2 != null) {
                release(str2);
            }
            return fileProcessResult;
        } catch (Throwable th3) {
            th = th3;
            String str3 = str2;
            process = start;
            str = str3;
            if (process != null) {
                process.destroyForcibly();
            }
            if (str != null) {
                release(str);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0() {
        PROCESS_MAP.forEachValue(1L, new org.apache.tika.mime.a(2));
    }

    private static String register(Process process) {
        String uuid = UUID.randomUUID().toString();
        PROCESS_MAP.put(uuid, process);
        return uuid;
    }

    private static Process release(String str) {
        return PROCESS_MAP.remove(str);
    }

    public static String unescapeCommandLine(String str) {
        return (str.contains(StringUtils.SPACE) && SystemUtils.IS_OS_WINDOWS && str.startsWith("\"") && str.endsWith("\"")) ? str.substring(1, str.length() - 1) : str;
    }

    public static FileProcessResult execute(ProcessBuilder processBuilder, long j3, Path path, int i3) {
        Path parent;
        boolean isDirectory;
        File file;
        String str;
        boolean z3;
        int i4;
        long size;
        Path parent2;
        parent = path.getParent();
        isDirectory = Files.isDirectory(parent, new LinkOption[0]);
        if (!isDirectory) {
            parent2 = path.getParent();
            Files.createDirectories(parent2, new FileAttribute[0]);
        }
        file = path.toFile();
        processBuilder.redirectOutput(file);
        Process process = null;
        String str2 = null;
        try {
            Process start = processBuilder.start();
            try {
                str2 = register(start);
                long currentTimeMillis = System.currentTimeMillis();
                StreamGobbler streamGobbler = new StreamGobbler(start.getErrorStream(), i3);
                Thread thread = new Thread(streamGobbler);
                thread.start();
                long j4 = -1;
                try {
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    z3 = start.waitFor(j3, TimeUnit.MILLISECONDS);
                    try {
                        j4 = System.currentTimeMillis() - currentTimeMillis;
                        if (!z3) {
                            start.destroyForcibly();
                            thread.join(1000L);
                            i4 = -1;
                        } else {
                            i4 = start.exitValue();
                            thread.join(1000L);
                        }
                    } catch (InterruptedException unused) {
                        i4 = -1000;
                        FileProcessResult fileProcessResult = new FileProcessResult();
                        fileProcessResult.processTimeMillis = j4;
                        fileProcessResult.stderrLength = streamGobbler.getStreamLength();
                        size = Files.size(path);
                        fileProcessResult.stdoutLength = size;
                        fileProcessResult.isTimeout = !z3;
                        fileProcessResult.exitValue = i4;
                        fileProcessResult.stdout = StringUtils.EMPTY;
                        fileProcessResult.stderr = StringUtils.joinWith("\n", streamGobbler.getLines());
                        fileProcessResult.stdoutTruncated = false;
                        fileProcessResult.stderrTruncated = streamGobbler.getIsTruncated();
                        start.destroyForcibly();
                        release(str2);
                        return fileProcessResult;
                    }
                } catch (InterruptedException unused2) {
                    z3 = false;
                }
                FileProcessResult fileProcessResult2 = new FileProcessResult();
                fileProcessResult2.processTimeMillis = j4;
                fileProcessResult2.stderrLength = streamGobbler.getStreamLength();
                size = Files.size(path);
                fileProcessResult2.stdoutLength = size;
                fileProcessResult2.isTimeout = !z3;
                fileProcessResult2.exitValue = i4;
                fileProcessResult2.stdout = StringUtils.EMPTY;
                fileProcessResult2.stderr = StringUtils.joinWith("\n", streamGobbler.getLines());
                fileProcessResult2.stdoutTruncated = false;
                fileProcessResult2.stderrTruncated = streamGobbler.getIsTruncated();
                start.destroyForcibly();
                release(str2);
                return fileProcessResult2;
            } catch (Throwable th) {
                th = th;
                String str3 = str2;
                process = start;
                str = str3;
                if (process != null) {
                    process.destroyForcibly();
                }
                release(str);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            str = null;
        }
    }
}

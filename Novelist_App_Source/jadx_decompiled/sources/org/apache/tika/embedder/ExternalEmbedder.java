package org.apache.tika.embedder;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.IntFunction;
import org.apache.tika.embedder.ExternalEmbedder;
import org.apache.tika.exception.TikaException;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.Property;
import org.apache.tika.mime.MediaType;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.external.ExternalParser;
import org.apache.tika.utils.StringUtils;
import s2.c;
import t.AbstractC0468a;
import w2.e;

/* loaded from: classes.dex */
public class ExternalEmbedder implements Embedder {
    public static final String METADATA_COMMAND_ARGUMENTS_SERIALIZED_TOKEN = "${METADATA_SERIALIZED}";
    public static final String METADATA_COMMAND_ARGUMENTS_TOKEN = "${METADATA}";
    private static final long serialVersionUID = -2828829275642475697L;
    private final TemporaryResources tmp = new TemporaryResources();
    private Set<MediaType> supportedEmbedTypes = Collections.EMPTY_SET;
    private Map<Property, String[]> metadataCommandArguments = null;
    private String[] command = {"sed", "-e", "$a\\\n${METADATA_SERIALIZED}", ExternalParser.INPUT_FILE_TOKEN};
    private String commandAssignmentOperator = "=";
    private String commandAssignmentDelimeter = ", ";
    private String commandAppendOperator = "=";
    private boolean quoteAssignmentValues = false;

    public static boolean check(String str, int... iArr) {
        return check(new String[]{str}, iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] lambda$embed$0(int i3) {
        return new String[i3];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] lambda$embed$1(int i3) {
        return new String[i3];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$multiThreadedStreamCopy$2(InputStream inputStream, OutputStream outputStream) {
        try {
            c.b(inputStream, outputStream);
        } catch (IOException e3) {
            System.out.println("ERROR: " + e3.getMessage());
        }
    }

    private void multiThreadedStreamCopy(InputStream inputStream, OutputStream outputStream) {
        new Thread(new M.c(inputStream, outputStream, 20)).start();
    }

    private void sendInputStreamToStdIn(InputStream inputStream, Process process) {
        multiThreadedStreamCopy(inputStream, process.getOutputStream());
    }

    private void sendStdErrToOutputStream(Process process, OutputStream outputStream) {
        multiThreadedStreamCopy(process.getErrorStream(), outputStream);
    }

    private void sendStdOutToOutputStream(Process process, OutputStream outputStream) {
        try {
            c.b(process.getInputStream(), outputStream);
        } catch (IOException e3) {
            System.out.println("ERROR: " + e3.getMessage());
        }
    }

    public static String serializeMetadata(List<String> list) {
        return list != null ? Arrays.toString(list.toArray()) : StringUtils.EMPTY;
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [z2.a] */
    /* JADX WARN: Type inference failed for: r6v0, types: [z2.a] */
    @Override // org.apache.tika.embedder.Embedder
    public void embed(Metadata metadata, InputStream inputStream, OutputStream outputStream, ParseContext parseContext) {
        Object[] array;
        Process exec;
        Path path;
        Object[] array2;
        TikaInputStream tikaInputStream;
        Map<Property, String[]> map = this.metadataCommandArguments;
        boolean z3 = (map == null || map.isEmpty()) ? false : true;
        TikaInputStream tikaInputStream2 = TikaInputStream.get(inputStream);
        File file = null;
        List<String> commandMetadataSegments = z3 ? getCommandMetadataSegments(metadata) : null;
        String[] strArr = this.command;
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i3 = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = true;
        boolean z7 = true;
        while (i3 < length) {
            String str = strArr[i3];
            boolean z8 = z3;
            if (str.contains(ExternalParser.INPUT_FILE_TOKEN)) {
                tikaInputStream = tikaInputStream2;
                str = str.replace(ExternalParser.INPUT_FILE_TOKEN, tikaInputStream2.getFile().toString());
                z6 = false;
            } else {
                tikaInputStream = tikaInputStream2;
            }
            if (str.contains(ExternalParser.OUTPUT_FILE_TOKEN)) {
                File createTemporaryFile = this.tmp.createTemporaryFile();
                str = str.replace(ExternalParser.OUTPUT_FILE_TOKEN, createTemporaryFile.toString());
                file = createTemporaryFile;
                z7 = false;
            }
            if (str.contains(METADATA_COMMAND_ARGUMENTS_SERIALIZED_TOKEN)) {
                z4 = true;
            }
            if (str.contains(METADATA_COMMAND_ARGUMENTS_TOKEN)) {
                if (z8) {
                    arrayList.addAll(commandMetadataSegments);
                }
                z5 = true;
            } else {
                arrayList.add(str);
            }
            i3++;
            z3 = z8;
            tikaInputStream2 = tikaInputStream;
        }
        TikaInputStream tikaInputStream3 = tikaInputStream2;
        if (z3) {
            if (z4) {
                int size = arrayList.size();
                int i4 = 0;
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList.get(i5);
                    i5++;
                    String str2 = (String) obj;
                    if (str2.contains(METADATA_COMMAND_ARGUMENTS_SERIALIZED_TOKEN)) {
                        arrayList.set(i4, str2.replace(METADATA_COMMAND_ARGUMENTS_SERIALIZED_TOKEN, serializeMetadata(commandMetadataSegments)));
                    }
                    i4++;
                }
            } else if (!z5 && !z4) {
                arrayList.addAll(commandMetadataSegments);
            }
        }
        final int i6 = 1;
        if (arrayList.toArray().length == 1) {
            Runtime runtime = Runtime.getRuntime();
            final int i7 = 0;
            array2 = arrayList.toArray((IntFunction) new IntFunction() { // from class: z2.a
                @Override // java.util.function.IntFunction
                public final Object apply(int i8) {
                    String[] lambda$embed$0;
                    String[] lambda$embed$1;
                    switch (i7) {
                        case 0:
                            lambda$embed$0 = ExternalEmbedder.lambda$embed$0(i8);
                            return lambda$embed$0;
                        default:
                            lambda$embed$1 = ExternalEmbedder.lambda$embed$1(i8);
                            return lambda$embed$1;
                    }
                }
            });
            exec = runtime.exec(((String[]) array2)[0]);
        } else {
            Runtime runtime2 = Runtime.getRuntime();
            array = arrayList.toArray((IntFunction) new IntFunction() { // from class: z2.a
                @Override // java.util.function.IntFunction
                public final Object apply(int i8) {
                    String[] lambda$embed$0;
                    String[] lambda$embed$1;
                    switch (i6) {
                        case 0:
                            lambda$embed$0 = ExternalEmbedder.lambda$embed$0(i8);
                            return lambda$embed$0;
                        default:
                            lambda$embed$1 = ExternalEmbedder.lambda$embed$1(i8);
                            return lambda$embed$1;
                    }
                }
            });
            exec = runtime2.exec((String[]) array);
        }
        Process process = exec;
        int i8 = x2.c.f4723p;
        x2.c cVar = new x2.c(new e());
        try {
            sendStdErrToOutputStream(process, cVar);
            if (z6) {
                sendInputStreamToStdIn(inputStream, process);
            } else {
                process.getOutputStream().close();
            }
            if (z7) {
                sendStdOutToOutputStream(process, outputStream);
            } else {
                this.tmp.dispose();
                try {
                    process.waitFor();
                } catch (InterruptedException unused) {
                }
                path = file.toPath();
                c.b(TikaInputStream.get(path), outputStream);
            }
            if (z7) {
                try {
                    process.waitFor();
                } catch (InterruptedException | Exception unused2) {
                }
            } else {
                file.delete();
            }
            if (!z6) {
                c.a(tikaInputStream3);
            }
            c.a(outputStream);
            c.a(cVar);
            if (process.exitValue() == 0) {
            } else {
                throw new TikaException(B1.e.k("There was an error executing the command line\nExecutable Command:\n\n", String.valueOf(arrayList), "\nExecutable Error:\n\n", new String(cVar.b(), StandardCharsets.UTF_8.name())));
            }
        } catch (Throwable th) {
            if (z7) {
                try {
                    process.waitFor();
                } catch (InterruptedException | Exception unused3) {
                }
            } else {
                file.delete();
            }
            if (!z6) {
                c.a(tikaInputStream3);
            }
            c.a(outputStream);
            c.a(cVar);
            if (process.exitValue() == 0) {
                throw th;
            }
            throw new TikaException(B1.e.k("There was an error executing the command line\nExecutable Command:\n\n", String.valueOf(arrayList), "\nExecutable Error:\n\n", new String(cVar.b(), StandardCharsets.UTF_8.name())));
        }
    }

    public String[] getCommand() {
        return this.command;
    }

    public String getCommandAppendOperator() {
        return this.commandAppendOperator;
    }

    public String getCommandAssignmentDelimeter() {
        return this.commandAssignmentDelimeter;
    }

    public String getCommandAssignmentOperator() {
        return this.commandAssignmentOperator;
    }

    public List<String> getCommandMetadataSegments(Metadata metadata) {
        String[] strArr;
        String[] strArr2;
        int i3;
        ArrayList arrayList = new ArrayList();
        if (metadata != null && metadata.names() != null) {
            String[] names = metadata.names();
            int length = names.length;
            for (int i4 = 0; i4 < length; i4++) {
                String str = names[i4];
                for (Property property : getMetadataCommandArguments().keySet()) {
                    if (str.equals(property.getName()) && (strArr = getMetadataCommandArguments().get(property)) != null) {
                        int length2 = strArr.length;
                        int i5 = 0;
                        while (i5 < length2) {
                            String str2 = strArr[i5];
                            if (metadata.isMultiValued(str)) {
                                String[] values = metadata.getValues(str);
                                int length3 = values.length;
                                int i6 = 0;
                                while (true) {
                                    strArr2 = names;
                                    if (i6 >= length3) {
                                        break;
                                    }
                                    String str3 = values[i6];
                                    int i7 = length;
                                    if (this.quoteAssignmentValues) {
                                        str3 = AbstractC0468a.b("'", str3, "'");
                                    }
                                    arrayList.add(str2 + this.commandAppendOperator + str3);
                                    i6++;
                                    names = strArr2;
                                    length = i7;
                                }
                                i3 = length;
                            } else {
                                strArr2 = names;
                                i3 = length;
                                String str4 = metadata.get(str);
                                if (this.quoteAssignmentValues) {
                                    str4 = AbstractC0468a.b("'", str4, "'");
                                }
                                arrayList.add(str2 + this.commandAssignmentOperator + str4);
                            }
                            i5++;
                            names = strArr2;
                            length = i3;
                        }
                    }
                    names = names;
                    length = length;
                }
            }
        }
        return arrayList;
    }

    public Map<Property, String[]> getMetadataCommandArguments() {
        return this.metadataCommandArguments;
    }

    @Override // org.apache.tika.embedder.Embedder
    public Set<MediaType> getSupportedEmbedTypes(ParseContext parseContext) {
        return getSupportedEmbedTypes();
    }

    public boolean isQuoteAssignmentValues() {
        return this.quoteAssignmentValues;
    }

    public void setCommand(String... strArr) {
        this.command = strArr;
    }

    public void setCommandAppendOperator(String str) {
        this.commandAppendOperator = str;
    }

    public void setCommandAssignmentDelimeter(String str) {
        this.commandAssignmentDelimeter = str;
    }

    public void setCommandAssignmentOperator(String str) {
        this.commandAssignmentOperator = str;
    }

    public void setMetadataCommandArguments(Map<Property, String[]> map) {
        this.metadataCommandArguments = map;
    }

    public void setQuoteAssignmentValues(boolean z3) {
        this.quoteAssignmentValues = z3;
    }

    public void setSupportedEmbedTypes(Set<MediaType> set) {
        this.supportedEmbedTypes = Collections.unmodifiableSet(new HashSet(set));
    }

    public static boolean check(String[] strArr, int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{127};
        }
        try {
            int waitFor = (strArr.length == 1 ? Runtime.getRuntime().exec(strArr[0]) : Runtime.getRuntime().exec(strArr)).waitFor();
            for (int i3 : iArr) {
                if (waitFor == i3) {
                    return false;
                }
            }
            return true;
        } catch (IOException | InterruptedException unused) {
            return false;
        }
    }

    public Set<MediaType> getSupportedEmbedTypes() {
        return this.supportedEmbedTypes;
    }
}

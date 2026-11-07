package org.apache.tika.parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import org.apache.tika.config.TikaConfig;

/* JADX INFO: loaded from: classes.dex */
public class AutoDetectParserFactory extends ParserFactory {
    public static final String TIKA_CONFIG_PATH = "tika_config_path";

    public AutoDetectParserFactory(Map<String, String> map) {
        super(map);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    @Override // org.apache.tika.parser.ParserFactory
    public Parser build() throws IOException {
        TikaConfig defaultConfig;
        String strRemove = this.args.remove(TIKA_CONFIG_PATH);
        if (strRemove == null) {
            defaultConfig = null;
        } else if (Files.isReadable(Paths.get(strRemove, new String[0]))) {
            defaultConfig = new TikaConfig(Paths.get(strRemove, new String[0]));
        } else if (getClass().getResource(strRemove) != null) {
            InputStream resourceAsStream = getClass().getResourceAsStream(strRemove);
            try {
                defaultConfig = new TikaConfig(resourceAsStream);
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                }
            } catch (Throwable th) {
                if (resourceAsStream != null) {
                    try {
                        resourceAsStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } else {
            defaultConfig = null;
        }
        if (defaultConfig == null) {
            defaultConfig = TikaConfig.getDefaultConfig();
        }
        return new AutoDetectParser(defaultConfig);
    }
}

package org.apache.tika.pipes.fetcher;

import B1.e;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.tika.config.ConfigBase;
import org.apache.tika.exception.TikaConfigException;
import p055t.a;

/* JADX INFO: loaded from: classes.dex */
public class FetcherManager extends ConfigBase {
    private final Map<String, Fetcher> fetcherMap = new ConcurrentHashMap();

    public FetcherManager(List<Fetcher> list) throws TikaConfigException {
        for (Fetcher fetcher : list) {
            String name = fetcher.getName();
            if (name != null) {
                int length = name.length();
                int iCharCount = 0;
                while (true) {
                    if (iCharCount < length) {
                        int iCodePointAt = name.codePointAt(iCharCount);
                        if (!Character.isWhitespace(iCodePointAt)) {
                            break;
                        } else {
                            iCharCount += Character.charCount(iCodePointAt);
                        }
                    }
                }
                if (this.fetcherMap.containsKey(fetcher.getName())) {
                    throw new TikaConfigException(a.a("Multiple fetchers cannot support the same prefix: ", fetcher.getName()));
                }
                this.fetcherMap.put(fetcher.getName(), fetcher);
            }
            throw new TikaConfigException("fetcher name must not be blank");
        }
    }

    public static FetcherManager load(Path path) throws IOException {
        InputStream inputStreamNewInputStream = Files.newInputStream(path, new OpenOption[0]);
        try {
            FetcherManager fetcherManager = (FetcherManager) ConfigBase.buildComposite("fetchers", FetcherManager.class, "fetcher", Fetcher.class, inputStreamNewInputStream);
            if (inputStreamNewInputStream != null) {
                inputStreamNewInputStream.close();
            }
            return fetcherManager;
        } catch (Throwable th) {
            if (inputStreamNewInputStream != null) {
                try {
                    inputStreamNewInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public Fetcher getFetcher(String str) {
        Fetcher fetcher = this.fetcherMap.get(str);
        if (fetcher != null) {
            return fetcher;
        }
        throw new IllegalArgumentException(e.k("Can't find fetcher for fetcherName: ", str, ". I've loaded: ", String.valueOf(this.fetcherMap.keySet())));
    }

    public Set<String> getSupported() {
        return this.fetcherMap.keySet();
    }

    public Fetcher getFetcher() {
        if (this.fetcherMap.size() != 0) {
            if (this.fetcherMap.size() <= 1) {
                Iterator<Fetcher> it2 = this.fetcherMap.values().iterator();
                if (it2.hasNext()) {
                    return it2.next();
                }
                throw new IllegalArgumentException("fetchers size must == 0");
            }
            throw new IllegalArgumentException("need to specify 'fetcherName' if > 1 fetchers are available");
        }
        throw new IllegalArgumentException("fetchers size must == 1 for the no arg call");
    }
}

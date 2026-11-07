package org.apache.tika.pipes.emitter;

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
import p055t.a;

/* JADX INFO: loaded from: classes.dex */
public class EmitterManager extends ConfigBase {
    private final Map<String, Emitter> emitterMap = new ConcurrentHashMap();

    private EmitterManager() {
    }

    public static EmitterManager load(Path path) {
        InputStream inputStreamNewInputStream = Files.newInputStream(path, new OpenOption[0]);
        try {
            EmitterManager emitterManager = (EmitterManager) ConfigBase.buildComposite("emitters", EmitterManager.class, "emitter", Emitter.class, inputStreamNewInputStream);
            if (inputStreamNewInputStream != null) {
                inputStreamNewInputStream.close();
            }
            return emitterManager;
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

    public Emitter getEmitter(String str) {
        Emitter emitter = this.emitterMap.get(str);
        if (emitter != null) {
            return emitter;
        }
        throw new IllegalArgumentException(a.a("Can't find emitter for prefix: ", str));
    }

    public Set<String> getSupported() {
        return this.emitterMap.keySet();
    }

    public EmitterManager(List<Emitter> list) {
        for (Emitter emitter : list) {
            if (!this.emitterMap.containsKey(emitter.getName())) {
                this.emitterMap.put(emitter.getName(), emitter);
            } else {
                throw new IllegalArgumentException(a.a("Multiple emitters cannot support the same name: ", emitter.getName()));
            }
        }
    }

    public Emitter getEmitter() {
        if (this.emitterMap.size() != 0) {
            if (this.emitterMap.size() <= 1) {
                Iterator<Emitter> it2 = this.emitterMap.values().iterator();
                if (it2.hasNext()) {
                    return it2.next();
                }
                throw new IllegalArgumentException("emitters size must == 0");
            }
            throw new IllegalArgumentException("need to specify 'emitterName' if > 1 emitters are available");
        }
        throw new IllegalArgumentException("emitters size must == 1 for the no arg call");
    }
}

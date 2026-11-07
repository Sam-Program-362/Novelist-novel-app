package org.apache.tika.pipes.async;

import F2.d;
import java.io.IOException;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.apache.tika.pipes.emitter.EmitData;
import org.apache.tika.pipes.emitter.Emitter;
import org.apache.tika.pipes.emitter.EmitterManager;
import org.apache.tika.pipes.emitter.TikaEmitterException;
import org.apache.tika.utils.ExceptionUtils;

/* loaded from: classes.dex */
public class AsyncEmitter implements Callable<Integer> {
    static final int EMITTER_FUTURE_CODE = 2;
    static final EmitData EMIT_DATA_STOP_SEMAPHORE = new EmitData(null, null, null);
    private static final F2.b LOG = d.b(AsyncEmitter.class);
    private final AsyncConfig asyncConfig;
    private final ArrayBlockingQueue<EmitData> emitDataQueue;
    private final EmitterManager emitterManager;
    Instant lastEmitted;

    public class EmitDataCache {
        private final long maxBytes;
        long estimatedSize = 0;
        int size = 0;
        Map<String, List<EmitData>> map = new HashMap();

        public EmitDataCache(long j3) {
            this.maxBytes = j3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void emitAll() {
            Instant now;
            AsyncEmitter.LOG.w(Integer.valueOf(this.size), Long.valueOf(this.estimatedSize), "about to emit {} files, {} estimated bytes");
            int i3 = 0;
            for (Map.Entry<String, List<EmitData>> entry : this.map.entrySet()) {
                tryToEmit(AsyncEmitter.this.emitterManager.getEmitter(entry.getKey()), entry.getValue());
                i3 += entry.getValue().size();
            }
            AsyncEmitter.LOG.s(Integer.valueOf(i3), "emitted: {} files");
            this.estimatedSize = 0L;
            this.size = 0;
            this.map.clear();
            AsyncEmitter asyncEmitter = AsyncEmitter.this;
            now = Instant.now();
            asyncEmitter.lastEmitted = now;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ List lambda$add$0(String str) {
            return new ArrayList();
        }

        private void tryToEmit(Emitter emitter, List<EmitData> list) {
            try {
                emitter.emit(list);
            } catch (IOException | TikaEmitterException e3) {
                AsyncEmitter.LOG.r(emitter.getClass(), ExceptionUtils.getStackTrace(e3), "emitter class ({}): {}");
            }
        }

        public void add(EmitData emitData) {
            this.size++;
            long estimatedSizeBytes = emitData.getEstimatedSizeBytes();
            if (this.estimatedSize + estimatedSizeBytes > this.maxBytes) {
                AsyncEmitter.LOG.w(Long.valueOf(this.estimatedSize + estimatedSizeBytes), Long.valueOf(this.maxBytes), "estimated size ({}) > maxBytes({}), going to emitAll");
                emitAll();
            }
            List<EmitData> computeIfAbsent = this.map.computeIfAbsent(emitData.getEmitKey().getEmitterName(), new a());
            updateEstimatedSize(estimatedSizeBytes);
            computeIfAbsent.add(emitData);
        }

        public void updateEstimatedSize(long j3) {
            this.estimatedSize += j3;
        }
    }

    public AsyncEmitter(AsyncConfig asyncConfig, ArrayBlockingQueue<EmitData> arrayBlockingQueue, EmitterManager emitterManager) {
        Instant now;
        now = Instant.now();
        this.lastEmitted = now;
        this.asyncConfig = asyncConfig;
        this.emitDataQueue = arrayBlockingQueue;
        this.emitterManager = emitterManager;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.concurrent.Callable
    public Integer call() {
        Instant now;
        long between;
        ChronoUnit unused;
        EmitDataCache emitDataCache = new EmitDataCache(this.asyncConfig.getEmitMaxEstimatedBytes());
        while (true) {
            EmitData poll = this.emitDataQueue.poll(500L, TimeUnit.MILLISECONDS);
            if (poll == EMIT_DATA_STOP_SEMAPHORE) {
                emitDataCache.emitAll();
                return 2;
            }
            if (poll != null) {
                emitDataCache.add(poll);
            } else {
                LOG.n("Nothing on the async queue");
            }
            F2.b bVar = LOG;
            bVar.w(Long.valueOf(emitDataCache.estimatedSize), Integer.valueOf(emitDataCache.size), "cache size: ({}) bytes and extract count: {}");
            unused = ChronoUnit.MILLIS;
            Instant instant = this.lastEmitted;
            now = Instant.now();
            between = ChronoUnit.MILLIS.between(instant, now);
            if (between > this.asyncConfig.getEmitWithinMillis()) {
                bVar.w(Long.valueOf(between), Long.valueOf(this.asyncConfig.getEmitWithinMillis()), "{} elapsed > {}, going to emitAll");
                emitDataCache.emitAll();
            }
        }
    }
}

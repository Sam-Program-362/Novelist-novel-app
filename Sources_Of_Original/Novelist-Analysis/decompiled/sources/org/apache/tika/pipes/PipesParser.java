package org.apache.tika.pipes;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class PipesParser implements Closeable {
    private final ArrayBlockingQueue<PipesClient> clientQueue;
    private final List<PipesClient> clients = new ArrayList();
    private final PipesConfig pipesConfig;

    public PipesParser(PipesConfig pipesConfig) {
        this.pipesConfig = pipesConfig;
        this.clientQueue = new ArrayBlockingQueue<>(pipesConfig.getNumClients());
        for (int i3 = 0; i3 < pipesConfig.getNumClients(); i3++) {
            PipesClient pipesClient = new PipesClient(pipesConfig);
            this.clientQueue.offer(pipesClient);
            this.clients.add(pipesClient);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ArrayList arrayList = new ArrayList();
        Iterator<PipesClient> it2 = this.clients.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().close();
            } catch (IOException e3) {
                arrayList.add(e3);
            }
        }
        if (arrayList.size() > 0) {
            throw ((IOException) arrayList.get(0));
        }
    }

    public PipesResult parse(FetchEmitTuple fetchEmitTuple) throws Throwable {
        PipesResult pipesResultProcess;
        PipesClient pipesClient = null;
        try {
            PipesClient pipesClientPoll = this.clientQueue.poll(this.pipesConfig.getMaxWaitForClientMillis(), TimeUnit.MILLISECONDS);
            try {
                if (pipesClientPoll == null) {
                    pipesResultProcess = PipesResult.CLIENT_UNAVAILABLE_WITHIN_MS;
                    if (pipesClientPoll != null) {
                    }
                    return pipesResultProcess;
                }
                pipesResultProcess = pipesClientPoll.process(fetchEmitTuple);
                this.clientQueue.offer(pipesClientPoll);
                return pipesResultProcess;
            } catch (Throwable th) {
                th = th;
                pipesClient = pipesClientPoll;
                if (pipesClient != null) {
                    this.clientQueue.offer(pipesClient);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}

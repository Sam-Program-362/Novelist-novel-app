package org.apache.tika.pipes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.tika.config.Field;
import org.apache.tika.config.Initializable;
import org.apache.tika.config.InitializableProblemHandler;
import org.apache.tika.config.Param;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.pipes.pipesiterator.TotalCountResult;

/* loaded from: classes.dex */
public class CompositePipesReporter extends PipesReporter implements Initializable {
    private List<PipesReporter> pipesReporters = new ArrayList();

    @Field
    public void addPipesReporter(PipesReporter pipesReporter) {
        this.pipesReporters.add(pipesReporter);
    }

    @Override // org.apache.tika.config.Initializable
    public void checkInitialization(InitializableProblemHandler initializableProblemHandler) {
        List<PipesReporter> list = this.pipesReporters;
        if (list == null) {
            throw new TikaConfigException("must specify 'pipesReporters'");
        }
        if (list.size() == 0) {
            throw new TikaConfigException("must specify at least one pipes reporter");
        }
    }

    @Override // org.apache.tika.pipes.PipesReporter, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Iterator<PipesReporter> it2 = this.pipesReporters.iterator();
        IOException e3 = null;
        while (it2.hasNext()) {
            try {
                it2.next().close();
            } catch (IOException e4) {
                e3 = e4;
            }
        }
        if (e3 != null) {
            throw e3;
        }
    }

    @Override // org.apache.tika.pipes.PipesReporter
    public void error(Throwable th) {
        Iterator<PipesReporter> it2 = this.pipesReporters.iterator();
        while (it2.hasNext()) {
            it2.next().error(th);
        }
    }

    public List<PipesReporter> getPipesReporters() {
        return this.pipesReporters;
    }

    @Override // org.apache.tika.config.Initializable
    public void initialize(Map<String, Param> map) {
    }

    @Override // org.apache.tika.pipes.PipesReporter
    public void report(FetchEmitTuple fetchEmitTuple, PipesResult pipesResult, long j3) {
        Iterator<PipesReporter> it2 = this.pipesReporters.iterator();
        while (it2.hasNext()) {
            it2.next().report(fetchEmitTuple, pipesResult, j3);
        }
    }

    @Override // org.apache.tika.pipes.PipesReporter
    public boolean supportsTotalCount() {
        Iterator<PipesReporter> it2 = this.pipesReporters.iterator();
        while (it2.hasNext()) {
            if (it2.next().supportsTotalCount()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.tika.pipes.PipesReporter
    public void error(String str) {
        Iterator<PipesReporter> it2 = this.pipesReporters.iterator();
        while (it2.hasNext()) {
            it2.next().error(str);
        }
    }

    @Override // org.apache.tika.pipes.PipesReporter
    public void report(TotalCountResult totalCountResult) {
        Iterator<PipesReporter> it2 = this.pipesReporters.iterator();
        while (it2.hasNext()) {
            it2.next().report(totalCountResult);
        }
    }
}

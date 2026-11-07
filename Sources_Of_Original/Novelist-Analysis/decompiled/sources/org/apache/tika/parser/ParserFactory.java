package org.apache.tika.parser;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class ParserFactory {
    final Map<String, String> args;

    public ParserFactory(Map<String, String> map) {
        this.args = map;
    }

    public abstract Parser build();
}

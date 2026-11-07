package org.apache.tika.parser;

import org.apache.tika.metadata.Metadata;

/* JADX INFO: loaded from: classes.dex */
public interface PasswordProvider {
    String getPassword(Metadata metadata);
}

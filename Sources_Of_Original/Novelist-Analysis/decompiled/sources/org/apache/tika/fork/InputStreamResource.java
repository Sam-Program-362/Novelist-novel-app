package org.apache.tika.fork;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
class InputStreamResource implements ForkResource {
    private final InputStream stream;

    public InputStreamResource(InputStream inputStream) {
        this.stream = inputStream;
    }

    @Override // org.apache.tika.fork.ForkResource
    public Throwable process(DataInputStream dataInputStream, DataOutputStream dataOutputStream) throws IOException {
        int i3;
        byte[] bArr = new byte[dataInputStream.readInt()];
        try {
            i3 = this.stream.read(bArr);
        } catch (IOException e3) {
            e3.printStackTrace();
            i3 = -1;
        }
        dataOutputStream.writeInt(i3);
        if (i3 > 0) {
            dataOutputStream.write(bArr, 0, i3);
        }
        dataOutputStream.flush();
        return null;
    }
}

package library.demo;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * @author 霍平
 * @date 2022/6/9 20:03
 * @mouse 六月
 */

public class UserObjOutStream extends ObjectOutputStream {
    public UserObjOutStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {

    }

    protected UserObjOutStream() throws IOException, SecurityException {
    }
}

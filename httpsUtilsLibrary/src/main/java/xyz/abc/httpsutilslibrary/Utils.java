package xyz.abc.httpsutilslibrary;

import java.io.InputStream;
import java.io.OutputStream;

public class Utils {
    public Utils() {
    }

    public static void CopyStream(InputStream is, OutputStream os) {
        boolean var2 = true;

        try {
            byte[] bytes = new byte[1024];

            while(true) {
                int count = is.read(bytes, 0, 1024);
                if (count == -1) {
                    break;
                }

                os.write(bytes, 0, count);
            }
        } catch (Exception var5) {
        }

    }
}

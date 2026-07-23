package com.db.hackathon;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.io.IOUtils;

public class StreamUtils {

    public int copyStream(InputStream input, OutputStream output) throws IOException {
        int bytesCopied = IOUtils.copy(input, output);
        return bytesCopied;
    }

    public String readStream(InputStream input) throws IOException {
        return IOUtils.toString(input, "UTF-8");
    }
}

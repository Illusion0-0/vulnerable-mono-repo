package com.db.hackathon;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.io.IOUtils;

/**
 * Utility class for copying streams using Apache Commons IO.
 */
public class StreamUtils {

    /**
     * Copies all bytes from input stream to output stream.
     * Uses the 3-argument IOUtils.copy() with buffer size.
     *
     * NOTE: In Commons IO 2.6, IOUtils.copy(InputStream, OutputStream, int) returns 'int'.
     * In Commons IO 2.7+, this method returns 'long' instead, which will cause
     * a compilation error when the dependency is upgraded for security remediation.
     * The AI agent should detect this and fix the type from 'int' to 'long'.
     *
     * @return the number of bytes copied
     */
    public long copyStream(InputStream input, OutputStream output) throws IOException {
        // In Commons IO 2.6: returns int
        // In Commons IO 2.7+: returns long (BREAKING CHANGE - lossy conversion)
        long bytesCopied = IOUtils.copy(input, output, 4096);
        return bytesCopied;
    }

    /**
     * Reads a stream into a String using Commons IO.
     */
    public String readStream(InputStream input) throws IOException {
        return IOUtils.toString(input, "UTF-8");
    }
}
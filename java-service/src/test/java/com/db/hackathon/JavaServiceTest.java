package com.db.hackathon;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

class JavaServiceTest {

    @Test
    void testStringUtilities() {
        String input = "hello world";
        assertEquals("HELLO WORLD", input.toUpperCase());
        assertEquals(11, input.length());
    }

    @Test
    void testStreamUtilsCopy() throws IOException {
        StreamUtils utils = new StreamUtils();
        ByteArrayInputStream input = new ByteArrayInputStream("test data".getBytes());
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        int copied = utils.copyStream(input, output);
        assertTrue(copied > 0, "Should copy some bytes");
        assertEquals("test data", output.toString());
    }

    @Test
    void testStreamUtilsRead() throws IOException {
        StreamUtils utils = new StreamUtils();
        ByteArrayInputStream input = new ByteArrayInputStream("hello".getBytes());
        String result = utils.readStream(input);
        assertEquals("hello", result);
    }
}

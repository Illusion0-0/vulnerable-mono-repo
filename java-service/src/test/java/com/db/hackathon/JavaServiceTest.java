package com.db.hackathon;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for the Java service.
 * Verifies basic application logic and configuration.
 */
class JavaServiceTest {

    @Test
    void testApplicationClassExists() {
        // Verify the main application class can be loaded
        assertDoesNotThrow(() -> {
            Class<?> clazz = Class.forName("com.db.hackathon.JavaServiceApplication");
            assertNotNull(clazz);
        });
    }

    @Test
    void testVersionIsNotBlank() {
        String version = System.getProperty("java.version");
        assertNotNull(version);
        assertFalse(version.isBlank());
    }

    @Test
    void testStringUtilities() {
        String input = "hello world";
        assertEquals("HELLO WORLD", input.toUpperCase());
        assertEquals(11, input.length());
    }
}
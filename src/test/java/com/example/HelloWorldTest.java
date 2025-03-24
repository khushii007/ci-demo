package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldTest {

    @Test
    void testMessage() {
        String message = "Hello, Jenkins CI!";
        assertEquals("Hello, Jenkins CI!", message);
    }
}


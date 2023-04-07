package com.examples.tests;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class AssertionsExamplesTest {
    @Test
    public void testArrayEquals() {
        int[] v1 = { 1, 3, 50, 16 };
        int[] v2 = { 1, 3, 50, 16 };

        assertArrayEquals(v1, v2);
    }

    @Test
    public void testNotNull() {
        String s = "raul";
        assertNotNull(s);
    }

    @Test
    public void assumptionTest() {
        Assumptions.assumeTrue(System.getenv("USER").equals("rpc"));
        assertEquals(10, 5 + 5);
    }

    // OR:
    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "rpc")
    public void conditionalTest() {
        assertEquals(10, 5 + 5);
    }
}
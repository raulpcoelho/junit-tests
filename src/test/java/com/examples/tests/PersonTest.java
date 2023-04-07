package com.examples.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonTest {
    private final String NAME = "Messi";
    private final int AGE = 35;

    private Person p;

    @BeforeAll
    public static void setup() {
        System.out.println("Iniatilizing tests...");
    }

    @AfterAll
    public static void cleanup() {
        System.out.println("Finalizing tests...");
    }

    @BeforeEach
    public void newPerson() {
        System.out.println("new person");
        p = new Person(NAME, AGE);
    }

    @Test
    public void testGetName() {
        assertEquals(NAME, p.getName());
    }

    @Test
    public void testGetAge() {
        assertEquals(AGE, p.getAge());
    }

    @Test
    public void testOldEnough() {
        assertTrue(p.oldEnough());
    }
}

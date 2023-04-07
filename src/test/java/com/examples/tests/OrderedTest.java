package com.examples.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTest {

    @Order(3)    
    @Test
    public void test1() {
        System.out.println("1");
        assertTrue(true);
    }
    @Order(2)
    @Test
    public void test2() {
        System.out.println("2");
        assertTrue(true);
    }
    @Order(1)
    @Test
    public void test3() {
        System.out.println("3");
        assertTrue(true);
    }
}

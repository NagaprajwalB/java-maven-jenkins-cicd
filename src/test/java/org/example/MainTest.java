package org.example;

import junit.framework.TestCase;

public class MainTest extends TestCase {
    Main calc = new Main();
    public void test(){
        assertEquals(15, calc.sum(10,5));
    }
}
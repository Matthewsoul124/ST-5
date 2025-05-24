package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;

public class SqrtTest {
    private static final double DELTA = 0.00000001;

    @Test
    public void testAverage() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(3.0, sqrt.average(2.0, 4.0), DELTA);
        assertEquals(0.0, sqrt.average(-2.0, 2.0), DELTA);
        assertEquals(5.0, sqrt.average(5.0, 5.0), DELTA);
    }

    @Test
    public void testGood() {
        Sqrt sqrt = new Sqrt(4.0);
        assertTrue(sqrt.good(2.0, 4.0));
        assertFalse(sqrt.good(1.0, 4.0));
        assertTrue(sqrt.good(1.4142135623730951, 2.0));
    }

    @Test
    public void testImprove() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(2.5, sqrt.improve(2.0, 4.0), DELTA);
        assertEquals(1.5, sqrt.improve(1.0, 2.0), DELTA);
    }

    @Test
    public void testIter() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(2.0, sqrt.iter(1.0, 4.0), DELTA);
        assertEquals(1.4142135623730951, sqrt.iter(1.0, 2.0), DELTA);
    }

    @Test
    public void testCalc() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(2.0, sqrt.calc(), DELTA);
        
        sqrt = new Sqrt(2.0);
        assertEquals(1.4142135623730951, sqrt.calc(), DELTA);
        
        sqrt = new Sqrt(9.0);
        assertEquals(3.0, sqrt.calc(), DELTA);
    }

    @Test
    public void testCalcWithZero() {
        Sqrt sqrt = new Sqrt(0.0);
        assertEquals(0.0, sqrt.calc(), DELTA);
    }

    @Test
    public void testCalcWithOne() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(1.0, sqrt.calc(), DELTA);
    }

    @Test
    public void testCalcWithLargeNumber() {
        Sqrt sqrt = new Sqrt(1000000.0);
        assertEquals(1000.0, sqrt.calc(), DELTA);
    }

    @Test
    public void testCalcWithSmallNumber() {
        Sqrt sqrt = new Sqrt(0.000001);
        assertEquals(0.001, sqrt.calc(), 0.000001);
    }

    @Test
    public void testCalcWithDecimalNumber() {
        Sqrt sqrt = new Sqrt(2.25);
        assertEquals(1.5, sqrt.calc(), DELTA);
    }
} 
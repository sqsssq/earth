package com.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.company.Calculator;

public class CalculatorTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() {
        System.out.println("test add");
        Calculator cal = new Calculator();
        cal.clear();
        cal.add(1);
        Assert.assertEquals(1, cal.getResult());
    }

    @Test
    public void substract() {
        System.out.println("test substract");
        Calculator cal = new Calculator();
        cal.clear();
        cal.substract(1);
        Assert.assertEquals(-1, cal.getResult());
    }

    @Test
    public void multiply() {
        System.out.println("test multiply");
        Calculator cal = new Calculator();
        cal.clear();
        cal.add(1);
        cal.multiply(3);
        Assert.assertEquals(3, cal.getResult());
    }

    @Test
    public void divide() {
        System.out.println("test divide");

        Calculator cal = new Calculator();
        cal.clear();
        cal.add(3);
        cal.divide(3);
        Assert.assertEquals(1, cal.getResult());
    }

    @Test
    public void square() {
        System.out.println("test square");

        Calculator cal = new Calculator();
        cal.clear();
//        cal.add(2);
        cal.square(2);
        Assert.assertEquals(4, cal.getResult());
    }

    @Test
    public void squareRoot() {
        System.out.println("test superRoot");

        Calculator cal = new Calculator();
        cal.clear();
        cal.square(3);
    }

    @Test
    public void clear() {
        System.out.println("test clear");

        Calculator cal = new Calculator();
        cal.clear();
        cal.add(2);
        cal.clear();
        Assert.assertEquals(0, cal.getResult());
    }

    @Test
    public void getResult() {
        System.out.println("test Result");

        Calculator cal = new Calculator();
        cal.clear();
        Assert.assertEquals(0, cal.getResult());
    }
}
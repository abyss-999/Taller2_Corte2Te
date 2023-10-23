package com.example.taller;

import org.robolectric.RobolectricTestRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testSuma() {
        MainActivity mainActivity = new MainActivity();
        int resultado = mainActivity.suma(3, 4);
        Assert.assertEquals(7, resultado);
    }

    @Test
    public void testResta() {
        MainActivity mainActivity = new MainActivity();
        int resultado = mainActivity.resta(8, 5);
        Assert.assertEquals(3, resultado);
    }

    @Test
    public void testMultiplicacion() {
        MainActivity mainActivity =  new MainActivity();
        int resultado = mainActivity.multiplicacion(6, 9);
        Assert.assertEquals(54, resultado);
    }

    @Test
    public void testDivision() {
        MainActivity mainActivity = new MainActivity();
        float resultado = mainActivity.division(10, 2);
        Assert.assertEquals(5.0, resultado, 0.01);
    }
}




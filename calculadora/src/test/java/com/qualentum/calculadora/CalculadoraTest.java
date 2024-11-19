package com.qualentum.calculadora;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class CalculadoraTest {
	
	private final Calculadora calculadora = new Calculadora();

    @Test
    public void testSuma() {
        assertEquals(10, calculadora.suma(5, 5));
        assertThrows(IllegalArgumentException.class, () -> calculadora.suma(-1, 5));
        assertThrows(IllegalArgumentException.class, () -> calculadora.suma(1000, 5));
    }

    @Test
    public void testResta() {
        assertEquals(0, calculadora.resta(5, 5));
        assertThrows(IllegalArgumentException.class, () -> calculadora.resta(-1, 5));
    }

    @Test
    public void testMultiplica() {
        assertEquals(25, calculadora.multiplica(5, 5));
        assertThrows(IllegalArgumentException.class, () -> calculadora.multiplica(1000, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calculadora.divide(10, 5));
        assertThrows(IllegalArgumentException.class, () -> calculadora.divide(10, 0));
    }
    
    @Test
    public void testSumaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.suma(-1, 5));
        assertThrows(IllegalArgumentException.class, () -> calculadora.suma(1000, 5));
    }
    
    @Test
    public void testDividePorCero() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.divide(10, 0));
    }

}

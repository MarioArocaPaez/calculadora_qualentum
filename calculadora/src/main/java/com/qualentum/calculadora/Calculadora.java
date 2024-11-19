package com.qualentum.calculadora;

public class Calculadora {
	
	public int suma(int a, int b) {
        validarEntrada(a, b);
        int resultado = a + b;
        validarResultado(resultado);
        return resultado;
    }

    public int resta(int a, int b) {
        validarEntrada(a, b);
        int resultado = a - b;
        validarResultado(resultado);
        return resultado;
    }

    public int multiplica(int a, int b) {
        validarEntrada(a, b);
        int resultado = a * b;
        validarResultado(resultado);
        return resultado;
    }

    public int divide(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("No se puede dividir por cero.");
        validarEntrada(a, b);
        int resultado = a / b;
        validarResultado(resultado);
        return resultado;
    }

    private void validarEntrada(int a, int b) {
        if (a < 0 || b < 0) throw new IllegalArgumentException("No se permiten números negativos.");
        if (a > 999 || b > 999) throw new IllegalArgumentException("No se permiten números de más de 3 cifras.");
    }

    private void validarResultado(int resultado) {
        if (resultado > 999 || resultado < -999) {
            throw new IllegalArgumentException("El resultado no puede tener más de 3 cifras.");
        }
    }

}

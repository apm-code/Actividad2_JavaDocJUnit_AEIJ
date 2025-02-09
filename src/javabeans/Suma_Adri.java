package javabeans;

import java.util.Scanner;

/**
 * Clase que implementa metodos relacionados con la suma. Tiene los
 * siguientes metodos:
 *      1. Suma de dos números reales.
 *      2. Suma de dos números enteros.
 *      3. Suma de tres números reales.
 *      4. Suma con valor acumulado.
 * @author Adrián I. Pérez
 * @version 1.0
 */

public class Suma_Adri {
    /**
     * 1. Suma de dos números reales.
     * @param a : Primer número real.
     * @param b : Segundo número real.
     * @return Suma de ambos números reales.
     */
    public double sumaDosReales(double a, double b) {
        return a + b;
    }
    /**
     * 2. Suma de dos números enteros.
     * @param a : Primer número entero.
     * @param b : Segundo número entero.
     * @return Suma de ambos números enteros.
     */
    public int sumaDosEnteros(int a, int b) {
        return a + b;
    }

    /**
     * 3. Suma de tres números reales.
     * @param a : Primer número real.
     * @param b : Segundo número real.
     * @param c : Tercer número real.
     * @return Suma de los tres números reales.
     */
    public double sumaTresReales(double a, double b, double c) {
        return a + b + c;
    }

    /**
     * @param valorAcumulado : Atributo en el que se almacena el resultado de
     *                         la aplicación del método sumaAcumulada().
     */
    private double valorAcumulado;

    /**
     * 4. Suma con valor acumulado.
     *    El método es de tipo void porque su objetivo es sumar ambos valores,
     *    no mostrar el resultado de dicha suma. Dicho resultado se obtiene con
     *    el siguiente método getValorAcumulado().
     * @param a : Valor que se suma al parámetro valorAcumulado.
     * @return Suma del número real introducido y del valorAcumulado.
     */
    public void sumaAcumulada(double a) {
        return valorAcumulado += a;
    }

    /**
     * Obtención (get) del valor de la variable valorAcumulado.
     * @return Valor del número real contenido en valorAcumulado.
     */
    public double getValorAcumulado() {
        return valorAcumulado;
    }




}

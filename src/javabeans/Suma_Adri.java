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
 * @version 1.2
 */

public class Suma_Adri {
    /**
     * Método que muestra el menú de las posibles operaciones y permite
     * seleccionar la deseada. El menú ejecuta un do-while y consta de un
     * switch que, en función de la opción, ejecuta una operación u otra.
     * @param leer recoge la opción introducida.
     */
    public void menuSuma(Scanner leer) {
        int opcion;
        do {
            System.out.println("\nMenú Suma:");
            System.out.println("1. Suma de dos números reales");
            System.out.println("2. Suma de dos números enteros");
            System.out.println("3. Suma de tres números reales");
            System.out.println("4. Suma acumulada");
            System.out.println("5. Ver suma acumulada");
            System.out.println("6. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El resultado de la suma es: " + sumaDosReales(leer));
                    break;
                case 2:
                    System.out.println("El resultado de la suma es: " + sumaDosEnteros(leer));
                    break;
                case 3:
                    System.out.println("El resultado de la suma de los tres valores es: " + sumaTresReales(leer));
                    break;
                case 4:
                    sumaAcumulada(leer);
                    break;
                case 5:
                    System.out.println("El valor acumulado actual es: " + getValorAcumulado());
                    break;
                default:
                    System.out.println("Opción no válida. Introduce otro valor:");
                    break;
            }
        } while (opcion != 6);
    }
    /**
     * 1. Suma de dos números reales, denominados a y b.
     * @param leer Scanner recoge los valores introducidos.
     * @return Suma de ambos números reales.
     */
    public double sumaDosReales(Scanner leer) {
        System.out.print("Introduce el primer número real: ");
        double a = leer.nextDouble(); // Almacena el primer número real
        System.out.print("Introduce el segundo número real: ");
        double b = leer.nextDouble(); // Almacena el segundo número real
        return a + b; // Devuelve el resultado de la suma
    }
    /**
     * 1.1. Suma de dos números reales.
     * Método diseñado para pruebas unitarias
     * @param a Primer valor.
     * @param b segundo valor.
     * @return Suma de los valores a y b.
     */
    public double sumaDosReales(double a, double b) {
        return a + b;
    }
    /**
     * 2. Suma de dos números enteros, denominados a y b.
     * @param leer Scanner recoge los valores introducidos.
     * @return Suma de ambos números enteros.
     */
    public int sumaDosEnteros(Scanner leer) {
        System.out.print("Introduce el primer número entero: ");
        int a = leer.nextInt(); // Almacena el primer número entero
        System.out.print("Introduce el segundo número entero: ");
        int b = leer.nextInt(); // Almacena el segundo número entero
        return a + b; // Devuelve el resultado de la suma
    }
    /**
     * 2.1. Suma de dos números enteros.
     * Método diseñado para pruebas unitarias
     * @param a Primer valor.
     * @param b Segundo valor.
     * @return Suma de los valores a y b.
     */
    public int sumaDosEnteros(int a, int b) {
        return a + b;
    }

    /**
     * 3. Suma de tres números reales, denominados a, b y c.
     * @param leer Scanner recoge los valores introducidos.
     * @return Suma de los tres números reales.
     */
    public double sumaTresReales(Scanner leer) {
        System.out.print("Introduce el primer número real: ");
        double a = leer.nextDouble(); // Almacena el primer número real
        System.out.print("Introduce el segundo número real: ");
        double b = leer.nextDouble(); // Almacena el segundo número real
        System.out.print("Introduce el tercer número real: ");
        double c = leer.nextDouble(); // Almacena el tercer número real
        return a + b + c; // Devuelve el resultado de la suma
    }
    /**
     * 3.1. Suma de tres números reales.
     * Método diseñado para pruebas unitarias
     * @param a Primer valor.
     * @param b Segundo valor.
     * @param c Tercer valor.
     * @return Suma de los valores a, b y c.
     */
    public double sumaTresReales(double a, double b, double c) {
        return a + b + c;
    }

    /**
     * Atributo en el que se almacena el resultado de
     * la aplicación del método sumaAcumulada().
     */
    private double valorAcumulado;
    /**
     * 4. Suma con valor acumulado.
     *    El método es de tipo void porque su objetivo es sumar ambos valores,
     *    no mostrar el resultado de dicha suma. Dicho resultado se obtiene con
     *    el siguiente método getValorAcumulado().
     * @param leer Scanner recoge los valores introducidos.
     */
    public void sumaAcumulada(Scanner leer) {
        System.out.print("Introduce el número que quieres sumar al acumulado: ");
        double a = leer.nextDouble();
        valorAcumulado += a;
    }
    /**
     * 4.1. Suma con valor acumulado para pruebas unitarias.
     * @param a Valor que se acumula al valor acumulado.
     */
    public void sumaAcumulada(double a) {
        valorAcumulado += a;
    }
    /**
     * Obtención (get) del valor de la variable valorAcumulado.
     * @return Valor del número real contenido en valorAcumulado.
     */
    public double getValorAcumulado() {
        return valorAcumulado;
    }
}

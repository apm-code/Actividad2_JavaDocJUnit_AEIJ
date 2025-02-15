package javabeans;

import java.util.Scanner;

/**
 * Clase que implementa métodos relacionados con la resta.
 * Tiene los siguientes métodos:
 *      1. Resta de dos números reales.
 *      2. Resta de dos números enteros.
 *      3. Resta de tres números reales.
 *      4. Resta con valor acumulado.
 * @author [Tu Nombre]
 * @version 1.0
 */

public class Resta_Nacho {


    /**
     * Esta variable almacena el valor acumulado de las restas realizadas.
     */
    private double valorAcumulado;

    /**
     * Este método muestra un menú interactivo para seleccionar diferentes operaciones de resta.
     */
    public void menuResta(Scanner leer) {
        int opcion;
        do {
            System.out.println("\nMenú Resta:");
            System.out.println("1. Resta de dos números reales");
            System.out.println("2. Resta de dos números enteros");
            System.out.println("3. Resta de tres números reales");
            System.out.println("4. Resta acumulada");
            System.out.println("5. Ver valor acumulado");
            System.out.println("6. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El resultado de la resta es: " + restaDosReales(leer));
                    break;
                case 2:
                    System.out.println("El resultado de la resta es: " + restaDosEnteros(leer));
                    break;
                case 3:
                    System.out.println("El resultado de la resta de los tres valores es: " + restaTresReales(leer));
                    break;
                case 4:
                    restaAcumulada(leer);
                    break;
                case 5:
                    System.out.println("El valor acumulado actual es: " + getValorAcumulado());
                    break;
            }
        } while (opcion != 6);
    }

    /**
     * Este método solicita dos números reales al usuario y devuelve su resta.
     */
    public double restaDosReales(Scanner leer) {
        System.out.print("Introduce el primer número real: ");
        double a = leer.nextDouble();
        System.out.print("Introduce el segundo número real: ");
        double b = leer.nextDouble();
        return a - b;
    }

    /**
     * Este método solicita dos números enteros al usuario y devuelve su resta.
     */
    public int restaDosEnteros(Scanner leer) {
        System.out.print("Introduce el primer número entero: ");
        int a = leer.nextInt();
        System.out.print("Introduce el segundo número entero: ");
        int b = leer.nextInt();
        return a - b;
    }

    /**
     * Este método solicita tres números reales y devuelve el resultado de restarlos en orden.
     */
    public double restaTresReales(Scanner leer) {
        System.out.print("Introduce el primer número real: ");
        double a = leer.nextDouble();
        System.out.print("Introduce el segundo número real: ");
        double b = leer.nextDouble();
        System.out.print("Introduce el tercer número real: ");
        double c = leer.nextDouble();
        return a - b - c;
    }

    /**
     * Este método resta un número al valor acumulado, modificando su estado.
     */
    public void restaAcumulada(Scanner leer) {
        System.out.print("Introduce el número que quieres restar al acumulado: ");
        double a = leer.nextDouble();
        valorAcumulado -= a;
    }

    /**
     * Este método devuelve el valor acumulado actual.
     */
    public double getValorAcumulado() {
        return valorAcumulado;
    }
}

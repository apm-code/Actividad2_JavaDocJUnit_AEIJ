package javabeans;

import java.util.Scanner;
/**
 * Clase que implementa métodos relacionados con las multiplicaiones. Tiene los
 * siguientes métodos.
 * 1. Producto de dos números reales.
 * 2. Producto de dos números enteros.
 * 3. Producto de tres números reales.
 * 4. Potencia.
 *
 * @author Javier García Ruiz
 * @version 1.0
 */


public class Producto_Javier {


    // Menú interactivo para ejecutar las operaciones


    public void menuProducto(Scanner leer) {
        int opcion;

        do {
            System.out.println("Menu Productos. Selecciona una opcion para obtener el resultado");
            System.out.println("1. Producto de dos numeros reales");
            System.out.println("2. Producto de dos numeros enteros");
            System.out.println("3. Producto de tres números reales");
            System.out.println("4. Potencia");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El resultado del producto de dos números reales es : " + productoDosReales(leer));
                    break;

                case 2:
                    System.out.println("El resultado del producto de dos números enteros es : " + prodcutoDosEnteros(leer));
                    break;


                case 3:
                    System.out.println("El resultado del producto de tres números reales es : " + productoTresReales(leer));
                    break;

                case 4:

                    System.out.println("El resultado de la potencia es :  " + potencia(leer));
                    break;

                default:
                    System.out.println("ERROR 404-NOT FOUND. FIN DEL PROGRAMA");

            }
        } while (opcion >= 1 || opcion <= 4);
    }

    /**
     * 1. Producto de dos números reales, denominados num1 y num2.
     * @param leer Scanner recoge los valores introducidos.
     * @return Producto de los  números reales introducidos.
     */

    public double productoDosReales(Scanner leer) {
        System.out.print("Introduce el primer número real : ");
        double num1 = leer.nextDouble(); // Almacena el primer número real
        System.out.print("Introduce el segundo número real : ");
        double num2 = leer.nextDouble(); // Almacena el segundo número real
        return num1 * num2; // Devuelve el resultado del producto
    }

    /**
     * 2. Producto de dos números enteros, denominados num1 y num2.
     * @param leer Scanner recoge los valores introducidos.
     * @return Producto de los números enteros introducidos.
     */

    public int prodcutoDosEnteros(Scanner leer) {
        System.out.print("Introduce el primer número entero : ");
        int num1 = leer.nextInt(); // Almacena el primer número entero
        System.out.print("Introduce el segundo número entero : ");
        int num2 = leer.nextInt(); // Almacena el segundo número entero
        return num1 + num2; // Devuelve el resultado del producto
    }

    /**
     * 3. Producto de tres números reales, denominados num1, num2 y num3
     * @param leer Scanner recoge los valores introducidos.
     * @return Producto de los números enteros introducidos.
     */

    public double productoTresReales(Scanner leer) {
        System.out.print("Introduce el primer número real : ");
        double num1 = leer.nextDouble(); // Almacena el primer número real
        System.out.print("Introduce el segundo número real : ");
        double num2 = leer.nextDouble(); // Almacena el segundo número real
        System.out.print("Introduce el tercer número real : ");
        double num3 = leer.nextDouble(); // Almacena el tercer número real
        return num1 * num2 * num3; // Devuelve el resultado del producto

    }
    /**
     * 4. Potencia de dos números, denominados num1 y num2.
     * @param leer Scanner recoge los valores introducidos.
     * @return Math.pow, método estático de la clase Math que se utiliza para calcular la potencia de un número.
     */
    public double potencia(Scanner leer) {
        System.out.print("Introduce el primer número : ");
        double num1 = leer.nextInt(); // Almacena el primer número entero
        System.out.print("Introduce el segundo número : ");
        double num2 = leer.nextInt(); // Almacena el segundo número entero
        return Math.pow(num1, num2); // Devuelve el resultado de la potencia
    }

}